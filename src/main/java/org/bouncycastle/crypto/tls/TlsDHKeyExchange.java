package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

public class TlsDHKeyExchange extends AbstractTlsKeyExchange {

    public TlsSigner tlsSigner;

    public DHParameters dhParameters;

    public AsymmetricKeyParameter serverPublicKey;

    public DHPrivateKeyParameters dhAgreePrivateKey;

    public DHPublicKeyParameters dhAgreePublicKey;

    public TlsAgreementCredentials agreementCredentials;

    public TlsDHKeyExchange(int arg0, Vector arg1, DHParameters arg2) {
        super(arg0, arg1);
        switch(arg0) {
            case 3:
                this.tlsSigner = new TlsDSSSigner();
                break;
            case 4:
            case 6:
            case 8:
            default:
                throw new IllegalArgumentException("unsupported key exchange algorithm");
            case 5:
                this.tlsSigner = new TlsRSASigner();
                break;
            case 7:
            case 9:
                this.tlsSigner = null;
        }
        this.dhParameters = arg2;
    }

    public void processClientCertificate(Certificate arg0) throws IOException {
    }

    public void skipServerCredentials() throws IOException {
        throw new TlsFatalAlert((short) 10);
    }

    public int getMinimumPrimeBits() {
        return 1024;
    }

    public void processServerCertificate(Certificate arg0) throws IOException {
        if (arg0.isEmpty()) {
            throw new TlsFatalAlert((short) 42);
        }
        org.bouncycastle.asn1.x509.Certificate var2 = arg0.getCertificateAt(0);
        SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();
        try {
            this.serverPublicKey = PublicKeyFactory.createKey(var3);
        } catch (RuntimeException var7) {
            throw new TlsFatalAlert((short) 43, var7);
        }
        if (this.tlsSigner == null) {
            try {
                this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey((DHPublicKeyParameters) this.serverPublicKey);
                this.dhParameters = this.validateDHParameters(this.dhAgreePublicKey.getParameters());
            } catch (ClassCastException var6) {
                throw new TlsFatalAlert((short) 46, var6);
            }
            TlsUtils.validateKeyUsage(var2, 8);
        } else if (this.tlsSigner.isValidPublicKey(this.serverPublicKey)) {
            TlsUtils.validateKeyUsage(var2, 128);
        } else {
            throw new TlsFatalAlert((short) 46);
        }
        super.processServerCertificate(arg0);
    }

    public void validateCertificateRequest(CertificateRequest arg0) throws IOException {
        short[] var2 = arg0.getCertificateTypes();
        int var3 = 0;
        while (var3 < var2.length) {
            switch(var2[var3]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 64:
                    var3++;
                    break;
                default:
                    throw new TlsFatalAlert((short) 47);
            }
        }
    }

    public void processClientCredentials(TlsCredentials arg0) throws IOException {
        if (arg0 instanceof TlsAgreementCredentials) {
            this.agreementCredentials = (TlsAgreementCredentials) arg0;
        } else if (!(arg0 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public void generateClientKeyExchange(OutputStream arg0) throws IOException {
        if (this.agreementCredentials == null) {
            this.dhAgreePrivateKey = TlsDHUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.dhParameters, arg0);
        }
    }

    public boolean requiresServerKeyExchange() {
        switch(this.keyExchange) {
            case 3:
            case 5:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public void processClientKeyExchange(InputStream arg0) throws IOException {
        if (this.dhAgreePublicKey == null) {
            BigInteger var2 = TlsDHUtils.readDHParameter(arg0);
            this.dhAgreePublicKey = TlsDHUtils.validateDHPublicKey(new DHPublicKeyParameters(var2, this.dhParameters));
        }
    }

    public byte[] generatePremasterSecret() throws IOException {
        if (this.agreementCredentials != null) {
            return this.agreementCredentials.generateAgreement(this.dhAgreePublicKey);
        } else if (this.dhAgreePrivateKey == null) {
            throw new TlsFatalAlert((short) 80);
        } else {
            return TlsDHUtils.calculateDHBasicAgreement(this.dhAgreePublicKey, this.dhAgreePrivateKey);
        }
    }

    public void init(TlsContext arg0) {
        super.init(arg0);
        if (this.tlsSigner != null) {
            this.tlsSigner.init(arg0);
        }
    }

    public DHParameters validateDHParameters(DHParameters arg0) throws IOException {
        if (arg0.getP().bitLength() < this.getMinimumPrimeBits()) {
            throw new TlsFatalAlert((short) 71);
        }
        return TlsDHUtils.validateDHParameters(arg0);
    }
}
