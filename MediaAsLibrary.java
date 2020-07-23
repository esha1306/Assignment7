import java.util.List;
import java.util.ArrayList;
public class MediaAsLibrary {

	/*
	 * 1.Design a class that acts as a library for the following kinds of media:
	 * book, video, and newspaper. Provide one version of the class that uses
	 * generics and one that does not.
	 */
	
	private List<Media> resources = new ArrayList<Media>();
	
		public void addMedia(Media x) {
			resources.add(x);
		}
		
		public Media retriveLast() {
			int size = resources.size();
			if (size > 0) {
				return(Media)resources.get(size - 1);
			}
			return null;
		}
			
	/*
	 * public static void main(String[] args) {
	 * // TODO Auto-generated method stub
	 * 
	 * }
	 */	
}
interface Media{
}
interface Book extends Media{
}
interface Newspaper extends Media{ 
}
interface Video extends Media{
}
