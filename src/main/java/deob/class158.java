package deob;

@ObfuscatedName("fv")
public abstract class class158 {

    @ObfuscatedName("fv.e")
    public int field2538;

    @ObfuscatedName("fv.a")
    public int[] field2540;

    @ObfuscatedName("fv.l")
    public int[] field2537;

    @ObfuscatedName("fv.c")
    public class182 field2551;

    @ObfuscatedName("fv.u")
    public int[] field2539;

    @ObfuscatedName("fv.w")
    public int[] field2549;

    @ObfuscatedName("fv.i")
    public int[] field2541;

    @ObfuscatedName("fv.r")
    public int[][] field2542;

    @ObfuscatedName("fv.f")
    public int[][] field2536;

    @ObfuscatedName("fv.g")
    public class182[] field2544;

    @ObfuscatedName("fv.o")
    public Object[] field2545;

    @ObfuscatedName("fv.h")
    public Object[][] field2546;

    @ObfuscatedName("fv.s")
    public static class108 field2547 = new class108();

    @ObfuscatedName("fv.j")
    public int field2548;

    @ObfuscatedName("fv.m")
    public boolean field2550;

    @ObfuscatedName("fv.t")
    public boolean field2535;

    @ObfuscatedName("fv.z")
    public static int field2543 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2550 = arg0;
        this.field2535 = arg1;
    }

    @ObfuscatedName("fv.e([BB)V")
    public void method2846(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class111.field1840[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2548 = var5;
        class111 var8 = new class111(method2560(arg0));
        int var9 = var8.method2176();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2378();
        }
        int var10 = var8.method2176();
        if (var9 >= 7) {
            this.field2538 = var8.method2287();
        } else {
            this.field2538 = var8.method2178();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2540 = new int[this.field2538];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2538; var13++) {
                this.field2540[var13] = var11 += var8.method2287();
                if (this.field2540[var13] > var12) {
                    var12 = this.field2540[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2538; var14++) {
                this.field2540[var14] = var11 += var8.method2178();
                if (this.field2540[var14] > var12) {
                    var12 = this.field2540[var14];
                }
            }
        }
        this.field2539 = new int[var12 + 1];
        this.field2549 = new int[var12 + 1];
        this.field2541 = new int[var12 + 1];
        this.field2542 = new int[var12 + 1][];
        this.field2545 = new Object[var12 + 1];
        this.field2546 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2537 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2538; var15++) {
                this.field2537[this.field2540[var15]] = var8.method2378();
            }
            this.field2551 = new class182(this.field2537);
        }
        for (int var16 = 0; var16 < this.field2538; var16++) {
            this.field2539[this.field2540[var16]] = var8.method2378();
        }
        for (int var17 = 0; var17 < this.field2538; var17++) {
            this.field2549[this.field2540[var17]] = var8.method2378();
        }
        for (int var18 = 0; var18 < this.field2538; var18++) {
            this.field2541[this.field2540[var18]] = var8.method2178();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2538; var19++) {
                int var20 = this.field2540[var19];
                int var21 = this.field2541[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2542[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2542[var20][var24] = var22 += var8.method2287();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2546[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2538; var26++) {
                int var27 = this.field2540[var26];
                int var28 = this.field2541[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2542[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2542[var27][var31] = var29 += var8.method2178();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2546[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2536 = new int[var12 + 1][];
        this.field2544 = new class182[var12 + 1];
        for (int var33 = 0; var33 < this.field2538; var33++) {
            int var34 = this.field2540[var33];
            int var35 = this.field2541[var34];
            this.field2536[var34] = new int[this.field2546[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2536[var34][this.field2542[var34][var36]] = var8.method2378();
            }
            this.field2544[var34] = new class182(this.field2536[var34]);
        }
    }

    @ObfuscatedName("fv.a(II)V")
    public void method2842(int arg0) {
    }

    @ObfuscatedName("fv.l(III)[B")
    public byte[] method2843(int arg0, int arg1) {
        return this.method2857(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fv.c(II[IB)[B")
    public byte[] method2857(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2546.length || this.field2546[arg0] == null || arg1 < 0 || arg1 >= this.field2546[arg0].length) {
            return null;
        }
        if (this.field2546[arg0][arg1] == null) {
            boolean var4 = this.method2841(arg0, arg2);
            if (!var4) {
                this.method2851(arg0);
                boolean var5 = this.method2841(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method523(this.field2546[arg0][arg1], false);
        if (this.field2535) {
            this.field2546[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fv.u(IIB)Z")
    public boolean method2856(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2546.length || this.field2546[arg0] == null || arg1 < 0 || arg1 >= this.field2546[arg0].length) {
            return false;
        } else if (this.field2546[arg0][arg1] != null) {
            return true;
        } else if (this.field2545[arg0] == null) {
            this.method2851(arg0);
            return this.field2545[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.w(II)Z")
    public boolean method2906(int arg0) {
        if (this.field2545[arg0] == null) {
            this.method2851(arg0);
            return this.field2545[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.i(I)Z")
    public boolean method2908() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2540.length; var2++) {
            int var3 = this.field2540[var2];
            if (this.field2545[var3] == null) {
                this.method2851(var3);
                if (this.field2545[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fv.r(II)[B")
    public byte[] method2873(int arg0) {
        if (this.field2546.length == 1) {
            return this.method2843(0, arg0);
        } else if (this.field2546[arg0].length == 1) {
            return this.method2843(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.f(IIB)[B")
    public byte[] method2849(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2546.length || this.field2546[arg0] == null || arg1 < 0 || arg1 >= this.field2546[arg0].length) {
            return null;
        }
        if (this.field2546[arg0][arg1] == null) {
            boolean var3 = this.method2841(arg0, (int[]) null);
            if (!var3) {
                this.method2851(arg0);
                boolean var4 = this.method2841(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method523(this.field2546[arg0][arg1], false);
    }

    @ObfuscatedName("fv.g(IS)[B")
    public byte[] method2850(int arg0) {
        if (this.field2546.length == 1) {
            return this.method2849(0, arg0);
        } else if (this.field2546[arg0].length == 1) {
            return this.method2849(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.o(II)V")
    public void method2851(int arg0) {
    }

    @ObfuscatedName("fv.h(II)[I")
    public int[] method2852(int arg0) {
        return this.field2542[arg0];
    }

    @ObfuscatedName("fv.s(II)I")
    public int method2864(int arg0) {
        return this.field2546[arg0].length;
    }

    @ObfuscatedName("fv.j(I)I")
    public int method2854() {
        return this.field2546.length;
    }

    @ObfuscatedName("fv.m(II)V")
    public void method2896(int arg0) {
        for (int var2 = 0; var2 < this.field2546[arg0].length; var2++) {
            this.field2546[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fv.t(I)V")
    public void method2848() {
        for (int var1 = 0; var1 < this.field2546.length; var1++) {
            if (this.field2546[var1] != null) {
                for (int var2 = 0; var2 < this.field2546[var1].length; var2++) {
                    this.field2546[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fv.z(I[II)Z")
    public boolean method2841(int arg0, int[] arg1) {
        if (this.field2545[arg0] == null) {
            return false;
        }
        int var3 = this.field2541[arg0];
        int[] var4 = this.field2542[arg0];
        Object[] var5 = this.field2546[arg0];
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
            var8 = class117.method523(this.field2545[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2300(arg1, 5, var9.field1835.length);
        } else {
            var8 = class117.method523(this.field2545[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2560(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class111.field1840[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class111.field1840[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class140.method563(var43, var21 + var25 + "," + this.field2539[arg0] + "," + this.field2548);
        }
        if (this.field2550) {
            this.field2545[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class111 var31 = new class111(var10);
            int[] var32 = new int[var3];
            var31.field1834 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2378();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1834 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2378();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2535) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class117.method646(var36[var42], false);
                }
            }
        } else if (this.field2535) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method646(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fv.y(Ljava/lang/String;I)I")
    public int method2912(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2551.method3296(class154.method3037(var2));
    }

    @ObfuscatedName("fv.q(ILjava/lang/String;S)I")
    public int method2853(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2544[arg0].method3296(class154.method3037(var3));
    }

    @ObfuscatedName("fv.d(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2859(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2551.method3296(class154.method3037(var3));
        int var6 = this.field2544[var5].method3296(class154.method3037(var4));
        return this.method2843(var5, var6);
    }

    @ObfuscatedName("fv.b(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2860(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2551.method3296(class154.method3037(var3));
        int var6 = this.field2544[var5].method3296(class154.method3037(var4));
        return this.method2856(var5, var6);
    }

    @ObfuscatedName("fv.x(Ljava/lang/String;B)Z")
    public boolean method2861(String arg0) {
        int var2 = this.method2912("");
        return var2 == -1 ? this.method2860(arg0, "") : this.method2860("", arg0);
    }

    @ObfuscatedName("fv.n(Ljava/lang/String;B)V")
    public void method2862(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2551.method3296(class154.method3037(var2));
        if (var3 >= 0) {
            this.method2842(var3);
        }
    }

    @ObfuscatedName("di.v([BI)[B")
    public static final byte[] method2560(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2176();
        int var3 = var1.method2378();
        if (var3 < 0 || !(field2543 == 0 || var3 <= field2543)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2171(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2378();
            if (var5 < 0 || field2543 != 0 && var5 > field2543) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2128(var6, var5, arg0, var3, 9);
            } else {
                field2547.method2122(var1, var6);
            }
            return var6;
        }
    }
}
