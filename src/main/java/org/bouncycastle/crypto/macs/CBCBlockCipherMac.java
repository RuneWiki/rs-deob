package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;

public class CBCBlockCipherMac implements Mac {

    public BlockCipher cipher;

    public BlockCipherPadding padding;

    public int macSize;

    public byte[] mac;

    public byte[] buf;

    public int bufOff;

    public CBCBlockCipherMac(BlockCipher arg0) {
        this(arg0, arg0.getBlockSize() * 8 / 2, (BlockCipherPadding) null);
    }

    public CBCBlockCipherMac(BlockCipher arg0, BlockCipherPadding arg1) {
        this(arg0, arg0.getBlockSize() * 8 / 2, arg1);
    }

    public CBCBlockCipherMac(BlockCipher arg0, int arg1) {
        this(arg0, arg1, (BlockCipherPadding) null);
    }

    public CBCBlockCipherMac(BlockCipher arg0, int arg1, BlockCipherPadding arg2) {
        if (arg1 % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        }
        this.cipher = new CBCBlockCipher(arg0);
        this.padding = arg2;
        this.macSize = arg1 / 8;
        this.mac = new byte[arg0.getBlockSize()];
        this.buf = new byte[arg0.getBlockSize()];
        this.bufOff = 0;
    }

    public void reset() {
        for (int var1 = 0; var1 < this.buf.length; var1++) {
            this.buf[var1] = 0;
        }
        this.bufOff = 0;
        this.cipher.reset();
    }

    public void init(CipherParameters arg0) {
        this.reset();
        this.cipher.init(true, arg0);
    }

    public int getMacSize() {
        return this.macSize;
    }

    public void update(byte arg0) {
        if (this.buf.length == this.bufOff) {
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
        }
        this.buf[this.bufOff++] = arg0;
    }

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    public int doFinal(byte[] arg0, int arg1) {
        int var3 = this.cipher.getBlockSize();
        if (this.padding == null) {
            while (this.bufOff < var3) {
                this.buf[this.bufOff] = 0;
                this.bufOff++;
            }
        } else {
            if (this.bufOff == var3) {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                this.bufOff = 0;
            }
            this.padding.addPadding(this.buf, this.bufOff);
        }
        this.cipher.processBlock(this.buf, 0, this.mac, 0);
        System.arraycopy(this.mac, 0, arg0, arg1, this.macSize);
        this.reset();
        return this.macSize;
    }

    public void update(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int var4 = this.cipher.getBlockSize();
        int var5 = var4 - this.bufOff;
        if (arg2 > var5) {
            System.arraycopy(arg0, arg1, this.buf, this.bufOff, var5);
            this.cipher.processBlock(this.buf, 0, this.mac, 0);
            this.bufOff = 0;
            arg2 -= var5;
            arg1 += var5;
            while (arg2 > var4) {
                this.cipher.processBlock(arg0, arg1, this.mac, 0);
                arg2 -= var4;
                arg1 += var4;
            }
        }
        System.arraycopy(arg0, arg1, this.buf, this.bufOff, arg2);
        this.bufOff += arg2;
    }
}
