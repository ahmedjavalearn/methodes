package methodesHomeWok;

public class RetMetWiParams {

    public static void main(String args[]) {
        RetMetWiParams obj = new RetMetWiParams();
        obj.printPlayerName("Smith", "John", "10");
        obj.doSommation(20, 30, 16);
        obj.doSub(270000,40000);
        obj.doMulti( 20,100);
        obj.EarthIsFlat(false);

    }

    public static String printPlayerName(String lastname, String firstname, String playernumber) {

        System.out.println("**************************************** ");
        lastname = "Smith";
        firstname = " John";
        System.out.println("player  last name is  " + " " + lastname);
        System.out.println("player first name is" + " " + firstname);
        System.out.println("player number is " + " " + playernumber);
        System.out.println("**************************************** ");
        return lastname + firstname + playernumber;

    }

    public int doSommation(int num1, int num2, int num3) {
        num1 = 20;
        num2 = 30;
        num3 = 16;
        int totalSum = num1 + num2 + num3;
        System.out.println("total = " +" "+totalSum);
        System.out.println("********************************************");
        return totalSum;

    }
    public double doSub(double homeTotalPrice, double homeDownpayment ) {
        homeTotalPrice = 270000;
        homeDownpayment = 40000;
         double bankLoan = homeTotalPrice - homeDownpayment;
        System.out.println( "total bank loan = " +" $"+bankLoan) ;
        System.out.println("********************************************");
        return bankLoan;
    }
    public int doMulti(int num1, int num2) {
        num1 = 20;
        num2 = 100;
        int totalMulti = num1 * num2 ;
        System.out.println( "total Multi = "+ " " +totalMulti);
        System.out.println("********************************************");
        return totalMulti;
    }

    public boolean EarthIsFlat ( boolean EarthisFlat) {
        EarthisFlat = false;

        System.out.println("is Earth flat ?"+ " "+EarthisFlat);
        System.out.println("********************************************");
        return EarthisFlat;



    }}






