package deob;

@ObfuscatedName("fh")
public abstract class class167 {

    @ObfuscatedName("fh.v")
    public int field2691;

    @ObfuscatedName("fh.f")
    public int[] field2675;

    @ObfuscatedName("fh.i")
    public int[] field2676;

    @ObfuscatedName("fh.d")
    public class192 field2679;

    @ObfuscatedName("fh.o")
    public int[] field2678;

    @ObfuscatedName("fh.c")
    public int[] field2689;

    @ObfuscatedName("fh.p")
    public int[] field2688;

    @ObfuscatedName("fh.j")
    public int[][] field2681;

    @ObfuscatedName("fh.a")
    public int[][] field2682;

    @ObfuscatedName("fh.y")
    public class192[] field2677;

    @ObfuscatedName("fh.h")
    public Object[] field2684;

    @ObfuscatedName("fh.z")
    public Object[][] field2685;

    @ObfuscatedName("fh.w")
    public static class116 field2686 = new class116();

    @ObfuscatedName("fh.l")
    public int field2680;

    @ObfuscatedName("fh.q")
    public boolean field2683;

    @ObfuscatedName("fh.x")
    public boolean field2687;

    @ObfuscatedName("fh.s")
    public static int field2690 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2683 = arg0;
        this.field2687 = arg1;
    }

    @ObfuscatedName("fh.v([BI)V")
    public void method3027(byte[] arg0) {
        this.field2680 = class119.method1504(arg0, arg0.length);
        class119 var2 = new class119(method556(arg0));
        int var3 = var2.method2400();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2354();
        }
        int var4 = var2.method2400();
        if (var3 >= 7) {
            this.field2691 = var2.method2363();
        } else {
            this.field2691 = var2.method2334();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2675 = new int[this.field2691];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2691; var7++) {
                this.field2675[var7] = var5 += var2.method2363();
                if (this.field2675[var7] > var6) {
                    var6 = this.field2675[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2691; var8++) {
                this.field2675[var8] = var5 += var2.method2334();
                if (this.field2675[var8] > var6) {
                    var6 = this.field2675[var8];
                }
            }
        }
        this.field2678 = new int[var6 + 1];
        this.field2689 = new int[var6 + 1];
        this.field2688 = new int[var6 + 1];
        this.field2681 = new int[var6 + 1][];
        this.field2684 = new Object[var6 + 1];
        this.field2685 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2676 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2691; var9++) {
                this.field2676[this.field2675[var9]] = var2.method2354();
            }
            this.field2679 = new class192(this.field2676);
        }
        for (int var10 = 0; var10 < this.field2691; var10++) {
            this.field2678[this.field2675[var10]] = var2.method2354();
        }
        for (int var11 = 0; var11 < this.field2691; var11++) {
            this.field2689[this.field2675[var11]] = var2.method2354();
        }
        for (int var12 = 0; var12 < this.field2691; var12++) {
            this.field2688[this.field2675[var12]] = var2.method2334();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2691; var13++) {
                int var14 = this.field2675[var13];
                int var15 = this.field2688[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2681[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2681[var14][var18] = var16 += var2.method2363();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2685[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2691; var20++) {
                int var21 = this.field2675[var20];
                int var22 = this.field2688[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2681[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2681[var21][var25] = var23 += var2.method2334();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2685[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2682 = new int[var6 + 1][];
        this.field2677 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2691; var27++) {
            int var28 = this.field2675[var27];
            int var29 = this.field2688[var28];
            this.field2682[var28] = new int[this.field2685[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2682[var28][this.field2681[var28][var30]] = var2.method2354();
            }
            this.field2677[var28] = new class192(this.field2682[var28]);
        }
    }

    @ObfuscatedName("fh.f(II)V")
    public void method3024(int arg0) {
    }

    @ObfuscatedName("fh.i(III)[B")
    public byte[] method3082(int arg0, int arg1) {
        return this.method3065(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fh.d(II[II)[B")
    public byte[] method3065(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return null;
        }
        if (this.field2685[arg0][arg1] == null) {
            boolean var4 = this.method3039(arg0, arg2);
            if (!var4) {
                this.method3033(arg0);
                boolean var5 = this.method3039(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method618(this.field2685[arg0][arg1], false);
        if (this.field2687) {
            this.field2685[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fh.o(III)Z")
    public boolean method3070(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return false;
        } else if (this.field2685[arg0][arg1] != null) {
            return true;
        } else if (this.field2684[arg0] == null) {
            this.method3033(arg0);
            return this.field2684[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fh.c(IB)Z")
    public boolean method3028(int arg0) {
        if (this.field2684[arg0] == null) {
            this.method3033(arg0);
            return this.field2684[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fh.p(I)Z")
    public boolean method3029() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2675.length; var2++) {
            int var3 = this.field2675[var2];
            if (this.field2684[var3] == null) {
                this.method3033(var3);
                if (this.field2684[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fh.j(IB)[B")
    public byte[] method3030(int arg0) {
        if (this.field2685.length == 1) {
            return this.method3082(0, arg0);
        } else if (this.field2685[arg0].length == 1) {
            return this.method3082(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fh.a(IIB)[B")
    public byte[] method3031(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return null;
        }
        if (this.field2685[arg0][arg1] == null) {
            boolean var3 = this.method3039(arg0, (int[]) null);
            if (!var3) {
                this.method3033(arg0);
                boolean var4 = this.method3039(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method618(this.field2685[arg0][arg1], false);
    }

    @ObfuscatedName("fh.y(IB)[B")
    public byte[] method3032(int arg0) {
        if (this.field2685.length == 1) {
            return this.method3031(0, arg0);
        } else if (this.field2685[arg0].length == 1) {
            return this.method3031(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fh.h(IB)V")
    public void method3033(int arg0) {
    }

    @ObfuscatedName("fh.z(IB)[I")
    public int[] method3034(int arg0) {
        return this.field2681[arg0];
    }

    @ObfuscatedName("fh.w(IB)I")
    public int method3093(int arg0) {
        return this.field2685[arg0].length;
    }

    @ObfuscatedName("fh.l(I)I")
    public int method3036() {
        return this.field2685.length;
    }

    @ObfuscatedName("fh.q(II)V")
    public void method3059(int arg0) {
        for (int var2 = 0; var2 < this.field2685[arg0].length; var2++) {
            this.field2685[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fh.x(I)V")
    public void method3038() {
        for (int var1 = 0; var1 < this.field2685.length; var1++) {
            if (this.field2685[var1] != null) {
                for (int var2 = 0; var2 < this.field2685[var1].length; var2++) {
                    this.field2685[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fh.s(I[II)Z")
    public boolean method3039(int arg0, int[] arg1) {
        if (this.field2684[arg0] == null) {
            return false;
        }
        int var3 = this.field2688[arg0];
        int[] var4 = this.field2681[arg0];
        Object[] var5 = this.field2685[arg0];
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
            var8 = class125.method618(this.field2684[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2368(arg1, 5, var9.field1988.length);
        } else {
            var8 = class125.method618(this.field2684[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method556(var8);
        } catch (RuntimeException var27) {
            throw class148.method2667(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method1504(var8, var8.length) + "," + class119.method1504(var8, var8.length - 2) + "," + this.field2678[arg0] + "," + this.field2680);
        }
        if (this.field2683) {
            this.field2684[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class119 var15 = new class119(var10);
            int[] var16 = new int[var3];
            var15.field1984 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2354();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1984 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2354();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2687) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method724(var20[var26], false);
                }
            }
        } else if (this.field2687) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method724(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fh.n(Ljava/lang/String;I)I")
    public int method3040(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2679.method3488(class163.method2998(var2));
    }

    @ObfuscatedName("fh.u(ILjava/lang/String;S)I")
    public int method3041(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2677[arg0].method3488(class163.method2998(var3));
    }

    @ObfuscatedName("fh.m(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3046(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2679.method3488(class163.method2998(var3));
        int var6 = this.field2677[var5].method3488(class163.method2998(var4));
        return this.method3082(var5, var6);
    }

    @ObfuscatedName("fh.e(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3053(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2679.method3488(class163.method2998(var3));
        int var6 = this.field2677[var5].method3488(class163.method2998(var4));
        return this.method3070(var5, var6);
    }

    @ObfuscatedName("fh.k(Ljava/lang/String;B)Z")
    public boolean method3044(String arg0) {
        int var2 = this.method3040("");
        return var2 == -1 ? this.method3053(arg0, "") : this.method3053("", arg0);
    }

    @ObfuscatedName("fh.r(Ljava/lang/String;I)V")
    public void method3045(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2679.method3488(class163.method2998(var2));
        if (var3 >= 0) {
            this.method3024(var3);
        }
    }

    @ObfuscatedName("k.b([BB)[B")
    public static final byte[] method556(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2400();
        int var3 = var1.method2354();
        if (var3 < 0 || !(field2690 == 0 || var3 <= field2690)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2360(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2354();
            if (var5 < 0 || field2690 != 0 && var5 > field2690) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2309(var6, var5, arg0, var3, 9);
            } else {
                field2686.method2295(var1, var6);
            }
            return var6;
        }
    }
}
