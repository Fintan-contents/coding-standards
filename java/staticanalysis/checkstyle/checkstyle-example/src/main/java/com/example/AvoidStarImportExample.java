/*
 * Header example
 */
package com.example;

// 実際はListとArrayListしか使っていないのにjava.utilパッケージをまるごとimportしています（NG）。
import java.util.*;

/**
 * AvoidStarImportのコード例です。
 */
public class AvoidStarImportExample {

    /**
     * AvoidStarImportのコード例です。
     */
    public void example() {
        List<String> list = new ArrayList<>();
    }
}
