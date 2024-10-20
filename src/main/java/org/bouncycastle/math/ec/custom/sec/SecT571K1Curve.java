package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.util.encoders.Hex;

public class SecT571K1Curve extends ECCurve.AbstractF2m {

    public SecT571K1Point infinity = new SecT571K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final int SecT571K1_DEFAULT_COORDS = 6;

    public int getK1() {
        return 2;
    }

    public ECCurve cloneCurve() {
        return new SecT571K1Curve();
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecT571K1Point(this, arg0, arg1, arg2);
    }

    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    public int getFieldSize() {
        return 571;
    }

    public int getK3() {
        return 10;
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public SecT571K1Curve() {
        super(571, 2, 5, 10);
        this.a = this.fromBigInteger(BigInteger.valueOf(0L));
        this.b = this.fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decode("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecT571K1Point(this, arg0, arg1, arg2, arg3);
    }

    public boolean isKoblitz() {
        return true;
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecT571FieldElement(arg0);
    }

    public boolean isTrinomial() {
        return false;
    }

    public int getM() {
        return 571;
    }

    public int getK2() {
        return 5;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 6:
                return true;
            default:
                return false;
        }
    }
}
