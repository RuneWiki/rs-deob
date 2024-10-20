package deob;

@ObfuscatedName("fe")
public class class170 {

    @ObfuscatedName("fe.n")
    public int[] field2812;

    @ObfuscatedName("fe.d")
    public int[] field2810;

    @ObfuscatedName("fe.z")
    public boolean field2817;

    @ObfuscatedName("fe.y")
    public int field2811;

    @ObfuscatedName("fe.e")
    public long field2814;

    @ObfuscatedName("fe.g")
    public long field2813;

    @ObfuscatedName("fe.l")
    public static final int[] field2816 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fe.u")
    public static class184 field2809 = new class184(260);

    @ObfuscatedName("fe.n([I[IZII)V")
    public void method3187(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field973; var6++) {
                    class42 var7 = class42.method522(var6);
                    if (var7 != null && !var7.field971 && (arg2 ? 7 : 0) + var5 == var7.field975) {
                        arg0[field2816[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2812 = arg0;
        this.field2810 = arg1;
        this.field2817 = arg2;
        this.field2811 = arg3;
        this.method3192();
    }

    @ObfuscatedName("fe.d(IZI)V")
    public void method3188(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2817) {
            return;
        }
        int var3 = this.field2812[field2816[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class42 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field973) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field973 - 1;
                }
            }
            var4 = class42.method522(var3);
        } while (var4 == null || var4.field971 || var4.field975 != (this.field2817 ? 7 : 0) + arg0);
        this.field2812[field2816[arg0]] = var3 + 256;
        this.method3192();
    }

    @ObfuscatedName("fe.z(IZI)V")
    public void method3189(int arg0, boolean arg1) {
        int var3 = this.field2810[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2815[arg0].length) {
                    var3 = 0;
                }
            } while (!class165.method2530(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2815[arg0].length - 1;
                }
            } while (!class165.method2530(arg0, var3));
        }
        this.field2810[arg0] = var3;
        this.method3192();
    }

    @ObfuscatedName("fe.y(ZI)V")
    public void method3190(boolean arg0) {
        if (this.field2817 != arg0) {
            this.method3187((int[]) null, this.field2810, arg0, -1);
        }
    }

    @ObfuscatedName("fe.e(Ldl;S)V")
    public void method3191(class111 arg0) {
        arg0.method2213(this.field2817 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2812[field2816[var2]];
            if (var3 == 0) {
                arg0.method2213(-1);
            } else {
                arg0.method2213(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2213(this.field2810[var4]);
        }
    }

    @ObfuscatedName("fe.g(B)V")
    public void method3192() {
        long var1 = this.field2814;
        int var3 = this.field2812[5];
        int var4 = this.field2812[9];
        this.field2812[5] = var4;
        this.field2812[9] = var3;
        this.field2814 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2814 <<= 0x4;
            if (this.field2812[var5] >= 256) {
                this.field2814 += (long) (this.field2812[var5] - 256);
            }
        }
        if (this.field2812[0] >= 256) {
            this.field2814 += (long) (this.field2812[0] - 256 >> 4);
        }
        if (this.field2812[1] >= 256) {
            this.field2814 += (long) (this.field2812[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2814 <<= 0x3;
            this.field2814 += (long) this.field2810[var6];
        }
        this.field2814 <<= 0x1;
        this.field2814 += (long) (this.field2817 ? 1 : 0);
        this.field2812[5] = var3;
        this.field2812[9] = var4;
        if (var1 != 0L && this.field2814 != var1) {
            field2809.method3421(var1);
        }
    }

    @ObfuscatedName("fe.f(Lan;ILan;II)Lcg;")
    public class100 method3215(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field2811 != -1) {
            return class37.method3596(this.field2811).method682(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2814;
        int[] var7 = this.field2812;
        if (arg0 != null && (arg0.field940 >= 0 || arg0.field941 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2812[var8];
            }
            if (arg0.field940 >= 0) {
                var5 += (long) (arg0.field940 - this.field2812[5] << 40);
                var7[5] = arg0.field940;
            }
            if (arg0.field941 >= 0) {
                var5 += (long) (arg0.field941 - this.field2812[3] << 48);
                var7[3] = arg0.field941;
            }
        }
        class100 var9 = (class100) field2809.method3411(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class42.method522(var12 - 256).method819()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class47.method3569(var12 - 512).method949(this.field2817)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2813 != -1L) {
                    var9 = (class100) field2809.method3411(this.field2813);
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
                        class95 var17 = class42.method522(var16 - 256).method820();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class95 var18 = class47.method3569(var16 - 512).method938(this.field2817);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class95 var19 = new class95(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2810[var20] < Statics.field2815[var20].length) {
                        var19.method2001(Statics.field1856[var20], Statics.field2815[var20][this.field2810[var20]]);
                    }
                    if (this.field2810[var20] < Statics.field543[var20].length) {
                        var19.method2001(Statics.field232[var20], Statics.field543[var20][this.field2810[var20]]);
                    }
                }
                var9 = var19.method1994(64, 850, -30, -50, -30);
                field2809.method3420(var9, var5);
                this.field2813 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class100 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method782(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method779(var9, arg3);
        } else {
            var21 = arg0.method779(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fe.m(I)Lcy;")
    public class95 method3194() {
        if (this.field2811 != -1) {
            return class37.method3596(this.field2811).method683();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2812[var2];
            if (var3 >= 256 && var3 < 512 && !class42.method522(var3 - 256).method821()) {
                var1 = true;
            }
            if (var3 >= 512 && !class47.method3569(var3 - 512).method904(this.field2817)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class95[] var4 = new class95[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2812[var6];
            if (var7 >= 256 && var7 < 512) {
                class95 var8 = class42.method522(var7 - 256).method817();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class95 var9 = class47.method3569(var7 - 512).method898(this.field2817);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class95 var10 = new class95(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2810[var11] < Statics.field2815[var11].length) {
                var10.method2001(Statics.field1856[var11], Statics.field2815[var11][this.field2810[var11]]);
            }
            if (this.field2810[var11] < Statics.field543[var11].length) {
                var10.method2001(Statics.field232[var11], Statics.field543[var11][this.field2810[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fe.a(S)I")
    public int method3195() {
        return this.field2811 == -1 ? (this.field2812[11] << 5) + (this.field2812[8] << 10) + (this.field2812[0] << 15) + (this.field2810[0] << 25) + (this.field2810[4] << 20) + this.field2812[1] : 305419896 + class37.method3596(this.field2811).field824;
    }
}
