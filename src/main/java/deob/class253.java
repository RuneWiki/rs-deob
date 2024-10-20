package deob;

@ObfuscatedName("ir")
public abstract class class253 {

    @ObfuscatedName("ir.c")
    public int field3265;

    @ObfuscatedName("ir.j")
    public int[] field3272;

    @ObfuscatedName("ir.r")
    public int[] field3267;

    @ObfuscatedName("ir.q")
    public class400 field3268;

    @ObfuscatedName("ir.t")
    public int[] field3281;

    @ObfuscatedName("ir.v")
    public int[] field3270;

    @ObfuscatedName("ir.x")
    public int[] field3271;

    @ObfuscatedName("ir.z")
    public int[][] field3280;

    @ObfuscatedName("ir.i")
    public int[][] field3273;

    @ObfuscatedName("ir.a")
    public class400[] field3274;

    @ObfuscatedName("ir.w")
    public Object[] field3275;

    @ObfuscatedName("ir.s")
    public Object[][] field3276;

    @ObfuscatedName("ir.y")
    public static class399 field3277 = new class399();

    @ObfuscatedName("ir.ac")
    public int field3278;

    @ObfuscatedName("ir.ay")
    public boolean field3269;

    @ObfuscatedName("ir.am")
    public boolean field3264;

    @ObfuscatedName("ir.ag")
    public static int field3279 = 0;

    public class253(boolean arg0, boolean arg1) {
        this.field3269 = arg0;
        this.field3264 = arg1;
    }

    @ObfuscatedName("ir.av([BI)V")
    public void method3932(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class382.method2722(arg0, 0, var2);
        this.field3278 = var3;
        class382 var4 = new class382(method3853(arg0));
        int var5 = var4.method5856();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method5861();
        }
        int var6 = var4.method5856();
        if (var5 >= 7) {
            this.field3265 = var4.method5872();
        } else {
            this.field3265 = var4.method5858();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3272 = new int[this.field3265];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3265; var9++) {
                this.field3272[var9] = var7 += var4.method5872();
                if (this.field3272[var9] > var8) {
                    var8 = this.field3272[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3265; var10++) {
                this.field3272[var10] = var7 += var4.method5858();
                if (this.field3272[var10] > var8) {
                    var8 = this.field3272[var10];
                }
            }
        }
        this.field3281 = new int[var8 + 1];
        this.field3270 = new int[var8 + 1];
        this.field3271 = new int[var8 + 1];
        this.field3280 = new int[var8 + 1][];
        this.field3275 = new Object[var8 + 1];
        this.field3276 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3267 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3265; var11++) {
                this.field3267[this.field3272[var11]] = var4.method5861();
            }
            this.field3268 = new class400(this.field3267);
        }
        for (int var12 = 0; var12 < this.field3265; var12++) {
            this.field3281[this.field3272[var12]] = var4.method5861();
        }
        for (int var13 = 0; var13 < this.field3265; var13++) {
            this.field3270[this.field3272[var13]] = var4.method5861();
        }
        for (int var14 = 0; var14 < this.field3265; var14++) {
            this.field3271[this.field3272[var14]] = var4.method5858();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3265; var15++) {
                int var16 = this.field3272[var15];
                int var17 = this.field3271[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3280[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3280[var16][var20] = var18 += var4.method5872();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3276[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3265; var22++) {
                int var23 = this.field3272[var22];
                int var24 = this.field3271[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3280[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3280[var23][var27] = var25 += var4.method5858();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3276[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3273 = new int[var8 + 1][];
        this.field3274 = new class400[var8 + 1];
        for (int var29 = 0; var29 < this.field3265; var29++) {
            int var30 = this.field3272[var29];
            int var31 = this.field3271[var30];
            this.field3273[var30] = new int[this.field3276[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3273[var30][this.field3280[var30][var32]] = var4.method5861();
            }
            this.field3274[var30] = new class400(this.field3273[var30]);
        }
    }

    @ObfuscatedName("ir.u(II)V")
    public void method3907(int arg0) {
    }

    @ObfuscatedName("ir.az(III)[B")
    public byte[] method3933(int arg0, int arg1) {
        return this.method3934(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ir.au(II[II)[B")
    public byte[] method3934(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3276.length || this.field3276[arg0] == null || arg1 < 0 || arg1 >= this.field3276[arg0].length) {
            return null;
        }
        if (this.field3276[arg0][arg1] == null) {
            boolean var4 = this.method3949(arg0, arg2);
            if (!var4) {
                this.method3891(arg0);
                boolean var5 = this.method3949(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class229.method12(this.field3276[arg0][arg1], false);
        if (this.field3264) {
            this.field3276[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ir.ab(III)Z")
    public boolean method3935(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3276.length || this.field3276[arg0] == null || arg1 < 0 || arg1 >= this.field3276[arg0].length) {
            return false;
        } else if (this.field3276[arg0][arg1] != null) {
            return true;
        } else if (this.field3275[arg0] == null) {
            this.method3891(arg0);
            return this.field3275[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.aa(II)Z")
    public boolean method3936(int arg0) {
        if (this.field3276.length == 1) {
            return this.method3935(0, arg0);
        } else if (this.field3276[arg0].length == 1) {
            return this.method3935(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.al(IB)Z")
    public boolean method3948(int arg0) {
        if (this.field3275[arg0] == null) {
            this.method3891(arg0);
            return this.field3275[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.ar(I)Z")
    public boolean method3954() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3272.length; var2++) {
            int var3 = this.field3272[var2];
            if (this.field3275[var3] == null) {
                this.method3891(var3);
                if (this.field3275[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ir.h(IB)I")
    public int method3896(int arg0) {
        return this.field3275[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ir.ak(II)[B")
    public byte[] method3939(int arg0) {
        if (this.field3276.length == 1) {
            return this.method3933(0, arg0);
        } else if (this.field3276[arg0].length == 1) {
            return this.method3933(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.an(III)[B")
    public byte[] method3955(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3276.length || this.field3276[arg0] == null || arg1 < 0 || arg1 >= this.field3276[arg0].length) {
            return null;
        }
        if (this.field3276[arg0][arg1] == null) {
            boolean var3 = this.method3949(arg0, (int[]) null);
            if (!var3) {
                this.method3891(arg0);
                boolean var4 = this.method3949(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class229.method12(this.field3276[arg0][arg1], false);
    }

    @ObfuscatedName("ir.ah(II)[B")
    public byte[] method3976(int arg0) {
        if (this.field3276.length == 1) {
            return this.method3955(0, arg0);
        } else if (this.field3276[arg0].length == 1) {
            return this.method3955(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ir.p(II)V")
    public void method3891(int arg0) {
    }

    @ObfuscatedName("ir.ae(II)[I")
    public int[] method3943(int arg0) {
        return arg0 >= 0 && arg0 < this.field3280.length ? this.field3280[arg0] : null;
    }

    @ObfuscatedName("ir.bh(II)I")
    public int method3944(int arg0) {
        return this.field3276[arg0].length;
    }

    @ObfuscatedName("ir.br(I)I")
    public int method4002() {
        return this.field3276.length;
    }

    @ObfuscatedName("ir.bn(B)V")
    public void method3946() {
        for (int var1 = 0; var1 < this.field3275.length; var1++) {
            this.field3275[var1] = null;
        }
    }

    @ObfuscatedName("ir.bi(IB)V")
    public void method3947(int arg0) {
        for (int var2 = 0; var2 < this.field3276[arg0].length; var2++) {
            this.field3276[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ir.bb(I)V")
    public void method3958() {
        for (int var1 = 0; var1 < this.field3276.length; var1++) {
            if (this.field3276[var1] != null) {
                for (int var2 = 0; var2 < this.field3276[var1].length; var2++) {
                    this.field3276[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ir.bk(I[II)Z")
    public boolean method3949(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ir.bt(Ljava/lang/String;B)I")
    public int method3950(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3268.method6373(class303.method2172(var2));
    }

    @ObfuscatedName("ir.ba(ILjava/lang/String;I)I")
    public int method3951(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3274[arg0].method6373(class303.method2172(var3));
    }

    @ObfuscatedName("ir.be(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3942(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3268.method6373(class303.method2172(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3274[var5].method6373(class303.method2172(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ir.bo(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3953(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3268.method6373(class303.method2172(var3));
        int var6 = this.field3274[var5].method6373(class303.method2172(var4));
        return this.method3933(var5, var6);
    }

    @ObfuscatedName("ir.bp(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4000(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3268.method6373(class303.method2172(var3));
        int var6 = this.field3274[var5].method6373(class303.method2172(var4));
        return this.method3935(var5, var6);
    }

    @ObfuscatedName("ir.bj(Ljava/lang/String;I)Z")
    public boolean method3931(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3268.method6373(class303.method2172(var2));
        return this.method3948(var3);
    }

    @ObfuscatedName("ir.bw(Ljava/lang/String;I)V")
    public void method3956(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3268.method6373(class303.method2172(var2));
        if (var3 >= 0) {
            this.method3907(var3);
        }
    }

    @ObfuscatedName("ir.by(Ljava/lang/String;I)I")
    public int method3957(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3268.method6373(class303.method2172(var2));
        return this.method3896(var3);
    }

    @ObfuscatedName("il.bq([BI)[B")
    public static final byte[] method3853(byte[] arg0) {
        class382 var1 = new class382(arg0);
        int var2 = var1.method5856();
        int var3 = var1.method5861();
        if (var3 < 0 || !(field3279 == 0 || var3 <= field3279)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5866(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5861();
            if (var5 < 0 || field3279 != 0 && var5 > field3279) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class384.method6072(var6, var5, arg0, var3, 9);
            } else {
                field3277.method6369(var1, var6);
            }
            return var6;
        }
    }
}
