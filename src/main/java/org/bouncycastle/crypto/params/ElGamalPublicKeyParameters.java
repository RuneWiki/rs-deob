package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    public BigInteger y;

    public boolean gi(Object arg0) {
        if ((arg0 instanceof ElGamalPublicKeyParameters)) {
            ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public BigInteger getY() {
        return this.y;
    }

    public ElGamalPublicKeyParameters(BigInteger arg0, ElGamalParameters arg1) {
        super(false, arg1);
        this.y = arg0;
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof ElGamalPublicKeyParameters)) {
            ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.y.hashCode() ^ super.hashCode();
    }

    public boolean gq(Object arg0) {
        if ((arg0 instanceof ElGamalPublicKeyParameters)) {
            ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public boolean gw(Object arg0) {
        if ((arg0 instanceof ElGamalPublicKeyParameters)) {
            ElGamalPublicKeyParameters var2 = (ElGamalPublicKeyParameters) arg0;
            return var2.getY().equals(this.y) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int alk() {
        return this.y.hashCode() ^ super.hashCode();
    }
}
