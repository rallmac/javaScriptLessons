class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;

        while (x < 3) {
                if (x < 1) {
                    System.out.print("a ");
                }
                if (x > 1) {
                    System.out.print("an");
                    System.out.print(" oyster");
                }
            if (x == 1) {
                System.out.print("annoys");
            }
            if (x < 1) {
                System.out.print("noise");
            }
            System.out.println(" ");
            x = x + 1;
        }
    }
}
