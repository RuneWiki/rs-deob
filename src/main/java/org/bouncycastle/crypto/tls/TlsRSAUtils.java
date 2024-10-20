package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

public class TlsRSAUtils {

    public static byte[] safeDecryptPreMasterSecret(TlsContext arg0, RSAKeyParameters arg1, byte[] arg2) {
        ProtocolVersion var3 = arg0.getClientVersion();
        boolean var4 = false;
        byte[] var5 = new byte[48];
        arg0.getSecureRandom().nextBytes(var5);
        byte[] var6 = Arrays.clone(var5);
        try {
            PKCS1Encoding var7 = new PKCS1Encoding(new RSABlindedEngine(), var5);
            var7.init(false, new ParametersWithRandom(arg1, arg0.getSecureRandom()));
            var6 = var7.processBlock(arg2, 0, arg2.length);
        } catch (Exception var15) {
        }
        if (!var4 || !var3.isEqualOrEarlierVersionOf(ProtocolVersion.TLSv10)) {
            int var9 = var3.getMajorVersion() ^ var6[0] & 0xFF | var3.getMinorVersion() ^ var6[1] & 0xFF;
            int var10 = var9 | var9 >> 1;
            int var11 = var10 | var10 >> 2;
            int var12 = var11 | var11 >> 4;
            int var13 = ~((var12 & 0x1) - 1);
            for (int var14 = 0; var14 < 48; var14++) {
                var6[var14] = (byte) (var6[var14] & ~var13 | var5[var14] & var13);
            }
        }
        return var6;
    }

    public static byte[] generateEncryptedPreMasterSecret(TlsContext arg0, RSAKeyParameters arg1, OutputStream arg2) throws IOException {
        byte[] var3 = new byte[48];
        arg0.getSecureRandom().nextBytes(var3);
        TlsUtils.writeVersion(arg0.getClientVersion(), var3, 0);
        PKCS1Encoding var4 = new PKCS1Encoding(new RSABlindedEngine());
        var4.init(true, new ParametersWithRandom(arg1, arg0.getSecureRandom()));
        try {
            byte[] var5 = var4.processBlock(var3, 0, var3.length);
            if (TlsUtils.isSSL(arg0)) {
                arg2.write(var5);
            } else {
                TlsUtils.writeOpaque16(var5, arg2);
            }
            return var3;
        } catch (InvalidCipherTextException var7) {
            throw new TlsFatalAlert((short) 80, var7);
        }
    }
}
