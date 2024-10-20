package deob;

@ObfuscatedName("ab")
public class class182 extends class6 {

    @ObfuscatedName("ab.f")
    public static class157[] field2754 = new class157[4];

    @ObfuscatedName("ab.g")
    public String field2799 = "null";

    @ObfuscatedName("ab.d")
    public static class2 field2758 = new class2(30);

    @ObfuscatedName("ab.e")
    public short[] field2766;

    @ObfuscatedName("ab.b")
    public static boolean field2795 = false;

    @ObfuscatedName("ab.c")
    public int field2772 = -1;

    @ObfuscatedName("ab.a")
    public int field2764 = -1;

    @ObfuscatedName("ab.n")
    public int field2771 = 2;

    @ObfuscatedName("ab.o")
    public short[] field2765;

    @ObfuscatedName("ab.l")
    public static class2 field2775 = new class2(30);

    @ObfuscatedName("ab.m")
    public boolean field2776 = false;

    @ObfuscatedName("ab.j")
    public int[] field2762;

    @ObfuscatedName("ab.i")
    public int field2777 = 1;

    @ObfuscatedName("ab.w")
    public static class2 field2756 = new class2(64);

    @ObfuscatedName("ab.v")
    public int field2780 = 16;

    @ObfuscatedName("ab.u")
    public boolean field2778 = true;

    @ObfuscatedName("ab.t")
    public static class2 field2757 = new class2(500);

    @ObfuscatedName("ab.s")
    public int field2761;

    @ObfuscatedName("ab.r")
    public int field2769 = 1;

    @ObfuscatedName("ab.q")
    public short[] field2802;

    @ObfuscatedName("ab.p")
    public boolean field2789 = false;

    @ObfuscatedName("ab.z")
    public short[] field2768;

    @ObfuscatedName("ab.y")
    public int field2767 = -1;

    @ObfuscatedName("ab.x")
    public int[] field2763;

    @ObfuscatedName("ab.az")
    public int[] field2803;

    @ObfuscatedName("ab.ay")
    public int field2760 = -1;

    @ObfuscatedName("ab.at")
    public int field2798 = -1;

    @ObfuscatedName("ab.as")
    public int field2774 = 0;

    @ObfuscatedName("ab.ar")
    public boolean field2785 = true;

    @ObfuscatedName("ab.aq")
    public int field2782 = -1;

    @ObfuscatedName("ab.ax")
    public int field2787 = 0;

    @ObfuscatedName("ab.aw")
    public String[] field2770 = new String[5];

    @ObfuscatedName("ab.av")
    public int field2790 = 0;

    @ObfuscatedName("ab.au")
    public int field2791 = 0;

    @ObfuscatedName("ab.ak")
    public int field2783 = -1;

    @ObfuscatedName("ab.al")
    public int field2759 = -1;

    @ObfuscatedName("ab.ai")
    public int field2786 = 128;

    @ObfuscatedName("ab.aj")
    public int field2781 = 0;

    @ObfuscatedName("ab.ao")
    public boolean field2773 = false;

    @ObfuscatedName("ab.ap")
    public int field2792 = 0;

    @ObfuscatedName("ab.am")
    public boolean field2793 = false;

    @ObfuscatedName("ab.an")
    public int[] field2796;

    @ObfuscatedName("ab.ac")
    public int field2779 = 0;

    @ObfuscatedName("ab.ad")
    public int field2794 = 128;

    @ObfuscatedName("ab.aa")
    public int field2797 = -1;

    @ObfuscatedName("ab.ab")
    public boolean field2784 = false;

    @ObfuscatedName("ab.ag")
    public int field2800 = 0;

    @ObfuscatedName("ab.ah")
    public int field2788 = 128;

    @ObfuscatedName("ab.af")
    public int field2801 = 0;

    @ObfuscatedName("ab.s(II[[IIIILai;II)Ldu;")
    public final class27 method3287(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class173 arg6, int arg7) {
        long var9;
        if (this.field2763 == null) {
            var9 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class27 var11 = (class27) field2775.method1(var9);
        if (var11 == null) {
            class157 var12 = this.method3296(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2706(this.field2779 + 64, this.field2787 + 768, -50, -10, -50);
            field2775.method4(var11, var9);
        }
        if (arg6 == null && this.field2764 == -1) {
            return var11;
        }
        class27 var13;
        if (arg6 == null) {
            var13 = var11.method386(true);
        } else {
            var13 = arg6.method3007(var11, arg7, arg1);
        }
        if (this.field2764 >= 0) {
            var13 = var13.method385(arg2, arg3, arg4, arg5, false, this.field2764);
        }
        return var13;
    }

    @ObfuscatedName("ab.k(Ldp;I)V")
    public void method3289(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3290(arg0, var2);
        }
    }

    @ObfuscatedName("ab.w(Ldp;II)V")
    public void method3290(class50 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method726();
            if (var3 > 0) {
                if (this.field2762 == null || field2795) {
                    this.field2763 = new int[var3];
                    this.field2762 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2762[var4] = arg0.method720();
                        this.field2763[var4] = arg0.method726();
                    }
                } else {
                    arg0.field540 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2799 = arg0.method688();
        } else if (arg1 == 5) {
            int var5 = arg0.method726();
            if (var5 > 0) {
                if (this.field2762 == null || field2795) {
                    this.field2763 = null;
                    this.field2762 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2762[var6] = arg0.method720();
                    }
                } else {
                    arg0.field540 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2777 = arg0.method726();
        } else if (arg1 == 15) {
            this.field2769 = arg0.method726();
        } else if (arg1 == 17) {
            this.field2771 = 0;
            this.field2778 = false;
        } else if (arg1 == 18) {
            this.field2778 = false;
        } else if (arg1 == 19) {
            this.field2767 = arg0.method726();
        } else if (arg1 == 21) {
            this.field2764 = 0;
        } else if (arg1 == 22) {
            this.field2789 = true;
        } else if (arg1 == 23) {
            this.field2776 = true;
        } else if (arg1 == 24) {
            this.field2772 = arg0.method720();
            if (this.field2772 == 65535) {
                this.field2772 = -1;
            }
        } else if (arg1 == 27) {
            this.field2771 = 1;
        } else if (arg1 == 28) {
            this.field2780 = arg0.method726();
        } else if (arg1 == 29) {
            this.field2779 = arg0.method681();
        } else if (arg1 == 39) {
            this.field2787 = arg0.method681() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2770[arg1 - 30] = arg0.method688();
            if (this.field2770[arg1 - 30].equalsIgnoreCase(class85.field983)) {
                this.field2770[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method726();
            this.field2765 = new short[var7];
            this.field2766 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2765[var8] = (short) arg0.method720();
                this.field2766[var8] = (short) arg0.method720();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method726();
            this.field2802 = new short[var9];
            this.field2768 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2802[var10] = (short) arg0.method720();
                this.field2768[var10] = (short) arg0.method720();
            }
        } else if (arg1 == 60) {
            this.field2782 = arg0.method720();
        } else if (arg1 == 62) {
            this.field2784 = true;
        } else if (arg1 == 64) {
            this.field2785 = false;
        } else if (arg1 == 65) {
            this.field2786 = arg0.method720();
        } else if (arg1 == 66) {
            this.field2788 = arg0.method720();
        } else if (arg1 == 67) {
            this.field2794 = arg0.method720();
        } else if (arg1 == 68) {
            this.field2783 = arg0.method720();
        } else if (arg1 == 69) {
            this.field2792 = arg0.method726();
        } else if (arg1 == 70) {
            this.field2774 = arg0.method683();
        } else if (arg1 == 71) {
            this.field2790 = arg0.method683();
        } else if (arg1 == 72) {
            this.field2791 = arg0.method683();
        } else if (arg1 == 73) {
            this.field2793 = true;
        } else if (arg1 == 74) {
            this.field2773 = true;
        } else if (arg1 == 75) {
            this.field2759 = arg0.method726();
        } else if (arg1 == 77) {
            this.field2797 = arg0.method720();
            if (this.field2797 == 65535) {
                this.field2797 = -1;
            }
            this.field2798 = arg0.method720();
            if (this.field2798 == 65535) {
                this.field2798 = -1;
            }
            int var11 = arg0.method726();
            this.field2796 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2796[var12] = arg0.method720();
                if (this.field2796[var12] == 65535) {
                    this.field2796[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field2760 = arg0.method720();
            this.field2800 = arg0.method726();
        } else if (arg1 == 79) {
            this.field2801 = arg0.method720();
            this.field2781 = arg0.method720();
            this.field2800 = arg0.method726();
            int var13 = arg0.method726();
            this.field2803 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2803[var14] = arg0.method720();
            }
        } else if (arg1 == 81) {
            this.field2764 = arg0.method726() * 256;
        }
    }

    @ObfuscatedName("ab.t(II)Z")
    public final boolean method3291(int arg0) {
        if (this.field2763 != null) {
            for (int var4 = 0; var4 < this.field2763.length; var4++) {
                if (this.field2763[var4] == arg0) {
                    return Statics.field1843.method1268(this.field2762[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2762 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2762.length; var3++) {
                var2 &= Statics.field1843.method1268(this.field2762[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ab.d(I)Z")
    public final boolean method3293() {
        if (this.field2762 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2762.length; var2++) {
            var1 &= Statics.field1843.method1268(this.field2762[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ab.f(II[[IIIII)Ldu;")
    public final class27 method3294(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2763 == null) {
            var7 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class27 var9 = (class27) field2775.method1(var7);
        if (var9 == null) {
            class157 var10 = this.method3296(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2706(this.field2779 + 64, this.field2787 + 768, -50, -10, -50);
            field2775.method4(var9, var7);
        }
        if (this.field2764 >= 0) {
            var9 = var9.method385(arg2, arg3, arg4, arg5, true, this.field2764);
        }
        return var9;
    }

    @ObfuscatedName("ab.j(IIB)Lcf;")
    public final class157 method3296(int arg0, int arg1) {
        class157 var3 = null;
        if (this.field2763 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2762 == null) {
                return null;
            }
            boolean var4 = this.field2784;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2762.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2762[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class157) field2757.method1((long) var7);
                if (var3 == null) {
                    var3 = class157.method2663(Statics.field1843, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2670();
                    }
                    field2757.method4(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2754[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class157(field2754, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2763.length; var9++) {
                if (this.field2763[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2762[var8];
            boolean var11 = this.field2784 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class157) field2757.method1((long) var10);
            if (var3 == null) {
                var3 = class157.method2663(Statics.field1843, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2670();
                }
                field2757.method4(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2786 == 128 && this.field2788 == 128 && this.field2794 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2774 == 0 && this.field2790 == 0 && this.field2791 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class157 var14 = new class157(var3, arg1 == 0 && !var12 && !var13, this.field2765 == null, this.field2802 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2675(256);
            var14.method2677(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2672();
        } else if (var15 == 2) {
            var14.method2673();
        } else if (var15 == 3) {
            var14.method2674();
        }
        if (this.field2765 != null) {
            for (int var16 = 0; var16 < this.field2765.length; var16++) {
                var14.method2701(this.field2765[var16], this.field2766[var16]);
            }
        }
        if (this.field2802 != null) {
            for (int var17 = 0; var17 < this.field2802.length; var17++) {
                var14.method2678(this.field2802[var17], this.field2768[var17]);
            }
        }
        if (var12) {
            var14.method2679(this.field2786, this.field2788, this.field2794);
        }
        if (var13) {
            var14.method2677(this.field2774, this.field2790, this.field2791);
        }
        return var14;
    }

    @ObfuscatedName("ab.x(B)Lab;")
    public final class182 method3297() {
        int var1 = -1;
        if (this.field2797 != -1) {
            var1 = class71.method2005(this.field2797);
        } else if (this.field2798 != -1) {
            var1 = class71.field800[this.field2798];
        }
        return var1 < 0 || var1 >= this.field2796.length || this.field2796[var1] == -1 ? null : method3383(this.field2796[var1]);
    }

    @ObfuscatedName("ab.o(I)Z")
    public boolean method3298() {
        if (this.field2796 == null) {
            return this.field2760 != -1 || this.field2803 != null;
        }
        for (int var1 = 0; var1 < this.field2796.length; var1++) {
            if (this.field2796[var1] != -1) {
                class182 var2 = method3383(this.field2796[var1]);
                if (var2.field2760 != -1 || var2.field2803 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("ab.h(I)V")
    public void method3314() {
        if (this.field2767 == -1) {
            this.field2767 = 0;
            if (this.field2762 != null && (this.field2763 == null || this.field2763[0] == 10)) {
                this.field2767 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2770[var1] != null) {
                    this.field2767 = 1;
                }
            }
        }
        if (this.field2759 == -1) {
            this.field2759 = this.field2771 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ab.l(II[[IIIII)Lcr;")
    public final class145 method3318(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2763 == null) {
            var7 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class145 var9 = (class145) field2758.method1(var7);
        if (var9 == null) {
            class157 var10 = this.method3296(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2789) {
                var10.field2386 = (short) (this.field2779 + 64);
                var10.field2385 = (short) (this.field2787 + 768);
                var10.method2680();
                var9 = var10;
            } else {
                var9 = var10.method2706(this.field2779 + 64, this.field2787 + 768, -50, -10, -50);
            }
            field2758.method4(var9, var7);
        }
        if (this.field2789) {
            var9 = ((class157) var9).method2668();
        }
        if (this.field2764 >= 0) {
            if (var9 instanceof class27) {
                var9 = ((class27) var9).method385(arg2, arg3, arg4, arg5, true, this.field2764);
            } else if (var9 instanceof class157) {
                var9 = ((class157) var9).method2690(arg2, arg3, arg4, arg5, true, this.field2764);
            }
        }
        return var9;
    }

    @ObfuscatedName("aw.g(I)V")
    public static void method2923() {
        field2756.method5();
        field2757.method5();
        field2758.method5();
        field2775.method5();
    }

    @ObfuscatedName("ae.b(II)Lab;")
    public static class182 method3383(int arg0) {
        class182 var1 = (class182) field2756.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2755.method1266(6, arg0);
        class182 var3 = new class182();
        var3.field2761 = arg0;
        if (var2 != null) {
            var3.method3289(new class50(var2));
        }
        var3.method3314();
        if (var3.field2773) {
            var3.field2771 = 0;
            var3.field2778 = false;
        }
        field2756.method4(var3, (long) arg0);
        return var3;
    }
}
