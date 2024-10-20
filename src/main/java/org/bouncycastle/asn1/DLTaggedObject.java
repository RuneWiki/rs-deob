package org.bouncycastle.asn1;

import java.io.IOException;

public class DLTaggedObject extends ASN1TaggedObject {

    public static final byte[] ZERO_BYTES = new byte[0];

    public void encode(ASN1OutputStream arg0) throws IOException {
        if (this.empty) {
            arg0.writeEncoded(160, this.tagNo, ZERO_BYTES);
            return;
        }
        ASN1Primitive var2 = this.obj.toASN1Primitive().toDLObject();
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
            ASN1Primitive var1 = this.obj.toASN1Primitive().toDLObject();
            return var1.isConstructed();
        }
    }

    public DLTaggedObject(boolean arg0, int arg1, ASN1Encodable arg2) {
        super(arg0, arg1, arg2);
    }

    public int encodedLength() throws IOException {
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        int var1 = this.obj.toASN1Primitive().toDLObject().encodedLength();
        if (this.explicit) {
            return StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(var1) + var1;
        } else {
            int var2 = var1 - 1;
            return StreamUtil.calculateTagLength(this.tagNo) + var2;
        }
    }
}
