package deob;

@ObfuscatedName("lh")
public abstract class class315 {

    @ObfuscatedName("lh.x")
    public int field4010;

    @ObfuscatedName("lh.l")
    public int[] field3998;

    @ObfuscatedName("lh.a")
    public int[] field4008;

    @ObfuscatedName("lh.p")
    public class462 field4000;

    @ObfuscatedName("lh.b")
    public int[] field4001;

    @ObfuscatedName("lh.n")
    public int[] field4002;

    @ObfuscatedName("lh.o")
    public int[] field3997;

    @ObfuscatedName("lh.m")
    public int[][] field4004;

    @ObfuscatedName("lh.d")
    public int[][] field4005;

    @ObfuscatedName("lh.ad")
    public class462[] field4014;

    @ObfuscatedName("lh.ak")
    public Object[] field4011;

    @ObfuscatedName("lh.al")
    public Object[][] field4003;

    @ObfuscatedName("lh.ao")
    public static class461 field4009 = new class461();

    @ObfuscatedName("lh.ab")
    public int field4007;

    @ObfuscatedName("lh.ap")
    public boolean field3999;

    @ObfuscatedName("lh.ac")
    public boolean field4012;

    @ObfuscatedName("lh.ae")
    public static int field4013 = 0;

    public class315(boolean arg0, boolean arg1) {
        this.field3999 = arg0;
        this.field4012 = arg1;
    }

    @ObfuscatedName("lh.aw([BB)V")
    public void method5300(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class443.method2289(arg0, 0, var2);
        this.field4007 = var3;
        class443 var4 = new class443(method710(arg0));
        int var5 = var4.method7047();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method7052();
        }
        int var6 = var4.method7047();
        if (var5 >= 7) {
            this.field4010 = var4.method7029();
        } else {
            this.field4010 = var4.method7049();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3998 = new int[this.field4010];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4010; var9++) {
                this.field3998[var9] = var7 += var4.method7029();
                if (this.field3998[var9] > var8) {
                    var8 = this.field3998[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4010; var10++) {
                this.field3998[var10] = var7 += var4.method7049();
                if (this.field3998[var10] > var8) {
                    var8 = this.field3998[var10];
                }
            }
        }
        this.field4001 = new int[var8 + 1];
        this.field4002 = new int[var8 + 1];
        this.field3997 = new int[var8 + 1];
        this.field4004 = new int[var8 + 1][];
        this.field4011 = new Object[var8 + 1];
        this.field4003 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4008 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4010; var11++) {
                this.field4008[this.field3998[var11]] = var4.method7052();
            }
            this.field4000 = new class462(this.field4008);
        }
        for (int var12 = 0; var12 < this.field4010; var12++) {
            this.field4001[this.field3998[var12]] = var4.method7052();
        }
        for (int var13 = 0; var13 < this.field4010; var13++) {
            this.field4002[this.field3998[var13]] = var4.method7052();
        }
        for (int var14 = 0; var14 < this.field4010; var14++) {
            this.field3997[this.field3998[var14]] = var4.method7049();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4010; var15++) {
                int var16 = this.field3998[var15];
                int var17 = this.field3997[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4004[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4004[var16][var20] = var18 += var4.method7029();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4003[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4010; var22++) {
                int var23 = this.field3998[var22];
                int var24 = this.field3997[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4004[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4004[var23][var27] = var25 += var4.method7049();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4003[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4005 = new int[var8 + 1][];
        this.field4014 = new class462[var8 + 1];
        for (int var29 = 0; var29 < this.field4010; var29++) {
            int var30 = this.field3998[var29];
            int var31 = this.field3997[var30];
            this.field4005[var30] = new int[this.field4003[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4005[var30][this.field4004[var30][var32]] = var4.method7052();
            }
            this.field4014[var30] = new class462(this.field4005[var30]);
        }
    }

    @ObfuscatedName("lh.q(IB)V")
    public void method5252(int arg0) {
    }

    @ObfuscatedName("lh.au(IIB)[B")
    public byte[] method5305(int arg0, int arg1) {
        return this.method5364(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("lh.ay(II[II)[B")
    public byte[] method5364(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4003.length || this.field4003[arg0] == null || arg1 < 0 || arg1 >= this.field4003[arg0].length) {
            return null;
        }
        if (this.field4003[arg0][arg1] == null) {
            boolean var4 = this.method5333(arg0, arg2);
            if (!var4) {
                this.method5249(arg0);
                boolean var5 = this.method5333(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class283.method5000(this.field4003[arg0][arg1], false);
        if (this.field4012) {
            this.field4003[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("lh.as(III)Z")
    public boolean method5302(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4003.length || this.field4003[arg0] == null || arg1 < 0 || arg1 >= this.field4003[arg0].length) {
            return false;
        } else if (this.field4003[arg0][arg1] != null) {
            return true;
        } else if (this.field4011[arg0] == null) {
            this.method5249(arg0);
            return this.field4011[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lh.be(II)Z")
    public boolean method5303(int arg0) {
        if (this.field4003.length == 1) {
            return this.method5302(0, arg0);
        } else if (this.field4003[arg0].length == 1) {
            return this.method5302(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lh.bz(IB)Z")
    public boolean method5304(int arg0) {
        if (this.field4011[arg0] == null) {
            this.method5249(arg0);
            return this.field4011[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lh.bp(I)Z")
    public boolean method5301() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3998.length; var2++) {
            int var3 = this.field3998[var2];
            if (this.field4011[var3] == null) {
                this.method5249(var3);
                if (this.field4011[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("lh.i(II)I")
    public int method5264(int arg0) {
        return this.field4011[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("lh.bf(II)[B")
    public byte[] method5306(int arg0) {
        if (this.field4003.length == 1) {
            return this.method5305(0, arg0);
        } else if (this.field4003[arg0].length == 1) {
            return this.method5305(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lh.bg(IIB)[B")
    public byte[] method5307(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4003.length || this.field4003[arg0] == null || arg1 < 0 || arg1 >= this.field4003[arg0].length) {
            return null;
        }
        if (this.field4003[arg0][arg1] == null) {
            boolean var3 = this.method5333(arg0, (int[]) null);
            if (!var3) {
                this.method5249(arg0);
                boolean var4 = this.method5333(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class283.method5000(this.field4003[arg0][arg1], false);
    }

    @ObfuscatedName("lh.br(II)[B")
    public byte[] method5385(int arg0) {
        if (this.field4003.length == 1) {
            return this.method5307(0, arg0);
        } else if (this.field4003[arg0].length == 1) {
            return this.method5307(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("lh.f(IB)V")
    public void method5249(int arg0) {
    }

    @ObfuscatedName("lh.bn(IB)[I")
    public int[] method5309(int arg0) {
        return arg0 >= 0 && arg0 < this.field4004.length ? this.field4004[arg0] : null;
    }

    @ObfuscatedName("lh.bq(II)I")
    public int method5313(int arg0) {
        return this.field4003[arg0].length;
    }

    @ObfuscatedName("lh.bc(I)I")
    public int method5311() {
        return this.field4003.length;
    }

    @ObfuscatedName("lh.bl(I)V")
    public void method5358() {
        for (int var1 = 0; var1 < this.field4011.length; var1++) {
            this.field4011[var1] = null;
        }
    }

    @ObfuscatedName("lh.bv(II)V")
    public void method5308(int arg0) {
        for (int var2 = 0; var2 < this.field4003[arg0].length; var2++) {
            this.field4003[arg0][var2] = null;
        }
    }

    @ObfuscatedName("lh.bt(I)V")
    public void method5360() {
        for (int var1 = 0; var1 < this.field4003.length; var1++) {
            if (this.field4003[var1] != null) {
                for (int var2 = 0; var2 < this.field4003[var1].length; var2++) {
                    this.field4003[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("lh.bh(I[II)Z")
    public boolean method5333(int arg0, int[] arg1) {
        if (this.field4011[arg0] == null) {
            return false;
        }
        int var3 = this.field3997[arg0];
        int[] var4 = this.field4004[arg0];
        Object[] var5 = this.field4003[arg0];
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
            var8 = class283.method5000(this.field4011[arg0], true);
            class443 var9 = new class443(var8);
            var9.method7072(arg1, 5, var9.field4701.length);
        } else {
            var8 = class283.method5000(this.field4011[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method710(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class443.method2289(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class443.method2289(var8, 0, var18);
            throw class467.method3008(var35, var17 + var19 + "," + this.field4001[arg0] + "," + this.field4007);
        }
        if (this.field3999) {
            this.field4011[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class443 var23 = new class443(var10);
            int[] var24 = new int[var3];
            var23.field4700 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method7052();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field4700 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method7052();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field4012) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class283.method4271(var28[var34], false);
                }
            }
        } else if (this.field4012) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class283.method4271(var10, false);
        }
        return true;
    }

    @ObfuscatedName("lh.bs(Ljava/lang/String;I)I")
    public int method5349(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4000.method7613(class343.method5960(var2));
    }

    @ObfuscatedName("lh.bk(ILjava/lang/String;I)I")
    public int method5315(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4014[arg0].method7613(class343.method5960(var3));
    }

    @ObfuscatedName("lh.bb(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5318(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4000.method7613(class343.method5960(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4014[var5].method7613(class343.method5960(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("lh.ba(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method5319(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4000.method7613(class343.method5960(var3));
        int var6 = this.field4014[var5].method7613(class343.method5960(var4));
        return this.method5305(var5, var6);
    }

    @ObfuscatedName("lh.bu(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5331(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4000.method7613(class343.method5960(var3));
        int var6 = this.field4014[var5].method7613(class343.method5960(var4));
        return this.method5302(var5, var6);
    }

    @ObfuscatedName("lh.bw(Ljava/lang/String;I)Z")
    public boolean method5321(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4000.method7613(class343.method5960(var2));
        return this.method5304(var3);
    }

    @ObfuscatedName("lh.bi(Ljava/lang/String;I)V")
    public void method5312(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4000.method7613(class343.method5960(var2));
        if (var3 >= 0) {
            this.method5252(var3);
        }
    }

    @ObfuscatedName("lh.bo(Ljava/lang/String;I)I")
    public int method5323(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4000.method7613(class343.method5960(var2));
        return this.method5264(var3);
    }

    @ObfuscatedName("ag.bx([BB)[B")
    public static final byte[] method710(byte[] arg0) {
        class443 var1 = new class443(arg0);
        int var2 = var1.method7047();
        int var3 = var1.method7052();
        if (var3 < 0 || !(field4013 == 0 || var3 <= field4013)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method7287(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method7052();
            if (var5 < 0 || field4013 != 0 && var5 > field4013) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class445.method7291(var6, var5, arg0, var3, 9);
            } else {
                field4009.method7610(var1, var6);
            }
            return var6;
        }
    }
}
