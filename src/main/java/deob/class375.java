package deob;

@ObfuscatedName("ow")
public abstract class class375 {

    @ObfuscatedName("ow.as")
    public int field4369;

    @ObfuscatedName("ow.ab")
    public int[] field4360;

    @ObfuscatedName("ow.ah")
    public int[] field4359;

    @ObfuscatedName("ow.ai")
    public class552 field4357;

    @ObfuscatedName("ow.ac")
    public int[] field4358;

    @ObfuscatedName("ow.al")
    public int[] field4362;

    @ObfuscatedName("ow.at")
    public int[] field4363;

    @ObfuscatedName("ow.bj")
    public int[][] field4361;

    @ObfuscatedName("ow.bd")
    public int[][] field4373;

    @ObfuscatedName("ow.bg")
    public class552[] field4366;

    @ObfuscatedName("ow.bt")
    public Object[] field4367;

    @ObfuscatedName("ow.br")
    public Object[][] field4368;

    @ObfuscatedName("ow.ba")
    public static class551 field4364 = new class551();

    @ObfuscatedName("ow.bk")
    public int field4370;

    @ObfuscatedName("ow.bn")
    public boolean field4371;

    @ObfuscatedName("ow.by")
    public boolean field4372;

    @ObfuscatedName("ow.bc")
    public static int field4365 = 0;

    public class375(boolean arg0, boolean arg1) {
        this.field4371 = arg0;
        this.field4372 = arg1;
    }

    @ObfuscatedName("ow.bw([BI)V")
    public void method6395(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class531.field5180[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field4370 = var5;
        class531 var8 = new class531(method2882(arg0));
        int var9 = var8.method8561();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method8566();
        }
        int var10 = var8.method8561();
        if (var9 >= 7) {
            this.field4369 = var8.method8579();
        } else {
            this.field4369 = var8.method8775();
        }
        int var11 = 0;
        int var12 = -1;
        this.field4360 = new int[this.field4369];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field4369; var13++) {
                this.field4360[var13] = var11 += var8.method8579();
                if (this.field4360[var13] > var12) {
                    var12 = this.field4360[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field4369; var14++) {
                this.field4360[var14] = var11 += var8.method8775();
                if (this.field4360[var14] > var12) {
                    var12 = this.field4360[var14];
                }
            }
        }
        this.field4358 = new int[var12 + 1];
        this.field4362 = new int[var12 + 1];
        this.field4363 = new int[var12 + 1];
        this.field4361 = new int[var12 + 1][];
        this.field4367 = new Object[var12 + 1];
        this.field4368 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field4359 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field4369; var15++) {
                this.field4359[this.field4360[var15]] = var8.method8566();
            }
            this.field4357 = new class552(this.field4359);
        }
        for (int var16 = 0; var16 < this.field4369; var16++) {
            this.field4358[this.field4360[var16]] = var8.method8566();
        }
        for (int var17 = 0; var17 < this.field4369; var17++) {
            this.field4362[this.field4360[var17]] = var8.method8566();
        }
        for (int var18 = 0; var18 < this.field4369; var18++) {
            this.field4363[this.field4360[var18]] = var8.method8775();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field4369; var19++) {
                int var20 = this.field4360[var19];
                int var21 = this.field4363[var20];
                int var22 = 0;
                int var23 = -1;
                this.field4361[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field4361[var20][var24] = var22 += var8.method8579();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field4368[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field4369; var26++) {
                int var27 = this.field4360[var26];
                int var28 = this.field4363[var27];
                int var29 = 0;
                int var30 = -1;
                this.field4361[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field4361[var27][var31] = var29 += var8.method8775();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field4368[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field4373 = new int[var12 + 1][];
        this.field4366 = new class552[var12 + 1];
        for (int var33 = 0; var33 < this.field4369; var33++) {
            int var34 = this.field4360[var33];
            int var35 = this.field4363[var34];
            this.field4373[var34] = new int[this.field4368[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field4373[var34][this.field4361[var34][var36]] = var8.method8566();
            }
            this.field4366[var34] = new class552(this.field4373[var34]);
        }
    }

    @ObfuscatedName("ow.af(II)V")
    public void method6376(int arg0) {
    }

    @ObfuscatedName("ow.bi(IIB)[B")
    public byte[] method6396(int arg0, int arg1) {
        return this.method6397(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ow.bu(II[II)[B")
    public byte[] method6397(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4368.length || this.field4368[arg0] == null || arg1 < 0 || arg1 >= this.field4368[arg0].length) {
            return null;
        }
        if (this.field4368[arg0][arg1] == null) {
            boolean var4 = this.method6411(arg0, arg2);
            if (!var4) {
                this.method6353(arg0);
                boolean var5 = this.method6411(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class349.method3515(this.field4368[arg0][arg1], false);
        if (this.field4372) {
            this.field4368[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ow.be(IIB)Z")
    public boolean method6431(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4368.length || this.field4368[arg0] == null || arg1 < 0 || arg1 >= this.field4368[arg0].length) {
            return false;
        } else if (this.field4368[arg0][arg1] != null) {
            return true;
        } else if (this.field4367[arg0] == null) {
            this.method6353(arg0);
            return this.field4367[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ow.bs(II)Z")
    public boolean method6399(int arg0) {
        if (this.field4368.length == 1) {
            return this.method6431(0, arg0);
        } else if (this.field4368[arg0].length == 1) {
            return this.method6431(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ow.bl(IB)Z")
    public boolean method6400(int arg0) {
        if (this.field4367[arg0] == null) {
            this.method6353(arg0);
            return this.field4367[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ow.bz(I)Z")
    public boolean method6439() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4360.length; var2++) {
            int var3 = this.field4360[var2];
            if (this.field4367[var3] == null) {
                this.method6353(var3);
                if (this.field4367[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ow.aa(II)I")
    public int method6359(int arg0) {
        return this.field4367[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ow.bo(II)[B")
    public byte[] method6402(int arg0) {
        if (this.field4368.length == 1) {
            return this.method6396(0, arg0);
        } else if (this.field4368[arg0].length == 1) {
            return this.method6396(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ow.cg(III)[B")
    public byte[] method6423(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4368.length || this.field4368[arg0] == null || arg1 < 0 || arg1 >= this.field4368[arg0].length) {
            return null;
        }
        if (this.field4368[arg0][arg1] == null) {
            boolean var3 = this.method6411(arg0, (int[]) null);
            if (!var3) {
                this.method6353(arg0);
                boolean var4 = this.method6411(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class349.method3515(this.field4368[arg0][arg1], false);
    }

    @ObfuscatedName("ow.cb(II)[B")
    public byte[] method6401(int arg0) {
        if (this.field4368.length == 1) {
            return this.method6423(0, arg0);
        } else if (this.field4368[arg0].length == 1) {
            return this.method6423(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ow.aj(II)V")
    public void method6353(int arg0) {
    }

    @ObfuscatedName("ow.ci(IB)[I")
    public int[] method6405(int arg0) {
        return arg0 >= 0 && arg0 < this.field4361.length ? this.field4361[arg0] : null;
    }

    @ObfuscatedName("ow.cv(II)I")
    public int method6406(int arg0) {
        return this.field4368 == null || arg0 >= this.field4368.length || this.field4368[arg0] == null ? 0 : this.field4368[arg0].length;
    }

    @ObfuscatedName("ow.ct(I)I")
    public int method6398() {
        return this.field4368.length;
    }

    @ObfuscatedName("ow.cp(I)V")
    public void method6408() {
        for (int var1 = 0; var1 < this.field4367.length; var1++) {
            this.field4367[var1] = null;
        }
    }

    @ObfuscatedName("ow.cq(II)V")
    public void method6443(int arg0) {
        for (int var2 = 0; var2 < this.field4368[arg0].length; var2++) {
            this.field4368[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ow.cl(B)V")
    public void method6410() {
        for (int var1 = 0; var1 < this.field4368.length; var1++) {
            if (this.field4368[var1] != null) {
                for (int var2 = 0; var2 < this.field4368[var1].length; var2++) {
                    this.field4368[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ow.cs(I[IB)Z")
    public boolean method6411(int arg0, int[] arg1) {
        if (this.field4367[arg0] == null) {
            return false;
        }
        int var3 = this.field4363[arg0];
        int[] var4 = this.field4361[arg0];
        Object[] var5 = this.field4368[arg0];
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
            var8 = class349.method3515(this.field4367[arg0], true);
            class531 var9 = new class531(var8);
            var9.method8660(arg1, 5, var9.field5178.length);
        } else {
            var8 = class349.method3515(this.field4367[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2882(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class531.field5180[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class531.field5180[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class557.method2843(var43, var21 + var25 + "," + this.field4358[arg0] + "," + this.field4370);
        }
        if (this.field4371) {
            this.field4367[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class531 var31 = new class531(var10);
            int[] var32 = new int[var3];
            var31.field5181 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method8566();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field5181 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method8566();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field4372) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class349.method3191(var36[var42], false);
                }
            }
        } else if (this.field4372) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class349.method3191(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ow.cc(Ljava/lang/String;B)I")
    public int method6412(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4357.method9152(class403.method40(var2));
    }

    @ObfuscatedName("ow.cd(ILjava/lang/String;I)I")
    public int method6413(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4366[arg0].method9152(class403.method40(var3));
    }

    @ObfuscatedName("ow.cu(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6414(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4357.method9152(class403.method40(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4366[var5].method9152(class403.method40(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ow.co(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method6415(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4357.method9152(class403.method40(var3));
        int var6 = this.field4366[var5].method9152(class403.method40(var4));
        return this.method6396(var5, var6);
    }

    @ObfuscatedName("ow.cy(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method6416(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4357.method9152(class403.method40(var3));
        int var6 = this.field4366[var5].method9152(class403.method40(var4));
        return this.method6431(var5, var6);
    }

    @ObfuscatedName("ow.cn(Ljava/lang/String;I)Z")
    public boolean method6417(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4357.method9152(class403.method40(var2));
        return this.method6400(var3);
    }

    @ObfuscatedName("ow.ch(Ljava/lang/String;B)V")
    public void method6418(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4357.method9152(class403.method40(var2));
        if (var3 >= 0) {
            this.method6376(var3);
        }
    }

    @ObfuscatedName("ow.cr(Ljava/lang/String;I)I")
    public int method6427(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4357.method9152(class403.method40(var2));
        return this.method6359(var3);
    }

    @ObfuscatedName("eq.ce([BI)[B")
    public static final byte[] method2882(byte[] arg0) {
        class531 var1 = new class531(arg0);
        int var2 = var1.method8561();
        int var3 = var1.method8566();
        if (var3 < 0 || !(field4365 == 0 || var3 <= field4365)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method8659(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method8566();
            if (var5 < 0 || field4365 != 0 && var5 > field4365) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class534.method8828(var6, var5, arg0, var3, 9);
            } else {
                field4364.method9147(var1, var6);
            }
            return var6;
        }
    }
}
