package com.greenhouseci.greenhouseios;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class MainTest extends BaseTest {

	@Test
	public void testFindViewSuccess() {
		WebElement textView = this.driver.findElementByName("text_hello_world");
		Assert.assertNotNull(textView);
		Assert.assertEquals(textView.getText(), "Hello world!");
	}

	@Test
	public void testFindViewFail() {
		WebElement textView = this.driver.findElementByName("text_hello_world");
		Assert.assertNotNull(textView);
		Assert.assertEquals(textView.getText(), "Hello world");
	}

	@Test
	public void testButtonClickSuccess() {
		WebElement textView = this.driver.findElementByName("text_hello_world");
		Assert.assertNotNull(textView);

		WebElement button = this.driver.findElementByName("button_change_text");
		Assert.assertNotNull(button);
		button.click();

		Assert.assertEquals(textView.getText(), "Changed hello world");
	}
}
