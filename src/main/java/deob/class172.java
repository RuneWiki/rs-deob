package deob;

@ObfuscatedName("al")
public class class172 extends class7 {

    @ObfuscatedName("al.f")
    public int field2614 = 0;

    @ObfuscatedName("al.g")
    public String field2608 = "null";

    @ObfuscatedName("al.d")
    public int field2636;

    @ObfuscatedName("al.e")
    public int field2616 = 2000;

    @ObfuscatedName("al.a")
    public short[] field2610;

    @ObfuscatedName("al.n")
    public String[] field2623 = new String[] { null, null, null, null, class57.field719 };

    @ObfuscatedName("al.o")
    public int field2615 = 0;

    @ObfuscatedName("al.l")
    public String[] field2622 = new String[] { null, null, class57.field641, null, null };

    @ObfuscatedName("al.m")
    public static class75 field2629 = new class75(50);

    @ObfuscatedName("al.j")
    public int field2619;

    @ObfuscatedName("al.k")
    public short[] field2607;

    @ObfuscatedName("al.h")
    public int field2618 = 0;

    @ObfuscatedName("al.i")
    public static class75 field2603 = new class75(64);

    @ObfuscatedName("al.w")
    public int field2620 = 1;

    @ObfuscatedName("al.u")
    public short[] field2611;

    @ObfuscatedName("al.t")
    public int field2644 = 0;

    @ObfuscatedName("al.s")
    public int field2617 = 0;

    @ObfuscatedName("al.r")
    public boolean field2621 = false;

    @ObfuscatedName("al.q")
    public int field2624 = -1;

    @ObfuscatedName("al.p")
    public int field2634 = 0;

    @ObfuscatedName("al.z")
    public static class75 field2601 = new class75(100);

    @ObfuscatedName("al.y")
    public short[] field2609;

    @ObfuscatedName("al.az")
    public int field2640 = 0;

    @ObfuscatedName("al.as")
    public int field2625 = -1;

    @ObfuscatedName("al.ar")
    public int field2632 = -1;

    @ObfuscatedName("al.ax")
    public int field2600 = -1;

    @ObfuscatedName("al.aw")
    public int field2639 = -1;

    @ObfuscatedName("al.av")
    public int field2646 = 128;

    @ObfuscatedName("al.au")
    public int[] field2604;

    @ObfuscatedName("al.al")
    public int field2638 = -1;

    @ObfuscatedName("al.ai")
    public int field2633 = -1;

    @ObfuscatedName("al.aj")
    public int[] field2637;

    @ObfuscatedName("al.ao")
    public int field2628 = -1;

    @ObfuscatedName("al.ap")
    public int field2642 = 128;

    @ObfuscatedName("al.am")
    public int field2635 = -1;

    @ObfuscatedName("al.an")
    public int field2613 = -1;

    @ObfuscatedName("al.ac")
    public int field2626 = 0;

    @ObfuscatedName("al.ad")
    public int field2643 = 0;

    @ObfuscatedName("al.aa")
    public int field2630 = -1;

    @ObfuscatedName("al.ag")
    public int field2645 = 0;

    @ObfuscatedName("al.ah")
    public int field2605 = 0;

    @ObfuscatedName("al.ae")
    public int field2612 = -1;

    @ObfuscatedName("al.af")
    public int field2641 = 128;

    @ObfuscatedName("al.c(I)V")
    public void method3085() {
    }

    @ObfuscatedName("al.b(Ldv;I)V")
    public void method3086(class28 arg0) {
        while (true) {
            int var2 = arg0.method450();
            if (var2 == 0) {
                return;
            }
            this.method3087(arg0, var2);
        }
    }

    @ObfuscatedName("al.i(Ldv;II)V")
    public void method3087(class28 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2619 = arg0.method349();
        } else if (arg1 == 2) {
            this.field2608 = arg0.method451();
        } else if (arg1 == 4) {
            this.field2616 = arg0.method349();
        } else if (arg1 == 5) {
            this.field2634 = arg0.method349();
        } else if (arg1 == 6) {
            this.field2615 = arg0.method349();
        } else if (arg1 == 7) {
            this.field2614 = arg0.method349();
            if (this.field2614 > 32767) {
                this.field2614 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2618 = arg0.method349();
            if (this.field2618 > 32767) {
                this.field2618 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2644 = 1;
        } else if (arg1 == 12) {
            this.field2620 = arg0.method504();
        } else if (arg1 == 16) {
            this.field2621 = true;
        } else if (arg1 == 23) {
            this.field2624 = arg0.method349();
            this.field2626 = arg0.method450();
        } else if (arg1 == 24) {
            this.field2625 = arg0.method349();
        } else if (arg1 == 25) {
            this.field2600 = arg0.method349();
            this.field2605 = arg0.method450();
        } else if (arg1 == 26) {
            this.field2628 = arg0.method349();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2622[arg1 - 30] = arg0.method451();
            if (this.field2622[arg1 - 30].equalsIgnoreCase(class57.field819)) {
                this.field2622[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2623[arg1 - 35] = arg0.method451();
        } else if (arg1 == 40) {
            int var3 = arg0.method450();
            this.field2609 = new short[var3];
            this.field2610 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2609[var4] = (short) arg0.method349();
                this.field2610[var4] = (short) arg0.method349();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method450();
            this.field2611 = new short[var5];
            this.field2607 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2611[var6] = (short) arg0.method349();
                this.field2607[var6] = (short) arg0.method349();
            }
        } else if (arg1 == 78) {
            this.field2630 = arg0.method349();
        } else if (arg1 == 79) {
            this.field2613 = arg0.method349();
        } else if (arg1 == 90) {
            this.field2632 = arg0.method349();
        } else if (arg1 == 91) {
            this.field2612 = arg0.method349();
        } else if (arg1 == 92) {
            this.field2633 = arg0.method349();
        } else if (arg1 == 93) {
            this.field2635 = arg0.method349();
        } else if (arg1 == 95) {
            this.field2617 = arg0.method349();
        } else if (arg1 == 97) {
            this.field2638 = arg0.method349();
        } else if (arg1 == 98) {
            this.field2639 = arg0.method349();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2637 == null) {
                this.field2637 = new int[10];
                this.field2604 = new int[10];
            }
            this.field2637[arg1 - 100] = arg0.method349();
            this.field2604[arg1 - 100] = arg0.method349();
        } else if (arg1 == 110) {
            this.field2646 = arg0.method349();
        } else if (arg1 == 111) {
            this.field2641 = arg0.method349();
        } else if (arg1 == 112) {
            this.field2642 = arg0.method349();
        } else if (arg1 == 113) {
            this.field2643 = arg0.method313();
        } else if (arg1 == 114) {
            this.field2640 = arg0.method313() * 5;
        } else if (arg1 == 115) {
            this.field2645 = arg0.method450();
        }
    }

    @ObfuscatedName("al.g(ZI)Z")
    public final boolean method3091(boolean arg0) {
        int var2 = this.field2624;
        int var3 = this.field2625;
        int var4 = this.field2630;
        if (arg0) {
            var2 = this.field2600;
            var3 = this.field2628;
            var4 = this.field2613;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2606.method1300(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2606.method1300(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2606.method1300(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("al.y(ZB)Lcl;")
    public final class151 method3092(boolean arg0) {
        int var2 = this.field2624;
        int var3 = this.field2625;
        int var4 = this.field2630;
        if (arg0) {
            var2 = this.field2600;
            var3 = this.field2628;
            var4 = this.field2613;
        }
        if (var2 == -1) {
            return null;
        }
        class151 var5 = class151.method2655(Statics.field2606, var2, 0);
        if (var3 != -1) {
            class151 var6 = class151.method2655(Statics.field2606, var3, 0);
            if (var4 == -1) {
                class151[] var9 = new class151[] { var5, var6 };
                var5 = new class151(var9, 2);
            } else {
                class151 var7 = class151.method2655(Statics.field2606, var4, 0);
                class151[] var8 = new class151[] { var5, var6, var7 };
                var5 = new class151(var8, 3);
            }
        }
        if (!arg0 && this.field2626 != 0) {
            var5.method2666(0, this.field2626, 0);
        }
        if (arg0 && this.field2605 != 0) {
            var5.method2666(0, this.field2605, 0);
        }
        if (this.field2609 != null) {
            for (int var10 = 0; var10 < this.field2609.length; var10++) {
                var5.method2668(this.field2609[var10], this.field2610[var10]);
            }
        }
        if (this.field2611 != null) {
            for (int var11 = 0; var11 < this.field2611.length; var11++) {
                var5.method2657(this.field2611[var11], this.field2607[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("al.m(Lal;Lal;B)V")
    public void method3093(class172 arg0, class172 arg1) {
        this.field2619 = arg0.field2619;
        this.field2616 = arg0.field2616;
        this.field2634 = arg0.field2634;
        this.field2615 = arg0.field2615;
        this.field2617 = arg0.field2617;
        this.field2614 = arg0.field2614;
        this.field2618 = arg0.field2618;
        this.field2609 = arg0.field2609;
        this.field2610 = arg0.field2610;
        this.field2611 = arg0.field2611;
        this.field2607 = arg0.field2607;
        this.field2608 = arg1.field2608;
        this.field2621 = arg1.field2621;
        this.field2620 = arg1.field2620;
        this.field2644 = 1;
    }

    @ObfuscatedName("al.u(ZI)Lcl;")
    public final class151 method3094(boolean arg0) {
        int var2 = this.field2632;
        int var3 = this.field2633;
        if (arg0) {
            var2 = this.field2612;
            var3 = this.field2635;
        }
        if (var2 == -1) {
            return null;
        }
        class151 var4 = class151.method2655(Statics.field2606, var2, 0);
        if (var3 != -1) {
            class151 var5 = class151.method2655(Statics.field2606, var3, 0);
            class151[] var6 = new class151[] { var4, var5 };
            var4 = new class151(var6, 2);
        }
        if (this.field2609 != null) {
            for (int var7 = 0; var7 < this.field2609.length; var7++) {
                var4.method2668(this.field2609[var7], this.field2610[var7]);
            }
        }
        if (this.field2611 != null) {
            for (int var8 = 0; var8 < this.field2611.length; var8++) {
                var4.method2657(this.field2611[var8], this.field2607[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("al.x(II)Ldk;")
    public final class43 method3095(int arg0) {
        if (this.field2637 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2604[var3] && this.field2604[var3] != 0) {
                    var2 = this.field2637[var3];
                }
            }
            if (var2 != -1) {
                return method934(var2).method3095(1);
            }
        }
        class43 var4 = (class43) field2629.method1196((long) this.field2636);
        if (var4 != null) {
            return var4;
        }
        class151 var5 = class151.method2655(Statics.field2606, this.field2619, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2646 != 128 || this.field2641 != 128 || this.field2642 != 128) {
            var5.method2670(this.field2646, this.field2641, this.field2642);
        }
        if (this.field2609 != null) {
            for (int var6 = 0; var6 < this.field2609.length; var6++) {
                var5.method2668(this.field2609[var6], this.field2610[var6]);
            }
        }
        if (this.field2611 != null) {
            for (int var7 = 0; var7 < this.field2611.length; var7++) {
                var5.method2657(this.field2611[var7], this.field2607[var7]);
            }
        }
        class43 var8 = var5.method2675(this.field2643 + 64, this.field2640 + 768, -50, -10, -50);
        var8.field489 = true;
        field2629.method1184(var8, (long) this.field2636);
        return var8;
    }

    @ObfuscatedName("al.z(II)Lcl;")
    public final class151 method3108(int arg0) {
        if (this.field2637 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2604[var3] && this.field2604[var3] != 0) {
                    var2 = this.field2637[var3];
                }
            }
            if (var2 != -1) {
                return method934(var2).method3108(1);
            }
        }
        class151 var4 = class151.method2655(Statics.field2606, this.field2619, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2646 != 128 || this.field2641 != 128 || this.field2642 != 128) {
            var4.method2670(this.field2646, this.field2641, this.field2642);
        }
        if (this.field2609 != null) {
            for (int var5 = 0; var5 < this.field2609.length; var5++) {
                var4.method2668(this.field2609[var5], this.field2610[var5]);
            }
        }
        if (this.field2611 != null) {
            for (int var6 = 0; var6 < this.field2611.length; var6++) {
                var4.method2657(this.field2611[var6], this.field2607[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("al.d(IB)Lal;")
    public class172 method3126(int arg0) {
        if (this.field2637 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2604[var3] && this.field2604[var3] != 0) {
                    var2 = this.field2637[var3];
                }
            }
            if (var2 != -1) {
                return method934(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("al.a(ZI)Z")
    public final boolean method3130(boolean arg0) {
        int var2 = this.field2632;
        int var3 = this.field2633;
        if (arg0) {
            var2 = this.field2612;
            var3 = this.field2635;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2606.method1300(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2606.method1300(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("dh.e(I)V")
    public static void method770() {
        field2601.method1188();
    }

    @ObfuscatedName("e.v(IB)Lal;")
    public static class172 method934(int arg0) {
        class172 var1 = (class172) field2603.method1196((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2631.method1298(10, arg0);
        class172 var3 = new class172();
        var3.field2636 = arg0;
        if (var2 != null) {
            var3.method3086(new class28(var2));
        }
        var3.method3085();
        if (var3.field2639 != -1) {
            var3.method3093(method934(var3.field2639), method934(var3.field2638));
        }
        if (!Statics.field2602 && var3.field2621) {
            var3.field2608 = class57.field667;
            var3.field2622 = null;
            var3.field2623 = null;
            var3.field2645 = 0;
        }
        field2603.method1184(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("l.j(IIIIZI)Lcv;")
    public static final class140 method1085(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class140 var7 = (class140) field2601.method1196(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class172 var8 = method934(arg0);
        if (arg1 > 1 && var8.field2637 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2604[var10] && var8.field2604[var10] != 0) {
                    var9 = var8.field2637[var10];
                }
            }
            if (var9 != -1) {
                var8 = method934(var9);
            }
        }
        class43 var11 = var8.method3095(1);
        if (var11 == null) {
            return null;
        }
        class140 var12 = null;
        if (var8.field2639 != -1) {
            var12 = method1085(var8.field2638, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1454;
        int var14 = Statics.field1450;
        int var15 = Statics.field1448;
        int[] var16 = new int[4];
        class106.method1533(var16);
        class140 var17 = new class140(36, 32);
        class106.method1548(var17.field2135, 36, 32);
        class106.method1584();
        class155.method2752();
        class155.method2755(16, 16);
        class155.field2326 = false;
        int var18 = var8.field2616;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class155.field2344[var8.field2634] * var18 >> 16;
        int var20 = class155.field2332[var8.field2634] * var18 >> 16;
        var11.method778();
        var11.method795(0, var8.field2615, var8.field2617, var8.field2634, var8.field2614, var8.field2618 + var11.field1455 / 2 + var19, var8.field2618 + var20);
        if (arg2 >= 1) {
            var17.method2499(1);
        }
        if (arg2 >= 2) {
            var17.method2499(16777215);
        }
        if (arg3 != 0) {
            var17.method2486(arg3);
        }
        class106.method1548(var17.field2135, 36, 32);
        if (var8.field2639 != -1) {
            var12.method2489(0, 0);
        }
        if (!arg4 && (var8.field2644 == 1 || arg1 != 1) && arg1 != -1) {
            class23 var21 = Statics.field2158;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class57.field795 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class57.field793 + "</col>";
            }
            var21.method221(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field2601.method1184(var17, var5);
        }
        class106.method1548(var13, var14, var15);
        class106.method1535(var16);
        class155.method2752();
        class155.field2326 = true;
        return var17;
    }

    @ObfuscatedName("w.k(I)V")
    public static void method1218() {
        field2603.method1188();
        field2629.method1188();
        field2601.method1188();
    }
}
