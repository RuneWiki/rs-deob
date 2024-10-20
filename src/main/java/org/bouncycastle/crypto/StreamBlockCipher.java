package org.bouncycastle.crypto;

public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {

    public final BlockCipher cipher;

    public StreamBlockCipher(BlockCipher arg0) {
        this.cipher = arg0;
    }

    public abstract byte calculateByte(byte arg0);

    public final byte returnByte(byte arg0) {
        return this.calculateByte(arg0);
    }

    public int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException {
        if (arg2 + arg4 > arg3.length) {
            throw new DataLengthException("output buffer too short");
        } else if (arg1 + arg2 > arg0.length) {
            throw new DataLengthException("input buffer too small");
        } else {
            int var6 = arg1;
            int var7 = arg1 + arg2;
            int var8 = arg4;
            while (var6 < var7) {
                arg3[var8++] = this.calculateByte(arg0[var6++]);
            }
            return arg2;
        }
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }
}
