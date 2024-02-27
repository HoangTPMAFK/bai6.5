import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radius = 0;
        ResizableCircle rc = null;
        int percent = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("1. Type radius");
            System.out.println("2. Print radius");
            System.out.println("3. Calculate perimeter");
            System.out.println("4. Calculate area");
            System.out.println("5. Resize circle");
            System.out.println("6. Exit");
            System.out.print("> ");
            choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6) break;
            switch (choice) {
                case 1:
                    System.out.print("radius = ");
                    radius = sc.nextDouble();
                    rc = new ResizableCircle(radius);
                    break;
                case 2:
                System.out.print("radius = " + rc.radius);
                    break;
                case 3:
                    System.out.println("Perimeter = " + rc.getPerimeter(radius));
                    break;
                case 4:
                    System.out.println("Area = " + rc.getArea(radius));
                    break;
                case 5:
                    System.out.print("Resize: ");
                    percent = sc.nextInt();
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Please type number again!");
                    break;
            }
        }
    }
}
