package deob;

@ObfuscatedName("ir")
public abstract class class247 {

    @ObfuscatedName("ir.s")
    public int field3308;

    @ObfuscatedName("ir.g")
    public int[] field3306;

    @ObfuscatedName("ir.m")
    public int[] field3307;

    @ObfuscatedName("ir.h")
    public class199 field3316;

    @ObfuscatedName("ir.i")
    public int[] field3309;

    @ObfuscatedName("ir.w")
    public int[] field3310;

    @ObfuscatedName("ir.t")
    public int[] field3311;

    @ObfuscatedName("ir.d")
    public int[][] field3312;

    @ObfuscatedName("ir.z")
    public int[][] field3313;

    @ObfuscatedName("ir.k")
    public class199[] field3314;

    @ObfuscatedName("ir.c")
    public Object[] field3315;

    @ObfuscatedName("ir.o")
    public Object[][] field3318;

    @ObfuscatedName("ir.l")
    public static class178 field3305 = new class178();

    @ObfuscatedName("ir.f")
    public int field3317;

    @ObfuscatedName("ir.q")
    public boolean field3319;

    @ObfuscatedName("ir.r")
    public boolean field3320;

    @ObfuscatedName("ir.x")
    public static int field3321 = 0;

    public class247(boolean arg0, boolean arg1) {
        this.field3319 = arg0;
        this.field3320 = arg1;
    }

    @ObfuscatedName("ir.s([BB)V")
    public void method4182(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class185.method969(arg0, 0, var2);
        this.field3317 = var3;
        class185 var4 = new class185(method2914(arg0));
        int var5 = var4.method3239();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3292();
        }
        int var6 = var4.method3239();
        if (var5 >= 7) {
            this.field3308 = var4.method3224();
        } else {
            this.field3308 = var4.method3241();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3306 = new int[this.field3308];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3308; var9++) {
                this.field3306[var9] = var7 += var4.method3224();
                if (this.field3306[var9] > var8) {
                    var8 = this.field3306[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3308; var10++) {
                this.field3306[var10] = var7 += var4.method3241();
                if (this.field3306[var10] > var8) {
                    var8 = this.field3306[var10];
                }
            }
        }
        this.field3309 = new int[var8 + 1];
        this.field3310 = new int[var8 + 1];
        this.field3311 = new int[var8 + 1];
        this.field3312 = new int[var8 + 1][];
        this.field3315 = new Object[var8 + 1];
        this.field3318 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3307 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3308; var11++) {
                this.field3307[this.field3306[var11]] = var4.method3292();
            }
            this.field3316 = new class199(this.field3307);
        }
        for (int var12 = 0; var12 < this.field3308; var12++) {
            this.field3309[this.field3306[var12]] = var4.method3292();
        }
        for (int var13 = 0; var13 < this.field3308; var13++) {
            this.field3310[this.field3306[var13]] = var4.method3292();
        }
        for (int var14 = 0; var14 < this.field3308; var14++) {
            this.field3311[this.field3306[var14]] = var4.method3241();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3308; var15++) {
                int var16 = this.field3306[var15];
                int var17 = this.field3311[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3312[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3312[var16][var20] = var18 += var4.method3224();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3318[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3308; var22++) {
                int var23 = this.field3306[var22];
                int var24 = this.field3311[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3312[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3312[var23][var27] = var25 += var4.method3241();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3318[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3313 = new int[var8 + 1][];
        this.field3314 = new class199[var8 + 1];
        for (int var29 = 0; var29 < this.field3308; var29++) {
            int var30 = this.field3306[var29];
            int var31 = this.field3311[var30];
            this.field3313[var30] = new int[this.field3318[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3313[var30][this.field3312[var30][var32]] = var4.method3292();
            }
            this.field3314[var30] = new class199(this.field3313[var30]);
        }
    }

    @ObfuscatedName("ir.g(II)V")
    public void method4254(int arg0) {
    }

    @ObfuscatedName("ir.m(III)[B")
    public byte[] method4231(int arg0, int arg1) {
        return this.method4185(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ir.h(II[IB)[B")
    public byte[] method4185(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3318.length || this.field3318[arg0] == null || arg1 < 0 || arg1 >= this.field3318[arg0].length) {
            return null;
        }
        if (this.field3318[arg0][arg1] == null) {
            boolean var4 = this.method4200(arg0, arg2);
            if (!var4) {
                this.method4237(arg0);
                boolean var5 = this.method4200(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class188.method4743(this.field3318[arg0][arg1], false);
        if (this.field3320) {
            this.field3318[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ir.i(III)Z")
    public boolean method4186(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3318.length || this.field3318[arg0] == null || arg1 < 0 || arg1 >= this.field3318[arg0].length) {
            return false;
        } else if (this.field3318[arg0][arg1] != null) {
            return true;
        } else if (this.field3315[arg0] == null) {
            this.method4237(arg0);
            return this.field3315[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.w(IB)Z")
    public boolean method4268(int arg0) {
        if (this.field3318.length == 1) {
            return this.method4186(0, arg0);
        } else if (this.field3318[arg0].length == 1) {
            return this.method4186(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.t(II)Z")
    public boolean method4184(int arg0) {
        if (this.field3315[arg0] == null) {
            this.method4237(arg0);
            return this.field3315[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.d(B)Z")
    public boolean method4189() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3306.length; var2++) {
            int var3 = this.field3306[var2];
            if (this.field3315[var3] == null) {
                this.method4237(var3);
                if (this.field3315[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.z(II)I")
    public int method4190(int arg0) {
        return this.field3315[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ir.k(IB)[B")
    public byte[] method4207(int arg0) {
        if (this.field3318.length == 1) {
            return this.method4231(0, arg0);
        } else if (this.field3318[arg0].length == 1) {
            return this.method4231(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.c(IIB)[B")
    public byte[] method4192(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3318.length || this.field3318[arg0] == null || arg1 < 0 || arg1 >= this.field3318[arg0].length) {
            return null;
        }
        if (this.field3318[arg0][arg1] == null) {
            boolean var3 = this.method4200(arg0, (int[]) null);
            if (!var3) {
                this.method4237(arg0);
                boolean var4 = this.method4200(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class188.method4743(this.field3318[arg0][arg1], false);
    }

    @ObfuscatedName("ir.o(II)[B")
    public byte[] method4193(int arg0) {
        if (this.field3318.length == 1) {
            return this.method4192(0, arg0);
        } else if (this.field3318[arg0].length == 1) {
            return this.method4192(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.l(II)V")
    public void method4237(int arg0) {
    }

    @ObfuscatedName("ir.f(II)[I")
    public int[] method4195(int arg0) {
        return this.field3312[arg0];
    }

    @ObfuscatedName("ir.q(II)I")
    public int method4209(int arg0) {
        return this.field3318[arg0].length;
    }

    @ObfuscatedName("ir.r(B)I")
    public int method4197() {
        return this.field3318.length;
    }

    @ObfuscatedName("ir.x(IB)V")
    public void method4198(int arg0) {
        for (int var2 = 0; var2 < this.field3318[arg0].length; var2++) {
            this.field3318[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ir.u(I)V")
    public void method4258() {
        for (int var1 = 0; var1 < this.field3318.length; var1++) {
            if (this.field3318[var1] != null) {
                for (int var2 = 0; var2 < this.field3318[var1].length; var2++) {
                    this.field3318[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ir.a(I[II)Z")
    public boolean method4200(int arg0, int[] arg1) {
        if (this.field3315[arg0] == null) {
            return false;
        }
        int var3 = this.field3311[arg0];
        int[] var4 = this.field3312[arg0];
        Object[] var5 = this.field3318[arg0];
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
            var8 = class188.method4743(this.field3315[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3369(arg1, 5, var9.field2512.length);
        } else {
            var8 = class188.method4743(this.field3315[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2914(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class185.method969(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class185.method969(var8, 0, var17);
            throw class155.method1476(var34, var16 + var18 + "," + this.field3309[arg0] + "," + this.field3317);
        }
        if (this.field3319) {
            this.field3315[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class185 var22 = new class185(var10);
            int[] var23 = new int[var3];
            var22.field2514 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method3292();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2514 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method3292();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field3320) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class188.method4462(var27[var33], false);
                }
            }
        } else if (this.field3320) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class188.method4462(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ir.ad(Ljava/lang/String;B)I")
    public int method4201(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3316.method3660(class294.method3831(var2));
    }

    @ObfuscatedName("ir.al(ILjava/lang/String;I)I")
    public int method4217(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3314[arg0].method3660(class294.method3831(var3));
    }

    @ObfuscatedName("ir.aq(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4183(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3316.method3660(class294.method3831(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3314[var5].method3660(class294.method3831(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ir.ar(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4191(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3316.method3660(class294.method3831(var3));
        int var6 = this.field3314[var5].method3660(class294.method3831(var4));
        return this.method4231(var5, var6);
    }

    @ObfuscatedName("ir.an(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4205(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3316.method3660(class294.method3831(var3));
        int var6 = this.field3314[var5].method3660(class294.method3831(var4));
        return this.method4186(var5, var6);
    }

    @ObfuscatedName("ir.af(Ljava/lang/String;I)Z")
    public boolean method4206(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3316.method3660(class294.method3831(var2));
        return this.method4184(var3);
    }

    @ObfuscatedName("ir.as(Ljava/lang/String;I)V")
    public void method4261(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3316.method3660(class294.method3831(var2));
        if (var3 >= 0) {
            this.method4254(var3);
        }
    }

    @ObfuscatedName("ir.ax(Ljava/lang/String;I)I")
    public int method4208(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3316.method3660(class294.method3831(var2));
        return this.method4190(var3);
    }

    @ObfuscatedName("eh.ak([BI)[B")
    public static final byte[] method2914(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3239();
        int var3 = var1.method3292();
        if (var3 < 0 || !(field3321 == 0 || var3 <= field3321)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3411(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3292();
            if (var5 < 0 || field3321 != 0 && var5 > field3321) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3172(var6, var5, arg0, var3, 9);
            } else {
                field3305.method3163(var1, var6);
            }
            return var6;
        }
    }
}
