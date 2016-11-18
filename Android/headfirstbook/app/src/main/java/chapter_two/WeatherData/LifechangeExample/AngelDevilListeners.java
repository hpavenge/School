package chapter_two.WeatherData.LifechangeExample;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.nbsm.headfirstbook.R;

public class AngelDevilListeners extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angel_devil_listeners);
        button = (Button) findViewById(R.id.button);
        // Not possible in Android thanks to using set instead of add
        button.setOnClickListener(new AngelListener());
        button.setOnClickListener(new DevilListener());
    }
}
