package deob;

@ObfuscatedName("fu")
public abstract class class167 {

    @ObfuscatedName("fu.y")
    public int field2648;

    @ObfuscatedName("fu.d")
    public int[] field2663;

    @ObfuscatedName("fu.g")
    public int[] field2649;

    @ObfuscatedName("fu.w")
    public class192 field2651;

    @ObfuscatedName("fu.e")
    public int[] field2652;

    @ObfuscatedName("fu.c")
    public int[] field2653;

    @ObfuscatedName("fu.a")
    public int[] field2661;

    @ObfuscatedName("fu.q")
    public int[][] field2655;

    @ObfuscatedName("fu.m")
    public int[][] field2656;

    @ObfuscatedName("fu.n")
    public class192[] field2660;

    @ObfuscatedName("fu.k")
    public Object[] field2658;

    @ObfuscatedName("fu.o")
    public Object[][] field2659;

    @ObfuscatedName("fu.f")
    public static class116 field2654 = new class116();

    @ObfuscatedName("fu.s")
    public int field2657;

    @ObfuscatedName("fu.z")
    public boolean field2662;

    @ObfuscatedName("fu.b")
    public boolean field2650;

    @ObfuscatedName("fu.p")
    public static int field2664 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2662 = arg0;
        this.field2650 = arg1;
    }

    @ObfuscatedName("fu.y([BI)V")
    public void method3002(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method615(arg0, 0, var2);
        this.field2657 = var3;
        class119 var4 = new class119(method1924(arg0));
        int var5 = var4.method2326();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2331();
        }
        int var6 = var4.method2326();
        if (var5 >= 7) {
            this.field2648 = var4.method2340();
        } else {
            this.field2648 = var4.method2525();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2663 = new int[this.field2648];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2648; var9++) {
                this.field2663[var9] = var7 += var4.method2340();
                if (this.field2663[var9] > var8) {
                    var8 = this.field2663[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2648; var10++) {
                this.field2663[var10] = var7 += var4.method2525();
                if (this.field2663[var10] > var8) {
                    var8 = this.field2663[var10];
                }
            }
        }
        this.field2652 = new int[var8 + 1];
        this.field2653 = new int[var8 + 1];
        this.field2661 = new int[var8 + 1];
        this.field2655 = new int[var8 + 1][];
        this.field2658 = new Object[var8 + 1];
        this.field2659 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2649 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2648; var11++) {
                this.field2649[this.field2663[var11]] = var4.method2331();
            }
            this.field2651 = new class192(this.field2649);
        }
        for (int var12 = 0; var12 < this.field2648; var12++) {
            this.field2652[this.field2663[var12]] = var4.method2331();
        }
        for (int var13 = 0; var13 < this.field2648; var13++) {
            this.field2653[this.field2663[var13]] = var4.method2331();
        }
        for (int var14 = 0; var14 < this.field2648; var14++) {
            this.field2661[this.field2663[var14]] = var4.method2525();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2648; var15++) {
                int var16 = this.field2663[var15];
                int var17 = this.field2661[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2655[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2655[var16][var20] = var18 += var4.method2340();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2659[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2648; var22++) {
                int var23 = this.field2663[var22];
                int var24 = this.field2661[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2655[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2655[var23][var27] = var25 += var4.method2525();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2659[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2656 = new int[var8 + 1][];
        this.field2660 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2648; var29++) {
            int var30 = this.field2663[var29];
            int var31 = this.field2661[var30];
            this.field2656[var30] = new int[this.field2659[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2656[var30][this.field2655[var30][var32]] = var4.method2331();
            }
            this.field2660[var30] = new class192(this.field2656[var30]);
        }
    }

    @ObfuscatedName("fu.d(II)V")
    public void method3011(int arg0) {
    }

    @ObfuscatedName("fu.g(III)[B")
    public byte[] method3045(int arg0, int arg1) {
        return this.method3006(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fu.w(II[II)[B")
    public byte[] method3006(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return null;
        }
        if (this.field2659[arg0][arg1] == null) {
            boolean var4 = this.method3010(arg0, arg2);
            if (!var4) {
                this.method3039(arg0);
                boolean var5 = this.method3010(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method1571(this.field2659[arg0][arg1], false);
        if (this.field2650) {
            this.field2659[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fu.e(III)Z")
    public boolean method2998(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return false;
        } else if (this.field2659[arg0][arg1] != null) {
            return true;
        } else if (this.field2658[arg0] == null) {
            this.method3039(arg0);
            return this.field2658[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.c(IB)Z")
    public boolean method2993(int arg0) {
        if (this.field2658[arg0] == null) {
            this.method3039(arg0);
            return this.field2658[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fu.a(I)Z")
    public boolean method3000() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2663.length; var2++) {
            int var3 = this.field2663[var2];
            if (this.field2658[var3] == null) {
                this.method3039(var3);
                if (this.field2658[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fu.q(II)[B")
    public byte[] method3028(int arg0) {
        if (this.field2659.length == 1) {
            return this.method3045(0, arg0);
        } else if (this.field2659[arg0].length == 1) {
            return this.method3045(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.m(III)[B")
    public byte[] method3020(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return null;
        }
        if (this.field2659[arg0][arg1] == null) {
            boolean var3 = this.method3010(arg0, (int[]) null);
            if (!var3) {
                this.method3039(arg0);
                boolean var4 = this.method3010(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method1571(this.field2659[arg0][arg1], false);
    }

    @ObfuscatedName("fu.n(IB)[B")
    public byte[] method3003(int arg0) {
        if (this.field2659.length == 1) {
            return this.method3020(0, arg0);
        } else if (this.field2659[arg0].length == 1) {
            return this.method3020(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fu.k(II)V")
    public void method3039(int arg0) {
    }

    @ObfuscatedName("fu.o(II)[I")
    public int[] method3057(int arg0) {
        return this.field2655[arg0];
    }

    @ObfuscatedName("fu.f(II)I")
    public int method3050(int arg0) {
        return this.field2659[arg0].length;
    }

    @ObfuscatedName("fu.s(I)I")
    public int method3007() {
        return this.field2659.length;
    }

    @ObfuscatedName("fu.z(IB)V")
    public void method3023(int arg0) {
        for (int var2 = 0; var2 < this.field2659[arg0].length; var2++) {
            this.field2659[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fu.b(I)V")
    public void method3009() {
        for (int var1 = 0; var1 < this.field2659.length; var1++) {
            if (this.field2659[var1] != null) {
                for (int var2 = 0; var2 < this.field2659[var1].length; var2++) {
                    this.field2659[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fu.p(I[IB)Z")
    public boolean method3010(int arg0, int[] arg1) {
        if (this.field2658[arg0] == null) {
            return false;
        }
        int var3 = this.field2661[arg0];
        int[] var4 = this.field2655[arg0];
        Object[] var5 = this.field2659[arg0];
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
            var8 = Statics.method1571(this.field2658[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2345(arg1, 5, var9.field1974.length);
        } else {
            var8 = Statics.method1571(this.field2658[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1924(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method615(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class119.method615(var8, 0, var17);
            throw class148.method599(var34, var16 + var18 + "," + this.field2652[arg0] + "," + this.field2657);
        }
        if (this.field2662) {
            this.field2658[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class119 var22 = new class119(var10);
            int[] var23 = new int[var3];
            var22.field1973 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2331();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1973 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2331();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2650) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class125.method161(var27[var33], false);
                }
            }
        } else if (this.field2650) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method161(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fu.r(Ljava/lang/String;S)I")
    public int method3005(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2651.method3423(class163.method2245(var2));
    }

    @ObfuscatedName("fu.x(ILjava/lang/String;I)I")
    public int method3012(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2660[arg0].method3423(class163.method2245(var3));
    }

    @ObfuscatedName("fu.h(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3013(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2651.method3423(class163.method2245(var3));
        int var6 = this.field2660[var5].method3423(class163.method2245(var4));
        return this.method3045(var5, var6);
    }

    @ObfuscatedName("fu.j(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3014(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2651.method3423(class163.method2245(var3));
        int var6 = this.field2660[var5].method3423(class163.method2245(var4));
        return this.method2998(var5, var6);
    }

    @ObfuscatedName("fu.v(Ljava/lang/String;B)Z")
    public boolean method3015(String arg0) {
        int var2 = this.method3005("");
        return var2 == -1 ? this.method3014(arg0, "") : this.method3014("", arg0);
    }

    @ObfuscatedName("fu.l(Ljava/lang/String;B)V")
    public void method2997(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2651.method3423(class163.method2245(var2));
        if (var3 >= 0) {
            this.method3011(var3);
        }
    }

    @ObfuscatedName("co.u([BI)[B")
    public static final byte[] method1924(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2326();
        int var3 = var1.method2331();
        if (var3 < 0 || !(field2664 == 0 || var3 <= field2664)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2333(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2331();
            if (var5 < 0 || field2664 != 0 && var5 > field2664) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2274(var6, var5, arg0, var3, 9);
            } else {
                field2654.method2266(var1, var6);
            }
            return var6;
        }
    }
}
