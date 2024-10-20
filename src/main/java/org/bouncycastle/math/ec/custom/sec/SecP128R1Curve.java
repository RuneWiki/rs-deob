package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP128R1Curve extends ECCurve.AbstractFp {

    public SecP128R1Point infinity = new SecP128R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    public static final int SecP128R1_DEFAULT_COORDS = 2;

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecP128R1Point(this, arg0, arg1, arg2, arg3);
    }

    public ECCurve cloneCurve() {
        return new SecP128R1Curve();
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecP128R1FieldElement(arg0);
    }

    public BigInteger getQ() {
        return q;
    }

    public SecP128R1Curve() {
        super(q);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("E87579C11079F43DD824993C2CEE5ED3")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFE0000000075A30D1B9038A115"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    public int getFieldSize() {
        return q.bitLength();
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecP128R1Point(this, arg0, arg1, arg2);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 2:
                return true;
            default:
                return false;
        }
    }
}
