package deob;

@ObfuscatedName("lc")
public final class class336 extends class332 {

    @ObfuscatedName("lc.f")
    public int[] field3910;

    @ObfuscatedName("lc.b")
    public int field3909;

    @ObfuscatedName("lc.l")
    public int field3915;

    @ObfuscatedName("lc.m")
    public int field3911;

    @ObfuscatedName("lc.z")
    public int field3912;

    @ObfuscatedName("lc.q")
    public int field3908;

    @ObfuscatedName("lc.k")
    public int field3918;

    public class336() {
    }

    public class336(int arg0, int arg1) {
        this(new int[arg0 * arg1], arg0, arg1);
    }

    public class336(int[] arg0, int arg1, int arg2) {
        this.field3910 = arg0;
        this.field3909 = this.field3908 = arg1;
        this.field3915 = this.field3918 = arg2;
        this.field3912 = 0;
        this.field3911 = 0;
    }

    @ObfuscatedName("lc.f()Llc;")
    public class336 method5748() {
        class336 var1 = new class336(this.field3909, this.field3915);
        var1.field3908 = this.field3908;
        var1.field3918 = this.field3918;
        var1.field3911 = this.field3908 - this.field3909 - this.field3911;
        var1.field3912 = this.field3912;
        for (int var2 = 0; var2 < this.field3915; var2++) {
            for (int var3 = 0; var3 < this.field3909; var3++) {
                var1.field3910[this.field3909 * var2 + var3] = this.field3910[this.field3909 * var2 + this.field3909 - 1 - var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("lc.b()Llc;")
    public class336 method5749() {
        class336 var1 = new class336(this.field3908, this.field3918);
        for (int var2 = 0; var2 < this.field3915; var2++) {
            for (int var3 = 0; var3 < this.field3909; var3++) {
                var1.field3910[(this.field3912 + var2) * this.field3908 + this.field3911 + var3] = this.field3910[this.field3909 * var2 + var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("lc.l()V")
    public void method5843() {
        method5649(this.field3910, this.field3909, this.field3915);
    }

    @ObfuscatedName("lc.m()V")
    public void method5751() {
        if (this.field3909 == this.field3908 && this.field3918 == this.field3915) {
            return;
        }
        int[] var1 = new int[this.field3918 * this.field3908];
        for (int var2 = 0; var2 < this.field3915; var2++) {
            for (int var3 = 0; var3 < this.field3909; var3++) {
                var1[(this.field3912 + var2) * this.field3908 + this.field3911 + var3] = this.field3910[this.field3909 * var2 + var3];
            }
        }
        this.field3910 = var1;
        this.field3909 = this.field3908;
        this.field3915 = this.field3918;
        this.field3911 = 0;
        this.field3912 = 0;
    }

    @ObfuscatedName("lc.z(I)V")
    public void method5752(int arg0) {
        if (this.field3909 == this.field3908 && this.field3918 == this.field3915) {
            return;
        }
        int var2 = arg0;
        if (arg0 > this.field3911) {
            var2 = this.field3911;
        }
        int var3 = arg0;
        if (this.field3911 + arg0 + this.field3909 > this.field3908) {
            var3 = this.field3908 - this.field3911 - this.field3909;
        }
        int var4 = arg0;
        if (arg0 > this.field3912) {
            var4 = this.field3912;
        }
        int var5 = arg0;
        if (this.field3912 + arg0 + this.field3915 > this.field3918) {
            var5 = this.field3918 - this.field3912 - this.field3915;
        }
        int var6 = this.field3909 + var2 + var3;
        int var7 = this.field3915 + var4 + var5;
        int[] var8 = new int[var6 * var7];
        for (int var9 = 0; var9 < this.field3915; var9++) {
            for (int var10 = 0; var10 < this.field3909; var10++) {
                var8[(var4 + var9) * var6 + var2 + var10] = this.field3910[this.field3909 * var9 + var10];
            }
        }
        this.field3910 = var8;
        this.field3909 = var6;
        this.field3915 = var7;
        this.field3911 -= var2;
        this.field3912 -= var4;
    }

    @ObfuscatedName("lc.q()V")
    public void method5821() {
        int[] var1 = new int[this.field3915 * this.field3909];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3915; var3++) {
            for (int var4 = this.field3909 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field3910[this.field3909 * var3 + var4];
            }
        }
        this.field3910 = var1;
        this.field3911 = this.field3908 - this.field3909 - this.field3911;
    }

    @ObfuscatedName("lc.k()V")
    public void method5754() {
        int[] var1 = new int[this.field3915 * this.field3909];
        int var2 = 0;
        for (int var3 = this.field3915 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field3909; var4++) {
                var1[var2++] = this.field3910[this.field3909 * var3 + var4];
            }
        }
        this.field3910 = var1;
        this.field3912 = this.field3918 - this.field3915 - this.field3912;
    }

    @ObfuscatedName("lc.c(I)V")
    public void method5755(int arg0) {
        int[] var2 = new int[this.field3915 * this.field3909];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3915; var4++) {
            for (int var5 = 0; var5 < this.field3909; var5++) {
                int var6 = this.field3910[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field3910[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field3910[var3 - this.field3909] != 0) {
                        var6 = arg0;
                    } else if (var5 < this.field3909 - 1 && this.field3910[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < this.field3915 - 1 && this.field3910[this.field3909 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field3910 = var2;
    }

    @ObfuscatedName("lc.u(I)V")
    public void method5789(int arg0) {
        for (int var2 = this.field3915 - 1; var2 > 0; var2--) {
            int var3 = this.field3909 * var2;
            for (int var4 = this.field3909 - 1; var4 > 0; var4--) {
                if (this.field3910[var3 + var4] == 0 && this.field3910[var3 + var4 - 1 - this.field3909] != 0) {
                    this.field3910[var3 + var4] = arg0;
                }
            }
        }
    }

    @ObfuscatedName("lc.t(II)V")
    public void method5800(int arg0, int arg1) {
        int var3 = this.field3911 + arg0;
        int var4 = this.field3912 + arg1;
        int var5 = Statics.field3884 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3915;
        int var8 = this.field3909;
        int var9 = Statics.field3884 - var8;
        int var10 = 0;
        if (var4 < field3887) {
            int var11 = field3887 - var4;
            var7 -= var11;
            var4 = field3887;
            var6 += var8 * var11;
            var5 += Statics.field3884 * var11;
        }
        if (var4 + var7 > field3888) {
            var7 -= var4 + var7 - field3888;
        }
        if (var3 < field3885) {
            int var12 = field3885 - var3;
            var8 -= var12;
            var3 = field3885;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3890) {
            int var13 = var3 + var8 - field3890;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method5747(Statics.field3889, this.field3910, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("lc.e([I[IIIIIII)V")
    public static void method5747(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @ObfuscatedName("lc.o(II)V")
    public void method5773(int arg0, int arg1) {
        int var3 = this.field3911 + arg0;
        int var4 = this.field3912 + arg1;
        int var5 = Statics.field3884 * var4 + var3;
        int var6 = 0;
        int var7 = this.field3915;
        int var8 = this.field3909;
        int var9 = Statics.field3884 - var8;
        int var10 = 0;
        if (var4 < field3887) {
            int var11 = field3887 - var4;
            var7 -= var11;
            var4 = field3887;
            var6 += var8 * var11;
            var5 += Statics.field3884 * var11;
        }
        if (var4 + var7 > field3888) {
            var7 -= var4 + var7 - field3888;
        }
        if (var3 < field3885) {
            int var12 = field3885 - var3;
            var8 -= var12;
            var3 = field3885;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field3890) {
            int var13 = var3 + var8 - field3890;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method5759(Statics.field3889, this.field3910, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("lc.n([I[IIIIIIII)V")
    public static void method5759(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("lc.x(IIII)V")
    public void method5760(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var5 = this.field3909;
        int var6 = this.field3915;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field3908;
        int var10 = this.field3918;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field3911 > 0) {
            int var13 = ((this.field3911 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field3911 << 16);
        }
        if (this.field3912 > 0) {
            int var14 = ((this.field3912 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field3912 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field3884 * arg1 + arg0;
        int var16 = Statics.field3884 - arg2;
        if (arg1 + arg3 > field3888) {
            arg3 -= arg1 + arg3 - field3888;
        }
        if (arg1 < field3887) {
            int var17 = field3887 - arg1;
            arg3 -= var17;
            var15 += Statics.field3884 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field3890) {
            int var18 = arg0 + arg2 - field3890;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field3885) {
            int var19 = field3885 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method5761(Statics.field3889, this.field3910, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("lc.p([I[IIIIIIIIIII)V")
    public static void method5761(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @ObfuscatedName("lc.r(IIII)V")
    public void method5762(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method5773(arg0, arg1);
            return;
        }
        int var5 = this.field3911 + arg0;
        int var6 = this.field3912 + arg1;
        int var7 = Statics.field3884 * var6 + var5;
        int var8 = 0;
        int var9 = this.field3915;
        int var10 = this.field3909;
        int var11 = Statics.field3884 - var10;
        int var12 = 0;
        if (var6 < field3887) {
            int var13 = field3887 - var6;
            var9 -= var13;
            var6 = field3887;
            var8 += var10 * var13;
            var7 += Statics.field3884 * var13;
        }
        if (var6 + var9 > field3888) {
            var9 -= var6 + var9 - field3888;
        }
        if (var5 < field3885) {
            int var14 = field3885 - var5;
            var10 -= var14;
            var5 = field3885;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > field3890) {
            int var15 = var5 + var10 - field3890;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            method5787(Statics.field3889, this.field3910, 0, var8, var7, var10, var9, var11, var12, arg2, arg3);
        }
    }

    @ObfuscatedName("lc.y([I[IIIIIIIIII)V")
    public static void method5787(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
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

    @ObfuscatedName("lc.s(III)V")
    public void method5764(int arg0, int arg1, int arg2) {
        int var4 = this.field3911 + arg0;
        int var5 = this.field3912 + arg1;
        int var6 = Statics.field3884 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3915;
        int var9 = this.field3909;
        int var10 = Statics.field3884 - var9;
        int var11 = 0;
        if (var5 < field3887) {
            int var12 = field3887 - var5;
            var8 -= var12;
            var5 = field3887;
            var7 += var9 * var12;
            var6 += Statics.field3884 * var12;
        }
        if (var5 + var8 > field3888) {
            var8 -= var5 + var8 - field3888;
        }
        if (var4 < field3885) {
            int var13 = field3885 - var4;
            var9 -= var13;
            var4 = field3885;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field3890) {
            int var14 = var4 + var9 - field3890;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method5765(Statics.field3889, this.field3910, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("lc.j([I[IIIIIIIII)V")
    public static void method5765(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("lc.d(IIIII)V")
    public void method5766(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field3909;
        int var7 = this.field3915;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3908;
        int var11 = this.field3918;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3911 > 0) {
            int var14 = ((this.field3911 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3911 << 16);
        }
        if (this.field3912 > 0) {
            int var15 = ((this.field3912 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3912 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field3884 * arg1 + arg0;
        int var17 = Statics.field3884 - arg2;
        if (arg1 + arg3 > field3888) {
            arg3 -= arg1 + arg3 - field3888;
        }
        if (arg1 < field3887) {
            int var18 = field3887 - arg1;
            arg3 -= var18;
            var16 += Statics.field3884 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field3890) {
            int var19 = arg0 + arg2 - field3890;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field3885) {
            int var20 = field3885 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method5767(Statics.field3889, this.field3910, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @ObfuscatedName("lc.a([I[IIIIIIIIIIII)V")
    public static void method5767(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @ObfuscatedName("lc.g(III)V")
    public void method5768(int arg0, int arg1, int arg2) {
        int var4 = this.field3911 + arg0;
        int var5 = this.field3912 + arg1;
        int var6 = Statics.field3884 * var5 + var4;
        int var7 = 0;
        int var8 = this.field3915;
        int var9 = this.field3909;
        int var10 = Statics.field3884 - var9;
        int var11 = 0;
        if (var5 < field3887) {
            int var12 = field3887 - var5;
            var8 -= var12;
            var5 = field3887;
            var7 += var9 * var12;
            var6 += Statics.field3884 * var12;
        }
        if (var5 + var8 > field3888) {
            var8 -= var5 + var8 - field3888;
        }
        if (var4 < field3885) {
            int var13 = field3885 - var4;
            var9 -= var13;
            var4 = field3885;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field3890) {
            int var14 = var4 + var9 - field3890;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        if (arg2 == 256) {
            method5769(0, 0, 0, Statics.field3889, this.field3910, var7, 0, var6, 0, var9, var8, var10, var11);
        } else {
            method5775(0, 0, 0, Statics.field3889, this.field3910, var7, 0, var6, 0, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("lc.h(III[I[IIIIIIIII)V")
    public static void method5769(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @ObfuscatedName("lc.ab(III[I[IIIIIIIIII)V")
    public static void method5775(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
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

    @ObfuscatedName("lc.ac(IIIII)V")
    public void method5771(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field3909;
        int var7 = this.field3915;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field3908;
        int var11 = this.field3918;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field3911 > 0) {
            int var14 = ((this.field3911 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field3911 << 16);
        }
        if (this.field3912 > 0) {
            int var15 = ((this.field3912 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field3912 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field3884 * arg1 + arg0;
        int var17 = Statics.field3884 - arg2;
        if (arg1 + arg3 > field3888) {
            arg3 -= arg1 + arg3 - field3888;
        }
        if (arg1 < field3887) {
            int var18 = field3887 - arg1;
            arg3 -= var18;
            var16 += Statics.field3884 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field3890) {
            int var19 = arg0 + arg2 - field3890;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field3885) {
            int var20 = field3885 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        if (arg4 == 256) {
            method5763(0, 0, 0, var8, this.field3910, Statics.field3889, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6);
        } else {
            method5823(0, 0, 0, var8, this.field3910, Statics.field3889, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6, arg4);
        }
    }

    @ObfuscatedName("lc.ao(IIII[I[IIIIIIIIIII)V")
    public static void method5763(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
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

    @ObfuscatedName("lc.af(IIII[I[IIIIIIIIIIII)V")
    public static void method5823(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
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

    @ObfuscatedName("lc.av(IIIIII[I[I)V")
    public void method5774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var9 = arg1 < 0 ? -arg1 : 0;
        int var10 = this.field3915 + arg1 <= arg5 ? this.field3915 : arg5 - arg1;
        int var11 = arg0 < 0 ? -arg0 : 0;
        int var10000;
        if (this.field3909 + arg0 <= arg4) {
            var10000 = this.field3909;
        } else {
            var10000 = arg4 - arg0;
        }
        int var13 = (arg1 + arg3 + var9) * Statics.field3884 + arg0 + arg2 + var11;
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
            if (this.field3909 + arg0 <= var16 + var17) {
                var20 = this.field3909;
            } else {
                var20 = var16 + var17 - arg0;
            }
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field3910[this.field3909 * var15 + var21];
                if (var22 == 0) {
                    var18++;
                } else {
                    Statics.field3889[var18++] = var22;
                }
            }
            var13 += Statics.field3884;
        }
    }

    @ObfuscatedName("lc.ar(IIIIIIII[I[I)V")
    public void method5837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Statics.field3884 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    Statics.field3889[var22++] = this.field3910[(var23 >> 16) + (var24 >> 16) * this.field3909];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Statics.field3884;
            }
        } catch (Exception var27) {
        }
    }

    @ObfuscatedName("lc.ay(IIIIIIDI)V")
    public void method5781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = Statics.field3884 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field3910[(var21 >> 16) + (var22 >> 16) * this.field3909];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        Statics.field3889[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += Statics.field3884;
            }
        } catch (Exception var26) {
        }
    }

    @ObfuscatedName("lc.ah(IIII)V")
    public void method5777(int arg0, int arg1, int arg2, int arg3) {
        this.method5778(this.field3908 << 3, this.field3918 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
    }

    @ObfuscatedName("lc.az(IIIIII)V")
    public void method5778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field3911 << 4);
        int var8 = arg1 - (this.field3912 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field3909 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field3909 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field3915 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field3915 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field3915 << 4) - var8) * var11 + ((this.field3909 << 4) - var7) * var12;
        int var20 = ((this.field3915 << 4) - var8) * var12 + -((this.field3909 << 4) - var7) * var11;
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
        if (var33 < field3885) {
            var33 = field3885;
        }
        if (var34 > field3890) {
            var34 = field3890;
        }
        if (var35 < field3887) {
            var35 = field3887;
        }
        if (var36 > field3888) {
            var36 = field3888;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = Statics.field3884 * var35 + var33;
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
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field3909 << 12) < 0 && var47 - (this.field3915 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field3910[(var50 >> 12) + (var51 >> 12) * this.field3909];
                            if (var53 == 0) {
                                var49++;
                            } else {
                                Statics.field3889[var49++] = var53;
                            }
                            var52++;
                        }
                    }
                    var48++;
                    var39 += Statics.field3884;
                }
            } else if (var42 < 0) {
                int var54 = var38;
                while (var54 < 0) {
                    int var55 = var39;
                    int var56 = var46;
                    int var57 = (var42 * var44 >> 4) + var47;
                    int var58 = var37;
                    if (var46 >= 0 && var46 - (this.field3909 << 12) < 0) {
                        int var59;
                        if ((var59 = var57 - (this.field3915 << 12)) >= 0) {
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
                            int var62 = this.field3910[(var56 >> 12) + (var57 >> 12) * this.field3909];
                            if (var62 == 0) {
                                var55++;
                            } else {
                                Statics.field3889[var55++] = var62;
                            }
                            var57 += var42;
                            var58++;
                        }
                    }
                    var54++;
                    var46 -= var42;
                    var39 += Statics.field3884;
                }
            } else {
                int var63 = var38;
                while (var63 < 0) {
                    int var64 = var39;
                    int var65 = var46;
                    int var66 = (var42 * var44 >> 4) + var47;
                    int var67 = var37;
                    if (var46 >= 0 && var46 - (this.field3909 << 12) < 0) {
                        if (var66 < 0) {
                            int var68 = (var42 - 1 - var66) / var42;
                            var67 = var37 + var68;
                            var66 += var42 * var68;
                            var64 = var39 + var68;
                        }
                        int var69;
                        if ((var69 = (var66 + 1 - (this.field3915 << 12) - var42) / var42) > var67) {
                            var67 = var69;
                        }
                        while (var67 < 0) {
                            int var70 = this.field3910[(var65 >> 12) + (var66 >> 12) * this.field3909];
                            if (var70 == 0) {
                                var64++;
                            } else {
                                Statics.field3889[var64++] = var70;
                            }
                            var66 += var42;
                            var67++;
                        }
                    }
                    var63++;
                    var46 -= var42;
                    var39 += Statics.field3884;
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
                    if (var47 >= 0 && var47 - (this.field3915 << 12) < 0) {
                        int var76;
                        if ((var76 = var73 - (this.field3909 << 12)) >= 0) {
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
                            int var79 = this.field3910[(var73 >> 12) + (var74 >> 12) * this.field3909];
                            if (var79 == 0) {
                                var72++;
                            } else {
                                Statics.field3889[var72++] = var79;
                            }
                            var73 += var43;
                            var75++;
                        }
                    }
                    var71++;
                    var47 += var43;
                    var39 += Statics.field3884;
                }
            } else if (var42 < 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = (var42 * var44 >> 4) + var47;
                    int var84 = var37;
                    int var85;
                    if ((var85 = var82 - (this.field3909 << 12)) >= 0) {
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
                    if ((var88 = var83 - (this.field3915 << 12)) >= 0) {
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
                        int var91 = this.field3910[(var82 >> 12) + (var83 >> 12) * this.field3909];
                        if (var91 == 0) {
                            var81++;
                        } else {
                            Statics.field3889[var81++] = var91;
                        }
                        var82 += var43;
                        var83 += var42;
                        var84++;
                    }
                    var80++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field3884;
                }
            } else {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field3909 << 12)) >= 0) {
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
                    if ((var101 = (var95 + 1 - (this.field3915 << 12) - var42) / var42) > var96) {
                        var96 = var101;
                    }
                    while (var96 < 0) {
                        int var102 = this.field3910[(var94 >> 12) + (var95 >> 12) * this.field3909];
                        if (var102 == 0) {
                            var93++;
                        } else {
                            Statics.field3889[var93++] = var102;
                        }
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field3884;
                }
            }
        } else if (var42 == 0) {
            int var103 = var38;
            while (var103 < 0) {
                int var104 = var39;
                int var105 = (var43 * var44 >> 4) + var46;
                int var106 = var47;
                int var107 = var37;
                if (var47 >= 0 && var47 - (this.field3915 << 12) < 0) {
                    if (var105 < 0) {
                        int var108 = (var43 - 1 - var105) / var43;
                        var107 = var37 + var108;
                        var105 += var43 * var108;
                        var104 = var39 + var108;
                    }
                    int var109;
                    if ((var109 = (var105 + 1 - (this.field3909 << 12) - var43) / var43) > var107) {
                        var107 = var109;
                    }
                    while (var107 < 0) {
                        int var110 = this.field3910[(var105 >> 12) + (var106 >> 12) * this.field3909];
                        if (var110 == 0) {
                            var104++;
                        } else {
                            Statics.field3889[var104++] = var110;
                        }
                        var105 += var43;
                        var107++;
                    }
                }
                var103++;
                var47 += var43;
                var39 += Statics.field3884;
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
                if ((var117 = (var113 + 1 - (this.field3909 << 12) - var43) / var43) > var115) {
                    var115 = var117;
                }
                int var118;
                if ((var118 = var114 - (this.field3915 << 12)) >= 0) {
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
                    int var121 = this.field3910[(var113 >> 12) + (var114 >> 12) * this.field3909];
                    if (var121 == 0) {
                        var112++;
                    } else {
                        Statics.field3889[var112++] = var121;
                    }
                    var113 += var43;
                    var114 += var42;
                    var115++;
                }
                var111++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field3884;
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
                if ((var128 = (var124 + 1 - (this.field3909 << 12) - var43) / var43) > var126) {
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
                if ((var130 = (var125 + 1 - (this.field3915 << 12) - var42) / var42) > var126) {
                    var126 = var130;
                }
                while (var126 < 0) {
                    int var131 = this.field3910[(var124 >> 12) + (var125 >> 12) * this.field3909];
                    if (var131 == 0) {
                        var123++;
                    } else {
                        Statics.field3889[var123++] = var131;
                    }
                    var124 += var43;
                    var125 += var42;
                    var126++;
                }
                var122++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field3884;
            }
        }
    }

    @ObfuscatedName("lc.ak(IIII)V")
    public void method5779(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field3908 || arg3 > this.field3918) {
            throw new IllegalArgumentException();
        }
        int var5 = this.field3911 * arg2 / this.field3908 + arg0;
        int var6 = ((this.field3911 + this.field3909) * arg2 + this.field3908 - 1) / this.field3908 + arg0;
        int var7 = this.field3912 * arg3 / this.field3918 + arg1;
        int var8 = ((this.field3915 + this.field3912) * arg3 + this.field3918 - 1) / this.field3918 + arg1;
        if (var5 < field3885) {
            var5 = field3885;
        }
        if (var6 > field3890) {
            var6 = field3890;
        }
        if (var7 < field3887) {
            var7 = field3887;
        }
        if (var8 > field3888) {
            var8 = field3888;
        }
        if (var5 >= var6 || var7 >= var8) {
            return;
        }
        int var9 = Statics.field3884 * var7 + var5;
        int var10 = Statics.field3884 - (var6 - var5);
        if (var9 >= Statics.field3889.length) {
            return;
        }
        for (int var11 = var7; var11 < var8; var11++) {
            for (int var12 = var5; var12 < var6; var12++) {
                int var13 = var12 - arg0 << 4;
                int var14 = var11 - arg1 << 4;
                int var15 = this.field3908 * var13 / arg2 - (this.field3911 << 4);
                int var16 = (var13 + 16) * this.field3908 / arg2 - (this.field3911 << 4);
                int var17 = this.field3918 * var14 / arg3 - (this.field3912 << 4);
                int var18 = (var14 + 16) * this.field3918 / arg3 - (this.field3912 << 4);
                int var19 = (var16 - var15) * (var18 - var17) >> 1;
                if (var19 != 0) {
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    if (var16 >= this.field3909 << 4) {
                        var16 = this.field3909 << 4;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    if (var18 >= this.field3915 << 4) {
                        var18 = this.field3915 << 4;
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
                            int var35 = this.field3910[this.field3909 * var32 + var34];
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
                        Statics.field3889[var9] = var38;
                    }
                    var9++;
                }
            }
            var9 += var10;
        }
    }
}
