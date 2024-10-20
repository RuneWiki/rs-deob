package deob;

@ObfuscatedName("ae")
public class class32 extends class174 {

    @ObfuscatedName("ae.y")
    public static boolean field846 = false;

    @ObfuscatedName("ae.k")
    public static class170 field805 = new class170(64);

    @ObfuscatedName("ae.n")
    public static class170 field799 = new class170(500);

    @ObfuscatedName("ae.s")
    public static class170 field818 = new class170(30);

    @ObfuscatedName("ae.x")
    public static class170 field801 = new class170(30);

    @ObfuscatedName("ae.b")
    public static class101[] field824 = new class101[4];

    @ObfuscatedName("ae.j")
    public int field803;

    @ObfuscatedName("ae.p")
    public int[] field804;

    @ObfuscatedName("ae.l")
    public int[] field798;

    @ObfuscatedName("ae.i")
    public String field806 = "null";

    @ObfuscatedName("ae.r")
    public short[] field821;

    @ObfuscatedName("ae.o")
    public short[] field800;

    @ObfuscatedName("ae.c")
    public short[] field809;

    @ObfuscatedName("ae.f")
    public short[] field810;

    @ObfuscatedName("ae.a")
    public int field811 = 1;

    @ObfuscatedName("ae.t")
    public int field812 = 1;

    @ObfuscatedName("ae.u")
    public int field831 = 2;

    @ObfuscatedName("ae.z")
    public boolean field802 = true;

    @ObfuscatedName("ae.v")
    public int field815 = -1;

    @ObfuscatedName("ae.w")
    public int field834 = -1;

    @ObfuscatedName("ae.h")
    public boolean field817 = false;

    @ObfuscatedName("ae.q")
    public boolean field797 = false;

    @ObfuscatedName("ae.g")
    public int field816 = -1;

    @ObfuscatedName("ae.e")
    public int field814 = 16;

    @ObfuscatedName("ae.as")
    public int field827 = 0;

    @ObfuscatedName("ae.an")
    public int field822 = 0;

    @ObfuscatedName("ae.aj")
    public String[] field823 = new String[5];

    @ObfuscatedName("ae.ax")
    public int field836 = -1;

    @ObfuscatedName("ae.av")
    public int field825 = -1;

    @ObfuscatedName("ae.ae")
    public boolean field826 = false;

    @ObfuscatedName("ae.am")
    public boolean field820 = true;

    @ObfuscatedName("ae.aq")
    public int field828 = 128;

    @ObfuscatedName("ae.at")
    public int field829 = 128;

    @ObfuscatedName("ae.ac")
    public int field830 = 128;

    @ObfuscatedName("ae.al")
    public int field819 = 0;

    @ObfuscatedName("ae.ab")
    public int field832 = 0;

    @ObfuscatedName("ae.aa")
    public int field833 = 0;

    @ObfuscatedName("ae.ao")
    public int field813 = 0;

    @ObfuscatedName("ae.ah")
    public boolean field835 = false;

    @ObfuscatedName("ae.au")
    public boolean field807 = false;

    @ObfuscatedName("ae.aw")
    public int field837 = -1;

    @ObfuscatedName("ae.az")
    public int[] field838;

    @ObfuscatedName("ae.af")
    public int field839 = -1;

    @ObfuscatedName("ae.ap")
    public int field840 = -1;

    @ObfuscatedName("ae.ak")
    public int field841 = -1;

    @ObfuscatedName("ae.ad")
    public int field842 = 0;

    @ObfuscatedName("ae.ag")
    public int field843 = 0;

    @ObfuscatedName("ae.ay")
    public int field844 = 0;

    @ObfuscatedName("ae.ai")
    public int[] field808;

    @ObfuscatedName("g.y(IB)Lae;")
    public static class32 method211(int arg0) {
        class32 var1 = (class32) field805.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2441.method2991(6, arg0);
        class32 var3 = new class32();
        var3.field803 = arg0;
        if (var2 != null) {
            var3.method634(new class127(var2));
        }
        var3.method633();
        if (var3.field807) {
            var3.field831 = 0;
            var3.field802 = false;
        }
        field805.method3291(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.m(B)V")
    public void method633() {
        if (this.field815 == -1) {
            this.field815 = 0;
            if (this.field804 != null && (this.field798 == null || this.field798[0] == 10)) {
                this.field815 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field823[var1] != null) {
                    this.field815 = 1;
                }
            }
        }
        if (this.field837 == -1) {
            this.field837 = this.field831 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.d(Ldp;B)V")
    public void method634(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method635(arg0, var2);
        }
    }

    @ObfuscatedName("ae.k(Ldp;II)V")
    public void method635(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2534();
            if (var3 > 0) {
                if (this.field804 == null || field846) {
                    this.field798 = new int[var3];
                    this.field804 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field804[var4] = arg0.method2460();
                        this.field798[var4] = arg0.method2534();
                    }
                } else {
                    arg0.field2036 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field806 = arg0.method2466();
        } else if (arg1 == 5) {
            int var5 = arg0.method2534();
            if (var5 > 0) {
                if (this.field804 == null || field846) {
                    this.field798 = null;
                    this.field804 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field804[var6] = arg0.method2460();
                    }
                } else {
                    arg0.field2036 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field811 = arg0.method2534();
        } else if (arg1 == 15) {
            this.field812 = arg0.method2534();
        } else if (arg1 == 17) {
            this.field831 = 0;
            this.field802 = false;
        } else if (arg1 == 18) {
            this.field802 = false;
        } else if (arg1 == 19) {
            this.field815 = arg0.method2534();
        } else if (arg1 == 21) {
            this.field834 = 0;
        } else if (arg1 == 22) {
            this.field817 = true;
        } else if (arg1 == 23) {
            this.field797 = true;
        } else if (arg1 == 24) {
            this.field816 = arg0.method2460();
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
        } else if (arg1 == 27) {
            this.field831 = 1;
        } else if (arg1 == 28) {
            this.field814 = arg0.method2534();
        } else if (arg1 == 29) {
            this.field827 = arg0.method2459();
        } else if (arg1 == 39) {
            this.field822 = arg0.method2459() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field823[arg1 - 30] = arg0.method2466();
            if (this.field823[arg1 - 30].equalsIgnoreCase(class134.field2083)) {
                this.field823[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2534();
            this.field821 = new short[var7];
            this.field800 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field821[var8] = (short) arg0.method2460();
                this.field800[var8] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2534();
            this.field809 = new short[var9];
            this.field810 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field809[var10] = (short) arg0.method2460();
                this.field810[var10] = (short) arg0.method2460();
            }
        } else if (arg1 == 60) {
            this.field836 = arg0.method2460();
        } else if (arg1 == 62) {
            this.field826 = true;
        } else if (arg1 == 64) {
            this.field820 = false;
        } else if (arg1 == 65) {
            this.field828 = arg0.method2460();
        } else if (arg1 == 66) {
            this.field829 = arg0.method2460();
        } else if (arg1 == 67) {
            this.field830 = arg0.method2460();
        } else if (arg1 == 68) {
            this.field825 = arg0.method2460();
        } else if (arg1 == 69) {
            this.field813 = arg0.method2534();
        } else if (arg1 == 70) {
            this.field819 = arg0.method2461();
        } else if (arg1 == 71) {
            this.field832 = arg0.method2461();
        } else if (arg1 == 72) {
            this.field833 = arg0.method2461();
        } else if (arg1 == 73) {
            this.field835 = true;
        } else if (arg1 == 74) {
            this.field807 = true;
        } else if (arg1 == 75) {
            this.field837 = arg0.method2534();
        } else if (arg1 == 77) {
            this.field839 = arg0.method2460();
            if (this.field839 == 65535) {
                this.field839 = -1;
            }
            this.field840 = arg0.method2460();
            if (this.field840 == 65535) {
                this.field840 = -1;
            }
            int var11 = arg0.method2534();
            this.field838 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field838[var12] = arg0.method2460();
                if (this.field838[var12] == 65535) {
                    this.field838[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field841 = arg0.method2460();
            this.field842 = arg0.method2534();
        } else if (arg1 == 79) {
            this.field843 = arg0.method2460();
            this.field844 = arg0.method2460();
            this.field842 = arg0.method2534();
            int var13 = arg0.method2534();
            this.field808 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field808[var14] = arg0.method2460();
            }
        } else if (arg1 == 81) {
            this.field834 = arg0.method2534() * 256;
        }
    }

    @ObfuscatedName("ae.n(II)Z")
    public final boolean method636(int arg0) {
        if (this.field798 != null) {
            for (int var4 = 0; var4 < this.field798.length; var4++) {
                if (this.field798[var4] == arg0) {
                    return Statics.field2455.method2993(this.field804[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field804 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field804.length; var3++) {
                var2 &= Statics.field2455.method2993(this.field804[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.s(I)Z")
    public final boolean method637() {
        if (this.field804 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field804.length; var2++) {
            var1 &= Statics.field2455.method2993(this.field804[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.x(II[[IIIII)Lcg;")
    public final class94 method638(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field798 == null) {
            var7 = (long) ((this.field803 << 10) + arg1);
        } else {
            var7 = (long) ((this.field803 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field818.method3288(var7);
        if (var9 == null) {
            class101 var10 = this.method683(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field817) {
                var10.field1703 = (short) (this.field827 + 64);
                var10.field1704 = (short) (this.field822 + 768);
                var10.method2077();
                var9 = var10;
            } else {
                var9 = var10.method2081(this.field827 + 64, this.field822 + 768, -50, -10, -50);
            }
            field818.method3291(var9, var7);
        }
        if (this.field817) {
            var9 = ((class101) var9).method2065();
        }
        if (this.field834 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2255(arg2, arg3, arg4, arg5, true, this.field834);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2066(arg2, arg3, arg4, arg5, true, this.field834);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.b(II[[IIIII)Ldw;")
    public final class112 method653(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field798 == null) {
            var7 = (long) ((this.field803 << 10) + arg1);
        } else {
            var7 = (long) ((this.field803 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field801.method3288(var7);
        if (var9 == null) {
            class101 var10 = this.method683(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2081(this.field827 + 64, this.field822 + 768, -50, -10, -50);
            field801.method3291(var9, var7);
        }
        if (this.field834 >= 0) {
            var9 = var9.method2255(arg2, arg3, arg4, arg5, true, this.field834);
        }
        return var9;
    }

    @ObfuscatedName("ae.j(II[[IIIILaq;II)Ldw;")
    public final class112 method639(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field798 == null) {
            var9 = (long) ((this.field803 << 10) + arg1);
        } else {
            var9 = (long) ((this.field803 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field801.method3288(var9);
        if (var11 == null) {
            class101 var12 = this.method683(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2081(this.field827 + 64, this.field822 + 768, -50, -10, -50);
            field801.method3291(var11, var9);
        }
        if (arg6 == null && this.field834 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2266(true);
        } else {
            var13 = arg6.method713(var11, arg7, arg1);
        }
        if (this.field834 >= 0) {
            var13 = var13.method2255(arg2, arg3, arg4, arg5, false, this.field834);
        }
        return var13;
    }

    @ObfuscatedName("ae.p(III)Lcq;")
    public final class101 method683(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field798 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field804 == null) {
                return null;
            }
            boolean var4 = this.field826;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field804.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field804[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field799.method3288((long) var7);
                if (var3 == null) {
                    var3 = class101.method2060(Statics.field2455, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2075();
                    }
                    field799.method3291(var3, (long) var7);
                }
                if (var5 > 1) {
                    field824[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field824, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field798.length; var9++) {
                if (this.field798[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field804[var8];
            boolean var11 = this.field826 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field799.method3288((long) var10);
            if (var3 == null) {
                var3 = class101.method2060(Statics.field2455, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2075();
                }
                field799.method3291(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field828 == 128 && this.field829 == 128 && this.field830 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field819 == 0 && this.field832 == 0 && this.field833 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field821 == null, this.field809 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2086(256);
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
        if (this.field821 != null) {
            for (int var16 = 0; var16 < this.field821.length; var16++) {
                var14.method2108(this.field821[var16], this.field800[var16]);
            }
        }
        if (this.field809 != null) {
            for (int var17 = 0; var17 < this.field809.length; var17++) {
                var14.method2073(this.field809[var17], this.field810[var17]);
            }
        }
        if (var12) {
            var14.method2112(this.field828, this.field829, this.field830);
        }
        if (var13) {
            var14.method2072(this.field819, this.field832, this.field833);
        }
        return var14;
    }

    @ObfuscatedName("ae.l(B)Lae;")
    public final class32 method684() {
        int var1 = -1;
        if (this.field839 != -1) {
            var1 = class159.method2974(this.field839);
        } else if (this.field840 != -1) {
            var1 = class159.field2705[this.field840];
        }
        return var1 < 0 || var1 >= this.field838.length || this.field838[var1] == -1 ? null : method211(this.field838[var1]);
    }

    @ObfuscatedName("ax.i(I)V")
    public static void method563() {
        field805.method3297();
        field799.method3297();
        field818.method3297();
        field801.method3297();
    }

    @ObfuscatedName("ae.r(B)Z")
    public boolean method671() {
        if (this.field838 == null) {
            return this.field841 != -1 || this.field808 != null;
        }
        for (int var1 = 0; var1 < this.field838.length; var1++) {
            if (this.field838[var1] != -1) {
                class32 var2 = method211(this.field838[var1]);
                if (var2.field841 != -1 || var2.field808 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
