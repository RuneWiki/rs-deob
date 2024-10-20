package org.bouncycastle.asn1.pkcs;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

public class PrivateKeyInfo extends ASN1Object {

    public ASN1OctetString privKey;

    public AlgorithmIdentifier algId;

    public ASN1Set attributes;

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector var1 = new ASN1EncodableVector();
        var1.add(new ASN1Integer(0L));
        var1.add(this.algId);
        var1.add(this.privKey);
        if (this.attributes != null) {
            var1.add(new DERTaggedObject(false, 0, this.attributes));
        }
        return new DERSequence(var1);
    }

    public static PrivateKeyInfo getInstance(Object arg0) {
        if (arg0 instanceof PrivateKeyInfo) {
            return (PrivateKeyInfo) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new PrivateKeyInfo(ASN1Sequence.getInstance(arg0));
        }
    }

    public PrivateKeyInfo(AlgorithmIdentifier arg0, ASN1Encodable arg1) throws IOException {
        this(arg0, arg1, (ASN1Set) null);
    }

    public PrivateKeyInfo(AlgorithmIdentifier arg0, ASN1Encodable arg1, ASN1Set arg2) throws IOException {
        this.privKey = new DEROctetString(arg1.toASN1Primitive().getEncoded("DER"));
        this.algId = arg0;
        this.attributes = arg2;
    }

    public AlgorithmIdentifier getPrivateKeyAlgorithm() {
        return this.algId;
    }

    public static PrivateKeyInfo getInstance(ASN1TaggedObject arg0, boolean arg1) {
        return getInstance(ASN1Sequence.getInstance(arg0, arg1));
    }

    /**
     * @deprecated
     */
    public PrivateKeyInfo(ASN1Sequence arg0) {
        Enumeration var2 = arg0.getObjects();
        BigInteger var3 = ((ASN1Integer) var2.nextElement()).getValue();
        if (var3.intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.algId = AlgorithmIdentifier.getInstance(var2.nextElement());
        this.privKey = ASN1OctetString.getInstance(var2.nextElement());
        if (var2.hasMoreElements()) {
            this.attributes = ASN1Set.getInstance((ASN1TaggedObject) var2.nextElement(), false);
        }
    }

    public ASN1Encodable parsePrivateKey() throws IOException {
        return ASN1Primitive.fromByteArray(this.privKey.getOctets());
    }

    /**
     * @deprecated
     */
    public ASN1Primitive getPrivateKey() {
        try {
            return this.parsePrivateKey().toASN1Primitive();
        } catch (IOException var2) {
            throw new IllegalStateException("unable to parse private key");
        }
    }

    public ASN1Set getAttributes() {
        return this.attributes;
    }

    /**
     * @deprecated
     */
    public AlgorithmIdentifier getAlgorithmId() {
        return this.algId;
    }
}
