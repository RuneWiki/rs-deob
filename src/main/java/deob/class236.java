package deob;

@ObfuscatedName("im")
public abstract class class236 {

    @ObfuscatedName("im.d")
    public int field3208;

    @ObfuscatedName("im.q")
    public int[] field3203;

    @ObfuscatedName("im.x")
    public int[] field3196;

    @ObfuscatedName("im.y")
    public class188 field3197;

    @ObfuscatedName("im.e")
    public int[] field3198;

    @ObfuscatedName("im.f")
    public int[] field3195;

    @ObfuscatedName("im.v")
    public int[] field3200;

    @ObfuscatedName("im.t")
    public int[][] field3201;

    @ObfuscatedName("im.i")
    public int[][] field3202;

    @ObfuscatedName("im.r")
    public class188[] field3205;

    @ObfuscatedName("im.g")
    public Object[] field3204;

    @ObfuscatedName("im.s")
    public Object[][] field3194;

    @ObfuscatedName("im.o")
    public static class167 field3206 = new class167();

    @ObfuscatedName("im.p")
    public int field3207;

    @ObfuscatedName("im.u")
    public boolean field3199;

    @ObfuscatedName("im.b")
    public boolean field3212;

    @ObfuscatedName("im.w")
    public static int field3210 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3199 = arg0;
        this.field3212 = arg1;
    }

    @ObfuscatedName("im.d([BI)V")
    public void method3774(byte[] arg0) {
        this.field3207 = Statics.method1412(arg0, arg0.length);
        class174 var2 = new class174(Statics.method998(arg0));
        int var3 = var2.method2921();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2935();
        }
        int var4 = var2.method2921();
        if (var3 >= 7) {
            this.field3208 = var2.method2928();
        } else {
            this.field3208 = var2.method2916();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3203 = new int[this.field3208];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3208; var7++) {
                this.field3203[var7] = var5 += var2.method2928();
                if (this.field3203[var7] > var6) {
                    var6 = this.field3203[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3208; var8++) {
                this.field3203[var8] = var5 += var2.method2916();
                if (this.field3203[var8] > var6) {
                    var6 = this.field3203[var8];
                }
            }
        }
        this.field3198 = new int[var6 + 1];
        this.field3195 = new int[var6 + 1];
        this.field3200 = new int[var6 + 1];
        this.field3201 = new int[var6 + 1][];
        this.field3204 = new Object[var6 + 1];
        this.field3194 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3196 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3208; var9++) {
                this.field3196[this.field3203[var9]] = var2.method2935();
            }
            this.field3197 = new class188(this.field3196);
        }
        for (int var10 = 0; var10 < this.field3208; var10++) {
            this.field3198[this.field3203[var10]] = var2.method2935();
        }
        for (int var11 = 0; var11 < this.field3208; var11++) {
            this.field3195[this.field3203[var11]] = var2.method2935();
        }
        for (int var12 = 0; var12 < this.field3208; var12++) {
            this.field3200[this.field3203[var12]] = var2.method2916();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3208; var13++) {
                int var14 = this.field3203[var13];
                int var15 = this.field3200[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3201[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3201[var14][var18] = var16 += var2.method2928();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3194[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3208; var20++) {
                int var21 = this.field3203[var20];
                int var22 = this.field3200[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3201[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3201[var21][var25] = var23 += var2.method2916();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3194[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3202 = new int[var6 + 1][];
        this.field3205 = new class188[var6 + 1];
        for (int var27 = 0; var27 < this.field3208; var27++) {
            int var28 = this.field3203[var27];
            int var29 = this.field3200[var28];
            this.field3202[var28] = new int[this.field3194[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3202[var28][this.field3201[var28][var30]] = var2.method2935();
            }
            this.field3205[var28] = new class188(this.field3202[var28]);
        }
    }

    @ObfuscatedName("im.q(II)V")
    public void method3758(int arg0) {
    }

    @ObfuscatedName("im.x(IIB)[B")
    public byte[] method3750(int arg0, int arg1) {
        return this.method3751(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("im.y(II[II)[B")
    public byte[] method3751(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3194.length || this.field3194[arg0] == null || arg1 < 0 || arg1 >= this.field3194[arg0].length) {
            return null;
        }
        if (this.field3194[arg0][arg1] == null) {
            boolean var4 = this.method3803(arg0, arg2);
            if (!var4) {
                this.method3759(arg0);
                boolean var5 = this.method3803(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method2762(this.field3194[arg0][arg1], false);
        if (this.field3212) {
            this.field3194[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("im.e(IIB)Z")
    public boolean method3752(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3194.length || this.field3194[arg0] == null || arg1 < 0 || arg1 >= this.field3194[arg0].length) {
            return false;
        } else if (this.field3194[arg0][arg1] != null) {
            return true;
        } else if (this.field3204[arg0] == null) {
            this.method3759(arg0);
            return this.field3204[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("im.f(II)Z")
    public boolean method3753(int arg0) {
        if (this.field3204[arg0] == null) {
            this.method3759(arg0);
            return this.field3204[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("im.v(B)Z")
    public boolean method3770() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3203.length; var2++) {
            int var3 = this.field3203[var2];
            if (this.field3204[var3] == null) {
                this.method3759(var3);
                if (this.field3204[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("im.t(II)I")
    public int method3748(int arg0) {
        return this.field3204[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("im.i(II)[B")
    public byte[] method3756(int arg0) {
        if (this.field3194.length == 1) {
            return this.method3750(0, arg0);
        } else if (this.field3194[arg0].length == 1) {
            return this.method3750(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("im.r(III)[B")
    public byte[] method3757(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3194.length || this.field3194[arg0] == null || arg1 < 0 || arg1 >= this.field3194[arg0].length) {
            return null;
        }
        if (this.field3194[arg0][arg1] == null) {
            boolean var3 = this.method3803(arg0, (int[]) null);
            if (!var3) {
                this.method3759(arg0);
                boolean var4 = this.method3803(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method2762(this.field3194[arg0][arg1], false);
    }

    @ObfuscatedName("im.g(II)[B")
    public byte[] method3754(int arg0) {
        if (this.field3194.length == 1) {
            return this.method3757(0, arg0);
        } else if (this.field3194[arg0].length == 1) {
            return this.method3757(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("im.s(II)V")
    public void method3759(int arg0) {
    }

    @ObfuscatedName("im.o(II)[I")
    public int[] method3760(int arg0) {
        return this.field3201[arg0];
    }

    @ObfuscatedName("im.p(II)I")
    public int method3761(int arg0) {
        return this.field3194[arg0].length;
    }

    @ObfuscatedName("im.u(B)I")
    public int method3762() {
        return this.field3194.length;
    }

    @ObfuscatedName("im.b(IB)V")
    public void method3763(int arg0) {
        for (int var2 = 0; var2 < this.field3194[arg0].length; var2++) {
            this.field3194[arg0][var2] = null;
        }
    }

    @ObfuscatedName("im.w(I)V")
    public void method3764() {
        for (int var1 = 0; var1 < this.field3194.length; var1++) {
            if (this.field3194[var1] != null) {
                for (int var2 = 0; var2 < this.field3194[var1].length; var2++) {
                    this.field3194[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("im.k(I[II)Z")
    public boolean method3803(int arg0, int[] arg1) {
        if (this.field3204[arg0] == null) {
            return false;
        }
        int var3 = this.field3200[arg0];
        int[] var4 = this.field3201[arg0];
        Object[] var5 = this.field3194[arg0];
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
            var8 = class177.method2762(this.field3204[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2934(arg1, 5, var9.field2367.length);
        } else {
            var8 = class177.method2762(this.field3204[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method998(var8);
        } catch (RuntimeException var27) {
            throw class153.method1752(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method1412(var8, var8.length) + "," + Statics.method1412(var8, var8.length - 2) + "," + this.field3198[arg0] + "," + this.field3207);
        }
        if (this.field3199) {
            this.field3204[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class174 var15 = new class174(var10);
            int[] var16 = new int[var3];
            var15.field2364 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2935();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2364 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2935();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3212) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class177.method1056(var20[var26], false);
                }
            }
        } else if (this.field3212) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method1056(var10, false);
        }
        return true;
    }

    @ObfuscatedName("im.c(Ljava/lang/String;I)I")
    public int method3766(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3197.method3240(class271.method3730(var2));
    }

    @ObfuscatedName("im.h(ILjava/lang/String;I)I")
    public int method3767(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3205[arg0].method3240(class271.method3730(var3));
    }

    @ObfuscatedName("im.z(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3787(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3197.method3240(class271.method3730(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3205[var5].method3240(class271.method3730(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("im.j(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3769(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3197.method3240(class271.method3730(var3));
        int var6 = this.field3205[var5].method3240(class271.method3730(var4));
        return this.method3750(var5, var6);
    }

    @ObfuscatedName("im.am(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3772(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3197.method3240(class271.method3730(var3));
        int var6 = this.field3205[var5].method3240(class271.method3730(var4));
        return this.method3752(var5, var6);
    }

    @ObfuscatedName("im.ac(Ljava/lang/String;I)Z")
    public boolean method3784(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3197.method3240(class271.method3730(var2));
        return this.method3753(var3);
    }

    @ObfuscatedName("im.ax(Ljava/lang/String;I)V")
    public void method3825(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3197.method3240(class271.method3730(var2));
        if (var3 >= 0) {
            this.method3758(var3);
        }
    }

    @ObfuscatedName("im.at(Ljava/lang/String;I)I")
    public int method3773(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3197.method3240(class271.method3730(var2));
        return this.method3748(var3);
    }
}
