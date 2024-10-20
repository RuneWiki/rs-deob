package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.RC4Engine;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;

public class DefaultTlsCipherFactory extends AbstractTlsCipherFactory {

    public TlsNullCipher createNullCipher(TlsContext arg0, int arg1) throws IOException {
        return new TlsNullCipher(arg0, this.createHMACDigest(arg1), this.createHMACDigest(arg1));
    }

    public TlsCipher createCipher(TlsContext arg0, int arg1, int arg2) throws IOException {
        switch(arg1) {
            case 0:
                return this.createNullCipher(arg0, arg2);
            case 2:
                return this.createRC4Cipher(arg0, 16, arg2);
            case 7:
                return this.createDESedeCipher(arg0, arg2);
            case 8:
                return this.createAESCipher(arg0, 16, arg2);
            case 9:
                return this.createAESCipher(arg0, 32, arg2);
            case 10:
                return this.createCipher_AES_GCM(arg0, 16, 16);
            case 11:
                return this.createCipher_AES_GCM(arg0, 32, 16);
            case 12:
                return this.createCamelliaCipher(arg0, 16, arg2);
            case 13:
                return this.createCamelliaCipher(arg0, 32, arg2);
            case 14:
                return this.createSEEDCipher(arg0, arg2);
            case 15:
                return this.createCipher_AES_CCM(arg0, 16, 16);
            case 16:
                return this.createCipher_AES_CCM(arg0, 16, 8);
            case 17:
                return this.createCipher_AES_CCM(arg0, 32, 16);
            case 18:
                return this.createCipher_AES_CCM(arg0, 32, 8);
            case 19:
                return this.createCipher_Camellia_GCM(arg0, 16, 16);
            case 20:
                return this.createCipher_Camellia_GCM(arg0, 32, 16);
            case 102:
                return this.createChaCha20Poly1305(arg0);
            case 103:
                return this.createCipher_AES_OCB(arg0, 16, 12);
            case 104:
                return this.createCipher_AES_OCB(arg0, 32, 12);
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public TlsBlockCipher createAESCipher(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsBlockCipher(arg0, this.createAESBlockCipher(), this.createAESBlockCipher(), this.createHMACDigest(arg2), this.createHMACDigest(arg2), arg1);
    }

    public TlsBlockCipher createCamelliaCipher(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsBlockCipher(arg0, this.createCamelliaBlockCipher(), this.createCamelliaBlockCipher(), this.createHMACDigest(arg2), this.createHMACDigest(arg2), arg1);
    }

    public TlsBlockCipher createDESedeCipher(TlsContext arg0, int arg1) throws IOException {
        return new TlsBlockCipher(arg0, this.createDESedeBlockCipher(), this.createDESedeBlockCipher(), this.createHMACDigest(arg1), this.createHMACDigest(arg1), 24);
    }

    public TlsAEADCipher createCipher_AES_GCM(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsAEADCipher(arg0, this.createAEADBlockCipher_AES_GCM(), this.createAEADBlockCipher_AES_GCM(), arg1, arg2);
    }

    public TlsAEADCipher createCipher_AES_OCB(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsAEADCipher(arg0, this.createAEADBlockCipher_AES_OCB(), this.createAEADBlockCipher_AES_OCB(), arg1, arg2, 2);
    }

    public TlsBlockCipher createSEEDCipher(TlsContext arg0, int arg1) throws IOException {
        return new TlsBlockCipher(arg0, this.createSEEDBlockCipher(), this.createSEEDBlockCipher(), this.createHMACDigest(arg1), this.createHMACDigest(arg1), 16);
    }

    public TlsAEADCipher createCipher_AES_CCM(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsAEADCipher(arg0, this.createAEADBlockCipher_AES_CCM(), this.createAEADBlockCipher_AES_CCM(), arg1, arg2);
    }

    public BlockCipher createAESBlockCipher() {
        return new CBCBlockCipher(this.createAESEngine());
    }

    public TlsStreamCipher createRC4Cipher(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsStreamCipher(arg0, this.createRC4StreamCipher(), this.createRC4StreamCipher(), this.createHMACDigest(arg2), this.createHMACDigest(arg2), arg1, false);
    }

    public TlsCipher createChaCha20Poly1305(TlsContext arg0) throws IOException {
        return new Chacha20Poly1305(arg0);
    }

    public BlockCipher createAESEngine() {
        return new AESEngine();
    }

    public BlockCipher createCamelliaEngine() {
        return new CamelliaEngine();
    }

    public TlsAEADCipher createCipher_Camellia_GCM(TlsContext arg0, int arg1, int arg2) throws IOException {
        return new TlsAEADCipher(arg0, this.createAEADBlockCipher_Camellia_GCM(), this.createAEADBlockCipher_Camellia_GCM(), arg1, arg2);
    }

    public AEADBlockCipher createAEADBlockCipher_AES_CCM() {
        return new CCMBlockCipher(this.createAESEngine());
    }

    public AEADBlockCipher createAEADBlockCipher_AES_GCM() {
        return new GCMBlockCipher(this.createAESEngine());
    }

    public AEADBlockCipher createAEADBlockCipher_AES_OCB() {
        return new OCBBlockCipher(this.createAESEngine(), this.createAESEngine());
    }

    public AEADBlockCipher createAEADBlockCipher_Camellia_GCM() {
        return new GCMBlockCipher(this.createCamelliaEngine());
    }

    public BlockCipher createCamelliaBlockCipher() {
        return new CBCBlockCipher(this.createCamelliaEngine());
    }

    public Digest createHMACDigest(int arg0) throws IOException {
        switch(arg0) {
            case 0:
                return null;
            case 1:
                return TlsUtils.createHash((short) 1);
            case 2:
                return TlsUtils.createHash((short) 2);
            case 3:
                return TlsUtils.createHash((short) 4);
            case 4:
                return TlsUtils.createHash((short) 5);
            case 5:
                return TlsUtils.createHash((short) 6);
            default:
                throw new TlsFatalAlert((short) 80);
        }
    }

    public StreamCipher createRC4StreamCipher() {
        return new RC4Engine();
    }

    public BlockCipher createSEEDBlockCipher() {
        return new CBCBlockCipher(new SEEDEngine());
    }

    public BlockCipher createDESedeBlockCipher() {
        return new CBCBlockCipher(new DESedeEngine());
    }
}
