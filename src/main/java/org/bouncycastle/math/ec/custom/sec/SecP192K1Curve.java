package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP192K1Curve extends ECCurve.AbstractFp {

    public SecP192K1Point infinity = new SecP192K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    public static final int SecP192K1_DEFAULT_COORDS = 2;

    public int getFieldSize() {
        return q.bitLength();
    }

    public ECCurve cloneCurve() {
        return new SecP192K1Curve();
    }

    public SecP192K1Curve() {
        super(q);
        this.a = this.fromBigInteger(ECConstants.ZERO);
        this.b = this.fromBigInteger(BigInteger.valueOf(3L));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecP192K1FieldElement(arg0);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecP192K1Point(this, arg0, arg1, arg2);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecP192K1Point(this, arg0, arg1, arg2, arg3);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public BigInteger getQ() {
        return q;
    }
}
