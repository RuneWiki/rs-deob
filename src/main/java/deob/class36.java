package deob;

@ObfuscatedName("ac")
public class class36 extends class187 {

    @ObfuscatedName("ac.f")
    public static class176 field809 = new class176(64);

    @ObfuscatedName("ac.j")
    public static class176 field803 = new class176(50);

    @ObfuscatedName("ac.l")
    public int field804;

    @ObfuscatedName("ac.g")
    public String field805 = "null";

    @ObfuscatedName("ac.k")
    public int field806 = 1;

    @ObfuscatedName("ac.p")
    public int[] field816;

    @ObfuscatedName("ac.y")
    public int[] field808;

    @ObfuscatedName("ac.m")
    public int field820 = -1;

    @ObfuscatedName("ac.o")
    public int field810 = -1;

    @ObfuscatedName("ac.c")
    public int field811 = -1;

    @ObfuscatedName("ac.r")
    public int field830 = -1;

    @ObfuscatedName("ac.s")
    public int field813 = -1;

    @ObfuscatedName("ac.n")
    public int field831 = -1;

    @ObfuscatedName("ac.q")
    public int field814 = -1;

    @ObfuscatedName("ac.e")
    public short[] field821;

    @ObfuscatedName("ac.d")
    public short[] field817;

    @ObfuscatedName("ac.b")
    public short[] field802;

    @ObfuscatedName("ac.a")
    public short[] field800;

    @ObfuscatedName("ac.i")
    public String[] field827 = new String[5];

    @ObfuscatedName("ac.w")
    public boolean field837 = true;

    @ObfuscatedName("ac.x")
    public int field812 = -1;

    @ObfuscatedName("ac.h")
    public int field823 = 128;

    @ObfuscatedName("ac.z")
    public int field822 = 128;

    @ObfuscatedName("ac.u")
    public boolean field825 = false;

    @ObfuscatedName("ac.ad")
    public int field826 = 0;

    @ObfuscatedName("ac.ah")
    public int field828 = 0;

    @ObfuscatedName("ac.ao")
    public int field815 = -1;

    @ObfuscatedName("ac.as")
    public int field829 = 32;

    @ObfuscatedName("ac.at")
    public int[] field818;

    @ObfuscatedName("ac.ai")
    public int field824 = -1;

    @ObfuscatedName("ac.aj")
    public int field832 = -1;

    @ObfuscatedName("ac.aq")
    public boolean field833 = true;

    @ObfuscatedName("ac.an")
    public boolean field834 = true;

    @ObfuscatedName("ac.ac")
    public boolean field835 = false;

    @ObfuscatedName("ac.ap")
    public int field836 = 30;

    @ObfuscatedName("ah.v(Lem;Lem;I)V")
    public static void method542(class151 arg0, class151 arg1) {
        Statics.field819 = arg0;
        Statics.field801 = arg1;
    }

    @ObfuscatedName("p.t(II)Lac;")
    public static class36 method80(int arg0) {
        class36 var1 = (class36) field809.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field819.method2852(9, arg0);
        class36 var3 = new class36();
        var3.field804 = arg0;
        if (var2 != null) {
            var3.method624(new class110(var2));
        }
        var3.method623();
        field809.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.f(I)V")
    public void method623() {
    }

    @ObfuscatedName("ac.j(Ldp;B)V")
    public void method624(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method626(arg0, var2);
        }
    }

    @ObfuscatedName("ac.l(Ldp;II)V")
    public void method626(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2257();
            this.field816 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field816[var4] = arg0.method2194();
            }
        } else if (arg1 == 2) {
            this.field805 = arg0.method2159();
        } else if (arg1 == 12) {
            this.field806 = arg0.method2257();
        } else if (arg1 == 13) {
            this.field820 = arg0.method2194();
        } else if (arg1 == 14) {
            this.field830 = arg0.method2194();
        } else if (arg1 == 15) {
            this.field810 = arg0.method2194();
        } else if (arg1 == 16) {
            this.field811 = arg0.method2194();
        } else if (arg1 == 17) {
            this.field830 = arg0.method2194();
            this.field813 = arg0.method2194();
            this.field831 = arg0.method2194();
            this.field814 = arg0.method2194();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field827[arg1 - 30] = arg0.method2159();
            if (this.field827[arg1 - 30].equalsIgnoreCase(class147.field2164)) {
                this.field827[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2257();
            this.field821 = new short[var5];
            this.field817 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field821[var6] = (short) arg0.method2194();
                this.field817[var6] = (short) arg0.method2194();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2257();
            this.field802 = new short[var7];
            this.field800 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field802[var8] = (short) arg0.method2194();
                this.field800[var8] = (short) arg0.method2194();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2257();
            this.field808 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field808[var10] = arg0.method2194();
            }
        } else if (arg1 == 93) {
            this.field837 = false;
        } else if (arg1 == 95) {
            this.field812 = arg0.method2194();
        } else if (arg1 == 97) {
            this.field823 = arg0.method2194();
        } else if (arg1 == 98) {
            this.field822 = arg0.method2194();
        } else if (arg1 == 99) {
            this.field825 = true;
        } else if (arg1 == 100) {
            this.field826 = arg0.method2162();
        } else if (arg1 == 101) {
            this.field828 = arg0.method2162() * 5;
        } else if (arg1 == 102) {
            this.field815 = arg0.method2194();
        } else if (arg1 == 103) {
            this.field829 = arg0.method2194();
        } else if (arg1 == 106) {
            this.field824 = arg0.method2194();
            if (this.field824 == 65535) {
                this.field824 = -1;
            }
            this.field832 = arg0.method2194();
            if (this.field832 == 65535) {
                this.field832 = -1;
            }
            int var11 = arg0.method2257();
            this.field818 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field818[var12] = arg0.method2194();
                if (this.field818[var12] == 65535) {
                    this.field818[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field833 = false;
        } else if (arg1 == 109) {
            this.field834 = false;
        } else if (arg1 == 111) {
            this.field835 = true;
        } else if (arg1 == 112) {
            this.field836 = arg0.method2257();
        }
    }

    @ObfuscatedName("ac.g(Lax;ILax;II)Lcy;")
    public final class99 method625(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field818 != null) {
            class36 var5 = this.method627();
            return var5 == null ? null : var5.method625(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field803.method3231((long) this.field804);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field816.length; var8++) {
                if (!Statics.field801.method2786(this.field816[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field816.length];
            for (int var10 = 0; var10 < this.field816.length; var10++) {
                var9[var10] = class94.method1899(Statics.field801, this.field816[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field821 != null) {
                for (int var12 = 0; var12 < this.field821.length; var12++) {
                    var11.method1976(this.field821[var12], this.field817[var12]);
                }
            }
            if (this.field802 != null) {
                for (int var13 = 0; var13 < this.field802.length; var13++) {
                    var11.method1981(this.field802[var13], this.field800[var13]);
                }
            }
            var6 = var11.method1918(this.field826 + 64, this.field828 + 850, -30, -50, -30);
            field803.method3228(var6, (long) this.field804);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method722(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method719(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2004(true);
        } else {
            var14 = arg2.method719(var6, arg3);
        }
        if (this.field823 != 128 || this.field822 != 128) {
            var14.method2015(this.field823, this.field822, this.field823);
        }
        return var14;
    }

    @ObfuscatedName("ac.k(I)Lcu;")
    public final class94 method629() {
        if (this.field818 != null) {
            class36 var1 = this.method627();
            return var1 == null ? null : var1.method629();
        } else if (this.field808 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field808.length; var3++) {
                if (!Statics.field801.method2786(this.field808[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field808.length];
            for (int var5 = 0; var5 < this.field808.length; var5++) {
                var4[var5] = class94.method1899(Statics.field801, this.field808[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field821 != null) {
                for (int var7 = 0; var7 < this.field821.length; var7++) {
                    var6.method1976(this.field821[var7], this.field817[var7]);
                }
            }
            if (this.field802 != null) {
                for (int var8 = 0; var8 < this.field802.length; var8++) {
                    var6.method1981(this.field802[var8], this.field800[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ac.p(B)Lac;")
    public final class36 method627() {
        int var1 = -1;
        if (this.field824 != -1) {
            var1 = class159.method127(this.field824);
        } else if (this.field832 != -1) {
            var1 = class159.field2680[this.field832];
        }
        return var1 < 0 || var1 >= this.field818.length || this.field818[var1] == -1 ? null : method80(this.field818[var1]);
    }

    @ObfuscatedName("ac.y(I)Z")
    public boolean method628() {
        if (this.field818 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field824 != -1) {
            var1 = class159.method127(this.field824);
        } else if (this.field832 != -1) {
            var1 = class159.field2680[this.field832];
        }
        return var1 >= 0 && var1 < this.field818.length && this.field818[var1] != -1;
    }

    @ObfuscatedName("dy.m(I)V")
    public static void method2101() {
        field809.method3229();
        field803.method3229();
    }
}
