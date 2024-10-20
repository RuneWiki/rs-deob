package deob;

@ObfuscatedName("af")
public class class31 extends class172 {

    @ObfuscatedName("af.c")
    public static boolean field827 = false;

    @ObfuscatedName("af.y")
    public static class168 field797 = new class168(64);

    @ObfuscatedName("af.x")
    public static class168 field798 = new class168(500);

    @ObfuscatedName("af.e")
    public static class168 field799 = new class168(30);

    @ObfuscatedName("af.m")
    public static class168 field821 = new class168(30);

    @ObfuscatedName("af.s")
    public static class100[] field801 = new class100[4];

    @ObfuscatedName("af.p")
    public int field802;

    @ObfuscatedName("af.w")
    public int[] field803;

    @ObfuscatedName("af.r")
    public int[] field816;

    @ObfuscatedName("af.n")
    public String field805 = "null";

    @ObfuscatedName("af.b")
    public short[] field806;

    @ObfuscatedName("af.z")
    public short[] field807;

    @ObfuscatedName("af.h")
    public short[] field808;

    @ObfuscatedName("af.q")
    public short[] field809;

    @ObfuscatedName("af.l")
    public int field810 = 1;

    @ObfuscatedName("af.t")
    public int field796 = 1;

    @ObfuscatedName("af.g")
    public int field815 = 2;

    @ObfuscatedName("af.a")
    public boolean field813 = true;

    @ObfuscatedName("af.v")
    public int field842 = -1;

    @ObfuscatedName("af.i")
    public int field828 = -1;

    @ObfuscatedName("af.k")
    public boolean field824 = false;

    @ObfuscatedName("af.o")
    public boolean field817 = false;

    @ObfuscatedName("af.d")
    public int field818 = -1;

    @ObfuscatedName("af.u")
    public int field819 = 16;

    @ObfuscatedName("af.ap")
    public int field814 = 0;

    @ObfuscatedName("af.ad")
    public int field845 = 0;

    @ObfuscatedName("af.ao")
    public String[] field822 = new String[5];

    @ObfuscatedName("af.av")
    public int field823 = -1;

    @ObfuscatedName("af.af")
    public int field795 = -1;

    @ObfuscatedName("af.ae")
    public boolean field836 = false;

    @ObfuscatedName("af.ax")
    public boolean field826 = true;

    @ObfuscatedName("af.aw")
    public int field829 = 128;

    @ObfuscatedName("af.an")
    public int field811 = 128;

    @ObfuscatedName("af.az")
    public int field837 = 128;

    @ObfuscatedName("af.as")
    public int field830 = 0;

    @ObfuscatedName("af.ag")
    public int field831 = 0;

    @ObfuscatedName("af.am")
    public int field832 = 0;

    @ObfuscatedName("af.ah")
    public int field833 = 0;

    @ObfuscatedName("af.aj")
    public boolean field834 = false;

    @ObfuscatedName("af.ab")
    public boolean field835 = false;

    @ObfuscatedName("af.at")
    public int field800 = -1;

    @ObfuscatedName("af.ai")
    public int[] field812;

    @ObfuscatedName("af.aa")
    public int field838 = -1;

    @ObfuscatedName("af.ar")
    public int field839 = -1;

    @ObfuscatedName("af.au")
    public int field840 = -1;

    @ObfuscatedName("af.aq")
    public int field841 = 0;

    @ObfuscatedName("af.ay")
    public int field820 = 0;

    @ObfuscatedName("af.ak")
    public int field843 = 0;

    @ObfuscatedName("af.ac")
    public int[] field844;

    @ObfuscatedName("ee.c(Lew;Lew;ZB)V")
    public static void method2571(class150 arg0, class150 arg1, boolean arg2) {
        Statics.field2774 = arg0;
        Statics.field825 = arg1;
        field827 = arg2;
    }

    @ObfuscatedName("dl.j(IB)Laf;")
    public static class31 method2519(int arg0) {
        class31 var1 = (class31) field797.method3087((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2774.method2821(6, arg0);
        class31 var3 = new class31();
        var3.field802 = arg0;
        if (var2 != null) {
            var3.method597(new class125(var2));
        }
        var3.method627();
        if (var3.field835) {
            var3.field815 = 0;
            var3.field813 = false;
        }
        field797.method3089(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.f(B)V")
    public void method627() {
        if (this.field842 == -1) {
            this.field842 = 0;
            if (this.field803 != null && (this.field816 == null || this.field816[0] == 10)) {
                this.field842 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field822[var1] != null) {
                    this.field842 = 1;
                }
            }
        }
        if (this.field800 == -1) {
            this.field800 = this.field815 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.y(Ldl;B)V")
    public void method597(class125 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method600(arg0, var2);
        }
    }

    @ObfuscatedName("af.x(Ldl;IB)V")
    public void method600(class125 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2326();
            if (var3 > 0) {
                if (this.field803 == null || field827) {
                    this.field816 = new int[var3];
                    this.field803 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field803[var4] = arg0.method2328();
                        this.field816[var4] = arg0.method2326();
                    }
                } else {
                    arg0.field2003 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field805 = arg0.method2515();
        } else if (arg1 == 5) {
            int var5 = arg0.method2326();
            if (var5 > 0) {
                if (this.field803 == null || field827) {
                    this.field816 = null;
                    this.field803 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field803[var6] = arg0.method2328();
                    }
                } else {
                    arg0.field2003 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field810 = arg0.method2326();
        } else if (arg1 == 15) {
            this.field796 = arg0.method2326();
        } else if (arg1 == 17) {
            this.field815 = 0;
            this.field813 = false;
        } else if (arg1 == 18) {
            this.field813 = false;
        } else if (arg1 == 19) {
            this.field842 = arg0.method2326();
        } else if (arg1 == 21) {
            this.field828 = 0;
        } else if (arg1 == 22) {
            this.field824 = true;
        } else if (arg1 == 23) {
            this.field817 = true;
        } else if (arg1 == 24) {
            this.field818 = arg0.method2328();
            if (this.field818 == 65535) {
                this.field818 = -1;
            }
        } else if (arg1 == 27) {
            this.field815 = 1;
        } else if (arg1 == 28) {
            this.field819 = arg0.method2326();
        } else if (arg1 == 29) {
            this.field814 = arg0.method2347();
        } else if (arg1 == 39) {
            this.field845 = arg0.method2347() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field822[arg1 - 30] = arg0.method2515();
            if (this.field822[arg1 - 30].equalsIgnoreCase(class133.field2181)) {
                this.field822[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2326();
            this.field806 = new short[var7];
            this.field807 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2328();
                this.field807[var8] = (short) arg0.method2328();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2326();
            this.field808 = new short[var9];
            this.field809 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field808[var10] = (short) arg0.method2328();
                this.field809[var10] = (short) arg0.method2328();
            }
        } else if (arg1 == 60) {
            this.field823 = arg0.method2328();
        } else if (arg1 == 62) {
            this.field836 = true;
        } else if (arg1 == 64) {
            this.field826 = false;
        } else if (arg1 == 65) {
            this.field829 = arg0.method2328();
        } else if (arg1 == 66) {
            this.field811 = arg0.method2328();
        } else if (arg1 == 67) {
            this.field837 = arg0.method2328();
        } else if (arg1 == 68) {
            this.field795 = arg0.method2328();
        } else if (arg1 == 69) {
            this.field833 = arg0.method2326();
        } else if (arg1 == 70) {
            this.field830 = arg0.method2329();
        } else if (arg1 == 71) {
            this.field831 = arg0.method2329();
        } else if (arg1 == 72) {
            this.field832 = arg0.method2329();
        } else if (arg1 == 73) {
            this.field834 = true;
        } else if (arg1 == 74) {
            this.field835 = true;
        } else if (arg1 == 75) {
            this.field800 = arg0.method2326();
        } else if (arg1 == 77) {
            this.field838 = arg0.method2328();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            this.field839 = arg0.method2328();
            if (this.field839 == 65535) {
                this.field839 = -1;
            }
            int var11 = arg0.method2326();
            this.field812 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field812[var12] = arg0.method2328();
                if (this.field812[var12] == 65535) {
                    this.field812[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field840 = arg0.method2328();
            this.field841 = arg0.method2326();
        } else if (arg1 == 79) {
            this.field820 = arg0.method2328();
            this.field843 = arg0.method2328();
            this.field841 = arg0.method2326();
            int var13 = arg0.method2326();
            this.field844 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field844[var14] = arg0.method2328();
            }
        } else if (arg1 == 81) {
            this.field828 = arg0.method2326() * 256;
        }
    }

    @ObfuscatedName("af.e(II)Z")
    public final boolean method588(int arg0) {
        if (this.field816 != null) {
            for (int var4 = 0; var4 < this.field816.length; var4++) {
                if (this.field816[var4] == arg0) {
                    return Statics.field825.method2823(this.field803[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field803 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field803.length; var3++) {
                var2 &= Statics.field825.method2823(this.field803[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.m(I)Z")
    public final boolean method589() {
        if (this.field803 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field803.length; var2++) {
            var1 &= Statics.field825.method2823(this.field803[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.s(II[[IIIII)Lca;")
    public final class93 method624(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field802 << 10) + arg1);
        } else {
            var7 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field799.method3087(var7);
        if (var9 == null) {
            class100 var10 = this.method593(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field824) {
                var10.field1691 = (short) (this.field814 + 64);
                var10.field1692 = (short) (this.field845 + 768);
                var10.method1942();
                var9 = var10;
            } else {
                var9 = var10.method1946(this.field814 + 64, this.field845 + 768, -50, -10, -50);
            }
            field799.method3089(var9, var7);
        }
        if (this.field824) {
            var9 = ((class100) var9).method1930();
        }
        if (this.field828 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2117(arg2, arg3, arg4, arg5, true, this.field828);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method1980(arg2, arg3, arg4, arg5, true, this.field828);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.p(II[[IIIII)Ldf;")
    public final class111 method591(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field816 == null) {
            var7 = (long) ((this.field802 << 10) + arg1);
        } else {
            var7 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field821.method3087(var7);
        if (var9 == null) {
            class100 var10 = this.method593(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1946(this.field814 + 64, this.field845 + 768, -50, -10, -50);
            field821.method3089(var9, var7);
        }
        if (this.field828 >= 0) {
            var9 = var9.method2117(arg2, arg3, arg4, arg5, true, this.field828);
        }
        return var9;
    }

    @ObfuscatedName("af.w(II[[IIIILax;IB)Ldf;")
    public final class111 method612(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field816 == null) {
            var9 = (long) ((this.field802 << 10) + arg1);
        } else {
            var9 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field821.method3087(var9);
        if (var11 == null) {
            class100 var12 = this.method593(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1946(this.field814 + 64, this.field845 + 768, -50, -10, -50);
            field821.method3089(var11, var9);
        }
        if (arg6 == null && this.field828 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2118(true);
        } else {
            var13 = arg6.method665(var11, arg7, arg1);
        }
        if (this.field828 >= 0) {
            var13 = var13.method2117(arg2, arg3, arg4, arg5, false, this.field828);
        }
        return var13;
    }

    @ObfuscatedName("af.r(III)Lcl;")
    public final class100 method593(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field816 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field803 == null) {
                return null;
            }
            boolean var4 = this.field836;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field803.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field803[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field798.method3087((long) var7);
                if (var3 == null) {
                    var3 = class100.method1925(Statics.field825, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1940();
                    }
                    field798.method3089(var3, (long) var7);
                }
                if (var5 > 1) {
                    field801[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field801, var5);
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
            int var10 = this.field803[var8];
            boolean var11 = this.field836 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field798.method3087((long) var10);
            if (var3 == null) {
                var3 = class100.method1925(Statics.field825, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1940();
                }
                field798.method3089(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field829 == 128 && this.field811 == 128 && this.field837 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field830 == 0 && this.field831 == 0 && this.field832 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field806 == null, this.field808 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1936(256);
            var14.method1937(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1924();
        } else if (var15 == 2) {
            var14.method1977();
        } else if (var15 == 3) {
            var14.method1935();
        }
        if (this.field806 != null) {
            for (int var16 = 0; var16 < this.field806.length; var16++) {
                var14.method1938(this.field806[var16], this.field807[var16]);
            }
        }
        if (this.field808 != null) {
            for (int var17 = 0; var17 < this.field808.length; var17++) {
                var14.method1959(this.field808[var17], this.field809[var17]);
            }
        }
        if (var12) {
            var14.method1941(this.field829, this.field811, this.field837);
        }
        if (var13) {
            var14.method1937(this.field830, this.field831, this.field832);
        }
        return var14;
    }

    @ObfuscatedName("af.n(I)Laf;")
    public final class31 method594() {
        int var1 = -1;
        if (this.field838 != -1) {
            var1 = class157.method125(this.field838);
        } else if (this.field839 != -1) {
            var1 = class157.field2649[this.field839];
        }
        return var1 < 0 || var1 >= this.field812.length || this.field812[var1] == -1 ? null : method2519(this.field812[var1]);
    }

    @ObfuscatedName("aw.b(B)V")
    public static void method717() {
        field797.method3092();
        field798.method3092();
        field799.method3092();
        field821.method3092();
    }

    @ObfuscatedName("af.z(I)Z")
    public boolean method595() {
        if (this.field812 == null) {
            return this.field840 != -1 || this.field844 != null;
        }
        for (int var1 = 0; var1 < this.field812.length; var1++) {
            if (this.field812[var1] != -1) {
                class31 var2 = method2519(this.field812[var1]);
                if (var2.field840 != -1 || var2.field844 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
