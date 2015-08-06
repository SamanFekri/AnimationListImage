AnimationList Show In Android
===================
## Description
this a View that make you easily use animationlist in android.
easy to use.
## Usage
* **copy into src**
 * AnimationListImage.java
* **how use in xml**
```
    <packageName.animationlist.AnimationListImage
        android:id="@+id/animationListImage1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
```
* **how use in java code**
 * if you want show animationlist in background
 ```
 		AnimationListImage animationListImage = (AnimationListImage) findViewById(R.id.animationListImage1);
		animationListImage.showAnimationListInBackground(R.drawable.load);
 ```
 * if you want show animationList as image
 ```
 		AnimationListImage animationListImage = (AnimationListImage) findViewById(R.id.animationListImage1);
		animationListImage.showAnimationListAsImage(R.drawable.load);
 ```
 

## License
> Copyright SKings (c) 2015

> AnimationListImage released under GPL3
