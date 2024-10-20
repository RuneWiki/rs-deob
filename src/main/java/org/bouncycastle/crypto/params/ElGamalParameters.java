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

    public BigInteger getG() {
        return this.g;
    }

    public BigInteger getP() {
        return this.p;
    }

    public ElGamalParameters(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, 0);
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

    public boolean gg(Object arg0) {
        if ((arg0 instanceof ElGamalParameters)) {
            ElGamalParameters var2 = (ElGamalParameters) arg0;
            return var2.getP().equals(this.p) && var2.getG().equals(this.g) && var2.getL() == this.l;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public int ajs() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public int ajq() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public int ajf() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }

    public int ajz() {
        return (this.getP().hashCode() ^ this.getG().hashCode()) + this.l;
    }
}
