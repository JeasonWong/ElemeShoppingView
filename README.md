## What's ElemeShoppingView ?
A cool shopping cart effect.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ElemeShoppingView-green.svg?style=true)](https://android-arsenal.com/details/1/3946)

## Demo
![Markdown](http://i2.piimg.com/1070/02257f9316bbdcb6.gif)

##Attributes

|name|format|description|
|:---:|:---:|:---:|
| sv_bg_color | color |set shopping button background color
| sv_text | string |set shopping text
| sv_text_size | dimension |set shopping text size
| sv_duration | integer |set animator duration

## Import

Step 1. Add it in your project's build.gradle at the end of repositories:

```gradle
repositories {
    maven {
        url 'https://dl.bintray.com/wangyuwei/maven'
    }
}
```

Step 2. Add the dependency:

```gradle
dependencies {
  compile 'me.wangyuwei:shoppoing:1.0.3'
}
```

## Usage
#### Define your banner under your xml  :

```xml
     <me.wangyuwei.shoppoing.ShoppingView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        app:sv_bg_color="#D8BFD8"
        app:sv_text="TF-BOYS"
        app:sv_text_size="18sp" />
```

#### setOnShoppingClickListener under your java  :

```java
     mSv1.setOnShoppingClickListener(new ShoppingView.ShoppingClickListener() {
            @Override
            public void onAddClick(int num) {
                Log.d("@=>", "add.......num=> " + num);
            }

            @Override
            public void onMinusClick(int num) {
                Log.d("@=>", "minus.......num=> " + num);
            }
        });
```



##**Lincense**

```lincense
Copyright [2016] [JeasonWong of copyright owner]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


