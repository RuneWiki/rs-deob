package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT193R2Curve extends ECCurve.AbstractF2m {

    public SecT193R2Point infinity = new SecT193R2Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT193R2_DEFAULT_COORDS = 6;

    public int getFieldSize() {
        return 193;
    }

    public int getK1() {
        return 15;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public ECCurve cloneCurve() {
        return new SecT193R2Curve();
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT193FieldElement(arg0);
    }

    public int getM() {
        return 193;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT193R2Point(this, arg0, arg1, arg2, arg3);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public boolean isKoblitz() {
        return false;
    }

    public SecT193R2Curve() {
        super(193, 15, 0, 0);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.order = new BigInteger(1, Hex.decode("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public boolean isTrinomial() {
        return true;
    }

    public int getK2() {
        return 0;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT193R2Point(this, arg0, arg1, arg2);
    }

    public int getK3() {
        return 0;
    }
}
