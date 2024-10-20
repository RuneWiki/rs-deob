package deob;

@ObfuscatedName("ib")
public abstract class class245 {

    @ObfuscatedName("ib.v")
    public int field3160;

    @ObfuscatedName("ib.x")
    public int[] field3161;

    @ObfuscatedName("ib.w")
    public int[] field3162;

    @ObfuscatedName("ib.t")
    public class346 field3165;

    @ObfuscatedName("ib.j")
    public int[] field3164;

    @ObfuscatedName("ib.n")
    public int[] field3159;

    @ObfuscatedName("ib.p")
    public int[] field3166;

    @ObfuscatedName("ib.l")
    public int[][] field3167;

    @ObfuscatedName("ib.z")
    public int[][] field3168;

    @ObfuscatedName("ib.u")
    public class346[] field3169;

    @ObfuscatedName("ib.e")
    public Object[] field3170;

    @ObfuscatedName("ib.m")
    public Object[][] field3171;

    @ObfuscatedName("ib.c")
    public static class345 field3176 = new class345();

    @ObfuscatedName("ib.i")
    public int field3173;

    @ObfuscatedName("ib.f")
    public boolean field3174;

    @ObfuscatedName("ib.a")
    public boolean field3163;

    @ObfuscatedName("ib.b")
    public static int field3172 = 0;

    public class245(boolean arg0, boolean arg1) {
        this.field3174 = arg0;
        this.field3163 = arg1;
    }

    @ObfuscatedName("ib.h([BI)V")
    public void method3832(byte[] arg0) {
        this.field3173 = class311.method2138(arg0, arg0.length);
        class311 var2 = new class311(method5473(arg0));
        int var3 = var2.method5274();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5120();
        }
        int var4 = var2.method5274();
        if (var3 >= 7) {
            this.field3160 = var2.method5131();
        } else {
            this.field3160 = var2.method5342();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3161 = new int[this.field3160];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3160; var7++) {
                this.field3161[var7] = var5 += var2.method5131();
                if (this.field3161[var7] > var6) {
                    var6 = this.field3161[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3160; var8++) {
                this.field3161[var8] = var5 += var2.method5342();
                if (this.field3161[var8] > var6) {
                    var6 = this.field3161[var8];
                }
            }
        }
        this.field3164 = new int[var6 + 1];
        this.field3159 = new int[var6 + 1];
        this.field3166 = new int[var6 + 1];
        this.field3167 = new int[var6 + 1][];
        this.field3170 = new Object[var6 + 1];
        this.field3171 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3162 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3160; var9++) {
                this.field3162[this.field3161[var9]] = var2.method5120();
            }
            this.field3165 = new class346(this.field3162);
        }
        for (int var10 = 0; var10 < this.field3160; var10++) {
            this.field3164[this.field3161[var10]] = var2.method5120();
        }
        for (int var11 = 0; var11 < this.field3160; var11++) {
            this.field3159[this.field3161[var11]] = var2.method5120();
        }
        for (int var12 = 0; var12 < this.field3160; var12++) {
            this.field3166[this.field3161[var12]] = var2.method5342();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3160; var13++) {
                int var14 = this.field3161[var13];
                int var15 = this.field3166[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3167[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3167[var14][var18] = var16 += var2.method5131();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3171[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3160; var20++) {
                int var21 = this.field3161[var20];
                int var22 = this.field3166[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3167[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3167[var21][var25] = var23 += var2.method5342();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3171[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3168 = new int[var6 + 1][];
        this.field3169 = new class346[var6 + 1];
        for (int var27 = 0; var27 < this.field3160; var27++) {
            int var28 = this.field3161[var27];
            int var29 = this.field3166[var28];
            this.field3168[var28] = new int[this.field3171[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3168[var28][this.field3167[var28][var30]] = var2.method5120();
            }
            this.field3169[var28] = new class346(this.field3168[var28]);
        }
    }

    @ObfuscatedName("ib.v(II)V")
    public void method3833(int arg0) {
    }

    @ObfuscatedName("ib.x(IIS)[B")
    public byte[] method3834(int arg0, int arg1) {
        return this.method3835(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ib.w(II[IB)[B")
    public byte[] method3835(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3171.length || this.field3171[arg0] == null || arg1 < 0 || arg1 >= this.field3171[arg0].length) {
            return null;
        }
        if (this.field3171[arg0][arg1] == null) {
            boolean var4 = this.method3851(arg0, arg2);
            if (!var4) {
                this.method3844(arg0);
                boolean var5 = this.method3851(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class215.method166(this.field3171[arg0][arg1], false);
        if (this.field3163) {
            this.field3171[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ib.t(III)Z")
    public boolean method3836(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3171.length || this.field3171[arg0] == null || arg1 < 0 || arg1 >= this.field3171[arg0].length) {
            return false;
        } else if (this.field3171[arg0][arg1] != null) {
            return true;
        } else if (this.field3170[arg0] == null) {
            this.method3844(arg0);
            return this.field3170[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ib.j(IS)Z")
    public boolean method3837(int arg0) {
        if (this.field3171.length == 1) {
            return this.method3836(0, arg0);
        } else if (this.field3171[arg0].length == 1) {
            return this.method3836(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ib.n(II)Z")
    public boolean method3838(int arg0) {
        if (this.field3170[arg0] == null) {
            this.method3844(arg0);
            return this.field3170[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ib.p(I)Z")
    public boolean method3839() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3161.length; var2++) {
            int var3 = this.field3161[var2];
            if (this.field3170[var3] == null) {
                this.method3844(var3);
                if (this.field3170[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ib.l(II)I")
    public int method3868(int arg0) {
        return this.field3170[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ib.z(II)[B")
    public byte[] method3841(int arg0) {
        if (this.field3171.length == 1) {
            return this.method3834(0, arg0);
        } else if (this.field3171[arg0].length == 1) {
            return this.method3834(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ib.u(III)[B")
    public byte[] method3919(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3171.length || this.field3171[arg0] == null || arg1 < 0 || arg1 >= this.field3171[arg0].length) {
            return null;
        }
        if (this.field3171[arg0][arg1] == null) {
            boolean var3 = this.method3851(arg0, (int[]) null);
            if (!var3) {
                this.method3844(arg0);
                boolean var4 = this.method3851(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class215.method166(this.field3171[arg0][arg1], false);
    }

    @ObfuscatedName("ib.e(IB)[B")
    public byte[] method3850(int arg0) {
        if (this.field3171.length == 1) {
            return this.method3919(0, arg0);
        } else if (this.field3171[arg0].length == 1) {
            return this.method3919(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ib.m(II)V")
    public void method3844(int arg0) {
    }

    @ObfuscatedName("ib.c(II)[I")
    public int[] method3845(int arg0) {
        return arg0 >= 0 && arg0 < this.field3167.length ? this.field3167[arg0] : null;
    }

    @ObfuscatedName("ib.i(IB)I")
    public int method3846(int arg0) {
        return this.field3171[arg0].length;
    }

    @ObfuscatedName("ib.f(I)I")
    public int method3847() {
        return this.field3171.length;
    }

    @ObfuscatedName("ib.y(B)V")
    public void method3896() {
        for (int var1 = 0; var1 < this.field3170.length; var1++) {
            this.field3170[var1] = null;
        }
    }

    @ObfuscatedName("ib.r(II)V")
    public void method3849(int arg0) {
        for (int var2 = 0; var2 < this.field3171[arg0].length; var2++) {
            this.field3171[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ib.q(I)V")
    public void method3891() {
        for (int var1 = 0; var1 < this.field3171.length; var1++) {
            if (this.field3171[var1] != null) {
                for (int var2 = 0; var2 < this.field3171[var1].length; var2++) {
                    this.field3171[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ib.g(I[IB)Z")
    public boolean method3851(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ib.o(Ljava/lang/String;I)I")
    public int method3880(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3165.method6077(class302.method3281(var2));
    }

    @ObfuscatedName("ib.an(ILjava/lang/String;I)I")
    public int method3909(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3169[arg0].method6077(class302.method3281(var3));
    }

    @ObfuscatedName("ib.aj(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3854(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3165.method6077(class302.method3281(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3169[var5].method6077(class302.method3281(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ib.ax(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3855(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3165.method6077(class302.method3281(var3));
        int var6 = this.field3169[var5].method6077(class302.method3281(var4));
        return this.method3834(var5, var6);
    }

    @ObfuscatedName("ib.ag(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3856(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3165.method6077(class302.method3281(var3));
        int var6 = this.field3169[var5].method6077(class302.method3281(var4));
        return this.method3836(var5, var6);
    }

    @ObfuscatedName("ib.au(Ljava/lang/String;B)Z")
    public boolean method3857(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3165.method6077(class302.method3281(var2));
        return this.method3838(var3);
    }

    @ObfuscatedName("ib.as(Ljava/lang/String;I)V")
    public void method3858(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3165.method6077(class302.method3281(var2));
        if (var3 >= 0) {
            this.method3833(var3);
        }
    }

    @ObfuscatedName("ib.ae(Ljava/lang/String;S)I")
    public int method3859(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3165.method6077(class302.method3281(var2));
        return this.method3868(var3);
    }

    @ObfuscatedName("lw.ac([BB)[B")
    public static final byte[] method5473(byte[] arg0) {
        class311 var1 = new class311(arg0);
        int var2 = var1.method5274();
        int var3 = var1.method5120();
        if (var3 < 0 || !(field3172 == 0 || var3 <= field3172)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5127(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5120();
            if (var5 < 0 || field3172 != 0 && var5 > field3172) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class315.method5400(var6, var5, arg0, var3, 9);
            } else {
                field3176.method6075(var1, var6);
            }
            return var6;
        }
    }
}
