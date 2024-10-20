package deob;

@ObfuscatedName("ab")
public class class36 extends class185 {

    @ObfuscatedName("ab.y")
    public static class174 field800 = new class174(64);

    @ObfuscatedName("ab.r")
    public static class174 field801 = new class174(50);

    @ObfuscatedName("ab.f")
    public int field819;

    @ObfuscatedName("ab.l")
    public String field825 = "null";

    @ObfuscatedName("ab.b")
    public int field804 = 1;

    @ObfuscatedName("ab.k")
    public int[] field823;

    @ObfuscatedName("ab.g")
    public int[] field824;

    @ObfuscatedName("ab.v")
    public int field802 = -1;

    @ObfuscatedName("ab.i")
    public int field830 = -1;

    @ObfuscatedName("ab.x")
    public int field809 = -1;

    @ObfuscatedName("ab.h")
    public int field816 = -1;

    @ObfuscatedName("ab.w")
    public int field811 = -1;

    @ObfuscatedName("ab.s")
    public int field812 = -1;

    @ObfuscatedName("ab.p")
    public int field813 = -1;

    @ObfuscatedName("ab.z")
    public short[] field814;

    @ObfuscatedName("ab.n")
    public short[] field818;

    @ObfuscatedName("ab.u")
    public short[] field834;

    @ObfuscatedName("ab.a")
    public short[] field817;

    @ObfuscatedName("ab.d")
    public String[] field820 = new String[5];

    @ObfuscatedName("ab.m")
    public boolean field805 = true;

    @ObfuscatedName("ab.q")
    public int field798 = -1;

    @ObfuscatedName("ab.e")
    public int field821 = 128;

    @ObfuscatedName("ab.t")
    public int field822 = 128;

    @ObfuscatedName("ab.o")
    public boolean field838 = false;

    @ObfuscatedName("ab.at")
    public int field815 = 0;

    @ObfuscatedName("ab.ag")
    public int field810 = 0;

    @ObfuscatedName("ab.ae")
    public int field826 = -1;

    @ObfuscatedName("ab.ak")
    public int field827 = 32;

    @ObfuscatedName("ab.ap")
    public int[] field828;

    @ObfuscatedName("ab.ao")
    public int field829 = -1;

    @ObfuscatedName("ab.ac")
    public int field806 = -1;

    @ObfuscatedName("ab.as")
    public boolean field831 = true;

    @ObfuscatedName("ab.ai")
    public boolean field832 = true;

    @ObfuscatedName("ab.ab")
    public boolean field833 = false;

    @ObfuscatedName("ab.an")
    public int field803 = 30;

    @ObfuscatedName("an.c(Ler;Ler;B)V")
    public static void method641(class149 arg0, class149 arg1) {
        Statics.field808 = arg0;
        Statics.field799 = arg1;
    }

    @ObfuscatedName("cz.j(IB)Lab;")
    public static class36 method2072(int arg0) {
        class36 var1 = (class36) field800.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field808.method2746(9, arg0);
        class36 var3 = new class36();
        var3.field819 = arg0;
        if (var2 != null) {
            var3.method603(new class108(var2));
        }
        var3.method600();
        field800.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.y(I)V")
    public void method600() {
    }

    @ObfuscatedName("ab.r(Ldx;I)V")
    public void method603(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method611(arg0, var2);
        }
    }

    @ObfuscatedName("ab.f(Ldx;IB)V")
    public void method611(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2134();
            this.field823 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field823[var4] = arg0.method2136();
            }
        } else if (arg1 == 2) {
            this.field825 = arg0.method2216();
        } else if (arg1 == 12) {
            this.field804 = arg0.method2134();
        } else if (arg1 == 13) {
            this.field802 = arg0.method2136();
        } else if (arg1 == 14) {
            this.field816 = arg0.method2136();
        } else if (arg1 == 15) {
            this.field830 = arg0.method2136();
        } else if (arg1 == 16) {
            this.field809 = arg0.method2136();
        } else if (arg1 == 17) {
            this.field816 = arg0.method2136();
            this.field811 = arg0.method2136();
            this.field812 = arg0.method2136();
            this.field813 = arg0.method2136();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field820[arg1 - 30] = arg0.method2216();
            if (this.field820[arg1 - 30].equalsIgnoreCase(class145.field2153)) {
                this.field820[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2134();
            this.field814 = new short[var5];
            this.field818 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field814[var6] = (short) arg0.method2136();
                this.field818[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2134();
            this.field834 = new short[var7];
            this.field817 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field834[var8] = (short) arg0.method2136();
                this.field817[var8] = (short) arg0.method2136();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2134();
            this.field824 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field824[var10] = arg0.method2136();
            }
        } else if (arg1 == 93) {
            this.field805 = false;
        } else if (arg1 == 95) {
            this.field798 = arg0.method2136();
        } else if (arg1 == 97) {
            this.field821 = arg0.method2136();
        } else if (arg1 == 98) {
            this.field822 = arg0.method2136();
        } else if (arg1 == 99) {
            this.field838 = true;
        } else if (arg1 == 100) {
            this.field815 = arg0.method2229();
        } else if (arg1 == 101) {
            this.field810 = arg0.method2229() * 5;
        } else if (arg1 == 102) {
            this.field826 = arg0.method2136();
        } else if (arg1 == 103) {
            this.field827 = arg0.method2136();
        } else if (arg1 == 106) {
            this.field829 = arg0.method2136();
            if (this.field829 == 65535) {
                this.field829 = -1;
            }
            this.field806 = arg0.method2136();
            if (this.field806 == 65535) {
                this.field806 = -1;
            }
            int var11 = arg0.method2134();
            this.field828 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field828[var12] = arg0.method2136();
                if (this.field828[var12] == 65535) {
                    this.field828[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field831 = false;
        } else if (arg1 == 109) {
            this.field832 = false;
        } else if (arg1 == 111) {
            this.field833 = true;
        } else if (arg1 == 112) {
            this.field803 = arg0.method2134();
        }
    }

    @ObfuscatedName("ab.l(Lad;ILad;II)Lcl;")
    public final class99 method602(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field828 != null) {
            class36 var5 = this.method599();
            return var5 == null ? null : var5.method602(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field801.method3178((long) this.field819);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field823.length; var8++) {
                if (!Statics.field799.method2777(this.field823[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field823.length];
            for (int var10 = 0; var10 < this.field823.length; var10++) {
                var9[var10] = class94.method1955(Statics.field799, this.field823[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field814 != null) {
                for (int var12 = 0; var12 < this.field814.length; var12++) {
                    var11.method1914(this.field814[var12], this.field818[var12]);
                }
            }
            if (this.field834 != null) {
                for (int var13 = 0; var13 < this.field834.length; var13++) {
                    var11.method1915(this.field834[var13], this.field817[var13]);
                }
            }
            var6 = var11.method1922(this.field815 + 64, this.field810 + 850, -30, -50, -30);
            field801.method3167(var6, (long) this.field819);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method701(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method695(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1986(true);
        } else {
            var14 = arg2.method695(var6, arg3);
        }
        if (this.field821 != 128 || this.field822 != 128) {
            var14.method2001(this.field821, this.field822, this.field821);
        }
        return var14;
    }

    @ObfuscatedName("ab.b(I)Lce;")
    public final class94 method616() {
        if (this.field828 != null) {
            class36 var1 = this.method599();
            return var1 == null ? null : var1.method616();
        } else if (this.field824 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field824.length; var3++) {
                if (!Statics.field799.method2777(this.field824[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field824.length];
            for (int var5 = 0; var5 < this.field824.length; var5++) {
                var4[var5] = class94.method1955(Statics.field799, this.field824[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field814 != null) {
                for (int var7 = 0; var7 < this.field814.length; var7++) {
                    var6.method1914(this.field814[var7], this.field818[var7]);
                }
            }
            if (this.field834 != null) {
                for (int var8 = 0; var8 < this.field834.length; var8++) {
                    var6.method1915(this.field834[var8], this.field817[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ab.k(I)Lab;")
    public final class36 method599() {
        int var1 = -1;
        if (this.field829 != -1) {
            var1 = class157.method461(this.field829);
        } else if (this.field806 != -1) {
            var1 = class157.field2671[this.field806];
        }
        return var1 < 0 || var1 >= this.field828.length || this.field828[var1] == -1 ? null : method2072(this.field828[var1]);
    }

    @ObfuscatedName("ab.g(B)Z")
    public boolean method605() {
        if (this.field828 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field829 != -1) {
            var1 = class157.method461(this.field829);
        } else if (this.field806 != -1) {
            var1 = class157.field2671[this.field806];
        }
        return var1 >= 0 && var1 < this.field828.length && this.field828[var1] != -1;
    }

    @ObfuscatedName("cn.v(I)V")
    public static void method2060() {
        field800.method3168();
        field801.method3168();
    }
}
