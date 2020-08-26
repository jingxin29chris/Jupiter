package db.mysql;

public class MySQLDBUtil {
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "3306"; // change it to your mysql port number
	public static final String DB_NAME = "eventProject";
	private static final String USERNAME = "jx";
	private static final String PASSWORD = "aA1bcjjj@j";
	public static final String URL = "jdbc:mysql://"
			+ HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

	//jbdc:mysql://localhost:8889/laiproject?user=root&password=root&autoReconnect=true&serverTimezone=UTC
}
