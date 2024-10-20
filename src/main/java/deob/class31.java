package deob;

@ObfuscatedName("ac")
public class class31 extends class173 {

    @ObfuscatedName("ac.p")
    public static boolean field842 = false;

    @ObfuscatedName("ac.h")
    public static class169 field854 = new class169(64);

    @ObfuscatedName("ac.v")
    public static class169 field818 = new class169(500);

    @ObfuscatedName("ac.k")
    public static class169 field839 = new class169(30);

    @ObfuscatedName("ac.g")
    public static class169 field820 = new class169(30);

    @ObfuscatedName("ac.n")
    public static class100[] field828 = new class100[4];

    @ObfuscatedName("ac.c")
    public int field822;

    @ObfuscatedName("ac.o")
    public int[] field814;

    @ObfuscatedName("ac.u")
    public int[] field824;

    @ObfuscatedName("ac.z")
    public String field825 = "null";

    @ObfuscatedName("ac.e")
    public short[] field826;

    @ObfuscatedName("ac.l")
    public short[] field827;

    @ObfuscatedName("ac.m")
    public short[] field850;

    @ObfuscatedName("ac.s")
    public short[] field829;

    @ObfuscatedName("ac.i")
    public int field830 = 1;

    @ObfuscatedName("ac.y")
    public int field831 = 1;

    @ObfuscatedName("ac.d")
    public int field849 = 2;

    @ObfuscatedName("ac.f")
    public boolean field832 = true;

    @ObfuscatedName("ac.a")
    public int field834 = -1;

    @ObfuscatedName("ac.x")
    public int field835 = -1;

    @ObfuscatedName("ac.r")
    public boolean field836 = false;

    @ObfuscatedName("ac.t")
    public boolean field823 = false;

    @ObfuscatedName("ac.b")
    public int field838 = -1;

    @ObfuscatedName("ac.q")
    public int field840 = 16;

    @ObfuscatedName("ac.ae")
    public int field853 = 0;

    @ObfuscatedName("ac.at")
    public int field841 = 0;

    @ObfuscatedName("ac.aj")
    public String[] field837 = new String[5];

    @ObfuscatedName("ac.aq")
    public int field843 = -1;

    @ObfuscatedName("ac.ac")
    public int field833 = -1;

    @ObfuscatedName("ac.az")
    public boolean field845 = false;

    @ObfuscatedName("ac.ao")
    public boolean field817 = true;

    @ObfuscatedName("ac.am")
    public int field847 = 128;

    @ObfuscatedName("ac.ad")
    public int field848 = 128;

    @ObfuscatedName("ac.an")
    public int field846 = 128;

    @ObfuscatedName("ac.al")
    public int field844 = 0;

    @ObfuscatedName("ac.ab")
    public int field855 = 0;

    @ObfuscatedName("ac.af")
    public int field852 = 0;

    @ObfuscatedName("ac.ap")
    public int field819 = 0;

    @ObfuscatedName("ac.as")
    public boolean field857 = false;

    @ObfuscatedName("ac.av")
    public boolean field856 = false;

    @ObfuscatedName("ac.ay")
    public int field821 = -1;

    @ObfuscatedName("ac.ah")
    public int[] field851;

    @ObfuscatedName("ac.aa")
    public int field858 = -1;

    @ObfuscatedName("ac.ag")
    public int field859 = -1;

    @ObfuscatedName("ac.au")
    public int field860 = -1;

    @ObfuscatedName("ac.aw")
    public int field861 = 0;

    @ObfuscatedName("ac.ar")
    public int field862 = 0;

    @ObfuscatedName("ac.ai")
    public int field863 = 0;

    @ObfuscatedName("ac.ak")
    public int[] field864;

    @ObfuscatedName("y.p(Ler;Ler;ZI)V")
    public static void method165(class151 arg0, class151 arg1, boolean arg2) {
        Statics.field815 = arg0;
        Statics.field816 = arg1;
        field842 = arg2;
    }

    @ObfuscatedName("f.j(II)Lac;")
    public static class31 method187(int arg0) {
        class31 var1 = (class31) field854.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field815.method2973(6, arg0);
        class31 var3 = new class31();
        var3.field822 = arg0;
        if (var2 != null) {
            var3.method599(new class126(var2));
        }
        var3.method598();
        if (var3.field856) {
            var3.field849 = 0;
            var3.field832 = false;
        }
        field854.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.w(B)V")
    public void method598() {
        if (this.field834 == -1) {
            this.field834 = 0;
            if (this.field814 != null && (this.field824 == null || this.field824[0] == 10)) {
                this.field834 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field837[var1] != null) {
                    this.field834 = 1;
                }
            }
        }
        if (this.field821 == -1) {
            this.field821 = this.field849 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ac.h(Ldv;B)V")
    public void method599(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method648(arg0, var2);
        }
    }

    @ObfuscatedName("ac.v(Ldv;IB)V")
    public void method648(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2544();
            if (var3 > 0) {
                if (this.field814 == null || field842) {
                    this.field824 = new int[var3];
                    this.field814 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field814[var4] = arg0.method2489();
                        this.field824[var4] = arg0.method2544();
                    }
                } else {
                    arg0.field2043 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field825 = arg0.method2383();
        } else if (arg1 == 5) {
            int var5 = arg0.method2544();
            if (var5 > 0) {
                if (this.field814 == null || field842) {
                    this.field824 = null;
                    this.field814 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field814[var6] = arg0.method2489();
                    }
                } else {
                    arg0.field2043 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field830 = arg0.method2544();
        } else if (arg1 == 15) {
            this.field831 = arg0.method2544();
        } else if (arg1 == 17) {
            this.field849 = 0;
            this.field832 = false;
        } else if (arg1 == 18) {
            this.field832 = false;
        } else if (arg1 == 19) {
            this.field834 = arg0.method2544();
        } else if (arg1 == 21) {
            this.field835 = 0;
        } else if (arg1 == 22) {
            this.field836 = true;
        } else if (arg1 == 23) {
            this.field823 = true;
        } else if (arg1 == 24) {
            this.field838 = arg0.method2489();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
        } else if (arg1 == 27) {
            this.field849 = 1;
        } else if (arg1 == 28) {
            this.field840 = arg0.method2544();
        } else if (arg1 == 29) {
            this.field853 = arg0.method2376();
        } else if (arg1 == 39) {
            this.field841 = arg0.method2376();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field837[arg1 - 30] = arg0.method2383();
            if (this.field837[arg1 - 30].equalsIgnoreCase(class133.field2140)) {
                this.field837[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2544();
            this.field826 = new short[var7];
            this.field827 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field826[var8] = (short) arg0.method2489();
                this.field827[var8] = (short) arg0.method2489();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2544();
            this.field850 = new short[var9];
            this.field829 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field850[var10] = (short) arg0.method2489();
                this.field829[var10] = (short) arg0.method2489();
            }
        } else if (arg1 == 60) {
            this.field843 = arg0.method2489();
        } else if (arg1 == 62) {
            this.field845 = true;
        } else if (arg1 == 64) {
            this.field817 = false;
        } else if (arg1 == 65) {
            this.field847 = arg0.method2489();
        } else if (arg1 == 66) {
            this.field848 = arg0.method2489();
        } else if (arg1 == 67) {
            this.field846 = arg0.method2489();
        } else if (arg1 == 68) {
            this.field833 = arg0.method2489();
        } else if (arg1 == 69) {
            this.field819 = arg0.method2544();
        } else if (arg1 == 70) {
            this.field844 = arg0.method2378();
        } else if (arg1 == 71) {
            this.field855 = arg0.method2378();
        } else if (arg1 == 72) {
            this.field852 = arg0.method2378();
        } else if (arg1 == 73) {
            this.field857 = true;
        } else if (arg1 == 74) {
            this.field856 = true;
        } else if (arg1 == 75) {
            this.field821 = arg0.method2544();
        } else if (arg1 == 77) {
            this.field858 = arg0.method2489();
            if (this.field858 == 65535) {
                this.field858 = -1;
            }
            this.field859 = arg0.method2489();
            if (this.field859 == 65535) {
                this.field859 = -1;
            }
            int var11 = arg0.method2544();
            this.field851 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field851[var12] = arg0.method2489();
                if (this.field851[var12] == 65535) {
                    this.field851[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field860 = arg0.method2489();
            this.field861 = arg0.method2544();
        } else if (arg1 == 79) {
            this.field862 = arg0.method2489();
            this.field863 = arg0.method2489();
            this.field861 = arg0.method2544();
            int var13 = arg0.method2544();
            this.field864 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field864[var14] = arg0.method2489();
            }
        } else if (arg1 == 81) {
            this.field835 = arg0.method2544() * 256;
        }
    }

    @ObfuscatedName("ac.k(II)Z")
    public final boolean method601(int arg0) {
        if (this.field824 != null) {
            for (int var4 = 0; var4 < this.field824.length; var4++) {
                if (this.field824[var4] == arg0) {
                    return Statics.field816.method2915(this.field814[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field814 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field814.length; var3++) {
                var2 &= Statics.field816.method2915(this.field814[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ac.g(I)Z")
    public final boolean method633() {
        if (this.field814 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field814.length; var2++) {
            var1 &= Statics.field816.method2915(this.field814[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ac.n(II[[IIIII)Lca;")
    public final class93 method603(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field824 == null) {
            var7 = (long) ((this.field822 << 10) + arg1);
        } else {
            var7 = (long) ((this.field822 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field839.method3214(var7);
        if (var9 == null) {
            class100 var10 = this.method600(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field836) {
                var10.field1725 = (short) (this.field853 + 64);
                var10.field1726 = (short) (this.field841 * 25 + 768);
                var10.method2078();
                var9 = var10;
            } else {
                var9 = var10.method2042(this.field853 + 64, this.field841 * 25 + 768, -50, -10, -50);
            }
            field839.method3223(var9, var7);
        }
        if (this.field836) {
            var9 = ((class100) var9).method2002();
        }
        if (this.field835 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2180(arg2, arg3, arg4, arg5, true, this.field835);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2003(arg2, arg3, arg4, arg5, true, this.field835);
            }
        }
        return var9;
    }

    @ObfuscatedName("ac.c(II[[IIIII)Ldm;")
    public final class111 method604(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field824 == null) {
            var7 = (long) ((this.field822 << 10) + arg1);
        } else {
            var7 = (long) ((this.field822 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field820.method3214(var7);
        if (var9 == null) {
            class100 var10 = this.method600(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2042(this.field853 + 64, this.field841 * 25 + 768, -50, -10, -50);
            field820.method3223(var9, var7);
        }
        if (this.field835 >= 0) {
            var9 = var9.method2180(arg2, arg3, arg4, arg5, true, this.field835);
        }
        return var9;
    }

    @ObfuscatedName("ac.o(II[[IIIILao;II)Ldm;")
    public final class111 method605(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field824 == null) {
            var9 = (long) ((this.field822 << 10) + arg1);
        } else {
            var9 = (long) ((this.field822 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field820.method3214(var9);
        if (var11 == null) {
            class100 var12 = this.method600(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2042(this.field853 + 64, this.field841 * 25 + 768, -50, -10, -50);
            field820.method3223(var11, var9);
        }
        if (arg6 == null && this.field835 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2181(true);
        } else {
            var13 = arg6.method675(var11, arg7, arg1);
        }
        if (this.field835 >= 0) {
            var13 = var13.method2180(arg2, arg3, arg4, arg5, false, this.field835);
        }
        return var13;
    }

    @ObfuscatedName("ac.u(III)Lcu;")
    public final class100 method600(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field824 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field814 == null) {
                return null;
            }
            boolean var4 = this.field845;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field814.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field814[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field818.method3214((long) var7);
                if (var3 == null) {
                    var3 = class100.method1997(Statics.field816, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2069();
                    }
                    field818.method3223(var3, (long) var7);
                }
                if (var5 > 1) {
                    field828[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field828, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field824.length; var9++) {
                if (this.field824[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field814[var8];
            boolean var11 = this.field845 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field818.method3214((long) var10);
            if (var3 == null) {
                var3 = class100.method1997(Statics.field816, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2069();
                }
                field818.method3223(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field847 == 128 && this.field848 == 128 && this.field846 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field844 == 0 && this.field855 == 0 && this.field852 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field826 == null, this.field850 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2008(256);
            var14.method2009(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2005();
        } else if (var15 == 2) {
            var14.method2006();
        } else if (var15 == 3) {
            var14.method2001();
        }
        if (this.field826 != null) {
            for (int var16 = 0; var16 < this.field826.length; var16++) {
                var14.method2010(this.field826[var16], this.field827[var16]);
            }
        }
        if (this.field850 != null) {
            for (int var17 = 0; var17 < this.field850.length; var17++) {
                var14.method2011(this.field850[var17], this.field829[var17]);
            }
        }
        if (var12) {
            var14.method2013(this.field847, this.field848, this.field846);
        }
        if (var13) {
            var14.method2009(this.field844, this.field855, this.field852);
        }
        return var14;
    }

    @ObfuscatedName("ac.z(I)Lac;")
    public final class31 method607() {
        int var1 = -1;
        if (this.field858 != -1) {
            var1 = class158.method1991(this.field858);
        } else if (this.field859 != -1) {
            var1 = class158.field2700[this.field859];
        }
        return var1 < 0 || var1 >= this.field851.length || this.field851[var1] == -1 ? null : method187(this.field851[var1]);
    }

    @ObfuscatedName("ac.e(B)Z")
    public boolean method636() {
        if (this.field851 == null) {
            return this.field860 != -1 || this.field864 != null;
        }
        for (int var1 = 0; var1 < this.field851.length; var1++) {
            if (this.field851[var1] != -1) {
                class31 var2 = method187(this.field851[var1]);
                if (var2.field860 != -1 || var2.field864 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
