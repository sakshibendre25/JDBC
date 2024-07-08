import.java.sql.connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//Display product data from DB table


public class DisplayData {

  public static void main(String[] args) {

  Connection con;
  Statement st;
  ResultSet rs;

 try
  {
    class.forName("com.mysql.jdbc.Driver");
    Con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/java","root","root");
    st=Con.createStatement();
    rs= st.excuteQuery("Select * from product");

    while(rs.next())
   {
      System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3)+""+rs.getFloat(4));
    }

     rs.close();
     st.close();
     con.close();
  }
 catch (Exception e) {
    e.printStackTrace();
  }

 }

}