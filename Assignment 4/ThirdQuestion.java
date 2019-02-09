package assignment4;

public class ThirdQuestion {

	public int[] SortedArray(int[] a) {
		// Initialize double pointer:
		int left = 0;
		int right = 1;
		// Run the double pointer:
		while (right < a.length) {
			if (a[left] != 0) {
				left++;
				right++;
			}
			else if (a[left] == 0) {
				if (a[right] != 0) {
					a[left] = a[right];
					a[right] = 0;
					left++;
					right++;
				}
				else if (a[right] == 0) {
					right++;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		ThirdQuestion tq = new ThirdQuestion();
		int[] a = {0, 1, 0, 3, 12};
		a = tq.SortedArray(a);
		for (int k : a) {
			System.out.print(k);
		}
	}
}
