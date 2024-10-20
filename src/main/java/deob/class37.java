package deob;

@ObfuscatedName("af")
public class class37 extends class195 {

    @ObfuscatedName("af.e")
    public static class184 field836 = new class184(64);

    @ObfuscatedName("af.f")
    public static class184 field837 = new class184(50);

    @ObfuscatedName("af.w")
    public int field852;

    @ObfuscatedName("af.t")
    public String field839 = "null";

    @ObfuscatedName("af.s")
    public int field840 = 1;

    @ObfuscatedName("af.c")
    public int[] field841;

    @ObfuscatedName("af.d")
    public int[] field863;

    @ObfuscatedName("af.v")
    public int field843 = -1;

    @ObfuscatedName("af.m")
    public int field844 = -1;

    @ObfuscatedName("af.h")
    public int field845 = -1;

    @ObfuscatedName("af.n")
    public int field846 = -1;

    @ObfuscatedName("af.x")
    public int field847 = -1;

    @ObfuscatedName("af.o")
    public int field867 = -1;

    @ObfuscatedName("af.r")
    public int field834 = -1;

    @ObfuscatedName("af.y")
    public short[] field868;

    @ObfuscatedName("af.i")
    public short[] field851;

    @ObfuscatedName("af.q")
    public short[] field873;

    @ObfuscatedName("af.g")
    public short[] field858;

    @ObfuscatedName("af.l")
    public String[] field854 = new String[5];

    @ObfuscatedName("af.u")
    public boolean field855 = true;

    @ObfuscatedName("af.j")
    public int field848 = -1;

    @ObfuscatedName("af.z")
    public int field871 = 128;

    @ObfuscatedName("af.b")
    public int field850 = 128;

    @ObfuscatedName("af.a")
    public boolean field859 = false;

    @ObfuscatedName("af.ag")
    public int field860 = 0;

    @ObfuscatedName("af.am")
    public int field849 = 0;

    @ObfuscatedName("af.aa")
    public int field862 = -1;

    @ObfuscatedName("af.az")
    public int field842 = 32;

    @ObfuscatedName("af.aq")
    public int[] field864;

    @ObfuscatedName("af.ak")
    public int field865 = -1;

    @ObfuscatedName("af.ar")
    public int field866 = -1;

    @ObfuscatedName("af.al")
    public boolean field872 = true;

    @ObfuscatedName("af.au")
    public boolean field857 = true;

    @ObfuscatedName("af.ao")
    public boolean field869 = false;

    @ObfuscatedName("af.af")
    public int field870 = 30;

    @ObfuscatedName("x.p(II)Laf;")
    public static class37 method143(int arg0) {
        class37 var1 = (class37) field836.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field838.method2896(9, arg0);
        class37 var3 = new class37();
        var3.field852 = arg0;
        if (var2 != null) {
            var3.method665(new class111(var2));
        }
        var3.method658();
        field836.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.k(I)V")
    public void method658() {
    }

    @ObfuscatedName("af.e(Lde;I)V")
    public void method665(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method677(arg0, var2);
        }
    }

    @ObfuscatedName("af.f(Lde;IS)V")
    public void method677(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2314();
            this.field841 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field841[var4] = arg0.method2177();
            }
        } else if (arg1 == 2) {
            this.field839 = arg0.method2265();
        } else if (arg1 == 12) {
            this.field840 = arg0.method2314();
        } else if (arg1 == 13) {
            this.field843 = arg0.method2177();
        } else if (arg1 == 14) {
            this.field846 = arg0.method2177();
        } else if (arg1 == 15) {
            this.field844 = arg0.method2177();
        } else if (arg1 == 16) {
            this.field845 = arg0.method2177();
        } else if (arg1 == 17) {
            this.field846 = arg0.method2177();
            this.field847 = arg0.method2177();
            this.field867 = arg0.method2177();
            this.field834 = arg0.method2177();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field854[arg1 - 30] = arg0.method2265();
            if (this.field854[arg1 - 30].equalsIgnoreCase(class148.field2215)) {
                this.field854[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2314();
            this.field868 = new short[var5];
            this.field851 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field868[var6] = (short) arg0.method2177();
                this.field851[var6] = (short) arg0.method2177();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2314();
            this.field873 = new short[var7];
            this.field858 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field873[var8] = (short) arg0.method2177();
                this.field858[var8] = (short) arg0.method2177();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2314();
            this.field863 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field863[var10] = arg0.method2177();
            }
        } else if (arg1 == 93) {
            this.field855 = false;
        } else if (arg1 == 95) {
            this.field848 = arg0.method2177();
        } else if (arg1 == 97) {
            this.field871 = arg0.method2177();
        } else if (arg1 == 98) {
            this.field850 = arg0.method2177();
        } else if (arg1 == 99) {
            this.field859 = true;
        } else if (arg1 == 100) {
            this.field860 = arg0.method2176();
        } else if (arg1 == 101) {
            this.field849 = arg0.method2176() * 5;
        } else if (arg1 == 102) {
            this.field862 = arg0.method2177();
        } else if (arg1 == 103) {
            this.field842 = arg0.method2177();
        } else if (arg1 == 106) {
            this.field865 = arg0.method2177();
            if (this.field865 == 65535) {
                this.field865 = -1;
            }
            this.field866 = arg0.method2177();
            if (this.field866 == 65535) {
                this.field866 = -1;
            }
            int var11 = arg0.method2314();
            this.field864 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field864[var12] = arg0.method2177();
                if (this.field864[var12] == 65535) {
                    this.field864[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field872 = false;
        } else if (arg1 == 109) {
            this.field857 = false;
        } else if (arg1 == 111) {
            this.field869 = true;
        } else if (arg1 == 112) {
            this.field870 = arg0.method2314();
        }
    }

    @ObfuscatedName("af.w(Law;ILaw;II)Lcm;")
    public final class100 method660(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field864 != null) {
            class37 var5 = this.method662();
            return var5 == null ? null : var5.method660(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field837.method3371((long) this.field852);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field841.length; var8++) {
                if (!Statics.field835.method2898(this.field841[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field841.length];
            for (int var10 = 0; var10 < this.field841.length; var10++) {
                var9[var10] = class95.method1916(Statics.field835, this.field841[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field868 != null) {
                for (int var12 = 0; var12 < this.field868.length; var12++) {
                    var11.method1929(this.field868[var12], this.field851[var12]);
                }
            }
            if (this.field873 != null) {
                for (int var13 = 0; var13 < this.field873.length; var13++) {
                    var11.method1930(this.field873[var13], this.field858[var13]);
                }
            }
            var6 = var11.method1937(this.field860 + 64, this.field849 + 850, -30, -50, -30);
            field837.method3370(var6, (long) this.field852);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method745(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method768(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2024(true);
        } else {
            var14 = arg2.method768(var6, arg3);
        }
        if (this.field871 != 128 || this.field850 != 128) {
            var14.method2051(this.field871, this.field850, this.field871);
        }
        return var14;
    }

    @ObfuscatedName("af.t(I)Lcv;")
    public final class95 method661() {
        if (this.field864 != null) {
            class37 var1 = this.method662();
            return var1 == null ? null : var1.method661();
        } else if (this.field863 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field863.length; var3++) {
                if (!Statics.field835.method2898(this.field863[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field863.length];
            for (int var5 = 0; var5 < this.field863.length; var5++) {
                var4[var5] = class95.method1916(Statics.field835, this.field863[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field868 != null) {
                for (int var7 = 0; var7 < this.field868.length; var7++) {
                    var6.method1929(this.field868[var7], this.field851[var7]);
                }
            }
            if (this.field873 != null) {
                for (int var8 = 0; var8 < this.field873.length; var8++) {
                    var6.method1930(this.field873[var8], this.field858[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("af.s(B)Laf;")
    public final class37 method662() {
        int var1 = -1;
        if (this.field865 != -1) {
            var1 = class167.method2494(this.field865);
        } else if (this.field866 != -1) {
            var1 = class167.field2804[this.field866];
        }
        return var1 < 0 || var1 >= this.field864.length || this.field864[var1] == -1 ? null : method143(this.field864[var1]);
    }

    @ObfuscatedName("af.c(I)Z")
    public boolean method663() {
        if (this.field864 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field865 != -1) {
            var1 = class167.method2494(this.field865);
        } else if (this.field866 != -1) {
            var1 = class167.field2804[this.field866];
        }
        return var1 >= 0 && var1 < this.field864.length && this.field864[var1] != -1;
    }

    @ObfuscatedName("aq.d(S)V")
    public static void method619() {
        field836.method3374();
        field837.method3374();
    }
}
