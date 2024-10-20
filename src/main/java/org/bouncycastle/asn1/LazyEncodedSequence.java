package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class LazyEncodedSequence extends ASN1Sequence {

    public byte[] encoded;

    public ASN1Primitive toDLObject() {
        if (this.encoded != null) {
            this.parse();
        }
        return super.toDLObject();
    }

    public void parse() {
        LazyConstructionEnumeration var1 = new LazyConstructionEnumeration(this.encoded);
        while (var1.hasMoreElements()) {
            this.seq.addElement(var1.nextElement());
        }
        this.encoded = null;
    }

    public synchronized ASN1Encodable getObjectAt(int arg0) {
        if (this.encoded != null) {
            this.parse();
        }
        return super.getObjectAt(arg0);
    }

    public synchronized Enumeration getObjects() {
        return this.encoded == null ? super.getObjects() : new LazyConstructionEnumeration(this.encoded);
    }

    public LazyEncodedSequence(byte[] arg0) throws IOException {
        this.encoded = arg0;
    }

    public ASN1Primitive toDERObject() {
        if (this.encoded != null) {
            this.parse();
        }
        return super.toDERObject();
    }

    public synchronized int size() {
        if (this.encoded != null) {
            this.parse();
        }
        return super.size();
    }

    public int encodedLength() throws IOException {
        return this.encoded == null ? super.toDLObject().encodedLength() : 1 + StreamUtil.calculateBodyLength(this.encoded.length) + this.encoded.length;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        if (this.encoded == null) {
            super.toDLObject().encode(arg0);
        } else {
            arg0.writeEncoded(48, this.encoded);
        }
    }
}
