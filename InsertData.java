import.java.sql.connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

//insert product data into db

public class InsertData {

  public static void main(String[] args) {

      int id;
      String pnm,comp;
      float pri;

   Scanner sc= new Scanner(System.in);
   System.out.println("Enter product id");
   id=sc.nextInt();
   System.out.println("Enter product amount");
   pnm=sc.nextInt();
   System.out.println("Enter product company"); 
   comp=sc.next();
   System.out.println("Enter product price"); 
   pri=sc.nextFloat();

   String sql= "insert into product values("+id+","+comp+","+pnm+"."+pri+")";
   Connection con;
   Statement st;


 try
  {
    class.forName("com.mysql.jdbc.Driver");
    Con = DriverManager.getConnection(" jdbc:mysql://localhost:3306/java","root","root");
    st=Con.createStatement();
    int x= st.executeUpdate(sql);
    System.out.println("Product added succesfully!!");
     
    
     st.close();
     con.close();
  }
 catch (Exception e) {
    e.printStackTrace();
  }

 }

}