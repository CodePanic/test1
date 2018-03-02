
public class Wetterlage {

	public static void main(String[] args) {
		
		final double temperature = Double.parseDouble(args[0]);
		final boolean precipitation = Boolean.parseBoolean(args[1]);
		
		aufgabeD(temperature, precipitation);
        aufgabeE(temperature, precipitation);
		
	}
	
	public static void aufgabeD(double temp, boolean prec) {
		System.out.println("D");
		if (prec) {
			if (temp > 0) {
				System.out.println("Sauwetter");
			}
			if (temp < 0 ) {
				System.out.println("Schlittenfahren");
			}
		}
		if(!prec) {
			if (temp > 0 && temp < 20) {
				System.out.println("Spazieren?");
			}
			if ( temp >= 20) {
				System.out.println("Schwimmen?");
				
			}
			if (temp < 0 ) {
				System.out.println("Gluehwein?");
			}
		}

		
	}
	
	public static void aufgabeE (double temp, boolean prec) {
		System.out.println("E");
		if (prec) {
			if (temp > 0) {
				System.out.println("Sauwetter");
			} else {
				System.out.println("Schlittenfahren");
			}
		}
		else {
			if (temp > 0 && temp < 20) {
				System.out.println("Spazieren?");
			}
			else if ( temp >= 20) {
				System.out.println("Schwimmen?");
			}
			else {
				System.out.println("Gluehwein?");
			}
			
		}
	}

}
