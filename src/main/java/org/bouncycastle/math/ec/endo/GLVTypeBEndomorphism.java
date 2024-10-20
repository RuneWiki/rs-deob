package org.bouncycastle.math.ec.endo;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPointMap;
import org.bouncycastle.math.ec.ScaleXPointMap;

public class GLVTypeBEndomorphism implements GLVEndomorphism {

    public final ECCurve curve;

    public final GLVTypeBParameters parameters;

    public final ECPointMap pointMap;

    public BigInteger calculateB(BigInteger arg0, BigInteger arg1, int arg2) {
        boolean var4 = arg1.signum() < 0;
        BigInteger var5 = arg0.multiply(arg1.abs());
        boolean var6 = var5.testBit(arg2 - 1);
        BigInteger var7 = var5.shiftRight(arg2);
        if (var6) {
            var7 = var7.add(ECConstants.ONE);
        }
        return var4 ? var7.negate() : var7;
    }

    public BigInteger[] decomposeScalar(BigInteger arg0) {
        int var2 = this.parameters.getBits();
        BigInteger var3 = this.calculateB(arg0, this.parameters.getG1(), var2);
        BigInteger var4 = this.calculateB(arg0, this.parameters.getG2(), var2);
        GLVTypeBParameters var5 = this.parameters;
        BigInteger var6 = arg0.subtract(var3.multiply(var5.getV1A()).add(var4.multiply(var5.getV2A())));
        BigInteger var7 = var3.multiply(var5.getV1B()).add(var4.multiply(var5.getV2B())).negate();
        return new BigInteger[] { var6, var7 };
    }

    public GLVTypeBEndomorphism(ECCurve arg0, GLVTypeBParameters arg1) {
        this.curve = arg0;
        this.parameters = arg1;
        this.pointMap = new ScaleXPointMap(arg0.fromBigInteger(arg1.getBeta()));
    }

    public boolean hasEfficientPointMap() {
        return true;
    }

    public ECPointMap getPointMap() {
        return this.pointMap;
    }
}
