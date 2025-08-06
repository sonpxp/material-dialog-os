# 📦 Material Dialog OS

A lightweight Android library to show beautiful, customizable Material dialogs with minimal setup.

---

## 🛠 Installation

### Step 1. Add JitPack repository to your root `build.gradle`

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2. Add the dependency to your app-level `build.gradle`

```groovy
dependencies {
    implementation 'com.github.sonpxp:material-dialog-os:$version'
}
```

> 🔔 Replace `$version` with the latest version from [JitPack](https://jitpack.io/#sonpxp/material-dialog-os).

---

## 🚀 Usage

### ✅ Basic Alert Dialog

You can show a simple **Yes/No** confirmation dialog like this:

```kotlin
AlertMaterialHelper.showYesNoAlert(
    context = this,
    title = "Hello",
    message = "Do you want to continue?",
    onAgreeCallback = onAgreeCallback,
    onCancelCallback = onCancelCallback
)

private val onAgreeCallback: () -> Unit = {
    // Handle agree action
}

private val onCancelCallback: () -> Unit = {
    // Handle cancel action
}
```

---

### 📘 Other Dialogs

```kotlin
// Example method
AlertMaterialHelper.name_method()
```

> Replace `name_method()` with the actual method name provided by the library.

---

## 🎨 Theme Requirement

Your app **must** use a `MaterialComponents` theme to avoid unexpected errors.

Example:

```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.DarkActionBar">
    <item name="colorPrimary">@color/colorPrimary</item>
    <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
    <item name="colorAccent">@color/colorAccent</item>
</style>
```

> ✅ Make sure your theme extends `Theme.MaterialComponents.*`.

---

## 📄 License

This library is released under the [MIT License](LICENSE).

---

## 🙌 Credits

Developed and maintained by [@sonpxp](https://github.com/sonpxp). Contributions and feedback are welcome!
