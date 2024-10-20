package deob;

@ObfuscatedName("et")
public abstract class class147 {

    @ObfuscatedName("et.g")
    public int field2466;

    @ObfuscatedName("et.s")
    public int[] field2480;

    @ObfuscatedName("et.v")
    public int[] field2483;

    @ObfuscatedName("et.o")
    public class171 field2467;

    @ObfuscatedName("et.k")
    public int[] field2468;

    @ObfuscatedName("et.m")
    public int[] field2469;

    @ObfuscatedName("et.i")
    public int[] field2470;

    @ObfuscatedName("et.t")
    public int[][] field2464;

    @ObfuscatedName("et.l")
    public int[][] field2472;

    @ObfuscatedName("et.p")
    public class171[] field2481;

    @ObfuscatedName("et.r")
    public Object[] field2474;

    @ObfuscatedName("et.j")
    public Object[][] field2475;

    @ObfuscatedName("et.c")
    public static class104 field2476 = new class104();

    @ObfuscatedName("et.q")
    public int field2473;

    @ObfuscatedName("et.n")
    public boolean field2478;

    @ObfuscatedName("et.h")
    public boolean field2479;

    @ObfuscatedName("et.d")
    public static int field2471 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2478 = arg0;
        this.field2479 = arg1;
    }

    @ObfuscatedName("et.g([BI)V")
    public void method2675(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class107.method489(arg0, 0, var2);
        this.field2473 = var3;
        class107 var4 = new class107(method2842(arg0));
        int var5 = var4.method2116();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2097();
        }
        int var6 = var4.method2116();
        if (var5 >= 7) {
            this.field2466 = var4.method2106();
        } else {
            this.field2466 = var4.method2094();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2480 = new int[this.field2466];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2466; var9++) {
                this.field2480[var9] = var7 += var4.method2106();
                if (this.field2480[var9] > var8) {
                    var8 = this.field2480[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2466; var10++) {
                this.field2480[var10] = var7 += var4.method2094();
                if (this.field2480[var10] > var8) {
                    var8 = this.field2480[var10];
                }
            }
        }
        this.field2468 = new int[var8 + 1];
        this.field2469 = new int[var8 + 1];
        this.field2470 = new int[var8 + 1];
        this.field2464 = new int[var8 + 1][];
        this.field2474 = new Object[var8 + 1];
        this.field2475 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2483 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2466; var11++) {
                this.field2483[this.field2480[var11]] = var4.method2097();
            }
            this.field2467 = new class171(this.field2483);
        }
        for (int var12 = 0; var12 < this.field2466; var12++) {
            this.field2468[this.field2480[var12]] = var4.method2097();
        }
        for (int var13 = 0; var13 < this.field2466; var13++) {
            this.field2469[this.field2480[var13]] = var4.method2097();
        }
        for (int var14 = 0; var14 < this.field2466; var14++) {
            this.field2470[this.field2480[var14]] = var4.method2094();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2466; var15++) {
                int var16 = this.field2480[var15];
                int var17 = this.field2470[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2464[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2464[var16][var20] = var18 += var4.method2106();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2475[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2466; var22++) {
                int var23 = this.field2480[var22];
                int var24 = this.field2470[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2464[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2464[var23][var27] = var25 += var4.method2094();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2475[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2472 = new int[var8 + 1][];
        this.field2481 = new class171[var8 + 1];
        for (int var29 = 0; var29 < this.field2466; var29++) {
            int var30 = this.field2480[var29];
            int var31 = this.field2470[var30];
            this.field2472[var30] = new int[this.field2475[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2472[var30][this.field2464[var30][var32]] = var4.method2097();
            }
            this.field2481[var30] = new class171(this.field2472[var30]);
        }
    }

    @ObfuscatedName("et.s(II)V")
    public void method2658(int arg0) {
    }

    @ObfuscatedName("et.v(III)[B")
    public byte[] method2703(int arg0, int arg1) {
        return this.method2659(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("et.o(II[II)[B")
    public byte[] method2659(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2475.length || this.field2475[arg0] == null || arg1 < 0 || arg1 >= this.field2475[arg0].length) {
            return null;
        }
        if (this.field2475[arg0][arg1] == null) {
            boolean var4 = this.method2673(arg0, arg2);
            if (!var4) {
                this.method2667(arg0);
                boolean var5 = this.method2673(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method140(this.field2475[arg0][arg1], false);
        if (this.field2479) {
            this.field2475[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("et.k(IIS)Z")
    public boolean method2687(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2475.length || this.field2475[arg0] == null || arg1 < 0 || arg1 >= this.field2475[arg0].length) {
            return false;
        } else if (this.field2475[arg0][arg1] != null) {
            return true;
        } else if (this.field2474[arg0] == null) {
            this.method2667(arg0);
            return this.field2474[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("et.m(IB)Z")
    public boolean method2662(int arg0) {
        if (this.field2474[arg0] == null) {
            this.method2667(arg0);
            return this.field2474[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("et.i(B)Z")
    public boolean method2663() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2480.length; var2++) {
            int var3 = this.field2480[var2];
            if (this.field2474[var3] == null) {
                this.method2667(var3);
                if (this.field2474[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("et.t(II)[B")
    public byte[] method2691(int arg0) {
        if (this.field2475.length == 1) {
            return this.method2703(0, arg0);
        } else if (this.field2475[arg0].length == 1) {
            return this.method2703(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("et.l(IIB)[B")
    public byte[] method2720(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2475.length || this.field2475[arg0] == null || arg1 < 0 || arg1 >= this.field2475[arg0].length) {
            return null;
        }
        if (this.field2475[arg0][arg1] == null) {
            boolean var3 = this.method2673(arg0, (int[]) null);
            if (!var3) {
                this.method2667(arg0);
                boolean var4 = this.method2673(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method140(this.field2475[arg0][arg1], false);
    }

    @ObfuscatedName("et.p(II)[B")
    public byte[] method2666(int arg0) {
        if (this.field2475.length == 1) {
            return this.method2720(0, arg0);
        } else if (this.field2475[arg0].length == 1) {
            return this.method2720(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("et.r(II)V")
    public void method2667(int arg0) {
    }

    @ObfuscatedName("et.j(IB)[I")
    public int[] method2739(int arg0) {
        return this.field2464[arg0];
    }

    @ObfuscatedName("et.c(II)I")
    public int method2722(int arg0) {
        return this.field2475[arg0].length;
    }

    @ObfuscatedName("et.q(I)I")
    public int method2670() {
        return this.field2475.length;
    }

    @ObfuscatedName("et.n(II)V")
    public void method2671(int arg0) {
        for (int var2 = 0; var2 < this.field2475[arg0].length; var2++) {
            this.field2475[arg0][var2] = null;
        }
    }

    @ObfuscatedName("et.h(B)V")
    public void method2672() {
        for (int var1 = 0; var1 < this.field2475.length; var1++) {
            if (this.field2475[var1] != null) {
                for (int var2 = 0; var2 < this.field2475[var1].length; var2++) {
                    this.field2475[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("et.d(I[II)Z")
    public boolean method2673(int arg0, int[] arg1) {
        if (this.field2474[arg0] == null) {
            return false;
        }
        int var3 = this.field2470[arg0];
        int[] var4 = this.field2464[arg0];
        Object[] var5 = this.field2475[arg0];
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
            var8 = class112.method140(this.field2474[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2141(arg1, 5, var9.field1854.length);
        } else {
            var8 = class112.method140(this.field2474[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2842(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class107.method489(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class107.method489(var8, 0, var17);
            throw Statics.method2380(var34, var16 + var18 + "," + this.field2468[arg0] + "," + this.field2473);
        }
        if (this.field2478) {
            this.field2474[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class107 var22 = new class107(var10);
            int[] var23 = new int[var3];
            var22.field1851 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2097();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1851 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2097();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2479) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class112.method494(var27[var33], false);
                }
            }
        } else if (this.field2479) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method494(var10, false);
        }
        return true;
    }

    @ObfuscatedName("et.b(Ljava/lang/String;I)I")
    public int method2656(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2467.method3109(class200.method123(var2));
    }

    @ObfuscatedName("et.w(ILjava/lang/String;B)I")
    public int method2679(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2481[arg0].method3109(class200.method123(var3));
    }

    @ObfuscatedName("et.z(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2676(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2467.method3109(class200.method123(var3));
        int var6 = this.field2481[var5].method3109(class200.method123(var4));
        return this.method2703(var5, var6);
    }

    @ObfuscatedName("et.x(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2704(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2467.method3109(class200.method123(var3));
        int var6 = this.field2481[var5].method3109(class200.method123(var4));
        return this.method2687(var5, var6);
    }

    @ObfuscatedName("et.e(Ljava/lang/String;B)Z")
    public boolean method2678(String arg0) {
        int var2 = this.method2656("");
        return var2 == -1 ? this.method2704(arg0, "") : this.method2704("", arg0);
    }

    @ObfuscatedName("et.a(Ljava/lang/String;B)V")
    public void method2661(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2467.method3109(class200.method123(var2));
        if (var3 >= 0) {
            this.method2658(var3);
        }
    }

    @ObfuscatedName("ea.y([BI)[B")
    public static final byte[] method2842(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2116();
        int var3 = var1.method2097();
        if (var3 < 0 || !(field2471 == 0 || var3 <= field2471)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2103(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2097();
            if (var5 < 0 || field2471 != 0 && var5 > field2471) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2046(var6, var5, arg0, var3, 9);
            } else {
                field2476.method2040(var1, var6);
            }
            return var6;
        }
    }
}
