package org.bouncycastle.util;

public interface StringList extends Iterable {

    int size();

    int bg();

    String[] toStringArray(int arg0, int arg1);

    String[] toStringArray();

    String get(int arg0);

    int bi();

    boolean add(String arg0);
}
