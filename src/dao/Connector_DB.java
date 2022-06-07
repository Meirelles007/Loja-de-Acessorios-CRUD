package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector_DB {
    private final static String JDBC_CLASS = "org.mariadb.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/concessionaria_poo?allowMultiQueries=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "";
    private Connection con;

    public Connector_DB() {
        try {
            Class.forName(JDBC_CLASS);
            con = (DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

	public Connection getCon() {
		return con;
	}
}
