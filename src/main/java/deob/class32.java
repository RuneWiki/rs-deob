package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ag")
public class class32 {

    @ObfuscatedName("ag.x")
    public static int[] field705 = new int[5];

    @ObfuscatedName("ag.b")
    public static int[][] field710 = new int[5][5000];

    @ObfuscatedName("ag.q")
    public static int[] field709 = new int[1000];

    @ObfuscatedName("ag.l")
    public static String[] field712 = new String[1000];

    @ObfuscatedName("ag.m")
    public static int field713 = 0;

    @ObfuscatedName("ag.u")
    public static class13[] field714 = new class13[50];

    @ObfuscatedName("ag.p")
    public static Calendar field708 = Calendar.getInstance();

    @ObfuscatedName("ag.w")
    public static final String[] field711 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.e(Le;I)V")
    public static void method884(class1 arg0) {
        method83(arg0, 200000);
    }

    @ObfuscatedName("q.v(Le;II)V")
    public static void method83(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2314(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field536;
        int[] var9 = var4.field537;
        byte var10 = -1;
        field713 = 0;
        try {
            Statics.field718 = new int[var4.field545];
            int var11 = 0;
            Statics.field706 = new String[var4.field540];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2626;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2522;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2626;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2522;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field7;
                    }
                    Statics.field718[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field1;
                    }
                    Statics.field706[var12++] = var15;
                }
            }
            int var16 = 0;
            label2498: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var392 = var8[var7];
                if (var392 < 100) {
                    if (var392 == 0) {
                        field709[var5++] = var9[var7];
                        continue;
                    }
                    if (var392 == 1) {
                        int var17 = var9[var7];
                        field709[var5++] = class154.field2649[var17];
                        continue;
                    }
                    if (var392 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2649[var18] = field709[var5];
                        client.method11(var18);
                        continue;
                    }
                    if (var392 == 3) {
                        field712[var6++] = var4.field549[var7];
                        continue;
                    }
                    if (var392 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var392 == 7) {
                        var5 -= 2;
                        if (field709[var5 + 1] != field709[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 8) {
                        var5 -= 2;
                        if (field709[var5 + 1] == field709[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 9) {
                        var5 -= 2;
                        if (field709[var5] < field709[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 10) {
                        var5 -= 2;
                        if (field709[var5] > field709[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 21) {
                        if (field713 == 0) {
                            return;
                        }
                        class13 var19 = field714[--field713];
                        var4 = var19.field198;
                        var8 = var4.field536;
                        var9 = var4.field537;
                        var7 = var19.field201;
                        Statics.field718 = var19.field199;
                        Statics.field706 = var19.field200;
                        continue;
                    }
                    if (var392 == 25) {
                        int var20 = var9[var7];
                        field709[var5++] = class154.method877(var20);
                        continue;
                    }
                    if (var392 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class154.method2663(var21, field709[var5]);
                        continue;
                    }
                    if (var392 == 31) {
                        var5 -= 2;
                        if (field709[var5] <= field709[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 32) {
                        var5 -= 2;
                        if (field709[var5] >= field709[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 33) {
                        field709[var5++] = Statics.field718[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var392 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field718[var10001] = field709[var5];
                        continue;
                    }
                    if (var392 == 35) {
                        field712[var6++] = Statics.field706[var9[var7]];
                        continue;
                    }
                    if (var392 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field706[var10001] = field712[var6];
                        continue;
                    }
                    if (var392 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field712;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field712[var6++] = var24;
                        continue;
                    }
                    if (var392 == 38) {
                        var5--;
                        continue;
                    }
                    if (var392 == 39) {
                        var6--;
                        continue;
                    }
                    if (var392 == 40) {
                        int var34 = var9[var7];
                        class19 var35 = class19.method2314(var34);
                        int[] var36 = new int[var35.field545];
                        String[] var37 = new String[var35.field540];
                        for (int var38 = 0; var38 < var35.field541; var38++) {
                            var36[var38] = field709[var5 - var35.field541 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field542; var39++) {
                            var37[var39] = field712[var6 - var35.field542 + var39];
                        }
                        var5 -= var35.field541;
                        var6 -= var35.field542;
                        class13 var40 = new class13();
                        var40.field198 = var4;
                        var40.field201 = var7;
                        var40.field199 = Statics.field718;
                        var40.field200 = Statics.field706;
                        field714[++field713 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field536;
                        var9 = var35.field537;
                        var7 = -1;
                        Statics.field718 = var36;
                        Statics.field706 = var37;
                        continue;
                    }
                    if (var392 == 42) {
                        field709[var5++] = client.field457[var9[var7]];
                        continue;
                    }
                    if (var392 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field457[var10001] = field709[var5];
                        continue;
                    }
                    if (var392 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field709[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field705[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2498;
                                }
                                field710[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field709[var5];
                        if (var47 >= 0 && var47 < field705[var46]) {
                            field709[var5++] = field710[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field709[var5];
                        if (var49 >= 0 && var49 < field705[var48]) {
                            field710[var48][var49] = field709[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 47) {
                        String var50 = client.field488[var9[var7]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field712[var6++] = var50;
                        continue;
                    }
                    if (var392 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field488[var10001] = field712[var6];
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var392 < 1000) {
                    if (var392 == 100) {
                        var5 -= 3;
                        int var52 = field709[var5];
                        int var53 = field709[var5 + 1];
                        int var54 = field709[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var55 = class152.method557(var52);
                        if (var55.field2547 == null) {
                            var55.field2547 = new class152[var54 + 1];
                        }
                        if (var55.field2547.length <= var54) {
                            class152[] var56 = new class152[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2547.length; var57++) {
                                var56[var57] = var55.field2547[var57];
                            }
                            var55.field2547 = var56;
                        }
                        if (var54 > 0 && var55.field2547[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class152 var58 = new class152();
                        var58.field2593 = var53;
                        var58.field2532 = var58.field2626 = var55.field2626;
                        var58.field2522 = var54;
                        var58.field2520 = true;
                        var55.field2547[var54] = var58;
                        if (var51) {
                            Statics.field68 = var58;
                        } else {
                            Statics.field210 = var58;
                        }
                        client.method2064(var55);
                        continue;
                    }
                    if (var392 == 101) {
                        class152 var59 = var51 ? Statics.field68 : Statics.field210;
                        class152 var60 = class152.method557(var59.field2626);
                        var60.field2547[var59.field2522] = null;
                        client.method2064(var60);
                        continue;
                    }
                    if (var392 == 102) {
                        var5--;
                        class152 var61 = class152.method557(field709[var5]);
                        var61.field2547 = null;
                        client.method2064(var61);
                        continue;
                    }
                    if (var392 == 200) {
                        var5 -= 2;
                        int var62 = field709[var5];
                        int var63 = field709[var5 + 1];
                        class152 var64 = class152.method2392(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field709[var5++] = 1;
                            if (var51) {
                                Statics.field68 = var64;
                            } else {
                                Statics.field210 = var64;
                            }
                            continue;
                        }
                        field709[var5++] = 0;
                        continue;
                    }
                } else if (var392 >= 1000 && var392 < 1100 || var392 >= 2000 && var392 < 2100) {
                    class152 var65;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var65 = class152.method557(field709[var5]);
                    } else {
                        var65 = var51 ? Statics.field68 : Statics.field210;
                    }
                    if (var392 == 1000) {
                        var5 -= 2;
                        var65.field2526 = field709[var5];
                        var65.field2527 = field709[var5 + 1];
                        client.method2064(var65);
                        continue;
                    }
                    if (var392 == 1001) {
                        var5 -= 2;
                        var65.field2530 = field709[var5];
                        var65.field2531 = field709[var5 + 1];
                        client.method2064(var65);
                        continue;
                    }
                    if (var392 == 1003) {
                        var5--;
                        boolean var66 = field709[var5] == 1;
                        if (var65.field2533 != var66) {
                            var65.field2533 = var66;
                            client.method2064(var65);
                        }
                        continue;
                    }
                } else if (!(var392 < 1100 || var392 >= 1200) || !(var392 < 2100 || var392 >= 2200)) {
                    class152 var67;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var67 = class152.method557(field709[var5]);
                    } else {
                        var67 = var51 ? Statics.field68 : Statics.field210;
                    }
                    if (var392 == 1100) {
                        var5 -= 2;
                        var67.field2534 = field709[var5];
                        if (var67.field2534 > var67.field2557 - var67.field2530) {
                            var67.field2534 = var67.field2557 - var67.field2530;
                        }
                        if (var67.field2534 < 0) {
                            var67.field2534 = 0;
                        }
                        var67.field2535 = field709[var5 + 1];
                        if (var67.field2535 > var67.field2537 - var67.field2531) {
                            var67.field2535 = var67.field2537 - var67.field2531;
                        }
                        if (var67.field2535 < 0) {
                            var67.field2535 = 0;
                        }
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1101) {
                        var5--;
                        var67.field2538 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1102) {
                        var5--;
                        var67.field2542 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1103) {
                        var5--;
                        var67.field2543 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1104) {
                        var5--;
                        var67.field2544 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1105) {
                        var5--;
                        var67.field2633 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1106) {
                        var5--;
                        var67.field2607 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1107) {
                        var5--;
                        var67.field2548 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1108) {
                        var67.field2529 = 1;
                        var5--;
                        var67.field2554 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1109) {
                        var5 -= 6;
                        var67.field2559 = field709[var5];
                        var67.field2560 = field709[var5 + 1];
                        var67.field2561 = field709[var5 + 2];
                        var67.field2562 = field709[var5 + 3];
                        var67.field2540 = field709[var5 + 4];
                        var67.field2572 = field709[var5 + 5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1110) {
                        var5--;
                        int var68 = field709[var5];
                        if (var67.field2605 != var68) {
                            var67.field2605 = var68;
                            var67.field2627 = 0;
                            var67.field2608 = 0;
                            client.method2064(var67);
                        }
                        continue;
                    }
                    if (var392 == 1111) {
                        var5--;
                        var67.field2566 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1112) {
                        var6--;
                        String var69 = field712[var6];
                        if (!var69.equals(var67.field2568)) {
                            var67.field2568 = var69;
                            client.method2064(var67);
                        }
                        continue;
                    }
                    if (var392 == 1113) {
                        var5--;
                        var67.field2567 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1114) {
                        var5 -= 3;
                        var67.field2571 = field709[var5];
                        var67.field2624 = field709[var5 + 1];
                        var67.field2570 = field709[var5 + 2];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1115) {
                        var5--;
                        var67.field2573 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1116) {
                        var5--;
                        var67.field2606 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1117) {
                        var5--;
                        var67.field2550 = field709[var5];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1118) {
                        var5--;
                        var67.field2549 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1119) {
                        var5--;
                        var67.field2545 = field709[var5] == 1;
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1120) {
                        var5 -= 2;
                        var67.field2557 = field709[var5];
                        var67.field2537 = field709[var5 + 1];
                        client.method2064(var67);
                        continue;
                    }
                    if (var392 == 1121) {
                        int var70 = var67.field2626;
                        int var71 = var67.field2522;
                        client.field402.method2361(204);
                        client.field402.method2207(var71);
                        client.field402.method2189(var70);
                        client.field449 = var67;
                        client.method2064(var67);
                        continue;
                    }
                } else if (!(var392 < 1200 || var392 >= 1300) || !(var392 < 2200 || var392 >= 2300)) {
                    class152 var72;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var72 = class152.method557(field709[var5]);
                    } else {
                        var72 = var51 ? Statics.field68 : Statics.field210;
                    }
                    client.method2064(var72);
                    if (var392 == 1200) {
                        var5 -= 2;
                        int var73 = field709[var5];
                        int var74 = field709[var5 + 1];
                        var72.field2625 = var73;
                        var72.field2616 = var74;
                        class45 var75 = class45.method28(var73);
                        var72.field2561 = var75.field998;
                        var72.field2562 = var75.field1039;
                        var72.field2540 = var75.field1008;
                        var72.field2559 = var75.field1009;
                        var72.field2560 = var75.field1010;
                        var72.field2572 = var75.field1005;
                        if (var72.field2530 > 0) {
                            var72.field2572 = var72.field2572 * 32 / var72.field2530;
                        }
                        continue;
                    }
                    if (var392 == 1201) {
                        var72.field2529 = 2;
                        var5--;
                        var72.field2554 = field709[var5];
                        continue;
                    }
                    if (var392 == 1202) {
                        var72.field2529 = 3;
                        var72.field2554 = Statics.field183.field41.method2906();
                        continue;
                    }
                } else if (var392 >= 1300 && var392 < 1400 || var392 >= 2300 && var392 < 2400) {
                    class152 var76;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var76 = class152.method557(field709[var5]);
                    } else {
                        var76 = var51 ? Statics.field68 : Statics.field210;
                    }
                    if (var392 == 1300) {
                        var5--;
                        int var77 = field709[var5] - 1;
                        if (var77 >= 0 && var77 <= 9) {
                            var6--;
                            var76.method2833(var77, field712[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var392 == 1301) {
                        var5 -= 2;
                        int var78 = field709[var5];
                        int var79 = field709[var5 + 1];
                        var76.field2590 = class152.method2392(var78, var79);
                        continue;
                    }
                    if (var392 == 1302) {
                        var5--;
                        var76.field2586 = field709[var5] == 1;
                        continue;
                    }
                    if (var392 == 1303) {
                        var5--;
                        var76.field2584 = field709[var5];
                        continue;
                    }
                    if (var392 == 1304) {
                        var5--;
                        var76.field2585 = field709[var5];
                        continue;
                    }
                    if (var392 == 1305) {
                        var6--;
                        var76.field2552 = field712[var6];
                        continue;
                    }
                    if (var392 == 1306) {
                        var6--;
                        var76.field2539 = field712[var6];
                        continue;
                    }
                    if (var392 == 1307) {
                        var76.field2581 = null;
                        continue;
                    }
                } else {
                    if (var392 >= 1400 && var392 < 1500 || var392 >= 2400 && var392 < 2500) {
                        class152 var80;
                        if (var392 >= 2000) {
                            var392 -= 1000;
                            var5--;
                            var80 = class152.method557(field709[var5]);
                        } else {
                            var80 = var51 ? Statics.field68 : Statics.field210;
                        }
                        var6--;
                        String var81 = field712[var6];
                        int[] var82 = null;
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var83 = field709[var5];
                            if (var83 > 0) {
                                var82 = new int[var83];
                                while (var83-- > 0) {
                                    var5--;
                                    var82[var83] = field709[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var84 = new Object[var81.length() + 1];
                        for (int var85 = var84.length - 1; var85 >= 1; var85--) {
                            if (var81.charAt(var85 - 1) == 's') {
                                var6--;
                                var84[var85] = field712[var6];
                            } else {
                                var5--;
                                var84[var85] = Integer.valueOf(field709[var5]);
                            }
                        }
                        var5--;
                        int var86 = field709[var5];
                        if (var86 == -1) {
                            var84 = null;
                        } else {
                            var84[0] = Integer.valueOf(var86);
                        }
                        if (var392 == 1400) {
                            var80.field2630 = var84;
                        }
                        if (var392 == 1401) {
                            var80.field2553 = var84;
                        }
                        if (var392 == 1402) {
                            var80.field2592 = var84;
                        }
                        if (var392 == 1403) {
                            var80.field2594 = var84;
                        }
                        if (var392 == 1404) {
                            var80.field2596 = var84;
                        }
                        if (var392 == 1405) {
                            var80.field2519 = var84;
                        }
                        if (var392 == 1406) {
                            var80.field2600 = var84;
                        }
                        if (var392 == 1407) {
                            var80.field2601 = var84;
                            var80.field2602 = var82;
                        }
                        if (var392 == 1408) {
                            var80.field2583 = var84;
                        }
                        if (var392 == 1409) {
                            var80.field2576 = var84;
                        }
                        if (var392 == 1410) {
                            var80.field2598 = var84;
                        }
                        if (var392 == 1411) {
                            var80.field2591 = var84;
                        }
                        if (var392 == 1412) {
                            var80.field2595 = var84;
                        }
                        if (var392 == 1414) {
                            var80.field2603 = var84;
                            var80.field2604 = var82;
                        }
                        if (var392 == 1415) {
                            var80.field2618 = var84;
                            var80.field2575 = var82;
                        }
                        if (var392 == 1416) {
                            var80.field2599 = var84;
                        }
                        if (var392 == 1417) {
                            var80.field2609 = var84;
                        }
                        if (var392 == 1418) {
                            var80.field2610 = var84;
                        }
                        if (var392 == 1419) {
                            var80.field2611 = var84;
                        }
                        if (var392 == 1420) {
                            var80.field2612 = var84;
                        }
                        if (var392 == 1421) {
                            var80.field2631 = var84;
                        }
                        if (var392 == 1422) {
                            var80.field2614 = var84;
                        }
                        if (var392 == 1423) {
                            var80.field2615 = var84;
                        }
                        if (var392 == 1424) {
                            var80.field2556 = var84;
                        }
                        var80.field2588 = true;
                        continue;
                    }
                    if (var392 < 1600) {
                        class152 var87 = var51 ? Statics.field68 : Statics.field210;
                        if (var392 == 1500) {
                            field709[var5++] = var87.field2526;
                            continue;
                        }
                        if (var392 == 1501) {
                            field709[var5++] = var87.field2527;
                            continue;
                        }
                        if (var392 == 1502) {
                            field709[var5++] = var87.field2530;
                            continue;
                        }
                        if (var392 == 1503) {
                            field709[var5++] = var87.field2531;
                            continue;
                        }
                        if (var392 == 1504) {
                            field709[var5++] = var87.field2533 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 1505) {
                            field709[var5++] = var87.field2532;
                            continue;
                        }
                    } else if (var392 < 1700) {
                        class152 var88 = var51 ? Statics.field68 : Statics.field210;
                        if (var392 == 1600) {
                            field709[var5++] = var88.field2534;
                            continue;
                        }
                        if (var392 == 1601) {
                            field709[var5++] = var88.field2535;
                            continue;
                        }
                        if (var392 == 1602) {
                            field712[var6++] = var88.field2568;
                            continue;
                        }
                        if (var392 == 1603) {
                            field709[var5++] = var88.field2557;
                            continue;
                        }
                        if (var392 == 1604) {
                            field709[var5++] = var88.field2537;
                            continue;
                        }
                        if (var392 == 1605) {
                            field709[var5++] = var88.field2572;
                            continue;
                        }
                        if (var392 == 1606) {
                            field709[var5++] = var88.field2561;
                            continue;
                        }
                        if (var392 == 1607) {
                            field709[var5++] = var88.field2540;
                            continue;
                        }
                        if (var392 == 1608) {
                            field709[var5++] = var88.field2562;
                            continue;
                        }
                    } else if (var392 < 1800) {
                        class152 var89 = var51 ? Statics.field68 : Statics.field210;
                        if (var392 == 1700) {
                            field709[var5++] = var89.field2625;
                            continue;
                        }
                        if (var392 == 1701) {
                            if (var89.field2625 == -1) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = var89.field2616;
                            }
                            continue;
                        }
                        if (var392 == 1702) {
                            field709[var5++] = var89.field2522;
                            continue;
                        }
                    } else if (var392 < 1900) {
                        class152 var90 = var51 ? Statics.field68 : Statics.field210;
                        if (var392 == 1800) {
                            field709[var5++] = class156.method2110(Statics.method2421(var90));
                            continue;
                        }
                        if (var392 == 1801) {
                            var5--;
                            int var91 = field709[var5];
                            int var393 = var91 - 1;
                            if (var90.field2581 != null && var393 < var90.field2581.length && var90.field2581[var393] != null) {
                                field712[var6++] = var90.field2581[var393];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 1802) {
                            if (var90.field2552 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var90.field2552;
                            }
                            continue;
                        }
                    } else if (var392 < 2600) {
                        var5--;
                        class152 var92 = class152.method557(field709[var5]);
                        if (var392 == 2500) {
                            field709[var5++] = var92.field2526;
                            continue;
                        }
                        if (var392 == 2501) {
                            field709[var5++] = var92.field2527;
                            continue;
                        }
                        if (var392 == 2502) {
                            field709[var5++] = var92.field2530;
                            continue;
                        }
                        if (var392 == 2503) {
                            field709[var5++] = var92.field2531;
                            continue;
                        }
                        if (var392 == 2504) {
                            field709[var5++] = var92.field2533 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 2505) {
                            field709[var5++] = var92.field2532;
                            continue;
                        }
                    } else if (var392 < 2700) {
                        var5--;
                        class152 var93 = class152.method557(field709[var5]);
                        if (var392 == 2600) {
                            field709[var5++] = var93.field2534;
                            continue;
                        }
                        if (var392 == 2601) {
                            field709[var5++] = var93.field2535;
                            continue;
                        }
                        if (var392 == 2602) {
                            field712[var6++] = var93.field2568;
                            continue;
                        }
                        if (var392 == 2603) {
                            field709[var5++] = var93.field2557;
                            continue;
                        }
                        if (var392 == 2604) {
                            field709[var5++] = var93.field2537;
                            continue;
                        }
                        if (var392 == 2605) {
                            field709[var5++] = var93.field2572;
                            continue;
                        }
                        if (var392 == 2606) {
                            field709[var5++] = var93.field2561;
                            continue;
                        }
                        if (var392 == 2607) {
                            field709[var5++] = var93.field2540;
                            continue;
                        }
                        if (var392 == 2608) {
                            field709[var5++] = var93.field2562;
                            continue;
                        }
                    } else if (var392 < 2800) {
                        if (var392 == 2700) {
                            var5--;
                            class152 var94 = class152.method557(field709[var5]);
                            field709[var5++] = var94.field2625;
                            continue;
                        }
                        if (var392 == 2701) {
                            var5--;
                            class152 var95 = class152.method557(field709[var5]);
                            if (var95.field2625 == -1) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = var95.field2616;
                            }
                            continue;
                        }
                        if (var392 == 2702) {
                            var5--;
                            int var96 = field709[var5];
                            class4 var97 = (class4) client.field423.method3171((long) var96);
                            if (var97 == null) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var392 < 2900) {
                        var5--;
                        class152 var98 = class152.method557(field709[var5]);
                        if (var392 == 2800) {
                            field709[var5++] = class156.method2110(Statics.method2421(var98));
                            continue;
                        }
                        if (var392 == 2801) {
                            var5--;
                            int var99 = field709[var5];
                            int var394 = var99 - 1;
                            if (var98.field2581 != null && var394 < var98.field2581.length && var98.field2581[var394] != null) {
                                field712[var6++] = var98.field2581[var394];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 2802) {
                            if (var98.field2552 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var98.field2552;
                            }
                            continue;
                        }
                    } else if (var392 < 3200) {
                        if (var392 == 3100) {
                            var6--;
                            String var100 = field712[var6];
                            class10.method2658(0, "", var100);
                            continue;
                        }
                        if (var392 == 3101) {
                            var5 -= 2;
                            client.method71(Statics.field183, field709[var5], field709[var5 + 1]);
                            continue;
                        }
                        if (var392 == 3103) {
                            client.field402.method2361(47);
                            for (class4 var101 = (class4) client.field423.method3162(); var101 != null; var101 = (class4) client.field423.method3163()) {
                                if (var101.field61 == 0 || var101.field61 == 3) {
                                    Statics.method1398(var101, true);
                                }
                            }
                            if (client.field449 != null) {
                                client.method2064(client.field449);
                                client.field449 = null;
                            }
                            continue;
                        }
                        if (var392 == 3104) {
                            var6--;
                            String var102 = field712[var6];
                            int var103 = 0;
                            boolean var104 = class199.method3105(var102, 10, true);
                            if (var104) {
                                int var105 = class199.method2945(var102, 10, true);
                                var103 = var105;
                            }
                            client.field402.method2361(5);
                            client.field402.method2137(var103);
                            continue;
                        }
                        if (var392 == 3105) {
                            var6--;
                            String var106 = field712[var6];
                            client.field402.method2361(147);
                            client.field402.method2102(var106.length() + 1);
                            client.field402.method2107(var106);
                            continue;
                        }
                        if (var392 == 3106) {
                            var6--;
                            String var107 = field712[var6];
                            client.field402.method2361(195);
                            client.field402.method2102(var107.length() + 1);
                            client.field402.method2107(var107);
                            continue;
                        }
                        if (var392 == 3107) {
                            var5--;
                            int var108 = field709[var5];
                            var6--;
                            String var109 = field712[var6];
                            boolean var110 = false;
                            for (int var111 = 0; var111 < client.field483; var111++) {
                                class3 var112 = client.field380[client.field382[var111]];
                                if (var112 != null && var112.field44 != null && var112.field44.equalsIgnoreCase(var109)) {
                                    if (var108 == 1) {
                                        client.field402.method2361(131);
                                        client.field402.method2223(client.field382[var111]);
                                        client.field402.method2144(0);
                                    } else if (var108 == 4) {
                                        client.field402.method2361(37);
                                        client.field402.method2197(0);
                                        client.field402.method2207(client.field382[var111]);
                                    } else if (var108 == 6) {
                                        client.field402.method2361(239);
                                        client.field402.method2207(client.field382[var111]);
                                        client.field402.method2113(0);
                                    } else if (var108 == 7) {
                                        client.field402.method2361(111);
                                        client.field402.method2113(0);
                                        client.field402.method2153(client.field382[var111]);
                                    }
                                    var110 = true;
                                    break;
                                }
                            }
                            if (!var110) {
                                class10.method2658(4, "", class142.field2364 + var109);
                            }
                            continue;
                        }
                        if (var392 == 3108) {
                            var5 -= 3;
                            int var113 = field709[var5];
                            int var114 = field709[var5 + 1];
                            int var115 = field709[var5 + 2];
                            class152 var116 = class152.method557(var115);
                            client.method333(var116, var113, var114);
                            continue;
                        }
                        if (var392 == 3109) {
                            var5 -= 2;
                            int var117 = field709[var5];
                            int var118 = field709[var5 + 1];
                            class152 var119 = var51 ? Statics.field68 : Statics.field210;
                            client.method333(var119, var117, var118);
                            continue;
                        }
                        if (var392 == 3110) {
                            var5--;
                            Statics.field1982 = field709[var5] == 1;
                            continue;
                        }
                        if (var392 == 3111) {
                            field709[var5++] = Statics.field75.field145 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3112) {
                            var5--;
                            Statics.field75.field145 = field709[var5] == 1;
                            class9.method2044();
                            continue;
                        }
                        if (var392 == 3113) {
                            var6--;
                            String var120 = field712[var6];
                            var5--;
                            boolean var121 = field709[var5] == 1;
                            class125.method2396(var120, var121, false);
                            continue;
                        }
                    } else if (var392 < 3300) {
                        if (var392 == 3200) {
                            var5 -= 3;
                            int var122 = field709[var5];
                            int var123 = field709[var5 + 1];
                            int var124 = field709[var5 + 2];
                            if (client.field496 != 0 && var123 != 0 && client.field513 < 50) {
                                client.field499[client.field513] = var122;
                                client.field500[client.field513] = var123;
                                client.field501[client.field513] = var124;
                                client.field503[client.field513] = null;
                                client.field502[client.field513] = 0;
                                client.field513++;
                            }
                            continue;
                        }
                        if (var392 == 3201) {
                            var5--;
                            client.method2550(field709[var5]);
                            continue;
                        }
                        if (var392 == 3202) {
                            var5 -= 2;
                            client.method3116(field709[var5], field709[var5 + 1]);
                            continue;
                        }
                    } else if (var392 < 3400) {
                        if (var392 == 3300) {
                            field709[var5++] = client.field442;
                            continue;
                        }
                        if (var392 == 3301) {
                            var5 -= 2;
                            int var125 = field709[var5];
                            int var126 = field709[var5 + 1];
                            int[] var127 = field709;
                            int var128 = var5++;
                            class14 var129 = (class14) class14.field207.method3171((long) var125);
                            int var130;
                            if (var129 == null) {
                                var130 = -1;
                            } else if (var126 >= 0 && var126 < var129.field208.length) {
                                var130 = var129.field208[var126];
                            } else {
                                var130 = -1;
                            }
                            var127[var128] = var130;
                            continue;
                        }
                        if (var392 == 3302) {
                            var5 -= 2;
                            int var131 = field709[var5];
                            int var132 = field709[var5 + 1];
                            field709[var5++] = class14.method2688(var131, var132);
                            continue;
                        }
                        if (var392 == 3303) {
                            var5 -= 2;
                            int var133 = field709[var5];
                            int var134 = field709[var5 + 1];
                            field709[var5++] = class14.method136(var133, var134);
                            continue;
                        }
                        if (var392 == 3304) {
                            var5--;
                            int var135 = field709[var5];
                            int[] var136 = field709;
                            int var137 = var5++;
                            class44 var138 = (class44) class44.field993.method3136((long) var135);
                            class44 var139;
                            if (var138 == null) {
                                byte[] var140 = Statics.field985.method2695(5, var135);
                                class44 var141 = new class44();
                                if (var140 != null) {
                                    var141.method811(new class107(var140));
                                }
                                class44.field993.method3127(var141, (long) var135);
                                var139 = var141;
                            } else {
                                var139 = var138;
                            }
                            var136[var137] = var139.field986;
                            continue;
                        }
                        if (var392 == 3305) {
                            var5--;
                            int var142 = field709[var5];
                            field709[var5++] = client.field294[var142];
                            continue;
                        }
                        if (var392 == 3306) {
                            var5--;
                            int var143 = field709[var5];
                            field709[var5++] = client.field400[var143];
                            continue;
                        }
                        if (var392 == 3307) {
                            var5--;
                            int var144 = field709[var5];
                            field709[var5++] = client.field436[var144];
                            continue;
                        }
                        if (var392 == 3308) {
                            int var145 = Statics.field2401;
                            int var146 = (Statics.field183.field775 >> 7) + Statics.field314;
                            int var147 = (Statics.field183.field720 >> 7) + Statics.field2743;
                            field709[var5++] = (var145 << 28) + (var146 << 14) + var147;
                            continue;
                        }
                        if (var392 == 3309) {
                            var5--;
                            int var148 = field709[var5];
                            field709[var5++] = var148 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3310) {
                            var5--;
                            int var149 = field709[var5];
                            field709[var5++] = var149 >> 28;
                            continue;
                        }
                        if (var392 == 3311) {
                            var5--;
                            int var150 = field709[var5];
                            field709[var5++] = var150 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3312) {
                            field709[var5++] = client.field401 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3313) {
                            var5 -= 2;
                            int var151 = field709[var5] + 32768;
                            int var152 = field709[var5 + 1];
                            int[] var153 = field709;
                            int var154 = var5++;
                            class14 var155 = (class14) class14.field207.method3171((long) var151);
                            int var156;
                            if (var155 == null) {
                                var156 = -1;
                            } else if (var152 >= 0 && var152 < var155.field208.length) {
                                var156 = var155.field208[var152];
                            } else {
                                var156 = -1;
                            }
                            var153[var154] = var156;
                            continue;
                        }
                        if (var392 == 3314) {
                            var5 -= 2;
                            int var157 = field709[var5] + 32768;
                            int var158 = field709[var5 + 1];
                            field709[var5++] = class14.method2688(var157, var158);
                            continue;
                        }
                        if (var392 == 3315) {
                            var5 -= 2;
                            int var159 = field709[var5] + 32768;
                            int var160 = field709[var5 + 1];
                            field709[var5++] = class14.method136(var159, var160);
                            continue;
                        }
                        if (var392 == 3316) {
                            if (client.field429 >= 2) {
                                field709[var5++] = client.field429;
                            } else {
                                field709[var5++] = 0;
                            }
                            continue;
                        }
                        if (var392 == 3317) {
                            field709[var5++] = client.field349;
                            continue;
                        }
                        if (var392 == 3318) {
                            field709[var5++] = client.field262;
                            continue;
                        }
                        if (var392 == 3321) {
                            field709[var5++] = client.field271;
                            continue;
                        }
                        if (var392 == 3322) {
                            field709[var5++] = client.field428;
                            continue;
                        }
                        if (var392 == 3323) {
                            if (client.field424) {
                                field709[var5++] = 1;
                            } else {
                                field709[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var392 < 3500) {
                        if (var392 == 3400) {
                            var5 -= 2;
                            int var161 = field709[var5];
                            int var162 = field709[var5 + 1];
                            class43 var163 = (class43) class43.field983.method3136((long) var161);
                            class43 var164;
                            if (var163 == null) {
                                byte[] var165 = Statics.field971.method2695(8, var161);
                                class43 var166 = new class43();
                                if (var165 != null) {
                                    var166.method807(new class107(var165));
                                }
                                class43.field983.method3127(var166, (long) var161);
                                var164 = var166;
                            } else {
                                var164 = var163;
                            }
                            class43 var167 = var164;
                            if (var164.field973 != 's') {
                            }
                            for (int var168 = 0; var168 < var167.field970; var168++) {
                                if (var167.field976[var168] == var162) {
                                    field712[var6++] = var167.field979[var168];
                                    var167 = null;
                                    break;
                                }
                            }
                            if (var167 != null) {
                                field712[var6++] = var167.field974;
                            }
                            continue;
                        }
                        if (var392 == 3408) {
                            var5 -= 4;
                            int var169 = field709[var5];
                            int var170 = field709[var5 + 1];
                            int var171 = field709[var5 + 2];
                            int var172 = field709[var5 + 3];
                            class43 var173 = (class43) class43.field983.method3136((long) var171);
                            class43 var174;
                            if (var173 == null) {
                                byte[] var175 = Statics.field971.method2695(8, var171);
                                class43 var176 = new class43();
                                if (var175 != null) {
                                    var176.method807(new class107(var175));
                                }
                                class43.field983.method3127(var176, (long) var171);
                                var174 = var176;
                            } else {
                                var174 = var173;
                            }
                            class43 var177 = var174;
                            if (var174.field982 == var169 && var174.field973 == var170) {
                                for (int var178 = 0; var178 < var177.field970; var178++) {
                                    if (var177.field976[var178] == var172) {
                                        if (var170 == 115) {
                                            field712[var6++] = var177.field979[var178];
                                        } else {
                                            field709[var5++] = var177.field978[var178];
                                        }
                                        var177 = null;
                                        break;
                                    }
                                }
                                if (var177 != null) {
                                    if (var170 == 115) {
                                        field712[var6++] = var177.field974;
                                    } else {
                                        field709[var5++] = var177.field975;
                                    }
                                }
                                continue;
                            }
                            if (var170 == 115) {
                                field712[var6++] = "null";
                            } else {
                                field709[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var392 < 3700) {
                        if (var392 == 3600) {
                            if (client.field511 == 0) {
                                field709[var5++] = -2;
                            } else if (client.field511 == 1) {
                                field709[var5++] = -1;
                            } else {
                                field709[var5++] = client.field287;
                            }
                            continue;
                        }
                        if (var392 == 3601) {
                            var5--;
                            int var179 = field709[var5];
                            if (client.field511 == 2 && var179 < client.field287) {
                                field712[var6++] = client.field512[var179].field240;
                                field712[var6++] = client.field512[var179].field229;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3602) {
                            var5--;
                            int var180 = field709[var5];
                            if (client.field511 == 2 && var180 < client.field287) {
                                field709[var5++] = client.field512[var180].field230;
                                continue;
                            }
                            field709[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3603) {
                            var5--;
                            int var181 = field709[var5];
                            if (client.field511 == 2 && var181 < client.field287) {
                                field709[var5++] = client.field512[var181].field232;
                                continue;
                            }
                            field709[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3604) {
                            var6--;
                            String var182 = field712[var6];
                            var5--;
                            int var183 = field709[var5];
                            client.field402.method2361(177);
                            client.field402.method2102(class107.method853(var182) + 1);
                            client.field402.method2107(var182);
                            client.field402.method2197(var183);
                            continue;
                        }
                        if (var392 == 3605) {
                            var6--;
                            String var184 = field712[var6];
                            if (var184 == null) {
                                continue;
                            }
                            if ((client.field287 < 200 || client.field387 == 1) && client.field287 < 400) {
                                String var185 = class200.method2415(var184, Statics.field177);
                                if (var185 == null) {
                                    continue;
                                }
                                for (int var186 = 0; var186 < client.field287; var186++) {
                                    class16 var187 = client.field512[var186];
                                    String var188 = class200.method2415(var187.field240, Statics.field177);
                                    if (var188 != null && var188.equals(var185)) {
                                        class10.method2658(30, "", var184 + class142.field2301);
                                        continue label2498;
                                    }
                                    if (var187.field229 != null) {
                                        String var189 = class200.method2415(var187.field229, Statics.field177);
                                        if (var189 != null && var189.equals(var185)) {
                                            class10.method2658(30, "", var184 + class142.field2301);
                                            continue label2498;
                                        }
                                    }
                                }
                                for (int var190 = 0; var190 < client.field466; var190++) {
                                    class8 var191 = client.field427[var190];
                                    String var192 = class200.method2415(var191.field140, Statics.field177);
                                    if (var192 != null && var192.equals(var185)) {
                                        class10.method2658(30, "", class142.field2306 + var184 + class142.field2307);
                                        continue label2498;
                                    }
                                    if (var191.field133 != null) {
                                        String var193 = class200.method2415(var191.field133, Statics.field177);
                                        if (var193 != null && var193.equals(var185)) {
                                            class10.method2658(30, "", class142.field2306 + var184 + class142.field2307);
                                            continue label2498;
                                        }
                                    }
                                }
                                if (class200.method2415(Statics.field183.field44, Statics.field177).equals(var185)) {
                                    class10.method2658(30, "", class142.field2304);
                                } else {
                                    client.field402.method2361(92);
                                    client.field402.method2102(class107.method853(var184));
                                    client.field402.method2107(var184);
                                }
                                continue;
                            }
                            class10.method2658(30, "", class142.field2300);
                            continue;
                        }
                        if (var392 == 3606) {
                            var6--;
                            String var194 = field712[var6];
                            if (var194 == null) {
                                continue;
                            }
                            String var195 = class200.method2415(var194, Statics.field177);
                            if (var195 == null) {
                                continue;
                            }
                            int var196 = 0;
                            while (true) {
                                if (var196 >= client.field287) {
                                    continue label2498;
                                }
                                class16 var197 = client.field512[var196];
                                String var198 = var197.field240;
                                String var199 = class200.method2415(var198, Statics.field177);
                                boolean var200;
                                if (var194 == null || var198 == null) {
                                    var200 = false;
                                } else if (var194.startsWith("#") || var198.startsWith("#")) {
                                    var200 = var194.equals(var198);
                                } else {
                                    var200 = var195.equals(var199);
                                }
                                if (var200) {
                                    client.field287--;
                                    for (int var201 = var196; var201 < client.field287; var201++) {
                                        client.field512[var201] = client.field512[var201 + 1];
                                    }
                                    client.field458 = client.field446;
                                    client.field402.method2361(143);
                                    client.field402.method2102(class107.method853(var194));
                                    client.field402.method2107(var194);
                                    continue label2498;
                                }
                                var196++;
                            }
                        }
                        if (var392 == 3607) {
                            var6--;
                            String var202 = field712[var6];
                            client.method2403(var202, false);
                            continue;
                        }
                        if (var392 == 3608) {
                            var6--;
                            String var203 = field712[var6];
                            client.method74(var203);
                            continue;
                        }
                        if (var392 == 3609) {
                            var6--;
                            String var204 = field712[var6];
                            if (var204.startsWith(class2.method754(0)) || var204.startsWith(class2.method754(1))) {
                                var204 = var204.substring(7);
                            }
                            field709[var5++] = client.method2690(var204, false) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3611) {
                            if (client.field302 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class198.method790(client.field302);
                            }
                            continue;
                        }
                        if (var392 == 3612) {
                            if (client.field302 == null) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = Statics.field1106;
                            }
                            continue;
                        }
                        if (var392 == 3613) {
                            var5--;
                            int var205 = field709[var5];
                            if (client.field302 != null && var205 < Statics.field1106) {
                                field712[var6++] = Statics.field1082[var205].field569;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3614) {
                            var5--;
                            int var206 = field709[var5];
                            if (client.field302 != null && var206 < Statics.field1106) {
                                field709[var5++] = Statics.field1082[var206].field571;
                                continue;
                            }
                            field709[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3615) {
                            var5--;
                            int var207 = field709[var5];
                            if (client.field302 != null && var207 < Statics.field1106) {
                                field709[var5++] = Statics.field1082[var207].field572;
                                continue;
                            }
                            field709[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3616) {
                            field709[var5++] = Statics.field99;
                            continue;
                        }
                        if (var392 == 3617) {
                            var6--;
                            String var208 = field712[var6];
                            if (Statics.field1082 != null) {
                                client.field402.method2361(128);
                                client.field402.method2102(class107.method853(var208));
                                client.field402.method2107(var208);
                            }
                            continue;
                        }
                        if (var392 == 3618) {
                            field709[var5++] = Statics.field1895;
                            continue;
                        }
                        if (var392 == 3619) {
                            var6--;
                            String var209 = field712[var6];
                            if (!var209.equals("")) {
                                client.field402.method2361(207);
                                client.field402.method2102(class107.method853(var209));
                                client.field402.method2107(var209);
                            }
                            continue;
                        }
                        if (var392 == 3620) {
                            client.field402.method2361(207);
                            client.field402.method2102(0);
                            continue;
                        }
                        if (var392 == 3621) {
                            if (client.field511 == 0) {
                                field709[var5++] = -1;
                            } else {
                                field709[var5++] = client.field466;
                            }
                            continue;
                        }
                        if (var392 == 3622) {
                            var5--;
                            int var210 = field709[var5];
                            if (client.field511 != 0 && var210 < client.field466) {
                                field712[var6++] = client.field427[var210].field140;
                                field712[var6++] = client.field427[var210].field133;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3623) {
                            var6--;
                            String var211 = field712[var6];
                            if (var211.startsWith(class2.method754(0)) || var211.startsWith(class2.method754(1))) {
                                var211 = var211.substring(7);
                            }
                            field709[var5++] = client.method1388(var211) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3624) {
                            var5--;
                            int var212 = field709[var5];
                            if (Statics.field1082 != null && var212 < Statics.field1106 && Statics.field1082[var212].field569.equalsIgnoreCase(Statics.field183.field44)) {
                                field709[var5++] = 1;
                                continue;
                            }
                            field709[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3625) {
                            if (client.field484 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class198.method790(client.field484);
                            }
                            continue;
                        }
                    } else if (var392 < 4100) {
                        if (var392 == 4000) {
                            var5 -= 2;
                            int var213 = field709[var5];
                            int var214 = field709[var5 + 1];
                            field709[var5++] = var213 + var214;
                            continue;
                        }
                        if (var392 == 4001) {
                            var5 -= 2;
                            int var215 = field709[var5];
                            int var216 = field709[var5 + 1];
                            field709[var5++] = var215 - var216;
                            continue;
                        }
                        if (var392 == 4002) {
                            var5 -= 2;
                            int var217 = field709[var5];
                            int var218 = field709[var5 + 1];
                            field709[var5++] = var217 * var218;
                            continue;
                        }
                        if (var392 == 4003) {
                            var5 -= 2;
                            int var219 = field709[var5];
                            int var220 = field709[var5 + 1];
                            field709[var5++] = var219 / var220;
                            continue;
                        }
                        if (var392 == 4004) {
                            var5--;
                            int var221 = field709[var5];
                            field709[var5++] = (int) (Math.random() * (double) var221);
                            continue;
                        }
                        if (var392 == 4005) {
                            var5--;
                            int var222 = field709[var5];
                            field709[var5++] = (int) (Math.random() * (double) (var222 + 1));
                            continue;
                        }
                        if (var392 == 4006) {
                            var5 -= 5;
                            int var223 = field709[var5];
                            int var224 = field709[var5 + 1];
                            int var225 = field709[var5 + 2];
                            int var226 = field709[var5 + 3];
                            int var227 = field709[var5 + 4];
                            field709[var5++] = (var224 - var223) * (var227 - var225) / (var226 - var225) + var223;
                            continue;
                        }
                        if (var392 == 4007) {
                            var5 -= 2;
                            int var228 = field709[var5];
                            int var229 = field709[var5 + 1];
                            field709[var5++] = var228 * var229 / 100 + var228;
                            continue;
                        }
                        if (var392 == 4008) {
                            var5 -= 2;
                            int var230 = field709[var5];
                            int var231 = field709[var5 + 1];
                            field709[var5++] = var230 | 0x1 << var231;
                            continue;
                        }
                        if (var392 == 4009) {
                            var5 -= 2;
                            int var232 = field709[var5];
                            int var233 = field709[var5 + 1];
                            field709[var5++] = var232 & -1 - (0x1 << var233);
                            continue;
                        }
                        if (var392 == 4010) {
                            var5 -= 2;
                            int var234 = field709[var5];
                            int var235 = field709[var5 + 1];
                            field709[var5++] = (var234 & 0x1 << var235) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var392 == 4011) {
                            var5 -= 2;
                            int var236 = field709[var5];
                            int var237 = field709[var5 + 1];
                            field709[var5++] = var236 % var237;
                            continue;
                        }
                        if (var392 == 4012) {
                            var5 -= 2;
                            int var238 = field709[var5];
                            int var239 = field709[var5 + 1];
                            if (var238 == 0) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = (int) Math.pow((double) var238, (double) var239);
                            }
                            continue;
                        }
                        if (var392 == 4013) {
                            var5 -= 2;
                            int var240 = field709[var5];
                            int var241 = field709[var5 + 1];
                            if (var240 == 0) {
                                field709[var5++] = 0;
                            } else if (var241 == 0) {
                                field709[var5++] = Integer.MAX_VALUE;
                            } else {
                                field709[var5++] = (int) Math.pow((double) var240, 1.0D / (double) var241);
                            }
                            continue;
                        }
                        if (var392 == 4014) {
                            var5 -= 2;
                            int var242 = field709[var5];
                            int var243 = field709[var5 + 1];
                            field709[var5++] = var242 & var243;
                            continue;
                        }
                        if (var392 == 4015) {
                            var5 -= 2;
                            int var244 = field709[var5];
                            int var245 = field709[var5 + 1];
                            field709[var5++] = var244 | var245;
                            continue;
                        }
                    } else if (var392 < 4200) {
                        if (var392 == 4100) {
                            var6--;
                            String var246 = field712[var6];
                            var5--;
                            int var247 = field709[var5];
                            field712[var6++] = var246 + var247;
                            continue;
                        }
                        if (var392 == 4101) {
                            var6 -= 2;
                            String var248 = field712[var6];
                            String var249 = field712[var6 + 1];
                            field712[var6++] = var248 + var249;
                            continue;
                        }
                        if (var392 == 4102) {
                            var6--;
                            String var250 = field712[var6];
                            var5--;
                            int var251 = field709[var5];
                            field712[var6++] = var250 + class199.method511(var251, true);
                            continue;
                        }
                        if (var392 == 4103) {
                            var6--;
                            String var252 = field712[var6];
                            field712[var6++] = var252.toLowerCase();
                            continue;
                        }
                        if (var392 == 4104) {
                            var5--;
                            int var253 = field709[var5];
                            long var254 = ((long) var253 + 11745L) * 86400000L;
                            field708.setTime(new Date(var254));
                            int var256 = field708.get(5);
                            int var257 = field708.get(2);
                            int var258 = field708.get(1);
                            field712[var6++] = var256 + "-" + field711[var257] + "-" + var258;
                            continue;
                        }
                        if (var392 == 4105) {
                            var6 -= 2;
                            String var259 = field712[var6];
                            String var260 = field712[var6 + 1];
                            if (Statics.field183.field41 != null && Statics.field183.field41.field2665) {
                                field712[var6++] = var260;
                                continue;
                            }
                            field712[var6++] = var259;
                            continue;
                        }
                        if (var392 == 4106) {
                            var5--;
                            int var261 = field709[var5];
                            field712[var6++] = Integer.toString(var261);
                            continue;
                        }
                        if (var392 == 4107) {
                            var6 -= 2;
                            int[] var262 = field709;
                            int var263 = var5++;
                            String var264 = field712[var6];
                            String var265 = field712[var6 + 1];
                            int var266 = client.field267;
                            int var267 = var264.length();
                            int var268 = var265.length();
                            int var269 = 0;
                            int var270 = 0;
                            byte var271 = 0;
                            byte var272 = 0;
                            int var273;
                            label2331: while (true) {
                                if (var269 - var271 >= var267 && var270 - var272 >= var268) {
                                    int var284 = Math.min(var267, var268);
                                    for (int var285 = 0; var285 < var284; var285++) {
                                        char var288 = var264.charAt(var285);
                                        char var289 = var265.charAt(var285);
                                        if (var288 != var289 && Character.toUpperCase(var288) != Character.toUpperCase(var289)) {
                                            char var290 = Character.toLowerCase(var288);
                                            char var291 = Character.toLowerCase(var289);
                                            if (var290 != var291) {
                                                var273 = class202.method84(var290, var266) - class202.method84(var291, var266);
                                                break label2331;
                                            }
                                        }
                                    }
                                    int var292 = var267 - var268;
                                    if (var292 == 0) {
                                        for (int var293 = 0; var293 < var284; var293++) {
                                            char var294 = var264.charAt(var293);
                                            char var295 = var265.charAt(var293);
                                            if (var294 != var295) {
                                                var273 = class202.method84(var294, var266) - class202.method84(var295, var266);
                                                break label2331;
                                            }
                                        }
                                        var273 = 0;
                                    } else {
                                        var273 = var292;
                                    }
                                    break;
                                }
                                if (var269 - var271 >= var267) {
                                    var273 = -1;
                                    break;
                                }
                                if (var270 - var272 >= var268) {
                                    var273 = 1;
                                    break;
                                }
                                char var274;
                                if (var271 == 0) {
                                    var274 = var264.charAt(var269++);
                                } else {
                                    var274 = (char) var271;
                                    boolean var275 = false;
                                }
                                char var276;
                                if (var272 == 0) {
                                    var276 = var265.charAt(var270++);
                                } else {
                                    var276 = (char) var272;
                                    boolean var277 = false;
                                }
                                byte var278;
                                if (var274 == 198) {
                                    var278 = 69;
                                } else if (var274 == 230) {
                                    var278 = 101;
                                } else if (var274 == 223) {
                                    var278 = 115;
                                } else if (var274 == 338) {
                                    var278 = 69;
                                } else if (var274 == 339) {
                                    var278 = 101;
                                } else {
                                    var278 = 0;
                                }
                                var271 = var278;
                                byte var279;
                                if (var276 == 198) {
                                    var279 = 69;
                                } else if (var276 == 230) {
                                    var279 = 101;
                                } else if (var276 == 223) {
                                    var279 = 115;
                                } else if (var276 == 338) {
                                    var279 = 69;
                                } else if (var276 == 339) {
                                    var279 = 101;
                                } else {
                                    var279 = 0;
                                }
                                var272 = var279;
                                char var280 = class202.method2066(var274, var266);
                                char var281 = class202.method2066(var276, var266);
                                if (var280 != var281 && Character.toUpperCase(var280) != Character.toUpperCase(var281)) {
                                    char var282 = Character.toLowerCase(var280);
                                    char var283 = Character.toLowerCase(var281);
                                    if (var282 != var283) {
                                        var273 = class202.method84(var282, var266) - class202.method84(var283, var266);
                                        break;
                                    }
                                }
                            }
                            byte var297;
                            if (var273 > 0) {
                                var297 = 1;
                            } else if (var273 < 0) {
                                var297 = -1;
                            } else {
                                var297 = 0;
                            }
                            var262[var263] = var297;
                            continue;
                        }
                        if (var392 == 4108) {
                            var6--;
                            String var298 = field712[var6];
                            var5 -= 2;
                            int var299 = field709[var5];
                            int var300 = field709[var5 + 1];
                            byte[] var301 = Statics.field620.method2695(var300, 0);
                            class193 var302 = new class193(var301);
                            field709[var5++] = var302.method3306(var298, var299);
                            continue;
                        }
                        if (var392 == 4109) {
                            var6--;
                            String var303 = field712[var6];
                            var5 -= 2;
                            int var304 = field709[var5];
                            int var305 = field709[var5 + 1];
                            byte[] var306 = Statics.field620.method2695(var305, 0);
                            class193 var307 = new class193(var306);
                            field709[var5++] = var307.method3361(var303, var304);
                            continue;
                        }
                        if (var392 == 4110) {
                            var6 -= 2;
                            String var308 = field712[var6];
                            String var309 = field712[var6 + 1];
                            var5--;
                            if (field709[var5] == 1) {
                                field712[var6++] = var308;
                            } else {
                                field712[var6++] = var309;
                            }
                            continue;
                        }
                        if (var392 == 4111) {
                            var6--;
                            String var310 = field712[var6];
                            field712[var6++] = class192.method3380(var310);
                            continue;
                        }
                        if (var392 == 4112) {
                            var6--;
                            String var311 = field712[var6];
                            var5--;
                            int var312 = field709[var5];
                            field712[var6++] = var311 + (char) var312;
                            continue;
                        }
                        if (var392 == 4113) {
                            var5--;
                            int var313 = field709[var5];
                            field709[var5++] = class199.method2513((char) var313) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4114) {
                            var5--;
                            int var314 = field709[var5];
                            int[] var315 = field709;
                            int var316 = var5++;
                            char var317 = (char) var314;
                            boolean var318 = var317 >= '0' && var317 <= '9' || var317 >= 'A' && var317 <= 'Z' || var317 >= 'a' && var317 <= 'z';
                            var315[var316] = var318 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4115) {
                            var5--;
                            int var319 = field709[var5];
                            int[] var320 = field709;
                            int var321 = var5++;
                            char var322 = (char) var319;
                            boolean var323 = var322 >= 'A' && var322 <= 'Z' || var322 >= 'a' && var322 <= 'z';
                            var320[var321] = var323 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4116) {
                            var5--;
                            int var324 = field709[var5];
                            int[] var325 = field709;
                            int var326 = var5++;
                            char var327 = (char) var324;
                            boolean var328 = var327 >= '0' && var327 <= '9';
                            var325[var326] = var328 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4117) {
                            var6--;
                            String var329 = field712[var6];
                            if (var329 == null) {
                                field709[var5++] = 0;
                            } else {
                                field709[var5++] = var329.length();
                            }
                            continue;
                        }
                        if (var392 == 4118) {
                            var6--;
                            String var330 = field712[var6];
                            var5 -= 2;
                            int var331 = field709[var5];
                            int var332 = field709[var5 + 1];
                            field712[var6++] = var330.substring(var331, var332);
                            continue;
                        }
                        if (var392 == 4119) {
                            var6--;
                            String var333 = field712[var6];
                            StringBuilder var334 = new StringBuilder(var333.length());
                            boolean var335 = false;
                            for (int var336 = 0; var336 < var333.length(); var336++) {
                                char var337 = var333.charAt(var336);
                                if (var337 == '<') {
                                    var335 = true;
                                } else if (var337 == '>') {
                                    var335 = false;
                                } else if (!var335) {
                                    var334.append(var337);
                                }
                            }
                            field712[var6++] = var334.toString();
                            continue;
                        }
                        if (var392 == 4120) {
                            var6--;
                            String var338 = field712[var6];
                            var5--;
                            int var339 = field709[var5];
                            field709[var5++] = var338.indexOf(var339);
                            continue;
                        }
                        if (var392 == 4121) {
                            var6 -= 2;
                            String var340 = field712[var6];
                            String var341 = field712[var6 + 1];
                            var5--;
                            int var342 = field709[var5];
                            field709[var5++] = var340.indexOf(var341, var342);
                            continue;
                        }
                    } else if (var392 < 4300) {
                        if (var392 == 4200) {
                            var5--;
                            int var343 = field709[var5];
                            field712[var6++] = class45.method28(var343).field1000;
                            continue;
                        }
                        if (var392 == 4201) {
                            var5 -= 2;
                            int var344 = field709[var5];
                            int var345 = field709[var5 + 1];
                            class45 var346 = class45.method28(var344);
                            if (var345 >= 1 && var345 <= 5 && var346.field1014[var345 - 1] != null) {
                                field712[var6++] = var346.field1014[var345 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 4202) {
                            var5 -= 2;
                            int var347 = field709[var5];
                            int var348 = field709[var5 + 1];
                            class45 var349 = class45.method28(var347);
                            if (var348 >= 1 && var348 <= 5 && var349.field1015[var348 - 1] != null) {
                                field712[var6++] = var349.field1015[var348 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 4203) {
                            var5--;
                            int var350 = field709[var5];
                            field709[var5++] = class45.method28(var350).field1028;
                            continue;
                        }
                        if (var392 == 4204) {
                            var5--;
                            int var351 = field709[var5];
                            field709[var5++] = class45.method28(var351).field1011 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4205) {
                            var5--;
                            int var352 = field709[var5];
                            class45 var353 = class45.method28(var352);
                            if (var353.field1031 == -1 && var353.field1019 >= 0) {
                                field709[var5++] = var353.field1019;
                                continue;
                            }
                            field709[var5++] = var352;
                            continue;
                        }
                        if (var392 == 4206) {
                            var5--;
                            int var354 = field709[var5];
                            class45 var355 = class45.method28(var354);
                            if (var355.field1031 >= 0 && var355.field1019 >= 0) {
                                field709[var5++] = var355.field1019;
                                continue;
                            }
                            field709[var5++] = var354;
                            continue;
                        }
                        if (var392 == 4207) {
                            var5--;
                            int var356 = field709[var5];
                            field709[var5++] = class45.method28(var356).field1038 ? 1 : 0;
                            continue;
                        }
                    } else if (var392 < 5100) {
                        if (var392 == 5000) {
                            field709[var5++] = client.field475;
                            continue;
                        }
                        if (var392 == 5001) {
                            var5 -= 3;
                            client.field475 = field709[var5];
                            Statics.field697 = class117.method859(field709[var5 + 1]);
                            if (Statics.field697 == null) {
                                Statics.field697 = class117.field1911;
                            }
                            client.field476 = field709[var5 + 2];
                            client.field402.method2361(80);
                            client.field402.method2102(client.field475);
                            client.field402.method2102(Statics.field697.field1908);
                            client.field402.method2102(client.field476);
                            continue;
                        }
                        if (var392 == 5002) {
                            var6--;
                            String var357 = field712[var6];
                            var5 -= 2;
                            int var358 = field709[var5];
                            int var359 = field709[var5 + 1];
                            client.field402.method2361(205);
                            client.field402.method2102(class107.method853(var357) + 2);
                            client.field402.method2107(var357);
                            client.field402.method2102(var358 - 1);
                            client.field402.method2102(var359);
                            continue;
                        }
                        if (var392 == 5003) {
                            var5 -= 2;
                            int var360 = field709[var5];
                            int var361 = field709[var5 + 1];
                            class24 var362 = (class24) class10.field164.get(var360);
                            class31 var363 = var362.method495(var361);
                            if (var363 == null) {
                                field709[var5++] = -1;
                                field709[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field709[var5++] = var363.field696;
                                field709[var5++] = var363.field702;
                                field712[var6++] = var363.field704 == null ? "" : var363.field704;
                                field712[var6++] = var363.field700 == null ? "" : var363.field700;
                                field712[var6++] = var363.field701 == null ? "" : var363.field701;
                            }
                            continue;
                        }
                        if (var392 == 5004) {
                            var5--;
                            int var365 = field709[var5];
                            class31 var366 = class10.method590(var365);
                            if (var366 == null) {
                                field709[var5++] = -1;
                                field709[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field709[var5++] = var366.field698;
                                field709[var5++] = var366.field702;
                                field712[var6++] = var366.field704 == null ? "" : var366.field704;
                                field712[var6++] = var366.field700 == null ? "" : var366.field700;
                                field712[var6++] = var366.field701 == null ? "" : var366.field701;
                            }
                            continue;
                        }
                        if (var392 == 5005) {
                            if (Statics.field697 == null) {
                                field709[var5++] = -1;
                            } else {
                                field709[var5++] = Statics.field697.field1908;
                            }
                            continue;
                        }
                        if (var392 == 5008) {
                            var6--;
                            String var367 = field712[var6];
                            var5--;
                            int var368 = field709[var5];
                            String var369 = var367.toLowerCase();
                            byte var370 = 0;
                            if (var369.startsWith(class142.field2310)) {
                                var370 = 0;
                                var367 = var367.substring(class142.field2310.length());
                            } else if (var369.startsWith(class142.field2171)) {
                                var370 = 1;
                                var367 = var367.substring(class142.field2171.length());
                            } else if (var369.startsWith(class142.field2314)) {
                                var370 = 2;
                                var367 = var367.substring(class142.field2314.length());
                            } else if (var369.startsWith(class142.field2316)) {
                                var370 = 3;
                                var367 = var367.substring(class142.field2316.length());
                            } else if (var369.startsWith(class142.field2318)) {
                                var370 = 4;
                                var367 = var367.substring(class142.field2318.length());
                            } else if (var369.startsWith(class142.field2213)) {
                                var370 = 5;
                                var367 = var367.substring(class142.field2213.length());
                            } else if (var369.startsWith(class142.field2322)) {
                                var370 = 6;
                                var367 = var367.substring(class142.field2322.length());
                            } else if (var369.startsWith(class142.field2258)) {
                                var370 = 7;
                                var367 = var367.substring(class142.field2258.length());
                            } else if (var369.startsWith(class142.field2326)) {
                                var370 = 8;
                                var367 = var367.substring(class142.field2326.length());
                            } else if (var369.startsWith(class142.field2242)) {
                                var370 = 9;
                                var367 = var367.substring(class142.field2242.length());
                            } else if (var369.startsWith(class142.field2159)) {
                                var370 = 10;
                                var367 = var367.substring(class142.field2159.length());
                            } else if (var369.startsWith(class142.field2332)) {
                                var370 = 11;
                                var367 = var367.substring(class142.field2332.length());
                            } else if (client.field267 != 0) {
                                if (var369.startsWith(class142.field2192)) {
                                    var370 = 0;
                                    var367 = var367.substring(class142.field2192.length());
                                } else if (var369.startsWith(class142.field2313)) {
                                    var370 = 1;
                                    var367 = var367.substring(class142.field2313.length());
                                } else if (var369.startsWith(class142.field2315)) {
                                    var370 = 2;
                                    var367 = var367.substring(class142.field2315.length());
                                } else if (var369.startsWith(class142.field2317)) {
                                    var370 = 3;
                                    var367 = var367.substring(class142.field2317.length());
                                } else if (var369.startsWith(class142.field2319)) {
                                    var370 = 4;
                                    var367 = var367.substring(class142.field2319.length());
                                } else if (var369.startsWith(class142.field2321)) {
                                    var370 = 5;
                                    var367 = var367.substring(class142.field2321.length());
                                } else if (var369.startsWith(class142.field2309)) {
                                    var370 = 6;
                                    var367 = var367.substring(class142.field2309.length());
                                } else if (var369.startsWith(class142.field2325)) {
                                    var370 = 7;
                                    var367 = var367.substring(class142.field2325.length());
                                } else if (var369.startsWith(class142.field2380)) {
                                    var370 = 8;
                                    var367 = var367.substring(class142.field2380.length());
                                } else if (var369.startsWith(class142.field2188)) {
                                    var370 = 9;
                                    var367 = var367.substring(class142.field2188.length());
                                } else if (var369.startsWith(class142.field2331)) {
                                    var370 = 10;
                                    var367 = var367.substring(class142.field2331.length());
                                } else if (var369.startsWith(class142.field2333)) {
                                    var370 = 11;
                                    var367 = var367.substring(class142.field2333.length());
                                }
                            }
                            String var371 = var367.toLowerCase();
                            byte var372 = 0;
                            if (var371.startsWith(class142.field2334)) {
                                var372 = 1;
                                var367 = var367.substring(class142.field2334.length());
                            } else if (var371.startsWith(class142.field2336)) {
                                var372 = 2;
                                var367 = var367.substring(class142.field2336.length());
                            } else if (var371.startsWith(class142.field2338)) {
                                var372 = 3;
                                var367 = var367.substring(class142.field2338.length());
                            } else if (var371.startsWith(class142.field2340)) {
                                var372 = 4;
                                var367 = var367.substring(class142.field2340.length());
                            } else if (var371.startsWith(class142.field2134)) {
                                var372 = 5;
                                var367 = var367.substring(class142.field2134.length());
                            } else if (client.field267 != 0) {
                                if (var371.startsWith(class142.field2246)) {
                                    var372 = 1;
                                    var367 = var367.substring(class142.field2246.length());
                                } else if (var371.startsWith(class142.field2287)) {
                                    var372 = 2;
                                    var367 = var367.substring(class142.field2287.length());
                                } else if (var371.startsWith(class142.field2339)) {
                                    var372 = 3;
                                    var367 = var367.substring(class142.field2339.length());
                                } else if (var371.startsWith(class142.field2187)) {
                                    var372 = 4;
                                    var367 = var367.substring(class142.field2187.length());
                                } else if (var371.startsWith(class142.field2343)) {
                                    var372 = 5;
                                    var367 = var367.substring(class142.field2343.length());
                                }
                            }
                            client.field402.method2361(151);
                            client.field402.method2102(0);
                            int var373 = client.field402.field1844;
                            client.field402.method2102(var368);
                            client.field402.method2102(var370);
                            client.field402.method2102(var372);
                            class191.method2925(client.field402, var367);
                            client.field402.method2301(client.field402.field1844 - var373);
                            continue;
                        }
                        if (var392 == 5009) {
                            var6 -= 2;
                            String var374 = field712[var6];
                            String var375 = field712[var6 + 1];
                            client.field402.method2361(95);
                            client.field402.method2223(0);
                            int var376 = client.field402.field1844;
                            client.field402.method2107(var374);
                            class191.method2925(client.field402, var375);
                            client.field402.method2252(client.field402.field1844 - var376);
                            continue;
                        }
                        if (var392 == 5015) {
                            String var377;
                            if (Statics.field183 == null || Statics.field183.field44 == null) {
                                var377 = "";
                            } else {
                                var377 = Statics.field183.field44;
                            }
                            field712[var6++] = var377;
                            continue;
                        }
                        if (var392 == 5016) {
                            field709[var5++] = client.field476;
                            continue;
                        }
                        if (var392 == 5017) {
                            var5--;
                            int var378 = field709[var5];
                            field709[var5++] = class10.method816(var378);
                            continue;
                        }
                        if (var392 == 5018) {
                            var5--;
                            int var379 = field709[var5];
                            field709[var5++] = class10.method1047(var379);
                            continue;
                        }
                        if (var392 == 5019) {
                            var5--;
                            int var380 = field709[var5];
                            int[] var381 = field709;
                            int var382 = var5++;
                            class31 var383 = (class31) class10.field157.method3177((long) var380);
                            int var384;
                            if (var383 == null) {
                                var384 = -1;
                            } else if (class10.field161.field2851 == var383.field2856) {
                                var384 = -1;
                            } else {
                                var384 = ((class31) var383.field2856).field696;
                            }
                            var381[var382] = var384;
                            continue;
                        }
                        if (var392 == 5020) {
                            var6--;
                            String var385 = field712[var6];
                            if (var385.equalsIgnoreCase("toggleroof")) {
                                Statics.field75.field145 = !Statics.field75.field145;
                                class9.method2044();
                                if (Statics.field75.field145) {
                                    class10.method2658(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method2658(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field429 >= 2) {
                                if (var385.equalsIgnoreCase("fpson")) {
                                    client.field277 = true;
                                }
                                if (var385.equalsIgnoreCase("fpsoff")) {
                                    client.field277 = false;
                                }
                                if (var385.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var385.equalsIgnoreCase("clientdrop")) {
                                    if (client.field309 > 0) {
                                        client.method2779();
                                    } else {
                                        client.method592(40);
                                        Statics.field195 = Statics.field156;
                                        Statics.field156 = null;
                                    }
                                }
                                if (var385.equalsIgnoreCase("errortest") && client.field265 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field402.method2361(45);
                            client.field402.method2102(var385.length() + 1);
                            client.field402.method2107(var385);
                            continue;
                        }
                    }
                }
                if (var392 >= 5600 || var392 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var386 = field709[var5];
                int var387 = field709[var5 + 1];
                if (!client.field504) {
                    client.field344 = var386;
                    client.field345 = var387;
                }
            }
        } catch (Exception var391) {
            StringBuilder var389 = new StringBuilder(30);
            var389.append("").append(var4.field2867).append(" ");
            for (int var390 = field713 - 1; var390 >= 0; var390--) {
                var389.append("").append(field714[var390].field198.field2867).append(" ");
            }
            var389.append("").append(var10);
            class135.method457(var389.toString(), var391);
        }
    }

    @ObfuscatedName("b.i(IB)V")
    public static void method73(int arg0) {
        if (arg0 == -1 || !class152.method692(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2582[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2589 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field12 = var3.field2589;
                method83(var4, 2000000);
            }
        }
    }
}
