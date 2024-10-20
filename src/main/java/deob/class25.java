package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("f")
public class class25 {

    @ObfuscatedName("f.z")
    public static int[] field385 = new int[5];

    @ObfuscatedName("f.c")
    public static int[][] field390 = new int[5][5000];

    @ObfuscatedName("f.e")
    public static int[] field389 = new int[1000];

    @ObfuscatedName("f.s")
    public static String[] field386 = new String[1000];

    @ObfuscatedName("f.i")
    public static int field387 = 0;

    @ObfuscatedName("f.g")
    public static class17[] field388 = new class17[50];

    @ObfuscatedName("f.k")
    public static Calendar field383 = Calendar.getInstance();

    @ObfuscatedName("f.v")
    public static final String[] field392 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cv.j(Lj;I)V")
    public static void method1580(class1 arg0) {
        Object[] var1 = arg0.field1;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method54(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field69;
        int[] var8 = var3.field75;
        byte var9 = -1;
        field387 = 0;
        try {
            Statics.field381 = new int[var3.field73];
            int var10 = 0;
            Statics.field382 = new String[var3.field74];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field13;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2528;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2629;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field12 == null ? -1 : arg0.field12.field2528;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field12 == null ? -1 : arg0.field12.field2629;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field3;
                    }
                    Statics.field381[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field382[var11++] = var14;
                }
            }
            int var15 = 0;
            label2399: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var364 = var7[var6];
                if (var364 < 100) {
                    if (var364 == 0) {
                        field389[var4++] = var8[var6];
                        continue;
                    }
                    if (var364 == 1) {
                        int var16 = var8[var6];
                        field389[var4++] = class157.field2647[var16];
                        continue;
                    }
                    if (var364 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class157.field2647[var17] = field389[var4];
                        continue;
                    }
                    if (var364 == 3) {
                        field386[var5++] = var3.field72[var6];
                        continue;
                    }
                    if (var364 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var364 == 7) {
                        var4 -= 2;
                        if (field389[var4 + 1] != field389[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 8) {
                        var4 -= 2;
                        if (field389[var4 + 1] == field389[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 9) {
                        var4 -= 2;
                        if (field389[var4] < field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 10) {
                        var4 -= 2;
                        if (field389[var4] > field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 21) {
                        if (field387 == 0) {
                            return;
                        }
                        class17 var18 = field388[--field387];
                        var3 = var18.field256;
                        var7 = var3.field69;
                        var8 = var3.field75;
                        var6 = var18.field258;
                        Statics.field381 = var18.field253;
                        Statics.field382 = var18.field259;
                        continue;
                    }
                    if (var364 == 25) {
                        int var19 = var8[var6];
                        field389[var4++] = class157.method1999(var19);
                        continue;
                    }
                    if (var364 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        class157.method1205(var20, field389[var4]);
                        continue;
                    }
                    if (var364 == 31) {
                        var4 -= 2;
                        if (field389[var4] <= field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 32) {
                        var4 -= 2;
                        if (field389[var4] >= field389[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var364 == 33) {
                        field389[var4++] = Statics.field381[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var364 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field381[var10001] = field389[var4];
                        continue;
                    }
                    if (var364 == 35) {
                        field386[var5++] = Statics.field382[var8[var6]];
                        continue;
                    }
                    if (var364 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field382[var10001] = field386[var5];
                        continue;
                    }
                    if (var364 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String var22 = class146.method767(field386, var5, var21);
                        field386[var5++] = var22;
                        continue;
                    }
                    if (var364 == 38) {
                        var4--;
                        continue;
                    }
                    if (var364 == 39) {
                        var5--;
                        continue;
                    }
                    if (var364 == 40) {
                        int var23 = var8[var6];
                        class5 var24 = class5.method54(var23);
                        int[] var25 = new int[var24.field73];
                        String[] var26 = new String[var24.field74];
                        for (int var27 = 0; var27 < var24.field77; var27++) {
                            var25[var27] = field389[var4 - var24.field77 + var27];
                        }
                        for (int var28 = 0; var28 < var24.field76; var28++) {
                            var26[var28] = field386[var5 - var24.field76 + var28];
                        }
                        var4 -= var24.field77;
                        var5 -= var24.field76;
                        class17 var29 = new class17();
                        var29.field256 = var3;
                        var29.field258 = var6;
                        var29.field253 = Statics.field381;
                        var29.field259 = Statics.field382;
                        field388[++field387 - 1] = var29;
                        var3 = var24;
                        var7 = var24.field69;
                        var8 = var24.field75;
                        var6 = -1;
                        Statics.field381 = var25;
                        Statics.field382 = var26;
                        continue;
                    }
                    if (var364 == 42) {
                        field389[var4++] = client.field651[var8[var6]];
                        continue;
                    }
                    if (var364 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field651[var10001] = field389[var4];
                        continue;
                    }
                    if (var364 == 44) {
                        int var30 = var8[var6] >> 16;
                        int var31 = var8[var6] & 0xFFFF;
                        var4--;
                        int var32 = field389[var4];
                        if (var32 >= 0 && var32 <= 5000) {
                            field385[var30] = var32;
                            byte var33 = -1;
                            if (var31 == 105) {
                                var33 = 0;
                            }
                            int var34 = 0;
                            while (true) {
                                if (var34 >= var32) {
                                    continue label2399;
                                }
                                field390[var30][var34] = var33;
                                var34++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var364 == 45) {
                        int var35 = var8[var6];
                        var4--;
                        int var36 = field389[var4];
                        if (var36 >= 0 && var36 < field385[var35]) {
                            field389[var4++] = field390[var35][var36];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var364 == 46) {
                        int var37 = var8[var6];
                        var4 -= 2;
                        int var38 = field389[var4];
                        if (var38 >= 0 && var38 < field385[var37]) {
                            field390[var37][var38] = field389[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var364 == 47) {
                        String var39 = client.field575[var8[var6]];
                        if (var39 == null) {
                            var39 = "null";
                        }
                        field386[var5++] = var39;
                        continue;
                    }
                    if (var364 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field575[var10001] = field386[var5];
                        continue;
                    }
                }
                boolean var40;
                if (var8[var6] == 1) {
                    var40 = true;
                } else {
                    var40 = false;
                }
                if (var364 < 1000) {
                    if (var364 == 100) {
                        var4 -= 3;
                        int var41 = field389[var4];
                        int var42 = field389[var4 + 1];
                        int var43 = field389[var4 + 2];
                        if (var42 == 0) {
                            throw new RuntimeException();
                        }
                        class156 var44 = class156.method822(var41);
                        if (var44.field2644 == null) {
                            var44.field2644 = new class156[var43 + 1];
                        }
                        if (var44.field2644.length <= var43) {
                            class156[] var45 = new class156[var43 + 1];
                            for (int var46 = 0; var46 < var44.field2644.length; var46++) {
                                var45[var46] = var44.field2644[var46];
                            }
                            var44.field2644 = var45;
                        }
                        if (var43 > 0 && var44.field2644[var43 - 1] == null) {
                            throw new RuntimeException("" + (var43 - 1));
                        }
                        class156 var47 = new class156();
                        var47.field2530 = var42;
                        var47.field2641 = var47.field2528 = var44.field2528;
                        var47.field2629 = var43;
                        var47.field2595 = true;
                        var44.field2644[var43] = var47;
                        if (var40) {
                            Statics.field372 = var47;
                        } else {
                            Statics.field1239 = var47;
                        }
                        client.method1345(var44);
                        continue;
                    }
                    if (var364 == 101) {
                        class156 var48 = var40 ? Statics.field372 : Statics.field1239;
                        class156 var49 = class156.method822(var48.field2528);
                        var49.field2644[var48.field2629] = null;
                        client.method1345(var49);
                        continue;
                    }
                    if (var364 == 102) {
                        var4--;
                        class156 var50 = class156.method822(field389[var4]);
                        var50.field2644 = null;
                        client.method1345(var50);
                        continue;
                    }
                    if (var364 == 200) {
                        var4 -= 2;
                        int var51 = field389[var4];
                        int var52 = field389[var4 + 1];
                        class156 var53 = class156.method2787(var51, var52);
                        if (var53 != null && var52 != -1) {
                            field389[var4++] = 1;
                            if (var40) {
                                Statics.field372 = var53;
                            } else {
                                Statics.field1239 = var53;
                            }
                            continue;
                        }
                        field389[var4++] = 0;
                        continue;
                    }
                } else if (var364 >= 1000 && var364 < 1100 || var364 >= 2000 && var364 < 2100) {
                    class156 var54;
                    if (var364 >= 2000) {
                        var364 -= 1000;
                        var4--;
                        var54 = class156.method822(field389[var4]);
                    } else {
                        var54 = var40 ? Statics.field372 : Statics.field1239;
                    }
                    if (var364 == 1000) {
                        var4 -= 2;
                        var54.field2540 = field389[var4];
                        var54.field2534 = field389[var4 + 1];
                        client.method1345(var54);
                        continue;
                    }
                    if (var364 == 1001) {
                        var4 -= 2;
                        var54.field2555 = field389[var4];
                        var54.field2538 = field389[var4 + 1];
                        client.method1345(var54);
                        continue;
                    }
                    if (var364 == 1003) {
                        var4--;
                        boolean var55 = field389[var4] == 1;
                        if (var54.field2620 != var55) {
                            var54.field2620 = var55;
                            client.method1345(var54);
                        }
                        continue;
                    }
                } else if (var364 >= 1100 && var364 < 1200 || var364 >= 2100 && var364 < 2200) {
                    class156 var56;
                    if (var364 >= 2000) {
                        var364 -= 1000;
                        var4--;
                        var56 = class156.method822(field389[var4]);
                    } else {
                        var56 = var40 ? Statics.field372 : Statics.field1239;
                    }
                    if (var364 == 1100) {
                        var4 -= 2;
                        var56.field2541 = field389[var4];
                        if (var56.field2541 > var56.field2543 - var56.field2555) {
                            var56.field2541 = var56.field2543 - var56.field2555;
                        }
                        if (var56.field2541 < 0) {
                            var56.field2541 = 0;
                        }
                        var56.field2542 = field389[var4 + 1];
                        if (var56.field2542 > var56.field2624 - var56.field2538) {
                            var56.field2542 = var56.field2624 - var56.field2538;
                        }
                        if (var56.field2542 < 0) {
                            var56.field2542 = 0;
                        }
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1101) {
                        var4--;
                        var56.field2545 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1102) {
                        var4--;
                        var56.field2549 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1103) {
                        var4--;
                        var56.field2550 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1104) {
                        var4--;
                        var56.field2551 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1105) {
                        var4--;
                        var56.field2552 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1106) {
                        var4--;
                        var56.field2554 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1107) {
                        var4--;
                        var56.field2588 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1108) {
                        var56.field2560 = 1;
                        var4--;
                        var56.field2561 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1109) {
                        var4 -= 6;
                        var56.field2566 = field389[var4];
                        var56.field2567 = field389[var4 + 1];
                        var56.field2638 = field389[var4 + 2];
                        var56.field2569 = field389[var4 + 3];
                        var56.field2570 = field389[var4 + 4];
                        var56.field2529 = field389[var4 + 5];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1110) {
                        var4--;
                        int var57 = field389[var4];
                        if (var56.field2564 != var57) {
                            var56.field2564 = var57;
                            var56.field2634 = 0;
                            var56.field2635 = 0;
                            client.method1345(var56);
                        }
                        continue;
                    }
                    if (var364 == 1111) {
                        var4--;
                        var56.field2573 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1112) {
                        var5--;
                        String var58 = field386[var5];
                        if (!var58.equals(var56.field2575)) {
                            var56.field2575 = var58;
                            client.method1345(var56);
                        }
                        continue;
                    }
                    if (var364 == 1113) {
                        var4--;
                        var56.field2612 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1114) {
                        var4 -= 3;
                        var56.field2616 = field389[var4];
                        var56.field2579 = field389[var4 + 1];
                        var56.field2577 = field389[var4 + 2];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1115) {
                        var4--;
                        var56.field2547 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1116) {
                        var4--;
                        var56.field2589 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1117) {
                        var4--;
                        var56.field2615 = field389[var4];
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1118) {
                        var4--;
                        var56.field2558 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1119) {
                        var4--;
                        var56.field2531 = field389[var4] == 1;
                        client.method1345(var56);
                        continue;
                    }
                    if (var364 == 1120) {
                        var4 -= 2;
                        var56.field2543 = field389[var4];
                        var56.field2624 = field389[var4 + 1];
                        client.method1345(var56);
                        continue;
                    }
                } else if (var364 >= 1200 && var364 < 1300 || var364 >= 2200 && var364 < 2300) {
                    class156 var59;
                    if (var364 >= 2000) {
                        var364 -= 1000;
                        var4--;
                        var59 = class156.method822(field389[var4]);
                    } else {
                        var59 = var40 ? Statics.field372 : Statics.field1239;
                    }
                    client.method1345(var59);
                    if (var364 == 1200) {
                        var4 -= 2;
                        int var60 = field389[var4];
                        int var61 = field389[var4 + 1];
                        var59.field2523 = var60;
                        var59.field2633 = var61;
                        class39 var62 = class39.method1818(var60);
                        var59.field2638 = var62.field986;
                        var59.field2569 = var62.field995;
                        var59.field2570 = var62.field970;
                        var59.field2566 = var62.field971;
                        var59.field2567 = var62.field972;
                        var59.field2529 = var62.field967;
                        if (var59.field2555 > 0) {
                            var59.field2529 = var59.field2529 * 32 / var59.field2555;
                        }
                        continue;
                    }
                    if (var364 == 1201) {
                        var59.field2560 = 2;
                        var4--;
                        var59.field2561 = field389[var4];
                        continue;
                    }
                    if (var364 == 1202) {
                        var59.field2560 = 3;
                        var59.field2561 = Statics.field244.field55.method3115();
                        continue;
                    }
                } else if ((var364 < 1300 || var364 >= 1400) && (var364 < 2300 || var364 >= 2400)) {
                    if (var364 >= 1400 && var364 < 1500 || var364 >= 2400 && var364 < 2500) {
                        class156 var67;
                        if (var364 >= 2000) {
                            var364 -= 1000;
                            var4--;
                            var67 = class156.method822(field389[var4]);
                        } else {
                            var67 = var40 ? Statics.field372 : Statics.field1239;
                        }
                        var5--;
                        String var68 = field386[var5];
                        int[] var69 = null;
                        if (var68.length() > 0 && var68.charAt(var68.length() - 1) == 'Y') {
                            var4--;
                            int var70 = field389[var4];
                            if (var70 > 0) {
                                var69 = new int[var70];
                                while (var70-- > 0) {
                                    var4--;
                                    var69[var70] = field389[var4];
                                }
                            }
                            var68 = var68.substring(0, var68.length() - 1);
                        }
                        Object[] var71 = new Object[var68.length() + 1];
                        for (int var72 = var71.length - 1; var72 >= 1; var72--) {
                            if (var68.charAt(var72 - 1) == 's') {
                                var5--;
                                var71[var72] = field386[var5];
                            } else {
                                var4--;
                                var71[var72] = Integer.valueOf(field389[var4]);
                            }
                        }
                        var4--;
                        int var73 = field389[var4];
                        if (var73 == -1) {
                            var71 = null;
                        } else {
                            var71[0] = Integer.valueOf(var73);
                        }
                        if (var364 == 1400) {
                            var67.field2597 = var71;
                        }
                        if (var364 == 1401) {
                            var67.field2600 = var71;
                        }
                        if (var364 == 1402) {
                            var67.field2599 = var71;
                        }
                        if (var364 == 1403) {
                            var67.field2571 = var71;
                        }
                        if (var364 == 1404) {
                            var67.field2603 = var71;
                        }
                        if (var364 == 1405) {
                            var67.field2574 = var71;
                        }
                        if (var364 == 1406) {
                            var67.field2607 = var71;
                        }
                        if (var364 == 1407) {
                            var67.field2608 = var71;
                            var67.field2609 = var69;
                        }
                        if (var364 == 1408) {
                            var67.field2614 = var71;
                        }
                        if (var364 == 1409) {
                            var67.field2604 = var71;
                        }
                        if (var364 == 1410) {
                            var67.field2605 = var71;
                        }
                        if (var364 == 1411) {
                            var67.field2598 = var71;
                        }
                        if (var364 == 1412) {
                            var67.field2576 = var71;
                        }
                        if (var364 == 1414) {
                            var67.field2610 = var71;
                            var67.field2611 = var69;
                        }
                        if (var364 == 1415) {
                            var67.field2557 = var71;
                            var67.field2613 = var69;
                        }
                        if (var364 == 1416) {
                            var67.field2606 = var71;
                        }
                        if (var364 == 1417) {
                            var67.field2591 = var71;
                        }
                        if (var364 == 1418) {
                            var67.field2617 = var71;
                        }
                        if (var364 == 1419) {
                            var67.field2539 = var71;
                        }
                        if (var364 == 1420) {
                            var67.field2619 = var71;
                        }
                        if (var364 == 1421) {
                            var67.field2580 = var71;
                        }
                        if (var364 == 1422) {
                            var67.field2621 = var71;
                        }
                        if (var364 == 1423) {
                            var67.field2622 = var71;
                        }
                        if (var364 == 1424) {
                            var67.field2544 = var71;
                        }
                        var67.field2632 = true;
                        continue;
                    }
                    if (var364 < 1600) {
                        class156 var74 = var40 ? Statics.field372 : Statics.field1239;
                        if (var364 == 1500) {
                            field389[var4++] = var74.field2540;
                            continue;
                        }
                        if (var364 == 1501) {
                            field389[var4++] = var74.field2534;
                            continue;
                        }
                        if (var364 == 1502) {
                            field389[var4++] = var74.field2555;
                            continue;
                        }
                        if (var364 == 1503) {
                            field389[var4++] = var74.field2538;
                            continue;
                        }
                        if (var364 == 1504) {
                            field389[var4++] = var74.field2620 ? 1 : 0;
                            continue;
                        }
                        if (var364 == 1505) {
                            field389[var4++] = var74.field2641;
                            continue;
                        }
                    } else if (var364 < 1700) {
                        class156 var75 = var40 ? Statics.field372 : Statics.field1239;
                        if (var364 == 1600) {
                            field389[var4++] = var75.field2541;
                            continue;
                        }
                        if (var364 == 1601) {
                            field389[var4++] = var75.field2542;
                            continue;
                        }
                        if (var364 == 1602) {
                            field386[var5++] = var75.field2575;
                            continue;
                        }
                        if (var364 == 1603) {
                            field389[var4++] = var75.field2543;
                            continue;
                        }
                        if (var364 == 1604) {
                            field389[var4++] = var75.field2624;
                            continue;
                        }
                        if (var364 == 1605) {
                            field389[var4++] = var75.field2529;
                            continue;
                        }
                        if (var364 == 1606) {
                            field389[var4++] = var75.field2638;
                            continue;
                        }
                        if (var364 == 1607) {
                            field389[var4++] = var75.field2570;
                            continue;
                        }
                        if (var364 == 1608) {
                            field389[var4++] = var75.field2569;
                            continue;
                        }
                    } else if (var364 < 1800) {
                        class156 var76 = var40 ? Statics.field372 : Statics.field1239;
                        if (var364 == 1700) {
                            field389[var4++] = var76.field2523;
                            continue;
                        }
                        if (var364 == 1701) {
                            if (var76.field2523 == -1) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var76.field2633;
                            }
                            continue;
                        }
                        if (var364 == 1702) {
                            field389[var4++] = var76.field2629;
                            continue;
                        }
                    } else if (var364 < 1900) {
                        class156 var77 = var40 ? Statics.field372 : Statics.field1239;
                        if (var364 == 1800) {
                            int[] var78 = field389;
                            int var79 = var4++;
                            int var80 = client.method210(var77);
                            int var81 = var80 >> 11 & 0x3F;
                            var78[var79] = var81;
                            continue;
                        }
                        if (var364 == 1801) {
                            var4--;
                            int var82 = field389[var4];
                            int var365 = var82 - 1;
                            if (var77.field2602 != null && var365 < var77.field2602.length && var77.field2602[var365] != null) {
                                field386[var5++] = var77.field2602[var365];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 1802) {
                            if (var77.field2533 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = var77.field2533;
                            }
                            continue;
                        }
                    } else if (var364 < 2600) {
                        var4--;
                        class156 var83 = class156.method822(field389[var4]);
                        if (var364 == 2500) {
                            field389[var4++] = var83.field2540;
                            continue;
                        }
                        if (var364 == 2501) {
                            field389[var4++] = var83.field2534;
                            continue;
                        }
                        if (var364 == 2502) {
                            field389[var4++] = var83.field2555;
                            continue;
                        }
                        if (var364 == 2503) {
                            field389[var4++] = var83.field2538;
                            continue;
                        }
                        if (var364 == 2504) {
                            field389[var4++] = var83.field2620 ? 1 : 0;
                            continue;
                        }
                        if (var364 == 2505) {
                            field389[var4++] = var83.field2641;
                            continue;
                        }
                    } else if (var364 < 2700) {
                        var4--;
                        class156 var84 = class156.method822(field389[var4]);
                        if (var364 == 2600) {
                            field389[var4++] = var84.field2541;
                            continue;
                        }
                        if (var364 == 2601) {
                            field389[var4++] = var84.field2542;
                            continue;
                        }
                        if (var364 == 2602) {
                            field386[var5++] = var84.field2575;
                            continue;
                        }
                        if (var364 == 2603) {
                            field389[var4++] = var84.field2543;
                            continue;
                        }
                        if (var364 == 2604) {
                            field389[var4++] = var84.field2624;
                            continue;
                        }
                        if (var364 == 2605) {
                            field389[var4++] = var84.field2529;
                            continue;
                        }
                        if (var364 == 2606) {
                            field389[var4++] = var84.field2638;
                            continue;
                        }
                        if (var364 == 2607) {
                            field389[var4++] = var84.field2570;
                            continue;
                        }
                        if (var364 == 2608) {
                            field389[var4++] = var84.field2569;
                            continue;
                        }
                    } else if (var364 < 2800) {
                        if (var364 == 2700) {
                            var4--;
                            class156 var85 = class156.method822(field389[var4]);
                            field389[var4++] = var85.field2523;
                            continue;
                        }
                        if (var364 == 2701) {
                            var4--;
                            class156 var86 = class156.method822(field389[var4]);
                            if (var86.field2523 == -1) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var86.field2633;
                            }
                            continue;
                        }
                        if (var364 == 2702) {
                            var4--;
                            int var87 = field389[var4];
                            class4 var88 = (class4) client.field618.method3222((long) var87);
                            if (var88 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var364 < 2900) {
                        var4--;
                        class156 var89 = class156.method822(field389[var4]);
                        if (var364 == 2800) {
                            int[] var90 = field389;
                            int var91 = var4++;
                            int var92 = client.method210(var89);
                            int var93 = var92 >> 11 & 0x3F;
                            var90[var91] = var93;
                            continue;
                        }
                        if (var364 == 2801) {
                            var4--;
                            int var94 = field389[var4];
                            int var366 = var94 - 1;
                            if (var89.field2602 != null && var366 < var89.field2602.length && var89.field2602[var366] != null) {
                                field386[var5++] = var89.field2602[var366];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 2802) {
                            if (var89.field2533 == null) {
                                field386[var5++] = "";
                            } else {
                                field386[var5++] = var89.field2533;
                            }
                            continue;
                        }
                    } else if (var364 < 3200) {
                        if (var364 == 3100) {
                            var5--;
                            String var95 = field386[var5];
                            client.method8(0, "", var95);
                            continue;
                        }
                        if (var364 == 3101) {
                            var4 -= 2;
                            client.method2244(Statics.field244, field389[var4], field389[var4 + 1]);
                            continue;
                        }
                        if (var364 == 3103) {
                            client.method108();
                            continue;
                        }
                        if (var364 == 3104) {
                            var5--;
                            String var96 = field386[var5];
                            int var97 = 0;
                            boolean var98 = false;
                            boolean var99 = false;
                            int var100 = 0;
                            int var101 = var96.length();
                            int var102 = 0;
                            boolean var104;
                            while (true) {
                                if (var102 >= var101) {
                                    var104 = var99;
                                    break;
                                }
                                label2612: {
                                    char var103 = var96.charAt(var102);
                                    if (var102 == 0) {
                                        if (var103 == '-') {
                                            var98 = true;
                                            break label2612;
                                        }
                                        if (var103 == '+') {
                                            break label2612;
                                        }
                                    }
                                    int var367;
                                    if (var103 >= '0' && var103 <= '9') {
                                        var367 = var103 - '0';
                                    } else if (var103 >= 'A' && var103 <= 'Z') {
                                        var367 = var103 - '7';
                                    } else {
                                        if (var103 < 'a' || var103 > 'z') {
                                            var104 = false;
                                            break;
                                        }
                                        var367 = var103 - 'W';
                                    }
                                    if (var367 >= 10) {
                                        var104 = false;
                                        break;
                                    }
                                    if (var98) {
                                        var367 = -var367;
                                    }
                                    int var105 = var100 * 10 + var367;
                                    if (var105 / 10 != var100) {
                                        var104 = false;
                                        break;
                                    }
                                    var100 = var105;
                                    var99 = true;
                                }
                                var102++;
                            }
                            if (var104) {
                                var97 = class146.method565(var96);
                            }
                            client.field631.method2273(146);
                            client.field631.method2372(var97);
                            continue;
                        }
                        if (var364 == 3105) {
                            var5--;
                            String var107 = field386[var5];
                            client.field631.method2273(70);
                            client.field631.method2369(var107.length() + 1);
                            client.field631.method2374(var107);
                            continue;
                        }
                        if (var364 == 3106) {
                            var5--;
                            String var108 = field386[var5];
                            client.field631.method2273(74);
                            client.field631.method2369(var108.length() + 1);
                            client.field631.method2374(var108);
                            continue;
                        }
                        if (var364 == 3107) {
                            var4--;
                            int var109 = field389[var4];
                            var5--;
                            String var110 = field386[var5];
                            client.method2076(var109, var110);
                            continue;
                        }
                        if (var364 == 3108) {
                            var4 -= 3;
                            int var111 = field389[var4];
                            int var112 = field389[var4 + 1];
                            int var113 = field389[var4 + 2];
                            class156 var114 = class156.method822(var113);
                            client.method1343(var114, var111, var112);
                            continue;
                        }
                        if (var364 == 3109) {
                            var4 -= 2;
                            int var115 = field389[var4];
                            int var116 = field389[var4 + 1];
                            class156 var117 = var40 ? Statics.field372 : Statics.field1239;
                            client.method1343(var117, var115, var116);
                            continue;
                        }
                    } else if (var364 < 3300) {
                        if (var364 == 3200) {
                            var4 -= 3;
                            int var118 = field389[var4];
                            int var119 = field389[var4 + 1];
                            int var120 = field389[var4 + 2];
                            if (client.field695 != 0 && var119 != 0 && client.field619 < 50) {
                                client.field697[client.field619] = var118;
                                client.field698[client.field619] = var119;
                                client.field699[client.field619] = var120;
                                client.field701[client.field619] = null;
                                client.field628[client.field619] = 0;
                                client.field619++;
                            }
                            continue;
                        }
                        if (var364 == 3201) {
                            var4--;
                            client.method226(field389[var4]);
                            continue;
                        }
                        if (var364 == 3202) {
                            var4 -= 2;
                            client.method659(field389[var4], field389[var4 + 1]);
                            continue;
                        }
                    } else if (var364 < 3400) {
                        if (var364 == 3300) {
                            field389[var4++] = client.field636;
                            continue;
                        }
                        if (var364 == 3301) {
                            var4 -= 2;
                            int var121 = field389[var4];
                            int var122 = field389[var4 + 1];
                            field389[var4++] = class18.method603(var121, var122);
                            continue;
                        }
                        if (var364 == 3302) {
                            var4 -= 2;
                            int var123 = field389[var4];
                            int var124 = field389[var4 + 1];
                            int[] var125 = field389;
                            int var126 = var4++;
                            class18 var127 = (class18) class18.field263.method3222((long) var123);
                            int var128;
                            if (var127 == null) {
                                var128 = 0;
                            } else if (var124 >= 0 && var124 < var127.field268.length) {
                                var128 = var127.field268[var124];
                            } else {
                                var128 = 0;
                            }
                            var125[var126] = var128;
                            continue;
                        }
                        if (var364 == 3303) {
                            var4 -= 2;
                            int var129 = field389[var4];
                            int var130 = field389[var4 + 1];
                            field389[var4++] = class18.method681(var129, var130);
                            continue;
                        }
                        if (var364 == 3304) {
                            var4--;
                            int var131 = field389[var4];
                            field389[var4++] = class40.method1998(var131).field1005;
                            continue;
                        }
                        if (var364 == 3305) {
                            var4--;
                            int var132 = field389[var4];
                            field389[var4++] = client.field595[var132];
                            continue;
                        }
                        if (var364 == 3306) {
                            var4--;
                            int var133 = field389[var4];
                            field389[var4++] = client.field596[var133];
                            continue;
                        }
                        if (var364 == 3307) {
                            var4--;
                            int var134 = field389[var4];
                            field389[var4++] = client.field715[var134];
                            continue;
                        }
                        if (var364 == 3308) {
                            int var135 = Statics.field582;
                            int var136 = (Statics.field244.field396 >> 7) + Statics.field953;
                            int var137 = (Statics.field244.field394 >> 7) + Statics.field450;
                            field389[var4++] = (var135 << 28) + (var136 << 14) + var137;
                            continue;
                        }
                        if (var364 == 3309) {
                            var4--;
                            int var138 = field389[var4];
                            field389[var4++] = var138 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var364 == 3310) {
                            var4--;
                            int var139 = field389[var4];
                            field389[var4++] = var139 >> 28;
                            continue;
                        }
                        if (var364 == 3311) {
                            var4--;
                            int var140 = field389[var4];
                            field389[var4++] = var140 & 0x3FFF;
                            continue;
                        }
                        if (var364 == 3312) {
                            field389[var4++] = client.field624 ? 1 : 0;
                            continue;
                        }
                        if (var364 == 3313) {
                            var4 -= 2;
                            int var141 = field389[var4] + 32768;
                            int var142 = field389[var4 + 1];
                            field389[var4++] = class18.method603(var141, var142);
                            continue;
                        }
                        if (var364 == 3314) {
                            var4 -= 2;
                            int var143 = field389[var4] + 32768;
                            int var144 = field389[var4 + 1];
                            int[] var145 = field389;
                            int var146 = var4++;
                            class18 var147 = (class18) class18.field263.method3222((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 >= 0 && var144 < var147.field268.length) {
                                var148 = var147.field268[var144];
                            } else {
                                var148 = 0;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var364 == 3315) {
                            var4 -= 2;
                            int var149 = field389[var4] + 32768;
                            int var150 = field389[var4 + 1];
                            field389[var4++] = class18.method681(var149, var150);
                            continue;
                        }
                        if (var364 == 3316) {
                            if (client.field609 >= 2) {
                                field389[var4++] = client.field609;
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                        if (var364 == 3317) {
                            field389[var4++] = client.field533;
                            continue;
                        }
                        if (var364 == 3318) {
                            field389[var4++] = client.field714;
                            continue;
                        }
                        if (var364 == 3321) {
                            field389[var4++] = client.field622;
                            continue;
                        }
                        if (var364 == 3322) {
                            field389[var4++] = client.field623;
                            continue;
                        }
                        if (var364 == 3323) {
                            if (client.field625) {
                                field389[var4++] = 1;
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var364 < 3500) {
                        if (var364 == 3400) {
                            var4 -= 2;
                            int var151 = field389[var4];
                            int var152 = field389[var4 + 1];
                            class38 var153 = class38.method3078(var151);
                            if (var153.field944 != 's') {
                            }
                            for (int var154 = 0; var154 < var153.field947; var154++) {
                                if (var153.field948[var154] == var152) {
                                    field386[var5++] = var153.field950[var154];
                                    var153 = null;
                                    break;
                                }
                            }
                            if (var153 != null) {
                                field386[var5++] = var153.field945;
                            }
                            continue;
                        }
                        if (var364 == 3408) {
                            var4 -= 4;
                            int var155 = field389[var4];
                            int var156 = field389[var4 + 1];
                            int var157 = field389[var4 + 2];
                            int var158 = field389[var4 + 3];
                            class38 var159 = class38.method3078(var157);
                            if (var159.field943 == var155 && var159.field944 == var156) {
                                for (int var160 = 0; var160 < var159.field947; var160++) {
                                    if (var159.field948[var160] == var158) {
                                        if (var156 == 115) {
                                            field386[var5++] = var159.field950[var160];
                                        } else {
                                            field389[var4++] = var159.field949[var160];
                                        }
                                        var159 = null;
                                        break;
                                    }
                                }
                                if (var159 != null) {
                                    if (var156 == 115) {
                                        field386[var5++] = var159.field945;
                                    } else {
                                        field389[var4++] = var159.field946;
                                    }
                                }
                                continue;
                            }
                            if (var156 == 115) {
                                field386[var5++] = "null";
                            } else {
                                field389[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var364 < 3700) {
                        if (var364 == 3600) {
                            if (client.field717 == 0) {
                                field389[var4++] = -2;
                            } else if (client.field717 == 1) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = client.field546;
                            }
                            continue;
                        }
                        if (var364 == 3601) {
                            var4--;
                            int var161 = field389[var4];
                            if (client.field717 == 2 && var161 < client.field546) {
                                field386[var5++] = client.field564[var161].field347;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 3602) {
                            var4--;
                            int var162 = field389[var4];
                            if (client.field717 == 2 && var162 < client.field546) {
                                field389[var4++] = client.field564[var162].field342;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var364 == 3603) {
                            var4--;
                            int var163 = field389[var4];
                            if (client.field717 == 2 && var163 < client.field546) {
                                field389[var4++] = client.field564[var163].field343;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var364 == 3604) {
                            var5--;
                            String var164 = field386[var5];
                            var4--;
                            int var165 = field389[var4];
                            client.method212(var164, var165);
                            continue;
                        }
                        if (var364 == 3605) {
                            var5--;
                            String var166 = field386[var5];
                            if (var166 == null) {
                                continue;
                            }
                            if ((client.field546 < 200 || client.field584 == 1) && client.field546 < 200) {
                                String var167 = class147.method51(var166, Statics.field183);
                                if (var167 == null) {
                                    continue;
                                }
                                for (int var168 = 0; var168 < client.field546; var168++) {
                                    class22 var169 = client.field564[var168];
                                    String var170 = class147.method51(var169.field347, Statics.field183);
                                    if (var170 != null && var170.equals(var167)) {
                                        client.method8(0, "", var166 + class133.field2277);
                                        continue label2399;
                                    }
                                    if (var169.field341 != null) {
                                        String var171 = class147.method51(var169.field341, Statics.field183);
                                        if (var171 != null && var171.equals(var167)) {
                                            client.method8(0, "", var166 + class133.field2277);
                                            continue label2399;
                                        }
                                    }
                                }
                                for (int var172 = 0; var172 < client.field694; var172++) {
                                    class11 var173 = client.field685[var172];
                                    String var174 = class147.method51(var173.field179, Statics.field183);
                                    if (var174 != null && var174.equals(var167)) {
                                        client.method8(0, "", class133.field2106 + var166 + class133.field2060);
                                        continue label2399;
                                    }
                                    if (var173.field178 != null) {
                                        String var175 = class147.method51(var173.field178, Statics.field183);
                                        if (var175 != null && var175.equals(var167)) {
                                            client.method8(0, "", class133.field2106 + var166 + class133.field2060);
                                            continue label2399;
                                        }
                                    }
                                }
                                if (class147.method51(Statics.field244.field37, Statics.field183).equals(var167)) {
                                    client.method8(0, "", class133.field2188);
                                } else {
                                    client.field631.method2273(144);
                                    client.field631.method2369(class126.method871(var166));
                                    client.field631.method2374(var166);
                                }
                                continue;
                            }
                            client.method8(0, "", class133.field2087);
                            continue;
                        }
                        if (var364 == 3606) {
                            var5--;
                            String var176 = field386[var5];
                            if (var176 == null) {
                                continue;
                            }
                            String var177 = class147.method51(var176, Statics.field183);
                            if (var177 == null) {
                                continue;
                            }
                            int var178 = 0;
                            while (true) {
                                if (var178 >= client.field546) {
                                    continue label2399;
                                }
                                class22 var179 = client.field564[var178];
                                String var180 = var179.field347;
                                String var181 = class147.method51(var180, Statics.field183);
                                boolean var182;
                                if (var176 == null || var180 == null) {
                                    var182 = false;
                                } else if (var176.startsWith("#") || var180.startsWith("#")) {
                                    var182 = var176.equals(var180);
                                } else {
                                    var182 = var177.equals(var181);
                                }
                                if (var182) {
                                    client.field546--;
                                    for (int var183 = var178; var183 < client.field546; var183++) {
                                        client.field564[var183] = client.field564[var183 + 1];
                                    }
                                    client.field648 = client.field640;
                                    client.field631.method2273(131);
                                    client.field631.method2369(class126.method871(var176));
                                    client.field631.method2374(var176);
                                    continue label2399;
                                }
                                var178++;
                            }
                        }
                        if (var364 == 3607) {
                            var5--;
                            String var184 = field386[var5];
                            if (var184 == null) {
                                continue;
                            }
                            if (client.field694 >= 100) {
                                client.method8(0, "", class133.field2212);
                                continue;
                            }
                            String var185 = class147.method51(var184, Statics.field183);
                            if (var185 == null) {
                                continue;
                            }
                            for (int var186 = 0; var186 < client.field694; var186++) {
                                class11 var187 = client.field685[var186];
                                String var188 = class147.method51(var187.field179, Statics.field183);
                                if (var188 != null && var188.equals(var185)) {
                                    client.method8(0, "", var184 + class133.field2261);
                                    continue label2399;
                                }
                                if (var187.field178 != null) {
                                    String var189 = class147.method51(var187.field178, Statics.field183);
                                    if (var189 != null && var189.equals(var185)) {
                                        client.method8(0, "", var184 + class133.field2261);
                                        continue label2399;
                                    }
                                }
                            }
                            for (int var190 = 0; var190 < client.field546; var190++) {
                                class22 var191 = client.field564[var190];
                                String var192 = class147.method51(var191.field347, Statics.field183);
                                if (var192 != null && var192.equals(var185)) {
                                    client.method8(0, "", class133.field2224 + var184 + class133.field2225);
                                    continue label2399;
                                }
                                if (var191.field341 != null) {
                                    String var193 = class147.method51(var191.field341, Statics.field183);
                                    if (var193 != null && var193.equals(var185)) {
                                        client.method8(0, "", class133.field2224 + var184 + class133.field2225);
                                        continue label2399;
                                    }
                                }
                            }
                            if (class147.method51(Statics.field244.field37, Statics.field183).equals(var185)) {
                                client.method8(0, "", class133.field2221);
                            } else {
                                client.field631.method2273(103);
                                client.field631.method2369(class126.method871(var184));
                                client.field631.method2374(var184);
                            }
                            continue;
                        }
                        if (var364 == 3608) {
                            var5--;
                            String var194 = field386[var5];
                            client.method1324(var194);
                            continue;
                        }
                        if (var364 == 3609) {
                            var5--;
                            String var195 = field386[var5];
                            if (var195.startsWith(class2.method1341(0)) || var195.startsWith(class2.method1341(1))) {
                                var195 = var195.substring(7);
                            }
                            field389[var4++] = client.method154(var195) ? 1 : 0;
                            continue;
                        }
                        if (var364 == 3611) {
                            if (client.field681 == null) {
                                field386[var5++] = "";
                                continue;
                            }
                            String[] var196 = field386;
                            int var197 = var5++;
                            String var198 = client.field681;
                            long var199 = 0L;
                            int var201 = var198.length();
                            for (int var202 = 0; var202 < var201; var202++) {
                                var199 *= 37L;
                                char var203 = var198.charAt(var202);
                                if (var203 >= 'A' && var203 <= 'Z') {
                                    var199 += (long) (var203 + 1 - 65);
                                } else if (var203 >= 'a' && var203 <= 'z') {
                                    var199 += (long) (var203 + 1 - 97);
                                } else if (var203 >= '0' && var203 <= '9') {
                                    var199 += (long) (var203 + 27 - 48);
                                }
                                if (var199 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var199 % 37L == 0L && var199 != 0L) {
                                var199 /= 37L;
                            }
                            String var206 = class145.method1817(var199);
                            if (var206 == null) {
                                var206 = "";
                            }
                            var196[var197] = var206;
                            continue;
                        }
                        if (var364 == 3612) {
                            if (client.field681 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = Statics.field1228;
                            }
                            continue;
                        }
                        if (var364 == 3613) {
                            var4--;
                            int var208 = field389[var4];
                            if (client.field681 != null && var208 < Statics.field1228) {
                                field386[var5++] = Statics.field1276[var208].field116;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 3614) {
                            var4--;
                            int var209 = field389[var4];
                            if (client.field681 != null && var209 < Statics.field1228) {
                                field389[var4++] = Statics.field1276[var209].field120;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var364 == 3615) {
                            var4--;
                            int var210 = field389[var4];
                            if (client.field681 != null && var210 < Statics.field1228) {
                                field389[var4++] = Statics.field1276[var210].field112;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var364 == 3616) {
                            field389[var4++] = Statics.field1362;
                            continue;
                        }
                        if (var364 == 3617) {
                            var5--;
                            String var211 = field386[var5];
                            if (Statics.field1276 != null) {
                                client.field631.method2273(179);
                                client.field631.method2369(class126.method871(var211));
                                client.field631.method2374(var211);
                            }
                            continue;
                        }
                        if (var364 == 3618) {
                            field389[var4++] = Statics.field1924;
                            continue;
                        }
                        if (var364 == 3619) {
                            var5--;
                            String var212 = field386[var5];
                            if (!var212.equals("")) {
                                client.field631.method2273(21);
                                client.field631.method2369(class126.method871(var212));
                                client.field631.method2374(var212);
                            }
                            continue;
                        }
                        if (var364 == 3620) {
                            client.field631.method2273(21);
                            client.field631.method2369(0);
                            continue;
                        }
                        if (var364 == 3621) {
                            if (client.field717 == 0) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = client.field694;
                            }
                            continue;
                        }
                        if (var364 == 3622) {
                            var4--;
                            int var213 = field389[var4];
                            if (client.field717 != 0 && var213 < client.field694) {
                                field386[var5++] = client.field685[var213].field179;
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 3623) {
                            var5--;
                            String var214 = field386[var5];
                            if (var214.startsWith(class2.method1341(0)) || var214.startsWith(class2.method1341(1))) {
                                var214 = var214.substring(7);
                            }
                            field389[var4++] = client.method25(var214) ? 1 : 0;
                            continue;
                        }
                        if (var364 == 3624) {
                            var4--;
                            int var215 = field389[var4];
                            if (Statics.field1276 != null && var215 < Statics.field1228 && Statics.field1276[var215].field116.equalsIgnoreCase(Statics.field244.field37)) {
                                field389[var4++] = 1;
                                continue;
                            }
                            field389[var4++] = 0;
                            continue;
                        }
                        if (var364 == 3625) {
                            if (client.field707 == null) {
                                field386[var5++] = "";
                                continue;
                            }
                            String[] var216 = field386;
                            int var217 = var5++;
                            String var218 = client.field707;
                            long var219 = 0L;
                            int var221 = var218.length();
                            for (int var222 = 0; var222 < var221; var222++) {
                                var219 *= 37L;
                                char var223 = var218.charAt(var222);
                                if (var223 >= 'A' && var223 <= 'Z') {
                                    var219 += (long) (var223 + 1 - 65);
                                } else if (var223 >= 'a' && var223 <= 'z') {
                                    var219 += (long) (var223 + 1 - 97);
                                } else if (var223 >= '0' && var223 <= '9') {
                                    var219 += (long) (var223 + 27 - 48);
                                }
                                if (var219 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var219 % 37L == 0L && var219 != 0L) {
                                var219 /= 37L;
                            }
                            String var226 = class145.method1817(var219);
                            if (var226 == null) {
                                var226 = "";
                            }
                            var216[var217] = var226;
                            continue;
                        }
                    } else if (var364 < 4100) {
                        if (var364 == 4000) {
                            var4 -= 2;
                            int var228 = field389[var4];
                            int var229 = field389[var4 + 1];
                            field389[var4++] = var228 + var229;
                            continue;
                        }
                        if (var364 == 4001) {
                            var4 -= 2;
                            int var230 = field389[var4];
                            int var231 = field389[var4 + 1];
                            field389[var4++] = var230 - var231;
                            continue;
                        }
                        if (var364 == 4002) {
                            var4 -= 2;
                            int var232 = field389[var4];
                            int var233 = field389[var4 + 1];
                            field389[var4++] = var232 * var233;
                            continue;
                        }
                        if (var364 == 4003) {
                            var4 -= 2;
                            int var234 = field389[var4];
                            int var235 = field389[var4 + 1];
                            field389[var4++] = var234 / var235;
                            continue;
                        }
                        if (var364 == 4004) {
                            var4--;
                            int var236 = field389[var4];
                            field389[var4++] = (int) (Math.random() * (double) var236);
                            continue;
                        }
                        if (var364 == 4005) {
                            var4--;
                            int var237 = field389[var4];
                            field389[var4++] = (int) (Math.random() * (double) (var237 + 1));
                            continue;
                        }
                        if (var364 == 4006) {
                            var4 -= 5;
                            int var238 = field389[var4];
                            int var239 = field389[var4 + 1];
                            int var240 = field389[var4 + 2];
                            int var241 = field389[var4 + 3];
                            int var242 = field389[var4 + 4];
                            field389[var4++] = (var239 - var238) * (var242 - var240) / (var241 - var240) + var238;
                            continue;
                        }
                        if (var364 == 4007) {
                            var4 -= 2;
                            int var243 = field389[var4];
                            int var244 = field389[var4 + 1];
                            field389[var4++] = var243 * var244 / 100 + var243;
                            continue;
                        }
                        if (var364 == 4008) {
                            var4 -= 2;
                            int var245 = field389[var4];
                            int var246 = field389[var4 + 1];
                            field389[var4++] = var245 | 0x1 << var246;
                            continue;
                        }
                        if (var364 == 4009) {
                            var4 -= 2;
                            int var247 = field389[var4];
                            int var248 = field389[var4 + 1];
                            field389[var4++] = var247 & -1 - (0x1 << var248);
                            continue;
                        }
                        if (var364 == 4010) {
                            var4 -= 2;
                            int var249 = field389[var4];
                            int var250 = field389[var4 + 1];
                            field389[var4++] = (var249 & 0x1 << var250) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var364 == 4011) {
                            var4 -= 2;
                            int var251 = field389[var4];
                            int var252 = field389[var4 + 1];
                            field389[var4++] = var251 % var252;
                            continue;
                        }
                        if (var364 == 4012) {
                            var4 -= 2;
                            int var253 = field389[var4];
                            int var254 = field389[var4 + 1];
                            if (var253 == 0) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = (int) Math.pow((double) var253, (double) var254);
                            }
                            continue;
                        }
                        if (var364 == 4013) {
                            var4 -= 2;
                            int var255 = field389[var4];
                            int var256 = field389[var4 + 1];
                            if (var255 == 0) {
                                field389[var4++] = 0;
                            } else if (var256 == 0) {
                                field389[var4++] = Integer.MAX_VALUE;
                            } else {
                                field389[var4++] = (int) Math.pow((double) var255, 1.0D / (double) var256);
                            }
                            continue;
                        }
                        if (var364 == 4014) {
                            var4 -= 2;
                            int var257 = field389[var4];
                            int var258 = field389[var4 + 1];
                            field389[var4++] = var257 & var258;
                            continue;
                        }
                        if (var364 == 4015) {
                            var4 -= 2;
                            int var259 = field389[var4];
                            int var260 = field389[var4 + 1];
                            field389[var4++] = var259 | var260;
                            continue;
                        }
                    } else if (var364 < 4200) {
                        if (var364 == 4100) {
                            var5--;
                            String var261 = field386[var5];
                            var4--;
                            int var262 = field389[var4];
                            field386[var5++] = var261 + var262;
                            continue;
                        }
                        if (var364 == 4101) {
                            var5 -= 2;
                            String var263 = field386[var5];
                            String var264 = field386[var5 + 1];
                            field386[var5++] = var263 + var264;
                            continue;
                        }
                        if (var364 == 4102) {
                            var5--;
                            String var265 = field386[var5];
                            var4--;
                            int var266 = field389[var4];
                            field386[var5++] = var265 + class146.method2627(var266, true);
                            continue;
                        }
                        if (var364 == 4103) {
                            var5--;
                            String var267 = field386[var5];
                            field386[var5++] = var267.toLowerCase();
                            continue;
                        }
                        if (var364 == 4104) {
                            var4--;
                            int var268 = field389[var4];
                            long var269 = ((long) var268 + 11745L) * 86400000L;
                            field383.setTime(new Date(var269));
                            int var271 = field383.get(5);
                            int var272 = field383.get(2);
                            int var273 = field383.get(1);
                            field386[var5++] = var271 + "-" + field392[var272] + "-" + var273;
                            continue;
                        }
                        if (var364 == 4105) {
                            var5 -= 2;
                            String var274 = field386[var5];
                            String var275 = field386[var5 + 1];
                            if (Statics.field244.field55 != null && Statics.field244.field55.field2664) {
                                field386[var5++] = var275;
                                continue;
                            }
                            field386[var5++] = var274;
                            continue;
                        }
                        if (var364 == 4106) {
                            var4--;
                            int var276 = field389[var4];
                            field386[var5++] = Integer.toString(var276);
                            continue;
                        }
                        if (var364 == 4107) {
                            var5 -= 2;
                            int[] var277 = field389;
                            int var278 = var4++;
                            int var279 = class149.method538(field386[var5], field386[var5 + 1], client.field700);
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
                        if (var364 == 4108) {
                            var5--;
                            String var281 = field386[var5];
                            var4 -= 2;
                            int var282 = field389[var4];
                            int var283 = field389[var4 + 1];
                            byte[] var284 = Statics.field1283.method2903(var283, 0);
                            class181 var285 = new class181(var284);
                            field389[var4++] = var285.method3390(var281, var282);
                            continue;
                        }
                        if (var364 == 4109) {
                            var5--;
                            String var286 = field386[var5];
                            var4 -= 2;
                            int var287 = field389[var4];
                            int var288 = field389[var4 + 1];
                            byte[] var289 = Statics.field1283.method2903(var288, 0);
                            class181 var290 = new class181(var289);
                            field389[var4++] = var290.method3319(var286, var287);
                            continue;
                        }
                        if (var364 == 4110) {
                            var5 -= 2;
                            String var291 = field386[var5];
                            String var292 = field386[var5 + 1];
                            var4--;
                            if (field389[var4] == 1) {
                                field386[var5++] = var291;
                            } else {
                                field386[var5++] = var292;
                            }
                            continue;
                        }
                        if (var364 == 4111) {
                            var5--;
                            String var293 = field386[var5];
                            field386[var5++] = class183.method3321(var293);
                            continue;
                        }
                        if (var364 == 4112) {
                            var5--;
                            String var294 = field386[var5];
                            var4--;
                            int var295 = field389[var4];
                            field386[var5++] = var294 + (char) var295;
                            continue;
                        }
                        if (var364 == 4113) {
                            var4--;
                            int var296 = field389[var4];
                            int[] var297 = field389;
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
                        if (var364 == 4114) {
                            var4--;
                            int var301 = field389[var4];
                            int[] var302 = field389;
                            int var303 = var4++;
                            char var304 = (char) var301;
                            boolean var305 = var304 >= '0' && var304 <= '9' || var304 >= 'A' && var304 <= 'Z' || var304 >= 'a' && var304 <= 'z';
                            var302[var303] = var305 ? 1 : 0;
                            continue;
                        }
                        if (var364 == 4115) {
                            var4--;
                            int var306 = field389[var4];
                            field389[var4++] = class146.method122((char) var306) ? 1 : 0;
                            continue;
                        }
                        if (var364 == 4116) {
                            var4--;
                            int var307 = field389[var4];
                            field389[var4++] = class146.method1483((char) var307) ? 1 : 0;
                            continue;
                        }
                        if (var364 == 4117) {
                            var5--;
                            String var308 = field386[var5];
                            if (var308 == null) {
                                field389[var4++] = 0;
                            } else {
                                field389[var4++] = var308.length();
                            }
                            continue;
                        }
                        if (var364 == 4118) {
                            var5--;
                            String var309 = field386[var5];
                            var4 -= 2;
                            int var310 = field389[var4];
                            int var311 = field389[var4 + 1];
                            field386[var5++] = var309.substring(var310, var311);
                            continue;
                        }
                        if (var364 == 4119) {
                            var5--;
                            String var312 = field386[var5];
                            StringBuilder var313 = new StringBuilder(var312.length());
                            boolean var314 = false;
                            for (int var315 = 0; var315 < var312.length(); var315++) {
                                char var316 = var312.charAt(var315);
                                if (var316 == '<') {
                                    var314 = true;
                                } else if (var316 == '>') {
                                    var314 = false;
                                } else if (!var314) {
                                    var313.append(var316);
                                }
                            }
                            field386[var5++] = var313.toString();
                            continue;
                        }
                        if (var364 == 4120) {
                            var5--;
                            String var317 = field386[var5];
                            var4--;
                            int var318 = field389[var4];
                            field389[var4++] = var317.indexOf(var318);
                            continue;
                        }
                    } else if (var364 < 4300) {
                        if (var364 == 4200) {
                            var4--;
                            int var319 = field389[var4];
                            field386[var5++] = class39.method1818(var319).field960;
                            continue;
                        }
                        if (var364 == 4201) {
                            var4 -= 2;
                            int var320 = field389[var4];
                            int var321 = field389[var4 + 1];
                            class39 var322 = class39.method1818(var320);
                            if (var321 >= 1 && var321 <= 5 && var322.field977[var321 - 1] != null) {
                                field386[var5++] = var322.field977[var321 - 1];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 4202) {
                            var4 -= 2;
                            int var323 = field389[var4];
                            int var324 = field389[var4 + 1];
                            class39 var325 = class39.method1818(var323);
                            if (var324 >= 1 && var324 <= 5 && var325.field964[var324 - 1] != null) {
                                field386[var5++] = var325.field964[var324 - 1];
                                continue;
                            }
                            field386[var5++] = "";
                            continue;
                        }
                        if (var364 == 4203) {
                            var4--;
                            int var326 = field389[var4];
                            field389[var4++] = class39.method1818(var326).field974;
                            continue;
                        }
                        if (var364 == 4204) {
                            var4--;
                            int var327 = field389[var4];
                            field389[var4++] = class39.method1818(var327).field973 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var364 == 4205) {
                            var4--;
                            int var328 = field389[var4];
                            class39 var329 = class39.method1818(var328);
                            if (var329.field993 == -1 && var329.field992 >= 0) {
                                field389[var4++] = var329.field992;
                                continue;
                            }
                            field389[var4++] = var328;
                            continue;
                        }
                        if (var364 == 4206) {
                            var4--;
                            int var330 = field389[var4];
                            class39 var331 = class39.method1818(var330);
                            if (var331.field993 >= 0 && var331.field992 >= 0) {
                                field389[var4++] = var331.field992;
                                continue;
                            }
                            field389[var4++] = var330;
                            continue;
                        }
                        if (var364 == 4207) {
                            var4--;
                            int var332 = field389[var4];
                            field389[var4++] = class39.method1818(var332).field975 ? 1 : 0;
                            continue;
                        }
                    } else if (var364 < 5100) {
                        if (var364 == 5000) {
                            field389[var4++] = client.field674;
                            continue;
                        }
                        if (var364 == 5001) {
                            var4 -= 3;
                            client.field674 = field389[var4];
                            int var333 = field389[var4 + 1];
                            class136[] var334 = new class136[] { class136.field2302, class136.field2307, class136.field2304 };
                            class136[] var335 = var334;
                            int var336 = 0;
                            class136 var338;
                            while (true) {
                                if (var336 >= var335.length) {
                                    var338 = null;
                                    break;
                                }
                                class136 var337 = var335[var336];
                                if (var337.field2305 == var333) {
                                    var338 = var337;
                                    break;
                                }
                                var336++;
                            }
                            Statics.field1651 = var338;
                            if (Statics.field1651 == null) {
                                Statics.field1651 = class136.field2307;
                            }
                            client.field675 = field389[var4 + 2];
                            client.field631.method2273(48);
                            client.field631.method2369(client.field674);
                            client.field631.method2369(Statics.field1651.field2305);
                            client.field631.method2369(client.field675);
                            continue;
                        }
                        if (var364 == 5002) {
                            var5--;
                            String var339 = field386[var5];
                            var4 -= 2;
                            int var340 = field389[var4];
                            int var341 = field389[var4 + 1];
                            client.field631.method2273(97);
                            client.field631.method2369(class126.method871(var339) + 2);
                            client.field631.method2374(var339);
                            client.field631.method2369(var340 - 1);
                            client.field631.method2369(var341);
                            continue;
                        }
                        if (var364 == 5003) {
                            var4--;
                            int var342 = field389[var4];
                            String var343 = null;
                            if (var342 < 100) {
                                var343 = client.field671[var342];
                            }
                            if (var343 == null) {
                                var343 = "";
                            }
                            field386[var5++] = var343;
                            continue;
                        }
                        if (var364 == 5004) {
                            var4--;
                            int var344 = field389[var4];
                            int var345 = -1;
                            if (var344 < 100 && client.field671[var344] != null) {
                                var345 = client.field569[var344];
                            }
                            field389[var4++] = var345;
                            continue;
                        }
                        if (var364 == 5005) {
                            if (Statics.field1651 == null) {
                                field389[var4++] = -1;
                            } else {
                                field389[var4++] = Statics.field1651.field2305;
                            }
                            continue;
                        }
                        if (var364 == 5008) {
                            var5--;
                            String var346 = field386[var5];
                            if (var346.startsWith("::")) {
                                client.method203(var346);
                            } else {
                                String var347 = var346.toLowerCase();
                                byte var348 = 0;
                                if (var347.startsWith(class133.field2226)) {
                                    var348 = 0;
                                    var346 = var346.substring(class133.field2226.length());
                                } else if (var347.startsWith(class133.field2127)) {
                                    var348 = 1;
                                    var346 = var346.substring(class133.field2127.length());
                                } else if (var347.startsWith(class133.field2230)) {
                                    var348 = 2;
                                    var346 = var346.substring(class133.field2230.length());
                                } else if (var347.startsWith(class133.field2074)) {
                                    var348 = 3;
                                    var346 = var346.substring(class133.field2074.length());
                                } else if (var347.startsWith(class133.field2234)) {
                                    var348 = 4;
                                    var346 = var346.substring(class133.field2234.length());
                                } else if (var347.startsWith(class133.field2236)) {
                                    var348 = 5;
                                    var346 = var346.substring(class133.field2236.length());
                                } else if (var347.startsWith(class133.field2238)) {
                                    var348 = 6;
                                    var346 = var346.substring(class133.field2238.length());
                                } else if (var347.startsWith(class133.field2240)) {
                                    var348 = 7;
                                    var346 = var346.substring(class133.field2240.length());
                                } else if (var347.startsWith(class133.field2242)) {
                                    var348 = 8;
                                    var346 = var346.substring(class133.field2242.length());
                                } else if (var347.startsWith(class133.field2244)) {
                                    var348 = 9;
                                    var346 = var346.substring(class133.field2244.length());
                                } else if (var347.startsWith(class133.field2246)) {
                                    var348 = 10;
                                    var346 = var346.substring(class133.field2246.length());
                                } else if (var347.startsWith(class133.field2273)) {
                                    var348 = 11;
                                    var346 = var346.substring(class133.field2273.length());
                                } else if (client.field700 != 0) {
                                    if (var347.startsWith(class133.field2227)) {
                                        var348 = 0;
                                        var346 = var346.substring(class133.field2227.length());
                                    } else if (var347.startsWith(class133.field2121)) {
                                        var348 = 1;
                                        var346 = var346.substring(class133.field2121.length());
                                    } else if (var347.startsWith(class133.field2280)) {
                                        var348 = 2;
                                        var346 = var346.substring(class133.field2280.length());
                                    } else if (var347.startsWith(class133.field2233)) {
                                        var348 = 3;
                                        var346 = var346.substring(class133.field2233.length());
                                    } else if (var347.startsWith(class133.field2235)) {
                                        var348 = 4;
                                        var346 = var346.substring(class133.field2235.length());
                                    } else if (var347.startsWith(class133.field2237)) {
                                        var348 = 5;
                                        var346 = var346.substring(class133.field2237.length());
                                    } else if (var347.startsWith(class133.field2067)) {
                                        var348 = 6;
                                        var346 = var346.substring(class133.field2067.length());
                                    } else if (var347.startsWith(class133.field2241)) {
                                        var348 = 7;
                                        var346 = var346.substring(class133.field2241.length());
                                    } else if (var347.startsWith(class133.field2243)) {
                                        var348 = 8;
                                        var346 = var346.substring(class133.field2243.length());
                                    } else if (var347.startsWith(class133.field2245)) {
                                        var348 = 9;
                                        var346 = var346.substring(class133.field2245.length());
                                    } else if (var347.startsWith(class133.field2247)) {
                                        var348 = 10;
                                        var346 = var346.substring(class133.field2247.length());
                                    } else if (var347.startsWith(class133.field2249)) {
                                        var348 = 11;
                                        var346 = var346.substring(class133.field2249.length());
                                    }
                                }
                                String var349 = var346.toLowerCase();
                                byte var350 = 0;
                                if (var349.startsWith(class133.field2250)) {
                                    var350 = 1;
                                    var346 = var346.substring(class133.field2250.length());
                                } else if (var349.startsWith(class133.field2252)) {
                                    var350 = 2;
                                    var346 = var346.substring(class133.field2252.length());
                                } else if (var349.startsWith(class133.field2059)) {
                                    var350 = 3;
                                    var346 = var346.substring(class133.field2059.length());
                                } else if (var349.startsWith(class133.field2096)) {
                                    var350 = 4;
                                    var346 = var346.substring(class133.field2096.length());
                                } else if (var349.startsWith(class133.field2258)) {
                                    var350 = 5;
                                    var346 = var346.substring(class133.field2258.length());
                                } else if (client.field700 != 0) {
                                    if (var349.startsWith(class133.field2251)) {
                                        var350 = 1;
                                        var346 = var346.substring(class133.field2251.length());
                                    } else if (var349.startsWith(class133.field2157)) {
                                        var350 = 2;
                                        var346 = var346.substring(class133.field2157.length());
                                    } else if (var349.startsWith(class133.field2084)) {
                                        var350 = 3;
                                        var346 = var346.substring(class133.field2084.length());
                                    } else if (var349.startsWith(class133.field2257)) {
                                        var350 = 4;
                                        var346 = var346.substring(class133.field2257.length());
                                    } else if (var349.startsWith(class133.field2204)) {
                                        var350 = 5;
                                        var346 = var346.substring(class133.field2204.length());
                                    }
                                }
                                client.field631.method2273(169);
                                client.field631.method2369(0);
                                int var351 = client.field631.field2020;
                                client.field631.method2369(var348);
                                client.field631.method2369(var350);
                                class182.method2310(client.field631, var346);
                                client.field631.method2379(client.field631.field2020 - var351);
                            }
                            continue;
                        }
                        if (var364 == 5009) {
                            var5 -= 2;
                            String var352 = field386[var5];
                            String var353 = field386[var5 + 1];
                            client.field631.method2273(241);
                            client.field631.method2505(0);
                            int var354 = client.field631.field2020;
                            client.field631.method2374(var352);
                            class182.method2310(client.field631, var353);
                            client.field631.method2373(client.field631.field2020 - var354);
                            continue;
                        }
                        if (var364 == 5010) {
                            var4--;
                            int var355 = field389[var4];
                            String var356 = null;
                            if (var355 < 100) {
                                var356 = client.field709[var355];
                            }
                            if (var356 == null) {
                                var356 = "";
                            }
                            field386[var5++] = var356;
                            continue;
                        }
                        if (var364 == 5011) {
                            var4--;
                            int var357 = field389[var4];
                            String var358 = null;
                            if (var357 < 100) {
                                var358 = client.field670[var357];
                            }
                            if (var358 == null) {
                                var358 = "";
                            }
                            field386[var5++] = var358;
                            continue;
                        }
                        if (var364 == 5015) {
                            String var359;
                            if (Statics.field244 == null || Statics.field244.field37 == null) {
                                var359 = "";
                            } else {
                                var359 = Statics.field244.field37;
                            }
                            field386[var5++] = var359;
                            continue;
                        }
                        if (var364 == 5016) {
                            field389[var4++] = client.field675;
                            continue;
                        }
                        if (var364 == 5017) {
                            field389[var4++] = client.field496;
                            continue;
                        }
                    }
                } else {
                    class156 var63;
                    if (var364 >= 2000) {
                        var364 -= 1000;
                        var4--;
                        var63 = class156.method822(field389[var4]);
                    } else {
                        var63 = var40 ? Statics.field372 : Statics.field1239;
                    }
                    if (var364 == 1300) {
                        var4--;
                        int var64 = field389[var4] - 1;
                        if (var64 >= 0 && var64 <= 9) {
                            var5--;
                            var63.method3043(var64, field386[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var364 == 1301) {
                        var4 -= 2;
                        int var65 = field389[var4];
                        int var66 = field389[var4 + 1];
                        var63.field2590 = class156.method2787(var65, var66);
                        continue;
                    }
                    if (var364 == 1302) {
                        var4--;
                        var63.field2593 = field389[var4] == 1;
                        continue;
                    }
                    if (var364 == 1303) {
                        var4--;
                        var63.field2578 = field389[var4];
                        continue;
                    }
                    if (var364 == 1304) {
                        var4--;
                        var63.field2643 = field389[var4];
                        continue;
                    }
                    if (var364 == 1305) {
                        var5--;
                        var63.field2533 = field386[var5];
                        continue;
                    }
                    if (var364 == 1306) {
                        var5--;
                        var63.field2594 = field386[var5];
                        continue;
                    }
                    if (var364 == 1307) {
                        var63.field2602 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var363) {
            StringBuilder var361 = new StringBuilder(30);
            var361.append("").append(var3.field2758).append(" ");
            for (int var362 = field387 - 1; var362 >= 0; var362--) {
                var361.append("").append(field388[var362].field256.field2758).append(" ");
            }
            var361.append("").append(var9);
            class79.method2299(var361.toString(), var363);
        }
    }

    @ObfuscatedName("m.y(IB)V")
    public static void method133(int arg0) {
        if (arg0 == -1 || !class156.method60(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2592[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3.field2596 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field1 = var3.field2596;
                method1580(var4);
            }
        }
    }
}
