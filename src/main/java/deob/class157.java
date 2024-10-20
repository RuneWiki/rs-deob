package deob;

@ObfuscatedName("fx")
public class class157 {

    @ObfuscatedName("fx.k")
    public int[] field2676;

    @ObfuscatedName("fx.b")
    public int[] field2672;

    @ObfuscatedName("fx.e")
    public boolean field2671;

    @ObfuscatedName("fx.i")
    public int field2674;

    @ObfuscatedName("fx.t")
    public long field2675;

    @ObfuscatedName("fx.z")
    public long field2682;

    @ObfuscatedName("fx.w")
    public static final int[] field2680 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fx.y")
    public static class171 field2681 = new class171(260);

    @ObfuscatedName("fx.k([I[IZII)V")
    public void method2911(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field947; var6++) {
                    class40 var7 = class40.method555(var6);
                    if (var7 != null && !var7.field956 && (arg2 ? 7 : 0) + var5 == var7.field949) {
                        arg0[field2680[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2676 = arg0;
        this.field2672 = arg1;
        this.field2671 = arg2;
        this.field2674 = arg3;
        this.method2924();
    }

    @ObfuscatedName("fx.b(IZS)V")
    public void method2912(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2671) {
            return;
        }
        int var3 = this.field2676[field2680[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field947) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field947 - 1;
                }
            }
            var4 = class40.method555(var3);
        } while (var4 == null || var4.field956 || arg0 + (this.field2671 ? 7 : 0) != var4.field949);
        this.field2676[field2680[arg0]] = var3 + 256;
        this.method2924();
    }

    @ObfuscatedName("fx.e(IZI)V")
    public void method2913(int arg0, boolean arg1) {
        int var3 = this.field2672[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2678[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2678[arg0].length - 1;
            }
        }
        this.field2672[arg0] = var3;
        this.method2924();
    }

    @ObfuscatedName("fx.i(ZB)V")
    public void method2914(boolean arg0) {
        if (this.field2671 != arg0) {
            this.method2911((int[]) null, this.field2672, arg0, -1);
        }
    }

    @ObfuscatedName("fx.t(Ldi;B)V")
    public void method2915(class107 arg0) {
        arg0.method2102(this.field2671 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2676[field2680[var2]];
            if (var3 == 0) {
                arg0.method2102(-1);
            } else {
                arg0.method2102(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2102(this.field2672[var4]);
        }
    }

    @ObfuscatedName("fx.z(I)V")
    public void method2924() {
        long var1 = this.field2675;
        int var3 = this.field2676[5];
        int var4 = this.field2676[9];
        this.field2676[5] = var4;
        this.field2676[9] = var3;
        this.field2675 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2675 <<= 0x4;
            if (this.field2676[var5] >= 256) {
                this.field2675 += (long) (this.field2676[var5] - 256);
            }
        }
        if (this.field2676[0] >= 256) {
            this.field2675 += (long) (this.field2676[0] - 256 >> 4);
        }
        if (this.field2676[1] >= 256) {
            this.field2675 += (long) (this.field2676[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2675 <<= 0x3;
            this.field2675 += (long) this.field2672[var6];
        }
        this.field2675 <<= 0x1;
        this.field2675 += (long) (this.field2671 ? 1 : 0);
        this.field2676[5] = var3;
        this.field2676[9] = var4;
        if (var1 != 0L && this.field2675 != var1) {
            field2681.method3159(var1);
        }
    }

    @ObfuscatedName("fx.g(Lav;ILav;II)Lck;")
    public class98 method2917(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2674 != -1) {
            return class35.method479(this.field2674).method603(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2675;
        int[] var7 = this.field2676;
        if (arg0 != null && (arg0.field923 >= 0 || arg0.field909 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2676[var8];
            }
            if (arg0.field923 >= 0) {
                var5 += (long) (arg0.field923 - this.field2676[5] << 40);
                var7[5] = arg0.field923;
            }
            if (arg0.field909 >= 0) {
                var5 += (long) (arg0.field909 - this.field2676[3] << 48);
                var7[3] = arg0.field909;
            }
        }
        class98 var9 = (class98) field2681.method3166(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class40.method555(var12 - 256).method765()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method2458(var12 - 512).method851(this.field2671)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2682 != -1L) {
                    var9 = (class98) field2681.method3166(this.field2682);
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
                        class93 var17 = class40.method555(var16 - 256).method779();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method2458(var16 - 512).method862(this.field2671);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2672[var20] < Statics.field2678[var20].length) {
                        var19.method1895(Statics.field2673[var20], Statics.field2678[var20][this.field2672[var20]]);
                    }
                    if (this.field2672[var20] < Statics.field1499[var20].length) {
                        var19.method1895(Statics.field2679[var20], Statics.field1499[var20][this.field2672[var20]]);
                    }
                }
                var9 = var19.method1902(64, 850, -30, -50, -30);
                field2681.method3161(var9, var5);
                this.field2682 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method734(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method714(var9, arg3);
        } else {
            var21 = arg0.method714(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fx.c(I)Lcv;")
    public class93 method2918() {
        if (this.field2674 != -1) {
            return class35.method479(this.field2674).method604();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2676[var2];
            if (var3 >= 256 && var3 < 512 && !class40.method555(var3 - 256).method769()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method2458(var3 - 512).method853(this.field2671)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2676[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = class40.method555(var7 - 256).method768();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method2458(var7 - 512).method854(this.field2671);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2672[var11] < Statics.field2678[var11].length) {
                var10.method1895(Statics.field2673[var11], Statics.field2678[var11][this.field2672[var11]]);
            }
            if (this.field2672[var11] < Statics.field1499[var11].length) {
                var10.method1895(Statics.field2679[var11], Statics.field1499[var11][this.field2672[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fx.o(S)I")
    public int method2919() {
        return this.field2674 == -1 ? (this.field2676[11] << 5) + (this.field2676[8] << 10) + (this.field2676[0] << 15) + (this.field2672[0] << 25) + (this.field2672[4] << 20) + this.field2676[1] : 305419896 + class35.method479(this.field2674).field821;
    }
}
