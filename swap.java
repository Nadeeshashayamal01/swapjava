public class swap {

    public static void main(String[] args) {

        float fnum = 2.56f, snum = 2.45f;

        System.out.println("--Before the swap--");
        System.out.println("Your First number is= " + fnum);
        System.out.println("Your Second number is= " + snum);

        // Value of first is assigned to temporary
        float temp = fnum;

        // Value of second is assigned to first
        fnum = snum;

        // Value of temporary (which contains the initial value of first) is assigned to second
        snum = temp;

        System.out.println("--After the  swap--");
        System.out.println("Your First number is= " + fnum);
        System.out.println("Your Second number is = " + snum);
    }
}
