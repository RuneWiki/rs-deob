package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.field.PolynomialExtensionField;

public class X9ECParameters extends ASN1Object implements X9ObjectIdentifiers {

    public ECCurve curve;

    public X9ECPoint g;

    public BigInteger n;

    public BigInteger h;

    public byte[] seed;

    public X9FieldID fieldID;

    public static final BigInteger ONE = BigInteger.valueOf(1L);

    public X9ECParameters(ECCurve arg0, X9ECPoint arg1, BigInteger arg2, BigInteger arg3, byte[] arg4) {
        this.curve = arg0;
        this.g = arg1;
        this.n = arg2;
        this.h = arg3;
        this.seed = arg4;
        if (ECAlgorithms.isFpCurve(arg0)) {
            this.fieldID = new X9FieldID(arg0.getField().getCharacteristic());
        } else if (ECAlgorithms.isF2mCurve(arg0)) {
            PolynomialExtensionField var6 = (PolynomialExtensionField) arg0.getField();
            int[] var7 = var6.getMinimalPolynomial().getExponentsPresent();
            if (var7.length == 3) {
                this.fieldID = new X9FieldID(var7[2], var7[1]);
            } else if (var7.length == 5) {
                this.fieldID = new X9FieldID(var7[4], var7[1], var7[2], var7[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
    }

    public X9FieldID getFieldIDEntry() {
        return this.fieldID;
    }

    public X9ECPoint getBaseEntry() {
        return this.g;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public X9ECParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, (ECPoint) arg1, arg2, arg3, (byte[]) null);
    }

    public X9ECParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2, BigInteger arg3, byte[] arg4) {
        this(arg0, new X9ECPoint(arg1), arg2, arg3, arg4);
    }

    public X9ECParameters(ECCurve arg0, ECPoint arg1, BigInteger arg2) {
        this(arg0, (ECPoint) arg1, arg2, (BigInteger) null, (byte[]) null);
    }

    public X9ECParameters(ASN1Sequence arg0) {
        if (!arg0.getObjectAt(0) instanceof ASN1Integer || !((ASN1Integer) arg0.getObjectAt(0)).getValue().equals(ONE)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        X9Curve var2 = new X9Curve(X9FieldID.getInstance(arg0.getObjectAt(1)), ASN1Sequence.getInstance(arg0.getObjectAt(2)));
        this.curve = var2.getCurve();
        ASN1Encodable var3 = arg0.getObjectAt(3);
        if (var3 instanceof X9ECPoint) {
            this.g = (X9ECPoint) var3;
        } else {
            this.g = new X9ECPoint(this.curve, (ASN1OctetString) var3);
        }
        this.n = ((ASN1Integer) arg0.getObjectAt(4)).getValue();
        this.seed = var2.getSeed();
        if (arg0.size() == 6) {
            this.h = ((ASN1Integer) arg0.getObjectAt(5)).getValue();
        }
    }

    public ECPoint getG() {
        return this.g.getPoint();
    }

    public BigInteger getN() {
        return this.n;
    }

    public BigInteger getH() {
        return this.h;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public X9Curve getCurveEntry() {
        return new X9Curve(this.curve, this.seed);
    }

    public X9ECParameters(ECCurve arg0, X9ECPoint arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, (X9ECPoint) arg1, arg2, arg3, (byte[]) null);
    }

    public static X9ECParameters getInstance(Object arg0) {
        if (arg0 instanceof X9ECParameters) {
            return (X9ECParameters) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new X9ECParameters(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(new ASN1Integer(ONE));
        var1.add(this.fieldID);
        var1.add(new X9Curve(this.curve, this.seed));
        var1.add(this.g);
        var1.add(new ASN1Integer(this.n));
        if (this.h != null) {
            var1.add(new ASN1Integer(this.h));
        }
        return new DERSequence(var1);
    }
}
