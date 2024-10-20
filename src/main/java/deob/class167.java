package deob;

@ObfuscatedName("fd")
public abstract class class167 {

    @ObfuscatedName("fd.o")
    public int field2679;

    @ObfuscatedName("fd.f")
    public int[] field2666;

    @ObfuscatedName("fd.i")
    public int[] field2667;

    @ObfuscatedName("fd.h")
    public class192 field2665;

    @ObfuscatedName("fd.q")
    public int[] field2669;

    @ObfuscatedName("fd.u")
    public int[] field2670;

    @ObfuscatedName("fd.m")
    public int[] field2671;

    @ObfuscatedName("fd.y")
    public int[][] field2672;

    @ObfuscatedName("fd.p")
    public int[][] field2673;

    @ObfuscatedName("fd.t")
    public class192[] field2674;

    @ObfuscatedName("fd.g")
    public Object[] field2675;

    @ObfuscatedName("fd.v")
    public Object[][] field2676;

    @ObfuscatedName("fd.l")
    public static class116 field2682 = new class116();

    @ObfuscatedName("fd.e")
    public int field2677;

    @ObfuscatedName("fd.a")
    public boolean field2680;

    @ObfuscatedName("fd.w")
    public boolean field2678;

    @ObfuscatedName("fd.d")
    public static int field2681 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2680 = arg0;
        this.field2678 = arg1;
    }

    @ObfuscatedName("fd.o([BI)V")
    public void method2972(byte[] arg0) {
        this.field2677 = class119.method1893(arg0, arg0.length);
        class119 var2 = new class119(method148(arg0));
        int var3 = var2.method2290();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2295();
        }
        int var4 = var2.method2290();
        if (var3 >= 7) {
            this.field2679 = var2.method2304();
        } else {
            this.field2679 = var2.method2292();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2666 = new int[this.field2679];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2679; var7++) {
                this.field2666[var7] = var5 += var2.method2304();
                if (this.field2666[var7] > var6) {
                    var6 = this.field2666[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2679; var8++) {
                this.field2666[var8] = var5 += var2.method2292();
                if (this.field2666[var8] > var6) {
                    var6 = this.field2666[var8];
                }
            }
        }
        this.field2669 = new int[var6 + 1];
        this.field2670 = new int[var6 + 1];
        this.field2671 = new int[var6 + 1];
        this.field2672 = new int[var6 + 1][];
        this.field2675 = new Object[var6 + 1];
        this.field2676 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2667 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2679; var9++) {
                this.field2667[this.field2666[var9]] = var2.method2295();
            }
            this.field2665 = new class192(this.field2667);
        }
        for (int var10 = 0; var10 < this.field2679; var10++) {
            this.field2669[this.field2666[var10]] = var2.method2295();
        }
        for (int var11 = 0; var11 < this.field2679; var11++) {
            this.field2670[this.field2666[var11]] = var2.method2295();
        }
        for (int var12 = 0; var12 < this.field2679; var12++) {
            this.field2671[this.field2666[var12]] = var2.method2292();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2679; var13++) {
                int var14 = this.field2666[var13];
                int var15 = this.field2671[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2672[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2672[var14][var18] = var16 += var2.method2304();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2676[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2679; var20++) {
                int var21 = this.field2666[var20];
                int var22 = this.field2671[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2672[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2672[var21][var25] = var23 += var2.method2292();
                    if (var26 > var24) {
                        var24 = var26;
                    }
                }
                this.field2676[var21] = new Object[var24 + 1];
            }
        }
        if (var4 == 0) {
            return;
        }
        this.field2673 = new int[var6 + 1][];
        this.field2674 = new class192[var6 + 1];
        for (int var27 = 0; var27 < this.field2679; var27++) {
            int var28 = this.field2666[var27];
            int var29 = this.field2671[var28];
            this.field2673[var28] = new int[this.field2676[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2673[var28][this.field2672[var28][var30]] = var2.method2295();
            }
            this.field2674[var28] = new class192(this.field2673[var28]);
        }
    }

    @ObfuscatedName("fd.f(IB)V")
    public void method3028(int arg0) {
    }

    @ObfuscatedName("fd.i(III)[B")
    public byte[] method3030(int arg0, int arg1) {
        return this.method3013(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fd.h(II[IB)[B")
    public byte[] method3013(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2676.length || this.field2676[arg0] == null || arg1 < 0 || arg1 >= this.field2676[arg0].length) {
            return null;
        }
        if (this.field2676[arg0][arg1] == null) {
            boolean var4 = this.method2988(arg0, arg2);
            if (!var4) {
                this.method2982(arg0);
                boolean var5 = this.method2988(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method1027(this.field2676[arg0][arg1], false);
        if (this.field2678) {
            this.field2676[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fd.q(III)Z")
    public boolean method2976(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2676.length || this.field2676[arg0] == null || arg1 < 0 || arg1 >= this.field2676[arg0].length) {
            return false;
        } else if (this.field2676[arg0][arg1] != null) {
            return true;
        } else if (this.field2675[arg0] == null) {
            this.method2982(arg0);
            return this.field2675[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.u(II)Z")
    public boolean method3000(int arg0) {
        if (this.field2675[arg0] == null) {
            this.method2982(arg0);
            return this.field2675[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fd.m(I)Z")
    public boolean method2978() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2666.length; var2++) {
            int var3 = this.field2666[var2];
            if (this.field2675[var3] == null) {
                this.method2982(var3);
                if (this.field2675[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fd.y(II)[B")
    public byte[] method2979(int arg0) {
        if (this.field2676.length == 1) {
            return this.method3030(0, arg0);
        } else if (this.field2676[arg0].length == 1) {
            return this.method3030(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.p(III)[B")
    public byte[] method2980(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2676.length || this.field2676[arg0] == null || arg1 < 0 || arg1 >= this.field2676[arg0].length) {
            return null;
        }
        if (this.field2676[arg0][arg1] == null) {
            boolean var3 = this.method2988(arg0, (int[]) null);
            if (!var3) {
                this.method2982(arg0);
                boolean var4 = this.method2988(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method1027(this.field2676[arg0][arg1], false);
    }

    @ObfuscatedName("fd.t(II)[B")
    public byte[] method2981(int arg0) {
        if (this.field2676.length == 1) {
            return this.method2980(0, arg0);
        } else if (this.field2676[arg0].length == 1) {
            return this.method2980(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fd.g(II)V")
    public void method2982(int arg0) {
    }

    @ObfuscatedName("fd.v(IB)[I")
    public int[] method2983(int arg0) {
        return this.field2672[arg0];
    }

    @ObfuscatedName("fd.l(II)I")
    public int method2973(int arg0) {
        return this.field2676[arg0].length;
    }

    @ObfuscatedName("fd.e(I)I")
    public int method3045() {
        return this.field2676.length;
    }

    @ObfuscatedName("fd.a(IB)V")
    public void method3023(int arg0) {
        for (int var2 = 0; var2 < this.field2676[arg0].length; var2++) {
            this.field2676[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fd.w(I)V")
    public void method2987() {
        for (int var1 = 0; var1 < this.field2676.length; var1++) {
            if (this.field2676[var1] != null) {
                for (int var2 = 0; var2 < this.field2676[var1].length; var2++) {
                    this.field2676[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fd.d(I[II)Z")
    public boolean method2988(int arg0, int[] arg1) {
        if (this.field2675[arg0] == null) {
            return false;
        }
        int var3 = this.field2671[arg0];
        int[] var4 = this.field2672[arg0];
        Object[] var5 = this.field2676[arg0];
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
            var8 = class125.method1027(this.field2675[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2309(arg1, 5, var9.field1989.length);
        } else {
            var8 = class125.method1027(this.field2675[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method148(var8);
        } catch (RuntimeException var27) {
            throw class148.method135(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class119.method1893(var8, var8.length) + "," + class119.method1893(var8, var8.length - 2) + "," + this.field2669[arg0] + "," + this.field2677);
        }
        if (this.field2680) {
            this.field2675[arg0] = null;
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
                    var18 += var15.method2295();
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
                    var24 += var15.method2295();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2678) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = class125.method612(var20[var26], false);
                }
            }
        } else if (this.field2678) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method612(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fd.z(Ljava/lang/String;I)I")
    public int method2989(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2665.method3444(class163.method133(var2));
    }

    @ObfuscatedName("fd.s(ILjava/lang/String;I)I")
    public int method2990(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2674[arg0].method3444(class163.method133(var3));
    }

    @ObfuscatedName("fd.j(Ljava/lang/String;Ljava/lang/String;S)[B")
    public byte[] method2986(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2665.method3444(class163.method133(var3));
        int var6 = this.field2674[var5].method3444(class163.method133(var4));
        return this.method3030(var5, var6);
    }

    @ObfuscatedName("fd.b(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method2992(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2665.method3444(class163.method133(var3));
        int var6 = this.field2674[var5].method3444(class163.method133(var4));
        return this.method2976(var5, var6);
    }

    @ObfuscatedName("fd.r(Ljava/lang/String;I)Z")
    public boolean method2993(String arg0) {
        int var2 = this.method2989("");
        return var2 == -1 ? this.method2992(arg0, "") : this.method2992("", arg0);
    }

    @ObfuscatedName("fd.n(Ljava/lang/String;B)V")
    public void method2994(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2665.method3444(class163.method133(var2));
        if (var3 >= 0) {
            this.method3028(var3);
        }
    }

    @ObfuscatedName("a.c([BI)[B")
    public static final byte[] method148(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2290();
        int var3 = var1.method2295();
        if (var3 < 0 || !(field2681 == 0 || var3 <= field2681)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2301(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2295();
            if (var5 < 0 || field2681 != 0 && var5 > field2681) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2246(var6, var5, arg0, var3, 9);
            } else {
                field2682.method2239(var1, var6);
            }
            return var6;
        }
    }
}
