package homework;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in) ;
    int cdaii ;
    int crongg ;
    System.out.println("Nhap vao chieu dai: " );
    cdaii = scanner.nextInt() ;
    System.out.println("Nhap vao chieu rong: ");
    crongg = scanner.nextInt() ;

    Rectangle rectangle = new Rectangle( cdaii , crongg ) ;

    int cv = rectangle.tinhcv() ;
    int dt = rectangle.tinhdt() ;

    System.out.println("dien tich la: " + cv);
    System.out.println("chu vi la: " + dt);

    rectangle.incdaicong();

    rectangle.ktrahv() ;




    }








}















