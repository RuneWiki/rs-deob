package deob;

@ObfuscatedName("go")
public abstract class class183 {

    @ObfuscatedName("go.x")
    public int field2714;

    @ObfuscatedName("go.n")
    public int[] field2722;

    @ObfuscatedName("go.g")
    public int[] field2711;

    @ObfuscatedName("go.v")
    public class123 field2709;

    @ObfuscatedName("go.y")
    public int[] field2713;

    @ObfuscatedName("go.p")
    public int[] field2712;

    @ObfuscatedName("go.j")
    public int[] field2715;

    @ObfuscatedName("go.m")
    public int[][] field2716;

    @ObfuscatedName("go.a")
    public int[][] field2717;

    @ObfuscatedName("go.i")
    public class123[] field2718;

    @ObfuscatedName("go.s")
    public Object[] field2727;

    @ObfuscatedName("go.k")
    public Object[][] field2720;

    @ObfuscatedName("go.f")
    public static class147 field2721 = new class147();

    @ObfuscatedName("go.o")
    public int field2723;

    @ObfuscatedName("go.q")
    public boolean field2726;

    @ObfuscatedName("go.c")
    public boolean field2724;

    @ObfuscatedName("go.b")
    public static int field2725 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2726 = arg0;
        this.field2724 = arg1;
    }

    @ObfuscatedName("go.x([BB)V")
    public void method3181(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class154.method2047(arg0, 0, var2);
        this.field2723 = var3;
        class154 var4 = new class154(method166(arg0));
        int var5 = var4.method2878();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2803();
        }
        int var6 = var4.method2878();
        if (var5 >= 7) {
            this.field2714 = var4.method2715();
        } else {
            this.field2714 = var4.method2833();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2722 = new int[this.field2714];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2714; var9++) {
                this.field2722[var9] = var7 += var4.method2715();
                if (this.field2722[var9] > var8) {
                    var8 = this.field2722[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2714; var10++) {
                this.field2722[var10] = var7 += var4.method2833();
                if (this.field2722[var10] > var8) {
                    var8 = this.field2722[var10];
                }
            }
        }
        this.field2713 = new int[var8 + 1];
        this.field2712 = new int[var8 + 1];
        this.field2715 = new int[var8 + 1];
        this.field2716 = new int[var8 + 1][];
        this.field2727 = new Object[var8 + 1];
        this.field2720 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2711 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2714; var11++) {
                this.field2711[this.field2722[var11]] = var4.method2803();
            }
            this.field2709 = new class123(this.field2711);
        }
        for (int var12 = 0; var12 < this.field2714; var12++) {
            this.field2713[this.field2722[var12]] = var4.method2803();
        }
        for (int var13 = 0; var13 < this.field2714; var13++) {
            this.field2712[this.field2722[var13]] = var4.method2803();
        }
        for (int var14 = 0; var14 < this.field2714; var14++) {
            this.field2715[this.field2722[var14]] = var4.method2833();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2714; var15++) {
                int var16 = this.field2722[var15];
                int var17 = this.field2715[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2716[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2716[var16][var20] = var18 += var4.method2715();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2720[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2714; var22++) {
                int var23 = this.field2722[var22];
                int var24 = this.field2715[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2716[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2716[var23][var27] = var25 += var4.method2833();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2720[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2717 = new int[var8 + 1][];
        this.field2718 = new class123[var8 + 1];
        for (int var29 = 0; var29 < this.field2714; var29++) {
            int var30 = this.field2722[var29];
            int var31 = this.field2715[var30];
            this.field2717[var30] = new int[this.field2720[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2717[var30][this.field2716[var30][var32]] = var4.method2803();
            }
            this.field2718[var30] = new class123(this.field2717[var30]);
        }
    }

    @ObfuscatedName("go.n(IB)V")
    public void method3152(int arg0) {
    }

    @ObfuscatedName("go.g(IIB)[B")
    public byte[] method3153(int arg0, int arg1) {
        return this.method3213(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("go.v(II[IS)[B")
    public byte[] method3213(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return null;
        }
        if (this.field2720[arg0][arg1] == null) {
            boolean var4 = this.method3166(arg0, arg2);
            if (!var4) {
                this.method3212(arg0);
                boolean var5 = this.method3166(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method1195(this.field2720[arg0][arg1], false);
        if (this.field2724) {
            this.field2720[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("go.y(III)Z")
    public boolean method3154(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return false;
        } else if (this.field2720[arg0][arg1] != null) {
            return true;
        } else if (this.field2727[arg0] == null) {
            this.method3212(arg0);
            return this.field2727[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("go.p(II)Z")
    public boolean method3156(int arg0) {
        if (this.field2727[arg0] == null) {
            this.method3212(arg0);
            return this.field2727[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("go.j(I)Z")
    public boolean method3163() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2722.length; var2++) {
            int var3 = this.field2722[var2];
            if (this.field2727[var3] == null) {
                this.method3212(var3);
                if (this.field2727[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("go.s(II)[B")
    public byte[] method3158(int arg0) {
        if (this.field2720.length == 1) {
            return this.method3153(0, arg0);
        } else if (this.field2720[arg0].length == 1) {
            return this.method3153(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("go.k(III)[B")
    public byte[] method3159(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2720.length || this.field2720[arg0] == null || arg1 < 0 || arg1 >= this.field2720[arg0].length) {
            return null;
        }
        if (this.field2720[arg0][arg1] == null) {
            boolean var3 = this.method3166(arg0, (int[]) null);
            if (!var3) {
                this.method3212(arg0);
                boolean var4 = this.method3166(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method1195(this.field2720[arg0][arg1], false);
    }

    @ObfuscatedName("go.f(IB)[B")
    public byte[] method3160(int arg0) {
        if (this.field2720.length == 1) {
            return this.method3159(0, arg0);
        } else if (this.field2720[arg0].length == 1) {
            return this.method3159(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("go.o(IB)V")
    public void method3212(int arg0) {
    }

    @ObfuscatedName("go.q(II)[I")
    public int[] method3162(int arg0) {
        return this.field2716[arg0];
    }

    @ObfuscatedName("go.c(II)I")
    public int method3150(int arg0) {
        return this.field2720[arg0].length;
    }

    @ObfuscatedName("go.b(I)I")
    public int method3164() {
        return this.field2720.length;
    }

    @ObfuscatedName("go.w(IB)V")
    public void method3157(int arg0) {
        for (int var2 = 0; var2 < this.field2720[arg0].length; var2++) {
            this.field2720[arg0][var2] = null;
        }
    }

    @ObfuscatedName("go.l(I)V")
    public void method3165() {
        for (int var1 = 0; var1 < this.field2720.length; var1++) {
            if (this.field2720[var1] != null) {
                for (int var2 = 0; var2 < this.field2720[var1].length; var2++) {
                    this.field2720[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("go.r(I[IB)Z")
    public boolean method3166(int arg0, int[] arg1) {
        if (this.field2727[arg0] == null) {
            return false;
        }
        int var3 = this.field2715[arg0];
        int[] var4 = this.field2716[arg0];
        Object[] var5 = this.field2720[arg0];
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
            var8 = class157.method1195(this.field2727[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2721(arg1, 5, var9.field2086.length);
        } else {
            var8 = class157.method1195(this.field2727[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method166(var8);
        } catch (RuntimeException var27) {
            throw class102.method805(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method107(var8, var8.length) + "," + class154.method107(var8, var8.length - 2) + "," + this.field2713[arg0] + "," + this.field2723);
        }
        if (this.field2726) {
            this.field2727[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class154 var15 = new class154(var10);
            int[] var16 = new int[var3];
            var15.field2087 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2803();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2087 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2803();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2724) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method2059(var20[var26], false);
                }
            }
        } else if (this.field2724) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method2059(var10, false);
        }
        return true;
    }

    @ObfuscatedName("go.u(Ljava/lang/String;B)I")
    public int method3224(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2709.method2266(class208.method199(var2));
    }

    @ObfuscatedName("go.e(ILjava/lang/String;I)I")
    public int method3168(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2718[arg0].method2266(class208.method199(var3));
    }

    @ObfuscatedName("go.h(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3169(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2709.method2266(class208.method199(var3));
        int var6 = this.field2718[var5].method2266(class208.method199(var4));
        return this.method3153(var5, var6);
    }

    @ObfuscatedName("go.d(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3170(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2709.method2266(class208.method199(var3));
        int var6 = this.field2718[var5].method2266(class208.method199(var4));
        return this.method3154(var5, var6);
    }

    @ObfuscatedName("go.z(Ljava/lang/String;S)Z")
    public boolean method3171(String arg0) {
        int var2 = this.method3224("");
        return var2 == -1 ? this.method3170(arg0, "") : this.method3170("", arg0);
    }

    @ObfuscatedName("go.t(Ljava/lang/String;I)V")
    public void method3172(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2709.method2266(class208.method199(var2));
        if (var3 >= 0) {
            this.method3152(var3);
        }
    }

    @ObfuscatedName("k.ab([BI)[B")
    public static final byte[] method166(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2878();
        int var3 = var1.method2803();
        if (var3 < 0 || !(field2725 == 0 || var3 <= field2725)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2712(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2803();
            if (var5 < 0 || field2725 != 0 && var5 > field2725) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2632(var6, var5, arg0, var3, 9);
            } else {
                field2721.method2627(var1, var6);
            }
            return var6;
        }
    }
}
