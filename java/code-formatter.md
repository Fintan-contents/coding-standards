# Javaコードフォーマッター

プロジェクトでコードスタイルが統一されていなければ、コードの可読性が低下します。
コードスタイルを統一するためには、コードフォーマッターを使用することが効果的です。 

IntelliJ IDEAやEclipse等のIDEでは、コードフォーマッターの機能が提供されています。
コーディング規約に準拠したコードスタイルをコードフォーマッターに設定し、プロジェクトで共有することで、コードスタイルを統一することができます。

## IntelliJ IDEA

### 設定方法

コードフォーマッターを設定する方法については、次のページを参考にしてください。

- [コードスタイルスキーム | IntelliJ IDEA ドキュメント](https://pleiades.io/help/idea/configuring-code-style.html)

### 実行方法

コードフォーマッターを実行する方法については、次のページを参考にしてください。
確実に実行されるように、保存時に自動的に実行する設定にしておくことを推奨します。

- [コードの整形 | IntelliJ IDEA ドキュメント](https://pleiades.io/help/idea/reformat-and-rearrange-code.html)

### コードスタイル設定のインポートおよびエクスポート

コードスタイルの設定をエクスポートすることで、プロジェクトで設定内容を共有することができます。
エクスポートおよびインポートの方法については、次のページを参考にしてください。

- [インポートおよびエクスポートスキーム | IntelliJ IDEA ドキュメント](https://pleiades.io/help/idea/configuring-code-style.html#import-export-schemes)

また、IntelliJ IDEAでは、Eclipseで設定したコードスタイル定義をインポートすることもできます。
ただし、設定可能な内容が異なる部分もあるため、完全なマッピングでは無いことに注意してください。

## Eclipse

### 設定方法

Eclipseの設定から、`Java > Code Style > Formatter`を開いてください。
設定対象のプロファイルを選択し、`Edit`ボタンをクリックすることで、選択したプロファイルのコードスタイルを設定できます。

その他の詳細については、次のページを参考にしてください。

- [Code Formatter Preferences | Eclipse Platform](https://help.eclipse.org/latest/topic/org.eclipse.jdt.doc.user/reference/preferences/java/codestyle/ref-preferences-formatter.htm?cp=1_4_4_0_2_2)


### 実行方法

ファイルを選択して実行する場合は、エディタで対象のファイルを開いて、`Ctrl + Shift + F`を押すことで実行できます。

自動的に実行する場合は、Eclipseの設定から`Java > Editor > Save Actions`を開いて、`Perform the selected actions on save`および`Format source code`を選択することで、保存時にコードフォーマッターを実行するように設定できます。 確実に実行されるように、保存時に自動的に実行する設定にしておくことを推奨します。

その他の詳細については、次のページを参考にしてください。

- [Formatter | Eclipse Platform](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fref-java-editor-formatter.htm&cp%3D1_4_1_1)
- [Java Save Actions Preferences | Eclipse Platform](https://help.eclipse.org/latest/index.jsp?topic=%2Forg.eclipse.jdt.doc.user%2Freference%2Fpreferences%2Fjava%2Feditor%2Fref-preferences-save-actions.htm&cp%3D1_4_4_0_5_4)


### コードスタイル設定のインポートおよびエクスポート

コードスタイルの設定をエクスポートすることで、プロジェクトで設定内容を共有することができます。

Eclipseの設定から、`Java > Code Style > Formatter`を開いてください。
設定対象のプロファイルを選択し、`Export All`ボタンをクリックすることで、選択したプロファイルをエクスポートできます。
インポートする場合は、`Import`ボタンをクリックして、エクスポートしたファイルを選択してください。

その他の詳細については、次のページを参考にしてください。

- [Code Formatter Preferences | Eclipse Platform](https://help.eclipse.org/latest/topic/org.eclipse.jdt.doc.user/reference/preferences/java/codestyle/ref-preferences-formatter.htm?cp=1_4_4_0_2_2)
