package deob;

@ObfuscatedName("hx")
public class class214 {

    @ObfuscatedName("hx.i")
    public int[] field2630;

    @ObfuscatedName("hx.w")
    public int[] field2622;

    @ObfuscatedName("hx.a")
    public boolean field2623;

    @ObfuscatedName("hx.t")
    public int field2624;

    @ObfuscatedName("hx.s")
    public long field2625;

    @ObfuscatedName("hx.r")
    public long field2626;

    @ObfuscatedName("hx.e")
    public static final int[] field2629 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("hx.o")
    public static class190 field2631 = new class190(260);

    @ObfuscatedName("hx.i([I[IZII)V")
    public void method3641(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field3360; var6++) {
                    class248 var7 = class248.method1627(var6);
                    if (var7 != null && !var7.field3369 && var7.field3362 == (arg2 ? 7 : 0) + var5) {
                        arg0[field2629[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field2630 = arg0;
        this.field2622 = arg1;
        this.field2623 = arg2;
        this.field2624 = arg3;
        this.method3636();
    }

    @ObfuscatedName("hx.w(IZB)V")
    public void method3637(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field2623) {
            return;
        }
        int var3 = this.field2630[field2629[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class248 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3360) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3360 - 1;
                }
            }
            var4 = class248.method1627(var3);
        } while (var4 == null || var4.field3369 || var4.field3362 != arg0 + (this.field2623 ? 7 : 0));
        this.field2630[field2629[arg0]] = var3 + 256;
        this.method3636();
    }

    @ObfuscatedName("hx.a(IZI)V")
    public void method3611(int arg0, boolean arg1) {
        int var3 = this.field2622[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2628[arg0].length) {
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
                    var3 = Statics.field2628[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field2622[arg0] = var3;
        this.method3636();
    }

    @ObfuscatedName("hx.t(ZI)V")
    public void method3610(boolean arg0) {
        if (this.field2623 != arg0) {
            this.method3641((int[]) null, this.field2622, arg0, -1);
        }
    }

    @ObfuscatedName("hx.s(Lfp;I)V")
    public void method3613(class174 arg0) {
        arg0.method2865(this.field2623 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field2630[field2629[var2]];
            if (var3 == 0) {
                arg0.method2865(-1);
            } else {
                arg0.method2865(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method2865(this.field2622[var4]);
        }
    }

    @ObfuscatedName("hx.r(I)V")
    public void method3636() {
        long var1 = this.field2625;
        int var3 = this.field2630[5];
        int var4 = this.field2630[9];
        this.field2630[5] = var4;
        this.field2630[9] = var3;
        this.field2625 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2625 <<= 0x4;
            if (this.field2630[var5] >= 256) {
                this.field2625 += (long) (this.field2630[var5] - 256);
            }
        }
        if (this.field2630[0] >= 256) {
            this.field2625 += (long) (this.field2630[0] - 256 >> 4);
        }
        if (this.field2630[1] >= 256) {
            this.field2625 += (long) (this.field2630[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2625 <<= 0x3;
            this.field2625 += (long) this.field2622[var6];
        }
        this.field2625 <<= 0x1;
        this.field2625 += (long) (this.field2623 ? 1 : 0);
        this.field2630[5] = var3;
        this.field2630[9] = var4;
        if (var1 != 0L && this.field2625 != var1) {
            field2631.method3233(var1);
        }
    }

    @ObfuscatedName("hx.v(Ljn;ILjn;IB)Let;")
    public class134 method3615(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field2624 != -1) {
            return class259.method471(this.field2624).method4287(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field2625;
        int[] var7 = this.field2630;
        if (arg0 != null && (arg0.field3619 >= 0 || arg0.field3615 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field2630[var8];
            }
            if (arg0.field3619 >= 0) {
                var5 += (long) (arg0.field3619 - this.field2630[5] << 40);
                var7[5] = arg0.field3619;
            }
            if (arg0.field3615 >= 0) {
                var5 += (long) (arg0.field3615 - this.field2630[3] << 48);
                var7[3] = arg0.field3615;
            }
        }
        class134 var9 = (class134) field2631.method3235(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class248.method1627(var12 - 256).method4025()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class257.method3084(var12 - 512).method4272(this.field2623)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field2626 != -1L) {
                    var9 = (class134) field2631.method3235(this.field2626);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class128 var17 = class248.method1627(var16 - 256).method4026();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class128 var18 = class257.method3084(var16 - 512).method4231(this.field2623);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                }
                class128 var19 = new class128(var13, var14);
                for (int var20 = 0; var20 < 5; var20++) {
                    if (this.field2622[var20] < Statics.field2628[var20].length) {
                        var19.method2198(Statics.field324[var20], Statics.field2628[var20][this.field2622[var20]]);
                    }
                    if (this.field2622[var20] < Statics.field2621[var20].length) {
                        var19.method2198(Statics.field1399[var20], Statics.field2621[var20][this.field2622[var20]]);
                    }
                }
                var9 = var19.method2221(64, 850, -30, -50, -30);
                field2631.method3234(var9, var5);
                this.field2626 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class134 var21;
        if (arg0 != null && arg2 != null) {
            var21 = arg0.method4330(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var21 = arg2.method4340(var9, arg3);
        } else {
            var21 = arg0.method4340(var9, arg1);
        }
        return var21;
    }

    @ObfuscatedName("hx.y(I)Ldo;")
    public class128 method3638() {
        if (this.field2624 != -1) {
            return class259.method471(this.field2624).method4281();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field2630[var2];
            if (var3 >= 256 && var3 < 512 && !class248.method1627(var3 - 256).method4037()) {
                var1 = true;
            }
            if (var3 >= 512 && !class257.method3084(var3 - 512).method4228(this.field2623)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class128[] var4 = new class128[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field2630[var6];
            if (var7 >= 256 && var7 < 512) {
                class128 var8 = class248.method1627(var7 - 256).method4028();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class128 var9 = class257.method3084(var7 - 512).method4229(this.field2623);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class128 var10 = new class128(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field2622[var11] < Statics.field2628[var11].length) {
                var10.method2198(Statics.field324[var11], Statics.field2628[var11][this.field2622[var11]]);
            }
            if (this.field2622[var11] < Statics.field2621[var11].length) {
                var10.method2198(Statics.field1399[var11], Statics.field2621[var11][this.field2622[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("hx.j(I)I")
    public int method3617() {
        return this.field2624 == -1 ? (this.field2630[11] << 5) + (this.field2630[8] << 10) + (this.field2630[0] << 15) + (this.field2622[4] << 20) + (this.field2622[0] << 25) + this.field2630[1] : 305419896 + class259.method471(this.field2624).field3560;
    }
}
