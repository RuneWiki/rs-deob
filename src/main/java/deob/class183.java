package deob;

@ObfuscatedName("gb")
public abstract class class183 {

    @ObfuscatedName("gb.f")
    public int field2728;

    @ObfuscatedName("gb.i")
    public int[] field2726;

    @ObfuscatedName("gb.u")
    public int[] field2742;

    @ObfuscatedName("gb.h")
    public class123 field2729;

    @ObfuscatedName("gb.r")
    public int[] field2725;

    @ObfuscatedName("gb.o")
    public int[] field2727;

    @ObfuscatedName("gb.l")
    public int[] field2731;

    @ObfuscatedName("gb.n")
    public int[][] field2739;

    @ObfuscatedName("gb.m")
    public int[][] field2733;

    @ObfuscatedName("gb.w")
    public class123[] field2734;

    @ObfuscatedName("gb.j")
    public Object[] field2735;

    @ObfuscatedName("gb.s")
    public Object[][] field2736;

    @ObfuscatedName("gb.q")
    public static class147 field2737 = new class147();

    @ObfuscatedName("gb.d")
    public int field2738;

    @ObfuscatedName("gb.p")
    public boolean field2730;

    @ObfuscatedName("gb.y")
    public boolean field2740;

    @ObfuscatedName("gb.a")
    public static int field2741 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2730 = arg0;
        this.field2740 = arg1;
    }

    @ObfuscatedName("gb.f([BI)V")
    public void method3172(byte[] arg0) {
        this.field2738 = class154.method2197(arg0, arg0.length);
        class154 var2 = new class154(method905(arg0));
        int var3 = var2.method2666();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2695();
        }
        int var4 = var2.method2666();
        if (var3 >= 7) {
            this.field2728 = var2.method2680();
        } else {
            this.field2728 = var2.method2668();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2726 = new int[this.field2728];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2728; var7++) {
                this.field2726[var7] = var5 += var2.method2680();
                if (this.field2726[var7] > var6) {
                    var6 = this.field2726[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2728; var8++) {
                this.field2726[var8] = var5 += var2.method2668();
                if (this.field2726[var8] > var6) {
                    var6 = this.field2726[var8];
                }
            }
        }
        this.field2725 = new int[var6 + 1];
        this.field2727 = new int[var6 + 1];
        this.field2731 = new int[var6 + 1];
        this.field2739 = new int[var6 + 1][];
        this.field2735 = new Object[var6 + 1];
        this.field2736 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2742 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2728; var9++) {
                this.field2742[this.field2726[var9]] = var2.method2695();
            }
            this.field2729 = new class123(this.field2742);
        }
        for (int var10 = 0; var10 < this.field2728; var10++) {
            this.field2725[this.field2726[var10]] = var2.method2695();
        }
        for (int var11 = 0; var11 < this.field2728; var11++) {
            this.field2727[this.field2726[var11]] = var2.method2695();
        }
        for (int var12 = 0; var12 < this.field2728; var12++) {
            this.field2731[this.field2726[var12]] = var2.method2668();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2728; var13++) {
                int var14 = this.field2726[var13];
                int var15 = this.field2731[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2739[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2739[var14][var18] = var16 += var2.method2680();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2736[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2728; var20++) {
                int var21 = this.field2726[var20];
                int var22 = this.field2731[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2739[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2739[var21][var25] = var23 += var2.method2668();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2736[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2733 = new int[var6 + 1][];
        this.field2734 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2728; var27++) {
            int var28 = this.field2726[var27];
            int var29 = this.field2731[var28];
            this.field2733[var28] = new int[this.field2736[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2733[var28][this.field2739[var28][var30]] = var2.method2695();
            }
            this.field2734[var28] = new class123(this.field2733[var28]);
        }
    }

    @ObfuscatedName("gb.i(IB)V")
    public void method3116(int arg0) {
    }

    @ObfuscatedName("gb.u(III)[B")
    public byte[] method3163(int arg0, int arg1) {
        return this.method3150(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gb.r(II[IB)[B")
    public byte[] method3150(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return null;
        }
        if (this.field2736[arg0][arg1] == null) {
            boolean var4 = this.method3178(arg0, arg2);
            if (!var4) {
                this.method3125(arg0);
                boolean var5 = this.method3178(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method750(this.field2736[arg0][arg1], false);
        if (this.field2740) {
            this.field2736[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gb.o(III)Z")
    public boolean method3119(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return false;
        } else if (this.field2736[arg0][arg1] != null) {
            return true;
        } else if (this.field2735[arg0] == null) {
            this.method3125(arg0);
            return this.field2735[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gb.l(II)Z")
    public boolean method3166(int arg0) {
        if (this.field2735[arg0] == null) {
            this.method3125(arg0);
            return this.field2735[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gb.n(B)Z")
    public boolean method3139() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2726.length; var2++) {
            int var3 = this.field2726[var2];
            if (this.field2735[var3] == null) {
                this.method3125(var3);
                if (this.field2735[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gb.m(IB)[B")
    public byte[] method3170(int arg0) {
        if (this.field2736.length == 1) {
            return this.method3163(0, arg0);
        } else if (this.field2736[arg0].length == 1) {
            return this.method3163(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gb.w(III)[B")
    public byte[] method3152(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2736.length || this.field2736[arg0] == null || arg1 < 0 || arg1 >= this.field2736[arg0].length) {
            return null;
        }
        if (this.field2736[arg0][arg1] == null) {
            boolean var3 = this.method3178(arg0, (int[]) null);
            if (!var3) {
                this.method3125(arg0);
                boolean var4 = this.method3178(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method750(this.field2736[arg0][arg1], false);
    }

    @ObfuscatedName("gb.j(II)[B")
    public byte[] method3118(int arg0) {
        if (this.field2736.length == 1) {
            return this.method3152(0, arg0);
        } else if (this.field2736[arg0].length == 1) {
            return this.method3152(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gb.s(II)V")
    public void method3125(int arg0) {
    }

    @ObfuscatedName("gb.q(II)[I")
    public int[] method3126(int arg0) {
        return this.field2739[arg0];
    }

    @ObfuscatedName("gb.d(II)I")
    public int method3127(int arg0) {
        return this.field2736[arg0].length;
    }

    @ObfuscatedName("gb.p(I)I")
    public int method3138() {
        return this.field2736.length;
    }

    @ObfuscatedName("gb.y(II)V")
    public void method3129(int arg0) {
        for (int var2 = 0; var2 < this.field2736[arg0].length; var2++) {
            this.field2736[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gb.a(I)V")
    public void method3130() {
        for (int var1 = 0; var1 < this.field2736.length; var1++) {
            if (this.field2736[var1] != null) {
                for (int var2 = 0; var2 < this.field2736[var1].length; var2++) {
                    this.field2736[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gb.v(I[II)Z")
    public boolean method3178(int arg0, int[] arg1) {
        if (this.field2735[arg0] == null) {
            return false;
        }
        int var3 = this.field2731[arg0];
        int[] var4 = this.field2739[arg0];
        Object[] var5 = this.field2736[arg0];
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
            var8 = class157.method750(this.field2735[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2723(arg1, 5, var9.field2114.length);
        } else {
            var8 = class157.method750(this.field2735[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method905(var8);
        } catch (RuntimeException var27) {
            throw class102.method909(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method2197(var8, var8.length) + "," + class154.method2197(var8, var8.length - 2) + "," + this.field2725[arg0] + "," + this.field2738);
        }
        if (this.field2730) {
            this.field2735[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class154 var15 = new class154(var10);
            int[] var16 = new int[var3];
            var15.field2111 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2695();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2111 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2695();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2740) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method426(var20[var26], false);
                }
            }
        } else if (this.field2740) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method426(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gb.z(Ljava/lang/String;B)I")
    public int method3132(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2729.method2230(class208.method56(var2));
    }

    @ObfuscatedName("gb.x(ILjava/lang/String;B)I")
    public int method3133(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2734[arg0].method2230(class208.method56(var3));
    }

    @ObfuscatedName("gb.g(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3134(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2729.method2230(class208.method56(var3));
        int var6 = this.field2734[var5].method2230(class208.method56(var4));
        return this.method3163(var5, var6);
    }

    @ObfuscatedName("gb.b(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3135(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2729.method2230(class208.method56(var3));
        int var6 = this.field2734[var5].method2230(class208.method56(var4));
        return this.method3119(var5, var6);
    }

    @ObfuscatedName("gb.k(Ljava/lang/String;I)Z")
    public boolean method3146(String arg0) {
        int var2 = this.method3132("");
        return var2 == -1 ? this.method3135(arg0, "") : this.method3135("", arg0);
    }

    @ObfuscatedName("gb.t(Ljava/lang/String;B)V")
    public void method3137(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2729.method2230(class208.method56(var2));
        if (var3 >= 0) {
            this.method3116(var3);
        }
    }

    @ObfuscatedName("ay.c([BI)[B")
    public static final byte[] method905(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2666();
        int var3 = var1.method2695();
        if (var3 < 0 || !(field2741 == 0 || var3 <= field2741)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2677(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2695();
            if (var5 < 0 || field2741 != 0 && var5 > field2741) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2605(var6, var5, arg0, var3, 9);
            } else {
                field2737.method2602(var1, var6);
            }
            return var6;
        }
    }
}
