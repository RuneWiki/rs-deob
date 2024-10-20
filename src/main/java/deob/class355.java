package deob;

import java.util.Arrays;

@ObfuscatedName("nt")
public class class355 {

    @ObfuscatedName("nt.ak")
    public int[] field3763;

    @ObfuscatedName("nt.al")
    public int[] field3760;

    @ObfuscatedName("nt.aj")
    public int[] field3757;

    @ObfuscatedName("nt.az")
    public int field3758 = -1;

    @ObfuscatedName("nt.af")
    public int field3756 = 0;

    @ObfuscatedName("nt.aa")
    public int field3764;

    @ObfuscatedName("nt.at")
    public long field3761;

    @ObfuscatedName("nt.ab")
    public long field3762;

    @ObfuscatedName("nt.ac")
    public class191[] field3768;

    @ObfuscatedName("nt.ao")
    public boolean field3755 = false;

    @ObfuscatedName("nt.ae")
    public static final int[] field3765 = new int[] { class228.field2444.field2450, class228.field2447.field2450, class228.field2448.field2450, class228.field2442.field2450, class228.field2445.field2450, class228.field2443.field2450, class228.field2446.field2450 };

    @ObfuscatedName("nt.au")
    public static class312 field3766 = new class312(260);

    @ObfuscatedName("nt.as")
    public static class461 field3759 = new class461(16, class459.field4878);

    @ObfuscatedName("nt.aw")
    public static int field3767 = 0;

    public class355() {
    }

    public class355(class355 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3760, arg0.field3760.length);
        int[] var3 = Arrays.copyOf(arg0.field3763, arg0.field3763.length);
        class191[] var4 = (class191[]) (arg0.field3768 == null ? null : (class191[]) Arrays.copyOf(arg0.field3768, arg0.field3768.length));
        int[] var5 = Arrays.copyOf(arg0.field3757, arg0.field3757.length);
        this.method5967(var3, var2, var4, false, var5, arg0.field3756, arg0.field3764, arg0.field3758);
    }

    @ObfuscatedName("nt.ak([I[I[Lha;Z[IIIII)V")
    public void method5967(int[] arg0, int[] arg1, class191[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3768 = arg2;
        this.field3755 = arg3;
        this.field3758 = arg7;
        this.method5936(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nt.al([I[I[IIII)V")
    public void method5936(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5937(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5937(arg3);
        }
        this.field3763 = arg0;
        this.field3760 = arg1;
        this.field3757 = arg2;
        this.field3756 = arg3;
        this.field3764 = arg4;
        this.method5963();
    }

    @ObfuscatedName("nt.aj(II)[I")
    public int[] method5937(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field4677; var4++) {
                class201 var5 = class201.method2995(var4);
                if (var5 != null && !var5.field2046 && var5.field2055 == (arg0 == 1 ? 7 : 0) + var3) {
                    var2[field3765[var3]] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("nt.az(IZI)V")
    public void method5968(int arg0, boolean arg1) {
        int var3 = this.field3760[field3765[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class201 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field4677) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4677 - 1;
                }
            }
            var4 = class201.method2995(var3);
        } while (var4 == null || var4.field2046 || (this.field3756 == 1 ? 7 : 0) + arg0 != var4.field2055);
        this.field3760[field3765[arg0]] = var3 + 256;
        this.method5963();
    }

    @ObfuscatedName("nt.af(IZI)V")
    public void method5939(int arg0, boolean arg1) {
        int var3 = this.field3757[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field4781[arg0].length) {
                    var3 = 0;
                }
            } while (!class357.method305(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4781[arg0].length - 1;
                }
            } while (!class357.method305(arg0, var3));
        }
        this.field3757[arg0] = var3;
        this.method5963();
    }

    @ObfuscatedName("nt.aa(IB)V")
    public void method5940(int arg0) {
        if (this.field3756 != arg0) {
            this.method5936((int[]) null, (int[]) null, this.field3757, arg0, -1);
        }
    }

    @ObfuscatedName("nt.at(Lua;B)V")
    public void method5941(class546 arg0) {
        arg0.method8779(this.field3756);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3760[field3765[var2]];
            if (var3 == 0) {
                arg0.method8779(-1);
            } else {
                arg0.method8779(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8779(this.field3757[var4]);
        }
    }

    @ObfuscatedName("nt.ab(I)V")
    public void method5963() {
        long var1 = this.field3761;
        int var3 = this.field3760[5];
        int var4 = this.field3760[9];
        this.field3760[5] = var4;
        this.field3760[9] = var3;
        this.field3761 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3761 <<= 0x4;
            if (this.field3760[var5] >= 256) {
                this.field3761 += (long) (this.field3760[var5] - 256);
            }
        }
        if (this.field3760[0] >= 256) {
            this.field3761 += (long) (this.field3760[0] - 256 >> 4);
        }
        if (this.field3760[1] >= 256) {
            this.field3761 += (long) (this.field3760[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3761 <<= 0x3;
            this.field3761 += (long) this.field3757[var6];
        }
        this.field3761 <<= 0x1;
        this.field3761 += (long) (this.field3756 * 437006277) * 340358925L;
        this.field3760[5] = var3;
        this.field3760[9] = var4;
        if (var1 != 0L && this.field3761 != var1 || this.field3755) {
            field3766.method5556(var1);
        }
    }

    @ObfuscatedName("nt.ac(Lic;ILic;IB)Lkb;")
    public class264 method5977(class227 arg0, int arg1, class227 arg2, int arg3) {
        if (this.field3764 != -1) {
            return class210.method2967(this.field3764).method3661(arg0, arg1, arg2, arg3, (class209) null);
        }
        long var5 = this.field3761;
        int[] var7 = this.field3760;
        if (arg0 != null && (arg0.field2428 >= 0 || arg0.field2429 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3760[var8];
            }
            if (arg0.field2428 >= 0) {
                var5 += (long) (arg0.field2428 - this.field3760[5] << 40);
                var7[5] = arg0.field2428;
            }
            if (arg0.field2429 >= 0) {
                var5 += (long) (arg0.field2429 - this.field3760[3] << 48);
                var7[3] = arg0.field2429;
            }
        }
        class264 var9 = (class264) field3766.method5570(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512) {
                    class201 var13 = class201.method2995(var12 - 256);
                    if (var13 != null && !var13.method3573()) {
                        var10 = true;
                    }
                }
                if (var12 >= 512 && !class225.method369(var12 - 512).method3953(this.field3756)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3762 != -1L) {
                    var9 = (class264) field3766.method5570(this.field3762);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class243[] var14 = new class243[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var7[var16];
                    if (var17 >= 256 && var17 < 512) {
                        class201 var18 = class201.method2995(var17 - 256);
                        class243 var19 = null;
                        if (var18 != null) {
                            var19 = var18.method3574();
                        }
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (var17 >= 512) {
                        class225 var20 = class225.method369(var17 - 512);
                        class243 var21 = var20.method3990(this.field3756);
                        if (var21 != null) {
                            if (this.field3768 != null) {
                                class191 var22 = this.field3768[var16];
                                if (var22 != null) {
                                    if (var22.field1977 != null && var20.field2340 != null && var20.field2365.length == var22.field1977.length) {
                                        for (int var23 = 0; var23 < var20.field2340.length; var23++) {
                                            var21.method4253(var20.field2365[var23], var22.field1977[var23]);
                                        }
                                    }
                                    if (var22.field1975 != null && var20.field2383 != null && var20.field2359.length == var22.field1975.length) {
                                        for (int var24 = 0; var24 < var20.field2383.length; var24++) {
                                            var21.method4280(var20.field2359[var24], var22.field1975[var24]);
                                        }
                                    }
                                }
                            }
                            var14[var15++] = var21;
                        }
                    }
                }
                class243 var25 = new class243(var14, var15);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3757[var26] < Statics.field4781[var26].length) {
                        var25.method4253(Statics.field295[var26], Statics.field4781[var26][this.field3757[var26]]);
                    }
                    if (this.field3757[var26] < Statics.field2492[var26].length) {
                        var25.method4253(Statics.field495[var26], Statics.field2492[var26][this.field3757[var26]]);
                    }
                }
                var9 = var25.method4252(64, 850, -30, -50, -30);
                field3766.method5564(var9, var5);
                this.field3762 = var5;
            }
        }
        class264 var27;
        if (arg0 == null && arg2 == null) {
            var27 = var9.method4842(true);
        } else if (arg0 != null && arg2 != null) {
            var27 = arg0.method4015(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var27 = arg2.method4012(var9, arg3);
        } else {
            var27 = arg0.method4012(var9, arg1);
        }
        return var27;
    }

    @ObfuscatedName("nt.ao(I)Ljb;")
    public class243 method5944() {
        if (this.field3764 != -1) {
            return class210.method2967(this.field3764).method3662((class209) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3760[var2];
            if (var3 >= 256 && var3 < 512) {
                class201 var4 = class201.method2995(var3 - 256);
                if (var4 != null && !var4.method3572()) {
                    var1 = true;
                }
            }
            if (var3 >= 512 && !class225.method369(var3 - 512).method3936(this.field3756)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class243[] var5 = new class243[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3760[var7];
            if (var8 >= 256 && var8 < 512) {
                class201 var9 = class201.method2995(var8 - 256);
                class243 var10 = null;
                if (var9 != null) {
                    var10 = var9.method3576();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (var8 >= 512) {
                class243 var11 = class225.method369(var8 - 512).method3937(this.field3756);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class243 var12 = new class243(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3757[var13] < Statics.field4781[var13].length) {
                var12.method4253(Statics.field295[var13], Statics.field4781[var13][this.field3757[var13]]);
            }
            if (this.field3757[var13] < Statics.field2492[var13].length) {
                var12.method4253(Statics.field495[var13], Statics.field2492[var13][this.field3757[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("nt.ah(I)I")
    public int method5945() {
        long var1 = this.field3761;
        if (this.field3764 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3764;
        }
        Integer var3 = (Integer) field3759.method7767(var1);
        if (var3 == null) {
            var3 = ++field3767 - 1;
            field3759.method7772(var1, var3);
            field3767 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nt.av(I)V")
    public void method5946() {
        this.method5936(this.field3763, this.field3760, this.field3757, this.field3756, this.field3764);
    }
}
