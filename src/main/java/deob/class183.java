package deob;

@ObfuscatedName("gu")
public class class183 {

    @ObfuscatedName("gu.a")
    public int[] field2982;

    @ObfuscatedName("gu.d")
    public int[] field2977;

    @ObfuscatedName("gu.v")
    public boolean field2985;

    @ObfuscatedName("gu.r")
    public int field2979;

    @ObfuscatedName("gu.z")
    public long field2978;

    @ObfuscatedName("gu.t")
    public long field2981;

    @ObfuscatedName("gu.k")
    public static final int[] field2984 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gu.x")
    public static class197 field2980 = new class197(260);

    @ObfuscatedName("gu.a([I[IZII)V")
    public void method3324(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1051; var6++) {
                    class47 var7 = class47.method2689(var6);
                    if (var7 != null && !var7.field1049 && var7.field1058 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2984[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2982 = arg0;
        this.field2977 = arg1;
        this.field2985 = arg2;
        this.field2979 = arg3;
        this.method3326();
    }

    @ObfuscatedName("gu.d(IZI)V")
    public void method3322(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2985) {
            return;
        }
        int var3 = this.field2982[field2984[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1051) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1051 - 1;
                }
            }
            var4 = class47.method2689(var3);
        } while (var4 == null || var4.field1049 || arg0 + (this.field2985 ? 7 : 0) != var4.field1058);
        this.field2982[field2984[arg0]] = var3 + 256;
        this.method3326();
    }

    @ObfuscatedName("gu.v(IZB)V")
    public void method3331(int arg0, boolean arg1) {
        int var3 = this.field2977[arg0];
        boolean var4;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2976[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2976[arg0].length - 1;
                }
            } while (!class178.method2098(arg0, var3));
        }
        this.field2977[arg0] = var3;
        this.method3326();
    }

    @ObfuscatedName("gu.r(ZI)V")
    public void method3333(boolean arg0) {
        if (this.field2985 != arg0) {
            this.method3324((int[]) null, this.field2977, arg0, -1);
        }
    }

    @ObfuscatedName("gu.z(Ldb;S)V")
    public void method3325(class123 arg0) {
        arg0.method2380(this.field2985 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2982[field2984[var2]];
            if (var3 == 0) {
                arg0.method2380(-1);
            } else {
                arg0.method2380(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2380(this.field2977[var4]);
        }
    }

    @ObfuscatedName("gu.t(I)V")
    public void method3326() {
        long var1 = this.field2978;
        int var3 = this.field2982[5];
        int var4 = this.field2982[9];
        this.field2982[5] = var4;
        this.field2982[9] = var3;
        this.field2978 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2978 <<= 0x4;
            if (this.field2982[var5] >= 256) {
                this.field2978 += (long) (this.field2982[var5] - 256);
            }
        }
        if (this.field2982[0] >= 256) {
            this.field2978 += (long) (this.field2982[0] - 256 >> 4);
        }
        if (this.field2982[1] >= 256) {
            this.field2978 += (long) (this.field2982[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2978 <<= 0x3;
            this.field2978 += (long) this.field2977[var6];
        }
        this.field2978 <<= 0x1;
        this.field2978 += (long) (this.field2985 ? 1 : 0);
        this.field2982[5] = var3;
        this.field2982[9] = var4;
        if (var1 != 0L && this.field2978 != var1) {
            field2980.method3547(var1);
        }
    }

    @ObfuscatedName("gu.n(Lai;ILai;II)Ldp;")
    public class109 method3327(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2979 != -1) {
            return class42.method823(this.field2979).method800(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2978;
        int[] var7 = this.field2982;
        if (arg0 != null && (arg0.field1022 >= 0 || arg0.field1023 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2982[var8];
            }
            if (arg0.field1022 >= 0) {
                var5 += (long) (arg0.field1022 - this.field2982[5] << 40);
                var7[5] = arg0.field1022;
            }
            if (arg0.field1023 >= 0) {
                var5 += (long) (arg0.field1023 - this.field2982[3] << 48);
                var7[3] = arg0.field1023;
            }
        }
        class109 var9 = (class109) field2980.method3544(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method2689(var12 - 256).method932()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method754(var12 - 512).method1106(this.field2985)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2981 != -1L) {
                    var9 = (class109) field2980.method3544(this.field2981);
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
                        class104 var17 = class47.method2689(var16 - 256).method933();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method754(var16 - 512).method1134(this.field2985);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2977[var20] < Statics.field2976[var20].length) {
                        var19.method2114(Statics.field3261[var20], Statics.field2976[var20][this.field2977[var20]]);
                    }
                    if (this.field2977[var20] < Statics.field2113[var20].length) {
                        var19.method2114(Statics.field2983[var20], Statics.field2113[var20][this.field2977[var20]]);
                    }
                }
                var9 = var19.method2122(64, 850, -30, -50, -30);
                field2980.method3546(var9, var5);
                this.field2981 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method884(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method881(var9, arg3);
        } else {
            var21 = arg0.method881(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gu.i(B)Lcd;")
    public class104 method3328() {
        if (this.field2979 != -1) {
            return class42.method823(this.field2979).method787();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2982[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method2689(var3 - 256).method948()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method754(var3 - 512).method1153(this.field2985)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2982[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method2689(var7 - 256).method950();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method754(var7 - 512).method1109(this.field2985);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2977[var11] < Statics.field2976[var11].length) {
                var10.method2114(Statics.field3261[var11], Statics.field2976[var11][this.field2977[var11]]);
            }
            if (this.field2977[var11] < Statics.field2113[var11].length) {
                var10.method2114(Statics.field2983[var11], Statics.field2113[var11][this.field2977[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gu.g(B)I")
    public int method3329() {
        return this.field2979 == -1 ? (this.field2982[11] << 5) + (this.field2982[8] << 10) + (this.field2982[0] << 15) + (this.field2977[0] << 25) + (this.field2977[4] << 20) + this.field2982[1] : 305419896 + class42.method823(this.field2979).field911;
    }

    @ObfuscatedName("z.m(I)V")
    public static void method47() {
        field2980.method3552();
    }
}
