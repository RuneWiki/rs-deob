package deob;

@ObfuscatedName("fa")
public abstract class class171 {

    @ObfuscatedName("fa.m")
    public int field2724;

    @ObfuscatedName("fa.w")
    public int[] field2725;

    @ObfuscatedName("fa.e")
    public int[] field2726;

    @ObfuscatedName("fa.o")
    public class196 field2730;

    @ObfuscatedName("fa.g")
    public int[] field2739;

    @ObfuscatedName("fa.l")
    public int[] field2740;

    @ObfuscatedName("fa.j")
    public int[] field2727;

    @ObfuscatedName("fa.r")
    public int[][] field2731;

    @ObfuscatedName("fa.x")
    public int[][] field2732;

    @ObfuscatedName("fa.k")
    public class196[] field2733;

    @ObfuscatedName("fa.v")
    public Object[] field2734;

    @ObfuscatedName("fa.h")
    public Object[][] field2735;

    @ObfuscatedName("fa.u")
    public static class120 field2736 = new class120();

    @ObfuscatedName("fa.y")
    public int field2737;

    @ObfuscatedName("fa.p")
    public boolean field2738;

    @ObfuscatedName("fa.s")
    public boolean field2729;

    @ObfuscatedName("fa.f")
    public static int field2741 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2738 = arg0;
        this.field2729 = arg1;
    }

    @ObfuscatedName("fa.m([BI)V")
    public void method3148(byte[] arg0) {
        this.field2737 = class123.method1668(arg0, arg0.length);
        class123 var2 = new class123(method2990(arg0));
        int var3 = var2.method2398();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2419();
        }
        int var4 = var2.method2398();
        if (var3 >= 7) {
            this.field2724 = var2.method2579();
        } else {
            this.field2724 = var2.method2548();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2725 = new int[this.field2724];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2724; var7++) {
                this.field2725[var7] = var5 += var2.method2579();
                if (this.field2725[var7] > var6) {
                    var6 = this.field2725[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2724; var8++) {
                this.field2725[var8] = var5 += var2.method2548();
                if (this.field2725[var8] > var6) {
                    var6 = this.field2725[var8];
                }
            }
        }
        this.field2739 = new int[var6 + 1];
        this.field2740 = new int[var6 + 1];
        this.field2727 = new int[var6 + 1];
        this.field2731 = new int[var6 + 1][];
        this.field2734 = new Object[var6 + 1];
        this.field2735 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2726 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2724; var9++) {
                this.field2726[this.field2725[var9]] = var2.method2419();
            }
            this.field2730 = new class196(this.field2726);
        }
        for (int var10 = 0; var10 < this.field2724; var10++) {
            this.field2739[this.field2725[var10]] = var2.method2419();
        }
        for (int var11 = 0; var11 < this.field2724; var11++) {
            this.field2740[this.field2725[var11]] = var2.method2419();
        }
        for (int var12 = 0; var12 < this.field2724; var12++) {
            this.field2727[this.field2725[var12]] = var2.method2548();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2724; var13++) {
                int var14 = this.field2725[var13];
                int var15 = this.field2727[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2731[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2731[var14][var18] = var16 += var2.method2579();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2735[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2724; var20++) {
                int var21 = this.field2725[var20];
                int var22 = this.field2727[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2731[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2731[var21][var25] = var23 += var2.method2548();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2735[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2732 = new int[var6 + 1][];
        this.field2733 = new class196[var6 + 1];
        for (int var27 = 0; var27 < this.field2724; var27++) {
            int var28 = this.field2725[var27];
            int var29 = this.field2727[var28];
            this.field2732[var28] = new int[this.field2735[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2732[var28][this.field2731[var28][var30]] = var2.method2419();
            }
            this.field2733[var28] = new class196(this.field2732[var28]);
        }
    }

    @ObfuscatedName("fa.w(IB)V")
    public void method3085(int arg0) {
    }

    @ObfuscatedName("fa.e(III)[B")
    public byte[] method3086(int arg0, int arg1) {
        return this.method3087(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fa.o(II[IB)[B")
    public byte[] method3087(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2735.length || this.field2735[arg0] == null || arg1 < 0 || arg1 >= this.field2735[arg0].length) {
            return null;
        }
        if (this.field2735[arg0][arg1] == null) {
            boolean var4 = this.method3100(arg0, arg2);
            if (!var4) {
                this.method3094(arg0);
                boolean var5 = this.method3100(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method2662(this.field2735[arg0][arg1], false);
        if (this.field2729) {
            this.field2735[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fa.g(III)Z")
    public boolean method3141(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2735.length || this.field2735[arg0] == null || arg1 < 0 || arg1 >= this.field2735[arg0].length) {
            return false;
        } else if (this.field2735[arg0][arg1] != null) {
            return true;
        } else if (this.field2734[arg0] == null) {
            this.method3094(arg0);
            return this.field2734[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.l(II)Z")
    public boolean method3089(int arg0) {
        if (this.field2734[arg0] == null) {
            this.method3094(arg0);
            return this.field2734[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.j(B)Z")
    public boolean method3090() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2725.length; var2++) {
            int var3 = this.field2725[var2];
            if (this.field2734[var3] == null) {
                this.method3094(var3);
                if (this.field2734[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fa.r(IB)[B")
    public byte[] method3091(int arg0) {
        if (this.field2735.length == 1) {
            return this.method3086(0, arg0);
        } else if (this.field2735[arg0].length == 1) {
            return this.method3086(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.x(III)[B")
    public byte[] method3092(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2735.length || this.field2735[arg0] == null || arg1 < 0 || arg1 >= this.field2735[arg0].length) {
            return null;
        }
        if (this.field2735[arg0][arg1] == null) {
            boolean var3 = this.method3100(arg0, (int[]) null);
            if (!var3) {
                this.method3094(arg0);
                boolean var4 = this.method3100(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method2662(this.field2735[arg0][arg1], false);
    }

    @ObfuscatedName("fa.k(II)[B")
    public byte[] method3145(int arg0) {
        if (this.field2735.length == 1) {
            return this.method3092(0, arg0);
        } else if (this.field2735[arg0].length == 1) {
            return this.method3092(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.v(IB)V")
    public void method3094(int arg0) {
    }

    @ObfuscatedName("fa.h(II)[I")
    public int[] method3135(int arg0) {
        return this.field2731[arg0];
    }

    @ObfuscatedName("fa.u(II)I")
    public int method3099(int arg0) {
        return this.field2735[arg0].length;
    }

    @ObfuscatedName("fa.y(I)I")
    public int method3088() {
        return this.field2735.length;
    }

    @ObfuscatedName("fa.p(II)V")
    public void method3083(int arg0) {
        for (int var2 = 0; var2 < this.field2735[arg0].length; var2++) {
            this.field2735[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fa.s(I)V")
    public void method3102() {
        for (int var1 = 0; var1 < this.field2735.length; var1++) {
            if (this.field2735[var1] != null) {
                for (int var2 = 0; var2 < this.field2735[var1].length; var2++) {
                    this.field2735[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fa.f(I[II)Z")
    public boolean method3100(int arg0, int[] arg1) {
        if (this.field2734[arg0] == null) {
            return false;
        }
        int var3 = this.field2727[arg0];
        int[] var4 = this.field2731[arg0];
        Object[] var5 = this.field2735[arg0];
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
            var8 = class129.method2662(this.field2734[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2433(arg1, 5, var9.field2048.length);
        } else {
            var8 = class129.method2662(this.field2734[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2990(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class123.method2703(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class123.method2703(var8, 0, var17);
            throw class152.method779(var34, var16 + var18 + "," + this.field2739[arg0] + "," + this.field2737);
        }
        if (this.field2738) {
            this.field2734[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class123 var22 = new class123(var10);
            int[] var23 = new int[var3];
            var22.field2046 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2419();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2046 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2419();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2729) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class129.method2714(var27[var33], false);
                }
            }
        } else if (this.field2729) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method2714(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fa.i(Ljava/lang/String;I)I")
    public int method3101(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2730.method3545(class167.method2326(var2));
    }

    @ObfuscatedName("fa.d(ILjava/lang/String;I)I")
    public int method3150(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2733[arg0].method3545(class167.method2326(var3));
    }

    @ObfuscatedName("fa.t(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method3116(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2730.method3545(class167.method2326(var3));
        int var6 = this.field2733[var5].method3545(class167.method2326(var4));
        return this.method3086(var5, var6);
    }

    @ObfuscatedName("fa.c(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3104(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2730.method3545(class167.method2326(var3));
        int var6 = this.field2733[var5].method3545(class167.method2326(var4));
        return this.method3141(var5, var6);
    }

    @ObfuscatedName("fa.z(Ljava/lang/String;I)Z")
    public boolean method3127(String arg0) {
        int var2 = this.method3101("");
        return var2 == -1 ? this.method3104(arg0, "") : this.method3104("", arg0);
    }

    @ObfuscatedName("fa.n(Ljava/lang/String;I)V")
    public void method3106(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2730.method3545(class167.method2326(var2));
        if (var3 >= 0) {
            this.method3085(var3);
        }
    }

    @ObfuscatedName("fy.q([BI)[B")
    public static final byte[] method2990(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2398();
        int var3 = var1.method2419();
        if (var3 < 0 || !(field2741 == 0 || var3 <= field2741)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2425(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2419();
            if (var5 < 0 || field2741 != 0 && var5 > field2741) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2363(var6, var5, arg0, var3, 9);
            } else {
                field2736.method2359(var1, var6);
            }
            return var6;
        }
    }
}
