package deob;

@ObfuscatedName("hy")
public class class221 {

    @ObfuscatedName("hy.d")
    public int[] field2704;

    @ObfuscatedName("hy.x")
    public int[] field2694;

    @ObfuscatedName("hy.k")
    public boolean field2695;

    @ObfuscatedName("hy.z")
    public int field2701;

    @ObfuscatedName("hy.v")
    public long field2697;

    @ObfuscatedName("hy.m")
    public long field2700;

    @ObfuscatedName("hy.l")
    public static final int[] field2696 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hy.u")
    public static class197 field2703 = new class197(260);

    @ObfuscatedName("hy.d([I[IZII)V")
    public void method3815(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3420; var6++) {
                    class255 var7 = class255.method3262(var6);
                    if (var7 != null && !var7.field3431 && var7.field3425 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2696[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2704 = arg0;
        this.field2694 = arg1;
        this.field2695 = arg2;
        this.field2701 = arg3;
        this.method3820();
    }

    @ObfuscatedName("hy.x(IZI)V")
    public void method3816(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2695) {
            return;
        }
        int var3 = this.field2704[field2696[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class255 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3420) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3420 - 1;
                }
            }
            var4 = class255.method3262(var3);
        } while (var4 == null || var4.field3431 || var4.field3425 != (this.field2695 ? 7 : 0) + arg0);
        this.field2704[field2696[arg0]] = var3 + 256;
        this.method3820();
    }

    @ObfuscatedName("hy.k(IZI)V")
    public void method3817(int arg0, boolean arg1) {
        int var3 = this.field2694[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2698[arg0].length) {
                    var3 = 0;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var5 = false;
                } else {
                    var5 = true;
                }
            } while (!var5);
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2698[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2694[arg0] = var3;
        this.method3820();
    }

    @ObfuscatedName("hy.z(ZI)V")
    public void method3842(boolean arg0) {
        if (this.field2695 != arg0) {
            this.method3815((int[]) null, this.field2694, arg0, -1);
        }
    }

    @ObfuscatedName("hy.v(Lfr;B)V")
    public void method3819(class181 arg0) {
        arg0.method3020(this.field2695 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2704[field2696[var2]];
            if (var3 == 0) {
                arg0.method3020(-1);
            } else {
                arg0.method3020(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method3020(this.field2694[var4]);
        }
    }

    @ObfuscatedName("hy.m(I)V")
    public void method3820() {
        long var1 = this.field2697;
        int var3 = this.field2704[5];
        int var4 = this.field2704[9];
        this.field2704[5] = var4;
        this.field2704[9] = var3;
        this.field2697 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2697 <<= 0x4;
            if (this.field2704[var5] >= 256) {
                this.field2697 += (long) (this.field2704[var5] - 256);
            }
        }
        if (this.field2704[0] >= 256) {
            this.field2697 += (long) (this.field2704[0] - 256 >> 4);
        }
        if (this.field2704[1] >= 256) {
            this.field2697 += (long) (this.field2704[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2697 <<= 0x3;
            this.field2697 += (long) this.field2694[var6];
        }
        this.field2697 <<= 0x1;
        this.field2697 += (long) (this.field2695 ? 1 : 0);
        this.field2704[5] = var3;
        this.field2704[9] = var4;
        if (var1 != 0L && this.field2697 != var1) {
            field2703.method3419(var1);
        }
    }

    @ObfuscatedName("hy.b(Ljj;ILjj;IB)Leh;")
    public class133 method3821(class268 arg0, int arg1, class268 arg2, int arg3) {
        if (this.field2701 != -1) {
            return class266.method4(this.field2701).method4480(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2697;
        int[] var7 = this.field2704;
        if (arg0 != null && (arg0.field3678 >= 0 || arg0.field3665 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2704[var8];
            }
            if (arg0.field3678 >= 0) {
                var5 += (long) (arg0.field3678 - this.field2704[5] << 40);
                var7[5] = arg0.field3678;
            }
            if (arg0.field3665 >= 0) {
                var5 += (long) (arg0.field3665 - this.field2704[3] << 48);
                var7[3] = arg0.field3665;
            }
        }
        class133 var9 = (class133) field2703.method3418(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class255.method3262(var12 - 256).method4182()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class264.method482(var12 - 512).method4414(this.field2695)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2700 != -1L) {
                    var9 = (class133) field2703.method3418(this.field2700);
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
                        class127 var17 = class255.method3262(var16 - 256).method4183();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class127 var18 = class264.method482(var16 - 512).method4415(this.field2695);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class127 var19 = new class127(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2694[var20] < Statics.field2698[var20].length) {
                        var19.method2306(Statics.field2699[var20], Statics.field2698[var20][this.field2694[var20]]);
                    }
                    if (this.field2694[var20] < Statics.field2693[var20].length) {
                        var19.method2306(Statics.field636[var20], Statics.field2693[var20][this.field2694[var20]]);
                    }
                }
                var9 = var19.method2314(64, 850, -30, -50, -30);
                field2703.method3417(var9, var5);
                this.field2700 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class133 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4533(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4535(var9, arg3);
        } else {
            var21 = arg0.method4535(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hy.t(I)Ldr;")
    public class127 method3840() {
        if (this.field2701 != -1) {
            return class266.method4(this.field2701).method4495();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2704[var2];
            if (var3 >= 256 && var3 < 512 && !class255.method3262(var3 - 256).method4196()) {
                var1 = true;
            }
            if (var3 >= 512 && !class264.method482(var3 - 512).method4416(this.field2695)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class127[] var4 = new class127[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2704[var6];
            if (var7 >= 256 && var7 < 512) {
                class127 var8 = class255.method3262(var7 - 256).method4185();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class127 var9 = class264.method482(var7 - 512).method4417(this.field2695);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class127 var10 = new class127(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2694[var11] < Statics.field2698[var11].length) {
                var10.method2306(Statics.field2699[var11], Statics.field2698[var11][this.field2694[var11]]);
            }
            if (this.field2694[var11] < Statics.field2693[var11].length) {
                var10.method2306(Statics.field636[var11], Statics.field2693[var11][this.field2694[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hy.p(I)I")
    public int method3831() {
        return this.field2701 == -1 ? (this.field2704[11] << 5) + (this.field2704[8] << 10) + (this.field2704[0] << 15) + (this.field2694[4] << 20) + (this.field2694[0] << 25) + this.field2704[1] : 305419896 + class266.method4(this.field2701).field3648;
    }

    @ObfuscatedName("ha.r(I)V")
    public static void method3694() {
        field2703.method3422();
    }
}
