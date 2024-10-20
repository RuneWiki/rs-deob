package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class ResponseBytes extends ASN1Object {

    public ASN1ObjectIdentifier responseType;

    public ASN1OctetString response;

    public ResponseBytes(ASN1ObjectIdentifier arg0, ASN1OctetString arg1) {
        this.responseType = arg0;
        this.response = arg1;
    }

    /**
     * @deprecated
     */
    public ResponseBytes(ASN1Sequence arg0) {
        this.responseType = (ASN1ObjectIdentifier) arg0.getObjectAt(0);
        this.response = (ASN1OctetString) arg0.getObjectAt(1);
    }

    public ASN1ObjectIdentifier getResponseType() {
        return this.responseType;
    }

    public static ResponseBytes getInstance(Object arg0) {
        if (arg0 instanceof ResponseBytes) {
            return (ResponseBytes) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new ResponseBytes(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1OctetString getResponse() {
        return this.response;
    }

    public static ResponseBytes getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.responseType);
        var1.add(this.response);
        return new DERSequence(var1);
    }
}
