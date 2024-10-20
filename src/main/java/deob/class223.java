package deob;

@ObfuscatedName("hl")
public final class class223 extends class220 {

    @ObfuscatedName("hl.u")
    public byte[] field3194;

    @ObfuscatedName("hl.x")
    public int[] field3192;

    @ObfuscatedName("hl.i")
    public int field3196;

    @ObfuscatedName("hl.a")
    public int field3191;

    @ObfuscatedName("hl.f")
    public int field3195;

    @ObfuscatedName("hl.c")
    public int field3193;

    @ObfuscatedName("hl.d")
    public int field3197;

    @ObfuscatedName("hl.l")
    public int field3198;

    @ObfuscatedName("hl.u()V")
    public void method3836() {
        if (this.field3197 == this.field3196 && this.field3198 == this.field3191) {
            return;
        }
        byte[] var1 = new byte[this.field3198 * this.field3197];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3191; var3++) {
            for (int var4 = 0; var4 < this.field3196; var4++) {
                var1[(this.field3193 + var3) * this.field3197 + this.field3195 + var4] = this.field3194[var2++];
            }
        }
        this.field3194 = var1;
        this.field3196 = this.field3197;
        this.field3191 = this.field3198;
        this.field3195 = 0;
        this.field3193 = 0;
    }

    @ObfuscatedName("hl.x(III)V")
    public void method3841(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3192.length; var4++) {
            int var5 = this.field3192[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3192[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3192[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3192[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("hl.i(II)V")
    public void method3839(int arg0, int arg1) {
        int var3 = this.field3195 + arg0;
        int var4 = this.field3193 + arg1;
        int var5 = Statics.field3175 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3191;
        int var8 = this.field3196;
        int var9 = Statics.field3175 - var8;
        int var10 = 0;
        if (var4 < field3173) {
            int var11 = field3173 - var4;
            var7 -= var11;
            var4 = field3173;
            var6 += var8 * var11;
            var5 += Statics.field3175 * var11;
        }
        if (var4 + var7 > field3174) {
            var7 -= var4 + var7 - field3174;
        }
        if (var3 < field3172) {
            int var12 = field3172 - var3;
            var8 -= var12;
            var3 = field3172;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3176) {
            int var13 = var3 + var8 - field3176;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method3840(Statics.field3171, this.field3194, this.field3192, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("hl.a([I[B[IIIIIII)V")
    public static void method3840(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
