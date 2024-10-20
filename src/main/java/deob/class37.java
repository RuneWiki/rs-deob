package deob;

@ObfuscatedName("ag")
public class class37 extends class195 {

    @ObfuscatedName("ag.i")
    public static class184 field827 = new class184(64);

    @ObfuscatedName("ag.e")
    public static class184 field850 = new class184(50);

    @ObfuscatedName("ag.h")
    public int field828;

    @ObfuscatedName("ag.q")
    public String field861 = "null";

    @ObfuscatedName("ag.l")
    public int field830 = 1;

    @ObfuscatedName("ag.c")
    public int[] field831;

    @ObfuscatedName("ag.f")
    public int[] field832;

    @ObfuscatedName("ag.s")
    public int field855 = -1;

    @ObfuscatedName("ag.m")
    public int field834 = -1;

    @ObfuscatedName("ag.y")
    public int field835 = -1;

    @ObfuscatedName("ag.b")
    public int field845 = -1;

    @ObfuscatedName("ag.v")
    public int field837 = -1;

    @ObfuscatedName("ag.z")
    public int field838 = -1;

    @ObfuscatedName("ag.u")
    public int field839 = -1;

    @ObfuscatedName("ag.g")
    public short[] field840;

    @ObfuscatedName("ag.k")
    public short[] field841;

    @ObfuscatedName("ag.o")
    public short[] field842;

    @ObfuscatedName("ag.a")
    public short[] field826;

    @ObfuscatedName("ag.p")
    public String[] field844 = new String[5];

    @ObfuscatedName("ag.t")
    public boolean field833 = true;

    @ObfuscatedName("ag.x")
    public int field846 = -1;

    @ObfuscatedName("ag.d")
    public int field864 = 128;

    @ObfuscatedName("ag.j")
    public int field843 = 128;

    @ObfuscatedName("ag.r")
    public boolean field849 = false;

    @ObfuscatedName("ag.at")
    public int field825 = 0;

    @ObfuscatedName("ag.av")
    public int field851 = 0;

    @ObfuscatedName("ag.ar")
    public int field852 = -1;

    @ObfuscatedName("ag.aq")
    public int field853 = 32;

    @ObfuscatedName("ag.as")
    public int[] field854;

    @ObfuscatedName("ag.ad")
    public int field847 = -1;

    @ObfuscatedName("ag.ap")
    public int field856 = -1;

    @ObfuscatedName("ag.an")
    public boolean field857 = true;

    @ObfuscatedName("ag.au")
    public boolean field858 = true;

    @ObfuscatedName("ag.aw")
    public boolean field859 = false;

    @ObfuscatedName("ag.ag")
    public int field860 = 30;

    @ObfuscatedName("e.n(Lfd;Lfd;B)V")
    public static void method31(class158 arg0, class158 arg1) {
        Statics.field2814 = arg0;
        Statics.field829 = arg1;
    }

    @ObfuscatedName("cj.w(II)Lag;")
    public static class37 method2077(int arg0) {
        class37 var1 = (class37) field827.method3315((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2814.method2859(9, arg0);
        class37 var3 = new class37();
        var3.field828 = arg0;
        if (var2 != null) {
            var3.method643(new class111(var2));
        }
        var3.method660();
        field827.method3317(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.i(I)V")
    public void method660() {
    }

    @ObfuscatedName("ag.e(Ldo;I)V")
    public void method643(class111 arg0) {
        while (true) {
            int var2 = arg0.method2155();
            if (var2 == 0) {
                return;
            }
            this.method656(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldo;IB)V")
    public void method656(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2155();
            this.field831 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field831[var4] = arg0.method2157();
            }
        } else if (arg1 == 2) {
            this.field861 = arg0.method2163();
        } else if (arg1 == 12) {
            this.field830 = arg0.method2155();
        } else if (arg1 == 13) {
            this.field855 = arg0.method2157();
        } else if (arg1 == 14) {
            this.field845 = arg0.method2157();
        } else if (arg1 == 15) {
            this.field834 = arg0.method2157();
        } else if (arg1 == 16) {
            this.field835 = arg0.method2157();
        } else if (arg1 == 17) {
            this.field845 = arg0.method2157();
            this.field837 = arg0.method2157();
            this.field838 = arg0.method2157();
            this.field839 = arg0.method2157();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field844[arg1 - 30] = arg0.method2163();
            if (this.field844[arg1 - 30].equalsIgnoreCase(class148.field2204)) {
                this.field844[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2155();
            this.field840 = new short[var5];
            this.field841 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field840[var6] = (short) arg0.method2157();
                this.field841[var6] = (short) arg0.method2157();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2155();
            this.field842 = new short[var7];
            this.field826 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field842[var8] = (short) arg0.method2157();
                this.field826[var8] = (short) arg0.method2157();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2155();
            this.field832 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field832[var10] = arg0.method2157();
            }
        } else if (arg1 == 93) {
            this.field833 = false;
        } else if (arg1 == 95) {
            this.field846 = arg0.method2157();
        } else if (arg1 == 97) {
            this.field864 = arg0.method2157();
        } else if (arg1 == 98) {
            this.field843 = arg0.method2157();
        } else if (arg1 == 99) {
            this.field849 = true;
        } else if (arg1 == 100) {
            this.field825 = arg0.method2173();
        } else if (arg1 == 101) {
            this.field851 = arg0.method2173();
        } else if (arg1 == 102) {
            this.field852 = arg0.method2157();
        } else if (arg1 == 103) {
            this.field853 = arg0.method2157();
        } else if (arg1 == 106) {
            this.field847 = arg0.method2157();
            if (this.field847 == 65535) {
                this.field847 = -1;
            }
            this.field856 = arg0.method2157();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
            int var11 = arg0.method2155();
            this.field854 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field854[var12] = arg0.method2157();
                if (this.field854[var12] == 65535) {
                    this.field854[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field857 = false;
        } else if (arg1 == 109) {
            this.field858 = false;
        } else if (arg1 == 111) {
            this.field859 = true;
        } else if (arg1 == 112) {
            this.field860 = arg0.method2155();
        }
    }

    @ObfuscatedName("ag.q(Lac;ILac;II)Lcw;")
    public final class100 method664(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field854 != null) {
            class37 var5 = this.method671();
            return var5 == null ? null : var5.method664(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field850.method3315((long) this.field828);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field831.length; var8++) {
                if (!Statics.field829.method2861(this.field831[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field831.length];
            for (int var10 = 0; var10 < this.field831.length; var10++) {
                var9[var10] = class95.method1905(Statics.field829, this.field831[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field840 != null) {
                for (int var12 = 0; var12 < this.field840.length; var12++) {
                    var11.method1919(this.field840[var12], this.field841[var12]);
                }
            }
            if (this.field842 != null) {
                for (int var13 = 0; var13 < this.field842.length; var13++) {
                    var11.method1920(this.field842[var13], this.field826[var13]);
                }
            }
            var6 = var11.method1982(this.field825 + 64, this.field851 * 5 + 850, -30, -50, -30);
            field850.method3317(var6, (long) this.field828);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method743(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method741(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1998(true);
        } else {
            var14 = arg2.method741(var6, arg3);
        }
        if (this.field864 != 128 || this.field843 != 128) {
            var14.method2012(this.field864, this.field843, this.field864);
        }
        return var14;
    }

    @ObfuscatedName("ag.l(S)Lce;")
    public final class95 method647() {
        if (this.field854 != null) {
            class37 var1 = this.method671();
            return var1 == null ? null : var1.method647();
        } else if (this.field832 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field832.length; var3++) {
                if (!Statics.field829.method2861(this.field832[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field832.length];
            for (int var5 = 0; var5 < this.field832.length; var5++) {
                var4[var5] = class95.method1905(Statics.field829, this.field832[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field840 != null) {
                for (int var7 = 0; var7 < this.field840.length; var7++) {
                    var6.method1919(this.field840[var7], this.field841[var7]);
                }
            }
            if (this.field842 != null) {
                for (int var8 = 0; var8 < this.field842.length; var8++) {
                    var6.method1920(this.field842[var8], this.field826[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ag.c(I)Lag;")
    public final class37 method671() {
        int var1 = -1;
        if (this.field847 != -1) {
            var1 = class167.method1895(this.field847);
        } else if (this.field856 != -1) {
            var1 = class167.field2805[this.field856];
        }
        return var1 < 0 || var1 >= this.field854.length || this.field854[var1] == -1 ? null : method2077(this.field854[var1]);
    }

    @ObfuscatedName("ag.f(B)Z")
    public boolean method648() {
        if (this.field854 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field847 != -1) {
            var1 = class167.method1895(this.field847);
        } else if (this.field856 != -1) {
            var1 = class167.field2805[this.field856];
        }
        return var1 >= 0 && var1 < this.field854.length && this.field854[var1] != -1;
    }
}
