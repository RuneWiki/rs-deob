package deob;

@ObfuscatedName("ft")
public class class170 {

    @ObfuscatedName("ft.n")
    public int[] field2825;

    @ObfuscatedName("ft.w")
    public int[] field2819;

    @ObfuscatedName("ft.i")
    public boolean field2821;

    @ObfuscatedName("ft.e")
    public int field2827;

    @ObfuscatedName("ft.h")
    public long field2822;

    @ObfuscatedName("ft.q")
    public long field2820;

    @ObfuscatedName("ft.m")
    public static final int[] field2823 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ft.y")
    public static class184 field2826 = new class184(260);

    @ObfuscatedName("ft.n([I[IZII)V")
    public void method3060(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field971; var6++) {
                    class42 var7 = class42.method639(var6);
                    if (var7 != null && !var7.field980 && (arg2 ? 7 : 0) + var5 == var7.field973) {
                        arg0[field2823[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2825 = arg0;
        this.field2819 = arg1;
        this.field2821 = arg2;
        this.field2827 = arg3;
        this.method3073();
    }

    @ObfuscatedName("ft.w(IZI)V")
    public void method3057(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2821) {
            return;
        }
        int var3 = this.field2825[field2823[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field971) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field971 - 1;
                }
            }
            var4 = class42.method639(var3);
        } while (var4 == null || var4.field980 || arg0 + (this.field2821 ? 7 : 0) != var4.field973);
        this.field2825[field2823[arg0]] = var3 + 256;
        this.method3073();
    }

    @ObfuscatedName("ft.i(IZI)V")
    public void method3054(int arg0, boolean arg1) {
        int var3 = this.field2819[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2824[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method2104(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2824[arg0].length - 1;
                }
            } while (!class165.method2104(arg0, var3));
        }
        this.field2819[arg0] = var3;
        this.method3073();
    }

    @ObfuscatedName("ft.e(ZI)V")
    public void method3055(boolean arg0) {
        if (this.field2821 != arg0) {
            this.method3060((int[]) null, this.field2819, arg0, -1);
        }
    }

    @ObfuscatedName("ft.h(Ldo;B)V")
    public void method3056(class111 arg0) {
        arg0.method2140(this.field2821 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2825[field2823[var2]];
            if (var3 == 0) {
                arg0.method2140(-1);
            } else {
                arg0.method2140(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2140(this.field2819[var4]);
        }
    }

    @ObfuscatedName("ft.q(I)V")
    public void method3073() {
        long var1 = this.field2822;
        int var3 = this.field2825[5];
        int var4 = this.field2825[9];
        this.field2825[5] = var4;
        this.field2825[9] = var3;
        this.field2822 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2822 <<= 0x4;
            if (this.field2825[var5] >= 256) {
                this.field2822 += (long) (this.field2825[var5] - 256);
            }
        }
        if (this.field2825[0] >= 256) {
            this.field2822 += (long) (this.field2825[0] - 256 >> 4);
        }
        if (this.field2825[1] >= 256) {
            this.field2822 += (long) (this.field2825[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2822 <<= 0x3;
            this.field2822 += (long) this.field2819[var6];
        }
        this.field2822 <<= 0x1;
        this.field2822 += (long) (this.field2821 ? 1 : 0);
        this.field2825[5] = var3;
        this.field2825[9] = var4;
        if (var1 != 0L && this.field2822 != var1) {
            field2826.method3316(var1);
        }
    }

    @ObfuscatedName("ft.l(Lac;ILac;II)Lcw;")
    public class100 method3080(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2827 != -1) {
            return class37.method2077(this.field2827).method664(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2822;
        int[] var7 = this.field2825;
        if (arg0 != null && (arg0.field934 >= 0 || arg0.field948 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2825[var8];
            }
            if (arg0.field934 >= 0) {
                var5 += (long) (arg0.field934 - this.field2825[5] << 40);
                var7[5] = arg0.field934;
            }
            if (arg0.field948 >= 0) {
                var5 += (long) (arg0.field948 - this.field2825[3] << 48);
                var7[3] = arg0.field948;
            }
        }
        class100 var9 = (class100) field2826.method3315(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method639(var12 - 256).method796()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method496(var12 - 512).method915(this.field2821)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2820 != -1L) {
                    var9 = (class100) field2826.method3315(this.field2820);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class95[] var13 = new class95[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class95 var17 = class42.method639(var16 - 256).method800();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method496(var16 - 512).method903(this.field2821);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2819[var20] < Statics.field2824[var20].length) {
                        var19.method1919(Statics.field2555[var20], Statics.field2824[var20][this.field2819[var20]]);
                    }
                    if (this.field2819[var20] < Statics.field236[var20].length) {
                        var19.method1919(Statics.field595[var20], Statics.field236[var20][this.field2819[var20]]);
                    }
                }
                var9 = var19.method1982(64, 850, -30, -50, -30);
                field2826.method3317(var9, var5);
                this.field2820 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method743(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method741(var9, arg3);
        } else {
            var21 = arg0.method741(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ft.c(I)Lce;")
    public class95 method3069() {
        if (this.field2827 != -1) {
            return class37.method2077(this.field2827).method647();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2825[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method639(var3 - 256).method810()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method496(var3 - 512).method904(this.field2821)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2825[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method639(var7 - 256).method802();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method496(var7 - 512).method905(this.field2821);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2819[var11] < Statics.field2824[var11].length) {
                var10.method1919(Statics.field2555[var11], Statics.field2824[var11][this.field2819[var11]]);
            }
            if (this.field2819[var11] < Statics.field236[var11].length) {
                var10.method1919(Statics.field595[var11], Statics.field236[var11][this.field2819[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ft.f(I)I")
    public int method3053() {
        return this.field2827 == -1 ? (this.field2825[11] << 5) + (this.field2825[8] << 10) + (this.field2825[0] << 15) + (this.field2819[4] << 20) + (this.field2819[0] << 25) + this.field2825[1] : 305419896 + class37.method2077(this.field2827).field828;
    }

    @ObfuscatedName("ea.s(B)V")
    public static void method2786() {
        field2826.method3319();
    }
}
