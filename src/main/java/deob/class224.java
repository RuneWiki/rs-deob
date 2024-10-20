package deob;

@ObfuscatedName("hv")
public class class224 {

    @ObfuscatedName("hv.m")
    public int[] field2571;

    @ObfuscatedName("hv.o")
    public int[] field2579;

    @ObfuscatedName("hv.q")
    public boolean field2578;

    @ObfuscatedName("hv.j")
    public int field2572;

    @ObfuscatedName("hv.p")
    public long field2573;

    @ObfuscatedName("hv.g")
    public long field2574;

    @ObfuscatedName("hv.w")
    public static final int[] field2577 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hv.y")
    public static class155 field2569 = new class155(260);

    @ObfuscatedName("hv.m([I[IZIB)V")
    public void method3763(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3304; var6++) {
                    class256 var7 = class256.method693(var6);
                    if (var7 != null && !var7.field3307 && var7.field3300 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2577[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2571 = arg0;
        this.field2579 = arg1;
        this.field2578 = arg2;
        this.field2572 = arg3;
        this.method3734();
    }

    @ObfuscatedName("hv.o(IZI)V")
    public void method3735(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2578) {
            return;
        }
        int var3 = this.field2571[field2577[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class256 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3304) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3304 - 1;
                }
            }
            var4 = class256.method693(var3);
        } while (var4 == null || var4.field3307 || arg0 + (this.field2578 ? 7 : 0) != var4.field3300);
        this.field2571[field2577[arg0]] = var3 + 256;
        this.method3734();
    }

    @ObfuscatedName("hv.q(IZI)V")
    public void method3736(int arg0, boolean arg1) {
        int var3 = this.field2579[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2576[arg0].length) {
                    var3 = 0;
                }
            } while (!class225.method538(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2576[arg0].length - 1;
                }
            } while (!class225.method538(arg0, var3));
        }
        this.field2579[arg0] = var3;
        this.method3734();
    }

    @ObfuscatedName("hv.j(ZB)V")
    public void method3737(boolean arg0) {
        if (this.field2578 != arg0) {
            this.method3763((int[]) null, this.field2579, arg0, -1);
        }
    }

    @ObfuscatedName("hv.p(Lkn;I)V")
    public void method3738(class310 arg0) {
        arg0.method5437(this.field2578 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2571[field2577[var2]];
            if (var3 == 0) {
                arg0.method5437(-1);
            } else {
                arg0.method5437(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5437(this.field2579[var4]);
        }
    }

    @ObfuscatedName("hv.g(I)V")
    public void method3734() {
        long var1 = this.field2573;
        int var3 = this.field2571[5];
        int var4 = this.field2571[9];
        this.field2571[5] = var4;
        this.field2571[9] = var3;
        this.field2573 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2573 <<= 0x4;
            if (this.field2571[var5] >= 256) {
                this.field2573 += (long) (this.field2571[var5] - 256);
            }
        }
        if (this.field2571[0] >= 256) {
            this.field2573 += (long) (this.field2571[0] - 256 >> 4);
        }
        if (this.field2571[1] >= 256) {
            this.field2573 += (long) (this.field2571[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2573 <<= 0x3;
            this.field2573 += (long) this.field2579[var6];
        }
        this.field2573 <<= 0x1;
        this.field2573 += (long) (this.field2578 ? 1 : 0);
        this.field2571[5] = var3;
        this.field2571[9] = var4;
        if (var1 != 0L && this.field2573 != var1) {
            field2569.method3128(var1);
        }
    }

    @ObfuscatedName("hv.n(Ljm;ILjm;IB)Lef;")
    public class137 method3740(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field2572 != -1) {
            return class267.method3880(this.field2572).method4470(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2573;
        int[] var7 = this.field2571;
        if (arg0 != null && (arg0.field3557 >= 0 || arg0.field3558 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2571[var8];
            }
            if (arg0.field3557 >= 0) {
                var5 += (long) (arg0.field3557 - this.field2571[5] << 40);
                var7[5] = arg0.field3557;
            }
            if (arg0.field3558 >= 0) {
                var5 += (long) (arg0.field3558 - this.field2571[3] << 48);
                var7[3] = arg0.field3558;
            }
        }
        class137 var9 = (class137) field2569.method3127(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class256.method693(var12 - 256).method4188()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class265.method4218(var12 - 512).method4407(this.field2578)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2574 != -1L) {
                    var9 = (class137) field2569.method3127(this.field2574);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class131[] var13 = new class131[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class131 var17 = class256.method693(var16 - 256).method4189();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class265.method4218(var16 - 512).method4408(this.field2578);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2579[var20] < Statics.field2576[var20].length) {
                        var19.method2639(Statics.field2575[var20], Statics.field2576[var20][this.field2579[var20]]);
                    }
                    if (this.field2579[var20] < Statics.field1309[var20].length) {
                        var19.method2639(Statics.field2570[var20], Statics.field1309[var20][this.field2579[var20]]);
                    }
                }
                var9 = var19.method2619(64, 850, -30, -50, -30);
                field2569.method3137(var9, var5);
                this.field2574 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4536(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4521(var9, arg3);
        } else {
            var21 = arg0.method4521(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hv.u(I)Lek;")
    public class131 method3762() {
        if (this.field2572 != -1) {
            return class267.method3880(this.field2572).method4471();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2571[var2];
            if (var3 >= 256 && var3 < 512 && !class256.method693(var3 - 256).method4205()) {
                var1 = true;
            }
            if (var3 >= 512 && !class265.method4218(var3 - 512).method4409(this.field2578)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2571[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = class256.method693(var7 - 256).method4185();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class265.method4218(var7 - 512).method4410(this.field2578);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2579[var11] < Statics.field2576[var11].length) {
                var10.method2639(Statics.field2575[var11], Statics.field2576[var11][this.field2579[var11]]);
            }
            if (this.field2579[var11] < Statics.field1309[var11].length) {
                var10.method2639(Statics.field2570[var11], Statics.field1309[var11][this.field2579[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hv.a(B)I")
    public int method3742() {
        return this.field2572 == -1 ? (this.field2571[11] << 5) + (this.field2571[8] << 10) + (this.field2571[0] << 15) + (this.field2579[4] << 20) + (this.field2579[0] << 25) + this.field2571[1] : 305419896 + class267.method3880(this.field2572).field3505;
    }

    @ObfuscatedName("cn.z(S)V")
    public static void method1813() {
        field2569.method3130();
    }
}
