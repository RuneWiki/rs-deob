package deob;

@ObfuscatedName("ez")
public abstract class class146 {

    @ObfuscatedName("ez.e")
    public int field2453;

    @ObfuscatedName("ez.o")
    public int[] field2439;

    @ObfuscatedName("ez.y")
    public int[] field2446;

    @ObfuscatedName("ez.b")
    public class170 field2454;

    @ObfuscatedName("ez.w")
    public int[] field2441;

    @ObfuscatedName("ez.r")
    public int[] field2443;

    @ObfuscatedName("ez.l")
    public int[] field2444;

    @ObfuscatedName("ez.s")
    public int[][] field2445;

    @ObfuscatedName("ez.f")
    public int[][] field2448;

    @ObfuscatedName("ez.x")
    public class170[] field2447;

    @ObfuscatedName("ez.h")
    public Object[] field2438;

    @ObfuscatedName("ez.a")
    public Object[][] field2449;

    @ObfuscatedName("ez.u")
    public static class104 field2450 = new class104();

    @ObfuscatedName("ez.v")
    public int field2451;

    @ObfuscatedName("ez.i")
    public boolean field2452;

    @ObfuscatedName("ez.n")
    public boolean field2442;

    @ObfuscatedName("ez.d")
    public static int field2440 = 0;

    public class146(boolean arg0, boolean arg1) {
        this.field2452 = arg0;
        this.field2442 = arg1;
    }

    @ObfuscatedName("ez.e([BI)V")
    public void method2638(byte[] arg0) {
        this.field2451 = class107.method1296(arg0, arg0.length);
        class107 var2 = new class107(method1994(arg0));
        int var3 = var2.method2123();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2207();
        }
        int var4 = var2.method2123();
        if (var3 >= 7) {
            this.field2453 = var2.method2118();
        } else {
            this.field2453 = var2.method2232();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2439 = new int[this.field2453];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2453; var7++) {
                this.field2439[var7] = var5 += var2.method2118();
                if (this.field2439[var7] > var6) {
                    var6 = this.field2439[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2453; var8++) {
                this.field2439[var8] = var5 += var2.method2232();
                if (this.field2439[var8] > var6) {
                    var6 = this.field2439[var8];
                }
            }
        }
        this.field2441 = new int[var6 + 1];
        this.field2443 = new int[var6 + 1];
        this.field2444 = new int[var6 + 1];
        this.field2445 = new int[var6 + 1][];
        this.field2438 = new Object[var6 + 1];
        this.field2449 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2446 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2453; var9++) {
                this.field2446[this.field2439[var9]] = var2.method2207();
            }
            this.field2454 = new class170(this.field2446);
        }
        for (int var10 = 0; var10 < this.field2453; var10++) {
            this.field2441[this.field2439[var10]] = var2.method2207();
        }
        for (int var11 = 0; var11 < this.field2453; var11++) {
            this.field2443[this.field2439[var11]] = var2.method2207();
        }
        for (int var12 = 0; var12 < this.field2453; var12++) {
            this.field2444[this.field2439[var12]] = var2.method2232();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2453; var13++) {
                int var14 = this.field2439[var13];
                int var15 = this.field2444[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2445[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2445[var14][var18] = var16 += var2.method2118();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2449[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2453; var20++) {
                int var21 = this.field2439[var20];
                int var22 = this.field2444[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2445[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2445[var21][var25] = var23 += var2.method2232();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2449[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2448 = new int[var6 + 1][];
        this.field2447 = new class170[var6 + 1];
        for (int var27 = 0; var27 < this.field2453; var27++) {
            int var28 = this.field2439[var27];
            int var29 = this.field2444[var28];
            this.field2448[var28] = new int[this.field2449[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2448[var28][this.field2445[var28][var30]] = var2.method2207();
            }
            this.field2447[var28] = new class170(this.field2448[var28]);
        }
    }

    @ObfuscatedName("ez.o(IB)V")
    public void method2707(int arg0) {
    }

    @ObfuscatedName("ez.y(III)[B")
    public byte[] method2709(int arg0, int arg1) {
        return this.method2684(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ez.b(II[II)[B")
    public byte[] method2684(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2449.length || this.field2449[arg0] == null || arg1 < 0 || arg1 >= this.field2449[arg0].length) {
            return null;
        }
        if (this.field2449[arg0][arg1] == null) {
            boolean var4 = this.method2654(arg0, arg2);
            if (!var4) {
                this.method2648(arg0);
                boolean var5 = this.method2654(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class112.method797(this.field2449[arg0][arg1], false);
        if (this.field2442) {
            this.field2449[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ez.w(IIB)Z")
    public boolean method2649(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2449.length || this.field2449[arg0] == null || arg1 < 0 || arg1 >= this.field2449[arg0].length) {
            return false;
        } else if (this.field2449[arg0][arg1] != null) {
            return true;
        } else if (this.field2438[arg0] == null) {
            this.method2648(arg0);
            return this.field2438[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.r(IB)Z")
    public boolean method2643(int arg0) {
        if (this.field2438[arg0] == null) {
            this.method2648(arg0);
            return this.field2438[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ez.l(S)Z")
    public boolean method2644() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2439.length; var2++) {
            int var3 = this.field2439[var2];
            if (this.field2438[var3] == null) {
                this.method2648(var3);
                if (this.field2438[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ez.s(IB)[B")
    public byte[] method2650(int arg0) {
        if (this.field2449.length == 1) {
            return this.method2709(0, arg0);
        } else if (this.field2449[arg0].length == 1) {
            return this.method2709(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.f(III)[B")
    public byte[] method2640(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2449.length || this.field2449[arg0] == null || arg1 < 0 || arg1 >= this.field2449[arg0].length) {
            return null;
        }
        if (this.field2449[arg0][arg1] == null) {
            boolean var3 = this.method2654(arg0, (int[]) null);
            if (!var3) {
                this.method2648(arg0);
                boolean var4 = this.method2654(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class112.method797(this.field2449[arg0][arg1], false);
    }

    @ObfuscatedName("ez.x(II)[B")
    public byte[] method2647(int arg0) {
        if (this.field2449.length == 1) {
            return this.method2640(0, arg0);
        } else if (this.field2449[arg0].length == 1) {
            return this.method2640(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ez.h(II)V")
    public void method2648(int arg0) {
    }

    @ObfuscatedName("ez.a(II)[I")
    public int[] method2657(int arg0) {
        return this.field2445[arg0];
    }

    @ObfuscatedName("ez.u(IB)I")
    public int method2670(int arg0) {
        return this.field2449[arg0].length;
    }

    @ObfuscatedName("ez.v(B)I")
    public int method2688() {
        return this.field2449.length;
    }

    @ObfuscatedName("ez.i(II)V")
    public void method2652(int arg0) {
        for (int var2 = 0; var2 < this.field2449[arg0].length; var2++) {
            this.field2449[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ez.n(B)V")
    public void method2701() {
        for (int var1 = 0; var1 < this.field2449.length; var1++) {
            if (this.field2449[var1] != null) {
                for (int var2 = 0; var2 < this.field2449[var1].length; var2++) {
                    this.field2449[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ez.d(I[II)Z")
    public boolean method2654(int arg0, int[] arg1) {
        if (this.field2438[arg0] == null) {
            return false;
        }
        int var3 = this.field2444[arg0];
        int[] var4 = this.field2445[arg0];
        Object[] var5 = this.field2449[arg0];
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
            var8 = class112.method797(this.field2438[arg0], true);
            class107 var9 = new class107(var8);
            var9.method2082(arg1, 5, var9.field1840.length);
        } else {
            var8 = class112.method797(this.field2438[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1994(var8);
        } catch (RuntimeException var27) {
            throw Statics.method2344(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class107.method1296(var8, var8.length) + "," + class107.method1296(var8, var8.length - 2) + "," + this.field2441[arg0] + "," + this.field2451);
        }
        if (this.field2452) {
            this.field2438[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class107 var15 = new class107(var10);
            int[] var16 = new int[var3];
            var15.field1841 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2207();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1841 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2207();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2442) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class112.method598(var20[var26], false);
                }
            }
        } else if (this.field2442) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class112.method598(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ez.k(Ljava/lang/String;I)I")
    public int method2655(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2454.method3056(class199.method3229(var2));
    }

    @ObfuscatedName("ez.p(ILjava/lang/String;I)I")
    public int method2656(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2447[arg0].method3056(class199.method3229(var3));
    }

    @ObfuscatedName("ez.j(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2669(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3056(class199.method3229(var3));
        int var6 = this.field2447[var5].method3056(class199.method3229(var4));
        return this.method2709(var5, var6);
    }

    @ObfuscatedName("ez.z(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2658(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2454.method3056(class199.method3229(var3));
        int var6 = this.field2447[var5].method3056(class199.method3229(var4));
        return this.method2649(var5, var6);
    }

    @ObfuscatedName("ez.t(Ljava/lang/String;I)Z")
    public boolean method2659(String arg0) {
        int var2 = this.method2655("");
        return var2 == -1 ? this.method2658(arg0, "") : this.method2658("", arg0);
    }

    @ObfuscatedName("ez.c(Ljava/lang/String;I)V")
    public void method2660(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2454.method3056(class199.method3229(var2));
        if (var3 >= 0) {
            this.method2707(var3);
        }
    }

    @ObfuscatedName("cz.q([BB)[B")
    public static final byte[] method1994(byte[] arg0) {
        class107 var1 = new class107(arg0);
        int var2 = var1.method2123();
        int var3 = var1.method2207();
        if (var3 < 0 || !(field2440 == 0 || var3 <= field2440)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2076(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2207();
            if (var5 < 0 || field2440 != 0 && var5 > field2440) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class105.method2028(var6, var5, arg0, var3, 9);
            } else {
                field2450.method2016(var1, var6);
            }
            return var6;
        }
    }
}
