package org.bouncycastle.asn1;

import java.io.IOException;

public class DERTaggedObject extends ASN1TaggedObject {

    public static final byte[] ZERO_BYTES = new byte[0];

    public DERTaggedObject(boolean arg0, int arg1, ASN1Encodable arg2) {
        super(arg0, arg1, arg2);
    }

    public DERTaggedObject(int arg0, ASN1Encodable arg1) {
        super(true, arg0, arg1);
    }

    public int encodedLength() throws IOException {
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        ASN1Primitive var1 = this.obj.toASN1Primitive().toDERObject();
        int var2 = var1.encodedLength();
        if (this.explicit) {
            return StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(var2) + var2;
        } else {
            int var3 = var2 - 1;
            return StreamUtil.calculateTagLength(this.tagNo) + var3;
        }
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        if (this.empty) {
            arg0.writeEncoded(160, this.tagNo, ZERO_BYTES);
            return;
        }
        ASN1Primitive var2 = this.obj.toASN1Primitive().toDERObject();
        if (this.explicit) {
            arg0.writeTag(160, this.tagNo);
            arg0.writeLength(var2.encodedLength());
            arg0.writeObject(var2);
            return;
        }
        short var3;
        if (var2.isConstructed()) {
            var3 = 160;
        } else {
            var3 = 128;
        }
        arg0.writeTag(var3, this.tagNo);
        arg0.writeImplicitObject(var2);
    }

    public boolean isConstructed() {
        if (this.empty) {
            return true;
        } else if (this.explicit) {
            return true;
        } else {
            ASN1Primitive var1 = this.obj.toASN1Primitive().toDERObject();
            return var1.isConstructed();
        }
    }
}
