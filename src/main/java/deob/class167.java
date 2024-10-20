package deob;

@ObfuscatedName("fo")
public abstract class class167 {

    @ObfuscatedName("fo.l")
    public int field2667;

    @ObfuscatedName("fo.e")
    public int[] field2656;

    @ObfuscatedName("fo.q")
    public int[] field2672;

    @ObfuscatedName("fo.o")
    public class192 field2666;

    @ObfuscatedName("fo.g")
    public int[] field2660;

    @ObfuscatedName("fo.m")
    public int[] field2661;

    @ObfuscatedName("fo.b")
    public int[] field2662;

    @ObfuscatedName("fo.p")
    public int[][] field2663;

    @ObfuscatedName("fo.t")
    public int[][] field2668;

    @ObfuscatedName("fo.w")
    public class192[] field2665;

    @ObfuscatedName("fo.x")
    public Object[] field2658;

    @ObfuscatedName("fo.k")
    public Object[][] field2659;

    @ObfuscatedName("fo.z")
    public static class116 field2657 = new class116();

    @ObfuscatedName("fo.v")
    public int field2669;

    @ObfuscatedName("fo.j")
    public boolean field2670;

    @ObfuscatedName("fo.f")
    public boolean field2664;

    @ObfuscatedName("fo.c")
    public static int field2671 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2670 = arg0;
        this.field2664 = arg1;
    }

    @ObfuscatedName("fo.l([BB)V")
    public void method3092(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method642(arg0, 0, var2);
        this.field2669 = var3;
        class119 var4 = new class119(method1213(arg0));
        int var5 = var4.method2388();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2393();
        }
        int var6 = var4.method2388();
        if (var5 >= 7) {
            this.field2667 = var4.method2402();
        } else {
            this.field2667 = var4.method2440();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2656 = new int[this.field2667];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2667; var9++) {
                this.field2656[var9] = var7 += var4.method2402();
                if (this.field2656[var9] > var8) {
                    var8 = this.field2656[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2667; var10++) {
                this.field2656[var10] = var7 += var4.method2440();
                if (this.field2656[var10] > var8) {
                    var8 = this.field2656[var10];
                }
            }
        }
        this.field2660 = new int[var8 + 1];
        this.field2661 = new int[var8 + 1];
        this.field2662 = new int[var8 + 1];
        this.field2663 = new int[var8 + 1][];
        this.field2658 = new Object[var8 + 1];
        this.field2659 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2672 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2667; var11++) {
                this.field2672[this.field2656[var11]] = var4.method2393();
            }
            this.field2666 = new class192(this.field2672);
        }
        for (int var12 = 0; var12 < this.field2667; var12++) {
            this.field2660[this.field2656[var12]] = var4.method2393();
        }
        for (int var13 = 0; var13 < this.field2667; var13++) {
            this.field2661[this.field2656[var13]] = var4.method2393();
        }
        for (int var14 = 0; var14 < this.field2667; var14++) {
            this.field2662[this.field2656[var14]] = var4.method2440();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2667; var15++) {
                int var16 = this.field2656[var15];
                int var17 = this.field2662[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2663[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2663[var16][var20] = var18 += var4.method2402();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2659[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2667; var22++) {
                int var23 = this.field2656[var22];
                int var24 = this.field2662[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2663[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2663[var23][var27] = var25 += var4.method2440();
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
        this.field2668 = new int[var8 + 1][];
        this.field2665 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2667; var29++) {
            int var30 = this.field2656[var29];
            int var31 = this.field2662[var30];
            this.field2668[var30] = new int[this.field2659[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2668[var30][this.field2663[var30][var32]] = var4.method2393();
            }
            this.field2665[var30] = new class192(this.field2668[var30]);
        }
    }

    @ObfuscatedName("fo.e(IB)V")
    public void method3049(int arg0) {
    }

    @ObfuscatedName("fo.q(III)[B")
    public byte[] method3050(int arg0, int arg1) {
        return this.method3051(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fo.o(II[II)[B")
    public byte[] method3051(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return null;
        }
        if (this.field2659[arg0][arg1] == null) {
            boolean var4 = this.method3064(arg0, arg2);
            if (!var4) {
                this.method3058(arg0);
                boolean var5 = this.method3064(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method1002(this.field2659[arg0][arg1], false);
        if (this.field2664) {
            this.field2659[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fo.g(III)Z")
    public boolean method3088(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return false;
        } else if (this.field2659[arg0][arg1] != null) {
            return true;
        } else if (this.field2658[arg0] == null) {
            this.method3058(arg0);
            return this.field2658[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.m(II)Z")
    public boolean method3053(int arg0) {
        if (this.field2658[arg0] == null) {
            this.method3058(arg0);
            return this.field2658[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.b(I)Z")
    public boolean method3054() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2656.length; var2++) {
            int var3 = this.field2656[var2];
            if (this.field2658[var3] == null) {
                this.method3058(var3);
                if (this.field2658[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fo.p(II)[B")
    public byte[] method3047(int arg0) {
        if (this.field2659.length == 1) {
            return this.method3050(0, arg0);
        } else if (this.field2659[arg0].length == 1) {
            return this.method3050(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.t(III)[B")
    public byte[] method3099(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2659.length || this.field2659[arg0] == null || arg1 < 0 || arg1 >= this.field2659[arg0].length) {
            return null;
        }
        if (this.field2659[arg0][arg1] == null) {
            boolean var3 = this.method3064(arg0, (int[]) null);
            if (!var3) {
                this.method3058(arg0);
                boolean var4 = this.method3064(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method1002(this.field2659[arg0][arg1], false);
    }

    @ObfuscatedName("fo.w(II)[B")
    public byte[] method3057(int arg0) {
        if (this.field2659.length == 1) {
            return this.method3099(0, arg0);
        } else if (this.field2659[arg0].length == 1) {
            return this.method3099(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fo.x(II)V")
    public void method3058(int arg0) {
    }

    @ObfuscatedName("fo.k(II)[I")
    public int[] method3059(int arg0) {
        return this.field2663[arg0];
    }

    @ObfuscatedName("fo.z(II)I")
    public int method3085(int arg0) {
        return this.field2659[arg0].length;
    }

    @ObfuscatedName("fo.v(I)I")
    public int method3106() {
        return this.field2659.length;
    }

    @ObfuscatedName("fo.j(IB)V")
    public void method3062(int arg0) {
        for (int var2 = 0; var2 < this.field2659[arg0].length; var2++) {
            this.field2659[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fo.f(B)V")
    public void method3063() {
        for (int var1 = 0; var1 < this.field2659.length; var1++) {
            if (this.field2659[var1] != null) {
                for (int var2 = 0; var2 < this.field2659[var1].length; var2++) {
                    this.field2659[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fo.c(I[II)Z")
    public boolean method3064(int arg0, int[] arg1) {
        if (this.field2658[arg0] == null) {
            return false;
        }
        int var3 = this.field2662[arg0];
        int[] var4 = this.field2663[arg0];
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
            var8 = class125.method1002(this.field2658[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2407(arg1, 5, var9.field1986.length);
        } else {
            var8 = class125.method1002(this.field2658[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1213(var8);
        } catch (RuntimeException var31) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method1789(var8, var8.length) + ",";
            int var14 = var8.length - 2;
            int var15 = class119.method642(var8, 0, var14);
            throw class148.method49(var31, var13 + var15 + "," + this.field2660[arg0] + "," + this.field2669);
        }
        if (this.field2670) {
            this.field2658[arg0] = null;
        }
        if (var3 > 1) {
            int var16 = var10.length;
            int var32 = var16 - 1;
            int var17 = var10[var32] & 0xFF;
            int var18 = var32 - var3 * var17 * 4;
            class119 var19 = new class119(var10);
            int[] var20 = new int[var3];
            var19.field1988 = var18;
            for (int var21 = 0; var21 < var17; var21++) {
                int var22 = 0;
                for (int var23 = 0; var23 < var3; var23++) {
                    var22 += var19.method2393();
                    var20[var23] += var22;
                }
            }
            byte[][] var24 = new byte[var3][];
            for (int var25 = 0; var25 < var3; var25++) {
                var24[var25] = new byte[var20[var25]];
                var20[var25] = 0;
            }
            var19.field1988 = var18;
            int var26 = 0;
            for (int var27 = 0; var27 < var17; var27++) {
                int var28 = 0;
                for (int var29 = 0; var29 < var3; var29++) {
                    var28 += var19.method2393();
                    System.arraycopy(var10, var26, var24[var29], var20[var29], var28);
                    var20[var29] += var28;
                    var26 += var28;
                }
            }
            for (int var30 = 0; var30 < var3; var30++) {
                if (this.field2664) {
                    var5[var4[var30]] = var24[var30];
                } else {
                    var5[var4[var30]] = class125.method181(var24[var30], false);
                }
            }
        } else if (this.field2664) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method181(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fo.s(Ljava/lang/String;B)I")
    public int method3056(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2666.method3475(class163.method2939(var2));
    }

    @ObfuscatedName("fo.r(ILjava/lang/String;B)I")
    public int method3091(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2665[arg0].method3475(class163.method2939(var3));
    }

    @ObfuscatedName("fo.u(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3066(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3475(class163.method2939(var3));
        int var6 = this.field2665[var5].method3475(class163.method2939(var4));
        return this.method3050(var5, var6);
    }

    @ObfuscatedName("fo.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3101(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3475(class163.method2939(var3));
        int var6 = this.field2665[var5].method3475(class163.method2939(var4));
        return this.method3088(var5, var6);
    }

    @ObfuscatedName("fo.h(Ljava/lang/String;I)Z")
    public boolean method3068(String arg0) {
        int var2 = this.method3056("");
        return var2 == -1 ? this.method3101(arg0, "") : this.method3101("", arg0);
    }

    @ObfuscatedName("fo.y(Ljava/lang/String;I)V")
    public void method3069(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2666.method3475(class163.method2939(var2));
        if (var3 >= 0) {
            this.method3049(var3);
        }
    }

    @ObfuscatedName("bs.d([BI)[B")
    public static final byte[] method1213(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2388();
        int var3 = var1.method2393();
        if (var3 < 0 || !(field2671 == 0 || var3 <= field2671)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2399(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2393();
            if (var5 < 0 || field2671 != 0 && var5 > field2671) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2357(var6, var5, arg0, var3, 9);
            } else {
                field2657.method2327(var1, var6);
            }
            return var6;
        }
    }
}
