# スタイルガイド

本リポジトリではJavaをはじめとする各言語のコーディング規約と、Checkstyle・SpotBugsといった静的解析ツールの導入ガイドを提供します。
いずれも[Nablarch](https://fintan.jp/page/1868/)をフレームワークとして使う前提で作成されていますが、シェルスクリプトスタイルガイドを除き大部分が他のフレームワークにも流用可能です。

- [Javaスタイルガイド](./java/README.md)
- [JavaScriptスタイルガイド](./js/README.md)
- [Jakarta Server Pagesスタイルガイド](./jsp/README.md)
- [SQLスタイルガイド](./sql/README.md)
- [シェルスクリプトスタイルガイド](./shell/README.md)

## ライセンス

本リポジトリ内のドキュメントは[Fintan コンテンツ 使用許諾条項](https://fintan.jp/page/295/#Fintanコンテンツ使用許諾条項)の下に提供されています。

また次に示すファイルやサンプルプロジェクトは [Apache License Version 2.0](https://www.apache.org/licenses/LICENSE-2.0.txt) の下に提供されています。

- `java/staticanalysis/checkstyle/checkstyle-example/` 以下に格納されているサンプルプロジェクト
- `java/staticanalysis/spotbugs/spotbugs-example/` 以下に格納されているサンプルプロジェクト

## スタイルガイドをカスタマイズする

本リポジトリではプロジェクトを進めるにあたってすぐに使えるよう過不足の無いガイドを提供しているつもりですが、プロジェクトによっては更に規約を追加したかったり、反対に不要な規約を削除したかったりするでしょう。また、一部のルールについては[Nablarch](https://fintan.jp/page/1868/)をフレームワークとして使う前提となっているため、他のフレームワークを使うために修正が必要になる場合もあるでしょう。

そのような場合は、本リポジトリをコピーして自由にカスタマイズをしてください。

プロジェクトがGitHubを使用している場合と、社内に立てたGitリポジトリを使用している場合に分けて、カスタマイズの方法を解説します。

### GitHubでforkしてカスタマイズする

プロジェクトがGitHubを使用している場合のカスタマイズ方法について解説します。

まず、本リポジトリをforkしてください。
本リポジトリの右上にforkと書かれたボタンがあるので、そちらを押してforkしてください。

forkして新しく作成されたリポジトリに対してカスタマイズを加えてください。

### プロジェクトが持つ社内のGitリポジトリへコピーしてカスタマイズする

プロジェクトがGitHubを使用しておらず、社内にGitリポジトリを立てている場合のカスタマイズ方法について解説します。
ここでは例としてプロジェクトがGitBucketを使用しているとします。

まず、社内のGitBucket上で空のリポジトリを作成してください。
ここでは`coding-standards`という名前で空のリポジトリを作成したとします。

次に、本リポジトリを`clone`してください。

```console
git clone https://github.com/Fintan-contents/coding-standards.git
```

`clone`して出来たローカルリポジトリへ、社内のGitBucketへ作成した空のリポジトリをリモートリポジトリとして追加します。

```console
git remote add intra http://localhost:8080/git/example-group/coding-standards.git
```

最後に、追加したリモートリポジトリへ`push`します。

```console
git push intra master
```

これで本リポジトリの内容が社内のGitBucket上に作成したリポジトリへコピーされました。
コピーしたリポジトリに対してカスタマイズを加えてください。

## バージョンについて

本スタイルガイドのバージョンは、メジャーバージョンとマイナーバージョンをピリオドで繋いだものにより表されます。
新たな言語のスタイルガイドを追加した場合や、Javaコーディング規約などに新たな項目が追加された場合にメジャーバージョンがインクリメントされます。
誤字脱字の修正や、意味はそのままに表現を変更した場合はマイナーバージョンがインクリメントされます。

変更履歴は[CHANGELOG.md](./CHANGELOG.md)を参照してください。
