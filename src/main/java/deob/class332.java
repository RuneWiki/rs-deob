package deob;

@ObfuscatedName("lv")
public final class class332 extends class328 {

    @ObfuscatedName("lv.g")
    public int[] field3986;

    @ObfuscatedName("lv.e")
    public int field3991;

    @ObfuscatedName("lv.b")
    public int field3988;

    @ObfuscatedName("lv.z")
    public int field3989;

    @ObfuscatedName("lv.n")
    public int field3997;

    @ObfuscatedName("lv.l")
    public int field3992;

    @ObfuscatedName("lv.s")
    public int field3990;

    public class332() {
    }

    public class332(int arg0, int arg1) {
        this(new int[arg0 * arg1], arg0, arg1);
    }

    public class332(int[] arg0, int arg1, int arg2) {
        this.field3986 = arg0;
        this.field3991 = this.field3992 = arg1;
        this.field3988 = this.field3990 = arg2;
        this.field3997 = 0;
        this.field3989 = 0;
    }

    @ObfuscatedName("lv.g()Llv;")
    public class332 method5450() {
        class332 var1 = new class332(this.field3991, this.field3988);
        var1.field3992 = this.field3992;
        var1.field3990 = this.field3990;
        var1.field3989 = this.field3992 - this.field3991 - this.field3989;
        var1.field3997 = this.field3997;
        for (int var2 = 0; var2 < this.field3988; var2++) {
            for (int var3 = 0; var3 < this.field3991; var3++) {
                var1.field3986[this.field3991 * var2 + var3] = this.field3986[this.field3991 * var2 + this.field3991 - 1 - var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("lv.e()Llv;")
    public class332 method5452() {
        class332 var1 = new class332(this.field3992, this.field3990);
        for (int var2 = 0; var2 < this.field3988; var2++) {
            for (int var3 = 0; var3 < this.field3991; var3++) {
                var1.field3986[(this.field3997 + var2) * this.field3992 + this.field3989 + var3] = this.field3986[this.field3991 * var2 + var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("lv.b()V")
    public void method5453() {
        method5366(this.field3986, this.field3991, this.field3988);
    }

    @ObfuscatedName("lv.z()V")
    public void method5462() {
        if (this.field3992 == this.field3991 && this.field3990 == this.field3988) {
            return;
        }
        int[] var1 = new int[this.field3992 * this.field3990];
        for (int var2 = 0; var2 < this.field3988; var2++) {
            for (int var3 = 0; var3 < this.field3991; var3++) {
                var1[(this.field3997 + var2) * this.field3992 + this.field3989 + var3] = this.field3986[this.field3991 * var2 + var3];
            }
        }
        this.field3986 = var1;
        this.field3991 = this.field3992;
        this.field3988 = this.field3990;
        this.field3989 = 0;
        this.field3997 = 0;
    }

    @ObfuscatedName("lv.n(I)V")
    public void method5455(int arg0) {
        if (this.field3992 == this.field3991 && this.field3990 == this.field3988) {
            return;
        }
        int var2 = arg0;
        if (arg0 > this.field3989) {
            var2 = this.field3989;
        }
        int var3 = arg0;
        if (this.field3989 + arg0 + this.field3991 > this.field3992) {
            var3 = this.field3992 - this.field3989 - this.field3991;
        }
        int var4 = arg0;
        if (arg0 > this.field3997) {
            var4 = this.field3997;
        }
        int var5 = arg0;
        if (this.field3997 + arg0 + this.field3988 > this.field3990) {
            var5 = this.field3990 - this.field3997 - this.field3988;
        }
        int var6 = this.field3991 + var2 + var3;
        int var7 = this.field3988 + var4 + var5;
        int[] var8 = new int[var6 * var7];
        for (int var9 = 0; var9 < this.field3988; var9++) {
            for (int var10 = 0; var10 < this.field3991; var10++) {
                var8[(var4 + var9) * var6 + var2 + var10] = this.field3986[this.field3991 * var9 + var10];
            }
        }
        this.field3986 = var8;
        this.field3991 = var6;
        this.field3988 = var7;
        this.field3989 -= var2;
        this.field3997 -= var4;
    }

    @ObfuscatedName("lv.l()V")
    public void method5456() {
        int[] var1 = new int[this.field3991 * this.field3988];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3988; var3++) {
            for (int var4 = this.field3991 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3986[this.field3991 * var3 + var4];
            }
        }
        this.field3986 = var1;
        this.field3989 = this.field3992 - this.field3991 - this.field3989;
    }

    @ObfuscatedName("lv.s()V")
    public void method5457() {
        int[] var1 = new int[this.field3991 * this.field3988];
        int var2 = 0;
        for (int var3 = this.field3988 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3991; var4++) {
                var1[var2++] = this.field3986[this.field3991 * var3 + var4];
            }
        }
        this.field3986 = var1;
        this.field3997 = this.field3990 - this.field3988 - this.field3997;
    }

    @ObfuscatedName("lv.y(I)V")
    public void method5458(int arg0) {
        int[] var2 = new int[this.field3991 * this.field3988];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3988; var4++) {
            for (int var5 = 0; var5 < this.field3991; var5++) {
                int var6 = this.field3986[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field3986[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field3986[var3 - this.field3991] != 0) {
                        var6 = arg0;
                    } else if (var5 < this.field3991 - 1 && this.field3986[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < this.field3988 - 1 && this.field3986[this.field3991 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field3986 = var2;
    }

    @ObfuscatedName("lv.c(I)V")
    public void method5459(int arg0) {
        for (int var2 = this.field3988 - 1; var2 > 0; var2--) {
            int var3 = this.field3991 * var2;
            for (int var4 = this.field3991 - 1; var4 > 0; var4--) {
                if (this.field3986[var3 + var4] == 0 && this.field3986[var3 + var4 - 1 - this.field3991] != 0) {
                    this.field3986[var3 + var4] = arg0;
                }
            }
        }
    }

    @ObfuscatedName("lv.o(II)V")
    public void method5460(int arg0, int arg1) {
        int var3 = this.field3989 + arg0;
        int var4 = this.field3997 + arg1;
        int var5 = Statics.field3961 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3988;
        int var8 = this.field3991;
        int var9 = Statics.field3961 - var8;
        int var10 = 0;
        if (var4 < field3963) {
            int var11 = field3963 - var4;
            var7 -= var11;
            var4 = field3963;
            var6 += var8 * var11;
            var5 += Statics.field3961 * var11;
        }
        if (var4 + var7 > field3964) {
            var7 -= var4 + var7 - field3964;
        }
        if (var3 < field3965) {
            int var12 = field3965 - var3;
            var8 -= var12;
            var3 = field3965;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3966) {
            int var13 = var3 + var8 - field3966;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method5474(Statics.field3960, this.field3986, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("lv.d([I[IIIIIII)V")
    public static void method5474(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @ObfuscatedName("lv.r(II)V")
    public void method5524(int arg0, int arg1) {
        int var3 = this.field3989 + arg0;
        int var4 = this.field3997 + arg1;
        int var5 = Statics.field3961 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3988;
        int var8 = this.field3991;
        int var9 = Statics.field3961 - var8;
        int var10 = 0;
        if (var4 < field3963) {
            int var11 = field3963 - var4;
            var7 -= var11;
            var4 = field3963;
            var6 += var8 * var11;
            var5 += Statics.field3961 * var11;
        }
        if (var4 + var7 > field3964) {
            var7 -= var4 + var7 - field3964;
        }
        if (var3 < field3965) {
            int var12 = field3965 - var3;
            var8 -= var12;
            var3 = field3965;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3966) {
            int var13 = var3 + var8 - field3966;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method5523(Statics.field3960, this.field3986, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("lv.p([I[IIIIIIII)V")
    public static void method5523(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var13;
                }
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("lv.q(IIII)V")
    public void method5532(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var5 = this.field3991;
        int var6 = this.field3988;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3992;
        int var10 = this.field3990;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3989 > 0) {
            int var13 = ((this.field3989 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3989 << 16);
        }
        if (this.field3997 > 0) {
            int var14 = ((this.field3997 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3997 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field3961 * arg1 + arg0;
        int var16 = Statics.field3961 - arg2;
        if (arg1 + arg3 > field3964) {
            arg3 -= arg1 + arg3 - field3964;
        }
        if (arg1 < field3963) {
            int var17 = field3963 - arg1;
            arg3 -= var17;
            var15 += Statics.field3961 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field3966) {
            int var18 = arg0 + arg2 - field3966;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field3965) {
            int var19 = field3965 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method5547(Statics.field3960, this.field3986, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("lv.f([I[IIIIIIIIIII)V")
    public static void method5547(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                int var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = var16;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @ObfuscatedName("lv.j(IIII)V")
    public void method5464(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method5524(arg0, arg1);
            return;
        }
        int var5 = this.field3989 + arg0;
        int var6 = this.field3997 + arg1;
        int var7 = Statics.field3961 * var6 + var5;
        int var8 = 0;
        int var9 = this.field3988;
        int var10 = this.field3991;
        int var11 = Statics.field3961 - var10;
        int var12 = 0;
        if (var6 < field3963) {
            int var13 = field3963 - var6;
            var9 -= var13;
            var6 = field3963;
            var8 += var10 * var13;
            var7 += Statics.field3961 * var13;
        }
        if (var6 + var9 > field3964) {
            var9 -= var6 + var9 - field3964;
        }
        if (var5 < field3965) {
            int var14 = field3965 - var5;
            var10 -= var14;
            var5 = field3965;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > field3966) {
            int var15 = var5 + var10 - field3966;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            method5465(Statics.field3960, this.field3986, 0, var8, var7, var10, var9, var11, var12, arg2, arg3);
        }
    }

    @ObfuscatedName("lv.v([I[IIIIIIIIII)V")
    public static void method5465(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = 256 - arg9;
        int var12 = (arg10 & 0xFF00FF) * var11 & 0xFF00FF00;
        int var13 = (arg10 & 0xFF00) * var11 & 0xFF0000;
        int var14 = (var12 | var13) >>> 8;
        for (int var15 = -arg6; var15 < 0; var15++) {
            for (int var16 = -arg5; var16 < 0; var16++) {
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    int var18 = (var17 & 0xFF00FF) * arg9 & 0xFF00FF00;
                    int var19 = (var17 & 0xFF00) * arg9 & 0xFF0000;
                    arg0[arg4++] = ((var18 | var19) >>> 8) + var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("lv.u(III)V")
    public void method5466(int arg0, int arg1, int arg2) {
        int var4 = this.field3989 + arg0;
        int var5 = this.field3997 + arg1;
        int var6 = Statics.field3961 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3988;
        int var9 = this.field3991;
        int var10 = Statics.field3961 - var9;
        int var11 = 0;
        if (var5 < field3963) {
            int var12 = field3963 - var5;
            var8 -= var12;
            var5 = field3963;
            var7 += var9 * var12;
            var6 += Statics.field3961 * var12;
        }
        if (var5 + var8 > field3964) {
            var8 -= var5 + var8 - field3964;
        }
        if (var4 < field3965) {
            int var13 = field3965 - var4;
            var9 -= var13;
            var4 = field3965;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field3966) {
            int var14 = var4 + var9 - field3966;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method5467(Statics.field3960, this.field3986, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("lv.k([I[IIIIIIIII)V")
    public static void method5467(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 0xFF00FF) * arg9 + (var14 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 + (var14 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @ObfuscatedName("lv.w(IIIII)V")
    public void method5468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field3991;
        int var7 = this.field3988;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3992;
        int var11 = this.field3990;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3989 > 0) {
            int var14 = ((this.field3989 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3989 << 16);
        }
        if (this.field3997 > 0) {
            int var15 = ((this.field3997 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3997 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field3961 * arg1 + arg0;
        int var17 = Statics.field3961 - arg2;
        if (arg1 + arg3 > field3964) {
            arg3 -= arg1 + arg3 - field3964;
        }
        if (arg1 < field3963) {
            int var18 = field3963 - arg1;
            arg3 -= var18;
            var16 += Statics.field3961 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field3966) {
            int var19 = arg0 + arg2 - field3966;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field3965) {
            int var20 = field3965 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method5469(Statics.field3960, this.field3986, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @ObfuscatedName("lv.x([I[IIIIIIIIIIII)V")
    public static void method5469(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = 256 - arg12;
        int var14 = arg3;
        for (int var15 = -arg8; var15 < 0; var15++) {
            int var16 = (arg4 >> 16) * arg11;
            for (int var17 = -arg7; var17 < 0; var17++) {
                int var18 = arg1[(arg3 >> 16) + var16];
                if (var18 == 0) {
                    arg5++;
                } else {
                    int var19 = arg0[arg5];
                    arg0[arg5++] = ((var18 & 0xFF00FF) * arg12 + (var19 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var18 & 0xFF00) * arg12 + (var19 & 0xFF00) * var13 & 0xFF0000) >> 8;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var14;
            arg5 += arg6;
        }
    }

    @ObfuscatedName("lv.t(III)V")
    public void method5470(int arg0, int arg1, int arg2) {
        int var4 = this.field3989 + arg0;
        int var5 = this.field3997 + arg1;
        int var6 = Statics.field3961 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3988;
        int var9 = this.field3991;
        int var10 = Statics.field3961 - var9;
        int var11 = 0;
        if (var5 < field3963) {
            int var12 = field3963 - var5;
            var8 -= var12;
            var5 = field3963;
            var7 += var9 * var12;
            var6 += Statics.field3961 * var12;
        }
        if (var5 + var8 > field3964) {
            var8 -= var5 + var8 - field3964;
        }
        if (var4 < field3965) {
            int var13 = field3965 - var4;
            var9 -= var13;
            var4 = field3965;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field3966) {
            int var14 = var4 + var9 - field3966;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        if (arg2 == 256) {
            method5471(0, 0, 0, Statics.field3960, this.field3986, var7, 0, var6, 0, var9, var8, var10, var11);
        } else {
            method5472(0, 0, 0, Statics.field3960, this.field3986, var7, 0, var6, 0, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("lv.ax(III[I[IIIIIIIII)V")
    public static void method5471(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg4[arg5++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg3[arg7];
                    int var17 = var15 + var16;
                    int var18 = (var15 & 0xFF00FF) + (var16 & 0xFF00FF);
                    int var19 = (var17 - var18 & 0x10000) + (var18 & 0x1000100);
                    arg3[arg7++] = var17 - var19 | var19 - (var19 >>> 8);
                }
            }
            arg7 += arg11;
            arg5 += arg12;
        }
    }

    @ObfuscatedName("lv.ai(III[I[IIIIIIIIII)V")
    public static void method5472(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = -arg9; var15 < 0; var15++) {
                int var16 = arg4[arg5++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    int var17 = (var16 & 0xFF00FF) * arg13;
                    int var18 = (arg13 * var16 - var17 & 0xFF0000) + (var17 & 0xFF00FF00) >>> 8;
                    int var19 = arg3[arg7];
                    int var20 = var18 + var19;
                    int var21 = (var18 & 0xFF00FF) + (var19 & 0xFF00FF);
                    int var22 = (var20 - var21 & 0x10000) + (var21 & 0x1000100);
                    arg3[arg7++] = var20 - var22 | var22 - (var22 >>> 8);
                }
            }
            arg7 += arg11;
            arg5 += arg12;
        }
    }

    @ObfuscatedName("lv.aj(IIIII)V")
    public void method5473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field3991;
        int var7 = this.field3988;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3992;
        int var11 = this.field3990;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3989 > 0) {
            int var14 = ((this.field3989 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3989 << 16);
        }
        if (this.field3997 > 0) {
            int var15 = ((this.field3997 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3997 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field3961 * arg1 + arg0;
        int var17 = Statics.field3961 - arg2;
        if (arg1 + arg3 > field3964) {
            arg3 -= arg1 + arg3 - field3964;
        }
        if (arg1 < field3963) {
            int var18 = field3963 - arg1;
            arg3 -= var18;
            var16 += Statics.field3961 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field3966) {
            int var19 = arg0 + arg2 - field3966;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field3965) {
            int var20 = field3965 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        if (arg4 == 256) {
            method5478(0, 0, 0, var8, this.field3986, Statics.field3960, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6);
        } else {
            method5475(0, 0, 0, var8, this.field3986, Statics.field3960, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6, arg4);
        }
    }

    @ObfuscatedName("lv.ac(IIII[I[IIIIIIIIIII)V")
    public static void method5478(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int var16 = arg3;
        while (arg8 < 0) {
            int var17 = (arg9 >> 16) * arg15;
            for (int var18 = -arg12; var18 < 0; var18++) {
                int var19 = arg4[(arg3 >> 16) + var17];
                if (var19 == 0) {
                    arg10++;
                } else {
                    int var20 = arg5[arg10];
                    int var21 = var19 + var20;
                    int var22 = (var19 & 0xFF00FF) + (var20 & 0xFF00FF);
                    int var23 = (var21 - var22 & 0x10000) + (var22 & 0x1000100);
                    arg5[arg10++] = var21 - var23 | var23 - (var23 >>> 8);
                }
                arg3 += arg13;
            }
            arg9 += arg14;
            arg3 = var16;
            arg10 += arg11;
            arg8++;
        }
    }

    @ObfuscatedName("lv.ag(IIII[I[IIIIIIIIIIII)V")
    public static void method5475(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
        int var17 = arg3;
        while (arg8 < 0) {
            int var18 = (arg9 >> 16) * arg15;
            for (int var19 = -arg12; var19 < 0; var19++) {
                int var20 = arg4[(arg3 >> 16) + var18];
                if (var20 == 0) {
                    arg10++;
                } else {
                    int var21 = (var20 & 0xFF00FF) * arg16;
                    int var22 = (arg16 * var20 - var21 & 0xFF0000) + (var21 & 0xFF00FF00) >>> 8;
                    int var23 = arg5[arg10];
                    int var24 = var22 + var23;
                    int var25 = (var22 & 0xFF00FF) + (var23 & 0xFF00FF);
                    int var26 = (var24 - var25 & 0x10000) + (var25 & 0x1000100);
                    arg5[arg10++] = var24 - var26 | var26 - (var26 >>> 8);
                }
                arg3 += arg13;
            }
            arg9 += arg14;
            arg3 = var17;
            arg10 += arg11;
            arg8++;
        }
    }

    @ObfuscatedName("lv.ay(IIIIII[I[I)V")
    public void method5476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var9 = arg1 < 0 ? -arg1 : 0;
        int var10 = this.field3988 + arg1 <= arg5 ? this.field3988 : arg5 - arg1;
        int var11 = arg0 < 0 ? -arg0 : 0;
        int var10000;
        if (this.field3991 + arg0 <= arg4) {
            var10000 = this.field3991;
        } else {
            var10000 = arg4 - arg0;
        }
        int var13 = (arg1 + arg3 + var9) * Statics.field3961 + arg0 + arg2 + var11;
        int var14 = arg1 + var9;
        for (int var15 = var9; var15 < var10; var15++) {
            int var16 = arg6[var14];
            int var17 = arg7[var14++];
            int var18 = var13;
            int var19;
            if (arg0 < var16) {
                var19 = var16 - arg0;
                var18 = var19 - var11 + var13;
            } else {
                var19 = var11;
            }
            int var20;
            if (this.field3991 + arg0 <= var16 + var17) {
                var20 = this.field3991;
            } else {
                var20 = var16 + var17 - arg0;
            }
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field3986[this.field3991 * var15 + var21];
                if (var22 == 0) {
                    var18++;
                } else {
                    Statics.field3960[var18++] = var22;
                }
            }
            var13 += Statics.field3961;
        }
    }

    @ObfuscatedName("lv.as(IIIIIIII[I[I)V")
    public void method5477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Statics.field3961 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    Statics.field3960[var22++] = this.field3986[(var23 >> 16) + (var24 >> 16) * this.field3991];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Statics.field3961;
            }
        } catch (Exception var27) {
        }
    }

    @ObfuscatedName("lv.av(IIIIIIDI)V")
    public void method5512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = Statics.field3961 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field3986[(var21 >> 16) + (var22 >> 16) * this.field3991];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        Statics.field3960[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += Statics.field3961;
            }
        } catch (Exception var26) {
        }
    }

    @ObfuscatedName("lv.ao(IIII)V")
    public void method5549(int arg0, int arg1, int arg2, int arg3) {
        this.method5525(this.field3992 << 3, this.field3990 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
    }

    @ObfuscatedName("lv.ak(IIIIII)V")
    public void method5525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field3989 << 4);
        int var8 = arg1 - (this.field3997 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field3991 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field3991 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field3988 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field3988 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field3991 << 4) - var7) * var12 + ((this.field3988 << 4) - var8) * var11;
        int var20 = ((this.field3988 << 4) - var8) * var12 + -((this.field3991 << 4) - var7) * var11;
        int var21;
        int var22;
        if (var13 < var15) {
            var21 = var13;
            var22 = var15;
        } else {
            var21 = var15;
            var22 = var13;
        }
        if (var17 < var21) {
            var21 = var17;
        }
        if (var19 < var21) {
            var21 = var19;
        }
        if (var17 > var22) {
            var22 = var17;
        }
        if (var19 > var22) {
            var22 = var19;
        }
        int var23;
        int var24;
        if (var14 < var16) {
            var23 = var14;
            var24 = var16;
        } else {
            var23 = var16;
            var24 = var14;
        }
        if (var18 < var23) {
            var23 = var18;
        }
        if (var20 < var23) {
            var23 = var20;
        }
        if (var18 > var24) {
            var24 = var18;
        }
        if (var20 > var24) {
            var24 = var20;
        }
        int var25 = var21 >> 12;
        int var26 = var22 + 4095 >> 12;
        int var27 = var23 >> 12;
        int var28 = var24 + 4095 >> 12;
        int var29 = arg2 + var25;
        int var30 = arg2 + var26;
        int var31 = arg3 + var27;
        int var32 = arg3 + var28;
        int var33 = var29 >> 4;
        int var34 = var30 + 15 >> 4;
        int var35 = var31 >> 4;
        int var36 = var32 + 15 >> 4;
        if (var33 < field3965) {
            var33 = field3965;
        }
        if (var34 > field3966) {
            var34 = field3966;
        }
        if (var35 < field3963) {
            var35 = field3963;
        }
        if (var36 > field3964) {
            var36 = field3964;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = Statics.field3961 * var35 + var33;
        double var40 = 1.6777216E7D / (double) arg5;
        int var42 = (int) Math.floor(Math.sin(var9) * var40 + 0.5D);
        int var43 = (int) Math.floor(Math.cos(var9) * var40 + 0.5D);
        int var44 = (var33 << 4) + 8 - arg2;
        int var45 = (var35 << 4) + 8 - arg3;
        int var46 = (var7 << 8) - (var42 * var45 >> 4);
        int var47 = (var8 << 8) + (var43 * var45 >> 4);
        if (var43 == 0) {
            if (var42 == 0) {
                int var48 = var38;
                while (var48 < 0) {
                    int var49 = var39;
                    int var50 = var46;
                    int var51 = var47;
                    int var52 = var37;
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field3991 << 12) < 0 && var47 - (this.field3988 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field3986[(var50 >> 12) + (var51 >> 12) * this.field3991];
                            if (var53 == 0) {
                                var49++;
                            } else {
                                Statics.field3960[var49++] = var53;
                            }
                            var52++;
                        }
                    }
                    var48++;
                    var39 += Statics.field3961;
                }
            } else if (var42 < 0) {
                int var54 = var38;
                while (var54 < 0) {
                    int var55 = var39;
                    int var56 = var46;
                    int var57 = (var42 * var44 >> 4) + var47;
                    int var58 = var37;
                    if (var46 >= 0 && var46 - (this.field3991 << 12) < 0) {
                        int var59;
                        if ((var59 = var57 - (this.field3988 << 12)) >= 0) {
                            int var60 = (var42 - var59) / var42;
                            var58 = var37 + var60;
                            var57 += var42 * var60;
                            var55 = var39 + var60;
                        }
                        int var61;
                        if ((var61 = (var57 - var42) / var42) > var58) {
                            var58 = var61;
                        }
                        while (var58 < 0) {
                            int var62 = this.field3986[(var56 >> 12) + (var57 >> 12) * this.field3991];
                            if (var62 == 0) {
                                var55++;
                            } else {
                                Statics.field3960[var55++] = var62;
                            }
                            var57 += var42;
                            var58++;
                        }
                    }
                    var54++;
                    var46 -= var42;
                    var39 += Statics.field3961;
                }
            } else {
                int var63 = var38;
                while (var63 < 0) {
                    int var64 = var39;
                    int var65 = var46;
                    int var66 = (var42 * var44 >> 4) + var47;
                    int var67 = var37;
                    if (var46 >= 0 && var46 - (this.field3991 << 12) < 0) {
                        if (var66 < 0) {
                            int var68 = (var42 - 1 - var66) / var42;
                            var67 = var37 + var68;
                            var66 += var42 * var68;
                            var64 = var39 + var68;
                        }
                        int var69;
                        if ((var69 = (var66 + 1 - (this.field3988 << 12) - var42) / var42) > var67) {
                            var67 = var69;
                        }
                        while (var67 < 0) {
                            int var70 = this.field3986[(var65 >> 12) + (var66 >> 12) * this.field3991];
                            if (var70 == 0) {
                                var64++;
                            } else {
                                Statics.field3960[var64++] = var70;
                            }
                            var66 += var42;
                            var67++;
                        }
                    }
                    var63++;
                    var46 -= var42;
                    var39 += Statics.field3961;
                }
            }
        } else if (var43 < 0) {
            if (var42 == 0) {
                int var71 = var38;
                while (var71 < 0) {
                    int var72 = var39;
                    int var73 = (var43 * var44 >> 4) + var46;
                    int var74 = var47;
                    int var75 = var37;
                    if (var47 >= 0 && var47 - (this.field3988 << 12) < 0) {
                        int var76;
                        if ((var76 = var73 - (this.field3991 << 12)) >= 0) {
                            int var77 = (var43 - var76) / var43;
                            var75 = var37 + var77;
                            var73 += var43 * var77;
                            var72 = var39 + var77;
                        }
                        int var78;
                        if ((var78 = (var73 - var43) / var43) > var75) {
                            var75 = var78;
                        }
                        while (var75 < 0) {
                            int var79 = this.field3986[(var73 >> 12) + (var74 >> 12) * this.field3991];
                            if (var79 == 0) {
                                var72++;
                            } else {
                                Statics.field3960[var72++] = var79;
                            }
                            var73 += var43;
                            var75++;
                        }
                    }
                    var71++;
                    var47 += var43;
                    var39 += Statics.field3961;
                }
            } else if (var42 < 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = (var42 * var44 >> 4) + var47;
                    int var84 = var37;
                    int var85;
                    if ((var85 = var82 - (this.field3991 << 12)) >= 0) {
                        int var86 = (var43 - var85) / var43;
                        var84 = var37 + var86;
                        var82 += var43 * var86;
                        var83 += var42 * var86;
                        var81 = var39 + var86;
                    }
                    int var87;
                    if ((var87 = (var82 - var43) / var43) > var84) {
                        var84 = var87;
                    }
                    int var88;
                    if ((var88 = var83 - (this.field3988 << 12)) >= 0) {
                        int var89 = (var42 - var88) / var42;
                        var84 += var89;
                        var82 += var43 * var89;
                        var83 += var42 * var89;
                        var81 += var89;
                    }
                    int var90;
                    if ((var90 = (var83 - var42) / var42) > var84) {
                        var84 = var90;
                    }
                    while (var84 < 0) {
                        int var91 = this.field3986[(var82 >> 12) + (var83 >> 12) * this.field3991];
                        if (var91 == 0) {
                            var81++;
                        } else {
                            Statics.field3960[var81++] = var91;
                        }
                        var82 += var43;
                        var83 += var42;
                        var84++;
                    }
                    var80++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field3961;
                }
            } else {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field3991 << 12)) >= 0) {
                        int var98 = (var43 - var97) / var43;
                        var96 = var37 + var98;
                        var94 += var43 * var98;
                        var95 += var42 * var98;
                        var93 = var39 + var98;
                    }
                    int var99;
                    if ((var99 = (var94 - var43) / var43) > var96) {
                        var96 = var99;
                    }
                    if (var95 < 0) {
                        int var100 = (var42 - 1 - var95) / var42;
                        var96 += var100;
                        var94 += var43 * var100;
                        var95 += var42 * var100;
                        var93 += var100;
                    }
                    int var101;
                    if ((var101 = (var95 + 1 - (this.field3988 << 12) - var42) / var42) > var96) {
                        var96 = var101;
                    }
                    while (var96 < 0) {
                        int var102 = this.field3986[(var94 >> 12) + (var95 >> 12) * this.field3991];
                        if (var102 == 0) {
                            var93++;
                        } else {
                            Statics.field3960[var93++] = var102;
                        }
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field3961;
                }
            }
        } else if (var42 == 0) {
            int var103 = var38;
            while (var103 < 0) {
                int var104 = var39;
                int var105 = (var43 * var44 >> 4) + var46;
                int var106 = var47;
                int var107 = var37;
                if (var47 >= 0 && var47 - (this.field3988 << 12) < 0) {
                    if (var105 < 0) {
                        int var108 = (var43 - 1 - var105) / var43;
                        var107 = var37 + var108;
                        var105 += var43 * var108;
                        var104 = var39 + var108;
                    }
                    int var109;
                    if ((var109 = (var105 + 1 - (this.field3991 << 12) - var43) / var43) > var107) {
                        var107 = var109;
                    }
                    while (var107 < 0) {
                        int var110 = this.field3986[(var105 >> 12) + (var106 >> 12) * this.field3991];
                        if (var110 == 0) {
                            var104++;
                        } else {
                            Statics.field3960[var104++] = var110;
                        }
                        var105 += var43;
                        var107++;
                    }
                }
                var103++;
                var47 += var43;
                var39 += Statics.field3961;
            }
        } else if (var42 < 0) {
            int var111 = var38;
            while (var111 < 0) {
                int var112 = var39;
                int var113 = (var43 * var44 >> 4) + var46;
                int var114 = (var42 * var44 >> 4) + var47;
                int var115 = var37;
                if (var113 < 0) {
                    int var116 = (var43 - 1 - var113) / var43;
                    var115 = var37 + var116;
                    var113 += var43 * var116;
                    var114 += var42 * var116;
                    var112 = var39 + var116;
                }
                int var117;
                if ((var117 = (var113 + 1 - (this.field3991 << 12) - var43) / var43) > var115) {
                    var115 = var117;
                }
                int var118;
                if ((var118 = var114 - (this.field3988 << 12)) >= 0) {
                    int var119 = (var42 - var118) / var42;
                    var115 += var119;
                    var113 += var43 * var119;
                    var114 += var42 * var119;
                    var112 += var119;
                }
                int var120;
                if ((var120 = (var114 - var42) / var42) > var115) {
                    var115 = var120;
                }
                while (var115 < 0) {
                    int var121 = this.field3986[(var113 >> 12) + (var114 >> 12) * this.field3991];
                    if (var121 == 0) {
                        var112++;
                    } else {
                        Statics.field3960[var112++] = var121;
                    }
                    var113 += var43;
                    var114 += var42;
                    var115++;
                }
                var111++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field3961;
            }
        } else {
            int var122 = var38;
            while (var122 < 0) {
                int var123 = var39;
                int var124 = (var43 * var44 >> 4) + var46;
                int var125 = (var42 * var44 >> 4) + var47;
                int var126 = var37;
                if (var124 < 0) {
                    int var127 = (var43 - 1 - var124) / var43;
                    var126 = var37 + var127;
                    var124 += var43 * var127;
                    var125 += var42 * var127;
                    var123 = var39 + var127;
                }
                int var128;
                if ((var128 = (var124 + 1 - (this.field3991 << 12) - var43) / var43) > var126) {
                    var126 = var128;
                }
                if (var125 < 0) {
                    int var129 = (var42 - 1 - var125) / var42;
                    var126 += var129;
                    var124 += var43 * var129;
                    var125 += var42 * var129;
                    var123 += var129;
                }
                int var130;
                if ((var130 = (var125 + 1 - (this.field3988 << 12) - var42) / var42) > var126) {
                    var126 = var130;
                }
                while (var126 < 0) {
                    int var131 = this.field3986[(var124 >> 12) + (var125 >> 12) * this.field3991];
                    if (var131 == 0) {
                        var123++;
                    } else {
                        Statics.field3960[var123++] = var131;
                    }
                    var124 += var43;
                    var125 += var42;
                    var126++;
                }
                var122++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field3961;
            }
        }
    }

    @ObfuscatedName("lv.ad(IIII)V")
    public void method5481(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field3992 || arg3 > this.field3990) {
            throw new IllegalArgumentException();
        }
        int var5 = this.field3989 * arg2 / this.field3992 + arg0;
        int var6 = ((this.field3991 + this.field3989) * arg2 + this.field3992 - 1) / this.field3992 + arg0;
        int var7 = this.field3997 * arg3 / this.field3990 + arg1;
        int var8 = ((this.field3997 + this.field3988) * arg3 + this.field3990 - 1) / this.field3990 + arg1;
        if (var5 < field3965) {
            var5 = field3965;
        }
        if (var6 > field3966) {
            var6 = field3966;
        }
        if (var7 < field3963) {
            var7 = field3963;
        }
        if (var8 > field3964) {
            var8 = field3964;
        }
        if (var5 >= var6 || var7 >= var8) {
            return;
        }
        int var9 = Statics.field3961 * var7 + var5;
        int var10 = Statics.field3961 - (var6 - var5);
        if (var9 >= Statics.field3960.length) {
            return;
        }
        for (int var11 = var7; var11 < var8; var11++) {
            for (int var12 = var5; var12 < var6; var12++) {
                int var13 = var12 - arg0 << 4;
                int var14 = var11 - arg1 << 4;
                int var15 = this.field3992 * var13 / arg2 - (this.field3989 << 4);
                int var16 = (var13 + 16) * this.field3992 / arg2 - (this.field3989 << 4);
                int var17 = this.field3990 * var14 / arg3 - (this.field3997 << 4);
                int var18 = (var14 + 16) * this.field3990 / arg3 - (this.field3997 << 4);
                int var19 = (var16 - var15) * (var18 - var17) >> 1;
                if (var19 != 0) {
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    if (var16 >= this.field3991 << 4) {
                        var16 = this.field3991 << 4;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    if (var18 >= this.field3988 << 4) {
                        var18 = this.field3988 << 4;
                    }
                    var16--;
                    var18--;
                    int var20 = 16 - (var15 & 0xF);
                    int var21 = (var16 & 0xF) + 1;
                    int var22 = 16 - (var17 & 0xF);
                    int var23 = (var18 & 0xF) + 1;
                    int var24 = var15 >> 4;
                    int var25 = var16 >> 4;
                    int var26 = var17 >> 4;
                    int var27 = var18 >> 4;
                    int var28 = 0;
                    int var29 = 0;
                    int var30 = 0;
                    int var31 = 0;
                    for (int var32 = var26; var32 <= var27; var32++) {
                        int var33 = 16;
                        if (var26 == var32) {
                            var33 = var22;
                        }
                        if (var27 == var32) {
                            var33 = var23;
                        }
                        for (int var34 = var24; var34 <= var25; var34++) {
                            int var35 = this.field3986[this.field3991 * var32 + var34];
                            if (var35 != 0) {
                                int var37;
                                if (var24 == var34) {
                                    var37 = var20 * var33;
                                } else if (var25 == var34) {
                                    var37 = var21 * var33;
                                } else {
                                    var37 = var33 << 4;
                                }
                                var31 += var37;
                                var28 += (var35 >> 16 & 0xFF) * var37;
                                var29 += (var35 >> 8 & 0xFF) * var37;
                                var30 += (var35 & 0xFF) * var37;
                            }
                        }
                    }
                    if (var31 >= var19) {
                        int var38 = var30 / var31 + (var28 / var31 << 16) + (var29 / var31 << 8);
                        if (var38 == 0) {
                            var38 = 1;
                        }
                        Statics.field3960[var9] = var38;
                    }
                    var9++;
                }
            }
            var9 += var10;
        }
    }
}
