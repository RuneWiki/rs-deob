package deob;

@ObfuscatedName("fu")
public abstract class class171 {

    @ObfuscatedName("fu.s")
    public int field2723;

    @ObfuscatedName("fu.z")
    public int[] field2719;

    @ObfuscatedName("fu.t")
    public int[] field2720;

    @ObfuscatedName("fu.y")
    public class196 field2722;

    @ObfuscatedName("fu.p")
    public int[] field2726;

    @ObfuscatedName("fu.g")
    public int[] field2721;

    @ObfuscatedName("fu.m")
    public int[] field2725;

    @ObfuscatedName("fu.f")
    public int[][] field2729;

    @ObfuscatedName("fu.k")
    public int[][] field2727;

    @ObfuscatedName("fu.h")
    public class196[] field2728;

    @ObfuscatedName("fu.r")
    public Object[] field2734;

    @ObfuscatedName("fu.w")
    public Object[][] field2730;

    @ObfuscatedName("fu.u")
    public static class120 field2731 = new class120();

    @ObfuscatedName("fu.n")
    public int field2732;

    @ObfuscatedName("fu.d")
    public boolean field2733;

    @ObfuscatedName("fu.a")
    public boolean field2735;

    @ObfuscatedName("fu.b")
    public static int field2724 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2733 = arg0;
        this.field2735 = arg1;
    }

    @ObfuscatedName("fu.s([BB)V")
    public void method3068(byte[] arg0) {
        this.field2732 = class123.method2161(arg0, arg0.length);
        class123 var2 = new class123(method2976(arg0));
        int var3 = var2.method2363();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2408();
        }
        int var4 = var2.method2363();
        if (var3 >= 7) {
            this.field2723 = var2.method2377();
        } else {
            this.field2723 = var2.method2550();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2719 = new int[this.field2723];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2723; var7++) {
                this.field2719[var7] = var5 += var2.method2377();
                if (this.field2719[var7] > var6) {
                    var6 = this.field2719[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2723; var8++) {
                this.field2719[var8] = var5 += var2.method2550();
                if (this.field2719[var8] > var6) {
                    var6 = this.field2719[var8];
                }
            }
        }
        this.field2726 = new int[var6 + 1];
        this.field2721 = new int[var6 + 1];
        this.field2725 = new int[var6 + 1];
        this.field2729 = new int[var6 + 1][];
        this.field2734 = new Object[var6 + 1];
        this.field2730 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2720 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2723; var9++) {
                this.field2720[this.field2719[var9]] = var2.method2408();
            }
            this.field2722 = new class196(this.field2720);
        }
        for (int var10 = 0; var10 < this.field2723; var10++) {
            this.field2726[this.field2719[var10]] = var2.method2408();
        }
        for (int var11 = 0; var11 < this.field2723; var11++) {
            this.field2721[this.field2719[var11]] = var2.method2408();
        }
        for (int var12 = 0; var12 < this.field2723; var12++) {
            this.field2725[this.field2719[var12]] = var2.method2550();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2723; var13++) {
                int var14 = this.field2719[var13];
                int var15 = this.field2725[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2729[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2729[var14][var18] = var16 += var2.method2377();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2730[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2723; var20++) {
                int var21 = this.field2719[var20];
                int var22 = this.field2725[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2729[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2729[var21][var25] = var23 += var2.method2550();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2730[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2727 = new int[var6 + 1][];
        this.field2728 = new class196[var6 + 1];
        for (int var27 = 0; var27 < this.field2723; var27++) {
            int var28 = this.field2719[var27];
            int var29 = this.field2725[var28];
            this.field2727[var28] = new int[this.field2730[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2727[var28][this.field2729[var28][var30]] = var2.method2408();
            }
            this.field2728[var28] = new class196(this.field2727[var28]);
        }
    }

    @ObfuscatedName("fu.z(II)V")
    public void method3069(int arg0) {
    }

    @ObfuscatedName("fu.t(IIB)[B")
    public byte[] method3091(int arg0, int arg1) {
        return this.method3128(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fu.y(II[II)[B")
    public byte[] method3128(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2730.length || this.field2730[arg0] == null || arg1 < 0 || arg1 >= this.field2730[arg0].length) {
            return null;
        }
        if (this.field2730[arg0][arg1] == null) {
            boolean var4 = this.method3086(arg0, arg2);
            if (!var4) {
                this.method3077(arg0);
                boolean var5 = this.method3086(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method1617(this.field2730[arg0][arg1], false);
        if (this.field2735) {
            this.field2730[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fu.p(IIB)Z")
    public boolean method3071(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2730.length || this.field2730[arg0] == null || arg1 < 0 || arg1 >= this.field2730[arg0].length) {
            return false;
        } else if (this.field2730[arg0][arg1] != null) {
            return true;
        } else if (this.field2734[arg0] == null) {
            this.method3077(arg0);
            return this.field2734[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.g(II)Z")
    public boolean method3072(int arg0) {
        if (this.field2734[arg0] == null) {
            this.method3077(arg0);
            return this.field2734[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.m(I)Z")
    public boolean method3073() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2719.length; var2++) {
            int var3 = this.field2719[var2];
            if (this.field2734[var3] == null) {
                this.method3077(var3);
                if (this.field2734[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.f(II)[B")
    public byte[] method3121(int arg0) {
        if (this.field2730.length == 1) {
            return this.method3091(0, arg0);
        } else if (this.field2730[arg0].length == 1) {
            return this.method3091(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.k(III)[B")
    public byte[] method3074(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2730.length || this.field2730[arg0] == null || arg1 < 0 || arg1 >= this.field2730[arg0].length) {
            return null;
        }
        if (this.field2730[arg0][arg1] == null) {
            boolean var3 = this.method3086(arg0, (int[]) null);
            if (!var3) {
                this.method3077(arg0);
                boolean var4 = this.method3086(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method1617(this.field2730[arg0][arg1], false);
    }

    @ObfuscatedName("fu.h(II)[B")
    public byte[] method3076(int arg0) {
        if (this.field2730.length == 1) {
            return this.method3074(0, arg0);
        } else if (this.field2730[arg0].length == 1) {
            return this.method3074(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.r(IS)V")
    public void method3077(int arg0) {
    }

    @ObfuscatedName("fu.w(II)[I")
    public int[] method3101(int arg0) {
        return this.field2729[arg0];
    }

    @ObfuscatedName("fu.u(II)I")
    public int method3079(int arg0) {
        return this.field2730[arg0].length;
    }

    @ObfuscatedName("fu.n(B)I")
    public int method3146() {
        return this.field2730.length;
    }

    @ObfuscatedName("fu.d(II)V")
    public void method3081(int arg0) {
        for (int var2 = 0; var2 < this.field2730[arg0].length; var2++) {
            this.field2730[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fu.a(S)V")
    public void method3082() {
        for (int var1 = 0; var1 < this.field2730.length; var1++) {
            if (this.field2730[var1] != null) {
                for (int var2 = 0; var2 < this.field2730[var1].length; var2++) {
                    this.field2730[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fu.b(I[II)Z")
    public boolean method3086(int arg0, int[] arg1) {
        if (this.field2734[arg0] == null) {
            return false;
        }
        int var3 = this.field2725[arg0];
        int[] var4 = this.field2729[arg0];
        Object[] var5 = this.field2730[arg0];
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
            var8 = class129.method1617(this.field2734[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2383(arg1, 5, var9.field2033.length);
        } else {
            var8 = class129.method1617(this.field2734[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2976(var8);
        } catch (RuntimeException var27) {
            throw class152.method704(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class123.method2161(var8, var8.length) + "," + class123.method2161(var8, var8.length - 2) + "," + this.field2726[arg0] + "," + this.field2732);
        }
        if (this.field2733) {
            this.field2734[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class123 var15 = new class123(var10);
            int[] var16 = new int[var3];
            var15.field2028 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2408();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2028 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2408();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2735) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class129.method2718(var20[var26], false);
                }
            }
        } else if (this.field2735) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method2718(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fu.q(Ljava/lang/String;S)I")
    public int method3084(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2722.method3515(class167.method675(var2));
    }

    @ObfuscatedName("fu.o(ILjava/lang/String;S)I")
    public int method3085(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2728[arg0].method3515(class167.method675(var3));
    }

    @ObfuscatedName("fu.c(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method3092(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2722.method3515(class167.method675(var3));
        int var6 = this.field2728[var5].method3515(class167.method675(var4));
        return this.method3091(var5, var6);
    }

    @ObfuscatedName("fu.i(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3087(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2722.method3515(class167.method675(var3));
        int var6 = this.field2728[var5].method3515(class167.method675(var4));
        return this.method3071(var5, var6);
    }

    @ObfuscatedName("fu.x(Ljava/lang/String;B)Z")
    public boolean method3088(String arg0) {
        int var2 = this.method3084("");
        return var2 == -1 ? this.method3087(arg0, "") : this.method3087("", arg0);
    }

    @ObfuscatedName("fu.v(Ljava/lang/String;B)V")
    public void method3089(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2722.method3515(class167.method675(var2));
        if (var3 >= 0) {
            this.method3069(var3);
        }
    }

    @ObfuscatedName("et.l([BB)[B")
    public static final byte[] method2976(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2363();
        int var3 = var1.method2408();
        if (var3 < 0 || !(field2724 == 0 || var3 <= field2724)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2374(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2408();
            if (var5 < 0 || field2724 != 0 && var5 > field2724) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2322(var6, var5, arg0, var3, 9);
            } else {
                field2731.method2306(var1, var6);
            }
            return var6;
        }
    }
}
