package deob;

@ObfuscatedName("ai")
public class class32 extends class174 {

    @ObfuscatedName("ai.d")
    public static boolean field836 = false;

    @ObfuscatedName("ai.t")
    public static class170 field802 = new class170(64);

    @ObfuscatedName("ai.f")
    public static class170 field803 = new class170(500);

    @ObfuscatedName("ai.c")
    public static class170 field823 = new class170(30);

    @ObfuscatedName("ai.p")
    public static class170 field813 = new class170(30);

    @ObfuscatedName("ai.s")
    public static class101[] field806 = new class101[4];

    @ObfuscatedName("ai.k")
    public int field814;

    @ObfuscatedName("ai.m")
    public int[] field842;

    @ObfuscatedName("ai.y")
    public int[] field809;

    @ObfuscatedName("ai.b")
    public String field810 = "null";

    @ObfuscatedName("ai.l")
    public short[] field811;

    @ObfuscatedName("ai.x")
    public short[] field812;

    @ObfuscatedName("ai.z")
    public short[] field845;

    @ObfuscatedName("ai.r")
    public short[] field834;

    @ObfuscatedName("ai.h")
    public int field818 = 1;

    @ObfuscatedName("ai.v")
    public int field816 = 1;

    @ObfuscatedName("ai.u")
    public int field850 = 2;

    @ObfuscatedName("ai.i")
    public boolean field805 = true;

    @ObfuscatedName("ai.e")
    public int field819 = -1;

    @ObfuscatedName("ai.n")
    public int field820 = -1;

    @ObfuscatedName("ai.q")
    public boolean field821 = false;

    @ObfuscatedName("ai.w")
    public boolean field852 = false;

    @ObfuscatedName("ai.o")
    public int field808 = -1;

    @ObfuscatedName("ai.j")
    public int field824 = 16;

    @ObfuscatedName("ai.ae")
    public int field825 = 0;

    @ObfuscatedName("ai.aq")
    public int field826 = 0;

    @ObfuscatedName("ai.ap")
    public String[] field827 = new String[5];

    @ObfuscatedName("ai.ah")
    public int field828 = -1;

    @ObfuscatedName("ai.ax")
    public int field829 = -1;

    @ObfuscatedName("ai.ai")
    public boolean field830 = false;

    @ObfuscatedName("ai.aa")
    public boolean field831 = true;

    @ObfuscatedName("ai.ar")
    public int field832 = 128;

    @ObfuscatedName("ai.ak")
    public int field833 = 128;

    @ObfuscatedName("ai.al")
    public int field838 = 128;

    @ObfuscatedName("ai.au")
    public int field835 = 0;

    @ObfuscatedName("ai.aj")
    public int field841 = 0;

    @ObfuscatedName("ai.az")
    public int field837 = 0;

    @ObfuscatedName("ai.ac")
    public int field804 = 0;

    @ObfuscatedName("ai.ay")
    public boolean field839 = false;

    @ObfuscatedName("ai.as")
    public boolean field840 = false;

    @ObfuscatedName("ai.af")
    public int field807 = -1;

    @ObfuscatedName("ai.an")
    public int[] field801;

    @ObfuscatedName("ai.am")
    public int field843 = -1;

    @ObfuscatedName("ai.av")
    public int field844 = -1;

    @ObfuscatedName("ai.aw")
    public int field815 = -1;

    @ObfuscatedName("ai.ao")
    public int field846 = 0;

    @ObfuscatedName("ai.at")
    public int field847 = 0;

    @ObfuscatedName("ai.ad")
    public int field848 = 0;

    @ObfuscatedName("ai.ag")
    public int[] field849;

    @ObfuscatedName("ch.d(Lej;Lej;ZI)V")
    public static void method2000(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field817 = arg0;
        Statics.field822 = arg1;
        field836 = arg2;
    }

    @ObfuscatedName("n.g(IB)Lai;")
    public static class32 method204(int arg0) {
        class32 var1 = (class32) field802.method3210((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field817.method2958(6, arg0);
        class32 var3 = new class32();
        var3.field814 = arg0;
        if (var2 != null) {
            var3.method610(new class127(var2));
        }
        var3.method609();
        if (var3.field840) {
            var3.field850 = 0;
            var3.field805 = false;
        }
        field802.method3221(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.a(I)V")
    public void method609() {
        if (this.field819 == -1) {
            this.field819 = 0;
            if (this.field842 != null && (this.field809 == null || this.field809[0] == 10)) {
                this.field819 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field827[var1] != null) {
                    this.field819 = 1;
                }
            }
        }
        if (this.field807 == -1) {
            this.field807 = this.field850 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.t(Ldo;I)V")
    public void method610(class127 arg0) {
        while (true) {
            int var2 = arg0.method2509();
            if (var2 == 0) {
                return;
            }
            this.method611(arg0, var2);
        }
    }

    @ObfuscatedName("ai.f(Ldo;IB)V")
    public void method611(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2509();
            if (var3 > 0) {
                if (this.field842 == null || field836) {
                    this.field809 = new int[var3];
                    this.field842 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field842[var4] = arg0.method2512();
                        this.field809[var4] = arg0.method2509();
                    }
                } else {
                    arg0.field2042 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field810 = arg0.method2408();
        } else if (arg1 == 5) {
            int var5 = arg0.method2509();
            if (var5 > 0) {
                if (this.field842 == null || field836) {
                    this.field809 = null;
                    this.field842 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field842[var6] = arg0.method2512();
                    }
                } else {
                    arg0.field2042 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field818 = arg0.method2509();
        } else if (arg1 == 15) {
            this.field816 = arg0.method2509();
        } else if (arg1 == 17) {
            this.field850 = 0;
            this.field805 = false;
        } else if (arg1 == 18) {
            this.field805 = false;
        } else if (arg1 == 19) {
            this.field819 = arg0.method2509();
        } else if (arg1 == 21) {
            this.field820 = 0;
        } else if (arg1 == 22) {
            this.field821 = true;
        } else if (arg1 == 23) {
            this.field852 = true;
        } else if (arg1 == 24) {
            this.field808 = arg0.method2512();
            if (this.field808 == 65535) {
                this.field808 = -1;
            }
        } else if (arg1 == 27) {
            this.field850 = 1;
        } else if (arg1 == 28) {
            this.field824 = arg0.method2509();
        } else if (arg1 == 29) {
            this.field825 = arg0.method2500();
        } else if (arg1 == 39) {
            this.field826 = arg0.method2500() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field827[arg1 - 30] = arg0.method2408();
            if (this.field827[arg1 - 30].equalsIgnoreCase(class134.field2081)) {
                this.field827[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2509();
            this.field811 = new short[var7];
            this.field812 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field811[var8] = (short) arg0.method2512();
                this.field812[var8] = (short) arg0.method2512();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2509();
            this.field845 = new short[var9];
            this.field834 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field845[var10] = (short) arg0.method2512();
                this.field834[var10] = (short) arg0.method2512();
            }
        } else if (arg1 == 60) {
            this.field828 = arg0.method2512();
        } else if (arg1 == 62) {
            this.field830 = true;
        } else if (arg1 == 64) {
            this.field831 = false;
        } else if (arg1 == 65) {
            this.field832 = arg0.method2512();
        } else if (arg1 == 66) {
            this.field833 = arg0.method2512();
        } else if (arg1 == 67) {
            this.field838 = arg0.method2512();
        } else if (arg1 == 68) {
            this.field829 = arg0.method2512();
        } else if (arg1 == 69) {
            this.field804 = arg0.method2509();
        } else if (arg1 == 70) {
            this.field835 = arg0.method2403();
        } else if (arg1 == 71) {
            this.field841 = arg0.method2403();
        } else if (arg1 == 72) {
            this.field837 = arg0.method2403();
        } else if (arg1 == 73) {
            this.field839 = true;
        } else if (arg1 == 74) {
            this.field840 = true;
        } else if (arg1 == 75) {
            this.field807 = arg0.method2509();
        } else if (arg1 == 77) {
            this.field843 = arg0.method2512();
            if (this.field843 == 65535) {
                this.field843 = -1;
            }
            this.field844 = arg0.method2512();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
            int var11 = arg0.method2509();
            this.field801 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field801[var12] = arg0.method2512();
                if (this.field801[var12] == 65535) {
                    this.field801[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field815 = arg0.method2512();
            this.field846 = arg0.method2509();
        } else if (arg1 == 79) {
            this.field847 = arg0.method2512();
            this.field848 = arg0.method2512();
            this.field846 = arg0.method2509();
            int var13 = arg0.method2509();
            this.field849 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field849[var14] = arg0.method2512();
            }
        } else if (arg1 == 81) {
            this.field820 = arg0.method2509() * 256;
        }
    }

    @ObfuscatedName("ai.c(II)Z")
    public final boolean method612(int arg0) {
        if (this.field809 != null) {
            for (int var4 = 0; var4 < this.field809.length; var4++) {
                if (this.field809[var4] == arg0) {
                    return Statics.field822.method2999(this.field842[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field842 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field842.length; var3++) {
                var2 &= Statics.field822.method2999(this.field842[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.p(I)Z")
    public final boolean method657() {
        if (this.field842 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field842.length; var2++) {
            var1 &= Statics.field822.method2999(this.field842[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.s(II[[IIIII)Lcg;")
    public final class94 method633(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field809 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field823.method3210(var7);
        if (var9 == null) {
            class101 var10 = this.method617(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field821) {
                var10.field1710 = (short) (this.field825 + 64);
                var10.field1689 = (short) (this.field826 + 768);
                var10.method2076();
                var9 = var10;
            } else {
                var9 = var10.method2013(this.field825 + 64, this.field826 + 768, -50, -10, -50);
            }
            field823.method3221(var9, var7);
        }
        if (this.field821) {
            var9 = ((class101) var9).method2006();
        }
        if (this.field820 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2186(arg2, arg3, arg4, arg5, true, this.field820);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2010(arg2, arg3, arg4, arg5, true, this.field820);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.k(II[[IIIII)Ldd;")
    public final class112 method615(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field809 == null) {
            var7 = (long) ((this.field814 << 10) + arg1);
        } else {
            var7 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field813.method3210(var7);
        if (var9 == null) {
            class101 var10 = this.method617(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2013(this.field825 + 64, this.field826 + 768, -50, -10, -50);
            field813.method3221(var9, var7);
        }
        if (this.field820 >= 0) {
            var9 = var9.method2186(arg2, arg3, arg4, arg5, true, this.field820);
        }
        return var9;
    }

    @ObfuscatedName("ai.m(II[[IIIILar;IB)Ldd;")
    public final class112 method648(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field809 == null) {
            var9 = (long) ((this.field814 << 10) + arg1);
        } else {
            var9 = (long) ((this.field814 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field813.method3210(var9);
        if (var11 == null) {
            class101 var12 = this.method617(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2013(this.field825 + 64, this.field826 + 768, -50, -10, -50);
            field813.method3221(var11, var9);
        }
        if (arg6 == null && this.field820 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2187(true);
        } else {
            var13 = arg6.method677(var11, arg7, arg1);
        }
        if (this.field820 >= 0) {
            var13 = var13.method2186(arg2, arg3, arg4, arg5, false, this.field820);
        }
        return var13;
    }

    @ObfuscatedName("ai.y(IIB)Lcr;")
    public final class101 method617(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field809 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field842 == null) {
                return null;
            }
            boolean var4 = this.field830;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field842.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field842[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field803.method3210((long) var7);
                if (var3 == null) {
                    var3 = class101.method2016(Statics.field822, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2018();
                    }
                    field803.method3221(var3, (long) var7);
                }
                if (var5 > 1) {
                    field806[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field806, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field809.length; var9++) {
                if (this.field809[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field842[var8];
            boolean var11 = this.field830 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field803.method3210((long) var10);
            if (var3 == null) {
                var3 = class101.method2016(Statics.field822, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2018();
                }
                field803.method3221(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field832 == 128 && this.field833 == 128 && this.field838 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field835 == 0 && this.field841 == 0 && this.field837 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field811 == null, this.field845 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2014(256);
            var14.method2015(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2012();
        } else if (var15 == 2) {
            var14.method2046();
        } else if (var15 == 3) {
            var14.method2022();
        }
        if (this.field811 != null) {
            for (int var16 = 0; var16 < this.field811.length; var16++) {
                var14.method2035(this.field811[var16], this.field812[var16]);
            }
        }
        if (this.field845 != null) {
            for (int var17 = 0; var17 < this.field845.length; var17++) {
                var14.method2017(this.field845[var17], this.field834[var17]);
            }
        }
        if (var12) {
            var14.method2019(this.field832, this.field833, this.field838);
        }
        if (var13) {
            var14.method2015(this.field835, this.field841, this.field837);
        }
        return var14;
    }

    @ObfuscatedName("ai.b(I)Lai;")
    public final class32 method618() {
        int var1 = -1;
        if (this.field843 != -1) {
            var1 = Statics.method2894(this.field843);
        } else if (this.field844 != -1) {
            var1 = class159.field2715[this.field844];
        }
        return var1 < 0 || var1 >= this.field801.length || this.field801[var1] == -1 ? null : method204(this.field801[var1]);
    }

    @ObfuscatedName("ai.l(I)Z")
    public boolean method655() {
        if (this.field801 == null) {
            return this.field815 != -1 || this.field849 != null;
        }
        for (int var1 = 0; var1 < this.field801.length; var1++) {
            if (this.field801[var1] != -1) {
                class32 var2 = method204(this.field801[var1]);
                if (var2.field815 != -1 || var2.field849 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
