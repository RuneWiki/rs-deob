package deob;

@ObfuscatedName("gj")
public abstract class class183 {

    @ObfuscatedName("gj.b")
    public int field2708;

    @ObfuscatedName("gj.l")
    public int[] field2716;

    @ObfuscatedName("gj.i")
    public int[] field2709;

    @ObfuscatedName("gj.t")
    public class123 field2710;

    @ObfuscatedName("gj.k")
    public int[] field2711;

    @ObfuscatedName("gj.h")
    public int[] field2712;

    @ObfuscatedName("gj.n")
    public int[] field2713;

    @ObfuscatedName("gj.f")
    public int[][] field2714;

    @ObfuscatedName("gj.a")
    public int[][] field2715;

    @ObfuscatedName("gj.r")
    public class123[] field2707;

    @ObfuscatedName("gj.x")
    public Object[] field2719;

    @ObfuscatedName("gj.z")
    public Object[][] field2718;

    @ObfuscatedName("gj.p")
    public static class147 field2717 = new class147();

    @ObfuscatedName("gj.s")
    public int field2724;

    @ObfuscatedName("gj.o")
    public boolean field2721;

    @ObfuscatedName("gj.y")
    public boolean field2722;

    @ObfuscatedName("gj.w")
    public static int field2723 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2721 = arg0;
        this.field2722 = arg1;
    }

    @ObfuscatedName("gj.b([BI)V")
    public void method3150(byte[] arg0) {
        this.field2724 = class154.method115(arg0, arg0.length);
        class154 var2 = new class154(method2955(arg0));
        int var3 = var2.method2678();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2683();
        }
        int var4 = var2.method2678();
        if (var3 >= 7) {
            this.field2708 = var2.method2692();
        } else {
            this.field2708 = var2.method2801();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2716 = new int[this.field2708];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2708; var7++) {
                this.field2716[var7] = var5 += var2.method2692();
                if (this.field2716[var7] > var6) {
                    var6 = this.field2716[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2708; var8++) {
                this.field2716[var8] = var5 += var2.method2801();
                if (this.field2716[var8] > var6) {
                    var6 = this.field2716[var8];
                }
            }
        }
        this.field2711 = new int[var6 + 1];
        this.field2712 = new int[var6 + 1];
        this.field2713 = new int[var6 + 1];
        this.field2714 = new int[var6 + 1][];
        this.field2719 = new Object[var6 + 1];
        this.field2718 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2709 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2708; var9++) {
                this.field2709[this.field2716[var9]] = var2.method2683();
            }
            this.field2710 = new class123(this.field2709);
        }
        for (int var10 = 0; var10 < this.field2708; var10++) {
            this.field2711[this.field2716[var10]] = var2.method2683();
        }
        for (int var11 = 0; var11 < this.field2708; var11++) {
            this.field2712[this.field2716[var11]] = var2.method2683();
        }
        for (int var12 = 0; var12 < this.field2708; var12++) {
            this.field2713[this.field2716[var12]] = var2.method2801();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2708; var13++) {
                int var14 = this.field2716[var13];
                int var15 = this.field2713[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2714[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2714[var14][var18] = var16 += var2.method2692();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2718[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2708; var20++) {
                int var21 = this.field2716[var20];
                int var22 = this.field2713[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2714[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2714[var21][var25] = var23 += var2.method2801();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2718[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2715 = new int[var6 + 1][];
        this.field2707 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2708; var27++) {
            int var28 = this.field2716[var27];
            int var29 = this.field2713[var28];
            this.field2715[var28] = new int[this.field2718[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2715[var28][this.field2714[var28][var30]] = var2.method2683();
            }
            this.field2707[var28] = new class123(this.field2715[var28]);
        }
    }

    @ObfuscatedName("gj.l(II)V")
    public void method3149(int arg0) {
    }

    @ObfuscatedName("gj.i(IIB)[B")
    public byte[] method3226(int arg0, int arg1) {
        return this.method3152(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gj.t(II[II)[B")
    public byte[] method3152(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return null;
        }
        if (this.field2718[arg0][arg1] == null) {
            boolean var4 = this.method3164(arg0, arg2);
            if (!var4) {
                this.method3158(arg0);
                boolean var5 = this.method3164(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method1985(this.field2718[arg0][arg1], false);
        if (this.field2722) {
            this.field2718[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gj.k(IIB)Z")
    public boolean method3215(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return false;
        } else if (this.field2718[arg0][arg1] != null) {
            return true;
        } else if (this.field2719[arg0] == null) {
            this.method3158(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.x(II)Z")
    public boolean method3180(int arg0) {
        if (this.field2719[arg0] == null) {
            this.method3158(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gj.z(I)Z")
    public boolean method3154() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2716.length; var2++) {
            int var3 = this.field2716[var2];
            if (this.field2719[var3] == null) {
                this.method3158(var3);
                if (this.field2719[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gj.p(II)[B")
    public byte[] method3155(int arg0) {
        if (this.field2718.length == 1) {
            return this.method3226(0, arg0);
        } else if (this.field2718[arg0].length == 1) {
            return this.method3226(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.s(III)[B")
    public byte[] method3156(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return null;
        }
        if (this.field2718[arg0][arg1] == null) {
            boolean var3 = this.method3164(arg0, (int[]) null);
            if (!var3) {
                this.method3158(arg0);
                boolean var4 = this.method3164(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method1985(this.field2718[arg0][arg1], false);
    }

    @ObfuscatedName("gj.o(IB)[B")
    public byte[] method3157(int arg0) {
        if (this.field2718.length == 1) {
            return this.method3156(0, arg0);
        } else if (this.field2718[arg0].length == 1) {
            return this.method3156(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gj.y(II)V")
    public void method3158(int arg0) {
    }

    @ObfuscatedName("gj.w(II)[I")
    public int[] method3159(int arg0) {
        return this.field2714[arg0];
    }

    @ObfuscatedName("gj.m(II)I")
    public int method3200(int arg0) {
        return this.field2718[arg0].length;
    }

    @ObfuscatedName("gj.u(I)I")
    public int method3194() {
        return this.field2718.length;
    }

    @ObfuscatedName("gj.q(II)V")
    public void method3162(int arg0) {
        for (int var2 = 0; var2 < this.field2718[arg0].length; var2++) {
            this.field2718[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gj.c(B)V")
    public void method3163() {
        for (int var1 = 0; var1 < this.field2718.length; var1++) {
            if (this.field2718[var1] != null) {
                for (int var2 = 0; var2 < this.field2718[var1].length; var2++) {
                    this.field2718[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gj.v(I[II)Z")
    public boolean method3164(int arg0, int[] arg1) {
        if (this.field2719[arg0] == null) {
            return false;
        }
        int var3 = this.field2713[arg0];
        int[] var4 = this.field2714[arg0];
        Object[] var5 = this.field2718[arg0];
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
            var8 = class157.method1985(this.field2719[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2698(arg1, 5, var9.field2083.length);
        } else {
            var8 = class157.method1985(this.field2719[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2955(var8);
        } catch (RuntimeException var27) {
            throw class102.method2935(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method115(var8, var8.length) + "," + class154.method115(var8, var8.length - 2) + "," + this.field2711[arg0] + "," + this.field2724);
        }
        if (this.field2721) {
            this.field2719[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class154 var15 = new class154(var10);
            int[] var16 = new int[var3];
            var15.field2085 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2683();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2085 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2683();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2722) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method3713(var20[var26], false);
                }
            }
        } else if (this.field2722) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method3713(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gj.e(Ljava/lang/String;B)I")
    public int method3165(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2710.method2244(class208.method779(var2));
    }

    @ObfuscatedName("gj.j(ILjava/lang/String;B)I")
    public int method3209(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2707[arg0].method2244(class208.method779(var3));
    }

    @ObfuscatedName("gj.d(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3167(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2710.method2244(class208.method779(var3));
        int var6 = this.field2707[var5].method2244(class208.method779(var4));
        return this.method3226(var5, var6);
    }

    @ObfuscatedName("gj.g(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3168(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2710.method2244(class208.method779(var3));
        int var6 = this.field2707[var5].method2244(class208.method779(var4));
        return this.method3215(var5, var6);
    }

    @ObfuscatedName("gj.ap(Ljava/lang/String;I)Z")
    public boolean method3169(String arg0) {
        int var2 = this.method3165("");
        return var2 == -1 ? this.method3168(arg0, "") : this.method3168("", arg0);
    }

    @ObfuscatedName("gj.aj(Ljava/lang/String;S)V")
    public void method3170(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2710.method2244(class208.method779(var2));
        if (var3 >= 0) {
            this.method3149(var3);
        }
    }

    @ObfuscatedName("fx.ab([BI)[B")
    public static final byte[] method2955(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2678();
        int var3 = var1.method2683();
        if (var3 < 0 || !(field2723 == 0 || var3 <= field2723)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2689(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2683();
            if (var5 < 0 || field2723 != 0 && var5 > field2723) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2631(var6, var5, arg0, var3, 9);
            } else {
                field2717.method2604(var1, var6);
            }
            return var6;
        }
    }
}
