/**********************************************************************
*  +-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+
*  Brahmbhatt Abhishek
*  +-+-+-+-+-+-+-+-+-+ +-+-+-+-+-+
* 
* ITMD-510
* Date: 15/11/2024
* Final Project
* Description: Pharmacy Management System
*
***********************************************************************/
package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS 10
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://www.papademas.net:3307/510labs?autoReconnect=true&useSSL=false", "db510", "510"); // root is the default username while "" or empty is for the pass
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
