package deob;

@ObfuscatedName("av")
public class class36 extends class182 {

    @ObfuscatedName("av.e")
    public static boolean field873 = false;

    @ObfuscatedName("av.b")
    public static class171 field847 = new class171(64);

    @ObfuscatedName("av.w")
    public static class171 field848 = new class171(500);

    @ObfuscatedName("av.r")
    public static class171 field874 = new class171(30);

    @ObfuscatedName("av.l")
    public static class171 field850 = new class171(30);

    @ObfuscatedName("av.s")
    public static class93[] field851 = new class93[4];

    @ObfuscatedName("av.f")
    public int field852;

    @ObfuscatedName("av.x")
    public int[] field853;

    @ObfuscatedName("av.h")
    public int[] field854;

    @ObfuscatedName("av.a")
    public String field855 = "null";

    @ObfuscatedName("av.u")
    public short[] field856;

    @ObfuscatedName("av.v")
    public short[] field844;

    @ObfuscatedName("av.i")
    public short[] field858;

    @ObfuscatedName("av.n")
    public short[] field895;

    @ObfuscatedName("av.d")
    public int field896 = 1;

    @ObfuscatedName("av.k")
    public int field861 = 1;

    @ObfuscatedName("av.p")
    public int field862 = 2;

    @ObfuscatedName("av.j")
    public boolean field857 = true;

    @ObfuscatedName("av.z")
    public int field884 = -1;

    @ObfuscatedName("av.t")
    public int field865 = -1;

    @ObfuscatedName("av.c")
    public boolean field866 = false;

    @ObfuscatedName("av.q")
    public boolean field867 = false;

    @ObfuscatedName("av.g")
    public int field868 = -1;

    @ObfuscatedName("av.m")
    public int field869 = 16;

    @ObfuscatedName("av.ay")
    public int field870 = 0;

    @ObfuscatedName("av.ae")
    public int field871 = 0;

    @ObfuscatedName("av.af")
    public String[] field845 = new String[5];

    @ObfuscatedName("av.ab")
    public int field864 = -1;

    @ObfuscatedName("av.ao")
    public int field875 = -1;

    @ObfuscatedName("av.ak")
    public boolean field887 = false;

    @ObfuscatedName("av.ah")
    public boolean field876 = true;

    @ObfuscatedName("av.ai")
    public int field893 = 128;

    @ObfuscatedName("av.al")
    public int field878 = 128;

    @ObfuscatedName("av.av")
    public int field879 = 128;

    @ObfuscatedName("av.ap")
    public int field880 = 0;

    @ObfuscatedName("av.ar")
    public int field881 = 0;

    @ObfuscatedName("av.au")
    public int field882 = 0;

    @ObfuscatedName("av.aq")
    public boolean field883 = false;

    @ObfuscatedName("av.at")
    public boolean field849 = false;

    @ObfuscatedName("av.ag")
    public int field885 = -1;

    @ObfuscatedName("av.am")
    public int[] field886;

    @ObfuscatedName("av.aw")
    public int field890 = -1;

    @ObfuscatedName("av.ac")
    public int field888 = -1;

    @ObfuscatedName("av.as")
    public int field860 = -1;

    @ObfuscatedName("av.az")
    public int field846 = 0;

    @ObfuscatedName("av.ad")
    public int field891 = 0;

    @ObfuscatedName("av.ax")
    public int field872 = 0;

    @ObfuscatedName("av.aa")
    public int[] field863;

    @ObfuscatedName("o.e(Lez;Lez;ZB)V")
    public static void method18(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field889 = arg0;
        Statics.field892 = arg1;
        field873 = arg2;
    }

    @ObfuscatedName("ag.o(II)Lav;")
    public static class36 method809(int arg0) {
        class36 var1 = (class36) field847.method3058((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field889.method2709(6, arg0);
        class36 var3 = new class36();
        var3.field852 = arg0;
        if (var2 != null) {
            var3.method629(new class107(var2));
        }
        var3.method628();
        if (var3.field849) {
            var3.field862 = 0;
            var3.field857 = false;
        }
        field847.method3057(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.y(B)V")
    public void method628() {
        if (this.field884 == -1) {
            this.field884 = 0;
            if (this.field853 != null && (this.field854 == null || this.field854[0] == 10)) {
                this.field884 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field845[var1] != null) {
                    this.field884 = 1;
                }
            }
        }
        if (this.field885 == -1) {
            this.field885 = this.field862 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.b(Ldl;I)V")
    public void method629(class107 arg0) {
        while (true) {
            int var2 = arg0.method2123();
            if (var2 == 0) {
                return;
            }
            this.method630(arg0, var2);
        }
    }

    @ObfuscatedName("av.w(Ldl;II)V")
    public void method630(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2123();
            if (var3 > 0) {
                if (this.field853 == null || field873) {
                    this.field854 = new int[var3];
                    this.field853 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field853[var4] = arg0.method2232();
                        this.field854[var4] = arg0.method2123();
                    }
                } else {
                    arg0.field1841 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field855 = arg0.method2073();
        } else if (arg1 == 5) {
            int var5 = arg0.method2123();
            if (var5 > 0) {
                if (this.field853 == null || field873) {
                    this.field854 = null;
                    this.field853 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field853[var6] = arg0.method2232();
                    }
                } else {
                    arg0.field1841 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field896 = arg0.method2123();
        } else if (arg1 == 15) {
            this.field861 = arg0.method2123();
        } else if (arg1 == 17) {
            this.field862 = 0;
            this.field857 = false;
        } else if (arg1 == 18) {
            this.field857 = false;
        } else if (arg1 == 19) {
            this.field884 = arg0.method2123();
        } else if (arg1 == 21) {
            this.field865 = 0;
        } else if (arg1 == 22) {
            this.field866 = true;
        } else if (arg1 == 23) {
            this.field867 = true;
        } else if (arg1 == 24) {
            this.field868 = arg0.method2232();
            if (this.field868 == 65535) {
                this.field868 = -1;
            }
        } else if (arg1 == 27) {
            this.field862 = 1;
        } else if (arg1 == 28) {
            this.field869 = arg0.method2123();
        } else if (arg1 == 29) {
            this.field870 = arg0.method2066();
        } else if (arg1 == 39) {
            this.field871 = arg0.method2066() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field845[arg1 - 30] = arg0.method2073();
            if (this.field845[arg1 - 30].equalsIgnoreCase(class142.field2145)) {
                this.field845[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2123();
            this.field856 = new short[var7];
            this.field844 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field856[var8] = (short) arg0.method2232();
                this.field844[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2123();
            this.field858 = new short[var9];
            this.field895 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field858[var10] = (short) arg0.method2232();
                this.field895[var10] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            this.field864 = arg0.method2232();
        } else if (arg1 == 62) {
            this.field887 = true;
        } else if (arg1 == 64) {
            this.field876 = false;
        } else if (arg1 == 65) {
            this.field893 = arg0.method2232();
        } else if (arg1 == 66) {
            this.field878 = arg0.method2232();
        } else if (arg1 == 67) {
            this.field879 = arg0.method2232();
        } else if (arg1 == 68) {
            this.field875 = arg0.method2232();
        } else if (arg1 == 69) {
            arg0.method2123();
        } else if (arg1 == 70) {
            this.field880 = arg0.method2068();
        } else if (arg1 == 71) {
            this.field881 = arg0.method2068();
        } else if (arg1 == 72) {
            this.field882 = arg0.method2068();
        } else if (arg1 == 73) {
            this.field883 = true;
        } else if (arg1 == 74) {
            this.field849 = true;
        } else if (arg1 == 75) {
            this.field885 = arg0.method2123();
        } else if (arg1 == 77) {
            this.field890 = arg0.method2232();
            if (this.field890 == 65535) {
                this.field890 = -1;
            }
            this.field888 = arg0.method2232();
            if (this.field888 == 65535) {
                this.field888 = -1;
            }
            int var11 = arg0.method2123();
            this.field886 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field886[var12] = arg0.method2232();
                if (this.field886[var12] == 65535) {
                    this.field886[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field860 = arg0.method2232();
            this.field846 = arg0.method2123();
        } else if (arg1 == 79) {
            this.field891 = arg0.method2232();
            this.field872 = arg0.method2232();
            this.field846 = arg0.method2123();
            int var13 = arg0.method2123();
            this.field863 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field863[var14] = arg0.method2232();
            }
        } else if (arg1 == 81) {
            this.field865 = arg0.method2123() * 256;
        }
    }

    @ObfuscatedName("av.r(II)Z")
    public final boolean method638(int arg0) {
        if (this.field854 != null) {
            for (int var4 = 0; var4 < this.field854.length; var4++) {
                if (this.field854[var4] == arg0) {
                    return Statics.field892.method2649(this.field853[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field853 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field853.length; var3++) {
                var2 &= Statics.field892.method2649(this.field853[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.l(I)Z")
    public final boolean method632() {
        if (this.field853 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field853.length; var2++) {
            var1 &= Statics.field892.method2649(this.field853[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.s(II[[IIIIS)Lbm;")
    public final class78 method633(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field854 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field874.method3058(var7);
        if (var9 == null) {
            class93 var10 = this.method636(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field866) {
                var10.field1617 = (short) (this.field870 + 64);
                var10.field1618 = (short) (this.field871 + 768);
                var10.method1847();
                var9 = var10;
            } else {
                var9 = var10.method1900(this.field870 + 64, this.field871 + 768, -50, -10, -50);
            }
            field874.method3057(var9, var7);
        }
        if (this.field866) {
            var9 = ((class93) var9).method1877();
        }
        if (this.field865 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1960(arg2, arg3, arg4, arg5, true, this.field865);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1836(arg2, arg3, arg4, arg5, true, this.field865);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.f(II[[IIIII)Lcd;")
    public final class98 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field854 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field850.method3058(var7);
        if (var9 == null) {
            class93 var10 = this.method636(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1900(this.field870 + 64, this.field871 + 768, -50, -10, -50);
            field850.method3057(var9, var7);
        }
        if (this.field865 >= 0) {
            var9 = var9.method1960(arg2, arg3, arg4, arg5, true, this.field865);
        }
        return var9;
    }

    @ObfuscatedName("av.x(II[[IIIILar;II)Lcd;")
    public final class98 method667(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field854 == null) {
            var9 = (long) ((this.field852 << 10) + arg1);
        } else {
            var9 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field850.method3058(var9);
        if (var11 == null) {
            class93 var12 = this.method636(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1900(this.field870 + 64, this.field871 + 768, -50, -10, -50);
            field850.method3057(var11, var9);
        }
        if (arg6 == null && this.field865 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1924(true);
        } else {
            var13 = arg6.method704(var11, arg7, arg1);
        }
        if (this.field865 >= 0) {
            var13 = var13.method1960(arg2, arg3, arg4, arg5, false, this.field865);
        }
        return var13;
    }

    @ObfuscatedName("av.h(IIS)Lck;")
    public final class93 method636(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field854 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field853 == null) {
                return null;
            }
            boolean var4 = this.field887;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field853.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field853[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field848.method3058((long) var7);
                if (var3 == null) {
                    var3 = class93.method1831(Statics.field892, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1842();
                    }
                    field848.method3057(var3, (long) var7);
                }
                if (var5 > 1) {
                    field851[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field851, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field854.length; var9++) {
                if (this.field854[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field853[var8];
            boolean var11 = this.field887 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field848.method3058((long) var10);
            if (var3 == null) {
                var3 = class93.method1831(Statics.field892, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1842();
                }
                field848.method3057(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field893 == 128 && this.field878 == 128 && this.field879 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field880 == 0 && this.field881 == 0 && this.field882 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field856 == null, this.field858 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1841(256);
            var14.method1870(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1838();
        } else if (var15 == 2) {
            var14.method1854();
        } else if (var15 == 3) {
            var14.method1886();
        }
        if (this.field856 != null) {
            for (int var16 = 0; var16 < this.field856.length; var16++) {
                var14.method1868(this.field856[var16], this.field844[var16]);
            }
        }
        if (this.field858 != null) {
            for (int var17 = 0; var17 < this.field858.length; var17++) {
                var14.method1844(this.field858[var17], this.field895[var17]);
            }
        }
        if (var12) {
            var14.method1884(this.field893, this.field878, this.field879);
        }
        if (var13) {
            var14.method1870(this.field880, this.field881, this.field882);
        }
        return var14;
    }

    @ObfuscatedName("av.a(I)Lav;")
    public final class36 method637() {
        int var1 = -1;
        if (this.field890 != -1) {
            var1 = class154.method597(this.field890);
        } else if (this.field888 != -1) {
            var1 = class154.field2647[this.field888];
        }
        return var1 < 0 || var1 >= this.field886.length || this.field886[var1] == -1 ? null : method809(this.field886[var1]);
    }

    @ObfuscatedName("cx.u(B)V")
    public static void method1825() {
        field847.method3065();
        field848.method3065();
        field874.method3065();
        field850.method3065();
    }

    @ObfuscatedName("av.v(B)Z")
    public boolean method661() {
        if (this.field886 == null) {
            return this.field860 != -1 || this.field863 != null;
        }
        for (int var1 = 0; var1 < this.field886.length; var1++) {
            if (this.field886[var1] != -1) {
                class36 var2 = method809(this.field886[var1]);
                if (var2.field860 != -1 || var2.field863 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
