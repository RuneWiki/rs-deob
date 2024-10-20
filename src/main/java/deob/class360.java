package deob;

import java.util.Arrays;

@ObfuscatedName("nr")
public class class360 {

    @ObfuscatedName("nr.ac")
    public int[] field3805;

    @ObfuscatedName("nr.ae")
    public int[] field3792;

    @ObfuscatedName("nr.ag")
    public int[] field3794;

    @ObfuscatedName("nr.am")
    public int field3795 = -1;

    @ObfuscatedName("nr.ax")
    public int field3796 = 0;

    @ObfuscatedName("nr.aq")
    public int field3797;

    @ObfuscatedName("nr.af")
    public long field3798;

    @ObfuscatedName("nr.at")
    public long field3799;

    @ObfuscatedName("nr.au")
    public class176[] field3793;

    @ObfuscatedName("nr.ar")
    public boolean field3801 = false;

    @ObfuscatedName("nr.aa")
    public final int field3800 = class549.field5408 < 224 ? 512 : 2048;

    @ObfuscatedName("nr.ai")
    public static class317 field3803 = new class317(260);

    @ObfuscatedName("nr.ao")
    public static class465 field3806 = new class465(16, class463.field4932);

    @ObfuscatedName("nr.as")
    public static int field3807 = 0;

    public class360() {
    }

    public class360(class360 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3792, arg0.field3792.length);
        int[] var3 = Arrays.copyOf(arg0.field3805, arg0.field3805.length);
        class176[] var4 = (class176[]) (arg0.field3793 == null ? null : (class176[]) Arrays.copyOf(arg0.field3793, arg0.field3793.length));
        int[] var5 = Arrays.copyOf(arg0.field3794, arg0.field3794.length);
        this.method6202(var3, var2, var4, false, var5, arg0.field3796, arg0.field3797, arg0.field3795);
    }

    @ObfuscatedName("nr.ac([I[I[Lgv;Z[IIIII)V")
    public void method6202(int[] arg0, int[] arg1, class176[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3793 = arg2;
        this.field3801 = arg3;
        this.field3795 = arg7;
        this.method6204(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nr.ae([I[I[IIIB)V")
    public void method6204(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method6171(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method6171(arg3);
        }
        this.field3805 = arg0;
        this.field3792 = arg1;
        this.field3794 = arg2;
        this.field3796 = arg3;
        this.field3797 = arg4;
        this.method6176();
    }

    @ObfuscatedName("nr.ag(IB)[I")
    public int[] method6171(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field1940; var4++) {
                class186 var5 = Statics.method4117(var4);
                if (var5 != null && !var5.field1937 && var5.method3505(var3, arg0)) {
                    if (class199.field2073 == null) {
                        class199.method3656();
                    }
                    int var7 = class199.field2073[var3];
                    var2[var7] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("nr.am(IZI)V")
    public void method6196(int arg0, boolean arg1) {
        int[] var3 = this.field3792;
        if (class199.field2073 == null) {
            class199.method3656();
        }
        int var4 = class199.field2073[arg0];
        int var5 = var3[var4];
        if (var5 == 0) {
            return;
        }
        var5 -= 256;
        class186 var6;
        do {
            if (arg1) {
                var5++;
                if (var5 >= Statics.field1940) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = Statics.field1940 - 1;
                }
            }
            var6 = Statics.method4117(var5);
        } while (var6 == null || var6.field1937 || !var6.method3505(arg0, this.field3796));
        int[] var7 = this.field3792;
        if (class199.field2073 == null) {
            class199.method3656();
        }
        int var8 = class199.field2073[arg0];
        var7[var8] = var5 + 256;
        this.method6176();
    }

    @ObfuscatedName("nr.ax(IZI)V")
    public void method6219(int arg0, boolean arg1) {
        int var3 = this.field3794[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2770[arg0].length) {
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
                    var3 = Statics.field2770[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3794[arg0] = var3;
        this.method6176();
    }

    @ObfuscatedName("nr.aq(II)V")
    public void method6206(int arg0) {
        if (this.field3796 != arg0) {
            this.method6204((int[]) null, (int[]) null, this.field3794, arg0, -1);
        }
    }

    @ObfuscatedName("nr.af(Lvf;B)V")
    public void method6175(class551 arg0) {
        arg0.method9022(this.field3796);
        for (int var2 = 0; var2 < 7; var2++) {
            int[] var3 = this.field3792;
            if (class199.field2073 == null) {
                class199.method3656();
            }
            int var4 = class199.field2073[var2];
            int var5 = var3[var4];
            if (class549.field5408 >= 224) {
                if (var5 == 0) {
                    arg0.method8958(-1);
                } else {
                    arg0.method8958(var5 - 256);
                }
            } else if (var5 == 0) {
                arg0.method9022(-1);
            } else {
                arg0.method9022(var5 - 256);
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            arg0.method9022(this.field3794[var6]);
        }
    }

    @ObfuscatedName("nr.at(B)V")
    public void method6176() {
        long var1 = this.field3798;
        long[] var3 = class551.field5414;
        this.field3798 = -1L;
        for (int var4 = 0; var4 < 12; var4++) {
            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) (this.field3792[var4] >> 24)) & 0xFFL)];
            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) (this.field3792[var4] >> 16)) & 0xFFL)];
            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) (this.field3792[var4] >> 8)) & 0xFFL)];
            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) this.field3792[var4]) & 0xFFL)];
        }
        if (this.field3793 != null) {
            for (int var5 = 0; var5 < this.field3793.length; var5++) {
                if (this.field3793[var5] != null) {
                    if (this.field3793[var5].field1867 != null) {
                        for (int var6 = 0; var6 < this.field3793[var5].field1867.length; var6++) {
                            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) (this.field3793[var5].field1867[var6] >> 8)) & 0xFFL)];
                            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) this.field3793[var5].field1867[var6]) & 0xFFL)];
                        }
                    }
                    if (this.field3793[var5].field1868 != null) {
                        for (int var7 = 0; var7 < this.field3793[var5].field1868.length; var7++) {
                            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) (this.field3793[var5].field1868[var7] >> 8)) & 0xFFL)];
                            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) this.field3793[var5].field1868[var7]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) this.field3794[var8]) & 0xFFL)];
        }
        this.field3798 = this.field3798 >>> 8 ^ var3[(int) ((this.field3798 ^ (long) this.field3796) & 0xFFL)];
        if (var1 != 0L && this.field3798 != var1 || this.field3801) {
            field3803.method5732(var1);
        }
    }

    @ObfuscatedName("nr.au(Lif;ILif;II)Ljm;")
    public class256 method6177(class213 arg0, int arg1, class213 arg2, int arg3) {
        if (this.field3797 != -1) {
            return class195.method3383(this.field3797).method3600(arg0, arg1, arg2, arg3, (class194) null);
        }
        long var5 = this.field3798;
        int[] var7 = this.field3792;
        if (arg0 != null && (arg0.field2323 >= 0 || arg0.field2332 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.field3792, 0, var7, 0, var7.length);
            if (arg0.field2323 >= 0) {
                var5 ^= (long) (arg0.field2323 - this.field3792[class214.field2339.field2348]) << 40;
                var7[class214.field2339.field2348] = this.method6197(arg0.field2323);
            }
            if (arg0.field2332 >= 0) {
                var5 ^= (long) (arg0.field2332 - this.field3792[class214.field2334.field2348]) << 48;
                var7[class214.field2334.field2348] = this.method6197(arg0.field2332);
            }
        }
        class256 var8 = (class256) field3803.method5733(var5);
        if (var8 == null) {
            boolean var9 = false;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = var7[var10];
                if (this.method6185(var11)) {
                    class186 var12 = this.method6186(var11);
                    if (var12 != null && !var12.method3506()) {
                        var9 = true;
                    }
                }
                if (this.method6187(var11) && !this.method6188(var11).method3915(this.field3796)) {
                    var9 = true;
                }
            }
            if (var9) {
                if (this.field3799 != -1L) {
                    var8 = (class256) field3803.method5733(this.field3799);
                }
                if (var8 == null) {
                    return null;
                }
            }
            if (var8 == null) {
                class235[] var13 = new class235[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (this.method6185(var16)) {
                        class186 var17 = this.method6186(var16);
                        class235 var18 = null;
                        if (var17 != null) {
                            var18 = var17.method3507();
                        }
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (this.method6187(var16)) {
                        class211 var19 = this.method6188(var16);
                        class235 var20 = var19.method3855(this.field3796);
                        if (var20 != null) {
                            if (this.field3793 != null) {
                                class176 var21 = this.field3793[var15];
                                if (var21 != null) {
                                    if (var21.field1867 != null && var19.field2237 != null && var19.field2238.length == var21.field1867.length) {
                                        for (int var22 = 0; var22 < var19.field2237.length; var22++) {
                                            var20.method4254(var19.field2238[var22], var21.field1867[var22]);
                                        }
                                    }
                                    if (var21.field1868 != null && var19.field2232 != null && var19.field2240.length == var21.field1868.length) {
                                        for (int var23 = 0; var23 < var19.field2232.length; var23++) {
                                            var20.method4259(var19.field2240[var23], var21.field1868[var23]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var20;
                        }
                    }
                }
                class235 var24 = new class235(var13, var14);
                for (int var25 = 0; var25 < 5; var25++) {
                    if (this.field3794[var25] < Statics.field2770[var25].length) {
                        var24.method4254(Statics.field3802[var25], Statics.field2770[var25][this.field3794[var25]]);
                    }
                    if (this.field3794[var25] < Statics.field49[var25].length) {
                        var24.method4254(Statics.field2769[var25], Statics.field49[var25][this.field3794[var25]]);
                    }
                }
                var8 = var24.method4266(64, 850, -30, -50, -30);
                field3803.method5735(var8, var5);
                this.field3799 = var5;
            }
        }
        class256 var26;
        if (arg0 == null && arg2 == null) {
            var26 = var8.method4810(true);
        } else if (arg0 != null && arg2 != null) {
            var26 = arg0.method3951(var8, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var26 = arg2.method3948(var8, arg3);
        } else {
            var26 = arg0.method3948(var8, arg1);
        }
        return var26;
    }

    @ObfuscatedName("nr.ar(I)Ljv;")
    public class235 method6178() {
        if (this.field3797 != -1) {
            return class195.method3383(this.field3797).method3601((class194) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3792[var2];
            if (this.method6185(var3)) {
                class186 var4 = this.method6186(var3);
                if (var4 != null && !var4.method3508()) {
                    var1 = true;
                }
            }
            if (this.method6187(var3) && !this.method6188(var3).method3856(this.field3796)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class235[] var5 = new class235[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3792[var7];
            if (this.method6185(var8)) {
                class186 var9 = this.method6186(var8);
                class235 var10 = null;
                if (var9 != null) {
                    var10 = var9.method3520();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (this.method6187(var8)) {
                class235 var11 = this.method6188(var8).method3857(this.field3796);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class235 var12 = new class235(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3794[var13] < Statics.field2770[var13].length) {
                var12.method4254(Statics.field3802[var13], Statics.field2770[var13][this.field3794[var13]]);
            }
            if (this.field3794[var13] < Statics.field49[var13].length) {
                var12.method4254(Statics.field2769[var13], Statics.field49[var13][this.field3794[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("nr.al(B)I")
    public int method6179() {
        long var1 = this.field3798;
        if (this.field3797 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3797;
        }
        Integer var3 = (Integer) field3806.method7960(var1);
        if (var3 == null) {
            var3 = ++field3807 - 1;
            field3806.method7961(var1, var3);
            field3807 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nr.ad(I)V")
    public void method6180() {
        this.method6204(this.field3805, this.field3792, this.field3794, this.field3796, this.field3797);
    }

    @ObfuscatedName("nr.ah(III)V")
    public void method6181(int arg0, int arg1) {
        boolean var3 = this.field3796 != arg1;
        this.field3796 = arg1;
        if (var3) {
            if (this.field3796 == arg0) {
                for (int var4 = 0; var4 < 7; var4++) {
                    if (class199.field2073 == null) {
                        class199.method3656();
                    }
                    int var5 = class199.field2073[var4];
                    if (this.field3792[var5] > 0 && this.field3792[var5] < this.field3800) {
                        this.field3792[var5] = this.field3805[var5];
                    }
                }
            } else {
                if (this.field3792[0] < this.field3800 || this.method6182()) {
                    this.field3792[class214.field2345.field2348] = 1;
                }
                for (int var7 = 0; var7 < 7; var7++) {
                    if (class199.field2073 == null) {
                        class199.method3656();
                    }
                    int var8 = class199.field2073[var7];
                    if (this.field3792[var8] > 0 && this.field3792[var8] < this.field3800) {
                        int[] var10 = this.field3792;
                        for (int var11 = 0; var11 < Statics.field1940; var11++) {
                            class186 var12 = Statics.method4117(var11);
                            if (var12 != null && !var12.field1937 && var12.method3505(var7, arg1)) {
                                if (class199.field2073 == null) {
                                    class199.method3656();
                                }
                                int var14 = class199.field2073[var7];
                                var10[var14] = var11 + 256;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.method6180();
    }

    @ObfuscatedName("nr.ap(B)Z")
    public boolean method6182() {
        if (this.method6187(this.field3792[0])) {
            class211 var1 = this.method6188(this.field3792[0]);
            return class214.field2345.field2348 != var1.field2231 && class214.field2345.field2348 != var1.field2278;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nr.ab(III)V")
    public void method6183(int arg0, int arg1) {
        this.field3794[arg0] = arg1;
        this.method6180();
    }

    @ObfuscatedName("nr.az(II)V")
    public void method6184(int arg0) {
        class211 var2 = class211.method2414(arg0);
        this.field3792[var2.field2229] = this.field3800 + arg0;
        if (var2.field2231 != -1) {
            this.field3792[var2.field2231] = 0;
        }
        if (var2.field2278 != -1) {
            this.field3792[var2.field2278] = 0;
        }
        this.method6180();
    }

    @ObfuscatedName("nr.aa(II)Z")
    public boolean method6185(int arg0) {
        return arg0 >= 256 && arg0 < this.field3800;
    }

    @ObfuscatedName("nr.ai(II)Lhr;")
    public class186 method6186(int arg0) {
        return Statics.method4117(arg0 - 256);
    }

    @ObfuscatedName("nr.ao(II)Z")
    public boolean method6187(int arg0) {
        return arg0 >= this.field3800;
    }

    @ObfuscatedName("nr.as(IS)Lis;")
    public class211 method6188(int arg0) {
        return class211.method2414(arg0 - this.field3800);
    }

    @ObfuscatedName("nr.ay(II)I")
    public int method6197(int arg0) {
        return this.field3800 + (arg0 - 512);
    }
}
