package _06_Hospital;

public class Patient {
	private boolean feelsCaredFor = false;
	public void checkPulse() {
		feelsCaredFor = true;
	}
	public boolean isFeelsCaredFor() {
		return feelsCaredFor;
	}
}
