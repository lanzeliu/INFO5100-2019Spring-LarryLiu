package oopassignment;

public class Rotate2DArray {
    public int[][] rotate2DArray(int[][] a) {
        int[][] res = new int[a.length][a.length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a.length; j++) {
                res[j][-i+a.length-1] = a[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Rotate2DArray ra = new Rotate2DArray();
        int[][] a1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] res = ra.rotate2DArray(a1);
        for (int i=0; i<res.length; i++) {
            for (int j=0; j<res.length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
