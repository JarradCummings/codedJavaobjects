/*
Cummings,Jarrad
CSC210
*/

public class Television
   {
   
       private final String manufacturer;
       private final int ScreenSize;  
       private boolean powerOn;
       private int channel;
       private int volume; 
      
       public Television (String man, int size)
         {
            manufacturer = man;
            ScreenSize=size;
            powerOn= !powerOn;
            volume= 20;
            channel=2;
          }
          //gets the vslues stored in the object volume field 
        public int getVolume()
         {
            return volume;
         }
          //gets the vslues stored in the object channel field
        public int getChannel()
         {
            return channel;
         }
         
          //gets the vslues stored in the object manufacturer field
        public String getManufacturer()
         {
            return manufacturer;
         }
        
         //gets the vslues stored in the object screensize field 
        public int getScreenSize()
         {
            return ScreenSize;
         }
         
          //sets the vslues stored in the object channel field
        public void setChannel(int station)
         {
            channel = station;
         }
        
        //  changes the state from true to false or from false to true.  
        public void power()
         {
            powerOn = !powerOn;
            
         }
         
         //increases the volume
        public void increaseVolume()
         {
            volume++;
         }
         
         //decreases the volume
        public void decreaseVolume()
         {
            volume--;
         }
         
        }
       