package deob;

@ObfuscatedName("ep")
public abstract class class149 {

    @ObfuscatedName("ep.e")
    public int field2466;

    @ObfuscatedName("ep.v")
    public int[] field2467;

    @ObfuscatedName("ep.k")
    public int[] field2469;

    @ObfuscatedName("ep.g")
    public class173 field2480;

    @ObfuscatedName("ep.q")
    public int[] field2470;

    @ObfuscatedName("ep.l")
    public int[] field2483;

    @ObfuscatedName("ep.a")
    public int[] field2476;

    @ObfuscatedName("ep.b")
    public int[][] field2473;

    @ObfuscatedName("ep.z")
    public int[][] field2474;

    @ObfuscatedName("ep.w")
    public class173[] field2475;

    @ObfuscatedName("ep.j")
    public Object[] field2468;

    @ObfuscatedName("ep.p")
    public Object[][] field2477;

    @ObfuscatedName("ep.n")
    public static class105 field2478 = new class105();

    @ObfuscatedName("ep.r")
    public int field2479;

    @ObfuscatedName("ep.s")
    public boolean field2472;

    @ObfuscatedName("ep.f")
    public boolean field2481;

    @ObfuscatedName("ep.c")
    public static int field2482 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2472 = arg0;
        this.field2481 = arg1;
    }

    @ObfuscatedName("ep.e([BI)V")
    public void method2783(byte[] arg0) {
        this.field2479 = class108.method1773(arg0, arg0.length);
        class108 var2 = new class108(method2700(arg0));
        int var3 = var2.method2122();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2127();
        }
        int var4 = var2.method2122();
        if (var3 >= 7) {
            this.field2466 = var2.method2136();
        } else {
            this.field2466 = var2.method2124();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2467 = new int[this.field2466];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2466; var7++) {
                this.field2467[var7] = var5 += var2.method2136();
                if (this.field2467[var7] > var6) {
                    var6 = this.field2467[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2466; var8++) {
                this.field2467[var8] = var5 += var2.method2124();
                if (this.field2467[var8] > var6) {
                    var6 = this.field2467[var8];
                }
            }
        }
        this.field2470 = new int[var6 + 1];
        this.field2483 = new int[var6 + 1];
        this.field2476 = new int[var6 + 1];
        this.field2473 = new int[var6 + 1][];
        this.field2468 = new Object[var6 + 1];
        this.field2477 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2469 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2466; var9++) {
                this.field2469[this.field2467[var9]] = var2.method2127();
            }
            this.field2480 = new class173(this.field2469);
        }
        for (int var10 = 0; var10 < this.field2466; var10++) {
            this.field2470[this.field2467[var10]] = var2.method2127();
        }
        for (int var11 = 0; var11 < this.field2466; var11++) {
            this.field2483[this.field2467[var11]] = var2.method2127();
        }
        for (int var12 = 0; var12 < this.field2466; var12++) {
            this.field2476[this.field2467[var12]] = var2.method2124();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2466; var13++) {
                int var14 = this.field2467[var13];
                int var15 = this.field2476[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2473[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2473[var14][var18] = var16 += var2.method2136();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2477[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2466; var20++) {
                int var21 = this.field2467[var20];
                int var22 = this.field2476[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2473[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2473[var21][var25] = var23 += var2.method2124();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2477[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2474 = new int[var6 + 1][];
        this.field2475 = new class173[var6 + 1];
        for (int var27 = 0; var27 < this.field2466; var27++) {
            int var28 = this.field2467[var27];
            int var29 = this.field2476[var28];
            this.field2474[var28] = new int[this.field2477[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2474[var28][this.field2473[var28][var30]] = var2.method2127();
            }
            this.field2475[var28] = new class173(this.field2474[var28]);
        }
    }

    @ObfuscatedName("ep.v(IB)V")
    public void method2765(int arg0) {
    }

    @ObfuscatedName("ep.k(III)[B")
    public byte[] method2721(int arg0, int arg1) {
        return this.method2781(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ep.g(II[II)[B")
    public byte[] method2781(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var4 = this.method2734(arg0, arg2);
            if (!var4) {
                this.method2746(arg0);
                boolean var5 = this.method2734(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method443(this.field2477[arg0][arg1], false);
        if (this.field2481) {
            this.field2477[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ep.q(IIB)Z")
    public boolean method2767(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return false;
        } else if (this.field2477[arg0][arg1] != null) {
            return true;
        } else if (this.field2468[arg0] == null) {
            this.method2746(arg0);
            return this.field2468[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ep.l(II)Z")
    public boolean method2723(int arg0) {
        if (this.field2468[arg0] == null) {
            this.method2746(arg0);
            return this.field2468[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ep.a(B)Z")
    public boolean method2724() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2467.length; var2++) {
            int var3 = this.field2467[var2];
            if (this.field2468[var3] == null) {
                this.method2746(var3);
                if (this.field2468[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ep.b(II)[B")
    public byte[] method2725(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2721(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2721(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ep.z(III)[B")
    public byte[] method2726(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var3 = this.method2734(arg0, (int[]) null);
            if (!var3) {
                this.method2746(arg0);
                boolean var4 = this.method2734(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method443(this.field2477[arg0][arg1], false);
    }

    @ObfuscatedName("ep.w(II)[B")
    public byte[] method2727(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2726(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2726(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ep.j(II)V")
    public void method2746(int arg0) {
    }

    @ObfuscatedName("ep.p(IS)[I")
    public int[] method2733(int arg0) {
        return this.field2473[arg0];
    }

    @ObfuscatedName("ep.n(IB)I")
    public int method2730(int arg0) {
        return this.field2477[arg0].length;
    }

    @ObfuscatedName("ep.r(I)I")
    public int method2729() {
        return this.field2477.length;
    }

    @ObfuscatedName("ep.s(II)V")
    public void method2732(int arg0) {
        for (int var2 = 0; var2 < this.field2477[arg0].length; var2++) {
            this.field2477[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ep.f(I)V")
    public void method2728() {
        for (int var1 = 0; var1 < this.field2477.length; var1++) {
            if (this.field2477[var1] != null) {
                for (int var2 = 0; var2 < this.field2477[var1].length; var2++) {
                    this.field2477[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ep.c(I[II)Z")
    public boolean method2734(int arg0, int[] arg1) {
        if (this.field2468[arg0] == null) {
            return false;
        }
        int var3 = this.field2476[arg0];
        int[] var4 = this.field2473[arg0];
        Object[] var5 = this.field2477[arg0];
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
            var8 = class114.method443(this.field2468[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2292(arg1, 5, var9.field1842.length);
        } else {
            var8 = class114.method443(this.field2468[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2700(var8);
        } catch (RuntimeException var27) {
            throw class137.method383(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class108.method1773(var8, var8.length) + "," + class108.method1773(var8, var8.length - 2) + "," + this.field2470[arg0] + "," + this.field2479);
        }
        if (this.field2472) {
            this.field2468[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class108 var15 = new class108(var10);
            int[] var16 = new int[var3];
            var15.field1841 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2127();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1841 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2127();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2481) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class114.method9(var20[var26], false);
                }
            }
        } else if (this.field2481) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method9(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ep.t(Ljava/lang/String;B)I")
    public int method2735(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2480.method3153(class211.method2812(var2));
    }

    @ObfuscatedName("ep.i(ILjava/lang/String;I)I")
    public int method2766(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2475[arg0].method3153(class211.method2812(var3));
    }

    @ObfuscatedName("ep.u(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2779(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2480.method3153(class211.method2812(var3));
        int var6 = this.field2475[var5].method3153(class211.method2812(var4));
        return this.method2721(var5, var6);
    }

    @ObfuscatedName("ep.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2738(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2480.method3153(class211.method2812(var3));
        int var6 = this.field2475[var5].method3153(class211.method2812(var4));
        return this.method2767(var5, var6);
    }

    @ObfuscatedName("ep.o(Ljava/lang/String;I)Z")
    public boolean method2739(String arg0) {
        int var2 = this.method2735("");
        return var2 == -1 ? this.method2738(arg0, "") : this.method2738("", arg0);
    }

    @ObfuscatedName("ep.m(Ljava/lang/String;I)V")
    public void method2740(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2480.method3153(class211.method2812(var2));
        if (var3 >= 0) {
            this.method2765(var3);
        }
    }

    @ObfuscatedName("ed.h([BI)[B")
    public static final byte[] method2700(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2122();
        int var3 = var1.method2127();
        if (var3 < 0 || !(field2482 == 0 || var3 <= field2482)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2189(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2127();
            if (var5 < 0 || field2482 != 0 && var5 > field2482) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2063(var6, var5, arg0, var3, 9);
            } else {
                field2478.method2061(var1, var6);
            }
            return var6;
        }
    }
}
