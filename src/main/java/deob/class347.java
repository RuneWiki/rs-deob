package deob;

import java.util.Arrays;

@ObfuscatedName("nq")
public class class347 {

    @ObfuscatedName("nq.az")
    public int[] field3696;

    @ObfuscatedName("nq.ah")
    public int[] field3698;

    @ObfuscatedName("nq.af")
    public int[] field3685;

    @ObfuscatedName("nq.at")
    public int field3686 = -1;

    @ObfuscatedName("nq.an")
    public int field3687 = 0;

    @ObfuscatedName("nq.ao")
    public int field3693;

    @ObfuscatedName("nq.ab")
    public long field3697;

    @ObfuscatedName("nq.aw")
    public long field3690;

    @ObfuscatedName("nq.ad")
    public class188[] field3691;

    @ObfuscatedName("nq.al")
    public boolean field3688 = false;

    @ObfuscatedName("nq.ar")
    public static final int[] field3694 = new int[] { class226.field2405.field2416, class226.field2408.field2416, class226.field2410.field2416, class226.field2402.field2416, class226.field2411.field2416, class226.field2409.field2416, class226.field2412.field2416 };

    @ObfuscatedName("nq.ay")
    public static class304 field3684 = new class304(260);

    @ObfuscatedName("nq.ap")
    public static class444 field3692 = new class444(16, class442.field4749);

    @ObfuscatedName("nq.av")
    public static int field3689 = 0;

    public class347() {
    }

    public class347(class347 arg0) {
        int[] var2 = Arrays.copyOf(arg0.field3698, arg0.field3698.length);
        int[] var3 = Arrays.copyOf(arg0.field3696, arg0.field3696.length);
        class188[] var4 = (class188[]) (arg0.field3691 == null ? null : (class188[]) Arrays.copyOf(arg0.field3691, arg0.field3691.length));
        int[] var5 = Arrays.copyOf(arg0.field3685, arg0.field3685.length);
        this.method5721(var3, var2, var4, false, var5, arg0.field3687, arg0.field3693, arg0.field3686);
    }

    @ObfuscatedName("nq.az([I[I[Lhv;Z[IIIII)V")
    public void method5721(int[] arg0, int[] arg1, class188[] arg2, boolean arg3, int[] arg4, int arg5, int arg6, int arg7) {
        this.field3691 = arg2;
        this.field3688 = arg3;
        this.field3686 = arg7;
        this.method5722(arg0, arg1, arg4, arg5, arg6);
    }

    @ObfuscatedName("nq.ah([I[I[IIIB)V")
    public void method5722(int[] arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 == null) {
            arg0 = this.method5727(arg3);
        }
        if (arg1 == null) {
            arg1 = this.method5727(arg3);
        }
        this.field3696 = arg0;
        this.field3698 = arg1;
        this.field3685 = arg2;
        this.field3687 = arg3;
        this.field3693 = arg4;
        this.method5728();
    }

    @ObfuscatedName("nq.af(IB)[I")
    public int[] method5727(int arg0) {
        int[] var2 = new int[12];
        for (int var3 = 0; var3 < 7; var3++) {
            method3745(arg0, var2, var3);
        }
        return var2;
    }

    @ObfuscatedName("io.at(I[III)V")
    public static void method3745(int arg0, int[] arg1, int arg2) {
        for (int var3 = 0; var3 < Statics.field57; var3++) {
            class199 var4 = class199.method3414(var3);
            if (var4 != null && !var4.field2031 && arg2 + (arg0 == 1 ? 7 : 0) == var4.field2040) {
                arg1[field3694[arg2]] = var3 + 256;
                break;
            }
        }
    }

    @ObfuscatedName("nq.an(IZB)V")
    public void method5724(int arg0, boolean arg1) {
        int var3 = this.field3698[field3694[arg0]];
        if (var3 == 0) {
            return;
        }
        var3 -= 256;
        class199 var4;
        do {
            if (arg1) {
                var3++;
                if (var3 >= Statics.field57) {
                    var3 = 0;
                }
            } else {
                var3--;
                if (var3 < 0) {
                    var3 = Statics.field57 - 1;
                }
            }
            var4 = class199.method3414(var3);
        } while (var4 == null || var4.field2031 || arg0 + (this.field3687 == 1 ? 7 : 0) != var4.field2040);
        this.field3698[field3694[arg0]] = var3 + 256;
        this.method5728();
    }

    @ObfuscatedName("nq.ao(IZI)V")
    public void method5725(int arg0, boolean arg1) {
        int var3 = this.field3685[arg0];
        boolean var4;
        boolean var5;
        if (arg1) {
            do {
                var3++;
                if (var3 >= Statics.field1455[arg0].length) {
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
                    var3 = Statics.field1455[arg0].length - 1;
                }
                if (arg0 == 4 && var3 >= 8) {
                    var4 = false;
                } else {
                    var4 = true;
                }
            } while (!var4);
        }
        this.field3685[arg0] = var3;
        this.method5728();
    }

    @ObfuscatedName("nq.ab(II)V")
    public void method5726(int arg0) {
        if (this.field3687 != arg0) {
            this.method5722((int[]) null, (int[]) null, this.field3685, arg0, -1);
        }
    }

    @ObfuscatedName("nq.aw(Lur;B)V")
    public void method5749(class535 arg0) {
        arg0.method8445(this.field3687);
        for (int var2 = 0; var2 < 7; var2++) {
            int var3 = this.field3698[field3694[var2]];
            if (var3 == 0) {
                arg0.method8445(-1);
            } else {
                arg0.method8445(var3 - 256);
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method8445(this.field3685[var4]);
        }
    }

    @ObfuscatedName("nq.ad(I)V")
    public void method5728() {
        long var1 = this.field3697;
        int var3 = this.field3698[5];
        int var4 = this.field3698[9];
        this.field3698[5] = var4;
        this.field3698[9] = var3;
        this.field3697 = 0L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3697 <<= 0x4;
            if (this.field3698[var5] >= 256) {
                this.field3697 += (long) (this.field3698[var5] - 256);
            }
        }
        if (this.field3698[0] >= 256) {
            this.field3697 += (long) (this.field3698[0] - 256 >> 4);
        }
        if (this.field3698[1] >= 256) {
            this.field3697 += (long) (this.field3698[1] - 256 >> 8);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3697 <<= 0x3;
            this.field3697 += (long) this.field3685[var6];
        }
        this.field3697 <<= 0x1;
        this.field3697 += (long) (this.field3687 * 1435153825) * 1990618721L;
        this.field3698[5] = var3;
        this.field3698[9] = var4;
        if (var1 != 0L && this.field3697 != var1 || this.field3688) {
            field3684.method5337(var1);
        }
    }

    @ObfuscatedName("nq.al(Lig;ILig;II)Ljn;")
    public class256 method5729(class225 arg0, int arg1, class225 arg2, int arg3) {
        if (this.field3693 != -1) {
            return class208.method2790(this.field3693).method3541(arg0, arg1, arg2, arg3, (class207) null);
        }
        long var5 = this.field3697;
        int[] var7 = this.field3698;
        if (arg0 != null && (arg0.field2383 >= 0 || arg0.field2379 >= 0)) {
            var7 = new int[12];
            for (int var8 = 0; var8 < 12; var8++) {
                var7[var8] = this.field3698[var8];
            }
            if (arg0.field2383 >= 0) {
                var5 += (long) (arg0.field2383 - this.field3698[5] << 40);
                var7[5] = arg0.field2383;
            }
            if (arg0.field2379 >= 0) {
                var5 += (long) (arg0.field2379 - this.field3698[3] << 48);
                var7[3] = arg0.field2379;
            }
        }
        class256 var9 = (class256) field3684.method5336(var5);
        if (var9 == null) {
            boolean var10 = false;
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = var7[var11];
                if (var12 >= 256 && var12 < 512) {
                    class199 var13 = class199.method3414(var12 - 256);
                    if (var13 != null && !var13.method3457()) {
                        var10 = true;
                    }
                }
                if (var12 >= 512 && !class223.method87(var12 - 512).method3813(this.field3687)) {
                    var10 = true;
                }
            }
            if (var10) {
                if (this.field3690 != -1L) {
                    var9 = (class256) field3684.method5336(this.field3690);
                }
                if (var9 == null) {
                    return null;
                }
            }
            if (var9 == null) {
                class238[] var14 = new class238[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var7[var16];
                    if (var17 >= 256 && var17 < 512) {
                        class199 var18 = class199.method3414(var17 - 256);
                        class238 var19 = null;
                        if (var18 != null) {
                            var19 = var18.method3485();
                        }
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    }
                    if (var17 >= 512) {
                        class223 var20 = class223.method87(var17 - 512);
                        class238 var21 = var20.method3814(this.field3687);
                        if (var21 != null) {
                            if (this.field3691 != null) {
                                class188 var22 = this.field3691[var16];
                                if (var22 != null) {
                                    if (var22.field1960 != null && var20.field2352 != null && var20.field2314.length == var22.field1960.length) {
                                        for (int var23 = 0; var23 < var20.field2352.length; var23++) {
                                            var21.method4131(var20.field2314[var23], var22.field1960[var23]);
                                        }
                                    }
                                    if (var22.field1962 != null && var20.field2315 != null && var20.field2316.length == var22.field1962.length) {
                                        for (int var24 = 0; var24 < var20.field2315.length; var24++) {
                                            var21.method4135(var20.field2316[var24], var22.field1962[var24]);
                                        }
                                    }
                                }
                            }
                            var14[var15++] = var21;
                        }
                    }
                }
                class238 var25 = new class238(var14, var15);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3685[var26] < Statics.field1455[var26].length) {
                        var25.method4131(Statics.field1859[var26], Statics.field1455[var26][this.field3685[var26]]);
                    }
                    if (this.field3685[var26] < Statics.field7[var26].length) {
                        var25.method4131(Statics.field3683[var26], Statics.field7[var26][this.field3685[var26]]);
                    }
                }
                var9 = var25.method4138(64, 850, -30, -50, -30);
                field3684.method5346(var9, var5);
                this.field3690 = var5;
            }
        }
        class256 var27;
        if (arg0 == null && arg2 == null) {
            var27 = var9.method4586(true);
        } else if (arg0 != null && arg2 != null) {
            var27 = arg0.method3900(var9, arg1, arg2, arg3);
        } else if (arg0 == null) {
            var27 = arg2.method3897(var9, arg3);
        } else {
            var27 = arg0.method3897(var9, arg1);
        }
        return var27;
    }

    @ObfuscatedName("nq.as(I)Ljj;")
    public class238 method5733() {
        if (this.field3693 != -1) {
            return class208.method2790(this.field3693).method3539((class207) null);
        }
        boolean var1 = false;
        for (int var2 = 0; var2 < 12; var2++) {
            int var3 = this.field3698[var2];
            if (var3 >= 256 && var3 < 512) {
                class199 var4 = class199.method3414(var3 - 256);
                if (var4 != null && !var4.method3458()) {
                    var1 = true;
                }
            }
            if (var3 >= 512 && !class223.method87(var3 - 512).method3815(this.field3687)) {
                var1 = true;
            }
        }
        if (var1) {
            return null;
        }
        class238[] var5 = new class238[12];
        int var6 = 0;
        for (int var7 = 0; var7 < 12; var7++) {
            int var8 = this.field3698[var7];
            if (var8 >= 256 && var8 < 512) {
                class199 var9 = class199.method3414(var8 - 256);
                class238 var10 = null;
                if (var9 != null) {
                    var10 = var9.method3477();
                }
                if (var10 != null) {
                    var5[var6++] = var10;
                }
            }
            if (var8 >= 512) {
                class238 var11 = class223.method87(var8 - 512).method3834(this.field3687);
                if (var11 != null) {
                    var5[var6++] = var11;
                }
            }
        }
        class238 var12 = new class238(var5, var6);
        for (int var13 = 0; var13 < 5; var13++) {
            if (this.field3685[var13] < Statics.field1455[var13].length) {
                var12.method4131(Statics.field1859[var13], Statics.field1455[var13][this.field3685[var13]]);
            }
            if (this.field3685[var13] < Statics.field7[var13].length) {
                var12.method4131(Statics.field3683[var13], Statics.field7[var13][this.field3685[var13]]);
            }
        }
        return var12;
    }

    @ObfuscatedName("nq.ag(I)I")
    public int method5745() {
        long var1 = this.field3697;
        if (this.field3693 != -1) {
            var1 = 0xFFFFFFFFFFFF0000L | (long) this.field3693;
        }
        Integer var3 = (Integer) field3692.method7340(var1);
        if (var3 == null) {
            var3 = ++field3689 - 1;
            field3692.method7333(var1, var3);
            field3689 %= 65535;
        }
        return var3;
    }

    @ObfuscatedName("nq.ai(I)V")
    public void method5732() {
        this.method5722(this.field3696, this.field3698, this.field3685, this.field3687, this.field3693);
    }
}
