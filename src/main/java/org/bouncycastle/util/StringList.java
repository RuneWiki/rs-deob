package org.bouncycastle.util;

public interface StringList extends Iterable {

    String[] toStringArray();

    String get(int arg0);

    int size();

    boolean add(String arg0);

    String[] toStringArray(int arg0, int arg1);
}
