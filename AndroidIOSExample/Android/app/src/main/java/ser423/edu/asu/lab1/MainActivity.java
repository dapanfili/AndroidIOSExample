package ser423.edu.asu.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onStart(){
        super.onStart();

        PlaceDescription place = new PlaceDescription("{\"name\" : \"ASU-Poly\",\"description\" : \"Home of ASU's Software Engineering Programs\",\"category\" : \"School\",\"address-title\" : \"ASU Software Engineering\",\"address-street\" : \"7171 E Sonoran Arroyo Mall\nPeralta Hall 230\nMesa AZ 85212\",\"elevation\" : 1384.0,\"latitude\" : 33.306388,\"longitude\" : -111.679121 }");
        TextView name = findViewById(R.id.txtName);
        TextView desc = findViewById(R.id.txtDesc);
        TextView cat = findViewById(R.id.txtCat);
        TextView addr = findViewById(R.id.txtAdd);
        TextView elev = findViewById(R.id.txtEle);
        TextView lon = findViewById(R.id.txtLon);
        TextView lat = findViewById(R.id.txtLat);

        String addTitle = place.getAddressTitle();
        String addStreet = place.getAddressStreet();

        name.setText(place.getName());
        desc.setText(place.getDescription());
        cat.setText(place.getCategory());
        addr.setText(addTitle + addStreet);
        elev.setText(place.getElevation().toString());
        lat.setText(place.getLatitude().toString());
        lon.setText(place.getLongitude().toString());

    }
}
