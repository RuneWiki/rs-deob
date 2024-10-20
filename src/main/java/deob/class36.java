package deob;

@ObfuscatedName("ax")
public class class36 extends class180 {

    @ObfuscatedName("ax.y")
    public static boolean field855 = false;

    @ObfuscatedName("ax.v")
    public static class170 field821 = new class170(64);

    @ObfuscatedName("ax.l")
    public static class170 field822 = new class170(500);

    @ObfuscatedName("ax.g")
    public static class170 field828 = new class170(30);

    @ObfuscatedName("ax.a")
    public static class170 field824 = new class170(30);

    @ObfuscatedName("ax.x")
    public static class93[] field820 = new class93[4];

    @ObfuscatedName("ax.r")
    public int field843;

    @ObfuscatedName("ax.w")
    public int[] field827;

    @ObfuscatedName("ax.c")
    public int[] field858;

    @ObfuscatedName("ax.f")
    public String field829 = "null";

    @ObfuscatedName("ax.o")
    public short[] field859;

    @ObfuscatedName("ax.p")
    public short[] field842;

    @ObfuscatedName("ax.n")
    public short[] field860;

    @ObfuscatedName("ax.m")
    public short[] field833;

    @ObfuscatedName("ax.s")
    public int field834 = 1;

    @ObfuscatedName("ax.t")
    public int field851 = 1;

    @ObfuscatedName("ax.j")
    public int field832 = 2;

    @ObfuscatedName("ax.b")
    public boolean field837 = true;

    @ObfuscatedName("ax.i")
    public int field830 = -1;

    @ObfuscatedName("ax.h")
    public int field839 = -1;

    @ObfuscatedName("ax.q")
    public boolean field840 = false;

    @ObfuscatedName("ax.d")
    public boolean field841 = false;

    @ObfuscatedName("ax.z")
    public int field825 = -1;

    @ObfuscatedName("ax.e")
    public int field826 = 16;

    @ObfuscatedName("ax.av")
    public int field844 = 0;

    @ObfuscatedName("ax.al")
    public int field836 = 0;

    @ObfuscatedName("ax.aq")
    public String[] field823 = new String[5];

    @ObfuscatedName("ax.aa")
    public int field847 = -1;

    @ObfuscatedName("ax.ah")
    public int field848 = -1;

    @ObfuscatedName("ax.au")
    public boolean field849 = false;

    @ObfuscatedName("ax.ai")
    public boolean field850 = true;

    @ObfuscatedName("ax.ab")
    public int field854 = 128;

    @ObfuscatedName("ax.ag")
    public int field852 = 128;

    @ObfuscatedName("ax.ax")
    public int field853 = 128;

    @ObfuscatedName("ax.af")
    public int field846 = 0;

    @ObfuscatedName("ax.ao")
    public int field856 = 0;

    @ObfuscatedName("ax.ac")
    public int field862 = 0;

    @ObfuscatedName("ax.aj")
    public boolean field857 = false;

    @ObfuscatedName("ax.ap")
    public boolean field838 = false;

    @ObfuscatedName("ax.ae")
    public int field845 = -1;

    @ObfuscatedName("ax.at")
    public int[] field831;

    @ObfuscatedName("ax.as")
    public int field861 = -1;

    @ObfuscatedName("ax.aw")
    public int field835 = -1;

    @ObfuscatedName("ax.ak")
    public int field863 = -1;

    @ObfuscatedName("ax.az")
    public int field864 = 0;

    @ObfuscatedName("ax.ay")
    public int field865 = 0;

    @ObfuscatedName("ax.ad")
    public int field866 = 0;

    @ObfuscatedName("ax.ar")
    public int[] field867;

    @ObfuscatedName("u.y(IB)Lax;")
    public static class36 method6(int arg0) {
        class36 var1 = (class36) field821.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2927.method2704(6, arg0);
        class36 var3 = new class36();
        var3.field843 = arg0;
        if (var2 != null) {
            var3.method619(new class107(var2));
        }
        var3.method620();
        if (var3.field838) {
            var3.field832 = 0;
            var3.field837 = false;
        }
        field821.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.u(I)V")
    public void method620() {
        if (this.field830 == -1) {
            this.field830 = 0;
            if (this.field827 != null && (this.field858 == null || this.field858[0] == 10)) {
                this.field830 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field823[var1] != null) {
                    this.field830 = 1;
                }
            }
        }
        if (this.field845 == -1) {
            this.field845 = this.field832 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ax.k(Ldo;I)V")
    public void method619(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method621(arg0, var2);
        }
    }

    @ObfuscatedName("ax.v(Ldo;IB)V")
    public void method621(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2109();
            if (var3 > 0) {
                if (this.field827 == null || field855) {
                    this.field858 = new int[var3];
                    this.field827 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field827[var4] = arg0.method2111();
                        this.field858[var4] = arg0.method2109();
                    }
                } else {
                    arg0.field1854 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field829 = arg0.method2126();
        } else if (arg1 == 5) {
            int var5 = arg0.method2109();
            if (var5 > 0) {
                if (this.field827 == null || field855) {
                    this.field858 = null;
                    this.field827 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field827[var6] = arg0.method2111();
                    }
                } else {
                    arg0.field1854 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field834 = arg0.method2109();
        } else if (arg1 == 15) {
            this.field851 = arg0.method2109();
        } else if (arg1 == 17) {
            this.field832 = 0;
            this.field837 = false;
        } else if (arg1 == 18) {
            this.field837 = false;
        } else if (arg1 == 19) {
            this.field830 = arg0.method2109();
        } else if (arg1 == 21) {
            this.field839 = 0;
        } else if (arg1 == 22) {
            this.field840 = true;
        } else if (arg1 == 23) {
            this.field841 = true;
        } else if (arg1 == 24) {
            this.field825 = arg0.method2111();
            if (this.field825 == 65535) {
                this.field825 = -1;
            }
        } else if (arg1 == 27) {
            this.field832 = 1;
        } else if (arg1 == 28) {
            this.field826 = arg0.method2109();
        } else if (arg1 == 29) {
            this.field844 = arg0.method2110();
        } else if (arg1 == 39) {
            this.field836 = arg0.method2110() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field823[arg1 - 30] = arg0.method2126();
            if (this.field823[arg1 - 30].equalsIgnoreCase(class142.field2154)) {
                this.field823[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2109();
            this.field859 = new short[var7];
            this.field842 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field859[var8] = (short) arg0.method2111();
                this.field842[var8] = (short) arg0.method2111();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2109();
            this.field860 = new short[var9];
            this.field833 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field860[var10] = (short) arg0.method2111();
                this.field833[var10] = (short) arg0.method2111();
            }
        } else if (arg1 == 60) {
            this.field847 = arg0.method2111();
        } else if (arg1 == 62) {
            this.field849 = true;
        } else if (arg1 == 64) {
            this.field850 = false;
        } else if (arg1 == 65) {
            this.field854 = arg0.method2111();
        } else if (arg1 == 66) {
            this.field852 = arg0.method2111();
        } else if (arg1 == 67) {
            this.field853 = arg0.method2111();
        } else if (arg1 == 68) {
            this.field848 = arg0.method2111();
        } else if (arg1 == 69) {
            arg0.method2109();
        } else if (arg1 == 70) {
            this.field846 = arg0.method2112();
        } else if (arg1 == 71) {
            this.field856 = arg0.method2112();
        } else if (arg1 == 72) {
            this.field862 = arg0.method2112();
        } else if (arg1 == 73) {
            this.field857 = true;
        } else if (arg1 == 74) {
            this.field838 = true;
        } else if (arg1 == 75) {
            this.field845 = arg0.method2109();
        } else if (arg1 == 77) {
            this.field861 = arg0.method2111();
            if (this.field861 == 65535) {
                this.field861 = -1;
            }
            this.field835 = arg0.method2111();
            if (this.field835 == 65535) {
                this.field835 = -1;
            }
            int var11 = arg0.method2109();
            this.field831 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field831[var12] = arg0.method2111();
                if (this.field831[var12] == 65535) {
                    this.field831[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field863 = arg0.method2111();
            this.field864 = arg0.method2109();
        } else if (arg1 == 79) {
            this.field865 = arg0.method2111();
            this.field866 = arg0.method2111();
            this.field864 = arg0.method2109();
            int var13 = arg0.method2109();
            this.field867 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field867[var14] = arg0.method2111();
            }
        } else if (arg1 == 81) {
            this.field839 = arg0.method2109() * 256;
        }
    }

    @ObfuscatedName("ax.l(IB)Z")
    public final boolean method630(int arg0) {
        if (this.field858 != null) {
            for (int var4 = 0; var4 < this.field858.length; var4++) {
                if (this.field858[var4] == arg0) {
                    return Statics.field1439.method2737(this.field827[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field827 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field827.length; var3++) {
                var2 &= Statics.field1439.method2737(this.field827[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ax.g(I)Z")
    public final boolean method623() {
        if (this.field827 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field827.length; var2++) {
            var1 &= Statics.field1439.method2737(this.field827[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ax.a(II[[IIIII)Lbx;")
    public final class78 method624(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field858 == null) {
            var7 = (long) ((this.field843 << 10) + arg1);
        } else {
            var7 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field828.method3145(var7);
        if (var9 == null) {
            class93 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field840) {
                var10.field1627 = (short) (this.field844 + 64);
                var10.field1616 = (short) (this.field836 + 768);
                var10.method1890();
                var9 = var10;
            } else {
                var9 = var10.method1894(this.field844 + 64, this.field836 + 768, -50, -10, -50);
            }
            field828.method3147(var9, var7);
        }
        if (this.field840) {
            var9 = ((class93) var9).method1874();
        }
        if (this.field839 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1976(arg2, arg3, arg4, arg5, true, this.field839);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1879(arg2, arg3, arg4, arg5, true, this.field839);
            }
        }
        return var9;
    }

    @ObfuscatedName("ax.x(II[[IIIIB)Lcz;")
    public final class98 method625(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field858 == null) {
            var7 = (long) ((this.field843 << 10) + arg1);
        } else {
            var7 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field824.method3145(var7);
        if (var9 == null) {
            class93 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1894(this.field844 + 64, this.field836 + 768, -50, -10, -50);
            field824.method3147(var9, var7);
        }
        if (this.field839 >= 0) {
            var9 = var9.method1976(arg2, arg3, arg4, arg5, true, this.field839);
        }
        return var9;
    }

    @ObfuscatedName("ax.r(II[[IIIILao;II)Lcz;")
    public final class98 method633(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field858 == null) {
            var9 = (long) ((this.field843 << 10) + arg1);
        } else {
            var9 = (long) ((this.field843 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field824.method3145(var9);
        if (var11 == null) {
            class93 var12 = this.method638(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1894(this.field844 + 64, this.field836 + 768, -50, -10, -50);
            field824.method3147(var11, var9);
        }
        if (arg6 == null && this.field839 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1987(true);
        } else {
            var13 = arg6.method695(var11, arg7, arg1);
        }
        if (this.field839 >= 0) {
            var13 = var13.method1976(arg2, arg3, arg4, arg5, false, this.field839);
        }
        return var13;
    }

    @ObfuscatedName("ax.w(III)Lca;")
    public final class93 method638(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field858 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field827 == null) {
                return null;
            }
            boolean var4 = this.field849;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field827.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field827[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field822.method3145((long) var7);
                if (var3 == null) {
                    var3 = class93.method1873(Statics.field1439, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1875();
                    }
                    field822.method3147(var3, (long) var7);
                }
                if (var5 > 1) {
                    field820[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field820, var5);
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
            int var10 = this.field827[var8];
            boolean var11 = this.field849 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field822.method3145((long) var10);
            if (var3 == null) {
                var3 = class93.method1873(Statics.field1439, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1875();
                }
                field822.method3147(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field854 == 128 && this.field852 == 128 && this.field853 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field846 == 0 && this.field856 == 0 && this.field862 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field859 == null, this.field860 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1884(256);
            var14.method1914(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1881();
        } else if (var15 == 2) {
            var14.method1882();
        } else if (var15 == 3) {
            var14.method1929();
        }
        if (this.field859 != null) {
            for (int var16 = 0; var16 < this.field859.length; var16++) {
                var14.method1886(this.field859[var16], this.field842[var16]);
            }
        }
        if (this.field860 != null) {
            for (int var17 = 0; var17 < this.field860.length; var17++) {
                var14.method1930(this.field860[var17], this.field833[var17]);
            }
        }
        if (var12) {
            var14.method1889(this.field854, this.field852, this.field853);
        }
        if (var13) {
            var14.method1914(this.field846, this.field856, this.field862);
        }
        return var14;
    }

    @ObfuscatedName("ax.c(I)Lax;")
    public final class36 method628() {
        int var1 = -1;
        if (this.field861 != -1) {
            var1 = class153.method1769(this.field861);
        } else if (this.field835 != -1) {
            var1 = class153.field2628[this.field835];
        }
        return var1 < 0 || var1 >= this.field831.length || this.field831[var1] == -1 ? null : method6(this.field831[var1]);
    }

    @ObfuscatedName("ax.f(B)Z")
    public boolean method629() {
        if (this.field831 == null) {
            return this.field863 != -1 || this.field867 != null;
        }
        for (int var1 = 0; var1 < this.field831.length; var1++) {
            if (this.field831[var1] != -1) {
                class36 var2 = method6(this.field831[var1]);
                if (var2.field863 != -1 || var2.field867 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
