package deob;

@ObfuscatedName("eg")
public abstract class class146 {

    @ObfuscatedName("eg.j")
    public int field2472;

    @ObfuscatedName("eg.z")
    public int[] field2469;

    @ObfuscatedName("eg.y")
    public int[] field2458;

    @ObfuscatedName("eg.h")
    public class170 field2460;

    @ObfuscatedName("eg.r")
    public int[] field2462;

    @ObfuscatedName("eg.e")
    public int[] field2463;

    @ObfuscatedName("eg.k")
    public int[] field2464;

    @ObfuscatedName("eg.b")
    public int[][] field2465;

    @ObfuscatedName("eg.n")
    public int[][] field2466;

    @ObfuscatedName("eg.a")
    public class170[] field2467;

    @ObfuscatedName("eg.q")
    public Object[] field2468;

    @ObfuscatedName("eg.i")
    public Object[][] field2461;

    @ObfuscatedName("eg.f")
    public static class104 field2459 = new class104();

    @ObfuscatedName("eg.o")
    public int field2471;

    @ObfuscatedName("eg.t")
    public boolean field2470;

    @ObfuscatedName("eg.c")
    public boolean field2473;

    @ObfuscatedName("eg.d")
    public static int field2474 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2470 = arg0;
        this.field2473 = arg1;
    }

    @ObfuscatedName("eg.j([BI)V")
    public void method2737(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class107.method83(arg0, 0, var2);
        this.field2471 = var3;
        class107 var4 = new class107(method2407(arg0));
        int var5 = var4.method2130();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2135();
        }
        int var6 = var4.method2130();
        if (var5 >= 7) {
            this.field2472 = var4.method2264();
        } else {
            this.field2472 = var4.method2132();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2469 = new int[this.field2472];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2472; var9++) {
                this.field2469[var9] = var7 += var4.method2264();
                if (this.field2469[var9] > var8) {
                    var8 = this.field2469[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2472; var10++) {
                this.field2469[var10] = var7 += var4.method2132();
                if (this.field2469[var10] > var8) {
                    var8 = this.field2469[var10];
                }
            }
        }
        this.field2462 = new int[var8 + 1];
        this.field2463 = new int[var8 + 1];
        this.field2464 = new int[var8 + 1];
        this.field2465 = new int[var8 + 1][];
        this.field2468 = new Object[var8 + 1];
        this.field2461 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2458 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2472; var11++) {
                this.field2458[this.field2469[var11]] = var4.method2135();
            }
            this.field2460 = new class170(this.field2458);
        }
        for (int var12 = 0; var12 < this.field2472; var12++) {
            this.field2462[this.field2469[var12]] = var4.method2135();
        }
        for (int var13 = 0; var13 < this.field2472; var13++) {
            this.field2463[this.field2469[var13]] = var4.method2135();
        }
        for (int var14 = 0; var14 < this.field2472; var14++) {
            this.field2464[this.field2469[var14]] = var4.method2132();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2472; var15++) {
                int var16 = this.field2469[var15];
                int var17 = this.field2464[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2465[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2465[var16][var20] = var18 += var4.method2264();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2461[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2472; var22++) {
                int var23 = this.field2469[var22];
                int var24 = this.field2464[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2465[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2465[var23][var27] = var25 += var4.method2132();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2461[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2466 = new int[var8 + 1][];
        this.field2467 = new class170[var8 + 1];
        for (int var29 = 0; var29 < this.field2472; var29++) {
            int var30 = this.field2469[var29];
            int var31 = this.field2464[var30];
            this.field2466[var30] = new int[this.field2461[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2466[var30][this.field2465[var30][var32]] = var4.method2135();
            }
            this.field2467[var30] = new class170(this.field2466[var30]);
        }
    }

    @ObfuscatedName("eg.z(II)V")
    public void method2758(int arg0) {
    }

    @ObfuscatedName("eg.y(III)[B")
    public byte[] method2739(int arg0, int arg1) {
        return this.method2740(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.h(II[IB)[B")
    public byte[] method2740(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var4 = this.method2753(arg0, arg2);
            if (!var4) {
                this.method2747(arg0);
                boolean var5 = this.method2753(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method34(this.field2461[arg0][arg1], false);
        if (this.field2473) {
            this.field2461[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.r(IIB)Z")
    public boolean method2741(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return false;
        } else if (this.field2461[arg0][arg1] != null) {
            return true;
        } else if (this.field2468[arg0] == null) {
            this.method2747(arg0);
            return this.field2468[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.e(II)Z")
    public boolean method2742(int arg0) {
        if (this.field2468[arg0] == null) {
            this.method2747(arg0);
            return this.field2468[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.k(S)Z")
    public boolean method2804() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2469.length; var2++) {
            int var3 = this.field2469[var2];
            if (this.field2468[var3] == null) {
                this.method2747(var3);
                if (this.field2468[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.b(II)[B")
    public byte[] method2744(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2739(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2739(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.n(III)[B")
    public byte[] method2745(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var3 = this.method2753(arg0, (int[]) null);
            if (!var3) {
                this.method2747(arg0);
                boolean var4 = this.method2753(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method34(this.field2461[arg0][arg1], false);
    }

    @ObfuscatedName("eg.a(II)[B")
    public byte[] method2746(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2745(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2745(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.q(IB)V")
    public void method2747(int arg0) {
    }

    @ObfuscatedName("eg.i(II)[I")
    public int[] method2748(int arg0) {
        return this.field2465[arg0];
    }

    @ObfuscatedName("eg.f(II)I")
    public int method2749(int arg0) {
        return this.field2461[arg0].length;
    }

    @ObfuscatedName("eg.o(I)I")
    public int method2750() {
        return this.field2461.length;
    }

    @ObfuscatedName("eg.t(II)V")
    public void method2764(int arg0) {
        for (int var2 = 0; var2 < this.field2461[arg0].length; var2++) {
            this.field2461[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.c(I)V")
    public void method2752() {
        for (int var1 = 0; var1 < this.field2461.length; var1++) {
            if (this.field2461[var1] != null) {
                for (int var2 = 0; var2 < this.field2461[var1].length; var2++) {
                    this.field2461[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.d(I[IB)Z")
    public boolean method2753(int arg0, int[] arg1) {
        if (this.field2468[arg0] == null) {
            return false;
        }
        int var3 = this.field2464[arg0];
        int[] var4 = this.field2465[arg0];
        Object[] var5 = this.field2461[arg0];
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
            var8 = class112.method34(this.field2468[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2147(arg1, 5, var9.field1849.length);
        } else {
            var8 = class112.method34(this.field2468[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2407(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class107.method83(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class107.method83(var8, 0, var17);
            throw class135.method1603(var34, var16 + var18 + "," + this.field2462[arg0] + "," + this.field2471);
        }
        if (this.field2470) {
            this.field2468[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class107 var22 = new class107(var10);
            int[] var23 = new int[var3];
            var22.field1847 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2135();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1847 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2135();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2473) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class112.method2514(var27[var33], false);
                }
            }
        } else if (this.field2473) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method2514(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.g(Ljava/lang/String;I)I")
    public int method2771(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2460.method3167(class197.method469(var2));
    }

    @ObfuscatedName("eg.s(ILjava/lang/String;I)I")
    public int method2755(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2467[arg0].method3167(class197.method469(var3));
    }

    @ObfuscatedName("eg.m(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2756(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2460.method3167(class197.method469(var3));
        int var6 = this.field2467[var5].method3167(class197.method469(var4));
        return this.method2739(var5, var6);
    }

    @ObfuscatedName("eg.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2762(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2460.method3167(class197.method469(var3));
        int var6 = this.field2467[var5].method3167(class197.method469(var4));
        return this.method2741(var5, var6);
    }

    @ObfuscatedName("eg.u(Ljava/lang/String;B)Z")
    public boolean method2817(String arg0) {
        int var2 = this.method2771("");
        return var2 == -1 ? this.method2762(arg0, "") : this.method2762("", arg0);
    }

    @ObfuscatedName("eg.p(Ljava/lang/String;I)V")
    public void method2759(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2460.method3167(class197.method469(var2));
        if (var3 >= 0) {
            this.method2758(var3);
        }
    }

    @ObfuscatedName("dq.l([BI)[B")
    public static final byte[] method2407(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2130();
        int var3 = var1.method2135();
        if (var3 < 0 || !(field2474 == 0 || var3 <= field2474)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2141(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2135();
            if (var5 < 0 || field2474 != 0 && var5 > field2474) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2081(var6, var5, arg0, var3, 9);
            } else {
                field2459.method2072(var1, var6);
            }
            return var6;
        }
    }
}
