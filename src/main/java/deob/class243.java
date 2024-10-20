package deob;

@ObfuscatedName("ik")
public abstract class class243 {

    @ObfuscatedName("ik.m")
    public int field3293;

    @ObfuscatedName("ik.p")
    public int[] field3284;

    @ObfuscatedName("ik.i")
    public int[] field3278;

    @ObfuscatedName("ik.j")
    public class195 field3280;

    @ObfuscatedName("ik.v")
    public int[] field3281;

    @ObfuscatedName("ik.x")
    public int[] field3282;

    @ObfuscatedName("ik.e")
    public int[] field3283;

    @ObfuscatedName("ik.l")
    public int[][] field3287;

    @ObfuscatedName("ik.b")
    public int[][] field3285;

    @ObfuscatedName("ik.n")
    public class195[] field3286;

    @ObfuscatedName("ik.c")
    public Object[] field3277;

    @ObfuscatedName("ik.a")
    public Object[][] field3288;

    @ObfuscatedName("ik.y")
    public static class174 field3289 = new class174();

    @ObfuscatedName("ik.w")
    public int field3279;

    @ObfuscatedName("ik.k")
    public boolean field3291;

    @ObfuscatedName("ik.t")
    public boolean field3292;

    @ObfuscatedName("ik.h")
    public static int field3290 = 0;

    public class243(boolean arg0, boolean arg1) {
        this.field3291 = arg0;
        this.field3292 = arg1;
    }

    @ObfuscatedName("ik.m([BI)V")
    public void method3928(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class181.field2496[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3279 = var5;
        class181 var8 = new class181(method1769(arg0));
        int var9 = var8.method3012();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3017();
        }
        int var10 = var8.method3012();
        if (var9 >= 7) {
            this.field3293 = var8.method3027();
        } else {
            this.field3293 = var8.method3009();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3284 = new int[this.field3293];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3293; var13++) {
                this.field3284[var13] = var11 += var8.method3027();
                if (this.field3284[var13] > var12) {
                    var12 = this.field3284[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3293; var14++) {
                this.field3284[var14] = var11 += var8.method3009();
                if (this.field3284[var14] > var12) {
                    var12 = this.field3284[var14];
                }
            }
        }
        this.field3281 = new int[var12 + 1];
        this.field3282 = new int[var12 + 1];
        this.field3283 = new int[var12 + 1];
        this.field3287 = new int[var12 + 1][];
        this.field3277 = new Object[var12 + 1];
        this.field3288 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3278 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3293; var15++) {
                this.field3278[this.field3284[var15]] = var8.method3017();
            }
            this.field3280 = new class195(this.field3278);
        }
        for (int var16 = 0; var16 < this.field3293; var16++) {
            this.field3281[this.field3284[var16]] = var8.method3017();
        }
        for (int var17 = 0; var17 < this.field3293; var17++) {
            this.field3282[this.field3284[var17]] = var8.method3017();
        }
        for (int var18 = 0; var18 < this.field3293; var18++) {
            this.field3283[this.field3284[var18]] = var8.method3009();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3293; var19++) {
                int var20 = this.field3284[var19];
                int var21 = this.field3283[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3287[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3287[var20][var24] = var22 += var8.method3027();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3288[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3293; var26++) {
                int var27 = this.field3284[var26];
                int var28 = this.field3283[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3287[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3287[var27][var31] = var29 += var8.method3009();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3288[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3285 = new int[var12 + 1][];
        this.field3286 = new class195[var12 + 1];
        for (int var33 = 0; var33 < this.field3293; var33++) {
            int var34 = this.field3284[var33];
            int var35 = this.field3283[var34];
            this.field3285[var34] = new int[this.field3288[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3285[var34][this.field3287[var34][var36]] = var8.method3017();
            }
            this.field3286[var34] = new class195(this.field3285[var34]);
        }
    }

    @ObfuscatedName("ik.p(II)V")
    public void method3929(int arg0) {
    }

    @ObfuscatedName("ik.i(III)[B")
    public byte[] method3930(int arg0, int arg1) {
        return this.method3931(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ik.j(II[II)[B")
    public byte[] method3931(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3288.length || this.field3288[arg0] == null || arg1 < 0 || arg1 >= this.field3288[arg0].length) {
            return null;
        }
        if (this.field3288[arg0][arg1] == null) {
            boolean var4 = this.method3945(arg0, arg2);
            if (!var4) {
                this.method3939(arg0);
                boolean var5 = this.method3945(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class184.method2774(this.field3288[arg0][arg1], false);
        if (this.field3292) {
            this.field3288[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ik.v(IIS)Z")
    public boolean method3932(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3288.length || this.field3288[arg0] == null || arg1 < 0 || arg1 >= this.field3288[arg0].length) {
            return false;
        } else if (this.field3288[arg0][arg1] != null) {
            return true;
        } else if (this.field3277[arg0] == null) {
            this.method3939(arg0);
            return this.field3277[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.x(II)Z")
    public boolean method3998(int arg0) {
        if (this.field3277[arg0] == null) {
            this.method3939(arg0);
            return this.field3277[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ik.e(I)Z")
    public boolean method3934() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3284.length; var2++) {
            int var3 = this.field3284[var2];
            if (this.field3277[var3] == null) {
                this.method3939(var3);
                if (this.field3277[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ik.l(II)I")
    public int method3935(int arg0) {
        return this.field3277[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ik.b(II)[B")
    public byte[] method4026(int arg0) {
        if (this.field3288.length == 1) {
            return this.method3930(0, arg0);
        } else if (this.field3288[arg0].length == 1) {
            return this.method3930(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.n(IIB)[B")
    public byte[] method3937(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3288.length || this.field3288[arg0] == null || arg1 < 0 || arg1 >= this.field3288[arg0].length) {
            return null;
        }
        if (this.field3288[arg0][arg1] == null) {
            boolean var3 = this.method3945(arg0, (int[]) null);
            if (!var3) {
                this.method3939(arg0);
                boolean var4 = this.method3945(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class184.method2774(this.field3288[arg0][arg1], false);
    }

    @ObfuscatedName("ik.c(IB)[B")
    public byte[] method3938(int arg0) {
        if (this.field3288.length == 1) {
            return this.method3937(0, arg0);
        } else if (this.field3288[arg0].length == 1) {
            return this.method3937(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ik.a(IB)V")
    public void method3939(int arg0) {
    }

    @ObfuscatedName("ik.y(II)[I")
    public int[] method3936(int arg0) {
        return this.field3287[arg0];
    }

    @ObfuscatedName("ik.w(IB)I")
    public int method3941(int arg0) {
        return this.field3288[arg0].length;
    }

    @ObfuscatedName("ik.k(B)I")
    public int method3942() {
        return this.field3288.length;
    }

    @ObfuscatedName("ik.t(IB)V")
    public void method3943(int arg0) {
        for (int var2 = 0; var2 < this.field3288[arg0].length; var2++) {
            this.field3288[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ik.h(I)V")
    public void method3944() {
        for (int var1 = 0; var1 < this.field3288.length; var1++) {
            if (this.field3288[var1] != null) {
                for (int var2 = 0; var2 < this.field3288[var1].length; var2++) {
                    this.field3288[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ik.u(I[IB)Z")
    public boolean method3945(int arg0, int[] arg1) {
        if (this.field3277[arg0] == null) {
            return false;
        }
        int var3 = this.field3283[arg0];
        int[] var4 = this.field3287[arg0];
        Object[] var5 = this.field3288[arg0];
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
            var8 = class184.method2774(this.field3277[arg0], true);
            class181 var9 = new class181(var8);
            var9.method3150(arg1, 5, var9.field2499.length);
        } else {
            var8 = class184.method2774(this.field3277[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1769(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class181.field2496[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class181.field2496[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class154.method65(var42, var20 + var24 + "," + this.field3281[arg0] + "," + this.field3279);
        }
        if (this.field3291) {
            this.field3277[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class181 var30 = new class181(var10);
            int[] var31 = new int[var3];
            var30.field2498 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method3017();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2498 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method3017();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3292) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class184.method3244(var35[var41], false);
                }
            }
        } else if (this.field3292) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class184.method3244(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ik.r(Ljava/lang/String;I)I")
    public int method3985(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3280.method3410(class278.method4262(var2));
    }

    @ObfuscatedName("ik.o(ILjava/lang/String;B)I")
    public int method3947(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3286[arg0].method3410(class278.method4262(var3));
    }

    @ObfuscatedName("ik.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3948(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3280.method3410(class278.method4262(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3286[var5].method3410(class278.method4262(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ik.al(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3959(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3280.method3410(class278.method4262(var3));
        int var6 = this.field3286[var5].method3410(class278.method4262(var4));
        return this.method3930(var5, var6);
    }

    @ObfuscatedName("ik.ao(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3946(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3280.method3410(class278.method4262(var3));
        int var6 = this.field3286[var5].method3410(class278.method4262(var4));
        return this.method3932(var5, var6);
    }

    @ObfuscatedName("ik.aq(Ljava/lang/String;I)Z")
    public boolean method3951(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3280.method3410(class278.method4262(var2));
        return this.method3998(var3);
    }

    @ObfuscatedName("ik.ab(Ljava/lang/String;I)V")
    public void method3952(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3280.method3410(class278.method4262(var2));
        if (var3 >= 0) {
            this.method3929(var3);
        }
    }

    @ObfuscatedName("ik.as(Ljava/lang/String;B)I")
    public int method3974(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3280.method3410(class278.method4262(var2));
        return this.method3935(var3);
    }

    @ObfuscatedName("cq.ag([BI)[B")
    public static final byte[] method1769(byte[] arg0) {
        class181 var1 = new class181(arg0);
        int var2 = var1.method3012();
        int var3 = var1.method3017();
        if (var3 < 0 || !(field3290 == 0 || var3 <= field3290)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3024(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3017();
            if (var5 < 0 || field3290 != 0 && var5 > field3290) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class175.method2954(var6, var5, arg0, var3, 9);
            } else {
                field3289.method2946(var1, var6);
            }
            return var6;
        }
    }
}
