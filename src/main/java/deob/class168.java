package deob;

@ObfuscatedName("fa")
public abstract class class168 {

    @ObfuscatedName("fa.s")
    public int field2689;

    @ObfuscatedName("fa.j")
    public int[] field2681;

    @ObfuscatedName("fa.p")
    public int[] field2680;

    @ObfuscatedName("fa.x")
    public class193 field2686;

    @ObfuscatedName("fa.d")
    public int[] field2685;

    @ObfuscatedName("fa.u")
    public int[] field2683;

    @ObfuscatedName("fa.o")
    public int[] field2697;

    @ObfuscatedName("fa.b")
    public int[][] field2679;

    @ObfuscatedName("fa.k")
    public int[][] field2678;

    @ObfuscatedName("fa.c")
    public class193[] field2687;

    @ObfuscatedName("fa.l")
    public Object[] field2688;

    @ObfuscatedName("fa.t")
    public Object[][] field2694;

    @ObfuscatedName("fa.i")
    public static class117 field2690 = new class117();

    @ObfuscatedName("fa.r")
    public int field2691;

    @ObfuscatedName("fa.m")
    public boolean field2692;

    @ObfuscatedName("fa.e")
    public boolean field2693;

    @ObfuscatedName("fa.h")
    public static int field2682 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2692 = arg0;
        this.field2693 = arg1;
    }

    @ObfuscatedName("fa.s([BI)V")
    public void method3054(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class120.method171(arg0, 0, var2);
        this.field2691 = var3;
        class120 var4 = new class120(method200(arg0));
        int var5 = var4.method2338();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2343();
        }
        int var6 = var4.method2338();
        if (var5 >= 7) {
            this.field2689 = var4.method2352();
        } else {
            this.field2689 = var4.method2430();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2681 = new int[this.field2689];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2689; var9++) {
                this.field2681[var9] = var7 += var4.method2352();
                if (this.field2681[var9] > var8) {
                    var8 = this.field2681[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2689; var10++) {
                this.field2681[var10] = var7 += var4.method2430();
                if (this.field2681[var10] > var8) {
                    var8 = this.field2681[var10];
                }
            }
        }
        this.field2685 = new int[var8 + 1];
        this.field2683 = new int[var8 + 1];
        this.field2697 = new int[var8 + 1];
        this.field2679 = new int[var8 + 1][];
        this.field2688 = new Object[var8 + 1];
        this.field2694 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2680 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2689; var11++) {
                this.field2680[this.field2681[var11]] = var4.method2343();
            }
            this.field2686 = new class193(this.field2680);
        }
        for (int var12 = 0; var12 < this.field2689; var12++) {
            this.field2685[this.field2681[var12]] = var4.method2343();
        }
        for (int var13 = 0; var13 < this.field2689; var13++) {
            this.field2683[this.field2681[var13]] = var4.method2343();
        }
        for (int var14 = 0; var14 < this.field2689; var14++) {
            this.field2697[this.field2681[var14]] = var4.method2430();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2689; var15++) {
                int var16 = this.field2681[var15];
                int var17 = this.field2697[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2679[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2679[var16][var20] = var18 += var4.method2352();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2694[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2689; var22++) {
                int var23 = this.field2681[var22];
                int var24 = this.field2697[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2679[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2679[var23][var27] = var25 += var4.method2430();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2694[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2678 = new int[var8 + 1][];
        this.field2687 = new class193[var8 + 1];
        for (int var29 = 0; var29 < this.field2689; var29++) {
            int var30 = this.field2681[var29];
            int var31 = this.field2697[var30];
            this.field2678[var30] = new int[this.field2694[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2678[var30][this.field2679[var30][var32]] = var4.method2343();
            }
            this.field2687[var30] = new class193(this.field2678[var30]);
        }
    }

    @ObfuscatedName("fa.j(II)V")
    public void method3023(int arg0) {
    }

    @ObfuscatedName("fa.p(III)[B")
    public byte[] method3014(int arg0, int arg1) {
        return this.method3015(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fa.x(II[IB)[B")
    public byte[] method3015(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return null;
        }
        if (this.field2694[arg0][arg1] == null) {
            boolean var4 = this.method3017(arg0, arg2);
            if (!var4) {
                this.method3031(arg0);
                boolean var5 = this.method3017(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method40(this.field2694[arg0][arg1], false);
        if (this.field2693) {
            this.field2694[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fa.d(IIB)Z")
    public boolean method3047(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return false;
        } else if (this.field2694[arg0][arg1] != null) {
            return true;
        } else if (this.field2688[arg0] == null) {
            this.method3031(arg0);
            return this.field2688[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.u(II)Z")
    public boolean method3069(int arg0) {
        if (this.field2688[arg0] == null) {
            this.method3031(arg0);
            return this.field2688[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fa.o(B)Z")
    public boolean method3013() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2681.length; var2++) {
            int var3 = this.field2681[var2];
            if (this.field2688[var3] == null) {
                this.method3031(var3);
                if (this.field2688[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fa.b(II)[B")
    public byte[] method3019(int arg0) {
        if (this.field2694.length == 1) {
            return this.method3014(0, arg0);
        } else if (this.field2694[arg0].length == 1) {
            return this.method3014(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.k(IIB)[B")
    public byte[] method3058(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2694.length || this.field2694[arg0] == null || arg1 < 0 || arg1 >= this.field2694[arg0].length) {
            return null;
        }
        if (this.field2694[arg0][arg1] == null) {
            boolean var3 = this.method3017(arg0, (int[]) null);
            if (!var3) {
                this.method3031(arg0);
                boolean var4 = this.method3017(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method40(this.field2694[arg0][arg1], false);
    }

    @ObfuscatedName("fa.c(II)[B")
    public byte[] method3065(int arg0) {
        if (this.field2694.length == 1) {
            return this.method3058(0, arg0);
        } else if (this.field2694[arg0].length == 1) {
            return this.method3058(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fa.l(IS)V")
    public void method3031(int arg0) {
    }

    @ObfuscatedName("fa.t(II)[I")
    public int[] method3056(int arg0) {
        return this.field2679[arg0];
    }

    @ObfuscatedName("fa.i(II)I")
    public int method3024(int arg0) {
        return this.field2694[arg0].length;
    }

    @ObfuscatedName("fa.r(B)I")
    public int method3025() {
        return this.field2694.length;
    }

    @ObfuscatedName("fa.m(IS)V")
    public void method3084(int arg0) {
        for (int var2 = 0; var2 < this.field2694[arg0].length; var2++) {
            this.field2694[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fa.e(I)V")
    public void method3027() {
        for (int var1 = 0; var1 < this.field2694.length; var1++) {
            if (this.field2694[var1] != null) {
                for (int var2 = 0; var2 < this.field2694[var1].length; var2++) {
                    this.field2694[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fa.h(I[IB)Z")
    public boolean method3017(int arg0, int[] arg1) {
        if (this.field2688[arg0] == null) {
            return false;
        }
        int var3 = this.field2697[arg0];
        int[] var4 = this.field2679[arg0];
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
            var8 = class126.method40(this.field2688[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2427(arg1, 5, var9.field2008.length);
        } else {
            var8 = class126.method40(this.field2688[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method200(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class120.method171(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class120.method171(var8, 0, var17);
            throw class149.method963(var34, var16 + var18 + "," + this.field2685[arg0] + "," + this.field2691);
        }
        if (this.field2692) {
            this.field2688[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class120 var22 = new class120(var10);
            int[] var23 = new int[var3];
            var22.field2006 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2343();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field2006 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2343();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2693) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class126.method2908(var27[var33], false);
                }
            }
        } else if (this.field2693) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method2908(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fa.z(Ljava/lang/String;B)I")
    public int method3028(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2686.method3481(Statics.method2123(var2));
    }

    @ObfuscatedName("fa.a(ILjava/lang/String;I)I")
    public int method3029(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2687[arg0].method3481(Statics.method2123(var3));
    }

    @ObfuscatedName("fa.w(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3030(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2686.method3481(Statics.method2123(var3));
        int var6 = this.field2687[var5].method3481(Statics.method2123(var4));
        return this.method3014(var5, var6);
    }

    @ObfuscatedName("fa.g(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3068(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2686.method3481(Statics.method2123(var3));
        int var6 = this.field2687[var5].method3481(Statics.method2123(var4));
        return this.method3047(var5, var6);
    }

    @ObfuscatedName("fa.y(Ljava/lang/String;I)Z")
    public boolean method3032(String arg0) {
        int var2 = this.method3028("");
        return var2 == -1 ? this.method3068(arg0, "") : this.method3068("", arg0);
    }

    @ObfuscatedName("fa.f(Ljava/lang/String;B)V")
    public void method3012(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2686.method3481(Statics.method2123(var2));
        if (var3 >= 0) {
            this.method3023(var3);
        }
    }

    @ObfuscatedName("z.q([BB)[B")
    public static final byte[] method200(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2338();
        int var3 = var1.method2343();
        if (var3 < 0 || !(field2682 == 0 || var3 <= field2682)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2349(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2343();
            if (var5 < 0 || field2682 != 0 && var5 > field2682) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2296(var6, var5, arg0, var3, 9);
            } else {
                field2690.method2291(var1, var6);
            }
            return var6;
        }
    }
}
