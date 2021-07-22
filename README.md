>Step 1. Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
>Step 2. Add the dependency
```
dependencies {
		implementation 'com.github.sonpxp:myDialog:1.0.0'
	}
  ```
 
  ```
  -> AlertMaterialHelper.callDialogCustom
