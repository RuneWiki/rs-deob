package deob;

@ObfuscatedName("hd")
public final class class227 extends class224 {

    @ObfuscatedName("hd.d")
    public byte[] field3228;

    @ObfuscatedName("hd.c")
    public int[] field3227;

    @ObfuscatedName("hd.n")
    public int field3233;

    @ObfuscatedName("hd.q")
    public int field3230;

    @ObfuscatedName("hd.t")
    public int field3231;

    @ObfuscatedName("hd.p")
    public int field3232;

    @ObfuscatedName("hd.u")
    public int field3234;

    @ObfuscatedName("hd.z")
    public int field3229;

    @ObfuscatedName("hd.d()V")
    public void method3929() {
        if (this.field3234 == this.field3233 && this.field3230 == this.field3229) {
            return;
        }
        byte[] var1 = new byte[this.field3234 * this.field3229];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3230; var3++) {
            for (int var4 = 0; var4 < this.field3233; var4++) {
                var1[(this.field3232 + var3) * this.field3234 + this.field3231 + var4] = this.field3228[var2++];
            }
        }
        this.field3228 = var1;
        this.field3233 = this.field3234;
        this.field3230 = this.field3229;
        this.field3231 = 0;
        this.field3232 = 0;
    }

    @ObfuscatedName("hd.c(III)V")
    public void method3931(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3227.length; var4++) {
            int var5 = this.field3227[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3227[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3227[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3227[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("hd.n(II)V")
    public void method3932(int arg0, int arg1) {
        int var3 = this.field3231 + arg0;
        int var4 = this.field3232 + arg1;
        int var5 = Statics.field3210 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3230;
        int var8 = this.field3233;
        int var9 = Statics.field3210 - var8;
        int var10 = 0;
        if (var4 < field3212) {
            int var11 = field3212 - var4;
            var7 -= var11;
            var4 = field3212;
            var6 += var8 * var11;
            var5 += Statics.field3210 * var11;
        }
        if (var4 + var7 > field3214) {
            var7 -= var4 + var7 - field3214;
        }
        if (var3 < field3209) {
            int var12 = field3209 - var3;
            var8 -= var12;
            var3 = field3209;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3215) {
            int var13 = var3 + var8 - field3215;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method3930(Statics.field3213, this.field3228, this.field3227, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("hd.q([I[B[IIIIIII)V")
    public static void method3930(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var13 & 0xFF];
                }
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }
}
