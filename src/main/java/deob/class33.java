package deob;

@ObfuscatedName("ay")
public class class33 extends class176 {

    @ObfuscatedName("ay.i")
    public static boolean field859 = false;

    @ObfuscatedName("ay.l")
    public static class172 field816 = new class172(64);

    @ObfuscatedName("ay.s")
    public static class172 field817 = new class172(500);

    @ObfuscatedName("ay.d")
    public static class172 field861 = new class172(30);

    @ObfuscatedName("ay.e")
    public static class172 field829 = new class172(30);

    @ObfuscatedName("ay.u")
    public static class102[] field814 = new class102[4];

    @ObfuscatedName("ay.q")
    public int field821;

    @ObfuscatedName("ay.o")
    public int[] field847;

    @ObfuscatedName("ay.v")
    public int[] field823;

    @ObfuscatedName("ay.m")
    public String field844 = "null";

    @ObfuscatedName("ay.x")
    public short[] field825;

    @ObfuscatedName("ay.w")
    public short[] field826;

    @ObfuscatedName("ay.p")
    public short[] field827;

    @ObfuscatedName("ay.z")
    public short[] field828;

    @ObfuscatedName("ay.h")
    public int field819 = 1;

    @ObfuscatedName("ay.a")
    public int field830 = 1;

    @ObfuscatedName("ay.c")
    public int field831 = 2;

    @ObfuscatedName("ay.k")
    public boolean field832 = true;

    @ObfuscatedName("ay.n")
    public int field833 = -1;

    @ObfuscatedName("ay.t")
    public int field834 = -1;

    @ObfuscatedName("ay.y")
    public boolean field835 = false;

    @ObfuscatedName("ay.g")
    public boolean field864 = false;

    @ObfuscatedName("ay.f")
    public int field837 = -1;

    @ObfuscatedName("ay.j")
    public int field838 = 16;

    @ObfuscatedName("ay.af")
    public int field839 = 0;

    @ObfuscatedName("ay.ar")
    public int field840 = 0;

    @ObfuscatedName("ay.ax")
    public String[] field841 = new String[5];

    @ObfuscatedName("ay.at")
    public int field842 = -1;

    @ObfuscatedName("ay.ah")
    public int field843 = -1;

    @ObfuscatedName("ay.ap")
    public boolean field863 = false;

    @ObfuscatedName("ay.ay")
    public boolean field845 = true;

    @ObfuscatedName("ay.ag")
    public int field846 = 128;

    @ObfuscatedName("ay.ai")
    public int field820 = 128;

    @ObfuscatedName("ay.aw")
    public int field848 = 128;

    @ObfuscatedName("ay.am")
    public int field860 = 0;

    @ObfuscatedName("ay.an")
    public int field850 = 0;

    @ObfuscatedName("ay.as")
    public int field851 = 0;

    @ObfuscatedName("ay.au")
    public boolean field852 = false;

    @ObfuscatedName("ay.aq")
    public boolean field853 = false;

    @ObfuscatedName("ay.ac")
    public int field856 = -1;

    @ObfuscatedName("ay.ae")
    public int[] field855;

    @ObfuscatedName("ay.ad")
    public int field865 = -1;

    @ObfuscatedName("ay.ao")
    public int field857 = -1;

    @ObfuscatedName("ay.aj")
    public int field858 = -1;

    @ObfuscatedName("ay.aa")
    public int field824 = 0;

    @ObfuscatedName("ay.al")
    public int field836 = 0;

    @ObfuscatedName("ay.az")
    public int field866 = 0;

    @ObfuscatedName("ay.av")
    public int[] field862;

    @ObfuscatedName("ay.b(B)V")
    public void method653() {
        if (this.field833 == -1) {
            this.field833 = 0;
            if (this.field847 != null && (this.field823 == null || this.field823[0] == 10)) {
                this.field833 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field841[var1] != null) {
                    this.field833 = 1;
                }
            }
        }
        if (this.field856 == -1) {
            this.field856 = this.field831 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ay.r(Lds;B)V")
    public void method654(class128 arg0) {
        while (true) {
            int var2 = arg0.method2531();
            if (var2 == 0) {
                return;
            }
            this.method695(arg0, var2);
        }
    }

    @ObfuscatedName("ay.l(Lds;II)V")
    public void method695(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2531();
            if (var3 > 0) {
                if (this.field847 == null || field859) {
                    this.field823 = new int[var3];
                    this.field847 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field847[var4] = arg0.method2473();
                        this.field823[var4] = arg0.method2531();
                    }
                } else {
                    arg0.field2048 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field844 = arg0.method2618();
        } else if (arg1 == 5) {
            int var5 = arg0.method2531();
            if (var5 > 0) {
                if (this.field847 == null || field859) {
                    this.field823 = null;
                    this.field847 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field847[var6] = arg0.method2473();
                    }
                } else {
                    arg0.field2048 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field819 = arg0.method2531();
        } else if (arg1 == 15) {
            this.field830 = arg0.method2531();
        } else if (arg1 == 17) {
            this.field831 = 0;
            this.field832 = false;
        } else if (arg1 == 18) {
            this.field832 = false;
        } else if (arg1 == 19) {
            this.field833 = arg0.method2531();
        } else if (arg1 == 21) {
            this.field834 = 0;
        } else if (arg1 == 22) {
            this.field835 = true;
        } else if (arg1 == 23) {
            this.field864 = true;
        } else if (arg1 == 24) {
            this.field837 = arg0.method2473();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
        } else if (arg1 == 27) {
            this.field831 = 1;
        } else if (arg1 == 28) {
            this.field838 = arg0.method2531();
        } else if (arg1 == 29) {
            this.field839 = arg0.method2464();
        } else if (arg1 == 39) {
            this.field840 = arg0.method2464() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field841[arg1 - 30] = arg0.method2618();
            if (this.field841[arg1 - 30].equalsIgnoreCase(class137.field2125)) {
                this.field841[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2531();
            this.field825 = new short[var7];
            this.field826 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field825[var8] = (short) arg0.method2473();
                this.field826[var8] = (short) arg0.method2473();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2531();
            this.field827 = new short[var9];
            this.field828 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field827[var10] = (short) arg0.method2473();
                this.field828[var10] = (short) arg0.method2473();
            }
        } else if (arg1 == 60) {
            this.field842 = arg0.method2473();
        } else if (arg1 == 62) {
            this.field863 = true;
        } else if (arg1 == 64) {
            this.field845 = false;
        } else if (arg1 == 65) {
            this.field846 = arg0.method2473();
        } else if (arg1 == 66) {
            this.field820 = arg0.method2473();
        } else if (arg1 == 67) {
            this.field848 = arg0.method2473();
        } else if (arg1 == 68) {
            this.field843 = arg0.method2473();
        } else if (arg1 == 69) {
            arg0.method2531();
        } else if (arg1 == 70) {
            this.field860 = arg0.method2487();
        } else if (arg1 == 71) {
            this.field850 = arg0.method2487();
        } else if (arg1 == 72) {
            this.field851 = arg0.method2487();
        } else if (arg1 == 73) {
            this.field852 = true;
        } else if (arg1 == 74) {
            this.field853 = true;
        } else if (arg1 == 75) {
            this.field856 = arg0.method2531();
        } else if (arg1 == 77) {
            this.field865 = arg0.method2473();
            if (this.field865 == 65535) {
                this.field865 = -1;
            }
            this.field857 = arg0.method2473();
            if (this.field857 == 65535) {
                this.field857 = -1;
            }
            int var11 = arg0.method2531();
            this.field855 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field855[var12] = arg0.method2473();
                if (this.field855[var12] == 65535) {
                    this.field855[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field858 = arg0.method2473();
            this.field824 = arg0.method2531();
        } else if (arg1 == 79) {
            this.field836 = arg0.method2473();
            this.field866 = arg0.method2473();
            this.field824 = arg0.method2531();
            int var13 = arg0.method2531();
            this.field862 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field862[var14] = arg0.method2473();
            }
        } else if (arg1 == 81) {
            this.field834 = arg0.method2531() * 256;
        }
    }

    @ObfuscatedName("ay.s(IB)Z")
    public final boolean method683(int arg0) {
        if (this.field823 != null) {
            for (int var4 = 0; var4 < this.field823.length; var4++) {
                if (this.field823[var4] == arg0) {
                    return Statics.field813.method3045(this.field847[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field847 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field847.length; var3++) {
                var2 &= Statics.field813.method3045(this.field847[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.d(I)Z")
    public final boolean method686() {
        if (this.field847 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field847.length; var2++) {
            var1 &= Statics.field813.method3045(this.field847[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ay.e(II[[IIIII)Lcx;")
    public final class95 method694(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field823 == null) {
            var7 = (long) ((this.field821 << 10) + arg1);
        } else {
            var7 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class95 var9 = (class95) field861.method3277(var7);
        if (var9 == null) {
            class102 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field835) {
                var10.field1723 = (short) (this.field839 + 64);
                var10.field1729 = (short) (this.field840 + 768);
                var10.method2094();
                var9 = var10;
            } else {
                var9 = var10.method2076(this.field839 + 64, this.field840 + 768, -50, -10, -50);
            }
            field861.method3281(var9, var7);
        }
        if (this.field835) {
            var9 = ((class102) var9).method2062();
        }
        if (this.field834 >= 0) {
            if (var9 instanceof class113) {
                var9 = ((class113) var9).method2257(arg2, arg3, arg4, arg5, true, this.field834);
            } else if (var9 instanceof class102) {
                var9 = ((class102) var9).method2101(arg2, arg3, arg4, arg5, true, this.field834);
            }
        }
        return var9;
    }

    @ObfuscatedName("ay.u(II[[IIIIB)Ldt;")
    public final class113 method659(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field823 == null) {
            var7 = (long) ((this.field821 << 10) + arg1);
        } else {
            var7 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class113 var9 = (class113) field829.method3277(var7);
        if (var9 == null) {
            class102 var10 = this.method661(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2076(this.field839 + 64, this.field840 + 768, -50, -10, -50);
            field829.method3281(var9, var7);
        }
        if (this.field834 >= 0) {
            var9 = var9.method2257(arg2, arg3, arg4, arg5, true, this.field834);
        }
        return var9;
    }

    @ObfuscatedName("ay.q(II[[IIIILai;II)Ldt;")
    public final class113 method657(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7) {
        long var9;
        if (this.field823 == null) {
            var9 = (long) ((this.field821 << 10) + arg1);
        } else {
            var9 = (long) ((this.field821 << 10) + (arg0 << 3) + arg1);
        }
        class113 var11 = (class113) field829.method3277(var9);
        if (var11 == null) {
            class102 var12 = this.method661(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2076(this.field839 + 64, this.field840 + 768, -50, -10, -50);
            field829.method3281(var11, var9);
        }
        if (arg6 == null && this.field834 == -1) {
            return var11;
        }
        class113 var13;
        if (arg6 == null) {
            var13 = var11.method2311(true);
        } else {
            var13 = arg6.method720(var11, arg7, arg1);
        }
        if (this.field834 >= 0) {
            var13 = var13.method2257(arg2, arg3, arg4, arg5, false, this.field834);
        }
        return var13;
    }

    @ObfuscatedName("ay.o(III)Lco;")
    public final class102 method661(int arg0, int arg1) {
        class102 var3 = null;
        if (this.field823 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field847 == null) {
                return null;
            }
            boolean var4 = this.field863;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field847.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field847[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class102) field817.method3277((long) var7);
                if (var3 == null) {
                    var3 = class102.method2056(Statics.field813, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2121();
                    }
                    field817.method3281(var3, (long) var7);
                }
                if (var5 > 1) {
                    field814[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class102(field814, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field823.length; var9++) {
                if (this.field823[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field847[var8];
            boolean var11 = this.field863 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class102) field817.method3277((long) var10);
            if (var3 == null) {
                var3 = class102.method2056(Statics.field813, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2121();
                }
                field817.method3281(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field846 == 128 && this.field820 == 128 && this.field848 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field860 == 0 && this.field850 == 0 && this.field851 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class102 var14 = new class102(var3, arg1 == 0 && !var12 && !var13, this.field825 == null, this.field827 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2068(256);
            var14.method2069(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2065();
        } else if (var15 == 2) {
            var14.method2115();
        } else if (var15 == 3) {
            var14.method2073();
        }
        if (this.field825 != null) {
            for (int var16 = 0; var16 < this.field825.length; var16++) {
                var14.method2099(this.field825[var16], this.field826[var16]);
            }
        }
        if (this.field827 != null) {
            for (int var17 = 0; var17 < this.field827.length; var17++) {
                var14.method2075(this.field827[var17], this.field828[var17]);
            }
        }
        if (var12) {
            var14.method2072(this.field846, this.field820, this.field848);
        }
        if (var13) {
            var14.method2069(this.field860, this.field850, this.field851);
        }
        return var14;
    }

    @ObfuscatedName("ay.v(B)Lay;")
    public final class33 method662() {
        int var1 = -1;
        if (this.field865 != -1) {
            var1 = class162.method2738(this.field865);
        } else if (this.field857 != -1) {
            var1 = class162.field2740[this.field857];
        }
        return var1 < 0 || var1 >= this.field855.length || this.field855[var1] == -1 ? null : Statics.method2776(this.field855[var1]);
    }

    @ObfuscatedName("be.m(B)V")
    public static void method1420() {
        field816.method3279();
        field817.method3279();
        field861.method3279();
        field829.method3279();
    }

    @ObfuscatedName("ay.x(I)Z")
    public boolean method663() {
        if (this.field855 == null) {
            return this.field858 != -1 || this.field862 != null;
        }
        for (int var1 = 0; var1 < this.field855.length; var1++) {
            if (this.field855[var1] != -1) {
                class33 var2 = Statics.method2776(this.field855[var1]);
                if (var2.field858 != -1 || var2.field862 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
