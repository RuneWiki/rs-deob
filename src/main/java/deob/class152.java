package deob;

@ObfuscatedName("ej")
public abstract class class152 {

    @ObfuscatedName("ej.x")
    public int field2502;

    @ObfuscatedName("ej.p")
    public int[] field2495;

    @ObfuscatedName("ej.k")
    public int[] field2500;

    @ObfuscatedName("ej.a")
    public class169 field2497;

    @ObfuscatedName("ej.q")
    public int[] field2501;

    @ObfuscatedName("ej.j")
    public int[] field2499;

    @ObfuscatedName("ej.v")
    public int[] field2496;

    @ObfuscatedName("ej.w")
    public int[][] field2509;

    @ObfuscatedName("ej.l")
    public int[][] field2494;

    @ObfuscatedName("ej.s")
    public class169[] field2503;

    @ObfuscatedName("ej.n")
    public Object[] field2504;

    @ObfuscatedName("ej.c")
    public Object[][] field2498;

    @ObfuscatedName("ej.h")
    public static class122 field2506 = new class122();

    @ObfuscatedName("ej.u")
    public int field2505;

    @ObfuscatedName("ej.y")
    public boolean field2508;

    @ObfuscatedName("ej.b")
    public boolean field2507;

    @ObfuscatedName("ej.t")
    public static int field2510 = 0;

    public class152(boolean arg0, boolean arg1) {
        this.field2508 = arg0;
        this.field2507 = arg1;
    }

    @ObfuscatedName("ej.x([BB)V")
    public void method2960(byte[] arg0) {
        this.field2505 = class127.method2391(arg0, arg0.length);
        class127 var2 = new class127(method1385(arg0));
        int var3 = var2.method2484();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2415();
        }
        int var4 = var2.method2484();
        if (var3 >= 7) {
            this.field2502 = var2.method2424();
        } else {
            this.field2502 = var2.method2539();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2495 = new int[this.field2502];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2502; var7++) {
                this.field2495[var7] = var5 += var2.method2424();
                if (this.field2495[var7] > var6) {
                    var6 = this.field2495[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2502; var8++) {
                this.field2495[var8] = var5 += var2.method2539();
                if (this.field2495[var8] > var6) {
                    var6 = this.field2495[var8];
                }
            }
        }
        this.field2501 = new int[var6 + 1];
        this.field2499 = new int[var6 + 1];
        this.field2496 = new int[var6 + 1];
        this.field2509 = new int[var6 + 1][];
        this.field2504 = new Object[var6 + 1];
        this.field2498 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2500 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2502; var9++) {
                this.field2500[this.field2495[var9]] = var2.method2415();
            }
            this.field2497 = new class169(this.field2500);
        }
        for (int var10 = 0; var10 < this.field2502; var10++) {
            this.field2501[this.field2495[var10]] = var2.method2415();
        }
        for (int var11 = 0; var11 < this.field2502; var11++) {
            this.field2499[this.field2495[var11]] = var2.method2415();
        }
        for (int var12 = 0; var12 < this.field2502; var12++) {
            this.field2496[this.field2495[var12]] = var2.method2539();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2502; var13++) {
                int var14 = this.field2495[var13];
                int var15 = this.field2496[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2509[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2509[var14][var18] = var16 += var2.method2424();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2498[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2502; var20++) {
                int var21 = this.field2495[var20];
                int var22 = this.field2496[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2509[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2509[var21][var25] = var23 += var2.method2539();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2498[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2494 = new int[var6 + 1][];
        this.field2503 = new class169[var6 + 1];
        for (int var27 = 0; var27 < this.field2502; var27++) {
            int var28 = this.field2495[var27];
            int var29 = this.field2496[var28];
            this.field2494[var28] = new int[this.field2498[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2494[var28][this.field2509[var28][var30]] = var2.method2415();
            }
            this.field2503[var28] = new class169(this.field2494[var28]);
        }
    }

    @ObfuscatedName("ej.p(II)V")
    public void method2919(int arg0) {
    }

    @ObfuscatedName("ej.k(III)[B")
    public byte[] method2920(int arg0, int arg1) {
        return this.method2921(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ej.a(II[II)[B")
    public byte[] method2921(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2498.length || this.field2498[arg0] == null || arg1 < 0 || arg1 >= this.field2498[arg0].length) {
            return null;
        }
        if (this.field2498[arg0][arg1] == null) {
            boolean var4 = this.method2987(arg0, arg2);
            if (!var4) {
                this.method2935(arg0);
                boolean var5 = this.method2987(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class119.method651(this.field2498[arg0][arg1], false);
        if (this.field2507) {
            this.field2498[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ej.q(IIB)Z")
    public boolean method2983(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2498.length || this.field2498[arg0] == null || arg1 < 0 || arg1 >= this.field2498[arg0].length) {
            return false;
        } else if (this.field2498[arg0][arg1] != null) {
            return true;
        } else if (this.field2504[arg0] == null) {
            this.method2935(arg0);
            return this.field2504[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.j(II)Z")
    public boolean method2923(int arg0) {
        if (this.field2504[arg0] == null) {
            this.method2935(arg0);
            return this.field2504[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ej.v(I)Z")
    public boolean method2965() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2495.length; var2++) {
            int var3 = this.field2495[var2];
            if (this.field2504[var3] == null) {
                this.method2935(var3);
                if (this.field2504[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ej.w(IB)[B")
    public byte[] method2925(int arg0) {
        if (this.field2498.length == 1) {
            return this.method2920(0, arg0);
        } else if (this.field2498[arg0].length == 1) {
            return this.method2920(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.l(IIS)[B")
    public byte[] method2922(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2498.length || this.field2498[arg0] == null || arg1 < 0 || arg1 >= this.field2498[arg0].length) {
            return null;
        }
        if (this.field2498[arg0][arg1] == null) {
            boolean var3 = this.method2987(arg0, (int[]) null);
            if (!var3) {
                this.method2935(arg0);
                boolean var4 = this.method2987(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class119.method651(this.field2498[arg0][arg1], false);
    }

    @ObfuscatedName("ej.s(IB)[B")
    public byte[] method2927(int arg0) {
        if (this.field2498.length == 1) {
            return this.method2922(0, arg0);
        } else if (this.field2498[arg0].length == 1) {
            return this.method2922(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ej.n(II)V")
    public void method2935(int arg0) {
    }

    @ObfuscatedName("ej.c(II)[I")
    public int[] method2982(int arg0) {
        return this.field2509[arg0];
    }

    @ObfuscatedName("ej.h(II)I")
    public int method2929(int arg0) {
        return this.field2498[arg0].length;
    }

    @ObfuscatedName("ej.u(I)I")
    public int method2930() {
        return this.field2498.length;
    }

    @ObfuscatedName("ej.y(IS)V")
    public void method2931(int arg0) {
        for (int var2 = 0; var2 < this.field2498[arg0].length; var2++) {
            this.field2498[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ej.b(I)V")
    public void method2989() {
        for (int var1 = 0; var1 < this.field2498.length; var1++) {
            if (this.field2498[var1] != null) {
                for (int var2 = 0; var2 < this.field2498[var1].length; var2++) {
                    this.field2498[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ej.t(I[II)Z")
    public boolean method2987(int arg0, int[] arg1) {
        if (this.field2504[arg0] == null) {
            return false;
        }
        int var3 = this.field2496[arg0];
        int[] var4 = this.field2509[arg0];
        Object[] var5 = this.field2498[arg0];
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
            var8 = class119.method651(this.field2504[arg0], true);
            class127 var9 = new class127(var8);
            var9.method2427(arg1, 5, var9.field2015.length);
        } else {
            var8 = class119.method651(this.field2504[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1385(var8);
        } catch (RuntimeException var27) {
            throw class80.method2172(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class127.method2391(var8, var8.length) + "," + class127.method2391(var8, var8.length - 2) + "," + this.field2501[arg0] + "," + this.field2505);
        }
        if (this.field2508) {
            this.field2504[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class127 var15 = new class127(var10);
            int[] var16 = new int[var3];
            var15.field2008 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2415();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2008 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2415();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2507) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class119.method662(var20[var26], false);
                }
            }
        } else if (this.field2507) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class119.method662(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ej.r(Ljava/lang/String;I)I")
    public int method2934(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2497.method3193(class147.method2346(var2));
    }

    @ObfuscatedName("ej.g(ILjava/lang/String;I)I")
    public int method2972(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2503[arg0].method3193(class147.method2346(var3));
    }

    @ObfuscatedName("ej.m(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2970(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2497.method3193(class147.method2346(var3));
        int var6 = this.field2503[var5].method3193(class147.method2346(var4));
        return this.method2920(var5, var6);
    }

    @ObfuscatedName("ej.o(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2937(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2497.method3193(class147.method2346(var3));
        int var6 = this.field2503[var5].method3193(class147.method2346(var4));
        return this.method2983(var5, var6);
    }

    @ObfuscatedName("ej.e(Ljava/lang/String;I)V")
    public void method2938(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2497.method3193(class147.method2346(var2));
        if (var3 >= 0) {
            this.method2919(var3);
        }
    }

    @ObfuscatedName("bt.f([BI)[B")
    public static final byte[] method1385(byte[] arg0) {
        class127 var1 = new class127(arg0);
        int var2 = var1.method2484();
        int var3 = var1.method2415();
        if (var3 < 0 || !(field2510 == 0 || var3 <= field2510)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2421(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2415();
            if (var5 < 0 || field2510 != 0 && var5 > field2510) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class123.method2353(var6, var5, arg0, var3, 9);
            } else {
                field2506.method2347(var1, var6);
            }
            return var6;
        }
    }
}
