package deob;

@ObfuscatedName("of")
public final class class396 extends class393 {

    @ObfuscatedName("of.f")
    public byte[] field4247;

    @ObfuscatedName("of.e")
    public int[] field4250;

    @ObfuscatedName("of.v")
    public int field4246;

    @ObfuscatedName("of.y")
    public int field4249;

    @ObfuscatedName("of.j")
    public int field4248;

    @ObfuscatedName("of.o")
    public int field4251;

    @ObfuscatedName("of.m")
    public int field4252;

    @ObfuscatedName("of.r")
    public int field4253;

    @ObfuscatedName("of.f()V")
    public void method6255() {
        if (this.field4252 == this.field4246 && this.field4253 == this.field4249) {
            return;
        }
        byte[] var1 = new byte[this.field4253 * this.field4252];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4249; var3++) {
            for (int var4 = 0; var4 < this.field4246; var4++) {
                var1[(this.field4251 + var3) * this.field4252 + this.field4248 + var4] = this.field4247[var2++];
            }
        }
        this.field4247 = var1;
        this.field4246 = this.field4252;
        this.field4249 = this.field4253;
        this.field4248 = 0;
        this.field4251 = 0;
    }

    @ObfuscatedName("of.e(III)V")
    public void method6262(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4250.length; var4++) {
            int var5 = this.field4250[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4250[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4250[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4250[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("of.v(II)V")
    public void method6257(int arg0, int arg1) {
        int var3 = this.field4248 + arg0;
        int var4 = this.field4251 + arg1;
        int var5 = Statics.field4233 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4249;
        int var8 = this.field4246;
        int var9 = Statics.field4233 - var8;
        int var10 = 0;
        if (var4 < field4229) {
            int var11 = field4229 - var4;
            var7 -= var11;
            var4 = field4229;
            var6 += var8 * var11;
            var5 += Statics.field4233 * var11;
        }
        if (var4 + var7 > field4231) {
            var7 -= var4 + var7 - field4231;
        }
        if (var3 < field4234) {
            int var12 = field4234 - var3;
            var8 -= var12;
            var3 = field4234;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field4235) {
            int var13 = var3 + var8 - field4235;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method6271(Statics.field4230, this.field4247, this.field4250, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("of.y([I[B[IIIIIII)V")
    public static void method6271(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("of.j(IIII)V")
    public void method6258(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4246;
        int var6 = this.field4249;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4252;
        int var10 = this.field4253;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4248 > 0) {
            int var13 = ((this.field4248 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4248 << 16);
        }
        if (this.field4251 > 0) {
            int var14 = ((this.field4251 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4251 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field4233 * arg1 + arg0;
        int var16 = Statics.field4233 - arg2;
        if (arg1 + arg3 > field4231) {
            arg3 -= arg1 + arg3 - field4231;
        }
        if (arg1 < field4229) {
            int var17 = field4229 - arg1;
            arg3 -= var17;
            var15 += Statics.field4233 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field4235) {
            int var18 = arg0 + arg2 - field4235;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field4234) {
            int var19 = field4234 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method6259(Statics.field4230, this.field4247, this.field4250, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("of.o([I[B[IIIIIIIIII)V")
    public static void method6259(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
