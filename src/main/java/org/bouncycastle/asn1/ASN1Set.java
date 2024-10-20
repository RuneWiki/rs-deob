package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Iterable;

public abstract class ASN1Set extends ASN1Primitive implements Iterable {

    public Vector set = new Vector();

    public boolean isSorted = false;

    public void sort() {
        if (this.isSorted) {
            return;
        }
        this.isSorted = true;
        if (this.set.size() <= 1) {
            return;
        }
        boolean var1 = true;
        int var2 = this.set.size() - 1;
        while (var1) {
            int var3 = 0;
            int var4 = 0;
            byte[] var5 = this.getDEREncoded((ASN1Encodable) this.set.elementAt(0));
            var1 = false;
            while (var2 != var3) {
                byte[] var6 = this.getDEREncoded((ASN1Encodable) this.set.elementAt(var3 + 1));
                if (this.lessThanOrEqual(var5, var6)) {
                    var5 = var6;
                } else {
                    Object var7 = this.set.elementAt(var3);
                    this.set.setElementAt(this.set.elementAt(var3 + 1), var3);
                    this.set.setElementAt(var7, var3 + 1);
                    var1 = true;
                    var4 = var3;
                }
                var3++;
            }
            var2 = var4;
        }
    }

    public static ASN1Set getInstance(ASN1TaggedObject arg0, boolean arg1) {
        if (arg1) {
            if (!arg0.isExplicit()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return (ASN1Set) arg0.getObject();
        } else if (arg0.isExplicit()) {
            return arg0 instanceof BERTaggedObject ? new BERSet(arg0.getObject()) : new DLSet(arg0.getObject());
        } else if (arg0.getObject() instanceof ASN1Set) {
            return (ASN1Set) arg0.getObject();
        } else if (arg0.getObject() instanceof ASN1Sequence) {
            ASN1Sequence var2 = (ASN1Sequence) arg0.getObject();
            return arg0 instanceof BERTaggedObject ? new BERSet(var2.toArray()) : new DLSet(var2.toArray());
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public Iterator ac() {
        return new Arrays.Iterator(this.toArray());
    }

    public ASN1Set(ASN1EncodableVector arg0, boolean arg1) {
        for (int var3 = 0; var3 != arg0.size(); var3++) {
            this.set.addElement(arg0.get(var3));
        }
        if (arg1) {
            this.sort();
        }
    }

    public String aej() {
        return this.set.toString();
    }

    public int ada() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
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

    public ASN1Encodable getObjectAt(int arg0) {
        return (ASN1Encodable) this.set.elementAt(arg0);
    }

    public Enumeration getObjects() {
        return this.set.elements();
    }

    public ASN1Encodable[] toArray() {
        ASN1Encodable[] var1 = new ASN1Encodable[this.size()];
        for (int var2 = 0; var2 != this.size(); var2++) {
            var1[var2] = this.getObjectAt(var2);
        }
        return var1;
    }

    public ASN1SetParser parser() {
        return new ASN1SetParser() {

            public final int max = ASN1Set.this.size();

            public int index;

            public ASN1Encodable readObject() throws IOException {
                if (this.max == this.index) {
                    return null;
                }
                ASN1Encodable var1 = ASN1Set.this.getObjectAt(this.index++);
                if (var1 instanceof ASN1Sequence) {
                    return ((ASN1Sequence) var1).parser();
                } else if (var1 instanceof ASN1Set) {
                    return ((ASN1Set) var1).parser();
                } else {
                    return var1;
                }
            }

            public ASN1Primitive getLoadedObject() {
                return ASN1Set.this;
            }

            public ASN1Primitive toASN1Primitive() {
                return ASN1Set.this;
            }
        };
    }

    public Iterator iterator() {
        return new Arrays.Iterator(this.toArray());
    }

    public ASN1Primitive toDERObject() {
        if (this.isSorted) {
            DERSet var1 = new DERSet();
            var1.set = this.set;
            return var1;
        }
        Vector var2 = new Vector();
        for (int var3 = 0; var3 != this.set.size(); var3++) {
            var2.addElement(this.set.elementAt(var3));
        }
        DERSet var4 = new DERSet();
        var4.set = var2;
        var4.sort();
        return var4;
    }

    public ASN1Primitive toDLObject() {
        DLSet var1 = new DLSet();
        var1.set = this.set;
        return var1;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (!(arg0 instanceof ASN1Set)) {
            return false;
        }
        ASN1Set var2 = (ASN1Set) arg0;
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
        ASN1Encodable var2 = (ASN1Encodable) arg0.nextElement();
        return (ASN1Encodable) (var2 == null ? DERNull.INSTANCE : var2);
    }

    public boolean lessThanOrEqual(byte[] arg0, byte[] arg1) {
        int var3 = Math.min(arg0.length, arg1.length);
        for (int var4 = 0; var4 != var3; var4++) {
            if (arg0[var4] != arg1[var4]) {
                return (arg0[var4] & 0xFF) < (arg1[var4] & 0xFF);
            }
        }
        return arg0.length == var3;
    }

    public byte[] getDEREncoded(ASN1Encodable arg0) {
        try {
            return arg0.toASN1Primitive().getEncoded("DER");
        } catch (IOException var3) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public ASN1Set(ASN1Encodable arg0) {
        this.set.addElement(arg0);
    }

    public int adf() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
    }

    public static ASN1Set getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1Set)) {
            return (ASN1Set) arg0;
        } else if (arg0 instanceof ASN1SetParser) {
            return getInstance(((ASN1SetParser) arg0).toASN1Primitive());
        } else if (arg0 instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + var3.getMessage());
            }
        } else {
            if (arg0 instanceof ASN1Encodable) {
                ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
                if (var2 instanceof ASN1Set) {
                    return (ASN1Set) var2;
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String toString() {
        return this.set.toString();
    }

    public ASN1Set() {
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public ASN1Set(ASN1Encodable[] arg0, boolean arg1) {
        for (int var3 = 0; var3 != arg0.length; var3++) {
            this.set.addElement(arg0[var3]);
        }
        if (arg1) {
            this.sort();
        }
    }

    public boolean isConstructed() {
        return true;
    }

    public String aem() {
        return this.set.toString();
    }

    public int size() {
        return this.set.size();
    }

    public String aeh() {
        return this.set.toString();
    }

    public Iterator aq() {
        return new Arrays.Iterator(this.toArray());
    }

    public Iterator ay() {
        return new Arrays.Iterator(this.toArray());
    }

    public int ade() {
        Enumeration var1 = this.getObjects();
        int var2 = this.size();
        while (var1.hasMoreElements()) {
            ASN1Encodable var3 = this.getNext(var1);
            int var4 = var2 * 17;
            var2 = var4 ^ var3.hashCode();
        }
        return var2;
    }
}
