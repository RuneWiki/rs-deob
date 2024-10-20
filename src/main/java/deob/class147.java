package deob;

@ObfuscatedName("eo")
public abstract class class147 {

    @ObfuscatedName("eo.g")
    public int field2480;

    @ObfuscatedName("eo.i")
    public int[] field2493;

    @ObfuscatedName("eo.k")
    public int[] field2482;

    @ObfuscatedName("eo.e")
    public class171 field2479;

    @ObfuscatedName("eo.w")
    public int[] field2492;

    @ObfuscatedName("eo.m")
    public int[] field2481;

    @ObfuscatedName("eo.u")
    public int[] field2476;

    @ObfuscatedName("eo.j")
    public int[][] field2483;

    @ObfuscatedName("eo.o")
    public int[][] field2484;

    @ObfuscatedName("eo.h")
    public class171[] field2485;

    @ObfuscatedName("eo.b")
    public Object[] field2486;

    @ObfuscatedName("eo.r")
    public Object[][] field2477;

    @ObfuscatedName("eo.l")
    public static class104 field2488 = new class104();

    @ObfuscatedName("eo.x")
    public int field2489;

    @ObfuscatedName("eo.q")
    public boolean field2490;

    @ObfuscatedName("eo.t")
    public boolean field2491;

    @ObfuscatedName("eo.y")
    public static int field2487 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2490 = arg0;
        this.field2491 = arg1;
    }

    @ObfuscatedName("eo.g([BI)V")
    public void method2682(byte[] arg0) {
        this.field2489 = class107.method1858(arg0, arg0.length);
        class107 var2 = new class107(method756(arg0));
        int var3 = var2.method2092();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2112();
        }
        int var4 = var2.method2092();
        if (var3 >= 7) {
            this.field2480 = var2.method2159();
        } else {
            this.field2480 = var2.method2094();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2493 = new int[this.field2480];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2480; var7++) {
                this.field2493[var7] = var5 += var2.method2159();
                if (this.field2493[var7] > var6) {
                    var6 = this.field2493[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2480; var8++) {
                this.field2493[var8] = var5 += var2.method2094();
                if (this.field2493[var8] > var6) {
                    var6 = this.field2493[var8];
                }
            }
        }
        this.field2492 = new int[var6 + 1];
        this.field2481 = new int[var6 + 1];
        this.field2476 = new int[var6 + 1];
        this.field2483 = new int[var6 + 1][];
        this.field2486 = new Object[var6 + 1];
        this.field2477 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2482 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2480; var9++) {
                this.field2482[this.field2493[var9]] = var2.method2112();
            }
            this.field2479 = new class171(this.field2482);
        }
        for (int var10 = 0; var10 < this.field2480; var10++) {
            this.field2492[this.field2493[var10]] = var2.method2112();
        }
        for (int var11 = 0; var11 < this.field2480; var11++) {
            this.field2481[this.field2493[var11]] = var2.method2112();
        }
        for (int var12 = 0; var12 < this.field2480; var12++) {
            this.field2476[this.field2493[var12]] = var2.method2094();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2480; var13++) {
                int var14 = this.field2493[var13];
                int var15 = this.field2476[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2483[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2483[var14][var18] = var16 += var2.method2159();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2477[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2480; var20++) {
                int var21 = this.field2493[var20];
                int var22 = this.field2476[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2483[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2483[var21][var25] = var23 += var2.method2094();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2477[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2484 = new int[var6 + 1][];
        this.field2485 = new class171[var6 + 1];
        for (int var27 = 0; var27 < this.field2480; var27++) {
            int var28 = this.field2493[var27];
            int var29 = this.field2476[var28];
            this.field2484[var28] = new int[this.field2477[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2484[var28][this.field2483[var28][var30]] = var2.method2112();
            }
            this.field2485[var28] = new class171(this.field2484[var28]);
        }
    }

    @ObfuscatedName("eo.i(IB)V")
    public void method2683(int arg0) {
    }

    @ObfuscatedName("eo.k(IIB)[B")
    public byte[] method2734(int arg0, int arg1) {
        return this.method2685(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eo.e(II[II)[B")
    public byte[] method2685(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var4 = this.method2698(arg0, arg2);
            if (!var4) {
                this.method2692(arg0);
                boolean var5 = this.method2698(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method822(this.field2477[arg0][arg1], false);
        if (this.field2491) {
            this.field2477[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eo.w(III)Z")
    public boolean method2724(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return false;
        } else if (this.field2477[arg0][arg1] != null) {
            return true;
        } else if (this.field2486[arg0] == null) {
            this.method2692(arg0);
            return this.field2486[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.m(IS)Z")
    public boolean method2687(int arg0) {
        if (this.field2486[arg0] == null) {
            this.method2692(arg0);
            return this.field2486[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eo.u(I)Z")
    public boolean method2688() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2493.length; var2++) {
            int var3 = this.field2493[var2];
            if (this.field2486[var3] == null) {
                this.method2692(var3);
                if (this.field2486[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eo.j(IB)[B")
    public byte[] method2713(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2734(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2734(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.o(III)[B")
    public byte[] method2690(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2477.length || this.field2477[arg0] == null || arg1 < 0 || arg1 >= this.field2477[arg0].length) {
            return null;
        }
        if (this.field2477[arg0][arg1] == null) {
            boolean var3 = this.method2698(arg0, (int[]) null);
            if (!var3) {
                this.method2692(arg0);
                boolean var4 = this.method2698(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method822(this.field2477[arg0][arg1], false);
    }

    @ObfuscatedName("eo.h(II)[B")
    public byte[] method2691(int arg0) {
        if (this.field2477.length == 1) {
            return this.method2690(0, arg0);
        } else if (this.field2477[arg0].length == 1) {
            return this.method2690(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eo.b(II)V")
    public void method2692(int arg0) {
    }

    @ObfuscatedName("eo.r(II)[I")
    public int[] method2693(int arg0) {
        return this.field2483[arg0];
    }

    @ObfuscatedName("eo.l(IB)I")
    public int method2681(int arg0) {
        return this.field2477[arg0].length;
    }

    @ObfuscatedName("eo.x(I)I")
    public int method2695() {
        return this.field2477.length;
    }

    @ObfuscatedName("eo.q(IB)V")
    public void method2704(int arg0) {
        for (int var2 = 0; var2 < this.field2477[arg0].length; var2++) {
            this.field2477[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eo.t(I)V")
    public void method2729() {
        for (int var1 = 0; var1 < this.field2477.length; var1++) {
            if (this.field2477[var1] != null) {
                for (int var2 = 0; var2 < this.field2477[var1].length; var2++) {
                    this.field2477[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eo.y(I[II)Z")
    public boolean method2698(int arg0, int[] arg1) {
        if (this.field2486[arg0] == null) {
            return false;
        }
        int var3 = this.field2476[arg0];
        int[] var4 = this.field2483[arg0];
        Object[] var5 = this.field2477[arg0];
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
            var8 = class112.method822(this.field2486[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2109(arg1, 5, var9.field1843.length);
        } else {
            var8 = class112.method822(this.field2486[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method756(var8);
        } catch (RuntimeException var27) {
            throw class135.method87(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method1858(var8, var8.length) + "," + class107.method1858(var8, var8.length - 2) + "," + this.field2492[arg0] + "," + this.field2489);
        }
        if (this.field2490) {
            this.field2486[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1844 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2112();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1844 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2112();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2491) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method508(var20[var26], false);
                }
            }
        } else if (this.field2491) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method508(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eo.d(Ljava/lang/String;S)I")
    public int method2699(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2479.method3132(class200.method2355(var2));
    }

    @ObfuscatedName("eo.z(ILjava/lang/String;I)I")
    public int method2700(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2485[arg0].method3132(class200.method2355(var3));
    }

    @ObfuscatedName("eo.n(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2732(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2479.method3132(class200.method2355(var3));
        int var6 = this.field2485[var5].method3132(class200.method2355(var4));
        return this.method2734(var5, var6);
    }

    @ObfuscatedName("eo.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2735(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2479.method3132(class200.method2355(var3));
        int var6 = this.field2485[var5].method3132(class200.method2355(var4));
        return this.method2724(var5, var6);
    }

    @ObfuscatedName("eo.f(Ljava/lang/String;B)Z")
    public boolean method2731(String arg0) {
        int var2 = this.method2699("");
        return var2 == -1 ? this.method2735(arg0, "") : this.method2735("", arg0);
    }

    @ObfuscatedName("eo.a(Ljava/lang/String;B)V")
    public void method2703(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2479.method3132(class200.method2355(var2));
        if (var3 >= 0) {
            this.method2683(var3);
        }
    }

    @ObfuscatedName("az.p([BI)[B")
    public static final byte[] method756(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2092();
        int var3 = var1.method2112();
        if (var3 < 0 || !(field2487 == 0 || var3 <= field2487)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2283(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2112();
            if (var5 < 0 || field2487 != 0 && var5 > field2487) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2046(var6, var5, arg0, var3, 9);
            } else {
                field2488.method2042(var1, var6);
            }
            return var6;
        }
    }
}
