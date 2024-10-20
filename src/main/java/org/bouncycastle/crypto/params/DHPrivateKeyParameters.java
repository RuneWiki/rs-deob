package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {

    public BigInteger x;

    public DHPrivateKeyParameters(BigInteger arg0, DHParameters arg1) {
        super(true, arg1);
        this.x = arg0;
    }

    public BigInteger getX() {
        return this.x;
    }

    public int hashCode() {
        return this.x.hashCode() ^ super.hashCode();
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public boolean bw(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int afj() {
        return this.x.hashCode() ^ super.hashCode();
    }

    public boolean bv(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int afu() {
        return this.x.hashCode() ^ super.hashCode();
    }

    public boolean bc(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }
}
