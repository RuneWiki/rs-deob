package deob;

@ObfuscatedName("ho")
public class class230 {

    @ObfuscatedName("ho.f")
    public int[] field2642;

    @ObfuscatedName("ho.l")
    public int[] field2637;

    @ObfuscatedName("ho.w")
    public boolean field2644;

    @ObfuscatedName("ho.s")
    public int field2639;

    @ObfuscatedName("ho.e")
    public long field2640;

    @ObfuscatedName("ho.a")
    public long field2638;

    @ObfuscatedName("ho.d")
    public static final int[] field2645 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ho.z")
    public static class203 field2646 = new class203(260);

    @ObfuscatedName("ho.f([I[IZIB)V")
    public void method4175(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3358; var6++) {
                    class263 var7 = Statics.method3560(var6);
                    if (var7 != null && !var7.field3368 && var7.field3359 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2645[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2642 = arg0;
        this.field2637 = arg1;
        this.field2644 = arg2;
        this.field2639 = arg3;
        this.method4162();
    }

    @ObfuscatedName("ho.l(IZI)V")
    public void method4185(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2644) {
            return;
        }
        int var3 = this.field2642[field2645[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class263 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3358) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3358 - 1;
                }
            }
            var4 = Statics.method3560(var3);
        } while (var4 == null || var4.field3368 || arg0 + (this.field2644 ? 7 : 0) != var4.field3359);
        this.field2642[field2645[arg0]] = var3 + 256;
        this.method4162();
    }

    @ObfuscatedName("ho.w(IZB)V")
    public void method4154(int arg0, boolean arg1) {
        int var3 = this.field2637[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2643[arg0].length) {
                    var3 = 0;
                }
            } while (!class231.method3088(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2643[arg0].length - 1;
                }
            } while (!class231.method3088(arg0, var3));
        }
        this.field2637[arg0] = var3;
        this.method4162();
    }

    @ObfuscatedName("ho.s(ZI)V")
    public void method4157(boolean arg0) {
        if (this.field2644 != arg0) {
            this.method4175((int[]) null, this.field2637, arg0, -1);
        }
    }

    @ObfuscatedName("ho.e(Lgm;B)V")
    public void method4159(class185 arg0) {
        arg0.method3376(this.field2644 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2642[field2645[var2]];
            if (var3 == 0) {
                arg0.method3376(-1);
            } else {
                arg0.method3376(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3376(this.field2637[var4]);
        }
    }

    @ObfuscatedName("ho.c(I)V")
    public void method4162() {
        long var1 = this.field2640;
        int var3 = this.field2642[5];
        int var4 = this.field2642[9];
        this.field2642[5] = var4;
        this.field2642[9] = var3;
        this.field2640 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2640 <<= 0x4;
            if (this.field2642[var5] >= 256) {
                this.field2640 += (long) (this.field2642[var5] - 256);
            }
        }
        if (this.field2642[0] >= 256) {
            this.field2640 += (long) (this.field2642[0] - 256 >> 4);
        }
        if (this.field2642[1] >= 256) {
            this.field2640 += (long) (this.field2642[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2640 <<= 0x3;
            this.field2640 += (long) this.field2637[var6];
        }
        this.field2640 <<= 0x1;
        this.field2640 += (long) (this.field2644 ? 1 : 0);
        this.field2642[5] = var3;
        this.field2642[9] = var4;
        if (var1 != 0L && this.field2640 != var1) {
            field2646.method3738(var1);
        }
    }

    @ObfuscatedName("ho.p(Ljw;ILjw;II)Lds;")
    public class122 method4160(class276 arg0, int arg1, class276 arg2, int arg3) {
        if (this.field2639 != -1) {
            return class274.method187(this.field2639).method4849(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2640;
        int[] var7 = this.field2642;
        if (arg0 != null && (arg0.field3628 >= 0 || arg0.field3624 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2642[var8];
            }
            if (arg0.field3628 >= 0) {
                var5 += (long) (arg0.field3628 - this.field2642[5] << 40);
                var7[5] = arg0.field3628;
            }
            if (arg0.field3624 >= 0) {
                var5 += (long) (arg0.field3624 - this.field2642[3] << 48);
                var7[3] = arg0.field3624;
            }
        }
        class122 var9 = (class122) field2646.method3737(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method3560(var12 - 256).method4572()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class272.method92(var12 - 512).method4772(this.field2644)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2638 != -1L) {
                    var9 = (class122) field2646.method3737(this.field2638);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class116[] var13 = new class116[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class116 var17 = Statics.method3560(var16 - 256).method4573();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class116 var18 = class272.method92(var16 - 512).method4773(this.field2644);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class116 var19 = new class116(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2637[var20] < Statics.field2643[var20].length) {
                        var19.method2447(Statics.field2636[var20], Statics.field2643[var20][this.field2637[var20]]);
                    }
                    if (this.field2637[var20] < Statics.field56[var20].length) {
                        var19.method2447(Statics.field2641[var20], Statics.field56[var20][this.field2637[var20]]);
                    }
                }
                var9 = var19.method2468(64, 850, -30, -50, -30);
                field2646.method3744(var9, var5);
                this.field2638 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class122 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4927(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4904(var9, arg3);
        } else {
            var21 = arg0.method4904(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ho.r(B)Ldb;")
    public class116 method4161() {
        if (this.field2639 != -1) {
            return class274.method187(this.field2639).method4878();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2642[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method3560(var3 - 256).method4574()) {
                var1 = true;
            }
            if (var3 >= 512 && !class272.method92(var3 - 512).method4763(this.field2644)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class116[] var4 = new class116[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2642[var6];
            if (var7 >= 256 && var7 < 512) {
                class116 var8 = Statics.method3560(var7 - 256).method4592();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class116 var9 = class272.method92(var7 - 512).method4775(this.field2644);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class116 var10 = new class116(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2637[var11] < Statics.field2643[var11].length) {
                var10.method2447(Statics.field2636[var11], Statics.field2643[var11][this.field2637[var11]]);
            }
            if (this.field2637[var11] < Statics.field56[var11].length) {
                var10.method2447(Statics.field2641[var11], Statics.field56[var11][this.field2637[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ho.m(I)I")
    public int method4169() {
        return this.field2639 == -1 ? (this.field2642[11] << 5) + (this.field2642[8] << 10) + (this.field2642[0] << 15) + (this.field2637[0] << 25) + (this.field2637[4] << 20) + this.field2642[1] : 305419896 + class274.method187(this.field2639).field3578;
    }
}
