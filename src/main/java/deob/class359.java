package deob;

@ObfuscatedName("nu")
public abstract class class359 {

    @ObfuscatedName("nu.ax")
    public int field4288;

    @ObfuscatedName("nu.ah")
    public int[] field4296;

    @ObfuscatedName("nu.as")
    public int[] field4291;

    @ObfuscatedName("nu.ay")
    public class536 field4284;

    @ObfuscatedName("nu.aj")
    public int[] field4285;

    @ObfuscatedName("nu.av")
    public int[] field4286;

    @ObfuscatedName("nu.aw")
    public int[] field4287;

    @ObfuscatedName("nu.ak")
    public int[][] field4283;

    @ObfuscatedName("nu.bh")
    public int[][] field4289;

    @ObfuscatedName("nu.bj")
    public class536[] field4293;

    @ObfuscatedName("nu.bk")
    public Object[] field4290;

    @ObfuscatedName("nu.bv")
    public Object[][] field4292;

    @ObfuscatedName("nu.bt")
    public static class535 field4300 = new class535();

    @ObfuscatedName("nu.bd")
    public int field4294;

    @ObfuscatedName("nu.by")
    public boolean field4295;

    @ObfuscatedName("nu.bs")
    public boolean field4281;

    @ObfuscatedName("nu.bm")
    public static int field4297 = 0;

    public class359(boolean arg0, boolean arg1) {
        this.field4295 = arg0;
        this.field4281 = arg1;
    }

    @ObfuscatedName("nu.be([BI)V")
    public void method6154(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class515.field5110[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field4294 = var5;
        class515 var8 = new class515(method1024(arg0));
        int var9 = var8.method8300();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method8306();
        }
        int var10 = var8.method8300();
        if (var9 >= 7) {
            this.field4288 = var8.method8319();
        } else {
            this.field4288 = var8.method8448();
        }
        int var11 = 0;
        int var12 = -1;
        this.field4296 = new int[this.field4288];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field4288; var13++) {
                this.field4296[var13] = var11 += var8.method8319();
                if (this.field4296[var13] > var12) {
                    var12 = this.field4296[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field4288; var14++) {
                this.field4296[var14] = var11 += var8.method8448();
                if (this.field4296[var14] > var12) {
                    var12 = this.field4296[var14];
                }
            }
        }
        this.field4285 = new int[var12 + 1];
        this.field4286 = new int[var12 + 1];
        this.field4287 = new int[var12 + 1];
        this.field4283 = new int[var12 + 1][];
        this.field4290 = new Object[var12 + 1];
        this.field4292 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field4291 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field4288; var15++) {
                this.field4291[this.field4296[var15]] = var8.method8306();
            }
            this.field4284 = new class536(this.field4291);
        }
        for (int var16 = 0; var16 < this.field4288; var16++) {
            this.field4285[this.field4296[var16]] = var8.method8306();
        }
        for (int var17 = 0; var17 < this.field4288; var17++) {
            this.field4286[this.field4296[var17]] = var8.method8306();
        }
        for (int var18 = 0; var18 < this.field4288; var18++) {
            this.field4287[this.field4296[var18]] = var8.method8448();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field4288; var19++) {
                int var20 = this.field4296[var19];
                int var21 = this.field4287[var20];
                int var22 = 0;
                int var23 = -1;
                this.field4283[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field4283[var20][var24] = var22 += var8.method8319();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field4292[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field4288; var26++) {
                int var27 = this.field4296[var26];
                int var28 = this.field4287[var27];
                int var29 = 0;
                int var30 = -1;
                this.field4283[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field4283[var27][var31] = var29 += var8.method8448();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field4292[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field4289 = new int[var12 + 1][];
        this.field4293 = new class536[var12 + 1];
        for (int var33 = 0; var33 < this.field4288; var33++) {
            int var34 = this.field4296[var33];
            int var35 = this.field4287[var34];
            this.field4289[var34] = new int[this.field4292[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field4289[var34][this.field4283[var34][var36]] = var8.method8306();
            }
            this.field4293[var34] = new class536(this.field4289[var34]);
        }
    }

    @ObfuscatedName("nu.ao(II)V")
    public void method6084(int arg0) {
    }

    @ObfuscatedName("nu.bi(IIB)[B")
    public byte[] method6128(int arg0, int arg1) {
        return this.method6129(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("nu.bz(II[II)[B")
    public byte[] method6129(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4292.length || this.field4292[arg0] == null || arg1 < 0 || arg1 >= this.field4292[arg0].length) {
            return null;
        }
        if (this.field4292[arg0][arg1] == null) {
            boolean var4 = this.method6143(arg0, arg2);
            if (!var4) {
                this.method6085(arg0);
                boolean var5 = this.method6143(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class336.method2805(this.field4292[arg0][arg1], false);
        if (this.field4281) {
            this.field4292[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("nu.bx(IIB)Z")
    public boolean method6130(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4292.length || this.field4292[arg0] == null || arg1 < 0 || arg1 >= this.field4292[arg0].length) {
            return false;
        } else if (this.field4292[arg0][arg1] != null) {
            return true;
        } else if (this.field4290[arg0] == null) {
            this.method6085(arg0);
            return this.field4290[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nu.bn(II)Z")
    public boolean method6131(int arg0) {
        if (this.field4292.length == 1) {
            return this.method6130(0, arg0);
        } else if (this.field4292[arg0].length == 1) {
            return this.method6130(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nu.bw(II)Z")
    public boolean method6132(int arg0) {
        if (this.field4290[arg0] == null) {
            this.method6085(arg0);
            return this.field4290[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("nu.bc(I)Z")
    public boolean method6133() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4296.length; var2++) {
            int var3 = this.field4296[var2];
            if (this.field4290[var3] == null) {
                this.method6085(var3);
                if (this.field4290[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("nu.af(II)I")
    public int method6104(int arg0) {
        return this.field4290[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("nu.bg(II)[B")
    public byte[] method6134(int arg0) {
        if (this.field4292.length == 1) {
            return this.method6128(0, arg0);
        } else if (this.field4292[arg0].length == 1) {
            return this.method6128(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nu.cw(III)[B")
    public byte[] method6135(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4292.length || this.field4292[arg0] == null || arg1 < 0 || arg1 >= this.field4292[arg0].length) {
            return null;
        }
        if (this.field4292[arg0][arg1] == null) {
            boolean var3 = this.method6143(arg0, (int[]) null);
            if (!var3) {
                this.method6085(arg0);
                boolean var4 = this.method6143(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class336.method2805(this.field4292[arg0][arg1], false);
    }

    @ObfuscatedName("nu.cf(II)[B")
    public byte[] method6136(int arg0) {
        if (this.field4292.length == 1) {
            return this.method6135(0, arg0);
        } else if (this.field4292[arg0].length == 1) {
            return this.method6135(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("nu.at(II)V")
    public void method6085(int arg0) {
    }

    @ObfuscatedName("nu.cm(II)[I")
    public int[] method6137(int arg0) {
        return arg0 >= 0 && arg0 < this.field4283.length ? this.field4283[arg0] : null;
    }

    @ObfuscatedName("nu.cn(IB)I")
    public int method6173(int arg0) {
        return this.field4292 == null || arg0 >= this.field4292.length || this.field4292[arg0] == null ? 0 : this.field4292[arg0].length;
    }

    @ObfuscatedName("nu.cs(B)I")
    public int method6139() {
        return this.field4292.length;
    }

    @ObfuscatedName("nu.cx(I)V")
    public void method6140() {
        for (int var1 = 0; var1 < this.field4290.length; var1++) {
            this.field4290[var1] = null;
        }
    }

    @ObfuscatedName("nu.cr(IB)V")
    public void method6141(int arg0) {
        for (int var2 = 0; var2 < this.field4292[arg0].length; var2++) {
            this.field4292[arg0][var2] = null;
        }
    }

    @ObfuscatedName("nu.cd(B)V")
    public void method6142() {
        for (int var1 = 0; var1 < this.field4292.length; var1++) {
            if (this.field4292[var1] != null) {
                for (int var2 = 0; var2 < this.field4292[var1].length; var2++) {
                    this.field4292[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("nu.ce(I[IB)Z")
    public boolean method6143(int param1, int[] param2) {
        // $FF: Couldn't be decompiled
    }

    @ObfuscatedName("nu.cq(Ljava/lang/String;I)I")
    public int method6167(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4284.method8906(class387.method3322(var2));
    }

    @ObfuscatedName("nu.cp(ILjava/lang/String;I)I")
    public int method6145(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4293[arg0].method8906(class387.method3322(var3));
    }

    @ObfuscatedName("nu.cv(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6150(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4284.method8906(class387.method3322(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4293[var5].method8906(class387.method3322(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("nu.co(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6146(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4284.method8906(class387.method3322(var3));
        int var6 = this.field4293[var5].method8906(class387.method3322(var4));
        return this.method6128(var5, var6);
    }

    @ObfuscatedName("nu.cl(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6147(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4284.method8906(class387.method3322(var3));
        int var6 = this.field4293[var5].method8906(class387.method3322(var4));
        return this.method6130(var5, var6);
    }

    @ObfuscatedName("nu.cu(Ljava/lang/String;B)Z")
    public boolean method6148(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4284.method8906(class387.method3322(var2));
        return this.method6132(var3);
    }

    @ObfuscatedName("nu.ch(Ljava/lang/String;I)V")
    public void method6155(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4284.method8906(class387.method3322(var2));
        if (var3 >= 0) {
            this.method6084(var3);
        }
    }

    @ObfuscatedName("nu.ci(Ljava/lang/String;I)I")
    public int method6193(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4284.method8906(class387.method3322(var2));
        return this.method6104(var3);
    }

    @ObfuscatedName("cf.ca([BI)[B")
    public static final byte[] method1024(byte[] arg0) {
        class515 var1 = new class515(arg0);
        int var2 = var1.method8300();
        int var3 = var1.method8306();
        if (var3 < 0 || !(field4297 == 0 || var3 <= field4297)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8314(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8306();
            if (var5 < 0 || field4297 != 0 && var5 > field4297) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class518.method8572(var6, var5, arg0, var3, 9);
            } else {
                field4300.method8904(var1, var6);
            }
            return var6;
        }
    }
}
