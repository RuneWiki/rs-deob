package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;

public class GLVTypeBParameters {

    public final BigInteger beta;

    public final BigInteger lambda;

    public final BigInteger v1A;

    public final BigInteger v1B;

    public final BigInteger v2A;

    public final BigInteger v2B;

    public final BigInteger g1;

    public final BigInteger g2;

    public final int bits;

    public BigInteger getG2() {
        return this.g2;
    }

    public GLVTypeBParameters(BigInteger arg0, BigInteger arg1, BigInteger[] arg2, BigInteger[] arg3, BigInteger arg4, BigInteger arg5, int arg6) {
        checkVector(arg2, "v1");
        checkVector(arg3, "v2");
        this.beta = arg0;
        this.lambda = arg1;
        this.v1A = arg2[0];
        this.v1B = arg2[1];
        this.v2A = arg3[0];
        this.v2B = arg3[1];
        this.g1 = arg4;
        this.g2 = arg5;
        this.bits = arg6;
    }

    public static void checkVector(BigInteger[] arg0, String arg1) {
        if (arg0 == null || arg0.length != 2 || arg0[0] == null || arg0[1] == null) {
            throw new IllegalArgumentException("'" + arg1 + "' must consist of exactly 2 (non-null) values");
        }
    }

    public BigInteger getV2A() {
        return this.v2A;
    }

    /**
     * @deprecated
     */
    public BigInteger[] getV1() {
        return new BigInteger[] { this.v1A, this.v1B };
    }

    public BigInteger getV1A() {
        return this.v1A;
    }

    public BigInteger getBeta() {
        return this.beta;
    }

    /**
     * @deprecated
     */
    public BigInteger[] getV2() {
        return new BigInteger[] { this.v2A, this.v2B };
    }

    public BigInteger getLambda() {
        return this.lambda;
    }

    public BigInteger getV2B() {
        return this.v2B;
    }

    public BigInteger getV1B() {
        return this.v1B;
    }

    public BigInteger getG1() {
        return this.g1;
    }

    public int getBits() {
        return this.bits;
    }
}
