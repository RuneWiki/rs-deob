package deob;

@ObfuscatedName("ev")
public abstract class class145 {

    @ObfuscatedName("ev.y")
    public int field2430;

    @ObfuscatedName("ev.u")
    public int[] field2428;

    @ObfuscatedName("ev.k")
    public int[] field2431;

    @ObfuscatedName("ev.v")
    public class169 field2441;

    @ObfuscatedName("ev.l")
    public int[] field2442;

    @ObfuscatedName("ev.g")
    public int[] field2432;

    @ObfuscatedName("ev.a")
    public int[] field2439;

    @ObfuscatedName("ev.x")
    public int[][] field2434;

    @ObfuscatedName("ev.r")
    public int[][] field2435;

    @ObfuscatedName("ev.w")
    public class169[] field2436;

    @ObfuscatedName("ev.c")
    public Object[] field2437;

    @ObfuscatedName("ev.f")
    public Object[][] field2429;

    @ObfuscatedName("ev.o")
    public static class104 field2427 = new class104();

    @ObfuscatedName("ev.p")
    public int field2440;

    @ObfuscatedName("ev.n")
    public boolean field2444;

    @ObfuscatedName("ev.m")
    public boolean field2433;

    @ObfuscatedName("ev.s")
    public static int field2443 = 0;

    public class145(boolean arg0, boolean arg1) {
        this.field2444 = arg0;
        this.field2433 = arg1;
    }

    @ObfuscatedName("ev.y([BB)V")
    public void method2774(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = Statics.method1299(arg0, 0, var2);
        this.field2440 = var3;
        class107 var4 = new class107(method2039(arg0));
        int var5 = var4.method2109();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2114();
        }
        int var6 = var4.method2109();
        if (var5 >= 7) {
            this.field2430 = var4.method2132();
        } else {
            this.field2430 = var4.method2111();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2428 = new int[this.field2430];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2430; var9++) {
                this.field2428[var9] = var7 += var4.method2132();
                if (this.field2428[var9] > var8) {
                    var8 = this.field2428[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2430; var10++) {
                this.field2428[var10] = var7 += var4.method2111();
                if (this.field2428[var10] > var8) {
                    var8 = this.field2428[var10];
                }
            }
        }
        this.field2442 = new int[var8 + 1];
        this.field2432 = new int[var8 + 1];
        this.field2439 = new int[var8 + 1];
        this.field2434 = new int[var8 + 1][];
        this.field2437 = new Object[var8 + 1];
        this.field2429 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2431 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2430; var11++) {
                this.field2431[this.field2428[var11]] = var4.method2114();
            }
            this.field2441 = new class169(this.field2431);
        }
        for (int var12 = 0; var12 < this.field2430; var12++) {
            this.field2442[this.field2428[var12]] = var4.method2114();
        }
        for (int var13 = 0; var13 < this.field2430; var13++) {
            this.field2432[this.field2428[var13]] = var4.method2114();
        }
        for (int var14 = 0; var14 < this.field2430; var14++) {
            this.field2439[this.field2428[var14]] = var4.method2111();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2430; var15++) {
                int var16 = this.field2428[var15];
                int var17 = this.field2439[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2434[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2434[var16][var20] = var18 += var4.method2132();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2429[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2430; var22++) {
                int var23 = this.field2428[var22];
                int var24 = this.field2439[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2434[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2434[var23][var27] = var25 += var4.method2111();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2429[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2435 = new int[var8 + 1][];
        this.field2436 = new class169[var8 + 1];
        for (int var29 = 0; var29 < this.field2430; var29++) {
            int var30 = this.field2428[var29];
            int var31 = this.field2439[var30];
            this.field2435[var30] = new int[this.field2429[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2435[var30][this.field2434[var30][var32]] = var4.method2114();
            }
            this.field2436[var30] = new class169(this.field2435[var30]);
        }
    }

    @ObfuscatedName("ev.u(IB)V")
    public void method2720(int arg0) {
    }

    @ObfuscatedName("ev.k(III)[B")
    public byte[] method2704(int arg0, int arg1) {
        return this.method2705(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ev.v(II[IB)[B")
    public byte[] method2705(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2429.length || this.field2429[arg0] == null || arg1 < 0 || arg1 >= this.field2429[arg0].length) {
            return null;
        }
        if (this.field2429[arg0][arg1] == null) {
            boolean var4 = this.method2718(arg0, arg2);
            if (!var4) {
                this.method2712(arg0);
                boolean var5 = this.method2718(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method475(this.field2429[arg0][arg1], false);
        if (this.field2433) {
            this.field2429[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ev.l(IIB)Z")
    public boolean method2737(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2429.length || this.field2429[arg0] == null || arg1 < 0 || arg1 >= this.field2429[arg0].length) {
            return false;
        } else if (this.field2429[arg0][arg1] != null) {
            return true;
        } else if (this.field2437[arg0] == null) {
            this.method2712(arg0);
            return this.field2437[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.g(II)Z")
    public boolean method2703(int arg0) {
        if (this.field2437[arg0] == null) {
            this.method2712(arg0);
            return this.field2437[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ev.a(I)Z")
    public boolean method2708() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2428.length; var2++) {
            int var3 = this.field2428[var2];
            if (this.field2437[var3] == null) {
                this.method2712(var3);
                if (this.field2437[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ev.x(IS)[B")
    public byte[] method2733(int arg0) {
        if (this.field2429.length == 1) {
            return this.method2704(0, arg0);
        } else if (this.field2429[arg0].length == 1) {
            return this.method2704(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.r(III)[B")
    public byte[] method2769(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2429.length || this.field2429[arg0] == null || arg1 < 0 || arg1 >= this.field2429[arg0].length) {
            return null;
        }
        if (this.field2429[arg0][arg1] == null) {
            boolean var3 = this.method2718(arg0, (int[]) null);
            if (!var3) {
                this.method2712(arg0);
                boolean var4 = this.method2718(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method475(this.field2429[arg0][arg1], false);
    }

    @ObfuscatedName("ev.w(IB)[B")
    public byte[] method2711(int arg0) {
        if (this.field2429.length == 1) {
            return this.method2769(0, arg0);
        } else if (this.field2429[arg0].length == 1) {
            return this.method2769(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ev.c(II)V")
    public void method2712(int arg0) {
    }

    @ObfuscatedName("ev.f(II)[I")
    public int[] method2713(int arg0) {
        return this.field2434[arg0];
    }

    @ObfuscatedName("ev.o(II)I")
    public int method2714(int arg0) {
        return this.field2429[arg0].length;
    }

    @ObfuscatedName("ev.p(B)I")
    public int method2715() {
        return this.field2429.length;
    }

    @ObfuscatedName("ev.n(II)V")
    public void method2716(int arg0) {
        for (int var2 = 0; var2 < this.field2429[arg0].length; var2++) {
            this.field2429[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ev.m(I)V")
    public void method2717() {
        for (int var1 = 0; var1 < this.field2429.length; var1++) {
            if (this.field2429[var1] != null) {
                for (int var2 = 0; var2 < this.field2429[var1].length; var2++) {
                    this.field2429[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ev.s(I[II)Z")
    public boolean method2718(int arg0, int[] arg1) {
        if (this.field2437[arg0] == null) {
            return false;
        }
        int var3 = this.field2439[arg0];
        int[] var4 = this.field2434[arg0];
        Object[] var5 = this.field2429[arg0];
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
            var8 = class112.method475(this.field2437[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2169(arg1, 5, var9.field1856.length);
        } else {
            var8 = class112.method475(this.field2437[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2039(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = Statics.method1299(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = Statics.method1299(var8, 0, var18);
            throw class135.method2404(var35, var17 + var19 + "," + this.field2442[arg0] + "," + this.field2440);
        }
        if (this.field2444) {
            this.field2437[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class107 var23 = new class107(var10);
            int[] var24 = new int[var3];
            var23.field1854 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2114();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1854 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2114();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2433) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class112.method471(var28[var34], false);
                }
            }
        } else if (this.field2433) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method471(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ev.t(Ljava/lang/String;B)I")
    public int method2771(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2441.method3135(class196.method1852(var2));
    }

    @ObfuscatedName("ev.j(ILjava/lang/String;B)I")
    public int method2754(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2436[arg0].method3135(class196.method1852(var3));
    }

    @ObfuscatedName("ev.b(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2721(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2441.method3135(class196.method1852(var3));
        int var6 = this.field2436[var5].method3135(class196.method1852(var4));
        return this.method2704(var5, var6);
    }

    @ObfuscatedName("ev.i(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2722(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2441.method3135(class196.method1852(var3));
        int var6 = this.field2436[var5].method3135(class196.method1852(var4));
        return this.method2737(var5, var6);
    }

    @ObfuscatedName("ev.h(Ljava/lang/String;I)V")
    public void method2749(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2441.method3135(class196.method1852(var2));
        if (var3 >= 0) {
            this.method2720(var3);
        }
    }

    @ObfuscatedName("cv.q([BI)[B")
    public static final byte[] method2039(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2109();
        int var3 = var1.method2114();
        if (var3 < 0 || !(field2443 == 0 || var3 <= field2443)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2120(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2114();
            if (var5 < 0 || field2443 != 0 && var5 > field2443) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2061(var6, var5, arg0, var3, 9);
            } else {
                field2427.method2056(var1, var6);
            }
            return var6;
        }
    }
}
