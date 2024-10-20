package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class RSAPrivateCrtKeyParameters extends RSAKeyParameters {

    public BigInteger e;

    public BigInteger p;

    public BigInteger q;

    public BigInteger dP;

    public BigInteger dQ;

    public BigInteger qInv;

    public BigInteger getDQ() {
        return this.dQ;
    }

    public RSAPrivateCrtKeyParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, BigInteger arg4, BigInteger arg5, BigInteger arg6, BigInteger arg7) {
        super(true, arg0, arg2);
        this.e = arg1;
        this.p = arg3;
        this.q = arg4;
        this.dP = arg5;
        this.dQ = arg6;
        this.qInv = arg7;
    }

    public BigInteger getPublicExponent() {
        return this.e;
    }

    public BigInteger getQ() {
        return this.q;
    }

    public BigInteger getDP() {
        return this.dP;
    }

    public BigInteger getQInv() {
        return this.qInv;
    }

    public BigInteger getP() {
        return this.p;
    }
}
