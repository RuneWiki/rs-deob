package org.bouncycastle.util;

public interface StringList extends Iterable {

    String[] toStringArray();

    String get(int arg0);

    int size();

    boolean add(String arg0);

    int bb();

    int br();

    String[] toStringArray(int arg0, int arg1);

    int by();
}
