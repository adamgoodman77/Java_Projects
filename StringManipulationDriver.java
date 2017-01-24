public class StringManipulationDriver{
	public static void main(String[] args){
		StringManipulation man = new StringManipulation(5);
		StringManipulation woman = new StringManipulation(10);
		System.out.println(man.speech());
		System.out.println(woman.openingStatement());
		System.out.println(man.exclamation());
		System.out.println(woman.curtResponse());
		System.out.println(man.finalComment());
	}
}
