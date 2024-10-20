package deob;

@ObfuscatedName("nq")
public abstract class class357 {

    @ObfuscatedName("nq.ah")
    public int field4251;

    @ObfuscatedName("nq.az")
    public int[] field4261;

    @ObfuscatedName("nq.au")
    public int[] field4265;

    @ObfuscatedName("nq.ai")
    public class522 field4253;

    @ObfuscatedName("nq.aq")
    public int[] field4254;

    @ObfuscatedName("nq.aw")
    public int[] field4255;

    @ObfuscatedName("nq.ay")
    public int[] field4256;

    @ObfuscatedName("nq.al")
    public int[][] field4257;

    @ObfuscatedName("nq.am")
    public int[][] field4258;

    @ObfuscatedName("nq.bs")
    public class522[] field4264;

    @ObfuscatedName("nq.bc")
    public Object[] field4260;

    @ObfuscatedName("nq.bj")
    public Object[][] field4250;

    @ObfuscatedName("nq.bo")
    public static class521 field4262 = new class521();

    @ObfuscatedName("nq.bq")
    public int field4259;

    @ObfuscatedName("nq.bg")
    public boolean field4252;

    @ObfuscatedName("nq.bf")
    public boolean field4263;

    @ObfuscatedName("nq.bd")
    public static int field4266 = 0;

    public class357(boolean arg0, boolean arg1) {
        this.field4252 = arg0;
        this.field4263 = arg1;
    }

    @ObfuscatedName("nq.bv([BB)V")
    public void method6096(byte[] arg0) {
        this.field4259 = class501.method3429(arg0, arg0.length);
        class501 var2 = new class501(method2453(arg0));
        int var3 = var2.method8129();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method8134();
        }
        int var4 = var2.method8129();
        if (var3 >= 7) {
            this.field4251 = var2.method8147();
        } else {
            this.field4251 = var2.method8195();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4261 = new int[this.field4251];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4251; var7++) {
                this.field4261[var7] = var5 += var2.method8147();
                if (this.field4261[var7] > var6) {
                    var6 = this.field4261[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4251; var8++) {
                this.field4261[var8] = var5 += var2.method8195();
                if (this.field4261[var8] > var6) {
                    var6 = this.field4261[var8];
                }
            }
        }
        this.field4254 = new int[var6 + 1];
        this.field4255 = new int[var6 + 1];
        this.field4256 = new int[var6 + 1];
        this.field4257 = new int[var6 + 1][];
        this.field4260 = new Object[var6 + 1];
        this.field4250 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4265 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4251; var9++) {
                this.field4265[this.field4261[var9]] = var2.method8134();
            }
            this.field4253 = new class522(this.field4265);
        }
        for (int var10 = 0; var10 < this.field4251; var10++) {
            this.field4254[this.field4261[var10]] = var2.method8134();
        }
        for (int var11 = 0; var11 < this.field4251; var11++) {
            this.field4255[this.field4261[var11]] = var2.method8134();
        }
        for (int var12 = 0; var12 < this.field4251; var12++) {
            this.field4256[this.field4261[var12]] = var2.method8195();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4251; var13++) {
                int var14 = this.field4261[var13];
                int var15 = this.field4256[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4257[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4257[var14][var18] = var16 += var2.method8147();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4250[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4251; var20++) {
                int var21 = this.field4261[var20];
                int var22 = this.field4256[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4257[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4257[var21][var25] = var23 += var2.method8195();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4250[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4258 = new int[var6 + 1][];
        this.field4264 = new class522[var6 + 1];
        for (int var27 = 0; var27 < this.field4251; var27++) {
            int var28 = this.field4261[var27];
            int var29 = this.field4256[var28];
            this.field4258[var28] = new int[this.field4250[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4258[var28][this.field4257[var28][var30]] = var2.method8134();
            }
            this.field4264[var28] = new class522(this.field4258[var28]);
        }
    }

    @ObfuscatedName("nq.av(II)V")
    public void method6062(int arg0) {
    }

    @ObfuscatedName("nq.bz(III)[B")
    public byte[] method6080(int arg0, int arg1) {
        return this.method6081(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("nq.bm(II[II)[B")
    public byte[] method6081(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4250.length || this.field4250[arg0] == null || arg1 < 0 || arg1 >= this.field4250[arg0].length) {
            return null;
        }
        if (this.field4250[arg0][arg1] == null) {
            boolean var4 = this.method6084(arg0, arg2);
            if (!var4) {
                this.method6034(arg0);
                boolean var5 = this.method6084(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class334.method5391(this.field4250[arg0][arg1], false);
        if (this.field4263) {
            this.field4250[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("nq.br(III)Z")
    public boolean method6082(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4250.length || this.field4250[arg0] == null || arg1 < 0 || arg1 >= this.field4250[arg0].length) {
            return false;
        } else if (this.field4250[arg0][arg1] != null) {
            return true;
        } else if (this.field4260[arg0] == null) {
            this.method6034(arg0);
            return this.field4260[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nq.bu(IB)Z")
    public boolean method6079(int arg0) {
        if (this.field4250.length == 1) {
            return this.method6082(0, arg0);
        } else if (this.field4250[arg0].length == 1) {
            return this.method6082(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nq.by(II)Z")
    public boolean method6152(int arg0) {
        if (this.field4260[arg0] == null) {
            this.method6034(arg0);
            return this.field4260[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nq.bt(S)Z")
    public boolean method6085() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4261.length; var2++) {
            int var3 = this.field4261[var2];
            if (this.field4260[var3] == null) {
                this.method6034(var3);
                if (this.field4260[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("nq.af(II)I")
    public int method6040(int arg0) {
        return this.field4260[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("nq.bl(II)[B")
    public byte[] method6143(int arg0) {
        if (this.field4250.length == 1) {
            return this.method6080(0, arg0);
        } else if (this.field4250[arg0].length == 1) {
            return this.method6080(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nq.cs(III)[B")
    public byte[] method6087(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4250.length || this.field4250[arg0] == null || arg1 < 0 || arg1 >= this.field4250[arg0].length) {
            return null;
        }
        if (this.field4250[arg0][arg1] == null) {
            boolean var3 = this.method6084(arg0, (int[]) null);
            if (!var3) {
                this.method6034(arg0);
                boolean var4 = this.method6084(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class334.method5391(this.field4250[arg0][arg1], false);
    }

    @ObfuscatedName("nq.cu(IB)[B")
    public byte[] method6105(int arg0) {
        if (this.field4250.length == 1) {
            return this.method6087(0, arg0);
        } else if (this.field4250[arg0].length == 1) {
            return this.method6087(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nq.as(IB)V")
    public void method6034(int arg0) {
    }

    @ObfuscatedName("nq.ca(II)[I")
    public int[] method6090(int arg0) {
        return arg0 >= 0 && arg0 < this.field4257.length ? this.field4257[arg0] : null;
    }

    @ObfuscatedName("nq.cf(II)I")
    public int method6135(int arg0) {
        return this.field4250 == null || arg0 >= this.field4250.length || this.field4250[arg0] == null ? 0 : this.field4250[arg0].length;
    }

    @ObfuscatedName("nq.cw(B)I")
    public int method6092() {
        return this.field4250.length;
    }

    @ObfuscatedName("nq.ch(I)V")
    public void method6151() {
        for (int var1 = 0; var1 < this.field4260.length; var1++) {
            this.field4260[var1] = null;
        }
    }

    @ObfuscatedName("nq.cp(IB)V")
    public void method6094(int arg0) {
        for (int var2 = 0; var2 < this.field4250[arg0].length; var2++) {
            this.field4250[arg0][var2] = null;
        }
    }

    @ObfuscatedName("nq.cy(B)V")
    public void method6095() {
        for (int var1 = 0; var1 < this.field4250.length; var1++) {
            if (this.field4250[var1] != null) {
                for (int var2 = 0; var2 < this.field4250[var1].length; var2++) {
                    this.field4250[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("nq.cd(I[IB)Z")
    public boolean method6084(int arg0, int[] arg1) {
        if (this.field4260[arg0] == null) {
            return false;
        }
        int var3 = this.field4256[arg0];
        int[] var4 = this.field4257[arg0];
        Object[] var5 = this.field4250[arg0];
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
            var8 = class334.method5391(this.field4260[arg0], true);
            class501 var9 = new class501(var8);
            var9.method8154(arg1, 5, var9.field5016.length);
        } else {
            var8 = class334.method5391(this.field4260[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2453(var8);
        } catch (RuntimeException var27) {
            throw class528.method3226(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class501.method3429(var8, var8.length) + "," + class501.method3429(var8, var8.length - 2) + "," + this.field4254[arg0] + "," + this.field4259);
        }
        if (this.field4252) {
            this.field4260[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class501 var15 = new class501(var10);
            int[] var16 = new int[var3];
            var15.field5017 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method8134();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field5017 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method8134();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field4263) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class334.method2528(var20[var26], false);
                }
            }
        } else if (this.field4263) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class334.method2528(var10, false);
        }
        return true;
    }

    @ObfuscatedName("nq.cv(Ljava/lang/String;I)I")
    public int method6097(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4253.method8751(class385.method3863(var2));
    }

    @ObfuscatedName("nq.cr(ILjava/lang/String;S)I")
    public int method6098(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4264[arg0].method8751(class385.method3863(var3));
    }

    @ObfuscatedName("nq.cm(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6099(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4253.method8751(class385.method3863(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4264[var5].method8751(class385.method3863(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("nq.cg(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method6100(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4253.method8751(class385.method3863(var3));
        int var6 = this.field4264[var5].method8751(class385.method3863(var4));
        return this.method6080(var5, var6);
    }

    @ObfuscatedName("nq.ci(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6101(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4253.method8751(class385.method3863(var3));
        int var6 = this.field4264[var5].method8751(class385.method3863(var4));
        return this.method6082(var5, var6);
    }

    @ObfuscatedName("nq.cb(Ljava/lang/String;I)Z")
    public boolean method6102(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4253.method8751(class385.method3863(var2));
        return this.method6152(var3);
    }

    @ObfuscatedName("nq.cc(Ljava/lang/String;I)V")
    public void method6103(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4253.method8751(class385.method3863(var2));
        if (var3 >= 0) {
            this.method6062(var3);
        }
    }

    @ObfuscatedName("nq.ck(Ljava/lang/String;I)I")
    public int method6104(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4253.method8751(class385.method3863(var2));
        return this.method6040(var3);
    }

    @ObfuscatedName("de.cq([BI)[B")
    public static final byte[] method2453(byte[] arg0) {
        class501 var1 = new class501(arg0);
        int var2 = var1.method8129();
        int var3 = var1.method8134();
        if (var3 < 0 || !(field4266 == 0 || var3 <= field4266)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8142(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8134();
            if (var5 < 0 || field4266 != 0 && var5 > field4266) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class504.method8395(var6, var5, arg0, var3, 9);
            } else {
                field4262.method8748(var1, var6);
            }
            return var6;
        }
    }
}
