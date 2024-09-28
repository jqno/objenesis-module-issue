package org.example.domain;

import org.objenesis.*;

public class Reproducer {
    public static void main(String[] args) {
        Objenesis objenesis = new ObjenesisStd();
        objenesis.newInstance(Reproducer.class);
    }
}
