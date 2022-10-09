public class swap {

    public static void main(String[] args) {

        float fnum = 1.20f, snum = 2.45f;

        System.out.println("--Before the swap--");
        System.out.println("First number = " + fnum);
        System.out.println("Second number = " + snum);

        // Value of first is assigned to temporary
        float temporary = fnum;

        // Value of second is assigned to first
        fnum = snum;

        // Value of temporary (which contains the initial value of first) is assigned to second
        snum = temporary;

        System.out.println("--After the  swap--");
        System.out.println("First number = " + fnum);
        System.out.println("Second number = " + snum);
    }
}