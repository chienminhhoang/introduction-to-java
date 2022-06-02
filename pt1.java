import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double x;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so a di ban oi");
        aNumber= scanner.nextInt();
        System.out.println("nhap so b di ban oi");
        bNumber= scanner.nextInt();

        System.out.println("phuong trinh ban nhap vap la"+ aNumber +"x+"+bNumber +"=0");
           if(aNumber==0 ) {
               if (bNumber == 0) {
                   System.out.println("phuong trinh vo so nghiem");
               }else{
                   System.out.println("phuong trinh vo nghiem");
               }
           }
           else{
                   x = (double) -bNumber / aNumber;
               System.out.println("phuong trinh co nghiem x="+x);

               }}

}
