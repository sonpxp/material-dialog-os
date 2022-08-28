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
  -> Example
```

```
AlertMaterialHelper.showYesNoAlert(
            this,
            "hello",
            "kiki",
            onAgreeCallback = onAgreeCallback,
            onCancelCallback = onCancelCallback
        )
```

```
private val onAgreeCallback: () -> Unit = {
	// do something
}

private val onCancelCallback: () -> Unit = {
	// do something
}
```
