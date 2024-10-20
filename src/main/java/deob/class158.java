package deob;

@ObfuscatedName("ff")
public abstract class class158 {

    @ObfuscatedName("ff.p")
    public int field2580;

    @ObfuscatedName("ff.k")
    public int[] field2572;

    @ObfuscatedName("ff.e")
    public int[] field2573;

    @ObfuscatedName("ff.f")
    public class183 field2574;

    @ObfuscatedName("ff.w")
    public int[] field2575;

    @ObfuscatedName("ff.t")
    public int[] field2582;

    @ObfuscatedName("ff.s")
    public int[] field2577;

    @ObfuscatedName("ff.c")
    public int[][] field2581;

    @ObfuscatedName("ff.d")
    public int[][] field2579;

    @ObfuscatedName("ff.v")
    public class183[] field2584;

    @ObfuscatedName("ff.m")
    public Object[] field2576;

    @ObfuscatedName("ff.h")
    public Object[][] field2571;

    @ObfuscatedName("ff.n")
    public static class108 field2583 = new class108();

    @ObfuscatedName("ff.x")
    public int field2588;

    @ObfuscatedName("ff.o")
    public boolean field2585;

    @ObfuscatedName("ff.r")
    public boolean field2586;

    @ObfuscatedName("ff.y")
    public static int field2578 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2585 = arg0;
        this.field2586 = arg1;
    }

    @ObfuscatedName("ff.p([BI)V")
    public void method2895(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class111.method939(arg0, 0, var2);
        this.field2588 = var3;
        class111 var4 = new class111(method2876(arg0));
        int var5 = var4.method2314();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2350();
        }
        int var6 = var4.method2314();
        if (var5 >= 7) {
            this.field2580 = var4.method2189();
        } else {
            this.field2580 = var4.method2177();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2572 = new int[this.field2580];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2580; var9++) {
                this.field2572[var9] = var7 += var4.method2189();
                if (this.field2572[var9] > var8) {
                    var8 = this.field2572[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2580; var10++) {
                this.field2572[var10] = var7 += var4.method2177();
                if (this.field2572[var10] > var8) {
                    var8 = this.field2572[var10];
                }
            }
        }
        this.field2575 = new int[var8 + 1];
        this.field2582 = new int[var8 + 1];
        this.field2577 = new int[var8 + 1];
        this.field2581 = new int[var8 + 1][];
        this.field2576 = new Object[var8 + 1];
        this.field2571 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2573 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2580; var11++) {
                this.field2573[this.field2572[var11]] = var4.method2350();
            }
            this.field2574 = new class183(this.field2573);
        }
        for (int var12 = 0; var12 < this.field2580; var12++) {
            this.field2575[this.field2572[var12]] = var4.method2350();
        }
        for (int var13 = 0; var13 < this.field2580; var13++) {
            this.field2582[this.field2572[var13]] = var4.method2350();
        }
        for (int var14 = 0; var14 < this.field2580; var14++) {
            this.field2577[this.field2572[var14]] = var4.method2177();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2580; var15++) {
                int var16 = this.field2572[var15];
                int var17 = this.field2577[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2581[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2581[var16][var20] = var18 += var4.method2189();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2571[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2580; var22++) {
                int var23 = this.field2572[var22];
                int var24 = this.field2577[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2581[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2581[var23][var27] = var25 += var4.method2177();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2571[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2579 = new int[var8 + 1][];
        this.field2584 = new class183[var8 + 1];
        for (int var29 = 0; var29 < this.field2580; var29++) {
            int var30 = this.field2572[var29];
            int var31 = this.field2577[var30];
            this.field2579[var30] = new int[this.field2571[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2579[var30][this.field2581[var30][var32]] = var4.method2350();
            }
            this.field2584[var30] = new class183(this.field2579[var30]);
        }
    }

    @ObfuscatedName("ff.k(II)V")
    public void method2894(int arg0) {
    }

    @ObfuscatedName("ff.e(III)[B")
    public byte[] method2896(int arg0, int arg1) {
        return this.method2972(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ff.f(II[IB)[B")
    public byte[] method2972(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2571.length || this.field2571[arg0] == null || arg1 < 0 || arg1 >= this.field2571[arg0].length) {
            return null;
        }
        if (this.field2571[arg0][arg1] == null) {
            boolean var4 = this.method2936(arg0, arg2);
            if (!var4) {
                this.method2942(arg0);
                boolean var5 = this.method2936(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method2515(this.field2571[arg0][arg1], false);
        if (this.field2586) {
            this.field2571[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ff.w(IIB)Z")
    public boolean method2898(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2571.length || this.field2571[arg0] == null || arg1 < 0 || arg1 >= this.field2571[arg0].length) {
            return false;
        } else if (this.field2571[arg0][arg1] != null) {
            return true;
        } else if (this.field2576[arg0] == null) {
            this.method2942(arg0);
            return this.field2576[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.t(IB)Z")
    public boolean method2943(int arg0) {
        if (this.field2576[arg0] == null) {
            this.method2942(arg0);
            return this.field2576[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.s(I)Z")
    public boolean method2900() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2572.length; var2++) {
            int var3 = this.field2572[var2];
            if (this.field2576[var3] == null) {
                this.method2942(var3);
                if (this.field2576[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ff.c(IB)[B")
    public byte[] method2901(int arg0) {
        if (this.field2571.length == 1) {
            return this.method2896(0, arg0);
        } else if (this.field2571[arg0].length == 1) {
            return this.method2896(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.d(III)[B")
    public byte[] method2902(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2571.length || this.field2571[arg0] == null || arg1 < 0 || arg1 >= this.field2571[arg0].length) {
            return null;
        }
        if (this.field2571[arg0][arg1] == null) {
            boolean var3 = this.method2936(arg0, (int[]) null);
            if (!var3) {
                this.method2942(arg0);
                boolean var4 = this.method2936(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method2515(this.field2571[arg0][arg1], false);
    }

    @ObfuscatedName("ff.v(II)[B")
    public byte[] method2903(int arg0) {
        if (this.field2571.length == 1) {
            return this.method2902(0, arg0);
        } else if (this.field2571[arg0].length == 1) {
            return this.method2902(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.m(II)V")
    public void method2942(int arg0) {
    }

    @ObfuscatedName("ff.h(II)[I")
    public int[] method2905(int arg0) {
        return this.field2581[arg0];
    }

    @ObfuscatedName("ff.n(IB)I")
    public int method2904(int arg0) {
        return this.field2571[arg0].length;
    }

    @ObfuscatedName("ff.x(B)I")
    public int method2907() {
        return this.field2571.length;
    }

    @ObfuscatedName("ff.o(II)V")
    public void method2968(int arg0) {
        for (int var2 = 0; var2 < this.field2571[arg0].length; var2++) {
            this.field2571[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ff.r(I)V")
    public void method2909() {
        for (int var1 = 0; var1 < this.field2571.length; var1++) {
            if (this.field2571[var1] != null) {
                for (int var2 = 0; var2 < this.field2571[var1].length; var2++) {
                    this.field2571[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ff.y(I[IB)Z")
    public boolean method2936(int arg0, int[] arg1) {
        if (this.field2576[arg0] == null) {
            return false;
        }
        int var3 = this.field2577[arg0];
        int[] var4 = this.field2581[arg0];
        Object[] var5 = this.field2571[arg0];
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
            var8 = class117.method2515(this.field2576[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2194(arg1, 5, var9.field1889.length);
        } else {
            var8 = class117.method2515(this.field2576[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2876(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class111.method939(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class111.method939(var8, 0, var17);
            throw class140.method486(var34, var16 + var18 + "," + this.field2575[arg0] + "," + this.field2588);
        }
        if (this.field2585) {
            this.field2576[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class111 var22 = new class111(var10);
            int[] var23 = new int[var3];
            var22.field1885 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2350();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1885 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2350();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2586) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class117.method630(var27[var33], false);
                }
            }
        } else if (this.field2586) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method630(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ff.i(Ljava/lang/String;I)I")
    public int method2965(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2574.method3368(class154.method2800(var2));
    }

    @ObfuscatedName("ff.q(ILjava/lang/String;I)I")
    public int method2974(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2584[arg0].method3368(class154.method2800(var3));
    }

    @ObfuscatedName("ff.g(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2945(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2574.method3368(class154.method2800(var3));
        int var6 = this.field2584[var5].method3368(class154.method2800(var4));
        return this.method2896(var5, var6);
    }

    @ObfuscatedName("ff.l(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2914(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2574.method3368(class154.method2800(var3));
        int var6 = this.field2584[var5].method3368(class154.method2800(var4));
        return this.method2898(var5, var6);
    }

    @ObfuscatedName("ff.u(Ljava/lang/String;I)Z")
    public boolean method2915(String arg0) {
        int var2 = this.method2965("");
        return var2 == -1 ? this.method2914(arg0, "") : this.method2914("", arg0);
    }

    @ObfuscatedName("ff.j(Ljava/lang/String;I)V")
    public void method2940(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2574.method3368(class154.method2800(var2));
        if (var3 >= 0) {
            this.method2894(var3);
        }
    }

    @ObfuscatedName("ex.z([BI)[B")
    public static final byte[] method2876(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2314();
        int var3 = var1.method2350();
        if (var3 < 0 || !(field2578 == 0 || var3 <= field2578)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2355(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2350();
            if (var5 < 0 || field2578 != 0 && var5 > field2578) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2126(var6, var5, arg0, var3, 9);
            } else {
                field2583.method2120(var1, var6);
            }
            return var6;
        }
    }
}
