package deob;

@ObfuscatedName("is")
public abstract class class250 {

    @ObfuscatedName("is.s")
    public int field3189;

    @ObfuscatedName("is.o")
    public int[] field3203;

    @ObfuscatedName("is.k")
    public int[] field3188;

    @ObfuscatedName("is.u")
    public class201 field3192;

    @ObfuscatedName("is.i")
    public int[] field3190;

    @ObfuscatedName("is.t")
    public int[] field3194;

    @ObfuscatedName("is.p")
    public int[] field3195;

    @ObfuscatedName("is.l")
    public int[][] field3196;

    @ObfuscatedName("is.b")
    public int[][] field3204;

    @ObfuscatedName("is.c")
    public class201[] field3198;

    @ObfuscatedName("is.d")
    public Object[] field3199;

    @ObfuscatedName("is.w")
    public Object[][] field3200;

    @ObfuscatedName("is.a")
    public static class178 field3201 = new class178();

    @ObfuscatedName("is.z")
    public int field3202;

    @ObfuscatedName("is.e")
    public boolean field3197;

    @ObfuscatedName("is.q")
    public boolean field3191;

    @ObfuscatedName("is.j")
    public static int field3205 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3197 = arg0;
        this.field3191 = arg1;
    }

    @ObfuscatedName("is.v([BI)V")
    public void method4268(byte[] arg0) {
        this.field3202 = class185.method471(arg0, arg0.length);
        class185 var2 = new class185(method949(arg0));
        int var3 = var2.method3274();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3279();
        }
        int var4 = var2.method3274();
        if (var3 >= 7) {
            this.field3189 = var2.method3290();
        } else {
            this.field3189 = var2.method3276();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3203 = new int[this.field3189];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3189; var7++) {
                this.field3203[var7] = var5 += var2.method3290();
                if (this.field3203[var7] > var6) {
                    var6 = this.field3203[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3189; var8++) {
                this.field3203[var8] = var5 += var2.method3276();
                if (this.field3203[var8] > var6) {
                    var6 = this.field3203[var8];
                }
            }
        }
        this.field3190 = new int[var6 + 1];
        this.field3194 = new int[var6 + 1];
        this.field3195 = new int[var6 + 1];
        this.field3196 = new int[var6 + 1][];
        this.field3199 = new Object[var6 + 1];
        this.field3200 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3188 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3189; var9++) {
                this.field3188[this.field3203[var9]] = var2.method3279();
            }
            this.field3192 = new class201(this.field3188);
        }
        for (int var10 = 0; var10 < this.field3189; var10++) {
            this.field3190[this.field3203[var10]] = var2.method3279();
        }
        for (int var11 = 0; var11 < this.field3189; var11++) {
            this.field3194[this.field3203[var11]] = var2.method3279();
        }
        for (int var12 = 0; var12 < this.field3189; var12++) {
            this.field3195[this.field3203[var12]] = var2.method3276();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3189; var13++) {
                int var14 = this.field3203[var13];
                int var15 = this.field3195[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3196[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3196[var14][var18] = var16 += var2.method3290();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3200[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3189; var20++) {
                int var21 = this.field3203[var20];
                int var22 = this.field3195[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3196[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3196[var21][var25] = var23 += var2.method3276();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3200[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3204 = new int[var6 + 1][];
        this.field3198 = new class201[var6 + 1];
        for (int var27 = 0; var27 < this.field3189; var27++) {
            int var28 = this.field3203[var27];
            int var29 = this.field3195[var28];
            this.field3204[var28] = new int[this.field3200[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3204[var28][this.field3196[var28][var30]] = var2.method3279();
            }
            this.field3198[var28] = new class201(this.field3204[var28]);
        }
    }

    @ObfuscatedName("is.s(II)V")
    public void method4269(int arg0) {
    }

    @ObfuscatedName("is.o(IIS)[B")
    public byte[] method4270(int arg0, int arg1) {
        return this.method4303(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("is.k(II[II)[B")
    public byte[] method4303(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3200.length || this.field3200[arg0] == null || arg1 < 0 || arg1 >= this.field3200[arg0].length) {
            return null;
        }
        if (this.field3200[arg0][arg1] == null) {
            boolean var4 = this.method4287(arg0, arg2);
            if (!var4) {
                this.method4341(arg0);
                boolean var5 = this.method4287(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method3528(this.field3200[arg0][arg1], false);
        if (this.field3191) {
            this.field3200[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("is.u(III)Z")
    public boolean method4272(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3200.length || this.field3200[arg0] == null || arg1 < 0 || arg1 >= this.field3200[arg0].length) {
            return false;
        } else if (this.field3200[arg0][arg1] != null) {
            return true;
        } else if (this.field3199[arg0] == null) {
            this.method4341(arg0);
            return this.field3199[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.i(IB)Z")
    public boolean method4273(int arg0) {
        if (this.field3200.length == 1) {
            return this.method4272(0, arg0);
        } else if (this.field3200[arg0].length == 1) {
            return this.method4272(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("is.t(II)Z")
    public boolean method4274(int arg0) {
        if (this.field3199[arg0] == null) {
            this.method4341(arg0);
            return this.field3199[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("is.c(I)Z")
    public boolean method4275() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3203.length; var2++) {
            int var3 = this.field3203[var2];
            if (this.field3199[var3] == null) {
                this.method4341(var3);
                if (this.field3199[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("is.w(II)I")
    public int method4276(int arg0) {
        return this.field3199[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("is.a(IB)[B")
    public byte[] method4349(int arg0) {
        if (this.field3200.length == 1) {
            return this.method4270(0, arg0);
        } else if (this.field3200[arg0].length == 1) {
            return this.method4270(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("is.z(III)[B")
    public byte[] method4278(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3200.length || this.field3200[arg0] == null || arg1 < 0 || arg1 >= this.field3200[arg0].length) {
            return null;
        }
        if (this.field3200[arg0][arg1] == null) {
            boolean var3 = this.method4287(arg0, (int[]) null);
            if (!var3) {
                this.method4341(arg0);
                boolean var4 = this.method4287(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method3528(this.field3200[arg0][arg1], false);
    }

    @ObfuscatedName("is.e(II)[B")
    public byte[] method4279(int arg0) {
        if (this.field3200.length == 1) {
            return this.method4278(0, arg0);
        } else if (this.field3200[arg0].length == 1) {
            return this.method4278(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("is.q(II)V")
    public void method4341(int arg0) {
    }

    @ObfuscatedName("is.j(II)[I")
    public int[] method4282(int arg0) {
        return this.field3196[arg0];
    }

    @ObfuscatedName("is.y(II)I")
    public int method4331(int arg0) {
        return this.field3200[arg0].length;
    }

    @ObfuscatedName("is.m(B)I")
    public int method4280() {
        return this.field3200.length;
    }

    @ObfuscatedName("is.h(I)V")
    public void method4284() {
        for (int var1 = 0; var1 < this.field3199.length; var1++) {
            this.field3199[var1] = null;
        }
    }

    @ObfuscatedName("is.x(II)V")
    public void method4285(int arg0) {
        for (int var2 = 0; var2 < this.field3200[arg0].length; var2++) {
            this.field3200[arg0][var2] = null;
        }
    }

    @ObfuscatedName("is.f(I)V")
    public void method4286() {
        for (int var1 = 0; var1 < this.field3200.length; var1++) {
            if (this.field3200[var1] != null) {
                for (int var2 = 0; var2 < this.field3200[var1].length; var2++) {
                    this.field3200[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("is.r(I[II)Z")
    public boolean method4287(int arg0, int[] arg1) {
        if (this.field3199[arg0] == null) {
            return false;
        }
        int var3 = this.field3195[arg0];
        int[] var4 = this.field3196[arg0];
        Object[] var5 = this.field3200[arg0];
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
            var8 = class189.method3528(this.field3199[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3296(arg1, 5, var9.field2387.length);
        } else {
            var8 = class189.method3528(this.field3199[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method949(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class185.field2382[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            throw class155.method870(var35, var13 + var17 + "," + class185.method471(var8, var8.length - 2) + "," + this.field3190[arg0] + "," + this.field3202);
        }
        if (this.field3197) {
            this.field3199[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class185 var23 = new class185(var10);
            int[] var24 = new int[var3];
            var23.field2386 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3279();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2386 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3279();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3191) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class189.method2897(var28[var34], false);
                }
            }
        } else if (this.field3191) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method2897(var10, false);
        }
        return true;
    }

    @ObfuscatedName("is.n(Ljava/lang/String;I)I")
    public int method4288(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3192.method3677(class308.method3202(var2));
    }

    @ObfuscatedName("is.g(ILjava/lang/String;I)I")
    public int method4289(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3198[arg0].method3677(class308.method3202(var3));
    }

    @ObfuscatedName("is.ab(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4290(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3192.method3677(class308.method3202(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3198[var5].method3677(class308.method3202(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("is.ao(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4291(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3192.method3677(class308.method3202(var3));
        int var6 = this.field3198[var5].method3677(class308.method3202(var4));
        return this.method4270(var5, var6);
    }

    @ObfuscatedName("is.an(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4344(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3192.method3677(class308.method3202(var3));
        int var6 = this.field3198[var5].method3677(class308.method3202(var4));
        return this.method4272(var5, var6);
    }

    @ObfuscatedName("is.ay(Ljava/lang/String;I)Z")
    public boolean method4337(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3192.method3677(class308.method3202(var2));
        return this.method4274(var3);
    }

    @ObfuscatedName("is.av(Ljava/lang/String;I)V")
    public void method4294(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3192.method3677(class308.method3202(var2));
        if (var3 >= 0) {
            this.method4269(var3);
        }
    }

    @ObfuscatedName("is.af(Ljava/lang/String;B)I")
    public int method4334(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3192.method3677(class308.method3202(var2));
        return this.method4276(var3);
    }

    @ObfuscatedName("br.ar([BI)[B")
    public static final byte[] method949(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3274();
        int var3 = var1.method3279();
        if (var3 < 0 || !(field3205 == 0 || var3 <= field3205)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3286(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3279();
            if (var5 < 0 || field3205 != 0 && var5 > field3205) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3205(var6, var5, arg0, var3, 9);
            } else {
                field3201.method3201(var1, var6);
            }
            return var6;
        }
    }
}
