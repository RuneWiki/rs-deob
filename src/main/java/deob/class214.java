package deob;

@ObfuscatedName("hr")
public class class214 {

    @ObfuscatedName("hr.e")
    public int[] field2605;

    @ObfuscatedName("hr.o")
    public int[] field2600;

    @ObfuscatedName("hr.m")
    public boolean field2610;

    @ObfuscatedName("hr.g")
    public int field2603;

    @ObfuscatedName("hr.d")
    public long field2604;

    @ObfuscatedName("hr.b")
    public long field2607;

    @ObfuscatedName("hr.h")
    public static final int[] field2606 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hr.i")
    public static class190 field2609 = new class190(260);

    @ObfuscatedName("hr.e([I[IZIB)V")
    public void method3610(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3335; var6++) {
                    class248 var7 = class248.method61(var6);
                    if (var7 != null && !var7.field3333 && var7.field3329 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2606[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2605 = arg0;
        this.field2600 = arg1;
        this.field2610 = arg2;
        this.field2603 = arg3;
        this.method3615();
    }

    @ObfuscatedName("hr.o(IZI)V")
    public void method3643(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2610) {
            return;
        }
        int var3 = this.field2605[field2606[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3335) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3335 - 1;
                }
            }
            var4 = class248.method61(var3);
        } while (var4 == null || var4.field3333 || arg0 + (this.field2610 ? 7 : 0) != var4.field3329);
        this.field2605[field2606[arg0]] = var3 + 256;
        this.method3615();
    }

    @ObfuscatedName("hr.m(IZB)V")
    public void method3612(int arg0, boolean arg1) {
        int var3 = this.field2600[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3204[arg0].length) {
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
                    var3 = Statics.field3204[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2600[arg0] = var3;
        this.method3615();
    }

    @ObfuscatedName("hr.g(ZI)V")
    public void method3613(boolean arg0) {
        if (this.field2610 != arg0) {
            this.method3610((int[]) null, this.field2600, arg0, -1);
        }
    }

    @ObfuscatedName("hr.d(Lfw;I)V")
    public void method3614(class174 arg0) {
        arg0.method2876(this.field2610 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2605[field2606[var2]];
            if (var3 == 0) {
                arg0.method2876(-1);
            } else {
                arg0.method2876(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2876(this.field2600[var4]);
        }
    }

    @ObfuscatedName("hr.b(S)V")
    public void method3615() {
        long var1 = this.field2604;
        int var3 = this.field2605[5];
        int var4 = this.field2605[9];
        this.field2605[5] = var4;
        this.field2605[9] = var3;
        this.field2604 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2604 <<= 0x4;
            if (this.field2605[var5] >= 256) {
                this.field2604 += (long) (this.field2605[var5] - 256);
            }
        }
        if (this.field2605[0] >= 256) {
            this.field2604 += (long) (this.field2605[0] - 256 >> 4);
        }
        if (this.field2605[1] >= 256) {
            this.field2604 += (long) (this.field2605[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2604 <<= 0x3;
            this.field2604 += (long) this.field2600[var6];
        }
        this.field2604 <<= 0x1;
        this.field2604 += (long) (this.field2610 ? 1 : 0);
        this.field2605[5] = var3;
        this.field2605[9] = var4;
        if (var1 != 0L && this.field2604 != var1) {
            field2609.method3249(var1);
        }
    }

    @ObfuscatedName("hr.k(Lju;ILju;II)Leo;")
    public class134 method3616(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2603 != -1) {
            return class259.method3097(this.field2603).method4301(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2604;
        int[] var7 = this.field2605;
        if (arg0 != null && (arg0.field3595 >= 0 || arg0.field3600 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2605[var8];
            }
            if (arg0.field3595 >= 0) {
                var5 += (long) (arg0.field3595 - this.field2605[5] << 40);
                var7[5] = arg0.field3595;
            }
            if (arg0.field3600 >= 0) {
                var5 += (long) (arg0.field3600 - this.field2605[3] << 48);
                var7[3] = arg0.field3600;
            }
        }
        class134 var9 = (class134) field2609.method3248(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method61(var12 - 256).method3996()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method461(var12 - 512).method4206(this.field2610)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2607 != -1L) {
                    var9 = (class134) field2609.method3248(this.field2607);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class248.method61(var16 - 256).method3997();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = Statics.method461(var16 - 512).method4210(this.field2610);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2600[var20] < Statics.field3204[var20].length) {
                        var19.method2189(Statics.field802[var20], Statics.field3204[var20][this.field2600[var20]]);
                    }
                    if (this.field2600[var20] < Statics.field2221[var20].length) {
                        var19.method2189(Statics.field1418[var20], Statics.field2221[var20][this.field2600[var20]]);
                    }
                }
                var9 = var19.method2226(64, 850, -30, -50, -30);
                field2609.method3250(var9, var5);
                this.field2607 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4337(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4333(var9, arg3);
        } else {
            var21 = arg0.method4333(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hr.q(I)Ldz;")
    public class128 method3617() {
        if (this.field2603 != -1) {
            return class259.method3097(this.field2603).method4269();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2605[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method61(var3 - 256).method4000()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method461(var3 - 512).method4211(this.field2610)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2605[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method61(var7 - 256).method3999();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = Statics.method461(var7 - 512).method4212(this.field2610);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2600[var11] < Statics.field3204[var11].length) {
                var10.method2189(Statics.field802[var11], Statics.field3204[var11][this.field2600[var11]]);
            }
            if (this.field2600[var11] < Statics.field2221[var11].length) {
                var10.method2189(Statics.field1418[var11], Statics.field2221[var11][this.field2600[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hr.h(B)I")
    public int method3618() {
        return this.field2603 == -1 ? (this.field2605[11] << 5) + (this.field2605[8] << 10) + (this.field2605[0] << 15) + (this.field2600[0] << 25) + (this.field2600[4] << 20) + this.field2605[1] : 305419896 + class259.method3097(this.field2603).field3531;
    }

    @ObfuscatedName("r.i(I)V")
    public static void method142() {
        field2609.method3247();
    }
}
