package org.bouncycastle.util;

public interface StringList extends Iterable {

    int av();

    String get(int arg0);

    int size();

    int at();

    String[] toStringArray(int arg0, int arg1);

    boolean add(String arg0);

    String[] toStringArray();
}
