package deob;

@ObfuscatedName("fv")
public class class162 {

    @ObfuscatedName("fv.v")
    public int[] field2693;

    @ObfuscatedName("fv.t")
    public int[] field2699;

    @ObfuscatedName("fv.f")
    public boolean field2696;

    @ObfuscatedName("fv.j")
    public int field2694;

    @ObfuscatedName("fv.l")
    public long field2697;

    @ObfuscatedName("fv.g")
    public long field2695;

    @ObfuscatedName("fv.o")
    public static final int[] field2702 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("fv.c")
    public static class176 field2703 = new class176(260);

    @ObfuscatedName("fv.v([I[IZII)V")
    public void method2991(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field952; var6++) {
                    class41 var7 = class41.method711(var6);
                    if (var7 != null && !var7.field961 && var7.field954 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2702[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2693 = arg0;
        this.field2699 = arg1;
        this.field2696 = arg2;
        this.field2694 = arg3;
        this.method2996();
    }

    @ObfuscatedName("fv.t(IZB)V")
    public void method2992(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2696) {
            return;
        }
        int var3 = this.field2693[field2702[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class41 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field952) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field952 - 1;
                }
            }
            var4 = class41.method711(var3);
        } while (var4 == null || var4.field961 || var4.field954 != arg0 + (this.field2696 ? 7 : 0));
        this.field2693[field2702[arg0]] = var3 + 256;
        this.method2996();
    }

    @ObfuscatedName("fv.f(IZI)V")
    public void method2993(int arg0, boolean arg1) {
        int var3 = this.field2699[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2700[arg0].length) {
                    var3 = 0;
                }
            } while (!class158.method1988(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field2700[arg0].length - 1;
                }
            } while (!class158.method1988(arg0, var3));
        }
        this.field2699[arg0] = var3;
        this.method2996();
    }

    @ObfuscatedName("fv.j(ZI)V")
    public void method2994(boolean arg0) {
        if (this.field2696 != arg0) {
            this.method2991((int[]) null, this.field2699, arg0, -1);
        }
    }

    @ObfuscatedName("fv.l(Ldp;I)V")
    public void method2995(class110 arg0) {
        arg0.method2263(this.field2696 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2693[field2702[var2]];
            if (var3 == 0) {
                arg0.method2263(-1);
            } else {
                arg0.method2263(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2263(this.field2699[var4]);
        }
    }

    @ObfuscatedName("fv.g(I)V")
    public void method2996() {
        long var1 = this.field2697;
        int var3 = this.field2693[5];
        int var4 = this.field2693[9];
        this.field2693[5] = var4;
        this.field2693[9] = var3;
        this.field2697 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2697 <<= 0x4;
            if (this.field2693[var5] >= 256) {
                this.field2697 += (long) (this.field2693[var5] - 256);
            }
        }
        if (this.field2693[0] >= 256) {
            this.field2697 += (long) (this.field2693[0] - 256 >> 4);
        }
        if (this.field2693[1] >= 256) {
            this.field2697 += (long) (this.field2693[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2697 <<= 0x3;
            this.field2697 += (long) this.field2699[var6];
        }
        this.field2697 <<= 0x1;
        this.field2697 += (long) (this.field2696 ? 1 : 0);
        this.field2693[5] = var3;
        this.field2693[9] = var4;
        if (var1 != 0L && this.field2697 != var1) {
            field2703.method3227(var1);
        }
    }

    @ObfuscatedName("fv.k(Lax;ILax;II)Lcy;")
    public class99 method2997(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field2694 != -1) {
            return class36.method80(this.field2694).method625(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2697;
        int[] var7 = this.field2693;
        if (arg0 != null && (arg0.field906 >= 0 || arg0.field924 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2693[var8];
            }
            if (arg0.field906 >= 0) {
                var5 += (long) (arg0.field906 - this.field2693[5] << 40);
                var7[5] = arg0.field906;
            }
            if (arg0.field924 >= 0) {
                var5 += (long) (arg0.field924 - this.field2693[3] << 48);
                var7[3] = arg0.field924;
            }
        }
        class99 var9 = (class99) field2703.method3231(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class41.method711(var12 - 256).method772()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class46.method712(var12 - 512).method864(this.field2696)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2695 != -1L) {
                    var9 = (class99) field2703.method3231(this.field2695);
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
                        class94 var17 = class41.method711(var16 - 256).method773();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class94 var18 = class46.method712(var16 - 512).method892(this.field2696);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class94 var19 = new class94(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2699[var20] < Statics.field2700[var20].length) {
                        var19.method1976(Statics.field2704[var20], Statics.field2700[var20][this.field2699[var20]]);
                    }
                    if (this.field2699[var20] < Statics.field2701[var20].length) {
                        var19.method1976(Statics.field153[var20], Statics.field2701[var20][this.field2699[var20]]);
                    }
                }
                var9 = var19.method1918(64, 850, -30, -50, -30);
                field2703.method3228(var9, var5);
                this.field2695 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class99 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method722(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method719(var9, arg3);
        } else {
            var21 = arg0.method719(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("fv.p(I)Lcu;")
    public class94 method2998() {
        if (this.field2694 != -1) {
            return class36.method80(this.field2694).method629();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2693[var2];
            if (var3 >= 256 && var3 < 512 && !class41.method711(var3 - 256).method774()) {
                var1 = true;
            }
            if (var3 >= 512 && !class46.method712(var3 - 512).method866(this.field2696)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class94[] var4 = new class94[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2693[var6];
            if (var7 >= 256 && var7 < 512) {
                class94 var8 = class41.method711(var7 - 256).method775();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class94 var9 = class46.method712(var7 - 512).method893(this.field2696);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class94 var10 = new class94(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2699[var11] < Statics.field2700[var11].length) {
                var10.method1976(Statics.field2704[var11], Statics.field2700[var11][this.field2699[var11]]);
            }
            if (this.field2699[var11] < Statics.field2701[var11].length) {
                var10.method1976(Statics.field153[var11], Statics.field2701[var11][this.field2699[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("fv.y(I)I")
    public int method2999() {
        return this.field2694 == -1 ? (this.field2693[11] << 5) + (this.field2693[8] << 10) + (this.field2693[0] << 15) + (this.field2699[4] << 20) + (this.field2699[0] << 25) + this.field2693[1] : 305419896 + class36.method80(this.field2694).field804;
    }
}
