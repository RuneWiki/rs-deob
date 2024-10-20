package deob;

@ObfuscatedName("fx")
public abstract class class168 {

    @ObfuscatedName("fx.w")
    public int field2692;

    @ObfuscatedName("fx.x")
    public int[] field2689;

    @ObfuscatedName("fx.t")
    public int[] field2691;

    @ObfuscatedName("fx.p")
    public class193 field2695;

    @ObfuscatedName("fx.e")
    public int[] field2708;

    @ObfuscatedName("fx.y")
    public int[] field2700;

    @ObfuscatedName("fx.m")
    public int[] field2701;

    @ObfuscatedName("fx.c")
    public int[][] field2696;

    @ObfuscatedName("fx.v")
    public int[][] field2697;

    @ObfuscatedName("fx.l")
    public class193[] field2698;

    @ObfuscatedName("fx.z")
    public Object[] field2699;

    @ObfuscatedName("fx.s")
    public Object[][] field2706;

    @ObfuscatedName("fx.j")
    public static class117 field2703 = new class117();

    @ObfuscatedName("fx.q")
    public int field2702;

    @ObfuscatedName("fx.a")
    public boolean field2690;

    @ObfuscatedName("fx.d")
    public boolean field2704;

    @ObfuscatedName("fx.u")
    public static int field2705 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2690 = arg0;
        this.field2704 = arg1;
    }

    @ObfuscatedName("fx.w([BB)V")
    public void method3100(byte[] arg0) {
        this.field2702 = class120.method799(arg0, arg0.length);
        class120 var2 = new class120(method1956(arg0));
        int var3 = var2.method2363();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2368();
        }
        int var4 = var2.method2363();
        if (var3 >= 7) {
            this.field2692 = var2.method2377();
        } else {
            this.field2692 = var2.method2365();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2689 = new int[this.field2692];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2692; var7++) {
                this.field2689[var7] = var5 += var2.method2377();
                if (this.field2689[var7] > var6) {
                    var6 = this.field2689[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2692; var8++) {
                this.field2689[var8] = var5 += var2.method2365();
                if (this.field2689[var8] > var6) {
                    var6 = this.field2689[var8];
                }
            }
        }
        this.field2708 = new int[var6 + 1];
        this.field2700 = new int[var6 + 1];
        this.field2701 = new int[var6 + 1];
        this.field2696 = new int[var6 + 1][];
        this.field2699 = new Object[var6 + 1];
        this.field2706 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2691 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2692; var9++) {
                this.field2691[this.field2689[var9]] = var2.method2368();
            }
            this.field2695 = new class193(this.field2691);
        }
        for (int var10 = 0; var10 < this.field2692; var10++) {
            this.field2708[this.field2689[var10]] = var2.method2368();
        }
        for (int var11 = 0; var11 < this.field2692; var11++) {
            this.field2700[this.field2689[var11]] = var2.method2368();
        }
        for (int var12 = 0; var12 < this.field2692; var12++) {
            this.field2701[this.field2689[var12]] = var2.method2365();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2692; var13++) {
                int var14 = this.field2689[var13];
                int var15 = this.field2701[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2696[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2696[var14][var18] = var16 += var2.method2377();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2706[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2692; var20++) {
                int var21 = this.field2689[var20];
                int var22 = this.field2701[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2696[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2696[var21][var25] = var23 += var2.method2365();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2706[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2697 = new int[var6 + 1][];
        this.field2698 = new class193[var6 + 1];
        for (int var27 = 0; var27 < this.field2692; var27++) {
            int var28 = this.field2689[var27];
            int var29 = this.field2701[var28];
            this.field2697[var28] = new int[this.field2706[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2697[var28][this.field2696[var28][var30]] = var2.method2368();
            }
            this.field2698[var28] = new class193(this.field2697[var28]);
        }
    }

    @ObfuscatedName("fx.x(II)V")
    public void method3080(int arg0) {
    }

    @ObfuscatedName("fx.t(III)[B")
    public byte[] method3127(int arg0, int arg1) {
        return this.method3097(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fx.p(II[II)[B")
    public byte[] method3097(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return null;
        }
        if (this.field2706[arg0][arg1] == null) {
            boolean var4 = this.method3094(arg0, arg2);
            if (!var4) {
                this.method3088(arg0);
                boolean var5 = this.method3094(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method2837(this.field2706[arg0][arg1], false);
        if (this.field2704) {
            this.field2706[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fx.e(III)Z")
    public boolean method3082(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return false;
        } else if (this.field2706[arg0][arg1] != null) {
            return true;
        } else if (this.field2699[arg0] == null) {
            this.method3088(arg0);
            return this.field2699[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.y(II)Z")
    public boolean method3083(int arg0) {
        if (this.field2699[arg0] == null) {
            this.method3088(arg0);
            return this.field2699[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.m(I)Z")
    public boolean method3138() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2689.length; var2++) {
            int var3 = this.field2689[var2];
            if (this.field2699[var3] == null) {
                this.method3088(var3);
                if (this.field2699[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fx.c(II)[B")
    public byte[] method3085(int arg0) {
        if (this.field2706.length == 1) {
            return this.method3127(0, arg0);
        } else if (this.field2706[arg0].length == 1) {
            return this.method3127(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.v(IIB)[B")
    public byte[] method3086(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2706.length || this.field2706[arg0] == null || arg1 < 0 || arg1 >= this.field2706[arg0].length) {
            return null;
        }
        if (this.field2706[arg0][arg1] == null) {
            boolean var3 = this.method3094(arg0, (int[]) null);
            if (!var3) {
                this.method3088(arg0);
                boolean var4 = this.method3094(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method2837(this.field2706[arg0][arg1], false);
    }

    @ObfuscatedName("fx.l(II)[B")
    public byte[] method3087(int arg0) {
        if (this.field2706.length == 1) {
            return this.method3086(0, arg0);
        } else if (this.field2706[arg0].length == 1) {
            return this.method3086(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.z(IB)V")
    public void method3088(int arg0) {
    }

    @ObfuscatedName("fx.s(IB)[I")
    public int[] method3124(int arg0) {
        return this.field2696[arg0];
    }

    @ObfuscatedName("fx.j(II)I")
    public int method3122(int arg0) {
        return this.field2706[arg0].length;
    }

    @ObfuscatedName("fx.q(I)I")
    public int method3091() {
        return this.field2706.length;
    }

    @ObfuscatedName("fx.a(IB)V")
    public void method3092(int arg0) {
        for (int var2 = 0; var2 < this.field2706[arg0].length; var2++) {
            this.field2706[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fx.d(B)V")
    public void method3090() {
        for (int var1 = 0; var1 < this.field2706.length; var1++) {
            if (this.field2706[var1] != null) {
                for (int var2 = 0; var2 < this.field2706[var1].length; var2++) {
                    this.field2706[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fx.u(I[II)Z")
    public boolean method3094(int arg0, int[] arg1) {
        if (this.field2699[arg0] == null) {
            return false;
        }
        int var3 = this.field2701[arg0];
        int[] var4 = this.field2696[arg0];
        Object[] var5 = this.field2706[arg0];
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
            var8 = class126.method2837(this.field2699[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2382(arg1, 5, var9.field2013.length);
        } else {
            var8 = class126.method2837(this.field2699[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1956(var8);
        } catch (RuntimeException var27) {
            throw class149.method186(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class120.method799(var8, var8.length) + "," + class120.method799(var8, var8.length - 2) + "," + this.field2708[arg0] + "," + this.field2702);
        }
        if (this.field2690) {
            this.field2699[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class120 var15 = new class120(var10);
            int[] var16 = new int[var3];
            var15.field2012 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2368();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2012 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2368();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2704) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class126.method2294(var20[var26], false);
                }
            }
        } else if (this.field2704) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method2294(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fx.i(Ljava/lang/String;B)I")
    public int method3095(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2695.method3517(class164.method2679(var2));
    }

    @ObfuscatedName("fx.o(ILjava/lang/String;B)I")
    public int method3081(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2698[arg0].method3517(class164.method2679(var3));
    }

    @ObfuscatedName("fx.h(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3144(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2695.method3517(class164.method2679(var3));
        int var6 = this.field2698[var5].method3517(class164.method2679(var4));
        return this.method3127(var5, var6);
    }

    @ObfuscatedName("fx.k(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3104(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2695.method3517(class164.method2679(var3));
        int var6 = this.field2698[var5].method3517(class164.method2679(var4));
        return this.method3082(var5, var6);
    }

    @ObfuscatedName("fx.f(Ljava/lang/String;I)Z")
    public boolean method3123(String arg0) {
        int var2 = this.method3095("");
        return var2 == -1 ? this.method3104(arg0, "") : this.method3104("", arg0);
    }

    @ObfuscatedName("fx.r(Ljava/lang/String;B)V")
    public void method3089(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2695.method3517(class164.method2679(var2));
        if (var3 >= 0) {
            this.method3080(var3);
        }
    }

    @ObfuscatedName("cd.n([BB)[B")
    public static final byte[] method1956(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2363();
        int var3 = var1.method2368();
        if (var3 < 0 || !(field2705 == 0 || var3 <= field2705)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2388(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2368();
            if (var5 < 0 || field2705 != 0 && var5 > field2705) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2321(var6, var5, arg0, var3, 9);
            } else {
                field2703.method2311(var1, var6);
            }
            return var6;
        }
    }
}
