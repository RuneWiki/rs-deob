package deob;

@ObfuscatedName("of")
public abstract class class378 {

    @ObfuscatedName("of.at")
    public int field4397;

    @ObfuscatedName("of.ay")
    public int[] field4391;

    @ObfuscatedName("of.ae")
    public int[] field4392;

    @ObfuscatedName("of.ac")
    public class555 field4401;

    @ObfuscatedName("of.ab")
    public int[] field4394;

    @ObfuscatedName("of.av")
    public int[] field4395;

    @ObfuscatedName("of.ap")
    public int[] field4396;

    @ObfuscatedName("of.bu")
    public int[][] field4398;

    @ObfuscatedName("of.bo")
    public int[][] field4400;

    @ObfuscatedName("of.bd")
    public class555[] field4393;

    @ObfuscatedName("of.bi")
    public Object[] field4404;

    @ObfuscatedName("of.bq")
    public Object[][] field4406;

    @ObfuscatedName("of.ba")
    public static class554 field4402 = new class554();

    @ObfuscatedName("of.bt")
    public int field4403;

    @ObfuscatedName("of.bk")
    public boolean field4390;

    @ObfuscatedName("of.bm")
    public boolean field4405;

    @ObfuscatedName("of.bw")
    public static int field4399 = 0;

    public class378(boolean arg0, boolean arg1) {
        this.field4390 = arg0;
        this.field4405 = arg1;
    }

    @ObfuscatedName("of.bx([BB)V")
    public void method6417(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class534.method6936(arg0, 0, var2);
        this.field4403 = var3;
        class534 var4 = new class534(method5427(arg0));
        int var5 = var4.method8591();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method8597();
        }
        int var6 = var4.method8591();
        if (var5 >= 7) {
            this.field4397 = var4.method8743();
        } else {
            this.field4397 = var4.method8593();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4391 = new int[this.field4397];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4397; var9++) {
                this.field4391[var9] = var7 += var4.method8743();
                if (this.field4391[var9] > var8) {
                    var8 = this.field4391[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4397; var10++) {
                this.field4391[var10] = var7 += var4.method8593();
                if (this.field4391[var10] > var8) {
                    var8 = this.field4391[var10];
                }
            }
        }
        this.field4394 = new int[var8 + 1];
        this.field4395 = new int[var8 + 1];
        this.field4396 = new int[var8 + 1];
        this.field4398 = new int[var8 + 1][];
        this.field4404 = new Object[var8 + 1];
        this.field4406 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4392 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4397; var11++) {
                this.field4392[this.field4391[var11]] = var4.method8597();
            }
            this.field4401 = new class555(this.field4392);
        }
        for (int var12 = 0; var12 < this.field4397; var12++) {
            this.field4394[this.field4391[var12]] = var4.method8597();
        }
        for (int var13 = 0; var13 < this.field4397; var13++) {
            this.field4395[this.field4391[var13]] = var4.method8597();
        }
        for (int var14 = 0; var14 < this.field4397; var14++) {
            this.field4396[this.field4391[var14]] = var4.method8593();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4397; var15++) {
                int var16 = this.field4391[var15];
                int var17 = this.field4396[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4398[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4398[var16][var20] = var18 += var4.method8743();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4406[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4397; var22++) {
                int var23 = this.field4391[var22];
                int var24 = this.field4396[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4398[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4398[var23][var27] = var25 += var4.method8593();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4406[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4400 = new int[var8 + 1][];
        this.field4393 = new class555[var8 + 1];
        for (int var29 = 0; var29 < this.field4397; var29++) {
            int var30 = this.field4391[var29];
            int var31 = this.field4396[var30];
            this.field4400[var30] = new int[this.field4406[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4400[var30][this.field4398[var30][var32]] = var4.method8597();
            }
            this.field4393[var30] = new class555(this.field4400[var30]);
        }
    }

    @ObfuscatedName("of.al(IS)V")
    public void method6398(int arg0) {
    }

    @ObfuscatedName("of.cs(III)[B")
    public byte[] method6489(int arg0, int arg1) {
        return this.method6419(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("of.ch(II[II)[B")
    public byte[] method6419(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4406.length || this.field4406[arg0] == null || arg1 < 0 || arg1 >= this.field4406[arg0].length) {
            return null;
        }
        if (this.field4406[arg0][arg1] == null) {
            boolean var4 = this.method6434(arg0, arg2);
            if (!var4) {
                this.method6367(arg0);
                boolean var5 = this.method6434(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class352.method5373(this.field4406[arg0][arg1], false);
        if (this.field4405) {
            this.field4406[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("of.co(IIB)Z")
    public boolean method6420(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4406.length || this.field4406[arg0] == null || arg1 < 0 || arg1 >= this.field4406[arg0].length) {
            return false;
        } else if (this.field4406[arg0][arg1] != null) {
            return true;
        } else if (this.field4404[arg0] == null) {
            this.method6367(arg0);
            return this.field4404[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("of.cd(II)Z")
    public boolean method6421(int arg0) {
        if (this.field4406.length == 1) {
            return this.method6420(0, arg0);
        } else if (this.field4406[arg0].length == 1) {
            return this.method6420(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("of.cg(II)Z")
    public boolean method6422(int arg0) {
        if (this.field4404[arg0] == null) {
            this.method6367(arg0);
            return this.field4404[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("of.cn(I)Z")
    public boolean method6446() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4391.length; var2++) {
            int var3 = this.field4391[var2];
            if (this.field4404[var3] == null) {
                this.method6367(var3);
                if (this.field4404[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("of.au(II)I")
    public int method6373(int arg0) {
        return this.field4404[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("of.cz(II)[B")
    public byte[] method6425(int arg0) {
        if (this.field4406.length == 1) {
            return this.method6489(0, arg0);
        } else if (this.field4406[arg0].length == 1) {
            return this.method6489(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("of.ci(IIB)[B")
    public byte[] method6426(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4406.length || this.field4406[arg0] == null || arg1 < 0 || arg1 >= this.field4406[arg0].length) {
            return null;
        }
        if (this.field4406[arg0][arg1] == null) {
            boolean var3 = this.method6434(arg0, (int[]) null);
            if (!var3) {
                this.method6367(arg0);
                boolean var4 = this.method6434(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class352.method5373(this.field4406[arg0][arg1], false);
    }

    @ObfuscatedName("of.cl(II)[B")
    public byte[] method6461(int arg0) {
        if (this.field4406.length == 1) {
            return this.method6426(0, arg0);
        } else if (this.field4406[arg0].length == 1) {
            return this.method6426(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("of.ai(IB)V")
    public void method6367(int arg0) {
    }

    @ObfuscatedName("of.cm(II)[I")
    public int[] method6510(int arg0) {
        return arg0 >= 0 && arg0 < this.field4398.length ? this.field4398[arg0] : null;
    }

    @ObfuscatedName("of.cx(II)I")
    public int method6429(int arg0) {
        return this.field4406 == null || arg0 >= this.field4406.length || this.field4406[arg0] == null ? 0 : this.field4406[arg0].length;
    }

    @ObfuscatedName("of.cw(I)I")
    public int method6454() {
        return this.field4406.length;
    }

    @ObfuscatedName("of.cy(I)V")
    public void method6431() {
        for (int var1 = 0; var1 < this.field4404.length; var1++) {
            this.field4404[var1] = null;
        }
    }

    @ObfuscatedName("of.cu(IB)V")
    public void method6432(int arg0) {
        for (int var2 = 0; var2 < this.field4406[arg0].length; var2++) {
            this.field4406[arg0][var2] = null;
        }
    }

    @ObfuscatedName("of.ce(I)V")
    public void method6433() {
        for (int var1 = 0; var1 < this.field4406.length; var1++) {
            if (this.field4406[var1] != null) {
                for (int var2 = 0; var2 < this.field4406[var1].length; var2++) {
                    this.field4406[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("of.cv(I[II)Z")
    public boolean method6434(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("of.cj(Ljava/lang/String;B)I")
    public int method6435(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4401.method9176(class406.method6287(var2));
    }

    @ObfuscatedName("of.ct(ILjava/lang/String;B)I")
    public int method6436(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4393[arg0].method9176(class406.method6287(var3));
    }

    @ObfuscatedName("of.ck(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6496(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4401.method9176(class406.method6287(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4393[var5].method9176(class406.method6287(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("of.ca(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6438(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4401.method9176(class406.method6287(var3));
        int var6 = this.field4393[var5].method9176(class406.method6287(var4));
        return this.method6489(var5, var6);
    }

    @ObfuscatedName("of.cp(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6430(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4401.method9176(class406.method6287(var3));
        int var6 = this.field4393[var5].method9176(class406.method6287(var4));
        return this.method6420(var5, var6);
    }

    @ObfuscatedName("of.cc(Ljava/lang/String;B)Z")
    public boolean method6448(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4401.method9176(class406.method6287(var2));
        return this.method6422(var3);
    }

    @ObfuscatedName("of.cb(Ljava/lang/String;I)V")
    public void method6440(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4401.method9176(class406.method6287(var2));
        if (var3 >= 0) {
            this.method6398(var3);
        }
    }

    @ObfuscatedName("of.cq(Ljava/lang/String;I)I")
    public int method6441(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4401.method9176(class406.method6287(var2));
        return this.method6373(var3);
    }

    @ObfuscatedName("lq.cf([BI)[B")
    public static final byte[] method5427(byte[] arg0) {
        class534 var1 = new class534(arg0);
        int var2 = var1.method8591();
        int var3 = var1.method8597();
        if (var3 < 0 || !(field4399 == 0 || var3 <= field4399)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8605(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8597();
            if (var5 < 0 || field4399 != 0 && var5 > field4399) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class537.method8836(var6, var5, arg0, var3, 9);
            } else {
                field4402.method9172(var1, var6);
            }
            return var6;
        }
    }
}
