package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {

    public BigInteger x;

    public int ajg() {
        return this.x.hashCode() ^ super.hashCode();
    }

    public int aju() {
        return this.x.hashCode() ^ super.hashCode();
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

    public boolean gp(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public boolean gf(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public BigInteger getX() {
        return this.x;
    }

    public DHPrivateKeyParameters(BigInteger arg0, DHParameters arg1) {
        super(true, arg1);
        this.x = arg0;
    }

    public boolean gi(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int ajl() {
        return this.x.hashCode() ^ super.hashCode();
    }
}
