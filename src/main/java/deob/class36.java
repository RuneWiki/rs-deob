package deob;

@ObfuscatedName("ae")
public class class36 extends class183 {

    @ObfuscatedName("ae.n")
    public static boolean field857 = false;

    @ObfuscatedName("ae.i")
    public static class172 field842 = new class172(64);

    @ObfuscatedName("ae.d")
    public static class172 field843 = new class172(500);

    @ObfuscatedName("ae.q")
    public static class172 field882 = new class172(30);

    @ObfuscatedName("ae.m")
    public static class172 field876 = new class172(30);

    @ObfuscatedName("ae.a")
    public static class93[] field846 = new class93[4];

    @ObfuscatedName("ae.w")
    public int field847;

    @ObfuscatedName("ae.e")
    public int[] field848;

    @ObfuscatedName("ae.o")
    public int[] field849;

    @ObfuscatedName("ae.v")
    public String field845 = "null";

    @ObfuscatedName("ae.z")
    public short[] field862;

    @ObfuscatedName("ae.j")
    public short[] field852;

    @ObfuscatedName("ae.r")
    public short[] field853;

    @ObfuscatedName("ae.c")
    public short[] field851;

    @ObfuscatedName("ae.u")
    public int field855 = 1;

    @ObfuscatedName("ae.h")
    public int field860 = 1;

    @ObfuscatedName("ae.t")
    public int field854 = 2;

    @ObfuscatedName("ae.f")
    public boolean field856 = true;

    @ObfuscatedName("ae.g")
    public int field885 = -1;

    @ObfuscatedName("ae.s")
    public int field844 = -1;

    @ObfuscatedName("ae.y")
    public boolean field861 = false;

    @ObfuscatedName("ae.p")
    public boolean field875 = false;

    @ObfuscatedName("ae.b")
    public int field863 = -1;

    @ObfuscatedName("ae.l")
    public int field864 = 16;

    @ObfuscatedName("ae.al")
    public int field839 = 0;

    @ObfuscatedName("ae.aa")
    public int field866 = 0;

    @ObfuscatedName("ae.ar")
    public String[] field867 = new String[5];

    @ObfuscatedName("ae.ak")
    public int field868 = -1;

    @ObfuscatedName("ae.ay")
    public int field869 = -1;

    @ObfuscatedName("ae.aw")
    public boolean field870 = false;

    @ObfuscatedName("ae.av")
    public boolean field871 = true;

    @ObfuscatedName("ae.at")
    public int field872 = 128;

    @ObfuscatedName("ae.af")
    public int field873 = 128;

    @ObfuscatedName("ae.ae")
    public int field874 = 128;

    @ObfuscatedName("ae.ai")
    public int field858 = 0;

    @ObfuscatedName("ae.as")
    public int field859 = 0;

    @ObfuscatedName("ae.aj")
    public int field877 = 0;

    @ObfuscatedName("ae.au")
    public boolean field878 = false;

    @ObfuscatedName("ae.az")
    public boolean field850 = false;

    @ObfuscatedName("ae.ao")
    public int field880 = -1;

    @ObfuscatedName("ae.ag")
    public int[] field865;

    @ObfuscatedName("ae.aq")
    public int field881 = -1;

    @ObfuscatedName("ae.an")
    public int field883 = -1;

    @ObfuscatedName("ae.ax")
    public int field884 = -1;

    @ObfuscatedName("ae.ap")
    public int field886 = 0;

    @ObfuscatedName("ae.ac")
    public int field879 = 0;

    @ObfuscatedName("ae.ab")
    public int field887 = 0;

    @ObfuscatedName("ae.am")
    public int[] field888;

    @ObfuscatedName("cz.n(IB)Lae;")
    public static class36 method2071(int arg0) {
        class36 var1 = (class36) field842.method3115((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field840.method2738(6, arg0);
        class36 var3 = new class36();
        var3.field847 = arg0;
        if (var2 != null) {
            var3.method662(new class107(var2));
        }
        var3.method661();
        if (var3.field850) {
            var3.field854 = 0;
            var3.field856 = false;
        }
        field842.method3117(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.x(B)V")
    public void method661() {
        if (this.field885 == -1) {
            this.field885 = 0;
            if (this.field848 != null && (this.field849 == null || this.field849[0] == 10)) {
                this.field885 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field867[var1] != null) {
                    this.field885 = 1;
                }
            }
        }
        if (this.field880 == -1) {
            this.field880 = this.field854 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.k(Ldw;I)V")
    public void method662(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method690(arg0, var2);
        }
    }

    @ObfuscatedName("ae.i(Ldw;II)V")
    public void method690(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2148();
            if (var3 > 0) {
                if (this.field848 == null || field857) {
                    this.field849 = new int[var3];
                    this.field848 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field848[var4] = arg0.method2140();
                        this.field849[var4] = arg0.method2148();
                    }
                } else {
                    arg0.field1826 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field845 = arg0.method2182();
        } else if (arg1 == 5) {
            int var5 = arg0.method2148();
            if (var5 > 0) {
                if (this.field848 == null || field857) {
                    this.field849 = null;
                    this.field848 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field848[var6] = arg0.method2140();
                    }
                } else {
                    arg0.field1826 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field855 = arg0.method2148();
        } else if (arg1 == 15) {
            this.field860 = arg0.method2148();
        } else if (arg1 == 17) {
            this.field854 = 0;
            this.field856 = false;
        } else if (arg1 == 18) {
            this.field856 = false;
        } else if (arg1 == 19) {
            this.field885 = arg0.method2148();
        } else if (arg1 == 21) {
            this.field844 = 0;
        } else if (arg1 == 22) {
            this.field861 = true;
        } else if (arg1 == 23) {
            this.field875 = true;
        } else if (arg1 == 24) {
            this.field863 = arg0.method2140();
            if (this.field863 == 65535) {
                this.field863 = -1;
            }
        } else if (arg1 == 27) {
            this.field854 = 1;
        } else if (arg1 == 28) {
            this.field864 = arg0.method2148();
        } else if (arg1 == 29) {
            this.field839 = arg0.method2175();
        } else if (arg1 == 39) {
            this.field866 = arg0.method2175() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field867[arg1 - 30] = arg0.method2182();
            if (this.field867[arg1 - 30].equalsIgnoreCase(class143.field2327)) {
                this.field867[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2148();
            this.field862 = new short[var7];
            this.field852 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field862[var8] = (short) arg0.method2140();
                this.field852[var8] = (short) arg0.method2140();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2148();
            this.field853 = new short[var9];
            this.field851 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field853[var10] = (short) arg0.method2140();
                this.field851[var10] = (short) arg0.method2140();
            }
        } else if (arg1 == 60) {
            this.field868 = arg0.method2140();
        } else if (arg1 == 62) {
            this.field870 = true;
        } else if (arg1 == 64) {
            this.field871 = false;
        } else if (arg1 == 65) {
            this.field872 = arg0.method2140();
        } else if (arg1 == 66) {
            this.field873 = arg0.method2140();
        } else if (arg1 == 67) {
            this.field874 = arg0.method2140();
        } else if (arg1 == 68) {
            this.field869 = arg0.method2140();
        } else if (arg1 == 69) {
            arg0.method2148();
        } else if (arg1 == 70) {
            this.field858 = arg0.method2141();
        } else if (arg1 == 71) {
            this.field859 = arg0.method2141();
        } else if (arg1 == 72) {
            this.field877 = arg0.method2141();
        } else if (arg1 == 73) {
            this.field878 = true;
        } else if (arg1 == 74) {
            this.field850 = true;
        } else if (arg1 == 75) {
            this.field880 = arg0.method2148();
        } else if (arg1 == 77) {
            this.field881 = arg0.method2140();
            if (this.field881 == 65535) {
                this.field881 = -1;
            }
            this.field883 = arg0.method2140();
            if (this.field883 == 65535) {
                this.field883 = -1;
            }
            int var11 = arg0.method2148();
            this.field865 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field865[var12] = arg0.method2140();
                if (this.field865[var12] == 65535) {
                    this.field865[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field884 = arg0.method2140();
            this.field886 = arg0.method2148();
        } else if (arg1 == 79) {
            this.field879 = arg0.method2140();
            this.field887 = arg0.method2140();
            this.field886 = arg0.method2148();
            int var13 = arg0.method2148();
            this.field888 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field888[var14] = arg0.method2140();
            }
        } else if (arg1 == 81) {
            this.field844 = arg0.method2148() * 256;
        }
    }

    @ObfuscatedName("ae.d(II)Z")
    public final boolean method664(int arg0) {
        if (this.field849 != null) {
            for (int var4 = 0; var4 < this.field849.length; var4++) {
                if (this.field849[var4] == arg0) {
                    return Statics.field841.method2712(this.field848[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field848 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field848.length; var3++) {
                var2 &= Statics.field841.method2712(this.field848[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.q(B)Z")
    public final boolean method678() {
        if (this.field848 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field848.length; var2++) {
            var1 &= Statics.field841.method2712(this.field848[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.m(II[[IIIII)Lbm;")
    public final class78 method666(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field847 << 10) + arg1);
        } else {
            var7 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field882.method3115(var7);
        if (var9 == null) {
            class93 var10 = this.method669(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field861) {
                var10.field1597 = (short) (this.field839 + 64);
                var10.field1598 = (short) (this.field866 + 768);
                var10.method1957();
                var9 = var10;
            } else {
                var9 = var10.method1908(this.field839 + 64, this.field866 + 768, -50, -10, -50);
            }
            field882.method3117(var9, var7);
        }
        if (this.field861) {
            var9 = ((class93) var9).method1891();
        }
        if (this.field844 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2009(arg2, arg3, arg4, arg5, true, this.field844);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1906(arg2, arg3, arg4, arg5, true, this.field844);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.a(II[[IIIII)Lcy;")
    public final class98 method667(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field847 << 10) + arg1);
        } else {
            var7 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field876.method3115(var7);
        if (var9 == null) {
            class93 var10 = this.method669(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1908(this.field839 + 64, this.field866 + 768, -50, -10, -50);
            field876.method3117(var9, var7);
        }
        if (this.field844 >= 0) {
            var9 = var9.method2009(arg2, arg3, arg4, arg5, true, this.field844);
        }
        return var9;
    }

    @ObfuscatedName("ae.w(II[[IIIILas;II)Lcy;")
    public final class98 method668(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field849 == null) {
            var9 = (long) ((this.field847 << 10) + arg1);
        } else {
            var9 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field876.method3115(var9);
        if (var11 == null) {
            class93 var12 = this.method669(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1908(this.field839 + 64, this.field866 + 768, -50, -10, -50);
            field876.method3117(var11, var9);
        }
        if (arg6 == null && this.field844 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1988(true);
        } else {
            var13 = arg6.method715(var11, arg7, arg1);
        }
        if (this.field844 >= 0) {
            var13 = var13.method2009(arg2, arg3, arg4, arg5, false, this.field844);
        }
        return var13;
    }

    @ObfuscatedName("ae.e(III)Lcx;")
    public final class93 method669(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field849 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field848 == null) {
                return null;
            }
            boolean var4 = this.field870;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field848.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field848[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field843.method3115((long) var7);
                if (var3 == null) {
                    var3 = class93.method1894(Statics.field841, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1890();
                    }
                    field843.method3117(var3, (long) var7);
                }
                if (var5 > 1) {
                    field846[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field846, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field849.length; var9++) {
                if (this.field849[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field848[var8];
            boolean var11 = this.field870 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field843.method3115((long) var10);
            if (var3 == null) {
                var3 = class93.method1894(Statics.field841, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1890();
                }
                field843.method3117(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field872 == 128 && this.field873 == 128 && this.field874 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field858 == 0 && this.field859 == 0 && this.field877 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field862 == null, this.field853 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1898(256);
            var14.method1899(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1886();
        } else if (var15 == 2) {
            var14.method1892();
        } else if (var15 == 3) {
            var14.method1940();
        }
        if (this.field862 != null) {
            for (int var16 = 0; var16 < this.field862.length; var16++) {
                var14.method1907(this.field862[var16], this.field852[var16]);
            }
        }
        if (this.field853 != null) {
            for (int var17 = 0; var17 < this.field853.length; var17++) {
                var14.method1953(this.field853[var17], this.field851[var17]);
            }
        }
        if (var12) {
            var14.method1903(this.field872, this.field873, this.field874);
        }
        if (var13) {
            var14.method1899(this.field858, this.field859, this.field877);
        }
        return var14;
    }

    @ObfuscatedName("ae.o(I)Lae;")
    public final class36 method670() {
        int var1 = -1;
        if (this.field881 != -1) {
            var1 = class155.method2650(this.field881);
        } else if (this.field883 != -1) {
            var1 = class155.field2663[this.field883];
        }
        return var1 < 0 || var1 >= this.field865.length || this.field865[var1] == -1 ? null : method2071(this.field865[var1]);
    }

    @ObfuscatedName("ae.v(I)Z")
    public boolean method663() {
        if (this.field865 == null) {
            return this.field884 != -1 || this.field888 != null;
        }
        for (int var1 = 0; var1 < this.field865.length; var1++) {
            if (this.field865[var1] != -1) {
                class36 var2 = method2071(this.field865[var1]);
                if (var2.field884 != -1 || var2.field888 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
