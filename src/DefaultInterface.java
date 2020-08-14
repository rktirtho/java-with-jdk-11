
public interface DefaultInterface {
	int findInterest(int percent);
	
	default double vat(double percentage) {
		return 1000*percentage/100;
	}

}
