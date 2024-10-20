package deob;

@ObfuscatedName("ft")
public abstract class class168 {

    @ObfuscatedName("ft.e")
    public int field2669;

    @ObfuscatedName("ft.w")
    public int[] field2670;

    @ObfuscatedName("ft.f")
    public int[] field2671;

    @ObfuscatedName("ft.s")
    public class193 field2687;

    @ObfuscatedName("ft.p")
    public int[] field2673;

    @ObfuscatedName("ft.h")
    public int[] field2674;

    @ObfuscatedName("ft.g")
    public int[] field2675;

    @ObfuscatedName("ft.a")
    public int[][] field2676;

    @ObfuscatedName("ft.r")
    public int[][] field2677;

    @ObfuscatedName("ft.k")
    public class193[] field2678;

    @ObfuscatedName("ft.m")
    public Object[] field2679;

    @ObfuscatedName("ft.n")
    public Object[][] field2685;

    @ObfuscatedName("ft.y")
    public static class117 field2672 = new class117();

    @ObfuscatedName("ft.i")
    public int field2682;

    @ObfuscatedName("ft.j")
    public boolean field2681;

    @ObfuscatedName("ft.l")
    public boolean field2684;

    @ObfuscatedName("ft.o")
    public static int field2686 = 0;

    public class168(boolean arg0, boolean arg1) {
        this.field2681 = arg0;
        this.field2684 = arg1;
    }

    @ObfuscatedName("ft.e([BI)V")
    public void method3087(byte[] arg0) {
        this.field2682 = class120.method2797(arg0, arg0.length);
        class120 var2 = new class120(method2282(arg0));
        int var3 = var2.method2355();
        if (var3 < 5 || var3 > 7) {
            throw new RuntimeException("");
        }
        if (var3 >= 6) {
            var2.method2360();
        }
        int var4 = var2.method2355();
        if (var3 >= 7) {
            this.field2669 = var2.method2369();
        } else {
            this.field2669 = var2.method2532();
        }
        int var5 = 0;
        int var6 = -1;
        this.field2670 = new int[this.field2669];
        if (var3 >= 7) {
            for (int var7 = 0; var7 < this.field2669; var7++) {
                this.field2670[var7] = var5 += var2.method2369();
                if (this.field2670[var7] > var6) {
                    var6 = this.field2670[var7];
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field2669; var8++) {
                this.field2670[var8] = var5 += var2.method2532();
                if (this.field2670[var8] > var6) {
                    var6 = this.field2670[var8];
                }
            }
        }
        this.field2673 = new int[var6 + 1];
        this.field2674 = new int[var6 + 1];
        this.field2675 = new int[var6 + 1];
        this.field2676 = new int[var6 + 1][];
        this.field2679 = new Object[var6 + 1];
        this.field2685 = new Object[var6 + 1][];
        if (var4 != 0) {
            this.field2671 = new int[var6 + 1];
            for (int var9 = 0; var9 < this.field2669; var9++) {
                this.field2671[this.field2670[var9]] = var2.method2360();
            }
            this.field2687 = new class193(this.field2671);
        }
        for (int var10 = 0; var10 < this.field2669; var10++) {
            this.field2673[this.field2670[var10]] = var2.method2360();
        }
        for (int var11 = 0; var11 < this.field2669; var11++) {
            this.field2674[this.field2670[var11]] = var2.method2360();
        }
        for (int var12 = 0; var12 < this.field2669; var12++) {
            this.field2675[this.field2670[var12]] = var2.method2532();
        }
        if (var3 >= 7) {
            for (int var13 = 0; var13 < this.field2669; var13++) {
                int var14 = this.field2670[var13];
                int var15 = this.field2675[var14];
                int var16 = 0;
                int var17 = -1;
                this.field2676[var14] = new int[var15];
                for (int var18 = 0; var18 < var15; var18++) {
                    int var19 = this.field2676[var14][var18] = var16 += var2.method2369();
                    if (var19 > var17) {
                        var17 = var19;
                    }
                }
                this.field2685[var14] = new Object[var17 + 1];
            }
        } else {
            for (int var20 = 0; var20 < this.field2669; var20++) {
                int var21 = this.field2670[var20];
                int var22 = this.field2675[var21];
                int var23 = 0;
                int var24 = -1;
                this.field2676[var21] = new int[var22];
                for (int var25 = 0; var25 < var22; var25++) {
                    int var26 = this.field2676[var21][var25] = var23 += var2.method2532();
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
        this.field2677 = new int[var6 + 1][];
        this.field2678 = new class193[var6 + 1];
        for (int var27 = 0; var27 < this.field2669; var27++) {
            int var28 = this.field2670[var27];
            int var29 = this.field2675[var28];
            this.field2677[var28] = new int[this.field2685[var28].length];
            for (int var30 = 0; var30 < var29; var30++) {
                this.field2677[var28][this.field2676[var28][var30]] = var2.method2360();
            }
            this.field2678[var28] = new class193(this.field2677[var28]);
        }
    }

    @ObfuscatedName("ft.w(IB)V")
    public void method3022(int arg0) {
    }

    @ObfuscatedName("ft.f(IIB)[B")
    public byte[] method3048(int arg0, int arg1) {
        return this.method3038(arg0, arg1, (int[]) null);
    }

    @ObfuscatedName("ft.s(II[II)[B")
    public byte[] method3038(int arg0, int arg1, int[] arg2) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return null;
        }
        if (this.field2685[arg0][arg1] == null) {
            boolean var4 = this.method3037(arg0, arg2);
            if (!var4) {
                this.method3031(arg0);
                boolean var5 = this.method3037(arg0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = Statics.method2054(this.field2685[arg0][arg1], false);
        if (this.field2684) {
            this.field2685[arg0][arg1] = null;
        }
        return var6;
    }

    @ObfuscatedName("ft.p(III)Z")
    public boolean method3032(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return false;
        } else if (this.field2685[arg0][arg1] != null) {
            return true;
        } else if (this.field2679[arg0] == null) {
            this.method3031(arg0);
            return this.field2679[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ft.h(II)Z")
    public boolean method3026(int arg0) {
        if (this.field2679[arg0] == null) {
            this.method3031(arg0);
            return this.field2679[arg0] != null;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ft.g(I)Z")
    public boolean method3027() {
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2670.length; var2++) {
            int var3 = this.field2670[var2];
            if (this.field2679[var3] == null) {
                this.method3031(var3);
                if (this.field2679[var3] == null) {
                    var1 = false;
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("ft.a(II)[B")
    public byte[] method3028(int arg0) {
        if (this.field2685.length == 1) {
            return this.method3048(0, arg0);
        } else if (this.field2685[arg0].length == 1) {
            return this.method3048(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ft.r(III)[B")
    public byte[] method3029(int arg0, int arg1) {
        if (arg0 < 0 || arg0 >= this.field2685.length || this.field2685[arg0] == null || arg1 < 0 || arg1 >= this.field2685[arg0].length) {
            return null;
        }
        if (this.field2685[arg0][arg1] == null) {
            boolean var3 = this.method3037(arg0, (int[]) null);
            if (!var3) {
                this.method3031(arg0);
                boolean var4 = this.method3037(arg0, (int[]) null);
                if (!var4) {
                    return null;
                }
            }
        }
        return Statics.method2054(this.field2685[arg0][arg1], false);
    }

    @ObfuscatedName("ft.k(IB)[B")
    public byte[] method3030(int arg0) {
        if (this.field2685.length == 1) {
            return this.method3029(0, arg0);
        } else if (this.field2685[arg0].length == 1) {
            return this.method3029(arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @ObfuscatedName("ft.m(IB)V")
    public void method3031(int arg0) {
    }

    @ObfuscatedName("ft.n(II)[I")
    public int[] method3033(int arg0) {
        return this.field2676[arg0];
    }

    @ObfuscatedName("ft.y(IB)I")
    public int method3075(int arg0) {
        return this.field2685[arg0].length;
    }

    @ObfuscatedName("ft.i(I)I")
    public int method3025() {
        return this.field2685.length;
    }

    @ObfuscatedName("ft.j(IB)V")
    public void method3035(int arg0) {
        for (int var2 = 0; var2 < this.field2685[arg0].length; var2++) {
            this.field2685[arg0][var2] = null;
        }
    }

    @ObfuscatedName("ft.l(I)V")
    public void method3036() {
        for (int var1 = 0; var1 < this.field2685.length; var1++) {
            if (this.field2685[var1] != null) {
                for (int var2 = 0; var2 < this.field2685[var1].length; var2++) {
                    this.field2685[var1][var2] = null;
                }
            }
        }
    }

    @ObfuscatedName("ft.o(I[II)Z")
    public boolean method3037(int arg0, int[] arg1) {
        if (this.field2679[arg0] == null) {
            return false;
        }
        int var3 = this.field2675[arg0];
        int[] var4 = this.field2676[arg0];
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
            var8 = Statics.method2054(this.field2679[arg0], true);
            class120 var9 = new class120(var8);
            var9.method2374(arg1, 5, var9.field1981.length);
        } else {
            var8 = Statics.method2054(this.field2679[arg0], false);
        }
        byte[] var10;
        try {
            var10 = method2282(var8);
        } catch (RuntimeException var27) {
            throw class149.method2160(var27, "" + (arg1 != null) + "," + arg0 + "," + var8.length + "," + class120.method2797(var8, var8.length) + "," + class120.method2797(var8, var8.length - 2) + "," + this.field2673[arg0] + "," + this.field2682);
        }
        if (this.field2681) {
            this.field2679[arg0] = null;
        }
        if (var3 > 1) {
            int var12 = var10.length;
            int var28 = var12 - 1;
            int var13 = var10[var28] & 0xFF;
            int var14 = var28 - var3 * var13 * 4;
            class120 var15 = new class120(var10);
            int[] var16 = new int[var3];
            var15.field1977 = var14;
            for (int var17 = 0; var17 < var13; var17++) {
                int var18 = 0;
                for (int var19 = 0; var19 < var3; var19++) {
                    var18 += var15.method2360();
                    var16[var19] += var18;
                }
            }
            byte[][] var20 = new byte[var3][];
            for (int var21 = 0; var21 < var3; var21++) {
                var20[var21] = new byte[var16[var21]];
                var16[var21] = 0;
            }
            var15.field1977 = var14;
            int var22 = 0;
            for (int var23 = 0; var23 < var13; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var3; var25++) {
                    var24 += var15.method2360();
                    System.arraycopy(var10, var22, var20[var25], var16[var25], var24);
                    var16[var25] += var24;
                    var22 += var24;
                }
            }
            for (int var26 = 0; var26 < var3; var26++) {
                if (this.field2684) {
                    var5[var4[var26]] = var20[var26];
                } else {
                    var5[var4[var26]] = Statics.method712(var20[var26], false);
                }
            }
        } else if (this.field2684) {
            var5[var4[0]] = var10;
        } else {
            var5[var4[0]] = Statics.method712(var10, false);
        }
        return true;
    }

    @ObfuscatedName("ft.c(Ljava/lang/String;I)I")
    public int method3023(String arg0) {
        String var2 = arg0.toLowerCase();
        return this.field2687.method3468(class164.method641(var2));
    }

    @ObfuscatedName("ft.x(ILjava/lang/String;B)I")
    public int method3039(int arg0, String arg1) {
        String var3 = arg1.toLowerCase();
        return this.field2678[arg0].method3468(class164.method641(var3));
    }

    @ObfuscatedName("ft.b(Ljava/lang/String;Ljava/lang/String;I)[B")
    public byte[] method3073(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2687.method3468(class164.method641(var3));
        int var6 = this.field2678[var5].method3468(class164.method641(var4));
        return this.method3048(var5, var6);
    }

    @ObfuscatedName("ft.q(Ljava/lang/String;Ljava/lang/String;I)Z")
    public boolean method3041(String arg0, String arg1) {
        String var3 = arg0.toLowerCase();
        String var4 = arg1.toLowerCase();
        int var5 = this.field2687.method3468(class164.method641(var3));
        int var6 = this.field2678[var5].method3468(class164.method641(var4));
        return this.method3032(var5, var6);
    }

    @ObfuscatedName("ft.u(Ljava/lang/String;I)Z")
    public boolean method3067(String arg0) {
        int var2 = this.method3023("");
        return var2 == -1 ? this.method3041(arg0, "") : this.method3041("", arg0);
    }

    @ObfuscatedName("ft.t(Ljava/lang/String;B)V")
    public void method3043(String arg0) {
        String var2 = arg0.toLowerCase();
        int var3 = this.field2687.method3468(class164.method641(var2));
        if (var3 >= 0) {
            this.method3022(var3);
        }
    }

    @ObfuscatedName("du.d([BI)[B")
    public static final byte[] method2282(byte[] arg0) {
        class120 var1 = new class120(arg0);
        int var2 = var1.method2355();
        int var3 = var1.method2360();
        if (var3 < 0 || !(field2686 == 0 || var3 <= field2686)) {
            throw new RuntimeException();
        } else if (var2 == 0) {
            byte[] var4 = new byte[var3];
            var1.method2541(var4, 0, var3);
            return var4;
        } else {
            int var5 = var1.method2360();
            if (var5 < 0 || field2686 != 0 && var5 > field2686) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var2 == 1) {
                class118.method2309(var6, var5, arg0, var3, 9);
            } else {
                field2672.method2307(var1, var6);
            }
            return var6;
        }
    }
}
