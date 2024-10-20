package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPublicKeyParameters extends DHKeyParameters {

    public BigInteger y;

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public static final BigInteger TWO = BigInteger.valueOf(2L);

    public DHPublicKeyParameters(BigInteger arg0, DHParameters arg1) {
        super(false, arg1);
        this.y = this.validate(arg0, arg1);
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

    public BigInteger getY() {
        return this.y;
    }

    public int hashCode() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DHPublicKeyParameters)) {
            DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int ada() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public boolean be(Object arg0) {
        if ((arg0 instanceof DHPublicKeyParameters)) {
            DHPublicKeyParameters var2 = (DHPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int ade() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public int adf() {
        return this.y.hashCode() ^ super.hashCode();
    }
}
