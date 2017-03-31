# Stock Hawk
You will productionize an app, taking it from a functional state to a production-ready state. This will involve finding and handling error cases, adding accessibility features, allowing for localization, adding a widget, and adding a library.
## User Feedback for Stock Hawk:

* Right now I can't use this app with my screen reader. My friends love it, so I would love to download it, but the buttons don't tell my screen reader what they do.
* We need to prepare Stock Hawk for the Egypt release. Make sure our translators know what to change and make sure the Arabic script will format nicely.
* Stock Hawk allows me to track the current price of stocks, but to track their prices over time, I need to use an external program. It would be wonderful if you could show more detail on a stock, including its price over time.
* I use a lot of widgets on my Android device, and I would love to have a widget that displays my stock quotes on my home screen.
* I found a bug in your app. Right now when I search for a stock quote that doesn't exist, the app crashes.
* When I opened this app for the first time without a network connection, it was a confusing blank screen. I would love a message that tells me why the screen is blank or whether my stock quotes are out of date.

# Rubric

### Required Components

* Each stock quote on the main screen is clickable and leads to a new screen which graphs the stock’s value over time.
* Stock Hawk does not crash when a user searches for a non-existent stock.
* Stock Hawk Stocks can be displayed in a collection widget.
* Stock Hawk app has content descriptions for all buttons.
* Stock Hawk app supports layout mirroring using both the LTR attribute and the start/end tags.
* Strings are all included in the strings.xml file and untranslatable strings have a translatable tag marked to false.
* Stock Hawk displays a default text on screen when offline, to inform users that the list is empty or out of date.

### Required Behavior

* App conforms to common standards found in the Android Nanodegree General Project Guidelines


##Libraries Used
MPAndroidChart - https://github.com/PhilJay/MPAndroidChart <br>
Butterknife - https://github.com/JakeWharton/butterknife <br>
OkHTTP - https://github.com/square/okhttp <br>
openCSV-http://opencsv.sourceforge.net/<br>
Thanks to Yahoo Finance for providing the data.

## Android Developer Nanodegree
[![udacity][1]][2]

[1]: ../master/art/nanodegree-logo.png
[2]: https://www.udacity.com/course/android-developer-nanodegree--nd801
