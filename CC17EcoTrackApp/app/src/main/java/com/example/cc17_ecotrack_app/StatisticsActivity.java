package ai.codia.x.java.demo;

import android.os.Bundle;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    // onViewCreated method can be removed or implemented as needed
    @Override
    protected void onViewCreated() {
        // Add implementation if needed
    }

    // Converts dp value to px based on screen density
    private int dp2px(double dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}