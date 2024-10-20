package deob;

@ObfuscatedName("fo")
public class class170 {

    @ObfuscatedName("fo.y")
    public int[] field2829;

    @ObfuscatedName("fo.k")
    public int[] field2836;

    @ObfuscatedName("fo.g")
    public boolean field2831;

    @ObfuscatedName("fo.n")
    public int field2832;

    @ObfuscatedName("fo.t")
    public long field2834;

    @ObfuscatedName("fo.e")
    public long field2838;

    @ObfuscatedName("fo.f")
    public static final int[] field2837 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fo.i")
    public static class184 field2830 = new class184(260);

    @ObfuscatedName("fo.y([I[IZII)V")
    public void method3105(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field979; var6++) {
                    class42 var7 = class42.method2586(var6);
                    if (var7 != null && !var7.field984 && var7.field977 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2837[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2829 = arg0;
        this.field2836 = arg1;
        this.field2831 = arg2;
        this.field2832 = arg3;
        this.method3089();
    }

    @ObfuscatedName("fo.k(IZI)V")
    public void method3110(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2831) {
            return;
        }
        int var3 = this.field2829[field2837[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field979) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field979 - 1;
                }
            }
            var4 = class42.method2586(var3);
        } while (var4 == null || var4.field984 || (this.field2831 ? 7 : 0) + arg0 != var4.field977);
        this.field2829[field2837[arg0]] = var3 + 256;
        this.method3089();
    }

    @ObfuscatedName("fo.g(IZI)V")
    public void method3086(int arg0, boolean arg1) {
        int var3 = this.field2836[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2835[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method158(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2835[arg0].length - 1;
                }
            } while (!class165.method158(arg0, var3));
        }
        this.field2836[arg0] = var3;
        this.method3089();
    }

    @ObfuscatedName("fo.n(ZI)V")
    public void method3087(boolean arg0) {
        if (this.field2831 != arg0) {
            this.method3105((int[]) null, this.field2836, arg0, -1);
        }
    }

    @ObfuscatedName("fo.t(Ldw;B)V")
    public void method3088(class111 arg0) {
        arg0.method2145(this.field2831 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2829[field2837[var2]];
            if (var3 == 0) {
                arg0.method2145(-1);
            } else {
                arg0.method2145(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2145(this.field2836[var4]);
        }
    }

    @ObfuscatedName("fo.e(I)V")
    public void method3089() {
        long var1 = this.field2834;
        int var3 = this.field2829[5];
        int var4 = this.field2829[9];
        this.field2829[5] = var4;
        this.field2829[9] = var3;
        this.field2834 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2834 <<= 0x4;
            if (this.field2829[var5] >= 256) {
                this.field2834 += (long) (this.field2829[var5] - 256);
            }
        }
        if (this.field2829[0] >= 256) {
            this.field2834 += (long) (this.field2829[0] - 256 >> 4);
        }
        if (this.field2829[1] >= 256) {
            this.field2834 += (long) (this.field2829[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2834 <<= 0x3;
            this.field2834 += (long) this.field2836[var6];
        }
        this.field2834 <<= 0x1;
        this.field2834 += (long) (this.field2831 ? 1 : 0);
        this.field2829[5] = var3;
        this.field2829[9] = var4;
        if (var1 != 0L && this.field2834 != var1) {
            field2830.method3335(var1);
        }
    }

    @ObfuscatedName("fo.q(Lay;ILay;IB)Lch;")
    public class100 method3096(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2832 != -1) {
            return class37.method2412(this.field2832).method676(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2834;
        int[] var7 = this.field2829;
        if (arg0 != null && (arg0.field935 >= 0 || arg0.field942 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2829[var8];
            }
            if (arg0.field935 >= 0) {
                var5 += (long) (arg0.field935 - this.field2829[5] << 40);
                var7[5] = arg0.field935;
            }
            if (arg0.field942 >= 0) {
                var5 += (long) (arg0.field942 - this.field2829[3] << 48);
                var7[3] = arg0.field942;
            }
        }
        class100 var9 = (class100) field2830.method3327(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method2586(var12 - 256).method828()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method859(var12 - 512).method905(this.field2831)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2838 != -1L) {
                    var9 = (class100) field2830.method3327(this.field2838);
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
                        class95 var17 = class42.method2586(var16 - 256).method818();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method859(var16 - 512).method943(this.field2831);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2836[var20] < Statics.field2835[var20].length) {
                        var19.method1922(Statics.field1038[var20], Statics.field2835[var20][this.field2836[var20]]);
                    }
                    if (this.field2836[var20] < Statics.field2833[var20].length) {
                        var19.method1922(Statics.field1303[var20], Statics.field2833[var20][this.field2836[var20]]);
                    }
                }
                var9 = var19.method1953(64, 850, -30, -50, -30);
                field2830.method3340(var9, var5);
                this.field2838 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method768(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method786(var9, arg3);
        } else {
            var21 = arg0.method786(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fo.z(B)Lcc;")
    public class95 method3091() {
        if (this.field2832 != -1) {
            return class37.method2412(this.field2832).method687();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2829[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method2586(var3 - 256).method819()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method859(var3 - 512).method907(this.field2831)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2829[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method2586(var7 - 256).method820();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method859(var7 - 512).method932(this.field2831);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2836[var11] < Statics.field2835[var11].length) {
                var10.method1922(Statics.field1038[var11], Statics.field2835[var11][this.field2836[var11]]);
            }
            if (this.field2836[var11] < Statics.field2833[var11].length) {
                var10.method1922(Statics.field1303[var11], Statics.field2833[var11][this.field2836[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fo.v(B)I")
    public int method3084() {
        return this.field2832 == -1 ? (this.field2829[11] << 5) + (this.field2829[8] << 10) + (this.field2829[0] << 15) + (this.field2836[4] << 20) + (this.field2836[0] << 25) + this.field2829[1] : 305419896 + class37.method2412(this.field2832).field843;
    }
}
