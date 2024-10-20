package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.d")
    public static int[] field698 = new int[5];

    @ObfuscatedName("ah.n")
    public static int[][] field701 = new int[5][5000];

    @ObfuscatedName("ah.v")
    public static int[] field702 = new int[1000];

    @ObfuscatedName("ah.z")
    public static String[] field700 = new String[1000];

    @ObfuscatedName("ah.j")
    public static int field699 = 0;

    @ObfuscatedName("ah.u")
    public static class13[] field705 = new class13[50];

    @ObfuscatedName("ah.c")
    public static Calendar field706 = Calendar.getInstance();

    @ObfuscatedName("ah.w")
    public static final String[] field707 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dv.t(Lt;II)V")
    public static void method2405(class1 arg0, int arg1) {
        Object[] var2 = arg0.field5;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method15(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field515;
        int[] var9 = var4.field519;
        byte var10 = -1;
        field699 = 0;
        try {
            Statics.field713 = new int[var4.field517];
            int var11 = 0;
            Statics.field1805 = new String[var4.field527];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2526;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field15 == null ? -1 : arg0.field15.field2641;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2526;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field11 == null ? -1 : arg0.field11.field2641;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field713[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field1805[var12++] = var15;
                }
            }
            int var16 = 0;
            label2414: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var380 = var8[var7];
                if (var380 < 100) {
                    if (var380 == 0) {
                        field702[var5++] = var9[var7];
                        continue;
                    }
                    if (var380 == 1) {
                        int var17 = var9[var7];
                        field702[var5++] = class154.field2650[var17];
                        continue;
                    }
                    if (var380 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2650[var18] = field702[var5];
                        client.method31(var18);
                        continue;
                    }
                    if (var380 == 3) {
                        field700[var6++] = var4.field518[var7];
                        continue;
                    }
                    if (var380 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var380 == 7) {
                        var5 -= 2;
                        if (field702[var5 + 1] != field702[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 8) {
                        var5 -= 2;
                        if (field702[var5 + 1] == field702[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 9) {
                        var5 -= 2;
                        if (field702[var5] < field702[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 10) {
                        var5 -= 2;
                        if (field702[var5] > field702[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 21) {
                        if (field699 == 0) {
                            return;
                        }
                        class13 var19 = field705[--field699];
                        var4 = var19.field180;
                        var8 = var4.field515;
                        var9 = var4.field519;
                        var7 = var19.field178;
                        Statics.field713 = var19.field179;
                        Statics.field1805 = var19.field186;
                        continue;
                    }
                    if (var380 == 25) {
                        int var20 = var9[var7];
                        field702[var5++] = class154.method2402(var20);
                        continue;
                    }
                    if (var380 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field702[var5];
                        class42 var23 = class42.method1294(var21);
                        int var24 = var23.field975;
                        int var25 = var23.field964;
                        int var26 = var23.field968;
                        int var27 = class154.field2654[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class154.field2650[var24] = class154.field2650[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var380 == 31) {
                        var5 -= 2;
                        if (field702[var5] <= field702[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 32) {
                        var5 -= 2;
                        if (field702[var5] >= field702[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var380 == 33) {
                        field702[var5++] = Statics.field713[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var380 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field713[var10001] = field702[var5];
                        continue;
                    }
                    if (var380 == 35) {
                        field700[var6++] = Statics.field1805[var9[var7]];
                        continue;
                    }
                    if (var380 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1805[var10001] = field700[var6];
                        continue;
                    }
                    if (var380 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String var30 = class199.method2906(field700, var6, var29);
                        field700[var6++] = var30;
                        continue;
                    }
                    if (var380 == 38) {
                        var5--;
                        continue;
                    }
                    if (var380 == 39) {
                        var6--;
                        continue;
                    }
                    if (var380 == 40) {
                        int var31 = var9[var7];
                        class19 var32 = class19.method15(var31);
                        int[] var33 = new int[var32.field517];
                        String[] var34 = new String[var32.field527];
                        for (int var35 = 0; var35 < var32.field521; var35++) {
                            var33[var35] = field702[var5 - var32.field521 + var35];
                        }
                        for (int var36 = 0; var36 < var32.field522; var36++) {
                            var34[var36] = field700[var6 - var32.field522 + var36];
                        }
                        var5 -= var32.field521;
                        var6 -= var32.field522;
                        class13 var37 = new class13();
                        var37.field180 = var4;
                        var37.field178 = var7;
                        var37.field179 = Statics.field713;
                        var37.field186 = Statics.field1805;
                        field705[++field699 - 1] = var37;
                        var4 = var32;
                        var8 = var32.field515;
                        var9 = var32.field519;
                        var7 = -1;
                        Statics.field713 = var33;
                        Statics.field1805 = var34;
                        continue;
                    }
                    if (var380 == 42) {
                        field702[var5++] = client.field441[var9[var7]];
                        continue;
                    }
                    if (var380 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field441[var10001] = field702[var5];
                        continue;
                    }
                    if (var380 == 44) {
                        int var38 = var9[var7] >> 16;
                        int var39 = var9[var7] & 0xFFFF;
                        var5--;
                        int var40 = field702[var5];
                        if (var40 >= 0 && var40 <= 5000) {
                            field698[var38] = var40;
                            byte var41 = -1;
                            if (var39 == 105) {
                                var41 = 0;
                            }
                            int var42 = 0;
                            while (true) {
                                if (var42 >= var40) {
                                    continue label2414;
                                }
                                field701[var38][var42] = var41;
                                var42++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 45) {
                        int var43 = var9[var7];
                        var5--;
                        int var44 = field702[var5];
                        if (var44 >= 0 && var44 < field698[var43]) {
                            field702[var5++] = field701[var43][var44];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 46) {
                        int var45 = var9[var7];
                        var5 -= 2;
                        int var46 = field702[var5];
                        if (var46 >= 0 && var46 < field698[var45]) {
                            field701[var45][var46] = field702[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var380 == 47) {
                        String var47 = client.field469[var9[var7]];
                        if (var47 == null) {
                            var47 = "null";
                        }
                        field700[var6++] = var47;
                        continue;
                    }
                    if (var380 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field469[var10001] = field700[var6];
                        continue;
                    }
                }
                boolean var48;
                if (var9[var7] == 1) {
                    var48 = true;
                } else {
                    var48 = false;
                }
                if (var380 < 1000) {
                    if (var380 == 100) {
                        var5 -= 3;
                        int var49 = field702[var5];
                        int var50 = field702[var5 + 1];
                        int var51 = field702[var5 + 2];
                        if (var50 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var52 = class152.method868(var49);
                        if (var52.field2634 == null) {
                            var52.field2634 = new class152[var51 + 1];
                        }
                        if (var52.field2634.length <= var51) {
                            class152[] var53 = new class152[var51 + 1];
                            for (int var54 = 0; var54 < var52.field2634.length; var54++) {
                                var53[var54] = var52.field2634[var54];
                            }
                            var52.field2634 = var53;
                        }
                        if (var51 > 0 && var52.field2634[var51 - 1] == null) {
                            throw new RuntimeException("" + (var51 - 1));
                        }
                        class152 var55 = new class152();
                        var55.field2528 = var50;
                        var55.field2537 = var55.field2526 = var52.field2526;
                        var55.field2641 = var51;
                        var55.field2582 = true;
                        var52.field2634[var51] = var55;
                        if (var48) {
                            Statics.field2475 = var55;
                        } else {
                            Statics.field27 = var55;
                        }
                        Statics.method122(var52);
                        continue;
                    }
                    if (var380 == 101) {
                        class152 var56 = var48 ? Statics.field2475 : Statics.field27;
                        class152 var57 = class152.method868(var56.field2526);
                        var57.field2634[var56.field2641] = null;
                        Statics.method122(var57);
                        continue;
                    }
                    if (var380 == 102) {
                        var5--;
                        class152 var58 = class152.method868(field702[var5]);
                        var58.field2634 = null;
                        Statics.method122(var58);
                        continue;
                    }
                    if (var380 == 200) {
                        var5 -= 2;
                        int var59 = field702[var5];
                        int var60 = field702[var5 + 1];
                        class152 var61 = class152.method2487(var59, var60);
                        if (var61 != null && var60 != -1) {
                            field702[var5++] = 1;
                            if (var48) {
                                Statics.field2475 = var61;
                            } else {
                                Statics.field27 = var61;
                            }
                            continue;
                        }
                        field702[var5++] = 0;
                        continue;
                    }
                } else if (var380 >= 1000 && var380 < 1100 || var380 >= 2000 && var380 < 2100) {
                    class152 var62;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var5--;
                        var62 = class152.method868(field702[var5]);
                    } else {
                        var62 = var48 ? Statics.field2475 : Statics.field27;
                    }
                    if (var380 == 1000) {
                        var5 -= 2;
                        var62.field2531 = field702[var5];
                        var62.field2532 = field702[var5 + 1];
                        Statics.method122(var62);
                        continue;
                    }
                    if (var380 == 1001) {
                        var5 -= 2;
                        var62.field2622 = field702[var5];
                        var62.field2533 = field702[var5 + 1];
                        Statics.method122(var62);
                        continue;
                    }
                    if (var380 == 1003) {
                        var5--;
                        boolean var63 = field702[var5] == 1;
                        if (var62.field2552 != var63) {
                            var62.field2552 = var63;
                            Statics.method122(var62);
                        }
                        continue;
                    }
                } else if (var380 >= 1100 && var380 < 1200 || var380 >= 2100 && var380 < 2200) {
                    class152 var64;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var5--;
                        var64 = class152.method868(field702[var5]);
                    } else {
                        var64 = var48 ? Statics.field2475 : Statics.field27;
                    }
                    if (var380 == 1100) {
                        var5 -= 2;
                        var64.field2539 = field702[var5];
                        if (var64.field2539 > var64.field2555 - var64.field2622) {
                            var64.field2539 = var64.field2555 - var64.field2622;
                        }
                        if (var64.field2539 < 0) {
                            var64.field2539 = 0;
                        }
                        var64.field2540 = field702[var5 + 1];
                        if (var64.field2540 > var64.field2542 - var64.field2533) {
                            var64.field2540 = var64.field2542 - var64.field2533;
                        }
                        if (var64.field2540 < 0) {
                            var64.field2540 = 0;
                        }
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1101) {
                        var5--;
                        var64.field2638 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1102) {
                        var5--;
                        var64.field2625 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1103) {
                        var5--;
                        var64.field2548 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1104) {
                        var5--;
                        var64.field2549 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1105) {
                        var5--;
                        var64.field2550 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1106) {
                        var5--;
                        var64.field2547 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1107) {
                        var5--;
                        var64.field2553 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1108) {
                        var64.field2558 = 1;
                        var5--;
                        var64.field2597 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1109) {
                        var5 -= 6;
                        var64.field2603 = field702[var5];
                        var64.field2525 = field702[var5 + 1];
                        var64.field2566 = field702[var5 + 2];
                        var64.field2567 = field702[var5 + 3];
                        var64.field2568 = field702[var5 + 4];
                        var64.field2524 = field702[var5 + 5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1110) {
                        var5--;
                        int var65 = field702[var5];
                        if (var64.field2562 != var65) {
                            var64.field2562 = var65;
                            var64.field2632 = 0;
                            var64.field2606 = 0;
                            Statics.method122(var64);
                        }
                        continue;
                    }
                    if (var380 == 1111) {
                        var5--;
                        var64.field2571 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1112) {
                        var6--;
                        String var66 = field700[var6];
                        if (!var66.equals(var64.field2573)) {
                            var64.field2573 = var66;
                            Statics.method122(var64);
                        }
                        continue;
                    }
                    if (var380 == 1113) {
                        var5--;
                        var64.field2600 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1114) {
                        var5 -= 3;
                        var64.field2576 = field702[var5];
                        var64.field2577 = field702[var5 + 1];
                        var64.field2643 = field702[var5 + 2];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1115) {
                        var5--;
                        var64.field2578 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1116) {
                        var5--;
                        var64.field2554 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1117) {
                        var5--;
                        var64.field2628 = field702[var5];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1118) {
                        var5--;
                        var64.field2556 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1119) {
                        var5--;
                        var64.field2557 = field702[var5] == 1;
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1120) {
                        var5 -= 2;
                        var64.field2555 = field702[var5];
                        var64.field2542 = field702[var5 + 1];
                        Statics.method122(var64);
                        continue;
                    }
                    if (var380 == 1121) {
                        int var67 = var64.field2526;
                        int var68 = var64.field2641;
                        client.field284.method2345(13);
                        client.field284.method2142(var67);
                        client.field284.method2278(var68);
                        client.field451 = var64;
                        Statics.method122(var64);
                        continue;
                    }
                } else if (var380 >= 1200 && var380 < 1300 || var380 >= 2200 && var380 < 2300) {
                    class152 var69;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var5--;
                        var69 = class152.method868(field702[var5]);
                    } else {
                        var69 = var48 ? Statics.field2475 : Statics.field27;
                    }
                    Statics.method122(var69);
                    if (var380 == 1200) {
                        var5 -= 2;
                        int var70 = field702[var5];
                        int var71 = field702[var5 + 1];
                        var69.field2564 = var70;
                        var69.field2631 = var71;
                        class45 var72 = class45.method504(var70);
                        var69.field2566 = var72.field1005;
                        var69.field2567 = var72.field1041;
                        var69.field2568 = var72.field1013;
                        var69.field2603 = var72.field1014;
                        var69.field2525 = var72.field1015;
                        var69.field2524 = var72.field1010;
                        if (var69.field2622 > 0) {
                            var69.field2524 = var69.field2524 * 32 / var69.field2622;
                        }
                        continue;
                    }
                    if (var380 == 1201) {
                        var69.field2558 = 2;
                        var5--;
                        var69.field2597 = field702[var5];
                        continue;
                    }
                    if (var380 == 1202) {
                        var69.field2558 = 3;
                        var69.field2597 = Statics.field1452.field34.method2934();
                        continue;
                    }
                } else if ((var380 < 1300 || var380 >= 1400) && (var380 < 2300 || var380 >= 2400)) {
                    if (var380 >= 1400 && var380 < 1500 || var380 >= 2400 && var380 < 2500) {
                        class152 var77;
                        if (var380 >= 2000) {
                            var380 -= 1000;
                            var5--;
                            var77 = class152.method868(field702[var5]);
                        } else {
                            var77 = var48 ? Statics.field2475 : Statics.field27;
                        }
                        var6--;
                        String var78 = field700[var6];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var5--;
                            int var80 = field702[var5];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var5--;
                                    var79[var80] = field702[var5];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var6--;
                                var81[var82] = field700[var6];
                            } else {
                                var5--;
                                var81[var82] = Integer.valueOf(field702[var5]);
                            }
                        }
                        var5--;
                        int var83 = field702[var5];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var380 == 1400) {
                            var77.field2529 = var81;
                        }
                        if (var380 == 1401) {
                            var77.field2598 = var81;
                        }
                        if (var380 == 1402) {
                            var77.field2624 = var81;
                        }
                        if (var380 == 1403) {
                            var77.field2599 = var81;
                        }
                        if (var380 == 1404) {
                            var77.field2569 = var81;
                        }
                        if (var380 == 1405) {
                            var77.field2602 = var81;
                        }
                        if (var380 == 1406) {
                            var77.field2605 = var81;
                        }
                        if (var380 == 1407) {
                            var77.field2565 = var81;
                            var77.field2642 = var79;
                        }
                        if (var380 == 1408) {
                            var77.field2612 = var81;
                        }
                        if (var380 == 1409) {
                            var77.field2613 = var81;
                        }
                        if (var380 == 1410) {
                            var77.field2583 = var81;
                        }
                        if (var380 == 1411) {
                            var77.field2596 = var81;
                        }
                        if (var380 == 1412) {
                            var77.field2535 = var81;
                        }
                        if (var380 == 1414) {
                            var77.field2608 = var81;
                            var77.field2527 = var79;
                        }
                        if (var380 == 1415) {
                            var77.field2610 = var81;
                            var77.field2611 = var79;
                        }
                        if (var380 == 1416) {
                            var77.field2586 = var81;
                        }
                        if (var380 == 1417) {
                            var77.field2614 = var81;
                        }
                        if (var380 == 1418) {
                            var77.field2615 = var81;
                        }
                        if (var380 == 1419) {
                            var77.field2616 = var81;
                        }
                        if (var380 == 1420) {
                            var77.field2617 = var81;
                        }
                        if (var380 == 1421) {
                            var77.field2618 = var81;
                        }
                        if (var380 == 1422) {
                            var77.field2619 = var81;
                        }
                        if (var380 == 1423) {
                            var77.field2620 = var81;
                        }
                        if (var380 == 1424) {
                            var77.field2621 = var81;
                        }
                        var77.field2593 = true;
                        continue;
                    }
                    if (var380 < 1600) {
                        class152 var84 = var48 ? Statics.field2475 : Statics.field27;
                        if (var380 == 1500) {
                            field702[var5++] = var84.field2531;
                            continue;
                        }
                        if (var380 == 1501) {
                            field702[var5++] = var84.field2532;
                            continue;
                        }
                        if (var380 == 1502) {
                            field702[var5++] = var84.field2622;
                            continue;
                        }
                        if (var380 == 1503) {
                            field702[var5++] = var84.field2533;
                            continue;
                        }
                        if (var380 == 1504) {
                            field702[var5++] = var84.field2552 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 1505) {
                            field702[var5++] = var84.field2537;
                            continue;
                        }
                    } else if (var380 < 1700) {
                        class152 var85 = var48 ? Statics.field2475 : Statics.field27;
                        if (var380 == 1600) {
                            field702[var5++] = var85.field2539;
                            continue;
                        }
                        if (var380 == 1601) {
                            field702[var5++] = var85.field2540;
                            continue;
                        }
                        if (var380 == 1602) {
                            field700[var6++] = var85.field2573;
                            continue;
                        }
                        if (var380 == 1603) {
                            field702[var5++] = var85.field2555;
                            continue;
                        }
                        if (var380 == 1604) {
                            field702[var5++] = var85.field2542;
                            continue;
                        }
                        if (var380 == 1605) {
                            field702[var5++] = var85.field2524;
                            continue;
                        }
                        if (var380 == 1606) {
                            field702[var5++] = var85.field2566;
                            continue;
                        }
                        if (var380 == 1607) {
                            field702[var5++] = var85.field2568;
                            continue;
                        }
                        if (var380 == 1608) {
                            field702[var5++] = var85.field2567;
                            continue;
                        }
                    } else if (var380 < 1800) {
                        class152 var86 = var48 ? Statics.field2475 : Statics.field27;
                        if (var380 == 1700) {
                            field702[var5++] = var86.field2564;
                            continue;
                        }
                        if (var380 == 1701) {
                            if (var86.field2564 == -1) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = var86.field2631;
                            }
                            continue;
                        }
                        if (var380 == 1702) {
                            field702[var5++] = var86.field2641;
                            continue;
                        }
                    } else if (var380 < 1900) {
                        class152 var87 = var48 ? Statics.field2475 : Statics.field27;
                        if (var380 == 1800) {
                            field702[var5++] = class156.method178(client.method132(var87));
                            continue;
                        }
                        if (var380 == 1801) {
                            var5--;
                            int var88 = field702[var5];
                            int var381 = var88 - 1;
                            if (var87.field2587 != null && var381 < var87.field2587.length && var87.field2587[var381] != null) {
                                field700[var6++] = var87.field2587[var381];
                                continue;
                            }
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 1802) {
                            if (var87.field2630 == null) {
                                field700[var6++] = "";
                            } else {
                                field700[var6++] = var87.field2630;
                            }
                            continue;
                        }
                    } else if (var380 < 2600) {
                        var5--;
                        class152 var89 = class152.method868(field702[var5]);
                        if (var380 == 2500) {
                            field702[var5++] = var89.field2531;
                            continue;
                        }
                        if (var380 == 2501) {
                            field702[var5++] = var89.field2532;
                            continue;
                        }
                        if (var380 == 2502) {
                            field702[var5++] = var89.field2622;
                            continue;
                        }
                        if (var380 == 2503) {
                            field702[var5++] = var89.field2533;
                            continue;
                        }
                        if (var380 == 2504) {
                            field702[var5++] = var89.field2552 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 2505) {
                            field702[var5++] = var89.field2537;
                            continue;
                        }
                    } else if (var380 < 2700) {
                        var5--;
                        class152 var90 = class152.method868(field702[var5]);
                        if (var380 == 2600) {
                            field702[var5++] = var90.field2539;
                            continue;
                        }
                        if (var380 == 2601) {
                            field702[var5++] = var90.field2540;
                            continue;
                        }
                        if (var380 == 2602) {
                            field700[var6++] = var90.field2573;
                            continue;
                        }
                        if (var380 == 2603) {
                            field702[var5++] = var90.field2555;
                            continue;
                        }
                        if (var380 == 2604) {
                            field702[var5++] = var90.field2542;
                            continue;
                        }
                        if (var380 == 2605) {
                            field702[var5++] = var90.field2524;
                            continue;
                        }
                        if (var380 == 2606) {
                            field702[var5++] = var90.field2566;
                            continue;
                        }
                        if (var380 == 2607) {
                            field702[var5++] = var90.field2568;
                            continue;
                        }
                        if (var380 == 2608) {
                            field702[var5++] = var90.field2567;
                            continue;
                        }
                    } else if (var380 < 2800) {
                        if (var380 == 2700) {
                            var5--;
                            class152 var91 = class152.method868(field702[var5]);
                            field702[var5++] = var91.field2564;
                            continue;
                        }
                        if (var380 == 2701) {
                            var5--;
                            class152 var92 = class152.method868(field702[var5]);
                            if (var92.field2564 == -1) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = var92.field2631;
                            }
                            continue;
                        }
                        if (var380 == 2702) {
                            var5--;
                            int var93 = field702[var5];
                            class4 var94 = (class4) client.field407.method3204((long) var93);
                            if (var94 == null) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var380 < 2900) {
                        var5--;
                        class152 var95 = class152.method868(field702[var5]);
                        if (var380 == 2800) {
                            field702[var5++] = class156.method178(client.method132(var95));
                            continue;
                        }
                        if (var380 == 2801) {
                            var5--;
                            int var96 = field702[var5];
                            int var382 = var96 - 1;
                            if (var95.field2587 != null && var382 < var95.field2587.length && var95.field2587[var382] != null) {
                                field700[var6++] = var95.field2587[var382];
                                continue;
                            }
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 2802) {
                            if (var95.field2630 == null) {
                                field700[var6++] = "";
                            } else {
                                field700[var6++] = var95.field2630;
                            }
                            continue;
                        }
                    } else if (var380 < 3200) {
                        if (var380 == 3100) {
                            var6--;
                            String var97 = field700[var6];
                            class10.method551(0, "", var97);
                            continue;
                        }
                        if (var380 == 3101) {
                            var5 -= 2;
                            client.method171(Statics.field1452, field702[var5], field702[var5 + 1]);
                            continue;
                        }
                        if (var380 == 3103) {
                            client.method91();
                            continue;
                        }
                        if (var380 == 3104) {
                            var6--;
                            String var98 = field700[var6];
                            int var99 = 0;
                            if (class199.method3432(var98)) {
                                int var100 = class199.method2039(var98, 10, true);
                                var99 = var100;
                            }
                            client.field284.method2345(241);
                            client.field284.method2090(var99);
                            continue;
                        }
                        if (var380 == 3105) {
                            var6--;
                            String var101 = field700[var6];
                            client.field284.method2345(86);
                            client.field284.method2214(var101.length() + 1);
                            client.field284.method2092(var101);
                            continue;
                        }
                        if (var380 == 3106) {
                            var6--;
                            String var102 = field700[var6];
                            client.field284.method2345(81);
                            client.field284.method2214(var102.length() + 1);
                            client.field284.method2092(var102);
                            continue;
                        }
                        if (var380 == 3107) {
                            var5--;
                            int var103 = field702[var5];
                            var6--;
                            String var104 = field700[var6];
                            boolean var105 = false;
                            for (int var106 = 0; var106 < client.field293; var106++) {
                                class3 var107 = client.field268[client.field366[var106]];
                                if (var107 != null && var107.field50 != null && var107.field50.equalsIgnoreCase(var104)) {
                                    if (var103 == 1) {
                                        client.field284.method2345(22);
                                        client.field284.method2214(0);
                                        client.field284.method2278(client.field366[var106]);
                                    } else if (var103 == 4) {
                                        client.field284.method2345(124);
                                        client.field284.method2131(client.field366[var106]);
                                        client.field284.method2276(0);
                                    } else if (var103 == 6) {
                                        client.field284.method2345(47);
                                        client.field284.method2131(client.field366[var106]);
                                        client.field284.method2276(0);
                                    } else if (var103 == 7) {
                                        client.field284.method2345(189);
                                        client.field284.method2124(0);
                                        client.field284.method2251(client.field366[var106]);
                                    }
                                    var105 = true;
                                    break;
                                }
                            }
                            if (!var105) {
                                class10.method551(4, "", class142.field2285 + var104);
                            }
                            continue;
                        }
                        if (var380 == 3108) {
                            var5 -= 3;
                            int var108 = field702[var5];
                            int var109 = field702[var5 + 1];
                            int var110 = field702[var5 + 2];
                            class152 var111 = class152.method868(var110);
                            client.method2396(var111, var108, var109);
                            continue;
                        }
                        if (var380 == 3109) {
                            var5 -= 2;
                            int var112 = field702[var5];
                            int var113 = field702[var5 + 1];
                            class152 var114 = var48 ? Statics.field2475 : Statics.field27;
                            client.method2396(var114, var112, var113);
                            continue;
                        }
                        if (var380 == 3110) {
                            var5--;
                            Statics.field776 = field702[var5] == 1;
                            continue;
                        }
                        if (var380 == 3111) {
                            field702[var5++] = Statics.field1815.field131 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3112) {
                            var5--;
                            Statics.field1815.field131 = field702[var5] == 1;
                            class9.method2668();
                            continue;
                        }
                        if (var380 == 3113) {
                            var6--;
                            String var115 = field700[var6];
                            var5--;
                            boolean var116 = field702[var5] == 1;
                            class125.method2029(var115, var116, false);
                            continue;
                        }
                    } else if (var380 < 3300) {
                        if (var380 == 3200) {
                            var5 -= 3;
                            int var117 = field702[var5];
                            int var118 = field702[var5 + 1];
                            int var119 = field702[var5 + 2];
                            if (client.field304 != 0 && var118 != 0 && client.field483 < 50) {
                                client.field484[client.field483] = var117;
                                client.field485[client.field483] = var118;
                                client.field486[client.field483] = var119;
                                client.field493[client.field483] = null;
                                client.field487[client.field483] = 0;
                                client.field483++;
                            }
                            continue;
                        }
                        if (var380 == 3201) {
                            var5--;
                            int var120 = field702[var5];
                            if (var120 == -1 && !client.field480) {
                                class161.method2434();
                            } else if (var120 != -1 && client.field479 != var120 && client.field419 != 0 && !client.field480) {
                                class161.method562(2, Statics.field2401, var120, 0, client.field419, false);
                            }
                            client.field479 = var120;
                            continue;
                        }
                        if (var380 == 3202) {
                            var5 -= 2;
                            client.method2485(field702[var5], field702[var5 + 1]);
                            continue;
                        }
                    } else if (var380 < 3400) {
                        if (var380 == 3300) {
                            field702[var5++] = client.field250;
                            continue;
                        }
                        if (var380 == 3301) {
                            var5 -= 2;
                            int var121 = field702[var5];
                            int var122 = field702[var5 + 1];
                            field702[var5++] = class14.method871(var121, var122);
                            continue;
                        }
                        if (var380 == 3302) {
                            var5 -= 2;
                            int var123 = field702[var5];
                            int var124 = field702[var5 + 1];
                            int[] var125 = field702;
                            int var126 = var5++;
                            class14 var127 = (class14) class14.field198.method3204((long) var123);
                            int var128;
                            if (var127 == null) {
                                var128 = 0;
                            } else if (var124 >= 0 && var124 < var127.field191.length) {
                                var128 = var127.field191[var124];
                            } else {
                                var128 = 0;
                            }
                            var125[var126] = var128;
                            continue;
                        }
                        if (var380 == 3303) {
                            var5 -= 2;
                            int var129 = field702[var5];
                            int var130 = field702[var5 + 1];
                            int[] var131 = field702;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field198.method3204((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = 0;
                            } else if (var130 == -1) {
                                var134 = 0;
                            } else {
                                int var135 = 0;
                                for (int var136 = 0; var136 < var133.field191.length; var136++) {
                                    if (var133.field190[var136] == var130) {
                                        var135 += var133.field191[var136];
                                    }
                                }
                                var134 = var135;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var380 == 3304) {
                            var5--;
                            int var137 = field702[var5];
                            field702[var5++] = class44.method173(var137).field991;
                            continue;
                        }
                        if (var380 == 3305) {
                            var5--;
                            int var138 = field702[var5];
                            field702[var5++] = client.field383[var138];
                            continue;
                        }
                        if (var380 == 3306) {
                            var5--;
                            int var139 = field702[var5];
                            field702[var5++] = client.field382[var139];
                            continue;
                        }
                        if (var380 == 3307) {
                            var5--;
                            int var140 = field702[var5];
                            field702[var5++] = client.field385[var140];
                            continue;
                        }
                        if (var380 == 3308) {
                            int var141 = Statics.field588;
                            int var142 = (Statics.field1452.field772 >> 7) + Statics.field200;
                            int var143 = (Statics.field1452.field715 >> 7) + Statics.field56;
                            field702[var5++] = (var141 << 28) + (var142 << 14) + var143;
                            continue;
                        }
                        if (var380 == 3309) {
                            var5--;
                            int var144 = field702[var5];
                            field702[var5++] = var144 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var380 == 3310) {
                            var5--;
                            int var145 = field702[var5];
                            field702[var5++] = var145 >> 28;
                            continue;
                        }
                        if (var380 == 3311) {
                            var5--;
                            int var146 = field702[var5];
                            field702[var5++] = var146 & 0x3FFF;
                            continue;
                        }
                        if (var380 == 3312) {
                            field702[var5++] = client.field245 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3313) {
                            var5 -= 2;
                            int var147 = field702[var5] + 32768;
                            int var148 = field702[var5 + 1];
                            field702[var5++] = class14.method871(var147, var148);
                            continue;
                        }
                        if (var380 == 3314) {
                            var5 -= 2;
                            int var149 = field702[var5] + 32768;
                            int var150 = field702[var5 + 1];
                            int[] var151 = field702;
                            int var152 = var5++;
                            class14 var153 = (class14) class14.field198.method3204((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 >= 0 && var150 < var153.field191.length) {
                                var154 = var153.field191[var150];
                            } else {
                                var154 = 0;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var380 == 3315) {
                            var5 -= 2;
                            int var155 = field702[var5] + 32768;
                            int var156 = field702[var5 + 1];
                            int[] var157 = field702;
                            int var158 = var5++;
                            class14 var159 = (class14) class14.field198.method3204((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = 0;
                            } else if (var156 == -1) {
                                var160 = 0;
                            } else {
                                int var161 = 0;
                                for (int var162 = 0; var162 < var159.field191.length; var162++) {
                                    if (var159.field190[var162] == var156) {
                                        var161 += var159.field191[var162];
                                    }
                                }
                                var160 = var161;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var380 == 3316) {
                            if (client.field432 >= 2) {
                                field702[var5++] = client.field432;
                            } else {
                                field702[var5++] = 0;
                            }
                            continue;
                        }
                        if (var380 == 3317) {
                            field702[var5++] = client.field257;
                            continue;
                        }
                        if (var380 == 3318) {
                            field702[var5++] = client.field241;
                            continue;
                        }
                        if (var380 == 3321) {
                            field702[var5++] = client.field307;
                            continue;
                        }
                        if (var380 == 3322) {
                            field702[var5++] = client.field412;
                            continue;
                        }
                        if (var380 == 3323) {
                            if (client.field415) {
                                field702[var5++] = 1;
                            } else {
                                field702[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var380 < 3500) {
                        if (var380 == 3400) {
                            var5 -= 2;
                            int var163 = field702[var5];
                            int var164 = field702[var5 + 1];
                            class43 var165 = class43.method872(var163);
                            if (var165.field977 != 's') {
                            }
                            for (int var166 = 0; var166 < var165.field987; var166++) {
                                if (var165.field980[var166] == var164) {
                                    field700[var6++] = var165.field984[var166];
                                    var165 = null;
                                    break;
                                }
                            }
                            if (var165 != null) {
                                field700[var6++] = var165.field981;
                            }
                            continue;
                        }
                        if (var380 == 3408) {
                            var5 -= 4;
                            int var167 = field702[var5];
                            int var168 = field702[var5 + 1];
                            int var169 = field702[var5 + 2];
                            int var170 = field702[var5 + 3];
                            class43 var171 = class43.method872(var169);
                            if (var171.field979 == var167 && var171.field977 == var168) {
                                for (int var172 = 0; var172 < var171.field987; var172++) {
                                    if (var171.field980[var172] == var170) {
                                        if (var168 == 115) {
                                            field700[var6++] = var171.field984[var172];
                                        } else {
                                            field702[var5++] = var171.field985[var172];
                                        }
                                        var171 = null;
                                        break;
                                    }
                                }
                                if (var171 != null) {
                                    if (var168 == 115) {
                                        field700[var6++] = var171.field981;
                                    } else {
                                        field702[var5++] = var171.field982;
                                    }
                                }
                                continue;
                            }
                            if (var168 == 115) {
                                field700[var6++] = "null";
                            } else {
                                field702[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var380 < 3700) {
                        if (var380 == 3600) {
                            if (client.field352 == 0) {
                                field702[var5++] = -2;
                            } else if (client.field352 == 1) {
                                field702[var5++] = -1;
                            } else {
                                field702[var5++] = client.field495;
                            }
                            continue;
                        }
                        if (var380 == 3601) {
                            var5--;
                            int var173 = field702[var5];
                            if (client.field352 == 2 && var173 < client.field495) {
                                field700[var6++] = client.field497[var173].field221;
                                field700[var6++] = client.field497[var173].field219;
                                continue;
                            }
                            field700[var6++] = "";
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 3602) {
                            var5--;
                            int var174 = field702[var5];
                            if (client.field352 == 2 && var174 < client.field495) {
                                field702[var5++] = client.field497[var174].field225;
                                continue;
                            }
                            field702[var5++] = 0;
                            continue;
                        }
                        if (var380 == 3603) {
                            var5--;
                            int var175 = field702[var5];
                            if (client.field352 == 2 && var175 < client.field495) {
                                field702[var5++] = client.field497[var175].field220;
                                continue;
                            }
                            field702[var5++] = 0;
                            continue;
                        }
                        if (var380 == 3604) {
                            var6--;
                            String var176 = field700[var6];
                            var5--;
                            int var177 = field702[var5];
                            client.field284.method2345(30);
                            class110 var178 = client.field284;
                            int var179 = var176.length() + 1;
                            var178.method2214(var179 + 1);
                            client.field284.method2092(var176);
                            client.field284.method2276(var177);
                            continue;
                        }
                        if (var380 == 3605) {
                            var6--;
                            String var180 = field700[var6];
                            if (var180 == null) {
                                continue;
                            }
                            if ((client.field495 < 200 || client.field271 == 1) && client.field495 < 400) {
                                String var181 = class200.method2604(var180, Statics.field1904);
                                if (var181 == null) {
                                    continue;
                                }
                                for (int var182 = 0; var182 < client.field495; var182++) {
                                    class16 var183 = client.field497[var182];
                                    String var184 = class200.method2604(var183.field221, Statics.field1904);
                                    if (var184 != null && var184.equals(var181)) {
                                        class10.method551(30, "", var180 + class142.field2207);
                                        continue label2414;
                                    }
                                    if (var183.field219 != null) {
                                        String var185 = class200.method2604(var183.field219, Statics.field1904);
                                        if (var185 != null && var185.equals(var181)) {
                                            class10.method551(30, "", var180 + class142.field2207);
                                            continue label2414;
                                        }
                                    }
                                }
                                for (int var186 = 0; var186 < client.field499; var186++) {
                                    class8 var187 = client.field500[var186];
                                    String var188 = class200.method2604(var187.field128, Statics.field1904);
                                    if (var188 != null && var188.equals(var181)) {
                                        class10.method551(30, "", class142.field2308 + var180 + class142.field2333);
                                        continue label2414;
                                    }
                                    if (var187.field124 != null) {
                                        String var189 = class200.method2604(var187.field124, Statics.field1904);
                                        if (var189 != null && var189.equals(var181)) {
                                            class10.method551(30, "", class142.field2308 + var180 + class142.field2333);
                                            continue label2414;
                                        }
                                    }
                                }
                                if (class200.method2604(Statics.field1452.field50, Statics.field1904).equals(var181)) {
                                    class10.method551(30, "", class142.field2306);
                                } else {
                                    client.field284.method2345(197);
                                    class110 var190 = client.field284;
                                    int var191 = var180.length() + 1;
                                    var190.method2214(var191);
                                    client.field284.method2092(var180);
                                }
                                continue;
                            }
                            class10.method551(30, "", class142.field2302);
                            continue;
                        }
                        if (var380 == 3606) {
                            var6--;
                            String var192 = field700[var6];
                            Statics.method477(var192);
                            continue;
                        }
                        if (var380 == 3607) {
                            var6--;
                            String var193 = field700[var6];
                            if (var193 == null) {
                                continue;
                            }
                            if ((client.field499 < 100 || client.field271 == 1) && client.field499 < 400) {
                                String var194 = class200.method2604(var193, Statics.field1904);
                                if (var194 == null) {
                                    continue;
                                }
                                for (int var195 = 0; var195 < client.field499; var195++) {
                                    class8 var196 = client.field500[var195];
                                    String var197 = class200.method2604(var196.field128, Statics.field1904);
                                    if (var197 != null && var197.equals(var194)) {
                                        class10.method551(31, "", var193 + class142.field2305);
                                        continue label2414;
                                    }
                                    if (var196.field124 != null) {
                                        String var198 = class200.method2604(var196.field124, Statics.field1904);
                                        if (var198 != null && var198.equals(var194)) {
                                            class10.method551(31, "", var193 + class142.field2305);
                                            continue label2414;
                                        }
                                    }
                                }
                                for (int var199 = 0; var199 < client.field495; var199++) {
                                    class16 var200 = client.field497[var199];
                                    String var201 = class200.method2604(var200.field221, Statics.field1904);
                                    if (var201 != null && var201.equals(var194)) {
                                        class10.method551(31, "", class142.field2310 + var193 + class142.field2311);
                                        continue label2414;
                                    }
                                    if (var200.field219 != null) {
                                        String var202 = class200.method2604(var200.field219, Statics.field1904);
                                        if (var202 != null && var202.equals(var194)) {
                                            class10.method551(31, "", class142.field2310 + var193 + class142.field2311);
                                            continue label2414;
                                        }
                                    }
                                }
                                if (class200.method2604(Statics.field1452.field50, Statics.field1904).equals(var194)) {
                                    class10.method551(31, "", class142.field2307);
                                } else {
                                    client.field284.method2345(157);
                                    class110 var203 = client.field284;
                                    int var204 = var193.length() + 1;
                                    var203.method2214(var204);
                                    client.field284.method2092(var193);
                                }
                                continue;
                            }
                            class10.method551(31, "", class142.field2304);
                            continue;
                        }
                        if (var380 == 3608) {
                            var6--;
                            String var205 = field700[var6];
                            if (var205 == null) {
                                continue;
                            }
                            String var206 = class200.method2604(var205, Statics.field1904);
                            if (var206 == null) {
                                continue;
                            }
                            int var207 = 0;
                            while (true) {
                                if (var207 >= client.field499) {
                                    continue label2414;
                                }
                                class8 var208 = client.field500[var207];
                                String var209 = var208.field128;
                                String var210 = class200.method2604(var209, Statics.field1904);
                                boolean var211;
                                if (var205 == null || var209 == null) {
                                    var211 = false;
                                } else if (var205.startsWith("#") || var209.startsWith("#")) {
                                    var211 = var205.equals(var209);
                                } else {
                                    var211 = var206.equals(var210);
                                }
                                if (var211) {
                                    client.field499--;
                                    for (int var212 = var207; var212 < client.field499; var212++) {
                                        client.field500[var212] = client.field500[var212 + 1];
                                    }
                                    client.field438 = client.field430;
                                    client.field284.method2345(5);
                                    class110 var213 = client.field284;
                                    int var214 = var205.length() + 1;
                                    var213.method2214(var214);
                                    client.field284.method2092(var205);
                                    continue label2414;
                                }
                                var207++;
                            }
                        }
                        if (var380 == 3609) {
                            var6--;
                            String var215 = field700[var6];
                            if (var215.startsWith(class2.method36(0)) || var215.startsWith(class2.method36(1))) {
                                var215 = var215.substring(7);
                            }
                            field702[var5++] = client.method2409(var215, false) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3611) {
                            if (client.field468 == null) {
                                field700[var6++] = "";
                            } else {
                                field700[var6++] = class198.method489(client.field468);
                            }
                            continue;
                        }
                        if (var380 == 3612) {
                            if (client.field468 == null) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = Statics.field600;
                            }
                            continue;
                        }
                        if (var380 == 3613) {
                            var5--;
                            int var216 = field702[var5];
                            if (client.field468 != null && var216 < Statics.field600) {
                                field700[var6++] = Statics.field1887[var216].field557;
                                continue;
                            }
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 3614) {
                            var5--;
                            int var217 = field702[var5];
                            if (client.field468 != null && var217 < Statics.field600) {
                                field702[var5++] = Statics.field1887[var217].field555;
                                continue;
                            }
                            field702[var5++] = 0;
                            continue;
                        }
                        if (var380 == 3615) {
                            var5--;
                            int var218 = field702[var5];
                            if (client.field468 != null && var218 < Statics.field600) {
                                field702[var5++] = Statics.field1887[var218].field554;
                                continue;
                            }
                            field702[var5++] = 0;
                            continue;
                        }
                        if (var380 == 3616) {
                            field702[var5++] = Statics.field1337;
                            continue;
                        }
                        if (var380 == 3617) {
                            var6--;
                            String var219 = field700[var6];
                            if (Statics.field1887 != null) {
                                client.field284.method2345(76);
                                class110 var220 = client.field284;
                                int var221 = var219.length() + 1;
                                var220.method2214(var221);
                                client.field284.method2092(var219);
                            }
                            continue;
                        }
                        if (var380 == 3618) {
                            field702[var5++] = Statics.field778;
                            continue;
                        }
                        if (var380 == 3619) {
                            var6--;
                            String var222 = field700[var6];
                            client.method2401(var222);
                            continue;
                        }
                        if (var380 == 3620) {
                            client.method1829();
                            continue;
                        }
                        if (var380 == 3621) {
                            if (client.field352 == 0) {
                                field702[var5++] = -1;
                            } else {
                                field702[var5++] = client.field499;
                            }
                            continue;
                        }
                        if (var380 == 3622) {
                            var5--;
                            int var223 = field702[var5];
                            if (client.field352 != 0 && var223 < client.field499) {
                                field700[var6++] = client.field500[var223].field128;
                                field700[var6++] = client.field500[var223].field124;
                                continue;
                            }
                            field700[var6++] = "";
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 3623) {
                            var6--;
                            String var224 = field700[var6];
                            if (var224.startsWith(class2.method36(0)) || var224.startsWith(class2.method36(1))) {
                                var224 = var224.substring(7);
                            }
                            field702[var5++] = client.method2691(var224) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 3624) {
                            var5--;
                            int var225 = field702[var5];
                            if (Statics.field1887 != null && var225 < Statics.field600 && Statics.field1887[var225].field557.equalsIgnoreCase(Statics.field1452.field50)) {
                                field702[var5++] = 1;
                                continue;
                            }
                            field702[var5++] = 0;
                            continue;
                        }
                        if (var380 == 3625) {
                            if (client.field275 == null) {
                                field700[var6++] = "";
                            } else {
                                field700[var6++] = class198.method489(client.field275);
                            }
                            continue;
                        }
                    } else if (var380 < 4100) {
                        if (var380 == 4000) {
                            var5 -= 2;
                            int var226 = field702[var5];
                            int var227 = field702[var5 + 1];
                            field702[var5++] = var226 + var227;
                            continue;
                        }
                        if (var380 == 4001) {
                            var5 -= 2;
                            int var228 = field702[var5];
                            int var229 = field702[var5 + 1];
                            field702[var5++] = var228 - var229;
                            continue;
                        }
                        if (var380 == 4002) {
                            var5 -= 2;
                            int var230 = field702[var5];
                            int var231 = field702[var5 + 1];
                            field702[var5++] = var230 * var231;
                            continue;
                        }
                        if (var380 == 4003) {
                            var5 -= 2;
                            int var232 = field702[var5];
                            int var233 = field702[var5 + 1];
                            field702[var5++] = var232 / var233;
                            continue;
                        }
                        if (var380 == 4004) {
                            var5--;
                            int var234 = field702[var5];
                            field702[var5++] = (int) (Math.random() * (double) var234);
                            continue;
                        }
                        if (var380 == 4005) {
                            var5--;
                            int var235 = field702[var5];
                            field702[var5++] = (int) (Math.random() * (double) (var235 + 1));
                            continue;
                        }
                        if (var380 == 4006) {
                            var5 -= 5;
                            int var236 = field702[var5];
                            int var237 = field702[var5 + 1];
                            int var238 = field702[var5 + 2];
                            int var239 = field702[var5 + 3];
                            int var240 = field702[var5 + 4];
                            field702[var5++] = (var237 - var236) * (var240 - var238) / (var239 - var238) + var236;
                            continue;
                        }
                        if (var380 == 4007) {
                            var5 -= 2;
                            int var241 = field702[var5];
                            int var242 = field702[var5 + 1];
                            field702[var5++] = var241 * var242 / 100 + var241;
                            continue;
                        }
                        if (var380 == 4008) {
                            var5 -= 2;
                            int var243 = field702[var5];
                            int var244 = field702[var5 + 1];
                            field702[var5++] = var243 | 0x1 << var244;
                            continue;
                        }
                        if (var380 == 4009) {
                            var5 -= 2;
                            int var245 = field702[var5];
                            int var246 = field702[var5 + 1];
                            field702[var5++] = var245 & -1 - (0x1 << var246);
                            continue;
                        }
                        if (var380 == 4010) {
                            var5 -= 2;
                            int var247 = field702[var5];
                            int var248 = field702[var5 + 1];
                            field702[var5++] = (var247 & 0x1 << var248) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var380 == 4011) {
                            var5 -= 2;
                            int var249 = field702[var5];
                            int var250 = field702[var5 + 1];
                            field702[var5++] = var249 % var250;
                            continue;
                        }
                        if (var380 == 4012) {
                            var5 -= 2;
                            int var251 = field702[var5];
                            int var252 = field702[var5 + 1];
                            if (var251 == 0) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = (int) Math.pow((double) var251, (double) var252);
                            }
                            continue;
                        }
                        if (var380 == 4013) {
                            var5 -= 2;
                            int var253 = field702[var5];
                            int var254 = field702[var5 + 1];
                            if (var253 == 0) {
                                field702[var5++] = 0;
                            } else if (var254 == 0) {
                                field702[var5++] = Integer.MAX_VALUE;
                            } else {
                                field702[var5++] = (int) Math.pow((double) var253, 1.0D / (double) var254);
                            }
                            continue;
                        }
                        if (var380 == 4014) {
                            var5 -= 2;
                            int var255 = field702[var5];
                            int var256 = field702[var5 + 1];
                            field702[var5++] = var255 & var256;
                            continue;
                        }
                        if (var380 == 4015) {
                            var5 -= 2;
                            int var257 = field702[var5];
                            int var258 = field702[var5 + 1];
                            field702[var5++] = var257 | var258;
                            continue;
                        }
                    } else if (var380 < 4200) {
                        if (var380 == 4100) {
                            var6--;
                            String var259 = field700[var6];
                            var5--;
                            int var260 = field702[var5];
                            field700[var6++] = var259 + var260;
                            continue;
                        }
                        if (var380 == 4101) {
                            var6 -= 2;
                            String var261 = field700[var6];
                            String var262 = field700[var6 + 1];
                            field700[var6++] = var261 + var262;
                            continue;
                        }
                        if (var380 == 4102) {
                            var6--;
                            String var263 = field700[var6];
                            var5--;
                            int var264 = field702[var5];
                            field700[var6++] = var263 + class199.method3327(var264, true);
                            continue;
                        }
                        if (var380 == 4103) {
                            var6--;
                            String var265 = field700[var6];
                            field700[var6++] = var265.toLowerCase();
                            continue;
                        }
                        if (var380 == 4104) {
                            var5--;
                            int var266 = field702[var5];
                            long var267 = ((long) var266 + 11745L) * 86400000L;
                            field706.setTime(new Date(var267));
                            int var269 = field706.get(5);
                            int var270 = field706.get(2);
                            int var271 = field706.get(1);
                            field700[var6++] = var269 + "-" + field707[var270] + "-" + var271;
                            continue;
                        }
                        if (var380 == 4105) {
                            var6 -= 2;
                            String var272 = field700[var6];
                            String var273 = field700[var6 + 1];
                            if (Statics.field1452.field34 != null && Statics.field1452.field34.field2671) {
                                field700[var6++] = var273;
                                continue;
                            }
                            field700[var6++] = var272;
                            continue;
                        }
                        if (var380 == 4106) {
                            var5--;
                            int var274 = field702[var5];
                            field700[var6++] = Integer.toString(var274);
                            continue;
                        }
                        if (var380 == 4107) {
                            var6 -= 2;
                            field702[var5++] = class199.method1931(class202.method153(field700[var6], field700[var6 + 1], client.field247));
                            continue;
                        }
                        if (var380 == 4108) {
                            var6--;
                            String var275 = field700[var6];
                            var5 -= 2;
                            int var276 = field702[var5];
                            int var277 = field702[var5 + 1];
                            byte[] var278 = Statics.field1986.method2709(var277, 0);
                            class193 var279 = new class193(var278);
                            field702[var5++] = var279.method3423(var275, var276);
                            continue;
                        }
                        if (var380 == 4109) {
                            var6--;
                            String var280 = field700[var6];
                            var5 -= 2;
                            int var281 = field702[var5];
                            int var282 = field702[var5 + 1];
                            byte[] var283 = Statics.field1986.method2709(var282, 0);
                            class193 var284 = new class193(var283);
                            field702[var5++] = var284.method3347(var280, var281);
                            continue;
                        }
                        if (var380 == 4110) {
                            var6 -= 2;
                            String var285 = field700[var6];
                            String var286 = field700[var6 + 1];
                            var5--;
                            if (field702[var5] == 1) {
                                field700[var6++] = var285;
                            } else {
                                field700[var6++] = var286;
                            }
                            continue;
                        }
                        if (var380 == 4111) {
                            var6--;
                            String var287 = field700[var6];
                            field700[var6++] = class192.method3388(var287);
                            continue;
                        }
                        if (var380 == 4112) {
                            var6--;
                            String var288 = field700[var6];
                            var5--;
                            int var289 = field702[var5];
                            field700[var6++] = var288 + (char) var289;
                            continue;
                        }
                        if (var380 == 4113) {
                            var5--;
                            int var290 = field702[var5];
                            int[] var291 = field702;
                            int var292 = var5++;
                            char var293 = (char) var290;
                            boolean var294;
                            if (var293 >= ' ' && var293 <= '~') {
                                var294 = true;
                            } else if (var293 >= 160 && var293 <= 255) {
                                var294 = true;
                            } else if (var293 == 8364 || var293 == 338 || var293 == 8212 || var293 == 339 || var293 == 376) {
                                var294 = true;
                            } else {
                                var294 = false;
                            }
                            var291[var292] = var294 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4114) {
                            var5--;
                            int var295 = field702[var5];
                            int[] var296 = field702;
                            int var297 = var5++;
                            char var298 = (char) var295;
                            boolean var299 = var298 >= '0' && var298 <= '9' || var298 >= 'A' && var298 <= 'Z' || var298 >= 'a' && var298 <= 'z';
                            var296[var297] = var299 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4115) {
                            var5--;
                            int var300 = field702[var5];
                            int[] var301 = field702;
                            int var302 = var5++;
                            char var303 = (char) var300;
                            boolean var304 = var303 >= 'A' && var303 <= 'Z' || var303 >= 'a' && var303 <= 'z';
                            var301[var302] = var304 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4116) {
                            var5--;
                            int var305 = field702[var5];
                            field702[var5++] = class199.method778((char) var305) ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4117) {
                            var6--;
                            String var306 = field700[var6];
                            if (var306 == null) {
                                field702[var5++] = 0;
                            } else {
                                field702[var5++] = var306.length();
                            }
                            continue;
                        }
                        if (var380 == 4118) {
                            var6--;
                            String var307 = field700[var6];
                            var5 -= 2;
                            int var308 = field702[var5];
                            int var309 = field702[var5 + 1];
                            field700[var6++] = var307.substring(var308, var309);
                            continue;
                        }
                        if (var380 == 4119) {
                            var6--;
                            String var310 = field700[var6];
                            StringBuilder var311 = new StringBuilder(var310.length());
                            boolean var312 = false;
                            for (int var313 = 0; var313 < var310.length(); var313++) {
                                char var314 = var310.charAt(var313);
                                if (var314 == '<') {
                                    var312 = true;
                                } else if (var314 == '>') {
                                    var312 = false;
                                } else if (!var312) {
                                    var311.append(var314);
                                }
                            }
                            field700[var6++] = var311.toString();
                            continue;
                        }
                        if (var380 == 4120) {
                            var6--;
                            String var315 = field700[var6];
                            var5--;
                            int var316 = field702[var5];
                            field702[var5++] = var315.indexOf(var316);
                            continue;
                        }
                        if (var380 == 4121) {
                            var6 -= 2;
                            String var317 = field700[var6];
                            String var318 = field700[var6 + 1];
                            var5--;
                            int var319 = field702[var5];
                            field702[var5++] = var317.indexOf(var318, var319);
                            continue;
                        }
                    } else if (var380 < 4300) {
                        if (var380 == 4200) {
                            var5--;
                            int var320 = field702[var5];
                            field700[var6++] = class45.method504(var320).field1039;
                            continue;
                        }
                        if (var380 == 4201) {
                            var5 -= 2;
                            int var321 = field702[var5];
                            int var322 = field702[var5 + 1];
                            class45 var323 = class45.method504(var321);
                            if (var322 >= 1 && var322 <= 5 && var323.field1019[var322 - 1] != null) {
                                field700[var6++] = var323.field1019[var322 - 1];
                                continue;
                            }
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 4202) {
                            var5 -= 2;
                            int var324 = field702[var5];
                            int var325 = field702[var5 + 1];
                            class45 var326 = class45.method504(var324);
                            if (var325 >= 1 && var325 <= 5 && var326.field1027[var325 - 1] != null) {
                                field700[var6++] = var326.field1027[var325 - 1];
                                continue;
                            }
                            field700[var6++] = "";
                            continue;
                        }
                        if (var380 == 4203) {
                            var5--;
                            int var327 = field702[var5];
                            field702[var5++] = class45.method504(var327).field1017;
                            continue;
                        }
                        if (var380 == 4204) {
                            var5--;
                            int var328 = field702[var5];
                            field702[var5++] = class45.method504(var328).field1016 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var380 == 4205) {
                            var5--;
                            int var329 = field702[var5];
                            class45 var330 = class45.method504(var329);
                            if (var330.field1036 == -1 && var330.field1035 >= 0) {
                                field702[var5++] = var330.field1035;
                                continue;
                            }
                            field702[var5++] = var329;
                            continue;
                        }
                        if (var380 == 4206) {
                            var5--;
                            int var331 = field702[var5];
                            class45 var332 = class45.method504(var331);
                            if (var332.field1036 >= 0 && var332.field1035 >= 0) {
                                field702[var5++] = var332.field1035;
                                continue;
                            }
                            field702[var5++] = var331;
                            continue;
                        }
                        if (var380 == 4207) {
                            var5--;
                            int var333 = field702[var5];
                            field702[var5++] = class45.method504(var333).field996 ? 1 : 0;
                            continue;
                        }
                    } else if (var380 < 5100) {
                        if (var380 == 5000) {
                            field702[var5++] = client.field361;
                            continue;
                        }
                        if (var380 == 5001) {
                            var5 -= 3;
                            client.field361 = field702[var5];
                            Statics.field1796 = class117.method32(field702[var5 + 1]);
                            if (Statics.field1796 == null) {
                                Statics.field1796 = class117.field1893;
                            }
                            client.field461 = field702[var5 + 2];
                            client.field284.method2345(133);
                            client.field284.method2214(client.field361);
                            client.field284.method2214(Statics.field1796.field1895);
                            client.field284.method2214(client.field461);
                            continue;
                        }
                        if (var380 == 5002) {
                            var6--;
                            String var334 = field700[var6];
                            var5 -= 2;
                            int var335 = field702[var5];
                            int var336 = field702[var5 + 1];
                            client.field284.method2345(127);
                            class110 var337 = client.field284;
                            int var338 = var334.length() + 1;
                            var337.method2214(var338 + 2);
                            client.field284.method2092(var334);
                            client.field284.method2214(var335 - 1);
                            client.field284.method2214(var336);
                            continue;
                        }
                        if (var380 == 5003) {
                            var5 -= 2;
                            int var339 = field702[var5];
                            int var340 = field702[var5 + 1];
                            class31 var341 = class10.method2581(var339, var340);
                            if (var341 == null) {
                                field702[var5++] = -1;
                                field702[var5++] = 0;
                                field700[var6++] = "";
                                field700[var6++] = "";
                                field700[var6++] = "";
                            } else {
                                field702[var5++] = var341.field695;
                                field702[var5++] = var341.field686;
                                field700[var6++] = var341.field687 == null ? "" : var341.field687;
                                field700[var6++] = var341.field688 == null ? "" : var341.field688;
                                field700[var6++] = var341.field689 == null ? "" : var341.field689;
                            }
                            continue;
                        }
                        if (var380 == 5004) {
                            var5--;
                            int var342 = field702[var5];
                            class31 var343 = (class31) class10.field143.method3220((long) var342);
                            if (var343 == null) {
                                field702[var5++] = -1;
                                field702[var5++] = 0;
                                field700[var6++] = "";
                                field700[var6++] = "";
                                field700[var6++] = "";
                            } else {
                                field702[var5++] = var343.field692;
                                field702[var5++] = var343.field686;
                                field700[var6++] = var343.field687 == null ? "" : var343.field687;
                                field700[var6++] = var343.field688 == null ? "" : var343.field688;
                                field700[var6++] = var343.field689 == null ? "" : var343.field689;
                            }
                            continue;
                        }
                        if (var380 == 5005) {
                            if (Statics.field1796 == null) {
                                field702[var5++] = -1;
                            } else {
                                field702[var5++] = Statics.field1796.field1895;
                            }
                            continue;
                        }
                        if (var380 == 5008) {
                            var6--;
                            String var345 = field700[var6];
                            var5--;
                            int var346 = field702[var5];
                            String var347 = var345.toLowerCase();
                            byte var348 = 0;
                            if (var347.startsWith(class142.field2370)) {
                                var348 = 0;
                                var345 = var345.substring(class142.field2370.length());
                            } else if (var347.startsWith(class142.field2314)) {
                                var348 = 1;
                                var345 = var345.substring(class142.field2314.length());
                            } else if (var347.startsWith(class142.field2316)) {
                                var348 = 2;
                                var345 = var345.substring(class142.field2316.length());
                            } else if (var347.startsWith(class142.field2318)) {
                                var348 = 3;
                                var345 = var345.substring(class142.field2318.length());
                            } else if (var347.startsWith(class142.field2320)) {
                                var348 = 4;
                                var345 = var345.substring(class142.field2320.length());
                            } else if (var347.startsWith(class142.field2149)) {
                                var348 = 5;
                                var345 = var345.substring(class142.field2149.length());
                            } else if (var347.startsWith(class142.field2324)) {
                                var348 = 6;
                                var345 = var345.substring(class142.field2324.length());
                            } else if (var347.startsWith(class142.field2326)) {
                                var348 = 7;
                                var345 = var345.substring(class142.field2326.length());
                            } else if (var347.startsWith(class142.field2328)) {
                                var348 = 8;
                                var345 = var345.substring(class142.field2328.length());
                            } else if (var347.startsWith(class142.field2330)) {
                                var348 = 9;
                                var345 = var345.substring(class142.field2330.length());
                            } else if (var347.startsWith(class142.field2332)) {
                                var348 = 10;
                                var345 = var345.substring(class142.field2332.length());
                            } else if (var347.startsWith(class142.field2334)) {
                                var348 = 11;
                                var345 = var345.substring(class142.field2334.length());
                            } else if (client.field247 != 0) {
                                if (var347.startsWith(class142.field2349)) {
                                    var348 = 0;
                                    var345 = var345.substring(class142.field2349.length());
                                } else if (var347.startsWith(class142.field2315)) {
                                    var348 = 1;
                                    var345 = var345.substring(class142.field2315.length());
                                } else if (var347.startsWith(class142.field2317)) {
                                    var348 = 2;
                                    var345 = var345.substring(class142.field2317.length());
                                } else if (var347.startsWith(class142.field2369)) {
                                    var348 = 3;
                                    var345 = var345.substring(class142.field2369.length());
                                } else if (var347.startsWith(class142.field2170)) {
                                    var348 = 4;
                                    var345 = var345.substring(class142.field2170.length());
                                } else if (var347.startsWith(class142.field2323)) {
                                    var348 = 5;
                                    var345 = var345.substring(class142.field2323.length());
                                } else if (var347.startsWith(class142.field2325)) {
                                    var348 = 6;
                                    var345 = var345.substring(class142.field2325.length());
                                } else if (var347.startsWith(class142.field2350)) {
                                    var348 = 7;
                                    var345 = var345.substring(class142.field2350.length());
                                } else if (var347.startsWith(class142.field2322)) {
                                    var348 = 8;
                                    var345 = var345.substring(class142.field2322.length());
                                } else if (var347.startsWith(class142.field2331)) {
                                    var348 = 9;
                                    var345 = var345.substring(class142.field2331.length());
                                } else if (var347.startsWith(class142.field2371)) {
                                    var348 = 10;
                                    var345 = var345.substring(class142.field2371.length());
                                } else if (var347.startsWith(class142.field2335)) {
                                    var348 = 11;
                                    var345 = var345.substring(class142.field2335.length());
                                }
                            }
                            String var349 = var345.toLowerCase();
                            byte var350 = 0;
                            if (var349.startsWith(class142.field2336)) {
                                var350 = 1;
                                var345 = var345.substring(class142.field2336.length());
                            } else if (var349.startsWith(class142.field2338)) {
                                var350 = 2;
                                var345 = var345.substring(class142.field2338.length());
                            } else if (var349.startsWith(class142.field2340)) {
                                var350 = 3;
                                var345 = var345.substring(class142.field2340.length());
                            } else if (var349.startsWith(class142.field2267)) {
                                var350 = 4;
                                var345 = var345.substring(class142.field2267.length());
                            } else if (var349.startsWith(class142.field2260)) {
                                var350 = 5;
                                var345 = var345.substring(class142.field2260.length());
                            } else if (client.field247 != 0) {
                                if (var349.startsWith(class142.field2337)) {
                                    var350 = 1;
                                    var345 = var345.substring(class142.field2337.length());
                                } else if (var349.startsWith(class142.field2339)) {
                                    var350 = 2;
                                    var345 = var345.substring(class142.field2339.length());
                                } else if (var349.startsWith(class142.field2341)) {
                                    var350 = 3;
                                    var345 = var345.substring(class142.field2341.length());
                                } else if (var349.startsWith(class142.field2232)) {
                                    var350 = 4;
                                    var345 = var345.substring(class142.field2232.length());
                                } else if (var349.startsWith(class142.field2345)) {
                                    var350 = 5;
                                    var345 = var345.substring(class142.field2345.length());
                                }
                            }
                            client.field284.method2345(165);
                            client.field284.method2214(0);
                            int var351 = client.field284.field1830;
                            client.field284.method2214(var346);
                            client.field284.method2214(var348);
                            client.field284.method2214(var350);
                            class110 var352 = client.field284;
                            int var353 = var352.field1830;
                            byte[] var354 = class201.method2397(var345);
                            var352.method2208(var354.length);
                            var352.field1830 += Statics.field2893.method2032(var354, 0, var354.length, var352.field1831, var352.field1830);
                            client.field284.method2098(client.field284.field1830 - var351);
                            continue;
                        }
                        if (var380 == 5009) {
                            var6 -= 2;
                            String var355 = field700[var6];
                            String var356 = field700[var6 + 1];
                            client.field284.method2345(94);
                            client.field284.method2251(0);
                            int var357 = client.field284.field1830;
                            client.field284.method2092(var355);
                            class110 var358 = client.field284;
                            int var359 = var358.field1830;
                            byte[] var360 = class201.method2397(var356);
                            var358.method2208(var360.length);
                            var358.field1830 += Statics.field2893.method2032(var360, 0, var360.length, var358.field1831, var358.field1830);
                            client.field284.method2085(client.field284.field1830 - var357);
                            continue;
                        }
                        if (var380 == 5015) {
                            String var361;
                            if (Statics.field1452 == null || Statics.field1452.field50 == null) {
                                var361 = "";
                            } else {
                                var361 = Statics.field1452.field50;
                            }
                            field700[var6++] = var361;
                            continue;
                        }
                        if (var380 == 5016) {
                            field702[var5++] = client.field461;
                            continue;
                        }
                        if (var380 == 5017) {
                            var5--;
                            int var362 = field702[var5];
                            field702[var5++] = class10.method2044(var362);
                            continue;
                        }
                        if (var380 == 5018) {
                            var5--;
                            int var363 = field702[var5];
                            int[] var364 = field702;
                            int var365 = var5++;
                            class31 var366 = (class31) class10.field143.method3220((long) var363);
                            int var367;
                            if (var366 == null) {
                                var367 = -1;
                            } else if (class10.field140.field2849 == var366.field2853) {
                                var367 = -1;
                            } else {
                                var367 = ((class31) var366.field2853).field695;
                            }
                            var364[var365] = var367;
                            continue;
                        }
                        if (var380 == 5019) {
                            var5--;
                            int var368 = field702[var5];
                            int[] var369 = field702;
                            int var370 = var5++;
                            class31 var371 = (class31) class10.field143.method3220((long) var368);
                            int var372;
                            if (var371 == null) {
                                var372 = -1;
                            } else if (class10.field140.field2849 == var371.field2854) {
                                var372 = -1;
                            } else {
                                var372 = ((class31) var371.field2854).field695;
                            }
                            var369[var370] = var372;
                            continue;
                        }
                        if (var380 == 5020) {
                            var6--;
                            String var373 = field700[var6];
                            client.method544(var373);
                            continue;
                        }
                    }
                } else {
                    class152 var73;
                    if (var380 >= 2000) {
                        var380 -= 1000;
                        var5--;
                        var73 = class152.method868(field702[var5]);
                    } else {
                        var73 = var48 ? Statics.field2475 : Statics.field27;
                    }
                    if (var380 == 1300) {
                        var5--;
                        int var74 = field702[var5] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var6--;
                            var73.method2897(var74, field700[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var380 == 1301) {
                        var5 -= 2;
                        int var75 = field702[var5];
                        int var76 = field702[var5 + 1];
                        var73.field2588 = class152.method2487(var75, var76);
                        continue;
                    }
                    if (var380 == 1302) {
                        var5--;
                        var73.field2591 = field702[var5] == 1;
                        continue;
                    }
                    if (var380 == 1303) {
                        var5--;
                        var73.field2589 = field702[var5];
                        continue;
                    }
                    if (var380 == 1304) {
                        var5--;
                        var73.field2590 = field702[var5];
                        continue;
                    }
                    if (var380 == 1305) {
                        var6--;
                        var73.field2630 = field700[var6];
                        continue;
                    }
                    if (var380 == 1306) {
                        var6--;
                        var73.field2592 = field700[var6];
                        continue;
                    }
                    if (var380 == 1307) {
                        var73.field2587 = null;
                        continue;
                    }
                }
                if (var380 >= 5600 || var380 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var374 = field702[var5];
                int var375 = field702[var5 + 1];
                if (!client.field279) {
                    client.field328 = var374;
                    client.field254 = var375;
                }
            }
        } catch (Exception var379) {
            StringBuilder var377 = new StringBuilder(30);
            var377.append("").append(var4.field2864).append(" ");
            for (int var378 = field699 - 1; var378 >= 0; var378--) {
                var377.append("").append(field705[var378].field180.field2864).append(" ");
            }
            var377.append("").append(var10);
            Statics.method96(var377.toString(), var379);
        }
    }

    @ObfuscatedName("aw.s(IB)V")
    public static void method541(int arg0) {
        if (arg0 == -1 || !class152.method1930(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2595[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2575 != null) {
                class1 var4 = new class1();
                var4.field15 = var3;
                var4.field5 = var3.field2575;
                method2405(var4, 2000000);
            }
        }
    }
}
