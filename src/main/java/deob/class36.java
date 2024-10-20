package deob;

@ObfuscatedName("an")
public class class36 extends class185 {

    @ObfuscatedName("an.z")
    public static class174 field805 = new class174(64);

    @ObfuscatedName("an.b")
    public static class174 field821 = new class174(50);

    @ObfuscatedName("an.k")
    public int field820;

    @ObfuscatedName("an.c")
    public String field840 = "null";

    @ObfuscatedName("an.w")
    public int field809 = 1;

    @ObfuscatedName("an.l")
    public int[] field824;

    @ObfuscatedName("an.n")
    public int[] field811;

    @ObfuscatedName("an.d")
    public int field812 = -1;

    @ObfuscatedName("an.h")
    public int field813 = -1;

    @ObfuscatedName("an.y")
    public int field828 = -1;

    @ObfuscatedName("an.p")
    public int field815 = -1;

    @ObfuscatedName("an.i")
    public int field816 = -1;

    @ObfuscatedName("an.s")
    public int field817 = -1;

    @ObfuscatedName("an.f")
    public int field818 = -1;

    @ObfuscatedName("an.u")
    public short[] field819;

    @ObfuscatedName("an.v")
    public short[] field826;

    @ObfuscatedName("an.r")
    public short[] field846;

    @ObfuscatedName("an.q")
    public short[] field822;

    @ObfuscatedName("an.x")
    public String[] field823 = new String[5];

    @ObfuscatedName("an.t")
    public boolean field835 = true;

    @ObfuscatedName("an.e")
    public int field810 = -1;

    @ObfuscatedName("an.m")
    public int field814 = 128;

    @ObfuscatedName("an.o")
    public int field827 = 128;

    @ObfuscatedName("an.a")
    public boolean field847 = false;

    @ObfuscatedName("an.am")
    public int field837 = 0;

    @ObfuscatedName("an.ac")
    public int field830 = 0;

    @ObfuscatedName("an.ap")
    public int field831 = -1;

    @ObfuscatedName("an.aq")
    public int field832 = 32;

    @ObfuscatedName("an.az")
    public int[] field803;

    @ObfuscatedName("an.ae")
    public int field808 = -1;

    @ObfuscatedName("an.at")
    public int field845 = -1;

    @ObfuscatedName("an.as")
    public boolean field836 = true;

    @ObfuscatedName("an.aj")
    public boolean field834 = true;

    @ObfuscatedName("an.an")
    public boolean field838 = false;

    @ObfuscatedName("an.al")
    public int field839 = 30;

    @ObfuscatedName("df.g(II)Lan;")
    public static class36 method2273(int arg0) {
        class36 var1 = (class36) field805.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field807.method2660(9, arg0);
        class36 var3 = new class36();
        var3.field820 = arg0;
        if (var2 != null) {
            var3.method578(new class108(var2));
        }
        var3.method577();
        field805.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.j(B)V")
    public void method577() {
    }

    @ObfuscatedName("an.z(Ldf;I)V")
    public void method578(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method593(arg0, var2);
        }
    }

    @ObfuscatedName("an.b(Ldf;II)V")
    public void method593(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2083();
            this.field824 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field824[var4] = arg0.method2263();
            }
        } else if (arg1 == 2) {
            this.field840 = arg0.method2091();
        } else if (arg1 == 12) {
            this.field809 = arg0.method2083();
        } else if (arg1 == 13) {
            this.field812 = arg0.method2263();
        } else if (arg1 == 14) {
            this.field815 = arg0.method2263();
        } else if (arg1 == 15) {
            this.field813 = arg0.method2263();
        } else if (arg1 == 16) {
            this.field828 = arg0.method2263();
        } else if (arg1 == 17) {
            this.field815 = arg0.method2263();
            this.field816 = arg0.method2263();
            this.field817 = arg0.method2263();
            this.field818 = arg0.method2263();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field823[arg1 - 30] = arg0.method2091();
            if (this.field823[arg1 - 30].equalsIgnoreCase(class145.field2151)) {
                this.field823[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2083();
            this.field819 = new short[var5];
            this.field826 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field819[var6] = (short) arg0.method2263();
                this.field826[var6] = (short) arg0.method2263();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2083();
            this.field846 = new short[var7];
            this.field822 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field846[var8] = (short) arg0.method2263();
                this.field822[var8] = (short) arg0.method2263();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2083();
            this.field811 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field811[var10] = arg0.method2263();
            }
        } else if (arg1 == 93) {
            this.field835 = false;
        } else if (arg1 == 95) {
            this.field810 = arg0.method2263();
        } else if (arg1 == 97) {
            this.field814 = arg0.method2263();
        } else if (arg1 == 98) {
            this.field827 = arg0.method2263();
        } else if (arg1 == 99) {
            this.field847 = true;
        } else if (arg1 == 100) {
            this.field837 = arg0.method2173();
        } else if (arg1 == 101) {
            this.field830 = arg0.method2173();
        } else if (arg1 == 102) {
            this.field831 = arg0.method2263();
        } else if (arg1 == 103) {
            this.field832 = arg0.method2263();
        } else if (arg1 == 106) {
            this.field808 = arg0.method2263();
            if (this.field808 == 65535) {
                this.field808 = -1;
            }
            this.field845 = arg0.method2263();
            if (this.field845 == 65535) {
                this.field845 = -1;
            }
            int var11 = arg0.method2083();
            this.field803 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field803[var12] = arg0.method2263();
                if (this.field803[var12] == 65535) {
                    this.field803[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field836 = false;
        } else if (arg1 == 109) {
            this.field834 = false;
        } else if (arg1 == 111) {
            this.field838 = true;
        } else if (arg1 == 112) {
            this.field839 = arg0.method2083();
        }
    }

    @ObfuscatedName("an.k(Lah;ILah;II)Lcx;")
    public final class99 method584(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field803 != null) {
            class36 var5 = this.method576();
            return var5 == null ? null : var5.method584(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field821.method3097((long) this.field820);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field824.length; var8++) {
                if (!Statics.field804.method2712(this.field824[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field824.length];
            for (int var10 = 0; var10 < this.field824.length; var10++) {
                var9[var10] = class94.method1848(Statics.field804, this.field824[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field819 != null) {
                for (int var12 = 0; var12 < this.field819.length; var12++) {
                    var11.method1847(this.field819[var12], this.field826[var12]);
                }
            }
            if (this.field846 != null) {
                for (int var13 = 0; var13 < this.field846.length; var13++) {
                    var11.method1861(this.field846[var13], this.field822[var13]);
                }
            }
            var6 = var11.method1917(this.field837 + 64, this.field830 * 5 + 850, -30, -50, -30);
            field821.method3099(var6, (long) this.field820);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method679(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method701(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1937(true);
        } else {
            var14 = arg2.method701(var6, arg3);
        }
        if (this.field814 != 128 || this.field827 != 128) {
            var14.method1950(this.field814, this.field827, this.field814);
        }
        return var14;
    }

    @ObfuscatedName("an.c(I)Lci;")
    public final class94 method581() {
        if (this.field803 != null) {
            class36 var1 = this.method576();
            return var1 == null ? null : var1.method581();
        } else if (this.field811 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field811.length; var3++) {
                if (!Statics.field804.method2712(this.field811[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field811.length];
            for (int var5 = 0; var5 < this.field811.length; var5++) {
                var4[var5] = class94.method1848(Statics.field804, this.field811[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field819 != null) {
                for (int var7 = 0; var7 < this.field819.length; var7++) {
                    var6.method1847(this.field819[var7], this.field826[var7]);
                }
            }
            if (this.field846 != null) {
                for (int var8 = 0; var8 < this.field846.length; var8++) {
                    var6.method1861(this.field846[var8], this.field822[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("an.w(I)Lan;")
    public final class36 method576() {
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class157.method671(this.field808);
        } else if (this.field845 != -1) {
            var1 = class157.field2672[this.field845];
        }
        return var1 < 0 || var1 >= this.field803.length || this.field803[var1] == -1 ? null : method2273(this.field803[var1]);
    }

    @ObfuscatedName("an.l(B)Z")
    public boolean method583() {
        if (this.field803 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class157.method671(this.field808);
        } else if (this.field845 != -1) {
            var1 = class157.field2672[this.field845];
        }
        return var1 >= 0 && var1 < this.field803.length && this.field803[var1] != -1;
    }
}
