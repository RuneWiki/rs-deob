package deob;

@ObfuscatedName("eh")
public abstract class class153 {

    @ObfuscatedName("eh.p")
    public int field2538;

    @ObfuscatedName("eh.l")
    public int[] field2525;

    @ObfuscatedName("eh.d")
    public int[] field2529;

    @ObfuscatedName("eh.x")
    public class169 field2527;

    @ObfuscatedName("eh.o")
    public int[] field2528;

    @ObfuscatedName("eh.a")
    public int[] field2536;

    @ObfuscatedName("eh.w")
    public int[] field2530;

    @ObfuscatedName("eh.i")
    public int[][] field2531;

    @ObfuscatedName("eh.y")
    public int[][] field2532;

    @ObfuscatedName("eh.m")
    public class169[] field2533;

    @ObfuscatedName("eh.u")
    public Object[] field2539;

    @ObfuscatedName("eh.s")
    public Object[][] field2534;

    @ObfuscatedName("eh.e")
    public static class122 field2524 = new class122();

    @ObfuscatedName("eh.r")
    public int field2537;

    @ObfuscatedName("eh.n")
    public boolean field2535;

    @ObfuscatedName("eh.g")
    public boolean field2526;

    @ObfuscatedName("eh.c")
    public static int field2540 = 0;

    public class153(boolean arg0, boolean arg1) {
        this.field2535 = arg0;
        this.field2526 = arg1;
    }

    @ObfuscatedName("eh.p([BB)V")
    public void method3076(byte[] arg0) {
        this.field2537 = class127.method134(arg0, arg0.length);
        class127 var2 = new class127(method244(arg0));
        int var3 = var2.method2498();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2489();
        }
        int var4 = var2.method2498();
        if (var3 >= 7) {
            this.field2538 = var2.method2512();
        } else {
            this.field2538 = var2.method2581();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2525 = new int[this.field2538];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2538; var7++) {
                this.field2525[var7] = var5 += var2.method2512();
                if (this.field2525[var7] > var6) {
                    var6 = this.field2525[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2538; var8++) {
                this.field2525[var8] = var5 += var2.method2581();
                if (this.field2525[var8] > var6) {
                    var6 = this.field2525[var8];
                }
            }
        }
        this.field2528 = new int[var6 + 1];
        this.field2536 = new int[var6 + 1];
        this.field2530 = new int[var6 + 1];
        this.field2531 = new int[var6 + 1][];
        this.field2539 = new Object[var6 + 1];
        this.field2534 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2529 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2538; var9++) {
                this.field2529[this.field2525[var9]] = var2.method2489();
            }
            this.field2527 = new class169(this.field2529);
        }
        for (int var10 = 0; var10 < this.field2538; var10++) {
            this.field2528[this.field2525[var10]] = var2.method2489();
        }
        for (int var11 = 0; var11 < this.field2538; var11++) {
            this.field2536[this.field2525[var11]] = var2.method2489();
        }
        for (int var12 = 0; var12 < this.field2538; var12++) {
            this.field2530[this.field2525[var12]] = var2.method2581();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2538; var13++) {
                int var14 = this.field2525[var13];
                int var15 = this.field2530[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2531[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2531[var14][var18] = var16 += var2.method2512();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2534[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2538; var20++) {
                int var21 = this.field2525[var20];
                int var22 = this.field2530[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2531[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2531[var21][var25] = var23 += var2.method2581();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2534[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2532 = new int[var6 + 1][];
        this.field2533 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2538; var27++) {
            int var28 = this.field2525[var27];
            int var29 = this.field2530[var28];
            this.field2532[var28] = new int[this.field2534[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2532[var28][this.field2531[var28][var30]] = var2.method2489();
            }
            this.field2533[var28] = new class169(this.field2532[var28]);
        }
    }

    @ObfuscatedName("eh.l(II)V")
    public void method3146(int arg0) {
    }

    @ObfuscatedName("eh.d(III)[B")
    public byte[] method3078(int arg0, int arg1) {
        return this.method3079(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eh.x(II[II)[B")
    public byte[] method3079(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2534.length || this.field2534[arg0] == null || arg1 < 0 || arg1 >= this.field2534[arg0].length) {
            return null;
        }
        if (this.field2534[arg0][arg1] == null) {
            boolean var4 = this.method3092(arg0, arg2);
            if (!var4) {
                this.method3086(arg0);
                boolean var5 = this.method3092(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method2243(this.field2534[arg0][arg1], false);
        if (this.field2526) {
            this.field2534[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eh.o(IIB)Z")
    public boolean method3080(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2534.length || this.field2534[arg0] == null || arg1 < 0 || arg1 >= this.field2534[arg0].length) {
            return false;
        } else if (this.field2534[arg0][arg1] != null) {
            return true;
        } else if (this.field2539[arg0] == null) {
            this.method3086(arg0);
            return this.field2539[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.a(IS)Z")
    public boolean method3081(int arg0) {
        if (this.field2539[arg0] == null) {
            this.method3086(arg0);
            return this.field2539[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.w(B)Z")
    public boolean method3082() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2525.length; var2++) {
            int var3 = this.field2525[var2];
            if (this.field2539[var3] == null) {
                this.method3086(var3);
                if (this.field2539[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eh.i(II)[B")
    public byte[] method3083(int arg0) {
        if (this.field2534.length == 1) {
            return this.method3078(0, arg0);
        } else if (this.field2534[arg0].length == 1) {
            return this.method3078(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.y(III)[B")
    public byte[] method3150(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2534.length || this.field2534[arg0] == null || arg1 < 0 || arg1 >= this.field2534[arg0].length) {
            return null;
        }
        if (this.field2534[arg0][arg1] == null) {
            boolean var3 = this.method3092(arg0, (int[]) null);
            if (!var3) {
                this.method3086(arg0);
                boolean var4 = this.method3092(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method2243(this.field2534[arg0][arg1], false);
    }

    @ObfuscatedName("eh.m(II)[B")
    public byte[] method3085(int arg0) {
        if (this.field2534.length == 1) {
            return this.method3150(0, arg0);
        } else if (this.field2534[arg0].length == 1) {
            return this.method3150(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.u(IB)V")
    public void method3086(int arg0) {
    }

    @ObfuscatedName("eh.s(II)[I")
    public int[] method3087(int arg0) {
        return this.field2531[arg0];
    }

    @ObfuscatedName("eh.e(II)I")
    public int method3117(int arg0) {
        return this.field2534[arg0].length;
    }

    @ObfuscatedName("eh.r(B)I")
    public int method3099() {
        return this.field2534.length;
    }

    @ObfuscatedName("eh.n(II)V")
    public void method3077(int arg0) {
        for (int var2 = 0; var2 < this.field2534[arg0].length; var2++) {
            this.field2534[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eh.g(B)V")
    public void method3091() {
        for (int var1 = 0; var1 < this.field2534.length; var1++) {
            if (this.field2534[var1] != null) {
                for (int var2 = 0; var2 < this.field2534[var1].length; var2++) {
                    this.field2534[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eh.c(I[II)Z")
    public boolean method3092(int arg0, int[] arg1) {
        if (this.field2539[arg0] == null) {
            return false;
        }
        int var3 = this.field2530[arg0];
        int[] var4 = this.field2531[arg0];
        Object[] var5 = this.field2534[arg0];
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
            var8 = class119.method2243(this.field2539[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2515(arg1, 5, var9.field2036.length);
        } else {
            var8 = class119.method2243(this.field2539[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method244(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class127.field2031[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class127.field2031[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class80.method791(var43, var21 + var25 + "," + this.field2528[arg0] + "," + this.field2537);
        }
        if (this.field2535) {
            this.field2539[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class127 var31 = new class127(var10);
            int[] var32 = new int[var3];
            var31.field2030 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2489();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2030 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2489();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2526) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class119.method1425(var36[var42], false);
                }
            }
        } else if (this.field2526) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method1425(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eh.v(Ljava/lang/String;I)I")
    public int method3093(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2527.method3352(class148.method740(var2));
    }

    @ObfuscatedName("eh.b(ILjava/lang/String;I)I")
    public int method3094(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2533[arg0].method3352(class148.method740(var3));
    }

    @ObfuscatedName("eh.k(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3095(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2527.method3352(class148.method740(var3));
        int var6 = this.field2533[var5].method3352(class148.method740(var4));
        return this.method3078(var5, var6);
    }

    @ObfuscatedName("eh.t(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3096(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2527.method3352(class148.method740(var3));
        int var6 = this.field2533[var5].method3352(class148.method740(var4));
        return this.method3080(var5, var6);
    }

    @ObfuscatedName("eh.f(Ljava/lang/String;I)V")
    public void method3108(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2527.method3352(class148.method740(var2));
        if (var3 >= 0) {
            this.method3146(var3);
        }
    }

    @ObfuscatedName("af.h([BI)[B")
    public static final byte[] method244(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2498();
        int var3 = var1.method2489();
        if (var3 < 0 || !(field2540 == 0 || var3 <= field2540)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2504(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2489();
            if (var5 < 0 || field2540 != 0 && var5 > field2540) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2467(var6, var5, arg0, var3, 9);
            } else {
                field2524.method2439(var1, var6);
            }
            return var6;
        }
    }
}
