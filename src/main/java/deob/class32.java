package deob;

@ObfuscatedName("at")
public class class32 extends class174 {

    @ObfuscatedName("at.b")
    public static boolean field828 = false;

    @ObfuscatedName("at.i")
    public static class170 field812 = new class170(64);

    @ObfuscatedName("at.k")
    public static class170 field813 = new class170(500);

    @ObfuscatedName("at.q")
    public static class170 field840 = new class170(30);

    @ObfuscatedName("at.t")
    public static class170 field815 = new class170(30);

    @ObfuscatedName("at.v")
    public static class101[] field816 = new class101[4];

    @ObfuscatedName("at.y")
    public int field817;

    @ObfuscatedName("at.w")
    public int[] field818;

    @ObfuscatedName("at.g")
    public int[] field819;

    @ObfuscatedName("at.s")
    public String field852 = "null";

    @ObfuscatedName("at.n")
    public short[] field821;

    @ObfuscatedName("at.x")
    public short[] field845;

    @ObfuscatedName("at.o")
    public short[] field823;

    @ObfuscatedName("at.l")
    public short[] field824;

    @ObfuscatedName("at.u")
    public int field825 = 1;

    @ObfuscatedName("at.z")
    public int field826 = 1;

    @ObfuscatedName("at.d")
    public int field827 = 2;

    @ObfuscatedName("at.m")
    public boolean field858 = true;

    @ObfuscatedName("at.f")
    public int field854 = -1;

    @ObfuscatedName("at.a")
    public int field830 = -1;

    @ObfuscatedName("at.h")
    public boolean field831 = false;

    @ObfuscatedName("at.p")
    public boolean field832 = false;

    @ObfuscatedName("at.e")
    public int field820 = -1;

    @ObfuscatedName("at.r")
    public int field834 = 16;

    @ObfuscatedName("at.av")
    public int field835 = 0;

    @ObfuscatedName("at.an")
    public int field836 = 0;

    @ObfuscatedName("at.ae")
    public String[] field837 = new String[5];

    @ObfuscatedName("at.au")
    public int field822 = -1;

    @ObfuscatedName("at.ag")
    public int field839 = -1;

    @ObfuscatedName("at.at")
    public boolean field859 = false;

    @ObfuscatedName("at.ac")
    public boolean field841 = true;

    @ObfuscatedName("at.aw")
    public int field856 = 128;

    @ObfuscatedName("at.ah")
    public int field843 = 128;

    @ObfuscatedName("at.ai")
    public int field811 = 128;

    @ObfuscatedName("at.ap")
    public int field853 = 0;

    @ObfuscatedName("at.ad")
    public int field846 = 0;

    @ObfuscatedName("at.ay")
    public int field847 = 0;

    @ObfuscatedName("at.az")
    public boolean field848 = false;

    @ObfuscatedName("at.ab")
    public boolean field849 = false;

    @ObfuscatedName("at.am")
    public int field850 = -1;

    @ObfuscatedName("at.as")
    public int[] field851;

    @ObfuscatedName("at.aa")
    public int field814 = -1;

    @ObfuscatedName("at.af")
    public int field838 = -1;

    @ObfuscatedName("at.ax")
    public int field842 = -1;

    @ObfuscatedName("at.aq")
    public int field855 = 0;

    @ObfuscatedName("at.ao")
    public int field829 = 0;

    @ObfuscatedName("at.ar")
    public int field860 = 0;

    @ObfuscatedName("at.aj")
    public int[] field844;

    @ObfuscatedName("q.b(IB)Lat;")
    public static class32 method46(int arg0) {
        class32 var1 = (class32) field812.method3188((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field810.method2964(6, arg0);
        class32 var3 = new class32();
        var3.field817 = arg0;
        if (var2 != null) {
            var3.method654(new class127(var2));
        }
        var3.method621();
        if (var3.field849) {
            var3.field827 = 0;
            var3.field858 = false;
        }
        field812.method3190(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.c(I)V")
    public void method621() {
        if (this.field854 == -1) {
            this.field854 = 0;
            if (this.field818 != null && (this.field819 == null || this.field819[0] == 10)) {
                this.field854 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field837[var1] != null) {
                    this.field854 = 1;
                }
            }
        }
        if (this.field850 == -1) {
            this.field850 = this.field827 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("at.j(Ldv;B)V")
    public void method654(class127 arg0) {
        while (true) {
            int var2 = arg0.method2416();
            if (var2 == 0) {
                return;
            }
            this.method653(arg0, var2);
        }
    }

    @ObfuscatedName("at.i(Ldv;II)V")
    public void method653(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2416();
            if (var3 > 0) {
                if (this.field818 == null || field828) {
                    this.field819 = new int[var3];
                    this.field818 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field818[var4] = arg0.method2394();
                        this.field819[var4] = arg0.method2416();
                    }
                } else {
                    arg0.field2051 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field852 = arg0.method2473();
        } else if (arg1 == 5) {
            int var5 = arg0.method2416();
            if (var5 > 0) {
                if (this.field818 == null || field828) {
                    this.field819 = null;
                    this.field818 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field818[var6] = arg0.method2394();
                    }
                } else {
                    arg0.field2051 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field825 = arg0.method2416();
        } else if (arg1 == 15) {
            this.field826 = arg0.method2416();
        } else if (arg1 == 17) {
            this.field827 = 0;
            this.field858 = false;
        } else if (arg1 == 18) {
            this.field858 = false;
        } else if (arg1 == 19) {
            this.field854 = arg0.method2416();
        } else if (arg1 == 21) {
            this.field830 = 0;
        } else if (arg1 == 22) {
            this.field831 = true;
        } else if (arg1 == 23) {
            this.field832 = true;
        } else if (arg1 == 24) {
            this.field820 = arg0.method2394();
            if (this.field820 == 65535) {
                this.field820 = -1;
            }
        } else if (arg1 == 27) {
            this.field827 = 1;
        } else if (arg1 == 28) {
            this.field834 = arg0.method2416();
        } else if (arg1 == 29) {
            this.field835 = arg0.method2397();
        } else if (arg1 == 39) {
            this.field836 = arg0.method2397();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field837[arg1 - 30] = arg0.method2473();
            if (this.field837[arg1 - 30].equalsIgnoreCase(class135.field2310)) {
                this.field837[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2416();
            this.field821 = new short[var7];
            this.field845 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field821[var8] = (short) arg0.method2394();
                this.field845[var8] = (short) arg0.method2394();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2416();
            this.field823 = new short[var9];
            this.field824 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field823[var10] = (short) arg0.method2394();
                this.field824[var10] = (short) arg0.method2394();
            }
        } else if (arg1 == 60) {
            this.field822 = arg0.method2394();
        } else if (arg1 == 62) {
            this.field859 = true;
        } else if (arg1 == 64) {
            this.field841 = false;
        } else if (arg1 == 65) {
            this.field856 = arg0.method2394();
        } else if (arg1 == 66) {
            this.field843 = arg0.method2394();
        } else if (arg1 == 67) {
            this.field811 = arg0.method2394();
        } else if (arg1 == 68) {
            this.field839 = arg0.method2394();
        } else if (arg1 == 69) {
            arg0.method2416();
        } else if (arg1 == 70) {
            this.field853 = arg0.method2399();
        } else if (arg1 == 71) {
            this.field846 = arg0.method2399();
        } else if (arg1 == 72) {
            this.field847 = arg0.method2399();
        } else if (arg1 == 73) {
            this.field848 = true;
        } else if (arg1 == 74) {
            this.field849 = true;
        } else if (arg1 == 75) {
            this.field850 = arg0.method2416();
        } else if (arg1 == 77) {
            this.field814 = arg0.method2394();
            if (this.field814 == 65535) {
                this.field814 = -1;
            }
            this.field838 = arg0.method2394();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            int var11 = arg0.method2416();
            this.field851 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field851[var12] = arg0.method2394();
                if (this.field851[var12] == 65535) {
                    this.field851[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field842 = arg0.method2394();
            this.field855 = arg0.method2416();
        } else if (arg1 == 79) {
            this.field829 = arg0.method2394();
            this.field860 = arg0.method2394();
            this.field855 = arg0.method2416();
            int var13 = arg0.method2416();
            this.field844 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field844[var14] = arg0.method2394();
            }
        } else if (arg1 == 81) {
            this.field830 = arg0.method2416() * 256;
        }
    }

    @ObfuscatedName("at.k(II)Z")
    public final boolean method624(int arg0) {
        if (this.field819 != null) {
            for (int var4 = 0; var4 < this.field819.length; var4++) {
                if (this.field819[var4] == arg0) {
                    return Statics.field857.method3032(this.field818[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field818 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field818.length; var3++) {
                var2 &= Statics.field857.method3032(this.field818[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("at.q(I)Z")
    public final boolean method625() {
        if (this.field818 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field818.length; var2++) {
            var1 &= Statics.field857.method3032(this.field818[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("at.t(II[[IIIII)Lcm;")
    public final class94 method662(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field819 == null) {
            var7 = (long) ((this.field817 << 10) + arg1);
        } else {
            var7 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field840.method3188(var7);
        if (var9 == null) {
            class101 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field831) {
                var10.field1716 = (short) (this.field835 + 64);
                var10.field1706 = (short) (this.field836 * 25 + 768);
                var10.method2015();
                var9 = var10;
            } else {
                var9 = var10.method2046(this.field835 + 64, this.field836 * 25 + 768, -50, -10, -50);
            }
            field840.method3190(var9, var7);
        }
        if (this.field831) {
            var9 = ((class101) var9).method2063();
        }
        if (this.field830 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2207(arg2, arg3, arg4, arg5, true, this.field830);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2005(arg2, arg3, arg4, arg5, true, this.field830);
            }
        }
        return var9;
    }

    @ObfuscatedName("at.v(II[[IIIII)Ldr;")
    public final class112 method656(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field819 == null) {
            var7 = (long) ((this.field817 << 10) + arg1);
        } else {
            var7 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field815.method3188(var7);
        if (var9 == null) {
            class101 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2046(this.field835 + 64, this.field836 * 25 + 768, -50, -10, -50);
            field815.method3190(var9, var7);
        }
        if (this.field830 >= 0) {
            var9 = var9.method2207(arg2, arg3, arg4, arg5, true, this.field830);
        }
        return var9;
    }

    @ObfuscatedName("at.y(II[[IIIILaw;IB)Ldr;")
    public final class112 method628(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field819 == null) {
            var9 = (long) ((this.field817 << 10) + arg1);
        } else {
            var9 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field815.method3188(var9);
        if (var11 == null) {
            class101 var12 = this.method629(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2046(this.field835 + 64, this.field836 * 25 + 768, -50, -10, -50);
            field815.method3190(var11, var9);
        }
        if (arg6 == null && this.field830 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2242(true);
        } else {
            var13 = arg6.method697(var11, arg7, arg1);
        }
        if (this.field830 >= 0) {
            var13 = var13.method2207(arg2, arg3, arg4, arg5, false, this.field830);
        }
        return var13;
    }

    @ObfuscatedName("at.w(IIB)Lcu;")
    public final class101 method629(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field819 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field818 == null) {
                return null;
            }
            boolean var4 = this.field859;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field818.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field818[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field813.method3188((long) var7);
                if (var3 == null) {
                    var3 = class101.method2065(Statics.field857, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2014();
                    }
                    field813.method3190(var3, (long) var7);
                }
                if (var5 > 1) {
                    field816[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field816, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field819.length; var9++) {
                if (this.field819[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field818[var8];
            boolean var11 = this.field859 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field813.method3188((long) var10);
            if (var3 == null) {
                var3 = class101.method2065(Statics.field857, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2014();
                }
                field813.method3190(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field856 == 128 && this.field843 == 128 && this.field811 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field853 == 0 && this.field846 == 0 && this.field847 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field821 == null, this.field823 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2010(256);
            var14.method2067(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2054();
        } else if (var15 == 2) {
            var14.method2008();
        } else if (var15 == 3) {
            var14.method2009();
        }
        if (this.field821 != null) {
            for (int var16 = 0; var16 < this.field821.length; var16++) {
                var14.method2077(this.field821[var16], this.field845[var16]);
            }
        }
        if (this.field823 != null) {
            for (int var17 = 0; var17 < this.field823.length; var17++) {
                var14.method2013(this.field823[var17], this.field824[var17]);
            }
        }
        if (var12) {
            var14.method2022(this.field856, this.field843, this.field811);
        }
        if (var13) {
            var14.method2067(this.field853, this.field846, this.field847);
        }
        return var14;
    }

    @ObfuscatedName("at.g(I)Lat;")
    public final class32 method630() {
        int var1 = -1;
        if (this.field814 != -1) {
            var1 = class160.method1338(this.field814);
        } else if (this.field838 != -1) {
            var1 = class160.field2742[this.field838];
        }
        return var1 < 0 || var1 >= this.field851.length || this.field851[var1] == -1 ? null : method46(this.field851[var1]);
    }

    @ObfuscatedName("aw.s(I)V")
    public static void method730() {
        field812.method3191();
        field813.method3191();
        field840.method3191();
        field815.method3191();
    }

    @ObfuscatedName("at.n(I)Z")
    public boolean method631() {
        if (this.field851 == null) {
            return this.field842 != -1 || this.field844 != null;
        }
        for (int var1 = 0; var1 < this.field851.length; var1++) {
            if (this.field851[var1] != -1) {
                class32 var2 = method46(this.field851[var1]);
                if (var2.field842 != -1 || var2.field844 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
