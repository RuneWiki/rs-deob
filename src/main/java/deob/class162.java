package deob;

@ObfuscatedName("fg")
public class class162 extends class143 {

    @ObfuscatedName("fg.k")
    public static class101 field2432 = new class101(64);

    @ObfuscatedName("fg.u")
    public static class101 field2433 = new class101(50);

    @ObfuscatedName("fg.v")
    public static class101 field2434 = new class101(100);

    @ObfuscatedName("fg.s")
    public int field2435;

    @ObfuscatedName("fg.j")
    public int field2436;

    @ObfuscatedName("fg.e")
    public String field2437 = "null";

    @ObfuscatedName("fg.t")
    public short[] field2458;

    @ObfuscatedName("fg.y")
    public short[] field2439;

    @ObfuscatedName("fg.b")
    public short[] field2443;

    @ObfuscatedName("fg.w")
    public short[] field2441;

    @ObfuscatedName("fg.g")
    public int field2442 = 2000;

    @ObfuscatedName("fg.p")
    public int field2474 = 0;

    @ObfuscatedName("fg.z")
    public int field2448 = 0;

    @ObfuscatedName("fg.n")
    public int field2445 = 0;

    @ObfuscatedName("fg.x")
    public int field2446 = 0;

    @ObfuscatedName("fg.i")
    public int field2447 = 0;

    @ObfuscatedName("fg.m")
    public int field2456 = 0;

    @ObfuscatedName("fg.ai")
    public int field2451 = 1;

    @ObfuscatedName("fg.aa")
    public boolean field2450 = false;

    @ObfuscatedName("fg.af")
    public String[] field2463 = new String[] { null, null, class75.field881, null, null };

    @ObfuscatedName("fg.ae")
    public String[] field2461 = new String[] { null, null, null, null, class75.field1056 };

    @ObfuscatedName("fg.at")
    public int field2453 = -1;

    @ObfuscatedName("fg.aj")
    public int field2465 = -1;

    @ObfuscatedName("fg.ar")
    public int field2455 = 0;

    @ObfuscatedName("fg.au")
    public int field2454 = -1;

    @ObfuscatedName("fg.an")
    public int field2460 = -1;

    @ObfuscatedName("fg.az")
    public int field2471 = 0;

    @ObfuscatedName("fg.ac")
    public int field2459 = -1;

    @ObfuscatedName("fg.ap")
    public int field2431 = -1;

    @ObfuscatedName("fg.ad")
    public int field2457 = -1;

    @ObfuscatedName("fg.ax")
    public int field2462 = -1;

    @ObfuscatedName("fg.as")
    public int field2449 = -1;

    @ObfuscatedName("fg.ak")
    public int field2464 = -1;

    @ObfuscatedName("fg.av")
    public int[] field2440;

    @ObfuscatedName("fg.ay")
    public int[] field2466;

    @ObfuscatedName("fg.ab")
    public int field2467 = -1;

    @ObfuscatedName("fg.am")
    public int field2468 = -1;

    @ObfuscatedName("fg.aw")
    public int field2469 = 128;

    @ObfuscatedName("fg.ag")
    public int field2470 = 128;

    @ObfuscatedName("fg.al")
    public int field2473 = 128;

    @ObfuscatedName("fg.aq")
    public int field2472 = 0;

    @ObfuscatedName("fg.ah")
    public int field2452 = 0;

    @ObfuscatedName("fg.ao")
    public int field2438 = 0;

    @ObfuscatedName("aa.k(Lcv;Lcv;ZLfs;I)V")
    public static void method347(class87 arg0, class87 arg1, boolean arg2, class182 arg3) {
        Statics.field1523 = arg0;
        Statics.field2444 = arg1;
        Statics.field16 = arg2;
        Statics.field1523.method1028(10);
        Statics.field713 = arg3;
    }

    @ObfuscatedName("bc.u(II)Lfg;")
    public static class162 method768(int arg0) {
        class162 var1 = (class162) field2432.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1523.method1024(10, arg0);
        class162 var3 = new class162();
        var3.field2435 = arg0;
        if (var2 != null) {
            var3.method2519(new class136(var2));
        }
        var3.method2529();
        if (var3.field2468 != -1) {
            var3.method2546(method768(var3.field2468), method768(var3.field2467));
        }
        if (!Statics.field16 && var3.field2450) {
            var3.field2437 = class75.field937;
            var3.field2463 = null;
            var3.field2461 = null;
            var3.field2438 = 0;
        }
        field2432.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fg.v(I)V")
    public void method2529() {
    }

    @ObfuscatedName("fg.f(Let;I)V")
    public void method2519(class136 arg0) {
        while (true) {
            int var2 = arg0.method1602();
            if (var2 == 0) {
                return;
            }
            this.method2555(arg0, var2);
        }
    }

    @ObfuscatedName("fg.s(Let;IB)V")
    public void method2555(class136 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2436 = arg0.method1712();
        } else if (arg1 == 2) {
            this.field2437 = arg0.method1610();
        } else if (arg1 == 4) {
            this.field2442 = arg0.method1712();
        } else if (arg1 == 5) {
            this.field2474 = arg0.method1712();
        } else if (arg1 == 6) {
            this.field2448 = arg0.method1712();
        } else if (arg1 == 7) {
            this.field2446 = arg0.method1712();
            if (this.field2446 > 32767) {
                this.field2446 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2447 = arg0.method1712();
            if (this.field2447 > 32767) {
                this.field2447 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2456 = 1;
        } else if (arg1 == 12) {
            this.field2451 = arg0.method1607();
        } else if (arg1 == 16) {
            this.field2450 = true;
        } else if (arg1 == 23) {
            this.field2453 = arg0.method1712();
            this.field2455 = arg0.method1602();
        } else if (arg1 == 24) {
            this.field2465 = arg0.method1712();
        } else if (arg1 == 25) {
            this.field2454 = arg0.method1712();
            this.field2471 = arg0.method1602();
        } else if (arg1 == 26) {
            this.field2460 = arg0.method1712();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2463[arg1 - 30] = arg0.method1610();
            if (this.field2463[arg1 - 30].equalsIgnoreCase(class75.field1093)) {
                this.field2463[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2461[arg1 - 35] = arg0.method1610();
        } else if (arg1 == 40) {
            int var3 = arg0.method1602();
            this.field2458 = new short[var3];
            this.field2439 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2458[var4] = (short) arg0.method1712();
                this.field2439[var4] = (short) arg0.method1712();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method1602();
            this.field2443 = new short[var5];
            this.field2441 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2443[var6] = (short) arg0.method1712();
                this.field2441[var6] = (short) arg0.method1712();
            }
        } else if (arg1 == 78) {
            this.field2459 = arg0.method1712();
        } else if (arg1 == 79) {
            this.field2431 = arg0.method1712();
        } else if (arg1 == 90) {
            this.field2457 = arg0.method1712();
        } else if (arg1 == 91) {
            this.field2449 = arg0.method1712();
        } else if (arg1 == 92) {
            this.field2462 = arg0.method1712();
        } else if (arg1 == 93) {
            this.field2464 = arg0.method1712();
        } else if (arg1 == 95) {
            this.field2445 = arg0.method1712();
        } else if (arg1 == 97) {
            this.field2467 = arg0.method1712();
        } else if (arg1 == 98) {
            this.field2468 = arg0.method1712();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2440 == null) {
                this.field2440 = new int[10];
                this.field2466 = new int[10];
            }
            this.field2440[arg1 - 100] = arg0.method1712();
            this.field2466[arg1 - 100] = arg0.method1712();
        } else if (arg1 == 110) {
            this.field2469 = arg0.method1712();
        } else if (arg1 == 111) {
            this.field2470 = arg0.method1712();
        } else if (arg1 == 112) {
            this.field2473 = arg0.method1712();
        } else if (arg1 == 113) {
            this.field2472 = arg0.method1603();
        } else if (arg1 == 114) {
            this.field2452 = arg0.method1603() * 5;
        } else if (arg1 == 115) {
            this.field2438 = arg0.method1602();
        }
    }

    @ObfuscatedName("fg.j(Lfg;Lfg;I)V")
    public void method2546(class162 arg0, class162 arg1) {
        this.field2436 = arg0.field2436;
        this.field2442 = arg0.field2442;
        this.field2474 = arg0.field2474;
        this.field2448 = arg0.field2448;
        this.field2445 = arg0.field2445;
        this.field2446 = arg0.field2446;
        this.field2447 = arg0.field2447;
        this.field2458 = arg0.field2458;
        this.field2439 = arg0.field2439;
        this.field2443 = arg0.field2443;
        this.field2441 = arg0.field2441;
        this.field2437 = arg1.field2437;
        this.field2450 = arg1.field2450;
        this.field2451 = arg1.field2451;
        this.field2456 = 1;
    }

    @ObfuscatedName("fg.e(II)Lfy;")
    public final class180 method2522(int arg0) {
        if (this.field2440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2466[var3] && this.field2466[var3] != 0) {
                    var2 = this.field2440[var3];
                }
            }
            if (var2 != -1) {
                return method768(var2).method2522(1);
            }
        }
        class180 var4 = class180.method2918(Statics.field2444, this.field2436, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2469 != 128 || this.field2470 != 128 || this.field2473 != 128) {
            var4.method2933(this.field2469, this.field2470, this.field2473);
        }
        if (this.field2458 != null) {
            for (int var5 = 0; var5 < this.field2458.length; var5++) {
                var4.method2930(this.field2458[var5], this.field2439[var5]);
            }
        }
        if (this.field2443 != null) {
            for (int var6 = 0; var6 < this.field2443.length; var6++) {
                var4.method2991(this.field2443[var6], this.field2441[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fg.t(II)Lfb;")
    public final class181 method2523(int arg0) {
        if (this.field2440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2466[var3] && this.field2466[var3] != 0) {
                    var2 = this.field2440[var3];
                }
            }
            if (var2 != -1) {
                return method768(var2).method2523(1);
            }
        }
        class181 var4 = (class181) field2433.method1236((long) this.field2435);
        if (var4 != null) {
            return var4;
        }
        class180 var5 = class180.method2918(Statics.field2444, this.field2436, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2469 != 128 || this.field2470 != 128 || this.field2473 != 128) {
            var5.method2933(this.field2469, this.field2470, this.field2473);
        }
        if (this.field2458 != null) {
            for (int var6 = 0; var6 < this.field2458.length; var6++) {
                var5.method2930(this.field2458[var6], this.field2439[var6]);
            }
        }
        if (this.field2443 != null) {
            for (int var7 = 0; var7 < this.field2443.length; var7++) {
                var5.method2991(this.field2443[var7], this.field2441[var7]);
            }
        }
        class181 var8 = var5.method2938(this.field2472 + 64, this.field2452 + 768, -50, -10, -50);
        var8.field2777 = true;
        field2433.method1238(var8, (long) this.field2435);
        return var8;
    }

    @ObfuscatedName("fg.y(IB)Lfg;")
    public class162 method2524(int arg0) {
        if (this.field2440 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2466[var3] && this.field2466[var3] != 0) {
                    var2 = this.field2440[var3];
                }
            }
            if (var2 != -1) {
                return method768(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("g.b(IIIIZI)Lfh;")
    public static final class171 method245(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class171 var7 = (class171) field2434.method1236(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class162 var8 = method768(arg0);
        if (arg1 > 1 && var8.field2440 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field2466[var10] && var8.field2466[var10] != 0) {
                    var9 = var8.field2440[var10];
                }
            }
            if (var9 != -1) {
                var8 = method768(var9);
            }
        }
        class181 var11 = var8.method2523(1);
        if (var11 == null) {
            return null;
        }
        class171 var12 = null;
        if (var8.field2468 != -1) {
            var12 = method245(var8.field2467, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field2482;
        int var14 = Statics.field2483;
        int var15 = Statics.field2484;
        int[] var16 = new int[4];
        class165.method2598(var16);
        class171 var17 = new class171(36, 32);
        class165.method2584(var17.field2503, 36, 32);
        class165.method2590();
        class173.method2759();
        class173.method2792(16, 16);
        class173.field2535 = false;
        int var18 = var8.field2442;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class173.field2544[var8.field2474] * var18 >> 16;
        int var20 = class173.field2545[var8.field2474] * var18 >> 16;
        var11.method3001();
        var11.method3023(0, var8.field2448, var8.field2445, var8.field2474, var8.field2446, var8.field2447 + var11.field2489 / 2 + var19, var8.field2447 + var20);
        if (arg2 >= 1) {
            var17.method2672(1);
        }
        if (arg2 >= 2) {
            var17.method2672(16777215);
        }
        if (arg3 != 0) {
            var17.method2673(arg3);
        }
        class165.method2584(var17.field2503, 36, 32);
        if (var8.field2468 != -1) {
            var12.method2676(0, 0);
        }
        if (!arg4 && (var8.field2456 == 1 || arg1 != 1) && arg1 != -1) {
            class182 var21 = Statics.field713;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class75.field1042 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class75.field947 + "</col>";
            }
            var21.method2852(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field2434.method1238(var17, var5);
        }
        class165.method2584(var13, var14, var15);
        class165.method2615(var16);
        class173.method2759();
        class173.field2535 = true;
        return var17;
    }

    @ObfuscatedName("fg.w(ZI)Z")
    public final boolean method2525(boolean arg0) {
        int var2 = this.field2453;
        int var3 = this.field2465;
        int var4 = this.field2459;
        if (arg0) {
            var2 = this.field2454;
            var3 = this.field2460;
            var4 = this.field2431;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2444.method1020(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2444.method1020(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2444.method1020(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("fg.g(ZI)Lfy;")
    public final class180 method2526(boolean arg0) {
        int var2 = this.field2453;
        int var3 = this.field2465;
        int var4 = this.field2459;
        if (arg0) {
            var2 = this.field2454;
            var3 = this.field2460;
            var4 = this.field2431;
        }
        if (var2 == -1) {
            return null;
        }
        class180 var5 = class180.method2918(Statics.field2444, var2, 0);
        if (var3 != -1) {
            class180 var6 = class180.method2918(Statics.field2444, var3, 0);
            if (var4 == -1) {
                class180[] var9 = new class180[] { var5, var6 };
                var5 = new class180(var9, 2);
            } else {
                class180 var7 = class180.method2918(Statics.field2444, var4, 0);
                class180[] var8 = new class180[] { var5, var6, var7 };
                var5 = new class180(var8, 3);
            }
        }
        if (!arg0 && this.field2455 != 0) {
            var5.method2957(0, this.field2455, 0);
        }
        if (arg0 && this.field2471 != 0) {
            var5.method2957(0, this.field2471, 0);
        }
        if (this.field2458 != null) {
            for (int var10 = 0; var10 < this.field2458.length; var10++) {
                var5.method2930(this.field2458[var10], this.field2439[var10]);
            }
        }
        if (this.field2443 != null) {
            for (int var11 = 0; var11 < this.field2443.length; var11++) {
                var5.method2991(this.field2443[var11], this.field2441[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("fg.p(ZI)Z")
    public final boolean method2527(boolean arg0) {
        int var2 = this.field2457;
        int var3 = this.field2462;
        if (arg0) {
            var2 = this.field2449;
            var3 = this.field2464;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2444.method1020(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2444.method1020(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("fg.z(ZI)Lfy;")
    public final class180 method2528(boolean arg0) {
        int var2 = this.field2457;
        int var3 = this.field2462;
        if (arg0) {
            var2 = this.field2449;
            var3 = this.field2464;
        }
        if (var2 == -1) {
            return null;
        }
        class180 var4 = class180.method2918(Statics.field2444, var2, 0);
        if (var3 != -1) {
            class180 var5 = class180.method2918(Statics.field2444, var3, 0);
            class180[] var6 = new class180[] { var4, var5 };
            var4 = new class180(var6, 2);
        }
        if (this.field2458 != null) {
            for (int var7 = 0; var7 < this.field2458.length; var7++) {
                var4.method2930(this.field2458[var7], this.field2439[var7]);
            }
        }
        if (this.field2443 != null) {
            for (int var8 = 0; var8 < this.field2443.length; var8++) {
                var4.method2991(this.field2443[var8], this.field2441[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bs.n(I)V")
    public static void method851() {
        field2434.method1239();
    }
}
