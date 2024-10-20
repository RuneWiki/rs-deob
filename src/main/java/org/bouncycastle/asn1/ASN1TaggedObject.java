package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1TaggedObject extends ASN1Primitive implements ASN1TaggedObjectParser {

    public boolean empty = false;

    public boolean explicit = true;

    public ASN1Encodable obj = null;

    public int tagNo;

    public static ASN1TaggedObject getInstance(ASN1TaggedObject arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException("implicitly tagged tagged object");
        }
        return (ASN1TaggedObject) arg0.getObject();
    }

    public static ASN1TaggedObject getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1TaggedObject)) {
            return (ASN1TaggedObject) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return getInstance(fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var2) {
                throw new IllegalArgumentException("failed to construct tagged object from byte[]: " + var2.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String agt() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (!(arg0 instanceof ASN1TaggedObject)) {
            return false;
        }
        ASN1TaggedObject var2 = (ASN1TaggedObject) arg0;
        if (this.tagNo != var2.tagNo || this.empty != var2.empty || this.explicit != var2.explicit) {
            return false;
        }
        if (this.obj == null) {
            if (var2.obj != null) {
                return false;
            }
        } else if (!this.obj.toASN1Primitive().equals(var2.obj.toASN1Primitive())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int var1 = this.tagNo;
        if (this.obj != null) {
            var1 ^= this.obj.hashCode();
        }
        return var1;
    }

    public ASN1TaggedObject(boolean arg0, int arg1, ASN1Encodable arg2) {
        if (arg2 instanceof ASN1Choice) {
            this.explicit = true;
        } else {
            this.explicit = arg0;
        }
        this.tagNo = arg1;
        if (this.explicit) {
            this.obj = arg2;
        } else {
            ASN1Primitive var4 = arg2.toASN1Primitive();
            if (var4 instanceof ASN1Set) {
                Object var5 = null;
            }
            this.obj = arg2;
        }
    }

    public boolean isExplicit() {
        return this.explicit;
    }

    public int agp() {
        int var1 = this.tagNo;
        if (this.obj != null) {
            var1 ^= this.obj.hashCode();
        }
        return var1;
    }

    public ASN1Primitive getObject() {
        return this.obj == null ? null : this.obj.toASN1Primitive();
    }

    public ASN1Encodable getObjectParser(int arg0, boolean arg1) throws IOException {
        switch(arg0) {
            case 4:
                return ASN1OctetString.getInstance(this, arg1).parser();
            case 16:
                return ASN1Sequence.getInstance(this, arg1).parser();
            case 17:
                return ASN1Set.getInstance(this, arg1).parser();
            default:
                if (arg1) {
                    return this.getObject();
                } else {
                    throw new ASN1Exception("implicit tagging not implemented for tag: " + arg0);
                }
        }
    }

    public ASN1Primitive getLoadedObject() {
        return this.toASN1Primitive();
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public ASN1Primitive toDLObject() {
        return new DLTaggedObject(this.explicit, this.tagNo, this.obj);
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public String toString() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public int agk() {
        int var1 = this.tagNo;
        if (this.obj != null) {
            var1 ^= this.obj.hashCode();
        }
        return var1;
    }

    public int agb() {
        int var1 = this.tagNo;
        if (this.obj != null) {
            var1 ^= this.obj.hashCode();
        }
        return var1;
    }

    public int age() {
        int var1 = this.tagNo;
        if (this.obj != null) {
            var1 ^= this.obj.hashCode();
        }
        return var1;
    }

    public String agx() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public ASN1Primitive toDERObject() {
        return new DERTaggedObject(this.explicit, this.tagNo, this.obj);
    }

    public int getTagNo() {
        return this.tagNo;
    }

    public String ags() {
        return "[" + this.tagNo + "]" + this.obj;
    }

    public String agv() {
        return "[" + this.tagNo + "]" + this.obj;
    }
}
