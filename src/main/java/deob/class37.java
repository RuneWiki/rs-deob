package deob;

@ObfuscatedName("am")
public class class37 extends class185 {

    @ObfuscatedName("am.l")
    public static boolean field877 = false;

    @ObfuscatedName("am.j")
    public static class174 field832 = new class174(64);

    @ObfuscatedName("am.w")
    public static class174 field833 = new class174(500);

    @ObfuscatedName("am.c")
    public static class174 field834 = new class174(30);

    @ObfuscatedName("am.x")
    public static class174 field839 = new class174(30);

    @ObfuscatedName("am.f")
    public static class94[] field836 = new class94[4];

    @ObfuscatedName("am.t")
    public int field843;

    @ObfuscatedName("am.n")
    public int[] field838;

    @ObfuscatedName("am.p")
    public int[] field863;

    @ObfuscatedName("am.a")
    public String field840 = "null";

    @ObfuscatedName("am.o")
    public short[] field841;

    @ObfuscatedName("am.b")
    public short[] field842;

    @ObfuscatedName("am.r")
    public short[] field846;

    @ObfuscatedName("am.z")
    public short[] field831;

    @ObfuscatedName("am.u")
    public int field845 = 1;

    @ObfuscatedName("am.s")
    public int field869 = 1;

    @ObfuscatedName("am.i")
    public int field847 = 2;

    @ObfuscatedName("am.e")
    public boolean field848 = true;

    @ObfuscatedName("am.h")
    public int field835 = -1;

    @ObfuscatedName("am.k")
    public int field850 = -1;

    @ObfuscatedName("am.v")
    public boolean field851 = false;

    @ObfuscatedName("am.m")
    public boolean field852 = false;

    @ObfuscatedName("am.d")
    public int field853 = -1;

    @ObfuscatedName("am.q")
    public int field870 = 16;

    @ObfuscatedName("am.ak")
    public int field855 = 0;

    @ObfuscatedName("am.ah")
    public int field856 = 0;

    @ObfuscatedName("am.an")
    public String[] field868 = new String[5];

    @ObfuscatedName("am.aw")
    public int field858 = -1;

    @ObfuscatedName("am.az")
    public int field859 = -1;

    @ObfuscatedName("am.ad")
    public boolean field860 = false;

    @ObfuscatedName("am.ag")
    public boolean field861 = true;

    @ObfuscatedName("am.aa")
    public int field837 = 128;

    @ObfuscatedName("am.au")
    public int field872 = 128;

    @ObfuscatedName("am.aq")
    public int field871 = 128;

    @ObfuscatedName("am.am")
    public int field865 = 0;

    @ObfuscatedName("am.ax")
    public int field866 = 0;

    @ObfuscatedName("am.af")
    public int field867 = 0;

    @ObfuscatedName("am.av")
    public boolean field844 = false;

    @ObfuscatedName("am.ao")
    public boolean field879 = false;

    @ObfuscatedName("am.al")
    public int field878 = -1;

    @ObfuscatedName("am.aj")
    public int[] field857;

    @ObfuscatedName("am.ae")
    public int field862 = -1;

    @ObfuscatedName("am.ai")
    public int field873 = -1;

    @ObfuscatedName("am.ay")
    public int field874 = -1;

    @ObfuscatedName("am.ab")
    public int field875 = 0;

    @ObfuscatedName("am.ar")
    public int field876 = 0;

    @ObfuscatedName("am.as")
    public int field854 = 0;

    @ObfuscatedName("am.at")
    public int[] field829;

    @ObfuscatedName("aj.l(IB)Lam;")
    public static class37 method826(int arg0) {
        class37 var1 = (class37) field832.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field830.method2752(6, arg0);
        class37 var3 = new class37();
        var3.field843 = arg0;
        if (var2 != null) {
            var3.method671(new class108(var2));
        }
        var3.method653();
        if (var3.field879) {
            var3.field847 = 0;
            var3.field848 = false;
        }
        field832.method3211(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.y(I)V")
    public void method653() {
        if (this.field835 == -1) {
            this.field835 = 0;
            if (this.field838 != null && (this.field863 == null || this.field863[0] == 10)) {
                this.field835 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field868[var1] != null) {
                    this.field835 = 1;
                }
            }
        }
        if (this.field878 == -1) {
            this.field878 = this.field847 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.g(Ldk;B)V")
    public void method671(class108 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method655(arg0, var2);
        }
    }

    @ObfuscatedName("am.j(Ldk;IB)V")
    public void method655(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2291();
            if (var3 > 0) {
                if (this.field838 == null || field877) {
                    this.field863 = new int[var3];
                    this.field838 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field838[var4] = arg0.method2163();
                        this.field863[var4] = arg0.method2291();
                    }
                } else {
                    arg0.field1823 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field840 = arg0.method2168();
        } else if (arg1 == 5) {
            int var5 = arg0.method2291();
            if (var5 > 0) {
                if (this.field838 == null || field877) {
                    this.field863 = null;
                    this.field838 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field838[var6] = arg0.method2163();
                    }
                } else {
                    arg0.field1823 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field845 = arg0.method2291();
        } else if (arg1 == 15) {
            this.field869 = arg0.method2291();
        } else if (arg1 == 17) {
            this.field847 = 0;
            this.field848 = false;
        } else if (arg1 == 18) {
            this.field848 = false;
        } else if (arg1 == 19) {
            this.field835 = arg0.method2291();
        } else if (arg1 == 21) {
            this.field850 = 0;
        } else if (arg1 == 22) {
            this.field851 = true;
        } else if (arg1 == 23) {
            this.field852 = true;
        } else if (arg1 == 24) {
            this.field853 = arg0.method2163();
            if (this.field853 == 65535) {
                this.field853 = -1;
            }
        } else if (arg1 == 27) {
            this.field847 = 1;
        } else if (arg1 == 28) {
            this.field870 = arg0.method2291();
        } else if (arg1 == 29) {
            this.field855 = arg0.method2292();
        } else if (arg1 == 39) {
            this.field856 = arg0.method2292() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field868[arg1 - 30] = arg0.method2168();
            if (this.field868[arg1 - 30].equalsIgnoreCase(class145.field2140)) {
                this.field868[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2291();
            this.field841 = new short[var7];
            this.field842 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field841[var8] = (short) arg0.method2163();
                this.field842[var8] = (short) arg0.method2163();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2291();
            this.field846 = new short[var9];
            this.field831 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field846[var10] = (short) arg0.method2163();
                this.field831[var10] = (short) arg0.method2163();
            }
        } else if (arg1 == 60) {
            this.field858 = arg0.method2163();
        } else if (arg1 == 62) {
            this.field860 = true;
        } else if (arg1 == 64) {
            this.field861 = false;
        } else if (arg1 == 65) {
            this.field837 = arg0.method2163();
        } else if (arg1 == 66) {
            this.field872 = arg0.method2163();
        } else if (arg1 == 67) {
            this.field871 = arg0.method2163();
        } else if (arg1 == 68) {
            this.field859 = arg0.method2163();
        } else if (arg1 == 69) {
            arg0.method2291();
        } else if (arg1 == 70) {
            this.field865 = arg0.method2164();
        } else if (arg1 == 71) {
            this.field866 = arg0.method2164();
        } else if (arg1 == 72) {
            this.field867 = arg0.method2164();
        } else if (arg1 == 73) {
            this.field844 = true;
        } else if (arg1 == 74) {
            this.field879 = true;
        } else if (arg1 == 75) {
            this.field878 = arg0.method2291();
        } else if (arg1 == 77) {
            this.field862 = arg0.method2163();
            if (this.field862 == 65535) {
                this.field862 = -1;
            }
            this.field873 = arg0.method2163();
            if (this.field873 == 65535) {
                this.field873 = -1;
            }
            int var11 = arg0.method2291();
            this.field857 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field857[var12] = arg0.method2163();
                if (this.field857[var12] == 65535) {
                    this.field857[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field874 = arg0.method2163();
            this.field875 = arg0.method2291();
        } else if (arg1 == 79) {
            this.field876 = arg0.method2163();
            this.field854 = arg0.method2163();
            this.field875 = arg0.method2291();
            int var13 = arg0.method2291();
            this.field829 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field829[var14] = arg0.method2163();
            }
        } else if (arg1 == 81) {
            this.field850 = arg0.method2291() * 256;
        }
    }

    @ObfuscatedName("am.w(II)Z")
    public final boolean method656(int arg0) {
        if (this.field863 != null) {
            for (int var4 = 0; var4 < this.field863.length; var4++) {
                if (this.field863[var4] == arg0) {
                    return Statics.field849.method2783(this.field838[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field838 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field838.length; var3++) {
                var2 &= Statics.field849.method2783(this.field838[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.c(I)Z")
    public final boolean method670() {
        if (this.field838 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field838.length; var2++) {
            var1 &= Statics.field849.method2783(this.field838[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.x(II[[IIIIS)Lcc;")
    public final class79 method658(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field863 == null) {
            var7 = (long) ((this.field843 << 10) + arg1);
        } else {
            var7 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field834.method3225(var7);
        if (var9 == null) {
            class94 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field851) {
                var10.field1604 = (short) (this.field855 + 64);
                var10.field1592 = (short) (this.field856 + 768);
                var10.method1931();
                var9 = var10;
            } else {
                var9 = var10.method1915(this.field855 + 64, this.field856 + 768, -50, -10, -50);
            }
            field834.method3211(var9, var7);
        }
        if (this.field851) {
            var9 = ((class94) var9).method1900();
        }
        if (this.field850 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method2000(arg2, arg3, arg4, arg5, true, this.field850);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1901(arg2, arg3, arg4, arg5, true, this.field850);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.f(II[[IIIII)Lck;")
    public final class99 method659(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field863 == null) {
            var7 = (long) ((this.field843 << 10) + arg1);
        } else {
            var7 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field839.method3225(var7);
        if (var9 == null) {
            class94 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1915(this.field855 + 64, this.field856 + 768, -50, -10, -50);
            field839.method3211(var9, var7);
        }
        if (this.field850 >= 0) {
            var9 = var9.method2000(arg2, arg3, arg4, arg5, true, this.field850);
        }
        return var9;
    }

    @ObfuscatedName("am.t(II[[IIIILaf;IB)Lck;")
    public final class99 method672(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field863 == null) {
            var9 = (long) ((this.field843 << 10) + arg1);
        } else {
            var9 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field839.method3225(var9);
        if (var11 == null) {
            class94 var12 = this.method661(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1915(this.field855 + 64, this.field856 + 768, -50, -10, -50);
            field839.method3211(var11, var9);
        }
        if (arg6 == null && this.field850 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2074(true);
        } else {
            var13 = arg6.method714(var11, arg7, arg1);
        }
        if (this.field850 >= 0) {
            var13 = var13.method2000(arg2, arg3, arg4, arg5, false, this.field850);
        }
        return var13;
    }

    @ObfuscatedName("am.n(III)Lcm;")
    public final class94 method661(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field863 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field838 == null) {
                return null;
            }
            boolean var4 = this.field860;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field838.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field838[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field833.method3225((long) var7);
                if (var3 == null) {
                    var3 = class94.method1902(Statics.field849, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1910();
                    }
                    field833.method3211(var3, (long) var7);
                }
                if (var5 > 1) {
                    field836[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field836, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field863.length; var9++) {
                if (this.field863[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field838[var8];
            boolean var11 = this.field860 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field833.method3225((long) var10);
            if (var3 == null) {
                var3 = class94.method1902(Statics.field849, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1910();
                }
                field833.method3211(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field837 == 128 && this.field872 == 128 && this.field871 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field865 == 0 && this.field866 == 0 && this.field867 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field841 == null, this.field846 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1962(256);
            var14.method1907(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1925();
        } else if (var15 == 2) {
            var14.method1904();
        } else if (var15 == 3) {
            var14.method1905();
        }
        if (this.field841 != null) {
            for (int var16 = 0; var16 < this.field841.length; var16++) {
                var14.method1908(this.field841[var16], this.field842[var16]);
            }
        }
        if (this.field846 != null) {
            for (int var17 = 0; var17 < this.field846.length; var17++) {
                var14.method1899(this.field846[var17], this.field831[var17]);
            }
        }
        if (var12) {
            var14.method1894(this.field837, this.field872, this.field871);
        }
        if (var13) {
            var14.method1907(this.field865, this.field866, this.field867);
        }
        return var14;
    }

    @ObfuscatedName("am.p(I)Lam;")
    public final class37 method662() {
        int var1 = -1;
        if (this.field862 != -1) {
            var1 = class157.method3208(this.field862);
        } else if (this.field873 != -1) {
            var1 = class157.field2655[this.field873];
        }
        return var1 < 0 || var1 >= this.field857.length || this.field857[var1] == -1 ? null : method826(this.field857[var1]);
    }

    @ObfuscatedName("am.a(I)Z")
    public boolean method663() {
        if (this.field857 == null) {
            return this.field874 != -1 || this.field829 != null;
        }
        for (int var1 = 0; var1 < this.field857.length; var1++) {
            if (this.field857[var1] != -1) {
                class37 var2 = method826(this.field857[var1]);
                if (var2.field874 != -1 || var2.field829 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
