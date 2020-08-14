import java.util.ArrayList;

public class JavaForEatch {
	public static void main(String[] args) {
		ArrayList< String> games =  new ArrayList<>();
		games.add("Chese");
		games.add("Football");
		games.add("Cricket");
		games.add("Archeri");
		games.add("Baseball");
		
		games.forEach((n) -> System.out.println(n));
		
	}
	
 
}
