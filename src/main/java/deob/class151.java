package deob;

@ObfuscatedName("ek")
public abstract class class151 {

    @ObfuscatedName("ek.a")
    public int field2504;

    @ObfuscatedName("ek.v")
    public int[] field2488;

    @ObfuscatedName("ek.i")
    public int[] field2487;

    @ObfuscatedName("ek.b")
    public class175 field2490;

    @ObfuscatedName("ek.l")
    public int[] field2491;

    @ObfuscatedName("ek.m")
    public int[] field2492;

    @ObfuscatedName("ek.w")
    public int[] field2494;

    @ObfuscatedName("ek.e")
    public int[][] field2495;

    @ObfuscatedName("ek.n")
    public int[][] field2503;

    @ObfuscatedName("ek.s")
    public class175[] field2496;

    @ObfuscatedName("ek.k")
    public Object[] field2498;

    @ObfuscatedName("ek.f")
    public Object[][] field2489;

    @ObfuscatedName("ek.d")
    public static class107 field2499 = new class107();

    @ObfuscatedName("ek.x")
    public int field2500;

    @ObfuscatedName("ek.o")
    public boolean field2501;

    @ObfuscatedName("ek.q")
    public boolean field2502;

    @ObfuscatedName("ek.t")
    public static int field2493 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2501 = arg0;
        this.field2502 = arg1;
    }

    @ObfuscatedName("ek.a([BI)V")
    public void method2770(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class110.field1858[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2500 = var5;
        class110 var8 = new class110(method536(arg0));
        int var9 = var8.method2199();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2136();
        }
        int var10 = var8.method2199();
        if (var9 >= 7) {
            this.field2504 = var8.method2145();
        } else {
            this.field2504 = var8.method2282();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2488 = new int[this.field2504];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2504; var13++) {
                this.field2488[var13] = var11 += var8.method2145();
                if (this.field2488[var13] > var12) {
                    var12 = this.field2488[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2504; var14++) {
                this.field2488[var14] = var11 += var8.method2282();
                if (this.field2488[var14] > var12) {
                    var12 = this.field2488[var14];
                }
            }
        }
        this.field2491 = new int[var12 + 1];
        this.field2492 = new int[var12 + 1];
        this.field2494 = new int[var12 + 1];
        this.field2495 = new int[var12 + 1][];
        this.field2498 = new Object[var12 + 1];
        this.field2489 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2487 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2504; var15++) {
                this.field2487[this.field2488[var15]] = var8.method2136();
            }
            this.field2490 = new class175(this.field2487);
        }
        for (int var16 = 0; var16 < this.field2504; var16++) {
            this.field2491[this.field2488[var16]] = var8.method2136();
        }
        for (int var17 = 0; var17 < this.field2504; var17++) {
            this.field2492[this.field2488[var17]] = var8.method2136();
        }
        for (int var18 = 0; var18 < this.field2504; var18++) {
            this.field2494[this.field2488[var18]] = var8.method2282();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2504; var19++) {
                int var20 = this.field2488[var19];
                int var21 = this.field2494[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2495[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2495[var20][var24] = var22 += var8.method2145();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2489[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2504; var26++) {
                int var27 = this.field2488[var26];
                int var28 = this.field2494[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2495[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2495[var27][var31] = var29 += var8.method2282();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2489[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2503 = new int[var12 + 1][];
        this.field2496 = new class175[var12 + 1];
        for (int var33 = 0; var33 < this.field2504; var33++) {
            int var34 = this.field2488[var33];
            int var35 = this.field2494[var34];
            this.field2503[var34] = new int[this.field2489[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2503[var34][this.field2495[var34][var36]] = var8.method2136();
            }
            this.field2496[var34] = new class175(this.field2503[var34]);
        }
    }

    @ObfuscatedName("ek.v(IB)V")
    public void method2781(int arg0) {
    }

    @ObfuscatedName("ek.i(IIS)[B")
    public byte[] method2731(int arg0, int arg1) {
        return this.method2732(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ek.b(II[II)[B")
    public byte[] method2732(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2489.length || this.field2489[arg0] == null || arg1 < 0 || arg1 >= this.field2489[arg0].length) {
            return null;
        }
        if (this.field2489[arg0][arg1] == null) {
            boolean var4 = this.method2744(arg0, arg2);
            if (!var4) {
                this.method2738(arg0);
                boolean var5 = this.method2744(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class116.method1974(this.field2489[arg0][arg1], false);
        if (this.field2502) {
            this.field2489[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ek.l(III)Z")
    public boolean method2733(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2489.length || this.field2489[arg0] == null || arg1 < 0 || arg1 >= this.field2489[arg0].length) {
            return false;
        } else if (this.field2489[arg0][arg1] != null) {
            return true;
        } else if (this.field2498[arg0] == null) {
            this.method2738(arg0);
            return this.field2498[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ek.m(II)Z")
    public boolean method2734(int arg0) {
        if (this.field2498[arg0] == null) {
            this.method2738(arg0);
            return this.field2498[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ek.w(I)Z")
    public boolean method2735() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2488.length; var2++) {
            int var3 = this.field2488[var2];
            if (this.field2498[var3] == null) {
                this.method2738(var3);
                if (this.field2498[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ek.e(IS)[B")
    public byte[] method2736(int arg0) {
        if (this.field2489.length == 1) {
            return this.method2731(0, arg0);
        } else if (this.field2489[arg0].length == 1) {
            return this.method2731(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.n(III)[B")
    public byte[] method2730(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2489.length || this.field2489[arg0] == null || arg1 < 0 || arg1 >= this.field2489[arg0].length) {
            return null;
        }
        if (this.field2489[arg0][arg1] == null) {
            boolean var3 = this.method2744(arg0, (int[]) null);
            if (!var3) {
                this.method2738(arg0);
                boolean var4 = this.method2744(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class116.method1974(this.field2489[arg0][arg1], false);
    }

    @ObfuscatedName("ek.s(IB)[B")
    public byte[] method2737(int arg0) {
        if (this.field2489.length == 1) {
            return this.method2730(0, arg0);
        } else if (this.field2489[arg0].length == 1) {
            return this.method2730(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ek.k(II)V")
    public void method2738(int arg0) {
    }

    @ObfuscatedName("ek.f(II)[I")
    public int[] method2739(int arg0) {
        return this.field2495[arg0];
    }

    @ObfuscatedName("ek.d(IB)I")
    public int method2806(int arg0) {
        return this.field2489[arg0].length;
    }

    @ObfuscatedName("ek.x(I)I")
    public int method2752() {
        return this.field2489.length;
    }

    @ObfuscatedName("ek.o(II)V")
    public void method2742(int arg0) {
        for (int var2 = 0; var2 < this.field2489[arg0].length; var2++) {
            this.field2489[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ek.q(B)V")
    public void method2743() {
        for (int var1 = 0; var1 < this.field2489.length; var1++) {
            if (this.field2489[var1] != null) {
                for (int var2 = 0; var2 < this.field2489[var1].length; var2++) {
                    this.field2489[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ek.t(I[II)Z")
    public boolean method2744(int arg0, int[] arg1) {
        if (this.field2498[arg0] == null) {
            return false;
        }
        int var3 = this.field2494[arg0];
        int[] var4 = this.field2495[arg0];
        Object[] var5 = this.field2489[arg0];
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
            var8 = class116.method1974(this.field2498[arg0], true);
            class110 var9 = new class110(var8);
            var9.method2118(arg1, 5, var9.field1865.length);
        } else {
            var8 = class116.method1974(this.field2498[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method536(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class110.field1858[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class110.field1858[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class139.method520(var43, var21 + var25 + "," + this.field2491[arg0] + "," + this.field2500);
        }
        if (this.field2501) {
            this.field2498[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class110 var31 = new class110(var10);
            int[] var32 = new int[var3];
            var31.field1861 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2136();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1861 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2136();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2502) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class116.method493(var36[var42], false);
                }
            }
        } else if (this.field2502) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class116.method493(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ek.h(Ljava/lang/String;I)I")
    public int method2745(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2490.method3179(class213.method3177(var2));
    }

    @ObfuscatedName("ek.u(ILjava/lang/String;I)I")
    public int method2746(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2496[arg0].method3179(class213.method3177(var3));
    }

    @ObfuscatedName("ek.j(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2747(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2490.method3179(class213.method3177(var3));
        int var6 = this.field2496[var5].method3179(class213.method3177(var4));
        return this.method2731(var5, var6);
    }

    @ObfuscatedName("ek.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2748(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2490.method3179(class213.method3177(var3));
        int var6 = this.field2496[var5].method3179(class213.method3177(var4));
        return this.method2733(var5, var6);
    }

    @ObfuscatedName("ek.y(Ljava/lang/String;I)Z")
    public boolean method2749(String arg0) {
        int var2 = this.method2745("");
        return var2 == -1 ? this.method2748(arg0, "") : this.method2748("", arg0);
    }

    @ObfuscatedName("ek.p(Ljava/lang/String;I)V")
    public void method2750(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2490.method3179(class213.method3177(var2));
        if (var3 >= 0) {
            this.method2781(var3);
        }
    }

    @ObfuscatedName("r.r([BI)[B")
    public static final byte[] method536(byte[] arg0) {
        class110 var1 = new class110(arg0);
        int var2 = var1.method2199();
        int var3 = var1.method2136();
        if (var3 < 0 || !(field2493 == 0 || var3 <= field2493)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2142(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2136();
            if (var5 < 0 || field2493 != 0 && var5 > field2493) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class108.method2085(var6, var5, arg0, var3, 9);
            } else {
                field2499.method2079(var1, var6);
            }
            return var6;
        }
    }
}
