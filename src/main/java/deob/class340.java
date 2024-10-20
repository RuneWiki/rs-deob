package deob;

@ObfuscatedName("ne")
public abstract class class340 {

    @ObfuscatedName("ne.au")
    public int field4199;

    @ObfuscatedName("ne.ag")
    public int[] field4186;

    @ObfuscatedName("ne.at")
    public int[] field4193;

    @ObfuscatedName("ne.af")
    public class499 field4189;

    @ObfuscatedName("ne.ai")
    public int[] field4190;

    @ObfuscatedName("ne.aw")
    public int[] field4191;

    @ObfuscatedName("ne.aa")
    public int[] field4188;

    @ObfuscatedName("ne.ah")
    public int[][] field4187;

    @ObfuscatedName("ne.ad")
    public int[][] field4194;

    @ObfuscatedName("ne.bm")
    public class499[] field4195;

    @ObfuscatedName("ne.bv")
    public Object[] field4196;

    @ObfuscatedName("ne.bo")
    public Object[][] field4197;

    @ObfuscatedName("ne.bs")
    public static class498 field4198 = new class498();

    @ObfuscatedName("ne.bg")
    public int field4192;

    @ObfuscatedName("ne.bh")
    public boolean field4200;

    @ObfuscatedName("ne.bl")
    public boolean field4201;

    @ObfuscatedName("ne.bk")
    public static int field4202 = 0;

    public class340(boolean arg0, boolean arg1) {
        this.field4200 = arg0;
        this.field4201 = arg1;
    }

    @ObfuscatedName("ne.bn([BB)V")
    public void method5858(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class478.field4905[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field4192 = var5;
        class478 var8 = new class478(method6743(arg0));
        int var9 = var8.method7909();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method7908();
        }
        int var10 = var8.method7909();
        if (var9 >= 7) {
            this.field4199 = var8.method7921();
        } else {
            this.field4199 = var8.method7905();
        }
        int var11 = 0;
        int var12 = -1;
        this.field4186 = new int[this.field4199];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field4199; var13++) {
                this.field4186[var13] = var11 += var8.method7921();
                if (this.field4186[var13] > var12) {
                    var12 = this.field4186[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field4199; var14++) {
                this.field4186[var14] = var11 += var8.method7905();
                if (this.field4186[var14] > var12) {
                    var12 = this.field4186[var14];
                }
            }
        }
        this.field4190 = new int[var12 + 1];
        this.field4191 = new int[var12 + 1];
        this.field4188 = new int[var12 + 1];
        this.field4187 = new int[var12 + 1][];
        this.field4196 = new Object[var12 + 1];
        this.field4197 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field4193 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field4199; var15++) {
                this.field4193[this.field4186[var15]] = var8.method7908();
            }
            this.field4189 = new class499(this.field4193);
        }
        for (int var16 = 0; var16 < this.field4199; var16++) {
            this.field4190[this.field4186[var16]] = var8.method7908();
        }
        for (int var17 = 0; var17 < this.field4199; var17++) {
            this.field4191[this.field4186[var17]] = var8.method7908();
        }
        for (int var18 = 0; var18 < this.field4199; var18++) {
            this.field4188[this.field4186[var18]] = var8.method7905();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field4199; var19++) {
                int var20 = this.field4186[var19];
                int var21 = this.field4188[var20];
                int var22 = 0;
                int var23 = -1;
                this.field4187[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field4187[var20][var24] = var22 += var8.method7921();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field4197[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field4199; var26++) {
                int var27 = this.field4186[var26];
                int var28 = this.field4188[var27];
                int var29 = 0;
                int var30 = -1;
                this.field4187[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field4187[var27][var31] = var29 += var8.method7905();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field4197[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field4194 = new int[var12 + 1][];
        this.field4195 = new class499[var12 + 1];
        for (int var33 = 0; var33 < this.field4199; var33++) {
            int var34 = this.field4186[var33];
            int var35 = this.field4188[var34];
            this.field4194[var34] = new int[this.field4197[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field4194[var34][this.field4187[var34][var36]] = var8.method7908();
            }
            this.field4195[var34] = new class499(this.field4194[var34]);
        }
    }

    @ObfuscatedName("ne.ac(IB)V")
    public void method5811(int arg0) {
    }

    @ObfuscatedName("ne.bj(IIB)[B")
    public byte[] method5860(int arg0, int arg1) {
        return this.method5861(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ne.bf(II[II)[B")
    public byte[] method5861(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field4197.length || this.field4197[arg0] == null || arg1 < 0 || arg1 >= this.field4197[arg0].length) {
            return null;
        }
        if (this.field4197[arg0][arg1] == null) {
            boolean var4 = this.method5874(arg0, arg2);
            if (!var4) {
                this.method5812(arg0);
                boolean var5 = this.method5874(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class317.method2829(this.field4197[arg0][arg1], false);
        if (this.field4201) {
            this.field4197[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ne.bw(IIB)Z")
    public boolean method5862(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4197.length || this.field4197[arg0] == null || arg1 < 0 || arg1 >= this.field4197[arg0].length) {
            return false;
        } else if (this.field4197[arg0][arg1] != null) {
            return true;
        } else if (this.field4196[arg0] == null) {
            this.method5812(arg0);
            return this.field4196[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ne.bi(II)Z")
    public boolean method5863(int arg0) {
        if (this.field4197.length == 1) {
            return this.method5862(0, arg0);
        } else if (this.field4197[arg0].length == 1) {
            return this.method5862(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ne.cl(IB)Z")
    public boolean method5864(int arg0) {
        if (this.field4196[arg0] == null) {
            this.method5812(arg0);
            return this.field4196[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ne.ca(B)Z")
    public boolean method5884() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field4186.length; var2++) {
            int var3 = this.field4186[var2];
            if (this.field4196[var3] == null) {
                this.method5812(var3);
                if (this.field4196[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ne.ar(II)I")
    public int method5818(int arg0) {
        return this.field4196[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ne.cb(IB)[B")
    public byte[] method5865(int arg0) {
        if (this.field4197.length == 1) {
            return this.method5860(0, arg0);
        } else if (this.field4197[arg0].length == 1) {
            return this.method5860(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ne.co(III)[B")
    public byte[] method5866(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field4197.length || this.field4197[arg0] == null || arg1 < 0 || arg1 >= this.field4197[arg0].length) {
            return null;
        }
        if (this.field4197[arg0][arg1] == null) {
            boolean var3 = this.method5874(arg0, (int[]) null);
            if (!var3) {
                this.method5812(arg0);
                boolean var4 = this.method5874(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class317.method2829(this.field4197[arg0][arg1], false);
    }

    @ObfuscatedName("ne.cj(IB)[B")
    public byte[] method5941(int arg0) {
        if (this.field4197.length == 1) {
            return this.method5866(0, arg0);
        } else if (this.field4197[arg0].length == 1) {
            return this.method5866(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ne.ab(IB)V")
    public void method5812(int arg0) {
    }

    @ObfuscatedName("ne.cn(II)[I")
    public int[] method5890(int arg0) {
        return arg0 >= 0 && arg0 < this.field4187.length ? this.field4187[arg0] : null;
    }

    @ObfuscatedName("ne.ce(II)I")
    public int method5934(int arg0) {
        return this.field4197[arg0].length;
    }

    @ObfuscatedName("ne.cd(I)I")
    public int method5870() {
        return this.field4197.length;
    }

    @ObfuscatedName("ne.cc(I)V")
    public void method5893() {
        for (int var1 = 0; var1 < this.field4196.length; var1++) {
            this.field4196[var1] = null;
        }
    }

    @ObfuscatedName("ne.ct(II)V")
    public void method5872(int arg0) {
        for (int var2 = 0; var2 < this.field4197[arg0].length; var2++) {
            this.field4197[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ne.cy(I)V")
    public void method5873() {
        for (int var1 = 0; var1 < this.field4197.length; var1++) {
            if (this.field4197[var1] != null) {
                for (int var2 = 0; var2 < this.field4197[var1].length; var2++) {
                    this.field4197[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ne.ck(I[II)Z")
    public boolean method5874(int arg0, int[] arg1) {
        if (this.field4196[arg0] == null) {
            return false;
        }
        int var3 = this.field4188[arg0];
        int[] var4 = this.field4187[arg0];
        Object[] var5 = this.field4197[arg0];
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
            var8 = class317.method2829(this.field4196[arg0], true);
            class478 var9 = new class478(var8);
            var9.method7928(arg1, 5, var9.field4906.length);
        } else {
            var8 = class317.method2829(this.field4196[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method6743(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class478.field4905[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class478.field4905[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class504.method63(var42, var20 + var24 + "," + this.field4190[arg0] + "," + this.field4192);
        }
        if (this.field4200) {
            this.field4196[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class478 var30 = new class478(var10);
            int[] var31 = new int[var3];
            var30.field4904 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method7908();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field4904 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method7908();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field4201) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class317.method4672(var35[var41], false);
                }
            }
        } else if (this.field4201) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class317.method4672(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ne.cz(Ljava/lang/String;I)I")
    public int method5875(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field4189.method8482(class368.method1990(var2));
    }

    @ObfuscatedName("ne.cg(ILjava/lang/String;B)I")
    public int method5876(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field4195[arg0].method8482(class368.method1990(var3));
    }

    @ObfuscatedName("ne.ch(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5907(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4189.method8482(class368.method1990(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field4195[var5].method8482(class368.method1990(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ne.cs(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method5878(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4189.method8482(class368.method1990(var3));
        int var6 = this.field4195[var5].method8482(class368.method1990(var4));
        return this.method5860(var5, var6);
    }

    @ObfuscatedName("ne.cq(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method5857(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field4189.method8482(class368.method1990(var3));
        int var6 = this.field4195[var5].method8482(class368.method1990(var4));
        return this.method5862(var5, var6);
    }

    @ObfuscatedName("ne.cx(Ljava/lang/String;B)Z")
    public boolean method5880(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4189.method8482(class368.method1990(var2));
        return this.method5864(var3);
    }

    @ObfuscatedName("ne.cu(Ljava/lang/String;I)V")
    public void method5881(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4189.method8482(class368.method1990(var2));
        if (var3 >= 0) {
            this.method5811(var3);
        }
    }

    @ObfuscatedName("ne.cm(Ljava/lang/String;I)I")
    public int method5903(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field4189.method8482(class368.method1990(var2));
        return this.method5818(var3);
    }

    @ObfuscatedName("os.cw([BI)[B")
    public static final byte[] method6743(byte[] arg0) {
        class478 var1 = new class478(arg0);
        int var2 = var1.method7909();
        int var3 = var1.method7908();
        if (var3 < 0 || !(field4202 == 0 || var3 <= field4202)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method7916(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method7908();
            if (var5 < 0 || field4202 != 0 && var5 > field4202) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class481.method8180(var6, var5, arg0, var3, 9);
            } else {
                field4198.method8479(var1, var6);
            }
            return var6;
        }
    }
}
