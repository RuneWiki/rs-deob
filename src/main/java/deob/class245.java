package deob;

@ObfuscatedName("ig")
public abstract class class245 {

    @ObfuscatedName("ig.v")
    public int field3167;

    @ObfuscatedName("ig.d")
    public int[] field3168;

    @ObfuscatedName("ig.c")
    public int[] field3169;

    @ObfuscatedName("ig.y")
    public class346 field3170;

    @ObfuscatedName("ig.h")
    public int[] field3185;

    @ObfuscatedName("ig.z")
    public int[] field3166;

    @ObfuscatedName("ig.e")
    public int[] field3173;

    @ObfuscatedName("ig.q")
    public int[][] field3174;

    @ObfuscatedName("ig.l")
    public int[][] field3175;

    @ObfuscatedName("ig.s")
    public class346[] field3176;

    @ObfuscatedName("ig.b")
    public Object[] field3177;

    @ObfuscatedName("ig.a")
    public Object[][] field3178;

    @ObfuscatedName("ig.w")
    public static class345 field3179 = new class345();

    @ObfuscatedName("ig.k")
    public int field3181;

    @ObfuscatedName("ig.i")
    public boolean field3183;

    @ObfuscatedName("ig.x")
    public boolean field3182;

    @ObfuscatedName("ig.f")
    public static int field3172 = 0;

    public class245(boolean arg0, boolean arg1) {
        this.field3183 = arg0;
        this.field3182 = arg1;
    }

    @ObfuscatedName("ig.n([BI)V")
    public void method3981(byte[] arg0) {
        this.field3181 = class311.method1242(arg0, arg0.length);
        class311 var2 = new class311(method3949(arg0));
        int var3 = var2.method5310();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5455();
        }
        int var4 = var2.method5310();
        if (var3 >= 7) {
            this.field3167 = var2.method5261();
        } else {
            this.field3167 = var2.method5247();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3168 = new int[this.field3167];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3167; var7++) {
                this.field3168[var7] = var5 += var2.method5261();
                if (this.field3168[var7] > var6) {
                    var6 = this.field3168[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3167; var8++) {
                this.field3168[var8] = var5 += var2.method5247();
                if (this.field3168[var8] > var6) {
                    var6 = this.field3168[var8];
                }
            }
        }
        this.field3185 = new int[var6 + 1];
        this.field3166 = new int[var6 + 1];
        this.field3173 = new int[var6 + 1];
        this.field3174 = new int[var6 + 1][];
        this.field3177 = new Object[var6 + 1];
        this.field3178 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3169 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3167; var9++) {
                this.field3169[this.field3168[var9]] = var2.method5455();
            }
            this.field3170 = new class346(this.field3169);
        }
        for (int var10 = 0; var10 < this.field3167; var10++) {
            this.field3185[this.field3168[var10]] = var2.method5455();
        }
        for (int var11 = 0; var11 < this.field3167; var11++) {
            this.field3166[this.field3168[var11]] = var2.method5455();
        }
        for (int var12 = 0; var12 < this.field3167; var12++) {
            this.field3173[this.field3168[var12]] = var2.method5247();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3167; var13++) {
                int var14 = this.field3168[var13];
                int var15 = this.field3173[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3174[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3174[var14][var18] = var16 += var2.method5261();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3178[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3167; var20++) {
                int var21 = this.field3168[var20];
                int var22 = this.field3173[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3174[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3174[var21][var25] = var23 += var2.method5247();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3178[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3175 = new int[var6 + 1][];
        this.field3176 = new class346[var6 + 1];
        for (int var27 = 0; var27 < this.field3167; var27++) {
            int var28 = this.field3168[var27];
            int var29 = this.field3173[var28];
            this.field3175[var28] = new int[this.field3178[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3175[var28][this.field3174[var28][var30]] = var2.method5455();
            }
            this.field3176[var28] = new class346(this.field3175[var28]);
        }
    }

    @ObfuscatedName("ig.v(IS)V")
    public void method3982(int arg0) {
    }

    @ObfuscatedName("ig.d(IIB)[B")
    public byte[] method4032(int arg0, int arg1) {
        return this.method3984(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ig.c(II[II)[B")
    public byte[] method3984(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3178.length || this.field3178[arg0] == null || arg1 < 0 || arg1 >= this.field3178[arg0].length) {
            return null;
        }
        if (this.field3178[arg0][arg1] == null) {
            boolean var4 = this.method4000(arg0, arg2);
            if (!var4) {
                this.method3993(arg0);
                boolean var5 = this.method4000(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method2225(this.field3178[arg0][arg1], false);
        if (this.field3182) {
            this.field3178[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ig.y(III)Z")
    public boolean method4024(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3178.length || this.field3178[arg0] == null || arg1 < 0 || arg1 >= this.field3178[arg0].length) {
            return false;
        } else if (this.field3178[arg0][arg1] != null) {
            return true;
        } else if (this.field3177[arg0] == null) {
            this.method3993(arg0);
            return this.field3177[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ig.h(II)Z")
    public boolean method3986(int arg0) {
        if (this.field3178.length == 1) {
            return this.method4024(0, arg0);
        } else if (this.field3178[arg0].length == 1) {
            return this.method4024(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ig.z(II)Z")
    public boolean method4026(int arg0) {
        if (this.field3177[arg0] == null) {
            this.method3993(arg0);
            return this.field3177[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ig.e(B)Z")
    public boolean method4034() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3168.length; var2++) {
            int var3 = this.field3168[var2];
            if (this.field3177[var3] == null) {
                this.method3993(var3);
                if (this.field3177[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ig.q(II)I")
    public int method3989(int arg0) {
        return this.field3177[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ig.l(II)[B")
    public byte[] method3990(int arg0) {
        if (this.field3178.length == 1) {
            return this.method4032(0, arg0);
        } else if (this.field3178[arg0].length == 1) {
            return this.method4032(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ig.s(III)[B")
    public byte[] method3991(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3178.length || this.field3178[arg0] == null || arg1 < 0 || arg1 >= this.field3178[arg0].length) {
            return null;
        }
        if (this.field3178[arg0][arg1] == null) {
            boolean var3 = this.method4000(arg0, (int[]) null);
            if (!var3) {
                this.method3993(arg0);
                boolean var4 = this.method4000(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method2225(this.field3178[arg0][arg1], false);
    }

    @ObfuscatedName("ig.b(II)[B")
    public byte[] method3992(int arg0) {
        if (this.field3178.length == 1) {
            return this.method3991(0, arg0);
        } else if (this.field3178[arg0].length == 1) {
            return this.method3991(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ig.a(II)V")
    public void method3993(int arg0) {
    }

    @ObfuscatedName("ig.w(II)[I")
    public int[] method3994(int arg0) {
        return arg0 >= 0 && arg0 < this.field3174.length ? this.field3174[arg0] : null;
    }

    @ObfuscatedName("ig.k(II)I")
    public int method4008(int arg0) {
        return this.field3178[arg0].length;
    }

    @ObfuscatedName("ig.i(I)I")
    public int method4039() {
        return this.field3178.length;
    }

    @ObfuscatedName("ig.x(I)V")
    public void method4064() {
        for (int var1 = 0; var1 < this.field3177.length; var1++) {
            this.field3177[var1] = null;
        }
    }

    @ObfuscatedName("ig.g(II)V")
    public void method4068(int arg0) {
        for (int var2 = 0; var2 < this.field3178[arg0].length; var2++) {
            this.field3178[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ig.u(I)V")
    public void method4070() {
        for (int var1 = 0; var1 < this.field3178.length; var1++) {
            if (this.field3178[var1] != null) {
                for (int var2 = 0; var2 < this.field3178[var1].length; var2++) {
                    this.field3178[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ig.t(I[II)Z")
    public boolean method4000(int arg0, int[] arg1) {
        if (this.field3177[arg0] == null) {
            return false;
        }
        int var3 = this.field3173[arg0];
        int[] var4 = this.field3174[arg0];
        Object[] var5 = this.field3178[arg0];
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
            var8 = class215.method2225(this.field3177[arg0], true);
            class311 var9 = new class311(var8);
            var9.method5267(arg1, 5, var9.field3746.length);
        } else {
            var8 = class215.method2225(this.field3177[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3949(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class311.method1179(var8, 0, var14);
            throw class352.method5029(var31, var13 + var15 + "," + class311.method1242(var8, var8.length - 2) + "," + this.field3185[arg0] + "," + this.field3181);
        }
        if (this.field3183) {
            this.field3177[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class311 var19 = new class311(var10);
            int[] var20 = new int[var3];
            var19.field3747 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method5455();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field3747 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method5455();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field3182) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class215.method2026(var24[var30], false);
                }
            }
        } else if (this.field3182) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class215.method2026(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ig.p(Ljava/lang/String;I)I")
    public int method4001(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3170.method6221(class302.method3876(var2));
    }

    @ObfuscatedName("ig.o(ILjava/lang/String;I)I")
    public int method4002(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3176[arg0].method6221(class302.method3876(var3));
    }

    @ObfuscatedName("ig.ay(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4003(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6221(class302.method3876(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3176[var5].method6221(class302.method3876(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ig.am(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3980(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6221(class302.method3876(var3));
        int var6 = this.field3176[var5].method6221(class302.method3876(var4));
        return this.method4032(var5, var6);
    }

    @ObfuscatedName("ig.ag(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4019(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3170.method6221(class302.method3876(var3));
        int var6 = this.field3176[var5].method6221(class302.method3876(var4));
        return this.method4024(var5, var6);
    }

    @ObfuscatedName("ig.ae(Ljava/lang/String;B)Z")
    public boolean method4006(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6221(class302.method3876(var2));
        return this.method4026(var3);
    }

    @ObfuscatedName("ig.ac(Ljava/lang/String;I)V")
    public void method4007(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6221(class302.method3876(var2));
        if (var3 >= 0) {
            this.method3982(var3);
        }
    }

    @ObfuscatedName("ig.aq(Ljava/lang/String;B)I")
    public int method4073(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3170.method6221(class302.method3876(var2));
        return this.method3989(var3);
    }

    @ObfuscatedName("hw.at([BB)[B")
    public static final byte[] method3949(byte[] arg0) {
        class311 var1 = new class311(arg0);
        int var2 = var1.method5310();
        int var3 = var1.method5455();
        if (var3 < 0 || !(field3172 == 0 || var3 <= field3172)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5237(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5455();
            if (var5 < 0 || field3172 != 0 && var5 > field3172) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class315.method5557(var6, var5, arg0, var3, 9);
            } else {
                field3179.method6218(var1, var6);
            }
            return var6;
        }
    }
}
