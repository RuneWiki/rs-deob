package deob;

@ObfuscatedName("hy")
public final class class223 extends class220 {

    @ObfuscatedName("hy.f")
    public byte[] field3208;

    @ObfuscatedName("hy.i")
    public int[] field3209;

    @ObfuscatedName("hy.u")
    public int field3214;

    @ObfuscatedName("hy.h")
    public int field3211;

    @ObfuscatedName("hy.r")
    public int field3212;

    @ObfuscatedName("hy.o")
    public int field3210;

    @ObfuscatedName("hy.l")
    public int field3213;

    @ObfuscatedName("hy.n")
    public int field3215;

    @ObfuscatedName("hy.f()V")
    public void method3850() {
        if (this.field3214 == this.field3213 && this.field3215 == this.field3211) {
            return;
        }
        byte[] var1 = new byte[this.field3215 * this.field3213];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3211; var3++) {
            for (int var4 = 0; var4 < this.field3214; var4++) {
                var1[(this.field3210 + var3) * this.field3213 + this.field3212 + var4] = this.field3208[var2++];
            }
        }
        this.field3208 = var1;
        this.field3214 = this.field3213;
        this.field3211 = this.field3215;
        this.field3212 = 0;
        this.field3210 = 0;
    }

    @ObfuscatedName("hy.i(III)V")
    public void method3848(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3209.length; var4++) {
            int var5 = this.field3209[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3209[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3209[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3209[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("hy.u(II)V")
    public void method3846(int arg0, int arg1) {
        int var3 = this.field3212 + arg0;
        int var4 = this.field3210 + arg1;
        int var5 = Statics.field3193 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3211;
        int var8 = this.field3214;
        int var9 = Statics.field3193 - var8;
        int var10 = 0;
        if (var4 < field3192) {
            int var11 = field3192 - var4;
            var7 -= var11;
            var4 = field3192;
            var6 += var8 * var11;
            var5 += Statics.field3193 * var11;
        }
        if (var4 + var7 > field3190) {
            var7 -= var4 + var7 - field3190;
        }
        if (var3 < field3194) {
            int var12 = field3194 - var3;
            var8 -= var12;
            var3 = field3194;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3195) {
            int var13 = var3 + var8 - field3195;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method3851(Statics.field3189, this.field3208, this.field3209, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("hy.r([I[B[IIIIIII)V")
    public static void method3851(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
