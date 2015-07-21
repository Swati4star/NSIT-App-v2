package nsit.app.com.nsitapp;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by Sidharth Patro on 21-Jul-15.
 */
public class ButtonAnimation {
    public void animateButton(View v, Context context){
        Animation pressAnim = AnimationUtils.loadAnimation(context, R.anim.button_press_anim);
        v.startAnimation(pressAnim);
    }
}
