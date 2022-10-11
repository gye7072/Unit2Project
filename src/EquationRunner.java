import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first x coordinate point: ");
        int x1 = s.nextInt();
        System.out.print("Enter the first y coordinate point: ");
        int y1 = s.nextInt();
        System.out.print("Enter the second x coordinate point: ");
        int x2 = s.nextInt();
        System.out.print("Enter the second y coordinate point: ");
        int y2 = s.nextInt();

        LinearEquation linear1 = new LinearEquation(x1, y1, x2, y2);
        System.out.print(linear1);


        System.out.print("Enter an x-value: ");
        double x3 = s.nextDouble();
        LinearEquation linear2 = new LinearEquation(x3);
        System.out.print(linear2.calculateY());



    }
}

