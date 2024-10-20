package deob;

@ObfuscatedName("er")
public abstract class class147 {

    @ObfuscatedName("er.p")
    public int field2450;

    @ObfuscatedName("er.g")
    public int[] field2448;

    @ObfuscatedName("er.x")
    public int[] field2449;

    @ObfuscatedName("er.c")
    public class171 field2458;

    @ObfuscatedName("er.n")
    public int[] field2459;

    @ObfuscatedName("er.s")
    public int[] field2452;

    @ObfuscatedName("er.r")
    public int[] field2453;

    @ObfuscatedName("er.w")
    public int[][] field2454;

    @ObfuscatedName("er.u")
    public int[][] field2447;

    @ObfuscatedName("er.d")
    public class171[] field2456;

    @ObfuscatedName("er.h")
    public Object[] field2457;

    @ObfuscatedName("er.a")
    public Object[][] field2461;

    @ObfuscatedName("er.y")
    public static class104 field2455 = new class104();

    @ObfuscatedName("er.v")
    public int field2460;

    @ObfuscatedName("er.e")
    public boolean field2465;

    @ObfuscatedName("er.b")
    public boolean field2462;

    @ObfuscatedName("er.z")
    public static int field2463 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2465 = arg0;
        this.field2462 = arg1;
    }

    @ObfuscatedName("er.p([BI)V")
    public void method2829(byte[] arg0) {
        this.field2460 = Statics.method592(arg0, arg0.length);
        class107 var2 = new class107(method2477(arg0));
        int var3 = var2.method2173();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2305();
        }
        int var4 = var2.method2173();
        if (var3 >= 7) {
            this.field2450 = var2.method2360();
        } else {
            this.field2450 = var2.method2175();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2448 = new int[this.field2450];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2450; var7++) {
                this.field2448[var7] = var5 += var2.method2360();
                if (this.field2448[var7] > var6) {
                    var6 = this.field2448[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2450; var8++) {
                this.field2448[var8] = var5 += var2.method2175();
                if (this.field2448[var8] > var6) {
                    var6 = this.field2448[var8];
                }
            }
        }
        this.field2459 = new int[var6 + 1];
        this.field2452 = new int[var6 + 1];
        this.field2453 = new int[var6 + 1];
        this.field2454 = new int[var6 + 1][];
        this.field2457 = new Object[var6 + 1];
        this.field2461 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2449 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2450; var9++) {
                this.field2449[this.field2448[var9]] = var2.method2305();
            }
            this.field2458 = new class171(this.field2449);
        }
        for (int var10 = 0; var10 < this.field2450; var10++) {
            this.field2459[this.field2448[var10]] = var2.method2305();
        }
        for (int var11 = 0; var11 < this.field2450; var11++) {
            this.field2452[this.field2448[var11]] = var2.method2305();
        }
        for (int var12 = 0; var12 < this.field2450; var12++) {
            this.field2453[this.field2448[var12]] = var2.method2175();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2450; var13++) {
                int var14 = this.field2448[var13];
                int var15 = this.field2453[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2454[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2454[var14][var18] = var16 += var2.method2360();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2461[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2450; var20++) {
                int var21 = this.field2448[var20];
                int var22 = this.field2453[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2454[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2454[var21][var25] = var23 += var2.method2175();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2461[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2447 = new int[var6 + 1][];
        this.field2456 = new class171[var6 + 1];
        for (int var27 = 0; var27 < this.field2450; var27++) {
            int var28 = this.field2448[var27];
            int var29 = this.field2453[var28];
            this.field2447[var28] = new int[this.field2461[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2447[var28][this.field2454[var28][var30]] = var2.method2305();
            }
            this.field2456[var28] = new class171(this.field2447[var28]);
        }
    }

    @ObfuscatedName("er.g(IB)V")
    public void method2785(int arg0) {
    }

    @ObfuscatedName("er.x(III)[B")
    public byte[] method2855(int arg0, int arg1) {
        return this.method2794(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("er.c(II[IB)[B")
    public byte[] method2794(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var4 = this.method2800(arg0, arg2);
            if (!var4) {
                this.method2790(arg0);
                boolean var5 = this.method2800(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method3(this.field2461[arg0][arg1], false);
        if (this.field2462) {
            this.field2461[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("er.n(III)Z")
    public boolean method2805(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return false;
        } else if (this.field2461[arg0][arg1] != null) {
            return true;
        } else if (this.field2457[arg0] == null) {
            this.method2790(arg0);
            return this.field2457[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.s(IB)Z")
    public boolean method2789(int arg0) {
        if (this.field2457[arg0] == null) {
            this.method2790(arg0);
            return this.field2457[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("er.r(I)Z")
    public boolean method2825() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2448.length; var2++) {
            int var3 = this.field2448[var2];
            if (this.field2457[var3] == null) {
                this.method2790(var3);
                if (this.field2457[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("er.w(II)[B")
    public byte[] method2791(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2855(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2855(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.u(IIB)[B")
    public byte[] method2811(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2461.length || this.field2461[arg0] == null || arg1 < 0 || arg1 >= this.field2461[arg0].length) {
            return null;
        }
        if (this.field2461[arg0][arg1] == null) {
            boolean var3 = this.method2800(arg0, (int[]) null);
            if (!var3) {
                this.method2790(arg0);
                boolean var4 = this.method2800(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method3(this.field2461[arg0][arg1], false);
    }

    @ObfuscatedName("er.d(IB)[B")
    public byte[] method2793(int arg0) {
        if (this.field2461.length == 1) {
            return this.method2811(0, arg0);
        } else if (this.field2461[arg0].length == 1) {
            return this.method2811(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("er.h(IB)V")
    public void method2790(int arg0) {
    }

    @ObfuscatedName("er.a(IB)[I")
    public int[] method2795(int arg0) {
        return this.field2454[arg0];
    }

    @ObfuscatedName("er.y(II)I")
    public int method2796(int arg0) {
        return this.field2461[arg0].length;
    }

    @ObfuscatedName("er.v(I)I")
    public int method2848() {
        return this.field2461.length;
    }

    @ObfuscatedName("er.e(II)V")
    public void method2798(int arg0) {
        for (int var2 = 0; var2 < this.field2461[arg0].length; var2++) {
            this.field2461[arg0][var2] = null;
        }
    }

    @ObfuscatedName("er.b(I)V")
    public void method2831() {
        for (int var1 = 0; var1 < this.field2461.length; var1++) {
            if (this.field2461[var1] != null) {
                for (int var2 = 0; var2 < this.field2461[var1].length; var2++) {
                    this.field2461[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("er.z(I[II)Z")
    public boolean method2800(int arg0, int[] arg1) {
        if (this.field2457[arg0] == null) {
            return false;
        }
        int var3 = this.field2453[arg0];
        int[] var4 = this.field2454[arg0];
        Object[] var5 = this.field2461[arg0];
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
            var8 = class112.method3(this.field2457[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2190(arg1, 5, var9.field1838.length);
        } else {
            var8 = class112.method3(this.field2457[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2477(var8);
        } catch (RuntimeException var27) {
            throw class135.method151(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method592(var8, var8.length) + "," + Statics.method592(var8, var8.length - 2) + "," + this.field2459[arg0] + "," + this.field2460);
        }
        if (this.field2465) {
            this.field2457[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1837 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2305();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1837 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2305();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2462) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method33(var20[var26], false);
                }
            }
        } else if (this.field2462) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method33(var10, false);
        }
        return true;
    }

    @ObfuscatedName("er.l(Ljava/lang/String;I)I")
    public int method2801(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2458.method3222(class200.method2768(var2));
    }

    @ObfuscatedName("er.t(ILjava/lang/String;I)I")
    public int method2802(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2456[arg0].method3222(class200.method2768(var3));
    }

    @ObfuscatedName("er.q(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method2803(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2458.method3222(class200.method2768(var3));
        int var6 = this.field2456[var5].method3222(class200.method2768(var4));
        return this.method2855(var5, var6);
    }

    @ObfuscatedName("er.j(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2837(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2458.method3222(class200.method2768(var3));
        int var6 = this.field2456[var5].method3222(class200.method2768(var4));
        return this.method2805(var5, var6);
    }

    @ObfuscatedName("er.o(Ljava/lang/String;B)Z")
    public boolean method2808(String arg0) {
        int var2 = this.method2801("");
        return var2 == -1 ? this.method2837(arg0, "") : this.method2837("", arg0);
    }

    @ObfuscatedName("er.i(Ljava/lang/String;I)V")
    public void method2806(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2458.method3222(class200.method2768(var2));
        if (var3 >= 0) {
            this.method2785(var3);
        }
    }

    @ObfuscatedName("dj.m([BI)[B")
    public static final byte[] method2477(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2173();
        int var3 = var1.method2305();
        if (var3 < 0 || !(field2463 == 0 || var3 <= field2463)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2184(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2305();
            if (var5 < 0 || field2463 != 0 && var5 > field2463) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2124(var6, var5, arg0, var3, 9);
            } else {
                field2455.method2120(var1, var6);
            }
            return var6;
        }
    }
}
