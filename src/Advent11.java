import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Advent11 {

	public static void main(String[] args) throws FileNotFoundException  {

		File f = new File(args[0]);
		Scanner scan = new Scanner(f);
		Integer total = 0;
		
		while(scan.hasNext()) {
			String line = scan.next();
			//System.out.println(line);
			Integer add = Integer.valueOf(line);
			total = total + add;
		}
		System.out.println("Total is " + total);
		scan.close();
		
	}

}
