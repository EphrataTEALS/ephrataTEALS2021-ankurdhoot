public class Max {
    public static void main(String[] args) {
        int[] intArray = new int[]{2, 10, 53, 1, 7, 9, 11, 23 };
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        System.out.println("The max is " + max);
    }
}
