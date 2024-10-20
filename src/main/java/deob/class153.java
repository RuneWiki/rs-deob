package deob;

@ObfuscatedName("ey")
public abstract class class153 {

    @ObfuscatedName("ey.q")
    public int field2543;

    @ObfuscatedName("ey.c")
    public int[] field2533;

    @ObfuscatedName("ey.p")
    public int[] field2550;

    @ObfuscatedName("ey.z")
    public class169 field2535;

    @ObfuscatedName("ey.m")
    public int[] field2536;

    @ObfuscatedName("ey.k")
    public int[] field2541;

    @ObfuscatedName("ey.v")
    public int[] field2538;

    @ObfuscatedName("ey.y")
    public int[][] field2539;

    @ObfuscatedName("ey.d")
    public int[][] field2546;

    @ObfuscatedName("ey.l")
    public class169[] field2547;

    @ObfuscatedName("ey.h")
    public Object[] field2542;

    @ObfuscatedName("ey.b")
    public Object[][] field2537;

    @ObfuscatedName("ey.r")
    public static class122 field2544 = new class122();

    @ObfuscatedName("ey.t")
    public int field2545;

    @ObfuscatedName("ey.u")
    public boolean field2532;

    @ObfuscatedName("ey.g")
    public boolean field2540;

    @ObfuscatedName("ey.e")
    public static int field2548 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2532 = arg0;
        this.field2540 = arg1;
    }

    @ObfuscatedName("ey.q([BB)V")
    public void method2986(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class127.field2040[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2545 = var5;
        class127 var8 = new class127(method203(arg0));
        int var9 = var8.method2534();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2430();
        }
        int var10 = var8.method2534();
        if (var9 >= 7) {
            this.field2543 = var8.method2439();
        } else {
            this.field2543 = var8.method2427();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2533 = new int[this.field2543];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2543; var13++) {
                this.field2533[var13] = var11 += var8.method2439();
                if (this.field2533[var13] > var12) {
                    var12 = this.field2533[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2543; var14++) {
                this.field2533[var14] = var11 += var8.method2427();
                if (this.field2533[var14] > var12) {
                    var12 = this.field2533[var14];
                }
            }
        }
        this.field2536 = new int[var12 + 1];
        this.field2541 = new int[var12 + 1];
        this.field2538 = new int[var12 + 1];
        this.field2539 = new int[var12 + 1][];
        this.field2542 = new Object[var12 + 1];
        this.field2537 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2550 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2543; var15++) {
                this.field2550[this.field2533[var15]] = var8.method2430();
            }
            this.field2535 = new class169(this.field2550);
        }
        for (int var16 = 0; var16 < this.field2543; var16++) {
            this.field2536[this.field2533[var16]] = var8.method2430();
        }
        for (int var17 = 0; var17 < this.field2543; var17++) {
            this.field2541[this.field2533[var17]] = var8.method2430();
        }
        for (int var18 = 0; var18 < this.field2543; var18++) {
            this.field2538[this.field2533[var18]] = var8.method2427();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2543; var19++) {
                int var20 = this.field2533[var19];
                int var21 = this.field2538[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2539[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2539[var20][var24] = var22 += var8.method2439();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2537[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2543; var26++) {
                int var27 = this.field2533[var26];
                int var28 = this.field2538[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2539[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2539[var27][var31] = var29 += var8.method2427();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2537[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2546 = new int[var12 + 1][];
        this.field2547 = new class169[var12 + 1];
        for (int var33 = 0; var33 < this.field2543; var33++) {
            int var34 = this.field2533[var33];
            int var35 = this.field2538[var34];
            this.field2546[var34] = new int[this.field2537[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2546[var34][this.field2539[var34][var36]] = var8.method2430();
            }
            this.field2547[var34] = new class169(this.field2546[var34]);
        }
    }

    @ObfuscatedName("ey.c(II)V")
    public void method2951(int arg0) {
    }

    @ObfuscatedName("ey.p(III)[B")
    public byte[] method2952(int arg0, int arg1) {
        return this.method2953(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ey.z(II[II)[B")
    public byte[] method2953(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2537.length || this.field2537[arg0] == null || arg1 < 0 || arg1 >= this.field2537[arg0].length) {
            return null;
        }
        if (this.field2537[arg0][arg1] == null) {
            boolean var4 = this.method2966(arg0, arg2);
            if (!var4) {
                this.method3006(arg0);
                boolean var5 = this.method2966(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method213(this.field2537[arg0][arg1], false);
        if (this.field2540) {
            this.field2537[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ey.m(IIB)Z")
    public boolean method2971(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2537.length || this.field2537[arg0] == null || arg1 < 0 || arg1 >= this.field2537[arg0].length) {
            return false;
        } else if (this.field2537[arg0][arg1] != null) {
            return true;
        } else if (this.field2542[arg0] == null) {
            this.method3006(arg0);
            return this.field2542[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.k(IB)Z")
    public boolean method2955(int arg0) {
        if (this.field2542[arg0] == null) {
            this.method3006(arg0);
            return this.field2542[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ey.v(I)Z")
    public boolean method2997() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2533.length; var2++) {
            int var3 = this.field2533[var2];
            if (this.field2542[var3] == null) {
                this.method3006(var3);
                if (this.field2542[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ey.y(II)[B")
    public byte[] method2989(int arg0) {
        if (this.field2537.length == 1) {
            return this.method2952(0, arg0);
        } else if (this.field2537[arg0].length == 1) {
            return this.method2952(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.d(IIS)[B")
    public byte[] method2958(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2537.length || this.field2537[arg0] == null || arg1 < 0 || arg1 >= this.field2537[arg0].length) {
            return null;
        }
        if (this.field2537[arg0][arg1] == null) {
            boolean var3 = this.method2966(arg0, (int[]) null);
            if (!var3) {
                this.method3006(arg0);
                boolean var4 = this.method2966(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method213(this.field2537[arg0][arg1], false);
    }

    @ObfuscatedName("ey.l(IS)[B")
    public byte[] method2959(int arg0) {
        if (this.field2537.length == 1) {
            return this.method2958(0, arg0);
        } else if (this.field2537[arg0].length == 1) {
            return this.method2958(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ey.h(II)V")
    public void method3006(int arg0) {
    }

    @ObfuscatedName("ey.b(II)[I")
    public int[] method2964(int arg0) {
        return this.field2539[arg0];
    }

    @ObfuscatedName("ey.r(II)I")
    public int method2962(int arg0) {
        return this.field2537[arg0].length;
    }

    @ObfuscatedName("ey.t(B)I")
    public int method2963() {
        return this.field2537.length;
    }

    @ObfuscatedName("ey.u(II)V")
    public void method3010(int arg0) {
        for (int var2 = 0; var2 < this.field2537[arg0].length; var2++) {
            this.field2537[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ey.g(I)V")
    public void method2984() {
        for (int var1 = 0; var1 < this.field2537.length; var1++) {
            if (this.field2537[var1] != null) {
                for (int var2 = 0; var2 < this.field2537[var1].length; var2++) {
                    this.field2537[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ey.e(I[IS)Z")
    public boolean method2966(int arg0, int[] arg1) {
        if (this.field2542[arg0] == null) {
            return false;
        }
        int var3 = this.field2538[arg0];
        int[] var4 = this.field2539[arg0];
        Object[] var5 = this.field2537[arg0];
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
            var8 = class119.method213(this.field2542[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2442(arg1, 5, var9.field2042.length);
        } else {
            var8 = class119.method213(this.field2542[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method203(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class127.field2040[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class127.field2040[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class80.method2406(var43, var21 + var25 + "," + this.field2536[arg0] + "," + this.field2545);
        }
        if (this.field2532) {
            this.field2542[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class127 var31 = new class127(var10);
            int[] var32 = new int[var3];
            var31.field2039 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2430();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2039 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2430();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2540) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class119.method237(var36[var42], false);
                }
            }
        } else if (this.field2540) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method237(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ey.n(Ljava/lang/String;B)I")
    public int method2967(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2535.method3211(class148.method2023(var2));
    }

    @ObfuscatedName("ey.o(ILjava/lang/String;I)I")
    public int method2968(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2547[arg0].method3211(class148.method2023(var3));
    }

    @ObfuscatedName("ey.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3001(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2535.method3211(class148.method2023(var3));
        int var6 = this.field2547[var5].method3211(class148.method2023(var4));
        return this.method2952(var5, var6);
    }

    @ObfuscatedName("ey.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2973(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2535.method3211(class148.method2023(var3));
        int var6 = this.field2547[var5].method3211(class148.method2023(var4));
        return this.method2971(var5, var6);
    }

    @ObfuscatedName("ey.s(Ljava/lang/String;I)V")
    public void method2969(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2535.method3211(class148.method2023(var2));
        if (var3 >= 0) {
            this.method2951(var3);
        }
    }

    @ObfuscatedName("w.w([BI)[B")
    public static final byte[] method203(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2534();
        int var3 = var1.method2430();
        if (var3 < 0 || !(field2548 == 0 || var3 <= field2548)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2532(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2430();
            if (var5 < 0 || field2548 != 0 && var5 > field2548) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2364(var6, var5, arg0, var3, 9);
            } else {
                field2544.method2358(var1, var6);
            }
            return var6;
        }
    }
}
