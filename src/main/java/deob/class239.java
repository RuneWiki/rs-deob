package deob;

@ObfuscatedName("iw")
public abstract class class239 {

    @ObfuscatedName("iw.s")
    public int field3248;

    @ObfuscatedName("iw.c")
    public int[] field3234;

    @ObfuscatedName("iw.f")
    public int[] field3241;

    @ObfuscatedName("iw.m")
    public class191 field3236;

    @ObfuscatedName("iw.h")
    public int[] field3233;

    @ObfuscatedName("iw.t")
    public int[] field3238;

    @ObfuscatedName("iw.p")
    public int[] field3239;

    @ObfuscatedName("iw.d")
    public int[][] field3240;

    @ObfuscatedName("iw.n")
    public int[][] field3237;

    @ObfuscatedName("iw.z")
    public class191[] field3242;

    @ObfuscatedName("iw.o")
    public Object[] field3243;

    @ObfuscatedName("iw.q")
    public Object[][] field3235;

    @ObfuscatedName("iw.u")
    public static class170 field3244 = new class170();

    @ObfuscatedName("iw.k")
    public int field3246;

    @ObfuscatedName("iw.e")
    public boolean field3247;

    @ObfuscatedName("iw.r")
    public boolean field3245;

    @ObfuscatedName("iw.l")
    public static int field3249 = 0;

    public class239(boolean arg0, boolean arg1) {
        this.field3247 = arg0;
        this.field3245 = arg1;
    }

    @ObfuscatedName("iw.s([BI)V")
    public void method3838(byte[] arg0) {
        this.field3246 = Statics.method671(arg0, arg0.length);
        class177 var2 = new class177(method2705(arg0));
        int var3 = var2.method2965();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2970();
        }
        int var4 = var2.method2965();
        if (var3 >= 7) {
            this.field3248 = var2.method2979();
        } else {
            this.field3248 = var2.method2967();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3234 = new int[this.field3248];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3248; var7++) {
                this.field3234[var7] = var5 += var2.method2979();
                if (this.field3234[var7] > var6) {
                    var6 = this.field3234[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3248; var8++) {
                this.field3234[var8] = var5 += var2.method2967();
                if (this.field3234[var8] > var6) {
                    var6 = this.field3234[var8];
                }
            }
        }
        this.field3233 = new int[var6 + 1];
        this.field3238 = new int[var6 + 1];
        this.field3239 = new int[var6 + 1];
        this.field3240 = new int[var6 + 1][];
        this.field3243 = new Object[var6 + 1];
        this.field3235 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3241 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3248; var9++) {
                this.field3241[this.field3234[var9]] = var2.method2970();
            }
            this.field3236 = new class191(this.field3241);
        }
        for (int var10 = 0; var10 < this.field3248; var10++) {
            this.field3233[this.field3234[var10]] = var2.method2970();
        }
        for (int var11 = 0; var11 < this.field3248; var11++) {
            this.field3238[this.field3234[var11]] = var2.method2970();
        }
        for (int var12 = 0; var12 < this.field3248; var12++) {
            this.field3239[this.field3234[var12]] = var2.method2967();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3248; var13++) {
                int var14 = this.field3234[var13];
                int var15 = this.field3239[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3240[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3240[var14][var18] = var16 += var2.method2979();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3235[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3248; var20++) {
                int var21 = this.field3234[var20];
                int var22 = this.field3239[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3240[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3240[var21][var25] = var23 += var2.method2967();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3235[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3237 = new int[var6 + 1][];
        this.field3242 = new class191[var6 + 1];
        for (int var27 = 0; var27 < this.field3248; var27++) {
            int var28 = this.field3234[var27];
            int var29 = this.field3239[var28];
            this.field3237[var28] = new int[this.field3235[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3237[var28][this.field3240[var28][var30]] = var2.method2970();
            }
            this.field3242[var28] = new class191(this.field3237[var28]);
        }
    }

    @ObfuscatedName("iw.c(II)V")
    public void method3839(int arg0) {
    }

    @ObfuscatedName("iw.f(III)[B")
    public byte[] method3840(int arg0, int arg1) {
        return this.method3841(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iw.m(II[IB)[B")
    public byte[] method3841(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3235.length || this.field3235[arg0] == null || arg1 < 0 || arg1 >= this.field3235[arg0].length) {
            return null;
        }
        if (this.field3235[arg0][arg1] == null) {
            boolean var4 = this.method3860(arg0, arg2);
            if (!var4) {
                this.method3849(arg0);
                boolean var5 = this.method3860(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class180.method1638(this.field3235[arg0][arg1], false);
        if (this.field3245) {
            this.field3235[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iw.h(III)Z")
    public boolean method3842(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3235.length || this.field3235[arg0] == null || arg1 < 0 || arg1 >= this.field3235[arg0].length) {
            return false;
        } else if (this.field3235[arg0][arg1] != null) {
            return true;
        } else if (this.field3243[arg0] == null) {
            this.method3849(arg0);
            return this.field3243[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.t(II)Z")
    public boolean method3843(int arg0) {
        if (this.field3243[arg0] == null) {
            this.method3849(arg0);
            return this.field3243[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iw.p(I)Z")
    public boolean method3873() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3234.length; var2++) {
            int var3 = this.field3234[var2];
            if (this.field3243[var3] == null) {
                this.method3849(var3);
                if (this.field3243[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iw.d(II)I")
    public int method3845(int arg0) {
        return this.field3243[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iw.n(II)[B")
    public byte[] method3887(int arg0) {
        if (this.field3235.length == 1) {
            return this.method3840(0, arg0);
        } else if (this.field3235[arg0].length == 1) {
            return this.method3840(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.z(IIB)[B")
    public byte[] method3885(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3235.length || this.field3235[arg0] == null || arg1 < 0 || arg1 >= this.field3235[arg0].length) {
            return null;
        }
        if (this.field3235[arg0][arg1] == null) {
            boolean var3 = this.method3860(arg0, (int[]) null);
            if (!var3) {
                this.method3849(arg0);
                boolean var4 = this.method3860(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class180.method1638(this.field3235[arg0][arg1], false);
    }

    @ObfuscatedName("iw.o(IB)[B")
    public byte[] method3905(int arg0) {
        if (this.field3235.length == 1) {
            return this.method3885(0, arg0);
        } else if (this.field3235[arg0].length == 1) {
            return this.method3885(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iw.u(IB)V")
    public void method3849(int arg0) {
    }

    @ObfuscatedName("iw.r(II)[I")
    public int[] method3872(int arg0) {
        return this.field3240[arg0];
    }

    @ObfuscatedName("iw.l(IB)I")
    public int method3858(int arg0) {
        return this.field3235[arg0].length;
    }

    @ObfuscatedName("iw.y(I)I")
    public int method3852() {
        return this.field3235.length;
    }

    @ObfuscatedName("iw.w(II)V")
    public void method3853(int arg0) {
        for (int var2 = 0; var2 < this.field3235[arg0].length; var2++) {
            this.field3235[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iw.i(I)V")
    public void method3854() {
        for (int var1 = 0; var1 < this.field3235.length; var1++) {
            if (this.field3235[var1] != null) {
                for (int var2 = 0; var2 < this.field3235[var1].length; var2++) {
                    this.field3235[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iw.g(I[II)Z")
    public boolean method3860(int arg0, int[] arg1) {
        if (this.field3243[arg0] == null) {
            return false;
        }
        int var3 = this.field3239[arg0];
        int[] var4 = this.field3240[arg0];
        Object[] var5 = this.field3235[arg0];
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
            var8 = class180.method1638(this.field3243[arg0], true);
            class177 var9 = new class177(var8);
            var9.method2985(arg1, 5, var9.field2403.length);
        } else {
            var8 = class180.method1638(this.field3243[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2705(var8);
        } catch (RuntimeException var27) {
            throw class154.method1578(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method671(var8, var8.length) + "," + Statics.method671(var8, var8.length - 2) + "," + this.field3233[arg0] + "," + this.field3246);
        }
        if (this.field3247) {
            this.field3243[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class177 var15 = new class177(var10);
            int[] var16 = new int[var3];
            var15.field2402 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2970();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2402 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2970();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3245) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class180.method73(var20[var26], false);
                }
            }
        } else if (this.field3245) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class180.method73(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iw.a(Ljava/lang/String;I)I")
    public int method3855(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3236.method3304(class274.method2823(var2));
    }

    @ObfuscatedName("iw.x(ILjava/lang/String;I)I")
    public int method3856(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3242[arg0].method3304(class274.method2823(var3));
    }

    @ObfuscatedName("iw.j(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3916(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3236.method3304(class274.method2823(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3242[var5].method3304(class274.method2823(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iw.v(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3899(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3236.method3304(class274.method2823(var3));
        int var6 = this.field3242[var5].method3304(class274.method2823(var4));
        return this.method3840(var5, var6);
    }

    @ObfuscatedName("iw.ap(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method3869(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3236.method3304(class274.method2823(var3));
        int var6 = this.field3242[var5].method3304(class274.method2823(var4));
        return this.method3842(var5, var6);
    }

    @ObfuscatedName("iw.ar(Ljava/lang/String;B)Z")
    public boolean method3846(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3236.method3304(class274.method2823(var2));
        return this.method3843(var3);
    }

    @ObfuscatedName("iw.am(Ljava/lang/String;I)V")
    public void method3861(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3236.method3304(class274.method2823(var2));
        if (var3 >= 0) {
            this.method3839(var3);
        }
    }

    @ObfuscatedName("iw.ab(Ljava/lang/String;I)I")
    public int method3923(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3236.method3304(class274.method2823(var2));
        return this.method3845(var3);
    }

    @ObfuscatedName("ej.af([BB)[B")
    public static final byte[] method2705(byte[] arg0) {
        class177 var1 = new class177(arg0);
        int var2 = var1.method2965();
        int var3 = var1.method2970();
        if (var3 < 0 || !(field3249 == 0 || var3 <= field3249)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3065(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2970();
            if (var5 < 0 || field3249 != 0 && var5 > field3249) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class171.method2924(var6, var5, arg0, var3, 9);
            } else {
                field3244.method2903(var1, var6);
            }
            return var6;
        }
    }
}
