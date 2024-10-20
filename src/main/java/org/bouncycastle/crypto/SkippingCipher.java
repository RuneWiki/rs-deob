package org.bouncycastle.crypto;

public interface SkippingCipher {

    long seekTo(long arg0);

    long getPosition();

    long skip(long arg0);
}
