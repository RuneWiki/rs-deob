package deob;

@ObfuscatedName("ga")
public class class183 {

    @ObfuscatedName("ga.l")
    public int[] field2980;

    @ObfuscatedName("ga.g")
    public int[] field2975;

    @ObfuscatedName("ga.r")
    public boolean field2972;

    @ObfuscatedName("ga.e")
    public int field2973;

    @ObfuscatedName("ga.h")
    public long field2974;

    @ObfuscatedName("ga.s")
    public long field2976;

    @ObfuscatedName("ga.m")
    public static final int[] field2978 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ga.q")
    public static class197 field2979 = new class197(260);

    @ObfuscatedName("ga.l([I[IZIB)V")
    public void method3426(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1055; var6++) {
                    class47 var7 = class47.method2253(var6);
                    if (var7 != null && !var7.field1054 && var7.field1057 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2978[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2980 = arg0;
        this.field2975 = arg1;
        this.field2972 = arg2;
        this.field2973 = arg3;
        this.method3431();
    }

    @ObfuscatedName("ga.g(IZI)V")
    public void method3427(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2972) {
            return;
        }
        int var3 = this.field2980[field2978[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1055) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1055 - 1;
                }
            }
            var4 = class47.method2253(var3);
        } while (var4 == null || var4.field1054 || (this.field2972 ? 7 : 0) + arg0 != var4.field1057);
        this.field2980[field2978[arg0]] = var3 + 256;
        this.method3431();
    }

    @ObfuscatedName("ga.r(IZI)V")
    public void method3428(int arg0, boolean arg1) {
        int var3 = this.field2975[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2795[arg0].length) {
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
                    var3 = Statics.field2795[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2975[arg0] = var3;
        this.method3431();
    }

    @ObfuscatedName("ga.e(ZI)V")
    public void method3429(boolean arg0) {
        if (this.field2972 != arg0) {
            this.method3426((int[]) null, this.field2975, arg0, -1);
        }
    }

    @ObfuscatedName("ga.h(Ldc;I)V")
    public void method3430(class123 arg0) {
        arg0.method2640(this.field2972 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2980[field2978[var2]];
            if (var3 == 0) {
                arg0.method2640(-1);
            } else {
                arg0.method2640(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2640(this.field2975[var4]);
        }
    }

    @ObfuscatedName("ga.s(B)V")
    public void method3431() {
        long var1 = this.field2974;
        int var3 = this.field2980[5];
        int var4 = this.field2980[9];
        this.field2980[5] = var4;
        this.field2980[9] = var3;
        this.field2974 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2974 <<= 0x4;
            if (this.field2980[var5] >= 256) {
                this.field2974 += (long) (this.field2980[var5] - 256);
            }
        }
        if (this.field2980[0] >= 256) {
            this.field2974 += (long) (this.field2980[0] - 256 >> 4);
        }
        if (this.field2980[1] >= 256) {
            this.field2974 += (long) (this.field2980[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2974 <<= 0x3;
            this.field2974 += (long) this.field2975[var6];
        }
        this.field2974 <<= 0x1;
        this.field2974 += (long) (this.field2972 ? 1 : 0);
        this.field2980[5] = var3;
        this.field2980[9] = var4;
        if (var1 != 0L && this.field2974 != var1) {
            field2979.method3654(var1);
        }
    }

    @ObfuscatedName("ga.k(Lat;ILat;II)Ldv;")
    public class109 method3459(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2973 != -1) {
            return class42.method195(this.field2973).method793(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2974;
        int[] var7 = this.field2980;
        if (arg0 != null && (arg0.field1025 >= 0 || arg0.field1026 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2980[var8];
            }
            if (arg0.field1025 >= 0) {
                var5 += (long) (arg0.field1025 - this.field2980[5] << 40);
                var7[5] = arg0.field1025;
            }
            if (arg0.field1026 >= 0) {
                var5 += (long) (arg0.field1026 - this.field2980[3] << 48);
                var7[3] = arg0.field1026;
            }
        }
        class109 var9 = (class109) field2979.method3653(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method2253(var12 - 256).method946()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method15(var12 - 512).method1146(this.field2972)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2976 != -1L) {
                    var9 = (class109) field2979.method3653(this.field2976);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class104 var17 = class47.method2253(var16 - 256).method947();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method15(var16 - 512).method1156(this.field2972);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2975[var20] < Statics.field2795[var20].length) {
                        var19.method2173(Statics.field2970[var20], Statics.field2795[var20][this.field2975[var20]]);
                    }
                    if (this.field2975[var20] < Statics.field1841[var20].length) {
                        var19.method2173(Statics.field2977[var20], Statics.field1841[var20][this.field2975[var20]]);
                    }
                }
                var9 = var19.method2189(64, 850, -30, -50, -30);
                field2979.method3655(var9, var5);
                this.field2976 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method889(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method918(var9, arg3);
        } else {
            var21 = arg0.method918(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ga.u(I)Lcc;")
    public class104 method3433() {
        if (this.field2973 != -1) {
            return class42.method195(this.field2973).method794();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2980[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method2253(var3 - 256).method966()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method15(var3 - 512).method1207(this.field2972)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2980[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method2253(var7 - 256).method949();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method15(var7 - 512).method1158(this.field2972);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2975[var11] < Statics.field2795[var11].length) {
                var10.method2173(Statics.field2970[var11], Statics.field2795[var11][this.field2975[var11]]);
            }
            if (this.field2975[var11] < Statics.field1841[var11].length) {
                var10.method2173(Statics.field2977[var11], Statics.field1841[var11][this.field2975[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ga.n(I)I")
    public int method3434() {
        return this.field2973 == -1 ? (this.field2980[11] << 5) + (this.field2980[8] << 10) + (this.field2980[0] << 15) + (this.field2975[0] << 25) + (this.field2975[4] << 20) + this.field2980[1] : 305419896 + class42.method195(this.field2973).field925;
    }

    @ObfuscatedName("bj.b(I)V")
    public static void method1144() {
        field2979.method3658();
    }
}
