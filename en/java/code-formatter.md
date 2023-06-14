# Java code formatter

If your project doesn't have a consistent code style, your code will be less readable.
Using code formatters with the same settings is effective for unifying code style.
By dealing with it mechanically, there is no need to describe it in the coding convention, and only important matters can be described in the coding convention.

IDE such as IntelliJ IDEA and Eclipse provide code formatter functionality.
Code formatter defaults to code styles that are generally considered to be readable.
If customization is required, the customized settings can be exported and imported to share with project developers.

Code style can be unified in the project by the developer setting code formatter and executing code formatter after changing code.

## IntelliJ IDEA

### How to set up

Please refer to the following page for how to set code formatter.

- [Code style schemes | IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/configuring-code-style.html)

### How to Execute

Please refer to the following page for instructions on how to run code formatter.
It is recommended to set it to run automatically when saving to ensure that it will run.

[Reformat code | IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/reformat-and-rearrange-code.html)

### Import and export settings

You can share your settings across projects by exporting your code style settings.
Please refer to the next page for how to export and import.

[Import and export schemes | IntelliJ IDEA Documentation](https://www.jetbrains.com/help/idea/configuring-code-style.html#import-export-schemes)

## Eclipse

### How to set up

From Eclipse preferences, open `Java > Code Style > Formatter`.
By selecting the profile to be set and clicking the `Edit` button, you can set the code style for the selected profile.

For other details, please refer to the following pages.

- [Code Formatter Preferences | Eclipse Platform](https://help.eclipse.org/latest/topic/org.eclipse.jdt.doc.user/reference/preferences/java/codestyle/ref-preferences-formatter.htm?cp=1_4_4_0_2_2)

### How to Execute

If you select a file and execute it, you can execute it by opening the target file in the editor and pressing `Ctrl + Shift + F`.

If you want it to run automatically, open `Java > Editor > Save Actions` from Eclipse Preferences and select `Perform the selected actions on save` and `Format source code`.
This setting will automatically run code formatter on save.
To ensure that code formatter runs, we recommend setting it to run automatically on save.

For other details, please refer to the following pages.

- [Formatter | Eclipse Platform](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fref-java-editor-formatter.htm&cp%3D1_4_1_1)
- [Java Save Actions Preferences | Eclipse Platform](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Feditor%2Fref-preferences-save-actions.htm&cp%3D1_4_4_0_5_4)

### Import and export settings

You can share your settings across projects by exporting your code style settings.

From Eclipse preferences, open `Java > Code Style > Formatter`.
You can export the selected profile by selecting the profile to be set and clicking the `Export All` button.
To import, click the `Import` button and select the exported file.

For other details, please refer to the following pages.

- [Code Formatter Preferences | Eclipse Platform](https://help.eclipse.org/latest/topic/org.eclipse.jdt.doc.user/reference/preferences/java/codestyle/ref-preferences-formatter.htm?cp=1_4_4_0_2_2)
