package ai.codia.x.java.demo;

import android.os.Bundle;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Initialize view elements or setup logic here if needed
    }

    @Override
    protected void onViewCreated() {
        // Any additional view setup or logic can go here
    }

    private int convertDpToPx(double dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}