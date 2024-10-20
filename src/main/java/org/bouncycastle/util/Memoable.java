package org.bouncycastle.util;

public interface Memoable {

    void reset(Memoable arg0);

    Memoable copy();
}
