package deob;

@ObfuscatedName("as")
public class class36 extends class183 {

    @ObfuscatedName("as.k")
    public static boolean field865 = false;

    @ObfuscatedName("as.g")
    public static class172 field859 = new class172(64);

    @ObfuscatedName("as.h")
    public static class172 field829 = new class172(500);

    @ObfuscatedName("as.l")
    public static class172 field828 = new class172(30);

    @ObfuscatedName("as.e")
    public static class172 field831 = new class172(30);

    @ObfuscatedName("as.u")
    public static class93[] field832 = new class93[4];

    @ObfuscatedName("as.j")
    public int field833;

    @ObfuscatedName("as.c")
    public int[] field863;

    @ObfuscatedName("as.d")
    public int[] field839;

    @ObfuscatedName("as.v")
    public String field836 = "null";

    @ObfuscatedName("as.n")
    public short[] field837;

    @ObfuscatedName("as.z")
    public short[] field838;

    @ObfuscatedName("as.a")
    public short[] field834;

    @ObfuscatedName("as.t")
    public short[] field840;

    @ObfuscatedName("as.p")
    public int field835 = 1;

    @ObfuscatedName("as.i")
    public int field871 = 1;

    @ObfuscatedName("as.r")
    public int field843 = 2;

    @ObfuscatedName("as.w")
    public boolean field844 = true;

    @ObfuscatedName("as.b")
    public int field845 = -1;

    @ObfuscatedName("as.x")
    public int field846 = -1;

    @ObfuscatedName("as.q")
    public boolean field847 = false;

    @ObfuscatedName("as.o")
    public boolean field848 = false;

    @ObfuscatedName("as.m")
    public int field849 = -1;

    @ObfuscatedName("as.f")
    public int field850 = 16;

    @ObfuscatedName("as.ab")
    public int field866 = 0;

    @ObfuscatedName("as.al")
    public int field867 = 0;

    @ObfuscatedName("as.an")
    public String[] field875 = new String[5];

    @ObfuscatedName("as.aw")
    public int field854 = -1;

    @ObfuscatedName("as.ar")
    public int field855 = -1;

    @ObfuscatedName("as.ai")
    public boolean field856 = false;

    @ObfuscatedName("as.aj")
    public boolean field857 = true;

    @ObfuscatedName("as.ao")
    public int field858 = 128;

    @ObfuscatedName("as.ap")
    public int field851 = 128;

    @ObfuscatedName("as.as")
    public int field860 = 128;

    @ObfuscatedName("as.au")
    public int field861 = 0;

    @ObfuscatedName("as.ac")
    public int field868 = 0;

    @ObfuscatedName("as.ay")
    public int field826 = 0;

    @ObfuscatedName("as.av")
    public boolean field842 = false;

    @ObfuscatedName("as.ak")
    public boolean field830 = false;

    @ObfuscatedName("as.ae")
    public int field862 = -1;

    @ObfuscatedName("as.at")
    public int[] field841;

    @ObfuscatedName("as.az")
    public int field852 = -1;

    @ObfuscatedName("as.ag")
    public int field864 = -1;

    @ObfuscatedName("as.af")
    public int field870 = -1;

    @ObfuscatedName("as.am")
    public int field869 = 0;

    @ObfuscatedName("as.ah")
    public int field872 = 0;

    @ObfuscatedName("as.aq")
    public int field873 = 0;

    @ObfuscatedName("as.ax")
    public int[] field874;

    @ObfuscatedName("al.k(II)Las;")
    public static class36 method525(int arg0) {
        class36 var1 = (class36) field859.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2971.method2729(6, arg0);
        class36 var3 = new class36();
        var3.field833 = arg0;
        if (var2 != null) {
            var3.method606(new class107(var2));
        }
        var3.method617();
        if (var3.field830) {
            var3.field843 = 0;
            var3.field844 = false;
        }
        field859.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.y(B)V")
    public void method617() {
        if (this.field845 == -1) {
            this.field845 = 0;
            if (this.field863 != null && (this.field839 == null || this.field839[0] == 10)) {
                this.field845 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field875[var1] != null) {
                    this.field845 = 1;
                }
            }
        }
        if (this.field862 == -1) {
            this.field862 = this.field843 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("as.s(Ldy;B)V")
    public void method606(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method634(arg0, var2);
        }
    }

    @ObfuscatedName("as.g(Ldy;II)V")
    public void method634(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2138();
            if (var3 > 0) {
                if (this.field863 == null || field865) {
                    this.field839 = new int[var3];
                    this.field863 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field863[var4] = arg0.method2239();
                        this.field839[var4] = arg0.method2138();
                    }
                } else {
                    arg0.field1838 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field836 = arg0.method2146();
        } else if (arg1 == 5) {
            int var5 = arg0.method2138();
            if (var5 > 0) {
                if (this.field863 == null || field865) {
                    this.field839 = null;
                    this.field863 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field863[var6] = arg0.method2239();
                    }
                } else {
                    arg0.field1838 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field835 = arg0.method2138();
        } else if (arg1 == 15) {
            this.field871 = arg0.method2138();
        } else if (arg1 == 17) {
            this.field843 = 0;
            this.field844 = false;
        } else if (arg1 == 18) {
            this.field844 = false;
        } else if (arg1 == 19) {
            this.field845 = arg0.method2138();
        } else if (arg1 == 21) {
            this.field846 = 0;
        } else if (arg1 == 22) {
            this.field847 = true;
        } else if (arg1 == 23) {
            this.field848 = true;
        } else if (arg1 == 24) {
            this.field849 = arg0.method2239();
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
        } else if (arg1 == 27) {
            this.field843 = 1;
        } else if (arg1 == 28) {
            this.field850 = arg0.method2138();
        } else if (arg1 == 29) {
            this.field866 = arg0.method2139();
        } else if (arg1 == 39) {
            this.field867 = arg0.method2139() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field875[arg1 - 30] = arg0.method2146();
            if (this.field875[arg1 - 30].equalsIgnoreCase(class143.field2221)) {
                this.field875[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2138();
            this.field837 = new short[var7];
            this.field838 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field837[var8] = (short) arg0.method2239();
                this.field838[var8] = (short) arg0.method2239();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2138();
            this.field834 = new short[var9];
            this.field840 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field834[var10] = (short) arg0.method2239();
                this.field840[var10] = (short) arg0.method2239();
            }
        } else if (arg1 == 60) {
            this.field854 = arg0.method2239();
        } else if (arg1 == 62) {
            this.field856 = true;
        } else if (arg1 == 64) {
            this.field857 = false;
        } else if (arg1 == 65) {
            this.field858 = arg0.method2239();
        } else if (arg1 == 66) {
            this.field851 = arg0.method2239();
        } else if (arg1 == 67) {
            this.field860 = arg0.method2239();
        } else if (arg1 == 68) {
            this.field855 = arg0.method2239();
        } else if (arg1 == 69) {
            arg0.method2138();
        } else if (arg1 == 70) {
            this.field861 = arg0.method2283();
        } else if (arg1 == 71) {
            this.field868 = arg0.method2283();
        } else if (arg1 == 72) {
            this.field826 = arg0.method2283();
        } else if (arg1 == 73) {
            this.field842 = true;
        } else if (arg1 == 74) {
            this.field830 = true;
        } else if (arg1 == 75) {
            this.field862 = arg0.method2138();
        } else if (arg1 == 77) {
            this.field852 = arg0.method2239();
            if (this.field852 == 65535) {
                this.field852 = -1;
            }
            this.field864 = arg0.method2239();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            int var11 = arg0.method2138();
            this.field841 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field841[var12] = arg0.method2239();
                if (this.field841[var12] == 65535) {
                    this.field841[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field870 = arg0.method2239();
            this.field869 = arg0.method2138();
        } else if (arg1 == 79) {
            this.field872 = arg0.method2239();
            this.field873 = arg0.method2239();
            this.field869 = arg0.method2138();
            int var13 = arg0.method2138();
            this.field874 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field874[var14] = arg0.method2239();
            }
        } else if (arg1 == 81) {
            this.field846 = arg0.method2138() * 256;
        }
    }

    @ObfuscatedName("as.h(IB)Z")
    public final boolean method608(int arg0) {
        if (this.field839 != null) {
            for (int var4 = 0; var4 < this.field839.length; var4++) {
                if (this.field839[var4] == arg0) {
                    return Statics.field827.method2731(this.field863[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field863 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field863.length; var3++) {
                var2 &= Statics.field827.method2731(this.field863[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("as.l(B)Z")
    public final boolean method638() {
        if (this.field863 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field863.length; var2++) {
            var1 &= Statics.field827.method2731(this.field863[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("as.e(II[[IIIIB)Lbw;")
    public final class78 method610(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field839 == null) {
            var7 = (long) ((this.field833 << 10) + arg1);
        } else {
            var7 = (long) ((this.field833 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field828.method3202(var7);
        if (var9 == null) {
            class93 var10 = this.method623(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field847) {
                var10.field1600 = (short) (this.field866 + 64);
                var10.field1572 = (short) (this.field867 + 768);
                var10.method1968();
                var9 = var10;
            } else {
                var9 = var10.method1913(this.field866 + 64, this.field867 + 768, -50, -10, -50);
            }
            field828.method3204(var9, var7);
        }
        if (this.field847) {
            var9 = ((class93) var9).method1897();
        }
        if (this.field846 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1987(arg2, arg3, arg4, arg5, true, this.field846);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1898(arg2, arg3, arg4, arg5, true, this.field846);
            }
        }
        return var9;
    }

    @ObfuscatedName("as.u(II[[IIIIB)Lck;")
    public final class98 method611(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field839 == null) {
            var7 = (long) ((this.field833 << 10) + arg1);
        } else {
            var7 = (long) ((this.field833 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field831.method3202(var7);
        if (var9 == null) {
            class93 var10 = this.method623(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1913(this.field866 + 64, this.field867 + 768, -50, -10, -50);
            field831.method3204(var9, var7);
        }
        if (this.field846 >= 0) {
            var9 = var9.method1987(arg2, arg3, arg4, arg5, true, this.field846);
        }
        return var9;
    }

    @ObfuscatedName("as.j(II[[IIIILac;II)Lck;")
    public final class98 method612(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field839 == null) {
            var9 = (long) ((this.field833 << 10) + arg1);
        } else {
            var9 = (long) ((this.field833 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field831.method3202(var9);
        if (var11 == null) {
            class93 var12 = this.method623(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1913(this.field866 + 64, this.field867 + 768, -50, -10, -50);
            field831.method3204(var11, var9);
        }
        if (arg6 == null && this.field846 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1988(true);
        } else {
            var13 = arg6.method712(var11, arg7, arg1);
        }
        if (this.field846 >= 0) {
            var13 = var13.method1987(arg2, arg3, arg4, arg5, false, this.field846);
        }
        return var13;
    }

    @ObfuscatedName("as.c(III)Lcf;")
    public final class93 method623(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field839 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field863 == null) {
                return null;
            }
            boolean var4 = this.field856;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field863.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field863[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field829.method3202((long) var7);
                if (var3 == null) {
                    var3 = class93.method1891(Statics.field827, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1907();
                    }
                    field829.method3204(var3, (long) var7);
                }
                if (var5 > 1) {
                    field832[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field832, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field839.length; var9++) {
                if (this.field839[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field863[var8];
            boolean var11 = this.field856 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field829.method3202((long) var10);
            if (var3 == null) {
                var3 = class93.method1891(Statics.field827, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1907();
                }
                field829.method3204(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field858 == 128 && this.field851 == 128 && this.field860 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field861 == 0 && this.field868 == 0 && this.field826 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field837 == null, this.field834 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1939(256);
            var14.method1904(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1900();
        } else if (var15 == 2) {
            var14.method1946();
        } else if (var15 == 3) {
            var14.method1896();
        }
        if (this.field837 != null) {
            for (int var16 = 0; var16 < this.field837.length; var16++) {
                var14.method1905(this.field837[var16], this.field838[var16]);
            }
        }
        if (this.field834 != null) {
            for (int var17 = 0; var17 < this.field834.length; var17++) {
                var14.method1956(this.field834[var17], this.field840[var17]);
            }
        }
        if (var12) {
            var14.method1908(this.field858, this.field851, this.field860);
        }
        if (var13) {
            var14.method1904(this.field861, this.field868, this.field826);
        }
        return var14;
    }

    @ObfuscatedName("as.d(I)Las;")
    public final class36 method614() {
        int var1 = -1;
        if (this.field852 != -1) {
            var1 = class155.method549(this.field852);
        } else if (this.field864 != -1) {
            var1 = class155.field2670[this.field864];
        }
        return var1 < 0 || var1 >= this.field841.length || this.field841[var1] == -1 ? null : method525(this.field841[var1]);
    }

    @ObfuscatedName("al.v(S)V")
    public static void method509() {
        field859.method3210();
        field829.method3210();
        field828.method3210();
        field831.method3210();
    }

    @ObfuscatedName("as.n(I)Z")
    public boolean method615() {
        if (this.field841 == null) {
            return this.field870 != -1 || this.field874 != null;
        }
        for (int var1 = 0; var1 < this.field841.length; var1++) {
            if (this.field841[var1] != -1) {
                class36 var2 = method525(this.field841[var1]);
                if (var2.field870 != -1 || var2.field874 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
