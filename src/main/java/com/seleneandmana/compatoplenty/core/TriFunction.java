package com.seleneandmana.compatoplenty.core;

@FunctionalInterface
public interface TriFunction<R, T, U, V> {
    R apply(T var1, U var2, V var3);
}
