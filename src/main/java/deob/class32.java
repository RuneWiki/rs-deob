package deob;

@ObfuscatedName("an")
public class class32 extends class174 {

    @ObfuscatedName("an.i")
    public static boolean field821 = false;

    @ObfuscatedName("an.e")
    public static class170 field823 = new class170(64);

    @ObfuscatedName("an.t")
    public static class170 field824 = new class170(500);

    @ObfuscatedName("an.d")
    public static class170 field825 = new class170(30);

    @ObfuscatedName("an.p")
    public static class170 field843 = new class170(30);

    @ObfuscatedName("an.k")
    public static class101[] field827 = new class101[4];

    @ObfuscatedName("an.r")
    public int field828;

    @ObfuscatedName("an.l")
    public int[] field847;

    @ObfuscatedName("an.a")
    public int[] field830;

    @ObfuscatedName("an.z")
    public String field856 = "null";

    @ObfuscatedName("an.s")
    public short[] field862;

    @ObfuscatedName("an.m")
    public short[] field833;

    @ObfuscatedName("an.u")
    public short[] field834;

    @ObfuscatedName("an.g")
    public short[] field835;

    @ObfuscatedName("an.o")
    public int field836 = 1;

    @ObfuscatedName("an.v")
    public int field837 = 1;

    @ObfuscatedName("an.j")
    public int field838 = 2;

    @ObfuscatedName("an.n")
    public boolean field839 = true;

    @ObfuscatedName("an.q")
    public int field852 = -1;

    @ObfuscatedName("an.c")
    public int field841 = -1;

    @ObfuscatedName("an.h")
    public boolean field870 = false;

    @ObfuscatedName("an.b")
    public boolean field866 = false;

    @ObfuscatedName("an.y")
    public int field844 = -1;

    @ObfuscatedName("an.x")
    public int field845 = 16;

    @ObfuscatedName("an.ao")
    public int field846 = 0;

    @ObfuscatedName("an.ae")
    public int field871 = 0;

    @ObfuscatedName("an.aa")
    public String[] field848 = new String[5];

    @ObfuscatedName("an.ah")
    public int field849 = -1;

    @ObfuscatedName("an.aw")
    public int field850 = -1;

    @ObfuscatedName("an.an")
    public boolean field851 = false;

    @ObfuscatedName("an.av")
    public boolean field826 = true;

    @ObfuscatedName("an.ak")
    public int field853 = 128;

    @ObfuscatedName("an.ax")
    public int field854 = 128;

    @ObfuscatedName("an.ab")
    public int field855 = 128;

    @ObfuscatedName("an.af")
    public int field822 = 0;

    @ObfuscatedName("an.ai")
    public int field857 = 0;

    @ObfuscatedName("an.at")
    public int field858 = 0;

    @ObfuscatedName("an.aq")
    public int field859 = 0;

    @ObfuscatedName("an.ac")
    public boolean field863 = false;

    @ObfuscatedName("an.al")
    public boolean field861 = false;

    @ObfuscatedName("an.ag")
    public int field865 = -1;

    @ObfuscatedName("an.ap")
    public int[] field829;

    @ObfuscatedName("an.am")
    public int field864 = -1;

    @ObfuscatedName("an.as")
    public int field867 = -1;

    @ObfuscatedName("an.aj")
    public int field840 = -1;

    @ObfuscatedName("an.ar")
    public int field842 = 0;

    @ObfuscatedName("an.au")
    public int field868 = 0;

    @ObfuscatedName("an.ad")
    public int field872 = 0;

    @ObfuscatedName("an.az")
    public int[] field869;

    @ObfuscatedName("dy.i(Leg;Leg;ZB)V")
    public static void method2213(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field860 = arg0;
        Statics.field1763 = arg1;
        field821 = arg2;
    }

    @ObfuscatedName("eb.w(II)Lan;")
    public static class32 method2660(int arg0) {
        class32 var1 = (class32) field823.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field860.method2970(6, arg0);
        class32 var3 = new class32();
        var3.field828 = arg0;
        if (var2 != null) {
            var3.method636(new class127(var2));
        }
        var3.method637();
        if (var3.field861) {
            var3.field838 = 0;
            var3.field839 = false;
        }
        field823.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.f(I)V")
    public void method637() {
        if (this.field852 == -1) {
            this.field852 = 0;
            if (this.field847 != null && (this.field830 == null || this.field830[0] == 10)) {
                this.field852 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field848[var1] != null) {
                    this.field852 = 1;
                }
            }
        }
        if (this.field865 == -1) {
            this.field865 = this.field838 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("an.e(Ldz;I)V")
    public void method636(class127 arg0) {
        while (true) {
            int var2 = arg0.method2472();
            if (var2 == 0) {
                return;
            }
            this.method657(arg0, var2);
        }
    }

    @ObfuscatedName("an.t(Ldz;IB)V")
    public void method657(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2472();
            if (var3 > 0) {
                if (this.field847 == null || field821) {
                    this.field830 = new int[var3];
                    this.field847 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field847[var4] = arg0.method2615();
                        this.field830[var4] = arg0.method2472();
                    }
                } else {
                    arg0.field2045 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field856 = arg0.method2460();
        } else if (arg1 == 5) {
            int var5 = arg0.method2472();
            if (var5 > 0) {
                if (this.field847 == null || field821) {
                    this.field830 = null;
                    this.field847 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field847[var6] = arg0.method2615();
                    }
                } else {
                    arg0.field2045 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field836 = arg0.method2472();
        } else if (arg1 == 15) {
            this.field837 = arg0.method2472();
        } else if (arg1 == 17) {
            this.field838 = 0;
            this.field839 = false;
        } else if (arg1 == 18) {
            this.field839 = false;
        } else if (arg1 == 19) {
            this.field852 = arg0.method2472();
        } else if (arg1 == 21) {
            this.field841 = 0;
        } else if (arg1 == 22) {
            this.field870 = true;
        } else if (arg1 == 23) {
            this.field866 = true;
        } else if (arg1 == 24) {
            this.field844 = arg0.method2615();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
        } else if (arg1 == 27) {
            this.field838 = 1;
        } else if (arg1 == 28) {
            this.field845 = arg0.method2472();
        } else if (arg1 == 29) {
            this.field846 = arg0.method2453();
        } else if (arg1 == 39) {
            this.field871 = arg0.method2453();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field848[arg1 - 30] = arg0.method2460();
            if (this.field848[arg1 - 30].equalsIgnoreCase(class134.field2123)) {
                this.field848[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2472();
            this.field862 = new short[var7];
            this.field833 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field862[var8] = (short) arg0.method2615();
                this.field833[var8] = (short) arg0.method2615();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2472();
            this.field834 = new short[var9];
            this.field835 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field834[var10] = (short) arg0.method2615();
                this.field835[var10] = (short) arg0.method2615();
            }
        } else if (arg1 == 60) {
            this.field849 = arg0.method2615();
        } else if (arg1 == 62) {
            this.field851 = true;
        } else if (arg1 == 64) {
            this.field826 = false;
        } else if (arg1 == 65) {
            this.field853 = arg0.method2615();
        } else if (arg1 == 66) {
            this.field854 = arg0.method2615();
        } else if (arg1 == 67) {
            this.field855 = arg0.method2615();
        } else if (arg1 == 68) {
            this.field850 = arg0.method2615();
        } else if (arg1 == 69) {
            this.field859 = arg0.method2472();
        } else if (arg1 == 70) {
            this.field822 = arg0.method2455();
        } else if (arg1 == 71) {
            this.field857 = arg0.method2455();
        } else if (arg1 == 72) {
            this.field858 = arg0.method2455();
        } else if (arg1 == 73) {
            this.field863 = true;
        } else if (arg1 == 74) {
            this.field861 = true;
        } else if (arg1 == 75) {
            this.field865 = arg0.method2472();
        } else if (arg1 == 77) {
            this.field864 = arg0.method2615();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            this.field867 = arg0.method2615();
            if (this.field867 == 65535) {
                this.field867 = -1;
            }
            int var11 = arg0.method2472();
            this.field829 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field829[var12] = arg0.method2615();
                if (this.field829[var12] == 65535) {
                    this.field829[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field840 = arg0.method2615();
            this.field842 = arg0.method2472();
        } else if (arg1 == 79) {
            this.field868 = arg0.method2615();
            this.field872 = arg0.method2615();
            this.field842 = arg0.method2472();
            int var13 = arg0.method2472();
            this.field869 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field869[var14] = arg0.method2615();
            }
        } else if (arg1 == 81) {
            this.field841 = arg0.method2472() * 256;
        }
    }

    @ObfuscatedName("an.d(IB)Z")
    public final boolean method638(int arg0) {
        if (this.field830 != null) {
            for (int var4 = 0; var4 < this.field830.length; var4++) {
                if (this.field830[var4] == arg0) {
                    return Statics.field1763.method2972(this.field847[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field847 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field847.length; var3++) {
                var2 &= Statics.field1763.method2972(this.field847[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("an.p(I)Z")
    public final boolean method639() {
        if (this.field847 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field847.length; var2++) {
            var1 &= Statics.field1763.method2972(this.field847[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("an.k(II[[IIIIB)Lcr;")
    public final class94 method646(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field830 == null) {
            var7 = (long) ((this.field828 << 10) + arg1);
        } else {
            var7 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field825.method3235(var7);
        if (var9 == null) {
            class101 var10 = this.method652(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field870) {
                var10.field1721 = (short) (this.field846 + 64);
                var10.field1722 = (short) (this.field871 * 25 + 768);
                var10.method2101();
                var9 = var10;
            } else {
                var9 = var10.method2112(this.field846 + 64, this.field871 * 25 + 768, -50, -10, -50);
            }
            field825.method3234(var9, var7);
        }
        if (this.field870) {
            var9 = ((class101) var9).method2047();
        }
        if (this.field841 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2240(arg2, arg3, arg4, arg5, true, this.field841);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2048(arg2, arg3, arg4, arg5, true, this.field841);
            }
        }
        return var9;
    }

    @ObfuscatedName("an.r(II[[IIIIS)Ldb;")
    public final class112 method641(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field830 == null) {
            var7 = (long) ((this.field828 << 10) + arg1);
        } else {
            var7 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field843.method3235(var7);
        if (var9 == null) {
            class101 var10 = this.method652(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2112(this.field846 + 64, this.field871 * 25 + 768, -50, -10, -50);
            field843.method3234(var9, var7);
        }
        if (this.field841 >= 0) {
            var9 = var9.method2240(arg2, arg3, arg4, arg5, true, this.field841);
        }
        return var9;
    }

    @ObfuscatedName("an.l(II[[IIIILak;II)Ldb;")
    public final class112 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field830 == null) {
            var9 = (long) ((this.field828 << 10) + arg1);
        } else {
            var9 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field843.method3235(var9);
        if (var11 == null) {
            class101 var12 = this.method652(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2112(this.field846 + 64, this.field871 * 25 + 768, -50, -10, -50);
            field843.method3234(var11, var9);
        }
        if (arg6 == null && this.field841 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2241(true);
        } else {
            var13 = arg6.method703(var11, arg7, arg1);
        }
        if (this.field841 >= 0) {
            var13 = var13.method2240(arg2, arg3, arg4, arg5, false, this.field841);
        }
        return var13;
    }

    @ObfuscatedName("an.a(III)Lco;")
    public final class101 method652(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field830 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field847 == null) {
                return null;
            }
            boolean var4 = this.field851;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field847.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field847[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field824.method3235((long) var7);
                if (var3 == null) {
                    var3 = class101.method2052(Statics.field1763, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2102();
                    }
                    field824.method3234(var3, (long) var7);
                }
                if (var5 > 1) {
                    field827[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field827, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field830.length; var9++) {
                if (this.field830[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field847[var8];
            boolean var11 = this.field851 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field824.method3235((long) var10);
            if (var3 == null) {
                var3 = class101.method2052(Statics.field1763, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2102();
                }
                field824.method3234(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field853 == 128 && this.field854 == 128 && this.field855 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field822 == 0 && this.field857 == 0 && this.field858 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field862 == null, this.field834 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2058(256);
            var14.method2053(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2049();
        } else if (var15 == 2) {
            var14.method2050();
        } else if (var15 == 3) {
            var14.method2051();
        }
        if (this.field862 != null) {
            for (int var16 = 0; var16 < this.field862.length; var16++) {
                var14.method2064(this.field862[var16], this.field833[var16]);
            }
        }
        if (this.field834 != null) {
            for (int var17 = 0; var17 < this.field834.length; var17++) {
                var14.method2066(this.field834[var17], this.field835[var17]);
            }
        }
        if (var12) {
            var14.method2117(this.field853, this.field854, this.field855);
        }
        if (var13) {
            var14.method2053(this.field822, this.field857, this.field858);
        }
        return var14;
    }

    @ObfuscatedName("an.z(I)Lan;")
    public final class32 method650() {
        int var1 = -1;
        if (this.field864 != -1) {
            var1 = class159.method2663(this.field864);
        } else if (this.field867 != -1) {
            var1 = class159.field2697[this.field867];
        }
        return var1 < 0 || var1 >= this.field829.length || this.field829[var1] == -1 ? null : method2660(this.field829[var1]);
    }

    @ObfuscatedName("an.s(I)Z")
    public boolean method645() {
        if (this.field829 == null) {
            return this.field840 != -1 || this.field869 != null;
        }
        for (int var1 = 0; var1 < this.field829.length; var1++) {
            if (this.field829[var1] != -1) {
                class32 var2 = method2660(this.field829[var1]);
                if (var2.field840 != -1 || var2.field869 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
