package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.util.io.Streams;

public class TlsRSAKeyExchange extends AbstractTlsKeyExchange {

    public AsymmetricKeyParameter serverPublicKey = null;

    public RSAKeyParameters rsaServerPublicKey = null;

    public TlsEncryptionCredentials serverCredentials = null;

    public byte[] premasterSecret;

    public void skipServerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    public RSAKeyParameters validateRSAPublicKey(RSAKeyParameters arg0) throws IOException {
        if (!arg0.getExponent().isProbablePrime(2)) {
            throw new TlsFatalAlert((short) 47);
        }
        return arg0;
    }

    public void processServerCredentials(TlsCredentials arg0) throws IOException {
        if (!(arg0 instanceof TlsEncryptionCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
        this.processServerCertificate(arg0.getCertificate());
        this.serverCredentials = (TlsEncryptionCredentials) arg0;
    }

    public void processServerCertificate(Certificate arg0) throws IOException {
        if (arg0.isEmpty()) {
            throw new TlsFatalAlert((short) 42);
        }
        org.bouncycastle.asn1.x509.Certificate var2 = arg0.getCertificateAt(0);
        SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();
        try {
            this.serverPublicKey = PublicKeyFactory.createKey(var3);
        } catch (RuntimeException var5) {
            throw new TlsFatalAlert((short) 43, var5);
        }
        if (this.serverPublicKey.isPrivate()) {
            throw new TlsFatalAlert((short) 80);
        }
        this.rsaServerPublicKey = this.validateRSAPublicKey((RSAKeyParameters) this.serverPublicKey);
        TlsUtils.validateKeyUsage(var2, 32);
        super.processServerCertificate(arg0);
    }

    public TlsRSAKeyExchange(Vector arg0) {
        super(1, arg0);
    }

    public void processClientCredentials(TlsCredentials arg0) throws IOException {
        if (!(arg0 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public void generateClientKeyExchange(OutputStream arg0) throws IOException {
        this.premasterSecret = TlsRSAUtils.generateEncryptedPreMasterSecret(this.context, this.rsaServerPublicKey, arg0);
    }

    public void processClientKeyExchange(InputStream arg0) throws IOException {
        byte[] var2;
        if (TlsUtils.isSSL(this.context)) {
            var2 = Streams.readAll(arg0);
        } else {
            var2 = TlsUtils.readOpaque16(arg0);
        }
        this.premasterSecret = this.serverCredentials.decryptPreMasterSecret(var2);
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

    public byte[] generatePremasterSecret() throws IOException {
        if (this.premasterSecret == null) {
            throw new TlsFatalAlert((short) 80);
        }
        byte[] var1 = this.premasterSecret;
        this.premasterSecret = null;
        return var1;
    }
}
