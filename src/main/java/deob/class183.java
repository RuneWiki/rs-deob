package deob;

@ObfuscatedName("gt")
public abstract class class183 {

    @ObfuscatedName("gt.u")
    public int field2685;

    @ObfuscatedName("gt.x")
    public int[] field2684;

    @ObfuscatedName("gt.i")
    public int[] field2696;

    @ObfuscatedName("gt.a")
    public class123 field2686;

    @ObfuscatedName("gt.f")
    public int[] field2687;

    @ObfuscatedName("gt.c")
    public int[] field2688;

    @ObfuscatedName("gt.d")
    public int[] field2689;

    @ObfuscatedName("gt.l")
    public int[][] field2690;

    @ObfuscatedName("gt.g")
    public int[][] field2691;

    @ObfuscatedName("gt.z")
    public class123[] field2692;

    @ObfuscatedName("gt.t")
    public Object[] field2700;

    @ObfuscatedName("gt.m")
    public Object[][] field2694;

    @ObfuscatedName("gt.q")
    public static class147 field2695 = new class147();

    @ObfuscatedName("gt.e")
    public int field2699;

    @ObfuscatedName("gt.v")
    public boolean field2703;

    @ObfuscatedName("gt.j")
    public boolean field2698;

    @ObfuscatedName("gt.p")
    public static int field2697 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2703 = arg0;
        this.field2698 = arg1;
    }

    @ObfuscatedName("gt.u([BB)V")
    public void method3059(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class154.field2074[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2699 = var5;
        class154 var8 = new class154(method114(arg0));
        int var9 = var8.method2708();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2593();
        }
        int var10 = var8.method2708();
        if (var9 >= 7) {
            this.field2685 = var8.method2571();
        } else {
            this.field2685 = var8.method2581();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2684 = new int[this.field2685];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2685; var13++) {
                this.field2684[var13] = var11 += var8.method2571();
                if (this.field2684[var13] > var12) {
                    var12 = this.field2684[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2685; var14++) {
                this.field2684[var14] = var11 += var8.method2581();
                if (this.field2684[var14] > var12) {
                    var12 = this.field2684[var14];
                }
            }
        }
        this.field2687 = new int[var12 + 1];
        this.field2688 = new int[var12 + 1];
        this.field2689 = new int[var12 + 1];
        this.field2690 = new int[var12 + 1][];
        this.field2700 = new Object[var12 + 1];
        this.field2694 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2696 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2685; var15++) {
                this.field2696[this.field2684[var15]] = var8.method2593();
            }
            this.field2686 = new class123(this.field2696);
        }
        for (int var16 = 0; var16 < this.field2685; var16++) {
            this.field2687[this.field2684[var16]] = var8.method2593();
        }
        for (int var17 = 0; var17 < this.field2685; var17++) {
            this.field2688[this.field2684[var17]] = var8.method2593();
        }
        for (int var18 = 0; var18 < this.field2685; var18++) {
            this.field2689[this.field2684[var18]] = var8.method2581();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2685; var19++) {
                int var20 = this.field2684[var19];
                int var21 = this.field2689[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2690[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2690[var20][var24] = var22 += var8.method2571();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2694[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2685; var26++) {
                int var27 = this.field2684[var26];
                int var28 = this.field2689[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2690[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2690[var27][var31] = var29 += var8.method2581();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2694[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2691 = new int[var12 + 1][];
        this.field2692 = new class123[var12 + 1];
        for (int var33 = 0; var33 < this.field2685; var33++) {
            int var34 = this.field2684[var33];
            int var35 = this.field2689[var34];
            this.field2691[var34] = new int[this.field2694[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2691[var34][this.field2690[var34][var36]] = var8.method2593();
            }
            this.field2692[var34] = new class123(this.field2691[var34]);
        }
    }

    @ObfuscatedName("gt.x(II)V")
    public void method3060(int arg0) {
    }

    @ObfuscatedName("gt.i(III)[B")
    public byte[] method3071(int arg0, int arg1) {
        return this.method3131(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gt.a(II[II)[B")
    public byte[] method3131(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return null;
        }
        if (this.field2694[arg0][arg1] == null) {
            boolean var4 = this.method3075(arg0, arg2);
            if (!var4) {
                this.method3069(arg0);
                boolean var5 = this.method3075(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method2312(this.field2694[arg0][arg1], false);
        if (this.field2698) {
            this.field2694[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gt.c(III)Z")
    public boolean method3063(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return false;
        } else if (this.field2694[arg0][arg1] != null) {
            return true;
        } else if (this.field2700[arg0] == null) {
            this.method3069(arg0);
            return this.field2700[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gt.g(II)Z")
    public boolean method3089(int arg0) {
        if (this.field2700[arg0] == null) {
            this.method3069(arg0);
            return this.field2700[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gt.z(I)Z")
    public boolean method3081() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2684.length; var2++) {
            int var3 = this.field2684[var2];
            if (this.field2700[var3] == null) {
                this.method3069(var3);
                if (this.field2700[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gt.t(II)[B")
    public byte[] method3066(int arg0) {
        if (this.field2694.length == 1) {
            return this.method3071(0, arg0);
        } else if (this.field2694[arg0].length == 1) {
            return this.method3071(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gt.m(III)[B")
    public byte[] method3067(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return null;
        }
        if (this.field2694[arg0][arg1] == null) {
            boolean var3 = this.method3075(arg0, (int[]) null);
            if (!var3) {
                this.method3069(arg0);
                boolean var4 = this.method3075(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method2312(this.field2694[arg0][arg1], false);
    }

    @ObfuscatedName("gt.q(II)[B")
    public byte[] method3110(int arg0) {
        if (this.field2694.length == 1) {
            return this.method3067(0, arg0);
        } else if (this.field2694[arg0].length == 1) {
            return this.method3067(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gt.e(II)V")
    public void method3069(int arg0) {
    }

    @ObfuscatedName("gt.v(IB)[I")
    public int[] method3113(int arg0) {
        return this.field2690[arg0];
    }

    @ObfuscatedName("gt.j(IS)I")
    public int method3122(int arg0) {
        return this.field2694[arg0].length;
    }

    @ObfuscatedName("gt.p(I)I")
    public int method3090() {
        return this.field2694.length;
    }

    @ObfuscatedName("gt.k(II)V")
    public void method3073(int arg0) {
        for (int var2 = 0; var2 < this.field2694[arg0].length; var2++) {
            this.field2694[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gt.r(I)V")
    public void method3074() {
        for (int var1 = 0; var1 < this.field2694.length; var1++) {
            if (this.field2694[var1] != null) {
                for (int var2 = 0; var2 < this.field2694[var1].length; var2++) {
                    this.field2694[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gt.y(I[IS)Z")
    public boolean method3075(int arg0, int[] arg1) {
        if (this.field2700[arg0] == null) {
            return false;
        }
        int var3 = this.field2689[arg0];
        int[] var4 = this.field2690[arg0];
        Object[] var5 = this.field2694[arg0];
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
            var8 = class157.method2312(this.field2700[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2608(arg1, 5, var9.field2078.length);
        } else {
            var8 = class157.method2312(this.field2700[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method114(var8);
        } catch (RuntimeException var38) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class154.method1771(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                var18 = var18 >>> 8 ^ class154.field2074[(var18 ^ var8[var19]) & 0xFF];
            }
            int var20 = ~var18;
            throw class102.method1920(var38, var16 + var20 + "," + this.field2687[arg0] + "," + this.field2699);
        }
        if (this.field2703) {
            this.field2700[arg0] = null;
        }
        if (var3 > 1) {
            int var23 = var10.length;
            int var39 = var23 - 1;
            int var24 = var10[var39] & 0xFF;
            int var25 = var39 - var3 * var24 * 4;
            class154 var26 = new class154(var10);
            int[] var27 = new int[var3];
            var26.field2073 = var25;
            for (int var28 = 0; var28 < var24; var28++) {
                int var29 = 0;
                for (int var30 = 0; var30 < var3; var30++) {
                    var29 += var26.method2593();
                    var27[var30] += var29;
                }
            }
            byte[][] var31 = new byte[var3][];
            for (int var32 = 0; var32 < var3; var32++) {
                var31[var32] = new byte[var27[var32]];
                var27[var32] = 0;
            }
            var26.field2073 = var25;
            int var33 = 0;
            for (int var34 = 0; var34 < var24; var34++) {
                int var35 = 0;
                for (int var36 = 0; var36 < var3; var36++) {
                    var35 += var26.method2593();
                    System.arraycopy(var10, var33, var31[var36], var27[var36], var35);
                    var27[var36] += var35;
                    var33 += var35;
                }
            }
            for (int var37 = 0; var37 < var3; var37++) {
                if (this.field2698) {
                    var5[var4[var37]] = var31[var37];
                } else {
                    var5[var4[var37]] = class157.method2076(var31[var37], false);
                }
            }
        } else if (this.field2698) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method2076(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gt.h(Ljava/lang/String;I)I")
    public int method3076(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2686.method2166(class208.method3050(var2));
    }

    @ObfuscatedName("gt.s(ILjava/lang/String;B)I")
    public int method3077(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2692[arg0].method2166(class208.method3050(var3));
    }

    @ObfuscatedName("gt.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3078(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2686.method2166(class208.method3050(var3));
        int var6 = this.field2692[var5].method2166(class208.method3050(var4));
        return this.method3071(var5, var6);
    }

    @ObfuscatedName("gt.n(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3079(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2686.method2166(class208.method3050(var3));
        int var6 = this.field2692[var5].method2166(class208.method3050(var4));
        return this.method3063(var5, var6);
    }

    @ObfuscatedName("gt.o(Ljava/lang/String;B)Z")
    public boolean method3062(String arg0) {
        int var2 = this.method3076("");
        return var2 == -1 ? this.method3079(arg0, "") : this.method3079("", arg0);
    }

    @ObfuscatedName("gt.b(Ljava/lang/String;I)V")
    public void method3080(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2686.method2166(class208.method3050(var2));
        if (var3 >= 0) {
            this.method3060(var3);
        }
    }

    @ObfuscatedName("g.aj([BB)[B")
    public static final byte[] method114(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2708();
        int var3 = var1.method2593();
        if (var3 < 0 || !(field2697 == 0 || var3 <= field2697)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2787(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2593();
            if (var5 < 0 || field2697 != 0 && var5 > field2697) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2533(var6, var5, arg0, var3, 9);
            } else {
                field2695.method2526(var1, var6);
            }
            return var6;
        }
    }
}
