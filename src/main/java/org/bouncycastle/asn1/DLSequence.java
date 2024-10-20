package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class DLSequence extends ASN1Sequence {

    public int bodyLength = -1;

    public int encodedLength() throws IOException {
        int var1 = this.getBodyLength();
        return 1 + StreamUtil.calculateBodyLength(var1) + var1;
    }

    public DLSequence() {
    }

    public int getBodyLength() throws IOException {
        if (this.bodyLength < 0) {
            int var1 = 0;
            Enumeration var2 = this.getObjects();
            while (var2.hasMoreElements()) {
                Object var3 = var2.nextElement();
                var1 += ((ASN1Encodable) var3).toASN1Primitive().toDLObject().encodedLength();
            }
            this.bodyLength = var1;
        }
        return this.bodyLength;
    }

    public DLSequence(ASN1Encodable[] arg0) {
        super(arg0);
    }

    public DLSequence(ASN1Encodable arg0) {
        super(arg0);
    }

    public DLSequence(ASN1EncodableVector arg0) {
        super(arg0);
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        ASN1OutputStream var2 = arg0.getDLSubStream();
        int var3 = this.getBodyLength();
        arg0.write(48);
        arg0.writeLength(var3);
        Enumeration var4 = this.getObjects();
        while (var4.hasMoreElements()) {
            Object var5 = var4.nextElement();
            var2.writeObject((ASN1Encodable) var5);
        }
    }
}