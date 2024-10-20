package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DSAParameters implements CipherParameters {

    public BigInteger g;

    public BigInteger p;

    public BigInteger q;

    public DSAValidationParameters validation;

    public BigInteger getP() {
        return this.p;
    }

    public int ajs() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public DSAParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, DSAValidationParameters arg3) {
        this.g = arg2;
        this.p = arg0;
        this.q = arg1;
        this.validation = arg3;
    }

    public int hashCode() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public BigInteger getG() {
        return this.g;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public BigInteger getQ() {
        return this.q;
    }

    public boolean gg(Object arg0) {
        if ((arg0 instanceof DSAParameters)) {
            DSAParameters var2 = (DSAParameters) arg0;
            return var2.getP().equals(this.p) && var2.getQ().equals(this.q) && var2.getG().equals(this.g);
        } else {
            return false;
        }
    }

    public int ajz() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public int ajq() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public int ajf() {
        return this.getP().hashCode() ^ this.getQ().hashCode() ^ this.getG().hashCode();
    }

    public DSAParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this.g = arg2;
        this.p = arg0;
        this.q = arg1;
    }
}
