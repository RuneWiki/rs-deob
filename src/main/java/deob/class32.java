package deob;

@ObfuscatedName("as")
public class class32 extends class174 {

    @ObfuscatedName("as.j")
    public static boolean field840 = false;

    @ObfuscatedName("as.p")
    public static class170 field812 = new class170(64);

    @ObfuscatedName("as.e")
    public static class170 field813 = new class170(500);

    @ObfuscatedName("as.d")
    public static class170 field821 = new class170(30);

    @ObfuscatedName("as.y")
    public static class170 field815 = new class170(30);

    @ObfuscatedName("as.x")
    public static class101[] field835 = new class101[4];

    @ObfuscatedName("as.t")
    public int field817;

    @ObfuscatedName("as.i")
    public int[] field818;

    @ObfuscatedName("as.z")
    public int[] field834;

    @ObfuscatedName("as.o")
    public String field826 = "null";

    @ObfuscatedName("as.u")
    public short[] field855;

    @ObfuscatedName("as.f")
    public short[] field809;

    @ObfuscatedName("as.k")
    public short[] field823;

    @ObfuscatedName("as.q")
    public short[] field824;

    @ObfuscatedName("as.a")
    public int field825 = 1;

    @ObfuscatedName("as.w")
    public int field856 = 1;

    @ObfuscatedName("as.g")
    public int field854 = 2;

    @ObfuscatedName("as.l")
    public boolean field828 = true;

    @ObfuscatedName("as.m")
    public int field829 = -1;

    @ObfuscatedName("as.b")
    public int field830 = -1;

    @ObfuscatedName("as.h")
    public boolean field814 = false;

    @ObfuscatedName("as.n")
    public boolean field832 = false;

    @ObfuscatedName("as.s")
    public int field833 = -1;

    @ObfuscatedName("as.c")
    public int field848 = 16;

    @ObfuscatedName("as.am")
    public int field838 = 0;

    @ObfuscatedName("as.ap")
    public int field836 = 0;

    @ObfuscatedName("as.au")
    public String[] field839 = new String[5];

    @ObfuscatedName("as.ab")
    public int field849 = -1;

    @ObfuscatedName("as.ae")
    public int field837 = -1;

    @ObfuscatedName("as.as")
    public boolean field844 = false;

    @ObfuscatedName("as.av")
    public boolean field819 = true;

    @ObfuscatedName("as.ar")
    public int field842 = 128;

    @ObfuscatedName("as.ad")
    public int field843 = 128;

    @ObfuscatedName("as.ac")
    public int field827 = 128;

    @ObfuscatedName("as.ax")
    public int field845 = 0;

    @ObfuscatedName("as.ao")
    public int field820 = 0;

    @ObfuscatedName("as.aj")
    public int field847 = 0;

    @ObfuscatedName("as.al")
    public int field846 = 0;

    @ObfuscatedName("as.ak")
    public boolean field841 = false;

    @ObfuscatedName("as.ag")
    public boolean field850 = false;

    @ObfuscatedName("as.ah")
    public int field851 = -1;

    @ObfuscatedName("as.ay")
    public int[] field857;

    @ObfuscatedName("as.an")
    public int field853 = -1;

    @ObfuscatedName("as.aq")
    public int field816 = -1;

    @ObfuscatedName("as.af")
    public int field831 = -1;

    @ObfuscatedName("as.aw")
    public int field852 = 0;

    @ObfuscatedName("as.at")
    public int field822 = 0;

    @ObfuscatedName("as.aa")
    public int field858 = 0;

    @ObfuscatedName("as.ai")
    public int[] field859;

    @ObfuscatedName("ae.j(II)Las;")
    public static class32 method606(int arg0) {
        class32 var1 = (class32) field812.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field810.method3016(6, arg0);
        class32 var3 = new class32();
        var3.field817 = arg0;
        if (var2 != null) {
            var3.method634(new class127(var2));
        }
        var3.method650();
        if (var3.field850) {
            var3.field854 = 0;
            var3.field828 = false;
        }
        field812.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.r(I)V")
    public void method650() {
        if (this.field829 == -1) {
            this.field829 = 0;
            if (this.field818 != null && (this.field834 == null || this.field834[0] == 10)) {
                this.field829 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field839[var1] != null) {
                    this.field829 = 1;
                }
            }
        }
        if (this.field851 == -1) {
            this.field851 = this.field854 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("as.v(Ldn;I)V")
    public void method634(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method635(arg0, var2);
        }
    }

    @ObfuscatedName("as.p(Ldn;II)V")
    public void method635(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2441();
            if (var3 > 0) {
                if (this.field818 == null || field840) {
                    this.field834 = new int[var3];
                    this.field818 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field818[var4] = arg0.method2609();
                        this.field834[var4] = arg0.method2441();
                    }
                } else {
                    arg0.field2022 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field826 = arg0.method2449();
        } else if (arg1 == 5) {
            int var5 = arg0.method2441();
            if (var5 > 0) {
                if (this.field818 == null || field840) {
                    this.field834 = null;
                    this.field818 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field818[var6] = arg0.method2609();
                    }
                } else {
                    arg0.field2022 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field825 = arg0.method2441();
        } else if (arg1 == 15) {
            this.field856 = arg0.method2441();
        } else if (arg1 == 17) {
            this.field854 = 0;
            this.field828 = false;
        } else if (arg1 == 18) {
            this.field828 = false;
        } else if (arg1 == 19) {
            this.field829 = arg0.method2441();
        } else if (arg1 == 21) {
            this.field830 = 0;
        } else if (arg1 == 22) {
            this.field814 = true;
        } else if (arg1 == 23) {
            this.field832 = true;
        } else if (arg1 == 24) {
            this.field833 = arg0.method2609();
            if (this.field833 == 65535) {
                this.field833 = -1;
            }
        } else if (arg1 == 27) {
            this.field854 = 1;
        } else if (arg1 == 28) {
            this.field848 = arg0.method2441();
        } else if (arg1 == 29) {
            this.field838 = arg0.method2442();
        } else if (arg1 == 39) {
            this.field836 = arg0.method2442() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field839[arg1 - 30] = arg0.method2449();
            if (this.field839[arg1 - 30].equalsIgnoreCase(class134.field2073)) {
                this.field839[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2441();
            this.field855 = new short[var7];
            this.field809 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field855[var8] = (short) arg0.method2609();
                this.field809[var8] = (short) arg0.method2609();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2441();
            this.field823 = new short[var9];
            this.field824 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field823[var10] = (short) arg0.method2609();
                this.field824[var10] = (short) arg0.method2609();
            }
        } else if (arg1 == 60) {
            this.field849 = arg0.method2609();
        } else if (arg1 == 62) {
            this.field844 = true;
        } else if (arg1 == 64) {
            this.field819 = false;
        } else if (arg1 == 65) {
            this.field842 = arg0.method2609();
        } else if (arg1 == 66) {
            this.field843 = arg0.method2609();
        } else if (arg1 == 67) {
            this.field827 = arg0.method2609();
        } else if (arg1 == 68) {
            this.field837 = arg0.method2609();
        } else if (arg1 == 69) {
            this.field846 = arg0.method2441();
        } else if (arg1 == 70) {
            this.field845 = arg0.method2495();
        } else if (arg1 == 71) {
            this.field820 = arg0.method2495();
        } else if (arg1 == 72) {
            this.field847 = arg0.method2495();
        } else if (arg1 == 73) {
            this.field841 = true;
        } else if (arg1 == 74) {
            this.field850 = true;
        } else if (arg1 == 75) {
            this.field851 = arg0.method2441();
        } else if (arg1 == 77) {
            this.field853 = arg0.method2609();
            if (this.field853 == 65535) {
                this.field853 = -1;
            }
            this.field816 = arg0.method2609();
            if (this.field816 == 65535) {
                this.field816 = -1;
            }
            int var11 = arg0.method2441();
            this.field857 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field857[var12] = arg0.method2609();
                if (this.field857[var12] == 65535) {
                    this.field857[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field831 = arg0.method2609();
            this.field852 = arg0.method2441();
        } else if (arg1 == 79) {
            this.field822 = arg0.method2609();
            this.field858 = arg0.method2609();
            this.field852 = arg0.method2441();
            int var13 = arg0.method2441();
            this.field859 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field859[var14] = arg0.method2609();
            }
        } else if (arg1 == 81) {
            this.field830 = arg0.method2441() * 256;
        }
    }

    @ObfuscatedName("as.e(II)Z")
    public final boolean method667(int arg0) {
        if (this.field834 != null) {
            for (int var4 = 0; var4 < this.field834.length; var4++) {
                if (this.field834[var4] == arg0) {
                    return Statics.field811.method2959(this.field818[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field818 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field818.length; var3++) {
                var2 &= Statics.field811.method2959(this.field818[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("as.d(I)Z")
    public final boolean method637() {
        if (this.field818 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field818.length; var2++) {
            var1 &= Statics.field811.method2959(this.field818[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("as.y(II[[IIIII)Lcj;")
    public final class94 method661(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field817 << 10) + arg1);
        } else {
            var7 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field821.method3264(var7);
        if (var9 == null) {
            class101 var10 = this.method641(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field814) {
                var10.field1699 = (short) (this.field838 + 64);
                var10.field1663 = (short) (this.field836 + 768);
                var10.method2066();
                var9 = var10;
            } else {
                var9 = var10.method2073(this.field838 + 64, this.field836 + 768, -50, -10, -50);
            }
            field821.method3257(var9, var7);
        }
        if (this.field814) {
            var9 = ((class101) var9).method2054();
        }
        if (this.field830 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2231(arg2, arg3, arg4, arg5, true, this.field830);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2125(arg2, arg3, arg4, arg5, true, this.field830);
            }
        }
        return var9;
    }

    @ObfuscatedName("as.x(II[[IIIII)Ldt;")
    public final class112 method666(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field817 << 10) + arg1);
        } else {
            var7 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field815.method3264(var7);
        if (var9 == null) {
            class101 var10 = this.method641(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2073(this.field838 + 64, this.field836 + 768, -50, -10, -50);
            field815.method3257(var9, var7);
        }
        if (this.field830 >= 0) {
            var9 = var9.method2231(arg2, arg3, arg4, arg5, true, this.field830);
        }
        return var9;
    }

    @ObfuscatedName("as.t(II[[IIIILar;II)Ldt;")
    public final class112 method640(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field834 == null) {
            var9 = (long) ((this.field817 << 10) + arg1);
        } else {
            var9 = (long) ((this.field817 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field815.method3264(var9);
        if (var11 == null) {
            class101 var12 = this.method641(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2073(this.field838 + 64, this.field836 + 768, -50, -10, -50);
            field815.method3257(var11, var9);
        }
        if (arg6 == null && this.field830 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2232(true);
        } else {
            var13 = arg6.method701(var11, arg7, arg1);
        }
        if (this.field830 >= 0) {
            var13 = var13.method2231(arg2, arg3, arg4, arg5, false, this.field830);
        }
        return var13;
    }

    @ObfuscatedName("as.i(IIB)Lco;")
    public final class101 method641(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field834 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field818 == null) {
                return null;
            }
            boolean var4 = this.field844;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field818.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field818[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field813.method3264((long) var7);
                if (var3 == null) {
                    var3 = class101.method2115(Statics.field811, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2064();
                    }
                    field813.method3257(var3, (long) var7);
                }
                if (var5 > 1) {
                    field835[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field835, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field834.length; var9++) {
                if (this.field834[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field818[var8];
            boolean var11 = this.field844 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field813.method3264((long) var10);
            if (var3 == null) {
                var3 = class101.method2115(Statics.field811, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2064();
                }
                field813.method3257(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field842 == 128 && this.field843 == 128 && this.field827 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field845 == 0 && this.field820 == 0 && this.field847 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field855 == null, this.field823 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2060(256);
            var14.method2128(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2065();
        } else if (var15 == 2) {
            var14.method2058();
        } else if (var15 == 3) {
            var14.method2099();
        }
        if (this.field855 != null) {
            for (int var16 = 0; var16 < this.field855.length; var16++) {
                var14.method2062(this.field855[var16], this.field809[var16]);
            }
        }
        if (this.field823 != null) {
            for (int var17 = 0; var17 < this.field823.length; var17++) {
                var14.method2063(this.field823[var17], this.field824[var17]);
            }
        }
        if (var12) {
            var14.method2105(this.field842, this.field843, this.field827);
        }
        if (var13) {
            var14.method2128(this.field845, this.field820, this.field847);
        }
        return var14;
    }

    @ObfuscatedName("as.z(I)Las;")
    public final class32 method642() {
        int var1 = -1;
        if (this.field853 != -1) {
            var1 = class159.method791(this.field853);
        } else if (this.field816 != -1) {
            var1 = class159.field2693[this.field816];
        }
        return var1 < 0 || var1 >= this.field857.length || this.field857[var1] == -1 ? null : method606(this.field857[var1]);
    }

    @ObfuscatedName("as.o(I)Z")
    public boolean method643() {
        if (this.field857 == null) {
            return this.field831 != -1 || this.field859 != null;
        }
        for (int var1 = 0; var1 < this.field857.length; var1++) {
            if (this.field857[var1] != -1) {
                class32 var2 = method606(this.field857[var1]);
                if (var2.field831 != -1 || var2.field859 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
