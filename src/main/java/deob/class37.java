package deob;

@ObfuscatedName("ak")
public class class37 extends class185 {

    @ObfuscatedName("ak.f")
    public static boolean field882 = false;

    @ObfuscatedName("ak.e")
    public static class174 field850 = new class174(64);

    @ObfuscatedName("ak.r")
    public static class174 field866 = new class174(500);

    @ObfuscatedName("ak.a")
    public static class174 field851 = new class174(30);

    @ObfuscatedName("ak.n")
    public static class174 field899 = new class174(30);

    @ObfuscatedName("ak.x")
    public static class94[] field865 = new class94[4];

    @ObfuscatedName("ak.g")
    public int field896;

    @ObfuscatedName("ak.o")
    public int[] field856;

    @ObfuscatedName("ak.p")
    public int[] field857;

    @ObfuscatedName("ak.v")
    public String field858 = "null";

    @ObfuscatedName("ak.w")
    public short[] field848;

    @ObfuscatedName("ak.t")
    public short[] field860;

    @ObfuscatedName("ak.s")
    public short[] field898;

    @ObfuscatedName("ak.b")
    public short[] field862;

    @ObfuscatedName("ak.u")
    public int field849 = 1;

    @ObfuscatedName("ak.j")
    public int field864 = 1;

    @ObfuscatedName("ak.d")
    public int field863 = 2;

    @ObfuscatedName("ak.l")
    public boolean field893 = true;

    @ObfuscatedName("ak.m")
    public int field867 = -1;

    @ObfuscatedName("ak.q")
    public int field868 = -1;

    @ObfuscatedName("ak.h")
    public boolean field871 = false;

    @ObfuscatedName("ak.c")
    public boolean field887 = false;

    @ObfuscatedName("ak.z")
    public int field852 = -1;

    @ObfuscatedName("ak.i")
    public int field872 = 16;

    @ObfuscatedName("ak.ah")
    public int field873 = 0;

    @ObfuscatedName("ak.aj")
    public int field874 = 0;

    @ObfuscatedName("ak.ar")
    public String[] field875 = new String[5];

    @ObfuscatedName("ak.al")
    public int field876 = -1;

    @ObfuscatedName("ak.aw")
    public int field877 = -1;

    @ObfuscatedName("ak.ao")
    public boolean field878 = false;

    @ObfuscatedName("ak.ax")
    public boolean field879 = true;

    @ObfuscatedName("ak.au")
    public int field880 = 128;

    @ObfuscatedName("ak.av")
    public int field881 = 128;

    @ObfuscatedName("ak.ae")
    public int field870 = 128;

    @ObfuscatedName("ak.ak")
    public int field883 = 0;

    @ObfuscatedName("ak.ay")
    public int field884 = 0;

    @ObfuscatedName("ak.at")
    public int field885 = 0;

    @ObfuscatedName("ak.ap")
    public boolean field886 = false;

    @ObfuscatedName("ak.an")
    public boolean field855 = false;

    @ObfuscatedName("ak.ad")
    public int field888 = -1;

    @ObfuscatedName("ak.ag")
    public int[] field889;

    @ObfuscatedName("ak.am")
    public int field890 = -1;

    @ObfuscatedName("ak.ai")
    public int field891 = -1;

    @ObfuscatedName("ak.ab")
    public int field892 = -1;

    @ObfuscatedName("ak.af")
    public int field859 = 0;

    @ObfuscatedName("ak.ac")
    public int field894 = 0;

    @ObfuscatedName("ak.aq")
    public int field895 = 0;

    @ObfuscatedName("ak.as")
    public int[] field869;

    @ObfuscatedName("ak.k(I)V")
    public void method681() {
        if (this.field867 == -1) {
            this.field867 = 0;
            if (this.field856 != null && (this.field857 == null || this.field857[0] == 10)) {
                this.field867 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field875[var1] != null) {
                    this.field867 = 1;
                }
            }
        }
        if (this.field888 == -1) {
            this.field888 = this.field863 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ak.y(Ldu;B)V")
    public void method700(class108 arg0) {
        while (true) {
            int var2 = arg0.method2158();
            if (var2 == 0) {
                return;
            }
            this.method716(arg0, var2);
        }
    }

    @ObfuscatedName("ak.e(Ldu;IB)V")
    public void method716(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2158();
            if (var3 > 0) {
                if (this.field856 == null || field882) {
                    this.field857 = new int[var3];
                    this.field856 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field856[var4] = arg0.method2160();
                        this.field857[var4] = arg0.method2158();
                    }
                } else {
                    arg0.field1859 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field858 = arg0.method2275();
        } else if (arg1 == 5) {
            int var5 = arg0.method2158();
            if (var5 > 0) {
                if (this.field856 == null || field882) {
                    this.field857 = null;
                    this.field856 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field856[var6] = arg0.method2160();
                    }
                } else {
                    arg0.field1859 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field849 = arg0.method2158();
        } else if (arg1 == 15) {
            this.field864 = arg0.method2158();
        } else if (arg1 == 17) {
            this.field863 = 0;
            this.field893 = false;
        } else if (arg1 == 18) {
            this.field893 = false;
        } else if (arg1 == 19) {
            this.field867 = arg0.method2158();
        } else if (arg1 == 21) {
            this.field868 = 0;
        } else if (arg1 == 22) {
            this.field871 = true;
        } else if (arg1 == 23) {
            this.field887 = true;
        } else if (arg1 == 24) {
            this.field852 = arg0.method2160();
            if (this.field852 == 65535) {
                this.field852 = -1;
            }
        } else if (arg1 == 27) {
            this.field863 = 1;
        } else if (arg1 == 28) {
            this.field872 = arg0.method2158();
        } else if (arg1 == 29) {
            this.field873 = arg0.method2159();
        } else if (arg1 == 39) {
            this.field874 = arg0.method2159() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field875[arg1 - 30] = arg0.method2275();
            if (this.field875[arg1 - 30].equalsIgnoreCase(class145.field2369)) {
                this.field875[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2158();
            this.field848 = new short[var7];
            this.field860 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field848[var8] = (short) arg0.method2160();
                this.field860[var8] = (short) arg0.method2160();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2158();
            this.field898 = new short[var9];
            this.field862 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field898[var10] = (short) arg0.method2160();
                this.field862[var10] = (short) arg0.method2160();
            }
        } else if (arg1 == 60) {
            this.field876 = arg0.method2160();
        } else if (arg1 == 62) {
            this.field878 = true;
        } else if (arg1 == 64) {
            this.field879 = false;
        } else if (arg1 == 65) {
            this.field880 = arg0.method2160();
        } else if (arg1 == 66) {
            this.field881 = arg0.method2160();
        } else if (arg1 == 67) {
            this.field870 = arg0.method2160();
        } else if (arg1 == 68) {
            this.field877 = arg0.method2160();
        } else if (arg1 == 69) {
            arg0.method2158();
        } else if (arg1 == 70) {
            this.field883 = arg0.method2161();
        } else if (arg1 == 71) {
            this.field884 = arg0.method2161();
        } else if (arg1 == 72) {
            this.field885 = arg0.method2161();
        } else if (arg1 == 73) {
            this.field886 = true;
        } else if (arg1 == 74) {
            this.field855 = true;
        } else if (arg1 == 75) {
            this.field888 = arg0.method2158();
        } else if (arg1 == 77) {
            this.field890 = arg0.method2160();
            if (this.field890 == 65535) {
                this.field890 = -1;
            }
            this.field891 = arg0.method2160();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            int var11 = arg0.method2158();
            this.field889 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field889[var12] = arg0.method2160();
                if (this.field889[var12] == 65535) {
                    this.field889[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field892 = arg0.method2160();
            this.field859 = arg0.method2158();
        } else if (arg1 == 79) {
            this.field894 = arg0.method2160();
            this.field895 = arg0.method2160();
            this.field859 = arg0.method2158();
            int var13 = arg0.method2158();
            this.field869 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field869[var14] = arg0.method2160();
            }
        } else if (arg1 == 81) {
            this.field868 = arg0.method2158() * 256;
        }
    }

    @ObfuscatedName("ak.r(IB)Z")
    public final boolean method717(int arg0) {
        if (this.field857 != null) {
            for (int var4 = 0; var4 < this.field857.length; var4++) {
                if (this.field857[var4] == arg0) {
                    return Statics.field1909.method2807(this.field856[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field856 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field856.length; var3++) {
                var2 &= Statics.field1909.method2807(this.field856[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ak.a(I)Z")
    public final boolean method726() {
        if (this.field856 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field856.length; var2++) {
            var1 &= Statics.field1909.method2807(this.field856[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ak.n(II[[IIIII)Lcs;")
    public final class79 method686(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field857 == null) {
            var7 = (long) ((this.field896 << 10) + arg1);
        } else {
            var7 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field851.method3207(var7);
        if (var9 == null) {
            class94 var10 = this.method711(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field871) {
                var10.field1599 = (short) (this.field873 + 64);
                var10.field1634 = (short) (this.field874 + 768);
                var10.method1999();
                var9 = var10;
            } else {
                var9 = var10.method1946(this.field873 + 64, this.field874 + 768, -50, -10, -50);
            }
            field851.method3209(var9, var7);
        }
        if (this.field871) {
            var9 = ((class94) var9).method1931();
        }
        if (this.field868 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method2066(arg2, arg3, arg4, arg5, true, this.field868);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1932(arg2, arg3, arg4, arg5, true, this.field868);
            }
        }
        return var9;
    }

    @ObfuscatedName("ak.x(II[[IIIIB)Lci;")
    public final class99 method682(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field857 == null) {
            var7 = (long) ((this.field896 << 10) + arg1);
        } else {
            var7 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field899.method3207(var7);
        if (var9 == null) {
            class94 var10 = this.method711(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1946(this.field873 + 64, this.field874 + 768, -50, -10, -50);
            field899.method3209(var9, var7);
        }
        if (this.field868 >= 0) {
            var9 = var9.method2066(arg2, arg3, arg4, arg5, true, this.field868);
        }
        return var9;
    }

    @ObfuscatedName("ak.g(II[[IIIILat;IB)Lci;")
    public final class99 method699(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field857 == null) {
            var9 = (long) ((this.field896 << 10) + arg1);
        } else {
            var9 = (long) ((this.field896 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field899.method3207(var9);
        if (var11 == null) {
            class94 var12 = this.method711(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1946(this.field873 + 64, this.field874 + 768, -50, -10, -50);
            field899.method3209(var11, var9);
        }
        if (arg6 == null && this.field868 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2021(true);
        } else {
            var13 = arg6.method745(var11, arg7, arg1);
        }
        if (this.field868 >= 0) {
            var13 = var13.method2066(arg2, arg3, arg4, arg5, false, this.field868);
        }
        return var13;
    }

    @ObfuscatedName("ak.o(III)Lcy;")
    public final class94 method711(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field857 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field856 == null) {
                return null;
            }
            boolean var4 = this.field878;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field856.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field856[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field866.method3207((long) var7);
                if (var3 == null) {
                    var3 = class94.method1925(Statics.field1909, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1941();
                    }
                    field866.method3209(var3, (long) var7);
                }
                if (var5 > 1) {
                    field865[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field865, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field857.length; var9++) {
                if (this.field857[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field856[var8];
            boolean var11 = this.field878 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field866.method3207((long) var10);
            if (var3 == null) {
                var3 = class94.method1925(Statics.field1909, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1941();
                }
                field866.method3209(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field880 == 128 && this.field881 == 128 && this.field870 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field883 == 0 && this.field884 == 0 && this.field885 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field848 == null, this.field898 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1972(256);
            var14.method1938(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1953();
        } else if (var15 == 2) {
            var14.method1935();
        } else if (var15 == 3) {
            var14.method1964();
        }
        if (this.field848 != null) {
            for (int var16 = 0; var16 < this.field848.length; var16++) {
                var14.method1939(this.field848[var16], this.field860[var16]);
            }
        }
        if (this.field898 != null) {
            for (int var17 = 0; var17 < this.field898.length; var17++) {
                var14.method1944(this.field898[var17], this.field862[var17]);
            }
        }
        if (var12) {
            var14.method1942(this.field880, this.field881, this.field870);
        }
        if (var13) {
            var14.method1938(this.field883, this.field884, this.field885);
        }
        return var14;
    }

    @ObfuscatedName("ak.p(B)Lak;")
    public final class37 method689() {
        int var1 = -1;
        if (this.field890 != -1) {
            var1 = class157.method33(this.field890);
        } else if (this.field891 != -1) {
            var1 = class157.field2680[this.field891];
        }
        return var1 < 0 || var1 >= this.field889.length || this.field889[var1] == -1 ? null : Statics.method644(this.field889[var1]);
    }

    @ObfuscatedName("ag.v(B)V")
    public static void method864() {
        field850.method3223();
        field866.method3223();
        field851.method3223();
        field899.method3223();
    }

    @ObfuscatedName("ak.w(S)Z")
    public boolean method685() {
        if (this.field889 == null) {
            return this.field892 != -1 || this.field869 != null;
        }
        for (int var1 = 0; var1 < this.field889.length; var1++) {
            if (this.field889[var1] != -1) {
                class37 var2 = Statics.method644(this.field889[var1]);
                if (var2.field892 != -1 || var2.field869 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
