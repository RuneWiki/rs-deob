package deob;

@ObfuscatedName("ku")
public abstract class class302 {

    @ObfuscatedName("ku.h")
    public int field3833;

    @ObfuscatedName("ku.g")
    public int[] field3838;

    @ObfuscatedName("ku.e")
    public int[] field3836;

    @ObfuscatedName("ku.a")
    public class438 field3835;

    @ObfuscatedName("ku.u")
    public int[] field3848;

    @ObfuscatedName("ku.k")
    public int[] field3837;

    @ObfuscatedName("ku.f")
    public int[] field3843;

    @ObfuscatedName("ku.l")
    public int[][] field3834;

    @ObfuscatedName("ku.q")
    public int[][] field3840;

    @ObfuscatedName("ku.x")
    public class438[] field3841;

    @ObfuscatedName("ku.z")
    public Object[] field3842;

    @ObfuscatedName("ku.i")
    public Object[][] field3850;

    @ObfuscatedName("ku.y")
    public static class437 field3832 = new class437();

    @ObfuscatedName("ku.ah")
    public int field3845;

    @ObfuscatedName("ku.ao")
    public boolean field3846;

    @ObfuscatedName("ku.ab")
    public boolean field3847;

    @ObfuscatedName("ku.an")
    public static int field3844 = 0;

    public class302(boolean arg0, boolean arg1) {
        this.field3846 = arg0;
        this.field3847 = arg1;
    }

    @ObfuscatedName("ku.aq([BI)V")
    public void method5051(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class419.method5717(arg0, 0, var2);
        this.field3845 = var3;
        class419 var4 = new class419(method3982(arg0));
        int var5 = var4.method6781();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method6675();
        }
        int var6 = var4.method6781();
        if (var5 >= 7) {
            this.field3833 = var4.method6869();
        } else {
            this.field3833 = var4.method6672();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3838 = new int[this.field3833];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3833; var9++) {
                this.field3838[var9] = var7 += var4.method6869();
                if (this.field3838[var9] > var8) {
                    var8 = this.field3838[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3833; var10++) {
                this.field3838[var10] = var7 += var4.method6672();
                if (this.field3838[var10] > var8) {
                    var8 = this.field3838[var10];
                }
            }
        }
        this.field3848 = new int[var8 + 1];
        this.field3837 = new int[var8 + 1];
        this.field3843 = new int[var8 + 1];
        this.field3834 = new int[var8 + 1][];
        this.field3842 = new Object[var8 + 1];
        this.field3850 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3836 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3833; var11++) {
                this.field3836[this.field3838[var11]] = var4.method6675();
            }
            this.field3835 = new class438(this.field3836);
        }
        for (int var12 = 0; var12 < this.field3833; var12++) {
            this.field3848[this.field3838[var12]] = var4.method6675();
        }
        for (int var13 = 0; var13 < this.field3833; var13++) {
            this.field3837[this.field3838[var13]] = var4.method6675();
        }
        for (int var14 = 0; var14 < this.field3833; var14++) {
            this.field3843[this.field3838[var14]] = var4.method6672();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3833; var15++) {
                int var16 = this.field3838[var15];
                int var17 = this.field3843[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3834[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3834[var16][var20] = var18 += var4.method6869();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3850[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3833; var22++) {
                int var23 = this.field3838[var22];
                int var24 = this.field3843[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3834[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3834[var23][var27] = var25 += var4.method6672();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3850[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3840 = new int[var8 + 1][];
        this.field3841 = new class438[var8 + 1];
        for (int var29 = 0; var29 < this.field3833; var29++) {
            int var30 = this.field3838[var29];
            int var31 = this.field3843[var30];
            this.field3840[var30] = new int[this.field3850[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3840[var30][this.field3834[var30][var32]] = var4.method6675();
            }
            this.field3841[var30] = new class438(this.field3840[var30]);
        }
    }

    @ObfuscatedName("ku.p(II)V")
    public void method5003(int arg0) {
    }

    @ObfuscatedName("ku.aw(IIB)[B")
    public byte[] method5053(int arg0, int arg1) {
        return this.method5061(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ku.ay(II[II)[B")
    public byte[] method5061(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3850.length || this.field3850[arg0] == null || arg1 < 0 || arg1 >= this.field3850[arg0].length) {
            return null;
        }
        if (this.field3850[arg0][arg1] == null) {
            boolean var4 = this.method5079(arg0, arg2);
            if (!var4) {
                this.method5027(arg0);
                boolean var5 = this.method5079(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class271.method1082(this.field3850[arg0][arg1], false);
        if (this.field3847) {
            this.field3850[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ku.ae(IIS)Z")
    public boolean method5055(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3850.length || this.field3850[arg0] == null || arg1 < 0 || arg1 >= this.field3850[arg0].length) {
            return false;
        } else if (this.field3850[arg0][arg1] != null) {
            return true;
        } else if (this.field3842[arg0] == null) {
            this.method5027(arg0);
            return this.field3842[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ku.ak(IB)Z")
    public boolean method5056(int arg0) {
        if (this.field3850.length == 1) {
            return this.method5055(0, arg0);
        } else if (this.field3850[arg0].length == 1) {
            return this.method5055(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ku.ad(II)Z")
    public boolean method5057(int arg0) {
        if (this.field3842[arg0] == null) {
            this.method5027(arg0);
            return this.field3842[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ku.bp(B)Z")
    public boolean method5054() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3838.length; var2++) {
            int var3 = this.field3838[var2];
            if (this.field3842[var3] == null) {
                this.method5027(var3);
                if (this.field3842[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ku.n(IB)I")
    public int method5009(int arg0) {
        return this.field3842[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ku.bd(II)[B")
    public byte[] method5059(int arg0) {
        if (this.field3850.length == 1) {
            return this.method5053(0, arg0);
        } else if (this.field3850[arg0].length == 1) {
            return this.method5053(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ku.ba(IIB)[B")
    public byte[] method5073(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3850.length || this.field3850[arg0] == null || arg1 < 0 || arg1 >= this.field3850[arg0].length) {
            return null;
        }
        if (this.field3850[arg0][arg1] == null) {
            boolean var3 = this.method5079(arg0, (int[]) null);
            if (!var3) {
                this.method5027(arg0);
                boolean var4 = this.method5079(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class271.method1082(this.field3850[arg0][arg1], false);
    }

    @ObfuscatedName("ku.bq(II)[B")
    public byte[] method5109(int arg0) {
        if (this.field3850.length == 1) {
            return this.method5073(0, arg0);
        } else if (this.field3850[arg0].length == 1) {
            return this.method5073(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ku.m(II)V")
    public void method5027(int arg0) {
    }

    @ObfuscatedName("ku.bg(II)[I")
    public int[] method5063(int arg0) {
        return arg0 >= 0 && arg0 < this.field3834.length ? this.field3834[arg0] : null;
    }

    @ObfuscatedName("ku.br(IB)I")
    public int method5144(int arg0) {
        return this.field3850[arg0].length;
    }

    @ObfuscatedName("ku.bi(I)I")
    public int method5062() {
        return this.field3850.length;
    }

    @ObfuscatedName("ku.bm(I)V")
    public void method5065() {
        for (int var1 = 0; var1 < this.field3842.length; var1++) {
            this.field3842[var1] = null;
        }
    }

    @ObfuscatedName("ku.bs(II)V")
    public void method5066(int arg0) {
        for (int var2 = 0; var2 < this.field3850[arg0].length; var2++) {
            this.field3850[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ku.bv(B)V")
    public void method5067() {
        for (int var1 = 0; var1 < this.field3850.length; var1++) {
            if (this.field3850[var1] != null) {
                for (int var2 = 0; var2 < this.field3850[var1].length; var2++) {
                    this.field3850[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ku.bb(I[II)Z")
    public boolean method5079(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ku.bc(Ljava/lang/String;I)I")
    public int method5118(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3835.method7183(class331.method4962(var2));
    }

    @ObfuscatedName("ku.bx(ILjava/lang/String;I)I")
    public int method5070(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3841[arg0].method7183(class331.method4962(var3));
    }

    @ObfuscatedName("ku.bt(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5071(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3835.method7183(class331.method4962(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3841[var5].method7183(class331.method4962(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ku.bh(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method5069(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3835.method7183(class331.method4962(var3));
        int var6 = this.field3841[var5].method7183(class331.method4962(var4));
        return this.method5053(var5, var6);
    }

    @ObfuscatedName("ku.bn(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5092(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3835.method7183(class331.method4962(var3));
        int var6 = this.field3841[var5].method7183(class331.method4962(var4));
        return this.method5055(var5, var6);
    }

    @ObfuscatedName("ku.bj(Ljava/lang/String;I)Z")
    public boolean method5086(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3835.method7183(class331.method4962(var2));
        return this.method5057(var3);
    }

    @ObfuscatedName("ku.by(Ljava/lang/String;B)V")
    public void method5075(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3835.method7183(class331.method4962(var2));
        if (var3 >= 0) {
            this.method5003(var3);
        }
    }

    @ObfuscatedName("ku.bk(Ljava/lang/String;I)I")
    public int method5104(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3835.method7183(class331.method4962(var2));
        return this.method5009(var3);
    }

    @ObfuscatedName("gz.bo([BB)[B")
    public static final byte[] method3982(byte[] arg0) {
        class419 var1 = new class419(arg0);
        int var2 = var1.method6781();
        int var3 = var1.method6675();
        if (var3 < 0 || !(field3844 == 0 || var3 <= field3844)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method6683(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method6675();
            if (var5 < 0 || field3844 != 0 && var5 > field3844) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class421.method6881(var6, var5, arg0, var3, 9);
            } else {
                field3832.method7180(var1, var6);
            }
            return var6;
        }
    }
}
