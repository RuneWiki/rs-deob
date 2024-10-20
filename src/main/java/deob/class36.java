package deob;

@ObfuscatedName("am")
public class class36 extends class183 {

    @ObfuscatedName("am.g")
    public static boolean field832 = false;

    @ObfuscatedName("am.o")
    public static class172 field830 = new class172(64);

    @ObfuscatedName("am.k")
    public static class172 field831 = new class172(500);

    @ObfuscatedName("am.m")
    public static class172 field861 = new class172(30);

    @ObfuscatedName("am.i")
    public static class172 field852 = new class172(30);

    @ObfuscatedName("am.t")
    public static class93[] field834 = new class93[4];

    @ObfuscatedName("am.l")
    public int field835;

    @ObfuscatedName("am.p")
    public int[] field836;

    @ObfuscatedName("am.r")
    public int[] field869;

    @ObfuscatedName("am.j")
    public String field838 = "null";

    @ObfuscatedName("am.c")
    public short[] field839;

    @ObfuscatedName("am.q")
    public short[] field840;

    @ObfuscatedName("am.n")
    public short[] field841;

    @ObfuscatedName("am.h")
    public short[] field842;

    @ObfuscatedName("am.d")
    public int field843 = 1;

    @ObfuscatedName("am.b")
    public int field844 = 1;

    @ObfuscatedName("am.w")
    public int field845 = 2;

    @ObfuscatedName("am.z")
    public boolean field846 = true;

    @ObfuscatedName("am.x")
    public int field847 = -1;

    @ObfuscatedName("am.e")
    public int field848 = -1;

    @ObfuscatedName("am.a")
    public boolean field849 = false;

    @ObfuscatedName("am.y")
    public boolean field850 = false;

    @ObfuscatedName("am.f")
    public int field833 = -1;

    @ObfuscatedName("am.u")
    public int field827 = 16;

    @ObfuscatedName("am.ab")
    public int field853 = 0;

    @ObfuscatedName("am.ai")
    public int field854 = 0;

    @ObfuscatedName("am.aj")
    public String[] field855 = new String[5];

    @ObfuscatedName("am.as")
    public int field877 = -1;

    @ObfuscatedName("am.ax")
    public int field857 = -1;

    @ObfuscatedName("am.ac")
    public boolean field863 = false;

    @ObfuscatedName("am.az")
    public boolean field837 = true;

    @ObfuscatedName("am.au")
    public int field860 = 128;

    @ObfuscatedName("am.av")
    public int field866 = 128;

    @ObfuscatedName("am.am")
    public int field862 = 128;

    @ObfuscatedName("am.ao")
    public int field856 = 0;

    @ObfuscatedName("am.aq")
    public int field864 = 0;

    @ObfuscatedName("am.ay")
    public int field865 = 0;

    @ObfuscatedName("am.an")
    public boolean field828 = false;

    @ObfuscatedName("am.ak")
    public boolean field867 = false;

    @ObfuscatedName("am.ae")
    public int field868 = -1;

    @ObfuscatedName("am.ad")
    public int[] field870;

    @ObfuscatedName("am.aw")
    public int field875 = -1;

    @ObfuscatedName("am.ah")
    public int field871 = -1;

    @ObfuscatedName("am.at")
    public int field851 = -1;

    @ObfuscatedName("am.aa")
    public int field878 = 0;

    @ObfuscatedName("am.ar")
    public int field874 = 0;

    @ObfuscatedName("am.ap")
    public int field859 = 0;

    @ObfuscatedName("am.ag")
    public int[] field876;

    @ObfuscatedName("ef.g(II)Lam;")
    public static class36 method2624(int arg0) {
        class36 var1 = (class36) field830.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field858.method2703(6, arg0);
        class36 var3 = new class36();
        var3.field835 = arg0;
        if (var2 != null) {
            var3.method649(new class107(var2));
        }
        var3.method643();
        if (var3.field867) {
            var3.field845 = 0;
            var3.field846 = false;
        }
        field830.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.s(I)V")
    public void method643() {
        if (this.field847 == -1) {
            this.field847 = 0;
            if (this.field836 != null && (this.field869 == null || this.field869[0] == 10)) {
                this.field847 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field855[var1] != null) {
                    this.field847 = 1;
                }
            }
        }
        if (this.field868 == -1) {
            this.field868 = this.field845 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.v(Lde;I)V")
    public void method649(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method653(arg0, var2);
        }
    }

    @ObfuscatedName("am.o(Lde;II)V")
    public void method653(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2116();
            if (var3 > 0) {
                if (this.field836 == null || field832) {
                    this.field869 = new int[var3];
                    this.field836 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field836[var4] = arg0.method2094();
                        this.field869[var4] = arg0.method2116();
                    }
                } else {
                    arg0.field1851 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field838 = arg0.method2100();
        } else if (arg1 == 5) {
            int var5 = arg0.method2116();
            if (var5 > 0) {
                if (this.field836 == null || field832) {
                    this.field869 = null;
                    this.field836 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field836[var6] = arg0.method2094();
                    }
                } else {
                    arg0.field1851 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field843 = arg0.method2116();
        } else if (arg1 == 15) {
            this.field844 = arg0.method2116();
        } else if (arg1 == 17) {
            this.field845 = 0;
            this.field846 = false;
        } else if (arg1 == 18) {
            this.field846 = false;
        } else if (arg1 == 19) {
            this.field847 = arg0.method2116();
        } else if (arg1 == 21) {
            this.field848 = 0;
        } else if (arg1 == 22) {
            this.field849 = true;
        } else if (arg1 == 23) {
            this.field850 = true;
        } else if (arg1 == 24) {
            this.field833 = arg0.method2094();
            if (this.field833 == 65535) {
                this.field833 = -1;
            }
        } else if (arg1 == 27) {
            this.field845 = 1;
        } else if (arg1 == 28) {
            this.field827 = arg0.method2116();
        } else if (arg1 == 29) {
            this.field853 = arg0.method2093();
        } else if (arg1 == 39) {
            this.field854 = arg0.method2093() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field855[arg1 - 30] = arg0.method2100();
            if (this.field855[arg1 - 30].equalsIgnoreCase(class143.field2168)) {
                this.field855[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2116();
            this.field839 = new short[var7];
            this.field840 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field839[var8] = (short) arg0.method2094();
                this.field840[var8] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2116();
            this.field841 = new short[var9];
            this.field842 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field841[var10] = (short) arg0.method2094();
                this.field842[var10] = (short) arg0.method2094();
            }
        } else if (arg1 == 60) {
            this.field877 = arg0.method2094();
        } else if (arg1 == 62) {
            this.field863 = true;
        } else if (arg1 == 64) {
            this.field837 = false;
        } else if (arg1 == 65) {
            this.field860 = arg0.method2094();
        } else if (arg1 == 66) {
            this.field866 = arg0.method2094();
        } else if (arg1 == 67) {
            this.field862 = arg0.method2094();
        } else if (arg1 == 68) {
            this.field857 = arg0.method2094();
        } else if (arg1 == 69) {
            arg0.method2116();
        } else if (arg1 == 70) {
            this.field856 = arg0.method2095();
        } else if (arg1 == 71) {
            this.field864 = arg0.method2095();
        } else if (arg1 == 72) {
            this.field865 = arg0.method2095();
        } else if (arg1 == 73) {
            this.field828 = true;
        } else if (arg1 == 74) {
            this.field867 = true;
        } else if (arg1 == 75) {
            this.field868 = arg0.method2116();
        } else if (arg1 == 77) {
            this.field875 = arg0.method2094();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            this.field871 = arg0.method2094();
            if (this.field871 == 65535) {
                this.field871 = -1;
            }
            int var11 = arg0.method2116();
            this.field870 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field870[var12] = arg0.method2094();
                if (this.field870[var12] == 65535) {
                    this.field870[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field851 = arg0.method2094();
            this.field878 = arg0.method2116();
        } else if (arg1 == 79) {
            this.field874 = arg0.method2094();
            this.field859 = arg0.method2094();
            this.field878 = arg0.method2116();
            int var13 = arg0.method2116();
            this.field876 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field876[var14] = arg0.method2094();
            }
        } else if (arg1 == 81) {
            this.field848 = arg0.method2116() * 256;
        }
    }

    @ObfuscatedName("am.k(IB)Z")
    public final boolean method645(int arg0) {
        if (this.field869 != null) {
            for (int var4 = 0; var4 < this.field869.length; var4++) {
                if (this.field869[var4] == arg0) {
                    return Statics.field829.method2687(this.field836[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field836 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field836.length; var3++) {
                var2 &= Statics.field829.method2687(this.field836[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.m(B)Z")
    public final boolean method646() {
        if (this.field836 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field836.length; var2++) {
            var1 &= Statics.field829.method2687(this.field836[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.i(II[[IIIIB)Lbs;")
    public final class78 method647(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field869 == null) {
            var7 = (long) ((this.field835 << 10) + arg1);
        } else {
            var7 = (long) ((this.field835 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field861.method3112(var7);
        if (var9 == null) {
            class93 var10 = this.method650(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field849) {
                var10.field1632 = (short) (this.field853 + 64);
                var10.field1598 = (short) (this.field854 + 768);
                var10.method1863();
                var9 = var10;
            } else {
                var9 = var10.method1867(this.field853 + 64, this.field854 + 768, -50, -10, -50);
            }
            field861.method3115(var9, var7);
        }
        if (this.field849) {
            var9 = ((class93) var9).method1852();
        }
        if (this.field848 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1968(arg2, arg3, arg4, arg5, true, this.field848);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1866(arg2, arg3, arg4, arg5, true, this.field848);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.t(II[[IIIII)Lcg;")
    public final class98 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field869 == null) {
            var7 = (long) ((this.field835 << 10) + arg1);
        } else {
            var7 = (long) ((this.field835 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field852.method3112(var7);
        if (var9 == null) {
            class93 var10 = this.method650(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1867(this.field853 + 64, this.field854 + 768, -50, -10, -50);
            field852.method3115(var9, var7);
        }
        if (this.field848 >= 0) {
            var9 = var9.method1968(arg2, arg3, arg4, arg5, true, this.field848);
        }
        return var9;
    }

    @ObfuscatedName("am.l(II[[IIIILaq;II)Lcg;")
    public final class98 method663(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field869 == null) {
            var9 = (long) ((this.field835 << 10) + arg1);
        } else {
            var9 = (long) ((this.field835 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field852.method3112(var9);
        if (var11 == null) {
            class93 var12 = this.method650(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1867(this.field853 + 64, this.field854 + 768, -50, -10, -50);
            field852.method3115(var11, var9);
        }
        if (arg6 == null && this.field848 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1947(true);
        } else {
            var13 = arg6.method704(var11, arg7, arg1);
        }
        if (this.field848 >= 0) {
            var13 = var13.method1968(arg2, arg3, arg4, arg5, false, this.field848);
        }
        return var13;
    }

    @ObfuscatedName("am.p(III)Lcn;")
    public final class93 method650(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field869 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field836 == null) {
                return null;
            }
            boolean var4 = this.field863;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field836.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field836[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field831.method3112((long) var7);
                if (var3 == null) {
                    var3 = class93.method1890(Statics.field829, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1903();
                    }
                    field831.method3115(var3, (long) var7);
                }
                if (var5 > 1) {
                    field834[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field834, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field869.length; var9++) {
                if (this.field869[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field836[var8];
            boolean var11 = this.field863 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field831.method3112((long) var10);
            if (var3 == null) {
                var3 = class93.method1890(Statics.field829, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1903();
                }
                field831.method3115(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field860 == 128 && this.field866 == 128 && this.field862 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field856 == 0 && this.field864 == 0 && this.field865 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field839 == null, this.field841 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1857(256);
            var14.method1858(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1850();
        } else if (var15 == 2) {
            var14.method1874();
        } else if (var15 == 3) {
            var14.method1856();
        }
        if (this.field839 != null) {
            for (int var16 = 0; var16 < this.field839.length; var16++) {
                var14.method1859(this.field839[var16], this.field840[var16]);
            }
        }
        if (this.field841 != null) {
            for (int var17 = 0; var17 < this.field841.length; var17++) {
                var14.method1860(this.field841[var17], this.field842[var17]);
            }
        }
        if (var12) {
            var14.method1862(this.field860, this.field866, this.field862);
        }
        if (var13) {
            var14.method1858(this.field856, this.field864, this.field865);
        }
        return var14;
    }

    @ObfuscatedName("am.r(I)Lam;")
    public final class36 method651() {
        int var1 = -1;
        if (this.field875 != -1) {
            var1 = class155.method2637(this.field875);
        } else if (this.field871 != -1) {
            var1 = class155.field2680[this.field871];
        }
        return var1 < 0 || var1 >= this.field870.length || this.field870[var1] == -1 ? null : method2624(this.field870[var1]);
    }

    @ObfuscatedName("am.j(I)Z")
    public boolean method665() {
        if (this.field870 == null) {
            return this.field851 != -1 || this.field876 != null;
        }
        for (int var1 = 0; var1 < this.field870.length; var1++) {
            if (this.field870[var1] != -1) {
                class36 var2 = method2624(this.field870[var1]);
                if (var2.field851 != -1 || var2.field876 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
