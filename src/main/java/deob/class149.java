package deob;

@ObfuscatedName("er")
public abstract class class149 {

    @ObfuscatedName("er.c")
    public int field2460;

    @ObfuscatedName("er.j")
    public int[] field2452;

    @ObfuscatedName("er.y")
    public int[] field2466;

    @ObfuscatedName("er.r")
    public class173 field2454;

    @ObfuscatedName("er.f")
    public int[] field2455;

    @ObfuscatedName("er.l")
    public int[] field2456;

    @ObfuscatedName("er.b")
    public int[] field2457;

    @ObfuscatedName("er.k")
    public int[][] field2464;

    @ObfuscatedName("er.g")
    public int[][] field2468;

    @ObfuscatedName("er.v")
    public class173[] field2451;

    @ObfuscatedName("er.i")
    public Object[] field2461;

    @ObfuscatedName("er.x")
    public Object[][] field2462;

    @ObfuscatedName("er.h")
    public static class105 field2458 = new class105();

    @ObfuscatedName("er.w")
    public int field2463;

    @ObfuscatedName("er.s")
    public boolean field2465;

    @ObfuscatedName("er.p")
    public boolean field2459;

    @ObfuscatedName("er.z")
    public static int field2467 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2465 = arg0;
        this.field2459 = arg1;
    }

    @ObfuscatedName("er.c([BI)V")
    public void method2815(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class108.method532(arg0, 0, var2);
        this.field2463 = var3;
        class108 var4 = new class108(method1414(arg0));
        int var5 = var4.method2134();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2144();
        }
        int var6 = var4.method2134();
        if (var5 >= 7) {
            this.field2460 = var4.method2323();
        } else {
            this.field2460 = var4.method2136();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2452 = new int[this.field2460];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2460; var9++) {
                this.field2452[var9] = var7 += var4.method2323();
                if (this.field2452[var9] > var8) {
                    var8 = this.field2452[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2460; var10++) {
                this.field2452[var10] = var7 += var4.method2136();
                if (this.field2452[var10] > var8) {
                    var8 = this.field2452[var10];
                }
            }
        }
        this.field2455 = new int[var8 + 1];
        this.field2456 = new int[var8 + 1];
        this.field2457 = new int[var8 + 1];
        this.field2464 = new int[var8 + 1][];
        this.field2461 = new Object[var8 + 1];
        this.field2462 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2466 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2460; var11++) {
                this.field2466[this.field2452[var11]] = var4.method2144();
            }
            this.field2454 = new class173(this.field2466);
        }
        for (int var12 = 0; var12 < this.field2460; var12++) {
            this.field2455[this.field2452[var12]] = var4.method2144();
        }
        for (int var13 = 0; var13 < this.field2460; var13++) {
            this.field2456[this.field2452[var13]] = var4.method2144();
        }
        for (int var14 = 0; var14 < this.field2460; var14++) {
            this.field2457[this.field2452[var14]] = var4.method2136();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2460; var15++) {
                int var16 = this.field2452[var15];
                int var17 = this.field2457[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2464[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2464[var16][var20] = var18 += var4.method2323();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2462[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2460; var22++) {
                int var23 = this.field2452[var22];
                int var24 = this.field2457[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2464[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2464[var23][var27] = var25 += var4.method2136();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2462[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2468 = new int[var8 + 1][];
        this.field2451 = new class173[var8 + 1];
        for (int var29 = 0; var29 < this.field2460; var29++) {
            int var30 = this.field2452[var29];
            int var31 = this.field2457[var30];
            this.field2468[var30] = new int[this.field2462[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2468[var30][this.field2464[var30][var32]] = var4.method2144();
            }
            this.field2451[var30] = new class173(this.field2468[var30]);
        }
    }

    @ObfuscatedName("er.j(IB)V")
    public void method2745(int arg0) {
    }

    @ObfuscatedName("er.y(III)[B")
    public byte[] method2746(int arg0, int arg1) {
        return this.method2748(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.r(II[II)[B")
    public byte[] method2748(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return null;
        }
        if (this.field2462[arg0][arg1] == null) {
            boolean var4 = this.method2780(arg0, arg2);
            if (!var4) {
                this.method2775(arg0);
                boolean var5 = this.method2780(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method1897(this.field2462[arg0][arg1], false);
        if (this.field2459) {
            this.field2462[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.f(IIB)Z")
    public boolean method2777(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return false;
        } else if (this.field2462[arg0][arg1] != null) {
            return true;
        } else if (this.field2461[arg0] == null) {
            this.method2775(arg0);
            return this.field2461[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.l(II)Z")
    public boolean method2749(int arg0) {
        if (this.field2461[arg0] == null) {
            this.method2775(arg0);
            return this.field2461[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.b(B)Z")
    public boolean method2750() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2452.length; var2++) {
            int var3 = this.field2452[var2];
            if (this.field2461[var3] == null) {
                this.method2775(var3);
                if (this.field2461[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.k(II)[B")
    public byte[] method2751(int arg0) {
        if (this.field2462.length == 1) {
            return this.method2746(0, arg0);
        } else if (this.field2462[arg0].length == 1) {
            return this.method2746(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.g(III)[B")
    public byte[] method2752(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return null;
        }
        if (this.field2462[arg0][arg1] == null) {
            boolean var3 = this.method2780(arg0, (int[]) null);
            if (!var3) {
                this.method2775(arg0);
                boolean var4 = this.method2780(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method1897(this.field2462[arg0][arg1], false);
    }

    @ObfuscatedName("er.v(IB)[B")
    public byte[] method2753(int arg0) {
        if (this.field2462.length == 1) {
            return this.method2752(0, arg0);
        } else if (this.field2462[arg0].length == 1) {
            return this.method2752(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.i(IB)V")
    public void method2775(int arg0) {
    }

    @ObfuscatedName("er.x(II)[I")
    public int[] method2755(int arg0) {
        return this.field2464[arg0];
    }

    @ObfuscatedName("er.h(IB)I")
    public int method2756(int arg0) {
        return this.field2462[arg0].length;
    }

    @ObfuscatedName("er.w(I)I")
    public int method2757() {
        return this.field2462.length;
    }

    @ObfuscatedName("er.s(II)V")
    public void method2758(int arg0) {
        for (int var2 = 0; var2 < this.field2462[arg0].length; var2++) {
            this.field2462[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.p(I)V")
    public void method2759() {
        for (int var1 = 0; var1 < this.field2462.length; var1++) {
            if (this.field2462[var1] != null) {
                for (int var2 = 0; var2 < this.field2462[var1].length; var2++) {
                    this.field2462[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.z(I[IB)Z")
    public boolean method2780(int arg0, int[] arg1) {
        if (this.field2461[arg0] == null) {
            return false;
        }
        int var3 = this.field2457[arg0];
        int[] var4 = this.field2464[arg0];
        Object[] var5 = this.field2462[arg0];
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
            var8 = class114.method1897(this.field2461[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2151(arg1, 5, var9.field1830.length);
        } else {
            var8 = class114.method1897(this.field2461[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1414(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class108.method532(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class108.method532(var8, 0, var18);
            throw class137.method596(var35, var17 + var19 + "," + this.field2455[arg0] + "," + this.field2463);
        }
        if (this.field2465) {
            this.field2461[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class108 var23 = new class108(var10);
            int[] var24 = new int[var3];
            var23.field1826 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2144();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1826 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2144();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2459) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class114.method755(var28[var34], false);
                }
            }
        } else if (this.field2459) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method755(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.n(Ljava/lang/String;I)I")
    public int method2761(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2454.method3162(class211.method3159(var2));
    }

    @ObfuscatedName("er.u(ILjava/lang/String;I)I")
    public int method2762(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2451[arg0].method3162(class211.method3159(var3));
    }

    @ObfuscatedName("er.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2763(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3162(class211.method3159(var3));
        int var6 = this.field2451[var5].method3162(class211.method3159(var4));
        return this.method2746(var5, var6);
    }

    @ObfuscatedName("er.d(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2764(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3162(class211.method3159(var3));
        int var6 = this.field2451[var5].method3162(class211.method3159(var4));
        return this.method2777(var5, var6);
    }

    @ObfuscatedName("er.m(Ljava/lang/String;B)Z")
    public boolean method2765(String arg0) {
        int var2 = this.method2761("");
        return var2 == -1 ? this.method2764(arg0, "") : this.method2764("", arg0);
    }

    @ObfuscatedName("er.q(Ljava/lang/String;I)V")
    public void method2766(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2454.method3162(class211.method3159(var2));
        if (var3 >= 0) {
            this.method2745(var3);
        }
    }

    @ObfuscatedName("bk.e([BB)[B")
    public static final byte[] method1414(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2134();
        int var3 = var1.method2144();
        if (var3 < 0 || !(field2467 == 0 || var3 <= field2467)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2145(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2144();
            if (var5 < 0 || field2467 != 0 && var5 > field2467) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2082(var6, var5, arg0, var3, 9);
            } else {
                field2458.method2076(var1, var6);
            }
            return var6;
        }
    }
}
