package deob;

@ObfuscatedName("ar")
public class class165 extends class77 {

    @ObfuscatedName("ar.f")
    public String field2482 = "null";

    @ObfuscatedName("ar.g")
    public int field2520;

    @ObfuscatedName("ar.d")
    public String[] field2497 = new String[] { null, null, null, null, class98.field1210 };

    @ObfuscatedName("ar.e")
    public int field2507;

    @ObfuscatedName("ar.b")
    public int field2494 = 1;

    @ObfuscatedName("ar.c")
    public int field2491 = 0;

    @ObfuscatedName("ar.a")
    public int field2498 = -1;

    @ObfuscatedName("ar.l")
    public short[] field2485;

    @ObfuscatedName("ar.m")
    public int field2489 = 0;

    @ObfuscatedName("ar.k")
    public boolean field2495 = false;

    @ObfuscatedName("ar.h")
    public static class67 field2478 = new class67(50);

    @ObfuscatedName("ar.i")
    public int field2487 = 2000;

    @ObfuscatedName("ar.w")
    public short[] field2515;

    @ObfuscatedName("ar.v")
    public int field2474 = 0;

    @ObfuscatedName("ar.u")
    public int field2521 = 0;

    @ObfuscatedName("ar.t")
    public static class67 field2477 = new class67(64);

    @ObfuscatedName("ar.s")
    public int field2522 = 0;

    @ObfuscatedName("ar.r")
    public static class67 field2479 = new class67(100);

    @ObfuscatedName("ar.q")
    public String[] field2486 = new String[] { null, null, class98.field1238, null, null };

    @ObfuscatedName("ar.z")
    public short[] field2481;

    @ObfuscatedName("ar.y")
    public int field2493 = 0;

    @ObfuscatedName("ar.x")
    public short[] field2483;

    @ObfuscatedName("ar.az")
    public int field2517 = 0;

    @ObfuscatedName("ar.ay")
    public int field2508 = -1;

    @ObfuscatedName("ar.at")
    public int field2500 = 0;

    @ObfuscatedName("ar.as")
    public int field2509 = -1;

    @ObfuscatedName("ar.ar")
    public int field2512 = -1;

    @ObfuscatedName("ar.aq")
    public int field2506 = -1;

    @ObfuscatedName("ar.ax")
    public int field2523 = -1;

    @ObfuscatedName("ar.av")
    public int field2492 = 0;

    @ObfuscatedName("ar.au")
    public int field2501 = -1;

    @ObfuscatedName("ar.al")
    public int field2516 = 128;

    @ObfuscatedName("ar.ai")
    public int field2502 = -1;

    @ObfuscatedName("ar.aj")
    public int[] field2511;

    @ObfuscatedName("ar.ap")
    public int field2518 = -1;

    @ObfuscatedName("ar.an")
    public int field2490 = 128;

    @ObfuscatedName("ar.ac")
    public int field2514 = 128;

    @ObfuscatedName("ar.ad")
    public int field2505 = -1;

    @ObfuscatedName("ar.aa")
    public int field2484 = -1;

    @ObfuscatedName("ar.ab")
    public int[] field2488;

    @ObfuscatedName("ar.ag")
    public int field2503 = 0;

    @ObfuscatedName("ar.ah")
    public int field2504 = -1;

    @ObfuscatedName("ar.ae")
    public int field2519 = 0;

    @ObfuscatedName("ar.t(Ldy;II)V")
    public void method3124(class31 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2507 = arg0.method373();
        } else if (arg1 == 2) {
            this.field2482 = arg0.method379();
        } else if (arg1 == 4) {
            this.field2487 = arg0.method373();
        } else if (arg1 == 5) {
            this.field2522 = arg0.method373();
        } else if (arg1 == 6) {
            this.field2489 = arg0.method373();
        } else if (arg1 == 7) {
            this.field2491 = arg0.method373();
            if (this.field2491 > 32767) {
                this.field2491 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2521 = arg0.method373();
            if (this.field2521 > 32767) {
                this.field2521 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2493 = 1;
        } else if (arg1 == 12) {
            this.field2494 = arg0.method376();
        } else if (arg1 == 16) {
            this.field2495 = true;
        } else if (arg1 == 23) {
            this.field2498 = arg0.method373();
            this.field2500 = arg0.method512();
        } else if (arg1 == 24) {
            this.field2484 = arg0.method373();
        } else if (arg1 == 25) {
            this.field2501 = arg0.method373();
            this.field2503 = arg0.method512();
        } else if (arg1 == 26) {
            this.field2523 = arg0.method373();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2486[arg1 - 30] = arg0.method379();
            if (this.field2486[arg1 - 30].equalsIgnoreCase(class98.field1138)) {
                this.field2486[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2497[arg1 - 35] = arg0.method379();
        } else if (arg1 == 40) {
            int var3 = arg0.method512();
            this.field2483 = new short[var3];
            this.field2481 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2483[var4] = (short) arg0.method373();
                this.field2481[var4] = (short) arg0.method373();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method512();
            this.field2485 = new short[var5];
            this.field2515 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2485[var6] = (short) arg0.method373();
                this.field2515[var6] = (short) arg0.method373();
            }
        } else if (arg1 == 78) {
            this.field2504 = arg0.method373();
        } else if (arg1 == 79) {
            this.field2505 = arg0.method373();
        } else if (arg1 == 90) {
            this.field2506 = arg0.method373();
        } else if (arg1 == 91) {
            this.field2508 = arg0.method373();
        } else if (arg1 == 92) {
            this.field2502 = arg0.method373();
        } else if (arg1 == 93) {
            this.field2509 = arg0.method373();
        } else if (arg1 == 95) {
            this.field2474 = arg0.method373();
        } else if (arg1 == 97) {
            this.field2512 = arg0.method373();
        } else if (arg1 == 98) {
            this.field2518 = arg0.method373();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2488 == null) {
                this.field2488 = new int[10];
                this.field2511 = new int[10];
            }
            this.field2488[arg1 - 100] = arg0.method373();
            this.field2511[arg1 - 100] = arg0.method373();
        } else if (arg1 == 110) {
            this.field2514 = arg0.method373();
        } else if (arg1 == 111) {
            this.field2490 = arg0.method373();
        } else if (arg1 == 112) {
            this.field2516 = arg0.method373();
        } else if (arg1 == 113) {
            this.field2517 = arg0.method492();
        } else if (arg1 == 114) {
            this.field2492 = arg0.method492() * 5;
        } else if (arg1 == 115) {
            this.field2519 = arg0.method512();
        }
    }

    @ObfuscatedName("ar.h(Lar;Lar;B)V")
    public void method3125(class165 arg0, class165 arg1) {
        this.field2507 = arg0.field2507;
        this.field2487 = arg0.field2487;
        this.field2522 = arg0.field2522;
        this.field2489 = arg0.field2489;
        this.field2474 = arg0.field2474;
        this.field2491 = arg0.field2491;
        this.field2521 = arg0.field2521;
        this.field2483 = arg0.field2483;
        this.field2481 = arg0.field2481;
        this.field2485 = arg0.field2485;
        this.field2515 = arg0.field2515;
        this.field2482 = arg1.field2482;
        this.field2495 = arg1.field2495;
        this.field2494 = arg1.field2494;
        this.field2493 = 1;
    }

    @ObfuscatedName("ar.r(II)Lct;")
    public final class142 method3126(int arg0) {
        if (this.field2488 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2511[var3] && this.field2511[var3] != 0) {
                    var2 = this.field2488[var3];
                }
            }
            if (var2 != -1) {
                return method3520(var2).method3126(1);
            }
        }
        class142 var4 = class142.method2529(Statics.field2475, this.field2507, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2514 != 128 || this.field2490 != 128 || this.field2516 != 128) {
            var4.method2528(this.field2514, this.field2490, this.field2516);
        }
        if (this.field2483 != null) {
            for (int var5 = 0; var5 < this.field2483.length; var5++) {
                var4.method2542(this.field2483[var5], this.field2481[var5]);
            }
        }
        if (this.field2485 != null) {
            for (int var6 = 0; var6 < this.field2485.length; var6++) {
                var4.method2555(this.field2485[var6], this.field2515[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ar.g(II)Lar;")
    public class165 method3128(int arg0) {
        if (this.field2488 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2511[var3] && this.field2511[var3] != 0) {
                    var2 = this.field2488[var3];
                }
            }
            if (var2 != -1) {
                return method3520(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ar.x(ZI)Z")
    public final boolean method3129(boolean arg0) {
        int var2 = this.field2498;
        int var3 = this.field2484;
        int var4 = this.field2504;
        if (arg0) {
            var2 = this.field2501;
            var3 = this.field2523;
            var4 = this.field2505;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2475.method1085(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2475.method1085(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2475.method1085(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ar.l(ZI)Z")
    public final boolean method3130(boolean arg0) {
        int var2 = this.field2506;
        int var3 = this.field2502;
        if (arg0) {
            var2 = this.field2508;
            var3 = this.field2509;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2475.method1085(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2475.method1085(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ar.w(ZI)Lct;")
    public final class142 method3132(boolean arg0) {
        int var2 = this.field2506;
        int var3 = this.field2502;
        if (arg0) {
            var2 = this.field2508;
            var3 = this.field2509;
        }
        if (var2 == -1) {
            return null;
        }
        class142 var4 = class142.method2529(Statics.field2475, var2, 0);
        if (var3 != -1) {
            class142 var5 = class142.method2529(Statics.field2475, var3, 0);
            class142[] var6 = new class142[] { var4, var5 };
            var4 = new class142(var6, 2);
        }
        if (this.field2483 != null) {
            for (int var7 = 0; var7 < this.field2483.length; var7++) {
                var4.method2542(this.field2483[var7], this.field2481[var7]);
            }
        }
        if (this.field2485 != null) {
            for (int var8 = 0; var8 < this.field2485.length; var8++) {
                var4.method2555(this.field2485[var8], this.field2515[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ar.p(B)V")
    public void method3133() {
    }

    @ObfuscatedName("ar.o(Ldy;I)V")
    public void method3137(class31 arg0) {
        while (true) {
            int var2 = arg0.method512();
            if (var2 == 0) {
                return;
            }
            this.method3124(arg0, var2);
        }
    }

    @ObfuscatedName("ar.z(ZI)Lct;")
    public final class142 method3154(boolean arg0) {
        int var2 = this.field2498;
        int var3 = this.field2484;
        int var4 = this.field2504;
        if (arg0) {
            var2 = this.field2501;
            var3 = this.field2523;
            var4 = this.field2505;
        }
        if (var2 == -1) {
            return null;
        }
        class142 var5 = class142.method2529(Statics.field2475, var2, 0);
        if (var3 != -1) {
            class142 var6 = class142.method2529(Statics.field2475, var3, 0);
            if (var4 == -1) {
                class142[] var9 = new class142[] { var5, var6 };
                var5 = new class142(var9, 2);
            } else {
                class142 var7 = class142.method2529(Statics.field2475, var4, 0);
                class142[] var8 = new class142[] { var5, var6, var7 };
                var5 = new class142(var8, 3);
            }
        }
        if (!arg0 && this.field2500 != 0) {
            var5.method2553(0, this.field2500, 0);
        }
        if (arg0 && this.field2503 != 0) {
            var5.method2553(0, this.field2503, 0);
        }
        if (this.field2483 != null) {
            for (int var10 = 0; var10 < this.field2483.length; var10++) {
                var5.method2542(this.field2483[var10], this.field2481[var10]);
            }
        }
        if (this.field2485 != null) {
            for (int var11 = 0; var11 < this.field2485.length; var11++) {
                var5.method2555(this.field2485[var11], this.field2515[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ar.n(II)Ldi;")
    public final class41 method3161(int arg0) {
        if (this.field2488 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2511[var3] && this.field2511[var3] != 0) {
                    var2 = this.field2488[var3];
                }
            }
            if (var2 != -1) {
                return method3520(var2).method3161(1);
            }
        }
        class41 var4 = (class41) field2478.method908((long) this.field2520);
        if (var4 != null) {
            return var4;
        }
        class142 var5 = class142.method2529(Statics.field2475, this.field2507, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2514 != 128 || this.field2490 != 128 || this.field2516 != 128) {
            var5.method2528(this.field2514, this.field2490, this.field2516);
        }
        if (this.field2483 != null) {
            for (int var6 = 0; var6 < this.field2483.length; var6++) {
                var5.method2542(this.field2483[var6], this.field2481[var6]);
            }
        }
        if (this.field2485 != null) {
            for (int var7 = 0; var7 < this.field2485.length; var7++) {
                var5.method2555(this.field2485[var7], this.field2515[var7]);
            }
        }
        class41 var8 = var5.method2603(this.field2517 + 64, this.field2492 + 768, -50, -10, -50);
        var8.field305 = true;
        field2478.method907(var8, (long) this.field2520);
        return var8;
    }

    @ObfuscatedName("dx.i(B)V")
    public static void method355() {
        field2477.method910();
        field2478.method910();
        field2479.method910();
    }

    @ObfuscatedName("ec.f(II)Ljava/lang/String;")
    public static final String method617(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class98.field1290 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class98.field1288 + "</col>";
        }
    }

    @ObfuscatedName("ck.s(I)V")
    public static void method2769() {
        field2479.method910();
    }

    @ObfuscatedName("ag.e(IIIIZI)Lcs;")
    public static final class143 method3489(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class143 var7 = (class143) field2479.method908(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class165 var8 = method3520(arg0);
        if (arg1 > 1 && var8.field2488 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2511[var10] && var8.field2511[var10] != 0) {
                    var9 = var8.field2488[var10];
                }
            }
            if (var9 != -1) {
                var8 = method3520(var9);
            }
        }
        class41 var11 = var8.method3161(1);
        if (var11 == null) {
            return null;
        }
        class143 var12 = null;
        if (var8.field2518 != -1) {
            var12 = method3489(var8.field2512, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field2036;
        int var14 = Statics.field2034;
        int var15 = Statics.field2035;
        int[] var16 = new int[4];
        class139.method2302(var16);
        class143 var17 = new class143(36, 32);
        class139.method2304(var17.field2171, 36, 32);
        class139.method2307();
        class151.method2786();
        class151.method2796(16, 16);
        class151.field2265 = false;
        int var18 = var8.field2487;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class151.field2285[var8.field2522] * var18 >> 16;
        int var20 = class151.field2286[var8.field2522] * var18 >> 16;
        var11.method704();
        var11.method655(0, var8.field2489, var8.field2474, var8.field2522, var8.field2491, var8.field2521 + var11.field2174 / 2 + var19, var8.field2521 + var20);
        if (arg2 >= 1) {
            var17.method2639(1);
        }
        if (arg2 >= 2) {
            var17.method2639(16777215);
        }
        if (arg3 != 0) {
            var17.method2618(arg3);
        }
        class139.method2304(var17.field2171, 36, 32);
        if (var8.field2518 != -1) {
            var12.method2621(0, 0);
        }
        if (!arg4 && (var8.field2493 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field1433.method62(method617(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field2479.method907(var17, var5);
        }
        class139.method2304(var13, var14, var15);
        class139.method2310(var16);
        class151.method2786();
        class151.field2265 = true;
        return var17;
    }

    @ObfuscatedName("ah.j(II)Lar;")
    public static class165 method3520(int arg0) {
        class165 var1 = (class165) field2477.method908((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2480.method1083(10, arg0);
        class165 var3 = new class165();
        var3.field2520 = arg0;
        if (var2 != null) {
            var3.method3137(new class31(var2));
        }
        var3.method3133();
        if (var3.field2518 != -1) {
            var3.method3125(method3520(var3.field2518), method3520(var3.field2512));
        }
        if (!Statics.field2510 && var3.field2495) {
            var3.field2482 = class98.field1153;
            var3.field2486 = null;
            var3.field2497 = null;
            var3.field2519 = 0;
        }
        field2477.method907(var3, (long) arg0);
        return var3;
    }
}
