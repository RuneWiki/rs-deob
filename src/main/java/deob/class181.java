package deob;

@ObfuscatedName("aa")
public class class181 extends class7 {

    @ObfuscatedName("aa.f")
    public int field2794 = 2;

    @ObfuscatedName("aa.g")
    public int[] field2770;

    @ObfuscatedName("aa.d")
    public static class151[] field2757 = new class151[4];

    @ObfuscatedName("aa.e")
    public short[] field2771;

    @ObfuscatedName("aa.a")
    public String field2768 = "null";

    @ObfuscatedName("aa.n")
    public int field2781 = -1;

    @ObfuscatedName("aa.o")
    public int field2791 = 1;

    @ObfuscatedName("aa.l")
    public boolean field2802 = false;

    @ObfuscatedName("aa.m")
    public static class75 field2774 = new class75(500);

    @ObfuscatedName("aa.j")
    public int field2761;

    @ObfuscatedName("aa.k")
    public short[] field2780;

    @ObfuscatedName("aa.h")
    public boolean field2767 = true;

    @ObfuscatedName("aa.i")
    public static class75 field2760 = new class75(64);

    @ObfuscatedName("aa.w")
    public int field2778 = -1;

    @ObfuscatedName("aa.v")
    public static boolean field2765 = false;

    @ObfuscatedName("aa.u")
    public short[] field2769;

    @ObfuscatedName("aa.t")
    public int field2777 = -1;

    @ObfuscatedName("aa.s")
    public int field2758 = 1;

    @ObfuscatedName("aa.r")
    public boolean field2779 = false;

    @ObfuscatedName("aa.q")
    public int field2782 = 16;

    @ObfuscatedName("aa.p")
    public short[] field2772;

    @ObfuscatedName("aa.z")
    public static class75 field2762 = new class75(30);

    @ObfuscatedName("aa.y")
    public int[] field2773;

    @ObfuscatedName("aa.x")
    public static class75 field2763 = new class75(30);

    @ObfuscatedName("aa.az")
    public int field2776 = -1;

    @ObfuscatedName("aa.ay")
    public int[] field2796;

    @ObfuscatedName("aa.as")
    public int field2783 = 0;

    @ObfuscatedName("aa.ar")
    public int field2790 = 128;

    @ObfuscatedName("aa.aq")
    public int field2806 = 0;

    @ObfuscatedName("aa.ax")
    public String[] field2785 = new String[5];

    @ObfuscatedName("aa.aw")
    public boolean field2797 = false;

    @ObfuscatedName("aa.av")
    public boolean field2798 = false;

    @ObfuscatedName("aa.au")
    public int field2805 = 0;

    @ObfuscatedName("aa.ak")
    public int field2808 = 0;

    @ObfuscatedName("aa.al")
    public int field2787 = 0;

    @ObfuscatedName("aa.ai")
    public int field2795 = 128;

    @ObfuscatedName("aa.aj")
    public int field2766 = 0;

    @ObfuscatedName("aa.ao")
    public int field2786 = -1;

    @ObfuscatedName("aa.ap")
    public int[] field2800;

    @ObfuscatedName("aa.am")
    public int field2793 = 0;

    @ObfuscatedName("aa.an")
    public boolean field2789 = true;

    @ObfuscatedName("aa.ac")
    public int field2784 = 0;

    @ObfuscatedName("aa.ad")
    public int field2801 = -1;

    @ObfuscatedName("aa.aa")
    public boolean field2788 = false;

    @ObfuscatedName("aa.ab")
    public int field2804 = 0;

    @ObfuscatedName("aa.ag")
    public int field2803 = -1;

    @ObfuscatedName("aa.ah")
    public int field2807 = -1;

    @ObfuscatedName("aa.ae")
    public int field2792 = 128;

    @ObfuscatedName("aa.af")
    public int field2799 = -1;

    @ObfuscatedName("aa.b(Ldv;I)V")
    public void method3385(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3386(arg0, var2);
        }
    }

    @ObfuscatedName("aa.i(Ldv;IB)V")
    public void method3386(class28 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method450();
            if (var3 > 0) {
                if (this.field2770 == null || field2765) {
                    this.field2773 = new int[var3];
                    this.field2770 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2770[var4] = arg0.method349();
                        this.field2773[var4] = arg0.method450();
                    }
                } else {
                    arg0.field303 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2768 = arg0.method451();
        } else if (arg1 == 5) {
            int var5 = arg0.method450();
            if (var5 > 0) {
                if (this.field2770 == null || field2765) {
                    this.field2773 = null;
                    this.field2770 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2770[var6] = arg0.method349();
                    }
                } else {
                    arg0.field303 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2791 = arg0.method450();
        } else if (arg1 == 15) {
            this.field2758 = arg0.method450();
        } else if (arg1 == 17) {
            this.field2794 = 0;
            this.field2767 = false;
        } else if (arg1 == 18) {
            this.field2767 = false;
        } else if (arg1 == 19) {
            this.field2777 = arg0.method450();
        } else if (arg1 == 21) {
            this.field2778 = 0;
        } else if (arg1 == 22) {
            this.field2779 = true;
        } else if (arg1 == 23) {
            this.field2802 = true;
        } else if (arg1 == 24) {
            this.field2781 = arg0.method349();
            if (this.field2781 == 65535) {
                this.field2781 = -1;
            }
        } else if (arg1 == 27) {
            this.field2794 = 1;
        } else if (arg1 == 28) {
            this.field2782 = arg0.method450();
        } else if (arg1 == 29) {
            this.field2783 = arg0.method313();
        } else if (arg1 == 39) {
            this.field2784 = arg0.method313() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2785[arg1 - 30] = arg0.method451();
            if (this.field2785[arg1 - 30].equalsIgnoreCase(class57.field819)) {
                this.field2785[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method450();
            this.field2769 = new short[var7];
            this.field2780 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2769[var8] = (short) arg0.method349();
                this.field2780[var8] = (short) arg0.method349();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method450();
            this.field2771 = new short[var9];
            this.field2772 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2771[var10] = (short) arg0.method349();
                this.field2772[var10] = (short) arg0.method349();
            }
        } else if (arg1 == 60) {
            this.field2786 = arg0.method349();
        } else if (arg1 == 62) {
            this.field2788 = true;
        } else if (arg1 == 64) {
            this.field2789 = false;
        } else if (arg1 == 65) {
            this.field2790 = arg0.method349();
        } else if (arg1 == 66) {
            this.field2795 = arg0.method349();
        } else if (arg1 == 67) {
            this.field2792 = arg0.method349();
        } else if (arg1 == 68) {
            this.field2807 = arg0.method349();
        } else if (arg1 == 69) {
            this.field2787 = arg0.method450();
        } else if (arg1 == 70) {
            this.field2793 = arg0.method315();
        } else if (arg1 == 71) {
            this.field2766 = arg0.method315();
        } else if (arg1 == 72) {
            this.field2805 = arg0.method315();
        } else if (arg1 == 73) {
            this.field2797 = true;
        } else if (arg1 == 74) {
            this.field2798 = true;
        } else if (arg1 == 75) {
            this.field2799 = arg0.method450();
        } else if (arg1 == 77) {
            this.field2801 = arg0.method349();
            if (this.field2801 == 65535) {
                this.field2801 = -1;
            }
            this.field2776 = arg0.method349();
            if (this.field2776 == 65535) {
                this.field2776 = -1;
            }
            int var11 = arg0.method450();
            this.field2800 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field2800[var12] = arg0.method349();
                if (this.field2800[var12] == 65535) {
                    this.field2800[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field2803 = arg0.method349();
            this.field2804 = arg0.method450();
        } else if (arg1 == 79) {
            this.field2808 = arg0.method349();
            this.field2806 = arg0.method349();
            this.field2804 = arg0.method450();
            int var13 = arg0.method450();
            this.field2796 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2796[var14] = arg0.method349();
            }
        } else if (arg1 == 81) {
            this.field2778 = arg0.method450() * 256;
        }
    }

    @ObfuscatedName("aa.j(II[[IIIILar;II)Ldk;")
    public final class43 method3390(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class165 arg6, int arg7) {
        long var9;
        if (this.field2773 == null) {
            var9 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class43 var11 = (class43) field2763.method1196(var9);
        if (var11 == null) {
            class151 var12 = this.method3391(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2675(this.field2783 + 64, this.field2784 + 768, -50, -10, -50);
            field2763.method1184(var11, var9);
        }
        if (arg6 == null && this.field2778 == -1) {
            return var11;
        }
        class43 var13;
        if (arg6 == null) {
            var13 = var11.method774(true);
        } else {
            var13 = arg6.method2982(var11, arg7, arg1);
        }
        if (this.field2778 >= 0) {
            var13 = var13.method773(arg2, arg3, arg4, arg5, false, this.field2778);
        }
        return var13;
    }

    @ObfuscatedName("aa.g(III)Lcl;")
    public final class151 method3391(int arg0, int arg1) {
        class151 var3 = null;
        if (this.field2773 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2770 == null) {
                return null;
            }
            boolean var4 = this.field2788;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2770.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2770[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class151) field2774.method1196((long) var7);
                if (var3 == null) {
                    var3 = class151.method2655(Statics.field2759, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2664();
                    }
                    field2774.method1184(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2757[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class151(field2757, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2773.length; var9++) {
                if (this.field2773[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2770[var8];
            boolean var11 = this.field2788 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class151) field2774.method1196((long) var10);
            if (var3 == null) {
                var3 = class151.method2655(Statics.field2759, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2664();
                }
                field2774.method1184(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2790 == 128 && this.field2795 == 128 && this.field2792 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2793 == 0 && this.field2766 == 0 && this.field2805 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class151 var14 = new class151(var3, arg1 == 0 && !var12 && !var13, this.field2769 == null, this.field2771 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2680(256);
            var14.method2666(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2663();
        } else if (var15 == 2) {
            var14.method2731();
        } else if (var15 == 3) {
            var14.method2665();
        }
        if (this.field2769 != null) {
            for (int var16 = 0; var16 < this.field2769.length; var16++) {
                var14.method2668(this.field2769[var16], this.field2780[var16]);
            }
        }
        if (this.field2771 != null) {
            for (int var17 = 0; var17 < this.field2771.length; var17++) {
                var14.method2657(this.field2771[var17], this.field2772[var17]);
            }
        }
        if (var12) {
            var14.method2670(this.field2790, this.field2795, this.field2792);
        }
        if (var13) {
            var14.method2666(this.field2793, this.field2766, this.field2805);
        }
        return var14;
    }

    @ObfuscatedName("aa.y(I)Laa;")
    public final class181 method3392() {
        int var1 = -1;
        if (this.field2801 != -1) {
            var1 = class1.method945(this.field2801);
        } else if (this.field2776 != -1) {
            var1 = class1.field4[this.field2776];
        }
        return var1 < 0 || var1 >= this.field2800.length || this.field2800[var1] == -1 ? null : method925(this.field2800[var1]);
    }

    @ObfuscatedName("aa.u(B)Z")
    public boolean method3393() {
        if (this.field2800 == null) {
            return this.field2803 != -1 || this.field2796 != null;
        }
        for (int var1 = 0; var1 < this.field2800.length; var1++) {
            if (this.field2800[var1] != -1) {
                class181 var2 = method925(this.field2800[var1]);
                if (var2.field2803 != -1 || var2.field2796 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @ObfuscatedName("aa.m(II)Z")
    public final boolean method3394(int arg0) {
        if (this.field2773 != null) {
            for (int var4 = 0; var4 < this.field2773.length; var4++) {
                if (this.field2773[var4] == arg0) {
                    return Statics.field2759.method1300(this.field2770[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2770 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2770.length; var3++) {
                var2 &= Statics.field2759.method1300(this.field2770[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aa.d(II[[IIIIB)Ldk;")
    public final class43 method3403(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2773 == null) {
            var7 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class43 var9 = (class43) field2763.method1196(var7);
        if (var9 == null) {
            class151 var10 = this.method3391(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2675(this.field2783 + 64, this.field2784 + 768, -50, -10, -50);
            field2763.method1184(var9, var7);
        }
        if (this.field2778 >= 0) {
            var9 = var9.method773(arg2, arg3, arg4, arg5, true, this.field2778);
        }
        return var9;
    }

    @ObfuscatedName("aa.c(I)V")
    public void method3404() {
        if (this.field2777 == -1) {
            this.field2777 = 0;
            if (this.field2770 != null && (this.field2773 == null || this.field2773[0] == 10)) {
                this.field2777 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2785[var1] != null) {
                    this.field2777 = 1;
                }
            }
        }
        if (this.field2799 == -1) {
            this.field2799 = this.field2794 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aa.x(II[[IIIII)Lca;")
    public final class107 method3406(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2773 == null) {
            var7 = (long) ((this.field2761 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2761 << 10) + (arg0 << 3) + arg1);
        }
        class107 var9 = (class107) field2762.method1196(var7);
        if (var9 == null) {
            class151 var10 = this.method3391(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2779) {
                var10.field2289 = (short) (this.field2783 + 64);
                var10.field2256 = (short) (this.field2784 + 768);
                var10.method2671();
                var9 = var10;
            } else {
                var9 = var10.method2675(this.field2783 + 64, this.field2784 + 768, -50, -10, -50);
            }
            field2762.method1184(var9, var7);
        }
        if (this.field2779) {
            var9 = ((class151) var9).method2660();
        }
        if (this.field2778 >= 0) {
            if (var9 instanceof class43) {
                var9 = ((class43) var9).method773(arg2, arg3, arg4, arg5, true, this.field2778);
            } else if (var9 instanceof class151) {
                var9 = ((class151) var9).method2661(arg2, arg3, arg4, arg5, true, this.field2778);
            }
        }
        return var9;
    }

    @ObfuscatedName("aa.z(I)Z")
    public final boolean method3422() {
        if (this.field2770 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2770.length; var2++) {
            var1 &= Statics.field2759.method1300(this.field2770[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("d.v(II)Laa;")
    public static class181 method925(int arg0) {
        class181 var1 = (class181) field2760.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2764.method1298(6, arg0);
        class181 var3 = new class181();
        var3.field2761 = arg0;
        if (var2 != null) {
            var3.method3385(new class28(var2));
        }
        var3.method3404();
        if (var3.field2798) {
            var3.field2794 = 0;
            var3.field2767 = false;
        }
        field2760.method1184(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("r.a(B)V")
    public static void method1370() {
        field2760.method1188();
        field2774.method1188();
        field2762.method1188();
        field2763.method1188();
    }
}
