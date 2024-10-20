package deob;

@ObfuscatedName("am")
public class class32 extends class174 {

    @ObfuscatedName("am.a")
    public static boolean field864 = false;

    @ObfuscatedName("am.r")
    public static class170 field822 = new class170(64);

    @ObfuscatedName("am.p")
    public static class170 field823 = new class170(500);

    @ObfuscatedName("am.n")
    public static class170 field859 = new class170(30);

    @ObfuscatedName("am.o")
    public static class170 field865 = new class170(30);

    @ObfuscatedName("am.l")
    public static class101[] field861 = new class101[4];

    @ObfuscatedName("am.t")
    public int field827;

    @ObfuscatedName("am.q")
    public int[] field832;

    @ObfuscatedName("am.c")
    public int[] field829;

    @ObfuscatedName("am.z")
    public String field830 = "null";

    @ObfuscatedName("am.s")
    public short[] field831;

    @ObfuscatedName("am.h")
    public short[] field842;

    @ObfuscatedName("am.f")
    public short[] field834;

    @ObfuscatedName("am.w")
    public short[] field824;

    @ObfuscatedName("am.d")
    public int field835 = 1;

    @ObfuscatedName("am.y")
    public int field836 = 1;

    @ObfuscatedName("am.g")
    public int field837 = 2;

    @ObfuscatedName("am.v")
    public boolean field838 = true;

    @ObfuscatedName("am.b")
    public int field839 = -1;

    @ObfuscatedName("am.j")
    public int field840 = -1;

    @ObfuscatedName("am.m")
    public boolean field841 = false;

    @ObfuscatedName("am.k")
    public boolean field847 = false;

    @ObfuscatedName("am.u")
    public int field843 = -1;

    @ObfuscatedName("am.i")
    public int field844 = 16;

    @ObfuscatedName("am.ah")
    public int field845 = 0;

    @ObfuscatedName("am.ag")
    public int field846 = 0;

    @ObfuscatedName("am.ay")
    public String[] field858 = new String[5];

    @ObfuscatedName("am.as")
    public int field848 = -1;

    @ObfuscatedName("am.aq")
    public int field849 = -1;

    @ObfuscatedName("am.am")
    public boolean field850 = false;

    @ObfuscatedName("am.an")
    public boolean field851 = true;

    @ObfuscatedName("am.av")
    public int field852 = 128;

    @ObfuscatedName("am.at")
    public int field853 = 128;

    @ObfuscatedName("am.ap")
    public int field862 = 128;

    @ObfuscatedName("am.ae")
    public int field869 = 0;

    @ObfuscatedName("am.af")
    public int field856 = 0;

    @ObfuscatedName("am.ai")
    public int field857 = 0;

    @ObfuscatedName("am.aj")
    public int field825 = 0;

    @ObfuscatedName("am.ax")
    public boolean field828 = false;

    @ObfuscatedName("am.ak")
    public boolean field860 = false;

    @ObfuscatedName("am.az")
    public int field867 = -1;

    @ObfuscatedName("am.aa")
    public int[] field821;

    @ObfuscatedName("am.au")
    public int field863 = -1;

    @ObfuscatedName("am.ar")
    public int field855 = -1;

    @ObfuscatedName("am.ao")
    public int field866 = -1;

    @ObfuscatedName("am.aw")
    public int field833 = 0;

    @ObfuscatedName("am.ab")
    public int field826 = 0;

    @ObfuscatedName("am.ac")
    public int field868 = 0;

    @ObfuscatedName("am.ad")
    public int[] field854;

    @ObfuscatedName("aq.a(Leb;Leb;ZI)V")
    public static void method639(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field2033 = arg0;
        Statics.field2819 = arg1;
        field864 = arg2;
    }

    @ObfuscatedName("cb.x(II)Lam;")
    public static class32 method1806(int arg0) {
        class32 var1 = (class32) field822.method3196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2033.method2961(6, arg0);
        class32 var3 = new class32();
        var3.field827 = arg0;
        if (var2 != null) {
            var3.method642(new class127(var2));
        }
        var3.method643();
        if (var3.field860) {
            var3.field837 = 0;
            var3.field838 = false;
        }
        field822.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.e(I)V")
    public void method643() {
        if (this.field839 == -1) {
            this.field839 = 0;
            if (this.field832 != null && (this.field829 == null || this.field829[0] == 10)) {
                this.field839 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field858[var1] != null) {
                    this.field839 = 1;
                }
            }
        }
        if (this.field867 == -1) {
            this.field867 = this.field837 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.r(Ldy;B)V")
    public void method642(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method663(arg0, var2);
        }
    }

    @ObfuscatedName("am.p(Ldy;II)V")
    public void method663(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2411();
            if (var3 > 0) {
                if (this.field832 == null || field864) {
                    this.field829 = new int[var3];
                    this.field832 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field832[var4] = arg0.method2413();
                        this.field829[var4] = arg0.method2411();
                    }
                } else {
                    arg0.field2035 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field830 = arg0.method2564();
        } else if (arg1 == 5) {
            int var5 = arg0.method2411();
            if (var5 > 0) {
                if (this.field832 == null || field864) {
                    this.field829 = null;
                    this.field832 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field832[var6] = arg0.method2413();
                    }
                } else {
                    arg0.field2035 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field835 = arg0.method2411();
        } else if (arg1 == 15) {
            this.field836 = arg0.method2411();
        } else if (arg1 == 17) {
            this.field837 = 0;
            this.field838 = false;
        } else if (arg1 == 18) {
            this.field838 = false;
        } else if (arg1 == 19) {
            this.field839 = arg0.method2411();
        } else if (arg1 == 21) {
            this.field840 = 0;
        } else if (arg1 == 22) {
            this.field841 = true;
        } else if (arg1 == 23) {
            this.field847 = true;
        } else if (arg1 == 24) {
            this.field843 = arg0.method2413();
            if (this.field843 == 65535) {
                this.field843 = -1;
            }
        } else if (arg1 == 27) {
            this.field837 = 1;
        } else if (arg1 == 28) {
            this.field844 = arg0.method2411();
        } else if (arg1 == 29) {
            this.field845 = arg0.method2412();
        } else if (arg1 == 39) {
            this.field846 = arg0.method2412() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field858[arg1 - 30] = arg0.method2564();
            if (this.field858[arg1 - 30].equalsIgnoreCase(class134.field2076)) {
                this.field858[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2411();
            this.field831 = new short[var7];
            this.field842 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field831[var8] = (short) arg0.method2413();
                this.field842[var8] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2411();
            this.field834 = new short[var9];
            this.field824 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field834[var10] = (short) arg0.method2413();
                this.field824[var10] = (short) arg0.method2413();
            }
        } else if (arg1 == 60) {
            this.field848 = arg0.method2413();
        } else if (arg1 == 62) {
            this.field850 = true;
        } else if (arg1 == 64) {
            this.field851 = false;
        } else if (arg1 == 65) {
            this.field852 = arg0.method2413();
        } else if (arg1 == 66) {
            this.field853 = arg0.method2413();
        } else if (arg1 == 67) {
            this.field862 = arg0.method2413();
        } else if (arg1 == 68) {
            this.field849 = arg0.method2413();
        } else if (arg1 == 69) {
            this.field825 = arg0.method2411();
        } else if (arg1 == 70) {
            this.field869 = arg0.method2452();
        } else if (arg1 == 71) {
            this.field856 = arg0.method2452();
        } else if (arg1 == 72) {
            this.field857 = arg0.method2452();
        } else if (arg1 == 73) {
            this.field828 = true;
        } else if (arg1 == 74) {
            this.field860 = true;
        } else if (arg1 == 75) {
            this.field867 = arg0.method2411();
        } else if (arg1 == 77) {
            this.field863 = arg0.method2413();
            if (this.field863 == 65535) {
                this.field863 = -1;
            }
            this.field855 = arg0.method2413();
            if (this.field855 == 65535) {
                this.field855 = -1;
            }
            int var11 = arg0.method2411();
            this.field821 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field821[var12] = arg0.method2413();
                if (this.field821[var12] == 65535) {
                    this.field821[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field866 = arg0.method2413();
            this.field833 = arg0.method2411();
        } else if (arg1 == 79) {
            this.field826 = arg0.method2413();
            this.field868 = arg0.method2413();
            this.field833 = arg0.method2411();
            int var13 = arg0.method2411();
            this.field854 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field854[var14] = arg0.method2413();
            }
        } else if (arg1 == 81) {
            this.field840 = arg0.method2411() * 256;
        }
    }

    @ObfuscatedName("am.n(IS)Z")
    public final boolean method646(int arg0) {
        if (this.field829 != null) {
            for (int var4 = 0; var4 < this.field829.length; var4++) {
                if (this.field829[var4] == arg0) {
                    return Statics.field2819.method2939(this.field832[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field832 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field832.length; var3++) {
                var2 &= Statics.field2819.method2939(this.field832[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.o(I)Z")
    public final boolean method648() {
        if (this.field832 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field832.length; var2++) {
            var1 &= Statics.field2819.method2939(this.field832[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.l(II[[IIIIB)Lci;")
    public final class94 method645(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field829 == null) {
            var7 = (long) ((this.field827 << 10) + arg1);
        } else {
            var7 = (long) ((this.field827 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field859.method3196(var7);
        if (var9 == null) {
            class101 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field841) {
                var10.field1719 = (short) (this.field845 + 64);
                var10.field1705 = (short) (this.field846 + 768);
                var10.method2006();
                var9 = var10;
            } else {
                var9 = var10.method2010(this.field845 + 64, this.field846 + 768, -50, -10, -50);
            }
            field859.method3193(var9, var7);
        }
        if (this.field841) {
            var9 = ((class101) var9).method2004();
        }
        if (this.field840 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2180(arg2, arg3, arg4, arg5, true, this.field840);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method1995(arg2, arg3, arg4, arg5, true, this.field840);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.t(II[[IIIIB)Ldd;")
    public final class112 method662(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field829 == null) {
            var7 = (long) ((this.field827 << 10) + arg1);
        } else {
            var7 = (long) ((this.field827 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field865.method3196(var7);
        if (var9 == null) {
            class101 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2010(this.field845 + 64, this.field846 + 768, -50, -10, -50);
            field865.method3193(var9, var7);
        }
        if (this.field840 >= 0) {
            var9 = var9.method2180(arg2, arg3, arg4, arg5, true, this.field840);
        }
        return var9;
    }

    @ObfuscatedName("am.q(II[[IIIILav;IB)Ldd;")
    public final class112 method650(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field829 == null) {
            var9 = (long) ((this.field827 << 10) + arg1);
        } else {
            var9 = (long) ((this.field827 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field865.method3196(var9);
        if (var11 == null) {
            class101 var12 = this.method664(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2010(this.field845 + 64, this.field846 + 768, -50, -10, -50);
            field865.method3193(var11, var9);
        }
        if (arg6 == null && this.field840 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2181(true);
        } else {
            var13 = arg6.method714(var11, arg7, arg1);
        }
        if (this.field840 >= 0) {
            var13 = var13.method2180(arg2, arg3, arg4, arg5, false, this.field840);
        }
        return var13;
    }

    @ObfuscatedName("am.c(III)Lcc;")
    public final class101 method664(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field829 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field832 == null) {
                return null;
            }
            boolean var4 = this.field850;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field832.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field832[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field823.method3196((long) var7);
                if (var3 == null) {
                    var3 = class101.method1989(Statics.field2819, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2059();
                    }
                    field823.method3193(var3, (long) var7);
                }
                if (var5 > 1) {
                    field861[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field861, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field829.length; var9++) {
                if (this.field829[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field832[var8];
            boolean var11 = this.field850 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field823.method3196((long) var10);
            if (var3 == null) {
                var3 = class101.method1989(Statics.field2819, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2059();
                }
                field823.method3193(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field852 == 128 && this.field853 == 128 && this.field862 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field869 == 0 && this.field856 == 0 && this.field857 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field831 == null, this.field834 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2049(256);
            var14.method1994(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2017();
        } else if (var15 == 2) {
            var14.method1993();
        } else if (var15 == 3) {
            var14.method1999();
        }
        if (this.field831 != null) {
            for (int var16 = 0; var16 < this.field831.length; var16++) {
                var14.method2002(this.field831[var16], this.field842[var16]);
            }
        }
        if (this.field834 != null) {
            for (int var17 = 0; var17 < this.field834.length; var17++) {
                var14.method2021(this.field834[var17], this.field824[var17]);
            }
        }
        if (var12) {
            var14.method2035(this.field852, this.field853, this.field862);
        }
        if (var13) {
            var14.method1994(this.field869, this.field856, this.field857);
        }
        return var14;
    }

    @ObfuscatedName("am.z(B)Lam;")
    public final class32 method652() {
        int var1 = -1;
        if (this.field863 != -1) {
            var1 = class159.method2341(this.field863);
        } else if (this.field855 != -1) {
            var1 = class159.field2701[this.field855];
        }
        return var1 < 0 || var1 >= this.field821.length || this.field821[var1] == -1 ? null : method1806(this.field821[var1]);
    }

    @ObfuscatedName("am.s(I)Z")
    public boolean method685() {
        if (this.field821 == null) {
            return this.field866 != -1 || this.field854 != null;
        }
        for (int var1 = 0; var1 < this.field821.length; var1++) {
            if (this.field821[var1] != -1) {
                class32 var2 = method1806(this.field821[var1]);
                if (var2.field866 != -1 || var2.field854 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
