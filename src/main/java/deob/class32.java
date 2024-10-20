package deob;

@ObfuscatedName("av")
public class class32 extends class174 {

    @ObfuscatedName("av.g")
    public static boolean field840 = false;

    @ObfuscatedName("av.r")
    public static class170 field853 = new class170(64);

    @ObfuscatedName("av.n")
    public static class170 field807 = new class170(500);

    @ObfuscatedName("av.i")
    public static class170 field808 = new class170(30);

    @ObfuscatedName("av.s")
    public static class170 field809 = new class170(30);

    @ObfuscatedName("av.w")
    public static class101[] field803 = new class101[4];

    @ObfuscatedName("av.d")
    public int field804;

    @ObfuscatedName("av.t")
    public int[] field812;

    @ObfuscatedName("av.f")
    public int[] field811;

    @ObfuscatedName("av.b")
    public String field814 = "null";

    @ObfuscatedName("av.z")
    public short[] field815;

    @ObfuscatedName("av.l")
    public short[] field843;

    @ObfuscatedName("av.e")
    public short[] field817;

    @ObfuscatedName("av.p")
    public short[] field818;

    @ObfuscatedName("av.o")
    public int field819 = 1;

    @ObfuscatedName("av.h")
    public int field821 = 1;

    @ObfuscatedName("av.j")
    public int field833 = 2;

    @ObfuscatedName("av.x")
    public boolean field822 = true;

    @ObfuscatedName("av.k")
    public int field823 = -1;

    @ObfuscatedName("av.a")
    public int field827 = -1;

    @ObfuscatedName("av.y")
    public boolean field825 = false;

    @ObfuscatedName("av.q")
    public boolean field813 = false;

    @ObfuscatedName("av.c")
    public int field806 = -1;

    @ObfuscatedName("av.u")
    public int field828 = 16;

    @ObfuscatedName("av.ah")
    public int field816 = 0;

    @ObfuscatedName("av.az")
    public int field830 = 0;

    @ObfuscatedName("av.au")
    public String[] field831 = new String[5];

    @ObfuscatedName("av.ae")
    public int field832 = -1;

    @ObfuscatedName("av.aa")
    public int field839 = -1;

    @ObfuscatedName("av.av")
    public boolean field834 = false;

    @ObfuscatedName("av.aq")
    public boolean field835 = true;

    @ObfuscatedName("av.ak")
    public int field836 = 128;

    @ObfuscatedName("av.ad")
    public int field837 = 128;

    @ObfuscatedName("av.at")
    public int field838 = 128;

    @ObfuscatedName("av.an")
    public int field852 = 0;

    @ObfuscatedName("av.aw")
    public int field848 = 0;

    @ObfuscatedName("av.am")
    public int field820 = 0;

    @ObfuscatedName("av.af")
    public int field842 = 0;

    @ObfuscatedName("av.as")
    public boolean field855 = false;

    @ObfuscatedName("av.ao")
    public boolean field844 = false;

    @ObfuscatedName("av.ab")
    public int field845 = -1;

    @ObfuscatedName("av.ay")
    public int[] field846;

    @ObfuscatedName("av.ar")
    public int field847 = -1;

    @ObfuscatedName("av.aj")
    public int field829 = -1;

    @ObfuscatedName("av.ai")
    public int field824 = -1;

    @ObfuscatedName("av.ax")
    public int field850 = 0;

    @ObfuscatedName("av.al")
    public int field851 = 0;

    @ObfuscatedName("av.ag")
    public int field849 = 0;

    @ObfuscatedName("av.ap")
    public int[] field810;

    @ObfuscatedName("ej.g(Leo;Leo;ZI)V")
    public static void method2658(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field841 = arg0;
        Statics.field805 = arg1;
        field840 = arg2;
    }

    @ObfuscatedName("w.m(II)Lav;")
    public static class32 method54(int arg0) {
        class32 var1 = (class32) field853.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field841.method2968(6, arg0);
        class32 var3 = new class32();
        var3.field804 = arg0;
        if (var2 != null) {
            var3.method649(new class127(var2));
        }
        var3.method629();
        if (var3.field844) {
            var3.field833 = 0;
            var3.field822 = false;
        }
        field853.method3249(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.v(I)V")
    public void method629() {
        if (this.field823 == -1) {
            this.field823 = 0;
            if (this.field812 != null && (this.field811 == null || this.field811[0] == 10)) {
                this.field823 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field831[var1] != null) {
                    this.field823 = 1;
                }
            }
        }
        if (this.field845 == -1) {
            this.field845 = this.field833 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.r(Ldr;B)V")
    public void method649(class127 arg0) {
        while (true) {
            int var2 = arg0.method2414();
            if (var2 == 0) {
                return;
            }
            this.method631(arg0, var2);
        }
    }

    @ObfuscatedName("av.n(Ldr;IS)V")
    public void method631(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2414();
            if (var3 > 0) {
                if (this.field812 == null || field840) {
                    this.field811 = new int[var3];
                    this.field812 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field812[var4] = arg0.method2416();
                        this.field811[var4] = arg0.method2414();
                    }
                } else {
                    arg0.field2023 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field814 = arg0.method2422();
        } else if (arg1 == 5) {
            int var5 = arg0.method2414();
            if (var5 > 0) {
                if (this.field812 == null || field840) {
                    this.field811 = null;
                    this.field812 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field812[var6] = arg0.method2416();
                    }
                } else {
                    arg0.field2023 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field819 = arg0.method2414();
        } else if (arg1 == 15) {
            this.field821 = arg0.method2414();
        } else if (arg1 == 17) {
            this.field833 = 0;
            this.field822 = false;
        } else if (arg1 == 18) {
            this.field822 = false;
        } else if (arg1 == 19) {
            this.field823 = arg0.method2414();
        } else if (arg1 == 21) {
            this.field827 = 0;
        } else if (arg1 == 22) {
            this.field825 = true;
        } else if (arg1 == 23) {
            this.field813 = true;
        } else if (arg1 == 24) {
            this.field806 = arg0.method2416();
            if (this.field806 == 65535) {
                this.field806 = -1;
            }
        } else if (arg1 == 27) {
            this.field833 = 1;
        } else if (arg1 == 28) {
            this.field828 = arg0.method2414();
        } else if (arg1 == 29) {
            this.field816 = arg0.method2415();
        } else if (arg1 == 39) {
            this.field830 = arg0.method2415() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field831[arg1 - 30] = arg0.method2422();
            if (this.field831[arg1 - 30].equalsIgnoreCase(class134.field2070)) {
                this.field831[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2414();
            this.field815 = new short[var7];
            this.field843 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field815[var8] = (short) arg0.method2416();
                this.field843[var8] = (short) arg0.method2416();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2414();
            this.field817 = new short[var9];
            this.field818 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field817[var10] = (short) arg0.method2416();
                this.field818[var10] = (short) arg0.method2416();
            }
        } else if (arg1 == 60) {
            this.field832 = arg0.method2416();
        } else if (arg1 == 62) {
            this.field834 = true;
        } else if (arg1 == 64) {
            this.field835 = false;
        } else if (arg1 == 65) {
            this.field836 = arg0.method2416();
        } else if (arg1 == 66) {
            this.field837 = arg0.method2416();
        } else if (arg1 == 67) {
            this.field838 = arg0.method2416();
        } else if (arg1 == 68) {
            this.field839 = arg0.method2416();
        } else if (arg1 == 69) {
            this.field842 = arg0.method2414();
        } else if (arg1 == 70) {
            this.field852 = arg0.method2480();
        } else if (arg1 == 71) {
            this.field848 = arg0.method2480();
        } else if (arg1 == 72) {
            this.field820 = arg0.method2480();
        } else if (arg1 == 73) {
            this.field855 = true;
        } else if (arg1 == 74) {
            this.field844 = true;
        } else if (arg1 == 75) {
            this.field845 = arg0.method2414();
        } else if (arg1 == 77) {
            this.field847 = arg0.method2416();
            if (this.field847 == 65535) {
                this.field847 = -1;
            }
            this.field829 = arg0.method2416();
            if (this.field829 == 65535) {
                this.field829 = -1;
            }
            int var11 = arg0.method2414();
            this.field846 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field846[var12] = arg0.method2416();
                if (this.field846[var12] == 65535) {
                    this.field846[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field824 = arg0.method2416();
            this.field850 = arg0.method2414();
        } else if (arg1 == 79) {
            this.field851 = arg0.method2416();
            this.field849 = arg0.method2416();
            this.field850 = arg0.method2414();
            int var13 = arg0.method2414();
            this.field810 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field810[var14] = arg0.method2416();
            }
        } else if (arg1 == 81) {
            this.field827 = arg0.method2414() * 256;
        }
    }

    @ObfuscatedName("av.i(II)Z")
    public final boolean method632(int arg0) {
        if (this.field811 != null) {
            for (int var4 = 0; var4 < this.field811.length; var4++) {
                if (this.field811[var4] == arg0) {
                    return Statics.field805.method2970(this.field812[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field812 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field812.length; var3++) {
                var2 &= Statics.field805.method2970(this.field812[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.s(I)Z")
    public final boolean method633() {
        if (this.field812 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field812.length; var2++) {
            var1 &= Statics.field805.method2970(this.field812[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.w(II[[IIIII)Lcy;")
    public final class94 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field811 == null) {
            var7 = (long) ((this.field804 << 10) + arg1);
        } else {
            var7 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field808.method3245(var7);
        if (var9 == null) {
            class101 var10 = this.method679(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field825) {
                var10.field1700 = (short) (this.field816 + 64);
                var10.field1713 = (short) (this.field830 + 768);
                var10.method2035();
                var9 = var10;
            } else {
                var9 = var10.method2039(this.field816 + 64, this.field830 + 768, -50, -10, -50);
            }
            field808.method3249(var9, var7);
        }
        if (this.field825) {
            var9 = ((class101) var9).method2024();
        }
        if (this.field827 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2203(arg2, arg3, arg4, arg5, true, this.field827);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2036(arg2, arg3, arg4, arg5, true, this.field827);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.d(II[[IIIIB)Ldf;")
    public final class112 method635(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field811 == null) {
            var7 = (long) ((this.field804 << 10) + arg1);
        } else {
            var7 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field809.method3245(var7);
        if (var9 == null) {
            class101 var10 = this.method679(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2039(this.field816 + 64, this.field830 + 768, -50, -10, -50);
            field809.method3249(var9, var7);
        }
        if (this.field827 >= 0) {
            var9 = var9.method2203(arg2, arg3, arg4, arg5, true, this.field827);
        }
        return var9;
    }

    @ObfuscatedName("av.t(II[[IIIILak;IB)Ldf;")
    public final class112 method636(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field811 == null) {
            var9 = (long) ((this.field804 << 10) + arg1);
        } else {
            var9 = (long) ((this.field804 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field809.method3245(var9);
        if (var11 == null) {
            class101 var12 = this.method679(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2039(this.field816 + 64, this.field830 + 768, -50, -10, -50);
            field809.method3249(var11, var9);
        }
        if (arg6 == null && this.field827 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2262(true);
        } else {
            var13 = arg6.method702(var11, arg7, arg1);
        }
        if (this.field827 >= 0) {
            var13 = var13.method2203(arg2, arg3, arg4, arg5, false, this.field827);
        }
        return var13;
    }

    @ObfuscatedName("av.f(III)Lck;")
    public final class101 method679(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field811 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field812 == null) {
                return null;
            }
            boolean var4 = this.field834;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field812.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field812[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field807.method3245((long) var7);
                if (var3 == null) {
                    var3 = class101.method2086(Statics.field805, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2033();
                    }
                    field807.method3249(var3, (long) var7);
                }
                if (var5 > 1) {
                    field803[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field803, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field811.length; var9++) {
                if (this.field811[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field812[var8];
            boolean var11 = this.field834 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field807.method3245((long) var10);
            if (var3 == null) {
                var3 = class101.method2086(Statics.field805, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2033();
                }
                field807.method3249(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field836 == 128 && this.field837 == 128 && this.field838 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field852 == 0 && this.field848 == 0 && this.field820 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field815 == null, this.field817 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2029(256);
            var14.method2030(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2061();
        } else if (var15 == 2) {
            var14.method2027();
        } else if (var15 == 3) {
            var14.method2068();
        }
        if (this.field815 != null) {
            for (int var16 = 0; var16 < this.field815.length; var16++) {
                var14.method2031(this.field815[var16], this.field843[var16]);
            }
        }
        if (this.field817 != null) {
            for (int var17 = 0; var17 < this.field817.length; var17++) {
                var14.method2042(this.field817[var17], this.field818[var17]);
            }
        }
        if (var12) {
            var14.method2034(this.field836, this.field837, this.field838);
        }
        if (var13) {
            var14.method2030(this.field852, this.field848, this.field820);
        }
        return var14;
    }

    @ObfuscatedName("av.b(I)Lav;")
    public final class32 method638() {
        int var1 = -1;
        if (this.field847 != -1) {
            var1 = class159.method2666(this.field847);
        } else if (this.field829 != -1) {
            var1 = class159.field2693[this.field829];
        }
        return var1 < 0 || var1 >= this.field846.length || this.field846[var1] == -1 ? null : method54(this.field846[var1]);
    }

    @ObfuscatedName("k.z(I)V")
    public static void method184() {
        field853.method3251();
        field807.method3251();
        field808.method3251();
        field809.method3251();
    }

    @ObfuscatedName("av.l(B)Z")
    public boolean method644() {
        if (this.field846 == null) {
            return this.field824 != -1 || this.field810 != null;
        }
        for (int var1 = 0; var1 < this.field846.length; var1++) {
            if (this.field846[var1] != -1) {
                class32 var2 = method54(this.field846[var1]);
                if (var2.field824 != -1 || var2.field810 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
