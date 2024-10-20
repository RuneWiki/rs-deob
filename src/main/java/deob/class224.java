package deob;

@ObfuscatedName("ha")
public class class224 {

    @ObfuscatedName("ha.z")
    public int[] field2575;

    @ObfuscatedName("ha.k")
    public int[] field2571;

    @ObfuscatedName("ha.s")
    public boolean field2572;

    @ObfuscatedName("ha.t")
    public int field2573;

    @ObfuscatedName("ha.i")
    public long field2574;

    @ObfuscatedName("ha.o")
    public long field2576;

    @ObfuscatedName("ha.n")
    public static final int[] field2570 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ha.d")
    public static class155 field2577 = new class155(260);

    @ObfuscatedName("ha.z([I[IZII)V")
    public void method3742(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3292; var6++) {
                    class256 var7 = class256.method1799(var6);
                    if (var7 != null && !var7.field3299 && (arg2 ? 7 : 0) + var5 == var7.field3293) {
                        arg0[field2570[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2575 = arg0;
        this.field2571 = arg1;
        this.field2572 = arg2;
        this.field2573 = arg3;
        this.method3746();
    }

    @ObfuscatedName("ha.k(IZB)V")
    public void method3766(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2572) {
            return;
        }
        int var3 = this.field2575[field2570[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class256 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3292) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3292 - 1;
                }
            }
            var4 = class256.method1799(var3);
        } while (var4 == null || var4.field3299 || var4.field3293 != arg0 + (this.field2572 ? 7 : 0));
        this.field2575[field2570[arg0]] = var3 + 256;
        this.method3746();
    }

    @ObfuscatedName("ha.s(IZI)V")
    public void method3756(int arg0, boolean arg1) {
        int var3 = this.field2571[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field254[arg0].length) {
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
                    var3 = Statics.field254[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2571[arg0] = var3;
        this.method3746();
    }

    @ObfuscatedName("ha.t(ZI)V")
    public void method3747(boolean arg0) {
        if (this.field2572 != arg0) {
            this.method3742((int[]) null, this.field2571, arg0, -1);
        }
    }

    @ObfuscatedName("ha.i(Lkf;I)V")
    public void method3745(class310 arg0) {
        arg0.method5177(this.field2572 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2575[field2570[var2]];
            if (var3 == 0) {
                arg0.method5177(-1);
            } else {
                arg0.method5177(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5177(this.field2571[var4]);
        }
    }

    @ObfuscatedName("ha.o(B)V")
    public void method3746() {
        long var1 = this.field2574;
        int var3 = this.field2575[5];
        int var4 = this.field2575[9];
        this.field2575[5] = var4;
        this.field2575[9] = var3;
        this.field2574 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2574 <<= 0x4;
            if (this.field2575[var5] >= 256) {
                this.field2574 += (long) (this.field2575[var5] - 256);
            }
        }
        if (this.field2575[0] >= 256) {
            this.field2574 += (long) (this.field2575[0] - 256 >> 4);
        }
        if (this.field2575[1] >= 256) {
            this.field2574 += (long) (this.field2575[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2574 <<= 0x3;
            this.field2574 += (long) this.field2571[var6];
        }
        this.field2574 <<= 0x1;
        this.field2574 += (long) (this.field2572 ? 1 : 0);
        this.field2575[5] = var3;
        this.field2575[9] = var4;
        if (var1 != 0L && this.field2574 != var1) {
            field2577.method3182(var1);
        }
    }

    @ObfuscatedName("ha.x(Ljm;ILjm;IB)Ler;")
    public class137 method3761(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field2573 != -1) {
            return class267.method2944(this.field2573).method4449(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2574;
        int[] var7 = this.field2575;
        if (arg0 != null && (arg0.field3547 >= 0 || arg0.field3548 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2575[var8];
            }
            if (arg0.field3547 >= 0) {
                var5 += (long) (arg0.field3547 - this.field2575[5] << 40);
                var7[5] = arg0.field3547;
            }
            if (arg0.field3548 >= 0) {
                var5 += (long) (arg0.field3548 - this.field2575[3] << 48);
                var7[3] = arg0.field3548;
            }
        }
        class137 var9 = (class137) field2577.method3170(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class256.method1799(var12 - 256).method4153()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class265.method136(var12 - 512).method4375(this.field2572)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2576 != -1L) {
                    var9 = (class137) field2577.method3170(this.field2576);
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
                        class131 var17 = class256.method1799(var16 - 256).method4156();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class265.method136(var16 - 512).method4376(this.field2572);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2571[var20] < Statics.field254[var20].length) {
                        var19.method2691(Statics.field2536[var20], Statics.field254[var20][this.field2571[var20]]);
                    }
                    if (this.field2571[var20] < Statics.field2022[var20].length) {
                        var19.method2691(Statics.field84[var20], Statics.field2022[var20][this.field2571[var20]]);
                    }
                }
                var9 = var19.method2656(64, 850, -30, -50, -30);
                field2577.method3169(var9, var5);
                this.field2576 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4505(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4502(var9, arg3);
        } else {
            var21 = arg0.method4502(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ha.w(I)Lee;")
    public class131 method3748() {
        if (this.field2573 != -1) {
            return class267.method2944(this.field2573).method4450();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2575[var2];
            if (var3 >= 256 && var3 < 512 && !class256.method1799(var3 - 256).method4159()) {
                var1 = true;
            }
            if (var3 >= 512 && !class265.method136(var3 - 512).method4421(this.field2572)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2575[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = class256.method1799(var7 - 256).method4161();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class265.method136(var7 - 512).method4378(this.field2572);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2571[var11] < Statics.field254[var11].length) {
                var10.method2691(Statics.field2536[var11], Statics.field254[var11][this.field2571[var11]]);
            }
            if (this.field2571[var11] < Statics.field2022[var11].length) {
                var10.method2691(Statics.field84[var11], Statics.field2022[var11][this.field2571[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ha.g(I)I")
    public int method3749() {
        return this.field2573 == -1 ? (this.field2575[11] << 5) + (this.field2575[8] << 10) + (this.field2575[0] << 15) + (this.field2571[0] << 25) + (this.field2571[4] << 20) + this.field2575[1] : 305419896 + class267.method2944(this.field2573).field3489;
    }
}
