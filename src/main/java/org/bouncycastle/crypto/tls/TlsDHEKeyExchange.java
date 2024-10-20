package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.io.TeeInputStream;

public class TlsDHEKeyExchange extends TlsDHKeyExchange {

    public TlsSignerCredentials serverCredentials = null;

    public Signer initVerifyer(TlsSigner arg0, SignatureAndHashAlgorithm arg1, SecurityParameters arg2) {
        Signer var4 = arg0.createVerifyer(arg1, this.serverPublicKey);
        var4.update(arg2.clientRandom, 0, arg2.clientRandom.length);
        var4.update(arg2.serverRandom, 0, arg2.serverRandom.length);
        return var4;
    }

    public TlsDHEKeyExchange(int arg0, Vector arg1, DHParameters arg2) {
        super(arg0, arg1, arg2);
    }

    public byte[] generateServerKeyExchange() throws IOException {
        if (this.dhParameters == null) {
            throw new TlsFatalAlert((short) 80);
        }
        DigestInputBuffer var1 = new DigestInputBuffer();
        this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.dhParameters, var1);
        SignatureAndHashAlgorithm var2 = TlsUtils.getSignatureAndHashAlgorithm(this.context, this.serverCredentials);
        Digest var3 = TlsUtils.createHash(var2);
        SecurityParameters var4 = this.context.getSecurityParameters();
        var3.update(var4.clientRandom, 0, var4.clientRandom.length);
        var3.update(var4.serverRandom, 0, var4.serverRandom.length);
        var1.updateDigest(var3);
        byte[] var5 = new byte[var3.getDigestSize()];
        var3.doFinal(var5, 0);
        byte[] var6 = this.serverCredentials.generateCertificateSignature(var5);
        DigitallySigned var7 = new DigitallySigned(var2, var6);
        var7.encode(var1);
        return var1.toByteArray();
    }

    public void processServerCredentials(TlsCredentials arg0) throws IOException {
        if (!(arg0 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.processServerCertificate(arg0.getCertificate());
        this.serverCredentials = (TlsSignerCredentials) arg0;
    }

    public void processServerKeyExchange(InputStream arg0) throws IOException {
        SecurityParameters var2 = this.context.getSecurityParameters();
        SignerInputBuffer var3 = new SignerInputBuffer();
        TeeInputStream var4 = new TeeInputStream(arg0, var3);
        ServerDHParams var5 = ServerDHParams.parse(var4);
        DigitallySigned var6 = this.parseSignature(arg0);
        Signer var7 = this.initVerifyer(this.tlsSigner, var6.getAlgorithm(), var2);
        var3.updateSigner(var7);
        if (!var7.verifySignature(var6.getSignature())) {
            throw new TlsFatalAlert((short) 51);
        }
        this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(var5.getPublicKey());
        this.dhParameters = this.validateDHParameters(this.dhAgreePublicKey.getParameters());
    }
}
