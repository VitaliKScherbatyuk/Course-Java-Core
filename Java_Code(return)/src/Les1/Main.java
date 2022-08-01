package Les1;
import java.util.Arrays;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {

		byte a = 12;
		short s = 10;
		int q = 5;
		long w = 12l;
		float x = 23.22f;
		double c = 20.9;
		boolean v = true;
		
		System.out.println("Byte - Min: " + Byte.MIN_VALUE + ", and Max: " + Byte.MAX_VALUE);
		System.out.println("Short - Min: " + Short.MIN_VALUE + ", and Max: " + Short.MAX_VALUE);
		System.out.println("Integer - Min: " + Integer.MIN_VALUE + ", and Max: " + Integer.MAX_VALUE);
		System.out.println("Long - Min: " + Long.MIN_VALUE + ", and Max: " + Long.MAX_VALUE);
		System.out.println("Float - Min: " + Float.MIN_VALUE + ", and Max: " + Float.MAX_VALUE);
		System.out.println("Double - Min: " + Double.MIN_VALUE + ", and Max: " + Double.MAX_VALUE);
		System.out.println("Boolean - Min: " + Boolean.FALSE + ", and Max: " + Boolean.TRUE);
		
		System.out.println("--------------------------------------------");
		
		int [] array1 = {10,9,8,7,6,5,4,3,2,1};
		int min = array1[0];
		int max = min;
		  for (int i = 1; i < array1.length; ++i) {
		      if (array1[i] > max) max = array1[i];
		      if (array1[i] < min) min = array1[i];
		  }
		System.out.println("Min - " + min + ", and Max - " + max);
		}
		
	}
