package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface BlockCipherPadding {

    int padCount(byte[] arg0) throws InvalidCipherTextException;

    void init(SecureRandom arg0) throws IllegalArgumentException;

    int addPadding(byte[] arg0, int arg1);

    String getPaddingName();
}
