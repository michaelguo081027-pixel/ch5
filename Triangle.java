import java.util.Scanner;

public class Triangle {
	
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length for first stick: ");       
		int a = in.nextInt();
		System.out.print("Enter the length for second stick: ");        
		int b = in.nextInt();
		System.out.print("Enter the length for third stick: ");       
		int c = in.nextInt();
		if(a+b<=c || b+c<=a || a+c<=b){
			System.out.println("You can't make a triangle with these sticks.");
		}else{
			System.out.println("You can make a triangle with these sticks.");
		}
	}
}

