package plugins;

import play.Plugin;

public class SamplePlugin extends Plugin {

	private int a = 0;
	
	public void onStart() {
		super.onStart();
		
		a = 1;
	}
	
	public int getInteger() {
		return a;
	}
	
}
