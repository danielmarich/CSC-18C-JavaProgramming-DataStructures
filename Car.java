/*
CIS 18B 
Cars Database Assignment
Daniel Marich
 */
package carsdatabaseassignmentmarich;


public class Car 
{
    private int carID;
    private String carMake;
    private String carModel;
    private String carYear;
    private int carMileage;
    
    Car( String make, String model, String year, int mileage){
    carMake = make;
        carModel = model;
        carYear = year;
        carMileage = mileage;
    
    }
    Car(int ID, String make, String model, String year, int mileage)
    {
        this(make, model, year, mileage);
        carID = ID;
      
    }
    
    public int getCarID()
    {
        return carID;
    }

    public String getCarMake()
    {
        return carMake;
    }

    public String getCarModel()
    {
       return carModel;
    }
    public String getCarYear()
    {
        return carYear;
    }
    public int getCarMileage()
    {
        return carMileage;
    }
}
