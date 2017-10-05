package lab.bellkung.thenewkmitl;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void btnPressed(View view) {

        FragmentTransaction trans = getFragmentManager().beginTransaction();

        switch (view.getId()) {
            case R.id.feedBtn:
                trans.replace(R.id.mainFragment, new FeedFragment());
                trans.addToBackStack(null);
                trans.commit();
                break;
            case R.id.calendarBtn:
                trans.replace(R.id.mainFragment, new CalendarFragment());
                trans.addToBackStack(null);
                trans.commit();
                break;
            case R.id.mapBtn:
                trans.replace(R.id.mainFragment, new MapFragment());
                trans.addToBackStack(null);
                trans.commit();
                break;
            case R.id.otherBtn:
                trans.replace(R.id.mainFragment, new OtherFragment());
                trans.addToBackStack(null);
                trans.commit();
                break;
        }
    }
}
