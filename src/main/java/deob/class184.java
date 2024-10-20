package deob;

@ObfuscatedName("ah")
public class class184 extends class77 {

    @ObfuscatedName("ah.f")
    public int[] field2797;

    @ObfuscatedName("ah.g")
    public static class142[] field2806 = new class142[4];

    @ObfuscatedName("ah.d")
    public int field2812 = -1;

    @ObfuscatedName("ah.e")
    public int field2796;

    @ObfuscatedName("ah.b")
    public int field2809 = -1;

    @ObfuscatedName("ah.c")
    public int field2799 = 2;

    @ObfuscatedName("ah.a")
    public int field2813 = 16;

    @ObfuscatedName("ah.n")
    public static class67 field2794 = new class67(30);

    @ObfuscatedName("ah.l")
    public short[] field2791;

    @ObfuscatedName("ah.m")
    public int field2804 = 1;

    @ObfuscatedName("ah.j")
    public static boolean field2790 = false;

    @ObfuscatedName("ah.k")
    public boolean field2810 = false;

    @ObfuscatedName("ah.h")
    public static class67 field2792 = new class67(500);

    @ObfuscatedName("ah.i")
    public short[] field2802;

    @ObfuscatedName("ah.w")
    public short[] field2801;

    @ObfuscatedName("ah.v")
    public int field2834 = 1;

    @ObfuscatedName("ah.u")
    public boolean field2807 = true;

    @ObfuscatedName("ah.t")
    public static class67 field2826 = new class67(64);

    @ObfuscatedName("ah.s")
    public short[] field2803;

    @ObfuscatedName("ah.r")
    public static class67 field2830 = new class67(30);

    @ObfuscatedName("ah.q")
    public boolean field2811 = false;

    @ObfuscatedName("ah.z")
    public String field2822 = "null";

    @ObfuscatedName("ah.y")
    public int field2808 = -1;

    @ObfuscatedName("ah.x")
    public int[] field2798;

    @ObfuscatedName("ah.az")
    public int field2832 = -1;

    @ObfuscatedName("ah.ay")
    public int field2823 = 128;

    @ObfuscatedName("ah.at")
    public int field2827 = 0;

    @ObfuscatedName("ah.as")
    public int field2824 = 0;

    @ObfuscatedName("ah.ar")
    public int field2805 = 0;

    @ObfuscatedName("ah.aq")
    public int field2821 = 128;

    @ObfuscatedName("ah.ax")
    public int field2817 = -1;

    @ObfuscatedName("ah.aw")
    public int field2818 = 0;

    @ObfuscatedName("ah.av")
    public int field2833 = -1;

    @ObfuscatedName("ah.au")
    public String[] field2816 = new String[5];

    @ObfuscatedName("ah.ak")
    public int field2836 = 0;

    @ObfuscatedName("ah.al")
    public int[] field2831;

    @ObfuscatedName("ah.ai")
    public int field2820 = 128;

    @ObfuscatedName("ah.aj")
    public int field2839 = 0;

    @ObfuscatedName("ah.ao")
    public int[] field2838;

    @ObfuscatedName("ah.ap")
    public boolean field2828 = false;

    @ObfuscatedName("ah.am")
    public int field2835 = 0;

    @ObfuscatedName("ah.an")
    public int field2793 = -1;

    @ObfuscatedName("ah.ac")
    public boolean field2814 = false;

    @ObfuscatedName("ah.ad")
    public boolean field2837 = true;

    @ObfuscatedName("ah.aa")
    public int field2788 = 0;

    @ObfuscatedName("ah.ab")
    public int field2825 = 0;

    @ObfuscatedName("ah.ag")
    public int field2800 = -1;

    @ObfuscatedName("ah.ah")
    public boolean field2819 = false;

    @ObfuscatedName("ah.ae")
    public int field2795 = -1;

    @ObfuscatedName("ah.r(II)Z")
    public final boolean method3494(int arg0) {
        if (this.field2798 != null) {
            for (int var4 = 0; var4 < this.field2798.length; var4++) {
                if (this.field2798[var4] == arg0) {
                    return Statics.field2829.method1085(this.field2797[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2797 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2797.length; var3++) {
                var2 &= Statics.field2829.method1085(this.field2797[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ah.h(Ldy;II)V")
    public void method3496(class31 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method512();
            if (var3 > 0) {
                if (this.field2797 == null || field2790) {
                    this.field2798 = new int[var3];
                    this.field2797 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2797[var4] = arg0.method373();
                        this.field2798[var4] = arg0.method512();
                    }
                } else {
                    arg0.field172 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2822 = arg0.method379();
        } else if (arg1 == 5) {
            int var5 = arg0.method512();
            if (var5 > 0) {
                if (this.field2797 == null || field2790) {
                    this.field2798 = null;
                    this.field2797 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2797[var6] = arg0.method373();
                    }
                } else {
                    arg0.field172 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2804 = arg0.method512();
        } else if (arg1 == 15) {
            this.field2834 = arg0.method512();
        } else if (arg1 == 17) {
            this.field2799 = 0;
            this.field2807 = false;
        } else if (arg1 == 18) {
            this.field2807 = false;
        } else if (arg1 == 19) {
            this.field2808 = arg0.method512();
        } else if (arg1 == 21) {
            this.field2809 = 0;
        } else if (arg1 == 22) {
            this.field2810 = true;
        } else if (arg1 == 23) {
            this.field2811 = true;
        } else if (arg1 == 24) {
            this.field2812 = arg0.method373();
            if (this.field2812 == 65535) {
                this.field2812 = -1;
            }
        } else if (arg1 == 27) {
            this.field2799 = 1;
        } else if (arg1 == 28) {
            this.field2813 = arg0.method512();
        } else if (arg1 == 29) {
            this.field2788 = arg0.method492();
        } else if (arg1 == 39) {
            this.field2827 = arg0.method492() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2816[arg1 - 30] = arg0.method379();
            if (this.field2816[arg1 - 30].equalsIgnoreCase(class98.field1138)) {
                this.field2816[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method512();
            this.field2791 = new short[var7];
            this.field2801 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2791[var8] = (short) arg0.method373();
                this.field2801[var8] = (short) arg0.method373();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method512();
            this.field2802 = new short[var9];
            this.field2803 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2802[var10] = (short) arg0.method373();
                this.field2803[var10] = (short) arg0.method373();
            }
        } else if (arg1 == 60) {
            this.field2817 = arg0.method373();
        } else if (arg1 == 62) {
            this.field2819 = true;
        } else if (arg1 == 64) {
            this.field2837 = false;
        } else if (arg1 == 65) {
            this.field2821 = arg0.method373();
        } else if (arg1 == 66) {
            this.field2820 = arg0.method373();
        } else if (arg1 == 67) {
            this.field2823 = arg0.method373();
        } else if (arg1 == 68) {
            this.field2800 = arg0.method373();
        } else if (arg1 == 69) {
            this.field2805 = arg0.method512();
        } else if (arg1 == 70) {
            this.field2824 = arg0.method356();
        } else if (arg1 == 71) {
            this.field2825 = arg0.method356();
        } else if (arg1 == 72) {
            this.field2839 = arg0.method356();
        } else if (arg1 == 73) {
            this.field2828 = true;
        } else if (arg1 == 74) {
            this.field2814 = true;
        } else if (arg1 == 75) {
            this.field2793 = arg0.method512();
        } else if (arg1 == 77) {
            this.field2832 = arg0.method373();
            if (this.field2832 == 65535) {
                this.field2832 = -1;
            }
            this.field2833 = arg0.method373();
            if (this.field2833 == 65535) {
                this.field2833 = -1;
            }
            int var11 = arg0.method512();
            this.field2831 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2831[var12] = arg0.method373();
                if (this.field2831[var12] == 65535) {
                    this.field2831[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field2795 = arg0.method373();
            this.field2835 = arg0.method512();
        } else if (arg1 == 79) {
            this.field2836 = arg0.method373();
            this.field2818 = arg0.method373();
            this.field2835 = arg0.method512();
            int var13 = arg0.method512();
            this.field2838 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2838[var14] = arg0.method373();
            }
        } else if (arg1 == 81) {
            this.field2809 = arg0.method512() * 256;
        }
    }

    @ObfuscatedName("ah.e(II[[IIIII)Ldi;")
    public final class41 method3498(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2798 == null) {
            var7 = (long) ((this.field2796 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2796 << 10) + (arg0 << 3) + arg1);
        }
        class41 var9 = (class41) field2794.method908(var7);
        if (var9 == null) {
            class142 var10 = this.method3502(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2603(this.field2788 + 64, this.field2827 + 768, -50, -10, -50);
            field2794.method907(var9, var7);
        }
        if (this.field2809 >= 0) {
            var9 = var9.method639(arg2, arg3, arg4, arg5, true, this.field2809);
        }
        return var9;
    }

    @ObfuscatedName("ah.g(II[[IIIIB)Lcq;")
    public final class144 method3499(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2798 == null) {
            var7 = (long) ((this.field2796 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2796 << 10) + (arg0 << 3) + arg1);
        }
        class144 var9 = (class144) field2830.method908(var7);
        if (var9 == null) {
            class142 var10 = this.method3502(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2810) {
                var10.field2148 = (short) (this.field2788 + 64);
                var10.field2149 = (short) (this.field2827 + 768);
                var10.method2545();
                var9 = var10;
            } else {
                var9 = var10.method2603(this.field2788 + 64, this.field2827 + 768, -50, -10, -50);
            }
            field2830.method907(var9, var7);
        }
        if (this.field2810) {
            var9 = ((class142) var9).method2535();
        }
        if (this.field2809 >= 0) {
            if (var9 instanceof class41) {
                var9 = ((class41) var9).method639(arg2, arg3, arg4, arg5, true, this.field2809);
            } else if (var9 instanceof class142) {
                var9 = ((class142) var9).method2536(arg2, arg3, arg4, arg5, true, this.field2809);
            }
        }
        return var9;
    }

    @ObfuscatedName("ah.w(I)Z")
    public boolean method3500() {
        if (this.field2831 == null) {
            return this.field2795 != -1 || this.field2838 != null;
        }
        for (int var1 = 0; var1 < this.field2831.length; var1++) {
            if (this.field2831[var1] != -1) {
                class184 var2 = Statics.method2861(this.field2831[var1]);
                if (var2.field2795 != -1 || var2.field2838 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("ah.f(II[[IIIILaq;II)Ldi;")
    public final class41 method3501(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class166 arg6, int arg7) {
        long var9;
        if (this.field2798 == null) {
            var9 = (long) ((this.field2796 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2796 << 10) + (arg0 << 3) + arg1);
        }
        class41 var11 = (class41) field2794.method908(var9);
        if (var11 == null) {
            class142 var12 = this.method3502(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2603(this.field2788 + 64, this.field2827 + 768, -50, -10, -50);
            field2794.method907(var11, var9);
        }
        if (arg6 == null && this.field2809 == -1) {
            return var11;
        }
        class41 var13;
        if (arg6 == null) {
            var13 = var11.method641(true);
        } else {
            var13 = arg6.method3176(var11, arg7, arg1);
        }
        if (this.field2809 >= 0) {
            var13 = var13.method639(arg2, arg3, arg4, arg5, false, this.field2809);
        }
        return var13;
    }

    @ObfuscatedName("ah.x(III)Lct;")
    public final class142 method3502(int arg0, int arg1) {
        class142 var3 = null;
        if (this.field2798 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2797 == null) {
                return null;
            }
            boolean var4 = this.field2819;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2797.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2797[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class142) field2792.method908((long) var7);
                if (var3 == null) {
                    var3 = class142.method2529(Statics.field2829, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2544();
                    }
                    field2792.method907(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2806[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class142(field2806, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2798.length; var9++) {
                if (this.field2798[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2797[var8];
            boolean var11 = this.field2819 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class142) field2792.method908((long) var10);
            if (var3 == null) {
                var3 = class142.method2529(Statics.field2829, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2544();
                }
                field2792.method907(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2821 == 128 && this.field2820 == 128 && this.field2823 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2824 == 0 && this.field2825 == 0 && this.field2839 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class142 var14 = new class142(var3, arg1 == 0 && !var12 && !var13, this.field2791 == null, this.field2802 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2540(256);
            var14.method2553(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2561();
        } else if (var15 == 2) {
            var14.method2538();
        } else if (var15 == 3) {
            var14.method2539();
        }
        if (this.field2791 != null) {
            for (int var16 = 0; var16 < this.field2791.length; var16++) {
                var14.method2542(this.field2791[var16], this.field2801[var16]);
            }
        }
        if (this.field2802 != null) {
            for (int var17 = 0; var17 < this.field2802.length; var17++) {
                var14.method2555(this.field2802[var17], this.field2803[var17]);
            }
        }
        if (var12) {
            var14.method2528(this.field2821, this.field2820, this.field2823);
        }
        if (var13) {
            var14.method2553(this.field2824, this.field2825, this.field2839);
        }
        return var14;
    }

    @ObfuscatedName("ah.z(I)Lah;")
    public final class184 method3503() {
        int var1 = -1;
        if (this.field2832 != -1) {
            var1 = class19.method2891(this.field2832);
        } else if (this.field2833 != -1) {
            var1 = class19.field88[this.field2833];
        }
        return var1 < 0 || var1 >= this.field2831.length || this.field2831[var1] == -1 ? null : Statics.method2861(this.field2831[var1]);
    }

    @ObfuscatedName("ah.t(Ldy;B)V")
    public void method3504(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3496(arg0, var2);
        }
    }

    @ObfuscatedName("ah.o(B)V")
    public void method3511() {
        if (this.field2808 == -1) {
            this.field2808 = 0;
            if (this.field2797 != null && (this.field2798 == null || this.field2798[0] == 10)) {
                this.field2808 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2816[var1] != null) {
                    this.field2808 = 1;
                }
            }
        }
        if (this.field2793 == -1) {
            this.field2793 = this.field2799 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ah.n(I)Z")
    public final boolean method3521() {
        if (this.field2797 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2797.length; var2++) {
            var1 &= Statics.field2829.method1085(this.field2797[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("o.l(I)V")
    public static void method926() {
        field2826.method910();
        field2792.method910();
        field2830.method910();
        field2794.method910();
    }

    @ObfuscatedName("eq.j(Leg;Leg;ZI)V")
    public static void method1543(class81 arg0, class81 arg1, boolean arg2) {
        Statics.field2789 = arg0;
        Statics.field2829 = arg1;
        field2790 = arg2;
    }
}
