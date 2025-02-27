import java.util.*;

class EarthVolume{
	public static void main(String [] args){
		double PI=Math.PI;
		int radius=6378;
		double volume=(float)4/3 * PI *Math.pow(radius,3);
		double mradius=radius*0.621371;
		double volumeMile=(float)4/3 *PI *mradius*mradius*mradius;
		System.out.println("The volume of earth in cubic kilometers is " +volume +" and in cubic miles is "+volumeMile);
	}
}
