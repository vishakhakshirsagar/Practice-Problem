package Patternque;

public class Pattern1 {
        public static void main(String[] args) {
            int i, j;
            for (i = 1; i <= 5; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(" ");
            }
            for (i = 4; i >= 1; i--) {
                for (j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println(" ");
            }
        }
    }
