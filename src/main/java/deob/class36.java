package deob;

@ObfuscatedName("ak")
public class class36 extends class187 {

    @ObfuscatedName("ak.i")
    public static class176 field800 = new class176(64);

    @ObfuscatedName("ak.k")
    public static class176 field801 = new class176(50);

    @ObfuscatedName("ak.h")
    public int field802;

    @ObfuscatedName("ak.p")
    public String field803 = "null";

    @ObfuscatedName("ak.n")
    public int field804 = 1;

    @ObfuscatedName("ak.o")
    public int[] field805;

    @ObfuscatedName("ak.g")
    public int[] field806;

    @ObfuscatedName("ak.z")
    public int field829 = -1;

    @ObfuscatedName("ak.t")
    public int field832 = -1;

    @ObfuscatedName("ak.y")
    public int field809 = -1;

    @ObfuscatedName("ak.w")
    public int field825 = -1;

    @ObfuscatedName("ak.x")
    public int field811 = -1;

    @ObfuscatedName("ak.v")
    public int field812 = -1;

    @ObfuscatedName("ak.q")
    public int field834 = -1;

    @ObfuscatedName("ak.f")
    public short[] field817;

    @ObfuscatedName("ak.s")
    public short[] field798;

    @ObfuscatedName("ak.a")
    public short[] field816;

    @ObfuscatedName("ak.m")
    public short[] field820;

    @ObfuscatedName("ak.c")
    public String[] field818 = new String[5];

    @ObfuscatedName("ak.j")
    public boolean field819 = true;

    @ObfuscatedName("ak.d")
    public int field807 = -1;

    @ObfuscatedName("ak.l")
    public int field821 = 128;

    @ObfuscatedName("ak.u")
    public int field822 = 128;

    @ObfuscatedName("ak.r")
    public boolean field823 = false;

    @ObfuscatedName("ak.an")
    public int field824 = 0;

    @ObfuscatedName("ak.ao")
    public int field813 = 0;

    @ObfuscatedName("ak.ah")
    public int field826 = -1;

    @ObfuscatedName("ak.ai")
    public int field827 = 32;

    @ObfuscatedName("ak.aa")
    public int[] field828;

    @ObfuscatedName("ak.ag")
    public int field808 = -1;

    @ObfuscatedName("ak.ar")
    public int field830 = -1;

    @ObfuscatedName("ak.al")
    public boolean field831 = true;

    @ObfuscatedName("ak.ae")
    public boolean field815 = true;

    @ObfuscatedName("ak.ak")
    public boolean field833 = false;

    @ObfuscatedName("ak.at")
    public int field810 = 30;

    @ObfuscatedName("eq.b(Lex;Lex;B)V")
    public static void method2707(class151 arg0, class151 arg1) {
        Statics.field837 = arg0;
        Statics.field799 = arg1;
    }

    @ObfuscatedName("da.e(II)Lak;")
    public static class36 method2556(int arg0) {
        class36 var1 = (class36) field800.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field837.method2761(9, arg0);
        class36 var3 = new class36();
        var3.field802 = arg0;
        if (var2 != null) {
            var3.method636(new class110(var2));
        }
        var3.method610();
        field800.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.i(B)V")
    public void method610() {
    }

    @ObfuscatedName("ak.k(Ldc;B)V")
    public void method636(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method644(arg0, var2);
        }
    }

    @ObfuscatedName("ak.h(Ldc;II)V")
    public void method644(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2142();
            this.field805 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field805[var4] = arg0.method2292();
            }
        } else if (arg1 == 2) {
            this.field803 = arg0.method2150();
        } else if (arg1 == 12) {
            this.field804 = arg0.method2142();
        } else if (arg1 == 13) {
            this.field829 = arg0.method2292();
        } else if (arg1 == 14) {
            this.field825 = arg0.method2292();
        } else if (arg1 == 15) {
            this.field832 = arg0.method2292();
        } else if (arg1 == 16) {
            this.field809 = arg0.method2292();
        } else if (arg1 == 17) {
            this.field825 = arg0.method2292();
            this.field811 = arg0.method2292();
            this.field812 = arg0.method2292();
            this.field834 = arg0.method2292();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field818[arg1 - 30] = arg0.method2150();
            if (this.field818[arg1 - 30].equalsIgnoreCase(class147.field2178)) {
                this.field818[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2142();
            this.field817 = new short[var5];
            this.field798 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field817[var6] = (short) arg0.method2292();
                this.field798[var6] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2142();
            this.field816 = new short[var7];
            this.field820 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field816[var8] = (short) arg0.method2292();
                this.field820[var8] = (short) arg0.method2292();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2142();
            this.field806 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field806[var10] = arg0.method2292();
            }
        } else if (arg1 == 93) {
            this.field819 = false;
        } else if (arg1 == 95) {
            this.field807 = arg0.method2292();
        } else if (arg1 == 97) {
            this.field821 = arg0.method2292();
        } else if (arg1 == 98) {
            this.field822 = arg0.method2292();
        } else if (arg1 == 99) {
            this.field823 = true;
        } else if (arg1 == 100) {
            this.field824 = arg0.method2294();
        } else if (arg1 == 101) {
            this.field813 = arg0.method2294() * 5;
        } else if (arg1 == 102) {
            this.field826 = arg0.method2292();
        } else if (arg1 == 103) {
            this.field827 = arg0.method2292();
        } else if (arg1 == 106) {
            this.field808 = arg0.method2292();
            if (this.field808 == 65535) {
                this.field808 = -1;
            }
            this.field830 = arg0.method2292();
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
            int var11 = arg0.method2142();
            this.field828 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field828[var12] = arg0.method2292();
                if (this.field828[var12] == 65535) {
                    this.field828[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field831 = false;
        } else if (arg1 == 109) {
            this.field815 = false;
        } else if (arg1 == 111) {
            this.field833 = true;
        } else if (arg1 == 112) {
            this.field810 = arg0.method2142();
        }
    }

    @ObfuscatedName("ak.p(Law;ILaw;II)Lcr;")
    public final class99 method640(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field828 != null) {
            class36 var5 = this.method615();
            return var5 == null ? null : var5.method640(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field801.method3218((long) this.field802);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field805.length; var8++) {
                if (!Statics.field799.method2824(this.field805[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field805.length];
            for (int var10 = 0; var10 < this.field805.length; var10++) {
                var9[var10] = class94.method1874(Statics.field799, this.field805[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field817 != null) {
                for (int var12 = 0; var12 < this.field817.length; var12++) {
                    var11.method1879(this.field817[var12], this.field798[var12]);
                }
            }
            if (this.field816 != null) {
                for (int var13 = 0; var13 < this.field816.length; var13++) {
                    var11.method1892(this.field816[var13], this.field820[var13]);
                }
            }
            var6 = var11.method1940(this.field824 + 64, this.field813 + 850, -30, -50, -30);
            field801.method3220(var6, (long) this.field802);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method722(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method720(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2008(true);
        } else {
            var14 = arg2.method720(var6, arg3);
        }
        if (this.field821 != 128 || this.field822 != 128) {
            var14.method2022(this.field821, this.field822, this.field821);
        }
        return var14;
    }

    @ObfuscatedName("ak.n(B)Lcs;")
    public final class94 method614() {
        if (this.field828 != null) {
            class36 var1 = this.method615();
            return var1 == null ? null : var1.method614();
        } else if (this.field806 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field806.length; var3++) {
                if (!Statics.field799.method2824(this.field806[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field806.length];
            for (int var5 = 0; var5 < this.field806.length; var5++) {
                var4[var5] = class94.method1874(Statics.field799, this.field806[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field817 != null) {
                for (int var7 = 0; var7 < this.field817.length; var7++) {
                    var6.method1879(this.field817[var7], this.field798[var7]);
                }
            }
            if (this.field816 != null) {
                for (int var8 = 0; var8 < this.field816.length; var8++) {
                    var6.method1892(this.field816[var8], this.field820[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ak.o(I)Lak;")
    public final class36 method615() {
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class159.method2741(this.field808);
        } else if (this.field830 != -1) {
            var1 = class159.field2692[this.field830];
        }
        return var1 < 0 || var1 >= this.field828.length || this.field828[var1] == -1 ? null : method2556(this.field828[var1]);
    }

    @ObfuscatedName("ak.g(I)Z")
    public boolean method623() {
        if (this.field828 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field808 != -1) {
            var1 = class159.method2741(this.field808);
        } else if (this.field830 != -1) {
            var1 = class159.field2692[this.field830];
        }
        return var1 >= 0 && var1 < this.field828.length && this.field828[var1] != -1;
    }

    @ObfuscatedName("ez.z(I)V")
    public static void method2867() {
        field800.method3231();
        field801.method3231();
    }
}
