package deob;

@ObfuscatedName("at")
public class class38 extends class195 {

    @ObfuscatedName("at.n")
    public static boolean field894 = false;

    @ObfuscatedName("at.y")
    public static class184 field892 = new class184(64);

    @ObfuscatedName("at.e")
    public static class184 field864 = new class184(500);

    @ObfuscatedName("at.g")
    public static class184 field865 = new class184(30);

    @ObfuscatedName("at.f")
    public static class184 field866 = new class184(30);

    @ObfuscatedName("at.m")
    public static class95[] field860 = new class95[4];

    @ObfuscatedName("at.a")
    public int field868;

    @ObfuscatedName("at.h")
    public int[] field869;

    @ObfuscatedName("at.l")
    public int[] field870;

    @ObfuscatedName("at.u")
    public String field871 = "null";

    @ObfuscatedName("at.q")
    public short[] field867;

    @ObfuscatedName("at.k")
    public short[] field873;

    @ObfuscatedName("at.x")
    public short[] field906;

    @ObfuscatedName("at.r")
    public short[] field880;

    @ObfuscatedName("at.j")
    public int field877 = 1;

    @ObfuscatedName("at.s")
    public int field872 = 1;

    @ObfuscatedName("at.v")
    public int field875 = 2;

    @ObfuscatedName("at.c")
    public boolean field888 = true;

    @ObfuscatedName("at.p")
    public int field861 = -1;

    @ObfuscatedName("at.o")
    public int field898 = -1;

    @ObfuscatedName("at.b")
    public boolean field882 = false;

    @ObfuscatedName("at.t")
    public boolean field883 = false;

    @ObfuscatedName("at.w")
    public int field884 = -1;

    @ObfuscatedName("at.i")
    public int field886 = 16;

    @ObfuscatedName("at.ad")
    public int field874 = 0;

    @ObfuscatedName("at.ak")
    public int field878 = 0;

    @ObfuscatedName("at.ae")
    public String[] field863 = new String[5];

    @ObfuscatedName("at.ax")
    public int field889 = -1;

    @ObfuscatedName("at.al")
    public int field890 = -1;

    @ObfuscatedName("at.ar")
    public boolean field891 = false;

    @ObfuscatedName("at.as")
    public boolean field881 = true;

    @ObfuscatedName("at.ab")
    public int field893 = 128;

    @ObfuscatedName("at.ao")
    public int field905 = 128;

    @ObfuscatedName("at.ac")
    public int field895 = 128;

    @ObfuscatedName("at.az")
    public int field896 = 0;

    @ObfuscatedName("at.at")
    public int field897 = 0;

    @ObfuscatedName("at.aa")
    public int field876 = 0;

    @ObfuscatedName("at.an")
    public boolean field899 = false;

    @ObfuscatedName("at.aw")
    public boolean field900 = false;

    @ObfuscatedName("at.ai")
    public int field901 = -1;

    @ObfuscatedName("at.ah")
    public int[] field902;

    @ObfuscatedName("at.aq")
    public int field903 = -1;

    @ObfuscatedName("at.ay")
    public int field904 = -1;

    @ObfuscatedName("at.am")
    public int field885 = -1;

    @ObfuscatedName("at.aj")
    public int field887 = 0;

    @ObfuscatedName("at.ag")
    public int field907 = 0;

    @ObfuscatedName("at.ap")
    public int field908 = 0;

    @ObfuscatedName("at.af")
    public int[] field909;

    @ObfuscatedName("av.n(Lfs;Lfs;ZI)V")
    public static void method1086(class158 arg0, class158 arg1, boolean arg2) {
        Statics.field912 = arg0;
        Statics.field862 = arg1;
        field894 = arg2;
    }

    @ObfuscatedName("cj.d(II)Lat;")
    public static class38 method1667(int arg0) {
        class38 var1 = (class38) field892.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field912.method2948(6, arg0);
        class38 var3 = new class38();
        var3.field868 = arg0;
        if (var2 != null) {
            var3.method725(new class111(var2));
        }
        var3.method713();
        if (var3.field900) {
            var3.field875 = 0;
            var3.field888 = false;
        }
        field892.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.z(S)V")
    public void method713() {
        if (this.field861 == -1) {
            this.field861 = 0;
            if (this.field869 != null && (this.field870 == null || this.field870[0] == 10)) {
                this.field861 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field863[var1] != null) {
                    this.field861 = 1;
                }
            }
        }
        if (this.field901 == -1) {
            this.field901 = this.field875 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("at.y(Ldl;I)V")
    public void method725(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method715(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldl;IB)V")
    public void method715(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2228();
            if (var3 > 0) {
                if (this.field869 == null || field894) {
                    this.field870 = new int[var3];
                    this.field869 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field869[var4] = arg0.method2231();
                        this.field870[var4] = arg0.method2228();
                    }
                } else {
                    arg0.field1889 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field871 = arg0.method2290();
        } else if (arg1 == 5) {
            int var5 = arg0.method2228();
            if (var5 > 0) {
                if (this.field869 == null || field894) {
                    this.field870 = null;
                    this.field869 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field869[var6] = arg0.method2231();
                    }
                } else {
                    arg0.field1889 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field877 = arg0.method2228();
        } else if (arg1 == 15) {
            this.field872 = arg0.method2228();
        } else if (arg1 == 17) {
            this.field875 = 0;
            this.field888 = false;
        } else if (arg1 == 18) {
            this.field888 = false;
        } else if (arg1 == 19) {
            this.field861 = arg0.method2228();
        } else if (arg1 == 21) {
            this.field898 = 0;
        } else if (arg1 == 22) {
            this.field882 = true;
        } else if (arg1 == 23) {
            this.field883 = true;
        } else if (arg1 == 24) {
            this.field884 = arg0.method2231();
            if (this.field884 == 65535) {
                this.field884 = -1;
            }
        } else if (arg1 == 27) {
            this.field875 = 1;
        } else if (arg1 == 28) {
            this.field886 = arg0.method2228();
        } else if (arg1 == 29) {
            this.field874 = arg0.method2409();
        } else if (arg1 == 39) {
            this.field878 = arg0.method2409() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field863[arg1 - 30] = arg0.method2290();
            if (this.field863[arg1 - 30].equalsIgnoreCase(class148.field2257)) {
                this.field863[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2228();
            this.field867 = new short[var7];
            this.field873 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field867[var8] = (short) arg0.method2231();
                this.field873[var8] = (short) arg0.method2231();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2228();
            this.field906 = new short[var9];
            this.field880 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field906[var10] = (short) arg0.method2231();
                this.field880[var10] = (short) arg0.method2231();
            }
        } else if (arg1 == 60) {
            this.field889 = arg0.method2231();
        } else if (arg1 == 62) {
            this.field891 = true;
        } else if (arg1 == 64) {
            this.field881 = false;
        } else if (arg1 == 65) {
            this.field893 = arg0.method2231();
        } else if (arg1 == 66) {
            this.field905 = arg0.method2231();
        } else if (arg1 == 67) {
            this.field895 = arg0.method2231();
        } else if (arg1 == 68) {
            this.field890 = arg0.method2231();
        } else if (arg1 == 69) {
            arg0.method2228();
        } else if (arg1 == 70) {
            this.field896 = arg0.method2242();
        } else if (arg1 == 71) {
            this.field897 = arg0.method2242();
        } else if (arg1 == 72) {
            this.field876 = arg0.method2242();
        } else if (arg1 == 73) {
            this.field899 = true;
        } else if (arg1 == 74) {
            this.field900 = true;
        } else if (arg1 == 75) {
            this.field901 = arg0.method2228();
        } else if (arg1 == 77) {
            this.field903 = arg0.method2231();
            if (this.field903 == 65535) {
                this.field903 = -1;
            }
            this.field904 = arg0.method2231();
            if (this.field904 == 65535) {
                this.field904 = -1;
            }
            int var11 = arg0.method2228();
            this.field902 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field902[var12] = arg0.method2231();
                if (this.field902[var12] == 65535) {
                    this.field902[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field885 = arg0.method2231();
            this.field887 = arg0.method2228();
        } else if (arg1 == 79) {
            this.field907 = arg0.method2231();
            this.field908 = arg0.method2231();
            this.field887 = arg0.method2228();
            int var13 = arg0.method2228();
            this.field909 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field909[var14] = arg0.method2231();
            }
        } else if (arg1 == 81) {
            this.field898 = arg0.method2228() * 256;
        }
    }

    @ObfuscatedName("at.g(II)Z")
    public final boolean method716(int arg0) {
        if (this.field870 != null) {
            for (int var4 = 0; var4 < this.field870.length; var4++) {
                if (this.field870[var4] == arg0) {
                    return Statics.field862.method2950(this.field869[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field869 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field869.length; var3++) {
                var2 &= Statics.field862.method2950(this.field869[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("at.f(I)Z")
    public final boolean method741() {
        if (this.field869 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field869.length; var2++) {
            var1 &= Statics.field862.method2950(this.field869[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("at.m(II[[IIIIB)Lcb;")
    public final class80 method738(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field870 == null) {
            var7 = (long) ((this.field868 << 10) + arg1);
        } else {
            var7 = (long) ((this.field868 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field865.method3411(var7);
        if (var9 == null) {
            class95 var10 = this.method721(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field882) {
                var10.field1655 = (short) (this.field874 + 64);
                var10.field1656 = (short) (this.field878 + 768);
                var10.method1986();
                var9 = var10;
            } else {
                var9 = var10.method1994(this.field874 + 64, this.field878 + 768, -50, -10, -50);
            }
            field865.method3420(var9, var7);
        }
        if (this.field882) {
            var9 = ((class95) var9).method1974();
        }
        if (this.field898 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2068(arg2, arg3, arg4, arg5, true, this.field898);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1975(arg2, arg3, arg4, arg5, true, this.field898);
            }
        }
        return var9;
    }

    @ObfuscatedName("at.a(II[[IIIII)Lcg;")
    public final class100 method739(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field870 == null) {
            var7 = (long) ((this.field868 << 10) + arg1);
        } else {
            var7 = (long) ((this.field868 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field866.method3411(var7);
        if (var9 == null) {
            class95 var10 = this.method721(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1994(this.field874 + 64, this.field878 + 768, -50, -10, -50);
            field866.method3420(var9, var7);
        }
        if (this.field898 >= 0) {
            var9 = var9.method2068(arg2, arg3, arg4, arg5, true, this.field898);
        }
        return var9;
    }

    @ObfuscatedName("at.h(II[[IIIILan;II)Lcg;")
    public final class100 method720(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field870 == null) {
            var9 = (long) ((this.field868 << 10) + arg1);
        } else {
            var9 = (long) ((this.field868 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field866.method3411(var9);
        if (var11 == null) {
            class95 var12 = this.method721(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1994(this.field874 + 64, this.field878 + 768, -50, -10, -50);
            field866.method3420(var11, var9);
        }
        if (arg6 == null && this.field898 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2090(true);
        } else {
            var13 = arg6.method780(var11, arg7, arg1);
        }
        if (this.field898 >= 0) {
            var13 = var13.method2068(arg2, arg3, arg4, arg5, false, this.field898);
        }
        return var13;
    }

    @ObfuscatedName("at.l(III)Lcy;")
    public final class95 method721(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field870 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field869 == null) {
                return null;
            }
            boolean var4 = this.field891;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field869.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field869[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field864.method3411((long) var7);
                if (var3 == null) {
                    var3 = class95.method1969(Statics.field862, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2026();
                    }
                    field864.method3420(var3, (long) var7);
                }
                if (var5 > 1) {
                    field860[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field860, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field870.length; var9++) {
                if (this.field870[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field869[var8];
            boolean var11 = this.field891 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field864.method3411((long) var10);
            if (var3 == null) {
                var3 = class95.method1969(Statics.field862, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2026();
                }
                field864.method3420(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field893 == 128 && this.field905 == 128 && this.field895 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field896 == 0 && this.field897 == 0 && this.field876 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field867 == null, this.field906 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1973(256);
            var14.method1981(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1977();
        } else if (var15 == 2) {
            var14.method1978();
        } else if (var15 == 3) {
            var14.method1979();
        }
        if (this.field867 != null) {
            for (int var16 = 0; var16 < this.field867.length; var16++) {
                var14.method2001(this.field867[var16], this.field873[var16]);
            }
        }
        if (this.field906 != null) {
            for (int var17 = 0; var17 < this.field906.length; var17++) {
                var14.method2000(this.field906[var17], this.field880[var17]);
            }
        }
        if (var12) {
            var14.method1985(this.field893, this.field905, this.field895);
        }
        if (var13) {
            var14.method1981(this.field896, this.field897, this.field876);
        }
        return var14;
    }

    @ObfuscatedName("at.u(B)Lat;")
    public final class38 method731() {
        int var1 = -1;
        if (this.field903 != -1) {
            var1 = class167.method175(this.field903);
        } else if (this.field904 != -1) {
            var1 = class167.field2801[this.field904];
        }
        return var1 < 0 || var1 >= this.field902.length || this.field902[var1] == -1 ? null : method1667(this.field902[var1]);
    }

    @ObfuscatedName("at.q(B)Z")
    public boolean method723() {
        if (this.field902 == null) {
            return this.field885 != -1 || this.field909 != null;
        }
        for (int var1 = 0; var1 < this.field902.length; var1++) {
            if (this.field902[var1] != -1) {
                class38 var2 = method1667(this.field902[var1]);
                if (var2.field885 != -1 || var2.field909 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
