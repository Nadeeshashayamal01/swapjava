public class swap {

    public static void main(String[] args) {

  int firstnumber = 1, secondnumber = 2;

        System.out.println("--Before the swap--");
        System.out.println("Your First number is= " + firstnumber);
        System.out.println("Your Second number is= " + secondnumber);

        firstnumber = firstnumber - firstnumber;
        secondnumber = firstnumber + secondnumber;
        firstnumber = secondnumber - firstnumber;


        System.out.println("--After the  swap--");
        System.out.println("Your First number is= " + firstnumber);
        System.out.println("Your Second number is = " + secondnumber);
    }
}
