package deob;

@ObfuscatedName("gp")
public abstract class class183 {

    @ObfuscatedName("gp.s")
    public int field2728;

    @ObfuscatedName("gp.c")
    public int[] field2712;

    @ObfuscatedName("gp.f")
    public int[] field2714;

    @ObfuscatedName("gp.h")
    public class123 field2715;

    @ObfuscatedName("gp.a")
    public int[] field2716;

    @ObfuscatedName("gp.g")
    public int[] field2717;

    @ObfuscatedName("gp.k")
    public int[] field2713;

    @ObfuscatedName("gp.u")
    public int[][] field2719;

    @ObfuscatedName("gp.b")
    public int[][] field2720;

    @ObfuscatedName("gp.x")
    public class123[] field2721;

    @ObfuscatedName("gp.r")
    public Object[] field2722;

    @ObfuscatedName("gp.n")
    public Object[][] field2727;

    @ObfuscatedName("gp.m")
    public static class147 field2724 = new class147();

    @ObfuscatedName("gp.j")
    public int field2718;

    @ObfuscatedName("gp.w")
    public boolean field2726;

    @ObfuscatedName("gp.p")
    public boolean field2725;

    @ObfuscatedName("gp.o")
    public static int field2729 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2726 = arg0;
        this.field2725 = arg1;
    }

    @ObfuscatedName("gp.s([BI)V")
    public void method3057(byte[] arg0) {
        this.field2718 = class154.method569(arg0, arg0.length);
        class154 var2 = new class154(method836(arg0));
        int var3 = var2.method2545();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2550();
        }
        int var4 = var2.method2545();
        if (var3 >= 7) {
            this.field2728 = var2.method2559();
        } else {
            this.field2728 = var2.method2541();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2712 = new int[this.field2728];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2728; var7++) {
                this.field2712[var7] = var5 += var2.method2559();
                if (this.field2712[var7] > var6) {
                    var6 = this.field2712[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2728; var8++) {
                this.field2712[var8] = var5 += var2.method2541();
                if (this.field2712[var8] > var6) {
                    var6 = this.field2712[var8];
                }
            }
        }
        this.field2716 = new int[var6 + 1];
        this.field2717 = new int[var6 + 1];
        this.field2713 = new int[var6 + 1];
        this.field2719 = new int[var6 + 1][];
        this.field2722 = new Object[var6 + 1];
        this.field2727 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2714 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2728; var9++) {
                this.field2714[this.field2712[var9]] = var2.method2550();
            }
            this.field2715 = new class123(this.field2714);
        }
        for (int var10 = 0; var10 < this.field2728; var10++) {
            this.field2716[this.field2712[var10]] = var2.method2550();
        }
        for (int var11 = 0; var11 < this.field2728; var11++) {
            this.field2717[this.field2712[var11]] = var2.method2550();
        }
        for (int var12 = 0; var12 < this.field2728; var12++) {
            this.field2713[this.field2712[var12]] = var2.method2541();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2728; var13++) {
                int var14 = this.field2712[var13];
                int var15 = this.field2713[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2719[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2719[var14][var18] = var16 += var2.method2559();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2727[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2728; var20++) {
                int var21 = this.field2712[var20];
                int var22 = this.field2713[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2719[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2719[var21][var25] = var23 += var2.method2541();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2727[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2720 = new int[var6 + 1][];
        this.field2721 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2728; var27++) {
            int var28 = this.field2712[var27];
            int var29 = this.field2713[var28];
            this.field2720[var28] = new int[this.field2727[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2720[var28][this.field2719[var28][var30]] = var2.method2550();
            }
            this.field2721[var28] = new class123(this.field2720[var28]);
        }
    }

    @ObfuscatedName("gp.c(IB)V")
    public void method2985(int arg0) {
    }

    @ObfuscatedName("gp.f(III)[B")
    public byte[] method2986(int arg0, int arg1) {
        return this.method2987(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gp.g(II[II)[B")
    public byte[] method2987(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return null;
        }
        if (this.field2727[arg0][arg1] == null) {
            boolean var4 = this.method3000(arg0, arg2);
            if (!var4) {
                this.method3020(arg0);
                boolean var5 = this.method3000(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method2865(this.field2727[arg0][arg1], false);
        if (this.field2725) {
            this.field2727[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gp.k(III)Z")
    public boolean method2988(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return false;
        } else if (this.field2727[arg0][arg1] != null) {
            return true;
        } else if (this.field2722[arg0] == null) {
            this.method3020(arg0);
            return this.field2722[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gp.u(II)Z")
    public boolean method2989(int arg0) {
        if (this.field2722[arg0] == null) {
            this.method3020(arg0);
            return this.field2722[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gp.b(I)Z")
    public boolean method2990() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2712.length; var2++) {
            int var3 = this.field2712[var2];
            if (this.field2722[var3] == null) {
                this.method3020(var3);
                if (this.field2722[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gp.x(II)[B")
    public byte[] method2991(int arg0) {
        if (this.field2727.length == 1) {
            return this.method2986(0, arg0);
        } else if (this.field2727[arg0].length == 1) {
            return this.method2986(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gp.r(III)[B")
    public byte[] method3041(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return null;
        }
        if (this.field2727[arg0][arg1] == null) {
            boolean var3 = this.method3000(arg0, (int[]) null);
            if (!var3) {
                this.method3020(arg0);
                boolean var4 = this.method3000(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method2865(this.field2727[arg0][arg1], false);
    }

    @ObfuscatedName("gp.n(IB)[B")
    public byte[] method2993(int arg0) {
        if (this.field2727.length == 1) {
            return this.method3041(0, arg0);
        } else if (this.field2727[arg0].length == 1) {
            return this.method3041(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gp.m(IB)V")
    public void method3020(int arg0) {
    }

    @ObfuscatedName("gp.j(II)[I")
    public int[] method2995(int arg0) {
        return this.field2719[arg0];
    }

    @ObfuscatedName("gp.w(IB)I")
    public int method2996(int arg0) {
        return this.field2727[arg0].length;
    }

    @ObfuscatedName("gp.p(I)I")
    public int method3009() {
        return this.field2727.length;
    }

    @ObfuscatedName("gp.o(II)V")
    public void method2998(int arg0) {
        for (int var2 = 0; var2 < this.field2727[arg0].length; var2++) {
            this.field2727[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gp.i(I)V")
    public void method2999() {
        for (int var1 = 0; var1 < this.field2727.length; var1++) {
            if (this.field2727[var1] != null) {
                for (int var2 = 0; var2 < this.field2727[var1].length; var2++) {
                    this.field2727[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gp.z(I[II)Z")
    public boolean method3000(int arg0, int[] arg1) {
        if (this.field2722[arg0] == null) {
            return false;
        }
        int var3 = this.field2713[arg0];
        int[] var4 = this.field2719[arg0];
        Object[] var5 = this.field2727[arg0];
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
            var8 = class157.method2865(this.field2722[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2565(arg1, 5, var9.field2100.length);
        } else {
            var8 = class157.method2865(this.field2722[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method836(var8);
        } catch (RuntimeException var27) {
            throw class102.method62(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method569(var8, var8.length) + "," + class154.method569(var8, var8.length - 2) + "," + this.field2716[arg0] + "," + this.field2718);
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
            var15.field2098 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2550();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2098 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2550();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2725) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method74(var20[var26], false);
                }
            }
        } else if (this.field2725) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method74(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gp.e(Ljava/lang/String;B)I")
    public int method3001(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2715.method2112(class208.method1322(var2));
    }

    @ObfuscatedName("gp.d(ILjava/lang/String;B)I")
    public int method3002(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2721[arg0].method2112(class208.method1322(var3));
    }

    @ObfuscatedName("gp.t(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3003(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2715.method2112(class208.method1322(var3));
        int var6 = this.field2721[var5].method2112(class208.method1322(var4));
        return this.method2986(var5, var6);
    }

    @ObfuscatedName("gp.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3042(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2715.method2112(class208.method1322(var3));
        int var6 = this.field2721[var5].method2112(class208.method1322(var4));
        return this.method2988(var5, var6);
    }

    @ObfuscatedName("gp.y(Ljava/lang/String;B)Z")
    public boolean method3052(String arg0) {
        int var2 = this.method3001("");
        return var2 == -1 ? this.method3042(arg0, "") : this.method3042("", arg0);
    }

    @ObfuscatedName("gp.l(Ljava/lang/String;B)V")
    public void method2983(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2715.method2112(class208.method1322(var2));
        if (var3 >= 0) {
            this.method2985(var3);
        }
    }

    @ObfuscatedName("au.v([BI)[B")
    public static final byte[] method836(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2545();
        int var3 = var1.method2550();
        if (var3 < 0 || !(field2729 == 0 || var3 <= field2729)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2647(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2550();
            if (var5 < 0 || field2729 != 0 && var5 > field2729) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2485(var6, var5, arg0, var3, 9);
            } else {
                field2724.method2479(var1, var6);
            }
            return var6;
        }
    }
}
