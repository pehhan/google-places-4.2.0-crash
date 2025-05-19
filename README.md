# google-places-4.2.0-crash

Note that the crash ONLY happens when running the app built for release, NOT for debug.

It's a combination of 3 things that causes the crash:

* Google Places version 4.2.0 (if downgrading to 4.1.0 it's fine)
* isMinifyEnabled = true (if set to false it's fine)
* isCoreLibraryDesugaringEnabled = true (if set to false it's fine)
