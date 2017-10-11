package rs.aleph.android.example12.activities;

import android.app.Activity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.model.Hrana;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;

    private Hrana[] foods = new Hrana[] {

            new Hrana("hamburger.jpg", "Hamburger", "description...", "category...", "ingridients...", 500, 300),
            new Hrana("pizza.jpg", "Pizza", "description...", "category...", "ingridients...", 400, 200),
            new Hrana("soup.jpg", "Soup", "description...", "category...", "ingridients...", 300, 100),
            new Hrana("spaghetti.jpg", "Spaghetti", "description...", "category...", "ingridients...", 450, 250),

    };



    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();
    }

    final int position = getIntent().getIntExtra("position", 0);


    TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(foods[position].getName());


    TextView tvDescription = (TextView) findViewById(R.id.tv_description);
        tvDescription.setText(foods[position].getDescription());


    ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
    InputStream is = null;
        try {
        is = getAssets().open(foods[position].getImage());
        Drawable drawable = Drawable.createFromStream(is, null);
        ivImage.setImageDrawable(drawable);
    } catch (IOException e) {
        e.printStackTrace();
    }


    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
}
