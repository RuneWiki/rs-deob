package deob;

@ObfuscatedName("ad")
public class class33 extends class174 {

    @ObfuscatedName("ad.m")
    public static boolean field835 = false;

    @ObfuscatedName("ad.g")
    public static class167 field800 = new class167(64);

    @ObfuscatedName("ad.r")
    public static class167 field814 = new class167(500);

    @ObfuscatedName("ad.i")
    public static class167 field817 = new class167(30);

    @ObfuscatedName("ad.f")
    public static class167 field833 = new class167(30);

    @ObfuscatedName("ad.a")
    public static class90[] field825 = new class90[4];

    @ObfuscatedName("ad.w")
    public int field834;

    @ObfuscatedName("ad.u")
    public int[] field806;

    @ObfuscatedName("ad.d")
    public int[] field807;

    @ObfuscatedName("ad.t")
    public String field829 = "null";

    @ObfuscatedName("ad.j")
    public short[] field809;

    @ObfuscatedName("ad.q")
    public short[] field810;

    @ObfuscatedName("ad.p")
    public short[] field811;

    @ObfuscatedName("ad.v")
    public short[] field812;

    @ObfuscatedName("ad.n")
    public int field813 = 1;

    @ObfuscatedName("ad.l")
    public int field816 = 1;

    @ObfuscatedName("ad.c")
    public int field803 = 2;

    @ObfuscatedName("ad.b")
    public boolean field852 = true;

    @ObfuscatedName("ad.s")
    public int field801 = -1;

    @ObfuscatedName("ad.o")
    public int field818 = -1;

    @ObfuscatedName("ad.h")
    public boolean field819 = false;

    @ObfuscatedName("ad.x")
    public boolean field846 = false;

    @ObfuscatedName("ad.e")
    public int field821 = -1;

    @ObfuscatedName("ad.z")
    public int field822 = 16;

    @ObfuscatedName("ad.az")
    public int field815 = 0;

    @ObfuscatedName("ad.av")
    public int field824 = 0;

    @ObfuscatedName("ad.ay")
    public String[] field808 = new String[5];

    @ObfuscatedName("ad.ah")
    public int field805 = -1;

    @ObfuscatedName("ad.ao")
    public int field827 = -1;

    @ObfuscatedName("ad.aj")
    public boolean field828 = false;

    @ObfuscatedName("ad.ad")
    public boolean field851 = true;

    @ObfuscatedName("ad.ai")
    public int field830 = 128;

    @ObfuscatedName("ad.af")
    public int field831 = 128;

    @ObfuscatedName("ad.am")
    public int field820 = 128;

    @ObfuscatedName("ad.aq")
    public int field804 = 0;

    @ObfuscatedName("ad.ar")
    public int field797 = 0;

    @ObfuscatedName("ad.an")
    public int field832 = 0;

    @ObfuscatedName("ad.au")
    public boolean field836 = false;

    @ObfuscatedName("ad.aa")
    public boolean field826 = false;

    @ObfuscatedName("ad.ag")
    public int field838 = -1;

    @ObfuscatedName("ad.al")
    public int[] field839;

    @ObfuscatedName("ad.ap")
    public int field840 = -1;

    @ObfuscatedName("ad.ac")
    public int field841 = -1;

    @ObfuscatedName("ad.ak")
    public int field842 = -1;

    @ObfuscatedName("ad.ax")
    public int field843 = 0;

    @ObfuscatedName("ad.ab")
    public int field844 = 0;

    @ObfuscatedName("ad.aw")
    public int field845 = 0;

    @ObfuscatedName("ad.at")
    public int[] field847;

    @ObfuscatedName("k.m(II)Lad;")
    public static class33 method13(int arg0) {
        class33 var1 = (class33) field800.method3137((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field798.method2725(6, arg0);
        class33 var3 = new class33();
        var3.field834 = arg0;
        if (var2 != null) {
            var3.method613(new class104(var2));
        }
        var3.method612();
        if (var3.field826) {
            var3.field803 = 0;
            var3.field852 = false;
        }
        field800.method3130(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.k(I)V")
    public void method612() {
        if (this.field801 == -1) {
            this.field801 = 0;
            if (this.field806 != null && (this.field807 == null || this.field807[0] == 10)) {
                this.field801 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field808[var1] != null) {
                    this.field801 = 1;
                }
            }
        }
        if (this.field838 == -1) {
            this.field838 = this.field803 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ad.y(Lcb;I)V")
    public void method613(class104 arg0) {
        while (true) {
            int var2 = arg0.method2190();
            if (var2 == 0) {
                return;
            }
            this.method633(arg0, var2);
        }
    }

    @ObfuscatedName("ad.g(Lcb;II)V")
    public void method633(class104 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2190();
            if (var3 > 0) {
                if (this.field806 == null || field835) {
                    this.field807 = new int[var3];
                    this.field806 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field806[var4] = arg0.method2132();
                        this.field807[var4] = arg0.method2190();
                    }
                } else {
                    arg0.field1806 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field829 = arg0.method2138();
        } else if (arg1 == 5) {
            int var5 = arg0.method2190();
            if (var5 > 0) {
                if (this.field806 == null || field835) {
                    this.field807 = null;
                    this.field806 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field806[var6] = arg0.method2132();
                    }
                } else {
                    arg0.field1806 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field813 = arg0.method2190();
        } else if (arg1 == 15) {
            this.field816 = arg0.method2190();
        } else if (arg1 == 17) {
            this.field803 = 0;
            this.field852 = false;
        } else if (arg1 == 18) {
            this.field852 = false;
        } else if (arg1 == 19) {
            this.field801 = arg0.method2190();
        } else if (arg1 == 21) {
            this.field818 = 0;
        } else if (arg1 == 22) {
            this.field819 = true;
        } else if (arg1 == 23) {
            this.field846 = true;
        } else if (arg1 == 24) {
            this.field821 = arg0.method2132();
            if (this.field821 == 65535) {
                this.field821 = -1;
            }
        } else if (arg1 == 27) {
            this.field803 = 1;
        } else if (arg1 == 28) {
            this.field822 = arg0.method2190();
        } else if (arg1 == 29) {
            this.field815 = arg0.method2159();
        } else if (arg1 == 39) {
            this.field824 = arg0.method2159();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field808[arg1 - 30] = arg0.method2138();
            if (this.field808[arg1 - 30].equalsIgnoreCase(class139.field2124)) {
                this.field808[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2190();
            this.field809 = new short[var7];
            this.field810 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field809[var8] = (short) arg0.method2132();
                this.field810[var8] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2190();
            this.field811 = new short[var9];
            this.field812 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field811[var10] = (short) arg0.method2132();
                this.field812[var10] = (short) arg0.method2132();
            }
        } else if (arg1 == 60) {
            this.field805 = arg0.method2132();
        } else if (arg1 == 62) {
            this.field828 = true;
        } else if (arg1 == 64) {
            this.field851 = false;
        } else if (arg1 == 65) {
            this.field830 = arg0.method2132();
        } else if (arg1 == 66) {
            this.field831 = arg0.method2132();
        } else if (arg1 == 67) {
            this.field820 = arg0.method2132();
        } else if (arg1 == 68) {
            this.field827 = arg0.method2132();
        } else if (arg1 == 69) {
            arg0.method2190();
        } else if (arg1 == 70) {
            this.field804 = arg0.method2154();
        } else if (arg1 == 71) {
            this.field797 = arg0.method2154();
        } else if (arg1 == 72) {
            this.field832 = arg0.method2154();
        } else if (arg1 == 73) {
            this.field836 = true;
        } else if (arg1 == 74) {
            this.field826 = true;
        } else if (arg1 == 75) {
            this.field838 = arg0.method2190();
        } else if (arg1 == 77) {
            this.field840 = arg0.method2132();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            this.field841 = arg0.method2132();
            if (this.field841 == 65535) {
                this.field841 = -1;
            }
            int var11 = arg0.method2190();
            this.field839 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field839[var12] = arg0.method2132();
                if (this.field839[var12] == 65535) {
                    this.field839[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field842 = arg0.method2132();
            this.field843 = arg0.method2190();
        } else if (arg1 == 79) {
            this.field844 = arg0.method2132();
            this.field845 = arg0.method2132();
            this.field843 = arg0.method2190();
            int var13 = arg0.method2190();
            this.field847 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field847[var14] = arg0.method2132();
            }
        } else if (arg1 == 81) {
            this.field818 = arg0.method2190() * 256;
        }
    }

    @ObfuscatedName("ad.r(IB)Z")
    public final boolean method617(int arg0) {
        if (this.field807 != null) {
            for (int var4 = 0; var4 < this.field807.length; var4++) {
                if (this.field807[var4] == arg0) {
                    return Statics.field799.method2754(this.field806[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field806 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field806.length; var3++) {
                var2 &= Statics.field799.method2754(this.field806[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ad.i(I)Z")
    public final boolean method616() {
        if (this.field806 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field806.length; var2++) {
            var1 &= Statics.field799.method2754(this.field806[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ad.f(II[[IIIII)Lby;")
    public final class75 method639(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field807 == null) {
            var7 = (long) ((this.field834 << 10) + arg1);
        } else {
            var7 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class75 var9 = (class75) field817.method3137(var7);
        if (var9 == null) {
            class90 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field819) {
                var10.field1584 = (short) (this.field815 + 64);
                var10.field1560 = (short) (this.field824 * 25 + 768);
                var10.method1891();
                var9 = var10;
            } else {
                var9 = var10.method1872(this.field815 + 64, this.field824 * 25 + 768, -50, -10, -50);
            }
            field817.method3130(var9, var7);
        }
        if (this.field819) {
            var9 = ((class90) var9).method1879();
        }
        if (this.field818 >= 0) {
            if (var9 instanceof class95) {
                var9 = ((class95) var9).method2036(arg2, arg3, arg4, arg5, true, this.field818);
            } else if (var9 instanceof class90) {
                var9 = ((class90) var9).method1946(arg2, arg3, arg4, arg5, true, this.field818);
            }
        }
        return var9;
    }

    @ObfuscatedName("ad.a(II[[IIIII)Lcl;")
    public final class95 method618(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field807 == null) {
            var7 = (long) ((this.field834 << 10) + arg1);
        } else {
            var7 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class95 var9 = (class95) field833.method3137(var7);
        if (var9 == null) {
            class90 var10 = this.method629(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1872(this.field815 + 64, this.field824 * 25 + 768, -50, -10, -50);
            field833.method3130(var9, var7);
        }
        if (this.field818 >= 0) {
            var9 = var9.method2036(arg2, arg3, arg4, arg5, true, this.field818);
        }
        return var9;
    }

    @ObfuscatedName("ad.w(II[[IIIILaf;II)Lcl;")
    public final class95 method619(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7) {
        long var9;
        if (this.field807 == null) {
            var9 = (long) ((this.field834 << 10) + arg1);
        } else {
            var9 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class95 var11 = (class95) field833.method3137(var9);
        if (var11 == null) {
            class90 var12 = this.method629(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1872(this.field815 + 64, this.field824 * 25 + 768, -50, -10, -50);
            field833.method3130(var11, var9);
        }
        if (arg6 == null && this.field818 == -1) {
            return var11;
        }
        class95 var13;
        if (arg6 == null) {
            var13 = var11.method1982(true);
        } else {
            var13 = arg6.method674(var11, arg7, arg1);
        }
        if (this.field818 >= 0) {
            var13 = var13.method2036(arg2, arg3, arg4, arg5, false, this.field818);
        }
        return var13;
    }

    @ObfuscatedName("ad.u(III)Lck;")
    public final class90 method629(int arg0, int arg1) {
        class90 var3 = null;
        if (this.field807 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field806 == null) {
                return null;
            }
            boolean var4 = this.field828;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field806.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field806[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class90) field814.method3137((long) var7);
                if (var3 == null) {
                    var3 = class90.method1944(Statics.field799, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1889();
                    }
                    field814.method3130(var3, (long) var7);
                }
                if (var5 > 1) {
                    field825[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class90(field825, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field807.length; var9++) {
                if (this.field807[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field806[var8];
            boolean var11 = this.field828 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class90) field814.method3137((long) var10);
            if (var3 == null) {
                var3 = class90.method1944(Statics.field799, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1889();
                }
                field814.method3130(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field830 == 128 && this.field831 == 128 && this.field820 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field804 == 0 && this.field797 == 0 && this.field832 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class90 var14 = new class90(var3, arg1 == 0 && !var12 && !var13, this.field809 == null, this.field811 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1885(256);
            var14.method1886(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1882();
        } else if (var15 == 2) {
            var14.method1894();
        } else if (var15 == 3) {
            var14.method1940();
        }
        if (this.field809 != null) {
            for (int var16 = 0; var16 < this.field809.length; var16++) {
                var14.method1957(this.field809[var16], this.field810[var16]);
            }
        }
        if (this.field811 != null) {
            for (int var17 = 0; var17 < this.field811.length; var17++) {
                var14.method1910(this.field811[var17], this.field812[var17]);
            }
        }
        if (var12) {
            var14.method1921(this.field830, this.field831, this.field820);
        }
        if (var13) {
            var14.method1886(this.field804, this.field797, this.field832);
        }
        return var14;
    }

    @ObfuscatedName("ad.d(I)Lad;")
    public final class33 method621() {
        int var1 = -1;
        if (this.field840 != -1) {
            var1 = class150.method88(this.field840);
        } else if (this.field841 != -1) {
            var1 = class150.field2603[this.field841];
        }
        return var1 < 0 || var1 >= this.field839.length || this.field839[var1] == -1 ? null : method13(this.field839[var1]);
    }

    @ObfuscatedName("fh.t(I)V")
    public static void method3123() {
        field800.method3134();
        field814.method3134();
        field817.method3134();
        field833.method3134();
    }

    @ObfuscatedName("ad.j(I)Z")
    public boolean method622() {
        if (this.field839 == null) {
            return this.field842 != -1 || this.field847 != null;
        }
        for (int var1 = 0; var1 < this.field839.length; var1++) {
            if (this.field839[var1] != -1) {
                class33 var2 = method13(this.field839[var1]);
                if (var2.field842 != -1 || var2.field847 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
