package deob;

@ObfuscatedName("hf")
public class class214 {

    @ObfuscatedName("hf.d")
    public int[] field2597;

    @ObfuscatedName("hf.q")
    public int[] field2598;

    @ObfuscatedName("hf.x")
    public boolean field2600;

    @ObfuscatedName("hf.y")
    public int field2599;

    @ObfuscatedName("hf.e")
    public long field2601;

    @ObfuscatedName("hf.f")
    public long field2602;

    @ObfuscatedName("hf.g")
    public static final int[] field2604 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hf.s")
    public static class190 field2605 = new class190(260);

    @ObfuscatedName("hf.d([I[IZII)V")
    public void method3614(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3332; var6++) {
                    class248 var7 = class248.method2823(var6);
                    if (var7 != null && !var7.field3333 && (arg2 ? 7 : 0) + var5 == var7.field3334) {
                        arg0[field2604[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2597 = arg0;
        this.field2598 = arg1;
        this.field2600 = arg2;
        this.field2599 = arg3;
        this.method3619();
    }

    @ObfuscatedName("hf.q(IZI)V")
    public void method3615(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2600) {
            return;
        }
        int var3 = this.field2597[field2604[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3332) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3332 - 1;
                }
            }
            var4 = class248.method2823(var3);
        } while (var4 == null || var4.field3333 || (this.field2600 ? 7 : 0) + arg0 != var4.field3334);
        this.field2597[field2604[arg0]] = var3 + 256;
        this.method3619();
    }

    @ObfuscatedName("hf.x(IZI)V")
    public void method3616(int arg0, boolean arg1) {
        int var3 = this.field2598[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2014[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method3645(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2014[arg0].length - 1;
                }
            } while (!class215.method3645(arg0, var3));
        }
        this.field2598[arg0] = var3;
        this.method3619();
    }

    @ObfuscatedName("hf.y(ZI)V")
    public void method3617(boolean arg0) {
        if (this.field2600 != arg0) {
            this.method3614((int[]) null, this.field2598, arg0, -1);
        }
    }

    @ObfuscatedName("hf.e(Lfw;B)V")
    public void method3618(class174 arg0) {
        arg0.method2899(this.field2600 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2597[field2604[var2]];
            if (var3 == 0) {
                arg0.method2899(-1);
            } else {
                arg0.method2899(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2899(this.field2598[var4]);
        }
    }

    @ObfuscatedName("hf.f(B)V")
    public void method3619() {
        long var1 = this.field2601;
        int var3 = this.field2597[5];
        int var4 = this.field2597[9];
        this.field2597[5] = var4;
        this.field2597[9] = var3;
        this.field2601 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2601 <<= 0x4;
            if (this.field2597[var5] >= 256) {
                this.field2601 += (long) (this.field2597[var5] - 256);
            }
        }
        if (this.field2597[0] >= 256) {
            this.field2601 += (long) (this.field2597[0] - 256 >> 4);
        }
        if (this.field2597[1] >= 256) {
            this.field2601 += (long) (this.field2597[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2601 <<= 0x3;
            this.field2601 += (long) this.field2598[var6];
        }
        this.field2601 <<= 0x1;
        this.field2601 += (long) (this.field2600 ? 1 : 0);
        this.field2597[5] = var3;
        this.field2597[9] = var4;
        if (var1 != 0L && this.field2601 != var1) {
            field2605.method3248(var1);
        }
    }

    @ObfuscatedName("hf.v(Ljj;ILjj;II)Lev;")
    public class134 method3620(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2599 != -1) {
            return class259.method941(this.field2599).method4248(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2601;
        int[] var7 = this.field2597;
        if (arg0 != null && (arg0.field3594 >= 0 || arg0.field3595 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2597[var8];
            }
            if (arg0.field3594 >= 0) {
                var5 += (long) (arg0.field3594 - this.field2597[5] << 40);
                var7[5] = arg0.field3594;
            }
            if (arg0.field3595 >= 0) {
                var5 += (long) (arg0.field3595 - this.field2597[3] << 48);
                var7[3] = arg0.field3595;
            }
        }
        class134 var9 = (class134) field2605.method3252(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method2823(var12 - 256).method3971()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method992(var12 - 512).method4172(this.field2600)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2602 != -1L) {
                    var9 = (class134) field2605.method3252(this.field2602);
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
                        class128 var17 = class248.method2823(var16 - 256).method3986();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = Statics.method992(var16 - 512).method4173(this.field2600);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2598[var20] < Statics.field2014[var20].length) {
                        var19.method2226(Statics.field1339[var20], Statics.field2014[var20][this.field2598[var20]]);
                    }
                    if (this.field2598[var20] < Statics.field34[var20].length) {
                        var19.method2226(Statics.field2603[var20], Statics.field34[var20][this.field2598[var20]]);
                    }
                }
                var9 = var19.method2246(64, 850, -30, -50, -30);
                field2605.method3256(var9, var5);
                this.field2602 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4306(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4303(var9, arg3);
        } else {
            var21 = arg0.method4303(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hf.t(I)Ldk;")
    public class128 method3621() {
        if (this.field2599 != -1) {
            return class259.method941(this.field2599).method4241();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2597[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method2823(var3 - 256).method3969()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method992(var3 - 512).method4174(this.field2600)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2597[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method2823(var7 - 256).method3970();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = Statics.method992(var7 - 512).method4175(this.field2600);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2598[var11] < Statics.field2014[var11].length) {
                var10.method2226(Statics.field1339[var11], Statics.field2014[var11][this.field2598[var11]]);
            }
            if (this.field2598[var11] < Statics.field34[var11].length) {
                var10.method2226(Statics.field2603[var11], Statics.field34[var11][this.field2598[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hf.i(B)I")
    public int method3625() {
        return this.field2599 == -1 ? (this.field2597[11] << 5) + (this.field2597[8] << 10) + (this.field2597[0] << 15) + (this.field2598[0] << 25) + (this.field2598[4] << 20) + this.field2597[1] : 305419896 + class259.method941(this.field2599).field3534;
    }
}
