

public class ToyStoreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ToyStore sto = new ToyStore();
		System.out.println( sto );
		
		String[] s = "sorry bat sorry sorry sorry train train teddy teddy ball ball".split(" ");
		sto.loadToys( s );
		
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );	
		System.out.println( sto.getThatToy( "sorry" ) );	
		
		
	}

}
