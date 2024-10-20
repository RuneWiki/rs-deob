package deob;

@ObfuscatedName("az")
public class class37 extends class195 {

    @ObfuscatedName("az.z")
    public static class184 field822 = new class184(64);

    @ObfuscatedName("az.y")
    public static class184 field823 = new class184(50);

    @ObfuscatedName("az.e")
    public int field824;

    @ObfuscatedName("az.g")
    public String field840 = "null";

    @ObfuscatedName("az.f")
    public int field826 = 1;

    @ObfuscatedName("az.m")
    public int[] field827;

    @ObfuscatedName("az.a")
    public int[] field848;

    @ObfuscatedName("az.h")
    public int field829 = -1;

    @ObfuscatedName("az.l")
    public int field841 = -1;

    @ObfuscatedName("az.u")
    public int field831 = -1;

    @ObfuscatedName("az.q")
    public int field832 = -1;

    @ObfuscatedName("az.k")
    public int field833 = -1;

    @ObfuscatedName("az.x")
    public int field834 = -1;

    @ObfuscatedName("az.r")
    public int field856 = -1;

    @ObfuscatedName("az.j")
    public short[] field859;

    @ObfuscatedName("az.s")
    public short[] field837;

    @ObfuscatedName("az.v")
    public short[] field838;

    @ObfuscatedName("az.c")
    public short[] field839;

    @ObfuscatedName("az.p")
    public String[] field858 = new String[5];

    @ObfuscatedName("az.o")
    public boolean field851 = true;

    @ObfuscatedName("az.b")
    public int field842 = -1;

    @ObfuscatedName("az.t")
    public int field843 = 128;

    @ObfuscatedName("az.w")
    public int field844 = 128;

    @ObfuscatedName("az.i")
    public boolean field852 = false;

    @ObfuscatedName("az.ad")
    public int field846 = 0;

    @ObfuscatedName("az.ak")
    public int field850 = 0;

    @ObfuscatedName("az.ae")
    public int field845 = -1;

    @ObfuscatedName("az.ax")
    public int field849 = 32;

    @ObfuscatedName("az.al")
    public int[] field828;

    @ObfuscatedName("az.ar")
    public int field830 = -1;

    @ObfuscatedName("az.as")
    public int field835 = -1;

    @ObfuscatedName("az.ab")
    public boolean field853 = true;

    @ObfuscatedName("az.ao")
    public boolean field854 = true;

    @ObfuscatedName("az.ac")
    public boolean field825 = false;

    @ObfuscatedName("az.az")
    public int field847 = 30;

    @ObfuscatedName("gr.n(II)Laz;")
    public static class37 method3596(int arg0) {
        class37 var1 = (class37) field822.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field836.method2948(9, arg0);
        class37 var3 = new class37();
        var3.field824 = arg0;
        if (var2 != null) {
            var3.method680(new class111(var2));
        }
        var3.method679();
        field822.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.d(I)V")
    public void method679() {
    }

    @ObfuscatedName("az.z(Ldl;S)V")
    public void method680(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method681(arg0, var2);
        }
    }

    @ObfuscatedName("az.y(Ldl;IB)V")
    public void method681(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2228();
            this.field827 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field827[var4] = arg0.method2231();
            }
        } else if (arg1 == 2) {
            this.field840 = arg0.method2290();
        } else if (arg1 == 12) {
            this.field826 = arg0.method2228();
        } else if (arg1 == 13) {
            this.field829 = arg0.method2231();
        } else if (arg1 == 14) {
            this.field832 = arg0.method2231();
        } else if (arg1 == 15) {
            this.field841 = arg0.method2231();
        } else if (arg1 == 16) {
            this.field831 = arg0.method2231();
        } else if (arg1 == 17) {
            this.field832 = arg0.method2231();
            this.field833 = arg0.method2231();
            this.field834 = arg0.method2231();
            this.field856 = arg0.method2231();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field858[arg1 - 30] = arg0.method2290();
            if (this.field858[arg1 - 30].equalsIgnoreCase(class148.field2257)) {
                this.field858[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2228();
            this.field859 = new short[var5];
            this.field837 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field859[var6] = (short) arg0.method2231();
                this.field837[var6] = (short) arg0.method2231();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2228();
            this.field838 = new short[var7];
            this.field839 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field838[var8] = (short) arg0.method2231();
                this.field839[var8] = (short) arg0.method2231();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2228();
            this.field848 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field848[var10] = arg0.method2231();
            }
        } else if (arg1 == 93) {
            this.field851 = false;
        } else if (arg1 == 95) {
            this.field842 = arg0.method2231();
        } else if (arg1 == 97) {
            this.field843 = arg0.method2231();
        } else if (arg1 == 98) {
            this.field844 = arg0.method2231();
        } else if (arg1 == 99) {
            this.field852 = true;
        } else if (arg1 == 100) {
            this.field846 = arg0.method2409();
        } else if (arg1 == 101) {
            this.field850 = arg0.method2409();
        } else if (arg1 == 102) {
            this.field845 = arg0.method2231();
        } else if (arg1 == 103) {
            this.field849 = arg0.method2231();
        } else if (arg1 == 106) {
            this.field830 = arg0.method2231();
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
            this.field835 = arg0.method2231();
            if (this.field835 == 65535) {
                this.field835 = -1;
            }
            int var11 = arg0.method2228();
            this.field828 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field828[var12] = arg0.method2231();
                if (this.field828[var12] == 65535) {
                    this.field828[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field853 = false;
        } else if (arg1 == 109) {
            this.field854 = false;
        } else if (arg1 == 111) {
            this.field825 = true;
        } else if (arg1 == 112) {
            this.field847 = arg0.method2228();
        }
    }

    @ObfuscatedName("az.e(Lan;ILan;II)Lcg;")
    public final class100 method682(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field828 != null) {
            class37 var5 = this.method684();
            return var5 == null ? null : var5.method682(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field823.method3411((long) this.field824);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field827.length; var8++) {
                if (!Statics.field821.method2950(this.field827[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field827.length];
            for (int var10 = 0; var10 < this.field827.length; var10++) {
                var9[var10] = class95.method1969(Statics.field821, this.field827[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field859 != null) {
                for (int var12 = 0; var12 < this.field859.length; var12++) {
                    var11.method2001(this.field859[var12], this.field837[var12]);
                }
            }
            if (this.field838 != null) {
                for (int var13 = 0; var13 < this.field838.length; var13++) {
                    var11.method2000(this.field838[var13], this.field839[var13]);
                }
            }
            var6 = var11.method1994(this.field846 + 64, this.field850 * 5 + 850, -30, -50, -30);
            field823.method3420(var6, (long) this.field824);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method782(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method779(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2090(true);
        } else {
            var14 = arg2.method779(var6, arg3);
        }
        if (this.field843 != 128 || this.field844 != 128) {
            var14.method2083(this.field843, this.field844, this.field843);
        }
        return var14;
    }

    @ObfuscatedName("az.g(S)Lcy;")
    public final class95 method683() {
        if (this.field828 != null) {
            class37 var1 = this.method684();
            return var1 == null ? null : var1.method683();
        } else if (this.field848 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field848.length; var3++) {
                if (!Statics.field821.method2950(this.field848[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field848.length];
            for (int var5 = 0; var5 < this.field848.length; var5++) {
                var4[var5] = class95.method1969(Statics.field821, this.field848[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field859 != null) {
                for (int var7 = 0; var7 < this.field859.length; var7++) {
                    var6.method2001(this.field859[var7], this.field837[var7]);
                }
            }
            if (this.field838 != null) {
                for (int var8 = 0; var8 < this.field838.length; var8++) {
                    var6.method2000(this.field838[var8], this.field839[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("az.f(I)Laz;")
    public final class37 method684() {
        int var1 = -1;
        if (this.field830 != -1) {
            var1 = class167.method175(this.field830);
        } else if (this.field835 != -1) {
            var1 = class167.field2801[this.field835];
        }
        return var1 < 0 || var1 >= this.field828.length || this.field828[var1] == -1 ? null : method3596(this.field828[var1]);
    }

    @ObfuscatedName("az.m(B)Z")
    public boolean method692() {
        if (this.field828 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field830 != -1) {
            var1 = class167.method175(this.field830);
        } else if (this.field835 != -1) {
            var1 = class167.field2801[this.field835];
        }
        return var1 >= 0 && var1 < this.field828.length && this.field828[var1] != -1;
    }
}
