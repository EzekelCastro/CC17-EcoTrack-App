package ai.codia.x.java.demo;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseMainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: Initialize UI components or layout here
    }

    @Override
    protected void onViewCreated() {
        // TODO: Set up views, adapters, or data binding here
    }

    /**
     * Converts dp to px based on device density.
     *
     * @param dpValue The value in dp to be converted.
     * @return The converted value in pixels.
     */
    private int dp2px(double dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}