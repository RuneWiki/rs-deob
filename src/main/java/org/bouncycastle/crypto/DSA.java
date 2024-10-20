package org.bouncycastle.crypto;

import java.math.BigInteger;

public interface DSA {

    BigInteger[] generateSignature(byte[] arg0);

    void init(boolean arg0, CipherParameters arg1);

    boolean verifySignature(byte[] arg0, BigInteger arg1, BigInteger arg2);
}
