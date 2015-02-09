<?php
// To run this test, install Sausage (see http://github.com/jlipps/sausage-bun
// to get the curl one-liner to run in this directory), then run:
//     vendor/bin/phpunit SimpleTest.php

require_once "vendor/autoload.php";
define("APP_PATH", realpath(dirname(__FILE__).'/../../../App/build/outputs/apk/App-greenhouseandroid-debug.apk'));
if (!APP_PATH) {
    die("App did not exist!");
}


class PackageTest extends Sauce\Sausage\WebDriverTestCase
{
    protected $numValues = array();

    public static $browsers = array(
        array(
            'local' => true,
            'port' => 4723,
            'browserName' => '',
            'desiredCapabilities' => array(
                'device' => 'Android',
                'deviceName' => 'Android',
                'platformVersion' => '4.3',
                'platform' => 'Android',
                'platformName' => 'Android',
                'app' => APP_PATH
            )
        )
    );

    public function testExampleFail()
    {
        $this->assertTrue(false);
    }

	public function testExampleSuccess()
    {
        $this->assertFalse(false);
    }
}
