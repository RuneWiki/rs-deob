package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

public class DHParameters implements CipherParameters {

    public BigInteger g;

    public BigInteger p;

    public BigInteger q;

    public int m;

    public int l;

    public BigInteger j;

    public DHValidationParameters validation;

    public static final int DEFAULT_MINIMUM_LENGTH = 160;

    public DHParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3) {
        this(arg0, arg1, arg2, getDefaultMParam(arg3), arg3, (BigInteger) null, (DHValidationParameters) null);
    }

    public DHParameters(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, (BigInteger) null, 0);
    }

    public DHParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, 0);
    }

    public DHParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, DHValidationParameters arg4) {
        this(arg0, arg1, arg2, 160, 0, arg3, arg4);
    }

    public DHParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, (BigInteger) null, (DHValidationParameters) null);
    }

    public BigInteger getP() {
        return this.p;
    }

    public int getL() {
        return this.l;
    }

    public int aja() {
        return this.getP().hashCode() ^ this.getG().hashCode() ^ (this.getQ() == null ? 0 : this.getQ().hashCode());
    }

    public BigInteger getG() {
        return this.g;
    }

    public BigInteger getQ() {
        return this.q;
    }

    public int hashCode() {
        return this.getP().hashCode() ^ this.getG().hashCode() ^ (this.getQ() == null ? 0 : this.getQ().hashCode());
    }

    public int getM() {
        return this.m;
    }

    public int ajw() {
        return this.getP().hashCode() ^ this.getG().hashCode() ^ (this.getQ() == null ? 0 : this.getQ().hashCode());
    }

    public BigInteger getJ() {
        return this.j;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHParameters)) {
            return false;
        }
        DHParameters var2 = (DHParameters) arg0;
        if (this.getQ() == null) {
            if (var2.getQ() != null) {
                return false;
            }
        } else if (!this.getQ().equals(var2.getQ())) {
            return false;
        }
        return var2.getP().equals(this.p) && var2.getG().equals(this.g);
    }

    public DHParameters(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3, int arg4, BigInteger arg5, DHValidationParameters arg6) {
        if (arg4 != 0) {
            if (arg4 > arg0.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (arg4 < arg3) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        this.g = arg1;
        this.p = arg0;
        this.q = arg2;
        this.m = arg3;
        this.l = arg4;
        this.j = arg5;
        this.validation = arg6;
    }

    public boolean gy(Object arg0) {
        if (!(arg0 instanceof DHParameters)) {
            return false;
        }
        DHParameters var2 = (DHParameters) arg0;
        if (this.getQ() == null) {
            if (var2.getQ() != null) {
                return false;
            }
        } else if (!this.getQ().equals(var2.getQ())) {
            return false;
        }
        return var2.getP().equals(this.p) && var2.getG().equals(this.g);
    }

    public boolean gn(Object arg0) {
        if (!(arg0 instanceof DHParameters)) {
            return false;
        }
        DHParameters var2 = (DHParameters) arg0;
        if (this.getQ() == null) {
            if (var2.getQ() != null) {
                return false;
            }
        } else if (!this.getQ().equals(var2.getQ())) {
            return false;
        }
        return var2.getP().equals(this.p) && var2.getG().equals(this.g);
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public static int getDefaultMParam(int arg0) {
        if (arg0 == 0) {
            return 160;
        } else if (arg0 < 160) {
            return arg0;
        } else {
            return 160;
        }
    }

    public int ajf() {
        return this.getP().hashCode() ^ this.getG().hashCode() ^ (this.getQ() == null ? 0 : this.getQ().hashCode());
    }
}
