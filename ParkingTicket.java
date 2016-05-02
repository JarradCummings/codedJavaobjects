/*
Cummings,Jarrad
CSC210
*/
    
public class ParkingTicket
{
   private ParkedCar car;
   private PoliceOfficer officer;
   private double fine;
   private int minutes;
  
   public final double BASE_FINE = 25.0;
   public final double HOURLY_FINE = 10.0;
 
   public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min)
   {
      car = aCar;
      officer = anOfficer;
      minutes = min;
   
     
   }
   public ParkingTicket( ParkingTicket ticket2)
   {
      car = ticket2.car;
      officer = ticket2.officer;
      minutes = ticket2.minutes;
   
   
      CalculateFine();
   }
   public void CalculateFine()
   
   {
      double hours = minutes/60.0;
      int hoursAsInt = (int) hours;
   
      if ((hours - hoursAsInt) > 0) 
      {
         hoursAsInt++;
      }
      if (minutes>0)
         fine = BASE_FINE;
    
      fine += (HOURLY_FINE * hoursAsInt);
   
      System.out.print (this.toString());
   }
   
   public ParkedCar getCar() 
   {
      return car;
   }
 
   public String toString()
   
   {
      String Fine = car.toString() + officer.toString() + "\n\nTime illegally parked: " + minutes + "\nFine: " + fine;
      return Fine;
   } 
     public static void main (String [] args)
   {
      ParkedCar PC = new ParkedCar( "Volkswagen" , "1972" , "Red" , "147RHZM" , 2);
      PoliceOfficer PO = new PoliceOfficer ("Joe Friday" , "4788" );
      ParkingMeter PM = new ParkingMeter ( 60 );
   
      ParkingTicket ticket = PO.patrol(PC,PM);;
         if(ticket !=null)
   {
   System.out.println(ticket);
   }
   else
   {
   System.out.println("no crimes commited");
}
}
}