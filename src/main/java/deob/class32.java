package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ak")
public class class32 {

    @ObfuscatedName("ak.i")
    public static int[] field682 = new int[5];

    @ObfuscatedName("ak.b")
    public static int[][] field691 = new int[5][5000];

    @ObfuscatedName("ak.s")
    public static int[] field686 = new int[1000];

    @ObfuscatedName("ak.q")
    public static String[] field695 = new String[1000];

    @ObfuscatedName("ak.p")
    public static int field684 = 0;

    @ObfuscatedName("ak.h")
    public static class13[] field689 = new class13[50];

    @ObfuscatedName("ak.f")
    public static Calendar field690 = Calendar.getInstance();

    @ObfuscatedName("ak.u")
    public static final String[] field688 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.j(Lz;II)V")
    public static void method1856(class1 arg0, int arg1) {
        Object[] var2 = arg0.field10;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method96(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field514;
        int[] var9 = var4.field515;
        byte var10 = -1;
        field684 = 0;
        try {
            Statics.field687 = new int[var4.field517];
            int var11 = 0;
            Statics.field573 = new String[var4.field523];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field19 == null ? -1 : arg0.field19.field2559;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field19 == null ? -1 : arg0.field19.field2568;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field14 == null ? -1 : arg0.field14.field2559;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field14 == null ? -1 : arg0.field14.field2568;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field687[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field9;
                    }
                    Statics.field573[var12++] = var15;
                }
            }
            int var16 = 0;
            label2455: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var390 = var8[var7];
                if (var390 < 100) {
                    if (var390 == 0) {
                        field686[var5++] = var9[var7];
                        continue;
                    }
                    if (var390 == 1) {
                        int var17 = var9[var7];
                        field686[var5++] = class154.field2649[var17];
                        continue;
                    }
                    if (var390 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2649[var18] = field686[var5];
                        client.method1962(var18);
                        continue;
                    }
                    if (var390 == 3) {
                        field695[var6++] = var4.field516[var7];
                        continue;
                    }
                    if (var390 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var390 == 7) {
                        var5 -= 2;
                        if (field686[var5 + 1] != field686[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 8) {
                        var5 -= 2;
                        if (field686[var5 + 1] == field686[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 9) {
                        var5 -= 2;
                        if (field686[var5] < field686[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 10) {
                        var5 -= 2;
                        if (field686[var5] > field686[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 21) {
                        if (field684 == 0) {
                            return;
                        }
                        class13 var19 = field689[--field684];
                        var4 = var19.field180;
                        var8 = var4.field514;
                        var9 = var4.field515;
                        var7 = var19.field179;
                        Statics.field687 = var19.field178;
                        Statics.field573 = var19.field181;
                        continue;
                    }
                    if (var390 == 25) {
                        int var20 = var9[var7];
                        field686[var5++] = class154.method2824(var20);
                        continue;
                    }
                    if (var390 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field686[var5];
                        class42 var23 = class42.method565(var21);
                        int var24 = var23.field954;
                        int var25 = var23.field951;
                        int var26 = var23.field952;
                        int var27 = class154.field2645[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class154.field2649[var24] = class154.field2649[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var390 == 31) {
                        var5 -= 2;
                        if (field686[var5] <= field686[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 32) {
                        var5 -= 2;
                        if (field686[var5] >= field686[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var390 == 33) {
                        field686[var5++] = Statics.field687[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var390 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field687[var10001] = field686[var5];
                        continue;
                    }
                    if (var390 == 35) {
                        field695[var6++] = Statics.field573[var9[var7]];
                        continue;
                    }
                    if (var390 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field573[var10001] = field695[var6];
                        continue;
                    }
                    if (var390 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class197.method3057(field695, var6, var29);
                        field695[var6++] = var30;
                        continue;
                    }
                    if (var390 == 38) {
                        var5--;
                        continue;
                    }
                    if (var390 == 39) {
                        var6--;
                        continue;
                    }
                    if (var390 == 40) {
                        int var31 = var9[var7];
                        class19 var32 = class19.method96(var31);
                        int[] var33 = new int[var32.field517];
                        String[] var34 = new String[var32.field523];
                        for (int var35 = 0; var35 < var32.field521; var35++) {
                            var33[var35] = field686[var5 - var32.field521 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field513; var36++) {
                            var34[var36] = field695[var6 - var32.field513 + var36];
                        }
                        var5 -= var32.field521;
                        var6 -= var32.field513;
                        class13 var37 = new class13();
                        var37.field180 = var4;
                        var37.field179 = var7;
                        var37.field178 = Statics.field687;
                        var37.field181 = Statics.field573;
                        field689[++field684 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field514;
                        var9 = var32.field515;
                        var7 = -1;
                        Statics.field687 = var33;
                        Statics.field573 = var34;
                        continue;
                    }
                    if (var390 == 42) {
                        field686[var5++] = client.field350[var9[var7]];
                        continue;
                    }
                    if (var390 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field350[var10001] = field686[var5];
                        continue;
                    }
                    if (var390 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field686[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field682[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2455;
                                }
                                field691[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field686[var5];
                        if (var44 >= 0 && var44 < field682[var43]) {
                            field686[var5++] = field691[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field686[var5];
                        if (var46 >= 0 && var46 < field682[var45]) {
                            field691[var45][var46] = field686[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var390 == 47) {
                        String var47 = client.field253[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field695[var6++] = var47;
                        continue;
                    }
                    if (var390 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field253[var10001] = field695[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var390 < 1000) {
                    if (var390 == 100) {
                        var5 -= 3;
                        int var49 = field686[var5];
                        int var50 = field686[var5 + 1];
                        int var51 = field686[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var52 = class152.method124(var49);
                        if (var52.field2622 == null) {
                            var52.field2622 = new class152[var51 + 1];
                        }
                        if (var52.field2622.length <= var51) {
                            class152[] var53 = new class152[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2622.length; var54++) {
                                var53[var54] = var52.field2622[var54];
                            }
                            var52.field2622 = var53;
                        }
                        if (var51 > 0 && var52.field2622[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class152 var55 = new class152();
                        var55.field2524 = var50;
                        var55.field2533 = var55.field2559 = var52.field2559;
                        var55.field2568 = var51;
                        var55.field2636 = true;
                        var52.field2622[var51] = var55;
                        if (var48) {
                            Statics.field597 = var55;
                        } else {
                            Statics.field2917 = var55;
                        }
                        client.method151(var52);
                        continue;
                    }
                    if (var390 == 101) {
                        class152 var56 = var48 ? Statics.field597 : Statics.field2917;
                        class152 var57 = class152.method124(var56.field2559);
                        var57.field2622[var56.field2568] = null;
                        client.method151(var57);
                        continue;
                    }
                    if (var390 == 102) {
                        var5--;
                        class152 var58 = class152.method124(field686[var5]);
                        var58.field2622 = null;
                        client.method151(var58);
                        continue;
                    }
                    if (var390 == 200) {
                        var5 -= 2;
                        int var59 = field686[var5];
                        int var60 = field686[var5 + 1];
                        class152 var61 = class152.method1775(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field686[var5++] = 1;
                            if (var48) {
                                Statics.field597 = var61;
                            } else {
                                Statics.field2917 = var61;
                            }
                            continue;
                        }
                        field686[var5++] = 0;
                        continue;
                    }
                } else if (!(var390 < 1000 || var390 >= 1100) || !(var390 < 2000 || var390 >= 2100)) {
                    class152 var62;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var62 = class152.method124(field686[var5]);
                    } else {
                        var62 = var48 ? Statics.field597 : Statics.field2917;
                    }
                    if (var390 == 1000) {
                        var5 -= 2;
                        var62.field2527 = field686[var5];
                        var62.field2528 = field686[var5 + 1];
                        client.method151(var62);
                        continue;
                    }
                    if (var390 == 1001) {
                        var5 -= 2;
                        var62.field2531 = field686[var5];
                        var62.field2584 = field686[var5 + 1];
                        client.method151(var62);
                        continue;
                    }
                    if (var390 == 1003) {
                        var5--;
                        boolean var63 = field686[var5] == 1;
                        if (var62.field2534 != var63) {
                            var62.field2534 = var63;
                            client.method151(var62);
                        }
                        continue;
                    }
                } else if (var390 >= 1100 && var390 < 1200 || var390 >= 2100 && var390 < 2200) {
                    class152 var64;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var64 = class152.method124(field686[var5]);
                    } else {
                        var64 = var48 ? Statics.field597 : Statics.field2917;
                    }
                    if (var390 == 1100) {
                        var5 -= 2;
                        var64.field2535 = field686[var5];
                        if (var64.field2535 > var64.field2537 - var64.field2531) {
                            var64.field2535 = var64.field2537 - var64.field2531;
                        }
                        if (var64.field2535 < 0) {
                            var64.field2535 = 0;
                        }
                        var64.field2536 = field686[var5 + 1];
                        if (var64.field2536 > var64.field2538 - var64.field2584) {
                            var64.field2536 = var64.field2538 - var64.field2584;
                        }
                        if (var64.field2536 < 0) {
                            var64.field2536 = 0;
                        }
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1101) {
                        var5--;
                        var64.field2625 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1102) {
                        var5--;
                        var64.field2540 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1103) {
                        var5--;
                        var64.field2626 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1104) {
                        var5--;
                        var64.field2545 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1105) {
                        var5--;
                        var64.field2613 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1106) {
                        var5--;
                        var64.field2548 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1107) {
                        var5--;
                        var64.field2604 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1108) {
                        var64.field2617 = 1;
                        var5--;
                        var64.field2543 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1109) {
                        var5 -= 6;
                        var64.field2546 = field686[var5];
                        var64.field2544 = field686[var5 + 1];
                        var64.field2590 = field686[var5 + 2];
                        var64.field2563 = field686[var5 + 3];
                        var64.field2549 = field686[var5 + 4];
                        var64.field2565 = field686[var5 + 5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1110) {
                        var5--;
                        int var65 = field686[var5];
                        if (var64.field2591 != var65) {
                            var64.field2591 = var65;
                            var64.field2525 = 0;
                            var64.field2629 = 0;
                            client.method151(var64);
                        }
                        continue;
                    }
                    if (var390 == 1111) {
                        var5--;
                        var64.field2567 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1112) {
                        var6--;
                        String var66 = field695[var6];
                        if (!var66.equals(var64.field2603)) {
                            var64.field2603 = var66;
                            client.method151(var64);
                        }
                        continue;
                    }
                    if (var390 == 1113) {
                        var5--;
                        var64.field2562 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1114) {
                        var5 -= 3;
                        var64.field2572 = field686[var5];
                        var64.field2554 = field686[var5 + 1];
                        var64.field2571 = field686[var5 + 2];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1115) {
                        var5--;
                        var64.field2569 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1116) {
                        var5--;
                        var64.field2550 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1117) {
                        var5--;
                        var64.field2551 = field686[var5];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1118) {
                        var5--;
                        var64.field2602 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1119) {
                        var5--;
                        var64.field2553 = field686[var5] == 1;
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1120) {
                        var5 -= 2;
                        var64.field2537 = field686[var5];
                        var64.field2538 = field686[var5 + 1];
                        client.method151(var64);
                        continue;
                    }
                    if (var390 == 1121) {
                        client.method69(var64.field2559, var64.field2568);
                        client.field323 = var64;
                        client.method151(var64);
                        continue;
                    }
                } else if (var390 >= 1200 && var390 < 1300 || var390 >= 2200 && var390 < 2300) {
                    class152 var67;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var67 = class152.method124(field686[var5]);
                    } else {
                        var67 = var48 ? Statics.field597 : Statics.field2917;
                    }
                    client.method151(var67);
                    if (var390 == 1200) {
                        var5 -= 2;
                        int var68 = field686[var5];
                        int var69 = field686[var5 + 1];
                        var67.field2606 = var68;
                        var67.field2627 = var69;
                        class45 var70 = class45.method158(var68);
                        var67.field2590 = var70.field987;
                        var67.field2563 = var70.field993;
                        var67.field2549 = var70.field994;
                        var67.field2546 = var70.field995;
                        var67.field2544 = var70.field996;
                        var67.field2565 = var70.field979;
                        if (var67.field2531 > 0) {
                            var67.field2565 = var67.field2565 * 32 / var67.field2531;
                        }
                        continue;
                    }
                    if (var390 == 1201) {
                        var67.field2617 = 2;
                        var5--;
                        var67.field2543 = field686[var5];
                        continue;
                    }
                    if (var390 == 1202) {
                        var67.field2617 = 3;
                        var67.field2543 = Statics.field1669.field33.method2936();
                        continue;
                    }
                } else if (var390 >= 1300 && var390 < 1400 || var390 >= 2300 && var390 < 2400) {
                    class152 var71;
                    if (var390 >= 2000) {
                        var390 -= 1000;
                        var5--;
                        var71 = class152.method124(field686[var5]);
                    } else {
                        var71 = var48 ? Statics.field597 : Statics.field2917;
                    }
                    if (var390 == 1300) {
                        var5--;
                        int var72 = field686[var5] - 1;
                        if (var72 >= 0 && var72 <= 9) {
                            var6--;
                            var71.method2844(var72, field695[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var390 == 1301) {
                        var5 -= 2;
                        int var73 = field686[var5];
                        int var74 = field686[var5 + 1];
                        var71.field2560 = class152.method1775(var73, var74);
                        continue;
                    }
                    if (var390 == 1302) {
                        var5--;
                        var71.field2587 = field686[var5] == 1;
                        continue;
                    }
                    if (var390 == 1303) {
                        var5--;
                        var71.field2585 = field686[var5];
                        continue;
                    }
                    if (var390 == 1304) {
                        var5--;
                        var71.field2586 = field686[var5];
                        continue;
                    }
                    if (var390 == 1305) {
                        var6--;
                        var71.field2582 = field695[var6];
                        continue;
                    }
                    if (var390 == 1306) {
                        var6--;
                        var71.field2588 = field695[var6];
                        continue;
                    }
                    if (var390 == 1307) {
                        var71.field2583 = null;
                        continue;
                    }
                } else {
                    if (var390 >= 1400 && var390 < 1500 || var390 >= 2400 && var390 < 2500) {
                        class152 var75;
                        if (var390 >= 2000) {
                            var390 -= 1000;
                            var5--;
                            var75 = class152.method124(field686[var5]);
                        } else {
                            var75 = var48 ? Statics.field597 : Statics.field2917;
                        }
                        var6--;
                        String var76 = field695[var6];
                        int[] var77 = null;
                        if (var76.length() > 0 && var76.charAt(var76.length() - 1) == 'Y') {
                            var5--;
                            int var78 = field686[var5];
                            if (var78 > 0) {
                                var77 = new int[var78];
                                while (var78-- > 0) {
                                    var5--;
                                    var77[var78] = field686[var5];
                                }
                            }
                            var76 = var76.substring(0, var76.length() - 1);
                        }
                        Object[] var79 = new Object[var76.length() + 1];
                        for (int var80 = var79.length - 1; var80 >= 1; var80--) {
                            if (var76.charAt(var80 - 1) == 's') {
                                var6--;
                                var79[var80] = field695[var6];
                            } else {
                                var5--;
                                var79[var80] = Integer.valueOf(field686[var5]);
                            }
                        }
                        var5--;
                        int var81 = field686[var5];
                        if (var81 == -1) {
                            var79 = null;
                        } else {
                            var79[0] = Integer.valueOf(var81);
                        }
                        if (var390 == 1400) {
                            var75.field2631 = var79;
                        }
                        if (var390 == 1401) {
                            var75.field2594 = var79;
                        }
                        if (var390 == 1402) {
                            var75.field2593 = var79;
                        }
                        if (var390 == 1403) {
                            var75.field2595 = var79;
                        }
                        if (var390 == 1404) {
                            var75.field2597 = var79;
                        }
                        if (var390 == 1405) {
                            var75.field2598 = var79;
                        }
                        if (var390 == 1406) {
                            var75.field2601 = var79;
                        }
                        if (var390 == 1407) {
                            var75.field2539 = var79;
                            var75.field2532 = var77;
                        }
                        if (var390 == 1408) {
                            var75.field2608 = var79;
                        }
                        if (var390 == 1409) {
                            var75.field2609 = var79;
                        }
                        if (var390 == 1410) {
                            var75.field2599 = var79;
                        }
                        if (var390 == 1411) {
                            var75.field2592 = var79;
                        }
                        if (var390 == 1412) {
                            var75.field2596 = var79;
                        }
                        if (var390 == 1414) {
                            var75.field2635 = var79;
                            var75.field2605 = var77;
                        }
                        if (var390 == 1415) {
                            var75.field2561 = var79;
                            var75.field2607 = var77;
                        }
                        if (var390 == 1416) {
                            var75.field2612 = var79;
                        }
                        if (var390 == 1417) {
                            var75.field2610 = var79;
                        }
                        if (var390 == 1418) {
                            var75.field2611 = var79;
                        }
                        if (var390 == 1419) {
                            var75.field2552 = var79;
                        }
                        if (var390 == 1420) {
                            var75.field2558 = var79;
                        }
                        if (var390 == 1421) {
                            var75.field2614 = var79;
                        }
                        if (var390 == 1422) {
                            var75.field2618 = var79;
                        }
                        if (var390 == 1423) {
                            var75.field2616 = var79;
                        }
                        if (var390 == 1424) {
                            var75.field2638 = var79;
                        }
                        var75.field2589 = true;
                        continue;
                    }
                    if (var390 < 1600) {
                        class152 var82 = var48 ? Statics.field597 : Statics.field2917;
                        if (var390 == 1500) {
                            field686[var5++] = var82.field2527;
                            continue;
                        }
                        if (var390 == 1501) {
                            field686[var5++] = var82.field2528;
                            continue;
                        }
                        if (var390 == 1502) {
                            field686[var5++] = var82.field2531;
                            continue;
                        }
                        if (var390 == 1503) {
                            field686[var5++] = var82.field2584;
                            continue;
                        }
                        if (var390 == 1504) {
                            field686[var5++] = var82.field2534 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 1505) {
                            field686[var5++] = var82.field2533;
                            continue;
                        }
                    } else if (var390 < 1700) {
                        class152 var83 = var48 ? Statics.field597 : Statics.field2917;
                        if (var390 == 1600) {
                            field686[var5++] = var83.field2535;
                            continue;
                        }
                        if (var390 == 1601) {
                            field686[var5++] = var83.field2536;
                            continue;
                        }
                        if (var390 == 1602) {
                            field695[var6++] = var83.field2603;
                            continue;
                        }
                        if (var390 == 1603) {
                            field686[var5++] = var83.field2537;
                            continue;
                        }
                        if (var390 == 1604) {
                            field686[var5++] = var83.field2538;
                            continue;
                        }
                        if (var390 == 1605) {
                            field686[var5++] = var83.field2565;
                            continue;
                        }
                        if (var390 == 1606) {
                            field686[var5++] = var83.field2590;
                            continue;
                        }
                        if (var390 == 1607) {
                            field686[var5++] = var83.field2549;
                            continue;
                        }
                        if (var390 == 1608) {
                            field686[var5++] = var83.field2563;
                            continue;
                        }
                    } else if (var390 < 1800) {
                        class152 var84 = var48 ? Statics.field597 : Statics.field2917;
                        if (var390 == 1700) {
                            field686[var5++] = var84.field2606;
                            continue;
                        }
                        if (var390 == 1701) {
                            if (var84.field2606 == -1) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = var84.field2627;
                            }
                            continue;
                        }
                        if (var390 == 1702) {
                            field686[var5++] = var84.field2568;
                            continue;
                        }
                    } else if (var390 < 1900) {
                        class152 var85 = var48 ? Statics.field597 : Statics.field2917;
                        if (var390 == 1800) {
                            field686[var5++] = class156.method2812(client.method474(var85));
                            continue;
                        }
                        if (var390 == 1801) {
                            var5--;
                            int var86 = field686[var5];
                            int var391 = var86 - 1;
                            if (var85.field2583 != null && var391 < var85.field2583.length && var85.field2583[var391] != null) {
                                field695[var6++] = var85.field2583[var391];
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 1802) {
                            if (var85.field2582 == null) {
                                field695[var6++] = "";
                            } else {
                                field695[var6++] = var85.field2582;
                            }
                            continue;
                        }
                    } else if (var390 < 2600) {
                        var5--;
                        class152 var87 = class152.method124(field686[var5]);
                        if (var390 == 2500) {
                            field686[var5++] = var87.field2527;
                            continue;
                        }
                        if (var390 == 2501) {
                            field686[var5++] = var87.field2528;
                            continue;
                        }
                        if (var390 == 2502) {
                            field686[var5++] = var87.field2531;
                            continue;
                        }
                        if (var390 == 2503) {
                            field686[var5++] = var87.field2584;
                            continue;
                        }
                        if (var390 == 2504) {
                            field686[var5++] = var87.field2534 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 2505) {
                            field686[var5++] = var87.field2533;
                            continue;
                        }
                    } else if (var390 < 2700) {
                        var5--;
                        class152 var88 = class152.method124(field686[var5]);
                        if (var390 == 2600) {
                            field686[var5++] = var88.field2535;
                            continue;
                        }
                        if (var390 == 2601) {
                            field686[var5++] = var88.field2536;
                            continue;
                        }
                        if (var390 == 2602) {
                            field695[var6++] = var88.field2603;
                            continue;
                        }
                        if (var390 == 2603) {
                            field686[var5++] = var88.field2537;
                            continue;
                        }
                        if (var390 == 2604) {
                            field686[var5++] = var88.field2538;
                            continue;
                        }
                        if (var390 == 2605) {
                            field686[var5++] = var88.field2565;
                            continue;
                        }
                        if (var390 == 2606) {
                            field686[var5++] = var88.field2590;
                            continue;
                        }
                        if (var390 == 2607) {
                            field686[var5++] = var88.field2549;
                            continue;
                        }
                        if (var390 == 2608) {
                            field686[var5++] = var88.field2563;
                            continue;
                        }
                    } else if (var390 < 2800) {
                        if (var390 == 2700) {
                            var5--;
                            class152 var89 = class152.method124(field686[var5]);
                            field686[var5++] = var89.field2606;
                            continue;
                        }
                        if (var390 == 2701) {
                            var5--;
                            class152 var90 = class152.method124(field686[var5]);
                            if (var90.field2606 == -1) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = var90.field2627;
                            }
                            continue;
                        }
                        if (var390 == 2702) {
                            var5--;
                            int var91 = field686[var5];
                            class4 var92 = (class4) client.field362.method3204((long) var91);
                            if (var92 == null) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var390 < 2900) {
                        var5--;
                        class152 var93 = class152.method124(field686[var5]);
                        if (var390 == 2800) {
                            field686[var5++] = class156.method2812(client.method474(var93));
                            continue;
                        }
                        if (var390 == 2801) {
                            var5--;
                            int var94 = field686[var5];
                            int var392 = var94 - 1;
                            if (var93.field2583 != null && var392 < var93.field2583.length && var93.field2583[var392] != null) {
                                field695[var6++] = var93.field2583[var392];
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 2802) {
                            if (var93.field2582 == null) {
                                field695[var6++] = "";
                            } else {
                                field695[var6++] = var93.field2582;
                            }
                            continue;
                        }
                    } else if (var390 < 3200) {
                        if (var390 == 3100) {
                            var6--;
                            String var95 = field695[var6];
                            class10.method2425(0, "", var95);
                            continue;
                        }
                        if (var390 == 3101) {
                            var5 -= 2;
                            client.method128(Statics.field1669, field686[var5], field686[var5 + 1]);
                            continue;
                        }
                        if (var390 == 3103) {
                            client.field285.method2364(94);
                            for (class4 var96 = (class4) client.field362.method3197(); var96 != null; var96 = (class4) client.field362.method3200()) {
                                if (var96.field60 == 0 || var96.field60 == 3) {
                                    client.method2691(var96, true);
                                }
                            }
                            if (client.field323 != null) {
                                client.method151(client.field323);
                                client.field323 = null;
                            }
                            continue;
                        }
                        if (var390 == 3104) {
                            var6--;
                            String var97 = field695[var6];
                            int var98 = 0;
                            if (class197.method175(var97)) {
                                int var99 = class197.method2389(var97, 10, true);
                                var98 = var99;
                            }
                            client.field285.method2364(159);
                            client.field285.method2111(var98);
                            continue;
                        }
                        if (var390 == 3105) {
                            var6--;
                            String var100 = field695[var6];
                            client.field285.method2364(109);
                            client.field285.method2108(var100.length() + 1);
                            client.field285.method2113(var100);
                            continue;
                        }
                        if (var390 == 3106) {
                            var6--;
                            String var101 = field695[var6];
                            client.field285.method2364(43);
                            client.field285.method2108(var101.length() + 1);
                            client.field285.method2113(var101);
                            continue;
                        }
                        if (var390 == 3107) {
                            var5--;
                            int var102 = field686[var5];
                            var6--;
                            String var103 = field695[var6];
                            client.method460(var102, var103);
                            continue;
                        }
                        if (var390 == 3108) {
                            var5 -= 3;
                            int var104 = field686[var5];
                            int var105 = field686[var5 + 1];
                            int var106 = field686[var5 + 2];
                            class152 var107 = class152.method124(var106);
                            client.method1778(var107, var104, var105);
                            continue;
                        }
                        if (var390 == 3109) {
                            var5 -= 2;
                            int var108 = field686[var5];
                            int var109 = field686[var5 + 1];
                            class152 var110 = var48 ? Statics.field597 : Statics.field2917;
                            client.method1778(var110, var108, var109);
                            continue;
                        }
                        if (var390 == 3110) {
                            var5--;
                            Statics.field2015 = field686[var5] == 1;
                            continue;
                        }
                        if (var390 == 3111) {
                            field686[var5++] = Statics.field57.field138 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3112) {
                            var5--;
                            Statics.field57.field138 = field686[var5] == 1;
                            class9.method1408();
                            continue;
                        }
                        if (var390 == 3113) {
                            var6--;
                            String var111 = field695[var6];
                            var5--;
                            boolean var112 = field686[var5] == 1;
                            class125.method29(var111, var112, false);
                            continue;
                        }
                    } else if (var390 < 3300) {
                        if (var390 == 3200) {
                            var5 -= 3;
                            int var113 = field686[var5];
                            int var114 = field686[var5 + 1];
                            int var115 = field686[var5 + 2];
                            if (client.field454 != 0 && var114 != 0 && client.field482 < 50) {
                                client.field483[client.field482] = var113;
                                client.field484[client.field482] = var114;
                                client.field485[client.field482] = var115;
                                client.field487[client.field482] = null;
                                client.field486[client.field482] = 0;
                                client.field482++;
                            }
                            continue;
                        }
                        if (var390 == 3201) {
                            var5--;
                            client.method1402(field686[var5]);
                            continue;
                        }
                        if (var390 == 3202) {
                            var5 -= 2;
                            client.method2068(field686[var5], field686[var5 + 1]);
                            continue;
                        }
                    } else if (var390 < 3400) {
                        if (var390 == 3300) {
                            field686[var5++] = client.field386;
                            continue;
                        }
                        if (var390 == 3301) {
                            var5 -= 2;
                            int var116 = field686[var5];
                            int var117 = field686[var5 + 1];
                            int[] var118 = field686;
                            int var119 = var5++;
                            class14 var120 = (class14) class14.field191.method3204((long) var116);
                            int var121;
                            if (var120 == null) {
                                var121 = -1;
                            } else if (var117 >= 0 && var117 < var120.field192.length) {
                                var121 = var120.field192[var117];
                            } else {
                                var121 = -1;
                            }
                            var118[var119] = var121;
                            continue;
                        }
                        if (var390 == 3302) {
                            var5 -= 2;
                            int var122 = field686[var5];
                            int var123 = field686[var5 + 1];
                            int[] var124 = field686;
                            int var125 = var5++;
                            class14 var126 = (class14) class14.field191.method3204((long) var122);
                            int var127;
                            if (var126 == null) {
                                var127 = 0;
                            } else if (var123 >= 0 && var123 < var126.field193.length) {
                                var127 = var126.field193[var123];
                            } else {
                                var127 = 0;
                            }
                            var124[var125] = var127;
                            continue;
                        }
                        if (var390 == 3303) {
                            var5 -= 2;
                            int var128 = field686[var5];
                            int var129 = field686[var5 + 1];
                            field686[var5++] = class14.method3324(var128, var129);
                            continue;
                        }
                        if (var390 == 3304) {
                            var5--;
                            int var130 = field686[var5];
                            field686[var5++] = class44.method169(var130).field976;
                            continue;
                        }
                        if (var390 == 3305) {
                            var5--;
                            int var131 = field686[var5];
                            field686[var5++] = client.field383[var131];
                            continue;
                        }
                        if (var390 == 3306) {
                            var5--;
                            int var132 = field686[var5];
                            field686[var5++] = client.field384[var132];
                            continue;
                        }
                        if (var390 == 3307) {
                            var5--;
                            int var133 = field686[var5];
                            field686[var5++] = client.field385[var133];
                            continue;
                        }
                        if (var390 == 3308) {
                            int var134 = Statics.field1999;
                            int var135 = (Statics.field1669.field700 >> 7) + Statics.field928;
                            int var136 = (Statics.field1669.field726 >> 7) + Statics.field919;
                            field686[var5++] = (var134 << 28) + (var135 << 14) + var136;
                            continue;
                        }
                        if (var390 == 3309) {
                            var5--;
                            int var137 = field686[var5];
                            field686[var5++] = var137 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var390 == 3310) {
                            var5--;
                            int var138 = field686[var5];
                            field686[var5++] = var138 >> 28;
                            continue;
                        }
                        if (var390 == 3311) {
                            var5--;
                            int var139 = field686[var5];
                            field686[var5++] = var139 & 0x3FFF;
                            continue;
                        }
                        if (var390 == 3312) {
                            field686[var5++] = client.field249 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3313) {
                            var5 -= 2;
                            int var140 = field686[var5] + 32768;
                            int var141 = field686[var5 + 1];
                            field686[var5++] = class14.method881(var140, var141);
                            continue;
                        }
                        if (var390 == 3314) {
                            var5 -= 2;
                            int var142 = field686[var5] + 32768;
                            int var143 = field686[var5 + 1];
                            int[] var144 = field686;
                            int var145 = var5++;
                            class14 var146 = (class14) class14.field191.method3204((long) var142);
                            int var147;
                            if (var146 == null) {
                                var147 = 0;
                            } else if (var143 >= 0 && var143 < var146.field193.length) {
                                var147 = var146.field193[var143];
                            } else {
                                var147 = 0;
                            }
                            var144[var145] = var147;
                            continue;
                        }
                        if (var390 == 3315) {
                            var5 -= 2;
                            int var148 = field686[var5] + 32768;
                            int var149 = field686[var5 + 1];
                            field686[var5++] = class14.method3324(var148, var149);
                            continue;
                        }
                        if (var390 == 3316) {
                            if (client.field476 >= 2) {
                                field686[var5++] = client.field476;
                            } else {
                                field686[var5++] = 0;
                            }
                            continue;
                        }
                        if (var390 == 3317) {
                            field686[var5++] = client.field471;
                            continue;
                        }
                        if (var390 == 3318) {
                            field686[var5++] = client.field245;
                            continue;
                        }
                        if (var390 == 3321) {
                            field686[var5++] = client.field410;
                            continue;
                        }
                        if (var390 == 3322) {
                            field686[var5++] = client.field411;
                            continue;
                        }
                        if (var390 == 3323) {
                            if (client.field470) {
                                field686[var5++] = 1;
                            } else {
                                field686[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var390 < 3500) {
                        if (var390 == 3400) {
                            var5 -= 2;
                            int var150 = field686[var5];
                            int var151 = field686[var5 + 1];
                            class43 var152 = class43.method2687(var150);
                            if (var152.field961 != 's') {
                            }
                            for (int var153 = 0; var153 < var152.field966; var153++) {
                                if (var152.field970[var153] == var151) {
                                    field695[var6++] = var152.field969[var153];
                                    var152 = null;
                                    break;
                                }
                            }
                            if (var152 != null) {
                                field695[var6++] = var152.field960;
                            }
                            continue;
                        }
                        if (var390 == 3408) {
                            var5 -= 4;
                            int var154 = field686[var5];
                            int var155 = field686[var5 + 1];
                            int var156 = field686[var5 + 2];
                            int var157 = field686[var5 + 3];
                            class43 var158 = class43.method2687(var156);
                            if (var158.field964 == var154 && var158.field961 == var155) {
                                for (int var159 = 0; var159 < var158.field966; var159++) {
                                    if (var158.field970[var159] == var157) {
                                        if (var155 == 115) {
                                            field695[var6++] = var158.field969[var159];
                                        } else {
                                            field686[var5++] = var158.field968[var159];
                                        }
                                        var158 = null;
                                        break;
                                    }
                                }
                                if (var158 != null) {
                                    if (var155 == 115) {
                                        field695[var6++] = var158.field960;
                                    } else {
                                        field686[var5++] = var158.field965;
                                    }
                                }
                                continue;
                            }
                            if (var155 == 115) {
                                field695[var6++] = "null";
                            } else {
                                field686[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var390 < 3700) {
                        if (var390 == 3600) {
                            if (client.field495 == 0) {
                                field686[var5++] = -2;
                            } else if (client.field495 == 1) {
                                field686[var5++] = -1;
                            } else {
                                field686[var5++] = client.field361;
                            }
                            continue;
                        }
                        if (var390 == 3601) {
                            var5--;
                            int var160 = field686[var5];
                            if (client.field495 == 2 && var160 < client.field361) {
                                field695[var6++] = client.field315[var160].field221;
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 3602) {
                            var5--;
                            int var161 = field686[var5];
                            if (client.field495 == 2 && var161 < client.field361) {
                                field686[var5++] = client.field315[var161].field216;
                                continue;
                            }
                            field686[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3603) {
                            var5--;
                            int var162 = field686[var5];
                            if (client.field495 == 2 && var162 < client.field361) {
                                field686[var5++] = client.field315[var162].field217;
                                continue;
                            }
                            field686[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3604) {
                            var6--;
                            String var163 = field695[var6];
                            var5--;
                            int var164 = field686[var5];
                            client.field285.method2364(72);
                            client.field285.method2108(class107.method722(var163) + 1);
                            client.field285.method2108(var164);
                            client.field285.method2113(var163);
                            continue;
                        }
                        if (var390 == 3605) {
                            var6--;
                            String var165 = field695[var6];
                            client.method522(var165);
                            continue;
                        }
                        if (var390 == 3606) {
                            var6--;
                            String var166 = field695[var6];
                            if (var166 == null) {
                                continue;
                            }
                            String var167 = class198.method1858(var166, Statics.field1222);
                            if (var167 == null) {
                                continue;
                            }
                            int var168 = 0;
                            while (true) {
                                if (var168 >= client.field361) {
                                    continue label2455;
                                }
                                class16 var169 = client.field315[var168];
                                String var170 = var169.field221;
                                String var171 = class198.method1858(var170, Statics.field1222);
                                boolean var172;
                                if (var166 == null || var170 == null) {
                                    var172 = false;
                                } else if (var166.startsWith("#") || var170.startsWith("#")) {
                                    var172 = var166.equals(var170);
                                } else {
                                    var172 = var167.equals(var171);
                                }
                                if (var172) {
                                    client.field361--;
                                    for (int var173 = var168; var173 < client.field361; var173++) {
                                        client.field315[var173] = client.field315[var173 + 1];
                                    }
                                    client.field437 = client.field462;
                                    client.field285.method2364(101);
                                    client.field285.method2108(class107.method722(var166));
                                    client.field285.method2113(var166);
                                    continue label2455;
                                }
                                var168++;
                            }
                        }
                        if (var390 == 3607) {
                            var6--;
                            String var174 = field695[var6];
                            if (var174 == null) {
                                continue;
                            }
                            if ((client.field498 < 100 || client.field371 == 1) && client.field498 < 400) {
                                String var175 = class198.method1858(var174, Statics.field1222);
                                if (var175 == null) {
                                    continue;
                                }
                                for (int var176 = 0; var176 < client.field498; var176++) {
                                    class8 var177 = client.field464[var176];
                                    String var178 = class198.method1858(var177.field127, Statics.field1222);
                                    if (var178 != null && var178.equals(var175)) {
                                        class10.method2425(31, "", var174 + class142.field2300);
                                        continue label2455;
                                    }
                                    if (var177.field126 != null) {
                                        String var179 = class198.method1858(var177.field126, Statics.field1222);
                                        if (var179 != null && var179.equals(var175)) {
                                            class10.method2425(31, "", var174 + class142.field2300);
                                            continue label2455;
                                        }
                                    }
                                }
                                for (int var180 = 0; var180 < client.field361; var180++) {
                                    class16 var181 = client.field315[var180];
                                    String var182 = class198.method1858(var181.field221, Statics.field1222);
                                    if (var182 != null && var182.equals(var175)) {
                                        class10.method2425(31, "", class142.field2305 + var174 + class142.field2306);
                                        continue label2455;
                                    }
                                    if (var181.field219 != null) {
                                        String var183 = class198.method1858(var181.field219, Statics.field1222);
                                        if (var183 != null && var183.equals(var175)) {
                                            class10.method2425(31, "", class142.field2305 + var174 + class142.field2306);
                                            continue label2455;
                                        }
                                    }
                                }
                                if (class198.method1858(Statics.field1669.field42, Statics.field1222).equals(var175)) {
                                    class10.method2425(31, "", class142.field2302);
                                } else {
                                    client.field285.method2364(96);
                                    client.field285.method2108(class107.method722(var174));
                                    client.field285.method2113(var174);
                                }
                                continue;
                            }
                            class10.method2425(31, "", class142.field2299);
                            continue;
                        }
                        if (var390 == 3608) {
                            var6--;
                            String var184 = field695[var6];
                            client.method1597(var184);
                            continue;
                        }
                        if (var390 == 3609) {
                            var6--;
                            String var185 = field695[var6];
                            if (var185.startsWith(class2.method817(0)) || var185.startsWith(class2.method817(1))) {
                                var185 = var185.substring(7);
                            }
                            field686[var5++] = client.method883(var185, false) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3611) {
                            if (client.field466 == null) {
                                field695[var6++] = "";
                                continue;
                            }
                            String[] var186 = field695;
                            int var187 = var6++;
                            String var188 = client.field466;
                            long var189 = 0L;
                            int var191 = var188.length();
                            for (int var192 = 0; var192 < var191; var192++) {
                                var189 *= 37L;
                                char var193 = var188.charAt(var192);
                                if (var193 >= 'A' && var193 <= 'Z') {
                                    var189 += (long) (var193 + 1 - 65);
                                } else if (var193 >= 'a' && var193 <= 'z') {
                                    var189 += (long) (var193 + 1 - 97);
                                } else if (var193 >= '0' && var193 <= '9') {
                                    var189 += (long) (var193 + 27 - 48);
                                }
                                if (var189 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var189 % 37L == 0L && var189 != 0L) {
                                var189 /= 37L;
                            }
                            String var196 = class196.method168(var189);
                            if (var196 == null) {
                                var196 = "";
                            }
                            var186[var187] = var196;
                            continue;
                        }
                        if (var390 == 3612) {
                            if (client.field466 == null) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = Statics.field861;
                            }
                            continue;
                        }
                        if (var390 == 3613) {
                            var5--;
                            int var198 = field686[var5];
                            if (client.field466 != null && var198 < Statics.field861) {
                                field695[var6++] = Statics.field2474[var198].field548;
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 3614) {
                            var5--;
                            int var199 = field686[var5];
                            if (client.field466 != null && var199 < Statics.field861) {
                                field686[var5++] = Statics.field2474[var199].field545;
                                continue;
                            }
                            field686[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3615) {
                            var5--;
                            int var200 = field686[var5];
                            if (client.field466 != null && var200 < Statics.field861) {
                                field686[var5++] = Statics.field2474[var200].field544;
                                continue;
                            }
                            field686[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3616) {
                            field686[var5++] = Statics.field1802;
                            continue;
                        }
                        if (var390 == 3617) {
                            var6--;
                            String var201 = field695[var6];
                            if (Statics.field2474 != null) {
                                client.field285.method2364(155);
                                client.field285.method2108(class107.method722(var201));
                                client.field285.method2113(var201);
                            }
                            continue;
                        }
                        if (var390 == 3618) {
                            field686[var5++] = Statics.field1872;
                            continue;
                        }
                        if (var390 == 3619) {
                            var6--;
                            String var202 = field695[var6];
                            client.method463(var202);
                            continue;
                        }
                        if (var390 == 3620) {
                            client.method173();
                            continue;
                        }
                        if (var390 == 3621) {
                            if (client.field495 == 0) {
                                field686[var5++] = -1;
                            } else {
                                field686[var5++] = client.field498;
                            }
                            continue;
                        }
                        if (var390 == 3622) {
                            var5--;
                            int var203 = field686[var5];
                            if (client.field495 != 0 && var203 < client.field498) {
                                field695[var6++] = client.field464[var203].field127;
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 3623) {
                            var6--;
                            String var204 = field695[var6];
                            if (var204.startsWith(class2.method817(0)) || var204.startsWith(class2.method817(1))) {
                                var204 = var204.substring(7);
                            }
                            field686[var5++] = client.method2535(var204) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 3624) {
                            var5--;
                            int var205 = field686[var5];
                            if (Statics.field2474 != null && var205 < Statics.field861 && Statics.field2474[var205].field548.equalsIgnoreCase(Statics.field1669.field42)) {
                                field686[var5++] = 1;
                                continue;
                            }
                            field686[var5++] = 0;
                            continue;
                        }
                        if (var390 == 3625) {
                            if (client.field467 == null) {
                                field695[var6++] = "";
                                continue;
                            }
                            String[] var206 = field695;
                            int var207 = var6++;
                            String var208 = client.field467;
                            long var209 = 0L;
                            int var211 = var208.length();
                            for (int var212 = 0; var212 < var211; var212++) {
                                var209 *= 37L;
                                char var213 = var208.charAt(var212);
                                if (var213 >= 'A' && var213 <= 'Z') {
                                    var209 += (long) (var213 + 1 - 65);
                                } else if (var213 >= 'a' && var213 <= 'z') {
                                    var209 += (long) (var213 + 1 - 97);
                                } else if (var213 >= '0' && var213 <= '9') {
                                    var209 += (long) (var213 + 27 - 48);
                                }
                                if (var209 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var209 % 37L == 0L && var209 != 0L) {
                                var209 /= 37L;
                            }
                            String var216 = class196.method168(var209);
                            if (var216 == null) {
                                var216 = "";
                            }
                            var206[var207] = var216;
                            continue;
                        }
                    } else if (var390 < 4100) {
                        if (var390 == 4000) {
                            var5 -= 2;
                            int var218 = field686[var5];
                            int var219 = field686[var5 + 1];
                            field686[var5++] = var218 + var219;
                            continue;
                        }
                        if (var390 == 4001) {
                            var5 -= 2;
                            int var220 = field686[var5];
                            int var221 = field686[var5 + 1];
                            field686[var5++] = var220 - var221;
                            continue;
                        }
                        if (var390 == 4002) {
                            var5 -= 2;
                            int var222 = field686[var5];
                            int var223 = field686[var5 + 1];
                            field686[var5++] = var222 * var223;
                            continue;
                        }
                        if (var390 == 4003) {
                            var5 -= 2;
                            int var224 = field686[var5];
                            int var225 = field686[var5 + 1];
                            field686[var5++] = var224 / var225;
                            continue;
                        }
                        if (var390 == 4004) {
                            var5--;
                            int var226 = field686[var5];
                            field686[var5++] = (int) (Math.random() * (double) var226);
                            continue;
                        }
                        if (var390 == 4005) {
                            var5--;
                            int var227 = field686[var5];
                            field686[var5++] = (int) (Math.random() * (double) (var227 + 1));
                            continue;
                        }
                        if (var390 == 4006) {
                            var5 -= 5;
                            int var228 = field686[var5];
                            int var229 = field686[var5 + 1];
                            int var230 = field686[var5 + 2];
                            int var231 = field686[var5 + 3];
                            int var232 = field686[var5 + 4];
                            field686[var5++] = (var229 - var228) * (var232 - var230) / (var231 - var230) + var228;
                            continue;
                        }
                        if (var390 == 4007) {
                            var5 -= 2;
                            int var233 = field686[var5];
                            int var234 = field686[var5 + 1];
                            field686[var5++] = var233 * var234 / 100 + var233;
                            continue;
                        }
                        if (var390 == 4008) {
                            var5 -= 2;
                            int var235 = field686[var5];
                            int var236 = field686[var5 + 1];
                            field686[var5++] = var235 | 0x1 << var236;
                            continue;
                        }
                        if (var390 == 4009) {
                            var5 -= 2;
                            int var237 = field686[var5];
                            int var238 = field686[var5 + 1];
                            field686[var5++] = var237 & -1 - (0x1 << var238);
                            continue;
                        }
                        if (var390 == 4010) {
                            var5 -= 2;
                            int var239 = field686[var5];
                            int var240 = field686[var5 + 1];
                            field686[var5++] = (var239 & 0x1 << var240) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var390 == 4011) {
                            var5 -= 2;
                            int var241 = field686[var5];
                            int var242 = field686[var5 + 1];
                            field686[var5++] = var241 % var242;
                            continue;
                        }
                        if (var390 == 4012) {
                            var5 -= 2;
                            int var243 = field686[var5];
                            int var244 = field686[var5 + 1];
                            if (var243 == 0) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = (int) Math.pow((double) var243, (double) var244);
                            }
                            continue;
                        }
                        if (var390 == 4013) {
                            var5 -= 2;
                            int var245 = field686[var5];
                            int var246 = field686[var5 + 1];
                            if (var245 == 0) {
                                field686[var5++] = 0;
                            } else if (var246 == 0) {
                                field686[var5++] = Integer.MAX_VALUE;
                            } else {
                                field686[var5++] = (int) Math.pow((double) var245, 1.0D / (double) var246);
                            }
                            continue;
                        }
                        if (var390 == 4014) {
                            var5 -= 2;
                            int var247 = field686[var5];
                            int var248 = field686[var5 + 1];
                            field686[var5++] = var247 & var248;
                            continue;
                        }
                        if (var390 == 4015) {
                            var5 -= 2;
                            int var249 = field686[var5];
                            int var250 = field686[var5 + 1];
                            field686[var5++] = var249 | var250;
                            continue;
                        }
                    } else if (var390 < 4200) {
                        if (var390 == 4100) {
                            var6--;
                            String var251 = field695[var6];
                            var5--;
                            int var252 = field686[var5];
                            field695[var6++] = var251 + var252;
                            continue;
                        }
                        if (var390 == 4101) {
                            var6 -= 2;
                            String var253 = field695[var6];
                            String var254 = field695[var6 + 1];
                            field695[var6++] = var253 + var254;
                            continue;
                        }
                        if (var390 == 4102) {
                            var6--;
                            String var255 = field695[var6];
                            var5--;
                            int var256 = field686[var5];
                            field695[var6++] = var255 + class197.method577(var256, true);
                            continue;
                        }
                        if (var390 == 4103) {
                            var6--;
                            String var257 = field695[var6];
                            field695[var6++] = var257.toLowerCase();
                            continue;
                        }
                        if (var390 == 4104) {
                            var5--;
                            int var258 = field686[var5];
                            long var259 = ((long) var258 + 11745L) * 86400000L;
                            field690.setTime(new Date(var259));
                            int var261 = field690.get(5);
                            int var262 = field690.get(2);
                            int var263 = field690.get(1);
                            field695[var6++] = var261 + "-" + field688[var262] + "-" + var263;
                            continue;
                        }
                        if (var390 == 4105) {
                            var6 -= 2;
                            String var264 = field695[var6];
                            String var265 = field695[var6 + 1];
                            if (Statics.field1669.field33 != null && Statics.field1669.field33.field2659) {
                                field695[var6++] = var265;
                                continue;
                            }
                            field695[var6++] = var264;
                            continue;
                        }
                        if (var390 == 4106) {
                            var5--;
                            int var266 = field686[var5];
                            field695[var6++] = Integer.toString(var266);
                            continue;
                        }
                        if (var390 == 4107) {
                            var6 -= 2;
                            int[] var267 = field686;
                            int var268 = var5++;
                            String var269 = field695[var6];
                            String var270 = field695[var6 + 1];
                            int var271 = client.field283;
                            int var272 = var269.length();
                            int var273 = var270.length();
                            int var274 = 0;
                            int var275 = 0;
                            char var276 = 0;
                            char var277 = 0;
                            int var278;
                            label2297: while (true) {
                                if (var274 - var276 >= var272 && var275 - var277 >= var273) {
                                    int var287 = Math.min(var272, var273);
                                    for (int var288 = 0; var288 < var287; var288++) {
                                        char var291 = var269.charAt(var288);
                                        char var292 = var270.charAt(var288);
                                        if (var291 != var292 && Character.toUpperCase(var291) != Character.toUpperCase(var292)) {
                                            char var293 = Character.toLowerCase(var291);
                                            char var294 = Character.toLowerCase(var292);
                                            if (var293 != var294) {
                                                var278 = class200.method1774(var293, var271) - class200.method1774(var294, var271);
                                                break label2297;
                                            }
                                        }
                                    }
                                    int var295 = var272 - var273;
                                    if (var295 == 0) {
                                        for (int var296 = 0; var296 < var287; var296++) {
                                            char var297 = var269.charAt(var296);
                                            char var298 = var270.charAt(var296);
                                            if (var297 != var298) {
                                                var278 = class200.method1774(var297, var271) - class200.method1774(var298, var271);
                                                break label2297;
                                            }
                                        }
                                        var278 = 0;
                                    } else {
                                        var278 = var295;
                                    }
                                    break;
                                }
                                if (var274 - var276 >= var272) {
                                    var278 = -1;
                                    break;
                                }
                                if (var275 - var277 >= var273) {
                                    var278 = 1;
                                    break;
                                }
                                char var279;
                                if (var276 == 0) {
                                    var279 = var269.charAt(var274++);
                                } else {
                                    var279 = var276;
                                    boolean var280 = false;
                                }
                                char var281;
                                if (var277 == 0) {
                                    var281 = var270.charAt(var275++);
                                } else {
                                    var281 = var277;
                                    boolean var282 = false;
                                }
                                var276 = class200.method516(var279);
                                var277 = class200.method516(var281);
                                char var283 = class200.method134(var279, var271);
                                char var284 = class200.method134(var281, var271);
                                if (var283 != var284 && Character.toUpperCase(var283) != Character.toUpperCase(var284)) {
                                    char var285 = Character.toLowerCase(var283);
                                    char var286 = Character.toLowerCase(var284);
                                    if (var285 != var286) {
                                        var278 = class200.method1774(var285, var271) - class200.method1774(var286, var271);
                                        break;
                                    }
                                }
                            }
                            byte var300;
                            if (var278 > 0) {
                                var300 = 1;
                            } else if (var278 < 0) {
                                var300 = -1;
                            } else {
                                var300 = 0;
                            }
                            var267[var268] = var300;
                            continue;
                        }
                        if (var390 == 4108) {
                            var6--;
                            String var301 = field695[var6];
                            var5 -= 2;
                            int var302 = field686[var5];
                            int var303 = field686[var5 + 1];
                            byte[] var304 = Statics.field2479.method2705(var303, 0);
                            class191 var305 = new class191(var304);
                            field686[var5++] = var305.method3348(var301, var302);
                            continue;
                        }
                        if (var390 == 4109) {
                            var6--;
                            String var306 = field695[var6];
                            var5 -= 2;
                            int var307 = field686[var5];
                            int var308 = field686[var5 + 1];
                            byte[] var309 = Statics.field2479.method2705(var308, 0);
                            class191 var310 = new class191(var309);
                            field686[var5++] = var310.method3347(var306, var307);
                            continue;
                        }
                        if (var390 == 4110) {
                            var6 -= 2;
                            String var311 = field695[var6];
                            String var312 = field695[var6 + 1];
                            var5--;
                            if (field686[var5] == 1) {
                                field695[var6++] = var311;
                            } else {
                                field695[var6++] = var312;
                            }
                            continue;
                        }
                        if (var390 == 4111) {
                            var6--;
                            String var313 = field695[var6];
                            field695[var6++] = class190.method3367(var313);
                            continue;
                        }
                        if (var390 == 4112) {
                            var6--;
                            String var314 = field695[var6];
                            var5--;
                            int var315 = field686[var5];
                            field695[var6++] = var314 + (char) var315;
                            continue;
                        }
                        if (var390 == 4113) {
                            var5--;
                            int var316 = field686[var5];
                            field686[var5++] = class197.method735((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4114) {
                            var5--;
                            int var317 = field686[var5];
                            int[] var318 = field686;
                            int var319 = var5++;
                            char var320 = (char) var317;
                            boolean var321 = var320 >= '0' && var320 <= '9' || var320 >= 'A' && var320 <= 'Z' || var320 >= 'a' && var320 <= 'z';
                            var318[var319] = var321 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4115) {
                            var5--;
                            int var322 = field686[var5];
                            int[] var323 = field686;
                            int var324 = var5++;
                            char var325 = (char) var322;
                            boolean var326 = var325 >= 'A' && var325 <= 'Z' || var325 >= 'a' && var325 <= 'z';
                            var323[var324] = var326 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4116) {
                            var5--;
                            int var327 = field686[var5];
                            field686[var5++] = class197.method2402((char) var327) ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4117) {
                            var6--;
                            String var328 = field695[var6];
                            if (var328 == null) {
                                field686[var5++] = 0;
                            } else {
                                field686[var5++] = var328.length();
                            }
                            continue;
                        }
                        if (var390 == 4118) {
                            var6--;
                            String var329 = field695[var6];
                            var5 -= 2;
                            int var330 = field686[var5];
                            int var331 = field686[var5 + 1];
                            field695[var6++] = var329.substring(var330, var331);
                            continue;
                        }
                        if (var390 == 4119) {
                            var6--;
                            String var332 = field695[var6];
                            StringBuilder var333 = new StringBuilder(var332.length());
                            boolean var334 = false;
                            for (int var335 = 0; var335 < var332.length(); var335++) {
                                char var336 = var332.charAt(var335);
                                if (var336 == '<') {
                                    var334 = true;
                                } else if (var336 == '>') {
                                    var334 = false;
                                } else if (!var334) {
                                    var333.append(var336);
                                }
                            }
                            field695[var6++] = var333.toString();
                            continue;
                        }
                        if (var390 == 4120) {
                            var6--;
                            String var337 = field695[var6];
                            var5--;
                            int var338 = field686[var5];
                            field686[var5++] = var337.indexOf(var338);
                            continue;
                        }
                        if (var390 == 4121) {
                            var6 -= 2;
                            String var339 = field695[var6];
                            String var340 = field695[var6 + 1];
                            var5--;
                            int var341 = field686[var5];
                            field686[var5++] = var339.indexOf(var340, var341);
                            continue;
                        }
                    } else if (var390 < 4300) {
                        if (var390 == 4200) {
                            var5--;
                            int var342 = field686[var5];
                            field695[var6++] = class45.method158(var342).field986;
                            continue;
                        }
                        if (var390 == 4201) {
                            var5 -= 2;
                            int var343 = field686[var5];
                            int var344 = field686[var5 + 1];
                            class45 var345 = class45.method158(var343);
                            if (var344 >= 1 && var344 <= 5 && var345.field1000[var344 - 1] != null) {
                                field695[var6++] = var345.field1000[var344 - 1];
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 4202) {
                            var5 -= 2;
                            int var346 = field686[var5];
                            int var347 = field686[var5 + 1];
                            class45 var348 = class45.method158(var346);
                            if (var347 >= 1 && var347 <= 5 && var348.field1001[var347 - 1] != null) {
                                field695[var6++] = var348.field1001[var347 - 1];
                                continue;
                            }
                            field695[var6++] = "";
                            continue;
                        }
                        if (var390 == 4203) {
                            var5--;
                            int var349 = field686[var5];
                            field686[var5++] = class45.method158(var349).field1027;
                            continue;
                        }
                        if (var390 == 4204) {
                            var5--;
                            int var350 = field686[var5];
                            field686[var5++] = class45.method158(var350).field997 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var390 == 4205) {
                            var5--;
                            int var351 = field686[var5];
                            class45 var352 = class45.method158(var351);
                            if (var352.field1017 == -1 && var352.field1016 >= 0) {
                                field686[var5++] = var352.field1016;
                                continue;
                            }
                            field686[var5++] = var351;
                            continue;
                        }
                        if (var390 == 4206) {
                            var5--;
                            int var353 = field686[var5];
                            class45 var354 = class45.method158(var353);
                            if (var354.field1017 >= 0 && var354.field1016 >= 0) {
                                field686[var5++] = var354.field1016;
                                continue;
                            }
                            field686[var5++] = var353;
                            continue;
                        }
                        if (var390 == 4207) {
                            var5--;
                            int var355 = field686[var5];
                            field686[var5++] = class45.method158(var355).field990 ? 1 : 0;
                            continue;
                        }
                    } else if (var390 < 5100) {
                        if (var390 == 5000) {
                            field686[var5++] = client.field458;
                            continue;
                        }
                        if (var390 == 5001) {
                            var5 -= 3;
                            client.field458 = field686[var5];
                            Statics.field1557 = class117.method1023(field686[var5 + 1]);
                            if (Statics.field1557 == null) {
                                Statics.field1557 = class117.field1886;
                            }
                            client.field330 = field686[var5 + 2];
                            client.field285.method2364(176);
                            client.field285.method2108(client.field458);
                            client.field285.method2108(Statics.field1557.field1885);
                            client.field285.method2108(client.field330);
                            continue;
                        }
                        if (var390 == 5002) {
                            var6--;
                            String var356 = field695[var6];
                            var5 -= 2;
                            int var357 = field686[var5];
                            int var358 = field686[var5 + 1];
                            client.field285.method2364(60);
                            client.field285.method2108(class107.method722(var356) + 2);
                            client.field285.method2113(var356);
                            client.field285.method2108(var357 - 1);
                            client.field285.method2108(var358);
                            continue;
                        }
                        if (var390 == 5003) {
                            var5 -= 2;
                            int var359 = field686[var5];
                            int var360 = field686[var5 + 1];
                            class24 var361 = (class24) class10.field148.get(var359);
                            class31 var362 = var361.method509(var360);
                            if (var362 == null) {
                                field686[var5++] = -1;
                                field686[var5++] = 0;
                                field695[var6++] = "";
                                field695[var6++] = "";
                                field695[var6++] = "";
                            } else {
                                field686[var5++] = var362.field672;
                                field686[var5++] = var362.field669;
                                field695[var6++] = var362.field671 == null ? "" : var362.field671;
                                field695[var6++] = var362.field677 == null ? "" : var362.field677;
                                field695[var6++] = var362.field673 == null ? "" : var362.field673;
                            }
                            continue;
                        }
                        if (var390 == 5004) {
                            var5--;
                            int var364 = field686[var5];
                            class31 var365 = (class31) class10.field145.method3216((long) var364);
                            if (var365 == null) {
                                field686[var5++] = -1;
                                field686[var5++] = 0;
                                field695[var6++] = "";
                                field695[var6++] = "";
                                field695[var6++] = "";
                            } else {
                                field686[var5++] = var365.field678;
                                field686[var5++] = var365.field669;
                                field695[var6++] = var365.field671 == null ? "" : var365.field671;
                                field695[var6++] = var365.field677 == null ? "" : var365.field677;
                                field695[var6++] = var365.field673 == null ? "" : var365.field673;
                            }
                            continue;
                        }
                        if (var390 == 5005) {
                            if (Statics.field1557 == null) {
                                field686[var5++] = -1;
                            } else {
                                field686[var5++] = Statics.field1557.field1885;
                            }
                            continue;
                        }
                        if (var390 == 5008) {
                            var6--;
                            String var367 = field695[var6];
                            var5--;
                            int var368 = field686[var5];
                            String var369 = var367.toLowerCase();
                            byte var370 = 0;
                            if (var369.startsWith(class142.field2188)) {
                                var370 = 0;
                                var367 = var367.substring(class142.field2188.length());
                            } else if (var369.startsWith(class142.field2309)) {
                                var370 = 1;
                                var367 = var367.substring(class142.field2309.length());
                            } else if (var369.startsWith(class142.field2311)) {
                                var370 = 2;
                                var367 = var367.substring(class142.field2311.length());
                            } else if (var369.startsWith(class142.field2170)) {
                                var370 = 3;
                                var367 = var367.substring(class142.field2170.length());
                            } else if (var369.startsWith(class142.field2315)) {
                                var370 = 4;
                                var367 = var367.substring(class142.field2315.length());
                            } else if (var369.startsWith(class142.field2317)) {
                                var370 = 5;
                                var367 = var367.substring(class142.field2317.length());
                            } else if (var369.startsWith(class142.field2319)) {
                                var370 = 6;
                                var367 = var367.substring(class142.field2319.length());
                            } else if (var369.startsWith(class142.field2321)) {
                                var370 = 7;
                                var367 = var367.substring(class142.field2321.length());
                            } else if (var369.startsWith(class142.field2323)) {
                                var370 = 8;
                                var367 = var367.substring(class142.field2323.length());
                            } else if (var369.startsWith(class142.field2167)) {
                                var370 = 9;
                                var367 = var367.substring(class142.field2167.length());
                            } else if (var369.startsWith(class142.field2327)) {
                                var370 = 10;
                                var367 = var367.substring(class142.field2327.length());
                            } else if (var369.startsWith(class142.field2178)) {
                                var370 = 11;
                                var367 = var367.substring(class142.field2178.length());
                            } else if (client.field283 != 0) {
                                if (var369.startsWith(class142.field2308)) {
                                    var370 = 0;
                                    var367 = var367.substring(class142.field2308.length());
                                } else if (var369.startsWith(class142.field2310)) {
                                    var370 = 1;
                                    var367 = var367.substring(class142.field2310.length());
                                } else if (var369.startsWith(class142.field2213)) {
                                    var370 = 2;
                                    var367 = var367.substring(class142.field2213.length());
                                } else if (var369.startsWith(class142.field2314)) {
                                    var370 = 3;
                                    var367 = var367.substring(class142.field2314.length());
                                } else if (var369.startsWith(class142.field2316)) {
                                    var370 = 4;
                                    var367 = var367.substring(class142.field2316.length());
                                } else if (var369.startsWith(class142.field2172)) {
                                    var370 = 5;
                                    var367 = var367.substring(class142.field2172.length());
                                } else if (var369.startsWith(class142.field2320)) {
                                    var370 = 6;
                                    var367 = var367.substring(class142.field2320.length());
                                } else if (var369.startsWith(class142.field2322)) {
                                    var370 = 7;
                                    var367 = var367.substring(class142.field2322.length());
                                } else if (var369.startsWith(class142.field2214)) {
                                    var370 = 8;
                                    var367 = var367.substring(class142.field2214.length());
                                } else if (var369.startsWith(class142.field2326)) {
                                    var370 = 9;
                                    var367 = var367.substring(class142.field2326.length());
                                } else if (var369.startsWith(class142.field2328)) {
                                    var370 = 10;
                                    var367 = var367.substring(class142.field2328.length());
                                } else if (var369.startsWith(class142.field2330)) {
                                    var370 = 11;
                                    var367 = var367.substring(class142.field2330.length());
                                }
                            }
                            String var371 = var367.toLowerCase();
                            byte var372 = 0;
                            if (var371.startsWith(class142.field2173)) {
                                var372 = 1;
                                var367 = var367.substring(class142.field2173.length());
                            } else if (var371.startsWith(class142.field2333)) {
                                var372 = 2;
                                var367 = var367.substring(class142.field2333.length());
                            } else if (var371.startsWith(class142.field2335)) {
                                var372 = 3;
                                var367 = var367.substring(class142.field2335.length());
                            } else if (var371.startsWith(class142.field2337)) {
                                var372 = 4;
                                var367 = var367.substring(class142.field2337.length());
                            } else if (var371.startsWith(class142.field2229)) {
                                var372 = 5;
                                var367 = var367.substring(class142.field2229.length());
                            } else if (client.field283 != 0) {
                                if (var371.startsWith(class142.field2286)) {
                                    var372 = 1;
                                    var367 = var367.substring(class142.field2286.length());
                                } else if (var371.startsWith(class142.field2256)) {
                                    var372 = 2;
                                    var367 = var367.substring(class142.field2256.length());
                                } else if (var371.startsWith(class142.field2259)) {
                                    var372 = 3;
                                    var367 = var367.substring(class142.field2259.length());
                                } else if (var371.startsWith(class142.field2158)) {
                                    var372 = 4;
                                    var367 = var367.substring(class142.field2158.length());
                                } else if (var371.startsWith(class142.field2340)) {
                                    var372 = 5;
                                    var367 = var367.substring(class142.field2340.length());
                                }
                            }
                            client.field285.method2364(195);
                            client.field285.method2108(0);
                            int var373 = client.field285.field1819;
                            client.field285.method2108(var368);
                            client.field285.method2108(var370);
                            client.field285.method2108(var372);
                            class189.method581(client.field285, var367);
                            client.field285.method2119(client.field285.field1819 - var373);
                            continue;
                        }
                        if (var390 == 5009) {
                            var6 -= 2;
                            String var374 = field695[var6];
                            String var375 = field695[var6 + 1];
                            client.field285.method2364(99);
                            client.field285.method2109(0);
                            int var376 = client.field285.field1819;
                            client.field285.method2113(var374);
                            class189.method581(client.field285, var375);
                            client.field285.method2232(client.field285.field1819 - var376);
                            continue;
                        }
                        if (var390 == 5015) {
                            String var377;
                            if (Statics.field1669 == null || Statics.field1669.field42 == null) {
                                var377 = "";
                            } else {
                                var377 = Statics.field1669.field42;
                            }
                            field695[var6++] = var377;
                            continue;
                        }
                        if (var390 == 5016) {
                            field686[var5++] = client.field330;
                            continue;
                        }
                        if (var390 == 5017) {
                            var5--;
                            int var378 = field686[var5];
                            field686[var5++] = class10.method885(var378);
                            continue;
                        }
                        if (var390 == 5018) {
                            var5--;
                            int var379 = field686[var5];
                            int[] var380 = field686;
                            int var381 = var5++;
                            class31 var382 = (class31) class10.field145.method3216((long) var379);
                            int var383;
                            if (var382 == null) {
                                var383 = -1;
                            } else if (class10.field146.field2845 == var382.field2849) {
                                var383 = -1;
                            } else {
                                var383 = ((class31) var382.field2849).field672;
                            }
                            var380[var381] = var383;
                            continue;
                        }
                        if (var390 == 5019) {
                            var5--;
                            int var384 = field686[var5];
                            field686[var5++] = class10.method120(var384);
                            continue;
                        }
                        if (var390 == 5020) {
                            var6--;
                            String var385 = field695[var6];
                            if (var385.equalsIgnoreCase("toggleroof")) {
                                Statics.field57.field138 = !Statics.field57.field138;
                                class9.method1408();
                                if (Statics.field57.field138) {
                                    class10.method2425(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method2425(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field476 >= 2) {
                                if (var385.equalsIgnoreCase("fpson")) {
                                    client.field260 = true;
                                }
                                if (var385.equalsIgnoreCase("fpsoff")) {
                                    client.field260 = false;
                                }
                                if (var385.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var385.equalsIgnoreCase("clientdrop")) {
                                    client.method125();
                                }
                                if (var385.equalsIgnoreCase("errortest") && client.field248 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field285.method2364(249);
                            client.field285.method2108(var385.length() + 1);
                            client.field285.method2113(var385);
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var389) {
            StringBuilder var387 = new StringBuilder(30);
            var387.append("").append(var4.field2857).append(" ");
            for (int var388 = field684 - 1; var388 >= 0; var388--) {
                var387.append("").append(field689[var388].field180.field2857).append(" ");
            }
            var387.append("").append(var10);
            class135.method2452(var387.toString(), var389);
        }
    }
}
