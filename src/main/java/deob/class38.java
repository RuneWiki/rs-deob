package deob;

@ObfuscatedName("am")
public class class38 extends class195 {

    @ObfuscatedName("am.b")
    public static boolean field862 = false;

    @ObfuscatedName("am.k")
    public static class184 field851 = new class184(64);

    @ObfuscatedName("am.p")
    public static class184 field899 = new class184(500);

    @ObfuscatedName("am.l")
    public static class184 field853 = new class184(30);

    @ObfuscatedName("am.u")
    public static class184 field854 = new class184(30);

    @ObfuscatedName("am.o")
    public static class95[] field855 = new class95[4];

    @ObfuscatedName("am.m")
    public int field856;

    @ObfuscatedName("am.q")
    public int[] field857;

    @ObfuscatedName("am.v")
    public int[] field858;

    @ObfuscatedName("am.n")
    public String field870 = "null";

    @ObfuscatedName("am.z")
    public short[] field860;

    @ObfuscatedName("am.r")
    public short[] field878;

    @ObfuscatedName("am.i")
    public short[] field893;

    @ObfuscatedName("am.s")
    public short[] field873;

    @ObfuscatedName("am.c")
    public int field864 = 1;

    @ObfuscatedName("am.t")
    public int field852 = 1;

    @ObfuscatedName("am.h")
    public int field866 = 2;

    @ObfuscatedName("am.w")
    public boolean field867 = true;

    @ObfuscatedName("am.g")
    public int field868 = -1;

    @ObfuscatedName("am.f")
    public int field869 = -1;

    @ObfuscatedName("am.y")
    public boolean field872 = false;

    @ObfuscatedName("am.j")
    public boolean field848 = false;

    @ObfuscatedName("am.x")
    public int field849 = -1;

    @ObfuscatedName("am.d")
    public int field861 = 16;

    @ObfuscatedName("am.ax")
    public int field874 = 0;

    @ObfuscatedName("am.ag")
    public int field902 = 0;

    @ObfuscatedName("am.ai")
    public String[] field876 = new String[5];

    @ObfuscatedName("am.ar")
    public int field898 = -1;

    @ObfuscatedName("am.aw")
    public int field859 = -1;

    @ObfuscatedName("am.ac")
    public boolean field879 = false;

    @ObfuscatedName("am.ap")
    public boolean field880 = true;

    @ObfuscatedName("am.al")
    public int field881 = 128;

    @ObfuscatedName("am.ak")
    public int field877 = 128;

    @ObfuscatedName("am.at")
    public int field883 = 128;

    @ObfuscatedName("am.au")
    public int field884 = 0;

    @ObfuscatedName("am.am")
    public int field885 = 0;

    @ObfuscatedName("am.aa")
    public int field886 = 0;

    @ObfuscatedName("am.az")
    public boolean field887 = false;

    @ObfuscatedName("am.ae")
    public boolean field888 = false;

    @ObfuscatedName("am.ah")
    public int field889 = -1;

    @ObfuscatedName("am.an")
    public int[] field890;

    @ObfuscatedName("am.aq")
    public int field891 = -1;

    @ObfuscatedName("am.as")
    public int field892 = -1;

    @ObfuscatedName("am.ay")
    public int field871 = -1;

    @ObfuscatedName("am.ad")
    public int field894 = 0;

    @ObfuscatedName("am.af")
    public int field895 = 0;

    @ObfuscatedName("am.ab")
    public int field896 = 0;

    @ObfuscatedName("am.av")
    public int[] field897;

    @ObfuscatedName("ca.b(IB)Lam;")
    public static class38 method1770(int arg0) {
        class38 var1 = (class38) field851.method3254((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field863.method2819(6, arg0);
        class38 var3 = new class38();
        var3.field856 = arg0;
        if (var2 != null) {
            var3.method674(new class111(var2));
        }
        var3.method678();
        if (var3.field888) {
            var3.field866 = 0;
            var3.field867 = false;
        }
        field851.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.e(I)V")
    public void method678() {
        if (this.field868 == -1) {
            this.field868 = 0;
            if (this.field857 != null && (this.field858 == null || this.field858[0] == 10)) {
                this.field868 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field876[var1] != null) {
                    this.field868 = 1;
                }
            }
        }
        if (this.field889 == -1) {
            this.field889 = this.field866 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.a(Ldj;I)V")
    public void method674(class111 arg0) {
        while (true) {
            int var2 = arg0.method2127();
            if (var2 == 0) {
                return;
            }
            this.method671(arg0, var2);
        }
    }

    @ObfuscatedName("am.k(Ldj;II)V")
    public void method671(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2127();
            if (var3 > 0) {
                if (this.field857 == null || field862) {
                    this.field858 = new int[var3];
                    this.field857 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field857[var4] = arg0.method2129();
                        this.field858[var4] = arg0.method2127();
                    }
                } else {
                    arg0.field1894 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field870 = arg0.method2166();
        } else if (arg1 == 5) {
            int var5 = arg0.method2127();
            if (var5 > 0) {
                if (this.field857 == null || field862) {
                    this.field858 = null;
                    this.field857 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field857[var6] = arg0.method2129();
                    }
                } else {
                    arg0.field1894 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field864 = arg0.method2127();
        } else if (arg1 == 15) {
            this.field852 = arg0.method2127();
        } else if (arg1 == 17) {
            this.field866 = 0;
            this.field867 = false;
        } else if (arg1 == 18) {
            this.field867 = false;
        } else if (arg1 == 19) {
            this.field868 = arg0.method2127();
        } else if (arg1 == 21) {
            this.field869 = 0;
        } else if (arg1 == 22) {
            this.field872 = true;
        } else if (arg1 == 23) {
            this.field848 = true;
        } else if (arg1 == 24) {
            this.field849 = arg0.method2129();
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
        } else if (arg1 == 27) {
            this.field866 = 1;
        } else if (arg1 == 28) {
            this.field861 = arg0.method2127();
        } else if (arg1 == 29) {
            this.field874 = arg0.method2267();
        } else if (arg1 == 39) {
            this.field902 = arg0.method2267() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field876[arg1 - 30] = arg0.method2166();
            if (this.field876[arg1 - 30].equalsIgnoreCase(class148.field2239)) {
                this.field876[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2127();
            this.field860 = new short[var7];
            this.field878 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field860[var8] = (short) arg0.method2129();
                this.field878[var8] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2127();
            this.field893 = new short[var9];
            this.field873 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field893[var10] = (short) arg0.method2129();
                this.field873[var10] = (short) arg0.method2129();
            }
        } else if (arg1 == 60) {
            this.field898 = arg0.method2129();
        } else if (arg1 == 62) {
            this.field879 = true;
        } else if (arg1 == 64) {
            this.field880 = false;
        } else if (arg1 == 65) {
            this.field881 = arg0.method2129();
        } else if (arg1 == 66) {
            this.field877 = arg0.method2129();
        } else if (arg1 == 67) {
            this.field883 = arg0.method2129();
        } else if (arg1 == 68) {
            this.field859 = arg0.method2129();
        } else if (arg1 == 69) {
            arg0.method2127();
        } else if (arg1 == 70) {
            this.field884 = arg0.method2130();
        } else if (arg1 == 71) {
            this.field885 = arg0.method2130();
        } else if (arg1 == 72) {
            this.field886 = arg0.method2130();
        } else if (arg1 == 73) {
            this.field887 = true;
        } else if (arg1 == 74) {
            this.field888 = true;
        } else if (arg1 == 75) {
            this.field889 = arg0.method2127();
        } else if (arg1 == 77) {
            this.field891 = arg0.method2129();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            this.field892 = arg0.method2129();
            if (this.field892 == 65535) {
                this.field892 = -1;
            }
            int var11 = arg0.method2127();
            this.field890 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field890[var12] = arg0.method2129();
                if (this.field890[var12] == 65535) {
                    this.field890[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field871 = arg0.method2129();
            this.field894 = arg0.method2127();
        } else if (arg1 == 79) {
            this.field895 = arg0.method2129();
            this.field896 = arg0.method2129();
            this.field894 = arg0.method2127();
            int var13 = arg0.method2127();
            this.field897 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field897[var14] = arg0.method2129();
            }
        } else if (arg1 == 81) {
            this.field869 = arg0.method2127() * 256;
        }
    }

    @ObfuscatedName("am.p(II)Z")
    public final boolean method673(int arg0) {
        if (this.field858 != null) {
            for (int var4 = 0; var4 < this.field858.length; var4++) {
                if (this.field858[var4] == arg0) {
                    return Statics.field850.method2821(this.field857[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field857 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field857.length; var3++) {
                var2 &= Statics.field850.method2821(this.field857[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.l(B)Z")
    public final boolean method694() {
        if (this.field857 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field857.length; var2++) {
            var1 &= Statics.field850.method2821(this.field857[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.u(II[[IIIIB)Lcm;")
    public final class80 method675(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field858 == null) {
            var7 = (long) ((this.field856 << 10) + arg1);
        } else {
            var7 = (long) ((this.field856 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field853.method3254(var7);
        if (var9 == null) {
            class95 var10 = this.method697(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field872) {
                var10.field1660 = (short) (this.field874 + 64);
                var10.field1646 = (short) (this.field902 + 768);
                var10.method1901();
                var9 = var10;
            } else {
                var9 = var10.method1898(this.field874 + 64, this.field902 + 768, -50, -10, -50);
            }
            field853.method3256(var9, var7);
        }
        if (this.field872) {
            var9 = ((class95) var9).method1882();
        }
        if (this.field869 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method1971(arg2, arg3, arg4, arg5, true, this.field869);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1883(arg2, arg3, arg4, arg5, true, this.field869);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.o(II[[IIIII)Lcx;")
    public final class100 method676(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field858 == null) {
            var7 = (long) ((this.field856 << 10) + arg1);
        } else {
            var7 = (long) ((this.field856 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field854.method3254(var7);
        if (var9 == null) {
            class95 var10 = this.method697(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1898(this.field874 + 64, this.field902 + 768, -50, -10, -50);
            field854.method3256(var9, var7);
        }
        if (this.field869 >= 0) {
            var9 = var9.method1971(arg2, arg3, arg4, arg5, true, this.field869);
        }
        return var9;
    }

    @ObfuscatedName("am.m(II[[IIIILaz;II)Lcx;")
    public final class100 method677(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field858 == null) {
            var9 = (long) ((this.field856 << 10) + arg1);
        } else {
            var9 = (long) ((this.field856 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field854.method3254(var9);
        if (var11 == null) {
            class95 var12 = this.method697(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1898(this.field874 + 64, this.field902 + 768, -50, -10, -50);
            field854.method3256(var11, var9);
        }
        if (arg6 == null && this.field869 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method1988(true);
        } else {
            var13 = arg6.method738(var11, arg7, arg1);
        }
        if (this.field869 >= 0) {
            var13 = var13.method1971(arg2, arg3, arg4, arg5, false, this.field869);
        }
        return var13;
    }

    @ObfuscatedName("am.q(III)Lcc;")
    public final class95 method697(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field858 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field857 == null) {
                return null;
            }
            boolean var4 = this.field879;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field857.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field857[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field899.method3254((long) var7);
                if (var3 == null) {
                    var3 = class95.method1878(Statics.field850, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1892();
                    }
                    field899.method3256(var3, (long) var7);
                }
                if (var5 > 1) {
                    field855[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field855, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field858.length; var9++) {
                if (this.field858[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field857[var8];
            boolean var11 = this.field879 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field899.method3254((long) var10);
            if (var3 == null) {
                var3 = class95.method1878(Statics.field850, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1892();
                }
                field899.method3256(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field881 == 128 && this.field877 == 128 && this.field883 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field884 == 0 && this.field885 == 0 && this.field886 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field860 == null, this.field893 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1888(256);
            var14.method1889(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1885();
        } else if (var15 == 2) {
            var14.method1886();
        } else if (var15 == 3) {
            var14.method1925();
        }
        if (this.field860 != null) {
            for (int var16 = 0; var16 < this.field860.length; var16++) {
                var14.method1877(this.field860[var16], this.field878[var16]);
            }
        }
        if (this.field893 != null) {
            for (int var17 = 0; var17 < this.field893.length; var17++) {
                var14.method1891(this.field893[var17], this.field873[var17]);
            }
        }
        if (var12) {
            var14.method1893(this.field881, this.field877, this.field883);
        }
        if (var13) {
            var14.method1889(this.field884, this.field885, this.field886);
        }
        return var14;
    }

    @ObfuscatedName("am.v(I)Lam;")
    public final class38 method679() {
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class167.method931(this.field891);
        } else if (this.field892 != -1) {
            var1 = class167.field2786[this.field892];
        }
        return var1 < 0 || var1 >= this.field890.length || this.field890[var1] == -1 ? null : method1770(this.field890[var1]);
    }

    @ObfuscatedName("am.n(B)Z")
    public boolean method710() {
        if (this.field890 == null) {
            return this.field871 != -1 || this.field897 != null;
        }
        for (int var1 = 0; var1 < this.field890.length; var1++) {
            if (this.field890[var1] != -1) {
                class38 var2 = method1770(this.field890[var1]);
                if (var2.field871 != -1 || var2.field897 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
