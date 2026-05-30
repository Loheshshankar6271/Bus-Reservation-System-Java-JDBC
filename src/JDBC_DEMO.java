import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

public class JDBC_DEMO {
	public static  void readvalues() throws Exception
    {
    
    String url = "jdbc:mysql://localhost:3306/jdbc_demo2";
    String user = "root";
    String password = "lohesh";

    Connection con = DriverManager.getConnection(url, user, password);

    Statement st = con.createStatement();

    String query = "select * from jdbc_demo2";

    ResultSet rs = st.executeQuery(query);

    while(rs.next()) {

        System.out.println("The id is " + rs.getInt(1));
        System.out.println("The name is " + rs.getString(2));
        System.out.println("The salary is " + rs.getInt(3));
    
   
    }
    con.close();
    }
    
    
	
	public static void insertvaluesusingvariables() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_demo2";
	    String user = "root";
	    String password = "lohesh";
	    
	    
	    int id=106;
	    String name="muthukumar";
	    int salary=670000;
	    
	    String query =" insert into jdbc_demo2 values(?,?,?)";
	    Connection con=DriverManager.getConnection(url,user,password);
	    
	    PreparedStatement pst=con. prepareStatement(query);
	    
	    pst.setInt(1, id);
	    pst.setString(2, name);
	    pst.setInt(3, salary);
	    
	    int rows=pst.executeUpdate(); 
	    con.close();
	}
	
	public static void delete() throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/jdbc_demo2";
	    String user = "root";
	    String password = "lohesh";
	    int id=103;
	    String query= "delete from jdbc_demo2 where emp_id = ?";
	    Connection con=DriverManager.getConnection(url,user,password);
	    
	    PreparedStatement pst= con.prepareStatement(query);
	    pst.setInt(1, id);
	    
	    int rows=pst.executeUpdate();
	    pst.close();
	}
	
	
    public static void main(String[] args) throws Exception {
    
    	update();
        
    }
    public static void update() throws Exception
    {
    	String url = "jdbc:mysql://localhost:3306/jdbc_demo2";
	    String user = "root";
	    String password = "lohesh";
	    
	    int id=101;
	    int salary = 900000;
	    
	    String query="update jdbc_demo2 set salary = ? where emp_id = ? ";
	    
	    Connection con = DriverManager.getConnection(url,user,password);
	    
	    PreparedStatement pst= con.prepareStatement(query);
	    
	  
	    pst.setInt(1, salary);
	    pst.setInt(2,id);
	    int rows=pst.executeUpdate();
	    pst.close();
    }
}