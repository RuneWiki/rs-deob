package deob;

import java.util.Arrays;

@ObfuscatedName("ne")
public class class359 {

    @ObfuscatedName("ne.ap")
    public int[] field3828;

    @ObfuscatedName("ne.aw")
    public int[] field3818;

    @ObfuscatedName("ne.ak")
    public int[] field3817;

    @ObfuscatedName("ne.aj")
    public int field3820 = -1;

    @ObfuscatedName("ne.ai")
    public int field3821 = 0;

    @ObfuscatedName("ne.ay")
    public int field3832;

    @ObfuscatedName("ne.as")
    public long field3827;

    @ObfuscatedName("ne.ae")
    public long field3823;

    @ObfuscatedName("ne.am")
    public class176[] field3825;

    @ObfuscatedName("ne.at")
    public boolean field3826 = false;

    @ObfuscatedName("ne.az")
    public final int field3822 = class556.field5458 < 224 ? 512 : 2048;

    @ObfuscatedName("ne.ag")
    public static class316 field3831 = new class316(260);

    @ObfuscatedName("ne.ad")
    public static class466 field3829 = new class466(16, class464.field4961);

    @ObfuscatedName("ne.ac")
    public static int field3830 = 0;

    public class359() {
    }

    public class359(class359 arg0) {
        if (arg0 != null) {
            int[] var2 = Arrays.copyOf(arg0.field3818, arg0.field3818.length);
            int[] var3 = Arrays.copyOf(arg0.field3828, arg0.field3828.length);
            class176[] var4 = (class176[]) (arg0.field3825 == null ? null : (class176[]) Arrays.copyOf(arg0.field3825, arg0.field3825.length));
            int[] var5 = Arrays.copyOf(arg0.field3817, arg0.field3817.length);
            this.method6330(var3, var2, var4, false, var5, arg0.field3821, arg0.field3832, arg0.field3820);
        }
    }

    @ObfuscatedName("ne.ap([I[I[Lgz;Z[IIIII)V")
    public void method6330(int[] arg0, int[] arg1, class176[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3825 = arg2;
        this.field3826 = arg3;
        this.field3820 = arg7;
        this.method6331(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("ne.aw([I[I[IIII)V")
    public void method6331(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method6332(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method6332(arg3);
        }
        this.field3828 = arg0;
        this.field3818 = arg1;
        this.field3817 = arg2;
        this.field3821 = arg3;
        this.field3832 = arg4;
        this.method6400();
    }

    @ObfuscatedName("ne.ak(IB)[I")
    public int[] method6332(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field1939; var4++) {
                class186 var5 = class186.method6217(var4);
                if (var5 != null && !var5.field1940 && var5.method3653(var3, arg0)) {
                    var2[class199.method3794(var3)] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("hg.aj(I[IIB)V")
    public static void method3865(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field1939; var3++) {
            class186 var4 = (class186) class186.field1937.method5928((long) var3);
            class186 var5;
            if (var4 != null) {
                var5 = var4;
            } else if (Statics.field4651 == null) {
                var5 = null;
            } else {
                byte[] var6 = Statics.field4651.method7009(3, var3);
                class186 var7 = new class186();
                if (var6 != null) {
                    var7.method3651(new class558(var6));
                }
                class186.field1937.method5931(var7, (long) var3);
                var5 = var7;
            }
            if (var5 != null && !var5.field1940 && var5.method3653(arg2, arg0)) {
                arg1[class199.method3794(arg2)] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("ne.ai(IZI)V")
    public void method6353(int arg0, boolean arg1) {
        int var3 = this.field3818[class199.method3794(arg0)];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class186 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field1939) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1939 - 1;
                }
            }
            var4 = class186.method6217(var3);
        } while (var4 == null || var4.field1940 || !var4.method3653(arg0, this.field3821));
        this.field3818[class199.method3794(arg0)] = var3 + 256;
        this.method6400();
    }

    @ObfuscatedName("ne.ay(IZI)V")
    public void method6392(int arg0, boolean arg1) {
        int var3 = this.field3817[arg0];
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1982[arg0].length) {
                    var3 = 0;
                }
            } while (!class361.method2258(arg0, var3));
        } else {
            do {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field1982[arg0].length - 1;
                }
            } while (!class361.method2258(arg0, var3));
        }
        this.field3817[arg0] = var3;
        this.method6400();
    }

    @ObfuscatedName("ne.as(II)V")
    public void method6335(int arg0) {
        if (this.field3821 != arg0) {
            this.method6331((int[]) null, (int[]) null, this.field3817, arg0, -1);
        }
    }

    @ObfuscatedName("ne.ae(Lvl;I)V")
    public void method6336(class558 arg0) {
        arg0.method9241(this.field3821);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3818[class199.method3794(var2)];
            if (class556.field5458 >= 224) {
                if (var3 == 0) {
                    arg0.method9257(-1);
                } else {
                    arg0.method9257(var3 - 256);
                }
            } else if (var3 == 0) {
                arg0.method9241(-1);
            } else {
                arg0.method9241(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method9241(this.field3817[var4]);
        }
    }

    @ObfuscatedName("ne.am(I)V")
    public void method6400() {
        long var1 = this.field3827;
        long[] var3 = class558.field5465;
        this.field3827 = -1L;
        for (int var4 = 0; var4 < 12; var4++) {
            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) (this.field3818[var4] >> 24)) & 0xFFL)];
            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) (this.field3818[var4] >> 16)) & 0xFFL)];
            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) (this.field3818[var4] >> 8)) & 0xFFL)];
            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) this.field3818[var4]) & 0xFFL)];
        }
        if (this.field3825 != null) {
            for (int var5 = 0; var5 < this.field3825.length; var5++) {
                if (this.field3825[var5] != null) {
                    if (this.field3825[var5].field1873 != null) {
                        for (int var6 = 0; var6 < this.field3825[var5].field1873.length; var6++) {
                            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) (this.field3825[var5].field1873[var6] >> 8)) & 0xFFL)];
                            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) this.field3825[var5].field1873[var6]) & 0xFFL)];
                        }
                    }
                    if (this.field3825[var5].field1872 != null) {
                        for (int var7 = 0; var7 < this.field3825[var5].field1872.length; var7++) {
                            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) (this.field3825[var5].field1872[var7] >> 8)) & 0xFFL)];
                            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) this.field3825[var5].field1872[var7]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) this.field3817[var8]) & 0xFFL)];
        }
        this.field3827 = this.field3827 >>> 8 ^ var3[(int) ((this.field3827 ^ (long) this.field3821) & 0xFFL)];
        if (var1 != 0L && this.field3827 != var1 || this.field3826) {
            field3831.method5944(var1);
        }
    }

    @ObfuscatedName("ne.at(Liu;ILiu;II)Ljy;")
    public class256 method6338(class213 arg0, int arg1, class213 arg2, int arg3) {
        if (this.field3832 != -1) {
            return class195.method8497(this.field3832).method3775(arg0, arg1, arg2, arg3, (class194) null);
        }
        long var5 = this.field3827;
        int[] var7 = this.field3818;
        if (arg0 != null && (arg0.field2327 >= 0 || arg0.field2315 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.field3818, 0, var7, 0, var7.length);
            if (arg0.field2327 >= 0) {
                var5 ^= (long) (arg0.field2327 - this.field3818[class214.field2334.field2333]) << 40;
                var7[class214.field2334.field2333] = this.method6390(arg0.field2327);
            }
            if (arg0.field2315 >= 0) {
                var5 ^= (long) (arg0.field2315 - this.field3818[class214.field2339.field2333]) << 48;
                var7[class214.field2339.field2333] = this.method6390(arg0.field2315);
            }
        }
        class256 var8 = (class256) field3831.method5928(var5);
        if (var8 == null) {
            boolean var9 = false;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = var7[var10];
                if (this.method6346(var11)) {
                    class186 var12 = this.method6366(var11);
                    if (var12 != null && !var12.method3676()) {
                        var9 = true;
                    }
                }
                if (this.method6348(var11)) {
                    class176 var13 = this.field3825 == null ? null : this.field3825[var10];
                    if (!this.method6334(var11).method4036(this.field3821, var13)) {
                        var9 = true;
                    }
                }
            }
            if (var9) {
                if (this.field3823 != -1L) {
                    var8 = (class256) field3831.method5928(this.field3823);
                }
                if (var8 == null) {
                    return null;
                }
            }
            if (var8 == null) {
                class235[] var14 = new class235[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var7[var16];
                    if (this.method6346(var17)) {
                        class186 var18 = this.method6366(var17);
                        class235 var19 = null;
                        if (var18 != null) {
                            var19 = var18.method3668();
                        }
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (this.method6348(var17)) {
                        class211 var20 = this.method6334(var17);
                        class176 var21 = this.field3825 == null ? null : this.field3825[var16];
                        class235 var22 = var20.method4014(this.field3821, var21);
                        if (var22 != null) {
                            var14[var15++] = var22;
                        }
                    }
                }
                class235 var23 = new class235(var14, var15);
                for (int var24 = 0; var24 < 5; var24++) {
                    if (this.field3817[var24] < Statics.field1982[var24].length) {
                        var23.method4393(Statics.field4540[var24], Statics.field1982[var24][this.field3817[var24]]);
                    }
                    if (this.field3817[var24] < Statics.field3708[var24].length) {
                        var23.method4393(Statics.field903[var24], Statics.field3708[var24][this.field3817[var24]]);
                    }
                }
                var8 = var23.method4460(64, 850, -30, -50, -30);
                field3831.method5931(var8, var5);
                this.field3823 = var5;
            }
        }
        class256 var25;
        if (arg0 == null && arg2 == null) {
            var25 = var8.method4997(true);
        } else if (arg0 != null && arg2 != null) {
            var25 = arg0.method4097(var8, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var25 = arg2.method4139(var8, arg3);
        } else {
            var25 = arg0.method4139(var8, arg1);
        }
        return var25;
    }

    @ObfuscatedName("ne.au(I)Ljj;")
    public class235 method6339() {
        if (this.field3832 != -1) {
            return class195.method8497(this.field3832).method3762((class194) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3818[var2];
            if (this.method6346(var3)) {
                class186 var4 = this.method6366(var3);
                if (var4 != null && !var4.method3655()) {
                    var1 = true;
                }
            }
            if (this.method6348(var3)) {
                class176 var5 = this.field3825 == null ? null : this.field3825[var2];
                if (!this.method6334(var3).method4015(this.field3821, var5)) {
                    var1 = true;
                }
            }
        }
        if (var1) {
            return null;
        }
        class235[] var6 = new class235[12];
        int var7 = 0;
        for (int var8 = 0; var8 < 12; var8++) {
            int var9 = this.field3818[var8];
            if (this.method6346(var9)) {
                class186 var10 = this.method6366(var9);
                class235 var11 = null;
                if (var10 != null) {
                    var11 = var10.method3656();
                }
                if (var11 != null) {
                    var6[var7++] = var11;
                }
            }
            if (this.method6348(var9)) {
                class176 var12 = this.field3825 == null ? null : this.field3825[var8];
                class235 var13 = this.method6334(var9).method4044(this.field3821, var12);
                if (var13 != null) {
                    var6[var7++] = var13;
                }
            }
        }
        class235 var14 = new class235(var6, var7);
        for (int var15 = 0; var15 < 5; var15++) {
            if (this.field3817[var15] < Statics.field1982[var15].length) {
                var14.method4393(Statics.field4540[var15], Statics.field1982[var15][this.field3817[var15]]);
            }
            if (this.field3817[var15] < Statics.field3708[var15].length) {
                var14.method4393(Statics.field903[var15], Statics.field3708[var15][this.field3817[var15]]);
            }
        }
        return var14;
    }

    @ObfuscatedName("ne.an(I)I")
    public int method6358() {
        long var1 = this.field3827;
        if (this.field3832 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3832;
        }
        Integer var3 = (Integer) field3829.method8225(var1);
        if (var3 == null) {
            var3 = ++field3830 - 1;
            field3829.method8228(var1, var3);
            field3830 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("ne.ao(B)V")
    public void method6337() {
        this.method6331(this.field3828, this.field3818, this.field3817, this.field3821, this.field3832);
    }

    @ObfuscatedName("ne.af(III)V")
    public void method6342(int arg0, int arg1) {
        boolean var3 = this.field3821 != arg1;
        this.field3821 = arg1;
        if (var3) {
            if (this.field3821 == arg0) {
                for (int var4 = 0; var4 < 7; var4++) {
                    int var5 = class199.method3794(var4);
                    if (this.field3818[var5] > 0 && this.field3818[var5] < this.field3822) {
                        this.field3818[var5] = this.field3828[var5];
                    }
                }
            } else {
                if (this.field3818[0] < this.field3822 || this.method6343()) {
                    this.field3818[class214.field2331.field2333] = 1;
                }
                for (int var6 = 0; var6 < 7; var6++) {
                    int var7 = class199.method3794(var6);
                    if (this.field3818[var7] > 0 && this.field3818[var7] < this.field3822) {
                        method3865(arg1, this.field3818, var6);
                    }
                }
            }
        }
        this.method6337();
    }

    @ObfuscatedName("ne.ar(I)Z")
    public boolean method6343() {
        if (this.method6348(this.field3818[0])) {
            class211 var1 = this.method6334(this.field3818[0]);
            return class214.field2331.field2333 != var1.field2253 && class214.field2331.field2333 != var1.field2254;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ne.ab(IIB)V")
    public void method6329(int arg0, int arg1) {
        this.field3817[arg0] = arg1;
        this.method6337();
    }

    @ObfuscatedName("ne.az(II)V")
    public void method6345(int arg0) {
        class211 var2 = class211.method7530(arg0);
        this.field3818[var2.field2252] = this.field3822 + arg0;
        if (var2.field2253 != -1) {
            this.field3818[var2.field2253] = 0;
        }
        if (var2.field2254 != -1) {
            this.field3818[var2.field2254] = 0;
        }
        this.method6337();
    }

    @ObfuscatedName("ne.ag(IB)Z")
    public boolean method6346(int arg0) {
        return arg0 >= 256 && arg0 < this.field3822;
    }

    @ObfuscatedName("ne.ad(II)Lhu;")
    public class186 method6366(int arg0) {
        int var2 = arg0 - 256;
        class186 var3 = (class186) class186.field1937.method5928((long) var2);
        class186 var4;
        if (var3 != null) {
            var4 = var3;
        } else if (Statics.field4651 == null) {
            var4 = null;
        } else {
            byte[] var5 = Statics.field4651.method7009(3, var2);
            class186 var6 = new class186();
            if (var5 != null) {
                var6.method3651(new class558(var5));
            }
            class186.field1937.method5931(var6, (long) var2);
            var4 = var6;
        }
        return var4;
    }

    @ObfuscatedName("ne.ac(II)Z")
    public boolean method6348(int arg0) {
        return arg0 >= this.field3822;
    }

    @ObfuscatedName("ne.av(IB)Lip;")
    public class211 method6334(int arg0) {
        return class211.method7530(arg0 - this.field3822);
    }

    @ObfuscatedName("ne.ax(IS)I")
    public int method6390(int arg0) {
        return this.field3822 + (arg0 - 512);
    }
}
