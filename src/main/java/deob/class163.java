package deob;

@ObfuscatedName("fh")
public class class163 {

    @ObfuscatedName("fh.i")
    public int[] field2731;

    @ObfuscatedName("fh.v")
    public int[] field2724;

    @ObfuscatedName("fh.m")
    public boolean field2725;

    @ObfuscatedName("fh.j")
    public int field2726;

    @ObfuscatedName("fh.o")
    public long field2729;

    @ObfuscatedName("fh.l")
    public long field2728;

    @ObfuscatedName("fh.f")
    public static final int[] field2732 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fh.a")
    public static class170 field2723 = new class170(260);

    @ObfuscatedName("fh.i([I[IZII)V")
    public void method3230(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field931; var6++) {
                    class36 var7 = class36.method1887(var6);
                    if (var7 != null && !var7.field934 && var7.field942 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2732[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2731 = arg0;
        this.field2724 = arg1;
        this.field2725 = arg2;
        this.field2726 = arg3;
        this.method3232();
    }

    @ObfuscatedName("fh.v(IZB)V")
    public void method3231(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2725) {
            return;
        }
        int var3 = this.field2731[field2732[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field931) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field931 - 1;
                }
            }
            var4 = class36.method1887(var3);
        } while (var4 == null || var4.field934 || arg0 + (this.field2725 ? 7 : 0) != var4.field942);
        this.field2731[field2732[arg0]] = var3 + 256;
        this.method3232();
    }

    @ObfuscatedName("fh.m(IZB)V")
    public void method3249(int arg0, boolean arg1) {
        int var3 = this.field2724[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2730[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2730[arg0].length - 1;
            }
        }
        this.field2724[arg0] = var3;
        this.method3232();
    }

    @ObfuscatedName("fh.j(ZI)V")
    public void method3242(boolean arg0) {
        if (this.field2725 != arg0) {
            this.method3230((int[]) null, this.field2724, arg0, -1);
        }
    }

    @ObfuscatedName("fh.o(Lda;B)V")
    public void method3256(class127 arg0) {
        arg0.method2477(this.field2725 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2731[field2732[var2]];
            if (var3 == 0) {
                arg0.method2477(-1);
            } else {
                arg0.method2477(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2477(this.field2724[var4]);
        }
    }

    @ObfuscatedName("fh.l(I)V")
    public void method3232() {
        long var1 = this.field2729;
        int var3 = this.field2731[5];
        int var4 = this.field2731[9];
        this.field2731[5] = var4;
        this.field2731[9] = var3;
        this.field2729 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2729 <<= 0x4;
            if (this.field2731[var5] >= 256) {
                this.field2729 += (long) (this.field2731[var5] - 256);
            }
        }
        if (this.field2731[0] >= 256) {
            this.field2729 += (long) (this.field2731[0] - 256 >> 4);
        }
        if (this.field2731[1] >= 256) {
            this.field2729 += (long) (this.field2731[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2729 <<= 0x3;
            this.field2729 += (long) this.field2724[var6];
        }
        this.field2729 <<= 0x1;
        this.field2729 += (long) (this.field2725 ? 1 : 0);
        this.field2731[5] = var3;
        this.field2731[9] = var4;
        if (var1 != 0L && this.field2729 != var1) {
            field2723.method3309(var1);
        }
    }

    @ObfuscatedName("fh.g(Lap;ILap;IB)Ldl;")
    public class112 method3235(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2726 != -1) {
            return class31.method2076(this.field2726).method623(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2729;
        int[] var7 = this.field2731;
        if (arg0 != null && (arg0.field900 >= 0 || arg0.field888 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2731[var8];
            }
            if (arg0.field900 >= 0) {
                var5 += (long) (arg0.field900 - this.field2731[5] << 40);
                var7[5] = arg0.field900;
            }
            if (arg0.field888 >= 0) {
                var5 += (long) (arg0.field888 - this.field2731[3] << 48);
                var7[3] = arg0.field888;
            }
        }
        class112 var9 = (class112) field2723.method3308(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1887(var12 - 256).method784()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method259(var12 - 512).method857(this.field2725)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2728 != -1L) {
                    var9 = (class112) field2723.method3308(this.field2728);
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
                        class101 var17 = class36.method1887(var16 - 256).method771();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method259(var16 - 512).method858(this.field2725);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2724[var20] < Statics.field2730[var20].length) {
                        var19.method2095(Statics.field271[var20], Statics.field2730[var20][this.field2724[var20]]);
                    }
                    if (this.field2724[var20] < Statics.field2727[var20].length) {
                        var19.method2095(Statics.field2010[var20], Statics.field2727[var20][this.field2724[var20]]);
                    }
                }
                var9 = var19.method2102(64, 850, -30, -50, -30);
                field2723.method3307(var9, var5);
                this.field2728 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method723(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method728(var9, arg3);
        } else {
            var21 = arg0.method728(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fh.w(I)Lcw;")
    public class101 method3236() {
        if (this.field2726 != -1) {
            return class31.method2076(this.field2726).method640();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2731[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1887(var3 - 256).method772()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method259(var3 - 512).method859(this.field2725)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2731[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1887(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method259(var7 - 512).method862(this.field2725);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2724[var11] < Statics.field2730[var11].length) {
                var10.method2095(Statics.field271[var11], Statics.field2730[var11][this.field2724[var11]]);
            }
            if (this.field2724[var11] < Statics.field2727[var11].length) {
                var10.method2095(Statics.field2010[var11], Statics.field2727[var11][this.field2724[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fh.c(I)I")
    public int method3237() {
        return this.field2726 == -1 ? (this.field2731[11] << 5) + (this.field2731[8] << 10) + (this.field2731[0] << 15) + (this.field2724[4] << 20) + (this.field2724[0] << 25) + this.field2731[1] : 305419896 + class31.method2076(this.field2726).field785;
    }

    @ObfuscatedName("ei.z(I)V")
    public static void method2761() {
        field2723.method3311();
    }
}
