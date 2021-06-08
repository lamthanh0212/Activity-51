package homework;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong: ");
        hcn.setCrong(scanner.nextDouble());

        System.out.println("Nhap chieu dai: ");
        hcn.setCdai(scanner.nextDouble());




        System.out.println("Dien tich: " + hcn.dientich());

        System.out.println("Chu vi: " + hcn.chuvi());


    }








}















