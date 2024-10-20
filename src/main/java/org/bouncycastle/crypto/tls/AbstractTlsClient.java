package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public abstract class AbstractTlsClient extends AbstractTlsPeer implements TlsClient {

    public TlsCipherFactory cipherFactory;

    public int selectedCipherSuite;

    public Vector supportedSignatureAlgorithms;

    public TlsClientContext context;

    public short selectedCompressionMethod;

    public int[] namedCurves;

    public short[] clientECPointFormats;

    public short[] serverECPointFormats;

    public TlsCompression getCompression() throws IOException {
        switch(this.selectedCompressionMethod) {
            case 0:
                return new TlsNullCompression();
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public AbstractTlsClient() {
        this(new DefaultTlsCipherFactory());
    }

    public boolean allowUnexpectedServerExtension(Integer arg0, byte[] arg1) throws IOException {
        switch(arg0) {
            case 10:
                TlsECCUtils.readSupportedEllipticCurvesExtension(arg1);
                return true;
            default:
                return false;
        }
    }

    public AbstractTlsClient(TlsCipherFactory arg0) {
        this.cipherFactory = arg0;
    }

    public void init(TlsClientContext arg0) {
        this.context = arg0;
    }

    public void notifyNewSessionTicket(NewSessionTicket arg0) throws IOException {
    }

    public Hashtable getClientExtensions() throws IOException {
        Hashtable var1 = null;
        ProtocolVersion var2 = this.context.getClientVersion();
        if (TlsUtils.isSignatureAlgorithmsExtensionAllowed(var2)) {
            this.supportedSignatureAlgorithms = TlsUtils.getDefaultSupportedSignatureAlgorithms();
            var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
            TlsUtils.addSignatureAlgorithmsExtension(var1, this.supportedSignatureAlgorithms);
        }
        if (TlsECCUtils.containsECCCipherSuites(this.getCipherSuites())) {
            this.namedCurves = new int[] { 23, 24 };
            this.clientECPointFormats = new short[] { 0, 1, 2 };
            var1 = TlsExtensionsUtils.ensureExtensionsInitialised(var1);
            TlsECCUtils.addSupportedEllipticCurvesExtension(var1, this.namedCurves);
            TlsECCUtils.addSupportedPointFormatsExtension(var1, this.clientECPointFormats);
        }
        return var1;
    }

    public void checkForUnexpectedServerExtension(Hashtable arg0, Integer arg1) throws IOException {
        byte[] var3 = TlsUtils.getExtensionData(arg0, arg1);
        if (var3 != null && !this.allowUnexpectedServerExtension(arg1, var3)) {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public TlsCipher getCipher() throws IOException {
        int var1 = TlsUtils.getEncryptionAlgorithm(this.selectedCipherSuite);
        int var2 = TlsUtils.getMACAlgorithm(this.selectedCipherSuite);
        return this.cipherFactory.createCipher(this.context, var1, var2);
    }

    public ProtocolVersion getClientVersion() {
        return ProtocolVersion.TLSv12;
    }

    public ProtocolVersion getMinimumVersion() {
        return ProtocolVersion.TLSv10;
    }

    public void notifyServerVersion(ProtocolVersion arg0) throws IOException {
        if (!this.getMinimumVersion().isEqualOrEarlierVersionOf(arg0)) {
            throw new TlsFatalAlert((short) 70);
        }
    }

    public short[] getCompressionMethods() {
        return new short[] { 0 };
    }

    public void notifySessionID(byte[] arg0) {
    }

    public void notifySelectedCipherSuite(int arg0) {
        this.selectedCipherSuite = arg0;
    }

    public void notifySelectedCompressionMethod(short arg0) {
        this.selectedCompressionMethod = arg0;
    }

    public void processServerExtensions(Hashtable arg0) throws IOException {
        if (arg0 == null) {
            return;
        }
        this.checkForUnexpectedServerExtension(arg0, TlsUtils.EXT_signature_algorithms);
        this.checkForUnexpectedServerExtension(arg0, TlsECCUtils.EXT_elliptic_curves);
        if (TlsECCUtils.isECCCipherSuite(this.selectedCipherSuite)) {
            this.serverECPointFormats = TlsECCUtils.getSupportedPointFormatsExtension(arg0);
        } else {
            this.checkForUnexpectedServerExtension(arg0, TlsECCUtils.EXT_ec_point_formats);
        }
        this.checkForUnexpectedServerExtension(arg0, TlsExtensionsUtils.EXT_padding);
    }

    public void processServerSupplementalData(Vector arg0) throws IOException {
        if (arg0 != null) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public Vector getClientSupplementalData() throws IOException {
        return null;
    }

    public TlsSession getSessionToResume() {
        return null;
    }

    public ProtocolVersion getClientHelloRecordLayerVersion() {
        return this.getClientVersion();
    }

    public boolean isFallback() {
        return false;
    }
}
