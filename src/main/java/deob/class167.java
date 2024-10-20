package deob;

@ObfuscatedName("fm")
public abstract class class167 {

    @ObfuscatedName("fm.n")
    public int field2675;

    @ObfuscatedName("fm.q")
    public int[] field2672;

    @ObfuscatedName("fm.c")
    public int[] field2679;

    @ObfuscatedName("fm.l")
    public class192 field2666;

    @ObfuscatedName("fm.r")
    public int[] field2667;

    @ObfuscatedName("fm.u")
    public int[] field2668;

    @ObfuscatedName("fm.j")
    public int[] field2669;

    @ObfuscatedName("fm.w")
    public int[][] field2670;

    @ObfuscatedName("fm.y")
    public int[][] field2671;

    @ObfuscatedName("fm.o")
    public class192[] field2678;

    @ObfuscatedName("fm.h")
    public Object[] field2676;

    @ObfuscatedName("fm.e")
    public Object[][] field2674;

    @ObfuscatedName("fm.v")
    public static class116 field2673 = new class116();

    @ObfuscatedName("fm.p")
    public int field2681;

    @ObfuscatedName("fm.m")
    public boolean field2677;

    @ObfuscatedName("fm.b")
    public boolean field2665;

    @ObfuscatedName("fm.s")
    public static int field2664 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2677 = arg0;
        this.field2665 = arg1;
    }

    @ObfuscatedName("fm.n([BI)V")
    public void method3018(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class119.method590(arg0, 0, var2);
        this.field2681 = var3;
        class119 var4 = new class119(method3655(arg0));
        int var5 = var4.method2360();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2365();
        }
        int var6 = var4.method2360();
        if (var5 >= 7) {
            this.field2675 = var4.method2374();
        } else {
            this.field2675 = var4.method2430();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2672 = new int[this.field2675];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2675; var9++) {
                this.field2672[var9] = var7 += var4.method2374();
                if (this.field2672[var9] > var8) {
                    var8 = this.field2672[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2675; var10++) {
                this.field2672[var10] = var7 += var4.method2430();
                if (this.field2672[var10] > var8) {
                    var8 = this.field2672[var10];
                }
            }
        }
        this.field2667 = new int[var8 + 1];
        this.field2668 = new int[var8 + 1];
        this.field2669 = new int[var8 + 1];
        this.field2670 = new int[var8 + 1][];
        this.field2676 = new Object[var8 + 1];
        this.field2674 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2679 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2675; var11++) {
                this.field2679[this.field2672[var11]] = var4.method2365();
            }
            this.field2666 = new class192(this.field2679);
        }
        for (int var12 = 0; var12 < this.field2675; var12++) {
            this.field2667[this.field2672[var12]] = var4.method2365();
        }
        for (int var13 = 0; var13 < this.field2675; var13++) {
            this.field2668[this.field2672[var13]] = var4.method2365();
        }
        for (int var14 = 0; var14 < this.field2675; var14++) {
            this.field2669[this.field2672[var14]] = var4.method2430();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2675; var15++) {
                int var16 = this.field2672[var15];
                int var17 = this.field2669[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2670[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2670[var16][var20] = var18 += var4.method2374();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2674[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2675; var22++) {
                int var23 = this.field2672[var22];
                int var24 = this.field2669[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2670[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2670[var23][var27] = var25 += var4.method2430();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2674[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2671 = new int[var8 + 1][];
        this.field2678 = new class192[var8 + 1];
        for (int var29 = 0; var29 < this.field2675; var29++) {
            int var30 = this.field2672[var29];
            int var31 = this.field2669[var30];
            this.field2671[var30] = new int[this.field2674[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2671[var30][this.field2670[var30][var32]] = var4.method2365();
            }
            this.field2678[var30] = new class192(this.field2671[var30]);
        }
    }

    @ObfuscatedName("fm.q(IB)V")
    public void method3019(int arg0) {
    }

    @ObfuscatedName("fm.c(III)[B")
    public byte[] method3094(int arg0, int arg1) {
        return this.method3046(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fm.l(II[IB)[B")
    public byte[] method3046(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2674.length || this.field2674[arg0] == null || arg1 < 0 || arg1 >= this.field2674[arg0].length) {
            return null;
        }
        if (this.field2674[arg0][arg1] == null) {
            boolean var4 = this.method3051(arg0, arg2);
            if (!var4) {
                this.method3100(arg0);
                boolean var5 = this.method3051(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method1082(this.field2674[arg0][arg1], false);
        if (this.field2665) {
            this.field2674[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fm.r(III)Z")
    public boolean method3022(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2674.length || this.field2674[arg0] == null || arg1 < 0 || arg1 >= this.field2674[arg0].length) {
            return false;
        } else if (this.field2674[arg0][arg1] != null) {
            return true;
        } else if (this.field2676[arg0] == null) {
            this.method3100(arg0);
            return this.field2676[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fm.u(II)Z")
    public boolean method3053(int arg0) {
        if (this.field2676[arg0] == null) {
            this.method3100(arg0);
            return this.field2676[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fm.j(I)Z")
    public boolean method3024() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2672.length; var2++) {
            int var3 = this.field2672[var2];
            if (this.field2676[var3] == null) {
                this.method3100(var3);
                if (this.field2676[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fm.w(IB)[B")
    public byte[] method3062(int arg0) {
        if (this.field2674.length == 1) {
            return this.method3094(0, arg0);
        } else if (this.field2674[arg0].length == 1) {
            return this.method3094(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fm.y(III)[B")
    public byte[] method3026(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2674.length || this.field2674[arg0] == null || arg1 < 0 || arg1 >= this.field2674[arg0].length) {
            return null;
        }
        if (this.field2674[arg0][arg1] == null) {
            boolean var3 = this.method3051(arg0, (int[]) null);
            if (!var3) {
                this.method3100(arg0);
                boolean var4 = this.method3051(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method1082(this.field2674[arg0][arg1], false);
    }

    @ObfuscatedName("fm.o(IB)[B")
    public byte[] method3027(int arg0) {
        if (this.field2674.length == 1) {
            return this.method3026(0, arg0);
        } else if (this.field2674[arg0].length == 1) {
            return this.method3026(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fm.h(IB)V")
    public void method3100(int arg0) {
    }

    @ObfuscatedName("fm.e(II)[I")
    public int[] method3085(int arg0) {
        return this.field2670[arg0];
    }

    @ObfuscatedName("fm.v(II)I")
    public int method3030(int arg0) {
        return this.field2674[arg0].length;
    }

    @ObfuscatedName("fm.p(I)I")
    public int method3031() {
        return this.field2674.length;
    }

    @ObfuscatedName("fm.m(II)V")
    public void method3032(int arg0) {
        for (int var2 = 0; var2 < this.field2674[arg0].length; var2++) {
            this.field2674[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fm.b(I)V")
    public void method3033() {
        for (int var1 = 0; var1 < this.field2674.length; var1++) {
            if (this.field2674[var1] != null) {
                for (int var2 = 0; var2 < this.field2674[var1].length; var2++) {
                    this.field2674[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fm.s(I[II)Z")
    public boolean method3051(int arg0, int[] arg1) {
        if (this.field2676[arg0] == null) {
            return false;
        }
        int var3 = this.field2669[arg0];
        int[] var4 = this.field2670[arg0];
        Object[] var5 = this.field2674[arg0];
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
            var8 = class125.method1082(this.field2676[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2429(arg1, 5, var9.field1987.length);
        } else {
            var8 = class125.method1082(this.field2676[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method3655(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class119.method590(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class119.method590(var8, 0, var18);
            throw class148.method201(var35, var17 + var19 + "," + this.field2667[arg0] + "," + this.field2681);
        }
        if (this.field2677) {
            this.field2676[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class119 var23 = new class119(var10);
            int[] var24 = new int[var3];
            var23.field1982 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2365();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field1982 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2365();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2665) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class125.method2781(var28[var34], false);
                }
            }
        } else if (this.field2665) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method2781(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fm.x(Ljava/lang/String;I)I")
    public int method3035(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2666.method3472(class163.method1587(var2));
    }

    @ObfuscatedName("fm.z(ILjava/lang/String;I)I")
    public int method3042(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2678[arg0].method3472(class163.method1587(var3));
    }

    @ObfuscatedName("fm.d(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3037(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3472(class163.method1587(var3));
        int var6 = this.field2678[var5].method3472(class163.method1587(var4));
        return this.method3094(var5, var6);
    }

    @ObfuscatedName("fm.a(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3067(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3472(class163.method1587(var3));
        int var6 = this.field2678[var5].method3472(class163.method1587(var4));
        return this.method3022(var5, var6);
    }

    @ObfuscatedName("fm.t(Ljava/lang/String;I)Z")
    public boolean method3039(String arg0) {
        int var2 = this.method3035("");
        return var2 == -1 ? this.method3067(arg0, "") : this.method3067("", arg0);
    }

    @ObfuscatedName("fm.k(Ljava/lang/String;I)V")
    public void method3040(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2666.method3472(class163.method1587(var2));
        if (var3 >= 0) {
            this.method3019(var3);
        }
    }

    @ObfuscatedName("hd.f([BB)[B")
    public static final byte[] method3655(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2360();
        int var3 = var1.method2365();
        if (var3 < 0 || !(field2664 == 0 || var3 <= field2664)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2371(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2365();
            if (var5 < 0 || field2664 != 0 && var5 > field2664) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2320(var6, var5, arg0, var3, 9);
            } else {
                field2673.method2305(var1, var6);
            }
            return var6;
        }
    }
}
