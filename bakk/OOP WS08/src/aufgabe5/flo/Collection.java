package aufgabe5.flo;

/**
 * @author GEMEH, FLRAU, PAFAV
 * 
 * Collection Interface
 * 
 */
public interface Collection <A>{
	// adds an Element
	void add (A elem);
	// returns an Iterator
	Iterator<A> iterator();

}