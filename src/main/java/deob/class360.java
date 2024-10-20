package deob;

@ObfuscatedName("nd")
public abstract class class360 {

    @ObfuscatedName("nd.ad")
    public int field4290;

    @ObfuscatedName("nd.ao")
    public int[] field4292;

    @ObfuscatedName("nd.ac")
    public int[] field4279;

    @ObfuscatedName("nd.ak")
    public class535 field4281;

    @ObfuscatedName("nd.an")
    public int[] field4282;

    @ObfuscatedName("nd.af")
    public int[] field4283;

    @ObfuscatedName("nd.ai")
    public int[] field4284;

    @ObfuscatedName("nd.al")
    public int[][] field4285;

    @ObfuscatedName("nd.bd")
    public int[][] field4286;

    @ObfuscatedName("nd.bb")
    public class535[] field4287;

    @ObfuscatedName("nd.bn")
    public Object[] field4288;

    @ObfuscatedName("nd.ba")
    public Object[][] field4278;

    @ObfuscatedName("nd.bf")
    public static class534 field4291 = new class534();

    @ObfuscatedName("nd.bs")
    public int field4289;

    @ObfuscatedName("nd.bp")
    public boolean field4280;

    @ObfuscatedName("nd.bv")
    public boolean field4293;

    @ObfuscatedName("nd.bq")
    public static int field4294 = 0;

    public class360(boolean arg0, boolean arg1) {
        this.field4280 = arg0;
        this.field4293 = arg1;
    }

    @ObfuscatedName("nd.bl([BB)V")
    public void method6115(byte[] arg0) {
        this.field4289 = Statics.method5438(arg0, arg0.length);
        class514 var2 = new class514(method5220(arg0));
        int var3 = var2.method8244();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method8496();
        }
        int var4 = var2.method8244();
        if (var3 >= 7) {
            this.field4290 = var2.method8263();
        } else {
            this.field4290 = var2.method8246();
        }
        int var5 = 0;
        int var6 = -1;
        this.field4292 = new int[this.field4290];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field4290; var7++) {
                this.field4292[var7] = var5 += var2.method8263();
                if (this.field4292[var7] > var6) {
                    var6 = this.field4292[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field4290; var8++) {
                this.field4292[var8] = var5 += var2.method8246();
                if (this.field4292[var8] > var6) {
                    var6 = this.field4292[var8];
                }
            }
        }
        this.field4282 = new int[var6 + 1];
        this.field4283 = new int[var6 + 1];
        this.field4284 = new int[var6 + 1];
        this.field4285 = new int[var6 + 1][];
        this.field4288 = new Object[var6 + 1];
        this.field4278 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field4279 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field4290; var9++) {
                this.field4279[this.field4292[var9]] = var2.method8496();
            }
            this.field4281 = new class535(this.field4279);
        }
        for (int var10 = 0; var10 < this.field4290; var10++) {
            this.field4282[this.field4292[var10]] = var2.method8496();
        }
        for (int var11 = 0; var11 < this.field4290; var11++) {
            this.field4283[this.field4292[var11]] = var2.method8496();
        }
        for (int var12 = 0; var12 < this.field4290; var12++) {
            this.field4284[this.field4292[var12]] = var2.method8246();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field4290; var13++) {
                int var14 = this.field4292[var13];
                int var15 = this.field4284[var14];
                int var16 = 0;
                int var17 = -1;
                this.field4285[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field4285[var14][var18] = var16 += var2.method8263();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field4278[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field4290; var20++) {
                int var21 = this.field4292[var20];
                int var22 = this.field4284[var21];
                int var23 = 0;
                int var24 = -1;
                this.field4285[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field4285[var21][var25] = var23 += var2.method8246();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field4278[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field4286 = new int[var6 + 1][];
        this.field4287 = new class535[var6 + 1];
        for (int var27 = 0; var27 < this.field4290; var27++) {
            int var28 = this.field4292[var27];
            int var29 = this.field4284[var28];
            this.field4286[var28] = new int[this.field4278[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field4286[var28][this.field4285[var28][var30]] = var2.method8496();
            }
            this.field4287[var28] = new class535(this.field4286[var28]);
        }
    }

    @ObfuscatedName("nd.ar(II)V")
    public void method6066(int arg0) {
    }

    @ObfuscatedName("nd.bt(III)[B")
    public byte[] method6117(int arg0, int arg1) {
        return this.method6119(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("nd.by(II[II)[B")
    public byte[] method6119(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4278.length || this.field4278[arg0] == null || arg1 < 0 || arg1 >= this.field4278[arg0].length) {
            return null;
        }
        if (this.field4278[arg0][arg1] == null) {
            boolean var4 = this.method6132(arg0, arg2);
            if (!var4) {
                this.method6067(arg0);
                boolean var5 = this.method6132(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class337.method2990(this.field4278[arg0][arg1], false);
        if (this.field4293) {
            this.field4278[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("nd.bg(III)Z")
    public boolean method6190(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4278.length || this.field4278[arg0] == null || arg1 < 0 || arg1 >= this.field4278[arg0].length) {
            return false;
        } else if (this.field4278[arg0][arg1] != null) {
            return true;
        } else if (this.field4288[arg0] == null) {
            this.method6067(arg0);
            return this.field4288[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nd.bj(IB)Z")
    public boolean method6122(int arg0) {
        if (this.field4278.length == 1) {
            return this.method6190(0, arg0);
        } else if (this.field4278[arg0].length == 1) {
            return this.method6190(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nd.ct(II)Z")
    public boolean method6159(int arg0) {
        if (this.field4288[arg0] == null) {
            this.method6067(arg0);
            return this.field4288[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nd.cf(B)Z")
    public boolean method6133() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4292.length; var2++) {
            int var3 = this.field4292[var2];
            if (this.field4288[var3] == null) {
                this.method6067(var3);
                if (this.field4288[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("nd.ap(II)I")
    public int method6098(int arg0) {
        return this.field4288[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("nd.cz(II)[B")
    public byte[] method6123(int arg0) {
        if (this.field4278.length == 1) {
            return this.method6117(0, arg0);
        } else if (this.field4278[arg0].length == 1) {
            return this.method6117(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nd.cb(IIB)[B")
    public byte[] method6124(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4278.length || this.field4278[arg0] == null || arg1 < 0 || arg1 >= this.field4278[arg0].length) {
            return null;
        }
        if (this.field4278[arg0][arg1] == null) {
            boolean var3 = this.method6132(arg0, (int[]) null);
            if (!var3) {
                this.method6067(arg0);
                boolean var4 = this.method6132(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class337.method2990(this.field4278[arg0][arg1], false);
    }

    @ObfuscatedName("nd.cs(II)[B")
    public byte[] method6125(int arg0) {
        if (this.field4278.length == 1) {
            return this.method6124(0, arg0);
        } else if (this.field4278[arg0].length == 1) {
            return this.method6124(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nd.am(II)V")
    public void method6067(int arg0) {
    }

    @ObfuscatedName("nd.cj(II)[I")
    public int[] method6126(int arg0) {
        return arg0 >= 0 && arg0 < this.field4285.length ? this.field4285[arg0] : null;
    }

    @ObfuscatedName("nd.cn(II)I")
    public int method6127(int arg0) {
        return this.field4278 == null || arg0 >= this.field4278.length || this.field4278[arg0] == null ? 0 : this.field4278[arg0].length;
    }

    @ObfuscatedName("nd.cw(B)I")
    public int method6128() {
        return this.field4278.length;
    }

    @ObfuscatedName("nd.ce(B)V")
    public void method6140() {
        for (int var1 = 0; var1 < this.field4288.length; var1++) {
            this.field4288[var1] = null;
        }
    }

    @ObfuscatedName("nd.cq(IB)V")
    public void method6130(int arg0) {
        for (int var2 = 0; var2 < this.field4278[arg0].length; var2++) {
            this.field4278[arg0][var2] = null;
        }
    }

    @ObfuscatedName("nd.cm(I)V")
    public void method6131() {
        for (int var1 = 0; var1 < this.field4278.length; var1++) {
            if (this.field4278[var1] != null) {
                for (int var2 = 0; var2 < this.field4278[var1].length; var2++) {
                    this.field4278[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("nd.ca(I[II)Z")
    public boolean method6132(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("nd.cx(Ljava/lang/String;B)I")
    public int method6129(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4281.method8876(class388.method784(var2));
    }

    @ObfuscatedName("nd.co(ILjava/lang/String;I)I")
    public int method6134(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4287[arg0].method8876(class388.method784(var3));
    }

    @ObfuscatedName("nd.cu(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6135(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4281.method8876(class388.method784(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4287[var5].method8876(class388.method784(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("nd.cr(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method6136(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4281.method8876(class388.method784(var3));
        int var6 = this.field4287[var5].method8876(class388.method784(var4));
        return this.method6117(var5, var6);
    }

    @ObfuscatedName("nd.cd(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method6137(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4281.method8876(class388.method784(var3));
        int var6 = this.field4287[var5].method8876(class388.method784(var4));
        return this.method6190(var5, var6);
    }

    @ObfuscatedName("nd.cy(Ljava/lang/String;I)Z")
    public boolean method6138(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4281.method8876(class388.method784(var2));
        return this.method6159(var3);
    }

    @ObfuscatedName("nd.ck(Ljava/lang/String;I)V")
    public void method6121(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4281.method8876(class388.method784(var2));
        if (var3 >= 0) {
            this.method6066(var3);
        }
    }

    @ObfuscatedName("nd.cl(Ljava/lang/String;I)I")
    public int method6152(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4281.method8876(class388.method784(var2));
        return this.method6098(var3);
    }

    @ObfuscatedName("ly.cp([BI)[B")
    public static final byte[] method5220(byte[] arg0) {
        class514 var1 = new class514(arg0);
        int var2 = var1.method8244();
        int var3 = var1.method8496();
        if (var3 < 0 || !(field4294 == 0 || var3 <= field4294)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8392(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8496();
            if (var5 < 0 || field4294 != 0 && var5 > field4294) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class517.method8521(var6, var5, arg0, var3, 9);
            } else {
                field4291.method8872(var1, var6);
            }
            return var6;
        }
    }
}
