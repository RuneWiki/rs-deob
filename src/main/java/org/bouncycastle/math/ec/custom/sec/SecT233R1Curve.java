package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecT233R1Curve extends ECCurve.AbstractF2m {

    public SecT233R1Point infinity = new SecT233R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT233R1_DEFAULT_COORDS = 6;

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT233FieldElement(arg0);
    }

    public ECCurve cloneCurve() {
        return new SecT233R1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT233R1Point(this, arg0, arg1, arg2);
    }

    public int getFieldSize() {
        return 233;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    public int getK2() {
        return 0;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT233R1Point(this, arg0, arg1, arg2, arg3);
    }

    public SecT233R1Curve() {
        super(233, 74, 0, 0);
        this.a = this.fromBigInteger(BigInteger.valueOf(1L));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.order = new BigInteger(1, Hex.decode("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    public boolean isKoblitz() {
        return false;
    }

    public int getM() {
        return 233;
    }

    public boolean isTrinomial() {
        return true;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 74;
    }

    public int getK3() {
        return 0;
    }
}
