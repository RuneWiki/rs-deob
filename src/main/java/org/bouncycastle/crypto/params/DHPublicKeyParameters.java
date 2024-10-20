package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPublicKeyParameters extends DHKeyParameters {

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public static final BigInteger TWO = BigInteger.valueOf(2L);

    public BigInteger y;

    public int hashCode() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public int ajw() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public BigInteger validate(BigInteger arg0, DHParameters arg1) {
        if (arg0 == null) {
            throw new NullPointerException("y value cannot be null");
        } else if (arg0.compareTo(TWO) < 0 || arg0.compareTo(arg1.getP().subtract(TWO)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        } else if (arg1.getQ() == null) {
            return arg0;
        } else if (ONE.equals(arg0.modPow(arg1.getQ(), arg1.getP()))) {
            return arg0;
        } else {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DHPublicKeyParameters)) {
            DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public BigInteger getY() {
        return this.y;
    }

    public boolean gy(Object arg0) {
        if ((arg0 instanceof DHPublicKeyParameters)) {
            DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public boolean gn(Object arg0) {
        if ((arg0 instanceof DHPublicKeyParameters)) {
            DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public DHPublicKeyParameters(BigInteger arg0, DHParameters arg1) {
        super(false, arg1);
        this.y = this.validate(arg0, arg1);
    }

    public int aja() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public int ajf() {
        return this.y.hashCode() ^ super.hashCode();
    }
}
