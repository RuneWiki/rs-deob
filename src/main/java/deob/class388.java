package deob;

@ObfuscatedName("ok")
public abstract class class388 {

    @ObfuscatedName("ok.aa")
    public int field4540;

    @ObfuscatedName("ok.as")
    public int[] field4528;

    @ObfuscatedName("ok.aw")
    public int[] field4536;

    @ObfuscatedName("ok.at")
    public class568 field4530;

    @ObfuscatedName("ok.af")
    public int[] field4535;

    @ObfuscatedName("ok.am")
    public int[] field4532;

    @ObfuscatedName("ok.ar")
    public int[] field4541;

    @ObfuscatedName("ok.bt")
    public int[][] field4534;

    @ObfuscatedName("ok.bj")
    public int[][] field4527;

    @ObfuscatedName("ok.be")
    public class568[] field4537;

    @ObfuscatedName("ok.bm")
    public Object[] field4533;

    @ObfuscatedName("ok.bo")
    public Object[][] field4538;

    @ObfuscatedName("ok.bi")
    public static class567 field4539 = new class567();

    @ObfuscatedName("ok.ba")
    public int field4531;

    @ObfuscatedName("ok.bg")
    public boolean field4529;

    @ObfuscatedName("ok.bs")
    public boolean field4542;

    @ObfuscatedName("ok.bp")
    public static int field4543 = 0;

    public class388(boolean arg0, boolean arg1) {
        this.field4529 = arg0;
        this.field4542 = arg1;
    }

    @ObfuscatedName("ok.bd([BI)V")
    public void method6538(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class547.method4177(arg0, 0, var2);
        this.field4531 = var3;
        class547 var4 = new class547(method4004(arg0));
        int var5 = var4.method8804();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method8734();
        }
        int var6 = var4.method8804();
        if (var5 >= 7) {
            this.field4540 = var4.method8747();
        } else {
            this.field4540 = var4.method8899();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4528 = new int[this.field4540];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4540; var9++) {
                this.field4528[var9] = var7 += var4.method8747();
                if (this.field4528[var9] > var8) {
                    var8 = this.field4528[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4540; var10++) {
                this.field4528[var10] = var7 += var4.method8899();
                if (this.field4528[var10] > var8) {
                    var8 = this.field4528[var10];
                }
            }
        }
        this.field4535 = new int[var8 + 1];
        this.field4532 = new int[var8 + 1];
        this.field4541 = new int[var8 + 1];
        this.field4534 = new int[var8 + 1][];
        this.field4533 = new Object[var8 + 1];
        this.field4538 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4536 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4540; var11++) {
                this.field4536[this.field4528[var11]] = var4.method8734();
            }
            this.field4530 = new class568(this.field4536);
        }
        for (int var12 = 0; var12 < this.field4540; var12++) {
            this.field4535[this.field4528[var12]] = var4.method8734();
        }
        for (int var13 = 0; var13 < this.field4540; var13++) {
            this.field4532[this.field4528[var13]] = var4.method8734();
        }
        for (int var14 = 0; var14 < this.field4540; var14++) {
            this.field4541[this.field4528[var14]] = var4.method8899();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4540; var15++) {
                int var16 = this.field4528[var15];
                int var17 = this.field4541[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4534[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4534[var16][var20] = var18 += var4.method8747();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4538[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4540; var22++) {
                int var23 = this.field4528[var22];
                int var24 = this.field4541[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4534[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4534[var23][var27] = var25 += var4.method8899();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4538[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4527 = new int[var8 + 1][];
        this.field4537 = new class568[var8 + 1];
        for (int var29 = 0; var29 < this.field4540; var29++) {
            int var30 = this.field4528[var29];
            int var31 = this.field4541[var30];
            this.field4527[var30] = new int[this.field4538[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4527[var30][this.field4534[var30][var32]] = var4.method8734();
            }
            this.field4537[var30] = new class568(this.field4527[var30]);
        }
    }

    @ObfuscatedName("ok.ag(IB)V")
    public void method6528(int arg0) {
    }

    @ObfuscatedName("ok.bz(III)[B")
    public byte[] method6539(int arg0, int arg1) {
        return this.method6571(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ok.bk(II[II)[B")
    public byte[] method6571(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4538.length || this.field4538[arg0] == null || arg1 < 0 || arg1 >= this.field4538[arg0].length) {
            return null;
        }
        if (this.field4538[arg0][arg1] == null) {
            boolean var4 = this.method6554(arg0, arg2);
            if (!var4) {
                this.method6524(arg0);
                boolean var5 = this.method6554(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class361.method5229(this.field4538[arg0][arg1], false);
        if (this.field4542) {
            this.field4538[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ok.br(III)Z")
    public boolean method6541(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4538.length || this.field4538[arg0] == null || arg1 < 0 || arg1 >= this.field4538[arg0].length) {
            return false;
        } else if (this.field4538[arg0][arg1] != null) {
            return true;
        } else if (this.field4533[arg0] == null) {
            this.method6524(arg0);
            return this.field4533[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ok.bf(II)Z")
    public boolean method6542(int arg0) {
        if (this.field4538.length == 1) {
            return this.method6541(0, arg0);
        } else if (this.field4538[arg0].length == 1) {
            return this.method6541(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ok.cf(II)Z")
    public boolean method6543(int arg0) {
        if (this.field4533[arg0] == null) {
            this.method6524(arg0);
            return this.field4533[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ok.cv(I)Z")
    public boolean method6559() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4528.length; var2++) {
            int var3 = this.field4528[var2];
            if (this.field4533[var3] == null) {
                this.method6524(var3);
                if (this.field4533[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ok.ai(II)I")
    public int method6496(int arg0) {
        return this.field4533[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ok.cl(IB)[B")
    public byte[] method6545(int arg0) {
        if (this.field4538.length == 1) {
            return this.method6539(0, arg0);
        } else if (this.field4538[arg0].length == 1) {
            return this.method6539(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ok.cm(III)[B")
    public byte[] method6546(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4538.length || this.field4538[arg0] == null || arg1 < 0 || arg1 >= this.field4538[arg0].length) {
            return null;
        }
        if (this.field4538[arg0][arg1] == null) {
            boolean var3 = this.method6554(arg0, (int[]) null);
            if (!var3) {
                this.method6524(arg0);
                boolean var4 = this.method6554(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class361.method5229(this.field4538[arg0][arg1], false);
    }

    @ObfuscatedName("ok.cg(II)[B")
    public byte[] method6562(int arg0) {
        if (this.field4538.length == 1) {
            return this.method6546(0, arg0);
        } else if (this.field4538[arg0].length == 1) {
            return this.method6546(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ok.ak(II)V")
    public void method6524(int arg0) {
    }

    @ObfuscatedName("ok.cu(IB)[I")
    public int[] method6548(int arg0) {
        return arg0 >= 0 && arg0 < this.field4534.length ? this.field4534[arg0] : null;
    }

    @ObfuscatedName("ok.cn(II)I")
    public int method6549(int arg0) {
        return this.field4538 == null || arg0 >= this.field4538.length || this.field4538[arg0] == null ? 0 : this.field4538[arg0].length;
    }

    @ObfuscatedName("ok.ce(I)I")
    public int method6561() {
        return this.field4538.length;
    }

    @ObfuscatedName("ok.co(B)V")
    public void method6551() {
        for (int var1 = 0; var1 < this.field4533.length; var1++) {
            this.field4533[var1] = null;
        }
    }

    @ObfuscatedName("ok.ch(II)V")
    public void method6552(int arg0) {
        for (int var2 = 0; var2 < this.field4538[arg0].length; var2++) {
            this.field4538[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ok.ct(B)V")
    public void method6595() {
        for (int var1 = 0; var1 < this.field4538.length; var1++) {
            if (this.field4538[var1] != null) {
                for (int var2 = 0; var2 < this.field4538[var1].length; var2++) {
                    this.field4538[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ok.cd(I[IB)Z")
    public boolean method6554(int arg0, int[] arg1) {
        if (this.field4533[arg0] == null) {
            return false;
        }
        int var3 = this.field4541[arg0];
        int[] var4 = this.field4534[arg0];
        Object[] var5 = this.field4538[arg0];
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
            var8 = class361.method5229(this.field4533[arg0], true);
            class547 var9 = new class547(var8);
            var9.method8754(arg1, 5, var9.field5364.length);
        } else {
            var8 = class361.method5229(this.field4533[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method4004(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class547.method4177(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class547.method4177(var8, 0, var18);
            throw class572.method708(var35, var17 + var19 + "," + this.field4535[arg0] + "," + this.field4531);
        }
        if (this.field4529) {
            this.field4533[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class547 var23 = new class547(var10);
            int[] var24 = new int[var3];
            var23.field5363 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method8734();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field5363 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method8734();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field4542) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class361.method5537(var28[var34], false);
                }
            }
        } else if (this.field4542) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class361.method5537(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ok.ck(Ljava/lang/String;B)I")
    public int method6555(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4530.method9342(class416.method416(var2));
    }

    @ObfuscatedName("ok.cq(ILjava/lang/String;B)I")
    public int method6609(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4537[arg0].method9342(class416.method416(var3));
    }

    @ObfuscatedName("ok.cs(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6544(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4530.method9342(class416.method416(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4537[var5].method9342(class416.method416(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ok.cp(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6558(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4530.method9342(class416.method416(var3));
        int var6 = this.field4537[var5].method9342(class416.method416(var4));
        return this.method6539(var5, var6);
    }

    @ObfuscatedName("ok.cy(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6572(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4530.method9342(class416.method416(var3));
        int var6 = this.field4537[var5].method9342(class416.method416(var4));
        return this.method6541(var5, var6);
    }

    @ObfuscatedName("ok.cw(Ljava/lang/String;B)Z")
    public boolean method6560(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4530.method9342(class416.method416(var2));
        return this.method6543(var3);
    }

    @ObfuscatedName("ok.ci(Ljava/lang/String;B)V")
    public void method6580(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4530.method9342(class416.method416(var2));
        if (var3 >= 0) {
            this.method6528(var3);
        }
    }

    @ObfuscatedName("ok.cc(Ljava/lang/String;I)I")
    public int method6613(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4530.method9342(class416.method416(var2));
        return this.method6496(var3);
    }

    @ObfuscatedName("il.cr([BS)[B")
    public static final byte[] method4004(byte[] arg0) {
        class547 var1 = new class547(arg0);
        int var2 = var1.method8804();
        int var3 = var1.method8734();
        if (var3 < 0 || !(field4543 == 0 || var3 <= field4543)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8742(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8734();
            if (var5 < 0 || field4543 != 0 && var5 > field4543) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class550.method8999(var6, var5, arg0, var3, 9);
            } else {
                field4539.method9339(var1, var6);
            }
            return var6;
        }
    }
}
