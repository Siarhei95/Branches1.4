package Example1;
import  java.util.Scanner;

public class Question_4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height_brick, height_hole, width_brick, width_hole;
        double length_brick;
        System.out.print("Enter height brick: ");
        height_brick = scanner.nextDouble();
        System.out.print("Enter height hole: ");
        height_hole = scanner.nextDouble();
        System.out.print("Enter width brick: ");
        width_brick = scanner.nextDouble();
        System.out.print("Enter height hole: ");
        width_hole = scanner.nextDouble();
        if((height_hole>height_brick) && (width_hole>width_brick)) {
            System.out.println("The brick will go through the hole");
        } else {
            System.out.println("The brick won't go through the hole");
        }
    }
}
