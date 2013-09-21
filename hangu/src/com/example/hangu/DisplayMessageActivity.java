package com.example.hangu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {
	 String[] easylist = {"cat", "sun", "cup","ghost","pie","cow","banana",
		        "bug","book","jar",
		        "snake","light","tree",
		        "lips","apple","slide",
		        "socks","smile","swing",
		        "coat","shoe","water",
		        "heart","hat","ocean",
		        "kite","dog","mouth",
		        "milk","duck","eyes", "bird","boy",
		        "apple","person","girl",
		        "mouse","ball","house",
		        "star","nose","bed",
		        "whale","jacket","shirt",
		        "beach","egg",
		        "face","cookie","cheese",
		        "dance", "skip", "jumping", "jack",
		        "shark", "chicken", "alligator",
		        "chair", "robot", "head",
		        "smile", "baseball", "bird",
		        "happy", "scissors", "cheek",
		        "back", "jump", "drink",
		        "ice", "cream", "cone", "car", "airplane",
		        "clap", "circle", "pillow",
		        "pinch", "kick", "dog",
		        "basketball", "sleep", "camera",
		        "prayer", "elephant", "blink",
		        "doll", "spider", "point",
		        "kite", "homework", "ladybug",
		        "bed", "bird", "gum",
		        "book", "dress", "queen",
		        "puppy", "happy", "doctor"
		    };

	 
	 String[] hardlist = {
		        "vision","loiterer" ,"observatory",
		        "century", "kilogram",
		        "neutron", "stowaway", "psychologist",
		        "exponential", "aristocrat" ,"eureka",
		        "parody" ,"cartography",
		        "philosopher" ,"tinting", "overture",
		        "opaque", "ironic",
		        "zero", "landfill", "implode",
		        "czar" ,"armada" ,"crisp",
		        "stockholder", "inquisition", "mooch",
		        "gallop", "archaeologist" ,"blacksmith",
		        "addendum", "upgrade",
		        "acre", "twang", "mine",
		        "protestant", "brunette", "stout",
		        "quarantine", "tutor", "positive",
		        "champion", "pastry", "tournament",
		        "rainwater", "random",
		        "lyrics", "ice", "clue",
		         "slump", "ligament",
		         "siesta", "pomp",
		        "mine", "shaft", "dismantle", "weed", "killer",
		        "tachometer", "unemployed", "portfolio",
		        "pomp", "evolution", "apathy",
		        "advertise", "roundabout", "sandbox",
		        "conversation", "negotiate",
		        "silhouette", "aisle", "pendulum",
		        "retaliate", "mascot",
		        "shipwreck", "comfort", "zone",
		        "alphabetize", "application", "college",
		        "lifestyle", "level", "invitation",
		        "applesauce", "crumb", "loyalty",
		        "corduroy",  "shrink", "ray"};
	 
	 
     private final ArrayList<String> easyWords = new ArrayList<String>(Arrays.asList(easylist));
     
     
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);

	    // Get the message from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);

	    // Set the text view as the activity layout
	    setContentView(textView);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
