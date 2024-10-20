package org.bouncycastle.math.ec;

import java.math.BigInteger;

public abstract class AbstractECMultiplier implements ECMultiplier {

    public ECPoint multiply(ECPoint arg0, BigInteger arg1) {
        int var3 = arg1.signum();
        if (var3 == 0 || arg0.isInfinity()) {
            return arg0.getCurve().getInfinity();
        } else {
            ECPoint var4 = this.multiplyPositive(arg0, arg1.abs());
            ECPoint var5 = var3 > 0 ? var4 : var4.negate();
            return ECAlgorithms.validatePoint(var5);
        }
    }

    public abstract ECPoint multiplyPositive(ECPoint arg0, BigInteger arg1);
}
