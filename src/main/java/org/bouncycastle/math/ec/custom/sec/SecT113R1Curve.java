package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT113R1Curve extends ECCurve.AbstractF2m {

    public SecT113R1Point infinity = new SecT113R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT113R1_DEFAULT_COORDS = 6;

    public boolean isTrinomial() {
        return true;
    }

    public ECCurve cloneCurve() {
        return new SecT113R1Curve();
    }

    public SecT113R1Curve() {
        super(113, 9, 0, 0);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("003088250CA6E7C7FE649CE85820F7")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("00E8BEE4D3E2260744188BE0E9C723")));
        this.order = new BigInteger(1, Hex.decode("0100000000000000D9CCEC8A39E56F"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public int getK3() {
        return 0;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT113FieldElement(arg0);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT113R1Point(this, arg0, arg1, arg2);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT113R1Point(this, arg0, arg1, arg2, arg3);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getM() {
        return 113;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public int getK1() {
        return 9;
    }

    public int getFieldSize() {
        return 113;
    }

    public int getK2() {
        return 0;
    }
}
