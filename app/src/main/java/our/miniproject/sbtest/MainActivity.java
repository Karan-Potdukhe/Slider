package our.miniproject.sbtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout linearLayout;
    SliderAdapter sliderAdapter;
    Button next, previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);

    }
}
