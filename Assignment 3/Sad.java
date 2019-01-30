package assignment3;

public class Sad extends Moody {
	
	protected String getMood() {
		return "I feel sad today!";
	}
	
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");
	}
	
	public String toString() {
		return "Subject cries a lot";
	}

}
