package deob;

@ObfuscatedName("ip")
public abstract class class236 {

    @ObfuscatedName("ip.c")
    public int field3183;

    @ObfuscatedName("ip.o")
    public int[] field3184;

    @ObfuscatedName("ip.i")
    public int[] field3195;

    @ObfuscatedName("ip.u")
    public class188 field3186;

    @ObfuscatedName("ip.g")
    public int[] field3187;

    @ObfuscatedName("ip.m")
    public int[] field3188;

    @ObfuscatedName("ip.s")
    public int[] field3189;

    @ObfuscatedName("ip.x")
    public int[][] field3190;

    @ObfuscatedName("ip.p")
    public int[][] field3185;

    @ObfuscatedName("ip.k")
    public class188[] field3192;

    @ObfuscatedName("ip.r")
    public Object[] field3193;

    @ObfuscatedName("ip.w")
    public Object[][] field3197;

    @ObfuscatedName("ip.v")
    public static class167 field3202 = new class167();

    @ObfuscatedName("ip.h")
    public int field3191;

    @ObfuscatedName("ip.t")
    public boolean field3196;

    @ObfuscatedName("ip.a")
    public boolean field3198;

    @ObfuscatedName("ip.e")
    public static int field3199 = 0;

    public class236(boolean arg0, boolean arg1) {
        this.field3196 = arg0;
        this.field3198 = arg1;
    }

    @ObfuscatedName("ip.c([BB)V")
    public void method3810(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class174.field2354[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3191 = var5;
        class174 var8 = new class174(method2110(arg0));
        int var9 = var8.method2843();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2987();
        }
        int var10 = var8.method2843();
        if (var9 >= 7) {
            this.field3183 = var8.method2920();
        } else {
            this.field3183 = var8.method2861();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3184 = new int[this.field3183];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3183; var13++) {
                this.field3184[var13] = var11 += var8.method2920();
                if (this.field3184[var13] > var12) {
                    var12 = this.field3184[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3183; var14++) {
                this.field3184[var14] = var11 += var8.method2861();
                if (this.field3184[var14] > var12) {
                    var12 = this.field3184[var14];
                }
            }
        }
        this.field3187 = new int[var12 + 1];
        this.field3188 = new int[var12 + 1];
        this.field3189 = new int[var12 + 1];
        this.field3190 = new int[var12 + 1][];
        this.field3193 = new Object[var12 + 1];
        this.field3197 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3195 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3183; var15++) {
                this.field3195[this.field3184[var15]] = var8.method2987();
            }
            this.field3186 = new class188(this.field3195);
        }
        for (int var16 = 0; var16 < this.field3183; var16++) {
            this.field3187[this.field3184[var16]] = var8.method2987();
        }
        for (int var17 = 0; var17 < this.field3183; var17++) {
            this.field3188[this.field3184[var17]] = var8.method2987();
        }
        for (int var18 = 0; var18 < this.field3183; var18++) {
            this.field3189[this.field3184[var18]] = var8.method2861();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3183; var19++) {
                int var20 = this.field3184[var19];
                int var21 = this.field3189[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3190[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3190[var20][var24] = var22 += var8.method2920();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3197[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3183; var26++) {
                int var27 = this.field3184[var26];
                int var28 = this.field3189[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3190[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3190[var27][var31] = var29 += var8.method2861();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3197[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3185 = new int[var12 + 1][];
        this.field3192 = new class188[var12 + 1];
        for (int var33 = 0; var33 < this.field3183; var33++) {
            int var34 = this.field3184[var33];
            int var35 = this.field3189[var34];
            this.field3185[var34] = new int[this.field3197[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3185[var34][this.field3190[var34][var36]] = var8.method2987();
            }
            this.field3192[var34] = new class188(this.field3185[var34]);
        }
    }

    @ObfuscatedName("ip.o(IB)V")
    public void method3784(int arg0) {
    }

    @ObfuscatedName("ip.i(III)[B")
    public byte[] method3741(int arg0, int arg1) {
        return this.method3715(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ip.u(II[II)[B")
    public byte[] method3715(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return null;
        }
        if (this.field3197[arg0][arg1] == null) {
            boolean var4 = this.method3729(arg0, arg2);
            if (!var4) {
                this.method3723(arg0);
                boolean var5 = this.method3729(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class177.method233(this.field3197[arg0][arg1], false);
        if (this.field3198) {
            this.field3197[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ip.g(III)Z")
    public boolean method3716(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return false;
        } else if (this.field3197[arg0][arg1] != null) {
            return true;
        } else if (this.field3193[arg0] == null) {
            this.method3723(arg0);
            return this.field3193[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ip.m(II)Z")
    public boolean method3717(int arg0) {
        if (this.field3193[arg0] == null) {
            this.method3723(arg0);
            return this.field3193[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ip.s(I)Z")
    public boolean method3718() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3184.length; var2++) {
            int var3 = this.field3184[var2];
            if (this.field3193[var3] == null) {
                this.method3723(var3);
                if (this.field3193[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ip.x(IB)I")
    public int method3765(int arg0) {
        return this.field3193[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ip.p(II)[B")
    public byte[] method3720(int arg0) {
        if (this.field3197.length == 1) {
            return this.method3741(0, arg0);
        } else if (this.field3197[arg0].length == 1) {
            return this.method3741(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ip.k(IIB)[B")
    public byte[] method3721(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3197.length || this.field3197[arg0] == null || arg1 < 0 || arg1 >= this.field3197[arg0].length) {
            return null;
        }
        if (this.field3197[arg0][arg1] == null) {
            boolean var3 = this.method3729(arg0, (int[]) null);
            if (!var3) {
                this.method3723(arg0);
                boolean var4 = this.method3729(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class177.method233(this.field3197[arg0][arg1], false);
    }

    @ObfuscatedName("ip.r(IB)[B")
    public byte[] method3722(int arg0) {
        if (this.field3197.length == 1) {
            return this.method3721(0, arg0);
        } else if (this.field3197[arg0].length == 1) {
            return this.method3721(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ip.w(IB)V")
    public void method3723(int arg0) {
    }

    @ObfuscatedName("ip.v(II)[I")
    public int[] method3792(int arg0) {
        return this.field3190[arg0];
    }

    @ObfuscatedName("ip.h(IB)I")
    public int method3739(int arg0) {
        return this.field3197[arg0].length;
    }

    @ObfuscatedName("ip.t(I)I")
    public int method3726() {
        return this.field3197.length;
    }

    @ObfuscatedName("ip.l(II)V")
    public void method3727(int arg0) {
        for (int var2 = 0; var2 < this.field3197[arg0].length; var2++) {
            this.field3197[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ip.q(I)V")
    public void method3728() {
        for (int var1 = 0; var1 < this.field3197.length; var1++) {
            if (this.field3197[var1] != null) {
                for (int var2 = 0; var2 < this.field3197[var1].length; var2++) {
                    this.field3197[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ip.f(I[II)Z")
    public boolean method3729(int arg0, int[] arg1) {
        if (this.field3193[arg0] == null) {
            return false;
        }
        int var3 = this.field3189[arg0];
        int[] var4 = this.field3190[arg0];
        Object[] var5 = this.field3197[arg0];
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
            var8 = class177.method233(this.field3193[arg0], true);
            class174 var9 = new class174(var8);
            var9.method2879(arg1, 5, var9.field2355.length);
        } else {
            var8 = class177.method233(this.field3193[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2110(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class174.field2354[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class174.field2354[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class153.method2823(var42, var20 + var24 + "," + this.field3187[arg0] + "," + this.field3191);
        }
        if (this.field3196) {
            this.field3193[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class174 var30 = new class174(var10);
            int[] var31 = new int[var3];
            var30.field2357 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2987();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2357 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2987();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3198) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class177.method2607(var35[var41], false);
                }
            }
        } else if (this.field3198) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class177.method2607(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ip.j(Ljava/lang/String;I)I")
    public int method3730(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3186.method3208(class271.method4198(var2));
    }

    @ObfuscatedName("ip.n(ILjava/lang/String;B)I")
    public int method3731(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3192[arg0].method3208(class271.method4198(var3));
    }

    @ObfuscatedName("ip.z(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3732(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3186.method3208(class271.method4198(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3192[var5].method3208(class271.method4198(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ip.ap(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3733(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3186.method3208(class271.method4198(var3));
        int var6 = this.field3192[var5].method3208(class271.method4198(var4));
        return this.method3741(var5, var6);
    }

    @ObfuscatedName("ip.aj(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3734(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3186.method3208(class271.method4198(var3));
        int var6 = this.field3192[var5].method3208(class271.method4198(var4));
        return this.method3716(var5, var6);
    }

    @ObfuscatedName("ip.am(Ljava/lang/String;I)Z")
    public boolean method3735(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3186.method3208(class271.method4198(var2));
        return this.method3717(var3);
    }

    @ObfuscatedName("ip.ag(Ljava/lang/String;I)V")
    public void method3736(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3186.method3208(class271.method4198(var2));
        if (var3 >= 0) {
            this.method3784(var3);
        }
    }

    @ObfuscatedName("ip.av(Ljava/lang/String;I)I")
    public int method3737(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3186.method3208(class271.method4198(var2));
        return this.method3765(var3);
    }

    @ObfuscatedName("dx.al([BB)[B")
    public static final byte[] method2110(byte[] arg0) {
        class174 var1 = new class174(arg0);
        int var2 = var1.method2843();
        int var3 = var1.method2987();
        if (var3 < 0 || !(field3199 == 0 || var3 <= field3199)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2870(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2987();
            if (var5 < 0 || field3199 != 0 && var5 > field3199) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class168.method2791(var6, var5, arg0, var3, 9);
            } else {
                field3202.method2786(var1, var6);
            }
            return var6;
        }
    }
}
