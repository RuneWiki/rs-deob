package deob;

@ObfuscatedName("fz")
public class class170 {

    @ObfuscatedName("fz.n")
    public int[] field2821;

    @ObfuscatedName("fz.o")
    public int[] field2828;

    @ObfuscatedName("fz.a")
    public boolean field2822;

    @ObfuscatedName("fz.w")
    public int field2825;

    @ObfuscatedName("fz.m")
    public long field2824;

    @ObfuscatedName("fz.h")
    public long field2823;

    @ObfuscatedName("fz.e")
    public static final int[] field2827 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fz.z")
    public static class184 field2820 = new class184(260);

    @ObfuscatedName("fz.n([I[IZIB)V")
    public void method3128(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1004; var6++) {
                    class42 var7 = class42.method1404(var6);
                    if (var7 != null && !var7.field1006 && var7.field995 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2827[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2821 = arg0;
        this.field2828 = arg1;
        this.field2822 = arg2;
        this.field2825 = arg3;
        this.method3133();
    }

    @ObfuscatedName("fz.o(IZI)V")
    public void method3129(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2822) {
            return;
        }
        int var3 = this.field2821[field2827[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1004) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1004 - 1;
                }
            }
            var4 = class42.method1404(var3);
        } while (var4 == null || var4.field1006 || var4.field995 != (this.field2822 ? 7 : 0) + arg0);
        this.field2821[field2827[arg0]] = var3 + 256;
        this.method3133();
    }

    @ObfuscatedName("fz.a(IZB)V")
    public void method3130(int arg0, boolean arg1) {
        int var3 = this.field2828[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2826[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method2839(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2826[arg0].length - 1;
                }
            } while (!class165.method2839(arg0, var3));
        }
        this.field2828[arg0] = var3;
        this.method3133();
    }

    @ObfuscatedName("fz.w(ZI)V")
    public void method3131(boolean arg0) {
        if (this.field2822 != arg0) {
            this.method3128((int[]) null, this.field2828, arg0, -1);
        }
    }

    @ObfuscatedName("fz.m(Ldl;I)V")
    public void method3132(class111 arg0) {
        arg0.method2219(this.field2822 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2821[field2827[var2]];
            if (var3 == 0) {
                arg0.method2219(-1);
            } else {
                arg0.method2219(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2219(this.field2828[var4]);
        }
    }

    @ObfuscatedName("fz.h(I)V")
    public void method3133() {
        long var1 = this.field2824;
        int var3 = this.field2821[5];
        int var4 = this.field2821[9];
        this.field2821[5] = var4;
        this.field2821[9] = var3;
        this.field2824 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2824 <<= 0x4;
            if (this.field2821[var5] >= 256) {
                this.field2824 += (long) (this.field2821[var5] - 256);
            }
        }
        if (this.field2821[0] >= 256) {
            this.field2824 += (long) (this.field2821[0] - 256 >> 4);
        }
        if (this.field2821[1] >= 256) {
            this.field2824 += (long) (this.field2821[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2824 <<= 0x3;
            this.field2824 += (long) this.field2828[var6];
        }
        this.field2824 <<= 0x1;
        this.field2824 += (long) (this.field2822 ? 1 : 0);
        this.field2821[5] = var3;
        this.field2821[9] = var4;
        if (var1 != 0L && this.field2824 != var1) {
            field2820.method3379(var1);
        }
    }

    @ObfuscatedName("fz.i(Lae;ILae;II)Lcp;")
    public class100 method3138(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2825 != -1) {
            return class37.method141(this.field2825).method667(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2824;
        int[] var7 = this.field2821;
        if (arg0 != null && (arg0.field965 >= 0 || arg0.field966 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2821[var8];
            }
            if (arg0.field965 >= 0) {
                var5 += (long) (arg0.field965 - this.field2821[5] << 40);
                var7[5] = arg0.field965;
            }
            if (arg0.field966 >= 0) {
                var5 += (long) (arg0.field966 - this.field2821[3] << 48);
                var7[3] = arg0.field966;
            }
        }
        class100 var9 = (class100) field2820.method3373(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method1404(var12 - 256).method836()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method127(var12 - 512).method941(this.field2822)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2823 != -1L) {
                    var9 = (class100) field2820.method3373(this.field2823);
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
                        class95 var17 = class42.method1404(var16 - 256).method819();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method127(var16 - 512).method918(this.field2822);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2828[var20] < Statics.field2826[var20].length) {
                        var19.method1985(Statics.field2499[var20], Statics.field2826[var20][this.field2828[var20]]);
                    }
                    if (this.field2828[var20] < Statics.field2537[var20].length) {
                        var19.method1985(Statics.field1963[var20], Statics.field2537[var20][this.field2828[var20]]);
                    }
                }
                var9 = var19.method2033(64, 850, -30, -50, -30);
                field2820.method3372(var9, var5);
                this.field2823 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method771(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method777(var9, arg3);
        } else {
            var21 = arg0.method777(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fz.r(B)Lcz;")
    public class95 method3135() {
        if (this.field2825 != -1) {
            return class37.method141(this.field2825).method684();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2821[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method1404(var3 - 256).method820()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method127(var3 - 512).method917(this.field2822)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2821[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method1404(var7 - 256).method821();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method127(var7 - 512).method920(this.field2822);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2828[var11] < Statics.field2826[var11].length) {
                var10.method1985(Statics.field2499[var11], Statics.field2826[var11][this.field2828[var11]]);
            }
            if (this.field2828[var11] < Statics.field2537[var11].length) {
                var10.method1985(Statics.field1963[var11], Statics.field2537[var11][this.field2828[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fz.l(I)I")
    public int method3127() {
        return this.field2825 == -1 ? (this.field2821[11] << 5) + (this.field2821[8] << 10) + (this.field2821[0] << 15) + (this.field2828[0] << 25) + (this.field2828[4] << 20) + this.field2821[1] : 305419896 + class37.method141(this.field2825).field858;
    }
}
