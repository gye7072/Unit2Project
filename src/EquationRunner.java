import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args){
        //allows user input
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the first x-y coordinate point: ");
        String s1 = scan1.nextLine();
        //turns string input into integers
        int x1 = Integer.parseInt(s1.substring(1,s1.indexOf(",")));
        int y1 = Integer.parseInt(s1.substring(s1.indexOf(",") + 1, s1.length() -1));


        System.out.print("Enter the second x coordinate point: ");
        Scanner scan2 = new Scanner(System.in);
        String s2 = scan2.nextLine();
        //turns string input into integers
        int x2 = Integer.parseInt(s2.substring(1,s2.indexOf(",")));
        int y2 = Integer.parseInt(s2.substring(s2.indexOf(",") + 1,s2.length() -1));

        //displays LinearEquation info
        LinearEquation linear1 = new LinearEquation(x1, y1, x2, y2);
        System.out.print(linear1);

        //displays full coordinates given x coordinate (user input).
        System.out.print("Enter an x-value: ");
        Scanner scan3 = new Scanner(System.in);
        double x3 = scan3.nextDouble();
        System.out.print(linear1.calculateY(x3));
    }
}

