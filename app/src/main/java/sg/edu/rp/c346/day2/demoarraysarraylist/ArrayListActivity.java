package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class ArrayListActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_list);

        //continue view the code in the worksheet
        this.setTitle("Fruits");
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        //fruits.add(3, "durian");

        // assign 2nd object to the variable theFruit
        String theFruit = fruits.get(1);

        // remove object
        fruits.remove(0);

        // change object
        fruits.set(fruits.size()-1, "dragon fruit");
        //fruits.set(3, "dragon fruit");

        tv = findViewById(R.id.textView2);

        String text = "Fruits\n";
        text += "=====\n";

        for (int i = 0; i<fruits.size(); i++) {
            text += fruits.get(i) + "\n";
        }

        tv.setText(text);

    }
}