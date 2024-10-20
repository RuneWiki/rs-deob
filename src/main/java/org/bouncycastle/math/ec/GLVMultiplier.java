package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;

public class GLVMultiplier extends AbstractECMultiplier {

    public final ECCurve curve;

    public final GLVEndomorphism glvEndomorphism;

    public ECPoint multiplyPositive(ECPoint arg0, BigInteger arg1) {
        if (!this.curve.equals(arg0.getCurve())) {
            throw new IllegalStateException();
        }
        BigInteger var3 = arg0.getCurve().getOrder();
        BigInteger[] var4 = this.glvEndomorphism.decomposeScalar(arg1.mod(var3));
        BigInteger var5 = var4[0];
        BigInteger var6 = var4[1];
        ECPointMap var7 = this.glvEndomorphism.getPointMap();
        return this.glvEndomorphism.hasEfficientPointMap() ? ECAlgorithms.implShamirsTrickWNaf(arg0, var5, var7, var6) : ECAlgorithms.implShamirsTrickWNaf(arg0, var5, var7.map(arg0), var6);
    }

    public GLVMultiplier(ECCurve arg0, GLVEndomorphism arg1) {
        if (arg0 == null || arg0.getOrder() == null) {
            throw new IllegalArgumentException("Need curve with known group order");
        }
        this.curve = arg0;
        this.glvEndomorphism = arg1;
    }
}
