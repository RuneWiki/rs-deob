package deob;

@ObfuscatedName("hi")
public class class230 {

    @ObfuscatedName("hi.g")
    public int[] field2642;

    @ObfuscatedName("hi.r")
    public int[] field2644;

    @ObfuscatedName("hi.e")
    public boolean field2638;

    @ObfuscatedName("hi.q")
    public int field2640;

    @ObfuscatedName("hi.c")
    public long field2641;

    @ObfuscatedName("hi.l")
    public long field2646;

    @ObfuscatedName("hi.p")
    public static final int[] field2645 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hi.m")
    public static class203 field2637 = new class203(260);

    @ObfuscatedName("hi.g([I[IZII)V")
    public void method4295(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3369; var6++) {
                    class263 var7 = class263.method3352(var6);
                    if (var7 != null && !var7.field3378 && var7.field3367 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2645[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2642 = arg0;
        this.field2644 = arg1;
        this.field2638 = arg2;
        this.field2640 = arg3;
        this.method4300();
    }

    @ObfuscatedName("hi.r(IZB)V")
    public void method4296(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2638) {
            return;
        }
        int var3 = this.field2642[field2645[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3369) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3369 - 1;
                }
            }
            var4 = class263.method3352(var3);
        } while (var4 == null || var4.field3378 || var4.field3367 != (this.field2638 ? 7 : 0) + arg0);
        this.field2642[field2645[arg0]] = var3 + 256;
        this.method4300();
    }

    @ObfuscatedName("hi.e(IZI)V")
    public void method4297(int arg0, boolean arg1) {
        int var3 = this.field2644[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3307[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3307[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2644[arg0] = var3;
        this.method4300();
    }

    @ObfuscatedName("hi.q(ZI)V")
    public void method4298(boolean arg0) {
        if (this.field2638 != arg0) {
            this.method4295((int[]) null, this.field2644, arg0, -1);
        }
    }

    @ObfuscatedName("hi.c(Lgl;I)V")
    public void method4299(class185 arg0) {
        arg0.method3501(this.field2638 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2642[field2645[var2]];
            if (var3 == 0) {
                arg0.method3501(-1);
            } else {
                arg0.method3501(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3501(this.field2644[var4]);
        }
    }

    @ObfuscatedName("hi.i(I)V")
    public void method4300() {
        long var1 = this.field2641;
        int var3 = this.field2642[5];
        int var4 = this.field2642[9];
        this.field2642[5] = var4;
        this.field2642[9] = var3;
        this.field2641 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2641 <<= 0x4;
            if (this.field2642[var5] >= 256) {
                this.field2641 += (long) (this.field2642[var5] - 256);
            }
        }
        if (this.field2642[0] >= 256) {
            this.field2641 += (long) (this.field2642[0] - 256 >> 4);
        }
        if (this.field2642[1] >= 256) {
            this.field2641 += (long) (this.field2642[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2641 <<= 0x3;
            this.field2641 += (long) this.field2644[var6];
        }
        this.field2641 <<= 0x1;
        this.field2641 += (long) (this.field2638 ? 1 : 0);
        this.field2642[5] = var3;
        this.field2642[9] = var4;
        if (var1 != 0L && this.field2641 != var1) {
            field2637.method3878(var1);
        }
    }

    @ObfuscatedName("hi.p(Ljg;ILjg;IB)Ldl;")
    public class122 method4301(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2640 != -1) {
            return class274.method4430(this.field2640).method5000(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2641;
        int[] var7 = this.field2642;
        if (arg0 != null && (arg0.field3629 >= 0 || arg0.field3630 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2642[var8];
            }
            if (arg0.field3629 >= 0) {
                var5 += (long) (arg0.field3629 - this.field2642[5] << 40);
                var7[5] = arg0.field3629;
            }
            if (arg0.field3630 >= 0) {
                var5 += (long) (arg0.field3630 - this.field2642[3] << 48);
                var7[3] = arg0.field3630;
            }
        }
        class122 var9 = (class122) field2637.method3879(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class263.method3352(var12 - 256).method4722()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class272.method1995(var12 - 512).method4923(this.field2638)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2646 != -1L) {
                    var9 = (class122) field2637.method3879(this.field2646);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class116[] var13 = new class116[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class116 var17 = class263.method3352(var16 - 256).method4719();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = class272.method1995(var16 - 512).method4924(this.field2638);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2644[var20] < Statics.field3307[var20].length) {
                        var19.method2573(Statics.field386[var20], Statics.field3307[var20][this.field2644[var20]]);
                    }
                    if (this.field2644[var20] < Statics.field2639[var20].length) {
                        var19.method2573(Statics.field2643[var20], Statics.field2639[var20][this.field2644[var20]]);
                    }
                }
                var9 = var19.method2570(64, 850, -30, -50, -30);
                field2637.method3885(var9, var5);
                this.field2646 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method5045(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method5043(var9, arg3);
        } else {
            var21 = arg0.method5043(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hi.m(I)Ldu;")
    public class116 method4302() {
        if (this.field2640 != -1) {
            return class274.method4430(this.field2640).method5016();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2642[var2];
            if (var3 >= 256 && var3 < 512 && !class263.method3352(var3 - 256).method4723()) {
                var1 = true;
            }
            if (var3 >= 512 && !class272.method1995(var3 - 512).method4925(this.field2638)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2642[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = class263.method3352(var7 - 256).method4724();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = class272.method1995(var7 - 512).method4957(this.field2638);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2644[var11] < Statics.field3307[var11].length) {
                var10.method2573(Statics.field386[var11], Statics.field3307[var11][this.field2644[var11]]);
            }
            if (this.field2644[var11] < Statics.field2639[var11].length) {
                var10.method2573(Statics.field2643[var11], Statics.field2639[var11][this.field2644[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hi.d(I)I")
    public int method4303() {
        return this.field2640 == -1 ? (this.field2642[11] << 5) + (this.field2642[8] << 10) + (this.field2642[0] << 15) + (this.field2644[4] << 20) + (this.field2644[0] << 25) + this.field2642[1] : 305419896 + class274.method4430(this.field2640).field3569;
    }

    @ObfuscatedName("bp.j(B)V")
    public static void method1033() {
        field2637.method3880();
    }
}
