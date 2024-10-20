package deob;

@ObfuscatedName("av")
public class class31 extends class174 {

    @ObfuscatedName("av.c")
    public static class170 field794 = new class170(64);

    @ObfuscatedName("av.d")
    public static class170 field795 = new class170(50);

    @ObfuscatedName("av.b")
    public int field796;

    @ObfuscatedName("av.i")
    public String field810 = "null";

    @ObfuscatedName("av.p")
    public int field798 = 1;

    @ObfuscatedName("av.y")
    public int[] field799;

    @ObfuscatedName("av.u")
    public int[] field811;

    @ObfuscatedName("av.z")
    public int field801 = -1;

    @ObfuscatedName("av.j")
    public int field802 = -1;

    @ObfuscatedName("av.h")
    public int field803 = -1;

    @ObfuscatedName("av.x")
    public int field804 = -1;

    @ObfuscatedName("av.q")
    public int field792 = -1;

    @ObfuscatedName("av.w")
    public int field806 = -1;

    @ObfuscatedName("av.k")
    public int field807 = -1;

    @ObfuscatedName("av.o")
    public short[] field808;

    @ObfuscatedName("av.f")
    public short[] field809;

    @ObfuscatedName("av.r")
    public short[] field819;

    @ObfuscatedName("av.s")
    public short[] field800;

    @ObfuscatedName("av.g")
    public String[] field812 = new String[5];

    @ObfuscatedName("av.m")
    public boolean field813 = true;

    @ObfuscatedName("av.a")
    public int field829 = -1;

    @ObfuscatedName("av.n")
    public int field815 = 128;

    @ObfuscatedName("av.v")
    public int field816 = 128;

    @ObfuscatedName("av.e")
    public boolean field827 = false;

    @ObfuscatedName("av.ar")
    public int field818 = 0;

    @ObfuscatedName("av.ak")
    public int field823 = 0;

    @ObfuscatedName("av.ap")
    public int field817 = -1;

    @ObfuscatedName("av.aa")
    public int field805 = 32;

    @ObfuscatedName("av.av")
    public int[] field822;

    @ObfuscatedName("av.aq")
    public int field825 = -1;

    @ObfuscatedName("av.an")
    public int field820 = -1;

    @ObfuscatedName("av.al")
    public boolean field831 = true;

    @ObfuscatedName("av.ax")
    public boolean field828 = true;

    @ObfuscatedName("dw.t(Lev;Lev;I)V")
    public static void method2215(class152 arg0, class152 arg1) {
        Statics.field814 = arg0;
        Statics.field826 = arg1;
    }

    @ObfuscatedName("aj.l(II)Lav;")
    public static class31 method922(int arg0) {
        class31 var1 = (class31) field794.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field814.method2987(9, arg0);
        class31 var3 = new class31();
        var3.field796 = arg0;
        if (var2 != null) {
            var3.method630(new class127(var2));
        }
        var3.method629();
        field794.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.c(B)V")
    public void method629() {
    }

    @ObfuscatedName("av.d(Ldo;I)V")
    public void method630(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method631(arg0, var2);
        }
    }

    @ObfuscatedName("av.b(Ldo;II)V")
    public void method631(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2438();
            this.field799 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field799[var4] = arg0.method2440();
            }
        } else if (arg1 == 2) {
            this.field810 = arg0.method2627();
        } else if (arg1 == 12) {
            this.field798 = arg0.method2438();
        } else if (arg1 == 13) {
            this.field801 = arg0.method2440();
        } else if (arg1 == 14) {
            this.field804 = arg0.method2440();
        } else if (arg1 == 15) {
            this.field802 = arg0.method2440();
        } else if (arg1 == 16) {
            this.field803 = arg0.method2440();
        } else if (arg1 == 17) {
            this.field804 = arg0.method2440();
            this.field792 = arg0.method2440();
            this.field806 = arg0.method2440();
            this.field807 = arg0.method2440();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field812[arg1 - 30] = arg0.method2627();
            if (this.field812[arg1 - 30].equalsIgnoreCase(class134.field2135)) {
                this.field812[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2438();
            this.field808 = new short[var5];
            this.field809 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field808[var6] = (short) arg0.method2440();
                this.field809[var6] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2438();
            this.field819 = new short[var7];
            this.field800 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field819[var8] = (short) arg0.method2440();
                this.field800[var8] = (short) arg0.method2440();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2438();
            this.field811 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field811[var10] = arg0.method2440();
            }
        } else if (arg1 == 93) {
            this.field813 = false;
        } else if (arg1 == 95) {
            this.field829 = arg0.method2440();
        } else if (arg1 == 97) {
            this.field815 = arg0.method2440();
        } else if (arg1 == 98) {
            this.field816 = arg0.method2440();
        } else if (arg1 == 99) {
            this.field827 = true;
        } else if (arg1 == 100) {
            this.field818 = arg0.method2629();
        } else if (arg1 == 101) {
            this.field823 = arg0.method2629() * 5;
        } else if (arg1 == 102) {
            this.field817 = arg0.method2440();
        } else if (arg1 == 103) {
            this.field805 = arg0.method2440();
        } else if (arg1 == 106) {
            this.field825 = arg0.method2440();
            if (this.field825 == 65535) {
                this.field825 = -1;
            }
            this.field820 = arg0.method2440();
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
            int var11 = arg0.method2438();
            this.field822 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field822[var12] = arg0.method2440();
                if (this.field822[var12] == 65535) {
                    this.field822[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field831 = false;
        } else if (arg1 == 109) {
            this.field828 = false;
        }
    }

    @ObfuscatedName("av.i(Lal;ILal;II)Ldk;")
    public final class112 method652(class34 arg0, int arg1, class34 arg2, int arg3) {
        if (this.field822 != null) {
            class31 var5 = this.method634();
            return var5 == null ? null : var5.method652(arg0, arg1, arg2, arg3);
        }
        class112 var6 = (class112) field795.method3260((long) this.field796);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field799.length; var8++) {
                if (!Statics.field826.method2989(this.field799[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field799.length];
            for (int var10 = 0; var10 < this.field799.length; var10++) {
                var9[var10] = class101.method2086(Statics.field826, this.field799[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field808 != null) {
                for (int var12 = 0; var12 < this.field808.length; var12++) {
                    var11.method2063(this.field808[var12], this.field809[var12]);
                }
            }
            if (this.field819 != null) {
                for (int var13 = 0; var13 < this.field819.length; var13++) {
                    var11.method2064(this.field819[var13], this.field800[var13]);
                }
            }
            var6 = var11.method2125(this.field818 + 64, this.field823 + 850, -30, -50, -30);
            field795.method3261(var6, (long) this.field796);
        }
        class112 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method734(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method741(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2235(true);
        } else {
            var14 = arg2.method741(var6, arg3);
        }
        if (this.field815 != 128 || this.field816 != 128) {
            var14.method2294(this.field815, this.field816, this.field815);
        }
        return var14;
    }

    @ObfuscatedName("av.p(I)Lcc;")
    public final class101 method642() {
        if (this.field822 != null) {
            class31 var1 = this.method634();
            return var1 == null ? null : var1.method642();
        } else if (this.field811 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field811.length; var3++) {
                if (!Statics.field826.method2989(this.field811[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field811.length];
            for (int var5 = 0; var5 < this.field811.length; var5++) {
                var4[var5] = class101.method2086(Statics.field826, this.field811[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field808 != null) {
                for (int var7 = 0; var7 < this.field808.length; var7++) {
                    var6.method2063(this.field808[var7], this.field809[var7]);
                }
            }
            if (this.field819 != null) {
                for (int var8 = 0; var8 < this.field819.length; var8++) {
                    var6.method2064(this.field819[var8], this.field800[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("av.y(B)Lav;")
    public final class31 method634() {
        int var1 = -1;
        if (this.field825 != -1) {
            var1 = class159.method2232(this.field825);
        } else if (this.field820 != -1) {
            var1 = class159.field2713[this.field820];
        }
        return var1 < 0 || var1 >= this.field822.length || this.field822[var1] == -1 ? null : method922(this.field822[var1]);
    }

    @ObfuscatedName("av.u(I)Z")
    public boolean method635() {
        if (this.field822 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field825 != -1) {
            var1 = class159.method2232(this.field825);
        } else if (this.field820 != -1) {
            var1 = class159.field2713[this.field820];
        }
        return var1 >= 0 && var1 < this.field822.length && this.field822[var1] != -1;
    }

    @ObfuscatedName("o.z(I)V")
    public static void method160() {
        field794.method3264();
        field795.method3264();
    }
}
