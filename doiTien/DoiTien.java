package doiTien;

import java.util.Scanner;

public class DoiTien {
    public static void main(String[] args) {
        double VND = 23000,USD;
        System.out.println("nhap tien usd vao di ban oi");
        Scanner scanner = new Scanner(System.in);
        USD= scanner.nextDouble();
        double DoiTien= USD *23000;
        System.out.println("tien viet cua ban la:"+ DoiTien+"VND");
        System.out.println("nhap tien vnd vao de");
        Scanner scanner2=new Scanner(System.in);
        VND= scanner2.nextDouble();
        double DoiTieN= VND/23000;
        System.out.println("tien usd cua ban la:"+DoiTieN);


}}
