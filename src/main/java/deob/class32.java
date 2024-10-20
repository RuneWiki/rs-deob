package deob;

@ObfuscatedName("az")
public class class32 extends class174 {

    @ObfuscatedName("az.q")
    public static boolean field850 = false;

    @ObfuscatedName("az.z")
    public static class170 field857 = new class170(64);

    @ObfuscatedName("az.m")
    public static class170 field844 = new class170(500);

    @ObfuscatedName("az.k")
    public static class170 field822 = new class170(30);

    @ObfuscatedName("az.v")
    public static class170 field819 = new class170(30);

    @ObfuscatedName("az.y")
    public static class101[] field820 = new class101[4];

    @ObfuscatedName("az.d")
    public int field821;

    @ObfuscatedName("az.l")
    public int[] field817;

    @ObfuscatedName("az.h")
    public int[] field856;

    @ObfuscatedName("az.b")
    public String field824 = "null";

    @ObfuscatedName("az.r")
    public short[] field825;

    @ObfuscatedName("az.t")
    public short[] field826;

    @ObfuscatedName("az.u")
    public short[] field823;

    @ObfuscatedName("az.g")
    public short[] field813;

    @ObfuscatedName("az.e")
    public int field855 = 1;

    @ObfuscatedName("az.n")
    public int field830 = 1;

    @ObfuscatedName("az.o")
    public int field831 = 2;

    @ObfuscatedName("az.a")
    public boolean field832 = true;

    @ObfuscatedName("az.f")
    public int field833 = -1;

    @ObfuscatedName("az.s")
    public int field840 = -1;

    @ObfuscatedName("az.w")
    public boolean field835 = false;

    @ObfuscatedName("az.x")
    public boolean field836 = false;

    @ObfuscatedName("az.j")
    public int field843 = -1;

    @ObfuscatedName("az.i")
    public int field838 = 16;

    @ObfuscatedName("az.ap")
    public int field839 = 0;

    @ObfuscatedName("az.am")
    public int field815 = 0;

    @ObfuscatedName("az.ao")
    public String[] field841 = new String[5];

    @ObfuscatedName("az.af")
    public int field842 = -1;

    @ObfuscatedName("az.ae")
    public int field829 = -1;

    @ObfuscatedName("az.az")
    public boolean field863 = false;

    @ObfuscatedName("az.al")
    public boolean field837 = true;

    @ObfuscatedName("az.ak")
    public int field846 = 128;

    @ObfuscatedName("az.ac")
    public int field847 = 128;

    @ObfuscatedName("az.an")
    public int field848 = 128;

    @ObfuscatedName("az.ai")
    public int field849 = 0;

    @ObfuscatedName("az.aa")
    public int field828 = 0;

    @ObfuscatedName("az.ab")
    public int field816 = 0;

    @ObfuscatedName("az.aj")
    public boolean field852 = false;

    @ObfuscatedName("az.au")
    public boolean field853 = false;

    @ObfuscatedName("az.ar")
    public int field854 = -1;

    @ObfuscatedName("az.ad")
    public int[] field851;

    @ObfuscatedName("az.at")
    public int field834 = -1;

    @ObfuscatedName("az.ag")
    public int field845 = -1;

    @ObfuscatedName("az.ax")
    public int field858 = -1;

    @ObfuscatedName("az.ah")
    public int field859 = 0;

    @ObfuscatedName("az.av")
    public int field860 = 0;

    @ObfuscatedName("az.as")
    public int field861 = 0;

    @ObfuscatedName("az.ay")
    public int[] field862;

    @ObfuscatedName("bu.q(Ley;Ley;ZI)V")
    public static void method1437(class153 arg0, class153 arg1, boolean arg2) {
        Statics.field814 = arg0;
        Statics.field818 = arg1;
        field850 = arg2;
    }

    @ObfuscatedName("c.c(IB)Laz;")
    public static class32 method14(int arg0) {
        class32 var1 = (class32) field857.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field814.method2952(6, arg0);
        class32 var3 = new class32();
        var3.field821 = arg0;
        if (var2 != null) {
            var3.method640(new class127(var2));
        }
        var3.method663();
        if (var3.field853) {
            var3.field831 = 0;
            var3.field832 = false;
        }
        field857.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.p(I)V")
    public void method663() {
        if (this.field833 == -1) {
            this.field833 = 0;
            if (this.field817 != null && (this.field856 == null || this.field856[0] == 10)) {
                this.field833 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field841[var1] != null) {
                    this.field833 = 1;
                }
            }
        }
        if (this.field854 == -1) {
            this.field854 = this.field831 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("az.z(Ldo;B)V")
    public void method640(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method668(arg0, var2);
        }
    }

    @ObfuscatedName("az.m(Ldo;IB)V")
    public void method668(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2534();
            if (var3 > 0) {
                if (this.field817 == null || field850) {
                    this.field856 = new int[var3];
                    this.field817 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field817[var4] = arg0.method2427();
                        this.field856[var4] = arg0.method2534();
                    }
                } else {
                    arg0.field2039 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field824 = arg0.method2460();
        } else if (arg1 == 5) {
            int var5 = arg0.method2534();
            if (var5 > 0) {
                if (this.field817 == null || field850) {
                    this.field856 = null;
                    this.field817 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field817[var6] = arg0.method2427();
                    }
                } else {
                    arg0.field2039 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field855 = arg0.method2534();
        } else if (arg1 == 15) {
            this.field830 = arg0.method2534();
        } else if (arg1 == 17) {
            this.field831 = 0;
            this.field832 = false;
        } else if (arg1 == 18) {
            this.field832 = false;
        } else if (arg1 == 19) {
            this.field833 = arg0.method2534();
        } else if (arg1 == 21) {
            this.field840 = 0;
        } else if (arg1 == 22) {
            this.field835 = true;
        } else if (arg1 == 23) {
            this.field836 = true;
        } else if (arg1 == 24) {
            this.field843 = arg0.method2427();
            if (this.field843 == 65535) {
                this.field843 = -1;
            }
        } else if (arg1 == 27) {
            this.field831 = 1;
        } else if (arg1 == 28) {
            this.field838 = arg0.method2534();
        } else if (arg1 == 29) {
            this.field839 = arg0.method2426();
        } else if (arg1 == 39) {
            this.field815 = arg0.method2426() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field841[arg1 - 30] = arg0.method2460();
            if (this.field841[arg1 - 30].equalsIgnoreCase(class135.field2108)) {
                this.field841[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2534();
            this.field825 = new short[var7];
            this.field826 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field825[var8] = (short) arg0.method2427();
                this.field826[var8] = (short) arg0.method2427();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2534();
            this.field823 = new short[var9];
            this.field813 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field823[var10] = (short) arg0.method2427();
                this.field813[var10] = (short) arg0.method2427();
            }
        } else if (arg1 == 60) {
            this.field842 = arg0.method2427();
        } else if (arg1 == 62) {
            this.field863 = true;
        } else if (arg1 == 64) {
            this.field837 = false;
        } else if (arg1 == 65) {
            this.field846 = arg0.method2427();
        } else if (arg1 == 66) {
            this.field847 = arg0.method2427();
        } else if (arg1 == 67) {
            this.field848 = arg0.method2427();
        } else if (arg1 == 68) {
            this.field829 = arg0.method2427();
        } else if (arg1 == 69) {
            arg0.method2534();
        } else if (arg1 == 70) {
            this.field849 = arg0.method2452();
        } else if (arg1 == 71) {
            this.field828 = arg0.method2452();
        } else if (arg1 == 72) {
            this.field816 = arg0.method2452();
        } else if (arg1 == 73) {
            this.field852 = true;
        } else if (arg1 == 74) {
            this.field853 = true;
        } else if (arg1 == 75) {
            this.field854 = arg0.method2534();
        } else if (arg1 == 77) {
            this.field834 = arg0.method2427();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }
            this.field845 = arg0.method2427();
            if (this.field845 == 65535) {
                this.field845 = -1;
            }
            int var11 = arg0.method2534();
            this.field851 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field851[var12] = arg0.method2427();
                if (this.field851[var12] == 65535) {
                    this.field851[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field858 = arg0.method2427();
            this.field859 = arg0.method2534();
        } else if (arg1 == 79) {
            this.field860 = arg0.method2427();
            this.field861 = arg0.method2427();
            this.field859 = arg0.method2534();
            int var13 = arg0.method2534();
            this.field862 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field862[var14] = arg0.method2427();
            }
        } else if (arg1 == 81) {
            this.field840 = arg0.method2534() * 256;
        }
    }

    @ObfuscatedName("az.k(IS)Z")
    public final boolean method652(int arg0) {
        if (this.field856 != null) {
            for (int var4 = 0; var4 < this.field856.length; var4++) {
                if (this.field856[var4] == arg0) {
                    return Statics.field818.method2971(this.field817[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field817 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field817.length; var3++) {
                var2 &= Statics.field818.method2971(this.field817[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("az.v(I)Z")
    public final boolean method643() {
        if (this.field817 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field817.length; var2++) {
            var1 &= Statics.field818.method2971(this.field817[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("az.y(II[[IIIII)Lcx;")
    public final class94 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field856 == null) {
            var7 = (long) ((this.field821 << 10) + arg1);
        } else {
            var7 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field822.method3215(var7);
        if (var9 == null) {
            class101 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field835) {
                var10.field1719 = (short) (this.field839 + 64);
                var10.field1720 = (short) (this.field815 + 768);
                var10.method2045();
                var9 = var10;
            } else {
                var9 = var10.method2049(this.field839 + 64, this.field815 + 768, -50, -10, -50);
            }
            field822.method3225(var9, var7);
        }
        if (this.field835) {
            var9 = ((class101) var9).method2041();
        }
        if (this.field840 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2209(arg2, arg3, arg4, arg5, true, this.field840);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2034(arg2, arg3, arg4, arg5, true, this.field840);
            }
        }
        return var9;
    }

    @ObfuscatedName("az.d(II[[IIIIS)Ldn;")
    public final class112 method645(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field856 == null) {
            var7 = (long) ((this.field821 << 10) + arg1);
        } else {
            var7 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field819.method3215(var7);
        if (var9 == null) {
            class101 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2049(this.field839 + 64, this.field815 + 768, -50, -10, -50);
            field819.method3225(var9, var7);
        }
        if (this.field840 >= 0) {
            var9 = var9.method2209(arg2, arg3, arg4, arg5, true, this.field840);
        }
        return var9;
    }

    @ObfuscatedName("az.l(II[[IIIILak;II)Ldn;")
    public final class112 method646(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field856 == null) {
            var9 = (long) ((this.field821 << 10) + arg1);
        } else {
            var9 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field819.method3215(var9);
        if (var11 == null) {
            class101 var12 = this.method647(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2049(this.field839 + 64, this.field815 + 768, -50, -10, -50);
            field819.method3225(var11, var9);
        }
        if (arg6 == null && this.field840 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2210(true);
        } else {
            var13 = arg6.method732(var11, arg7, arg1);
        }
        if (this.field840 >= 0) {
            var13 = var13.method2209(arg2, arg3, arg4, arg5, false, this.field840);
        }
        return var13;
    }

    @ObfuscatedName("az.h(III)Lcy;")
    public final class101 method647(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field856 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field817 == null) {
                return null;
            }
            boolean var4 = this.field863;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field817.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field817[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field844.method3215((long) var7);
                if (var3 == null) {
                    var3 = class101.method2039(Statics.field818, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2033();
                    }
                    field844.method3225(var3, (long) var7);
                }
                if (var5 > 1) {
                    field820[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field820, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field856.length; var9++) {
                if (this.field856[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field817[var8];
            boolean var11 = this.field863 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field844.method3215((long) var10);
            if (var3 == null) {
                var3 = class101.method2039(Statics.field818, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2033();
                }
                field844.method3225(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field846 == 128 && this.field847 == 128 && this.field848 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field849 == 0 && this.field828 == 0 && this.field816 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field825 == null, this.field823 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2052(256);
            var14.method2068(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2036();
        } else if (var15 == 2) {
            var14.method2087();
        } else if (var15 == 3) {
            var14.method2063();
        }
        if (this.field825 != null) {
            for (int var16 = 0; var16 < this.field825.length; var16++) {
                var14.method2072(this.field825[var16], this.field826[var16]);
            }
        }
        if (this.field823 != null) {
            for (int var17 = 0; var17 < this.field823.length; var17++) {
                var14.method2042(this.field823[var17], this.field813[var17]);
            }
        }
        if (var12) {
            var14.method2044(this.field846, this.field847, this.field848);
        }
        if (var13) {
            var14.method2068(this.field849, this.field828, this.field816);
        }
        return var14;
    }

    @ObfuscatedName("az.b(I)Laz;")
    public final class32 method648() {
        int var1 = -1;
        if (this.field834 != -1) {
            var1 = class160.method2965(this.field834);
        } else if (this.field845 != -1) {
            var1 = class160.field2731[this.field845];
        }
        return var1 < 0 || var1 >= this.field851.length || this.field851[var1] == -1 ? null : method14(this.field851[var1]);
    }

    @ObfuscatedName("az.r(B)Z")
    public boolean method649() {
        if (this.field851 == null) {
            return this.field858 != -1 || this.field862 != null;
        }
        for (int var1 = 0; var1 < this.field851.length; var1++) {
            if (this.field851[var1] != -1) {
                class32 var2 = method14(this.field851[var1]);
                if (var2.field858 != -1 || var2.field862 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
