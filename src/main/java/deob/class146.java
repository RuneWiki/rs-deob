package deob;

@ObfuscatedName("ee")
public abstract class class146 {

    @ObfuscatedName("ee.k")
    public int field2465;

    @ObfuscatedName("ee.r")
    public int[] field2447;

    @ObfuscatedName("ee.y")
    public int[] field2449;

    @ObfuscatedName("ee.w")
    public class170 field2450;

    @ObfuscatedName("ee.m")
    public int[] field2451;

    @ObfuscatedName("ee.j")
    public int[] field2452;

    @ObfuscatedName("ee.g")
    public int[] field2453;

    @ObfuscatedName("ee.p")
    public int[][] field2462;

    @ObfuscatedName("ee.o")
    public int[][] field2455;

    @ObfuscatedName("ee.b")
    public class170[] field2456;

    @ObfuscatedName("ee.x")
    public Object[] field2457;

    @ObfuscatedName("ee.n")
    public Object[][] field2458;

    @ObfuscatedName("ee.d")
    public static class104 field2459 = new class104();

    @ObfuscatedName("ee.s")
    public int field2448;

    @ObfuscatedName("ee.v")
    public boolean field2461;

    @ObfuscatedName("ee.t")
    public boolean field2454;

    @ObfuscatedName("ee.u")
    public static int field2460 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2461 = arg0;
        this.field2454 = arg1;
    }

    @ObfuscatedName("ee.k([BI)V")
    public void method2677(byte[] arg0) {
        this.field2448 = Statics.method2821(arg0, arg0.length);
        class107 var2 = new class107(method2657(arg0));
        int var3 = var2.method2111();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2116();
        }
        int var4 = var2.method2111();
        if (var3 >= 7) {
            this.field2465 = var2.method2251();
        } else {
            this.field2465 = var2.method2232();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2447 = new int[this.field2465];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2465; var7++) {
                this.field2447[var7] = var5 += var2.method2251();
                if (this.field2447[var7] > var6) {
                    var6 = this.field2447[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2465; var8++) {
                this.field2447[var8] = var5 += var2.method2232();
                if (this.field2447[var8] > var6) {
                    var6 = this.field2447[var8];
                }
            }
        }
        this.field2451 = new int[var6 + 1];
        this.field2452 = new int[var6 + 1];
        this.field2453 = new int[var6 + 1];
        this.field2462 = new int[var6 + 1][];
        this.field2457 = new Object[var6 + 1];
        this.field2458 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2449 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2465; var9++) {
                this.field2449[this.field2447[var9]] = var2.method2116();
            }
            this.field2450 = new class170(this.field2449);
        }
        for (int var10 = 0; var10 < this.field2465; var10++) {
            this.field2451[this.field2447[var10]] = var2.method2116();
        }
        for (int var11 = 0; var11 < this.field2465; var11++) {
            this.field2452[this.field2447[var11]] = var2.method2116();
        }
        for (int var12 = 0; var12 < this.field2465; var12++) {
            this.field2453[this.field2447[var12]] = var2.method2232();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2465; var13++) {
                int var14 = this.field2447[var13];
                int var15 = this.field2453[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2462[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2462[var14][var18] = var16 += var2.method2251();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2458[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2465; var20++) {
                int var21 = this.field2447[var20];
                int var22 = this.field2453[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2462[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2462[var21][var25] = var23 += var2.method2232();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2458[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2455 = new int[var6 + 1][];
        this.field2456 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2465; var27++) {
            int var28 = this.field2447[var27];
            int var29 = this.field2453[var28];
            this.field2455[var28] = new int[this.field2458[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2455[var28][this.field2462[var28][var30]] = var2.method2116();
            }
            this.field2456[var28] = new class170(this.field2455[var28]);
        }
    }

    @ObfuscatedName("ee.r(II)V")
    public void method2678(int arg0) {
    }

    @ObfuscatedName("ee.y(IIS)[B")
    public byte[] method2749(int arg0, int arg1) {
        return this.method2680(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ee.w(II[II)[B")
    public byte[] method2680(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2458.length || this.field2458[arg0] == null || arg1 < 0 || arg1 >= this.field2458[arg0].length) {
            return null;
        }
        if (this.field2458[arg0][arg1] == null) {
            boolean var4 = this.method2709(arg0, arg2);
            if (!var4) {
                this.method2686(arg0);
                boolean var5 = this.method2709(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method109(this.field2458[arg0][arg1], false);
        if (this.field2454) {
            this.field2458[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ee.m(III)Z")
    public boolean method2727(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2458.length || this.field2458[arg0] == null || arg1 < 0 || arg1 >= this.field2458[arg0].length) {
            return false;
        } else if (this.field2458[arg0][arg1] != null) {
            return true;
        } else if (this.field2457[arg0] == null) {
            this.method2686(arg0);
            return this.field2457[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ee.j(IB)Z")
    public boolean method2682(int arg0) {
        if (this.field2457[arg0] == null) {
            this.method2686(arg0);
            return this.field2457[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ee.g(B)Z")
    public boolean method2681() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2447.length; var2++) {
            int var3 = this.field2447[var2];
            if (this.field2457[var3] == null) {
                this.method2686(var3);
                if (this.field2457[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ee.p(II)[B")
    public byte[] method2683(int arg0) {
        if (this.field2458.length == 1) {
            return this.method2749(0, arg0);
        } else if (this.field2458[arg0].length == 1) {
            return this.method2749(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ee.o(III)[B")
    public byte[] method2696(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2458.length || this.field2458[arg0] == null || arg1 < 0 || arg1 >= this.field2458[arg0].length) {
            return null;
        }
        if (this.field2458[arg0][arg1] == null) {
            boolean var3 = this.method2709(arg0, (int[]) null);
            if (!var3) {
                this.method2686(arg0);
                boolean var4 = this.method2709(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method109(this.field2458[arg0][arg1], false);
    }

    @ObfuscatedName("ee.b(II)[B")
    public byte[] method2685(int arg0) {
        if (this.field2458.length == 1) {
            return this.method2696(0, arg0);
        } else if (this.field2458[arg0].length == 1) {
            return this.method2696(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ee.x(II)V")
    public void method2686(int arg0) {
    }

    @ObfuscatedName("ee.n(II)[I")
    public int[] method2687(int arg0) {
        return this.field2462[arg0];
    }

    @ObfuscatedName("ee.d(II)I")
    public int method2688(int arg0) {
        return this.field2458[arg0].length;
    }

    @ObfuscatedName("ee.s(I)I")
    public int method2735() {
        return this.field2458.length;
    }

    @ObfuscatedName("ee.v(II)V")
    public void method2690(int arg0) {
        for (int var2 = 0; var2 < this.field2458[arg0].length; var2++) {
            this.field2458[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ee.t(B)V")
    public void method2691() {
        for (int var1 = 0; var1 < this.field2458.length; var1++) {
            if (this.field2458[var1] != null) {
                for (int var2 = 0; var2 < this.field2458[var1].length; var2++) {
                    this.field2458[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ee.u(I[II)Z")
    public boolean method2709(int arg0, int[] arg1) {
        if (this.field2457[arg0] == null) {
            return false;
        }
        int var3 = this.field2453[arg0];
        int[] var4 = this.field2462[arg0];
        Object[] var5 = this.field2458[arg0];
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
            var8 = class112.method109(this.field2457[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2128(arg1, 5, var9.field1865.length);
        } else {
            var8 = class112.method109(this.field2457[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2657(var8);
        } catch (RuntimeException var27) {
            throw class135.method810(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method2821(var8, var8.length) + "," + Statics.method2821(var8, var8.length - 2) + "," + this.field2451[arg0] + "," + this.field2448);
        }
        if (this.field2461) {
            this.field2457[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1863 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2116();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1863 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2116();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2454) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method1867(var20[var26], false);
                }
            }
        } else if (this.field2454) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1867(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ee.l(Ljava/lang/String;B)I")
    public int method2738(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2450.method3131(class199.method1964(var2));
    }

    @ObfuscatedName("ee.i(ILjava/lang/String;B)I")
    public int method2694(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2456[arg0].method3131(class199.method1964(var3));
    }

    @ObfuscatedName("ee.h(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2695(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2450.method3131(class199.method1964(var3));
        int var6 = this.field2456[var5].method3131(class199.method1964(var4));
        return this.method2749(var5, var6);
    }

    @ObfuscatedName("ee.e(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2750(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2450.method3131(class199.method1964(var3));
        int var6 = this.field2456[var5].method3131(class199.method1964(var4));
        return this.method2727(var5, var6);
    }

    @ObfuscatedName("ee.a(Ljava/lang/String;I)Z")
    public boolean method2697(String arg0) {
        int var2 = this.method2738("");
        return var2 == -1 ? this.method2750(arg0, "") : this.method2750("", arg0);
    }

    @ObfuscatedName("ee.c(Ljava/lang/String;I)V")
    public void method2714(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2450.method3131(class199.method1964(var2));
        if (var3 >= 0) {
            this.method2678(var3);
        }
    }

    @ObfuscatedName("eu.f([BI)[B")
    public static final byte[] method2657(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2111();
        int var3 = var1.method2116();
        if (var3 < 0 || !(field2460 == 0 || var3 <= field2460)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2122(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2116();
            if (var5 < 0 || field2460 != 0 && var5 > field2460) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2065(var6, var5, arg0, var3, 9);
            } else {
                field2459.method2062(var1, var6);
            }
            return var6;
        }
    }
}
