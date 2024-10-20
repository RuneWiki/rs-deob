package deob;

@ObfuscatedName("fq")
public abstract class class167 {

    @ObfuscatedName("fq.o")
    public int field2676;

    @ObfuscatedName("fq.e")
    public int[] field2681;

    @ObfuscatedName("fq.u")
    public int[] field2680;

    @ObfuscatedName("fq.b")
    public class192 field2675;

    @ObfuscatedName("fq.p")
    public int[] field2685;

    @ObfuscatedName("fq.s")
    public int[] field2677;

    @ObfuscatedName("fq.y")
    public int[] field2674;

    @ObfuscatedName("fq.t")
    public int[][] field2679;

    @ObfuscatedName("fq.w")
    public int[][] field2673;

    @ObfuscatedName("fq.h")
    public class192[] field2688;

    @ObfuscatedName("fq.d")
    public Object[] field2682;

    @ObfuscatedName("fq.l")
    public Object[][] field2683;

    @ObfuscatedName("fq.n")
    public static class116 field2684 = new class116();

    @ObfuscatedName("fq.q")
    public int field2687;

    @ObfuscatedName("fq.f")
    public boolean field2686;

    @ObfuscatedName("fq.v")
    public boolean field2678;

    @ObfuscatedName("fq.a")
    public static int field2672 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2686 = arg0;
        this.field2678 = arg1;
    }

    @ObfuscatedName("fq.o([BB)V")
    public void method3055(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class119.field1980[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2687 = var5;
        class119 var8 = new class119(method717(arg0));
        int var9 = var8.method2427();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2342();
        }
        int var10 = var8.method2427();
        if (var9 >= 7) {
            this.field2676 = var8.method2426();
        } else {
            this.field2676 = var8.method2339();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2681 = new int[this.field2676];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2676; var13++) {
                this.field2681[var13] = var11 += var8.method2426();
                if (this.field2681[var13] > var12) {
                    var12 = this.field2681[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2676; var14++) {
                this.field2681[var14] = var11 += var8.method2339();
                if (this.field2681[var14] > var12) {
                    var12 = this.field2681[var14];
                }
            }
        }
        this.field2685 = new int[var12 + 1];
        this.field2677 = new int[var12 + 1];
        this.field2674 = new int[var12 + 1];
        this.field2679 = new int[var12 + 1][];
        this.field2682 = new Object[var12 + 1];
        this.field2683 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2680 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2676; var15++) {
                this.field2680[this.field2681[var15]] = var8.method2342();
            }
            this.field2675 = new class192(this.field2680);
        }
        for (int var16 = 0; var16 < this.field2676; var16++) {
            this.field2685[this.field2681[var16]] = var8.method2342();
        }
        for (int var17 = 0; var17 < this.field2676; var17++) {
            this.field2677[this.field2681[var17]] = var8.method2342();
        }
        for (int var18 = 0; var18 < this.field2676; var18++) {
            this.field2674[this.field2681[var18]] = var8.method2339();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2676; var19++) {
                int var20 = this.field2681[var19];
                int var21 = this.field2674[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2679[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2679[var20][var24] = var22 += var8.method2426();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2683[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2676; var26++) {
                int var27 = this.field2681[var26];
                int var28 = this.field2674[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2679[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2679[var27][var31] = var29 += var8.method2339();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2683[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2673 = new int[var12 + 1][];
        this.field2688 = new class192[var12 + 1];
        for (int var33 = 0; var33 < this.field2676; var33++) {
            int var34 = this.field2681[var33];
            int var35 = this.field2674[var34];
            this.field2673[var34] = new int[this.field2683[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2673[var34][this.field2679[var34][var36]] = var8.method2342();
            }
            this.field2688[var34] = new class192(this.field2673[var34]);
        }
    }

    @ObfuscatedName("fq.e(II)V")
    public void method3091(int arg0) {
    }

    @ObfuscatedName("fq.u(III)[B")
    public byte[] method3057(int arg0, int arg1) {
        return this.method3058(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fq.b(II[II)[B")
    public byte[] method3058(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2683.length || this.field2683[arg0] == null || arg1 < 0 || arg1 >= this.field2683[arg0].length) {
            return null;
        }
        if (this.field2683[arg0][arg1] == null) {
            boolean var4 = this.method3071(arg0, arg2);
            if (!var4) {
                this.method3080(arg0);
                boolean var5 = this.method3071(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2252(this.field2683[arg0][arg1], false);
        if (this.field2678) {
            this.field2683[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fq.p(III)Z")
    public boolean method3122(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2683.length || this.field2683[arg0] == null || arg1 < 0 || arg1 >= this.field2683[arg0].length) {
            return false;
        } else if (this.field2683[arg0][arg1] != null) {
            return true;
        } else if (this.field2682[arg0] == null) {
            this.method3080(arg0);
            return this.field2682[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fq.s(II)Z")
    public boolean method3060(int arg0) {
        if (this.field2682[arg0] == null) {
            this.method3080(arg0);
            return this.field2682[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fq.y(I)Z")
    public boolean method3098() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            int var3 = this.field2681[var2];
            if (this.field2682[var3] == null) {
                this.method3080(var3);
                if (this.field2682[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fq.t(IB)[B")
    public byte[] method3062(int arg0) {
        if (this.field2683.length == 1) {
            return this.method3057(0, arg0);
        } else if (this.field2683[arg0].length == 1) {
            return this.method3057(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fq.w(III)[B")
    public byte[] method3063(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2683.length || this.field2683[arg0] == null || arg1 < 0 || arg1 >= this.field2683[arg0].length) {
            return null;
        }
        if (this.field2683[arg0][arg1] == null) {
            boolean var3 = this.method3071(arg0, (int[]) null);
            if (!var3) {
                this.method3080(arg0);
                boolean var4 = this.method3071(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2252(this.field2683[arg0][arg1], false);
    }

    @ObfuscatedName("fq.h(II)[B")
    public byte[] method3064(int arg0) {
        if (this.field2683.length == 1) {
            return this.method3063(0, arg0);
        } else if (this.field2683[arg0].length == 1) {
            return this.method3063(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fq.d(II)V")
    public void method3080(int arg0) {
    }

    @ObfuscatedName("fq.l(II)[I")
    public int[] method3066(int arg0) {
        return this.field2679[arg0];
    }

    @ObfuscatedName("fq.n(II)I")
    public int method3067(int arg0) {
        return this.field2683[arg0].length;
    }

    @ObfuscatedName("fq.q(B)I")
    public int method3068() {
        return this.field2683.length;
    }

    @ObfuscatedName("fq.f(II)V")
    public void method3056(int arg0) {
        for (int var2 = 0; var2 < this.field2683[arg0].length; var2++) {
            this.field2683[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fq.v(I)V")
    public void method3070() {
        for (int var1 = 0; var1 < this.field2683.length; var1++) {
            if (this.field2683[var1] != null) {
                for (int var2 = 0; var2 < this.field2683[var1].length; var2++) {
                    this.field2683[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fq.a(I[IB)Z")
    public boolean method3071(int arg0, int[] arg1) {
        if (this.field2682[arg0] == null) {
            return false;
        }
        int var3 = this.field2674[arg0];
        int[] var4 = this.field2679[arg0];
        Object[] var5 = this.field2683[arg0];
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
            var8 = class125.method2252(this.field2682[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2356(arg1, 5, var9.field1977.length);
        } else {
            var8 = class125.method2252(this.field2682[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method717(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class119.field1980[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class119.field1980[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class148.method2269(var43, var21 + var25 + "," + this.field2685[arg0] + "," + this.field2687);
        }
        if (this.field2686) {
            this.field2682[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class119 var31 = new class119(var10);
            int[] var32 = new int[var3];
            var31.field1974 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2342();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1974 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2342();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2678) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class125.method929(var36[var42], false);
                }
            }
        } else if (this.field2678) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method929(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fq.k(Ljava/lang/String;I)I")
    public int method3072(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2675.method3504(class163.method2938(var2));
    }

    @ObfuscatedName("fq.r(ILjava/lang/String;I)I")
    public int method3073(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2688[arg0].method3504(class163.method2938(var3));
    }

    @ObfuscatedName("fq.i(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method3074(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2675.method3504(class163.method2938(var3));
        int var6 = this.field2688[var5].method3504(class163.method2938(var4));
        return this.method3057(var5, var6);
    }

    @ObfuscatedName("fq.j(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3075(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2675.method3504(class163.method2938(var3));
        int var6 = this.field2688[var5].method3504(class163.method2938(var4));
        return this.method3122(var5, var6);
    }

    @ObfuscatedName("fq.z(Ljava/lang/String;I)Z")
    public boolean method3076(String arg0) {
        int var2 = this.method3072("");
        return var2 == -1 ? this.method3075(arg0, "") : this.method3075("", arg0);
    }

    @ObfuscatedName("fq.m(Ljava/lang/String;I)V")
    public void method3077(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2675.method3504(class163.method2938(var2));
        if (var3 >= 0) {
            this.method3091(var3);
        }
    }

    @ObfuscatedName("as.g([BB)[B")
    public static final byte[] method717(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2427();
        int var3 = var1.method2342();
        if (var3 < 0 || !(field2672 == 0 || var3 <= field2672)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2348(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2342();
            if (var5 < 0 || field2672 != 0 && var5 > field2672) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2285(var6, var5, arg0, var3, 9);
            } else {
                field2684.method2279(var1, var6);
            }
            return var6;
        }
    }
}
