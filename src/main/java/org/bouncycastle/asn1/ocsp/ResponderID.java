package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x500.X500Name;

public class ResponderID extends ASN1Object implements ASN1Choice {

    public ASN1Encodable value;

    public ResponderID(ASN1OctetString arg0) {
        this.value = arg0;
    }

    public ResponderID(X500Name arg0) {
        this.value = arg0;
    }

    public static ResponderID getInstance(Object arg0) {
        if (arg0 instanceof ResponderID) {
            return (ResponderID) arg0;
        } else if (arg0 instanceof DEROctetString) {
            return new ResponderID((DEROctetString) arg0);
        } else if (arg0 instanceof ASN1TaggedObject) {
            ASN1TaggedObject var1 = (ASN1TaggedObject) arg0;
            return var1.getTagNo() == 1 ? new ResponderID(X500Name.getInstance(var1, true)) : new ResponderID(ASN1OctetString.getInstance(var1, true));
        } else {
            return new ResponderID(X500Name.getInstance(arg0));
        }
    }

    public X500Name getName() {
        return this.value instanceof ASN1OctetString ? null : X500Name.getInstance(this.value);
    }

    public byte[] getKeyHash() {
        if (this.value instanceof ASN1OctetString) {
            ASN1OctetString var1 = (ASN1OctetString) this.value;
            return var1.getOctets();
        } else {
            return null;
        }
    }

    public static ResponderID getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(arg0.getObject());
    }

    public ASN1Primitive toASN1Primitive() {
        return this.value instanceof ASN1OctetString ? new DERTaggedObject(true, 2, this.value) : new DERTaggedObject(true, 1, this.value);
    }
}
