package deob;

import java.util.Arrays;

@ObfuscatedName("nt")
public class class358 {

    @ObfuscatedName("nt.ab")
    public int[] field3743;

    @ObfuscatedName("nt.ay")
    public int[] field3741;

    @ObfuscatedName("nt.an")
    public int[] field3740;

    @ObfuscatedName("nt.au")
    public int field3742 = -1;

    @ObfuscatedName("nt.ax")
    public int field3745 = 0;

    @ObfuscatedName("nt.ao")
    public int field3744;

    @ObfuscatedName("nt.am")
    public long field3739;

    @ObfuscatedName("nt.ac")
    public long field3746;

    @ObfuscatedName("nt.ae")
    public class227[] field3747;

    @ObfuscatedName("nt.ad")
    public boolean field3748 = false;

    @ObfuscatedName("nt.aa")
    public final int field3751 = class547.field5372 < 224 ? 512 : 2048;

    @ObfuscatedName("nt.ah")
    public static class315 field3752 = new class315(260);

    @ObfuscatedName("nt.ag")
    public static class463 field3754 = new class463(16, class461.field4877);

    @ObfuscatedName("nt.av")
    public static int field3756 = 0;

    public class358() {
    }

    public class358(class358 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3741, arg0.field3741.length);
        int[] var3 = Arrays.copyOf(arg0.field3743, arg0.field3743.length);
        class227[] var4 = (class227[]) (arg0.field3747 == null ? null : (class227[]) Arrays.copyOf(arg0.field3747, arg0.field3747.length));
        int[] var5 = Arrays.copyOf(arg0.field3740, arg0.field3740.length);
        this.method5996(var3, var2, var4, false, var5, arg0.field3745, arg0.field3744, arg0.field3742);
    }

    @ObfuscatedName("nt.ab([I[I[Lid;Z[IIIII)V")
    public void method5996(int[] arg0, int[] arg1, class227[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3747 = arg2;
        this.field3748 = arg3;
        this.field3742 = arg7;
        this.method6025(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nt.ay([I[I[IIII)V")
    public void method6025(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5998(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5998(arg3);
        }
        this.field3743 = arg0;
        this.field3741 = arg1;
        this.field3740 = arg2;
        this.field3745 = arg3;
        this.field3744 = arg4;
        this.method6002();
    }

    @ObfuscatedName("nt.an(II)[I")
    public int[] method5998(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            for (int var4 = 0; var4 < Statics.field2336; var4++) {
                class237 var5 = class237.method3341(var4);
                if (var5 != null && !var5.field2506 && var5.method4433(var3, arg0)) {
                    if (class250.field2637 == null) {
                        class250.field2637 = new int[7];
                        class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
                        class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
                        class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
                        class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
                        class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
                        class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
                        class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
                    }
                    int var8 = class250.field2637[var3];
                    var2[var8] = var4 + 256;
                    break;
                }
            }
        }
        return var2;
    }

    @ObfuscatedName("nt.au(IZI)V")
    public void method5999(int arg0, boolean arg1) {
        int[] var3 = this.field3741;
        if (class250.field2637 == null) {
            class250.field2637 = new int[7];
            class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
            class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
            class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
            class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
            class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
            class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
            class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
        }
        int var5 = class250.field2637[arg0];
        int var6 = var3[var5];
        if (var6 == 0) {
            return;
        }
        var6 -= 256;
        class237 var7;
        do {
            if (arg1) {
                var6++;
                if (var6 >= Statics.field2336) {
                    var6 = 0;
                }
            } else {
                var6--;
                if (var6 < 0) {
                    var6 = Statics.field2336 - 1;
                }
            }
            var7 = class237.method3341(var6);
        } while (var7 == null || var7.field2506 || !var7.method4433(arg0, this.field3745));
        int[] var8 = this.field3741;
        if (class250.field2637 == null) {
            class250.field2637 = new int[7];
            class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
            class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
            class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
            class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
            class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
            class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
            class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
        }
        int var10 = class250.field2637[arg0];
        var8[var10] = var6 + 256;
        this.method6002();
    }

    @ObfuscatedName("nt.ax(IZB)V")
    public void method6000(int arg0, boolean arg1) {
        int var3 = this.field3740[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field2554[arg0].length) {
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
                    var3 = Statics.field2554[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3740[arg0] = var3;
        this.method6002();
    }

    @ObfuscatedName("nt.ao(II)V")
    public void method6001(int arg0) {
        if (this.field3745 != arg0) {
            this.method6025((int[]) null, (int[]) null, this.field3740, arg0, -1);
        }
    }

    @ObfuscatedName("nt.am(Lvg;B)V")
    public void method6032(class549 arg0) {
        arg0.method8781(this.field3745);
        for (int var2 = 0; var2 < 7; var2++) {
            int[] var3 = this.field3741;
            if (class250.field2637 == null) {
                class250.field2637 = new int[7];
                class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
                class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
                class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
                class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
                class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
                class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
                class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
            }
            int var5 = class250.field2637[var2];
            int var6 = var3[var5];
            if (class547.field5372 >= 224) {
                if (var6 == 0) {
                    arg0.method8782(-1);
                } else {
                    arg0.method8782(var6 - 256);
                }
            } else if (var6 == 0) {
                arg0.method8781(-1);
            } else {
                arg0.method8781(var6 - 256);
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            arg0.method8781(this.field3740[var7]);
        }
    }

    @ObfuscatedName("nt.ac(I)V")
    public void method6002() {
        long var1 = this.field3739;
        long[] var3 = class549.field5379;
        this.field3739 = -1L;
        for (int var4 = 0; var4 < 12; var4++) {
            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) (this.field3741[var4] >> 24)) & 0xFFL)];
            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) (this.field3741[var4] >> 16)) & 0xFFL)];
            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) (this.field3741[var4] >> 8)) & 0xFFL)];
            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) this.field3741[var4]) & 0xFFL)];
        }
        if (this.field3747 != null) {
            for (int var5 = 0; var5 < this.field3747.length; var5++) {
                if (this.field3747[var5] != null) {
                    if (this.field3747[var5].field2429 != null) {
                        for (int var6 = 0; var6 < this.field3747[var5].field2429.length; var6++) {
                            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) (this.field3747[var5].field2429[var6] >> 8)) & 0xFFL)];
                            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) this.field3747[var5].field2429[var6]) & 0xFFL)];
                        }
                    }
                    if (this.field3747[var5].field2431 != null) {
                        for (int var7 = 0; var7 < this.field3747[var5].field2431.length; var7++) {
                            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) (this.field3747[var5].field2431[var7] >> 8)) & 0xFFL)];
                            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) this.field3747[var5].field2431[var7]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) this.field3740[var8]) & 0xFFL)];
        }
        this.field3739 = this.field3739 >>> 8 ^ var3[(int) ((this.field3739 ^ (long) this.field3745) & 0xFFL)];
        if (var1 != 0L && this.field3739 != var1 || this.field3748) {
            field3752.method5587(var1);
        }
    }

    @ObfuscatedName("nt.ae(Lkr;ILkr;II)Lhr;")
    public class197 method6003(class264 arg0, int arg1, class264 arg2, int arg3) {
        if (this.field3744 != -1) {
            return class246.method2916(this.field3744).method4543(arg0, arg1, arg2, arg3, (class245) null);
        }
        long var5 = this.field3739;
        int[] var7 = this.field3741;
        if (arg0 != null && (arg0.field2871 >= 0 || arg0.field2881 >= 0)) {
            var7 = new int[12];
            System.arraycopy(this.field3741, 0, var7, 0, var7.length);
            if (arg0.field2871 >= 0) {
                var5 ^= (long) (arg0.field2871 - this.field3741[class265.field2893.field2902]) << 40;
                var7[class265.field2893.field2902] = this.method6015(arg0.field2871);
            }
            if (arg0.field2881 >= 0) {
                var5 ^= (long) (arg0.field2881 - this.field3741[class265.field2891.field2902]) << 48;
                var7[class265.field2891.field2902] = this.method6015(arg0.field2881);
            }
        }
        class197 var8 = (class197) field3752.method5586(var5);
        if (var8 == null) {
            boolean var9 = false;
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = var7[var10];
                if (this.method6011(var11)) {
                    class237 var12 = this.method6012(var11);
                    if (var12 != null && !var12.method4434()) {
                        var9 = true;
                    }
                }
                if (this.method6013(var11) && !this.method5995(var11).method4773(this.field3745)) {
                    var9 = true;
                }
            }
            if (var9) {
                if (this.field3746 != -1L) {
                    var8 = (class197) field3752.method5586(this.field3746);
                }
                if (var8 == null) {
                    return null;
                }
            }
            if (var8 == null) {
                class176[] var13 = new class176[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var16 = var7[var15];
                    if (this.method6011(var16)) {
                        class237 var17 = this.method6012(var16);
                        class176 var18 = null;
                        if (var17 != null) {
                            var18 = var17.method4435();
                        }
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (this.method6013(var16)) {
                        class262 var19 = this.method5995(var16);
                        class176 var20 = var19.method4774(this.field3745);
                        if (var20 != null) {
                            if (this.field3747 != null) {
                                class227 var21 = this.field3747[var15];
                                if (var21 != null) {
                                    if (var21.field2429 != null && var19.field2786 != null && var19.field2813.length == var21.field2429.length) {
                                        for (int var22 = 0; var22 < var19.field2786.length; var22++) {
                                            var20.method3350(var19.field2813[var22], var21.field2429[var22]);
                                        }
                                    }
                                    if (var21.field2431 != null && var19.field2800 != null && var19.field2801.length == var21.field2431.length) {
                                        for (int var23 = 0; var23 < var19.field2800.length; var23++) {
                                            var20.method3360(var19.field2801[var23], var21.field2431[var23]);
                                        }
                                    }
                                }
                            }
                            var13[var14++] = var20;
                        }
                    }
                }
                class176 var24 = new class176(var13, var14);
                for (int var25 = 0; var25 < 5; var25++) {
                    if (this.field3740[var25] < Statics.field2554[var25].length) {
                        var24.method3350(Statics.field5461[var25], Statics.field2554[var25][this.field3740[var25]]);
                    }
                    if (this.field3740[var25] < Statics.field1391[var25].length) {
                        var24.method3350(Statics.field5064[var25], Statics.field1391[var25][this.field3740[var25]]);
                    }
                }
                var8 = var24.method3424(64, 850, -30, -50, -30);
                field3752.method5589(var8, var5);
                this.field3746 = var5;
            }
        }
        class197 var26;
        if (arg0 == null && arg2 == null) {
            var26 = var8.method3976(true);
        } else if (arg0 != null && arg2 != null) {
            var26 = arg0.method4872(var8, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var26 = arg2.method4869(var8, arg3);
        } else {
            var26 = arg0.method4869(var8, arg1);
        }
        return var26;
    }

    @ObfuscatedName("nt.ad(I)Lgm;")
    public class176 method6004() {
        if (this.field3744 != -1) {
            return class246.method2916(this.field3744).method4520((class245) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3741[var2];
            if (this.method6011(var3)) {
                class237 var4 = this.method6012(var3);
                if (var4 != null && !var4.method4445()) {
                    var1 = true;
                }
            }
            if (this.method6013(var3) && !this.method5995(var3).method4827(this.field3745)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class176[] var5 = new class176[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3741[var7];
            if (this.method6011(var8)) {
                class237 var9 = this.method6012(var8);
                class176 var10 = null;
                if (var9 != null) {
                    var10 = var9.method4437();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (this.method6013(var8)) {
                class176 var11 = this.method5995(var8).method4776(this.field3745);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class176 var12 = new class176(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3740[var13] < Statics.field2554[var13].length) {
                var12.method3350(Statics.field5461[var13], Statics.field2554[var13][this.field3740[var13]]);
            }
            if (this.field3740[var13] < Statics.field1391[var13].length) {
                var12.method3350(Statics.field5064[var13], Statics.field1391[var13][this.field3740[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("nt.aq(I)I")
    public int method6005() {
        long var1 = this.field3739;
        if (this.field3744 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3744;
        }
        Integer var3 = (Integer) field3754.method7840(var1);
        if (var3 == null) {
            var3 = ++field3756 - 1;
            field3754.method7838(var1, var3);
            field3756 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nt.al(B)V")
    public void method6006() {
        this.method6025(this.field3743, this.field3741, this.field3740, this.field3745, this.field3744);
    }

    @ObfuscatedName("nt.aj(IIS)V")
    public void method6007(int arg0, int arg1) {
        boolean var3 = this.field3745 != arg1;
        this.field3745 = arg1;
        if (var3) {
            if (this.field3745 == arg0) {
                for (int var4 = 0; var4 < 7; var4++) {
                    if (class250.field2637 == null) {
                        class250.field2637 = new int[7];
                        class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
                        class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
                        class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
                        class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
                        class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
                        class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
                        class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
                    }
                    int var6 = class250.field2637[var4];
                    if (this.field3741[var6] > 0 && this.field3741[var6] < this.field3751) {
                        this.field3741[var6] = this.field3743[var6];
                    }
                }
            } else {
                if (this.field3741[0] < this.field3751 || this.method6008()) {
                    this.field3741[class265.field2899.field2902] = 1;
                }
                for (int var8 = 0; var8 < 7; var8++) {
                    if (class250.field2637 == null) {
                        class250.field2637 = new int[7];
                        class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
                        class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
                        class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
                        class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
                        class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
                        class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
                        class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
                    }
                    int var10 = class250.field2637[var8];
                    if (this.field3741[var10] > 0 && this.field3741[var10] < this.field3751) {
                        int[] var12 = this.field3741;
                        for (int var13 = 0; var13 < Statics.field2336; var13++) {
                            class237 var14 = class237.method3341(var13);
                            if (var14 != null && !var14.field2506 && var14.method4433(var8, arg1)) {
                                if (class250.field2637 == null) {
                                    class250.field2637 = new int[7];
                                    class250.field2637[class250.field2634.field2636] = class265.field2896.field2902;
                                    class250.field2637[class250.field2629.field2636] = class265.field2899.field2902;
                                    class250.field2637[class250.field2630.field2636] = class265.field2897.field2902;
                                    class250.field2637[class250.field2631.field2636] = class265.field2894.field2902;
                                    class250.field2637[class250.field2632.field2636] = class265.field2898.field2902;
                                    class250.field2637[class250.field2633.field2636] = class265.field2895.field2902;
                                    class250.field2637[class250.field2628.field2636] = class265.field2903.field2902;
                                }
                                int var17 = class250.field2637[var8];
                                var12[var17] = var13 + 256;
                                break;
                            }
                        }
                    }
                }
            }
        }
        this.method6006();
    }

    @ObfuscatedName("nt.as(B)Z")
    public boolean method6008() {
        if (this.method6013(this.field3741[0])) {
            class262 var1 = this.method5995(this.field3741[0]);
            return class265.field2899.field2902 != var1.field2832 && class265.field2899.field2902 != var1.field2799;
        } else {
            return false;
        }
    }

    @ObfuscatedName("nt.aw(III)V")
    public void method6009(int arg0, int arg1) {
        this.field3740[arg0] = arg1;
        this.method6006();
    }

    @ObfuscatedName("nt.af(II)V")
    public void method6010(int arg0) {
        class262 var2 = class262.method2385(arg0);
        this.field3741[var2.field2791] = this.field3751 + arg0;
        if (var2.field2832 != -1) {
            this.field3741[var2.field2832] = 0;
        }
        if (var2.field2799 != -1) {
            this.field3741[var2.field2799] = 0;
        }
        this.method6006();
    }

    @ObfuscatedName("nt.aa(II)Z")
    public boolean method6011(int arg0) {
        return arg0 >= 256 && arg0 < this.field3751;
    }

    @ObfuscatedName("nt.ah(II)Ljr;")
    public class237 method6012(int arg0) {
        return class237.method3341(arg0 - 256);
    }

    @ObfuscatedName("nt.ag(II)Z")
    public boolean method6013(int arg0) {
        return arg0 >= this.field3751;
    }

    @ObfuscatedName("nt.av(II)Lkm;")
    public class262 method5995(int arg0) {
        return class262.method2385(arg0 - this.field3751);
    }

    @ObfuscatedName("nt.ar(II)I")
    public int method6015(int arg0) {
        return this.field3751 + (arg0 - 512);
    }
}
