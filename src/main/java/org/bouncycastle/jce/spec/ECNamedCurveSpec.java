package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.Polynomial;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.util.Arrays;

public class ECNamedCurveSpec extends java.security.spec.ECParameterSpec {

    public String name;

    public ECNamedCurveSpec(String arg0, EllipticCurve arg1, ECPoint arg2, BigInteger arg3, BigInteger arg4) {
        super(arg1, arg2, arg3, arg4.intValue());
        this.name = arg0;
    }

    public static ECField convertField(FiniteField arg0) {
        if (ECAlgorithms.isFpField(arg0)) {
            return new ECFieldFp(arg0.getCharacteristic());
        } else {
            Polynomial var1 = ((PolynomialExtensionField) arg0).getMinimalPolynomial();
            int[] var2 = var1.getExponentsPresent();
            int[] var3 = Arrays.reverse(Arrays.copyOfRange((int[]) var2, 1, var2.length - 1));
            return new ECFieldF2m(var1.getDegree(), var3);
        }
    }

    public static EllipticCurve convertCurve(ECCurve arg0, byte[] arg1) {
        ECField var2 = convertField(arg0.getField());
        BigInteger var3 = arg0.getA().toBigInteger();
        BigInteger var4 = arg0.getB().toBigInteger();
        return new EllipticCurve(var2, var3, var4, arg1);
    }

    public ECNamedCurveSpec(String arg0, ECCurve arg1, org.bouncycastle.math.ec.ECPoint arg2, BigInteger arg3) {
        super(convertCurve(arg1, (byte[]) null), convertPoint(arg2), arg3, 1);
        this.name = arg0;
    }

    public ECNamedCurveSpec(String arg0, EllipticCurve arg1, ECPoint arg2, BigInteger arg3) {
        super(arg1, arg2, arg3, 1);
        this.name = arg0;
    }

    public ECNamedCurveSpec(String arg0, ECCurve arg1, org.bouncycastle.math.ec.ECPoint arg2, BigInteger arg3, BigInteger arg4) {
        super(convertCurve(arg1, (byte[]) null), convertPoint(arg2), arg3, arg4.intValue());
        this.name = arg0;
    }

    public static ECPoint convertPoint(org.bouncycastle.math.ec.ECPoint arg0) {
        org.bouncycastle.math.ec.ECPoint var1 = arg0.normalize();
        return new ECPoint(var1.getAffineXCoord().toBigInteger(), var1.getAffineYCoord().toBigInteger());
    }

    public ECNamedCurveSpec(String arg0, ECCurve arg1, org.bouncycastle.math.ec.ECPoint arg2, BigInteger arg3, BigInteger arg4, byte[] arg5) {
        super(convertCurve(arg1, arg5), convertPoint(arg2), arg3, arg4.intValue());
        this.name = arg0;
    }

    public String getName() {
        return this.name;
    }
}
