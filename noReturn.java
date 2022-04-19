package methodesHomeWok;

public class noReturn {


    public static void main ( String args[]) {

        printInfo();
        saySomething();
        math();
        enjoy();
        refresh();
    }

    public static void printInfo() {
        System.out.println("**************************");
        System.out.println("Ahmed");
        System.out.println("Yelles");
        System.out.println("Philadelphia");
        System.out.println("USA");
        System.out.println("**************************");

    }

    public static void  saySomething() {
        System.out.println("nice Weather");
        System.out.println("**************************");

    }
    public static void  math() {
        int num1=5;
        int num2= 10;
        int sum= num1+num2;
        System.out.println( "total is" + " "+sum );
        System.out.println("**************************");

    }
    public static void enjoy() {

        System.out.println( " free your mind ");
        System.out.println( "*****************************");
    }
    private static void  refresh() {
        System.out.println("this a private metheod");



}}