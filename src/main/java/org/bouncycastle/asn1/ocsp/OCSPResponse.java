package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

public class OCSPResponse extends ASN1Object {

    public OCSPResponseStatus responseStatus;

    public ResponseBytes responseBytes;

    public ResponseBytes getResponseBytes() {
        return this.responseBytes;
    }

    public OCSPResponse(ASN1Sequence arg0) {
        this.responseStatus = OCSPResponseStatus.getInstance(arg0.getObjectAt(0));
        if (arg0.size() == 2) {
            this.responseBytes = ResponseBytes.getInstance((ASN1TaggedObject) arg0.getObjectAt(1), true);
        }
    }

    public static OCSPResponse getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public static OCSPResponse getInstance(Object arg0) {
        if (arg0 instanceof OCSPResponse) {
            return (OCSPResponse) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new OCSPResponse(ASN1Sequence.getInstance(arg0));
        }
    }

    public OCSPResponse(OCSPResponseStatus arg0, ResponseBytes arg1) {
        this.responseStatus = arg0;
        this.responseBytes = arg1;
    }

    public OCSPResponseStatus getResponseStatus() {
        return this.responseStatus;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.responseStatus);
        if (this.responseBytes != null) {
            var1.add(new DERTaggedObject(true, 0, this.responseBytes));
        }
        return new DERSequence(var1);
    }
}
