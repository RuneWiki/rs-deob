package org.bouncycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.util.Integers;

public class TlsExtensionsUtils {

    public static final Integer EXT_encrypt_then_mac = Integers.valueOf(22);

    public static final Integer EXT_extended_master_secret = Integers.valueOf(23);

    public static final Integer EXT_heartbeat = Integers.valueOf(15);

    public static final Integer EXT_max_fragment_length = Integers.valueOf(1);

    public static final Integer EXT_padding = Integers.valueOf(21);

    public static final Integer EXT_server_name = Integers.valueOf(0);

    public static final Integer EXT_status_request = Integers.valueOf(5);

    public static final Integer EXT_truncated_hmac = Integers.valueOf(4);

    public static byte[] createMaxFragmentLengthExtension(short arg0) throws IOException {
        TlsUtils.checkUint8(arg0);
        byte[] var1 = new byte[1];
        TlsUtils.writeUint8((short) arg0, var1, 0);
        return var1;
    }

    public static byte[] createHeartbeatExtension(HeartbeatExtension arg0) throws IOException {
        if (arg0 == null) {
            throw new TlsFatalAlert((short) 80);
        }
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        arg0.encode(var1);
        return var1.toByteArray();
    }

    public static boolean readEncryptThenMACExtension(byte[] arg0) throws IOException {
        return readEmptyExtensionData(arg0);
    }

    public static void addExtendedMasterSecretExtension(Hashtable arg0) {
        arg0.put(EXT_extended_master_secret, createExtendedMasterSecretExtension());
    }

    public static ServerNameList getServerNameExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_server_name);
        return var1 == null ? null : readServerNameExtension(var1);
    }

    public static void addMaxFragmentLengthExtension(Hashtable arg0, short arg1) throws IOException {
        arg0.put(EXT_max_fragment_length, createMaxFragmentLengthExtension(arg1));
    }

    public static byte[] createEncryptThenMACExtension() {
        return createEmptyExtensionData();
    }

    public static void addServerNameExtension(Hashtable arg0, ServerNameList arg1) throws IOException {
        arg0.put(EXT_server_name, createServerNameExtension(arg1));
    }

    public static ServerNameList readServerNameExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        ServerNameList var2 = ServerNameList.parse(var1);
        TlsProtocol.assertEmpty(var1);
        return var2;
    }

    public static boolean hasTruncatedHMacExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_truncated_hmac);
        return var1 == null ? false : readTruncatedHMacExtension(var1);
    }

    public static HeartbeatExtension getHeartbeatExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_heartbeat);
        return var1 == null ? null : readHeartbeatExtension(var1);
    }

    public static int getPaddingExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_padding);
        return var1 == null ? -1 : readPaddingExtension(var1);
    }

    public static void addPaddingExtension(Hashtable arg0, int arg1) throws IOException {
        arg0.put(EXT_padding, createPaddingExtension(arg1));
    }

    public static CertificateStatusRequest getStatusRequestExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_status_request);
        return var1 == null ? null : readStatusRequestExtension(var1);
    }

    public static boolean hasEncryptThenMACExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_encrypt_then_mac);
        return var1 == null ? false : readEncryptThenMACExtension(var1);
    }

    public static boolean hasExtendedMasterSecretExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_extended_master_secret);
        return var1 == null ? false : readExtendedMasterSecretExtension(var1);
    }

    public static void addTruncatedHMacExtension(Hashtable arg0) {
        arg0.put(EXT_truncated_hmac, createTruncatedHMacExtension());
    }

    public static byte[] createEmptyExtensionData() {
        return TlsUtils.EMPTY_BYTES;
    }

    public static void addHeartbeatExtension(Hashtable arg0, HeartbeatExtension arg1) throws IOException {
        arg0.put(EXT_heartbeat, createHeartbeatExtension(arg1));
    }

    public static byte[] createExtendedMasterSecretExtension() {
        return createEmptyExtensionData();
    }

    public static void addEncryptThenMACExtension(Hashtable arg0) {
        arg0.put(EXT_encrypt_then_mac, createEncryptThenMACExtension());
    }

    public static Hashtable ensureExtensionsInitialised(Hashtable arg0) {
        return arg0 == null ? new Hashtable() : arg0;
    }

    public static byte[] createPaddingExtension(int arg0) throws IOException {
        TlsUtils.checkUint16(arg0);
        return new byte[arg0];
    }

    public static byte[] createServerNameExtension(ServerNameList arg0) throws IOException {
        if (arg0 == null) {
            throw new TlsFatalAlert((short) 80);
        }
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        arg0.encode(var1);
        return var1.toByteArray();
    }

    public static byte[] createStatusRequestExtension(CertificateStatusRequest arg0) throws IOException {
        if (arg0 == null) {
            throw new TlsFatalAlert((short) 80);
        }
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        arg0.encode(var1);
        return var1.toByteArray();
    }

    public static byte[] createTruncatedHMacExtension() {
        return createEmptyExtensionData();
    }

    public static boolean readEmptyExtensionData(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        } else if (arg0.length == 0) {
            return true;
        } else {
            throw new TlsFatalAlert((short) 47);
        }
    }

    public static boolean readExtendedMasterSecretExtension(byte[] arg0) throws IOException {
        return readEmptyExtensionData(arg0);
    }

    public static void addStatusRequestExtension(Hashtable arg0, CertificateStatusRequest arg1) throws IOException {
        arg0.put(EXT_status_request, createStatusRequestExtension(arg1));
    }

    public static short getMaxFragmentLengthExtension(Hashtable arg0) throws IOException {
        byte[] var1 = TlsUtils.getExtensionData(arg0, EXT_max_fragment_length);
        return var1 == null ? -1 : readMaxFragmentLengthExtension(var1);
    }

    public static HeartbeatExtension readHeartbeatExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        HeartbeatExtension var2 = HeartbeatExtension.parse(var1);
        TlsProtocol.assertEmpty(var1);
        return var2;
    }

    public static int readPaddingExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        for (int var1 = 0; var1 < arg0.length; var1++) {
            if (arg0[var1] != 0) {
                throw new TlsFatalAlert((short) 47);
            }
        }
        return arg0.length;
    }

    public static short readMaxFragmentLengthExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        } else if (arg0.length == 1) {
            return TlsUtils.readUint8(arg0, 0);
        } else {
            throw new TlsFatalAlert((short) 50);
        }
    }

    public static CertificateStatusRequest readStatusRequestExtension(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        }
        ByteArrayInputStream var1 = new ByteArrayInputStream(arg0);
        CertificateStatusRequest var2 = CertificateStatusRequest.parse(var1);
        TlsProtocol.assertEmpty(var1);
        return var2;
    }

    public static boolean readTruncatedHMacExtension(byte[] arg0) throws IOException {
        return readEmptyExtensionData(arg0);
    }
}
