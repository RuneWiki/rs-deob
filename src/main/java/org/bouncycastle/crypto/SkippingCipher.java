package org.bouncycastle.crypto;

public interface SkippingCipher {

    long getPosition();

    long seekTo(long arg0);

    long skip(long arg0);
}
