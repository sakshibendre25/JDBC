import.java.sql.connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class DisplayData2 {

  public static void main(String[] args) {

      int id;
      float amt;

   Scanner sc= new Scanner(System.in);
   System.out.println("Enter product id");
   id=sc.nextInt();
   System.out.println("Enter product amount");
   amt=sc.nextFloat();

   String sql="update product set price=price"+amt+"where pid="+id;
   Connection con;
   Statement st;


 try
  {
    class.forName("com.mysql.jdbc.Driver");
    Con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/java","root","root");
    st=Con.createStatement();
    rs= st.excuteQuery(sql);
     
     if(x>0)
         System.out.println("Price updated succesfully!!");
  else
        System.out.println("Invalid Product Id!!");

     st.close();
     con.close();
  }
 catch (Exception e) {
    e.printStackTrace();
  }

 }

}