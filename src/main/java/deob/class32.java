package deob;

@ObfuscatedName("af")
public class class32 extends class174 {

    @ObfuscatedName("af.p")
    public static boolean field833 = false;

    @ObfuscatedName("af.h")
    public static class170 field809 = new class170(64);

    @ObfuscatedName("af.y")
    public static class170 field810 = new class170(500);

    @ObfuscatedName("af.j")
    public static class170 field806 = new class170(30);

    @ObfuscatedName("af.l")
    public static class170 field841 = new class170(30);

    @ObfuscatedName("af.f")
    public static class101[] field852 = new class101[4];

    @ObfuscatedName("af.n")
    public int field814;

    @ObfuscatedName("af.k")
    public int[] field815;

    @ObfuscatedName("af.q")
    public int[] field816;

    @ObfuscatedName("af.w")
    public String field827 = "null";

    @ObfuscatedName("af.v")
    public short[] field818;

    @ObfuscatedName("af.z")
    public short[] field819;

    @ObfuscatedName("af.m")
    public short[] field817;

    @ObfuscatedName("af.r")
    public short[] field845;

    @ObfuscatedName("af.u")
    public int field822 = 1;

    @ObfuscatedName("af.i")
    public int field807 = 1;

    @ObfuscatedName("af.x")
    public int field824 = 2;

    @ObfuscatedName("af.s")
    public boolean field825 = true;

    @ObfuscatedName("af.o")
    public int field851 = -1;

    @ObfuscatedName("af.g")
    public int field823 = -1;

    @ObfuscatedName("af.d")
    public boolean field820 = false;

    @ObfuscatedName("af.t")
    public boolean field829 = false;

    @ObfuscatedName("af.b")
    public int field830 = -1;

    @ObfuscatedName("af.c")
    public int field813 = 16;

    @ObfuscatedName("af.aw")
    public int field832 = 0;

    @ObfuscatedName("af.ap")
    public int field857 = 0;

    @ObfuscatedName("af.am")
    public String[] field834 = new String[5];

    @ObfuscatedName("af.az")
    public int field835 = -1;

    @ObfuscatedName("af.ax")
    public int field836 = -1;

    @ObfuscatedName("af.af")
    public boolean field837 = false;

    @ObfuscatedName("af.aa")
    public boolean field838 = true;

    @ObfuscatedName("af.ag")
    public int field839 = 128;

    @ObfuscatedName("af.aj")
    public int field840 = 128;

    @ObfuscatedName("af.aq")
    public int field858 = 128;

    @ObfuscatedName("af.ah")
    public int field842 = 0;

    @ObfuscatedName("af.ae")
    public int field843 = 0;

    @ObfuscatedName("af.ar")
    public int field844 = 0;

    @ObfuscatedName("af.ab")
    public boolean field812 = false;

    @ObfuscatedName("af.ay")
    public boolean field826 = false;

    @ObfuscatedName("af.ac")
    public int field847 = -1;

    @ObfuscatedName("af.ad")
    public int[] field846;

    @ObfuscatedName("af.al")
    public int field849 = -1;

    @ObfuscatedName("af.an")
    public int field850 = -1;

    @ObfuscatedName("af.at")
    public int field821 = -1;

    @ObfuscatedName("af.ak")
    public int field828 = 0;

    @ObfuscatedName("af.as")
    public int field853 = 0;

    @ObfuscatedName("af.ai")
    public int field854 = 0;

    @ObfuscatedName("af.ao")
    public int[] field855;

    @ObfuscatedName("ey.p(IB)Laf;")
    public static class32 method2811(int arg0) {
        class32 var1 = (class32) field809.method3266((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field831.method3048(6, arg0);
        class32 var3 = new class32();
        var3.field814 = arg0;
        if (var2 != null) {
            var3.method662(new class127(var2));
        }
        var3.method651();
        if (var3.field826) {
            var3.field824 = 0;
            var3.field825 = false;
        }
        field809.method3268(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.e(I)V")
    public void method651() {
        if (this.field851 == -1) {
            this.field851 = 0;
            if (this.field815 != null && (this.field816 == null || this.field816[0] == 10)) {
                this.field851 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field834[var1] != null) {
                    this.field851 = 1;
                }
            }
        }
        if (this.field847 == -1) {
            this.field847 = this.field824 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.a(Ldj;I)V")
    public void method662(class127 arg0) {
        while (true) {
            int var2 = arg0.method2494();
            if (var2 == 0) {
                return;
            }
            this.method653(arg0, var2);
        }
    }

    @ObfuscatedName("af.h(Ldj;IB)V")
    public void method653(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2494();
            if (var3 > 0) {
                if (this.field815 == null || field833) {
                    this.field816 = new int[var3];
                    this.field815 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field815[var4] = arg0.method2496();
                        this.field816[var4] = arg0.method2494();
                    }
                } else {
                    arg0.field2029 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field827 = arg0.method2502();
        } else if (arg1 == 5) {
            int var5 = arg0.method2494();
            if (var5 > 0) {
                if (this.field815 == null || field833) {
                    this.field816 = null;
                    this.field815 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field815[var6] = arg0.method2496();
                    }
                } else {
                    arg0.field2029 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field822 = arg0.method2494();
        } else if (arg1 == 15) {
            this.field807 = arg0.method2494();
        } else if (arg1 == 17) {
            this.field824 = 0;
            this.field825 = false;
        } else if (arg1 == 18) {
            this.field825 = false;
        } else if (arg1 == 19) {
            this.field851 = arg0.method2494();
        } else if (arg1 == 21) {
            this.field823 = 0;
        } else if (arg1 == 22) {
            this.field820 = true;
        } else if (arg1 == 23) {
            this.field829 = true;
        } else if (arg1 == 24) {
            this.field830 = arg0.method2496();
            if (this.field830 == 65535) {
                this.field830 = -1;
            }
        } else if (arg1 == 27) {
            this.field824 = 1;
        } else if (arg1 == 28) {
            this.field813 = arg0.method2494();
        } else if (arg1 == 29) {
            this.field832 = arg0.method2604();
        } else if (arg1 == 39) {
            this.field857 = arg0.method2604() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field834[arg1 - 30] = arg0.method2502();
            if (this.field834[arg1 - 30].equalsIgnoreCase(class135.field2101)) {
                this.field834[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2494();
            this.field818 = new short[var7];
            this.field819 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field818[var8] = (short) arg0.method2496();
                this.field819[var8] = (short) arg0.method2496();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2494();
            this.field817 = new short[var9];
            this.field845 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field817[var10] = (short) arg0.method2496();
                this.field845[var10] = (short) arg0.method2496();
            }
        } else if (arg1 == 60) {
            this.field835 = arg0.method2496();
        } else if (arg1 == 62) {
            this.field837 = true;
        } else if (arg1 == 64) {
            this.field838 = false;
        } else if (arg1 == 65) {
            this.field839 = arg0.method2496();
        } else if (arg1 == 66) {
            this.field840 = arg0.method2496();
        } else if (arg1 == 67) {
            this.field858 = arg0.method2496();
        } else if (arg1 == 68) {
            this.field836 = arg0.method2496();
        } else if (arg1 == 69) {
            arg0.method2494();
        } else if (arg1 == 70) {
            this.field842 = arg0.method2582();
        } else if (arg1 == 71) {
            this.field843 = arg0.method2582();
        } else if (arg1 == 72) {
            this.field844 = arg0.method2582();
        } else if (arg1 == 73) {
            this.field812 = true;
        } else if (arg1 == 74) {
            this.field826 = true;
        } else if (arg1 == 75) {
            this.field847 = arg0.method2494();
        } else if (arg1 == 77) {
            this.field849 = arg0.method2496();
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
            this.field850 = arg0.method2496();
            if (this.field850 == 65535) {
                this.field850 = -1;
            }
            int var11 = arg0.method2494();
            this.field846 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field846[var12] = arg0.method2496();
                if (this.field846[var12] == 65535) {
                    this.field846[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field821 = arg0.method2496();
            this.field828 = arg0.method2494();
        } else if (arg1 == 79) {
            this.field853 = arg0.method2496();
            this.field854 = arg0.method2496();
            this.field828 = arg0.method2494();
            int var13 = arg0.method2494();
            this.field855 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field855[var14] = arg0.method2496();
            }
        } else if (arg1 == 81) {
            this.field823 = arg0.method2494() * 256;
        }
    }

    @ObfuscatedName("af.y(II)Z")
    public final boolean method680(int arg0) {
        if (this.field816 != null) {
            for (int var4 = 0; var4 < this.field816.length; var4++) {
                if (this.field816[var4] == arg0) {
                    return Statics.field808.method3050(this.field815[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field815 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field815.length; var3++) {
                var2 &= Statics.field808.method3050(this.field815[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.j(I)Z")
    public final boolean method661() {
        if (this.field815 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field815.length; var2++) {
            var1 &= Statics.field808.method3050(this.field815[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.l(II[[IIIII)Lcx;")
    public final class94 method650(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field806.method3266(var7);
        if (var9 == null) {
            class101 var10 = this.method659(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field820) {
                var10.field1716 = (short) (this.field832 + 64);
                var10.field1717 = (short) (this.field857 + 768);
                var10.method2074();
                var9 = var10;
            } else {
                var9 = var10.method2090(this.field832 + 64, this.field857 + 768, -50, -10, -50);
            }
            field806.method3268(var9, var7);
        }
        if (this.field820) {
            var9 = ((class101) var9).method2077();
        }
        if (this.field823 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2312(arg2, arg3, arg4, arg5, true, this.field823);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2078(arg2, arg3, arg4, arg5, true, this.field823);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.f(II[[IIIIB)Lds;")
    public final class112 method677(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field841.method3266(var7);
        if (var9 == null) {
            class101 var10 = this.method659(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2090(this.field832 + 64, this.field857 + 768, -50, -10, -50);
            field841.method3268(var9, var7);
        }
        if (this.field823 >= 0) {
            var9 = var9.method2312(arg2, arg3, arg4, arg5, true, this.field823);
        }
        return var9;
    }

    @ObfuscatedName("af.n(II[[IIIILag;II)Lds;")
    public final class112 method692(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field816 == null) {
            var9 = (long) ((this.field814 << 10) + arg1);
        } else {
            var9 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field841.method3266(var9);
        if (var11 == null) {
            class101 var12 = this.method659(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2090(this.field832 + 64, this.field857 + 768, -50, -10, -50);
            field841.method3268(var11, var9);
        }
        if (arg6 == null && this.field823 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2257(true);
        } else {
            var13 = arg6.method722(var11, arg7, arg1);
        }
        if (this.field823 >= 0) {
            var13 = var13.method2312(arg2, arg3, arg4, arg5, false, this.field823);
        }
        return var13;
    }

    @ObfuscatedName("af.k(IIB)Lch;")
    public final class101 method659(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field816 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field815 == null) {
                return null;
            }
            boolean var4 = this.field837;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field815.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field815[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field810.method3266((long) var7);
                if (var3 == null) {
                    var3 = class101.method2070(Statics.field808, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2106();
                    }
                    field810.method3268(var3, (long) var7);
                }
                if (var5 > 1) {
                    field852[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field852, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field816.length; var9++) {
                if (this.field816[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field815[var8];
            boolean var11 = this.field837 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field810.method3266((long) var10);
            if (var3 == null) {
                var3 = class101.method2070(Statics.field808, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2106();
                }
                field810.method3268(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field839 == 128 && this.field840 == 128 && this.field858 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field842 == 0 && this.field843 == 0 && this.field844 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field818 == null, this.field817 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2081(256);
            var14.method2082(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2086();
        } else if (var15 == 2) {
            var14.method2134();
        } else if (var15 == 3) {
            var14.method2141();
        }
        if (this.field818 != null) {
            for (int var16 = 0; var16 < this.field818.length; var16++) {
                var14.method2083(this.field818[var16], this.field819[var16]);
            }
        }
        if (this.field817 != null) {
            for (int var17 = 0; var17 < this.field817.length; var17++) {
                var14.method2084(this.field817[var17], this.field845[var17]);
            }
        }
        if (var12) {
            var14.method2085(this.field839, this.field840, this.field858);
        }
        if (var13) {
            var14.method2082(this.field842, this.field843, this.field844);
        }
        return var14;
    }

    @ObfuscatedName("af.q(I)Laf;")
    public final class32 method660() {
        int var1 = -1;
        if (this.field849 != -1) {
            var1 = class160.method2809(this.field849);
        } else if (this.field850 != -1) {
            var1 = class160.field2709[this.field850];
        }
        return var1 < 0 || var1 >= this.field846.length || this.field846[var1] == -1 ? null : method2811(this.field846[var1]);
    }

    @ObfuscatedName("af.w(I)V")
    public static void method668() {
        field809.method3269();
        field810.method3269();
        field806.method3269();
        field841.method3269();
    }

    @ObfuscatedName("af.v(I)Z")
    public boolean method667() {
        if (this.field846 == null) {
            return this.field821 != -1 || this.field855 != null;
        }
        for (int var1 = 0; var1 < this.field846.length; var1++) {
            if (this.field846[var1] != -1) {
                class32 var2 = method2811(this.field846[var1]);
                if (var2.field821 != -1 || var2.field855 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
