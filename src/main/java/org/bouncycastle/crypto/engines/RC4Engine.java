package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

public class RC4Engine implements StreamCipher {

    public byte[] engineState = null;

    public int x = 0;

    public int y = 0;

    public byte[] workingKey = null;

    public static final int STATE_LENGTH = 256;

    public void reset() {
        this.setKey(this.workingKey);
    }

    public void init(boolean arg0, CipherParameters arg1) {
        if (!arg1 instanceof KeyParameter) {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + arg1.getClass().getName());
        }
        this.workingKey = ((KeyParameter) arg1).getKey();
        this.setKey(this.workingKey);
    }

    public String getAlgorithmName() {
        return "RC4";
    }

    public byte returnByte(byte arg0) {
        this.x = this.x + 1 & 0xFF;
        this.y = this.engineState[this.x] + this.y & 0xFF;
        byte var2 = this.engineState[this.x];
        this.engineState[this.x] = this.engineState[this.y];
        this.engineState[this.y] = var2;
        return (byte) (arg0 ^ this.engineState[this.engineState[this.y] + this.engineState[this.x] & 0xFF]);
    }

    public void setKey(byte[] arg0) {
        this.workingKey = arg0;
        this.x = 0;
        this.y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int var2 = 0; var2 < 256; var2++) {
            this.engineState[var2] = (byte) var2;
        }
        int var3 = 0;
        int var4 = 0;
        for (int var5 = 0; var5 < 256; var5++) {
            var4 = (arg0[var3] & 0xFF) + this.engineState[var5] + var4 & 0xFF;
            byte var6 = this.engineState[var5];
            this.engineState[var5] = this.engineState[var4];
            this.engineState[var4] = var6;
            var3 = (var3 + 1) % arg0.length;
        }
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg1 + arg2 > arg0.length) {
            throw new DataLengthException("input buffer too short");
        } else if (arg2 + arg4 > arg3.length) {
            throw new OutputLengthException("output buffer too short");
        } else {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.x = this.x + 1 & 0xFF;
                this.y = this.engineState[this.x] + this.y & 0xFF;
                byte var7 = this.engineState[this.x];
                this.engineState[this.x] = this.engineState[this.y];
                this.engineState[this.y] = var7;
                arg3[arg4 + var6] = (byte) (arg0[arg1 + var6] ^ this.engineState[this.engineState[this.y] + this.engineState[this.x] & 0xFF]);
            }
            return arg2;
        }
    }
}
