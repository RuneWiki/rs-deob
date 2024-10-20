package deob;

@ObfuscatedName("ag")
public class class38 extends class194 {

    @ObfuscatedName("ag.e")
    public static boolean field850 = false;

    @ObfuscatedName("ag.c")
    public static class183 field831 = new class183(64);

    @ObfuscatedName("ag.u")
    public static class183 field832 = new class183(500);

    @ObfuscatedName("ag.w")
    public static class183 field833 = new class183(30);

    @ObfuscatedName("ag.i")
    public static class183 field834 = new class183(30);

    @ObfuscatedName("ag.r")
    public static class95[] field835 = new class95[4];

    @ObfuscatedName("ag.f")
    public int field836;

    @ObfuscatedName("ag.g")
    public int[] field869;

    @ObfuscatedName("ag.o")
    public int[] field838;

    @ObfuscatedName("ag.h")
    public String field858 = "null";

    @ObfuscatedName("ag.s")
    public short[] field877;

    @ObfuscatedName("ag.j")
    public short[] field841;

    @ObfuscatedName("ag.m")
    public short[] field842;

    @ObfuscatedName("ag.t")
    public short[] field863;

    @ObfuscatedName("ag.z")
    public int field867 = 1;

    @ObfuscatedName("ag.y")
    public int field845 = 1;

    @ObfuscatedName("ag.q")
    public int field844 = 2;

    @ObfuscatedName("ag.d")
    public boolean field847 = true;

    @ObfuscatedName("ag.b")
    public int field876 = -1;

    @ObfuscatedName("ag.x")
    public int field849 = -1;

    @ObfuscatedName("ag.n")
    public boolean field840 = false;

    @ObfuscatedName("ag.v")
    public boolean field851 = false;

    @ObfuscatedName("ag.p")
    public int field848 = -1;

    @ObfuscatedName("ag.k")
    public int field853 = 16;

    @ObfuscatedName("ag.ax")
    public int field854 = 0;

    @ObfuscatedName("ag.ap")
    public int field828 = 0;

    @ObfuscatedName("ag.ao")
    public String[] field856 = new String[5];

    @ObfuscatedName("ag.ai")
    public int field857 = -1;

    @ObfuscatedName("ag.aw")
    public int field839 = -1;

    @ObfuscatedName("ag.am")
    public boolean field859 = false;

    @ObfuscatedName("ag.au")
    public boolean field860 = true;

    @ObfuscatedName("ag.ae")
    public int field861 = 128;

    @ObfuscatedName("ag.ab")
    public int field846 = 128;

    @ObfuscatedName("ag.av")
    public int field855 = 128;

    @ObfuscatedName("ag.ay")
    public int field864 = 0;

    @ObfuscatedName("ag.ag")
    public int field865 = 0;

    @ObfuscatedName("ag.aj")
    public int field866 = 0;

    @ObfuscatedName("ag.ah")
    public boolean field843 = false;

    @ObfuscatedName("ag.at")
    public boolean field868 = false;

    @ObfuscatedName("ag.al")
    public int field852 = -1;

    @ObfuscatedName("ag.ak")
    public int[] field870;

    @ObfuscatedName("ag.ar")
    public int field871 = -1;

    @ObfuscatedName("ag.aq")
    public int field872 = -1;

    @ObfuscatedName("ag.ac")
    public int field873 = -1;

    @ObfuscatedName("ag.ad")
    public int field874 = 0;

    @ObfuscatedName("ag.an")
    public int field875 = 0;

    @ObfuscatedName("ag.az")
    public int field862 = 0;

    @ObfuscatedName("ag.af")
    public int[] field880;

    @ObfuscatedName("m.e(IB)Lag;")
    public static class38 method189(int arg0) {
        class38 var1 = (class38) field831.method3302((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field829.method2843(6, arg0);
        class38 var3 = new class38();
        var3.field836 = arg0;
        if (var2 != null) {
            var3.method719(new class111(var2));
        }
        var3.method680();
        if (var3.field868) {
            var3.field844 = 0;
            var3.field847 = false;
        }
        field831.method3304(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.a(B)V")
    public void method680() {
        if (this.field876 == -1) {
            this.field876 = 0;
            if (this.field869 != null && (this.field838 == null || this.field838[0] == 10)) {
                this.field876 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field856[var1] != null) {
                    this.field876 = 1;
                }
            }
        }
        if (this.field852 == -1) {
            this.field852 = this.field844 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ag.l(Ldh;I)V")
    public void method719(class111 arg0) {
        while (true) {
            int var2 = arg0.method2176();
            if (var2 == 0) {
                return;
            }
            this.method682(arg0, var2);
        }
    }

    @ObfuscatedName("ag.c(Ldh;II)V")
    public void method682(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2176();
            if (var3 > 0) {
                if (this.field869 == null || field850) {
                    this.field838 = new int[var3];
                    this.field869 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field869[var4] = arg0.method2178();
                        this.field838[var4] = arg0.method2176();
                    }
                } else {
                    arg0.field1834 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field858 = arg0.method2167();
        } else if (arg1 == 5) {
            int var5 = arg0.method2176();
            if (var5 > 0) {
                if (this.field869 == null || field850) {
                    this.field838 = null;
                    this.field869 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field869[var6] = arg0.method2178();
                    }
                } else {
                    arg0.field1834 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field867 = arg0.method2176();
        } else if (arg1 == 15) {
            this.field845 = arg0.method2176();
        } else if (arg1 == 17) {
            this.field844 = 0;
            this.field847 = false;
        } else if (arg1 == 18) {
            this.field847 = false;
        } else if (arg1 == 19) {
            this.field876 = arg0.method2176();
        } else if (arg1 == 21) {
            this.field849 = 0;
        } else if (arg1 == 22) {
            this.field840 = true;
        } else if (arg1 == 23) {
            this.field851 = true;
        } else if (arg1 == 24) {
            this.field848 = arg0.method2178();
            if (this.field848 == 65535) {
                this.field848 = -1;
            }
        } else if (arg1 == 27) {
            this.field844 = 1;
        } else if (arg1 == 28) {
            this.field853 = arg0.method2176();
        } else if (arg1 == 29) {
            this.field854 = arg0.method2162();
        } else if (arg1 == 39) {
            this.field828 = arg0.method2162() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field856[arg1 - 30] = arg0.method2167();
            if (this.field856[arg1 - 30].equalsIgnoreCase(class148.field2162)) {
                this.field856[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2176();
            this.field877 = new short[var7];
            this.field841 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field877[var8] = (short) arg0.method2178();
                this.field841[var8] = (short) arg0.method2178();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2176();
            this.field842 = new short[var9];
            this.field863 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field842[var10] = (short) arg0.method2178();
                this.field863[var10] = (short) arg0.method2178();
            }
        } else if (arg1 == 60) {
            this.field857 = arg0.method2178();
        } else if (arg1 == 62) {
            this.field859 = true;
        } else if (arg1 == 64) {
            this.field860 = false;
        } else if (arg1 == 65) {
            this.field861 = arg0.method2178();
        } else if (arg1 == 66) {
            this.field846 = arg0.method2178();
        } else if (arg1 == 67) {
            this.field855 = arg0.method2178();
        } else if (arg1 == 68) {
            this.field839 = arg0.method2178();
        } else if (arg1 == 69) {
            arg0.method2176();
        } else if (arg1 == 70) {
            this.field864 = arg0.method2236();
        } else if (arg1 == 71) {
            this.field865 = arg0.method2236();
        } else if (arg1 == 72) {
            this.field866 = arg0.method2236();
        } else if (arg1 == 73) {
            this.field843 = true;
        } else if (arg1 == 74) {
            this.field868 = true;
        } else if (arg1 == 75) {
            this.field852 = arg0.method2176();
        } else if (arg1 == 77) {
            this.field871 = arg0.method2178();
            if (this.field871 == 65535) {
                this.field871 = -1;
            }
            this.field872 = arg0.method2178();
            if (this.field872 == 65535) {
                this.field872 = -1;
            }
            int var11 = arg0.method2176();
            this.field870 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field870[var12] = arg0.method2178();
                if (this.field870[var12] == 65535) {
                    this.field870[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field873 = arg0.method2178();
            this.field874 = arg0.method2176();
        } else if (arg1 == 79) {
            this.field875 = arg0.method2178();
            this.field862 = arg0.method2178();
            this.field874 = arg0.method2176();
            int var13 = arg0.method2176();
            this.field880 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field880[var14] = arg0.method2178();
            }
        } else if (arg1 == 81) {
            this.field849 = arg0.method2176() * 256;
        }
    }

    @ObfuscatedName("ag.u(II)Z")
    public final boolean method683(int arg0) {
        if (this.field838 != null) {
            for (int var4 = 0; var4 < this.field838.length; var4++) {
                if (this.field838[var4] == arg0) {
                    return Statics.field830.method2856(this.field869[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field869 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field869.length; var3++) {
                var2 &= Statics.field830.method2856(this.field869[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ag.w(I)Z")
    public final boolean method702() {
        if (this.field869 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field869.length; var2++) {
            var1 &= Statics.field830.method2856(this.field869[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ag.i(II[[IIIII)Lch;")
    public final class80 method685(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field838 == null) {
            var7 = (long) ((this.field836 << 10) + arg1);
        } else {
            var7 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field833.method3302(var7);
        if (var9 == null) {
            class95 var10 = this.method688(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field840) {
                var10.field1597 = (short) (this.field854 + 64);
                var10.field1598 = (short) (this.field828 + 768);
                var10.method1954();
                var9 = var10;
            } else {
                var9 = var10.method1957(this.field854 + 64, this.field828 + 768, -50, -10, -50);
            }
            field833.method3304(var9, var7);
        }
        if (this.field840) {
            var9 = ((class95) var9).method1942();
        }
        if (this.field849 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2028(arg2, arg3, arg4, arg5, true, this.field849);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1983(arg2, arg3, arg4, arg5, true, this.field849);
            }
        }
        return var9;
    }

    @ObfuscatedName("ag.r(II[[IIIIB)Lcy;")
    public final class100 method686(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field838 == null) {
            var7 = (long) ((this.field836 << 10) + arg1);
        } else {
            var7 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field834.method3302(var7);
        if (var9 == null) {
            class95 var10 = this.method688(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1957(this.field854 + 64, this.field828 + 768, -50, -10, -50);
            field834.method3304(var9, var7);
        }
        if (this.field849 >= 0) {
            var9 = var9.method2028(arg2, arg3, arg4, arg5, true, this.field849);
        }
        return var9;
    }

    @ObfuscatedName("ag.f(II[[IIIILah;II)Lcy;")
    public final class100 method700(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field838 == null) {
            var9 = (long) ((this.field836 << 10) + arg1);
        } else {
            var9 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field834.method3302(var9);
        if (var11 == null) {
            class95 var12 = this.method688(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1957(this.field854 + 64, this.field828 + 768, -50, -10, -50);
            field834.method3304(var11, var9);
        }
        if (arg6 == null && this.field849 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2058(true);
        } else {
            var13 = arg6.method745(var11, arg7, arg1);
        }
        if (this.field849 >= 0) {
            var13 = var13.method2028(arg2, arg3, arg4, arg5, false, this.field849);
        }
        return var13;
    }

    @ObfuscatedName("ag.g(IIB)Lcr;")
    public final class95 method688(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field838 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field869 == null) {
                return null;
            }
            boolean var4 = this.field859;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field869.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field869[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field832.method3302((long) var7);
                if (var3 == null) {
                    var3 = class95.method1937(Statics.field830, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1945();
                    }
                    field832.method3304(var3, (long) var7);
                }
                if (var5 > 1) {
                    field835[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field835, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field838.length; var9++) {
                if (this.field838[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field869[var8];
            boolean var11 = this.field859 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field832.method3302((long) var10);
            if (var3 == null) {
                var3 = class95.method1937(Statics.field830, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1945();
                }
                field832.method3304(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field861 == 128 && this.field846 == 128 && this.field855 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field864 == 0 && this.field865 == 0 && this.field866 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field877 == null, this.field842 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1948(256);
            var14.method1997(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1940();
        } else if (var15 == 2) {
            var14.method1985();
        } else if (var15 == 3) {
            var14.method1947();
        }
        if (this.field877 != null) {
            for (int var16 = 0; var16 < this.field877.length; var16++) {
                var14.method1936(this.field877[var16], this.field841[var16]);
            }
        }
        if (this.field842 != null) {
            for (int var17 = 0; var17 < this.field842.length; var17++) {
                var14.method1951(this.field842[var17], this.field863[var17]);
            }
        }
        if (var12) {
            var14.method1953(this.field861, this.field846, this.field855);
        }
        if (var13) {
            var14.method1997(this.field864, this.field865, this.field866);
        }
        return var14;
    }

    @ObfuscatedName("ag.o(I)Lag;")
    public final class38 method689() {
        int var1 = -1;
        if (this.field871 != -1) {
            var1 = class166.method40(this.field871);
        } else if (this.field872 != -1) {
            var1 = class166.field2753[this.field872];
        }
        return var1 < 0 || var1 >= this.field870.length || this.field870[var1] == -1 ? null : method189(this.field870[var1]);
    }

    @ObfuscatedName("ag.h(I)Z")
    public boolean method697() {
        if (this.field870 == null) {
            return this.field873 != -1 || this.field880 != null;
        }
        for (int var1 = 0; var1 < this.field870.length; var1++) {
            if (this.field870[var1] != -1) {
                class38 var2 = method189(this.field870[var1]);
                if (var2.field873 != -1 || var2.field880 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
