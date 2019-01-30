package assignment3;

public class Psychiatrist {

	public void examine(Moody moody) {
		System.out.println("How are you feeling today?");
		System.out.println(moody.getMood());
	}
	
	public void observe(Moody moody) {
		moody.expressFeelings();
	}
	
	
	public static void main(String[] args) {
		Psychiatrist psy = new Psychiatrist();
		Moody happy = new Happy();
		Moody sad = new Sad();
		
		psy.examine(happy);
		psy.observe(happy);
		
		psy.examine(sad);
		psy.observe(sad);
	}
	
}
