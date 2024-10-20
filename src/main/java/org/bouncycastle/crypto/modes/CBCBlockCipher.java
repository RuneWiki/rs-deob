package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

public class CBCBlockCipher implements BlockCipher {

    public BlockCipher cipher = null;

    public int blockSize;

    public byte[] IV;

    public byte[] cbcV;

    public byte[] cbcNextV;

    public boolean encrypting;

    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/CBC";
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException {
        boolean var3 = this.encrypting;
        this.encrypting = arg0;
        if (!arg1 instanceof ParametersWithIV) {
            this.reset();
            if (arg1 != null) {
                this.cipher.init(arg0, arg1);
            } else if (arg0 != var3) {
                throw new IllegalArgumentException("cannot change encrypting state without providing key.");
            }
            return;
        }
        ParametersWithIV var4 = (ParametersWithIV) arg1;
        byte[] var5 = var4.getIV();
        if (var5.length != this.blockSize) {
            throw new IllegalArgumentException("initialisation vector must be the same length as block size");
        }
        System.arraycopy(var5, 0, this.IV, 0, var5.length);
        this.reset();
        if (var4.getParameters() != null) {
            this.cipher.init(arg0, var4.getParameters());
        } else if (arg0 != var3) {
            throw new IllegalArgumentException("cannot change encrypting state without providing key.");
        }
    }

    public void reset() {
        System.arraycopy(this.IV, 0, this.cbcV, 0, this.IV.length);
        Arrays.fill((byte[]) this.cbcNextV, (byte) 0);
        this.cipher.reset();
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public CBCBlockCipher(BlockCipher arg0) {
        this.cipher = arg0;
        this.blockSize = arg0.getBlockSize();
        this.IV = new byte[this.blockSize];
        this.cbcV = new byte[this.blockSize];
        this.cbcNextV = new byte[this.blockSize];
    }

    public int encryptBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException {
        if (this.blockSize + arg1 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int var5 = 0; var5 < this.blockSize; var5++) {
            this.cbcV[var5] ^= arg0[arg1 + var5];
        }
        int var6 = this.cipher.processBlock(this.cbcV, 0, arg2, arg3);
        System.arraycopy(arg2, arg3, this.cbcV, 0, this.cbcV.length);
        return var6;
    }

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException {
        return this.encrypting ? this.encryptBlock(arg0, arg1, arg2, arg3) : this.decryptBlock(arg0, arg1, arg2, arg3);
    }

    public int decryptBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException {
        if (this.blockSize + arg1 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        }
        System.arraycopy(arg0, arg1, this.cbcNextV, 0, this.blockSize);
        int var5 = this.cipher.processBlock(arg0, arg1, arg2, arg3);
        for (int var6 = 0; var6 < this.blockSize; var6++) {
            arg2[arg3 + var6] ^= this.cbcV[var6];
        }
        byte[] var7 = this.cbcV;
        this.cbcV = this.cbcNextV;
        this.cbcNextV = var7;
        return var5;
    }
}
