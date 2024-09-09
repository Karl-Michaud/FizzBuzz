public class Multiples {
    public static void main(String[] args) {
        int counter = 0;
        int i = 0;
        int end = 1000;
        while (i < end) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if ( divisibleBy3 || divisibleBy5 ) {
                counter++;
            }
            i++;
        }
        System.out.println(counter);

    }
}
