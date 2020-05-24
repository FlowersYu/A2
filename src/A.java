
public class A {
    public static void main(String[] args) {

        for (int i = 8; i >= 1; i -= 2) {
            for (int j = 1; j <= 16; j++) {
                if (j > i && j <= 16 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }

        for (int i = 2; i <= 8; i += 2) {
            for (int j = 1; j <= 16; j++) {
                if (j > i && j <= 16 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println("");
        }

    }
}