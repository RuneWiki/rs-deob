package deob;

@ObfuscatedName("ae")
public class class36 extends class185 {

    @ObfuscatedName("ae.y")
    public static class174 field809 = new class174(64);

    @ObfuscatedName("ae.e")
    public static class174 field810 = new class174(50);

    @ObfuscatedName("ae.r")
    public int field844;

    @ObfuscatedName("ae.a")
    public String field812 = "null";

    @ObfuscatedName("ae.n")
    public int field813 = 1;

    @ObfuscatedName("ae.x")
    public int[] field814;

    @ObfuscatedName("ae.g")
    public int[] field826;

    @ObfuscatedName("ae.o")
    public int field816 = -1;

    @ObfuscatedName("ae.p")
    public int field840 = -1;

    @ObfuscatedName("ae.v")
    public int field818 = -1;

    @ObfuscatedName("ae.w")
    public int field830 = -1;

    @ObfuscatedName("ae.t")
    public int field820 = -1;

    @ObfuscatedName("ae.s")
    public int field807 = -1;

    @ObfuscatedName("ae.b")
    public int field822 = -1;

    @ObfuscatedName("ae.u")
    public short[] field823;

    @ObfuscatedName("ae.j")
    public short[] field824;

    @ObfuscatedName("ae.d")
    public short[] field825;

    @ObfuscatedName("ae.l")
    public short[] field831;

    @ObfuscatedName("ae.m")
    public String[] field827 = new String[5];

    @ObfuscatedName("ae.q")
    public boolean field828 = true;

    @ObfuscatedName("ae.h")
    public int field829 = -1;

    @ObfuscatedName("ae.c")
    public int field847 = 128;

    @ObfuscatedName("ae.z")
    public int field808 = 128;

    @ObfuscatedName("ae.i")
    public boolean field817 = false;

    @ObfuscatedName("ae.ah")
    public int field833 = 0;

    @ObfuscatedName("ae.aj")
    public int field834 = 0;

    @ObfuscatedName("ae.ar")
    public int field832 = -1;

    @ObfuscatedName("ae.al")
    public int field836 = 32;

    @ObfuscatedName("ae.aw")
    public int[] field837;

    @ObfuscatedName("ae.ao")
    public int field838 = -1;

    @ObfuscatedName("ae.ax")
    public int field839 = -1;

    @ObfuscatedName("ae.au")
    public boolean field819 = true;

    @ObfuscatedName("ae.av")
    public boolean field841 = true;

    @ObfuscatedName("ae.ae")
    public boolean field842 = false;

    @ObfuscatedName("ae.ak")
    public int field843 = 30;

    @ObfuscatedName("n.f(IB)Lae;")
    public static class36 method93(int arg0) {
        class36 var1 = (class36) field809.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field811.method2763(9, arg0);
        class36 var3 = new class36();
        var3.field844 = arg0;
        if (var2 != null) {
            var3.method650(new class108(var2));
        }
        var3.method672();
        field809.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.k(I)V")
    public void method672() {
    }

    @ObfuscatedName("ae.y(Ldu;I)V")
    public void method650(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method651(arg0, var2);
        }
    }

    @ObfuscatedName("ae.e(Ldu;II)V")
    public void method651(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2158();
            this.field814 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field814[var4] = arg0.method2160();
            }
        } else if (arg1 == 2) {
            this.field812 = arg0.method2275();
        } else if (arg1 == 12) {
            this.field813 = arg0.method2158();
        } else if (arg1 == 13) {
            this.field816 = arg0.method2160();
        } else if (arg1 == 14) {
            this.field830 = arg0.method2160();
        } else if (arg1 == 15) {
            this.field840 = arg0.method2160();
        } else if (arg1 == 16) {
            this.field818 = arg0.method2160();
        } else if (arg1 == 17) {
            this.field830 = arg0.method2160();
            this.field820 = arg0.method2160();
            this.field807 = arg0.method2160();
            this.field822 = arg0.method2160();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field827[arg1 - 30] = arg0.method2275();
            if (this.field827[arg1 - 30].equalsIgnoreCase(class145.field2369)) {
                this.field827[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2158();
            this.field823 = new short[var5];
            this.field824 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field823[var6] = (short) arg0.method2160();
                this.field824[var6] = (short) arg0.method2160();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2158();
            this.field825 = new short[var7];
            this.field831 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field825[var8] = (short) arg0.method2160();
                this.field831[var8] = (short) arg0.method2160();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2158();
            this.field826 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field826[var10] = arg0.method2160();
            }
        } else if (arg1 == 93) {
            this.field828 = false;
        } else if (arg1 == 95) {
            this.field829 = arg0.method2160();
        } else if (arg1 == 97) {
            this.field847 = arg0.method2160();
        } else if (arg1 == 98) {
            this.field808 = arg0.method2160();
        } else if (arg1 == 99) {
            this.field817 = true;
        } else if (arg1 == 100) {
            this.field833 = arg0.method2159();
        } else if (arg1 == 101) {
            this.field834 = arg0.method2159() * 5;
        } else if (arg1 == 102) {
            this.field832 = arg0.method2160();
        } else if (arg1 == 103) {
            this.field836 = arg0.method2160();
        } else if (arg1 == 106) {
            this.field838 = arg0.method2160();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            this.field839 = arg0.method2160();
            if (this.field839 == 65535) {
                this.field839 = -1;
            }
            int var11 = arg0.method2158();
            this.field837 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field837[var12] = arg0.method2160();
                if (this.field837[var12] == 65535) {
                    this.field837[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field819 = false;
        } else if (arg1 == 109) {
            this.field841 = false;
        } else if (arg1 == 111) {
            this.field842 = true;
        } else if (arg1 == 112) {
            this.field843 = arg0.method2158();
        }
    }

    @ObfuscatedName("ae.r(Lat;ILat;II)Lci;")
    public final class99 method668(class39 arg0, int arg1, class39 arg2, int arg3) {
        if (this.field837 != null) {
            class36 var5 = this.method657();
            return var5 == null ? null : var5.method668(arg0, arg1, arg2, arg3);
        }
        class99 var6 = (class99) field810.method3207((long) this.field844);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field814.length; var8++) {
                if (!Statics.field815.method2807(this.field814[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class94[] var9 = new class94[this.field814.length];
            for (int var10 = 0; var10 < this.field814.length; var10++) {
                var9[var10] = class94.method1925(Statics.field815, this.field814[var10], 0);
            }
            class94 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class94(var9, var9.length);
            }
            if (this.field823 != null) {
                for (int var12 = 0; var12 < this.field823.length; var12++) {
                    var11.method1939(this.field823[var12], this.field824[var12]);
                }
            }
            if (this.field825 != null) {
                for (int var13 = 0; var13 < this.field825.length; var13++) {
                    var11.method1944(this.field825[var13], this.field831[var13]);
                }
            }
            var6 = var11.method1946(this.field833 + 64, this.field834 + 850, -30, -50, -30);
            field810.method3209(var6, (long) this.field844);
        }
        class99 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method747(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method744(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2021(true);
        } else {
            var14 = arg2.method744(var6, arg3);
        }
        if (this.field847 != 128 || this.field808 != 128) {
            var14.method2035(this.field847, this.field808, this.field847);
        }
        return var14;
    }

    @ObfuscatedName("ae.a(I)Lcy;")
    public final class94 method653() {
        if (this.field837 != null) {
            class36 var1 = this.method657();
            return var1 == null ? null : var1.method653();
        } else if (this.field826 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field826.length; var3++) {
                if (!Statics.field815.method2807(this.field826[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class94[] var4 = new class94[this.field826.length];
            for (int var5 = 0; var5 < this.field826.length; var5++) {
                var4[var5] = class94.method1925(Statics.field815, this.field826[var5], 0);
            }
            class94 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class94(var4, var4.length);
            }
            if (this.field823 != null) {
                for (int var7 = 0; var7 < this.field823.length; var7++) {
                    var6.method1939(this.field823[var7], this.field824[var7]);
                }
            }
            if (this.field825 != null) {
                for (int var8 = 0; var8 < this.field825.length; var8++) {
                    var6.method1944(this.field825[var8], this.field831[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ae.n(I)Lae;")
    public final class36 method657() {
        int var1 = -1;
        if (this.field838 != -1) {
            var1 = class157.method33(this.field838);
        } else if (this.field839 != -1) {
            var1 = class157.field2680[this.field839];
        }
        return var1 < 0 || var1 >= this.field837.length || this.field837[var1] == -1 ? null : method93(this.field837[var1]);
    }

    @ObfuscatedName("ae.x(I)Z")
    public boolean method655() {
        if (this.field837 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field838 != -1) {
            var1 = class157.method33(this.field838);
        } else if (this.field839 != -1) {
            var1 = class157.field2680[this.field839];
        }
        return var1 >= 0 && var1 < this.field837.length && this.field837[var1] != -1;
    }
}
