import java.util.Scanner;
public class year {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so nam di ban oi:");
        year= scanner.nextInt();
        if( year%400==0 ||( year % 4==0 && year%100 !=0)){
            System.out.println("day la nam nhuan");
        }
        else {
            System.out.println("day khong phai nam nhuan");
        }
    }
}
