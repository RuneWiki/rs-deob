package deob;

import java.util.Arrays;

@ObfuscatedName("nz")
public class class344 {

    @ObfuscatedName("nz.am")
    public int[] field3644;

    @ObfuscatedName("nz.ap")
    public int[] field3638;

    @ObfuscatedName("nz.af")
    public int[] field3639;

    @ObfuscatedName("nz.aj")
    public int field3640 = -1;

    @ObfuscatedName("nz.aq")
    public int field3641 = 0;

    @ObfuscatedName("nz.ar")
    public int field3642;

    @ObfuscatedName("nz.ag")
    public long field3643;

    @ObfuscatedName("nz.ao")
    public long field3648;

    @ObfuscatedName("nz.ae")
    public class169[] field3645;

    @ObfuscatedName("nz.aa")
    public boolean field3646 = false;

    @ObfuscatedName("nz.aw")
    public static final int[] field3637 = new int[] { class206.field2256.field2260, class206.field2258.field2260, class206.field2252.field2260, class206.field2254.field2260, class206.field2262.field2260, class206.field2255.field2260, class206.field2257.field2260 };

    @ObfuscatedName("nz.ak")
    public static class302 field3651 = new class302(260);

    @ObfuscatedName("nz.ay")
    public static class440 field3652 = new class440(16, class438.field4678);

    @ObfuscatedName("nz.as")
    public static int field3653 = 0;

    public class344() {
    }

    public class344(class344 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3638, arg0.field3638.length);
        int[] var3 = Arrays.copyOf(arg0.field3644, arg0.field3644.length);
        class169[] var4 = (class169[]) (arg0.field3645 == null ? null : (class169[]) Arrays.copyOf(arg0.field3645, arg0.field3645.length));
        int[] var5 = Arrays.copyOf(arg0.field3639, arg0.field3639.length);
        this.method5766(var3, var2, var4, false, var5, arg0.field3641, arg0.field3642, arg0.field3640);
    }

    @ObfuscatedName("nz.am([I[I[Lgb;Z[IIIII)V")
    public void method5766(int[] arg0, int[] arg1, class169[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3645 = arg2;
        this.field3646 = arg3;
        this.field3640 = arg7;
        this.method5767(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nz.ap([I[I[IIII)V")
    public void method5767(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5768(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5768(arg3);
        }
        this.field3644 = arg0;
        this.field3638 = arg1;
        this.field3639 = arg2;
        this.field3641 = arg3;
        this.field3642 = arg4;
        this.method5773();
    }

    @ObfuscatedName("nz.af(II)[I")
    public int[] method5768(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field1872; var4++) {
                class180 var5 = class180.method6334(var4);
                if (var5 != null && !var5.field1881 && (arg0 == 1 ? 7 : 0) + var3 == var5.field1870) {
                    var2[field3637[var3]] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("nz.aj(IZI)V")
    public void method5774(int arg0, boolean arg1) {
        int var3 = this.field3638[field3637[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class180 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1872) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1872 - 1;
                }
            }
            var4 = class180.method6334(var3);
        } while (var4 == null || var4.field1881 || (this.field3641 == 1 ? 7 : 0) + arg0 != var4.field1870);
        this.field3638[field3637[arg0]] = var3 + 256;
        this.method5773();
    }

    @ObfuscatedName("nz.aq(IZI)V")
    public void method5782(int arg0, boolean arg1) {
        int var3 = this.field3639[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field3647[arg0].length) {
                    var3 = 0;
                }
            } while (!class346.method3319(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field3647[arg0].length - 1;
                }
            } while (!class346.method3319(arg0, var3));
        }
        this.field3639[arg0] = var3;
        this.method5773();
    }

    @ObfuscatedName("nz.ar(II)V")
    public void method5780(int arg0) {
        if (this.field3641 != arg0) {
            this.method5767((int[]) null, (int[]) null, this.field3639, arg0, -1);
        }
    }

    @ObfuscatedName("nz.ag(Luk;B)V")
    public void method5772(class531 arg0) {
        arg0.method8699(this.field3641);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3638[field3637[var2]];
            if (var3 == 0) {
                arg0.method8699(-1);
            } else {
                arg0.method8699(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8699(this.field3639[var4]);
        }
    }

    @ObfuscatedName("nz.ao(I)V")
    public void method5773() {
        long var1 = this.field3643;
        int var3 = this.field3638[5];
        int var4 = this.field3638[9];
        this.field3638[5] = var4;
        this.field3638[9] = var3;
        this.field3643 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3643 <<= 0x4;
            if (this.field3638[var5] >= 256) {
                this.field3643 += (long) (this.field3638[var5] - 256);
            }
        }
        if (this.field3638[0] >= 256) {
            this.field3643 += (long) (this.field3638[0] - 256 >> 4);
        }
        if (this.field3638[1] >= 256) {
            this.field3643 += (long) (this.field3638[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3643 <<= 0x3;
            this.field3643 += (long) this.field3639[var6];
        }
        this.field3643 <<= 0x1;
        this.field3643 += (long) (this.field3641 * -1386633269) * 2080622051L;
        this.field3638[5] = var3;
        this.field3638[9] = var4;
        if (var1 != 0L && this.field3643 != var1 || this.field3646) {
            field3651.method5401(var1);
        }
    }

    @ObfuscatedName("nz.ae(Lhl;ILhl;IB)Lko;")
    public class283 method5776(class205 arg0, int arg1, class205 arg2, int arg3) {
        if (this.field3642 != -1) {
            return class189.method2165(this.field3642).method3422(arg0, arg1, arg2, arg3, (class188) null);
        }
        long var5 = this.field3643;
        int[] var7 = this.field3638;
        if (arg0 != null && (arg0.field2241 >= 0 || arg0.field2219 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3638[var8];
            }
            if (arg0.field2241 >= 0) {
                var5 += (long) (arg0.field2241 - this.field3638[5] << 40);
                var7[5] = arg0.field2241;
            }
            if (arg0.field2219 >= 0) {
                var5 += (long) (arg0.field2219 - this.field3638[3] << 48);
                var7[3] = arg0.field2219;
            }
        }
        class283 var9 = (class283) field3651.method5400(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512 && !class180.method6334(var12 - 256).method3323()) {
                    var10 = true;
                }
                if (var12 >= 512 && !class203.method5762(var12 - 512).method3672(this.field3641)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3648 != -1L) {
                    var9 = (class283) field3651.method5400(this.field3648);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class265[] var13 = new class265[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (var16 >= 256 && var16 < 512) {
                        class265 var17 = class180.method6334(var16 - 256).method3336();
                        if (var17 != null) {
                            var13[var14++] = var17;
                        }
                    }
                    if (var16 >= 512) {
                        class203 var18 = class203.method5762(var16 - 512);
                        class265 var19 = var18.method3667(this.field3641);
                        if (var19 != null) {
                            if (this.field3645 != null) {
                                class169 var20 = this.field3645[var15];
                                if (var20 != null) {
                                    if (var20.field1797 != null && var18.field2177 != null && var18.field2157.length == var20.field1797.length) {
                                        for (int var21 = 0; var21 < var18.field2177.length; var21++) {
                                            var19.method4664(var18.field2157[var21], var20.field1797[var21]);
                                        }
                                    }
                                    if (var20.field1795 != null && var18.field2146 != null && var18.field2196.length == var20.field1795.length) {
                                        for (int var22 = 0; var22 < var18.field2146.length; var22++) {
                                            var19.method4665(var18.field2196[var22], var20.field1795[var22]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var19;
                        }
                    }
                }
                class265 var23 = new class265(var13, var14);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3639[var24] < Statics.field3647[var24].length) {
                        var23.method4664(Statics.field5246[var24], Statics.field3647[var24][this.field3639[var24]]);
                    }
                    if (this.field3639[var24] < Statics.field114[var24].length) {
                        var23.method4664(Statics.field3649[var24], Statics.field114[var24][this.field3639[var24]]);
                    }
                }
                var9 = var23.method4672(64, 850, -30, -50, -30);
                field3651.method5402(var9, var5);
                this.field3648 = var5;
            }
        }
        class283 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var9.method5132(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method3776(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method3789(var9, arg3);
        } else {
            var25 = arg0.method3789(var9, arg1);
        }
        return var25;
    }

    @ObfuscatedName("nz.aa(I)Lkm;")
    public class265 method5806() {
        if (this.field3642 != -1) {
            return class189.method2165(this.field3642).method3401((class188) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3638[var2];
            if (var3 >= 256 && var3 < 512 && !class180.method6334(var3 - 256).method3349()) {
                var1 = true;
            }
            if (var3 >= 512 && !class203.method5762(var3 - 512).method3696(this.field3641)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class265[] var4 = new class265[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = this.field3638[var6];
            if (var7 >= 256 && var7 < 512) {
                class265 var8 = class180.method6334(var7 - 256).method3326();
                if (var8 != null) {
                    var4[var5++] = var8;
                }
            }
            if (var7 >= 512) {
                class265 var9 = class203.method5762(var7 - 512).method3675(this.field3641);
                if (var9 != null) {
                    var4[var5++] = var9;
                }
            }
        }
        class265 var10 = new class265(var4, var5);
        for (int var11 = 0; var11 < 5; var11++) {
            if (this.field3639[var11] < Statics.field3647[var11].length) {
                var10.method4664(Statics.field5246[var11], Statics.field3647[var11][this.field3639[var11]]);
            }
            if (this.field3639[var11] < Statics.field114[var11].length) {
                var10.method4664(Statics.field3649[var11], Statics.field114[var11][this.field3639[var11]]);
            }
        }
        return var10;
    }

    @ObfuscatedName("nz.au(I)I")
    public int method5794() {
        long var1 = this.field3643;
        if (this.field3642 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3642;
        }
        Integer var3 = (Integer) field3652.method7442(var1);
        if (var3 == null) {
            var3 = ++field3653 - 1;
            field3652.method7449(var1, var3);
            field3653 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nz.an(I)V")
    public void method5777() {
        this.method5767(this.field3644, this.field3638, this.field3639, this.field3641, this.field3642);
    }

    @ObfuscatedName("dx.ad(I)V")
    public static void method2428() {
        field3651.method5403();
        field3652.method7446();
        field3653 = 0;
    }
}
