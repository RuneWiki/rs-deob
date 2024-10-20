package org.bouncycastle.util;

public interface StringList extends Iterable {

    int am();

    String get(int arg0);

    int size();

    String[] toStringArray();

    String[] toStringArray(int arg0, int arg1);

    int an();

    boolean add(String arg0);
}
