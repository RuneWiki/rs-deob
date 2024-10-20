package deob;

@ObfuscatedName("fy")
public abstract class class168 {

    @ObfuscatedName("fy.j")
    public int field2680;

    @ObfuscatedName("fy.h")
    public int[] field2663;

    @ObfuscatedName("fy.m")
    public int[] field2664;

    @ObfuscatedName("fy.z")
    public class193 field2673;

    @ObfuscatedName("fy.x")
    public int[] field2674;

    @ObfuscatedName("fy.e")
    public int[] field2682;

    @ObfuscatedName("fy.i")
    public int[] field2668;

    @ObfuscatedName("fy.c")
    public int[][] field2669;

    @ObfuscatedName("fy.n")
    public int[][] field2670;

    @ObfuscatedName("fy.l")
    public class193[] field2671;

    @ObfuscatedName("fy.u")
    public Object[] field2672;

    @ObfuscatedName("fy.r")
    public Object[][] field2667;

    @ObfuscatedName("fy.a")
    public static class117 field2665 = new class117();

    @ObfuscatedName("fy.d")
    public int field2675;

    @ObfuscatedName("fy.p")
    public boolean field2676;

    @ObfuscatedName("fy.q")
    public boolean field2677;

    @ObfuscatedName("fy.b")
    public static int field2662 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2676 = arg0;
        this.field2677 = arg1;
    }

    @ObfuscatedName("fy.j([BI)V")
    public void method3050(byte[] arg0) {
        this.field2675 = class120.method104(arg0, arg0.length);
        class120 var2 = new class120(method132(arg0));
        int var3 = var2.method2361();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2366();
        }
        int var4 = var2.method2361();
        if (var3 >= 7) {
            this.field2680 = var2.method2374();
        } else {
            this.field2680 = var2.method2363();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2663 = new int[this.field2680];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2680; var7++) {
                this.field2663[var7] = var5 += var2.method2374();
                if (this.field2663[var7] > var6) {
                    var6 = this.field2663[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2680; var8++) {
                this.field2663[var8] = var5 += var2.method2363();
                if (this.field2663[var8] > var6) {
                    var6 = this.field2663[var8];
                }
            }
        }
        this.field2674 = new int[var6 + 1];
        this.field2682 = new int[var6 + 1];
        this.field2668 = new int[var6 + 1];
        this.field2669 = new int[var6 + 1][];
        this.field2672 = new Object[var6 + 1];
        this.field2667 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2664 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2680; var9++) {
                this.field2664[this.field2663[var9]] = var2.method2366();
            }
            this.field2673 = new class193(this.field2664);
        }
        for (int var10 = 0; var10 < this.field2680; var10++) {
            this.field2674[this.field2663[var10]] = var2.method2366();
        }
        for (int var11 = 0; var11 < this.field2680; var11++) {
            this.field2682[this.field2663[var11]] = var2.method2366();
        }
        for (int var12 = 0; var12 < this.field2680; var12++) {
            this.field2668[this.field2663[var12]] = var2.method2363();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2680; var13++) {
                int var14 = this.field2663[var13];
                int var15 = this.field2668[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2669[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2669[var14][var18] = var16 += var2.method2374();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2667[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2680; var20++) {
                int var21 = this.field2663[var20];
                int var22 = this.field2668[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2669[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2669[var21][var25] = var23 += var2.method2363();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2667[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2670 = new int[var6 + 1][];
        this.field2671 = new class193[var6 + 1];
        for (int var27 = 0; var27 < this.field2680; var27++) {
            int var28 = this.field2663[var27];
            int var29 = this.field2668[var28];
            this.field2670[var28] = new int[this.field2667[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2670[var28][this.field2669[var28][var30]] = var2.method2366();
            }
            this.field2671[var28] = new class193(this.field2670[var28]);
        }
    }

    @ObfuscatedName("fy.h(II)V")
    public void method3038(int arg0) {
    }

    @ObfuscatedName("fy.m(IIB)[B")
    public byte[] method3011(int arg0, int arg1) {
        return this.method3059(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fy.z(II[II)[B")
    public byte[] method3059(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return null;
        }
        if (this.field2667[arg0][arg1] == null) {
            boolean var4 = this.method3025(arg0, arg2);
            if (!var4) {
                this.method3019(arg0);
                boolean var5 = this.method3025(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method638(this.field2667[arg0][arg1], false);
        if (this.field2677) {
            this.field2667[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fy.x(IIB)Z")
    public boolean method3088(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return false;
        } else if (this.field2667[arg0][arg1] != null) {
            return true;
        } else if (this.field2672[arg0] == null) {
            this.method3019(arg0);
            return this.field2672[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fy.e(II)Z")
    public boolean method3014(int arg0) {
        if (this.field2672[arg0] == null) {
            this.method3019(arg0);
            return this.field2672[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fy.i(I)Z")
    public boolean method3048() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2663.length; var2++) {
            int var3 = this.field2663[var2];
            if (this.field2672[var3] == null) {
                this.method3019(var3);
                if (this.field2672[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fy.c(II)[B")
    public byte[] method3066(int arg0) {
        if (this.field2667.length == 1) {
            return this.method3011(0, arg0);
        } else if (this.field2667[arg0].length == 1) {
            return this.method3011(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fy.n(III)[B")
    public byte[] method3017(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return null;
        }
        if (this.field2667[arg0][arg1] == null) {
            boolean var3 = this.method3025(arg0, (int[]) null);
            if (!var3) {
                this.method3019(arg0);
                boolean var4 = this.method3025(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method638(this.field2667[arg0][arg1], false);
    }

    @ObfuscatedName("fy.l(II)[B")
    public byte[] method3018(int arg0) {
        if (this.field2667.length == 1) {
            return this.method3017(0, arg0);
        } else if (this.field2667[arg0].length == 1) {
            return this.method3017(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fy.u(IB)V")
    public void method3019(int arg0) {
    }

    @ObfuscatedName("fy.r(II)[I")
    public int[] method3020(int arg0) {
        return this.field2669[arg0];
    }

    @ObfuscatedName("fy.a(II)I")
    public int method3021(int arg0) {
        return this.field2667[arg0].length;
    }

    @ObfuscatedName("fy.d(I)I")
    public int method3044() {
        return this.field2667.length;
    }

    @ObfuscatedName("fy.p(II)V")
    public void method3054(int arg0) {
        for (int var2 = 0; var2 < this.field2667[arg0].length; var2++) {
            this.field2667[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fy.q(I)V")
    public void method3032() {
        for (int var1 = 0; var1 < this.field2667.length; var1++) {
            if (this.field2667[var1] != null) {
                for (int var2 = 0; var2 < this.field2667[var1].length; var2++) {
                    this.field2667[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fy.b(I[II)Z")
    public boolean method3025(int arg0, int[] arg1) {
        if (this.field2672[arg0] == null) {
            return false;
        }
        int var3 = this.field2668[arg0];
        int[] var4 = this.field2669[arg0];
        Object[] var5 = this.field2667[arg0];
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
            var8 = class126.method638(this.field2672[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2533(arg1, 5, var9.field1974.length);
        } else {
            var8 = class126.method638(this.field2672[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method132(var8);
        } catch (RuntimeException var27) {
            throw class149.method1969(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class120.method104(var8, var8.length) + "," + class120.method104(var8, var8.length - 2) + "," + this.field2674[arg0] + "," + this.field2675);
        }
        if (this.field2676) {
            this.field2672[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class120 var15 = new class120(var10);
            int[] var16 = new int[var3];
            var15.field1972 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2366();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1972 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2366();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2677) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class126.method182(var20[var26], false);
                }
            }
        } else if (this.field2677) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method182(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fy.t(Ljava/lang/String;I)I")
    public int method3026(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2673.method3456(class164.method2263(var2));
    }

    @ObfuscatedName("fy.y(ILjava/lang/String;I)I")
    public int method3027(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2671[arg0].method3456(class164.method2263(var3));
    }

    @ObfuscatedName("fy.w(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method3028(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2673.method3456(class164.method2263(var3));
        int var6 = this.field2671[var5].method3456(class164.method2263(var4));
        return this.method3011(var5, var6);
    }

    @ObfuscatedName("fy.g(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3041(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2673.method3456(class164.method2263(var3));
        int var6 = this.field2671[var5].method3456(class164.method2263(var4));
        return this.method3088(var5, var6);
    }

    @ObfuscatedName("fy.s(Ljava/lang/String;B)Z")
    public boolean method3030(String arg0) {
        int var2 = this.method3026("");
        return var2 == -1 ? this.method3041(arg0, "") : this.method3041("", arg0);
    }

    @ObfuscatedName("fy.k(Ljava/lang/String;S)V")
    public void method3031(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2673.method3456(class164.method2263(var2));
        if (var3 >= 0) {
            this.method3038(var3);
        }
    }

    @ObfuscatedName("u.o([BI)[B")
    public static final byte[] method132(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2361();
        int var3 = var1.method2366();
        if (var3 < 0 || !(field2662 == 0 || var3 <= field2662)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2372(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2366();
            if (var5 < 0 || field2662 != 0 && var5 > field2662) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2311(var6, var5, arg0, var3, 9);
            } else {
                field2665.method2305(var1, var6);
            }
            return var6;
        }
    }
}
