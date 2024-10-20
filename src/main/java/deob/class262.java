package deob;

@ObfuscatedName("jc")
public abstract class class262 {

    @ObfuscatedName("jc.q")
    public int field3395;

    @ObfuscatedName("jc.i")
    public int[] field3380;

    @ObfuscatedName("jc.a")
    public int[] field3378;

    @ObfuscatedName("jc.l")
    public class211 field3382;

    @ObfuscatedName("jc.b")
    public int[] field3383;

    @ObfuscatedName("jc.e")
    public int[] field3384;

    @ObfuscatedName("jc.x")
    public int[] field3385;

    @ObfuscatedName("jc.p")
    public int[][] field3386;

    @ObfuscatedName("jc.g")
    public int[][] field3387;

    @ObfuscatedName("jc.n")
    public class211[] field3389;

    @ObfuscatedName("jc.o")
    public Object[] field3379;

    @ObfuscatedName("jc.c")
    public Object[][] field3390;

    @ObfuscatedName("jc.v")
    public static class188 field3391 = new class188();

    @ObfuscatedName("jc.u")
    public int field3392;

    @ObfuscatedName("jc.j")
    public boolean field3393;

    @ObfuscatedName("jc.k")
    public boolean field3394;

    @ObfuscatedName("jc.z")
    public static int field3381 = 0;

    public class262(boolean arg0, boolean arg1) {
        this.field3393 = arg0;
        this.field3394 = arg1;
    }

    @ObfuscatedName("jc.t([BI)V")
    public void method4190(byte[] arg0) {
        this.field3392 = class195.method250(arg0, arg0.length);
        class195 var2 = new class195(method3217(arg0));
        int var3 = var2.method3236();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3241();
        }
        int var4 = var2.method3236();
        if (var3 >= 7) {
            this.field3395 = var2.method3251();
        } else {
            this.field3395 = var2.method3238();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3380 = new int[this.field3395];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3395; var7++) {
                this.field3380[var7] = var5 += var2.method3251();
                if (this.field3380[var7] > var6) {
                    var6 = this.field3380[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3395; var8++) {
                this.field3380[var8] = var5 += var2.method3238();
                if (this.field3380[var8] > var6) {
                    var6 = this.field3380[var8];
                }
            }
        }
        this.field3383 = new int[var6 + 1];
        this.field3384 = new int[var6 + 1];
        this.field3385 = new int[var6 + 1];
        this.field3386 = new int[var6 + 1][];
        this.field3379 = new Object[var6 + 1];
        this.field3390 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3378 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3395; var9++) {
                this.field3378[this.field3380[var9]] = var2.method3241();
            }
            this.field3382 = new class211(this.field3378);
        }
        for (int var10 = 0; var10 < this.field3395; var10++) {
            this.field3383[this.field3380[var10]] = var2.method3241();
        }
        for (int var11 = 0; var11 < this.field3395; var11++) {
            this.field3384[this.field3380[var11]] = var2.method3241();
        }
        for (int var12 = 0; var12 < this.field3395; var12++) {
            this.field3385[this.field3380[var12]] = var2.method3238();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3395; var13++) {
                int var14 = this.field3380[var13];
                int var15 = this.field3385[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3386[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3386[var14][var18] = var16 += var2.method3251();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3390[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3395; var20++) {
                int var21 = this.field3380[var20];
                int var22 = this.field3385[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3386[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3386[var21][var25] = var23 += var2.method3238();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3390[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3387 = new int[var6 + 1][];
        this.field3389 = new class211[var6 + 1];
        for (int var27 = 0; var27 < this.field3395; var27++) {
            int var28 = this.field3380[var27];
            int var29 = this.field3385[var28];
            this.field3387[var28] = new int[this.field3390[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3387[var28][this.field3386[var28][var30]] = var2.method3241();
            }
            this.field3389[var28] = new class211(this.field3387[var28]);
        }
    }

    @ObfuscatedName("jc.q(II)V")
    public void method4191(int arg0) {
    }

    @ObfuscatedName("jc.i(III)[B")
    public byte[] method4265(int arg0, int arg1) {
        return this.method4193(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jc.a(II[II)[B")
    public byte[] method4193(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3390.length || this.field3390[arg0] == null || arg1 < 0 || arg1 >= this.field3390[arg0].length) {
            return null;
        }
        if (this.field3390[arg0][arg1] == null) {
            boolean var4 = this.method4209(arg0, arg2);
            if (!var4) {
                this.method4232(arg0);
                boolean var5 = this.method4209(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class199.method1577(this.field3390[arg0][arg1], false);
        if (this.field3394) {
            this.field3390[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jc.l(III)Z")
    public boolean method4194(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3390.length || this.field3390[arg0] == null || arg1 < 0 || arg1 >= this.field3390[arg0].length) {
            return false;
        } else if (this.field3390[arg0][arg1] != null) {
            return true;
        } else if (this.field3379[arg0] == null) {
            this.method4232(arg0);
            return this.field3379[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jc.b(IS)Z")
    public boolean method4195(int arg0) {
        if (this.field3390.length == 1) {
            return this.method4194(0, arg0);
        } else if (this.field3390[arg0].length == 1) {
            return this.method4194(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jc.e(II)Z")
    public boolean method4267(int arg0) {
        if (this.field3379[arg0] == null) {
            this.method4232(arg0);
            return this.field3379[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jc.x(I)Z")
    public boolean method4197() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3380.length; var2++) {
            int var3 = this.field3380[var2];
            if (this.field3379[var3] == null) {
                this.method4232(var3);
                if (this.field3379[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jc.p(IB)I")
    public int method4198(int arg0) {
        return this.field3379[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jc.o(II)[B")
    public byte[] method4199(int arg0) {
        if (this.field3390.length == 1) {
            return this.method4265(0, arg0);
        } else if (this.field3390[arg0].length == 1) {
            return this.method4265(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jc.c(III)[B")
    public byte[] method4200(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3390.length || this.field3390[arg0] == null || arg1 < 0 || arg1 >= this.field3390[arg0].length) {
            return null;
        }
        if (this.field3390[arg0][arg1] == null) {
            boolean var3 = this.method4209(arg0, (int[]) null);
            if (!var3) {
                this.method4232(arg0);
                boolean var4 = this.method4209(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class199.method1577(this.field3390[arg0][arg1], false);
    }

    @ObfuscatedName("jc.u(IB)[B")
    public byte[] method4189(int arg0) {
        if (this.field3390.length == 1) {
            return this.method4200(0, arg0);
        } else if (this.field3390[arg0].length == 1) {
            return this.method4200(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jc.k(II)V")
    public void method4232(int arg0) {
    }

    @ObfuscatedName("jc.z(II)[I")
    public int[] method4203(int arg0) {
        return this.field3386[arg0];
    }

    @ObfuscatedName("jc.w(II)I")
    public int method4204(int arg0) {
        return this.field3390[arg0].length;
    }

    @ObfuscatedName("jc.s(I)I")
    public int method4205() {
        return this.field3390.length;
    }

    @ObfuscatedName("jc.d(B)V")
    public void method4264() {
        for (int var1 = 0; var1 < this.field3379.length; var1++) {
            this.field3379[var1] = null;
        }
    }

    @ObfuscatedName("jc.f(II)V")
    public void method4217(int arg0) {
        for (int var2 = 0; var2 < this.field3390[arg0].length; var2++) {
            this.field3390[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jc.r(I)V")
    public void method4208() {
        for (int var1 = 0; var1 < this.field3390.length; var1++) {
            if (this.field3390[var1] != null) {
                for (int var2 = 0; var2 < this.field3390[var1].length; var2++) {
                    this.field3390[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jc.y(I[II)Z")
    public boolean method4209(int arg0, int[] arg1) {
        if (this.field3379[arg0] == null) {
            return false;
        }
        int var3 = this.field3385[arg0];
        int[] var4 = this.field3386[arg0];
        Object[] var5 = this.field3390[arg0];
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
            var8 = class199.method1577(this.field3379[arg0], true);
            class195 var9 = new class195(var8);
            var9.method3289(arg1, 5, var9.field2544.length);
        } else {
            var8 = class199.method1577(this.field3379[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3217(var8);
        } catch (RuntimeException var27) {
            throw Statics.method1660(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class195.method250(var8, var8.length) + "," + class195.method250(var8, var8.length - 2) + "," + this.field3383[arg0] + "," + this.field3392);
        }
        if (this.field3393) {
            this.field3379[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class195 var15 = new class195(var10);
            int[] var16 = new int[var3];
            var15.field2545 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3241();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2545 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3241();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3394) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class199.method3839(var20[var26], false);
                }
            }
        } else if (this.field3394) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class199.method3839(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jc.h(Ljava/lang/String;I)I")
    public int method4210(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3382.method3617(class319.method2823(var2));
    }

    @ObfuscatedName("jc.av(ILjava/lang/String;I)I")
    public int method4211(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3389[arg0].method3617(class319.method2823(var3));
    }

    @ObfuscatedName("jc.aj(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4212(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3617(class319.method2823(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3389[var5].method3617(class319.method2823(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jc.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4213(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3617(class319.method2823(var3));
        int var6 = this.field3389[var5].method3617(class319.method2823(var4));
        return this.method4265(var5, var6);
    }

    @ObfuscatedName("jc.am(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4214(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3382.method3617(class319.method2823(var3));
        int var6 = this.field3389[var5].method3617(class319.method2823(var4));
        return this.method4194(var5, var6);
    }

    @ObfuscatedName("jc.az(Ljava/lang/String;I)Z")
    public boolean method4288(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3617(class319.method2823(var2));
        return this.method4267(var3);
    }

    @ObfuscatedName("jc.ap(Ljava/lang/String;I)V")
    public void method4216(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3617(class319.method2823(var2));
        if (var3 >= 0) {
            this.method4191(var3);
        }
    }

    @ObfuscatedName("jc.ah(Ljava/lang/String;S)I")
    public int method4271(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3382.method3617(class319.method2823(var2));
        return this.method4198(var3);
    }

    @ObfuscatedName("gq.au([BB)[B")
    public static final byte[] method3217(byte[] arg0) {
        class195 var1 = new class195(arg0);
        int var2 = var1.method3236();
        int var3 = var1.method3241();
        if (var3 < 0 || !(field3381 == 0 || var3 <= field3381)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3282(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3241();
            if (var5 < 0 || field3381 != 0 && var5 > field3381) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class189.method3186(var6, var5, arg0, var3, 9);
            } else {
                field3391.method3166(var1, var6);
            }
            return var6;
        }
    }
}
