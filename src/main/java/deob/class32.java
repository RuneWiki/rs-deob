package deob;

@ObfuscatedName("aq")
public class class32 extends class174 {

    @ObfuscatedName("aq.t")
    public static boolean field857 = false;

    @ObfuscatedName("aq.d")
    public static class170 field835 = new class170(64);

    @ObfuscatedName("aq.b")
    public static class170 field836 = new class170(500);

    @ObfuscatedName("aq.i")
    public static class170 field837 = new class170(30);

    @ObfuscatedName("aq.p")
    public static class170 field838 = new class170(30);

    @ObfuscatedName("aq.y")
    public static class101[] field860 = new class101[4];

    @ObfuscatedName("aq.u")
    public int field840;

    @ObfuscatedName("aq.z")
    public int[] field841;

    @ObfuscatedName("aq.j")
    public int[] field834;

    @ObfuscatedName("aq.h")
    public String field859 = "null";

    @ObfuscatedName("aq.x")
    public short[] field839;

    @ObfuscatedName("aq.q")
    public short[] field845;

    @ObfuscatedName("aq.w")
    public short[] field846;

    @ObfuscatedName("aq.k")
    public short[] field882;

    @ObfuscatedName("aq.o")
    public int field847 = 1;

    @ObfuscatedName("aq.f")
    public int field849 = 1;

    @ObfuscatedName("aq.r")
    public int field850 = 2;

    @ObfuscatedName("aq.s")
    public boolean field851 = true;

    @ObfuscatedName("aq.g")
    public int field852 = -1;

    @ObfuscatedName("aq.m")
    public int field853 = -1;

    @ObfuscatedName("aq.a")
    public boolean field854 = false;

    @ObfuscatedName("aq.n")
    public boolean field863 = false;

    @ObfuscatedName("aq.v")
    public int field856 = -1;

    @ObfuscatedName("aq.e")
    public int field843 = 16;

    @ObfuscatedName("aq.ar")
    public int field858 = 0;

    @ObfuscatedName("aq.ak")
    public int field880 = 0;

    @ObfuscatedName("aq.ap")
    public String[] field848 = new String[5];

    @ObfuscatedName("aq.aa")
    public int field844 = -1;

    @ObfuscatedName("aq.av")
    public int field862 = -1;

    @ObfuscatedName("aq.aq")
    public boolean field869 = false;

    @ObfuscatedName("aq.an")
    public boolean field883 = true;

    @ObfuscatedName("aq.al")
    public int field865 = 128;

    @ObfuscatedName("aq.ax")
    public int field866 = 128;

    @ObfuscatedName("aq.as")
    public int field867 = 128;

    @ObfuscatedName("aq.ah")
    public int field868 = 0;

    @ObfuscatedName("aq.ae")
    public int field864 = 0;

    @ObfuscatedName("aq.ac")
    public int field832 = 0;

    @ObfuscatedName("aq.af")
    public int field870 = 0;

    @ObfuscatedName("aq.aj")
    public boolean field872 = false;

    @ObfuscatedName("aq.ao")
    public boolean field873 = false;

    @ObfuscatedName("aq.au")
    public int field874 = -1;

    @ObfuscatedName("aq.at")
    public int[] field875;

    @ObfuscatedName("aq.az")
    public int field876 = -1;

    @ObfuscatedName("aq.ag")
    public int field877 = -1;

    @ObfuscatedName("aq.am")
    public int field878 = -1;

    @ObfuscatedName("aq.ai")
    public int field871 = 0;

    @ObfuscatedName("aq.ab")
    public int field879 = 0;

    @ObfuscatedName("aq.ay")
    public int field881 = 0;

    @ObfuscatedName("aq.aw")
    public int[] field855;

    @ObfuscatedName("cq.t(IB)Laq;")
    public static class32 method1876(int arg0) {
        class32 var1 = (class32) field835.method3260((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field833.method2987(6, arg0);
        class32 var3 = new class32();
        var3.field840 = arg0;
        if (var2 != null) {
            var3.method663(new class127(var2));
        }
        var3.method658();
        if (var3.field873) {
            var3.field850 = 0;
            var3.field851 = false;
        }
        field835.method3261(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.l(B)V")
    public void method658() {
        if (this.field852 == -1) {
            this.field852 = 0;
            if (this.field841 != null && (this.field834 == null || this.field834[0] == 10)) {
                this.field852 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field848[var1] != null) {
                    this.field852 = 1;
                }
            }
        }
        if (this.field874 == -1) {
            this.field874 = this.field850 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aq.c(Ldo;I)V")
    public void method663(class127 arg0) {
        while (true) {
            int var2 = arg0.method2438();
            if (var2 == 0) {
                return;
            }
            this.method657(arg0, var2);
        }
    }

    @ObfuscatedName("aq.d(Ldo;IB)V")
    public void method657(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2438();
            if (var3 > 0) {
                if (this.field841 == null || field857) {
                    this.field834 = new int[var3];
                    this.field841 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field841[var4] = arg0.method2440();
                        this.field834[var4] = arg0.method2438();
                    }
                } else {
                    arg0.field2059 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field859 = arg0.method2627();
        } else if (arg1 == 5) {
            int var5 = arg0.method2438();
            if (var5 > 0) {
                if (this.field841 == null || field857) {
                    this.field834 = null;
                    this.field841 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field841[var6] = arg0.method2440();
                    }
                } else {
                    arg0.field2059 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field847 = arg0.method2438();
        } else if (arg1 == 15) {
            this.field849 = arg0.method2438();
        } else if (arg1 == 17) {
            this.field850 = 0;
            this.field851 = false;
        } else if (arg1 == 18) {
            this.field851 = false;
        } else if (arg1 == 19) {
            this.field852 = arg0.method2438();
        } else if (arg1 == 21) {
            this.field853 = 0;
        } else if (arg1 == 22) {
            this.field854 = true;
        } else if (arg1 == 23) {
            this.field863 = true;
        } else if (arg1 == 24) {
            this.field856 = arg0.method2440();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
        } else if (arg1 == 27) {
            this.field850 = 1;
        } else if (arg1 == 28) {
            this.field843 = arg0.method2438();
        } else if (arg1 == 29) {
            this.field858 = arg0.method2629();
        } else if (arg1 == 39) {
            this.field880 = arg0.method2629();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field848[arg1 - 30] = arg0.method2627();
            if (this.field848[arg1 - 30].equalsIgnoreCase(class134.field2135)) {
                this.field848[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2438();
            this.field839 = new short[var7];
            this.field845 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field839[var8] = (short) arg0.method2440();
                this.field845[var8] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2438();
            this.field846 = new short[var9];
            this.field882 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field846[var10] = (short) arg0.method2440();
                this.field882[var10] = (short) arg0.method2440();
            }
        } else if (arg1 == 60) {
            this.field844 = arg0.method2440();
        } else if (arg1 == 62) {
            this.field869 = true;
        } else if (arg1 == 64) {
            this.field883 = false;
        } else if (arg1 == 65) {
            this.field865 = arg0.method2440();
        } else if (arg1 == 66) {
            this.field866 = arg0.method2440();
        } else if (arg1 == 67) {
            this.field867 = arg0.method2440();
        } else if (arg1 == 68) {
            this.field862 = arg0.method2440();
        } else if (arg1 == 69) {
            this.field870 = arg0.method2438();
        } else if (arg1 == 70) {
            this.field868 = arg0.method2441();
        } else if (arg1 == 71) {
            this.field864 = arg0.method2441();
        } else if (arg1 == 72) {
            this.field832 = arg0.method2441();
        } else if (arg1 == 73) {
            this.field872 = true;
        } else if (arg1 == 74) {
            this.field873 = true;
        } else if (arg1 == 75) {
            this.field874 = arg0.method2438();
        } else if (arg1 == 77) {
            this.field876 = arg0.method2440();
            if (this.field876 == 65535) {
                this.field876 = -1;
            }
            this.field877 = arg0.method2440();
            if (this.field877 == 65535) {
                this.field877 = -1;
            }
            int var11 = arg0.method2438();
            this.field875 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field875[var12] = arg0.method2440();
                if (this.field875[var12] == 65535) {
                    this.field875[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field878 = arg0.method2440();
            this.field871 = arg0.method2438();
        } else if (arg1 == 79) {
            this.field879 = arg0.method2440();
            this.field881 = arg0.method2440();
            this.field871 = arg0.method2438();
            int var13 = arg0.method2438();
            this.field855 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field855[var14] = arg0.method2440();
            }
        } else if (arg1 == 81) {
            this.field853 = arg0.method2438() * 256;
        }
    }

    @ObfuscatedName("aq.b(IB)Z")
    public final boolean method673(int arg0) {
        if (this.field834 != null) {
            for (int var4 = 0; var4 < this.field834.length; var4++) {
                if (this.field834[var4] == arg0) {
                    return Statics.field861.method2989(this.field841[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field841 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field841.length; var3++) {
                var2 &= Statics.field861.method2989(this.field841[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aq.i(B)Z")
    public final boolean method662() {
        if (this.field841 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field841.length; var2++) {
            var1 &= Statics.field861.method2989(this.field841[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aq.p(II[[IIIII)Lca;")
    public final class94 method678(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field837.method3260(var7);
        if (var9 == null) {
            class101 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field854) {
                var10.field1748 = (short) (this.field858 + 64);
                var10.field1749 = (short) (this.field880 * 25 + 768);
                var10.method2067();
                var9 = var10;
            } else {
                var9 = var10.method2125(this.field858 + 64, this.field880 * 25 + 768, -50, -10, -50);
            }
            field837.method3261(var9, var7);
        }
        if (this.field854) {
            var9 = ((class101) var9).method2071();
        }
        if (this.field853 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2234(arg2, arg3, arg4, arg5, true, this.field853);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2056(arg2, arg3, arg4, arg5, true, this.field853);
            }
        }
        return var9;
    }

    @ObfuscatedName("aq.y(II[[IIIII)Ldk;")
    public final class112 method664(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field838.method3260(var7);
        if (var9 == null) {
            class101 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2125(this.field858 + 64, this.field880 * 25 + 768, -50, -10, -50);
            field838.method3261(var9, var7);
        }
        if (this.field853 >= 0) {
            var9 = var9.method2234(arg2, arg3, arg4, arg5, true, this.field853);
        }
        return var9;
    }

    @ObfuscatedName("aq.u(II[[IIIILal;II)Ldk;")
    public final class112 method665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field834 == null) {
            var9 = (long) ((this.field840 << 10) + arg1);
        } else {
            var9 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field838.method3260(var9);
        if (var11 == null) {
            class101 var12 = this.method661(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2125(this.field858 + 64, this.field880 * 25 + 768, -50, -10, -50);
            field838.method3261(var11, var9);
        }
        if (arg6 == null && this.field853 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2235(true);
        } else {
            var13 = arg6.method731(var11, arg7, arg1);
        }
        if (this.field853 >= 0) {
            var13 = var13.method2234(arg2, arg3, arg4, arg5, false, this.field853);
        }
        return var13;
    }

    @ObfuscatedName("aq.z(III)Lcc;")
    public final class101 method661(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field834 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field841 == null) {
                return null;
            }
            boolean var4 = this.field869;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field841.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field841[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field836.method3260((long) var7);
                if (var3 == null) {
                    var3 = class101.method2086(Statics.field861, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2065();
                    }
                    field836.method3261(var3, (long) var7);
                }
                if (var5 > 1) {
                    field860[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field860, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field834.length; var9++) {
                if (this.field834[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field841[var8];
            boolean var11 = this.field869 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field836.method3260((long) var10);
            if (var3 == null) {
                var3 = class101.method2086(Statics.field861, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2065();
                }
                field836.method3261(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field865 == 128 && this.field866 == 128 && this.field867 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field868 == 0 && this.field864 == 0 && this.field832 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field839 == null, this.field846 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2133(256);
            var14.method2123(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2103();
        } else if (var15 == 2) {
            var14.method2059();
        } else if (var15 == 3) {
            var14.method2060();
        }
        if (this.field839 != null) {
            for (int var16 = 0; var16 < this.field839.length; var16++) {
                var14.method2063(this.field839[var16], this.field845[var16]);
            }
        }
        if (this.field846 != null) {
            for (int var17 = 0; var17 < this.field846.length; var17++) {
                var14.method2064(this.field846[var17], this.field882[var17]);
            }
        }
        if (var12) {
            var14.method2066(this.field865, this.field866, this.field867);
        }
        if (var13) {
            var14.method2123(this.field868, this.field864, this.field832);
        }
        return var14;
    }

    @ObfuscatedName("aq.j(I)Laq;")
    public final class32 method667() {
        int var1 = -1;
        if (this.field876 != -1) {
            var1 = class159.method2232(this.field876);
        } else if (this.field877 != -1) {
            var1 = class159.field2713[this.field877];
        }
        return var1 < 0 || var1 >= this.field875.length || this.field875[var1] == -1 ? null : method1876(this.field875[var1]);
    }

    @ObfuscatedName("aq.h(I)Z")
    public boolean method668() {
        if (this.field875 == null) {
            return this.field878 != -1 || this.field855 != null;
        }
        for (int var1 = 0; var1 < this.field875.length; var1++) {
            if (this.field875[var1] != -1) {
                class32 var2 = method1876(this.field875[var1]);
                if (var2.field878 != -1 || var2.field855 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
