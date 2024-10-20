package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

public class X962Parameters extends ASN1Object implements ASN1Choice {

    public ASN1Primitive params = null;

    /**
     * @deprecated
     */
    public X962Parameters(ASN1Primitive arg0) {
        this.params = arg0;
    }

    public boolean isNamedCurve() {
        return this.params instanceof ASN1ObjectIdentifier;
    }

    public X962Parameters(X9ECParameters arg0) {
        this.params = arg0.toASN1Primitive();
    }

    public X962Parameters(ASN1Null arg0) {
        this.params = arg0;
    }

    public static X962Parameters getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof X962Parameters)) {
            return (X962Parameters) arg0;
        } else if (arg0 instanceof ASN1Primitive) {
            return new X962Parameters((ASN1Primitive) arg0);
        } else if (arg0 instanceof byte[]) {
            try {
                return new X962Parameters(ASN1Primitive.fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (Exception var2) {
                throw new IllegalArgumentException("unable to parse encoded data: " + var2.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
    }

    public static X962Parameters getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(arg0.getObject());
    }

    public boolean isImplicitlyCA() {
        return this.params instanceof ASN1Null;
    }

    public X962Parameters(ASN1ObjectIdentifier arg0) {
        this.params = arg0;
    }

    public ASN1Primitive getParameters() {
        return this.params;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.params;
    }
}
