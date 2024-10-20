package deob;

@ObfuscatedName("fc")
public abstract class class167 {

    @ObfuscatedName("fc.g")
    public int field2673;

    @ObfuscatedName("fc.b")
    public int[] field2657;

    @ObfuscatedName("fc.w")
    public int[] field2660;

    @ObfuscatedName("fc.d")
    public class192 field2664;

    @ObfuscatedName("fc.z")
    public int[] field2659;

    @ObfuscatedName("fc.l")
    public int[] field2661;

    @ObfuscatedName("fc.m")
    public int[] field2662;

    @ObfuscatedName("fc.p")
    public int[][] field2663;

    @ObfuscatedName("fc.u")
    public int[][] field2656;

    @ObfuscatedName("fc.c")
    public class192[] field2665;

    @ObfuscatedName("fc.v")
    public Object[] field2666;

    @ObfuscatedName("fc.o")
    public Object[][] field2667;

    @ObfuscatedName("fc.n")
    public static class116 field2668 = new class116();

    @ObfuscatedName("fc.k")
    public int field2658;

    @ObfuscatedName("fc.f")
    public boolean field2669;

    @ObfuscatedName("fc.x")
    public boolean field2671;

    @ObfuscatedName("fc.j")
    public static int field2672 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2669 = arg0;
        this.field2671 = arg1;
    }

    @ObfuscatedName("fc.g([BB)V")
    public void method3077(byte[] arg0) {
        this.field2658 = class119.method2071(arg0, arg0.length);
        class119 var2 = new class119(method1975(arg0));
        int var3 = var2.method2362();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2367();
        }
        int var4 = var2.method2362();
        if (var3 >= 7) {
            this.field2673 = var2.method2515();
        } else {
            this.field2673 = var2.method2376();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2657 = new int[this.field2673];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2673; var7++) {
                this.field2657[var7] = var5 += var2.method2515();
                if (this.field2657[var7] > var6) {
                    var6 = this.field2657[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2673; var8++) {
                this.field2657[var8] = var5 += var2.method2376();
                if (this.field2657[var8] > var6) {
                    var6 = this.field2657[var8];
                }
            }
        }
        this.field2659 = new int[var6 + 1];
        this.field2661 = new int[var6 + 1];
        this.field2662 = new int[var6 + 1];
        this.field2663 = new int[var6 + 1][];
        this.field2666 = new Object[var6 + 1];
        this.field2667 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2660 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2673; var9++) {
                this.field2660[this.field2657[var9]] = var2.method2367();
            }
            this.field2664 = new class192(this.field2660);
        }
        for (int var10 = 0; var10 < this.field2673; var10++) {
            this.field2659[this.field2657[var10]] = var2.method2367();
        }
        for (int var11 = 0; var11 < this.field2673; var11++) {
            this.field2661[this.field2657[var11]] = var2.method2367();
        }
        for (int var12 = 0; var12 < this.field2673; var12++) {
            this.field2662[this.field2657[var12]] = var2.method2376();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2673; var13++) {
                int var14 = this.field2657[var13];
                int var15 = this.field2662[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2663[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2663[var14][var18] = var16 += var2.method2515();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2667[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2673; var20++) {
                int var21 = this.field2657[var20];
                int var22 = this.field2662[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2663[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2663[var21][var25] = var23 += var2.method2376();
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
        this.field2656 = new int[var6 + 1][];
        this.field2665 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2673; var27++) {
            int var28 = this.field2657[var27];
            int var29 = this.field2662[var28];
            this.field2656[var28] = new int[this.field2667[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2656[var28][this.field2663[var28][var30]] = var2.method2367();
            }
            this.field2665[var28] = new class192(this.field2656[var28]);
        }
    }

    @ObfuscatedName("fc.b(IS)V")
    public void method3093(int arg0) {
    }

    @ObfuscatedName("fc.w(III)[B")
    public byte[] method3112(int arg0, int arg1) {
        return this.method3118(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fc.d(II[IB)[B")
    public byte[] method3118(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return null;
        }
        if (this.field2667[arg0][arg1] == null) {
            boolean var4 = this.method3092(arg0, arg2);
            if (!var4) {
                this.method3081(arg0);
                boolean var5 = this.method3092(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method112(this.field2667[arg0][arg1], false);
        if (this.field2671) {
            this.field2667[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fc.z(III)Z")
    public boolean method3082(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return false;
        } else if (this.field2667[arg0][arg1] != null) {
            return true;
        } else if (this.field2666[arg0] == null) {
            this.method3081(arg0);
            return this.field2666[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fc.l(II)Z")
    public boolean method3145(int arg0) {
        if (this.field2666[arg0] == null) {
            this.method3081(arg0);
            return this.field2666[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fc.m(I)Z")
    public boolean method3143() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2657.length; var2++) {
            int var3 = this.field2657[var2];
            if (this.field2666[var3] == null) {
                this.method3081(var3);
                if (this.field2666[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fc.p(II)[B")
    public byte[] method3083(int arg0) {
        if (this.field2667.length == 1) {
            return this.method3112(0, arg0);
        } else if (this.field2667[arg0].length == 1) {
            return this.method3112(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fc.u(III)[B")
    public byte[] method3084(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2667.length || this.field2667[arg0] == null || arg1 < 0 || arg1 >= this.field2667[arg0].length) {
            return null;
        }
        if (this.field2667[arg0][arg1] == null) {
            boolean var3 = this.method3092(arg0, (int[]) null);
            if (!var3) {
                this.method3081(arg0);
                boolean var4 = this.method3092(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method112(this.field2667[arg0][arg1], false);
    }

    @ObfuscatedName("fc.c(II)[B")
    public byte[] method3110(int arg0) {
        if (this.field2667.length == 1) {
            return this.method3084(0, arg0);
        } else if (this.field2667[arg0].length == 1) {
            return this.method3084(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fc.v(II)V")
    public void method3081(int arg0) {
    }

    @ObfuscatedName("fc.o(IB)[I")
    public int[] method3087(int arg0) {
        return this.field2663[arg0];
    }

    @ObfuscatedName("fc.n(II)I")
    public int method3088(int arg0) {
        return this.field2667[arg0].length;
    }

    @ObfuscatedName("fc.k(I)I")
    public int method3089() {
        return this.field2667.length;
    }

    @ObfuscatedName("fc.f(II)V")
    public void method3121(int arg0) {
        for (int var2 = 0; var2 < this.field2667[arg0].length; var2++) {
            this.field2667[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fc.x(I)V")
    public void method3091() {
        for (int var1 = 0; var1 < this.field2667.length; var1++) {
            if (this.field2667[var1] != null) {
                for (int var2 = 0; var2 < this.field2667[var1].length; var2++) {
                    this.field2667[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fc.j(I[II)Z")
    public boolean method3092(int arg0, int[] arg1) {
        if (this.field2666[arg0] == null) {
            return false;
        }
        int var3 = this.field2662[arg0];
        int[] var4 = this.field2663[arg0];
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
            var8 = class125.method112(this.field2666[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2381(arg1, 5, var9.field1986.length);
        } else {
            var8 = class125.method112(this.field2666[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method1975(var8);
        } catch (RuntimeException var27) {
            throw class148.method46(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method2071(var8, var8.length) + "," + class119.method2071(var8, var8.length - 2) + "," + this.field2659[arg0] + "," + this.field2658);
        }
        if (this.field2669) {
            this.field2666[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class119 var15 = new class119(var10);
            int[] var16 = new int[var3];
            var15.field1977 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2367();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1977 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2367();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2671) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method2579(var20[var26], false);
                }
            }
        } else if (this.field2671) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method2579(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fc.r(Ljava/lang/String;B)I")
    public int method3079(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2664.method3526(class163.method2707(var2));
    }

    @ObfuscatedName("fc.y(ILjava/lang/String;I)I")
    public int method3094(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2665[arg0].method3526(class163.method2707(var3));
    }

    @ObfuscatedName("fc.t(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3095(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2664.method3526(class163.method2707(var3));
        int var6 = this.field2665[var5].method3526(class163.method2707(var4));
        return this.method3112(var5, var6);
    }

    @ObfuscatedName("fc.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3096(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2664.method3526(class163.method2707(var3));
        int var6 = this.field2665[var5].method3526(class163.method2707(var4));
        return this.method3082(var5, var6);
    }

    @ObfuscatedName("fc.s(Ljava/lang/String;I)Z")
    public boolean method3097(String arg0) {
        int var2 = this.method3079("");
        return var2 == -1 ? this.method3096(arg0, "") : this.method3096("", arg0);
    }

    @ObfuscatedName("fc.e(Ljava/lang/String;I)V")
    public void method3151(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2664.method3526(class163.method2707(var2));
        if (var3 >= 0) {
            this.method3093(var3);
        }
    }

    @ObfuscatedName("cw.q([BS)[B")
    public static final byte[] method1975(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2362();
        int var3 = var1.method2367();
        if (var3 < 0 || !(field2672 == 0 || var3 <= field2672)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2477(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2367();
            if (var5 < 0 || field2672 != 0 && var5 > field2672) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2313(var6, var5, arg0, var3, 9);
            } else {
                field2668.method2307(var1, var6);
            }
            return var6;
        }
    }
}
