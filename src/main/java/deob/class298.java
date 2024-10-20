package deob;

@ObfuscatedName("km")
public final class class298 extends class295 {

    @ObfuscatedName("km.n")
    public byte[] field3853;

    @ObfuscatedName("km.v")
    public int[] field3850;

    @ObfuscatedName("km.y")
    public int field3855;

    @ObfuscatedName("km.r")
    public int field3851;

    @ObfuscatedName("km.h")
    public int field3852;

    @ObfuscatedName("km.d")
    public int field3849;

    @ObfuscatedName("km.s")
    public int field3854;

    @ObfuscatedName("km.b")
    public int field3848;

    @ObfuscatedName("km.n()V")
    public void method4828() {
        if (this.field3855 == this.field3854 && this.field3851 == this.field3848) {
            return;
        }
        byte[] var1 = new byte[this.field3854 * this.field3848];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3851; var3++) {
            for (int var4 = 0; var4 < this.field3855; var4++) {
                var1[(this.field3849 + var3) * this.field3854 + this.field3852 + var4] = this.field3853[var2++];
            }
        }
        this.field3853 = var1;
        this.field3855 = this.field3854;
        this.field3851 = this.field3848;
        this.field3852 = 0;
        this.field3849 = 0;
    }

    @ObfuscatedName("km.v(III)V")
    public void method4836(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3850.length; var4++) {
            int var5 = this.field3850[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field3850[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field3850[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field3850[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("km.y(II)V")
    public void method4830(int arg0, int arg1) {
        int var3 = this.field3852 + arg0;
        int var4 = this.field3849 + arg1;
        int var5 = Statics.field3835 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3851;
        int var8 = this.field3855;
        int var9 = Statics.field3835 - var8;
        int var10 = 0;
        if (var4 < field3834) {
            int var11 = field3834 - var4;
            var7 -= var11;
            var4 = field3834;
            var6 += var8 * var11;
            var5 += Statics.field3835 * var11;
        }
        if (var4 + var7 > field3832) {
            var7 -= var4 + var7 - field3832;
        }
        if (var3 < field3836) {
            int var12 = field3836 - var3;
            var8 -= var12;
            var3 = field3836;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3831) {
            int var13 = var3 + var8 - field3831;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method4831(Statics.field3837, this.field3853, this.field3850, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("km.r([I[B[IIIIIII)V")
    public static void method4831(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("km.h(IIII)V")
    public void method4832(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field3855;
        int var6 = this.field3851;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3854;
        int var10 = this.field3848;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3852 > 0) {
            int var13 = ((this.field3852 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3852 << 16);
        }
        if (this.field3849 > 0) {
            int var14 = ((this.field3849 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3849 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field3835 * arg1 + arg0;
        int var16 = Statics.field3835 - arg2;
        if (arg1 + arg3 > field3832) {
            arg3 -= arg1 + arg3 - field3832;
        }
        if (arg1 < field3834) {
            int var17 = field3834 - arg1;
            arg3 -= var17;
            var15 += Statics.field3835 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field3831) {
            int var18 = arg0 + arg2 - field3831;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field3836) {
            int var19 = field3836 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method4837(Statics.field3837, this.field3853, this.field3850, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("km.d([I[B[IIIIIIIIII)V")
    public static void method4837(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }
}
