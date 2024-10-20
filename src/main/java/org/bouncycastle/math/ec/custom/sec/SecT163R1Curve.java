package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT163R1Curve extends ECCurve.AbstractF2m {

    public SecT163R1Point infinity = new SecT163R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT163R1_DEFAULT_COORDS = 6;

    public SecT163R1Curve() {
        super(163, 3, 6, 7);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.order = new BigInteger(1, Hex.decode("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public boolean isTrinomial() {
        return false;
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
        return 163;
    }

    public ECCurve cloneCurve() {
        return new SecT163R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT163R1Point(this, arg0, arg1, arg2);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT163R1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean isKoblitz() {
        return false;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getM() {
        return 163;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT163FieldElement(arg0);
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }
}
