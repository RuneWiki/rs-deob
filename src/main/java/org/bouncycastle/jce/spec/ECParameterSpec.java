package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

public class ECParameterSpec implements AlgorithmParameterSpec {

    public ECCurve curve;

    public ECPoint G;

    public BigInteger n;

    public BigInteger h;

    public byte[] seed;

    public ECCurve getCurve() {
        return this.curve;
    }

    public BigInteger getN() {
        return this.n;
    }

    public ECParameterSpec(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3) {
        this.curve = arg0;
        this.G = arg1.normalize();
        this.n = arg2;
        this.h = arg3;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3, byte[] arg4) {
        this.curve = arg0;
        this.G = arg1.normalize();
        this.n = arg2;
        this.h = arg3;
        this.seed = arg4;
    }

    public ECPoint getG() {
        return this.G;
    }

    public int ade() {
        return this.getCurve().hashCode() ^ this.getG().hashCode();
    }

    public BigInteger getH() {
        return this.h;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public ECParameterSpec(ECCurve arg0, ECPoint arg1, BigInteger arg2) {
        this.curve = arg0;
        this.G = arg1.normalize();
        this.n = arg2;
        this.h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public int hashCode() {
        return this.getCurve().hashCode() ^ this.getG().hashCode();
    }

    public boolean be(Object arg0) {
        if ((arg0 instanceof ECParameterSpec)) {
            ECParameterSpec var2 = (ECParameterSpec) arg0;
            return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
        } else {
            return false;
        }
    }

    public int adf() {
        return this.getCurve().hashCode() ^ this.getG().hashCode();
    }

    public boolean equals(Object arg0) {
        if ((arg0 instanceof ECParameterSpec)) {
            ECParameterSpec var2 = (ECParameterSpec) arg0;
            return this.getCurve().equals(var2.getCurve()) && this.getG().equals(var2.getG());
        } else {
            return false;
        }
    }

    public int ada() {
        return this.getCurve().hashCode() ^ this.getG().hashCode();
    }
}
