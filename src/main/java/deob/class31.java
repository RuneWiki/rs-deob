package deob;

@ObfuscatedName("ad")
public class class31 extends class172 {

    @ObfuscatedName("ad.z")
    public static boolean field850 = false;

    @ObfuscatedName("ad.p")
    public static class168 field819 = new class168(64);

    @ObfuscatedName("ad.i")
    public static class168 field820 = new class168(500);

    @ObfuscatedName("ad.v")
    public static class168 field821 = new class168(30);

    @ObfuscatedName("ad.l")
    public static class168 field822 = new class168(30);

    @ObfuscatedName("ad.m")
    public static class100[] field823 = new class100[4];

    @ObfuscatedName("ad.g")
    public int field838;

    @ObfuscatedName("ad.t")
    public int[] field825;

    @ObfuscatedName("ad.o")
    public int[] field826;

    @ObfuscatedName("ad.b")
    public String field827 = "null";

    @ObfuscatedName("ad.d")
    public short[] field828;

    @ObfuscatedName("ad.k")
    public short[] field857;

    @ObfuscatedName("ad.f")
    public short[] field830;

    @ObfuscatedName("ad.e")
    public short[] field831;

    @ObfuscatedName("ad.u")
    public int field832 = 1;

    @ObfuscatedName("ad.n")
    public int field829 = 1;

    @ObfuscatedName("ad.q")
    public int field834 = 2;

    @ObfuscatedName("ad.y")
    public boolean field855 = true;

    @ObfuscatedName("ad.a")
    public int field836 = -1;

    @ObfuscatedName("ad.r")
    public int field837 = -1;

    @ObfuscatedName("ad.x")
    public boolean field845 = false;

    @ObfuscatedName("ad.w")
    public boolean field839 = false;

    @ObfuscatedName("ad.j")
    public int field835 = -1;

    @ObfuscatedName("ad.s")
    public int field824 = 16;

    @ObfuscatedName("ad.au")
    public int field842 = 0;

    @ObfuscatedName("ad.ay")
    public int field843 = 0;

    @ObfuscatedName("ad.ar")
    public String[] field844 = new String[5];

    @ObfuscatedName("ad.aj")
    public int field867 = -1;

    @ObfuscatedName("ad.ad")
    public int field847 = -1;

    @ObfuscatedName("ad.at")
    public boolean field818 = false;

    @ObfuscatedName("ad.as")
    public boolean field848 = true;

    @ObfuscatedName("ad.aw")
    public int field849 = 128;

    @ObfuscatedName("ad.ax")
    public int field840 = 128;

    @ObfuscatedName("ad.am")
    public int field851 = 128;

    @ObfuscatedName("ad.an")
    public int field816 = 0;

    @ObfuscatedName("ad.ap")
    public int field853 = 0;

    @ObfuscatedName("ad.ae")
    public int field859 = 0;

    @ObfuscatedName("ad.av")
    public int field862 = 0;

    @ObfuscatedName("ad.ac")
    public boolean field856 = false;

    @ObfuscatedName("ad.ai")
    public boolean field841 = false;

    @ObfuscatedName("ad.ak")
    public int field858 = -1;

    @ObfuscatedName("ad.ag")
    public int[] field817;

    @ObfuscatedName("ad.ah")
    public int field860 = -1;

    @ObfuscatedName("ad.af")
    public int field846 = -1;

    @ObfuscatedName("ad.aa")
    public int field854 = -1;

    @ObfuscatedName("ad.ab")
    public int field863 = 0;

    @ObfuscatedName("ad.ao")
    public int field864 = 0;

    @ObfuscatedName("ad.al")
    public int field865 = 0;

    @ObfuscatedName("ad.aq")
    public int[] field866;

    @ObfuscatedName("ee.z(II)Lad;")
    public static class31 method2662(int arg0) {
        class31 var1 = (class31) field819.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field833.method2951(6, arg0);
        class31 var3 = new class31();
        var3.field838 = arg0;
        if (var2 != null) {
            var3.method658(new class126(var2));
        }
        var3.method648();
        if (var3.field841) {
            var3.field834 = 0;
            var3.field855 = false;
        }
        field819.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.h(I)V")
    public void method648() {
        if (this.field836 == -1) {
            this.field836 = 0;
            if (this.field825 != null && (this.field826 == null || this.field826[0] == 10)) {
                this.field836 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field844[var1] != null) {
                    this.field836 = 1;
                }
            }
        }
        if (this.field858 == -1) {
            this.field858 = this.field834 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ad.c(Ldq;I)V")
    public void method658(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method650(arg0, var2);
        }
    }

    @ObfuscatedName("ad.p(Ldq;II)V")
    public void method650(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2450();
            if (var3 > 0) {
                if (this.field825 == null || field850) {
                    this.field826 = new int[var3];
                    this.field825 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field825[var4] = arg0.method2627();
                        this.field826[var4] = arg0.method2450();
                    }
                } else {
                    arg0.field2003 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field827 = arg0.method2603();
        } else if (arg1 == 5) {
            int var5 = arg0.method2450();
            if (var5 > 0) {
                if (this.field825 == null || field850) {
                    this.field826 = null;
                    this.field825 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field825[var6] = arg0.method2627();
                    }
                } else {
                    arg0.field2003 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field832 = arg0.method2450();
        } else if (arg1 == 15) {
            this.field829 = arg0.method2450();
        } else if (arg1 == 17) {
            this.field834 = 0;
            this.field855 = false;
        } else if (arg1 == 18) {
            this.field855 = false;
        } else if (arg1 == 19) {
            this.field836 = arg0.method2450();
        } else if (arg1 == 21) {
            this.field837 = 0;
        } else if (arg1 == 22) {
            this.field845 = true;
        } else if (arg1 == 23) {
            this.field839 = true;
        } else if (arg1 == 24) {
            this.field835 = arg0.method2627();
            if (this.field835 == 65535) {
                this.field835 = -1;
            }
        } else if (arg1 == 27) {
            this.field834 = 1;
        } else if (arg1 == 28) {
            this.field824 = arg0.method2450();
        } else if (arg1 == 29) {
            this.field842 = arg0.method2451();
        } else if (arg1 == 39) {
            this.field843 = arg0.method2451();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field844[arg1 - 30] = arg0.method2603();
            if (this.field844[arg1 - 30].equalsIgnoreCase(class133.field2145)) {
                this.field844[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2450();
            this.field828 = new short[var7];
            this.field857 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field828[var8] = (short) arg0.method2627();
                this.field857[var8] = (short) arg0.method2627();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2450();
            this.field830 = new short[var9];
            this.field831 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field830[var10] = (short) arg0.method2627();
                this.field831[var10] = (short) arg0.method2627();
            }
        } else if (arg1 == 60) {
            this.field867 = arg0.method2627();
        } else if (arg1 == 62) {
            this.field818 = true;
        } else if (arg1 == 64) {
            this.field848 = false;
        } else if (arg1 == 65) {
            this.field849 = arg0.method2627();
        } else if (arg1 == 66) {
            this.field840 = arg0.method2627();
        } else if (arg1 == 67) {
            this.field851 = arg0.method2627();
        } else if (arg1 == 68) {
            this.field847 = arg0.method2627();
        } else if (arg1 == 69) {
            this.field862 = arg0.method2450();
        } else if (arg1 == 70) {
            this.field816 = arg0.method2513();
        } else if (arg1 == 71) {
            this.field853 = arg0.method2513();
        } else if (arg1 == 72) {
            this.field859 = arg0.method2513();
        } else if (arg1 == 73) {
            this.field856 = true;
        } else if (arg1 == 74) {
            this.field841 = true;
        } else if (arg1 == 75) {
            this.field858 = arg0.method2450();
        } else if (arg1 == 77) {
            this.field860 = arg0.method2627();
            if (this.field860 == 65535) {
                this.field860 = -1;
            }
            this.field846 = arg0.method2627();
            if (this.field846 == 65535) {
                this.field846 = -1;
            }
            int var11 = arg0.method2450();
            this.field817 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field817[var12] = arg0.method2627();
                if (this.field817[var12] == 65535) {
                    this.field817[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field854 = arg0.method2627();
            this.field863 = arg0.method2450();
        } else if (arg1 == 79) {
            this.field864 = arg0.method2627();
            this.field865 = arg0.method2627();
            this.field863 = arg0.method2450();
            int var13 = arg0.method2450();
            this.field866 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field866[var14] = arg0.method2627();
            }
        } else if (arg1 == 81) {
            this.field837 = arg0.method2450() * 256;
        }
    }

    @ObfuscatedName("ad.i(II)Z")
    public final boolean method662(int arg0) {
        if (this.field826 != null) {
            for (int var4 = 0; var4 < this.field826.length; var4++) {
                if (this.field826[var4] == arg0) {
                    return Statics.field861.method2995(this.field825[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field825 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field825.length; var3++) {
                var2 &= Statics.field861.method2995(this.field825[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ad.v(I)Z")
    public final boolean method652() {
        if (this.field825 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field825.length; var2++) {
            var1 &= Statics.field861.method2995(this.field825[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ad.l(II[[IIIIB)Lcq;")
    public final class93 method654(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field826 == null) {
            var7 = (long) ((this.field838 << 10) + arg1);
        } else {
            var7 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field821.method3240(var7);
        if (var9 == null) {
            class100 var10 = this.method656(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field845) {
                var10.field1699 = (short) (this.field842 + 64);
                var10.field1700 = (short) (this.field843 * 25 + 768);
                var10.method2049();
                var9 = var10;
            } else {
                var9 = var10.method2046(this.field842 + 64, this.field843 * 25 + 768, -50, -10, -50);
            }
            field821.method3237(var9, var7);
        }
        if (this.field845) {
            var9 = ((class100) var9).method2095();
        }
        if (this.field837 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2215(arg2, arg3, arg4, arg5, true, this.field837);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2038(arg2, arg3, arg4, arg5, true, this.field837);
            }
        }
        return var9;
    }

    @ObfuscatedName("ad.m(II[[IIIII)Ldh;")
    public final class111 method674(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field826 == null) {
            var7 = (long) ((this.field838 << 10) + arg1);
        } else {
            var7 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field822.method3240(var7);
        if (var9 == null) {
            class100 var10 = this.method656(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2046(this.field842 + 64, this.field843 * 25 + 768, -50, -10, -50);
            field822.method3237(var9, var7);
        }
        if (this.field837 >= 0) {
            var9 = var9.method2215(arg2, arg3, arg4, arg5, true, this.field837);
        }
        return var9;
    }

    @ObfuscatedName("ad.g(II[[IIIILas;II)Ldh;")
    public final class111 method655(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field826 == null) {
            var9 = (long) ((this.field838 << 10) + arg1);
        } else {
            var9 = (long) ((this.field838 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field822.method3240(var9);
        if (var11 == null) {
            class100 var12 = this.method656(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2046(this.field842 + 64, this.field843 * 25 + 768, -50, -10, -50);
            field822.method3237(var11, var9);
        }
        if (arg6 == null && this.field837 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2216(true);
        } else {
            var13 = arg6.method711(var11, arg7, arg1);
        }
        if (this.field837 >= 0) {
            var13 = var13.method2215(arg2, arg3, arg4, arg5, false, this.field837);
        }
        return var13;
    }

    @ObfuscatedName("ad.t(III)Lcj;")
    public final class100 method656(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field826 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field825 == null) {
                return null;
            }
            boolean var4 = this.field818;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field825.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field825[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field820.method3240((long) var7);
                if (var3 == null) {
                    var3 = class100.method2037(Statics.field861, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2047();
                    }
                    field820.method3237(var3, (long) var7);
                }
                if (var5 > 1) {
                    field823[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field823, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field826.length; var9++) {
                if (this.field826[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field825[var8];
            boolean var11 = this.field818 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field820.method3240((long) var10);
            if (var3 == null) {
                var3 = class100.method2037(Statics.field861, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2047();
                }
                field820.method3237(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field849 == 128 && this.field840 == 128 && this.field851 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field816 == 0 && this.field853 == 0 && this.field859 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field828 == null, this.field830 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2043(256);
            var14.method2036(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2040();
        } else if (var15 == 2) {
            var14.method2041();
        } else if (var15 == 3) {
            var14.method2042();
        }
        if (this.field828 != null) {
            for (int var16 = 0; var16 < this.field828.length; var16++) {
                var14.method2059(this.field828[var16], this.field857[var16]);
            }
        }
        if (this.field830 != null) {
            for (int var17 = 0; var17 < this.field830.length; var17++) {
                var14.method2082(this.field830[var17], this.field831[var17]);
            }
        }
        if (var12) {
            var14.method2048(this.field849, this.field840, this.field851);
        }
        if (var13) {
            var14.method2036(this.field816, this.field853, this.field859);
        }
        return var14;
    }

    @ObfuscatedName("ad.o(I)Lad;")
    public final class31 method657() {
        int var1 = -1;
        if (this.field860 != -1) {
            var1 = class157.method3063(this.field860);
        } else if (this.field846 != -1) {
            var1 = class157.field2634[this.field846];
        }
        return var1 < 0 || var1 >= this.field817.length || this.field817[var1] == -1 ? null : method2662(this.field817[var1]);
    }

    @ObfuscatedName("ad.b(I)Z")
    public boolean method670() {
        if (this.field817 == null) {
            return this.field854 != -1 || this.field866 != null;
        }
        for (int var1 = 0; var1 < this.field817.length; var1++) {
            if (this.field817[var1] != -1) {
                class31 var2 = method2662(this.field817[var1]);
                if (var2.field854 != -1 || var2.field866 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
