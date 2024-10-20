package deob;

@ObfuscatedName("ex")
public abstract class class151 {

    @ObfuscatedName("ex.b")
    public int field2483;

    @ObfuscatedName("ex.e")
    public int[] field2476;

    @ObfuscatedName("ex.i")
    public int[] field2482;

    @ObfuscatedName("ex.k")
    public class175 field2477;

    @ObfuscatedName("ex.h")
    public int[] field2487;

    @ObfuscatedName("ex.p")
    public int[] field2481;

    @ObfuscatedName("ex.n")
    public int[] field2479;

    @ObfuscatedName("ex.o")
    public int[][] field2478;

    @ObfuscatedName("ex.g")
    public int[][] field2484;

    @ObfuscatedName("ex.z")
    public class175[] field2485;

    @ObfuscatedName("ex.t")
    public Object[] field2486;

    @ObfuscatedName("ex.y")
    public Object[][] field2480;

    @ObfuscatedName("ex.w")
    public static class107 field2488 = new class107();

    @ObfuscatedName("ex.x")
    public int field2489;

    @ObfuscatedName("ex.v")
    public boolean field2490;

    @ObfuscatedName("ex.q")
    public boolean field2491;

    @ObfuscatedName("ex.f")
    public static int field2492 = 0;

    public class151(boolean arg0, boolean arg1) {
        this.field2490 = arg0;
        this.field2491 = arg1;
    }

    @ObfuscatedName("ex.b([BI)V")
    public void method2760(byte[] arg0) {
        this.field2489 = class110.method513(arg0, arg0.length);
        class110 var2 = new class110(method822(arg0));
        int var3 = var2.method2142();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2195();
        }
        int var4 = var2.method2142();
        if (var3 >= 7) {
            this.field2483 = var2.method2218();
        } else {
            this.field2483 = var2.method2292();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2476 = new int[this.field2483];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2483; var7++) {
                this.field2476[var7] = var5 += var2.method2218();
                if (this.field2476[var7] > var6) {
                    var6 = this.field2476[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2483; var8++) {
                this.field2476[var8] = var5 += var2.method2292();
                if (this.field2476[var8] > var6) {
                    var6 = this.field2476[var8];
                }
            }
        }
        this.field2487 = new int[var6 + 1];
        this.field2481 = new int[var6 + 1];
        this.field2479 = new int[var6 + 1];
        this.field2478 = new int[var6 + 1][];
        this.field2486 = new Object[var6 + 1];
        this.field2480 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2482 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2483; var9++) {
                this.field2482[this.field2476[var9]] = var2.method2195();
            }
            this.field2477 = new class175(this.field2482);
        }
        for (int var10 = 0; var10 < this.field2483; var10++) {
            this.field2487[this.field2476[var10]] = var2.method2195();
        }
        for (int var11 = 0; var11 < this.field2483; var11++) {
            this.field2481[this.field2476[var11]] = var2.method2195();
        }
        for (int var12 = 0; var12 < this.field2483; var12++) {
            this.field2479[this.field2476[var12]] = var2.method2292();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2483; var13++) {
                int var14 = this.field2476[var13];
                int var15 = this.field2479[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2478[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2478[var14][var18] = var16 += var2.method2218();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2480[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2483; var20++) {
                int var21 = this.field2476[var20];
                int var22 = this.field2479[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2478[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2478[var21][var25] = var23 += var2.method2292();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2480[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2484 = new int[var6 + 1][];
        this.field2485 = new class175[var6 + 1];
        for (int var27 = 0; var27 < this.field2483; var27++) {
            int var28 = this.field2476[var27];
            int var29 = this.field2479[var28];
            this.field2484[var28] = new int[this.field2480[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2484[var28][this.field2478[var28][var30]] = var2.method2195();
            }
            this.field2485[var28] = new class175(this.field2484[var28]);
        }
    }

    @ObfuscatedName("ex.e(IB)V")
    public void method2837(int arg0) {
    }

    @ObfuscatedName("ex.i(III)[B")
    public byte[] method2761(int arg0, int arg1) {
        return this.method2765(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ex.k(II[IB)[B")
    public byte[] method2765(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2480.length || this.field2480[arg0] == null || arg1 < 0 || arg1 >= this.field2480[arg0].length) {
            return null;
        }
        if (this.field2480[arg0][arg1] == null) {
            boolean var4 = this.method2776(arg0, arg2);
            if (!var4) {
                this.method2770(arg0);
                boolean var5 = this.method2776(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class116.method2733(this.field2480[arg0][arg1], false);
        if (this.field2491) {
            this.field2480[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ex.h(IIB)Z")
    public boolean method2824(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2480.length || this.field2480[arg0] == null || arg1 < 0 || arg1 >= this.field2480[arg0].length) {
            return false;
        } else if (this.field2480[arg0][arg1] != null) {
            return true;
        } else if (this.field2486[arg0] == null) {
            this.method2770(arg0);
            return this.field2486[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ex.p(II)Z")
    public boolean method2766(int arg0) {
        if (this.field2486[arg0] == null) {
            this.method2770(arg0);
            return this.field2486[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ex.n(B)Z")
    public boolean method2809() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2476.length; var2++) {
            int var3 = this.field2476[var2];
            if (this.field2486[var3] == null) {
                this.method2770(var3);
                if (this.field2486[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ex.o(II)[B")
    public byte[] method2764(int arg0) {
        if (this.field2480.length == 1) {
            return this.method2761(0, arg0);
        } else if (this.field2480[arg0].length == 1) {
            return this.method2761(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ex.g(III)[B")
    public byte[] method2768(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2480.length || this.field2480[arg0] == null || arg1 < 0 || arg1 >= this.field2480[arg0].length) {
            return null;
        }
        if (this.field2480[arg0][arg1] == null) {
            boolean var3 = this.method2776(arg0, (int[]) null);
            if (!var3) {
                this.method2770(arg0);
                boolean var4 = this.method2776(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class116.method2733(this.field2480[arg0][arg1], false);
    }

    @ObfuscatedName("ex.z(IB)[B")
    public byte[] method2769(int arg0) {
        if (this.field2480.length == 1) {
            return this.method2768(0, arg0);
        } else if (this.field2480[arg0].length == 1) {
            return this.method2768(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ex.t(II)V")
    public void method2770(int arg0) {
    }

    @ObfuscatedName("ex.y(IB)[I")
    public int[] method2771(int arg0) {
        return this.field2478[arg0];
    }

    @ObfuscatedName("ex.w(II)I")
    public int method2772(int arg0) {
        return this.field2480[arg0].length;
    }

    @ObfuscatedName("ex.x(I)I")
    public int method2773() {
        return this.field2480.length;
    }

    @ObfuscatedName("ex.v(II)V")
    public void method2774(int arg0) {
        for (int var2 = 0; var2 < this.field2480[arg0].length; var2++) {
            this.field2480[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ex.q(I)V")
    public void method2831() {
        for (int var1 = 0; var1 < this.field2480.length; var1++) {
            if (this.field2480[var1] != null) {
                for (int var2 = 0; var2 < this.field2480[var1].length; var2++) {
                    this.field2480[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ex.f(I[II)Z")
    public boolean method2776(int arg0, int[] arg1) {
        if (this.field2486[arg0] == null) {
            return false;
        }
        int var3 = this.field2479[arg0];
        int[] var4 = this.field2478[arg0];
        Object[] var5 = this.field2480[arg0];
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
            var8 = class116.method2733(this.field2486[arg0], true);
            class110 var9 = new class110(var8);
            var9.method2159(arg1, 5, var9.field1862.length);
        } else {
            var8 = class116.method2733(this.field2486[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method822(var8);
        } catch (RuntimeException var27) {
            throw class139.method2425(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class110.method513(var8, var8.length) + "," + class110.method513(var8, var8.length - 2) + "," + this.field2487[arg0] + "," + this.field2489);
        }
        if (this.field2490) {
            this.field2486[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class110 var15 = new class110(var10);
            int[] var16 = new int[var3];
            var15.field1855 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2195();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1855 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2195();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2491) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class116.method888(var20[var26], false);
                }
            }
        } else if (this.field2491) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class116.method888(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ex.s(Ljava/lang/String;I)I")
    public int method2778(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2477.method3214(class213.method3590(var2));
    }

    @ObfuscatedName("ex.a(ILjava/lang/String;I)I")
    public int method2839(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2485[arg0].method3214(class213.method3590(var3));
    }

    @ObfuscatedName("ex.m(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2779(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2477.method3214(class213.method3590(var3));
        int var6 = this.field2485[var5].method3214(class213.method3590(var4));
        return this.method2761(var5, var6);
    }

    @ObfuscatedName("ex.c(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2777(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2477.method3214(class213.method3590(var3));
        int var6 = this.field2485[var5].method3214(class213.method3590(var4));
        return this.method2824(var5, var6);
    }

    @ObfuscatedName("ex.j(Ljava/lang/String;I)Z")
    public boolean method2781(String arg0) {
        int var2 = this.method2778("");
        return var2 == -1 ? this.method2777(arg0, "") : this.method2777("", arg0);
    }

    @ObfuscatedName("ex.d(Ljava/lang/String;I)V")
    public void method2782(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2477.method3214(class213.method3590(var2));
        if (var3 >= 0) {
            this.method2837(var3);
        }
    }

    @ObfuscatedName("aj.l([BI)[B")
    public static final byte[] method822(byte[] arg0) {
        class110 var1 = new class110(arg0);
        int var2 = var1.method2142();
        int var3 = var1.method2195();
        if (var3 < 0 || !(field2492 == 0 || var3 <= field2492)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2235(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2195();
            if (var5 < 0 || field2492 != 0 && var5 > field2492) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class108.method2089(var6, var5, arg0, var3, 9);
            } else {
                field2488.method2087(var1, var6);
            }
            return var6;
        }
    }
}
