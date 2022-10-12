public class swap {

    public static void main(String[] args) {

        float fnum = 2.56f, snum = 2.45f;

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
