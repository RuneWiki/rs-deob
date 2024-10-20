package deob;

@ObfuscatedName("hf")
public abstract class class234 {

    @ObfuscatedName("hf.f")
    public int field3137;

    @ObfuscatedName("hf.b")
    public int[] field3136;

    @ObfuscatedName("hf.g")
    public int[] field3139;

    @ObfuscatedName("hf.z")
    public class335 field3140;

    @ObfuscatedName("hf.p")
    public int[] field3141;

    @ObfuscatedName("hf.h")
    public int[] field3149;

    @ObfuscatedName("hf.y")
    public int[] field3143;

    @ObfuscatedName("hf.w")
    public int[][] field3144;

    @ObfuscatedName("hf.i")
    public int[][] field3147;

    @ObfuscatedName("hf.k")
    public class335[] field3146;

    @ObfuscatedName("hf.x")
    public Object[] field3138;

    @ObfuscatedName("hf.o")
    public Object[][] field3148;

    @ObfuscatedName("hf.e")
    public static class334 field3142 = new class334();

    @ObfuscatedName("hf.n")
    public int field3150;

    @ObfuscatedName("hf.r")
    public boolean field3151;

    @ObfuscatedName("hf.c")
    public boolean field3152;

    @ObfuscatedName("hf.a")
    public static int field3153 = 0;

    public class234(boolean arg0, boolean arg1) {
        this.field3151 = arg0;
        this.field3152 = arg1;
    }

    @ObfuscatedName("hf.u([BI)V")
    public void method3886(byte[] arg0) {
        this.field3150 = class300.method3815(arg0, arg0.length);
        class300 var2 = new class300(method3820(arg0));
        int var3 = var2.method5138();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method5277();
        }
        int var4 = var2.method5138();
        if (var3 >= 7) {
            this.field3137 = var2.method5154();
        } else {
            this.field3137 = var2.method5337();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3136 = new int[this.field3137];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3137; var7++) {
                this.field3136[var7] = var5 += var2.method5154();
                if (this.field3136[var7] > var6) {
                    var6 = this.field3136[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3137; var8++) {
                this.field3136[var8] = var5 += var2.method5337();
                if (this.field3136[var8] > var6) {
                    var6 = this.field3136[var8];
                }
            }
        }
        this.field3141 = new int[var6 + 1];
        this.field3149 = new int[var6 + 1];
        this.field3143 = new int[var6 + 1];
        this.field3144 = new int[var6 + 1][];
        this.field3138 = new Object[var6 + 1];
        this.field3148 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3139 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3137; var9++) {
                this.field3139[this.field3136[var9]] = var2.method5277();
            }
            this.field3140 = new class335(this.field3139);
        }
        for (int var10 = 0; var10 < this.field3137; var10++) {
            this.field3141[this.field3136[var10]] = var2.method5277();
        }
        for (int var11 = 0; var11 < this.field3137; var11++) {
            this.field3149[this.field3136[var11]] = var2.method5277();
        }
        for (int var12 = 0; var12 < this.field3137; var12++) {
            this.field3143[this.field3136[var12]] = var2.method5337();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3137; var13++) {
                int var14 = this.field3136[var13];
                int var15 = this.field3143[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3144[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3144[var14][var18] = var16 += var2.method5154();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3148[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3137; var20++) {
                int var21 = this.field3136[var20];
                int var22 = this.field3143[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3144[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3144[var21][var25] = var23 += var2.method5337();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3148[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3147 = new int[var6 + 1][];
        this.field3146 = new class335[var6 + 1];
        for (int var27 = 0; var27 < this.field3137; var27++) {
            int var28 = this.field3136[var27];
            int var29 = this.field3143[var28];
            this.field3147[var28] = new int[this.field3148[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3147[var28][this.field3144[var28][var30]] = var2.method5277();
            }
            this.field3146[var28] = new class335(this.field3147[var28]);
        }
    }

    @ObfuscatedName("hf.f(II)V")
    public void method3842(int arg0) {
    }

    @ObfuscatedName("hf.b(IIB)[B")
    public byte[] method3928(int arg0, int arg1) {
        return this.method3844(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("hf.g(II[II)[B")
    public byte[] method3844(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3148.length || this.field3148[arg0] == null || arg1 < 0 || arg1 >= this.field3148[arg0].length) {
            return null;
        }
        if (this.field3148[arg0][arg1] == null) {
            boolean var4 = this.method3860(arg0, arg2);
            if (!var4) {
                this.method3853(arg0);
                boolean var5 = this.method3860(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class206.method4972(this.field3148[arg0][arg1], false);
        if (this.field3152) {
            this.field3148[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("hf.z(III)Z")
    public boolean method3897(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3148.length || this.field3148[arg0] == null || arg1 < 0 || arg1 >= this.field3148[arg0].length) {
            return false;
        } else if (this.field3148[arg0][arg1] != null) {
            return true;
        } else if (this.field3138[arg0] == null) {
            this.method3853(arg0);
            return this.field3138[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hf.p(II)Z")
    public boolean method3846(int arg0) {
        if (this.field3148.length == 1) {
            return this.method3897(0, arg0);
        } else if (this.field3148[arg0].length == 1) {
            return this.method3897(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hf.h(IB)Z")
    public boolean method3889(int arg0) {
        if (this.field3138[arg0] == null) {
            this.method3853(arg0);
            return this.field3138[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hf.y(I)Z")
    public boolean method3848() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3136.length; var2++) {
            int var3 = this.field3136[var2];
            if (this.field3138[var3] == null) {
                this.method3853(var3);
                if (this.field3138[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("hf.w(II)I")
    public int method3849(int arg0) {
        return this.field3138[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("hf.i(II)[B")
    public byte[] method3850(int arg0) {
        if (this.field3148.length == 1) {
            return this.method3928(0, arg0);
        } else if (this.field3148[arg0].length == 1) {
            return this.method3928(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hf.k(III)[B")
    public byte[] method3851(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3148.length || this.field3148[arg0] == null || arg1 < 0 || arg1 >= this.field3148[arg0].length) {
            return null;
        }
        if (this.field3148[arg0][arg1] == null) {
            boolean var3 = this.method3860(arg0, (int[]) null);
            if (!var3) {
                this.method3853(arg0);
                boolean var4 = this.method3860(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class206.method4972(this.field3148[arg0][arg1], false);
    }

    @ObfuscatedName("hf.x(IS)[B")
    public byte[] method3845(int arg0) {
        if (this.field3148.length == 1) {
            return this.method3851(0, arg0);
        } else if (this.field3148[arg0].length == 1) {
            return this.method3851(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("hf.o(II)V")
    public void method3853(int arg0) {
    }

    @ObfuscatedName("hf.e(II)[I")
    public int[] method3854(int arg0) {
        return arg0 >= 0 && arg0 < this.field3144.length ? this.field3144[arg0] : null;
    }

    @ObfuscatedName("hf.n(II)I")
    public int method3878(int arg0) {
        return this.field3148[arg0].length;
    }

    @ObfuscatedName("hf.c(I)I")
    public int method3856() {
        return this.field3148.length;
    }

    @ObfuscatedName("hf.s(I)V")
    public void method3857() {
        for (int var1 = 0; var1 < this.field3138.length; var1++) {
            this.field3138[var1] = null;
        }
    }

    @ObfuscatedName("hf.t(II)V")
    public void method3858(int arg0) {
        for (int var2 = 0; var2 < this.field3148[arg0].length; var2++) {
            this.field3148[arg0][var2] = null;
        }
    }

    @ObfuscatedName("hf.m(I)V")
    public void method3859() {
        for (int var1 = 0; var1 < this.field3148.length; var1++) {
            if (this.field3148[var1] != null) {
                for (int var2 = 0; var2 < this.field3148[var1].length; var2++) {
                    this.field3148[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("hf.v(I[II)Z")
    public boolean method3860(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("hf.q(Ljava/lang/String;I)I")
    public int method3917(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3140.method6064(class291.method662(var2));
    }

    @ObfuscatedName("hf.l(ILjava/lang/String;B)I")
    public int method3901(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3146[arg0].method6064(class291.method662(var3));
    }

    @ObfuscatedName("hf.j(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3863(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3140.method6064(class291.method662(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3146[var5].method6064(class291.method662(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("hf.ad(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3864(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3140.method6064(class291.method662(var3));
        int var6 = this.field3146[var5].method6064(class291.method662(var4));
        return this.method3928(var5, var6);
    }

    @ObfuscatedName("hf.am(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3888(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3140.method6064(class291.method662(var3));
        int var6 = this.field3146[var5].method6064(class291.method662(var4));
        return this.method3897(var5, var6);
    }

    @ObfuscatedName("hf.ai(Ljava/lang/String;B)Z")
    public boolean method3866(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3140.method6064(class291.method662(var2));
        return this.method3889(var3);
    }

    @ObfuscatedName("hf.ag(Ljava/lang/String;I)V")
    public void method3867(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3140.method6064(class291.method662(var2));
        if (var3 >= 0) {
            this.method3842(var3);
        }
    }

    @ObfuscatedName("hf.ao(Ljava/lang/String;I)I")
    public int method3862(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3140.method6064(class291.method662(var2));
        return this.method3849(var3);
    }

    @ObfuscatedName("hq.aw([BI)[B")
    public static final byte[] method3820(byte[] arg0) {
        class300 var1 = new class300(arg0);
        int var2 = var1.method5138();
        int var3 = var1.method5277();
        if (var3 < 0 || !(field3153 == 0 || var3 <= field3153)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method5228(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method5277();
            if (var5 < 0 || field3153 != 0 && var5 > field3153) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class304.method5419(var6, var5, arg0, var3, 9);
            } else {
                field3142.method6058(var1, var6);
            }
            return var6;
        }
    }
}
