package deob;

@ObfuscatedName("hb")
public class class225 {

    @ObfuscatedName("hb.a")
    public int[] field2729;

    @ObfuscatedName("hb.w")
    public int[] field2733;

    @ObfuscatedName("hb.e")
    public boolean field2731;

    @ObfuscatedName("hb.k")
    public int field2732;

    @ObfuscatedName("hb.u")
    public long field2730;

    @ObfuscatedName("hb.z")
    public long field2734;

    @ObfuscatedName("hb.x")
    public static final int[] field2737 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hb.c")
    public static class201 field2738 = new class201(260);

    @ObfuscatedName("hb.a([I[IZII)V")
    public void method3765(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field266; var6++) {
                    class259 var7 = class259.method3292(var6);
                    if (var7 != null && !var7.field3432 && (arg2 ? 7 : 0) + var5 == var7.field3439) {
                        arg0[field2737[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2729 = arg0;
        this.field2733 = arg1;
        this.field2731 = arg2;
        this.field2732 = arg3;
        this.method3758();
    }

    @ObfuscatedName("hb.w(IZB)V")
    public void method3754(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2731) {
            return;
        }
        int var3 = this.field2729[field2737[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class259 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field266) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field266 - 1;
                }
            }
            var4 = class259.method3292(var3);
        } while (var4 == null || var4.field3432 || var4.field3439 != (this.field2731 ? 7 : 0) + arg0);
        this.field2729[field2737[arg0]] = var3 + 256;
        this.method3758();
    }

    @ObfuscatedName("hb.e(IZB)V")
    public void method3755(int arg0, boolean arg1) {
        int var3 = this.field2733[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2735[arg0].length) {
                    var3 = 0;
                }
            } while (!class226.method1019(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2735[arg0].length - 1;
                }
            } while (!class226.method1019(arg0, var3));
        }
        this.field2733[arg0] = var3;
        this.method3758();
    }

    @ObfuscatedName("hb.k(ZI)V")
    public void method3753(boolean arg0) {
        if (this.field2731 != arg0) {
            this.method3765((int[]) null, this.field2733, arg0, -1);
        }
    }

    @ObfuscatedName("hb.u(Lgh;I)V")
    public void method3757(class185 arg0) {
        arg0.method2946(this.field2731 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2729[field2737[var2]];
            if (var3 == 0) {
                arg0.method2946(-1);
            } else {
                arg0.method2946(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2946(this.field2733[var4]);
        }
    }

    @ObfuscatedName("hb.z(I)V")
    public void method3758() {
        long var1 = this.field2730;
        int var3 = this.field2729[5];
        int var4 = this.field2729[9];
        this.field2729[5] = var4;
        this.field2729[9] = var3;
        this.field2730 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2730 <<= 0x4;
            if (this.field2729[var5] >= 256) {
                this.field2730 += (long) (this.field2729[var5] - 256);
            }
        }
        if (this.field2729[0] >= 256) {
            this.field2730 += (long) (this.field2729[0] - 256 >> 4);
        }
        if (this.field2729[1] >= 256) {
            this.field2730 += (long) (this.field2729[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2730 <<= 0x3;
            this.field2730 += (long) this.field2733[var6];
        }
        this.field2730 <<= 0x1;
        this.field2730 += (long) (this.field2731 ? 1 : 0);
        this.field2729[5] = var3;
        this.field2729[9] = var4;
        if (var1 != 0L && this.field2730 != var1) {
            field2738.method3368(var1);
        }
    }

    @ObfuscatedName("hb.t(Ljj;ILjj;II)Lef;")
    public class133 method3759(class272 arg0, int arg1, class272 arg2, int arg3) {
        if (this.field2732 != -1) {
            return class270.method1336(this.field2732).method4397(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2730;
        int[] var7 = this.field2729;
        if (arg0 != null && (arg0.field3682 >= 0 || arg0.field3678 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2729[var8];
            }
            if (arg0.field3682 >= 0) {
                var5 += (long) (arg0.field3682 - this.field2729[5] << 40);
                var7[5] = arg0.field3682;
            }
            if (arg0.field3678 >= 0) {
                var5 += (long) (arg0.field3678 - this.field2729[3] << 48);
                var7[3] = arg0.field3678;
            }
        }
        class133 var9 = (class133) field2738.method3373(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class259.method3292(var12 - 256).method4139()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class268.method4160(var12 - 512).method4344(this.field2731)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2734 != -1L) {
                    var9 = (class133) field2738.method3373(this.field2734);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class127[] var13 = new class127[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class127 var17 = class259.method3292(var16 - 256).method4142();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class127 var18 = class268.method4160(var16 - 512).method4375(this.field2731);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class127 var19 = new class127(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2733[var20] < Statics.field2735[var20].length) {
                        var19.method2216(Statics.field1944[var20], Statics.field2735[var20][this.field2733[var20]]);
                    }
                    if (this.field2733[var20] < Statics.field2736[var20].length) {
                        var19.method2216(Statics.field246[var20], Statics.field2736[var20][this.field2733[var20]]);
                    }
                }
                var9 = var19.method2224(64, 850, -30, -50, -30);
                field2738.method3375(var9, var5);
                this.field2734 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class133 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4470(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4460(var9, arg3);
        } else {
            var21 = arg0.method4460(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hb.f(I)Ldm;")
    public class127 method3775() {
        if (this.field2732 != -1) {
            return class270.method1336(this.field2732).method4398();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2729[var2];
            if (var3 >= 256 && var3 < 512 && !class259.method3292(var3 - 256).method4141()) {
                var1 = true;
            }
            if (var3 >= 512 && !class268.method4160(var3 - 512).method4350(this.field2731)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class127[] var4 = new class127[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2729[var6];
            if (var7 >= 256 && var7 < 512) {
                class127 var8 = class259.method3292(var7 - 256).method4138();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class127 var9 = class268.method4160(var7 - 512).method4347(this.field2731);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class127 var10 = new class127(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2733[var11] < Statics.field2735[var11].length) {
                var10.method2216(Statics.field1944[var11], Statics.field2735[var11][this.field2733[var11]]);
            }
            if (this.field2733[var11] < Statics.field2736[var11].length) {
                var10.method2216(Statics.field246[var11], Statics.field2736[var11][this.field2733[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hb.g(I)I")
    public int method3761() {
        return this.field2732 == -1 ? (this.field2729[11] << 5) + (this.field2729[8] << 10) + (this.field2729[0] << 15) + (this.field2733[4] << 20) + (this.field2733[0] << 25) + this.field2729[1] : 305419896 + class270.method1336(this.field2732).field3622;
    }

    @ObfuscatedName("gy.x(B)V")
    public static void method3269() {
        field2738.method3370();
    }
}
