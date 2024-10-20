package deob;

@ObfuscatedName("ev")
public abstract class class149 {

    @ObfuscatedName("ev.f")
    public int field2482;

    @ObfuscatedName("ev.k")
    public int[] field2471;

    @ObfuscatedName("ev.y")
    public int[] field2474;

    @ObfuscatedName("ev.e")
    public class173 field2473;

    @ObfuscatedName("ev.r")
    public int[] field2487;

    @ObfuscatedName("ev.a")
    public int[] field2470;

    @ObfuscatedName("ev.n")
    public int[] field2476;

    @ObfuscatedName("ev.x")
    public int[][] field2477;

    @ObfuscatedName("ev.g")
    public int[][] field2481;

    @ObfuscatedName("ev.o")
    public class173[] field2479;

    @ObfuscatedName("ev.p")
    public Object[] field2480;

    @ObfuscatedName("ev.v")
    public Object[][] field2483;

    @ObfuscatedName("ev.w")
    public static class105 field2478 = new class105();

    @ObfuscatedName("ev.t")
    public int field2472;

    @ObfuscatedName("ev.s")
    public boolean field2484;

    @ObfuscatedName("ev.b")
    public boolean field2485;

    @ObfuscatedName("ev.u")
    public static int field2486 = 0;

    public class149(boolean arg0, boolean arg1) {
        this.field2484 = arg0;
        this.field2485 = arg1;
    }

    @ObfuscatedName("ev.f([BI)V")
    public void method2761(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class108.method2085(arg0, 0, var2);
        this.field2472 = var3;
        class108 var4 = new class108(method2735(arg0));
        int var5 = var4.method2158();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2256();
        }
        int var6 = var4.method2158();
        if (var5 >= 7) {
            this.field2482 = var4.method2172();
        } else {
            this.field2482 = var4.method2160();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2471 = new int[this.field2482];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2482; var9++) {
                this.field2471[var9] = var7 += var4.method2172();
                if (this.field2471[var9] > var8) {
                    var8 = this.field2471[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2482; var10++) {
                this.field2471[var10] = var7 += var4.method2160();
                if (this.field2471[var10] > var8) {
                    var8 = this.field2471[var10];
                }
            }
        }
        this.field2487 = new int[var8 + 1];
        this.field2470 = new int[var8 + 1];
        this.field2476 = new int[var8 + 1];
        this.field2477 = new int[var8 + 1][];
        this.field2480 = new Object[var8 + 1];
        this.field2483 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2474 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2482; var11++) {
                this.field2474[this.field2471[var11]] = var4.method2256();
            }
            this.field2473 = new class173(this.field2474);
        }
        for (int var12 = 0; var12 < this.field2482; var12++) {
            this.field2487[this.field2471[var12]] = var4.method2256();
        }
        for (int var13 = 0; var13 < this.field2482; var13++) {
            this.field2470[this.field2471[var13]] = var4.method2256();
        }
        for (int var14 = 0; var14 < this.field2482; var14++) {
            this.field2476[this.field2471[var14]] = var4.method2160();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2482; var15++) {
                int var16 = this.field2471[var15];
                int var17 = this.field2476[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2477[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2477[var16][var20] = var18 += var4.method2172();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2483[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2482; var22++) {
                int var23 = this.field2471[var22];
                int var24 = this.field2476[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2477[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2477[var23][var27] = var25 += var4.method2160();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2483[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2481 = new int[var8 + 1][];
        this.field2479 = new class173[var8 + 1];
        for (int var29 = 0; var29 < this.field2482; var29++) {
            int var30 = this.field2471[var29];
            int var31 = this.field2476[var30];
            this.field2481[var30] = new int[this.field2483[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2481[var30][this.field2477[var30][var32]] = var4.method2256();
            }
            this.field2479[var30] = new class173(this.field2481[var30]);
        }
    }

    @ObfuscatedName("ev.k(II)V")
    public void method2762(int arg0) {
    }

    @ObfuscatedName("ev.y(III)[B")
    public byte[] method2763(int arg0, int arg1) {
        return this.method2764(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ev.e(II[II)[B")
    public byte[] method2764(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2483.length || this.field2483[arg0] == null || arg1 < 0 || arg1 >= this.field2483[arg0].length) {
            return null;
        }
        if (this.field2483[arg0][arg1] == null) {
            boolean var4 = this.method2777(arg0, arg2);
            if (!var4) {
                this.method2771(arg0);
                boolean var5 = this.method2777(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class114.method554(this.field2483[arg0][arg1], false);
        if (this.field2485) {
            this.field2483[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ev.r(III)Z")
    public boolean method2807(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2483.length || this.field2483[arg0] == null || arg1 < 0 || arg1 >= this.field2483[arg0].length) {
            return false;
        } else if (this.field2483[arg0][arg1] != null) {
            return true;
        } else if (this.field2480[arg0] == null) {
            this.method2771(arg0);
            return this.field2480[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.a(II)Z")
    public boolean method2766(int arg0) {
        if (this.field2480[arg0] == null) {
            this.method2771(arg0);
            return this.field2480[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.n(B)Z")
    public boolean method2767() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2471.length; var2++) {
            int var3 = this.field2471[var2];
            if (this.field2480[var3] == null) {
                this.method2771(var3);
                if (this.field2480[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ev.x(IB)[B")
    public byte[] method2768(int arg0) {
        if (this.field2483.length == 1) {
            return this.method2763(0, arg0);
        } else if (this.field2483[arg0].length == 1) {
            return this.method2763(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.g(III)[B")
    public byte[] method2804(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2483.length || this.field2483[arg0] == null || arg1 < 0 || arg1 >= this.field2483[arg0].length) {
            return null;
        }
        if (this.field2483[arg0][arg1] == null) {
            boolean var3 = this.method2777(arg0, (int[]) null);
            if (!var3) {
                this.method2771(arg0);
                boolean var4 = this.method2777(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class114.method554(this.field2483[arg0][arg1], false);
    }

    @ObfuscatedName("ev.o(II)[B")
    public byte[] method2835(int arg0) {
        if (this.field2483.length == 1) {
            return this.method2804(0, arg0);
        } else if (this.field2483[arg0].length == 1) {
            return this.method2804(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.p(II)V")
    public void method2771(int arg0) {
    }

    @ObfuscatedName("ev.v(II)[I")
    public int[] method2817(int arg0) {
        return this.field2477[arg0];
    }

    @ObfuscatedName("ev.w(II)I")
    public int method2773(int arg0) {
        return this.field2483[arg0].length;
    }

    @ObfuscatedName("ev.t(B)I")
    public int method2774() {
        return this.field2483.length;
    }

    @ObfuscatedName("ev.s(II)V")
    public void method2775(int arg0) {
        for (int var2 = 0; var2 < this.field2483[arg0].length; var2++) {
            this.field2483[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ev.b(I)V")
    public void method2799() {
        for (int var1 = 0; var1 < this.field2483.length; var1++) {
            if (this.field2483[var1] != null) {
                for (int var2 = 0; var2 < this.field2483[var1].length; var2++) {
                    this.field2483[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ev.u(I[IB)Z")
    public boolean method2777(int arg0, int[] arg1) {
        if (this.field2480[arg0] == null) {
            return false;
        }
        int var3 = this.field2476[arg0];
        int[] var4 = this.field2477[arg0];
        Object[] var5 = this.field2483[arg0];
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
            var8 = class114.method554(this.field2480[arg0], true);
            class108 var9 = new class108(var8);
            var9.method2175(arg1, 5, var9.field1854.length);
        } else {
            var8 = class114.method554(this.field2480[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2735(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class108.method2085(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class108.method2085(var8, 0, var17);
            throw class137.method605(var34, var16 + var18 + "," + this.field2487[arg0] + "," + this.field2472);
        }
        if (this.field2484) {
            this.field2480[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class108 var22 = new class108(var10);
            int[] var23 = new int[var3];
            var22.field1859 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2256();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1859 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2256();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2485) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class114.method564(var27[var33], false);
                }
            }
        } else if (this.field2485) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class114.method564(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ev.j(Ljava/lang/String;I)I")
    public int method2778(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2473.method3205(class211.method874(var2));
    }

    @ObfuscatedName("ev.d(ILjava/lang/String;B)I")
    public int method2809(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2479[arg0].method3205(class211.method874(var3));
    }

    @ObfuscatedName("ev.l(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2780(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2473.method3205(class211.method874(var3));
        int var6 = this.field2479[var5].method3205(class211.method874(var4));
        return this.method2763(var5, var6);
    }

    @ObfuscatedName("ev.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2781(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2473.method3205(class211.method874(var3));
        int var6 = this.field2479[var5].method3205(class211.method874(var4));
        return this.method2807(var5, var6);
    }

    @ObfuscatedName("ev.q(Ljava/lang/String;I)Z")
    public boolean method2770(String arg0) {
        int var2 = this.method2778("");
        return var2 == -1 ? this.method2781(arg0, "") : this.method2781("", arg0);
    }

    @ObfuscatedName("ev.h(Ljava/lang/String;I)V")
    public void method2783(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2473.method3205(class211.method874(var2));
        if (var3 >= 0) {
            this.method2762(var3);
        }
    }

    @ObfuscatedName("eo.c([BS)[B")
    public static final byte[] method2735(byte[] arg0) {
        class108 var1 = new class108(arg0);
        int var2 = var1.method2158();
        int var3 = var1.method2256();
        if (var3 < 0 || !(field2486 == 0 || var3 <= field2486)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2169(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2256();
            if (var5 < 0 || field2486 != 0 && var5 > field2486) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class106.method2113(var6, var5, arg0, var3, 9);
            } else {
                field2478.method2111(var1, var6);
            }
            return var6;
        }
    }
}
