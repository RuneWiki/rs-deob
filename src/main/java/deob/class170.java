package deob;

@ObfuscatedName("fl")
public class class170 {

    @ObfuscatedName("fl.n")
    public int[] field2808;

    @ObfuscatedName("fl.g")
    public int[] field2806;

    @ObfuscatedName("fl.a")
    public boolean field2814;

    @ObfuscatedName("fl.m")
    public int field2807;

    @ObfuscatedName("fl.s")
    public long field2804;

    @ObfuscatedName("fl.j")
    public long field2809;

    @ObfuscatedName("fl.c")
    public static final int[] field2812 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.k")
    public static class184 field2813 = new class184(260);

    @ObfuscatedName("fl.n([I[IZII)V")
    public void method3149(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1005; var6++) {
                    class42 var7 = class42.method2514(var6);
                    if (var7 != null && !var7.field1016 && var7.field1013 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2812[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2808 = arg0;
        this.field2806 = arg1;
        this.field2814 = arg2;
        this.field2807 = arg3;
        this.method3137();
    }

    @ObfuscatedName("fl.g(IZS)V")
    public void method3123(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2814) {
            return;
        }
        int var3 = this.field2808[field2812[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1005) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1005 - 1;
                }
            }
            var4 = class42.method2514(var3);
        } while (var4 == null || var4.field1016 || (this.field2814 ? 7 : 0) + arg0 != var4.field1013);
        this.field2808[field2812[arg0]] = var3 + 256;
        this.method3137();
    }

    @ObfuscatedName("fl.a(IZI)V")
    public void method3122(int arg0, boolean arg1) {
        int var3 = this.field2806[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field64[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method2904(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field64[arg0].length - 1;
                }
            } while (!class165.method2904(arg0, var3));
        }
        this.field2806[arg0] = var3;
        this.method3137();
    }

    @ObfuscatedName("fl.m(ZB)V")
    public void method3132(boolean arg0) {
        if (this.field2814 != arg0) {
            this.method3149((int[]) null, this.field2806, arg0, -1);
        }
    }

    @ObfuscatedName("fl.s(Ldp;I)V")
    public void method3127(class111 arg0) {
        arg0.method2326(this.field2814 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2808[field2812[var2]];
            if (var3 == 0) {
                arg0.method2326(-1);
            } else {
                arg0.method2326(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2326(this.field2806[var4]);
        }
    }

    @ObfuscatedName("fl.j(B)V")
    public void method3137() {
        long var1 = this.field2804;
        int var3 = this.field2808[5];
        int var4 = this.field2808[9];
        this.field2808[5] = var4;
        this.field2808[9] = var3;
        this.field2804 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2804 <<= 0x4;
            if (this.field2808[var5] >= 256) {
                this.field2804 += (long) (this.field2808[var5] - 256);
            }
        }
        if (this.field2808[0] >= 256) {
            this.field2804 += (long) (this.field2808[0] - 256 >> 4);
        }
        if (this.field2808[1] >= 256) {
            this.field2804 += (long) (this.field2808[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2804 <<= 0x3;
            this.field2804 += (long) this.field2806[var6];
        }
        this.field2804 <<= 0x1;
        this.field2804 += (long) (this.field2814 ? 1 : 0);
        this.field2808[5] = var3;
        this.field2808[9] = var4;
        if (var1 != 0L && this.field2804 != var1) {
            field2813.method3389(var1);
        }
    }

    @ObfuscatedName("fl.f(Law;ILaw;II)Lcs;")
    public class100 method3143(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2807 != -1) {
            return class37.method502(this.field2807).method679(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2804;
        int[] var7 = this.field2808;
        if (arg0 != null && (arg0.field969 >= 0 || arg0.field967 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2808[var8];
            }
            if (arg0.field969 >= 0) {
                var5 += (long) (arg0.field969 - this.field2808[5] << 40);
                var7[5] = arg0.field969;
            }
            if (arg0.field967 >= 0) {
                var5 += (long) (arg0.field967 - this.field2808[3] << 48);
                var7[3] = arg0.field967;
            }
        }
        class100 var9 = (class100) field2813.method3388(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method2514(var12 - 256).method802()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method2845(var12 - 512).method927(this.field2814)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2809 != -1L) {
                    var9 = (class100) field2813.method3388(this.field2809);
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
                        class95 var17 = class42.method2514(var16 - 256).method823();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method2845(var16 - 512).method882(this.field2814);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2806[var20] < Statics.field64[var20].length) {
                        var19.method1991(Statics.field2810[var20], Statics.field64[var20][this.field2806[var20]]);
                    }
                    if (this.field2806[var20] < Statics.field2811[var20].length) {
                        var19.method1991(Statics.field3053[var20], Statics.field2811[var20][this.field2806[var20]]);
                    }
                }
                var9 = var19.method1982(64, 850, -30, -50, -30);
                field2813.method3396(var9, var5);
                this.field2809 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method749(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method746(var9, arg3);
        } else {
            var21 = arg0.method746(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.b(I)Lci;")
    public class95 method3126() {
        if (this.field2807 != -1) {
            return class37.method502(this.field2807).method656();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2808[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method2514(var3 - 256).method803()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method2845(var3 - 512).method893(this.field2814)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2808[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method2514(var7 - 256).method804();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method2845(var7 - 512).method894(this.field2814);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2806[var11] < Statics.field64[var11].length) {
                var10.method1991(Statics.field2810[var11], Statics.field64[var11][this.field2806[var11]]);
            }
            if (this.field2806[var11] < Statics.field2811[var11].length) {
                var10.method1991(Statics.field3053[var11], Statics.field2811[var11][this.field2806[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.t(I)I")
    public int method3125() {
        return this.field2807 == -1 ? (this.field2808[11] << 5) + (this.field2808[8] << 10) + (this.field2808[0] << 15) + (this.field2806[0] << 25) + (this.field2806[4] << 20) + this.field2808[1] : 305419896 + class37.method502(this.field2807).field879;
    }
}
