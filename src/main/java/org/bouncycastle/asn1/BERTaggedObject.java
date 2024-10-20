package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class BERTaggedObject extends ASN1TaggedObject {

    public BERTaggedObject(boolean arg0, int arg1, ASN1Encodable arg2) {
        super(arg0, arg1, arg2);
    }

    public BERTaggedObject(int arg0, ASN1Encodable arg1) {
        super(true, arg0, arg1);
    }

    public BERTaggedObject(int arg0) {
        super(false, arg0, new BERSequence());
    }

    public int encodedLength() throws IOException {
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        ASN1Primitive var1 = this.obj.toASN1Primitive();
        int var2 = var1.encodedLength();
        if (this.explicit) {
            return StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(var2) + var2;
        } else {
            int var3 = var2 - 1;
            return StreamUtil.calculateTagLength(this.tagNo) + var3;
        }
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

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeTag(160, this.tagNo);
        arg0.write(128);
        if (!this.empty) {
            if (this.explicit) {
                arg0.writeObject(this.obj);
            } else {
                Enumeration var2;
                if (this.obj instanceof ASN1OctetString) {
                    if (this.obj instanceof BEROctetString) {
                        var2 = ((BEROctetString) this.obj).getObjects();
                    } else {
                        ASN1OctetString var3 = (ASN1OctetString) this.obj;
                        BEROctetString var4 = new BEROctetString(var3.getOctets());
                        var2 = var4.getObjects();
                    }
                } else if (this.obj instanceof ASN1Sequence) {
                    var2 = ((ASN1Sequence) this.obj).getObjects();
                } else if ((this.obj instanceof ASN1Set)) {
                    var2 = ((ASN1Set) this.obj).getObjects();
                } else {
                    throw new ASN1Exception("not implemented: " + this.obj.getClass().getName());
                }
                while (var2.hasMoreElements()) {
                    arg0.writeObject((ASN1Encodable) var2.nextElement());
                }
            }
        }
        arg0.write(0);
        arg0.write(0);
    }
}
