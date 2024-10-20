package deob;

@ObfuscatedName("av")
public class class33 extends class176 {

    @ObfuscatedName("av.e")
    public static boolean field837 = false;

    @ObfuscatedName("av.q")
    public static class172 field860 = new class172(64);

    @ObfuscatedName("av.j")
    public static class172 field843 = new class172(500);

    @ObfuscatedName("av.z")
    public static class172 field839 = new class172(30);

    @ObfuscatedName("av.m")
    public static class172 field882 = new class172(30);

    @ObfuscatedName("av.w")
    public static class102[] field835 = new class102[4];

    @ObfuscatedName("av.a")
    public int field840;

    @ObfuscatedName("av.d")
    public int[] field858;

    @ObfuscatedName("av.u")
    public int[] field842;

    @ObfuscatedName("av.p")
    public String field832 = "null";

    @ObfuscatedName("av.t")
    public short[] field844;

    @ObfuscatedName("av.g")
    public short[] field845;

    @ObfuscatedName("av.o")
    public short[] field846;

    @ObfuscatedName("av.x")
    public short[] field847;

    @ObfuscatedName("av.c")
    public int field848 = 1;

    @ObfuscatedName("av.b")
    public int field865 = 1;

    @ObfuscatedName("av.f")
    public int field850 = 2;

    @ObfuscatedName("av.s")
    public boolean field851 = true;

    @ObfuscatedName("av.y")
    public int field852 = -1;

    @ObfuscatedName("av.r")
    public int field853 = -1;

    @ObfuscatedName("av.l")
    public boolean field854 = false;

    @ObfuscatedName("av.n")
    public boolean field855 = false;

    @ObfuscatedName("av.h")
    public int field856 = -1;

    @ObfuscatedName("av.v")
    public int field857 = 16;

    @ObfuscatedName("av.ax")
    public int field836 = 0;

    @ObfuscatedName("av.ao")
    public int field859 = 0;

    @ObfuscatedName("av.al")
    public String[] field841 = new String[5];

    @ObfuscatedName("av.ap")
    public int field871 = -1;

    @ObfuscatedName("av.ak")
    public int field878 = -1;

    @ObfuscatedName("av.aw")
    public boolean field863 = false;

    @ObfuscatedName("av.av")
    public boolean field864 = true;

    @ObfuscatedName("av.ah")
    public int field838 = 128;

    @ObfuscatedName("av.ae")
    public int field866 = 128;

    @ObfuscatedName("av.am")
    public int field867 = 128;

    @ObfuscatedName("av.aq")
    public int field868 = 0;

    @ObfuscatedName("av.ai")
    public int field869 = 0;

    @ObfuscatedName("av.an")
    public int field870 = 0;

    @ObfuscatedName("av.aa")
    public boolean field872 = false;

    @ObfuscatedName("av.ad")
    public boolean field861 = false;

    @ObfuscatedName("av.az")
    public int field873 = -1;

    @ObfuscatedName("av.ar")
    public int[] field874;

    @ObfuscatedName("av.at")
    public int field875 = -1;

    @ObfuscatedName("av.af")
    public int field876 = -1;

    @ObfuscatedName("av.ay")
    public int field877 = -1;

    @ObfuscatedName("av.as")
    public int field849 = 0;

    @ObfuscatedName("av.ag")
    public int field879 = 0;

    @ObfuscatedName("av.ac")
    public int field880 = 0;

    @ObfuscatedName("av.aj")
    public int[] field881;

    @ObfuscatedName("cy.e(Lea;Lea;ZI)V")
    public static void method2045(class155 arg0, class155 arg1, boolean arg2) {
        Statics.field833 = arg0;
        Statics.field834 = arg1;
        field837 = arg2;
    }

    @ObfuscatedName("ax.i(II)Lav;")
    public static class33 method266(int arg0) {
        class33 var1 = (class33) field860.method3262((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field833.method3069(6, arg0);
        class33 var3 = new class33();
        var3.field840 = arg0;
        if (var2 != null) {
            var3.method696(new class128(var2));
        }
        var3.method683();
        if (var3.field861) {
            var3.field850 = 0;
            var3.field851 = false;
        }
        field860.method3264(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.k(I)V")
    public void method683() {
        if (this.field852 == -1) {
            this.field852 = 0;
            if (this.field858 != null && (this.field842 == null || this.field842[0] == 10)) {
                this.field852 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field841[var1] != null) {
                    this.field852 = 1;
                }
            }
        }
        if (this.field873 == -1) {
            this.field873 = this.field850 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.q(Ldl;I)V")
    public void method696(class128 arg0) {
        while (true) {
            int var2 = arg0.method2548();
            if (var2 == 0) {
                return;
            }
            this.method687(arg0, var2);
        }
    }

    @ObfuscatedName("av.j(Ldl;IB)V")
    public void method687(class128 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2548();
            if (var3 > 0) {
                if (this.field858 == null || field837) {
                    this.field842 = new int[var3];
                    this.field858 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field858[var4] = arg0.method2456();
                        this.field842[var4] = arg0.method2548();
                    }
                } else {
                    arg0.field2045 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field832 = arg0.method2559();
        } else if (arg1 == 5) {
            int var5 = arg0.method2548();
            if (var5 > 0) {
                if (this.field858 == null || field837) {
                    this.field842 = null;
                    this.field858 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field858[var6] = arg0.method2456();
                    }
                } else {
                    arg0.field2045 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field848 = arg0.method2548();
        } else if (arg1 == 15) {
            this.field865 = arg0.method2548();
        } else if (arg1 == 17) {
            this.field850 = 0;
            this.field851 = false;
        } else if (arg1 == 18) {
            this.field851 = false;
        } else if (arg1 == 19) {
            this.field852 = arg0.method2548();
        } else if (arg1 == 21) {
            this.field853 = 0;
        } else if (arg1 == 22) {
            this.field854 = true;
        } else if (arg1 == 23) {
            this.field855 = true;
        } else if (arg1 == 24) {
            this.field856 = arg0.method2456();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
        } else if (arg1 == 27) {
            this.field850 = 1;
        } else if (arg1 == 28) {
            this.field857 = arg0.method2548();
        } else if (arg1 == 29) {
            this.field836 = arg0.method2455();
        } else if (arg1 == 39) {
            this.field859 = arg0.method2455();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field841[arg1 - 30] = arg0.method2559();
            if (this.field841[arg1 - 30].equalsIgnoreCase(class137.field2310)) {
                this.field841[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2548();
            this.field844 = new short[var7];
            this.field845 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field844[var8] = (short) arg0.method2456();
                this.field845[var8] = (short) arg0.method2456();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2548();
            this.field846 = new short[var9];
            this.field847 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field846[var10] = (short) arg0.method2456();
                this.field847[var10] = (short) arg0.method2456();
            }
        } else if (arg1 == 60) {
            this.field871 = arg0.method2456();
        } else if (arg1 == 62) {
            this.field863 = true;
        } else if (arg1 == 64) {
            this.field864 = false;
        } else if (arg1 == 65) {
            this.field838 = arg0.method2456();
        } else if (arg1 == 66) {
            this.field866 = arg0.method2456();
        } else if (arg1 == 67) {
            this.field867 = arg0.method2456();
        } else if (arg1 == 68) {
            this.field878 = arg0.method2456();
        } else if (arg1 == 69) {
            arg0.method2548();
        } else if (arg1 == 70) {
            this.field868 = arg0.method2457();
        } else if (arg1 == 71) {
            this.field869 = arg0.method2457();
        } else if (arg1 == 72) {
            this.field870 = arg0.method2457();
        } else if (arg1 == 73) {
            this.field872 = true;
        } else if (arg1 == 74) {
            this.field861 = true;
        } else if (arg1 == 75) {
            this.field873 = arg0.method2548();
        } else if (arg1 == 77) {
            this.field875 = arg0.method2456();
            if (this.field875 == 65535) {
                this.field875 = -1;
            }
            this.field876 = arg0.method2456();
            if (this.field876 == 65535) {
                this.field876 = -1;
            }
            int var11 = arg0.method2548();
            this.field874 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field874[var12] = arg0.method2456();
                if (this.field874[var12] == 65535) {
                    this.field874[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field877 = arg0.method2456();
            this.field849 = arg0.method2548();
        } else if (arg1 == 79) {
            this.field879 = arg0.method2456();
            this.field880 = arg0.method2456();
            this.field849 = arg0.method2548();
            int var13 = arg0.method2548();
            this.field881 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field881[var14] = arg0.method2456();
            }
        } else if (arg1 == 81) {
            this.field853 = arg0.method2548() * 256;
        }
    }

    @ObfuscatedName("av.z(II)Z")
    public final boolean method686(int arg0) {
        if (this.field842 != null) {
            for (int var4 = 0; var4 < this.field842.length; var4++) {
                if (this.field842[var4] == arg0) {
                    return Statics.field834.method3022(this.field858[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field858 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field858.length; var3++) {
                var2 &= Statics.field834.method3022(this.field858[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.m(I)Z")
    public final boolean method684() {
        if (this.field858 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field858.length; var2++) {
            var1 &= Statics.field834.method3022(this.field858[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.w(II[[IIIIS)Lco;")
    public final class95 method688(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field842 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class95 var9 = (class95) field839.method3262(var7);
        if (var9 == null) {
            class102 var10 = this.method691(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field854) {
                var10.field1684 = (short) (this.field836 + 64);
                var10.field1681 = (short) (this.field859 * 25 + 768);
                var10.method2066();
                var9 = var10;
            } else {
                var9 = var10.method2054(this.field836 + 64, this.field859 * 25 + 768, -50, -10, -50);
            }
            field839.method3264(var9, var7);
        }
        if (this.field854) {
            var9 = ((class102) var9).method2074();
        }
        if (this.field853 >= 0) {
            if (var9 instanceof class113) {
                var9 = ((class113) var9).method2242(arg2, arg3, arg4, arg5, true, this.field853);
            } else if (var9 instanceof class102) {
                var9 = ((class102) var9).method2093(arg2, arg3, arg4, arg5, true, this.field853);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.a(II[[IIIII)Ldo;")
    public final class113 method689(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field842 == null) {
            var7 = (long) ((this.field840 << 10) + arg1);
        } else {
            var7 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class113 var9 = (class113) field882.method3262(var7);
        if (var9 == null) {
            class102 var10 = this.method691(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2054(this.field836 + 64, this.field859 * 25 + 768, -50, -10, -50);
            field882.method3264(var9, var7);
        }
        if (this.field853 >= 0) {
            var9 = var9.method2242(arg2, arg3, arg4, arg5, true, this.field853);
        }
        return var9;
    }

    @ObfuscatedName("av.d(II[[IIIILae;II)Ldo;")
    public final class113 method690(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class35 arg6, int arg7) {
        long var9;
        if (this.field842 == null) {
            var9 = (long) ((this.field840 << 10) + arg1);
        } else {
            var9 = (long) ((this.field840 << 10) + (arg0 << 3) + arg1);
        }
        class113 var11 = (class113) field882.method3262(var9);
        if (var11 == null) {
            class102 var12 = this.method691(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2054(this.field836 + 64, this.field859 * 25 + 768, -50, -10, -50);
            field882.method3264(var11, var9);
        }
        if (arg6 == null && this.field853 == -1) {
            return var11;
        }
        class113 var13;
        if (arg6 == null) {
            var13 = var11.method2300(true);
        } else {
            var13 = arg6.method758(var11, arg7, arg1);
        }
        if (this.field853 >= 0) {
            var13 = var13.method2242(arg2, arg3, arg4, arg5, false, this.field853);
        }
        return var13;
    }

    @ObfuscatedName("av.u(III)Lcq;")
    public final class102 method691(int arg0, int arg1) {
        class102 var3 = null;
        if (this.field842 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field858 == null) {
                return null;
            }
            boolean var4 = this.field863;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field858.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field858[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class102) field843.method3262((long) var7);
                if (var3 == null) {
                    var3 = class102.method2051(Statics.field834, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2061();
                    }
                    field843.method3264(var3, (long) var7);
                }
                if (var5 > 1) {
                    field835[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class102(field835, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field842.length; var9++) {
                if (this.field842[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field858[var8];
            boolean var11 = this.field863 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class102) field843.method3262((long) var10);
            if (var3 == null) {
                var3 = class102.method2051(Statics.field834, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2061();
                }
                field843.method3264(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field838 == 128 && this.field866 == 128 && this.field867 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field868 == 0 && this.field869 == 0 && this.field870 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class102 var14 = new class102(var3, arg1 == 0 && !var12 && !var13, this.field844 == null, this.field846 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2064(256);
            var14.method2077(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2119();
        } else if (var15 == 2) {
            var14.method2059();
        } else if (var15 == 3) {
            var14.method2060();
        }
        if (this.field844 != null) {
            for (int var16 = 0; var16 < this.field844.length; var16++) {
                var14.method2063(this.field844[var16], this.field845[var16]);
            }
        }
        if (this.field846 != null) {
            for (int var17 = 0; var17 < this.field846.length; var17++) {
                var14.method2104(this.field846[var17], this.field847[var17]);
            }
        }
        if (var12) {
            var14.method2065(this.field838, this.field866, this.field867);
        }
        if (var13) {
            var14.method2077(this.field868, this.field869, this.field870);
        }
        return var14;
    }

    @ObfuscatedName("av.p(I)Lav;")
    public final class33 method692() {
        int var1 = -1;
        if (this.field875 != -1) {
            var1 = class162.method3010(this.field875);
        } else if (this.field876 != -1) {
            var1 = class162.field2748[this.field876];
        }
        return var1 < 0 || var1 >= this.field874.length || this.field874[var1] == -1 ? null : method266(this.field874[var1]);
    }

    @ObfuscatedName("av.t(I)Z")
    public boolean method707() {
        if (this.field874 == null) {
            return this.field877 != -1 || this.field881 != null;
        }
        for (int var1 = 0; var1 < this.field874.length; var1++) {
            if (this.field874[var1] != -1) {
                class33 var2 = method266(this.field874[var1]);
                if (var2.field877 != -1 || var2.field881 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
