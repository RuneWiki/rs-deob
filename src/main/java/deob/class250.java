package deob;

@ObfuscatedName("ie")
public abstract class class250 {

    @ObfuscatedName("ie.h")
    public int field3226;

    @ObfuscatedName("ie.e")
    public int[] field3214;

    @ObfuscatedName("ie.b")
    public int[] field3215;

    @ObfuscatedName("ie.l")
    public class201 field3223;

    @ObfuscatedName("ie.w")
    public int[] field3217;

    @ObfuscatedName("ie.d")
    public int[] field3218;

    @ObfuscatedName("ie.n")
    public int[] field3219;

    @ObfuscatedName("ie.s")
    public int[][] field3229;

    @ObfuscatedName("ie.g")
    public int[][] field3221;

    @ObfuscatedName("ie.a")
    public class201[] field3212;

    @ObfuscatedName("ie.r")
    public Object[] field3224;

    @ObfuscatedName("ie.k")
    public Object[][] field3213;

    @ObfuscatedName("ie.m")
    public static class178 field3225 = new class178();

    @ObfuscatedName("ie.q")
    public int field3230;

    @ObfuscatedName("ie.x")
    public boolean field3227;

    @ObfuscatedName("ie.u")
    public boolean field3228;

    @ObfuscatedName("ie.o")
    public static int field3222 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3227 = arg0;
        this.field3228 = arg1;
    }

    @ObfuscatedName("ie.f([BI)V")
    public void method4265(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class185.method180(arg0, 0, var2);
        this.field3230 = var3;
        class185 var4 = new class185(method1705(arg0));
        int var5 = var4.method3323();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method3328();
        }
        int var6 = var4.method3323();
        if (var5 >= 7) {
            this.field3226 = var4.method3378();
        } else {
            this.field3226 = var4.method3325();
        }
        int var7 = 0;
        int var8 = -1;
        this.field3214 = new int[this.field3226];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field3226; var9++) {
                this.field3214[var9] = var7 += var4.method3378();
                if (this.field3214[var9] > var8) {
                    var8 = this.field3214[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field3226; var10++) {
                this.field3214[var10] = var7 += var4.method3325();
                if (this.field3214[var10] > var8) {
                    var8 = this.field3214[var10];
                }
            }
        }
        this.field3217 = new int[var8 + 1];
        this.field3218 = new int[var8 + 1];
        this.field3219 = new int[var8 + 1];
        this.field3229 = new int[var8 + 1][];
        this.field3224 = new Object[var8 + 1];
        this.field3213 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field3215 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field3226; var11++) {
                this.field3215[this.field3214[var11]] = var4.method3328();
            }
            this.field3223 = new class201(this.field3215);
        }
        for (int var12 = 0; var12 < this.field3226; var12++) {
            this.field3217[this.field3214[var12]] = var4.method3328();
        }
        for (int var13 = 0; var13 < this.field3226; var13++) {
            this.field3218[this.field3214[var13]] = var4.method3328();
        }
        for (int var14 = 0; var14 < this.field3226; var14++) {
            this.field3219[this.field3214[var14]] = var4.method3325();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field3226; var15++) {
                int var16 = this.field3214[var15];
                int var17 = this.field3219[var16];
                int var18 = 0;
                int var19 = -1;
                this.field3229[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field3229[var16][var20] = var18 += var4.method3378();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field3213[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field3226; var22++) {
                int var23 = this.field3214[var22];
                int var24 = this.field3219[var23];
                int var25 = 0;
                int var26 = -1;
                this.field3229[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field3229[var23][var27] = var25 += var4.method3325();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field3213[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field3221 = new int[var8 + 1][];
        this.field3212 = new class201[var8 + 1];
        for (int var29 = 0; var29 < this.field3226; var29++) {
            int var30 = this.field3214[var29];
            int var31 = this.field3219[var30];
            this.field3221[var30] = new int[this.field3213[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field3221[var30][this.field3229[var30][var32]] = var4.method3328();
            }
            this.field3212[var30] = new class201(this.field3221[var30]);
        }
    }

    @ObfuscatedName("ie.h(II)V")
    public void method4274(int arg0) {
    }

    @ObfuscatedName("ie.e(III)[B")
    public byte[] method4267(int arg0, int arg1) {
        return this.method4340(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ie.b(II[II)[B")
    public byte[] method4340(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return null;
        }
        if (this.field3213[arg0][arg1] == null) {
            boolean var4 = this.method4284(arg0, arg2);
            if (!var4) {
                this.method4325(arg0);
                boolean var5 = this.method4284(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method650(this.field3213[arg0][arg1], false);
        if (this.field3228) {
            this.field3213[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ie.l(III)Z")
    public boolean method4316(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return false;
        } else if (this.field3213[arg0][arg1] != null) {
            return true;
        } else if (this.field3224[arg0] == null) {
            this.method4325(arg0);
            return this.field3224[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ie.w(II)Z")
    public boolean method4275(int arg0) {
        if (this.field3213.length == 1) {
            return this.method4316(0, arg0);
        } else if (this.field3213[arg0].length == 1) {
            return this.method4316(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.d(IB)Z")
    public boolean method4271(int arg0) {
        if (this.field3224[arg0] == null) {
            this.method4325(arg0);
            return this.field3224[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ie.n(I)Z")
    public boolean method4287() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3214.length; var2++) {
            int var3 = this.field3214[var2];
            if (this.field3224[var3] == null) {
                this.method4325(var3);
                if (this.field3224[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ie.s(II)I")
    public int method4273(int arg0) {
        return this.field3224[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("ie.g(II)[B")
    public byte[] method4333(int arg0) {
        if (this.field3213.length == 1) {
            return this.method4267(0, arg0);
        } else if (this.field3213[arg0].length == 1) {
            return this.method4267(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.k(IIB)[B")
    public byte[] method4264(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3213.length || this.field3213[arg0] == null || arg1 < 0 || arg1 >= this.field3213[arg0].length) {
            return null;
        }
        if (this.field3213[arg0][arg1] == null) {
            boolean var3 = this.method4284(arg0, (int[]) null);
            if (!var3) {
                this.method4325(arg0);
                boolean var4 = this.method4284(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method650(this.field3213[arg0][arg1], false);
    }

    @ObfuscatedName("ie.m(II)[B")
    public byte[] method4276(int arg0) {
        if (this.field3213.length == 1) {
            return this.method4264(0, arg0);
        } else if (this.field3213[arg0].length == 1) {
            return this.method4264(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ie.q(IB)V")
    public void method4325(int arg0) {
    }

    @ObfuscatedName("ie.x(II)[I")
    public int[] method4278(int arg0) {
        return this.field3229[arg0];
    }

    @ObfuscatedName("ie.u(II)I")
    public int method4279(int arg0) {
        return this.field3213[arg0].length;
    }

    @ObfuscatedName("ie.o(I)I")
    public int method4280() {
        return this.field3213.length;
    }

    @ObfuscatedName("ie.t(B)V")
    public void method4281() {
        for (int var1 = 0; var1 < this.field3224.length; var1++) {
            this.field3224[var1] = null;
        }
    }

    @ObfuscatedName("ie.v(II)V")
    public void method4324(int arg0) {
        for (int var2 = 0; var2 < this.field3213[arg0].length; var2++) {
            this.field3213[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ie.p(I)V")
    public void method4283() {
        for (int var1 = 0; var1 < this.field3213.length; var1++) {
            if (this.field3213[var1] != null) {
                for (int var2 = 0; var2 < this.field3213[var1].length; var2++) {
                    this.field3213[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ie.z(I[II)Z")
    public boolean method4284(int arg0, int[] arg1) {
        if (this.field3224[arg0] == null) {
            return false;
        }
        int var3 = this.field3219[arg0];
        int[] var4 = this.field3229[arg0];
        Object[] var5 = this.field3213[arg0];
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
            var8 = class189.method650(this.field3224[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3493(arg1, 5, var9.field2399.length);
        } else {
            var8 = class189.method650(this.field3224[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1705(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class185.method180(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class185.method180(var8, 0, var18);
            throw class155.method2947(var35, var17 + var19 + "," + this.field3217[arg0] + "," + this.field3230);
        }
        if (this.field3227) {
            this.field3224[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class185 var23 = new class185(var10);
            int[] var24 = new int[var3];
            var23.field2397 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3328();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2397 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3328();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3228) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class189.method3562(var28[var34], false);
                }
            }
        } else if (this.field3228) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method3562(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ie.j(Ljava/lang/String;B)I")
    public int method4285(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3223.method3713(class308.method2483(var2));
    }

    @ObfuscatedName("ie.c(ILjava/lang/String;I)I")
    public int method4286(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3212[arg0].method3713(class308.method2483(var3));
    }

    @ObfuscatedName("ie.av(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4282(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3223.method3713(class308.method2483(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3212[var5].method3713(class308.method2483(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("ie.as(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method4317(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3223.method3713(class308.method2483(var3));
        int var6 = this.field3212[var5].method3713(class308.method2483(var4));
        return this.method4267(var5, var6);
    }

    @ObfuscatedName("ie.al(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4289(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3223.method3713(class308.method2483(var3));
        int var6 = this.field3212[var5].method3713(class308.method2483(var4));
        return this.method4316(var5, var6);
    }

    @ObfuscatedName("ie.ax(Ljava/lang/String;S)Z")
    public boolean method4269(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3223.method3713(class308.method2483(var2));
        return this.method4271(var3);
    }

    @ObfuscatedName("ie.ay(Ljava/lang/String;B)V")
    public void method4291(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3223.method3713(class308.method2483(var2));
        if (var3 >= 0) {
            this.method4274(var3);
        }
    }

    @ObfuscatedName("ie.aa(Ljava/lang/String;I)I")
    public int method4292(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3223.method3713(class308.method2483(var2));
        return this.method4273(var3);
    }

    @ObfuscatedName("bp.ag([BI)[B")
    public static final byte[] method1705(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3323();
        int var3 = var1.method3328();
        if (var3 < 0 || !(field3222 == 0 || var3 <= field3222)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3326(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3328();
            if (var5 < 0 || field3222 != 0 && var5 > field3222) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3259(var6, var5, arg0, var3, 9);
            } else {
                field3225.method3254(var1, var6);
            }
            return var6;
        }
    }
}
