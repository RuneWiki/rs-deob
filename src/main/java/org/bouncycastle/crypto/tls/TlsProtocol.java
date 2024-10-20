package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.prng.RandomGenerator;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;

public abstract class TlsProtocol {

    public ByteQueue applicationDataQueue = new ByteQueue();

    public ByteQueue alertQueue = new ByteQueue(2);

    public ByteQueue handshakeQueue = new ByteQueue();

    public TlsInputStream tlsInputStream = null;

    public TlsOutputStream tlsOutputStream = null;

    public volatile boolean closed = false;

    public volatile boolean failedWithError = false;

    public volatile boolean appDataReady = false;

    public volatile boolean appDataSplitEnabled = true;

    public volatile int appDataSplitMode = 0;

    public byte[] expected_verify_data = null;

    public TlsSession tlsSession = null;

    public SessionParameters sessionParameters = null;

    public SecurityParameters securityParameters = null;

    public Certificate peerCertificate = null;

    public int[] offeredCipherSuites = null;

    public short[] offeredCompressionMethods = null;

    public Hashtable clientExtensions = null;

    public Hashtable serverExtensions = null;

    public short connection_state = 0;

    public boolean resumedSession = false;

    public boolean receivedChangeCipherSpec = false;

    public boolean secure_renegotiation = false;

    public boolean allowCertificateStatus = false;

    public boolean expectSessionTicket = false;

    public boolean blocking;

    public ByteQueueInputStream inputBuffers;

    public ByteQueueOutputStream outputBuffer;

    public RecordStream recordStream;

    public SecureRandom secureRandom;

    public static final Integer EXT_RenegotiationInfo = Integers.valueOf(65281);

    public static final Integer EXT_SessionTicket = Integers.valueOf(35);

    public static final String TLS_ERROR_MESSAGE = "Internal TLS error, this could be an attack";

    public static final short ADS_MODE_0_N = 1;

    public static final short ADS_MODE_0_N_FIRSTONLY = 2;

    public static final short ADS_MODE_1_Nsub1 = 0;

    public static final short CS_CERTIFICATE_REQUEST = 7;

    public static final short CS_CERTIFICATE_STATUS = 5;

    public static final short CS_CERTIFICATE_VERIFY = 12;

    public static final short CS_CLIENT_CERTIFICATE = 10;

    public static final short CS_CLIENT_FINISHED = 13;

    public static final short CS_CLIENT_HELLO = 1;

    public static final short CS_CLIENT_KEY_EXCHANGE = 11;

    public static final short CS_CLIENT_SUPPLEMENTAL_DATA = 9;

    public static final short CS_END = 16;

    public static final short CS_SERVER_CERTIFICATE = 4;

    public static final short CS_SERVER_FINISHED = 15;

    public static final short CS_SERVER_HELLO = 2;

    public static final short CS_SERVER_HELLO_DONE = 8;

    public static final short CS_SERVER_KEY_EXCHANGE = 6;

    public static final short CS_SERVER_SESSION_TICKET = 14;

    public static final short CS_SERVER_SUPPLEMENTAL_DATA = 3;

    public static final short CS_START = 0;

    public static int getPRFAlgorithm(TlsContext arg0, int arg1) throws IOException {
        boolean var2 = TlsUtils.isTLSv12(arg0);
        switch(arg1) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 156:
            case 158:
            case 160:
            case 162:
            case 164:
            case 168:
            case 170:
            case 172:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 49187:
            case 49189:
            case 49191:
            case 49193:
            case 49195:
            case 49197:
            case 49199:
            case 49201:
            case 49266:
            case 49268:
            case 49270:
            case 49272:
            case 49274:
            case 49276:
            case 49278:
            case 49280:
            case 49282:
            case 49284:
            case 49286:
            case 49288:
            case 49290:
            case 49292:
            case 49294:
            case 49296:
            case 49298:
            case 49308:
            case 49309:
            case 49310:
            case 49311:
            case 49312:
            case 49313:
            case 49314:
            case 49315:
            case 49316:
            case 49317:
            case 49318:
            case 49319:
            case 49320:
            case 49321:
            case 49322:
            case 49323:
            case 49324:
            case 49325:
            case 49326:
            case 49327:
            case 52392:
            case 52393:
            case 52394:
            case 52395:
            case 52396:
            case 52397:
            case 52398:
            case 65280:
            case 65281:
            case 65282:
            case 65283:
            case 65284:
            case 65285:
            case 65296:
            case 65297:
            case 65298:
            case 65299:
            case 65300:
            case 65301:
                if (var2) {
                    return 1;
                }
                throw new TlsFatalAlert((short) 47);
            case 157:
            case 159:
            case 161:
            case 163:
            case 165:
            case 169:
            case 171:
            case 173:
            case 49188:
            case 49190:
            case 49192:
            case 49194:
            case 49196:
            case 49198:
            case 49200:
            case 49202:
            case 49267:
            case 49269:
            case 49271:
            case 49273:
            case 49275:
            case 49277:
            case 49279:
            case 49281:
            case 49283:
            case 49285:
            case 49287:
            case 49289:
            case 49291:
            case 49293:
            case 49295:
            case 49297:
            case 49299:
                if (var2) {
                    return 2;
                }
                throw new TlsFatalAlert((short) 47);
            case 175:
            case 177:
            case 179:
            case 181:
            case 183:
            case 185:
            case 49208:
            case 49211:
            case 49301:
            case 49303:
            case 49305:
            case 49307:
                if (var2) {
                    return 2;
                }
                return 0;
            default:
                return var2 ? 1 : 0;
        }
    }

    public TlsProtocol(SecureRandom arg0) {
        this.blocking = false;
        this.inputBuffers = new ByteQueueInputStream();
        this.outputBuffer = new ByteQueueOutputStream();
        this.recordStream = new RecordStream(this, this.inputBuffers, this.outputBuffer);
        this.secureRandom = arg0;
    }

    public abstract TlsContext getContext();

    public abstract AbstractTlsContext getContextAdmin();

    public abstract TlsPeer getPeer();

    public void handleChangeCipherSpecMessage() throws IOException {
    }

    public abstract void handleHandshakeMessage(short arg0, byte[] arg1) throws IOException;

    public void handleWarningMessage(short arg0) throws IOException {
    }

    public void applyMaxFragmentLengthExtension() throws IOException {
        if (this.securityParameters.maxFragmentLength < 0) {
            return;
        }
        if (!MaxFragmentLength.isValid(this.securityParameters.maxFragmentLength)) {
            throw new TlsFatalAlert((short) 80);
        }
        int var1 = 0x1 << this.securityParameters.maxFragmentLength + 8;
        this.recordStream.setPlaintextLimit(var1);
    }

    public void checkReceivedChangeCipherSpec(boolean arg0) throws IOException {
        if (this.receivedChangeCipherSpec != arg0) {
            throw new TlsFatalAlert((short) 10);
        }
    }

    public void cleanupHandshake() {
        if (this.expected_verify_data != null) {
            Arrays.fill((byte[]) this.expected_verify_data, (byte) 0);
            this.expected_verify_data = null;
        }
        this.securityParameters.clear();
        this.peerCertificate = null;
        this.offeredCipherSuites = null;
        this.offeredCompressionMethods = null;
        this.clientExtensions = null;
        this.serverExtensions = null;
        this.resumedSession = false;
        this.receivedChangeCipherSpec = false;
        this.secure_renegotiation = false;
        this.allowCertificateStatus = false;
        this.expectSessionTicket = false;
    }

    public void blockForHandshake() throws IOException {
        if (!this.blocking) {
            return;
        }
        while (this.connection_state != 16) {
            if (this.closed) {
            }
            this.safeReadRecord();
        }
    }

    public void completeHandshake() throws IOException {
        try {
            this.recordStream.finaliseHandshake();
            this.appDataSplitEnabled = !TlsUtils.isTLSv11(this.getContext());
            if (!this.appDataReady) {
                this.appDataReady = true;
                if (this.blocking) {
                    this.tlsInputStream = new TlsInputStream(this);
                    this.tlsOutputStream = new TlsOutputStream(this);
                }
            }
            if (this.tlsSession != null) {
                if (this.sessionParameters == null) {
                    this.sessionParameters = (new SessionParameters.Builder()).setCipherSuite(this.securityParameters.getCipherSuite()).setCompressionAlgorithm(this.securityParameters.getCompressionAlgorithm()).setMasterSecret(this.securityParameters.getMasterSecret()).setPeerCertificate(this.peerCertificate).setPSKIdentity(this.securityParameters.getPSKIdentity()).setSRPIdentity(this.securityParameters.getSRPIdentity()).setServerExtensions(this.serverExtensions).build();
                    this.tlsSession = new TlsSessionImpl(this.tlsSession.getSessionID(), this.sessionParameters);
                }
                this.getContextAdmin().setResumableSession(this.tlsSession);
            }
            this.getPeer().notifyHandshakeComplete();
        } finally {
            this.cleanupHandshake();
        }
    }

    public void processRecord(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        switch(arg0) {
            case 20:
                this.processChangeCipherSpec(arg1, arg2, arg3);
                break;
            case 21:
                this.alertQueue.addData(arg1, arg2, arg3);
                this.processAlert();
                break;
            case 22:
                this.handshakeQueue.addData(arg1, arg2, arg3);
                this.processHandshake();
                break;
            case 23:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
                this.applicationDataQueue.addData(arg1, arg2, arg3);
                this.processApplicationData();
                break;
            case 24:
                if (!this.appDataReady) {
                    throw new TlsFatalAlert((short) 10);
                }
        }
    }

    public void processHandshake() throws IOException {
        boolean var1;
        do {
            var1 = false;
            if (this.handshakeQueue.available() >= 4) {
                byte[] var2 = new byte[4];
                this.handshakeQueue.read(var2, 0, 4, 0);
                short var3 = TlsUtils.readUint8(var2, 0);
                int var4 = TlsUtils.readUint24(var2, 1);
                if (this.handshakeQueue.available() >= var4 + 4) {
                    byte[] var5 = this.handshakeQueue.removeData(var4, 4);
                    this.checkReceivedChangeCipherSpec(this.connection_state == 16 || var3 == 20);
                    switch(var3) {
                        case 20:
                            TlsContext var6 = this.getContext();
                            if (this.expected_verify_data == null && var6.getSecurityParameters().getMasterSecret() != null) {
                                this.expected_verify_data = this.createVerifyData(!var6.isServer());
                            }
                        default:
                            this.recordStream.updateHandshakeData(var2, 0, 4);
                            this.recordStream.updateHandshakeData(var5, 0, var4);
                        case 0:
                            this.handleHandshakeMessage(var3, var5);
                            var1 = true;
                    }
                }
            }
        } while (var1);
    }

    public void processApplicationData() {
    }

    public void offerOutput(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use offerOutput() in blocking mode! Use getOutputStream() instead.");
        } else if (this.appDataReady) {
            this.writeData(arg0, arg1, arg2);
        } else {
            throw new IOException("Application data cannot be sent until the handshake is complete!");
        }
    }

    public void processChangeCipherSpec(byte[] arg0, int arg1, int arg2) throws IOException {
        for (int var4 = 0; var4 < arg2; var4++) {
            short var5 = TlsUtils.readUint8(arg0, arg1 + var4);
            if (var5 != 1) {
                throw new TlsFatalAlert((short) 50);
            }
            if (this.receivedChangeCipherSpec || this.alertQueue.available() > 0 || this.handshakeQueue.available() > 0) {
                throw new TlsFatalAlert((short) 10);
            }
            this.recordStream.receivedReadCipherSpec();
            this.receivedChangeCipherSpec = true;
            this.handleChangeCipherSpecMessage();
        }
    }

    public InputStream getInputStream() {
        if (!this.blocking) {
            throw new IllegalStateException("Cannot use InputStream in non-blocking mode! Use offerInput() instead.");
        }
        return this.tlsInputStream;
    }

    public int readApplicationData(byte[] arg0, int arg1, int arg2) throws IOException {
        if (arg2 < 1) {
            return 0;
        }
        while (this.applicationDataQueue.available() == 0) {
            if (this.closed) {
                if (this.failedWithError) {
                    throw new IOException("Internal TLS error, this could be an attack");
                }
                return -1;
            }
            this.safeReadRecord();
        }
        int var4 = Math.min(arg2, this.applicationDataQueue.available());
        this.applicationDataQueue.removeData(arg0, arg1, var4, 0);
        return var4;
    }

    public void writeData(byte[] arg0, int arg1, int arg2) throws IOException {
        if (!this.closed) {
            while (arg2 > 0) {
                if (this.appDataSplitEnabled) {
                    switch(this.appDataSplitMode) {
                        case 0:
                        default:
                            this.safeWriteRecord((short) 23, arg0, arg1, 1);
                            arg1++;
                            arg2--;
                            break;
                        case 2:
                            this.appDataSplitEnabled = false;
                        case 1:
                            this.safeWriteRecord((short) 23, TlsUtils.EMPTY_BYTES, 0, 0);
                    }
                }
                if (arg2 > 0) {
                    int var4 = Math.min(arg2, this.recordStream.getPlaintextLimit());
                    this.safeWriteRecord((short) 23, arg0, arg1, var4);
                    arg1 += var4;
                    arg2 -= var4;
                }
            }
        } else if (this.failedWithError) {
            throw new IOException("Internal TLS error, this could be an attack");
        } else {
            throw new IOException("Sorry, connection has been closed, you cannot write more data");
        }
    }

    public void safeWriteRecord(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            this.recordStream.writeRecord(arg0, arg1, arg2, arg3);
        } catch (TlsFatalAlert var8) {
            if (!this.closed) {
                this.failWithError((short) 2, var8.getAlertDescription(), "Failed to write record", var8);
            }
            throw var8;
        } catch (IOException var9) {
            if (!this.closed) {
                this.failWithError((short) 2, (short) 80, "Failed to write record", var9);
            }
            throw var9;
        } catch (RuntimeException var10) {
            if (!this.closed) {
                this.failWithError((short) 2, (short) 80, "Failed to write record", var10);
            }
            throw var10;
        }
    }

    public void processAlert() throws IOException {
        while (this.alertQueue.available() >= 2) {
            byte[] var1 = this.alertQueue.removeData(2, 0);
            short var2 = (short) var1[0];
            short var3 = (short) var1[1];
            this.getPeer().notifyAlertReceived(var2, var3);
            if (var2 == 2) {
                this.invalidateSession();
                this.failedWithError = true;
                this.closed = true;
                this.recordStream.safeClose();
                throw new IOException("Internal TLS error, this could be an attack");
            }
            if (var3 == 0) {
                this.handleClose(false);
            }
            this.handleWarningMessage(var3);
        }
    }

    public void setAppDataSplitMode(int arg0) {
        if (arg0 < 0 || arg0 > 2) {
            throw new IllegalArgumentException("Illegal appDataSplitMode mode: " + arg0);
        }
        this.appDataSplitMode = arg0;
    }

    public short processMaxFragmentLengthExtension(Hashtable arg0, Hashtable arg1, short arg2) throws IOException {
        short var4 = TlsExtensionsUtils.getMaxFragmentLengthExtension(arg1);
        if (var4 >= 0 && !MaxFragmentLength.isValid(var4) || !(this.resumedSession || var4 == TlsExtensionsUtils.getMaxFragmentLengthExtension(arg0))) {
            throw new TlsFatalAlert(arg2);
        }
        return var4;
    }

    public void safeReadRecord() throws IOException {
        try {
            if (!this.recordStream.readRecord()) {
                throw new EOFException();
            }
        } catch (TlsFatalAlert var4) {
            if (!this.closed) {
                this.failWithError((short) 2, var4.getAlertDescription(), "Failed to read record", var4);
            }
            throw var4;
        } catch (IOException var5) {
            if (!this.closed) {
                this.failWithError((short) 2, (short) 80, "Failed to read record", var5);
            }
            throw var5;
        } catch (RuntimeException var6) {
            if (!this.closed) {
                this.failWithError((short) 2, (short) 80, "Failed to read record", var6);
            }
            throw var6;
        }
    }

    public void raiseWarning(short arg0, String arg1) throws IOException {
        this.raiseAlert((short) 1, arg0, arg1, (Throwable) null);
    }

    public void offerInput(byte[] arg0) throws IOException {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use offerInput() in blocking mode! Use getInputStream() instead.");
        } else if (this.closed) {
            throw new IOException("Connection is closed, cannot accept any more input");
        } else {
            this.inputBuffers.addBytes(arg0);
            while (this.inputBuffers.available() >= 5) {
                byte[] var2 = new byte[5];
                this.inputBuffers.peek(var2);
                int var3 = TlsUtils.readUint16(var2, 3) + 5;
                if (this.inputBuffers.available() < var3) {
                    break;
                }
                this.safeReadRecord();
            }
        }
    }

    public int getAvailableInputBytes() {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use getAvailableInputBytes() in blocking mode! Use getInputStream().available() instead.");
        }
        return this.applicationDataAvailable();
    }

    public int readInput(byte[] arg0, int arg1, int arg2) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use readInput() in blocking mode! Use getInputStream() instead.");
        }
        try {
            return this.readApplicationData(arg0, arg1, Math.min(arg2, this.applicationDataAvailable()));
        } catch (IOException var5) {
            throw new RuntimeException(var5.toString());
        }
    }

    public static void writeExtensions(OutputStream arg0, Hashtable arg1) throws IOException {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        writeSelectedExtensions(var2, arg1, true);
        writeSelectedExtensions(var2, arg1, false);
        byte[] var3 = var2.toByteArray();
        TlsUtils.writeOpaque16(var3, arg0);
    }

    public int getAvailableOutputBytes() {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use getAvailableOutputBytes() in blocking mode! Use getOutputStream() instead.");
        }
        return this.outputBuffer.getBuffer().available();
    }

    public static void establishMasterSecret(TlsContext arg0, TlsKeyExchange arg1) throws IOException {
        byte[] var2 = arg1.generatePremasterSecret();
        try {
            arg0.getSecurityParameters().masterSecret = TlsUtils.calculateMasterSecret(arg0, var2);
        } finally {
            if (var2 != null) {
                Arrays.fill((byte[]) var2, (byte) 0);
            }
        }
    }

    public void failWithError(short arg0, short arg1, String arg2, Throwable arg3) throws IOException {
        if (!this.closed) {
            this.closed = true;
            if (arg0 == 2) {
                this.invalidateSession();
                this.failedWithError = true;
            }
            this.raiseAlert(arg0, arg1, arg2, arg3);
            this.recordStream.safeClose();
            if (arg0 != 2) {
                return;
            }
        }
        throw new IOException("Internal TLS error, this could be an attack");
    }

    public void invalidateSession() {
        if (this.sessionParameters != null) {
            this.sessionParameters.clear();
            this.sessionParameters = null;
        }
        if (this.tlsSession != null) {
            this.tlsSession.invalidate();
            this.tlsSession = null;
        }
    }

    public void processFinishedMessage(ByteArrayInputStream arg0) throws IOException {
        if (this.expected_verify_data == null) {
            throw new TlsFatalAlert((short) 80);
        }
        byte[] var2 = TlsUtils.readFully(this.expected_verify_data.length, arg0);
        assertEmpty(arg0);
        if (!Arrays.constantTimeAreEqual(this.expected_verify_data, var2)) {
            throw new TlsFatalAlert((short) 51);
        }
    }

    public void raiseAlert(short arg0, short arg1, String arg2, Throwable arg3) throws IOException {
        this.getPeer().notifyAlertRaised(arg0, arg1, arg2, arg3);
        byte[] var5 = new byte[] { (byte) arg0, (byte) arg1 };
        this.safeWriteRecord((short) 21, var5, 0, 2);
    }

    public TlsProtocol(InputStream arg0, OutputStream arg1, SecureRandom arg2) {
        this.blocking = true;
        this.recordStream = new RecordStream(this, arg0, arg1);
        this.secureRandom = arg2;
    }

    public static void assertEmpty(ByteArrayInputStream arg0) throws IOException {
        if (arg0.available() > 0) {
            throw new TlsFatalAlert((short) 50);
        }
    }

    public void sendChangeCipherSpecMessage() throws IOException {
        byte[] var1 = new byte[] { 1 };
        this.safeWriteRecord((short) 20, var1, 0, var1.length);
        this.recordStream.sentWriteCipherSpec();
    }

    public void sendFinishedMessage() throws IOException {
        byte[] var1 = this.createVerifyData(this.getContext().isServer());
        TlsProtocol.HandshakeMessage var2 = new TlsProtocol.HandshakeMessage((short) 20, var1.length);
        var2.write(var1);
        var2.writeToRecordStream();
    }

    public void writeHandshakeMessage(byte[] arg0, int arg1, int arg2) throws IOException {
        while (arg2 > 0) {
            int var4 = Math.min(arg2, this.recordStream.getPlaintextLimit());
            this.safeWriteRecord((short) 22, arg0, arg1, var4);
            arg1 += var4;
            arg2 -= var4;
        }
    }

    public byte[] createVerifyData(boolean arg0) {
        TlsContext var2 = this.getContext();
        String var3 = arg0 ? "server finished" : "client finished";
        byte[] var4 = arg0 ? TlsUtils.SSL_SERVER : TlsUtils.SSL_CLIENT;
        byte[] var5 = getCurrentPRFHash(var2, this.recordStream.getHandshakeHash(), var4);
        return TlsUtils.calculateVerifyData(var2, var3, var5);
    }

    public void close() throws IOException {
        this.handleClose(true);
    }

    public void handleClose(boolean arg0) throws IOException {
        if (!this.closed) {
            if (arg0 && !this.appDataReady) {
                this.raiseWarning((short) 90, "User canceled handshake");
            }
            this.failWithError((short) 1, (short) 0, "Connection closed", (Throwable) null);
        }
    }

    public void flush() throws IOException {
        this.recordStream.flush();
    }

    public boolean isClosed() {
        return this.closed;
    }

    public static Vector readSupplementalDataMessage(ByteArrayInputStream arg0) throws IOException {
        byte[] var1 = TlsUtils.readOpaque24(arg0);
        assertEmpty(arg0);
        ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
        Vector var3 = new Vector();
        while (var2.available() > 0) {
            int var4 = TlsUtils.readUint16(var2);
            byte[] var5 = TlsUtils.readOpaque16(var2);
            var3.addElement(new SupplementalDataEntry(var4, var5));
        }
        return var3;
    }

    public void refuseRenegotiation() throws IOException {
        if (TlsUtils.isSSL(this.getContext())) {
            throw new TlsFatalAlert((short) 40);
        }
        this.raiseWarning((short) 100, "Renegotiation not supported");
    }

    public static byte[] createRenegotiationInfo(byte[] arg0) throws IOException {
        return TlsUtils.encodeOpaque8(arg0);
    }

    public static byte[] createRandomBlock(boolean arg0, RandomGenerator arg1) {
        byte[] var2 = new byte[32];
        arg1.nextBytes(var2);
        if (arg0) {
            TlsUtils.writeGMTUnixTime(var2, 0);
        }
        return var2;
    }

    public void sendCertificateMessage(Certificate arg0) throws IOException {
        if (arg0 == null) {
            arg0 = Certificate.EMPTY_CHAIN;
        }
        if (arg0.isEmpty()) {
            TlsContext var2 = this.getContext();
            if (!var2.isServer()) {
                ProtocolVersion var3 = this.getContext().getServerVersion();
                if (var3.isSSL()) {
                    String var4 = var3.toString() + " client didn't provide credentials";
                    this.raiseWarning((short) 41, var4);
                    return;
                }
            }
        }
        TlsProtocol.HandshakeMessage var5 = new TlsProtocol.HandshakeMessage((short) 11);
        arg0.encode(var5);
        var5.writeToRecordStream();
    }

    public void sendSupplementalDataMessage(Vector arg0) throws IOException {
        TlsProtocol.HandshakeMessage var2 = new TlsProtocol.HandshakeMessage((short) 23);
        writeSupplementalData(var2, arg0);
        var2.writeToRecordStream();
    }

    public int readOutput(byte[] arg0, int arg1, int arg2) {
        if (this.blocking) {
            throw new IllegalStateException("Cannot use readOutput() in blocking mode! Use getOutputStream() instead.");
        }
        int var4 = Math.min(this.getAvailableOutputBytes(), arg2);
        this.outputBuffer.getBuffer().removeData(arg0, arg1, var4, 0);
        return var4;
    }

    public static Hashtable readExtensions(ByteArrayInputStream arg0) throws IOException {
        if (arg0.available() < 1) {
            return null;
        }
        byte[] var1 = TlsUtils.readOpaque16(arg0);
        assertEmpty(arg0);
        ByteArrayInputStream var2 = new ByteArrayInputStream(var1);
        Hashtable var3 = new Hashtable();
        Integer var4;
        byte[] var5;
        do {
            if (var2.available() <= 0) {
                return var3;
            }
            var4 = Integers.valueOf(TlsUtils.readUint16(var2));
            var5 = TlsUtils.readOpaque16(var2);
        } while (null == var3.put(var4, var5));
        throw new TlsFatalAlert((short) 47);
    }

    public static byte[] getCurrentPRFHash(TlsContext arg0, TlsHandshakeHash arg1, byte[] arg2) {
        Digest var3 = arg1.forkPRFHash();
        if (arg2 != null && TlsUtils.isSSL(arg0)) {
            var3.update(arg2, 0, arg2.length);
        }
        byte[] var4 = new byte[var3.getDigestSize()];
        var3.doFinal(var4, 0);
        return var4;
    }

    public OutputStream getOutputStream() {
        if (!this.blocking) {
            throw new IllegalStateException("Cannot use OutputStream in non-blocking mode! Use offerOutput() instead.");
        }
        return this.tlsOutputStream;
    }

    public static void writeSelectedExtensions(OutputStream arg0, Hashtable arg1, boolean arg2) throws IOException {
        Enumeration var3 = arg1.keys();
        while (var3.hasMoreElements()) {
            Integer var4 = (Integer) var3.nextElement();
            int var5 = var4;
            byte[] var6 = (byte[]) ((byte[]) arg1.get(var4));
            if (arg2 == (var6.length == 0)) {
                TlsUtils.checkUint16(var5);
                TlsUtils.writeUint16(var5, arg0);
                TlsUtils.writeOpaque16(var6, arg0);
            }
        }
    }

    public static void writeSupplementalData(OutputStream arg0, Vector arg1) throws IOException {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        for (int var3 = 0; var3 < arg1.size(); var3++) {
            SupplementalDataEntry var4 = (SupplementalDataEntry) arg1.elementAt(var3);
            int var5 = var4.getDataType();
            TlsUtils.checkUint16(var5);
            TlsUtils.writeUint16(var5, var2);
            TlsUtils.writeOpaque16(var4.getData(), var2);
        }
        byte[] var6 = var2.toByteArray();
        TlsUtils.writeOpaque24(var6, arg0);
    }

    public int applicationDataAvailable() {
        return this.applicationDataQueue.available();
    }

    class HandshakeMessage extends ByteArrayOutputStream {

        public HandshakeMessage(short arg1) throws IOException {
            this(arg1, 60);
        }

        public HandshakeMessage(short arg1, int arg2) throws IOException {
            super(arg2 + 4);
            TlsUtils.writeUint8((short) arg1, this);
            this.count += 3;
        }

        public void writeToRecordStream() throws IOException {
            int var1 = this.count - 4;
            TlsUtils.checkUint24(var1);
            TlsUtils.writeUint24(var1, this.buf, 1);
            TlsProtocol.this.writeHandshakeMessage(this.buf, 0, this.count);
            this.buf = null;
        }
    }
}
