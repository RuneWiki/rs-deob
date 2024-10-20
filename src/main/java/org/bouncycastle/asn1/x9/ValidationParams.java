package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

public class ValidationParams extends ASN1Object {

    public DERBitString seed;

    public ASN1Integer pgenCounter;

    public BigInteger getPgenCounter() {
        return this.pgenCounter.getPositiveValue();
    }

    public static ValidationParams getInstance(Object arg0) {
        if (arg0 instanceof ValidationParams) {
            return (ValidationParams) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new ValidationParams(ASN1Sequence.getInstance(arg0));
        }
    }

    public ValidationParams(byte[] arg0, int arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.seed = new DERBitString(arg0);
        this.pgenCounter = new ASN1Integer((long) arg1);
    }

    public ValidationParams(DERBitString arg0, ASN1Integer arg1) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        } else if (arg1 == null) {
            throw new IllegalArgumentException("'pgenCounter' cannot be null");
        } else {
            this.seed = arg0;
            this.pgenCounter = arg1;
        }
    }

    public ValidationParams(ASN1Sequence arg0) {
        if (arg0.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        this.seed = DERBitString.getInstance(arg0.getObjectAt(0));
        this.pgenCounter = ASN1Integer.getInstance(arg0.getObjectAt(1));
    }

    public static ValidationParams getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public byte[] getSeed() {
        return this.seed.getBytes();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.seed);
        var1.add(this.pgenCounter);
        return new DERSequence(var1);
    }
}
