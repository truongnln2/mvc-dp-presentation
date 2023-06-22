package com.netcompany.oopdemo.core;

import java.util.ArrayList;
import java.util.List;

import com.netcompany.oopdemo.dto.Identity;
import com.netcompany.oopdemo.enums.UserRole;

public abstract class AbstractAuthorizedMenuItem implements MenuItem {
    protected final Identity identity;
    protected ConsoleContext appCtx;

    public AbstractAuthorizedMenuItem(ConsoleContext appCtx) {
        this.appCtx = appCtx;
        this.identity = this.appCtx.getIdentity();
    }

    public Identity getIdentity() {
        return identity;
    }

    public UserRole getUserRole() {
        return this.identity.getRole();
    }

    public String getUserFullName() {
        return this.identity.getFullName();
    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public void launch() {

    }
}
