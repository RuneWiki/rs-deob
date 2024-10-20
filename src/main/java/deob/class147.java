package deob;

@ObfuscatedName("ej")
public abstract class class147 {

    @ObfuscatedName("ej.n")
    public int field2453;

    @ObfuscatedName("ej.x")
    public int[] field2461;

    @ObfuscatedName("ej.k")
    public int[] field2454;

    @ObfuscatedName("ej.i")
    public class171 field2465;

    @ObfuscatedName("ej.d")
    public int[] field2448;

    @ObfuscatedName("ej.q")
    public int[] field2449;

    @ObfuscatedName("ej.m")
    public int[] field2450;

    @ObfuscatedName("ej.a")
    public int[][] field2447;

    @ObfuscatedName("ej.w")
    public int[][] field2452;

    @ObfuscatedName("ej.e")
    public class171[] field2445;

    @ObfuscatedName("ej.o")
    public Object[] field2444;

    @ObfuscatedName("ej.v")
    public Object[][] field2455;

    @ObfuscatedName("ej.z")
    public static class104 field2456 = new class104();

    @ObfuscatedName("ej.j")
    public int field2457;

    @ObfuscatedName("ej.r")
    public boolean field2458;

    @ObfuscatedName("ej.c")
    public boolean field2459;

    @ObfuscatedName("ej.u")
    public static int field2460 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2458 = arg0;
        this.field2459 = arg1;
    }

    @ObfuscatedName("ej.n([BB)V")
    public void method2674(byte[] arg0) {
        this.field2457 = class107.method490(arg0, arg0.length);
        class107 var2 = new class107(Statics.method581(arg0));
        int var3 = var2.method2148();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2183();
        }
        int var4 = var2.method2148();
        if (var3 >= 7) {
            this.field2453 = var2.method2143();
        } else {
            this.field2453 = var2.method2140();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2461 = new int[this.field2453];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2453; var7++) {
                this.field2461[var7] = var5 += var2.method2143();
                if (this.field2461[var7] > var6) {
                    var6 = this.field2461[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2453; var8++) {
                this.field2461[var8] = var5 += var2.method2140();
                if (this.field2461[var8] > var6) {
                    var6 = this.field2461[var8];
                }
            }
        }
        this.field2448 = new int[var6 + 1];
        this.field2449 = new int[var6 + 1];
        this.field2450 = new int[var6 + 1];
        this.field2447 = new int[var6 + 1][];
        this.field2444 = new Object[var6 + 1];
        this.field2455 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2454 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2453; var9++) {
                this.field2454[this.field2461[var9]] = var2.method2183();
            }
            this.field2465 = new class171(this.field2454);
        }
        for (int var10 = 0; var10 < this.field2453; var10++) {
            this.field2448[this.field2461[var10]] = var2.method2183();
        }
        for (int var11 = 0; var11 < this.field2453; var11++) {
            this.field2449[this.field2461[var11]] = var2.method2183();
        }
        for (int var12 = 0; var12 < this.field2453; var12++) {
            this.field2450[this.field2461[var12]] = var2.method2140();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2453; var13++) {
                int var14 = this.field2461[var13];
                int var15 = this.field2450[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2447[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2447[var14][var18] = var16 += var2.method2143();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2455[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2453; var20++) {
                int var21 = this.field2461[var20];
                int var22 = this.field2450[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2447[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2447[var21][var25] = var23 += var2.method2140();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2455[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2452 = new int[var6 + 1][];
        this.field2445 = new class171[var6 + 1];
        for (int var27 = 0; var27 < this.field2453; var27++) {
            int var28 = this.field2461[var27];
            int var29 = this.field2450[var28];
            this.field2452[var28] = new int[this.field2455[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2452[var28][this.field2447[var28][var30]] = var2.method2183();
            }
            this.field2445[var28] = new class171(this.field2452[var28]);
        }
    }

    @ObfuscatedName("ej.x(II)V")
    public void method2673(int arg0) {
    }

    @ObfuscatedName("ej.k(IIS)[B")
    public byte[] method2738(int arg0, int arg1) {
        return this.method2675(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ej.i(II[II)[B")
    public byte[] method2675(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2455.length || this.field2455[arg0] == null || arg1 < 0 || arg1 >= this.field2455[arg0].length) {
            return null;
        }
        if (this.field2455[arg0][arg1] == null) {
            boolean var4 = this.method2700(arg0, arg2);
            if (!var4) {
                this.method2704(arg0);
                boolean var5 = this.method2700(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method1979(this.field2455[arg0][arg1], false);
        if (this.field2459) {
            this.field2455[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ej.d(III)Z")
    public boolean method2712(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2455.length || this.field2455[arg0] == null || arg1 < 0 || arg1 >= this.field2455[arg0].length) {
            return false;
        } else if (this.field2455[arg0][arg1] != null) {
            return true;
        } else if (this.field2444[arg0] == null) {
            this.method2704(arg0);
            return this.field2444[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.q(II)Z")
    public boolean method2677(int arg0) {
        if (this.field2444[arg0] == null) {
            this.method2704(arg0);
            return this.field2444[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.m(B)Z")
    public boolean method2678() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2461.length; var2++) {
            int var3 = this.field2461[var2];
            if (this.field2444[var3] == null) {
                this.method2704(var3);
                if (this.field2444[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ej.a(II)[B")
    public byte[] method2679(int arg0) {
        if (this.field2455.length == 1) {
            return this.method2738(0, arg0);
        } else if (this.field2455[arg0].length == 1) {
            return this.method2738(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.w(III)[B")
    public byte[] method2680(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2455.length || this.field2455[arg0] == null || arg1 < 0 || arg1 >= this.field2455[arg0].length) {
            return null;
        }
        if (this.field2455[arg0][arg1] == null) {
            boolean var3 = this.method2700(arg0, (int[]) null);
            if (!var3) {
                this.method2704(arg0);
                boolean var4 = this.method2700(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method1979(this.field2455[arg0][arg1], false);
    }

    @ObfuscatedName("ej.e(IB)[B")
    public byte[] method2681(int arg0) {
        if (this.field2455.length == 1) {
            return this.method2680(0, arg0);
        } else if (this.field2455[arg0].length == 1) {
            return this.method2680(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.o(II)V")
    public void method2704(int arg0) {
    }

    @ObfuscatedName("ej.v(II)[I")
    public int[] method2739(int arg0) {
        return this.field2447[arg0];
    }

    @ObfuscatedName("ej.z(II)I")
    public int method2684(int arg0) {
        return this.field2455[arg0].length;
    }

    @ObfuscatedName("ej.j(I)I")
    public int method2724() {
        return this.field2455.length;
    }

    @ObfuscatedName("ej.r(II)V")
    public void method2686(int arg0) {
        for (int var2 = 0; var2 < this.field2455[arg0].length; var2++) {
            this.field2455[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ej.c(I)V")
    public void method2687() {
        for (int var1 = 0; var1 < this.field2455.length; var1++) {
            if (this.field2455[var1] != null) {
                for (int var2 = 0; var2 < this.field2455[var1].length; var2++) {
                    this.field2455[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ej.u(I[IB)Z")
    public boolean method2700(int arg0, int[] arg1) {
        if (this.field2444[arg0] == null) {
            return false;
        }
        int var3 = this.field2450[arg0];
        int[] var4 = this.field2447[arg0];
        Object[] var5 = this.field2455[arg0];
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
            var8 = class112.method1979(this.field2444[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2155(arg1, 5, var9.field1829.length);
        } else {
            var8 = class112.method1979(this.field2444[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method581(var8);
        } catch (RuntimeException var27) {
            throw class135.method2344(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method490(var8, var8.length) + "," + class107.method490(var8, var8.length - 2) + "," + this.field2448[arg0] + "," + this.field2457);
        }
        if (this.field2458) {
            this.field2444[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1826 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2183();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1826 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2183();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2459) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method1344(var20[var26], false);
                }
            }
        } else if (this.field2459) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1344(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ej.h(Ljava/lang/String;I)I")
    public int method2729(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2465.method3111(class200.method538(var2));
    }

    @ObfuscatedName("ej.t(ILjava/lang/String;I)I")
    public int method2690(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2445[arg0].method3111(class200.method538(var3));
    }

    @ObfuscatedName("ej.f(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2691(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2465.method3111(class200.method538(var3));
        int var6 = this.field2445[var5].method3111(class200.method538(var4));
        return this.method2738(var5, var6);
    }

    @ObfuscatedName("ej.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2692(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2465.method3111(class200.method538(var3));
        int var6 = this.field2445[var5].method3111(class200.method538(var4));
        return this.method2712(var5, var6);
    }

    @ObfuscatedName("ej.s(Ljava/lang/String;S)Z")
    public boolean method2693(String arg0) {
        int var2 = this.method2729("");
        return var2 == -1 ? this.method2692(arg0, "") : this.method2692("", arg0);
    }

    @ObfuscatedName("ej.y(Ljava/lang/String;S)V")
    public void method2710(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2465.method3111(class200.method538(var2));
        if (var3 >= 0) {
            this.method2673(var3);
        }
    }
}
