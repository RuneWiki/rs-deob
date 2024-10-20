package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("kr")
public class class264 extends class502 {

    @ObfuscatedName("kr.ab")
    public static boolean field2882 = false;

    @ObfuscatedName("kr.ac")
    public static class315 field2865 = new class315(64);

    @ObfuscatedName("kr.ae")
    public static class315 field2866 = new class315(100);

    @ObfuscatedName("kr.ad")
    public static class315 field2880 = new class315(100);

    @ObfuscatedName("kr.aq")
    public int field2879 = -1;

    @ObfuscatedName("kr.al")
    public Map field2869;

    @ObfuscatedName("kr.aj")
    public int field2870 = 0;

    @ObfuscatedName("kr.as")
    public int field2885 = 0;

    @ObfuscatedName("kr.aw")
    public int[] field2872;

    @ObfuscatedName("kr.af")
    public int[] field2861;

    @ObfuscatedName("kr.aa")
    public int[] field2874;

    @ObfuscatedName("kr.ah")
    public class260[] field2875;

    @ObfuscatedName("kr.ag")
    public int field2876 = -1;

    @ObfuscatedName("kr.av")
    public int[] field2877;

    @ObfuscatedName("kr.ar")
    public boolean[] field2878;

    @ObfuscatedName("kr.ap")
    public boolean field2873 = false;

    @ObfuscatedName("kr.ak")
    public int field2868 = 5;

    @ObfuscatedName("kr.ai")
    public int field2871 = -1;

    @ObfuscatedName("kr.at")
    public int field2881 = -1;

    @ObfuscatedName("kr.az")
    public int field2883 = 99;

    @ObfuscatedName("kr.bg")
    public boolean field2884 = false;

    @ObfuscatedName("kr.bz")
    public int field2867 = -1;

    @ObfuscatedName("kr.bj")
    public int field2886 = -1;

    @ObfuscatedName("kr.bc")
    public int field2887 = 2;

    @ObfuscatedName("hh.ab(IB)Lkr;")
    public static class264 method3551(int arg0) {
        class264 var1 = (class264) field2865.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5305.method6670(12, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4865(new class549(var2));
        }
        var3.method4913();
        field2865.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kr.ay(Lvg;I)V")
    public void method4865(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4867(arg0, var2);
        }
    }

    @ObfuscatedName("kr.an(Lvg;II)V")
    public void method4867(class549 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8968();
            this.field2874 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2874[var4] = arg0.method8968();
            }
            this.field2872 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2872[var5] = arg0.method8968();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2872[var6] += arg0.method8968() << 16;
            }
        } else if (arg1 == 2) {
            this.field2876 = arg0.method8968();
        } else if (arg1 == 3) {
            int var7 = arg0.method9025();
            this.field2877 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2877[var8] = arg0.method9025();
            }
            this.field2877[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2873 = true;
        } else if (arg1 == 5) {
            this.field2868 = arg0.method9025();
        } else if (arg1 == 6) {
            this.field2871 = arg0.method8968();
        } else if (arg1 == 7) {
            this.field2881 = arg0.method8968();
        } else if (arg1 == 8) {
            this.field2883 = arg0.method9025();
            this.field2884 = true;
        } else if (arg1 == 9) {
            this.field2867 = arg0.method9025();
        } else if (arg1 == 10) {
            this.field2886 = arg0.method9025();
        } else if (arg1 == 11) {
            this.field2887 = arg0.method9025();
        } else if (arg1 == 12) {
            int var9 = arg0.method9025();
            this.field2861 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2861[var10] = arg0.method8968();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2861[var11] += arg0.method8968() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method9025();
            this.field2875 = new class260[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                class260[] var14;
                class260 var24;
                label118: {
                    var14 = this.field2875;
                    if (arg0 != null) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean var18 = false;
                        boolean var19 = false;
                        int var20 = arg0.method8968();
                        int var21 = arg0.method9025();
                        int var22 = arg0.method9025();
                        int var23 = arg0.method9025();
                        if (var20 >= 1 && var21 >= 1 && var22 >= 0 && var23 >= 0) {
                            var24 = new class260(var20, var21, var22, var23);
                            break label118;
                        }
                    }
                    var24 = null;
                }
                var14[var13] = var24;
            }
        } else if (arg1 == 14) {
            this.field2879 = arg0.method8803();
        } else if (arg1 == 15) {
            int var25 = arg0.method8968();
            this.field2869 = new HashMap();
            for (int var26 = 0; var26 < var25; var26++) {
                int var27;
                class260 var36;
                label103: {
                    var27 = arg0.method8968();
                    if (arg0 != null) {
                        boolean var28 = false;
                        boolean var29 = false;
                        boolean var30 = false;
                        boolean var31 = false;
                        int var32 = arg0.method8968();
                        int var33 = arg0.method9025();
                        int var34 = arg0.method9025();
                        int var35 = arg0.method9025();
                        if (var32 >= 1 && var33 >= 1 && var34 >= 0 && var35 >= 0) {
                            var36 = new class260(var32, var33, var34, var35);
                            break label103;
                        }
                    }
                    var36 = null;
                }
                this.field2869.put(var27, var36);
            }
        } else if (arg1 == 16) {
            this.field2870 = arg0.method8968();
            this.field2885 = arg0.method8968();
        } else if (arg1 == 17) {
            this.field2878 = new boolean[256];
            for (int var38 = 0; var38 < this.field2878.length; var38++) {
                this.field2878[var38] = false;
            }
            int var39 = arg0.method9025();
            for (int var40 = 0; var40 < var39; var40++) {
                this.field2878[arg0.method9025()] = true;
            }
        }
    }

    @ObfuscatedName("kr.au(B)V")
    public void method4913() {
        if (this.field2867 == -1) {
            if (this.field2877 == null && this.field2878 == null) {
                this.field2867 = 0;
            } else {
                this.field2867 = 2;
            }
        }
        if (this.field2886 != -1) {
            return;
        }
        if (this.field2877 == null && this.field2878 == null) {
            this.field2886 = 0;
        } else {
            this.field2886 = 2;
        }
    }

    @ObfuscatedName("kr.ax(Lhr;IB)Lhr;")
    public class197 method4869(class197 arg0, int arg1) {
        if (this.method4915()) {
            int var7 = this.field2879;
            class143 var8 = method5976(var7);
            int var9;
            if (var8 == null) {
                var9 = 2;
            } else {
                var9 = var8.method3144() ? 0 : 1;
            }
            class143 var10;
            if (var9 == 0) {
                class143 var11 = (class143) field2880.method5586((long) var7);
                class143 var12;
                if (var11 == null) {
                    class143 var13 = class143.method4731(Statics.field2864, Statics.field1781, var7, false);
                    if (var13 != null) {
                        field2880.method5589(var13, (long) var7);
                    }
                    var12 = var13;
                } else {
                    var12 = var11;
                }
                var10 = var12;
            } else {
                var10 = null;
            }
            if (var10 == null) {
                return arg0.method3976(true);
            } else {
                class197 var15 = arg0.method3976(!var10.method3118());
                var15.method4029(var10, arg1);
                return var15;
            }
        } else {
            int var3 = this.field2872[arg1];
            class191 var4 = method615(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3976(true);
            } else {
                class197 var6 = arg0.method3976(!var4.method3837(var5));
                var6.method3912(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("kr.ao(Lhr;III)Lhr;")
    public class197 method4870(class197 arg0, int arg1, int arg2) {
        if (!this.method4915()) {
            int var4 = this.field2872[arg1];
            class191 var5 = method615(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method3976(true);
            }
            class197 var7 = arg0.method3976(!var5.method3837(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method3922();
            } else if (var8 == 2) {
                var7.method4006();
            } else if (var8 == 3) {
                var7.method3920();
            }
            var7.method3912(var5, var6);
            if (var8 == 1) {
                var7.method3920();
            } else if (var8 == 2) {
                var7.method4006();
            } else if (var8 == 3) {
                var7.method3922();
            }
            return var7;
        }
        int var9 = this.field2879;
        class143 var10 = method5976(var9);
        int var11;
        if (var10 == null) {
            var11 = 2;
        } else {
            var11 = var10.method3144() ? 0 : 1;
        }
        class143 var12;
        if (var11 == 0) {
            class143 var13 = (class143) field2880.method5586((long) var9);
            class143 var14;
            if (var13 == null) {
                class143 var15 = class143.method4731(Statics.field2864, Statics.field1781, var9, false);
                if (var15 != null) {
                    field2880.method5589(var15, (long) var9);
                }
                var14 = var15;
            } else {
                var14 = var13;
            }
            var12 = var14;
        } else {
            var12 = null;
        }
        if (var12 == null) {
            return arg0.method3976(true);
        }
        class197 var17 = arg0.method3976(!var12.method3118());
        int var18 = arg2 & 0x3;
        if (var18 == 1) {
            var17.method3922();
        } else if (var18 == 2) {
            var17.method4006();
        } else if (var18 == 3) {
            var17.method3920();
        }
        var17.method4029(var12, arg1);
        if (var18 == 1) {
            var17.method3920();
        } else if (var18 == 2) {
            var17.method4006();
        } else if (var18 == 3) {
            var17.method3922();
        }
        return var17;
    }

    @ObfuscatedName("kr.am(Lhr;II)Lhr;")
    public class197 method4871(class197 arg0, int arg1) {
        if (this.method4915()) {
            int var7 = this.field2879;
            class143 var8 = method5976(var7);
            int var9;
            if (var8 == null) {
                var9 = 2;
            } else {
                var9 = var8.method3144() ? 0 : 1;
            }
            class143 var10;
            if (var9 == 0) {
                class143 var11 = (class143) field2880.method5586((long) var7);
                class143 var12;
                if (var11 == null) {
                    class143 var13 = class143.method4731(Statics.field2864, Statics.field1781, var7, false);
                    if (var13 != null) {
                        field2880.method5589(var13, (long) var7);
                    }
                    var12 = var13;
                } else {
                    var12 = var11;
                }
                var10 = var12;
            } else {
                var10 = null;
            }
            if (var10 == null) {
                return arg0.method3906(true);
            } else {
                class197 var15 = arg0.method3906(!var10.method3118());
                var15.method4029(var10, arg1);
                return var15;
            }
        } else {
            int var3 = this.field2872[arg1];
            class191 var4 = method615(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method3906(true);
            } else {
                class197 var6 = arg0.method3906(!var4.method3837(var5));
                var6.method3912(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("kr.ac(Lhr;ILkr;II)Lhr;")
    public class197 method4872(class197 arg0, int arg1, class264 arg2, int arg3) {
        if (field2882 && !this.method4915() && !arg2.method4915()) {
            return this.method4873(arg0, arg1, arg2, arg3);
        }
        class197 var5 = arg0.method3976(false);
        boolean var6 = false;
        class191 var7 = null;
        class185 var8 = null;
        if (this.method4915()) {
            class143 var9 = this.method4877();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method4915() && this.field2878 == null) {
                var5.method4029(var9, arg1);
                return var5;
            }
            var8 = var9.field1633;
            var5.method3917(var8, var9, arg1, this.field2878, false, !arg2.method4915());
        } else {
            int var10 = this.field2872[arg1];
            var7 = method615(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method4869(arg0, arg3);
            }
            if (!arg2.method4915() && (this.field2877 == null || arg3 == -1)) {
                var5.method3912(var7, arg1);
                return var5;
            }
            if (this.field2877 == null || arg3 == -1) {
                var5.method3912(var7, arg1);
                return var5;
            }
            var6 = arg2.method4915();
            if (!var6) {
                var5.method3918(var7, arg1, this.field2877, false);
            }
        }
        if (arg2.method4915()) {
            class143 var11 = arg2.method4877();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1633;
            }
            var5.method3917(var8, var11, arg3, this.field2878, true, true);
        } else {
            int var12 = arg2.field2872[arg3];
            class191 var13 = method615(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method4869(arg0, arg1);
            }
            var5.method3918(var13, var14, this.field2877, true);
        }
        if (var6 && var7 != null) {
            var5.method3918(var7, arg1, this.field2877, false);
        }
        var5.method4026();
        return var5;
    }

    @ObfuscatedName("kr.ae(Lhr;ILkr;IB)Lhr;")
    public class197 method4873(class197 arg0, int arg1, class264 arg2, int arg3) {
        int var5 = this.field2872[arg1];
        class191 var6 = method615(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4869(arg0, arg3);
        }
        int var8 = arg2.field2872[arg3];
        class191 var9 = method615(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class197 var11 = arg0.method3976(!var6.method3837(var7));
            var11.method3912(var6, var7);
            return var11;
        } else {
            class197 var12 = arg0.method3976(!var6.method3837(var7) & !var9.method3837(var10));
            var12.method3916(var6, var7, var9, var10, this.field2877);
            return var12;
        }
    }

    @ObfuscatedName("kr.ad(Lhr;II)Lhr;")
    public class197 method4874(class197 arg0, int arg1) {
        if (this.method4915()) {
            return this.method4869(arg0, arg1);
        }
        int var3 = this.field2872[arg1];
        class191 var4 = method615(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3976(true);
        }
        class191 var6 = null;
        int var7 = 0;
        if (this.field2861 != null && arg1 < this.field2861.length) {
            int var8 = this.field2861[arg1];
            var6 = method615(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class197 var10 = arg0.method3976(!var4.method3837(var5));
            var10.method3912(var4, var5);
            return var10;
        } else {
            class197 var9 = arg0.method3976(!var4.method3837(var5) & !var6.method3837(var7));
            var9.method3912(var4, var5);
            var9.method3912(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("kr.aq(I)Z")
    public boolean method4915() {
        return this.field2879 >= 0;
    }

    @ObfuscatedName("kr.al(I)I")
    public int method4907() {
        return this.field2885 - this.field2870;
    }

    @ObfuscatedName("bx.aj(II)Lhp;")
    public static class191 method615(int arg0) {
        class191 var1 = (class191) field2866.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class389 var2 = Statics.field2864;
        class389 var3 = Statics.field1781;
        boolean var4 = true;
        int[] var5 = var2.method6647(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method6645(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method6645(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class191 var10;
        if (var4) {
            try {
                var10 = new class191(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2866.method5589(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("kr.as(B)Lfq;")
    public class143 method4877() {
        if (!this.method4915()) {
            return null;
        }
        int var1 = this.field2879;
        class143 var2 = method5976(var1);
        int var3;
        if (var2 == null) {
            var3 = 2;
        } else {
            var3 = var2.method3144() ? 0 : 1;
        }
        class143 var4;
        if (var3 == 0) {
            class143 var5 = (class143) field2880.method5586((long) var1);
            class143 var6;
            if (var5 == null) {
                class143 var7 = class143.method4731(Statics.field2864, Statics.field1781, var1, false);
                if (var7 != null) {
                    field2880.method5589(var7, (long) var1);
                }
                var6 = var7;
            } else {
                var6 = var5;
            }
            var4 = var6;
        } else {
            var4 = null;
        }
        return var4;
    }

    @ObfuscatedName("nw.aw(II)Lfq;")
    public static class143 method5976(int arg0) {
        class143 var1 = (class143) field2880.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class143 var2 = class143.method4731(Statics.field2864, Statics.field1781, arg0, false);
        if (var2 != null) {
            field2880.method5589(var2, (long) arg0);
        }
        return var2;
    }
}
