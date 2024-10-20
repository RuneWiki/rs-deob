package deob;

@ObfuscatedName("ar")
public class class33 extends class174 {

    @ObfuscatedName("ar.z")
    public static boolean field853 = false;

    @ObfuscatedName("ar.t")
    public static class167 field854 = new class167(64);

    @ObfuscatedName("ar.e")
    public static class167 field846 = new class167(500);

    @ObfuscatedName("ar.a")
    public static class167 field860 = new class167(30);

    @ObfuscatedName("ar.l")
    public static class167 field818 = new class167(30);

    @ObfuscatedName("ar.v")
    public static class90[] field829 = new class90[4];

    @ObfuscatedName("ar.j")
    public int field820;

    @ObfuscatedName("ar.k")
    public int[] field843;

    @ObfuscatedName("ar.g")
    public int[] field822;

    @ObfuscatedName("ar.d")
    public String field815 = "null";

    @ObfuscatedName("ar.b")
    public short[] field824;

    @ObfuscatedName("ar.i")
    public short[] field817;

    @ObfuscatedName("ar.o")
    public short[] field826;

    @ObfuscatedName("ar.x")
    public short[] field827;

    @ObfuscatedName("ar.m")
    public int field828 = 1;

    @ObfuscatedName("ar.f")
    public int field836 = 1;

    @ObfuscatedName("ar.q")
    public int field830 = 2;

    @ObfuscatedName("ar.c")
    public boolean field831 = true;

    @ObfuscatedName("ar.h")
    public int field832 = -1;

    @ObfuscatedName("ar.y")
    public int field833 = -1;

    @ObfuscatedName("ar.r")
    public boolean field821 = false;

    @ObfuscatedName("ar.w")
    public boolean field835 = false;

    @ObfuscatedName("ar.p")
    public int field840 = -1;

    @ObfuscatedName("ar.s")
    public int field823 = 16;

    @ObfuscatedName("ar.ag")
    public int field838 = 0;

    @ObfuscatedName("ar.ad")
    public int field839 = 0;

    @ObfuscatedName("ar.ak")
    public String[] field825 = new String[5];

    @ObfuscatedName("ar.ai")
    public int field841 = -1;

    @ObfuscatedName("ar.ac")
    public int field819 = -1;

    @ObfuscatedName("ar.as")
    public boolean field861 = false;

    @ObfuscatedName("ar.ar")
    public boolean field816 = true;

    @ObfuscatedName("ar.an")
    public int field845 = 128;

    @ObfuscatedName("ar.ah")
    public int field812 = 128;

    @ObfuscatedName("ar.ax")
    public int field847 = 128;

    @ObfuscatedName("ar.ae")
    public int field848 = 0;

    @ObfuscatedName("ar.ao")
    public int field849 = 0;

    @ObfuscatedName("ar.aj")
    public int field850 = 0;

    @ObfuscatedName("ar.ap")
    public boolean field851 = false;

    @ObfuscatedName("ar.am")
    public boolean field852 = false;

    @ObfuscatedName("ar.az")
    public int field858 = -1;

    @ObfuscatedName("ar.aa")
    public int[] field842;

    @ObfuscatedName("ar.ab")
    public int field855 = -1;

    @ObfuscatedName("ar.aw")
    public int field856 = -1;

    @ObfuscatedName("ar.av")
    public int field857 = -1;

    @ObfuscatedName("ar.al")
    public int field834 = 0;

    @ObfuscatedName("ar.aq")
    public int field859 = 0;

    @ObfuscatedName("ar.au")
    public int field844 = 0;

    @ObfuscatedName("ar.ay")
    public int[] field837;

    @ObfuscatedName("l.z(IB)Lar;")
    public static class33 method115(int arg0) {
        class33 var1 = (class33) field854.method3183((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field813.method2768(6, arg0);
        class33 var3 = new class33();
        var3.field820 = arg0;
        if (var2 != null) {
            var3.method644(new class104(var2));
        }
        var3.method643();
        if (var3.field852) {
            var3.field830 = 0;
            var3.field831 = false;
        }
        field854.method3185(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.n(I)V")
    public void method643() {
        if (this.field832 == -1) {
            this.field832 = 0;
            if (this.field843 != null && (this.field822 == null || this.field822[0] == 10)) {
                this.field832 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field825[var1] != null) {
                    this.field832 = 1;
                }
            }
        }
        if (this.field858 == -1) {
            this.field858 = this.field830 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ar.u(Lcj;S)V")
    public void method644(class104 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method645(arg0, var2);
        }
    }

    @ObfuscatedName("ar.t(Lcj;II)V")
    public void method645(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2257();
            if (var3 > 0) {
                if (this.field843 == null || field853) {
                    this.field822 = new int[var3];
                    this.field843 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field843[var4] = arg0.method2206();
                        this.field822[var4] = arg0.method2257();
                    }
                } else {
                    arg0.field1815 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field815 = arg0.method2187();
        } else if (arg1 == 5) {
            int var5 = arg0.method2257();
            if (var5 > 0) {
                if (this.field843 == null || field853) {
                    this.field822 = null;
                    this.field843 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field843[var6] = arg0.method2206();
                    }
                } else {
                    arg0.field1815 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field828 = arg0.method2257();
        } else if (arg1 == 15) {
            this.field836 = arg0.method2257();
        } else if (arg1 == 17) {
            this.field830 = 0;
            this.field831 = false;
        } else if (arg1 == 18) {
            this.field831 = false;
        } else if (arg1 == 19) {
            this.field832 = arg0.method2257();
        } else if (arg1 == 21) {
            this.field833 = 0;
        } else if (arg1 == 22) {
            this.field821 = true;
        } else if (arg1 == 23) {
            this.field835 = true;
        } else if (arg1 == 24) {
            this.field840 = arg0.method2206();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
        } else if (arg1 == 27) {
            this.field830 = 1;
        } else if (arg1 == 28) {
            this.field823 = arg0.method2257();
        } else if (arg1 == 29) {
            this.field838 = arg0.method2237();
        } else if (arg1 == 39) {
            this.field839 = arg0.method2237() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field825[arg1 - 30] = arg0.method2187();
            if (this.field825[arg1 - 30].equalsIgnoreCase(class139.field2248)) {
                this.field825[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2257();
            this.field824 = new short[var7];
            this.field817 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field824[var8] = (short) arg0.method2206();
                this.field817[var8] = (short) arg0.method2206();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2257();
            this.field826 = new short[var9];
            this.field827 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field826[var10] = (short) arg0.method2206();
                this.field827[var10] = (short) arg0.method2206();
            }
        } else if (arg1 == 60) {
            this.field841 = arg0.method2206();
        } else if (arg1 == 62) {
            this.field861 = true;
        } else if (arg1 == 64) {
            this.field816 = false;
        } else if (arg1 == 65) {
            this.field845 = arg0.method2206();
        } else if (arg1 == 66) {
            this.field812 = arg0.method2206();
        } else if (arg1 == 67) {
            this.field847 = arg0.method2206();
        } else if (arg1 == 68) {
            this.field819 = arg0.method2206();
        } else if (arg1 == 69) {
            arg0.method2257();
        } else if (arg1 == 70) {
            this.field848 = arg0.method2254();
        } else if (arg1 == 71) {
            this.field849 = arg0.method2254();
        } else if (arg1 == 72) {
            this.field850 = arg0.method2254();
        } else if (arg1 == 73) {
            this.field851 = true;
        } else if (arg1 == 74) {
            this.field852 = true;
        } else if (arg1 == 75) {
            this.field858 = arg0.method2257();
        } else if (arg1 == 77) {
            this.field855 = arg0.method2206();
            if (this.field855 == 65535) {
                this.field855 = -1;
            }
            this.field856 = arg0.method2206();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
            int var11 = arg0.method2257();
            this.field842 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field842[var12] = arg0.method2206();
                if (this.field842[var12] == 65535) {
                    this.field842[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field857 = arg0.method2206();
            this.field834 = arg0.method2257();
        } else if (arg1 == 79) {
            this.field859 = arg0.method2206();
            this.field844 = arg0.method2206();
            this.field834 = arg0.method2257();
            int var13 = arg0.method2257();
            this.field837 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field837[var14] = arg0.method2206();
            }
        } else if (arg1 == 81) {
            this.field833 = arg0.method2257() * 256;
        }
    }

    @ObfuscatedName("ar.e(II)Z")
    public final boolean method655(int arg0) {
        if (this.field822 != null) {
            for (int var4 = 0; var4 < this.field822.length; var4++) {
                if (this.field822[var4] == arg0) {
                    return Statics.field814.method2747(this.field843[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field843 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field843.length; var3++) {
                var2 &= Statics.field814.method2747(this.field843[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ar.a(I)Z")
    public final boolean method647() {
        if (this.field843 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field843.length; var2++) {
            var1 &= Statics.field814.method2747(this.field843[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ar.l(II[[IIIII)Lbm;")
    public final class75 method646(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field820 << 10) + arg1);
        } else {
            var7 = (long) ((this.field820 << 10) + (arg0 << 3) + arg1);
        }
        class75 var9 = (class75) field860.method3183(var7);
        if (var9 == null) {
            class90 var10 = this.method651(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field821) {
                var10.field1556 = (short) (this.field838 + 64);
                var10.field1589 = (short) (this.field839 + 768);
                var10.method1976();
                var9 = var10;
            } else {
                var9 = var10.method1975(this.field838 + 64, this.field839 + 768, -50, -10, -50);
            }
            field860.method3185(var9, var7);
        }
        if (this.field821) {
            var9 = ((class90) var9).method1901();
        }
        if (this.field833 >= 0) {
            if (var9 instanceof class95) {
                var9 = ((class95) var9).method1988(arg2, arg3, arg4, arg5, true, this.field833);
            } else if (var9 instanceof class90) {
                var9 = ((class90) var9).method1972(arg2, arg3, arg4, arg5, true, this.field833);
            }
        }
        return var9;
    }

    @ObfuscatedName("ar.v(II[[IIIII)Lcp;")
    public final class95 method667(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field820 << 10) + arg1);
        } else {
            var7 = (long) ((this.field820 << 10) + (arg0 << 3) + arg1);
        }
        class95 var9 = (class95) field818.method3183(var7);
        if (var9 == null) {
            class90 var10 = this.method651(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1975(this.field838 + 64, this.field839 + 768, -50, -10, -50);
            field818.method3185(var9, var7);
        }
        if (this.field833 >= 0) {
            var9 = var9.method1988(arg2, arg3, arg4, arg5, true, this.field833);
        }
        return var9;
    }

    @ObfuscatedName("ar.j(II[[IIIILah;II)Lcp;")
    public final class95 method652(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7) {
        long var9;
        if (this.field822 == null) {
            var9 = (long) ((this.field820 << 10) + arg1);
        } else {
            var9 = (long) ((this.field820 << 10) + (arg0 << 3) + arg1);
        }
        class95 var11 = (class95) field818.method3183(var9);
        if (var11 == null) {
            class90 var12 = this.method651(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1975(this.field838 + 64, this.field839 + 768, -50, -10, -50);
            field818.method3185(var11, var9);
        }
        if (arg6 == null && this.field833 == -1) {
            return var11;
        }
        class95 var13;
        if (arg6 == null) {
            var13 = var11.method2000(true);
        } else {
            var13 = arg6.method713(var11, arg7, arg1);
        }
        if (this.field833 >= 0) {
            var13 = var13.method1988(arg2, arg3, arg4, arg5, false, this.field833);
        }
        return var13;
    }

    @ObfuscatedName("ar.k(IIB)Lcv;")
    public final class90 method651(int arg0, int arg1) {
        class90 var3 = null;
        if (this.field822 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field843 == null) {
                return null;
            }
            boolean var4 = this.field861;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field843.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field843[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class90) field846.method3183((long) var7);
                if (var3 == null) {
                    var3 = class90.method1964(Statics.field814, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1911();
                    }
                    field846.method3185(var3, (long) var7);
                }
                if (var5 > 1) {
                    field829[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class90(field829, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field822.length; var9++) {
                if (this.field822[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field843[var8];
            boolean var11 = this.field861 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class90) field846.method3183((long) var10);
            if (var3 == null) {
                var3 = class90.method1964(Statics.field814, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1911();
                }
                field846.method3185(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field845 == 128 && this.field812 == 128 && this.field847 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field848 == 0 && this.field849 == 0 && this.field850 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class90 var14 = new class90(var3, arg1 == 0 && !var12 && !var13, this.field824 == null, this.field826 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1907(256);
            var14.method1908(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1904();
        } else if (var15 == 2) {
            var14.method1905();
        } else if (var15 == 3) {
            var14.method1906();
        }
        if (this.field824 != null) {
            for (int var16 = 0; var16 < this.field824.length; var16++) {
                var14.method1909(this.field824[var16], this.field817[var16]);
            }
        }
        if (this.field826 != null) {
            for (int var17 = 0; var17 < this.field826.length; var17++) {
                var14.method1898(this.field826[var17], this.field827[var17]);
            }
        }
        if (var12) {
            var14.method1899(this.field845, this.field812, this.field847);
        }
        if (var13) {
            var14.method1908(this.field848, this.field849, this.field850);
        }
        return var14;
    }

    @ObfuscatedName("ar.g(B)Lar;")
    public final class33 method676() {
        int var1 = -1;
        if (this.field855 != -1) {
            var1 = class150.method117(this.field855);
        } else if (this.field856 != -1) {
            var1 = class150.field2625[this.field856];
        }
        return var1 < 0 || var1 >= this.field842.length || this.field842[var1] == -1 ? null : method115(this.field842[var1]);
    }

    @ObfuscatedName("i.d(B)V")
    public static void method176() {
        field854.method3193();
        field846.method3193();
        field860.method3193();
        field818.method3193();
    }

    @ObfuscatedName("ar.b(B)Z")
    public boolean method653() {
        if (this.field842 == null) {
            return this.field857 != -1 || this.field837 != null;
        }
        for (int var1 = 0; var1 < this.field842.length; var1++) {
            if (this.field842[var1] != -1) {
                class33 var2 = method115(this.field842[var1]);
                if (var2.field857 != -1 || var2.field837 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
