/*
 * Header example
 */
package com.example;

import java.util.List;
import java.util.List; // importが重複しています（NG）。

import java.lang.StringBuilder; // java.langにあるクラスをimportしています（NG）。

import com.example.VisibilityModifierExample; // 同じパッケージにあるクラスをimportしています（NG）。

/**
 * RedundantImportのコード例です。
 */
public class RedundantImportExample {

    private List<String> foos;
    private StringBuilder bar;
    private VisibilityModifierExample baz;
}
