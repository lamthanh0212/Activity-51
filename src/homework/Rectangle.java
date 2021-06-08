package homework;

public class Rectangle {
    double cdai ;
    double crong ;
    public Rectangle (double cdai , double crong ) {
        this.cdai = cdai ;
        this.crong = crong ;
    }


    public Rectangle() {

    }
    public boolean ktrahinhvuong (boolean k ) {
        if (this.crong == this.cdai ) {
            System.out.println("Hinh vuong ");
        } else {
            System.out.println("ko ");
        }
        return k ;
    }




    public void setCdai(double cdai ) {
        this.cdai = cdai ;
    }
    public void setCrong(double crong ) {
        this.crong = crong ;
    }
    double dientich () {
        return (cdai * crong) ;
    }

    double chuvi () {
       return (cdai + crong) * 2 ;
    }

}
