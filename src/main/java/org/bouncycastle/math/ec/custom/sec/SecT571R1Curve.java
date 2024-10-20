package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT571R1Curve extends ECCurve.AbstractF2m {

    public SecT571R1Point infinity = new SecT571R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final SecT571FieldElement SecT571R1_B = new SecT571FieldElement(new BigInteger(1, Hex.decode("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));

    public static final SecT571FieldElement SecT571R1_B_SQRT = (SecT571FieldElement) SecT571R1_B.sqrt();

    public static final int SecT571R1_DEFAULT_COORDS = 6;

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECCurve cloneCurve() {
        return new SecT571R1Curve();
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getFieldSize() {
        return 571;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT571R1Point(this, arg0, arg1, arg2);
    }

    public int getK1() {
        return 2;
    }

    public boolean isTrinomial() {
        return false;
    }

    public SecT571R1Curve() {
        super(571, 2, 5, 10);
        this.a = this.fromBigInteger(BigInteger.valueOf(1L));
        this.b = SecT571R1_B;
        this.order = new BigInteger(1, Hex.decode("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public int getM() {
        return 571;
    }

    public int getK3() {
        return 10;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT571FieldElement(arg0);
    }

    public int getK2() {
        return 5;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT571R1Point(this, arg0, arg1, arg2, arg3);
    }
}
