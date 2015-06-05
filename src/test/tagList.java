/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author Owenn
 *
 */
public class tagList {
	private ArrayList<String> existingTags;
	
	public tagList() {
		
	}
	
	public void createTag(String tag) {
		this.existingTags.add(tag);
	}
	
	public void deleteTag(String tag) {
		this.existingTags.remove(tag);
	}
	
	public boolean exists(String tag) {
		return this.existingTags.contains(tag);
	}
	
	public HashMap<String, Image> getImages(String tag) {
		HashMap<String, Image> ret = new HashMap<String, Image>();
		Iterator tagIterator = this.existingTags.listIterator();

		
		null;
	}
}
