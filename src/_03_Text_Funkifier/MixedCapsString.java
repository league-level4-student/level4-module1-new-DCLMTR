package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }
    public String funkifyText() {
    	char[] output = new char[unfunkifiedText.length()];
    	for(int i = 0; i < output.length; i++) {
    		if(i % 2 == 0) {
    			output[i] = unfunkifiedText.toLowerCase().charAt(i);
    		} else {
    			output[i] = unfunkifiedText.toUpperCase().charAt(i);
    		}
    	}
        return String.valueOf(output);
    }
}
