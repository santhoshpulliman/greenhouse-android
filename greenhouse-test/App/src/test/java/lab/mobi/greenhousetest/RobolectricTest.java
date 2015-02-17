package lab.mobi.greenhousetest.test;

import android.app.Activity;
import android.widget.TextView;

import lab.mobi.greenhousetest.R;
import lab.mobi.greenhousetest.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowTextView;

import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {

    @Test
    public void shouldDisplayHelloText() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textView = (TextView) activity.findViewById(R.id.text_hello);
        ShadowTextView shadowView = shadowOf(textView);
        assertThat(shadowView.innerText()).isEqualTo("Hello world!");
    }

    @Test
    public void shouldDisplayHelloTextFail() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        TextView textView = (TextView) activity.findViewById(R.id.text_hello);
        ShadowTextView shadowView = shadowOf(textView);
        assertThat(shadowView.innerText()).isEqualTo("Hello World!");
    }
}