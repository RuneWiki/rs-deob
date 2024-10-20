package deob;

@ObfuscatedName("fx")
public class class157 {

    @ObfuscatedName("fx.k")
    public int[] field2682;

    @ObfuscatedName("fx.r")
    public int[] field2685;

    @ObfuscatedName("fx.y")
    public boolean field2674;

    @ObfuscatedName("fx.w")
    public int field2677;

    @ObfuscatedName("fx.m")
    public long field2678;

    @ObfuscatedName("fx.j")
    public long field2676;

    @ObfuscatedName("fx.x")
    public static final int[] field2684 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fx.n")
    public static class171 field2683 = new class171(260);

    @ObfuscatedName("fx.k([I[IZIS)V")
    public void method2918(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field946; var6++) {
                    class40 var7 = class40.method492(var6);
                    if (var7 != null && !var7.field954 && (arg2 ? 7 : 0) + var5 == var7.field948) {
                        arg0[field2684[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2682 = arg0;
        this.field2685 = arg1;
        this.field2674 = arg2;
        this.field2677 = arg3;
        this.method2898();
    }

    @ObfuscatedName("fx.r(IZS)V")
    public void method2895(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2674) {
            return;
        }
        int var3 = this.field2682[field2684[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field946) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field946 - 1;
                }
            }
            var4 = class40.method492(var3);
        } while (var4 == null || var4.field954 || var4.field948 != (this.field2674 ? 7 : 0) + arg0);
        this.field2682[field2684[arg0]] = var3 + 256;
        this.method2898();
    }

    @ObfuscatedName("fx.y(IZI)V")
    public void method2908(int arg0, boolean arg1) {
        int var3 = this.field2685[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2681[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2681[arg0].length - 1;
            }
        }
        this.field2685[arg0] = var3;
        this.method2898();
    }

    @ObfuscatedName("fx.w(ZI)V")
    public void method2896(boolean arg0) {
        if (this.field2674 != arg0) {
            this.method2918((int[]) null, this.field2685, arg0, -1);
        }
    }

    @ObfuscatedName("fx.m(Lde;I)V")
    public void method2897(class107 arg0) {
        arg0.method2097(this.field2674 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2682[field2684[var2]];
            if (var3 == 0) {
                arg0.method2097(-1);
            } else {
                arg0.method2097(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2097(this.field2685[var4]);
        }
    }

    @ObfuscatedName("fx.j(I)V")
    public void method2898() {
        long var1 = this.field2678;
        int var3 = this.field2682[5];
        int var4 = this.field2682[9];
        this.field2682[5] = var4;
        this.field2682[9] = var3;
        this.field2678 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2678 <<= 0x4;
            if (this.field2682[var5] >= 256) {
                this.field2678 += (long) (this.field2682[var5] - 256);
            }
        }
        if (this.field2682[0] >= 256) {
            this.field2678 += (long) (this.field2682[0] - 256 >> 4);
        }
        if (this.field2682[1] >= 256) {
            this.field2678 += (long) (this.field2682[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2678 <<= 0x3;
            this.field2678 += (long) this.field2685[var6];
        }
        this.field2678 <<= 0x1;
        this.field2678 += (long) (this.field2674 ? 1 : 0);
        this.field2682[5] = var3;
        this.field2682[9] = var4;
        if (var1 != 0L && this.field2678 != var1) {
            field2683.method3136(var1);
        }
    }

    @ObfuscatedName("fx.g(Lap;ILap;II)Lcp;")
    public class98 method2899(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2677 != -1) {
            return class35.method917(this.field2677).method599(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2678;
        int[] var7 = this.field2682;
        if (arg0 != null && (arg0.field913 >= 0 || arg0.field912 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2682[var8];
            }
            if (arg0.field913 >= 0) {
                var5 += (long) (arg0.field913 - this.field2682[5] << 40);
                var7[5] = arg0.field913;
            }
            if (arg0.field912 >= 0) {
                var5 += (long) (arg0.field912 - this.field2682[3] << 48);
                var7[3] = arg0.field912;
            }
        }
        class98 var9 = (class98) field2683.method3141(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method492(var12 - 256).method765()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method1864(var12 - 512).method898(this.field2674)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2676 != -1L) {
                    var9 = (class98) field2683.method3141(this.field2676);
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
                        class93 var17 = class40.method492(var16 - 256).method780();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method1864(var16 - 512).method860(this.field2674);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2685[var20] < Statics.field2681[var20].length) {
                        var19.method1925(Statics.field2680[var20], Statics.field2681[var20][this.field2685[var20]]);
                    }
                    if (this.field2685[var20] < Statics.field1344[var20].length) {
                        var19.method1925(Statics.field74[var20], Statics.field1344[var20][this.field2685[var20]]);
                    }
                }
                var9 = var19.method1892(64, 850, -30, -50, -30);
                field2683.method3137(var9, var5);
                this.field2676 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method728(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method700(var9, arg3);
        } else {
            var21 = arg0.method700(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fx.p(I)Lcl;")
    public class93 method2902() {
        if (this.field2677 != -1) {
            return class35.method917(this.field2677).method625();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2682[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method492(var3 - 256).method767()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method1864(var3 - 512).method861(this.field2674)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2682[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method492(var7 - 256).method777();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method1864(var7 - 512).method862(this.field2674);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2685[var11] < Statics.field2681[var11].length) {
                var10.method1925(Statics.field2680[var11], Statics.field2681[var11][this.field2685[var11]]);
            }
            if (this.field2685[var11] < Statics.field1344[var11].length) {
                var10.method1925(Statics.field74[var11], Statics.field1344[var11][this.field2685[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fx.o(B)I")
    public int method2901() {
        return this.field2677 == -1 ? (this.field2682[11] << 5) + (this.field2682[8] << 10) + (this.field2682[0] << 15) + (this.field2685[4] << 20) + (this.field2685[0] << 25) + this.field2682[1] : 305419896 + class35.method917(this.field2677).field805;
    }
}
