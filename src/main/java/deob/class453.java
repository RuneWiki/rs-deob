package deob;

@ObfuscatedName("qr")
public final class class453 extends class449 {

    @ObfuscatedName("qr.o")
    public int[] field4767;

    @ObfuscatedName("qr.q")
    public int field4768;

    @ObfuscatedName("qr.l")
    public int field4770;

    @ObfuscatedName("qr.k")
    public int field4773;

    @ObfuscatedName("qr.a")
    public int field4771;

    @ObfuscatedName("qr.m")
    public int field4772;

    @ObfuscatedName("qr.p")
    public int field4776;

    public class453() {
    }

    public class453(int arg0, int arg1) {
        this(new int[arg0 * arg1], arg0, arg1);
    }

    public class453(int[] arg0, int arg1, int arg2) {
        this.field4767 = arg0;
        this.field4768 = this.field4772 = arg1;
        this.field4770 = this.field4776 = arg2;
        this.field4771 = 0;
        this.field4773 = 0;
    }

    @ObfuscatedName("qr.o()Lqr;")
    public class453 method7310() {
        class453 var1 = new class453(this.field4768, this.field4770);
        var1.field4772 = this.field4772;
        var1.field4776 = this.field4776;
        var1.field4773 = this.field4772 - this.field4768 - this.field4773;
        var1.field4771 = this.field4771;
        for (int var2 = 0; var2 < this.field4770; var2++) {
            for (int var3 = 0; var3 < this.field4768; var3++) {
                var1.field4767[this.field4768 * var2 + var3] = this.field4767[this.field4768 * var2 + this.field4768 - 1 - var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("qr.q()Lqr;")
    public class453 method7363() {
        class453 var1 = new class453(this.field4768, this.field4770);
        var1.field4772 = this.field4772;
        var1.field4776 = this.field4776;
        var1.field4773 = this.field4773;
        var1.field4771 = this.field4771;
        int var2 = this.field4767.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1.field4767[var3] = this.field4767[var3];
        }
        return var1;
    }

    @ObfuscatedName("qr.l()Lqr;")
    public class453 method7324() {
        class453 var1 = new class453(this.field4772, this.field4776);
        for (int var2 = 0; var2 < this.field4770; var2++) {
            for (int var3 = 0; var3 < this.field4768; var3++) {
                var1.field4767[(this.field4771 + var2) * this.field4772 + this.field4773 + var3] = this.field4767[this.field4768 * var2 + var3];
            }
        }
        return var1;
    }

    @ObfuscatedName("qr.k()V")
    public void method7320() {
        method7227(this.field4767, this.field4768, this.field4770);
    }

    @ObfuscatedName("qr.a()V")
    public void method7400() {
        if (this.field4772 == this.field4768 && this.field4776 == this.field4770) {
            return;
        }
        int[] var1 = new int[this.field4776 * this.field4772];
        for (int var2 = 0; var2 < this.field4770; var2++) {
            for (int var3 = 0; var3 < this.field4768; var3++) {
                var1[(this.field4771 + var2) * this.field4772 + this.field4773 + var3] = this.field4767[this.field4768 * var2 + var3];
            }
        }
        this.field4767 = var1;
        this.field4768 = this.field4772;
        this.field4770 = this.field4776;
        this.field4773 = 0;
        this.field4771 = 0;
    }

    @ObfuscatedName("qr.m(I)V")
    public void method7315(int arg0) {
        if (this.field4772 == this.field4768 && this.field4776 == this.field4770) {
            return;
        }
        int var2 = arg0;
        if (arg0 > this.field4773) {
            var2 = this.field4773;
        }
        int var3 = arg0;
        if (this.field4773 + arg0 + this.field4768 > this.field4772) {
            var3 = this.field4772 - this.field4773 - this.field4768;
        }
        int var4 = arg0;
        if (arg0 > this.field4771) {
            var4 = this.field4771;
        }
        int var5 = arg0;
        if (this.field4771 + arg0 + this.field4770 > this.field4776) {
            var5 = this.field4776 - this.field4771 - this.field4770;
        }
        int var6 = this.field4768 + var2 + var3;
        int var7 = this.field4770 + var4 + var5;
        int[] var8 = new int[var6 * var7];
        for (int var9 = 0; var9 < this.field4770; var9++) {
            for (int var10 = 0; var10 < this.field4768; var10++) {
                var8[(var4 + var9) * var6 + var2 + var10] = this.field4767[this.field4768 * var9 + var10];
            }
        }
        this.field4767 = var8;
        this.field4768 = var6;
        this.field4770 = var7;
        this.field4773 -= var2;
        this.field4771 -= var4;
    }

    @ObfuscatedName("qr.p()V")
    public void method7316() {
        int[] var1 = new int[this.field4770 * this.field4768];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4770; var3++) {
            for (int var4 = this.field4768 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field4767[this.field4768 * var3 + var4];
            }
        }
        this.field4767 = var1;
        this.field4773 = this.field4772 - this.field4768 - this.field4773;
    }

    @ObfuscatedName("qr.s()V")
    public void method7353() {
        int[] var1 = new int[this.field4770 * this.field4768];
        int var2 = 0;
        for (int var3 = this.field4770 - 1; var3 >= 0; var3--) {
            for (int var4 = 0; var4 < this.field4768; var4++) {
                var1[var2++] = this.field4767[this.field4768 * var3 + var4];
            }
        }
        this.field4767 = var1;
        this.field4771 = this.field4776 - this.field4770 - this.field4771;
    }

    @ObfuscatedName("qr.r(I)V")
    public void method7318(int arg0) {
        int[] var2 = new int[this.field4770 * this.field4768];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4770; var4++) {
            for (int var5 = 0; var5 < this.field4768; var5++) {
                int var6 = this.field4767[var3];
                if (var6 == 0) {
                    if (var5 > 0 && this.field4767[var3 - 1] != 0) {
                        var6 = arg0;
                    } else if (var4 > 0 && this.field4767[var3 - this.field4768] != 0) {
                        var6 = arg0;
                    } else if (var5 < this.field4768 - 1 && this.field4767[var3 + 1] != 0) {
                        var6 = arg0;
                    } else if (var4 < this.field4770 - 1 && this.field4767[this.field4768 + var3] != 0) {
                        var6 = arg0;
                    }
                }
                var2[var3++] = var6;
            }
        }
        this.field4767 = var2;
    }

    @ObfuscatedName("qr.v(I)V")
    public void method7323(int arg0) {
        for (int var2 = this.field4770 - 1; var2 > 0; var2--) {
            int var3 = this.field4768 * var2;
            for (int var4 = this.field4768 - 1; var4 > 0; var4--) {
                if (this.field4767[var3 + var4] == 0 && this.field4767[var3 + var4 - 1 - this.field4768] != 0) {
                    this.field4767[var3 + var4] = arg0;
                }
            }
        }
    }

    @ObfuscatedName("qr.y(II)V")
    public void method7394(int arg0, int arg1) {
        int var3 = this.field4773 + arg0;
        int var4 = this.field4771 + arg1;
        int var5 = Statics.field4745 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4770;
        int var8 = this.field4768;
        int var9 = Statics.field4745 - var8;
        int var10 = 0;
        if (var4 < field4749) {
            int var11 = field4749 - var4;
            var7 -= var11;
            var4 = field4749;
            var6 += var8 * var11;
            var5 += Statics.field4745 * var11;
        }
        if (var4 + var7 > field4747) {
            var7 -= var4 + var7 - field4747;
        }
        if (var3 < field4748) {
            int var12 = field4748 - var3;
            var8 -= var12;
            var3 = field4748;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field4750) {
            int var13 = var3 + var8 - field4750;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method7336(Statics.field4744, this.field4767, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("qr.c([I[IIIIIII)V")
    public static void method7336(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @ObfuscatedName("qr.w(II)V")
    public void method7322(int arg0, int arg1) {
        int var3 = this.field4773 + arg0;
        int var4 = this.field4771 + arg1;
        int var5 = Statics.field4745 * var4 + var3;
        int var6 = 0;
        int var7 = this.field4770;
        int var8 = this.field4768;
        int var9 = Statics.field4745 - var8;
        int var10 = 0;
        if (var4 < field4749) {
            int var11 = field4749 - var4;
            var7 -= var11;
            var4 = field4749;
            var6 += var8 * var11;
            var5 += Statics.field4745 * var11;
        }
        if (var4 + var7 > field4747) {
            var7 -= var4 + var7 - field4747;
        }
        if (var3 < field4748) {
            int var12 = field4748 - var3;
            var8 -= var12;
            var3 = field4748;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > field4750) {
            int var13 = var3 + var8 - field4750;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method7399(Statics.field4744, this.field4767, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @ObfuscatedName("qr.b([I[IIIIIIII)V")
    public static void method7399(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @ObfuscatedName("qr.t(IIII)V")
    public void method7413(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var5 = this.field4768;
        int var6 = this.field4770;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field4772;
        int var10 = this.field4776;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field4773 > 0) {
            int var13 = ((this.field4773 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field4773 << 16);
        }
        if (this.field4771 > 0) {
            int var14 = ((this.field4771 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field4771 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = Statics.field4745 * arg1 + arg0;
        int var16 = Statics.field4745 - arg2;
        if (arg1 + arg3 > field4747) {
            arg3 -= arg1 + arg3 - field4747;
        }
        if (arg1 < field4749) {
            int var17 = field4749 - arg1;
            arg3 -= var17;
            var15 += Statics.field4745 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > field4750) {
            int var18 = arg0 + arg2 - field4750;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < field4748) {
            int var19 = field4748 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method7339(Statics.field4744, this.field4767, 0, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @ObfuscatedName("qr.g([I[IIIIIIIIIII)V")
    public static void method7339(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @ObfuscatedName("qr.x(IIII)V")
    public void method7326(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 256) {
            this.method7322(arg0, arg1);
            return;
        }
        int var5 = this.field4773 + arg0;
        int var6 = this.field4771 + arg1;
        int var7 = Statics.field4745 * var6 + var5;
        int var8 = 0;
        int var9 = this.field4770;
        int var10 = this.field4768;
        int var11 = Statics.field4745 - var10;
        int var12 = 0;
        if (var6 < field4749) {
            int var13 = field4749 - var6;
            var9 -= var13;
            var6 = field4749;
            var8 += var10 * var13;
            var7 += Statics.field4745 * var13;
        }
        if (var6 + var9 > field4747) {
            var9 -= var6 + var9 - field4747;
        }
        if (var5 < field4748) {
            int var14 = field4748 - var5;
            var10 -= var14;
            var5 = field4748;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > field4750) {
            int var15 = var5 + var10 - field4750;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            method7343(Statics.field4744, this.field4767, 0, var8, var7, var10, var9, var11, var12, arg2, arg3);
        }
    }

    @ObfuscatedName("qr.n([I[IIIIIIIIII)V")
    public static void method7343(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
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

    @ObfuscatedName("qr.e(III)V")
    public void method7328(int arg0, int arg1, int arg2) {
        int var4 = this.field4773 + arg0;
        int var5 = this.field4771 + arg1;
        int var6 = Statics.field4745 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4770;
        int var9 = this.field4768;
        int var10 = Statics.field4745 - var9;
        int var11 = 0;
        if (var5 < field4749) {
            int var12 = field4749 - var5;
            var8 -= var12;
            var5 = field4749;
            var7 += var9 * var12;
            var6 += Statics.field4745 * var12;
        }
        if (var5 + var8 > field4747) {
            var8 -= var5 + var8 - field4747;
        }
        if (var4 < field4748) {
            int var13 = field4748 - var4;
            var9 -= var13;
            var4 = field4748;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field4750) {
            int var14 = var4 + var9 - field4750;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method7338(Statics.field4744, this.field4767, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("qr.h([I[IIIIIIIII)V")
    public static void method7338(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @ObfuscatedName("qr.f(IIIII)V")
    public void method7407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field4768;
        int var7 = this.field4770;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4772;
        int var11 = this.field4776;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4773 > 0) {
            int var14 = ((this.field4773 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4773 << 16);
        }
        if (this.field4771 > 0) {
            int var15 = ((this.field4771 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4771 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field4745 * arg1 + arg0;
        int var17 = Statics.field4745 - arg2;
        if (arg1 + arg3 > field4747) {
            arg3 -= arg1 + arg3 - field4747;
        }
        if (arg1 < field4749) {
            int var18 = field4749 - arg1;
            arg3 -= var18;
            var16 += Statics.field4745 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field4750) {
            int var19 = arg0 + arg2 - field4750;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field4748) {
            int var20 = field4748 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method7331(Statics.field4744, this.field4767, 0, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @ObfuscatedName("qr.d([I[IIIIIIIIIIII)V")
    public static void method7331(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @ObfuscatedName("qr.j(III)V")
    public void method7332(int arg0, int arg1, int arg2) {
        int var4 = this.field4773 + arg0;
        int var5 = this.field4771 + arg1;
        int var6 = Statics.field4745 * var5 + var4;
        int var7 = 0;
        int var8 = this.field4770;
        int var9 = this.field4768;
        int var10 = Statics.field4745 - var9;
        int var11 = 0;
        if (var5 < field4749) {
            int var12 = field4749 - var5;
            var8 -= var12;
            var5 = field4749;
            var7 += var9 * var12;
            var6 += Statics.field4745 * var12;
        }
        if (var5 + var8 > field4747) {
            var8 -= var5 + var8 - field4747;
        }
        if (var4 < field4748) {
            int var13 = field4748 - var4;
            var9 -= var13;
            var4 = field4748;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > field4750) {
            int var14 = var4 + var9 - field4750;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        if (arg2 == 256) {
            method7312(0, 0, 0, Statics.field4744, this.field4767, var7, 0, var6, 0, var9, var8, var10, var11);
        } else {
            method7334(0, 0, 0, Statics.field4744, this.field4767, var7, 0, var6, 0, var9, var8, var10, var11, arg2);
        }
    }

    @ObfuscatedName("qr.z(III[I[IIIIIIIII)V")
    public static void method7312(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    @ObfuscatedName("qr.i(III[I[IIIIIIIIII)V")
    public static void method7334(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
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

    @ObfuscatedName("qr.u(IIIII)V")
    public void method7392(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= 0 || arg3 <= 0) {
            return;
        }
        int var6 = this.field4768;
        int var7 = this.field4770;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field4772;
        int var11 = this.field4776;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field4773 > 0) {
            int var14 = ((this.field4773 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field4773 << 16);
        }
        if (this.field4771 > 0) {
            int var15 = ((this.field4771 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field4771 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) - var9 + var13 - 1) / var13;
        }
        int var16 = Statics.field4745 * arg1 + arg0;
        int var17 = Statics.field4745 - arg2;
        if (arg1 + arg3 > field4747) {
            arg3 -= arg1 + arg3 - field4747;
        }
        if (arg1 < field4749) {
            int var18 = field4749 - arg1;
            arg3 -= var18;
            var16 += Statics.field4745 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > field4750) {
            int var19 = arg0 + arg2 - field4750;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < field4748) {
            int var20 = field4748 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        if (arg4 == 256) {
            method7335(0, 0, 0, var8, this.field4767, Statics.field4744, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6);
        } else {
            method7314(0, 0, 0, var8, this.field4767, Statics.field4744, 0, 0, -arg3, var9, var16, var17, arg2, var12, var13, var6, arg4);
        }
    }

    @ObfuscatedName("qr.ag(IIII[I[IIIIIIIIIII)V")
    public static void method7335(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
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

    @ObfuscatedName("qr.ar(IIII[I[IIIIIIIIIIII)V")
    public static void method7314(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16) {
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

    @ObfuscatedName("qr.am(IIIIII[I[I)V")
    public void method7309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var9 = arg1 < 0 ? -arg1 : 0;
        int var10 = this.field4770 + arg1 <= arg5 ? this.field4770 : arg5 - arg1;
        int var11 = arg0 < 0 ? -arg0 : 0;
        int var10000;
        if (this.field4768 + arg0 <= arg4) {
            var10000 = this.field4768;
        } else {
            var10000 = arg4 - arg0;
        }
        int var13 = (arg1 + arg3 + var9) * Statics.field4745 + arg0 + arg2 + var11;
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
            if (this.field4768 + arg0 <= var16 + var17) {
                var20 = this.field4768;
            } else {
                var20 = var16 + var17 - arg0;
            }
            for (int var21 = var19; var21 < var20; var21++) {
                int var22 = this.field4767[this.field4768 * var15 + var21];
                if (var22 == 0) {
                    var18++;
                } else {
                    Statics.field4744[var18++] = var22;
                }
            }
            var13 += Statics.field4745;
        }
    }

    @ObfuscatedName("qr.ac(IIIIIIII[I[I)V")
    public void method7337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = Statics.field4745 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    Statics.field4744[var22++] = this.field4767[(var23 >> 16) + (var24 >> 16) * this.field4768];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += Statics.field4745;
            }
        } catch (Exception var27) {
        }
    }

    @ObfuscatedName("qr.ab(IIIIIIDI)V")
    public void method7354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = Statics.field4745 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field4767[(var21 >> 16) + (var22 >> 16) * this.field4768];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        Statics.field4744[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += Statics.field4745;
            }
        } catch (Exception var26) {
        }
    }

    @ObfuscatedName("qr.aj(IIII)V")
    public void method7313(int arg0, int arg1, int arg2, int arg3) {
        this.method7340(this.field4772 << 3, this.field4776 << 3, arg0 << 4, arg1 << 4, arg2, arg3);
    }

    @ObfuscatedName("qr.ae(IIIIII)V")
    public void method7340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 0) {
            return;
        }
        int var7 = arg0 - (this.field4773 << 4);
        int var8 = arg1 - (this.field4771 << 4);
        double var9 = (double) (arg4 & 0xFFFF) * 9.587379924285257E-5D;
        int var11 = (int) Math.floor(Math.sin(var9) * (double) arg5 + 0.5D);
        int var12 = (int) Math.floor(Math.cos(var9) * (double) arg5 + 0.5D);
        int var13 = -var7 * var12 + -var8 * var11;
        int var14 = -(-var7) * var11 + -var8 * var12;
        int var15 = ((this.field4768 << 4) - var7) * var12 + -var8 * var11;
        int var16 = -((this.field4768 << 4) - var7) * var11 + -var8 * var12;
        int var17 = ((this.field4770 << 4) - var8) * var11 + -var7 * var12;
        int var18 = ((this.field4770 << 4) - var8) * var12 + -(-var7) * var11;
        int var19 = ((this.field4770 << 4) - var8) * var11 + ((this.field4768 << 4) - var7) * var12;
        int var20 = ((this.field4770 << 4) - var8) * var12 + -((this.field4768 << 4) - var7) * var11;
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
        if (var33 < field4748) {
            var33 = field4748;
        }
        if (var34 > field4750) {
            var34 = field4750;
        }
        if (var35 < field4749) {
            var35 = field4749;
        }
        if (var36 > field4747) {
            var36 = field4747;
        }
        int var37 = var33 - var34;
        if (var37 >= 0) {
            return;
        }
        int var38 = var35 - var36;
        if (var38 >= 0) {
            return;
        }
        int var39 = Statics.field4745 * var35 + var33;
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
                    if (var46 >= 0 && var47 >= 0 && var46 - (this.field4768 << 12) < 0 && var47 - (this.field4770 << 12) < 0) {
                        while (var52 < 0) {
                            int var53 = this.field4767[(var50 >> 12) + (var51 >> 12) * this.field4768];
                            if (var53 == 0) {
                                var49++;
                            } else {
                                Statics.field4744[var49++] = var53;
                            }
                            var52++;
                        }
                    }
                    var48++;
                    var39 += Statics.field4745;
                }
            } else if (var42 < 0) {
                int var54 = var38;
                while (var54 < 0) {
                    int var55 = var39;
                    int var56 = var46;
                    int var57 = (var42 * var44 >> 4) + var47;
                    int var58 = var37;
                    if (var46 >= 0 && var46 - (this.field4768 << 12) < 0) {
                        int var59;
                        if ((var59 = var57 - (this.field4770 << 12)) >= 0) {
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
                            int var62 = this.field4767[(var56 >> 12) + (var57 >> 12) * this.field4768];
                            if (var62 == 0) {
                                var55++;
                            } else {
                                Statics.field4744[var55++] = var62;
                            }
                            var57 += var42;
                            var58++;
                        }
                    }
                    var54++;
                    var46 -= var42;
                    var39 += Statics.field4745;
                }
            } else {
                int var63 = var38;
                while (var63 < 0) {
                    int var64 = var39;
                    int var65 = var46;
                    int var66 = (var42 * var44 >> 4) + var47;
                    int var67 = var37;
                    if (var46 >= 0 && var46 - (this.field4768 << 12) < 0) {
                        if (var66 < 0) {
                            int var68 = (var42 - 1 - var66) / var42;
                            var67 = var37 + var68;
                            var66 += var42 * var68;
                            var64 = var39 + var68;
                        }
                        int var69;
                        if ((var69 = (var66 + 1 - (this.field4770 << 12) - var42) / var42) > var67) {
                            var67 = var69;
                        }
                        while (var67 < 0) {
                            int var70 = this.field4767[(var65 >> 12) + (var66 >> 12) * this.field4768];
                            if (var70 == 0) {
                                var64++;
                            } else {
                                Statics.field4744[var64++] = var70;
                            }
                            var66 += var42;
                            var67++;
                        }
                    }
                    var63++;
                    var46 -= var42;
                    var39 += Statics.field4745;
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
                    if (var47 >= 0 && var47 - (this.field4770 << 12) < 0) {
                        int var76;
                        if ((var76 = var73 - (this.field4768 << 12)) >= 0) {
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
                            int var79 = this.field4767[(var73 >> 12) + (var74 >> 12) * this.field4768];
                            if (var79 == 0) {
                                var72++;
                            } else {
                                Statics.field4744[var72++] = var79;
                            }
                            var73 += var43;
                            var75++;
                        }
                    }
                    var71++;
                    var47 += var43;
                    var39 += Statics.field4745;
                }
            } else if (var42 < 0) {
                int var80 = var38;
                while (var80 < 0) {
                    int var81 = var39;
                    int var82 = (var43 * var44 >> 4) + var46;
                    int var83 = (var42 * var44 >> 4) + var47;
                    int var84 = var37;
                    int var85;
                    if ((var85 = var82 - (this.field4768 << 12)) >= 0) {
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
                    if ((var88 = var83 - (this.field4770 << 12)) >= 0) {
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
                        int var91 = this.field4767[(var82 >> 12) + (var83 >> 12) * this.field4768];
                        if (var91 == 0) {
                            var81++;
                        } else {
                            Statics.field4744[var81++] = var91;
                        }
                        var82 += var43;
                        var83 += var42;
                        var84++;
                    }
                    var80++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field4745;
                }
            } else {
                int var92 = var38;
                while (var92 < 0) {
                    int var93 = var39;
                    int var94 = (var43 * var44 >> 4) + var46;
                    int var95 = (var42 * var44 >> 4) + var47;
                    int var96 = var37;
                    int var97;
                    if ((var97 = var94 - (this.field4768 << 12)) >= 0) {
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
                    if ((var101 = (var95 + 1 - (this.field4770 << 12) - var42) / var42) > var96) {
                        var96 = var101;
                    }
                    while (var96 < 0) {
                        int var102 = this.field4767[(var94 >> 12) + (var95 >> 12) * this.field4768];
                        if (var102 == 0) {
                            var93++;
                        } else {
                            Statics.field4744[var93++] = var102;
                        }
                        var94 += var43;
                        var95 += var42;
                        var96++;
                    }
                    var92++;
                    var46 -= var42;
                    var47 += var43;
                    var39 += Statics.field4745;
                }
            }
        } else if (var42 == 0) {
            int var103 = var38;
            while (var103 < 0) {
                int var104 = var39;
                int var105 = (var43 * var44 >> 4) + var46;
                int var106 = var47;
                int var107 = var37;
                if (var47 >= 0 && var47 - (this.field4770 << 12) < 0) {
                    if (var105 < 0) {
                        int var108 = (var43 - 1 - var105) / var43;
                        var107 = var37 + var108;
                        var105 += var43 * var108;
                        var104 = var39 + var108;
                    }
                    int var109;
                    if ((var109 = (var105 + 1 - (this.field4768 << 12) - var43) / var43) > var107) {
                        var107 = var109;
                    }
                    while (var107 < 0) {
                        int var110 = this.field4767[(var105 >> 12) + (var106 >> 12) * this.field4768];
                        if (var110 == 0) {
                            var104++;
                        } else {
                            Statics.field4744[var104++] = var110;
                        }
                        var105 += var43;
                        var107++;
                    }
                }
                var103++;
                var47 += var43;
                var39 += Statics.field4745;
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
                if ((var117 = (var113 + 1 - (this.field4768 << 12) - var43) / var43) > var115) {
                    var115 = var117;
                }
                int var118;
                if ((var118 = var114 - (this.field4770 << 12)) >= 0) {
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
                    int var121 = this.field4767[(var113 >> 12) + (var114 >> 12) * this.field4768];
                    if (var121 == 0) {
                        var112++;
                    } else {
                        Statics.field4744[var112++] = var121;
                    }
                    var113 += var43;
                    var114 += var42;
                    var115++;
                }
                var111++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field4745;
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
                if ((var128 = (var124 + 1 - (this.field4768 << 12) - var43) / var43) > var126) {
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
                if ((var130 = (var125 + 1 - (this.field4770 << 12) - var42) / var42) > var126) {
                    var126 = var130;
                }
                while (var126 < 0) {
                    int var131 = this.field4767[(var124 >> 12) + (var125 >> 12) * this.field4768];
                    if (var131 == 0) {
                        var123++;
                    } else {
                        Statics.field4744[var123++] = var131;
                    }
                    var124 += var43;
                    var125 += var42;
                    var126++;
                }
                var122++;
                var46 -= var42;
                var47 += var43;
                var39 += Statics.field4745;
            }
        }
    }

    @ObfuscatedName("qr.az(IIII)V")
    public void method7341(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > this.field4772 || arg3 > this.field4776) {
            throw new IllegalArgumentException();
        }
        int var5 = this.field4773 * arg2 / this.field4772 + arg0;
        int var6 = ((this.field4773 + this.field4768) * arg2 + this.field4772 - 1) / this.field4772 + arg0;
        int var7 = this.field4771 * arg3 / this.field4776 + arg1;
        int var8 = ((this.field4771 + this.field4770) * arg3 + this.field4776 - 1) / this.field4776 + arg1;
        if (var5 < field4748) {
            var5 = field4748;
        }
        if (var6 > field4750) {
            var6 = field4750;
        }
        if (var7 < field4749) {
            var7 = field4749;
        }
        if (var8 > field4747) {
            var8 = field4747;
        }
        if (var5 >= var6 || var7 >= var8) {
            return;
        }
        int var9 = Statics.field4745 * var7 + var5;
        int var10 = Statics.field4745 - (var6 - var5);
        if (var9 >= Statics.field4744.length) {
            return;
        }
        for (int var11 = var7; var11 < var8; var11++) {
            for (int var12 = var5; var12 < var6; var12++) {
                int var13 = var12 - arg0 << 4;
                int var14 = var11 - arg1 << 4;
                int var15 = this.field4772 * var13 / arg2 - (this.field4773 << 4);
                int var16 = (var13 + 16) * this.field4772 / arg2 - (this.field4773 << 4);
                int var17 = this.field4776 * var14 / arg3 - (this.field4771 << 4);
                int var18 = (var14 + 16) * this.field4776 / arg3 - (this.field4771 << 4);
                int var19 = (var16 - var15) * (var18 - var17) >> 1;
                if (var19 != 0) {
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    if (var16 >= this.field4768 << 4) {
                        var16 = this.field4768 << 4;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    if (var18 >= this.field4770 << 4) {
                        var18 = this.field4770 << 4;
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
                            int var35 = this.field4767[this.field4768 * var32 + var34];
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
                        Statics.field4744[var9] = var38;
                    }
                    var9++;
                }
            }
            var9 += var10;
        }
    }
}
