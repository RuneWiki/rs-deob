package deob;

@ObfuscatedName("hs")
public class class214 {

    @ObfuscatedName("hs.w")
    public int[] field2607;

    @ObfuscatedName("hs.s")
    public int[] field2608;

    @ObfuscatedName("hs.q")
    public boolean field2617;

    @ObfuscatedName("hs.o")
    public int field2616;

    @ObfuscatedName("hs.g")
    public long field2611;

    @ObfuscatedName("hs.v")
    public long field2612;

    @ObfuscatedName("hs.z")
    public static final int[] field2619 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hs.n")
    public static class190 field2609 = new class190(260);

    @ObfuscatedName("hs.w([I[IZII)V")
    public void method3736(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3348; var6++) {
                    class248 var7 = class248.method2897(var6);
                    if (var7 != null && !var7.field3357 && var5 + (arg2 ? 7 : 0) == var7.field3350) {
                        arg0[field2619[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2607 = arg0;
        this.field2608 = arg1;
        this.field2617 = arg2;
        this.field2616 = arg3;
        this.method3737();
    }

    @ObfuscatedName("hs.s(IZI)V")
    public void method3735(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2617) {
            return;
        }
        int var3 = this.field2607[field2619[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3348) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3348 - 1;
                }
            }
            var4 = class248.method2897(var3);
        } while (var4 == null || var4.field3357 || var4.field3350 != arg0 + (this.field2617 ? 7 : 0));
        this.field2607[field2619[arg0]] = var3 + 256;
        this.method3737();
    }

    @ObfuscatedName("hs.q(IZI)V")
    public void method3762(int arg0, boolean arg1) {
        int var3 = this.field2608[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2613[arg0].length) {
                    var3 = 0;
                }
            } while (!class215.method2340(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2613[arg0].length - 1;
                }
            } while (!class215.method2340(arg0, var3));
        }
        this.field2608[arg0] = var3;
        this.method3737();
    }

    @ObfuscatedName("hs.o(ZI)V")
    public void method3750(boolean arg0) {
        if (this.field2617 != arg0) {
            this.method3736((int[]) null, this.field2608, arg0, -1);
        }
    }

    @ObfuscatedName("hs.g(Lfz;I)V")
    public void method3748(class174 arg0) {
        arg0.method2955(this.field2617 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2607[field2619[var2]];
            if (var3 == 0) {
                arg0.method2955(-1);
            } else {
                arg0.method2955(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2955(this.field2608[var4]);
        }
    }

    @ObfuscatedName("hs.v(I)V")
    public void method3737() {
        long var1 = this.field2611;
        int var3 = this.field2607[5];
        int var4 = this.field2607[9];
        this.field2607[5] = var4;
        this.field2607[9] = var3;
        this.field2611 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2611 <<= 0x4;
            if (this.field2607[var5] >= 256) {
                this.field2611 += (long) (this.field2607[var5] - 256);
            }
        }
        if (this.field2607[0] >= 256) {
            this.field2611 += (long) (this.field2607[0] - 256 >> 4);
        }
        if (this.field2607[1] >= 256) {
            this.field2611 += (long) (this.field2607[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2611 <<= 0x3;
            this.field2611 += (long) this.field2608[var6];
        }
        this.field2611 <<= 0x1;
        this.field2611 += (long) (this.field2617 ? 1 : 0);
        this.field2607[5] = var3;
        this.field2607[9] = var4;
        if (var1 != 0L && this.field2611 != var1) {
            field2609.method3359(var1);
        }
    }

    @ObfuscatedName("hs.p(Ljt;ILjt;II)Leh;")
    public class132 method3738(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2616 != -1) {
            return class259.method116(this.field2616).method4394(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2611;
        int[] var7 = this.field2607;
        if (arg0 != null && (arg0.field3612 >= 0 || arg0.field3616 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2607[var8];
            }
            if (arg0.field3612 >= 0) {
                var5 += (long) (arg0.field3612 - this.field2607[5] << 40);
                var7[5] = arg0.field3612;
            }
            if (arg0.field3616 >= 0) {
                var5 += (long) (arg0.field3616 - this.field2607[3] << 48);
                var7[3] = arg0.field3616;
            }
        }
        class132 var9 = (class132) field2609.method3357(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method2897(var12 - 256).method4107()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method2694(var12 - 512).method4349(this.field2617)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2612 != -1L) {
                    var9 = (class132) field2609.method3357(this.field2612);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class126[] var13 = new class126[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class126 var17 = class248.method2897(var16 - 256).method4108();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class126 var18 = class257.method2694(var16 - 512).method4384(this.field2617);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class126 var19 = new class126(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2608[var20] < Statics.field2613[var20].length) {
                        var19.method2267(Statics.field2120[var20], Statics.field2613[var20][this.field2608[var20]]);
                    }
                    if (this.field2608[var20] < Statics.field2615[var20].length) {
                        var19.method2267(Statics.field2614[var20], Statics.field2615[var20][this.field2608[var20]]);
                    }
                }
                var9 = var19.method2275(64, 850, -30, -50, -30);
                field2609.method3371(var9, var5);
                this.field2612 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class132 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4450(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4445(var9, arg3);
        } else {
            var21 = arg0.method4445(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hs.e(I)Ldo;")
    public class126 method3739() {
        if (this.field2616 != -1) {
            return class259.method116(this.field2616).method4418();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2607[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method2897(var3 - 256).method4109()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method2694(var3 - 512).method4334(this.field2617)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class126[] var4 = new class126[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2607[var6];
            if (var7 >= 256 && var7 < 512) {
                class126 var8 = class248.method2897(var7 - 256).method4125();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class126 var9 = class257.method2694(var7 - 512).method4347(this.field2617);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class126 var10 = new class126(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2608[var11] < Statics.field2613[var11].length) {
                var10.method2267(Statics.field2120[var11], Statics.field2613[var11][this.field2608[var11]]);
            }
            if (this.field2608[var11] < Statics.field2615[var11].length) {
                var10.method2267(Statics.field2614[var11], Statics.field2615[var11][this.field2608[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hs.d(B)I")
    public int method3740() {
        return this.field2616 == -1 ? (this.field2607[11] << 5) + (this.field2607[8] << 10) + (this.field2607[0] << 15) + (this.field2608[4] << 20) + (this.field2608[0] << 25) + this.field2607[1] : 305419896 + class259.method116(this.field2616).field3554;
    }
}
