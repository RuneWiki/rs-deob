package deob;

@ObfuscatedName("fx")
public class class162 {

    @ObfuscatedName("fx.p")
    public int[] field2706;

    @ObfuscatedName("fx.y")
    public int[] field2695;

    @ObfuscatedName("fx.d")
    public boolean field2696;

    @ObfuscatedName("fx.c")
    public int field2697;

    @ObfuscatedName("fx.r")
    public long field2698;

    @ObfuscatedName("fx.f")
    public long field2699;

    @ObfuscatedName("fx.h")
    public static final int[] field2703 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fx.m")
    public static class176 field2704 = new class176(260);

    @ObfuscatedName("fx.p([I[IZII)V")
    public void method2947(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field924; var6++) {
                    class41 var7 = class41.method3181(var6);
                    if (var7 != null && !var7.field933 && var5 + (arg2 ? 7 : 0) == var7.field934) {
                        arg0[field2703[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2706 = arg0;
        this.field2695 = arg1;
        this.field2696 = arg2;
        this.field2697 = arg3;
        this.method2952();
    }

    @ObfuscatedName("fx.y(IZB)V")
    public void method2963(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2696) {
            return;
        }
        int var3 = this.field2706[field2703[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field924) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field924 - 1;
                }
            }
            var4 = class41.method3181(var3);
        } while (var4 == null || var4.field933 || var4.field934 != (this.field2696 ? 7 : 0) + arg0);
        this.field2706[field2703[arg0]] = var3 + 256;
        this.method2952();
    }

    @ObfuscatedName("fx.d(IZI)V")
    public void method2949(int arg0, boolean arg1) {
        int var3 = this.field2695[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2705[arg0].length) {
                    var3 = 0;
                }
            } while (!class158.method97(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2705[arg0].length - 1;
                }
            } while (!class158.method97(arg0, var3));
        }
        this.field2695[arg0] = var3;
        this.method2952();
    }

    @ObfuscatedName("fx.c(ZI)V")
    public void method2950(boolean arg0) {
        if (this.field2696 != arg0) {
            this.method2947((int[]) null, this.field2695, arg0, -1);
        }
    }

    @ObfuscatedName("fx.r(Ldg;I)V")
    public void method2977(class110 arg0) {
        arg0.method2110(this.field2696 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2706[field2703[var2]];
            if (var3 == 0) {
                arg0.method2110(-1);
            } else {
                arg0.method2110(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2110(this.field2695[var4]);
        }
    }

    @ObfuscatedName("fx.f(B)V")
    public void method2952() {
        long var1 = this.field2698;
        int var3 = this.field2706[5];
        int var4 = this.field2706[9];
        this.field2706[5] = var4;
        this.field2706[9] = var3;
        this.field2698 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2698 <<= 0x4;
            if (this.field2706[var5] >= 256) {
                this.field2698 += (long) (this.field2706[var5] - 256);
            }
        }
        if (this.field2706[0] >= 256) {
            this.field2698 += (long) (this.field2706[0] - 256 >> 4);
        }
        if (this.field2706[1] >= 256) {
            this.field2698 += (long) (this.field2706[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2698 <<= 0x3;
            this.field2698 += (long) this.field2695[var6];
        }
        this.field2698 <<= 0x1;
        this.field2698 += (long) (this.field2696 ? 1 : 0);
        this.field2706[5] = var3;
        this.field2706[9] = var4;
        if (var1 != 0L && this.field2698 != var1) {
            field2704.method3192(var1);
        }
    }

    @ObfuscatedName("fx.z(Lat;ILat;II)Lcy;")
    public class99 method2961(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2697 != -1) {
            return class36.method31(this.field2697).method644(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2698;
        int[] var7 = this.field2706;
        if (arg0 != null && (arg0.field891 >= 0 || arg0.field893 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2706[var8];
            }
            if (arg0.field891 >= 0) {
                var5 += (long) (arg0.field891 - this.field2706[5] << 40);
                var7[5] = arg0.field891;
            }
            if (arg0.field893 >= 0) {
                var5 += (long) (arg0.field893 - this.field2706[3] << 48);
                var7[3] = arg0.field893;
            }
        }
        class99 var9 = (class99) field2704.method3198(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method3181(var12 - 256).method781()) {
                    var10 = true;
                }
                if (var12 >= 512 && !Statics.method607(var12 - 512).method881(this.field2696)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2699 != -1L) {
                    var9 = (class99) field2704.method3198(this.field2699);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class94[] var13 = new class94[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class94 var17 = class41.method3181(var16 - 256).method796();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = Statics.method607(var16 - 512).method909(this.field2696);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2695[var20] < Statics.field2705[var20].length) {
                        var19.method1922(Statics.field2700[var20], Statics.field2705[var20][this.field2695[var20]]);
                    }
                    if (this.field2695[var20] < Statics.field2702[var20].length) {
                        var19.method1922(Statics.field185[var20], Statics.field2702[var20][this.field2695[var20]]);
                    }
                }
                var9 = var19.method1926(64, 850, -30, -50, -30);
                field2704.method3193(var9, var5);
                this.field2699 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method733(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method730(var9, arg3);
        } else {
            var21 = arg0.method730(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fx.o(I)Lch;")
    public class94 method2954() {
        if (this.field2697 != -1) {
            return class36.method31(this.field2697).method645();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2706[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method3181(var3 - 256).method798()) {
                var1 = true;
            }
            if (var3 >= 512 && !Statics.method607(var3 - 512).method877(this.field2696)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2706[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method3181(var7 - 256).method784();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = Statics.method607(var7 - 512).method897(this.field2696);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2695[var11] < Statics.field2705[var11].length) {
                var10.method1922(Statics.field2700[var11], Statics.field2705[var11][this.field2695[var11]]);
            }
            if (this.field2695[var11] < Statics.field2702[var11].length) {
                var10.method1922(Statics.field185[var11], Statics.field2702[var11][this.field2695[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fx.k(B)I")
    public int method2955() {
        return this.field2697 == -1 ? (this.field2706[11] << 5) + (this.field2706[8] << 10) + (this.field2706[0] << 15) + (this.field2695[0] << 25) + (this.field2695[4] << 20) + this.field2706[1] : 305419896 + class36.method31(this.field2697).field777;
    }
}
