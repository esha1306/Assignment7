import java.util.*;
public class MediaAsLibGen <E extends Media> {
	private List<E> resources = new ArrayList<E>();
	public void addMedia(E x) {
		resources.add(x);
	}
	public E retriveLast() {
		int size = resources.size();
		if(size > 0) {
			return resources.get(size - 1);
		}
		return null;
		
	}
}
