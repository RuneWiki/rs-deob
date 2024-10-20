package deob;

@ObfuscatedName("fp")
public class class158 {

    @ObfuscatedName("fp.g")
    public int[] field2689;

    @ObfuscatedName("fp.i")
    public int[] field2691;

    @ObfuscatedName("fp.k")
    public boolean field2690;

    @ObfuscatedName("fp.e")
    public int field2688;

    @ObfuscatedName("fp.w")
    public long field2692;

    @ObfuscatedName("fp.m")
    public long field2693;

    @ObfuscatedName("fp.b")
    public static final int[] field2695 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fp.r")
    public static class172 field2697 = new class172(260);

    @ObfuscatedName("fp.g([I[IZII)V")
    public void method2912(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1893; var6++) {
                    class40 var7 = class40.method2909(var6);
                    if (var7 != null && !var7.field948 && var5 + (arg2 ? 7 : 0) == var7.field949) {
                        arg0[field2695[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2689 = arg0;
        this.field2691 = arg1;
        this.field2690 = arg2;
        this.field2688 = arg3;
        this.method2902();
    }

    @ObfuscatedName("fp.i(IZI)V")
    public void method2926(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2690) {
            return;
        }
        int var3 = this.field2689[field2695[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1893) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1893 - 1;
                }
            }
            var4 = class40.method2909(var3);
        } while (var4 == null || var4.field948 || var4.field949 != arg0 + (this.field2690 ? 7 : 0));
        this.field2689[field2695[arg0]] = var3 + 256;
        this.method2902();
    }

    @ObfuscatedName("fp.k(IZI)V")
    public void method2911(int arg0, boolean arg1) {
        int var3 = this.field2691[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2696[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 == 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2696[arg0].length - 1;
                }
                if (arg0 == 4 && var3 == 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2691[arg0] = var3;
        this.method2902();
    }

    @ObfuscatedName("fp.e(ZB)V")
    public void method2923(boolean arg0) {
        if (this.field2690 != arg0) {
            this.method2912((int[]) null, this.field2691, arg0, -1);
        }
    }

    @ObfuscatedName("fp.w(Ldk;I)V")
    public void method2898(class107 arg0) {
        arg0.method2079(this.field2690 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2689[field2695[var2]];
            if (var3 == 0) {
                arg0.method2079(-1);
            } else {
                arg0.method2079(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2079(this.field2691[var4]);
        }
    }

    @ObfuscatedName("fp.m(I)V")
    public void method2902() {
        long var1 = this.field2692;
        int var3 = this.field2689[5];
        int var4 = this.field2689[9];
        this.field2689[5] = var4;
        this.field2689[9] = var3;
        this.field2692 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2692 <<= 0x4;
            if (this.field2689[var5] >= 256) {
                this.field2692 += (long) (this.field2689[var5] - 256);
            }
        }
        if (this.field2689[0] >= 256) {
            this.field2692 += (long) (this.field2689[0] - 256 >> 4);
        }
        if (this.field2689[1] >= 256) {
            this.field2692 += (long) (this.field2689[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2692 <<= 0x3;
            this.field2692 += (long) this.field2691[var6];
        }
        this.field2692 <<= 0x1;
        this.field2692 += (long) (this.field2690 ? 1 : 0);
        this.field2689[5] = var3;
        this.field2689[9] = var4;
        if (var1 != 0L && this.field2692 != var1) {
            field2697.method3144(var1);
        }
    }

    @ObfuscatedName("fp.u(Lax;ILax;II)Lce;")
    public class98 method2900(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2688 != -1) {
            return class35.method34(this.field2688).method622(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2692;
        int[] var7 = this.field2689;
        if (arg0 != null && (arg0.field922 >= 0 || arg0.field912 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2689[var8];
            }
            if (arg0.field922 >= 0) {
                var5 += (long) (arg0.field922 - this.field2689[5] << 40);
                var7[5] = arg0.field922;
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2689[3] << 48);
                var7[3] = arg0.field912;
            }
        }
        class98 var9 = (class98) field2697.method3135(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method2909(var12 - 256).method739()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method2406(var12 - 512).method832(this.field2690)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2693 != -1L) {
                    var9 = (class98) field2697.method3135(this.field2693);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class93[] var13 = new class93[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class93 var17 = class40.method2909(var16 - 256).method731();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = Statics.method2406(var16 - 512).method833(this.field2690);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2691[var20] < Statics.field2696[var20].length) {
                        var19.method1873(Statics.field2694[var20], Statics.field2696[var20][this.field2691[var20]]);
                    }
                    if (this.field2691[var20] < Statics.field623[var20].length) {
                        var19.method1873(Statics.field1829[var20], Statics.field623[var20][this.field2691[var20]]);
                    }
                }
                var9 = var19.method1881(64, 850, -30, -50, -30);
                field2697.method3140(var9, var5);
                this.field2693 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method694(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method691(var9, arg3);
        } else {
            var21 = arg0.method691(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fp.j(I)Lcr;")
    public class93 method2901() {
        if (this.field2688 != -1) {
            return class35.method34(this.field2688).method590();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2689[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method2909(var3 - 256).method732()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method2406(var3 - 512).method834(this.field2690)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2689[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method2909(var7 - 256).method734();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = Statics.method2406(var7 - 512).method835(this.field2690);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2691[var11] < Statics.field2696[var11].length) {
                var10.method1873(Statics.field2694[var11], Statics.field2696[var11][this.field2691[var11]]);
            }
            if (this.field2691[var11] < Statics.field623[var11].length) {
                var10.method1873(Statics.field1829[var11], Statics.field623[var11][this.field2691[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fp.o(I)I")
    public int method2925() {
        return this.field2688 == -1 ? (this.field2689[11] << 5) + (this.field2689[8] << 10) + (this.field2689[0] << 15) + (this.field2691[4] << 20) + (this.field2691[0] << 25) + this.field2689[1] : 305419896 + class35.method34(this.field2688).field809;
    }
}
