import java.util.Scanner;

public class RectangleProgam {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Wight: ");
        width = scanner.nextFloat();
        System.out.println("Enter Height: ");
        height = scanner.nextFloat();
        float area = height * width;
        System.out.println("Aria: " + area);
    }
}
