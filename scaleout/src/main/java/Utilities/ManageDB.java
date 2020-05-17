package Utilities;

import java.sql.DriverManager;

public class ManageDB extends CommonOps {

    public void initConection(String dbURL){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbURL);
            stmt = con.createStatement();
        } catch (Exception e) {
            System.out.println("Error connection");
        }

    }
    public void closeConnection(){

    }
}
