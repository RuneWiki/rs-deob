package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class ElGamalParameters implements CipherParameters {

    public BigInteger g;

    public BigInteger p;

    public int l;

    public ElGamalParameters(BigInteger arg0, BigInteger arg1, int arg2) {
        this.g = arg1;
        this.p = arg0;
        this.l = arg2;
    }

    public boolean gi(Object arg0) {
        if ((arg0 instanceof ElGamalParameters)) {
            ElGamalParameters var2 = (ElGamalParameters) arg0;
            return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
        } else {
            return false;
        }
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getG() {
        return this.g;
    }

    public int getL() {
        return this.l;
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof ElGamalParameters)) {
            ElGamalParameters var2 = (ElGamalParameters) arg0;
            return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
        } else {
            return false;
        }
    }

    public int alk() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public int hashCode() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public boolean gw(Object arg0) {
        if ((arg0 instanceof ElGamalParameters)) {
            ElGamalParameters var2 = (ElGamalParameters) arg0;
            return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
        } else {
            return false;
        }
    }

    public boolean gq(Object arg0) {
        if ((arg0 instanceof ElGamalParameters)) {
            ElGamalParameters var2 = (ElGamalParameters) arg0;
            return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
        } else {
            return false;
        }
    }

    public ElGamalParameters(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, 0);
    }
}
