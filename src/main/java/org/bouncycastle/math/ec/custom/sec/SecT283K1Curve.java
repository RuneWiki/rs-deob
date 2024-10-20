package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

public class SecT283K1Curve extends ECCurve.AbstractF2m {

    public SecT283K1Point infinity = new SecT283K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT283K1_DEFAULT_COORDS = 6;

    public SecT283K1Curve() {
        super(283, 5, 7, 12);
        this.a = this.fromBigInteger(BigInteger.valueOf(0L));
        this.b = this.fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    public ECCurve cloneCurve() {
        return new SecT283K1Curve();
    }

    public int getK1() {
        return 5;
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public int getFieldSize() {
        return 283;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT283FieldElement(arg0);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT283K1Point(this, arg0, arg1, arg2);
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT283K1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean isKoblitz() {
        return true;
    }

    public int getM() {
        return 283;
    }

    public boolean isTrinomial() {
        return false;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK2() {
        return 7;
    }

    public int getK3() {
        return 12;
    }
}
