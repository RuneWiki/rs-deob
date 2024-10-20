package deob;

@ObfuscatedName("fz")
public abstract class class167 {

    @ObfuscatedName("fz.a")
    public int field2659;

    @ObfuscatedName("fz.r")
    public int[] field2658;

    @ObfuscatedName("fz.f")
    public int[] field2671;

    @ObfuscatedName("fz.s")
    public class192 field2660;

    @ObfuscatedName("fz.y")
    public int[] field2657;

    @ObfuscatedName("fz.e")
    public int[] field2662;

    @ObfuscatedName("fz.g")
    public int[] field2663;

    @ObfuscatedName("fz.m")
    public int[][] field2664;

    @ObfuscatedName("fz.j")
    public int[][] field2665;

    @ObfuscatedName("fz.n")
    public class192[] field2661;

    @ObfuscatedName("fz.l")
    public Object[] field2667;

    @ObfuscatedName("fz.h")
    public Object[][] field2668;

    @ObfuscatedName("fz.i")
    public static class116 field2669 = new class116();

    @ObfuscatedName("fz.v")
    public int field2666;

    @ObfuscatedName("fz.z")
    public boolean field2670;

    @ObfuscatedName("fz.u")
    public boolean field2674;

    @ObfuscatedName("fz.t")
    public static int field2673 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2670 = arg0;
        this.field2674 = arg1;
    }

    @ObfuscatedName("fz.a([BB)V")
    public void method3105(byte[] arg0) {
        this.field2666 = class119.method710(arg0, arg0.length);
        class119 var2 = new class119(method2909(arg0));
        int var3 = var2.method2412();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2350();
        }
        int var4 = var2.method2412();
        if (var3 >= 7) {
            this.field2659 = var2.method2359();
        } else {
            this.field2659 = var2.method2347();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2658 = new int[this.field2659];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2659; var7++) {
                this.field2658[var7] = var5 += var2.method2359();
                if (this.field2658[var7] > var6) {
                    var6 = this.field2658[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2659; var8++) {
                this.field2658[var8] = var5 += var2.method2347();
                if (this.field2658[var8] > var6) {
                    var6 = this.field2658[var8];
                }
            }
        }
        this.field2657 = new int[var6 + 1];
        this.field2662 = new int[var6 + 1];
        this.field2663 = new int[var6 + 1];
        this.field2664 = new int[var6 + 1][];
        this.field2667 = new Object[var6 + 1];
        this.field2668 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2671 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2659; var9++) {
                this.field2671[this.field2658[var9]] = var2.method2350();
            }
            this.field2660 = new class192(this.field2671);
        }
        for (int var10 = 0; var10 < this.field2659; var10++) {
            this.field2657[this.field2658[var10]] = var2.method2350();
        }
        for (int var11 = 0; var11 < this.field2659; var11++) {
            this.field2662[this.field2658[var11]] = var2.method2350();
        }
        for (int var12 = 0; var12 < this.field2659; var12++) {
            this.field2663[this.field2658[var12]] = var2.method2347();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2659; var13++) {
                int var14 = this.field2658[var13];
                int var15 = this.field2663[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2664[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2664[var14][var18] = var16 += var2.method2359();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2668[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2659; var20++) {
                int var21 = this.field2658[var20];
                int var22 = this.field2663[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2664[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2664[var21][var25] = var23 += var2.method2347();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2668[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2665 = new int[var6 + 1][];
        this.field2661 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2659; var27++) {
            int var28 = this.field2658[var27];
            int var29 = this.field2663[var28];
            this.field2665[var28] = new int[this.field2668[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2665[var28][this.field2664[var28][var30]] = var2.method2350();
            }
            this.field2661[var28] = new class192(this.field2665[var28]);
        }
    }

    @ObfuscatedName("fz.r(II)V")
    public void method3024(int arg0) {
    }

    @ObfuscatedName("fz.f(IIB)[B")
    public byte[] method3025(int arg0, int arg1) {
        return this.method3073(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fz.s(II[II)[B")
    public byte[] method3073(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2668.length || this.field2668[arg0] == null || arg1 < 0 || arg1 >= this.field2668[arg0].length) {
            return null;
        }
        if (this.field2668[arg0][arg1] == null) {
            boolean var4 = this.method3039(arg0, arg2);
            if (!var4) {
                this.method3033(arg0);
                boolean var5 = this.method3039(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method1560(this.field2668[arg0][arg1], false);
        if (this.field2674) {
            this.field2668[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fz.y(III)Z")
    public boolean method3027(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2668.length || this.field2668[arg0] == null || arg1 < 0 || arg1 >= this.field2668[arg0].length) {
            return false;
        } else if (this.field2668[arg0][arg1] != null) {
            return true;
        } else if (this.field2667[arg0] == null) {
            this.method3033(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fz.e(IB)Z")
    public boolean method3057(int arg0) {
        if (this.field2667[arg0] == null) {
            this.method3033(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fz.g(B)Z")
    public boolean method3029() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2658.length; var2++) {
            int var3 = this.field2658[var2];
            if (this.field2667[var3] == null) {
                this.method3033(var3);
                if (this.field2667[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fz.m(II)[B")
    public byte[] method3030(int arg0) {
        if (this.field2668.length == 1) {
            return this.method3025(0, arg0);
        } else if (this.field2668[arg0].length == 1) {
            return this.method3025(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fz.j(IIB)[B")
    public byte[] method3061(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2668.length || this.field2668[arg0] == null || arg1 < 0 || arg1 >= this.field2668[arg0].length) {
            return null;
        }
        if (this.field2668[arg0][arg1] == null) {
            boolean var3 = this.method3039(arg0, (int[]) null);
            if (!var3) {
                this.method3033(arg0);
                boolean var4 = this.method3039(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method1560(this.field2668[arg0][arg1], false);
    }

    @ObfuscatedName("fz.n(II)[B")
    public byte[] method3032(int arg0) {
        if (this.field2668.length == 1) {
            return this.method3061(0, arg0);
        } else if (this.field2668[arg0].length == 1) {
            return this.method3061(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fz.l(IS)V")
    public void method3033(int arg0) {
    }

    @ObfuscatedName("fz.h(IB)[I")
    public int[] method3034(int arg0) {
        return this.field2664[arg0];
    }

    @ObfuscatedName("fz.i(II)I")
    public int method3035(int arg0) {
        return this.field2668[arg0].length;
    }

    @ObfuscatedName("fz.v(S)I")
    public int method3049() {
        return this.field2668.length;
    }

    @ObfuscatedName("fz.z(II)V")
    public void method3093(int arg0) {
        for (int var2 = 0; var2 < this.field2668[arg0].length; var2++) {
            this.field2668[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fz.u(I)V")
    public void method3038() {
        for (int var1 = 0; var1 < this.field2668.length; var1++) {
            if (this.field2668[var1] != null) {
                for (int var2 = 0; var2 < this.field2668[var1].length; var2++) {
                    this.field2668[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fz.t(I[II)Z")
    public boolean method3039(int arg0, int[] arg1) {
        if (this.field2667[arg0] == null) {
            return false;
        }
        int var3 = this.field2663[arg0];
        int[] var4 = this.field2664[arg0];
        Object[] var5 = this.field2668[arg0];
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
            var8 = class125.method1560(this.field2667[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2364(arg1, 5, var9.field1981.length);
        } else {
            var8 = class125.method1560(this.field2667[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2909(var8);
        } catch (RuntimeException var27) {
            throw class148.method2639(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method710(var8, var8.length) + "," + class119.method710(var8, var8.length - 2) + "," + this.field2657[arg0] + "," + this.field2666);
        }
        if (this.field2670) {
            this.field2667[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class119 var15 = new class119(var10);
            int[] var16 = new int[var3];
            var15.field1980 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2350();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1980 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2350();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2674) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method52(var20[var26], false);
                }
            }
        } else if (this.field2674) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method52(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fz.b(Ljava/lang/String;I)I")
    public int method3040(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2660.method3505(class163.method2617(var2));
    }

    @ObfuscatedName("fz.c(ILjava/lang/String;B)I")
    public int method3090(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2661[arg0].method3505(class163.method2617(var3));
    }

    @ObfuscatedName("fz.x(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3042(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2660.method3505(class163.method2617(var3));
        int var6 = this.field2661[var5].method3505(class163.method2617(var4));
        return this.method3025(var5, var6);
    }

    @ObfuscatedName("fz.d(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3043(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2660.method3505(class163.method2617(var3));
        int var6 = this.field2661[var5].method3505(class163.method2617(var4));
        return this.method3027(var5, var6);
    }

    @ObfuscatedName("fz.p(Ljava/lang/String;B)Z")
    public boolean method3037(String arg0) {
        int var2 = this.method3040("");
        return var2 == -1 ? this.method3043(arg0, "") : this.method3043("", arg0);
    }

    @ObfuscatedName("fz.q(Ljava/lang/String;I)V")
    public void method3045(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2660.method3505(class163.method2617(var2));
        if (var3 >= 0) {
            this.method3024(var3);
        }
    }

    @ObfuscatedName("el.w([BB)[B")
    public static final byte[] method2909(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2412();
        int var3 = var1.method2350();
        if (var3 < 0 || !(field2673 == 0 || var3 <= field2673)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2339(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2350();
            if (var5 < 0 || field2673 != 0 && var5 > field2673) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2290(var6, var5, arg0, var3, 9);
            } else {
                field2669.method2286(var1, var6);
            }
            return var6;
        }
    }
}
