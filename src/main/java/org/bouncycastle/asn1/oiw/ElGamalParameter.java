package org.bouncycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ElGamalParameter extends ASN1Object {

    public ASN1Integer p;

    public ASN1Integer g;

    public ElGamalParameter(ASN1Sequence arg0) {
        Enumeration var2 = arg0.getObjects();
        this.p = (ASN1Integer) var2.nextElement();
        this.g = (ASN1Integer) var2.nextElement();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.p);
        var1.add(this.g);
        return new DERSequence(var1);
    }

    public static ElGamalParameter getInstance(Object arg0) {
        if (arg0 instanceof ElGamalParameter) {
            return (ElGamalParameter) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new ElGamalParameter(ASN1Sequence.getInstance(arg0));
        }
    }

    public BigInteger getP() {
        return this.p.getPositiveValue();
    }

    public BigInteger getG() {
        return this.g.getPositiveValue();
    }

    public ElGamalParameter(BigInteger arg0, BigInteger arg1) {
        this.p = new ASN1Integer(arg0);
        this.g = new ASN1Integer(arg1);
    }
}
