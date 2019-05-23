import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao gia tri 3 canh cua tam giac");
        float side1 = input.nextFloat();
        float side2 = input.nextFloat();
        float side3 = input.nextFloat();
        input.nextLine();
        System.out.println("Nhap vao mau sac : ");
        String color = input.nextLine();

        Triangle triangle = new Triangle(color,true,side1,side2,side3);

        System.out.println(triangle.toString());
    }
}
