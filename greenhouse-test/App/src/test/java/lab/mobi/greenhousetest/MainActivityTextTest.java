package lab.mobi.greenhousetest;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;
import android.util.Log;

import junit.framework.Assert;

import lab.mobi.greenhousetest.MainActivity;
import lab.mobi.greenhousetest.R;

public class MainActivityTextTest extends ActivityUnitTestCase<MainActivity> {

    private Intent launchIntent;

    public MainActivityTextTest() {
        super(MainActivity.class);
    }

    @SmallTest
    public void testHelloWorldTextFail() throws Exception {
        launchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(launchIntent, null, null);
        TextView textView = (TextView) getActivity().findViewById(R.id.text_main);
        Log.e("Test", "TextView text: " + textView.getText());
        assertEquals("Unexpected hello world text", "Hello World!", textView.getText());
        assertFalse(String.valueOf(textView.getText()), true);
        Assert.assertFalse(true);
    }

    @SmallTest
    public void testHelloWorldText() throws Exception {
        launchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(launchIntent, null, null);
        TextView textView = (TextView) getActivity().findViewById(R.id.text_main);
        assertEquals("Unexpected hello world text", "Hello, MainActivity!", textView.getText());
    }
}