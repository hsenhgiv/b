package addition;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class addsel {

	public static void main(String[] args) throws IOException{
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first no. >");
		int a = Integer.parseInt(buff.readLine());
		
		System.out.print("Enter second no. >");
		int b = Integer.parseInt(buff.readLine());
		
		System.out.print("Addition ->" + (a+b));
		// TODO Auto-generated method stub

	}

}
