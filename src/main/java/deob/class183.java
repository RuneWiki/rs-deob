package deob;

@ObfuscatedName("gp")
public abstract class class183 {

    @ObfuscatedName("gp.p")
    public int field2713;

    @ObfuscatedName("gp.g")
    public int[] field2708;

    @ObfuscatedName("gp.x")
    public int[] field2703;

    @ObfuscatedName("gp.q")
    public class123 field2717;

    @ObfuscatedName("gp.d")
    public int[] field2705;

    @ObfuscatedName("gp.k")
    public int[] field2706;

    @ObfuscatedName("gp.j")
    public int[] field2707;

    @ObfuscatedName("gp.s")
    public int[][] field2701;

    @ObfuscatedName("gp.o")
    public int[][] field2709;

    @ObfuscatedName("gp.a")
    public class123[] field2710;

    @ObfuscatedName("gp.c")
    public Object[] field2711;

    @ObfuscatedName("gp.m")
    public Object[][] field2714;

    @ObfuscatedName("gp.h")
    public static class147 field2712 = new class147();

    @ObfuscatedName("gp.r")
    public int field2704;

    @ObfuscatedName("gp.u")
    public boolean field2715;

    @ObfuscatedName("gp.i")
    public boolean field2716;

    @ObfuscatedName("gp.z")
    public static int field2702 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2715 = arg0;
        this.field2716 = arg1;
    }

    @ObfuscatedName("gp.p([BI)V")
    public void method3028(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class154.method2124(arg0, 0, var2);
        this.field2704 = var3;
        class154 var4 = new class154(method182(arg0));
        int var5 = var4.method2593();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2598();
        }
        int var6 = var4.method2593();
        if (var5 >= 7) {
            this.field2713 = var4.method2736();
        } else {
            this.field2713 = var4.method2595();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2708 = new int[this.field2713];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2713; var9++) {
                this.field2708[var9] = var7 += var4.method2736();
                if (this.field2708[var9] > var8) {
                    var8 = this.field2708[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2713; var10++) {
                this.field2708[var10] = var7 += var4.method2595();
                if (this.field2708[var10] > var8) {
                    var8 = this.field2708[var10];
                }
            }
        }
        this.field2705 = new int[var8 + 1];
        this.field2706 = new int[var8 + 1];
        this.field2707 = new int[var8 + 1];
        this.field2701 = new int[var8 + 1][];
        this.field2711 = new Object[var8 + 1];
        this.field2714 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2703 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2713; var11++) {
                this.field2703[this.field2708[var11]] = var4.method2598();
            }
            this.field2717 = new class123(this.field2703);
        }
        for (int var12 = 0; var12 < this.field2713; var12++) {
            this.field2705[this.field2708[var12]] = var4.method2598();
        }
        for (int var13 = 0; var13 < this.field2713; var13++) {
            this.field2706[this.field2708[var13]] = var4.method2598();
        }
        for (int var14 = 0; var14 < this.field2713; var14++) {
            this.field2707[this.field2708[var14]] = var4.method2595();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2713; var15++) {
                int var16 = this.field2708[var15];
                int var17 = this.field2707[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2701[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2701[var16][var20] = var18 += var4.method2736();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2714[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2713; var22++) {
                int var23 = this.field2708[var22];
                int var24 = this.field2707[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2701[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2701[var23][var27] = var25 += var4.method2595();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2714[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2709 = new int[var8 + 1][];
        this.field2710 = new class123[var8 + 1];
        for (int var29 = 0; var29 < this.field2713; var29++) {
            int var30 = this.field2708[var29];
            int var31 = this.field2707[var30];
            this.field2709[var30] = new int[this.field2714[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2709[var30][this.field2701[var30][var32]] = var4.method2598();
            }
            this.field2710[var30] = new class123(this.field2709[var30]);
        }
    }

    @ObfuscatedName("gp.g(II)V")
    public void method3029(int arg0) {
    }

    @ObfuscatedName("gp.x(III)[B")
    public byte[] method3044(int arg0, int arg1) {
        return this.method3031(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gp.q(II[II)[B")
    public byte[] method3031(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2714.length || this.field2714[arg0] == null || arg1 < 0 || arg1 >= this.field2714[arg0].length) {
            return null;
        }
        if (this.field2714[arg0][arg1] == null) {
            boolean var4 = this.method3083(arg0, arg2);
            if (!var4) {
                this.method3038(arg0);
                boolean var5 = this.method3083(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method33(this.field2714[arg0][arg1], false);
        if (this.field2716) {
            this.field2714[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gp.d(III)Z")
    public boolean method3085(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2714.length || this.field2714[arg0] == null || arg1 < 0 || arg1 >= this.field2714[arg0].length) {
            return false;
        } else if (this.field2714[arg0][arg1] != null) {
            return true;
        } else if (this.field2711[arg0] == null) {
            this.method3038(arg0);
            return this.field2711[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gp.k(IB)Z")
    public boolean method3033(int arg0) {
        if (this.field2711[arg0] == null) {
            this.method3038(arg0);
            return this.field2711[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gp.j(B)Z")
    public boolean method3034() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2708.length; var2++) {
            int var3 = this.field2708[var2];
            if (this.field2711[var3] == null) {
                this.method3038(var3);
                if (this.field2711[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gp.s(IB)[B")
    public byte[] method3051(int arg0) {
        if (this.field2714.length == 1) {
            return this.method3044(0, arg0);
        } else if (this.field2714[arg0].length == 1) {
            return this.method3044(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gp.o(III)[B")
    public byte[] method3103(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2714.length || this.field2714[arg0] == null || arg1 < 0 || arg1 >= this.field2714[arg0].length) {
            return null;
        }
        if (this.field2714[arg0][arg1] == null) {
            boolean var3 = this.method3083(arg0, (int[]) null);
            if (!var3) {
                this.method3038(arg0);
                boolean var4 = this.method3083(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method33(this.field2714[arg0][arg1], false);
    }

    @ObfuscatedName("gp.a(II)[B")
    public byte[] method3096(int arg0) {
        if (this.field2714.length == 1) {
            return this.method3103(0, arg0);
        } else if (this.field2714[arg0].length == 1) {
            return this.method3103(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gp.c(II)V")
    public void method3038(int arg0) {
    }

    @ObfuscatedName("gp.u(II)[I")
    public int[] method3039(int arg0) {
        return this.field2701[arg0];
    }

    @ObfuscatedName("gp.i(II)I")
    public int method3068(int arg0) {
        return this.field2714[arg0].length;
    }

    @ObfuscatedName("gp.z(I)I")
    public int method3041() {
        return this.field2714.length;
    }

    @ObfuscatedName("gp.n(II)V")
    public void method3097(int arg0) {
        for (int var2 = 0; var2 < this.field2714[arg0].length; var2++) {
            this.field2714[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gp.w(I)V")
    public void method3070() {
        for (int var1 = 0; var1 < this.field2714.length; var1++) {
            if (this.field2714[var1] != null) {
                for (int var2 = 0; var2 < this.field2714[var1].length; var2++) {
                    this.field2714[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gp.y(I[II)Z")
    public boolean method3083(int arg0, int[] arg1) {
        if (this.field2711[arg0] == null) {
            return false;
        }
        int var3 = this.field2707[arg0];
        int[] var4 = this.field2701[arg0];
        Object[] var5 = this.field2714[arg0];
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
            var8 = class157.method33(this.field2711[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2612(arg1, 5, var9.field2092.length);
        } else {
            var8 = class157.method33(this.field2711[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method182(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class154.method2124(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class154.method2124(var8, 0, var17);
            throw class102.method1044(var34, var16 + var18 + "," + this.field2705[arg0] + "," + this.field2704);
        }
        if (this.field2715) {
            this.field2711[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class154 var22 = new class154(var10);
            int[] var23 = new int[var3];
            var22.field2098 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2598();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2098 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2598();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2716) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class157.method652(var27[var33], false);
                }
            }
        } else if (this.field2716) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method652(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gp.v(Ljava/lang/String;I)I")
    public int method3035(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2717.method2155(class208.method1950(var2));
    }

    @ObfuscatedName("gp.f(ILjava/lang/String;I)I")
    public int method3046(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2710[arg0].method2155(class208.method1950(var3));
    }

    @ObfuscatedName("gp.l(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3047(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2717.method2155(class208.method1950(var3));
        int var6 = this.field2710[var5].method2155(class208.method1950(var4));
        return this.method3044(var5, var6);
    }

    @ObfuscatedName("gp.t(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3048(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2717.method2155(class208.method1950(var3));
        int var6 = this.field2710[var5].method2155(class208.method1950(var4));
        return this.method3085(var5, var6);
    }

    @ObfuscatedName("gp.b(Ljava/lang/String;I)Z")
    public boolean method3049(String arg0) {
        int var2 = this.method3035("");
        return var2 == -1 ? this.method3048(arg0, "") : this.method3048("", arg0);
    }

    @ObfuscatedName("gp.e(Ljava/lang/String;B)V")
    public void method3050(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2717.method2155(class208.method1950(var2));
        if (var3 >= 0) {
            this.method3029(var3);
        }
    }

    @ObfuscatedName("u.ai([BI)[B")
    public static final byte[] method182(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2593();
        int var3 = var1.method2598();
        if (var3 < 0 || !(field2702 == 0 || var3 <= field2702)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2603(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2598();
            if (var5 < 0 || field2702 != 0 && var5 > field2702) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2535(var6, var5, arg0, var3, 9);
            } else {
                field2712.method2528(var1, var6);
            }
            return var6;
        }
    }
}
