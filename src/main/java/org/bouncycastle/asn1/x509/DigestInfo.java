package org.bouncycastle.asn1.x509;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

public class DigestInfo extends ASN1Object {

    public byte[] digest;

    public AlgorithmIdentifier algId;

    public static DigestInfo getInstance(Object arg0) {
        if (arg0 instanceof DigestInfo) {
            return (DigestInfo) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new DigestInfo(ASN1Sequence.getInstance(arg0));
        }
    }

    public DigestInfo(AlgorithmIdentifier arg0, byte[] arg1) {
        this.digest = arg1;
        this.algId = arg0;
    }

    public static DigestInfo getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    public DigestInfo(ASN1Sequence arg0) {
        Enumeration var2 = arg0.getObjects();
        this.algId = AlgorithmIdentifier.getInstance(var2.nextElement());
        this.digest = ASN1OctetString.getInstance(var2.nextElement()).getOctets();
    }

    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }

    public byte[] getDigest() {
        return this.digest;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.algId);
        var1.add(new DEROctetString(this.digest));
        return new DERSequence(var1);
    }
}
