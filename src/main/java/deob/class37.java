package deob;

@ObfuscatedName("aa")
public class class37 extends class195 {

    @ObfuscatedName("aa.g")
    public static class184 field823 = new class184(64);

    @ObfuscatedName("aa.u")
    public static class184 field824 = new class184(50);

    @ObfuscatedName("aa.q")
    public int field825;

    @ObfuscatedName("aa.r")
    public String field826 = "null";

    @ObfuscatedName("aa.v")
    public int field827 = 1;

    @ObfuscatedName("aa.y")
    public int[] field828;

    @ObfuscatedName("aa.k")
    public int[] field852;

    @ObfuscatedName("aa.c")
    public int field838 = -1;

    @ObfuscatedName("aa.j")
    public int field854 = -1;

    @ObfuscatedName("aa.m")
    public int field830 = -1;

    @ObfuscatedName("aa.a")
    public int field836 = -1;

    @ObfuscatedName("aa.f")
    public int field834 = -1;

    @ObfuscatedName("aa.i")
    public int field835 = -1;

    @ObfuscatedName("aa.n")
    public int field821 = -1;

    @ObfuscatedName("aa.x")
    public short[] field837;

    @ObfuscatedName("aa.h")
    public short[] field847;

    @ObfuscatedName("aa.t")
    public short[] field839;

    @ObfuscatedName("aa.w")
    public short[] field840;

    @ObfuscatedName("aa.p")
    public String[] field841 = new String[5];

    @ObfuscatedName("aa.z")
    public boolean field842 = true;

    @ObfuscatedName("aa.s")
    public int field855 = -1;

    @ObfuscatedName("aa.d")
    public int field844 = 128;

    @ObfuscatedName("aa.b")
    public int field845 = 128;

    @ObfuscatedName("aa.e")
    public boolean field846 = false;

    @ObfuscatedName("aa.ar")
    public int field833 = 0;

    @ObfuscatedName("aa.av")
    public int field848 = 0;

    @ObfuscatedName("aa.ae")
    public int field849 = -1;

    @ObfuscatedName("aa.aq")
    public int field850 = 32;

    @ObfuscatedName("aa.ay")
    public int[] field851;

    @ObfuscatedName("aa.ac")
    public int field856 = -1;

    @ObfuscatedName("aa.ao")
    public int field853 = -1;

    @ObfuscatedName("aa.ab")
    public boolean field829 = true;

    @ObfuscatedName("aa.at")
    public boolean field832 = true;

    @ObfuscatedName("aa.ai")
    public boolean field843 = false;

    @ObfuscatedName("aa.aa")
    public int field857 = 30;

    @ObfuscatedName("dd.o(Lfg;Lfg;B)V")
    public static void method2565(class158 arg0, class158 arg1) {
        Statics.field831 = arg0;
        Statics.field822 = arg1;
    }

    @ObfuscatedName("da.l(II)Laa;")
    public static class37 method2500(int arg0) {
        class37 var1 = (class37) field823.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field831.method2940(9, arg0);
        class37 var3 = new class37();
        var3.field825 = arg0;
        if (var2 != null) {
            var3.method665(new class111(var2));
        }
        var3.method664();
        field823.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.g(B)V")
    public void method664() {
    }

    @ObfuscatedName("aa.u(Ldk;B)V")
    public void method665(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method667(arg0, var2);
        }
    }

    @ObfuscatedName("aa.q(Ldk;II)V")
    public void method667(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2219();
            this.field828 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field828[var4] = arg0.method2397();
            }
        } else if (arg1 == 2) {
            this.field826 = arg0.method2339();
        } else if (arg1 == 12) {
            this.field827 = arg0.method2219();
        } else if (arg1 == 13) {
            this.field838 = arg0.method2397();
        } else if (arg1 == 14) {
            this.field836 = arg0.method2397();
        } else if (arg1 == 15) {
            this.field854 = arg0.method2397();
        } else if (arg1 == 16) {
            this.field830 = arg0.method2397();
        } else if (arg1 == 17) {
            this.field836 = arg0.method2397();
            this.field834 = arg0.method2397();
            this.field835 = arg0.method2397();
            this.field821 = arg0.method2397();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field841[arg1 - 30] = arg0.method2339();
            if (this.field841[arg1 - 30].equalsIgnoreCase(class148.field2429)) {
                this.field841[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2219();
            this.field837 = new short[var5];
            this.field847 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field837[var6] = (short) arg0.method2397();
                this.field847[var6] = (short) arg0.method2397();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2219();
            this.field839 = new short[var7];
            this.field840 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field839[var8] = (short) arg0.method2397();
                this.field840[var8] = (short) arg0.method2397();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2219();
            this.field852 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field852[var10] = arg0.method2397();
            }
        } else if (arg1 == 93) {
            this.field842 = false;
        } else if (arg1 == 95) {
            this.field855 = arg0.method2397();
        } else if (arg1 == 97) {
            this.field844 = arg0.method2397();
        } else if (arg1 == 98) {
            this.field845 = arg0.method2397();
        } else if (arg1 == 99) {
            this.field846 = true;
        } else if (arg1 == 100) {
            this.field833 = arg0.method2220();
        } else if (arg1 == 101) {
            this.field848 = arg0.method2220();
        } else if (arg1 == 102) {
            this.field849 = arg0.method2397();
        } else if (arg1 == 103) {
            this.field850 = arg0.method2397();
        } else if (arg1 == 106) {
            this.field856 = arg0.method2397();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
            this.field853 = arg0.method2397();
            if (this.field853 == 65535) {
                this.field853 = -1;
            }
            int var11 = arg0.method2219();
            this.field851 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field851[var12] = arg0.method2397();
                if (this.field851[var12] == 65535) {
                    this.field851[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field829 = false;
        } else if (arg1 == 109) {
            this.field832 = false;
        } else if (arg1 == 111) {
            this.field843 = true;
        } else if (arg1 == 112) {
            this.field857 = arg0.method2219();
        }
    }

    @ObfuscatedName("aa.r(Law;ILaw;II)Lcq;")
    public final class100 method666(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field851 != null) {
            class37 var5 = this.method669();
            return var5 == null ? null : var5.method666(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field824.method3401((long) this.field825);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field828.length; var8++) {
                if (!Statics.field822.method2978(this.field828[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field828.length];
            for (int var10 = 0; var10 < this.field828.length; var10++) {
                var9[var10] = class95.method1967(Statics.field822, this.field828[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field837 != null) {
                for (int var12 = 0; var12 < this.field837.length; var12++) {
                    var11.method1971(this.field837[var12], this.field847[var12]);
                }
            }
            if (this.field839 != null) {
                for (int var13 = 0; var13 < this.field839.length; var13++) {
                    var11.method1979(this.field839[var13], this.field840[var13]);
                }
            }
            var6 = var11.method1983(this.field833 + 64, this.field848 * 5 + 850, -30, -50, -30);
            field824.method3403(var6, (long) this.field825);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method783(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method816(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2099(true);
        } else {
            var14 = arg2.method816(var6, arg3);
        }
        if (this.field844 != 128 || this.field845 != 128) {
            var14.method2060(this.field844, this.field845, this.field844);
        }
        return var14;
    }

    @ObfuscatedName("aa.v(I)Lcl;")
    public final class95 method668() {
        if (this.field851 != null) {
            class37 var1 = this.method669();
            return var1 == null ? null : var1.method668();
        } else if (this.field852 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field852.length; var3++) {
                if (!Statics.field822.method2978(this.field852[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field852.length];
            for (int var5 = 0; var5 < this.field852.length; var5++) {
                var4[var5] = class95.method1967(Statics.field822, this.field852[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field837 != null) {
                for (int var7 = 0; var7 < this.field837.length; var7++) {
                    var6.method1971(this.field837[var7], this.field847[var7]);
                }
            }
            if (this.field839 != null) {
                for (int var8 = 0; var8 < this.field839.length; var8++) {
                    var6.method1979(this.field839[var8], this.field840[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("aa.y(I)Laa;")
    public final class37 method669() {
        int var1 = -1;
        if (this.field856 != -1) {
            var1 = class167.method558(this.field856);
        } else if (this.field853 != -1) {
            var1 = class167.field2791[this.field853];
        }
        return var1 < 0 || var1 >= this.field851.length || this.field851[var1] == -1 ? null : method2500(this.field851[var1]);
    }

    @ObfuscatedName("aa.k(B)Z")
    public boolean method670() {
        if (this.field851 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field856 != -1) {
            var1 = class167.method558(this.field856);
        } else if (this.field853 != -1) {
            var1 = class167.field2791[this.field853];
        }
        return var1 >= 0 && var1 < this.field851.length && this.field851[var1] != -1;
    }
}
