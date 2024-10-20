package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT193R1Curve extends ECCurve.AbstractF2m {

    public SecT193R1Point infinity = new SecT193R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT193R1_DEFAULT_COORDS = 6;

    public int getK2() {
        return 0;
    }

    public ECCurve cloneCurve() {
        return new SecT193R1Curve();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public SecT193R1Curve() {
        super(193, 15, 0, 0);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.order = new BigInteger(1, Hex.decode("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public int getM() {
        return 193;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT193R1Point(this, arg0, arg1, arg2);
    }

    public int getFieldSize() {
        return 193;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT193FieldElement(arg0);
    }

    public boolean isKoblitz() {
        return false;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT193R1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean isTrinomial() {
        return true;
    }

    public int getK1() {
        return 15;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK3() {
        return 0;
    }
}
