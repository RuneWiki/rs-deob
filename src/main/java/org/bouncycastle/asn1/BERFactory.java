package org.bouncycastle.asn1;

public class BERFactory {

    public static final BERSequence EMPTY_SEQUENCE = new BERSequence();

    public static final BERSet EMPTY_SET = new BERSet();

    public static BERSequence createSequence(ASN1EncodableVector arg0) {
        return arg0.size() < 1 ? EMPTY_SEQUENCE : new BERSequence(arg0);
    }

    public static BERSet createSet(ASN1EncodableVector arg0) {
        return arg0.size() < 1 ? EMPTY_SET : new BERSet(arg0);
    }
}
