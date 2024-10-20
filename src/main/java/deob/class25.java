package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("k")
public class class25 {

    @ObfuscatedName("k.j")
    public static int[] field382 = new int[5];

    @ObfuscatedName("k.i")
    public static int[][] field386 = new int[5][5000];

    @ObfuscatedName("k.o")
    public static int[] field387 = new int[1000];

    @ObfuscatedName("k.l")
    public static String[] field393 = new String[1000];

    @ObfuscatedName("k.p")
    public static int field389 = 0;

    @ObfuscatedName("k.t")
    public static class17[] field385 = new class17[50];

    @ObfuscatedName("k.a")
    public static Calendar field390 = Calendar.getInstance();

    @ObfuscatedName("k.q")
    public static final String[] field398 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.g(Lg;I)V")
    public static void method1222(class1 arg0) {
        Object[] var1 = arg0.field16;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method1386(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field57;
        int[] var8 = var3.field58;
        byte var9 = -1;
        field389 = 0;
        try {
            Statics.field383 = new int[var3.field60];
            int var10 = 0;
            Statics.field384 = new String[var3.field61];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field13;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field8;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2531;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2532;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2531;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2532;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field11;
                    }
                    Statics.field383[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field384[var11++] = var14;
                }
            }
            int var15 = 0;
            label2544: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var406 = var7[var6];
                if (var406 < 100) {
                    if (var406 == 0) {
                        field387[var4++] = var8[var6];
                        continue;
                    }
                    if (var406 == 1) {
                        int var16 = var8[var6];
                        field387[var4++] = class157.field2656[var16];
                        continue;
                    }
                    if (var406 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class157.field2656[var17] = field387[var4];
                        continue;
                    }
                    if (var406 == 3) {
                        field393[var5++] = var3.field59[var6];
                        continue;
                    }
                    if (var406 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var406 == 7) {
                        var4 -= 2;
                        if (field387[var4 + 1] != field387[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 8) {
                        var4 -= 2;
                        if (field387[var4 + 1] == field387[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 9) {
                        var4 -= 2;
                        if (field387[var4] < field387[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 10) {
                        var4 -= 2;
                        if (field387[var4] > field387[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 21) {
                        if (field389 == 0) {
                            return;
                        }
                        class17 var18 = field385[--field389];
                        var3 = var18.field251;
                        var7 = var3.field57;
                        var8 = var3.field58;
                        var6 = var18.field252;
                        Statics.field383 = var18.field253;
                        Statics.field384 = var18.field262;
                        continue;
                    }
                    if (var406 == 25) {
                        int var19 = var8[var6];
                        field387[var4++] = class157.method1589(var19);
                        continue;
                    }
                    if (var406 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class157.method2056(var20, field387[var4]);
                        continue;
                    }
                    if (var406 == 31) {
                        var4 -= 2;
                        if (field387[var4] <= field387[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 32) {
                        var4 -= 2;
                        if (field387[var4] >= field387[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var406 == 33) {
                        field387[var4++] = Statics.field383[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var406 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field383[var10001] = field387[var4];
                        continue;
                    }
                    if (var406 == 35) {
                        field393[var5++] = Statics.field384[var8[var6]];
                        continue;
                    }
                    if (var406 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field384[var10001] = field393[var5];
                        continue;
                    }
                    if (var406 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class146.method3108(field393, var5, var21);
                        field393[var5++] = var22;
                        continue;
                    }
                    if (var406 == 38) {
                        var4--;
                        continue;
                    }
                    if (var406 == 39) {
                        var5--;
                        continue;
                    }
                    if (var406 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method1386(var23);
                        int[] var25 = new int[var24.field60];
                        String[] var26 = new String[var24.field61];
                        for (int var27 = 0; var27 < var24.field56; var27++) {
                            var25[var27] = field387[var4 - var24.field56 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field62; var28++) {
                            var26[var28] = field393[var5 - var24.field62 + var28];
                        }
                        var4 -= var24.field56;
                        var5 -= var24.field62;
                        class17 var29 = new class17();
                        var29.field251 = var3;
                        var29.field252 = var6;
                        var29.field253 = Statics.field383;
                        var29.field262 = Statics.field384;
                        field385[++field389 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field57;
                        var8 = var24.field58;
                        var6 = -1;
                        Statics.field383 = var25;
                        Statics.field384 = var26;
                        continue;
                    }
                    if (var406 == 42) {
                        field387[var4++] = client.field663[var8[var6]];
                        continue;
                    }
                    if (var406 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field663[var10001] = field387[var4];
                        continue;
                    }
                    if (var406 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field387[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field382[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2544;
                                }
                                field386[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var406 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field387[var4];
                        if (var36 >= 0 && var36 < field382[var35]) {
                            field387[var4++] = field386[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var406 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field387[var4];
                        if (var38 >= 0 && var38 < field382[var37]) {
                            field386[var37][var38] = field387[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var406 == 47) {
                        String var39 = client.field664[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field393[var5++] = var39;
                        continue;
                    }
                    if (var406 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field664[var10001] = field393[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var406 < 1000) {
                    if (var406 == 100) {
                        var4 -= 3;
                        int var41 = field387[var4];
                        int var42 = field387[var4 + 1];
                        int var43 = field387[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class156 var44 = class156.method2382(var41);
                        if (var44.field2558 == null) {
                            var44.field2558 = new class156[var43 + 1];
                        }
                        if (var44.field2558.length <= var43) {
                            class156[] var45 = new class156[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2558.length; var46++) {
                                var45[var46] = var44.field2558[var46];
                            }
                            var44.field2558 = var45;
                        }
                        if (var43 > 0 && var44.field2558[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class156 var47 = new class156();
                        var47.field2533 = var42;
                        var47.field2542 = var47.field2531 = var44.field2531;
                        var47.field2532 = var43;
                        var47.field2530 = true;
                        var44.field2558[var43] = var47;
                        if (var40) {
                            Statics.field399 = var47;
                        } else {
                            Statics.field391 = var47;
                        }
                        client.method2745(var44);
                        continue;
                    }
                    if (var406 == 101) {
                        class156 var48 = var40 ? Statics.field399 : Statics.field391;
                        class156 var49 = class156.method2382(var48.field2531);
                        var49.field2558[var48.field2532] = null;
                        client.method2745(var49);
                        continue;
                    }
                    if (var406 == 102) {
                        var4--;
                        class156 var50 = class156.method2382(field387[var4]);
                        var50.field2558 = null;
                        client.method2745(var50);
                        continue;
                    }
                    if (var406 == 200) {
                        var4 -= 2;
                        int var51 = field387[var4];
                        int var52 = field387[var4 + 1];
                        class156 var53 = class156.method1866(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field387[var4++] = 1;
                            if (var40) {
                                Statics.field399 = var53;
                            } else {
                                Statics.field391 = var53;
                            }
                            continue;
                        }
                        field387[var4++] = 0;
                        continue;
                    }
                } else if (!(var406 < 1000 || var406 >= 1100) || !(var406 < 2000 || var406 >= 2100)) {
                    class156 var54;
                    if (var406 >= 2000) {
                        var406 -= 1000;
                        var4--;
                        var54 = class156.method2382(field387[var4]);
                    } else {
                        var54 = var40 ? Statics.field399 : Statics.field391;
                    }
                    if (var406 == 1000) {
                        var4 -= 2;
                        var54.field2643 = field387[var4];
                        var54.field2537 = field387[var4 + 1];
                        client.method2745(var54);
                        continue;
                    }
                    if (var406 == 1001) {
                        var4 -= 2;
                        var54.field2540 = field387[var4];
                        var54.field2541 = field387[var4 + 1];
                        client.method2745(var54);
                        continue;
                    }
                    if (var406 == 1003) {
                        var4--;
                        boolean var55 = field387[var4] == 1;
                        if (var54.field2543 != var55) {
                            var54.field2543 = var55;
                            client.method2745(var54);
                        }
                        continue;
                    }
                } else if (var406 >= 1100 && var406 < 1200 || var406 >= 2100 && var406 < 2200) {
                    class156 var56;
                    if (var406 >= 2000) {
                        var406 -= 1000;
                        var4--;
                        var56 = class156.method2382(field387[var4]);
                    } else {
                        var56 = var40 ? Statics.field399 : Statics.field391;
                    }
                    if (var406 == 1100) {
                        var4 -= 2;
                        var56.field2544 = field387[var4];
                        if (var56.field2544 > var56.field2550 - var56.field2540) {
                            var56.field2544 = var56.field2550 - var56.field2540;
                        }
                        if (var56.field2544 < 0) {
                            var56.field2544 = 0;
                        }
                        var56.field2545 = field387[var4 + 1];
                        if (var56.field2545 > var56.field2547 - var56.field2541) {
                            var56.field2545 = var56.field2547 - var56.field2541;
                        }
                        if (var56.field2545 < 0) {
                            var56.field2545 = 0;
                        }
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1101) {
                        var4--;
                        var56.field2548 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1102) {
                        var4--;
                        var56.field2552 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1103) {
                        var4--;
                        var56.field2553 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1104) {
                        var4--;
                        var56.field2534 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1105) {
                        var4--;
                        var56.field2555 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1106) {
                        var4--;
                        var56.field2557 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1107) {
                        var4--;
                        var56.field2535 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1108) {
                        var56.field2563 = 1;
                        var4--;
                        var56.field2605 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1109) {
                        var4 -= 6;
                        var56.field2569 = field387[var4];
                        var56.field2570 = field387[var4 + 1];
                        var56.field2571 = field387[var4 + 2];
                        var56.field2521 = field387[var4 + 3];
                        var56.field2527 = field387[var4 + 4];
                        var56.field2574 = field387[var4 + 5];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1110) {
                        var4--;
                        int var57 = field387[var4];
                        if (var56.field2585 != var57) {
                            var56.field2585 = var57;
                            var56.field2578 = 0;
                            var56.field2614 = 0;
                            client.method2745(var56);
                        }
                        continue;
                    }
                    if (var406 == 1111) {
                        var4--;
                        var56.field2576 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1112) {
                        var5--;
                        String var58 = field393[var5];
                        if (!var58.equals(var56.field2621)) {
                            var56.field2621 = var58;
                            client.method2745(var56);
                        }
                        continue;
                    }
                    if (var406 == 1113) {
                        var4--;
                        var56.field2577 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1114) {
                        var4 -= 3;
                        var56.field2581 = field387[var4];
                        var56.field2582 = field387[var4 + 1];
                        var56.field2580 = field387[var4 + 2];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1115) {
                        var4--;
                        var56.field2583 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1116) {
                        var4--;
                        var56.field2559 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1117) {
                        var4--;
                        var56.field2560 = field387[var4];
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1118) {
                        var4--;
                        var56.field2637 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1119) {
                        var4--;
                        var56.field2562 = field387[var4] == 1;
                        client.method2745(var56);
                        continue;
                    }
                    if (var406 == 1120) {
                        var4 -= 2;
                        var56.field2550 = field387[var4];
                        var56.field2547 = field387[var4 + 1];
                        client.method2745(var56);
                        continue;
                    }
                } else if (var406 >= 1200 && var406 < 1300 || var406 >= 2200 && var406 < 2300) {
                    class156 var59;
                    if (var406 >= 2000) {
                        var406 -= 1000;
                        var4--;
                        var59 = class156.method2382(field387[var4]);
                    } else {
                        var59 = var40 ? Statics.field399 : Statics.field391;
                    }
                    client.method2745(var59);
                    if (var406 == 1200) {
                        var4 -= 2;
                        int var60 = field387[var4];
                        int var61 = field387[var4 + 1];
                        var59.field2635 = var60;
                        var59.field2638 = var61;
                        class39 var62 = class39.method196(var60);
                        var59.field2571 = var62.field981;
                        var59.field2521 = var62.field982;
                        var59.field2527 = var62.field983;
                        var59.field2569 = var62.field984;
                        var59.field2570 = var62.field985;
                        var59.field2574 = var62.field996;
                        if (var59.field2540 > 0) {
                            var59.field2574 = var59.field2574 * 32 / var59.field2540;
                        }
                        continue;
                    }
                    if (var406 == 1201) {
                        var59.field2563 = 2;
                        var4--;
                        var59.field2605 = field387[var4];
                        continue;
                    }
                    if (var406 == 1202) {
                        var59.field2563 = 3;
                        var59.field2605 = Statics.field2611.field28.method3237();
                        continue;
                    }
                } else if ((var406 < 1300 || var406 >= 1400) && (var406 < 2300 || var406 >= 2400)) {
                    if (var406 >= 1400 && var406 < 1500 || var406 >= 2400 && var406 < 2500) {
                        class156 var67;
                        if (var406 >= 2000) {
                            var406 -= 1000;
                            var4--;
                            var67 = class156.method2382(field387[var4]);
                        } else {
                            var67 = var40 ? Statics.field399 : Statics.field391;
                        }
                        var5--;
                        String var68 = field393[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field387[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field387[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field393[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field387[var4]);
                            }
                        }
                        var4--;
                        int var73 = field387[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var406 == 1400) {
                            var67.field2600 = var71;
                        }
                        if (var406 == 1401) {
                            var67.field2603 = var71;
                        }
                        if (var406 == 1402) {
                            var67.field2546 = var71;
                        }
                        if (var406 == 1403) {
                            var67.field2604 = var71;
                        }
                        if (var406 == 1404) {
                            var67.field2606 = var71;
                        }
                        if (var406 == 1405) {
                            var67.field2538 = var71;
                        }
                        if (var406 == 1406) {
                            var67.field2610 = var71;
                        }
                        if (var406 == 1407) {
                            var67.field2647 = var71;
                            var67.field2642 = var69;
                        }
                        if (var406 == 1408) {
                            var67.field2617 = var71;
                        }
                        if (var406 == 1409) {
                            var67.field2618 = var71;
                        }
                        if (var406 == 1410) {
                            var67.field2608 = var71;
                        }
                        if (var406 == 1411) {
                            var67.field2607 = var71;
                        }
                        if (var406 == 1412) {
                            var67.field2630 = var71;
                        }
                        if (var406 == 1414) {
                            var67.field2613 = var71;
                            var67.field2640 = var69;
                        }
                        if (var406 == 1415) {
                            var67.field2615 = var71;
                            var67.field2616 = var69;
                        }
                        if (var406 == 1416) {
                            var67.field2648 = var71;
                        }
                        if (var406 == 1417) {
                            var67.field2619 = var71;
                        }
                        if (var406 == 1418) {
                            var67.field2620 = var71;
                        }
                        if (var406 == 1419) {
                            var67.field2599 = var71;
                        }
                        if (var406 == 1420) {
                            var67.field2622 = var71;
                        }
                        if (var406 == 1421) {
                            var67.field2597 = var71;
                        }
                        if (var406 == 1422) {
                            var67.field2624 = var71;
                        }
                        if (var406 == 1423) {
                            var67.field2625 = var71;
                        }
                        if (var406 == 1424) {
                            var67.field2626 = var71;
                        }
                        var67.field2598 = true;
                        continue;
                    }
                    if (var406 < 1600) {
                        class156 var74 = var40 ? Statics.field399 : Statics.field391;
                        if (var406 == 1500) {
                            field387[var4++] = var74.field2643;
                            continue;
                        }
                        if (var406 == 1501) {
                            field387[var4++] = var74.field2537;
                            continue;
                        }
                        if (var406 == 1502) {
                            field387[var4++] = var74.field2540;
                            continue;
                        }
                        if (var406 == 1503) {
                            field387[var4++] = var74.field2541;
                            continue;
                        }
                        if (var406 == 1504) {
                            field387[var4++] = var74.field2543 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 1505) {
                            field387[var4++] = var74.field2542;
                            continue;
                        }
                    } else if (var406 < 1700) {
                        class156 var75 = var40 ? Statics.field399 : Statics.field391;
                        if (var406 == 1600) {
                            field387[var4++] = var75.field2544;
                            continue;
                        }
                        if (var406 == 1601) {
                            field387[var4++] = var75.field2545;
                            continue;
                        }
                        if (var406 == 1602) {
                            field393[var5++] = var75.field2621;
                            continue;
                        }
                        if (var406 == 1603) {
                            field387[var4++] = var75.field2550;
                            continue;
                        }
                        if (var406 == 1604) {
                            field387[var4++] = var75.field2547;
                            continue;
                        }
                        if (var406 == 1605) {
                            field387[var4++] = var75.field2574;
                            continue;
                        }
                        if (var406 == 1606) {
                            field387[var4++] = var75.field2571;
                            continue;
                        }
                        if (var406 == 1607) {
                            field387[var4++] = var75.field2527;
                            continue;
                        }
                        if (var406 == 1608) {
                            field387[var4++] = var75.field2521;
                            continue;
                        }
                    } else if (var406 < 1800) {
                        class156 var76 = var40 ? Statics.field399 : Statics.field391;
                        if (var406 == 1700) {
                            field387[var4++] = var76.field2635;
                            continue;
                        }
                        if (var406 == 1701) {
                            if (var76.field2635 == -1) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = var76.field2638;
                            }
                            continue;
                        }
                        if (var406 == 1702) {
                            field387[var4++] = var76.field2532;
                            continue;
                        }
                    } else if (var406 < 1900) {
                        class156 var77 = var40 ? Statics.field399 : Statics.field391;
                        if (var406 == 1800) {
                            field387[var4++] = class160.method2061(client.method2720(var77));
                            continue;
                        }
                        if (var406 == 1801) {
                            var4--;
                            int var78 = field387[var4];
                            int var407 = var78 - 1;
                            if (var77.field2592 != null && var407 < var77.field2592.length && var77.field2592[var407] != null) {
                                field393[var5++] = var77.field2592[var407];
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 1802) {
                            if (var77.field2591 == null) {
                                field393[var5++] = "";
                            } else {
                                field393[var5++] = var77.field2591;
                            }
                            continue;
                        }
                    } else if (var406 < 2600) {
                        var4--;
                        class156 var79 = class156.method2382(field387[var4]);
                        if (var406 == 2500) {
                            field387[var4++] = var79.field2643;
                            continue;
                        }
                        if (var406 == 2501) {
                            field387[var4++] = var79.field2537;
                            continue;
                        }
                        if (var406 == 2502) {
                            field387[var4++] = var79.field2540;
                            continue;
                        }
                        if (var406 == 2503) {
                            field387[var4++] = var79.field2541;
                            continue;
                        }
                        if (var406 == 2504) {
                            field387[var4++] = var79.field2543 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 2505) {
                            field387[var4++] = var79.field2542;
                            continue;
                        }
                    } else if (var406 < 2700) {
                        var4--;
                        class156 var80 = class156.method2382(field387[var4]);
                        if (var406 == 2600) {
                            field387[var4++] = var80.field2544;
                            continue;
                        }
                        if (var406 == 2601) {
                            field387[var4++] = var80.field2545;
                            continue;
                        }
                        if (var406 == 2602) {
                            field393[var5++] = var80.field2621;
                            continue;
                        }
                        if (var406 == 2603) {
                            field387[var4++] = var80.field2550;
                            continue;
                        }
                        if (var406 == 2604) {
                            field387[var4++] = var80.field2547;
                            continue;
                        }
                        if (var406 == 2605) {
                            field387[var4++] = var80.field2574;
                            continue;
                        }
                        if (var406 == 2606) {
                            field387[var4++] = var80.field2571;
                            continue;
                        }
                        if (var406 == 2607) {
                            field387[var4++] = var80.field2527;
                            continue;
                        }
                        if (var406 == 2608) {
                            field387[var4++] = var80.field2521;
                            continue;
                        }
                    } else if (var406 < 2800) {
                        if (var406 == 2700) {
                            var4--;
                            class156 var81 = class156.method2382(field387[var4]);
                            field387[var4++] = var81.field2635;
                            continue;
                        }
                        if (var406 == 2701) {
                            var4--;
                            class156 var82 = class156.method2382(field387[var4]);
                            if (var82.field2635 == -1) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = var82.field2638;
                            }
                            continue;
                        }
                        if (var406 == 2702) {
                            var4--;
                            int var83 = field387[var4];
                            class4 var84 = (class4) client.field630.method3354((long) var83);
                            if (var84 == null) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var406 < 2900) {
                        var4--;
                        class156 var85 = class156.method2382(field387[var4]);
                        if (var406 == 2800) {
                            field387[var4++] = class160.method2061(client.method2720(var85));
                            continue;
                        }
                        if (var406 == 2801) {
                            var4--;
                            int var86 = field387[var4];
                            int var408 = var86 - 1;
                            if (var85.field2592 != null && var408 < var85.field2592.length && var85.field2592[var408] != null) {
                                field393[var5++] = var85.field2592[var408];
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 2802) {
                            if (var85.field2591 == null) {
                                field393[var5++] = "";
                            } else {
                                field393[var5++] = var85.field2591;
                            }
                            continue;
                        }
                    } else if (var406 < 3200) {
                        if (var406 == 3100) {
                            var5--;
                            String var87 = field393[var5];
                            client.method1380(0, "", var87);
                            continue;
                        }
                        if (var406 == 3101) {
                            var4 -= 2;
                            client.method57(Statics.field2611, field387[var4], field387[var4 + 1]);
                            continue;
                        }
                        if (var406 == 3103) {
                            client.field634.method2358(3);
                            for (class4 var88 = (class4) client.field630.method3357(); var88 != null; var88 = (class4) client.field630.method3372()) {
                                if (var88.field49 == 0 || var88.field49 == 3) {
                                    client.method4(var88, true);
                                }
                            }
                            if (client.field633 != null) {
                                client.method2745(client.field633);
                                client.field633 = null;
                            }
                            continue;
                        }
                        if (var406 == 3104) {
                            var5--;
                            String var89 = field393[var5];
                            int var90 = 0;
                            boolean var91 = false;
                            boolean var92 = false;
                            int var93 = 0;
                            int var94 = var89.length();
                            int var95 = 0;
                            boolean var97;
                            while (true) {
                                if (var95 >= var94) {
                                    var97 = var92;
                                    break;
                                }
                                label2749: {
                                    char var96 = var89.charAt(var95);
                                    if (var95 == 0) {
                                        if (var96 == '-') {
                                            var91 = true;
                                            break label2749;
                                        }
                                        if (var96 == '+') {
                                            break label2749;
                                        }
                                    }
                                    int var409;
                                    if (var96 >= '0' && var96 <= '9') {
                                        var409 = var96 - '0';
                                    } else if (var96 >= 'A' && var96 <= 'Z') {
                                        var409 = var96 - '7';
                                    } else {
                                        if (var96 < 'a' || var96 > 'z') {
                                            var97 = false;
                                            break;
                                        }
                                        var409 = var96 - 'W';
                                    }
                                    if (var409 >= 10) {
                                        var97 = false;
                                        break;
                                    }
                                    if (var91) {
                                        var409 = -var409;
                                    }
                                    int var98 = var93 * 10 + var409;
                                    if (var98 / 10 != var93) {
                                        var97 = false;
                                        break;
                                    }
                                    var93 = var98;
                                    var92 = true;
                                }
                                var95++;
                            }
                            if (var97) {
                                var90 = class146.method32(var89);
                            }
                            client.field634.method2358(97);
                            client.field634.method2475(var90);
                            continue;
                        }
                        if (var406 == 3105) {
                            var5--;
                            String var100 = field393[var5];
                            client.field634.method2358(27);
                            client.field634.method2472(var100.length() + 1);
                            client.field634.method2477(var100);
                            continue;
                        }
                        if (var406 == 3106) {
                            var5--;
                            String var101 = field393[var5];
                            client.field634.method2358(55);
                            client.field634.method2472(var101.length() + 1);
                            client.field634.method2477(var101);
                            continue;
                        }
                        if (var406 == 3107) {
                            var4--;
                            int var102 = field387[var4];
                            var5--;
                            String var103 = field393[var5];
                            boolean var104 = false;
                            for (int var105 = 0; var105 < client.field590; var105++) {
                                class3 var106 = client.field618[client.field591[var105]];
                                if (var106 != null && var106.field36 != null && var106.field36.equalsIgnoreCase(var103)) {
                                    client.method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var106.field405[0], var106.field456[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var102 == 1) {
                                        client.field634.method2358(75);
                                        client.field634.method2540(client.field591[var105]);
                                    } else if (var102 == 4) {
                                        client.field634.method2358(109);
                                        client.field634.method2591(client.field591[var105]);
                                    } else if (var102 == 6) {
                                        client.field634.method2358(49);
                                        client.field634.method2540(client.field591[var105]);
                                    } else if (var102 == 7) {
                                        client.field634.method2358(158);
                                        client.field634.method2540(client.field591[var105]);
                                    }
                                    var104 = true;
                                    break;
                                }
                            }
                            if (!var104) {
                                client.method1380(0, "", class133.field2198 + var103);
                            }
                            continue;
                        }
                        if (var406 == 3108) {
                            var4 -= 3;
                            int var107 = field387[var4];
                            int var108 = field387[var4 + 1];
                            int var109 = field387[var4 + 2];
                            class156 var110 = class156.method2382(var109);
                            if (client.field640 == null && !client.field693 && var110 != null && Statics.method107(var110) != null) {
                                client.field640 = var110;
                                client.field641 = Statics.method107(var110);
                                client.field645 = var107;
                                client.field643 = var108;
                                Statics.field729 = 0;
                                client.field651 = false;
                            }
                            continue;
                        }
                        if (var406 == 3109) {
                            var4 -= 2;
                            int var111 = field387[var4];
                            int var112 = field387[var4 + 1];
                            class156 var113 = var40 ? Statics.field399 : Statics.field391;
                            if (client.field640 == null && !client.field693 && var113 != null && Statics.method107(var113) != null) {
                                client.field640 = var113;
                                client.field641 = Statics.method107(var113);
                                client.field645 = var111;
                                client.field643 = var112;
                                Statics.field729 = 0;
                                client.field651 = false;
                            }
                            continue;
                        }
                    } else if (var406 < 3300) {
                        if (var406 == 3200) {
                            var4 -= 3;
                            int var114 = field387[var4];
                            int var115 = field387[var4 + 1];
                            int var116 = field387[var4 + 2];
                            if (client.field713 != 0 && var115 != 0 && client.field718 < 50) {
                                client.field709[client.field718] = var114;
                                client.field710[client.field718] = var115;
                                client.field711[client.field718] = var116;
                                client.field512[client.field718] = null;
                                client.field712[client.field718] = 0;
                                client.field718++;
                            }
                            continue;
                        }
                        if (var406 == 3201) {
                            var4--;
                            client.method3126(field387[var4]);
                            continue;
                        }
                        if (var406 == 3202) {
                            var4 -= 2;
                            client.method821(field387[var4], field387[var4 + 1]);
                            continue;
                        }
                    } else if (var406 < 3400) {
                        if (var406 == 3300) {
                            field387[var4++] = client.field652;
                            continue;
                        }
                        if (var406 == 3301) {
                            var4 -= 2;
                            int var117 = field387[var4];
                            int var118 = field387[var4 + 1];
                            field387[var4++] = class18.method2709(var117, var118);
                            continue;
                        }
                        if (var406 == 3302) {
                            var4 -= 2;
                            int var119 = field387[var4];
                            int var120 = field387[var4 + 1];
                            field387[var4++] = class18.method2349(var119, var120);
                            continue;
                        }
                        if (var406 == 3303) {
                            var4 -= 2;
                            int var121 = field387[var4];
                            int var122 = field387[var4 + 1];
                            field387[var4++] = class18.method94(var121, var122);
                            continue;
                        }
                        if (var406 == 3304) {
                            var4--;
                            int var123 = field387[var4];
                            int[] var124 = field387;
                            int var125 = var4++;
                            class40 var126 = (class40) class40.field1020.method3311((long) var123);
                            class40 var127;
                            if (var126 == null) {
                                byte[] var128 = Statics.field1022.method3012(5, var123);
                                class40 var129 = new class40();
                                if (var128 != null) {
                                    var129.method879(new class126(var128));
                                }
                                class40.field1020.method3314(var129, (long) var123);
                                var127 = var129;
                            } else {
                                var127 = var126;
                            }
                            var124[var125] = var127.field1021;
                            continue;
                        }
                        if (var406 == 3305) {
                            var4--;
                            int var130 = field387[var4];
                            field387[var4++] = client.field655[var130];
                            continue;
                        }
                        if (var406 == 3306) {
                            var4--;
                            int var131 = field387[var4];
                            field387[var4++] = client.field574[var131];
                            continue;
                        }
                        if (var406 == 3307) {
                            var4--;
                            int var132 = field387[var4];
                            field387[var4++] = client.field609[var132];
                            continue;
                        }
                        if (var406 == 3308) {
                            int var133 = Statics.field1899;
                            int var134 = (Statics.field2611.field441 >> 7) + Statics.field362;
                            int var135 = (Statics.field2611.field433 >> 7) + Statics.field65;
                            field387[var4++] = (var133 << 28) + (var134 << 14) + var135;
                            continue;
                        }
                        if (var406 == 3309) {
                            var4--;
                            int var136 = field387[var4];
                            field387[var4++] = var136 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var406 == 3310) {
                            var4--;
                            int var137 = field387[var4];
                            field387[var4++] = var137 >> 28;
                            continue;
                        }
                        if (var406 == 3311) {
                            var4--;
                            int var138 = field387[var4];
                            field387[var4++] = var138 & 0x3FFF;
                            continue;
                        }
                        if (var406 == 3312) {
                            field387[var4++] = client.field470 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 3313) {
                            var4 -= 2;
                            int var139 = field387[var4] + 32768;
                            int var140 = field387[var4 + 1];
                            field387[var4++] = class18.method2709(var139, var140);
                            continue;
                        }
                        if (var406 == 3314) {
                            var4 -= 2;
                            int var141 = field387[var4] + 32768;
                            int var142 = field387[var4 + 1];
                            field387[var4++] = class18.method2349(var141, var142);
                            continue;
                        }
                        if (var406 == 3315) {
                            var4 -= 2;
                            int var143 = field387[var4] + 32768;
                            int var144 = field387[var4 + 1];
                            field387[var4++] = class18.method94(var143, var144);
                            continue;
                        }
                        if (var406 == 3316) {
                            if (client.field636 >= 2) {
                                field387[var4++] = client.field636;
                            } else {
                                field387[var4++] = 0;
                            }
                            continue;
                        }
                        if (var406 == 3317) {
                            field387[var4++] = client.field584;
                            continue;
                        }
                        if (var406 == 3318) {
                            field387[var4++] = client.field466;
                            continue;
                        }
                        if (var406 == 3321) {
                            field387[var4++] = client.field511;
                            continue;
                        }
                        if (var406 == 3322) {
                            field387[var4++] = client.field635;
                            continue;
                        }
                        if (var406 == 3323) {
                            if (client.field616) {
                                field387[var4++] = 1;
                            } else {
                                field387[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var406 < 3500) {
                        if (var406 == 3400) {
                            var4 -= 2;
                            int var145 = field387[var4];
                            int var146 = field387[var4 + 1];
                            class38 var147 = (class38) class38.field952.method3311((long) var145);
                            class38 var148;
                            if (var147 == null) {
                                byte[] var149 = Statics.field959.method3012(8, var145);
                                class38 var150 = new class38();
                                if (var149 != null) {
                                    var150.method825(new class126(var149));
                                }
                                class38.field952.method3314(var150, (long) var145);
                                var148 = var150;
                            } else {
                                var148 = var147;
                            }
                            class38 var151 = var148;
                            if (var148.field957 != 's') {
                            }
                            for (int var152 = 0; var152 < var151.field961; var152++) {
                                if (var151.field958[var152] == var146) {
                                    field393[var5++] = var151.field960[var152];
                                    var151 = null;
                                    break;
                                }
                            }
                            if (var151 != null) {
                                field393[var5++] = var151.field955;
                            }
                            continue;
                        }
                        if (var406 == 3408) {
                            var4 -= 4;
                            int var153 = field387[var4];
                            int var154 = field387[var4 + 1];
                            int var155 = field387[var4 + 2];
                            int var156 = field387[var4 + 3];
                            class38 var157 = (class38) class38.field952.method3311((long) var155);
                            class38 var158;
                            if (var157 == null) {
                                byte[] var159 = Statics.field959.method3012(8, var155);
                                class38 var160 = new class38();
                                if (var159 != null) {
                                    var160.method825(new class126(var159));
                                }
                                class38.field952.method3314(var160, (long) var155);
                                var158 = var160;
                            } else {
                                var158 = var157;
                            }
                            class38 var161 = var158;
                            if (var158.field963 == var153 && var158.field957 == var154) {
                                for (int var162 = 0; var162 < var161.field961; var162++) {
                                    if (var161.field958[var162] == var156) {
                                        if (var154 == 115) {
                                            field393[var5++] = var161.field960[var162];
                                        } else {
                                            field387[var4++] = var161.field954[var162];
                                        }
                                        var161 = null;
                                        break;
                                    }
                                }
                                if (var161 != null) {
                                    if (var154 == 115) {
                                        field393[var5++] = var161.field955;
                                    } else {
                                        field387[var4++] = var161.field951;
                                    }
                                }
                                continue;
                            }
                            if (var154 == 115) {
                                field393[var5++] = "null";
                            } else {
                                field387[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var406 < 3700) {
                        if (var406 == 3600) {
                            if (client.field468 == 0) {
                                field387[var4++] = -2;
                            } else if (client.field468 == 1) {
                                field387[var4++] = -1;
                            } else {
                                field387[var4++] = client.field720;
                            }
                            continue;
                        }
                        if (var406 == 3601) {
                            var4--;
                            int var163 = field387[var4];
                            if (client.field468 == 2 && var163 < client.field720) {
                                field393[var5++] = client.field523[var163].field358;
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 3602) {
                            var4--;
                            int var164 = field387[var4];
                            if (client.field468 == 2 && var164 < client.field720) {
                                field387[var4++] = client.field523[var164].field357;
                                continue;
                            }
                            field387[var4++] = 0;
                            continue;
                        }
                        if (var406 == 3603) {
                            var4--;
                            int var165 = field387[var4];
                            if (client.field468 == 2 && var165 < client.field720) {
                                field387[var4++] = client.field523[var165].field354;
                                continue;
                            }
                            field387[var4++] = 0;
                            continue;
                        }
                        if (var406 == 3604) {
                            var5--;
                            String var166 = field393[var5];
                            var4--;
                            int var167 = field387[var4];
                            client.method1680(var166, var167);
                            continue;
                        }
                        if (var406 == 3605) {
                            var5--;
                            String var168 = field393[var5];
                            if (var168 == null) {
                                continue;
                            }
                            if ((client.field720 < 200 || client.field596 == 1) && client.field720 < 200) {
                                String var169 = class147.method2352(var168, Statics.field469);
                                if (var169 == null) {
                                    continue;
                                }
                                for (int var170 = 0; var170 < client.field720; var170++) {
                                    class22 var171 = client.field523[var170];
                                    String var172 = class147.method2352(var171.field358, Statics.field469);
                                    if (var172 != null && var172.equals(var169)) {
                                        client.method1380(0, "", var168 + class133.field2216);
                                        continue label2544;
                                    }
                                    if (var171.field352 != null) {
                                        String var173 = class147.method2352(var171.field352, Statics.field469);
                                        if (var173 != null && var173.equals(var169)) {
                                            client.method1380(0, "", var168 + class133.field2216);
                                            continue label2544;
                                        }
                                    }
                                }
                                for (int var174 = 0; var174 < client.field724; var174++) {
                                    class11 var175 = client.field725[var174];
                                    String var176 = class147.method2352(var175.field175, Statics.field469);
                                    if (var176 != null && var176.equals(var169)) {
                                        client.method1380(0, "", class133.field2116 + var168 + class133.field2222);
                                        continue label2544;
                                    }
                                    if (var175.field174 != null) {
                                        String var177 = class147.method2352(var175.field174, Statics.field469);
                                        if (var177 != null && var177.equals(var169)) {
                                            client.method1380(0, "", class133.field2116 + var168 + class133.field2222);
                                            continue label2544;
                                        }
                                    }
                                }
                                if (class147.method2352(Statics.field2611.field36, Statics.field469).equals(var169)) {
                                    client.method1380(0, "", class133.field2219);
                                } else {
                                    client.field634.method2358(198);
                                    client.field634.method2472(class126.method198(var168));
                                    client.field634.method2477(var168);
                                }
                                continue;
                            }
                            client.method1380(0, "", class133.field2215);
                            continue;
                        }
                        if (var406 == 3606) {
                            var5--;
                            String var178 = field393[var5];
                            client.method1543(var178);
                            continue;
                        }
                        if (var406 == 3607) {
                            var5--;
                            String var179 = field393[var5];
                            client.method54(var179, false);
                            continue;
                        }
                        if (var406 == 3608) {
                            var5--;
                            String var180 = field393[var5];
                            client.method2228(var180);
                            continue;
                        }
                        if (var406 == 3609) {
                            var5--;
                            String var181 = field393[var5];
                            if (var181.startsWith(class2.method548(0)) || var181.startsWith(class2.method548(1))) {
                                var181 = var181.substring(7);
                            }
                            field387[var4++] = client.method195(var181) ? 1 : 0;
                            continue;
                        }
                        if (var406 == 3611) {
                            if (client.field702 == null) {
                                field393[var5++] = "";
                                continue;
                            }
                            String[] var182 = field393;
                            int var183 = var5++;
                            String var184 = client.field702;
                            long var185 = 0L;
                            int var187 = var184.length();
                            for (int var188 = 0; var188 < var187; var188++) {
                                var185 *= 37L;
                                char var189 = var184.charAt(var188);
                                if (var189 >= 'A' && var189 <= 'Z') {
                                    var185 += (long) (var189 + 1 - 65);
                                } else if (var189 >= 'a' && var189 <= 'z') {
                                    var185 += (long) (var189 + 1 - 97);
                                } else if (var189 >= '0' && var189 <= '9') {
                                    var185 += (long) (var189 + 27 - 48);
                                }
                                if (var185 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var185 % 37L == 0L && var185 != 0L) {
                                var185 /= 37L;
                            }
                            String var192 = class145.method552(var185);
                            if (var192 == null) {
                                var192 = "";
                            }
                            var182[var183] = var192;
                            continue;
                        }
                        if (var406 == 3612) {
                            if (client.field702 == null) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = Statics.field46;
                            }
                            continue;
                        }
                        if (var406 == 3613) {
                            var4--;
                            int var194 = field387[var4];
                            if (client.field702 != null && var194 < Statics.field46) {
                                field393[var5++] = Statics.field256[var194].field106;
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 3614) {
                            var4--;
                            int var195 = field387[var4];
                            if (client.field702 != null && var195 < Statics.field46) {
                                field387[var4++] = Statics.field256[var195].field108;
                                continue;
                            }
                            field387[var4++] = 0;
                            continue;
                        }
                        if (var406 == 3615) {
                            var4--;
                            int var196 = field387[var4];
                            if (client.field702 != null && var196 < Statics.field46) {
                                field387[var4++] = Statics.field256[var196].field107;
                                continue;
                            }
                            field387[var4++] = 0;
                            continue;
                        }
                        if (var406 == 3616) {
                            field387[var4++] = Statics.field242;
                            continue;
                        }
                        if (var406 == 3617) {
                            var5--;
                            String var197 = field393[var5];
                            client.method117(var197);
                            continue;
                        }
                        if (var406 == 3618) {
                            field387[var4++] = Statics.field1947;
                            continue;
                        }
                        if (var406 == 3619) {
                            var5--;
                            String var198 = field393[var5];
                            client.method210(var198);
                            continue;
                        }
                        if (var406 == 3620) {
                            client.method810();
                            continue;
                        }
                        if (var406 == 3621) {
                            if (client.field468 == 0) {
                                field387[var4++] = -1;
                            } else {
                                field387[var4++] = client.field724;
                            }
                            continue;
                        }
                        if (var406 == 3622) {
                            var4--;
                            int var199 = field387[var4];
                            if (client.field468 != 0 && var199 < client.field724) {
                                field393[var5++] = client.field725[var199].field175;
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 3623) {
                            var5--;
                            String var200 = field393[var5];
                            if (var200.startsWith(class2.method548(0)) || var200.startsWith(class2.method548(1))) {
                                var200 = var200.substring(7);
                            }
                            field387[var4++] = client.method877(var200) ? 1 : 0;
                            continue;
                        }
                        if (var406 == 3624) {
                            var4--;
                            int var201 = field387[var4];
                            if (Statics.field256 != null && var201 < Statics.field46 && Statics.field256[var201].field106.equalsIgnoreCase(Statics.field2611.field36)) {
                                field387[var4++] = 1;
                                continue;
                            }
                            field387[var4++] = 0;
                            continue;
                        }
                        if (var406 == 3625) {
                            if (client.field694 == null) {
                                field393[var5++] = "";
                                continue;
                            }
                            String[] var202 = field393;
                            int var203 = var5++;
                            String var204 = client.field694;
                            long var205 = 0L;
                            int var207 = var204.length();
                            for (int var208 = 0; var208 < var207; var208++) {
                                var205 *= 37L;
                                char var209 = var204.charAt(var208);
                                if (var209 >= 'A' && var209 <= 'Z') {
                                    var205 += (long) (var209 + 1 - 65);
                                } else if (var209 >= 'a' && var209 <= 'z') {
                                    var205 += (long) (var209 + 1 - 97);
                                } else if (var209 >= '0' && var209 <= '9') {
                                    var205 += (long) (var209 + 27 - 48);
                                }
                                if (var205 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var205 % 37L == 0L && var205 != 0L) {
                                var205 /= 37L;
                            }
                            String var212 = class145.method552(var205);
                            if (var212 == null) {
                                var212 = "";
                            }
                            var202[var203] = var212;
                            continue;
                        }
                    } else if (var406 < 4100) {
                        if (var406 == 4000) {
                            var4 -= 2;
                            int var214 = field387[var4];
                            int var215 = field387[var4 + 1];
                            field387[var4++] = var214 + var215;
                            continue;
                        }
                        if (var406 == 4001) {
                            var4 -= 2;
                            int var216 = field387[var4];
                            int var217 = field387[var4 + 1];
                            field387[var4++] = var216 - var217;
                            continue;
                        }
                        if (var406 == 4002) {
                            var4 -= 2;
                            int var218 = field387[var4];
                            int var219 = field387[var4 + 1];
                            field387[var4++] = var218 * var219;
                            continue;
                        }
                        if (var406 == 4003) {
                            var4 -= 2;
                            int var220 = field387[var4];
                            int var221 = field387[var4 + 1];
                            field387[var4++] = var220 / var221;
                            continue;
                        }
                        if (var406 == 4004) {
                            var4--;
                            int var222 = field387[var4];
                            field387[var4++] = (int) (Math.random() * (double) var222);
                            continue;
                        }
                        if (var406 == 4005) {
                            var4--;
                            int var223 = field387[var4];
                            field387[var4++] = (int) (Math.random() * (double) (var223 + 1));
                            continue;
                        }
                        if (var406 == 4006) {
                            var4 -= 5;
                            int var224 = field387[var4];
                            int var225 = field387[var4 + 1];
                            int var226 = field387[var4 + 2];
                            int var227 = field387[var4 + 3];
                            int var228 = field387[var4 + 4];
                            field387[var4++] = (var225 - var224) * (var228 - var226) / (var227 - var226) + var224;
                            continue;
                        }
                        if (var406 == 4007) {
                            var4 -= 2;
                            int var229 = field387[var4];
                            int var230 = field387[var4 + 1];
                            field387[var4++] = var229 * var230 / 100 + var229;
                            continue;
                        }
                        if (var406 == 4008) {
                            var4 -= 2;
                            int var231 = field387[var4];
                            int var232 = field387[var4 + 1];
                            field387[var4++] = var231 | 0x1 << var232;
                            continue;
                        }
                        if (var406 == 4009) {
                            var4 -= 2;
                            int var233 = field387[var4];
                            int var234 = field387[var4 + 1];
                            field387[var4++] = var233 & -1 - (0x1 << var234);
                            continue;
                        }
                        if (var406 == 4010) {
                            var4 -= 2;
                            int var235 = field387[var4];
                            int var236 = field387[var4 + 1];
                            field387[var4++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var406 == 4011) {
                            var4 -= 2;
                            int var237 = field387[var4];
                            int var238 = field387[var4 + 1];
                            field387[var4++] = var237 % var238;
                            continue;
                        }
                        if (var406 == 4012) {
                            var4 -= 2;
                            int var239 = field387[var4];
                            int var240 = field387[var4 + 1];
                            if (var239 == 0) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = (int) Math.pow((double) var239, (double) var240);
                            }
                            continue;
                        }
                        if (var406 == 4013) {
                            var4 -= 2;
                            int var241 = field387[var4];
                            int var242 = field387[var4 + 1];
                            if (var241 == 0) {
                                field387[var4++] = 0;
                            } else if (var242 == 0) {
                                field387[var4++] = Integer.MAX_VALUE;
                            } else {
                                field387[var4++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                            }
                            continue;
                        }
                        if (var406 == 4014) {
                            var4 -= 2;
                            int var243 = field387[var4];
                            int var244 = field387[var4 + 1];
                            field387[var4++] = var243 & var244;
                            continue;
                        }
                        if (var406 == 4015) {
                            var4 -= 2;
                            int var245 = field387[var4];
                            int var246 = field387[var4 + 1];
                            field387[var4++] = var245 | var246;
                            continue;
                        }
                    } else if (var406 < 4200) {
                        if (var406 == 4100) {
                            var5--;
                            String var247 = field393[var5];
                            var4--;
                            int var248 = field387[var4];
                            field393[var5++] = var247 + var248;
                            continue;
                        }
                        if (var406 == 4101) {
                            var5 -= 2;
                            String var249 = field393[var5];
                            String var250 = field393[var5 + 1];
                            field393[var5++] = var249 + var250;
                            continue;
                        }
                        if (var406 == 4102) {
                            var5--;
                            String var251 = field393[var5];
                            var4--;
                            int var252 = field387[var4];
                            String[] var253 = field393;
                            int var254 = var5++;
                            String var256;
                            if (var252 < 0) {
                                var256 = Integer.toString(var252);
                            } else {
                                int var257 = var252;
                                String var258;
                                if (var252 < 0) {
                                    var258 = Integer.toString(var252, 10);
                                } else {
                                    int var259 = 2;
                                    int var260 = var252 / 10;
                                    while (var260 != 0) {
                                        var260 /= 10;
                                        var259++;
                                    }
                                    char[] var261 = new char[var259];
                                    var261[0] = '+';
                                    for (int var262 = var259 - 1; var262 > 0; var262--) {
                                        int var263 = var257;
                                        var257 /= 10;
                                        int var264 = var263 - var257 * 10;
                                        if (var264 >= 10) {
                                            var261[var262] = (char) (var264 + 87);
                                        } else {
                                            var261[var262] = (char) (var264 + 48);
                                        }
                                    }
                                    var258 = new String(var261);
                                }
                                var256 = var258;
                            }
                            var253[var254] = var251 + var256;
                            continue;
                        }
                        if (var406 == 4103) {
                            var5--;
                            String var265 = field393[var5];
                            field393[var5++] = var265.toLowerCase();
                            continue;
                        }
                        if (var406 == 4104) {
                            var4--;
                            int var266 = field387[var4];
                            long var267 = ((long) var266 + 11745L) * 86400000L;
                            field390.setTime(new Date(var267));
                            int var269 = field390.get(5);
                            int var270 = field390.get(2);
                            int var271 = field390.get(1);
                            field393[var5++] = var269 + "-" + field398[var270] + "-" + var271;
                            continue;
                        }
                        if (var406 == 4105) {
                            var5 -= 2;
                            String var272 = field393[var5];
                            String var273 = field393[var5 + 1];
                            if (Statics.field2611.field28 != null && Statics.field2611.field28.field2674) {
                                field393[var5++] = var273;
                                continue;
                            }
                            field393[var5++] = var272;
                            continue;
                        }
                        if (var406 == 4106) {
                            var4--;
                            int var274 = field387[var4];
                            field393[var5++] = Integer.toString(var274);
                            continue;
                        }
                        if (var406 == 4107) {
                            var5 -= 2;
                            int[] var275 = field387;
                            int var276 = var4++;
                            String var277 = field393[var5];
                            String var278 = field393[var5 + 1];
                            int var279 = client.field499;
                            int var280 = var277.length();
                            int var281 = var278.length();
                            int var282 = 0;
                            int var283 = 0;
                            char var284 = 0;
                            char var285 = 0;
                            int var286;
                            label2327: while (true) {
                                if (var282 - var284 >= var280 && var283 - var285 >= var281) {
                                    int var295 = Math.min(var280, var281);
                                    for (int var296 = 0; var296 < var295; var296++) {
                                        char var299 = var277.charAt(var296);
                                        char var300 = var278.charAt(var296);
                                        if (var299 != var300 && Character.toUpperCase(var299) != Character.toUpperCase(var300)) {
                                            char var301 = Character.toLowerCase(var299);
                                            char var302 = Character.toLowerCase(var300);
                                            if (var301 != var302) {
                                                var286 = class149.method898(var301, var279) - class149.method898(var302, var279);
                                                break label2327;
                                            }
                                        }
                                    }
                                    int var303 = var280 - var281;
                                    if (var303 == 0) {
                                        for (int var304 = 0; var304 < var295; var304++) {
                                            char var305 = var277.charAt(var304);
                                            char var306 = var278.charAt(var304);
                                            if (var305 != var306) {
                                                var286 = class149.method898(var305, var279) - class149.method898(var306, var279);
                                                break label2327;
                                            }
                                        }
                                        var286 = 0;
                                    } else {
                                        var286 = var303;
                                    }
                                    break;
                                }
                                if (var282 - var284 >= var280) {
                                    var286 = -1;
                                    break;
                                }
                                if (var283 - var285 >= var281) {
                                    var286 = 1;
                                    break;
                                }
                                char var287;
                                if (var284 == 0) {
                                    var287 = var277.charAt(var282++);
                                } else {
                                    var287 = var284;
                                    boolean var288 = false;
                                }
                                char var289;
                                if (var285 == 0) {
                                    var289 = var278.charAt(var283++);
                                } else {
                                    var289 = var285;
                                    boolean var290 = false;
                                }
                                var284 = class149.method822(var287);
                                var285 = class149.method822(var289);
                                char var291 = class149.method2394(var287, var279);
                                char var292 = class149.method2394(var289, var279);
                                if (var291 != var292 && Character.toUpperCase(var291) != Character.toUpperCase(var292)) {
                                    char var293 = Character.toLowerCase(var291);
                                    char var294 = Character.toLowerCase(var292);
                                    if (var293 != var294) {
                                        var286 = class149.method898(var293, var279) - class149.method898(var294, var279);
                                        break;
                                    }
                                }
                            }
                            var275[var276] = class146.method1627(var286);
                            continue;
                        }
                        if (var406 == 4108) {
                            var5--;
                            String var307 = field393[var5];
                            var4 -= 2;
                            int var308 = field387[var4];
                            int var309 = field387[var4 + 1];
                            byte[] var310 = Statics.field658.method3012(var309, 0);
                            class181 var311 = new class181(var310);
                            field387[var4++] = var311.method3452(var307, var308);
                            continue;
                        }
                        if (var406 == 4109) {
                            var5--;
                            String var312 = field393[var5];
                            var4 -= 2;
                            int var313 = field387[var4];
                            int var314 = field387[var4 + 1];
                            byte[] var315 = Statics.field658.method3012(var314, 0);
                            class181 var316 = new class181(var315);
                            field387[var4++] = var316.method3472(var312, var313);
                            continue;
                        }
                        if (var406 == 4110) {
                            var5 -= 2;
                            String var317 = field393[var5];
                            String var318 = field393[var5 + 1];
                            var4--;
                            if (field387[var4] == 1) {
                                field393[var5++] = var317;
                            } else {
                                field393[var5++] = var318;
                            }
                            continue;
                        }
                        if (var406 == 4111) {
                            var5--;
                            String var319 = field393[var5];
                            field393[var5++] = class183.method3453(var319);
                            continue;
                        }
                        if (var406 == 4112) {
                            var5--;
                            String var320 = field393[var5];
                            var4--;
                            int var321 = field387[var4];
                            field393[var5++] = var320 + (char) var321;
                            continue;
                        }
                        if (var406 == 4113) {
                            var4--;
                            int var322 = field387[var4];
                            int[] var323 = field387;
                            int var324 = var4++;
                            char var325 = (char) var322;
                            boolean var326;
                            if (var325 >= ' ' && var325 <= '~') {
                                var326 = true;
                            } else if (var325 >= 160 && var325 <= 255) {
                                var326 = true;
                            } else if (var325 == 8364 || var325 == 338 || var325 == 8212 || var325 == 339 || var325 == 376) {
                                var326 = true;
                            } else {
                                var326 = false;
                            }
                            var323[var324] = var326 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 4114) {
                            var4--;
                            int var327 = field387[var4];
                            int[] var328 = field387;
                            int var329 = var4++;
                            char var330 = (char) var327;
                            boolean var331 = var330 >= '0' && var330 <= '9' || var330 >= 'A' && var330 <= 'Z' || var330 >= 'a' && var330 <= 'z';
                            var328[var329] = var331 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 4115) {
                            var4--;
                            int var332 = field387[var4];
                            int[] var333 = field387;
                            int var334 = var4++;
                            char var335 = (char) var332;
                            boolean var336 = var335 >= 'A' && var335 <= 'Z' || var335 >= 'a' && var335 <= 'z';
                            var333[var334] = var336 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 4116) {
                            var4--;
                            int var337 = field387[var4];
                            int[] var338 = field387;
                            int var339 = var4++;
                            char var340 = (char) var337;
                            boolean var341 = var340 >= '0' && var340 <= '9';
                            var338[var339] = var341 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 4117) {
                            var5--;
                            String var342 = field393[var5];
                            if (var342 == null) {
                                field387[var4++] = 0;
                            } else {
                                field387[var4++] = var342.length();
                            }
                            continue;
                        }
                        if (var406 == 4118) {
                            var5--;
                            String var343 = field393[var5];
                            var4 -= 2;
                            int var344 = field387[var4];
                            int var345 = field387[var4 + 1];
                            field393[var5++] = var343.substring(var344, var345);
                            continue;
                        }
                        if (var406 == 4119) {
                            var5--;
                            String var346 = field393[var5];
                            StringBuilder var347 = new StringBuilder(var346.length());
                            boolean var348 = false;
                            for (int var349 = 0; var349 < var346.length(); var349++) {
                                char var350 = var346.charAt(var349);
                                if (var350 == '<') {
                                    var348 = true;
                                } else if (var350 == '>') {
                                    var348 = false;
                                } else if (!var348) {
                                    var347.append(var350);
                                }
                            }
                            field393[var5++] = var347.toString();
                            continue;
                        }
                        if (var406 == 4120) {
                            var5--;
                            String var351 = field393[var5];
                            var4--;
                            int var352 = field387[var4];
                            field387[var4++] = var351.indexOf(var352);
                            continue;
                        }
                    } else if (var406 < 4300) {
                        if (var406 == 4200) {
                            var4--;
                            int var353 = field387[var4];
                            field393[var5++] = class39.method196(var353).field975;
                            continue;
                        }
                        if (var406 == 4201) {
                            var4 -= 2;
                            int var354 = field387[var4];
                            int var355 = field387[var4 + 1];
                            class39 var356 = class39.method196(var354);
                            if (var355 >= 1 && var355 <= 5 && var356.field991[var355 - 1] != null) {
                                field393[var5++] = var356.field991[var355 - 1];
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 4202) {
                            var4 -= 2;
                            int var357 = field387[var4];
                            int var358 = field387[var4 + 1];
                            class39 var359 = class39.method196(var357);
                            if (var358 >= 1 && var358 <= 5 && var359.field990[var358 - 1] != null) {
                                field393[var5++] = var359.field990[var358 - 1];
                                continue;
                            }
                            field393[var5++] = "";
                            continue;
                        }
                        if (var406 == 4203) {
                            var4--;
                            int var360 = field387[var4];
                            field387[var4++] = class39.method196(var360).field987;
                            continue;
                        }
                        if (var406 == 4204) {
                            var4--;
                            int var361 = field387[var4];
                            field387[var4++] = class39.method196(var361).field986 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var406 == 4205) {
                            var4--;
                            int var362 = field387[var4];
                            class39 var363 = class39.method196(var362);
                            if (var363.field1006 == -1 && var363.field1018 >= 0) {
                                field387[var4++] = var363.field1018;
                                continue;
                            }
                            field387[var4++] = var362;
                            continue;
                        }
                        if (var406 == 4206) {
                            var4--;
                            int var364 = field387[var4];
                            class39 var365 = class39.method196(var364);
                            if (var365.field1006 >= 0 && var365.field1018 >= 0) {
                                field387[var4++] = var365.field1018;
                                continue;
                            }
                            field387[var4++] = var364;
                            continue;
                        }
                        if (var406 == 4207) {
                            var4--;
                            int var366 = field387[var4];
                            field387[var4++] = class39.method196(var366).field993 ? 1 : 0;
                            continue;
                        }
                    } else if (var406 < 5100) {
                        if (var406 == 5000) {
                            field387[var4++] = client.field686;
                            continue;
                        }
                        if (var406 == 5001) {
                            var4 -= 3;
                            client.field686 = field387[var4];
                            int var367 = field387[var4 + 1];
                            class136[] var368 = class136.method2989();
                            int var369 = 0;
                            class136 var371;
                            while (true) {
                                if (var369 >= var368.length) {
                                    var371 = null;
                                    break;
                                }
                                class136 var370 = var368[var369];
                                if (var370.field2307 == var367) {
                                    var371 = var370;
                                    break;
                                }
                                var369++;
                            }
                            Statics.field394 = var371;
                            if (Statics.field394 == null) {
                                Statics.field394 = class136.field2302;
                            }
                            client.field687 = field387[var4 + 2];
                            client.field634.method2358(210);
                            client.field634.method2472(client.field686);
                            client.field634.method2472(Statics.field394.field2307);
                            client.field634.method2472(client.field687);
                            continue;
                        }
                        if (var406 == 5002) {
                            var5--;
                            String var372 = field393[var5];
                            var4 -= 2;
                            int var373 = field387[var4];
                            int var374 = field387[var4 + 1];
                            client.field634.method2358(163);
                            client.field634.method2472(class126.method198(var372) + 2);
                            client.field634.method2477(var372);
                            client.field634.method2472(var373 - 1);
                            client.field634.method2472(var374);
                            continue;
                        }
                        if (var406 == 5003) {
                            var4--;
                            int var375 = field387[var4];
                            String var376 = null;
                            if (var375 < 100) {
                                var376 = client.field617[var375];
                            }
                            if (var376 == null) {
                                var376 = "";
                            }
                            field393[var5++] = var376;
                            continue;
                        }
                        if (var406 == 5004) {
                            var4--;
                            int var377 = field387[var4];
                            int var378 = -1;
                            if (var377 < 100 && client.field617[var377] != null) {
                                var378 = client.field680[var377];
                            }
                            field387[var4++] = var378;
                            continue;
                        }
                        if (var406 == 5005) {
                            if (Statics.field394 == null) {
                                field387[var4++] = -1;
                            } else {
                                field387[var4++] = Statics.field394.field2307;
                            }
                            continue;
                        }
                        if (var406 == 5008) {
                            var5--;
                            String var379 = field393[var5];
                            if (!var379.startsWith("::")) {
                                String var383 = var379.toLowerCase();
                                byte var384 = 0;
                                if (var383.startsWith(class133.field2225)) {
                                    var384 = 0;
                                    var379 = var379.substring(class133.field2225.length());
                                } else if (var383.startsWith(class133.field2227)) {
                                    var384 = 1;
                                    var379 = var379.substring(class133.field2227.length());
                                } else if (var383.startsWith(class133.field2229)) {
                                    var384 = 2;
                                    var379 = var379.substring(class133.field2229.length());
                                } else if (var383.startsWith(class133.field2231)) {
                                    var384 = 3;
                                    var379 = var379.substring(class133.field2231.length());
                                } else if (var383.startsWith(class133.field2233)) {
                                    var384 = 4;
                                    var379 = var379.substring(class133.field2233.length());
                                } else if (var383.startsWith(class133.field2134)) {
                                    var384 = 5;
                                    var379 = var379.substring(class133.field2134.length());
                                } else if (var383.startsWith(class133.field2237)) {
                                    var384 = 6;
                                    var379 = var379.substring(class133.field2237.length());
                                } else if (var383.startsWith(class133.field2220)) {
                                    var384 = 7;
                                    var379 = var379.substring(class133.field2220.length());
                                } else if (var383.startsWith(class133.field2263)) {
                                    var384 = 8;
                                    var379 = var379.substring(class133.field2263.length());
                                } else if (var383.startsWith(class133.field2243)) {
                                    var384 = 9;
                                    var379 = var379.substring(class133.field2243.length());
                                } else if (var383.startsWith(class133.field2124)) {
                                    var384 = 10;
                                    var379 = var379.substring(class133.field2124.length());
                                } else if (var383.startsWith(class133.field2247)) {
                                    var384 = 11;
                                    var379 = var379.substring(class133.field2247.length());
                                } else if (client.field499 != 0) {
                                    if (var383.startsWith(class133.field2205)) {
                                        var384 = 0;
                                        var379 = var379.substring(class133.field2205.length());
                                    } else if (var383.startsWith(class133.field2228)) {
                                        var384 = 1;
                                        var379 = var379.substring(class133.field2228.length());
                                    } else if (var383.startsWith(class133.field2251)) {
                                        var384 = 2;
                                        var379 = var379.substring(class133.field2251.length());
                                    } else if (var383.startsWith(class133.field2206)) {
                                        var384 = 3;
                                        var379 = var379.substring(class133.field2206.length());
                                    } else if (var383.startsWith(class133.field2234)) {
                                        var384 = 4;
                                        var379 = var379.substring(class133.field2234.length());
                                    } else if (var383.startsWith(class133.field2236)) {
                                        var384 = 5;
                                        var379 = var379.substring(class133.field2236.length());
                                    } else if (var383.startsWith(class133.field2238)) {
                                        var384 = 6;
                                        var379 = var379.substring(class133.field2238.length());
                                    } else if (var383.startsWith(class133.field2266)) {
                                        var384 = 7;
                                        var379 = var379.substring(class133.field2266.length());
                                    } else if (var383.startsWith(class133.field2267)) {
                                        var384 = 8;
                                        var379 = var379.substring(class133.field2267.length());
                                    } else if (var383.startsWith(class133.field2244)) {
                                        var384 = 9;
                                        var379 = var379.substring(class133.field2244.length());
                                    } else if (var383.startsWith(class133.field2246)) {
                                        var384 = 10;
                                        var379 = var379.substring(class133.field2246.length());
                                    } else if (var383.startsWith(class133.field2248)) {
                                        var384 = 11;
                                        var379 = var379.substring(class133.field2248.length());
                                    }
                                }
                                String var385 = var379.toLowerCase();
                                byte var386 = 0;
                                if (var385.startsWith(class133.field2249)) {
                                    var386 = 1;
                                    var379 = var379.substring(class133.field2249.length());
                                } else if (var385.startsWith(class133.field2091)) {
                                    var386 = 2;
                                    var379 = var379.substring(class133.field2091.length());
                                } else if (var385.startsWith(class133.field2253)) {
                                    var386 = 3;
                                    var379 = var379.substring(class133.field2253.length());
                                } else if (var385.startsWith(class133.field2255)) {
                                    var386 = 4;
                                    var379 = var379.substring(class133.field2255.length());
                                } else if (var385.startsWith(class133.field2257)) {
                                    var386 = 5;
                                    var379 = var379.substring(class133.field2257.length());
                                } else if (client.field499 != 0) {
                                    if (var385.startsWith(class133.field2250)) {
                                        var386 = 1;
                                        var379 = var379.substring(class133.field2250.length());
                                    } else if (var385.startsWith(class133.field2268)) {
                                        var386 = 2;
                                        var379 = var379.substring(class133.field2268.length());
                                    } else if (var385.startsWith(class133.field2179)) {
                                        var386 = 3;
                                        var379 = var379.substring(class133.field2179.length());
                                    } else if (var385.startsWith(class133.field2256)) {
                                        var386 = 4;
                                        var379 = var379.substring(class133.field2256.length());
                                    } else if (var385.startsWith(class133.field2258)) {
                                        var386 = 5;
                                        var379 = var379.substring(class133.field2258.length());
                                    }
                                }
                                client.field634.method2358(222);
                                client.field634.method2472(0);
                                int var387 = client.field634.field2016;
                                client.field634.method2472(var384);
                                client.field634.method2472(var386);
                                class115 var388 = client.field634;
                                int var389 = var388.field2016;
                                byte[] var390 = class148.method2347(var379);
                                var388.method2483(var390.length);
                                var388.field2016 += Statics.field2776.method2417(var390, 0, var390.length, var388.field2013, var388.field2016);
                                client.field634.method2491(client.field634.field2016 - var387);
                                continue;
                            }
                            if (client.field636 >= 2) {
                                if (var379.equalsIgnoreCase("::gc")) {
                                    System.gc();
                                }
                                if (var379.equalsIgnoreCase("::clientdrop")) {
                                    client.method96();
                                }
                                if (var379.equalsIgnoreCase("::fpson")) {
                                    client.field482 = true;
                                }
                                if (var379.equalsIgnoreCase("::fpsoff")) {
                                    client.field482 = false;
                                }
                                if (var379.equalsIgnoreCase("::noclip")) {
                                    for (int var380 = 0; var380 < 4; var380++) {
                                        for (int var381 = 1; var381 < 103; var381++) {
                                            for (int var382 = 1; var382 < 103; var382++) {
                                                client.field526[var380].field2686[var381][var382] = 0;
                                            }
                                        }
                                    }
                                }
                                if (var379.equalsIgnoreCase("::errortest") && client.field467 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field634.method2358(52);
                            client.field634.method2472(var379.length() - 1);
                            client.field634.method2477(var379.substring(2));
                            continue;
                        }
                        if (var406 == 5009) {
                            var5 -= 2;
                            String var391 = field393[var5];
                            String var392 = field393[var5 + 1];
                            client.field634.method2358(233);
                            client.field634.method2473(0);
                            int var393 = client.field634.field2016;
                            client.field634.method2477(var391);
                            class115 var394 = client.field634;
                            int var395 = var394.field2016;
                            byte[] var396 = class148.method2347(var392);
                            var394.method2483(var396.length);
                            var394.field2016 += Statics.field2776.method2417(var396, 0, var396.length, var394.field2013, var394.field2016);
                            client.field634.method2481(client.field634.field2016 - var393);
                            continue;
                        }
                        if (var406 == 5010) {
                            var4--;
                            int var397 = field387[var4];
                            String var398 = null;
                            if (var397 < 100) {
                                var398 = client.field525[var397];
                            }
                            if (var398 == null) {
                                var398 = "";
                            }
                            field393[var5++] = var398;
                            continue;
                        }
                        if (var406 == 5011) {
                            var4--;
                            int var399 = field387[var4];
                            String var400 = null;
                            if (var399 < 100) {
                                var400 = client.field570[var399];
                            }
                            if (var400 == null) {
                                var400 = "";
                            }
                            field393[var5++] = var400;
                            continue;
                        }
                        if (var406 == 5015) {
                            String var401;
                            if (Statics.field2611 == null || Statics.field2611.field36 == null) {
                                var401 = "";
                            } else {
                                var401 = Statics.field2611.field36;
                            }
                            field393[var5++] = var401;
                            continue;
                        }
                        if (var406 == 5016) {
                            field387[var4++] = client.field687;
                            continue;
                        }
                        if (var406 == 5017) {
                            field387[var4++] = client.field561;
                            continue;
                        }
                    }
                } else {
                    class156 var63;
                    if (var406 >= 2000) {
                        var406 -= 1000;
                        var4--;
                        var63 = class156.method2382(field387[var4]);
                    } else {
                        var63 = var40 ? Statics.field399 : Statics.field391;
                    }
                    if (var406 == 1300) {
                        var4--;
                        int var64 = field387[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3159(var64, field393[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var406 == 1301) {
                        var4 -= 2;
                        int var65 = field387[var4];
                        int var66 = field387[var4 + 1];
                        var63.field2623 = class156.method1866(var65, var66);
                        continue;
                    }
                    if (var406 == 1302) {
                        var4--;
                        var63.field2596 = field387[var4] == 1;
                        continue;
                    }
                    if (var406 == 1303) {
                        var4--;
                        var63.field2594 = field387[var4];
                        continue;
                    }
                    if (var406 == 1304) {
                        var4--;
                        var63.field2595 = field387[var4];
                        continue;
                    }
                    if (var406 == 1305) {
                        var5--;
                        var63.field2591 = field393[var5];
                        continue;
                    }
                    if (var406 == 1306) {
                        var5--;
                        var63.field2593 = field393[var5];
                        continue;
                    }
                    if (var406 == 1307) {
                        var63.field2592 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var405) {
            StringBuilder var403 = new StringBuilder(30);
            var403.append("").append(var3.field2760).append(" ");
            for (int var404 = field389 - 1; var404 >= 0; var404--) {
                var403.append("").append(field385[var404].field251.field2760).append(" ");
            }
            var403.append("").append(var9);
            class79.method126(var403.toString(), var405);
        }
    }

    @ObfuscatedName("af.e(II)V")
    public static void method682(int arg0) {
        if (arg0 == -1 || !class156.method2342(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2536[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3.field2554 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field16 = var3.field2554;
                method1222(var4);
            }
        }
    }
}
