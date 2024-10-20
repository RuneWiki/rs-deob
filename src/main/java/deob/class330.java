package deob;

import java.util.Arrays;

@ObfuscatedName("mb")
public class class330 {

    @ObfuscatedName("mb.aw")
    public int[] field3567;

    @ObfuscatedName("mb.ay")
    public int[] field3561;

    @ObfuscatedName("mb.ar")
    public int[] field3562;

    @ObfuscatedName("mb.am")
    public int field3565 = -1;

    @ObfuscatedName("mb.as")
    public int field3564 = 0;

    @ObfuscatedName("mb.aj")
    public int field3573;

    @ObfuscatedName("mb.ag")
    public long field3566;

    @ObfuscatedName("mb.az")
    public long field3570;

    @ObfuscatedName("mb.av")
    public class184[] field3568;

    @ObfuscatedName("mb.ap")
    public boolean field3569 = false;

    @ObfuscatedName("mb.aa")
    public static final int[] field3560 = new int[] { class211.field2295.field2293, class211.field2298.field2293, class211.field2291.field2293, class211.field2302.field2293, class211.field2301.field2293, class211.field2294.field2293, class211.field2297.field2293 };

    @ObfuscatedName("mb.ab")
    public static class289 field3571 = new class289(260);

    @ObfuscatedName("mb.ad")
    public static class425 field3572 = new class425(16, class423.field4610);

    @ObfuscatedName("mb.ao")
    public static int field3563 = 0;

    public class330() {
    }

    public class330(class330 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3561, arg0.field3561.length);
        int[] var3 = Arrays.copyOf(arg0.field3567, arg0.field3567.length);
        class184[] var4 = (class184[]) (arg0.field3568 == null ? null : (class184[]) Arrays.copyOf(arg0.field3568, arg0.field3568.length));
        int[] var5 = Arrays.copyOf(arg0.field3562, arg0.field3562.length);
        this.method5516(var3, var2, var4, false, var5, arg0.field3564, arg0.field3573, arg0.field3565);
    }

    @ObfuscatedName("mb.aw([I[I[Lhv;Z[IIIII)V")
    public void method5516(int[] arg0, int[] arg1, class184[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3568 = arg2;
        this.field3569 = arg3;
        this.field3565 = arg7;
        this.method5517(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("mb.ay([I[I[IIII)V")
    public void method5517(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5518(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5518(arg3);
        }
        this.field3567 = arg0;
        this.field3561 = arg1;
        this.field3562 = arg2;
        this.field3564 = arg3;
        this.field3573 = arg4;
        this.method5522();
    }

    @ObfuscatedName("mb.ar(II)[I")
    public int[] method5518(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field1940; var4++) {
                class190 var5 = class190.method2893(var4);
                if (var5 != null && !var5.field1952 && var5.field1942 == var3 + (arg0 == 1 ? 7 : 0)) {
                    var2[field3560[var3]] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("mb.am(IZI)V")
    public void method5555(int arg0, boolean arg1) {
        int var3 = this.field3561[field3560[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class190 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1940) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1940 - 1;
                }
            }
            var4 = class190.method2893(var3);
        } while (var4 == null || var4.field1952 || arg0 + (this.field3564 == 1 ? 7 : 0) != var4.field1942);
        this.field3561[field3560[arg0]] = var3 + 256;
        this.method5522();
    }

    @ObfuscatedName("mb.as(IZI)V")
    public void method5541(int arg0, boolean arg1) {
        int var3 = this.field3562[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1777[arg0].length) {
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
                    var3 = Statics.field1777[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3562[arg0] = var3;
        this.method5522();
    }

    @ObfuscatedName("mb.aj(II)V")
    public void method5520(int arg0) {
        if (this.field3564 != arg0) {
            this.method5517((int[]) null, (int[]) null, this.field3562, arg0, -1);
        }
    }

    @ObfuscatedName("mb.ag(Lty;I)V")
    public void method5521(class514 arg0) {
        arg0.method8227(this.field3564);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3561[field3560[var2]];
            if (var3 == 0) {
                arg0.method8227(-1);
            } else {
                arg0.method8227(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8227(this.field3562[var4]);
        }
    }

    @ObfuscatedName("mb.az(B)V")
    public void method5522() {
        long var1 = this.field3566;
        int var3 = this.field3561[5];
        int var4 = this.field3561[9];
        this.field3561[5] = var4;
        this.field3561[9] = var3;
        this.field3566 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3566 <<= 0x4;
            if (this.field3561[var5] >= 256) {
                this.field3566 += (long) (this.field3561[var5] - 256);
            }
        }
        if (this.field3561[0] >= 256) {
            this.field3566 += (long) (this.field3561[0] - 256 >> 4);
        }
        if (this.field3561[1] >= 256) {
            this.field3566 += (long) (this.field3561[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3566 <<= 0x3;
            this.field3566 += (long) this.field3562[var6];
        }
        this.field3566 <<= 0x1;
        this.field3566 += (long) (this.field3564 * -1913194305) * 191395647L;
        this.field3561[5] = var3;
        this.field3561[9] = var4;
        if (var1 != 0L && this.field3566 != var1 || this.field3569) {
            field3571.method5148(var1);
        }
    }

    @ObfuscatedName("mb.av(Lig;ILig;IB)Ljo;")
    public class241 method5523(class210 arg0, int arg1, class210 arg2, int arg3) {
        if (this.field3573 != -1) {
            return class196.method4032(this.field3573).method3374(arg0, arg1, arg2, arg3, (class195) null);
        }
        long var5 = this.field3566;
        int[] var7 = this.field3561;
        if (arg0 != null && (arg0.field2274 >= 0 || arg0.field2281 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3561[var8];
            }
            if (arg0.field2274 >= 0) {
                var5 += (long) (arg0.field2274 - this.field3561[5] << 40);
                var7[5] = arg0.field2274;
            }
            if (arg0.field2281 >= 0) {
                var5 += (long) (arg0.field2281 - this.field3561[3] << 48);
                var7[3] = arg0.field2281;
            }
        }
        class241 var9 = (class241) field3571.method5152(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class190.method2893(var12 - 256).method3316()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class208.method2788(var12 - 512).method3705(this.field3564)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3570 != -1L) {
                    var9 = (class241) field3571.method5152(this.field3570);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class223[] var13 = new class223[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class223 var17 = class190.method2893(var16 - 256).method3324();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class208 var18 = class208.method2788(var16 - 512);
                        class223 var19 = var18.method3640(this.field3564);
                        if (var19 != null) {
                            if (this.field3568 != null) {
                                class184 var20 = this.field3568[var15];
                                if (var20 != null) {
                                    if (var20.field1889 != null && var18.field2191 != null && var18.field2196.length == var20.field1889.length) {
                                        for (int var21 = 0; var21 < var18.field2191.length; var21++) {
                                            var19.method3942(var18.field2196[var21], var20.field1889[var21]);
                                        }
                                    }
                                    if (var20.field1892 != null && var18.field2197 != null && var18.field2198.length == var20.field1892.length) {
                                        for (int var22 = 0; var22 < var18.field2197.length; var22++) {
                                            var19.method3943(var18.field2198[var22], var20.field1892[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class223 var23 = new class223(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3562[var24] < Statics.field1777[var24].length) {
                        var23.method3942(Statics.field197[var24], Statics.field1777[var24][this.field3562[var24]]);
                    }
                    if (this.field3562[var24] < Statics.field2981[var24].length) {
                        var23.method3942(Statics.field2763[var24], Statics.field2981[var24][this.field3562[var24]]);
                    }
                }
                var9 = var23.method3950(64, 850, -30, -50, -30);
                field3571.method5149(var9, var5);
                this.field3570 = var5;
            }
        }
        class241 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method4423(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3735(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3732(var9, arg3);
        } else {
            var25 = arg0.method3732(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("mb.ap(I)Lie;")
    public class223 method5524() {
        if (this.field3573 != -1) {
            return class196.method4032(this.field3573).method3379((class195) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3561[var2];
            if (var3 >= 256 && var3 < 512 && !class190.method2893(var3 - 256).method3318()) {
                var1 = true;
            }
            if (var3 >= 512 && !class208.method2788(var3 - 512).method3641(this.field3564)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class223[] var4 = new class223[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3561[var6];
            if (var7 >= 256 && var7 < 512) {
                class223 var8 = class190.method2893(var7 - 256).method3320();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class223 var9 = class208.method2788(var7 - 512).method3692(this.field3564);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class223 var10 = new class223(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3562[var11] < Statics.field1777[var11].length) {
                var10.method3942(Statics.field197[var11], Statics.field1777[var11][this.field3562[var11]]);
            }
            if (this.field3562[var11] < Statics.field2981[var11].length) {
                var10.method3942(Statics.field2763[var11], Statics.field2981[var11][this.field3562[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("mb.aq(I)I")
    public int method5525() {
        long var1 = this.field3566;
        if (this.field3573 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3573;
        }
        Integer var3 = (Integer) field3572.method7125(var1);
        if (var3 == null) {
            var3 = ++field3563 - 1;
            field3572.method7126(var1, var3);
            field3563 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("mb.at(I)V")
    public void method5526() {
        this.method5517(this.field3567, this.field3561, this.field3562, this.field3564, this.field3573);
    }
}
