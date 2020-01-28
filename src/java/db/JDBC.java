package db;

import java.sql.*;
import java.util.Random;

public class JDBC {
    public String check(long phone, String password){
        String username="";
        try {
            Connection con= null;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");               
            PreparedStatement pst = null;
            
            String q="Select * from DAmazon_Registers where phone=? AND password=?";
             
            pst=con.prepareStatement(q);
            pst.setLong(1, phone);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next())
            {   username = rs.getString("username");
                System.out.println("done");
                return username;
            }
         
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
           return username;
    }
    public void enterdetails(String username, long mobile, String email, String password){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            String sql = "insert into DAmazon_Registers values(?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setLong(2, mobile);
            ps.setString(3, email);
            ps.setString(4, password);
            int a= ps.executeUpdate();
            
            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
    }
    public int orderno(){
        return (int)((Math.random() * 90000000)+10000000);
    }
    public String orderalpha(){
        String letters="ABBCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rd = new Random();
        StringBuilder st = new StringBuilder();
        while(st.length() < 3){
            int index = (int)(letters.length() * rd.nextFloat());
            st.append(letters.charAt(index));
        }
        String str = st.toString();
        return str;
    }
}