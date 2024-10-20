package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class RSAPublicKey extends ASN1Object {

    public BigInteger modulus;

    public BigInteger publicExponent;

    public RSAPublicKey(BigInteger arg0, BigInteger arg1) {
        this.modulus = arg0;
        this.publicExponent = arg1;
    }

    public static RSAPublicKey getInstance(Object arg0) {
        if (arg0 instanceof RSAPublicKey) {
            return (RSAPublicKey) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new RSAPublicKey(ASN1Sequence.getInstance(arg0));
        }
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public RSAPublicKey(ASN1Sequence arg0) {
        if (arg0.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        Enumeration var2 = arg0.getObjects();
        this.modulus = ASN1Integer.getInstance(var2.nextElement()).getPositiveValue();
        this.publicExponent = ASN1Integer.getInstance(var2.nextElement()).getPositiveValue();
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public static RSAPublicKey getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(new ASN1Integer(this.getModulus()));
        var1.add(new ASN1Integer(this.getPublicExponent()));
        return new DERSequence(var1);
    }
}
