package deob;

@ObfuscatedName("av")
public class class31 extends class173 {

    @ObfuscatedName("av.u")
    public static boolean field845 = false;

    @ObfuscatedName("av.m")
    public static class169 field842 = new class169(64);

    @ObfuscatedName("av.n")
    public static class169 field812 = new class169(500);

    @ObfuscatedName("av.q")
    public static class169 field813 = new class169(30);

    @ObfuscatedName("av.a")
    public static class169 field814 = new class169(30);

    @ObfuscatedName("av.g")
    public static class100[] field815 = new class100[4];

    @ObfuscatedName("av.j")
    public int field816;

    @ObfuscatedName("av.l")
    public int[] field817;

    @ObfuscatedName("av.w")
    public int[] field818;

    @ObfuscatedName("av.z")
    public String field819 = "null";

    @ObfuscatedName("av.e")
    public short[] field820;

    @ObfuscatedName("av.b")
    public short[] field853;

    @ObfuscatedName("av.c")
    public short[] field822;

    @ObfuscatedName("av.d")
    public short[] field838;

    @ObfuscatedName("av.h")
    public int field852 = 1;

    @ObfuscatedName("av.i")
    public int field840 = 1;

    @ObfuscatedName("av.v")
    public int field826 = 2;

    @ObfuscatedName("av.s")
    public boolean field827 = true;

    @ObfuscatedName("av.f")
    public int field811 = -1;

    @ObfuscatedName("av.y")
    public int field829 = -1;

    @ObfuscatedName("av.t")
    public boolean field830 = false;

    @ObfuscatedName("av.r")
    public boolean field836 = false;

    @ObfuscatedName("av.p")
    public int field832 = -1;

    @ObfuscatedName("av.o")
    public int field833 = 16;

    @ObfuscatedName("av.ax")
    public int field824 = 0;

    @ObfuscatedName("av.aa")
    public int field835 = 0;

    @ObfuscatedName("av.af")
    public String[] field823 = new String[5];

    @ObfuscatedName("av.al")
    public int field837 = -1;

    @ObfuscatedName("av.av")
    public int field808 = -1;

    @ObfuscatedName("av.ab")
    public boolean field844 = false;

    @ObfuscatedName("av.ad")
    public boolean field821 = true;

    @ObfuscatedName("av.ai")
    public int field841 = 128;

    @ObfuscatedName("av.ak")
    public int field828 = 128;

    @ObfuscatedName("av.ao")
    public int field843 = 128;

    @ObfuscatedName("av.aq")
    public int field846 = 0;

    @ObfuscatedName("av.aj")
    public int field831 = 0;

    @ObfuscatedName("av.ag")
    public int field857 = 0;

    @ObfuscatedName("av.ap")
    public int field847 = 0;

    @ObfuscatedName("av.an")
    public boolean field848 = false;

    @ObfuscatedName("av.as")
    public boolean field810 = false;

    @ObfuscatedName("av.au")
    public int field850 = -1;

    @ObfuscatedName("av.ay")
    public int[] field851;

    @ObfuscatedName("av.ah")
    public int field834 = -1;

    @ObfuscatedName("av.aw")
    public int field839 = -1;

    @ObfuscatedName("av.ac")
    public int field854 = -1;

    @ObfuscatedName("av.az")
    public int field855 = 0;

    @ObfuscatedName("av.am")
    public int field856 = 0;

    @ObfuscatedName("av.ae")
    public int field825 = 0;

    @ObfuscatedName("av.at")
    public int[] field858;

    @ObfuscatedName("e.u(II)Lav;")
    public static class31 method132(int arg0) {
        class31 var1 = (class31) field842.method3263((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field809.method2965(6, arg0);
        class31 var3 = new class31();
        var3.field816 = arg0;
        if (var2 != null) {
            var3.method615(new class126(var2));
        }
        var3.method614();
        if (var3.field810) {
            var3.field826 = 0;
            var3.field827 = false;
        }
        field842.method3260(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.k(B)V")
    public void method614() {
        if (this.field811 == -1) {
            this.field811 = 0;
            if (this.field817 != null && (this.field818 == null || this.field818[0] == 10)) {
                this.field811 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field823[var1] != null) {
                    this.field811 = 1;
                }
            }
        }
        if (this.field850 == -1) {
            this.field850 = this.field826 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.x(Ldl;I)V")
    public void method615(class126 arg0) {
        while (true) {
            int var2 = arg0.method2559();
            if (var2 == 0) {
                return;
            }
            this.method648(arg0, var2);
        }
    }

    @ObfuscatedName("av.m(Ldl;II)V")
    public void method648(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2559();
            if (var3 > 0) {
                if (this.field817 == null || field845) {
                    this.field818 = new int[var3];
                    this.field817 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field817[var4] = arg0.method2450();
                        this.field818[var4] = arg0.method2559();
                    }
                } else {
                    arg0.field2024 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field819 = arg0.method2630();
        } else if (arg1 == 5) {
            int var5 = arg0.method2559();
            if (var5 > 0) {
                if (this.field817 == null || field845) {
                    this.field818 = null;
                    this.field817 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field817[var6] = arg0.method2450();
                    }
                } else {
                    arg0.field2024 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field852 = arg0.method2559();
        } else if (arg1 == 15) {
            this.field840 = arg0.method2559();
        } else if (arg1 == 17) {
            this.field826 = 0;
            this.field827 = false;
        } else if (arg1 == 18) {
            this.field827 = false;
        } else if (arg1 == 19) {
            this.field811 = arg0.method2559();
        } else if (arg1 == 21) {
            this.field829 = 0;
        } else if (arg1 == 22) {
            this.field830 = true;
        } else if (arg1 == 23) {
            this.field836 = true;
        } else if (arg1 == 24) {
            this.field832 = arg0.method2450();
            if (this.field832 == 65535) {
                this.field832 = -1;
            }
        } else if (arg1 == 27) {
            this.field826 = 1;
        } else if (arg1 == 28) {
            this.field833 = arg0.method2559();
        } else if (arg1 == 29) {
            this.field824 = arg0.method2449();
        } else if (arg1 == 39) {
            this.field835 = arg0.method2449() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field823[arg1 - 30] = arg0.method2630();
            if (this.field823[arg1 - 30].equalsIgnoreCase(class133.field2227)) {
                this.field823[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2559();
            this.field820 = new short[var7];
            this.field853 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field820[var8] = (short) arg0.method2450();
                this.field853[var8] = (short) arg0.method2450();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2559();
            this.field822 = new short[var9];
            this.field838 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field822[var10] = (short) arg0.method2450();
                this.field838[var10] = (short) arg0.method2450();
            }
        } else if (arg1 == 60) {
            this.field837 = arg0.method2450();
        } else if (arg1 == 62) {
            this.field844 = true;
        } else if (arg1 == 64) {
            this.field821 = false;
        } else if (arg1 == 65) {
            this.field841 = arg0.method2450();
        } else if (arg1 == 66) {
            this.field828 = arg0.method2450();
        } else if (arg1 == 67) {
            this.field843 = arg0.method2450();
        } else if (arg1 == 68) {
            this.field808 = arg0.method2450();
        } else if (arg1 == 69) {
            this.field847 = arg0.method2559();
        } else if (arg1 == 70) {
            this.field846 = arg0.method2487();
        } else if (arg1 == 71) {
            this.field831 = arg0.method2487();
        } else if (arg1 == 72) {
            this.field857 = arg0.method2487();
        } else if (arg1 == 73) {
            this.field848 = true;
        } else if (arg1 == 74) {
            this.field810 = true;
        } else if (arg1 == 75) {
            this.field850 = arg0.method2559();
        } else if (arg1 == 77) {
            this.field834 = arg0.method2450();
            if (this.field834 == 65535) {
                this.field834 = -1;
            }
            this.field839 = arg0.method2450();
            if (this.field839 == 65535) {
                this.field839 = -1;
            }
            int var11 = arg0.method2559();
            this.field851 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field851[var12] = arg0.method2450();
                if (this.field851[var12] == 65535) {
                    this.field851[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field854 = arg0.method2450();
            this.field855 = arg0.method2559();
        } else if (arg1 == 79) {
            this.field856 = arg0.method2450();
            this.field825 = arg0.method2450();
            this.field855 = arg0.method2559();
            int var13 = arg0.method2559();
            this.field858 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field858[var14] = arg0.method2450();
            }
        } else if (arg1 == 81) {
            this.field829 = arg0.method2559() * 256;
        }
    }

    @ObfuscatedName("av.n(II)Z")
    public final boolean method616(int arg0) {
        if (this.field818 != null) {
            for (int var4 = 0; var4 < this.field818.length; var4++) {
                if (this.field818[var4] == arg0) {
                    return Statics.field849.method3013(this.field817[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field817 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field817.length; var3++) {
                var2 &= Statics.field849.method3013(this.field817[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.q(B)Z")
    public final boolean method617() {
        if (this.field817 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field817.length; var2++) {
            var1 &= Statics.field849.method3013(this.field817[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.a(II[[IIIII)Lch;")
    public final class93 method618(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field818 == null) {
            var7 = (long) ((this.field816 << 10) + arg1);
        } else {
            var7 = (long) ((this.field816 << 10) + (arg0 << 3) + arg1);
        }
        class93 var9 = (class93) field813.method3263(var7);
        if (var9 == null) {
            class100 var10 = this.method621(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field830) {
                var10.field1691 = (short) (this.field824 + 64);
                var10.field1692 = (short) (this.field835 + 768);
                var10.method2105();
                var9 = var10;
            } else {
                var9 = var10.method2064(this.field824 + 64, this.field835 + 768, -50, -10, -50);
            }
            field813.method3260(var9, var7);
        }
        if (this.field830) {
            var9 = ((class100) var9).method2048();
        }
        if (this.field829 >= 0) {
            if (var9 instanceof class111) {
                var9 = ((class111) var9).method2233(arg2, arg3, arg4, arg5, true, this.field829);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2049(arg2, arg3, arg4, arg5, true, this.field829);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.g(II[[IIIIB)Ldd;")
    public final class111 method638(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field818 == null) {
            var7 = (long) ((this.field816 << 10) + arg1);
        } else {
            var7 = (long) ((this.field816 << 10) + (arg0 << 3) + arg1);
        }
        class111 var9 = (class111) field814.method3263(var7);
        if (var9 == null) {
            class100 var10 = this.method621(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2064(this.field824 + 64, this.field835 + 768, -50, -10, -50);
            field814.method3260(var9, var7);
        }
        if (this.field829 >= 0) {
            var9 = var9.method2233(arg2, arg3, arg4, arg5, true, this.field829);
        }
        return var9;
    }

    @ObfuscatedName("av.j(II[[IIIILad;II)Ldd;")
    public final class111 method620(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class33 arg6, int arg7) {
        long var9;
        if (this.field818 == null) {
            var9 = (long) ((this.field816 << 10) + arg1);
        } else {
            var9 = (long) ((this.field816 << 10) + (arg0 << 3) + arg1);
        }
        class111 var11 = (class111) field814.method3263(var9);
        if (var11 == null) {
            class100 var12 = this.method621(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2064(this.field824 + 64, this.field835 + 768, -50, -10, -50);
            field814.method3260(var11, var9);
        }
        if (arg6 == null && this.field829 == -1) {
            return var11;
        }
        class111 var13;
        if (arg6 == null) {
            var13 = var11.method2234(true);
        } else {
            var13 = arg6.method688(var11, arg7, arg1);
        }
        if (this.field829 >= 0) {
            var13 = var13.method2233(arg2, arg3, arg4, arg5, false, this.field829);
        }
        return var13;
    }

    @ObfuscatedName("av.l(III)Lcj;")
    public final class100 method621(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field818 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field817 == null) {
                return null;
            }
            boolean var4 = this.field844;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field817.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field817[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field812.method3263((long) var7);
                if (var3 == null) {
                    var3 = class100.method2044(Statics.field849, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2058();
                    }
                    field812.method3260(var3, (long) var7);
                }
                if (var5 > 1) {
                    field815[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field815, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field818.length; var9++) {
                if (this.field818[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field817[var8];
            boolean var11 = this.field844 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field812.method3263((long) var10);
            if (var3 == null) {
                var3 = class100.method2044(Statics.field849, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2058();
                }
                field812.method3260(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field841 == 128 && this.field828 == 128 && this.field843 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field846 == 0 && this.field831 == 0 && this.field857 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field820 == null, this.field822 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2054(256);
            var14.method2106(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2051();
        } else if (var15 == 2) {
            var14.method2052();
        } else if (var15 == 3) {
            var14.method2053();
        }
        if (this.field820 != null) {
            for (int var16 = 0; var16 < this.field820.length; var16++) {
                var14.method2107(this.field820[var16], this.field853[var16]);
            }
        }
        if (this.field822 != null) {
            for (int var17 = 0; var17 < this.field822.length; var17++) {
                var14.method2110(this.field822[var17], this.field838[var17]);
            }
        }
        if (var12) {
            var14.method2059(this.field841, this.field828, this.field843);
        }
        if (var13) {
            var14.method2106(this.field846, this.field831, this.field857);
        }
        return var14;
    }

    @ObfuscatedName("av.w(I)Lav;")
    public final class31 method622() {
        int var1 = -1;
        if (this.field834 != -1) {
            var1 = class158.method3077(this.field834);
        } else if (this.field839 != -1) {
            var1 = class158.field2687[this.field839];
        }
        return var1 < 0 || var1 >= this.field851.length || this.field851[var1] == -1 ? null : method132(this.field851[var1]);
    }

    @ObfuscatedName("av.z(I)Z")
    public boolean method639() {
        if (this.field851 == null) {
            return this.field854 != -1 || this.field858 != null;
        }
        for (int var1 = 0; var1 < this.field851.length; var1++) {
            if (this.field851[var1] != -1) {
                class31 var2 = method132(this.field851[var1]);
                if (var2.field854 != -1 || var2.field858 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
