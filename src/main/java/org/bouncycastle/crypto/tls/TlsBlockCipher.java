package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class TlsBlockCipher implements TlsCipher {

    public TlsContext context;

    public byte[] randomData;

    public boolean useExplicitIV;

    public boolean encryptThenMAC;

    public TlsMac writeMac;

    public TlsMac readMac;

    public BlockCipher encryptCipher;

    public BlockCipher decryptCipher;

    public TlsMac getReadMac() {
        return this.readMac;
    }

    public TlsBlockCipher(TlsContext arg0, BlockCipher arg1, BlockCipher arg2, Digest arg3, Digest arg4, int arg5) throws IOException {
        this.context = arg0;
        this.randomData = new byte[256];
        arg0.getNonceRandomGenerator().nextBytes(this.randomData);
        this.useExplicitIV = TlsUtils.isTLSv11(arg0);
        this.encryptThenMAC = arg0.getSecurityParameters().encryptThenMAC;
        int var7 = arg5 * 2 + arg3.getDigestSize() + arg4.getDigestSize();
        if (!this.useExplicitIV) {
            var7 += arg1.getBlockSize() + arg2.getBlockSize();
        }
        byte[] var8 = TlsUtils.calculateKeyBlock(arg0, var7);
        byte var9 = 0;
        TlsMac var10 = new TlsMac(arg0, arg3, var8, var9, arg3.getDigestSize());
        int var11 = var9 + arg3.getDigestSize();
        TlsMac var12 = new TlsMac(arg0, arg4, var8, var11, arg4.getDigestSize());
        int var13 = var11 + arg4.getDigestSize();
        KeyParameter var14 = new KeyParameter(var8, var13, arg5);
        int var15 = arg5 + var13;
        KeyParameter var16 = new KeyParameter(var8, var15, arg5);
        int var17 = arg5 + var15;
        byte[] var18;
        byte[] var19;
        if (this.useExplicitIV) {
            var18 = new byte[arg1.getBlockSize()];
            var19 = new byte[arg2.getBlockSize()];
        } else {
            var18 = Arrays.copyOfRange(var8, var17, var17 + arg1.getBlockSize());
            int var20 = var17 + arg1.getBlockSize();
            var19 = Arrays.copyOfRange(var8, var20, var20 + arg2.getBlockSize());
            var17 = var20 + arg2.getBlockSize();
        }
        if (var7 != var17) {
            throw new TlsFatalAlert((short) 80);
        }
        ParametersWithIV var21;
        ParametersWithIV var22;
        if (arg0.isServer()) {
            this.writeMac = var12;
            this.readMac = var10;
            this.encryptCipher = arg2;
            this.decryptCipher = arg1;
            var21 = new ParametersWithIV(var16, var19);
            var22 = new ParametersWithIV(var14, var18);
        } else {
            this.writeMac = var10;
            this.readMac = var12;
            this.encryptCipher = arg1;
            this.decryptCipher = arg2;
            var21 = new ParametersWithIV(var14, var18);
            var22 = new ParametersWithIV(var16, var19);
        }
        this.encryptCipher.init(true, var21);
        this.decryptCipher.init(false, var22);
    }

    public int getPlaintextLimit(int arg0) {
        int var2 = this.encryptCipher.getBlockSize();
        int var3 = this.writeMac.getSize();
        int var4 = arg0;
        if (this.useExplicitIV) {
            var4 = arg0 - var2;
        }
        int var6;
        if (this.encryptThenMAC) {
            int var5 = var4 - var3;
            var6 = var5 - var5 % var2;
        } else {
            int var7 = var4 - var4 % var2;
            var6 = var7 - var3;
        }
        return var6 - 1;
    }

    public TlsMac getWriteMac() {
        return this.writeMac;
    }

    public byte[] encodePlaintext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) {
        int var7 = this.encryptCipher.getBlockSize();
        int var8 = this.writeMac.getSize();
        ProtocolVersion var9 = this.context.getServerVersion();
        int var10 = arg4;
        if (!this.encryptThenMAC) {
            var10 = var8 + arg4;
        }
        int var11 = var7 - 1 - var10 % var7;
        if (!var9.isDTLS() && !var9.isSSL()) {
            int var12 = (255 - var11) / var7;
            int var13 = this.chooseExtraPadBlocks(this.context.getSecureRandom(), var12);
            var11 += var7 * var13;
        }
        int var14 = arg4 + var8 + var11 + 1;
        if (this.useExplicitIV) {
            var14 += var7;
        }
        byte[] var15 = new byte[var14];
        int var16 = 0;
        if (this.useExplicitIV) {
            byte[] var17 = new byte[var7];
            this.context.getNonceRandomGenerator().nextBytes(var17);
            this.encryptCipher.init(true, new ParametersWithIV((CipherParameters) null, var17));
            System.arraycopy(var17, 0, var15, var16, var7);
            var16 += var7;
        }
        System.arraycopy(arg2, arg3, var15, var16, arg4);
        int var19 = arg4 + var16;
        if (!this.encryptThenMAC) {
            byte[] var20 = this.writeMac.calculateMac(arg0, arg1, arg2, arg3, arg4);
            System.arraycopy(var20, 0, var15, var19, var20.length);
            var19 += var20.length;
        }
        for (int var21 = 0; var21 <= var11; var21++) {
            var15[var19++] = (byte) var11;
        }
        for (int var22 = var16; var22 < var19; var22 += var7) {
            this.encryptCipher.processBlock(var15, var22, var15, var22);
        }
        if (this.encryptThenMAC) {
            byte[] var23 = this.writeMac.calculateMac(arg0, arg1, var15, 0, var19);
            System.arraycopy(var23, 0, var15, var19, var23.length);
            int var24 = var23.length + var19;
        }
        return var15;
    }

    public byte[] decodeCiphertext(long arg0, short arg1, byte[] arg2, int arg3, int arg4) throws IOException {
        int var7 = this.decryptCipher.getBlockSize();
        int var8 = this.readMac.getSize();
        int var10;
        if (this.encryptThenMAC) {
            var10 = var8 + var7;
        } else {
            var10 = Math.max(var7, var8 + 1);
        }
        if (this.useExplicitIV) {
            var10 += var7;
        }
        if (arg4 < var10) {
            throw new TlsFatalAlert((short) 50);
        }
        int var11 = arg4;
        if (this.encryptThenMAC) {
            var11 = arg4 - var8;
        }
        if (var11 % var7 != 0) {
            throw new TlsFatalAlert((short) 21);
        }
        if (this.encryptThenMAC) {
            int var12 = arg3 + arg4;
            byte[] var13 = Arrays.copyOfRange(arg2, var12 - var8, var12);
            byte[] var14 = this.readMac.calculateMac(arg0, arg1, arg2, arg3, arg4 - var8);
            boolean var15 = !Arrays.constantTimeAreEqual(var14, var13);
            if (var15) {
                throw new TlsFatalAlert((short) 20);
            }
        }
        if (this.useExplicitIV) {
            this.decryptCipher.init(false, new ParametersWithIV((CipherParameters) null, arg2, arg3, var7));
            arg3 += var7;
            var11 -= var7;
        }
        for (int var16 = 0; var16 < var11; var16 += var7) {
            this.decryptCipher.processBlock(arg2, arg3 + var16, arg2, arg3 + var16);
        }
        int var17 = this.checkPaddingConstantTime(arg2, arg3, var11, var7, this.encryptThenMAC ? 0 : var8);
        boolean var18 = var17 == 0;
        int var19 = var11 - var17;
        if (!this.encryptThenMAC) {
            var19 -= var8;
            int var21 = arg3 + var19;
            byte[] var22 = Arrays.copyOfRange(arg2, var21, var8 + var21);
            byte[] var23 = this.readMac.calculateMacConstantTime(arg0, arg1, arg2, arg3, var19, var11 - var8, this.randomData);
            var18 |= !Arrays.constantTimeAreEqual(var23, var22);
        }
        if (var18) {
            throw new TlsFatalAlert((short) 20);
        }
        return Arrays.copyOfRange(arg2, arg3, arg3 + var19);
    }

    public int checkPaddingConstantTime(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1 + arg2;
        byte var7 = arg0[var6 - 1];
        int var8 = var7 & 0xFF;
        int var9 = var8 + 1;
        int var10 = 0;
        byte var11 = 0;
        if ((!TlsUtils.isSSL(this.context) || var9 <= arg3) && arg4 + var9 <= arg2) {
            int var12 = var6 - var9;
            do {
                var11 = (byte) (var11 | arg0[var12++] ^ var7);
            } while (var12 < var6);
            var10 = var9;
            if (var11 != 0) {
                var9 = 0;
            }
        } else {
            var9 = 0;
        }
        byte[] var13 = this.randomData;
        while (var10 < 256) {
            var11 = (byte) (var11 | var13[var10++] ^ var7);
        }
        var13[0] ^= var11;
        return var9;
    }

    public int chooseExtraPadBlocks(SecureRandom arg0, int arg1) {
        int var3 = arg0.nextInt();
        int var4 = this.lowestBitSet(var3);
        return Math.min(var4, arg1);
    }

    public int lowestBitSet(int arg0) {
        if (arg0 == 0) {
            return 32;
        }
        int var2 = 0;
        while ((arg0 & 0x1) == 0) {
            var2++;
            arg0 >>= 0x1;
        }
        return var2;
    }
}
