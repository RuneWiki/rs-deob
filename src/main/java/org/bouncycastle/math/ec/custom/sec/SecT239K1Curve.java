package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

public class SecT239K1Curve extends ECCurve.AbstractF2m {

    public SecT239K1Point infinity = new SecT239K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT239K1_DEFAULT_COORDS = 6;

    public int getM() {
        return 239;
    }

    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public int getFieldSize() {
        return 239;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT239K1Point(this, arg0, arg1, arg2, arg3);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT239K1Point(this, arg0, arg1, arg2);
    }

    public int getK3() {
        return 0;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT239FieldElement(arg0);
    }

    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    public int getK1() {
        return 158;
    }

    public SecT239K1Curve() {
        super(239, 158, 0, 0);
        this.a = this.fromBigInteger(BigInteger.valueOf(0L));
        this.b = this.fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    public int getK2() {
        return 0;
    }
}
