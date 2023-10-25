/*
CIS 18B 
Cars Database Assignment
Daniel Marich
 */

package carsdatabaseassignmentmarich;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Daniel
 */
public class CarQueries 
{
    static String addString = "INSERT INTO Cars (CarMake,CarModel,CarYear,CarMileage) VALUES(?,?,?,?)";
    static String allRecords = "SELECT * FROM CARS.CARS";
    static String deleteString = "DELETE FROM CARS.CARS WHERE CARID = ?";
    static String findRecords = "SELECT * FROM CARS.CARS WHERE lower(CarModel) = ";
    

    static PreparedStatement getAll( java.sql.Connection conn)
    {
        try
            {
        return conn.prepareStatement(allRecords); 
            }
        
                catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
          return null; 

    }
    
    static PreparedStatement add( java.sql.Connection conn, Car obj)
    {
        
        try
            {
        PreparedStatement ps = conn.prepareStatement(addString); 
        ps.setString(1, obj.getCarMake() );
        ps.setString(2, obj.getCarModel());
        ps.setString(3, obj.getCarYear());
        ps.setInt(4, obj.getCarMileage());
        ps.executeUpdate();
        
        
        //return ps;
            }
        
                catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
          return null; 

    }
    
    static PreparedStatement delete( java.sql.Connection conn, int carID)
    {
        
        try
            {
        // This works! 
        PreparedStatement ps = conn.prepareStatement(deleteString); 
        ps.setInt(1, carID);
        ps.execute();
        
        
        //return ps;
            }
        
                catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
          return null; 

    }
    
    static PreparedStatement find(java.sql.Connection conn, String carModel)
    {
        try
            {
            //Output Test Code
            //System.out.println("String in Prepared Statement is: " + carModel);
            //System.out.println("Query string is: " + findRecords + carModel);

            String test = (findRecords + "'" + carModel.toLowerCase() + "'");
            return conn.prepareStatement(test);

//               
//        PreparedStatement ps = conn.prepareStatement(findRecords); // For some reason could not get this to work.
//        ps.setString(1, carModel);  // For some reason could not get this to work.  Maybe something to do with how string is passed to queryDebug later.

            
        

            }
        
        catch(SQLException e)
        {
            System.err.println(e.getMessage());
        }
        
          return null; 

    }
}
