package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

public class SecT233K1Curve extends ECCurve.AbstractF2m {

    public SecT233K1Point infinity = new SecT233K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT233K1_DEFAULT_COORDS = 6;

    public int getM() {
        return 233;
    }

    public ECCurve cloneCurve() {
        return new SecT233K1Curve();
    }

    public int getK2() {
        return 0;
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT233K1Point(this, arg0, arg1, arg2);
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT233FieldElement(arg0);
    }

    public SecT233K1Curve() {
        super(233, 74, 0, 0);
        this.a = this.fromBigInteger(BigInteger.valueOf(0L));
        this.b = this.fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public boolean isKoblitz() {
        return true;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT233K1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean isTrinomial() {
        return true;
    }

    public int getK1() {
        return 74;
    }

    public int getFieldSize() {
        return 233;
    }

    public int getK3() {
        return 0;
    }
}
