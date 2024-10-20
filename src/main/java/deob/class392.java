package deob;

@ObfuscatedName("pe")
public abstract class class392 {

    @ObfuscatedName("pe.ac")
    public int field4603;

    @ObfuscatedName("pe.av")
    public int[] field4593;

    @ObfuscatedName("pe.ax")
    public int[] field4590;

    @ObfuscatedName("pe.aq")
    public class580 field4591;

    @ObfuscatedName("pe.al")
    public int[] field4604;

    @ObfuscatedName("pe.aa")
    public int[] field4589;

    @ObfuscatedName("pe.ah")
    public int[] field4594;

    @ObfuscatedName("pe.bh")
    public int[][] field4588;

    @ObfuscatedName("pe.bj")
    public int[][] field4596;

    @ObfuscatedName("pe.bv")
    public class580[] field4597;

    @ObfuscatedName("pe.bx")
    public Object[] field4598;

    @ObfuscatedName("pe.bk")
    public Object[][] field4599;

    @ObfuscatedName("pe.bb")
    public static class579 field4595 = new class579();

    @ObfuscatedName("pe.bq")
    public int field4592;

    @ObfuscatedName("pe.bp")
    public boolean field4602;

    @ObfuscatedName("pe.bz")
    public boolean field4601;

    @ObfuscatedName("pe.bc")
    public static int field4600 = 0;

    public class392(boolean arg0, boolean arg1) {
        this.field4602 = arg0;
        this.field4601 = arg1;
    }

    @ObfuscatedName("pe.bs([BB)V")
    public void method7060(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class558.method3797(arg0, 0, var2);
        this.field4592 = var3;
        class558 var4 = new class558(method6037(arg0));
        int var5 = var4.method9258();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method9264();
        }
        int var6 = var4.method9258();
        if (var5 >= 7) {
            this.field4603 = var4.method9277();
        } else {
            this.field4603 = var4.method9260();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4593 = new int[this.field4603];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4603; var9++) {
                this.field4593[var9] = var7 += var4.method9277();
                if (this.field4593[var9] > var8) {
                    var8 = this.field4593[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4603; var10++) {
                this.field4593[var10] = var7 += var4.method9260();
                if (this.field4593[var10] > var8) {
                    var8 = this.field4593[var10];
                }
            }
        }
        this.field4604 = new int[var8 + 1];
        this.field4589 = new int[var8 + 1];
        this.field4594 = new int[var8 + 1];
        this.field4588 = new int[var8 + 1][];
        this.field4598 = new Object[var8 + 1];
        this.field4599 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4590 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4603; var11++) {
                this.field4590[this.field4593[var11]] = var4.method9264();
            }
            this.field4591 = new class580(this.field4590);
        }
        for (int var12 = 0; var12 < this.field4603; var12++) {
            this.field4604[this.field4593[var12]] = var4.method9264();
        }
        for (int var13 = 0; var13 < this.field4603; var13++) {
            this.field4589[this.field4593[var13]] = var4.method9264();
        }
        for (int var14 = 0; var14 < this.field4603; var14++) {
            this.field4594[this.field4593[var14]] = var4.method9260();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4603; var15++) {
                int var16 = this.field4593[var15];
                int var17 = this.field4594[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4588[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4588[var16][var20] = var18 += var4.method9277();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4599[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4603; var22++) {
                int var23 = this.field4593[var22];
                int var24 = this.field4594[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4588[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4588[var23][var27] = var25 += var4.method9260();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4599[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4596 = new int[var8 + 1][];
        this.field4597 = new class580[var8 + 1];
        for (int var29 = 0; var29 < this.field4603; var29++) {
            int var30 = this.field4593[var29];
            int var31 = this.field4594[var30];
            this.field4596[var30] = new int[this.field4599[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4596[var30][this.field4588[var30][var32]] = var4.method9264();
            }
            this.field4597[var30] = new class580(this.field4596[var30]);
        }
    }

    @ObfuscatedName("pe.ak(II)V")
    public void method6948(int arg0) {
    }

    @ObfuscatedName("pe.bm(III)[B")
    public byte[] method7009(int arg0, int arg1) {
        return this.method6998(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("pe.bo(II[IB)[B")
    public byte[] method6998(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4599.length || this.field4599[arg0] == null || arg1 < 0 || arg1 >= this.field4599[arg0].length) {
            return null;
        }
        if (this.field4599[arg0][arg1] == null) {
            boolean var4 = this.method7000(arg0, arg2);
            if (!var4) {
                this.method6949(arg0);
                boolean var5 = this.method7000(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method6900(this.field4599[arg0][arg1], false);
        if (this.field4601) {
            this.field4599[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("pe.bd(III)Z")
    public boolean method7023(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4599.length || this.field4599[arg0] == null || arg1 < 0 || arg1 >= this.field4599[arg0].length) {
            return false;
        } else if (this.field4599[arg0][arg1] != null) {
            return true;
        } else if (this.field4598[arg0] == null) {
            this.method6949(arg0);
            return this.field4598[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("pe.ba(II)Z")
    public boolean method6997(int arg0) {
        if (this.field4599.length == 1) {
            return this.method7023(0, arg0);
        } else if (this.field4599[arg0].length == 1) {
            return this.method7023(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("pe.bw(II)Z")
    public boolean method6991(int arg0) {
        if (this.field4598[arg0] == null) {
            this.method6949(arg0);
            return this.field4598[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("pe.bi(B)Z")
    public boolean method6999() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4593.length; var2++) {
            int var3 = this.field4593[var2];
            if (this.field4598[var3] == null) {
                this.method6949(var3);
                if (this.field4598[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("pe.at(IB)I")
    public int method6955(int arg0) {
        return this.field4598[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("pe.bf(II)[B")
    public byte[] method7052(int arg0) {
        if (this.field4599.length == 1) {
            return this.method7009(0, arg0);
        } else if (this.field4599[arg0].length == 1) {
            return this.method7009(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("pe.bg(III)[B")
    public byte[] method7001(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4599.length || this.field4599[arg0] == null || arg1 < 0 || arg1 >= this.field4599[arg0].length) {
            return null;
        }
        if (this.field4599[arg0][arg1] == null) {
            boolean var3 = this.method7000(arg0, (int[]) null);
            if (!var3) {
                this.method6949(arg0);
                boolean var4 = this.method7000(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method6900(this.field4599[arg0][arg1], false);
    }

    @ObfuscatedName("pe.bl(II)[B")
    public byte[] method7045(int arg0) {
        if (this.field4599.length == 1) {
            return this.method7001(0, arg0);
        } else if (this.field4599[arg0].length == 1) {
            return this.method7001(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("pe.aj(II)V")
    public void method6949(int arg0) {
    }

    @ObfuscatedName("pe.be(II)[I")
    public int[] method7003(int arg0) {
        return arg0 >= 0 && arg0 < this.field4588.length ? this.field4588[arg0] : null;
    }

    @ObfuscatedName("pe.cq(II)I")
    public int method7004(int arg0) {
        return this.field4599 == null || arg0 >= this.field4599.length || this.field4599[arg0] == null ? 0 : this.field4599[arg0].length;
    }

    @ObfuscatedName("pe.cb(I)I")
    public int method7047() {
        return this.field4599.length;
    }

    @ObfuscatedName("pe.cd(B)V")
    public void method6992() {
        for (int var1 = 0; var1 < this.field4598.length; var1++) {
            this.field4598[var1] = null;
        }
    }

    @ObfuscatedName("pe.ci(IB)V")
    public void method7007(int arg0) {
        for (int var2 = 0; var2 < this.field4599[arg0].length; var2++) {
            this.field4599[arg0][var2] = null;
        }
    }

    @ObfuscatedName("pe.cn(I)V")
    public void method7008() {
        for (int var1 = 0; var1 < this.field4599.length; var1++) {
            if (this.field4599[var1] != null) {
                for (int var2 = 0; var2 < this.field4599[var1].length; var2++) {
                    this.field4599[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("pe.co(I[II)Z")
    public boolean method7000(int arg0, int[] arg1) {
        if (this.field4598[arg0] == null) {
            return false;
        }
        int var3 = this.field4594[arg0];
        int[] var4 = this.field4588[arg0];
        Object[] var5 = this.field4599[arg0];
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
            var8 = Statics.method6900(this.field4598[arg0], true);
            class558 var9 = new class558(var8);
            var9.method9284(arg1, 5, var9.field5463.length);
        } else {
            var8 = Statics.method6900(this.field4598[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method6037(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class558.method3797(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class558.method3797(var8, 0, var18);
            throw class584.method8651(var35, var17 + var19 + "," + this.field4604[arg0] + "," + this.field4592);
        }
        if (this.field4602) {
            this.field4598[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class558 var23 = new class558(var10);
            int[] var24 = new int[var3];
            var23.field5462 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method9264();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field5462 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method9264();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field4601) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class366.method5310(var28[var34], false);
                }
            }
        } else if (this.field4601) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class366.method5310(var10, false);
        }
        return true;
    }

    @ObfuscatedName("pe.cf(Ljava/lang/String;B)I")
    public int method7010(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4591.method9973(class420.method5895(var2));
    }

    @ObfuscatedName("pe.cl(ILjava/lang/String;S)I")
    public int method7069(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4597[arg0].method9973(class420.method5895(var3));
    }

    @ObfuscatedName("pe.cp(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method7012(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4591.method9973(class420.method5895(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4597[var5].method9973(class420.method5895(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("pe.cv(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method7013(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4591.method9973(class420.method5895(var3));
        int var6 = this.field4597[var5].method9973(class420.method5895(var4));
        return this.method7009(var5, var6);
    }

    @ObfuscatedName("pe.cy(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method7014(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4591.method9973(class420.method5895(var3));
        int var6 = this.field4597[var5].method9973(class420.method5895(var4));
        return this.method7023(var5, var6);
    }

    @ObfuscatedName("pe.cu(Ljava/lang/String;S)Z")
    public boolean method7015(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4591.method9973(class420.method5895(var2));
        return this.method6991(var3);
    }

    @ObfuscatedName("pe.ce(Ljava/lang/String;B)V")
    public void method7016(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4591.method9973(class420.method5895(var2));
        if (var3 >= 0) {
            this.method6948(var3);
        }
    }

    @ObfuscatedName("pe.cg(Ljava/lang/String;I)I")
    public int method7017(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4591.method9973(class420.method5895(var2));
        return this.method6955(var3);
    }

    @ObfuscatedName("mp.cx([BI)[B")
    public static final byte[] method6037(byte[] arg0) {
        class558 var1 = new class558(arg0);
        int var2 = var1.method9258();
        int var3 = var1.method9264();
        if (var3 < 0 || !(field4600 == 0 || var3 <= field4600)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method9272(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method9264();
            if (var5 < 0 || field4600 != 0 && var5 > field4600) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class561.method9555(var6, var5, arg0, var3, 9);
            } else {
                field4595.method9970(var1, var6);
            }
            return var6;
        }
    }
}
