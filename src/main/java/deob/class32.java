package deob;

@ObfuscatedName("ai")
public class class32 extends class174 {

    @ObfuscatedName("ai.i")
    public static boolean field832 = false;

    @ObfuscatedName("ai.l")
    public static class170 field823 = new class170(64);

    @ObfuscatedName("ai.q")
    public static class170 field821 = new class170(500);

    @ObfuscatedName("ai.b")
    public static class170 field825 = new class170(30);

    @ObfuscatedName("ai.u")
    public static class170 field840 = new class170(30);

    @ObfuscatedName("ai.d")
    public static class101[] field859 = new class101[4];

    @ObfuscatedName("ai.m")
    public int field828;

    @ObfuscatedName("ai.v")
    public int[] field831;

    @ObfuscatedName("ai.j")
    public int[] field830;

    @ObfuscatedName("ai.f")
    public String field833 = "null";

    @ObfuscatedName("ai.h")
    public short[] field820;

    @ObfuscatedName("ai.o")
    public short[] field827;

    @ObfuscatedName("ai.z")
    public short[] field834;

    @ObfuscatedName("ai.k")
    public short[] field835;

    @ObfuscatedName("ai.y")
    public int field836 = 1;

    @ObfuscatedName("ai.g")
    public int field837 = 1;

    @ObfuscatedName("ai.e")
    public int field838 = 2;

    @ObfuscatedName("ai.s")
    public boolean field839 = true;

    @ObfuscatedName("ai.t")
    public int field857 = -1;

    @ObfuscatedName("ai.r")
    public int field826 = -1;

    @ObfuscatedName("ai.w")
    public boolean field842 = false;

    @ObfuscatedName("ai.x")
    public boolean field843 = false;

    @ObfuscatedName("ai.n")
    public int field844 = -1;

    @ObfuscatedName("ai.c")
    public int field829 = 16;

    @ObfuscatedName("ai.az")
    public int field870 = 0;

    @ObfuscatedName("ai.ax")
    public int field851 = 0;

    @ObfuscatedName("ai.aq")
    public String[] field848 = new String[5];

    @ObfuscatedName("ai.ap")
    public int field849 = -1;

    @ObfuscatedName("ai.aa")
    public int field850 = -1;

    @ObfuscatedName("ai.ai")
    public boolean field846 = false;

    @ObfuscatedName("ai.ar")
    public boolean field852 = true;

    @ObfuscatedName("ai.ag")
    public int field853 = 128;

    @ObfuscatedName("ai.as")
    public int field854 = 128;

    @ObfuscatedName("ai.ak")
    public int field855 = 128;

    @ObfuscatedName("ai.al")
    public int field847 = 0;

    @ObfuscatedName("ai.am")
    public int field845 = 0;

    @ObfuscatedName("ai.ao")
    public int field858 = 0;

    @ObfuscatedName("ai.ah")
    public int field824 = 0;

    @ObfuscatedName("ai.aw")
    public boolean field860 = false;

    @ObfuscatedName("ai.av")
    public boolean field861 = false;

    @ObfuscatedName("ai.au")
    public int field862 = -1;

    @ObfuscatedName("ai.af")
    public int[] field856;

    @ObfuscatedName("ai.ab")
    public int field864 = -1;

    @ObfuscatedName("ai.aj")
    public int field865 = -1;

    @ObfuscatedName("ai.ac")
    public int field866 = -1;

    @ObfuscatedName("ai.ay")
    public int field867 = 0;

    @ObfuscatedName("ai.ae")
    public int field868 = 0;

    @ObfuscatedName("ai.ad")
    public int field869 = 0;

    @ObfuscatedName("ai.an")
    public int[] field863;

    @ObfuscatedName("s.i(Lef;Lef;ZI)V")
    public static void method181(class152 arg0, class152 arg1, boolean arg2) {
        Statics.field872 = arg0;
        Statics.field822 = arg1;
        field832 = arg2;
    }

    @ObfuscatedName("bl.p(IB)Lai;")
    public static class32 method1460(int arg0) {
        class32 var1 = (class32) field823.method3223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field872.method2932(6, arg0);
        class32 var3 = new class32();
        var3.field828 = arg0;
        if (var2 != null) {
            var3.method631(new class127(var2));
        }
        var3.method630();
        if (var3.field861) {
            var3.field838 = 0;
            var3.field839 = false;
        }
        field823.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.a(I)V")
    public void method630() {
        if (this.field857 == -1) {
            this.field857 = 0;
            if (this.field831 != null && (this.field830 == null || this.field830[0] == 10)) {
                this.field857 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field848[var1] != null) {
                    this.field857 = 1;
                }
            }
        }
        if (this.field862 == -1) {
            this.field862 = this.field838 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.l(Ldn;I)V")
    public void method631(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method632(arg0, var2);
        }
    }

    @ObfuscatedName("ai.q(Ldn;II)V")
    public void method632(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2411();
            if (var3 > 0) {
                if (this.field831 == null || field832) {
                    this.field830 = new int[var3];
                    this.field831 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field831[var4] = arg0.method2413();
                        this.field830[var4] = arg0.method2411();
                    }
                } else {
                    arg0.field2037 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field833 = arg0.method2419();
        } else if (arg1 == 5) {
            int var5 = arg0.method2411();
            if (var5 > 0) {
                if (this.field831 == null || field832) {
                    this.field830 = null;
                    this.field831 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field831[var6] = arg0.method2413();
                    }
                } else {
                    arg0.field2037 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field836 = arg0.method2411();
        } else if (arg1 == 15) {
            this.field837 = arg0.method2411();
        } else if (arg1 == 17) {
            this.field838 = 0;
            this.field839 = false;
        } else if (arg1 == 18) {
            this.field839 = false;
        } else if (arg1 == 19) {
            this.field857 = arg0.method2411();
        } else if (arg1 == 21) {
            this.field826 = 0;
        } else if (arg1 == 22) {
            this.field842 = true;
        } else if (arg1 == 23) {
            this.field843 = true;
        } else if (arg1 == 24) {
            this.field844 = arg0.method2413();
            if (this.field844 == 65535) {
                this.field844 = -1;
            }
        } else if (arg1 == 27) {
            this.field838 = 1;
        } else if (arg1 == 28) {
            this.field829 = arg0.method2411();
        } else if (arg1 == 29) {
            this.field870 = arg0.method2475();
        } else if (arg1 == 39) {
            this.field851 = arg0.method2475() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field848[arg1 - 30] = arg0.method2419();
            if (this.field848[arg1 - 30].equalsIgnoreCase(class134.field2089)) {
                this.field848[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2411();
            this.field820 = new short[var7];
            this.field827 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field820[var8] = (short) arg0.method2413();
                this.field827[var8] = (short) arg0.method2413();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2411();
            this.field834 = new short[var9];
            this.field835 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field834[var10] = (short) arg0.method2413();
                this.field835[var10] = (short) arg0.method2413();
            }
        } else if (arg1 == 60) {
            this.field849 = arg0.method2413();
        } else if (arg1 == 62) {
            this.field846 = true;
        } else if (arg1 == 64) {
            this.field852 = false;
        } else if (arg1 == 65) {
            this.field853 = arg0.method2413();
        } else if (arg1 == 66) {
            this.field854 = arg0.method2413();
        } else if (arg1 == 67) {
            this.field855 = arg0.method2413();
        } else if (arg1 == 68) {
            this.field850 = arg0.method2413();
        } else if (arg1 == 69) {
            this.field824 = arg0.method2411();
        } else if (arg1 == 70) {
            this.field847 = arg0.method2414();
        } else if (arg1 == 71) {
            this.field845 = arg0.method2414();
        } else if (arg1 == 72) {
            this.field858 = arg0.method2414();
        } else if (arg1 == 73) {
            this.field860 = true;
        } else if (arg1 == 74) {
            this.field861 = true;
        } else if (arg1 == 75) {
            this.field862 = arg0.method2411();
        } else if (arg1 == 77) {
            this.field864 = arg0.method2413();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            this.field865 = arg0.method2413();
            if (this.field865 == 65535) {
                this.field865 = -1;
            }
            int var11 = arg0.method2411();
            this.field856 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field856[var12] = arg0.method2413();
                if (this.field856[var12] == 65535) {
                    this.field856[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field866 = arg0.method2413();
            this.field867 = arg0.method2411();
        } else if (arg1 == 79) {
            this.field868 = arg0.method2413();
            this.field869 = arg0.method2413();
            this.field867 = arg0.method2411();
            int var13 = arg0.method2411();
            this.field863 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field863[var14] = arg0.method2413();
            }
        } else if (arg1 == 81) {
            this.field826 = arg0.method2411() * 256;
        }
    }

    @ObfuscatedName("ai.b(II)Z")
    public final boolean method648(int arg0) {
        if (this.field830 != null) {
            for (int var4 = 0; var4 < this.field830.length; var4++) {
                if (this.field830[var4] == arg0) {
                    return Statics.field822.method2937(this.field831[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field831 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field831.length; var3++) {
                var2 &= Statics.field822.method2937(this.field831[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.u(B)Z")
    public final boolean method634() {
        if (this.field831 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field831.length; var2++) {
            var1 &= Statics.field822.method2937(this.field831[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.d(II[[IIIIB)Lcv;")
    public final class94 method668(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field830 == null) {
            var7 = (long) ((this.field828 << 10) + arg1);
        } else {
            var7 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field825.method3223(var7);
        if (var9 == null) {
            class101 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field842) {
                var10.field1720 = (short) (this.field870 + 64);
                var10.field1721 = (short) (this.field851 + 768);
                var10.method2055();
                var9 = var10;
            } else {
                var9 = var10.method2006(this.field870 + 64, this.field851 + 768, -50, -10, -50);
            }
            field825.method3225(var9, var7);
        }
        if (this.field842) {
            var9 = ((class101) var9).method1991();
        }
        if (this.field826 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2170(arg2, arg3, arg4, arg5, true, this.field826);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method1992(arg2, arg3, arg4, arg5, true, this.field826);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.m(II[[IIIIB)Ldc;")
    public final class112 method666(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field830 == null) {
            var7 = (long) ((this.field828 << 10) + arg1);
        } else {
            var7 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field840.method3223(var7);
        if (var9 == null) {
            class101 var10 = this.method638(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2006(this.field870 + 64, this.field851 + 768, -50, -10, -50);
            field840.method3225(var9, var7);
        }
        if (this.field826 >= 0) {
            var9 = var9.method2170(arg2, arg3, arg4, arg5, true, this.field826);
        }
        return var9;
    }

    @ObfuscatedName("ai.v(II[[IIIILag;II)Ldc;")
    public final class112 method669(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field830 == null) {
            var9 = (long) ((this.field828 << 10) + arg1);
        } else {
            var9 = (long) ((this.field828 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field840.method3223(var9);
        if (var11 == null) {
            class101 var12 = this.method638(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2006(this.field870 + 64, this.field851 + 768, -50, -10, -50);
            field840.method3225(var11, var9);
        }
        if (arg6 == null && this.field826 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2239(true);
        } else {
            var13 = arg6.method693(var11, arg7, arg1);
        }
        if (this.field826 >= 0) {
            var13 = var13.method2170(arg2, arg3, arg4, arg5, false, this.field826);
        }
        return var13;
    }

    @ObfuscatedName("ai.j(III)Lcm;")
    public final class101 method638(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field830 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field831 == null) {
                return null;
            }
            boolean var4 = this.field846;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field831.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field831[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field821.method3223((long) var7);
                if (var3 == null) {
                    var3 = class101.method2035(Statics.field822, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1998();
                    }
                    field821.method3225(var3, (long) var7);
                }
                if (var5 > 1) {
                    field859[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field859, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field830.length; var9++) {
                if (this.field830[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field831[var8];
            boolean var11 = this.field846 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field821.method3223((long) var10);
            if (var3 == null) {
                var3 = class101.method2035(Statics.field822, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1998();
                }
                field821.method3225(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field853 == 128 && this.field854 == 128 && this.field855 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field847 == 0 && this.field845 == 0 && this.field858 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field820 == null, this.field834 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2026(256);
            var14.method1983(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1994();
        } else if (var15 == 2) {
            var14.method2014();
        } else if (var15 == 3) {
            var14.method1996();
        }
        if (this.field820 != null) {
            for (int var16 = 0; var16 < this.field820.length; var16++) {
                var14.method1999(this.field820[var16], this.field827[var16]);
            }
        }
        if (this.field834 != null) {
            for (int var17 = 0; var17 < this.field834.length; var17++) {
                var14.method2029(this.field834[var17], this.field835[var17]);
            }
        }
        if (var12) {
            var14.method2018(this.field853, this.field854, this.field855);
        }
        if (var13) {
            var14.method1983(this.field847, this.field845, this.field858);
        }
        return var14;
    }

    @ObfuscatedName("ai.f(B)Lai;")
    public final class32 method639() {
        int var1 = -1;
        if (this.field864 != -1) {
            var1 = class159.method1461(this.field864);
        } else if (this.field865 != -1) {
            var1 = class159.field2709[this.field865];
        }
        return var1 < 0 || var1 >= this.field856.length || this.field856[var1] == -1 ? null : method1460(this.field856[var1]);
    }

    @ObfuscatedName("ai.h(B)Z")
    public boolean method654() {
        if (this.field856 == null) {
            return this.field866 != -1 || this.field863 != null;
        }
        for (int var1 = 0; var1 < this.field856.length; var1++) {
            if (this.field856[var1] != -1) {
                class32 var2 = method1460(this.field856[var1]);
                if (var2.field866 != -1 || var2.field863 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
