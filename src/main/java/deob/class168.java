package deob;

@ObfuscatedName("fl")
public abstract class class168 {

    @ObfuscatedName("fl.f")
    public int field2683;

    @ObfuscatedName("fl.u")
    public int[] field2674;

    @ObfuscatedName("fl.x")
    public int[] field2668;

    @ObfuscatedName("fl.b")
    public class193 field2666;

    @ObfuscatedName("fl.l")
    public int[] field2670;

    @ObfuscatedName("fl.d")
    public int[] field2672;

    @ObfuscatedName("fl.n")
    public int[] field2671;

    @ObfuscatedName("fl.m")
    public int[][] field2673;

    @ObfuscatedName("fl.g")
    public int[][] field2669;

    @ObfuscatedName("fl.s")
    public class193[] field2675;

    @ObfuscatedName("fl.r")
    public Object[] field2667;

    @ObfuscatedName("fl.k")
    public Object[][] field2677;

    @ObfuscatedName("fl.o")
    public static class117 field2678 = new class117();

    @ObfuscatedName("fl.q")
    public int field2679;

    @ObfuscatedName("fl.p")
    public boolean field2680;

    @ObfuscatedName("fl.h")
    public boolean field2681;

    @ObfuscatedName("fl.e")
    public static int field2682 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2680 = arg0;
        this.field2681 = arg1;
    }

    @ObfuscatedName("fl.f([BB)V")
    public void method3126(byte[] arg0) {
        int var2 = arg0.length;
        int var3 = -1;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = var3 >>> 8 ^ class120.field2000[(var3 ^ arg0[var4]) & 0xFF];
        }
        int var5 = ~var3;
        this.field2679 = var5;
        class120 var8 = new class120(Statics.method3502(arg0));
        int var9 = var8.method2385();
        if (var9 < 5 || var9 > 7) {
            throw new RuntimeException("");
        }
        if (var9 >= 6) {
            var8.method2527();
        }
        int var10 = var8.method2385();
        if (var9 >= 7) {
            this.field2683 = var8.method2559();
        } else {
            this.field2683 = var8.method2387();
        }
        int var11 = 0;
        int var12 = -1;
        this.field2674 = new int[this.field2683];
        if (var9 >= 7) {
            for (int var13 = 0; var13 < this.field2683; var13++) {
                this.field2674[var13] = var11 += var8.method2559();
                if (this.field2674[var13] > var12) {
                    var12 = this.field2674[var13];
                }
            }
        } else {
            for (int var14 = 0; var14 < this.field2683; var14++) {
                this.field2674[var14] = var11 += var8.method2387();
                if (this.field2674[var14] > var12) {
                    var12 = this.field2674[var14];
                }
            }
        }
        this.field2670 = new int[var12 + 1];
        this.field2672 = new int[var12 + 1];
        this.field2671 = new int[var12 + 1];
        this.field2673 = new int[var12 + 1][];
        this.field2667 = new Object[var12 + 1];
        this.field2677 = new Object[var12 + 1][];
        if (var10 != 0) {
            this.field2668 = new int[var12 + 1];
            for (int var15 = 0; var15 < this.field2683; var15++) {
                this.field2668[this.field2674[var15]] = var8.method2527();
            }
            this.field2666 = new class193(this.field2668);
        }
        for (int var16 = 0; var16 < this.field2683; var16++) {
            this.field2670[this.field2674[var16]] = var8.method2527();
        }
        for (int var17 = 0; var17 < this.field2683; var17++) {
            this.field2672[this.field2674[var17]] = var8.method2527();
        }
        for (int var18 = 0; var18 < this.field2683; var18++) {
            this.field2671[this.field2674[var18]] = var8.method2387();
        }
        if (var9 >= 7) {
            for (int var19 = 0; var19 < this.field2683; var19++) {
                int var20 = this.field2674[var19];
                int var21 = this.field2671[var20];
                int var22 = 0;
                int var23 = -1;
                this.field2673[var20] = new int[var21];
                for (int var24 = 0; var24 < var21; var24++) {
                    int var25 = this.field2673[var20][var24] = var22 += var8.method2559();
                    if (var25 > var23) {
                        var23 = var25;
                    }
                }
                this.field2677[var20] = new Object[var23 + 1];
            }
        } else {
            for (int var26 = 0; var26 < this.field2683; var26++) {
                int var27 = this.field2674[var26];
                int var28 = this.field2671[var27];
                int var29 = 0;
                int var30 = -1;
                this.field2673[var27] = new int[var28];
                for (int var31 = 0; var31 < var28; var31++) {
                    int var32 = this.field2673[var27][var31] = var29 += var8.method2387();
                    if (var32 > var30) {
                        var30 = var32;
                    }
                }
                this.field2677[var27] = new Object[var30 + 1];
            }
        }
        if (var10 == 0) {
            return;
        }
        this.field2669 = new int[var12 + 1][];
        this.field2675 = new class193[var12 + 1];
        for (int var33 = 0; var33 < this.field2683; var33++) {
            int var34 = this.field2674[var33];
            int var35 = this.field2671[var34];
            this.field2669[var34] = new int[this.field2677[var34].length];
            for (int var36 = 0; var36 < var35; var36++) {
                this.field2669[var34][this.field2673[var34][var36]] = var8.method2527();
            }
            this.field2675[var34] = new class193(this.field2669[var34]);
        }
    }

    @ObfuscatedName("fl.u(II)V")
    public void method3060(int arg0) {
    }

    @ObfuscatedName("fl.x(III)[B")
    public byte[] method3061(int arg0, int arg1) {
        return this.method3062(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("fl.b(II[IB)[B")
    public byte[] method3062(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2677.length || this.field2677[arg0] == null || arg1 < 0 || arg1 >= this.field2677[arg0].length) {
            return null;
        }
        if (this.field2677[arg0][arg1] == null) {
            boolean var4 = this.method3074(arg0, arg2);
            if (!var4) {
                this.method3098(arg0);
                boolean var5 = this.method3074(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class126.method751(this.field2677[arg0][arg1], false);
        if (this.field2681) {
            this.field2677[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("fl.l(IIB)Z")
    public boolean method3063(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2677.length || this.field2677[arg0] == null || arg1 < 0 || arg1 >= this.field2677[arg0].length) {
            return false;
        } else if (this.field2677[arg0][arg1] != null) {
            return true;
        } else if (this.field2667[arg0] == null) {
            this.method3098(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fl.d(II)Z")
    public boolean method3064(int arg0) {
        if (this.field2667[arg0] == null) {
            this.method3098(arg0);
            return this.field2667[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fl.n(I)Z")
    public boolean method3065() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2674.length; var2++) {
            int var3 = this.field2674[var2];
            if (this.field2667[var3] == null) {
                this.method3098(var3);
                if (this.field2667[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("fl.m(II)[B")
    public byte[] method3066(int arg0) {
        if (this.field2677.length == 1) {
            return this.method3061(0, arg0);
        } else if (this.field2677[arg0].length == 1) {
            return this.method3061(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fl.g(IIB)[B")
    public byte[] method3070(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2677.length || this.field2677[arg0] == null || arg1 < 0 || arg1 >= this.field2677[arg0].length) {
            return null;
        }
        if (this.field2677[arg0][arg1] == null) {
            boolean var3 = this.method3074(arg0, (int[]) null);
            if (!var3) {
                this.method3098(arg0);
                boolean var4 = this.method3074(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return class126.method751(this.field2677[arg0][arg1], false);
    }

    @ObfuscatedName("fl.s(II)[B")
    public byte[] method3121(int arg0) {
        if (this.field2677.length == 1) {
            return this.method3070(0, arg0);
        } else if (this.field2677[arg0].length == 1) {
            return this.method3070(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("fl.r(II)V")
    public void method3098(int arg0) {
    }

    @ObfuscatedName("fl.k(II)[I")
    public int[] method3117(int arg0) {
        return this.field2673[arg0];
    }

    @ObfuscatedName("fl.o(IB)I")
    public int method3096(int arg0) {
        return this.field2677[arg0].length;
    }

    @ObfuscatedName("fl.q(I)I")
    public int method3067() {
        return this.field2677.length;
    }

    @ObfuscatedName("fl.p(II)V")
    public void method3072(int arg0) {
        for (int var2 = 0; var2 < this.field2677[arg0].length; var2++) {
            this.field2677[arg0][var2] = null;
        }
    }

    @ObfuscatedName("fl.h(I)V")
    public void method3073() {
        for (int var1 = 0; var1 < this.field2677.length; var1++) {
            if (this.field2677[var1] != null) {
                for (int var2 = 0; var2 < this.field2677[var1].length; var2++) {
                    this.field2677[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("fl.e(I[II)Z")
    public boolean method3074(int arg0, int[] arg1) {
        if (this.field2667[arg0] == null) {
            return false;
        }
        int var3 = this.field2671[arg0];
        int[] var4 = this.field2673[arg0];
        Object[] var5 = this.field2677[arg0];
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
            var8 = class126.method751(this.field2667[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2404(arg1, 5, var9.field2001.length);
        } else {
            var8 = class126.method751(this.field2667[arg0], false);
        }
        byte[] var10;
        try {
            var10 = Statics.method3502(var8);
        } catch (RuntimeException var43) {
            String var13 = "" + (arg1 != null) + "," + arg0 + "," + var8.length + ",";
            int var14 = var8.length;
            int var15 = -1;
            for (int var16 = 0; var16 < var14; var16++) {
                var15 = var15 >>> 8 ^ class120.field2000[(var15 ^ var8[var16]) & 0xFF];
            }
            int var17 = ~var15;
            String var21 = var13 + var17 + ",";
            int var22 = var8.length - 2;
            int var23 = -1;
            for (int var24 = 0; var24 < var22; var24++) {
                var23 = var23 >>> 8 ^ class120.field2000[(var23 ^ var8[var24]) & 0xFF];
            }
            int var25 = ~var23;
            throw class149.method1615(var43, var21 + var25 + "," + this.field2670[arg0] + "," + this.field2679);
        }
        if (this.field2680) {
            this.field2667[arg0] = null;
        }
        if (var3 > 1) {
            int var28 = var10.length;
            int var44 = var28 - 1;
            int var29 = var10[var44] & 0xFF;
            int var30 = var44 - var3 * var29 * 4;
            class120 var31 = new class120(var10);
            int[] var32 = new int[var3];
            var31.field1999 = var30;
            for (int var33 = 0; var33 < var29; var33++) {
                int var34 = 0;
                for (int var35 = 0; var35 < var3; var35++) {
                    var34 += var31.method2527();
                    var32[var35] += var34;
                }
            }
            byte[][] var36 = new byte[var3][];
            for (int var37 = 0; var37 < var3; var37++) {
                var36[var37] = new byte[var32[var37]];
                var32[var37] = 0;
            }
            var31.field1999 = var30;
            int var38 = 0;
            for (int var39 = 0; var39 < var29; var39++) {
                int var40 = 0;
                for (int var41 = 0; var41 < var3; var41++) {
                    var40 += var31.method2527();
                    System.arraycopy(var10, var38, var36[var41], var32[var41], var40);
                    var32[var41] += var40;
                    var38 += var40;
                }
            }
            for (int var42 = 0; var42 < var3; var42++) {
                if (this.field2681) {
                    var5[var4[var42]] = var36[var42];
                } else {
                    var5[var4[var42]] = class126.method995(var36[var42], false);
                }
            }
        } else if (this.field2681) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = class126.method995(var10, false);
        }
        return true;
    }

    @ObfuscatedName("fl.t(Ljava/lang/String;I)I")
    public int method3075(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2666.method3517(class164.method3046(var2));
    }

    @ObfuscatedName("fl.w(ILjava/lang/String;S)I")
    public int method3076(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2675[arg0].method3517(class164.method3046(var3));
    }

    @ObfuscatedName("fl.v(Ljava/lang/String;Ljava/lang/String;B)[B")
    public byte[] method3077(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3517(class164.method3046(var3));
        int var6 = this.field2675[var5].method3517(class164.method3046(var4));
        return this.method3061(var5, var6);
    }

    @ObfuscatedName("fl.y(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3123(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2666.method3517(class164.method3046(var3));
        int var6 = this.field2675[var5].method3517(class164.method3046(var4));
        return this.method3063(var5, var6);
    }

    @ObfuscatedName("fl.c(Ljava/lang/String;B)Z")
    public boolean method3099(String arg0) {
        int var2 = this.method3075("");
        return var2 == -1 ? this.method3123(arg0, "") : this.method3123("", arg0);
    }

    @ObfuscatedName("fl.i(Ljava/lang/String;I)V")
    public void method3079(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2666.method3517(class164.method3046(var2));
        if (var3 >= 0) {
            this.method3060(var3);
        }
    }
}
