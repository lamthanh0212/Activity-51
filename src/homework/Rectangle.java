package homework;

public class Rectangle {
    private int cdai ;
    private int crong ;

    public Rectangle (int crong , int cdai ) {
        this.crong = crong ;
        this.cdai = cdai ;
    }
    public int getCdai () {
        return cdai ;
    }
    public int getCrong () {
        return crong ;
    }
    public void setCdai () {
        this.cdai = cdai ;
    }
    public void setCrong () {
        this.crong = crong ;
    }

    public int tinhcv () {
        int cv = ( cdai + crong ) * 2 ;
        return cv ;
    }

    public int tinhdt () {
        int dt = cdai * crong ;
        return dt ;
    }


    public void incdaicong () {
        System.out.println("chieu dai la: " + cdai);
        System.out.println("chieu rong la: " + crong);
    }

    public boolean ktrahv () {
         if ( crong == cdai ) {
             System.out.println("hinh vuong");
             return true ;
         } else {
             System.out.println("hinh chu nhat ");
             return false ;
         }
    }
}
