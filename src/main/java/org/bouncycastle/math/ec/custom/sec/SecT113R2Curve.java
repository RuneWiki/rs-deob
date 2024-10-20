package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT113R2Curve extends ECCurve.AbstractF2m {

    public SecT113R2Point infinity = new SecT113R2Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT113R2_DEFAULT_COORDS = 6;

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECCurve cloneCurve() {
        return new SecT113R2Curve();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public int getFieldSize() {
        return 113;
    }

    public SecT113R2Curve() {
        super(113, 9, 0, 0);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0095E9A9EC9B297BD4BF36E059184F")));
        this.order = new BigInteger(1, Hex.decode("010000000000000108789B2496AF93"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT113R2Point(this, arg0, arg1, arg2);
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT113FieldElement(arg0);
    }

    public int getK1() {
        return 9;
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getM() {
        return 113;
    }

    public boolean isTrinomial() {
        return true;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT113R2Point(this, arg0, arg1, arg2, arg3);
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }
}
