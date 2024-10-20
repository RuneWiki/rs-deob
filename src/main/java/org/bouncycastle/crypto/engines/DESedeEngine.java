package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class DESedeEngine extends DESEngine {

    public int[] workingKey1 = null;

    public int[] workingKey2 = null;

    public int[] workingKey3 = null;

    public static final int BLOCK_SIZE = 8;

    public boolean forEncryption;

    public int getBlockSize() {
        return 8;
    }

    public String getAlgorithmName() {
        return "DESede";
    }

    public int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.workingKey1 == null) {
            throw new IllegalStateException("DESede engine not initialised");
        } else if (arg1 + 8 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg3 + 8 > arg2.length) {
            throw new OutputLengthException("output buffer too short");
        } else {
            byte[] var5 = new byte[8];
            if (this.forEncryption) {
                this.desFunc(this.workingKey1, arg0, arg1, var5, 0);
                this.desFunc(this.workingKey2, var5, 0, var5, 0);
                this.desFunc(this.workingKey3, var5, 0, arg2, arg3);
            } else {
                this.desFunc(this.workingKey3, arg0, arg1, var5, 0);
                this.desFunc(this.workingKey2, var5, 0, var5, 0);
                this.desFunc(this.workingKey1, var5, 0, arg2, arg3);
            }
            return 8;
        }
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (!(arg1 instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to DESede init - " + arg1.getClass().getName());
        }
        byte[] var3 = ((KeyParameter) arg1).getKey();
        if (var3.length != 24 && var3.length != 16) {
            throw new IllegalArgumentException("key size must be 16 or 24 bytes.");
        }
        this.forEncryption = arg0;
        byte[] var4 = new byte[8];
        System.arraycopy(var3, 0, var4, 0, var4.length);
        this.workingKey1 = this.generateWorkingKey(arg0, var4);
        byte[] var5 = new byte[8];
        System.arraycopy(var3, 8, var5, 0, var5.length);
        this.workingKey2 = this.generateWorkingKey(!arg0, var5);
        if (var3.length == 24) {
            byte[] var6 = new byte[8];
            System.arraycopy(var3, 16, var6, 0, var6.length);
            this.workingKey3 = this.generateWorkingKey(arg0, var6);
        } else {
            this.workingKey3 = this.workingKey1;
        }
    }

    public void reset() {
    }
}
