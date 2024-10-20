package deob;

@ObfuscatedName("fh")
public class class164 {

    @ObfuscatedName("fh.p")
    public int[] field2739;

    @ObfuscatedName("fh.e")
    public int[] field2733;

    @ObfuscatedName("fh.a")
    public boolean field2734;

    @ObfuscatedName("fh.h")
    public int field2738;

    @ObfuscatedName("fh.y")
    public long field2736;

    @ObfuscatedName("fh.j")
    public long field2737;

    @ObfuscatedName("fh.q")
    public static final int[] field2741 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fh.w")
    public static class170 field2742 = new class170(260);

    @ObfuscatedName("fh.p([I[IZII)V")
    public void method3230(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field926; var6++) {
                    class36 var7 = class36.method2151(var6);
                    if (var7 != null && !var7.field911 && var5 + (arg2 ? 7 : 0) == var7.field913) {
                        arg0[field2741[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2739 = arg0;
        this.field2733 = arg1;
        this.field2734 = arg2;
        this.field2738 = arg3;
        this.method3229();
    }

    @ObfuscatedName("fh.e(IZB)V")
    public void method3231(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2734) {
            return;
        }
        int var3 = this.field2739[field2741[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field926) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field926 - 1;
                }
            }
            var4 = class36.method2151(var3);
        } while (var4 == null || var4.field911 || var4.field913 != (this.field2734 ? 7 : 0) + arg0);
        this.field2739[field2741[arg0]] = var3 + 256;
        this.method3229();
    }

    @ObfuscatedName("fh.a(IZI)V")
    public void method3232(int arg0, boolean arg1) {
        int var3 = this.field2733[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2732[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2732[arg0].length - 1;
            }
        }
        this.field2733[arg0] = var3;
        this.method3229();
    }

    @ObfuscatedName("fh.h(ZI)V")
    public void method3247(boolean arg0) {
        if (this.field2734 != arg0) {
            this.method3230((int[]) null, this.field2733, arg0, -1);
        }
    }

    @ObfuscatedName("fh.y(Ldj;B)V")
    public void method3234(class127 arg0) {
        arg0.method2657(this.field2734 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2739[field2741[var2]];
            if (var3 == 0) {
                arg0.method2657(-1);
            } else {
                arg0.method2657(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2657(this.field2733[var4]);
        }
    }

    @ObfuscatedName("fh.j(I)V")
    public void method3229() {
        long var1 = this.field2736;
        int var3 = this.field2739[5];
        int var4 = this.field2739[9];
        this.field2739[5] = var4;
        this.field2739[9] = var3;
        this.field2736 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2736 <<= 0x4;
            if (this.field2739[var5] >= 256) {
                this.field2736 += (long) (this.field2739[var5] - 256);
            }
        }
        if (this.field2739[0] >= 256) {
            this.field2736 += (long) (this.field2739[0] - 256 >> 4);
        }
        if (this.field2739[1] >= 256) {
            this.field2736 += (long) (this.field2739[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2736 <<= 0x3;
            this.field2736 += (long) this.field2733[var6];
        }
        this.field2736 <<= 0x1;
        this.field2736 += (long) (this.field2734 ? 1 : 0);
        this.field2739[5] = var3;
        this.field2739[9] = var4;
        if (var1 != 0L && this.field2736 != var1) {
            field2742.method3267(var1);
        }
    }

    @ObfuscatedName("fh.l(Lag;ILag;II)Lds;")
    public class112 method3236(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2738 != -1) {
            return class31.method843(this.field2738).method631(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2736;
        int[] var7 = this.field2739;
        if (arg0 != null && (arg0.field884 >= 0 || arg0.field883 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2739[var8];
            }
            if (arg0.field884 >= 0) {
                var5 += (long) (arg0.field884 - this.field2739[5] << 40);
                var7[5] = arg0.field884;
            }
            if (arg0.field883 >= 0) {
                var5 += (long) (arg0.field883 - this.field2739[3] << 48);
                var7[3] = arg0.field883;
            }
        }
        class112 var9 = (class112) field2742.method3266(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method2151(var12 - 256).method768()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method1554(var12 - 512).method855(this.field2734)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2737 != -1L) {
                    var9 = (class112) field2742.method3266(this.field2737);
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
                        class101 var17 = class36.method2151(var16 - 256).method790();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method1554(var16 - 512).method881(this.field2734);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2733[var20] < Statics.field2732[var20].length) {
                        var19.method2083(Statics.field2740[var20], Statics.field2732[var20][this.field2733[var20]]);
                    }
                    if (this.field2733[var20] < Statics.field2735[var20].length) {
                        var19.method2083(Statics.field374[var20], Statics.field2735[var20][this.field2733[var20]]);
                    }
                }
                var9 = var19.method2090(64, 850, -30, -50, -30);
                field2742.method3268(var9, var5);
                this.field2737 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method723(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method717(var9, arg3);
        } else {
            var21 = arg0.method717(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fh.f(I)Lch;")
    public class101 method3257() {
        if (this.field2738 != -1) {
            return class31.method843(this.field2738).method637();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2739[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method2151(var3 - 256).method770()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method1554(var3 - 512).method857(this.field2734)) {
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
                class101 var8 = class36.method2151(var7 - 256).method765();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method1554(var7 - 512).method858(this.field2734);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2733[var11] < Statics.field2732[var11].length) {
                var10.method2083(Statics.field2740[var11], Statics.field2732[var11][this.field2733[var11]]);
            }
            if (this.field2733[var11] < Statics.field2735[var11].length) {
                var10.method2083(Statics.field374[var11], Statics.field2735[var11][this.field2733[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fh.n(I)I")
    public int method3241() {
        return this.field2738 == -1 ? (this.field2739[11] << 5) + (this.field2739[8] << 10) + (this.field2739[0] << 15) + (this.field2733[4] << 20) + (this.field2733[0] << 25) + this.field2739[1] : 305419896 + class31.method843(this.field2738).field801;
    }
}
