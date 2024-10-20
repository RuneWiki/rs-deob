package deob;

@ObfuscatedName("ap")
public class class36 extends class181 {

    @ObfuscatedName("ap.b")
    public static boolean field842 = false;

    @ObfuscatedName("ap.j")
    public static class171 field832 = new class171(64);

    @ObfuscatedName("ap.o")
    public static class171 field836 = new class171(500);

    @ObfuscatedName("ap.n")
    public static class171 field837 = new class171(30);

    @ObfuscatedName("ap.y")
    public static class171 field838 = new class171(30);

    @ObfuscatedName("ap.f")
    public static class93[] field839 = new class93[4];

    @ObfuscatedName("ap.p")
    public int field840;

    @ObfuscatedName("ap.l")
    public int[] field841;

    @ObfuscatedName("ap.k")
    public int[] field833;

    @ObfuscatedName("ap.q")
    public String field843 = "null";

    @ObfuscatedName("ap.e")
    public short[] field844;

    @ObfuscatedName("ap.t")
    public short[] field845;

    @ObfuscatedName("ap.g")
    public short[] field846;

    @ObfuscatedName("ap.c")
    public short[] field847;

    @ObfuscatedName("ap.m")
    public int field879 = 1;

    @ObfuscatedName("ap.i")
    public int field873 = 1;

    @ObfuscatedName("ap.h")
    public int field850 = 2;

    @ObfuscatedName("ap.a")
    public boolean field875 = true;

    @ObfuscatedName("ap.w")
    public int field849 = -1;

    @ObfuscatedName("ap.z")
    public int field853 = -1;

    @ObfuscatedName("ap.v")
    public boolean field854 = false;

    @ObfuscatedName("ap.s")
    public boolean field866 = false;

    @ObfuscatedName("ap.r")
    public int field856 = -1;

    @ObfuscatedName("ap.d")
    public int field868 = 16;

    @ObfuscatedName("ap.al")
    public int field858 = 0;

    @ObfuscatedName("ap.ab")
    public int field859 = 0;

    @ObfuscatedName("ap.au")
    public String[] field860 = new String[5];

    @ObfuscatedName("ap.az")
    public int field861 = -1;

    @ObfuscatedName("ap.ai")
    public int field871 = -1;

    @ObfuscatedName("ap.ay")
    public boolean field863 = false;

    @ObfuscatedName("ap.ar")
    public boolean field864 = true;

    @ObfuscatedName("ap.af")
    public int field865 = 128;

    @ObfuscatedName("ap.as")
    public int field857 = 128;

    @ObfuscatedName("ap.ap")
    public int field874 = 128;

    @ObfuscatedName("ap.aj")
    public int field855 = 0;

    @ObfuscatedName("ap.ac")
    public int field882 = 0;

    @ObfuscatedName("ap.aa")
    public int field867 = 0;

    @ObfuscatedName("ap.ag")
    public boolean field848 = false;

    @ObfuscatedName("ap.ae")
    public boolean field872 = false;

    @ObfuscatedName("ap.ak")
    public int field851 = -1;

    @ObfuscatedName("ap.aw")
    public int[] field852;

    @ObfuscatedName("ap.ao")
    public int field870 = -1;

    @ObfuscatedName("ap.aq")
    public int field876 = -1;

    @ObfuscatedName("ap.av")
    public int field877 = -1;

    @ObfuscatedName("ap.am")
    public int field878 = 0;

    @ObfuscatedName("ap.at")
    public int field869 = 0;

    @ObfuscatedName("ap.an")
    public int field880 = 0;

    @ObfuscatedName("ap.ax")
    public int[] field881;

    @ObfuscatedName("o.b(II)Lap;")
    public static class36 method28(int arg0) {
        class36 var1 = (class36) field832.method3114((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field862.method2692(6, arg0);
        class36 var3 = new class36();
        var3.field840 = arg0;
        if (var2 != null) {
            var3.method669(new class107(var2));
        }
        var3.method638();
        if (var3.field872) {
            var3.field850 = 0;
            var3.field875 = false;
        }
        field832.method3116(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.u(I)V")
    public void method638() {
        if (this.field849 == -1) {
            this.field849 = 0;
            if (this.field841 != null && (this.field833 == null || this.field833[0] == 10)) {
                this.field849 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field860[var1] != null) {
                    this.field849 = 1;
                }
            }
        }
        if (this.field851 == -1) {
            this.field851 = this.field850 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.x(Ldh;I)V")
    public void method669(class107 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method639(arg0, var2);
        }
    }

    @ObfuscatedName("ap.j(Ldh;II)V")
    public void method639(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2134();
            if (var3 > 0) {
                if (this.field841 == null || field842) {
                    this.field833 = new int[var3];
                    this.field841 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field841[var4] = arg0.method2136();
                        this.field833[var4] = arg0.method2134();
                    }
                } else {
                    arg0.field1845 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field843 = arg0.method2339();
        } else if (arg1 == 5) {
            int var5 = arg0.method2134();
            if (var5 > 0) {
                if (this.field841 == null || field842) {
                    this.field833 = null;
                    this.field841 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field841[var6] = arg0.method2136();
                    }
                } else {
                    arg0.field1845 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field879 = arg0.method2134();
        } else if (arg1 == 15) {
            this.field873 = arg0.method2134();
        } else if (arg1 == 17) {
            this.field850 = 0;
            this.field875 = false;
        } else if (arg1 == 18) {
            this.field875 = false;
        } else if (arg1 == 19) {
            this.field849 = arg0.method2134();
        } else if (arg1 == 21) {
            this.field853 = 0;
        } else if (arg1 == 22) {
            this.field854 = true;
        } else if (arg1 == 23) {
            this.field866 = true;
        } else if (arg1 == 24) {
            this.field856 = arg0.method2136();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
        } else if (arg1 == 27) {
            this.field850 = 1;
        } else if (arg1 == 28) {
            this.field868 = arg0.method2134();
        } else if (arg1 == 29) {
            this.field858 = arg0.method2135();
        } else if (arg1 == 39) {
            this.field859 = arg0.method2135() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field860[arg1 - 30] = arg0.method2339();
            if (this.field860[arg1 - 30].equalsIgnoreCase(class142.field2149)) {
                this.field860[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2134();
            this.field844 = new short[var7];
            this.field845 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field844[var8] = (short) arg0.method2136();
                this.field845[var8] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2134();
            this.field846 = new short[var9];
            this.field847 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field846[var10] = (short) arg0.method2136();
                this.field847[var10] = (short) arg0.method2136();
            }
        } else if (arg1 == 60) {
            this.field861 = arg0.method2136();
        } else if (arg1 == 62) {
            this.field863 = true;
        } else if (arg1 == 64) {
            this.field864 = false;
        } else if (arg1 == 65) {
            this.field865 = arg0.method2136();
        } else if (arg1 == 66) {
            this.field857 = arg0.method2136();
        } else if (arg1 == 67) {
            this.field874 = arg0.method2136();
        } else if (arg1 == 68) {
            this.field871 = arg0.method2136();
        } else if (arg1 == 69) {
            arg0.method2134();
        } else if (arg1 == 70) {
            this.field855 = arg0.method2153();
        } else if (arg1 == 71) {
            this.field882 = arg0.method2153();
        } else if (arg1 == 72) {
            this.field867 = arg0.method2153();
        } else if (arg1 == 73) {
            this.field848 = true;
        } else if (arg1 == 74) {
            this.field872 = true;
        } else if (arg1 == 75) {
            this.field851 = arg0.method2134();
        } else if (arg1 == 77) {
            this.field870 = arg0.method2136();
            if (this.field870 == 65535) {
                this.field870 = -1;
            }
            this.field876 = arg0.method2136();
            if (this.field876 == 65535) {
                this.field876 = -1;
            }
            int var11 = arg0.method2134();
            this.field852 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field852[var12] = arg0.method2136();
                if (this.field852[var12] == 65535) {
                    this.field852[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field877 = arg0.method2136();
            this.field878 = arg0.method2134();
        } else if (arg1 == 79) {
            this.field869 = arg0.method2136();
            this.field880 = arg0.method2136();
            this.field878 = arg0.method2134();
            int var13 = arg0.method2134();
            this.field881 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field881[var14] = arg0.method2136();
            }
        } else if (arg1 == 81) {
            this.field853 = arg0.method2134() * 256;
        }
    }

    @ObfuscatedName("ap.o(II)Z")
    public final boolean method661(int arg0) {
        if (this.field833 != null) {
            for (int var4 = 0; var4 < this.field833.length; var4++) {
                if (this.field833[var4] == arg0) {
                    return Statics.field834.method2694(this.field841[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field841 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field841.length; var3++) {
                var2 &= Statics.field834.method2694(this.field841[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.n(I)Z")
    public final boolean method642() {
        if (this.field841 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field841.length; var2++) {
            var1 &= Statics.field834.method2694(this.field841[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.y(II[[IIIII)Lbn;")
    public final class78 method643(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field833 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field837.method3114(var7);
        if (var9 == null) {
            class93 var10 = this.method652(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field854) {
                var10.field1617 = (short) (this.field858 + 64);
                var10.field1589 = (short) (this.field859 + 768);
                var10.method1900();
                var9 = var10;
            } else {
                var9 = var10.method1910(this.field858 + 64, this.field859 + 768, -50, -10, -50);
            }
            field837.method3116(var9, var7);
        }
        if (this.field854) {
            var9 = ((class93) var9).method1895();
        }
        if (this.field853 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2004(arg2, arg3, arg4, arg5, true, this.field853);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1896(arg2, arg3, arg4, arg5, true, this.field853);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.f(II[[IIIII)Lcu;")
    public final class98 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field833 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field838.method3114(var7);
        if (var9 == null) {
            class93 var10 = this.method652(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1910(this.field858 + 64, this.field859 + 768, -50, -10, -50);
            field838.method3116(var9, var7);
        }
        if (this.field853 >= 0) {
            var9 = var9.method2004(arg2, arg3, arg4, arg5, true, this.field853);
        }
        return var9;
    }

    @ObfuscatedName("ap.p(II[[IIIILac;II)Lcu;")
    public final class98 method645(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field833 == null) {
            var9 = (long) ((this.field840 << 10) + arg1);
        } else {
            var9 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field838.method3114(var9);
        if (var11 == null) {
            class93 var12 = this.method652(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1910(this.field858 + 64, this.field859 + 768, -50, -10, -50);
            field838.method3116(var11, var9);
        }
        if (arg6 == null && this.field853 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method2005(true);
        } else {
            var13 = arg6.method699(var11, arg7, arg1);
        }
        if (this.field853 >= 0) {
            var13 = var13.method2004(arg2, arg3, arg4, arg5, false, this.field853);
        }
        return var13;
    }

    @ObfuscatedName("ap.l(III)Lct;")
    public final class93 method652(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field833 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field841 == null) {
                return null;
            }
            boolean var4 = this.field863;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field841.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field841[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field836.method3114((long) var7);
                if (var3 == null) {
                    var3 = class93.method1901(Statics.field834, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1905();
                    }
                    field836.method3116(var3, (long) var7);
                }
                if (var5 > 1) {
                    field839[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field839, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field833.length; var9++) {
                if (this.field833[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field841[var8];
            boolean var11 = this.field863 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field836.method3114((long) var10);
            if (var3 == null) {
                var3 = class93.method1901(Statics.field834, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1905();
                }
                field836.method3116(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field865 == 128 && this.field857 == 128 && this.field874 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field855 == 0 && this.field882 == 0 && this.field867 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field844 == null, this.field846 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1944(256);
            var14.method1902(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1953();
        } else if (var15 == 2) {
            var14.method1899();
        } else if (var15 == 3) {
            var14.method1926();
        }
        if (this.field844 != null) {
            for (int var16 = 0; var16 < this.field844.length; var16++) {
                var14.method1903(this.field844[var16], this.field845[var16]);
            }
        }
        if (this.field846 != null) {
            for (int var17 = 0; var17 < this.field846.length; var17++) {
                var14.method1904(this.field846[var17], this.field847[var17]);
            }
        }
        if (var12) {
            var14.method1906(this.field865, this.field857, this.field874);
        }
        if (var13) {
            var14.method1902(this.field855, this.field882, this.field867);
        }
        return var14;
    }

    @ObfuscatedName("ap.k(B)Lap;")
    public final class36 method663() {
        int var1 = -1;
        if (this.field870 != -1) {
            var1 = class154.method140(this.field870);
        } else if (this.field876 != -1) {
            var1 = class154.field2657[this.field876];
        }
        return var1 < 0 || var1 >= this.field852.length || this.field852[var1] == -1 ? null : method28(this.field852[var1]);
    }

    @ObfuscatedName("d.q(I)V")
    public static void method529() {
        field832.method3117();
        field836.method3117();
        field837.method3117();
        field838.method3117();
    }

    @ObfuscatedName("ap.e(I)Z")
    public boolean method648() {
        if (this.field852 == null) {
            return this.field877 != -1 || this.field881 != null;
        }
        for (int var1 = 0; var1 < this.field852.length; var1++) {
            if (this.field852[var1] != -1) {
                class36 var2 = method28(this.field852[var1]);
                if (var2.field877 != -1 || var2.field881 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
