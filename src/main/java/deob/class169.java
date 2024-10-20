package deob;

@ObfuscatedName("fq")
public class class169 {

    @ObfuscatedName("fq.e")
    public int[] field2768;

    @ObfuscatedName("fq.a")
    public int[] field2771;

    @ObfuscatedName("fq.l")
    public boolean field2764;

    @ObfuscatedName("fq.c")
    public int field2765;

    @ObfuscatedName("fq.u")
    public long field2766;

    @ObfuscatedName("fq.w")
    public long field2767;

    @ObfuscatedName("fq.o")
    public static final int[] field2763 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fq.h")
    public static class183 field2769 = new class183(260);

    @ObfuscatedName("fq.e([I[IZII)V")
    public void method3052(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field937; var6++) {
                    class42 var7 = class42.method508(var6);
                    if (var7 != null && !var7.field948 && var7.field947 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2763[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2768 = arg0;
        this.field2771 = arg1;
        this.field2764 = arg2;
        this.field2765 = arg3;
        this.method3074();
    }

    @ObfuscatedName("fq.a(IZB)V")
    public void method3048(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2764) {
            return;
        }
        int var3 = this.field2768[field2763[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field937) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field937 - 1;
                }
            }
            var4 = class42.method508(var3);
        } while (var4 == null || var4.field948 || arg0 + (this.field2764 ? 7 : 0) != var4.field947);
        this.field2768[field2763[arg0]] = var3 + 256;
        this.method3074();
    }

    @ObfuscatedName("fq.l(IZB)V")
    public void method3049(int arg0, boolean arg1) {
        int var3 = this.field2771[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1269[arg0].length) {
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
                    var3 = Statics.field1269[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2771[arg0] = var3;
        this.method3074();
    }

    @ObfuscatedName("fq.c(ZI)V")
    public void method3054(boolean arg0) {
        if (this.field2764 != arg0) {
            this.method3052((int[]) null, this.field2771, arg0, -1);
        }
    }

    @ObfuscatedName("fq.u(Ldh;I)V")
    public void method3051(class111 arg0) {
        arg0.method2366(this.field2764 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2768[field2763[var2]];
            if (var3 == 0) {
                arg0.method2366(-1);
            } else {
                arg0.method2366(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2366(this.field2771[var4]);
        }
    }

    @ObfuscatedName("fq.w(B)V")
    public void method3074() {
        long var1 = this.field2766;
        int var3 = this.field2768[5];
        int var4 = this.field2768[9];
        this.field2768[5] = var4;
        this.field2768[9] = var3;
        this.field2766 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2766 <<= 0x4;
            if (this.field2768[var5] >= 256) {
                this.field2766 += (long) (this.field2768[var5] - 256);
            }
        }
        if (this.field2768[0] >= 256) {
            this.field2766 += (long) (this.field2768[0] - 256 >> 4);
        }
        if (this.field2768[1] >= 256) {
            this.field2766 += (long) (this.field2768[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2766 <<= 0x3;
            this.field2766 += (long) this.field2771[var6];
        }
        this.field2766 <<= 0x1;
        this.field2766 += (long) (this.field2764 ? 1 : 0);
        this.field2768[5] = var3;
        this.field2768[9] = var4;
        if (var1 != 0L && this.field2766 != var1) {
            field2769.method3308(var1);
        }
    }

    @ObfuscatedName("fq.i(Lah;ILah;II)Lcy;")
    public class100 method3053(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2765 != -1) {
            return class37.method843(this.field2765).method648(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2766;
        int[] var7 = this.field2768;
        if (arg0 != null && (arg0.field912 >= 0 || arg0.field907 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2768[var8];
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2768[5] << 40);
                var7[5] = arg0.field912;
            }
            if (arg0.field907 >= 0) {
                var5 += (long) (arg0.field907 - this.field2768[3] << 48);
                var7[3] = arg0.field907;
            }
        }
        class100 var9 = (class100) field2769.method3302(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method508(var12 - 256).method796()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method2467(var12 - 512).method934(this.field2764)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2767 != -1L) {
                    var9 = (class100) field2769.method3302(this.field2767);
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
                        class95 var17 = class42.method508(var16 - 256).method797();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method2467(var16 - 512).method905(this.field2764);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2771[var20] < Statics.field1269[var20].length) {
                        var19.method1936(Statics.field1884[var20], Statics.field1269[var20][this.field2771[var20]]);
                    }
                    if (this.field2771[var20] < Statics.field1248[var20].length) {
                        var19.method1936(Statics.field30[var20], Statics.field1248[var20][this.field2771[var20]]);
                    }
                }
                var9 = var19.method1957(64, 850, -30, -50, -30);
                field2769.method3304(var9, var5);
                this.field2767 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method747(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method749(var9, arg3);
        } else {
            var21 = arg0.method749(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fq.r(B)Lcr;")
    public class95 method3076() {
        if (this.field2765 != -1) {
            return class37.method843(this.field2765).method653();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2768[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method508(var3 - 256).method816()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method2467(var3 - 512).method893(this.field2764)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2768[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method508(var7 - 256).method812();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method2467(var7 - 512).method894(this.field2764);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2771[var11] < Statics.field1269[var11].length) {
                var10.method1936(Statics.field1884[var11], Statics.field1269[var11][this.field2771[var11]]);
            }
            if (this.field2771[var11] < Statics.field1248[var11].length) {
                var10.method1936(Statics.field30[var11], Statics.field1248[var11][this.field2771[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fq.f(B)I")
    public int method3050() {
        return this.field2765 == -1 ? (this.field2768[11] << 5) + (this.field2768[8] << 10) + (this.field2768[0] << 15) + (this.field2771[4] << 20) + (this.field2771[0] << 25) + this.field2768[1] : 305419896 + class37.method843(this.field2765).field794;
    }

    @ObfuscatedName("av.g(I)V")
    public static void method645() {
        field2769.method3303();
    }
}
