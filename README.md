an appium question
==================

This repo contains a small android app and a small failing test project that demonstrates a question I have: why does one test find a text field by ID and then subsequently fail to find a second text field by ID? Why does a similar test succeed in finding the second text field using name instead of ID? An earlier version of my question is at http://stackoverflow.com/questions/20379744/appium-android-webdriver-findelement-cannot-find-element-after-sendkeys

The app is in the app/ directory. It is a basic Android 4.3 app. MainActivity is exercised by the tests. The other activity is not used. You can import app as an existing Android project into the version of eclipse that's in the ADT bundle http://developer.android.com/sdk/installing/bundle.html. When you build app, it will be installed on the Android device (simulated or physical) that you select.

The tests are in the test/ directory which you can import as an existing Maven project into eclipse. You'll need to change one string in test/src/test/java/com/company/FindElementTest.java which is the path to the .apk file that's generated when you build app. 

There is one test suite with two test cases. For me, only one of the test cases passes. The test case named findById fails -- at least for me. Why? Perhaps there's something wrong with my setup. 

I've verified that I see the same issue with the latest three versions of appium: 0.12.3, 0.12.2, 0.12.0

I am on Mac OS X 10.8.5 and I used npm to install appium. I've reproduced my issue on a physical Android device and on a simulated device.
