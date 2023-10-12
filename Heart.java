public class Heart {
    public static void main(String[] args) {
        int size = 10; // Adjust the size to make the heart bigger or smaller
        int i, j;

        // Upper part of the heart
        for (i = size / 2; i <= size; i = i + 2) {
            for (j = 1; j < size - i; j = j + 2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("-");
            }
            for (j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("-");
            }
            System.out.println();
        }

        // Lower part of the heart
        for (i = size; i >= 1; i--) {
            for (j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
