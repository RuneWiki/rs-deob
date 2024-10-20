package deob;

@ObfuscatedName("ek")
public abstract class class142 {

    @ObfuscatedName("ek.m")
    public int field2416;

    @ObfuscatedName("ek.k")
    public int[] field2413;

    @ObfuscatedName("ek.y")
    public int[] field2402;

    @ObfuscatedName("ek.g")
    public class166 field2410;

    @ObfuscatedName("ek.r")
    public int[] field2404;

    @ObfuscatedName("ek.i")
    public int[] field2405;

    @ObfuscatedName("ek.f")
    public int[] field2406;

    @ObfuscatedName("ek.a")
    public int[][] field2403;

    @ObfuscatedName("ek.w")
    public int[][] field2408;

    @ObfuscatedName("ek.u")
    public class166[] field2409;

    @ObfuscatedName("ek.d")
    public Object[] field2401;

    @ObfuscatedName("ek.t")
    public Object[][] field2415;

    @ObfuscatedName("ek.j")
    public static class101 field2412 = new class101();

    @ObfuscatedName("ek.q")
    public int field2418;

    @ObfuscatedName("ek.p")
    public boolean field2414;

    @ObfuscatedName("ek.v")
    public boolean field2411;

    @ObfuscatedName("ek.n")
    public static int field2400 = 0;

    public class142(boolean arg0, boolean arg1) {
        this.field2414 = arg0;
        this.field2411 = arg1;
    }

    @ObfuscatedName("ek.m([BB)V")
    public void method2706(byte[] arg0) {
        this.field2418 = class104.method147(arg0, arg0.length);
        class104 var2 = new class104(method496(arg0));
        int var3 = var2.method2190();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2135();
        }
        int var4 = var2.method2190();
        if (var3 >= 7) {
            this.field2416 = var2.method2144();
        } else {
            this.field2416 = var2.method2132();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2413 = new int[this.field2416];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2416; var7++) {
                this.field2413[var7] = var5 += var2.method2144();
                if (this.field2413[var7] > var6) {
                    var6 = this.field2413[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2416; var8++) {
                this.field2413[var8] = var5 += var2.method2132();
                if (this.field2413[var8] > var6) {
                    var6 = this.field2413[var8];
                }
            }
        }
        this.field2404 = new int[var6 + 1];
        this.field2405 = new int[var6 + 1];
        this.field2406 = new int[var6 + 1];
        this.field2403 = new int[var6 + 1][];
        this.field2401 = new Object[var6 + 1];
        this.field2415 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2402 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2416; var9++) {
                this.field2402[this.field2413[var9]] = var2.method2135();
            }
            this.field2410 = new class166(this.field2402);
        }
        for (int var10 = 0; var10 < this.field2416; var10++) {
            this.field2404[this.field2413[var10]] = var2.method2135();
        }
        for (int var11 = 0; var11 < this.field2416; var11++) {
            this.field2405[this.field2413[var11]] = var2.method2135();
        }
        for (int var12 = 0; var12 < this.field2416; var12++) {
            this.field2406[this.field2413[var12]] = var2.method2132();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2416; var13++) {
                int var14 = this.field2413[var13];
                int var15 = this.field2406[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2403[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2403[var14][var18] = var16 += var2.method2144();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2415[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2416; var20++) {
                int var21 = this.field2413[var20];
                int var22 = this.field2406[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2403[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2403[var21][var25] = var23 += var2.method2132();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2415[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2408 = new int[var6 + 1][];
        this.field2409 = new class166[var6 + 1];
        for (int var27 = 0; var27 < this.field2416; var27++) {
            int var28 = this.field2413[var27];
            int var29 = this.field2406[var28];
            this.field2408[var28] = new int[this.field2415[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2408[var28][this.field2403[var28][var30]] = var2.method2135();
            }
            this.field2409[var28] = new class166(this.field2408[var28]);
        }
    }

    @ObfuscatedName("ek.k(IB)V")
    public void method2723(int arg0) {
    }

    @ObfuscatedName("ek.y(III)[B")
    public byte[] method2725(int arg0, int arg1) {
        return this.method2696(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ek.g(II[II)[B")
    public byte[] method2696(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2415.length || this.field2415[arg0] == null || arg1 < 0 || arg1 >= this.field2415[arg0].length) {
            return null;
        }
        if (this.field2415[arg0][arg1] == null) {
            boolean var4 = this.method2709(arg0, arg2);
            if (!var4) {
                this.method2768(arg0);
                boolean var5 = this.method2709(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class109.method2867(this.field2415[arg0][arg1], false);
        if (this.field2411) {
            this.field2415[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ek.r(IIB)Z")
    public boolean method2754(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2415.length || this.field2415[arg0] == null || arg1 < 0 || arg1 >= this.field2415[arg0].length) {
            return false;
        } else if (this.field2415[arg0][arg1] != null) {
            return true;
        } else if (this.field2401[arg0] == null) {
            this.method2768(arg0);
            return this.field2401[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ek.i(II)Z")
    public boolean method2698(int arg0) {
        if (this.field2401[arg0] == null) {
            this.method2768(arg0);
            return this.field2401[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ek.f(I)Z")
    public boolean method2699() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2413.length; var2++) {
            int var3 = this.field2413[var2];
            if (this.field2401[var3] == null) {
                this.method2768(var3);
                if (this.field2401[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ek.a(II)[B")
    public byte[] method2700(int arg0) {
        if (this.field2415.length == 1) {
            return this.method2725(0, arg0);
        } else if (this.field2415[arg0].length == 1) {
            return this.method2725(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.w(III)[B")
    public byte[] method2701(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2415.length || this.field2415[arg0] == null || arg1 < 0 || arg1 >= this.field2415[arg0].length) {
            return null;
        }
        if (this.field2415[arg0][arg1] == null) {
            boolean var3 = this.method2709(arg0, (int[]) null);
            if (!var3) {
                this.method2768(arg0);
                boolean var4 = this.method2709(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class109.method2867(this.field2415[arg0][arg1], false);
    }

    @ObfuscatedName("ek.u(IB)[B")
    public byte[] method2702(int arg0) {
        if (this.field2415.length == 1) {
            return this.method2701(0, arg0);
        } else if (this.field2415[arg0].length == 1) {
            return this.method2701(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.d(IB)V")
    public void method2768(int arg0) {
    }

    @ObfuscatedName("ek.t(IB)[I")
    public int[] method2704(int arg0) {
        return this.field2403[arg0];
    }

    @ObfuscatedName("ek.j(II)I")
    public int method2705(int arg0) {
        return this.field2415[arg0].length;
    }

    @ObfuscatedName("ek.q(B)I")
    public int method2736() {
        return this.field2415.length;
    }

    @ObfuscatedName("ek.p(II)V")
    public void method2707(int arg0) {
        for (int var2 = 0; var2 < this.field2415[arg0].length; var2++) {
            this.field2415[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ek.v(B)V")
    public void method2773() {
        for (int var1 = 0; var1 < this.field2415.length; var1++) {
            if (this.field2415[var1] != null) {
                for (int var2 = 0; var2 < this.field2415[var1].length; var2++) {
                    this.field2415[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ek.n(I[II)Z")
    public boolean method2709(int arg0, int[] arg1) {
        if (this.field2401[arg0] == null) {
            return false;
        }
        int var3 = this.field2406[arg0];
        int[] var4 = this.field2403[arg0];
        Object[] var5 = this.field2415[arg0];
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
            var8 = class109.method2867(this.field2401[arg0], true);
            class104 var9 = new class104(var8);
            var9.method2147(arg1, 5, var9.field1808.length);
        } else {
            var8 = class109.method2867(this.field2401[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method496(var8);
        } catch (RuntimeException var27) {
            throw class132.method2464(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class104.method147(var8, var8.length) + "," + class104.method147(var8, var8.length - 2) + "," + this.field2404[arg0] + "," + this.field2418);
        }
        if (this.field2414) {
            this.field2401[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class104 var15 = new class104(var10);
            int[] var16 = new int[var3];
            var15.field1806 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2135();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1806 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2135();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2411) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class109.method1869(var20[var26], false);
                }
            }
        } else if (this.field2411) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class109.method1869(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ek.l(Ljava/lang/String;I)I")
    public int method2757(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2410.method3126(class189.method2669(var2));
    }

    @ObfuscatedName("ek.c(ILjava/lang/String;B)I")
    public int method2715(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2409[arg0].method3126(class189.method2669(var3));
    }

    @ObfuscatedName("ek.b(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2693(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2410.method3126(class189.method2669(var3));
        int var6 = this.field2409[var5].method3126(class189.method2669(var4));
        return this.method2725(var5, var6);
    }

    @ObfuscatedName("ek.s(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2713(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2410.method3126(class189.method2669(var3));
        int var6 = this.field2409[var5].method3126(class189.method2669(var4));
        return this.method2754(var5, var6);
    }

    @ObfuscatedName("ek.o(Ljava/lang/String;I)V")
    public void method2714(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2410.method3126(class189.method2669(var2));
        if (var3 >= 0) {
            this.method2723(var3);
        }
    }

    @ObfuscatedName("b.h([BB)[B")
    public static final byte[] method496(byte[] arg0) {
        class104 var1 = new class104(arg0);
        int var2 = var1.method2190();
        int var3 = var1.method2135();
        if (var3 < 0 || !(field2400 == 0 || var3 <= field2400)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2291(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2135();
            if (var5 < 0 || field2400 != 0 && var5 > field2400) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class102.method2081(var6, var5, arg0, var3, 9);
            } else {
                field2412.method2079(var1, var6);
            }
            return var6;
        }
    }
}
