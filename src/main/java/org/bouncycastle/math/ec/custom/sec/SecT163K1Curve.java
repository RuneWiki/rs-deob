package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

public class SecT163K1Curve extends ECCurve.AbstractF2m {

    public SecT163K1Point infinity = new SecT163K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT163K1_DEFAULT_COORDS = 6;

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public ECCurve cloneCurve() {
        return new SecT163K1Curve();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public boolean isTrinomial() {
        return false;
    }

    public int getFieldSize() {
        return 163;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT163FieldElement(arg0);
    }

    public boolean isKoblitz() {
        return true;
    }

    public SecT163K1Curve() {
        super(163, 3, 6, 7);
        this.a = this.fromBigInteger(BigInteger.valueOf(1L));
        this.b = this.a;
        this.order = new BigInteger(1, Hex.decode("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT163K1Point(this, arg0, arg1, arg2);
    }

    public int getM() {
        return 163;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT163K1Point(this, arg0, arg1, arg2, arg3);
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
