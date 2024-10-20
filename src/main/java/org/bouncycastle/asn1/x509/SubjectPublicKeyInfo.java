package org.bouncycastle.asn1.x509;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERSequence;

public class SubjectPublicKeyInfo extends ASN1Object {

    public DERBitString keyData;

    public AlgorithmIdentifier algId;

    public static SubjectPublicKeyInfo getInstance(Object arg0) {
        if (arg0 instanceof SubjectPublicKeyInfo) {
            return (SubjectPublicKeyInfo) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new SubjectPublicKeyInfo(ASN1Sequence.getInstance(arg0));
        }
    }

    public static SubjectPublicKeyInfo getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    /**
     * @deprecated
     */
    public ASN1Primitive getPublicKey() throws IOException {
        ASN1InputStream var1 = new ASN1InputStream(this.keyData.getOctets());
        return var1.readObject();
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier arg0, byte[] arg1) {
        this.keyData = new DERBitString(arg1);
        this.algId = arg0;
    }

    /**
     * @deprecated
     */
    public SubjectPublicKeyInfo(ASN1Sequence arg0) {
        if (arg0.size() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + arg0.size());
        }
        Enumeration var2 = arg0.getObjects();
        this.algId = AlgorithmIdentifier.getInstance(var2.nextElement());
        this.keyData = DERBitString.getInstance(var2.nextElement());
    }

    public SubjectPublicKeyInfo(AlgorithmIdentifier arg0, ASN1Encodable arg1) throws IOException {
        this.keyData = new DERBitString(arg1);
        this.algId = arg0;
    }

    /**
     * @deprecated
     */
    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }

    public ASN1Primitive parsePublicKey() throws IOException {
        ASN1InputStream var1 = new ASN1InputStream(this.keyData.getOctets());
        return var1.readObject();
    }

    public AlgorithmIdentifier getAlgorithm() {
        return this.algId;
    }

    public DERBitString getPublicKeyData() {
        return this.keyData;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(this.algId);
        var1.add(this.keyData);
        return new DERSequence(var1);
    }
}
