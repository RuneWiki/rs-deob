package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DSAPublicKeyParameters extends DSAKeyParameters {

    public BigInteger y;

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public static final BigInteger TWO = BigInteger.valueOf(2L);

    public BigInteger validate(BigInteger arg0, DSAParameters arg1) {
        if (arg1 == null) {
            return arg0;
        } else if (TWO.compareTo(arg0) <= 0 && arg1.getP().subtract(TWO).compareTo(arg0) >= 0 && ONE.equals(arg0.modPow(arg1.getQ(), arg1.getP()))) {
            return arg0;
        } else {
            throw new IllegalArgumentException("y value does not appear to be in correct group");
        }
    }

    public DSAPublicKeyParameters(BigInteger arg0, DSAParameters arg1) {
        super(false, arg1);
        this.y = this.validate(arg0, arg1);
    }

    public BigInteger getY() {
        return this.y;
    }
}
