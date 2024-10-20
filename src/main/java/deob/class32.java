package deob;

@ObfuscatedName("ap")
public class class32 extends class174 {

    @ObfuscatedName("ap.j")
    public static boolean field810 = false;

    @ObfuscatedName("ap.h")
    public static class170 field804 = new class170(64);

    @ObfuscatedName("ap.u")
    public static class170 field805 = new class170(500);

    @ObfuscatedName("ap.a")
    public static class170 field820 = new class170(30);

    @ObfuscatedName("ap.q")
    public static class170 field846 = new class170(30);

    @ObfuscatedName("ap.t")
    public static class101[] field808 = new class101[4];

    @ObfuscatedName("ap.n")
    public int field809;

    @ObfuscatedName("ap.i")
    public int[] field850;

    @ObfuscatedName("ap.c")
    public int[] field811;

    @ObfuscatedName("ap.b")
    public String field812 = "null";

    @ObfuscatedName("ap.m")
    public short[] field824;

    @ObfuscatedName("ap.g")
    public short[] field845;

    @ObfuscatedName("ap.x")
    public short[] field814;

    @ObfuscatedName("ap.r")
    public short[] field816;

    @ObfuscatedName("ap.s")
    public int field817 = 1;

    @ObfuscatedName("ap.l")
    public int field818 = 1;

    @ObfuscatedName("ap.k")
    public int field819 = 2;

    @ObfuscatedName("ap.w")
    public boolean field801 = true;

    @ObfuscatedName("ap.z")
    public int field821 = -1;

    @ObfuscatedName("ap.p")
    public int field822 = -1;

    @ObfuscatedName("ap.v")
    public boolean field823 = false;

    @ObfuscatedName("ap.d")
    public boolean field834 = false;

    @ObfuscatedName("ap.e")
    public int field836 = -1;

    @ObfuscatedName("ap.y")
    public int field826 = 16;

    @ObfuscatedName("ap.aw")
    public int field807 = 0;

    @ObfuscatedName("ap.ai")
    public int field828 = 0;

    @ObfuscatedName("ap.ah")
    public String[] field829 = new String[5];

    @ObfuscatedName("ap.ad")
    public int field815 = -1;

    @ObfuscatedName("ap.ak")
    public int field831 = -1;

    @ObfuscatedName("ap.ap")
    public boolean field832 = false;

    @ObfuscatedName("ap.al")
    public boolean field833 = true;

    @ObfuscatedName("ap.am")
    public int field847 = 128;

    @ObfuscatedName("ap.ab")
    public int field835 = 128;

    @ObfuscatedName("ap.ax")
    public int field806 = 128;

    @ObfuscatedName("ap.az")
    public int field837 = 0;

    @ObfuscatedName("ap.at")
    public int field838 = 0;

    @ObfuscatedName("ap.as")
    public int field839 = 0;

    @ObfuscatedName("ap.aj")
    public boolean field825 = false;

    @ObfuscatedName("ap.aa")
    public boolean field841 = false;

    @ObfuscatedName("ap.au")
    public int field842 = -1;

    @ObfuscatedName("ap.ae")
    public int[] field843;

    @ObfuscatedName("ap.ao")
    public int field844 = -1;

    @ObfuscatedName("ap.af")
    public int field813 = -1;

    @ObfuscatedName("ap.ar")
    public int field827 = -1;

    @ObfuscatedName("ap.ay")
    public int field840 = 0;

    @ObfuscatedName("ap.av")
    public int field848 = 0;

    @ObfuscatedName("ap.ac")
    public int field849 = 0;

    @ObfuscatedName("ap.aq")
    public int[] field830;

    @ObfuscatedName("client.j(Lew;Lew;ZI)V")
    public static void method559(class153 arg0, class153 arg1, boolean arg2) {
        Statics.field802 = arg0;
        Statics.field803 = arg1;
        field810 = arg2;
    }

    @ObfuscatedName("bp.f(II)Lap;")
    public static class32 method1406(int arg0) {
        class32 var1 = (class32) field804.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field802.method3027(6, arg0);
        class32 var3 = new class32();
        var3.field809 = arg0;
        if (var2 != null) {
            var3.method659(new class127(var2));
        }
        var3.method658();
        if (var3.field841) {
            var3.field819 = 0;
            var3.field801 = false;
        }
        field804.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.o(I)V")
    public void method658() {
        if (this.field821 == -1) {
            this.field821 = 0;
            if (this.field850 != null && (this.field811 == null || this.field811[0] == 10)) {
                this.field821 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field829[var1] != null) {
                    this.field821 = 1;
                }
            }
        }
        if (this.field842 == -1) {
            this.field842 = this.field819 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.h(Ldq;I)V")
    public void method659(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method674(arg0, var2);
        }
    }

    @ObfuscatedName("ap.u(Ldq;II)V")
    public void method674(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2464();
            if (var3 > 0) {
                if (this.field850 == null || field810) {
                    this.field811 = new int[var3];
                    this.field850 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field850[var4] = arg0.method2582();
                        this.field811[var4] = arg0.method2464();
                    }
                } else {
                    arg0.field2035 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field812 = arg0.method2518();
        } else if (arg1 == 5) {
            int var5 = arg0.method2464();
            if (var5 > 0) {
                if (this.field850 == null || field810) {
                    this.field811 = null;
                    this.field850 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field850[var6] = arg0.method2582();
                    }
                } else {
                    arg0.field2035 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field817 = arg0.method2464();
        } else if (arg1 == 15) {
            this.field818 = arg0.method2464();
        } else if (arg1 == 17) {
            this.field819 = 0;
            this.field801 = false;
        } else if (arg1 == 18) {
            this.field801 = false;
        } else if (arg1 == 19) {
            this.field821 = arg0.method2464();
        } else if (arg1 == 21) {
            this.field822 = 0;
        } else if (arg1 == 22) {
            this.field823 = true;
        } else if (arg1 == 23) {
            this.field834 = true;
        } else if (arg1 == 24) {
            this.field836 = arg0.method2582();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }
        } else if (arg1 == 27) {
            this.field819 = 1;
        } else if (arg1 == 28) {
            this.field826 = arg0.method2464();
        } else if (arg1 == 29) {
            this.field807 = arg0.method2449();
        } else if (arg1 == 39) {
            this.field828 = arg0.method2449() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field829[arg1 - 30] = arg0.method2518();
            if (this.field829[arg1 - 30].equalsIgnoreCase(class135.field2099)) {
                this.field829[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2464();
            this.field824 = new short[var7];
            this.field845 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field824[var8] = (short) arg0.method2582();
                this.field845[var8] = (short) arg0.method2582();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2464();
            this.field814 = new short[var9];
            this.field816 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field814[var10] = (short) arg0.method2582();
                this.field816[var10] = (short) arg0.method2582();
            }
        } else if (arg1 == 60) {
            this.field815 = arg0.method2582();
        } else if (arg1 == 62) {
            this.field832 = true;
        } else if (arg1 == 64) {
            this.field833 = false;
        } else if (arg1 == 65) {
            this.field847 = arg0.method2582();
        } else if (arg1 == 66) {
            this.field835 = arg0.method2582();
        } else if (arg1 == 67) {
            this.field806 = arg0.method2582();
        } else if (arg1 == 68) {
            this.field831 = arg0.method2582();
        } else if (arg1 == 69) {
            arg0.method2464();
        } else if (arg1 == 70) {
            this.field837 = arg0.method2467();
        } else if (arg1 == 71) {
            this.field838 = arg0.method2467();
        } else if (arg1 == 72) {
            this.field839 = arg0.method2467();
        } else if (arg1 == 73) {
            this.field825 = true;
        } else if (arg1 == 74) {
            this.field841 = true;
        } else if (arg1 == 75) {
            this.field842 = arg0.method2464();
        } else if (arg1 == 77) {
            this.field844 = arg0.method2582();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
            this.field813 = arg0.method2582();
            if (this.field813 == 65535) {
                this.field813 = -1;
            }
            int var11 = arg0.method2464();
            this.field843 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field843[var12] = arg0.method2582();
                if (this.field843[var12] == 65535) {
                    this.field843[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field827 = arg0.method2582();
            this.field840 = arg0.method2464();
        } else if (arg1 == 79) {
            this.field848 = arg0.method2582();
            this.field849 = arg0.method2582();
            this.field840 = arg0.method2464();
            int var13 = arg0.method2464();
            this.field830 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field830[var14] = arg0.method2582();
            }
        } else if (arg1 == 81) {
            this.field822 = arg0.method2464() * 256;
        }
    }

    @ObfuscatedName("ap.a(II)Z")
    public final boolean method661(int arg0) {
        if (this.field811 != null) {
            for (int var4 = 0; var4 < this.field811.length; var4++) {
                if (this.field811[var4] == arg0) {
                    return Statics.field803.method3083(this.field850[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field850 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field850.length; var3++) {
                var2 &= Statics.field803.method3083(this.field850[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.q(I)Z")
    public final boolean method668() {
        if (this.field850 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field850.length; var2++) {
            var1 &= Statics.field803.method3083(this.field850[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.t(II[[IIIII)Lcx;")
    public final class94 method663(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field811 == null) {
            var7 = (long) ((this.field809 << 10) + arg1);
        } else {
            var7 = (long) ((this.field809 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field820.method3256(var7);
        if (var9 == null) {
            class101 var10 = this.method666(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field823) {
                var10.field1722 = (short) (this.field807 + 64);
                var10.field1723 = (short) (this.field828 + 768);
                var10.method2079();
                var9 = var10;
            } else {
                var9 = var10.method2083(this.field807 + 64, this.field828 + 768, -50, -10, -50);
            }
            field820.method3257(var9, var7);
        }
        if (this.field823) {
            var9 = ((class101) var9).method2120();
        }
        if (this.field822 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2236(arg2, arg3, arg4, arg5, true, this.field822);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2077(arg2, arg3, arg4, arg5, true, this.field822);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.n(II[[IIIII)Ldo;")
    public final class112 method664(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field811 == null) {
            var7 = (long) ((this.field809 << 10) + arg1);
        } else {
            var7 = (long) ((this.field809 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field846.method3256(var7);
        if (var9 == null) {
            class101 var10 = this.method666(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2083(this.field807 + 64, this.field828 + 768, -50, -10, -50);
            field846.method3257(var9, var7);
        }
        if (this.field822 >= 0) {
            var9 = var9.method2236(arg2, arg3, arg4, arg5, true, this.field822);
        }
        return var9;
    }

    @ObfuscatedName("ap.i(II[[IIIILam;II)Ldo;")
    public final class112 method665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field811 == null) {
            var9 = (long) ((this.field809 << 10) + arg1);
        } else {
            var9 = (long) ((this.field809 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field846.method3256(var9);
        if (var11 == null) {
            class101 var12 = this.method666(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2083(this.field807 + 64, this.field828 + 768, -50, -10, -50);
            field846.method3257(var11, var9);
        }
        if (arg6 == null && this.field822 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2248(true);
        } else {
            var13 = arg6.method746(var11, arg7, arg1);
        }
        if (this.field822 >= 0) {
            var13 = var13.method2236(arg2, arg3, arg4, arg5, false, this.field822);
        }
        return var13;
    }

    @ObfuscatedName("ap.c(III)Lch;")
    public final class101 method666(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field811 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field850 == null) {
                return null;
            }
            boolean var4 = this.field832;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field850.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field850[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field805.method3256((long) var7);
                if (var3 == null) {
                    var3 = class101.method2064(Statics.field803, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2063();
                    }
                    field805.method3257(var3, (long) var7);
                }
                if (var5 > 1) {
                    field808[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field808, var5);
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
            int var10 = this.field850[var8];
            boolean var11 = this.field832 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field805.method3256((long) var10);
            if (var3 == null) {
                var3 = class101.method2064(Statics.field803, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2063();
                }
                field805.method3257(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field847 == 128 && this.field835 == 128 && this.field806 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field837 == 0 && this.field838 == 0 && this.field839 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field824 == null, this.field814 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2073(256);
            var14.method2074(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2071();
        } else if (var15 == 2) {
            var14.method2066();
        } else if (var15 == 3) {
            var14.method2088();
        }
        if (this.field824 != null) {
            for (int var16 = 0; var16 < this.field824.length; var16++) {
                var14.method2112(this.field824[var16], this.field845[var16]);
            }
        }
        if (this.field814 != null) {
            for (int var17 = 0; var17 < this.field814.length; var17++) {
                var14.method2082(this.field814[var17], this.field816[var17]);
            }
        }
        if (var12) {
            var14.method2078(this.field847, this.field835, this.field806);
        }
        if (var13) {
            var14.method2074(this.field837, this.field838, this.field839);
        }
        return var14;
    }

    @ObfuscatedName("ap.b(I)Lap;")
    public final class32 method660() {
        int var1 = -1;
        if (this.field844 != -1) {
            var1 = class160.method1486(this.field844);
        } else if (this.field813 != -1) {
            var1 = class160.field2716[this.field813];
        }
        return var1 < 0 || var1 >= this.field843.length || this.field843[var1] == -1 ? null : method1406(this.field843[var1]);
    }

    @ObfuscatedName("ap.m(B)Z")
    public boolean method697() {
        if (this.field843 == null) {
            return this.field827 != -1 || this.field830 != null;
        }
        for (int var1 = 0; var1 < this.field843.length; var1++) {
            if (this.field843[var1] != -1) {
                class32 var2 = method1406(this.field843[var1]);
                if (var2.field827 != -1 || var2.field830 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
