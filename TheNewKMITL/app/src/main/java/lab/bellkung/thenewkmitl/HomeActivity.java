package lab.bellkung.thenewkmitl;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FragmentTransaction trans = getFragmentManager().beginTransaction();
        trans.add(R.id.mainFragment, new FeedFragment(), "trans");
        trans.commit();

    }


    public void btnPressed(View view) {

        FragmentTransaction trans = getFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.feedBtn:
                trans.replace(R.id.mainFragment, new FeedFragment(), "trans");
                trans.commit();
                break;
            case R.id.calendarBtn:
                trans.replace(R.id.mainFragment, new CalendarFragment(), "trans");
                trans.commit();
                break;
            case R.id.mapBtn:
                MapFragment mapFragment = new MapFragment();
                trans.replace(R.id.mainFragment, mapFragment, "trans");
                trans.commit();

                break;
            case R.id.otherBtn:
                trans.replace(R.id.mainFragment, new OtherFragment(), "trans");
                trans.commit();
                break;
        }
    }
}
