/*
 * Header example
 */
package com.example;

/**
 * JavadocMethodのコード例です。
 */
public class JavadocMethodExample {

    /**
     * 与えられた数を2倍にします。
     *
     * Javadocコメントはありますが、@param、@returnがありません（NG）。
     *
     * メソッドにthrows宣言がなくても非チェック例外の@paramsタグを記載できます
     * （Checkstyle NGとなりません）
     *
     * @throws IllegalArgumentException 引数が負数の場合
     */
    public int noParamAndReturnTag(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        return number * 2;
    }
}
