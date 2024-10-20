package deob;

@ObfuscatedName("hk")
public class class224 {

    @ObfuscatedName("hk.x")
    public int[] field2541;

    @ObfuscatedName("hk.m")
    public int[] field2534;

    @ObfuscatedName("hk.k")
    public boolean field2543;

    @ObfuscatedName("hk.d")
    public int field2538;

    @ObfuscatedName("hk.w")
    public long field2535;

    @ObfuscatedName("hk.v")
    public long field2539;

    @ObfuscatedName("hk.s")
    public static final int[] field2542 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hk.p")
    public static class155 field2537 = new class155(260);

    @ObfuscatedName("hk.x([I[IZII)V")
    public void method3737(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3261; var6++) {
                    class256 var7 = class256.method4093(var6);
                    if (var7 != null && !var7.field3271 && var7.field3264 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2542[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2541 = arg0;
        this.field2534 = arg1;
        this.field2543 = arg2;
        this.field2538 = arg3;
        this.method3725();
    }

    @ObfuscatedName("hk.m(IZI)V")
    public void method3721(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2543) {
            return;
        }
        int var3 = this.field2541[field2542[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class256 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3261) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3261 - 1;
                }
            }
            var4 = class256.method4093(var3);
        } while (var4 == null || var4.field3271 || arg0 + (this.field2543 ? 7 : 0) != var4.field3264);
        this.field2541[field2542[arg0]] = var3 + 256;
        this.method3725();
    }

    @ObfuscatedName("hk.k(IZI)V")
    public void method3722(int arg0, boolean arg1) {
        int var3 = this.field2534[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1765[arg0].length) {
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
                    var3 = Statics.field1765[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2534[arg0] = var3;
        this.method3725();
    }

    @ObfuscatedName("hk.d(ZI)V")
    public void method3723(boolean arg0) {
        if (this.field2543 != arg0) {
            this.method3737((int[]) null, this.field2534, arg0, -1);
        }
    }

    @ObfuscatedName("hk.w(Lkb;I)V")
    public void method3724(class310 arg0) {
        arg0.method5121(this.field2543 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2541[field2542[var2]];
            if (var3 == 0) {
                arg0.method5121(-1);
            } else {
                arg0.method5121(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method5121(this.field2534[var4]);
        }
    }

    @ObfuscatedName("hk.v(B)V")
    public void method3725() {
        long var1 = this.field2535;
        int var3 = this.field2541[5];
        int var4 = this.field2541[9];
        this.field2541[5] = var4;
        this.field2541[9] = var3;
        this.field2535 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2535 <<= 0x4;
            if (this.field2541[var5] >= 256) {
                this.field2535 += (long) (this.field2541[var5] - 256);
            }
        }
        if (this.field2541[0] >= 256) {
            this.field2535 += (long) (this.field2541[0] - 256 >> 4);
        }
        if (this.field2541[1] >= 256) {
            this.field2535 += (long) (this.field2541[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2535 <<= 0x3;
            this.field2535 += (long) this.field2534[var6];
        }
        this.field2535 <<= 0x1;
        this.field2535 += (long) (this.field2543 ? 1 : 0);
        this.field2541[5] = var3;
        this.field2541[9] = var4;
        if (var1 != 0L && this.field2535 != var1) {
            field2537.method3139(var1);
        }
    }

    @ObfuscatedName("hk.q(Ljc;ILjc;II)Lel;")
    public class137 method3726(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field2538 != -1) {
            return class267.method3854(this.field2538).method4392(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2535;
        int[] var7 = this.field2541;
        if (arg0 != null && (arg0.field3511 >= 0 || arg0.field3522 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2541[var8];
            }
            if (arg0.field3511 >= 0) {
                var5 += (long) (arg0.field3511 - this.field2541[5] << 40);
                var7[5] = arg0.field3511;
            }
            if (arg0.field3522 >= 0) {
                var5 += (long) (arg0.field3522 - this.field2541[3] << 48);
                var7[3] = arg0.field3522;
            }
        }
        class137 var9 = (class137) field2537.method3146(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class256.method4093(var12 - 256).method4129()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class265.method337(var12 - 512).method4329(this.field2543)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2539 != -1L) {
                    var9 = (class137) field2537.method3146(this.field2539);
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
                        class131 var17 = class256.method4093(var16 - 256).method4130();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class131 var18 = class265.method337(var16 - 512).method4330(this.field2543);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class131 var19 = new class131(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2534[var20] < Statics.field1765[var20].length) {
                        var19.method2629(Statics.field279[var20], Statics.field1765[var20][this.field2534[var20]]);
                    }
                    if (this.field2534[var20] < Statics.field2536[var20].length) {
                        var19.method2629(Statics.field2540[var20], Statics.field2536[var20][this.field2534[var20]]);
                    }
                }
                var9 = var19.method2636(64, 850, -30, -50, -30);
                field2537.method3152(var9, var5);
                this.field2539 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class137 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4451(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4448(var9, arg3);
        } else {
            var21 = arg0.method4448(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hk.z(S)Lea;")
    public class131 method3727() {
        if (this.field2538 != -1) {
            return class267.method3854(this.field2538).method4388();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2541[var2];
            if (var3 >= 256 && var3 < 512 && !class256.method4093(var3 - 256).method4131()) {
                var1 = true;
            }
            if (var3 >= 512 && !class265.method337(var3 - 512).method4380(this.field2543)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class131[] var4 = new class131[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2541[var6];
            if (var7 >= 256 && var7 < 512) {
                class131 var8 = class256.method4093(var7 - 256).method4132();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class131 var9 = class265.method337(var7 - 512).method4332(this.field2543);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class131 var10 = new class131(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2534[var11] < Statics.field1765[var11].length) {
                var10.method2629(Statics.field279[var11], Statics.field1765[var11][this.field2534[var11]]);
            }
            if (this.field2534[var11] < Statics.field2536[var11].length) {
                var10.method2629(Statics.field2540[var11], Statics.field2536[var11][this.field2534[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hk.t(I)I")
    public int method3728() {
        return this.field2538 == -1 ? (this.field2541[11] << 5) + (this.field2541[8] << 10) + (this.field2541[0] << 15) + (this.field2534[0] << 25) + (this.field2534[4] << 20) + this.field2541[1] : 305419896 + class267.method3854(this.field2538).field3465;
    }

    @ObfuscatedName("hb.e(I)V")
    public static void method3681() {
        field2537.method3141();
    }
}
