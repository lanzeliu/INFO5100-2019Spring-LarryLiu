package assignment4;

public class SecondQuestion {

	public int OneDight(int num) {
		// Initialize helper sum:
		int sum = 0;
		// Special judge:
		if (num / 10 == 0) {
			return num;
		}
		// Judge:
		else {
			do {
				while (num != 0) {
					sum += num % 10;
					num /= 10;
				}
				num = sum;
				sum = 0;
			} while (num / 10 != 0);
		}
		return num;
	}
}
