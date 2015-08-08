package lab.mobi.greenhousetest.test;

import android.test.AndroidTestCase;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class SuccessTest extends AndroidTestCase {

    @Test
    public void testAdb() throws IOException, InterruptedException {
        throw new RuntimeException("Installed apps list\n " + execCommand("adb shell pm list packages -3"));
    }

    @Test
    public void testEnvironment() throws IOException, InterruptedException {
        Map<String, String> env = System.getenv();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : env.entrySet()) {
            sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        throw new RuntimeException(sb.toString());
    }

    @Test
    public void testNoAdb() throws IOException, InterruptedException {
        throw new RuntimeException("Installed apps list\n " + execCommand("pm list packages -3"));
    }

    public String execCommand(String command) throws IOException {
        Process ps = Runtime.getRuntime().exec(command);
        StringBuilder builder = new StringBuilder();
        BufferedInputStream in = new BufferedInputStream(ps.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        try {
            while ((line = br.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return builder.toString();
    }
}
