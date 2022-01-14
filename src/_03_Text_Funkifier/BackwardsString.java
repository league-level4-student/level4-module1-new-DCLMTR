package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;
    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	char[] output = new char[unfunkifiedText.length()];
    	char[] c = unfunkifiedText.toCharArray();
    	for(int i = 0; i < c.length; i++) {
    		output[i] = c[c.length-i-1];
    	}
        return String.valueOf(output);

    }
}
