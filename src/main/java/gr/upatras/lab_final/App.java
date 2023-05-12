package gr.upatras.lab_final;

public class App 
{
    public static String sub(double a, double b) {
        return a<b?"NEGATIVE":"POSITIVE";
    }
	
    public static void main( String[] args )
    {
    	// made change
        System.out.println(App.sub(2.2, 3.2));
    }
}
