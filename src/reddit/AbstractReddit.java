package reddit;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class AbstractReddit {
		
	protected static boolean local;
	public boolean isLocal() {
		return local;
	}
	public void setLocal(boolean local) {
		this.local = local;
	}
	
	public static void main(String[] args) {
		StructuredReddit normal = StructuredReddit.getInstance();
		normal.setLocal(true);
		normal.getPosts("virginiatechd", SortMode.TOP, new StructuredPostListener() {

			@Override
			public void onSuccess(ArrayList<Object> posts) {
				System.out.println(posts);
			}
			
		});

		/*StructuredReddit snormal = StructuredReddit.getInstance();
		snormal.setLocal(true);
		snormal.getPosts("virginiatech", SortMode.TOP, new StructuredPostListener() {

			@Override
			public void onSuccess(ArrayList<Object> posts) {
				System.out.println(posts);
			}
			
		});*/
	}
}
