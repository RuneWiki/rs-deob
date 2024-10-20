package deob;

@ObfuscatedName("fn")
public abstract class class167 {

    @ObfuscatedName("fn.i")
    public int field2675;

    @ObfuscatedName("fn.v")
    public int[] field2660;

    @ObfuscatedName("fn.f")
    public int[] field2661;

    @ObfuscatedName("fn.h")
    public class192 field2662;

    @ObfuscatedName("fn.a")
    public int[] field2663;

    @ObfuscatedName("fn.s")
    public int[] field2664;

    @ObfuscatedName("fn.p")
    public int[] field2676;

    @ObfuscatedName("fn.r")
    public int[][] field2666;

    @ObfuscatedName("fn.k")
    public int[][] field2665;

    @ObfuscatedName("fn.d")
    public class192[] field2659;

    @ObfuscatedName("fn.n")
    public Object[] field2669;

    @ObfuscatedName("fn.z")
    public Object[][] field2670;

    @ObfuscatedName("fn.c")
    public static class116 field2671 = new class116();

    @ObfuscatedName("fn.b")
    public int field2672;

    @ObfuscatedName("fn.w")
    public boolean field2673;

    @ObfuscatedName("fn.g")
    public boolean field2674;

    @ObfuscatedName("fn.x")
    public static int field2678 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2673 = arg0;
        this.field2674 = arg1;
    }

    @ObfuscatedName("fn.i([BB)V")
    public void method3016(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method1990(arg0, 0, var2);
        this.field2672 = var3;
        class119 var4 = new class119(method687(arg0));
        int var5 = var4.method2310();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2315();
        }
        int var6 = var4.method2310();
        if (var5 >= 7) {
            this.field2675 = var4.method2478();
        } else {
            this.field2675 = var4.method2312();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2660 = new int[this.field2675];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2675; var9++) {
                this.field2660[var9] = var7 += var4.method2478();
                if (this.field2660[var9] > var8) {
                    var8 = this.field2660[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2675; var10++) {
                this.field2660[var10] = var7 += var4.method2312();
                if (this.field2660[var10] > var8) {
                    var8 = this.field2660[var10];
                }
            }
        }
        this.field2663 = new int[var8 + 1];
        this.field2664 = new int[var8 + 1];
        this.field2676 = new int[var8 + 1];
        this.field2666 = new int[var8 + 1][];
        this.field2669 = new Object[var8 + 1];
        this.field2670 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2661 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2675; var11++) {
                this.field2661[this.field2660[var11]] = var4.method2315();
            }
            this.field2662 = new class192(this.field2661);
        }
        for (int var12 = 0; var12 < this.field2675; var12++) {
            this.field2663[this.field2660[var12]] = var4.method2315();
        }
        for (int var13 = 0; var13 < this.field2675; var13++) {
            this.field2664[this.field2660[var13]] = var4.method2315();
        }
        for (int var14 = 0; var14 < this.field2675; var14++) {
            this.field2676[this.field2660[var14]] = var4.method2312();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2675; var15++) {
                int var16 = this.field2660[var15];
                int var17 = this.field2676[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2666[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2666[var16][var20] = var18 += var4.method2478();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2670[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2675; var22++) {
                int var23 = this.field2660[var22];
                int var24 = this.field2676[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2666[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2666[var23][var27] = var25 += var4.method2312();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2670[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2665 = new int[var8 + 1][];
        this.field2659 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2675; var29++) {
            int var30 = this.field2660[var29];
            int var31 = this.field2676[var30];
            this.field2665[var30] = new int[this.field2670[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2665[var30][this.field2666[var30][var32]] = var4.method2315();
            }
            this.field2659[var30] = new class192(this.field2665[var30]);
        }
    }

    @ObfuscatedName("fn.v(II)V")
    public void method3064(int arg0) {
    }

    @ObfuscatedName("fn.f(III)[B")
    public byte[] method3080(int arg0, int arg1) {
        return this.method3063(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fn.h(II[II)[B")
    public byte[] method3063(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2670.length || this.field2670[arg0] == null || arg1 < 0 || arg1 >= this.field2670[arg0].length) {
            return null;
        }
        if (this.field2670[arg0][arg1] == null) {
            boolean var4 = this.method3032(arg0, arg2);
            if (!var4) {
                this.method3049(arg0);
                boolean var5 = this.method3032(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2737(this.field2670[arg0][arg1], false);
        if (this.field2674) {
            this.field2670[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fn.a(III)Z")
    public boolean method3057(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2670.length || this.field2670[arg0] == null || arg1 < 0 || arg1 >= this.field2670[arg0].length) {
            return false;
        } else if (this.field2670[arg0][arg1] != null) {
            return true;
        } else if (this.field2669[arg0] == null) {
            this.method3049(arg0);
            return this.field2669[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fn.s(II)Z")
    public boolean method3052(int arg0) {
        if (this.field2669[arg0] == null) {
            this.method3049(arg0);
            return this.field2669[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fn.p(B)Z")
    public boolean method3022() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2660.length; var2++) {
            int var3 = this.field2660[var2];
            if (this.field2669[var3] == null) {
                this.method3049(var3);
                if (this.field2669[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fn.r(IB)[B")
    public byte[] method3023(int arg0) {
        if (this.field2670.length == 1) {
            return this.method3080(0, arg0);
        } else if (this.field2670[arg0].length == 1) {
            return this.method3080(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fn.k(III)[B")
    public byte[] method3024(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2670.length || this.field2670[arg0] == null || arg1 < 0 || arg1 >= this.field2670[arg0].length) {
            return null;
        }
        if (this.field2670[arg0][arg1] == null) {
            boolean var3 = this.method3032(arg0, (int[]) null);
            if (!var3) {
                this.method3049(arg0);
                boolean var4 = this.method3032(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2737(this.field2670[arg0][arg1], false);
    }

    @ObfuscatedName("fn.d(II)[B")
    public byte[] method3025(int arg0) {
        if (this.field2670.length == 1) {
            return this.method3024(0, arg0);
        } else if (this.field2670[arg0].length == 1) {
            return this.method3024(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fn.n(II)V")
    public void method3049(int arg0) {
    }

    @ObfuscatedName("fn.z(II)[I")
    public int[] method3028(int arg0) {
        return this.field2666[arg0];
    }

    @ObfuscatedName("fn.c(IB)I")
    public int method3078(int arg0) {
        return this.field2670[arg0].length;
    }

    @ObfuscatedName("fn.b(B)I")
    public int method3029() {
        return this.field2670.length;
    }

    @ObfuscatedName("fn.w(IB)V")
    public void method3086(int arg0) {
        for (int var2 = 0; var2 < this.field2670[arg0].length; var2++) {
            this.field2670[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fn.g(B)V")
    public void method3031() {
        for (int var1 = 0; var1 < this.field2670.length; var1++) {
            if (this.field2670[var1] != null) {
                for (int var2 = 0; var2 < this.field2670[var1].length; var2++) {
                    this.field2670[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fn.x(I[II)Z")
    public boolean method3032(int arg0, int[] arg1) {
        if (this.field2669[arg0] == null) {
            return false;
        }
        int var3 = this.field2676[arg0];
        int[] var4 = this.field2666[arg0];
        Object[] var5 = this.field2670[arg0];
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
            var8 = class125.method2737(this.field2669[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2329(arg1, 5, var9.field1988.length);
        } else {
            var8 = class125.method2737(this.field2669[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method687(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method1990(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class119.method1990(var8, 0, var17);
            throw class148.method120(var34, var16 + var18 + "," + this.field2663[arg0] + "," + this.field2672);
        }
        if (this.field2673) {
            this.field2669[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class119 var22 = new class119(var10);
            int[] var23 = new int[var3];
            var22.field1984 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2315();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1984 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2315();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2674) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class125.method13(var27[var33], false);
                }
            }
        } else if (this.field2674) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method13(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fn.o(Ljava/lang/String;I)I")
    public int method3033(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2662.method3459(class163.method2090(var2));
    }

    @ObfuscatedName("fn.l(ILjava/lang/String;I)I")
    public int method3035(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2659[arg0].method3459(class163.method2090(var3));
    }

    @ObfuscatedName("fn.j(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3044(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2662.method3459(class163.method2090(var3));
        int var6 = this.field2659[var5].method3459(class163.method2090(var4));
        return this.method3080(var5, var6);
    }

    @ObfuscatedName("fn.m(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3036(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2662.method3459(class163.method2090(var3));
        int var6 = this.field2659[var5].method3459(class163.method2090(var4));
        return this.method3057(var5, var6);
    }

    @ObfuscatedName("fn.e(Ljava/lang/String;I)Z")
    public boolean method3088(String arg0) {
        int var2 = this.method3033("");
        return var2 == -1 ? this.method3036(arg0, "") : this.method3036("", arg0);
    }

    @ObfuscatedName("fn.u(Ljava/lang/String;I)V")
    public void method3038(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2662.method3459(class163.method2090(var2));
        if (var3 >= 0) {
            this.method3064(var3);
        }
    }

    @ObfuscatedName("az.y([BI)[B")
    public static final byte[] method687(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2310();
        int var3 = var1.method2315();
        if (var3 < 0 || !(field2678 == 0 || var3 <= field2678)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2339(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2315();
            if (var5 < 0 || field2678 != 0 && var5 > field2678) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2261(var6, var5, arg0, var3, 9);
            } else {
                field2671.method2252(var1, var6);
            }
            return var6;
        }
    }
}
