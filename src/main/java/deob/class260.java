package deob;

@ObfuscatedName("ie")
public class class260 {

    @ObfuscatedName("ie.l")
    public int[] field3021;

    @ObfuscatedName("ie.q")
    public int[] field3017;

    @ObfuscatedName("ie.f")
    public boolean field3018;

    @ObfuscatedName("ie.j")
    public int field3016;

    @ObfuscatedName("ie.m")
    public long field3020;

    @ObfuscatedName("ie.k")
    public long field3022;

    @ObfuscatedName("ie.t")
    public class151[] field3019;

    @ObfuscatedName("ie.a")
    public boolean field3023 = false;

    @ObfuscatedName("ie.g")
    public static final int[] field3025 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("ie.v")
    public static class236 field3026 = new class236(260);

    @ObfuscatedName("ie.l([I[Led;Z[IZII)V")
    public void method4519(int[] arg0, class151[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3019 = arg1;
        this.field3023 = arg2;
        this.method4516(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("ie.q([I[IZII)V")
    public void method4516(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1659; var6++) {
                    class156 var7 = class156.method3186(var6);
                    if (var7 != null && !var7.field1671 && var7.field1661 == var5 + (arg2 ? 7 : 0)) {
                        arg0[field3025[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3021 = arg0;
        this.field3017 = arg1;
        this.field3018 = arg2;
        this.field3016 = arg3;
        this.method4521();
    }

    @ObfuscatedName("ie.f(IZI)V")
    public void method4527(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3018) {
            return;
        }
        int var3 = this.field3021[field3025[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class156 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1659) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1659 - 1;
                }
            }
            var4 = class156.method3186(var3);
        } while (var4 == null || var4.field1671 || (this.field3018 ? 7 : 0) + arg0 != var4.field1661);
        this.field3021[field3025[arg0]] = var3 + 256;
        this.method4521();
    }

    @ObfuscatedName("ie.j(IZI)V")
    public void method4518(int arg0, boolean arg1) {
        int var3 = this.field3017[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2102[arg0].length) {
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
                    var3 = Statics.field2102[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3017[arg0] = var3;
        this.method4521();
    }

    @ObfuscatedName("ie.m(ZI)V")
    public void method4515(boolean arg0) {
        if (this.field3018 != arg0) {
            this.method4516((int[]) null, this.field3017, arg0, -1);
        }
    }

    @ObfuscatedName("ie.k(Lot;I)V")
    public void method4520(class401 arg0) {
        arg0.method6269(this.field3018 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3021[field3025[var2]];
            if (var3 == 0) {
                arg0.method6269(-1);
            } else {
                arg0.method6269(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6269(this.field3017[var4]);
        }
    }

    @ObfuscatedName("ie.t(I)V")
    public void method4521() {
        long var1 = this.field3020;
        int var3 = this.field3021[5];
        int var4 = this.field3021[9];
        this.field3021[5] = var4;
        this.field3021[9] = var3;
        this.field3020 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3020 <<= 0x4;
            if (this.field3021[var5] >= 256) {
                this.field3020 += (long) (this.field3021[var5] - 256);
            }
        }
        if (this.field3021[0] >= 256) {
            this.field3020 += (long) (this.field3021[0] - 256 >> 4);
        }
        if (this.field3021[1] >= 256) {
            this.field3020 += (long) (this.field3021[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3020 <<= 0x3;
            this.field3020 += (long) this.field3017[var6];
        }
        this.field3020 <<= 0x1;
        this.field3020 += (long) (this.field3018 ? 1 : 0);
        this.field3021[5] = var3;
        this.field3021[9] = var4;
        if (var1 != 0L && this.field3020 != var1 || this.field3023) {
            field3026.method4227(var1);
        }
    }

    @ObfuscatedName("ie.a(Lfe;ILfe;II)Lhl;")
    public class220 method4522(class172 arg0, int arg1, class172 arg2, int arg3) {
        if (this.field3016 != -1) {
            return class161.method2362(this.field3016).method2769(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3020;
        int[] var7 = this.field3021;
        if (arg0 != null && (arg0.field1957 >= 0 || arg0.field1958 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3021[var8];
            }
            if (arg0.field1957 >= 0) {
                var5 += (long) (arg0.field1957 - this.field3021[5] << 40);
                var7[5] = arg0.field1957;
            }
            if (arg0.field1958 >= 0) {
                var5 += (long) (arg0.field1958 - this.field3021[3] << 48);
                var7[3] = arg0.field1958;
            }
        }
        class220 var9 = (class220) field3026.method4223(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class156.method3186(var12 - 256).method2685()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class170.method2099(var12 - 512).method3009(this.field3018)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3022 != -1L) {
                    var9 = (class220) field3026.method4223(this.field3022);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class206[] var13 = new class206[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class206 var17 = class156.method3186(var16 - 256).method2686();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class170 var18 = class170.method2099(var16 - 512);
                        class206 var19 = var18.method3035(this.field3018);
                        if (var19 != null) {
                            if (this.field3019 != null) {
                                class151 var20 = this.field3019[var15];
                                if (var20 != null) {
                                    if (var20.field1607 != null && var18.field1888 != null && var18.field1889.length == var20.field1607.length) {
                                        for (int var21 = 0; var21 < var18.field1888.length; var21++) {
                                            var19.method3663(var18.field1889[var21], var20.field1607[var21]);
                                        }
                                    }
                                    if (var20.field1608 != null && var18.field1925 != null && var18.field1891.length == var20.field1608.length) {
                                        for (int var22 = 0; var22 < var18.field1925.length; var22++) {
                                            var19.method3664(var18.field1891[var22], var20.field1608[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class206 var23 = new class206(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3017[var24] < Statics.field2102[var24].length) {
                        var23.method3663(Statics.field3024[var24], Statics.field2102[var24][this.field3017[var24]]);
                    }
                    if (this.field3017[var24] < Statics.field2181[var24].length) {
                        var23.method3663(Statics.field2601[var24], Statics.field2181[var24][this.field3017[var24]]);
                    }
                }
                var9 = var23.method3671(64, 850, -30, -50, -30);
                field3026.method4225(var9, var5);
                this.field3022 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class220 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3096(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3093(var9, arg3);
        } else {
            var25 = arg0.method3093(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ie.e(I)Lgi;")
    public class206 method4529() {
        if (this.field3016 != -1) {
            return class161.method2362(this.field3016).method2790();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3021[var2];
            if (var3 >= 256 && var3 < 512 && !class156.method3186(var3 - 256).method2692()) {
                var1 = true;
            }
            if (var3 >= 512 && !class170.method2099(var3 - 512).method3011(this.field3018)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class206[] var4 = new class206[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3021[var6];
            if (var7 >= 256 && var7 < 512) {
                class206 var8 = class156.method3186(var7 - 256).method2688();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class206 var9 = class170.method2099(var7 - 512).method3012(this.field3018);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class206 var10 = new class206(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3017[var11] < Statics.field2102[var11].length) {
                var10.method3663(Statics.field3024[var11], Statics.field2102[var11][this.field3017[var11]]);
            }
            if (this.field3017[var11] < Statics.field2181[var11].length) {
                var10.method3663(Statics.field2601[var11], Statics.field2181[var11][this.field3017[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("ie.i(B)I")
    public int method4544() {
        return this.field3016 == -1 ? (this.field3021[11] << 5) + (this.field3021[8] << 10) + (this.field3021[0] << 15) + (this.field3017[4] << 20) + (this.field3017[0] << 25) + this.field3021[1] : 305419896 + class161.method2362(this.field3016).field1715;
    }
}
