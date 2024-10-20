package org.bouncycastle.crypto.paddings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.InvalidCipherTextException;

public interface BlockCipherPadding {

    String getPaddingName();

    int addPadding(byte[] arg0, int arg1);

    int padCount(byte[] arg0) throws InvalidCipherTextException;

    void init(SecureRandom arg0) throws IllegalArgumentException;
}
