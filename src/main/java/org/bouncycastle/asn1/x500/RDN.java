package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;

public class RDN extends ASN1Object {

    public ASN1Set values;

    public RDN(ASN1Set arg0) {
        this.values = arg0;
    }

    public AttributeTypeAndValue getFirst() {
        return this.values.size() == 0 ? null : AttributeTypeAndValue.getInstance(this.values.getObjectAt(0));
    }

    public RDN(ASN1ObjectIdentifier arg0, ASN1Encodable arg1) {
        ASN1EncodableVector var3 = new ASN1EncodableVector();
        var3.add(arg0);
        var3.add(arg1);
        this.values = new DERSet(new DERSequence(var3));
    }

    public RDN(AttributeTypeAndValue arg0) {
        this.values = new DERSet(arg0);
    }

    public RDN(AttributeTypeAndValue[] arg0) {
        this.values = new DERSet(arg0);
    }

    public static RDN getInstance(Object arg0) {
        if (arg0 instanceof RDN) {
            return (RDN) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new RDN(ASN1Set.getInstance(arg0));
        }
    }

    public int size() {
        return this.values.size();
    }

    public ASN1Primitive toASN1Primitive() {
        return this.values;
    }

    public AttributeTypeAndValue[] getTypesAndValues() {
        AttributeTypeAndValue[] var1 = new AttributeTypeAndValue[this.values.size()];
        for (int var2 = 0; var2 != var1.length; var2++) {
            var1[var2] = AttributeTypeAndValue.getInstance(this.values.getObjectAt(var2));
        }
        return var1;
    }

    public boolean isMultiValued() {
        return this.values.size() > 1;
    }
}
