package deob;

@ObfuscatedName("gh")
public class class183 {

    @ObfuscatedName("gh.i")
    public int[] field2973;

    @ObfuscatedName("gh.h")
    public int[] field2971;

    @ObfuscatedName("gh.e")
    public boolean field2974;

    @ObfuscatedName("gh.g")
    public int field2972;

    @ObfuscatedName("gh.n")
    public long field2970;

    @ObfuscatedName("gh.u")
    public long field2975;

    @ObfuscatedName("gh.y")
    public static final int[] field2979 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("gh.s")
    public static class197 field2980 = new class197(260);

    @ObfuscatedName("gh.i([I[IZII)V")
    public void method3298(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field2713; var6++) {
                    class47 var7 = class47.method12(var6);
                    if (var7 != null && !var7.field1061 && (arg2 ? 7 : 0) + var5 == var7.field1049) {
                        arg0[field2979[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2973 = arg0;
        this.field2971 = arg1;
        this.field2974 = arg2;
        this.field2972 = arg3;
        this.method3303();
    }

    @ObfuscatedName("gh.h(IZI)V")
    public void method3311(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2974) {
            return;
        }
        int var3 = this.field2973[field2979[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class47 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field2713) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2713 - 1;
                }
            }
            var4 = class47.method12(var3);
        } while (var4 == null || var4.field1061 || (this.field2974 ? 7 : 0) + arg0 != var4.field1049);
        this.field2973[field2979[arg0]] = var3 + 256;
        this.method3303();
    }

    @ObfuscatedName("gh.e(IZI)V")
    public void method3300(int arg0, boolean arg1) {
        int var3 = this.field2971[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field273[arg0].length) {
                    var3 = 0;
                }
            } while (!class178.method642(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field273[arg0].length - 1;
                }
            } while (!class178.method642(arg0, var3));
        }
        this.field2971[arg0] = var3;
        this.method3303();
    }

    @ObfuscatedName("gh.g(ZI)V")
    public void method3301(boolean arg0) {
        if (this.field2974 != arg0) {
            this.method3298((int[]) null, this.field2971, arg0, -1);
        }
    }

    @ObfuscatedName("gh.n(Ldn;I)V")
    public void method3318(class123 arg0) {
        arg0.method2389(this.field2974 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2973[field2979[var2]];
            if (var3 == 0) {
                arg0.method2389(-1);
            } else {
                arg0.method2389(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2389(this.field2971[var4]);
        }
    }

    @ObfuscatedName("gh.u(I)V")
    public void method3303() {
        long var1 = this.field2970;
        int var3 = this.field2973[5];
        int var4 = this.field2973[9];
        this.field2973[5] = var4;
        this.field2973[9] = var3;
        this.field2970 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2970 <<= 0x4;
            if (this.field2973[var5] >= 256) {
                this.field2970 += (long) (this.field2973[var5] - 256);
            }
        }
        if (this.field2973[0] >= 256) {
            this.field2970 += (long) (this.field2973[0] - 256 >> 4);
        }
        if (this.field2973[1] >= 256) {
            this.field2970 += (long) (this.field2973[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2970 <<= 0x3;
            this.field2970 += (long) this.field2971[var6];
        }
        this.field2970 <<= 0x1;
        this.field2970 += (long) (this.field2974 ? 1 : 0);
        this.field2973[5] = var3;
        this.field2973[9] = var4;
        if (var1 != 0L && this.field2970 != var1) {
            field2980.method3531(var1);
        }
    }

    @ObfuscatedName("gh.d(Laa;ILaa;II)Ldo;")
    public class109 method3304(class45 arg0, int arg1, class45 arg2, int arg3) {
        if (this.field2972 != -1) {
            return class42.method187(this.field2972).method780(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2970;
        int[] var7 = this.field2973;
        if (arg0 != null && (arg0.field1023 >= 0 || arg0.field1021 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2973[var8];
            }
            if (arg0.field1023 >= 0) {
                var5 += (long) (arg0.field1023 - this.field2973[5] << 40);
                var7[5] = arg0.field1023;
            }
            if (arg0.field1021 >= 0) {
                var5 += (long) (arg0.field1021 - this.field2973[3] << 48);
                var7[3] = arg0.field1021;
            }
        }
        class109 var9 = (class109) field2980.method3541(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class47.method12(var12 - 256).method931()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class56.method2018(var12 - 512).method1089(this.field2974)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2975 != -1L) {
                    var9 = (class109) field2980.method3541(this.field2975);
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
                        class104 var17 = class47.method12(var16 - 256).method917();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class104 var18 = class56.method2018(var16 - 512).method1090(this.field2974);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class104 var19 = new class104(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2971[var20] < Statics.field273[var20].length) {
                        var19.method2185(Statics.field2976[var20], Statics.field273[var20][this.field2971[var20]]);
                    }
                    if (this.field2971[var20] < Statics.field2978[var20].length) {
                        var19.method2185(Statics.field2977[var20], Statics.field2978[var20][this.field2971[var20]]);
                    }
                }
                var9 = var19.method2135(64, 850, -30, -50, -30);
                field2980.method3532(var9, var5);
                this.field2975 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class109 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method887(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method866(var9, arg3);
        } else {
            var21 = arg0.method866(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("gh.l(I)Lco;")
    public class104 method3305() {
        if (this.field2972 != -1) {
            return class42.method187(this.field2972).method774();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2973[var2];
            if (var3 >= 256 && var3 < 512 && !class47.method12(var3 - 256).method934()) {
                var1 = true;
            }
            if (var3 >= 512 && !class56.method2018(var3 - 512).method1111(this.field2974)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2973[var6];
            if (var7 >= 256 && var7 < 512) {
                class104 var8 = class47.method12(var7 - 256).method919();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class104 var9 = class56.method2018(var7 - 512).method1101(this.field2974);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class104 var10 = new class104(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2971[var11] < Statics.field273[var11].length) {
                var10.method2185(Statics.field2976[var11], Statics.field273[var11][this.field2971[var11]]);
            }
            if (this.field2971[var11] < Statics.field2978[var11].length) {
                var10.method2185(Statics.field2977[var11], Statics.field2978[var11][this.field2971[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("gh.m(I)I")
    public int method3302() {
        return this.field2972 == -1 ? (this.field2973[11] << 5) + (this.field2973[8] << 10) + (this.field2973[0] << 15) + (this.field2971[0] << 25) + (this.field2971[4] << 20) + this.field2973[1] : 305419896 + class42.method187(this.field2972).field909;
    }

    @ObfuscatedName("fg.j(I)V")
    public static void method3262() {
        field2980.method3533();
    }
}
