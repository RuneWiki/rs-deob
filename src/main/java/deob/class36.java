package deob;

@ObfuscatedName("ay")
public class class36 extends class182 {

    @ObfuscatedName("ay.e")
    public static boolean field834 = false;

    @ObfuscatedName("ay.g")
    public static class171 field865 = new class171(64);

    @ObfuscatedName("ay.x")
    public static class171 field835 = new class171(500);

    @ObfuscatedName("ay.b")
    public static class171 field836 = new class171(30);

    @ObfuscatedName("ay.q")
    public static class171 field837 = new class171(30);

    @ObfuscatedName("ay.l")
    public static class93[] field861 = new class93[4];

    @ObfuscatedName("ay.m")
    public int field863;

    @ObfuscatedName("ay.u")
    public int[] field840;

    @ObfuscatedName("ay.s")
    public int[] field841;

    @ObfuscatedName("ay.f")
    public String field869 = "null";

    @ObfuscatedName("ay.p")
    public short[] field843;

    @ObfuscatedName("ay.w")
    public short[] field878;

    @ObfuscatedName("ay.y")
    public short[] field845;

    @ObfuscatedName("ay.h")
    public short[] field846;

    @ObfuscatedName("ay.j")
    public int field877 = 1;

    @ObfuscatedName("ay.c")
    public int field848 = 1;

    @ObfuscatedName("ay.d")
    public int field859 = 2;

    @ObfuscatedName("ay.a")
    public boolean field850 = true;

    @ObfuscatedName("ay.o")
    public int field853 = -1;

    @ObfuscatedName("ay.r")
    public int field852 = -1;

    @ObfuscatedName("ay.t")
    public boolean field851 = false;

    @ObfuscatedName("ay.k")
    public boolean field854 = false;

    @ObfuscatedName("ay.n")
    public int field842 = -1;

    @ObfuscatedName("ay.z")
    public int field856 = 16;

    @ObfuscatedName("ay.av")
    public int field857 = 0;

    @ObfuscatedName("ay.ao")
    public int field858 = 0;

    @ObfuscatedName("ay.am")
    public String[] field866 = new String[5];

    @ObfuscatedName("ay.ac")
    public int field860 = -1;

    @ObfuscatedName("ay.ak")
    public int field876 = -1;

    @ObfuscatedName("ay.ag")
    public boolean field862 = false;

    @ObfuscatedName("ay.ap")
    public boolean field838 = true;

    @ObfuscatedName("ay.ah")
    public int field864 = 128;

    @ObfuscatedName("ay.an")
    public int field849 = 128;

    @ObfuscatedName("ay.ay")
    public int field839 = 128;

    @ObfuscatedName("ay.af")
    public int field867 = 0;

    @ObfuscatedName("ay.aq")
    public int field868 = 0;

    @ObfuscatedName("ay.aj")
    public int field844 = 0;

    @ObfuscatedName("ay.at")
    public boolean field870 = false;

    @ObfuscatedName("ay.aw")
    public boolean field871 = false;

    @ObfuscatedName("ay.ar")
    public int field872 = -1;

    @ObfuscatedName("ay.az")
    public int[] field873;

    @ObfuscatedName("ay.au")
    public int field874 = -1;

    @ObfuscatedName("ay.ai")
    public int field875 = -1;

    @ObfuscatedName("ay.ad")
    public int field855 = -1;

    @ObfuscatedName("ay.al")
    public int field831 = 0;

    @ObfuscatedName("ay.ae")
    public int field847 = 0;

    @ObfuscatedName("ay.as")
    public int field879 = 0;

    @ObfuscatedName("ay.ax")
    public int[] field880;

    @ObfuscatedName("v.e(II)Lay;")
    public static class36 method12(int arg0) {
        class36 var1 = (class36) field865.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field832.method2695(6, arg0);
        class36 var3 = new class36();
        var3.field863 = arg0;
        if (var2 != null) {
            var3.method662(new class107(var2));
        }
        var3.method631();
        if (var3.field871) {
            var3.field859 = 0;
            var3.field850 = false;
        }
        field865.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.v(I)V")
    public void method631() {
        if (this.field853 == -1) {
            this.field853 = 0;
            if (this.field840 != null && (this.field841 == null || this.field841[0] == 10)) {
                this.field853 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field866[var1] != null) {
                    this.field853 = 1;
                }
            }
        }
        if (this.field872 == -1) {
            this.field872 = this.field859 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ay.i(Ldk;I)V")
    public void method662(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method633(arg0, var2);
        }
    }

    @ObfuscatedName("ay.g(Ldk;II)V")
    public void method633(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2226();
            if (var3 > 0) {
                if (this.field840 == null || field834) {
                    this.field841 = new int[var3];
                    this.field840 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field840[var4] = arg0.method2152();
                        this.field841[var4] = arg0.method2226();
                    }
                } else {
                    arg0.field1844 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field869 = arg0.method2124();
        } else if (arg1 == 5) {
            int var5 = arg0.method2226();
            if (var5 > 0) {
                if (this.field840 == null || field834) {
                    this.field841 = null;
                    this.field840 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field840[var6] = arg0.method2152();
                    }
                } else {
                    arg0.field1844 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field877 = arg0.method2226();
        } else if (arg1 == 15) {
            this.field848 = arg0.method2226();
        } else if (arg1 == 17) {
            this.field859 = 0;
            this.field850 = false;
        } else if (arg1 == 18) {
            this.field850 = false;
        } else if (arg1 == 19) {
            this.field853 = arg0.method2226();
        } else if (arg1 == 21) {
            this.field852 = 0;
        } else if (arg1 == 22) {
            this.field851 = true;
        } else if (arg1 == 23) {
            this.field854 = true;
        } else if (arg1 == 24) {
            this.field842 = arg0.method2152();
            if (this.field842 == 65535) {
                this.field842 = -1;
            }
        } else if (arg1 == 27) {
            this.field859 = 1;
        } else if (arg1 == 28) {
            this.field856 = arg0.method2226();
        } else if (arg1 == 29) {
            this.field857 = arg0.method2292();
        } else if (arg1 == 39) {
            this.field858 = arg0.method2292() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field866[arg1 - 30] = arg0.method2124();
            if (this.field866[arg1 - 30].equalsIgnoreCase(class142.field2372)) {
                this.field866[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2226();
            this.field843 = new short[var7];
            this.field878 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field843[var8] = (short) arg0.method2152();
                this.field878[var8] = (short) arg0.method2152();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2226();
            this.field845 = new short[var9];
            this.field846 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field845[var10] = (short) arg0.method2152();
                this.field846[var10] = (short) arg0.method2152();
            }
        } else if (arg1 == 60) {
            this.field860 = arg0.method2152();
        } else if (arg1 == 62) {
            this.field862 = true;
        } else if (arg1 == 64) {
            this.field838 = false;
        } else if (arg1 == 65) {
            this.field864 = arg0.method2152();
        } else if (arg1 == 66) {
            this.field849 = arg0.method2152();
        } else if (arg1 == 67) {
            this.field839 = arg0.method2152();
        } else if (arg1 == 68) {
            this.field876 = arg0.method2152();
        } else if (arg1 == 69) {
            arg0.method2226();
        } else if (arg1 == 70) {
            this.field867 = arg0.method2204();
        } else if (arg1 == 71) {
            this.field868 = arg0.method2204();
        } else if (arg1 == 72) {
            this.field844 = arg0.method2204();
        } else if (arg1 == 73) {
            this.field870 = true;
        } else if (arg1 == 74) {
            this.field871 = true;
        } else if (arg1 == 75) {
            this.field872 = arg0.method2226();
        } else if (arg1 == 77) {
            this.field874 = arg0.method2152();
            if (this.field874 == 65535) {
                this.field874 = -1;
            }
            this.field875 = arg0.method2152();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            int var11 = arg0.method2226();
            this.field873 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field873[var12] = arg0.method2152();
                if (this.field873[var12] == 65535) {
                    this.field873[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field855 = arg0.method2152();
            this.field831 = arg0.method2226();
        } else if (arg1 == 79) {
            this.field847 = arg0.method2152();
            this.field879 = arg0.method2152();
            this.field831 = arg0.method2226();
            int var13 = arg0.method2226();
            this.field880 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field880[var14] = arg0.method2152();
            }
        } else if (arg1 == 81) {
            this.field852 = arg0.method2226() * 256;
        }
    }

    @ObfuscatedName("ay.x(IB)Z")
    public final boolean method653(int arg0) {
        if (this.field841 != null) {
            for (int var4 = 0; var4 < this.field841.length; var4++) {
                if (this.field841[var4] == arg0) {
                    return Statics.field833.method2697(this.field840[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field840 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field840.length; var3++) {
                var2 &= Statics.field833.method2697(this.field840[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.b(I)Z")
    public final boolean method635() {
        if (this.field840 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field840.length; var2++) {
            var1 &= Statics.field833.method2697(this.field840[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ay.q(II[[IIIII)Lbu;")
    public final class78 method636(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field841 == null) {
            var7 = (long) ((this.field863 << 10) + arg1);
        } else {
            var7 = (long) ((this.field863 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field836.method3136(var7);
        if (var9 == null) {
            class93 var10 = this.method639(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field851) {
                var10.field1624 = (short) (this.field857 + 64);
                var10.field1619 = (short) (this.field858 + 768);
                var10.method1894();
                var9 = var10;
            } else {
                var9 = var10.method1897(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            }
            field836.method3127(var9, var7);
        }
        if (this.field851) {
            var9 = ((class93) var9).method1882();
        }
        if (this.field852 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1965(arg2, arg3, arg4, arg5, true, this.field852);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1887(arg2, arg3, arg4, arg5, true, this.field852);
            }
        }
        return var9;
    }

    @ObfuscatedName("ay.l(II[[IIIIB)Lcz;")
    public final class98 method637(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field841 == null) {
            var7 = (long) ((this.field863 << 10) + arg1);
        } else {
            var7 = (long) ((this.field863 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field837.method3136(var7);
        if (var9 == null) {
            class93 var10 = this.method639(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1897(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            field837.method3127(var9, var7);
        }
        if (this.field852 >= 0) {
            var9 = var9.method1965(arg2, arg3, arg4, arg5, true, this.field852);
        }
        return var9;
    }

    @ObfuscatedName("ay.m(II[[IIIILaq;IB)Lcz;")
    public final class98 method638(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field841 == null) {
            var9 = (long) ((this.field863 << 10) + arg1);
        } else {
            var9 = (long) ((this.field863 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field837.method3136(var9);
        if (var11 == null) {
            class93 var12 = this.method639(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1897(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            field837.method3127(var11, var9);
        }
        if (arg6 == null && this.field852 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1966(true);
        } else {
            var13 = arg6.method728(var11, arg7, arg1);
        }
        if (this.field852 >= 0) {
            var13 = var13.method1965(arg2, arg3, arg4, arg5, false, this.field852);
        }
        return var13;
    }

    @ObfuscatedName("ay.u(III)Lcr;")
    public final class93 method639(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field841 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field840 == null) {
                return null;
            }
            boolean var4 = this.field862;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field840.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field840[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field835.method3136((long) var7);
                if (var3 == null) {
                    var3 = class93.method1877(Statics.field833, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1916();
                    }
                    field835.method3127(var3, (long) var7);
                }
                if (var5 > 1) {
                    field861[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field861, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field841.length; var9++) {
                if (this.field841[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field840[var8];
            boolean var11 = this.field862 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field835.method3136((long) var10);
            if (var3 == null) {
                var3 = class93.method1877(Statics.field833, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1916();
                }
                field835.method3127(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field864 == 128 && this.field849 == 128 && this.field839 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field867 == 0 && this.field868 == 0 && this.field844 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field843 == null, this.field845 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1888(256);
            var14.method1889(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1885();
        } else if (var15 == 2) {
            var14.method1947();
        } else if (var15 == 3) {
            var14.method1919();
        }
        if (this.field843 != null) {
            for (int var16 = 0; var16 < this.field843.length; var16++) {
                var14.method1890(this.field843[var16], this.field878[var16]);
            }
        }
        if (this.field845 != null) {
            for (int var17 = 0; var17 < this.field845.length; var17++) {
                var14.method1883(this.field845[var17], this.field846[var17]);
            }
        }
        if (var12) {
            var14.method1892(this.field864, this.field849, this.field839);
        }
        if (var13) {
            var14.method1889(this.field867, this.field868, this.field844);
        }
        return var14;
    }

    @ObfuscatedName("ay.s(I)Lay;")
    public final class36 method634() {
        int var1 = -1;
        if (this.field874 != -1) {
            var1 = class154.method877(this.field874);
        } else if (this.field875 != -1) {
            var1 = class154.field2649[this.field875];
        }
        return var1 < 0 || var1 >= this.field873.length || this.field873[var1] == -1 ? null : method12(this.field873[var1]);
    }

    @ObfuscatedName("ay.f(I)Z")
    public boolean method632() {
        if (this.field873 == null) {
            return this.field855 != -1 || this.field880 != null;
        }
        for (int var1 = 0; var1 < this.field873.length; var1++) {
            if (this.field873[var1] != -1) {
                class36 var2 = method12(this.field873[var1]);
                if (var2.field855 != -1 || var2.field880 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
