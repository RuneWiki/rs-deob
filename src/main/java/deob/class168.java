package deob;

@ObfuscatedName("ft")
public abstract class class168 {

    @ObfuscatedName("ft.a")
    public int field2682;

    @ObfuscatedName("ft.w")
    public int[] field2661;

    @ObfuscatedName("ft.d")
    public int[] field2662;

    @ObfuscatedName("ft.c")
    public class193 field2663;

    @ObfuscatedName("ft.y")
    public int[] field2664;

    @ObfuscatedName("ft.k")
    public int[] field2665;

    @ObfuscatedName("ft.r")
    public int[] field2668;

    @ObfuscatedName("ft.p")
    public int[][] field2680;

    @ObfuscatedName("ft.q")
    public int[][] field2675;

    @ObfuscatedName("ft.m")
    public class193[] field2669;

    @ObfuscatedName("ft.e")
    public Object[] field2667;

    @ObfuscatedName("ft.x")
    public Object[][] field2671;

    @ObfuscatedName("ft.z")
    public static class117 field2672 = new class117();

    @ObfuscatedName("ft.i")
    public int field2673;

    @ObfuscatedName("ft.t")
    public boolean field2674;

    @ObfuscatedName("ft.n")
    public boolean field2676;

    @ObfuscatedName("ft.u")
    public static int field2660 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2674 = arg0;
        this.field2676 = arg1;
    }

    @ObfuscatedName("ft.a([BS)V")
    public void method3145(byte[] arg0) {
        this.field2673 = class120.method924(arg0, arg0.length);
        class120 var2 = new class120(method2383(arg0));
        int var3 = var2.method2462();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2467();
        }
        int var4 = var2.method2462();
        if (var3 >= 7) {
            this.field2682 = var2.method2583();
        } else {
            this.field2682 = var2.method2464();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2661 = new int[this.field2682];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2682; var7++) {
                this.field2661[var7] = var5 += var2.method2583();
                if (this.field2661[var7] > var6) {
                    var6 = this.field2661[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2682; var8++) {
                this.field2661[var8] = var5 += var2.method2464();
                if (this.field2661[var8] > var6) {
                    var6 = this.field2661[var8];
                }
            }
        }
        this.field2664 = new int[var6 + 1];
        this.field2665 = new int[var6 + 1];
        this.field2668 = new int[var6 + 1];
        this.field2680 = new int[var6 + 1][];
        this.field2667 = new Object[var6 + 1];
        this.field2671 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2662 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2682; var9++) {
                this.field2662[this.field2661[var9]] = var2.method2467();
            }
            this.field2663 = new class193(this.field2662);
        }
        for (int var10 = 0; var10 < this.field2682; var10++) {
            this.field2664[this.field2661[var10]] = var2.method2467();
        }
        for (int var11 = 0; var11 < this.field2682; var11++) {
            this.field2665[this.field2661[var11]] = var2.method2467();
        }
        for (int var12 = 0; var12 < this.field2682; var12++) {
            this.field2668[this.field2661[var12]] = var2.method2464();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2682; var13++) {
                int var14 = this.field2661[var13];
                int var15 = this.field2668[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2680[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2680[var14][var18] = var16 += var2.method2583();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2671[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2682; var20++) {
                int var21 = this.field2661[var20];
                int var22 = this.field2668[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2680[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2680[var21][var25] = var23 += var2.method2464();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2671[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2675 = new int[var6 + 1][];
        this.field2669 = new class193[var6 + 1];
        for (int var27 = 0; var27 < this.field2682; var27++) {
            int var28 = this.field2661[var27];
            int var29 = this.field2668[var28];
            this.field2675[var28] = new int[this.field2671[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2675[var28][this.field2680[var28][var30]] = var2.method2467();
            }
            this.field2669[var28] = new class193(this.field2675[var28]);
        }
    }

    @ObfuscatedName("ft.w(II)V")
    public void method3146(int arg0) {
    }

    @ObfuscatedName("ft.d(III)[B")
    public byte[] method3188(int arg0, int arg1) {
        return this.method3148(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ft.c(II[IB)[B")
    public byte[] method3148(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2671.length || this.field2671[arg0] == null || arg1 < 0 || arg1 >= this.field2671[arg0].length) {
            return null;
        }
        if (this.field2671[arg0][arg1] == null) {
            boolean var4 = this.method3161(arg0, arg2);
            if (!var4) {
                this.method3179(arg0);
                boolean var5 = this.method3161(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method923(this.field2671[arg0][arg1], false);
        if (this.field2676) {
            this.field2671[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ft.y(IIB)Z")
    public boolean method3214(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2671.length || this.field2671[arg0] == null || arg1 < 0 || arg1 >= this.field2671[arg0].length) {
            return false;
        } else if (this.field2671[arg0][arg1] != null) {
            return true;
        } else if (this.field2667[arg0] == null) {
            this.method3179(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ft.k(II)Z")
    public boolean method3158(int arg0) {
        if (this.field2667[arg0] == null) {
            this.method3179(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ft.r(I)Z")
    public boolean method3151() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2661.length; var2++) {
            int var3 = this.field2661[var2];
            if (this.field2667[var3] == null) {
                this.method3179(var3);
                if (this.field2667[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ft.p(IB)[B")
    public byte[] method3199(int arg0) {
        if (this.field2671.length == 1) {
            return this.method3188(0, arg0);
        } else if (this.field2671[arg0].length == 1) {
            return this.method3188(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ft.q(IIB)[B")
    public byte[] method3217(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2671.length || this.field2671[arg0] == null || arg1 < 0 || arg1 >= this.field2671[arg0].length) {
            return null;
        }
        if (this.field2671[arg0][arg1] == null) {
            boolean var3 = this.method3161(arg0, (int[]) null);
            if (!var3) {
                this.method3179(arg0);
                boolean var4 = this.method3161(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method923(this.field2671[arg0][arg1], false);
    }

    @ObfuscatedName("ft.m(IB)[B")
    public byte[] method3154(int arg0) {
        if (this.field2671.length == 1) {
            return this.method3217(0, arg0);
        } else if (this.field2671[arg0].length == 1) {
            return this.method3217(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ft.e(II)V")
    public void method3179(int arg0) {
    }

    @ObfuscatedName("ft.x(II)[I")
    public int[] method3153(int arg0) {
        return this.field2680[arg0];
    }

    @ObfuscatedName("ft.z(II)I")
    public int method3157(int arg0) {
        return this.field2671[arg0].length;
    }

    @ObfuscatedName("ft.i(I)I")
    public int method3196() {
        return this.field2671.length;
    }

    @ObfuscatedName("ft.t(IB)V")
    public void method3201(int arg0) {
        for (int var2 = 0; var2 < this.field2671[arg0].length; var2++) {
            this.field2671[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ft.n(B)V")
    public void method3193() {
        for (int var1 = 0; var1 < this.field2671.length; var1++) {
            if (this.field2671[var1] != null) {
                for (int var2 = 0; var2 < this.field2671[var1].length; var2++) {
                    this.field2671[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ft.u(I[II)Z")
    public boolean method3161(int arg0, int[] arg1) {
        if (this.field2667[arg0] == null) {
            return false;
        }
        int var3 = this.field2668[arg0];
        int[] var4 = this.field2680[arg0];
        Object[] var5 = this.field2671[arg0];
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
            var8 = class126.method923(this.field2667[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2493(arg1, 5, var9.field1994.length);
        } else {
            var8 = class126.method923(this.field2667[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2383(var8);
        } catch (RuntimeException var27) {
            throw Statics.method625(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class120.method924(var8, var8.length) + "," + class120.method924(var8, var8.length - 2) + "," + this.field2664[arg0] + "," + this.field2673);
        }
        if (this.field2674) {
            this.field2667[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class120 var15 = new class120(var10);
            int[] var16 = new int[var3];
            var15.field1993 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2467();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1993 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2467();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2676) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class126.method2124(var20[var26], false);
                }
            }
        } else if (this.field2676) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method2124(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ft.g(Ljava/lang/String;I)I")
    public int method3162(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2663.method3574(class164.method735(var2));
    }

    @ObfuscatedName("ft.j(ILjava/lang/String;B)I")
    public int method3163(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2669[arg0].method3574(class164.method735(var3));
    }

    @ObfuscatedName("ft.h(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3176(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2663.method3574(class164.method735(var3));
        int var6 = this.field2669[var5].method3574(class164.method735(var4));
        return this.method3188(var5, var6);
    }

    @ObfuscatedName("ft.s(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3165(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2663.method3574(class164.method735(var3));
        int var6 = this.field2669[var5].method3574(class164.method735(var4));
        return this.method3214(var5, var6);
    }

    @ObfuscatedName("ft.f(Ljava/lang/String;S)Z")
    public boolean method3166(String arg0) {
        int var2 = this.method3162("");
        return var2 == -1 ? this.method3165(arg0, "") : this.method3165("", arg0);
    }

    @ObfuscatedName("ft.b(Ljava/lang/String;B)V")
    public void method3169(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2663.method3574(class164.method735(var2));
        if (var3 >= 0) {
            this.method3146(var3);
        }
    }

    @ObfuscatedName("dn.l([BI)[B")
    public static final byte[] method2383(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2462();
        int var3 = var1.method2467();
        if (var3 < 0 || !(field2660 == 0 || var3 <= field2660)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2589(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2467();
            if (var5 < 0 || field2660 != 0 && var5 > field2660) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2427(var6, var5, arg0, var3, 9);
            } else {
                field2672.method2401(var1, var6);
            }
            return var6;
        }
    }
}
