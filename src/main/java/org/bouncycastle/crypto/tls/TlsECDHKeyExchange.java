package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.PublicKeyFactory;

public class TlsECDHKeyExchange extends AbstractTlsKeyExchange {

    public TlsSigner tlsSigner;

    public int[] namedCurves;

    public short[] clientECPointFormats;

    public short[] serverECPointFormats;

    public AsymmetricKeyParameter serverPublicKey;

    public ECPrivateKeyParameters ecAgreePrivateKey;

    public ECPublicKeyParameters ecAgreePublicKey;

    public TlsAgreementCredentials agreementCredentials;

    public void processClientCertificate(Certificate arg0) throws IOException {
        if (this.keyExchange == 20) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void init(TlsContext arg0) {
        super.init(arg0);
        if (this.tlsSigner != null) {
            this.tlsSigner.init(arg0);
        }
    }

    public void processServerCertificate(Certificate arg0) throws IOException {
        if (this.keyExchange == 20) {
            throw new TlsFatalAlert((short) 10);
        } else if (arg0.isEmpty()) {
            throw new TlsFatalAlert((short) 42);
        } else {
            org.bouncycastle.asn1.x509.Certificate var2 = arg0.getCertificateAt(0);
            SubjectPublicKeyInfo var3 = var2.getSubjectPublicKeyInfo();
            try {
                this.serverPublicKey = PublicKeyFactory.createKey(var3);
            } catch (RuntimeException var7) {
                throw new TlsFatalAlert((short) 43, var7);
            }
            if (this.tlsSigner == null) {
                try {
                    this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey((ECPublicKeyParameters) this.serverPublicKey);
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
    }

    public TlsECDHKeyExchange(int arg0, Vector arg1, int[] arg2, short[] arg3, short[] arg4) {
        super(arg0, arg1);
        switch(arg0) {
            case 16:
            case 18:
            case 20:
                this.tlsSigner = null;
                break;
            case 17:
                this.tlsSigner = new TlsECDSASigner();
                break;
            case 19:
                this.tlsSigner = new TlsRSASigner();
                break;
            default:
                throw new IllegalArgumentException("unsupported key exchange algorithm");
        }
        this.namedCurves = arg2;
        this.clientECPointFormats = arg3;
        this.serverECPointFormats = arg4;
    }

    public boolean requiresServerKeyExchange() {
        switch(this.keyExchange) {
            case 17:
            case 19:
            case 20:
                return true;
            case 18:
            default:
                return false;
        }
    }

    public byte[] generateServerKeyExchange() throws IOException {
        if (this.requiresServerKeyExchange()) {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralServerKeyExchange(this.context.getSecureRandom(), this.namedCurves, this.clientECPointFormats, var1);
            return var1.toByteArray();
        } else {
            return null;
        }
    }

    public void processServerKeyExchange(InputStream arg0) throws IOException {
        if (!this.requiresServerKeyExchange()) {
            throw new TlsFatalAlert((short) 10);
        }
        ECDomainParameters var2 = TlsECCUtils.readECParameters(this.namedCurves, this.clientECPointFormats, arg0);
        byte[] var3 = TlsUtils.readOpaque8(arg0);
        this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.clientECPointFormats, var2, var3));
    }

    public void generateClientKeyExchange(OutputStream arg0) throws IOException {
        if (this.agreementCredentials == null) {
            this.ecAgreePrivateKey = TlsECCUtils.generateEphemeralClientKeyExchange(this.context.getSecureRandom(), this.serverECPointFormats, this.ecAgreePublicKey.getParameters(), arg0);
        }
    }

    public void processClientCredentials(TlsCredentials arg0) throws IOException {
        if (this.keyExchange == 20) {
            throw new TlsFatalAlert((short) 80);
        } else if (arg0 instanceof TlsAgreementCredentials) {
            this.agreementCredentials = (TlsAgreementCredentials) arg0;
        } else if (!(arg0 instanceof TlsSignerCredentials)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public void skipServerCredentials() throws IOException {
        if (this.keyExchange != 20) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void validateCertificateRequest(CertificateRequest arg0) throws IOException {
        short[] var2 = arg0.getCertificateTypes();
        int var3 = 0;
        while (var3 < var2.length) {
            switch(var2[var3]) {
                case 1:
                case 2:
                case 64:
                case 65:
                case 66:
                    var3++;
                    break;
                default:
                    throw new TlsFatalAlert((short) 47);
            }
        }
    }

    public void processClientKeyExchange(InputStream arg0) throws IOException {
        if (this.ecAgreePublicKey == null) {
            byte[] var2 = TlsUtils.readOpaque8(arg0);
            ECDomainParameters var3 = this.ecAgreePrivateKey.getParameters();
            this.ecAgreePublicKey = TlsECCUtils.validateECPublicKey(TlsECCUtils.deserializeECPublicKey(this.serverECPointFormats, var3, var2));
        }
    }

    public byte[] generatePremasterSecret() throws IOException {
        if (this.agreementCredentials != null) {
            return this.agreementCredentials.generateAgreement(this.ecAgreePublicKey);
        } else if (this.ecAgreePrivateKey == null) {
            throw new TlsFatalAlert((short) 80);
        } else {
            return TlsECCUtils.calculateECDHBasicAgreement(this.ecAgreePublicKey, this.ecAgreePrivateKey);
        }
    }
}
