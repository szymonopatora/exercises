package ConcatVsSBuidlerVsSBuffer;

public class ConcatenationVsStringBuilderVsStringBuffer {
    /**
     * Concatenation vs StringBuilder vs StringBuffer
     *
     * @author Szymon Patora [http://github.com/szymonopatora]
     * <p>
     * Exercise to present the difference in efficiency between the mentioned methods.
     */

    public static void main(String[] args) {

        final int MILLI_SECONDS = 1_000_000;

        String stringExample = "";
        long startString = System.currentTimeMillis();
        for (int i = 0; i < MILLI_SECONDS; i++) {
            stringExample += "a";
        }
        long stopString = System.currentTimeMillis();

        long resultString = stopString - startString;
        System.out.println("Runtime for String concatenation: " + resultString+" ms");

        System.out.println("***");

        StringBuilder stringBuilderExample = new StringBuilder();
        long startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < MILLI_SECONDS; i++) {
            stringBuilderExample.append("a");
        }
        long stopStringBuilder = System.currentTimeMillis();

        long resultStringBuilder = stopStringBuilder - startStringBuilder;
        System.out.println("Runtime for StringBuilder: " + resultStringBuilder+" ms");

        System.out.println("***");

        StringBuilder stringBufferExample = new StringBuilder();
        long startStringBuffer = System.currentTimeMillis();
        for (int i = 0; i < MILLI_SECONDS; i++) {
            stringBufferExample.append("a");
        }
        long stopStringBuffer = System.currentTimeMillis();

        long resultStringBuffer = stopStringBuffer - startStringBuffer;
        System.out.println("Runtime for StringBuilder: " + resultStringBuffer+" ms");
    }

}
