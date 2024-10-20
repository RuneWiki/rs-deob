package deob;

@ObfuscatedName("gd")
public abstract class class185 {

    @ObfuscatedName("gd.d")
    public int field2724;

    @ObfuscatedName("gd.c")
    public int[] field2710;

    @ObfuscatedName("gd.n")
    public int[] field2711;

    @ObfuscatedName("gd.q")
    public class144 field2720;

    @ObfuscatedName("gd.t")
    public int[] field2713;

    @ObfuscatedName("gd.p")
    public int[] field2715;

    @ObfuscatedName("gd.u")
    public int[] field2712;

    @ObfuscatedName("gd.z")
    public int[][] field2716;

    @ObfuscatedName("gd.l")
    public int[][] field2717;

    @ObfuscatedName("gd.v")
    public class144[] field2718;

    @ObfuscatedName("gd.g")
    public Object[] field2709;

    @ObfuscatedName("gd.w")
    public Object[][] field2726;

    @ObfuscatedName("gd.r")
    public static class123 field2714 = new class123();

    @ObfuscatedName("gd.s")
    public int field2722;

    @ObfuscatedName("gd.k")
    public boolean field2723;

    @ObfuscatedName("gd.e")
    public boolean field2721;

    @ObfuscatedName("gd.j")
    public static int field2725 = 0;

    public class185(boolean arg0, boolean arg1) {
        this.field2723 = arg0;
        this.field2721 = arg1;
    }

    @ObfuscatedName("gd.d([BI)V")
    public void method3109(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class130.method42(arg0, 0, var2);
        this.field2722 = var3;
        class130 var4 = new class130(method2984(arg0));
        int var5 = var4.method2379();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2246();
        }
        int var6 = var4.method2379();
        if (var5 >= 7) {
            this.field2724 = var4.method2341();
        } else {
            this.field2724 = var4.method2232();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2710 = new int[this.field2724];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2724; var9++) {
                this.field2710[var9] = var7 += var4.method2341();
                if (this.field2710[var9] > var8) {
                    var8 = this.field2710[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2724; var10++) {
                this.field2710[var10] = var7 += var4.method2232();
                if (this.field2710[var10] > var8) {
                    var8 = this.field2710[var10];
                }
            }
        }
        this.field2713 = new int[var8 + 1];
        this.field2715 = new int[var8 + 1];
        this.field2712 = new int[var8 + 1];
        this.field2716 = new int[var8 + 1][];
        this.field2709 = new Object[var8 + 1];
        this.field2726 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2711 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2724; var11++) {
                this.field2711[this.field2710[var11]] = var4.method2246();
            }
            this.field2720 = new class144(this.field2711);
        }
        for (int var12 = 0; var12 < this.field2724; var12++) {
            this.field2713[this.field2710[var12]] = var4.method2246();
        }
        for (int var13 = 0; var13 < this.field2724; var13++) {
            this.field2715[this.field2710[var13]] = var4.method2246();
        }
        for (int var14 = 0; var14 < this.field2724; var14++) {
            this.field2712[this.field2710[var14]] = var4.method2232();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2724; var15++) {
                int var16 = this.field2710[var15];
                int var17 = this.field2712[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2716[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2716[var16][var20] = var18 += var4.method2341();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2726[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2724; var22++) {
                int var23 = this.field2710[var22];
                int var24 = this.field2712[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2716[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2716[var23][var27] = var25 += var4.method2232();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2726[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2717 = new int[var8 + 1][];
        this.field2718 = new class144[var8 + 1];
        for (int var29 = 0; var29 < this.field2724; var29++) {
            int var30 = this.field2710[var29];
            int var31 = this.field2712[var30];
            this.field2717[var30] = new int[this.field2726[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2717[var30][this.field2716[var30][var32]] = var4.method2246();
            }
            this.field2718[var30] = new class144(this.field2717[var30]);
        }
    }

    @ObfuscatedName("gd.c(II)V")
    public void method3115(int arg0) {
    }

    @ObfuscatedName("gd.n(III)[B")
    public byte[] method3129(int arg0, int arg1) {
        return this.method3113(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gd.q(II[II)[B")
    public byte[] method3113(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2726.length || this.field2726[arg0] == null || arg1 < 0 || arg1 >= this.field2726[arg0].length) {
            return null;
        }
        if (this.field2726[arg0][arg1] == null) {
            boolean var4 = this.method3105(arg0, arg2);
            if (!var4) {
                this.method3095(arg0);
                boolean var5 = this.method3105(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class133.method1814(this.field2726[arg0][arg1], false);
        if (this.field2721) {
            this.field2726[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gd.t(III)Z")
    public boolean method3089(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2726.length || this.field2726[arg0] == null || arg1 < 0 || arg1 >= this.field2726[arg0].length) {
            return false;
        } else if (this.field2726[arg0][arg1] != null) {
            return true;
        } else if (this.field2709[arg0] == null) {
            this.method3095(arg0);
            return this.field2709[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gd.p(II)Z")
    public boolean method3090(int arg0) {
        if (this.field2709[arg0] == null) {
            this.method3095(arg0);
            return this.field2709[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gd.u(I)Z")
    public boolean method3091() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2710.length; var2++) {
            int var3 = this.field2710[var2];
            if (this.field2709[var3] == null) {
                this.method3095(var3);
                if (this.field2709[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gd.w(II)[B")
    public byte[] method3092(int arg0) {
        if (this.field2726.length == 1) {
            return this.method3129(0, arg0);
        } else if (this.field2726[arg0].length == 1) {
            return this.method3129(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gd.r(III)[B")
    public byte[] method3093(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2726.length || this.field2726[arg0] == null || arg1 < 0 || arg1 >= this.field2726[arg0].length) {
            return null;
        }
        if (this.field2726[arg0][arg1] == null) {
            boolean var3 = this.method3105(arg0, (int[]) null);
            if (!var3) {
                this.method3095(arg0);
                boolean var4 = this.method3105(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class133.method1814(this.field2726[arg0][arg1], false);
    }

    @ObfuscatedName("gd.s(IB)[B")
    public byte[] method3099(int arg0) {
        if (this.field2726.length == 1) {
            return this.method3093(0, arg0);
        } else if (this.field2726[arg0].length == 1) {
            return this.method3093(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gd.k(II)V")
    public void method3095(int arg0) {
    }

    @ObfuscatedName("gd.e(II)[I")
    public int[] method3096(int arg0) {
        return this.field2716[arg0];
    }

    @ObfuscatedName("gd.j(II)I")
    public int method3097(int arg0) {
        return this.field2726[arg0].length;
    }

    @ObfuscatedName("gd.i(I)I")
    public int method3098() {
        return this.field2726.length;
    }

    @ObfuscatedName("gd.a(II)V")
    public void method3112(int arg0) {
        for (int var2 = 0; var2 < this.field2726[arg0].length; var2++) {
            this.field2726[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gd.x(S)V")
    public void method3101() {
        for (int var1 = 0; var1 < this.field2726.length; var1++) {
            if (this.field2726[var1] != null) {
                for (int var2 = 0; var2 < this.field2726[var1].length; var2++) {
                    this.field2726[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gd.h(I[II)Z")
    public boolean method3105(int arg0, int[] arg1) {
        if (this.field2709[arg0] == null) {
            return false;
        }
        int var3 = this.field2712[arg0];
        int[] var4 = this.field2716[arg0];
        Object[] var5 = this.field2726[arg0];
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
            var8 = class133.method1814(this.field2709[arg0], true);
            class130 var9 = new class130(var8);
            var9.method2439(arg1, 5, var9.field1955.length);
        } else {
            var8 = class133.method1814(this.field2709[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2984(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class130.method42(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class130.method42(var8, 0, var17);
            throw class102.method750(var34, var16 + var18 + "," + this.field2713[arg0] + "," + this.field2722);
        }
        if (this.field2723) {
            this.field2709[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class130 var22 = new class130(var10);
            int[] var23 = new int[var3];
            var22.field1956 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2246();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1956 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2246();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2721) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class133.method258(var27[var33], false);
                }
            }
        } else if (this.field2721) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class133.method258(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gd.b(Ljava/lang/String;I)I")
    public int method3088(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2720.method2589(class215.method2058(var2));
    }

    @ObfuscatedName("gd.f(ILjava/lang/String;B)I")
    public int method3102(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2718[arg0].method2589(class215.method2058(var3));
    }

    @ObfuscatedName("gd.o(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3103(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2720.method2589(class215.method2058(var3));
        int var6 = this.field2718[var5].method2589(class215.method2058(var4));
        return this.method3129(var5, var6);
    }

    @ObfuscatedName("gd.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3104(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2720.method2589(class215.method2058(var3));
        int var6 = this.field2718[var5].method2589(class215.method2058(var4));
        return this.method3089(var5, var6);
    }

    @ObfuscatedName("gd.y(Ljava/lang/String;I)Z")
    public boolean method3144(String arg0) {
        int var2 = this.method3088("");
        return var2 == -1 ? this.method3104(arg0, "") : this.method3104("", arg0);
    }

    @ObfuscatedName("gd.am(Ljava/lang/String;I)V")
    public void method3127(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2720.method2589(class215.method2058(var2));
        if (var3 >= 0) {
            this.method3115(var3);
        }
    }

    @ObfuscatedName("fh.ax([BI)[B")
    public static final byte[] method2984(byte[] arg0) {
        class130 var1 = new class130(arg0);
        int var2 = var1.method2379();
        int var3 = var1.method2246();
        if (var3 < 0 || !(field2725 == 0 || var3 <= field2725)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2240(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2246();
            if (var5 < 0 || field2725 != 0 && var5 > field2725) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class124.method2167(var6, var5, arg0, var3, 9);
            } else {
                field2714.method2160(var1, var6);
            }
            return var6;
        }
    }
}
