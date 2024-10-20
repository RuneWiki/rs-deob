package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {

    public ASN1ObjectIdentifier id;

    public ASN1Primitive parameters;

    public X9FieldID(int arg0, int arg1) {
        this(arg0, arg1, 0, 0);
    }

    public static X9FieldID getInstance(Object arg0) {
        if (arg0 instanceof X9FieldID) {
            return (X9FieldID) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new X9FieldID(ASN1Sequence.getInstance(arg0));
        }
    }

    public X9FieldID(int arg0, int arg1, int arg2, int arg3) {
        this.id = characteristic_two_field;
        ASN1EncodableVector var5 = new ASN1EncodableVector();
        var5.add(new ASN1Integer((long) arg0));
        if (arg2 == 0) {
            if (arg3 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            var5.add(tpBasis);
            var5.add(new ASN1Integer((long) arg1));
        } else if (arg2 > arg1 && arg3 > arg2) {
            var5.add(ppBasis);
            ASN1EncodableVector var6 = new ASN1EncodableVector();
            var6.add(new ASN1Integer((long) arg1));
            var6.add(new ASN1Integer((long) arg2));
            var6.add(new ASN1Integer((long) arg3));
            var5.add(new DERSequence(var6));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.parameters = new DERSequence(var5);
    }

    public X9FieldID(ASN1Sequence arg0) {
        this.id = ASN1ObjectIdentifier.getInstance(arg0.getObjectAt(0));
        this.parameters = arg0.getObjectAt(1).toASN1Primitive();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.id);
        var1.add(this.parameters);
        return new DERSequence(var1);
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.id;
    }

    public ASN1Primitive getParameters() {
        return this.parameters;
    }

    public X9FieldID(BigInteger arg0) {
        this.id = prime_field;
        this.parameters = new ASN1Integer(arg0);
    }
}
