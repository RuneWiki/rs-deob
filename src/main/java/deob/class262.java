package deob;

@ObfuscatedName("jr")
public abstract class class262 {

    @ObfuscatedName("jr.e")
    public int field3369;

    @ObfuscatedName("jr.b")
    public int[] field3367;

    @ObfuscatedName("jr.z")
    public int[] field3379;

    @ObfuscatedName("jr.n")
    public class211 field3370;

    @ObfuscatedName("jr.l")
    public int[] field3371;

    @ObfuscatedName("jr.s")
    public int[] field3383;

    @ObfuscatedName("jr.y")
    public int[] field3373;

    @ObfuscatedName("jr.c")
    public int[][] field3374;

    @ObfuscatedName("jr.h")
    public int[][] field3375;

    @ObfuscatedName("jr.i")
    public class211[] field3376;

    @ObfuscatedName("jr.o")
    public Object[] field3377;

    @ObfuscatedName("jr.d")
    public Object[][] field3372;

    @ObfuscatedName("jr.r")
    public static class188 field3378 = new class188();

    @ObfuscatedName("jr.p")
    public int field3368;

    @ObfuscatedName("jr.q")
    public boolean field3381;

    @ObfuscatedName("jr.f")
    public boolean field3382;

    @ObfuscatedName("jr.j")
    public static int field3380 = 0;

    public class262(boolean arg0, boolean arg1) {
        this.field3381 = arg0;
        this.field3382 = arg1;
    }

    @ObfuscatedName("jr.g([BI)V")
    public void method4265(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class195.field2565[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3368 = var5;
        class195 var8 = new class195(method1814(arg0));
        int var9 = var8.method3332();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3472();
        }
        int var10 = var8.method3332();
        if (var9 >= 7) {
            this.field3369 = var8.method3323();
        } else {
            this.field3369 = var8.method3310();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3367 = new int[this.field3369];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3369; var13++) {
                this.field3367[var13] = var11 += var8.method3323();
                if (this.field3367[var13] > var12) {
                    var12 = this.field3367[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3369; var14++) {
                this.field3367[var14] = var11 += var8.method3310();
                if (this.field3367[var14] > var12) {
                    var12 = this.field3367[var14];
                }
            }
        }
        this.field3371 = new int[var12 + 1];
        this.field3383 = new int[var12 + 1];
        this.field3373 = new int[var12 + 1];
        this.field3374 = new int[var12 + 1][];
        this.field3377 = new Object[var12 + 1];
        this.field3372 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3379 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3369; var15++) {
                this.field3379[this.field3367[var15]] = var8.method3472();
            }
            this.field3370 = new class211(this.field3379);
        }
        for (int var16 = 0; var16 < this.field3369; var16++) {
            this.field3371[this.field3367[var16]] = var8.method3472();
        }
        for (int var17 = 0; var17 < this.field3369; var17++) {
            this.field3383[this.field3367[var17]] = var8.method3472();
        }
        for (int var18 = 0; var18 < this.field3369; var18++) {
            this.field3373[this.field3367[var18]] = var8.method3310();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3369; var19++) {
                int var20 = this.field3367[var19];
                int var21 = this.field3373[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3374[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3374[var20][var24] = var22 += var8.method3323();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3372[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3369; var26++) {
                int var27 = this.field3367[var26];
                int var28 = this.field3373[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3374[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3374[var27][var31] = var29 += var8.method3310();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3372[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3375 = new int[var12 + 1][];
        this.field3376 = new class211[var12 + 1];
        for (int var33 = 0; var33 < this.field3369; var33++) {
            int var34 = this.field3367[var33];
            int var35 = this.field3373[var34];
            this.field3375[var34] = new int[this.field3372[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3375[var34][this.field3374[var34][var36]] = var8.method3472();
            }
            this.field3376[var34] = new class211(this.field3375[var34]);
        }
    }

    @ObfuscatedName("jr.e(II)V")
    public void method4358(int arg0) {
    }

    @ObfuscatedName("jr.b(III)[B")
    public byte[] method4294(int arg0, int arg1) {
        return this.method4268(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jr.z(II[II)[B")
    public byte[] method4268(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3372.length || this.field3372[arg0] == null || arg1 < 0 || arg1 >= this.field3372[arg0].length) {
            return null;
        }
        if (this.field3372[arg0][arg1] == null) {
            boolean var4 = this.method4284(arg0, arg2);
            if (!var4) {
                this.method4285(arg0);
                boolean var5 = this.method4284(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class199.method5(this.field3372[arg0][arg1], false);
        if (this.field3382) {
            this.field3372[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jr.n(III)Z")
    public boolean method4269(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3372.length || this.field3372[arg0] == null || arg1 < 0 || arg1 >= this.field3372[arg0].length) {
            return false;
        } else if (this.field3372[arg0][arg1] != null) {
            return true;
        } else if (this.field3377[arg0] == null) {
            this.method4285(arg0);
            return this.field3377[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jr.l(II)Z")
    public boolean method4270(int arg0) {
        if (this.field3372.length == 1) {
            return this.method4269(0, arg0);
        } else if (this.field3372[arg0].length == 1) {
            return this.method4269(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jr.s(II)Z")
    public boolean method4319(int arg0) {
        if (this.field3377[arg0] == null) {
            this.method4285(arg0);
            return this.field3377[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jr.y(I)Z")
    public boolean method4290() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3367.length; var2++) {
            int var3 = this.field3367[var2];
            if (this.field3377[var3] == null) {
                this.method4285(var3);
                if (this.field3377[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jr.c(II)I")
    public int method4273(int arg0) {
        return this.field3377[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jr.o(IB)[B")
    public byte[] method4274(int arg0) {
        if (this.field3372.length == 1) {
            return this.method4294(0, arg0);
        } else if (this.field3372[arg0].length == 1) {
            return this.method4294(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jr.d(IIB)[B")
    public byte[] method4328(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3372.length || this.field3372[arg0] == null || arg1 < 0 || arg1 >= this.field3372[arg0].length) {
            return null;
        }
        if (this.field3372[arg0][arg1] == null) {
            boolean var3 = this.method4284(arg0, (int[]) null);
            if (!var3) {
                this.method4285(arg0);
                boolean var4 = this.method4284(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class199.method5(this.field3372[arg0][arg1], false);
    }

    @ObfuscatedName("jr.r(II)[B")
    public byte[] method4309(int arg0) {
        if (this.field3372.length == 1) {
            return this.method4328(0, arg0);
        } else if (this.field3372[arg0].length == 1) {
            return this.method4328(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jr.p(IB)V")
    public void method4285(int arg0) {
    }

    @ObfuscatedName("jr.q(II)[I")
    public int[] method4278(int arg0) {
        return this.field3374[arg0];
    }

    @ObfuscatedName("jr.f(II)I")
    public int method4279(int arg0) {
        return this.field3372[arg0].length;
    }

    @ObfuscatedName("jr.j(B)I")
    public int method4280() {
        return this.field3372.length;
    }

    @ObfuscatedName("jr.v(I)V")
    public void method4281() {
        for (int var1 = 0; var1 < this.field3377.length; var1++) {
            this.field3377[var1] = null;
        }
    }

    @ObfuscatedName("jr.u(II)V")
    public void method4299(int arg0) {
        for (int var2 = 0; var2 < this.field3372[arg0].length; var2++) {
            this.field3372[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jr.k(I)V")
    public void method4283() {
        for (int var1 = 0; var1 < this.field3372.length; var1++) {
            if (this.field3372[var1] != null) {
                for (int var2 = 0; var2 < this.field3372[var1].length; var2++) {
                    this.field3372[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jr.w(I[II)Z")
    public boolean method4284(int arg0, int[] arg1) {
        if (this.field3377[arg0] == null) {
            return false;
        }
        int var3 = this.field3373[arg0];
        int[] var4 = this.field3374[arg0];
        Object[] var5 = this.field3372[arg0];
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
            var8 = class199.method5(this.field3377[arg0], true);
            class195 var9 = new class195(var8);
            var9.method3432(arg1, 5, var9.field2563.length);
        } else {
            var8 = class199.method5(this.field3377[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1814(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class195.field2565[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class195.field2565[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class165.method64(var42, var20 + var24 + "," + this.field3371[arg0] + "," + this.field3368);
        }
        if (this.field3381) {
            this.field3377[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class195 var30 = new class195(var10);
            int[] var31 = new int[var3];
            var30.field2562 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method3472();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2562 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method3472();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field3382) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class199.method1800(var35[var41], false);
                }
            }
        } else if (this.field3382) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class199.method1800(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jr.x(Ljava/lang/String;S)I")
    public int method4306(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3370.method3694(class319.method3217(var2));
    }

    @ObfuscatedName("jr.t(ILjava/lang/String;I)I")
    public int method4295(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3376[arg0].method3694(class319.method3217(var3));
    }

    @ObfuscatedName("jr.ax(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4287(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3370.method3694(class319.method3217(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3376[var5].method3694(class319.method3217(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jr.ai(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4271(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3370.method3694(class319.method3217(var3));
        int var6 = this.field3376[var5].method3694(class319.method3217(var4));
        return this.method4294(var5, var6);
    }

    @ObfuscatedName("jr.aj(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method4337(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3370.method3694(class319.method3217(var3));
        int var6 = this.field3376[var5].method3694(class319.method3217(var4));
        return this.method4269(var5, var6);
    }

    @ObfuscatedName("jr.ac(Ljava/lang/String;B)Z")
    public boolean method4310(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3370.method3694(class319.method3217(var2));
        return this.method4319(var3);
    }

    @ObfuscatedName("jr.ag(Ljava/lang/String;I)V")
    public void method4291(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3370.method3694(class319.method3217(var2));
        if (var3 >= 0) {
            this.method4358(var3);
        }
    }

    @ObfuscatedName("jr.ay(Ljava/lang/String;B)I")
    public int method4277(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3370.method3694(class319.method3217(var2));
        return this.method4273(var3);
    }

    @ObfuscatedName("cf.as([BI)[B")
    public static final byte[] method1814(byte[] arg0) {
        class195 var1 = new class195(arg0);
        int var2 = var1.method3332();
        int var3 = var1.method3472();
        if (var3 < 0 || !(field3380 == 0 || var3 <= field3380)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3320(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3472();
            if (var5 < 0 || field3380 != 0 && var5 > field3380) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class189.method3246(var6, var5, arg0, var3, 9);
            } else {
                field3378.method3243(var1, var6);
            }
            return var6;
        }
    }
}
