package deob;

@ObfuscatedName("fj")
public abstract class class158 {

    @ObfuscatedName("fj.t")
    public int field2564;

    @ObfuscatedName("fj.b")
    public int[] field2558;

    @ObfuscatedName("fj.p")
    public int[] field2560;

    @ObfuscatedName("fj.e")
    public class183 field2554;

    @ObfuscatedName("fj.i")
    public int[] field2566;

    @ObfuscatedName("fj.o")
    public int[] field2556;

    @ObfuscatedName("fj.f")
    public int[] field2551;

    @ObfuscatedName("fj.d")
    public int[][] field2561;

    @ObfuscatedName("fj.j")
    public int[][] field2559;

    @ObfuscatedName("fj.x")
    public class183[] field2552;

    @ObfuscatedName("fj.v")
    public Object[] field2555;

    @ObfuscatedName("fj.a")
    public Object[][] field2562;

    @ObfuscatedName("fj.l")
    public static class108 field2563 = new class108();

    @ObfuscatedName("fj.h")
    public int field2553;

    @ObfuscatedName("fj.c")
    public boolean field2565;

    @ObfuscatedName("fj.u")
    public boolean field2557;

    @ObfuscatedName("fj.r")
    public static int field2567 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2565 = arg0;
        this.field2557 = arg1;
    }

    @ObfuscatedName("fj.t([BI)V")
    public void method2933(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class111.method180(arg0, 0, var2);
        this.field2553 = var3;
        class111 var4 = new class111(method2539(arg0));
        int var5 = var4.method2172();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2177();
        }
        int var6 = var4.method2172();
        if (var5 >= 7) {
            this.field2564 = var4.method2199();
        } else {
            this.field2564 = var4.method2255();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2558 = new int[this.field2564];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2564; var9++) {
                this.field2558[var9] = var7 += var4.method2199();
                if (this.field2558[var9] > var8) {
                    var8 = this.field2558[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2564; var10++) {
                this.field2558[var10] = var7 += var4.method2255();
                if (this.field2558[var10] > var8) {
                    var8 = this.field2558[var10];
                }
            }
        }
        this.field2566 = new int[var8 + 1];
        this.field2556 = new int[var8 + 1];
        this.field2551 = new int[var8 + 1];
        this.field2561 = new int[var8 + 1][];
        this.field2555 = new Object[var8 + 1];
        this.field2562 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2560 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2564; var11++) {
                this.field2560[this.field2558[var11]] = var4.method2177();
            }
            this.field2554 = new class183(this.field2560);
        }
        for (int var12 = 0; var12 < this.field2564; var12++) {
            this.field2566[this.field2558[var12]] = var4.method2177();
        }
        for (int var13 = 0; var13 < this.field2564; var13++) {
            this.field2556[this.field2558[var13]] = var4.method2177();
        }
        for (int var14 = 0; var14 < this.field2564; var14++) {
            this.field2551[this.field2558[var14]] = var4.method2255();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2564; var15++) {
                int var16 = this.field2558[var15];
                int var17 = this.field2551[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2561[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2561[var16][var20] = var18 += var4.method2199();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2562[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2564; var22++) {
                int var23 = this.field2558[var22];
                int var24 = this.field2551[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2561[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2561[var23][var27] = var25 += var4.method2255();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2562[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2559 = new int[var8 + 1][];
        this.field2552 = new class183[var8 + 1];
        for (int var29 = 0; var29 < this.field2564; var29++) {
            int var30 = this.field2558[var29];
            int var31 = this.field2551[var30];
            this.field2559[var30] = new int[this.field2562[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2559[var30][this.field2561[var30][var32]] = var4.method2177();
            }
            this.field2552[var30] = new class183(this.field2559[var30]);
        }
    }

    @ObfuscatedName("fj.b(II)V")
    public void method2945(int arg0) {
    }

    @ObfuscatedName("fj.p(III)[B")
    public byte[] method2881(int arg0, int arg1) {
        return this.method2882(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fj.e(II[II)[B")
    public byte[] method2882(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return null;
        }
        if (this.field2562[arg0][arg1] == null) {
            boolean var4 = this.method2895(arg0, arg2);
            if (!var4) {
                this.method2889(arg0);
                boolean var5 = this.method2895(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method2443(this.field2562[arg0][arg1], false);
        if (this.field2557) {
            this.field2562[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fj.i(IIB)Z")
    public boolean method2953(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return false;
        } else if (this.field2562[arg0][arg1] != null) {
            return true;
        } else if (this.field2555[arg0] == null) {
            this.method2889(arg0);
            return this.field2555[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.o(IB)Z")
    public boolean method2884(int arg0) {
        if (this.field2555[arg0] == null) {
            this.method2889(arg0);
            return this.field2555[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.f(I)Z")
    public boolean method2885() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2558.length; var2++) {
            int var3 = this.field2558[var2];
            if (this.field2555[var3] == null) {
                this.method2889(var3);
                if (this.field2555[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.d(II)[B")
    public byte[] method2886(int arg0) {
        if (this.field2562.length == 1) {
            return this.method2881(0, arg0);
        } else if (this.field2562[arg0].length == 1) {
            return this.method2881(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.j(III)[B")
    public byte[] method2912(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2562.length || this.field2562[arg0] == null || arg1 < 0 || arg1 >= this.field2562[arg0].length) {
            return null;
        }
        if (this.field2562[arg0][arg1] == null) {
            boolean var3 = this.method2895(arg0, (int[]) null);
            if (!var3) {
                this.method2889(arg0);
                boolean var4 = this.method2895(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method2443(this.field2562[arg0][arg1], false);
    }

    @ObfuscatedName("fj.x(II)[B")
    public byte[] method2888(int arg0) {
        if (this.field2562.length == 1) {
            return this.method2912(0, arg0);
        } else if (this.field2562[arg0].length == 1) {
            return this.method2912(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.v(II)V")
    public void method2889(int arg0) {
    }

    @ObfuscatedName("fj.a(II)[I")
    public int[] method2899(int arg0) {
        return this.field2561[arg0];
    }

    @ObfuscatedName("fj.l(II)I")
    public int method2891(int arg0) {
        return this.field2562[arg0].length;
    }

    @ObfuscatedName("fj.h(S)I")
    public int method2890() {
        return this.field2562.length;
    }

    @ObfuscatedName("fj.c(IB)V")
    public void method2887(int arg0) {
        for (int var2 = 0; var2 < this.field2562[arg0].length; var2++) {
            this.field2562[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fj.u(B)V")
    public void method2894() {
        for (int var1 = 0; var1 < this.field2562.length; var1++) {
            if (this.field2562[var1] != null) {
                for (int var2 = 0; var2 < this.field2562[var1].length; var2++) {
                    this.field2562[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fj.r(I[IS)Z")
    public boolean method2895(int arg0, int[] arg1) {
        if (this.field2555[arg0] == null) {
            return false;
        }
        int var3 = this.field2551[arg0];
        int[] var4 = this.field2561[arg0];
        Object[] var5 = this.field2562[arg0];
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
            var8 = class117.method2443(this.field2555[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2317(arg1, 5, var9.field1869.length);
        } else {
            var8 = class117.method2443(this.field2555[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2539(var8);
        } catch (RuntimeException var38) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class111.field1868[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = class111.method180(var8, 0, var21);
            throw class140.method2004(var38, var20 + var22 + "," + this.field2566[arg0] + "," + this.field2553);
        }
        if (this.field2565) {
            this.field2555[arg0] = null;
        }
        if (var3 > 1) {
            int var23 = var10.length;
            int var39 = var23 - 1;
            int var24 = var10[var39] & 0xFF;
            int var25 = var39 - var3 * var24 * 4;
            class111 var26 = new class111(var10);
            int[] var27 = new int[var3];
            var26.field1867 = var25;
            for (int var28 = 0; var28 < var24; var28++) {
                int var29 = 0;
                for (int var30 = 0; var30 < var3; var30++) {
                    var29 += var26.method2177();
                    var27[var30] += var29;
                }
            }
            byte[][] var31 = new byte[var3][];
            for (int var32 = 0; var32 < var3; var32++) {
                var31[var32] = new byte[var27[var32]];
                var27[var32] = 0;
            }
            var26.field1867 = var25;
            int var33 = 0;
            for (int var34 = 0; var34 < var24; var34++) {
                int var35 = 0;
                for (int var36 = 0; var36 < var3; var36++) {
                    var35 += var26.method2177();
                    System.arraycopy(var10, var33, var31[var36], var27[var36], var35);
                    var27[var36] += var35;
                    var33 += var35;
                }
            }
            for (int var37 = 0; var37 < var3; var37++) {
                if (this.field2557) {
                    var5[var4[var37]] = var31[var37];
                } else {
                    var5[var4[var37]] = class117.method3532(var31[var37], false);
                }
            }
        } else if (this.field2557) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method3532(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fj.k(Ljava/lang/String;I)I")
    public int method2892(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2554.method3333(class154.method1451(var2));
    }

    @ObfuscatedName("fj.w(ILjava/lang/String;I)I")
    public int method2897(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2552[arg0].method3333(class154.method1451(var3));
    }

    @ObfuscatedName("fj.q(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2898(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2554.method3333(class154.method1451(var3));
        int var6 = this.field2552[var5].method3333(class154.method1451(var4));
        return this.method2881(var5, var6);
    }

    @ObfuscatedName("fj.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2880(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2554.method3333(class154.method1451(var3));
        int var6 = this.field2552[var5].method3333(class154.method1451(var4));
        return this.method2953(var5, var6);
    }

    @ObfuscatedName("fj.z(Ljava/lang/String;B)Z")
    public boolean method2900(String arg0) {
        int var2 = this.method2892("");
        return var2 == -1 ? this.method2880(arg0, "") : this.method2880("", arg0);
    }

    @ObfuscatedName("fj.m(Ljava/lang/String;I)V")
    public void method2901(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2554.method3333(class154.method1451(var2));
        if (var3 >= 0) {
            this.method2945(var3);
        }
    }

    @ObfuscatedName("dg.y([BB)[B")
    public static final byte[] method2539(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2172();
        int var3 = var1.method2177();
        if (var3 < 0 || !(field2567 == 0 || var3 <= field2567)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2281(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2177();
            if (var5 < 0 || field2567 != 0 && var5 > field2567) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2143(var6, var5, arg0, var3, 9);
            } else {
                field2563.method2117(var1, var6);
            }
            return var6;
        }
    }
}
