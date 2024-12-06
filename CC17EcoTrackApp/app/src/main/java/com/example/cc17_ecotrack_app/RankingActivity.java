package ai.codia.x.java.demo;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.JustifyContent;

public class MainActivity extends BaseMainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure this layout exists
    }

    @Override
    protected void onViewCreated() {
        // Example RecyclerView setup with FlexboxLayoutManager
        RecyclerView recyclerView = findViewById(R.id.recycler_view); // Ensure R.id.recycler_view exists
        if (recyclerView != null) {
            FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(this);
            layoutManager.setFlexDirection(FlexDirection.ROW);
            layoutManager.setJustifyContent(JustifyContent.CENTER);
            layoutManager.setAlignItems(AlignItems.CENTER);
            recyclerView.setLayoutManager(layoutManager);
        }
    }

    /**
     * Converts dp to pixels based on device density.
     *
     * @param dpValue Value in dp.
     * @return Corresponding value in pixels.
     */
    private int dp2px(double dpValue) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}