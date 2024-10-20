package deob;

@ObfuscatedName("fp")
public abstract class class168 {

    @ObfuscatedName("fp.t")
    public int field2711;

    @ObfuscatedName("fp.i")
    public int[] field2702;

    @ObfuscatedName("fp.g")
    public int[] field2706;

    @ObfuscatedName("fp.h")
    public class193 field2704;

    @ObfuscatedName("fp.z")
    public int[] field2708;

    @ObfuscatedName("fp.r")
    public int[] field2717;

    @ObfuscatedName("fp.f")
    public int[] field2703;

    @ObfuscatedName("fp.s")
    public int[][] field2713;

    @ObfuscatedName("fp.d")
    public int[][] field2709;

    @ObfuscatedName("fp.l")
    public class193[] field2710;

    @ObfuscatedName("fp.y")
    public Object[] field2705;

    @ObfuscatedName("fp.p")
    public Object[][] field2712;

    @ObfuscatedName("fp.k")
    public static class117 field2707 = new class117();

    @ObfuscatedName("fp.o")
    public int field2714;

    @ObfuscatedName("fp.b")
    public boolean field2715;

    @ObfuscatedName("fp.j")
    public boolean field2716;

    @ObfuscatedName("fp.a")
    public static int field2701 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2715 = arg0;
        this.field2716 = arg1;
    }

    @ObfuscatedName("fp.t([BI)V")
    public void method3078(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class120.method2915(arg0, 0, var2);
        this.field2714 = var3;
        class120 var4 = new class120(method2737(arg0));
        int var5 = var4.method2334();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2345();
        }
        int var6 = var4.method2334();
        if (var5 >= 7) {
            this.field2711 = var4.method2322();
        } else {
            this.field2711 = var4.method2310();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2702 = new int[this.field2711];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2711; var9++) {
                this.field2702[var9] = var7 += var4.method2322();
                if (this.field2702[var9] > var8) {
                    var8 = this.field2702[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2711; var10++) {
                this.field2702[var10] = var7 += var4.method2310();
                if (this.field2702[var10] > var8) {
                    var8 = this.field2702[var10];
                }
            }
        }
        this.field2708 = new int[var8 + 1];
        this.field2717 = new int[var8 + 1];
        this.field2703 = new int[var8 + 1];
        this.field2713 = new int[var8 + 1][];
        this.field2705 = new Object[var8 + 1];
        this.field2712 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2706 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2711; var11++) {
                this.field2706[this.field2702[var11]] = var4.method2345();
            }
            this.field2704 = new class193(this.field2706);
        }
        for (int var12 = 0; var12 < this.field2711; var12++) {
            this.field2708[this.field2702[var12]] = var4.method2345();
        }
        for (int var13 = 0; var13 < this.field2711; var13++) {
            this.field2717[this.field2702[var13]] = var4.method2345();
        }
        for (int var14 = 0; var14 < this.field2711; var14++) {
            this.field2703[this.field2702[var14]] = var4.method2310();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2711; var15++) {
                int var16 = this.field2702[var15];
                int var17 = this.field2703[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2713[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2713[var16][var20] = var18 += var4.method2322();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2712[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2711; var22++) {
                int var23 = this.field2702[var22];
                int var24 = this.field2703[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2713[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2713[var23][var27] = var25 += var4.method2310();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2712[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2709 = new int[var8 + 1][];
        this.field2710 = new class193[var8 + 1];
        for (int var29 = 0; var29 < this.field2711; var29++) {
            int var30 = this.field2702[var29];
            int var31 = this.field2703[var30];
            this.field2709[var30] = new int[this.field2712[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2709[var30][this.field2713[var30][var32]] = var4.method2345();
            }
            this.field2710[var30] = new class193(this.field2709[var30]);
        }
    }

    @ObfuscatedName("fp.i(IB)V")
    public void method2999(int arg0) {
    }

    @ObfuscatedName("fp.g(III)[B")
    public byte[] method3002(int arg0, int arg1) {
        return this.method3003(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fp.h(II[IB)[B")
    public byte[] method3003(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2712.length || this.field2712[arg0] == null || arg1 < 0 || arg1 >= this.field2712[arg0].length) {
            return null;
        }
        if (this.field2712[arg0][arg1] == null) {
            boolean var4 = this.method3016(arg0, arg2);
            if (!var4) {
                this.method3009(arg0);
                boolean var5 = this.method3016(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method2919(this.field2712[arg0][arg1], false);
        if (this.field2716) {
            this.field2712[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fp.z(III)Z")
    public boolean method3040(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2712.length || this.field2712[arg0] == null || arg1 < 0 || arg1 >= this.field2712[arg0].length) {
            return false;
        } else if (this.field2712[arg0][arg1] != null) {
            return true;
        } else if (this.field2705[arg0] == null) {
            this.method3009(arg0);
            return this.field2705[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.r(IB)Z")
    public boolean method3005(int arg0) {
        if (this.field2705[arg0] == null) {
            this.method3009(arg0);
            return this.field2705[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fp.f(I)Z")
    public boolean method3006() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2702.length; var2++) {
            int var3 = this.field2702[var2];
            if (this.field2705[var3] == null) {
                this.method3009(var3);
                if (this.field2705[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fp.s(II)[B")
    public byte[] method3056(int arg0) {
        if (this.field2712.length == 1) {
            return this.method3002(0, arg0);
        } else if (this.field2712[arg0].length == 1) {
            return this.method3002(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.d(IIB)[B")
    public byte[] method3021(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2712.length || this.field2712[arg0] == null || arg1 < 0 || arg1 >= this.field2712[arg0].length) {
            return null;
        }
        if (this.field2712[arg0][arg1] == null) {
            boolean var3 = this.method3016(arg0, (int[]) null);
            if (!var3) {
                this.method3009(arg0);
                boolean var4 = this.method3016(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method2919(this.field2712[arg0][arg1], false);
    }

    @ObfuscatedName("fp.l(II)[B")
    public byte[] method3072(int arg0) {
        if (this.field2712.length == 1) {
            return this.method3021(0, arg0);
        } else if (this.field2712[arg0].length == 1) {
            return this.method3021(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fp.y(II)V")
    public void method3009(int arg0) {
    }

    @ObfuscatedName("fp.p(II)[I")
    public int[] method3011(int arg0) {
        return this.field2713[arg0];
    }

    @ObfuscatedName("fp.k(II)I")
    public int method3012(int arg0) {
        return this.field2712[arg0].length;
    }

    @ObfuscatedName("fp.o(I)I")
    public int method3013() {
        return this.field2712.length;
    }

    @ObfuscatedName("fp.b(II)V")
    public void method3014(int arg0) {
        for (int var2 = 0; var2 < this.field2712[arg0].length; var2++) {
            this.field2712[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fp.j(I)V")
    public void method3019() {
        for (int var1 = 0; var1 < this.field2712.length; var1++) {
            if (this.field2712[var1] != null) {
                for (int var2 = 0; var2 < this.field2712[var1].length; var2++) {
                    this.field2712[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fp.a(I[IB)Z")
    public boolean method3016(int arg0, int[] arg1) {
        if (this.field2705[arg0] == null) {
            return false;
        }
        int var3 = this.field2703[arg0];
        int[] var4 = this.field2713[arg0];
        Object[] var5 = this.field2712[arg0];
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
            var8 = class126.method2919(this.field2705[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2327(arg1, 5, var9.field2002.length);
        } else {
            var8 = class126.method2919(this.field2705[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2737(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class120.method2915(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class120.method2915(var8, 0, var18);
            throw class149.method3608(var35, var17 + var19 + "," + this.field2708[arg0] + "," + this.field2714);
        }
        if (this.field2715) {
            this.field2705[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class120 var23 = new class120(var10);
            int[] var24 = new int[var3];
            var23.field2001 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2345();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2001 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2345();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2716) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class126.method2231(var28[var34], false);
                }
            }
        } else if (this.field2716) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method2231(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fp.u(Ljava/lang/String;B)I")
    public int method3017(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2704.method3447(class164.method2507(var2));
    }

    @ObfuscatedName("fp.c(ILjava/lang/String;I)I")
    public int method3018(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2710[arg0].method3447(class164.method2507(var3));
    }

    @ObfuscatedName("fp.n(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3060(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2704.method3447(class164.method2507(var3));
        int var6 = this.field2710[var5].method3447(class164.method2507(var4));
        return this.method3002(var5, var6);
    }

    @ObfuscatedName("fp.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3008(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2704.method3447(class164.method2507(var3));
        int var6 = this.field2710[var5].method3447(class164.method2507(var4));
        return this.method3040(var5, var6);
    }

    @ObfuscatedName("fp.x(Ljava/lang/String;B)Z")
    public boolean method3062(String arg0) {
        int var2 = this.method3017("");
        return var2 == -1 ? this.method3008(arg0, "") : this.method3008("", arg0);
    }

    @ObfuscatedName("fp.v(Ljava/lang/String;I)V")
    public void method3022(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2704.method3447(class164.method2507(var2));
        if (var3 >= 0) {
            this.method2999(var3);
        }
    }

    @ObfuscatedName("ez.m([BB)[B")
    public static final byte[] method2737(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2334();
        int var3 = var1.method2345();
        if (var3 < 0 || !(field2701 == 0 || var3 <= field2701)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2319(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2345();
            if (var5 < 0 || field2701 != 0 && var5 > field2701) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2280(var6, var5, arg0, var3, 9);
            } else {
                field2707.method2252(var1, var6);
            }
            return var6;
        }
    }
}
