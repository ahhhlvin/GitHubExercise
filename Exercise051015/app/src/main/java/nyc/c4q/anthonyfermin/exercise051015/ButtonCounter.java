package nyc.c4q.anthonyfermin.exercise051015;

import android.view.View;

/**
 * Created by c4q-anthonyf on 5/10/15.
 */
public class ButtonCounter implements View.OnClickListener {

    private int clickNum = 0;

    @Override
    public void onClick(View view) {
        clickNum++;
    }
}
