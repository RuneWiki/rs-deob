package deob;

@ObfuscatedName("ap")
public class class38 extends class195 {

    @ObfuscatedName("ap.o")
    public static boolean field898 = false;

    @ObfuscatedName("ap.u")
    public static class184 field863 = new class184(64);

    @ObfuscatedName("ap.q")
    public static class184 field877 = new class184(500);

    @ObfuscatedName("ap.r")
    public static class184 field884 = new class184(30);

    @ObfuscatedName("ap.v")
    public static class184 field864 = new class184(30);

    @ObfuscatedName("ap.y")
    public static class95[] field906 = new class95[4];

    @ObfuscatedName("ap.k")
    public int field866;

    @ObfuscatedName("ap.c")
    public int[] field867;

    @ObfuscatedName("ap.j")
    public int[] field868;

    @ObfuscatedName("ap.m")
    public String field869 = "null";

    @ObfuscatedName("ap.a")
    public short[] field900;

    @ObfuscatedName("ap.f")
    public short[] field871;

    @ObfuscatedName("ap.i")
    public short[] field872;

    @ObfuscatedName("ap.n")
    public short[] field873;

    @ObfuscatedName("ap.x")
    public int field874 = 1;

    @ObfuscatedName("ap.h")
    public int field875 = 1;

    @ObfuscatedName("ap.t")
    public int field876 = 2;

    @ObfuscatedName("ap.w")
    public boolean field905 = true;

    @ObfuscatedName("ap.p")
    public int field878 = -1;

    @ObfuscatedName("ap.z")
    public int field879 = -1;

    @ObfuscatedName("ap.s")
    public boolean field880 = false;

    @ObfuscatedName("ap.d")
    public boolean field881 = false;

    @ObfuscatedName("ap.b")
    public int field882 = -1;

    @ObfuscatedName("ap.e")
    public int field883 = 16;

    @ObfuscatedName("ap.ar")
    public int field902 = 0;

    @ObfuscatedName("ap.av")
    public int field890 = 0;

    @ObfuscatedName("ap.ae")
    public String[] field862 = new String[5];

    @ObfuscatedName("ap.aq")
    public int field887 = -1;

    @ObfuscatedName("ap.ay")
    public int field888 = -1;

    @ObfuscatedName("ap.ac")
    public boolean field886 = false;

    @ObfuscatedName("ap.ao")
    public boolean field889 = true;

    @ObfuscatedName("ap.ab")
    public int field891 = 128;

    @ObfuscatedName("ap.at")
    public int field892 = 128;

    @ObfuscatedName("ap.ai")
    public int field893 = 128;

    @ObfuscatedName("ap.aa")
    public int field894 = 0;

    @ObfuscatedName("ap.ap")
    public int field895 = 0;

    @ObfuscatedName("ap.ad")
    public int field896 = 0;

    @ObfuscatedName("ap.aw")
    public boolean field897 = false;

    @ObfuscatedName("ap.ax")
    public boolean field865 = false;

    @ObfuscatedName("ap.az")
    public int field899 = -1;

    @ObfuscatedName("ap.af")
    public int[] field861;

    @ObfuscatedName("ap.al")
    public int field870 = -1;

    @ObfuscatedName("ap.ak")
    public int field885 = -1;

    @ObfuscatedName("ap.as")
    public int field903 = -1;

    @ObfuscatedName("ap.ag")
    public int field904 = 0;

    @ObfuscatedName("ap.an")
    public int field858 = 0;

    @ObfuscatedName("ap.au")
    public int field860 = 0;

    @ObfuscatedName("ap.am")
    public int[] field907;

    @ObfuscatedName("ex.o(Lfg;Lfg;ZI)V")
    public static void method2840(class158 arg0, class158 arg1, boolean arg2) {
        Statics.field859 = arg0;
        Statics.field901 = arg1;
        field898 = arg2;
    }

    @ObfuscatedName("f.l(II)Lap;")
    public static class38 method150(int arg0) {
        class38 var1 = (class38) field863.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field859.method2940(6, arg0);
        class38 var3 = new class38();
        var3.field866 = arg0;
        if (var2 != null) {
            var3.method696(new class111(var2));
        }
        var3.method695();
        if (var3.field865) {
            var3.field876 = 0;
            var3.field905 = false;
        }
        field863.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.g(I)V")
    public void method695() {
        if (this.field878 == -1) {
            this.field878 = 0;
            if (this.field867 != null && (this.field868 == null || this.field868[0] == 10)) {
                this.field878 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field862[var1] != null) {
                    this.field878 = 1;
                }
            }
        }
        if (this.field899 == -1) {
            this.field899 = this.field876 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.u(Ldk;I)V")
    public void method696(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method697(arg0, var2);
        }
    }

    @ObfuscatedName("ap.q(Ldk;II)V")
    public void method697(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2219();
            if (var3 > 0) {
                if (this.field867 == null || field898) {
                    this.field868 = new int[var3];
                    this.field867 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field867[var4] = arg0.method2397();
                        this.field868[var4] = arg0.method2219();
                    }
                } else {
                    arg0.field1861 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field869 = arg0.method2339();
        } else if (arg1 == 5) {
            int var5 = arg0.method2219();
            if (var5 > 0) {
                if (this.field867 == null || field898) {
                    this.field868 = null;
                    this.field867 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field867[var6] = arg0.method2397();
                    }
                } else {
                    arg0.field1861 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field874 = arg0.method2219();
        } else if (arg1 == 15) {
            this.field875 = arg0.method2219();
        } else if (arg1 == 17) {
            this.field876 = 0;
            this.field905 = false;
        } else if (arg1 == 18) {
            this.field905 = false;
        } else if (arg1 == 19) {
            this.field878 = arg0.method2219();
        } else if (arg1 == 21) {
            this.field879 = 0;
        } else if (arg1 == 22) {
            this.field880 = true;
        } else if (arg1 == 23) {
            this.field881 = true;
        } else if (arg1 == 24) {
            this.field882 = arg0.method2397();
            if (this.field882 == 65535) {
                this.field882 = -1;
            }
        } else if (arg1 == 27) {
            this.field876 = 1;
        } else if (arg1 == 28) {
            this.field883 = arg0.method2219();
        } else if (arg1 == 29) {
            this.field902 = arg0.method2220();
        } else if (arg1 == 39) {
            this.field890 = arg0.method2220() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field862[arg1 - 30] = arg0.method2339();
            if (this.field862[arg1 - 30].equalsIgnoreCase(class148.field2429)) {
                this.field862[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2219();
            this.field900 = new short[var7];
            this.field871 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field900[var8] = (short) arg0.method2397();
                this.field871[var8] = (short) arg0.method2397();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2219();
            this.field872 = new short[var9];
            this.field873 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field872[var10] = (short) arg0.method2397();
                this.field873[var10] = (short) arg0.method2397();
            }
        } else if (arg1 == 60) {
            this.field887 = arg0.method2397();
        } else if (arg1 == 62) {
            this.field886 = true;
        } else if (arg1 == 64) {
            this.field889 = false;
        } else if (arg1 == 65) {
            this.field891 = arg0.method2397();
        } else if (arg1 == 66) {
            this.field892 = arg0.method2397();
        } else if (arg1 == 67) {
            this.field893 = arg0.method2397();
        } else if (arg1 == 68) {
            this.field888 = arg0.method2397();
        } else if (arg1 == 69) {
            arg0.method2219();
        } else if (arg1 == 70) {
            this.field894 = arg0.method2222();
        } else if (arg1 == 71) {
            this.field895 = arg0.method2222();
        } else if (arg1 == 72) {
            this.field896 = arg0.method2222();
        } else if (arg1 == 73) {
            this.field897 = true;
        } else if (arg1 == 74) {
            this.field865 = true;
        } else if (arg1 == 75) {
            this.field899 = arg0.method2219();
        } else if (arg1 == 77) {
            this.field870 = arg0.method2397();
            if (this.field870 == 65535) {
                this.field870 = -1;
            }
            this.field885 = arg0.method2397();
            if (this.field885 == 65535) {
                this.field885 = -1;
            }
            int var11 = arg0.method2219();
            this.field861 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field861[var12] = arg0.method2397();
                if (this.field861[var12] == 65535) {
                    this.field861[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field903 = arg0.method2397();
            this.field904 = arg0.method2219();
        } else if (arg1 == 79) {
            this.field858 = arg0.method2397();
            this.field860 = arg0.method2397();
            this.field904 = arg0.method2219();
            int var13 = arg0.method2219();
            this.field907 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field907[var14] = arg0.method2397();
            }
        } else if (arg1 == 81) {
            this.field879 = arg0.method2219() * 256;
        }
    }

    @ObfuscatedName("ap.r(II)Z")
    public final boolean method698(int arg0) {
        if (this.field868 != null) {
            for (int var4 = 0; var4 < this.field868.length; var4++) {
                if (this.field868[var4] == arg0) {
                    return Statics.field901.method2978(this.field867[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field867 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field867.length; var3++) {
                var2 &= Statics.field901.method2978(this.field867[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.v(B)Z")
    public final boolean method699() {
        if (this.field867 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field867.length; var2++) {
            var1 &= Statics.field901.method2978(this.field867[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.y(II[[IIIIB)Lch;")
    public final class80 method700(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field868 == null) {
            var7 = (long) ((this.field866 << 10) + arg1);
        } else {
            var7 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field884.method3401(var7);
        if (var9 == null) {
            class95 var10 = this.method744(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field880) {
                var10.field1606 = (short) (this.field902 + 64);
                var10.field1632 = (short) (this.field890 + 768);
                var10.method1975();
                var9 = var10;
            } else {
                var9 = var10.method1983(this.field902 + 64, this.field890 + 768, -50, -10, -50);
            }
            field884.method3403(var9, var7);
        }
        if (this.field880) {
            var9 = ((class95) var9).method1963();
        }
        if (this.field879 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2125(arg2, arg3, arg4, arg5, true, this.field879);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1980(arg2, arg3, arg4, arg5, true, this.field879);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.k(II[[IIIII)Lcq;")
    public final class100 method701(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field868 == null) {
            var7 = (long) ((this.field866 << 10) + arg1);
        } else {
            var7 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field864.method3401(var7);
        if (var9 == null) {
            class95 var10 = this.method744(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1983(this.field902 + 64, this.field890 + 768, -50, -10, -50);
            field864.method3403(var9, var7);
        }
        if (this.field879 >= 0) {
            var9 = var9.method2125(arg2, arg3, arg4, arg5, true, this.field879);
        }
        return var9;
    }

    @ObfuscatedName("ap.c(II[[IIIILaw;IB)Lcq;")
    public final class100 method729(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field868 == null) {
            var9 = (long) ((this.field866 << 10) + arg1);
        } else {
            var9 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field864.method3401(var9);
        if (var11 == null) {
            class95 var12 = this.method744(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1983(this.field902 + 64, this.field890 + 768, -50, -10, -50);
            field864.method3403(var11, var9);
        }
        if (arg6 == null && this.field879 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2099(true);
        } else {
            var13 = arg6.method780(var11, arg7, arg1);
        }
        if (this.field879 >= 0) {
            var13 = var13.method2125(arg2, arg3, arg4, arg5, false, this.field879);
        }
        return var13;
    }

    @ObfuscatedName("ap.j(III)Lcl;")
    public final class95 method744(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field868 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field867 == null) {
                return null;
            }
            boolean var4 = this.field886;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field867.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field867[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field877.method3401((long) var7);
                if (var3 == null) {
                    var3 = class95.method1967(Statics.field901, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1973();
                    }
                    field877.method3403(var3, (long) var7);
                }
                if (var5 > 1) {
                    field906[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field906, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field868.length; var9++) {
                if (this.field868[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field867[var8];
            boolean var11 = this.field886 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field877.method3401((long) var10);
            if (var3 == null) {
                var3 = class95.method1967(Statics.field901, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1973();
                }
                field877.method3403(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field891 == 128 && this.field892 == 128 && this.field893 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field894 == 0 && this.field895 == 0 && this.field896 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field900 == null, this.field872 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1994(256);
            var14.method1981(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1964();
        } else if (var15 == 2) {
            var14.method1962();
        } else if (var15 == 3) {
            var14.method1956();
        }
        if (this.field900 != null) {
            for (int var16 = 0; var16 < this.field900.length; var16++) {
                var14.method1971(this.field900[var16], this.field871[var16]);
            }
        }
        if (this.field872 != null) {
            for (int var17 = 0; var17 < this.field872.length; var17++) {
                var14.method1979(this.field872[var17], this.field873[var17]);
            }
        }
        if (var12) {
            var14.method1974(this.field891, this.field892, this.field893);
        }
        if (var13) {
            var14.method1981(this.field894, this.field895, this.field896);
        }
        return var14;
    }

    @ObfuscatedName("ap.m(I)Lap;")
    public final class38 method704() {
        int var1 = -1;
        if (this.field870 != -1) {
            var1 = class167.method558(this.field870);
        } else if (this.field885 != -1) {
            var1 = class167.field2791[this.field885];
        }
        return var1 < 0 || var1 >= this.field861.length || this.field861[var1] == -1 ? null : method150(this.field861[var1]);
    }

    @ObfuscatedName("aq.a(I)V")
    public static void method623() {
        field863.method3404();
        field877.method3404();
        field884.method3404();
        field864.method3404();
    }

    @ObfuscatedName("ap.f(I)Z")
    public boolean method747() {
        if (this.field861 == null) {
            return this.field903 != -1 || this.field907 != null;
        }
        for (int var1 = 0; var1 < this.field861.length; var1++) {
            if (this.field861[var1] != -1) {
                class38 var2 = method150(this.field861[var1]);
                if (var2.field903 != -1 || var2.field907 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
