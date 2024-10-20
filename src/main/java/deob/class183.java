package deob;

@ObfuscatedName("gk")
public abstract class class183 {

    @ObfuscatedName("gk.x")
    public int field2711;

    @ObfuscatedName("gk.j")
    public int[] field2699;

    @ObfuscatedName("gk.c")
    public int[] field2700;

    @ObfuscatedName("gk.d")
    public class123 field2701;

    @ObfuscatedName("gk.w")
    public int[] field2702;

    @ObfuscatedName("gk.h")
    public int[] field2714;

    @ObfuscatedName("gk.u")
    public int[] field2704;

    @ObfuscatedName("gk.k")
    public int[][] field2703;

    @ObfuscatedName("gk.g")
    public int[][] field2706;

    @ObfuscatedName("gk.y")
    public class123[] field2707;

    @ObfuscatedName("gk.e")
    public Object[] field2708;

    @ObfuscatedName("gk.q")
    public Object[][] field2698;

    @ObfuscatedName("gk.v")
    public static class147 field2710 = new class147();

    @ObfuscatedName("gk.l")
    public int field2712;

    @ObfuscatedName("gk.s")
    public boolean field2705;

    @ObfuscatedName("gk.r")
    public boolean field2713;

    @ObfuscatedName("gk.m")
    public static int field2709 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2705 = arg0;
        this.field2713 = arg1;
    }

    @ObfuscatedName("gk.x([BB)V")
    public void method3150(byte[] arg0) {
        this.field2712 = class154.method795(arg0, arg0.length);
        class154 var2 = new class154(method94(arg0));
        int var3 = var2.method2701();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2644();
        }
        int var4 = var2.method2701();
        if (var3 >= 7) {
            this.field2711 = var2.method2653();
        } else {
            this.field2711 = var2.method2745();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2699 = new int[this.field2711];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2711; var7++) {
                this.field2699[var7] = var5 += var2.method2653();
                if (this.field2699[var7] > var6) {
                    var6 = this.field2699[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2711; var8++) {
                this.field2699[var8] = var5 += var2.method2745();
                if (this.field2699[var8] > var6) {
                    var6 = this.field2699[var8];
                }
            }
        }
        this.field2702 = new int[var6 + 1];
        this.field2714 = new int[var6 + 1];
        this.field2704 = new int[var6 + 1];
        this.field2703 = new int[var6 + 1][];
        this.field2708 = new Object[var6 + 1];
        this.field2698 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2700 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2711; var9++) {
                this.field2700[this.field2699[var9]] = var2.method2644();
            }
            this.field2701 = new class123(this.field2700);
        }
        for (int var10 = 0; var10 < this.field2711; var10++) {
            this.field2702[this.field2699[var10]] = var2.method2644();
        }
        for (int var11 = 0; var11 < this.field2711; var11++) {
            this.field2714[this.field2699[var11]] = var2.method2644();
        }
        for (int var12 = 0; var12 < this.field2711; var12++) {
            this.field2704[this.field2699[var12]] = var2.method2745();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2711; var13++) {
                int var14 = this.field2699[var13];
                int var15 = this.field2704[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2703[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2703[var14][var18] = var16 += var2.method2653();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2698[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2711; var20++) {
                int var21 = this.field2699[var20];
                int var22 = this.field2704[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2703[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2703[var21][var25] = var23 += var2.method2745();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2698[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2706 = new int[var6 + 1][];
        this.field2707 = new class123[var6 + 1];
        for (int var27 = 0; var27 < this.field2711; var27++) {
            int var28 = this.field2699[var27];
            int var29 = this.field2704[var28];
            this.field2706[var28] = new int[this.field2698[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2706[var28][this.field2703[var28][var30]] = var2.method2644();
            }
            this.field2707[var28] = new class123(this.field2706[var28]);
        }
    }

    @ObfuscatedName("gk.j(II)V")
    public void method3100(int arg0) {
    }

    @ObfuscatedName("gk.c(III)[B")
    public byte[] method3121(int arg0, int arg1) {
        return this.method3099(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gk.d(II[II)[B")
    public byte[] method3099(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2698.length || this.field2698[arg0] == null || arg1 < 0 || arg1 >= this.field2698[arg0].length) {
            return null;
        }
        if (this.field2698[arg0][arg1] == null) {
            boolean var4 = this.method3112(arg0, arg2);
            if (!var4) {
                this.method3160(arg0);
                boolean var5 = this.method3112(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method1665(this.field2698[arg0][arg1], false);
        if (this.field2713) {
            this.field2698[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gk.w(III)Z")
    public boolean method3166(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2698.length || this.field2698[arg0] == null || arg1 < 0 || arg1 >= this.field2698[arg0].length) {
            return false;
        } else if (this.field2698[arg0][arg1] != null) {
            return true;
        } else if (this.field2708[arg0] == null) {
            this.method3160(arg0);
            return this.field2708[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gk.u(II)Z")
    public boolean method3101(int arg0) {
        if (this.field2708[arg0] == null) {
            this.method3160(arg0);
            return this.field2708[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gk.y(B)Z")
    public boolean method3102() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2699.length; var2++) {
            int var3 = this.field2699[var2];
            if (this.field2708[var3] == null) {
                this.method3160(var3);
                if (this.field2708[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gk.e(II)[B")
    public byte[] method3103(int arg0) {
        if (this.field2698.length == 1) {
            return this.method3121(0, arg0);
        } else if (this.field2698[arg0].length == 1) {
            return this.method3121(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gk.q(III)[B")
    public byte[] method3104(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2698.length || this.field2698[arg0] == null || arg1 < 0 || arg1 >= this.field2698[arg0].length) {
            return null;
        }
        if (this.field2698[arg0][arg1] == null) {
            boolean var3 = this.method3112(arg0, (int[]) null);
            if (!var3) {
                this.method3160(arg0);
                boolean var4 = this.method3112(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method1665(this.field2698[arg0][arg1], false);
    }

    @ObfuscatedName("gk.v(II)[B")
    public byte[] method3143(int arg0) {
        if (this.field2698.length == 1) {
            return this.method3104(0, arg0);
        } else if (this.field2698[arg0].length == 1) {
            return this.method3104(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gk.l(II)V")
    public void method3160(int arg0) {
    }

    @ObfuscatedName("gk.s(II)[I")
    public int[] method3105(int arg0) {
        return this.field2703[arg0];
    }

    @ObfuscatedName("gk.r(II)I")
    public int method3108(int arg0) {
        return this.field2698[arg0].length;
    }

    @ObfuscatedName("gk.m(B)I")
    public int method3109() {
        return this.field2698.length;
    }

    @ObfuscatedName("gk.i(II)V")
    public void method3110(int arg0) {
        for (int var2 = 0; var2 < this.field2698[arg0].length; var2++) {
            this.field2698[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gk.f(I)V")
    public void method3132() {
        for (int var1 = 0; var1 < this.field2698.length; var1++) {
            if (this.field2698[var1] != null) {
                for (int var2 = 0; var2 < this.field2698[var1].length; var2++) {
                    this.field2698[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gk.b(I[II)Z")
    public boolean method3112(int arg0, int[] arg1) {
        if (this.field2708[arg0] == null) {
            return false;
        }
        int var3 = this.field2704[arg0];
        int[] var4 = this.field2703[arg0];
        Object[] var5 = this.field2698[arg0];
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
            var8 = class157.method1665(this.field2708[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2828(arg1, 5, var9.field2091.length);
        } else {
            var8 = class157.method1665(this.field2708[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method94(var8);
        } catch (RuntimeException var27) {
            throw class102.method9(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class154.method795(var8, var8.length) + "," + class154.method795(var8, var8.length - 2) + "," + this.field2702[arg0] + "," + this.field2712);
        }
        if (this.field2705) {
            this.field2708[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class154 var15 = new class154(var10);
            int[] var16 = new int[var3];
            var15.field2086 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2644();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field2086 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2644();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2713) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class157.method800(var20[var26], false);
                }
            }
        } else if (this.field2713) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method800(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gk.t(Ljava/lang/String;I)I")
    public int method3113(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2701.method2209(class208.method1667(var2));
    }

    @ObfuscatedName("gk.z(ILjava/lang/String;I)I")
    public int method3114(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2707[arg0].method2209(class208.method1667(var3));
    }

    @ObfuscatedName("gk.p(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3115(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2701.method2209(class208.method1667(var3));
        int var6 = this.field2707[var5].method2209(class208.method1667(var4));
        return this.method3121(var5, var6);
    }

    @ObfuscatedName("gk.n(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3116(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2701.method2209(class208.method1667(var3));
        int var6 = this.field2707[var5].method2209(class208.method1667(var4));
        return this.method3166(var5, var6);
    }

    @ObfuscatedName("gk.a(Ljava/lang/String;B)Z")
    public boolean method3117(String arg0) {
        int var2 = this.method3113("");
        return var2 == -1 ? this.method3116(arg0, "") : this.method3116("", arg0);
    }

    @ObfuscatedName("gk.o(Ljava/lang/String;I)V")
    public void method3095(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2701.method2209(class208.method1667(var2));
        if (var3 >= 0) {
            this.method3100(var3);
        }
    }

    @ObfuscatedName("k.an([BB)[B")
    public static final byte[] method94(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2701();
        int var3 = var1.method2644();
        if (var3 < 0 || !(field2709 == 0 || var3 <= field2709)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2650(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2644();
            if (var5 < 0 || field2709 != 0 && var5 > field2709) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2576(var6, var5, arg0, var3, 9);
            } else {
                field2710.method2575(var1, var6);
            }
            return var6;
        }
    }
}
