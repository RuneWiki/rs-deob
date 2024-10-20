package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface DSA {

    boolean verifySignature(byte[] arg0, BigInteger arg1, BigInteger arg2);

    void init(boolean arg0, CipherParameters arg1);

    BigInteger[] generateSignature(byte[] arg0);
}
