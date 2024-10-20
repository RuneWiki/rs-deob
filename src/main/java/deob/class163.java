package deob;

@ObfuscatedName("fx")
public class class163 {

    @ObfuscatedName("fx.y")
    public int[] field2739;

    @ObfuscatedName("fx.m")
    public int[] field2730;

    @ObfuscatedName("fx.d")
    public boolean field2737;

    @ObfuscatedName("fx.k")
    public int field2731;

    @ObfuscatedName("fx.n")
    public long field2732;

    @ObfuscatedName("fx.s")
    public long field2733;

    @ObfuscatedName("fx.l")
    public static final int[] field2728 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fx.i")
    public static class170 field2736 = new class170(260);

    @ObfuscatedName("fx.y([I[IZII)V")
    public void method3197(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field907; var6++) {
                    class36 var7 = class36.method1543(var6);
                    if (var7 != null && !var7.field917 && var7.field909 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2728[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2739 = arg0;
        this.field2730 = arg1;
        this.field2737 = arg2;
        this.field2731 = arg3;
        this.method3202();
    }

    @ObfuscatedName("fx.m(IZI)V")
    public void method3198(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2737) {
            return;
        }
        int var3 = this.field2739[field2728[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field907) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field907 - 1;
                }
            }
            var4 = class36.method1543(var3);
        } while (var4 == null || var4.field917 || var4.field909 != arg0 + (this.field2737 ? 7 : 0));
        this.field2739[field2728[arg0]] = var3 + 256;
        this.method3202();
    }

    @ObfuscatedName("fx.d(IZB)V")
    public void method3208(int arg0, boolean arg1) {
        int var3 = this.field2730[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2566[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2566[arg0].length - 1;
            }
        }
        this.field2730[arg0] = var3;
        this.method3202();
    }

    @ObfuscatedName("fx.k(ZI)V")
    public void method3200(boolean arg0) {
        if (this.field2737 != arg0) {
            this.method3197((int[]) null, this.field2730, arg0, -1);
        }
    }

    @ObfuscatedName("fx.n(Ldp;B)V")
    public void method3199(class127 arg0) {
        arg0.method2444(this.field2737 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2739[field2728[var2]];
            if (var3 == 0) {
                arg0.method2444(-1);
            } else {
                arg0.method2444(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2444(this.field2730[var4]);
        }
    }

    @ObfuscatedName("fx.s(I)V")
    public void method3202() {
        long var1 = this.field2732;
        int var3 = this.field2739[5];
        int var4 = this.field2739[9];
        this.field2739[5] = var4;
        this.field2739[9] = var3;
        this.field2732 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2732 <<= 0x4;
            if (this.field2739[var5] >= 256) {
                this.field2732 += (long) (this.field2739[var5] - 256);
            }
        }
        if (this.field2739[0] >= 256) {
            this.field2732 += (long) (this.field2739[0] - 256 >> 4);
        }
        if (this.field2739[1] >= 256) {
            this.field2732 += (long) (this.field2739[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2732 <<= 0x3;
            this.field2732 += (long) this.field2730[var6];
        }
        this.field2732 <<= 0x1;
        this.field2732 += (long) (this.field2737 ? 1 : 0);
        this.field2739[5] = var3;
        this.field2739[9] = var4;
        if (var1 != 0L && this.field2732 != var1) {
            field2736.method3289(var1);
        }
    }

    @ObfuscatedName("fx.x(Laq;ILaq;II)Ldw;")
    public class112 method3203(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2731 != -1) {
            return class31.method208(this.field2731).method603(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2732;
        int[] var7 = this.field2739;
        if (arg0 != null && (arg0.field869 >= 0 || arg0.field875 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2739[var8];
            }
            if (arg0.field869 >= 0) {
                var5 += (long) (arg0.field869 - this.field2739[5] << 40);
                var7[5] = arg0.field869;
            }
            if (arg0.field875 >= 0) {
                var5 += (long) (arg0.field875 - this.field2739[3] << 48);
                var7[3] = arg0.field875;
            }
        }
        class112 var9 = (class112) field2736.method3288(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1543(var12 - 256).method775()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method30(var12 - 512).method850(this.field2737)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2733 != -1L) {
                    var9 = (class112) field2736.method3288(this.field2733);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class101[] var13 = new class101[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class101 var17 = class36.method1543(var16 - 256).method764();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method30(var16 - 512).method856(this.field2737);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2730[var20] < Statics.field2566[var20].length) {
                        var19.method2108(Statics.field2734[var20], Statics.field2566[var20][this.field2730[var20]]);
                    }
                    if (this.field2730[var20] < Statics.field2738[var20].length) {
                        var19.method2108(Statics.field2735[var20], Statics.field2738[var20][this.field2730[var20]]);
                    }
                }
                var9 = var19.method2081(64, 850, -30, -50, -30);
                field2736.method3291(var9, var5);
                this.field2733 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method715(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fx.b(B)Lcq;")
    public class101 method3204() {
        if (this.field2731 != -1) {
            return class31.method208(this.field2731).method605();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2739[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1543(var3 - 256).method765()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method30(var3 - 512).method852(this.field2737)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2739[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1543(var7 - 256).method769();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method30(var7 - 512).method853(this.field2737);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2730[var11] < Statics.field2566[var11].length) {
                var10.method2108(Statics.field2734[var11], Statics.field2566[var11][this.field2730[var11]]);
            }
            if (this.field2730[var11] < Statics.field2738[var11].length) {
                var10.method2108(Statics.field2735[var11], Statics.field2738[var11][this.field2730[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fx.j(I)I")
    public int method3205() {
        return this.field2731 == -1 ? (this.field2739[11] << 5) + (this.field2739[8] << 10) + (this.field2739[0] << 15) + (this.field2730[4] << 20) + (this.field2730[0] << 25) + this.field2739[1] : 305419896 + class31.method208(this.field2731).field765;
    }

    @ObfuscatedName("ez.p(B)V")
    public static void method2908() {
        field2736.method3297();
    }
}
