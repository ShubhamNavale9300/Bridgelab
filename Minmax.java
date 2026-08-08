class Main {
    public static void main(String[] args) {

        // Minimum and maximum values
        System.out.println("Byte Min: " + Byte.MIN_VALUE);
        System.out.println("Byte Max: " + Byte.MAX_VALUE);

        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);

        System.out.println("Integer Min: " + Integer.MIN_VALUE);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);

        System.out.println("Long Min: " + Long.MIN_VALUE);
        System.out.println("Long Max: " + Long.MAX_VALUE);

        // Integer overflow
        int overflow = Integer.MAX_VALUE + 1;

        // Integer underflow
        int underflow = Integer.MIN_VALUE - 1;

        System.out.println("Integer Overflow: " + overflow);
        System.out.println("Integer Underflow: " + underflow);
    }
}