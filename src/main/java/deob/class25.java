package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("j")
public class class25 {

    @ObfuscatedName("j.p")
    public static int[] field395 = new int[5];

    @ObfuscatedName("j.i")
    public static int[][] field392 = new int[5][5000];

    @ObfuscatedName("j.v")
    public static int[] field393 = new int[1000];

    @ObfuscatedName("j.l")
    public static String[] field406 = new String[1000];

    @ObfuscatedName("j.m")
    public static int field407 = 0;

    @ObfuscatedName("j.g")
    public static class17[] field396 = new class17[50];

    @ObfuscatedName("j.b")
    public static Calendar field399 = Calendar.getInstance();

    @ObfuscatedName("j.d")
    public static final String[] field391 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("w.z(Lz;B)V")
    public static void method226(class1 arg0) {
        Object[] var1 = arg0.field13;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method2373(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field78;
        int[] var8 = var3.field77;
        byte var9 = -1;
        field407 = 0;
        try {
            Statics.field404 = new int[var3.field73];
            int var10 = 0;
            Statics.field400 = new String[var3.field74];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field15 == null ? -1 : arg0.field15.field2514;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field15 == null ? -1 : arg0.field15.field2534;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2514;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2534;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field11;
                    }
                    Statics.field404[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field400[var11++] = var14;
                }
            }
            int var15 = 0;
            label2350: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var369 = var7[var6];
                if (var369 < 100) {
                    if (var369 == 0) {
                        field393[var4++] = var8[var6];
                        continue;
                    }
                    if (var369 == 1) {
                        int var16 = var8[var6];
                        field393[var4++] = class157.field2634[var16];
                        continue;
                    }
                    if (var369 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class157.field2634[var17] = field393[var4];
                        continue;
                    }
                    if (var369 == 3) {
                        field406[var5++] = var3.field72[var6];
                        continue;
                    }
                    if (var369 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var369 == 7) {
                        var4 -= 2;
                        if (field393[var4 + 1] != field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 8) {
                        var4 -= 2;
                        if (field393[var4 + 1] == field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 9) {
                        var4 -= 2;
                        if (field393[var4] < field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 10) {
                        var4 -= 2;
                        if (field393[var4] > field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 21) {
                        if (field407 == 0) {
                            return;
                        }
                        class17 var18 = field396[--field407];
                        var3 = var18.field267;
                        var7 = var3.field78;
                        var8 = var3.field77;
                        var6 = var18.field264;
                        Statics.field404 = var18.field265;
                        Statics.field400 = var18.field270;
                        continue;
                    }
                    if (var369 == 25) {
                        int var19 = var8[var6];
                        field393[var4++] = class157.method3063(var19);
                        continue;
                    }
                    if (var369 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field393[var4];
                        class37 var22 = (class37) class37.field954.method3240((long) var20);
                        class37 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field961.method2951(14, var20);
                            class37 var25 = new class37();
                            if (var24 != null) {
                                var25.method808(new class126(var24));
                            }
                            class37.field954.method3237(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field952;
                        int var28 = var23.field953;
                        int var29 = var23.field950;
                        int var30 = class157.field2633[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class157.field2634[var27] = class157.field2634[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var369 == 31) {
                        var4 -= 2;
                        if (field393[var4] <= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 32) {
                        var4 -= 2;
                        if (field393[var4] >= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var369 == 33) {
                        field393[var4++] = Statics.field404[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var369 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field404[var10001] = field393[var4];
                        continue;
                    }
                    if (var369 == 35) {
                        field406[var5++] = Statics.field400[var8[var6]];
                        continue;
                    }
                    if (var369 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field400[var10001] = field406[var5];
                        continue;
                    }
                    if (var369 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String var33 = class146.method2422(field406, var5, var32);
                        field406[var5++] = var33;
                        continue;
                    }
                    if (var369 == 38) {
                        var4--;
                        continue;
                    }
                    if (var369 == 39) {
                        var5--;
                        continue;
                    }
                    if (var369 == 40) {
                        int var34 = var8[var6];
                        class5 var35 = class5.method2373(var34);
                        int[] var36 = new int[var35.field73];
                        String[] var37 = new String[var35.field74];
                        for (int var38 = 0; var38 < var35.field75; var38++) {
                            var36[var38] = field393[var4 - var35.field75 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field76; var39++) {
                            var37[var39] = field406[var5 - var35.field76 + var39];
                        }
                        var4 -= var35.field75;
                        var5 -= var35.field76;
                        class17 var40 = new class17();
                        var40.field267 = var3;
                        var40.field264 = var6;
                        var40.field265 = Statics.field404;
                        var40.field270 = Statics.field400;
                        field396[++field407 - 1] = var40;
                        var3 = var35;
                        var7 = var35.field78;
                        var8 = var35.field77;
                        var6 = -1;
                        Statics.field404 = var36;
                        Statics.field400 = var37;
                        continue;
                    }
                    if (var369 == 42) {
                        field393[var4++] = client.field668[var8[var6]];
                        continue;
                    }
                    if (var369 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field668[var10001] = field393[var4];
                        continue;
                    }
                    if (var369 == 44) {
                        int var41 = var8[var6] >> 16;
                        int var42 = var8[var6] & 0xFFFF;
                        var4--;
                        int var43 = field393[var4];
                        if (var43 >= 0 && var43 <= 5000) {
                            field395[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2350;
                                }
                                field392[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var369 == 45) {
                        int var46 = var8[var6];
                        var4--;
                        int var47 = field393[var4];
                        if (var47 >= 0 && var47 < field395[var46]) {
                            field393[var4++] = field392[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var369 == 46) {
                        int var48 = var8[var6];
                        var4 -= 2;
                        int var49 = field393[var4];
                        if (var49 >= 0 && var49 < field395[var48]) {
                            field392[var48][var49] = field393[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var369 == 47) {
                        String var50 = client.field568[var8[var6]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field406[var5++] = var50;
                        continue;
                    }
                    if (var369 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field568[var10001] = field406[var5];
                        continue;
                    }
                }
                boolean var51;
                if (var8[var6] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var369 < 1000) {
                    if (var369 == 100) {
                        var4 -= 3;
                        int var52 = field393[var4];
                        int var53 = field393[var4 + 1];
                        int var54 = field393[var4 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class156 var55 = class156.method2431(var52);
                        if (var55.field2622 == null) {
                            var55.field2622 = new class156[var54 + 1];
                        }
                        if (var55.field2622.length <= var54) {
                            class156[] var56 = new class156[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2622.length; var57++) {
                                var56[var57] = var55.field2622[var57];
                            }
                            var55.field2622 = var56;
                        }
                        if (var54 > 0 && var55.field2622[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class156 var58 = new class156();
                        var58.field2587 = var53;
                        var58.field2525 = var58.field2514 = var55.field2514;
                        var58.field2534 = var54;
                        var58.field2513 = true;
                        var55.field2622[var54] = var58;
                        if (var51) {
                            Statics.field398 = var58;
                        } else {
                            Statics.field397 = var58;
                        }
                        client.method2103(var55);
                        continue;
                    }
                    if (var369 == 101) {
                        class156 var59 = var51 ? Statics.field398 : Statics.field397;
                        class156 var60 = class156.method2431(var59.field2514);
                        var60.field2622[var59.field2534] = null;
                        client.method2103(var60);
                        continue;
                    }
                    if (var369 == 102) {
                        var4--;
                        class156 var61 = class156.method2431(field393[var4]);
                        var61.field2622 = null;
                        client.method2103(var61);
                        continue;
                    }
                    if (var369 == 200) {
                        var4 -= 2;
                        int var62 = field393[var4];
                        int var63 = field393[var4 + 1];
                        class156 var64 = class156.method2911(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field393[var4++] = 1;
                            if (var51) {
                                Statics.field398 = var64;
                            } else {
                                Statics.field397 = var64;
                            }
                            continue;
                        }
                        field393[var4++] = 0;
                        continue;
                    }
                } else if (!(var369 < 1000 || var369 >= 1100) || !(var369 < 2000 || var369 >= 2100)) {
                    class156 var65;
                    if (var369 >= 2000) {
                        var369 -= 1000;
                        var4--;
                        var65 = class156.method2431(field393[var4]);
                    } else {
                        var65 = var51 ? Statics.field398 : Statics.field397;
                    }
                    if (var369 == 1000) {
                        var4 -= 2;
                        var65.field2549 = field393[var4];
                        var65.field2520 = field393[var4 + 1];
                        client.method2103(var65);
                        continue;
                    }
                    if (var369 == 1001) {
                        var4 -= 2;
                        var65.field2523 = field393[var4];
                        var65.field2524 = field393[var4 + 1];
                        client.method2103(var65);
                        continue;
                    }
                    if (var369 == 1003) {
                        var4--;
                        boolean var66 = field393[var4] == 1;
                        if (var65.field2526 != var66) {
                            var65.field2526 = var66;
                            client.method2103(var65);
                        }
                        continue;
                    }
                } else if (var369 >= 1100 && var369 < 1200 || var369 >= 2100 && var369 < 2200) {
                    class156 var67;
                    if (var369 >= 2000) {
                        var369 -= 1000;
                        var4--;
                        var67 = class156.method2431(field393[var4]);
                    } else {
                        var67 = var51 ? Statics.field398 : Statics.field397;
                    }
                    if (var369 == 1100) {
                        var4 -= 2;
                        var67.field2527 = field393[var4];
                        if (var67.field2527 > var67.field2529 - var67.field2523) {
                            var67.field2527 = var67.field2529 - var67.field2523;
                        }
                        if (var67.field2527 < 0) {
                            var67.field2527 = 0;
                        }
                        var67.field2528 = field393[var4 + 1];
                        if (var67.field2528 > var67.field2530 - var67.field2524) {
                            var67.field2528 = var67.field2530 - var67.field2524;
                        }
                        if (var67.field2528 < 0) {
                            var67.field2528 = 0;
                        }
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1101) {
                        var4--;
                        var67.field2545 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1102) {
                        var4--;
                        var67.field2556 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1103) {
                        var4--;
                        var67.field2536 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1104) {
                        var4--;
                        var67.field2559 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1105) {
                        var4--;
                        var67.field2538 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1106) {
                        var4--;
                        var67.field2608 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1107) {
                        var4--;
                        var67.field2614 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1108) {
                        var67.field2546 = 1;
                        var4--;
                        var67.field2519 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1109) {
                        var4 -= 6;
                        var67.field2552 = field393[var4];
                        var67.field2553 = field393[var4 + 1];
                        var67.field2554 = field393[var4 + 2];
                        var67.field2508 = field393[var4 + 3];
                        var67.field2516 = field393[var4 + 4];
                        var67.field2570 = field393[var4 + 5];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1110) {
                        var4--;
                        int var68 = field393[var4];
                        if (var67.field2550 != var68) {
                            var67.field2550 = var68;
                            var67.field2620 = 0;
                            var67.field2621 = 0;
                            client.method2103(var67);
                        }
                        continue;
                    }
                    if (var369 == 1111) {
                        var4--;
                        var67.field2619 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1112) {
                        var5--;
                        String var69 = field406[var5];
                        if (!var69.equals(var67.field2581)) {
                            var67.field2581 = var69;
                            client.method2103(var67);
                        }
                        continue;
                    }
                    if (var369 == 1113) {
                        var4--;
                        var67.field2560 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1114) {
                        var4 -= 3;
                        var67.field2561 = field393[var4];
                        var67.field2574 = field393[var4 + 1];
                        var67.field2563 = field393[var4 + 2];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1115) {
                        var4--;
                        var67.field2557 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1116) {
                        var4--;
                        var67.field2542 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1117) {
                        var4--;
                        var67.field2543 = field393[var4];
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1118) {
                        var4--;
                        var67.field2544 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1119) {
                        var4--;
                        var67.field2540 = field393[var4] == 1;
                        client.method2103(var67);
                        continue;
                    }
                    if (var369 == 1120) {
                        var4 -= 2;
                        var67.field2529 = field393[var4];
                        var67.field2530 = field393[var4 + 1];
                        client.method2103(var67);
                        continue;
                    }
                } else if (var369 >= 1200 && var369 < 1300 || var369 >= 2200 && var369 < 2300) {
                    class156 var70;
                    if (var369 >= 2000) {
                        var369 -= 1000;
                        var4--;
                        var70 = class156.method2431(field393[var4]);
                    } else {
                        var70 = var51 ? Statics.field398 : Statics.field397;
                    }
                    client.method2103(var70);
                    if (var369 == 1200) {
                        var4 -= 2;
                        int var71 = field393[var4];
                        int var72 = field393[var4 + 1];
                        var70.field2618 = var71;
                        var70.field2584 = var72;
                        class39 var73 = class39.method2704(var71);
                        var70.field2554 = var73.field1024;
                        var70.field2508 = var73.field994;
                        var70.field2516 = var73.field995;
                        var70.field2552 = var73.field996;
                        var70.field2553 = var73.field993;
                        var70.field2570 = var73.field992;
                        if (var70.field2523 > 0) {
                            var70.field2570 = var70.field2570 * 32 / var70.field2523;
                        }
                        continue;
                    }
                    if (var369 == 1201) {
                        var70.field2546 = 2;
                        var4--;
                        var70.field2519 = field393[var4];
                        continue;
                    }
                    if (var369 == 1202) {
                        var70.field2546 = 3;
                        var70.field2519 = Statics.field1033.field36.method3178();
                        continue;
                    }
                } else if ((var369 < 1300 || var369 >= 1400) && (var369 < 2300 || var369 >= 2400)) {
                    if (var369 >= 1400 && var369 < 1500 || var369 >= 2400 && var369 < 2500) {
                        class156 var78;
                        if (var369 >= 2000) {
                            var369 -= 1000;
                            var4--;
                            var78 = class156.method2431(field393[var4]);
                        } else {
                            var78 = var51 ? Statics.field398 : Statics.field397;
                        }
                        var5--;
                        String var79 = field406[var5];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var4--;
                            int var81 = field393[var4];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var4--;
                                    var80[var81] = field393[var4];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var5--;
                                var82[var83] = field406[var5];
                            } else {
                                var4--;
                                var82[var83] = Integer.valueOf(field393[var4]);
                            }
                        }
                        var4--;
                        int var84 = field393[var4];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var369 == 1400) {
                            var78.field2583 = var82;
                        }
                        if (var369 == 1401) {
                            var78.field2586 = var82;
                        }
                        if (var369 == 1402) {
                            var78.field2585 = var82;
                        }
                        if (var369 == 1403) {
                            var78.field2580 = var82;
                        }
                        if (var369 == 1404) {
                            var78.field2589 = var82;
                        }
                        if (var369 == 1405) {
                            var78.field2590 = var82;
                        }
                        if (var369 == 1406) {
                            var78.field2597 = var82;
                        }
                        if (var369 == 1407) {
                            var78.field2594 = var82;
                            var78.field2531 = var80;
                        }
                        if (var369 == 1408) {
                            var78.field2600 = var82;
                        }
                        if (var369 == 1409) {
                            var78.field2578 = var82;
                        }
                        if (var369 == 1410) {
                            var78.field2591 = var82;
                        }
                        if (var369 == 1411) {
                            var78.field2602 = var82;
                        }
                        if (var369 == 1412) {
                            var78.field2588 = var82;
                        }
                        if (var369 == 1414) {
                            var78.field2596 = var82;
                            var78.field2505 = var80;
                        }
                        if (var369 == 1415) {
                            var78.field2598 = var82;
                            var78.field2599 = var80;
                        }
                        if (var369 == 1416) {
                            var78.field2626 = var82;
                        }
                        if (var369 == 1417) {
                            var78.field2601 = var82;
                        }
                        if (var369 == 1418) {
                            var78.field2564 = var82;
                        }
                        if (var369 == 1419) {
                            var78.field2612 = var82;
                        }
                        if (var369 == 1420) {
                            var78.field2605 = var82;
                        }
                        if (var369 == 1421) {
                            var78.field2606 = var82;
                        }
                        if (var369 == 1422) {
                            var78.field2607 = var82;
                        }
                        if (var369 == 1423) {
                            var78.field2604 = var82;
                        }
                        if (var369 == 1424) {
                            var78.field2609 = var82;
                        }
                        var78.field2595 = true;
                        continue;
                    }
                    if (var369 < 1600) {
                        class156 var85 = var51 ? Statics.field398 : Statics.field397;
                        if (var369 == 1500) {
                            field393[var4++] = var85.field2549;
                            continue;
                        }
                        if (var369 == 1501) {
                            field393[var4++] = var85.field2520;
                            continue;
                        }
                        if (var369 == 1502) {
                            field393[var4++] = var85.field2523;
                            continue;
                        }
                        if (var369 == 1503) {
                            field393[var4++] = var85.field2524;
                            continue;
                        }
                        if (var369 == 1504) {
                            field393[var4++] = var85.field2526 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 1505) {
                            field393[var4++] = var85.field2525;
                            continue;
                        }
                    } else if (var369 < 1700) {
                        class156 var86 = var51 ? Statics.field398 : Statics.field397;
                        if (var369 == 1600) {
                            field393[var4++] = var86.field2527;
                            continue;
                        }
                        if (var369 == 1601) {
                            field393[var4++] = var86.field2528;
                            continue;
                        }
                        if (var369 == 1602) {
                            field406[var5++] = var86.field2581;
                            continue;
                        }
                        if (var369 == 1603) {
                            field393[var4++] = var86.field2529;
                            continue;
                        }
                        if (var369 == 1604) {
                            field393[var4++] = var86.field2530;
                            continue;
                        }
                        if (var369 == 1605) {
                            field393[var4++] = var86.field2570;
                            continue;
                        }
                        if (var369 == 1606) {
                            field393[var4++] = var86.field2554;
                            continue;
                        }
                        if (var369 == 1607) {
                            field393[var4++] = var86.field2516;
                            continue;
                        }
                        if (var369 == 1608) {
                            field393[var4++] = var86.field2508;
                            continue;
                        }
                    } else if (var369 < 1800) {
                        class156 var87 = var51 ? Statics.field398 : Statics.field397;
                        if (var369 == 1700) {
                            field393[var4++] = var87.field2618;
                            continue;
                        }
                        if (var369 == 1701) {
                            if (var87.field2618 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var87.field2584;
                            }
                            continue;
                        }
                        if (var369 == 1702) {
                            field393[var4++] = var87.field2534;
                            continue;
                        }
                    } else if (var369 < 1900) {
                        class156 var88 = var51 ? Statics.field398 : Statics.field397;
                        if (var369 == 1800) {
                            field393[var4++] = class160.method171(client.method883(var88));
                            continue;
                        }
                        if (var369 == 1801) {
                            var4--;
                            int var89 = field393[var4];
                            int var370 = var89 - 1;
                            if (var88.field2575 != null && var370 < var88.field2575.length && var88.field2575[var370] != null) {
                                field406[var5++] = var88.field2575[var370];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 1802) {
                            if (var88.field2535 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = var88.field2535;
                            }
                            continue;
                        }
                    } else if (var369 < 2600) {
                        var4--;
                        class156 var90 = class156.method2431(field393[var4]);
                        if (var369 == 2500) {
                            field393[var4++] = var90.field2549;
                            continue;
                        }
                        if (var369 == 2501) {
                            field393[var4++] = var90.field2520;
                            continue;
                        }
                        if (var369 == 2502) {
                            field393[var4++] = var90.field2523;
                            continue;
                        }
                        if (var369 == 2503) {
                            field393[var4++] = var90.field2524;
                            continue;
                        }
                        if (var369 == 2504) {
                            field393[var4++] = var90.field2526 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 2505) {
                            field393[var4++] = var90.field2525;
                            continue;
                        }
                    } else if (var369 < 2700) {
                        var4--;
                        class156 var91 = class156.method2431(field393[var4]);
                        if (var369 == 2600) {
                            field393[var4++] = var91.field2527;
                            continue;
                        }
                        if (var369 == 2601) {
                            field393[var4++] = var91.field2528;
                            continue;
                        }
                        if (var369 == 2602) {
                            field406[var5++] = var91.field2581;
                            continue;
                        }
                        if (var369 == 2603) {
                            field393[var4++] = var91.field2529;
                            continue;
                        }
                        if (var369 == 2604) {
                            field393[var4++] = var91.field2530;
                            continue;
                        }
                        if (var369 == 2605) {
                            field393[var4++] = var91.field2570;
                            continue;
                        }
                        if (var369 == 2606) {
                            field393[var4++] = var91.field2554;
                            continue;
                        }
                        if (var369 == 2607) {
                            field393[var4++] = var91.field2516;
                            continue;
                        }
                        if (var369 == 2608) {
                            field393[var4++] = var91.field2508;
                            continue;
                        }
                    } else if (var369 < 2800) {
                        if (var369 == 2700) {
                            var4--;
                            class156 var92 = class156.method2431(field393[var4]);
                            field393[var4++] = var92.field2618;
                            continue;
                        }
                        if (var369 == 2701) {
                            var4--;
                            class156 var93 = class156.method2431(field393[var4]);
                            if (var93.field2618 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var93.field2584;
                            }
                            continue;
                        }
                        if (var369 == 2702) {
                            var4--;
                            int var94 = field393[var4];
                            class4 var95 = (class4) client.field712.method3281((long) var94);
                            if (var95 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var369 < 2900) {
                        var4--;
                        class156 var96 = class156.method2431(field393[var4]);
                        if (var369 == 2800) {
                            field393[var4++] = class160.method171(client.method883(var96));
                            continue;
                        }
                        if (var369 == 2801) {
                            var4--;
                            int var97 = field393[var4];
                            int var371 = var97 - 1;
                            if (var96.field2575 != null && var371 < var96.field2575.length && var96.field2575[var371] != null) {
                                field406[var5++] = var96.field2575[var371];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 2802) {
                            if (var96.field2535 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = var96.field2535;
                            }
                            continue;
                        }
                    } else if (var369 < 3200) {
                        if (var369 == 3100) {
                            var5--;
                            String var98 = field406[var5];
                            Statics.method2554(0, "", var98);
                            continue;
                        }
                        if (var369 == 3101) {
                            var4 -= 2;
                            client.method1827(Statics.field1033, field393[var4], field393[var4 + 1]);
                            continue;
                        }
                        if (var369 == 3103) {
                            client.field512.method2307(118);
                            for (class4 var99 = (class4) client.field712.method3285(); var99 != null; var99 = (class4) client.field712.method3286()) {
                                if (var99.field66 == 0 || var99.field66 == 3) {
                                    client.method600(var99, true);
                                }
                            }
                            if (client.field638 != null) {
                                client.method2103(client.field638);
                                client.field638 = null;
                            }
                            continue;
                        }
                        if (var369 == 3104) {
                            var5--;
                            String var100 = field406[var5];
                            int var101 = 0;
                            boolean var102 = false;
                            boolean var103 = false;
                            int var104 = 0;
                            int var105 = var100.length();
                            int var106 = 0;
                            boolean var108;
                            while (true) {
                                if (var106 >= var105) {
                                    var108 = var103;
                                    break;
                                }
                                label2562: {
                                    char var107 = var100.charAt(var106);
                                    if (var106 == 0) {
                                        if (var107 == '-') {
                                            var102 = true;
                                            break label2562;
                                        }
                                        if (var107 == '+') {
                                            break label2562;
                                        }
                                    }
                                    int var372;
                                    if (var107 >= '0' && var107 <= '9') {
                                        var372 = var107 - '0';
                                    } else if (var107 >= 'A' && var107 <= 'Z') {
                                        var372 = var107 - '7';
                                    } else {
                                        if (var107 < 'a' || var107 > 'z') {
                                            var108 = false;
                                            break;
                                        }
                                        var372 = var107 - 'W';
                                    }
                                    if (var372 >= 10) {
                                        var108 = false;
                                        break;
                                    }
                                    if (var102) {
                                        var372 = -var372;
                                    }
                                    int var109 = var104 * 10 + var372;
                                    if (var109 / 10 != var104) {
                                        var108 = false;
                                        break;
                                    }
                                    var104 = var109;
                                    var103 = true;
                                }
                                var106++;
                            }
                            if (var108) {
                                int var111 = class146.method1531(var100, 10, true);
                                var101 = var111;
                            }
                            client.field512.method2307(201);
                            client.field512.method2456(var101);
                            continue;
                        }
                        if (var369 == 3105) {
                            var5--;
                            String var112 = field406[var5];
                            client.field512.method2307(80);
                            client.field512.method2462(var112.length() + 1);
                            client.field512.method2442(var112);
                            continue;
                        }
                        if (var369 == 3106) {
                            var5--;
                            String var113 = field406[var5];
                            client.field512.method2307(90);
                            client.field512.method2462(var113.length() + 1);
                            client.field512.method2442(var113);
                            continue;
                        }
                        if (var369 == 3107) {
                            var4--;
                            int var114 = field393[var4];
                            var5--;
                            String var115 = field406[var5];
                            boolean var116 = false;
                            for (int var117 = 0; var117 < client.field576; var117++) {
                                class3 var118 = client.field660[client.field698[var117]];
                                if (var118 != null && var118.field51 != null && var118.field51.equalsIgnoreCase(var115)) {
                                    client.method233(Statics.field1033.field444[0], Statics.field1033.field450[0], var118.field444[0], var118.field450[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var114 == 1) {
                                        client.field512.method2307(213);
                                        client.field512.method2479(client.field698[var117]);
                                    } else if (var114 == 4) {
                                        client.field512.method2307(173);
                                        client.field512.method2479(client.field698[var117]);
                                    } else if (var114 == 6) {
                                        client.field512.method2307(74);
                                        client.field512.method2438(client.field698[var117]);
                                    } else if (var114 == 7) {
                                        client.field512.method2307(60);
                                        client.field512.method2438(client.field698[var117]);
                                    }
                                    var116 = true;
                                    break;
                                }
                            }
                            if (!var116) {
                                Statics.method2554(0, "", class133.field2180 + var115);
                            }
                            continue;
                        }
                        if (var369 == 3108) {
                            var4 -= 3;
                            int var119 = field393[var4];
                            int var120 = field393[var4 + 1];
                            int var121 = field393[var4 + 2];
                            class156 var122 = class156.method2431(var121);
                            client.method3077(var122, var119, var120);
                            continue;
                        }
                        if (var369 == 3109) {
                            var4 -= 2;
                            int var123 = field393[var4];
                            int var124 = field393[var4 + 1];
                            class156 var125 = var51 ? Statics.field398 : Statics.field397;
                            client.method3077(var125, var123, var124);
                            continue;
                        }
                    } else if (var369 < 3300) {
                        if (var369 == 3200) {
                            var4 -= 3;
                            client.method2371(field393[var4], field393[var4 + 1], field393[var4 + 2]);
                            continue;
                        }
                        if (var369 == 3201) {
                            var4--;
                            client.method113(field393[var4]);
                            continue;
                        }
                        if (var369 == 3202) {
                            var4 -= 2;
                            client.method2189(field393[var4], field393[var4 + 1]);
                            continue;
                        }
                    } else if (var369 < 3400) {
                        if (var369 == 3300) {
                            field393[var4++] = client.field481;
                            continue;
                        }
                        if (var369 == 3301) {
                            var4 -= 2;
                            int var126 = field393[var4];
                            int var127 = field393[var4 + 1];
                            field393[var4++] = class18.method2341(var126, var127);
                            continue;
                        }
                        if (var369 == 3302) {
                            var4 -= 2;
                            int var128 = field393[var4];
                            int var129 = field393[var4 + 1];
                            field393[var4++] = class18.method646(var128, var129);
                            continue;
                        }
                        if (var369 == 3303) {
                            var4 -= 2;
                            int var130 = field393[var4];
                            int var131 = field393[var4 + 1];
                            int[] var132 = field393;
                            int var133 = var4++;
                            class18 var134 = (class18) class18.field279.method3281((long) var130);
                            int var135;
                            if (var134 == null) {
                                var135 = 0;
                            } else if (var131 == -1) {
                                var135 = 0;
                            } else {
                                int var136 = 0;
                                for (int var137 = 0; var137 < var134.field276.length; var137++) {
                                    if (var134.field275[var137] == var131) {
                                        var136 += var134.field276[var137];
                                    }
                                }
                                var135 = var136;
                            }
                            var132[var133] = var135;
                            continue;
                        }
                        if (var369 == 3304) {
                            var4--;
                            int var138 = field393[var4];
                            int[] var139 = field393;
                            int var140 = var4++;
                            class40 var141 = (class40) class40.field1028.method3240((long) var138);
                            class40 var142;
                            if (var141 == null) {
                                byte[] var143 = Statics.field1035.method2951(5, var138);
                                class40 var144 = new class40();
                                if (var143 != null) {
                                    var144.method881(new class126(var143));
                                }
                                class40.field1028.method3237(var144, (long) var138);
                                var142 = var144;
                            } else {
                                var142 = var141;
                            }
                            var139[var140] = var142.field1034;
                            continue;
                        }
                        if (var369 == 3305) {
                            var4--;
                            int var145 = field393[var4];
                            field393[var4++] = client.field522[var145];
                            continue;
                        }
                        if (var369 == 3306) {
                            var4--;
                            int var146 = field393[var4];
                            field393[var4++] = client.field613[var146];
                            continue;
                        }
                        if (var369 == 3307) {
                            var4--;
                            int var147 = field393[var4];
                            field393[var4++] = client.field727[var147];
                            continue;
                        }
                        if (var369 == 3308) {
                            int var148 = Statics.field244;
                            int var149 = (Statics.field1033.field448 >> 7) + Statics.field333;
                            int var150 = (Statics.field1033.field410 >> 7) + Statics.field141;
                            field393[var4++] = (var148 << 28) + (var149 << 14) + var150;
                            continue;
                        }
                        if (var369 == 3309) {
                            var4--;
                            int var151 = field393[var4];
                            field393[var4++] = var151 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var369 == 3310) {
                            var4--;
                            int var152 = field393[var4];
                            field393[var4++] = var152 >> 28;
                            continue;
                        }
                        if (var369 == 3311) {
                            var4--;
                            int var153 = field393[var4];
                            field393[var4++] = var153 & 0x3FFF;
                            continue;
                        }
                        if (var369 == 3312) {
                            field393[var4++] = client.field474 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 3313) {
                            var4 -= 2;
                            int var154 = field393[var4] + 32768;
                            int var155 = field393[var4 + 1];
                            field393[var4++] = class18.method2341(var154, var155);
                            continue;
                        }
                        if (var369 == 3314) {
                            var4 -= 2;
                            int var156 = field393[var4] + 32768;
                            int var157 = field393[var4 + 1];
                            field393[var4++] = class18.method646(var156, var157);
                            continue;
                        }
                        if (var369 == 3315) {
                            var4 -= 2;
                            int var158 = field393[var4] + 32768;
                            int var159 = field393[var4 + 1];
                            int[] var160 = field393;
                            int var161 = var4++;
                            class18 var162 = (class18) class18.field279.method3281((long) var158);
                            int var163;
                            if (var162 == null) {
                                var163 = 0;
                            } else if (var159 == -1) {
                                var163 = 0;
                            } else {
                                int var164 = 0;
                                for (int var165 = 0; var165 < var162.field276.length; var165++) {
                                    if (var162.field275[var165] == var159) {
                                        var164 += var162.field276[var165];
                                    }
                                }
                                var163 = var164;
                            }
                            var160[var161] = var163;
                            continue;
                        }
                        if (var369 == 3316) {
                            if (client.field641 >= 2) {
                                field393[var4++] = client.field641;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                        if (var369 == 3317) {
                            field393[var4++] = client.field633;
                            continue;
                        }
                        if (var369 == 3318) {
                            field393[var4++] = client.field470;
                            continue;
                        }
                        if (var369 == 3321) {
                            field393[var4++] = client.field639;
                            continue;
                        }
                        if (var369 == 3322) {
                            field393[var4++] = client.field640;
                            continue;
                        }
                        if (var369 == 3323) {
                            if (client.field573) {
                                field393[var4++] = 1;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var369 < 3500) {
                        if (var369 == 3400) {
                            var4 -= 2;
                            int var166 = field393[var4];
                            int var167 = field393[var4 + 1];
                            class38 var168 = (class38) class38.field964.method3240((long) var166);
                            class38 var169;
                            if (var168 == null) {
                                byte[] var170 = Statics.field963.method2951(8, var166);
                                class38 var171 = new class38();
                                if (var170 != null) {
                                    var171.method816(new class126(var170));
                                }
                                class38.field964.method3237(var171, (long) var166);
                                var169 = var171;
                            } else {
                                var169 = var168;
                            }
                            class38 var172 = var169;
                            if (var169.field970 != 's') {
                            }
                            for (int var173 = 0; var173 < var172.field969; var173++) {
                                if (var172.field975[var173] == var167) {
                                    field406[var5++] = var172.field972[var173];
                                    var172 = null;
                                    break;
                                }
                            }
                            if (var172 != null) {
                                field406[var5++] = var172.field967;
                            }
                            continue;
                        }
                        if (var369 == 3408) {
                            var4 -= 4;
                            int var174 = field393[var4];
                            int var175 = field393[var4 + 1];
                            int var176 = field393[var4 + 2];
                            int var177 = field393[var4 + 3];
                            class38 var178 = (class38) class38.field964.method3240((long) var176);
                            class38 var179;
                            if (var178 == null) {
                                byte[] var180 = Statics.field963.method2951(8, var176);
                                class38 var181 = new class38();
                                if (var180 != null) {
                                    var181.method816(new class126(var180));
                                }
                                class38.field964.method3237(var181, (long) var176);
                                var179 = var181;
                            } else {
                                var179 = var178;
                            }
                            class38 var182 = var179;
                            if (var179.field966 == var174 && var179.field970 == var175) {
                                for (int var183 = 0; var183 < var182.field969; var183++) {
                                    if (var182.field975[var183] == var177) {
                                        if (var175 == 115) {
                                            field406[var5++] = var182.field972[var183];
                                        } else {
                                            field393[var4++] = var182.field973[var183];
                                        }
                                        var182 = null;
                                        break;
                                    }
                                }
                                if (var182 != null) {
                                    if (var175 == 115) {
                                        field406[var5++] = var182.field967;
                                    } else {
                                        field393[var4++] = var182.field968;
                                    }
                                }
                                continue;
                            }
                            if (var175 == 115) {
                                field406[var5++] = "null";
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var369 < 3700) {
                        if (var369 == 3600) {
                            if (client.field610 == 0) {
                                field393[var4++] = -2;
                            } else if (client.field610 == 1) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field726;
                            }
                            continue;
                        }
                        if (var369 == 3601) {
                            var4--;
                            int var184 = field393[var4];
                            if (client.field610 == 2 && var184 < client.field726) {
                                field406[var5++] = client.field728[var184].field358;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 3602) {
                            var4--;
                            int var185 = field393[var4];
                            if (client.field610 == 2 && var185 < client.field726) {
                                field393[var4++] = client.field728[var185].field356;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var369 == 3603) {
                            var4--;
                            int var186 = field393[var4];
                            if (client.field610 == 2 && var186 < client.field726) {
                                field393[var4++] = client.field728[var186].field357;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var369 == 3604) {
                            var5--;
                            String var187 = field406[var5];
                            var4--;
                            int var188 = field393[var4];
                            client.field512.method2307(151);
                            class115 var189 = client.field512;
                            int var190 = var187.length() + 1;
                            var189.method2462(var190 + 1);
                            client.field512.method2471(var188);
                            client.field512.method2442(var187);
                            continue;
                        }
                        if (var369 == 3605) {
                            var5--;
                            String var191 = field406[var5];
                            client.method3023(var191);
                            continue;
                        }
                        if (var369 == 3606) {
                            var5--;
                            String var192 = field406[var5];
                            client.method119(var192);
                            continue;
                        }
                        if (var369 == 3607) {
                            var5--;
                            String var193 = field406[var5];
                            if (var193 == null) {
                                continue;
                            }
                            if (client.field695 >= 100) {
                                Statics.method2554(0, "", class133.field2199);
                                continue;
                            }
                            String var194 = class147.method1357(var193, Statics.field560);
                            if (var194 == null) {
                                continue;
                            }
                            for (int var195 = 0; var195 < client.field695; var195++) {
                                class11 var196 = client.field478[var195];
                                String var197 = class147.method1357(var196.field177, Statics.field560);
                                if (var197 != null && var197.equals(var194)) {
                                    Statics.method2554(0, "", var193 + class133.field2102);
                                    continue label2350;
                                }
                                if (var196.field178 != null) {
                                    String var198 = class147.method1357(var196.field178, Statics.field560);
                                    if (var198 != null && var198.equals(var194)) {
                                        Statics.method2554(0, "", var193 + class133.field2102);
                                        continue label2350;
                                    }
                                }
                            }
                            for (int var199 = 0; var199 < client.field726; var199++) {
                                class22 var200 = client.field728[var199];
                                String var201 = class147.method1357(var200.field358, Statics.field560);
                                if (var201 != null && var201.equals(var194)) {
                                    Statics.method2554(0, "", class133.field2188 + var193 + class133.field2200);
                                    continue label2350;
                                }
                                if (var200.field364 != null) {
                                    String var202 = class147.method1357(var200.field364, Statics.field560);
                                    if (var202 != null && var202.equals(var194)) {
                                        Statics.method2554(0, "", class133.field2188 + var193 + class133.field2200);
                                        continue label2350;
                                    }
                                }
                            }
                            if (class147.method1357(Statics.field1033.field51, Statics.field560).equals(var194)) {
                                Statics.method2554(0, "", class133.field2202);
                            } else {
                                client.field512.method2307(135);
                                class115 var203 = client.field512;
                                int var204 = var193.length() + 1;
                                var203.method2462(var204);
                                client.field512.method2442(var193);
                            }
                            continue;
                        }
                        if (var369 == 3608) {
                            var5--;
                            String var205 = field406[var5];
                            if (var205 == null) {
                                continue;
                            }
                            String var206 = class147.method1357(var205, Statics.field560);
                            if (var206 == null) {
                                continue;
                            }
                            int var207 = 0;
                            while (true) {
                                if (var207 >= client.field695) {
                                    continue label2350;
                                }
                                class11 var208 = client.field478[var207];
                                String var209 = var208.field177;
                                String var210 = class147.method1357(var209, Statics.field560);
                                boolean var211;
                                if (var205 == null || var209 == null) {
                                    var211 = false;
                                } else if (var205.startsWith("#") || var209.startsWith("#")) {
                                    var211 = var205.equals(var209);
                                } else {
                                    var211 = var206.equals(var210);
                                }
                                if (var211) {
                                    client.field695--;
                                    for (int var212 = var207; var212 < client.field695; var212++) {
                                        client.field478[var212] = client.field478[var212 + 1];
                                    }
                                    client.field665 = client.field657;
                                    client.field512.method2307(197);
                                    class115 var213 = client.field512;
                                    int var214 = var205.length() + 1;
                                    var213.method2462(var214);
                                    client.field512.method2442(var205);
                                    continue label2350;
                                }
                                var207++;
                            }
                        }
                        if (var369 == 3609) {
                            var5--;
                            String var215 = field406[var5];
                            if (var215.startsWith(class2.method29(0)) || var215.startsWith(class2.method29(1))) {
                                var215 = var215.substring(7);
                            }
                            field393[var4++] = client.method107(var215) ? 1 : 0;
                            continue;
                        }
                        if (var369 == 3611) {
                            if (client.field669 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = class145.method249(client.field669);
                            }
                            continue;
                        }
                        if (var369 == 3612) {
                            if (client.field669 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = Statics.field1838;
                            }
                            continue;
                        }
                        if (var369 == 3613) {
                            var4--;
                            int var216 = field393[var4];
                            if (client.field669 != null && var216 < Statics.field1838) {
                                field406[var5++] = Statics.field2423[var216].field112;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 3614) {
                            var4--;
                            int var217 = field393[var4];
                            if (client.field669 != null && var217 < Statics.field1838) {
                                field393[var4++] = Statics.field2423[var217].field113;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var369 == 3615) {
                            var4--;
                            int var218 = field393[var4];
                            if (client.field669 != null && var218 < Statics.field1838) {
                                field393[var4++] = Statics.field2423[var218].field114;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var369 == 3616) {
                            field393[var4++] = Statics.field69;
                            continue;
                        }
                        if (var369 == 3617) {
                            var5--;
                            String var219 = field406[var5];
                            client.method1536(var219);
                            continue;
                        }
                        if (var369 == 3618) {
                            field393[var4++] = Statics.field1827;
                            continue;
                        }
                        if (var369 == 3619) {
                            var5--;
                            String var220 = field406[var5];
                            client.method2669(var220);
                            continue;
                        }
                        if (var369 == 3620) {
                            client.field512.method2307(136);
                            client.field512.method2462(0);
                            continue;
                        }
                        if (var369 == 3621) {
                            if (client.field610 == 0) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field695;
                            }
                            continue;
                        }
                        if (var369 == 3622) {
                            var4--;
                            int var221 = field393[var4];
                            if (client.field610 != 0 && var221 < client.field695) {
                                field406[var5++] = client.field478[var221].field177;
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 3623) {
                            var5--;
                            String var222 = field406[var5];
                            if (var222.startsWith(class2.method29(0)) || var222.startsWith(class2.method29(1))) {
                                var222 = var222.substring(7);
                            }
                            field393[var4++] = client.method61(var222) ? 1 : 0;
                            continue;
                        }
                        if (var369 == 3624) {
                            var4--;
                            int var223 = field393[var4];
                            if (Statics.field2423 != null && var223 < Statics.field1838 && Statics.field2423[var223].field112.equalsIgnoreCase(Statics.field1033.field51)) {
                                field393[var4++] = 1;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var369 == 3625) {
                            if (client.field699 == null) {
                                field406[var5++] = "";
                            } else {
                                field406[var5++] = class145.method249(client.field699);
                            }
                            continue;
                        }
                    } else if (var369 < 4100) {
                        if (var369 == 4000) {
                            var4 -= 2;
                            int var224 = field393[var4];
                            int var225 = field393[var4 + 1];
                            field393[var4++] = var224 + var225;
                            continue;
                        }
                        if (var369 == 4001) {
                            var4 -= 2;
                            int var226 = field393[var4];
                            int var227 = field393[var4 + 1];
                            field393[var4++] = var226 - var227;
                            continue;
                        }
                        if (var369 == 4002) {
                            var4 -= 2;
                            int var228 = field393[var4];
                            int var229 = field393[var4 + 1];
                            field393[var4++] = var228 * var229;
                            continue;
                        }
                        if (var369 == 4003) {
                            var4 -= 2;
                            int var230 = field393[var4];
                            int var231 = field393[var4 + 1];
                            field393[var4++] = var230 / var231;
                            continue;
                        }
                        if (var369 == 4004) {
                            var4--;
                            int var232 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) var232);
                            continue;
                        }
                        if (var369 == 4005) {
                            var4--;
                            int var233 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) (var233 + 1));
                            continue;
                        }
                        if (var369 == 4006) {
                            var4 -= 5;
                            int var234 = field393[var4];
                            int var235 = field393[var4 + 1];
                            int var236 = field393[var4 + 2];
                            int var237 = field393[var4 + 3];
                            int var238 = field393[var4 + 4];
                            field393[var4++] = (var235 - var234) * (var238 - var236) / (var237 - var236) + var234;
                            continue;
                        }
                        if (var369 == 4007) {
                            var4 -= 2;
                            int var239 = field393[var4];
                            int var240 = field393[var4 + 1];
                            field393[var4++] = var239 * var240 / 100 + var239;
                            continue;
                        }
                        if (var369 == 4008) {
                            var4 -= 2;
                            int var241 = field393[var4];
                            int var242 = field393[var4 + 1];
                            field393[var4++] = var241 | 0x1 << var242;
                            continue;
                        }
                        if (var369 == 4009) {
                            var4 -= 2;
                            int var243 = field393[var4];
                            int var244 = field393[var4 + 1];
                            field393[var4++] = var243 & -1 - (0x1 << var244);
                            continue;
                        }
                        if (var369 == 4010) {
                            var4 -= 2;
                            int var245 = field393[var4];
                            int var246 = field393[var4 + 1];
                            field393[var4++] = (var245 & 0x1 << var246) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var369 == 4011) {
                            var4 -= 2;
                            int var247 = field393[var4];
                            int var248 = field393[var4 + 1];
                            field393[var4++] = var247 % var248;
                            continue;
                        }
                        if (var369 == 4012) {
                            var4 -= 2;
                            int var249 = field393[var4];
                            int var250 = field393[var4 + 1];
                            if (var249 == 0) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var249, (double) var250);
                            }
                            continue;
                        }
                        if (var369 == 4013) {
                            var4 -= 2;
                            int var251 = field393[var4];
                            int var252 = field393[var4 + 1];
                            if (var251 == 0) {
                                field393[var4++] = 0;
                            } else if (var252 == 0) {
                                field393[var4++] = Integer.MAX_VALUE;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var251, 1.0D / (double) var252);
                            }
                            continue;
                        }
                        if (var369 == 4014) {
                            var4 -= 2;
                            int var253 = field393[var4];
                            int var254 = field393[var4 + 1];
                            field393[var4++] = var253 & var254;
                            continue;
                        }
                        if (var369 == 4015) {
                            var4 -= 2;
                            int var255 = field393[var4];
                            int var256 = field393[var4 + 1];
                            field393[var4++] = var255 | var256;
                            continue;
                        }
                    } else if (var369 < 4200) {
                        if (var369 == 4100) {
                            var5--;
                            String var257 = field406[var5];
                            var4--;
                            int var258 = field393[var4];
                            field406[var5++] = var257 + var258;
                            continue;
                        }
                        if (var369 == 4101) {
                            var5 -= 2;
                            String var259 = field406[var5];
                            String var260 = field406[var5 + 1];
                            field406[var5++] = var259 + var260;
                            continue;
                        }
                        if (var369 == 4102) {
                            var5--;
                            String var261 = field406[var5];
                            var4--;
                            int var262 = field393[var4];
                            String[] var263 = field406;
                            int var264 = var5++;
                            String var266;
                            if (var262 < 0) {
                                var266 = Integer.toString(var262);
                            } else {
                                var266 = class146.method2187(var262, 10, true);
                            }
                            var263[var264] = var261 + var266;
                            continue;
                        }
                        if (var369 == 4103) {
                            var5--;
                            String var267 = field406[var5];
                            field406[var5++] = var267.toLowerCase();
                            continue;
                        }
                        if (var369 == 4104) {
                            var4--;
                            int var268 = field393[var4];
                            long var269 = ((long) var268 + 11745L) * 86400000L;
                            field399.setTime(new Date(var269));
                            int var271 = field399.get(5);
                            int var272 = field399.get(2);
                            int var273 = field399.get(1);
                            field406[var5++] = var271 + "-" + field391[var272] + "-" + var273;
                            continue;
                        }
                        if (var369 == 4105) {
                            var5 -= 2;
                            String var274 = field406[var5];
                            String var275 = field406[var5 + 1];
                            if (Statics.field1033.field36 != null && Statics.field1033.field36.field2656) {
                                field406[var5++] = var275;
                                continue;
                            }
                            field406[var5++] = var274;
                            continue;
                        }
                        if (var369 == 4106) {
                            var4--;
                            int var276 = field393[var4];
                            field406[var5++] = Integer.toString(var276);
                            continue;
                        }
                        if (var369 == 4107) {
                            var5 -= 2;
                            int[] var277 = field393;
                            int var278 = var4++;
                            int var279 = class149.method2186(field406[var5], field406[var5 + 1], client.field476);
                            byte var280;
                            if (var279 > 0) {
                                var280 = 1;
                            } else if (var279 < 0) {
                                var280 = -1;
                            } else {
                                var280 = 0;
                            }
                            var277[var278] = var280;
                            continue;
                        }
                        if (var369 == 4108) {
                            var5--;
                            String var281 = field406[var5];
                            var4 -= 2;
                            int var282 = field393[var4];
                            int var283 = field393[var4 + 1];
                            byte[] var284 = Statics.field1430.method2951(var283, 0);
                            class181 var285 = new class181(var284);
                            field393[var4++] = var285.method3390(var281, var282);
                            continue;
                        }
                        if (var369 == 4109) {
                            var5--;
                            String var286 = field406[var5];
                            var4 -= 2;
                            int var287 = field393[var4];
                            int var288 = field393[var4 + 1];
                            byte[] var289 = Statics.field1430.method2951(var288, 0);
                            class181 var290 = new class181(var289);
                            field393[var4++] = var290.method3454(var286, var287);
                            continue;
                        }
                        if (var369 == 4110) {
                            var5 -= 2;
                            String var291 = field406[var5];
                            String var292 = field406[var5 + 1];
                            var4--;
                            if (field393[var4] == 1) {
                                field406[var5++] = var291;
                            } else {
                                field406[var5++] = var292;
                            }
                            continue;
                        }
                        if (var369 == 4111) {
                            var5--;
                            String var293 = field406[var5];
                            field406[var5++] = class183.method3391(var293);
                            continue;
                        }
                        if (var369 == 4112) {
                            var5--;
                            String var294 = field406[var5];
                            var4--;
                            int var295 = field393[var4];
                            field406[var5++] = var294 + (char) var295;
                            continue;
                        }
                        if (var369 == 4113) {
                            var4--;
                            int var296 = field393[var4];
                            int[] var297 = field393;
                            int var298 = var4++;
                            char var299 = (char) var296;
                            boolean var300;
                            if (var299 >= ' ' && var299 <= '~') {
                                var300 = true;
                            } else if (var299 >= 160 && var299 <= 255) {
                                var300 = true;
                            } else if (var299 == 8364 || var299 == 338 || var299 == 8212 || var299 == 339 || var299 == 376) {
                                var300 = true;
                            } else {
                                var300 = false;
                            }
                            var297[var298] = var300 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 4114) {
                            var4--;
                            int var301 = field393[var4];
                            field393[var4++] = class146.method2412((char) var301) ? 1 : 0;
                            continue;
                        }
                        if (var369 == 4115) {
                            var4--;
                            int var302 = field393[var4];
                            int[] var303 = field393;
                            int var304 = var4++;
                            char var305 = (char) var302;
                            boolean var306 = var305 >= 'A' && var305 <= 'Z' || var305 >= 'a' && var305 <= 'z';
                            var303[var304] = var306 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 4116) {
                            var4--;
                            int var307 = field393[var4];
                            int[] var308 = field393;
                            int var309 = var4++;
                            char var310 = (char) var307;
                            boolean var311 = var310 >= '0' && var310 <= '9';
                            var308[var309] = var311 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 4117) {
                            var5--;
                            String var312 = field406[var5];
                            if (var312 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var312.length();
                            }
                            continue;
                        }
                        if (var369 == 4118) {
                            var5--;
                            String var313 = field406[var5];
                            var4 -= 2;
                            int var314 = field393[var4];
                            int var315 = field393[var4 + 1];
                            field406[var5++] = var313.substring(var314, var315);
                            continue;
                        }
                        if (var369 == 4119) {
                            var5--;
                            String var316 = field406[var5];
                            StringBuilder var317 = new StringBuilder(var316.length());
                            boolean var318 = false;
                            for (int var319 = 0; var319 < var316.length(); var319++) {
                                char var320 = var316.charAt(var319);
                                if (var320 == '<') {
                                    var318 = true;
                                } else if (var320 == '>') {
                                    var318 = false;
                                } else if (!var318) {
                                    var317.append(var320);
                                }
                            }
                            field406[var5++] = var317.toString();
                            continue;
                        }
                        if (var369 == 4120) {
                            var5--;
                            String var321 = field406[var5];
                            var4--;
                            int var322 = field393[var4];
                            field393[var4++] = var321.indexOf(var322);
                            continue;
                        }
                    } else if (var369 < 4300) {
                        if (var369 == 4200) {
                            var4--;
                            int var323 = field393[var4];
                            field406[var5++] = class39.method2704(var323).field1026;
                            continue;
                        }
                        if (var369 == 4201) {
                            var4 -= 2;
                            int var324 = field393[var4];
                            int var325 = field393[var4 + 1];
                            class39 var326 = class39.method2704(var324);
                            if (var325 >= 1 && var325 <= 5 && var326.field1001[var325 - 1] != null) {
                                field406[var5++] = var326.field1001[var325 - 1];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 4202) {
                            var4 -= 2;
                            int var327 = field393[var4];
                            int var328 = field393[var4 + 1];
                            class39 var329 = class39.method2704(var327);
                            if (var328 >= 1 && var328 <= 5 && var329.field1002[var328 - 1] != null) {
                                field406[var5++] = var329.field1002[var328 - 1];
                                continue;
                            }
                            field406[var5++] = "";
                            continue;
                        }
                        if (var369 == 4203) {
                            var4--;
                            int var330 = field393[var4];
                            field393[var4++] = class39.method2704(var330).field1016;
                            continue;
                        }
                        if (var369 == 4204) {
                            var4--;
                            int var331 = field393[var4];
                            field393[var4++] = class39.method2704(var331).field998 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var369 == 4205) {
                            var4--;
                            int var332 = field393[var4];
                            class39 var333 = class39.method2704(var332);
                            if (var333.field982 == -1 && var333.field1017 >= 0) {
                                field393[var4++] = var333.field1017;
                                continue;
                            }
                            field393[var4++] = var332;
                            continue;
                        }
                        if (var369 == 4206) {
                            var4--;
                            int var334 = field393[var4];
                            class39 var335 = class39.method2704(var334);
                            if (var335.field982 >= 0 && var335.field1017 >= 0) {
                                field393[var4++] = var335.field1017;
                                continue;
                            }
                            field393[var4++] = var334;
                            continue;
                        }
                        if (var369 == 4207) {
                            var4--;
                            int var336 = field393[var4];
                            field393[var4++] = class39.method2704(var336).field1019 ? 1 : 0;
                            continue;
                        }
                    } else if (var369 < 5100) {
                        if (var369 == 5000) {
                            field393[var4++] = client.field691;
                            continue;
                        }
                        if (var369 == 5001) {
                            var4 -= 3;
                            client.field691 = field393[var4];
                            int var337 = field393[var4 + 1];
                            class136[] var338 = class136.method205();
                            int var339 = 0;
                            class136 var341;
                            while (true) {
                                if (var339 >= var338.length) {
                                    var341 = null;
                                    break;
                                }
                                class136 var340 = var338[var339];
                                if (var340.field2286 == var337) {
                                    var341 = var340;
                                    break;
                                }
                                var339++;
                            }
                            Statics.field1310 = var341;
                            if (Statics.field1310 == null) {
                                Statics.field1310 = class136.field2284;
                            }
                            client.field692 = field393[var4 + 2];
                            client.field512.method2307(142);
                            client.field512.method2462(client.field691);
                            client.field512.method2462(Statics.field1310.field2286);
                            client.field512.method2462(client.field692);
                            continue;
                        }
                        if (var369 == 5002) {
                            var5--;
                            String var342 = field406[var5];
                            var4 -= 2;
                            int var343 = field393[var4];
                            int var344 = field393[var4 + 1];
                            client.field512.method2307(39);
                            class115 var345 = client.field512;
                            int var346 = var342.length() + 1;
                            var345.method2462(var346 + 2);
                            client.field512.method2442(var342);
                            client.field512.method2462(var343 - 1);
                            client.field512.method2462(var344);
                            continue;
                        }
                        if (var369 == 5003) {
                            var4--;
                            int var347 = field393[var4];
                            String var348 = null;
                            if (var347 < 100) {
                                var348 = client.field688[var347];
                            }
                            if (var348 == null) {
                                var348 = "";
                            }
                            field406[var5++] = var348;
                            continue;
                        }
                        if (var369 == 5004) {
                            var4--;
                            int var349 = field393[var4];
                            int var350 = -1;
                            if (var349 < 100 && client.field688[var349] != null) {
                                var350 = client.field685[var349];
                            }
                            field393[var4++] = var350;
                            continue;
                        }
                        if (var369 == 5005) {
                            if (Statics.field1310 == null) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = Statics.field1310.field2286;
                            }
                            continue;
                        }
                        if (var369 == 5008) {
                            var5--;
                            String var351 = field406[var5];
                            if (var351.startsWith("::")) {
                                client.method27(var351);
                            } else {
                                String var352 = var351.toLowerCase();
                                byte var353 = 0;
                                if (var352.startsWith(class133.field2207)) {
                                    var353 = 0;
                                    var351 = var351.substring(class133.field2207.length());
                                } else if (var352.startsWith(class133.field2250)) {
                                    var353 = 1;
                                    var351 = var351.substring(class133.field2250.length());
                                } else if (var352.startsWith(class133.field2060)) {
                                    var353 = 2;
                                    var351 = var351.substring(class133.field2060.length());
                                } else if (var352.startsWith(class133.field2213)) {
                                    var353 = 3;
                                    var351 = var351.substring(class133.field2213.length());
                                } else if (var352.startsWith(class133.field2051)) {
                                    var353 = 4;
                                    var351 = var351.substring(class133.field2051.length());
                                } else if (var352.startsWith(class133.field2217)) {
                                    var353 = 5;
                                    var351 = var351.substring(class133.field2217.length());
                                } else if (var352.startsWith(class133.field2219)) {
                                    var353 = 6;
                                    var351 = var351.substring(class133.field2219.length());
                                } else if (var352.startsWith(class133.field2099)) {
                                    var353 = 7;
                                    var351 = var351.substring(class133.field2099.length());
                                } else if (var352.startsWith(class133.field2223)) {
                                    var353 = 8;
                                    var351 = var351.substring(class133.field2223.length());
                                } else if (var352.startsWith(class133.field2225)) {
                                    var353 = 9;
                                    var351 = var351.substring(class133.field2225.length());
                                } else if (var352.startsWith(class133.field2227)) {
                                    var353 = 10;
                                    var351 = var351.substring(class133.field2227.length());
                                } else if (var352.startsWith(class133.field2229)) {
                                    var353 = 11;
                                    var351 = var351.substring(class133.field2229.length());
                                } else if (client.field476 != 0) {
                                    if (var352.startsWith(class133.field2208)) {
                                        var353 = 0;
                                        var351 = var351.substring(class133.field2208.length());
                                    } else if (var352.startsWith(class133.field2149)) {
                                        var353 = 1;
                                        var351 = var351.substring(class133.field2149.length());
                                    } else if (var352.startsWith(class133.field2212)) {
                                        var353 = 2;
                                        var351 = var351.substring(class133.field2212.length());
                                    } else if (var352.startsWith(class133.field2124)) {
                                        var353 = 3;
                                        var351 = var351.substring(class133.field2124.length());
                                    } else if (var352.startsWith(class133.field2216)) {
                                        var353 = 4;
                                        var351 = var351.substring(class133.field2216.length());
                                    } else if (var352.startsWith(class133.field2190)) {
                                        var353 = 5;
                                        var351 = var351.substring(class133.field2190.length());
                                    } else if (var352.startsWith(class133.field2240)) {
                                        var353 = 6;
                                        var351 = var351.substring(class133.field2240.length());
                                    } else if (var352.startsWith(class133.field2222)) {
                                        var353 = 7;
                                        var351 = var351.substring(class133.field2222.length());
                                    } else if (var352.startsWith(class133.field2224)) {
                                        var353 = 8;
                                        var351 = var351.substring(class133.field2224.length());
                                    } else if (var352.startsWith(class133.field2226)) {
                                        var353 = 9;
                                        var351 = var351.substring(class133.field2226.length());
                                    } else if (var352.startsWith(class133.field2130)) {
                                        var353 = 10;
                                        var351 = var351.substring(class133.field2130.length());
                                    } else if (var352.startsWith(class133.field2230)) {
                                        var353 = 11;
                                        var351 = var351.substring(class133.field2230.length());
                                    }
                                }
                                String var354 = var351.toLowerCase();
                                byte var355 = 0;
                                if (var354.startsWith(class133.field2231)) {
                                    var355 = 1;
                                    var351 = var351.substring(class133.field2231.length());
                                } else if (var354.startsWith(class133.field2233)) {
                                    var355 = 2;
                                    var351 = var351.substring(class133.field2233.length());
                                } else if (var354.startsWith(class133.field2235)) {
                                    var355 = 3;
                                    var351 = var351.substring(class133.field2235.length());
                                } else if (var354.startsWith(class133.field2127)) {
                                    var355 = 4;
                                    var351 = var351.substring(class133.field2127.length());
                                } else if (var354.startsWith(class133.field2253)) {
                                    var355 = 5;
                                    var351 = var351.substring(class133.field2253.length());
                                } else if (client.field476 != 0) {
                                    if (var354.startsWith(class133.field2234)) {
                                        var355 = 1;
                                        var351 = var351.substring(class133.field2234.length());
                                    } else if (var354.startsWith(class133.field2175)) {
                                        var355 = 2;
                                        var351 = var351.substring(class133.field2175.length());
                                    } else if (var354.startsWith(class133.field2236)) {
                                        var355 = 3;
                                        var351 = var351.substring(class133.field2236.length());
                                    } else if (var354.startsWith(class133.field2238)) {
                                        var355 = 4;
                                        var351 = var351.substring(class133.field2238.length());
                                    } else if (var354.startsWith(class133.field2110)) {
                                        var355 = 5;
                                        var351 = var351.substring(class133.field2110.length());
                                    }
                                }
                                client.field512.method2307(45);
                                client.field512.method2462(0);
                                int var356 = client.field512.field2003;
                                client.field512.method2462(var353);
                                client.field512.method2462(var355);
                                class182.method2027(client.field512, var351);
                                client.field512.method2447(client.field512.field2003 - var356);
                            }
                            continue;
                        }
                        if (var369 == 5009) {
                            var5 -= 2;
                            String var357 = field406[var5];
                            String var358 = field406[var5 + 1];
                            client.field512.method2307(31);
                            client.field512.method2438(0);
                            int var359 = client.field512.field2003;
                            client.field512.method2442(var357);
                            class182.method2027(client.field512, var358);
                            client.field512.method2446(client.field512.field2003 - var359);
                            continue;
                        }
                        if (var369 == 5010) {
                            var4--;
                            int var360 = field393[var4];
                            String var361 = null;
                            if (var360 < 100) {
                                var361 = client.field686[var360];
                            }
                            if (var361 == null) {
                                var361 = "";
                            }
                            field406[var5++] = var361;
                            continue;
                        }
                        if (var369 == 5011) {
                            var4--;
                            int var362 = field393[var4];
                            String var363 = null;
                            if (var362 < 100) {
                                var363 = client.field687[var362];
                            }
                            if (var363 == null) {
                                var363 = "";
                            }
                            field406[var5++] = var363;
                            continue;
                        }
                        if (var369 == 5015) {
                            String var364;
                            if (Statics.field1033 == null || Statics.field1033.field51 == null) {
                                var364 = "";
                            } else {
                                var364 = Statics.field1033.field51;
                            }
                            field406[var5++] = var364;
                            continue;
                        }
                        if (var369 == 5016) {
                            field393[var4++] = client.field692;
                            continue;
                        }
                        if (var369 == 5017) {
                            field393[var4++] = client.field689;
                            continue;
                        }
                    }
                } else {
                    class156 var74;
                    if (var369 >= 2000) {
                        var369 -= 1000;
                        var4--;
                        var74 = class156.method2431(field393[var4]);
                    } else {
                        var74 = var51 ? Statics.field398 : Statics.field397;
                    }
                    if (var369 == 1300) {
                        var4--;
                        int var75 = field393[var4] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var5--;
                            var74.method3089(var75, field406[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var369 == 1301) {
                        var4 -= 2;
                        int var76 = field393[var4];
                        int var77 = field393[var4 + 1];
                        var74.field2576 = class156.method2911(var76, var77);
                        continue;
                    }
                    if (var369 == 1302) {
                        var4--;
                        var74.field2579 = field393[var4] == 1;
                        continue;
                    }
                    if (var369 == 1303) {
                        var4--;
                        var74.field2577 = field393[var4];
                        continue;
                    }
                    if (var369 == 1304) {
                        var4--;
                        var74.field2603 = field393[var4];
                        continue;
                    }
                    if (var369 == 1305) {
                        var5--;
                        var74.field2535 = field406[var5];
                        continue;
                    }
                    if (var369 == 1306) {
                        var5--;
                        var74.field2593 = field406[var5];
                        continue;
                    }
                    if (var369 == 1307) {
                        var74.field2575 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var368) {
            StringBuilder var366 = new StringBuilder(30);
            var366.append("").append(var3.field2755).append(" ");
            for (int var367 = field407 - 1; var367 >= 0; var367--) {
                var366.append("").append(field396[var367].field267.field2755).append(" ");
            }
            var366.append("").append(var9);
            class79.method218(var366.toString(), var368);
        }
    }

    @ObfuscatedName("bm.h(II)V")
    public static void method1328(int arg0) {
        if (arg0 == -1 || !class156.method132(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2537[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3.field2582 != null) {
                class1 var4 = new class1();
                var4.field15 = var3;
                var4.field13 = var3.field2582;
                method226(var4);
            }
        }
    }
}
