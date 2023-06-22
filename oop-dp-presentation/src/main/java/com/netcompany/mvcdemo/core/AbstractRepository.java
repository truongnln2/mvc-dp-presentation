package com.netcompany.mvcdemo.core;

import java.sql.Connection;

public abstract class AbstractRepository {
    protected final Connection conn;

    public AbstractRepository(Connection conn) {
        this.conn = conn;
    }
}
