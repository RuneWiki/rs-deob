package org.bouncycastle.util;

public interface StringList extends Iterable {

    String[] toStringArray(int arg0, int arg1);

    String get(int arg0);

    int size();

    String[] toStringArray();

    boolean add(String arg0);

    int bv();

    int bw();

    int bm();

    int bt();

    int bk();
}
