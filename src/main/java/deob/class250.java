package deob;

@ObfuscatedName("iu")
public abstract class class250 {

    @ObfuscatedName("iu.c")
    public int field3203;

    @ObfuscatedName("iu.n")
    public int[] field3204;

    @ObfuscatedName("iu.u")
    public int[] field3205;

    @ObfuscatedName("iu.i")
    public class201 field3210;

    @ObfuscatedName("iu.r")
    public int[] field3219;

    @ObfuscatedName("iu.j")
    public int[] field3214;

    @ObfuscatedName("iu.p")
    public int[] field3209;

    @ObfuscatedName("iu.e")
    public int[][] field3218;

    @ObfuscatedName("iu.s")
    public int[][] field3207;

    @ObfuscatedName("iu.v")
    public class201[] field3202;

    @ObfuscatedName("iu.k")
    public Object[] field3213;

    @ObfuscatedName("iu.o")
    public Object[][] field3206;

    @ObfuscatedName("iu.q")
    public static class178 field3215 = new class178();

    @ObfuscatedName("iu.l")
    public int field3216;

    @ObfuscatedName("iu.f")
    public boolean field3217;

    @ObfuscatedName("iu.z")
    public boolean field3208;

    @ObfuscatedName("iu.a")
    public static int field3212 = 0;

    public class250(boolean arg0, boolean arg1) {
        this.field3217 = arg0;
        this.field3208 = arg1;
    }

    @ObfuscatedName("iu.y([BB)V")
    public void method4254(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class185.field2375[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field3216 = var5;
        class185 var8 = new class185(method1770(arg0));
        int var9 = var8.method3299();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method3374();
        }
        int var10 = var8.method3299();
        if (var9 >= 7) {
            this.field3203 = var8.method3342();
        } else {
            this.field3203 = var8.method3280();
        }
        int var11 = 0;
        int var12 = -1;
        this.field3204 = new int[this.field3203];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field3203; var13++) {
                this.field3204[var13] = var11 += var8.method3342();
                if (this.field3204[var13] > var12) {
                    var12 = this.field3204[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field3203; var14++) {
                this.field3204[var14] = var11 += var8.method3280();
                if (this.field3204[var14] > var12) {
                    var12 = this.field3204[var14];
                }
            }
        }
        this.field3219 = new int[var12 + 1];
        this.field3214 = new int[var12 + 1];
        this.field3209 = new int[var12 + 1];
        this.field3218 = new int[var12 + 1][];
        this.field3213 = new Object[var12 + 1];
        this.field3206 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field3205 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field3203; var15++) {
                this.field3205[this.field3204[var15]] = var8.method3374();
            }
            this.field3210 = new class201(this.field3205);
        }
        for (int var16 = 0; var16 < this.field3203; var16++) {
            this.field3219[this.field3204[var16]] = var8.method3374();
        }
        for (int var17 = 0; var17 < this.field3203; var17++) {
            this.field3214[this.field3204[var17]] = var8.method3374();
        }
        for (int var18 = 0; var18 < this.field3203; var18++) {
            this.field3209[this.field3204[var18]] = var8.method3280();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field3203; var19++) {
                int var20 = this.field3204[var19];
                int var21 = this.field3209[var20];
                int var22 = 0;
                int var23 = -1;
                this.field3218[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field3218[var20][var24] = var22 += var8.method3342();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field3206[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field3203; var26++) {
                int var27 = this.field3204[var26];
                int var28 = this.field3209[var27];
                int var29 = 0;
                int var30 = -1;
                this.field3218[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field3218[var27][var31] = var29 += var8.method3280();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field3206[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field3207 = new int[var12 + 1][];
        this.field3202 = new class201[var12 + 1];
        for (int var33 = 0; var33 < this.field3203; var33++) {
            int var34 = this.field3204[var33];
            int var35 = this.field3209[var34];
            this.field3207[var34] = new int[this.field3206[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field3207[var34][this.field3218[var34][var36]] = var8.method3374();
            }
            this.field3202[var34] = new class201(this.field3207[var34]);
        }
    }

    @ObfuscatedName("iu.c(II)V")
    public void method4255(int arg0) {
    }

    @ObfuscatedName("iu.n(III)[B")
    public byte[] method4263(int arg0, int arg1) {
        return this.method4257(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("iu.u(II[II)[B")
    public byte[] method4257(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field3206.length || this.field3206[arg0] == null || arg1 < 0 || arg1 >= this.field3206[arg0].length) {
            return null;
        }
        if (this.field3206[arg0][arg1] == null) {
            boolean var4 = this.method4273(arg0, arg2);
            if (!var4) {
                this.method4266(arg0);
                boolean var5 = this.method4273(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class189.method1921(this.field3206[arg0][arg1], false);
        if (this.field3208) {
            this.field3206[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("iu.i(III)Z")
    public boolean method4323(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3206.length || this.field3206[arg0] == null || arg1 < 0 || arg1 >= this.field3206[arg0].length) {
            return false;
        } else if (this.field3206[arg0][arg1] != null) {
            return true;
        } else if (this.field3213[arg0] == null) {
            this.method4266(arg0);
            return this.field3213[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iu.p(II)Z")
    public boolean method4288(int arg0) {
        if (this.field3206.length == 1) {
            return this.method4323(0, arg0);
        } else if (this.field3206[arg0].length == 1) {
            return this.method4323(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.e(IB)Z")
    public boolean method4260(int arg0) {
        if (this.field3213[arg0] == null) {
            this.method4266(arg0);
            return this.field3213[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("iu.s(I)Z")
    public boolean method4285() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field3204.length; var2++) {
            int var3 = this.field3204[var2];
            if (this.field3213[var3] == null) {
                this.method4266(var3);
                if (this.field3213[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("iu.v(II)I")
    public int method4262(int arg0) {
        return this.field3213[arg0] == null ? 0 : 100;
    }

    @ObfuscatedName("iu.k(IB)[B")
    public byte[] method4326(int arg0) {
        if (this.field3206.length == 1) {
            return this.method4263(0, arg0);
        } else if (this.field3206[arg0].length == 1) {
            return this.method4263(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.o(III)[B")
    public byte[] method4264(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field3206.length || this.field3206[arg0] == null || arg1 < 0 || arg1 >= this.field3206[arg0].length) {
            return null;
        }
        if (this.field3206[arg0][arg1] == null) {
            boolean var3 = this.method4273(arg0, (int[]) null);
            if (!var3) {
                this.method4266(arg0);
                boolean var4 = this.method4273(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class189.method1921(this.field3206[arg0][arg1], false);
    }

    @ObfuscatedName("iu.q(II)[B")
    public byte[] method4327(int arg0) {
        if (this.field3206.length == 1) {
            return this.method4264(0, arg0);
        } else if (this.field3206[arg0].length == 1) {
            return this.method4264(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("iu.l(II)V")
    public void method4266(int arg0) {
    }

    @ObfuscatedName("iu.f(IB)[I")
    public int[] method4267(int arg0) {
        return this.field3218[arg0];
    }

    @ObfuscatedName("iu.z(IB)I")
    public int method4287(int arg0) {
        return this.field3206[arg0].length;
    }

    @ObfuscatedName("iu.a(S)I")
    public int method4269() {
        return this.field3206.length;
    }

    @ObfuscatedName("iu.x(I)V")
    public void method4270() {
        for (int var1 = 0; var1 < this.field3213.length; var1++) {
            this.field3213[var1] = null;
        }
    }

    @ObfuscatedName("iu.b(IB)V")
    public void method4271(int arg0) {
        for (int var2 = 0; var2 < this.field3206[arg0].length; var2++) {
            this.field3206[arg0][var2] = null;
        }
    }

    @ObfuscatedName("iu.w(I)V")
    public void method4329() {
        for (int var1 = 0; var1 < this.field3206.length; var1++) {
            if (this.field3206[var1] != null) {
                for (int var2 = 0; var2 < this.field3206[var1].length; var2++) {
                    this.field3206[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("iu.g(I[IB)Z")
    public boolean method4273(int arg0, int[] arg1) {
        if (this.field3213[arg0] == null) {
            return false;
        }
        int var3 = this.field3209[arg0];
        int[] var4 = this.field3218[arg0];
        Object[] var5 = this.field3206[arg0];
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
            var8 = class189.method1921(this.field3213[arg0], true);
            class185 var9 = new class185(var8);
            var9.method3482(arg1, 5, var9.field2373.length);
        } else {
            var8 = class189.method1921(this.field3213[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1770(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class185.field2375[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            throw class155.method4724(var35, var13 + var17 + "," + class185.method3160(var8, var8.length - 2) + "," + this.field3219[arg0] + "," + this.field3216);
        }
        if (this.field3217) {
            this.field3213[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class185 var23 = new class185(var10);
            int[] var24 = new int[var3];
            var23.field2374 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method3374();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2374 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method3374();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field3208) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class189.method1701(var28[var34], false);
                }
            }
        } else if (this.field3208) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class189.method1701(var10, false);
        }
        return true;
    }

    @ObfuscatedName("iu.d(Ljava/lang/String;I)I")
    public int method4274(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field3210.method3670(class308.method995(var2));
    }

    @ObfuscatedName("iu.m(ILjava/lang/String;I)I")
    public int method4275(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field3202[arg0].method3670(class308.method995(var3));
    }

    @ObfuscatedName("iu.t(Ljava/lang/String;Ljava/lang/String;S)Z")
    public boolean method4276(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3210.method3670(class308.method995(var3));
        if (var5 < 0) {
            return false;
        } else {
            int var6 = this.field3202[var5].method3670(class308.method995(var4));
            return var6 >= 0;
        }
    }

    @ObfuscatedName("iu.h(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method4314(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3210.method3670(class308.method995(var3));
        int var6 = this.field3202[var5].method3670(class308.method995(var4));
        return this.method4263(var5, var6);
    }

    @ObfuscatedName("iu.ah(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method4337(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field3210.method3670(class308.method995(var3));
        int var6 = this.field3202[var5].method3670(class308.method995(var4));
        return this.method4323(var5, var6);
    }

    @ObfuscatedName("iu.ad(Ljava/lang/String;I)Z")
    public boolean method4268(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3210.method3670(class308.method995(var2));
        return this.method4260(var3);
    }

    @ObfuscatedName("iu.aa(Ljava/lang/String;I)V")
    public void method4319(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3210.method3670(class308.method995(var2));
        if (var3 >= 0) {
            this.method4255(var3);
        }
    }

    @ObfuscatedName("iu.ag(Ljava/lang/String;B)I")
    public int method4281(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field3210.method3670(class308.method995(var2));
        return this.method4262(var3);
    }

    @ObfuscatedName("cb.av([BI)[B")
    public static final byte[] method1770(byte[] arg0) {
        class185 var1 = new class185(arg0);
        int var2 = var1.method3299();
        int var3 = var1.method3374();
        if (var3 < 0 || !(field3212 == 0 || var3 <= field3212)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method3279(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method3374();
            if (var5 < 0 || field3212 != 0 && var5 > field3212) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class179.method3209(var6, var5, arg0, var3, 9);
            } else {
                field3215.method3205(var1, var6);
            }
            return var6;
        }
    }
}
