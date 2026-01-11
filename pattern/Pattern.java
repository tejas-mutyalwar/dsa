class Pattern {

    public static void getPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j > 0) {
                    System.out.print(" ");
                    System.out.print(((i+1) + (j*n)-(j*(j+1))/2));
                } else {
                    System.out.print((i+1));
                }
            }
            System.out.println();
        }
    }

    public static void getPattern2(int n) {
        for (int i = 0; i < n/2+1; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-(2*i); j++) {
                System.out.print(Integer.toString(j+1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 9;
        getPattern2(n);
    }
}