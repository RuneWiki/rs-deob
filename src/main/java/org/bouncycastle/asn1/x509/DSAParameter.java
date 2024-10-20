package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Object {

    public ASN1Integer p;

    public ASN1Integer q;

    public ASN1Integer g;

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public static DSAParameter getInstance(Object arg0) {
        if (arg0 instanceof DSAParameter) {
            return (DSAParameter) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new DSAParameter(ASN1Sequence.getInstance(arg0));
        }
    }

    public DSAParameter(ASN1Sequence arg0) {
        if (arg0.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        Enumeration var2 = arg0.getObjects();
        this.p = ASN1Integer.getInstance(var2.nextElement());
        this.q = ASN1Integer.getInstance(var2.nextElement());
        this.g = ASN1Integer.getInstance(var2.nextElement());
    }

    public static DSAParameter getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.q.getPositiveValue();
    }

    public DSAParameter(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this.p = new ASN1Integer(arg0);
        this.q = new ASN1Integer(arg1);
        this.g = new ASN1Integer(arg2);
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.p);
        var1.add(this.q);
        var1.add(this.g);
        return new DERSequence(var1);
    }
}
