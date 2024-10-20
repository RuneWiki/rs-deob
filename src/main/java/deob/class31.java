package deob;

@ObfuscatedName("aa")
public class class31 extends class173 {

    @ObfuscatedName("aa.v")
    public static boolean field843 = false;

    @ObfuscatedName("aa.c")
    public static class169 field796 = new class169(64);

    @ObfuscatedName("aa.r")
    public static class169 field822 = new class169(500);

    @ObfuscatedName("aa.k")
    public static class169 field798 = new class169(30);

    @ObfuscatedName("aa.e")
    public static class169 field814 = new class169(30);

    @ObfuscatedName("aa.q")
    public static class100[] field800 = new class100[4];

    @ObfuscatedName("aa.u")
    public int field826;

    @ObfuscatedName("aa.s")
    public int[] field802;

    @ObfuscatedName("aa.l")
    public int[] field803;

    @ObfuscatedName("aa.o")
    public String field804 = "null";

    @ObfuscatedName("aa.h")
    public short[] field805;

    @ObfuscatedName("aa.p")
    public short[] field840;

    @ObfuscatedName("aa.d")
    public short[] field807;

    @ObfuscatedName("aa.m")
    public short[] field808;

    @ObfuscatedName("aa.z")
    public int field809 = 1;

    @ObfuscatedName("aa.t")
    public int field810 = 1;

    @ObfuscatedName("aa.i")
    public int field811 = 2;

    @ObfuscatedName("aa.j")
    public boolean field812 = true;

    @ObfuscatedName("aa.a")
    public int field818 = -1;

    @ObfuscatedName("aa.g")
    public int field838 = -1;

    @ObfuscatedName("aa.x")
    public boolean field815 = false;

    @ObfuscatedName("aa.b")
    public boolean field816 = false;

    @ObfuscatedName("aa.w")
    public int field817 = -1;

    @ObfuscatedName("aa.y")
    public int field806 = 16;

    @ObfuscatedName("aa.au")
    public int field819 = 0;

    @ObfuscatedName("aa.az")
    public int field820 = 0;

    @ObfuscatedName("aa.ak")
    public String[] field821 = new String[5];

    @ObfuscatedName("aa.ah")
    public int field839 = -1;

    @ObfuscatedName("aa.aa")
    public int field823 = -1;

    @ObfuscatedName("aa.am")
    public boolean field824 = false;

    @ObfuscatedName("aa.al")
    public boolean field829 = true;

    @ObfuscatedName("aa.ae")
    public int field801 = 128;

    @ObfuscatedName("aa.ab")
    public int field827 = 128;

    @ObfuscatedName("aa.as")
    public int field834 = 128;

    @ObfuscatedName("aa.ai")
    public int field836 = 0;

    @ObfuscatedName("aa.aj")
    public int field830 = 0;

    @ObfuscatedName("aa.an")
    public int field831 = 0;

    @ObfuscatedName("aa.av")
    public int field832 = 0;

    @ObfuscatedName("aa.af")
    public boolean field833 = false;

    @ObfuscatedName("aa.ax")
    public boolean field799 = false;

    @ObfuscatedName("aa.ao")
    public int field835 = -1;

    @ObfuscatedName("aa.aw")
    public int[] field794;

    @ObfuscatedName("aa.ap")
    public int field837 = -1;

    @ObfuscatedName("aa.ay")
    public int field793 = -1;

    @ObfuscatedName("aa.ag")
    public int field825 = -1;

    @ObfuscatedName("aa.ar")
    public int field828 = 0;

    @ObfuscatedName("aa.aq")
    public int field841 = 0;

    @ObfuscatedName("aa.ac")
    public int field842 = 0;

    @ObfuscatedName("aa.at")
    public int[] field795;

    @ObfuscatedName("a.v(II)Laa;")
    public static class31 method195(int arg0) {
        class31 var1 = (class31) field796.method3224((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field797.method3020(6, arg0);
        class31 var3 = new class31();
        var3.field826 = arg0;
        if (var2 != null) {
            var3.method640(new class126(var2));
        }
        var3.method639();
        if (var3.field799) {
            var3.field811 = 0;
            var3.field812 = false;
        }
        field796.method3231(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.f(I)V")
    public void method639() {
        if (this.field818 == -1) {
            this.field818 = 0;
            if (this.field802 != null && (this.field803 == null || this.field803[0] == 10)) {
                this.field818 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field821[var1] != null) {
                    this.field818 = 1;
                }
            }
        }
        if (this.field835 == -1) {
            this.field835 = this.field811 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aa.n(Ldr;B)V")
    public void method640(class126 arg0) {
        while (true) {
            int var2 = arg0.method2466();
            if (var2 == 0) {
                return;
            }
            this.method641(arg0, var2);
        }
    }

    @ObfuscatedName("aa.c(Ldr;II)V")
    public void method641(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2466();
            if (var3 > 0) {
                if (this.field802 == null || field843) {
                    this.field803 = new int[var3];
                    this.field802 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field802[var4] = arg0.method2468();
                        this.field803[var4] = arg0.method2466();
                    }
                } else {
                    arg0.field2027 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field804 = arg0.method2462();
        } else if (arg1 == 5) {
            int var5 = arg0.method2466();
            if (var5 > 0) {
                if (this.field802 == null || field843) {
                    this.field803 = null;
                    this.field802 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field802[var6] = arg0.method2468();
                    }
                } else {
                    arg0.field2027 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field809 = arg0.method2466();
        } else if (arg1 == 15) {
            this.field810 = arg0.method2466();
        } else if (arg1 == 17) {
            this.field811 = 0;
            this.field812 = false;
        } else if (arg1 == 18) {
            this.field812 = false;
        } else if (arg1 == 19) {
            this.field818 = arg0.method2466();
        } else if (arg1 == 21) {
            this.field838 = 0;
        } else if (arg1 == 22) {
            this.field815 = true;
        } else if (arg1 == 23) {
            this.field816 = true;
        } else if (arg1 == 24) {
            this.field817 = arg0.method2468();
            if (this.field817 == 65535) {
                this.field817 = -1;
            }
        } else if (arg1 == 27) {
            this.field811 = 1;
        } else if (arg1 == 28) {
            this.field806 = arg0.method2466();
        } else if (arg1 == 29) {
            this.field819 = arg0.method2499();
        } else if (arg1 == 39) {
            this.field820 = arg0.method2499() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field821[arg1 - 30] = arg0.method2462();
            if (this.field821[arg1 - 30].equalsIgnoreCase(class133.field2069)) {
                this.field821[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2466();
            this.field805 = new short[var7];
            this.field840 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field805[var8] = (short) arg0.method2468();
                this.field840[var8] = (short) arg0.method2468();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2466();
            this.field807 = new short[var9];
            this.field808 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field807[var10] = (short) arg0.method2468();
                this.field808[var10] = (short) arg0.method2468();
            }
        } else if (arg1 == 60) {
            this.field839 = arg0.method2468();
        } else if (arg1 == 62) {
            this.field824 = true;
        } else if (arg1 == 64) {
            this.field829 = false;
        } else if (arg1 == 65) {
            this.field801 = arg0.method2468();
        } else if (arg1 == 66) {
            this.field827 = arg0.method2468();
        } else if (arg1 == 67) {
            this.field834 = arg0.method2468();
        } else if (arg1 == 68) {
            this.field823 = arg0.method2468();
        } else if (arg1 == 69) {
            this.field832 = arg0.method2466();
        } else if (arg1 == 70) {
            this.field836 = arg0.method2469();
        } else if (arg1 == 71) {
            this.field830 = arg0.method2469();
        } else if (arg1 == 72) {
            this.field831 = arg0.method2469();
        } else if (arg1 == 73) {
            this.field833 = true;
        } else if (arg1 == 74) {
            this.field799 = true;
        } else if (arg1 == 75) {
            this.field835 = arg0.method2466();
        } else if (arg1 == 77) {
            this.field837 = arg0.method2468();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
            this.field793 = arg0.method2468();
            if (this.field793 == 65535) {
                this.field793 = -1;
            }
            int var11 = arg0.method2466();
            this.field794 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field794[var12] = arg0.method2468();
                if (this.field794[var12] == 65535) {
                    this.field794[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field825 = arg0.method2468();
            this.field828 = arg0.method2466();
        } else if (arg1 == 79) {
            this.field841 = arg0.method2468();
            this.field842 = arg0.method2468();
            this.field828 = arg0.method2466();
            int var13 = arg0.method2466();
            this.field795 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field795[var14] = arg0.method2468();
            }
        } else if (arg1 == 81) {
            this.field838 = arg0.method2466() * 256;
        }
    }

    @ObfuscatedName("aa.r(II)Z")
    public final boolean method642(int arg0) {
        if (this.field803 != null) {
            for (int var4 = 0; var4 < this.field803.length; var4++) {
                if (this.field803[var4] == arg0) {
                    return Statics.field813.method2993(this.field802[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field802 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field802.length; var3++) {
                var2 &= Statics.field813.method2993(this.field802[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aa.k(I)Z")
    public final boolean method643() {
        if (this.field802 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field802.length; var2++) {
            var1 &= Statics.field813.method2993(this.field802[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aa.e(II[[IIIIB)Lcf;")
    public final class93 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field803 == null) {
            var7 = (long) ((this.field826 << 10) + arg1);
        } else {
            var7 = (long) ((this.field826 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field798.method3224(var7);
        if (var9 == null) {
            class100 var10 = this.method674(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field815) {
                var10.field1699 = (short) (this.field819 + 64);
                var10.field1700 = (short) (this.field820 + 768);
                var10.method2076();
                var9 = var10;
            } else {
                var9 = var10.method2080(this.field819 + 64, this.field820 + 768, -50, -10, -50);
            }
            field798.method3231(var9, var7);
        }
        if (this.field815) {
            var9 = ((class100) var9).method2065();
        }
        if (this.field838 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2249(arg2, arg3, arg4, arg5, true, this.field838);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2066(arg2, arg3, arg4, arg5, true, this.field838);
            }
        }
        return var9;
    }

    @ObfuscatedName("aa.q(II[[IIIIB)Ldf;")
    public final class111 method664(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field803 == null) {
            var7 = (long) ((this.field826 << 10) + arg1);
        } else {
            var7 = (long) ((this.field826 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field814.method3224(var7);
        if (var9 == null) {
            class100 var10 = this.method674(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2080(this.field819 + 64, this.field820 + 768, -50, -10, -50);
            field814.method3231(var9, var7);
        }
        if (this.field838 >= 0) {
            var9 = var9.method2249(arg2, arg3, arg4, arg5, true, this.field838);
        }
        return var9;
    }

    @ObfuscatedName("aa.u(II[[IIIILal;II)Ldf;")
    public final class111 method654(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field803 == null) {
            var9 = (long) ((this.field826 << 10) + arg1);
        } else {
            var9 = (long) ((this.field826 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field814.method3224(var9);
        if (var11 == null) {
            class100 var12 = this.method674(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2080(this.field819 + 64, this.field820 + 768, -50, -10, -50);
            field814.method3231(var11, var9);
        }
        if (arg6 == null && this.field838 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2276(true);
        } else {
            var13 = arg6.method707(var11, arg7, arg1);
        }
        if (this.field838 >= 0) {
            var13 = var13.method2249(arg2, arg3, arg4, arg5, false, this.field838);
        }
        return var13;
    }

    @ObfuscatedName("aa.s(IIB)Lcw;")
    public final class100 method674(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field803 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field802 == null) {
                return null;
            }
            boolean var4 = this.field824;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field802.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field802[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field822.method3224((long) var7);
                if (var3 == null) {
                    var3 = class100.method2060(Statics.field813, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2074();
                    }
                    field822.method3231(var3, (long) var7);
                }
                if (var5 > 1) {
                    field800[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field800, var5);
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
            int var10 = this.field802[var8];
            boolean var11 = this.field824 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field822.method3224((long) var10);
            if (var3 == null) {
                var3 = class100.method2060(Statics.field813, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2074();
                }
                field822.method3231(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field801 == 128 && this.field827 == 128 && this.field834 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field836 == 0 && this.field830 == 0 && this.field831 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field805 == null, this.field807 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2071(256);
            var14.method2072(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2068();
        } else if (var15 == 2) {
            var14.method2069();
        } else if (var15 == 3) {
            var14.method2070();
        }
        if (this.field805 != null) {
            for (int var16 = 0; var16 < this.field805.length; var16++) {
                var14.method2082(this.field805[var16], this.field840[var16]);
            }
        }
        if (this.field807 != null) {
            for (int var17 = 0; var17 < this.field807.length; var17++) {
                var14.method2101(this.field807[var17], this.field808[var17]);
            }
        }
        if (var12) {
            var14.method2083(this.field801, this.field827, this.field834);
        }
        if (var13) {
            var14.method2072(this.field836, this.field830, this.field831);
        }
        return var14;
    }

    @ObfuscatedName("aa.l(I)Laa;")
    public final class31 method648() {
        int var1 = -1;
        if (this.field837 != -1) {
            var1 = class158.method2233(this.field837);
        } else if (this.field793 != -1) {
            var1 = class158.field2693[this.field793];
        }
        return var1 < 0 || var1 >= this.field794.length || this.field794[var1] == -1 ? null : method195(this.field794[var1]);
    }

    @ObfuscatedName("du.o(I)V")
    public static void method2396() {
        field796.method3227();
        field822.method3227();
        field798.method3227();
        field814.method3227();
    }

    @ObfuscatedName("aa.h(I)Z")
    public boolean method673() {
        if (this.field794 == null) {
            return this.field825 != -1 || this.field795 != null;
        }
        for (int var1 = 0; var1 < this.field794.length; var1++) {
            if (this.field794[var1] != -1) {
                class31 var2 = method195(this.field794[var1]);
                if (var2.field825 != -1 || var2.field795 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
