package jdbc;
import java.sql.*;
public class JDBCDemo1 {

	public static void main(String[] args) throws Exception {
//       sp3();
//       readrecord ();
		Batchdemo();
	}
	
public static void readrecord () throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	String query = "select * from employee";
//	Class.forName();
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(query);	
	while(rs.next()) {
//	System.out.println("Id is "+rs.getInt(1));
//	System.out.println("Name is "+rs.getString(2));
//	System.out.println("Salary is "+rs.getInt(3));
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
    con.close();
}
  //insertion
public static void insertrecord () throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	String query = "insert into employee values(12,'ragavvv',2500000),(11,'ragavvv',2500000)";
	
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	int row = st.executeUpdate(query);	
	
	System.out.println("Number of rows affected: "+ row);
	
    con.close();
}
//insert with variables
public static void insertvar() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	int id = 5;
	String name = "varun";
	int salary = 3000000;
	String query = "insert into employee values(" + id + ",'" + name + "'," + salary + ")";
	
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	int row = st.executeUpdate(query);	
	
	System.out.println("Number of rows affected: "+ row);
	
    con.close();
}

//insert with prepared statement
public static void insertPst() throws Exception {
  String url= "jdbc:mysql://localhost:3306/jdbcdemo";
  String userName = "root";
  String password = "root";

  int id = 9;
  String name = "giri";
  int salary = 3500000;

  String query = "insert into employee values(?,?,?);";

  Connection con = DriverManager.getConnection(url,userName,password);
  PreparedStatement pst = con.prepareStatement(query);

  pst.setInt(1, id);
  pst.setString(2, name);
  pst.setInt(3, salary);

  int rows = pst.executeUpdate();
  System.out.println("Number of rows affected: " + rows);

  con.close();
}


//delete
public static void delete() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	int id = 7;
	String query = "delete from employee where emp_id = " + id;
	
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	int row = st.executeUpdate(query);	
	
	System.out.println("Number of rows affected: "+ row);
	
    con.close();
}

//update
public static void update() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	String query = "update employee set salary = 1500000 where emp_id=1";
	
	Connection con = DriverManager.getConnection(url,userName,password);
	Statement st = con.createStatement();
	int row = st.executeUpdate(query);	
	
	System.out.println("Number of rows affected: "+ row);
	
    con.close();
}

//types of statement
//normal statement
//prepared statement
//callable statement call GetEmp()

//calling simple stored procedure
public static void sp() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";

	Connection con = DriverManager.getConnection(url,userName,password);
	CallableStatement cst = con.prepareCall("{call GetEmp()}");
	ResultSet rs = cst.executeQuery();	
	
	while(rs.next()) {
	System.out.println("Id is "+rs.getInt(1));
	System.out.println("Name is "+rs.getString(2));
	System.out.println("Salary is "+rs.getInt(3));
	}
    con.close();
}

//stored procedure with parameter
public static void sp2() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
    int id =3;
	
	Connection con = DriverManager.getConnection(url,userName,password);
	 CallableStatement cst = con.prepareCall("{call GetEmpById(?)}");	
	 cst.setInt(1, id);
	
	ResultSet rs = cst.executeQuery();	
	
	while(rs.next()) {
	System.out.println("Id is "+rs.getInt(1));
	System.out.println("Name is "+rs.getString(2));
	System.out.println("Salary is "+rs.getInt(3));
	}
    con.close();
}
	
//calling stored procedure with in and out parameter
public static void sp3() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
    int id =3;
	
	Connection con = DriverManager.getConnection(url,userName,password);
	 CallableStatement cst = con.prepareCall("{call GetNameById(?,?)}");	
	 cst.setInt(1, id);
	 cst.registerOutParameter(2, Types.VARCHAR);
     cst.executeUpdate();
     System.out.println(cst.getString(2));
    con.close();
}

// commit and autocommit
public static void commitdemo() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	String query1 = "update employee set salary = 400000 where emp_id=1";
	String query2 = "update employee set salary = 550000 where emp_id=2";

	Connection con = DriverManager.getConnection(url,userName,password);
	con.setAutoCommit(false);
    Statement st = con.createStatement();
    int rows1 = st.executeUpdate(query1);
    System.out.println("Rows affected"+rows1);
    
    int rows2 = st.executeUpdate(query2);
    System.out.println("Rows affected"+rows2);
    
    if(rows1>0 && rows2>0) 
    	con.commit();
    con.close();
}

//batch processing

public static void Batchdemo() throws Exception {
	String url= "jdbc:mysql://localhost:3306/jdbcdemo";
	String userName = "root";
	String password = "root";
	
	String query1 = "update employee set salary = 300000 where emp_id=1";
	String query2 = "update employee set salary = 300000 where emp_id=2";
	String query3 = "update employee set salary = 300000 where emp_id=3";
	String query4 = "update employee set salary = 400000 where emp_id=4";
	
	Connection con = DriverManager.getConnection(url,userName,password);
	con.setAutoCommit(false);
	Statement st = con.createStatement();
	st.addBatch(query1);
	st.addBatch(query2);
	st.addBatch(query3);
	st.addBatch(query4);
	int[] res = st.executeBatch();
	for(int i : res) {
		if(i>0) 
			continue;
		else 
			con.rollback();
//	    System.out.println("Rows affected"+i);
	}
	con.commit();
    con.close();
}
}
