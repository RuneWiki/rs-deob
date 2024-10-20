package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface BlockCipherPadding {

    String getPaddingName();

    int padCount(byte[] arg0) throws InvalidCipherTextException;

    int addPadding(byte[] arg0, int arg1);

    void init(SecureRandom arg0) throws IllegalArgumentException;
}
