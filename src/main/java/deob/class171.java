package deob;

@ObfuscatedName("fp")
public abstract class class171 {

    @ObfuscatedName("fp.x")
    public int field2745;

    @ObfuscatedName("fp.r")
    public int[] field2737;

    @ObfuscatedName("fp.j")
    public int[] field2749;

    @ObfuscatedName("fp.z")
    public class196 field2733;

    @ObfuscatedName("fp.i")
    public int[] field2734;

    @ObfuscatedName("fp.b")
    public int[] field2741;

    @ObfuscatedName("fp.l")
    public int[] field2736;

    @ObfuscatedName("fp.m")
    public int[][] field2730;

    @ObfuscatedName("fp.p")
    public int[][] field2731;

    @ObfuscatedName("fp.f")
    public class196[] field2739;

    @ObfuscatedName("fp.d")
    public Object[] field2738;

    @ObfuscatedName("fp.v")
    public Object[][] field2732;

    @ObfuscatedName("fp.q")
    public static class120 field2742 = new class120();

    @ObfuscatedName("fp.t")
    public int field2743;

    @ObfuscatedName("fp.g")
    public boolean field2740;

    @ObfuscatedName("fp.s")
    public boolean field2744;

    @ObfuscatedName("fp.h")
    public static int field2746 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2740 = arg0;
        this.field2744 = arg1;
    }

    @ObfuscatedName("fp.x([BI)V")
    public void method3093(byte[] arg0) {
        this.field2743 = class123.method47(arg0, arg0.length);
        class123 var2 = new class123(method1065(arg0));
        int var3 = var2.method2408();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2413();
        }
        int var4 = var2.method2408();
        if (var3 >= 7) {
            this.field2745 = var2.method2416();
        } else {
            this.field2745 = var2.method2403();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2737 = new int[this.field2745];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2745; var7++) {
                this.field2737[var7] = var5 += var2.method2416();
                if (this.field2737[var7] > var6) {
                    var6 = this.field2737[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2745; var8++) {
                this.field2737[var8] = var5 += var2.method2403();
                if (this.field2737[var8] > var6) {
                    var6 = this.field2737[var8];
                }
            }
        }
        this.field2734 = new int[var6 + 1];
        this.field2741 = new int[var6 + 1];
        this.field2736 = new int[var6 + 1];
        this.field2730 = new int[var6 + 1][];
        this.field2738 = new Object[var6 + 1];
        this.field2732 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2749 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2745; var9++) {
                this.field2749[this.field2737[var9]] = var2.method2413();
            }
            this.field2733 = new class196(this.field2749);
        }
        for (int var10 = 0; var10 < this.field2745; var10++) {
            this.field2734[this.field2737[var10]] = var2.method2413();
        }
        for (int var11 = 0; var11 < this.field2745; var11++) {
            this.field2741[this.field2737[var11]] = var2.method2413();
        }
        for (int var12 = 0; var12 < this.field2745; var12++) {
            this.field2736[this.field2737[var12]] = var2.method2403();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2745; var13++) {
                int var14 = this.field2737[var13];
                int var15 = this.field2736[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2730[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2730[var14][var18] = var16 += var2.method2416();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2732[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2745; var20++) {
                int var21 = this.field2737[var20];
                int var22 = this.field2736[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2730[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2730[var21][var25] = var23 += var2.method2403();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2732[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2731 = new int[var6 + 1][];
        this.field2739 = new class196[var6 + 1];
        for (int var27 = 0; var27 < this.field2745; var27++) {
            int var28 = this.field2737[var27];
            int var29 = this.field2736[var28];
            this.field2731[var28] = new int[this.field2732[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2731[var28][this.field2730[var28][var30]] = var2.method2413();
            }
            this.field2739[var28] = new class196(this.field2731[var28]);
        }
    }

    @ObfuscatedName("fp.r(IB)V")
    public void method3076(int arg0) {
    }

    @ObfuscatedName("fp.j(III)[B")
    public byte[] method3079(int arg0, int arg1) {
        return this.method3080(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fp.z(II[II)[B")
    public byte[] method3080(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2732.length || this.field2732[arg0] == null || arg1 < 0 || arg1 >= this.field2732[arg0].length) {
            return null;
        }
        if (this.field2732[arg0][arg1] == null) {
            boolean var4 = this.method3092(arg0, arg2);
            if (!var4) {
                this.method3086(arg0);
                boolean var5 = this.method3092(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method559(this.field2732[arg0][arg1], false);
        if (this.field2744) {
            this.field2732[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fp.i(III)Z")
    public boolean method3081(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2732.length || this.field2732[arg0] == null || arg1 < 0 || arg1 >= this.field2732[arg0].length) {
            return false;
        } else if (this.field2732[arg0][arg1] != null) {
            return true;
        } else if (this.field2738[arg0] == null) {
            this.method3086(arg0);
            return this.field2738[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.b(II)Z")
    public boolean method3131(int arg0) {
        if (this.field2738[arg0] == null) {
            this.method3086(arg0);
            return this.field2738[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.l(I)Z")
    public boolean method3097() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2737.length; var2++) {
            int var3 = this.field2737[var2];
            if (this.field2738[var3] == null) {
                this.method3086(var3);
                if (this.field2738[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fp.m(IB)[B")
    public byte[] method3141(int arg0) {
        if (this.field2732.length == 1) {
            return this.method3079(0, arg0);
        } else if (this.field2732[arg0].length == 1) {
            return this.method3079(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.p(IIB)[B")
    public byte[] method3084(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2732.length || this.field2732[arg0] == null || arg1 < 0 || arg1 >= this.field2732[arg0].length) {
            return null;
        }
        if (this.field2732[arg0][arg1] == null) {
            boolean var3 = this.method3092(arg0, (int[]) null);
            if (!var3) {
                this.method3086(arg0);
                boolean var4 = this.method3092(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method559(this.field2732[arg0][arg1], false);
    }

    @ObfuscatedName("fp.f(II)[B")
    public byte[] method3116(int arg0) {
        if (this.field2732.length == 1) {
            return this.method3084(0, arg0);
        } else if (this.field2732[arg0].length == 1) {
            return this.method3084(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.d(II)V")
    public void method3086(int arg0) {
    }

    @ObfuscatedName("fp.v(IB)[I")
    public int[] method3078(int arg0) {
        return this.field2730[arg0];
    }

    @ObfuscatedName("fp.q(II)I")
    public int method3088(int arg0) {
        return this.field2732[arg0].length;
    }

    @ObfuscatedName("fp.t(B)I")
    public int method3089() {
        return this.field2732.length;
    }

    @ObfuscatedName("fp.g(IB)V")
    public void method3090(int arg0) {
        for (int var2 = 0; var2 < this.field2732[arg0].length; var2++) {
            this.field2732[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fp.s(I)V")
    public void method3091() {
        for (int var1 = 0; var1 < this.field2732.length; var1++) {
            if (this.field2732[var1] != null) {
                for (int var2 = 0; var2 < this.field2732[var1].length; var2++) {
                    this.field2732[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fp.h(I[II)Z")
    public boolean method3092(int arg0, int[] arg1) {
        if (this.field2738[arg0] == null) {
            return false;
        }
        int var3 = this.field2736[arg0];
        int[] var4 = this.field2730[arg0];
        Object[] var5 = this.field2732[arg0];
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
            var8 = class129.method559(this.field2738[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2428(arg1, 5, var9.field2056.length);
        } else {
            var8 = class129.method559(this.field2738[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1065(var8);
        } catch (RuntimeException var27) {
            throw Statics.method2695(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class123.method47(var8, var8.length) + "," + class123.method47(var8, var8.length - 2) + "," + this.field2734[arg0] + "," + this.field2743);
        }
        if (this.field2740) {
            this.field2738[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class123 var15 = new class123(var10);
            int[] var16 = new int[var3];
            var15.field2057 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2413();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2057 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2413();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2744) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class129.method888(var20[var26], false);
                }
            }
        } else if (this.field2744) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method888(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fp.u(Ljava/lang/String;I)I")
    public int method3148(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2733.method3528(class167.method1545(var2));
    }

    @ObfuscatedName("fp.a(ILjava/lang/String;I)I")
    public int method3094(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2739[arg0].method3528(class167.method1545(var3));
    }

    @ObfuscatedName("fp.e(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3085(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2733.method3528(class167.method1545(var3));
        int var6 = this.field2739[var5].method3528(class167.method1545(var4));
        return this.method3079(var5, var6);
    }

    @ObfuscatedName("fp.c(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3083(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2733.method3528(class167.method1545(var3));
        int var6 = this.field2739[var5].method3528(class167.method1545(var4));
        return this.method3081(var5, var6);
    }

    @ObfuscatedName("fp.n(Ljava/lang/String;I)Z")
    public boolean method3096(String arg0) {
        int var2 = this.method3148("");
        return var2 == -1 ? this.method3083(arg0, "") : this.method3083("", arg0);
    }

    @ObfuscatedName("fp.y(Ljava/lang/String;I)V")
    public void method3098(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2733.method3528(class167.method1545(var2));
        if (var3 >= 0) {
            this.method3076(var3);
        }
    }

    @ObfuscatedName("bh.k([BI)[B")
    public static final byte[] method1065(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2408();
        int var3 = var1.method2413();
        if (var3 < 0 || !(field2746 == 0 || var3 <= field2746)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2419(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2413();
            if (var5 < 0 || field2746 != 0 && var5 > field2746) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2363(var6, var5, arg0, var3, 9);
            } else {
                field2742.method2356(var1, var6);
            }
            return var6;
        }
    }
}
