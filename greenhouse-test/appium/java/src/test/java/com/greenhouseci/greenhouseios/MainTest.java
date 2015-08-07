package com.greenhouseci.greenhouseios;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTest extends BaseTest {

	@Test
	public void testAdb() throws IOException, InterruptedException {
		throw new RuntimeException("Installed apps list\n " + execCommand("adb shell pm list packages -3"));
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
