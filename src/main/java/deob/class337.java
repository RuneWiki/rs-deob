package deob;

@ObfuscatedName("ln")
public abstract class class337 {

    @ObfuscatedName("ln.o")
    public int field4230;

    @ObfuscatedName("ln.u")
    public int[] field4220;

    @ObfuscatedName("ln.x")
    public int[] field4222;

    @ObfuscatedName("ln.a")
    public class495 field4237;

    @ObfuscatedName("ln.q")
    public int[] field4221;

    @ObfuscatedName("ln.d")
    public int[] field4225;

    @ObfuscatedName("ln.e")
    public int[] field4226;

    @ObfuscatedName("ln.g")
    public int[][] field4227;

    @ObfuscatedName("ln.y")
    public int[][] field4233;

    @ObfuscatedName("ln.af")
    public class495[] field4229;

    @ObfuscatedName("ln.aa")
    public Object[] field4228;

    @ObfuscatedName("ln.ai")
    public Object[][] field4231;

    @ObfuscatedName("ln.ag")
    public static class494 field4232 = new class494();

    @ObfuscatedName("ln.aw")
    public int field4235;

    @ObfuscatedName("ln.ar")
    public boolean field4234;

    @ObfuscatedName("ln.al")
    public boolean field4224;

    @ObfuscatedName("ln.at")
    public static int field4223 = 0;

    public class337(boolean arg0, boolean arg1) {
        this.field4234 = arg0;
        this.field4224 = arg1;
    }

    @ObfuscatedName("ln.au([BI)V")
    public void method5972(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class474.method6953(arg0, 0, var2);
        this.field4235 = var3;
        class474 var4 = new class474(method3139(arg0));
        int var5 = var4.method7964();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method7979();
        }
        int var6 = var4.method7964();
        if (var5 >= 7) {
            this.field4230 = var4.method7982();
        } else {
            this.field4230 = var4.method8032();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4220 = new int[this.field4230];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4230; var9++) {
                this.field4220[var9] = var7 += var4.method7982();
                if (this.field4220[var9] > var8) {
                    var8 = this.field4220[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4230; var10++) {
                this.field4220[var10] = var7 += var4.method8032();
                if (this.field4220[var10] > var8) {
                    var8 = this.field4220[var10];
                }
            }
        }
        this.field4221 = new int[var8 + 1];
        this.field4225 = new int[var8 + 1];
        this.field4226 = new int[var8 + 1];
        this.field4227 = new int[var8 + 1][];
        this.field4228 = new Object[var8 + 1];
        this.field4231 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4222 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4230; var11++) {
                this.field4222[this.field4220[var11]] = var4.method7979();
            }
            this.field4237 = new class495(this.field4222);
        }
        for (int var12 = 0; var12 < this.field4230; var12++) {
            this.field4221[this.field4220[var12]] = var4.method7979();
        }
        for (int var13 = 0; var13 < this.field4230; var13++) {
            this.field4225[this.field4220[var13]] = var4.method7979();
        }
        for (int var14 = 0; var14 < this.field4230; var14++) {
            this.field4226[this.field4220[var14]] = var4.method8032();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4230; var15++) {
                int var16 = this.field4220[var15];
                int var17 = this.field4226[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4227[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4227[var16][var20] = var18 += var4.method7982();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4231[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4230; var22++) {
                int var23 = this.field4220[var22];
                int var24 = this.field4226[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4227[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4227[var23][var27] = var25 += var4.method8032();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4231[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4233 = new int[var8 + 1][];
        this.field4229 = new class495[var8 + 1];
        for (int var29 = 0; var29 < this.field4230; var29++) {
            int var30 = this.field4220[var29];
            int var31 = this.field4226[var30];
            this.field4233[var30] = new int[this.field4231[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4233[var30][this.field4227[var30][var32]] = var4.method7979();
            }
            this.field4229[var30] = new class495(this.field4233[var30]);
        }
    }

    @ObfuscatedName("ln.v(II)V")
    public void method5925(int arg0) {
    }

    @ObfuscatedName("ln.ae(IIB)[B")
    public byte[] method5990(int arg0, int arg1) {
        return this.method5974(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ln.ah(II[IB)[B")
    public byte[] method5974(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4231.length || this.field4231[arg0] == null || arg1 < 0 || arg1 >= this.field4231[arg0].length) {
            return null;
        }
        if (this.field4231[arg0][arg1] == null) {
            boolean var4 = this.method6052(arg0, arg2);
            if (!var4) {
                this.method5945(arg0);
                boolean var5 = this.method6052(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class314.method4852(this.field4231[arg0][arg1], false);
        if (this.field4224) {
            this.field4231[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ln.ad(III)Z")
    public boolean method5983(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4231.length || this.field4231[arg0] == null || arg1 < 0 || arg1 >= this.field4231[arg0].length) {
            return false;
        } else if (this.field4231[arg0][arg1] != null) {
            return true;
        } else if (this.field4228[arg0] == null) {
            this.method5945(arg0);
            return this.field4228[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ln.ab(II)Z")
    public boolean method6046(int arg0) {
        if (this.field4231.length == 1) {
            return this.method5983(0, arg0);
        } else if (this.field4231[arg0].length == 1) {
            return this.method5983(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ln.an(II)Z")
    public boolean method5976(int arg0) {
        if (this.field4228[arg0] == null) {
            this.method5945(arg0);
            return this.field4228[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ln.am(B)Z")
    public boolean method6034() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4220.length; var2++) {
            int var3 = this.field4220[var2];
            if (this.field4228[var3] == null) {
                this.method5945(var3);
                if (this.field4228[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ln.k(II)I")
    public int method5935(int arg0) {
        return this.field4228[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ln.as(II)[B")
    public byte[] method5978(int arg0) {
        if (this.field4231.length == 1) {
            return this.method5990(0, arg0);
        } else if (this.field4231[arg0].length == 1) {
            return this.method5990(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ln.ao(III)[B")
    public byte[] method6001(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4231.length || this.field4231[arg0] == null || arg1 < 0 || arg1 >= this.field4231[arg0].length) {
            return null;
        }
        if (this.field4231[arg0][arg1] == null) {
            boolean var3 = this.method6052(arg0, (int[]) null);
            if (!var3) {
                this.method5945(arg0);
                boolean var4 = this.method6052(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class314.method4852(this.field4231[arg0][arg1], false);
    }

    @ObfuscatedName("ln.bj(II)[B")
    public byte[] method5980(int arg0) {
        if (this.field4231.length == 1) {
            return this.method6001(0, arg0);
        } else if (this.field4231[arg0].length == 1) {
            return this.method6001(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ln.s(IB)V")
    public void method5945(int arg0) {
    }

    @ObfuscatedName("ln.bf(IB)[I")
    public int[] method5981(int arg0) {
        return arg0 >= 0 && arg0 < this.field4227.length ? this.field4227[arg0] : null;
    }

    @ObfuscatedName("ln.bz(II)I")
    public int method5982(int arg0) {
        return this.field4231[arg0].length;
    }

    @ObfuscatedName("ln.br(I)I")
    public int method6055() {
        return this.field4231.length;
    }

    @ObfuscatedName("ln.bm(B)V")
    public void method5984() {
        for (int var1 = 0; var1 < this.field4228.length; var1++) {
            this.field4228[var1] = null;
        }
    }

    @ObfuscatedName("ln.be(II)V")
    public void method5973(int arg0) {
        for (int var2 = 0; var2 < this.field4231[arg0].length; var2++) {
            this.field4231[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ln.bo(I)V")
    public void method5986() {
        for (int var1 = 0; var1 < this.field4231.length; var1++) {
            if (this.field4231[var1] != null) {
                for (int var2 = 0; var2 < this.field4231[var1].length; var2++) {
                    this.field4231[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ln.bl(I[IB)Z")
    public boolean method6052(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("ln.bq(Ljava/lang/String;B)I")
    public int method5988(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4237.method8553(class365.method6126(var2));
    }

    @ObfuscatedName("ln.bn(ILjava/lang/String;I)I")
    public int method6057(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4229[arg0].method8553(class365.method6126(var3));
    }

    @ObfuscatedName("ln.bi(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5989(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4237.method8553(class365.method6126(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4229[var5].method8553(class365.method6126(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ln.bw(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method5971(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4237.method8553(class365.method6126(var3));
        int var6 = this.field4229[var5].method8553(class365.method6126(var4));
        return this.method5990(var5, var6);
    }

    @ObfuscatedName("ln.bt(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method5991(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4237.method8553(class365.method6126(var3));
        int var6 = this.field4229[var5].method8553(class365.method6126(var4));
        return this.method5983(var5, var6);
    }

    @ObfuscatedName("ln.bd(Ljava/lang/String;I)Z")
    public boolean method5992(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4237.method8553(class365.method6126(var2));
        return this.method5976(var3);
    }

    @ObfuscatedName("ln.bg(Ljava/lang/String;B)V")
    public void method5993(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4237.method8553(class365.method6126(var2));
        if (var3 >= 0) {
            this.method5925(var3);
        }
    }

    @ObfuscatedName("ln.bb(Ljava/lang/String;B)I")
    public int method5994(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4237.method8553(class365.method6126(var2));
        return this.method5935(var3);
    }

    @ObfuscatedName("fl.bk([BI)[B")
    public static final byte[] method3139(byte[] arg0) {
        class474 var1 = new class474(arg0);
        int var2 = var1.method7964();
        int var3 = var1.method7979();
        if (var3 < 0 || !(field4223 == 0 || var3 <= field4223)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8162(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method7979();
            if (var5 < 0 || field4223 != 0 && var5 > field4223) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class477.method8232(var6, var5, arg0, var3, 9);
            } else {
                field4232.method8549(var1, var6);
            }
            return var6;
        }
    }
}
