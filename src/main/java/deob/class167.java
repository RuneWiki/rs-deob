package deob;

@ObfuscatedName("fo")
public abstract class class167 {

    @ObfuscatedName("fo.k")
    public int field2668;

    @ObfuscatedName("fo.h")
    public int[] field2658;

    @ObfuscatedName("fo.o")
    public int[] field2670;

    @ObfuscatedName("fo.z")
    public class192 field2659;

    @ObfuscatedName("fo.c")
    public int[] field2661;

    @ObfuscatedName("fo.d")
    public int[] field2662;

    @ObfuscatedName("fo.l")
    public int[] field2667;

    @ObfuscatedName("fo.b")
    public int[][] field2663;

    @ObfuscatedName("fo.j")
    public int[][] field2665;

    @ObfuscatedName("fo.f")
    public class192[] field2669;

    @ObfuscatedName("fo.i")
    public Object[] field2657;

    @ObfuscatedName("fo.g")
    public Object[][] field2673;

    @ObfuscatedName("fo.t")
    public static class116 field2664 = new class116();

    @ObfuscatedName("fo.e")
    public int field2666;

    @ObfuscatedName("fo.q")
    public boolean field2671;

    @ObfuscatedName("fo.u")
    public boolean field2672;

    @ObfuscatedName("fo.r")
    public static int field2660 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2671 = arg0;
        this.field2672 = arg1;
    }

    @ObfuscatedName("fo.k([BI)V")
    public void method3047(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method3151(arg0, 0, var2);
        this.field2666 = var3;
        class119 var4 = new class119(method808(arg0));
        int var5 = var4.method2330();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2415();
        }
        int var6 = var4.method2330();
        if (var5 >= 7) {
            this.field2668 = var4.method2343();
        } else {
            this.field2668 = var4.method2332();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2658 = new int[this.field2668];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2668; var9++) {
                this.field2658[var9] = var7 += var4.method2343();
                if (this.field2658[var9] > var8) {
                    var8 = this.field2658[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2668; var10++) {
                this.field2658[var10] = var7 += var4.method2332();
                if (this.field2658[var10] > var8) {
                    var8 = this.field2658[var10];
                }
            }
        }
        this.field2661 = new int[var8 + 1];
        this.field2662 = new int[var8 + 1];
        this.field2667 = new int[var8 + 1];
        this.field2663 = new int[var8 + 1][];
        this.field2657 = new Object[var8 + 1];
        this.field2673 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2670 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2668; var11++) {
                this.field2670[this.field2658[var11]] = var4.method2415();
            }
            this.field2659 = new class192(this.field2670);
        }
        for (int var12 = 0; var12 < this.field2668; var12++) {
            this.field2661[this.field2658[var12]] = var4.method2415();
        }
        for (int var13 = 0; var13 < this.field2668; var13++) {
            this.field2662[this.field2658[var13]] = var4.method2415();
        }
        for (int var14 = 0; var14 < this.field2668; var14++) {
            this.field2667[this.field2658[var14]] = var4.method2332();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2668; var15++) {
                int var16 = this.field2658[var15];
                int var17 = this.field2667[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2663[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2663[var16][var20] = var18 += var4.method2343();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2673[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2668; var22++) {
                int var23 = this.field2658[var22];
                int var24 = this.field2667[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2663[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2663[var23][var27] = var25 += var4.method2332();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2673[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2665 = new int[var8 + 1][];
        this.field2669 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2668; var29++) {
            int var30 = this.field2658[var29];
            int var31 = this.field2667[var30];
            this.field2665[var30] = new int[this.field2673[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2665[var30][this.field2663[var30][var32]] = var4.method2415();
            }
            this.field2669[var30] = new class192(this.field2665[var30]);
        }
    }

    @ObfuscatedName("fo.h(II)V")
    public void method3121(int arg0) {
    }

    @ObfuscatedName("fo.o(IIB)[B")
    public byte[] method3118(int arg0, int arg1) {
        return this.method3058(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fo.z(II[IB)[B")
    public byte[] method3058(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2673.length || this.field2673[arg0] == null || arg1 < 0 || arg1 >= this.field2673[arg0].length) {
            return null;
        }
        if (this.field2673[arg0][arg1] == null) {
            boolean var4 = this.method3053(arg0, arg2);
            if (!var4) {
                this.method3123(arg0);
                boolean var5 = this.method3053(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2826(this.field2673[arg0][arg1], false);
        if (this.field2672) {
            this.field2673[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fo.c(III)Z")
    public boolean method3051(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2673.length || this.field2673[arg0] == null || arg1 < 0 || arg1 >= this.field2673[arg0].length) {
            return false;
        } else if (this.field2673[arg0][arg1] != null) {
            return true;
        } else if (this.field2657[arg0] == null) {
            this.method3123(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.d(II)Z")
    public boolean method3052(int arg0) {
        if (this.field2657[arg0] == null) {
            this.method3123(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.l(I)Z")
    public boolean method3063() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2658.length; var2++) {
            int var3 = this.field2658[var2];
            if (this.field2657[var3] == null) {
                this.method3123(var3);
                if (this.field2657[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fo.b(II)[B")
    public byte[] method3049(int arg0) {
        if (this.field2673.length == 1) {
            return this.method3118(0, arg0);
        } else if (this.field2673[arg0].length == 1) {
            return this.method3118(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.j(III)[B")
    public byte[] method3089(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2673.length || this.field2673[arg0] == null || arg1 < 0 || arg1 >= this.field2673[arg0].length) {
            return null;
        }
        if (this.field2673[arg0][arg1] == null) {
            boolean var3 = this.method3053(arg0, (int[]) null);
            if (!var3) {
                this.method3123(arg0);
                boolean var4 = this.method3053(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2826(this.field2673[arg0][arg1], false);
    }

    @ObfuscatedName("fo.f(II)[B")
    public byte[] method3057(int arg0) {
        if (this.field2673.length == 1) {
            return this.method3089(0, arg0);
        } else if (this.field2673[arg0].length == 1) {
            return this.method3089(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.i(IB)V")
    public void method3123(int arg0) {
    }

    @ObfuscatedName("fo.g(IB)[I")
    public int[] method3125(int arg0) {
        return this.field2663[arg0];
    }

    @ObfuscatedName("fo.t(IB)I")
    public int method3059(int arg0) {
        return this.field2673[arg0].length;
    }

    @ObfuscatedName("fo.e(S)I")
    public int method3060() {
        return this.field2673.length;
    }

    @ObfuscatedName("fo.q(II)V")
    public void method3061(int arg0) {
        for (int var2 = 0; var2 < this.field2673[arg0].length; var2++) {
            this.field2673[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fo.u(I)V")
    public void method3062() {
        for (int var1 = 0; var1 < this.field2673.length; var1++) {
            if (this.field2673[var1] != null) {
                for (int var2 = 0; var2 < this.field2673[var1].length; var2++) {
                    this.field2673[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fo.r(I[II)Z")
    public boolean method3053(int arg0, int[] arg1) {
        if (this.field2657[arg0] == null) {
            return false;
        }
        int var3 = this.field2667[arg0];
        int[] var4 = this.field2663[arg0];
        Object[] var5 = this.field2673[arg0];
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
            var8 = class125.method2826(this.field2657[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2348(arg1, 5, var9.field1960.length);
        } else {
            var8 = class125.method2826(this.field2657[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method808(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method3151(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method3151(var8, 0, var18);
            throw Statics.method2663(var35, var17 + var19 + "," + this.field2661[arg0] + "," + this.field2666);
        }
        if (this.field2671) {
            this.field2657[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1949 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2415();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1949 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2415();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2672) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method1526(var28[var34], false);
                }
            }
        } else if (this.field2672) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method1526(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fo.a(Ljava/lang/String;B)I")
    public int method3064(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2659.method3508(class163.method544(var2));
    }

    @ObfuscatedName("fo.m(ILjava/lang/String;B)I")
    public int method3065(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2669[arg0].method3508(class163.method544(var3));
    }

    @ObfuscatedName("fo.y(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3066(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2659.method3508(class163.method544(var3));
        int var6 = this.field2669[var5].method3508(class163.method544(var4));
        return this.method3118(var5, var6);
    }

    @ObfuscatedName("fo.x(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3067(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2659.method3508(class163.method544(var3));
        int var6 = this.field2669[var5].method3508(class163.method544(var4));
        return this.method3051(var5, var6);
    }

    @ObfuscatedName("fo.n(Ljava/lang/String;I)Z")
    public boolean method3048(String arg0) {
        int var2 = this.method3064("");
        return var2 == -1 ? this.method3067(arg0, "") : this.method3067("", arg0);
    }

    @ObfuscatedName("fo.v(Ljava/lang/String;B)V")
    public void method3069(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2659.method3508(class163.method544(var2));
        if (var3 >= 0) {
            this.method3121(var3);
        }
    }

    @ObfuscatedName("ah.s([BB)[B")
    public static final byte[] method808(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2330();
        int var3 = var1.method2415();
        if (var3 < 0 || !(field2660 == 0 || var3 <= field2660)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2340(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2415();
            if (var5 < 0 || field2660 != 0 && var5 > field2660) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2278(var6, var5, arg0, var3, 9);
            } else {
                field2664.method2274(var1, var6);
            }
            return var6;
        }
    }
}
