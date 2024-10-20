package deob;

@ObfuscatedName("qq")
public final class class450 extends class447 {

    @ObfuscatedName("qq.v")
    public byte[] field4708;

    @ObfuscatedName("qq.c")
    public int[] field4702;

    @ObfuscatedName("qq.i")
    public int field4703;

    @ObfuscatedName("qq.f")
    public int field4704;

    @ObfuscatedName("qq.b")
    public int field4705;

    @ObfuscatedName("qq.n")
    public int field4706;

    @ObfuscatedName("qq.s")
    public int field4707;

    @ObfuscatedName("qq.l")
    public int field4701;

    @ObfuscatedName("qq.v()V")
    public void method7351() {
        if (this.field4707 == this.field4703 && this.field4704 == this.field4701) {
            return;
        }
        byte[] var1 = new byte[this.field4707 * this.field4701];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4704; var3++) {
            for (int var4 = 0; var4 < this.field4703; var4++) {
                var1[(this.field4706 + var3) * this.field4707 + this.field4705 + var4] = this.field4708[var2++];
            }
        }
        this.field4708 = var1;
        this.field4703 = this.field4707;
        this.field4704 = this.field4701;
        this.field4705 = 0;
        this.field4706 = 0;
    }

    @ObfuscatedName("qq.c(III)V")
    public void method7340(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field4702.length; var4++) {
            int var5 = this.field4702[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field4702[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field4702[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field4702[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @ObfuscatedName("qq.i(II)V")
    public void method7333(int arg0, int arg1) {
        int var3 = this.field4705 + arg0;
        int var4 = this.field4706 + arg1;
        int var5 = Statics.field4689 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4704;
        int var8 = this.field4703;
        int var9 = Statics.field4689 - var8;
        int var10 = 0;
        if (var4 < field4688) {
            int var11 = field4688 - var4;
            var7 -= var11;
            var4 = field4688;
            var6 += var8 * var11;
            var5 += Statics.field4689 * var11;
        }
        if (var4 + var7 > field4685) {
            var7 -= var4 + var7 - field4685;
        }
        if (var3 < field4690) {
            int var12 = field4690 - var3;
            var8 -= var12;
            var3 = field4690;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field4691) {
            int var13 = var3 + var8 - field4691;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method7334(Statics.field4686, this.field4708, this.field4702, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("qq.f([I[B[IIIIIII)V")
    public static void method7334(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("qq.b(IIII)V")
    public void method7336(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field4703;
        int var6 = this.field4704;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4707;
        int var10 = this.field4701;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4705 > 0) {
            int var13 = ((this.field4705 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4705 << 16);
        }
        if (this.field4706 > 0) {
            int var14 = ((this.field4706 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4706 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field4689 * arg1 + arg0;
        int var16 = Statics.field4689 - arg2;
        if (arg1 + arg3 > field4685) {
            arg3 -= arg1 + arg3 - field4685;
        }
        if (arg1 < field4688) {
            int var17 = field4688 - arg1;
            arg3 -= var17;
            var15 += Statics.field4689 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field4691) {
            int var18 = arg0 + arg2 - field4691;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field4690) {
            int var19 = field4690 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method7354(Statics.field4686, this.field4708, this.field4702, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("qq.n([I[B[IIIIIIIIII)V")
    public static void method7354(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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
