package deob;

@ObfuscatedName("fl")
public class class158 {

    @ObfuscatedName("fl.g")
    public int[] field2696;

    @ObfuscatedName("fl.s")
    public int[] field2690;

    @ObfuscatedName("fl.v")
    public boolean field2692;

    @ObfuscatedName("fl.o")
    public int field2689;

    @ObfuscatedName("fl.k")
    public long field2693;

    @ObfuscatedName("fl.m")
    public long field2694;

    @ObfuscatedName("fl.r")
    public static final int[] field2697 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.j")
    public static class172 field2698 = new class172(260);

    @ObfuscatedName("fl.g([I[IZII)V")
    public void method2892(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2824; var6++) {
                    class40 var7 = class40.method75(var6);
                    if (var7 != null && !var7.field951 && var5 + (arg2 ? 7 : 0) == var7.field944) {
                        arg0[field2697[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2696 = arg0;
        this.field2690 = arg1;
        this.field2692 = arg2;
        this.field2689 = arg3;
        this.method2875();
    }

    @ObfuscatedName("fl.s(IZI)V")
    public void method2869(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2692) {
            return;
        }
        int var3 = this.field2696[field2697[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2824) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2824 - 1;
                }
            }
            var4 = class40.method75(var3);
        } while (var4 == null || var4.field951 || var4.field944 != (this.field2692 ? 7 : 0) + arg0);
        this.field2696[field2697[arg0]] = var3 + 256;
        this.method2875();
    }

    @ObfuscatedName("fl.v(IZB)V")
    public void method2873(int arg0, boolean arg1) {
        int var3 = this.field2690[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2695[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2695[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2690[arg0] = var3;
        this.method2875();
    }

    @ObfuscatedName("fl.o(ZI)V")
    public void method2871(boolean arg0) {
        if (this.field2692 != arg0) {
            this.method2892((int[]) null, this.field2690, arg0, -1);
        }
    }

    @ObfuscatedName("fl.k(Lde;I)V")
    public void method2874(class107 arg0) {
        arg0.method2079(this.field2692 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2696[field2697[var2]];
            if (var3 == 0) {
                arg0.method2079(-1);
            } else {
                arg0.method2079(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2079(this.field2690[var4]);
        }
    }

    @ObfuscatedName("fl.m(B)V")
    public void method2875() {
        long var1 = this.field2693;
        int var3 = this.field2696[5];
        int var4 = this.field2696[9];
        this.field2696[5] = var4;
        this.field2696[9] = var3;
        this.field2693 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2693 <<= 0x4;
            if (this.field2696[var5] >= 256) {
                this.field2693 += (long) (this.field2696[var5] - 256);
            }
        }
        if (this.field2696[0] >= 256) {
            this.field2693 += (long) (this.field2696[0] - 256 >> 4);
        }
        if (this.field2696[1] >= 256) {
            this.field2693 += (long) (this.field2696[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2693 <<= 0x3;
            this.field2693 += (long) this.field2690[var6];
        }
        this.field2693 <<= 0x1;
        this.field2693 += (long) (this.field2692 ? 1 : 0);
        this.field2696[5] = var3;
        this.field2696[9] = var4;
        if (var1 != 0L && this.field2693 != var1) {
            field2698.method3125(var1);
        }
    }

    @ObfuscatedName("fl.i(Laq;ILaq;II)Lcg;")
    public class98 method2876(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2689 != -1) {
            return Statics.method76(this.field2689).method617(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2693;
        int[] var7 = this.field2696;
        if (arg0 != null && (arg0.field906 >= 0 || arg0.field907 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2696[var8];
            }
            if (arg0.field906 >= 0) {
                var5 += (long) (arg0.field906 - this.field2696[5] << 40);
                var7[5] = arg0.field906;
            }
            if (arg0.field907 >= 0) {
                var5 += (long) (arg0.field907 - this.field2696[3] << 48);
                var7[3] = arg0.field907;
            }
        }
        class98 var9 = (class98) field2698.method3112(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method75(var12 - 256).method758()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method2351(var12 - 512).method847(this.field2692)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2694 != -1L) {
                    var9 = (class98) field2698.method3112(this.field2694);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method75(var16 - 256).method759();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method2351(var16 - 512).method864(this.field2692);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2690[var20] < Statics.field2695[var20].length) {
                        var19.method1859(Statics.field2691[var20], Statics.field2695[var20][this.field2690[var20]]);
                    }
                    if (this.field2690[var20] < Statics.field1301[var20].length) {
                        var19.method1859(Statics.field976[var20], Statics.field1301[var20][this.field2690[var20]]);
                    }
                }
                var9 = var19.method1867(64, 850, -30, -50, -30);
                field2698.method3115(var9, var5);
                this.field2694 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method706(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method730(var9, arg3);
        } else {
            var21 = arg0.method730(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.t(I)Lcn;")
    public class93 method2877() {
        if (this.field2689 != -1) {
            return Statics.method76(this.field2689).method619();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2696[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method75(var3 - 256).method760()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method2351(var3 - 512).method845(this.field2692)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2696[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method75(var7 - 256).method773();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method2351(var7 - 512).method846(this.field2692);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2690[var11] < Statics.field2695[var11].length) {
                var10.method1859(Statics.field2691[var11], Statics.field2695[var11][this.field2690[var11]]);
            }
            if (this.field2690[var11] < Statics.field1301[var11].length) {
                var10.method1859(Statics.field976[var11], Statics.field1301[var11][this.field2690[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.l(I)I")
    public int method2878() {
        return this.field2689 == -1 ? (this.field2696[11] << 5) + (this.field2696[8] << 10) + (this.field2696[0] << 15) + (this.field2690[0] << 25) + (this.field2690[4] << 20) + this.field2696[1] : 305419896 + Statics.method76(this.field2689).field791;
    }
}
