package methodesHomeWok;

public class RetMetNoParams {

    public static void main(String args[]) {
        RetMetNoParams AHM = new RetMetNoParams();
        AHM.doSum();
        AHM.printName();
        AHM.callVehicle();
        AHM.doMulti();
        AHM.isJavainteresting();
    }

    public int doSum() {
        int num1 = 45;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println("total is" + " " + sum);
        System.out.println("****************************");

        return sum;
    }

    public String printName() {

        String fname = "John";
        String lname = "Smith";

        System.out.println(" first name is " + fname);
        System.out.println(" last name is " + lname);
        System.out.println(" *********************************");

        return fname + lname;
    }

    public String callVehicle() {

        String vehicleMake = "Nissan";
        String vehicleModel = "Rogue";
        String vehiclemileage = "75000";
        System.out.println(" vehicle make is " + vehicleMake);
        System.out.println(" vehicle model is " + vehicleModel);
        System.out.println(" vehicle mileage is " + vehiclemileage);

        System.out.println("****************************");
        return vehicleMake + vehicleModel + vehiclemileage;

    }

    public double doMulti() {
        double salary = 45000;
        double taxBracket = 0.92;
        double taxedSalary = salary * taxBracket;
        double  totalSalary=salary+taxedSalary;
        System.out.println("total salary is" + " " + totalSalary);
        System.out.println("****************************");
        return totalSalary;
    }

   public boolean isJavainteresting(){
        boolean isJavaintersting=true;

        System.out.println( "my opinion is :" + isJavaintersting);
        return isJavaintersting;


   }

    }


