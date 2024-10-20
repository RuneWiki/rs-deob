package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class Extensions extends ASN1Object {

    public Hashtable extensions = new Hashtable();

    public Vector ordering = new Vector();

    public ASN1ObjectIdentifier[] toOidArray(Vector arg0) {
        ASN1ObjectIdentifier[] var2 = new ASN1ObjectIdentifier[arg0.size()];
        for (int var3 = 0; var3 != var2.length; var3++) {
            var2[var3] = (ASN1ObjectIdentifier) arg0.elementAt(var3);
        }
        return var2;
    }

    public Extension getExtension(ASN1ObjectIdentifier arg0) {
        return (Extension) this.extensions.get(arg0);
    }

    public Extensions(ASN1Sequence arg0) {
        Enumeration var2 = arg0.getObjects();
        while (var2.hasMoreElements()) {
            Extension var3 = Extension.getInstance(var2.nextElement());
            this.extensions.put(var3.getExtnId(), var3);
            this.ordering.addElement(var3.getExtnId());
        }
    }

    public Extensions(Extension arg0) {
        this.ordering.addElement(arg0.getExtnId());
        this.extensions.put(arg0.getExtnId(), arg0);
    }

    public Extensions(Extension[] arg0) {
        for (int var2 = 0; var2 != arg0.length; var2++) {
            Extension var3 = arg0[var2];
            this.ordering.addElement(var3.getExtnId());
            this.extensions.put(var3.getExtnId(), var3);
        }
    }

    public static Extensions getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public boolean equivalent(Extensions arg0) {
        if (this.extensions.size() != arg0.extensions.size()) {
            return false;
        }
        Enumeration var2 = this.extensions.keys();
        Object var3;
        do {
            if (!var2.hasMoreElements()) {
                return true;
            }
            var3 = var2.nextElement();
        } while (this.extensions.get(var3).equals(arg0.extensions.get(var3)));
        return false;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        Enumeration var2 = this.ordering.elements();
        while (var2.hasMoreElements()) {
            ASN1ObjectIdentifier var3 = (ASN1ObjectIdentifier) var2.nextElement();
            Extension var4 = (Extension) this.extensions.get(var3);
            var1.add(var4);
        }
        return new DERSequence(var1);
    }

    public Enumeration oids() {
        return this.ordering.elements();
    }

    public static Extensions getInstance(Object arg0) {
        if (arg0 instanceof Extensions) {
            return (Extensions) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new Extensions(ASN1Sequence.getInstance(arg0));
        }
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        return this.toOidArray(this.ordering);
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return this.getExtensionOIDs(false);
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return this.getExtensionOIDs(true);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs(boolean arg0) {
        Vector var2 = new Vector();
        for (int var3 = 0; var3 != this.ordering.size(); var3++) {
            Object var4 = this.ordering.elementAt(var3);
            if (((Extension) this.extensions.get(var4)).isCritical() == arg0) {
                var2.addElement(var4);
            }
        }
        return this.toOidArray(var2);
    }

    public ASN1Encodable getExtensionParsedValue(ASN1ObjectIdentifier arg0) {
        Extension var2 = this.getExtension(arg0);
        return var2 == null ? null : var2.getParsedValue();
    }
}
