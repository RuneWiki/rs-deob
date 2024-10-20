package deob;

@ObfuscatedName("ab")
public class class32 extends class174 {

    @ObfuscatedName("ab.a")
    public static boolean field795 = false;

    @ObfuscatedName("ab.t")
    public static class170 field796 = new class170(64);

    @ObfuscatedName("ab.k")
    public static class170 field797 = new class170(500);

    @ObfuscatedName("ab.x")
    public static class170 field810 = new class170(30);

    @ObfuscatedName("ab.v")
    public static class170 field802 = new class170(30);

    @ObfuscatedName("ab.g")
    public static class101[] field794 = new class101[4];

    @ObfuscatedName("ab.n")
    public int field801;

    @ObfuscatedName("ab.q")
    public int[] field836;

    @ObfuscatedName("ab.i")
    public int[] field803;

    @ObfuscatedName("ab.p")
    public String field804 = "null";

    @ObfuscatedName("ab.e")
    public short[] field820;

    @ObfuscatedName("ab.o")
    public short[] field830;

    @ObfuscatedName("ab.j")
    public short[] field817;

    @ObfuscatedName("ab.s")
    public short[] field798;

    @ObfuscatedName("ab.b")
    public int field809 = 1;

    @ObfuscatedName("ab.c")
    public int field807 = 1;

    @ObfuscatedName("ab.m")
    public int field811 = 2;

    @ObfuscatedName("ab.z")
    public boolean field806 = true;

    @ObfuscatedName("ab.h")
    public int field813 = -1;

    @ObfuscatedName("ab.f")
    public int field814 = -1;

    @ObfuscatedName("ab.w")
    public boolean field815 = false;

    @ObfuscatedName("ab.l")
    public boolean field816 = false;

    @ObfuscatedName("ab.d")
    public int field833 = -1;

    @ObfuscatedName("ab.y")
    public int field818 = 16;

    @ObfuscatedName("ab.ah")
    public int field819 = 0;

    @ObfuscatedName("ab.ad")
    public int field839 = 0;

    @ObfuscatedName("ab.au")
    public String[] field821 = new String[5];

    @ObfuscatedName("ab.as")
    public int field822 = -1;

    @ObfuscatedName("ab.ag")
    public int field823 = -1;

    @ObfuscatedName("ab.ab")
    public boolean field824 = false;

    @ObfuscatedName("ab.aq")
    public boolean field825 = true;

    @ObfuscatedName("ab.af")
    public int field826 = 128;

    @ObfuscatedName("ab.ay")
    public int field827 = 128;

    @ObfuscatedName("ab.ax")
    public int field844 = 128;

    @ObfuscatedName("ab.aa")
    public int field829 = 0;

    @ObfuscatedName("ab.ak")
    public int field799 = 0;

    @ObfuscatedName("ab.ac")
    public int field831 = 0;

    @ObfuscatedName("ab.aj")
    public int field832 = 0;

    @ObfuscatedName("ab.av")
    public boolean field805 = false;

    @ObfuscatedName("ab.al")
    public boolean field834 = false;

    @ObfuscatedName("ab.an")
    public int field835 = -1;

    @ObfuscatedName("ab.ap")
    public int[] field828;

    @ObfuscatedName("ab.at")
    public int field837 = -1;

    @ObfuscatedName("ab.ae")
    public int field838 = -1;

    @ObfuscatedName("ab.aw")
    public int field840 = -1;

    @ObfuscatedName("ab.am")
    public int field843 = 0;

    @ObfuscatedName("ab.ar")
    public int field812 = 0;

    @ObfuscatedName("ab.ai")
    public int field842 = 0;

    @ObfuscatedName("ab.ao")
    public int[] field808;

    @ObfuscatedName("ag.a(II)Lab;")
    public static class32 method582(int arg0) {
        class32 var1 = (class32) field796.method3208((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field800.method2943(6, arg0);
        class32 var3 = new class32();
        var3.field801 = arg0;
        if (var2 != null) {
            var3.method585(new class126(var2));
        }
        var3.method584();
        if (var3.field834) {
            var3.field811 = 0;
            var3.field806 = false;
        }
        field796.method3210(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.r(I)V")
    public void method584() {
        if (this.field813 == -1) {
            this.field813 = 0;
            if (this.field836 != null && (this.field803 == null || this.field803[0] == 10)) {
                this.field813 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field821[var1] != null) {
                    this.field813 = 1;
                }
            }
        }
        if (this.field835 == -1) {
            this.field835 = this.field811 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ab.u(Ldf;I)V")
    public void method585(class126 arg0) {
        while (true) {
            int var2 = arg0.method2481();
            if (var2 == 0) {
                return;
            }
            this.method620(arg0, var2);
        }
    }

    @ObfuscatedName("ab.t(Ldf;II)V")
    public void method620(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2481();
            if (var3 > 0) {
                if (this.field836 == null || field795) {
                    this.field803 = new int[var3];
                    this.field836 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field836[var4] = arg0.method2373();
                        this.field803[var4] = arg0.method2481();
                    }
                } else {
                    arg0.field2016 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field804 = arg0.method2386();
        } else if (arg1 == 5) {
            int var5 = arg0.method2481();
            if (var5 > 0) {
                if (this.field836 == null || field795) {
                    this.field803 = null;
                    this.field836 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field836[var6] = arg0.method2373();
                    }
                } else {
                    arg0.field2016 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field809 = arg0.method2481();
        } else if (arg1 == 15) {
            this.field807 = arg0.method2481();
        } else if (arg1 == 17) {
            this.field811 = 0;
            this.field806 = false;
        } else if (arg1 == 18) {
            this.field806 = false;
        } else if (arg1 == 19) {
            this.field813 = arg0.method2481();
        } else if (arg1 == 21) {
            this.field814 = 0;
        } else if (arg1 == 22) {
            this.field815 = true;
        } else if (arg1 == 23) {
            this.field816 = true;
        } else if (arg1 == 24) {
            this.field833 = arg0.method2373();
            if (this.field833 == 65535) {
                this.field833 = -1;
            }
        } else if (arg1 == 27) {
            this.field811 = 1;
        } else if (arg1 == 28) {
            this.field818 = arg0.method2481();
        } else if (arg1 == 29) {
            this.field819 = arg0.method2379();
        } else if (arg1 == 39) {
            this.field839 = arg0.method2379() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field821[arg1 - 30] = arg0.method2386();
            if (this.field821[arg1 - 30].equalsIgnoreCase(class134.field2234)) {
                this.field821[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2481();
            this.field820 = new short[var7];
            this.field830 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field820[var8] = (short) arg0.method2373();
                this.field830[var8] = (short) arg0.method2373();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2481();
            this.field817 = new short[var9];
            this.field798 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field817[var10] = (short) arg0.method2373();
                this.field798[var10] = (short) arg0.method2373();
            }
        } else if (arg1 == 60) {
            this.field822 = arg0.method2373();
        } else if (arg1 == 62) {
            this.field824 = true;
        } else if (arg1 == 64) {
            this.field825 = false;
        } else if (arg1 == 65) {
            this.field826 = arg0.method2373();
        } else if (arg1 == 66) {
            this.field827 = arg0.method2373();
        } else if (arg1 == 67) {
            this.field844 = arg0.method2373();
        } else if (arg1 == 68) {
            this.field823 = arg0.method2373();
        } else if (arg1 == 69) {
            this.field832 = arg0.method2481();
        } else if (arg1 == 70) {
            this.field829 = arg0.method2381();
        } else if (arg1 == 71) {
            this.field799 = arg0.method2381();
        } else if (arg1 == 72) {
            this.field831 = arg0.method2381();
        } else if (arg1 == 73) {
            this.field805 = true;
        } else if (arg1 == 74) {
            this.field834 = true;
        } else if (arg1 == 75) {
            this.field835 = arg0.method2481();
        } else if (arg1 == 77) {
            this.field837 = arg0.method2373();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
            this.field838 = arg0.method2373();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            int var11 = arg0.method2481();
            this.field828 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field828[var12] = arg0.method2373();
                if (this.field828[var12] == 65535) {
                    this.field828[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field840 = arg0.method2373();
            this.field843 = arg0.method2481();
        } else if (arg1 == 79) {
            this.field812 = arg0.method2373();
            this.field842 = arg0.method2373();
            this.field843 = arg0.method2481();
            int var13 = arg0.method2481();
            this.field808 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field808[var14] = arg0.method2373();
            }
        } else if (arg1 == 81) {
            this.field814 = arg0.method2481() * 256;
        }
    }

    @ObfuscatedName("ab.k(II)Z")
    public final boolean method615(int arg0) {
        if (this.field803 != null) {
            for (int var4 = 0; var4 < this.field803.length; var4++) {
                if (this.field803[var4] == arg0) {
                    return Statics.field2023.method2945(this.field836[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field836 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field836.length; var3++) {
                var2 &= Statics.field2023.method2945(this.field836[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ab.x(I)Z")
    public final boolean method591() {
        if (this.field836 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field836.length; var2++) {
            var1 &= Statics.field2023.method2945(this.field836[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ab.v(II[[IIIII)Lcv;")
    public final class94 method589(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field803 == null) {
            var7 = (long) ((this.field801 << 10) + arg1);
        } else {
            var7 = (long) ((this.field801 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field810.method3208(var7);
        if (var9 == null) {
            class101 var10 = this.method592(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field815) {
                var10.field1679 = (short) (this.field819 + 64);
                var10.field1688 = (short) (this.field839 + 768);
                var10.method2052();
                var9 = var10;
            } else {
                var9 = var10.method2014(this.field819 + 64, this.field839 + 768, -50, -10, -50);
            }
            field810.method3210(var9, var7);
        }
        if (this.field815) {
            var9 = ((class101) var9).method1998();
        }
        if (this.field814 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2207(arg2, arg3, arg4, arg5, true, this.field814);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method1992(arg2, arg3, arg4, arg5, true, this.field814);
            }
        }
        return var9;
    }

    @ObfuscatedName("ab.g(II[[IIIIB)Ldw;")
    public final class112 method606(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field803 == null) {
            var7 = (long) ((this.field801 << 10) + arg1);
        } else {
            var7 = (long) ((this.field801 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field802.method3208(var7);
        if (var9 == null) {
            class101 var10 = this.method592(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2014(this.field819 + 64, this.field839 + 768, -50, -10, -50);
            field802.method3210(var9, var7);
        }
        if (this.field814 >= 0) {
            var9 = var9.method2207(arg2, arg3, arg4, arg5, true, this.field814);
        }
        return var9;
    }

    @ObfuscatedName("ab.n(II[[IIIILaf;II)Ldw;")
    public final class112 method583(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field803 == null) {
            var9 = (long) ((this.field801 << 10) + arg1);
        } else {
            var9 = (long) ((this.field801 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field802.method3208(var9);
        if (var11 == null) {
            class101 var12 = this.method592(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2014(this.field819 + 64, this.field839 + 768, -50, -10, -50);
            field802.method3210(var11, var9);
        }
        if (arg6 == null && this.field814 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2176(true);
        } else {
            var13 = arg6.method657(var11, arg7, arg1);
        }
        if (this.field814 >= 0) {
            var13 = var13.method2207(arg2, arg3, arg4, arg5, false, this.field814);
        }
        return var13;
    }

    @ObfuscatedName("ab.q(III)Lck;")
    public final class101 method592(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field803 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field836 == null) {
                return null;
            }
            boolean var4 = this.field824;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field836.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field836[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field797.method3208((long) var7);
                if (var3 == null) {
                    var3 = class101.method1993(Statics.field2023, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2008();
                    }
                    field797.method3210(var3, (long) var7);
                }
                if (var5 > 1) {
                    field794[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field794, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field803.length; var9++) {
                if (this.field803[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field836[var8];
            boolean var11 = this.field824 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field797.method3208((long) var10);
            if (var3 == null) {
                var3 = class101.method1993(Statics.field2023, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2008();
                }
                field797.method3210(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field826 == 128 && this.field827 == 128 && this.field844 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field829 == 0 && this.field799 == 0 && this.field831 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field820 == null, this.field817 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2033(256);
            var14.method2036(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2001();
        } else if (var15 == 2) {
            var14.method2002();
        } else if (var15 == 3) {
            var14.method2003();
        }
        if (this.field820 != null) {
            for (int var16 = 0; var16 < this.field820.length; var16++) {
                var14.method2006(this.field820[var16], this.field830[var16]);
            }
        }
        if (this.field817 != null) {
            for (int var17 = 0; var17 < this.field817.length; var17++) {
                var14.method2007(this.field817[var17], this.field798[var17]);
            }
        }
        if (var12) {
            var14.method2009(this.field826, this.field827, this.field844);
        }
        if (var13) {
            var14.method2036(this.field829, this.field799, this.field831);
        }
        return var14;
    }

    @ObfuscatedName("ab.i(B)Lab;")
    public final class32 method593() {
        int var1 = -1;
        if (this.field837 != -1) {
            var1 = class159.method2281(this.field837);
        } else if (this.field838 != -1) {
            var1 = class159.field2700[this.field838];
        }
        return var1 < 0 || var1 >= this.field828.length || this.field828[var1] == -1 ? null : method582(this.field828[var1]);
    }

    @ObfuscatedName("bo.p(I)V")
    public static void method1170() {
        field796.method3216();
        field797.method3216();
        field810.method3216();
        field802.method3216();
    }

    @ObfuscatedName("ab.e(I)Z")
    public boolean method633() {
        if (this.field828 == null) {
            return this.field840 != -1 || this.field808 != null;
        }
        for (int var1 = 0; var1 < this.field828.length; var1++) {
            if (this.field828[var1] != -1) {
                class32 var2 = method582(this.field828[var1]);
                if (var2.field840 != -1 || var2.field808 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
