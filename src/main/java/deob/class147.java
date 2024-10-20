package deob;

@ObfuscatedName("eh")
public abstract class class147 {

    @ObfuscatedName("eh.g")
    public int field2459;

    @ObfuscatedName("eh.s")
    public int[] field2442;

    @ObfuscatedName("eh.h")
    public int[] field2457;

    @ObfuscatedName("eh.m")
    public class171 field2460;

    @ObfuscatedName("eh.u")
    public int[] field2444;

    @ObfuscatedName("eh.j")
    public int[] field2445;

    @ObfuscatedName("eh.b")
    public int[] field2446;

    @ObfuscatedName("eh.v")
    public int[][] field2447;

    @ObfuscatedName("eh.y")
    public int[][] field2448;

    @ObfuscatedName("eh.w")
    public class171[] field2449;

    @ObfuscatedName("eh.x")
    public Object[] field2450;

    @ObfuscatedName("eh.k")
    public Object[][] field2462;

    @ObfuscatedName("eh.o")
    public static class104 field2452 = new class104();

    @ObfuscatedName("eh.a")
    public int field2453;

    @ObfuscatedName("eh.f")
    public boolean field2454;

    @ObfuscatedName("eh.r")
    public boolean field2455;

    @ObfuscatedName("eh.e")
    public static int field2456 = 0;

    public class147(boolean arg0, boolean arg1) {
        this.field2454 = arg0;
        this.field2455 = arg1;
    }

    @ObfuscatedName("eh.g([BS)V")
    public void method2665(byte[] arg0) {
        this.field2453 = class107.method24(arg0, arg0.length);
        class107 var2 = new class107(method539(arg0));
        int var3 = var2.method2101();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2286();
        }
        int var4 = var2.method2101();
        if (var3 >= 7) {
            this.field2459 = var2.method2115();
        } else {
            this.field2459 = var2.method2166();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2442 = new int[this.field2459];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2459; var7++) {
                this.field2442[var7] = var5 += var2.method2115();
                if (this.field2442[var7] > var6) {
                    var6 = this.field2442[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2459; var8++) {
                this.field2442[var8] = var5 += var2.method2166();
                if (this.field2442[var8] > var6) {
                    var6 = this.field2442[var8];
                }
            }
        }
        this.field2444 = new int[var6 + 1];
        this.field2445 = new int[var6 + 1];
        this.field2446 = new int[var6 + 1];
        this.field2447 = new int[var6 + 1][];
        this.field2450 = new Object[var6 + 1];
        this.field2462 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2457 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2459; var9++) {
                this.field2457[this.field2442[var9]] = var2.method2286();
            }
            this.field2460 = new class171(this.field2457);
        }
        for (int var10 = 0; var10 < this.field2459; var10++) {
            this.field2444[this.field2442[var10]] = var2.method2286();
        }
        for (int var11 = 0; var11 < this.field2459; var11++) {
            this.field2445[this.field2442[var11]] = var2.method2286();
        }
        for (int var12 = 0; var12 < this.field2459; var12++) {
            this.field2446[this.field2442[var12]] = var2.method2166();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2459; var13++) {
                int var14 = this.field2442[var13];
                int var15 = this.field2446[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2447[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2447[var14][var18] = var16 += var2.method2115();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2462[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2459; var20++) {
                int var21 = this.field2442[var20];
                int var22 = this.field2446[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2447[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2447[var21][var25] = var23 += var2.method2166();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2462[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2448 = new int[var6 + 1][];
        this.field2449 = new class171[var6 + 1];
        for (int var27 = 0; var27 < this.field2459; var27++) {
            int var28 = this.field2442[var27];
            int var29 = this.field2446[var28];
            this.field2448[var28] = new int[this.field2462[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2448[var28][this.field2447[var28][var30]] = var2.method2286();
            }
            this.field2449[var28] = new class171(this.field2448[var28]);
        }
    }

    @ObfuscatedName("eh.s(IB)V")
    public void method2668(int arg0) {
    }

    @ObfuscatedName("eh.h(III)[B")
    public byte[] method2667(int arg0, int arg1) {
        return this.method2669(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eh.m(II[IB)[B")
    public byte[] method2669(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return null;
        }
        if (this.field2462[arg0][arg1] == null) {
            boolean var4 = this.method2681(arg0, arg2);
            if (!var4) {
                this.method2675(arg0);
                boolean var5 = this.method2681(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method530(this.field2462[arg0][arg1], false);
        if (this.field2455) {
            this.field2462[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eh.u(III)Z")
    public boolean method2716(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return false;
        } else if (this.field2462[arg0][arg1] != null) {
            return true;
        } else if (this.field2450[arg0] == null) {
            this.method2675(arg0);
            return this.field2450[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.j(IB)Z")
    public boolean method2670(int arg0) {
        if (this.field2450[arg0] == null) {
            this.method2675(arg0);
            return this.field2450[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eh.b(I)Z")
    public boolean method2679() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2442.length; var2++) {
            int var3 = this.field2442[var2];
            if (this.field2450[var3] == null) {
                this.method2675(var3);
                if (this.field2450[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eh.v(IB)[B")
    public byte[] method2672(int arg0) {
        if (this.field2462.length == 1) {
            return this.method2667(0, arg0);
        } else if (this.field2462[arg0].length == 1) {
            return this.method2667(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.y(IIB)[B")
    public byte[] method2673(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2462.length || this.field2462[arg0] == null || arg1 < 0 || arg1 >= this.field2462[arg0].length) {
            return null;
        }
        if (this.field2462[arg0][arg1] == null) {
            boolean var3 = this.method2681(arg0, (int[]) null);
            if (!var3) {
                this.method2675(arg0);
                boolean var4 = this.method2681(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method530(this.field2462[arg0][arg1], false);
    }

    @ObfuscatedName("eh.w(IB)[B")
    public byte[] method2674(int arg0) {
        if (this.field2462.length == 1) {
            return this.method2673(0, arg0);
        } else if (this.field2462[arg0].length == 1) {
            return this.method2673(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eh.x(II)V")
    public void method2675(int arg0) {
    }

    @ObfuscatedName("eh.k(II)[I")
    public int[] method2707(int arg0) {
        return this.field2447[arg0];
    }

    @ObfuscatedName("eh.o(II)I")
    public int method2732(int arg0) {
        return this.field2462[arg0].length;
    }

    @ObfuscatedName("eh.a(I)I")
    public int method2678() {
        return this.field2462.length;
    }

    @ObfuscatedName("eh.f(IB)V")
    public void method2705(int arg0) {
        for (int var2 = 0; var2 < this.field2462[arg0].length; var2++) {
            this.field2462[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eh.r(B)V")
    public void method2680() {
        for (int var1 = 0; var1 < this.field2462.length; var1++) {
            if (this.field2462[var1] != null) {
                for (int var2 = 0; var2 < this.field2462[var1].length; var2++) {
                    this.field2462[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eh.e(I[IB)Z")
    public boolean method2681(int arg0, int[] arg1) {
        if (this.field2450[arg0] == null) {
            return false;
        }
        int var3 = this.field2446[arg0];
        int[] var4 = this.field2447[arg0];
        Object[] var5 = this.field2462[arg0];
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
            var8 = class112.method530(this.field2450[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2118(arg1, 5, var9.field1839.length);
        } else {
            var8 = class112.method530(this.field2450[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method539(var8);
        } catch (RuntimeException var27) {
            throw class135.method574(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method24(var8, var8.length) + "," + class107.method24(var8, var8.length - 2) + "," + this.field2444[arg0] + "," + this.field2453);
        }
        if (this.field2454) {
            this.field2450[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1835 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2286();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1835 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2286();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2455) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method1364(var20[var26], false);
                }
            }
        } else if (this.field2455) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method1364(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eh.t(Ljava/lang/String;I)I")
    public int method2682(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2460.method3118(class200.method2364(var2));
    }

    @ObfuscatedName("eh.c(ILjava/lang/String;I)I")
    public int method2683(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2449[arg0].method3118(class200.method2364(var3));
    }

    @ObfuscatedName("eh.l(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2671(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2460.method3118(class200.method2364(var3));
        int var6 = this.field2449[var5].method3118(class200.method2364(var4));
        return this.method2667(var5, var6);
    }

    @ObfuscatedName("eh.n(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2685(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2460.method3118(class200.method2364(var3));
        int var6 = this.field2449[var5].method3118(class200.method2364(var4));
        return this.method2716(var5, var6);
    }

    @ObfuscatedName("eh.d(Ljava/lang/String;B)Z")
    public boolean method2664(String arg0) {
        int var2 = this.method2682("");
        return var2 == -1 ? this.method2685(arg0, "") : this.method2685("", arg0);
    }

    @ObfuscatedName("eh.p(Ljava/lang/String;I)V")
    public void method2687(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2460.method3118(class200.method2364(var2));
        if (var3 >= 0) {
            this.method2668(var3);
        }
    }

    @ObfuscatedName("i.z([BI)[B")
    public static final byte[] method539(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2101();
        int var3 = var1.method2286();
        if (var3 < 0 || !(field2456 == 0 || var3 <= field2456)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2256(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2286();
            if (var5 < 0 || field2456 != 0 && var5 > field2456) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2053(var6, var5, arg0, var3, 9);
            } else {
                field2452.method2046(var1, var6);
            }
            return var6;
        }
    }
}
