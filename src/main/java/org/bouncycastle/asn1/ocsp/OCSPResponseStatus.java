package org.bouncycastle.asn1.ocsp;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;

public class OCSPResponseStatus extends ASN1Object {

    public ASN1Enumerated value;

    public static final int INTERNAL_ERROR = 2;

    public static final int MALFORMED_REQUEST = 1;

    public static final int SIG_REQUIRED = 5;

    public static final int SUCCESSFUL = 0;

    public static final int TRY_LATER = 3;

    public static final int UNAUTHORIZED = 6;

    public OCSPResponseStatus(int arg0) {
        this(new ASN1Enumerated(arg0));
    }

    public BigInteger getValue() {
        return this.value.getValue();
    }

    public static OCSPResponseStatus getInstance(Object arg0) {
        if (arg0 instanceof OCSPResponseStatus) {
            return (OCSPResponseStatus) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new OCSPResponseStatus(ASN1Enumerated.getInstance(arg0));
        }
    }

    public OCSPResponseStatus(ASN1Enumerated arg0) {
        this.value = arg0;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }
}
