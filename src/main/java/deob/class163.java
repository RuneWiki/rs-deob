package deob;

@ObfuscatedName("fo")
public class class163 {

    @ObfuscatedName("fo.t")
    public int[] field2731;

    @ObfuscatedName("fo.l")
    public int[] field2738;

    @ObfuscatedName("fo.c")
    public boolean field2730;

    @ObfuscatedName("fo.d")
    public int field2728;

    @ObfuscatedName("fo.b")
    public long field2732;

    @ObfuscatedName("fo.i")
    public long field2733;

    @ObfuscatedName("fo.j")
    public static final int[] field2737 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fo.h")
    public static class170 field2739 = new class170(260);

    @ObfuscatedName("fo.t([I[IZII)V")
    public void method3185(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field941; var6++) {
                    class36 var7 = class36.method241(var6);
                    if (var7 != null && !var7.field953 && var5 + (arg2 ? 7 : 0) == var7.field943) {
                        arg0[field2737[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2731 = arg0;
        this.field2738 = arg1;
        this.field2730 = arg2;
        this.field2728 = arg3;
        this.method3190();
    }

    @ObfuscatedName("fo.l(IZI)V")
    public void method3195(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2730) {
            return;
        }
        int var3 = this.field2731[field2737[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field941) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field941 - 1;
                }
            }
            var4 = class36.method241(var3);
        } while (var4 == null || var4.field953 || arg0 + (this.field2730 ? 7 : 0) != var4.field943);
        this.field2731[field2737[arg0]] = var3 + 256;
        this.method3190();
    }

    @ObfuscatedName("fo.c(IZI)V")
    public void method3201(int arg0, boolean arg1) {
        int var3 = this.field2738[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2735[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2735[arg0].length - 1;
            }
        }
        this.field2738[arg0] = var3;
        this.method3190();
    }

    @ObfuscatedName("fo.d(ZI)V")
    public void method3186(boolean arg0) {
        if (this.field2730 != arg0) {
            this.method3185((int[]) null, this.field2738, arg0, -1);
        }
    }

    @ObfuscatedName("fo.b(Ldo;S)V")
    public void method3184(class127 arg0) {
        arg0.method2424(this.field2730 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2731[field2737[var2]];
            if (var3 == 0) {
                arg0.method2424(-1);
            } else {
                arg0.method2424(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2424(this.field2738[var4]);
        }
    }

    @ObfuscatedName("fo.i(I)V")
    public void method3190() {
        long var1 = this.field2732;
        int var3 = this.field2731[5];
        int var4 = this.field2731[9];
        this.field2731[5] = var4;
        this.field2731[9] = var3;
        this.field2732 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2732 <<= 0x4;
            if (this.field2731[var5] >= 256) {
                this.field2732 += (long) (this.field2731[var5] - 256);
            }
        }
        if (this.field2731[0] >= 256) {
            this.field2732 += (long) (this.field2731[0] - 256 >> 4);
        }
        if (this.field2731[1] >= 256) {
            this.field2732 += (long) (this.field2731[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2732 <<= 0x3;
            this.field2732 += (long) this.field2738[var6];
        }
        this.field2732 <<= 0x1;
        this.field2732 += (long) (this.field2730 ? 1 : 0);
        this.field2731[5] = var3;
        this.field2731[9] = var4;
        if (var1 != 0L && this.field2732 != var1) {
            field2739.method3259(var1);
        }
    }

    @ObfuscatedName("fo.p(Lal;ILal;II)Ldk;")
    public class112 method3191(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2728 != -1) {
            return class31.method922(this.field2728).method652(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2732;
        int[] var7 = this.field2731;
        if (arg0 != null && (arg0.field911 >= 0 || arg0.field912 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2731[var8];
            }
            if (arg0.field911 >= 0) {
                var5 += (long) (arg0.field911 - this.field2731[5] << 40);
                var7[5] = arg0.field911;
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2731[3] << 48);
                var7[3] = arg0.field912;
            }
        }
        class112 var9 = (class112) field2739.method3260(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method241(var12 - 256).method794()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method119(var12 - 512).method872(this.field2730)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2733 != -1L) {
                    var9 = (class112) field2739.method3260(this.field2733);
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
                        class101 var17 = class36.method241(var16 - 256).method790();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method119(var16 - 512).method873(this.field2730);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2738[var20] < Statics.field2735[var20].length) {
                        var19.method2063(Statics.field2734[var20], Statics.field2735[var20][this.field2738[var20]]);
                    }
                    if (this.field2738[var20] < Statics.field2575[var20].length) {
                        var19.method2063(Statics.field2736[var20], Statics.field2575[var20][this.field2738[var20]]);
                    }
                }
                var9 = var19.method2125(64, 850, -30, -50, -30);
                field2739.method3261(var9, var5);
                this.field2733 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method734(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method741(var9, arg3);
        } else {
            var21 = arg0.method741(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fo.y(I)Lcc;")
    public class101 method3192() {
        if (this.field2728 != -1) {
            return class31.method922(this.field2728).method642();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2731[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method241(var3 - 256).method791()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method119(var3 - 512).method900(this.field2730)) {
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
                class101 var8 = class36.method241(var7 - 256).method786();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method119(var7 - 512).method874(this.field2730);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2738[var11] < Statics.field2735[var11].length) {
                var10.method2063(Statics.field2734[var11], Statics.field2735[var11][this.field2738[var11]]);
            }
            if (this.field2738[var11] < Statics.field2575[var11].length) {
                var10.method2063(Statics.field2736[var11], Statics.field2575[var11][this.field2738[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fo.u(I)I")
    public int method3193() {
        return this.field2728 == -1 ? (this.field2731[11] << 5) + (this.field2731[8] << 10) + (this.field2731[0] << 15) + (this.field2738[4] << 20) + (this.field2738[0] << 25) + this.field2731[1] : 305419896 + class31.method922(this.field2728).field796;
    }
}
