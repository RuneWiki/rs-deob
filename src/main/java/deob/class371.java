package deob;

@ObfuscatedName("ol")
public abstract class class371 {

    @ObfuscatedName("ol.ai")
    public int field4307;

    @ObfuscatedName("ol.aw")
    public int[] field4303;

    @ObfuscatedName("ol.ae")
    public int[] field4319;

    @ObfuscatedName("ol.an")
    public class548 field4310;

    @ObfuscatedName("ol.ag")
    public int[] field4306;

    @ObfuscatedName("ol.ad")
    public int[] field4318;

    @ObfuscatedName("ol.af")
    public int[] field4308;

    @ObfuscatedName("ol.be")
    public int[][] field4309;

    @ObfuscatedName("ol.bd")
    public int[][] field4315;

    @ObfuscatedName("ol.bl")
    public class548[] field4311;

    @ObfuscatedName("ol.bi")
    public Object[] field4312;

    @ObfuscatedName("ol.bv")
    public Object[][] field4313;

    @ObfuscatedName("ol.bf")
    public static class547 field4302 = new class547();

    @ObfuscatedName("ol.bg")
    public int field4314;

    @ObfuscatedName("ol.ba")
    public boolean field4316;

    @ObfuscatedName("ol.bm")
    public boolean field4317;

    @ObfuscatedName("ol.bp")
    public static int field4304 = 0;

    public class371(boolean arg0, boolean arg1) {
        this.field4316 = arg0;
        this.field4317 = arg1;
    }

    @ObfuscatedName("ol.bq([BI)V")
    public void method6286(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class527.method3229(arg0, 0, var2);
        this.field4314 = var3;
        class527 var4 = new class527(method460(arg0));
        int var5 = var4.method8410();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method8416();
        }
        int var6 = var4.method8410();
        if (var5 >= 7) {
            this.field4307 = var4.method8429();
        } else {
            this.field4307 = var4.method8412();
        }
        int var7 = 0;
        int var8 = -1;
        this.field4303 = new int[this.field4307];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field4307; var9++) {
                this.field4303[var9] = var7 += var4.method8429();
                if (this.field4303[var9] > var8) {
                    var8 = this.field4303[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field4307; var10++) {
                this.field4303[var10] = var7 += var4.method8412();
                if (this.field4303[var10] > var8) {
                    var8 = this.field4303[var10];
                }
            }
        }
        this.field4306 = new int[var8 + 1];
        this.field4318 = new int[var8 + 1];
        this.field4308 = new int[var8 + 1];
        this.field4309 = new int[var8 + 1][];
        this.field4312 = new Object[var8 + 1];
        this.field4313 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field4319 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field4307; var11++) {
                this.field4319[this.field4303[var11]] = var4.method8416();
            }
            this.field4310 = new class548(this.field4319);
        }
        for (int var12 = 0; var12 < this.field4307; var12++) {
            this.field4306[this.field4303[var12]] = var4.method8416();
        }
        for (int var13 = 0; var13 < this.field4307; var13++) {
            this.field4318[this.field4303[var13]] = var4.method8416();
        }
        for (int var14 = 0; var14 < this.field4307; var14++) {
            this.field4308[this.field4303[var14]] = var4.method8412();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field4307; var15++) {
                int var16 = this.field4303[var15];
                int var17 = this.field4308[var16];
                int var18 = 0;
                int var19 = -1;
                this.field4309[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field4309[var16][var20] = var18 += var4.method8429();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field4313[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field4307; var22++) {
                int var23 = this.field4303[var22];
                int var24 = this.field4308[var23];
                int var25 = 0;
                int var26 = -1;
                this.field4309[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field4309[var23][var27] = var25 += var4.method8412();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field4313[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field4315 = new int[var8 + 1][];
        this.field4311 = new class548[var8 + 1];
        for (int var29 = 0; var29 < this.field4307; var29++) {
            int var30 = this.field4303[var29];
            int var31 = this.field4308[var30];
            this.field4315[var30] = new int[this.field4313[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field4315[var30][this.field4309[var30][var32]] = var4.method8416();
            }
            this.field4311[var30] = new class548(this.field4315[var30]);
        }
    }

    @ObfuscatedName("ol.ar(II)V")
    public void method6234(int arg0) {
    }

    @ObfuscatedName("ol.cf(III)[B")
    public byte[] method6284(int arg0, int arg1) {
        return this.method6285(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ol.cg(II[II)[B")
    public byte[] method6285(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4313.length || this.field4313[arg0] == null || arg1 < 0 || arg1 >= this.field4313[arg0].length) {
            return null;
        }
        if (this.field4313[arg0][arg1] == null) {
            boolean var4 = this.method6299(arg0, arg2);
            if (!var4) {
                this.method6252(arg0);
                boolean var5 = this.method6299(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class346.method2926(this.field4313[arg0][arg1], false);
        if (this.field4317) {
            this.field4313[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ol.cv(III)Z")
    public boolean method6308(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4313.length || this.field4313[arg0] == null || arg1 < 0 || arg1 >= this.field4313[arg0].length) {
            return false;
        } else if (this.field4313[arg0][arg1] != null) {
            return true;
        } else if (this.field4312[arg0] == null) {
            this.method6252(arg0);
            return this.field4312[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ol.cx(II)Z")
    public boolean method6287(int arg0) {
        if (this.field4313.length == 1) {
            return this.method6308(0, arg0);
        } else if (this.field4313[arg0].length == 1) {
            return this.method6308(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ol.cp(II)Z")
    public boolean method6288(int arg0) {
        if (this.field4312[arg0] == null) {
            this.method6252(arg0);
            return this.field4312[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ol.ce(B)Z")
    public boolean method6289() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4303.length; var2++) {
            int var3 = this.field4303[var2];
            if (this.field4312[var3] == null) {
                this.method6252(var3);
                if (this.field4312[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ol.az(II)I")
    public int method6241(int arg0) {
        return this.field4312[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ol.ci(IB)[B")
    public byte[] method6298(int arg0) {
        if (this.field4313.length == 1) {
            return this.method6284(0, arg0);
        } else if (this.field4313[arg0].length == 1) {
            return this.method6284(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ol.ct(IIB)[B")
    public byte[] method6354(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4313.length || this.field4313[arg0] == null || arg1 < 0 || arg1 >= this.field4313[arg0].length) {
            return null;
        }
        if (this.field4313[arg0][arg1] == null) {
            boolean var3 = this.method6299(arg0, (int[]) null);
            if (!var3) {
                this.method6252(arg0);
                boolean var4 = this.method6299(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class346.method2926(this.field4313[arg0][arg1], false);
    }

    @ObfuscatedName("ol.cw(II)[B")
    public byte[] method6292(int arg0) {
        if (this.field4313.length == 1) {
            return this.method6354(0, arg0);
        } else if (this.field4313[arg0].length == 1) {
            return this.method6354(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ol.ao(II)V")
    public void method6252(int arg0) {
    }

    @ObfuscatedName("ol.cq(II)[I")
    public int[] method6295(int arg0) {
        return arg0 >= 0 && arg0 < this.field4309.length ? this.field4309[arg0] : null;
    }

    @ObfuscatedName("ol.cl(II)I")
    public int method6294(int arg0) {
        return this.field4313 == null || arg0 >= this.field4313.length || this.field4313[arg0] == null ? 0 : this.field4313[arg0].length;
    }

    @ObfuscatedName("ol.cs(I)I")
    public int method6351() {
        return this.field4313.length;
    }

    @ObfuscatedName("ol.co(B)V")
    public void method6306() {
        for (int var1 = 0; var1 < this.field4312.length; var1++) {
            this.field4312[var1] = null;
        }
    }

    @ObfuscatedName("ol.cm(II)V")
    public void method6338(int arg0) {
        for (int var2 = 0; var2 < this.field4313[arg0].length; var2++) {
            this.field4313[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ol.cn(B)V")
    public void method6349() {
        for (int var1 = 0; var1 < this.field4313.length; var1++) {
            if (this.field4313[var1] != null) {
                for (int var2 = 0; var2 < this.field4313[var1].length; var2++) {
                    this.field4313[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ol.cr(I[IB)Z")
    public boolean method6299(int arg0, int[] arg1) {
        if (this.field4312[arg0] == null) {
            return false;
        }
        int var3 = this.field4308[arg0];
        int[] var4 = this.field4309[arg0];
        Object[] var5 = this.field4313[arg0];
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
            var8 = class346.method2926(this.field4312[arg0], true);
            class527 var9 = new class527(var8);
            var9.method8436(arg1, 5, var9.field5140.length);
        } else {
            var8 = class346.method2926(this.field4312[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method460(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class527.method3229(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class527.method3229(var8, 0, var18);
            throw class553.method3999(var35, var17 + var19 + "," + this.field4306[arg0] + "," + this.field4314);
        }
        if (this.field4316) {
            this.field4312[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class527 var23 = new class527(var10);
            int[] var24 = new int[var3];
            var23.field5137 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method8416();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field5137 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method8416();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field4317) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class346.method3287(var28[var34], false);
                }
            }
        } else if (this.field4317) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class346.method3287(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ol.cj(Ljava/lang/String;I)I")
    public int method6300(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4310.method9068(class399.method3075(var2));
    }

    @ObfuscatedName("ol.ca(ILjava/lang/String;I)I")
    public int method6301(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4311[arg0].method9068(class399.method3075(var3));
    }

    @ObfuscatedName("ol.cc(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method6302(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4310.method9068(class399.method3075(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4311[var5].method9068(class399.method3075(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ol.cu(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6303(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4310.method9068(class399.method3075(var3));
        int var6 = this.field4311[var5].method9068(class399.method3075(var4));
        return this.method6284(var5, var6);
    }

    @ObfuscatedName("ol.ch(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method6304(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4310.method9068(class399.method3075(var3));
        int var6 = this.field4311[var5].method9068(class399.method3075(var4));
        return this.method6308(var5, var6);
    }

    @ObfuscatedName("ol.cb(Ljava/lang/String;I)Z")
    public boolean method6333(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4310.method9068(class399.method3075(var2));
        return this.method6288(var3);
    }

    @ObfuscatedName("ol.cz(Ljava/lang/String;I)V")
    public void method6335(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4310.method9068(class399.method3075(var2));
        if (var3 >= 0) {
            this.method6234(var3);
        }
    }

    @ObfuscatedName("ol.cy(Ljava/lang/String;I)I")
    public int method6307(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4310.method9068(class399.method3075(var2));
        return this.method6241(var3);
    }

    @ObfuscatedName("bv.ck([BI)[B")
    public static final byte[] method460(byte[] arg0) {
        class527 var1 = new class527(arg0);
        int var2 = var1.method8410();
        int var3 = var1.method8416();
        if (var3 < 0 || !(field4304 == 0 || var3 <= field4304)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8424(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8416();
            if (var5 < 0 || field4304 != 0 && var5 > field4304) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class530.method8691(var6, var5, arg0, var3, 9);
            } else {
                field4302.method9066(var1, var6);
            }
            return var6;
        }
    }
}
