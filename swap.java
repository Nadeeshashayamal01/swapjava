public class swap {

    public static void main(String[] args) {

  int fnum = 1, snum = 2;

        System.out.println("--Before the swap--");
        System.out.println("Your First number is= " + fnum);
        System.out.println("Your Second number is= " + snum);

        fnum = fnum - snum;
        snum = fnum + snum;
        fnum = snum - fnum;


        System.out.println("--After the  swap--");
        System.out.println("Your First number is= " + fnum);
        System.out.println("Your Second number is = " + snum);
    }
}
