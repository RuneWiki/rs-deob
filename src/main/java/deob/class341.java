package deob;

import java.util.Arrays;

@ObfuscatedName("nb")
public class class341 {

    @ObfuscatedName("nb.at")
    public int[] field3597;

    @ObfuscatedName("nb.ah")
    public int[] field3598;

    @ObfuscatedName("nb.ar")
    public int[] field3611;

    @ObfuscatedName("nb.ao")
    public int field3599 = -1;

    @ObfuscatedName("nb.ab")
    public int field3601 = 0;

    @ObfuscatedName("nb.au")
    public int field3606;

    @ObfuscatedName("nb.aa")
    public long field3603;

    @ObfuscatedName("nb.ac")
    public long field3609;

    @ObfuscatedName("nb.al")
    public class170[] field3605;

    @ObfuscatedName("nb.az")
    public boolean field3604 = false;

    @ObfuscatedName("nb.ay")
    public static final int[] field3608 = new int[] { class206.field2243.field2246, class206.field2232.field2246, class206.field2236.field2246, class206.field2238.field2246, class206.field2241.field2246, class206.field2237.field2246, class206.field2242.field2246 };

    @ObfuscatedName("nb.am")
    public static class299 field3610 = new class299(260);

    @ObfuscatedName("nb.aq")
    public static class436 field3600 = new class436(16, class434.field4646);

    @ObfuscatedName("nb.ai")
    public static int field3612 = 0;

    public class341() {
    }

    public class341(class341 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3598, arg0.field3598.length);
        int[] var3 = Arrays.copyOf(arg0.field3597, arg0.field3597.length);
        class170[] var4 = (class170[]) (arg0.field3605 == null ? null : (class170[]) Arrays.copyOf(arg0.field3605, arg0.field3605.length));
        int[] var5 = Arrays.copyOf(arg0.field3611, arg0.field3611.length);
        this.method5664(var3, var2, var4, false, var5, arg0.field3601, arg0.field3606, arg0.field3599);
    }

    @ObfuscatedName("nb.at([I[I[Lgx;Z[IIIII)V")
    public void method5664(int[] arg0, int[] arg1, class170[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3605 = arg2;
        this.field3604 = arg3;
        this.field3599 = arg7;
        this.method5665(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nb.ah([I[I[IIIB)V")
    public void method5665(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5669(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5669(arg3);
        }
        this.field3597 = arg0;
        this.field3598 = arg1;
        this.field3611 = arg2;
        this.field3601 = arg3;
        this.field3606 = arg4;
        this.method5672();
    }

    @ObfuscatedName("nb.ar(IB)[I")
    public int[] method5669(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method4061(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("iz.ao(I[III)V")
    public static void method4061(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field3826; var3++) {
            class180 var4 = class180.method13(var3);
            if (var4 != null && !var4.field1861 && var4.field1857 == (arg0 == 1 ? 7 : 0) + arg2) {
                arg1[field3608[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("nb.ab(IZI)V")
    public void method5667(int arg0, boolean arg1) {
        int var3 = this.field3598[field3608[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class180 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field3826) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3826 - 1;
                }
            }
            var4 = class180.method13(var3);
        } while (var4 == null || var4.field1861 || var4.field1857 != arg0 + (this.field3601 == 1 ? 7 : 0));
        this.field3598[field3608[arg0]] = var3 + 256;
        this.method5672();
    }

    @ObfuscatedName("nb.au(IZB)V")
    public void method5668(int arg0, boolean arg1) {
        int var3 = this.field3611[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1095[arg0].length) {
                    var3 = 0;
                }
            } while (!class343.method2262(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1095[arg0].length - 1;
                }
            } while (!class343.method2262(arg0, var3));
        }
        this.field3611[arg0] = var3;
        this.method5672();
    }

    @ObfuscatedName("nb.aa(II)V")
    public void method5673(int arg0) {
        if (this.field3601 != arg0) {
            this.method5665((int[]) null, (int[]) null, this.field3611, arg0, -1);
        }
    }

    @ObfuscatedName("nb.ac(Luj;B)V")
    public void method5666(class527 arg0) {
        arg0.method8393(this.field3601);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3598[field3608[var2]];
            if (var3 == 0) {
                arg0.method8393(-1);
            } else {
                arg0.method8393(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8393(this.field3611[var4]);
        }
    }

    @ObfuscatedName("nb.al(I)V")
    public void method5672() {
        long var1 = this.field3603;
        int var3 = this.field3598[5];
        int var4 = this.field3598[9];
        this.field3598[5] = var4;
        this.field3598[9] = var3;
        this.field3603 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3603 <<= 0x4;
            if (this.field3598[var5] >= 256) {
                this.field3603 += (long) (this.field3598[var5] - 256);
            }
        }
        if (this.field3598[0] >= 256) {
            this.field3603 += (long) (this.field3598[0] - 256 >> 4);
        }
        if (this.field3598[1] >= 256) {
            this.field3603 += (long) (this.field3598[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3603 <<= 0x3;
            this.field3603 += (long) this.field3611[var6];
        }
        this.field3603 <<= 0x1;
        this.field3603 += (long) (this.field3601 * -249993281) * -857831361L;
        this.field3598[5] = var3;
        this.field3598[9] = var4;
        if (var1 != 0L && this.field3603 != var1 || this.field3604) {
            field3610.method5290(var1);
        }
    }

    @ObfuscatedName("nb.az(Lhx;ILhx;II)Lka;")
    public class280 method5671(class205 arg0, int arg1, class205 arg2, int arg3) {
        if (this.field3606 != -1) {
            return class189.method3442(this.field3606).method3422(arg0, arg1, arg2, arg3, (class188) null);
        }
        long var5 = this.field3603;
        int[] var7 = this.field3598;
        if (arg0 != null && (arg0.field2215 >= 0 || arg0.field2226 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3598[var8];
            }
            if (arg0.field2215 >= 0) {
                var5 += (long) (arg0.field2215 - this.field3598[5] << 40);
                var7[5] = arg0.field2215;
            }
            if (arg0.field2226 >= 0) {
                var5 += (long) (arg0.field2226 - this.field3598[3] << 48);
                var7[3] = arg0.field2226;
            }
        }
        class280 var9 = (class280) field3610.method5289(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class180.method13(var12 - 256).method3294()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class203.method3907(var12 - 512).method3643(this.field3601)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3609 != -1L) {
                    var9 = (class280) field3610.method5289(this.field3609);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class262[] var13 = new class262[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class262 var17 = class180.method13(var16 - 256).method3295();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class203 var18 = class203.method3907(var16 - 512);
                        class262 var19 = var18.method3646(this.field3601);
                        if (var19 != null) {
                            if (this.field3605 != null) {
                                class170 var20 = this.field3605[var15];
                                if (var20 != null) {
                                    if (var20.field1793 != null && var18.field2140 != null && var18.field2134.length == var20.field1793.length) {
                                        for (int var21 = 0; var21 < var18.field2140.length; var21++) {
                                            var19.method4585(var18.field2134[var21], var20.field1793[var21]);
                                        }
                                    }
                                    if (var20.field1794 != null && var18.field2142 != null && var18.field2143.length == var20.field1794.length) {
                                        for (int var22 = 0; var22 < var18.field2142.length; var22++) {
                                            var19.method4641(var18.field2143[var22], var20.field1794[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class262 var23 = new class262(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3611[var24] < Statics.field1095[var24].length) {
                        var23.method4585(Statics.field2441[var24], Statics.field1095[var24][this.field3611[var24]]);
                    }
                    if (this.field3611[var24] < Statics.field3607[var24].length) {
                        var23.method4585(Statics.field5016[var24], Statics.field3607[var24][this.field3611[var24]]);
                    }
                }
                var9 = var23.method4593(64, 850, -30, -50, -30);
                field3610.method5303(var9, var5);
                this.field3609 = var5;
            }
        }
        class280 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method5029(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3730(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3727(var9, arg3);
        } else {
            var25 = arg0.method3727(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("nb.ap(I)Lkq;")
    public class262 method5696() {
        if (this.field3606 != -1) {
            return class189.method3442(this.field3606).method3383((class188) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3598[var2];
            if (var3 >= 256 && var3 < 512 && !class180.method13(var3 - 256).method3296()) {
                var1 = true;
            }
            if (var3 >= 512 && !class203.method3907(var3 - 512).method3645(this.field3601)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class262[] var4 = new class262[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3598[var6];
            if (var7 >= 256 && var7 < 512) {
                class262 var8 = class180.method13(var7 - 256).method3297();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class262 var9 = class203.method3907(var7 - 512).method3671(this.field3601);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class262 var10 = new class262(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3611[var11] < Statics.field1095[var11].length) {
                var10.method4585(Statics.field2441[var11], Statics.field1095[var11][this.field3611[var11]]);
            }
            if (this.field3611[var11] < Statics.field3607[var11].length) {
                var10.method4585(Statics.field5016[var11], Statics.field3607[var11][this.field3611[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("nb.av(I)I")
    public int method5689() {
        long var1 = this.field3603;
        if (this.field3606 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3606;
        }
        Integer var3 = (Integer) field3600.method7307(var1);
        if (var3 == null) {
            var3 = ++field3612 - 1;
            field3600.method7322(var1, var3);
            field3612 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nb.ax(I)V")
    public void method5674() {
        this.method5665(this.field3597, this.field3598, this.field3611, this.field3601, this.field3606);
    }

    @ObfuscatedName("it.as(I)V")
    public static void method4017() {
        field3610.method5292();
        field3600.method7309();
        field3612 = 0;
    }
}
