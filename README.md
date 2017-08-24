[![e-mail](https://img.shields.io/badge/email-show9114@gmail.com-blue.svg)](mailto:show9114@gmail.com)     [![link](https://img.shields.io/badge/download-v1.0.1-green.svg)](https://bintray.com/pm-10/SimpleIndicator/simple-indicator)
# Simple Indicator

Android ViewPager Indicator

![simple-indicator-demo](http://i.imgur.com/qeWXqi5.gif)

## Use simple and easy


# Download
maven
```
  <dependency>
  <groupId>com.pm10</groupId>
  <artifactId>indicator</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
  </dependency>
```

gradle
```
compile 'com.pm10:indicator:1.0.1'
```


# Sample usage
Line Indicator
```xml
<com.pm10.library.LineIndicator
            android:id="@+id/line_indicator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:gap="4dp"
            app:lineHeight="6dp"
            app:lineWidth="12dp"
            app:strokeWidth="1dp"
            app:defaultColor="@color/white"
            app:selectedColor="@color/gray"
            app:strokeColor="@color/gray" />
```

Circle Indicator
```xml
<com.pm10.library.CircleIndicator
            android:id="@+id/circle_indicator"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:gap="4dp"
            app:radius="4dp"
            app:strokeWidth="1dp"
            app:defaultColor="@color/white"
            app:selectedColor="@color/gray"
            app:strokeColor="@color/gray"/>
```

setUpViewPager

```java
LineIndicator lineIndicator = (LineIndicator) findViewById(R.id.line_indicator);
        lineIndicator.setupWithViewPager(viewPager);

CircleIndicator circleIndicator = (CircleIndicator) findViewById(R.id.circle_indicator);
        circleIndicator.setupWithViewPager(viewPager);
```


#### Samples are in the package
