package deob;

@ObfuscatedName("il")
public abstract class class247 {

    @ObfuscatedName("il.n")
    public int field3318;

    @ObfuscatedName("il.v")
    public int[] field3309;

    @ObfuscatedName("il.y")
    public int[] field3310;

    @ObfuscatedName("il.r")
    public class199 field3311;

    @ObfuscatedName("il.h")
    public int[] field3323;

    @ObfuscatedName("il.d")
    public int[] field3313;

    @ObfuscatedName("il.s")
    public int[] field3314;

    @ObfuscatedName("il.b")
    public int[][] field3327;

    @ObfuscatedName("il.e")
    public int[][] field3308;

    @ObfuscatedName("il.f")
    public class199[] field3317;

    @ObfuscatedName("il.z")
    public Object[] field3312;

    @ObfuscatedName("il.u")
    public Object[][] field3319;

    @ObfuscatedName("il.p")
    public static class178 field3320 = new class178();

    @ObfuscatedName("il.w")
    public int field3316;

    @ObfuscatedName("il.t")
    public boolean field3322;

    @ObfuscatedName("il.o")
    public boolean field3326;

    @ObfuscatedName("il.a")
    public static int field3324 = 0;

    public class247(boolean arg0, boolean arg1) {
        this.field3322 = arg0;
        this.field3326 = arg1;
    }

    @ObfuscatedName("il.n([BI)V")
    public void method3914(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class185.method2933(arg0, 0, var2);
        this.field3316 = var3;
        class185 var4 = new class185(method2166(arg0));
        int var5 = var4.method3021();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3026();
        }
        int var6 = var4.method3021();
        if (var5 >= 7) {
            this.field3318 = var4.method3036();
        } else {
            this.field3318 = var4.method3015();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3309 = new int[this.field3318];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3318; var9++) {
                this.field3309[var9] = var7 += var4.method3036();
                if (this.field3309[var9] > var8) {
                    var8 = this.field3309[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3318; var10++) {
                this.field3309[var10] = var7 += var4.method3015();
                if (this.field3309[var10] > var8) {
                    var8 = this.field3309[var10];
                }
            }
        }
        this.field3323 = new int[var8 + 1];
        this.field3313 = new int[var8 + 1];
        this.field3314 = new int[var8 + 1];
        this.field3327 = new int[var8 + 1][];
        this.field3312 = new Object[var8 + 1];
        this.field3319 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3310 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3318; var11++) {
                this.field3310[this.field3309[var11]] = var4.method3026();
            }
            this.field3311 = new class199(this.field3310);
        }
        for (int var12 = 0; var12 < this.field3318; var12++) {
            this.field3323[this.field3309[var12]] = var4.method3026();
        }
        for (int var13 = 0; var13 < this.field3318; var13++) {
            this.field3313[this.field3309[var13]] = var4.method3026();
        }
        for (int var14 = 0; var14 < this.field3318; var14++) {
            this.field3314[this.field3309[var14]] = var4.method3015();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3318; var15++) {
                int var16 = this.field3309[var15];
                int var17 = this.field3314[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3327[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3327[var16][var20] = var18 += var4.method3036();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3319[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3318; var22++) {
                int var23 = this.field3309[var22];
                int var24 = this.field3314[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3327[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3327[var23][var27] = var25 += var4.method3015();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3319[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3308 = new int[var8 + 1][];
        this.field3317 = new class199[var8 + 1];
        for (int var29 = 0; var29 < this.field3318; var29++) {
            int var30 = this.field3309[var29];
            int var31 = this.field3314[var30];
            this.field3308[var30] = new int[this.field3319[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3308[var30][this.field3327[var30][var32]] = var4.method3026();
            }
            this.field3317[var30] = new class199(this.field3308[var30]);
        }
    }

    @ObfuscatedName("il.v(IB)V")
    public void method3948(int arg0) {
    }

    @ObfuscatedName("il.y(IIS)[B")
    public byte[] method3931(int arg0, int arg1) {
        return this.method3917(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("il.r(II[II)[B")
    public byte[] method3917(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3319.length || this.field3319[arg0] == null || arg1 < 0 || arg1 >= this.field3319[arg0].length) {
            return null;
        }
        if (this.field3319[arg0][arg1] == null) {
            boolean var4 = this.method3987(arg0, arg2);
            if (!var4) {
                this.method3926(arg0);
                boolean var5 = this.method3987(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class188.method108(this.field3319[arg0][arg1], false);
        if (this.field3326) {
            this.field3319[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("il.h(III)Z")
    public boolean method3918(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3319.length || this.field3319[arg0] == null || arg1 < 0 || arg1 >= this.field3319[arg0].length) {
            return false;
        } else if (this.field3319[arg0][arg1] != null) {
            return true;
        } else if (this.field3312[arg0] == null) {
            this.method3926(arg0);
            return this.field3312[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("il.d(IB)Z")
    public boolean method3919(int arg0) {
        if (this.field3319.length == 1) {
            return this.method3918(0, arg0);
        } else if (this.field3319[arg0].length == 1) {
            return this.method3918(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("il.s(II)Z")
    public boolean method3920(int arg0) {
        if (this.field3312[arg0] == null) {
            this.method3926(arg0);
            return this.field3312[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("il.b(I)Z")
    public boolean method3941() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3309.length; var2++) {
            int var3 = this.field3309[var2];
            if (this.field3312[var3] == null) {
                this.method3926(var3);
                if (this.field3312[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("il.e(II)I")
    public int method3922(int arg0) {
        return this.field3312[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("il.f(II)[B")
    public byte[] method3936(int arg0) {
        if (this.field3319.length == 1) {
            return this.method3931(0, arg0);
        } else if (this.field3319[arg0].length == 1) {
            return this.method3931(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("il.u(III)[B")
    public byte[] method3924(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3319.length || this.field3319[arg0] == null || arg1 < 0 || arg1 >= this.field3319[arg0].length) {
            return null;
        }
        if (this.field3319[arg0][arg1] == null) {
            boolean var3 = this.method3987(arg0, (int[]) null);
            if (!var3) {
                this.method3926(arg0);
                boolean var4 = this.method3987(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class188.method108(this.field3319[arg0][arg1], false);
    }

    @ObfuscatedName("il.t(IB)[B")
    public byte[] method3925(int arg0) {
        if (this.field3319.length == 1) {
            return this.method3924(0, arg0);
        } else if (this.field3319[arg0].length == 1) {
            return this.method3924(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("il.o(IB)V")
    public void method3926(int arg0) {
    }

    @ObfuscatedName("il.a(II)[I")
    public int[] method3976(int arg0) {
        return this.field3327[arg0];
    }

    @ObfuscatedName("il.i(II)I")
    public int method3921(int arg0) {
        return this.field3319[arg0].length;
    }

    @ObfuscatedName("il.m(B)I")
    public int method3929() {
        return this.field3319.length;
    }

    @ObfuscatedName("il.x(IB)V")
    public void method3930(int arg0) {
        for (int var2 = 0; var2 < this.field3319[arg0].length; var2++) {
            this.field3319[arg0][var2] = null;
        }
    }

    @ObfuscatedName("il.j(I)V")
    public void method3982() {
        for (int var1 = 0; var1 < this.field3319.length; var1++) {
            if (this.field3319[var1] != null) {
                for (int var2 = 0; var2 < this.field3319[var1].length; var2++) {
                    this.field3319[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("il.g(I[IB)Z")
    public boolean method3987(int arg0, int[] arg1) {
        if (this.field3312[arg0] == null) {
            return false;
        }
        int var3 = this.field3314[arg0];
        int[] var4 = this.field3327[arg0];
        Object[] var5 = this.field3319[arg0];
        boolean var6 = true;
        for (int var7 = 0; var7 < var3; var7++) {
            if (var5[var4[var7]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var8;
        if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
            var8 = class188.method108(this.field3312[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3144(arg1, 5, var9.field2528.length);
        } else {
            var8 = class188.method108(this.field3312[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2166(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class185.method2933(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class185.method2933(var8, 0, var17);
            throw class155.method37(var34, var16 + var18 + "," + this.field3323[arg0] + "," + this.field3316);
        }
        if (this.field3322) {
            this.field3312[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class185 var22 = new class185(var10);
            int[] var23 = new int[var3];
            var22.field2529 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method3026();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2529 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method3026();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3326) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class188.method1074(var27[var33], false);
                }
            }
        } else if (this.field3326) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class188.method1074(var10, false);
        }
        return true;
    }

    @ObfuscatedName("il.c(Ljava/lang/String;I)I")
    public int method4007(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3311.method3395(class282.method4302(var2));
    }

    @ObfuscatedName("il.k(ILjava/lang/String;I)I")
    public int method4009(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3317[arg0].method3395(class282.method4302(var3));
    }

    @ObfuscatedName("il.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3932(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3311.method3395(class282.method4302(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3317[var5].method3395(class282.method4302(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("il.ac(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3977(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3311.method3395(class282.method4302(var3));
        int var6 = this.field3317[var5].method3395(class282.method4302(var4));
        return this.method3931(var5, var6);
    }

    @ObfuscatedName("il.aw(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3937(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3311.method3395(class282.method4302(var3));
        int var6 = this.field3317[var5].method3395(class282.method4302(var4));
        return this.method3918(var5, var6);
    }

    @ObfuscatedName("il.at(Ljava/lang/String;B)Z")
    public boolean method3938(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3311.method3395(class282.method4302(var2));
        return this.method3920(var3);
    }

    @ObfuscatedName("il.ag(Ljava/lang/String;I)V")
    public void method3939(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3311.method3395(class282.method4302(var2));
        if (var3 >= 0) {
            this.method3948(var3);
        }
    }

    @ObfuscatedName("il.ad(Ljava/lang/String;B)I")
    public int method3940(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3311.method3395(class282.method4302(var2));
        return this.method3922(var3);
    }

    @ObfuscatedName("dm.af([BI)[B")
    public static final byte[] method2166(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3021();
        int var3 = var1.method3026();
        if (var3 < 0 || !(field3324 == 0 || var3 <= field3324)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3033(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3026();
            if (var5 < 0 || field3324 != 0 && var5 > field3324) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method2974(var6, var5, arg0, var3, 9);
            } else {
                field3320.method2963(var1, var6);
            }
            return var6;
        }
    }
}
