package deob;

@ObfuscatedName("ff")
public abstract class class167 {

    @ObfuscatedName("ff.j")
    public int field2684;

    @ObfuscatedName("ff.l")
    public int[] field2680;

    @ObfuscatedName("ff.a")
    public int[] field2681;

    @ObfuscatedName("ff.i")
    public class192 field2682;

    @ObfuscatedName("ff.f")
    public int[] field2683;

    @ObfuscatedName("ff.m")
    public int[] field2698;

    @ObfuscatedName("ff.o")
    public int[] field2685;

    @ObfuscatedName("ff.h")
    public int[][] field2686;

    @ObfuscatedName("ff.n")
    public int[][] field2687;

    @ObfuscatedName("ff.k")
    public class192[] field2688;

    @ObfuscatedName("ff.r")
    public Object[] field2696;

    @ObfuscatedName("ff.b")
    public Object[][] field2690;

    @ObfuscatedName("ff.q")
    public static class116 field2693 = new class116();

    @ObfuscatedName("ff.u")
    public int field2689;

    @ObfuscatedName("ff.g")
    public boolean field2691;

    @ObfuscatedName("ff.y")
    public boolean field2694;

    @ObfuscatedName("ff.s")
    public static int field2695 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2691 = arg0;
        this.field2694 = arg1;
    }

    @ObfuscatedName("ff.j([BI)V")
    public void method3003(byte[] arg0) {
        this.field2689 = class119.method39(arg0, arg0.length);
        class119 var2 = new class119(method591(arg0));
        int var3 = var2.method2316();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2321();
        }
        int var4 = var2.method2316();
        if (var3 >= 7) {
            this.field2684 = var2.method2330();
        } else {
            this.field2684 = var2.method2318();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2680 = new int[this.field2684];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2684; var7++) {
                this.field2680[var7] = var5 += var2.method2330();
                if (this.field2680[var7] > var6) {
                    var6 = this.field2680[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2684; var8++) {
                this.field2680[var8] = var5 += var2.method2318();
                if (this.field2680[var8] > var6) {
                    var6 = this.field2680[var8];
                }
            }
        }
        this.field2683 = new int[var6 + 1];
        this.field2698 = new int[var6 + 1];
        this.field2685 = new int[var6 + 1];
        this.field2686 = new int[var6 + 1][];
        this.field2696 = new Object[var6 + 1];
        this.field2690 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2681 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2684; var9++) {
                this.field2681[this.field2680[var9]] = var2.method2321();
            }
            this.field2682 = new class192(this.field2681);
        }
        for (int var10 = 0; var10 < this.field2684; var10++) {
            this.field2683[this.field2680[var10]] = var2.method2321();
        }
        for (int var11 = 0; var11 < this.field2684; var11++) {
            this.field2698[this.field2680[var11]] = var2.method2321();
        }
        for (int var12 = 0; var12 < this.field2684; var12++) {
            this.field2685[this.field2680[var12]] = var2.method2318();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2684; var13++) {
                int var14 = this.field2680[var13];
                int var15 = this.field2685[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2686[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2686[var14][var18] = var16 += var2.method2330();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2690[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2684; var20++) {
                int var21 = this.field2680[var20];
                int var22 = this.field2685[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2686[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2686[var21][var25] = var23 += var2.method2318();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2690[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2687 = new int[var6 + 1][];
        this.field2688 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2684; var27++) {
            int var28 = this.field2680[var27];
            int var29 = this.field2685[var28];
            this.field2687[var28] = new int[this.field2690[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2687[var28][this.field2686[var28][var30]] = var2.method2321();
            }
            this.field2688[var28] = new class192(this.field2687[var28]);
        }
    }

    @ObfuscatedName("ff.l(IB)V")
    public void method3004(int arg0) {
    }

    @ObfuscatedName("ff.a(IIS)[B")
    public byte[] method3005(int arg0, int arg1) {
        return this.method3006(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ff.i(II[II)[B")
    public byte[] method3006(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2690.length || this.field2690[arg0] == null || arg1 < 0 || arg1 >= this.field2690[arg0].length) {
            return null;
        }
        if (this.field2690[arg0][arg1] == null) {
            boolean var4 = this.method3019(arg0, arg2);
            if (!var4) {
                this.method3013(arg0);
                boolean var5 = this.method3019(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method185(this.field2690[arg0][arg1], false);
        if (this.field2694) {
            this.field2690[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ff.f(IIB)Z")
    public boolean method3007(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2690.length || this.field2690[arg0] == null || arg1 < 0 || arg1 >= this.field2690[arg0].length) {
            return false;
        } else if (this.field2690[arg0][arg1] != null) {
            return true;
        } else if (this.field2696[arg0] == null) {
            this.method3013(arg0);
            return this.field2696[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.m(IB)Z")
    public boolean method3071(int arg0) {
        if (this.field2696[arg0] == null) {
            this.method3013(arg0);
            return this.field2696[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.o(I)Z")
    public boolean method3069() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2680.length; var2++) {
            int var3 = this.field2680[var2];
            if (this.field2696[var3] == null) {
                this.method3013(var3);
                if (this.field2696[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ff.h(IB)[B")
    public byte[] method3010(int arg0) {
        if (this.field2690.length == 1) {
            return this.method3005(0, arg0);
        } else if (this.field2690[arg0].length == 1) {
            return this.method3005(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.n(III)[B")
    public byte[] method3011(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2690.length || this.field2690[arg0] == null || arg1 < 0 || arg1 >= this.field2690[arg0].length) {
            return null;
        }
        if (this.field2690[arg0][arg1] == null) {
            boolean var3 = this.method3019(arg0, (int[]) null);
            if (!var3) {
                this.method3013(arg0);
                boolean var4 = this.method3019(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method185(this.field2690[arg0][arg1], false);
    }

    @ObfuscatedName("ff.k(II)[B")
    public byte[] method3012(int arg0) {
        if (this.field2690.length == 1) {
            return this.method3011(0, arg0);
        } else if (this.field2690[arg0].length == 1) {
            return this.method3011(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ff.r(II)V")
    public void method3013(int arg0) {
    }

    @ObfuscatedName("ff.b(IB)[I")
    public int[] method3014(int arg0) {
        return this.field2686[arg0];
    }

    @ObfuscatedName("ff.q(IB)I")
    public int method3015(int arg0) {
        return this.field2690[arg0].length;
    }

    @ObfuscatedName("ff.u(I)I")
    public int method3037() {
        return this.field2690.length;
    }

    @ObfuscatedName("ff.g(IB)V")
    public void method3060(int arg0) {
        for (int var2 = 0; var2 < this.field2690[arg0].length; var2++) {
            this.field2690[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ff.y(B)V")
    public void method3018() {
        for (int var1 = 0; var1 < this.field2690.length; var1++) {
            if (this.field2690[var1] != null) {
                for (int var2 = 0; var2 < this.field2690[var1].length; var2++) {
                    this.field2690[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ff.s(I[IB)Z")
    public boolean method3019(int arg0, int[] arg1) {
        if (this.field2696[arg0] == null) {
            return false;
        }
        int var3 = this.field2685[arg0];
        int[] var4 = this.field2686[arg0];
        Object[] var5 = this.field2690[arg0];
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
            var8 = class125.method185(this.field2696[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2335(arg1, 5, var9.field1996.length);
        } else {
            var8 = class125.method185(this.field2696[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method591(var8);
        } catch (RuntimeException var27) {
            throw class148.method2583(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method39(var8, var8.length) + "," + class119.method39(var8, var8.length - 2) + "," + this.field2683[arg0] + "," + this.field2689);
        }
        if (this.field2691) {
            this.field2696[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class119 var15 = new class119(var10);
            int[] var16 = new int[var3];
            var15.field1999 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2321();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1999 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2321();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2694) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method2040(var20[var26], false);
                }
            }
        } else if (this.field2694) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method2040(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ff.d(Ljava/lang/String;I)I")
    public int method3039(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2682.method3462(class163.method557(var2));
    }

    @ObfuscatedName("ff.z(ILjava/lang/String;I)I")
    public int method3029(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2688[arg0].method3462(class163.method557(var3));
    }

    @ObfuscatedName("ff.p(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3052(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2682.method3462(class163.method557(var3));
        int var6 = this.field2688[var5].method3462(class163.method557(var4));
        return this.method3005(var5, var6);
    }

    @ObfuscatedName("ff.w(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3065(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2682.method3462(class163.method557(var3));
        int var6 = this.field2688[var5].method3462(class163.method557(var4));
        return this.method3007(var5, var6);
    }

    @ObfuscatedName("ff.t(Ljava/lang/String;I)Z")
    public boolean method3024(String arg0) {
        int var2 = this.method3039("");
        return var2 == -1 ? this.method3065(arg0, "") : this.method3065("", arg0);
    }

    @ObfuscatedName("ff.c(Ljava/lang/String;I)V")
    public void method3025(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2682.method3462(class163.method557(var2));
        if (var3 >= 0) {
            this.method3004(var3);
        }
    }

    @ObfuscatedName("e.x([BI)[B")
    public static final byte[] method591(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2316();
        int var3 = var1.method2321();
        if (var3 < 0 || !(field2695 == 0 || var3 <= field2695)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2397(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2321();
            if (var5 < 0 || field2695 != 0 && var5 > field2695) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2267(var6, var5, arg0, var3, 9);
            } else {
                field2693.method2264(var1, var6);
            }
            return var6;
        }
    }
}
