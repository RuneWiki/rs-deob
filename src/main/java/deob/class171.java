package deob;

@ObfuscatedName("fe")
public abstract class class171 {

    @ObfuscatedName("fe.e")
    public int field2716;

    @ObfuscatedName("fe.l")
    public int[] field2709;

    @ObfuscatedName("fe.c")
    public int[] field2710;

    @ObfuscatedName("fe.h")
    public class196 field2708;

    @ObfuscatedName("fe.r")
    public int[] field2711;

    @ObfuscatedName("fe.a")
    public int[] field2713;

    @ObfuscatedName("fe.b")
    public int[] field2723;

    @ObfuscatedName("fe.u")
    public int[][] field2715;

    @ObfuscatedName("fe.o")
    public int[][] field2712;

    @ObfuscatedName("fe.p")
    public class196[] field2717;

    @ObfuscatedName("fe.i")
    public Object[] field2718;

    @ObfuscatedName("fe.q")
    public Object[][] field2719;

    @ObfuscatedName("fe.g")
    public static class120 field2726 = new class120();

    @ObfuscatedName("fe.j")
    public int field2721;

    @ObfuscatedName("fe.w")
    public boolean field2722;

    @ObfuscatedName("fe.x")
    public boolean field2724;

    @ObfuscatedName("fe.f")
    public static int field2714 = 0;

    public class171(boolean arg0, boolean arg1) {
        this.field2722 = arg0;
        this.field2724 = arg1;
    }

    @ObfuscatedName("fe.e([BI)V")
    public void method3137(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class123.method545(arg0, 0, var2);
        this.field2721 = var3;
        class123 var4 = new class123(method1293(arg0));
        int var5 = var4.method2464();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2468();
        }
        int var6 = var4.method2464();
        if (var5 >= 7) {
            this.field2716 = var4.method2477();
        } else {
            this.field2716 = var4.method2466();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2709 = new int[this.field2716];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2716; var9++) {
                this.field2709[var9] = var7 += var4.method2477();
                if (this.field2709[var9] > var8) {
                    var8 = this.field2709[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2716; var10++) {
                this.field2709[var10] = var7 += var4.method2466();
                if (this.field2709[var10] > var8) {
                    var8 = this.field2709[var10];
                }
            }
        }
        this.field2711 = new int[var8 + 1];
        this.field2713 = new int[var8 + 1];
        this.field2723 = new int[var8 + 1];
        this.field2715 = new int[var8 + 1][];
        this.field2718 = new Object[var8 + 1];
        this.field2719 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2710 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2716; var11++) {
                this.field2710[this.field2709[var11]] = var4.method2468();
            }
            this.field2708 = new class196(this.field2710);
        }
        for (int var12 = 0; var12 < this.field2716; var12++) {
            this.field2711[this.field2709[var12]] = var4.method2468();
        }
        for (int var13 = 0; var13 < this.field2716; var13++) {
            this.field2713[this.field2709[var13]] = var4.method2468();
        }
        for (int var14 = 0; var14 < this.field2716; var14++) {
            this.field2723[this.field2709[var14]] = var4.method2466();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2716; var15++) {
                int var16 = this.field2709[var15];
                int var17 = this.field2723[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2715[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2715[var16][var20] = var18 += var4.method2477();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2719[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2716; var22++) {
                int var23 = this.field2709[var22];
                int var24 = this.field2723[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2715[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2715[var23][var27] = var25 += var4.method2466();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2719[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2712 = new int[var8 + 1][];
        this.field2717 = new class196[var8 + 1];
        for (int var29 = 0; var29 < this.field2716; var29++) {
            int var30 = this.field2709[var29];
            int var31 = this.field2723[var30];
            this.field2712[var30] = new int[this.field2719[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2712[var30][this.field2715[var30][var32]] = var4.method2468();
            }
            this.field2717[var30] = new class196(this.field2712[var30]);
        }
    }

    @ObfuscatedName("fe.l(II)V")
    public void method3187(int arg0) {
    }

    @ObfuscatedName("fe.c(IIB)[B")
    public byte[] method3130(int arg0, int arg1) {
        return this.method3199(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fe.h(II[II)[B")
    public byte[] method3199(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2719.length || this.field2719[arg0] == null || arg1 < 0 || arg1 >= this.field2719[arg0].length) {
            return null;
        }
        if (this.field2719[arg0][arg1] == null) {
            boolean var4 = this.method3146(arg0, arg2);
            if (!var4) {
                this.method3140(arg0);
                boolean var5 = this.method3146(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class129.method160(this.field2719[arg0][arg1], false);
        if (this.field2724) {
            this.field2719[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fe.r(III)Z")
    public boolean method3134(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2719.length || this.field2719[arg0] == null || arg1 < 0 || arg1 >= this.field2719[arg0].length) {
            return false;
        } else if (this.field2719[arg0][arg1] != null) {
            return true;
        } else if (this.field2718[arg0] == null) {
            this.method3140(arg0);
            return this.field2718[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fe.a(IB)Z")
    public boolean method3135(int arg0) {
        if (this.field2718[arg0] == null) {
            this.method3140(arg0);
            return this.field2718[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fe.b(I)Z")
    public boolean method3159() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2709.length; var2++) {
            int var3 = this.field2709[var2];
            if (this.field2718[var3] == null) {
                this.method3140(var3);
                if (this.field2718[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fe.u(IS)[B")
    public byte[] method3205(int arg0) {
        if (this.field2719.length == 1) {
            return this.method3130(0, arg0);
        } else if (this.field2719[arg0].length == 1) {
            return this.method3130(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fe.o(III)[B")
    public byte[] method3188(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2719.length || this.field2719[arg0] == null || arg1 < 0 || arg1 >= this.field2719[arg0].length) {
            return null;
        }
        if (this.field2719[arg0][arg1] == null) {
            boolean var3 = this.method3146(arg0, (int[]) null);
            if (!var3) {
                this.method3140(arg0);
                boolean var4 = this.method3146(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class129.method160(this.field2719[arg0][arg1], false);
    }

    @ObfuscatedName("fe.p(IB)[B")
    public byte[] method3139(int arg0) {
        if (this.field2719.length == 1) {
            return this.method3188(0, arg0);
        } else if (this.field2719[arg0].length == 1) {
            return this.method3188(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fe.i(II)V")
    public void method3140(int arg0) {
    }

    @ObfuscatedName("fe.q(II)[I")
    public int[] method3136(int arg0) {
        return this.field2715[arg0];
    }

    @ObfuscatedName("fe.g(II)I")
    public int method3142(int arg0) {
        return this.field2719[arg0].length;
    }

    @ObfuscatedName("fe.j(I)I")
    public int method3206() {
        return this.field2719.length;
    }

    @ObfuscatedName("fe.w(II)V")
    public void method3149(int arg0) {
        for (int var2 = 0; var2 < this.field2719[arg0].length; var2++) {
            this.field2719[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fe.x(I)V")
    public void method3145() {
        for (int var1 = 0; var1 < this.field2719.length; var1++) {
            if (this.field2719[var1] != null) {
                for (int var2 = 0; var2 < this.field2719[var1].length; var2++) {
                    this.field2719[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fe.f(I[II)Z")
    public boolean method3146(int arg0, int[] arg1) {
        if (this.field2718[arg0] == null) {
            return false;
        }
        int var3 = this.field2723[arg0];
        int[] var4 = this.field2715[arg0];
        Object[] var5 = this.field2719[arg0];
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
            var8 = class129.method160(this.field2718[arg0], true);
            class123 var9 = new class123(var8);
            var9.method2483(arg1, 5, var9.field2055.length);
        } else {
            var8 = class129.method160(this.field2718[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1293(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class123.method545(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class123.method545(var8, 0, var17);
            throw class152.method2324(var34, var16 + var18 + "," + this.field2711[arg0] + "," + this.field2721);
        }
        if (this.field2722) {
            this.field2718[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class123 var22 = new class123(var10);
            int[] var23 = new int[var3];
            var22.field2062 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2468();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2062 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2468();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2724) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class129.method856(var27[var33], false);
                }
            }
        } else if (this.field2724) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class129.method856(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fe.t(Ljava/lang/String;I)I")
    public int method3132(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2708.method3585(class167.method2056(var2));
    }

    @ObfuscatedName("fe.z(ILjava/lang/String;I)I")
    public int method3147(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2717[arg0].method3585(class167.method2056(var3));
    }

    @ObfuscatedName("fe.y(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3148(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2708.method3585(class167.method2056(var3));
        int var6 = this.field2717[var5].method3585(class167.method2056(var4));
        return this.method3130(var5, var6);
    }

    @ObfuscatedName("fe.m(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3131(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2708.method3585(class167.method2056(var3));
        int var6 = this.field2717[var5].method3585(class167.method2056(var4));
        return this.method3134(var5, var6);
    }

    @ObfuscatedName("fe.v(Ljava/lang/String;I)Z")
    public boolean method3150(String arg0) {
        int var2 = this.method3132("");
        return var2 == -1 ? this.method3131(arg0, "") : this.method3131("", arg0);
    }

    @ObfuscatedName("fe.k(Ljava/lang/String;B)V")
    public void method3151(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2708.method3585(class167.method2056(var2));
        if (var3 >= 0) {
            this.method3187(var3);
        }
    }

    @ObfuscatedName("ba.n([BB)[B")
    public static final byte[] method1293(byte[] arg0) {
        class123 var1 = new class123(arg0);
        int var2 = var1.method2464();
        int var3 = var1.method2468();
        if (var3 < 0 || !(field2714 == 0 || var3 <= field2714)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2591(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2468();
            if (var5 < 0 || field2714 != 0 && var5 > field2714) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class121.method2404(var6, var5, arg0, var3, 9);
            } else {
                field2726.method2399(var1, var6);
            }
            return var6;
        }
    }
}
