package deob;

@ObfuscatedName("ai")
public class class36 extends class182 {

    @ObfuscatedName("ai.i")
    public static boolean field890 = false;

    @ObfuscatedName("ai.v")
    public static class171 field871 = new class171(64);

    @ObfuscatedName("ai.q")
    public static class171 field863 = new class171(500);

    @ObfuscatedName("ai.s")
    public static class171 field845 = new class171(30);

    @ObfuscatedName("ai.g")
    public static class171 field846 = new class171(30);

    @ObfuscatedName("ai.u")
    public static class93[] field847 = new class93[4];

    @ObfuscatedName("ai.d")
    public int field878;

    @ObfuscatedName("ai.y")
    public int[] field881;

    @ObfuscatedName("ai.e")
    public int[] field850;

    @ObfuscatedName("ai.l")
    public String field851 = "null";

    @ObfuscatedName("ai.o")
    public short[] field888;

    @ObfuscatedName("ai.w")
    public short[] field853;

    @ObfuscatedName("ai.t")
    public short[] field854;

    @ObfuscatedName("ai.z")
    public short[] field855;

    @ObfuscatedName("ai.b")
    public int field856 = 1;

    @ObfuscatedName("ai.a")
    public int field857 = 1;

    @ObfuscatedName("ai.r")
    public int field858 = 2;

    @ObfuscatedName("ai.m")
    public boolean field859 = true;

    @ObfuscatedName("ai.f")
    public int field860 = -1;

    @ObfuscatedName("ai.k")
    public int field861 = -1;

    @ObfuscatedName("ai.p")
    public boolean field862 = false;

    @ObfuscatedName("ai.n")
    public boolean field852 = false;

    @ObfuscatedName("ai.j")
    public int field864 = -1;

    @ObfuscatedName("ai.x")
    public int field865 = 16;

    @ObfuscatedName("ai.al")
    public int field866 = 0;

    @ObfuscatedName("ai.au")
    public int field843 = 0;

    @ObfuscatedName("ai.az")
    public String[] field868 = new String[5];

    @ObfuscatedName("ai.ag")
    public int field869 = -1;

    @ObfuscatedName("ai.aj")
    public int field848 = -1;

    @ObfuscatedName("ai.af")
    public boolean field872 = false;

    @ObfuscatedName("ai.am")
    public boolean field889 = true;

    @ObfuscatedName("ai.aa")
    public int field887 = 128;

    @ObfuscatedName("ai.ab")
    public int field874 = 128;

    @ObfuscatedName("ai.ai")
    public int field875 = 128;

    @ObfuscatedName("ai.ak")
    public int field876 = 0;

    @ObfuscatedName("ai.ao")
    public int field877 = 0;

    @ObfuscatedName("ai.ar")
    public int field873 = 0;

    @ObfuscatedName("ai.aq")
    public boolean field879 = false;

    @ObfuscatedName("ai.an")
    public boolean field880 = false;

    @ObfuscatedName("ai.av")
    public int field891 = -1;

    @ObfuscatedName("ai.ac")
    public int[] field882;

    @ObfuscatedName("ai.ay")
    public int field883 = -1;

    @ObfuscatedName("ai.ae")
    public int field884 = -1;

    @ObfuscatedName("ai.ah")
    public int field885 = -1;

    @ObfuscatedName("ai.aw")
    public int field886 = 0;

    @ObfuscatedName("ai.ax")
    public int field840 = 0;

    @ObfuscatedName("ai.at")
    public int field870 = 0;

    @ObfuscatedName("ai.ad")
    public int[] field867;

    @ObfuscatedName("az.i(IB)Lai;")
    public static class36 method565(int arg0) {
        class36 var1 = (class36) field871.method3185((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field841.method2811(6, arg0);
        class36 var3 = new class36();
        var3.field878 = arg0;
        if (var2 != null) {
            var3.method672(new class107(var2));
        }
        var3.method656();
        if (var3.field880) {
            var3.field858 = 0;
            var3.field859 = false;
        }
        field871.method3186(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.c(I)V")
    public void method656() {
        if (this.field860 == -1) {
            this.field860 = 0;
            if (this.field881 != null && (this.field850 == null || this.field850[0] == 10)) {
                this.field860 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field868[var1] != null) {
                    this.field860 = 1;
                }
            }
        }
        if (this.field891 == -1) {
            this.field891 = this.field858 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.h(Ldm;I)V")
    public void method672(class107 arg0) {
        while (true) {
            int var2 = arg0.method2151();
            if (var2 == 0) {
                return;
            }
            this.method685(arg0, var2);
        }
    }

    @ObfuscatedName("ai.v(Ldm;IB)V")
    public void method685(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2151();
            if (var3 > 0) {
                if (this.field881 == null || field890) {
                    this.field850 = new int[var3];
                    this.field881 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field881[var4] = arg0.method2313();
                        this.field850[var4] = arg0.method2151();
                    }
                } else {
                    arg0.field1837 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field851 = arg0.method2159();
        } else if (arg1 == 5) {
            int var5 = arg0.method2151();
            if (var5 > 0) {
                if (this.field881 == null || field890) {
                    this.field850 = null;
                    this.field881 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field881[var6] = arg0.method2313();
                    }
                } else {
                    arg0.field1837 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field856 = arg0.method2151();
        } else if (arg1 == 15) {
            this.field857 = arg0.method2151();
        } else if (arg1 == 17) {
            this.field858 = 0;
            this.field859 = false;
        } else if (arg1 == 18) {
            this.field859 = false;
        } else if (arg1 == 19) {
            this.field860 = arg0.method2151();
        } else if (arg1 == 21) {
            this.field861 = 0;
        } else if (arg1 == 22) {
            this.field862 = true;
        } else if (arg1 == 23) {
            this.field852 = true;
        } else if (arg1 == 24) {
            this.field864 = arg0.method2313();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
        } else if (arg1 == 27) {
            this.field858 = 1;
        } else if (arg1 == 28) {
            this.field865 = arg0.method2151();
        } else if (arg1 == 29) {
            this.field866 = arg0.method2152();
        } else if (arg1 == 39) {
            this.field843 = arg0.method2152() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field868[arg1 - 30] = arg0.method2159();
            if (this.field868[arg1 - 30].equalsIgnoreCase(class142.field2196)) {
                this.field868[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2151();
            this.field888 = new short[var7];
            this.field853 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field888[var8] = (short) arg0.method2313();
                this.field853[var8] = (short) arg0.method2313();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2151();
            this.field854 = new short[var9];
            this.field855 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field854[var10] = (short) arg0.method2313();
                this.field855[var10] = (short) arg0.method2313();
            }
        } else if (arg1 == 60) {
            this.field869 = arg0.method2313();
        } else if (arg1 == 62) {
            this.field872 = true;
        } else if (arg1 == 64) {
            this.field889 = false;
        } else if (arg1 == 65) {
            this.field887 = arg0.method2313();
        } else if (arg1 == 66) {
            this.field874 = arg0.method2313();
        } else if (arg1 == 67) {
            this.field875 = arg0.method2313();
        } else if (arg1 == 68) {
            this.field848 = arg0.method2313();
        } else if (arg1 == 69) {
            arg0.method2151();
        } else if (arg1 == 70) {
            this.field876 = arg0.method2221();
        } else if (arg1 == 71) {
            this.field877 = arg0.method2221();
        } else if (arg1 == 72) {
            this.field873 = arg0.method2221();
        } else if (arg1 == 73) {
            this.field879 = true;
        } else if (arg1 == 74) {
            this.field880 = true;
        } else if (arg1 == 75) {
            this.field891 = arg0.method2151();
        } else if (arg1 == 77) {
            this.field883 = arg0.method2313();
            if (this.field883 == 65535) {
                this.field883 = -1;
            }
            this.field884 = arg0.method2313();
            if (this.field884 == 65535) {
                this.field884 = -1;
            }
            int var11 = arg0.method2151();
            this.field882 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field882[var12] = arg0.method2313();
                if (this.field882[var12] == 65535) {
                    this.field882[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field885 = arg0.method2313();
            this.field886 = arg0.method2151();
        } else if (arg1 == 79) {
            this.field840 = arg0.method2313();
            this.field870 = arg0.method2313();
            this.field886 = arg0.method2151();
            int var13 = arg0.method2151();
            this.field867 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field867[var14] = arg0.method2313();
            }
        } else if (arg1 == 81) {
            this.field861 = arg0.method2151() * 256;
        }
    }

    @ObfuscatedName("ai.q(IB)Z")
    public final boolean method658(int arg0) {
        if (this.field850 != null) {
            for (int var4 = 0; var4 < this.field850.length; var4++) {
                if (this.field850[var4] == arg0) {
                    return Statics.field842.method2742(this.field881[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field881 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field881.length; var3++) {
                var2 &= Statics.field842.method2742(this.field881[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.s(I)Z")
    public final boolean method690() {
        if (this.field881 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field881.length; var2++) {
            var1 &= Statics.field842.method2742(this.field881[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.g(II[[IIIII)Lbs;")
    public final class78 method660(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field850 == null) {
            var7 = (long) ((this.field878 << 10) + arg1);
        } else {
            var7 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field845.method3185(var7);
        if (var9 == null) {
            class93 var10 = this.method663(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field862) {
                var10.field1613 = (short) (this.field866 + 64);
                var10.field1614 = (short) (this.field843 + 768);
                var10.method1919();
                var9 = var10;
            } else {
                var9 = var10.method1902(this.field866 + 64, this.field843 + 768, -50, -10, -50);
            }
            field845.method3186(var9, var7);
        }
        if (this.field862) {
            var9 = ((class93) var9).method1931();
        }
        if (this.field861 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2002(arg2, arg3, arg4, arg5, true, this.field861);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1978(arg2, arg3, arg4, arg5, true, this.field861);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.u(II[[IIIII)Lcc;")
    public final class98 method688(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field850 == null) {
            var7 = (long) ((this.field878 << 10) + arg1);
        } else {
            var7 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field846.method3185(var7);
        if (var9 == null) {
            class93 var10 = this.method663(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1902(this.field866 + 64, this.field843 + 768, -50, -10, -50);
            field846.method3186(var9, var7);
        }
        if (this.field861 >= 0) {
            var9 = var9.method2002(arg2, arg3, arg4, arg5, true, this.field861);
        }
        return var9;
    }

    @ObfuscatedName("ai.d(II[[IIIILao;II)Lcc;")
    public final class98 method659(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field850 == null) {
            var9 = (long) ((this.field878 << 10) + arg1);
        } else {
            var9 = (long) ((this.field878 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field846.method3185(var9);
        if (var11 == null) {
            class93 var12 = this.method663(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1902(this.field866 + 64, this.field843 + 768, -50, -10, -50);
            field846.method3186(var11, var9);
        }
        if (arg6 == null && this.field861 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method2003(true);
        } else {
            var13 = arg6.method733(var11, arg7, arg1);
        }
        if (this.field861 >= 0) {
            var13 = var13.method2002(arg2, arg3, arg4, arg5, false, this.field861);
        }
        return var13;
    }

    @ObfuscatedName("ai.y(IIB)Lcx;")
    public final class93 method663(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field850 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field881 == null) {
                return null;
            }
            boolean var4 = this.field872;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field881.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field881[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field863.method3185((long) var7);
                if (var3 == null) {
                    var3 = class93.method1903(Statics.field842, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1924();
                    }
                    field863.method3186(var3, (long) var7);
                }
                if (var5 > 1) {
                    field847[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field847, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field850.length; var9++) {
                if (this.field850[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field881[var8];
            boolean var11 = this.field872 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field863.method3185((long) var10);
            if (var3 == null) {
                var3 = class93.method1903(Statics.field842, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1924();
                }
                field863.method3186(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field887 == 128 && this.field874 == 128 && this.field875 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field876 == 0 && this.field877 == 0 && this.field873 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field888 == null, this.field854 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1913(256);
            var14.method1914(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1910();
        } else if (var15 == 2) {
            var14.method1911();
        } else if (var15 == 3) {
            var14.method1956();
        }
        if (this.field888 != null) {
            for (int var16 = 0; var16 < this.field888.length; var16++) {
                var14.method1915(this.field888[var16], this.field853[var16]);
            }
        }
        if (this.field854 != null) {
            for (int var17 = 0; var17 < this.field854.length; var17++) {
                var14.method1916(this.field854[var17], this.field855[var17]);
            }
        }
        if (var12) {
            var14.method1962(this.field887, this.field874, this.field875);
        }
        if (var13) {
            var14.method1914(this.field876, this.field877, this.field873);
        }
        return var14;
    }

    @ObfuscatedName("ai.e(I)Lai;")
    public final class36 method664() {
        int var1 = -1;
        if (this.field883 != -1) {
            var1 = class154.method711(this.field883);
        } else if (this.field884 != -1) {
            var1 = class154.field2661[this.field884];
        }
        return var1 < 0 || var1 >= this.field882.length || this.field882[var1] == -1 ? null : method565(this.field882[var1]);
    }

    @ObfuscatedName("ai.l(I)Z")
    public boolean method692() {
        if (this.field882 == null) {
            return this.field885 != -1 || this.field867 != null;
        }
        for (int var1 = 0; var1 < this.field882.length; var1++) {
            if (this.field882[var1] != -1) {
                class36 var2 = method565(this.field882[var1]);
                if (var2.field885 != -1 || var2.field867 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
