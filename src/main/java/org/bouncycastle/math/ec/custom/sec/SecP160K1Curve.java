package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP160K1Curve extends ECCurve.AbstractFp {

    public SecP160K1Point infinity = new SecP160K1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final BigInteger q = SecP160R2Curve.q;

    public static final int SECP160K1_DEFAULT_COORDS = 2;

    public BigInteger getQ() {
        return q;
    }

    public ECCurve cloneCurve() {
        return new SecP160K1Curve();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    public SecP160K1Curve() {
        super(q);
        this.a = this.fromBigInteger(ECConstants.ZERO);
        this.b = this.fromBigInteger(BigInteger.valueOf(7L));
        this.order = new BigInteger(1, Hex.decode("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    public int getFieldSize() {
        return q.bitLength();
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecP160R2FieldElement(arg0);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecP160K1Point(this, arg0, arg1, arg2);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecP160K1Point(this, arg0, arg1, arg2, arg3);
    }
}
