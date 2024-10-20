package deob;

@ObfuscatedName("aj")
public class class36 extends class183 {

    @ObfuscatedName("aj.p")
    public static boolean field886 = false;

    @ObfuscatedName("aj.c")
    public static class172 field842 = new class172(64);

    @ObfuscatedName("aj.n")
    public static class172 field884 = new class172(500);

    @ObfuscatedName("aj.s")
    public static class172 field844 = new class172(30);

    @ObfuscatedName("aj.r")
    public static class172 field845 = new class172(30);

    @ObfuscatedName("aj.w")
    public static class93[] field860 = new class93[4];

    @ObfuscatedName("aj.u")
    public int field847;

    @ObfuscatedName("aj.d")
    public int[] field839;

    @ObfuscatedName("aj.h")
    public int[] field849;

    @ObfuscatedName("aj.a")
    public String field850 = "null";

    @ObfuscatedName("aj.y")
    public short[] field851;

    @ObfuscatedName("aj.v")
    public short[] field887;

    @ObfuscatedName("aj.e")
    public short[] field888;

    @ObfuscatedName("aj.b")
    public short[] field854;

    @ObfuscatedName("aj.z")
    public int field853 = 1;

    @ObfuscatedName("aj.l")
    public int field873 = 1;

    @ObfuscatedName("aj.t")
    public int field857 = 2;

    @ObfuscatedName("aj.q")
    public boolean field858 = true;

    @ObfuscatedName("aj.j")
    public int field859 = -1;

    @ObfuscatedName("aj.o")
    public int field867 = -1;

    @ObfuscatedName("aj.i")
    public boolean field861 = false;

    @ObfuscatedName("aj.m")
    public boolean field862 = false;

    @ObfuscatedName("aj.f")
    public int field863 = -1;

    @ObfuscatedName("aj.k")
    public int field864 = 16;

    @ObfuscatedName("aj.an")
    public int field865 = 0;

    @ObfuscatedName("aj.aw")
    public int field866 = 0;

    @ObfuscatedName("aj.at")
    public String[] field855 = new String[5];

    @ObfuscatedName("aj.al")
    public int field868 = -1;

    @ObfuscatedName("aj.as")
    public int field869 = -1;

    @ObfuscatedName("aj.ak")
    public boolean field870 = false;

    @ObfuscatedName("aj.aa")
    public boolean field871 = true;

    @ObfuscatedName("aj.ao")
    public int field848 = 128;

    @ObfuscatedName("aj.af")
    public int field880 = 128;

    @ObfuscatedName("aj.aj")
    public int field874 = 128;

    @ObfuscatedName("aj.az")
    public int field875 = 0;

    @ObfuscatedName("aj.ae")
    public int field876 = 0;

    @ObfuscatedName("aj.av")
    public int field877 = 0;

    @ObfuscatedName("aj.ax")
    public boolean field878 = false;

    @ObfuscatedName("aj.ai")
    public boolean field879 = false;

    @ObfuscatedName("aj.aq")
    public int field843 = -1;

    @ObfuscatedName("aj.ad")
    public int[] field881;

    @ObfuscatedName("aj.au")
    public int field882 = -1;

    @ObfuscatedName("aj.ag")
    public int field852 = -1;

    @ObfuscatedName("aj.ar")
    public int field872 = -1;

    @ObfuscatedName("aj.am")
    public int field885 = 0;

    @ObfuscatedName("aj.ab")
    public int field856 = 0;

    @ObfuscatedName("aj.ac")
    public int field883 = 0;

    @ObfuscatedName("aj.ah")
    public int[] field846;

    @ObfuscatedName("co.p(Ler;Ler;ZS)V")
    public static void method2013(class147 arg0, class147 arg1, boolean arg2) {
        Statics.field840 = arg0;
        Statics.field841 = arg1;
        field886 = arg2;
    }

    @ObfuscatedName("dn.g(II)Laj;")
    public static class36 method2523(int arg0) {
        class36 var1 = (class36) field842.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field840.method2855(6, arg0);
        class36 var3 = new class36();
        var3.field847 = arg0;
        if (var2 != null) {
            var3.method685(new class107(var2));
        }
        var3.method671();
        if (var3.field879) {
            var3.field857 = 0;
            var3.field858 = false;
        }
        field842.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.x(B)V")
    public void method671() {
        if (this.field859 == -1) {
            this.field859 = 0;
            if (this.field839 != null && (this.field849 == null || this.field849[0] == 10)) {
                this.field859 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field855[var1] != null) {
                    this.field859 = 1;
                }
            }
        }
        if (this.field843 == -1) {
            this.field843 = this.field857 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aj.c(Ldp;S)V")
    public void method685(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method664(arg0, var2);
        }
    }

    @ObfuscatedName("aj.n(Ldp;II)V")
    public void method664(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2173();
            if (var3 > 0) {
                if (this.field839 == null || field886) {
                    this.field849 = new int[var3];
                    this.field839 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field839[var4] = arg0.method2175();
                        this.field849[var4] = arg0.method2173();
                    }
                } else {
                    arg0.field1837 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field850 = arg0.method2351();
        } else if (arg1 == 5) {
            int var5 = arg0.method2173();
            if (var5 > 0) {
                if (this.field839 == null || field886) {
                    this.field849 = null;
                    this.field839 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field839[var6] = arg0.method2175();
                    }
                } else {
                    arg0.field1837 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field853 = arg0.method2173();
        } else if (arg1 == 15) {
            this.field873 = arg0.method2173();
        } else if (arg1 == 17) {
            this.field857 = 0;
            this.field858 = false;
        } else if (arg1 == 18) {
            this.field858 = false;
        } else if (arg1 == 19) {
            this.field859 = arg0.method2173();
        } else if (arg1 == 21) {
            this.field867 = 0;
        } else if (arg1 == 22) {
            this.field861 = true;
        } else if (arg1 == 23) {
            this.field862 = true;
        } else if (arg1 == 24) {
            this.field863 = arg0.method2175();
            if (this.field863 == 65535) {
                this.field863 = -1;
            }
        } else if (arg1 == 27) {
            this.field857 = 1;
        } else if (arg1 == 28) {
            this.field864 = arg0.method2173();
        } else if (arg1 == 29) {
            this.field865 = arg0.method2174();
        } else if (arg1 == 39) {
            this.field866 = arg0.method2174() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field855[arg1 - 30] = arg0.method2351();
            if (this.field855[arg1 - 30].equalsIgnoreCase(class143.field2207)) {
                this.field855[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2173();
            this.field851 = new short[var7];
            this.field887 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field851[var8] = (short) arg0.method2175();
                this.field887[var8] = (short) arg0.method2175();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2173();
            this.field888 = new short[var9];
            this.field854 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field888[var10] = (short) arg0.method2175();
                this.field854[var10] = (short) arg0.method2175();
            }
        } else if (arg1 == 60) {
            this.field868 = arg0.method2175();
        } else if (arg1 == 62) {
            this.field870 = true;
        } else if (arg1 == 64) {
            this.field871 = false;
        } else if (arg1 == 65) {
            this.field848 = arg0.method2175();
        } else if (arg1 == 66) {
            this.field880 = arg0.method2175();
        } else if (arg1 == 67) {
            this.field874 = arg0.method2175();
        } else if (arg1 == 68) {
            this.field869 = arg0.method2175();
        } else if (arg1 == 69) {
            arg0.method2173();
        } else if (arg1 == 70) {
            this.field875 = arg0.method2176();
        } else if (arg1 == 71) {
            this.field876 = arg0.method2176();
        } else if (arg1 == 72) {
            this.field877 = arg0.method2176();
        } else if (arg1 == 73) {
            this.field878 = true;
        } else if (arg1 == 74) {
            this.field879 = true;
        } else if (arg1 == 75) {
            this.field843 = arg0.method2173();
        } else if (arg1 == 77) {
            this.field882 = arg0.method2175();
            if (this.field882 == 65535) {
                this.field882 = -1;
            }
            this.field852 = arg0.method2175();
            if (this.field852 == 65535) {
                this.field852 = -1;
            }
            int var11 = arg0.method2173();
            this.field881 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field881[var12] = arg0.method2175();
                if (this.field881[var12] == 65535) {
                    this.field881[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field872 = arg0.method2175();
            this.field885 = arg0.method2173();
        } else if (arg1 == 79) {
            this.field856 = arg0.method2175();
            this.field883 = arg0.method2175();
            this.field885 = arg0.method2173();
            int var13 = arg0.method2173();
            this.field846 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field846[var14] = arg0.method2175();
            }
        } else if (arg1 == 81) {
            this.field867 = arg0.method2173() * 256;
        }
    }

    @ObfuscatedName("aj.s(IB)Z")
    public final boolean method665(int arg0) {
        if (this.field849 != null) {
            for (int var4 = 0; var4 < this.field849.length; var4++) {
                if (this.field849[var4] == arg0) {
                    return Statics.field841.method2805(this.field839[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field839 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field839.length; var3++) {
                var2 &= Statics.field841.method2805(this.field839[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aj.r(B)Z")
    public final boolean method690() {
        if (this.field839 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field839.length; var2++) {
            var1 &= Statics.field841.method2805(this.field839[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aj.w(II[[IIIIB)Lbb;")
    public final class78 method672(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field847 << 10) + arg1);
        } else {
            var7 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field844.method3225(var7);
        if (var9 == null) {
            class93 var10 = this.method670(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field861) {
                var10.field1624 = (short) (this.field865 + 64);
                var10.field1625 = (short) (this.field866 + 768);
                var10.method1959();
                var9 = var10;
            } else {
                var9 = var10.method1952(this.field865 + 64, this.field866 + 768, -50, -10, -50);
            }
            field844.method3234(var9, var7);
        }
        if (this.field861) {
            var9 = ((class93) var9).method1986();
        }
        if (this.field867 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2030(arg2, arg3, arg4, arg5, true, this.field867);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1948(arg2, arg3, arg4, arg5, true, this.field867);
            }
        }
        return var9;
    }

    @ObfuscatedName("aj.u(II[[IIIII)Lcn;")
    public final class98 method668(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field847 << 10) + arg1);
        } else {
            var7 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field845.method3225(var7);
        if (var9 == null) {
            class93 var10 = this.method670(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1952(this.field865 + 64, this.field866 + 768, -50, -10, -50);
            field845.method3234(var9, var7);
        }
        if (this.field867 >= 0) {
            var9 = var9.method2030(arg2, arg3, arg4, arg5, true, this.field867);
        }
        return var9;
    }

    @ObfuscatedName("aj.d(II[[IIIILae;IB)Lcn;")
    public final class98 method669(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field849 == null) {
            var9 = (long) ((this.field847 << 10) + arg1);
        } else {
            var9 = (long) ((this.field847 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field845.method3225(var9);
        if (var11 == null) {
            class93 var12 = this.method670(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1952(this.field865 + 64, this.field866 + 768, -50, -10, -50);
            field845.method3234(var11, var9);
        }
        if (arg6 == null && this.field867 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method2046(true);
        } else {
            var13 = arg6.method740(var11, arg7, arg1);
        }
        if (this.field867 >= 0) {
            var13 = var13.method2030(arg2, arg3, arg4, arg5, false, this.field867);
        }
        return var13;
    }

    @ObfuscatedName("aj.h(III)Lcq;")
    public final class93 method670(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field849 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field839 == null) {
                return null;
            }
            boolean var4 = this.field870;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field839.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field839[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field884.method3225((long) var7);
                if (var3 == null) {
                    var3 = class93.method1943(Statics.field841, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1947();
                    }
                    field884.method3234(var3, (long) var7);
                }
                if (var5 > 1) {
                    field860[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field860, var5);
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
            int var10 = this.field839[var8];
            boolean var11 = this.field870 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field884.method3225((long) var10);
            if (var3 == null) {
                var3 = class93.method1943(Statics.field841, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1947();
                }
                field884.method3234(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field848 == 128 && this.field880 == 128 && this.field874 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field875 == 0 && this.field876 == 0 && this.field877 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field851 == null, this.field888 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1953(256);
            var14.method1954(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1950();
        } else if (var15 == 2) {
            var14.method1957();
        } else if (var15 == 3) {
            var14.method2007();
        }
        if (this.field851 != null) {
            for (int var16 = 0; var16 < this.field851.length; var16++) {
                var14.method1955(this.field851[var16], this.field887[var16]);
            }
        }
        if (this.field888 != null) {
            for (int var17 = 0; var17 < this.field888.length; var17++) {
                var14.method1956(this.field888[var17], this.field854[var17]);
            }
        }
        if (var12) {
            var14.method1958(this.field848, this.field880, this.field874);
        }
        if (var13) {
            var14.method1954(this.field875, this.field876, this.field877);
        }
        return var14;
    }

    @ObfuscatedName("aj.a(B)Laj;")
    public final class36 method686() {
        int var1 = -1;
        if (this.field882 != -1) {
            var1 = class155.method2483(this.field882);
        } else if (this.field852 != -1) {
            var1 = class155.field2662[this.field852];
        }
        return var1 < 0 || var1 >= this.field881.length || this.field881[var1] == -1 ? null : method2523(this.field881[var1]);
    }

    @ObfuscatedName("az.y(B)V")
    public static void method729() {
        field842.method3227();
        field884.method3227();
        field844.method3227();
        field845.method3227();
    }

    @ObfuscatedName("aj.v(B)Z")
    public boolean method666() {
        if (this.field881 == null) {
            return this.field872 != -1 || this.field846 != null;
        }
        for (int var1 = 0; var1 < this.field881.length; var1++) {
            if (this.field881[var1] != -1) {
                class36 var2 = method2523(this.field881[var1]);
                if (var2.field872 != -1 || var2.field846 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
