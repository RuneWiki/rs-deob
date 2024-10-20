package deob;

import java.util.Arrays;

@ObfuscatedName("nt")
public class class347 {

    @ObfuscatedName("nt.aq")
    public int[] field3667;

    @ObfuscatedName("nt.aw")
    public int[] field3669;

    @ObfuscatedName("nt.al")
    public int[] field3664;

    @ObfuscatedName("nt.ai")
    public int field3665 = -1;

    @ObfuscatedName("nt.ar")
    public int field3666 = 0;

    @ObfuscatedName("nt.as")
    public int field3663;

    @ObfuscatedName("nt.aa")
    public long field3668;

    @ObfuscatedName("nt.az")
    public long field3676;

    @ObfuscatedName("nt.ao")
    public class171[] field3670;

    @ObfuscatedName("nt.au")
    public boolean field3671 = false;

    @ObfuscatedName("nt.ax")
    public static final int[] field3673 = new int[] { class208.field2284.field2290, class208.field2281.field2290, class208.field2280.field2290, class208.field2288.field2290, class208.field2285.field2290, class208.field2282.field2290, class208.field2286.field2290 };

    @ObfuscatedName("nt.am")
    public static class304 field3674 = new class304(260);

    @ObfuscatedName("nt.ad")
    public static class443 field3675 = new class443(16, class441.field4713);

    @ObfuscatedName("nt.at")
    public static int field3662 = 0;

    public class347() {
    }

    public class347(class347 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3669, arg0.field3669.length);
        int[] var3 = Arrays.copyOf(arg0.field3667, arg0.field3667.length);
        class171[] var4 = (class171[]) (arg0.field3670 == null ? null : (class171[]) Arrays.copyOf(arg0.field3670, arg0.field3670.length));
        int[] var5 = Arrays.copyOf(arg0.field3664, arg0.field3664.length);
        this.method5813(var3, var2, var4, false, var5, arg0.field3666, arg0.field3663, arg0.field3665);
    }

    @ObfuscatedName("nt.aq([I[I[Lgj;Z[IIIII)V")
    public void method5813(int[] arg0, int[] arg1, class171[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3670 = arg2;
        this.field3671 = arg3;
        this.field3665 = arg7;
        this.method5814(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nt.aw([I[I[IIII)V")
    public void method5814(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5838(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5838(arg3);
        }
        this.field3667 = arg0;
        this.field3669 = arg1;
        this.field3664 = arg2;
        this.field3666 = arg3;
        this.field3663 = arg4;
        this.method5820();
    }

    @ObfuscatedName("nt.al(II)[I")
    public int[] method5838(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method3223(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("gp.ai(I[IIS)V")
    public static void method3223(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field1895; var3++) {
            class181 var4 = class181.method6578(var3);
            if (var4 != null && !var4.field1904 && var4.field1902 == (arg0 == 1 ? 7 : 0) + arg2) {
                arg1[field3673[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("nt.ar(IZI)V")
    public void method5821(int arg0, boolean arg1) {
        int var3 = this.field3669[field3673[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class181 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1895) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1895 - 1;
                }
            }
            var4 = class181.method6578(var3);
        } while (var4 == null || var4.field1904 || var4.field1902 != (this.field3666 == 1 ? 7 : 0) + arg0);
        this.field3669[field3673[arg0]] = var3 + 256;
        this.method5820();
    }

    @ObfuscatedName("nt.as(IZI)V")
    public void method5817(int arg0, boolean arg1) {
        int var3 = this.field3664[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field4548[arg0].length) {
                    var3 = 0;
                }
            } while (!class349.method3151(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field4548[arg0].length - 1;
                }
            } while (!class349.method3151(arg0, var3));
        }
        this.field3664[arg0] = var3;
        this.method5820();
    }

    @ObfuscatedName("nt.aa(IB)V")
    public void method5839(int arg0) {
        if (this.field3666 != arg0) {
            this.method5814((int[]) null, (int[]) null, this.field3664, arg0, -1);
        }
    }

    @ObfuscatedName("nt.az(Luq;I)V")
    public void method5819(class534 arg0) {
        arg0.method8574(this.field3666);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3669[field3673[var2]];
            if (var3 == 0) {
                arg0.method8574(-1);
            } else {
                arg0.method8574(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8574(this.field3664[var4]);
        }
    }

    @ObfuscatedName("nt.ao(I)V")
    public void method5820() {
        long var1 = this.field3668;
        int var3 = this.field3669[5];
        int var4 = this.field3669[9];
        this.field3669[5] = var4;
        this.field3669[9] = var3;
        this.field3668 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3668 <<= 0x4;
            if (this.field3669[var5] >= 256) {
                this.field3668 += (long) (this.field3669[var5] - 256);
            }
        }
        if (this.field3669[0] >= 256) {
            this.field3668 += (long) (this.field3669[0] - 256 >> 4);
        }
        if (this.field3669[1] >= 256) {
            this.field3668 += (long) (this.field3669[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3668 <<= 0x3;
            this.field3668 += (long) this.field3664[var6];
        }
        this.field3668 <<= 0x1;
        this.field3668 += (long) (this.field3666 * 1692184319) * 1283608831L;
        this.field3669[5] = var3;
        this.field3669[9] = var4;
        if (var1 != 0L && this.field3668 != var1 || this.field3671) {
            field3674.method5416(var1);
        }
    }

    @ObfuscatedName("nt.au(Lhs;ILhs;IB)Lkz;")
    public class285 method5837(class207 arg0, int arg1, class207 arg2, int arg3) {
        if (this.field3663 != -1) {
            return class190.method3274(this.field3663).method3372(arg0, arg1, arg2, arg3, (class189) null);
        }
        long var5 = this.field3668;
        int[] var7 = this.field3669;
        if (arg0 != null && (arg0.field2263 >= 0 || arg0.field2269 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3669[var8];
            }
            if (arg0.field2263 >= 0) {
                var5 += (long) (arg0.field2263 - this.field3669[5] << 40);
                var7[5] = arg0.field2263;
            }
            if (arg0.field2269 >= 0) {
                var5 += (long) (arg0.field2269 - this.field3669[3] << 48);
                var7[3] = arg0.field2269;
            }
        }
        class285 var9 = (class285) field3674.method5414(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512) {
                    class181 var13 = class181.method6578(var12 - 256);
                    if (var13 != null && !var13.method3285()) {
                        var10 = true;
                    }
                }
                if (var12 >= 512 && !class205.method6353(var12 - 512).method3643(this.field3666)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3676 != -1L) {
                    var9 = (class285) field3674.method5414(this.field3676);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class267[] var14 = new class267[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var7[var16];
                    if (var17 >= 256 && var17 < 512) {
                        class181 var18 = class181.method6578(var17 - 256);
                        class267 var19 = null;
                        if (var18 != null) {
                            var19 = var18.method3299();
                        }
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (var17 >= 512) {
                        class205 var20 = class205.method6353(var17 - 512);
                        class267 var21 = var20.method3644(this.field3666);
                        if (var21 != null) {
                            if (this.field3670 != null) {
                                class171 var22 = this.field3670[var16];
                                if (var22 != null) {
                                    if (var22.field1835 != null && var20.field2184 != null && var20.field2223.length == var22.field1835.length) {
                                        for (int var23 = 0; var23 < var20.field2184.length; var23++) {
                                            var21.method4664(var20.field2223[var23], var22.field1835[var23]);
                                        }
                                    }
                                    if (var22.field1836 != null && var20.field2186 != null && var20.field2179.length == var22.field1836.length) {
                                        for (int var24 = 0; var24 < var20.field2186.length; var24++) {
                                            var21.method4666(var20.field2179[var24], var22.field1836[var24]);
                                        }
                                    }
                                }
                            }
                            var14[var15++] = var21;
                        }
                    }
                }
                class267 var25 = new class267(var14, var15);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3664[var26] < Statics.field4548[var26].length) {
                        var25.method4664(Statics.field1423[var26], Statics.field4548[var26][this.field3664[var26]]);
                    }
                    if (this.field3664[var26] < Statics.field1666[var26].length) {
                        var25.method4664(Statics.field3672[var26], Statics.field1666[var26][this.field3664[var26]]);
                    }
                }
                var9 = var25.method4723(64, 850, -30, -50, -30);
                field3674.method5421(var9, var5);
                this.field3676 = var5;
            }
        }
        class285 var27;
        if (arg0 == null && arg2 == null) {
            var27 = var9.method5150(true);
        } else if (arg0 != null && arg2 != null) {
            var27 = arg0.method3728(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var27 = arg2.method3725(var9, arg3);
        } else {
            var27 = arg0.method3725(var9, arg1);
        }
        return var27;
    }

    @ObfuscatedName("nt.ak(B)Lkf;")
    public class267 method5822() {
        if (this.field3663 != -1) {
            return class190.method3274(this.field3663).method3373((class189) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3669[var2];
            if (var3 >= 256 && var3 < 512) {
                class181 var4 = class181.method6578(var3 - 256);
                if (var4 != null && !var4.method3287()) {
                    var1 = true;
                }
            }
            if (var3 >= 512 && !class205.method6353(var3 - 512).method3645(this.field3666)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class267[] var5 = new class267[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3669[var7];
            if (var8 >= 256 && var8 < 512) {
                class181 var9 = class181.method6578(var8 - 256);
                class267 var10 = null;
                if (var9 != null) {
                    var10 = var9.method3288();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (var8 >= 512) {
                class267 var11 = class205.method6353(var8 - 512).method3690(this.field3666);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class267 var12 = new class267(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3664[var13] < Statics.field4548[var13].length) {
                var12.method4664(Statics.field1423[var13], Statics.field4548[var13][this.field3664[var13]]);
            }
            if (this.field3664[var13] < Statics.field1666[var13].length) {
                var12.method4664(Statics.field3672[var13], Statics.field1666[var13][this.field3664[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("nt.ah(I)I")
    public int method5849() {
        long var1 = this.field3668;
        if (this.field3663 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3663;
        }
        Integer var3 = (Integer) field3675.method7453(var1);
        if (var3 == null) {
            var3 = ++field3662 - 1;
            field3675.method7456(var1, var3);
            field3662 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nt.aj(B)V")
    public void method5823() {
        this.method5814(this.field3667, this.field3669, this.field3664, this.field3666, this.field3663);
    }
}
