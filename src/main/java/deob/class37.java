package deob;

@ObfuscatedName("ah")
public class class37 extends class185 {

    @ObfuscatedName("ah.x")
    public static boolean field854 = false;

    @ObfuscatedName("ah.e")
    public static class174 field849 = new class174(64);

    @ObfuscatedName("ah.h")
    public static class174 field856 = new class174(500);

    @ObfuscatedName("ah.p")
    public static class174 field884 = new class174(30);

    @ObfuscatedName("ah.j")
    public static class174 field855 = new class174(30);

    @ObfuscatedName("ah.i")
    public static class94[] field852 = new class94[4];

    @ObfuscatedName("ah.u")
    public int field857;

    @ObfuscatedName("ah.l")
    public int[] field858;

    @ObfuscatedName("ah.k")
    public int[] field897;

    @ObfuscatedName("ah.q")
    public String field900 = "null";

    @ObfuscatedName("ah.b")
    public short[] field861;

    @ObfuscatedName("ah.w")
    public short[] field862;

    @ObfuscatedName("ah.g")
    public short[] field863;

    @ObfuscatedName("ah.s")
    public short[] field864;

    @ObfuscatedName("ah.c")
    public int field860 = 1;

    @ObfuscatedName("ah.r")
    public int field866 = 1;

    @ObfuscatedName("ah.f")
    public int field867 = 2;

    @ObfuscatedName("ah.t")
    public boolean field868 = true;

    @ObfuscatedName("ah.o")
    public int field894 = -1;

    @ObfuscatedName("ah.z")
    public int field870 = -1;

    @ObfuscatedName("ah.d")
    public boolean field871 = false;

    @ObfuscatedName("ah.y")
    public boolean field872 = false;

    @ObfuscatedName("ah.a")
    public int field887 = -1;

    @ObfuscatedName("ah.n")
    public int field898 = 16;

    @ObfuscatedName("ah.ae")
    public int field880 = 0;

    @ObfuscatedName("ah.ay")
    public int field876 = 0;

    @ObfuscatedName("ah.ac")
    public String[] field877 = new String[5];

    @ObfuscatedName("ah.ag")
    public int field878 = -1;

    @ObfuscatedName("ah.am")
    public int field879 = -1;

    @ObfuscatedName("ah.au")
    public boolean field873 = false;

    @ObfuscatedName("ah.ai")
    public boolean field881 = true;

    @ObfuscatedName("ah.ab")
    public int field882 = 128;

    @ObfuscatedName("ah.az")
    public int field850 = 128;

    @ObfuscatedName("ah.as")
    public int field885 = 128;

    @ObfuscatedName("ah.ah")
    public int field869 = 0;

    @ObfuscatedName("ah.aw")
    public int field886 = 0;

    @ObfuscatedName("ah.ar")
    public int field865 = 0;

    @ObfuscatedName("ah.at")
    public boolean field888 = false;

    @ObfuscatedName("ah.ap")
    public boolean field889 = false;

    @ObfuscatedName("ah.ak")
    public int field883 = -1;

    @ObfuscatedName("ah.aa")
    public int[] field891;

    @ObfuscatedName("ah.av")
    public int field892 = -1;

    @ObfuscatedName("ah.al")
    public int field893 = -1;

    @ObfuscatedName("ah.af")
    public int field874 = -1;

    @ObfuscatedName("ah.aj")
    public int field895 = 0;

    @ObfuscatedName("ah.ao")
    public int field896 = 0;

    @ObfuscatedName("ah.an")
    public int field853 = 0;

    @ObfuscatedName("ah.ad")
    public int[] field890;

    @ObfuscatedName("u.x(IS)Lah;")
    public static class37 method96(int arg0) {
        class37 var1 = (class37) field849.method3186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field875.method2751(6, arg0);
        class37 var3 = new class37();
        var3.field857 = arg0;
        if (var2 != null) {
            var3.method667(new class108(var2));
        }
        var3.method692();
        if (var3.field889) {
            var3.field867 = 0;
            var3.field868 = false;
        }
        field849.method3183(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.v(I)V")
    public void method692() {
        if (this.field894 == -1) {
            this.field894 = 0;
            if (this.field858 != null && (this.field897 == null || this.field897[0] == 10)) {
                this.field894 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field877[var1] != null) {
                    this.field894 = 1;
                }
            }
        }
        if (this.field883 == -1) {
            this.field883 = this.field867 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ah.m(Ldm;I)V")
    public void method667(class108 arg0) {
        while (true) {
            int var2 = arg0.method2299();
            if (var2 == 0) {
                return;
            }
            this.method668(arg0, var2);
        }
    }

    @ObfuscatedName("ah.e(Ldm;II)V")
    public void method668(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2299();
            if (var3 > 0) {
                if (this.field858 == null || field854) {
                    this.field897 = new int[var3];
                    this.field858 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field858[var4] = arg0.method2129();
                        this.field897[var4] = arg0.method2299();
                    }
                } else {
                    arg0.field1841 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field900 = arg0.method2270();
        } else if (arg1 == 5) {
            int var5 = arg0.method2299();
            if (var5 > 0) {
                if (this.field858 == null || field854) {
                    this.field897 = null;
                    this.field858 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field858[var6] = arg0.method2129();
                    }
                } else {
                    arg0.field1841 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field860 = arg0.method2299();
        } else if (arg1 == 15) {
            this.field866 = arg0.method2299();
        } else if (arg1 == 17) {
            this.field867 = 0;
            this.field868 = false;
        } else if (arg1 == 18) {
            this.field868 = false;
        } else if (arg1 == 19) {
            this.field894 = arg0.method2299();
        } else if (arg1 == 21) {
            this.field870 = 0;
        } else if (arg1 == 22) {
            this.field871 = true;
        } else if (arg1 == 23) {
            this.field872 = true;
        } else if (arg1 == 24) {
            this.field887 = arg0.method2129();
            if (this.field887 == 65535) {
                this.field887 = -1;
            }
        } else if (arg1 == 27) {
            this.field867 = 1;
        } else if (arg1 == 28) {
            this.field898 = arg0.method2299();
        } else if (arg1 == 29) {
            this.field880 = arg0.method2128();
        } else if (arg1 == 39) {
            this.field876 = arg0.method2128() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field877[arg1 - 30] = arg0.method2270();
            if (this.field877[arg1 - 30].equalsIgnoreCase(class145.field2164)) {
                this.field877[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2299();
            this.field861 = new short[var7];
            this.field862 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field861[var8] = (short) arg0.method2129();
                this.field862[var8] = (short) arg0.method2129();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2299();
            this.field863 = new short[var9];
            this.field864 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field863[var10] = (short) arg0.method2129();
                this.field864[var10] = (short) arg0.method2129();
            }
        } else if (arg1 == 60) {
            this.field878 = arg0.method2129();
        } else if (arg1 == 62) {
            this.field873 = true;
        } else if (arg1 == 64) {
            this.field881 = false;
        } else if (arg1 == 65) {
            this.field882 = arg0.method2129();
        } else if (arg1 == 66) {
            this.field850 = arg0.method2129();
        } else if (arg1 == 67) {
            this.field885 = arg0.method2129();
        } else if (arg1 == 68) {
            this.field879 = arg0.method2129();
        } else if (arg1 == 69) {
            arg0.method2299();
        } else if (arg1 == 70) {
            this.field869 = arg0.method2130();
        } else if (arg1 == 71) {
            this.field886 = arg0.method2130();
        } else if (arg1 == 72) {
            this.field865 = arg0.method2130();
        } else if (arg1 == 73) {
            this.field888 = true;
        } else if (arg1 == 74) {
            this.field889 = true;
        } else if (arg1 == 75) {
            this.field883 = arg0.method2299();
        } else if (arg1 == 77) {
            this.field892 = arg0.method2129();
            if (this.field892 == 65535) {
                this.field892 = -1;
            }
            this.field893 = arg0.method2129();
            if (this.field893 == 65535) {
                this.field893 = -1;
            }
            int var11 = arg0.method2299();
            this.field891 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field891[var12] = arg0.method2129();
                if (this.field891[var12] == 65535) {
                    this.field891[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field874 = arg0.method2129();
            this.field895 = arg0.method2299();
        } else if (arg1 == 79) {
            this.field896 = arg0.method2129();
            this.field853 = arg0.method2129();
            this.field895 = arg0.method2299();
            int var13 = arg0.method2299();
            this.field890 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field890[var14] = arg0.method2129();
            }
        } else if (arg1 == 81) {
            this.field870 = arg0.method2299() * 256;
        }
    }

    @ObfuscatedName("ah.h(IB)Z")
    public final boolean method689(int arg0) {
        if (this.field897 != null) {
            for (int var4 = 0; var4 < this.field897.length; var4++) {
                if (this.field897[var4] == arg0) {
                    return Statics.field851.method2728(this.field858[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field858 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field858.length; var3++) {
                var2 &= Statics.field851.method2728(this.field858[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ah.p(I)Z")
    public final boolean method670() {
        if (this.field858 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field858.length; var2++) {
            var1 &= Statics.field851.method2728(this.field858[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ah.j(II[[IIIII)Lcj;")
    public final class79 method671(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field897 == null) {
            var7 = (long) ((this.field857 << 10) + arg1);
        } else {
            var7 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field884.method3186(var7);
        if (var9 == null) {
            class94 var10 = this.method674(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field871) {
                var10.field1624 = (short) (this.field880 + 64);
                var10.field1594 = (short) (this.field876 + 768);
                var10.method1956();
                var9 = var10;
            } else {
                var9 = var10.method1941(this.field880 + 64, this.field876 + 768, -50, -10, -50);
            }
            field884.method3183(var9, var7);
        }
        if (this.field871) {
            var9 = ((class94) var9).method1897();
        }
        if (this.field870 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method1983(arg2, arg3, arg4, arg5, true, this.field870);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1898(arg2, arg3, arg4, arg5, true, this.field870);
            }
        }
        return var9;
    }

    @ObfuscatedName("ah.i(II[[IIIII)Lck;")
    public final class99 method715(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field897 == null) {
            var7 = (long) ((this.field857 << 10) + arg1);
        } else {
            var7 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field855.method3186(var7);
        if (var9 == null) {
            class94 var10 = this.method674(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1941(this.field880 + 64, this.field876 + 768, -50, -10, -50);
            field855.method3183(var9, var7);
        }
        if (this.field870 >= 0) {
            var9 = var9.method1983(arg2, arg3, arg4, arg5, true, this.field870);
        }
        return var9;
    }

    @ObfuscatedName("ah.u(II[[IIIILar;IB)Lck;")
    public final class99 method683(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field897 == null) {
            var9 = (long) ((this.field857 << 10) + arg1);
        } else {
            var9 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field855.method3186(var9);
        if (var11 == null) {
            class94 var12 = this.method674(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1941(this.field880 + 64, this.field876 + 768, -50, -10, -50);
            field855.method3183(var11, var9);
        }
        if (arg6 == null && this.field870 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2018(true);
        } else {
            var13 = arg6.method756(var11, arg7, arg1);
        }
        if (this.field870 >= 0) {
            var13 = var13.method1983(arg2, arg3, arg4, arg5, false, this.field870);
        }
        return var13;
    }

    @ObfuscatedName("ah.l(III)Lcs;")
    public final class94 method674(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field897 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field858 == null) {
                return null;
            }
            boolean var4 = this.field873;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field858.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field858[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field856.method3186((long) var7);
                if (var3 == null) {
                    var3 = class94.method1892(Statics.field851, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1907();
                    }
                    field856.method3183(var3, (long) var7);
                }
                if (var5 > 1) {
                    field852[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field852, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field897.length; var9++) {
                if (this.field897[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field858[var8];
            boolean var11 = this.field873 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field856.method3186((long) var10);
            if (var3 == null) {
                var3 = class94.method1892(Statics.field851, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1907();
                }
                field856.method3183(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field882 == 128 && this.field850 == 128 && this.field885 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field869 == 0 && this.field886 == 0 && this.field865 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field861 == null, this.field863 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1903(256);
            var14.method1904(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1900();
        } else if (var15 == 2) {
            var14.method1901();
        } else if (var15 == 3) {
            var14.method1902();
        }
        if (this.field861 != null) {
            for (int var16 = 0; var16 < this.field861.length; var16++) {
                var14.method1948(this.field861[var16], this.field862[var16]);
            }
        }
        if (this.field863 != null) {
            for (int var17 = 0; var17 < this.field863.length; var17++) {
                var14.method1906(this.field863[var17], this.field864[var17]);
            }
        }
        if (var12) {
            var14.method1961(this.field882, this.field850, this.field885);
        }
        if (var13) {
            var14.method1904(this.field869, this.field886, this.field865);
        }
        return var14;
    }

    @ObfuscatedName("ah.k(I)Lah;")
    public final class37 method675() {
        int var1 = -1;
        if (this.field892 != -1) {
            var1 = class157.method2401(this.field892);
        } else if (this.field893 != -1) {
            var1 = class157.field2672[this.field893];
        }
        return var1 < 0 || var1 >= this.field891.length || this.field891[var1] == -1 ? null : method96(this.field891[var1]);
    }

    @ObfuscatedName("eq.q(S)V")
    public static void method2854() {
        field849.method3181();
        field856.method3181();
        field884.method3181();
        field855.method3181();
    }

    @ObfuscatedName("ah.b(B)Z")
    public boolean method676() {
        if (this.field891 == null) {
            return this.field874 != -1 || this.field890 != null;
        }
        for (int var1 = 0; var1 < this.field891.length; var1++) {
            if (this.field891[var1] != -1) {
                class37 var2 = method96(this.field891[var1]);
                if (var2.field874 != -1 || var2.field890 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
