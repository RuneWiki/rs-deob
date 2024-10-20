package deob;

@ObfuscatedName("kp")
public class class293 {

    @ObfuscatedName("kp.o")
    public int[] field3371;

    @ObfuscatedName("kp.q")
    public int[] field3360;

    @ObfuscatedName("kp.l")
    public boolean field3361;

    @ObfuscatedName("kp.k")
    public int field3362;

    @ObfuscatedName("kp.a")
    public long field3363;

    @ObfuscatedName("kp.m")
    public long field3369;

    @ObfuscatedName("kp.p")
    public class169[] field3365;

    @ObfuscatedName("kp.s")
    public boolean field3366 = false;

    @ObfuscatedName("kp.w")
    public static final int[] field3368 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("kp.b")
    public static class257 field3364 = new class257(260);

    @ObfuscatedName("kp.o([I[Lfn;Z[IZII)V")
    public void method4936(int[] arg0, class169[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3365 = arg1;
        this.field3366 = arg2;
        this.method4957(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("kp.q([I[IZII)V")
    public void method4957(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1699; var6++) {
                    class174 var7 = class174.method1855(var6);
                    if (var7 != null && !var7.field1904 && var7.field1897 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field3368[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3371 = arg0;
        this.field3360 = arg1;
        this.field3361 = arg2;
        this.field3362 = arg3;
        this.method4956();
    }

    @ObfuscatedName("kp.l(IZI)V")
    public void method4964(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3361) {
            return;
        }
        int var3 = this.field3371[field3368[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class174 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1699) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1699 - 1;
                }
            }
            var4 = class174.method1855(var3);
        } while (var4 == null || var4.field1904 || (this.field3361 ? 7 : 0) + arg0 != var4.field1897);
        this.field3371[field3368[arg0]] = var3 + 256;
        this.method4956();
    }

    @ObfuscatedName("kp.k(IZI)V")
    public void method4935(int arg0, boolean arg1) {
        int var3 = this.field3360[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field4470[arg0].length) {
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
                    var3 = Statics.field4470[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3360[arg0] = var3;
        this.method4956();
    }

    @ObfuscatedName("kp.a(ZB)V")
    public void method4940(boolean arg0) {
        if (this.field3361 != arg0) {
            this.method4957((int[]) null, this.field3360, arg0, -1);
        }
    }

    @ObfuscatedName("kp.m(Lpx;I)V")
    public void method4941(class440 arg0) {
        arg0.method6876(this.field3361 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3371[field3368[var2]];
            if (var3 == 0) {
                arg0.method6876(-1);
            } else {
                arg0.method6876(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6876(this.field3360[var4]);
        }
    }

    @ObfuscatedName("kp.p(B)V")
    public void method4956() {
        long var1 = this.field3363;
        int var3 = this.field3371[5];
        int var4 = this.field3371[9];
        this.field3371[5] = var4;
        this.field3371[9] = var3;
        this.field3363 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3363 <<= 0x4;
            if (this.field3371[var5] >= 256) {
                this.field3363 += (long) (this.field3371[var5] - 256);
            }
        }
        if (this.field3371[0] >= 256) {
            this.field3363 += (long) (this.field3371[0] - 256 >> 4);
        }
        if (this.field3371[1] >= 256) {
            this.field3363 += (long) (this.field3371[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3363 <<= 0x3;
            this.field3363 += (long) this.field3360[var6];
        }
        this.field3363 <<= 0x1;
        this.field3363 += (long) (this.field3361 ? 1 : 0);
        this.field3371[5] = var3;
        this.field3371[9] = var4;
        if (var1 != 0L && this.field3363 != var1 || this.field3366) {
            field3364.method4567(var1);
        }
    }

    @ObfuscatedName("kp.s(Lgq;ILgq;IB)Lhv;")
    public class212 method4943(class191 arg0, int arg1, class191 arg2, int arg3) {
        if (this.field3362 != -1) {
            return class179.method4396(this.field3362).method3117(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3363;
        int[] var7 = this.field3371;
        if (arg0 != null && (arg0.field2226 >= 0 || arg0.field2220 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3371[var8];
            }
            if (arg0.field2226 >= 0) {
                var5 += (long) (arg0.field2226 - this.field3371[5] << 40);
                var7[5] = arg0.field2226;
            }
            if (arg0.field2220 >= 0) {
                var5 += (long) (arg0.field2220 - this.field3371[3] << 48);
                var7[3] = arg0.field2220;
            }
        }
        class212 var9 = (class212) field3364.method4566(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class174.method1855(var12 - 256).method3041()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class189.method2903(var12 - 512).method3334(this.field3361)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3369 != -1L) {
                    var9 = (class212) field3364.method4566(this.field3369);
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
                        class197 var17 = class174.method1855(var16 - 256).method3042();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class189 var18 = class189.method2903(var16 - 512);
                        class197 var19 = var18.method3335(this.field3361);
                        if (var19 != null) {
                            if (this.field3365 != null) {
                                class169 var20 = this.field3365[var15];
                                if (var20 != null) {
                                    if (var20.field1848 != null && var18.field2145 != null && var18.field2157.length == var20.field1848.length) {
                                        for (int var21 = 0; var21 < var18.field2145.length; var21++) {
                                            var19.method3574(var18.field2157[var21], var20.field1848[var21]);
                                        }
                                    }
                                    if (var20.field1845 != null && var18.field2185 != null && var18.field2148.length == var20.field1845.length) {
                                        for (int var22 = 0; var22 < var18.field2185.length; var22++) {
                                            var19.method3523(var18.field2148[var22], var20.field1845[var22]);
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
                    if (this.field3360[var24] < Statics.field4470[var24].length) {
                        var23.method3574(Statics.field3353[var24], Statics.field4470[var24][this.field3360[var24]]);
                    }
                    if (this.field3360[var24] < Statics.field3367[var24].length) {
                        var23.method3574(Statics.field4157[var24], Statics.field3367[var24][this.field3360[var24]]);
                    }
                }
                var9 = var23.method3530(64, 850, -30, -50, -30);
                field3364.method4571(var9, var5);
                this.field3369 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class212 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3430(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3431(var9, arg3);
        } else {
            var25 = arg0.method3431(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("kp.r(B)Lgs;")
    public class197 method4944() {
        if (this.field3362 != -1) {
            return class179.method4396(this.field3362).method3114();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3371[var2];
            if (var3 >= 256 && var3 < 512 && !class174.method1855(var3 - 256).method3046()) {
                var1 = true;
            }
            if (var3 >= 512 && !class189.method2903(var3 - 512).method3336(this.field3361)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class197[] var4 = new class197[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3371[var6];
            if (var7 >= 256 && var7 < 512) {
                class197 var8 = class174.method1855(var7 - 256).method3044();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class197 var9 = class189.method2903(var7 - 512).method3337(this.field3361);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class197 var10 = new class197(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3360[var11] < Statics.field4470[var11].length) {
                var10.method3574(Statics.field3353[var11], Statics.field4470[var11][this.field3360[var11]]);
            }
            if (this.field3360[var11] < Statics.field3367[var11].length) {
                var10.method3574(Statics.field4157[var11], Statics.field3367[var11][this.field3360[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("kp.v(I)I")
    public int method4945() {
        return this.field3362 == -1 ? (this.field3371[11] << 5) + (this.field3371[8] << 10) + (this.field3371[0] << 15) + (this.field3360[0] << 25) + (this.field3360[4] << 20) + this.field3371[1] : 305419896 + class179.method4396(this.field3362).field1974;
    }
}
