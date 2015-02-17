package lab.mobi.greenhousetest;

import android.app.Activity;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowTextView;

import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {

    @Test
    public void shouldDisplayHelloText() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textView = (TextView) activity.findViewById(R.id.text_hello);
        ShadowTextView shadowView = shadowOf(textView);
        Assert.assertEquals("", "Hello world!", shadowView.innerText());
    }

    @Test
    public void shouldDisplayHelloTextFail() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textView = (TextView) activity.findViewById(R.id.text_hello);
        ShadowTextView shadowView = shadowOf(textView);
        Assert.assertEquals("", "Wrong text", shadowView.innerText());
    }
}