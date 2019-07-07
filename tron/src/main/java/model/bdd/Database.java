package model.bdd;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 * <h1>Database Class</h1>
 * 
 * @author Antoine Baudusseau
 * @version 1.0
 */

public class Database extends DAO {

	private final static String sqlGetMapByID = "{call insert_data(?,?)}";
	private final static String sqlGetWinner = "{call Winner()}";

	public void save(String player, int time) {
		final CallableStatement callStatement = prepareCall(sqlGetMapByID);

		try {
			callStatement.setString(1, player);
			callStatement.setInt(2, time);
			callStatement.execute();

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String[] getWinner() {
		final CallableStatement callStatement = prepareCall(sqlGetWinner);
		String[] table = {"NULL", "NULL", "NULL"};
		
		try {
			callStatement.registerOutParameter(1, java.sql.Types.VARCHAR);
			callStatement.execute();
			table[0] = callStatement.getString(1);
			//table[1] = callStatement.getString(2);
			//table[2] = callStatement.getString(3);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return table;
	}

}