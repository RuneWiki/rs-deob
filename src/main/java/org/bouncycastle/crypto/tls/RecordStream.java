package org.bouncycastle.crypto.tls;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class RecordStream {

    public TlsCompression pendingCompression = null;

    public TlsCompression readCompression = null;

    public TlsCompression writeCompression = null;

    public TlsCipher pendingCipher = null;

    public TlsCipher readCipher = null;

    public TlsCipher writeCipher = null;

    public long readSeqNo = 0L;

    public long writeSeqNo = 0L;

    public ByteArrayOutputStream buffer = new ByteArrayOutputStream();

    public TlsHandshakeHash handshakeHash = null;

    public ProtocolVersion readVersion = null;

    public ProtocolVersion writeVersion = null;

    public boolean restrictReadVersion = true;

    public TlsProtocol handler;

    public InputStream input;

    public OutputStream output;

    public static int DEFAULT_PLAINTEXT_LIMIT = 16384;

    public static final int TLS_HEADER_LENGTH_OFFSET = 3;

    public static final int TLS_HEADER_SIZE = 5;

    public static final int TLS_HEADER_TYPE_OFFSET = 0;

    public static final int TLS_HEADER_VERSION_OFFSET = 1;

    public int ciphertextLimit;

    public int compressedLimit;

    public int plaintextLimit;

    public static void checkType(short arg0, short arg1) throws IOException {
        switch(arg0) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            default:
                throw new TlsFatalAlert(arg1);
        }
    }

    public void init(TlsContext arg0) {
        this.readCipher = new TlsNullCipher(arg0);
        this.writeCipher = this.readCipher;
        this.handshakeHash = new DeferredHash();
        this.handshakeHash.init(arg0);
        this.setPlaintextLimit(DEFAULT_PLAINTEXT_LIMIT);
    }

    public int getPlaintextLimit() {
        return this.plaintextLimit;
    }

    public void setPlaintextLimit(int arg0) {
        this.plaintextLimit = arg0;
        this.compressedLimit = this.plaintextLimit + 1024;
        this.ciphertextLimit = this.compressedLimit + 1024;
    }

    public void setWriteVersion(ProtocolVersion arg0) {
        this.writeVersion = arg0;
    }

    public void updateHandshakeData(byte[] arg0, int arg1, int arg2) {
        this.handshakeHash.update(arg0, arg1, arg2);
    }

    public void flush() throws IOException {
        this.output.flush();
    }

    public void setRestrictReadVersion(boolean arg0) {
        this.restrictReadVersion = arg0;
    }

    public void sentWriteCipherSpec() throws IOException {
        if (this.pendingCompression == null || this.pendingCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.writeCompression = this.pendingCompression;
        this.writeCipher = this.pendingCipher;
        this.writeSeqNo = 0L;
    }

    public boolean readRecord() throws IOException {
        byte[] var1 = TlsUtils.readAllOrNothing(5, this.input);
        if (var1 == null) {
            return false;
        }
        short var2 = TlsUtils.readUint8(var1, 0);
        checkType(var2, (short) 10);
        if (this.restrictReadVersion) {
            ProtocolVersion var4 = TlsUtils.readVersion(var1, 1);
            if (this.readVersion == null) {
                this.readVersion = var4;
            } else if (!var4.equals(this.readVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
        } else {
            int var3 = TlsUtils.readVersionRaw(var1, 1);
            if ((var3 & 0xFFFFFF00) != 768) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        int var5 = TlsUtils.readUint16(var1, 3);
        byte[] var6 = this.decodeAndVerify(var2, this.input, var5);
        this.handler.processRecord(var2, var6, 0, var6.length);
        return true;
    }

    public void receivedReadCipherSpec() throws IOException {
        if (this.pendingCompression == null || this.pendingCipher == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.readCompression = this.pendingCompression;
        this.readCipher = this.pendingCipher;
        this.readSeqNo = 0L;
    }

    public void finaliseHandshake() throws IOException {
        if (this.readCompression != this.pendingCompression || this.writeCompression != this.pendingCompression || this.readCipher != this.pendingCipher || this.writeCipher != this.pendingCipher) {
            throw new TlsFatalAlert((short) 40);
        }
        this.pendingCompression = null;
        this.pendingCipher = null;
    }

    public void setReadVersion(ProtocolVersion arg0) {
        this.readVersion = arg0;
    }

    public byte[] decodeAndVerify(short arg0, InputStream arg1, int arg2) throws IOException {
        checkLength(arg2, this.ciphertextLimit, (short) 22);
        byte[] var4 = TlsUtils.readFully(arg2, arg1);
        byte[] var5 = this.readCipher.decodeCiphertext((long) (this.readSeqNo++), arg0, var4, 0, var4.length);
        checkLength(var5.length, this.compressedLimit, (short) 22);
        OutputStream var6 = this.readCompression.decompress(this.buffer);
        if (this.buffer != var6) {
            var6.write(var5, 0, var5.length);
            var6.flush();
            var5 = this.getBufferContents();
        }
        checkLength(var5.length, this.plaintextLimit, (short) 30);
        if (var5.length < 1 && arg0 != 23) {
            throw new TlsFatalAlert((short) 47);
        }
        return var5;
    }

    public void writeRecord(short arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.writeVersion == null) {
            return;
        }
        checkType(arg0, (short) 80);
        checkLength(arg3, this.plaintextLimit, (short) 80);
        if (arg3 < 1 && arg0 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        if (arg0 == 22) {
            this.updateHandshakeData(arg1, arg2, arg3);
        }
        OutputStream var5 = this.writeCompression.compress(this.buffer);
        byte[] var6;
        if (this.buffer == var5) {
            var6 = this.writeCipher.encodePlaintext((long) (this.writeSeqNo++), arg0, arg1, arg2, arg3);
        } else {
            var5.write(arg1, arg2, arg3);
            var5.flush();
            byte[] var7 = this.getBufferContents();
            checkLength(var7.length, arg3 + 1024, (short) 80);
            var6 = this.writeCipher.encodePlaintext((long) (this.writeSeqNo++), arg0, var7, 0, var7.length);
        }
        checkLength(var6.length, this.ciphertextLimit, (short) 80);
        byte[] var8 = new byte[var6.length + 5];
        TlsUtils.writeUint8((short) arg0, var8, 0);
        TlsUtils.writeVersion(this.writeVersion, var8, 1);
        TlsUtils.writeUint16(var6.length, var8, 3);
        System.arraycopy(var6, 0, var8, 5, var6.length);
        this.output.write(var8);
        this.output.flush();
    }

    public void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    public TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    public TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash var1 = this.handshakeHash;
        this.handshakeHash = this.handshakeHash.stopTracking();
        return var1;
    }

    public ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    public void safeClose() {
        try {
            this.input.close();
        } catch (IOException var4) {
        }
        try {
            this.output.close();
        } catch (IOException var3) {
        }
    }

    public RecordStream(TlsProtocol arg0, InputStream arg1, OutputStream arg2) {
        this.handler = arg0;
        this.input = arg1;
        this.output = arg2;
        this.readCompression = new TlsNullCompression();
        this.writeCompression = this.readCompression;
    }

    public byte[] getBufferContents() {
        byte[] var1 = this.buffer.toByteArray();
        this.buffer.reset();
        return var1;
    }

    public void setPendingConnectionState(TlsCompression arg0, TlsCipher arg1) {
        this.pendingCompression = arg0;
        this.pendingCipher = arg1;
    }

    public static void checkLength(int arg0, int arg1, short arg2) throws IOException {
        if (arg0 > arg1) {
            throw new TlsFatalAlert(arg2);
        }
    }
}
