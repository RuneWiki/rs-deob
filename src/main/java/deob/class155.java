package deob;

@ObfuscatedName("ea")
public abstract class class155 {

    @ObfuscatedName("ea.e")
    public int field2553;

    @ObfuscatedName("ea.i")
    public int[] field2547;

    @ObfuscatedName("ea.k")
    public int[] field2555;

    @ObfuscatedName("ea.q")
    public class171 field2563;

    @ObfuscatedName("ea.j")
    public int[] field2550;

    @ObfuscatedName("ea.z")
    public int[] field2548;

    @ObfuscatedName("ea.m")
    public int[] field2552;

    @ObfuscatedName("ea.w")
    public int[][] field2546;

    @ObfuscatedName("ea.a")
    public int[][] field2554;

    @ObfuscatedName("ea.d")
    public class171[] field2549;

    @ObfuscatedName("ea.u")
    public Object[] field2556;

    @ObfuscatedName("ea.p")
    public Object[][] field2557;

    @ObfuscatedName("ea.t")
    public static class123 field2558 = new class123();

    @ObfuscatedName("ea.g")
    public int field2559;

    @ObfuscatedName("ea.o")
    public boolean field2560;

    @ObfuscatedName("ea.x")
    public boolean field2561;

    @ObfuscatedName("ea.c")
    public static int field2551 = 0;

    public class155(boolean arg0, boolean arg1) {
        this.field2560 = arg0;
        this.field2561 = arg1;
    }

    @ObfuscatedName("ea.e([BB)V")
    public void method3085(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class128.method2726(arg0, 0, var2);
        this.field2559 = var3;
        class128 var4 = new class128(method12(arg0));
        int var5 = var4.method2548();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2592();
        }
        int var6 = var4.method2548();
        if (var5 >= 7) {
            this.field2553 = var4.method2468();
        } else {
            this.field2553 = var4.method2456();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2547 = new int[this.field2553];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2553; var9++) {
                this.field2547[var9] = var7 += var4.method2468();
                if (this.field2547[var9] > var8) {
                    var8 = this.field2547[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2553; var10++) {
                this.field2547[var10] = var7 += var4.method2456();
                if (this.field2547[var10] > var8) {
                    var8 = this.field2547[var10];
                }
            }
        }
        this.field2550 = new int[var8 + 1];
        this.field2548 = new int[var8 + 1];
        this.field2552 = new int[var8 + 1];
        this.field2546 = new int[var8 + 1][];
        this.field2556 = new Object[var8 + 1];
        this.field2557 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2555 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2553; var11++) {
                this.field2555[this.field2547[var11]] = var4.method2592();
            }
            this.field2563 = new class171(this.field2555);
        }
        for (int var12 = 0; var12 < this.field2553; var12++) {
            this.field2550[this.field2547[var12]] = var4.method2592();
        }
        for (int var13 = 0; var13 < this.field2553; var13++) {
            this.field2548[this.field2547[var13]] = var4.method2592();
        }
        for (int var14 = 0; var14 < this.field2553; var14++) {
            this.field2552[this.field2547[var14]] = var4.method2456();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2553; var15++) {
                int var16 = this.field2547[var15];
                int var17 = this.field2552[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2546[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2546[var16][var20] = var18 += var4.method2468();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2557[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2553; var22++) {
                int var23 = this.field2547[var22];
                int var24 = this.field2552[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2546[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2546[var23][var27] = var25 += var4.method2456();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2557[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2554 = new int[var8 + 1][];
        this.field2549 = new class171[var8 + 1];
        for (int var29 = 0; var29 < this.field2553; var29++) {
            int var30 = this.field2547[var29];
            int var31 = this.field2552[var30];
            this.field2554[var30] = new int[this.field2557[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2554[var30][this.field2546[var30][var32]] = var4.method2592();
            }
            this.field2549[var30] = new class171(this.field2554[var30]);
        }
    }

    @ObfuscatedName("ea.i(IB)V")
    public void method3052(int arg0) {
    }

    @ObfuscatedName("ea.k(IIB)[B")
    public byte[] method3069(int arg0, int arg1) {
        return this.method3074(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ea.q(II[IB)[B")
    public byte[] method3074(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2557.length || this.field2557[arg0] == null || arg1 < 0 || arg1 >= this.field2557[arg0].length) {
            return null;
        }
        if (this.field2557[arg0][arg1] == null) {
            boolean var4 = this.method3034(arg0, arg2);
            if (!var4) {
                this.method3024(arg0);
                boolean var5 = this.method3034(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class120.method2327(this.field2557[arg0][arg1], false);
        if (this.field2561) {
            this.field2557[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ea.j(III)Z")
    public boolean method3022(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2557.length || this.field2557[arg0] == null || arg1 < 0 || arg1 >= this.field2557[arg0].length) {
            return false;
        } else if (this.field2557[arg0][arg1] != null) {
            return true;
        } else if (this.field2556[arg0] == null) {
            this.method3024(arg0);
            return this.field2556[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ea.z(II)Z")
    public boolean method3023(int arg0) {
        if (this.field2556[arg0] == null) {
            this.method3024(arg0);
            return this.field2556[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ea.m(B)Z")
    public boolean method3083() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2547.length; var2++) {
            int var3 = this.field2547[var2];
            if (this.field2556[var3] == null) {
                this.method3024(var3);
                if (this.field2556[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ea.w(II)[B")
    public byte[] method3038(int arg0) {
        if (this.field2557.length == 1) {
            return this.method3069(0, arg0);
        } else if (this.field2557[arg0].length == 1) {
            return this.method3069(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ea.a(III)[B")
    public byte[] method3026(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2557.length || this.field2557[arg0] == null || arg1 < 0 || arg1 >= this.field2557[arg0].length) {
            return null;
        }
        if (this.field2557[arg0][arg1] == null) {
            boolean var3 = this.method3034(arg0, (int[]) null);
            if (!var3) {
                this.method3024(arg0);
                boolean var4 = this.method3034(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class120.method2327(this.field2557[arg0][arg1], false);
    }

    @ObfuscatedName("ea.d(II)[B")
    public byte[] method3027(int arg0) {
        if (this.field2557.length == 1) {
            return this.method3026(0, arg0);
        } else if (this.field2557[arg0].length == 1) {
            return this.method3026(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ea.u(IB)V")
    public void method3024(int arg0) {
    }

    @ObfuscatedName("ea.p(II)[I")
    public int[] method3029(int arg0) {
        return this.field2546[arg0];
    }

    @ObfuscatedName("ea.t(IB)I")
    public int method3019(int arg0) {
        return this.field2557[arg0].length;
    }

    @ObfuscatedName("ea.g(I)I")
    public int method3031() {
        return this.field2557.length;
    }

    @ObfuscatedName("ea.o(IB)V")
    public void method3032(int arg0) {
        for (int var2 = 0; var2 < this.field2557[arg0].length; var2++) {
            this.field2557[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ea.x(I)V")
    public void method3033() {
        for (int var1 = 0; var1 < this.field2557.length; var1++) {
            if (this.field2557[var1] != null) {
                for (int var2 = 0; var2 < this.field2557[var1].length; var2++) {
                    this.field2557[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ea.c(I[IB)Z")
    public boolean method3034(int arg0, int[] arg1) {
        if (this.field2556[arg0] == null) {
            return false;
        }
        int var3 = this.field2552[arg0];
        int[] var4 = this.field2546[arg0];
        Object[] var5 = this.field2557[arg0];
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
            var8 = class120.method2327(this.field2556[arg0], true);
            class128 var9 = new class128(var8);
            var9.method2571(arg1, 5, var9.field2043.length);
        } else {
            var8 = class120.method2327(this.field2556[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method12(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class128.method2726(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class128.method2726(var8, 0, var17);
            throw class81.method590(var34, var16 + var18 + "," + this.field2550[arg0] + "," + this.field2559);
        }
        if (this.field2560) {
            this.field2556[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class128 var22 = new class128(var10);
            int[] var23 = new int[var3];
            var22.field2045 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2592();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2045 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2592();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2561) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class120.method2131(var27[var33], false);
                }
            }
        } else if (this.field2561) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class120.method2131(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ea.b(Ljava/lang/String;B)I")
    public int method3035(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2563.method3259(class150.method754(var2));
    }

    @ObfuscatedName("ea.f(ILjava/lang/String;B)I")
    public int method3036(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2549[arg0].method3259(class150.method754(var3));
    }

    @ObfuscatedName("ea.s(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3064(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2563.method3259(class150.method754(var3));
        int var6 = this.field2549[var5].method3259(class150.method754(var4));
        return this.method3069(var5, var6);
    }

    @ObfuscatedName("ea.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3017(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2563.method3259(class150.method754(var3));
        int var6 = this.field2549[var5].method3259(class150.method754(var4));
        return this.method3022(var5, var6);
    }

    @ObfuscatedName("ea.r(Ljava/lang/String;B)V")
    public void method3039(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2563.method3259(class150.method754(var2));
        if (var3 >= 0) {
            this.method3052(var3);
        }
    }

    @ObfuscatedName("i.l([BB)[B")
    public static final byte[] method12(byte[] arg0) {
        class128 var1 = new class128(arg0);
        int var2 = var1.method2548();
        int var3 = var1.method2592();
        if (var3 < 0 || !(field2551 == 0 || var3 <= field2551)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2465(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2592();
            if (var5 < 0 || field2551 != 0 && var5 > field2551) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class124.method2406(var6, var5, arg0, var3, 9);
            } else {
                field2558.method2401(var1, var6);
            }
            return var6;
        }
    }
}
