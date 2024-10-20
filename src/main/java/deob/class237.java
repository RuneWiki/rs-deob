package deob;

@ObfuscatedName("it")
public abstract class class237 {

    @ObfuscatedName("it.e")
    public int field3212;

    @ObfuscatedName("it.n")
    public int[] field3197;

    @ObfuscatedName("it.g")
    public int[] field3206;

    @ObfuscatedName("it.y")
    public class189 field3199;

    @ObfuscatedName("it.w")
    public int[] field3198;

    @ObfuscatedName("it.k")
    public int[] field3201;

    @ObfuscatedName("it.v")
    public int[] field3196;

    @ObfuscatedName("it.z")
    public int[][] field3203;

    @ObfuscatedName("it.r")
    public int[][] field3204;

    @ObfuscatedName("it.u")
    public class189[] field3205;

    @ObfuscatedName("it.d")
    public Object[] field3200;

    @ObfuscatedName("it.o")
    public Object[][] field3210;

    @ObfuscatedName("it.l")
    public static class168 field3208 = new class168();

    @ObfuscatedName("it.h")
    public int field3209;

    @ObfuscatedName("it.s")
    public boolean field3207;

    @ObfuscatedName("it.c")
    public boolean field3211;

    @ObfuscatedName("it.m")
    public static int field3202 = 0;

    public class237(boolean arg0, boolean arg1) {
        this.field3207 = arg0;
        this.field3211 = arg1;
    }

    @ObfuscatedName("it.e([BB)V")
    public void method3866(byte[] arg0) {
        this.field3209 = class175.method661(arg0, arg0.length);
        class175 var2 = new class175(Statics.method2904(arg0));
        int var3 = var2.method2928();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2933();
        }
        int var4 = var2.method2928();
        if (var3 >= 7) {
            this.field3212 = var2.method2942();
        } else {
            this.field3212 = var2.method3091();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3197 = new int[this.field3212];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3212; var7++) {
                this.field3197[var7] = var5 += var2.method2942();
                if (this.field3197[var7] > var6) {
                    var6 = this.field3197[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3212; var8++) {
                this.field3197[var8] = var5 += var2.method3091();
                if (this.field3197[var8] > var6) {
                    var6 = this.field3197[var8];
                }
            }
        }
        this.field3198 = new int[var6 + 1];
        this.field3201 = new int[var6 + 1];
        this.field3196 = new int[var6 + 1];
        this.field3203 = new int[var6 + 1][];
        this.field3200 = new Object[var6 + 1];
        this.field3210 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3206 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3212; var9++) {
                this.field3206[this.field3197[var9]] = var2.method2933();
            }
            this.field3199 = new class189(this.field3206);
        }
        for (int var10 = 0; var10 < this.field3212; var10++) {
            this.field3198[this.field3197[var10]] = var2.method2933();
        }
        for (int var11 = 0; var11 < this.field3212; var11++) {
            this.field3201[this.field3197[var11]] = var2.method2933();
        }
        for (int var12 = 0; var12 < this.field3212; var12++) {
            this.field3196[this.field3197[var12]] = var2.method3091();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3212; var13++) {
                int var14 = this.field3197[var13];
                int var15 = this.field3196[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3203[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3203[var14][var18] = var16 += var2.method2942();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3210[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3212; var20++) {
                int var21 = this.field3197[var20];
                int var22 = this.field3196[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3203[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3203[var21][var25] = var23 += var2.method3091();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3210[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3204 = new int[var6 + 1][];
        this.field3205 = new class189[var6 + 1];
        for (int var27 = 0; var27 < this.field3212; var27++) {
            int var28 = this.field3197[var27];
            int var29 = this.field3196[var28];
            this.field3204[var28] = new int[this.field3210[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3204[var28][this.field3203[var28][var30]] = var2.method2933();
            }
            this.field3205[var28] = new class189(this.field3204[var28]);
        }
    }

    @ObfuscatedName("it.n(II)V")
    public void method3875(int arg0) {
    }

    @ObfuscatedName("it.g(III)[B")
    public byte[] method3817(int arg0, int arg1) {
        return this.method3856(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("it.y(II[IB)[B")
    public byte[] method3856(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return null;
        }
        if (this.field3210[arg0][arg1] == null) {
            boolean var4 = this.method3832(arg0, arg2);
            if (!var4) {
                this.method3825(arg0);
                boolean var5 = this.method3832(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class178.method2312(this.field3210[arg0][arg1], false);
        if (this.field3211) {
            this.field3210[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("it.w(IIB)Z")
    public boolean method3819(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return false;
        } else if (this.field3210[arg0][arg1] != null) {
            return true;
        } else if (this.field3200[arg0] == null) {
            this.method3825(arg0);
            return this.field3200[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("it.k(IB)Z")
    public boolean method3838(int arg0) {
        if (this.field3200[arg0] == null) {
            this.method3825(arg0);
            return this.field3200[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("it.v(I)Z")
    public boolean method3833() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3197.length; var2++) {
            int var3 = this.field3197[var2];
            if (this.field3200[var3] == null) {
                this.method3825(var3);
                if (this.field3200[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("it.z(II)I")
    public int method3822(int arg0) {
        return this.field3200[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("it.r(II)[B")
    public byte[] method3823(int arg0) {
        if (this.field3210.length == 1) {
            return this.method3817(0, arg0);
        } else if (this.field3210[arg0].length == 1) {
            return this.method3817(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("it.u(IIB)[B")
    public byte[] method3814(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3210.length || this.field3210[arg0] == null || arg1 < 0 || arg1 >= this.field3210[arg0].length) {
            return null;
        }
        if (this.field3210[arg0][arg1] == null) {
            boolean var3 = this.method3832(arg0, (int[]) null);
            if (!var3) {
                this.method3825(arg0);
                boolean var4 = this.method3832(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class178.method2312(this.field3210[arg0][arg1], false);
    }

    @ObfuscatedName("it.d(II)[B")
    public byte[] method3848(int arg0) {
        if (this.field3210.length == 1) {
            return this.method3814(0, arg0);
        } else if (this.field3210[arg0].length == 1) {
            return this.method3814(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("it.o(II)V")
    public void method3825(int arg0) {
    }

    @ObfuscatedName("it.s(II)[I")
    public int[] method3827(int arg0) {
        return this.field3203[arg0];
    }

    @ObfuscatedName("it.c(II)I")
    public int method3828(int arg0) {
        return this.field3210[arg0].length;
    }

    @ObfuscatedName("it.m(B)I")
    public int method3896() {
        return this.field3210.length;
    }

    @ObfuscatedName("it.a(II)V")
    public void method3862(int arg0) {
        for (int var2 = 0; var2 < this.field3210[arg0].length; var2++) {
            this.field3210[arg0][var2] = null;
        }
    }

    @ObfuscatedName("it.t(I)V")
    public void method3831() {
        for (int var1 = 0; var1 < this.field3210.length; var1++) {
            if (this.field3210[var1] != null) {
                for (int var2 = 0; var2 < this.field3210[var1].length; var2++) {
                    this.field3210[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("it.p(I[IB)Z")
    public boolean method3832(int arg0, int[] arg1) {
        if (this.field3200[arg0] == null) {
            return false;
        }
        int var3 = this.field3196[arg0];
        int[] var4 = this.field3203[arg0];
        Object[] var5 = this.field3210[arg0];
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
            var8 = class178.method2312(this.field3200[arg0], true);
            class175 var9 = new class175(var8);
            var9.method2948(arg1, 5, var9.field2376.length);
        } else {
            var8 = class178.method2312(this.field3200[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method2904(var8);
        } catch (RuntimeException var27) {
            throw class154.method224(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class175.method661(var8, var8.length) + "," + class175.method661(var8, var8.length - 2) + "," + this.field3198[arg0] + "," + this.field3209);
        }
        if (this.field3207) {
            this.field3200[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class175 var15 = new class175(var10);
            int[] var16 = new int[var3];
            var15.field2381 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2933();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2381 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2933();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3211) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = Statics.method1602(var20[var26], false);
                }
            }
        } else if (this.field3211) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = Statics.method1602(var10, false);
        }
        return true;
    }

    @ObfuscatedName("it.f(Ljava/lang/String;B)I")
    public int method3829(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3199.method3267(class272.method3705(var2));
    }

    @ObfuscatedName("it.x(ILjava/lang/String;I)I")
    public int method3834(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3205[arg0].method3267(class272.method3705(var3));
    }

    @ObfuscatedName("it.q(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3835(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3199.method3267(class272.method3705(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3205[var5].method3267(class272.method3705(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("it.ag(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3846(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3199.method3267(class272.method3705(var3));
        int var6 = this.field3205[var5].method3267(class272.method3705(var4));
        return this.method3817(var5, var6);
    }

    @ObfuscatedName("it.ay(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3837(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3199.method3267(class272.method3705(var3));
        int var6 = this.field3205[var5].method3267(class272.method3705(var4));
        return this.method3819(var5, var6);
    }

    @ObfuscatedName("it.au(Ljava/lang/String;I)Z")
    public boolean method3870(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3199.method3267(class272.method3705(var2));
        return this.method3838(var3);
    }

    @ObfuscatedName("it.ah(Ljava/lang/String;I)V")
    public void method3839(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3199.method3267(class272.method3705(var2));
        if (var3 >= 0) {
            this.method3875(var3);
        }
    }

    @ObfuscatedName("it.ao(Ljava/lang/String;I)I")
    public int method3840(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3199.method3267(class272.method3705(var2));
        return this.method3822(var3);
    }
}
