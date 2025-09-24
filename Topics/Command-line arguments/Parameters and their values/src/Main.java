class Problem {
    public static void main(String[] args) {
        for (int i = 0, j = 1; j < args.length; i += 2, j += 2) {
            System.out.printf("%s=%s", args[i], args[j]);
            System.out.println();
        }
    }
}