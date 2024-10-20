package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class BERSet extends ASN1Set {

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.write(49);
        arg0.write(128);
        Enumeration var2 = this.getObjects();
        while (var2.hasMoreElements()) {
            arg0.writeObject((ASN1Encodable) var2.nextElement());
        }
        arg0.write(0);
        arg0.write(0);
    }

    public BERSet(ASN1Encodable arg0) {
        super(arg0);
    }

    public BERSet(ASN1EncodableVector arg0) {
        super(arg0, false);
    }

    public BERSet(ASN1Encodable[] arg0) {
        super(arg0, false);
    }

    public int encodedLength() throws IOException {
        int var1 = 0;
        Enumeration var2 = this.getObjects();
        while (var2.hasMoreElements()) {
            var1 += ((ASN1Encodable) var2.nextElement()).toASN1Primitive().encodedLength();
        }
        return var1 + 2 + 2;
    }

    public BERSet() {
    }
}
