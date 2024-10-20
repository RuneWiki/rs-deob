package deob;

@ObfuscatedName("or")
public abstract class class387 {

    @ObfuscatedName("or.aw")
    public int field4501;

    @ObfuscatedName("or.ad")
    public int[] field4515;

    @ObfuscatedName("or.ai")
    public int[] field4507;

    @ObfuscatedName("or.an")
    public class567 field4500;

    @ObfuscatedName("or.am")
    public int[] field4514;

    @ObfuscatedName("or.ar")
    public int[] field4505;

    @ObfuscatedName("or.ag")
    public int[] field4506;

    @ObfuscatedName("or.bs")
    public int[][] field4503;

    @ObfuscatedName("or.bf")
    public int[][] field4502;

    @ObfuscatedName("or.bo")
    public class567[] field4509;

    @ObfuscatedName("or.bi")
    public Object[] field4510;

    @ObfuscatedName("or.bt")
    public Object[][] field4511;

    @ObfuscatedName("or.bn")
    public static class566 field4512 = new class566();

    @ObfuscatedName("or.bw")
    public int field4513;

    @ObfuscatedName("or.bl")
    public boolean field4504;

    @ObfuscatedName("or.be")
    public boolean field4508;

    @ObfuscatedName("or.bg")
    public static int field4516 = 0;

    public class387(boolean arg0, boolean arg1) {
        this.field4504 = arg0;
        this.field4508 = arg1;
    }

    @ObfuscatedName("or.bc([BI)V")
    public void method6594(byte[] arg0) {
        this.field4513 = class546.method2305(arg0, arg0.length);
        class546 var2 = new class546(method3348(arg0));
        int var3 = var2.method8796();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method8801();
        }
        int var4 = var2.method8796();
        if (var3 >= 7) {
            this.field4501 = var2.method8813();
        } else {
            this.field4501 = var2.method8798();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4515 = new int[this.field4501];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4501; var7++) {
                this.field4515[var7] = var5 += var2.method8813();
                if (this.field4515[var7] > var6) {
                    var6 = this.field4515[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4501; var8++) {
                this.field4515[var8] = var5 += var2.method8798();
                if (this.field4515[var8] > var6) {
                    var6 = this.field4515[var8];
                }
            }
        }
        this.field4514 = new int[var6 + 1];
        this.field4505 = new int[var6 + 1];
        this.field4506 = new int[var6 + 1];
        this.field4503 = new int[var6 + 1][];
        this.field4510 = new Object[var6 + 1];
        this.field4511 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4507 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4501; var9++) {
                this.field4507[this.field4515[var9]] = var2.method8801();
            }
            this.field4500 = new class567(this.field4507);
        }
        for (int var10 = 0; var10 < this.field4501; var10++) {
            this.field4514[this.field4515[var10]] = var2.method8801();
        }
        for (int var11 = 0; var11 < this.field4501; var11++) {
            this.field4505[this.field4515[var11]] = var2.method8801();
        }
        for (int var12 = 0; var12 < this.field4501; var12++) {
            this.field4506[this.field4515[var12]] = var2.method8798();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4501; var13++) {
                int var14 = this.field4515[var13];
                int var15 = this.field4506[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4503[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4503[var14][var18] = var16 += var2.method8813();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4511[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4501; var20++) {
                int var21 = this.field4515[var20];
                int var22 = this.field4506[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4503[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4503[var21][var25] = var23 += var2.method8798();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4511[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4502 = new int[var6 + 1][];
        this.field4509 = new class567[var6 + 1];
        for (int var27 = 0; var27 < this.field4501; var27++) {
            int var28 = this.field4515[var27];
            int var29 = this.field4506[var28];
            this.field4502[var28] = new int[this.field4511[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4502[var28][this.field4503[var28][var30]] = var2.method8801();
            }
            this.field4509[var28] = new class567(this.field4502[var28]);
        }
    }

    @ObfuscatedName("or.aj(IB)V")
    public void method6525(int arg0) {
    }

    @ObfuscatedName("or.bz(III)[B")
    public byte[] method6573(int arg0, int arg1) {
        return this.method6646(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("or.ba(II[II)[B")
    public byte[] method6646(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4511.length || this.field4511[arg0] == null || arg1 < 0 || arg1 >= this.field4511[arg0].length) {
            return null;
        }
        if (this.field4511[arg0][arg1] == null) {
            boolean var4 = this.method6644(arg0, arg2);
            if (!var4) {
                this.method6529(arg0);
                boolean var5 = this.method6644(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class362.method6276(this.field4511[arg0][arg1], false);
        if (this.field4508) {
            this.field4511[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("or.bb(III)Z")
    public boolean method6586(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4511.length || this.field4511[arg0] == null || arg1 < 0 || arg1 >= this.field4511[arg0].length) {
            return false;
        } else if (this.field4511[arg0][arg1] != null) {
            return true;
        } else if (this.field4510[arg0] == null) {
            this.method6529(arg0);
            return this.field4510[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("or.by(IB)Z")
    public boolean method6575(int arg0) {
        if (this.field4511.length == 1) {
            return this.method6586(0, arg0);
        } else if (this.field4511[arg0].length == 1) {
            return this.method6586(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("or.cw(IB)Z")
    public boolean method6576(int arg0) {
        if (this.field4510[arg0] == null) {
            this.method6529(arg0);
            return this.field4510[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("or.ck(I)Z")
    public boolean method6604() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4515.length; var2++) {
            int var3 = this.field4515[var2];
            if (this.field4510[var3] == null) {
                this.method6529(var3);
                if (this.field4510[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("or.ao(IB)I")
    public int method6532(int arg0) {
        return this.field4510[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("or.cn(IB)[B")
    public byte[] method6577(int arg0) {
        if (this.field4511.length == 1) {
            return this.method6573(0, arg0);
        } else if (this.field4511[arg0].length == 1) {
            return this.method6573(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("or.ch(IIB)[B")
    public byte[] method6579(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4511.length || this.field4511[arg0] == null || arg1 < 0 || arg1 >= this.field4511[arg0].length) {
            return null;
        }
        if (this.field4511[arg0][arg1] == null) {
            boolean var3 = this.method6644(arg0, (int[]) null);
            if (!var3) {
                this.method6529(arg0);
                boolean var4 = this.method6644(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class362.method6276(this.field4511[arg0][arg1], false);
    }

    @ObfuscatedName("or.cp(II)[B")
    public byte[] method6580(int arg0) {
        if (this.field4511.length == 1) {
            return this.method6579(0, arg0);
        } else if (this.field4511[arg0].length == 1) {
            return this.method6579(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("or.az(II)V")
    public void method6529(int arg0) {
    }

    @ObfuscatedName("or.cd(II)[I")
    public int[] method6581(int arg0) {
        return arg0 >= 0 && arg0 < this.field4503.length ? this.field4503[arg0] : null;
    }

    @ObfuscatedName("or.cs(II)I")
    public int method6591(int arg0) {
        return this.field4511 == null || arg0 >= this.field4511.length || this.field4511[arg0] == null ? 0 : this.field4511[arg0].length;
    }

    @ObfuscatedName("or.cm(I)I")
    public int method6582() {
        return this.field4511.length;
    }

    @ObfuscatedName("or.ci(I)V")
    public void method6583() {
        for (int var1 = 0; var1 < this.field4510.length; var1++) {
            this.field4510[var1] = null;
        }
    }

    @ObfuscatedName("or.cc(II)V")
    public void method6584(int arg0) {
        for (int var2 = 0; var2 < this.field4511[arg0].length; var2++) {
            this.field4511[arg0][var2] = null;
        }
    }

    @ObfuscatedName("or.cb(I)V")
    public void method6585() {
        for (int var1 = 0; var1 < this.field4511.length; var1++) {
            if (this.field4511[var1] != null) {
                for (int var2 = 0; var2 < this.field4511[var1].length; var2++) {
                    this.field4511[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("or.cr(I[II)Z")
    public boolean method6644(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("or.co(Ljava/lang/String;B)I")
    public int method6587(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4500.method9382(class415.method5852(var2));
    }

    @ObfuscatedName("or.cf(ILjava/lang/String;I)I")
    public int method6647(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4509[arg0].method9382(class415.method5852(var3));
    }

    @ObfuscatedName("or.ce(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6589(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4500.method9382(class415.method5852(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4509[var5].method9382(class415.method5852(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("or.cz(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6620(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4500.method9382(class415.method5852(var3));
        int var6 = this.field4509[var5].method9382(class415.method5852(var4));
        return this.method6573(var5, var6);
    }

    @ObfuscatedName("or.ca(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6602(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4500.method9382(class415.method5852(var3));
        int var6 = this.field4509[var5].method9382(class415.method5852(var4));
        return this.method6586(var5, var6);
    }

    @ObfuscatedName("or.cl(Ljava/lang/String;I)Z")
    public boolean method6592(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4500.method9382(class415.method5852(var2));
        return this.method6576(var3);
    }

    @ObfuscatedName("or.cq(Ljava/lang/String;I)V")
    public void method6599(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4500.method9382(class415.method5852(var2));
        if (var3 >= 0) {
            this.method6525(var3);
        }
    }

    @ObfuscatedName("or.cy(Ljava/lang/String;I)I")
    public int method6593(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4500.method9382(class415.method5852(var2));
        return this.method6532(var3);
    }

    @ObfuscatedName("gw.ct([BI)[B")
    public static final byte[] method3348(byte[] arg0) {
        class546 var1 = new class546(arg0);
        int var2 = var1.method8796();
        int var3 = var1.method8801();
        if (var3 < 0 || !(field4516 == 0 || var3 <= field4516)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8808(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8801();
            if (var5 < 0 || field4516 != 0 && var5 > field4516) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class549.method9043(var6, var5, arg0, var3, 9);
            } else {
                field4512.method9378(var1, var6);
            }
            return var6;
        }
    }
}
