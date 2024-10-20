package deob;

@ObfuscatedName("fp")
public abstract class class171 {

    @ObfuscatedName("fp.l")
    public int field2733;

    @ObfuscatedName("fp.g")
    public int[] field2731;

    @ObfuscatedName("fp.r")
    public int[] field2727;

    @ObfuscatedName("fp.e")
    public class196 field2740;

    @ObfuscatedName("fp.h")
    public int[] field2737;

    @ObfuscatedName("fp.s")
    public int[] field2730;

    @ObfuscatedName("fp.k")
    public int[] field2743;

    @ObfuscatedName("fp.u")
    public int[][] field2732;

    @ObfuscatedName("fp.n")
    public int[][] field2726;

    @ObfuscatedName("fp.b")
    public class196[] field2734;

    @ObfuscatedName("fp.m")
    public Object[] field2735;

    @ObfuscatedName("fp.q")
    public Object[][] field2736;

    @ObfuscatedName("fp.p")
    public static class120 field2725 = new class120();

    @ObfuscatedName("fp.w")
    public int field2738;

    @ObfuscatedName("fp.o")
    public boolean field2739;

    @ObfuscatedName("fp.d")
    public boolean field2728;

    @ObfuscatedName("fp.f")
    public static int field2741 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2739 = arg0;
        this.field2728 = arg1;
    }

    @ObfuscatedName("fp.l([BI)V")
    public void method3192(byte[] arg0) {
        this.field2738 = class123.method860(arg0, arg0.length);
        class123 var2 = new class123(method2750(arg0));
        int var3 = var2.method2490();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2477();
        }
        int var4 = var2.method2490();
        if (var3 >= 7) {
            this.field2733 = var2.method2637();
        } else {
            this.field2733 = var2.method2492();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2731 = new int[this.field2733];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2733; var7++) {
                this.field2731[var7] = var5 += var2.method2637();
                if (this.field2731[var7] > var6) {
                    var6 = this.field2731[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2733; var8++) {
                this.field2731[var8] = var5 += var2.method2492();
                if (this.field2731[var8] > var6) {
                    var6 = this.field2731[var8];
                }
            }
        }
        this.field2737 = new int[var6 + 1];
        this.field2730 = new int[var6 + 1];
        this.field2743 = new int[var6 + 1];
        this.field2732 = new int[var6 + 1][];
        this.field2735 = new Object[var6 + 1];
        this.field2736 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2727 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2733; var9++) {
                this.field2727[this.field2731[var9]] = var2.method2477();
            }
            this.field2740 = new class196(this.field2727);
        }
        for (int var10 = 0; var10 < this.field2733; var10++) {
            this.field2737[this.field2731[var10]] = var2.method2477();
        }
        for (int var11 = 0; var11 < this.field2733; var11++) {
            this.field2730[this.field2731[var11]] = var2.method2477();
        }
        for (int var12 = 0; var12 < this.field2733; var12++) {
            this.field2743[this.field2731[var12]] = var2.method2492();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2733; var13++) {
                int var14 = this.field2731[var13];
                int var15 = this.field2743[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2732[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2732[var14][var18] = var16 += var2.method2637();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2736[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2733; var20++) {
                int var21 = this.field2731[var20];
                int var22 = this.field2743[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2732[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2732[var21][var25] = var23 += var2.method2492();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2736[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2726 = new int[var6 + 1][];
        this.field2734 = new class196[var6 + 1];
        for (int var27 = 0; var27 < this.field2733; var27++) {
            int var28 = this.field2731[var27];
            int var29 = this.field2743[var28];
            this.field2726[var28] = new int[this.field2736[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2726[var28][this.field2732[var28][var30]] = var2.method2477();
            }
            this.field2734[var28] = new class196(this.field2726[var28]);
        }
    }

    @ObfuscatedName("fp.g(II)V")
    public void method3193(int arg0) {
    }

    @ObfuscatedName("fp.r(IIB)[B")
    public byte[] method3210(int arg0, int arg1) {
        return this.method3195(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fp.e(II[IB)[B")
    public byte[] method3195(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return null;
        }
        if (this.field2736[arg0][arg1] == null) {
            boolean var4 = this.method3208(arg0, arg2);
            if (!var4) {
                this.method3202(arg0);
                boolean var5 = this.method3208(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method979(this.field2736[arg0][arg1], false);
        if (this.field2728) {
            this.field2736[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fp.h(III)Z")
    public boolean method3252(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return false;
        } else if (this.field2736[arg0][arg1] != null) {
            return true;
        } else if (this.field2735[arg0] == null) {
            this.method3202(arg0);
            return this.field2735[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.s(II)Z")
    public boolean method3220(int arg0) {
        if (this.field2735[arg0] == null) {
            this.method3202(arg0);
            return this.field2735[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.k(I)Z")
    public boolean method3229() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2731.length; var2++) {
            int var3 = this.field2731[var2];
            if (this.field2735[var3] == null) {
                this.method3202(var3);
                if (this.field2735[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fp.u(II)[B")
    public byte[] method3201(int arg0) {
        if (this.field2736.length == 1) {
            return this.method3210(0, arg0);
        } else if (this.field2736[arg0].length == 1) {
            return this.method3210(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.n(III)[B")
    public byte[] method3200(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return null;
        }
        if (this.field2736[arg0][arg1] == null) {
            boolean var3 = this.method3208(arg0, (int[]) null);
            if (!var3) {
                this.method3202(arg0);
                boolean var4 = this.method3208(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method979(this.field2736[arg0][arg1], false);
    }

    @ObfuscatedName("fp.b(IS)[B")
    public byte[] method3254(int arg0) {
        if (this.field2736.length == 1) {
            return this.method3200(0, arg0);
        } else if (this.field2736[arg0].length == 1) {
            return this.method3200(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.m(II)V")
    public void method3202(int arg0) {
    }

    @ObfuscatedName("fp.q(II)[I")
    public int[] method3194(int arg0) {
        return this.field2732[arg0];
    }

    @ObfuscatedName("fp.p(II)I")
    public int method3204(int arg0) {
        return this.field2736[arg0].length;
    }

    @ObfuscatedName("fp.w(B)I")
    public int method3205() {
        return this.field2736.length;
    }

    @ObfuscatedName("fp.o(II)V")
    public void method3206(int arg0) {
        for (int var2 = 0; var2 < this.field2736[arg0].length; var2++) {
            this.field2736[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fp.d(I)V")
    public void method3207() {
        for (int var1 = 0; var1 < this.field2736.length; var1++) {
            if (this.field2736[var1] != null) {
                for (int var2 = 0; var2 < this.field2736[var1].length; var2++) {
                    this.field2736[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fp.f(I[II)Z")
    public boolean method3208(int arg0, int[] arg1) {
        if (this.field2735[arg0] == null) {
            return false;
        }
        int var3 = this.field2743[arg0];
        int[] var4 = this.field2732[arg0];
        Object[] var5 = this.field2736[arg0];
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
            var8 = class129.method979(this.field2735[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2510(arg1, 5, var9.field2052.length);
        } else {
            var8 = class129.method979(this.field2735[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2750(var8);
        } catch (RuntimeException var27) {
            throw class152.method2423(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class123.method860(var8, var8.length) + "," + class123.method860(var8, var8.length - 2) + "," + this.field2737[arg0] + "," + this.field2738);
        }
        if (this.field2739) {
            this.field2735[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class123 var15 = new class123(var10);
            int[] var16 = new int[var3];
            var15.field2051 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2477();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2051 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2477();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2728) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class129.method1106(var20[var26], false);
                }
            }
        } else if (this.field2728) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method1106(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fp.z(Ljava/lang/String;B)I")
    public int method3209(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2740.method3647(class167.method3083(var2));
    }

    @ObfuscatedName("fp.i(ILjava/lang/String;I)I")
    public int method3258(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2734[arg0].method3647(class167.method3083(var3));
    }

    @ObfuscatedName("fp.v(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3211(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2740.method3647(class167.method3083(var3));
        int var6 = this.field2734[var5].method3647(class167.method3083(var4));
        return this.method3210(var5, var6);
    }

    @ObfuscatedName("fp.j(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3212(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2740.method3647(class167.method3083(var3));
        int var6 = this.field2734[var5].method3647(class167.method3083(var4));
        return this.method3252(var5, var6);
    }

    @ObfuscatedName("fp.x(Ljava/lang/String;B)Z")
    public boolean method3213(String arg0) {
        int var2 = this.method3209("");
        return var2 == -1 ? this.method3212(arg0, "") : this.method3212("", arg0);
    }

    @ObfuscatedName("fp.t(Ljava/lang/String;I)V")
    public void method3245(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2740.method3647(class167.method3083(var2));
        if (var3 >= 0) {
            this.method3193(var3);
        }
    }

    @ObfuscatedName("df.y([BI)[B")
    public static final byte[] method2750(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2490();
        int var3 = var1.method2477();
        if (var3 < 0 || !(field2741 == 0 || var3 <= field2741)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2611(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2477();
            if (var5 < 0 || field2741 != 0 && var5 > field2741) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2434(var6, var5, arg0, var3, 9);
            } else {
                field2725.method2427(var1, var6);
            }
            return var6;
        }
    }
}
