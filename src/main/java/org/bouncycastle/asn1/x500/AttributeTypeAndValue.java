package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class AttributeTypeAndValue extends ASN1Object {

    public ASN1ObjectIdentifier type;

    public ASN1Encodable value;

    public AttributeTypeAndValue(ASN1ObjectIdentifier arg0, ASN1Encodable arg1) {
        this.type = arg0;
        this.value = arg1;
    }

    public AttributeTypeAndValue(ASN1Sequence arg0) {
        this.type = (ASN1ObjectIdentifier) arg0.getObjectAt(0);
        this.value = arg0.getObjectAt(1);
    }

    public ASN1ObjectIdentifier getType() {
        return this.type;
    }

    public static AttributeTypeAndValue getInstance(Object arg0) {
        if (arg0 instanceof AttributeTypeAndValue) {
            return (AttributeTypeAndValue) arg0;
        } else if (arg0 == null) {
            throw new IllegalArgumentException("null value in getInstance()");
        } else {
            return new AttributeTypeAndValue(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1Encodable getValue() {
        return this.value;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.type);
        var1.add(this.value);
        return new DERSequence(var1);
    }
}
