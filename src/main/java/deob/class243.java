package deob;

@ObfuscatedName("ij")
public abstract class class243 {

    @ObfuscatedName("ij.b")
    public int field3272;

    @ObfuscatedName("ij.s")
    public int[] field3271;

    @ObfuscatedName("ij.r")
    public int[] field3277;

    @ObfuscatedName("ij.g")
    public class195 field3273;

    @ObfuscatedName("ij.x")
    public int[] field3274;

    @ObfuscatedName("ij.f")
    public int[] field3275;

    @ObfuscatedName("ij.u")
    public int[] field3270;

    @ObfuscatedName("ij.t")
    public int[][] field3281;

    @ObfuscatedName("ij.k")
    public int[][] field3278;

    @ObfuscatedName("ij.n")
    public class195[] field3279;

    @ObfuscatedName("ij.d")
    public Object[] field3280;

    @ObfuscatedName("ij.o")
    public Object[][] field3284;

    @ObfuscatedName("ij.a")
    public static class174 field3282 = new class174();

    @ObfuscatedName("ij.q")
    public int field3285;

    @ObfuscatedName("ij.j")
    public boolean field3276;

    @ObfuscatedName("ij.m")
    public boolean field3283;

    @ObfuscatedName("ij.h")
    public static int field3286 = 0;

    public class243(boolean arg0, boolean arg1) {
        this.field3276 = arg0;
        this.field3283 = arg1;
    }

    @ObfuscatedName("ij.b([BI)V")
    public void method3815(byte[] arg0) {
        this.field3285 = class181.method1737(arg0, arg0.length);
        class181 var2 = new class181(method2163(arg0));
        int var3 = var2.method2945();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2996();
        }
        int var4 = var2.method2945();
        if (var3 >= 7) {
            this.field3272 = var2.method2959();
        } else {
            this.field3272 = var2.method3081();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3271 = new int[this.field3272];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3272; var7++) {
                this.field3271[var7] = var5 += var2.method2959();
                if (this.field3271[var7] > var6) {
                    var6 = this.field3271[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3272; var8++) {
                this.field3271[var8] = var5 += var2.method3081();
                if (this.field3271[var8] > var6) {
                    var6 = this.field3271[var8];
                }
            }
        }
        this.field3274 = new int[var6 + 1];
        this.field3275 = new int[var6 + 1];
        this.field3270 = new int[var6 + 1];
        this.field3281 = new int[var6 + 1][];
        this.field3280 = new Object[var6 + 1];
        this.field3284 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3277 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3272; var9++) {
                this.field3277[this.field3271[var9]] = var2.method2996();
            }
            this.field3273 = new class195(this.field3277);
        }
        for (int var10 = 0; var10 < this.field3272; var10++) {
            this.field3274[this.field3271[var10]] = var2.method2996();
        }
        for (int var11 = 0; var11 < this.field3272; var11++) {
            this.field3275[this.field3271[var11]] = var2.method2996();
        }
        for (int var12 = 0; var12 < this.field3272; var12++) {
            this.field3270[this.field3271[var12]] = var2.method3081();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3272; var13++) {
                int var14 = this.field3271[var13];
                int var15 = this.field3270[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3281[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3281[var14][var18] = var16 += var2.method2959();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3284[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3272; var20++) {
                int var21 = this.field3271[var20];
                int var22 = this.field3270[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3281[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3281[var21][var25] = var23 += var2.method3081();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3284[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3278 = new int[var6 + 1][];
        this.field3279 = new class195[var6 + 1];
        for (int var27 = 0; var27 < this.field3272; var27++) {
            int var28 = this.field3271[var27];
            int var29 = this.field3270[var28];
            this.field3278[var28] = new int[this.field3284[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3278[var28][this.field3281[var28][var30]] = var2.method2996();
            }
            this.field3279[var28] = new class195(this.field3278[var28]);
        }
    }

    @ObfuscatedName("ij.s(II)V")
    public void method3872(int arg0) {
    }

    @ObfuscatedName("ij.r(IIB)[B")
    public byte[] method3887(int arg0, int arg1) {
        return this.method3818(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ij.g(II[II)[B")
    public byte[] method3818(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3284.length || this.field3284[arg0] == null || arg1 < 0 || arg1 >= this.field3284[arg0].length) {
            return null;
        }
        if (this.field3284[arg0][arg1] == null) {
            boolean var4 = this.method3855(arg0, arg2);
            if (!var4) {
                this.method3879(arg0);
                boolean var5 = this.method3855(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class184.method961(this.field3284[arg0][arg1], false);
        if (this.field3283) {
            this.field3284[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ij.x(IIB)Z")
    public boolean method3866(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3284.length || this.field3284[arg0] == null || arg1 < 0 || arg1 >= this.field3284[arg0].length) {
            return false;
        } else if (this.field3284[arg0][arg1] != null) {
            return true;
        } else if (this.field3280[arg0] == null) {
            this.method3879(arg0);
            return this.field3280[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ij.f(IB)Z")
    public boolean method3820(int arg0) {
        if (this.field3280[arg0] == null) {
            this.method3879(arg0);
            return this.field3280[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ij.u(I)Z")
    public boolean method3821() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3271.length; var2++) {
            int var3 = this.field3271[var2];
            if (this.field3280[var3] == null) {
                this.method3879(var3);
                if (this.field3280[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ij.t(IB)I")
    public int method3831(int arg0) {
        return this.field3280[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ij.k(II)[B")
    public byte[] method3823(int arg0) {
        if (this.field3284.length == 1) {
            return this.method3887(0, arg0);
        } else if (this.field3284[arg0].length == 1) {
            return this.method3887(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ij.n(III)[B")
    public byte[] method3824(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3284.length || this.field3284[arg0] == null || arg1 < 0 || arg1 >= this.field3284[arg0].length) {
            return null;
        }
        if (this.field3284[arg0][arg1] == null) {
            boolean var3 = this.method3855(arg0, (int[]) null);
            if (!var3) {
                this.method3879(arg0);
                boolean var4 = this.method3855(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class184.method961(this.field3284[arg0][arg1], false);
    }

    @ObfuscatedName("ij.d(II)[B")
    public byte[] method3825(int arg0) {
        if (this.field3284.length == 1) {
            return this.method3824(0, arg0);
        } else if (this.field3284[arg0].length == 1) {
            return this.method3824(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ij.o(IB)V")
    public void method3879(int arg0) {
    }

    @ObfuscatedName("ij.a(II)[I")
    public int[] method3827(int arg0) {
        return this.field3281[arg0];
    }

    @ObfuscatedName("ij.q(II)I")
    public int method3883(int arg0) {
        return this.field3284[arg0].length;
    }

    @ObfuscatedName("ij.j(I)I")
    public int method3828() {
        return this.field3284.length;
    }

    @ObfuscatedName("ij.c(II)V")
    public void method3822(int arg0) {
        for (int var2 = 0; var2 < this.field3284[arg0].length; var2++) {
            this.field3284[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ij.i(I)V")
    public void method3830() {
        for (int var1 = 0; var1 < this.field3284.length; var1++) {
            if (this.field3284[var1] != null) {
                for (int var2 = 0; var2 < this.field3284[var1].length; var2++) {
                    this.field3284[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ij.l(I[IB)Z")
    public boolean method3855(int arg0, int[] arg1) {
        if (this.field3280[arg0] == null) {
            return false;
        }
        int var3 = this.field3270[arg0];
        int[] var4 = this.field3281[arg0];
        Object[] var5 = this.field3284[arg0];
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
            var8 = class184.method961(this.field3280[arg0], true);
            class181 var9 = new class181(var8);
            var9.method2986(arg1, 5, var9.field2495.length);
        } else {
            var8 = class184.method961(this.field3280[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2163(var8);
        } catch (RuntimeException var27) {
            throw class154.method1519(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class181.method1737(var8, var8.length) + "," + class181.method1737(var8, var8.length - 2) + "," + this.field3274[arg0] + "," + this.field3285);
        }
        if (this.field3276) {
            this.field3280[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class181 var15 = new class181(var10);
            int[] var16 = new int[var3];
            var15.field2488 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2996();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2488 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2996();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3283) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class184.method2915(var20[var26], false);
                }
            }
        } else if (this.field3283) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class184.method2915(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ij.z(Ljava/lang/String;B)I")
    public int method3832(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3273.method3317(class278.method1559(var2));
    }

    @ObfuscatedName("ij.e(ILjava/lang/String;I)I")
    public int method3833(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3279[arg0].method3317(class278.method1559(var3));
    }

    @ObfuscatedName("ij.v(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3834(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3273.method3317(class278.method1559(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3279[var5].method3317(class278.method1559(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ij.w(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3850(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3273.method3317(class278.method1559(var3));
        int var6 = this.field3279[var5].method3317(class278.method1559(var4));
        return this.method3887(var5, var6);
    }

    @ObfuscatedName("ij.av(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3836(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3273.method3317(class278.method1559(var3));
        int var6 = this.field3279[var5].method3317(class278.method1559(var4));
        return this.method3866(var5, var6);
    }

    @ObfuscatedName("ij.au(Ljava/lang/String;I)Z")
    public boolean method3880(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3273.method3317(class278.method1559(var2));
        return this.method3820(var3);
    }

    @ObfuscatedName("ij.ae(Ljava/lang/String;I)V")
    public void method3829(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3273.method3317(class278.method1559(var2));
        if (var3 >= 0) {
            this.method3872(var3);
        }
    }

    @ObfuscatedName("ij.ak(Ljava/lang/String;I)I")
    public int method3837(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3273.method3317(class278.method1559(var2));
        return this.method3831(var3);
    }

    @ObfuscatedName("dz.aq([BB)[B")
    public static final byte[] method2163(byte[] arg0) {
        class181 var1 = new class181(arg0);
        int var2 = var1.method2945();
        int var3 = var1.method2996();
        if (var3 < 0 || !(field3286 == 0 || var3 <= field3286)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2984(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2996();
            if (var5 < 0 || field3286 != 0 && var5 > field3286) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class175.method2891(var6, var5, arg0, var3, 9);
            } else {
                field3282.method2886(var1, var6);
            }
            return var6;
        }
    }
}
