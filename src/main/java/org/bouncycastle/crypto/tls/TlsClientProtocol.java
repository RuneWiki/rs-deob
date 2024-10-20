package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Arrays;

public class TlsClientProtocol extends TlsProtocol {

    public TlsClient tlsClient = null;

    public TlsClientContextImpl tlsClientContext = null;

    public byte[] selectedSessionID = null;

    public TlsKeyExchange keyExchange = null;

    public TlsAuthentication authentication = null;

    public CertificateStatus certificateStatus = null;

    public CertificateRequest certificateRequest = null;

    public void connect(TlsClient arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'tlsClient' cannot be null");
        } else if (this.tlsClient == null) {
            this.tlsClient = arg0;
            this.securityParameters = new SecurityParameters();
            this.securityParameters.entity = 1;
            this.tlsClientContext = new TlsClientContextImpl(this.secureRandom, this.securityParameters);
            this.securityParameters.clientRandom = createRandomBlock(arg0.shouldUseGMTUnixTime(), this.tlsClientContext.getNonceRandomGenerator());
            this.tlsClient.init(this.tlsClientContext);
            this.recordStream.init(this.tlsClientContext);
            TlsSession var2 = arg0.getSessionToResume();
            if (var2 != null && var2.isResumable()) {
                SessionParameters var3 = var2.exportSessionParameters();
                if (var3 != null) {
                    this.tlsSession = var2;
                    this.sessionParameters = var3;
                }
            }
            this.sendClientHelloMessage();
            this.connection_state = 1;
            this.blockForHandshake();
        } else {
            throw new IllegalStateException("'connect' can only be called once");
        }
    }

    public TlsClientProtocol(SecureRandom arg0) {
        super(arg0);
    }

    public void receiveServerHelloMessage(ByteArrayInputStream arg0) throws IOException {
        ProtocolVersion var2 = TlsUtils.readVersion(arg0);
        if (var2.isDTLS()) {
            throw new TlsFatalAlert((short) 47);
        } else if (var2.equals(this.recordStream.getReadVersion())) {
            ProtocolVersion var3 = this.getContext().getClientVersion();
            if (!var2.isEqualOrEarlierVersionOf(var3)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.recordStream.setWriteVersion(var2);
            this.getContextAdmin().setServerVersion(var2);
            this.tlsClient.notifyServerVersion(var2);
            this.securityParameters.serverRandom = TlsUtils.readFully(32, arg0);
            this.selectedSessionID = TlsUtils.readOpaque8(arg0);
            if (this.selectedSessionID.length > 32) {
                throw new TlsFatalAlert((short) 47);
            }
            this.tlsClient.notifySessionID(this.selectedSessionID);
            this.resumedSession = this.selectedSessionID.length > 0 && this.tlsSession != null && Arrays.areEqual(this.selectedSessionID, this.tlsSession.getSessionID());
            int var4 = TlsUtils.readUint16(arg0);
            if (!Arrays.contains(this.offeredCipherSuites, var4) || var4 == 0 || CipherSuite.isSCSV(var4) || !TlsUtils.isValidCipherSuiteForVersion(var4, this.getContext().getServerVersion())) {
                throw new TlsFatalAlert((short) 47);
            }
            this.tlsClient.notifySelectedCipherSuite(var4);
            short var5 = TlsUtils.readUint8(arg0);
            if (!Arrays.contains(this.offeredCompressionMethods, var5)) {
                throw new TlsFatalAlert((short) 47);
            }
            this.tlsClient.notifySelectedCompressionMethod(var5);
            this.serverExtensions = readExtensions(arg0);
            if (this.serverExtensions != null) {
                Enumeration var6 = this.serverExtensions.keys();
                while (var6.hasMoreElements()) {
                    Integer var7 = (Integer) var6.nextElement();
                    if (!var7.equals(EXT_RenegotiationInfo)) {
                        if (null == TlsUtils.getExtensionData(this.clientExtensions, var7)) {
                            throw new TlsFatalAlert((short) 110);
                        }
                        if (this.resumedSession) {
                        }
                    }
                }
            }
            byte[] var8 = TlsUtils.getExtensionData(this.serverExtensions, EXT_RenegotiationInfo);
            if (var8 != null) {
                this.secure_renegotiation = true;
                if (!Arrays.constantTimeAreEqual(var8, createRenegotiationInfo(TlsUtils.EMPTY_BYTES))) {
                    throw new TlsFatalAlert((short) 40);
                }
            }
            this.tlsClient.notifySecureRenegotiation(this.secure_renegotiation);
            Hashtable var9 = this.clientExtensions;
            Hashtable var10 = this.serverExtensions;
            if (this.resumedSession) {
                if (var4 != this.sessionParameters.getCipherSuite() || var5 != this.sessionParameters.getCompressionAlgorithm()) {
                    throw new TlsFatalAlert((short) 47);
                }
                var9 = null;
                var10 = this.sessionParameters.readServerExtensions();
            }
            this.securityParameters.cipherSuite = var4;
            this.securityParameters.compressionAlgorithm = var5;
            if (var10 != null) {
                boolean var11 = TlsExtensionsUtils.hasEncryptThenMACExtension(var10);
                if (var11 && !TlsUtils.isBlockCipherSuite(var4)) {
                    throw new TlsFatalAlert((short) 47);
                }
                this.securityParameters.encryptThenMAC = var11;
                this.securityParameters.extendedMasterSecret = TlsExtensionsUtils.hasExtendedMasterSecretExtension(var10);
                this.securityParameters.maxFragmentLength = this.processMaxFragmentLengthExtension(var9, var10, (short) 47);
                this.securityParameters.truncatedHMac = TlsExtensionsUtils.hasTruncatedHMacExtension(var10);
                this.allowCertificateStatus = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(var10, TlsExtensionsUtils.EXT_status_request, (short) 47);
                this.expectSessionTicket = !this.resumedSession && TlsUtils.hasExpectedEmptyExtensionData(var10, TlsProtocol.EXT_SessionTicket, (short) 47);
            }
            if (var9 != null) {
                this.tlsClient.processServerExtensions(var10);
            }
            this.securityParameters.prfAlgorithm = getPRFAlgorithm(this.getContext(), this.securityParameters.getCipherSuite());
            this.securityParameters.verifyDataLength = 12;
        } else {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public TlsClientProtocol(InputStream arg0, OutputStream arg1, SecureRandom arg2) {
        super(arg0, arg1, arg2);
    }

    public TlsContext getContext() {
        return this.tlsClientContext;
    }

    public AbstractTlsContext getContextAdmin() {
        return this.tlsClientContext;
    }

    public TlsPeer getPeer() {
        return this.tlsClient;
    }

    public void handleHandshakeMessage(short arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream var3 = new ByteArrayInputStream(arg1);
        if (!this.resumedSession) {
            switch(arg0) {
                case 0:
                    assertEmpty(var3);
                    if (this.connection_state == 16) {
                        this.refuseRenegotiation();
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                default:
                    throw new TlsFatalAlert((short) 10);
                case 2:
                    switch(this.connection_state) {
                        case 1:
                            this.receiveServerHelloMessage(var3);
                            this.connection_state = 2;
                            this.recordStream.notifyHelloComplete();
                            this.applyMaxFragmentLengthExtension();
                            if (this.resumedSession) {
                                this.securityParameters.masterSecret = Arrays.clone(this.sessionParameters.getMasterSecret());
                                this.recordStream.setPendingConnectionState(this.getPeer().getCompression(), this.getPeer().getCipher());
                                this.sendChangeCipherSpecMessage();
                            } else {
                                this.invalidateSession();
                                if (this.selectedSessionID.length > 0) {
                                    this.tlsSession = new TlsSessionImpl(this.selectedSessionID, (SessionParameters) null);
                                    return;
                                }
                            }
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 4:
                    switch(this.connection_state) {
                        case 13:
                            if (!this.expectSessionTicket) {
                                throw new TlsFatalAlert((short) 10);
                            }
                            this.invalidateSession();
                            this.receiveNewSessionTicketMessage(var3);
                            this.connection_state = 14;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 11:
                    switch(this.connection_state) {
                        case 2:
                            this.handleSupplementalData((Vector) null);
                        case 3:
                            break;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                    this.peerCertificate = Certificate.parse(var3);
                    assertEmpty(var3);
                    if (this.peerCertificate == null || this.peerCertificate.isEmpty()) {
                        this.allowCertificateStatus = false;
                    }
                    this.keyExchange.processServerCertificate(this.peerCertificate);
                    this.authentication = this.tlsClient.getAuthentication();
                    this.authentication.notifyServerCertificate(this.peerCertificate);
                    this.connection_state = 4;
                    break;
                case 12:
                    switch(this.connection_state) {
                        case 2:
                            this.handleSupplementalData((Vector) null);
                        case 3:
                            this.keyExchange.skipServerCredentials();
                            this.authentication = null;
                        case 4:
                        case 5:
                            this.keyExchange.processServerKeyExchange(var3);
                            assertEmpty(var3);
                            this.connection_state = 6;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 13:
                    switch(this.connection_state) {
                        case 4:
                        case 5:
                            this.keyExchange.skipServerKeyExchange();
                        case 6:
                            if (this.authentication == null) {
                                throw new TlsFatalAlert((short) 40);
                            }
                            this.certificateRequest = CertificateRequest.parse(this.getContext(), var3);
                            assertEmpty(var3);
                            this.keyExchange.validateCertificateRequest(this.certificateRequest);
                            TlsUtils.trackHashAlgorithms(this.recordStream.getHandshakeHash(), this.certificateRequest.getSupportedSignatureAlgorithms());
                            this.connection_state = 7;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 14:
                    switch(this.connection_state) {
                        case 2:
                            this.handleSupplementalData((Vector) null);
                        case 3:
                            this.keyExchange.skipServerCredentials();
                            this.authentication = null;
                        case 4:
                        case 5:
                            this.keyExchange.skipServerKeyExchange();
                        case 6:
                        case 7:
                            assertEmpty(var3);
                            this.connection_state = 8;
                            this.recordStream.getHandshakeHash().sealHashAlgorithms();
                            Vector var4 = this.tlsClient.getClientSupplementalData();
                            if (var4 != null) {
                                this.sendSupplementalDataMessage(var4);
                            }
                            this.connection_state = 9;
                            TlsCredentials var5 = null;
                            if (this.certificateRequest == null) {
                                this.keyExchange.skipClientCredentials();
                            } else {
                                var5 = this.authentication.getClientCredentials(this.certificateRequest);
                                if (var5 == null) {
                                    this.keyExchange.skipClientCredentials();
                                    this.sendCertificateMessage(Certificate.EMPTY_CHAIN);
                                } else {
                                    this.keyExchange.processClientCredentials(var5);
                                    this.sendCertificateMessage(var5.getCertificate());
                                }
                            }
                            this.connection_state = 10;
                            this.sendClientKeyExchangeMessage();
                            this.connection_state = 11;
                            TlsHandshakeHash var6 = this.recordStream.prepareToFinish();
                            this.securityParameters.sessionHash = getCurrentPRFHash(this.getContext(), var6, (byte[]) null);
                            establishMasterSecret(this.getContext(), this.keyExchange);
                            this.recordStream.setPendingConnectionState(this.getPeer().getCompression(), this.getPeer().getCipher());
                            if (var5 != null && var5 instanceof TlsSignerCredentials) {
                                TlsSignerCredentials var7 = (TlsSignerCredentials) var5;
                                SignatureAndHashAlgorithm var8 = TlsUtils.getSignatureAndHashAlgorithm(this.getContext(), var7);
                                byte[] var9;
                                if (var8 == null) {
                                    var9 = this.securityParameters.getSessionHash();
                                } else {
                                    var9 = var6.getFinalHash(var8.getHash());
                                }
                                byte[] var10 = var7.generateCertificateSignature(var9);
                                DigitallySigned var11 = new DigitallySigned(var8, var10);
                                this.sendCertificateVerifyMessage(var11);
                                this.connection_state = 12;
                            }
                            this.sendChangeCipherSpecMessage();
                            this.sendFinishedMessage();
                            this.connection_state = 13;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 40);
                    }
                case 20:
                    switch(this.connection_state) {
                        case 13:
                            if (this.expectSessionTicket) {
                                throw new TlsFatalAlert((short) 10);
                            }
                        case 14:
                            this.processFinishedMessage(var3);
                            this.connection_state = 15;
                            this.connection_state = 16;
                            this.completeHandshake();
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 22:
                    switch(this.connection_state) {
                        case 4:
                            if (!this.allowCertificateStatus) {
                                throw new TlsFatalAlert((short) 10);
                            }
                            this.certificateStatus = CertificateStatus.parse(var3);
                            assertEmpty(var3);
                            this.connection_state = 5;
                            return;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
                case 23:
                    switch(this.connection_state) {
                        case 2:
                            this.handleSupplementalData(readSupplementalDataMessage(var3));
                            break;
                        default:
                            throw new TlsFatalAlert((short) 10);
                    }
            }
        } else if (arg0 == 20 && this.connection_state == 2) {
            this.processFinishedMessage(var3);
            this.connection_state = 15;
            this.sendFinishedMessage();
            this.connection_state = 13;
            this.connection_state = 16;
            this.completeHandshake();
        } else {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void handleSupplementalData(Vector arg0) throws IOException {
        this.tlsClient.processServerSupplementalData(arg0);
        this.connection_state = 3;
        this.keyExchange = this.tlsClient.getKeyExchange();
        this.keyExchange.init(this.getContext());
    }

    public void receiveNewSessionTicketMessage(ByteArrayInputStream arg0) throws IOException {
        NewSessionTicket var2 = NewSessionTicket.parse(arg0);
        assertEmpty(arg0);
        this.tlsClient.notifyNewSessionTicket(var2);
    }

    public void sendClientHelloMessage() throws IOException {
        this.recordStream.setWriteVersion(this.tlsClient.getClientHelloRecordLayerVersion());
        ProtocolVersion var1 = this.tlsClient.getClientVersion();
        if (var1.isDTLS()) {
            throw new TlsFatalAlert((short) 80);
        }
        this.getContextAdmin().setClientVersion(var1);
        byte[] var2 = TlsUtils.EMPTY_BYTES;
        if (this.tlsSession != null) {
            var2 = this.tlsSession.getSessionID();
            if (var2 == null || var2.length > 32) {
                var2 = TlsUtils.EMPTY_BYTES;
            }
        }
        boolean var3 = this.tlsClient.isFallback();
        this.offeredCipherSuites = this.tlsClient.getCipherSuites();
        this.offeredCompressionMethods = this.tlsClient.getCompressionMethods();
        if (var2.length > 0 && this.sessionParameters != null && (!Arrays.contains(this.offeredCipherSuites, this.sessionParameters.getCipherSuite()) || !Arrays.contains(this.offeredCompressionMethods, this.sessionParameters.getCompressionAlgorithm()))) {
            var2 = TlsUtils.EMPTY_BYTES;
        }
        this.clientExtensions = this.tlsClient.getClientExtensions();
        TlsProtocol.HandshakeMessage var4 = new TlsProtocol.HandshakeMessage((short) 1);
        TlsUtils.writeVersion(var1, var4);
        var4.write(this.securityParameters.getClientRandom());
        TlsUtils.writeOpaque8(var2, var4);
        byte[] var5 = TlsUtils.getExtensionData(this.clientExtensions, EXT_RenegotiationInfo);
        boolean var6 = var5 == null;
        boolean var7 = !Arrays.contains((int[]) this.offeredCipherSuites, (int) 255);
        if (var6 && var7) {
            this.offeredCipherSuites = Arrays.append((int[]) this.offeredCipherSuites, (int) 255);
        }
        if (var3 && !Arrays.contains((int[]) this.offeredCipherSuites, (int) 22016)) {
            this.offeredCipherSuites = Arrays.append((int[]) this.offeredCipherSuites, (int) 22016);
        }
        TlsUtils.writeUint16ArrayWithUint16Length(this.offeredCipherSuites, var4);
        TlsUtils.writeUint8ArrayWithUint8Length(this.offeredCompressionMethods, var4);
        if (this.clientExtensions != null) {
            writeExtensions(var4, this.clientExtensions);
        }
        var4.writeToRecordStream();
    }

    public void sendCertificateVerifyMessage(DigitallySigned arg0) throws IOException {
        TlsProtocol.HandshakeMessage var2 = new TlsProtocol.HandshakeMessage((short) 15);
        arg0.encode(var2);
        var2.writeToRecordStream();
    }

    public void cleanupHandshake() {
        super.cleanupHandshake();
        this.selectedSessionID = null;
        this.keyExchange = null;
        this.authentication = null;
        this.certificateStatus = null;
        this.certificateRequest = null;
    }

    public void sendClientKeyExchangeMessage() throws IOException {
        TlsProtocol.HandshakeMessage var1 = new TlsProtocol.HandshakeMessage((short) 16);
        this.keyExchange.generateClientKeyExchange(var1);
        var1.writeToRecordStream();
    }
}
