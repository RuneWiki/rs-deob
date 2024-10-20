package deob;

@ObfuscatedName("om")
public abstract class class374 {

    @ObfuscatedName("om.ae")
    public int field4330;

    @ObfuscatedName("om.aw")
    public int[] field4325;

    @ObfuscatedName("om.aq")
    public int[] field4326;

    @ObfuscatedName("om.az")
    public class551 field4327;

    @ObfuscatedName("om.at")
    public int[] field4337;

    @ObfuscatedName("om.af")
    public int[] field4329;

    @ObfuscatedName("om.ad")
    public int[] field4331;

    @ObfuscatedName("om.bn")
    public int[][] field4335;

    @ObfuscatedName("om.bk")
    public int[][] field4332;

    @ObfuscatedName("om.by")
    public class551[] field4333;

    @ObfuscatedName("om.bd")
    public Object[] field4334;

    @ObfuscatedName("om.be")
    public Object[][] field4328;

    @ObfuscatedName("om.bv")
    public static class550 field4336 = new class550();

    @ObfuscatedName("om.ba")
    public int field4324;

    @ObfuscatedName("om.bz")
    public boolean field4338;

    @ObfuscatedName("om.bb")
    public boolean field4339;

    @ObfuscatedName("om.bo")
    public static int field4340 = 0;

    public class374(boolean arg0, boolean arg1) {
        this.field4338 = arg0;
        this.field4339 = arg1;
    }

    @ObfuscatedName("om.bu([BI)V")
    public void method6262(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class530.method7508(arg0, 0, var2);
        this.field4324 = var3;
        class530 var4 = new class530(method6260(arg0));
        int var5 = var4.method8365();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method8371();
        }
        int var6 = var4.method8365();
        if (var5 >= 7) {
            this.field4330 = var4.method8384();
        } else {
            this.field4330 = var4.method8598();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4325 = new int[this.field4330];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4330; var9++) {
                this.field4325[var9] = var7 += var4.method8384();
                if (this.field4325[var9] > var8) {
                    var8 = this.field4325[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4330; var10++) {
                this.field4325[var10] = var7 += var4.method8598();
                if (this.field4325[var10] > var8) {
                    var8 = this.field4325[var10];
                }
            }
        }
        this.field4337 = new int[var8 + 1];
        this.field4329 = new int[var8 + 1];
        this.field4331 = new int[var8 + 1];
        this.field4335 = new int[var8 + 1][];
        this.field4334 = new Object[var8 + 1];
        this.field4328 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4326 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4330; var11++) {
                this.field4326[this.field4325[var11]] = var4.method8371();
            }
            this.field4327 = new class551(this.field4326);
        }
        for (int var12 = 0; var12 < this.field4330; var12++) {
            this.field4337[this.field4325[var12]] = var4.method8371();
        }
        for (int var13 = 0; var13 < this.field4330; var13++) {
            this.field4329[this.field4325[var13]] = var4.method8371();
        }
        for (int var14 = 0; var14 < this.field4330; var14++) {
            this.field4331[this.field4325[var14]] = var4.method8598();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4330; var15++) {
                int var16 = this.field4325[var15];
                int var17 = this.field4331[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4335[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4335[var16][var20] = var18 += var4.method8384();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4328[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4330; var22++) {
                int var23 = this.field4325[var22];
                int var24 = this.field4331[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4335[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4335[var23][var27] = var25 += var4.method8598();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4328[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4332 = new int[var8 + 1][];
        this.field4333 = new class551[var8 + 1];
        for (int var29 = 0; var29 < this.field4330; var29++) {
            int var30 = this.field4325[var29];
            int var31 = this.field4331[var30];
            this.field4332[var30] = new int[this.field4328[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4332[var30][this.field4335[var30][var32]] = var4.method8371();
            }
            this.field4333[var30] = new class551(this.field4332[var30]);
        }
    }

    @ObfuscatedName("om.ak(II)V")
    public void method6219(int arg0) {
    }

    @ObfuscatedName("om.bf(III)[B")
    public byte[] method6342(int arg0, int arg1) {
        return this.method6264(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("om.bh(II[II)[B")
    public byte[] method6264(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4328.length || this.field4328[arg0] == null || arg1 < 0 || arg1 >= this.field4328[arg0].length) {
            return null;
        }
        if (this.field4328[arg0][arg1] == null) {
            boolean var4 = this.method6278(arg0, arg2);
            if (!var4) {
                this.method6220(arg0);
                boolean var5 = this.method6278(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class351.method2920(this.field4328[arg0][arg1], false);
        if (this.field4339) {
            this.field4328[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("om.bl(III)Z")
    public boolean method6265(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4328.length || this.field4328[arg0] == null || arg1 < 0 || arg1 >= this.field4328[arg0].length) {
            return false;
        } else if (this.field4328[arg0][arg1] != null) {
            return true;
        } else if (this.field4334[arg0] == null) {
            this.method6220(arg0);
            return this.field4334[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("om.bg(II)Z")
    public boolean method6299(int arg0) {
        if (this.field4328.length == 1) {
            return this.method6265(0, arg0);
        } else if (this.field4328[arg0].length == 1) {
            return this.method6265(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("om.bj(II)Z")
    public boolean method6348(int arg0) {
        if (this.field4334[arg0] == null) {
            this.method6220(arg0);
            return this.field4334[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("om.bx(B)Z")
    public boolean method6328() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4325.length; var2++) {
            int var3 = this.field4325[var2];
            if (this.field4334[var3] == null) {
                this.method6220(var3);
                if (this.field4334[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("om.av(II)I")
    public int method6234(int arg0) {
        return this.field4334[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("om.bi(II)[B")
    public byte[] method6269(int arg0) {
        if (this.field4328.length == 1) {
            return this.method6342(0, arg0);
        } else if (this.field4328[arg0].length == 1) {
            return this.method6342(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("om.bq(III)[B")
    public byte[] method6312(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4328.length || this.field4328[arg0] == null || arg1 < 0 || arg1 >= this.field4328[arg0].length) {
            return null;
        }
        if (this.field4328[arg0][arg1] == null) {
            boolean var3 = this.method6278(arg0, (int[]) null);
            if (!var3) {
                this.method6220(arg0);
                boolean var4 = this.method6278(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class351.method2920(this.field4328[arg0][arg1], false);
    }

    @ObfuscatedName("om.bw(II)[B")
    public byte[] method6271(int arg0) {
        if (this.field4328.length == 1) {
            return this.method6312(0, arg0);
        } else if (this.field4328[arg0].length == 1) {
            return this.method6312(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("om.ax(IB)V")
    public void method6220(int arg0) {
    }

    @ObfuscatedName("om.ce(IB)[I")
    public int[] method6272(int arg0) {
        return arg0 >= 0 && arg0 < this.field4335.length ? this.field4335[arg0] : null;
    }

    @ObfuscatedName("om.cu(IB)I")
    public int method6273(int arg0) {
        return this.field4328 == null || arg0 >= this.field4328.length || this.field4328[arg0] == null ? 0 : this.field4328[arg0].length;
    }

    @ObfuscatedName("om.cw(I)I")
    public int method6274() {
        return this.field4328.length;
    }

    @ObfuscatedName("om.co(S)V")
    public void method6286() {
        for (int var1 = 0; var1 < this.field4334.length; var1++) {
            this.field4334[var1] = null;
        }
    }

    @ObfuscatedName("om.cc(II)V")
    public void method6276(int arg0) {
        for (int var2 = 0; var2 < this.field4328[arg0].length; var2++) {
            this.field4328[arg0][var2] = null;
        }
    }

    @ObfuscatedName("om.cg(B)V")
    public void method6277() {
        for (int var1 = 0; var1 < this.field4328.length; var1++) {
            if (this.field4328[var1] != null) {
                for (int var2 = 0; var2 < this.field4328[var1].length; var2++) {
                    this.field4328[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("om.cq(I[IB)Z")
    public boolean method6278(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("om.cy(Ljava/lang/String;S)I")
    public int method6279(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4327.method8981(class402.method3453(var2));
    }

    @ObfuscatedName("om.cz(ILjava/lang/String;I)I")
    public int method6268(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4333[arg0].method8981(class402.method3453(var3));
    }

    @ObfuscatedName("om.cp(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6285(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4327.method8981(class402.method3453(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4333[var5].method8981(class402.method3453(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("om.cb(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method6281(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4327.method8981(class402.method3453(var3));
        int var6 = this.field4333[var5].method8981(class402.method3453(var4));
        return this.method6342(var5, var6);
    }

    @ObfuscatedName("om.cn(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6282(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4327.method8981(class402.method3453(var3));
        int var6 = this.field4333[var5].method8981(class402.method3453(var4));
        return this.method6265(var5, var6);
    }

    @ObfuscatedName("om.ck(Ljava/lang/String;I)Z")
    public boolean method6283(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4327.method8981(class402.method3453(var2));
        return this.method6348(var3);
    }

    @ObfuscatedName("om.cr(Ljava/lang/String;B)V")
    public void method6284(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4327.method8981(class402.method3453(var2));
        if (var3 >= 0) {
            this.method6219(var3);
        }
    }

    @ObfuscatedName("om.cs(Ljava/lang/String;B)I")
    public int method6306(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4327.method8981(class402.method3453(var2));
        return this.method6234(var3);
    }

    @ObfuscatedName("ou.cm([BI)[B")
    public static final byte[] method6260(byte[] arg0) {
        class530 var1 = new class530(arg0);
        int var2 = var1.method8365();
        int var3 = var1.method8371();
        if (var3 < 0 || !(field4340 == 0 || var3 <= field4340)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8379(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8371();
            if (var5 < 0 || field4340 != 0 && var5 > field4340) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class533.method8655(var6, var5, arg0, var3, 9);
            } else {
                field4336.method8979(var1, var6);
            }
            return var6;
        }
    }
}
