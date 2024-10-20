package deob;

@ObfuscatedName("ie")
public abstract class class256 {

    @ObfuscatedName("ie.b")
    public int field3330;

    @ObfuscatedName("ie.q")
    public int[] field3323;

    @ObfuscatedName("ie.o")
    public int[] field3324;

    @ObfuscatedName("ie.p")
    public class208 field3325;

    @ObfuscatedName("ie.a")
    public int[] field3327;

    @ObfuscatedName("ie.h")
    public int[] field3331;

    @ObfuscatedName("ie.l")
    public int[] field3322;

    @ObfuscatedName("ie.y")
    public int[][] field3333;

    @ObfuscatedName("ie.g")
    public int[][] field3326;

    @ObfuscatedName("ie.c")
    public class208[] field3328;

    @ObfuscatedName("ie.u")
    public Object[] field3332;

    @ObfuscatedName("ie.r")
    public Object[][] field3335;

    @ObfuscatedName("ie.d")
    public static class187 field3334 = new class187();

    @ObfuscatedName("ie.v")
    public int field3329;

    @ObfuscatedName("ie.s")
    public boolean field3336;

    @ObfuscatedName("ie.t")
    public boolean field3337;

    @ObfuscatedName("ie.f")
    public static int field3338 = 0;

    public class256(boolean arg0, boolean arg1) {
        this.field3336 = arg0;
        this.field3337 = arg1;
    }

    @ObfuscatedName("ie.b([BI)V")
    public void method4219(byte[] arg0) {
        this.field3329 = class194.method745(arg0, arg0.length);
        class194 var2 = new class194(method2333(arg0));
        int var3 = var2.method3247();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3261();
        }
        int var4 = var2.method3247();
        if (var3 >= 7) {
            this.field3330 = var2.method3262();
        } else {
            this.field3330 = var2.method3249();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3323 = new int[this.field3330];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3330; var7++) {
                this.field3323[var7] = var5 += var2.method3262();
                if (this.field3323[var7] > var6) {
                    var6 = this.field3323[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3330; var8++) {
                this.field3323[var8] = var5 += var2.method3249();
                if (this.field3323[var8] > var6) {
                    var6 = this.field3323[var8];
                }
            }
        }
        this.field3327 = new int[var6 + 1];
        this.field3331 = new int[var6 + 1];
        this.field3322 = new int[var6 + 1];
        this.field3333 = new int[var6 + 1][];
        this.field3332 = new Object[var6 + 1];
        this.field3335 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3324 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3330; var9++) {
                this.field3324[this.field3323[var9]] = var2.method3261();
            }
            this.field3325 = new class208(this.field3324);
        }
        for (int var10 = 0; var10 < this.field3330; var10++) {
            this.field3327[this.field3323[var10]] = var2.method3261();
        }
        for (int var11 = 0; var11 < this.field3330; var11++) {
            this.field3331[this.field3323[var11]] = var2.method3261();
        }
        for (int var12 = 0; var12 < this.field3330; var12++) {
            this.field3322[this.field3323[var12]] = var2.method3249();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3330; var13++) {
                int var14 = this.field3323[var13];
                int var15 = this.field3322[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3333[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3333[var14][var18] = var16 += var2.method3262();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3335[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3330; var20++) {
                int var21 = this.field3323[var20];
                int var22 = this.field3322[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3333[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3333[var21][var25] = var23 += var2.method3249();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3335[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3326 = new int[var6 + 1][];
        this.field3328 = new class208[var6 + 1];
        for (int var27 = 0; var27 < this.field3330; var27++) {
            int var28 = this.field3323[var27];
            int var29 = this.field3322[var28];
            this.field3326[var28] = new int[this.field3335[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3326[var28][this.field3333[var28][var30]] = var2.method3261();
            }
            this.field3328[var28] = new class208(this.field3326[var28]);
        }
    }

    @ObfuscatedName("ie.q(IB)V")
    public void method4207(int arg0) {
    }

    @ObfuscatedName("ie.o(III)[B")
    public byte[] method4158(int arg0, int arg1) {
        return this.method4171(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ie.p(II[IB)[B")
    public byte[] method4171(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3335.length || this.field3335[arg0] == null || arg1 < 0 || arg1 >= this.field3335[arg0].length) {
            return null;
        }
        if (this.field3335[arg0][arg1] == null) {
            boolean var4 = this.method4176(arg0, arg2);
            if (!var4) {
                this.method4170(arg0);
                boolean var5 = this.method4176(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class197.method4136(this.field3335[arg0][arg1], false);
        if (this.field3337) {
            this.field3335[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ie.a(IIB)Z")
    public boolean method4221(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3335.length || this.field3335[arg0] == null || arg1 < 0 || arg1 >= this.field3335[arg0].length) {
            return false;
        } else if (this.field3335[arg0][arg1] != null) {
            return true;
        } else if (this.field3332[arg0] == null) {
            this.method4170(arg0);
            return this.field3332[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ie.h(II)Z")
    public boolean method4163(int arg0) {
        if (this.field3335.length == 1) {
            return this.method4221(0, arg0);
        } else if (this.field3335[arg0].length == 1) {
            return this.method4221(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.l(IB)Z")
    public boolean method4164(int arg0) {
        if (this.field3332[arg0] == null) {
            this.method4170(arg0);
            return this.field3332[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ie.y(I)Z")
    public boolean method4191() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3323.length; var2++) {
            int var3 = this.field3323[var2];
            if (this.field3332[var3] == null) {
                this.method4170(var3);
                if (this.field3332[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.g(IB)I")
    public int method4166(int arg0) {
        return this.field3332[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ie.c(II)[B")
    public byte[] method4167(int arg0) {
        if (this.field3335.length == 1) {
            return this.method4158(0, arg0);
        } else if (this.field3335[arg0].length == 1) {
            return this.method4158(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.u(III)[B")
    public byte[] method4168(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3335.length || this.field3335[arg0] == null || arg1 < 0 || arg1 >= this.field3335[arg0].length) {
            return null;
        }
        if (this.field3335[arg0][arg1] == null) {
            boolean var3 = this.method4176(arg0, (int[]) null);
            if (!var3) {
                this.method4170(arg0);
                boolean var4 = this.method4176(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class197.method4136(this.field3335[arg0][arg1], false);
    }

    @ObfuscatedName("ie.t(II)[B")
    public byte[] method4185(int arg0) {
        if (this.field3335.length == 1) {
            return this.method4168(0, arg0);
        } else if (this.field3335[arg0].length == 1) {
            return this.method4168(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.f(II)V")
    public void method4170(int arg0) {
    }

    @ObfuscatedName("ie.m(II)[I")
    public int[] method4222(int arg0) {
        return this.field3333[arg0];
    }

    @ObfuscatedName("ie.x(IB)I")
    public int method4172(int arg0) {
        return this.field3335[arg0].length;
    }

    @ObfuscatedName("ie.w(I)I")
    public int method4173() {
        return this.field3335.length;
    }

    @ObfuscatedName("ie.j(II)V")
    public void method4174(int arg0) {
        for (int var2 = 0; var2 < this.field3335[arg0].length; var2++) {
            this.field3335[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ie.z(B)V")
    public void method4237() {
        for (int var1 = 0; var1 < this.field3335.length; var1++) {
            if (this.field3335[var1] != null) {
                for (int var2 = 0; var2 < this.field3335[var1].length; var2++) {
                    this.field3335[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ie.e(I[IB)Z")
    public boolean method4176(int arg0, int[] arg1) {
        if (this.field3332[arg0] == null) {
            return false;
        }
        int var3 = this.field3322[arg0];
        int[] var4 = this.field3333[arg0];
        Object[] var5 = this.field3335[arg0];
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
            var8 = class197.method4136(this.field3332[arg0], true);
            class194 var9 = new class194(var8);
            var9.method3455(arg1, 5, var9.field2541.length);
        } else {
            var8 = class197.method4136(this.field3332[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2333(var8);
        } catch (RuntimeException var27) {
            throw class164.method3205(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class194.method745(var8, var8.length) + "," + class194.method745(var8, var8.length - 2) + "," + this.field3327[arg0] + "," + this.field3329);
        }
        if (this.field3336) {
            this.field3332[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class194 var15 = new class194(var10);
            int[] var16 = new int[var3];
            var15.field2538 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3261();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2538 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3261();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3337) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class197.method3226(var20[var26], false);
                }
            }
        } else if (this.field3337) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class197.method3226(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ie.k(Ljava/lang/String;B)I")
    public int method4177(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3325.method3649(class305.method4919(var2));
    }

    @ObfuscatedName("ie.ao(ILjava/lang/String;I)I")
    public int method4228(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3328[arg0].method3649(class305.method4919(var3));
    }

    @ObfuscatedName("ie.am(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method4161(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3325.method3649(class305.method4919(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3328[var5].method3649(class305.method4919(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ie.aj(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4180(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3325.method3649(class305.method4919(var3));
        int var6 = this.field3328[var5].method3649(class305.method4919(var4));
        return this.method4158(var5, var6);
    }

    @ObfuscatedName("ie.ah(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4181(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3325.method3649(class305.method4919(var3));
        int var6 = this.field3328[var5].method3649(class305.method4919(var4));
        return this.method4221(var5, var6);
    }

    @ObfuscatedName("ie.af(Ljava/lang/String;I)Z")
    public boolean method4182(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3325.method3649(class305.method4919(var2));
        return this.method4164(var3);
    }

    @ObfuscatedName("ie.ai(Ljava/lang/String;I)V")
    public void method4169(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3325.method3649(class305.method4919(var2));
        if (var3 >= 0) {
            this.method4207(var3);
        }
    }

    @ObfuscatedName("ie.aq(Ljava/lang/String;B)I")
    public int method4184(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3325.method3649(class305.method4919(var2));
        return this.method4166(var3);
    }

    @ObfuscatedName("de.ak([BI)[B")
    public static final byte[] method2333(byte[] arg0) {
        class194 var1 = new class194(arg0);
        int var2 = var1.method3247();
        int var3 = var1.method3261();
        if (var3 < 0 || !(field3338 == 0 || var3 <= field3338)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3447(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3261();
            if (var5 < 0 || field3338 != 0 && var5 > field3338) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class188.method3197(var6, var5, arg0, var3, 9);
            } else {
                field3334.method3167(var1, var6);
            }
            return var6;
        }
    }
}
