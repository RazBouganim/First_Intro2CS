public class Coins{
	public static void main(String[] args){
		int i = Integer.parseInt(args[0]);
		int div = i / 25;
		int modulo = i % 25;
		System.out.println("Use " + div + " quarter and " + modulo + " cents");
	}
}