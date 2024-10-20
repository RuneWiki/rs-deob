package deob;

@ObfuscatedName("fj")
public class class161 extends class142 {

    @ObfuscatedName("fj.e")
    public static class100 field2427 = new class100(64);

    @ObfuscatedName("fj.a")
    public static class100 field2447 = new class100(50);

    @ObfuscatedName("fj.g")
    public static class100 field2443 = new class100(100);

    @ObfuscatedName("fj.v")
    public int field2430;

    @ObfuscatedName("fj.u")
    public int field2448;

    @ObfuscatedName("fj.m")
    public String field2432 = "null";

    @ObfuscatedName("fj.b")
    public short[] field2433;

    @ObfuscatedName("fj.f")
    public short[] field2434;

    @ObfuscatedName("fj.d")
    public short[] field2449;

    @ObfuscatedName("fj.x")
    public short[] field2436;

    @ObfuscatedName("fj.z")
    public int field2450 = 2000;

    @ObfuscatedName("fj.o")
    public int field2463 = 0;

    @ObfuscatedName("fj.c")
    public int field2439 = 0;

    @ObfuscatedName("fj.y")
    public int field2440 = 0;

    @ObfuscatedName("fj.j")
    public int field2441 = 0;

    @ObfuscatedName("fj.s")
    public int field2442 = 0;

    @ObfuscatedName("fj.p")
    public int field2453 = 0;

    @ObfuscatedName("fj.ak")
    public int field2444 = 1;

    @ObfuscatedName("fj.ap")
    public boolean field2438 = false;

    @ObfuscatedName("fj.ai")
    public String[] field2446 = new String[] { null, null, class74.field861, null, null };

    @ObfuscatedName("fj.ae")
    public String[] field2445 = new String[] { null, null, null, null, class74.field862 };

    @ObfuscatedName("fj.ad")
    public int field2426 = -1;

    @ObfuscatedName("fj.am")
    public int field2429 = -1;

    @ObfuscatedName("fj.ah")
    public int field2428 = 0;

    @ObfuscatedName("fj.au")
    public int field2467 = -1;

    @ObfuscatedName("fj.ac")
    public int field2452 = -1;

    @ObfuscatedName("fj.at")
    public int field2460 = 0;

    @ObfuscatedName("fj.aq")
    public int field2454 = -1;

    @ObfuscatedName("fj.ar")
    public int field2455 = -1;

    @ObfuscatedName("fj.aa")
    public int field2456 = -1;

    @ObfuscatedName("fj.ay")
    public int field2457 = -1;

    @ObfuscatedName("fj.ax")
    public int field2458 = -1;

    @ObfuscatedName("fj.av")
    public int field2431 = -1;

    @ObfuscatedName("fj.az")
    public int[] field2451;

    @ObfuscatedName("fj.al")
    public int[] field2461;

    @ObfuscatedName("fj.ag")
    public int field2462 = -1;

    @ObfuscatedName("fj.as")
    public int field2437 = -1;

    @ObfuscatedName("fj.ab")
    public int field2464 = 128;

    @ObfuscatedName("fj.af")
    public int field2465 = 128;

    @ObfuscatedName("fj.an")
    public int field2466 = 128;

    @ObfuscatedName("fj.aj")
    public int field2459 = 0;

    @ObfuscatedName("fj.ao")
    public int field2468 = 0;

    @ObfuscatedName("fj.aw")
    public int field2469 = 0;

    @ObfuscatedName("d.i(Lcy;Lcy;ZLfa;I)V")
    public static void method254(class86 arg0, class86 arg1, boolean arg2, class181 arg3) {
        Statics.field803 = arg0;
        Statics.field2435 = arg1;
        Statics.field1105 = arg2;
        Statics.field803.method1025(10);
        Statics.field1479 = arg3;
    }

    @ObfuscatedName("fm.e(II)Lfj;")
    public static class161 method2496(int arg0) {
        class161 var1 = (class161) field2427.method1231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field803.method1015(10, arg0);
        class161 var3 = new class161();
        var3.field2430 = arg0;
        if (var2 != null) {
            var3.method2500(new class135(var2));
        }
        var3.method2499();
        if (var3.field2437 != -1) {
            var3.method2527(method2496(var3.field2437), method2496(var3.field2462));
        }
        if (!Statics.field1105 && var3.field2438) {
            var3.field2432 = class74.field860;
            var3.field2446 = null;
            var3.field2445 = null;
            var3.field2469 = 0;
        }
        field2427.method1232(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fj.a(I)V")
    public void method2499() {
    }

    @ObfuscatedName("fj.g(Lec;I)V")
    public void method2500(class135 arg0) {
        while (true) {
            int var2 = arg0.method1571();
            if (var2 == 0) {
                return;
            }
            this.method2504(arg0, var2);
        }
    }

    @ObfuscatedName("fj.w(Lec;II)V")
    public void method2504(class135 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2448 = arg0.method1725();
        } else if (arg1 == 2) {
            this.field2432 = arg0.method1716();
        } else if (arg1 == 4) {
            this.field2450 = arg0.method1725();
        } else if (arg1 == 5) {
            this.field2463 = arg0.method1725();
        } else if (arg1 == 6) {
            this.field2439 = arg0.method1725();
        } else if (arg1 == 7) {
            this.field2441 = arg0.method1725();
            if (this.field2441 > 32767) {
                this.field2441 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2442 = arg0.method1725();
            if (this.field2442 > 32767) {
                this.field2442 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2453 = 1;
        } else if (arg1 == 12) {
            this.field2444 = arg0.method1616();
        } else if (arg1 == 16) {
            this.field2438 = true;
        } else if (arg1 == 23) {
            this.field2426 = arg0.method1725();
            this.field2428 = arg0.method1571();
        } else if (arg1 == 24) {
            this.field2429 = arg0.method1725();
        } else if (arg1 == 25) {
            this.field2467 = arg0.method1725();
            this.field2460 = arg0.method1571();
        } else if (arg1 == 26) {
            this.field2452 = arg0.method1725();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2446[arg1 - 30] = arg0.method1716();
            if (this.field2446[arg1 - 30].equalsIgnoreCase(class74.field863)) {
                this.field2446[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2445[arg1 - 35] = arg0.method1716();
        } else if (arg1 == 40) {
            int var3 = arg0.method1571();
            this.field2433 = new short[var3];
            this.field2434 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2433[var4] = (short) arg0.method1725();
                this.field2434[var4] = (short) arg0.method1725();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method1571();
            this.field2449 = new short[var5];
            this.field2436 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2449[var6] = (short) arg0.method1725();
                this.field2436[var6] = (short) arg0.method1725();
            }
        } else if (arg1 == 78) {
            this.field2454 = arg0.method1725();
        } else if (arg1 == 79) {
            this.field2455 = arg0.method1725();
        } else if (arg1 == 90) {
            this.field2456 = arg0.method1725();
        } else if (arg1 == 91) {
            this.field2458 = arg0.method1725();
        } else if (arg1 == 92) {
            this.field2457 = arg0.method1725();
        } else if (arg1 == 93) {
            this.field2431 = arg0.method1725();
        } else if (arg1 == 95) {
            this.field2440 = arg0.method1725();
        } else if (arg1 == 97) {
            this.field2462 = arg0.method1725();
        } else if (arg1 == 98) {
            this.field2437 = arg0.method1725();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2451 == null) {
                this.field2451 = new int[10];
                this.field2461 = new int[10];
            }
            this.field2451[arg1 - 100] = arg0.method1725();
            this.field2461[arg1 - 100] = arg0.method1725();
        } else if (arg1 == 110) {
            this.field2464 = arg0.method1725();
        } else if (arg1 == 111) {
            this.field2465 = arg0.method1725();
        } else if (arg1 == 112) {
            this.field2466 = arg0.method1725();
        } else if (arg1 == 113) {
            this.field2459 = arg0.method1572();
        } else if (arg1 == 114) {
            this.field2468 = arg0.method1572();
        } else if (arg1 == 115) {
            this.field2469 = arg0.method1571();
        }
    }

    @ObfuscatedName("fj.v(Lfj;Lfj;S)V")
    public void method2527(class161 arg0, class161 arg1) {
        this.field2448 = arg0.field2448;
        this.field2450 = arg0.field2450;
        this.field2463 = arg0.field2463;
        this.field2439 = arg0.field2439;
        this.field2440 = arg0.field2440;
        this.field2441 = arg0.field2441;
        this.field2442 = arg0.field2442;
        this.field2433 = arg0.field2433;
        this.field2434 = arg0.field2434;
        this.field2449 = arg0.field2449;
        this.field2436 = arg0.field2436;
        this.field2432 = arg1.field2432;
        this.field2438 = arg1.field2438;
        this.field2444 = arg1.field2444;
        this.field2453 = 1;
    }

    @ObfuscatedName("fj.u(IB)Lfv;")
    public final class179 method2502(int arg0) {
        if (this.field2451 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2461[var3] && this.field2461[var3] != 0) {
                    var2 = this.field2451[var3];
                }
            }
            if (var2 != -1) {
                return method2496(var2).method2502(1);
            }
        }
        class179 var4 = class179.method2908(Statics.field2435, this.field2448, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2464 != 128 || this.field2465 != 128 || this.field2466 != 128) {
            var4.method2932(this.field2464, this.field2465, this.field2466);
        }
        if (this.field2433 != null) {
            for (int var5 = 0; var5 < this.field2433.length; var5++) {
                var4.method2920(this.field2433[var5], this.field2434[var5]);
            }
        }
        if (this.field2449 != null) {
            for (int var6 = 0; var6 < this.field2449.length; var6++) {
                var4.method2921(this.field2449[var6], this.field2436[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fj.m(II)Lfr;")
    public final class180 method2541(int arg0) {
        if (this.field2451 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2461[var3] && this.field2461[var3] != 0) {
                    var2 = this.field2451[var3];
                }
            }
            if (var2 != -1) {
                return method2496(var2).method2541(1);
            }
        }
        class180 var4 = (class180) field2447.method1231((long) this.field2430);
        if (var4 != null) {
            return var4;
        }
        class179 var5 = class179.method2908(Statics.field2435, this.field2448, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2464 != 128 || this.field2465 != 128 || this.field2466 != 128) {
            var5.method2932(this.field2464, this.field2465, this.field2466);
        }
        if (this.field2433 != null) {
            for (int var6 = 0; var6 < this.field2433.length; var6++) {
                var5.method2920(this.field2433[var6], this.field2434[var6]);
            }
        }
        if (this.field2449 != null) {
            for (int var7 = 0; var7 < this.field2449.length; var7++) {
                var5.method2921(this.field2449[var7], this.field2436[var7]);
            }
        }
        class180 var8 = var5.method2928(this.field2459 + 64, this.field2468 * 5 + 768, -50, -10, -50);
        var8.field2744 = true;
        field2447.method1232(var8, (long) this.field2430);
        return var8;
    }

    @ObfuscatedName("fj.b(II)Lfj;")
    public class161 method2501(int arg0) {
        if (this.field2451 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2461[var3] && this.field2461[var3] != 0) {
                    var2 = this.field2451[var3];
                }
            }
            if (var2 != -1) {
                return method2496(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("w.f(IIIIZI)Lfz;")
    public static final class170 method114(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class170 var7 = (class170) field2443.method1231(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class161 var8 = method2496(arg0);
        if (arg1 > 1 && var8.field2451 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2461[var10] && var8.field2461[var10] != 0) {
                    var9 = var8.field2451[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2496(var9);
            }
        }
        class180 var11 = var8.method2541(1);
        if (var11 == null) {
            return null;
        }
        class170 var12 = null;
        if (var8.field2437 != -1) {
            var12 = method114(var8.field2462, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field2482;
        int var14 = Statics.field2477;
        int var15 = Statics.field2478;
        int[] var16 = new int[4];
        class164.method2573(var16);
        class170 var17 = new class170(36, 32);
        class164.method2591(var17.field2509, 36, 32);
        class164.method2580();
        class172.method2748();
        class172.method2782(16, 16);
        class172.field2530 = false;
        int var18 = var8.field2450;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class172.field2543[var8.field2463] * var18 >> 16;
        int var20 = class172.field2544[var8.field2463] * var18 >> 16;
        var11.method2977();
        var11.method2986(0, var8.field2439, var8.field2440, var8.field2463, var8.field2441, var8.field2442 + var11.field2484 / 2 + var19, var8.field2442 + var20);
        if (arg2 >= 1) {
            var17.method2661(1);
        }
        if (arg2 >= 2) {
            var17.method2661(16777215);
        }
        if (arg3 != 0) {
            var17.method2662(arg3);
        }
        class164.method2591(var17.field2509, 36, 32);
        if (var8.field2437 != -1) {
            var12.method2683(0, 0);
        }
        if (!arg4 && (var8.field2453 == 1 || arg1 != 1) && arg1 != -1) {
            class181 var21 = Statics.field1479;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class74.field1001 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class74.field1011 + "</col>";
            }
            var21.method2876(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field2443.method1232(var17, var5);
        }
        class164.method2591(var13, var14, var15);
        class164.method2579(var16);
        class172.method2748();
        class172.field2530 = true;
        return var17;
    }

    @ObfuscatedName("fj.d(ZI)Z")
    public final boolean method2505(boolean arg0) {
        int var2 = this.field2426;
        int var3 = this.field2429;
        int var4 = this.field2454;
        if (arg0) {
            var2 = this.field2467;
            var3 = this.field2452;
            var4 = this.field2455;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2435.method1017(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2435.method1017(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2435.method1017(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fj.x(ZB)Lfv;")
    public final class179 method2512(boolean arg0) {
        int var2 = this.field2426;
        int var3 = this.field2429;
        int var4 = this.field2454;
        if (arg0) {
            var2 = this.field2467;
            var3 = this.field2452;
            var4 = this.field2455;
        }
        if (var2 == -1) {
            return null;
        }
        class179 var5 = class179.method2908(Statics.field2435, var2, 0);
        if (var3 != -1) {
            class179 var6 = class179.method2908(Statics.field2435, var3, 0);
            if (var4 == -1) {
                class179[] var9 = new class179[] { var5, var6 };
                var5 = new class179(var9, 2);
            } else {
                class179 var7 = class179.method2908(Statics.field2435, var4, 0);
                class179[] var8 = new class179[] { var5, var6, var7 };
                var5 = new class179(var8, 3);
            }
        }
        if (!arg0 && this.field2428 != 0) {
            var5.method2919(0, this.field2428, 0);
        }
        if (arg0 && this.field2460 != 0) {
            var5.method2919(0, this.field2460, 0);
        }
        if (this.field2433 != null) {
            for (int var10 = 0; var10 < this.field2433.length; var10++) {
                var5.method2920(this.field2433[var10], this.field2434[var10]);
            }
        }
        if (this.field2449 != null) {
            for (int var11 = 0; var11 < this.field2449.length; var11++) {
                var5.method2921(this.field2449[var11], this.field2436[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fj.z(ZB)Z")
    public final boolean method2507(boolean arg0) {
        int var2 = this.field2456;
        int var3 = this.field2457;
        if (arg0) {
            var2 = this.field2458;
            var3 = this.field2431;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2435.method1017(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2435.method1017(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fj.o(ZI)Lfv;")
    public final class179 method2529(boolean arg0) {
        int var2 = this.field2456;
        int var3 = this.field2457;
        if (arg0) {
            var2 = this.field2458;
            var3 = this.field2431;
        }
        if (var2 == -1) {
            return null;
        }
        class179 var4 = class179.method2908(Statics.field2435, var2, 0);
        if (var3 != -1) {
            class179 var5 = class179.method2908(Statics.field2435, var3, 0);
            class179[] var6 = new class179[] { var4, var5 };
            var4 = new class179(var6, 2);
        }
        if (this.field2433 != null) {
            for (int var7 = 0; var7 < this.field2433.length; var7++) {
                var4.method2920(this.field2433[var7], this.field2434[var7]);
            }
        }
        if (this.field2449 != null) {
            for (int var8 = 0; var8 < this.field2449.length; var8++) {
                var4.method2921(this.field2449[var8], this.field2436[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dh.c(B)V")
    public static void method1336() {
        field2443.method1221();
    }
}
