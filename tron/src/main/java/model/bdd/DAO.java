package model.bdd;

import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 * <h1>DAO Class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */
public class DAO {

    /**
     * Execute query.
     *
     * @param query
     *            the query
     * @return the result set
     */
    protected static ResultSet executeQuery(final String query) {
        return BDDConnection.getInstance().executeQuery(query);
    }

    /**
     * Execute update.
     *
     * @param query
     *            the query
     * @return the int
     */
    protected static int executeUpdate(final String query) {
        return BDDConnection.getInstance().executeUpdate(query);
    }

    /**
     * Prepare call.
     *
     * @param query
     *            the query
     * @return the callable statement
     */
    protected static CallableStatement prepareCall(final String query) {
        return BDDConnection.getInstance().prepareCall(query);
    }
}
