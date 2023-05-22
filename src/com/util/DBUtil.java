package com.util;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;

public class DBUtil {
    public static QueryRunner queryRunner;
    static {
        DataSource dataSource=new ComboPooledDataSource("hgkj");
        queryRunner=new QueryRunner(dataSource);
    }
}
