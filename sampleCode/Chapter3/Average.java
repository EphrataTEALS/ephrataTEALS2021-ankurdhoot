public class Average {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum = sum + intArray[i];
        }
        double average = 0;
        // Can you add one line here to compute the average?
        average = sum / intArray.length;
        System.out.println("The average is " + average);
    }
    
}
