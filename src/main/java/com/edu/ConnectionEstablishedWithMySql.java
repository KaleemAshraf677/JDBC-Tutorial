/* To connect Java Application with MySql database,we need to follow 5 steps:   
  
    1. Load the Driver Class:
 
          Class.forName("com.mysql.cj.jdbc.Driver");
    
    2. Create Connection using DriverManager:
    
          String url="jdbc:mysql://localhost:3306/dbname";
          String username="root";
          String password="root";
       Connection con=DriverManager.getConnection(url,username,password);
    
    3. Use Connection to fire queries
    
   CASE A:    String query="Select*From Student2";(In simple query we can use Statement)
   CASE B:    String query="INSERT INTO STUDENT2(name,marks,city) VALUES(?,?,?)";(In dynamicVariables,questionMarks,parameterizedValue we can use PreparedStatement )   
    
    3. Create Statement(In this we use Statement,PreparedStatement,CallableStatement)
    
   
   4.  EXAMPLE Statement:
     
                      Statement stmt=con.createStatement();
                      
             stmt.executeUpdate(query);       {It is used when we have to create,insert,update,delete}
                    
     ................or.........................
                     
             ResultSet set=stmt.executeQuery(query)   {It is used to SELECT or display the values of Table}
             
             while(set.next()){    (Loop is running till the no.of rows coming)
                  int rollno=set.getInt("columnName");
                  String name=set.getString(2);
                  System.out.println(rollno+":"+name);
             }
                      
     
    4. EXAMPLE PreparedStatement:
     
                   PreparedStatement pstmt=con.prepareStatement(query);
                   
                   //set the value of query
                    
                    pstmt.setString(questionIndex,"Value");
                    pstmt.setInt(2,value);
                    
                    pstmt.executeUpdate();
                      
   5. con.close();     */       
    


package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEstablishedWithMySql {

	  public static void main(String[] args)  {
	       
	    	 try {
	    		 // Load the Driver:
	    		 Class.forName("com.mysql.cj.jdbc.Driver");
	    		 
	    		 // Creating a connection
	    		 
	    		 String url="jdbc:mysql://localhost:3306/college";
	    		 String username="root";
	    		 String password="root";
	    		 
	    		 Connection con=DriverManager.getConnection(url,username,password);
	    		 
	    		 if(con.isClosed()) {
	    			 System.out.println("connection is not established....");
	    		 }
	    		 else
	    			 System.out.println("connection established.....");
	    		 
	    	 }catch(Exception e) {
	    		 e.printStackTrace();
	    	 }
    } 
}