package deob;

@ObfuscatedName("ae")
public class class32 extends class174 {

    @ObfuscatedName("ae.p")
    public static boolean field824 = false;

    @ObfuscatedName("ae.x")
    public static class170 field831 = new class170(64);

    @ObfuscatedName("ae.o")
    public static class170 field798 = new class170(500);

    @ObfuscatedName("ae.a")
    public static class170 field803 = new class170(30);

    @ObfuscatedName("ae.w")
    public static class170 field800 = new class170(30);

    @ObfuscatedName("ae.i")
    public static class101[] field801 = new class101[4];

    @ObfuscatedName("ae.y")
    public int field802;

    @ObfuscatedName("ae.m")
    public int[] field814;

    @ObfuscatedName("ae.u")
    public int[] field794;

    @ObfuscatedName("ae.s")
    public String field805 = "null";

    @ObfuscatedName("ae.e")
    public short[] field806;

    @ObfuscatedName("ae.r")
    public short[] field807;

    @ObfuscatedName("ae.n")
    public short[] field808;

    @ObfuscatedName("ae.g")
    public short[] field809;

    @ObfuscatedName("ae.c")
    public int field810 = 1;

    @ObfuscatedName("ae.v")
    public int field837 = 1;

    @ObfuscatedName("ae.b")
    public int field812 = 2;

    @ObfuscatedName("ae.k")
    public boolean field811 = true;

    @ObfuscatedName("ae.t")
    public int field841 = -1;

    @ObfuscatedName("ae.f")
    public int field815 = -1;

    @ObfuscatedName("ae.h")
    public boolean field816 = false;

    @ObfuscatedName("ae.j")
    public boolean field817 = false;

    @ObfuscatedName("ae.q")
    public int field799 = -1;

    @ObfuscatedName("ae.z")
    public int field829 = 16;

    @ObfuscatedName("ae.af")
    public int field842 = 0;

    @ObfuscatedName("ae.ap")
    public int field821 = 0;

    @ObfuscatedName("ae.ah")
    public String[] field835 = new String[5];

    @ObfuscatedName("ae.at")
    public int field823 = -1;

    @ObfuscatedName("ae.aa")
    public int field822 = -1;

    @ObfuscatedName("ae.ae")
    public boolean field825 = false;

    @ObfuscatedName("ae.aw")
    public boolean field826 = true;

    @ObfuscatedName("ae.ar")
    public int field827 = 128;

    @ObfuscatedName("ae.ai")
    public int field828 = 128;

    @ObfuscatedName("ae.au")
    public int field819 = 128;

    @ObfuscatedName("ae.ay")
    public int field830 = 0;

    @ObfuscatedName("ae.an")
    public int field820 = 0;

    @ObfuscatedName("ae.al")
    public int field832 = 0;

    @ObfuscatedName("ae.as")
    public boolean field797 = false;

    @ObfuscatedName("ae.az")
    public boolean field834 = false;

    @ObfuscatedName("ae.aq")
    public int field818 = -1;

    @ObfuscatedName("ae.ag")
    public int[] field836;

    @ObfuscatedName("ae.aj")
    public int field844 = -1;

    @ObfuscatedName("ae.ak")
    public int field838 = -1;

    @ObfuscatedName("ae.ac")
    public int field833 = -1;

    @ObfuscatedName("ae.ab")
    public int field840 = 0;

    @ObfuscatedName("ae.ax")
    public int field813 = 0;

    @ObfuscatedName("ae.av")
    public int field839 = 0;

    @ObfuscatedName("ae.ad")
    public int[] field843;

    @ObfuscatedName("bd.p(II)Lae;")
    public static class32 method1332(int arg0) {
        class32 var1 = (class32) field831.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field795.method3078(6, arg0);
        class32 var3 = new class32();
        var3.field802 = arg0;
        if (var2 != null) {
            var3.method658(new class127(var2));
        }
        var3.method643();
        if (var3.field834) {
            var3.field812 = 0;
            var3.field811 = false;
        }
        field831.method3364(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.l(I)V")
    public void method643() {
        if (this.field841 == -1) {
            this.field841 = 0;
            if (this.field814 != null && (this.field794 == null || this.field794[0] == 10)) {
                this.field841 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field835[var1] != null) {
                    this.field841 = 1;
                }
            }
        }
        if (this.field818 == -1) {
            this.field818 = this.field812 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.d(Lds;I)V")
    public void method658(class127 arg0) {
        while (true) {
            int var2 = arg0.method2498();
            if (var2 == 0) {
                return;
            }
            this.method645(arg0, var2);
        }
    }

    @ObfuscatedName("ae.x(Lds;II)V")
    public void method645(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2498();
            if (var3 > 0) {
                if (this.field814 == null || field824) {
                    this.field794 = new int[var3];
                    this.field814 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field814[var4] = arg0.method2581();
                        this.field794[var4] = arg0.method2498();
                    }
                } else {
                    arg0.field2030 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field805 = arg0.method2506();
        } else if (arg1 == 5) {
            int var5 = arg0.method2498();
            if (var5 > 0) {
                if (this.field814 == null || field824) {
                    this.field794 = null;
                    this.field814 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field814[var6] = arg0.method2581();
                    }
                } else {
                    arg0.field2030 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field810 = arg0.method2498();
        } else if (arg1 == 15) {
            this.field837 = arg0.method2498();
        } else if (arg1 == 17) {
            this.field812 = 0;
            this.field811 = false;
        } else if (arg1 == 18) {
            this.field811 = false;
        } else if (arg1 == 19) {
            this.field841 = arg0.method2498();
        } else if (arg1 == 21) {
            this.field815 = 0;
        } else if (arg1 == 22) {
            this.field816 = true;
        } else if (arg1 == 23) {
            this.field817 = true;
        } else if (arg1 == 24) {
            this.field799 = arg0.method2581();
            if (this.field799 == 65535) {
                this.field799 = -1;
            }
        } else if (arg1 == 27) {
            this.field812 = 1;
        } else if (arg1 == 28) {
            this.field829 = arg0.method2498();
        } else if (arg1 == 29) {
            this.field842 = arg0.method2499();
        } else if (arg1 == 39) {
            this.field821 = arg0.method2499();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field835[arg1 - 30] = arg0.method2506();
            if (this.field835[arg1 - 30].equalsIgnoreCase(class135.field2210)) {
                this.field835[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2498();
            this.field806 = new short[var7];
            this.field807 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field806[var8] = (short) arg0.method2581();
                this.field807[var8] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2498();
            this.field808 = new short[var9];
            this.field809 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field808[var10] = (short) arg0.method2581();
                this.field809[var10] = (short) arg0.method2581();
            }
        } else if (arg1 == 60) {
            this.field823 = arg0.method2581();
        } else if (arg1 == 62) {
            this.field825 = true;
        } else if (arg1 == 64) {
            this.field826 = false;
        } else if (arg1 == 65) {
            this.field827 = arg0.method2581();
        } else if (arg1 == 66) {
            this.field828 = arg0.method2581();
        } else if (arg1 == 67) {
            this.field819 = arg0.method2581();
        } else if (arg1 == 68) {
            this.field822 = arg0.method2581();
        } else if (arg1 == 69) {
            arg0.method2498();
        } else if (arg1 == 70) {
            this.field830 = arg0.method2542();
        } else if (arg1 == 71) {
            this.field820 = arg0.method2542();
        } else if (arg1 == 72) {
            this.field832 = arg0.method2542();
        } else if (arg1 == 73) {
            this.field797 = true;
        } else if (arg1 == 74) {
            this.field834 = true;
        } else if (arg1 == 75) {
            this.field818 = arg0.method2498();
        } else if (arg1 == 77) {
            this.field844 = arg0.method2581();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
            this.field838 = arg0.method2581();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            int var11 = arg0.method2498();
            this.field836 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field836[var12] = arg0.method2581();
                if (this.field836[var12] == 65535) {
                    this.field836[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field833 = arg0.method2581();
            this.field840 = arg0.method2498();
        } else if (arg1 == 79) {
            this.field813 = arg0.method2581();
            this.field839 = arg0.method2581();
            this.field840 = arg0.method2498();
            int var13 = arg0.method2498();
            this.field843 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field843[var14] = arg0.method2581();
            }
        } else if (arg1 == 81) {
            this.field815 = arg0.method2498() * 256;
        }
    }

    @ObfuscatedName("ae.o(II)Z")
    public final boolean method646(int arg0) {
        if (this.field794 != null) {
            for (int var4 = 0; var4 < this.field794.length; var4++) {
                if (this.field794[var4] == arg0) {
                    return Statics.field796.method3080(this.field814[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field814 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field814.length; var3++) {
                var2 &= Statics.field796.method3080(this.field814[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.a(I)Z")
    public final boolean method647() {
        if (this.field814 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field814.length; var2++) {
            var1 &= Statics.field796.method3080(this.field814[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.w(II[[IIIIB)Lcy;")
    public final class94 method655(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field794 == null) {
            var7 = (long) ((this.field802 << 10) + arg1);
        } else {
            var7 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field803.method3357(var7);
        if (var9 == null) {
            class101 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field816) {
                var10.field1709 = (short) (this.field842 + 64);
                var10.field1710 = (short) (this.field821 * 25 + 768);
                var10.method2101();
                var9 = var10;
            } else {
                var9 = var10.method2084(this.field842 + 64, this.field821 * 25 + 768, -50, -10, -50);
            }
            field803.method3364(var9, var7);
        }
        if (this.field816) {
            var9 = ((class101) var9).method2089();
        }
        if (this.field815 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2270(arg2, arg3, arg4, arg5, true, this.field815);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2142(arg2, arg3, arg4, arg5, true, this.field815);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.i(II[[IIIII)Ldl;")
    public final class112 method649(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field794 == null) {
            var7 = (long) ((this.field802 << 10) + arg1);
        } else {
            var7 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field800.method3357(var7);
        if (var9 == null) {
            class101 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2084(this.field842 + 64, this.field821 * 25 + 768, -50, -10, -50);
            field800.method3364(var9, var7);
        }
        if (this.field815 >= 0) {
            var9 = var9.method2270(arg2, arg3, arg4, arg5, true, this.field815);
        }
        return var9;
    }

    @ObfuscatedName("ae.y(II[[IIIILar;IS)Ldl;")
    public final class112 method650(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field794 == null) {
            var9 = (long) ((this.field802 << 10) + arg1);
        } else {
            var9 = (long) ((this.field802 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field800.method3357(var9);
        if (var11 == null) {
            class101 var12 = this.method664(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2084(this.field842 + 64, this.field821 * 25 + 768, -50, -10, -50);
            field800.method3364(var11, var9);
        }
        if (arg6 == null && this.field815 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2271(true);
        } else {
            var13 = arg6.method733(var11, arg7, arg1);
        }
        if (this.field815 >= 0) {
            var13 = var13.method2270(arg2, arg3, arg4, arg5, false, this.field815);
        }
        return var13;
    }

    @ObfuscatedName("ae.m(III)Lcm;")
    public final class101 method664(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field794 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field814 == null) {
                return null;
            }
            boolean var4 = this.field825;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field814.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field814[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field798.method3357((long) var7);
                if (var3 == null) {
                    var3 = class101.method2098(Statics.field796, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2099();
                    }
                    field798.method3364(var3, (long) var7);
                }
                if (var5 > 1) {
                    field801[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field801, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field794.length; var9++) {
                if (this.field794[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field814[var8];
            boolean var11 = this.field825 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field798.method3357((long) var10);
            if (var3 == null) {
                var3 = class101.method2098(Statics.field796, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2099();
                }
                field798.method3364(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field827 == 128 && this.field828 == 128 && this.field819 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field830 == 0 && this.field820 == 0 && this.field832 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field806 == null, this.field808 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2088(256);
            var14.method2162(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2137();
        } else if (var15 == 2) {
            var14.method2093();
        } else if (var15 == 3) {
            var14.method2094();
        }
        if (this.field806 != null) {
            for (int var16 = 0; var16 < this.field806.length; var16++) {
                var14.method2097(this.field806[var16], this.field807[var16]);
            }
        }
        if (this.field808 != null) {
            for (int var17 = 0; var17 < this.field808.length; var17++) {
                var14.method2138(this.field808[var17], this.field809[var17]);
            }
        }
        if (var12) {
            var14.method2100(this.field827, this.field828, this.field819);
        }
        if (var13) {
            var14.method2162(this.field830, this.field820, this.field832);
        }
        return var14;
    }

    @ObfuscatedName("ae.u(I)Lae;")
    public final class32 method684() {
        int var1 = -1;
        if (this.field844 != -1) {
            var1 = class160.method905(this.field844);
        } else if (this.field838 != -1) {
            var1 = class160.field2725[this.field838];
        }
        return var1 < 0 || var1 >= this.field836.length || this.field836[var1] == -1 ? null : method1332(this.field836[var1]);
    }

    @ObfuscatedName("ae.s(B)Z")
    public boolean method653() {
        if (this.field836 == null) {
            return this.field833 != -1 || this.field843 != null;
        }
        for (int var1 = 0; var1 < this.field836.length; var1++) {
            if (this.field836[var1] != -1) {
                class32 var2 = method1332(this.field836[var1]);
                if (var2.field833 != -1 || var2.field843 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
