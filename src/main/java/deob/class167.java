package deob;

@ObfuscatedName("fv")
public abstract class class167 {

    @ObfuscatedName("fv.h")
    public int field2654;

    @ObfuscatedName("fv.q")
    public int[] field2659;

    @ObfuscatedName("fv.v")
    public int[] field2666;

    @ObfuscatedName("fv.n")
    public class192 field2657;

    @ObfuscatedName("fv.f")
    public int[] field2658;

    @ObfuscatedName("fv.g")
    public int[] field2671;

    @ObfuscatedName("fv.o")
    public int[] field2660;

    @ObfuscatedName("fv.s")
    public int[][] field2661;

    @ObfuscatedName("fv.k")
    public int[][] field2662;

    @ObfuscatedName("fv.b")
    public class192[] field2655;

    @ObfuscatedName("fv.c")
    public Object[] field2664;

    @ObfuscatedName("fv.l")
    public Object[][] field2665;

    @ObfuscatedName("fv.p")
    public static class116 field2663 = new class116();

    @ObfuscatedName("fv.d")
    public int field2667;

    @ObfuscatedName("fv.i")
    public boolean field2656;

    @ObfuscatedName("fv.x")
    public boolean field2668;

    @ObfuscatedName("fv.j")
    public static int field2670 = 0;

    public class167(boolean arg0, boolean arg1) {
        this.field2656 = arg0;
        this.field2668 = arg1;
    }

    @ObfuscatedName("fv.h([BI)V")
    public void method3088(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class119.field1972[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2667 = var5;
        class119 var8 = new class119(method168(arg0));
        int var9 = var8.method2383();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2388();
        }
        int var10 = var8.method2383();
        if (var9 >= 7) {
            this.field2654 = var8.method2450();
        } else {
            this.field2654 = var8.method2385();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2659 = new int[this.field2654];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2654; var13++) {
                this.field2659[var13] = var11 += var8.method2450();
                if (this.field2659[var13] > var12) {
                    var12 = this.field2659[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2654; var14++) {
                this.field2659[var14] = var11 += var8.method2385();
                if (this.field2659[var14] > var12) {
                    var12 = this.field2659[var14];
                }
            }
        }
        this.field2658 = new int[var12 + 1];
        this.field2671 = new int[var12 + 1];
        this.field2660 = new int[var12 + 1];
        this.field2661 = new int[var12 + 1][];
        this.field2664 = new Object[var12 + 1];
        this.field2665 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2666 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2654; var15++) {
                this.field2666[this.field2659[var15]] = var8.method2388();
            }
            this.field2657 = new class192(this.field2666);
        }
        for (int var16 = 0; var16 < this.field2654; var16++) {
            this.field2658[this.field2659[var16]] = var8.method2388();
        }
        for (int var17 = 0; var17 < this.field2654; var17++) {
            this.field2671[this.field2659[var17]] = var8.method2388();
        }
        for (int var18 = 0; var18 < this.field2654; var18++) {
            this.field2660[this.field2659[var18]] = var8.method2385();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2654; var19++) {
                int var20 = this.field2659[var19];
                int var21 = this.field2660[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2661[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2661[var20][var24] = var22 += var8.method2450();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2665[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2654; var26++) {
                int var27 = this.field2659[var26];
                int var28 = this.field2660[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2661[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2661[var27][var31] = var29 += var8.method2385();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2665[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2662 = new int[var12 + 1][];
        this.field2655 = new class192[var12 + 1];
        for (int var33 = 0; var33 < this.field2654; var33++) {
            int var34 = this.field2659[var33];
            int var35 = this.field2660[var34];
            this.field2662[var34] = new int[this.field2665[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2662[var34][this.field2661[var34][var36]] = var8.method2388();
            }
            this.field2655[var34] = new class192(this.field2662[var34]);
        }
    }

    @ObfuscatedName("fv.q(II)V")
    public void method3159(int arg0) {
    }

    @ObfuscatedName("fv.v(IIB)[B")
    public byte[] method3073(int arg0, int arg1) {
        return this.method3074(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fv.n(II[II)[B")
    public byte[] method3074(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var4 = this.method3122(arg0, arg2);
            if (!var4) {
                this.method3080(arg0);
                boolean var5 = this.method3122(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class125.method2311(this.field2665[arg0][arg1], false);
        if (this.field2668) {
            this.field2665[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fv.f(IIB)Z")
    public boolean method3075(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return false;
        } else if (this.field2665[arg0][arg1] != null) {
            return true;
        } else if (this.field2664[arg0] == null) {
            this.method3080(arg0);
            return this.field2664[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.g(IB)Z")
    public boolean method3157(int arg0) {
        if (this.field2664[arg0] == null) {
            this.method3080(arg0);
            return this.field2664[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fv.o(I)Z")
    public boolean method3086() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2659.length; var2++) {
            int var3 = this.field2659[var2];
            if (this.field2664[var3] == null) {
                this.method3080(var3);
                if (this.field2664[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fv.s(II)[B")
    public byte[] method3077(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3073(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3073(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.k(IIB)[B")
    public byte[] method3126(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2665.length || this.field2665[arg0] == null || arg1 < 0 || arg1 >= this.field2665[arg0].length) {
            return null;
        }
        if (this.field2665[arg0][arg1] == null) {
            boolean var3 = this.method3122(arg0, (int[]) null);
            if (!var3) {
                this.method3080(arg0);
                boolean var4 = this.method3122(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class125.method2311(this.field2665[arg0][arg1], false);
    }

    @ObfuscatedName("fv.b(II)[B")
    public byte[] method3079(int arg0) {
        if (this.field2665.length == 1) {
            return this.method3126(0, arg0);
        } else if (this.field2665[arg0].length == 1) {
            return this.method3126(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fv.c(II)V")
    public void method3080(int arg0) {
    }

    @ObfuscatedName("fv.l(IB)[I")
    public int[] method3132(int arg0) {
        return this.field2661[arg0];
    }

    @ObfuscatedName("fv.p(II)I")
    public int method3092(int arg0) {
        return this.field2665[arg0].length;
    }

    @ObfuscatedName("fv.d(B)I")
    public int method3083() {
        return this.field2665.length;
    }

    @ObfuscatedName("fv.i(II)V")
    public void method3094(int arg0) {
        for (int var2 = 0; var2 < this.field2665[arg0].length; var2++) {
            this.field2665[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fv.x(B)V")
    public void method3085() {
        for (int var1 = 0; var1 < this.field2665.length; var1++) {
            if (this.field2665[var1] != null) {
                for (int var2 = 0; var2 < this.field2665[var1].length; var2++) {
                    this.field2665[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fv.j(I[II)Z")
    public boolean method3122(int arg0, int[] arg1) {
        if (this.field2664[arg0] == null) {
            return false;
        }
        int var3 = this.field2660[arg0];
        int[] var4 = this.field2661[arg0];
        Object[] var5 = this.field2665[arg0];
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
            var8 = class125.method2311(this.field2664[arg0], true);
            class119 var9 = new class119(var8);
            var9.method2521(arg1, 5, var9.field1978.length);
        } else {
            var8 = class125.method2311(this.field2664[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method168(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class119.field1972[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class119.field1972[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class148.method963(var43, var21 + var25 + "," + this.field2658[arg0] + "," + this.field2667);
        }
        if (this.field2656) {
            this.field2664[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class119 var31 = new class119(var10);
            int[] var32 = new int[var3];
            var31.field1973 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2388();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1973 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2388();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2668) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class125.method647(var36[var42], false);
                }
            }
        } else if (this.field2668) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class125.method647(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fv.w(Ljava/lang/String;I)I")
    public int method3084(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2657.method3535(class163.method1248(var2));
    }

    @ObfuscatedName("fv.r(ILjava/lang/String;B)I")
    public int method3076(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2655[arg0].method3535(class163.method1248(var3));
    }

    @ObfuscatedName("fv.u(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3089(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2657.method3535(class163.method1248(var3));
        int var6 = this.field2655[var5].method3535(class163.method1248(var4));
        return this.method3073(var5, var6);
    }

    @ObfuscatedName("fv.m(Ljava/lang/String;Ljava/lang/String;B)Z")
    public boolean method3098(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2657.method3535(class163.method1248(var3));
        int var6 = this.field2655[var5].method3535(class163.method1248(var4));
        return this.method3075(var5, var6);
    }

    @ObfuscatedName("fv.t(Ljava/lang/String;B)Z")
    public boolean method3087(String arg0) {
        int var2 = this.method3084("");
        return var2 == -1 ? this.method3098(arg0, "") : this.method3098("", arg0);
    }

    @ObfuscatedName("fv.z(Ljava/lang/String;I)V")
    public void method3131(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2657.method3535(class163.method1248(var2));
        if (var3 >= 0) {
            this.method3159(var3);
        }
    }

    @ObfuscatedName("d.e([BI)[B")
    public static final byte[] method168(byte[] arg0) {
        class119 var1 = new class119(arg0);
        int var2 = var1.method2383();
        int var3 = var1.method2388();
        if (var3 < 0 || !(field2670 == 0 || var3 <= field2670)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2394(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2388();
            if (var5 < 0 || field2670 != 0 && var5 > field2670) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class117.method2339(var6, var5, arg0, var3, 9);
            } else {
                field2663.method2337(var1, var6);
            }
            return var6;
        }
    }
}
