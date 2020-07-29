
# react-native-base64-on-steroids

## Getting started

`$ npm install react-native-base64-on-steroids --save`

### Mostly automatic installation

`$ react-native link react-native-base64-on-steroids`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import steroids.on.base64.RNBase64OnSteroidsPackage;` to the imports at the top of the file
  - Add `new RNBase64OnSteroidsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-base64-on-steroids'
  	project(':react-native-base64-on-steroids').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-base64-on-steroids/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-base64-on-steroids')
  	```


## Usage
```javascript
import RNBase64OnSteroids from 'react-native-base64-on-steroids';

// TODO: What to do with the module?
RNBase64OnSteroids;
```
  