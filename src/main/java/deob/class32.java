package deob;

@ObfuscatedName("ag")
public class class32 extends class174 {

    @ObfuscatedName("ag.f")
    public static boolean field815 = false;

    @ObfuscatedName("ag.e")
    public static class170 field817 = new class170(64);

    @ObfuscatedName("ag.l")
    public static class170 field805 = new class170(500);

    @ObfuscatedName("ag.d")
    public static class170 field814 = new class170(30);

    @ObfuscatedName("ag.r")
    public static class170 field807 = new class170(30);

    @ObfuscatedName("ag.k")
    public static class101[] field808 = new class101[4];

    @ObfuscatedName("ag.u")
    public int field806;

    @ObfuscatedName("ag.o")
    public int[] field810;

    @ObfuscatedName("ag.g")
    public int[] field822;

    @ObfuscatedName("ag.s")
    public String field823 = "null";

    @ObfuscatedName("ag.b")
    public short[] field813;

    @ObfuscatedName("ag.v")
    public short[] field852;

    @ObfuscatedName("ag.j")
    public short[] field829;

    @ObfuscatedName("ag.q")
    public short[] field816;

    @ObfuscatedName("ag.a")
    public int field812 = 1;

    @ObfuscatedName("ag.c")
    public int field818 = 1;

    @ObfuscatedName("ag.m")
    public int field819 = 2;

    @ObfuscatedName("ag.z")
    public boolean field820 = true;

    @ObfuscatedName("ag.w")
    public int field821 = -1;

    @ObfuscatedName("ag.h")
    public int field811 = -1;

    @ObfuscatedName("ag.y")
    public boolean field803 = false;

    @ObfuscatedName("ag.x")
    public boolean field850 = false;

    @ObfuscatedName("ag.p")
    public int field825 = -1;

    @ObfuscatedName("ag.i")
    public int field826 = 16;

    @ObfuscatedName("ag.aa")
    public int field824 = 0;

    @ObfuscatedName("ag.ax")
    public int field828 = 0;

    @ObfuscatedName("ag.ad")
    public String[] field836 = new String[5];

    @ObfuscatedName("ag.af")
    public int field830 = -1;

    @ObfuscatedName("ag.ai")
    public int field831 = -1;

    @ObfuscatedName("ag.ag")
    public boolean field832 = false;

    @ObfuscatedName("ag.an")
    public boolean field833 = true;

    @ObfuscatedName("ag.ac")
    public int field834 = 128;

    @ObfuscatedName("ag.al")
    public int field835 = 128;

    @ObfuscatedName("ag.at")
    public int field809 = 128;

    @ObfuscatedName("ag.ah")
    public int field843 = 0;

    @ObfuscatedName("ag.am")
    public int field838 = 0;

    @ObfuscatedName("ag.ab")
    public int field839 = 0;

    @ObfuscatedName("ag.aq")
    public boolean field849 = false;

    @ObfuscatedName("ag.ap")
    public boolean field841 = false;

    @ObfuscatedName("ag.ar")
    public int field842 = -1;

    @ObfuscatedName("ag.as")
    public int[] field827;

    @ObfuscatedName("ag.az")
    public int field844 = -1;

    @ObfuscatedName("ag.aw")
    public int field845 = -1;

    @ObfuscatedName("ag.av")
    public int field846 = -1;

    @ObfuscatedName("ag.ay")
    public int field847 = 0;

    @ObfuscatedName("ag.aj")
    public int field848 = 0;

    @ObfuscatedName("ag.ae")
    public int field840 = 0;

    @ObfuscatedName("ag.au")
    public int[] field853;

    @ObfuscatedName("aq.f(II)Lag;")
    public static class32 method874(int arg0) {
        class32 var1 = (class32) field817.method3276((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field837.method3035(6, arg0);
        class32 var3 = new class32();
        var3.field806 = arg0;
        if (var2 != null) {
            var3.method630(new class127(var2));
        }
        var3.method629();
        if (var3.field841) {
            var3.field819 = 0;
            var3.field820 = false;
        }
        field817.method3275(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.t(I)V")
    public void method629() {
        if (this.field821 == -1) {
            this.field821 = 0;
            if (this.field810 != null && (this.field822 == null || this.field822[0] == 10)) {
                this.field821 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field836[var1] != null) {
                    this.field821 = 1;
                }
            }
        }
        if (this.field842 == -1) {
            this.field842 = this.field819 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ag.n(Ldq;I)V")
    public void method630(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method631(arg0, var2);
        }
    }

    @ObfuscatedName("ag.e(Ldq;II)V")
    public void method631(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2458();
            if (var3 > 0) {
                if (this.field810 == null || field815) {
                    this.field822 = new int[var3];
                    this.field810 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field810[var4] = arg0.method2460();
                        this.field822[var4] = arg0.method2458();
                    }
                } else {
                    arg0.field2033 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field823 = arg0.method2636();
        } else if (arg1 == 5) {
            int var5 = arg0.method2458();
            if (var5 > 0) {
                if (this.field810 == null || field815) {
                    this.field822 = null;
                    this.field810 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field810[var6] = arg0.method2460();
                    }
                } else {
                    arg0.field2033 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field812 = arg0.method2458();
        } else if (arg1 == 15) {
            this.field818 = arg0.method2458();
        } else if (arg1 == 17) {
            this.field819 = 0;
            this.field820 = false;
        } else if (arg1 == 18) {
            this.field820 = false;
        } else if (arg1 == 19) {
            this.field821 = arg0.method2458();
        } else if (arg1 == 21) {
            this.field811 = 0;
        } else if (arg1 == 22) {
            this.field803 = true;
        } else if (arg1 == 23) {
            this.field850 = true;
        } else if (arg1 == 24) {
            this.field825 = arg0.method2460();
            if (this.field825 == 65535) {
                this.field825 = -1;
            }
        } else if (arg1 == 27) {
            this.field819 = 1;
        } else if (arg1 == 28) {
            this.field826 = arg0.method2458();
        } else if (arg1 == 29) {
            this.field824 = arg0.method2459();
        } else if (arg1 == 39) {
            this.field828 = arg0.method2459() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field836[arg1 - 30] = arg0.method2636();
            if (this.field836[arg1 - 30].equalsIgnoreCase(class135.field2093)) {
                this.field836[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2458();
            this.field813 = new short[var7];
            this.field852 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field813[var8] = (short) arg0.method2460();
                this.field852[var8] = (short) arg0.method2460();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2458();
            this.field829 = new short[var9];
            this.field816 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field829[var10] = (short) arg0.method2460();
                this.field816[var10] = (short) arg0.method2460();
            }
        } else if (arg1 == 60) {
            this.field830 = arg0.method2460();
        } else if (arg1 == 62) {
            this.field832 = true;
        } else if (arg1 == 64) {
            this.field833 = false;
        } else if (arg1 == 65) {
            this.field834 = arg0.method2460();
        } else if (arg1 == 66) {
            this.field835 = arg0.method2460();
        } else if (arg1 == 67) {
            this.field809 = arg0.method2460();
        } else if (arg1 == 68) {
            this.field831 = arg0.method2460();
        } else if (arg1 == 69) {
            arg0.method2458();
        } else if (arg1 == 70) {
            this.field843 = arg0.method2461();
        } else if (arg1 == 71) {
            this.field838 = arg0.method2461();
        } else if (arg1 == 72) {
            this.field839 = arg0.method2461();
        } else if (arg1 == 73) {
            this.field849 = true;
        } else if (arg1 == 74) {
            this.field841 = true;
        } else if (arg1 == 75) {
            this.field842 = arg0.method2458();
        } else if (arg1 == 77) {
            this.field844 = arg0.method2460();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
            this.field845 = arg0.method2460();
            if (this.field845 == 65535) {
                this.field845 = -1;
            }
            int var11 = arg0.method2458();
            this.field827 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field827[var12] = arg0.method2460();
                if (this.field827[var12] == 65535) {
                    this.field827[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field846 = arg0.method2460();
            this.field847 = arg0.method2458();
        } else if (arg1 == 79) {
            this.field848 = arg0.method2460();
            this.field840 = arg0.method2460();
            this.field847 = arg0.method2458();
            int var13 = arg0.method2458();
            this.field853 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field853[var14] = arg0.method2460();
            }
        } else if (arg1 == 81) {
            this.field811 = arg0.method2458() * 256;
        }
    }

    @ObfuscatedName("ag.l(IS)Z")
    public final boolean method656(int arg0) {
        if (this.field822 != null) {
            for (int var4 = 0; var4 < this.field822.length; var4++) {
                if (this.field822[var4] == arg0) {
                    return Statics.field2005.method3103(this.field810[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field810 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field810.length; var3++) {
                var2 &= Statics.field2005.method3103(this.field810[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ag.d(B)Z")
    public final boolean method633() {
        if (this.field810 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field810.length; var2++) {
            var1 &= Statics.field2005.method3103(this.field810[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ag.r(II[[IIIII)Lcd;")
    public final class94 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field806 << 10) + arg1);
        } else {
            var7 = (long) ((this.field806 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field814.method3276(var7);
        if (var9 == null) {
            class101 var10 = this.method654(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field803) {
                var10.field1706 = (short) (this.field824 + 64);
                var10.field1707 = (short) (this.field828 + 768);
                var10.method2069();
                var9 = var10;
            } else {
                var9 = var10.method2112(this.field824 + 64, this.field828 + 768, -50, -10, -50);
            }
            field814.method3275(var9, var7);
        }
        if (this.field803) {
            var9 = ((class101) var9).method2063();
        }
        if (this.field811 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2236(arg2, arg3, arg4, arg5, true, this.field811);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2057(arg2, arg3, arg4, arg5, true, this.field811);
            }
        }
        return var9;
    }

    @ObfuscatedName("ag.k(II[[IIIIB)Ldp;")
    public final class112 method635(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field806 << 10) + arg1);
        } else {
            var7 = (long) ((this.field806 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field807.method3276(var7);
        if (var9 == null) {
            class101 var10 = this.method654(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2112(this.field824 + 64, this.field828 + 768, -50, -10, -50);
            field807.method3275(var9, var7);
        }
        if (this.field811 >= 0) {
            var9 = var9.method2236(arg2, arg3, arg4, arg5, true, this.field811);
        }
        return var9;
    }

    @ObfuscatedName("ag.u(II[[IIIILac;IB)Ldp;")
    public final class112 method636(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field822 == null) {
            var9 = (long) ((this.field806 << 10) + arg1);
        } else {
            var9 = (long) ((this.field806 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field807.method3276(var9);
        if (var11 == null) {
            class101 var12 = this.method654(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2112(this.field824 + 64, this.field828 + 768, -50, -10, -50);
            field807.method3275(var11, var9);
        }
        if (arg6 == null && this.field811 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2263(true);
        } else {
            var13 = arg6.method698(var11, arg7, arg1);
        }
        if (this.field811 >= 0) {
            var13 = var13.method2236(arg2, arg3, arg4, arg5, false, this.field811);
        }
        return var13;
    }

    @ObfuscatedName("ag.o(III)Lcz;")
    public final class101 method654(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field822 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field810 == null) {
                return null;
            }
            boolean var4 = this.field832;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field810.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field810[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field805.method3276((long) var7);
                if (var3 == null) {
                    var3 = class101.method2067(Statics.field2005, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2073();
                    }
                    field805.method3275(var3, (long) var7);
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
            for (int var9 = 0; var9 < this.field822.length; var9++) {
                if (this.field822[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field810[var8];
            boolean var11 = this.field832 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field805.method3276((long) var10);
            if (var3 == null) {
                var3 = class101.method2067(Statics.field2005, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2073();
                }
                field805.method3275(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field834 == 128 && this.field835 == 128 && this.field809 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field843 == 0 && this.field838 == 0 && this.field839 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field813 == null, this.field829 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2130(256);
            var14.method2070(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2066();
        } else if (var15 == 2) {
            var14.method2114();
        } else if (var15 == 3) {
            var14.method2068();
        }
        if (this.field813 != null) {
            for (int var16 = 0; var16 < this.field813.length; var16++) {
                var14.method2071(this.field813[var16], this.field852[var16]);
            }
        }
        if (this.field829 != null) {
            for (int var17 = 0; var17 < this.field829.length; var17++) {
                var14.method2079(this.field829[var17], this.field816[var17]);
            }
        }
        if (var12) {
            var14.method2074(this.field834, this.field835, this.field809);
        }
        if (var13) {
            var14.method2070(this.field843, this.field838, this.field839);
        }
        return var14;
    }

    @ObfuscatedName("ag.g(B)Lag;")
    public final class32 method638() {
        int var1 = -1;
        if (this.field844 != -1) {
            var1 = class160.method315(this.field844);
        } else if (this.field845 != -1) {
            var1 = class160.field2717[this.field845];
        }
        return var1 < 0 || var1 >= this.field827.length || this.field827[var1] == -1 ? null : method874(this.field827[var1]);
    }

    @ObfuscatedName("ag.b(I)Z")
    public boolean method655() {
        if (this.field827 == null) {
            return this.field846 != -1 || this.field853 != null;
        }
        for (int var1 = 0; var1 < this.field827.length; var1++) {
            if (this.field827[var1] != -1) {
                class32 var2 = method874(this.field827[var1]);
                if (var2.field846 != -1 || var2.field853 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
