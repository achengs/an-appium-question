an-appium-question
==================

This repo contains a small android app and a small failing test project that demonstrates a question I have.

The app is in the app/ directory. It is a basic Android 4.3 app. MainActivity is exercised by the tests. The other activity is not used.

The tests are in the test/ directory. There is one test suite with two test cases. For me, only one of the test cases passes. The test case named findById fails -- at least for me. Why? Perhaps there's something wrong with my setup. 

I've verified that I see the same issue with the latest three versions of appium: 0.12.3, 0.12.2, 0.12.0

I am on Mac OS X 10.8.5 and I used npm to install appium. I've reproduced my issue on a physical Android device and on a simulated device.
