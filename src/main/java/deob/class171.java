package deob;

@ObfuscatedName("fu")
public abstract class class171 {

    @ObfuscatedName("fu.a")
    public int field2741;

    @ObfuscatedName("fu.d")
    public int[] field2733;

    @ObfuscatedName("fu.v")
    public int[] field2737;

    @ObfuscatedName("fu.r")
    public class196 field2734;

    @ObfuscatedName("fu.z")
    public int[] field2736;

    @ObfuscatedName("fu.t")
    public int[] field2732;

    @ObfuscatedName("fu.n")
    public int[] field2742;

    @ObfuscatedName("fu.i")
    public int[][] field2739;

    @ObfuscatedName("fu.g")
    public int[][] field2740;

    @ObfuscatedName("fu.m")
    public class196[] field2744;

    @ObfuscatedName("fu.k")
    public Object[] field2738;

    @ObfuscatedName("fu.x")
    public Object[][] field2743;

    @ObfuscatedName("fu.u")
    public static class120 field2735 = new class120();

    @ObfuscatedName("fu.j")
    public int field2745;

    @ObfuscatedName("fu.q")
    public boolean field2746;

    @ObfuscatedName("fu.w")
    public boolean field2747;

    @ObfuscatedName("fu.b")
    public static int field2748 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2746 = arg0;
        this.field2747 = arg1;
    }

    @ObfuscatedName("fu.a([BI)V")
    public void method3115(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class123.method2276(arg0, 0, var2);
        this.field2745 = var3;
        class123 var4 = new class123(method2461(arg0));
        int var5 = var4.method2395();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2400();
        }
        int var6 = var4.method2395();
        if (var5 >= 7) {
            this.field2741 = var4.method2409();
        } else {
            this.field2741 = var4.method2584();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2733 = new int[this.field2741];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2741; var9++) {
                this.field2733[var9] = var7 += var4.method2409();
                if (this.field2733[var9] > var8) {
                    var8 = this.field2733[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2741; var10++) {
                this.field2733[var10] = var7 += var4.method2584();
                if (this.field2733[var10] > var8) {
                    var8 = this.field2733[var10];
                }
            }
        }
        this.field2736 = new int[var8 + 1];
        this.field2732 = new int[var8 + 1];
        this.field2742 = new int[var8 + 1];
        this.field2739 = new int[var8 + 1][];
        this.field2738 = new Object[var8 + 1];
        this.field2743 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2737 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2741; var11++) {
                this.field2737[this.field2733[var11]] = var4.method2400();
            }
            this.field2734 = new class196(this.field2737);
        }
        for (int var12 = 0; var12 < this.field2741; var12++) {
            this.field2736[this.field2733[var12]] = var4.method2400();
        }
        for (int var13 = 0; var13 < this.field2741; var13++) {
            this.field2732[this.field2733[var13]] = var4.method2400();
        }
        for (int var14 = 0; var14 < this.field2741; var14++) {
            this.field2742[this.field2733[var14]] = var4.method2584();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2741; var15++) {
                int var16 = this.field2733[var15];
                int var17 = this.field2742[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2739[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2739[var16][var20] = var18 += var4.method2409();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2743[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2741; var22++) {
                int var23 = this.field2733[var22];
                int var24 = this.field2742[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2739[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2739[var23][var27] = var25 += var4.method2584();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2743[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2740 = new int[var8 + 1][];
        this.field2744 = new class196[var8 + 1];
        for (int var29 = 0; var29 < this.field2741; var29++) {
            int var30 = this.field2733[var29];
            int var31 = this.field2742[var30];
            this.field2740[var30] = new int[this.field2743[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2740[var30][this.field2739[var30][var32]] = var4.method2400();
            }
            this.field2744[var30] = new class196(this.field2740[var30]);
        }
    }

    @ObfuscatedName("fu.d(II)V")
    public void method3116(int arg0) {
    }

    @ObfuscatedName("fu.v(III)[B")
    public byte[] method3117(int arg0, int arg1) {
        return this.method3118(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fu.r(II[II)[B")
    public byte[] method3118(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2743.length || this.field2743[arg0] == null || arg1 < 0 || arg1 >= this.field2743[arg0].length) {
            return null;
        }
        if (this.field2743[arg0][arg1] == null) {
            boolean var4 = this.method3124(arg0, arg2);
            if (!var4) {
                this.method3125(arg0);
                boolean var5 = this.method3124(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method1017(this.field2743[arg0][arg1], false);
        if (this.field2747) {
            this.field2743[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fu.z(IIS)Z")
    public boolean method3159(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2743.length || this.field2743[arg0] == null || arg1 < 0 || arg1 >= this.field2743[arg0].length) {
            return false;
        } else if (this.field2743[arg0][arg1] != null) {
            return true;
        } else if (this.field2738[arg0] == null) {
            this.method3125(arg0);
            return this.field2738[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.t(II)Z")
    public boolean method3170(int arg0) {
        if (this.field2738[arg0] == null) {
            this.method3125(arg0);
            return this.field2738[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.n(S)Z")
    public boolean method3161() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2733.length; var2++) {
            int var3 = this.field2733[var2];
            if (this.field2738[var3] == null) {
                this.method3125(var3);
                if (this.field2738[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.i(II)[B")
    public byte[] method3131(int arg0) {
        if (this.field2743.length == 1) {
            return this.method3117(0, arg0);
        } else if (this.field2743[arg0].length == 1) {
            return this.method3117(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.g(III)[B")
    public byte[] method3123(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2743.length || this.field2743[arg0] == null || arg1 < 0 || arg1 >= this.field2743[arg0].length) {
            return null;
        }
        if (this.field2743[arg0][arg1] == null) {
            boolean var3 = this.method3124(arg0, (int[]) null);
            if (!var3) {
                this.method3125(arg0);
                boolean var4 = this.method3124(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method1017(this.field2743[arg0][arg1], false);
    }

    @ObfuscatedName("fu.m(II)[B")
    public byte[] method3157(int arg0) {
        if (this.field2743.length == 1) {
            return this.method3123(0, arg0);
        } else if (this.field2743[arg0].length == 1) {
            return this.method3123(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.k(II)V")
    public void method3125(int arg0) {
    }

    @ObfuscatedName("fu.x(IB)[I")
    public int[] method3138(int arg0) {
        return this.field2739[arg0];
    }

    @ObfuscatedName("fu.u(II)I")
    public int method3127(int arg0) {
        return this.field2743[arg0].length;
    }

    @ObfuscatedName("fu.j(B)I")
    public int method3128() {
        return this.field2743.length;
    }

    @ObfuscatedName("fu.q(II)V")
    public void method3129(int arg0) {
        for (int var2 = 0; var2 < this.field2743[arg0].length; var2++) {
            this.field2743[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fu.w(I)V")
    public void method3130() {
        for (int var1 = 0; var1 < this.field2743.length; var1++) {
            if (this.field2743[var1] != null) {
                for (int var2 = 0; var2 < this.field2743[var1].length; var2++) {
                    this.field2743[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fu.b(I[II)Z")
    public boolean method3124(int arg0, int[] arg1) {
        if (this.field2738[arg0] == null) {
            return false;
        }
        int var3 = this.field2742[arg0];
        int[] var4 = this.field2739[arg0];
        Object[] var5 = this.field2743[arg0];
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
            var8 = class129.method1017(this.field2738[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2415(arg1, 5, var9.field2076.length);
        } else {
            var8 = class129.method1017(this.field2738[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2461(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class123.method2276(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class123.method2276(var8, 0, var18);
            throw class152.method2339(var35, var17 + var19 + "," + this.field2736[arg0] + "," + this.field2745);
        }
        if (this.field2746) {
            this.field2738[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class123 var23 = new class123(var10);
            int[] var24 = new int[var3];
            var23.field2071 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2400();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2071 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2400();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2747) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class129.method2674(var28[var34], false);
                }
            }
        } else if (this.field2747) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method2674(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fu.p(Ljava/lang/String;B)I")
    public int method3132(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2734.method3541(class167.method2716(var2));
    }

    @ObfuscatedName("fu.o(ILjava/lang/String;S)I")
    public int method3121(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2744[arg0].method3541(class167.method2716(var3));
    }

    @ObfuscatedName("fu.y(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3134(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2734.method3541(class167.method2716(var3));
        int var6 = this.field2744[var5].method3541(class167.method2716(var4));
        return this.method3117(var5, var6);
    }

    @ObfuscatedName("fu.s(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3135(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2734.method3541(class167.method2716(var3));
        int var6 = this.field2744[var5].method3541(class167.method2716(var4));
        return this.method3159(var5, var6);
    }

    @ObfuscatedName("fu.e(Ljava/lang/String;I)Z")
    public boolean method3173(String arg0) {
        int var2 = this.method3132("");
        return var2 == -1 ? this.method3135(arg0, "") : this.method3135("", arg0);
    }

    @ObfuscatedName("fu.h(Ljava/lang/String;I)V")
    public void method3137(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2734.method3541(class167.method2716(var2));
        if (var3 >= 0) {
            this.method3116(var3);
        }
    }

    @ObfuscatedName("db.l([BI)[B")
    public static final byte[] method2461(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2395();
        int var3 = var1.method2400();
        if (var3 < 0 || !(field2748 == 0 || var3 <= field2748)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2593(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2400();
            if (var5 < 0 || field2748 != 0 && var5 > field2748) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2361(var6, var5, arg0, var3, 9);
            } else {
                field2735.method2342(var1, var6);
            }
            return var6;
        }
    }
}
