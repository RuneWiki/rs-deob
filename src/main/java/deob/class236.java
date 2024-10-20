package deob;

@ObfuscatedName("ip")
public abstract class class236 {

    @ObfuscatedName("ip.w")
    public int field3219;

    @ObfuscatedName("ip.s")
    public int[] field3209;

    @ObfuscatedName("ip.q")
    public int[] field3210;

    @ObfuscatedName("ip.o")
    public class188 field3216;

    @ObfuscatedName("ip.g")
    public int[] field3212;

    @ObfuscatedName("ip.v")
    public int[] field3213;

    @ObfuscatedName("ip.p")
    public int[] field3214;

    @ObfuscatedName("ip.e")
    public int[][] field3215;

    @ObfuscatedName("ip.d")
    public int[][] field3208;

    @ObfuscatedName("ip.x")
    public class188[] field3217;

    @ObfuscatedName("ip.z")
    public Object[] field3220;

    @ObfuscatedName("ip.n")
    public Object[][] field3226;

    @ObfuscatedName("ip.u")
    public static class167 field3211 = new class167();

    @ObfuscatedName("ip.t")
    public int field3221;

    @ObfuscatedName("ip.a")
    public boolean field3222;

    @ObfuscatedName("ip.i")
    public boolean field3223;

    @ObfuscatedName("ip.h")
    public static int field3224 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3222 = arg0;
        this.field3223 = arg1;
    }

    @ObfuscatedName("ip.w([BI)V")
    public void method3925(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class174.field2388[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3221 = var5;
        class174 var8 = new class174(method3197(arg0));
        int var9 = var8.method2971();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3131();
        }
        int var10 = var8.method2971();
        if (var9 >= 7) {
            this.field3219 = var8.method2994();
        } else {
            this.field3219 = var8.method3178();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3209 = new int[this.field3219];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3219; var13++) {
                this.field3209[var13] = var11 += var8.method2994();
                if (this.field3209[var13] > var12) {
                    var12 = this.field3209[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3219; var14++) {
                this.field3209[var14] = var11 += var8.method3178();
                if (this.field3209[var14] > var12) {
                    var12 = this.field3209[var14];
                }
            }
        }
        this.field3212 = new int[var12 + 1];
        this.field3213 = new int[var12 + 1];
        this.field3214 = new int[var12 + 1];
        this.field3215 = new int[var12 + 1][];
        this.field3220 = new Object[var12 + 1];
        this.field3226 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3210 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3219; var15++) {
                this.field3210[this.field3209[var15]] = var8.method3131();
            }
            this.field3216 = new class188(this.field3210);
        }
        for (int var16 = 0; var16 < this.field3219; var16++) {
            this.field3212[this.field3209[var16]] = var8.method3131();
        }
        for (int var17 = 0; var17 < this.field3219; var17++) {
            this.field3213[this.field3209[var17]] = var8.method3131();
        }
        for (int var18 = 0; var18 < this.field3219; var18++) {
            this.field3214[this.field3209[var18]] = var8.method3178();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3219; var19++) {
                int var20 = this.field3209[var19];
                int var21 = this.field3214[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3215[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3215[var20][var24] = var22 += var8.method2994();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3226[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3219; var26++) {
                int var27 = this.field3209[var26];
                int var28 = this.field3214[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3215[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3215[var27][var31] = var29 += var8.method3178();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3226[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3208 = new int[var12 + 1][];
        this.field3217 = new class188[var12 + 1];
        for (int var33 = 0; var33 < this.field3219; var33++) {
            int var34 = this.field3209[var33];
            int var35 = this.field3214[var34];
            this.field3208[var34] = new int[this.field3226[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3208[var34][this.field3215[var34][var36]] = var8.method3131();
            }
            this.field3217[var34] = new class188(this.field3208[var34]);
        }
    }

    @ObfuscatedName("ip.s(II)V")
    public void method3953(int arg0) {
    }

    @ObfuscatedName("ip.q(III)[B")
    public byte[] method3876(int arg0, int arg1) {
        return this.method3877(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ip.o(II[II)[B")
    public byte[] method3877(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return null;
        }
        if (this.field3226[arg0][arg1] == null) {
            boolean var4 = this.method3891(arg0, arg2);
            if (!var4) {
                this.method3952(arg0);
                boolean var5 = this.method3891(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method2890(this.field3226[arg0][arg1], false);
        if (this.field3223) {
            this.field3226[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ip.g(III)Z")
    public boolean method3878(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return false;
        } else if (this.field3226[arg0][arg1] != null) {
            return true;
        } else if (this.field3220[arg0] == null) {
            this.method3952(arg0);
            return this.field3220[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ip.v(II)Z")
    public boolean method3879(int arg0) {
        if (this.field3220[arg0] == null) {
            this.method3952(arg0);
            return this.field3220[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ip.p(I)Z")
    public boolean method3911() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3209.length; var2++) {
            int var3 = this.field3209[var2];
            if (this.field3220[var3] == null) {
                this.method3952(var3);
                if (this.field3220[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ip.e(IS)I")
    public int method3881(int arg0) {
        return this.field3220[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ip.d(II)[B")
    public byte[] method3916(int arg0) {
        if (this.field3226.length == 1) {
            return this.method3876(0, arg0);
        } else if (this.field3226[arg0].length == 1) {
            return this.method3876(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ip.x(III)[B")
    public byte[] method3883(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3226.length || this.field3226[arg0] == null || arg1 < 0 || arg1 >= this.field3226[arg0].length) {
            return null;
        }
        if (this.field3226[arg0][arg1] == null) {
            boolean var3 = this.method3891(arg0, (int[]) null);
            if (!var3) {
                this.method3952(arg0);
                boolean var4 = this.method3891(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method2890(this.field3226[arg0][arg1], false);
    }

    @ObfuscatedName("ip.u(II)[B")
    public byte[] method3928(int arg0) {
        if (this.field3226.length == 1) {
            return this.method3883(0, arg0);
        } else if (this.field3226[arg0].length == 1) {
            return this.method3883(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ip.i(IB)V")
    public void method3952(int arg0) {
    }

    @ObfuscatedName("ip.h(IB)[I")
    public int[] method3886(int arg0) {
        return this.field3215[arg0];
    }

    @ObfuscatedName("ip.b(IB)I")
    public int method3908(int arg0) {
        return this.field3226[arg0].length;
    }

    @ObfuscatedName("ip.j(I)I")
    public int method3918() {
        return this.field3226.length;
    }

    @ObfuscatedName("ip.y(IB)V")
    public void method3889(int arg0) {
        for (int var2 = 0; var2 < this.field3226[arg0].length; var2++) {
            this.field3226[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ip.c(I)V")
    public void method3910() {
        for (int var1 = 0; var1 < this.field3226.length; var1++) {
            if (this.field3226[var1] != null) {
                for (int var2 = 0; var2 < this.field3226[var1].length; var2++) {
                    this.field3226[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ip.r(I[II)Z")
    public boolean method3891(int arg0, int[] arg1) {
        if (this.field3220[arg0] == null) {
            return false;
        }
        int var3 = this.field3214[arg0];
        int[] var4 = this.field3215[arg0];
        Object[] var5 = this.field3226[arg0];
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
            var8 = class177.method2890(this.field3220[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2992(arg1, 5, var9.field2389.length);
        } else {
            var8 = class177.method2890(this.field3220[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3197(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class174.field2388[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class174.field2388[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class153.method3195(var43, var21 + var25 + "," + this.field3212[arg0] + "," + this.field3221);
        }
        if (this.field3222) {
            this.field3220[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class174 var31 = new class174(var10);
            int[] var32 = new int[var3];
            var31.field2390 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method3131();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field2390 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method3131();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field3223) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class177.method847(var36[var42], false);
                }
            }
        } else if (this.field3223) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method847(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ip.m(Ljava/lang/String;I)I")
    public int method3955(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3216.method3344(class271.method4596(var2));
    }

    @ObfuscatedName("ip.l(ILjava/lang/String;B)I")
    public int method3893(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3217[arg0].method3344(class271.method4596(var3));
    }

    @ObfuscatedName("ip.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3894(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3216.method3344(class271.method4596(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3217[var5].method3344(class271.method4596(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ip.ap(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3951(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3216.method3344(class271.method4596(var3));
        int var6 = this.field3217[var5].method3344(class271.method4596(var4));
        return this.method3876(var5, var6);
    }

    @ObfuscatedName("ip.af(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3896(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3216.method3344(class271.method4596(var3));
        int var6 = this.field3217[var5].method3344(class271.method4596(var4));
        return this.method3878(var5, var6);
    }

    @ObfuscatedName("ip.aa(Ljava/lang/String;B)Z")
    public boolean method3897(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3216.method3344(class271.method4596(var2));
        return this.method3879(var3);
    }

    @ObfuscatedName("ip.ay(Ljava/lang/String;I)V")
    public void method3898(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3216.method3344(class271.method4596(var2));
        if (var3 >= 0) {
            this.method3953(var3);
        }
    }

    @ObfuscatedName("ip.aw(Ljava/lang/String;I)I")
    public int method3899(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3216.method3344(class271.method4596(var2));
        return this.method3881(var3);
    }

    @ObfuscatedName("fb.az([BI)[B")
    public static final byte[] method3197(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2971();
        int var3 = var1.method3131();
        if (var3 < 0 || !(field3224 == 0 || var3 <= field3224)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2983(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3131();
            if (var5 < 0 || field3224 != 0 && var5 > field3224) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2912(var6, var5, arg0, var3, 9);
            } else {
                field3211.method2905(var1, var6);
            }
            return var6;
        }
    }
}
