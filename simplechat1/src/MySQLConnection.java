import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unused")
public class MySQLConnection {
	private Connection conn;
	

	  public void connectToDB() {
		
	      try 
	      {
	    	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users?serverTimezone=Asia/Jerusalem&useSSL=false", "root", "Aa123456");
	          System.out.println("SQL connection succeed");
	          
//	          createTableUser(conn);
	   	} catch (SQLException ex) 
	   	    {/* handle any errors*/
	          System.out.println("SQLException: " + ex.getMessage());
	          System.out.println("SQLState: " + ex.getSQLState());
	          System.out.println("VendorError: " + ex.getErrorCode());
	          }
	  }
	
	  public void ParsingToDB(ArrayList<String> lst) {
			Statement stmt;
			
			try {
				PreparedStatement ps = conn.prepareStatement("INSERT INTO users VALUES(?,?,?,?)");
		 			ps.setString(1, lst.get(0));
		 			ps.setString(2,  lst.get(1));
		 			ps.setString(3,  lst.get(2));
		 			ps.setString(4,  lst.get(3));
		 			ps.executeUpdate();	 			

		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
	  
		public static void createTableUser(Connection con1){
			Statement stmt;
			try {
			stmt = con1.createStatement();
			stmt.executeUpdate("create table users(username VARCHAR(10),ID VARCHAR(40), Department VARCHAR(40), Tel VARCHAR(40));");
			
			
			} catch (SQLException e) {	e.printStackTrace();}

		}
}
	
		
		
		
//		
//		
//		public static void parsingTheData(Connection con) {
//			Statement stmt;
//			try {
//				stmt = con.createStatement();
//
//				stmt.executeUpdate("UPDATE flights SET Status=\"Expected 14:30\" WHERE Flight='KU101'");
//				
//		} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//
//			
//		}
//		//B
//			public static void updateFlightFromParis(Connection con) {
//				List<Flights> ls = new ArrayList<>();
//				Statement stmt;
//				try {
//					stmt = con.createStatement();
//					ResultSet rs = stmt.executeQuery("SELECT * FROM flights WHERE Destination = 'Paris' and Scheduled < '15:00'");
//			 		while(rs.next())
//			 		{
//			 			Flights fl = new Flights(rs.getString("Scheduled"),rs.getString("Flight"),rs.getString("Destination"),rs.getString("Status"),rs.getInt("Gate"));
//						 // Print out the values
//			 			 fl.setArrivalTime();
//			 			 ls.add(fl);
//					} 
//			 		PreparedStatement ps = con.prepareStatement("UPDATE flights SET Scheduled = ? WHERE Flight = ?");
//			 		for(Flights es : ls) {
//			 			ps.setString(1, es.getStatus());
//			 			ps.setString(2, es.getFlight());
//			 			ps.executeUpdate();
//			 			
//			 		}
//					
//			} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//
//				
//			}
//	
//	//C
//	public static void ChangeFlights(Connection con) {
//		List<Flights> ls = new ArrayList<>();
//		Statement stmt;
//		try 
//		{
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM flights ");
//	 		while(rs.next())
//	 		{
//	 			Flights fl = new Flights(rs.getString("Scheduled"),rs.getString("Flight"),rs.getString("Destination"),rs.getString("Status"),rs.getInt("Gate"));
//				 // Print out the values
//	 			 fl.setStatus("Cancel");
//				 ls.add(fl);
//				
//			} 
//	 		PreparedStatement ps = con.prepareStatement("UPDATE flights SET Status = ? WHERE Flight = ?");
//	 		for(Flights es : ls) {
//	 			ps.setString(1, es.getStatus());
//	 			ps.setString(2, es.getFlight());
//	 			ps.executeUpdate();
//	 			
//	 		}
//			rs.close();
//			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
//		} catch (SQLException e) {e.printStackTrace();}
//	}
//	
//	public static void printCourses(Connection con)
//	{
//		/*Statement stmt;
//		try 
//		{
//			stmt = con.createStatement();
//			ResultSet rs = stmt.executeQuery("SELECT * FROM courses;");
//	 		while(rs.next())
//	 		{
//				 // Print out the values
//				 System.out.println(rs.getString(1)+"  " +rs.getString(2));
//			} 
//			rs.close();
//			//stmt.executeUpdate("UPDATE course SET semestr=\"W08\" WHERE num=61309");
//		} catch (SQLException e) {e.printStackTrace();}*/
//	}
//
//	
////	public static void createTableCourses(Connection con1){
////		Statement stmt;
////		try {
////			stmt = con1.createStatement();
////			stmt.executeUpdate("create table courses(num int, name VARCHAR(40), semestr VARCHAR(10));");
////			stmt.executeUpdate("load data local infile \"courses.txt\" into table courses");
////	 		
////		} catch (SQLException e) {	e.printStackTrace();}
////		 		
////	}
////	
//	
//	
//	
//	
//	
//	

	
	

