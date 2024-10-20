package deob;

@ObfuscatedName("ay")
public class class32 extends class175 {

    @ObfuscatedName("ay.l")
    public static boolean field828 = false;

    @ObfuscatedName("ay.w")
    public static class171 field806 = new class171(64);

    @ObfuscatedName("ay.r")
    public static class171 field807 = new class171(500);

    @ObfuscatedName("ay.k")
    public static class171 field808 = new class171(30);

    @ObfuscatedName("ay.z")
    public static class171 field809 = new class171(30);

    @ObfuscatedName("ay.g")
    public static class101[] field810 = new class101[4];

    @ObfuscatedName("ay.n")
    public int field805;

    @ObfuscatedName("ay.j")
    public int[] field812;

    @ObfuscatedName("ay.c")
    public int[] field813;

    @ObfuscatedName("ay.m")
    public String field842 = "null";

    @ObfuscatedName("ay.a")
    public short[] field815;

    @ObfuscatedName("ay.e")
    public short[] field816;

    @ObfuscatedName("ay.q")
    public short[] field811;

    @ObfuscatedName("ay.y")
    public short[] field803;

    @ObfuscatedName("ay.v")
    public int field819 = 1;

    @ObfuscatedName("ay.s")
    public int field820 = 1;

    @ObfuscatedName("ay.u")
    public int field831 = 2;

    @ObfuscatedName("ay.d")
    public boolean field825 = true;

    @ObfuscatedName("ay.i")
    public int field853 = -1;

    @ObfuscatedName("ay.p")
    public int field824 = -1;

    @ObfuscatedName("ay.h")
    public boolean field804 = false;

    @ObfuscatedName("ay.f")
    public boolean field826 = false;

    @ObfuscatedName("ay.t")
    public int field827 = -1;

    @ObfuscatedName("ay.x")
    public int field818 = 16;

    @ObfuscatedName("ay.ar")
    public int field829 = 0;

    @ObfuscatedName("ay.au")
    public int field821 = 0;

    @ObfuscatedName("ay.an")
    public String[] field852 = new String[5];

    @ObfuscatedName("ay.ad")
    public int field848 = -1;

    @ObfuscatedName("ay.at")
    public int field833 = -1;

    @ObfuscatedName("ay.ay")
    public boolean field834 = false;

    @ObfuscatedName("ay.ac")
    public boolean field835 = true;

    @ObfuscatedName("ay.av")
    public int field817 = 128;

    @ObfuscatedName("ay.ae")
    public int field837 = 128;

    @ObfuscatedName("ay.ah")
    public int field838 = 128;

    @ObfuscatedName("ay.aq")
    public int field839 = 0;

    @ObfuscatedName("ay.ax")
    public int field840 = 0;

    @ObfuscatedName("ay.am")
    public int field841 = 0;

    @ObfuscatedName("ay.af")
    public boolean field814 = false;

    @ObfuscatedName("ay.ao")
    public boolean field843 = false;

    @ObfuscatedName("ay.ab")
    public int field844 = -1;

    @ObfuscatedName("ay.aj")
    public int[] field845;

    @ObfuscatedName("ay.ag")
    public int field823 = -1;

    @ObfuscatedName("ay.aw")
    public int field847 = -1;

    @ObfuscatedName("ay.az")
    public int field836 = -1;

    @ObfuscatedName("ay.al")
    public int field849 = 0;

    @ObfuscatedName("ay.as")
    public int field850 = 0;

    @ObfuscatedName("ay.ap")
    public int field846 = 0;

    @ObfuscatedName("ay.ai")
    public int[] field832;

    @ObfuscatedName("bc.l(Lem;Lem;ZI)V")
    public static void method1359(class154 arg0, class154 arg1, boolean arg2) {
        Statics.field830 = arg0;
        Statics.field851 = arg1;
        field828 = arg2;
    }

    @ObfuscatedName("i.b(IB)Lay;")
    public static class32 method217(int arg0) {
        class32 var1 = (class32) field806.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field830.method3029(6, arg0);
        class32 var3 = new class32();
        var3.field805 = arg0;
        if (var2 != null) {
            var3.method631(new class127(var2));
        }
        var3.method630();
        if (var3.field843) {
            var3.field831 = 0;
            var3.field825 = false;
        }
        field806.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.o(I)V")
    public void method630() {
        if (this.field853 == -1) {
            this.field853 = 0;
            if (this.field812 != null && (this.field813 == null || this.field813[0] == 10)) {
                this.field853 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field852[var1] != null) {
                    this.field853 = 1;
                }
            }
        }
        if (this.field844 == -1) {
            this.field844 = this.field831 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ay.w(Ldm;I)V")
    public void method631(class127 arg0) {
        while (true) {
            int var2 = arg0.method2440();
            if (var2 == 0) {
                return;
            }
            this.method672(arg0, var2);
        }
    }

    @ObfuscatedName("ay.r(Ldm;II)V")
    public void method672(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2440();
            if (var3 > 0) {
                if (this.field812 == null || field828) {
                    this.field813 = new int[var3];
                    this.field812 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field812[var4] = arg0.method2442();
                        this.field813[var4] = arg0.method2440();
                    }
                } else {
                    arg0.field2022 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field842 = arg0.method2471();
        } else if (arg1 == 5) {
            int var5 = arg0.method2440();
            if (var5 > 0) {
                if (this.field812 == null || field828) {
                    this.field813 = null;
                    this.field812 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field812[var6] = arg0.method2442();
                    }
                } else {
                    arg0.field2022 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field819 = arg0.method2440();
        } else if (arg1 == 15) {
            this.field820 = arg0.method2440();
        } else if (arg1 == 17) {
            this.field831 = 0;
            this.field825 = false;
        } else if (arg1 == 18) {
            this.field825 = false;
        } else if (arg1 == 19) {
            this.field853 = arg0.method2440();
        } else if (arg1 == 21) {
            this.field824 = 0;
        } else if (arg1 == 22) {
            this.field804 = true;
        } else if (arg1 == 23) {
            this.field826 = true;
        } else if (arg1 == 24) {
            this.field827 = arg0.method2442();
            if (this.field827 == 65535) {
                this.field827 = -1;
            }
        } else if (arg1 == 27) {
            this.field831 = 1;
        } else if (arg1 == 28) {
            this.field818 = arg0.method2440();
        } else if (arg1 == 29) {
            this.field829 = arg0.method2438();
        } else if (arg1 == 39) {
            this.field821 = arg0.method2438();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field852[arg1 - 30] = arg0.method2471();
            if (this.field852[arg1 - 30].equalsIgnoreCase(class136.field2093)) {
                this.field852[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2440();
            this.field815 = new short[var7];
            this.field816 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field815[var8] = (short) arg0.method2442();
                this.field816[var8] = (short) arg0.method2442();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2440();
            this.field811 = new short[var9];
            this.field803 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field811[var10] = (short) arg0.method2442();
                this.field803[var10] = (short) arg0.method2442();
            }
        } else if (arg1 == 60) {
            this.field848 = arg0.method2442();
        } else if (arg1 == 62) {
            this.field834 = true;
        } else if (arg1 == 64) {
            this.field835 = false;
        } else if (arg1 == 65) {
            this.field817 = arg0.method2442();
        } else if (arg1 == 66) {
            this.field837 = arg0.method2442();
        } else if (arg1 == 67) {
            this.field838 = arg0.method2442();
        } else if (arg1 == 68) {
            this.field833 = arg0.method2442();
        } else if (arg1 == 69) {
            arg0.method2440();
        } else if (arg1 == 70) {
            this.field839 = arg0.method2606();
        } else if (arg1 == 71) {
            this.field840 = arg0.method2606();
        } else if (arg1 == 72) {
            this.field841 = arg0.method2606();
        } else if (arg1 == 73) {
            this.field814 = true;
        } else if (arg1 == 74) {
            this.field843 = true;
        } else if (arg1 == 75) {
            this.field844 = arg0.method2440();
        } else if (arg1 == 77) {
            this.field823 = arg0.method2442();
            if (this.field823 == 65535) {
                this.field823 = -1;
            }
            this.field847 = arg0.method2442();
            if (this.field847 == 65535) {
                this.field847 = -1;
            }
            int var11 = arg0.method2440();
            this.field845 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field845[var12] = arg0.method2442();
                if (this.field845[var12] == 65535) {
                    this.field845[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field836 = arg0.method2442();
            this.field849 = arg0.method2440();
        } else if (arg1 == 79) {
            this.field850 = arg0.method2442();
            this.field846 = arg0.method2442();
            this.field849 = arg0.method2440();
            int var13 = arg0.method2440();
            this.field832 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field832[var14] = arg0.method2442();
            }
        } else if (arg1 == 81) {
            this.field824 = arg0.method2440() * 256;
        }
    }

    @ObfuscatedName("ay.k(IB)Z")
    public final boolean method633(int arg0) {
        if (this.field813 != null) {
            for (int var4 = 0; var4 < this.field813.length; var4++) {
                if (this.field813[var4] == arg0) {
                    return Statics.field851.method3031(this.field812[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field812 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field812.length; var3++) {
                var2 &= Statics.field851.method3031(this.field812[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.z(I)Z")
    public final boolean method634() {
        if (this.field812 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field812.length; var2++) {
            var1 &= Statics.field851.method3031(this.field812[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ay.g(II[[IIIIB)Lcm;")
    public final class94 method674(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field813 == null) {
            var7 = (long) ((this.field805 << 10) + arg1);
        } else {
            var7 = (long) ((this.field805 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field808.method3255(var7);
        if (var9 == null) {
            class101 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field804) {
                var10.field1694 = (short) (this.field829 + 64);
                var10.field1695 = (short) (this.field821 * 25 + 768);
                var10.method2041();
                var9 = var10;
            } else {
                var9 = var10.method2105(this.field829 + 64, this.field821 * 25 + 768, -50, -10, -50);
            }
            field808.method3253(var9, var7);
        }
        if (this.field804) {
            var9 = ((class101) var9).method2029();
        }
        if (this.field824 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2226(arg2, arg3, arg4, arg5, true, this.field824);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2030(arg2, arg3, arg4, arg5, true, this.field824);
            }
        }
        return var9;
    }

    @ObfuscatedName("ay.n(II[[IIIIB)Ldt;")
    public final class112 method636(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field813 == null) {
            var7 = (long) ((this.field805 << 10) + arg1);
        } else {
            var7 = (long) ((this.field805 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field809.method3255(var7);
        if (var9 == null) {
            class101 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2105(this.field829 + 64, this.field821 * 25 + 768, -50, -10, -50);
            field809.method3253(var9, var7);
        }
        if (this.field824 >= 0) {
            var9 = var9.method2226(arg2, arg3, arg4, arg5, true, this.field824);
        }
        return var9;
    }

    @ObfuscatedName("ay.j(II[[IIIILav;II)Ldt;")
    public final class112 method629(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field813 == null) {
            var9 = (long) ((this.field805 << 10) + arg1);
        } else {
            var9 = (long) ((this.field805 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field809.method3255(var9);
        if (var11 == null) {
            class101 var12 = this.method638(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2105(this.field829 + 64, this.field821 * 25 + 768, -50, -10, -50);
            field809.method3253(var11, var9);
        }
        if (arg6 == null && this.field824 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2227(true);
        } else {
            var13 = arg6.method737(var11, arg7, arg1);
        }
        if (this.field824 >= 0) {
            var13 = var13.method2226(arg2, arg3, arg4, arg5, false, this.field824);
        }
        return var13;
    }

    @ObfuscatedName("ay.c(III)Lcc;")
    public final class101 method638(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field813 == null) {
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
                var3 = (class101) field807.method3255((long) var7);
                if (var3 == null) {
                    var3 = class101.method2087(Statics.field851, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2039();
                    }
                    field807.method3253(var3, (long) var7);
                }
                if (var5 > 1) {
                    field810[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field810, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field813.length; var9++) {
                if (this.field813[var9] == arg0) {
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
            var3 = (class101) field807.method3255((long) var10);
            if (var3 == null) {
                var3 = class101.method2087(Statics.field851, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2039();
                }
                field807.method3253(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field817 == 128 && this.field837 == 128 && this.field838 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field839 == 0 && this.field840 == 0 && this.field841 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field815 == null, this.field811 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2072(256);
            var14.method2036(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2069();
        } else if (var15 == 2) {
            var14.method2033();
        } else if (var15 == 3) {
            var14.method2034();
        }
        if (this.field815 != null) {
            for (int var16 = 0; var16 < this.field815.length; var16++) {
                var14.method2071(this.field815[var16], this.field816[var16]);
            }
        }
        if (this.field811 != null) {
            for (int var17 = 0; var17 < this.field811.length; var17++) {
                var14.method2038(this.field811[var17], this.field803[var17]);
            }
        }
        if (var12) {
            var14.method2040(this.field817, this.field837, this.field838);
        }
        if (var13) {
            var14.method2036(this.field839, this.field840, this.field841);
        }
        return var14;
    }

    @ObfuscatedName("ay.m(I)Lay;")
    public final class32 method639() {
        int var1 = -1;
        if (this.field823 != -1) {
            var1 = class161.method3138(this.field823);
        } else if (this.field847 != -1) {
            var1 = class161.field2736[this.field847];
        }
        return var1 < 0 || var1 >= this.field845.length || this.field845[var1] == -1 ? null : method217(this.field845[var1]);
    }

    @ObfuscatedName("ay.a(B)Z")
    public boolean method667() {
        if (this.field845 == null) {
            return this.field836 != -1 || this.field832 != null;
        }
        for (int var1 = 0; var1 < this.field845.length; var1++) {
            if (this.field845[var1] != -1) {
                class32 var2 = method217(this.field845[var1]);
                if (var2.field836 != -1 || var2.field832 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
