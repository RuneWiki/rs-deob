package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("d")
public class class25 {

    @ObfuscatedName("d.y")
    public static int[] field388 = new int[5];

    @ObfuscatedName("d.x")
    public static int[][] field389 = new int[5][5000];

    @ObfuscatedName("d.e")
    public static int[] field390 = new int[1000];

    @ObfuscatedName("d.m")
    public static String[] field387 = new String[1000];

    @ObfuscatedName("d.s")
    public static int field392 = 0;

    @ObfuscatedName("d.p")
    public static class17[] field393 = new class17[50];

    @ObfuscatedName("d.n")
    public static Calendar field386 = Calendar.getInstance();

    @ObfuscatedName("d.b")
    public static final String[] field396 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.c(Lc;I)V")
    public static void method790(class1 arg0) {
        Object[] var1 = arg0.field4;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method163(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field75;
        int[] var8 = var3.field76;
        byte var9 = -1;
        field392 = 0;
        try {
            Statics.field385 = new int[var3.field78];
            int var10 = 0;
            Statics.field391 = new String[var3.field79];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field14;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2528;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2616;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2528;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2616;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field16;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field385[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field391[var11++] = var14;
                }
            }
            int var15 = 0;
            label2327: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var368 = var7[var6];
                if (var368 < 100) {
                    if (var368 == 0) {
                        field390[var4++] = var8[var6];
                        continue;
                    }
                    if (var368 == 1) {
                        int var16 = var8[var6];
                        field390[var4++] = class157.field2649[var16];
                        continue;
                    }
                    if (var368 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class157.field2649[var17] = field390[var4];
                        continue;
                    }
                    if (var368 == 3) {
                        field387[var5++] = var3.field84[var6];
                        continue;
                    }
                    if (var368 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var368 == 7) {
                        var4 -= 2;
                        if (field390[var4 + 1] != field390[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 8) {
                        var4 -= 2;
                        if (field390[var4 + 1] == field390[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 9) {
                        var4 -= 2;
                        if (field390[var4] < field390[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 10) {
                        var4 -= 2;
                        if (field390[var4] > field390[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 21) {
                        if (field392 == 0) {
                            return;
                        }
                        class17 var18 = field393[--field392];
                        var3 = var18.field272;
                        var7 = var3.field75;
                        var8 = var3.field76;
                        var6 = var18.field264;
                        Statics.field385 = var18.field263;
                        Statics.field391 = var18.field266;
                        continue;
                    }
                    if (var368 == 25) {
                        int var19 = var8[var6];
                        field390[var4++] = class157.method125(var19);
                        continue;
                    }
                    if (var368 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class157.method1188(var20, field390[var4]);
                        continue;
                    }
                    if (var368 == 31) {
                        var4 -= 2;
                        if (field390[var4] <= field390[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 32) {
                        var4 -= 2;
                        if (field390[var4] >= field390[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var368 == 33) {
                        field390[var4++] = Statics.field385[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var368 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field385[var10001] = field390[var4];
                        continue;
                    }
                    if (var368 == 35) {
                        field387[var5++] = Statics.field391[var8[var6]];
                        continue;
                    }
                    if (var368 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field391[var10001] = field387[var5];
                        continue;
                    }
                    if (var368 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class146.method2257(field387, var5, var21);
                        field387[var5++] = var22;
                        continue;
                    }
                    if (var368 == 38) {
                        var4--;
                        continue;
                    }
                    if (var368 == 39) {
                        var5--;
                        continue;
                    }
                    if (var368 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method163(var23);
                        int[] var25 = new int[var24.field78];
                        String[] var26 = new String[var24.field79];
                        for (int var27 = 0; var27 < var24.field80; var27++) {
                            var25[var27] = field390[var4 - var24.field80 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field81; var28++) {
                            var26[var28] = field387[var5 - var24.field81 + var28];
                        }
                        var4 -= var24.field80;
                        var5 -= var24.field81;
                        class17 var29 = new class17();
                        var29.field272 = var3;
                        var29.field264 = var6;
                        var29.field263 = Statics.field385;
                        var29.field266 = Statics.field391;
                        field393[++field392 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field75;
                        var8 = var24.field76;
                        var6 = -1;
                        Statics.field385 = var25;
                        Statics.field391 = var26;
                        continue;
                    }
                    if (var368 == 42) {
                        field390[var4++] = client.field585[var8[var6]];
                        continue;
                    }
                    if (var368 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field585[var10001] = field390[var4];
                        continue;
                    }
                    if (var368 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field390[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field388[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2327;
                                }
                                field389[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field390[var4];
                        if (var36 >= 0 && var36 < field388[var35]) {
                            field390[var4++] = field389[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field390[var4];
                        if (var38 >= 0 && var38 < field388[var37]) {
                            field389[var37][var38] = field390[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var368 == 47) {
                        String var39 = client.field534[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field387[var5++] = var39;
                        continue;
                    }
                    if (var368 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field534[var10001] = field387[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var368 < 1000) {
                    if (var368 == 100) {
                        var4 -= 3;
                        int var41 = field390[var4];
                        int var42 = field390[var4 + 1];
                        int var43 = field390[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class156 var44 = class156.method2702(var41);
                        if (var44.field2636 == null) {
                            var44.field2636 = new class156[var43 + 1];
                        }
                        if (var44.field2636.length <= var43) {
                            class156[] var45 = new class156[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2636.length; var46++) {
                                var45[var46] = var44.field2636[var46];
                            }
                            var44.field2636 = var45;
                        }
                        if (var43 > 0 && var44.field2636[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class156 var47 = new class156();
                        var47.field2643 = var42;
                        var47.field2539 = var47.field2528 = var44.field2528;
                        var47.field2616 = var43;
                        var47.field2527 = true;
                        var44.field2636[var43] = var47;
                        if (var40) {
                            Statics.field394 = var47;
                        } else {
                            Statics.field2308 = var47;
                        }
                        client.method166(var44);
                        continue;
                    }
                    if (var368 == 101) {
                        class156 var48 = var40 ? Statics.field394 : Statics.field2308;
                        class156 var49 = class156.method2702(var48.field2528);
                        var49.field2636[var48.field2616] = null;
                        client.method166(var49);
                        continue;
                    }
                    if (var368 == 102) {
                        var4--;
                        class156 var50 = class156.method2702(field390[var4]);
                        var50.field2636 = null;
                        client.method166(var50);
                        continue;
                    }
                    if (var368 == 200) {
                        var4 -= 2;
                        int var51 = field390[var4];
                        int var52 = field390[var4 + 1];
                        class156 var53 = class156.method124(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field390[var4++] = 1;
                            if (var40) {
                                Statics.field394 = var53;
                            } else {
                                Statics.field2308 = var53;
                            }
                            continue;
                        }
                        field390[var4++] = 0;
                        continue;
                    }
                } else if (!(var368 < 1000 || var368 >= 1100) || !(var368 < 2000 || var368 >= 2100)) {
                    class156 var54;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var54 = class156.method2702(field390[var4]);
                    } else {
                        var54 = var40 ? Statics.field394 : Statics.field2308;
                    }
                    if (var368 == 1000) {
                        var4 -= 2;
                        var54.field2533 = field390[var4];
                        var54.field2534 = field390[var4 + 1];
                        client.method166(var54);
                        continue;
                    }
                    if (var368 == 1001) {
                        var4 -= 2;
                        var54.field2537 = field390[var4];
                        var54.field2538 = field390[var4 + 1];
                        client.method166(var54);
                        continue;
                    }
                    if (var368 == 1003) {
                        var4--;
                        boolean var55 = field390[var4] == 1;
                        if (var54.field2567 != var55) {
                            var54.field2567 = var55;
                            client.method166(var54);
                        }
                        continue;
                    }
                } else if (!(var368 < 1100 || var368 >= 1200) || !(var368 < 2100 || var368 >= 2200)) {
                    class156 var56;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var56 = class156.method2702(field390[var4]);
                    } else {
                        var56 = var40 ? Statics.field394 : Statics.field2308;
                    }
                    if (var368 == 1100) {
                        var4 -= 2;
                        var56.field2541 = field390[var4];
                        if (var56.field2541 > var56.field2543 - var56.field2537) {
                            var56.field2541 = var56.field2543 - var56.field2537;
                        }
                        if (var56.field2541 < 0) {
                            var56.field2541 = 0;
                        }
                        var56.field2587 = field390[var4 + 1];
                        if (var56.field2587 > var56.field2544 - var56.field2538) {
                            var56.field2587 = var56.field2544 - var56.field2538;
                        }
                        if (var56.field2587 < 0) {
                            var56.field2587 = 0;
                        }
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1101) {
                        var4--;
                        var56.field2623 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1102) {
                        var4--;
                        var56.field2591 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1103) {
                        var4--;
                        var56.field2595 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1104) {
                        var4--;
                        var56.field2551 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1105) {
                        var4--;
                        var56.field2552 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1106) {
                        var4--;
                        var56.field2554 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1107) {
                        var4--;
                        var56.field2555 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1108) {
                        var56.field2560 = 1;
                        var4--;
                        var56.field2561 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1109) {
                        var4 -= 6;
                        var56.field2566 = field390[var4];
                        var56.field2570 = field390[var4 + 1];
                        var56.field2568 = field390[var4 + 2];
                        var56.field2569 = field390[var4 + 3];
                        var56.field2550 = field390[var4 + 4];
                        var56.field2581 = field390[var4 + 5];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1110) {
                        var4--;
                        int var57 = field390[var4];
                        if (var56.field2564 != var57) {
                            var56.field2564 = var57;
                            var56.field2634 = 0;
                            var56.field2635 = 0;
                            client.method166(var56);
                        }
                        continue;
                    }
                    if (var368 == 1111) {
                        var4--;
                        var56.field2640 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1112) {
                        var5--;
                        String var58 = field387[var5];
                        if (!var58.equals(var56.field2575)) {
                            var56.field2575 = var58;
                            client.method166(var56);
                        }
                        continue;
                    }
                    if (var368 == 1113) {
                        var4--;
                        var56.field2574 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1114) {
                        var4 -= 3;
                        var56.field2578 = field390[var4];
                        var56.field2579 = field390[var4 + 1];
                        var56.field2610 = field390[var4 + 2];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1115) {
                        var4--;
                        var56.field2580 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1116) {
                        var4--;
                        var56.field2556 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1117) {
                        var4--;
                        var56.field2557 = field390[var4];
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1118) {
                        var4--;
                        var56.field2558 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1119) {
                        var4--;
                        var56.field2559 = field390[var4] == 1;
                        client.method166(var56);
                        continue;
                    }
                    if (var368 == 1120) {
                        var4 -= 2;
                        var56.field2543 = field390[var4];
                        var56.field2544 = field390[var4 + 1];
                        client.method166(var56);
                        continue;
                    }
                } else if (var368 >= 1200 && var368 < 1300 || var368 >= 2200 && var368 < 2300) {
                    class156 var59;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var59 = class156.method2702(field390[var4]);
                    } else {
                        var59 = var40 ? Statics.field394 : Statics.field2308;
                    }
                    client.method166(var59);
                    if (var368 == 1200) {
                        var4 -= 2;
                        int var60 = field390[var4];
                        int var61 = field390[var4 + 1];
                        var59.field2644 = var60;
                        var59.field2519 = var61;
                        class39 var62 = class39.method2570(var60);
                        var59.field2568 = var62.field971;
                        var59.field2569 = var62.field962;
                        var59.field2550 = var62.field973;
                        var59.field2566 = var62.field974;
                        var59.field2570 = var62.field975;
                        var59.field2581 = var62.field956;
                        if (var59.field2537 > 0) {
                            var59.field2581 = var59.field2581 * 32 / var59.field2537;
                        }
                        continue;
                    }
                    if (var368 == 1201) {
                        var59.field2560 = 2;
                        var4--;
                        var59.field2561 = field390[var4];
                        continue;
                    }
                    if (var368 == 1202) {
                        var59.field2560 = 3;
                        var59.field2561 = Statics.field1623.field43.method3016();
                        continue;
                    }
                } else if (var368 >= 1300 && var368 < 1400 || var368 >= 2300 && var368 < 2400) {
                    class156 var63;
                    if (var368 >= 2000) {
                        var368 -= 1000;
                        var4--;
                        var63 = class156.method2702(field390[var4]);
                    } else {
                        var63 = var40 ? Statics.field394 : Statics.field2308;
                    }
                    if (var368 == 1300) {
                        var4--;
                        int var64 = field390[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method2947(var64, field387[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var368 == 1301) {
                        var4 -= 2;
                        int var65 = field390[var4];
                        int var66 = field390[var4 + 1];
                        var63.field2590 = class156.method124(var65, var66);
                        continue;
                    }
                    if (var368 == 1302) {
                        var4--;
                        var63.field2593 = field390[var4] == 1;
                        continue;
                    }
                    if (var368 == 1303) {
                        var4--;
                        var63.field2545 = field390[var4];
                        continue;
                    }
                    if (var368 == 1304) {
                        var4--;
                        var63.field2592 = field390[var4];
                        continue;
                    }
                    if (var368 == 1305) {
                        var5--;
                        var63.field2588 = field387[var5];
                        continue;
                    }
                    if (var368 == 1306) {
                        var5--;
                        var63.field2542 = field387[var5];
                        continue;
                    }
                    if (var368 == 1307) {
                        var63.field2589 = null;
                        continue;
                    }
                } else {
                    if (var368 >= 1400 && var368 < 1500 || var368 >= 2400 && var368 < 2500) {
                        class156 var67;
                        if (var368 >= 2000) {
                            var368 -= 1000;
                            var4--;
                            var67 = class156.method2702(field390[var4]);
                        } else {
                            var67 = var40 ? Statics.field394 : Statics.field2308;
                        }
                        var5--;
                        String var68 = field387[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field390[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field390[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field387[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field390[var4]);
                            }
                        }
                        var4--;
                        int var73 = field390[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var368 == 1400) {
                            var67.field2619 = var71;
                        }
                        if (var368 == 1401) {
                            var67.field2600 = var71;
                        }
                        if (var368 == 1402) {
                            var67.field2599 = var71;
                        }
                        if (var368 == 1403) {
                            var67.field2540 = var71;
                        }
                        if (var368 == 1404) {
                            var67.field2603 = var71;
                        }
                        if (var368 == 1405) {
                            var67.field2604 = var71;
                        }
                        if (var368 == 1406) {
                            var67.field2607 = var71;
                        }
                        if (var368 == 1407) {
                            var67.field2523 = var71;
                            var67.field2620 = var69;
                        }
                        if (var368 == 1408) {
                            var67.field2617 = var71;
                        }
                        if (var368 == 1409) {
                            var67.field2601 = var71;
                        }
                        if (var368 == 1410) {
                            var67.field2605 = var71;
                        }
                        if (var368 == 1411) {
                            var67.field2520 = var71;
                        }
                        if (var368 == 1412) {
                            var67.field2530 = var71;
                        }
                        if (var368 == 1414) {
                            var67.field2594 = var71;
                            var67.field2611 = var69;
                        }
                        if (var368 == 1415) {
                            var67.field2612 = var71;
                            var67.field2609 = var69;
                        }
                        if (var368 == 1416) {
                            var67.field2606 = var71;
                        }
                        if (var368 == 1417) {
                            var67.field2613 = var71;
                        }
                        if (var368 == 1418) {
                            var67.field2608 = var71;
                        }
                        if (var368 == 1419) {
                            var67.field2618 = var71;
                        }
                        if (var368 == 1420) {
                            var67.field2597 = var71;
                        }
                        if (var368 == 1421) {
                            var67.field2577 = var71;
                        }
                        if (var368 == 1422) {
                            var67.field2621 = var71;
                        }
                        if (var368 == 1423) {
                            var67.field2622 = var71;
                        }
                        if (var368 == 1424) {
                            var67.field2598 = var71;
                        }
                        var67.field2525 = true;
                        continue;
                    }
                    if (var368 < 1600) {
                        class156 var74 = var40 ? Statics.field394 : Statics.field2308;
                        if (var368 == 1500) {
                            field390[var4++] = var74.field2533;
                            continue;
                        }
                        if (var368 == 1501) {
                            field390[var4++] = var74.field2534;
                            continue;
                        }
                        if (var368 == 1502) {
                            field390[var4++] = var74.field2537;
                            continue;
                        }
                        if (var368 == 1503) {
                            field390[var4++] = var74.field2538;
                            continue;
                        }
                        if (var368 == 1504) {
                            field390[var4++] = var74.field2567 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 1505) {
                            field390[var4++] = var74.field2539;
                            continue;
                        }
                    } else if (var368 < 1700) {
                        class156 var75 = var40 ? Statics.field394 : Statics.field2308;
                        if (var368 == 1600) {
                            field390[var4++] = var75.field2541;
                            continue;
                        }
                        if (var368 == 1601) {
                            field390[var4++] = var75.field2587;
                            continue;
                        }
                        if (var368 == 1602) {
                            field387[var5++] = var75.field2575;
                            continue;
                        }
                        if (var368 == 1603) {
                            field390[var4++] = var75.field2543;
                            continue;
                        }
                        if (var368 == 1604) {
                            field390[var4++] = var75.field2544;
                            continue;
                        }
                        if (var368 == 1605) {
                            field390[var4++] = var75.field2581;
                            continue;
                        }
                        if (var368 == 1606) {
                            field390[var4++] = var75.field2568;
                            continue;
                        }
                        if (var368 == 1607) {
                            field390[var4++] = var75.field2550;
                            continue;
                        }
                        if (var368 == 1608) {
                            field390[var4++] = var75.field2569;
                            continue;
                        }
                    } else if (var368 < 1800) {
                        class156 var76 = var40 ? Statics.field394 : Statics.field2308;
                        if (var368 == 1700) {
                            field390[var4++] = var76.field2644;
                            continue;
                        }
                        if (var368 == 1701) {
                            if (var76.field2644 == -1) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = var76.field2519;
                            }
                            continue;
                        }
                        if (var368 == 1702) {
                            field390[var4++] = var76.field2616;
                            continue;
                        }
                    } else if (var368 < 1900) {
                        class156 var77 = var40 ? Statics.field394 : Statics.field2308;
                        if (var368 == 1800) {
                            int[] var78 = field390;
                            int var79 = var4++;
                            int var80 = client.method2194(var77);
                            int var81 = var80 >> 11 & 0x3F;
                            var78[var79] = var81;
                            continue;
                        }
                        if (var368 == 1801) {
                            var4--;
                            int var82 = field390[var4];
                            int var369 = var82 - 1;
                            if (var77.field2589 != null && var369 < var77.field2589.length && var77.field2589[var369] != null) {
                                field387[var5++] = var77.field2589[var369];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 1802) {
                            if (var77.field2588 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = var77.field2588;
                            }
                            continue;
                        }
                    } else if (var368 < 2600) {
                        var4--;
                        class156 var83 = class156.method2702(field390[var4]);
                        if (var368 == 2500) {
                            field390[var4++] = var83.field2533;
                            continue;
                        }
                        if (var368 == 2501) {
                            field390[var4++] = var83.field2534;
                            continue;
                        }
                        if (var368 == 2502) {
                            field390[var4++] = var83.field2537;
                            continue;
                        }
                        if (var368 == 2503) {
                            field390[var4++] = var83.field2538;
                            continue;
                        }
                        if (var368 == 2504) {
                            field390[var4++] = var83.field2567 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 2505) {
                            field390[var4++] = var83.field2539;
                            continue;
                        }
                    } else if (var368 < 2700) {
                        var4--;
                        class156 var84 = class156.method2702(field390[var4]);
                        if (var368 == 2600) {
                            field390[var4++] = var84.field2541;
                            continue;
                        }
                        if (var368 == 2601) {
                            field390[var4++] = var84.field2587;
                            continue;
                        }
                        if (var368 == 2602) {
                            field387[var5++] = var84.field2575;
                            continue;
                        }
                        if (var368 == 2603) {
                            field390[var4++] = var84.field2543;
                            continue;
                        }
                        if (var368 == 2604) {
                            field390[var4++] = var84.field2544;
                            continue;
                        }
                        if (var368 == 2605) {
                            field390[var4++] = var84.field2581;
                            continue;
                        }
                        if (var368 == 2606) {
                            field390[var4++] = var84.field2568;
                            continue;
                        }
                        if (var368 == 2607) {
                            field390[var4++] = var84.field2550;
                            continue;
                        }
                        if (var368 == 2608) {
                            field390[var4++] = var84.field2569;
                            continue;
                        }
                    } else if (var368 < 2800) {
                        if (var368 == 2700) {
                            var4--;
                            class156 var85 = class156.method2702(field390[var4]);
                            field390[var4++] = var85.field2644;
                            continue;
                        }
                        if (var368 == 2701) {
                            var4--;
                            class156 var86 = class156.method2702(field390[var4]);
                            if (var86.field2644 == -1) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = var86.field2519;
                            }
                            continue;
                        }
                        if (var368 == 2702) {
                            var4--;
                            int var87 = field390[var4];
                            class4 var88 = (class4) client.field627.method3129((long) var87);
                            if (var88 == null) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var368 < 2900) {
                        var4--;
                        class156 var89 = class156.method2702(field390[var4]);
                        if (var368 == 2800) {
                            int[] var90 = field390;
                            int var91 = var4++;
                            int var92 = client.method2194(var89);
                            int var93 = var92 >> 11 & 0x3F;
                            var90[var91] = var93;
                            continue;
                        }
                        if (var368 == 2801) {
                            var4--;
                            int var94 = field390[var4];
                            int var370 = var94 - 1;
                            if (var89.field2589 != null && var370 < var89.field2589.length && var89.field2589[var370] != null) {
                                field387[var5++] = var89.field2589[var370];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 2802) {
                            if (var89.field2588 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = var89.field2588;
                            }
                            continue;
                        }
                    } else if (var368 < 3200) {
                        if (var368 == 3100) {
                            var5--;
                            String var95 = field387[var5];
                            client.method56(0, "", var95);
                            continue;
                        }
                        if (var368 == 3101) {
                            var4 -= 2;
                            Statics.method773(Statics.field1623, field390[var4], field390[var4 + 1]);
                            continue;
                        }
                        if (var368 == 3103) {
                            client.field505.method2198(147);
                            for (class4 var96 = (class4) client.field627.method3141(); var96 != null; var96 = (class4) client.field627.method3128()) {
                                if (var96.field64 == 0 || var96.field64 == 3) {
                                    client.method2562(var96, true);
                                }
                            }
                            if (client.field630 != null) {
                                client.method166(client.field630);
                                client.field630 = null;
                            }
                            continue;
                        }
                        if (var368 == 3104) {
                            var5--;
                            String var97 = field387[var5];
                            int var98 = 0;
                            if (class146.method1590(var97)) {
                                var98 = class146.method2643(var97);
                            }
                            client.field505.method2198(47);
                            client.field505.method2316(var98);
                            continue;
                        }
                        if (var368 == 3105) {
                            var5--;
                            String var99 = field387[var5];
                            client.field505.method2198(131);
                            client.field505.method2339(var99.length() + 1);
                            client.field505.method2318(var99);
                            continue;
                        }
                        if (var368 == 3106) {
                            var5--;
                            String var100 = field387[var5];
                            client.field505.method2198(148);
                            client.field505.method2339(var100.length() + 1);
                            client.field505.method2318(var100);
                            continue;
                        }
                        if (var368 == 3107) {
                            var4--;
                            int var101 = field390[var4];
                            var5--;
                            String var102 = field387[var5];
                            boolean var103 = false;
                            for (int var104 = 0; var104 < client.field677; var104++) {
                                class3 var105 = client.field562[client.field587[var104]];
                                if (var105 != null && var105.field58 != null && var105.field58.equalsIgnoreCase(var102)) {
                                    client.method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var105.field457[0], var105.field458[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var101 == 1) {
                                        client.field505.method2198(83);
                                        client.field505.method2381(client.field587[var104]);
                                    } else if (var101 == 4) {
                                        client.field505.method2198(48);
                                        client.field505.method2492(client.field587[var104]);
                                    } else if (var101 == 6) {
                                        client.field505.method2198(82);
                                        client.field505.method2492(client.field587[var104]);
                                    } else if (var101 == 7) {
                                        client.field505.method2198(125);
                                        client.field505.method2381(client.field587[var104]);
                                    }
                                    var103 = true;
                                    break;
                                }
                            }
                            if (!var103) {
                                client.method56(0, "", class133.field2243 + var102);
                            }
                            continue;
                        }
                        if (var368 == 3108) {
                            var4 -= 3;
                            int var106 = field390[var4];
                            int var107 = field390[var4 + 1];
                            int var108 = field390[var4 + 2];
                            class156 var109 = class156.method2702(var108);
                            client.method12(var109, var106, var107);
                            continue;
                        }
                        if (var368 == 3109) {
                            var4 -= 2;
                            int var110 = field390[var4];
                            int var111 = field390[var4 + 1];
                            class156 var112 = var40 ? Statics.field394 : Statics.field2308;
                            client.method12(var112, var110, var111);
                            continue;
                        }
                    } else if (var368 < 3300) {
                        if (var368 == 3200) {
                            var4 -= 3;
                            int var113 = field390[var4];
                            int var114 = field390[var4 + 1];
                            int var115 = field390[var4 + 2];
                            if (client.field596 != 0 && var114 != 0 && client.field695 < 50) {
                                client.field706[client.field695] = var113;
                                client.field707[client.field695] = var114;
                                client.field708[client.field695] = var115;
                                client.field539[client.field695] = null;
                                client.field575[client.field695] = 0;
                                client.field695++;
                            }
                            continue;
                        }
                        if (var368 == 3201) {
                            var4--;
                            client.method2115(field390[var4]);
                            continue;
                        }
                        if (var368 == 3202) {
                            var4 -= 2;
                            client.method60(field390[var4], field390[var4 + 1]);
                            continue;
                        }
                    } else if (var368 < 3400) {
                        if (var368 == 3300) {
                            field390[var4++] = client.field516;
                            continue;
                        }
                        if (var368 == 3301) {
                            var4 -= 2;
                            int var116 = field390[var4];
                            int var117 = field390[var4 + 1];
                            field390[var4++] = class18.method2706(var116, var117);
                            continue;
                        }
                        if (var368 == 3302) {
                            var4 -= 2;
                            int var118 = field390[var4];
                            int var119 = field390[var4 + 1];
                            field390[var4++] = class18.method148(var118, var119);
                            continue;
                        }
                        if (var368 == 3303) {
                            var4 -= 2;
                            int var120 = field390[var4];
                            int var121 = field390[var4 + 1];
                            field390[var4++] = class18.method208(var120, var121);
                            continue;
                        }
                        if (var368 == 3304) {
                            var4--;
                            int var122 = field390[var4];
                            field390[var4++] = class40.method1541(var122).field1011;
                            continue;
                        }
                        if (var368 == 3305) {
                            var4--;
                            int var123 = field390[var4];
                            field390[var4++] = client.field621[var123];
                            continue;
                        }
                        if (var368 == 3306) {
                            var4--;
                            int var124 = field390[var4];
                            field390[var4++] = client.field666[var124];
                            continue;
                        }
                        if (var368 == 3307) {
                            var4--;
                            int var125 = field390[var4];
                            field390[var4++] = client.field605[var125];
                            continue;
                        }
                        if (var368 == 3308) {
                            int var126 = Statics.field208;
                            int var127 = (Statics.field1623.field446 >> 7) + Statics.field1738;
                            int var128 = (Statics.field1623.field406 >> 7) + Statics.field277;
                            field390[var4++] = (var126 << 28) + (var127 << 14) + var128;
                            continue;
                        }
                        if (var368 == 3309) {
                            var4--;
                            int var129 = field390[var4];
                            field390[var4++] = var129 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3310) {
                            var4--;
                            int var130 = field390[var4];
                            field390[var4++] = var130 >> 28;
                            continue;
                        }
                        if (var368 == 3311) {
                            var4--;
                            int var131 = field390[var4];
                            field390[var4++] = var131 & 0x3FFF;
                            continue;
                        }
                        if (var368 == 3312) {
                            field390[var4++] = client.field470 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3313) {
                            var4 -= 2;
                            int var132 = field390[var4] + 32768;
                            int var133 = field390[var4 + 1];
                            field390[var4++] = class18.method2706(var132, var133);
                            continue;
                        }
                        if (var368 == 3314) {
                            var4 -= 2;
                            int var134 = field390[var4] + 32768;
                            int var135 = field390[var4 + 1];
                            field390[var4++] = class18.method148(var134, var135);
                            continue;
                        }
                        if (var368 == 3315) {
                            var4 -= 2;
                            int var136 = field390[var4] + 32768;
                            int var137 = field390[var4 + 1];
                            field390[var4++] = class18.method208(var136, var137);
                            continue;
                        }
                        if (var368 == 3316) {
                            if (client.field569 >= 2) {
                                field390[var4++] = client.field569;
                            } else {
                                field390[var4++] = 0;
                            }
                            continue;
                        }
                        if (var368 == 3317) {
                            field390[var4++] = client.field483;
                            continue;
                        }
                        if (var368 == 3318) {
                            field390[var4++] = client.field467;
                            continue;
                        }
                        if (var368 == 3321) {
                            field390[var4++] = client.field631;
                            continue;
                        }
                        if (var368 == 3322) {
                            field390[var4++] = client.field632;
                            continue;
                        }
                        if (var368 == 3323) {
                            if (client.field586) {
                                field390[var4++] = 1;
                            } else {
                                field390[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3500) {
                        if (var368 == 3400) {
                            var4 -= 2;
                            int var138 = field390[var4];
                            int var139 = field390[var4 + 1];
                            class38 var140 = class38.method140(var138);
                            if (var140.field945 != 's') {
                            }
                            for (int var141 = 0; var141 < var140.field942; var141++) {
                                if (var140.field948[var141] == var139) {
                                    field387[var5++] = var140.field951[var141];
                                    var140 = null;
                                    break;
                                }
                            }
                            if (var140 != null) {
                                field387[var5++] = var140.field946;
                            }
                            continue;
                        }
                        if (var368 == 3408) {
                            var4 -= 4;
                            int var142 = field390[var4];
                            int var143 = field390[var4 + 1];
                            int var144 = field390[var4 + 2];
                            int var145 = field390[var4 + 3];
                            class38 var146 = class38.method140(var144);
                            if (var146.field944 == var142 && var146.field945 == var143) {
                                for (int var147 = 0; var147 < var146.field942; var147++) {
                                    if (var146.field948[var147] == var145) {
                                        if (var143 == 115) {
                                            field387[var5++] = var146.field951[var147];
                                        } else {
                                            field390[var4++] = var146.field950[var147];
                                        }
                                        var146 = null;
                                        break;
                                    }
                                }
                                if (var146 != null) {
                                    if (var143 == 115) {
                                        field387[var5++] = var146.field946;
                                    } else {
                                        field390[var4++] = var146.field949;
                                    }
                                }
                                continue;
                            }
                            if (var143 == 115) {
                                field387[var5++] = "null";
                            } else {
                                field390[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var368 < 3700) {
                        if (var368 == 3600) {
                            if (client.field718 == 0) {
                                field390[var4++] = -2;
                            } else if (client.field718 == 1) {
                                field390[var4++] = -1;
                            } else {
                                field390[var4++] = client.field717;
                            }
                            continue;
                        }
                        if (var368 == 3601) {
                            var4--;
                            int var148 = field390[var4];
                            if (client.field718 == 2 && var148 < client.field717) {
                                field387[var5++] = client.field685[var148].field366;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 3602) {
                            var4--;
                            int var149 = field390[var4];
                            if (client.field718 == 2 && var149 < client.field717) {
                                field390[var4++] = client.field685[var149].field358;
                                continue;
                            }
                            field390[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3603) {
                            var4--;
                            int var150 = field390[var4];
                            if (client.field718 == 2 && var150 < client.field717) {
                                field390[var4++] = client.field685[var150].field355;
                                continue;
                            }
                            field390[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3604) {
                            var5--;
                            String var151 = field387[var5];
                            var4--;
                            int var152 = field390[var4];
                            client.method2572(var151, var152);
                            continue;
                        }
                        if (var368 == 3605) {
                            var5--;
                            String var153 = field387[var5];
                            Statics.method2189(var153);
                            continue;
                        }
                        if (var368 == 3606) {
                            var5--;
                            String var154 = field387[var5];
                            if (var154 == null) {
                                continue;
                            }
                            String var155 = class147.method136(var154, Statics.field1255);
                            if (var155 == null) {
                                continue;
                            }
                            int var156 = 0;
                            while (true) {
                                if (var156 >= client.field717) {
                                    continue label2327;
                                }
                                class22 var157 = client.field685[var156];
                                String var158 = var157.field366;
                                String var159 = class147.method136(var158, Statics.field1255);
                                boolean var160;
                                if (var154 == null || var158 == null) {
                                    var160 = false;
                                } else if (var154.startsWith("#") || var158.startsWith("#")) {
                                    var160 = var154.equals(var158);
                                } else {
                                    var160 = var155.equals(var159);
                                }
                                if (var160) {
                                    client.field717--;
                                    for (int var161 = var156; var161 < client.field717; var161++) {
                                        client.field685[var161] = client.field685[var161 + 1];
                                    }
                                    client.field622 = client.field649;
                                    client.field505.method2198(91);
                                    class115 var162 = client.field505;
                                    int var163 = var154.length() + 1;
                                    var162.method2339(var163);
                                    client.field505.method2318(var154);
                                    continue label2327;
                                }
                                var156++;
                            }
                        }
                        if (var368 == 3607) {
                            var5--;
                            String var164 = field387[var5];
                            if (var164 == null) {
                                continue;
                            }
                            if (client.field721 >= 100) {
                                client.method56(0, "", class133.field2214);
                                continue;
                            }
                            String var165 = class147.method136(var164, Statics.field1255);
                            if (var165 == null) {
                                continue;
                            }
                            for (int var166 = 0; var166 < client.field721; var166++) {
                                class11 var167 = client.field669[var166];
                                String var168 = class147.method136(var167.field195, Statics.field1255);
                                if (var168 != null && var168.equals(var165)) {
                                    client.method56(0, "", var164 + class133.field2136);
                                    continue label2327;
                                }
                                if (var167.field186 != null) {
                                    String var169 = class147.method136(var167.field186, Statics.field1255);
                                    if (var169 != null && var169.equals(var165)) {
                                        client.method56(0, "", var164 + class133.field2136);
                                        continue label2327;
                                    }
                                }
                            }
                            for (int var170 = 0; var170 < client.field717; var170++) {
                                class22 var171 = client.field685[var170];
                                String var172 = class147.method136(var171.field366, Statics.field1255);
                                if (var172 != null && var172.equals(var165)) {
                                    client.method56(0, "", class133.field2220 + var164 + class133.field2221);
                                    continue label2327;
                                }
                                if (var171.field356 != null) {
                                    String var173 = class147.method136(var171.field356, Statics.field1255);
                                    if (var173 != null && var173.equals(var165)) {
                                        client.method56(0, "", class133.field2220 + var164 + class133.field2221);
                                        continue label2327;
                                    }
                                }
                            }
                            if (class147.method136(Statics.field1623.field58, Statics.field1255).equals(var165)) {
                                client.method56(0, "", class133.field2217);
                            } else {
                                client.field505.method2198(240);
                                class115 var174 = client.field505;
                                int var175 = var164.length() + 1;
                                var174.method2339(var175);
                                client.field505.method2318(var164);
                            }
                            continue;
                        }
                        if (var368 == 3608) {
                            var5--;
                            String var176 = field387[var5];
                            if (var176 == null) {
                                continue;
                            }
                            String var177 = class147.method136(var176, Statics.field1255);
                            if (var177 == null) {
                                continue;
                            }
                            int var178 = 0;
                            while (true) {
                                if (var178 >= client.field721) {
                                    continue label2327;
                                }
                                class11 var179 = client.field669[var178];
                                String var180 = var179.field195;
                                String var181 = class147.method136(var180, Statics.field1255);
                                boolean var182;
                                if (var176 == null || var180 == null) {
                                    var182 = false;
                                } else if (var176.startsWith("#") || var180.startsWith("#")) {
                                    var182 = var176.equals(var180);
                                } else {
                                    var182 = var177.equals(var181);
                                }
                                if (var182) {
                                    client.field721--;
                                    for (int var183 = var178; var183 < client.field721; var183++) {
                                        client.field669[var183] = client.field669[var183 + 1];
                                    }
                                    client.field622 = client.field649;
                                    client.field505.method2198(211);
                                    class115 var184 = client.field505;
                                    int var185 = var176.length() + 1;
                                    var184.method2339(var185);
                                    client.field505.method2318(var176);
                                    continue label2327;
                                }
                                var178++;
                            }
                        }
                        if (var368 == 3609) {
                            var5--;
                            String var186 = field387[var5];
                            if (var186.startsWith(class2.method122(0)) || var186.startsWith(class2.method122(1))) {
                                var186 = var186.substring(7);
                            }
                            field390[var4++] = client.method138(var186) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3611) {
                            if (client.field690 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = class145.method746(client.field690);
                            }
                            continue;
                        }
                        if (var368 == 3612) {
                            if (client.field690 == null) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = Statics.field383;
                            }
                            continue;
                        }
                        if (var368 == 3613) {
                            var4--;
                            int var187 = field390[var4];
                            if (client.field690 != null && var187 < Statics.field383) {
                                field387[var5++] = Statics.field2337[var187].field130;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 3614) {
                            var4--;
                            int var188 = field390[var4];
                            if (client.field690 != null && var188 < Statics.field383) {
                                field390[var4++] = Statics.field2337[var188].field129;
                                continue;
                            }
                            field390[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3615) {
                            var4--;
                            int var189 = field390[var4];
                            if (client.field690 != null && var189 < Statics.field383) {
                                field390[var4++] = Statics.field2337[var189].field126;
                                continue;
                            }
                            field390[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3616) {
                            field390[var4++] = Statics.field1902;
                            continue;
                        }
                        if (var368 == 3617) {
                            var5--;
                            String var190 = field387[var5];
                            client.method1754(var190);
                            continue;
                        }
                        if (var368 == 3618) {
                            field390[var4++] = Statics.field1780;
                            continue;
                        }
                        if (var368 == 3619) {
                            var5--;
                            String var191 = field387[var5];
                            if (!var191.equals("")) {
                                client.field505.method2198(60);
                                class115 var192 = client.field505;
                                int var193 = var191.length() + 1;
                                var192.method2339(var193);
                                client.field505.method2318(var191);
                            }
                            continue;
                        }
                        if (var368 == 3620) {
                            client.field505.method2198(60);
                            client.field505.method2339(0);
                            continue;
                        }
                        if (var368 == 3621) {
                            if (client.field718 == 0) {
                                field390[var4++] = -1;
                            } else {
                                field390[var4++] = client.field721;
                            }
                            continue;
                        }
                        if (var368 == 3622) {
                            var4--;
                            int var194 = field390[var4];
                            if (client.field718 != 0 && var194 < client.field721) {
                                field387[var5++] = client.field669[var194].field195;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 3623) {
                            var5--;
                            String var195 = field387[var5];
                            if (var195.startsWith(class2.method122(0)) || var195.startsWith(class2.method122(1))) {
                                var195 = var195.substring(7);
                            }
                            field390[var4++] = client.method141(var195) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 3624) {
                            var4--;
                            int var196 = field390[var4];
                            if (Statics.field2337 != null && var196 < Statics.field383 && Statics.field2337[var196].field130.equalsIgnoreCase(Statics.field1623.field58)) {
                                field390[var4++] = 1;
                                continue;
                            }
                            field390[var4++] = 0;
                            continue;
                        }
                        if (var368 == 3625) {
                            if (client.field616 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = class145.method746(client.field616);
                            }
                            continue;
                        }
                    } else if (var368 < 4100) {
                        if (var368 == 4000) {
                            var4 -= 2;
                            int var197 = field390[var4];
                            int var198 = field390[var4 + 1];
                            field390[var4++] = var197 + var198;
                            continue;
                        }
                        if (var368 == 4001) {
                            var4 -= 2;
                            int var199 = field390[var4];
                            int var200 = field390[var4 + 1];
                            field390[var4++] = var199 - var200;
                            continue;
                        }
                        if (var368 == 4002) {
                            var4 -= 2;
                            int var201 = field390[var4];
                            int var202 = field390[var4 + 1];
                            field390[var4++] = var201 * var202;
                            continue;
                        }
                        if (var368 == 4003) {
                            var4 -= 2;
                            int var203 = field390[var4];
                            int var204 = field390[var4 + 1];
                            field390[var4++] = var203 / var204;
                            continue;
                        }
                        if (var368 == 4004) {
                            var4--;
                            int var205 = field390[var4];
                            field390[var4++] = (int) (Math.random() * (double) var205);
                            continue;
                        }
                        if (var368 == 4005) {
                            var4--;
                            int var206 = field390[var4];
                            field390[var4++] = (int) (Math.random() * (double) (var206 + 1));
                            continue;
                        }
                        if (var368 == 4006) {
                            var4 -= 5;
                            int var207 = field390[var4];
                            int var208 = field390[var4 + 1];
                            int var209 = field390[var4 + 2];
                            int var210 = field390[var4 + 3];
                            int var211 = field390[var4 + 4];
                            field390[var4++] = (var208 - var207) * (var211 - var209) / (var210 - var209) + var207;
                            continue;
                        }
                        if (var368 == 4007) {
                            var4 -= 2;
                            int var212 = field390[var4];
                            int var213 = field390[var4 + 1];
                            field390[var4++] = var212 * var213 / 100 + var212;
                            continue;
                        }
                        if (var368 == 4008) {
                            var4 -= 2;
                            int var214 = field390[var4];
                            int var215 = field390[var4 + 1];
                            field390[var4++] = var214 | 0x1 << var215;
                            continue;
                        }
                        if (var368 == 4009) {
                            var4 -= 2;
                            int var216 = field390[var4];
                            int var217 = field390[var4 + 1];
                            field390[var4++] = var216 & -1 - (0x1 << var217);
                            continue;
                        }
                        if (var368 == 4010) {
                            var4 -= 2;
                            int var218 = field390[var4];
                            int var219 = field390[var4 + 1];
                            field390[var4++] = (var218 & 0x1 << var219) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var368 == 4011) {
                            var4 -= 2;
                            int var220 = field390[var4];
                            int var221 = field390[var4 + 1];
                            field390[var4++] = var220 % var221;
                            continue;
                        }
                        if (var368 == 4012) {
                            var4 -= 2;
                            int var222 = field390[var4];
                            int var223 = field390[var4 + 1];
                            if (var222 == 0) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = (int) Math.pow((double) var222, (double) var223);
                            }
                            continue;
                        }
                        if (var368 == 4013) {
                            var4 -= 2;
                            int var224 = field390[var4];
                            int var225 = field390[var4 + 1];
                            if (var224 == 0) {
                                field390[var4++] = 0;
                            } else if (var225 == 0) {
                                field390[var4++] = Integer.MAX_VALUE;
                            } else {
                                field390[var4++] = (int) Math.pow((double) var224, 1.0D / (double) var225);
                            }
                            continue;
                        }
                        if (var368 == 4014) {
                            var4 -= 2;
                            int var226 = field390[var4];
                            int var227 = field390[var4 + 1];
                            field390[var4++] = var226 & var227;
                            continue;
                        }
                        if (var368 == 4015) {
                            var4 -= 2;
                            int var228 = field390[var4];
                            int var229 = field390[var4 + 1];
                            field390[var4++] = var228 | var229;
                            continue;
                        }
                    } else if (var368 < 4200) {
                        if (var368 == 4100) {
                            var5--;
                            String var230 = field387[var5];
                            var4--;
                            int var231 = field390[var4];
                            field387[var5++] = var230 + var231;
                            continue;
                        }
                        if (var368 == 4101) {
                            var5 -= 2;
                            String var232 = field387[var5];
                            String var233 = field387[var5 + 1];
                            field387[var5++] = var232 + var233;
                            continue;
                        }
                        if (var368 == 4102) {
                            var5--;
                            String var234 = field387[var5];
                            var4--;
                            int var235 = field390[var4];
                            String[] var236 = field387;
                            int var237 = var5++;
                            String var239;
                            if (var235 < 0) {
                                var239 = Integer.toString(var235);
                            } else {
                                var239 = class146.method2103(var235, 10, true);
                            }
                            var236[var237] = var234 + var239;
                            continue;
                        }
                        if (var368 == 4103) {
                            var5--;
                            String var240 = field387[var5];
                            field387[var5++] = var240.toLowerCase();
                            continue;
                        }
                        if (var368 == 4104) {
                            var4--;
                            int var241 = field390[var4];
                            long var242 = ((long) var241 + 11745L) * 86400000L;
                            field386.setTime(new Date(var242));
                            int var244 = field386.get(5);
                            int var245 = field386.get(2);
                            int var246 = field386.get(1);
                            field387[var5++] = var244 + "-" + field396[var245] + "-" + var246;
                            continue;
                        }
                        if (var368 == 4105) {
                            var5 -= 2;
                            String var247 = field387[var5];
                            String var248 = field387[var5 + 1];
                            if (Statics.field1623.field43 != null && Statics.field1623.field43.field2666) {
                                field387[var5++] = var248;
                                continue;
                            }
                            field387[var5++] = var247;
                            continue;
                        }
                        if (var368 == 4106) {
                            var4--;
                            int var249 = field390[var4];
                            field387[var5++] = Integer.toString(var249);
                            continue;
                        }
                        if (var368 == 4107) {
                            var5 -= 2;
                            int[] var250 = field390;
                            int var251 = var4++;
                            String var252 = field387[var5];
                            String var253 = field387[var5 + 1];
                            int var254 = client.field571;
                            int var255 = var252.length();
                            int var256 = var253.length();
                            int var257 = 0;
                            int var258 = 0;
                            byte var259 = 0;
                            byte var260 = 0;
                            int var261;
                            label2164: while (true) {
                                if (var257 - var259 >= var255 && var258 - var260 >= var256) {
                                    int var272 = Math.min(var255, var256);
                                    for (int var273 = 0; var273 < var272; var273++) {
                                        char var276 = var252.charAt(var273);
                                        char var277 = var253.charAt(var273);
                                        if (var276 != var277 && Character.toUpperCase(var276) != Character.toUpperCase(var277)) {
                                            char var278 = Character.toLowerCase(var276);
                                            char var279 = Character.toLowerCase(var277);
                                            if (var278 != var279) {
                                                var261 = class149.method2254(var278, var254) - class149.method2254(var279, var254);
                                                break label2164;
                                            }
                                        }
                                    }
                                    int var280 = var255 - var256;
                                    if (var280 == 0) {
                                        for (int var281 = 0; var281 < var272; var281++) {
                                            char var282 = var252.charAt(var281);
                                            char var283 = var253.charAt(var281);
                                            if (var282 != var283) {
                                                var261 = class149.method2254(var282, var254) - class149.method2254(var283, var254);
                                                break label2164;
                                            }
                                        }
                                        var261 = 0;
                                    } else {
                                        var261 = var280;
                                    }
                                    break;
                                }
                                if (var257 - var259 >= var255) {
                                    var261 = -1;
                                    break;
                                }
                                if (var258 - var260 >= var256) {
                                    var261 = 1;
                                    break;
                                }
                                char var262;
                                if (var259 == 0) {
                                    var262 = var252.charAt(var257++);
                                } else {
                                    var262 = (char) var259;
                                    boolean var263 = false;
                                }
                                char var264;
                                if (var260 == 0) {
                                    var264 = var253.charAt(var258++);
                                } else {
                                    var264 = (char) var260;
                                    boolean var265 = false;
                                }
                                byte var266;
                                if (var262 == 198) {
                                    var266 = 69;
                                } else if (var262 == 230) {
                                    var266 = 101;
                                } else if (var262 == 223) {
                                    var266 = 115;
                                } else if (var262 == 338) {
                                    var266 = 69;
                                } else if (var262 == 339) {
                                    var266 = 101;
                                } else {
                                    var266 = 0;
                                }
                                var259 = var266;
                                byte var267;
                                if (var264 == 198) {
                                    var267 = 69;
                                } else if (var264 == 230) {
                                    var267 = 101;
                                } else if (var264 == 223) {
                                    var267 = 115;
                                } else if (var264 == 338) {
                                    var267 = 69;
                                } else if (var264 == 339) {
                                    var267 = 101;
                                } else {
                                    var267 = 0;
                                }
                                var260 = var267;
                                char var268 = class149.method1348(var262, var254);
                                char var269 = class149.method1348(var264, var254);
                                if (var268 != var269 && Character.toUpperCase(var268) != Character.toUpperCase(var269)) {
                                    char var270 = Character.toLowerCase(var268);
                                    char var271 = Character.toLowerCase(var269);
                                    if (var270 != var271) {
                                        var261 = class149.method2254(var270, var254) - class149.method2254(var271, var254);
                                        break;
                                    }
                                }
                            }
                            var250[var251] = class146.method1307(var261);
                            continue;
                        }
                        if (var368 == 4108) {
                            var5--;
                            String var284 = field387[var5];
                            var4 -= 2;
                            int var285 = field390[var4];
                            int var286 = field390[var4 + 1];
                            byte[] var287 = Statics.field2676.method2821(var286, 0);
                            class181 var288 = new class181(var287);
                            field390[var4++] = var288.method3228(var284, var285);
                            continue;
                        }
                        if (var368 == 4109) {
                            var5--;
                            String var289 = field387[var5];
                            var4 -= 2;
                            int var290 = field390[var4];
                            int var291 = field390[var4 + 1];
                            byte[] var292 = Statics.field2676.method2821(var291, 0);
                            class181 var293 = new class181(var292);
                            field390[var4++] = var293.method3227(var289, var290);
                            continue;
                        }
                        if (var368 == 4110) {
                            var5 -= 2;
                            String var294 = field387[var5];
                            String var295 = field387[var5 + 1];
                            var4--;
                            if (field390[var4] == 1) {
                                field387[var5++] = var294;
                            } else {
                                field387[var5++] = var295;
                            }
                            continue;
                        }
                        if (var368 == 4111) {
                            var5--;
                            String var296 = field387[var5];
                            field387[var5++] = class183.method3229(var296);
                            continue;
                        }
                        if (var368 == 4112) {
                            var5--;
                            String var297 = field387[var5];
                            var4--;
                            int var298 = field390[var4];
                            field387[var5++] = var297 + (char) var298;
                            continue;
                        }
                        if (var368 == 4113) {
                            var4--;
                            int var299 = field390[var4];
                            field390[var4++] = class146.method838((char) var299) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4114) {
                            var4--;
                            int var300 = field390[var4];
                            int[] var301 = field390;
                            int var302 = var4++;
                            char var303 = (char) var300;
                            boolean var304 = var303 >= '0' && var303 <= '9' || var303 >= 'A' && var303 <= 'Z' || var303 >= 'a' && var303 <= 'z';
                            var301[var302] = var304 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4115) {
                            var4--;
                            int var305 = field390[var4];
                            field390[var4++] = Statics.method2094((char) var305) ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4116) {
                            var4--;
                            int var306 = field390[var4];
                            int[] var307 = field390;
                            int var308 = var4++;
                            char var309 = (char) var306;
                            boolean var310 = var309 >= '0' && var309 <= '9';
                            var307[var308] = var310 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4117) {
                            var5--;
                            String var311 = field387[var5];
                            if (var311 == null) {
                                field390[var4++] = 0;
                            } else {
                                field390[var4++] = var311.length();
                            }
                            continue;
                        }
                        if (var368 == 4118) {
                            var5--;
                            String var312 = field387[var5];
                            var4 -= 2;
                            int var313 = field390[var4];
                            int var314 = field390[var4 + 1];
                            field387[var5++] = var312.substring(var313, var314);
                            continue;
                        }
                        if (var368 == 4119) {
                            var5--;
                            String var315 = field387[var5];
                            StringBuilder var316 = new StringBuilder(var315.length());
                            boolean var317 = false;
                            for (int var318 = 0; var318 < var315.length(); var318++) {
                                char var319 = var315.charAt(var318);
                                if (var319 == '<') {
                                    var317 = true;
                                } else if (var319 == '>') {
                                    var317 = false;
                                } else if (!var317) {
                                    var316.append(var319);
                                }
                            }
                            field387[var5++] = var316.toString();
                            continue;
                        }
                        if (var368 == 4120) {
                            var5--;
                            String var320 = field387[var5];
                            var4--;
                            int var321 = field390[var4];
                            field390[var4++] = var320.indexOf(var321);
                            continue;
                        }
                    } else if (var368 < 4300) {
                        if (var368 == 4200) {
                            var4--;
                            int var322 = field390[var4];
                            field387[var5++] = class39.method2570(var322).field965;
                            continue;
                        }
                        if (var368 == 4201) {
                            var4 -= 2;
                            int var323 = field390[var4];
                            int var324 = field390[var4 + 1];
                            class39 var325 = class39.method2570(var323);
                            if (var324 >= 1 && var324 <= 5 && var325.field979[var324 - 1] != null) {
                                field387[var5++] = var325.field979[var324 - 1];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 4202) {
                            var4 -= 2;
                            int var326 = field390[var4];
                            int var327 = field390[var4 + 1];
                            class39 var328 = class39.method2570(var326);
                            if (var327 >= 1 && var327 <= 5 && var328.field970[var327 - 1] != null) {
                                field387[var5++] = var328.field970[var327 - 1];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var368 == 4203) {
                            var4--;
                            int var329 = field390[var4];
                            field390[var4++] = class39.method2570(var329).field977;
                            continue;
                        }
                        if (var368 == 4204) {
                            var4--;
                            int var330 = field390[var4];
                            field390[var4++] = class39.method2570(var330).field980 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var368 == 4205) {
                            var4--;
                            int var331 = field390[var4];
                            class39 var332 = class39.method2570(var331);
                            if (var332.field995 == -1 && var332.field987 >= 0) {
                                field390[var4++] = var332.field987;
                                continue;
                            }
                            field390[var4++] = var331;
                            continue;
                        }
                        if (var368 == 4206) {
                            var4--;
                            int var333 = field390[var4];
                            class39 var334 = class39.method2570(var333);
                            if (var334.field995 >= 0 && var334.field987 >= 0) {
                                field390[var4++] = var334.field987;
                                continue;
                            }
                            field390[var4++] = var333;
                            continue;
                        }
                        if (var368 == 4207) {
                            var4--;
                            int var335 = field390[var4];
                            field390[var4++] = class39.method2570(var335).field978 ? 1 : 0;
                            continue;
                        }
                    } else if (var368 < 5100) {
                        if (var368 == 5000) {
                            field390[var4++] = client.field532;
                            continue;
                        }
                        if (var368 == 5001) {
                            var4 -= 3;
                            client.field532 = field390[var4];
                            int var336 = field390[var4 + 1];
                            class136[] var337 = class136.method2292();
                            int var338 = 0;
                            class136 var340;
                            while (true) {
                                if (var338 >= var337.length) {
                                    var340 = null;
                                    break;
                                }
                                class136 var339 = var337[var338];
                                if (var339.field2306 == var336) {
                                    var340 = var339;
                                    break;
                                }
                                var338++;
                            }
                            Statics.field2038 = var340;
                            if (Statics.field2038 == null) {
                                Statics.field2038 = class136.field2302;
                            }
                            client.field684 = field390[var4 + 2];
                            client.field505.method2198(181);
                            client.field505.method2339(client.field532);
                            client.field505.method2339(Statics.field2038.field2306);
                            client.field505.method2339(client.field684);
                            continue;
                        }
                        if (var368 == 5002) {
                            var5--;
                            String var341 = field387[var5];
                            var4 -= 2;
                            int var342 = field390[var4];
                            int var343 = field390[var4 + 1];
                            client.field505.method2198(26);
                            class115 var344 = client.field505;
                            int var345 = var341.length() + 1;
                            var344.method2339(var345 + 2);
                            client.field505.method2318(var341);
                            client.field505.method2339(var342 - 1);
                            client.field505.method2339(var343);
                            continue;
                        }
                        if (var368 == 5003) {
                            var4--;
                            int var346 = field390[var4];
                            String var347 = null;
                            if (var346 < 100) {
                                var347 = client.field680[var346];
                            }
                            if (var347 == null) {
                                var347 = "";
                            }
                            field387[var5++] = var347;
                            continue;
                        }
                        if (var368 == 5004) {
                            var4--;
                            int var348 = field390[var4];
                            int var349 = -1;
                            if (var348 < 100 && client.field680[var348] != null) {
                                var349 = client.field723[var348];
                            }
                            field390[var4++] = var349;
                            continue;
                        }
                        if (var368 == 5005) {
                            if (Statics.field2038 == null) {
                                field390[var4++] = -1;
                            } else {
                                field390[var4++] = Statics.field2038.field2306;
                            }
                            continue;
                        }
                        if (var368 == 5008) {
                            var5--;
                            String var350 = field387[var5];
                            if (var350.startsWith("::")) {
                                client.method1508(var350);
                            } else {
                                String var351 = var350.toLowerCase();
                                byte var352 = 0;
                                if (var351.startsWith(class133.field2222)) {
                                    var352 = 0;
                                    var350 = var350.substring(class133.field2222.length());
                                } else if (var351.startsWith(class133.field2118)) {
                                    var352 = 1;
                                    var350 = var350.substring(class133.field2118.length());
                                } else if (var351.startsWith(class133.field2144)) {
                                    var352 = 2;
                                    var350 = var350.substring(class133.field2144.length());
                                } else if (var351.startsWith(class133.field2228)) {
                                    var352 = 3;
                                    var350 = var350.substring(class133.field2228.length());
                                } else if (var351.startsWith(class133.field2230)) {
                                    var352 = 4;
                                    var350 = var350.substring(class133.field2230.length());
                                } else if (var351.startsWith(class133.field2232)) {
                                    var352 = 5;
                                    var350 = var350.substring(class133.field2232.length());
                                } else if (var351.startsWith(class133.field2077)) {
                                    var352 = 6;
                                    var350 = var350.substring(class133.field2077.length());
                                } else if (var351.startsWith(class133.field2236)) {
                                    var352 = 7;
                                    var350 = var350.substring(class133.field2236.length());
                                } else if (var351.startsWith(class133.field2238)) {
                                    var352 = 8;
                                    var350 = var350.substring(class133.field2238.length());
                                } else if (var351.startsWith(class133.field2240)) {
                                    var352 = 9;
                                    var350 = var350.substring(class133.field2240.length());
                                } else if (var351.startsWith(class133.field2082)) {
                                    var352 = 10;
                                    var350 = var350.substring(class133.field2082.length());
                                } else if (var351.startsWith(class133.field2163)) {
                                    var352 = 11;
                                    var350 = var350.substring(class133.field2163.length());
                                } else if (client.field571 != 0) {
                                    if (var351.startsWith(class133.field2223)) {
                                        var352 = 0;
                                        var350 = var350.substring(class133.field2223.length());
                                    } else if (var351.startsWith(class133.field2225)) {
                                        var352 = 1;
                                        var350 = var350.substring(class133.field2225.length());
                                    } else if (var351.startsWith(class133.field2227)) {
                                        var352 = 2;
                                        var350 = var350.substring(class133.field2227.length());
                                    } else if (var351.startsWith(class133.field2062)) {
                                        var352 = 3;
                                        var350 = var350.substring(class133.field2062.length());
                                    } else if (var351.startsWith(class133.field2231)) {
                                        var352 = 4;
                                        var350 = var350.substring(class133.field2231.length());
                                    } else if (var351.startsWith(class133.field2233)) {
                                        var352 = 5;
                                        var350 = var350.substring(class133.field2233.length());
                                    } else if (var351.startsWith(class133.field2282)) {
                                        var352 = 6;
                                        var350 = var350.substring(class133.field2282.length());
                                    } else if (var351.startsWith(class133.field2237)) {
                                        var352 = 7;
                                        var350 = var350.substring(class133.field2237.length());
                                    } else if (var351.startsWith(class133.field2239)) {
                                        var352 = 8;
                                        var350 = var350.substring(class133.field2239.length());
                                    } else if (var351.startsWith(class133.field2241)) {
                                        var352 = 9;
                                        var350 = var350.substring(class133.field2241.length());
                                    } else if (var351.startsWith(class133.field2157)) {
                                        var352 = 10;
                                        var350 = var350.substring(class133.field2157.length());
                                    } else if (var351.startsWith(class133.field2245)) {
                                        var352 = 11;
                                        var350 = var350.substring(class133.field2245.length());
                                    }
                                }
                                String var353 = var350.toLowerCase();
                                byte var354 = 0;
                                if (var353.startsWith(class133.field2081)) {
                                    var354 = 1;
                                    var350 = var350.substring(class133.field2081.length());
                                } else if (var353.startsWith(class133.field2248)) {
                                    var354 = 2;
                                    var350 = var350.substring(class133.field2248.length());
                                } else if (var353.startsWith(class133.field2250)) {
                                    var354 = 3;
                                    var350 = var350.substring(class133.field2250.length());
                                } else if (var353.startsWith(class133.field2252)) {
                                    var354 = 4;
                                    var350 = var350.substring(class133.field2252.length());
                                } else if (var353.startsWith(class133.field2254)) {
                                    var354 = 5;
                                    var350 = var350.substring(class133.field2254.length());
                                } else if (client.field571 != 0) {
                                    if (var353.startsWith(class133.field2247)) {
                                        var354 = 1;
                                        var350 = var350.substring(class133.field2247.length());
                                    } else if (var353.startsWith(class133.field2131)) {
                                        var354 = 2;
                                        var350 = var350.substring(class133.field2131.length());
                                    } else if (var353.startsWith(class133.field2279)) {
                                        var354 = 3;
                                        var350 = var350.substring(class133.field2279.length());
                                    } else if (var353.startsWith(class133.field2253)) {
                                        var354 = 4;
                                        var350 = var350.substring(class133.field2253.length());
                                    } else if (var353.startsWith(class133.field2255)) {
                                        var354 = 5;
                                        var350 = var350.substring(class133.field2255.length());
                                    }
                                }
                                client.field505.method2198(81);
                                client.field505.method2339(0);
                                int var355 = client.field505.field2003;
                                client.field505.method2339(var352);
                                client.field505.method2339(var354);
                                class182.method15(client.field505, var350);
                                client.field505.method2323(client.field505.field2003 - var355);
                            }
                            continue;
                        }
                        if (var368 == 5009) {
                            var5 -= 2;
                            String var356 = field387[var5];
                            String var357 = field387[var5 + 1];
                            client.field505.method2198(242);
                            client.field505.method2314(0);
                            int var358 = client.field505.field2003;
                            client.field505.method2318(var356);
                            class182.method15(client.field505, var357);
                            client.field505.method2322(client.field505.field2003 - var358);
                            continue;
                        }
                        if (var368 == 5010) {
                            var4--;
                            int var359 = field390[var4];
                            String var360 = null;
                            if (var359 < 100) {
                                var360 = client.field678[var359];
                            }
                            if (var360 == null) {
                                var360 = "";
                            }
                            field387[var5++] = var360;
                            continue;
                        }
                        if (var368 == 5011) {
                            var4--;
                            int var361 = field390[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field679[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field387[var5++] = var362;
                            continue;
                        }
                        if (var368 == 5015) {
                            String var363;
                            if (Statics.field1623 == null || Statics.field1623.field58 == null) {
                                var363 = "";
                            } else {
                                var363 = Statics.field1623.field58;
                            }
                            field387[var5++] = var363;
                            continue;
                        }
                        if (var368 == 5016) {
                            field390[var4++] = client.field684;
                            continue;
                        }
                        if (var368 == 5017) {
                            field390[var4++] = client.field495;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var367) {
            StringBuilder var365 = new StringBuilder(30);
            var365.append("").append(var3.field2759).append(" ");
            for (int var366 = field392 - 1; var366 >= 0; var366--) {
                var365.append("").append(field393[var366].field272.field2759).append(" ");
            }
            var365.append("").append(var9);
            class79.method848(var365.toString(), var367);
        }
    }

    @ObfuscatedName("bz.j(IB)V")
    public static void method1361(int arg0) {
        if (arg0 == -1 || !class156.method1920(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2632[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3.field2596 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field4 = var3.field2596;
                method790(var4);
            }
        }
    }
}
