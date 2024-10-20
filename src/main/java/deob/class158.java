package deob;

@ObfuscatedName("ff")
public abstract class class158 {

    @ObfuscatedName("ff.q")
    public int field2519;

    @ObfuscatedName("ff.s")
    public int[] field2523;

    @ObfuscatedName("ff.h")
    public int[] field2520;

    @ObfuscatedName("ff.e")
    public class182 field2526;

    @ObfuscatedName("ff.n")
    public int[] field2522;

    @ObfuscatedName("ff.t")
    public int[] field2532;

    @ObfuscatedName("ff.l")
    public int[] field2524;

    @ObfuscatedName("ff.m")
    public int[][] field2525;

    @ObfuscatedName("ff.o")
    public int[][] field2521;

    @ObfuscatedName("ff.k")
    public class182[] field2527;

    @ObfuscatedName("ff.p")
    public Object[] field2528;

    @ObfuscatedName("ff.u")
    public Object[][] field2529;

    @ObfuscatedName("ff.g")
    public static class108 field2530 = new class108();

    @ObfuscatedName("ff.a")
    public int field2531;

    @ObfuscatedName("ff.y")
    public boolean field2518;

    @ObfuscatedName("ff.d")
    public boolean field2533;

    @ObfuscatedName("ff.b")
    public static int field2534 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2518 = arg0;
        this.field2533 = arg1;
    }

    @ObfuscatedName("ff.q([BI)V")
    public void method2796(byte[] arg0) {
        this.field2531 = class111.method1982(arg0, arg0.length);
        class111 var2 = new class111(method2586(arg0));
        int var3 = var2.method2231();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2153();
        }
        int var4 = var2.method2231();
        if (var3 >= 7) {
            this.field2519 = var2.method2258();
        } else {
            this.field2519 = var2.method2307();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2523 = new int[this.field2519];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2519; var7++) {
                this.field2523[var7] = var5 += var2.method2258();
                if (this.field2523[var7] > var6) {
                    var6 = this.field2523[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2519; var8++) {
                this.field2523[var8] = var5 += var2.method2307();
                if (this.field2523[var8] > var6) {
                    var6 = this.field2523[var8];
                }
            }
        }
        this.field2522 = new int[var6 + 1];
        this.field2532 = new int[var6 + 1];
        this.field2524 = new int[var6 + 1];
        this.field2525 = new int[var6 + 1][];
        this.field2528 = new Object[var6 + 1];
        this.field2529 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2520 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2519; var9++) {
                this.field2520[this.field2523[var9]] = var2.method2153();
            }
            this.field2526 = new class182(this.field2520);
        }
        for (int var10 = 0; var10 < this.field2519; var10++) {
            this.field2522[this.field2523[var10]] = var2.method2153();
        }
        for (int var11 = 0; var11 < this.field2519; var11++) {
            this.field2532[this.field2523[var11]] = var2.method2153();
        }
        for (int var12 = 0; var12 < this.field2519; var12++) {
            this.field2524[this.field2523[var12]] = var2.method2307();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2519; var13++) {
                int var14 = this.field2523[var13];
                int var15 = this.field2524[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2525[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2525[var14][var18] = var16 += var2.method2258();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2529[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2519; var20++) {
                int var21 = this.field2523[var20];
                int var22 = this.field2524[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2525[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2525[var21][var25] = var23 += var2.method2307();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2529[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2521 = new int[var6 + 1][];
        this.field2527 = new class182[var6 + 1];
        for (int var27 = 0; var27 < this.field2519; var27++) {
            int var28 = this.field2523[var27];
            int var29 = this.field2524[var28];
            this.field2521[var28] = new int[this.field2529[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2521[var28][this.field2525[var28][var30]] = var2.method2153();
            }
            this.field2527[var28] = new class182(this.field2521[var28]);
        }
    }

    @ObfuscatedName("ff.s(II)V")
    public void method2821(int arg0) {
    }

    @ObfuscatedName("ff.h(III)[B")
    public byte[] method2811(int arg0, int arg1) {
        return this.method2799(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ff.e(II[II)[B")
    public byte[] method2799(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2529.length || this.field2529[arg0] == null || arg1 < 0 || arg1 >= this.field2529[arg0].length) {
            return null;
        }
        if (this.field2529[arg0][arg1] == null) {
            boolean var4 = this.method2812(arg0, arg2);
            if (!var4) {
                this.method2872(arg0);
                boolean var5 = this.method2812(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method3587(this.field2529[arg0][arg1], false);
        if (this.field2533) {
            this.field2529[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ff.n(III)Z")
    public boolean method2877(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2529.length || this.field2529[arg0] == null || arg1 < 0 || arg1 >= this.field2529[arg0].length) {
            return false;
        } else if (this.field2529[arg0][arg1] != null) {
            return true;
        } else if (this.field2528[arg0] == null) {
            this.method2872(arg0);
            return this.field2528[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.t(II)Z")
    public boolean method2801(int arg0) {
        if (this.field2528[arg0] == null) {
            this.method2872(arg0);
            return this.field2528[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.l(I)Z")
    public boolean method2855() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2523.length; var2++) {
            int var3 = this.field2523[var2];
            if (this.field2528[var3] == null) {
                this.method2872(var3);
                if (this.field2528[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ff.m(II)[B")
    public byte[] method2803(int arg0) {
        if (this.field2529.length == 1) {
            return this.method2811(0, arg0);
        } else if (this.field2529[arg0].length == 1) {
            return this.method2811(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.o(III)[B")
    public byte[] method2804(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2529.length || this.field2529[arg0] == null || arg1 < 0 || arg1 >= this.field2529[arg0].length) {
            return null;
        }
        if (this.field2529[arg0][arg1] == null) {
            boolean var3 = this.method2812(arg0, (int[]) null);
            if (!var3) {
                this.method2872(arg0);
                boolean var4 = this.method2812(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method3587(this.field2529[arg0][arg1], false);
    }

    @ObfuscatedName("ff.k(II)[B")
    public byte[] method2868(int arg0) {
        if (this.field2529.length == 1) {
            return this.method2804(0, arg0);
        } else if (this.field2529[arg0].length == 1) {
            return this.method2804(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.p(II)V")
    public void method2872(int arg0) {
    }

    @ObfuscatedName("ff.u(IB)[I")
    public int[] method2807(int arg0) {
        return this.field2525[arg0];
    }

    @ObfuscatedName("ff.g(IB)I")
    public int method2808(int arg0) {
        return this.field2529[arg0].length;
    }

    @ObfuscatedName("ff.a(B)I")
    public int method2828() {
        return this.field2529.length;
    }

    @ObfuscatedName("ff.y(IB)V")
    public void method2825(int arg0) {
        for (int var2 = 0; var2 < this.field2529[arg0].length; var2++) {
            this.field2529[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ff.d(B)V")
    public void method2857() {
        for (int var1 = 0; var1 < this.field2529.length; var1++) {
            if (this.field2529[var1] != null) {
                for (int var2 = 0; var2 < this.field2529[var1].length; var2++) {
                    this.field2529[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ff.b(I[IB)Z")
    public boolean method2812(int arg0, int[] arg1) {
        if (this.field2528[arg0] == null) {
            return false;
        }
        int var3 = this.field2524[arg0];
        int[] var4 = this.field2525[arg0];
        Object[] var5 = this.field2529[arg0];
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
            var8 = class117.method3587(this.field2528[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2212(arg1, 5, var9.field1859.length);
        } else {
            var8 = class117.method3587(this.field2528[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2586(var8);
        } catch (RuntimeException var27) {
            throw class140.method92(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method1982(var8, var8.length) + "," + class111.method1982(var8, var8.length - 2) + "," + this.field2522[arg0] + "," + this.field2531);
        }
        if (this.field2518) {
            this.field2528[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1852 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2153();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1852 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2153();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2533) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method2438(var20[var26], false);
                }
            }
        } else if (this.field2533) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method2438(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ff.j(Ljava/lang/String;B)I")
    public int method2813(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2526.method3239(class154.method2702(var2));
    }

    @ObfuscatedName("ff.f(ILjava/lang/String;I)I")
    public int method2814(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2527[arg0].method3239(class154.method2702(var3));
    }

    @ObfuscatedName("ff.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2815(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2526.method3239(class154.method2702(var3));
        int var6 = this.field2527[var5].method3239(class154.method2702(var4));
        return this.method2811(var5, var6);
    }

    @ObfuscatedName("ff.z(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2862(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2526.method3239(class154.method2702(var3));
        int var6 = this.field2527[var5].method3239(class154.method2702(var4));
        return this.method2877(var5, var6);
    }

    @ObfuscatedName("ff.x(Ljava/lang/String;I)Z")
    public boolean method2817(String arg0) {
        int var2 = this.method2813("");
        return var2 == -1 ? this.method2862(arg0, "") : this.method2862("", arg0);
    }

    @ObfuscatedName("ff.v(Ljava/lang/String;I)V")
    public void method2818(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2526.method3239(class154.method2702(var2));
        if (var3 >= 0) {
            this.method2821(var3);
        }
    }

    @ObfuscatedName("ed.i([BB)[B")
    public static final byte[] method2586(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2231();
        int var3 = var1.method2153();
        if (var3 < 0 || !(field2534 == 0 || var3 <= field2534)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2159(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2153();
            if (var5 < 0 || field2534 != 0 && var5 > field2534) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2098(var6, var5, arg0, var3, 9);
            } else {
                field2530.method2096(var1, var6);
            }
            return var6;
        }
    }
}
