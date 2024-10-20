package org.bouncycastle.asn1;

import java.util.Date;

public class DERGeneralizedTime extends ASN1GeneralizedTime {

    public DERGeneralizedTime(byte[] arg0) {
        super(arg0);
    }

    public DERGeneralizedTime(Date arg0) {
        super(arg0);
    }

    public DERGeneralizedTime(String arg0) {
        super(arg0);
    }
}
