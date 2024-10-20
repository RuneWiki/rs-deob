package org.bouncycastle.util;

public interface StringList extends Iterable {

    int an();

    int size();

    String get(int arg0);

    String[] toStringArray();

    String[] toStringArray(int arg0, int arg1);

    boolean add(String arg0);
}
