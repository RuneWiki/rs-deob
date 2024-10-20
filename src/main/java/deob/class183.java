package deob;

@ObfuscatedName("gh")
public abstract class class183 {

    @ObfuscatedName("gh.k")
    public int field2712;

    @ObfuscatedName("gh.y")
    public int[] field2703;

    @ObfuscatedName("gh.o")
    public int[] field2696;

    @ObfuscatedName("gh.r")
    public class123 field2698;

    @ObfuscatedName("gh.w")
    public int[] field2700;

    @ObfuscatedName("gh.j")
    public int[] field2699;

    @ObfuscatedName("gh.q")
    public int[] field2695;

    @ObfuscatedName("gh.d")
    public int[][] field2701;

    @ObfuscatedName("gh.n")
    public int[][] field2702;

    @ObfuscatedName("gh.c")
    public class123[] field2694;

    @ObfuscatedName("gh.s")
    public Object[] field2704;

    @ObfuscatedName("gh.g")
    public Object[][] field2705;

    @ObfuscatedName("gh.i")
    public static class154 field2706 = new class154();

    @ObfuscatedName("gh.v")
    public int field2707;

    @ObfuscatedName("gh.a")
    public boolean field2708;

    @ObfuscatedName("gh.h")
    public boolean field2697;

    @ObfuscatedName("gh.p")
    public static int field2710 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2708 = arg0;
        this.field2697 = arg1;
    }

    @ObfuscatedName("gh.k([BI)V")
    public void method3063(byte[] arg0) {
        this.field2707 = class161.method192(arg0, arg0.length);
        class161 var2 = new class161(method1853(arg0));
        int var3 = var2.method2733();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2868();
        }
        int var4 = var2.method2733();
        if (var3 >= 7) {
            this.field2712 = var2.method2746();
        } else {
            this.field2712 = var2.method2735();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2703 = new int[this.field2712];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2712; var7++) {
                this.field2703[var7] = var5 += var2.method2746();
                if (this.field2703[var7] > var6) {
                    var6 = this.field2703[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2712; var8++) {
                this.field2703[var8] = var5 += var2.method2735();
                if (this.field2703[var8] > var6) {
                    var6 = this.field2703[var8];
                }
            }
        }
        this.field2700 = new int[var6 + 1];
        this.field2699 = new int[var6 + 1];
        this.field2695 = new int[var6 + 1];
        this.field2701 = new int[var6 + 1][];
        this.field2704 = new Object[var6 + 1];
        this.field2705 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2696 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2712; var9++) {
                this.field2696[this.field2703[var9]] = var2.method2868();
            }
            this.field2698 = new class123(this.field2696);
        }
        for (int var10 = 0; var10 < this.field2712; var10++) {
            this.field2700[this.field2703[var10]] = var2.method2868();
        }
        for (int var11 = 0; var11 < this.field2712; var11++) {
            this.field2699[this.field2703[var11]] = var2.method2868();
        }
        for (int var12 = 0; var12 < this.field2712; var12++) {
            this.field2695[this.field2703[var12]] = var2.method2735();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2712; var13++) {
                int var14 = this.field2703[var13];
                int var15 = this.field2695[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2701[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2701[var14][var18] = var16 += var2.method2746();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2705[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2712; var20++) {
                int var21 = this.field2703[var20];
                int var22 = this.field2695[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2701[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2701[var21][var25] = var23 += var2.method2735();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2705[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2702 = new int[var6 + 1][];
        this.field2694 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2712; var27++) {
            int var28 = this.field2703[var27];
            int var29 = this.field2695[var28];
            this.field2702[var28] = new int[this.field2705[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2702[var28][this.field2701[var28][var30]] = var2.method2868();
            }
            this.field2694[var28] = new class123(this.field2702[var28]);
        }
    }

    @ObfuscatedName("gh.y(II)V")
    public void method3064(int arg0) {
    }

    @ObfuscatedName("gh.o(IIB)[B")
    public byte[] method3065(int arg0, int arg1) {
        return this.method3066(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gh.r(II[II)[B")
    public byte[] method3066(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2705.length || this.field2705[arg0] == null || arg1 < 0 || arg1 >= this.field2705[arg0].length) {
            return null;
        }
        if (this.field2705[arg0][arg1] == null) {
            boolean var4 = this.method3079(arg0, arg2);
            if (!var4) {
                this.method3073(arg0);
                boolean var5 = this.method3079(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class164.method679(this.field2705[arg0][arg1], false);
        if (this.field2697) {
            this.field2705[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gh.w(III)Z")
    public boolean method3067(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2705.length || this.field2705[arg0] == null || arg1 < 0 || arg1 >= this.field2705[arg0].length) {
            return false;
        } else if (this.field2705[arg0][arg1] != null) {
            return true;
        } else if (this.field2704[arg0] == null) {
            this.method3073(arg0);
            return this.field2704[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gh.j(II)Z")
    public boolean method3068(int arg0) {
        if (this.field2704[arg0] == null) {
            this.method3073(arg0);
            return this.field2704[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gh.c(B)Z")
    public boolean method3069() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2703.length; var2++) {
            int var3 = this.field2703[var2];
            if (this.field2704[var3] == null) {
                this.method3073(var3);
                if (this.field2704[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gh.g(II)[B")
    public byte[] method3070(int arg0) {
        if (this.field2705.length == 1) {
            return this.method3065(0, arg0);
        } else if (this.field2705[arg0].length == 1) {
            return this.method3065(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gh.i(III)[B")
    public byte[] method3071(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2705.length || this.field2705[arg0] == null || arg1 < 0 || arg1 >= this.field2705[arg0].length) {
            return null;
        }
        if (this.field2705[arg0][arg1] == null) {
            boolean var3 = this.method3079(arg0, (int[]) null);
            if (!var3) {
                this.method3073(arg0);
                boolean var4 = this.method3079(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class164.method679(this.field2705[arg0][arg1], false);
    }

    @ObfuscatedName("gh.v(II)[B")
    public byte[] method3072(int arg0) {
        if (this.field2705.length == 1) {
            return this.method3071(0, arg0);
        } else if (this.field2705[arg0].length == 1) {
            return this.method3071(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gh.a(II)V")
    public void method3073(int arg0) {
    }

    @ObfuscatedName("gh.h(II)[I")
    public int[] method3074(int arg0) {
        return this.field2701[arg0];
    }

    @ObfuscatedName("gh.p(II)I")
    public int method3075(int arg0) {
        return this.field2705[arg0].length;
    }

    @ObfuscatedName("gh.t(I)I")
    public int method3062() {
        return this.field2705.length;
    }

    @ObfuscatedName("gh.f(II)V")
    public void method3078(int arg0) {
        for (int var2 = 0; var2 < this.field2705[arg0].length; var2++) {
            this.field2705[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gh.z(I)V")
    public void method3080() {
        for (int var1 = 0; var1 < this.field2705.length; var1++) {
            if (this.field2705[var1] != null) {
                for (int var2 = 0; var2 < this.field2705[var1].length; var2++) {
                    this.field2705[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gh.u(I[IB)Z")
    public boolean method3079(int arg0, int[] arg1) {
        if (this.field2704[arg0] == null) {
            return false;
        }
        int var3 = this.field2695[arg0];
        int[] var4 = this.field2701[arg0];
        Object[] var5 = this.field2705[arg0];
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
            var8 = class164.method679(this.field2704[arg0], true);
            class161 var9 = new class161(var8);
            var9.method2930(arg1, 5, var9.field2258.length);
        } else {
            var8 = class164.method679(this.field2704[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1853(var8);
        } catch (RuntimeException var27) {
            throw class102.method88(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class161.method192(var8, var8.length) + "," + class161.method192(var8, var8.length - 2) + "," + this.field2700[arg0] + "," + this.field2707);
        }
        if (this.field2708) {
            this.field2704[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class161 var15 = new class161(var10);
            int[] var16 = new int[var3];
            var15.field2267 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2868();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2267 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2868();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2697) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class164.method126(var20[var26], false);
                }
            }
        } else if (this.field2697) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class164.method126(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gh.b(Ljava/lang/String;I)I")
    public int method3076(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2698.method2148(class208.method114(var2));
    }

    @ObfuscatedName("gh.m(ILjava/lang/String;I)I")
    public int method3077(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2694[arg0].method2148(class208.method114(var3));
    }

    @ObfuscatedName("gh.e(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3133(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2698.method2148(class208.method114(var3));
        int var6 = this.field2694[var5].method2148(class208.method114(var4));
        return this.method3065(var5, var6);
    }

    @ObfuscatedName("gh.l(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3083(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2698.method2148(class208.method114(var3));
        int var6 = this.field2694[var5].method2148(class208.method114(var4));
        return this.method3067(var5, var6);
    }

    @ObfuscatedName("gh.x(Ljava/lang/String;I)Z")
    public boolean method3084(String arg0) {
        int var2 = this.method3076("");
        return var2 == -1 ? this.method3083(arg0, "") : this.method3083("", arg0);
    }

    @ObfuscatedName("gh.ap(Ljava/lang/String;I)V")
    public void method3087(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2698.method2148(class208.method114(var2));
        if (var3 >= 0) {
            this.method3064(var3);
        }
    }

    @ObfuscatedName("cb.aq([BB)[B")
    public static final byte[] method1853(byte[] arg0) {
        class161 var1 = new class161(arg0);
        int var2 = var1.method2733();
        int var3 = var1.method2868();
        if (var3 < 0 || !(field2710 == 0 || var3 <= field2710)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2901(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2868();
            if (var5 < 0 || field2710 != 0 && var5 > field2710) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class155.method2671(var6, var5, arg0, var3, 9);
            } else {
                field2706.method2666(var1, var6);
            }
            return var6;
        }
    }
}
