/*
Cummings,Jarrad
CSC210
*/
//Class
public class AverageDriver {
	
	/*
	 * Method main
	 * @param args
	 */
	public static void main(String[] args) {
		Average avg = new Average();
    avg.selectionSort();
    avg.calculateMean();    
    System.out.println(avg.toString());
	}	
}
