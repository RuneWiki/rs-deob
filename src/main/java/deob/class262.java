package deob;

@ObfuscatedName("jm")
public abstract class class262 {

    @ObfuscatedName("jm.i")
    public int field3368;

    @ObfuscatedName("jm.o")
    public int[] field3369;

    @ObfuscatedName("jm.j")
    public int[] field3370;

    @ObfuscatedName("jm.k")
    public class211 field3371;

    @ObfuscatedName("jm.x")
    public int[] field3372;

    @ObfuscatedName("jm.z")
    public int[] field3373;

    @ObfuscatedName("jm.p")
    public int[] field3374;

    @ObfuscatedName("jm.w")
    public int[][] field3375;

    @ObfuscatedName("jm.r")
    public int[][] field3382;

    @ObfuscatedName("jm.d")
    public class211[] field3367;

    @ObfuscatedName("jm.a")
    public Object[] field3378;

    @ObfuscatedName("jm.e")
    public Object[][] field3376;

    @ObfuscatedName("jm.f")
    public static class188 field3380 = new class188();

    @ObfuscatedName("jm.l")
    public int field3381;

    @ObfuscatedName("jm.m")
    public boolean field3377;

    @ObfuscatedName("jm.b")
    public boolean field3383;

    @ObfuscatedName("jm.h")
    public static int field3384 = 0;

    public class262(boolean arg0, boolean arg1) {
        this.field3377 = arg0;
        this.field3383 = arg1;
    }

    @ObfuscatedName("jm.c([BS)V")
    public void method4188(byte[] arg0) {
        this.field3381 = class195.method5029(arg0, arg0.length);
        class195 var2 = new class195(method15(arg0));
        int var3 = var2.method3429();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method3230();
        }
        int var4 = var2.method3429();
        if (var3 >= 7) {
            this.field3368 = var2.method3240();
        } else {
            this.field3368 = var2.method3218();
        }
        int var5 = 0;
        int var6 = -1;
        this.field3369 = new int[this.field3368];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field3368; var7++) {
                this.field3369[var7] = var5 += var2.method3240();
                if (this.field3369[var7] > var6) {
                    var6 = this.field3369[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field3368; var8++) {
                this.field3369[var8] = var5 += var2.method3218();
                if (this.field3369[var8] > var6) {
                    var6 = this.field3369[var8];
                }
            }
        }
        this.field3372 = new int[var6 + 1];
        this.field3373 = new int[var6 + 1];
        this.field3374 = new int[var6 + 1];
        this.field3375 = new int[var6 + 1][];
        this.field3378 = new Object[var6 + 1];
        this.field3376 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field3370 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field3368; var9++) {
                this.field3370[this.field3369[var9]] = var2.method3230();
            }
            this.field3371 = new class211(this.field3370);
        }
        for (int var10 = 0; var10 < this.field3368; var10++) {
            this.field3372[this.field3369[var10]] = var2.method3230();
        }
        for (int var11 = 0; var11 < this.field3368; var11++) {
            this.field3373[this.field3369[var11]] = var2.method3230();
        }
        for (int var12 = 0; var12 < this.field3368; var12++) {
            this.field3374[this.field3369[var12]] = var2.method3218();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field3368; var13++) {
                int var14 = this.field3369[var13];
                int var15 = this.field3374[var14];
                int var16 = 0;
                int var17 = -1;
                this.field3375[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field3375[var14][var18] = var16 += var2.method3240();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field3376[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field3368; var20++) {
                int var21 = this.field3369[var20];
                int var22 = this.field3374[var21];
                int var23 = 0;
                int var24 = -1;
                this.field3375[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field3375[var21][var25] = var23 += var2.method3218();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field3376[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field3382 = new int[var6 + 1][];
        this.field3367 = new class211[var6 + 1];
        for (int var27 = 0; var27 < this.field3368; var27++) {
            int var28 = this.field3369[var27];
            int var29 = this.field3374[var28];
            this.field3382[var28] = new int[this.field3376[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field3382[var28][this.field3375[var28][var30]] = var2.method3230();
            }
            this.field3367[var28] = new class211(this.field3382[var28]);
        }
    }

    @ObfuscatedName("jm.i(II)V")
    public void method4189(int arg0) {
    }

    @ObfuscatedName("jm.o(III)[B")
    public byte[] method4190(int arg0, int arg1) {
        return this.method4191(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("jm.j(II[II)[B")
    public byte[] method4191(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3376.length || this.field3376[arg0] == null || arg1 < 0 || arg1 >= this.field3376[arg0].length) {
            return null;
        }
        if (this.field3376[arg0][arg1] == null) {
            boolean var4 = this.method4214(arg0, arg2);
            if (!var4) {
                this.method4200(arg0);
                boolean var5 = this.method4214(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class199.method481(this.field3376[arg0][arg1], false);
        if (this.field3383) {
            this.field3376[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("jm.k(IIB)Z")
    public boolean method4209(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3376.length || this.field3376[arg0] == null || arg1 < 0 || arg1 >= this.field3376[arg0].length) {
            return false;
        } else if (this.field3376[arg0][arg1] != null) {
            return true;
        } else if (this.field3378[arg0] == null) {
            this.method4200(arg0);
            return this.field3378[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jm.x(II)Z")
    public boolean method4269(int arg0) {
        if (this.field3376.length == 1) {
            return this.method4209(0, arg0);
        } else if (this.field3376[arg0].length == 1) {
            return this.method4209(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jm.z(II)Z")
    public boolean method4194(int arg0) {
        if (this.field3378[arg0] == null) {
            this.method4200(arg0);
            return this.field3378[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("jm.p(I)Z")
    public boolean method4279() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3369.length; var2++) {
            int var3 = this.field3369[var2];
            if (this.field3378[var3] == null) {
                this.method4200(var3);
                if (this.field3378[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("jm.w(IB)I")
    public int method4217(int arg0) {
        return this.field3378[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("jm.r(II)[B")
    public byte[] method4251(int arg0) {
        if (this.field3376.length == 1) {
            return this.method4190(0, arg0);
        } else if (this.field3376[arg0].length == 1) {
            return this.method4190(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jm.d(IIB)[B")
    public byte[] method4198(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3376.length || this.field3376[arg0] == null || arg1 < 0 || arg1 >= this.field3376[arg0].length) {
            return null;
        }
        if (this.field3376[arg0][arg1] == null) {
            boolean var3 = this.method4214(arg0, (int[]) null);
            if (!var3) {
                this.method4200(arg0);
                boolean var4 = this.method4214(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class199.method481(this.field3376[arg0][arg1], false);
    }

    @ObfuscatedName("jm.a(II)[B")
    public byte[] method4199(int arg0) {
        if (this.field3376.length == 1) {
            return this.method4198(0, arg0);
        } else if (this.field3376[arg0].length == 1) {
            return this.method4198(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("jm.b(II)V")
    public void method4200(int arg0) {
    }

    @ObfuscatedName("jm.h(II)[I")
    public int[] method4201(int arg0) {
        return this.field3375[arg0];
    }

    @ObfuscatedName("jm.n(II)I")
    public int method4202(int arg0) {
        return this.field3376[arg0].length;
    }

    @ObfuscatedName("jm.u(I)I")
    public int method4204() {
        return this.field3376.length;
    }

    @ObfuscatedName("jm.q(I)V")
    public void method4195() {
        for (int var1 = 0; var1 < this.field3378.length; var1++) {
            this.field3378[var1] = null;
        }
    }

    @ObfuscatedName("jm.g(IB)V")
    public void method4205(int arg0) {
        for (int var2 = 0; var2 < this.field3376[arg0].length; var2++) {
            this.field3376[arg0][var2] = null;
        }
    }

    @ObfuscatedName("jm.y(S)V")
    public void method4206() {
        for (int var1 = 0; var1 < this.field3376.length; var1++) {
            if (this.field3376[var1] != null) {
                for (int var2 = 0; var2 < this.field3376[var1].length; var2++) {
                    this.field3376[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("jm.s(I[II)Z")
    public boolean method4214(int arg0, int[] arg1) {
        if (this.field3378[arg0] == null) {
            return false;
        }
        int var3 = this.field3374[arg0];
        int[] var4 = this.field3375[arg0];
        Object[] var5 = this.field3376[arg0];
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
            var8 = class199.method481(this.field3378[arg0], true);
            class195 var9 = new class195(var8);
            var9.method3246(arg1, 5, var9.field2567.length);
        } else {
            var8 = class199.method481(this.field3378[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method15(var8);
        } catch (RuntimeException var27) {
            throw class165.method703(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class195.method5029(var8, var8.length) + "," + class195.method5029(var8, var8.length - 2) + "," + this.field3372[arg0] + "," + this.field3381);
        }
        if (this.field3377) {
            this.field3378[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class195 var15 = new class195(var10);
            int[] var16 = new int[var3];
            var15.field2566 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method3230();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2566 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method3230();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field3383) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class199.method954(var20[var26], false);
                }
            }
        } else if (this.field3383) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class199.method954(var10, false);
        }
        return true;
    }

    @ObfuscatedName("jm.ac(Ljava/lang/String;I)I")
    public int method4245(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3371.method3615(class319.method3132(var2));
    }

    @ObfuscatedName("jm.ap(ILjava/lang/String;S)I")
    public int method4207(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3367[arg0].method3615(class319.method3132(var3));
    }

    @ObfuscatedName("jm.al(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method4210(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3371.method3615(class319.method3132(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3367[var5].method3615(class319.method3132(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("jm.ai(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4211(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3371.method3615(class319.method3132(var3));
        int var6 = this.field3367[var5].method3615(class319.method3132(var4));
        return this.method4190(var5, var6);
    }

    @ObfuscatedName("jm.ab(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4276(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3371.method3615(class319.method3132(var3));
        int var6 = this.field3367[var5].method3615(class319.method3132(var4));
        return this.method4209(var5, var6);
    }

    @ObfuscatedName("jm.ak(Ljava/lang/String;I)Z")
    public boolean method4213(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3371.method3615(class319.method3132(var2));
        return this.method4194(var3);
    }

    @ObfuscatedName("jm.as(Ljava/lang/String;I)V")
    public void method4224(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3371.method3615(class319.method3132(var2));
        if (var3 >= 0) {
            this.method4189(var3);
        }
    }

    @ObfuscatedName("jm.aa(Ljava/lang/String;I)I")
    public int method4215(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3371.method3615(class319.method3132(var2));
        return this.method4217(var3);
    }

    @ObfuscatedName("x.ah([BI)[B")
    public static final byte[] method15(byte[] arg0) {
        class195 var1 = new class195(arg0);
        int var2 = var1.method3429();
        int var3 = var1.method3230();
        if (var3 < 0 || !(field3384 == 0 || var3 <= field3384)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3237(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3230();
            if (var5 < 0 || field3384 != 0 && var5 > field3384) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class189.method3166(var6, var5, arg0, var3, 9);
            } else {
                field3380.method3160(var1, var6);
            }
            return var6;
        }
    }
}
