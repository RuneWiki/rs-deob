package deob;

@ObfuscatedName("ad")
public class class32 extends class174 {

    @ObfuscatedName("ad.p")
    public static boolean field833 = false;

    @ObfuscatedName("ad.n")
    public static class170 field848 = new class170(64);

    @ObfuscatedName("ad.l")
    public static class170 field828 = new class170(500);

    @ObfuscatedName("ad.v")
    public static class170 field817 = new class170(30);

    @ObfuscatedName("ad.g")
    public static class170 field818 = new class170(30);

    @ObfuscatedName("ad.x")
    public static class101[] field819 = new class101[4];

    @ObfuscatedName("ad.c")
    public int field813;

    @ObfuscatedName("ad.f")
    public int[] field821;

    @ObfuscatedName("ad.r")
    public int[] field822;

    @ObfuscatedName("ad.d")
    public String field815 = "null";

    @ObfuscatedName("ad.a")
    public short[] field824;

    @ObfuscatedName("ad.q")
    public short[] field825;

    @ObfuscatedName("ad.u")
    public short[] field846;

    @ObfuscatedName("ad.w")
    public short[] field827;

    @ObfuscatedName("ad.s")
    public int field829 = 1;

    @ObfuscatedName("ad.e")
    public int field854 = 1;

    @ObfuscatedName("ad.b")
    public int field816 = 2;

    @ObfuscatedName("ad.j")
    public boolean field831 = true;

    @ObfuscatedName("ad.h")
    public int field832 = -1;

    @ObfuscatedName("ad.m")
    public int field838 = -1;

    @ObfuscatedName("ad.y")
    public boolean field850 = false;

    @ObfuscatedName("ad.t")
    public boolean field835 = false;

    @ObfuscatedName("ad.k")
    public int field836 = -1;

    @ObfuscatedName("ad.z")
    public int field837 = 16;

    @ObfuscatedName("ad.at")
    public int field858 = 0;

    @ObfuscatedName("ad.ay")
    public int field839 = 0;

    @ObfuscatedName("ad.ae")
    public String[] field840 = new String[5];

    @ObfuscatedName("ad.af")
    public int field841 = -1;

    @ObfuscatedName("ad.ao")
    public int field842 = -1;

    @ObfuscatedName("ad.ad")
    public boolean field843 = false;

    @ObfuscatedName("ad.aj")
    public boolean field844 = true;

    @ObfuscatedName("ad.ah")
    public int field845 = 128;

    @ObfuscatedName("ad.aq")
    public int field834 = 128;

    @ObfuscatedName("ad.ar")
    public int field847 = 128;

    @ObfuscatedName("ad.aa")
    public int field830 = 0;

    @ObfuscatedName("ad.an")
    public int field849 = 0;

    @ObfuscatedName("ad.ab")
    public int field820 = 0;

    @ObfuscatedName("ad.ai")
    public int field851 = 0;

    @ObfuscatedName("ad.ac")
    public boolean field852 = false;

    @ObfuscatedName("ad.ak")
    public boolean field853 = false;

    @ObfuscatedName("ad.au")
    public int field826 = -1;

    @ObfuscatedName("ad.am")
    public int[] field855;

    @ObfuscatedName("ad.ag")
    public int field856 = -1;

    @ObfuscatedName("ad.al")
    public int field857 = -1;

    @ObfuscatedName("ad.av")
    public int field823 = -1;

    @ObfuscatedName("ad.aw")
    public int field859 = 0;

    @ObfuscatedName("ad.ax")
    public int field860 = 0;

    @ObfuscatedName("ad.az")
    public int field861 = 0;

    @ObfuscatedName("ad.ap")
    public int[] field862;

    @ObfuscatedName("client.p(Lep;Lep;ZB)V")
    public static void method574(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field814 = arg0;
        Statics.field1388 = arg1;
        field833 = arg2;
    }

    @ObfuscatedName("fa.i(II)Lad;")
    public static class32 method3258(int arg0) {
        class32 var1 = (class32) field848.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field814.method3049(6, arg0);
        class32 var3 = new class32();
        var3.field813 = arg0;
        if (var2 != null) {
            var3.method670(new class127(var2));
        }
        var3.method704();
        if (var3.field853) {
            var3.field816 = 0;
            var3.field831 = false;
        }
        field848.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.o(I)V")
    public void method704() {
        if (this.field832 == -1) {
            this.field832 = 0;
            if (this.field821 != null && (this.field822 == null || this.field822[0] == 10)) {
                this.field832 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field840[var1] != null) {
                    this.field832 = 1;
                }
            }
        }
        if (this.field826 == -1) {
            this.field826 = this.field816 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ad.n(Ldt;S)V")
    public void method670(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method671(arg0, var2);
        }
    }

    @ObfuscatedName("ad.l(Ldt;II)V")
    public void method671(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2659();
            if (var3 > 0) {
                if (this.field821 == null || field833) {
                    this.field822 = new int[var3];
                    this.field821 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field821[var4] = arg0.method2652();
                        this.field822[var4] = arg0.method2659();
                    }
                } else {
                    arg0.field2038 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field815 = arg0.method2490();
        } else if (arg1 == 5) {
            int var5 = arg0.method2659();
            if (var5 > 0) {
                if (this.field821 == null || field833) {
                    this.field822 = null;
                    this.field821 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field821[var6] = arg0.method2652();
                    }
                } else {
                    arg0.field2038 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field829 = arg0.method2659();
        } else if (arg1 == 15) {
            this.field854 = arg0.method2659();
        } else if (arg1 == 17) {
            this.field816 = 0;
            this.field831 = false;
        } else if (arg1 == 18) {
            this.field831 = false;
        } else if (arg1 == 19) {
            this.field832 = arg0.method2659();
        } else if (arg1 == 21) {
            this.field838 = 0;
        } else if (arg1 == 22) {
            this.field850 = true;
        } else if (arg1 == 23) {
            this.field835 = true;
        } else if (arg1 == 24) {
            this.field836 = arg0.method2652();
            if (this.field836 == 65535) {
                this.field836 = -1;
            }
        } else if (arg1 == 27) {
            this.field816 = 1;
        } else if (arg1 == 28) {
            this.field837 = arg0.method2659();
        } else if (arg1 == 29) {
            this.field858 = arg0.method2656();
        } else if (arg1 == 39) {
            this.field839 = arg0.method2656();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field840[arg1 - 30] = arg0.method2490();
            if (this.field840[arg1 - 30].equalsIgnoreCase(class134.field2091)) {
                this.field840[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2659();
            this.field824 = new short[var7];
            this.field825 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field824[var8] = (short) arg0.method2652();
                this.field825[var8] = (short) arg0.method2652();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2659();
            this.field846 = new short[var9];
            this.field827 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field846[var10] = (short) arg0.method2652();
                this.field827[var10] = (short) arg0.method2652();
            }
        } else if (arg1 == 60) {
            this.field841 = arg0.method2652();
        } else if (arg1 == 62) {
            this.field843 = true;
        } else if (arg1 == 64) {
            this.field844 = false;
        } else if (arg1 == 65) {
            this.field845 = arg0.method2652();
        } else if (arg1 == 66) {
            this.field834 = arg0.method2652();
        } else if (arg1 == 67) {
            this.field847 = arg0.method2652();
        } else if (arg1 == 68) {
            this.field842 = arg0.method2652();
        } else if (arg1 == 69) {
            this.field851 = arg0.method2659();
        } else if (arg1 == 70) {
            this.field830 = arg0.method2588();
        } else if (arg1 == 71) {
            this.field849 = arg0.method2588();
        } else if (arg1 == 72) {
            this.field820 = arg0.method2588();
        } else if (arg1 == 73) {
            this.field852 = true;
        } else if (arg1 == 74) {
            this.field853 = true;
        } else if (arg1 == 75) {
            this.field826 = arg0.method2659();
        } else if (arg1 == 77) {
            this.field856 = arg0.method2652();
            if (this.field856 == 65535) {
                this.field856 = -1;
            }
            this.field857 = arg0.method2652();
            if (this.field857 == 65535) {
                this.field857 = -1;
            }
            int var11 = arg0.method2659();
            this.field855 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field855[var12] = arg0.method2652();
                if (this.field855[var12] == 65535) {
                    this.field855[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field823 = arg0.method2652();
            this.field859 = arg0.method2659();
        } else if (arg1 == 79) {
            this.field860 = arg0.method2652();
            this.field861 = arg0.method2652();
            this.field859 = arg0.method2659();
            int var13 = arg0.method2659();
            this.field862 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field862[var14] = arg0.method2652();
            }
        } else if (arg1 == 81) {
            this.field838 = arg0.method2659() * 256;
        }
    }

    @ObfuscatedName("ad.v(II)Z")
    public final boolean method700(int arg0) {
        if (this.field822 != null) {
            for (int var4 = 0; var4 < this.field822.length; var4++) {
                if (this.field822[var4] == arg0) {
                    return Statics.field1388.method3038(this.field821[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field821 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field821.length; var3++) {
                var2 &= Statics.field1388.method3038(this.field821[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ad.g(I)Z")
    public final boolean method672() {
        if (this.field821 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field821.length; var2++) {
            var1 &= Statics.field1388.method3038(this.field821[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ad.x(II[[IIIII)Lcx;")
    public final class94 method673(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field813 << 10) + arg1);
        } else {
            var7 = (long) ((this.field813 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field817.method3264(var7);
        if (var9 == null) {
            class101 var10 = this.method710(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field850) {
                var10.field1721 = (short) (this.field858 + 64);
                var10.field1712 = (short) (this.field839 * 25 + 768);
                var10.method2095();
                var9 = var10;
            } else {
                var9 = var10.method2099(this.field858 + 64, this.field839 * 25 + 768, -50, -10, -50);
            }
            field817.method3269(var9, var7);
        }
        if (this.field850) {
            var9 = ((class101) var9).method2129();
        }
        if (this.field838 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2330(arg2, arg3, arg4, arg5, true, this.field838);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2080(arg2, arg3, arg4, arg5, true, this.field838);
            }
        }
        return var9;
    }

    @ObfuscatedName("ad.c(II[[IIIII)Ldj;")
    public final class112 method707(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field822 == null) {
            var7 = (long) ((this.field813 << 10) + arg1);
        } else {
            var7 = (long) ((this.field813 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field818.method3264(var7);
        if (var9 == null) {
            class101 var10 = this.method710(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2099(this.field858 + 64, this.field839 * 25 + 768, -50, -10, -50);
            field818.method3269(var9, var7);
        }
        if (this.field838 >= 0) {
            var9 = var9.method2330(arg2, arg3, arg4, arg5, true, this.field838);
        }
        return var9;
    }

    @ObfuscatedName("ad.f(II[[IIIILah;II)Ldj;")
    public final class112 method675(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field822 == null) {
            var9 = (long) ((this.field813 << 10) + arg1);
        } else {
            var9 = (long) ((this.field813 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field818.method3264(var9);
        if (var11 == null) {
            class101 var12 = this.method710(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2099(this.field858 + 64, this.field839 * 25 + 768, -50, -10, -50);
            field818.method3269(var11, var9);
        }
        if (arg6 == null && this.field838 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2268(true);
        } else {
            var13 = arg6.method737(var11, arg7, arg1);
        }
        if (this.field838 >= 0) {
            var13 = var13.method2330(arg2, arg3, arg4, arg5, false, this.field838);
        }
        return var13;
    }

    @ObfuscatedName("ad.r(IIB)Lcf;")
    public final class101 method710(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field822 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field821 == null) {
                return null;
            }
            boolean var4 = this.field843;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field821.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field821[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field828.method3264((long) var7);
                if (var3 == null) {
                    var3 = class101.method2078(Statics.field1388, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2084();
                    }
                    field828.method3269(var3, (long) var7);
                }
                if (var5 > 1) {
                    field819[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field819, var5);
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
            int var10 = this.field821[var8];
            boolean var11 = this.field843 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field828.method3264((long) var10);
            if (var3 == null) {
                var3 = class101.method2078(Statics.field1388, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2084();
                }
                field828.method3269(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field845 == 128 && this.field834 == 128 && this.field847 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field830 == 0 && this.field849 == 0 && this.field820 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field824 == null, this.field846 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2077(256);
            var14.method2156(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2087();
        } else if (var15 == 2) {
            var14.method2150();
        } else if (var15 == 3) {
            var14.method2136();
        }
        if (this.field824 != null) {
            for (int var16 = 0; var16 < this.field824.length; var16++) {
                var14.method2092(this.field824[var16], this.field825[var16]);
            }
        }
        if (this.field846 != null) {
            for (int var17 = 0; var17 < this.field846.length; var17++) {
                var14.method2093(this.field846[var17], this.field827[var17]);
            }
        }
        if (var12) {
            var14.method2148(this.field845, this.field834, this.field847);
        }
        if (var13) {
            var14.method2156(this.field830, this.field849, this.field820);
        }
        return var14;
    }

    @ObfuscatedName("ad.d(I)Lad;")
    public final class32 method677() {
        int var1 = -1;
        if (this.field856 != -1) {
            var1 = class159.method1349(this.field856);
        } else if (this.field857 != -1) {
            var1 = class159.field2703[this.field857];
        }
        return var1 < 0 || var1 >= this.field855.length || this.field855[var1] == -1 ? null : method3258(this.field855[var1]);
    }

    @ObfuscatedName("u.a(I)V")
    public static void method153() {
        field848.method3265();
        field828.method3265();
        field817.method3265();
        field818.method3265();
    }

    @ObfuscatedName("ad.q(I)Z")
    public boolean method678() {
        if (this.field855 == null) {
            return this.field823 != -1 || this.field862 != null;
        }
        for (int var1 = 0; var1 < this.field855.length; var1++) {
            if (this.field855[var1] != -1) {
                class32 var2 = method3258(this.field855[var1]);
                if (var2.field823 != -1 || var2.field862 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
