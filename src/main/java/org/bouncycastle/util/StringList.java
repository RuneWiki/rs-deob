package org.bouncycastle.util;

public interface StringList extends Iterable {

    boolean add(String arg0);

    String get(int arg0);

    int size();

    String[] toStringArray();

    String[] toStringArray(int arg0, int arg1);

    int av();
}
