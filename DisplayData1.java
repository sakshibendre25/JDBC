import.java.sql.connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// accept company name from user and display product data


public class DisplayData1 {

  public static void main(String[] args) {


  String comp=args[0]; 
  String sql = "select * from product where company="+comp+";
  Connection con;
  Statement st;
  ResultSet rs;

 try
  {
    class.forName("com.mysql.jdbc.Driver");
    Con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/java","root","root");
    st=Con.createStatement();
    rs= st.excuteQuery(sql);

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