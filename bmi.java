import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("nhap can nang vao(kg)");
        weight = scanner.nextDouble();
        System.out.println("nhap chieu cao vao(meter)");
        height = scanner.nextDouble();
        bmi = weight / (height*height);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "underweight");
        } else if (bmi < 25) {
            System.out.printf("%-20.2f%s", bmi, "normal");
        } else if (bmi < 30) {
            System.out.printf("%-20.2f%s", bmi, "overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "obese");
        }

    }
    }

