import java.util.Scanner;

public class Quadratic {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer for a: ");
		int a = in.nextInt();
		System.out.print("Enter an integer for b: ");
		int b = in.nextInt();
		System.out.print("Enter an integer for c: ");
		int c = in.nextInt();
		double difference = (double) (Math.pow(b, 2) - (4 * a * c));
		if(difference>0){
			double x1=(-b + Math.sqrt(difference))/(2*a);
			double x2=(-b - Math.sqrt(difference))/(2*a);
			System.out.println("One solution is "+x1+", the other solution is "+x2);
		}else if(difference==0){
			double x=(-b + Math.sqrt(difference))/(2*a);
			System.out.println("The only solutuion is "+x);
		}else{
			System.out.println("The function has no solution");
		}
	}
}

