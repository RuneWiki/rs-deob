package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DERExternal extends ASN1Primitive {

    public ASN1ObjectIdentifier directReference;

    public ASN1Integer indirectReference;

    public ASN1Primitive dataValueDescriptor;

    public ASN1Primitive externalContent;

    public int encoding;

    public void setEncoding(int arg0) {
        if (arg0 < 0 || arg0 > 2) {
            throw new IllegalArgumentException("invalid encoding value: " + arg0);
        }
        this.encoding = arg0;
    }

    public void setIndirectReference(ASN1Integer arg0) {
        this.indirectReference = arg0;
    }

    public DERExternal(ASN1ObjectIdentifier arg0, ASN1Integer arg1, ASN1Primitive arg2, DERTaggedObject arg3) {
        this(arg0, arg1, arg2, arg3.getTagNo(), arg3.toASN1Primitive());
    }

    public DERExternal(ASN1ObjectIdentifier arg0, ASN1Integer arg1, ASN1Primitive arg2, int arg3, ASN1Primitive arg4) {
        this.setDirectReference(arg0);
        this.setIndirectReference(arg1);
        this.setDataValueDescriptor(arg2);
        this.setEncoding(arg3);
        this.setExternalContent(arg4.toASN1Primitive());
    }

    public void setDirectReference(ASN1ObjectIdentifier arg0) {
        this.directReference = arg0;
    }

    public boolean isConstructed() {
        return true;
    }

    public int encodedLength() throws IOException {
        return this.getEncoded().length;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        if (this.directReference != null) {
            var2.write(this.directReference.getEncoded("DER"));
        }
        if (this.indirectReference != null) {
            var2.write(this.indirectReference.getEncoded("DER"));
        }
        if (this.dataValueDescriptor != null) {
            var2.write(this.dataValueDescriptor.getEncoded("DER"));
        }
        DERTaggedObject var3 = new DERTaggedObject(true, this.encoding, this.externalContent);
        var2.write(var3.getEncoded("DER"));
        arg0.writeEncoded(32, 8, var2.toByteArray());
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (!(arg0 instanceof DERExternal)) {
            return false;
        } else if (this == arg0) {
            return true;
        } else {
            DERExternal var2 = (DERExternal) arg0;
            if (this.directReference != null && (var2.directReference == null || !var2.directReference.equals(this.directReference))) {
                return false;
            } else if (this.indirectReference == null || var2.indirectReference != null && var2.indirectReference.equals(this.indirectReference)) {
                return this.dataValueDescriptor == null || var2.dataValueDescriptor != null && var2.dataValueDescriptor.equals(this.dataValueDescriptor) ? this.externalContent.equals(var2.externalContent) : false;
            } else {
                return false;
            }
        }
    }

    public ASN1Primitive getDataValueDescriptor() {
        return this.dataValueDescriptor;
    }

    public ASN1Primitive getObjFromVector(ASN1EncodableVector arg0, int arg1) {
        if (arg0.size() <= arg1) {
            throw new IllegalArgumentException("too few objects in input vector");
        }
        return arg0.get(arg1).toASN1Primitive();
    }

    public int getEncoding() {
        return this.encoding;
    }

    public ASN1Primitive getExternalContent() {
        return this.externalContent;
    }

    public ASN1Integer getIndirectReference() {
        return this.indirectReference;
    }

    public void setDataValueDescriptor(ASN1Primitive arg0) {
        this.dataValueDescriptor = arg0;
    }

    public int hashCode() {
        int var1 = 0;
        if (this.directReference != null) {
            var1 = this.directReference.hashCode();
        }
        if (this.indirectReference != null) {
            var1 ^= this.indirectReference.hashCode();
        }
        if (this.dataValueDescriptor != null) {
            var1 ^= this.dataValueDescriptor.hashCode();
        }
        return var1 ^ this.externalContent.hashCode();
    }

    public DERExternal(ASN1EncodableVector arg0) {
        int var2 = 0;
        ASN1Primitive var3 = this.getObjFromVector(arg0, var2);
        if (var3 instanceof ASN1ObjectIdentifier) {
            this.directReference = (ASN1ObjectIdentifier) var3;
            var2++;
            var3 = this.getObjFromVector(arg0, var2);
        }
        if (var3 instanceof ASN1Integer) {
            this.indirectReference = (ASN1Integer) var3;
            var2++;
            var3 = this.getObjFromVector(arg0, var2);
        }
        if (!(var3 instanceof ASN1TaggedObject)) {
            this.dataValueDescriptor = var3;
            var2++;
            var3 = this.getObjFromVector(arg0, var2);
        }
        if (arg0.size() != var2 + 1) {
            throw new IllegalArgumentException("input vector too large");
        } else if ((var3 instanceof ASN1TaggedObject)) {
            ASN1TaggedObject var4 = (ASN1TaggedObject) var3;
            this.setEncoding(var4.getTagNo());
            this.externalContent = var4.getObject();
        } else {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
    }

    public void setExternalContent(ASN1Primitive arg0) {
        this.externalContent = arg0;
    }

    public int adh() {
        int var1 = 0;
        if (this.directReference != null) {
            var1 = this.directReference.hashCode();
        }
        if (this.indirectReference != null) {
            var1 ^= this.indirectReference.hashCode();
        }
        if (this.dataValueDescriptor != null) {
            var1 ^= this.dataValueDescriptor.hashCode();
        }
        return var1 ^ this.externalContent.hashCode();
    }

    public int ada() {
        int var1 = 0;
        if (this.directReference != null) {
            var1 = this.directReference.hashCode();
        }
        if (this.indirectReference != null) {
            var1 ^= this.indirectReference.hashCode();
        }
        if (this.dataValueDescriptor != null) {
            var1 ^= this.dataValueDescriptor.hashCode();
        }
        return var1 ^ this.externalContent.hashCode();
    }

    public ASN1ObjectIdentifier getDirectReference() {
        return this.directReference;
    }

    public int adb() {
        int var1 = 0;
        if (this.directReference != null) {
            var1 = this.directReference.hashCode();
        }
        if (this.indirectReference != null) {
            var1 ^= this.indirectReference.hashCode();
        }
        if (this.dataValueDescriptor != null) {
            var1 ^= this.dataValueDescriptor.hashCode();
        }
        return var1 ^ this.externalContent.hashCode();
    }
}
