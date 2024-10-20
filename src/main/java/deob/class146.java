package deob;

@ObfuscatedName("eg")
public abstract class class146 {

    @ObfuscatedName("eg.b")
    public int field2448;

    @ObfuscatedName("eg.u")
    public int[] field2446;

    @ObfuscatedName("eg.x")
    public int[] field2447;

    @ObfuscatedName("eg.j")
    public class170 field2453;

    @ObfuscatedName("eg.o")
    public int[] field2449;

    @ObfuscatedName("eg.n")
    public int[] field2452;

    @ObfuscatedName("eg.y")
    public int[] field2461;

    @ObfuscatedName("eg.f")
    public int[][] field2455;

    @ObfuscatedName("eg.p")
    public int[][] field2460;

    @ObfuscatedName("eg.l")
    public class170[] field2454;

    @ObfuscatedName("eg.k")
    public Object[] field2451;

    @ObfuscatedName("eg.q")
    public Object[][] field2456;

    @ObfuscatedName("eg.e")
    public static class104 field2457 = new class104();

    @ObfuscatedName("eg.t")
    public int field2458;

    @ObfuscatedName("eg.g")
    public boolean field2459;

    @ObfuscatedName("eg.c")
    public boolean field2450;

    @ObfuscatedName("eg.m")
    public static int field2445 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2459 = arg0;
        this.field2450 = arg1;
    }

    @ObfuscatedName("eg.b([BB)V")
    public void method2706(byte[] arg0) {
        this.field2458 = class107.method2067(arg0, arg0.length);
        class107 var2 = new class107(method2672(arg0));
        int var3 = var2.method2134();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2139();
        }
        int var4 = var2.method2134();
        if (var3 >= 7) {
            this.field2448 = var2.method2148();
        } else {
            this.field2448 = var2.method2136();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2446 = new int[this.field2448];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2448; var7++) {
                this.field2446[var7] = var5 += var2.method2148();
                if (this.field2446[var7] > var6) {
                    var6 = this.field2446[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2448; var8++) {
                this.field2446[var8] = var5 += var2.method2136();
                if (this.field2446[var8] > var6) {
                    var6 = this.field2446[var8];
                }
            }
        }
        this.field2449 = new int[var6 + 1];
        this.field2452 = new int[var6 + 1];
        this.field2461 = new int[var6 + 1];
        this.field2455 = new int[var6 + 1][];
        this.field2451 = new Object[var6 + 1];
        this.field2456 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2447 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2448; var9++) {
                this.field2447[this.field2446[var9]] = var2.method2139();
            }
            this.field2453 = new class170(this.field2447);
        }
        for (int var10 = 0; var10 < this.field2448; var10++) {
            this.field2449[this.field2446[var10]] = var2.method2139();
        }
        for (int var11 = 0; var11 < this.field2448; var11++) {
            this.field2452[this.field2446[var11]] = var2.method2139();
        }
        for (int var12 = 0; var12 < this.field2448; var12++) {
            this.field2461[this.field2446[var12]] = var2.method2136();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2448; var13++) {
                int var14 = this.field2446[var13];
                int var15 = this.field2461[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2455[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2455[var14][var18] = var16 += var2.method2148();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2456[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2448; var20++) {
                int var21 = this.field2446[var20];
                int var22 = this.field2461[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2455[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2455[var21][var25] = var23 += var2.method2136();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2456[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2460 = new int[var6 + 1][];
        this.field2454 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2448; var27++) {
            int var28 = this.field2446[var27];
            int var29 = this.field2461[var28];
            this.field2460[var28] = new int[this.field2456[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2460[var28][this.field2455[var28][var30]] = var2.method2139();
            }
            this.field2454[var28] = new class170(this.field2460[var28]);
        }
    }

    @ObfuscatedName("eg.u(II)V")
    public void method2750(int arg0) {
    }

    @ObfuscatedName("eg.x(IIB)[B")
    public byte[] method2692(int arg0, int arg1) {
        return this.method2693(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.j(II[II)[B")
    public byte[] method2693(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return null;
        }
        if (this.field2456[arg0][arg1] == null) {
            boolean var4 = this.method2743(arg0, arg2);
            if (!var4) {
                this.method2700(arg0);
                boolean var5 = this.method2743(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method893(this.field2456[arg0][arg1], false);
        if (this.field2450) {
            this.field2456[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.o(III)Z")
    public boolean method2694(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return false;
        } else if (this.field2456[arg0][arg1] != null) {
            return true;
        } else if (this.field2451[arg0] == null) {
            this.method2700(arg0);
            return this.field2451[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.n(II)Z")
    public boolean method2695(int arg0) {
        if (this.field2451[arg0] == null) {
            this.method2700(arg0);
            return this.field2451[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.y(B)Z")
    public boolean method2753() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2446.length; var2++) {
            int var3 = this.field2446[var2];
            if (this.field2451[var3] == null) {
                this.method2700(var3);
                if (this.field2451[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.f(IB)[B")
    public byte[] method2697(int arg0) {
        if (this.field2456.length == 1) {
            return this.method2692(0, arg0);
        } else if (this.field2456[arg0].length == 1) {
            return this.method2692(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.p(III)[B")
    public byte[] method2733(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2456.length || this.field2456[arg0] == null || arg1 < 0 || arg1 >= this.field2456[arg0].length) {
            return null;
        }
        if (this.field2456[arg0][arg1] == null) {
            boolean var3 = this.method2743(arg0, (int[]) null);
            if (!var3) {
                this.method2700(arg0);
                boolean var4 = this.method2743(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method893(this.field2456[arg0][arg1], false);
    }

    @ObfuscatedName("eg.l(II)[B")
    public byte[] method2699(int arg0) {
        if (this.field2456.length == 1) {
            return this.method2733(0, arg0);
        } else if (this.field2456[arg0].length == 1) {
            return this.method2733(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.k(II)V")
    public void method2700(int arg0) {
    }

    @ObfuscatedName("eg.q(II)[I")
    public int[] method2701(int arg0) {
        return this.field2455[arg0];
    }

    @ObfuscatedName("eg.e(II)I")
    public int method2702(int arg0) {
        return this.field2456[arg0].length;
    }

    @ObfuscatedName("eg.t(B)I")
    public int method2703() {
        return this.field2456.length;
    }

    @ObfuscatedName("eg.g(II)V")
    public void method2722(int arg0) {
        for (int var2 = 0; var2 < this.field2456[arg0].length; var2++) {
            this.field2456[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.c(B)V")
    public void method2742() {
        for (int var1 = 0; var1 < this.field2456.length; var1++) {
            if (this.field2456[var1] != null) {
                for (int var2 = 0; var2 < this.field2456[var1].length; var2++) {
                    this.field2456[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.m(I[IB)Z")
    public boolean method2743(int arg0, int[] arg1) {
        if (this.field2451[arg0] == null) {
            return false;
        }
        int var3 = this.field2461[arg0];
        int[] var4 = this.field2455[arg0];
        Object[] var5 = this.field2456[arg0];
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
            var8 = class112.method893(this.field2451[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2150(arg1, 5, var9.field1844.length);
        } else {
            var8 = class112.method893(this.field2451[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2672(var8);
        } catch (RuntimeException var27) {
            throw class135.method483(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method2067(var8, var8.length) + "," + class107.method2067(var8, var8.length - 2) + "," + this.field2449[arg0] + "," + this.field2458);
        }
        if (this.field2459) {
            this.field2451[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1845 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2139();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1845 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2139();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2450) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method766(var20[var26], false);
                }
            }
        } else if (this.field2450) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method766(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.i(Ljava/lang/String;B)I")
    public int method2719(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2453.method3110(class197.method809(var2));
    }

    @ObfuscatedName("eg.h(ILjava/lang/String;I)I")
    public int method2708(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2454[arg0].method3110(class197.method809(var3));
    }

    @ObfuscatedName("eg.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2709(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2453.method3110(class197.method809(var3));
        int var6 = this.field2454[var5].method3110(class197.method809(var4));
        return this.method2692(var5, var6);
    }

    @ObfuscatedName("eg.w(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2710(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2453.method3110(class197.method809(var3));
        int var6 = this.field2454[var5].method3110(class197.method809(var4));
        return this.method2694(var5, var6);
    }

    @ObfuscatedName("eg.z(Ljava/lang/String;I)Z")
    public boolean method2749(String arg0) {
        int var2 = this.method2719("");
        return var2 == -1 ? this.method2710(arg0, "") : this.method2710("", arg0);
    }

    @ObfuscatedName("eg.v(Ljava/lang/String;B)V")
    public void method2712(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2453.method3110(class197.method809(var2));
        if (var3 >= 0) {
            this.method2750(var3);
        }
    }

    @ObfuscatedName("ea.s([BI)[B")
    public static final byte[] method2672(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2134();
        int var3 = var1.method2139();
        if (var3 < 0 || !(field2445 == 0 || var3 <= field2445)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2145(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2139();
            if (var5 < 0 || field2445 != 0 && var5 > field2445) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2084(var6, var5, arg0, var3, 9);
            } else {
                field2457.method2076(var1, var6);
            }
            return var6;
        }
    }
}
