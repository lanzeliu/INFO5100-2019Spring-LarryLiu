public class PartD {
    // Constructor:
    public PartD() {}

    // Member function:
    public int findClosestIndexToTarget(int target, int[] A) {
        int res = -1;
        try {
            if (A.length == 0) throw new EmptyArrayException();
            // Initialization minimum subtract value:
            int min = Math.abs(target - A[0]);
            // Make the subtract value replace the array A:
            for (int i = 0; i < A.length; i++) {
                A[i] = Math.abs(target - A[i]);
                if (A[i] < min) {
                    min = A[i];
                }
            }
            for (int i = 0; i < A.length; i++) {
                if (A[i] == min) {
                    res = i;
                }
            }
        } catch (EmptyArrayException e) {
            System.out.println("This array is empty!");
        }
        return res;
    }

    class EmptyArrayException extends Exception {}

    public static void main(String[] args) {
        PartD test = new PartD();
        System.out.println(test.findClosestIndexToTarget(2, new int[] {1, 3, 3, 4}));
        System.out.println(test.findClosestIndexToTarget(7, new int[] {0, 1, 5}));
        System.out.println(test.findClosestIndexToTarget(3, new int[] {}));
    }
}
