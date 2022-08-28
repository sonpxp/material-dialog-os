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
	implementation 'com.github.sonpxp:material-dialog-os:1.0.0'
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

```
<style name="AppTheme" parent="Theme.MaterialComponents.Light.DarkActionBar">
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorAccent</item>
</style>

Your theme must contain parent = "Theme.MaterialComponents ..." like the example above to avoid unexpected errors when using.
```
