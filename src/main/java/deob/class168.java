package deob;

@ObfuscatedName("fl")
public abstract class class168 {

    @ObfuscatedName("fl.b")
    public int field2681;

    @ObfuscatedName("fl.g")
    public int[] field2665;

    @ObfuscatedName("fl.j")
    public int[] field2677;

    @ObfuscatedName("fl.d")
    public class193 field2667;

    @ObfuscatedName("fl.x")
    public int[] field2668;

    @ObfuscatedName("fl.y")
    public int[] field2669;

    @ObfuscatedName("fl.r")
    public int[] field2674;

    @ObfuscatedName("fl.c")
    public int[][] field2671;

    @ObfuscatedName("fl.l")
    public int[][] field2672;

    @ObfuscatedName("fl.u")
    public class193[] field2673;

    @ObfuscatedName("fl.p")
    public Object[] field2664;

    @ObfuscatedName("fl.n")
    public Object[][] field2675;

    @ObfuscatedName("fl.w")
    public static class117 field2676 = new class117();

    @ObfuscatedName("fl.z")
    public int field2678;

    @ObfuscatedName("fl.k")
    public boolean field2670;

    @ObfuscatedName("fl.o")
    public boolean field2679;

    @ObfuscatedName("fl.t")
    public static int field2680 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2670 = arg0;
        this.field2679 = arg1;
    }

    @ObfuscatedName("fl.b([BI)V")
    public void method3095(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class120.method113(arg0, 0, var2);
        this.field2678 = var3;
        class120 var4 = new class120(method2290(arg0));
        int var5 = var4.method2344();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2349();
        }
        int var6 = var4.method2344();
        if (var5 >= 7) {
            this.field2681 = var4.method2561();
        } else {
            this.field2681 = var4.method2346();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2665 = new int[this.field2681];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2681; var9++) {
                this.field2665[var9] = var7 += var4.method2561();
                if (this.field2665[var9] > var8) {
                    var8 = this.field2665[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2681; var10++) {
                this.field2665[var10] = var7 += var4.method2346();
                if (this.field2665[var10] > var8) {
                    var8 = this.field2665[var10];
                }
            }
        }
        this.field2668 = new int[var8 + 1];
        this.field2669 = new int[var8 + 1];
        this.field2674 = new int[var8 + 1];
        this.field2671 = new int[var8 + 1][];
        this.field2664 = new Object[var8 + 1];
        this.field2675 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2677 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2681; var11++) {
                this.field2677[this.field2665[var11]] = var4.method2349();
            }
            this.field2667 = new class193(this.field2677);
        }
        for (int var12 = 0; var12 < this.field2681; var12++) {
            this.field2668[this.field2665[var12]] = var4.method2349();
        }
        for (int var13 = 0; var13 < this.field2681; var13++) {
            this.field2669[this.field2665[var13]] = var4.method2349();
        }
        for (int var14 = 0; var14 < this.field2681; var14++) {
            this.field2674[this.field2665[var14]] = var4.method2346();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2681; var15++) {
                int var16 = this.field2665[var15];
                int var17 = this.field2674[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2671[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2671[var16][var20] = var18 += var4.method2561();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2675[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2681; var22++) {
                int var23 = this.field2665[var22];
                int var24 = this.field2674[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2671[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2671[var23][var27] = var25 += var4.method2346();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2675[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2672 = new int[var8 + 1][];
        this.field2673 = new class193[var8 + 1];
        for (int var29 = 0; var29 < this.field2681; var29++) {
            int var30 = this.field2665[var29];
            int var31 = this.field2674[var30];
            this.field2672[var30] = new int[this.field2675[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2672[var30][this.field2671[var30][var32]] = var4.method2349();
            }
            this.field2673[var30] = new class193(this.field2672[var30]);
        }
    }

    @ObfuscatedName("fl.g(II)V")
    public void method3036(int arg0) {
    }

    @ObfuscatedName("fl.j(III)[B")
    public byte[] method3037(int arg0, int arg1) {
        return this.method3038(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fl.d(II[IS)[B")
    public byte[] method3038(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2675.length || this.field2675[arg0] == null || arg1 < 0 || arg1 >= this.field2675[arg0].length) {
            return null;
        }
        if (this.field2675[arg0][arg1] == null) {
            boolean var4 = this.method3051(arg0, arg2);
            if (!var4) {
                this.method3054(arg0);
                boolean var5 = this.method3051(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method656(this.field2675[arg0][arg1], false);
        if (this.field2679) {
            this.field2675[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fl.x(III)Z")
    public boolean method3039(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2675.length || this.field2675[arg0] == null || arg1 < 0 || arg1 >= this.field2675[arg0].length) {
            return false;
        } else if (this.field2675[arg0][arg1] != null) {
            return true;
        } else if (this.field2664[arg0] == null) {
            this.method3054(arg0);
            return this.field2664[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fl.y(II)Z")
    public boolean method3040(int arg0) {
        if (this.field2664[arg0] == null) {
            this.method3054(arg0);
            return this.field2664[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fl.r(I)Z")
    public boolean method3041() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2665.length; var2++) {
            int var3 = this.field2665[var2];
            if (this.field2664[var3] == null) {
                this.method3054(var3);
                if (this.field2664[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fl.c(IB)[B")
    public byte[] method3042(int arg0) {
        if (this.field2675.length == 1) {
            return this.method3037(0, arg0);
        } else if (this.field2675[arg0].length == 1) {
            return this.method3037(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fl.l(III)[B")
    public byte[] method3069(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2675.length || this.field2675[arg0] == null || arg1 < 0 || arg1 >= this.field2675[arg0].length) {
            return null;
        }
        if (this.field2675[arg0][arg1] == null) {
            boolean var3 = this.method3051(arg0, (int[]) null);
            if (!var3) {
                this.method3054(arg0);
                boolean var4 = this.method3051(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method656(this.field2675[arg0][arg1], false);
    }

    @ObfuscatedName("fl.u(II)[B")
    public byte[] method3044(int arg0) {
        if (this.field2675.length == 1) {
            return this.method3069(0, arg0);
        } else if (this.field2675[arg0].length == 1) {
            return this.method3069(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fl.p(II)V")
    public void method3054(int arg0) {
    }

    @ObfuscatedName("fl.n(II)[I")
    public int[] method3078(int arg0) {
        return this.field2671[arg0];
    }

    @ObfuscatedName("fl.w(II)I")
    public int method3047(int arg0) {
        return this.field2675[arg0].length;
    }

    @ObfuscatedName("fl.z(B)I")
    public int method3048() {
        return this.field2675.length;
    }

    @ObfuscatedName("fl.k(II)V")
    public void method3116(int arg0) {
        for (int var2 = 0; var2 < this.field2675[arg0].length; var2++) {
            this.field2675[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fl.o(B)V")
    public void method3050() {
        for (int var1 = 0; var1 < this.field2675.length; var1++) {
            if (this.field2675[var1] != null) {
                for (int var2 = 0; var2 < this.field2675[var1].length; var2++) {
                    this.field2675[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fl.t(I[IS)Z")
    public boolean method3051(int arg0, int[] arg1) {
        if (this.field2664[arg0] == null) {
            return false;
        }
        int var3 = this.field2674[arg0];
        int[] var4 = this.field2671[arg0];
        Object[] var5 = this.field2675[arg0];
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
            var8 = class126.method656(this.field2664[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2363(arg1, 5, var9.field1983.length);
        } else {
            var8 = class126.method656(this.field2664[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2290(var8);
        } catch (RuntimeException var34) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class120.method113(var8, 0, var14);
            String var16 = var13 + var15 + ",";
            int var17 = var8.length - 2;
            int var18 = class120.method113(var8, 0, var17);
            throw class149.method1230(var34, var16 + var18 + "," + this.field2668[arg0] + "," + this.field2678);
        }
        if (this.field2670) {
            this.field2664[arg0] = null;
        }
        if (var3 > 1) {
            int var19 = var10.length;
            int var35 = var19 - 1;
            int var20 = var10[var35] & 0xFF;
            int var21 = var35 - var3 * var20 * 4;
            class120 var22 = new class120(var10);
            int[] var23 = new int[var3];
            var22.field1977 = var21;
            for (int var24 = 0; var24 < var20; var24++) {
                int var25 = 0;
                for (int var26 = 0; var26 < var3; var26++) {
                    var25 += var22.method2349();
                    var23[var26] += var25;
                }
            }
            byte[][] var27 = new byte[var3][];
            for (int var28 = 0; var28 < var3; var28++) {
                var27[var28] = new byte[var23[var28]];
                var23[var28] = 0;
            }
            var22.field1977 = var21;
            int var29 = 0;
            for (int var30 = 0; var30 < var20; var30++) {
                int var31 = 0;
                for (int var32 = 0; var32 < var3; var32++) {
                    var31 += var22.method2349();
                    System.arraycopy(var10, var29, var27[var32], var23[var32], var31);
                    var23[var32] += var31;
                    var29 += var31;
                }
            }
            for (int var33 = 0; var33 < var3; var33++) {
                if (this.field2679) {
                    var5[var4[var33]] = var27[var33];
                } else {
                    var5[var4[var33]] = class126.method2259(var27[var33], false);
                }
            }
        } else if (this.field2679) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method2259(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fl.h(Ljava/lang/String;B)I")
    public int method3052(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2667.method3484(class164.method2264(var2));
    }

    @ObfuscatedName("fl.v(ILjava/lang/String;I)I")
    public int method3053(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2673[arg0].method3484(class164.method2264(var3));
    }

    @ObfuscatedName("fl.a(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3065(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2667.method3484(class164.method2264(var3));
        int var6 = this.field2673[var5].method3484(class164.method2264(var4));
        return this.method3037(var5, var6);
    }

    @ObfuscatedName("fl.f(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3112(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2667.method3484(class164.method2264(var3));
        int var6 = this.field2673[var5].method3484(class164.method2264(var4));
        return this.method3039(var5, var6);
    }

    @ObfuscatedName("fl.q(Ljava/lang/String;I)Z")
    public boolean method3056(String arg0) {
        int var2 = this.method3052("");
        return var2 == -1 ? this.method3112(arg0, "") : this.method3112("", arg0);
    }

    @ObfuscatedName("fl.m(Ljava/lang/String;I)V")
    public void method3057(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2667.method3484(class164.method2264(var2));
        if (var3 >= 0) {
            this.method3036(var3);
        }
    }

    @ObfuscatedName("dv.s([BI)[B")
    public static final byte[] method2290(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2344();
        int var3 = var1.method2349();
        if (var3 < 0 || !(field2680 == 0 || var3 <= field2680)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2355(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2349();
            if (var5 < 0 || field2680 != 0 && var5 > field2680) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2294(var6, var5, arg0, var3, 9);
            } else {
                field2676.method2287(var1, var6);
            }
            return var6;
        }
    }
}
