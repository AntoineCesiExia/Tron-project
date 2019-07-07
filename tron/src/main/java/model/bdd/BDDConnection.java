package model.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h1>BDDConnection Class</h1>
 *
 * @author Antoine Baudusseau
 * @version 1.0
 */
public final class BDDConnection implements IBDDConnection {

    private static BDDConnection instance;
    private static String user = "root";
    private static String password = "tron";
    private static String url = "jdbc:mysql://localhost/phpmyadmin/db_export.php?db=tron";
    private Connection connection;
    private Statement statement;

    /**
     * Instantiates new BDDConnection.
     */
    public BDDConnection() {
        this.open();
    }

    /**
     * Gets BDDConnection single instance
     *
     * @return single BDDConnection instance
     */
    public static BDDConnection getInstance() {
        if (instance == null) {
            setInstance(new BDDConnection());
        }
        return instance;
    }

    /**
     * Sets instance.
     *
     * @param instance
     *            new instance
     */
    private static void setInstance(final BDDConnection instance) {
        BDDConnection.instance = instance;
    }

    /**
     * Open.
     *
     * @return true, if successful
     */
    private boolean open() {
        try {
            this.connection = DriverManager.getConnection(BDDConnection.url, BDDConnection.user, BDDConnection.password);
            this.statement = this.connection.createStatement();
            return true;
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    /**
     * Execute query.
     *
     * @param query
     *            the query
     * @return the result set
     */
    public ResultSet executeQuery(final String query) {
        try {
            return this.getStatement().executeQuery(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Prepare call.
     *
     * @param query
     *            the query
     * @return the java.sql. callable statement
     */
    public java.sql.CallableStatement prepareCall(final String query) {
        try {
            return this.getConnection().prepareCall(query);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Execute update.
     *
     * @param query
     *            the query
     * @return the int
     */
    public int executeUpdate(final String query) {
        try {
            return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Gets the connection.
     *
     * @return the connection
     */
    public Connection getConnection() {
        return this.connection;
    }

    /**
     * Sets the connection.
     *
     * @param connection
     *            the new connection
     */
    public void setConnection(final Connection connection) {
        this.connection = connection;
    }

    /**
     * Gets the statement.
     *
     * @return the statement
     */
    public Statement getStatement() {
        return this.statement;
    }

    /**
     * Sets the statement.
     *
     * @param statement
     *            the new statement
     */
    public void setStatement(final Statement statement) {
        this.statement = statement;
    }

}