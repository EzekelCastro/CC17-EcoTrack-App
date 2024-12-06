package ai.codia.x.java.demo;

import android.os.Bundle;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onViewCreated() {
        // Add logic here if necessary, or remove this override if unused.
    }

    private int dp2px(double dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}