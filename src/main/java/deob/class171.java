package deob;

@ObfuscatedName("fu")
public abstract class class171 {

    @ObfuscatedName("fu.i")
    public int field2719;

    @ObfuscatedName("fu.h")
    public int[] field2727;

    @ObfuscatedName("fu.e")
    public int[] field2730;

    @ObfuscatedName("fu.g")
    public class196 field2718;

    @ObfuscatedName("fu.n")
    public int[] field2731;

    @ObfuscatedName("fu.u")
    public int[] field2726;

    @ObfuscatedName("fu.d")
    public int[] field2721;

    @ObfuscatedName("fu.l")
    public int[][] field2716;

    @ObfuscatedName("fu.m")
    public int[][] field2722;

    @ObfuscatedName("fu.j")
    public class196[] field2724;

    @ObfuscatedName("fu.y")
    public Object[] field2725;

    @ObfuscatedName("fu.s")
    public Object[][] field2723;

    @ObfuscatedName("fu.p")
    public static class120 field2720 = new class120();

    @ObfuscatedName("fu.v")
    public int field2728;

    @ObfuscatedName("fu.r")
    public boolean field2729;

    @ObfuscatedName("fu.c")
    public boolean field2715;

    @ObfuscatedName("fu.w")
    public static int field2717 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2729 = arg0;
        this.field2715 = arg1;
    }

    @ObfuscatedName("fu.i([BI)V")
    public void method3140(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class123.method1526(arg0, 0, var2);
        this.field2728 = var3;
        class123 var4 = new class123(method2736(arg0));
        int var5 = var4.method2404();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2409();
        }
        int var6 = var4.method2404();
        if (var5 >= 7) {
            this.field2719 = var4.method2418();
        } else {
            this.field2719 = var4.method2406();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2727 = new int[this.field2719];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2719; var9++) {
                this.field2727[var9] = var7 += var4.method2418();
                if (this.field2727[var9] > var8) {
                    var8 = this.field2727[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2719; var10++) {
                this.field2727[var10] = var7 += var4.method2406();
                if (this.field2727[var10] > var8) {
                    var8 = this.field2727[var10];
                }
            }
        }
        this.field2731 = new int[var8 + 1];
        this.field2726 = new int[var8 + 1];
        this.field2721 = new int[var8 + 1];
        this.field2716 = new int[var8 + 1][];
        this.field2725 = new Object[var8 + 1];
        this.field2723 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2730 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2719; var11++) {
                this.field2730[this.field2727[var11]] = var4.method2409();
            }
            this.field2718 = new class196(this.field2730);
        }
        for (int var12 = 0; var12 < this.field2719; var12++) {
            this.field2731[this.field2727[var12]] = var4.method2409();
        }
        for (int var13 = 0; var13 < this.field2719; var13++) {
            this.field2726[this.field2727[var13]] = var4.method2409();
        }
        for (int var14 = 0; var14 < this.field2719; var14++) {
            this.field2721[this.field2727[var14]] = var4.method2406();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2719; var15++) {
                int var16 = this.field2727[var15];
                int var17 = this.field2721[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2716[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2716[var16][var20] = var18 += var4.method2418();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2723[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2719; var22++) {
                int var23 = this.field2727[var22];
                int var24 = this.field2721[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2716[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2716[var23][var27] = var25 += var4.method2406();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2723[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2722 = new int[var8 + 1][];
        this.field2724 = new class196[var8 + 1];
        for (int var29 = 0; var29 < this.field2719; var29++) {
            int var30 = this.field2727[var29];
            int var31 = this.field2721[var30];
            this.field2722[var30] = new int[this.field2723[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2722[var30][this.field2716[var30][var32]] = var4.method2409();
            }
            this.field2724[var30] = new class196(this.field2722[var30]);
        }
    }

    @ObfuscatedName("fu.h(IS)V")
    public void method3122(int arg0) {
    }

    @ObfuscatedName("fu.e(III)[B")
    public byte[] method3086(int arg0, int arg1) {
        return this.method3084(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fu.g(II[II)[B")
    public byte[] method3084(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var4 = this.method3097(arg0, arg2);
            if (!var4) {
                this.method3091(arg0);
                boolean var5 = this.method3097(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method52(this.field2723[arg0][arg1], false);
        if (this.field2715) {
            this.field2723[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fu.n(III)Z")
    public boolean method3085(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return false;
        } else if (this.field2723[arg0][arg1] != null) {
            return true;
        } else if (this.field2725[arg0] == null) {
            this.method3091(arg0);
            return this.field2725[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.u(II)Z")
    public boolean method3148(int arg0) {
        if (this.field2725[arg0] == null) {
            this.method3091(arg0);
            return this.field2725[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.d(I)Z")
    public boolean method3109() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2727.length; var2++) {
            int var3 = this.field2727[var2];
            if (this.field2725[var3] == null) {
                this.method3091(var3);
                if (this.field2725[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.l(II)[B")
    public byte[] method3105(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3086(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3086(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.m(III)[B")
    public byte[] method3089(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var3 = this.method3097(arg0, (int[]) null);
            if (!var3) {
                this.method3091(arg0);
                boolean var4 = this.method3097(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method52(this.field2723[arg0][arg1], false);
    }

    @ObfuscatedName("fu.j(IB)[B")
    public byte[] method3113(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3089(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3089(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.y(IB)V")
    public void method3091(int arg0) {
    }

    @ObfuscatedName("fu.s(II)[I")
    public int[] method3092(int arg0) {
        return this.field2716[arg0];
    }

    @ObfuscatedName("fu.p(II)I")
    public int method3093(int arg0) {
        return this.field2723[arg0].length;
    }

    @ObfuscatedName("fu.v(I)I")
    public int method3094() {
        return this.field2723.length;
    }

    @ObfuscatedName("fu.r(IB)V")
    public void method3095(int arg0) {
        for (int var2 = 0; var2 < this.field2723[arg0].length; var2++) {
            this.field2723[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fu.c(I)V")
    public void method3096() {
        for (int var1 = 0; var1 < this.field2723.length; var1++) {
            if (this.field2723[var1] != null) {
                for (int var2 = 0; var2 < this.field2723[var1].length; var2++) {
                    this.field2723[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fu.w(I[IB)Z")
    public boolean method3097(int arg0, int[] arg1) {
        if (this.field2725[arg0] == null) {
            return false;
        }
        int var3 = this.field2721[arg0];
        int[] var4 = this.field2716[arg0];
        Object[] var5 = this.field2723[arg0];
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
            var8 = class129.method52(this.field2725[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2424(arg1, 5, var9.field2049.length);
        } else {
            var8 = class129.method52(this.field2725[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2736(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class123.method1526(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class123.method1526(var8, 0, var18);
            throw class152.method2281(var35, var17 + var19 + "," + this.field2731[arg0] + "," + this.field2728);
        }
        if (this.field2729) {
            this.field2725[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class123 var23 = new class123(var10);
            int[] var24 = new int[var3];
            var23.field2046 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2409();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2046 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2409();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2715) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class129.method99(var28[var34], false);
                }
            }
        } else if (this.field2715) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method99(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fu.x(Ljava/lang/String;B)I")
    public int method3098(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2718.method3527(class167.method179(var2));
    }

    @ObfuscatedName("fu.k(ILjava/lang/String;I)I")
    public int method3099(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2724[arg0].method3527(class167.method179(var3));
    }

    @ObfuscatedName("fu.z(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3100(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2718.method3527(class167.method179(var3));
        int var6 = this.field2724[var5].method3527(class167.method179(var4));
        return this.method3086(var5, var6);
    }

    @ObfuscatedName("fu.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3154(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2718.method3527(class167.method179(var3));
        int var6 = this.field2724[var5].method3527(class167.method179(var4));
        return this.method3085(var5, var6);
    }

    @ObfuscatedName("fu.o(Ljava/lang/String;I)Z")
    public boolean method3102(String arg0) {
        int var2 = this.method3098("");
        return var2 == -1 ? this.method3154(arg0, "") : this.method3154("", arg0);
    }

    @ObfuscatedName("fu.f(Ljava/lang/String;I)V")
    public void method3103(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2718.method3527(class167.method179(var2));
        if (var3 >= 0) {
            this.method3122(var3);
        }
    }

    @ObfuscatedName("en.b([BB)[B")
    public static final byte[] method2736(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2404();
        int var3 = var1.method2409();
        if (var3 < 0 || !(field2717 == 0 || var3 <= field2717)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2415(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2409();
            if (var5 < 0 || field2717 != 0 && var5 > field2717) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2377(var6, var5, arg0, var3, 9);
            } else {
                field2720.method2347(var1, var6);
            }
            return var6;
        }
    }
}
