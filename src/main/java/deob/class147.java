package deob;

@ObfuscatedName("ei")
public abstract class class147 {

    @ObfuscatedName("ei.k")
    public int field2468;

    @ObfuscatedName("ei.y")
    public int[] field2464;

    @ObfuscatedName("ei.s")
    public int[] field2474;

    @ObfuscatedName("ei.g")
    public class171 field2466;

    @ObfuscatedName("ei.h")
    public int[] field2467;

    @ObfuscatedName("ei.l")
    public int[] field2470;

    @ObfuscatedName("ei.e")
    public int[] field2469;

    @ObfuscatedName("ei.u")
    public int[][] field2477;

    @ObfuscatedName("ei.j")
    public int[][] field2471;

    @ObfuscatedName("ei.c")
    public class171[] field2465;

    @ObfuscatedName("ei.d")
    public Object[] field2473;

    @ObfuscatedName("ei.v")
    public Object[][] field2463;

    @ObfuscatedName("ei.n")
    public static class104 field2475 = new class104();

    @ObfuscatedName("ei.z")
    public int field2476;

    @ObfuscatedName("ei.a")
    public boolean field2472;

    @ObfuscatedName("ei.t")
    public boolean field2478;

    @ObfuscatedName("ei.p")
    public static int field2479 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2472 = arg0;
        this.field2478 = arg1;
    }

    @ObfuscatedName("ei.k([BI)V")
    public void method2775(byte[] arg0) {
        this.field2476 = class107.method3195(arg0, arg0.length);
        class107 var2 = new class107(method2530(arg0));
        int var3 = var2.method2138();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2143();
        }
        int var4 = var2.method2138();
        if (var3 >= 7) {
            this.field2468 = var2.method2152();
        } else {
            this.field2468 = var2.method2239();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2464 = new int[this.field2468];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2468; var7++) {
                this.field2464[var7] = var5 += var2.method2152();
                if (this.field2464[var7] > var6) {
                    var6 = this.field2464[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2468; var8++) {
                this.field2464[var8] = var5 += var2.method2239();
                if (this.field2464[var8] > var6) {
                    var6 = this.field2464[var8];
                }
            }
        }
        this.field2467 = new int[var6 + 1];
        this.field2470 = new int[var6 + 1];
        this.field2469 = new int[var6 + 1];
        this.field2477 = new int[var6 + 1][];
        this.field2473 = new Object[var6 + 1];
        this.field2463 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2474 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2468; var9++) {
                this.field2474[this.field2464[var9]] = var2.method2143();
            }
            this.field2466 = new class171(this.field2474);
        }
        for (int var10 = 0; var10 < this.field2468; var10++) {
            this.field2467[this.field2464[var10]] = var2.method2143();
        }
        for (int var11 = 0; var11 < this.field2468; var11++) {
            this.field2470[this.field2464[var11]] = var2.method2143();
        }
        for (int var12 = 0; var12 < this.field2468; var12++) {
            this.field2469[this.field2464[var12]] = var2.method2239();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2468; var13++) {
                int var14 = this.field2464[var13];
                int var15 = this.field2469[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2477[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2477[var14][var18] = var16 += var2.method2152();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2463[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2468; var20++) {
                int var21 = this.field2464[var20];
                int var22 = this.field2469[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2477[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2477[var21][var25] = var23 += var2.method2239();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2463[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2471 = new int[var6 + 1][];
        this.field2465 = new class171[var6 + 1];
        for (int var27 = 0; var27 < this.field2468; var27++) {
            int var28 = this.field2464[var27];
            int var29 = this.field2469[var28];
            this.field2471[var28] = new int[this.field2463[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2471[var28][this.field2477[var28][var30]] = var2.method2143();
            }
            this.field2465[var28] = new class171(this.field2471[var28]);
        }
    }

    @ObfuscatedName("ei.y(II)V")
    public void method2791(int arg0) {
    }

    @ObfuscatedName("ei.s(III)[B")
    public byte[] method2729(int arg0, int arg1) {
        return this.method2785(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ei.g(II[II)[B")
    public byte[] method2785(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2463.length || this.field2463[arg0] == null || arg1 < 0 || arg1 >= this.field2463[arg0].length) {
            return null;
        }
        if (this.field2463[arg0][arg1] == null) {
            boolean var4 = this.method2742(arg0, arg2);
            if (!var4) {
                this.method2737(arg0);
                boolean var5 = this.method2742(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method533(this.field2463[arg0][arg1], false);
        if (this.field2478) {
            this.field2463[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ei.h(III)Z")
    public boolean method2731(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2463.length || this.field2463[arg0] == null || arg1 < 0 || arg1 >= this.field2463[arg0].length) {
            return false;
        } else if (this.field2463[arg0][arg1] != null) {
            return true;
        } else if (this.field2473[arg0] == null) {
            this.method2737(arg0);
            return this.field2473[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ei.l(II)Z")
    public boolean method2732(int arg0) {
        if (this.field2473[arg0] == null) {
            this.method2737(arg0);
            return this.field2473[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ei.e(B)Z")
    public boolean method2733() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2464.length; var2++) {
            int var3 = this.field2464[var2];
            if (this.field2473[var3] == null) {
                this.method2737(var3);
                if (this.field2473[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ei.u(II)[B")
    public byte[] method2734(int arg0) {
        if (this.field2463.length == 1) {
            return this.method2729(0, arg0);
        } else if (this.field2463[arg0].length == 1) {
            return this.method2729(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ei.j(III)[B")
    public byte[] method2735(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2463.length || this.field2463[arg0] == null || arg1 < 0 || arg1 >= this.field2463[arg0].length) {
            return null;
        }
        if (this.field2463[arg0][arg1] == null) {
            boolean var3 = this.method2742(arg0, (int[]) null);
            if (!var3) {
                this.method2737(arg0);
                boolean var4 = this.method2742(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method533(this.field2463[arg0][arg1], false);
    }

    @ObfuscatedName("ei.c(II)[B")
    public byte[] method2805(int arg0) {
        if (this.field2463.length == 1) {
            return this.method2735(0, arg0);
        } else if (this.field2463[arg0].length == 1) {
            return this.method2735(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ei.d(II)V")
    public void method2737(int arg0) {
    }

    @ObfuscatedName("ei.v(IB)[I")
    public int[] method2738(int arg0) {
        return this.field2477[arg0];
    }

    @ObfuscatedName("ei.n(II)I")
    public int method2739(int arg0) {
        return this.field2463[arg0].length;
    }

    @ObfuscatedName("ei.z(S)I")
    public int method2773() {
        return this.field2463.length;
    }

    @ObfuscatedName("ei.a(II)V")
    public void method2740(int arg0) {
        for (int var2 = 0; var2 < this.field2463[arg0].length; var2++) {
            this.field2463[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ei.t(B)V")
    public void method2769() {
        for (int var1 = 0; var1 < this.field2463.length; var1++) {
            if (this.field2463[var1] != null) {
                for (int var2 = 0; var2 < this.field2463[var1].length; var2++) {
                    this.field2463[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ei.p(I[II)Z")
    public boolean method2742(int arg0, int[] arg1) {
        if (this.field2473[arg0] == null) {
            return false;
        }
        int var3 = this.field2469[arg0];
        int[] var4 = this.field2477[arg0];
        Object[] var5 = this.field2463[arg0];
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
            var8 = Statics.method533(this.field2473[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2280(arg1, 5, var9.field1844.length);
        } else {
            var8 = Statics.method533(this.field2473[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2530(var8);
        } catch (RuntimeException var27) {
            throw class135.method14(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method3195(var8, var8.length) + "," + class107.method3195(var8, var8.length - 2) + "," + this.field2467[arg0] + "," + this.field2476);
        }
        if (this.field2472) {
            this.field2473[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1838 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2143();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1838 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2143();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2478) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method1024(var20[var26], false);
                }
            }
        } else if (this.field2478) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1024(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ei.i(Ljava/lang/String;B)I")
    public int method2743(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2466.method3198(class200.method3395(var2));
    }

    @ObfuscatedName("ei.r(ILjava/lang/String;I)I")
    public int method2744(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2465[arg0].method3198(class200.method3395(var3));
    }

    @ObfuscatedName("ei.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2758(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2466.method3198(class200.method3395(var3));
        int var6 = this.field2465[var5].method3198(class200.method3395(var4));
        return this.method2729(var5, var6);
    }

    @ObfuscatedName("ei.b(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2745(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2466.method3198(class200.method3395(var3));
        int var6 = this.field2465[var5].method3198(class200.method3395(var4));
        return this.method2731(var5, var6);
    }

    @ObfuscatedName("ei.x(Ljava/lang/String;I)Z")
    public boolean method2747(String arg0) {
        int var2 = this.method2743("");
        return var2 == -1 ? this.method2745(arg0, "") : this.method2745("", arg0);
    }

    @ObfuscatedName("ei.q(Ljava/lang/String;B)V")
    public void method2789(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2466.method3198(class200.method3395(var2));
        if (var3 >= 0) {
            this.method2791(var3);
        }
    }

    @ObfuscatedName("dg.o([BB)[B")
    public static final byte[] method2530(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2138();
        int var3 = var1.method2143();
        if (var3 < 0 || !(field2479 == 0 || var3 <= field2479)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2149(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2143();
            if (var5 < 0 || field2479 != 0 && var5 > field2479) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2093(var6, var5, arg0, var3, 9);
            } else {
                field2475.method2078(var1, var6);
            }
            return var6;
        }
    }
}
