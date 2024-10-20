package deob;

@ObfuscatedName("ke")
public class class294 {

    @ObfuscatedName("ke.c")
    public int[] field3368;

    @ObfuscatedName("ke.p")
    public int[] field3360;

    @ObfuscatedName("ke.f")
    public boolean field3362;

    @ObfuscatedName("ke.n")
    public int field3363;

    @ObfuscatedName("ke.k")
    public long field3364;

    @ObfuscatedName("ke.w")
    public long field3365;

    @ObfuscatedName("ke.s")
    public class169[] field3366;

    @ObfuscatedName("ke.q")
    public boolean field3367 = false;

    @ObfuscatedName("ke.h")
    public static final int[] field3361 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ke.t")
    public static class257 field3369 = new class257(260);

    @ObfuscatedName("ke.c([I[Lfi;Z[IZIB)V")
    public void method5148(int[] arg0, class169[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3366 = arg1;
        this.field3367 = arg2;
        this.method5149(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ke.p([I[IZII)V")
    public void method5149(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1878; var6++) {
                    class174 var7 = class174.method96(var6);
                    if (var7 != null && !var7.field1887 && var7.field1883 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field3361[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3368 = arg0;
        this.field3360 = arg1;
        this.field3362 = arg2;
        this.field3363 = arg3;
        this.method5158();
    }

    @ObfuscatedName("ke.f(IZI)V")
    public void method5150(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3362) {
            return;
        }
        int var3 = this.field3368[field3361[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class174 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1878) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1878 - 1;
                }
            }
            var4 = class174.method96(var3);
        } while (var4 == null || var4.field1887 || var4.field1883 != arg0 + (this.field3362 ? 7 : 0));
        this.field3368[field3361[arg0]] = var3 + 256;
        this.method5158();
    }

    @ObfuscatedName("ke.n(IZI)V")
    public void method5151(int arg0, boolean arg1) {
        int var3 = this.field3360[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field4280[arg0].length) {
                    var3 = 0;
                }
            } while (!class295.method4107(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4280[arg0].length - 1;
                }
            } while (!class295.method4107(arg0, var3));
        }
        this.field3360[arg0] = var3;
        this.method5158();
    }

    @ObfuscatedName("ke.k(ZI)V")
    public void method5172(boolean arg0) {
        if (this.field3362 != arg0) {
            this.method5149((int[]) null, this.field3360, arg0, -1);
        }
    }

    @ObfuscatedName("ke.w(Lqq;B)V")
    public void method5154(class445 arg0) {
        arg0.method7179(this.field3362 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3368[field3361[var2]];
            if (var3 == 0) {
                arg0.method7179(-1);
            } else {
                arg0.method7179(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method7179(this.field3360[var4]);
        }
    }

    @ObfuscatedName("ke.s(I)V")
    public void method5158() {
        long var1 = this.field3364;
        int var3 = this.field3368[5];
        int var4 = this.field3368[9];
        this.field3368[5] = var4;
        this.field3368[9] = var3;
        this.field3364 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3364 <<= 0x4;
            if (this.field3368[var5] >= 256) {
                this.field3364 += (long) (this.field3368[var5] - 256);
            }
        }
        if (this.field3368[0] >= 256) {
            this.field3364 += (long) (this.field3368[0] - 256 >> 4);
        }
        if (this.field3368[1] >= 256) {
            this.field3364 += (long) (this.field3368[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3364 <<= 0x3;
            this.field3364 += (long) this.field3360[var6];
        }
        this.field3364 <<= 0x1;
        this.field3364 += (long) (this.field3362 ? 1 : 0);
        this.field3368[5] = var3;
        this.field3368[9] = var4;
        if (var1 != 0L && this.field3364 != var1 || this.field3367) {
            field3369.method4780(var1);
        }
    }

    @ObfuscatedName("ke.q(Lgd;ILgd;IB)Lha;")
    public class212 method5155(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field3363 != -1) {
            return class179.method3662(this.field3363).method3274(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3364;
        int[] var7 = this.field3368;
        if (arg0 != null && (arg0.field2214 >= 0 || arg0.field2204 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3368[var8];
            }
            if (arg0.field2214 >= 0) {
                var5 += (long) (arg0.field2214 - this.field3368[5] << 40);
                var7[5] = arg0.field2214;
            }
            if (arg0.field2204 >= 0) {
                var5 += (long) (arg0.field2204 - this.field3368[3] << 48);
                var7[3] = arg0.field2204;
            }
        }
        class212 var9 = (class212) field3369.method4789(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class174.method96(var12 - 256).method3206()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class189.method2643(var12 - 512).method3476(this.field3362)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3365 != -1L) {
                    var9 = (class212) field3369.method4789(this.field3365);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class197[] var13 = new class197[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class197 var17 = class174.method96(var16 - 256).method3207();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class189 var18 = class189.method2643(var16 - 512);
                        class197 var19 = var18.method3520(this.field3362);
                        if (var19 != null) {
                            if (this.field3366 != null) {
                                class169 var20 = this.field3366[var15];
                                if (var20 != null) {
                                    if (var20.field1836 != null && var18.field2134 != null && var18.field2135.length == var20.field1836.length) {
                                        for (int var21 = 0; var21 < var18.field2134.length; var21++) {
                                            var19.method3683(var18.field2135[var21], var20.field1836[var21]);
                                        }
                                    }
                                    if (var20.field1834 != null && var18.field2136 != null && var18.field2137.length == var20.field1834.length) {
                                        for (int var22 = 0; var22 < var18.field2136.length; var22++) {
                                            var19.method3722(var18.field2137[var22], var20.field1834[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class197 var23 = new class197(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3360[var24] < Statics.field4280[var24].length) {
                        var23.method3683(Statics.field1590[var24], Statics.field4280[var24][this.field3360[var24]]);
                    }
                    if (this.field3360[var24] < Statics.field3289[var24].length) {
                        var23.method3683(Statics.field2866[var24], Statics.field3289[var24][this.field3360[var24]]);
                    }
                }
                var9 = var23.method3690(64, 850, -30, -50, -30);
                field3369.method4781(var9, var5);
                this.field3365 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class212 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3575(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3572(var9, arg3);
        } else {
            var25 = arg0.method3572(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ke.m(I)Lgu;")
    public class197 method5156() {
        if (this.field3363 != -1) {
            return class179.method3662(this.field3363).method3277();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3368[var2];
            if (var3 >= 256 && var3 < 512 && !class174.method96(var3 - 256).method3208()) {
                var1 = true;
            }
            if (var3 >= 512 && !class189.method2643(var3 - 512).method3466(this.field3362)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class197[] var4 = new class197[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3368[var6];
            if (var7 >= 256 && var7 < 512) {
                class197 var8 = class174.method96(var7 - 256).method3209();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class197 var9 = class189.method2643(var7 - 512).method3478(this.field3362);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class197 var10 = new class197(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3360[var11] < Statics.field4280[var11].length) {
                var10.method3683(Statics.field1590[var11], Statics.field4280[var11][this.field3360[var11]]);
            }
            if (this.field3360[var11] < Statics.field3289[var11].length) {
                var10.method3683(Statics.field2866[var11], Statics.field3289[var11][this.field3360[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ke.x(B)I")
    public int method5157() {
        return this.field3363 == -1 ? (this.field3368[11] << 5) + (this.field3368[8] << 10) + (this.field3368[0] << 15) + (this.field3360[4] << 20) + (this.field3360[0] << 25) + this.field3368[1] : 305419896 + class179.method3662(this.field3363).field1933;
    }
}
