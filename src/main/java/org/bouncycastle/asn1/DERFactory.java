package org.bouncycastle.asn1;

public class DERFactory {

    public static final ASN1Sequence EMPTY_SEQUENCE = new DERSequence();

    public static final ASN1Set EMPTY_SET = new DERSet();

    public static ASN1Sequence createSequence(ASN1EncodableVector arg0) {
        return arg0.size() < 1 ? EMPTY_SEQUENCE : new DLSequence(arg0);
    }

    public static ASN1Set createSet(ASN1EncodableVector arg0) {
        return arg0.size() < 1 ? EMPTY_SET : new DLSet(arg0);
    }
}
