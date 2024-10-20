package deob;

@ObfuscatedName("ey")
public abstract class class151 {

    @ObfuscatedName("ey.v")
    public int field2488;

    @ObfuscatedName("ey.f")
    public int[] field2489;

    @ObfuscatedName("ey.n")
    public int[] field2497;

    @ObfuscatedName("ey.c")
    public class168 field2491;

    @ObfuscatedName("ey.r")
    public int[] field2492;

    @ObfuscatedName("ey.k")
    public int[] field2502;

    @ObfuscatedName("ey.e")
    public int[] field2494;

    @ObfuscatedName("ey.q")
    public int[][] field2495;

    @ObfuscatedName("ey.u")
    public int[][] field2496;

    @ObfuscatedName("ey.s")
    public class168[] field2499;

    @ObfuscatedName("ey.l")
    public Object[] field2498;

    @ObfuscatedName("ey.o")
    public Object[][] field2493;

    @ObfuscatedName("ey.h")
    public static class121 field2490 = new class121();

    @ObfuscatedName("ey.p")
    public int field2501;

    @ObfuscatedName("ey.d")
    public boolean field2507;

    @ObfuscatedName("ey.m")
    public boolean field2503;

    @ObfuscatedName("ey.z")
    public static int field2504 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2507 = arg0;
        this.field2503 = arg1;
    }

    @ObfuscatedName("ey.v([BI)V")
    public void method2960(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class126.method2360(arg0, 0, var2);
        this.field2501 = var3;
        class126 var4 = new class126(method1348(arg0));
        int var5 = var4.method2466();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2500();
        }
        int var6 = var4.method2466();
        if (var5 >= 7) {
            this.field2488 = var4.method2480();
        } else {
            this.field2488 = var4.method2468();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2489 = new int[this.field2488];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2488; var9++) {
                this.field2489[var9] = var7 += var4.method2480();
                if (this.field2489[var9] > var8) {
                    var8 = this.field2489[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2488; var10++) {
                this.field2489[var10] = var7 += var4.method2468();
                if (this.field2489[var10] > var8) {
                    var8 = this.field2489[var10];
                }
            }
        }
        this.field2492 = new int[var8 + 1];
        this.field2502 = new int[var8 + 1];
        this.field2494 = new int[var8 + 1];
        this.field2495 = new int[var8 + 1][];
        this.field2498 = new Object[var8 + 1];
        this.field2493 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2497 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2488; var11++) {
                this.field2497[this.field2489[var11]] = var4.method2500();
            }
            this.field2491 = new class168(this.field2497);
        }
        for (int var12 = 0; var12 < this.field2488; var12++) {
            this.field2492[this.field2489[var12]] = var4.method2500();
        }
        for (int var13 = 0; var13 < this.field2488; var13++) {
            this.field2502[this.field2489[var13]] = var4.method2500();
        }
        for (int var14 = 0; var14 < this.field2488; var14++) {
            this.field2494[this.field2489[var14]] = var4.method2468();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2488; var15++) {
                int var16 = this.field2489[var15];
                int var17 = this.field2494[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2495[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2495[var16][var20] = var18 += var4.method2480();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2493[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2488; var22++) {
                int var23 = this.field2489[var22];
                int var24 = this.field2494[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2495[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2495[var23][var27] = var25 += var4.method2468();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2493[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2496 = new int[var8 + 1][];
        this.field2499 = new class168[var8 + 1];
        for (int var29 = 0; var29 < this.field2488; var29++) {
            int var30 = this.field2489[var29];
            int var31 = this.field2494[var30];
            this.field2496[var30] = new int[this.field2493[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2496[var30][this.field2495[var30][var32]] = var4.method2500();
            }
            this.field2499[var30] = new class168(this.field2496[var30]);
        }
    }

    @ObfuscatedName("ey.f(IB)V")
    public void method2961(int arg0) {
    }

    @ObfuscatedName("ey.n(IIB)[B")
    public byte[] method3020(int arg0, int arg1) {
        return this.method3012(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.c(II[II)[B")
    public byte[] method3012(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2493.length || this.field2493[arg0] == null || arg1 < 0 || arg1 >= this.field2493[arg0].length) {
            return null;
        }
        if (this.field2493[arg0][arg1] == null) {
            boolean var4 = this.method2964(arg0, arg2);
            if (!var4) {
                this.method2969(arg0);
                boolean var5 = this.method2964(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class118.method109(this.field2493[arg0][arg1], false);
        if (this.field2503) {
            this.field2493[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.r(IIB)Z")
    public boolean method2993(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2493.length || this.field2493[arg0] == null || arg1 < 0 || arg1 >= this.field2493[arg0].length) {
            return false;
        } else if (this.field2493[arg0][arg1] != null) {
            return true;
        } else if (this.field2498[arg0] == null) {
            this.method2969(arg0);
            return this.field2498[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.k(II)Z")
    public boolean method2965(int arg0) {
        if (this.field2498[arg0] == null) {
            this.method2969(arg0);
            return this.field2498[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.e(I)Z")
    public boolean method2966() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2489.length; var2++) {
            int var3 = this.field2489[var2];
            if (this.field2498[var3] == null) {
                this.method2969(var3);
                if (this.field2498[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.q(II)[B")
    public byte[] method2967(int arg0) {
        if (this.field2493.length == 1) {
            return this.method3020(0, arg0);
        } else if (this.field2493[arg0].length == 1) {
            return this.method3020(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.u(III)[B")
    public byte[] method3025(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2493.length || this.field2493[arg0] == null || arg1 < 0 || arg1 >= this.field2493[arg0].length) {
            return null;
        }
        if (this.field2493[arg0][arg1] == null) {
            boolean var3 = this.method2964(arg0, (int[]) null);
            if (!var3) {
                this.method2969(arg0);
                boolean var4 = this.method2964(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class118.method109(this.field2493[arg0][arg1], false);
    }

    @ObfuscatedName("ey.s(IB)[B")
    public byte[] method2968(int arg0) {
        if (this.field2493.length == 1) {
            return this.method3025(0, arg0);
        } else if (this.field2493[arg0].length == 1) {
            return this.method3025(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.l(IB)V")
    public void method2969(int arg0) {
    }

    @ObfuscatedName("ey.o(IB)[I")
    public int[] method2970(int arg0) {
        return this.field2495[arg0];
    }

    @ObfuscatedName("ey.h(II)I")
    public int method2971(int arg0) {
        return this.field2493[arg0].length;
    }

    @ObfuscatedName("ey.p(I)I")
    public int method2972() {
        return this.field2493.length;
    }

    @ObfuscatedName("ey.d(II)V")
    public void method2999(int arg0) {
        for (int var2 = 0; var2 < this.field2493[arg0].length; var2++) {
            this.field2493[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.m(I)V")
    public void method2974() {
        for (int var1 = 0; var1 < this.field2493.length; var1++) {
            if (this.field2493[var1] != null) {
                for (int var2 = 0; var2 < this.field2493[var1].length; var2++) {
                    this.field2493[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.z(I[IB)Z")
    public boolean method2964(int arg0, int[] arg1) {
        if (this.field2498[arg0] == null) {
            return false;
        }
        int var3 = this.field2494[arg0];
        int[] var4 = this.field2495[arg0];
        Object[] var5 = this.field2493[arg0];
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
            var8 = class118.method109(this.field2498[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2483(arg1, 5, var9.field2029.length);
        } else {
            var8 = class118.method109(this.field2498[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1348(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class126.method2360(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class126.method2360(var8, 0, var17);
            throw class79.method2057(var34, var16 + var18 + "," + this.field2492[arg0] + "," + this.field2501);
        }
        if (this.field2507) {
            this.field2498[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class126 var22 = new class126(var10);
            int[] var23 = new int[var3];
            var22.field2027 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2500();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2027 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2500();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2503) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class118.method2402(var27[var33], false);
                }
            }
        } else if (this.field2503) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method2402(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.t(Ljava/lang/String;I)I")
    public int method2976(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2491.method3220(class146.method551(var2));
    }

    @ObfuscatedName("ey.i(ILjava/lang/String;I)I")
    public int method3004(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2499[arg0].method3220(class146.method551(var3));
    }

    @ObfuscatedName("ey.j(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2975(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2491.method3220(class146.method551(var3));
        int var6 = this.field2499[var5].method3220(class146.method551(var4));
        return this.method3020(var5, var6);
    }

    @ObfuscatedName("ey.a(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2979(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2491.method3220(class146.method551(var3));
        int var6 = this.field2499[var5].method3220(class146.method551(var4));
        return this.method2993(var5, var6);
    }

    @ObfuscatedName("ey.g(Ljava/lang/String;I)V")
    public void method3022(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2491.method3220(class146.method551(var2));
        if (var3 >= 0) {
            this.method2961(var3);
        }
    }

    @ObfuscatedName("by.x([BI)[B")
    public static final byte[] method1348(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2466();
        int var3 = var1.method2500();
        if (var3 < 0 || !(field2504 == 0 || var3 <= field2504)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2587(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2500();
            if (var5 < 0 || field2504 != 0 && var5 > field2504) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2416(var6, var5, arg0, var3, 9);
            } else {
                field2490.method2401(var1, var6);
            }
            return var6;
        }
    }
}
