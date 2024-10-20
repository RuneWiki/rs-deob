package org.bouncycastle.crypto;

public interface SkippingCipher {

    long skip(long arg0);

    long seekTo(long arg0);

    long getPosition();
}
