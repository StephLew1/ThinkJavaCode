public class Constants

{
    public static void main ( String[] args )
    {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 1;


        int td, pat, fg, total;
        td = 4 * TOUCHDOWN;
        pat = 3 * CONVERSION;
        fg = 2 * FIELDGOAL;
        total = (td + pat + fg);
        System.out.println("Score: " + total );

    }
}
