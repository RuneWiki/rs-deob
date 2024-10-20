package deob;

@ObfuscatedName("kk")
public class class293 {

    @ObfuscatedName("kk.s")
    public int[] field3337;

    @ObfuscatedName("kk.h")
    public int[] field3327;

    @ObfuscatedName("kk.w")
    public boolean field3328;

    @ObfuscatedName("kk.v")
    public int field3329;

    @ObfuscatedName("kk.c")
    public long field3326;

    @ObfuscatedName("kk.q")
    public long field3338;

    @ObfuscatedName("kk.i")
    public class168[] field3330;

    @ObfuscatedName("kk.k")
    public boolean field3333 = false;

    @ObfuscatedName("kk.m")
    public static final int[] field3336 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("kk.u")
    public static class256 field3331 = new class256(260);

    @ObfuscatedName("kk.s([I[Lfx;Z[IZIB)V")
    public void method4934(int[] arg0, class168[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3330 = arg1;
        this.field3333 = arg2;
        this.method4935(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("kk.h([I[IZIB)V")
    public void method4935(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1858; var6++) {
                    class173 var7 = class173.method230(var6);
                    if (var7 != null && !var7.field1853 && var7.field1846 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field3336[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3337 = arg0;
        this.field3327 = arg1;
        this.field3328 = arg2;
        this.field3329 = arg3;
        this.method4941();
    }

    @ObfuscatedName("kk.w(IZI)V")
    public void method4964(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3328) {
            return;
        }
        int var3 = this.field3337[field3336[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class173 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1858) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1858 - 1;
                }
            }
            var4 = class173.method230(var3);
        } while (var4 == null || var4.field1853 || arg0 + (this.field3328 ? 7 : 0) != var4.field1846);
        this.field3337[field3336[arg0]] = var3 + 256;
        this.method4941();
    }

    @ObfuscatedName("kk.v(IZI)V")
    public void method4937(int arg0, boolean arg1) {
        int var3 = this.field3327[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2276[arg0].length) {
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
                    var3 = Statics.field2276[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3327[arg0] = var3;
        this.method4941();
    }

    @ObfuscatedName("kk.c(ZI)V")
    public void method4938(boolean arg0) {
        if (this.field3328 != arg0) {
            this.method4935((int[]) null, this.field3327, arg0, -1);
        }
    }

    @ObfuscatedName("kk.q(Lqr;B)V")
    public void method4939(class444 arg0) {
        arg0.method6912(this.field3328 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3337[field3336[var2]];
            if (var3 == 0) {
                arg0.method6912(-1);
            } else {
                arg0.method6912(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6912(this.field3327[var4]);
        }
    }

    @ObfuscatedName("kk.i(B)V")
    public void method4941() {
        long var1 = this.field3326;
        int var3 = this.field3337[5];
        int var4 = this.field3337[9];
        this.field3337[5] = var4;
        this.field3337[9] = var3;
        this.field3326 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3326 <<= 0x4;
            if (this.field3337[var5] >= 256) {
                this.field3326 += (long) (this.field3337[var5] - 256);
            }
        }
        if (this.field3337[0] >= 256) {
            this.field3326 += (long) (this.field3337[0] - 256 >> 4);
        }
        if (this.field3337[1] >= 256) {
            this.field3326 += (long) (this.field3337[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3326 <<= 0x3;
            this.field3326 += (long) this.field3327[var6];
        }
        this.field3326 <<= 0x1;
        this.field3326 += (long) (this.field3328 ? 1 : 0);
        this.field3337[5] = var3;
        this.field3337[9] = var4;
        if (var1 != 0L && this.field3326 != var1 || this.field3333) {
            field3331.method4608(var1);
        }
    }

    @ObfuscatedName("kk.k(Lgh;ILgh;II)Lhp;")
    public class211 method4965(class190 arg0, int arg1, class190 arg2, int arg3) {
        if (this.field3329 != -1) {
            return class178.method2587(this.field3329).method3070(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3326;
        int[] var7 = this.field3337;
        if (arg0 != null && (arg0.field2160 >= 0 || arg0.field2183 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3337[var8];
            }
            if (arg0.field2160 >= 0) {
                var5 += (long) (arg0.field2160 - this.field3337[5] << 40);
                var7[5] = arg0.field2160;
            }
            if (arg0.field2183 >= 0) {
                var5 += (long) (arg0.field2183 - this.field3337[3] << 48);
                var7[3] = arg0.field2183;
            }
        }
        class211 var9 = (class211) field3331.method4599(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class173.method230(var12 - 256).method3004()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class188.method2231(var12 - 512).method3297(this.field3328)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3338 != -1L) {
                    var9 = (class211) field3331.method4599(this.field3338);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class196[] var13 = new class196[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class196 var17 = class173.method230(var16 - 256).method3002();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class188 var18 = class188.method2231(var16 - 512);
                        class196 var19 = var18.method3298(this.field3328);
                        if (var19 != null) {
                            if (this.field3330 != null) {
                                class168 var20 = this.field3330[var15];
                                if (var20 != null) {
                                    if (var20.field1791 != null && var18.field2100 != null && var18.field2092.length == var20.field1791.length) {
                                        for (int var21 = 0; var21 < var18.field2100.length; var21++) {
                                            var19.method3497(var18.field2092[var21], var20.field1791[var21]);
                                        }
                                    }
                                    if (var20.field1792 != null && var18.field2102 != null && var18.field2103.length == var20.field1792.length) {
                                        for (int var22 = 0; var22 < var18.field2102.length; var22++) {
                                            var19.method3500(var18.field2103[var22], var20.field1792[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class196 var23 = new class196(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3327[var24] < Statics.field2276[var24].length) {
                        var23.method3497(Statics.field3334[var24], Statics.field2276[var24][this.field3327[var24]]);
                    }
                    if (this.field3327[var24] < Statics.field3332[var24].length) {
                        var23.method3497(Statics.field2675[var24], Statics.field3332[var24][this.field3327[var24]]);
                    }
                }
                var9 = var23.method3565(64, 850, -30, -50, -30);
                field3331.method4600(var9, var5);
                this.field3338 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class211 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3385(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3382(var9, arg3);
        } else {
            var25 = arg0.method3382(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("kk.o(B)Lgp;")
    public class196 method4942() {
        if (this.field3329 != -1) {
            return class178.method2587(this.field3329).method3071();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3337[var2];
            if (var3 >= 256 && var3 < 512 && !class173.method230(var3 - 256).method3020()) {
                var1 = true;
            }
            if (var3 >= 512 && !class188.method2231(var3 - 512).method3293(this.field3328)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class196[] var4 = new class196[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3337[var6];
            if (var7 >= 256 && var7 < 512) {
                class196 var8 = class173.method230(var7 - 256).method3031();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class196 var9 = class188.method2231(var7 - 512).method3300(this.field3328);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class196 var10 = new class196(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3327[var11] < Statics.field2276[var11].length) {
                var10.method3497(Statics.field3334[var11], Statics.field2276[var11][this.field3327[var11]]);
            }
            if (this.field3327[var11] < Statics.field3332[var11].length) {
                var10.method3497(Statics.field2675[var11], Statics.field3332[var11][this.field3327[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("kk.n(I)I")
    public int method4943() {
        return this.field3329 == -1 ? (this.field3337[11] << 5) + (this.field3337[8] << 10) + (this.field3337[0] << 15) + (this.field3327[0] << 25) + (this.field3327[4] << 20) + this.field3337[1] : 305419896 + class178.method2587(this.field3329).field1905;
    }
}
