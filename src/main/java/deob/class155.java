package deob;

@ObfuscatedName("eg")
public abstract class class155 {

    @ObfuscatedName("eg.i")
    public int field2545;

    @ObfuscatedName("eg.b")
    public int[] field2539;

    @ObfuscatedName("eg.r")
    public int[] field2553;

    @ObfuscatedName("eg.l")
    public class171 field2542;

    @ObfuscatedName("eg.s")
    public int[] field2550;

    @ObfuscatedName("eg.d")
    public int[] field2555;

    @ObfuscatedName("eg.e")
    public int[] field2544;

    @ObfuscatedName("eg.u")
    public int[][] field2546;

    @ObfuscatedName("eg.q")
    public int[][] field2547;

    @ObfuscatedName("eg.o")
    public class171[] field2548;

    @ObfuscatedName("eg.v")
    public Object[] field2549;

    @ObfuscatedName("eg.m")
    public Object[][] field2540;

    @ObfuscatedName("eg.x")
    public static class123 field2543 = new class123();

    @ObfuscatedName("eg.w")
    public int field2552;

    @ObfuscatedName("eg.p")
    public boolean field2551;

    @ObfuscatedName("eg.z")
    public boolean field2554;

    @ObfuscatedName("eg.h")
    public static int field2541 = 0;

    public class155(boolean arg0, boolean arg1) {
        this.field2551 = arg0;
        this.field2554 = arg1;
    }

    @ObfuscatedName("eg.i([BI)V")
    public void method3041(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = class128.method2049(arg0, 0, var2);
        this.field2552 = var3;
        class128 var4 = new class128(method250(arg0));
        int var5 = var4.method2531();
        if (var5 < 5 || var5 > 7) {
            throw new RuntimeException("");
        }
        if (var5 >= 6) {
            var4.method2468();
        }
        int var6 = var4.method2531();
        if (var5 >= 7) {
            this.field2545 = var4.method2477();
        } else {
            this.field2545 = var4.method2473();
        }
        int var7 = 0;
        int var8 = -1;
        this.field2539 = new int[this.field2545];
        if (var5 >= 7) {
            for (int var9 = 0; var9 < this.field2545; var9++) {
                this.field2539[var9] = var7 += var4.method2477();
                if (this.field2539[var9] > var8) {
                    var8 = this.field2539[var9];
                }
            }
        } else {
            for (int var10 = 0; var10 < this.field2545; var10++) {
                this.field2539[var10] = var7 += var4.method2473();
                if (this.field2539[var10] > var8) {
                    var8 = this.field2539[var10];
                }
            }
        }
        this.field2550 = new int[var8 + 1];
        this.field2555 = new int[var8 + 1];
        this.field2544 = new int[var8 + 1];
        this.field2546 = new int[var8 + 1][];
        this.field2549 = new Object[var8 + 1];
        this.field2540 = new Object[var8 + 1][];
        if (var6 != 0) {
            this.field2553 = new int[var8 + 1];
            for (int var11 = 0; var11 < this.field2545; var11++) {
                this.field2553[this.field2539[var11]] = var4.method2468();
            }
            this.field2542 = new class171(this.field2553);
        }
        for (int var12 = 0; var12 < this.field2545; var12++) {
            this.field2550[this.field2539[var12]] = var4.method2468();
        }
        for (int var13 = 0; var13 < this.field2545; var13++) {
            this.field2555[this.field2539[var13]] = var4.method2468();
        }
        for (int var14 = 0; var14 < this.field2545; var14++) {
            this.field2544[this.field2539[var14]] = var4.method2473();
        }
        if (var5 >= 7) {
            for (int var15 = 0; var15 < this.field2545; var15++) {
                int var16 = this.field2539[var15];
                int var17 = this.field2544[var16];
                int var18 = 0;
                int var19 = -1;
                this.field2546[var16] = new int[var17];
                for (int var20 = 0; var20 < var17; var20++) {
                    int var21 = this.field2546[var16][var20] = var18 += var4.method2477();
                    if (var21 > var19) {
                        var19 = var21;
                    }
                }
                this.field2540[var16] = new Object[var19 + 1];
            }
        } else {
            for (int var22 = 0; var22 < this.field2545; var22++) {
                int var23 = this.field2539[var22];
                int var24 = this.field2544[var23];
                int var25 = 0;
                int var26 = -1;
                this.field2546[var23] = new int[var24];
                for (int var27 = 0; var27 < var24; var27++) {
                    int var28 = this.field2546[var23][var27] = var25 += var4.method2473();
                    if (var28 > var26) {
                        var26 = var28;
                    }
                }
                this.field2540[var23] = new Object[var26 + 1];
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2547 = new int[var8 + 1][];
        this.field2548 = new class171[var8 + 1];
        for (int var29 = 0; var29 < this.field2545; var29++) {
            int var30 = this.field2539[var29];
            int var31 = this.field2544[var30];
            this.field2547[var30] = new int[this.field2540[var30].length];
            for (int var32 = 0; var32 < var31; var32++) {
                this.field2547[var30][this.field2546[var30][var32]] = var4.method2468();
            }
            this.field2548[var30] = new class171(this.field2547[var30]);
        }
    }

    @ObfuscatedName("eg.b(II)V")
    public void method3042(int arg0) {
    }

    @ObfuscatedName("eg.r(III)[B")
    public byte[] method3043(int arg0, int arg1) {
        return this.method3058(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("eg.l(II[II)[B")
    public byte[] method3058(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2540.length || this.field2540[arg0] == null || arg1 < 0 || arg1 >= this.field2540[arg0].length) {
            return null;
        }
        if (this.field2540[arg0][arg1] == null) {
            boolean var4 = this.method3077(arg0, arg2);
            if (!var4) {
                this.method3051(arg0);
                boolean var5 = this.method3077(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class120.method152(this.field2540[arg0][arg1], false);
        if (this.field2554) {
            this.field2540[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("eg.s(III)Z")
    public boolean method3045(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2540.length || this.field2540[arg0] == null || arg1 < 0 || arg1 >= this.field2540[arg0].length) {
            return false;
        } else if (this.field2540[arg0][arg1] != null) {
            return true;
        } else if (this.field2549[arg0] == null) {
            this.method3051(arg0);
            return this.field2549[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.d(II)Z")
    public boolean method3046(int arg0) {
        if (this.field2549[arg0] == null) {
            this.method3051(arg0);
            return this.field2549[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("eg.e(B)Z")
    public boolean method3047() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2539.length; var2++) {
            int var3 = this.field2539[var2];
            if (this.field2549[var3] == null) {
                this.method3051(var3);
                if (this.field2549[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("eg.u(II)[B")
    public byte[] method3048(int arg0) {
        if (this.field2540.length == 1) {
            return this.method3043(0, arg0);
        } else if (this.field2540[arg0].length == 1) {
            return this.method3043(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.q(IIB)[B")
    public byte[] method3044(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2540.length || this.field2540[arg0] == null || arg1 < 0 || arg1 >= this.field2540[arg0].length) {
            return null;
        }
        if (this.field2540[arg0][arg1] == null) {
            boolean var3 = this.method3077(arg0, (int[]) null);
            if (!var3) {
                this.method3051(arg0);
                boolean var4 = this.method3077(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class120.method152(this.field2540[arg0][arg1], false);
    }

    @ObfuscatedName("eg.o(II)[B")
    public byte[] method3050(int arg0) {
        if (this.field2540.length == 1) {
            return this.method3044(0, arg0);
        } else if (this.field2540[arg0].length == 1) {
            return this.method3044(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("eg.v(II)V")
    public void method3051(int arg0) {
    }

    @ObfuscatedName("eg.m(II)[I")
    public int[] method3052(int arg0) {
        return this.field2546[arg0];
    }

    @ObfuscatedName("eg.x(II)I")
    public int method3084(int arg0) {
        return this.field2540[arg0].length;
    }

    @ObfuscatedName("eg.w(S)I")
    public int method3054() {
        return this.field2540.length;
    }

    @ObfuscatedName("eg.p(IB)V")
    public void method3055(int arg0) {
        for (int var2 = 0; var2 < this.field2540[arg0].length; var2++) {
            this.field2540[arg0][var2] = null;
        }
    }

    @ObfuscatedName("eg.z(B)V")
    public void method3056() {
        for (int var1 = 0; var1 < this.field2540.length; var1++) {
            if (this.field2540[var1] != null) {
                for (int var2 = 0; var2 < this.field2540[var1].length; var2++) {
                    this.field2540[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("eg.h(I[II)Z")
    public boolean method3077(int arg0, int[] arg1) {
        if (this.field2549[arg0] == null) {
            return false;
        }
        int var3 = this.field2544[arg0];
        int[] var4 = this.field2546[arg0];
        Object[] var5 = this.field2540[arg0];
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
            var8 = class120.method152(this.field2549[arg0], true);
            class128 var9 = new class128(var8);
            var9.method2497(arg1, 5, var9.field2050.length);
        } else {
            var8 = class120.method152(this.field2549[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method250(var8);
        } catch (RuntimeException var35) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = class128.method2049(var8, 0, var14);
            String var17 = var13 + var15 + ",";
            int var18 = var8.length - 2;
            int var19 = class128.method2049(var8, 0, var18);
            throw class81.method895(var35, var17 + var19 + "," + this.field2550[arg0] + "," + this.field2552);
        }
        if (this.field2551) {
            this.field2549[arg0] = null;
        }
        if (var3 > 1) {
            int var20 = var10.length;
            int var36 = var20 - 1;
            int var21 = var10[var36] & 0xFF;
            int var22 = var36 - var3 * var21 * 4;
            class128 var23 = new class128(var10);
            int[] var24 = new int[var3];
            var23.field2048 = var22;
            for (int var25 = 0; var25 < var21; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var3; var27++) {
                    var26 += var23.method2468();
                    var24[var27] += var26;
                }
            }
            byte[][] var28 = new byte[var3][];
            for (int var29 = 0; var29 < var3; var29++) {
                var28[var29] = new byte[var24[var29]];
                var24[var29] = 0;
            }
            var23.field2048 = var22;
            int var30 = 0;
            for (int var31 = 0; var31 < var21; var31++) {
                int var32 = 0;
                for (int var33 = 0; var33 < var3; var33++) {
                    var32 += var23.method2468();
                    System.arraycopy(var10, var30, var28[var33], var24[var33], var32);
                    var24[var33] += var32;
                    var30 += var32;
                }
            }
            for (int var34 = 0; var34 < var3; var34++) {
                if (this.field2554) {
                    var5[var4[var34]] = var28[var34];
                } else {
                    var5[var4[var34]] = class120.method39(var28[var34], false);
                }
            }
        } else if (this.field2554) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class120.method39(var10, false);
        }
        return true;
    }

    @ObfuscatedName("eg.a(Ljava/lang/String;B)I")
    public int method3057(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2542.method3271(class150.method56(var2));
    }

    @ObfuscatedName("eg.c(ILjava/lang/String;B)I")
    public int method3090(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2548[arg0].method3271(class150.method56(var3));
    }

    @ObfuscatedName("eg.k(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3059(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2542.method3271(class150.method56(var3));
        int var6 = this.field2548[var5].method3271(class150.method56(var4));
        return this.method3043(var5, var6);
    }

    @ObfuscatedName("eg.n(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3060(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2542.method3271(class150.method56(var3));
        int var6 = this.field2548[var5].method3271(class150.method56(var4));
        return this.method3045(var5, var6);
    }

    @ObfuscatedName("eg.t(Ljava/lang/String;B)V")
    public void method3061(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2542.method3271(class150.method56(var2));
        if (var3 >= 0) {
            this.method3042(var3);
        }
    }

    @ObfuscatedName("f.y([BB)[B")
    public static final byte[] method250(byte[] arg0) {
        class128 var1 = new class128(arg0);
        int var2 = var1.method2531();
        int var3 = var1.method2468();
        if (var3 < 0 || !(field2541 == 0 || var3 <= field2541)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2474(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2468();
            if (var5 < 0 || field2541 != 0 && var5 > field2541) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class124.method2426(var6, var5, arg0, var3, 9);
            } else {
                field2543.method2399(var1, var6);
            }
            return var6;
        }
    }
}
