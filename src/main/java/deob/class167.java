package deob;

@ObfuscatedName("fe")
public abstract class class167 {

    @ObfuscatedName("fe.i")
    public int field2673;

    @ObfuscatedName("fe.v")
    public int[] field2658;

    @ObfuscatedName("fe.r")
    public int[] field2657;

    @ObfuscatedName("fe.n")
    public class192 field2665;

    @ObfuscatedName("fe.x")
    public int[] field2674;

    @ObfuscatedName("fe.q")
    public int[] field2662;

    @ObfuscatedName("fe.h")
    public int[] field2663;

    @ObfuscatedName("fe.d")
    public int[][] field2664;

    @ObfuscatedName("fe.c")
    public int[][] field2666;

    @ObfuscatedName("fe.y")
    public class192[] field2668;

    @ObfuscatedName("fe.m")
    public Object[] field2667;

    @ObfuscatedName("fe.e")
    public Object[][] field2660;

    @ObfuscatedName("fe.z")
    public static class116 field2669 = new class116();

    @ObfuscatedName("fe.t")
    public int field2670;

    @ObfuscatedName("fe.b")
    public boolean field2671;

    @ObfuscatedName("fe.l")
    public boolean field2672;

    @ObfuscatedName("fe.s")
    public static int field2661 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2671 = arg0;
        this.field2672 = arg1;
    }

    @ObfuscatedName("fe.i([BS)V")
    public void method3033(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method3142(arg0, 0, var2);
        this.field2670 = var3;
        class119 var4 = new class119(method2690(arg0));
        int var5 = var4.method2380();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2350();
        }
        int var6 = var4.method2380();
        if (var5 >= 7) {
            this.field2673 = var4.method2363();
        } else {
            this.field2673 = var4.method2347();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2658 = new int[this.field2673];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2673; var9++) {
                this.field2658[var9] = var7 += var4.method2363();
                if (this.field2658[var9] > var8) {
                    var8 = this.field2658[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2673; var10++) {
                this.field2658[var10] = var7 += var4.method2347();
                if (this.field2658[var10] > var8) {
                    var8 = this.field2658[var10];
                }
            }
        }
        this.field2674 = new int[var8 + 1];
        this.field2662 = new int[var8 + 1];
        this.field2663 = new int[var8 + 1];
        this.field2664 = new int[var8 + 1][];
        this.field2667 = new Object[var8 + 1];
        this.field2660 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2657 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2673; var11++) {
                this.field2657[this.field2658[var11]] = var4.method2350();
            }
            this.field2665 = new class192(this.field2657);
        }
        for (int var12 = 0; var12 < this.field2673; var12++) {
            this.field2674[this.field2658[var12]] = var4.method2350();
        }
        for (int var13 = 0; var13 < this.field2673; var13++) {
            this.field2662[this.field2658[var13]] = var4.method2350();
        }
        for (int var14 = 0; var14 < this.field2673; var14++) {
            this.field2663[this.field2658[var14]] = var4.method2347();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2673; var15++) {
                int var16 = this.field2658[var15];
                int var17 = this.field2663[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2664[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2664[var16][var20] = var18 += var4.method2363();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2660[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2673; var22++) {
                int var23 = this.field2658[var22];
                int var24 = this.field2663[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2664[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2664[var23][var27] = var25 += var4.method2347();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2660[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2666 = new int[var8 + 1][];
        this.field2668 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2673; var29++) {
            int var30 = this.field2658[var29];
            int var31 = this.field2663[var30];
            this.field2666[var30] = new int[this.field2660[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2666[var30][this.field2664[var30][var32]] = var4.method2350();
            }
            this.field2668[var30] = new class192(this.field2666[var30]);
        }
    }

    @ObfuscatedName("fe.v(IB)V")
    public void method3034(int arg0) {
    }

    @ObfuscatedName("fe.r(III)[B")
    public byte[] method3035(int arg0, int arg1) {
        return this.method3036(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fe.n(II[II)[B")
    public byte[] method3036(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2660.length || this.field2660[arg0] == null || arg1 < 0 || arg1 >= this.field2660[arg0].length) {
            return null;
        }
        if (this.field2660[arg0][arg1] == null) {
            boolean var4 = this.method3048(arg0, arg2);
            if (!var4) {
                this.method3042(arg0);
                boolean var5 = this.method3048(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2595(this.field2660[arg0][arg1], false);
        if (this.field2672) {
            this.field2660[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fe.x(III)Z")
    public boolean method3063(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2660.length || this.field2660[arg0] == null || arg1 < 0 || arg1 >= this.field2660[arg0].length) {
            return false;
        } else if (this.field2660[arg0][arg1] != null) {
            return true;
        } else if (this.field2667[arg0] == null) {
            this.method3042(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fe.q(II)Z")
    public boolean method3038(int arg0) {
        if (this.field2667[arg0] == null) {
            this.method3042(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fe.h(B)Z")
    public boolean method3039() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2658.length; var2++) {
            int var3 = this.field2658[var2];
            if (this.field2667[var3] == null) {
                this.method3042(var3);
                if (this.field2667[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fe.d(II)[B")
    public byte[] method3077(int arg0) {
        if (this.field2660.length == 1) {
            return this.method3035(0, arg0);
        } else if (this.field2660[arg0].length == 1) {
            return this.method3035(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fe.c(III)[B")
    public byte[] method3064(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2660.length || this.field2660[arg0] == null || arg1 < 0 || arg1 >= this.field2660[arg0].length) {
            return null;
        }
        if (this.field2660[arg0][arg1] == null) {
            boolean var3 = this.method3048(arg0, (int[]) null);
            if (!var3) {
                this.method3042(arg0);
                boolean var4 = this.method3048(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2595(this.field2660[arg0][arg1], false);
    }

    @ObfuscatedName("fe.y(IB)[B")
    public byte[] method3060(int arg0) {
        if (this.field2660.length == 1) {
            return this.method3064(0, arg0);
        } else if (this.field2660[arg0].length == 1) {
            return this.method3064(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fe.m(II)V")
    public void method3042(int arg0) {
    }

    @ObfuscatedName("fe.e(II)[I")
    public int[] method3043(int arg0) {
        return this.field2664[arg0];
    }

    @ObfuscatedName("fe.z(II)I")
    public int method3044(int arg0) {
        return this.field2660[arg0].length;
    }

    @ObfuscatedName("fe.t(I)I")
    public int method3050() {
        return this.field2660.length;
    }

    @ObfuscatedName("fe.b(II)V")
    public void method3032(int arg0) {
        for (int var2 = 0; var2 < this.field2660[arg0].length; var2++) {
            this.field2660[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fe.l(I)V")
    public void method3089() {
        for (int var1 = 0; var1 < this.field2660.length; var1++) {
            if (this.field2660[var1] != null) {
                for (int var2 = 0; var2 < this.field2660[var1].length; var2++) {
                    this.field2660[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fe.s(I[II)Z")
    public boolean method3048(int arg0, int[] arg1) {
        if (this.field2667[arg0] == null) {
            return false;
        }
        int var3 = this.field2663[arg0];
        int[] var4 = this.field2664[arg0];
        Object[] var5 = this.field2660[arg0];
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
            var8 = class125.method2595(this.field2667[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2364(arg1, 5, var9.field1982.length);
        } else {
            var8 = class125.method2595(this.field2667[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2690(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method3142(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method3142(var8, 0, var18);
            throw class148.method2039(var35, var17 + var19 + "," + this.field2674[arg0] + "," + this.field2670);
        }
        if (this.field2671) {
            this.field2667[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1980 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2350();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1980 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2350();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2672) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method753(var28[var34], false);
                }
            }
        } else if (this.field2672) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method753(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fe.f(Ljava/lang/String;B)I")
    public int method3049(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2665.method3461(class163.method2653(var2));
    }

    @ObfuscatedName("fe.g(ILjava/lang/String;I)I")
    public int method3079(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2668[arg0].method3461(class163.method2653(var3));
    }

    @ObfuscatedName("fe.u(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3051(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2665.method3461(class163.method2653(var3));
        int var6 = this.field2668[var5].method3461(class163.method2653(var4));
        return this.method3035(var5, var6);
    }

    @ObfuscatedName("fe.o(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3106(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2665.method3461(class163.method2653(var3));
        int var6 = this.field2668[var5].method3461(class163.method2653(var4));
        return this.method3063(var5, var6);
    }

    @ObfuscatedName("fe.k(Ljava/lang/String;B)Z")
    public boolean method3068(String arg0) {
        int var2 = this.method3049("");
        return var2 == -1 ? this.method3106(arg0, "") : this.method3106("", arg0);
    }

    @ObfuscatedName("fe.a(Ljava/lang/String;B)V")
    public void method3075(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2665.method3461(class163.method2653(var2));
        if (var3 >= 0) {
            this.method3034(var3);
        }
    }

    @ObfuscatedName("ef.j([BI)[B")
    public static final byte[] method2690(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2380();
        int var3 = var1.method2350();
        if (var3 < 0 || !(field2661 == 0 || var3 <= field2661)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2351(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2350();
            if (var5 < 0 || field2661 != 0 && var5 > field2661) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2315(var6, var5, arg0, var3, 9);
            } else {
                field2669.method2296(var1, var6);
            }
            return var6;
        }
    }
}
