package deob;

@ObfuscatedName("en")
public abstract class class151 {

    @ObfuscatedName("en.p")
    public int field2478;

    @ObfuscatedName("en.y")
    public int[] field2482;

    @ObfuscatedName("en.d")
    public int[] field2479;

    @ObfuscatedName("en.c")
    public class175 field2470;

    @ObfuscatedName("en.r")
    public int[] field2471;

    @ObfuscatedName("en.f")
    public int[] field2474;

    @ObfuscatedName("en.z")
    public int[] field2473;

    @ObfuscatedName("en.o")
    public int[][] field2476;

    @ObfuscatedName("en.k")
    public int[][] field2475;

    @ObfuscatedName("en.s")
    public class175[] field2468;

    @ObfuscatedName("en.h")
    public Object[] field2477;

    @ObfuscatedName("en.m")
    public Object[][] field2469;

    @ObfuscatedName("en.w")
    public static class107 field2467 = new class107();

    @ObfuscatedName("en.q")
    public int field2480;

    @ObfuscatedName("en.u")
    public boolean field2481;

    @ObfuscatedName("en.e")
    public boolean field2485;

    @ObfuscatedName("en.b")
    public static int field2483 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2481 = arg0;
        this.field2485 = arg1;
    }

    @ObfuscatedName("en.p([BB)V")
    public void method2745(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class110.method597(arg0, 0, var2);
        this.field2480 = var3;
        class110 var4 = new class110(method80(arg0));
        int var5 = var4.method2309();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2164();
        }
        int var6 = var4.method2309();
        if (var5 >= 7) {
            this.field2478 = var4.method2138();
        } else {
            this.field2478 = var4.method2243();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2482 = new int[this.field2478];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2478; var9++) {
                this.field2482[var9] = var7 += var4.method2138();
                if (this.field2482[var9] > var8) {
                    var8 = this.field2482[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2478; var10++) {
                this.field2482[var10] = var7 += var4.method2243();
                if (this.field2482[var10] > var8) {
                    var8 = this.field2482[var10];
                }
            }
        }
        this.field2471 = new int[var8 + 1];
        this.field2474 = new int[var8 + 1];
        this.field2473 = new int[var8 + 1];
        this.field2476 = new int[var8 + 1][];
        this.field2477 = new Object[var8 + 1];
        this.field2469 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2479 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2478; var11++) {
                this.field2479[this.field2482[var11]] = var4.method2164();
            }
            this.field2470 = new class175(this.field2479);
        }
        for (int var12 = 0; var12 < this.field2478; var12++) {
            this.field2471[this.field2482[var12]] = var4.method2164();
        }
        for (int var13 = 0; var13 < this.field2478; var13++) {
            this.field2474[this.field2482[var13]] = var4.method2164();
        }
        for (int var14 = 0; var14 < this.field2478; var14++) {
            this.field2473[this.field2482[var14]] = var4.method2243();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2478; var15++) {
                int var16 = this.field2482[var15];
                int var17 = this.field2473[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2476[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2476[var16][var20] = var18 += var4.method2138();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2469[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2478; var22++) {
                int var23 = this.field2482[var22];
                int var24 = this.field2473[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2476[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2476[var23][var27] = var25 += var4.method2243();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2469[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2475 = new int[var8 + 1][];
        this.field2468 = new class175[var8 + 1];
        for (int var29 = 0; var29 < this.field2478; var29++) {
            int var30 = this.field2482[var29];
            int var31 = this.field2473[var30];
            this.field2475[var30] = new int[this.field2469[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2475[var30][this.field2476[var30][var32]] = var4.method2164();
            }
            this.field2468[var30] = new class175(this.field2475[var30]);
        }
    }

    @ObfuscatedName("en.y(II)V")
    public void method2746(int arg0) {
    }

    @ObfuscatedName("en.d(III)[B")
    public byte[] method2811(int arg0, int arg1) {
        return this.method2748(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("en.c(II[II)[B")
    public byte[] method2748(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return null;
        }
        if (this.field2469[arg0][arg1] == null) {
            boolean var4 = this.method2761(arg0, arg2);
            if (!var4) {
                this.method2771(arg0);
                boolean var5 = this.method2761(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class116.method557(this.field2469[arg0][arg1], false);
        if (this.field2485) {
            this.field2469[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("en.r(IIB)Z")
    public boolean method2783(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return false;
        } else if (this.field2469[arg0][arg1] != null) {
            return true;
        } else if (this.field2477[arg0] == null) {
            this.method2771(arg0);
            return this.field2477[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("en.f(II)Z")
    public boolean method2821(int arg0) {
        if (this.field2477[arg0] == null) {
            this.method2771(arg0);
            return this.field2477[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("en.z(B)Z")
    public boolean method2808() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2482.length; var2++) {
            int var3 = this.field2482[var2];
            if (this.field2477[var3] == null) {
                this.method2771(var3);
                if (this.field2477[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("en.o(II)[B")
    public byte[] method2803(int arg0) {
        if (this.field2469.length == 1) {
            return this.method2811(0, arg0);
        } else if (this.field2469[arg0].length == 1) {
            return this.method2811(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("en.k(III)[B")
    public byte[] method2753(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2469.length || this.field2469[arg0] == null || arg1 < 0 || arg1 >= this.field2469[arg0].length) {
            return null;
        }
        if (this.field2469[arg0][arg1] == null) {
            boolean var3 = this.method2761(arg0, (int[]) null);
            if (!var3) {
                this.method2771(arg0);
                boolean var4 = this.method2761(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class116.method557(this.field2469[arg0][arg1], false);
    }

    @ObfuscatedName("en.s(IB)[B")
    public byte[] method2755(int arg0) {
        if (this.field2469.length == 1) {
            return this.method2753(0, arg0);
        } else if (this.field2469[arg0].length == 1) {
            return this.method2753(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("en.h(IB)V")
    public void method2771(int arg0) {
    }

    @ObfuscatedName("en.m(IB)[I")
    public int[] method2756(int arg0) {
        return this.field2476[arg0];
    }

    @ObfuscatedName("en.w(IB)I")
    public int method2757(int arg0) {
        return this.field2469[arg0].length;
    }

    @ObfuscatedName("en.q(I)I")
    public int method2758() {
        return this.field2469.length;
    }

    @ObfuscatedName("en.u(II)V")
    public void method2759(int arg0) {
        for (int var2 = 0; var2 < this.field2469[arg0].length; var2++) {
            this.field2469[arg0][var2] = null;
        }
    }

    @ObfuscatedName("en.e(I)V")
    public void method2760() {
        for (int var1 = 0; var1 < this.field2469.length; var1++) {
            if (this.field2469[var1] != null) {
                for (int var2 = 0; var2 < this.field2469[var1].length; var2++) {
                    this.field2469[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("en.b(I[IB)Z")
    public boolean method2761(int arg0, int[] arg1) {
        if (this.field2477[arg0] == null) {
            return false;
        }
        int var3 = this.field2473[arg0];
        int[] var4 = this.field2476[arg0];
        Object[] var5 = this.field2469[arg0];
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
            var8 = class116.method557(this.field2477[arg0], true);
            class110 var9 = new class110(var8);
            var9.method2141(arg1, 5, var9.field1844.length);
        } else {
            var8 = class116.method557(this.field2477[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method80(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class110.method597(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class110.method597(var8, 0, var18);
            throw class139.method2478(var35, var17 + var19 + "," + this.field2471[arg0] + "," + this.field2480);
        }
        if (this.field2481) {
            this.field2477[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class110 var23 = new class110(var10);
            int[] var24 = new int[var3];
            var23.field1842 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2164();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1842 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2164();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2485) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class116.method405(var28[var34], false);
                }
            }
        } else if (this.field2485) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class116.method405(var10, false);
        }
        return true;
    }

    @ObfuscatedName("en.g(Ljava/lang/String;I)I")
    public int method2762(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2470.method3188(class213.method3373(var2));
    }

    @ObfuscatedName("en.j(ILjava/lang/String;I)I")
    public int method2763(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2468[arg0].method3188(class213.method3373(var3));
    }

    @ObfuscatedName("en.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2764(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2470.method3188(class213.method3373(var3));
        int var6 = this.field2468[var5].method3188(class213.method3373(var4));
        return this.method2811(var5, var6);
    }

    @ObfuscatedName("en.x(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2782(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2470.method3188(class213.method3373(var3));
        int var6 = this.field2468[var5].method3188(class213.method3373(var4));
        return this.method2783(var5, var6);
    }

    @ObfuscatedName("en.n(Ljava/lang/String;I)Z")
    public boolean method2814(String arg0) {
        int var2 = this.method2762("");
        return var2 == -1 ? this.method2782(arg0, "") : this.method2782("", arg0);
    }

    @ObfuscatedName("en.v(Ljava/lang/String;I)V")
    public void method2767(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2470.method3188(class213.method3373(var2));
        if (var3 >= 0) {
            this.method2746(var3);
        }
    }

    @ObfuscatedName("f.l([BB)[B")
    public static final byte[] method80(byte[] arg0) {
        class110 var1 = new class110(arg0);
        int var2 = var1.method2309();
        int var3 = var1.method2164();
        if (var3 < 0 || !(field2483 == 0 || var3 <= field2483)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2225(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2164();
            if (var5 < 0 || field2483 != 0 && var5 > field2483) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class108.method2077(var6, var5, arg0, var3, 9);
            } else {
                field2467.method2072(var1, var6);
            }
            return var6;
        }
    }
}
