package deob;

@ObfuscatedName("ak")
public class class32 extends class174 {

    @ObfuscatedName("ak.i")
    public static boolean field870 = false;

    @ObfuscatedName("ak.j")
    public static class170 field826 = new class170(64);

    @ObfuscatedName("ak.o")
    public static class170 field827 = new class170(500);

    @ObfuscatedName("ak.l")
    public static class170 field828 = new class170(30);

    @ObfuscatedName("ak.g")
    public static class170 field829 = new class170(30);

    @ObfuscatedName("ak.w")
    public static class101[] field830 = new class101[4];

    @ObfuscatedName("ak.c")
    public int field831;

    @ObfuscatedName("ak.z")
    public int[] field832;

    @ObfuscatedName("ak.f")
    public int[] field833;

    @ObfuscatedName("ak.a")
    public String field834 = "null";

    @ObfuscatedName("ak.d")
    public short[] field872;

    @ObfuscatedName("ak.e")
    public short[] field836;

    @ObfuscatedName("ak.y")
    public short[] field838;

    @ObfuscatedName("ak.k")
    public short[] field869;

    @ObfuscatedName("ak.h")
    public int field842 = 1;

    @ObfuscatedName("ak.x")
    public int field840 = 1;

    @ObfuscatedName("ak.b")
    public int field861 = 2;

    @ObfuscatedName("ak.n")
    public boolean field859 = true;

    @ObfuscatedName("ak.q")
    public int field843 = -1;

    @ObfuscatedName("ak.r")
    public int field844 = -1;

    @ObfuscatedName("ak.u")
    public boolean field845 = false;

    @ObfuscatedName("ak.p")
    public boolean field846 = false;

    @ObfuscatedName("ak.t")
    public int field847 = -1;

    @ObfuscatedName("ak.s")
    public int field848 = 16;

    @ObfuscatedName("ak.ah")
    public int field849 = 0;

    @ObfuscatedName("ak.ar")
    public int field875 = 0;

    @ObfuscatedName("ak.ac")
    public String[] field851 = new String[5];

    @ObfuscatedName("ak.as")
    public int field852 = -1;

    @ObfuscatedName("ak.ag")
    public int field853 = -1;

    @ObfuscatedName("ak.ak")
    public boolean field854 = false;

    @ObfuscatedName("ak.am")
    public boolean field855 = true;

    @ObfuscatedName("ak.ap")
    public int field864 = 128;

    @ObfuscatedName("ak.au")
    public int field857 = 128;

    @ObfuscatedName("ak.aq")
    public int field858 = 128;

    @ObfuscatedName("ak.at")
    public int field865 = 0;

    @ObfuscatedName("ak.aw")
    public int field856 = 0;

    @ObfuscatedName("ak.ai")
    public int field824 = 0;

    @ObfuscatedName("ak.ae")
    public int field862 = 0;

    @ObfuscatedName("ak.ab")
    public boolean field863 = false;

    @ObfuscatedName("ak.ay")
    public boolean field835 = false;

    @ObfuscatedName("ak.ax")
    public int field850 = -1;

    @ObfuscatedName("ak.ao")
    public int[] field866;

    @ObfuscatedName("ak.al")
    public int field867 = -1;

    @ObfuscatedName("ak.az")
    public int field841 = -1;

    @ObfuscatedName("ak.aj")
    public int field871 = -1;

    @ObfuscatedName("ak.an")
    public int field868 = 0;

    @ObfuscatedName("ak.ad")
    public int field839 = 0;

    @ObfuscatedName("ak.af")
    public int field837 = 0;

    @ObfuscatedName("ak.av")
    public int[] field873;

    @ObfuscatedName("am.i(IB)Lak;")
    public static class32 method701(int arg0) {
        class32 var1 = (class32) field826.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2458.method3032(6, arg0);
        class32 var3 = new class32();
        var3.field831 = arg0;
        if (var2 != null) {
            var3.method658(new class127(var2));
        }
        var3.method659();
        if (var3.field835) {
            var3.field861 = 0;
            var3.field859 = false;
        }
        field826.method3307(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.v(B)V")
    public void method659() {
        if (this.field843 == -1) {
            this.field843 = 0;
            if (this.field832 != null && (this.field833 == null || this.field833[0] == 10)) {
                this.field843 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field851[var1] != null) {
                    this.field843 = 1;
                }
            }
        }
        if (this.field850 == -1) {
            this.field850 = this.field861 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ak.m(Lda;B)V")
    public void method658(class127 arg0) {
        while (true) {
            int var2 = arg0.method2491();
            if (var2 == 0) {
                return;
            }
            this.method661(arg0, var2);
        }
    }

    @ObfuscatedName("ak.j(Lda;II)V")
    public void method661(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2491();
            if (var3 > 0) {
                if (this.field832 == null || field870) {
                    this.field833 = new int[var3];
                    this.field832 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field832[var4] = arg0.method2493();
                        this.field833[var4] = arg0.method2491();
                    }
                } else {
                    arg0.field2039 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field834 = arg0.method2500();
        } else if (arg1 == 5) {
            int var5 = arg0.method2491();
            if (var5 > 0) {
                if (this.field832 == null || field870) {
                    this.field833 = null;
                    this.field832 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field832[var6] = arg0.method2493();
                    }
                } else {
                    arg0.field2039 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field842 = arg0.method2491();
        } else if (arg1 == 15) {
            this.field840 = arg0.method2491();
        } else if (arg1 == 17) {
            this.field861 = 0;
            this.field859 = false;
        } else if (arg1 == 18) {
            this.field859 = false;
        } else if (arg1 == 19) {
            this.field843 = arg0.method2491();
        } else if (arg1 == 21) {
            this.field844 = 0;
        } else if (arg1 == 22) {
            this.field845 = true;
        } else if (arg1 == 23) {
            this.field846 = true;
        } else if (arg1 == 24) {
            this.field847 = arg0.method2493();
            if (this.field847 == 65535) {
                this.field847 = -1;
            }
        } else if (arg1 == 27) {
            this.field861 = 1;
        } else if (arg1 == 28) {
            this.field848 = arg0.method2491();
        } else if (arg1 == 29) {
            this.field849 = arg0.method2492();
        } else if (arg1 == 39) {
            this.field875 = arg0.method2492() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field851[arg1 - 30] = arg0.method2500();
            if (this.field851[arg1 - 30].equalsIgnoreCase(class134.field2246)) {
                this.field851[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2491();
            this.field872 = new short[var7];
            this.field836 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field872[var8] = (short) arg0.method2493();
                this.field836[var8] = (short) arg0.method2493();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2491();
            this.field838 = new short[var9];
            this.field869 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field838[var10] = (short) arg0.method2493();
                this.field869[var10] = (short) arg0.method2493();
            }
        } else if (arg1 == 60) {
            this.field852 = arg0.method2493();
        } else if (arg1 == 62) {
            this.field854 = true;
        } else if (arg1 == 64) {
            this.field855 = false;
        } else if (arg1 == 65) {
            this.field864 = arg0.method2493();
        } else if (arg1 == 66) {
            this.field857 = arg0.method2493();
        } else if (arg1 == 67) {
            this.field858 = arg0.method2493();
        } else if (arg1 == 68) {
            this.field853 = arg0.method2493();
        } else if (arg1 == 69) {
            this.field862 = arg0.method2491();
        } else if (arg1 == 70) {
            this.field865 = arg0.method2529();
        } else if (arg1 == 71) {
            this.field856 = arg0.method2529();
        } else if (arg1 == 72) {
            this.field824 = arg0.method2529();
        } else if (arg1 == 73) {
            this.field863 = true;
        } else if (arg1 == 74) {
            this.field835 = true;
        } else if (arg1 == 75) {
            this.field850 = arg0.method2491();
        } else if (arg1 == 77) {
            this.field867 = arg0.method2493();
            if (this.field867 == 65535) {
                this.field867 = -1;
            }
            this.field841 = arg0.method2493();
            if (this.field841 == 65535) {
                this.field841 = -1;
            }
            int var11 = arg0.method2491();
            this.field866 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field866[var12] = arg0.method2493();
                if (this.field866[var12] == 65535) {
                    this.field866[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field871 = arg0.method2493();
            this.field868 = arg0.method2491();
        } else if (arg1 == 79) {
            this.field839 = arg0.method2493();
            this.field837 = arg0.method2493();
            this.field868 = arg0.method2491();
            int var13 = arg0.method2491();
            this.field873 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field873[var14] = arg0.method2493();
            }
        } else if (arg1 == 81) {
            this.field844 = arg0.method2491() * 256;
        }
    }

    @ObfuscatedName("ak.o(II)Z")
    public final boolean method662(int arg0) {
        if (this.field833 != null) {
            for (int var4 = 0; var4 < this.field833.length; var4++) {
                if (this.field833[var4] == arg0) {
                    return Statics.field825.method3105(this.field832[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field832 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field832.length; var3++) {
                var2 &= Statics.field825.method3105(this.field832[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ak.l(B)Z")
    public final boolean method684() {
        if (this.field832 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field832.length; var2++) {
            var1 &= Statics.field825.method3105(this.field832[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ak.g(II[[IIIII)Lcy;")
    public final class94 method670(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field833 == null) {
            var7 = (long) ((this.field831 << 10) + arg1);
        } else {
            var7 = (long) ((this.field831 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field828.method3308(var7);
        if (var9 == null) {
            class101 var10 = this.method667(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field845) {
                var10.field1723 = (short) (this.field849 + 64);
                var10.field1722 = (short) (this.field875 + 768);
                var10.method2099();
                var9 = var10;
            } else {
                var9 = var10.method2102(this.field849 + 64, this.field875 + 768, -50, -10, -50);
            }
            field828.method3307(var9, var7);
        }
        if (this.field845) {
            var9 = ((class101) var9).method2087();
        }
        if (this.field844 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2314(arg2, arg3, arg4, arg5, true, this.field844);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2124(arg2, arg3, arg4, arg5, true, this.field844);
            }
        }
        return var9;
    }

    @ObfuscatedName("ak.w(II[[IIIIS)Ldl;")
    public final class112 method665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field833 == null) {
            var7 = (long) ((this.field831 << 10) + arg1);
        } else {
            var7 = (long) ((this.field831 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field829.method3308(var7);
        if (var9 == null) {
            class101 var10 = this.method667(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2102(this.field849 + 64, this.field875 + 768, -50, -10, -50);
            field829.method3307(var9, var7);
        }
        if (this.field844 >= 0) {
            var9 = var9.method2314(arg2, arg3, arg4, arg5, true, this.field844);
        }
        return var9;
    }

    @ObfuscatedName("ak.c(II[[IIIILap;II)Ldl;")
    public final class112 method664(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field833 == null) {
            var9 = (long) ((this.field831 << 10) + arg1);
        } else {
            var9 = (long) ((this.field831 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field829.method3308(var9);
        if (var11 == null) {
            class101 var12 = this.method667(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2102(this.field849 + 64, this.field875 + 768, -50, -10, -50);
            field829.method3307(var11, var9);
        }
        if (arg6 == null && this.field844 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2270(true);
        } else {
            var13 = arg6.method721(var11, arg7, arg1);
        }
        if (this.field844 >= 0) {
            var13 = var13.method2314(arg2, arg3, arg4, arg5, false, this.field844);
        }
        return var13;
    }

    @ObfuscatedName("ak.z(III)Lcw;")
    public final class101 method667(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field833 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field832 == null) {
                return null;
            }
            boolean var4 = this.field854;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field832.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field832[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field827.method3308((long) var7);
                if (var3 == null) {
                    var3 = class101.method2081(Statics.field825, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2097();
                    }
                    field827.method3307(var3, (long) var7);
                }
                if (var5 > 1) {
                    field830[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field830, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field833.length; var9++) {
                if (this.field833[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field832[var8];
            boolean var11 = this.field854 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field827.method3308((long) var10);
            if (var3 == null) {
                var3 = class101.method2081(Statics.field825, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2097();
                }
                field827.method3307(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field864 == 128 && this.field857 == 128 && this.field858 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field865 == 0 && this.field856 == 0 && this.field824 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field872 == null, this.field838 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2093(256);
            var14.method2161(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2090();
        } else if (var15 == 2) {
            var14.method2091();
        } else if (var15 == 3) {
            var14.method2092();
        }
        if (this.field872 != null) {
            for (int var16 = 0; var16 < this.field872.length; var16++) {
                var14.method2095(this.field872[var16], this.field836[var16]);
            }
        }
        if (this.field838 != null) {
            for (int var17 = 0; var17 < this.field838.length; var17++) {
                var14.method2152(this.field838[var17], this.field869[var17]);
            }
        }
        if (var12) {
            var14.method2098(this.field864, this.field857, this.field858);
        }
        if (var13) {
            var14.method2161(this.field865, this.field856, this.field824);
        }
        return var14;
    }

    @ObfuscatedName("ak.f(B)Lak;")
    public final class32 method668() {
        int var1 = -1;
        if (this.field867 != -1) {
            var1 = class159.method923(this.field867);
        } else if (this.field841 != -1) {
            var1 = class159.field2705[this.field841];
        }
        return var1 < 0 || var1 >= this.field866.length || this.field866[var1] == -1 ? null : method701(this.field866[var1]);
    }

    @ObfuscatedName("ak.a(I)Z")
    public boolean method686() {
        if (this.field866 == null) {
            return this.field871 != -1 || this.field873 != null;
        }
        for (int var1 = 0; var1 < this.field866.length; var1++) {
            if (this.field866[var1] != -1) {
                class32 var2 = method701(this.field866[var1]);
                if (var2.field871 != -1 || var2.field873 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
