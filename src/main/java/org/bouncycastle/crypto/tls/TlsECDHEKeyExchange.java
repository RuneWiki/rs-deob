package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.util.io.TeeInputStream;

public class TlsECDHEKeyExchange extends TlsECDHKeyExchange {

    public TlsSignerCredentials serverCredentials = null;

    public byte[] generateServerKeyExchange() throws IOException {
        DigestInputBuffer var1 = new DigestInputBuffer();
        this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.namedCurves, this.clientECPointFormats, var1);
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

    public Signer initVerifyer(TlsSigner arg0, SignatureAndHashAlgorithm arg1, SecurityParameters arg2) {
        Signer var4 = arg0.createVerifyer(arg1, this.serverPublicKey);
        var4.update(arg2.clientRandom, 0, arg2.clientRandom.length);
        var4.update(arg2.serverRandom, 0, arg2.serverRandom.length);
        return var4;
    }

    public void processServerKeyExchange(InputStream arg0) throws IOException {
        SecurityParameters var2 = this.context.getSecurityParameters();
        SignerInputBuffer var3 = new SignerInputBuffer();
        TeeInputStream var4 = new TeeInputStream(arg0, var3);
        ECDomainParameters var5 = TlsECCUtils.readECParameters(this.namedCurves, this.clientECPointFormats, var4);
        byte[] var6 = TlsUtils.readOpaque8(var4);
        DigitallySigned var7 = this.parseSignature(arg0);
        Signer var8 = this.initVerifyer(this.tlsSigner, var7.getAlgorithm(), var2);
        var3.updateSigner(var8);
        if (!var8.verifySignature(var7.getSignature())) {
            throw new TlsFatalAlert((short) 51);
        }
        this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.clientECPointFormats, var5, var6));
    }

    public void validateCertificateRequest(CertificateRequest arg0) throws IOException {
        short[] var2 = arg0.getCertificateTypes();
        int var3 = 0;
        while (var3 < var2.length) {
            switch(var2[var3]) {
                case 1:
                case 2:
                case 64:
                    var3++;
                    break;
                default:
                    throw new TlsFatalAlert((short) 47);
            }
        }
    }

    public void processClientCredentials(TlsCredentials arg0) throws IOException {
        if (!(arg0 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public TlsECDHEKeyExchange(int arg0, Vector arg1, int[] arg2, short[] arg3, short[] arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }
}
