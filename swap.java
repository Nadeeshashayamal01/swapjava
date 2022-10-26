public class swap {

    public static void main(String[] args) {

  int fnumber = 1, snumber = 2;

        System.out.println("--Before the swap--");
        System.out.println("Your First number is= " + fnumber);
        System.out.println("Your Second number is= " + snumber);

        fnumber = fnumber - fnumber;
        snumber = fnumber + snumber;
        fnumber = snumber - fnumber;


        System.out.println("--After the  swap--");
        System.out.println("Your First number is= " + firstnumber);
        System.out.println("Your Second number is = " + snumber);
    }
}
