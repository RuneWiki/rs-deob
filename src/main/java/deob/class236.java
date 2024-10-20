package deob;

@ObfuscatedName("il")
public abstract class class236 {

    @ObfuscatedName("il.p")
    public int field3233;

    @ObfuscatedName("il.m")
    public int[] field3237;

    @ObfuscatedName("il.e")
    public int[] field3230;

    @ObfuscatedName("il.t")
    public class188 field3224;

    @ObfuscatedName("il.w")
    public int[] field3228;

    @ObfuscatedName("il.z")
    public int[] field3226;

    @ObfuscatedName("il.j")
    public int[] field3227;

    @ObfuscatedName("il.i")
    public int[][] field3236;

    @ObfuscatedName("il.f")
    public int[][] field3229;

    @ObfuscatedName("il.c")
    public class188[] field3225;

    @ObfuscatedName("il.o")
    public Object[] field3231;

    @ObfuscatedName("il.q")
    public Object[][] field3232;

    @ObfuscatedName("il.n")
    public static class167 field3235 = new class167();

    @ObfuscatedName("il.a")
    public int field3234;

    @ObfuscatedName("il.g")
    public boolean field3239;

    @ObfuscatedName("il.v")
    public boolean field3221;

    @ObfuscatedName("il.s")
    public static int field3223 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3239 = arg0;
        this.field3221 = arg1;
    }

    @ObfuscatedName("il.p([BI)V")
    public void method3702(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class174.field2407[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3234 = var5;
        class174 var8 = new class174(method3687(arg0));
        int var9 = var8.method2810();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2803();
        }
        int var10 = var8.method2810();
        if (var9 >= 7) {
            this.field3233 = var8.method2931();
        } else {
            this.field3233 = var8.method2824();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3237 = new int[this.field3233];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3233; var13++) {
                this.field3237[var13] = var11 += var8.method2931();
                if (this.field3237[var13] > var12) {
                    var12 = this.field3237[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3233; var14++) {
                this.field3237[var14] = var11 += var8.method2824();
                if (this.field3237[var14] > var12) {
                    var12 = this.field3237[var14];
                }
            }
        }
        this.field3228 = new int[var12 + 1];
        this.field3226 = new int[var12 + 1];
        this.field3227 = new int[var12 + 1];
        this.field3236 = new int[var12 + 1][];
        this.field3231 = new Object[var12 + 1];
        this.field3232 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3230 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3233; var15++) {
                this.field3230[this.field3237[var15]] = var8.method2803();
            }
            this.field3224 = new class188(this.field3230);
        }
        for (int var16 = 0; var16 < this.field3233; var16++) {
            this.field3228[this.field3237[var16]] = var8.method2803();
        }
        for (int var17 = 0; var17 < this.field3233; var17++) {
            this.field3226[this.field3237[var17]] = var8.method2803();
        }
        for (int var18 = 0; var18 < this.field3233; var18++) {
            this.field3227[this.field3237[var18]] = var8.method2824();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3233; var19++) {
                int var20 = this.field3237[var19];
                int var21 = this.field3227[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3236[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3236[var20][var24] = var22 += var8.method2931();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3232[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3233; var26++) {
                int var27 = this.field3237[var26];
                int var28 = this.field3227[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3236[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3236[var27][var31] = var29 += var8.method2824();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3232[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3229 = new int[var12 + 1][];
        this.field3225 = new class188[var12 + 1];
        for (int var33 = 0; var33 < this.field3233; var33++) {
            int var34 = this.field3237[var33];
            int var35 = this.field3227[var34];
            this.field3229[var34] = new int[this.field3232[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3229[var34][this.field3236[var34][var36]] = var8.method2803();
            }
            this.field3225[var34] = new class188(this.field3229[var34]);
        }
    }

    @ObfuscatedName("il.m(II)V")
    public void method3703(int arg0) {
    }

    @ObfuscatedName("il.e(III)[B")
    public byte[] method3720(int arg0, int arg1) {
        return this.method3705(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("il.t(II[II)[B")
    public byte[] method3705(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3232.length || this.field3232[arg0] == null || arg1 < 0 || arg1 >= this.field3232[arg0].length) {
            return null;
        }
        if (this.field3232[arg0][arg1] == null) {
            boolean var4 = this.method3719(arg0, arg2);
            if (!var4) {
                this.method3713(arg0);
                boolean var5 = this.method3719(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method3688(this.field3232[arg0][arg1], false);
        if (this.field3221) {
            this.field3232[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("il.w(III)Z")
    public boolean method3706(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3232.length || this.field3232[arg0] == null || arg1 < 0 || arg1 >= this.field3232[arg0].length) {
            return false;
        } else if (this.field3232[arg0][arg1] != null) {
            return true;
        } else if (this.field3231[arg0] == null) {
            this.method3713(arg0);
            return this.field3231[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("il.z(IB)Z")
    public boolean method3707(int arg0) {
        if (this.field3231[arg0] == null) {
            this.method3713(arg0);
            return this.field3231[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("il.j(B)Z")
    public boolean method3708() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3237.length; var2++) {
            int var3 = this.field3237[var2];
            if (this.field3231[var3] == null) {
                this.method3713(var3);
                if (this.field3231[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("il.c(II)I")
    public int method3709(int arg0) {
        return this.field3231[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("il.o(II)[B")
    public byte[] method3710(int arg0) {
        if (this.field3232.length == 1) {
            return this.method3720(0, arg0);
        } else if (this.field3232[arg0].length == 1) {
            return this.method3720(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("il.q(III)[B")
    public byte[] method3711(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3232.length || this.field3232[arg0] == null || arg1 < 0 || arg1 >= this.field3232[arg0].length) {
            return null;
        }
        if (this.field3232[arg0][arg1] == null) {
            boolean var3 = this.method3719(arg0, (int[]) null);
            if (!var3) {
                this.method3713(arg0);
                boolean var4 = this.method3719(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method3688(this.field3232[arg0][arg1], false);
    }

    @ObfuscatedName("il.n(IB)[B")
    public byte[] method3712(int arg0) {
        if (this.field3232.length == 1) {
            return this.method3711(0, arg0);
        } else if (this.field3232[arg0].length == 1) {
            return this.method3711(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("il.a(II)V")
    public void method3713(int arg0) {
    }

    @ObfuscatedName("il.g(IS)[I")
    public int[] method3714(int arg0) {
        return this.field3236[arg0];
    }

    @ObfuscatedName("il.v(II)I")
    public int method3784(int arg0) {
        return this.field3232[arg0].length;
    }

    @ObfuscatedName("il.s(B)I")
    public int method3716() {
        return this.field3232.length;
    }

    @ObfuscatedName("il.k(II)V")
    public void method3752(int arg0) {
        for (int var2 = 0; var2 < this.field3232[arg0].length; var2++) {
            this.field3232[arg0][var2] = null;
        }
    }

    @ObfuscatedName("il.r(S)V")
    public void method3718() {
        for (int var1 = 0; var1 < this.field3232.length; var1++) {
            if (this.field3232[var1] != null) {
                for (int var2 = 0; var2 < this.field3232[var1].length; var2++) {
                    this.field3232[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("il.l(I[IB)Z")
    public boolean method3719(int arg0, int[] arg1) {
        if (this.field3231[arg0] == null) {
            return false;
        }
        int var3 = this.field3227[arg0];
        int[] var4 = this.field3236[arg0];
        Object[] var5 = this.field3232[arg0];
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
            var8 = class177.method3688(this.field3231[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2830(arg1, 5, var9.field2415.length);
        } else {
            var8 = class177.method3688(this.field3231[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3687(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class174.field2407[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            throw class153.method2652(var35, var13 + var17 + "," + class174.method3097(var8, var8.length - 2) + "," + this.field3228[arg0] + "," + this.field3234);
        }
        if (this.field3239) {
            this.field3231[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class174 var23 = new class174(var10);
            int[] var24 = new int[var3];
            var23.field2408 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2803();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2408 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2803();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3221) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class177.method157(var28[var34], false);
                }
            }
        } else if (this.field3221) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method157(var10, false);
        }
        return true;
    }

    @ObfuscatedName("il.d(Ljava/lang/String;I)I")
    public int method3764(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3224.method3168(class271.method971(var2));
    }

    @ObfuscatedName("il.x(ILjava/lang/String;B)I")
    public int method3729(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3225[arg0].method3168(class271.method971(var3));
    }

    @ObfuscatedName("il.b(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3722(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3224.method3168(class271.method971(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3225[var5].method3168(class271.method971(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("il.y(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3723(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3224.method3168(class271.method971(var3));
        int var6 = this.field3225[var5].method3168(class271.method971(var4));
        return this.method3720(var5, var6);
    }

    @ObfuscatedName("il.u(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3735(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3224.method3168(class271.method971(var3));
        int var6 = this.field3225[var5].method3168(class271.method971(var4));
        return this.method3706(var5, var6);
    }

    @ObfuscatedName("il.av(Ljava/lang/String;I)Z")
    public boolean method3725(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3224.method3168(class271.method971(var2));
        return this.method3707(var3);
    }

    @ObfuscatedName("il.ax(Ljava/lang/String;I)V")
    public void method3717(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3224.method3168(class271.method971(var2));
        if (var3 >= 0) {
            this.method3703(var3);
        }
    }

    @ObfuscatedName("il.af(Ljava/lang/String;B)I")
    public int method3727(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3224.method3168(class271.method971(var2));
        return this.method3709(var3);
    }

    @ObfuscatedName("hd.ae([BI)[B")
    public static final byte[] method3687(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2810();
        int var3 = var1.method2803();
        if (var3 < 0 || !(field3223 == 0 || var3 <= field3223)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3022(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2803();
            if (var5 < 0 || field3223 != 0 && var5 > field3223) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2753(var6, var5, arg0, var3, 9);
            } else {
                field3235.method2748(var1, var6);
            }
            return var6;
        }
    }
}
