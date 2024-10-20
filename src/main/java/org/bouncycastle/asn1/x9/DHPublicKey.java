package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class DHPublicKey extends ASN1Object {

    public ASN1Integer y;

    public static DHPublicKey getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DHPublicKey)) {
            return (DHPublicKey) arg0;
        } else if (arg0 instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) arg0);
        } else {
            throw new IllegalArgumentException("Invalid DHPublicKey: " + arg0.getClass().getName());
        }
    }

    public ASN1Primitive toASN1Primitive() {
        return this.y;
    }

    public DHPublicKey(ASN1Integer arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.y = arg0;
    }

    public DHPublicKey(BigInteger arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException("'y' cannot be null");
        }
        this.y = new ASN1Integer(arg0);
    }

    public BigInteger getY() {
        return this.y.getPositiveValue();
    }

    public static DHPublicKey getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Integer.getInstance(arg0, arg1));
    }
}
