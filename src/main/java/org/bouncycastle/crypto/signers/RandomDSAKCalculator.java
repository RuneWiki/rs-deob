package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RandomDSAKCalculator implements DSAKCalculator {

    public static final BigInteger ZERO = BigInteger.valueOf(0L);

    public BigInteger q;

    public SecureRandom random;

    public void init(BigInteger arg0, BigInteger arg1, byte[] arg2) {
        throw new IllegalStateException("Operation not supported");
    }

    public void init(BigInteger arg0, SecureRandom arg1) {
        this.q = arg0;
        this.random = arg1;
    }

    public boolean isDeterministic() {
        return false;
    }

    public BigInteger nextK() {
        int var1 = this.q.bitLength();
        BigInteger var2;
        do {
            do {
                var2 = new BigInteger(var1, this.random);
            } while (var2.equals(ZERO));
        } while (var2.compareTo(this.q) >= 0);
        return var2;
    }
}
