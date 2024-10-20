package org.bouncycastle.crypto.params;

import java.math.BigInteger;

public class DHPrivateKeyParameters extends DHKeyParameters {

    public BigInteger x;

    public int acn() {
        return this.x.hashCode() ^ super.hashCode();
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

    public boolean bs(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public int ach() {
        return this.x.hashCode() ^ super.hashCode();
    }

    public boolean bh(Object arg0) {
        if ((arg0 instanceof DHPrivateKeyParameters)) {
            DHPrivateKeyParameters var2 = (DHPrivateKeyParameters) arg0;
            return var2.getX().equals(this.x) && super.equals(arg0);
        } else {
            return false;
        }
    }

    public DHPrivateKeyParameters(BigInteger arg0, DHParameters arg1) {
        super(true, arg1);
        this.x = arg0;
    }

    public int acy() {
        return this.x.hashCode() ^ super.hashCode();
    }
}
