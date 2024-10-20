package deob;

@ObfuscatedName("oc")
public abstract class class379 {

    @ObfuscatedName("oc.av")
    public int field4423;

    @ObfuscatedName("oc.aa")
    public int[] field4425;

    @ObfuscatedName("oc.aq")
    public int[] field4415;

    @ObfuscatedName("oc.am")
    public class556 field4416;

    @ObfuscatedName("oc.ac")
    public int[] field4417;

    @ObfuscatedName("oc.ae")
    public int[] field4413;

    @ObfuscatedName("oc.ak")
    public int[] field4414;

    @ObfuscatedName("oc.bp")
    public int[][] field4420;

    @ObfuscatedName("oc.bz")
    public int[][] field4429;

    @ObfuscatedName("oc.bc")
    public class556[] field4422;

    @ObfuscatedName("oc.bf")
    public Object[] field4424;

    @ObfuscatedName("oc.be")
    public Object[][] field4421;

    @ObfuscatedName("oc.bn")
    public static class555 field4419 = new class555();

    @ObfuscatedName("oc.bd")
    public int field4426;

    @ObfuscatedName("oc.bo")
    public boolean field4427;

    @ObfuscatedName("oc.bx")
    public boolean field4428;

    @ObfuscatedName("oc.bl")
    public static int field4418 = 0;

    public class379(boolean arg0, boolean arg1) {
        this.field4427 = arg0;
        this.field4428 = arg1;
    }

    @ObfuscatedName("oc.by([BB)V")
    public void method6326(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class535.method2918(arg0, 0, var2);
        this.field4426 = var3;
        class535 var4 = new class535(method6524(arg0));
        int var5 = var4.method8462();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method8682();
        }
        int var6 = var4.method8462();
        if (var5 >= 7) {
            this.field4423 = var4.method8680();
        } else {
            this.field4423 = var4.method8670();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4425 = new int[this.field4423];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4423; var9++) {
                this.field4425[var9] = var7 += var4.method8680();
                if (this.field4425[var9] > var8) {
                    var8 = this.field4425[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4423; var10++) {
                this.field4425[var10] = var7 += var4.method8670();
                if (this.field4425[var10] > var8) {
                    var8 = this.field4425[var10];
                }
            }
        }
        this.field4417 = new int[var8 + 1];
        this.field4413 = new int[var8 + 1];
        this.field4414 = new int[var8 + 1];
        this.field4420 = new int[var8 + 1][];
        this.field4424 = new Object[var8 + 1];
        this.field4421 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4415 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4423; var11++) {
                this.field4415[this.field4425[var11]] = var4.method8682();
            }
            this.field4416 = new class556(this.field4415);
        }
        for (int var12 = 0; var12 < this.field4423; var12++) {
            this.field4417[this.field4425[var12]] = var4.method8682();
        }
        for (int var13 = 0; var13 < this.field4423; var13++) {
            this.field4413[this.field4425[var13]] = var4.method8682();
        }
        for (int var14 = 0; var14 < this.field4423; var14++) {
            this.field4414[this.field4425[var14]] = var4.method8670();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4423; var15++) {
                int var16 = this.field4425[var15];
                int var17 = this.field4414[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4420[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4420[var16][var20] = var18 += var4.method8680();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4421[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4423; var22++) {
                int var23 = this.field4425[var22];
                int var24 = this.field4414[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4420[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4420[var23][var27] = var25 += var4.method8670();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4421[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4429 = new int[var8 + 1][];
        this.field4422 = new class556[var8 + 1];
        for (int var29 = 0; var29 < this.field4423; var29++) {
            int var30 = this.field4425[var29];
            int var31 = this.field4414[var30];
            this.field4429[var30] = new int[this.field4421[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4429[var30][this.field4420[var30][var32]] = var4.method8682();
            }
            this.field4422[var30] = new class556(this.field4429[var30]);
        }
    }

    @ObfuscatedName("oc.af(II)V")
    public void method6284(int arg0) {
    }

    @ObfuscatedName("oc.bk(III)[B")
    public byte[] method6328(int arg0, int arg1) {
        return this.method6329(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("oc.bt(II[IB)[B")
    public byte[] method6329(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4421.length || this.field4421[arg0] == null || arg1 < 0 || arg1 >= this.field4421[arg0].length) {
            return null;
        }
        if (this.field4421[arg0][arg1] == null) {
            boolean var4 = this.method6343(arg0, arg2);
            if (!var4) {
                this.method6285(arg0);
                boolean var5 = this.method6343(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class354.method6213(this.field4421[arg0][arg1], false);
        if (this.field4428) {
            this.field4421[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("oc.bq(III)Z")
    public boolean method6330(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4421.length || this.field4421[arg0] == null || arg1 < 0 || arg1 >= this.field4421[arg0].length) {
            return false;
        } else if (this.field4421[arg0][arg1] != null) {
            return true;
        } else if (this.field4424[arg0] == null) {
            this.method6285(arg0);
            return this.field4424[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("oc.bi(II)Z")
    public boolean method6331(int arg0) {
        if (this.field4421.length == 1) {
            return this.method6330(0, arg0);
        } else if (this.field4421[arg0].length == 1) {
            return this.method6330(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("oc.bw(II)Z")
    public boolean method6332(int arg0) {
        if (this.field4424[arg0] == null) {
            this.method6285(arg0);
            return this.field4424[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("oc.bm(I)Z")
    public boolean method6333() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4425.length; var2++) {
            int var3 = this.field4425[var2];
            if (this.field4424[var3] == null) {
                this.method6285(var3);
                if (this.field4424[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("oc.al(II)I")
    public int method6295(int arg0) {
        return this.field4424[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("oc.ba(II)[B")
    public byte[] method6335(int arg0) {
        if (this.field4421.length == 1) {
            return this.method6328(0, arg0);
        } else if (this.field4421[arg0].length == 1) {
            return this.method6328(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("oc.bv(IIS)[B")
    public byte[] method6355(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4421.length || this.field4421[arg0] == null || arg1 < 0 || arg1 >= this.field4421[arg0].length) {
            return null;
        }
        if (this.field4421[arg0][arg1] == null) {
            boolean var3 = this.method6343(arg0, (int[]) null);
            if (!var3) {
                this.method6285(arg0);
                boolean var4 = this.method6343(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class354.method6213(this.field4421[arg0][arg1], false);
    }

    @ObfuscatedName("oc.bg(II)[B")
    public byte[] method6337(int arg0) {
        if (this.field4421.length == 1) {
            return this.method6355(0, arg0);
        } else if (this.field4421[arg0].length == 1) {
            return this.method6355(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("oc.at(II)V")
    public void method6285(int arg0) {
    }

    @ObfuscatedName("oc.cb(IB)[I")
    public int[] method6350(int arg0) {
        return arg0 >= 0 && arg0 < this.field4420.length ? this.field4420[arg0] : null;
    }

    @ObfuscatedName("oc.cj(II)I")
    public int method6338(int arg0) {
        return this.field4421 == null || arg0 >= this.field4421.length || this.field4421[arg0] == null ? 0 : this.field4421[arg0].length;
    }

    @ObfuscatedName("oc.cr(B)I")
    public int method6339() {
        return this.field4421.length;
    }

    @ObfuscatedName("oc.cy(I)V")
    public void method6340() {
        for (int var1 = 0; var1 < this.field4424.length; var1++) {
            this.field4424[var1] = null;
        }
    }

    @ObfuscatedName("oc.cg(II)V")
    public void method6341(int arg0) {
        for (int var2 = 0; var2 < this.field4421[arg0].length; var2++) {
            this.field4421[arg0][var2] = null;
        }
    }

    @ObfuscatedName("oc.cl(I)V")
    public void method6342() {
        for (int var1 = 0; var1 < this.field4421.length; var1++) {
            if (this.field4421[var1] != null) {
                for (int var2 = 0; var2 < this.field4421[var1].length; var2++) {
                    this.field4421[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("oc.cw(I[II)Z")
    public boolean method6343(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("oc.ci(Ljava/lang/String;S)I")
    public int method6386(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4416.method9072(class407.method2549(var2));
    }

    @ObfuscatedName("oc.ct(ILjava/lang/String;B)I")
    public int method6345(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4422[arg0].method9072(class407.method2549(var3));
    }

    @ObfuscatedName("oc.cm(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6411(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4416.method9072(class407.method2549(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4422[var5].method9072(class407.method2549(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("oc.cd(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method6347(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4416.method9072(class407.method2549(var3));
        int var6 = this.field4422[var5].method9072(class407.method2549(var4));
        return this.method6328(var5, var6);
    }

    @ObfuscatedName("oc.cc(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6348(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4416.method9072(class407.method2549(var3));
        int var6 = this.field4422[var5].method9072(class407.method2549(var4));
        return this.method6330(var5, var6);
    }

    @ObfuscatedName("oc.cn(Ljava/lang/String;I)Z")
    public boolean method6391(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4416.method9072(class407.method2549(var2));
        return this.method6332(var3);
    }

    @ObfuscatedName("oc.ce(Ljava/lang/String;S)V")
    public void method6349(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4416.method9072(class407.method2549(var2));
        if (var3 >= 0) {
            this.method6284(var3);
        }
    }

    @ObfuscatedName("oc.cp(Ljava/lang/String;B)I")
    public int method6351(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4416.method9072(class407.method2549(var2));
        return this.method6295(var3);
    }

    @ObfuscatedName("oz.cu([BI)[B")
    public static final byte[] method6524(byte[] arg0) {
        class535 var1 = new class535(arg0);
        int var2 = var1.method8462();
        int var3 = var1.method8682();
        if (var3 < 0 || !(field4418 == 0 || var3 <= field4418)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8476(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8682();
            if (var5 < 0 || field4418 != 0 && var5 > field4418) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class538.method8731(var6, var5, arg0, var3, 9);
            } else {
                field4419.method9070(var1, var6);
            }
            return var6;
        }
    }
}
