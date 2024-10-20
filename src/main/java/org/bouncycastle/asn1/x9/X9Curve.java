package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;

public class X9Curve extends ASN1Object implements X9ObjectIdentifiers {

    public ASN1ObjectIdentifier fieldIdentifier = null;

    public ECCurve curve;

    public byte[] seed;

    public X9Curve(X9FieldID arg0, ASN1Sequence arg1) {
        this.fieldIdentifier = arg0.getIdentifier();
        if (this.fieldIdentifier.equals(prime_field)) {
            BigInteger var3 = ((ASN1Integer) arg0.getParameters()).getValue();
            X9FieldElement var4 = new X9FieldElement(var3, (ASN1OctetString) arg1.getObjectAt(0));
            X9FieldElement var5 = new X9FieldElement(var3, (ASN1OctetString) arg1.getObjectAt(1));
            this.curve = new ECCurve.Fp(var3, var4.getValue().toBigInteger(), var5.getValue().toBigInteger());
        } else if (this.fieldIdentifier.equals(characteristic_two_field)) {
            ASN1Sequence var6 = ASN1Sequence.getInstance(arg0.getParameters());
            int var7 = ((ASN1Integer) var6.getObjectAt(0)).getValue().intValue();
            ASN1ObjectIdentifier var8 = (ASN1ObjectIdentifier) var6.getObjectAt(1);
            boolean var9 = false;
            int var10 = 0;
            int var11 = 0;
            int var12;
            if (var8.equals(tpBasis)) {
                var12 = ASN1Integer.getInstance(var6.getObjectAt(2)).getValue().intValue();
            } else if (var8.equals(ppBasis)) {
                ASN1Sequence var13 = ASN1Sequence.getInstance(var6.getObjectAt(2));
                var12 = ASN1Integer.getInstance(var13.getObjectAt(0)).getValue().intValue();
                var10 = ASN1Integer.getInstance(var13.getObjectAt(1)).getValue().intValue();
                var11 = ASN1Integer.getInstance(var13.getObjectAt(2)).getValue().intValue();
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            X9FieldElement var14 = new X9FieldElement(var7, var12, var10, var11, (ASN1OctetString) arg1.getObjectAt(0));
            X9FieldElement var15 = new X9FieldElement(var7, var12, var10, var11, (ASN1OctetString) arg1.getObjectAt(1));
            this.curve = new ECCurve.F2m(var7, var12, var10, var11, var14.getValue().toBigInteger(), var15.getValue().toBigInteger());
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        if (arg1.size() == 3) {
            this.seed = ((DERBitString) arg1.getObjectAt(2)).getBytes();
        }
    }

    public X9Curve(ECCurve arg0, byte[] arg1) {
        this.curve = arg0;
        this.seed = arg1;
        this.setFieldIdentifier();
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public void setFieldIdentifier() {
        if (ECAlgorithms.isFpCurve(this.curve)) {
            this.fieldIdentifier = prime_field;
        } else if (ECAlgorithms.isF2mCurve(this.curve)) {
            this.fieldIdentifier = characteristic_two_field;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public X9Curve(ECCurve arg0) {
        this.curve = arg0;
        this.seed = null;
        this.setFieldIdentifier();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        if (this.fieldIdentifier.equals(prime_field)) {
            var1.add((new X9FieldElement(this.curve.getA())).toASN1Primitive());
            var1.add((new X9FieldElement(this.curve.getB())).toASN1Primitive());
        } else if (this.fieldIdentifier.equals(characteristic_two_field)) {
            var1.add((new X9FieldElement(this.curve.getA())).toASN1Primitive());
            var1.add((new X9FieldElement(this.curve.getB())).toASN1Primitive());
        }
        if (this.seed != null) {
            var1.add(new DERBitString(this.seed));
        }
        return new DERSequence(var1);
    }
}
