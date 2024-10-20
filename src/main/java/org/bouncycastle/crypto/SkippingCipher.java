package org.bouncycastle.crypto;

public interface SkippingCipher {

    long getPosition();

    long skip(long arg0);

    long seekTo(long arg0);
}
