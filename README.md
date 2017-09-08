
# react-native-umeng-analytics

## Getting started

`$ npm install react-native-umeng-analytics --save`

### Mostly automatic installation

`$ react-native link react-native-umeng-analytics`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-umeng-analytics` and add `RNUmengAnalytics.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNUmengAnalytics.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import me.youchai.reactnative.RNUmengAnalyticsPackage;` to the imports at the top of the file
  - Add `new RNUmengAnalyticsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-umeng-analytics'
  	project(':react-native-umeng-analytics').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-umeng-analytics/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-umeng-analytics')
  	```


## Usage
```javascript
import RNUmengAnalytics from 'react-native-umeng-analytics';

// TODO: What to do with the module?
RNUmengAnalytics;
```
  