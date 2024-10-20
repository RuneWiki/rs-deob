package deob;

@ObfuscatedName("fk")
public class class163 {

    @ObfuscatedName("fk.i")
    public int[] field2722;

    @ObfuscatedName("fk.w")
    public int[] field2714;

    @ObfuscatedName("fk.f")
    public boolean field2715;

    @ObfuscatedName("fk.e")
    public int field2720;

    @ObfuscatedName("fk.t")
    public long field2718;

    @ObfuscatedName("fk.d")
    public long field2713;

    @ObfuscatedName("fk.a")
    public static final int[] field2721 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fk.z")
    public static class170 field2716 = new class170(260);

    @ObfuscatedName("fk.i([I[IZII)V")
    public void method3185(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field930; var6++) {
                    class36 var7 = class36.method1354(var6);
                    if (var7 != null && !var7.field929 && var7.field926 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2721[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2722 = arg0;
        this.field2714 = arg1;
        this.field2715 = arg2;
        this.field2720 = arg3;
        this.method3167();
    }

    @ObfuscatedName("fk.w(IZI)V")
    public void method3182(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2715) {
            return;
        }
        int var3 = this.field2722[field2721[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field930) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field930 - 1;
                }
            }
            var4 = class36.method1354(var3);
        } while (var4 == null || var4.field929 || (this.field2715 ? 7 : 0) + arg0 != var4.field926);
        this.field2722[field2721[arg0]] = var3 + 256;
        this.method3167();
    }

    @ObfuscatedName("fk.f(IZI)V")
    public void method3164(int arg0, boolean arg1) {
        int var3 = this.field2714[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field1793[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field1793[arg0].length - 1;
            }
        }
        this.field2714[arg0] = var3;
        this.method3167();
    }

    @ObfuscatedName("fk.e(ZI)V")
    public void method3165(boolean arg0) {
        if (this.field2715 != arg0) {
            this.method3185((int[]) null, this.field2714, arg0, -1);
        }
    }

    @ObfuscatedName("fk.t(Ldz;I)V")
    public void method3166(class127 arg0) {
        arg0.method2438(this.field2715 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2722[field2721[var2]];
            if (var3 == 0) {
                arg0.method2438(-1);
            } else {
                arg0.method2438(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2438(this.field2714[var4]);
        }
    }

    @ObfuscatedName("fk.d(I)V")
    public void method3167() {
        long var1 = this.field2718;
        int var3 = this.field2722[5];
        int var4 = this.field2722[9];
        this.field2722[5] = var4;
        this.field2722[9] = var3;
        this.field2718 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2718 <<= 0x4;
            if (this.field2722[var5] >= 256) {
                this.field2718 += (long) (this.field2722[var5] - 256);
            }
        }
        if (this.field2722[0] >= 256) {
            this.field2718 += (long) (this.field2722[0] - 256 >> 4);
        }
        if (this.field2722[1] >= 256) {
            this.field2718 += (long) (this.field2722[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2718 <<= 0x3;
            this.field2718 += (long) this.field2714[var6];
        }
        this.field2718 <<= 0x1;
        this.field2718 += (long) (this.field2715 ? 1 : 0);
        this.field2722[5] = var3;
        this.field2722[9] = var4;
        if (var1 != 0L && this.field2718 != var1) {
            field2716.method3236(var1);
        }
    }

    @ObfuscatedName("fk.p(Lak;ILak;IB)Ldb;")
    public class112 method3168(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2720 != -1) {
            return class31.method232(this.field2720).method620(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2718;
        int[] var7 = this.field2722;
        if (arg0 != null && (arg0.field897 >= 0 || arg0.field892 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2722[var8];
            }
            if (arg0.field897 >= 0) {
                var5 += (long) (arg0.field897 - this.field2722[5] << 40);
                var7[5] = arg0.field897;
            }
            if (arg0.field892 >= 0) {
                var5 += (long) (arg0.field892 - this.field2722[3] << 48);
                var7[3] = arg0.field892;
            }
        }
        class112 var9 = (class112) field2716.method3235(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method1354(var12 - 256).method756()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method548(var12 - 512).method839(this.field2715)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2713 != -1L) {
                    var9 = (class112) field2716.method3235(this.field2713);
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
                        class101 var17 = class36.method1354(var16 - 256).method764();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method548(var16 - 512).method837(this.field2715);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2714[var20] < Statics.field1793[var20].length) {
                        var19.method2064(Statics.field2719[var20], Statics.field1793[var20][this.field2714[var20]]);
                    }
                    if (this.field2714[var20] < Statics.field61[var20].length) {
                        var19.method2064(Statics.field2717[var20], Statics.field61[var20][this.field2714[var20]]);
                    }
                }
                var9 = var19.method2112(64, 850, -30, -50, -30);
                field2716.method3234(var9, var5);
                this.field2713 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method705(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method712(var9, arg3);
        } else {
            var21 = arg0.method712(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fk.k(B)Lco;")
    public class101 method3169() {
        if (this.field2720 != -1) {
            return class31.method232(this.field2720).method609();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2722[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method1354(var3 - 256).method761()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method548(var3 - 512).method841(this.field2715)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2722[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method1354(var7 - 256).method757();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method548(var7 - 512).method842(this.field2715);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2714[var11] < Statics.field1793[var11].length) {
                var10.method2064(Statics.field2719[var11], Statics.field1793[var11][this.field2714[var11]]);
            }
            if (this.field2714[var11] < Statics.field61[var11].length) {
                var10.method2064(Statics.field2717[var11], Statics.field61[var11][this.field2714[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fk.r(I)I")
    public int method3162() {
        return this.field2720 == -1 ? (this.field2722[11] << 5) + (this.field2722[8] << 10) + (this.field2722[0] << 15) + (this.field2714[4] << 20) + (this.field2714[0] << 25) + this.field2722[1] : 305419896 + class31.method232(this.field2720).field788;
    }
}
