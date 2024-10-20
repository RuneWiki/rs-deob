package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class ECDomainParameters implements ECConstants {

    public ECCurve curve;

    public ECPoint G;

    public BigInteger n;

    public BigInteger h;

    public byte[] seed;

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECDomainParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, (byte[]) null);
    }

    public ECDomainParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3, byte[] arg4) {
        this.curve = arg0;
        this.G = arg1.normalize();
        this.n = arg2;
        this.h = arg3;
        this.seed = arg4;
    }

    public ECPoint getG() {
        return this.G;
    }

    public boolean be(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECDomainParameters)) {
            ECDomainParameters var2 = (ECDomainParameters) arg0;
            return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
        } else {
            return false;
        }
    }

    public BigInteger getN() {
        return this.n;
    }

    public BigInteger getH() {
        return this.h;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public ECDomainParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, ONE, (byte[]) null);
    }

    public int hashCode() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }

    public int ada() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECDomainParameters)) {
            ECDomainParameters var2 = (ECDomainParameters) arg0;
            return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
        } else {
            return false;
        }
    }

    public int ade() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * -1023324691;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }

    public int adf() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * -1778173678;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * -1775757260;
        return var6 ^ this.h.hashCode();
    }
}
