import java.util.Scanner;

public class Fermat{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer for a: ");
		int a = in.nextInt();
		System.out.print("Enter an integer for b: ");
		int b = in.nextInt();
		System.out.print("Enter an integer for c: ");
		int c = in.nextInt();
		System.out.print("Enter an integer greater than 2 for n: ");
		int n = in.nextInt();
		if(Math.pow(a, n)+Math.pow(b, n)==Math.pow(c, n)){
			System.out.println("Holy smokes, Fermat was wrong!");
		}else{
			System.out.println("No, that doesn't work.");
		}
	}
}
