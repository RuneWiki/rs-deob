package deob;

@ObfuscatedName("gq")
public abstract class class183 {

    @ObfuscatedName("gq.i")
    public int field2723;

    @ObfuscatedName("gq.e")
    public int[] field2716;

    @ObfuscatedName("gq.f")
    public int[] field2709;

    @ObfuscatedName("gq.k")
    public class123 field2710;

    @ObfuscatedName("gq.g")
    public int[] field2711;

    @ObfuscatedName("gq.n")
    public int[] field2717;

    @ObfuscatedName("gq.a")
    public int[] field2713;

    @ObfuscatedName("gq.q")
    public int[][] field2707;

    @ObfuscatedName("gq.w")
    public int[][] field2708;

    @ObfuscatedName("gq.v")
    public class123[] field2712;

    @ObfuscatedName("gq.h")
    public Object[] field2719;

    @ObfuscatedName("gq.p")
    public Object[][] field2718;

    @ObfuscatedName("gq.l")
    public static class147 field2724 = new class147();

    @ObfuscatedName("gq.c")
    public int field2720;

    @ObfuscatedName("gq.m")
    public boolean field2721;

    @ObfuscatedName("gq.r")
    public boolean field2722;

    @ObfuscatedName("gq.u")
    public static int field2714 = 0;

    public class183(boolean arg0, boolean arg1) {
        this.field2721 = arg0;
        this.field2722 = arg1;
    }

    @ObfuscatedName("gq.i([BI)V")
    public void method3012(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class154.field2092[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2720 = var5;
        class154 var8 = new class154(method2052(arg0));
        int var9 = var8.method2573();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2658();
        }
        int var10 = var8.method2573();
        if (var9 >= 7) {
            this.field2723 = var8.method2587();
        } else {
            this.field2723 = var8.method2575();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2716 = new int[this.field2723];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2723; var13++) {
                this.field2716[var13] = var11 += var8.method2587();
                if (this.field2716[var13] > var12) {
                    var12 = this.field2716[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2723; var14++) {
                this.field2716[var14] = var11 += var8.method2575();
                if (this.field2716[var14] > var12) {
                    var12 = this.field2716[var14];
                }
            }
        }
        this.field2711 = new int[var12 + 1];
        this.field2717 = new int[var12 + 1];
        this.field2713 = new int[var12 + 1];
        this.field2707 = new int[var12 + 1][];
        this.field2719 = new Object[var12 + 1];
        this.field2718 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2709 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2723; var15++) {
                this.field2709[this.field2716[var15]] = var8.method2658();
            }
            this.field2710 = new class123(this.field2709);
        }
        for (int var16 = 0; var16 < this.field2723; var16++) {
            this.field2711[this.field2716[var16]] = var8.method2658();
        }
        for (int var17 = 0; var17 < this.field2723; var17++) {
            this.field2717[this.field2716[var17]] = var8.method2658();
        }
        for (int var18 = 0; var18 < this.field2723; var18++) {
            this.field2713[this.field2716[var18]] = var8.method2575();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2723; var19++) {
                int var20 = this.field2716[var19];
                int var21 = this.field2713[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2707[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2707[var20][var24] = var22 += var8.method2587();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2718[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2723; var26++) {
                int var27 = this.field2716[var26];
                int var28 = this.field2713[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2707[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2707[var27][var31] = var29 += var8.method2575();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2718[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2708 = new int[var12 + 1][];
        this.field2712 = new class123[var12 + 1];
        for (int var33 = 0; var33 < this.field2723; var33++) {
            int var34 = this.field2716[var33];
            int var35 = this.field2713[var34];
            this.field2708[var34] = new int[this.field2718[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2708[var34][this.field2707[var34][var36]] = var8.method2658();
            }
            this.field2712[var34] = new class123(this.field2708[var34]);
        }
    }

    @ObfuscatedName("gq.e(IB)V")
    public void method3013(int arg0) {
    }

    @ObfuscatedName("gq.f(III)[B")
    public byte[] method3014(int arg0, int arg1) {
        return this.method3022(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("gq.k(II[II)[B")
    public byte[] method3022(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return null;
        }
        if (this.field2718[arg0][arg1] == null) {
            boolean var4 = this.method3027(arg0, arg2);
            if (!var4) {
                this.method3089(arg0);
                boolean var5 = this.method3027(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class157.method3741(this.field2718[arg0][arg1], false);
        if (this.field2722) {
            this.field2718[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("gq.a(III)Z")
    public boolean method3016(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return false;
        } else if (this.field2718[arg0][arg1] != null) {
            return true;
        } else if (this.field2719[arg0] == null) {
            this.method3089(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gq.q(II)Z")
    public boolean method3087(int arg0) {
        if (this.field2719[arg0] == null) {
            this.method3089(arg0);
            return this.field2719[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gq.w(I)Z")
    public boolean method3018() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2716.length; var2++) {
            int var3 = this.field2716[var2];
            if (this.field2719[var3] == null) {
                this.method3089(var3);
                if (this.field2719[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("gq.v(IB)[B")
    public byte[] method3019(int arg0) {
        if (this.field2718.length == 1) {
            return this.method3014(0, arg0);
        } else if (this.field2718[arg0].length == 1) {
            return this.method3014(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gq.h(III)[B")
    public byte[] method3015(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2718.length || this.field2718[arg0] == null || arg1 < 0 || arg1 >= this.field2718[arg0].length) {
            return null;
        }
        if (this.field2718[arg0][arg1] == null) {
            boolean var3 = this.method3027(arg0, (int[]) null);
            if (!var3) {
                this.method3089(arg0);
                boolean var4 = this.method3027(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class157.method3741(this.field2718[arg0][arg1], false);
    }

    @ObfuscatedName("gq.p(II)[B")
    public byte[] method3085(int arg0) {
        if (this.field2718.length == 1) {
            return this.method3015(0, arg0);
        } else if (this.field2718[arg0].length == 1) {
            return this.method3015(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("gq.l(IB)V")
    public void method3089(int arg0) {
    }

    @ObfuscatedName("gq.c(IB)[I")
    public int[] method3092(int arg0) {
        return this.field2707[arg0];
    }

    @ObfuscatedName("gq.m(II)I")
    public int method3023(int arg0) {
        return this.field2718[arg0].length;
    }

    @ObfuscatedName("gq.r(I)I")
    public int method3024() {
        return this.field2718.length;
    }

    @ObfuscatedName("gq.u(II)V")
    public void method3025(int arg0) {
        for (int var2 = 0; var2 < this.field2718[arg0].length; var2++) {
            this.field2718[arg0][var2] = null;
        }
    }

    @ObfuscatedName("gq.j(I)V")
    public void method3026() {
        for (int var1 = 0; var1 < this.field2718.length; var1++) {
            if (this.field2718[var1] != null) {
                for (int var2 = 0; var2 < this.field2718[var1].length; var2++) {
                    this.field2718[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("gq.x(I[II)Z")
    public boolean method3027(int arg0, int[] arg1) {
        if (this.field2719[arg0] == null) {
            return false;
        }
        int var3 = this.field2713[arg0];
        int[] var4 = this.field2707[arg0];
        Object[] var5 = this.field2718[arg0];
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
            var8 = class157.method3741(this.field2719[arg0], true);
            class154 var9 = new class154(var8);
            var9.method2727(arg1, 5, var9.field2094.length);
        } else {
            var8 = class157.method3741(this.field2719[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2052(var8);
        } catch (RuntimeException var42) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class154.field2092[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var20 = var13 + var17 + ",";
            int var21 = var8.length - 2;
            int var22 = -1;
            for (int var23 = 0; var23 < var21; var23++) {
                var22 = var22 >>> 8 ^ class154.field2092[(var22 ^ var8[var23]) & 0xFF];
            }
            int var24 = ~var22;
            throw class102.method101(var42, var20 + var24 + "," + this.field2711[arg0] + "," + this.field2720);
        }
        if (this.field2721) {
            this.field2719[arg0] = null;
        }
        if (var3 > 1) {
            int var27 = var10.length;
            int var43 = var27 - 1;
            int var28 = var10[var43] & 0xFF;
            int var29 = var43 - var3 * var28 * 4;
            class154 var30 = new class154(var10);
            int[] var31 = new int[var3];
            var30.field2091 = var29;
            for (int var32 = 0; var32 < var28; var32++) {
                int var33 = 0;
                for (int var34 = 0; var34 < var3; var34++) {
                    var33 += var30.method2658();
                    var31[var34] += var33;
                }
            }
            byte[][] var35 = new byte[var3][];
            for (int var36 = 0; var36 < var3; var36++) {
                var35[var36] = new byte[var31[var36]];
                var31[var36] = 0;
            }
            var30.field2091 = var29;
            int var37 = 0;
            for (int var38 = 0; var38 < var28; var38++) {
                int var39 = 0;
                for (int var40 = 0; var40 < var3; var40++) {
                    var39 += var30.method2658();
                    System.arraycopy(var10, var37, var35[var40], var31[var40], var39);
                    var31[var40] += var39;
                    var37 += var39;
                }
            }
            for (int var41 = 0; var41 < var3; var41++) {
                if (this.field2722) {
                    var5[var4[var41]] = var35[var41];
                } else {
                    var5[var4[var41]] = class157.method163(var35[var41], false);
                }
            }
        } else if (this.field2722) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class157.method163(var10, false);
        }
        return true;
    }

    @ObfuscatedName("gq.d(Ljava/lang/String;I)I")
    public int method3028(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2710.method2137(Statics.method1372(var2));
    }

    @ObfuscatedName("gq.y(ILjava/lang/String;I)I")
    public int method3029(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2712[arg0].method2137(Statics.method1372(var3));
    }

    @ObfuscatedName("gq.s(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3031(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2710.method2137(Statics.method1372(var3));
        int var6 = this.field2712[var5].method2137(Statics.method1372(var4));
        return this.method3014(var5, var6);
    }

    @ObfuscatedName("gq.t(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3011(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2710.method2137(Statics.method1372(var3));
        int var6 = this.field2712[var5].method2137(Statics.method1372(var4));
        return this.method3016(var5, var6);
    }

    @ObfuscatedName("gq.z(Ljava/lang/String;I)Z")
    public boolean method3032(String arg0) {
        int var2 = this.method3028("");
        return var2 == -1 ? this.method3011(arg0, "") : this.method3011("", arg0);
    }

    @ObfuscatedName("gq.b(Ljava/lang/String;I)V")
    public void method3033(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2710.method2137(Statics.method1372(var2));
        if (var3 >= 0) {
            this.method3013(var3);
        }
    }

    @ObfuscatedName("db.o([BI)[B")
    public static final byte[] method2052(byte[] arg0) {
        class154 var1 = new class154(arg0);
        int var2 = var1.method2573();
        int var3 = var1.method2658();
        if (var3 < 0 || !(field2714 == 0 || var3 <= field2714)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2584(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2658();
            if (var5 < 0 || field2714 != 0 && var5 > field2714) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class148.method2515(var6, var5, arg0, var3, 9);
            } else {
                field2724.method2509(var1, var6);
            }
            return var6;
        }
    }
}
