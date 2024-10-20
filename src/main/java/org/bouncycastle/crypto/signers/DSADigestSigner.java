package org.bouncycastle.crypto.signers;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class DSADigestSigner implements Signer {

    public final Digest digest;

    public final DSA dsaSigner;

    public boolean forSigning;

    public void update(byte[] arg0, int arg1, int arg2) {
        this.digest.update(arg0, arg1, arg2);
    }

    public void init(boolean arg0, CipherParameters arg1) {
        this.forSigning = arg0;
        AsymmetricKeyParameter var3;
        if (arg1 instanceof ParametersWithRandom) {
            var3 = (AsymmetricKeyParameter) ((ParametersWithRandom) arg1).getParameters();
        } else {
            var3 = (AsymmetricKeyParameter) arg1;
        }
        if (arg0 && !var3.isPrivate()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        } else if (!arg0 && var3.isPrivate()) {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        } else {
            this.reset();
            this.dsaSigner.init(arg0, arg1);
        }
    }

    public void update(byte arg0) {
        this.digest.update(arg0);
    }

    public DSADigestSigner(DSA arg0, Digest arg1) {
        this.digest = arg1;
        this.dsaSigner = arg0;
    }

    public byte[] generateSignature() {
        if (!this.forSigning) {
            throw new IllegalStateException("DSADigestSigner not initialised for signature generation.");
        }
        byte[] var1 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var1, 0);
        BigInteger[] var2 = this.dsaSigner.generateSignature(var1);
        try {
            return this.derEncode(var2[0], var2[1]);
        } catch (IOException var4) {
            throw new IllegalStateException("unable to encode signature");
        }
    }

    public boolean verifySignature(byte[] arg0) {
        if (this.forSigning) {
            throw new IllegalStateException("DSADigestSigner not initialised for verification");
        }
        byte[] var2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(var2, 0);
        try {
            BigInteger[] var3 = this.derDecode(arg0);
            return this.dsaSigner.verifySignature(var2, var3[0], var3[1]);
        } catch (IOException var5) {
            return false;
        }
    }

    public void reset() {
        this.digest.reset();
    }

    public byte[] derEncode(BigInteger arg0, BigInteger arg1) throws IOException {
        ASN1EncodableVector var3 = new ASN1EncodableVector();
        var3.add(new ASN1Integer(arg0));
        var3.add(new ASN1Integer(arg1));
        return (new DERSequence(var3)).getEncoded("DER");
    }

    public BigInteger[] derDecode(byte[] arg0) throws IOException {
        ASN1Sequence var2 = (ASN1Sequence) ASN1Primitive.fromByteArray(arg0);
        return new BigInteger[] { ((ASN1Integer) var2.getObjectAt(0)).getValue(), ((ASN1Integer) var2.getObjectAt(1)).getValue() };
    }
}
