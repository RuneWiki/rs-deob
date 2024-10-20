package org.bouncycastle.util;

public interface StringList extends Iterable {

    int al();

    String get(int arg0);

    boolean add(String arg0);

    String[] toStringArray();

    String[] toStringArray(int arg0, int arg1);

    int size();

    int ag();
}
