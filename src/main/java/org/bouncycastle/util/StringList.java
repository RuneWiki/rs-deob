package org.bouncycastle.util;

public interface StringList extends Iterable {

    int ap();

    String get(int arg0);

    int size();

    String[] toStringArray();

    boolean add(String arg0);

    String[] toStringArray(int arg0, int arg1);
}
