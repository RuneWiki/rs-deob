package deob;

@ObfuscatedName("fj")
public abstract class class167 {

    @ObfuscatedName("fj.c")
    public int field2671;

    @ObfuscatedName("fj.h")
    public int[] field2652;

    @ObfuscatedName("fj.k")
    public int[] field2653;

    @ObfuscatedName("fj.t")
    public class192 field2654;

    @ObfuscatedName("fj.g")
    public int[] field2655;

    @ObfuscatedName("fj.o")
    public int[] field2656;

    @ObfuscatedName("fj.i")
    public int[] field2657;

    @ObfuscatedName("fj.w")
    public int[][] field2662;

    @ObfuscatedName("fj.m")
    public int[][] field2659;

    @ObfuscatedName("fj.r")
    public class192[] field2660;

    @ObfuscatedName("fj.y")
    public Object[] field2661;

    @ObfuscatedName("fj.q")
    public Object[][] field2658;

    @ObfuscatedName("fj.f")
    public static class116 field2669 = new class116();

    @ObfuscatedName("fj.x")
    public int field2664;

    @ObfuscatedName("fj.d")
    public boolean field2663;

    @ObfuscatedName("fj.e")
    public boolean field2666;

    @ObfuscatedName("fj.l")
    public static int field2667 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2663 = arg0;
        this.field2666 = arg1;
    }

    @ObfuscatedName("fj.c([BI)V")
    public void method2992(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method127(arg0, 0, var2);
        this.field2664 = var3;
        class119 var4 = new class119(method2453(arg0));
        int var5 = var4.method2291();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2296();
        }
        int var6 = var4.method2291();
        if (var5 >= 7) {
            this.field2671 = var4.method2305();
        } else {
            this.field2671 = var4.method2293();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2652 = new int[this.field2671];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2671; var9++) {
                this.field2652[var9] = var7 += var4.method2305();
                if (this.field2652[var9] > var8) {
                    var8 = this.field2652[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2671; var10++) {
                this.field2652[var10] = var7 += var4.method2293();
                if (this.field2652[var10] > var8) {
                    var8 = this.field2652[var10];
                }
            }
        }
        this.field2655 = new int[var8 + 1];
        this.field2656 = new int[var8 + 1];
        this.field2657 = new int[var8 + 1];
        this.field2662 = new int[var8 + 1][];
        this.field2661 = new Object[var8 + 1];
        this.field2658 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2653 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2671; var11++) {
                this.field2653[this.field2652[var11]] = var4.method2296();
            }
            this.field2654 = new class192(this.field2653);
        }
        for (int var12 = 0; var12 < this.field2671; var12++) {
            this.field2655[this.field2652[var12]] = var4.method2296();
        }
        for (int var13 = 0; var13 < this.field2671; var13++) {
            this.field2656[this.field2652[var13]] = var4.method2296();
        }
        for (int var14 = 0; var14 < this.field2671; var14++) {
            this.field2657[this.field2652[var14]] = var4.method2293();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2671; var15++) {
                int var16 = this.field2652[var15];
                int var17 = this.field2657[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2662[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2662[var16][var20] = var18 += var4.method2305();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2658[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2671; var22++) {
                int var23 = this.field2652[var22];
                int var24 = this.field2657[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2662[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2662[var23][var27] = var25 += var4.method2293();
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
        this.field2659 = new int[var8 + 1][];
        this.field2660 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2671; var29++) {
            int var30 = this.field2652[var29];
            int var31 = this.field2657[var30];
            this.field2659[var30] = new int[this.field2658[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2659[var30][this.field2662[var30][var32]] = var4.method2296();
            }
            this.field2660[var30] = new class192(this.field2659[var30]);
        }
    }

    @ObfuscatedName("fj.h(IB)V")
    public void method3064(int arg0) {
    }

    @ObfuscatedName("fj.k(III)[B")
    public byte[] method2994(int arg0, int arg1) {
        return this.method2995(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fj.t(II[II)[B")
    public byte[] method2995(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return null;
        }
        if (this.field2658[arg0][arg1] == null) {
            boolean var4 = this.method3008(arg0, arg2);
            if (!var4) {
                this.method3002(arg0);
                boolean var5 = this.method3008(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method721(this.field2658[arg0][arg1], false);
        if (this.field2666) {
            this.field2658[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fj.g(III)Z")
    public boolean method2996(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return false;
        } else if (this.field2658[arg0][arg1] != null) {
            return true;
        } else if (this.field2661[arg0] == null) {
            this.method3002(arg0);
            return this.field2661[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.o(II)Z")
    public boolean method2997(int arg0) {
        if (this.field2661[arg0] == null) {
            this.method3002(arg0);
            return this.field2661[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fj.i(B)Z")
    public boolean method2999() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2652.length; var2++) {
            int var3 = this.field2652[var2];
            if (this.field2661[var3] == null) {
                this.method3002(var3);
                if (this.field2661[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fj.w(II)[B")
    public byte[] method3019(int arg0) {
        if (this.field2658.length == 1) {
            return this.method2994(0, arg0);
        } else if (this.field2658[arg0].length == 1) {
            return this.method2994(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.m(III)[B")
    public byte[] method3000(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2658.length || this.field2658[arg0] == null || arg1 < 0 || arg1 >= this.field2658[arg0].length) {
            return null;
        }
        if (this.field2658[arg0][arg1] == null) {
            boolean var3 = this.method3008(arg0, (int[]) null);
            if (!var3) {
                this.method3002(arg0);
                boolean var4 = this.method3008(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method721(this.field2658[arg0][arg1], false);
    }

    @ObfuscatedName("fj.r(II)[B")
    public byte[] method3058(int arg0) {
        if (this.field2658.length == 1) {
            return this.method3000(0, arg0);
        } else if (this.field2658[arg0].length == 1) {
            return this.method3000(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fj.y(II)V")
    public void method3002(int arg0) {
    }

    @ObfuscatedName("fj.q(IB)[I")
    public int[] method3003(int arg0) {
        return this.field2662[arg0];
    }

    @ObfuscatedName("fj.f(II)I")
    public int method3046(int arg0) {
        return this.field2658[arg0].length;
    }

    @ObfuscatedName("fj.x(I)I")
    public int method3005() {
        return this.field2658.length;
    }

    @ObfuscatedName("fj.d(II)V")
    public void method3006(int arg0) {
        for (int var2 = 0; var2 < this.field2658[arg0].length; var2++) {
            this.field2658[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fj.e(I)V")
    public void method3004() {
        for (int var1 = 0; var1 < this.field2658.length; var1++) {
            if (this.field2658[var1] != null) {
                for (int var2 = 0; var2 < this.field2658[var1].length; var2++) {
                    this.field2658[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fj.l(I[II)Z")
    public boolean method3008(int arg0, int[] arg1) {
        if (this.field2661[arg0] == null) {
            return false;
        }
        int var3 = this.field2657[arg0];
        int[] var4 = this.field2662[arg0];
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
            var8 = class125.method721(this.field2661[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2464(arg1, 5, var9.field1956.length);
        } else {
            var8 = class125.method721(this.field2661[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2453(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method127(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class119.method127(var8, 0, var17);
            throw class148.method2751(var34, var16 + var18 + "," + this.field2655[arg0] + "," + this.field2664);
        }
        if (this.field2663) {
            this.field2661[arg0] = null;
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
                    var25 += var22.method2296();
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
                    var31 += var22.method2296();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2666) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class125.method801(var27[var33], false);
                }
            }
        } else if (this.field2666) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method801(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fj.u(Ljava/lang/String;I)I")
    public int method3009(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2654.method3480(class163.method1519(var2));
    }

    @ObfuscatedName("fj.a(ILjava/lang/String;I)I")
    public int method3043(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2660[arg0].method3480(class163.method1519(var3));
    }

    @ObfuscatedName("fj.b(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3054(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2654.method3480(class163.method1519(var3));
        int var6 = this.field2660[var5].method3480(class163.method1519(var4));
        return this.method2994(var5, var6);
    }

    @ObfuscatedName("fj.s(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3012(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2654.method3480(class163.method1519(var3));
        int var6 = this.field2660[var5].method3480(class163.method1519(var4));
        return this.method2996(var5, var6);
    }

    @ObfuscatedName("fj.v(Ljava/lang/String;B)Z")
    public boolean method3007(String arg0) {
        int var2 = this.method3009("");
        return var2 == -1 ? this.method3012(arg0, "") : this.method3012("", arg0);
    }

    @ObfuscatedName("fj.j(Ljava/lang/String;I)V")
    public void method3014(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2654.method3480(class163.method1519(var2));
        if (var3 >= 0) {
            this.method3064(var3);
        }
    }

    @ObfuscatedName("df.z([BI)[B")
    public static final byte[] method2453(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2291();
        int var3 = var1.method2296();
        if (var3 < 0 || !(field2667 == 0 || var3 <= field2667)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2302(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2296();
            if (var5 < 0 || field2667 != 0 && var5 > field2667) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2240(var6, var5, arg0, var3, 9);
            } else {
                field2669.method2234(var1, var6);
            }
            return var6;
        }
    }
}
