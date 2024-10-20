package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

public class SecP256R1Curve extends ECCurve.AbstractFp {

    public SecP256R1Point infinity = new SecP256R1Point(this, (ECFieldElement) null, (ECFieldElement) null);

    public static final BigInteger q = new BigInteger(1, Hex.decode("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    public static final int SecP256R1_DEFAULT_COORDS = 2;

    public BigInteger getQ() {
        return q;
    }

    public ECCurve cloneCurve() {
        return new SecP256R1Curve();
    }

    public ECFieldElement fromBigInteger(BigInteger arg0) {
        return new SecP256R1FieldElement(arg0);
    }

    public SecP256R1Curve() {
        super(q);
        this.a = this.fromBigInteger(new BigInteger(1, Hex.decode("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.b = this.fromBigInteger(new BigInteger(1, Hex.decode("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.order = new BigInteger(1, Hex.decode("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.cofactor = BigInteger.valueOf(1L);
        this.coord = 2;
    }

    public int getFieldSize() {
        return q.bitLength();
    }

    public boolean supportsCoordinateSystem(int arg0) {
        switch(arg0) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, boolean arg2) {
        return new SecP256R1Point(this, arg0, arg1, arg2);
    }

    public ECPoint createRawPoint(ECFieldElement arg0, ECFieldElement arg1, ECFieldElement[] arg2, boolean arg3) {
        return new SecP256R1Point(this, arg0, arg1, arg2, arg3);
    }

    public ECPoint getInfinity() {
        return this.infinity;
    }
}
