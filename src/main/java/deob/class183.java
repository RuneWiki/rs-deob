package deob;

@ObfuscatedName("gv")
public abstract class class183 {

    @ObfuscatedName("gv.b")
    public int field2718;

    @ObfuscatedName("gv.e")
    public int[] field2713;

    @ObfuscatedName("gv.c")
    public int[] field2714;

    @ObfuscatedName("gv.l")
    public class123 field2715;

    @ObfuscatedName("gv.y")
    public int[] field2716;

    @ObfuscatedName("gv.j")
    public int[] field2728;

    @ObfuscatedName("gv.g")
    public int[] field2720;

    @ObfuscatedName("gv.s")
    public int[][] field2719;

    @ObfuscatedName("gv.r")
    public int[][] field2733;

    @ObfuscatedName("gv.t")
    public class123[] field2721;

    @ObfuscatedName("gv.k")
    public Object[] field2722;

    @ObfuscatedName("gv.f")
    public Object[][] field2723;

    @ObfuscatedName("gv.a")
    public static class147 field2724 = new class147();

    @ObfuscatedName("gv.v")
    public int field2729;

    @ObfuscatedName("gv.d")
    public boolean field2726;

    @ObfuscatedName("gv.o")
    public boolean field2717;

    @ObfuscatedName("gv.q")
    public static int field2712 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2726 = arg0;
        this.field2717 = arg1;
    }

    @ObfuscatedName("gv.b([BI)V")
    public void method3124(byte[] arg0) {
        this.field2729 = class154.method2576(arg0, arg0.length);
        class154 var2 = new class154(method1854(arg0));
        int var3 = var2.method2669();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2815();
        }
        int var4 = var2.method2669();
        if (var3 >= 7) {
            this.field2718 = var2.method2683();
        } else {
            this.field2718 = var2.method2671();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2713 = new int[this.field2718];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2718; var7++) {
                this.field2713[var7] = var5 += var2.method2683();
                if (this.field2713[var7] > var6) {
                    var6 = this.field2713[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2718; var8++) {
                this.field2713[var8] = var5 += var2.method2671();
                if (this.field2713[var8] > var6) {
                    var6 = this.field2713[var8];
                }
            }
        }
        this.field2716 = new int[var6 + 1];
        this.field2728 = new int[var6 + 1];
        this.field2720 = new int[var6 + 1];
        this.field2719 = new int[var6 + 1][];
        this.field2722 = new Object[var6 + 1];
        this.field2723 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2714 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2718; var9++) {
                this.field2714[this.field2713[var9]] = var2.method2815();
            }
            this.field2715 = new class123(this.field2714);
        }
        for (int var10 = 0; var10 < this.field2718; var10++) {
            this.field2716[this.field2713[var10]] = var2.method2815();
        }
        for (int var11 = 0; var11 < this.field2718; var11++) {
            this.field2728[this.field2713[var11]] = var2.method2815();
        }
        for (int var12 = 0; var12 < this.field2718; var12++) {
            this.field2720[this.field2713[var12]] = var2.method2671();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2718; var13++) {
                int var14 = this.field2713[var13];
                int var15 = this.field2720[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2719[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2719[var14][var18] = var16 += var2.method2683();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2723[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2718; var20++) {
                int var21 = this.field2713[var20];
                int var22 = this.field2720[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2719[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2719[var21][var25] = var23 += var2.method2671();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2723[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2733 = new int[var6 + 1][];
        this.field2721 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2718; var27++) {
            int var28 = this.field2713[var27];
            int var29 = this.field2720[var28];
            this.field2733[var28] = new int[this.field2723[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2733[var28][this.field2719[var28][var30]] = var2.method2815();
            }
            this.field2721[var28] = new class123(this.field2733[var28]);
        }
    }

    @ObfuscatedName("gv.e(II)V")
    public void method3197(int arg0) {
    }

    @ObfuscatedName("gv.c(III)[B")
    public byte[] method3126(int arg0, int arg1) {
        return this.method3127(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gv.l(II[II)[B")
    public byte[] method3127(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var4 = this.method3140(arg0, arg2);
            if (!var4) {
                this.method3134(arg0);
                boolean var5 = this.method3140(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method202(this.field2723[arg0][arg1], false);
        if (this.field2717) {
            this.field2723[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gv.y(III)Z")
    public boolean method3202(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return false;
        } else if (this.field2723[arg0][arg1] != null) {
            return true;
        } else if (this.field2722[arg0] == null) {
            this.method3134(arg0);
            return this.field2722[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gv.j(IB)Z")
    public boolean method3129(int arg0) {
        if (this.field2722[arg0] == null) {
            this.method3134(arg0);
            return this.field2722[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gv.t(I)Z")
    public boolean method3130() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2713.length; var2++) {
            int var3 = this.field2713[var2];
            if (this.field2722[var3] == null) {
                this.method3134(var3);
                if (this.field2722[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gv.k(II)[B")
    public byte[] method3131(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3126(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3126(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gv.f(III)[B")
    public byte[] method3132(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2723.length || this.field2723[arg0] == null || arg1 < 0 || arg1 >= this.field2723[arg0].length) {
            return null;
        }
        if (this.field2723[arg0][arg1] == null) {
            boolean var3 = this.method3140(arg0, (int[]) null);
            if (!var3) {
                this.method3134(arg0);
                boolean var4 = this.method3140(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method202(this.field2723[arg0][arg1], false);
    }

    @ObfuscatedName("gv.a(IB)[B")
    public byte[] method3133(int arg0) {
        if (this.field2723.length == 1) {
            return this.method3132(0, arg0);
        } else if (this.field2723[arg0].length == 1) {
            return this.method3132(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gv.v(II)V")
    public void method3134(int arg0) {
    }

    @ObfuscatedName("gv.d(II)[I")
    public int[] method3135(int arg0) {
        return this.field2719[arg0];
    }

    @ObfuscatedName("gv.o(IB)I")
    public int method3136(int arg0) {
        return this.field2723[arg0].length;
    }

    @ObfuscatedName("gv.q(I)I")
    public int method3137() {
        return this.field2723.length;
    }

    @ObfuscatedName("gv.i(II)V")
    public void method3168(int arg0) {
        for (int var2 = 0; var2 < this.field2723[arg0].length; var2++) {
            this.field2723[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gv.x(I)V")
    public void method3139() {
        for (int var1 = 0; var1 < this.field2723.length; var1++) {
            if (this.field2723[var1] != null) {
                for (int var2 = 0; var2 < this.field2723[var1].length; var2++) {
                    this.field2723[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gv.z(I[IB)Z")
    public boolean method3140(int arg0, int[] arg1) {
        if (this.field2722[arg0] == null) {
            return false;
        }
        int var3 = this.field2720[arg0];
        int[] var4 = this.field2719[arg0];
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
            var8 = class157.method202(this.field2722[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2881(arg1, 5, var9.field2084.length);
        } else {
            var8 = class157.method202(this.field2722[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1854(var8);
        } catch (RuntimeException var27) {
            throw class102.method2892(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method2576(var8, var8.length) + "," + class154.method2576(var8, var8.length - 2) + "," + this.field2716[arg0] + "," + this.field2729);
        }
        if (this.field2726) {
            this.field2722[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class154 var15 = new class154(var10);
            int[] var16 = new int[var3];
            var15.field2079 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2815();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2079 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2815();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2717) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method844(var20[var26], false);
                }
            }
        } else if (this.field2717) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method844(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gv.n(Ljava/lang/String;B)I")
    public int method3141(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2715.method2238(class208.method2149(var2));
    }

    @ObfuscatedName("gv.w(ILjava/lang/String;B)I")
    public int method3138(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2721[arg0].method2238(class208.method2149(var3));
    }

    @ObfuscatedName("gv.h(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3142(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2715.method2238(class208.method2149(var3));
        int var6 = this.field2721[var5].method2238(class208.method2149(var4));
        return this.method3126(var5, var6);
    }

    @ObfuscatedName("gv.u(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3144(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2715.method2238(class208.method2149(var3));
        int var6 = this.field2721[var5].method2238(class208.method2149(var4));
        return this.method3202(var5, var6);
    }

    @ObfuscatedName("gv.m(Ljava/lang/String;I)Z")
    public boolean method3145(String arg0) {
        int var2 = this.method3141("");
        return var2 == -1 ? this.method3144(arg0, "") : this.method3144("", arg0);
    }

    @ObfuscatedName("gv.p(Ljava/lang/String;I)V")
    public void method3166(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2715.method2238(class208.method2149(var2));
        if (var3 >= 0) {
            this.method3197(var3);
        }
    }

    @ObfuscatedName("cm.aq([BI)[B")
    public static final byte[] method1854(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2669();
        int var3 = var1.method2815();
        if (var3 < 0 || !(field2712 == 0 || var3 <= field2712)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2680(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2815();
            if (var5 < 0 || field2712 != 0 && var5 > field2712) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2611(var6, var5, arg0, var3, 9);
            } else {
                field2724.method2604(var1, var6);
            }
            return var6;
        }
    }
}
