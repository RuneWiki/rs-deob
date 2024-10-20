package deob;

@ObfuscatedName("jo")
public class class279 {

    @ObfuscatedName("jo.c")
    public int[] field3207;

    @ObfuscatedName("jo.b")
    public int[] field3199;

    @ObfuscatedName("jo.p")
    public boolean field3196;

    @ObfuscatedName("jo.m")
    public int field3195;

    @ObfuscatedName("jo.t")
    public long field3197;

    @ObfuscatedName("jo.s")
    public long field3202;

    @ObfuscatedName("jo.j")
    public class161[] field3200;

    @ObfuscatedName("jo.w")
    public boolean field3201 = false;

    @ObfuscatedName("jo.d")
    public static final int[] field3203 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @ObfuscatedName("jo.h")
    public static class249 field3206 = new class249(260);

    @ObfuscatedName("jo.c([I[Lfe;Z[IZII)V")
    public void method4854(int[] arg0, class161[] arg1, boolean arg2, int[] arg3, boolean arg4, int arg5) {
        this.field3200 = arg1;
        this.field3201 = arg2;
        this.method4855(arg0, arg3, arg4, arg5);
    }

    @ObfuscatedName("jo.b([I[IZII)V")
    public void method4855(int[] arg0, int[] arg1, boolean arg2, int arg3) {
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var5 = 0; var5 < 7; var5++) {
                for (int var6 = 0; var6 < Statics.field1787; var6++) {
                    class166 var7 = class166.method5923(var6);
                    if (var7 != null && !var7.field1783 && (arg2 ? 7 : 0) + var5 == var7.field1785) {
                        arg0[field3203[var5]] = var6 + 256;
                        break;
                    }
                }
            }
        }
        this.field3207 = arg0;
        this.field3199 = arg1;
        this.field3196 = arg2;
        this.field3195 = arg3;
        this.method4859();
    }

    @ObfuscatedName("jo.p(IZI)V")
    public void method4863(int arg0, boolean arg1) {
        if (arg0 == 1 && this.field3196) {
            return;
        }
        int var3 = this.field3207[field3203[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class166 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1787) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1787 - 1;
                }
            }
            var4 = class166.method5923(var3);
        } while (var4 == null || var4.field1783 || var4.field1785 != (this.field3196 ? 7 : 0) + arg0);
        this.field3207[field3203[arg0]] = var3 + 256;
        this.method4859();
    }

    @ObfuscatedName("jo.m(IZI)V")
    public void method4877(int arg0, boolean arg1) {
        int var3 = this.field3199[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1383[arg0].length) {
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
                    var3 = Statics.field1383[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3199[arg0] = var3;
        this.method4859();
    }

    @ObfuscatedName("jo.t(ZB)V")
    public void method4882(boolean arg0) {
        if (this.field3196 != arg0) {
            this.method4855((int[]) null, this.field3199, arg0, -1);
        }
    }

    @ObfuscatedName("jo.s(Lpi;I)V")
    public void method4866(class419 arg0) {
        arg0.method6841(this.field3196 ? 1 : 0);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3207[field3203[var2]];
            if (var3 == 0) {
                arg0.method6841(-1);
            } else {
                arg0.method6841(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method6841(this.field3199[var4]);
        }
    }

    @ObfuscatedName("jo.j(B)V")
    public void method4859() {
        long var1 = this.field3197;
        int var3 = this.field3207[5];
        int var4 = this.field3207[9];
        this.field3207[5] = var4;
        this.field3207[9] = var3;
        this.field3197 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3197 <<= 0x4;
            if (this.field3207[var5] >= 256) {
                this.field3197 += (long) (this.field3207[var5] - 256);
            }
        }
        if (this.field3207[0] >= 256) {
            this.field3197 += (long) (this.field3207[0] - 256 >> 4);
        }
        if (this.field3207[1] >= 256) {
            this.field3197 += (long) (this.field3207[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3197 <<= 0x3;
            this.field3197 += (long) this.field3199[var6];
        }
        this.field3197 <<= 0x1;
        this.field3197 += (long) (this.field3196 ? 1 : 0);
        this.field3207[5] = var3;
        this.field3207[9] = var4;
        if (var1 != 0L && this.field3197 != var1 || this.field3201) {
            field3206.method4516(var1);
        }
    }

    @ObfuscatedName("jo.w(Lgn;ILgn;IB)Lgo;")
    public class204 method4876(class183 arg0, int arg1, class183 arg2, int arg3) {
        if (this.field3195 != -1) {
            return class171.method4029(this.field3195).method2995(arg0, arg1, arg2, arg3);
        }
        long var5 = this.field3197;
        int[] var7 = this.field3207;
        if (arg0 != null && (arg0.field2091 >= 0 || arg0.field2095 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3207[var8];
            }
            if (arg0.field2091 >= 0) {
                var5 += (long) (arg0.field2091 - this.field3207[5] << 40);
                var7[5] = arg0.field2091;
            }
            if (arg0.field2095 >= 0) {
                var5 += (long) (arg0.field2095 - this.field3207[3] << 48);
                var7[3] = arg0.field2095;
            }
        }
        class204 var9 = (class204) field3206.method4514(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class166.method5923(var12 - 256).method2912()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class181.method2432(var12 - 512).method3277(this.field3196)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3202 != -1L) {
                    var9 = (class204) field3206.method4514(this.field3202);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class189[] var13 = new class189[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class189 var17 = class166.method5923(var16 - 256).method2913();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class181 var18 = class181.method2432(var16 - 512);
                        class189 var19 = var18.method3245(this.field3196);
                        if (var19 != null) {
                            if (this.field3200 != null) {
                                class161 var20 = this.field3200[var15];
                                if (var20 != null) {
                                    if (var20.field1733 != null && var18.field2015 != null && var18.field2035.length == var20.field1733.length) {
                                        for (int var21 = 0; var21 < var18.field2015.length; var21++) {
                                            var19.method3443(var18.field2035[var21], var20.field1733[var21]);
                                        }
                                    }
                                    if (var20.field1739 != null && var18.field2017 != null && var18.field2025.length == var20.field1739.length) {
                                        for (int var22 = 0; var22 < var18.field2017.length; var22++) {
                                            var19.method3456(var18.field2025[var22], var20.field1739[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class189 var23 = new class189(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3199[var24] < Statics.field1383[var24].length) {
                        var23.method3443(Statics.field3198[var24], Statics.field1383[var24][this.field3199[var24]]);
                    }
                    if (this.field3199[var24] < Statics.field3204[var24].length) {
                        var23.method3443(Statics.field1541[var24], Statics.field3204[var24][this.field3199[var24]]);
                    }
                }
                var9 = var23.method3450(64, 850, -30, -50, -30);
                field3206.method4515(var9, var5);
                this.field3202 = var5;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var9;
        }
        class204 var25;
        if (arg0 != null && arg2 != null) {
            var25 = arg0.method3370(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3332(var9, arg3);
        } else {
            var25 = arg0.method3332(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("jo.n(I)Lge;")
    public class189 method4861() {
        if (this.field3195 != -1) {
            return class171.method4029(this.field3195).method2991();
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3207[var2];
            if (var3 >= 256 && var3 < 512 && !class166.method5923(var3 - 256).method2911()) {
                var1 = true;
            }
            if (var3 >= 512 && !class181.method2432(var3 - 512).method3246(this.field3196)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class189[] var4 = new class189[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3207[var6];
            if (var7 >= 256 && var7 < 512) {
                class189 var8 = class166.method5923(var7 - 256).method2931();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class189 var9 = class181.method2432(var7 - 512).method3292(this.field3196);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class189 var10 = new class189(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3199[var11] < Statics.field1383[var11].length) {
                var10.method3443(Statics.field3198[var11], Statics.field1383[var11][this.field3199[var11]]);
            }
            if (this.field3199[var11] < Statics.field3204[var11].length) {
                var10.method3443(Statics.field1541[var11], Statics.field3204[var11][this.field3199[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("jo.r(I)I")
    public int method4862() {
        return this.field3195 == -1 ? (this.field3207[11] << 5) + (this.field3207[8] << 10) + (this.field3207[0] << 15) + (this.field3199[4] << 20) + (this.field3199[0] << 25) + this.field3207[1] : 305419896 + class171.method4029(this.field3195).field1850;
    }
}
