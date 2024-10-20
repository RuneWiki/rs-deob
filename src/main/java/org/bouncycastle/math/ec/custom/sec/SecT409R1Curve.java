package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT409R1Curve extends ECCurve.AbstractF2m {

    public SecT409R1Point infinity = new SecT409R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT409R1_DEFAULT_COORDS = 6;

    public int getK2() {
        return 0;
    }

    public ECCurve cloneCurve() {
        return new SecT409R1Curve();
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
        return new SecT409R1Point(this, arg0, arg1, arg2, arg3);
    }

    public SecT409R1Curve() {
        super(409, 87, 0, 0);
        this.a = this.fromBigInteger(BigInteger.valueOf(1L));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.order = new BigInteger(1, Hex.decode("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT409R1Point(this, arg0, arg1, arg2);
    }

    public int getFieldSize() {
        return 409;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getM() {
        return 409;
    }

    public boolean isTrinomial() {
        return true;
    }

    public int getK3() {
        return 0;
    }

    public int getK1() {
        return 87;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT409FieldElement(arg0);
    }
}
