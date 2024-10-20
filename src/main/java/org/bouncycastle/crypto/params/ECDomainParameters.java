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

    public ECDomainParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, ONE, (byte[]) null);
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

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public ECPoint getG() {
        return this.G;
    }

    public BigInteger getN() {
        return this.n;
    }

    public BigInteger getH() {
        return this.h;
    }

    public ECCurve getCurve() {
        return this.curve;
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

    public int amg() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }

    public boolean gj(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ECDomainParameters)) {
            ECDomainParameters var2 = (ECDomainParameters) arg0;
            return this.curve.equals(var2.curve) && this.G.equals(var2.G) && this.n.equals(var2.n) && this.h.equals(var2.h);
        } else {
            return false;
        }
    }

    public int ams() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }

    public int amf() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 385052893;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * -1554791823;
        return var6 ^ this.h.hashCode();
    }

    public int amb() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 37;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * 37;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
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

    public int aml() {
        int var1 = this.curve.hashCode();
        int var2 = var1 * 171146971;
        int var3 = var2 ^ this.G.hashCode();
        int var4 = var3 * -1373403944;
        int var5 = var4 ^ this.n.hashCode();
        int var6 = var5 * 37;
        return var6 ^ this.h.hashCode();
    }
}
