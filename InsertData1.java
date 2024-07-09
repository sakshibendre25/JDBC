import.java.sql.connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



// insert product data into db

public class InsertData1 {

  public static void main(String[] args) {

      String cnm,add,id,pass;
      int mob;

   Scanner sc= new Scanner(System.in);
   System.out.println("Enter customer id");
   id=sc.next();
   System.out.println("Enter customer name");
   cnm=sc.next();
   System.out.println("Enter customer address"); 
   add=sc.next();
   System.out.println("Enter mobile no"); 
   mob=sc.nextInt();
   System.out.println("Enter password");
   pass=sc.next();

    

   String sql= "insert into product values("+id+","+cnm+","+addr+","+mob+")";
   String sql2="insert into user values("+id+","+pass+")";
   Connection con;
   Statement st;
   

 try
  {
    class.forName("com.mysql.jdbc.Driver");
    Con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/java","root","root");
    st=Con.createStatement();
    st.executeUpdate(sql1);
    System.out.println("Customer registered succesfully!!");
     
    
     st.close();
     con.close();
  }
 catch (Exception e) {
    e.printStackTrace();
  }

 }

}