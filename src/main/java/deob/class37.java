package deob;

@ObfuscatedName("al")
public class class37 extends class194 {

    @ObfuscatedName("al.h")
    public static class183 field811 = new class183(64);

    @ObfuscatedName("al.e")
    public static class183 field812 = new class183(50);

    @ObfuscatedName("al.n")
    public int field813;

    @ObfuscatedName("al.t")
    public String field814 = "null";

    @ObfuscatedName("al.l")
    public int field815 = 1;

    @ObfuscatedName("al.m")
    public int[] field810;

    @ObfuscatedName("al.o")
    public int[] field817;

    @ObfuscatedName("al.k")
    public int field835 = -1;

    @ObfuscatedName("al.p")
    public int field819 = -1;

    @ObfuscatedName("al.u")
    public int field820 = -1;

    @ObfuscatedName("al.g")
    public int field821 = -1;

    @ObfuscatedName("al.a")
    public int field822 = -1;

    @ObfuscatedName("al.y")
    public int field827 = -1;

    @ObfuscatedName("al.d")
    public int field830 = -1;

    @ObfuscatedName("al.b")
    public short[] field825;

    @ObfuscatedName("al.j")
    public short[] field824;

    @ObfuscatedName("al.f")
    public short[] field818;

    @ObfuscatedName("al.w")
    public short[] field826;

    @ObfuscatedName("al.z")
    public String[] field845 = new String[5];

    @ObfuscatedName("al.x")
    public boolean field833 = true;

    @ObfuscatedName("al.v")
    public int field823 = -1;

    @ObfuscatedName("al.i")
    public int field832 = 128;

    @ObfuscatedName("al.c")
    public int field829 = 128;

    @ObfuscatedName("al.r")
    public boolean field834 = false;

    @ObfuscatedName("al.an")
    public int field816 = 0;

    @ObfuscatedName("al.ad")
    public int field836 = 0;

    @ObfuscatedName("al.ai")
    public int field837 = -1;

    @ObfuscatedName("al.ae")
    public int field838 = 32;

    @ObfuscatedName("al.aq")
    public int[] field839;

    @ObfuscatedName("al.av")
    public int field840 = -1;

    @ObfuscatedName("al.am")
    public int field841 = -1;

    @ObfuscatedName("al.ac")
    public boolean field842 = true;

    @ObfuscatedName("al.ak")
    public boolean field843 = true;

    @ObfuscatedName("al.aa")
    public boolean field844 = false;

    @ObfuscatedName("al.al")
    public int field828 = 30;

    @ObfuscatedName("ac.q(Lff;Lff;I)V")
    public static void method600(class158 arg0, class158 arg1) {
        Statics.field831 = arg0;
        Statics.field1658 = arg1;
    }

    @ObfuscatedName("cu.s(II)Lal;")
    public static class37 method1870(int arg0) {
        class37 var1 = (class37) field811.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field831.method2811(9, arg0);
        class37 var3 = new class37();
        var3.field813 = arg0;
        if (var2 != null) {
            var3.method621(new class111(var2));
        }
        var3.method652();
        field811.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.h(B)V")
    public void method652() {
    }

    @ObfuscatedName("al.e(Ldx;B)V")
    public void method621(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method622(arg0, var2);
        }
    }

    @ObfuscatedName("al.n(Ldx;II)V")
    public void method622(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2231();
            this.field810 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field810[var4] = arg0.method2307();
            }
        } else if (arg1 == 2) {
            this.field814 = arg0.method2156();
        } else if (arg1 == 12) {
            this.field815 = arg0.method2231();
        } else if (arg1 == 13) {
            this.field835 = arg0.method2307();
        } else if (arg1 == 14) {
            this.field821 = arg0.method2307();
        } else if (arg1 == 15) {
            this.field819 = arg0.method2307();
        } else if (arg1 == 16) {
            this.field820 = arg0.method2307();
        } else if (arg1 == 17) {
            this.field821 = arg0.method2307();
            this.field822 = arg0.method2307();
            this.field827 = arg0.method2307();
            this.field830 = arg0.method2307();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field845[arg1 - 30] = arg0.method2156();
            if (this.field845[arg1 - 30].equalsIgnoreCase(class148.field2156)) {
                this.field845[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2231();
            this.field825 = new short[var5];
            this.field824 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field825[var6] = (short) arg0.method2307();
                this.field824[var6] = (short) arg0.method2307();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2231();
            this.field818 = new short[var7];
            this.field826 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field818[var8] = (short) arg0.method2307();
                this.field826[var8] = (short) arg0.method2307();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2231();
            this.field817 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field817[var10] = arg0.method2307();
            }
        } else if (arg1 == 93) {
            this.field833 = false;
        } else if (arg1 == 95) {
            this.field823 = arg0.method2307();
        } else if (arg1 == 97) {
            this.field832 = arg0.method2307();
        } else if (arg1 == 98) {
            this.field829 = arg0.method2307();
        } else if (arg1 == 99) {
            this.field834 = true;
        } else if (arg1 == 100) {
            this.field816 = arg0.method2149();
        } else if (arg1 == 101) {
            this.field836 = arg0.method2149();
        } else if (arg1 == 102) {
            this.field837 = arg0.method2307();
        } else if (arg1 == 103) {
            this.field838 = arg0.method2307();
        } else if (arg1 == 106) {
            this.field840 = arg0.method2307();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            this.field841 = arg0.method2307();
            if (this.field841 == 65535) {
                this.field841 = -1;
            }
            int var11 = arg0.method2231();
            this.field839 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field839[var12] = arg0.method2307();
                if (this.field839[var12] == 65535) {
                    this.field839[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field842 = false;
        } else if (arg1 == 109) {
            this.field843 = false;
        } else if (arg1 == 111) {
            this.field844 = true;
        } else if (arg1 == 112) {
            this.field828 = arg0.method2231();
        }
    }

    @ObfuscatedName("al.t(Las;ILas;II)Lch;")
    public final class100 method642(class40 arg0, int arg1, class40 arg2, int arg3) {
        if (this.field839 != null) {
            class37 var5 = this.method625();
            return var5 == null ? null : var5.method642(arg0, arg1, arg2, arg3);
        }
        class100 var6 = (class100) field812.method3243((long) this.field813);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field810.length; var8++) {
                if (!Statics.field1658.method2877(this.field810[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class95[] var9 = new class95[this.field810.length];
            for (int var10 = 0; var10 < this.field810.length; var10++) {
                var9[var10] = class95.method1899(Statics.field1658, this.field810[var10], 0);
            }
            class95 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class95(var9, var9.length);
            }
            if (this.field825 != null) {
                for (int var12 = 0; var12 < this.field825.length; var12++) {
                    var11.method1912(this.field825[var12], this.field824[var12]);
                }
            }
            if (this.field818 != null) {
                for (int var13 = 0; var13 < this.field818.length; var13++) {
                    var11.method1913(this.field818[var13], this.field826[var13]);
                }
            }
            var6 = var11.method1965(this.field816 + 64, this.field836 * 5 + 850, -30, -50, -30);
            field812.method3253(var6, (long) this.field813);
        }
        class100 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method728(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method725(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method1992(true);
        } else {
            var14 = arg2.method725(var6, arg3);
        }
        if (this.field832 != 128 || this.field829 != 128) {
            var14.method2006(this.field832, this.field829, this.field832);
        }
        return var14;
    }

    @ObfuscatedName("al.l(B)Lcl;")
    public final class95 method653() {
        if (this.field839 != null) {
            class37 var1 = this.method625();
            return var1 == null ? null : var1.method653();
        } else if (this.field817 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field817.length; var3++) {
                if (!Statics.field1658.method2877(this.field817[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class95[] var4 = new class95[this.field817.length];
            for (int var5 = 0; var5 < this.field817.length; var5++) {
                var4[var5] = class95.method1899(Statics.field1658, this.field817[var5], 0);
            }
            class95 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class95(var4, var4.length);
            }
            if (this.field825 != null) {
                for (int var7 = 0; var7 < this.field825.length; var7++) {
                    var6.method1912(this.field825[var7], this.field824[var7]);
                }
            }
            if (this.field818 != null) {
                for (int var8 = 0; var8 < this.field818.length; var8++) {
                    var6.method1913(this.field818[var8], this.field826[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("al.m(B)Lal;")
    public final class37 method625() {
        int var1 = -1;
        if (this.field840 != -1) {
            var1 = class166.method531(this.field840);
        } else if (this.field841 != -1) {
            var1 = class166.field2742[this.field841];
        }
        return var1 < 0 || var1 >= this.field839.length || this.field839[var1] == -1 ? null : method1870(this.field839[var1]);
    }

    @ObfuscatedName("al.o(I)Z")
    public boolean method638() {
        if (this.field839 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field840 != -1) {
            var1 = class166.method531(this.field840);
        } else if (this.field841 != -1) {
            var1 = class166.field2742[this.field841];
        }
        return var1 >= 0 && var1 < this.field839.length && this.field839[var1] != -1;
    }
}
