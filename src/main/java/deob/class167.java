package deob;

@ObfuscatedName("fx")
public abstract class class167 {

    @ObfuscatedName("fx.m")
    public int field2663;

    @ObfuscatedName("fx.l")
    public int[] field2648;

    @ObfuscatedName("fx.y")
    public int[] field2664;

    @ObfuscatedName("fx.u")
    public class192 field2656;

    @ObfuscatedName("fx.k")
    public int[] field2647;

    @ObfuscatedName("fx.j")
    public int[] field2652;

    @ObfuscatedName("fx.i")
    public int[] field2653;

    @ObfuscatedName("fx.x")
    public int[][] field2654;

    @ObfuscatedName("fx.g")
    public int[][] field2655;

    @ObfuscatedName("fx.e")
    public class192[] field2651;

    @ObfuscatedName("fx.p")
    public Object[] field2657;

    @ObfuscatedName("fx.a")
    public Object[][] field2658;

    @ObfuscatedName("fx.v")
    public static class116 field2659 = new class116();

    @ObfuscatedName("fx.c")
    public int field2650;

    @ObfuscatedName("fx.s")
    public boolean field2660;

    @ObfuscatedName("fx.r")
    public boolean field2649;

    @ObfuscatedName("fx.h")
    public static int field2661 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2660 = arg0;
        this.field2649 = arg1;
    }

    @ObfuscatedName("fx.m([BS)V")
    public void method3088(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method2988(arg0, 0, var2);
        this.field2650 = var3;
        class119 var4 = new class119(method2780(arg0));
        int var5 = var4.method2562();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2386();
        }
        int var6 = var4.method2562();
        if (var5 >= 7) {
            this.field2663 = var4.method2568();
        } else {
            this.field2663 = var4.method2541();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2648 = new int[this.field2663];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2663; var9++) {
                this.field2648[var9] = var7 += var4.method2568();
                if (this.field2648[var9] > var8) {
                    var8 = this.field2648[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2663; var10++) {
                this.field2648[var10] = var7 += var4.method2541();
                if (this.field2648[var10] > var8) {
                    var8 = this.field2648[var10];
                }
            }
        }
        this.field2647 = new int[var8 + 1];
        this.field2652 = new int[var8 + 1];
        this.field2653 = new int[var8 + 1];
        this.field2654 = new int[var8 + 1][];
        this.field2657 = new Object[var8 + 1];
        this.field2658 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2664 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2663; var11++) {
                this.field2664[this.field2648[var11]] = var4.method2386();
            }
            this.field2656 = new class192(this.field2664);
        }
        for (int var12 = 0; var12 < this.field2663; var12++) {
            this.field2647[this.field2648[var12]] = var4.method2386();
        }
        for (int var13 = 0; var13 < this.field2663; var13++) {
            this.field2652[this.field2648[var13]] = var4.method2386();
        }
        for (int var14 = 0; var14 < this.field2663; var14++) {
            this.field2653[this.field2648[var14]] = var4.method2541();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2663; var15++) {
                int var16 = this.field2648[var15];
                int var17 = this.field2653[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2654[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2654[var16][var20] = var18 += var4.method2568();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2658[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2663; var22++) {
                int var23 = this.field2648[var22];
                int var24 = this.field2653[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2654[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2654[var23][var27] = var25 += var4.method2541();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2658[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2655 = new int[var8 + 1][];
        this.field2651 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2663; var29++) {
            int var30 = this.field2648[var29];
            int var31 = this.field2653[var30];
            this.field2655[var30] = new int[this.field2658[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2655[var30][this.field2654[var30][var32]] = var4.method2386();
            }
            this.field2651[var30] = new class192(this.field2655[var30]);
        }
    }

    @ObfuscatedName("fx.l(IB)V")
    public void method3124(int arg0) {
    }

    @ObfuscatedName("fx.y(IIS)[B")
    public byte[] method3080(int arg0, int arg1) {
        return this.method3082(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fx.u(II[II)[B")
    public byte[] method3082(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return null;
        }
        if (this.field2658[arg0][arg1] == null) {
            boolean var4 = this.method3100(arg0, arg2);
            if (!var4) {
                this.method3131(arg0);
                boolean var5 = this.method3100(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method119(this.field2658[arg0][arg1], false);
        if (this.field2649) {
            this.field2658[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fx.k(IIB)Z")
    public boolean method3095(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return false;
        } else if (this.field2658[arg0][arg1] != null) {
            return true;
        } else if (this.field2657[arg0] == null) {
            this.method3131(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.j(IB)Z")
    public boolean method3078(int arg0) {
        if (this.field2657[arg0] == null) {
            this.method3131(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fx.i(B)Z")
    public boolean method3084() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2648.length; var2++) {
            int var3 = this.field2648[var2];
            if (this.field2657[var3] == null) {
                this.method3131(var3);
                if (this.field2657[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fx.x(II)[B")
    public byte[] method3094(int arg0) {
        if (this.field2658.length == 1) {
            return this.method3080(0, arg0);
        } else if (this.field2658[arg0].length == 1) {
            return this.method3080(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.g(IIB)[B")
    public byte[] method3086(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return null;
        }
        if (this.field2658[arg0][arg1] == null) {
            boolean var3 = this.method3100(arg0, (int[]) null);
            if (!var3) {
                this.method3131(arg0);
                boolean var4 = this.method3100(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method119(this.field2658[arg0][arg1], false);
    }

    @ObfuscatedName("fx.e(IB)[B")
    public byte[] method3151(int arg0) {
        if (this.field2658.length == 1) {
            return this.method3086(0, arg0);
        } else if (this.field2658[arg0].length == 1) {
            return this.method3086(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fx.p(IB)V")
    public void method3131(int arg0) {
    }

    @ObfuscatedName("fx.a(II)[I")
    public int[] method3121(int arg0) {
        return this.field2654[arg0];
    }

    @ObfuscatedName("fx.v(II)I")
    public int method3090(int arg0) {
        return this.field2658[arg0].length;
    }

    @ObfuscatedName("fx.c(I)I")
    public int method3091() {
        return this.field2658.length;
    }

    @ObfuscatedName("fx.s(II)V")
    public void method3092(int arg0) {
        for (int var2 = 0; var2 < this.field2658[arg0].length; var2++) {
            this.field2658[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fx.r(I)V")
    public void method3160() {
        for (int var1 = 0; var1 < this.field2658.length; var1++) {
            if (this.field2658[var1] != null) {
                for (int var2 = 0; var2 < this.field2658[var1].length; var2++) {
                    this.field2658[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fx.h(I[IB)Z")
    public boolean method3100(int arg0, int[] arg1) {
        if (this.field2657[arg0] == null) {
            return false;
        }
        int var3 = this.field2653[arg0];
        int[] var4 = this.field2654[arg0];
        Object[] var5 = this.field2658[arg0];
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
            var8 = class125.method119(this.field2657[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2531(arg1, 5, var9.field1959.length);
        } else {
            var8 = class125.method119(this.field2657[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2780(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method2988(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class119.method2988(var8, 0, var17);
            throw class148.method3041(var34, var16 + var18 + "," + this.field2647[arg0] + "," + this.field2650);
        }
        if (this.field2660) {
            this.field2657[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class119 var22 = new class119(var10);
            int[] var23 = new int[var3];
            var22.field1955 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2386();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1955 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2386();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2649) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class125.method1818(var27[var33], false);
                }
            }
        } else if (this.field2649) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method1818(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fx.n(Ljava/lang/String;I)I")
    public int method3081(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2656.method3534(class163.method1527(var2));
    }

    @ObfuscatedName("fx.b(ILjava/lang/String;I)I")
    public int method3116(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2651[arg0].method3534(class163.method1527(var3));
    }

    @ObfuscatedName("fx.f(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3097(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2656.method3534(class163.method1527(var3));
        int var6 = this.field2651[var5].method3534(class163.method1527(var4));
        return this.method3080(var5, var6);
    }

    @ObfuscatedName("fx.d(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3132(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2656.method3534(class163.method1527(var3));
        int var6 = this.field2651[var5].method3534(class163.method1527(var4));
        return this.method3095(var5, var6);
    }

    @ObfuscatedName("fx.q(Ljava/lang/String;B)Z")
    public boolean method3099(String arg0) {
        int var2 = this.method3081("");
        return var2 == -1 ? this.method3132(arg0, "") : this.method3132("", arg0);
    }

    @ObfuscatedName("fx.o(Ljava/lang/String;I)V")
    public void method3118(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2656.method3534(class163.method1527(var2));
        if (var3 >= 0) {
            this.method3124(var3);
        }
    }

    @ObfuscatedName("eh.w([BB)[B")
    public static final byte[] method2780(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2562();
        int var3 = var1.method2386();
        if (var3 < 0 || !(field2661 == 0 || var3 <= field2661)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2392(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2386();
            if (var5 < 0 || field2661 != 0 && var5 > field2661) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2330(var6, var5, arg0, var3, 9);
            } else {
                field2659.method2328(var1, var6);
            }
            return var6;
        }
    }
}
