package methodesHomeWok;

public class NoRetMetWiParams {

    public static void main(String[] args) {
        sayWelcome("Welcome everyone to our Java learning class");
        getInfo("Ahmed", 43);
        doSum(20, 40);
        doMulti(1200, 52);
        doSub(100, 68);
    }

    public static void sayWelcome(String Greetings) {
        System.out.println("***************************************");
        System.out.println(Greetings);

    }


    public static void getInfo(String name, int age) {
        System.out.println("***************************************");

        System.out.println("my name is :" + " " + name + " " + " my age is : " + age);

        System.out.println("***************************************");

    }


    public static void doSum(int x, int y) {
        x = 20;
        y = 40;
        int totalsum = x + y;
        System.out.println("total =" + " " + totalsum);

        System.out.println("***************************************");
    }

    public static void doMulti(double weeklysalary, int weeknum) {
        weeklysalary = 800;
        weeknum = 52;

        double totalYearlySalary = weeklysalary * weeknum;
        System.out.println("Yearly salary  =" + " " + totalYearlySalary);

        System.out.println("***************************************");
    }

    public static void doSub(int distance1, int distance2) {
        distance1 = 100;
        distance2 = 68;
        int totaldistance = distance1 - distance2;
        System.out.println("total distance  =" + totaldistance + " miles");

        System.out.println("***************************************");

        System.out.println("Thank you for your patience");
        System.out.println("***************************************");

    }
}






















