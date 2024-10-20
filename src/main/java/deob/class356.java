package deob;

import java.util.Arrays;

@ObfuscatedName("ne")
public class class356 {

    @ObfuscatedName("ne.aq")
    public int[] field3772;

    @ObfuscatedName("ne.ad")
    public int[] field3773;

    @ObfuscatedName("ne.ag")
    public int[] field3774;

    @ObfuscatedName("ne.ak")
    public int field3784 = -1;

    @ObfuscatedName("ne.ap")
    public int field3776 = 0;

    @ObfuscatedName("ne.an")
    public int field3777;

    @ObfuscatedName("ne.aj")
    public long field3780;

    @ObfuscatedName("ne.av")
    public long field3779;

    @ObfuscatedName("ne.ab")
    public class173[] field3775;

    @ObfuscatedName("ne.ai")
    public boolean field3781 = false;

    @ObfuscatedName("ne.ax")
    public static final int[] field3778 = new int[] { class211.field2315.field2312, class211.field2308.field2312, class211.field2318.field2312, class211.field2313.field2312, class211.field2316.field2312, class211.field2321.field2312, class211.field2311.field2312 };

    @ObfuscatedName("ne.ay")
    public static class313 field3783 = new class313(260);

    @ObfuscatedName("ne.ao")
    public static class462 field3782 = new class462(16, class460.field4898);

    @ObfuscatedName("ne.aa")
    public static int field3785 = 0;

    public class356() {
    }

    public class356(class356 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3773, arg0.field3773.length);
        int[] var3 = Arrays.copyOf(arg0.field3772, arg0.field3772.length);
        class173[] var4 = (class173[]) (arg0.field3775 == null ? null : (class173[]) Arrays.copyOf(arg0.field3775, arg0.field3775.length));
        int[] var5 = Arrays.copyOf(arg0.field3774, arg0.field3774.length);
        this.method5948(var3, var2, var4, false, var5, arg0.field3776, arg0.field3777, arg0.field3784);
    }

    @ObfuscatedName("ne.aq([I[I[Lgz;Z[IIIIB)V")
    public void method5948(int[] arg0, int[] arg1, class173[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3775 = arg2;
        this.field3781 = arg3;
        this.field3784 = arg7;
        this.method5917(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("ne.ad([I[I[IIII)V")
    public void method5917(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5925(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5925(arg3);
        }
        this.field3772 = arg0;
        this.field3773 = arg1;
        this.field3774 = arg2;
        this.field3776 = arg3;
        this.field3777 = arg4;
        this.method5922();
    }

    @ObfuscatedName("ne.ag(II)[I")
    public int[] method5925(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method5544(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("mh.ak(I[III)V")
    public static void method5544(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field3647; var3++) {
            class184 var4 = class184.method826(var3);
            if (var4 != null && !var4.field1927 && var4.field1920 == (arg0 == 1 ? 7 : 0) + arg2) {
                arg1[field3778[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("ne.ap(IZI)V")
    public void method5915(int arg0, boolean arg1) {
        int var3 = this.field3773[field3778[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class184 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3647) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3647 - 1;
                }
            }
            var4 = class184.method826(var3);
        } while (var4 == null || var4.field1927 || var4.field1920 != arg0 + (this.field3776 == 1 ? 7 : 0));
        this.field3773[field3778[arg0]] = var3 + 256;
        this.method5922();
    }

    @ObfuscatedName("ne.an(IZI)V")
    public void method5934(int arg0, boolean arg1) {
        int var3 = this.field3774[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1372[arg0].length) {
                    var3 = 0;
                }
            } while (!Statics.method13(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1372[arg0].length - 1;
                }
            } while (!Statics.method13(arg0, var3));
        }
        this.field3774[arg0] = var3;
        this.method5922();
    }

    @ObfuscatedName("ne.aj(II)V")
    public void method5920(int arg0) {
        if (this.field3776 != arg0) {
            this.method5917((int[]) null, (int[]) null, this.field3774, arg0, -1);
        }
    }

    @ObfuscatedName("ne.av(Lvp;I)V")
    public void method5921(class547 arg0) {
        arg0.method8711(this.field3776);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3773[field3778[var2]];
            if (var3 == 0) {
                arg0.method8711(-1);
            } else {
                arg0.method8711(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8711(this.field3774[var4]);
        }
    }

    @ObfuscatedName("ne.ab(I)V")
    public void method5922() {
        long var1 = this.field3780;
        int var3 = this.field3773[5];
        int var4 = this.field3773[9];
        this.field3773[5] = var4;
        this.field3773[9] = var3;
        this.field3780 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3780 <<= 0x4;
            if (this.field3773[var5] >= 256) {
                this.field3780 += (long) (this.field3773[var5] - 256);
            }
        }
        if (this.field3773[0] >= 256) {
            this.field3780 += (long) (this.field3773[0] - 256 >> 4);
        }
        if (this.field3773[1] >= 256) {
            this.field3780 += (long) (this.field3773[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3780 <<= 0x3;
            this.field3780 += (long) this.field3774[var6];
        }
        this.field3780 <<= 0x1;
        this.field3780 += (long) (this.field3776 * 1073281455) * -1570243249L;
        this.field3773[5] = var3;
        this.field3773[9] = var4;
        if (var1 != 0L && this.field3780 != var1 || this.field3781) {
            field3783.method5503(var1);
        }
    }

    @ObfuscatedName("ne.ai(Lii;ILii;II)Llv;")
    public class294 method5923(class210 arg0, int arg1, class210 arg2, int arg3) {
        if (this.field3777 != -1) {
            return class193.method2064(this.field3777).method3450(arg0, arg1, arg2, arg3, (class192) null);
        }
        long var5 = this.field3780;
        int[] var7 = this.field3773;
        if (arg0 != null && (arg0.field2302 >= 0 || arg0.field2301 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3773[var8];
            }
            if (arg0.field2302 >= 0) {
                var5 += (long) (arg0.field2302 - this.field3773[5] << 40);
                var7[5] = arg0.field2302;
            }
            if (arg0.field2301 >= 0) {
                var5 += (long) (arg0.field2301 - this.field3773[3] << 48);
                var7[3] = arg0.field2301;
            }
        }
        class294 var9 = (class294) field3783.method5495(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512) {
                    class184 var13 = class184.method826(var12 - 256);
                    if (var13 != null && !var13.method3329()) {
                        var10 = true;
                    }
                }
                if (var12 >= 512 && !class208.method3193(var12 - 512).method3665(this.field3776)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3779 != -1L) {
                    var9 = (class294) field3783.method5495(this.field3779);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class273[] var14 = new class273[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var7[var16];
                    if (var17 >= 256 && var17 < 512) {
                        class184 var18 = class184.method826(var17 - 256);
                        class273 var19 = null;
                        if (var18 != null) {
                            var19 = var18.method3330();
                        }
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (var17 >= 512) {
                        class208 var20 = class208.method3193(var17 - 512);
                        class273 var21 = var20.method3670(this.field3776);
                        if (var21 != null) {
                            if (this.field3775 != null) {
                                class173 var22 = this.field3775[var16];
                                if (var22 != null) {
                                    if (var22.field1846 != null && var20.field2218 != null && var20.field2236.length == var22.field1846.length) {
                                        for (int var23 = 0; var23 < var20.field2218.length; var23++) {
                                            var21.method4732(var20.field2236[var23], var22.field1846[var23]);
                                        }
                                    }
                                    if (var22.field1847 != null && var20.field2220 != null && var20.field2221.length == var22.field1847.length) {
                                        for (int var24 = 0; var24 < var20.field2220.length; var24++) {
                                            var21.method4741(var20.field2221[var24], var22.field1847[var24]);
                                        }
                                    }
                                }
                            }
                            var14[var15++] = var21;
                        }
                    }
                }
                class273 var25 = new class273(var14, var15);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3774[var26] < Statics.field1372[var26].length) {
                        var25.method4732(Statics.field4863[var26], Statics.field1372[var26][this.field3774[var26]]);
                    }
                    if (this.field3774[var26] < Statics.field1099[var26].length) {
                        var25.method4732(Statics.field830[var26], Statics.field1099[var26][this.field3774[var26]]);
                    }
                }
                var9 = var25.method4682(64, 850, -30, -50, -30);
                field3783.method5498(var9, var5);
                this.field3779 = var5;
            }
        }
        class294 var27;
        if (arg0 == null && arg2 == null) {
            var27 = var9.method5311(true);
        } else if (arg0 != null && arg2 != null) {
            var27 = arg0.method3754(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var27 = arg2.method3751(var9, arg3);
        } else {
            var27 = arg0.method3751(var9, arg1);
        }
        return var27;
    }

    @ObfuscatedName("ne.ae(B)Lkr;")
    public class273 method5924() {
        if (this.field3777 != -1) {
            return class193.method2064(this.field3777).method3406((class192) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3773[var2];
            if (var3 >= 256 && var3 < 512) {
                class184 var4 = class184.method826(var3 - 256);
                if (var4 != null && !var4.method3327()) {
                    var1 = true;
                }
            }
            if (var3 >= 512 && !class208.method3193(var3 - 512).method3681(this.field3776)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class273[] var5 = new class273[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3773[var7];
            if (var8 >= 256 && var8 < 512) {
                class184 var9 = class184.method826(var8 - 256);
                class273 var10 = null;
                if (var9 != null) {
                    var10 = var9.method3326();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (var8 >= 512) {
                class273 var11 = class208.method3193(var8 - 512).method3712(this.field3776);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class273 var12 = new class273(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3774[var13] < Statics.field1372[var13].length) {
                var12.method4732(Statics.field4863[var13], Statics.field1372[var13][this.field3774[var13]]);
            }
            if (this.field3774[var13] < Statics.field1099[var13].length) {
                var12.method4732(Statics.field830[var13], Statics.field1099[var13][this.field3774[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("ne.au(B)I")
    public int method5926() {
        long var1 = this.field3780;
        if (this.field3777 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3777;
        }
        Integer var3 = (Integer) field3782.method7728(var1);
        if (var3 == null) {
            var3 = ++field3785 - 1;
            field3782.method7729(var1, var3);
            field3785 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("ne.ah(I)V")
    public void method5914() {
        this.method5917(this.field3772, this.field3773, this.field3774, this.field3776, this.field3777);
    }

    @ObfuscatedName("cb.az(B)V")
    public static void method2057() {
        field3783.method5500();
        field3782.method7731();
        field3785 = 0;
    }
}
