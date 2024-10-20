package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT131R1Curve extends ECCurve.AbstractF2m {

    public SecT131R1Point infinity = new SecT131R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT131R1_DEFAULT_COORDS = 6;

    public SecT131R1Curve() {
        super(131, 2, 3, 8);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("07A11B09A76B562144418FF3FF8C2570B8")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0217C05610884B63B9C6C7291678F9D341")));
        this.order = new BigInteger(1, Hex.decode("0400000000000000023123953A9464B54D"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public int getFieldSize() {
        return 131;
    }

    public ECCurve cloneCurve() {
        return new SecT131R1Curve();
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT131FieldElement(arg0);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT131R1Point(this, arg0, arg1, arg2);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT131R1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getM() {
        return 131;
    }

    public int getK1() {
        return 2;
    }

    public boolean isTrinomial() {
        return false;
    }

    public int getK2() {
        return 3;
    }

    public int getK3() {
        return 8;
    }
}
