package deob;

@ObfuscatedName("fj")
public abstract class class158 {

    @ObfuscatedName("fj.b")
    public int field2556;

    @ObfuscatedName("fj.e")
    public int[] field2569;

    @ObfuscatedName("fj.a")
    public int[] field2557;

    @ObfuscatedName("fj.k")
    public class183 field2560;

    @ObfuscatedName("fj.p")
    public int[] field2559;

    @ObfuscatedName("fj.l")
    public int[] field2555;

    @ObfuscatedName("fj.u")
    public int[] field2562;

    @ObfuscatedName("fj.o")
    public int[][] field2566;

    @ObfuscatedName("fj.m")
    public int[][] field2563;

    @ObfuscatedName("fj.q")
    public class183[] field2564;

    @ObfuscatedName("fj.v")
    public Object[] field2565;

    @ObfuscatedName("fj.n")
    public Object[][] field2558;

    @ObfuscatedName("fj.z")
    public static class108 field2567 = new class108();

    @ObfuscatedName("fj.r")
    public int field2568;

    @ObfuscatedName("fj.i")
    public boolean field2561;

    @ObfuscatedName("fj.s")
    public boolean field2570;

    @ObfuscatedName("fj.c")
    public static int field2571 = 0;

    public class158(boolean arg0, boolean arg1) {
        this.field2561 = arg0;
        this.field2570 = arg1;
    }

    @ObfuscatedName("fj.b([BB)V")
    public void method2817(byte[] arg0) {
        this.field2568 = class111.method35(arg0, arg0.length);
        class111 var2 = new class111(method1078(arg0));
        int var3 = var2.method2127();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2194();
        }
        int var4 = var2.method2127();
        if (var3 >= 7) {
            this.field2556 = var2.method2141();
        } else {
            this.field2556 = var2.method2129();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2569 = new int[this.field2556];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2556; var7++) {
                this.field2569[var7] = var5 += var2.method2141();
                if (this.field2569[var7] > var6) {
                    var6 = this.field2569[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2556; var8++) {
                this.field2569[var8] = var5 += var2.method2129();
                if (this.field2569[var8] > var6) {
                    var6 = this.field2569[var8];
                }
            }
        }
        this.field2559 = new int[var6 + 1];
        this.field2555 = new int[var6 + 1];
        this.field2562 = new int[var6 + 1];
        this.field2566 = new int[var6 + 1][];
        this.field2565 = new Object[var6 + 1];
        this.field2558 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2557 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2556; var9++) {
                this.field2557[this.field2569[var9]] = var2.method2194();
            }
            this.field2560 = new class183(this.field2557);
        }
        for (int var10 = 0; var10 < this.field2556; var10++) {
            this.field2559[this.field2569[var10]] = var2.method2194();
        }
        for (int var11 = 0; var11 < this.field2556; var11++) {
            this.field2555[this.field2569[var11]] = var2.method2194();
        }
        for (int var12 = 0; var12 < this.field2556; var12++) {
            this.field2562[this.field2569[var12]] = var2.method2129();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2556; var13++) {
                int var14 = this.field2569[var13];
                int var15 = this.field2562[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2566[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2566[var14][var18] = var16 += var2.method2141();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2558[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2556; var20++) {
                int var21 = this.field2569[var20];
                int var22 = this.field2562[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2566[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2566[var21][var25] = var23 += var2.method2129();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2558[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2563 = new int[var6 + 1][];
        this.field2564 = new class183[var6 + 1];
        for (int var27 = 0; var27 < this.field2556; var27++) {
            int var28 = this.field2569[var27];
            int var29 = this.field2562[var28];
            this.field2563[var28] = new int[this.field2558[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2563[var28][this.field2566[var28][var30]] = var2.method2194();
            }
            this.field2564[var28] = new class183(this.field2563[var28]);
        }
    }

    @ObfuscatedName("fj.e(IB)V")
    public void method2818(int arg0) {
    }

    @ObfuscatedName("fj.a(III)[B")
    public byte[] method2819(int arg0, int arg1) {
        return this.method2835(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fj.k(II[IB)[B")
    public byte[] method2835(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2558.length || this.field2558[arg0] == null || arg1 < 0 || arg1 >= this.field2558[arg0].length) {
            return null;
        }
        if (this.field2558[arg0][arg1] == null) {
            boolean var4 = this.method2832(arg0, arg2);
            if (!var4) {
                this.method2826(arg0);
                boolean var5 = this.method2832(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class117.method2073(this.field2558[arg0][arg1], false);
        if (this.field2570) {
            this.field2558[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fj.p(III)Z")
    public boolean method2821(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2558.length || this.field2558[arg0] == null || arg1 < 0 || arg1 >= this.field2558[arg0].length) {
            return false;
        } else if (this.field2558[arg0][arg1] != null) {
            return true;
        } else if (this.field2565[arg0] == null) {
            this.method2826(arg0);
            return this.field2565[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.l(II)Z")
    public boolean method2822(int arg0) {
        if (this.field2565[arg0] == null) {
            this.method2826(arg0);
            return this.field2565[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.u(B)Z")
    public boolean method2823() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2569.length; var2++) {
            int var3 = this.field2569[var2];
            if (this.field2565[var3] == null) {
                this.method2826(var3);
                if (this.field2565[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.o(II)[B")
    public byte[] method2860(int arg0) {
        if (this.field2558.length == 1) {
            return this.method2819(0, arg0);
        } else if (this.field2558[arg0].length == 1) {
            return this.method2819(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.m(IIB)[B")
    public byte[] method2824(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2558.length || this.field2558[arg0] == null || arg1 < 0 || arg1 >= this.field2558[arg0].length) {
            return null;
        }
        if (this.field2558[arg0][arg1] == null) {
            boolean var3 = this.method2832(arg0, (int[]) null);
            if (!var3) {
                this.method2826(arg0);
                boolean var4 = this.method2832(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class117.method2073(this.field2558[arg0][arg1], false);
    }

    @ObfuscatedName("fj.q(IB)[B")
    public byte[] method2879(int arg0) {
        if (this.field2558.length == 1) {
            return this.method2824(0, arg0);
        } else if (this.field2558[arg0].length == 1) {
            return this.method2824(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.v(IB)V")
    public void method2826(int arg0) {
    }

    @ObfuscatedName("fj.n(IB)[I")
    public int[] method2827(int arg0) {
        return this.field2566[arg0];
    }

    @ObfuscatedName("fj.z(II)I")
    public int method2828(int arg0) {
        return this.field2558[arg0].length;
    }

    @ObfuscatedName("fj.r(I)I")
    public int method2829() {
        return this.field2558.length;
    }

    @ObfuscatedName("fj.i(IS)V")
    public void method2847(int arg0) {
        for (int var2 = 0; var2 < this.field2558[arg0].length; var2++) {
            this.field2558[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fj.s(B)V")
    public void method2831() {
        for (int var1 = 0; var1 < this.field2558.length; var1++) {
            if (this.field2558[var1] != null) {
                for (int var2 = 0; var2 < this.field2558[var1].length; var2++) {
                    this.field2558[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fj.c(I[IB)Z")
    public boolean method2832(int arg0, int[] arg1) {
        if (this.field2565[arg0] == null) {
            return false;
        }
        int var3 = this.field2562[arg0];
        int[] var4 = this.field2566[arg0];
        Object[] var5 = this.field2558[arg0];
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
            var8 = class117.method2073(this.field2565[arg0], true);
            class111 var9 = new class111(var8);
            var9.method2119(arg1, 5, var9.field1897.length);
        } else {
            var8 = class117.method2073(this.field2565[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1078(var8);
        } catch (RuntimeException var27) {
            throw class140.method934(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class111.method35(var8, var8.length) + "," + class111.method35(var8, var8.length - 2) + "," + this.field2559[arg0] + "," + this.field2568);
        }
        if (this.field2561) {
            this.field2565[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class111 var15 = new class111(var10);
            int[] var16 = new int[var3];
            var15.field1894 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2194();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1894 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2194();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2570) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class117.method119(var20[var26], false);
                }
            }
        } else if (this.field2570) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class117.method119(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fj.t(Ljava/lang/String;B)I")
    public int method2833(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2560.method3249(class154.method2702(var2));
    }

    @ObfuscatedName("fj.h(ILjava/lang/String;I)I")
    public int method2834(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2564[arg0].method3249(class154.method2702(var3));
    }

    @ObfuscatedName("fj.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method2856(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2560.method3249(class154.method2702(var3));
        int var6 = this.field2564[var5].method3249(class154.method2702(var4));
        return this.method2819(var5, var6);
    }

    @ObfuscatedName("fj.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method2840(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2560.method3249(class154.method2702(var3));
        int var6 = this.field2564[var5].method3249(class154.method2702(var4));
        return this.method2821(var5, var6);
    }

    @ObfuscatedName("fj.f(Ljava/lang/String;I)Z")
    public boolean method2876(String arg0) {
        int var2 = this.method2833("");
        return var2 == -1 ? this.method2840(arg0, "") : this.method2840("", arg0);
    }

    @ObfuscatedName("fj.y(Ljava/lang/String;B)V")
    public void method2838(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2560.method3249(class154.method2702(var2));
        if (var3 >= 0) {
            this.method2818(var3);
        }
    }

    @ObfuscatedName("bw.j([BI)[B")
    public static final byte[] method1078(byte[] arg0) {
        class111 var1 = new class111(arg0);
        int var2 = var1.method2127();
        int var3 = var1.method2194();
        if (var3 < 0 || !(field2571 == 0 || var3 <= field2571)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2212(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2194();
            if (var5 < 0 || field2571 != 0 && var5 > field2571) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class109.method2084(var6, var5, arg0, var3, 9);
            } else {
                field2567.method2076(var1, var6);
            }
            return var6;
        }
    }
}
