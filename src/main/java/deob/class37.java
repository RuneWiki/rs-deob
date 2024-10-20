package deob;

@ObfuscatedName("az")
public class class37 extends class187 {

    @ObfuscatedName("az.a")
    public static boolean field878 = false;

    @ObfuscatedName("az.b")
    public static class176 field845 = new class176(64);

    @ObfuscatedName("az.l")
    public static class176 field877 = new class176(500);

    @ObfuscatedName("az.m")
    public static class176 field893 = new class176(30);

    @ObfuscatedName("az.w")
    public static class176 field847 = new class176(30);

    @ObfuscatedName("az.e")
    public static class94[] field856 = new class94[4];

    @ObfuscatedName("az.n")
    public int field850;

    @ObfuscatedName("az.s")
    public int[] field851;

    @ObfuscatedName("az.k")
    public int[] field846;

    @ObfuscatedName("az.f")
    public String field879 = "null";

    @ObfuscatedName("az.d")
    public short[] field854;

    @ObfuscatedName("az.x")
    public short[] field849;

    @ObfuscatedName("az.o")
    public short[] field866;

    @ObfuscatedName("az.q")
    public short[] field857;

    @ObfuscatedName("az.t")
    public int field858 = 1;

    @ObfuscatedName("az.h")
    public int field859 = 1;

    @ObfuscatedName("az.u")
    public int field842 = 2;

    @ObfuscatedName("az.j")
    public boolean field861 = true;

    @ObfuscatedName("az.g")
    public int field862 = -1;

    @ObfuscatedName("az.y")
    public int field852 = -1;

    @ObfuscatedName("az.p")
    public boolean field864 = false;

    @ObfuscatedName("az.r")
    public boolean field865 = false;

    @ObfuscatedName("az.z")
    public int field875 = -1;

    @ObfuscatedName("az.c")
    public int field867 = 16;

    @ObfuscatedName("az.an")
    public int field868 = 0;

    @ObfuscatedName("az.as")
    public int field869 = 0;

    @ObfuscatedName("az.ah")
    public String[] field870 = new String[5];

    @ObfuscatedName("az.ar")
    public int field855 = -1;

    @ObfuscatedName("az.ae")
    public int field891 = -1;

    @ObfuscatedName("az.av")
    public boolean field873 = false;

    @ObfuscatedName("az.al")
    public boolean field860 = true;

    @ObfuscatedName("az.aq")
    public int field888 = 128;

    @ObfuscatedName("az.am")
    public int field876 = 128;

    @ObfuscatedName("az.ax")
    public int field853 = 128;

    @ObfuscatedName("az.az")
    public int field863 = 0;

    @ObfuscatedName("az.ai")
    public int field880 = 0;

    @ObfuscatedName("az.aa")
    public int field848 = 0;

    @ObfuscatedName("az.at")
    public boolean field881 = false;

    @ObfuscatedName("az.aw")
    public boolean field882 = false;

    @ObfuscatedName("az.ao")
    public int field883 = -1;

    @ObfuscatedName("az.ag")
    public int[] field884;

    @ObfuscatedName("az.ad")
    public int field874 = -1;

    @ObfuscatedName("az.au")
    public int field886 = -1;

    @ObfuscatedName("az.ak")
    public int field887 = -1;

    @ObfuscatedName("az.aj")
    public int field872 = 0;

    @ObfuscatedName("az.af")
    public int field889 = 0;

    @ObfuscatedName("az.ab")
    public int field890 = 0;

    @ObfuscatedName("az.ac")
    public int[] field885;

    @ObfuscatedName("ax.a(Lek;Lek;ZB)V")
    public static void method661(class151 arg0, class151 arg1, boolean arg2) {
        Statics.field843 = arg0;
        Statics.field844 = arg1;
        field878 = arg2;
    }

    @ObfuscatedName("ff.v(II)Laz;")
    public static class37 method2964(int arg0) {
        class37 var1 = (class37) field845.method3181((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field843.method2731(6, arg0);
        class37 var3 = new class37();
        var3.field850 = arg0;
        if (var2 != null) {
            var3.method703(new class110(var2));
        }
        var3.method677();
        if (var3.field882) {
            var3.field842 = 0;
            var3.field861 = false;
        }
        field845.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.i(I)V")
    public void method677() {
        if (this.field862 == -1) {
            this.field862 = 0;
            if (this.field851 != null && (this.field846 == null || this.field846[0] == 10)) {
                this.field862 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field870[var1] != null) {
                    this.field862 = 1;
                }
            }
        }
        if (this.field883 == -1) {
            this.field883 = this.field842 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("az.b(Ldi;I)V")
    public void method703(class110 arg0) {
        while (true) {
            int var2 = arg0.method2199();
            if (var2 == 0) {
                return;
            }
            this.method688(arg0, var2);
        }
    }

    @ObfuscatedName("az.l(Ldi;IS)V")
    public void method688(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2199();
            if (var3 > 0) {
                if (this.field851 == null || field878) {
                    this.field846 = new int[var3];
                    this.field851 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field851[var4] = arg0.method2282();
                        this.field846[var4] = arg0.method2199();
                    }
                } else {
                    arg0.field1861 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field879 = arg0.method2139();
        } else if (arg1 == 5) {
            int var5 = arg0.method2199();
            if (var5 > 0) {
                if (this.field851 == null || field878) {
                    this.field846 = null;
                    this.field851 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field851[var6] = arg0.method2282();
                    }
                } else {
                    arg0.field1861 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field858 = arg0.method2199();
        } else if (arg1 == 15) {
            this.field859 = arg0.method2199();
        } else if (arg1 == 17) {
            this.field842 = 0;
            this.field861 = false;
        } else if (arg1 == 18) {
            this.field861 = false;
        } else if (arg1 == 19) {
            this.field862 = arg0.method2199();
        } else if (arg1 == 21) {
            this.field852 = 0;
        } else if (arg1 == 22) {
            this.field864 = true;
        } else if (arg1 == 23) {
            this.field865 = true;
        } else if (arg1 == 24) {
            this.field875 = arg0.method2282();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
        } else if (arg1 == 27) {
            this.field842 = 1;
        } else if (arg1 == 28) {
            this.field867 = arg0.method2199();
        } else if (arg1 == 29) {
            this.field868 = arg0.method2132();
        } else if (arg1 == 39) {
            this.field869 = arg0.method2132();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field870[arg1 - 30] = arg0.method2139();
            if (this.field870[arg1 - 30].equalsIgnoreCase(class147.field2290)) {
                this.field870[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2199();
            this.field854 = new short[var7];
            this.field849 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field854[var8] = (short) arg0.method2282();
                this.field849[var8] = (short) arg0.method2282();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2199();
            this.field866 = new short[var9];
            this.field857 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field866[var10] = (short) arg0.method2282();
                this.field857[var10] = (short) arg0.method2282();
            }
        } else if (arg1 == 60) {
            this.field855 = arg0.method2282();
        } else if (arg1 == 62) {
            this.field873 = true;
        } else if (arg1 == 64) {
            this.field860 = false;
        } else if (arg1 == 65) {
            this.field888 = arg0.method2282();
        } else if (arg1 == 66) {
            this.field876 = arg0.method2282();
        } else if (arg1 == 67) {
            this.field853 = arg0.method2282();
        } else if (arg1 == 68) {
            this.field891 = arg0.method2282();
        } else if (arg1 == 69) {
            arg0.method2199();
        } else if (arg1 == 70) {
            this.field863 = arg0.method2134();
        } else if (arg1 == 71) {
            this.field880 = arg0.method2134();
        } else if (arg1 == 72) {
            this.field848 = arg0.method2134();
        } else if (arg1 == 73) {
            this.field881 = true;
        } else if (arg1 == 74) {
            this.field882 = true;
        } else if (arg1 == 75) {
            this.field883 = arg0.method2199();
        } else if (arg1 == 77) {
            this.field874 = arg0.method2282();
            if (this.field874 == 65535) {
                this.field874 = -1;
            }
            this.field886 = arg0.method2282();
            if (this.field886 == 65535) {
                this.field886 = -1;
            }
            int var11 = arg0.method2199();
            this.field884 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field884[var12] = arg0.method2282();
                if (this.field884[var12] == 65535) {
                    this.field884[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field887 = arg0.method2282();
            this.field872 = arg0.method2199();
        } else if (arg1 == 79) {
            this.field889 = arg0.method2282();
            this.field890 = arg0.method2282();
            this.field872 = arg0.method2199();
            int var13 = arg0.method2199();
            this.field885 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field885[var14] = arg0.method2282();
            }
        } else if (arg1 == 81) {
            this.field852 = arg0.method2199() * 256;
        }
    }

    @ObfuscatedName("az.m(IB)Z")
    public final boolean method673(int arg0) {
        if (this.field846 != null) {
            for (int var4 = 0; var4 < this.field846.length; var4++) {
                if (this.field846[var4] == arg0) {
                    return Statics.field844.method2733(this.field851[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field851 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field851.length; var3++) {
                var2 &= Statics.field844.method2733(this.field851[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("az.w(I)Z")
    public final boolean method670() {
        if (this.field851 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field851.length; var2++) {
            var1 &= Statics.field844.method2733(this.field851[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("az.e(II[[IIIII)Lcr;")
    public final class79 method671(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field846 == null) {
            var7 = (long) ((this.field850 << 10) + arg1);
        } else {
            var7 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field893.method3181(var7);
        if (var9 == null) {
            class94 var10 = this.method681(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field864) {
                var10.field1617 = (short) (this.field868 + 64);
                var10.field1618 = (short) (this.field869 * 25 + 768);
                var10.method1896();
                var9 = var10;
            } else {
                var9 = var10.method1879(this.field868 + 64, this.field869 * 25 + 768, -50, -10, -50);
            }
            field893.method3183(var9, var7);
        }
        if (this.field864) {
            var9 = ((class94) var9).method1884();
        }
        if (this.field852 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method2030(arg2, arg3, arg4, arg5, true, this.field852);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1885(arg2, arg3, arg4, arg5, true, this.field852);
            }
        }
        return var9;
    }

    @ObfuscatedName("az.n(II[[IIIIB)Lcl;")
    public final class99 method672(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field846 == null) {
            var7 = (long) ((this.field850 << 10) + arg1);
        } else {
            var7 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field847.method3181(var7);
        if (var9 == null) {
            class94 var10 = this.method681(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1879(this.field868 + 64, this.field869 * 25 + 768, -50, -10, -50);
            field847.method3183(var9, var7);
        }
        if (this.field852 >= 0) {
            var9 = var9.method2030(arg2, arg3, arg4, arg5, true, this.field852);
        }
        return var9;
    }

    @ObfuscatedName("az.s(II[[IIIILaa;II)Lcl;")
    public final class99 method668(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field846 == null) {
            var9 = (long) ((this.field850 << 10) + arg1);
        } else {
            var9 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field847.method3181(var9);
        if (var11 == null) {
            class94 var12 = this.method681(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1879(this.field868 + 64, this.field869 * 25 + 768, -50, -10, -50);
            field847.method3183(var11, var9);
        }
        if (arg6 == null && this.field852 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method1977(true);
        } else {
            var13 = arg6.method736(var11, arg7, arg1);
        }
        if (this.field852 >= 0) {
            var13 = var13.method2030(arg2, arg3, arg4, arg5, false, this.field852);
        }
        return var13;
    }

    @ObfuscatedName("az.k(III)Lcy;")
    public final class94 method681(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field846 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field851 == null) {
                return null;
            }
            boolean var4 = this.field873;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field851.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field851[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field877.method3181((long) var7);
                if (var3 == null) {
                    var3 = class94.method1882(Statics.field844, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1894();
                    }
                    field877.method3183(var3, (long) var7);
                }
                if (var5 > 1) {
                    field856[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field856, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field846.length; var9++) {
                if (this.field846[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field851[var8];
            boolean var11 = this.field873 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field877.method3181((long) var10);
            if (var3 == null) {
                var3 = class94.method1882(Statics.field844, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1894();
                }
                field877.method3183(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field888 == 128 && this.field876 == 128 && this.field853 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field863 == 0 && this.field880 == 0 && this.field848 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field854 == null, this.field866 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1890(256);
            var14.method1933(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1887();
        } else if (var15 == 2) {
            var14.method1888();
        } else if (var15 == 3) {
            var14.method1889();
        }
        if (this.field854 != null) {
            for (int var16 = 0; var16 < this.field854.length; var16++) {
                var14.method1892(this.field854[var16], this.field849[var16]);
            }
        }
        if (this.field866 != null) {
            for (int var17 = 0; var17 < this.field866.length; var17++) {
                var14.method1907(this.field866[var17], this.field857[var17]);
            }
        }
        if (var12) {
            var14.method1913(this.field888, this.field876, this.field853);
        }
        if (var13) {
            var14.method1933(this.field863, this.field880, this.field848);
        }
        return var14;
    }

    @ObfuscatedName("az.f(I)Laz;")
    public final class37 method675() {
        int var1 = -1;
        if (this.field874 != -1) {
            var1 = class159.method2538(this.field874);
        } else if (this.field886 != -1) {
            var1 = class159.field2701[this.field886];
        }
        return var1 < 0 || var1 >= this.field884.length || this.field884[var1] == -1 ? null : method2964(this.field884[var1]);
    }

    @ObfuscatedName("dg.d(I)V")
    public static void method2075() {
        field845.method3184();
        field877.method3184();
        field893.method3184();
        field847.method3184();
    }

    @ObfuscatedName("az.x(I)Z")
    public boolean method682() {
        if (this.field884 == null) {
            return this.field887 != -1 || this.field885 != null;
        }
        for (int var1 = 0; var1 < this.field884.length; var1++) {
            if (this.field884[var1] != -1) {
                class37 var2 = method2964(this.field884[var1]);
                if (var2.field887 != -1 || var2.field885 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
