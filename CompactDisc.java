/*
Cummings,Jarrad
CSC210
*/

//Import statement

import java.io.*;

// program builds list of songs from a file

public class CompactDisc {
	
	
	public static void main(String[] args)throws IOException {
		FileReader file = new FileReader("Classics.txt");
        BufferedReader input = new BufferedReader(file);
        String title;
        String artist;
         
      final int NUM_SONGS = 6;
        Song [] cd = new Song [NUM_SONGS];
         
        for (int i = 0; i < cd.length; i++)
        {
            title = input.readLine();
            artist = input.readLine();  
            cd[i] = new Song(title, artist);        
         }
         
        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++)
        {
            System.out.print(cd[i].toString());
        }
	}	
}
