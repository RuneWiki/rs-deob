package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("c")
public class class26 {

    @ObfuscatedName("c.h")
    public static int[] field387 = new int[5];

    @ObfuscatedName("c.y")
    public static int[][] field379 = new int[5][5000];

    @ObfuscatedName("c.j")
    public static int[] field383 = new int[1000];

    @ObfuscatedName("c.l")
    public static String[] field390 = new String[1000];

    @ObfuscatedName("c.f")
    public static int field378 = 0;

    @ObfuscatedName("c.n")
    public static class18[] field386 = new class18[50];

    @ObfuscatedName("c.w")
    public static Calendar field389 = Calendar.getInstance();

    @ObfuscatedName("c.v")
    public static final String[] field381 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.p(Lp;B)V")
    public static void method1603(class1 arg0) {
        Object[] var1 = arg0.field12;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method234(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field61;
        int[] var8 = var3.field62;
        byte var9 = -1;
        field378 = 0;
        try {
            Statics.field382 = new int[var3.field63];
            int var10 = 0;
            Statics.field385 = new String[var3.field65];
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
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2665;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field10;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2700;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field11 == null ? -1 : arg0.field11.field2665;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field11 == null ? -1 : arg0.field11.field2700;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field1;
                    }
                    Statics.field382[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field15;
                    }
                    Statics.field385[var11++] = var14;
                }
            }
            int var15 = 0;
            label2517: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var392 = var7[var6];
                if (var392 < 100) {
                    if (var392 == 0) {
                        field383[var4++] = var8[var6];
                        continue;
                    }
                    if (var392 == 1) {
                        int var16 = var8[var6];
                        field383[var4++] = class160.field2709[var16];
                        continue;
                    }
                    if (var392 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class160.field2709[var17] = field383[var4];
                        client.method554(var17);
                        continue;
                    }
                    if (var392 == 3) {
                        field390[var5++] = var3.field69[var6];
                        continue;
                    }
                    if (var392 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var392 == 7) {
                        var4 -= 2;
                        if (field383[var4 + 1] != field383[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 8) {
                        var4 -= 2;
                        if (field383[var4 + 1] == field383[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 9) {
                        var4 -= 2;
                        if (field383[var4] < field383[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 10) {
                        var4 -= 2;
                        if (field383[var4] > field383[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 21) {
                        if (field378 == 0) {
                            return;
                        }
                        class18 var18 = field386[--field378];
                        var3 = var18.field263;
                        var7 = var3.field61;
                        var8 = var3.field62;
                        var6 = var18.field272;
                        Statics.field382 = var18.field262;
                        Statics.field385 = var18.field265;
                        continue;
                    }
                    if (var392 == 25) {
                        int var19 = var8[var6];
                        field383[var4++] = class160.method2809(var19);
                        continue;
                    }
                    if (var392 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field383[var4];
                        class38 var22 = (class38) class38.field950.method3266((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field949.method3048(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method823(new class127(var24));
                            }
                            class38.field950.method3268(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field947;
                        int var28 = var23.field948;
                        int var29 = var23.field946;
                        int var30 = class160.field2708[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class160.field2709[var27] = class160.field2709[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var392 == 31) {
                        var4 -= 2;
                        if (field383[var4] <= field383[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 32) {
                        var4 -= 2;
                        if (field383[var4] >= field383[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var392 == 33) {
                        field383[var4++] = Statics.field382[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var392 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field382[var10001] = field383[var4];
                        continue;
                    }
                    if (var392 == 35) {
                        field390[var5++] = Statics.field385[var8[var6]];
                        continue;
                    }
                    if (var392 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field385[var10001] = field390[var5];
                        continue;
                    }
                    if (var392 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String var33 = class148.method2419(field390, var5, var32);
                        field390[var5++] = var33;
                        continue;
                    }
                    if (var392 == 38) {
                        var4--;
                        continue;
                    }
                    if (var392 == 39) {
                        var5--;
                        continue;
                    }
                    if (var392 == 40) {
                        int var34 = var8[var6];
                        class5 var35 = class5.method234(var34);
                        int[] var36 = new int[var35.field63];
                        String[] var37 = new String[var35.field65];
                        for (int var38 = 0; var38 < var35.field66; var38++) {
                            var36[var38] = field383[var4 - var35.field66 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field67; var39++) {
                            var37[var39] = field390[var5 - var35.field67 + var39];
                        }
                        var4 -= var35.field66;
                        var5 -= var35.field67;
                        class18 var40 = new class18();
                        var40.field263 = var3;
                        var40.field272 = var6;
                        var40.field262 = Statics.field382;
                        var40.field265 = Statics.field385;
                        field386[++field378 - 1] = var40;
                        var3 = var35;
                        var7 = var35.field61;
                        var8 = var35.field62;
                        var6 = -1;
                        Statics.field382 = var36;
                        Statics.field385 = var37;
                        continue;
                    }
                    if (var392 == 42) {
                        field383[var4++] = client.field551[var8[var6]];
                        continue;
                    }
                    if (var392 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field551[var10001] = field383[var4];
                        continue;
                    }
                    if (var392 == 44) {
                        int var41 = var8[var6] >> 16;
                        int var42 = var8[var6] & 0xFFFF;
                        var4--;
                        int var43 = field383[var4];
                        if (var43 >= 0 && var43 <= 5000) {
                            field387[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label2517;
                                }
                                field379[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 45) {
                        int var46 = var8[var6];
                        var4--;
                        int var47 = field383[var4];
                        if (var47 >= 0 && var47 < field387[var46]) {
                            field383[var4++] = field379[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 46) {
                        int var48 = var8[var6];
                        var4 -= 2;
                        int var49 = field383[var4];
                        if (var49 >= 0 && var49 < field387[var48]) {
                            field379[var48][var49] = field383[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 47) {
                        String var50 = client.field662[var8[var6]];
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field390[var5++] = var50;
                        continue;
                    }
                    if (var392 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field662[var10001] = field390[var5];
                        continue;
                    }
                }
                boolean var51;
                if (var8[var6] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var392 < 1000) {
                    if (var392 == 100) {
                        var4 -= 3;
                        int var52 = field383[var4];
                        int var53 = field383[var4 + 1];
                        int var54 = field383[var4 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class159 var55 = class159.method1393(var52);
                        if (var55.field2670 == null) {
                            var55.field2670 = new class159[var54 + 1];
                        }
                        if (var55.field2670.length <= var54) {
                            class159[] var56 = new class159[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2670.length; var57++) {
                                var56[var57] = var55.field2670[var57];
                            }
                            var55.field2670 = var56;
                        }
                        if (var54 > 0 && var55.field2670[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class159 var58 = new class159();
                        var58.field2592 = var53;
                        var58.field2601 = var58.field2665 = var55.field2665;
                        var58.field2700 = var54;
                        var58.field2589 = true;
                        var55.field2670[var54] = var58;
                        if (var51) {
                            Statics.field388 = var58;
                        } else {
                            Statics.field384 = var58;
                        }
                        client.method1335(var55);
                        continue;
                    }
                    if (var392 == 101) {
                        class159 var59 = var51 ? Statics.field388 : Statics.field384;
                        class159 var60 = class159.method1393(var59.field2665);
                        var60.field2670[var59.field2700] = null;
                        client.method1335(var60);
                        continue;
                    }
                    if (var392 == 102) {
                        var4--;
                        class159 var61 = class159.method1393(field383[var4]);
                        var61.field2670 = null;
                        client.method1335(var61);
                        continue;
                    }
                    if (var392 == 200) {
                        var4 -= 2;
                        int var62 = field383[var4];
                        int var63 = field383[var4 + 1];
                        class159 var64 = class159.method3023(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field383[var4++] = 1;
                            if (var51) {
                                Statics.field388 = var64;
                            } else {
                                Statics.field384 = var64;
                            }
                            continue;
                        }
                        field383[var4++] = 0;
                        continue;
                    }
                } else if (!(var392 < 1000 || var392 >= 1100) || !(var392 < 2000 || var392 >= 2100)) {
                    class159 var65;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var4--;
                        var65 = class159.method1393(field383[var4]);
                    } else {
                        var65 = var51 ? Statics.field388 : Statics.field384;
                    }
                    if (var392 == 1000) {
                        var4 -= 2;
                        var65.field2606 = field383[var4];
                        var65.field2690 = field383[var4 + 1];
                        client.method1335(var65);
                        continue;
                    }
                    if (var392 == 1001) {
                        var4 -= 2;
                        var65.field2599 = field383[var4];
                        var65.field2585 = field383[var4 + 1];
                        client.method1335(var65);
                        continue;
                    }
                    if (var392 == 1003) {
                        var4--;
                        boolean var66 = field383[var4] == 1;
                        if (var65.field2602 != var66) {
                            var65.field2602 = var66;
                            client.method1335(var65);
                        }
                        continue;
                    }
                } else if (!(var392 < 1100 || var392 >= 1200) || !(var392 < 2100 || var392 >= 2200)) {
                    class159 var67;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var4--;
                        var67 = class159.method1393(field383[var4]);
                    } else {
                        var67 = var51 ? Statics.field388 : Statics.field384;
                    }
                    if (var392 == 1100) {
                        var4 -= 2;
                        var67.field2603 = field383[var4];
                        if (var67.field2603 > var67.field2605 - var67.field2599) {
                            var67.field2603 = var67.field2605 - var67.field2599;
                        }
                        if (var67.field2603 < 0) {
                            var67.field2603 = 0;
                        }
                        var67.field2604 = field383[var4 + 1];
                        if (var67.field2604 > var67.field2620 - var67.field2585) {
                            var67.field2604 = var67.field2620 - var67.field2585;
                        }
                        if (var67.field2604 < 0) {
                            var67.field2604 = 0;
                        }
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1101) {
                        var4--;
                        var67.field2698 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1102) {
                        var4--;
                        var67.field2611 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1103) {
                        var4--;
                        var67.field2612 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1104) {
                        var4--;
                        var67.field2613 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1105) {
                        var4--;
                        var67.field2614 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1106) {
                        var4--;
                        var67.field2600 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1107) {
                        var4--;
                        var67.field2617 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1108) {
                        var67.field2703 = 1;
                        var4--;
                        var67.field2623 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1109) {
                        var4 -= 6;
                        var67.field2628 = field383[var4];
                        var67.field2629 = field383[var4 + 1];
                        var67.field2630 = field383[var4 + 2];
                        var67.field2631 = field383[var4 + 3];
                        var67.field2632 = field383[var4 + 4];
                        var67.field2633 = field383[var4 + 5];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1110) {
                        var4--;
                        int var68 = field383[var4];
                        if (var67.field2626 != var68) {
                            var67.field2626 = var68;
                            var67.field2696 = 0;
                            var67.field2697 = 0;
                            client.method1335(var67);
                        }
                        continue;
                    }
                    if (var392 == 1111) {
                        var4--;
                        var67.field2635 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1112) {
                        var5--;
                        String var69 = field390[var5];
                        if (!var69.equals(var67.field2637)) {
                            var67.field2637 = var69;
                            client.method1335(var67);
                        }
                        continue;
                    }
                    if (var392 == 1113) {
                        var4--;
                        var67.field2636 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1114) {
                        var4 -= 3;
                        var67.field2640 = field383[var4];
                        var67.field2619 = field383[var4 + 1];
                        var67.field2584 = field383[var4 + 2];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1115) {
                        var4--;
                        var67.field2642 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1116) {
                        var4--;
                        var67.field2653 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1117) {
                        var4--;
                        var67.field2639 = field383[var4];
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1118) {
                        var4--;
                        var67.field2672 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1119) {
                        var4--;
                        var67.field2621 = field383[var4] == 1;
                        client.method1335(var67);
                        continue;
                    }
                    if (var392 == 1120) {
                        var4 -= 2;
                        var67.field2605 = field383[var4];
                        var67.field2620 = field383[var4 + 1];
                        client.method1335(var67);
                        continue;
                    }
                } else if (!(var392 < 1200 || var392 >= 1300) || !(var392 < 2200 || var392 >= 2300)) {
                    class159 var70;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var4--;
                        var70 = class159.method1393(field383[var4]);
                    } else {
                        var70 = var51 ? Statics.field388 : Statics.field384;
                    }
                    client.method1335(var70);
                    if (var392 == 1200) {
                        var4 -= 2;
                        int var71 = field383[var4];
                        int var72 = field383[var4 + 1];
                        var70.field2694 = var71;
                        var70.field2695 = var72;
                        class40 var73 = class40.method1554(var71);
                        var70.field2630 = var73.field976;
                        var70.field2631 = var73.field985;
                        var70.field2632 = var73.field984;
                        var70.field2628 = var73.field982;
                        var70.field2629 = var73.field986;
                        var70.field2633 = var73.field981;
                        if (var70.field2599 > 0) {
                            var70.field2633 = var70.field2633 * 32 / var70.field2599;
                        }
                        continue;
                    }
                    if (var392 == 1201) {
                        var70.field2703 = 2;
                        var4--;
                        var70.field2623 = field383[var4];
                        continue;
                    }
                    if (var392 == 1202) {
                        var70.field2703 = 3;
                        var70.field2623 = Statics.field1271.field31.method3241();
                        continue;
                    }
                } else if (var392 >= 1300 && var392 < 1400 || var392 >= 2300 && var392 < 2400) {
                    class159 var74;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var4--;
                        var74 = class159.method1393(field383[var4]);
                    } else {
                        var74 = var51 ? Statics.field388 : Statics.field384;
                    }
                    if (var392 == 1300) {
                        var4--;
                        int var75 = field383[var4] - 1;
                        if (var75 >= 0 && var75 <= 9) {
                            var5--;
                            var74.method3180(var75, field390[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var392 == 1301) {
                        var4 -= 2;
                        int var76 = field383[var4];
                        int var77 = field383[var4 + 1];
                        var74.field2652 = class159.method3023(var76, var77);
                        continue;
                    }
                    if (var392 == 1302) {
                        var4--;
                        var74.field2655 = field383[var4] == 1;
                        continue;
                    }
                    if (var392 == 1303) {
                        var4--;
                        var74.field2668 = field383[var4];
                        continue;
                    }
                    if (var392 == 1304) {
                        var4--;
                        var74.field2654 = field383[var4];
                        continue;
                    }
                    if (var392 == 1305) {
                        var5--;
                        var74.field2650 = field390[var5];
                        continue;
                    }
                    if (var392 == 1306) {
                        var5--;
                        var74.field2656 = field390[var5];
                        continue;
                    }
                    if (var392 == 1307) {
                        var74.field2706 = null;
                        continue;
                    }
                } else {
                    if (var392 >= 1400 && var392 < 1500 || var392 >= 2400 && var392 < 2500) {
                        class159 var78;
                        if (var392 >= 2000) {
                            var392 -= 1000;
                            var4--;
                            var78 = class159.method1393(field383[var4]);
                        } else {
                            var78 = var51 ? Statics.field388 : Statics.field384;
                        }
                        var5--;
                        String var79 = field390[var5];
                        int[] var80 = null;
                        if (var79.length() > 0 && var79.charAt(var79.length() - 1) == 'Y') {
                            var4--;
                            int var81 = field383[var4];
                            if (var81 > 0) {
                                var80 = new int[var81];
                                while (var81-- > 0) {
                                    var4--;
                                    var80[var81] = field383[var4];
                                }
                            }
                            var79 = var79.substring(0, var79.length() - 1);
                        }
                        Object[] var82 = new Object[var79.length() + 1];
                        for (int var83 = var82.length - 1; var83 >= 1; var83--) {
                            if (var79.charAt(var83 - 1) == 's') {
                                var5--;
                                var82[var83] = field390[var5];
                            } else {
                                var4--;
                                var82[var83] = Integer.valueOf(field383[var4]);
                            }
                        }
                        var4--;
                        int var84 = field383[var4];
                        if (var84 == -1) {
                            var82 = null;
                        } else {
                            var82[0] = Integer.valueOf(var84);
                        }
                        if (var392 == 1400) {
                            var78.field2616 = var82;
                        }
                        if (var392 == 1401) {
                            var78.field2627 = var82;
                        }
                        if (var392 == 1402) {
                            var78.field2597 = var82;
                        }
                        if (var392 == 1403) {
                            var78.field2663 = var82;
                        }
                        if (var392 == 1404) {
                            var78.field2666 = var82;
                        }
                        if (var392 == 1405) {
                            var78.field2664 = var82;
                        }
                        if (var392 == 1406) {
                            var78.field2669 = var82;
                        }
                        if (var392 == 1407) {
                            var78.field2622 = var82;
                            var78.field2671 = var80;
                        }
                        if (var392 == 1408) {
                            var78.field2673 = var82;
                        }
                        if (var392 == 1409) {
                            var78.field2607 = var82;
                        }
                        if (var392 == 1410) {
                            var78.field2667 = var82;
                        }
                        if (var392 == 1411) {
                            var78.field2660 = var82;
                        }
                        if (var392 == 1412) {
                            var78.field2704 = var82;
                        }
                        if (var392 == 1414) {
                            var78.field2595 = var82;
                            var78.field2651 = var80;
                        }
                        if (var392 == 1415) {
                            var78.field2674 = var82;
                            var78.field2675 = var80;
                        }
                        if (var392 == 1416) {
                            var78.field2679 = var82;
                        }
                        if (var392 == 1417) {
                            var78.field2646 = var82;
                        }
                        if (var392 == 1418) {
                            var78.field2683 = var82;
                        }
                        if (var392 == 1419) {
                            var78.field2680 = var82;
                        }
                        if (var392 == 1420) {
                            var78.field2681 = var82;
                        }
                        if (var392 == 1421) {
                            var78.field2682 = var82;
                        }
                        if (var392 == 1422) {
                            var78.field2677 = var82;
                        }
                        if (var392 == 1423) {
                            var78.field2684 = var82;
                        }
                        if (var392 == 1424) {
                            var78.field2685 = var82;
                        }
                        var78.field2657 = true;
                        continue;
                    }
                    if (var392 < 1600) {
                        class159 var85 = var51 ? Statics.field388 : Statics.field384;
                        if (var392 == 1500) {
                            field383[var4++] = var85.field2606;
                            continue;
                        }
                        if (var392 == 1501) {
                            field383[var4++] = var85.field2690;
                            continue;
                        }
                        if (var392 == 1502) {
                            field383[var4++] = var85.field2599;
                            continue;
                        }
                        if (var392 == 1503) {
                            field383[var4++] = var85.field2585;
                            continue;
                        }
                        if (var392 == 1504) {
                            field383[var4++] = var85.field2602 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 1505) {
                            field383[var4++] = var85.field2601;
                            continue;
                        }
                    } else if (var392 < 1700) {
                        class159 var86 = var51 ? Statics.field388 : Statics.field384;
                        if (var392 == 1600) {
                            field383[var4++] = var86.field2603;
                            continue;
                        }
                        if (var392 == 1601) {
                            field383[var4++] = var86.field2604;
                            continue;
                        }
                        if (var392 == 1602) {
                            field390[var5++] = var86.field2637;
                            continue;
                        }
                        if (var392 == 1603) {
                            field383[var4++] = var86.field2605;
                            continue;
                        }
                        if (var392 == 1604) {
                            field383[var4++] = var86.field2620;
                            continue;
                        }
                        if (var392 == 1605) {
                            field383[var4++] = var86.field2633;
                            continue;
                        }
                        if (var392 == 1606) {
                            field383[var4++] = var86.field2630;
                            continue;
                        }
                        if (var392 == 1607) {
                            field383[var4++] = var86.field2632;
                            continue;
                        }
                        if (var392 == 1608) {
                            field383[var4++] = var86.field2631;
                            continue;
                        }
                    } else if (var392 < 1800) {
                        class159 var87 = var51 ? Statics.field388 : Statics.field384;
                        if (var392 == 1700) {
                            field383[var4++] = var87.field2694;
                            continue;
                        }
                        if (var392 == 1701) {
                            if (var87.field2694 == -1) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = var87.field2695;
                            }
                            continue;
                        }
                        if (var392 == 1702) {
                            field383[var4++] = var87.field2700;
                            continue;
                        }
                    } else if (var392 < 1900) {
                        class159 var88 = var51 ? Statics.field388 : Statics.field384;
                        if (var392 == 1800) {
                            field383[var4++] = class163.method1572(client.method3160(var88));
                            continue;
                        }
                        if (var392 == 1801) {
                            var4--;
                            int var89 = field383[var4];
                            int var393 = var89 - 1;
                            if (var88.field2706 != null && var393 < var88.field2706.length && var88.field2706[var393] != null) {
                                field390[var5++] = var88.field2706[var393];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 1802) {
                            if (var88.field2650 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var88.field2650;
                            }
                            continue;
                        }
                    } else if (var392 < 2600) {
                        var4--;
                        class159 var90 = class159.method1393(field383[var4]);
                        if (var392 == 2500) {
                            field383[var4++] = var90.field2606;
                            continue;
                        }
                        if (var392 == 2501) {
                            field383[var4++] = var90.field2690;
                            continue;
                        }
                        if (var392 == 2502) {
                            field383[var4++] = var90.field2599;
                            continue;
                        }
                        if (var392 == 2503) {
                            field383[var4++] = var90.field2585;
                            continue;
                        }
                        if (var392 == 2504) {
                            field383[var4++] = var90.field2602 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 2505) {
                            field383[var4++] = var90.field2601;
                            continue;
                        }
                    } else if (var392 < 2700) {
                        var4--;
                        class159 var91 = class159.method1393(field383[var4]);
                        if (var392 == 2600) {
                            field383[var4++] = var91.field2603;
                            continue;
                        }
                        if (var392 == 2601) {
                            field383[var4++] = var91.field2604;
                            continue;
                        }
                        if (var392 == 2602) {
                            field390[var5++] = var91.field2637;
                            continue;
                        }
                        if (var392 == 2603) {
                            field383[var4++] = var91.field2605;
                            continue;
                        }
                        if (var392 == 2604) {
                            field383[var4++] = var91.field2620;
                            continue;
                        }
                        if (var392 == 2605) {
                            field383[var4++] = var91.field2633;
                            continue;
                        }
                        if (var392 == 2606) {
                            field383[var4++] = var91.field2630;
                            continue;
                        }
                        if (var392 == 2607) {
                            field383[var4++] = var91.field2632;
                            continue;
                        }
                        if (var392 == 2608) {
                            field383[var4++] = var91.field2631;
                            continue;
                        }
                    } else if (var392 < 2800) {
                        if (var392 == 2700) {
                            var4--;
                            class159 var92 = class159.method1393(field383[var4]);
                            field383[var4++] = var92.field2694;
                            continue;
                        }
                        if (var392 == 2701) {
                            var4--;
                            class159 var93 = class159.method1393(field383[var4]);
                            if (var93.field2694 == -1) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = var93.field2695;
                            }
                            continue;
                        }
                        if (var392 == 2702) {
                            var4--;
                            int var94 = field383[var4];
                            class4 var95 = (class4) client.field628.method3311((long) var94);
                            if (var95 == null) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var392 < 2900) {
                        var4--;
                        class159 var96 = class159.method1393(field383[var4]);
                        if (var392 == 2800) {
                            field383[var4++] = class163.method1572(client.method3160(var96));
                            continue;
                        }
                        if (var392 == 2801) {
                            var4--;
                            int var97 = field383[var4];
                            int var394 = var97 - 1;
                            if (var96.field2706 != null && var394 < var96.field2706.length && var96.field2706[var394] != null) {
                                field390[var5++] = var96.field2706[var394];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 2802) {
                            if (var96.field2650 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = var96.field2650;
                            }
                            continue;
                        }
                    } else if (var392 < 3200) {
                        if (var392 == 3100) {
                            var5--;
                            String var98 = field390[var5];
                            client.method1399(0, "", var98);
                            continue;
                        }
                        if (var392 == 3101) {
                            var4 -= 2;
                            client.method1511(Statics.field1271, field383[var4], field383[var4 + 1]);
                            continue;
                        }
                        if (var392 == 3103) {
                            client.field509.method2345(24);
                            for (class4 var99 = (class4) client.field628.method3312(); var99 != null; var99 = (class4) client.field628.method3313()) {
                                if (var99.field51 == 0 || var99.field51 == 3) {
                                    client.method1541(var99, true);
                                }
                            }
                            if (client.field623 != null) {
                                client.method1335(client.field623);
                                client.field623 = null;
                            }
                            continue;
                        }
                        if (var392 == 3104) {
                            var5--;
                            String var100 = field390[var5];
                            int var101 = 0;
                            boolean var102 = class148.method1441(var100, 10, true);
                            if (var102) {
                                int var103 = class148.method2333(var100, 10, true);
                                var101 = var103;
                            }
                            client.field509.method2345(117);
                            client.field509.method2483(var101);
                            continue;
                        }
                        if (var392 == 3105) {
                            var5--;
                            String var104 = field390[var5];
                            client.field509.method2345(220);
                            client.field509.method2657(var104.length() + 1);
                            client.field509.method2485(var104);
                            continue;
                        }
                        if (var392 == 3106) {
                            var5--;
                            String var105 = field390[var5];
                            client.field509.method2345(176);
                            client.field509.method2657(var105.length() + 1);
                            client.field509.method2485(var105);
                            continue;
                        }
                        if (var392 == 3107) {
                            var4--;
                            int var106 = field383[var4];
                            var5--;
                            String var107 = field390[var5];
                            Statics.method1377(var106, var107);
                            continue;
                        }
                        if (var392 == 3108) {
                            var4 -= 3;
                            int var108 = field383[var4];
                            int var109 = field383[var4 + 1];
                            int var110 = field383[var4 + 2];
                            class159 var111 = class159.method1393(var110);
                            client.method13(var111, var108, var109);
                            continue;
                        }
                        if (var392 == 3109) {
                            var4 -= 2;
                            int var112 = field383[var4];
                            int var113 = field383[var4 + 1];
                            class159 var114 = var51 ? Statics.field388 : Statics.field384;
                            client.method13(var114, var112, var113);
                            continue;
                        }
                    } else if (var392 < 3300) {
                        if (var392 == 3200) {
                            var4 -= 3;
                            client.method224(field383[var4], field383[var4 + 1], field383[var4 + 2]);
                            continue;
                        }
                        if (var392 == 3201) {
                            var4--;
                            Statics.method830(field383[var4]);
                            continue;
                        }
                        if (var392 == 3202) {
                            var4 -= 2;
                            client.method623(field383[var4], field383[var4 + 1]);
                            continue;
                        }
                    } else if (var392 < 3400) {
                        if (var392 == 3300) {
                            field383[var4++] = client.field476;
                            continue;
                        }
                        if (var392 == 3301) {
                            var4 -= 2;
                            int var115 = field383[var4];
                            int var116 = field383[var4 + 1];
                            field383[var4++] = class19.method121(var115, var116);
                            continue;
                        }
                        if (var392 == 3302) {
                            var4 -= 2;
                            int var117 = field383[var4];
                            int var118 = field383[var4 + 1];
                            int[] var119 = field383;
                            int var120 = var4++;
                            class19 var121 = (class19) class19.field274.method3311((long) var117);
                            int var122;
                            if (var121 == null) {
                                var122 = 0;
                            } else if (var118 >= 0 && var118 < var121.field275.length) {
                                var122 = var121.field275[var118];
                            } else {
                                var122 = 0;
                            }
                            var119[var120] = var122;
                            continue;
                        }
                        if (var392 == 3303) {
                            var4 -= 2;
                            int var123 = field383[var4];
                            int var124 = field383[var4 + 1];
                            field383[var4++] = class19.method132(var123, var124);
                            continue;
                        }
                        if (var392 == 3304) {
                            var4--;
                            int var125 = field383[var4];
                            field383[var4++] = class41.method841(var125).field1015;
                            continue;
                        }
                        if (var392 == 3305) {
                            var4--;
                            int var126 = field383[var4];
                            field383[var4++] = client.field600[var126];
                            continue;
                        }
                        if (var392 == 3306) {
                            var4--;
                            int var127 = field383[var4];
                            field383[var4++] = client.field606[var127];
                            continue;
                        }
                        if (var392 == 3307) {
                            var4--;
                            int var128 = field383[var4];
                            field383[var4++] = client.field607[var128];
                            continue;
                        }
                        if (var392 == 3308) {
                            int var129 = Statics.field1467;
                            int var130 = (Statics.field1271.field418 >> 7) + Statics.field1646;
                            int var131 = (Statics.field1271.field398 >> 7) + Statics.field1269;
                            field383[var4++] = (var129 << 28) + (var130 << 14) + var131;
                            continue;
                        }
                        if (var392 == 3309) {
                            var4--;
                            int var132 = field383[var4];
                            field383[var4++] = var132 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3310) {
                            var4--;
                            int var133 = field383[var4];
                            field383[var4++] = var133 >> 28;
                            continue;
                        }
                        if (var392 == 3311) {
                            var4--;
                            int var134 = field383[var4];
                            field383[var4++] = var134 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3312) {
                            field383[var4++] = client.field636 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3313) {
                            var4 -= 2;
                            int var135 = field383[var4] + 32768;
                            int var136 = field383[var4 + 1];
                            field383[var4++] = class19.method121(var135, var136);
                            continue;
                        }
                        if (var392 == 3314) {
                            var4 -= 2;
                            int var137 = field383[var4] + 32768;
                            int var138 = field383[var4 + 1];
                            int[] var139 = field383;
                            int var140 = var4++;
                            class19 var141 = (class19) class19.field274.method3311((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = 0;
                            } else if (var138 >= 0 && var138 < var141.field275.length) {
                                var142 = var141.field275[var138];
                            } else {
                                var142 = 0;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var392 == 3315) {
                            var4 -= 2;
                            int var143 = field383[var4] + 32768;
                            int var144 = field383[var4 + 1];
                            field383[var4++] = class19.method132(var143, var144);
                            continue;
                        }
                        if (var392 == 3316) {
                            if (client.field573 >= 2) {
                                field383[var4++] = client.field573;
                            } else {
                                field383[var4++] = 0;
                            }
                            continue;
                        }
                        if (var392 == 3317) {
                            field383[var4++] = client.field484;
                            continue;
                        }
                        if (var392 == 3318) {
                            field383[var4++] = client.field635;
                            continue;
                        }
                        if (var392 == 3321) {
                            field383[var4++] = client.field727;
                            continue;
                        }
                        if (var392 == 3322) {
                            field383[var4++] = client.field548;
                            continue;
                        }
                        if (var392 == 3323) {
                            if (client.field485) {
                                field383[var4++] = 1;
                            } else {
                                field383[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var392 < 3500) {
                        if (var392 == 3400) {
                            var4 -= 2;
                            int var145 = field383[var4];
                            int var146 = field383[var4 + 1];
                            class39 var147 = class39.method553(var145);
                            if (var147.field959 != 's') {
                            }
                            for (int var148 = 0; var148 < var147.field962; var148++) {
                                if (var147.field964[var148] == var146) {
                                    field390[var5++] = var147.field965[var148];
                                    var147 = null;
                                    break;
                                }
                            }
                            if (var147 != null) {
                                field390[var5++] = var147.field963;
                            }
                            continue;
                        }
                        if (var392 == 3408) {
                            var4 -= 4;
                            int var149 = field383[var4];
                            int var150 = field383[var4 + 1];
                            int var151 = field383[var4 + 2];
                            int var152 = field383[var4 + 3];
                            class39 var153 = class39.method553(var151);
                            if (var153.field958 == var149 && var153.field959 == var150) {
                                for (int var154 = 0; var154 < var153.field962; var154++) {
                                    if (var153.field964[var154] == var152) {
                                        if (var150 == 115) {
                                            field390[var5++] = var153.field965[var154];
                                        } else {
                                            field383[var4++] = var153.field967[var154];
                                        }
                                        var153 = null;
                                        break;
                                    }
                                }
                                if (var153 != null) {
                                    if (var150 == 115) {
                                        field390[var5++] = var153.field963;
                                    } else {
                                        field383[var4++] = var153.field960;
                                    }
                                }
                                continue;
                            }
                            if (var150 == 115) {
                                field390[var5++] = "null";
                            } else {
                                field383[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var392 < 3700) {
                        if (var392 == 3600) {
                            if (client.field654 == 0) {
                                field383[var4++] = -2;
                            } else if (client.field654 == 1) {
                                field383[var4++] = -1;
                            } else {
                                field383[var4++] = client.field719;
                            }
                            continue;
                        }
                        if (var392 == 3601) {
                            var4--;
                            int var155 = field383[var4];
                            if (client.field654 == 2 && var155 < client.field719) {
                                field390[var5++] = client.field721[var155].field356;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 3602) {
                            var4--;
                            int var156 = field383[var4];
                            if (client.field654 == 2 && var156 < client.field719) {
                                field383[var4++] = client.field721[var156].field350;
                                continue;
                            }
                            field383[var4++] = 0;
                            continue;
                        }
                        if (var392 == 3603) {
                            var4--;
                            int var157 = field383[var4];
                            if (client.field654 == 2 && var157 < client.field719) {
                                field383[var4++] = client.field721[var157].field358;
                                continue;
                            }
                            field383[var4++] = 0;
                            continue;
                        }
                        if (var392 == 3604) {
                            var5--;
                            String var158 = field390[var5];
                            var4--;
                            int var159 = field383[var4];
                            client.method2336(var158, var159);
                            continue;
                        }
                        if (var392 == 3605) {
                            var5--;
                            String var160 = field390[var5];
                            client.method2147(var160);
                            continue;
                        }
                        if (var392 == 3606) {
                            var5--;
                            String var161 = field390[var5];
                            client.method1885(var161);
                            continue;
                        }
                        if (var392 == 3607) {
                            var5--;
                            String var162 = field390[var5];
                            if (var162 == null) {
                                continue;
                            }
                            if ((client.field533 < 100 || client.field594 == 1) && client.field533 < 400) {
                                String var163 = class149.method2767(var162, Statics.field513);
                                if (var163 == null) {
                                    continue;
                                }
                                for (int var164 = 0; var164 < client.field533; var164++) {
                                    class11 var165 = client.field724[var164];
                                    String var166 = class149.method2767(var165.field181, Statics.field513);
                                    if (var166 != null && var166.equals(var163)) {
                                        client.method1399(0, "", var162 + class135.field2258);
                                        continue label2517;
                                    }
                                    if (var165.field176 != null) {
                                        String var167 = class149.method2767(var165.field176, Statics.field513);
                                        if (var167 != null && var167.equals(var163)) {
                                            client.method1399(0, "", var162 + class135.field2258);
                                            continue label2517;
                                        }
                                    }
                                }
                                for (int var168 = 0; var168 < client.field719; var168++) {
                                    class23 var169 = client.field721[var168];
                                    String var170 = class149.method2767(var169.field356, Statics.field513);
                                    if (var170 != null && var170.equals(var163)) {
                                        client.method1399(0, "", class135.field2263 + var162 + class135.field2323);
                                        continue label2517;
                                    }
                                    if (var169.field349 != null) {
                                        String var171 = class149.method2767(var169.field349, Statics.field513);
                                        if (var171 != null && var171.equals(var163)) {
                                            client.method1399(0, "", class135.field2263 + var162 + class135.field2323);
                                            continue label2517;
                                        }
                                    }
                                }
                                if (class149.method2767(Statics.field1271.field33, Statics.field513).equals(var163)) {
                                    client.method1399(0, "", class135.field2277);
                                } else {
                                    client.field509.method2345(170);
                                    class116 var172 = client.field509;
                                    int var173 = var162.length() + 1;
                                    var172.method2657(var173);
                                    client.field509.method2485(var162);
                                }
                                continue;
                            }
                            client.method1399(0, "", class135.field2257);
                            continue;
                        }
                        if (var392 == 3608) {
                            var5--;
                            String var174 = field390[var5];
                            if (var174 == null) {
                                continue;
                            }
                            String var175 = class149.method2767(var174, Statics.field513);
                            if (var175 == null) {
                                continue;
                            }
                            int var176 = 0;
                            while (true) {
                                if (var176 >= client.field533) {
                                    continue label2517;
                                }
                                class11 var177 = client.field724[var176];
                                String var178 = var177.field181;
                                String var179 = class149.method2767(var178, Statics.field513);
                                if (class137.method42(var174, var175, var178, var179)) {
                                    client.field533--;
                                    for (int var180 = var176; var180 < client.field533; var180++) {
                                        client.field724[var180] = client.field724[var180 + 1];
                                    }
                                    client.field658 = client.field650;
                                    client.field509.method2345(41);
                                    class116 var181 = client.field509;
                                    int var182 = var174.length() + 1;
                                    var181.method2657(var182);
                                    client.field509.method2485(var174);
                                    continue label2517;
                                }
                                var176++;
                            }
                        }
                        if (var392 == 3609) {
                            var5--;
                            String var183 = field390[var5];
                            if (var183.startsWith(class2.method2415(0)) || var183.startsWith(class2.method2415(1))) {
                                var183 = var183.substring(7);
                            }
                            field383[var4++] = client.method791(var183) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3611) {
                            if (client.field692 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = class147.method156(client.field692);
                            }
                            continue;
                        }
                        if (var392 == 3612) {
                            if (client.field692 == null) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = Statics.field934;
                            }
                            continue;
                        }
                        if (var392 == 3613) {
                            var4--;
                            int var184 = field383[var4];
                            if (client.field692 != null && var184 < Statics.field934) {
                                field390[var5++] = Statics.field1930[var184].field117;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 3614) {
                            var4--;
                            int var185 = field383[var4];
                            if (client.field692 != null && var185 < Statics.field934) {
                                field383[var4++] = Statics.field1930[var185].field108;
                                continue;
                            }
                            field383[var4++] = 0;
                            continue;
                        }
                        if (var392 == 3615) {
                            var4--;
                            int var186 = field383[var4];
                            if (client.field692 != null && var186 < Statics.field934) {
                                field383[var4++] = Statics.field1930[var186].field112;
                                continue;
                            }
                            field383[var4++] = 0;
                            continue;
                        }
                        if (var392 == 3616) {
                            field383[var4++] = Statics.field2472;
                            continue;
                        }
                        if (var392 == 3617) {
                            var5--;
                            String var187 = field390[var5];
                            if (Statics.field1930 != null) {
                                client.field509.method2345(6);
                                class116 var188 = client.field509;
                                int var189 = var187.length() + 1;
                                var188.method2657(var189);
                                client.field509.method2485(var187);
                            }
                            continue;
                        }
                        if (var392 == 3618) {
                            field383[var4++] = Statics.field8;
                            continue;
                        }
                        if (var392 == 3619) {
                            var5--;
                            String var190 = field390[var5];
                            if (!var190.equals("")) {
                                client.field509.method2345(57);
                                class116 var191 = client.field509;
                                int var192 = var190.length() + 1;
                                var191.method2657(var192);
                                client.field509.method2485(var190);
                            }
                            continue;
                        }
                        if (var392 == 3620) {
                            client.method2068();
                            continue;
                        }
                        if (var392 == 3621) {
                            if (client.field654 == 0) {
                                field383[var4++] = -1;
                            } else {
                                field383[var4++] = client.field533;
                            }
                            continue;
                        }
                        if (var392 == 3622) {
                            var4--;
                            int var193 = field383[var4];
                            if (client.field654 != 0 && var193 < client.field533) {
                                field390[var5++] = client.field724[var193].field181;
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 3623) {
                            var5--;
                            String var194 = field390[var5];
                            if (var194.startsWith(class2.method2415(0)) || var194.startsWith(class2.method2415(1))) {
                                var194 = var194.substring(7);
                            }
                            field383[var4++] = client.method59(var194) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3624) {
                            var4--;
                            int var195 = field383[var4];
                            if (Statics.field1930 != null && var195 < Statics.field934 && Statics.field1930[var195].field117.equalsIgnoreCase(Statics.field1271.field33)) {
                                field383[var4++] = 1;
                                continue;
                            }
                            field383[var4++] = 0;
                            continue;
                        }
                        if (var392 == 3625) {
                            if (client.field468 == null) {
                                field390[var5++] = "";
                            } else {
                                field390[var5++] = class147.method156(client.field468);
                            }
                            continue;
                        }
                    } else if (var392 < 4100) {
                        if (var392 == 4000) {
                            var4 -= 2;
                            int var196 = field383[var4];
                            int var197 = field383[var4 + 1];
                            field383[var4++] = var196 + var197;
                            continue;
                        }
                        if (var392 == 4001) {
                            var4 -= 2;
                            int var198 = field383[var4];
                            int var199 = field383[var4 + 1];
                            field383[var4++] = var198 - var199;
                            continue;
                        }
                        if (var392 == 4002) {
                            var4 -= 2;
                            int var200 = field383[var4];
                            int var201 = field383[var4 + 1];
                            field383[var4++] = var200 * var201;
                            continue;
                        }
                        if (var392 == 4003) {
                            var4 -= 2;
                            int var202 = field383[var4];
                            int var203 = field383[var4 + 1];
                            field383[var4++] = var202 / var203;
                            continue;
                        }
                        if (var392 == 4004) {
                            var4--;
                            int var204 = field383[var4];
                            field383[var4++] = (int) (Math.random() * (double) var204);
                            continue;
                        }
                        if (var392 == 4005) {
                            var4--;
                            int var205 = field383[var4];
                            field383[var4++] = (int) (Math.random() * (double) (var205 + 1));
                            continue;
                        }
                        if (var392 == 4006) {
                            var4 -= 5;
                            int var206 = field383[var4];
                            int var207 = field383[var4 + 1];
                            int var208 = field383[var4 + 2];
                            int var209 = field383[var4 + 3];
                            int var210 = field383[var4 + 4];
                            field383[var4++] = (var207 - var206) * (var210 - var208) / (var209 - var208) + var206;
                            continue;
                        }
                        if (var392 == 4007) {
                            var4 -= 2;
                            int var211 = field383[var4];
                            int var212 = field383[var4 + 1];
                            field383[var4++] = var211 * var212 / 100 + var211;
                            continue;
                        }
                        if (var392 == 4008) {
                            var4 -= 2;
                            int var213 = field383[var4];
                            int var214 = field383[var4 + 1];
                            field383[var4++] = var213 | 0x1 << var214;
                            continue;
                        }
                        if (var392 == 4009) {
                            var4 -= 2;
                            int var215 = field383[var4];
                            int var216 = field383[var4 + 1];
                            field383[var4++] = var215 & -1 - (0x1 << var216);
                            continue;
                        }
                        if (var392 == 4010) {
                            var4 -= 2;
                            int var217 = field383[var4];
                            int var218 = field383[var4 + 1];
                            field383[var4++] = (var217 & 0x1 << var218) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var392 == 4011) {
                            var4 -= 2;
                            int var219 = field383[var4];
                            int var220 = field383[var4 + 1];
                            field383[var4++] = var219 % var220;
                            continue;
                        }
                        if (var392 == 4012) {
                            var4 -= 2;
                            int var221 = field383[var4];
                            int var222 = field383[var4 + 1];
                            if (var221 == 0) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = (int) Math.pow((double) var221, (double) var222);
                            }
                            continue;
                        }
                        if (var392 == 4013) {
                            var4 -= 2;
                            int var223 = field383[var4];
                            int var224 = field383[var4 + 1];
                            if (var223 == 0) {
                                field383[var4++] = 0;
                            } else if (var224 == 0) {
                                field383[var4++] = Integer.MAX_VALUE;
                            } else {
                                field383[var4++] = (int) Math.pow((double) var223, 1.0D / (double) var224);
                            }
                            continue;
                        }
                        if (var392 == 4014) {
                            var4 -= 2;
                            int var225 = field383[var4];
                            int var226 = field383[var4 + 1];
                            field383[var4++] = var225 & var226;
                            continue;
                        }
                        if (var392 == 4015) {
                            var4 -= 2;
                            int var227 = field383[var4];
                            int var228 = field383[var4 + 1];
                            field383[var4++] = var227 | var228;
                            continue;
                        }
                    } else if (var392 < 4200) {
                        if (var392 == 4100) {
                            var5--;
                            String var229 = field390[var5];
                            var4--;
                            int var230 = field383[var4];
                            field390[var5++] = var229 + var230;
                            continue;
                        }
                        if (var392 == 4101) {
                            var5 -= 2;
                            String var231 = field390[var5];
                            String var232 = field390[var5 + 1];
                            field390[var5++] = var231 + var232;
                            continue;
                        }
                        if (var392 == 4102) {
                            var5--;
                            String var233 = field390[var5];
                            var4--;
                            int var234 = field383[var4];
                            String[] var235 = field390;
                            int var236 = var5++;
                            String var238;
                            if (var234 < 0) {
                                var238 = Integer.toString(var234);
                            } else {
                                int var239 = var234;
                                String var240;
                                if (var234 < 0) {
                                    var240 = Integer.toString(var234, 10);
                                } else {
                                    int var241 = 2;
                                    int var242 = var234 / 10;
                                    while (var242 != 0) {
                                        var242 /= 10;
                                        var241++;
                                    }
                                    char[] var243 = new char[var241];
                                    var243[0] = '+';
                                    for (int var244 = var241 - 1; var244 > 0; var244--) {
                                        int var245 = var239;
                                        var239 /= 10;
                                        int var246 = var245 - var239 * 10;
                                        if (var246 >= 10) {
                                            var243[var244] = (char) (var246 + 87);
                                        } else {
                                            var243[var244] = (char) (var246 + 48);
                                        }
                                    }
                                    var240 = new String(var243);
                                }
                                var238 = var240;
                            }
                            var235[var236] = var233 + var238;
                            continue;
                        }
                        if (var392 == 4103) {
                            var5--;
                            String var247 = field390[var5];
                            field390[var5++] = var247.toLowerCase();
                            continue;
                        }
                        if (var392 == 4104) {
                            var4--;
                            int var248 = field383[var4];
                            long var249 = ((long) var248 + 11745L) * 86400000L;
                            field389.setTime(new Date(var249));
                            int var251 = field389.get(5);
                            int var252 = field389.get(2);
                            int var253 = field389.get(1);
                            field390[var5++] = var251 + "-" + field381[var252] + "-" + var253;
                            continue;
                        }
                        if (var392 == 4105) {
                            var5 -= 2;
                            String var254 = field390[var5];
                            String var255 = field390[var5 + 1];
                            if (Statics.field1271.field31 != null && Statics.field1271.field31.field2734) {
                                field390[var5++] = var255;
                                continue;
                            }
                            field390[var5++] = var254;
                            continue;
                        }
                        if (var392 == 4106) {
                            var4--;
                            int var256 = field383[var4];
                            field390[var5++] = Integer.toString(var256);
                            continue;
                        }
                        if (var392 == 4107) {
                            var5 -= 2;
                            int[] var257 = field383;
                            int var258 = var4++;
                            String var259 = field390[var5];
                            String var260 = field390[var5 + 1];
                            int var261 = client.field472;
                            int var262 = var259.length();
                            int var263 = var260.length();
                            int var264 = 0;
                            int var265 = 0;
                            char var266 = 0;
                            char var267 = 0;
                            int var268;
                            label2313: while (true) {
                                if (var264 - var266 >= var262 && var265 - var267 >= var263) {
                                    int var277 = Math.min(var262, var263);
                                    for (int var278 = 0; var278 < var277; var278++) {
                                        char var281 = var259.charAt(var278);
                                        char var282 = var260.charAt(var278);
                                        if (var281 != var282 && Character.toUpperCase(var281) != Character.toUpperCase(var282)) {
                                            char var283 = Character.toLowerCase(var281);
                                            char var284 = Character.toLowerCase(var282);
                                            if (var283 != var284) {
                                                var268 = class151.method2240(var283, var261) - class151.method2240(var284, var261);
                                                break label2313;
                                            }
                                        }
                                    }
                                    int var285 = var262 - var263;
                                    if (var285 == 0) {
                                        for (int var286 = 0; var286 < var277; var286++) {
                                            char var287 = var259.charAt(var286);
                                            char var288 = var260.charAt(var286);
                                            if (var287 != var288) {
                                                var268 = class151.method2240(var287, var261) - class151.method2240(var288, var261);
                                                break label2313;
                                            }
                                        }
                                        var268 = 0;
                                    } else {
                                        var268 = var285;
                                    }
                                    break;
                                }
                                if (var264 - var266 >= var262) {
                                    var268 = -1;
                                    break;
                                }
                                if (var265 - var267 >= var263) {
                                    var268 = 1;
                                    break;
                                }
                                char var269;
                                if (var266 == 0) {
                                    var269 = var259.charAt(var264++);
                                } else {
                                    var269 = var266;
                                    boolean var270 = false;
                                }
                                char var271;
                                if (var267 == 0) {
                                    var271 = var260.charAt(var265++);
                                } else {
                                    var271 = var267;
                                    boolean var272 = false;
                                }
                                var266 = class151.method1659(var269);
                                var267 = class151.method1659(var271);
                                char var273 = class151.method145(var269, var261);
                                char var274 = class151.method145(var271, var261);
                                if (var273 != var274 && Character.toUpperCase(var273) != Character.toUpperCase(var274)) {
                                    char var275 = Character.toLowerCase(var273);
                                    char var276 = Character.toLowerCase(var274);
                                    if (var275 != var276) {
                                        var268 = class151.method2240(var275, var261) - class151.method2240(var276, var261);
                                        break;
                                    }
                                }
                            }
                            byte var290;
                            if (var268 > 0) {
                                var290 = 1;
                            } else if (var268 < 0) {
                                var290 = -1;
                            } else {
                                var290 = 0;
                            }
                            var257[var258] = var290;
                            continue;
                        }
                        if (var392 == 4108) {
                            var5--;
                            String var291 = field390[var5];
                            var4 -= 2;
                            int var292 = field383[var4];
                            int var293 = field383[var4 + 1];
                            byte[] var294 = Statics.field2537.method3048(var293, 0);
                            class183 var295 = new class183(var294);
                            field383[var4++] = var295.method3396(var291, var292);
                            continue;
                        }
                        if (var392 == 4109) {
                            var5--;
                            String var296 = field390[var5];
                            var4 -= 2;
                            int var297 = field383[var4];
                            int var298 = field383[var4 + 1];
                            byte[] var299 = Statics.field2537.method3048(var298, 0);
                            class183 var300 = new class183(var299);
                            field383[var4++] = var300.method3402(var296, var297);
                            continue;
                        }
                        if (var392 == 4110) {
                            var5 -= 2;
                            String var301 = field390[var5];
                            String var302 = field390[var5 + 1];
                            var4--;
                            if (field383[var4] == 1) {
                                field390[var5++] = var301;
                            } else {
                                field390[var5++] = var302;
                            }
                            continue;
                        }
                        if (var392 == 4111) {
                            var5--;
                            String var303 = field390[var5];
                            field390[var5++] = class185.method3425(var303);
                            continue;
                        }
                        if (var392 == 4112) {
                            var5--;
                            String var304 = field390[var5];
                            var4--;
                            int var305 = field383[var4];
                            field390[var5++] = var304 + (char) var305;
                            continue;
                        }
                        if (var392 == 4113) {
                            var4--;
                            int var306 = field383[var4];
                            int[] var307 = field383;
                            int var308 = var4++;
                            char var309 = (char) var306;
                            boolean var310;
                            if (var309 >= ' ' && var309 <= '~') {
                                var310 = true;
                            } else if (var309 >= 160 && var309 <= 255) {
                                var310 = true;
                            } else if (var309 == 8364 || var309 == 338 || var309 == 8212 || var309 == 339 || var309 == 376) {
                                var310 = true;
                            } else {
                                var310 = false;
                            }
                            var307[var308] = var310 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4114) {
                            var4--;
                            int var311 = field383[var4];
                            int[] var312 = field383;
                            int var313 = var4++;
                            char var314 = (char) var311;
                            boolean var315 = var314 >= '0' && var314 <= '9' || var314 >= 'A' && var314 <= 'Z' || var314 >= 'a' && var314 <= 'z';
                            var312[var313] = var315 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4115) {
                            var4--;
                            int var316 = field383[var4];
                            field383[var4++] = class148.method187((char) var316) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4116) {
                            var4--;
                            int var317 = field383[var4];
                            field383[var4++] = class148.method628((char) var317) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4117) {
                            var5--;
                            String var318 = field390[var5];
                            if (var318 == null) {
                                field383[var4++] = 0;
                            } else {
                                field383[var4++] = var318.length();
                            }
                            continue;
                        }
                        if (var392 == 4118) {
                            var5--;
                            String var319 = field390[var5];
                            var4 -= 2;
                            int var320 = field383[var4];
                            int var321 = field383[var4 + 1];
                            field390[var5++] = var319.substring(var320, var321);
                            continue;
                        }
                        if (var392 == 4119) {
                            var5--;
                            String var322 = field390[var5];
                            StringBuilder var323 = new StringBuilder(var322.length());
                            boolean var324 = false;
                            for (int var325 = 0; var325 < var322.length(); var325++) {
                                char var326 = var322.charAt(var325);
                                if (var326 == '<') {
                                    var324 = true;
                                } else if (var326 == '>') {
                                    var324 = false;
                                } else if (!var324) {
                                    var323.append(var326);
                                }
                            }
                            field390[var5++] = var323.toString();
                            continue;
                        }
                        if (var392 == 4120) {
                            var5--;
                            String var327 = field390[var5];
                            var4--;
                            int var328 = field383[var4];
                            field383[var4++] = var327.indexOf(var328);
                            continue;
                        }
                    } else if (var392 < 4300) {
                        if (var392 == 4200) {
                            var4--;
                            int var329 = field383[var4];
                            field390[var5++] = class40.method1554(var329).field1004;
                            continue;
                        }
                        if (var392 == 4201) {
                            var4 -= 2;
                            int var330 = field383[var4];
                            int var331 = field383[var4 + 1];
                            class40 var332 = class40.method1554(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field990[var331 - 1] != null) {
                                field390[var5++] = var332.field990[var331 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 4202) {
                            var4 -= 2;
                            int var333 = field383[var4];
                            int var334 = field383[var4 + 1];
                            class40 var335 = class40.method1554(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field991[var334 - 1] != null) {
                                field390[var5++] = var335.field991[var334 - 1];
                                continue;
                            }
                            field390[var5++] = "";
                            continue;
                        }
                        if (var392 == 4203) {
                            var4--;
                            int var336 = field383[var4];
                            field383[var4++] = class40.method1554(var336).field988;
                            continue;
                        }
                        if (var392 == 4204) {
                            var4--;
                            int var337 = field383[var4];
                            field383[var4++] = class40.method1554(var337).field987 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4205) {
                            var4--;
                            int var338 = field383[var4];
                            class40 var339 = class40.method1554(var338);
                            if (var339.field1007 == -1 && var339.field1006 >= 0) {
                                field383[var4++] = var339.field1006;
                                continue;
                            }
                            field383[var4++] = var338;
                            continue;
                        }
                        if (var392 == 4206) {
                            var4--;
                            int var340 = field383[var4];
                            class40 var341 = class40.method1554(var340);
                            if (var341.field1007 >= 0 && var341.field1006 >= 0) {
                                field383[var4++] = var341.field1006;
                                continue;
                            }
                            field383[var4++] = var340;
                            continue;
                        }
                        if (var392 == 4207) {
                            var4--;
                            int var342 = field383[var4];
                            field383[var4++] = class40.method1554(var342).field972 ? 1 : 0;
                            continue;
                        }
                    } else if (var392 < 5100) {
                        if (var392 == 5000) {
                            field383[var4++] = client.field684;
                            continue;
                        }
                        if (var392 == 5001) {
                            var4 -= 3;
                            client.field684 = field383[var4];
                            int var343 = field383[var4 + 1];
                            class138[] var344 = new class138[] { class138.field2349, class138.field2343, class138.field2348 };
                            class138[] var345 = var344;
                            int var346 = 0;
                            class138 var348;
                            while (true) {
                                if (var346 >= var345.length) {
                                    var348 = null;
                                    break;
                                }
                                class138 var347 = var345[var346];
                                if (var347.field2344 == var343) {
                                    var348 = var347;
                                    break;
                                }
                                var346++;
                            }
                            Statics.field239 = var348;
                            if (Statics.field239 == null) {
                                Statics.field239 = class138.field2343;
                            }
                            client.field685 = field383[var4 + 2];
                            client.field509.method2345(254);
                            client.field509.method2657(client.field684);
                            client.field509.method2657(Statics.field239.field2344);
                            client.field509.method2657(client.field685);
                            continue;
                        }
                        if (var392 == 5002) {
                            var5--;
                            String var349 = field390[var5];
                            var4 -= 2;
                            int var350 = field383[var4];
                            int var351 = field383[var4 + 1];
                            client.field509.method2345(40);
                            class116 var352 = client.field509;
                            int var353 = var349.length() + 1;
                            var352.method2657(var353 + 2);
                            client.field509.method2485(var349);
                            client.field509.method2657(var350 - 1);
                            client.field509.method2657(var351);
                            continue;
                        }
                        if (var392 == 5003) {
                            var4--;
                            int var354 = field383[var4];
                            String var355 = null;
                            if (var354 < 100) {
                                var355 = client.field681[var354];
                            }
                            if (var355 == null) {
                                var355 = "";
                            }
                            field390[var5++] = var355;
                            continue;
                        }
                        if (var392 == 5004) {
                            var4--;
                            int var356 = field383[var4];
                            int var357 = -1;
                            if (var356 < 100 && client.field681[var356] != null) {
                                var357 = client.field678[var356];
                            }
                            field383[var4++] = var357;
                            continue;
                        }
                        if (var392 == 5005) {
                            if (Statics.field239 == null) {
                                field383[var4++] = -1;
                            } else {
                                field383[var4++] = Statics.field239.field2344;
                            }
                            continue;
                        }
                        if (var392 == 5008) {
                            var5--;
                            String var358 = field390[var5];
                            if (var358.startsWith("::")) {
                                client.method39(var358.substring(2));
                                continue;
                            }
                            String var359 = var358.toLowerCase();
                            byte var360 = 0;
                            if (var359.startsWith(class135.field2127)) {
                                var360 = 0;
                                var358 = var358.substring(class135.field2127.length());
                            } else if (var359.startsWith(class135.field2267)) {
                                var360 = 1;
                                var358 = var358.substring(class135.field2267.length());
                            } else if (var359.startsWith(class135.field2269)) {
                                var360 = 2;
                                var358 = var358.substring(class135.field2269.length());
                            } else if (var359.startsWith(class135.field2206)) {
                                var360 = 3;
                                var358 = var358.substring(class135.field2206.length());
                            } else if (var359.startsWith(class135.field2273)) {
                                var360 = 4;
                                var358 = var358.substring(class135.field2273.length());
                            } else if (var359.startsWith(class135.field2275)) {
                                var360 = 5;
                                var358 = var358.substring(class135.field2275.length());
                            } else if (var359.startsWith(class135.field2281)) {
                                var360 = 6;
                                var358 = var358.substring(class135.field2281.length());
                            } else if (var359.startsWith(class135.field2217)) {
                                var360 = 7;
                                var358 = var358.substring(class135.field2217.length());
                            } else if (var359.startsWith(class135.field2265)) {
                                var360 = 8;
                                var358 = var358.substring(class135.field2265.length());
                            } else if (var359.startsWith(class135.field2283)) {
                                var360 = 9;
                                var358 = var358.substring(class135.field2283.length());
                            } else if (var359.startsWith(class135.field2285)) {
                                var360 = 10;
                                var358 = var358.substring(class135.field2285.length());
                            } else if (var359.startsWith(class135.field2158)) {
                                var360 = 11;
                                var358 = var358.substring(class135.field2158.length());
                            } else if (client.field472 != 0) {
                                if (var359.startsWith(class135.field2212)) {
                                    var360 = 0;
                                    var358 = var358.substring(class135.field2212.length());
                                } else if (var359.startsWith(class135.field2136)) {
                                    var360 = 1;
                                    var358 = var358.substring(class135.field2136.length());
                                } else if (var359.startsWith(class135.field2270)) {
                                    var360 = 2;
                                    var358 = var358.substring(class135.field2270.length());
                                } else if (var359.startsWith(class135.field2272)) {
                                    var360 = 3;
                                    var358 = var358.substring(class135.field2272.length());
                                } else if (var359.startsWith(class135.field2274)) {
                                    var360 = 4;
                                    var358 = var358.substring(class135.field2274.length());
                                } else if (var359.startsWith(class135.field2276)) {
                                    var360 = 5;
                                    var358 = var358.substring(class135.field2276.length());
                                } else if (var359.startsWith(class135.field2278)) {
                                    var360 = 6;
                                    var358 = var358.substring(class135.field2278.length());
                                } else if (var359.startsWith(class135.field2280)) {
                                    var360 = 7;
                                    var358 = var358.substring(class135.field2280.length());
                                } else if (var359.startsWith(class135.field2282)) {
                                    var360 = 8;
                                    var358 = var358.substring(class135.field2282.length());
                                } else if (var359.startsWith(class135.field2322)) {
                                    var360 = 9;
                                    var358 = var358.substring(class135.field2322.length());
                                } else if (var359.startsWith(class135.field2286)) {
                                    var360 = 10;
                                    var358 = var358.substring(class135.field2286.length());
                                } else if (var359.startsWith(class135.field2288)) {
                                    var360 = 11;
                                    var358 = var358.substring(class135.field2288.length());
                                }
                            }
                            String var361 = var358.toLowerCase();
                            byte var362 = 0;
                            if (var361.startsWith(class135.field2132)) {
                                var362 = 1;
                                var358 = var358.substring(class135.field2132.length());
                            } else if (var361.startsWith(class135.field2291)) {
                                var362 = 2;
                                var358 = var358.substring(class135.field2291.length());
                            } else if (var361.startsWith(class135.field2238)) {
                                var362 = 3;
                                var358 = var358.substring(class135.field2238.length());
                            } else if (var361.startsWith(class135.field2295)) {
                                var362 = 4;
                                var358 = var358.substring(class135.field2295.length());
                            } else if (var361.startsWith(class135.field2241)) {
                                var362 = 5;
                                var358 = var358.substring(class135.field2241.length());
                            } else if (client.field472 != 0) {
                                if (var361.startsWith(class135.field2290)) {
                                    var362 = 1;
                                    var358 = var358.substring(class135.field2290.length());
                                } else if (var361.startsWith(class135.field2279)) {
                                    var362 = 2;
                                    var358 = var358.substring(class135.field2279.length());
                                } else if (var361.startsWith(class135.field2143)) {
                                    var362 = 3;
                                    var358 = var358.substring(class135.field2143.length());
                                } else if (var361.startsWith(class135.field2296)) {
                                    var362 = 4;
                                    var358 = var358.substring(class135.field2296.length());
                                } else if (var361.startsWith(class135.field2114)) {
                                    var362 = 5;
                                    var358 = var358.substring(class135.field2114.length());
                                }
                            }
                            client.field509.method2345(4);
                            client.field509.method2657(0);
                            int var363 = client.field509.field2029;
                            client.field509.method2657(var360);
                            client.field509.method2657(var362);
                            class116 var364 = client.field509;
                            int var365 = var364.field2029;
                            int var366 = var358.length();
                            byte[] var367 = new byte[var366];
                            for (int var368 = 0; var368 < var366; var368++) {
                                char var369 = var358.charAt(var368);
                                if (var369 > 0 && var369 < 128 || var369 >= 160 && var369 <= 255) {
                                    var367[var368] = (byte) var369;
                                } else if (var369 == 8364) {
                                    var367[var368] = -128;
                                } else if (var369 == 8218) {
                                    var367[var368] = -126;
                                } else if (var369 == 402) {
                                    var367[var368] = -125;
                                } else if (var369 == 8222) {
                                    var367[var368] = -124;
                                } else if (var369 == 8230) {
                                    var367[var368] = -123;
                                } else if (var369 == 8224) {
                                    var367[var368] = -122;
                                } else if (var369 == 8225) {
                                    var367[var368] = -121;
                                } else if (var369 == 710) {
                                    var367[var368] = -120;
                                } else if (var369 == 8240) {
                                    var367[var368] = -119;
                                } else if (var369 == 352) {
                                    var367[var368] = -118;
                                } else if (var369 == 8249) {
                                    var367[var368] = -117;
                                } else if (var369 == 338) {
                                    var367[var368] = -116;
                                } else if (var369 == 381) {
                                    var367[var368] = -114;
                                } else if (var369 == 8216) {
                                    var367[var368] = -111;
                                } else if (var369 == 8217) {
                                    var367[var368] = -110;
                                } else if (var369 == 8220) {
                                    var367[var368] = -109;
                                } else if (var369 == 8221) {
                                    var367[var368] = -108;
                                } else if (var369 == 8226) {
                                    var367[var368] = -107;
                                } else if (var369 == 8211) {
                                    var367[var368] = -106;
                                } else if (var369 == 8212) {
                                    var367[var368] = -105;
                                } else if (var369 == 732) {
                                    var367[var368] = -104;
                                } else if (var369 == 8482) {
                                    var367[var368] = -103;
                                } else if (var369 == 353) {
                                    var367[var368] = -102;
                                } else if (var369 == 8250) {
                                    var367[var368] = -101;
                                } else if (var369 == 339) {
                                    var367[var368] = -100;
                                } else if (var369 == 382) {
                                    var367[var368] = -98;
                                } else if (var369 == 376) {
                                    var367[var368] = -97;
                                } else {
                                    var367[var368] = 63;
                                }
                            }
                            var364.method2643(var367.length);
                            var364.field2029 += Statics.field2825.method2413(var367, 0, var367.length, var364.field2033, var364.field2029);
                            client.field509.method2491(client.field509.field2029 - var363);
                            continue;
                        }
                        if (var392 == 5009) {
                            var5 -= 2;
                            String var372 = field390[var5];
                            String var373 = field390[var5 + 1];
                            client.field509.method2345(42);
                            client.field509.method2481(0);
                            int var374 = client.field509.field2029;
                            client.field509.method2485(var372);
                            class116 var375 = client.field509;
                            int var376 = var375.field2029;
                            int var377 = var373.length();
                            byte[] var378 = new byte[var377];
                            for (int var379 = 0; var379 < var377; var379++) {
                                char var380 = var373.charAt(var379);
                                if (!(var380 <= 0 || var380 >= 128) || !(var380 < 160 || var380 > 255)) {
                                    var378[var379] = (byte) var380;
                                } else if (var380 == 8364) {
                                    var378[var379] = -128;
                                } else if (var380 == 8218) {
                                    var378[var379] = -126;
                                } else if (var380 == 402) {
                                    var378[var379] = -125;
                                } else if (var380 == 8222) {
                                    var378[var379] = -124;
                                } else if (var380 == 8230) {
                                    var378[var379] = -123;
                                } else if (var380 == 8224) {
                                    var378[var379] = -122;
                                } else if (var380 == 8225) {
                                    var378[var379] = -121;
                                } else if (var380 == 710) {
                                    var378[var379] = -120;
                                } else if (var380 == 8240) {
                                    var378[var379] = -119;
                                } else if (var380 == 352) {
                                    var378[var379] = -118;
                                } else if (var380 == 8249) {
                                    var378[var379] = -117;
                                } else if (var380 == 338) {
                                    var378[var379] = -116;
                                } else if (var380 == 381) {
                                    var378[var379] = -114;
                                } else if (var380 == 8216) {
                                    var378[var379] = -111;
                                } else if (var380 == 8217) {
                                    var378[var379] = -110;
                                } else if (var380 == 8220) {
                                    var378[var379] = -109;
                                } else if (var380 == 8221) {
                                    var378[var379] = -108;
                                } else if (var380 == 8226) {
                                    var378[var379] = -107;
                                } else if (var380 == 8211) {
                                    var378[var379] = -106;
                                } else if (var380 == 8212) {
                                    var378[var379] = -105;
                                } else if (var380 == 732) {
                                    var378[var379] = -104;
                                } else if (var380 == 8482) {
                                    var378[var379] = -103;
                                } else if (var380 == 353) {
                                    var378[var379] = -102;
                                } else if (var380 == 8250) {
                                    var378[var379] = -101;
                                } else if (var380 == 339) {
                                    var378[var379] = -100;
                                } else if (var380 == 382) {
                                    var378[var379] = -98;
                                } else if (var380 == 376) {
                                    var378[var379] = -97;
                                } else {
                                    var378[var379] = 63;
                                }
                            }
                            var375.method2643(var378.length);
                            var375.field2029 += Statics.field2825.method2413(var378, 0, var378.length, var375.field2033, var375.field2029);
                            client.field509.method2490(client.field509.field2029 - var374);
                            continue;
                        }
                        if (var392 == 5010) {
                            var4--;
                            int var383 = field383[var4];
                            String var384 = null;
                            if (var383 < 100) {
                                var384 = client.field675[var383];
                            }
                            if (var384 == null) {
                                var384 = "";
                            }
                            field390[var5++] = var384;
                            continue;
                        }
                        if (var392 == 5011) {
                            var4--;
                            int var385 = field383[var4];
                            String var386 = null;
                            if (var385 < 100) {
                                var386 = client.field482[var385];
                            }
                            if (var386 == null) {
                                var386 = "";
                            }
                            field390[var5++] = var386;
                            continue;
                        }
                        if (var392 == 5015) {
                            String var387;
                            if (Statics.field1271 == null || Statics.field1271.field33 == null) {
                                var387 = "";
                            } else {
                                var387 = Statics.field1271.field33;
                            }
                            field390[var5++] = var387;
                            continue;
                        }
                        if (var392 == 5016) {
                            field383[var4++] = client.field685;
                            continue;
                        }
                        if (var392 == 5017) {
                            field383[var4++] = client.field682;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var391) {
            StringBuilder var389 = new StringBuilder(30);
            var389.append("").append(var3.field2813).append(" ");
            for (int var390 = field378 - 1; var390 >= 0; var390--) {
                var389.append("").append(field386[var390].field263.field2813).append(" ");
            }
            var389.append("").append(var9);
            class80.method838(var389.toString(), var391);
        }
    }
}
