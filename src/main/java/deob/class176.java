package deob;

@ObfuscatedName("ap")
public class class176 extends class6 {

    @ObfuscatedName("ap.f")
    public int field2608;

    @ObfuscatedName("ap.g")
    public short[] field2612;

    @ObfuscatedName("ap.d")
    public static class2 field2631 = new class2(100);

    @ObfuscatedName("ap.e")
    public short[] field2634;

    @ObfuscatedName("ap.c")
    public String[] field2613 = new String[] { null, null, null, null, class85.field982 };

    @ObfuscatedName("ap.a")
    public int field2636 = 1;

    @ObfuscatedName("ap.n")
    public int field2619 = 0;

    @ObfuscatedName("ap.o")
    public short[] field2603;

    @ObfuscatedName("ap.m")
    public String[] field2643 = new String[] { null, null, class85.field981, null, null };

    @ObfuscatedName("ap.j")
    public String field2614 = "null";

    @ObfuscatedName("ap.i")
    public int field2617 = 0;

    @ObfuscatedName("ap.w")
    public static class2 field2605 = new class2(64);

    @ObfuscatedName("ap.v")
    public int field2626 = -1;

    @ObfuscatedName("ap.u")
    public int field2620 = 0;

    @ObfuscatedName("ap.t")
    public static class2 field2606 = new class2(50);

    @ObfuscatedName("ap.s")
    public int field2609;

    @ObfuscatedName("ap.r")
    public int field2618 = 0;

    @ObfuscatedName("ap.q")
    public int field2615 = 2000;

    @ObfuscatedName("ap.p")
    public boolean field2610 = false;

    @ObfuscatedName("ap.z")
    public int field2623 = 0;

    @ObfuscatedName("ap.y")
    public int field2621 = 0;

    @ObfuscatedName("ap.x")
    public short[] field2611;

    @ObfuscatedName("ap.ay")
    public int field2647 = 0;

    @ObfuscatedName("ap.at")
    public int field2625 = 0;

    @ObfuscatedName("ap.as")
    public int field2637 = -1;

    @ObfuscatedName("ap.ar")
    public int field2633 = -1;

    @ObfuscatedName("ap.aq")
    public int field2630 = -1;

    @ObfuscatedName("ap.ax")
    public int field2628 = 0;

    @ObfuscatedName("ap.aw")
    public int field2629 = -1;

    @ObfuscatedName("ap.av")
    public int[] field2638;

    @ObfuscatedName("ap.au")
    public int[] field2639;

    @ObfuscatedName("ap.ak")
    public int field2616 = 0;

    @ObfuscatedName("ap.al")
    public int field2646 = 128;

    @ObfuscatedName("ap.ai")
    public int field2607 = -1;

    @ObfuscatedName("ap.ao")
    public int field2642 = 128;

    @ObfuscatedName("ap.ap")
    public int field2640 = -1;

    @ObfuscatedName("ap.am")
    public int field2627 = -1;

    @ObfuscatedName("ap.an")
    public int field2644 = 128;

    @ObfuscatedName("ap.ac")
    public int field2651 = -1;

    @ObfuscatedName("ap.ad")
    public int field2641 = -1;

    @ObfuscatedName("ap.aa")
    public int field2645 = 0;

    @ObfuscatedName("ap.ab")
    public int field2632 = -1;

    @ObfuscatedName("ap.ah")
    public int field2635 = -1;

    @ObfuscatedName("ap.k(I)V")
    public void method3049() {
    }

    @ObfuscatedName("ap.w(Ldp;I)V")
    public void method3050(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3051(arg0, var2);
        }
    }

    @ObfuscatedName("ap.t(Ldp;II)V")
    public void method3051(class50 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2609 = arg0.method720();
        } else if (arg1 == 2) {
            this.field2614 = arg0.method688();
        } else if (arg1 == 4) {
            this.field2615 = arg0.method720();
        } else if (arg1 == 5) {
            this.field2623 = arg0.method720();
        } else if (arg1 == 6) {
            this.field2617 = arg0.method720();
        } else if (arg1 == 7) {
            this.field2619 = arg0.method720();
            if (this.field2619 > 32767) {
                this.field2619 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2620 = arg0.method720();
            if (this.field2620 > 32767) {
                this.field2620 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2621 = 1;
        } else if (arg1 == 12) {
            this.field2636 = arg0.method685();
        } else if (arg1 == 16) {
            this.field2610 = true;
        } else if (arg1 == 23) {
            this.field2626 = arg0.method720();
            this.field2628 = arg0.method726();
        } else if (arg1 == 24) {
            this.field2651 = arg0.method720();
        } else if (arg1 == 25) {
            this.field2629 = arg0.method720();
            this.field2616 = arg0.method726();
        } else if (arg1 == 26) {
            this.field2630 = arg0.method720();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2643[arg1 - 30] = arg0.method688();
            if (this.field2643[arg1 - 30].equalsIgnoreCase(class85.field983)) {
                this.field2643[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2613[arg1 - 35] = arg0.method688();
        } else if (arg1 == 40) {
            int var3 = arg0.method726();
            this.field2611 = new short[var3];
            this.field2612 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2611[var4] = (short) arg0.method720();
                this.field2612[var4] = (short) arg0.method720();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method726();
            this.field2603 = new short[var5];
            this.field2634 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2603[var6] = (short) arg0.method720();
                this.field2634[var6] = (short) arg0.method720();
            }
        } else if (arg1 == 78) {
            this.field2632 = arg0.method720();
        } else if (arg1 == 79) {
            this.field2633 = arg0.method720();
        } else if (arg1 == 90) {
            this.field2607 = arg0.method720();
        } else if (arg1 == 91) {
            this.field2641 = arg0.method720();
        } else if (arg1 == 92) {
            this.field2635 = arg0.method720();
        } else if (arg1 == 93) {
            this.field2637 = arg0.method720();
        } else if (arg1 == 95) {
            this.field2618 = arg0.method720();
        } else if (arg1 == 97) {
            this.field2640 = arg0.method720();
        } else if (arg1 == 98) {
            this.field2627 = arg0.method720();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2638 == null) {
                this.field2638 = new int[10];
                this.field2639 = new int[10];
            }
            this.field2638[arg1 - 100] = arg0.method720();
            this.field2639[arg1 - 100] = arg0.method720();
        } else if (arg1 == 110) {
            this.field2642 = arg0.method720();
        } else if (arg1 == 111) {
            this.field2646 = arg0.method720();
        } else if (arg1 == 112) {
            this.field2644 = arg0.method720();
        } else if (arg1 == 113) {
            this.field2645 = arg0.method681();
        } else if (arg1 == 114) {
            this.field2625 = arg0.method681() * 5;
        } else if (arg1 == 115) {
            this.field2647 = arg0.method726();
        }
    }

    @ObfuscatedName("ap.d(Lap;Lap;I)V")
    public void method3052(class176 arg0, class176 arg1) {
        this.field2609 = arg0.field2609;
        this.field2615 = arg0.field2615;
        this.field2623 = arg0.field2623;
        this.field2617 = arg0.field2617;
        this.field2618 = arg0.field2618;
        this.field2619 = arg0.field2619;
        this.field2620 = arg0.field2620;
        this.field2611 = arg0.field2611;
        this.field2612 = arg0.field2612;
        this.field2603 = arg0.field2603;
        this.field2634 = arg0.field2634;
        this.field2614 = arg1.field2614;
        this.field2610 = arg1.field2610;
        this.field2636 = arg1.field2636;
        this.field2621 = 1;
    }

    @ObfuscatedName("ap.l(II)Lcf;")
    public final class157 method3053(int arg0) {
        if (this.field2638 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2639[var3] && this.field2639[var3] != 0) {
                    var2 = this.field2638[var3];
                }
            }
            if (var2 != -1) {
                return method3351(var2).method3053(1);
            }
        }
        class157 var4 = class157.method2663(Statics.field2602, this.field2609, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2642 != 128 || this.field2646 != 128 || this.field2644 != 128) {
            var4.method2679(this.field2642, this.field2646, this.field2644);
        }
        if (this.field2611 != null) {
            for (int var5 = 0; var5 < this.field2611.length; var5++) {
                var4.method2701(this.field2611[var5], this.field2612[var5]);
            }
        }
        if (this.field2603 != null) {
            for (int var6 = 0; var6 < this.field2603.length; var6++) {
                var4.method2678(this.field2603[var6], this.field2634[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.f(II)Ldu;")
    public final class27 method3054(int arg0) {
        if (this.field2638 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2639[var3] && this.field2639[var3] != 0) {
                    var2 = this.field2638[var3];
                }
            }
            if (var2 != -1) {
                return method3351(var2).method3054(1);
            }
        }
        class27 var4 = (class27) field2606.method1((long) this.field2608);
        if (var4 != null) {
            return var4;
        }
        class157 var5 = class157.method2663(Statics.field2602, this.field2609, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2642 != 128 || this.field2646 != 128 || this.field2644 != 128) {
            var5.method2679(this.field2642, this.field2646, this.field2644);
        }
        if (this.field2611 != null) {
            for (int var6 = 0; var6 < this.field2611.length; var6++) {
                var5.method2701(this.field2611[var6], this.field2612[var6]);
            }
        }
        if (this.field2603 != null) {
            for (int var7 = 0; var7 < this.field2603.length; var7++) {
                var5.method2678(this.field2603[var7], this.field2634[var7]);
            }
        }
        class27 var8 = var5.method2706(this.field2645 + 64, this.field2625 + 768, -50, -10, -50);
        var8.field291 = true;
        field2606.method4(var8, (long) this.field2608);
        return var8;
    }

    @ObfuscatedName("ap.g(ZI)Z")
    public final boolean method3056(boolean arg0) {
        int var2 = this.field2626;
        int var3 = this.field2651;
        int var4 = this.field2632;
        if (arg0) {
            var2 = this.field2629;
            var3 = this.field2630;
            var4 = this.field2633;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2602.method1268(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2602.method1268(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2602.method1268(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ap.o(ZI)Lcf;")
    public final class157 method3057(boolean arg0) {
        int var2 = this.field2626;
        int var3 = this.field2651;
        int var4 = this.field2632;
        if (arg0) {
            var2 = this.field2629;
            var3 = this.field2630;
            var4 = this.field2633;
        }
        if (var2 == -1) {
            return null;
        }
        class157 var5 = class157.method2663(Statics.field2602, var2, 0);
        if (var3 != -1) {
            class157 var6 = class157.method2663(Statics.field2602, var3, 0);
            if (var4 == -1) {
                class157[] var9 = new class157[] { var5, var6 };
                var5 = new class157(var9, 2);
            } else {
                class157 var7 = class157.method2663(Statics.field2602, var4, 0);
                class157[] var8 = new class157[] { var5, var6, var7 };
                var5 = new class157(var8, 3);
            }
        }
        if (!arg0 && this.field2628 != 0) {
            var5.method2677(0, this.field2628, 0);
        }
        if (arg0 && this.field2616 != 0) {
            var5.method2677(0, this.field2616, 0);
        }
        if (this.field2611 != null) {
            for (int var10 = 0; var10 < this.field2611.length; var10++) {
                var5.method2701(this.field2611[var10], this.field2612[var10]);
            }
        }
        if (this.field2603 != null) {
            for (int var11 = 0; var11 < this.field2603.length; var11++) {
                var5.method2678(this.field2603[var11], this.field2634[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ap.s(IS)Lap;")
    public class176 method3058(int arg0) {
        if (this.field2638 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2639[var3] && this.field2639[var3] != 0) {
                    var2 = this.field2638[var3];
                }
            }
            if (var2 != -1) {
                return method3351(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ap.q(ZI)Lcf;")
    public final class157 method3059(boolean arg0) {
        int var2 = this.field2607;
        int var3 = this.field2635;
        if (arg0) {
            var2 = this.field2641;
            var3 = this.field2637;
        }
        if (var2 == -1) {
            return null;
        }
        class157 var4 = class157.method2663(Statics.field2602, var2, 0);
        if (var3 != -1) {
            class157 var5 = class157.method2663(Statics.field2602, var3, 0);
            class157[] var6 = new class157[] { var4, var5 };
            var4 = new class157(var6, 2);
        }
        if (this.field2611 != null) {
            for (int var7 = 0; var7 < this.field2611.length; var7++) {
                var4.method2701(this.field2611[var7], this.field2612[var7]);
            }
        }
        if (this.field2603 != null) {
            for (int var8 = 0; var8 < this.field2603.length; var8++) {
                var4.method2678(this.field2603[var8], this.field2634[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ap.e(ZI)Z")
    public final boolean method3087(boolean arg0) {
        int var2 = this.field2607;
        int var3 = this.field2635;
        if (arg0) {
            var2 = this.field2641;
            var3 = this.field2637;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2602.method1268(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2602.method1268(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("dj.b(Lek;Lek;ZLgk;B)V")
    public static void method597(class89 arg0, class89 arg1, boolean arg2, class23 arg3) {
        Statics.field2649 = arg0;
        Statics.field2602 = arg1;
        Statics.field2604 = arg2;
        Statics.field2649.method1276(10);
        Statics.field2042 = arg3;
    }

    @ObfuscatedName("l.j(IIIIZI)Lce;")
    public static final class156 method1133(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class156 var7 = (class156) field2631.method1(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class176 var8 = method3351(arg0);
        if (arg1 > 1 && var8.field2638 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2639[var10] && var8.field2639[var10] != 0) {
                    var9 = var8.field2638[var10];
                }
            }
            if (var9 != -1) {
                var8 = method3351(var9);
            }
        }
        class27 var11 = var8.method3054(1);
        if (var11 == null) {
            return null;
        }
        class156 var12 = null;
        if (var8.field2627 != -1) {
            var12 = method1133(var8.field2640, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field2213;
        int var14 = Statics.field2209;
        int var15 = Statics.field2210;
        int[] var16 = new int[4];
        class146.method2397(var16);
        class156 var17 = new class156(36, 32);
        class146.method2392(var17.field2346, 36, 32);
        class146.method2441();
        class153.method2519();
        class153.method2522(16, 16);
        class153.field2278 = false;
        int var18 = var8.field2615;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class153.field2293[var8.field2623] * var18 >> 16;
        int var20 = class153.field2299[var8.field2623] * var18 >> 16;
        var11.method389();
        var11.method387(0, var8.field2617, var8.field2618, var8.field2623, var8.field2619, var8.field2620 + var11.field2207 / 2 + var19, var8.field2620 + var20);
        if (arg2 >= 1) {
            var17.method2587(1);
        }
        if (arg2 >= 2) {
            var17.method2587(16777215);
        }
        if (arg3 != 0) {
            var17.method2588(arg3);
        }
        class146.method2392(var17.field2346, 36, 32);
        if (var8.field2627 != -1) {
            var12.method2591(0, 0);
        }
        if (!arg4 && (var8.field2621 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field2042.method286(method2905(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field2631.method4(var17, var5);
        }
        class146.method2392(var13, var14, var15);
        class146.method2391(var16);
        class153.method2519();
        class153.field2278 = true;
        return var17;
    }

    @ObfuscatedName("p.z(I)V")
    public static void method1374() {
        field2605.method5();
        field2606.method5();
        field2631.method5();
    }

    @ObfuscatedName("da.i(B)V")
    public static void method2333() {
        field2631.method5();
    }

    @ObfuscatedName("aq.x(II)Ljava/lang/String;")
    public static final String method2905(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class85.field1122 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class85.field1133 + "</col>";
        }
    }

    @ObfuscatedName("ah.h(II)Lap;")
    public static class176 method3351(int arg0) {
        class176 var1 = (class176) field2605.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2649.method1266(10, arg0);
        class176 var3 = new class176();
        var3.field2608 = arg0;
        if (var2 != null) {
            var3.method3050(new class50(var2));
        }
        var3.method3049();
        if (var3.field2627 != -1) {
            var3.method3052(method3351(var3.field2627), method3351(var3.field2640));
        }
        if (!Statics.field2604 && var3.field2610) {
            var3.field2614 = class85.field1069;
            var3.field2643 = null;
            var3.field2613 = null;
            var3.field2647 = 0;
        }
        field2605.method4(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.r(ZB)V")
    public static void method3376(boolean arg0) {
        if (Statics.field2604 != arg0) {
            method1374();
            Statics.field2604 = arg0;
        }
    }
}
