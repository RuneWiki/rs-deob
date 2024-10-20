package deob;

@ObfuscatedName("fm")
public abstract class class167 {

    @ObfuscatedName("fm.n")
    public int field2660;

    @ObfuscatedName("fm.d")
    public int[] field2653;

    @ObfuscatedName("fm.s")
    public int[] field2663;

    @ObfuscatedName("fm.q")
    public class192 field2655;

    @ObfuscatedName("fm.j")
    public int[] field2656;

    @ObfuscatedName("fm.k")
    public int[] field2657;

    @ObfuscatedName("fm.i")
    public int[] field2652;

    @ObfuscatedName("fm.m")
    public int[][] field2666;

    @ObfuscatedName("fm.p")
    public int[][] field2658;

    @ObfuscatedName("fm.h")
    public class192[] field2661;

    @ObfuscatedName("fm.e")
    public Object[] field2662;

    @ObfuscatedName("fm.g")
    public Object[][] field2665;

    @ObfuscatedName("fm.b")
    public static class116 field2664 = new class116();

    @ObfuscatedName("fm.f")
    public int field2659;

    @ObfuscatedName("fm.y")
    public boolean field2654;

    @ObfuscatedName("fm.z")
    public boolean field2667;

    @ObfuscatedName("fm.t")
    public static int field2668 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2654 = arg0;
        this.field2667 = arg1;
    }

    @ObfuscatedName("fm.n([BI)V")
    public void method3071(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method693(arg0, 0, var2);
        this.field2659 = var3;
        class119 var4 = new class119(method2662(arg0));
        int var5 = var4.method2338();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2343();
        }
        int var6 = var4.method2338();
        if (var5 >= 7) {
            this.field2660 = var4.method2352();
        } else {
            this.field2660 = var4.method2377();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2653 = new int[this.field2660];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2660; var9++) {
                this.field2653[var9] = var7 += var4.method2352();
                if (this.field2653[var9] > var8) {
                    var8 = this.field2653[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2660; var10++) {
                this.field2653[var10] = var7 += var4.method2377();
                if (this.field2653[var10] > var8) {
                    var8 = this.field2653[var10];
                }
            }
        }
        this.field2656 = new int[var8 + 1];
        this.field2657 = new int[var8 + 1];
        this.field2652 = new int[var8 + 1];
        this.field2666 = new int[var8 + 1][];
        this.field2662 = new Object[var8 + 1];
        this.field2665 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2663 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2660; var11++) {
                this.field2663[this.field2653[var11]] = var4.method2343();
            }
            this.field2655 = new class192(this.field2663);
        }
        for (int var12 = 0; var12 < this.field2660; var12++) {
            this.field2656[this.field2653[var12]] = var4.method2343();
        }
        for (int var13 = 0; var13 < this.field2660; var13++) {
            this.field2657[this.field2653[var13]] = var4.method2343();
        }
        for (int var14 = 0; var14 < this.field2660; var14++) {
            this.field2652[this.field2653[var14]] = var4.method2377();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2660; var15++) {
                int var16 = this.field2653[var15];
                int var17 = this.field2652[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2666[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2666[var16][var20] = var18 += var4.method2352();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2665[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2660; var22++) {
                int var23 = this.field2653[var22];
                int var24 = this.field2652[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2666[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2666[var23][var27] = var25 += var4.method2377();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2665[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2658 = new int[var8 + 1][];
        this.field2661 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2660; var29++) {
            int var30 = this.field2653[var29];
            int var31 = this.field2652[var30];
            this.field2658[var30] = new int[this.field2665[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2658[var30][this.field2666[var30][var32]] = var4.method2343();
            }
            this.field2661[var30] = new class192(this.field2658[var30]);
        }
    }

    @ObfuscatedName("fm.d(II)V")
    public void method3009(int arg0) {
    }

    @ObfuscatedName("fm.s(III)[B")
    public byte[] method3010(int arg0, int arg1) {
        return this.method3011(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fm.q(II[IB)[B")
    public byte[] method3011(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var4 = this.method3015(arg0, arg2);
            if (!var4) {
                this.method3049(arg0);
                boolean var5 = this.method3015(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method696(this.field2665[arg0][arg1], false);
        if (this.field2667) {
            this.field2665[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fm.j(III)Z")
    public boolean method3012(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return false;
        } else if (this.field2665[arg0][arg1] != null) {
            return true;
        } else if (this.field2662[arg0] == null) {
            this.method3049(arg0);
            return this.field2662[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fm.k(II)Z")
    public boolean method3055(int arg0) {
        if (this.field2662[arg0] == null) {
            this.method3049(arg0);
            return this.field2662[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fm.i(I)Z")
    public boolean method3063() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2653.length; var2++) {
            int var3 = this.field2653[var2];
            if (this.field2662[var3] == null) {
                this.method3049(var3);
                if (this.field2662[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fm.m(II)[B")
    public byte[] method3059(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3010(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3010(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fm.p(III)[B")
    public byte[] method3016(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var3 = this.method3015(arg0, (int[]) null);
            if (!var3) {
                this.method3049(arg0);
                boolean var4 = this.method3015(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method696(this.field2665[arg0][arg1], false);
    }

    @ObfuscatedName("fm.h(II)[B")
    public byte[] method3017(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3016(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3016(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fm.e(IS)V")
    public void method3049(int arg0) {
    }

    @ObfuscatedName("fm.g(IB)[I")
    public int[] method3019(int arg0) {
        return this.field2666[arg0];
    }

    @ObfuscatedName("fm.b(II)I")
    public int method3020(int arg0) {
        return this.field2665[arg0].length;
    }

    @ObfuscatedName("fm.f(I)I")
    public int method3045() {
        return this.field2665.length;
    }

    @ObfuscatedName("fm.y(II)V")
    public void method3022(int arg0) {
        for (int var2 = 0; var2 < this.field2665[arg0].length; var2++) {
            this.field2665[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fm.z(B)V")
    public void method3023() {
        for (int var1 = 0; var1 < this.field2665.length; var1++) {
            if (this.field2665[var1] != null) {
                for (int var2 = 0; var2 < this.field2665[var1].length; var2++) {
                    this.field2665[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fm.t(I[II)Z")
    public boolean method3015(int arg0, int[] arg1) {
        if (this.field2662[arg0] == null) {
            return false;
        }
        int var3 = this.field2652[arg0];
        int[] var4 = this.field2666[arg0];
        Object[] var5 = this.field2665[arg0];
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
            var8 = class125.method696(this.field2662[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2357(arg1, 5, var9.field1981.length);
        } else {
            var8 = class125.method696(this.field2662[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2662(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method693(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method693(var8, 0, var18);
            throw class148.method2797(var35, var17 + var19 + "," + this.field2656[arg0] + "," + this.field2659);
        }
        if (this.field2654) {
            this.field2662[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1977 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2343();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1977 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2343();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2667) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method1463(var28[var34], false);
                }
            }
        } else if (this.field2667) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method1463(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fm.o(Ljava/lang/String;B)I")
    public int method3024(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2655.method3476(class163.method2912(var2));
    }

    @ObfuscatedName("fm.r(ILjava/lang/String;I)I")
    public int method3026(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2661[arg0].method3476(class163.method2912(var3));
    }

    @ObfuscatedName("fm.u(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3027(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2655.method3476(class163.method2912(var3));
        int var6 = this.field2661[var5].method3476(class163.method2912(var4));
        return this.method3010(var5, var6);
    }

    @ObfuscatedName("fm.v(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3028(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2655.method3476(class163.method2912(var3));
        int var6 = this.field2661[var5].method3476(class163.method2912(var4));
        return this.method3012(var5, var6);
    }

    @ObfuscatedName("fm.a(Ljava/lang/String;I)Z")
    public boolean method3029(String arg0) {
        int var2 = this.method3024("");
        return var2 == -1 ? this.method3028(arg0, "") : this.method3028("", arg0);
    }

    @ObfuscatedName("fm.c(Ljava/lang/String;I)V")
    public void method3030(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2655.method3476(class163.method2912(var2));
        if (var3 >= 0) {
            this.method3009(var3);
        }
    }

    @ObfuscatedName("eb.l([BI)[B")
    public static final byte[] method2662(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2338();
        int var3 = var1.method2343();
        if (var3 < 0 || !(field2668 == 0 || var3 <= field2668)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2358(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2343();
            if (var5 < 0 || field2668 != 0 && var5 > field2668) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2305(var6, var5, arg0, var3, 9);
            } else {
                field2664.method2286(var1, var6);
            }
            return var6;
        }
    }
}
