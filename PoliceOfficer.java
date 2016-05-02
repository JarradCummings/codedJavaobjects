/*
Cummings,Jarrad
CSC210
*/


public class PoliceOfficer
{
   private String name;
   private String badgeNumber;
  
   public PoliceOfficer (String n, String bn)
   {
      name = n;
      badgeNumber = bn;
   } 
   public PoliceOfficer ( PoliceOfficer officer2)
   {
      name = officer2.name;
      badgeNumber = officer2.badgeNumber;
   }
  
   
   public ParkingTicket patrol ( ParkedCar car, ParkingMeter meter)
   {
      ParkingTicket ticket = null;
      int illegalMinutes = car.getMinutesParked() - meter.getMinutesPurchased();
                  
                 
      if (illegalMinutes > 0) 
      {
        ticket = new ParkingTicket(car, this, illegalMinutes);
      }
          return ticket;
  
   
   }
   public String toString()
   {
      String officer = "\n\nOfficer Data: " + "\nName: " + name + "\nBadge Number: " + badgeNumber ;
      return officer;
   }
}