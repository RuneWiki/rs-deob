package org.bouncycastle.util;

public interface StringList extends Iterable {

    int af();

    int ai();

    int size();

    boolean add(String arg0);

    String[] toStringArray(int arg0, int arg1);

    int aw();

    String get(int arg0);

    String[] toStringArray();
}
