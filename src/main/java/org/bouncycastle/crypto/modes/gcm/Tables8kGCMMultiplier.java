package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

public class Tables8kGCMMultiplier implements GCMMultiplier {

    public byte[] H;

    public int[][][] M;

    public void multiplyH(byte[] arg0) {
        int[] var2 = new int[4];
        for (int var3 = 15; var3 >= 0; var3--) {
            int[] var4 = this.M[var3 + var3][arg0[var3] & 0xF];
            var2[0] ^= var4[0];
            var2[1] ^= var4[1];
            var2[2] ^= var4[2];
            var2[3] ^= var4[3];
            int[] var5 = this.M[var3 + var3 + 1][(arg0[var3] & 0xF0) >>> 4];
            var2[0] ^= var5[0];
            var2[1] ^= var5[1];
            var2[2] ^= var5[2];
            var2[3] ^= var5[3];
        }
        Pack.intToBigEndian(var2, arg0, 0);
    }

    public void init(byte[] arg0) {
        if (this.M == null) {
            this.M = new int[32][16][4];
        } else if (Arrays.areEqual(this.H, arg0)) {
            return;
        }
        this.H = Arrays.clone(arg0);
        GCMUtil.asInts(arg0, this.M[1][8]);
        for (int var2 = 4; var2 >= 1; var2 >>= 0x1) {
            GCMUtil.multiplyP(this.M[1][var2 + var2], this.M[1][var2]);
        }
        GCMUtil.multiplyP(this.M[1][1], this.M[0][8]);
        for (int var3 = 4; var3 >= 1; var3 >>= 0x1) {
            GCMUtil.multiplyP(this.M[0][var3 + var3], this.M[0][var3]);
        }
        int var4 = 0;
        while (true) {
            do {
                for (int var5 = 2; var5 < 16; var5 += var5) {
                    for (int var6 = 1; var6 < var5; var6++) {
                        GCMUtil.xor(this.M[var4][var5], this.M[var4][var6], this.M[var4][var5 + var6]);
                    }
                }
                var4++;
                if (var4 == 32) {
                    return;
                }
            } while (var4 <= 1);
            for (int var7 = 8; var7 > 0; var7 >>= 0x1) {
                GCMUtil.multiplyP8(this.M[var4 - 2][var7], this.M[var4][var7]);
            }
        }
    }
}
