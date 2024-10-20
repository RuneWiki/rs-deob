package deob;

@ObfuscatedName("gl")
public abstract class class183 {

    @ObfuscatedName("gl.o")
    public int field2728;

    @ObfuscatedName("gl.m")
    public int[] field2717;

    @ObfuscatedName("gl.b")
    public int[] field2718;

    @ObfuscatedName("gl.g")
    public class123 field2732;

    @ObfuscatedName("gl.h")
    public int[] field2720;

    @ObfuscatedName("gl.v")
    public int[] field2716;

    @ObfuscatedName("gl.l")
    public int[] field2722;

    @ObfuscatedName("gl.c")
    public int[][] field2730;

    @ObfuscatedName("gl.u")
    public int[][] field2724;

    @ObfuscatedName("gl.k")
    public class123[] field2725;

    @ObfuscatedName("gl.z")
    public Object[] field2719;

    @ObfuscatedName("gl.y")
    public Object[][] field2727;

    @ObfuscatedName("gl.j")
    public static class147 field2731 = new class147();

    @ObfuscatedName("gl.f")
    public int field2729;

    @ObfuscatedName("gl.p")
    public boolean field2726;

    @ObfuscatedName("gl.i")
    public boolean field2723;

    @ObfuscatedName("gl.s")
    public static int field2721 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2726 = arg0;
        this.field2723 = arg1;
    }

    @ObfuscatedName("gl.o([BI)V")
    public void method3010(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class154.method1587(arg0, 0, var2);
        this.field2729 = var3;
        class154 var4 = new class154(method89(arg0));
        int var5 = var4.method2552();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2557();
        }
        int var6 = var4.method2552();
        if (var5 >= 7) {
            this.field2728 = var4.method2547();
        } else {
            this.field2728 = var4.method2554();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2717 = new int[this.field2728];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2728; var9++) {
                this.field2717[var9] = var7 += var4.method2547();
                if (this.field2717[var9] > var8) {
                    var8 = this.field2717[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2728; var10++) {
                this.field2717[var10] = var7 += var4.method2554();
                if (this.field2717[var10] > var8) {
                    var8 = this.field2717[var10];
                }
            }
        }
        this.field2720 = new int[var8 + 1];
        this.field2716 = new int[var8 + 1];
        this.field2722 = new int[var8 + 1];
        this.field2730 = new int[var8 + 1][];
        this.field2719 = new Object[var8 + 1];
        this.field2727 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2718 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2728; var11++) {
                this.field2718[this.field2717[var11]] = var4.method2557();
            }
            this.field2732 = new class123(this.field2718);
        }
        for (int var12 = 0; var12 < this.field2728; var12++) {
            this.field2720[this.field2717[var12]] = var4.method2557();
        }
        for (int var13 = 0; var13 < this.field2728; var13++) {
            this.field2716[this.field2717[var13]] = var4.method2557();
        }
        for (int var14 = 0; var14 < this.field2728; var14++) {
            this.field2722[this.field2717[var14]] = var4.method2554();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2728; var15++) {
                int var16 = this.field2717[var15];
                int var17 = this.field2722[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2730[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2730[var16][var20] = var18 += var4.method2547();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2727[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2728; var22++) {
                int var23 = this.field2717[var22];
                int var24 = this.field2722[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2730[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2730[var23][var27] = var25 += var4.method2554();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2727[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2724 = new int[var8 + 1][];
        this.field2725 = new class123[var8 + 1];
        for (int var29 = 0; var29 < this.field2728; var29++) {
            int var30 = this.field2717[var29];
            int var31 = this.field2722[var30];
            this.field2724[var30] = new int[this.field2727[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2724[var30][this.field2730[var30][var32]] = var4.method2557();
            }
            this.field2725[var30] = new class123(this.field2724[var30]);
        }
    }

    @ObfuscatedName("gl.m(II)V")
    public void method3009(int arg0) {
    }

    @ObfuscatedName("gl.b(IIB)[B")
    public byte[] method3012(int arg0, int arg1) {
        return this.method3088(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gl.g(II[II)[B")
    public byte[] method3088(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return null;
        }
        if (this.field2727[arg0][arg1] == null) {
            boolean var4 = this.method3026(arg0, arg2);
            if (!var4) {
                this.method3065(arg0);
                boolean var5 = this.method3026(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method74(this.field2727[arg0][arg1], false);
        if (this.field2723) {
            this.field2727[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gl.l(III)Z")
    public boolean method3014(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return false;
        } else if (this.field2727[arg0][arg1] != null) {
            return true;
        } else if (this.field2719[arg0] == null) {
            this.method3065(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gl.c(II)Z")
    public boolean method3015(int arg0) {
        if (this.field2719[arg0] == null) {
            this.method3065(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gl.u(I)Z")
    public boolean method3016() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2717.length; var2++) {
            int var3 = this.field2717[var2];
            if (this.field2719[var3] == null) {
                this.method3065(var3);
                if (this.field2719[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gl.k(II)[B")
    public byte[] method3017(int arg0) {
        if (this.field2727.length == 1) {
            return this.method3012(0, arg0);
        } else if (this.field2727[arg0].length == 1) {
            return this.method3012(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gl.z(IIS)[B")
    public byte[] method3018(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2727.length || this.field2727[arg0] == null || arg1 < 0 || arg1 >= this.field2727[arg0].length) {
            return null;
        }
        if (this.field2727[arg0][arg1] == null) {
            boolean var3 = this.method3026(arg0, (int[]) null);
            if (!var3) {
                this.method3065(arg0);
                boolean var4 = this.method3026(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method74(this.field2727[arg0][arg1], false);
    }

    @ObfuscatedName("gl.y(II)[B")
    public byte[] method3090(int arg0) {
        if (this.field2727.length == 1) {
            return this.method3018(0, arg0);
        } else if (this.field2727[arg0].length == 1) {
            return this.method3018(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gl.j(II)V")
    public void method3065(int arg0) {
    }

    @ObfuscatedName("gl.f(IB)[I")
    public int[] method3021(int arg0) {
        return this.field2730[arg0];
    }

    @ObfuscatedName("gl.p(IB)I")
    public int method3054(int arg0) {
        return this.field2727[arg0].length;
    }

    @ObfuscatedName("gl.i(B)I")
    public int method3063() {
        return this.field2727.length;
    }

    @ObfuscatedName("gl.s(IB)V")
    public void method3024(int arg0) {
        for (int var2 = 0; var2 < this.field2727[arg0].length; var2++) {
            this.field2727[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gl.x(I)V")
    public void method3061() {
        for (int var1 = 0; var1 < this.field2727.length; var1++) {
            if (this.field2727[var1] != null) {
                for (int var2 = 0; var2 < this.field2727[var1].length; var2++) {
                    this.field2727[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gl.d(I[IS)Z")
    public boolean method3026(int arg0, int[] arg1) {
        if (this.field2719[arg0] == null) {
            return false;
        }
        int var3 = this.field2722[arg0];
        int[] var4 = this.field2730[arg0];
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
            var8 = class157.method74(this.field2719[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2572(arg1, 5, var9.field2108.length);
        } else {
            var8 = class157.method74(this.field2719[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method89(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class154.method1587(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class154.method1587(var8, 0, var18);
            throw class102.method1007(var35, var17 + var19 + "," + this.field2720[arg0] + "," + this.field2729);
        }
        if (this.field2726) {
            this.field2719[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class154 var23 = new class154(var10);
            int[] var24 = new int[var3];
            var23.field2105 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2557();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2105 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2557();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2723) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class157.method3001(var28[var34], false);
                }
            }
        } else if (this.field2723) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method3001(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gl.w(Ljava/lang/String;I)I")
    public int method3027(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2732.method2121(class208.method2455(var2));
    }

    @ObfuscatedName("gl.n(ILjava/lang/String;B)I")
    public int method3028(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2725[arg0].method2121(class208.method2455(var3));
    }

    @ObfuscatedName("gl.q(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3029(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2732.method2121(class208.method2455(var3));
        int var6 = this.field2725[var5].method2121(class208.method2455(var4));
        return this.method3012(var5, var6);
    }

    @ObfuscatedName("gl.t(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3030(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2732.method2121(class208.method2455(var3));
        int var6 = this.field2725[var5].method2121(class208.method2455(var4));
        return this.method3014(var5, var6);
    }

    @ObfuscatedName("gl.r(Ljava/lang/String;I)Z")
    public boolean method3031(String arg0) {
        int var2 = this.method3027("");
        return var2 == -1 ? this.method3030(arg0, "") : this.method3030("", arg0);
    }

    @ObfuscatedName("gl.a(Ljava/lang/String;I)V")
    public void method3032(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2732.method2121(class208.method2455(var2));
        if (var3 >= 0) {
            this.method3009(var3);
        }
    }

    @ObfuscatedName("c.e([BI)[B")
    public static final byte[] method89(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2552();
        int var3 = var1.method2557();
        if (var3 < 0 || !(field2721 == 0 || var3 <= field2721)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2622(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2557();
            if (var5 < 0 || field2721 != 0 && var5 > field2721) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2499(var6, var5, arg0, var3, 9);
            } else {
                field2731.method2494(var1, var6);
            }
            return var6;
        }
    }
}
