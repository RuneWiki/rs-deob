package deob;

@ObfuscatedName("az")
public class class37 extends class187 {

    @ObfuscatedName("az.p")
    public static boolean field826 = false;

    @ObfuscatedName("az.c")
    public static class176 field815 = new class176(64);

    @ObfuscatedName("az.r")
    public static class176 field818 = new class176(500);

    @ObfuscatedName("az.f")
    public static class176 field819 = new class176(30);

    @ObfuscatedName("az.z")
    public static class176 field820 = new class176(30);

    @ObfuscatedName("az.o")
    public static class94[] field821 = new class94[4];

    @ObfuscatedName("az.k")
    public int field838;

    @ObfuscatedName("az.s")
    public int[] field854;

    @ObfuscatedName("az.h")
    public int[] field824;

    @ObfuscatedName("az.m")
    public String field835 = "null";

    @ObfuscatedName("az.w")
    public short[] field814;

    @ObfuscatedName("az.q")
    public short[] field827;

    @ObfuscatedName("az.u")
    public short[] field830;

    @ObfuscatedName("az.e")
    public short[] field858;

    @ObfuscatedName("az.b")
    public int field856 = 1;

    @ObfuscatedName("az.g")
    public int field831 = 1;

    @ObfuscatedName("az.j")
    public int field836 = 2;

    @ObfuscatedName("az.a")
    public boolean field825 = true;

    @ObfuscatedName("az.x")
    public int field849 = -1;

    @ObfuscatedName("az.n")
    public int field834 = -1;

    @ObfuscatedName("az.v")
    public boolean field832 = false;

    @ObfuscatedName("az.l")
    public boolean field837 = false;

    @ObfuscatedName("az.t")
    public int field817 = -1;

    @ObfuscatedName("az.i")
    public int field839 = 16;

    @ObfuscatedName("az.aw")
    public int field829 = 0;

    @ObfuscatedName("az.ar")
    public int field841 = 0;

    @ObfuscatedName("az.af")
    public String[] field842 = new String[5];

    @ObfuscatedName("az.am")
    public int field833 = -1;

    @ObfuscatedName("az.ax")
    public int field844 = -1;

    @ObfuscatedName("az.av")
    public boolean field845 = false;

    @ObfuscatedName("az.al")
    public boolean field846 = true;

    @ObfuscatedName("az.ab")
    public int field847 = 128;

    @ObfuscatedName("az.ac")
    public int field848 = 128;

    @ObfuscatedName("az.aq")
    public int field822 = 128;

    @ObfuscatedName("az.az")
    public int field850 = 0;

    @ObfuscatedName("az.ah")
    public int field851 = 0;

    @ObfuscatedName("az.at")
    public int field852 = 0;

    @ObfuscatedName("az.ap")
    public boolean field853 = false;

    @ObfuscatedName("az.as")
    public boolean field843 = false;

    @ObfuscatedName("az.au")
    public int field855 = -1;

    @ObfuscatedName("az.ag")
    public int[] field828;

    @ObfuscatedName("az.an")
    public int field857 = -1;

    @ObfuscatedName("az.ad")
    public int field823 = -1;

    @ObfuscatedName("az.ae")
    public int field859 = -1;

    @ObfuscatedName("az.ak")
    public int field860 = 0;

    @ObfuscatedName("az.ay")
    public int field861 = 0;

    @ObfuscatedName("az.ao")
    public int field862 = 0;

    @ObfuscatedName("az.ai")
    public int[] field863;

    @ObfuscatedName("d.p(Len;Len;ZB)V")
    public static void method11(class151 arg0, class151 arg1, boolean arg2) {
        Statics.field840 = arg0;
        Statics.field816 = arg1;
        field826 = arg2;
    }

    @ObfuscatedName("cn.y(II)Laz;")
    public static class37 method2053(int arg0) {
        class37 var1 = (class37) field815.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field840.method2811(6, arg0);
        class37 var3 = new class37();
        var3.field838 = arg0;
        if (var2 != null) {
            var3.method680(new class110(var2));
        }
        var3.method670();
        if (var3.field843) {
            var3.field836 = 0;
            var3.field825 = false;
        }
        field815.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.d(I)V")
    public void method670() {
        if (this.field849 == -1) {
            this.field849 = 0;
            if (this.field854 != null && (this.field824 == null || this.field824[0] == 10)) {
                this.field849 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field842[var1] != null) {
                    this.field849 = 1;
                }
            }
        }
        if (this.field855 == -1) {
            this.field855 = this.field836 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("az.c(Ldg;B)V")
    public void method680(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method672(arg0, var2);
        }
    }

    @ObfuscatedName("az.r(Ldg;II)V")
    public void method672(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2309();
            if (var3 > 0) {
                if (this.field854 == null || field826) {
                    this.field824 = new int[var3];
                    this.field854 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field854[var4] = arg0.method2243();
                        this.field824[var4] = arg0.method2309();
                    }
                } else {
                    arg0.field1842 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field835 = arg0.method2132();
        } else if (arg1 == 5) {
            int var5 = arg0.method2309();
            if (var5 > 0) {
                if (this.field854 == null || field826) {
                    this.field824 = null;
                    this.field854 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field854[var6] = arg0.method2243();
                    }
                } else {
                    arg0.field1842 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field856 = arg0.method2309();
        } else if (arg1 == 15) {
            this.field831 = arg0.method2309();
        } else if (arg1 == 17) {
            this.field836 = 0;
            this.field825 = false;
        } else if (arg1 == 18) {
            this.field825 = false;
        } else if (arg1 == 19) {
            this.field849 = arg0.method2309();
        } else if (arg1 == 21) {
            this.field834 = 0;
        } else if (arg1 == 22) {
            this.field832 = true;
        } else if (arg1 == 23) {
            this.field837 = true;
        } else if (arg1 == 24) {
            this.field817 = arg0.method2243();
            if (this.field817 == 65535) {
                this.field817 = -1;
            }
        } else if (arg1 == 27) {
            this.field836 = 1;
        } else if (arg1 == 28) {
            this.field839 = arg0.method2309();
        } else if (arg1 == 29) {
            this.field829 = arg0.method2125();
        } else if (arg1 == 39) {
            this.field841 = arg0.method2125() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field842[arg1 - 30] = arg0.method2132();
            if (this.field842[arg1 - 30].equalsIgnoreCase(class147.field2166)) {
                this.field842[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2309();
            this.field814 = new short[var7];
            this.field827 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field814[var8] = (short) arg0.method2243();
                this.field827[var8] = (short) arg0.method2243();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2309();
            this.field830 = new short[var9];
            this.field858 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field830[var10] = (short) arg0.method2243();
                this.field858[var10] = (short) arg0.method2243();
            }
        } else if (arg1 == 60) {
            this.field833 = arg0.method2243();
        } else if (arg1 == 62) {
            this.field845 = true;
        } else if (arg1 == 64) {
            this.field846 = false;
        } else if (arg1 == 65) {
            this.field847 = arg0.method2243();
        } else if (arg1 == 66) {
            this.field848 = arg0.method2243();
        } else if (arg1 == 67) {
            this.field822 = arg0.method2243();
        } else if (arg1 == 68) {
            this.field844 = arg0.method2243();
        } else if (arg1 == 69) {
            arg0.method2309();
        } else if (arg1 == 70) {
            this.field850 = arg0.method2127();
        } else if (arg1 == 71) {
            this.field851 = arg0.method2127();
        } else if (arg1 == 72) {
            this.field852 = arg0.method2127();
        } else if (arg1 == 73) {
            this.field853 = true;
        } else if (arg1 == 74) {
            this.field843 = true;
        } else if (arg1 == 75) {
            this.field855 = arg0.method2309();
        } else if (arg1 == 77) {
            this.field857 = arg0.method2243();
            if (this.field857 == 65535) {
                this.field857 = -1;
            }
            this.field823 = arg0.method2243();
            if (this.field823 == 65535) {
                this.field823 = -1;
            }
            int var11 = arg0.method2309();
            this.field828 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field828[var12] = arg0.method2243();
                if (this.field828[var12] == 65535) {
                    this.field828[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field859 = arg0.method2243();
            this.field860 = arg0.method2309();
        } else if (arg1 == 79) {
            this.field861 = arg0.method2243();
            this.field862 = arg0.method2243();
            this.field860 = arg0.method2309();
            int var13 = arg0.method2309();
            this.field863 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field863[var14] = arg0.method2243();
            }
        } else if (arg1 == 81) {
            this.field834 = arg0.method2309() * 256;
        }
    }

    @ObfuscatedName("az.f(II)Z")
    public final boolean method669(int arg0) {
        if (this.field824 != null) {
            for (int var4 = 0; var4 < this.field824.length; var4++) {
                if (this.field824[var4] == arg0) {
                    return Statics.field816.method2783(this.field854[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field854 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field854.length; var3++) {
                var2 &= Statics.field816.method2783(this.field854[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("az.z(B)Z")
    public final boolean method706() {
        if (this.field854 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field854.length; var2++) {
            var1 &= Statics.field816.method2783(this.field854[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("az.o(II[[IIIII)Lcc;")
    public final class79 method675(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field824 == null) {
            var7 = (long) ((this.field838 << 10) + arg1);
        } else {
            var7 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field819.method3198(var7);
        if (var9 == null) {
            class94 var10 = this.method686(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field832) {
                var10.field1611 = (short) (this.field829 + 64);
                var10.field1599 = (short) (this.field841 + 768);
                var10.method1920();
                var9 = var10;
            } else {
                var9 = var10.method1926(this.field829 + 64, this.field841 + 768, -50, -10, -50);
            }
            field819.method3193(var9, var7);
        }
        if (this.field832) {
            var9 = ((class94) var9).method1908();
        }
        if (this.field834 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method1992(arg2, arg3, arg4, arg5, true, this.field834);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1909(arg2, arg3, arg4, arg5, true, this.field834);
            }
        }
        return var9;
    }

    @ObfuscatedName("az.k(II[[IIIII)Lcy;")
    public final class99 method708(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field824 == null) {
            var7 = (long) ((this.field838 << 10) + arg1);
        } else {
            var7 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field820.method3198(var7);
        if (var9 == null) {
            class94 var10 = this.method686(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1926(this.field829 + 64, this.field841 + 768, -50, -10, -50);
            field820.method3193(var9, var7);
        }
        if (this.field834 >= 0) {
            var9 = var9.method1992(arg2, arg3, arg4, arg5, true, this.field834);
        }
        return var9;
    }

    @ObfuscatedName("az.s(II[[IIIILat;II)Lcy;")
    public final class99 method677(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field824 == null) {
            var9 = (long) ((this.field838 << 10) + arg1);
        } else {
            var9 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field820.method3198(var9);
        if (var11 == null) {
            class94 var12 = this.method686(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1926(this.field829 + 64, this.field841 + 768, -50, -10, -50);
            field820.method3193(var11, var9);
        }
        if (arg6 == null && this.field834 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2042(true);
        } else {
            var13 = arg6.method731(var11, arg7, arg1);
        }
        if (this.field834 >= 0) {
            var13 = var13.method1992(arg2, arg3, arg4, arg5, false, this.field834);
        }
        return var13;
    }

    @ObfuscatedName("az.h(III)Lch;")
    public final class94 method686(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field824 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field854 == null) {
                return null;
            }
            boolean var4 = this.field845;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field854.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field854[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field818.method3198((long) var7);
                if (var3 == null) {
                    var3 = class94.method1903(Statics.field816, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1918();
                    }
                    field818.method3193(var3, (long) var7);
                }
                if (var5 > 1) {
                    field821[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field821, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field824.length; var9++) {
                if (this.field824[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field854[var8];
            boolean var11 = this.field845 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field818.method3198((long) var10);
            if (var3 == null) {
                var3 = class94.method1903(Statics.field816, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1918();
                }
                field818.method3193(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field847 == 128 && this.field848 == 128 && this.field822 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field850 == 0 && this.field851 == 0 && this.field852 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field814 == null, this.field830 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1905(256);
            var14.method1929(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1915();
        } else if (var15 == 2) {
            var14.method1912();
        } else if (var15 == 3) {
            var14.method1913();
        }
        if (this.field814 != null) {
            for (int var16 = 0; var16 < this.field814.length; var16++) {
                var14.method1922(this.field814[var16], this.field827[var16]);
            }
        }
        if (this.field830 != null) {
            for (int var17 = 0; var17 < this.field830.length; var17++) {
                var14.method1917(this.field830[var17], this.field858[var17]);
            }
        }
        if (var12) {
            var14.method1921(this.field847, this.field848, this.field822);
        }
        if (var13) {
            var14.method1929(this.field850, this.field851, this.field852);
        }
        return var14;
    }

    @ObfuscatedName("az.m(I)Laz;")
    public final class37 method678() {
        int var1 = -1;
        if (this.field857 != -1) {
            var1 = class159.method2859(this.field857);
        } else if (this.field823 != -1) {
            var1 = class159.field2680[this.field823];
        }
        return var1 < 0 || var1 >= this.field828.length || this.field828[var1] == -1 ? null : method2053(this.field828[var1]);
    }

    @ObfuscatedName("az.w(I)Z")
    public boolean method679() {
        if (this.field828 == null) {
            return this.field859 != -1 || this.field863 != null;
        }
        for (int var1 = 0; var1 < this.field828.length; var1++) {
            if (this.field828[var1] != -1) {
                class37 var2 = method2053(this.field828[var1]);
                if (var2.field859 != -1 || var2.field863 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
