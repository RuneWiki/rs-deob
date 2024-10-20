package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class DHParameter extends ASN1Object {

    public ASN1Integer p;

    public ASN1Integer g;

    public ASN1Integer l;

    public static DHParameter getInstance(Object arg0) {
        if (arg0 instanceof DHParameter) {
            return (DHParameter) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new DHParameter(ASN1Sequence.getInstance(arg0));
        }
    }

    public DHParameter(BigInteger arg0, BigInteger arg1, int arg2) {
        this.p = new ASN1Integer(arg0);
        this.g = new ASN1Integer(arg1);
        if (arg2 == 0) {
            this.l = null;
        } else {
            this.l = new ASN1Integer((long) arg2);
        }
    }

    public DHParameter(ASN1Sequence arg0) {
        Enumeration var2 = arg0.getObjects();
        this.p = ASN1Integer.getInstance(var2.nextElement());
        this.g = ASN1Integer.getInstance(var2.nextElement());
        if (var2.hasMoreElements()) {
            this.l = (ASN1Integer) var2.nextElement();
        } else {
            this.l = null;
        }
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.p);
        var1.add(this.g);
        if (this.getL() != null) {
            var1.add(this.l);
        }
        return new DERSequence(var1);
    }

    public BigInteger getL() {
        return this.l == null ? null : this.l.getPositiveValue();
    }
}
