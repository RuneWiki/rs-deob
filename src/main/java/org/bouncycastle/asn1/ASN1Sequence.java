package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

public abstract class ASN1Sequence extends ASN1Primitive implements Iterable {

    public Vector seq = new Vector();

    public int adz() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
    }

    public static ASN1Sequence getInstance(ASN1TaggedObject arg0, boolean arg1) {
        if (arg1) {
            if (!arg0.isExplicit()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return getInstance(arg0.getObject().toASN1Primitive());
        } else if (arg0.isExplicit()) {
            return arg0 instanceof BERTaggedObject ? new BERSequence(arg0.getObject()) : new DLSequence(arg0.getObject());
        } else if (arg0.getObject() instanceof ASN1Sequence) {
            return (ASN1Sequence) arg0.getObject();
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String toString() {
        return this.seq.toString();
    }

    public ASN1Sequence(ASN1Encodable arg0) {
        this.seq.addElement(arg0);
    }

    public static ASN1Sequence getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1Sequence)) {
            return (ASN1Sequence) arg0;
        } else if (arg0 instanceof ASN1SequenceParser) {
            return getInstance(((ASN1SequenceParser) arg0).toASN1Primitive());
        } else if (arg0 instanceof byte[]) {
            try {
                return getInstance(fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + var3.getMessage());
            }
        } else {
            if (arg0 instanceof ASN1Encodable) {
                ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
                if (var2 instanceof ASN1Sequence) {
                    return (ASN1Sequence) var2;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public ASN1Sequence(ASN1Encodable[] arg0) {
        for (int var2 = 0; var2 != arg0.length; var2++) {
            this.seq.addElement(arg0[var2]);
        }
    }

    public ASN1Encodable[] toArray() {
        ASN1Encodable[] var1 = new ASN1Encodable[this.size()];
        for (int var2 = 0; var2 != this.size(); var2++) {
            var1[var2] = this.getObjectAt(var2);
        }
        return var1;
    }

    public String ado() {
        return this.seq.toString();
    }

    public Iterator iterator() {
        return new Arrays.Iterator(this.toArray());
    }

    public ASN1Sequence() {
    }

    public int size() {
        return this.seq.size();
    }

    public int hashCode() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (!(arg0 instanceof ASN1Sequence)) {
            return false;
        }
        ASN1Sequence var2 = (ASN1Sequence) arg0;
        if (this.size() != var2.size()) {
            return false;
        }
        Enumeration var3 = this.getObjects();
        Enumeration var4 = var2.getObjects();
        ASN1Primitive var7;
        ASN1Primitive var8;
        do {
            if (!var3.hasMoreElements()) {
                return true;
            }
            ASN1Encodable var5 = this.getNext(var3);
            ASN1Encodable var6 = this.getNext(var4);
            var7 = var5.toASN1Primitive();
            var8 = var6.toASN1Primitive();
        } while (var7 == var8 || var7.equals(var8));
        return false;
    }

    public ASN1Encodable getNext(Enumeration arg0) {
        return (ASN1Encodable) arg0.nextElement();
    }

    public ASN1SequenceParser parser() {
        return new ASN1SequenceParser() {

            public final int max = ASN1Sequence.this.size();

            public int index;

            public ASN1Primitive toASN1Primitive() {
                return ASN1Sequence.this;
            }

            public ASN1Encodable readObject() throws IOException {
                if (this.max == this.index) {
                    return null;
                }
                ASN1Encodable var1 = ASN1Sequence.this.getObjectAt(this.index++);
                if (var1 instanceof ASN1Sequence) {
                    return ((ASN1Sequence) var1).parser();
                } else if (var1 instanceof ASN1Set) {
                    return ((ASN1Set) var1).parser();
                } else {
                    return var1;
                }
            }

            public ASN1Primitive getLoadedObject() {
                return ASN1Sequence.this;
            }
        };
    }

    public Enumeration getObjects() {
        return this.seq.elements();
    }

    public boolean isConstructed() {
        return true;
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public ASN1Primitive toDERObject() {
        DERSequence var1 = new DERSequence();
        var1.seq = this.seq;
        return var1;
    }

    public ASN1Encodable getObjectAt(int arg0) {
        return (ASN1Encodable) this.seq.elementAt(arg0);
    }

    public ASN1Primitive toDLObject() {
        DLSequence var1 = new DLSequence();
        var1.seq = this.seq;
        return var1;
    }

    public int adm() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
    }

    public ASN1Sequence(ASN1EncodableVector arg0) {
        for (int var2 = 0; var2 != arg0.size(); var2++) {
            this.seq.addElement(arg0.get(var2));
        }
    }

    public String adb() {
        return this.seq.toString();
    }

    public Iterator al() {
        return new Arrays.Iterator(this.toArray());
    }
}
