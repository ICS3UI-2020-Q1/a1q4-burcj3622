import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  Scanner input = new Scanner(System.in);

  System.out.println("Please enter in the x coordinate of the first point");
  
  int X1 = input.nextInt();
  
  System.out.println("Please enter in the y coordinate of the first point");
 
  int Y1 = input.nextInt();

   System.out.println("Please enter in the x coordinate of the second point");
  int X2 = input.nextInt();

    System.out.println("Please enter in the y coordinate of the second point");

  int Y2 = input.nextInt();
 
  //declare and calculate
  System.out.println("The slope of your line would be " + (Y2 -Y1)/(X2 - X1) );
  }
}
