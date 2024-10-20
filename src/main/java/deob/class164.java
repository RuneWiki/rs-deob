package deob;

@ObfuscatedName("fl")
public class class164 {

    @ObfuscatedName("fl.f")
    public int[] field2750;

    @ObfuscatedName("fl.t")
    public int[] field2742;

    @ObfuscatedName("fl.n")
    public boolean field2743;

    @ObfuscatedName("fl.e")
    public int field2744;

    @ObfuscatedName("fl.l")
    public long field2752;

    @ObfuscatedName("fl.d")
    public long field2746;

    @ObfuscatedName("fl.g")
    public static final int[] field2745 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fl.s")
    public static class170 field2741 = new class170(260);

    @ObfuscatedName("fl.f([I[IZIB)V")
    public void method3228(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field924; var6++) {
                    class36 var7 = class36.method28(var6);
                    if (var7 != null && !var7.field926 && var7.field920 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field2745[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2750 = arg0;
        this.field2742 = arg1;
        this.field2743 = arg2;
        this.field2744 = arg3;
        this.method3233();
    }

    @ObfuscatedName("fl.t(IZI)V")
    public void method3229(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2743) {
            return;
        }
        int var3 = this.field2750[field2745[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class36 var4;
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
            var4 = class36.method28(var3);
        } while (var4 == null || var4.field926 || arg0 + (this.field2743 ? 7 : 0) != var4.field920);
        this.field2750[field2745[arg0]] = var3 + 256;
        this.method3233();
    }

    @ObfuscatedName("fl.n(IZI)V")
    public void method3230(int arg0, boolean arg1) {
        int var3 = this.field2742[arg0];
        if (arg1) {
            var3++;
            if (var3 >= Statics.field2748[arg0].length) {
                var3 = 0;
            }
        } else {
            var3--;
            if (var3 < 0) {
                var3 = Statics.field2748[arg0].length - 1;
            }
        }
        this.field2742[arg0] = var3;
        this.method3233();
    }

    @ObfuscatedName("fl.e(ZI)V")
    public void method3231(boolean arg0) {
        if (this.field2743 != arg0) {
            this.method3228((int[]) null, this.field2742, arg0, -1);
        }
    }

    @ObfuscatedName("fl.l(Ldq;I)V")
    public void method3250(class127 arg0) {
        arg0.method2536(this.field2743 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2750[field2745[var2]];
            if (var3 == 0) {
                arg0.method2536(-1);
            } else {
                arg0.method2536(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2536(this.field2742[var4]);
        }
    }

    @ObfuscatedName("fl.d(B)V")
    public void method3233() {
        long var1 = this.field2752;
        int var3 = this.field2750[5];
        int var4 = this.field2750[9];
        this.field2750[5] = var4;
        this.field2750[9] = var3;
        this.field2752 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2752 <<= 0x4;
            if (this.field2750[var5] >= 256) {
                this.field2752 += (long) (this.field2750[var5] - 256);
            }
        }
        if (this.field2750[0] >= 256) {
            this.field2752 += (long) (this.field2750[0] - 256 >> 4);
        }
        if (this.field2750[1] >= 256) {
            this.field2752 += (long) (this.field2750[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2752 <<= 0x3;
            this.field2752 += (long) this.field2742[var6];
        }
        this.field2752 <<= 0x1;
        this.field2752 += (long) (this.field2743 ? 1 : 0);
        this.field2750[5] = var3;
        this.field2750[9] = var4;
        if (var1 != 0L && this.field2752 != var1) {
            field2741.method3269(var1);
        }
    }

    @ObfuscatedName("fl.r(Lac;ILac;IB)Ldp;")
    public class112 method3234(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field2744 != -1) {
            return class31.method2320(this.field2744).method601(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2752;
        int[] var7 = this.field2750;
        if (arg0 != null && (arg0.field882 >= 0 || arg0.field883 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2750[var8];
            }
            if (arg0.field882 >= 0) {
                var5 += (long) (arg0.field882 - this.field2750[5] << 40);
                var7[5] = arg0.field882;
            }
            if (arg0.field883 >= 0) {
                var5 += (long) (arg0.field883 - this.field2750[3] << 48);
                var7[3] = arg0.field883;
            }
        }
        class112 var9 = (class112) field2741.method3276(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class36.method28(var12 - 256).method765()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class40.method1433(var12 - 512).method854(this.field2743)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2746 != -1L) {
                    var9 = (class112) field2741.method3276(this.field2746);
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
                        class101 var17 = class36.method28(var16 - 256).method756();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class101 var18 = class40.method1433(var16 - 512).method829(this.field2743);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class101 var19 = new class101(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2742[var20] < Statics.field2748[var20].length) {
                        var19.method2071(Statics.field2751[var20], Statics.field2748[var20][this.field2742[var20]]);
                    }
                    if (this.field2742[var20] < Statics.field2747[var20].length) {
                        var19.method2071(Statics.field1236[var20], Statics.field2747[var20][this.field2742[var20]]);
                    }
                }
                var9 = var19.method2112(64, 850, -30, -50, -30);
                field2741.method3275(var9, var5);
                this.field2746 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class112 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method728(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method714(var9, arg3);
        } else {
            var21 = arg0.method714(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fl.k(I)Lcz;")
    public class101 method3235() {
        if (this.field2744 != -1) {
            return class31.method2320(this.field2744).method602();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2750[var2];
            if (var3 >= 256 && var3 < 512 && !class36.method28(var3 - 256).method757()) {
                var1 = true;
            }
            if (var3 >= 512 && !class40.method1433(var3 - 512).method830(this.field2743)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class101[] var4 = new class101[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2750[var6];
            if (var7 >= 256 && var7 < 512) {
                class101 var8 = class36.method28(var7 - 256).method758();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class101 var9 = class40.method1433(var7 - 512).method831(this.field2743);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class101 var10 = new class101(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2742[var11] < Statics.field2748[var11].length) {
                var10.method2071(Statics.field2751[var11], Statics.field2748[var11][this.field2742[var11]]);
            }
            if (this.field2742[var11] < Statics.field2747[var11].length) {
                var10.method2071(Statics.field1236[var11], Statics.field2747[var11][this.field2742[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fl.u(I)I")
    public int method3236() {
        return this.field2744 == -1 ? (this.field2750[11] << 5) + (this.field2750[8] << 10) + (this.field2750[0] << 15) + (this.field2742[4] << 20) + (this.field2742[0] << 25) + this.field2750[1] : 305419896 + class31.method2320(this.field2744).field776;
    }
}
