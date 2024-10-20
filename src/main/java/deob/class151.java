package deob;

@ObfuscatedName("eb")
public abstract class class151 {

    @ObfuscatedName("eb.u")
    public int field2487;

    @ObfuscatedName("eb.k")
    public int[] field2497;

    @ObfuscatedName("eb.x")
    public int[] field2493;

    @ObfuscatedName("eb.m")
    public class168 field2488;

    @ObfuscatedName("eb.n")
    public int[] field2489;

    @ObfuscatedName("eb.q")
    public int[] field2502;

    @ObfuscatedName("eb.a")
    public int[] field2490;

    @ObfuscatedName("eb.g")
    public int[][] field2492;

    @ObfuscatedName("eb.j")
    public int[][] field2486;

    @ObfuscatedName("eb.l")
    public class168[] field2491;

    @ObfuscatedName("eb.w")
    public Object[] field2495;

    @ObfuscatedName("eb.z")
    public Object[][] field2496;

    @ObfuscatedName("eb.e")
    public static class121 field2494 = new class121();

    @ObfuscatedName("eb.b")
    public int field2498;

    @ObfuscatedName("eb.c")
    public boolean field2499;

    @ObfuscatedName("eb.d")
    public boolean field2500;

    @ObfuscatedName("eb.h")
    public static int field2501 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2499 = arg0;
        this.field2500 = arg1;
    }

    @ObfuscatedName("eb.u([BI)V")
    public void method2963(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class126.field2023[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2498 = var5;
        class126 var8 = new class126(method2679(arg0));
        int var9 = var8.method2559();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2526();
        }
        int var10 = var8.method2559();
        if (var9 >= 7) {
            this.field2487 = var8.method2567();
        } else {
            this.field2487 = var8.method2450();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2497 = new int[this.field2487];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2487; var13++) {
                this.field2497[var13] = var11 += var8.method2567();
                if (this.field2497[var13] > var12) {
                    var12 = this.field2497[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2487; var14++) {
                this.field2497[var14] = var11 += var8.method2450();
                if (this.field2497[var14] > var12) {
                    var12 = this.field2497[var14];
                }
            }
        }
        this.field2489 = new int[var12 + 1];
        this.field2502 = new int[var12 + 1];
        this.field2490 = new int[var12 + 1];
        this.field2492 = new int[var12 + 1][];
        this.field2495 = new Object[var12 + 1];
        this.field2496 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2493 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2487; var15++) {
                this.field2493[this.field2497[var15]] = var8.method2526();
            }
            this.field2488 = new class168(this.field2493);
        }
        for (int var16 = 0; var16 < this.field2487; var16++) {
            this.field2489[this.field2497[var16]] = var8.method2526();
        }
        for (int var17 = 0; var17 < this.field2487; var17++) {
            this.field2502[this.field2497[var17]] = var8.method2526();
        }
        for (int var18 = 0; var18 < this.field2487; var18++) {
            this.field2490[this.field2497[var18]] = var8.method2450();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2487; var19++) {
                int var20 = this.field2497[var19];
                int var21 = this.field2490[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2492[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2492[var20][var24] = var22 += var8.method2567();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2496[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2487; var26++) {
                int var27 = this.field2497[var26];
                int var28 = this.field2490[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2492[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2492[var27][var31] = var29 += var8.method2450();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2496[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2486 = new int[var12 + 1][];
        this.field2491 = new class168[var12 + 1];
        for (int var33 = 0; var33 < this.field2487; var33++) {
            int var34 = this.field2497[var33];
            int var35 = this.field2490[var34];
            this.field2486[var34] = new int[this.field2496[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2486[var34][this.field2492[var34][var36]] = var8.method2526();
            }
            this.field2491[var34] = new class168(this.field2486[var34]);
        }
    }

    @ObfuscatedName("eb.k(IB)V")
    public void method2964(int arg0) {
    }

    @ObfuscatedName("eb.x(III)[B")
    public byte[] method2965(int arg0, int arg1) {
        return this.method2966(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eb.m(II[IB)[B")
    public byte[] method2966(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return null;
        }
        if (this.field2496[arg0][arg1] == null) {
            boolean var4 = this.method3009(arg0, arg2);
            if (!var4) {
                this.method2973(arg0);
                boolean var5 = this.method3009(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method2759(this.field2496[arg0][arg1], false);
        if (this.field2500) {
            this.field2496[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eb.n(III)Z")
    public boolean method3013(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return false;
        } else if (this.field2496[arg0][arg1] != null) {
            return true;
        } else if (this.field2495[arg0] == null) {
            this.method2973(arg0);
            return this.field2495[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eb.q(II)Z")
    public boolean method2976(int arg0) {
        if (this.field2495[arg0] == null) {
            this.method2973(arg0);
            return this.field2495[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eb.a(I)Z")
    public boolean method2969() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2497.length; var2++) {
            int var3 = this.field2497[var2];
            if (this.field2495[var3] == null) {
                this.method2973(var3);
                if (this.field2495[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eb.g(IB)[B")
    public byte[] method3003(int arg0) {
        if (this.field2496.length == 1) {
            return this.method2965(0, arg0);
        } else if (this.field2496[arg0].length == 1) {
            return this.method2965(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eb.j(III)[B")
    public byte[] method2971(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2496.length || this.field2496[arg0] == null || arg1 < 0 || arg1 >= this.field2496[arg0].length) {
            return null;
        }
        if (this.field2496[arg0][arg1] == null) {
            boolean var3 = this.method3009(arg0, (int[]) null);
            if (!var3) {
                this.method2973(arg0);
                boolean var4 = this.method3009(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method2759(this.field2496[arg0][arg1], false);
    }

    @ObfuscatedName("eb.l(IB)[B")
    public byte[] method2972(int arg0) {
        if (this.field2496.length == 1) {
            return this.method2971(0, arg0);
        } else if (this.field2496[arg0].length == 1) {
            return this.method2971(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eb.w(IB)V")
    public void method2973(int arg0) {
    }

    @ObfuscatedName("eb.z(II)[I")
    public int[] method2974(int arg0) {
        return this.field2492[arg0];
    }

    @ObfuscatedName("eb.e(II)I")
    public int method2975(int arg0) {
        return this.field2496[arg0].length;
    }

    @ObfuscatedName("eb.b(I)I")
    public int method2986() {
        return this.field2496.length;
    }

    @ObfuscatedName("eb.c(II)V")
    public void method2977(int arg0) {
        for (int var2 = 0; var2 < this.field2496[arg0].length; var2++) {
            this.field2496[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eb.d(B)V")
    public void method2978() {
        for (int var1 = 0; var1 < this.field2496.length; var1++) {
            if (this.field2496[var1] != null) {
                for (int var2 = 0; var2 < this.field2496[var1].length; var2++) {
                    this.field2496[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eb.h(I[II)Z")
    public boolean method3009(int arg0, int[] arg1) {
        if (this.field2495[arg0] == null) {
            return false;
        }
        int var3 = this.field2490[arg0];
        int[] var4 = this.field2492[arg0];
        Object[] var5 = this.field2496[arg0];
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
            var8 = Statics.method2759(this.field2495[arg0], true);
            class126 var9 = new class126(var8);
            var9.method2465(arg1, 5, var9.field2022.length);
        } else {
            var8 = Statics.method2759(this.field2495[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2679(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class126.field2023[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class126.field2023[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class79.method798(var43, var21 + var25 + "," + this.field2489[arg0] + "," + this.field2498);
        }
        if (this.field2499) {
            this.field2495[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class126 var31 = new class126(var10);
            int[] var32 = new int[var3];
            var31.field2024 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2526();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2024 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2526();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2500) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class118.method1641(var36[var42], false);
                }
            }
        } else if (this.field2500) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class118.method1641(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eb.i(Ljava/lang/String;I)I")
    public int method2980(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2488.method3255(class146.method2938(var2));
    }

    @ObfuscatedName("eb.v(ILjava/lang/String;I)I")
    public int method3014(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2491[arg0].method3255(class146.method2938(var3));
    }

    @ObfuscatedName("eb.s(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2970(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2488.method3255(class146.method2938(var3));
        int var6 = this.field2491[var5].method3255(class146.method2938(var4));
        return this.method2965(var5, var6);
    }

    @ObfuscatedName("eb.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3011(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2488.method3255(class146.method2938(var3));
        int var6 = this.field2491[var5].method3255(class146.method2938(var4));
        return this.method3013(var5, var6);
    }

    @ObfuscatedName("eb.y(Ljava/lang/String;I)V")
    public void method2984(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2488.method3255(class146.method2938(var2));
        if (var3 >= 0) {
            this.method2964(var3);
        }
    }

    @ObfuscatedName("ec.t([BI)[B")
    public static final byte[] method2679(byte[] arg0) {
        class126 var1 = new class126(arg0);
        int var2 = var1.method2559();
        int var3 = var1.method2526();
        if (var3 < 0 || !(field2501 == 0 || var3 <= field2501)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2613(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2526();
            if (var5 < 0 || field2501 != 0 && var5 > field2501) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class122.method2392(var6, var5, arg0, var3, 9);
            } else {
                field2494.method2388(var1, var6);
            }
            return var6;
        }
    }
}
