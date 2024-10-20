package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DSAParameters implements CipherParameters {

    public BigInteger g;

    public BigInteger p;

    public BigInteger q;

    public DSAValidationParameters validation;

    public BigInteger getG() {
        return this.g;
    }

    public DSAParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, DSAValidationParameters arg3) {
        this.g = arg2;
        this.p = arg0;
        this.q = arg1;
        this.validation = arg3;
    }

    public BigInteger getP() {
        return this.p;
    }

    public BigInteger getQ() {
        return this.q;
    }

    public boolean gq(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public boolean gm(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public boolean gi(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public boolean gk(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public DSAParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this.g = arg2;
        this.p = arg0;
        this.q = arg1;
    }

    public int ahh() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public int aht() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public int ahv() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }
}
