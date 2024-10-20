package deob;

@ObfuscatedName("fv")
public abstract class class167 {

    @ObfuscatedName("fv.h")
    public int field2670;

    @ObfuscatedName("fv.m")
    public int[] field2653;

    @ObfuscatedName("fv.i")
    public int[] field2655;

    @ObfuscatedName("fv.q")
    public class192 field2656;

    @ObfuscatedName("fv.p")
    public int[] field2659;

    @ObfuscatedName("fv.c")
    public int[] field2658;

    @ObfuscatedName("fv.f")
    public int[] field2661;

    @ObfuscatedName("fv.y")
    public int[][] field2660;

    @ObfuscatedName("fv.w")
    public int[][] field2663;

    @ObfuscatedName("fv.l")
    public class192[] field2662;

    @ObfuscatedName("fv.v")
    public Object[] field2657;

    @ObfuscatedName("fv.k")
    public Object[][] field2664;

    @ObfuscatedName("fv.o")
    public static class116 field2665 = new class116();

    @ObfuscatedName("fv.u")
    public int field2666;

    @ObfuscatedName("fv.s")
    public boolean field2667;

    @ObfuscatedName("fv.g")
    public boolean field2668;

    @ObfuscatedName("fv.x")
    public static int field2669 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2667 = arg0;
        this.field2668 = arg1;
    }

    @ObfuscatedName("fv.h([BI)V")
    public void method3005(byte[] arg0) {
        this.field2666 = Statics.method2238(arg0, arg0.length);
        class119 var2 = new class119(method5(arg0));
        int var3 = var2.method2320();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2324();
        }
        int var4 = var2.method2320();
        if (var3 >= 7) {
            this.field2670 = var2.method2333();
        } else {
            this.field2670 = var2.method2322();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2653 = new int[this.field2670];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2670; var7++) {
                this.field2653[var7] = var5 += var2.method2333();
                if (this.field2653[var7] > var6) {
                    var6 = this.field2653[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2670; var8++) {
                this.field2653[var8] = var5 += var2.method2322();
                if (this.field2653[var8] > var6) {
                    var6 = this.field2653[var8];
                }
            }
        }
        this.field2659 = new int[var6 + 1];
        this.field2658 = new int[var6 + 1];
        this.field2661 = new int[var6 + 1];
        this.field2660 = new int[var6 + 1][];
        this.field2657 = new Object[var6 + 1];
        this.field2664 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2655 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2670; var9++) {
                this.field2655[this.field2653[var9]] = var2.method2324();
            }
            this.field2656 = new class192(this.field2655);
        }
        for (int var10 = 0; var10 < this.field2670; var10++) {
            this.field2659[this.field2653[var10]] = var2.method2324();
        }
        for (int var11 = 0; var11 < this.field2670; var11++) {
            this.field2658[this.field2653[var11]] = var2.method2324();
        }
        for (int var12 = 0; var12 < this.field2670; var12++) {
            this.field2661[this.field2653[var12]] = var2.method2322();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2670; var13++) {
                int var14 = this.field2653[var13];
                int var15 = this.field2661[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2660[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2660[var14][var18] = var16 += var2.method2333();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2664[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2670; var20++) {
                int var21 = this.field2653[var20];
                int var22 = this.field2661[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2660[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2660[var21][var25] = var23 += var2.method2322();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2664[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2663 = new int[var6 + 1][];
        this.field2662 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2670; var27++) {
            int var28 = this.field2653[var27];
            int var29 = this.field2661[var28];
            this.field2663[var28] = new int[this.field2664[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2663[var28][this.field2660[var28][var30]] = var2.method2324();
            }
            this.field2662[var28] = new class192(this.field2663[var28]);
        }
    }

    @ObfuscatedName("fv.m(II)V")
    public void method3006(int arg0) {
    }

    @ObfuscatedName("fv.i(III)[B")
    public byte[] method3051(int arg0, int arg1) {
        return this.method3008(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fv.q(II[II)[B")
    public byte[] method3008(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2664.length || this.field2664[arg0] == null || arg1 < 0 || arg1 >= this.field2664[arg0].length) {
            return null;
        }
        if (this.field2664[arg0][arg1] == null) {
            boolean var4 = this.method3021(arg0, arg2);
            if (!var4) {
                this.method3046(arg0);
                boolean var5 = this.method3021(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2948(this.field2664[arg0][arg1], false);
        if (this.field2668) {
            this.field2664[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fv.p(III)Z")
    public boolean method3080(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2664.length || this.field2664[arg0] == null || arg1 < 0 || arg1 >= this.field2664[arg0].length) {
            return false;
        } else if (this.field2664[arg0][arg1] != null) {
            return true;
        } else if (this.field2657[arg0] == null) {
            this.method3046(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.c(II)Z")
    public boolean method3010(int arg0) {
        if (this.field2657[arg0] == null) {
            this.method3046(arg0);
            return this.field2657[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.f(I)Z")
    public boolean method3011() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2653.length; var2++) {
            int var3 = this.field2653[var2];
            if (this.field2657[var3] == null) {
                this.method3046(var3);
                if (this.field2657[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fv.y(II)[B")
    public byte[] method3012(int arg0) {
        if (this.field2664.length == 1) {
            return this.method3051(0, arg0);
        } else if (this.field2664[arg0].length == 1) {
            return this.method3051(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.w(IIS)[B")
    public byte[] method3013(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2664.length || this.field2664[arg0] == null || arg1 < 0 || arg1 >= this.field2664[arg0].length) {
            return null;
        }
        if (this.field2664[arg0][arg1] == null) {
            boolean var3 = this.method3021(arg0, (int[]) null);
            if (!var3) {
                this.method3046(arg0);
                boolean var4 = this.method3021(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2948(this.field2664[arg0][arg1], false);
    }

    @ObfuscatedName("fv.l(IS)[B")
    public byte[] method3018(int arg0) {
        if (this.field2664.length == 1) {
            return this.method3013(0, arg0);
        } else if (this.field2664[arg0].length == 1) {
            return this.method3013(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.v(IB)V")
    public void method3046(int arg0) {
    }

    @ObfuscatedName("fv.k(II)[I")
    public int[] method3016(int arg0) {
        return this.field2660[arg0];
    }

    @ObfuscatedName("fv.o(II)I")
    public int method3017(int arg0) {
        return this.field2664[arg0].length;
    }

    @ObfuscatedName("fv.u(I)I")
    public int method3053() {
        return this.field2664.length;
    }

    @ObfuscatedName("fv.s(IB)V")
    public void method3019(int arg0) {
        for (int var2 = 0; var2 < this.field2664[arg0].length; var2++) {
            this.field2664[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fv.g(B)V")
    public void method3058() {
        for (int var1 = 0; var1 < this.field2664.length; var1++) {
            if (this.field2664[var1] != null) {
                for (int var2 = 0; var2 < this.field2664[var1].length; var2++) {
                    this.field2664[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fv.x(I[II)Z")
    public boolean method3021(int arg0, int[] arg1) {
        if (this.field2657[arg0] == null) {
            return false;
        }
        int var3 = this.field2661[arg0];
        int[] var4 = this.field2660[arg0];
        Object[] var5 = this.field2664[arg0];
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
            var8 = class125.method2948(this.field2657[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2338(arg1, 5, var9.field1989.length);
        } else {
            var8 = class125.method2948(this.field2657[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method5(var8);
        } catch (RuntimeException var27) {
            throw class148.method149(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + Statics.method2238(var8, var8.length) + "," + Statics.method2238(var8, var8.length - 2) + "," + this.field2659[arg0] + "," + this.field2666);
        }
        if (this.field2667) {
            this.field2657[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class119 var15 = new class119(var10);
            int[] var16 = new int[var3];
            var15.field1988 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2324();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1988 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2324();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2668) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method617(var20[var26], false);
                }
            }
        } else if (this.field2668) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method617(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fv.a(Ljava/lang/String;I)I")
    public int method3022(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2656.method3470(class163.method714(var2));
    }

    @ObfuscatedName("fv.t(ILjava/lang/String;I)I")
    public int method3023(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2662[arg0].method3470(class163.method714(var3));
    }

    @ObfuscatedName("fv.z(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3049(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2656.method3470(class163.method714(var3));
        int var6 = this.field2662[var5].method3470(class163.method714(var4));
        return this.method3051(var5, var6);
    }

    @ObfuscatedName("fv.r(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3025(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2656.method3470(class163.method714(var3));
        int var6 = this.field2662[var5].method3470(class163.method714(var4));
        return this.method3080(var5, var6);
    }

    @ObfuscatedName("fv.d(Ljava/lang/String;B)Z")
    public boolean method3009(String arg0) {
        int var2 = this.method3022("");
        return var2 == -1 ? this.method3025(arg0, "") : this.method3025("", arg0);
    }

    @ObfuscatedName("fv.n(Ljava/lang/String;I)V")
    public void method3027(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2656.method3470(class163.method714(var2));
        if (var3 >= 0) {
            this.method3006(var3);
        }
    }

    @ObfuscatedName("m.j([BI)[B")
    public static final byte[] method5(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2320();
        int var3 = var1.method2324();
        if (var3 < 0 || !(field2669 == 0 || var3 <= field2669)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2436(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2324();
            if (var5 < 0 || field2669 != 0 && var5 > field2669) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2278(var6, var5, arg0, var3, 9);
            } else {
                field2665.method2262(var1, var6);
            }
            return var6;
        }
    }
}
