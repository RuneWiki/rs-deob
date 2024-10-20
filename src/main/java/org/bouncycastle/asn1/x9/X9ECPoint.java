package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

public class X9ECPoint extends ASN1Object {

    public ECPoint p;

    public final ASN1OctetString encoding;

    public ECCurve c;

    public X9ECPoint(ECPoint arg0) {
        this(arg0, false);
    }

    public X9ECPoint(ECPoint arg0, boolean arg1) {
        this.p = arg0.normalize();
        this.encoding = new DEROctetString(arg0.getEncoded(arg1));
    }

    public X9ECPoint(ECCurve arg0, byte[] arg1) {
        this.c = arg0;
        this.encoding = new DEROctetString(Arrays.clone(arg1));
    }

    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public synchronized ECPoint getPoint() {
        if (this.p == null) {
            this.p = this.c.decodePoint(this.encoding.getOctets()).normalize();
        }
        return this.p;
    }

    public boolean isPointCompressed() {
        byte[] var1 = this.encoding.getOctets();
        return var1 != null && var1.length > 0 && (var1[0] == 2 || var1[0] == 3);
    }

    public X9ECPoint(ECCurve arg0, ASN1OctetString arg1) {
        this(arg0, arg1.getOctets());
    }
}
