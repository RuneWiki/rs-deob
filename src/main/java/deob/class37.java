package deob;

@ObfuscatedName("au")
public class class37 extends class195 {

    @ObfuscatedName("au.a")
    public static class184 field823 = new class184(64);

    @ObfuscatedName("au.k")
    public static class184 field832 = new class184(50);

    @ObfuscatedName("au.p")
    public int field811;

    @ObfuscatedName("au.l")
    public String field812 = "null";

    @ObfuscatedName("au.u")
    public int field819 = 1;

    @ObfuscatedName("au.o")
    public int[] field814;

    @ObfuscatedName("au.m")
    public int[] field834;

    @ObfuscatedName("au.q")
    public int field816 = -1;

    @ObfuscatedName("au.v")
    public int field817 = -1;

    @ObfuscatedName("au.n")
    public int field809 = -1;

    @ObfuscatedName("au.z")
    public int field818 = -1;

    @ObfuscatedName("au.r")
    public int field827 = -1;

    @ObfuscatedName("au.i")
    public int field810 = -1;

    @ObfuscatedName("au.s")
    public int field822 = -1;

    @ObfuscatedName("au.c")
    public short[] field837;

    @ObfuscatedName("au.t")
    public short[] field824;

    @ObfuscatedName("au.h")
    public short[] field845;

    @ObfuscatedName("au.w")
    public short[] field826;

    @ObfuscatedName("au.g")
    public String[] field821 = new String[5];

    @ObfuscatedName("au.f")
    public boolean field828 = true;

    @ObfuscatedName("au.y")
    public int field829 = -1;

    @ObfuscatedName("au.j")
    public int field830 = 128;

    @ObfuscatedName("au.x")
    public int field831 = 128;

    @ObfuscatedName("au.d")
    public boolean field807 = false;

    @ObfuscatedName("au.ax")
    public int field820 = 0;

    @ObfuscatedName("au.ag")
    public int field839 = 0;

    @ObfuscatedName("au.ai")
    public int field835 = -1;

    @ObfuscatedName("au.ar")
    public int field815 = 32;

    @ObfuscatedName("au.aw")
    public int[] field825;

    @ObfuscatedName("au.ac")
    public int field838 = -1;

    @ObfuscatedName("au.ap")
    public int field836 = -1;

    @ObfuscatedName("au.al")
    public boolean field840 = true;

    @ObfuscatedName("au.ak")
    public boolean field841 = true;

    @ObfuscatedName("au.at")
    public boolean field842 = false;

    @ObfuscatedName("au.au")
    public int field843 = 30;

    @ObfuscatedName("ad.b(IB)Lau;")
    public static class37 method890(int arg0) {
        class37 var1 = (class37) field823.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field833.method2819(9, arg0);
        class37 var3 = new class37();
        var3.field811 = arg0;
        if (var2 != null) {
            var3.method644(new class111(var2));
        }
        var3.method639();
        field823.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.e(I)V")
    public void method639() {
    }

    @ObfuscatedName("au.a(Ldj;I)V")
    public void method644(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method668(arg0, var2);
        }
    }

    @ObfuscatedName("au.k(Ldj;II)V")
    public void method668(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2127();
            this.field814 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field814[var4] = arg0.method2129();
            }
        } else if (arg1 == 2) {
            this.field812 = arg0.method2166();
        } else if (arg1 == 12) {
            this.field819 = arg0.method2127();
        } else if (arg1 == 13) {
            this.field816 = arg0.method2129();
        } else if (arg1 == 14) {
            this.field818 = arg0.method2129();
        } else if (arg1 == 15) {
            this.field817 = arg0.method2129();
        } else if (arg1 == 16) {
            this.field809 = arg0.method2129();
        } else if (arg1 == 17) {
            this.field818 = arg0.method2129();
            this.field827 = arg0.method2129();
            this.field810 = arg0.method2129();
            this.field822 = arg0.method2129();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field821[arg1 - 30] = arg0.method2166();
            if (this.field821[arg1 - 30].equalsIgnoreCase(class148.field2239)) {
                this.field821[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2127();
            this.field837 = new short[var5];
            this.field824 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field837[var6] = (short) arg0.method2129();
                this.field824[var6] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2127();
            this.field845 = new short[var7];
            this.field826 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field845[var8] = (short) arg0.method2129();
                this.field826[var8] = (short) arg0.method2129();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2127();
            this.field834 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field834[var10] = arg0.method2129();
            }
        } else if (arg1 == 93) {
            this.field828 = false;
        } else if (arg1 == 95) {
            this.field829 = arg0.method2129();
        } else if (arg1 == 97) {
            this.field830 = arg0.method2129();
        } else if (arg1 == 98) {
            this.field831 = arg0.method2129();
        } else if (arg1 == 99) {
            this.field807 = true;
        } else if (arg1 == 100) {
            this.field820 = arg0.method2267();
        } else if (arg1 == 101) {
            this.field839 = arg0.method2267() * 5;
        } else if (arg1 == 102) {
            this.field835 = arg0.method2129();
        } else if (arg1 == 103) {
            this.field815 = arg0.method2129();
        } else if (arg1 == 106) {
            this.field838 = arg0.method2129();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            this.field836 = arg0.method2129();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }
            int var11 = arg0.method2127();
            this.field825 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field825[var12] = arg0.method2129();
                if (this.field825[var12] == 65535) {
                    this.field825[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field840 = false;
        } else if (arg1 == 109) {
            this.field841 = false;
        } else if (arg1 == 111) {
            this.field842 = true;
        } else if (arg1 == 112) {
            this.field843 = arg0.method2127();
        }
    }

    @ObfuscatedName("au.p(Laz;ILaz;II)Lcx;")
    public final class100 method638(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field825 != null) {
            class37 var5 = this.method654();
            return var5 == null ? null : var5.method638(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field832.method3254((long) this.field811);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field814.length; var8++) {
                if (!Statics.field813.method2821(this.field814[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field814.length];
            for (int var10 = 0; var10 < this.field814.length; var10++) {
                var9[var10] = class95.method1878(Statics.field813, this.field814[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field837 != null) {
                for (int var12 = 0; var12 < this.field837.length; var12++) {
                    var11.method1877(this.field837[var12], this.field824[var12]);
                }
            }
            if (this.field845 != null) {
                for (int var13 = 0; var13 < this.field845.length; var13++) {
                    var11.method1891(this.field845[var13], this.field826[var13]);
                }
            }
            var6 = var11.method1898(this.field820 + 64, this.field839 + 850, -30, -50, -30);
            field832.method3256(var6, (long) this.field811);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method736(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method733(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1988(true);
        } else {
            var14 = arg2.method733(var6, arg3);
        }
        if (this.field830 != 128 || this.field831 != 128) {
            var14.method1985(this.field830, this.field831, this.field830);
        }
        return var14;
    }

    @ObfuscatedName("au.l(I)Lcc;")
    public final class95 method642() {
        if (this.field825 != null) {
            class37 var1 = this.method654();
            return var1 == null ? null : var1.method642();
        } else if (this.field834 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field834.length; var3++) {
                if (!Statics.field813.method2821(this.field834[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field834.length];
            for (int var5 = 0; var5 < this.field834.length; var5++) {
                var4[var5] = class95.method1878(Statics.field813, this.field834[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field837 != null) {
                for (int var7 = 0; var7 < this.field837.length; var7++) {
                    var6.method1877(this.field837[var7], this.field824[var7]);
                }
            }
            if (this.field845 != null) {
                for (int var8 = 0; var8 < this.field845.length; var8++) {
                    var6.method1891(this.field845[var8], this.field826[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("au.u(I)Lau;")
    public final class37 method654() {
        int var1 = -1;
        if (this.field838 != -1) {
            var1 = class167.method931(this.field838);
        } else if (this.field836 != -1) {
            var1 = class167.field2786[this.field836];
        }
        return var1 < 0 || var1 >= this.field825.length || this.field825[var1] == -1 ? null : method890(this.field825[var1]);
    }

    @ObfuscatedName("au.o(I)Z")
    public boolean method643() {
        if (this.field825 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field838 != -1) {
            var1 = class167.method931(this.field838);
        } else if (this.field836 != -1) {
            var1 = class167.field2786[this.field836];
        }
        return var1 >= 0 && var1 < this.field825.length && this.field825[var1] != -1;
    }
}
