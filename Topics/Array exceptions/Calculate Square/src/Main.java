class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
/*      // if version
        if (index < 0 || array == null || index >= array.length) {
            System.out.println("Exception!");
        } else {
            System.out.println(array[index] * array[index]);
        }*/

        try {
            System.out.println(array[index] * array[index]);
        } catch (Exception e) {
            System.out.println("Exception!");
        }

    }
}