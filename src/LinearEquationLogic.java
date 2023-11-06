import java.util.Scanner;


public class LinearEquationLogic {
    private LinearEquation equation;
    private Scanner myScanner;




    public LinearEquationLogic(){
        equation = null;
        myScanner = new Scanner(System.in);
    }
    public void start(){
        getEquationInfo();
        getData();
    }
    private void getEquationInfo(){
        System.out.println("Welcome to the linear equation calculator!");
        System.out.print("Enter your first coordinate point: ");
        String coord1 = myScanner.nextLine();
        System.out.print("Enter your second coordinate point: ");
        String coord2 = myScanner.nextLine();




        equation = new LinearEquation(coord1,coord2);
        System.out.println("Equation created!");
    }




    private void getData(){
        String choice = null;
        if (equation.getX() == equation.getX2()) {
            System.out.println(equation.lineInfo());
        } else {
            System.out.println(equation.lineInfo() + "\n");
            System.out.print("Enter an x value: ");
            double x = myScanner.nextDouble();
            myScanner.nextLine();
            System.out.println(equation.coordinateforX(x));
            System.out.println("Would you like to enter another pair of coordinates? y/n");
            choice = myScanner.nextLine();
            if(choice.equals("y")){
                start();
            } else {
                System.out.println("bye");
            }
        }
    }
}