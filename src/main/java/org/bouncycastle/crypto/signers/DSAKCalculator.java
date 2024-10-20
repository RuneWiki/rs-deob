package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

public interface DSAKCalculator {

    void init(BigInteger arg0, SecureRandom arg1);

    void init(BigInteger arg0, BigInteger arg1, byte[] arg2);

    boolean isDeterministic();

    BigInteger nextK();
}
