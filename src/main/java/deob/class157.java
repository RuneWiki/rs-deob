package deob;

@ObfuscatedName("ft")
public class class157 {

    @ObfuscatedName("ft.t")
    public int[] field2660;

    @ObfuscatedName("ft.o")
    public int[] field2659;

    @ObfuscatedName("ft.i")
    public boolean field2663;

    @ObfuscatedName("ft.p")
    public int field2667;

    @ObfuscatedName("ft.c")
    public long field2662;

    @ObfuscatedName("ft.y")
    public long field2661;

    @ObfuscatedName("ft.w")
    public static final int[] field2664 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ft.m")
    public static class171 field2658 = new class171(260);

    @ObfuscatedName("ft.t([I[IZII)V")
    public void method2867(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field933; var6++) {
                    class40 var7 = Statics.method571(var6);
                    if (var7 != null && !var7.field939 && (arg2 ? 7 : 0) + var5 == var7.field945) {
                        arg0[field2664[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2660 = arg0;
        this.field2659 = arg1;
        this.field2663 = arg2;
        this.field2667 = arg3;
        this.method2876();
    }

    @ObfuscatedName("ft.o(IZI)V")
    public void method2868(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2663) {
            return;
        }
        int var3 = this.field2660[field2664[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class40 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field933) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field933 - 1;
                }
            }
            var4 = Statics.method571(var3);
        } while (var4 == null || var4.field939 || arg0 + (this.field2663 ? 7 : 0) != var4.field945);
        this.field2660[field2664[arg0]] = var3 + 256;
        this.method2876();
    }

    @ObfuscatedName("ft.i(IZB)V")
    public void method2883(int arg0, boolean arg1) {
        int var3 = this.field2659[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2665[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2665[arg0].length - 1;
            }
        }
        this.field2659[arg0] = var3;
        this.method2876();
    }

    @ObfuscatedName("ft.p(ZI)V")
    public void method2870(boolean arg0) {
        if (this.field2663 != arg0) {
            this.method2867((int[]) null, this.field2659, arg0, -1);
        }
    }

    @ObfuscatedName("ft.c(Ldg;I)V")
    public void method2871(class107 arg0) {
        arg0.method2168(this.field2663 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2660[field2664[var2]];
            if (var3 == 0) {
                arg0.method2168(-1);
            } else {
                arg0.method2168(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2168(this.field2659[var4]);
        }
    }

    @ObfuscatedName("ft.y(I)V")
    public void method2876() {
        long var1 = this.field2662;
        int var3 = this.field2660[5];
        int var4 = this.field2660[9];
        this.field2660[5] = var4;
        this.field2660[9] = var3;
        this.field2662 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2662 <<= 0x4;
            if (this.field2660[var5] >= 256) {
                this.field2662 += (long) (this.field2660[var5] - 256);
            }
        }
        if (this.field2660[0] >= 256) {
            this.field2662 += (long) (this.field2660[0] - 256 >> 4);
        }
        if (this.field2660[1] >= 256) {
            this.field2662 += (long) (this.field2660[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2662 <<= 0x3;
            this.field2662 += (long) this.field2659[var6];
        }
        this.field2662 <<= 0x1;
        this.field2662 += (long) (this.field2663 ? 1 : 0);
        this.field2660[5] = var3;
        this.field2660[9] = var4;
        if (var1 != 0L && this.field2662 != var1) {
            field2658.method3106(var1);
        }
    }

    @ObfuscatedName("ft.g(Lab;ILab;II)Lcx;")
    public class98 method2873(class38 arg0, int arg1, class38 arg2, int arg3) {
        if (this.field2667 != -1) {
            return class35.method454(this.field2667).method609(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2662;
        int[] var7 = this.field2660;
        if (arg0 != null && (arg0.field904 >= 0 || arg0.field906 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2660[var8];
            }
            if (arg0.field904 >= 0) {
                var5 += (long) (arg0.field904 - this.field2660[5] << 40);
                var7[5] = arg0.field904;
            }
            if (arg0.field906 >= 0) {
                var5 += (long) (arg0.field906 - this.field2660[3] << 48);
                var7[3] = arg0.field906;
            }
        }
        class98 var9 = (class98) field2658.method3099(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !Statics.method571(var12 - 256).method774()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class45.method1771(var12 - 512).method867(this.field2663)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2661 != -1L) {
                    var9 = (class98) field2658.method3099(this.field2661);
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
                        class93 var17 = Statics.method571(var16 - 256).method763();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class93 var18 = class45.method1771(var16 - 512).method838(this.field2663);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class93 var19 = new class93(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2659[var20] < Statics.field2665[var20].length) {
                        var19.method1924(Statics.field2668[var20], Statics.field2665[var20][this.field2659[var20]]);
                    }
                    if (this.field2659[var20] < Statics.field1880[var20].length) {
                        var19.method1924(Statics.field64[var20], Statics.field1880[var20][this.field2659[var20]]);
                    }
                }
                var9 = var19.method1917(64, 850, -30, -50, -30);
                field2658.method3101(var9, var5);
                this.field2661 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class98 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method713(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method710(var9, arg3);
        } else {
            var21 = arg0.method710(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("ft.l(I)Lcd;")
    public class93 method2895() {
        if (this.field2667 != -1) {
            return class35.method454(this.field2667).method623();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2660[var2];
            if (var3 >= 256 && var3 < 512 && !Statics.method571(var3 - 256).method759()) {
                var1 = true;
            }
            if (var3 >= 512 && !class45.method1771(var3 - 512).method839(this.field2663)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class93[] var4 = new class93[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2660[var6];
            if (var7 >= 256 && var7 < 512) {
                class93 var8 = Statics.method571(var7 - 256).method762();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class93 var9 = class45.method1771(var7 - 512).method836(this.field2663);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class93 var10 = new class93(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2659[var11] < Statics.field2665[var11].length) {
                var10.method1924(Statics.field2668[var11], Statics.field2665[var11][this.field2659[var11]]);
            }
            if (this.field2659[var11] < Statics.field1880[var11].length) {
                var10.method1924(Statics.field64[var11], Statics.field1880[var11][this.field2659[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ft.h(S)I")
    public int method2875() {
        return this.field2667 == -1 ? (this.field2660[11] << 5) + (this.field2660[8] << 10) + (this.field2660[0] << 15) + (this.field2659[4] << 20) + (this.field2659[0] << 25) + this.field2660[1] : 305419896 + class35.method454(this.field2667).field803;
    }
}
