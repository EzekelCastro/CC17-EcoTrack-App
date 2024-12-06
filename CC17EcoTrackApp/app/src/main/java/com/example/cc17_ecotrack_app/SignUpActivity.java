package ai.codia.x.java.demo;

import android.os.Bundle;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Replace with your actual layout
    }

    @Override
    protected void onViewCreated() {
        // Logic to be implemented in subclasses or future updates
    }

    private int dp2px(double dpValue) {
        final float scale = getResources() != null
                ? getResources().getDisplayMetrics().density
                : 1.0f;
        return (int) (dpValue * scale + 0.5f);
    }
}