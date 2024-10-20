package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.c")
    public static int[] field709 = new int[5];

    @ObfuscatedName("ah.y")
    public static int[][] field705 = new int[5][5000];

    @ObfuscatedName("ah.g")
    public static int[] field703 = new int[1000];

    @ObfuscatedName("ah.l")
    public static String[] field706 = new String[1000];

    @ObfuscatedName("ah.h")
    public static int field708 = 0;

    @ObfuscatedName("ah.n")
    public static class13[] field710 = new class13[50];

    @ObfuscatedName("ah.x")
    public static Calendar field707 = Calendar.getInstance();

    @ObfuscatedName("ah.b")
    public static final String[] field711 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.t(Lt;I)V")
    public static void method126(class1 arg0) {
        method572(arg0, 200000);
    }

    @ObfuscatedName("aa.o(Lt;II)V")
    public static void method572(class1 arg0, int arg1) {
        Object[] var2 = arg0.field11;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method494(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field522;
        int[] var9 = var4.field525;
        byte var10 = -1;
        field708 = 0;
        try {
            Statics.field702 = new int[var4.field521];
            int var11 = 0;
            Statics.field700 = new String[var4.field526];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2514;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2605;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2514;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2605;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field702[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field12;
                    }
                    Statics.field700[var12++] = var15;
                }
            }
            int var16 = 0;
            label2500: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var412 = var8[var7];
                if (var412 < 100) {
                    if (var412 == 0) {
                        field703[var5++] = var9[var7];
                        continue;
                    }
                    if (var412 == 1) {
                        int var17 = var9[var7];
                        field703[var5++] = class154.field2642[var17];
                        continue;
                    }
                    if (var412 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2642[var18] = field703[var5];
                        client.method2847(var18);
                        continue;
                    }
                    if (var412 == 3) {
                        field706[var6++] = var4.field528[var7];
                        continue;
                    }
                    if (var412 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var412 == 7) {
                        var5 -= 2;
                        if (field703[var5 + 1] != field703[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 8) {
                        var5 -= 2;
                        if (field703[var5 + 1] == field703[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 9) {
                        var5 -= 2;
                        if (field703[var5] < field703[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 10) {
                        var5 -= 2;
                        if (field703[var5] > field703[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 21) {
                        if (field708 == 0) {
                            return;
                        }
                        class13 var19 = field710[--field708];
                        var4 = var19.field193;
                        var8 = var4.field522;
                        var9 = var4.field525;
                        var7 = var19.field188;
                        Statics.field702 = var19.field197;
                        Statics.field700 = var19.field190;
                        continue;
                    }
                    if (var412 == 25) {
                        int var20 = var9[var7];
                        field703[var5++] = Statics.method2786(var20);
                        continue;
                    }
                    if (var412 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class154.method116(var21, field703[var5]);
                        continue;
                    }
                    if (var412 == 31) {
                        var5 -= 2;
                        if (field703[var5] <= field703[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 32) {
                        var5 -= 2;
                        if (field703[var5] >= field703[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var412 == 33) {
                        field703[var5++] = Statics.field702[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var412 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field702[var10001] = field703[var5];
                        continue;
                    }
                    if (var412 == 35) {
                        field706[var6++] = Statics.field700[var9[var7]];
                        continue;
                    }
                    if (var412 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field700[var10001] = field706[var6];
                        continue;
                    }
                    if (var412 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class199.method3463(field706, var6, var22);
                        field706[var6++] = var23;
                        continue;
                    }
                    if (var412 == 38) {
                        var5--;
                        continue;
                    }
                    if (var412 == 39) {
                        var6--;
                        continue;
                    }
                    if (var412 == 40) {
                        int var24 = var9[var7];
                        class19 var25 = class19.method494(var24);
                        int[] var26 = new int[var25.field521];
                        String[] var27 = new String[var25.field526];
                        for (int var28 = 0; var28 < var25.field527; var28++) {
                            var26[var28] = field703[var5 - var25.field527 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field523; var29++) {
                            var27[var29] = field706[var6 - var25.field523 + var29];
                        }
                        var5 -= var25.field527;
                        var6 -= var25.field523;
                        class13 var30 = new class13();
                        var30.field193 = var4;
                        var30.field188 = var7;
                        var30.field197 = Statics.field702;
                        var30.field190 = Statics.field700;
                        field710[++field708 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field522;
                        var9 = var25.field525;
                        var7 = -1;
                        Statics.field702 = var26;
                        Statics.field700 = var27;
                        continue;
                    }
                    if (var412 == 42) {
                        field703[var5++] = client.field449[var9[var7]];
                        continue;
                    }
                    if (var412 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field449[var10001] = field703[var5];
                        continue;
                    }
                    if (var412 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field703[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field709[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2500;
                                }
                                field705[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var412 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field703[var5];
                        if (var37 >= 0 && var37 < field709[var36]) {
                            field703[var5++] = field705[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var412 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field703[var5];
                        if (var39 >= 0 && var39 < field709[var38]) {
                            field705[var38][var39] = field703[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var412 == 47) {
                        String var40 = client.field333[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field706[var6++] = var40;
                        continue;
                    }
                    if (var412 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field333[var10001] = field706[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var412 < 1000) {
                    if (var412 == 100) {
                        var5 -= 3;
                        int var42 = field703[var5];
                        int var43 = field703[var5 + 1];
                        int var44 = field703[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var45 = class152.method2301(var42);
                        if (var45.field2622 == null) {
                            var45.field2622 = new class152[var44 + 1];
                        }
                        if (var45.field2622.length <= var44) {
                            class152[] var46 = new class152[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2622.length; var47++) {
                                var46[var47] = var45.field2622[var47];
                            }
                            var45.field2622 = var46;
                        }
                        if (var44 > 0 && var45.field2622[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class152 var48 = new class152();
                        var48.field2581 = var43;
                        var48.field2594 = var48.field2514 = var45.field2514;
                        var48.field2605 = var44;
                        var48.field2513 = true;
                        var45.field2622[var44] = var48;
                        if (var41) {
                            Statics.field186 = var48;
                        } else {
                            Statics.field603 = var48;
                        }
                        client.method2502(var45);
                        continue;
                    }
                    if (var412 == 101) {
                        class152 var49 = var41 ? Statics.field186 : Statics.field603;
                        class152 var50 = class152.method2301(var49.field2514);
                        var50.field2622[var49.field2605] = null;
                        client.method2502(var50);
                        continue;
                    }
                    if (var412 == 102) {
                        var5--;
                        class152 var51 = class152.method2301(field703[var5]);
                        var51.field2622 = null;
                        client.method2502(var51);
                        continue;
                    }
                    if (var412 == 200) {
                        var5 -= 2;
                        int var52 = field703[var5];
                        int var53 = field703[var5 + 1];
                        class152 var54 = class152.method456(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field703[var5++] = 1;
                            if (var41) {
                                Statics.field186 = var54;
                            } else {
                                Statics.field603 = var54;
                            }
                            continue;
                        }
                        field703[var5++] = 0;
                        continue;
                    }
                } else if (var412 >= 1000 && var412 < 1100 || var412 >= 2000 && var412 < 2100) {
                    class152 var55;
                    if (var412 >= 2000) {
                        var412 -= 1000;
                        var5--;
                        var55 = class152.method2301(field703[var5]);
                    } else {
                        var55 = var41 ? Statics.field186 : Statics.field603;
                    }
                    if (var412 == 1000) {
                        var5 -= 2;
                        var55.field2628 = field703[var5];
                        var55.field2520 = field703[var5 + 1];
                        client.method2502(var55);
                        continue;
                    }
                    if (var412 == 1001) {
                        var5 -= 2;
                        var55.field2523 = field703[var5];
                        var55.field2515 = field703[var5 + 1];
                        client.method2502(var55);
                        continue;
                    }
                    if (var412 == 1003) {
                        var5--;
                        boolean var56 = field703[var5] == 1;
                        if (var55.field2619 != var56) {
                            var55.field2619 = var56;
                            client.method2502(var55);
                        }
                        continue;
                    }
                } else if (var412 >= 1100 && var412 < 1200 || var412 >= 2100 && var412 < 2200) {
                    class152 var57;
                    if (var412 >= 2000) {
                        var412 -= 1000;
                        var5--;
                        var57 = class152.method2301(field703[var5]);
                    } else {
                        var57 = var41 ? Statics.field186 : Statics.field603;
                    }
                    if (var412 == 1100) {
                        var5 -= 2;
                        var57.field2527 = field703[var5];
                        if (var57.field2527 > var57.field2529 - var57.field2523) {
                            var57.field2527 = var57.field2529 - var57.field2523;
                        }
                        if (var57.field2527 < 0) {
                            var57.field2527 = 0;
                        }
                        var57.field2574 = field703[var5 + 1];
                        if (var57.field2574 > var57.field2544 - var57.field2515) {
                            var57.field2574 = var57.field2544 - var57.field2515;
                        }
                        if (var57.field2574 < 0) {
                            var57.field2574 = 0;
                        }
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1101) {
                        var5--;
                        var57.field2543 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1102) {
                        var5--;
                        var57.field2535 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1103) {
                        var5--;
                        var57.field2536 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1104) {
                        var5--;
                        var57.field2537 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1105) {
                        var5--;
                        var57.field2538 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1106) {
                        var5--;
                        var57.field2540 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1107) {
                        var5--;
                        var57.field2541 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1108) {
                        var57.field2517 = 1;
                        var5--;
                        var57.field2504 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1109) {
                        var5 -= 6;
                        var57.field2519 = field703[var5];
                        var57.field2577 = field703[var5 + 1];
                        var57.field2554 = field703[var5 + 2];
                        var57.field2555 = field703[var5 + 3];
                        var57.field2588 = field703[var5 + 4];
                        var57.field2557 = field703[var5 + 5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1110) {
                        var5--;
                        int var58 = field703[var5];
                        if (var57.field2508 != var58) {
                            var57.field2508 = var58;
                            var57.field2568 = 0;
                            var57.field2621 = 0;
                            client.method2502(var57);
                        }
                        continue;
                    }
                    if (var412 == 1111) {
                        var5--;
                        var57.field2559 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1112) {
                        var6--;
                        String var59 = field706[var6];
                        if (!var59.equals(var57.field2561)) {
                            var57.field2561 = var59;
                            client.method2502(var57);
                        }
                        continue;
                    }
                    if (var412 == 1113) {
                        var5--;
                        var57.field2560 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1114) {
                        var5 -= 3;
                        var57.field2562 = field703[var5];
                        var57.field2565 = field703[var5 + 1];
                        var57.field2563 = field703[var5 + 2];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1115) {
                        var5--;
                        var57.field2547 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1116) {
                        var5--;
                        var57.field2587 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1117) {
                        var5--;
                        var57.field2546 = field703[var5];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1118) {
                        var5--;
                        var57.field2552 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1119) {
                        var5--;
                        var57.field2545 = field703[var5] == 1;
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1120) {
                        var5 -= 2;
                        var57.field2529 = field703[var5];
                        var57.field2544 = field703[var5 + 1];
                        client.method2502(var57);
                        continue;
                    }
                    if (var412 == 1121) {
                        int var60 = var57.field2514;
                        int var61 = var57.field2605;
                        client.field460.method2339(147);
                        client.field460.method2185(var61);
                        client.field460.method2157(var60);
                        client.field418 = var57;
                        client.method2502(var57);
                        continue;
                    }
                } else if (!(var412 < 1200 || var412 >= 1300) || !(var412 < 2200 || var412 >= 2300)) {
                    class152 var62;
                    if (var412 >= 2000) {
                        var412 -= 1000;
                        var5--;
                        var62 = class152.method2301(field703[var5]);
                    } else {
                        var62 = var41 ? Statics.field186 : Statics.field603;
                    }
                    client.method2502(var62);
                    if (var412 == 1200) {
                        var5 -= 2;
                        int var63 = field703[var5];
                        int var64 = field703[var5 + 1];
                        var62.field2524 = var63;
                        var62.field2528 = var64;
                        class45 var65 = class45.method1771(var63);
                        var62.field2554 = var65.field1055;
                        var62.field2555 = var65.field1019;
                        var62.field2588 = var65.field1020;
                        var62.field2519 = var65.field1004;
                        var62.field2577 = var65.field1022;
                        var62.field2557 = var65.field1017;
                        if (var62.field2523 > 0) {
                            var62.field2557 = var62.field2557 * 32 / var62.field2523;
                        }
                        continue;
                    }
                    if (var412 == 1201) {
                        var62.field2517 = 2;
                        var5--;
                        var62.field2504 = field703[var5];
                        continue;
                    }
                    if (var412 == 1202) {
                        var62.field2517 = 3;
                        var62.field2504 = Statics.field994.field32.method2875();
                        continue;
                    }
                } else if (var412 >= 1300 && var412 < 1400 || var412 >= 2300 && var412 < 2400) {
                    class152 var66;
                    if (var412 >= 2000) {
                        var412 -= 1000;
                        var5--;
                        var66 = class152.method2301(field703[var5]);
                    } else {
                        var66 = var41 ? Statics.field186 : Statics.field603;
                    }
                    if (var412 == 1300) {
                        var5--;
                        int var67 = field703[var5] - 1;
                        if (var67 >= 0 && var67 <= 9) {
                            var6--;
                            var66.method2818(var67, field706[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var412 == 1301) {
                        var5 -= 2;
                        int var68 = field703[var5];
                        int var69 = field703[var5 + 1];
                        var66.field2576 = class152.method456(var68, var69);
                        continue;
                    }
                    if (var412 == 1302) {
                        var5--;
                        var66.field2579 = field703[var5] == 1;
                        continue;
                    }
                    if (var412 == 1303) {
                        var5--;
                        var66.field2566 = field703[var5];
                        continue;
                    }
                    if (var412 == 1304) {
                        var5--;
                        var66.field2578 = field703[var5];
                        continue;
                    }
                    if (var412 == 1305) {
                        var6--;
                        var66.field2586 = field706[var6];
                        continue;
                    }
                    if (var412 == 1306) {
                        var6--;
                        var66.field2580 = field706[var6];
                        continue;
                    }
                    if (var412 == 1307) {
                        var66.field2595 = null;
                        continue;
                    }
                } else {
                    if (var412 >= 1400 && var412 < 1500 || var412 >= 2400 && var412 < 2500) {
                        class152 var70;
                        if (var412 >= 2000) {
                            var412 -= 1000;
                            var5--;
                            var70 = class152.method2301(field703[var5]);
                        } else {
                            var70 = var41 ? Statics.field186 : Statics.field603;
                        }
                        var6--;
                        String var71 = field706[var6];
                        int[] var72 = null;
                        if (var71.length() > 0 && var71.charAt(var71.length() - 1) == 'Y') {
                            var5--;
                            int var73 = field703[var5];
                            if (var73 > 0) {
                                var72 = new int[var73];
                                while (var73-- > 0) {
                                    var5--;
                                    var72[var73] = field703[var5];
                                }
                            }
                            var71 = var71.substring(0, var71.length() - 1);
                        }
                        Object[] var74 = new Object[var71.length() + 1];
                        for (int var75 = var74.length - 1; var75 >= 1; var75--) {
                            if (var71.charAt(var75 - 1) == 's') {
                                var6--;
                                var74[var75] = field706[var6];
                            } else {
                                var5--;
                                var74[var75] = Integer.valueOf(field703[var5]);
                            }
                        }
                        var5--;
                        int var76 = field703[var5];
                        if (var76 == -1) {
                            var74 = null;
                        } else {
                            var74[0] = Integer.valueOf(var76);
                        }
                        if (var412 == 1400) {
                            var70.field2583 = var74;
                        }
                        if (var412 == 1401) {
                            var70.field2542 = var74;
                        }
                        if (var412 == 1402) {
                            var70.field2585 = var74;
                        }
                        if (var412 == 1403) {
                            var70.field2564 = var74;
                        }
                        if (var412 == 1404) {
                            var70.field2589 = var74;
                        }
                        if (var412 == 1405) {
                            var70.field2590 = var74;
                        }
                        if (var412 == 1406) {
                            var70.field2593 = var74;
                        }
                        if (var412 == 1407) {
                            var70.field2613 = var74;
                            var70.field2598 = var72;
                        }
                        if (var412 == 1408) {
                            var70.field2600 = var74;
                        }
                        if (var412 == 1409) {
                            var70.field2601 = var74;
                        }
                        if (var412 == 1410) {
                            var70.field2591 = var74;
                        }
                        if (var412 == 1411) {
                            var70.field2507 = var74;
                        }
                        if (var412 == 1412) {
                            var70.field2553 = var74;
                        }
                        if (var412 == 1414) {
                            var70.field2596 = var74;
                            var70.field2597 = var72;
                        }
                        if (var412 == 1415) {
                            var70.field2606 = var74;
                            var70.field2567 = var72;
                        }
                        if (var412 == 1416) {
                            var70.field2592 = var74;
                        }
                        if (var412 == 1417) {
                            var70.field2602 = var74;
                        }
                        if (var412 == 1418) {
                            var70.field2603 = var74;
                        }
                        if (var412 == 1419) {
                            var70.field2604 = var74;
                        }
                        if (var412 == 1420) {
                            var70.field2516 = var74;
                        }
                        if (var412 == 1421) {
                            var70.field2525 = var74;
                        }
                        if (var412 == 1422) {
                            var70.field2607 = var74;
                        }
                        if (var412 == 1423) {
                            var70.field2608 = var74;
                        }
                        if (var412 == 1424) {
                            var70.field2609 = var74;
                        }
                        var70.field2624 = true;
                        continue;
                    }
                    if (var412 < 1600) {
                        class152 var77 = var41 ? Statics.field186 : Statics.field603;
                        if (var412 == 1500) {
                            field703[var5++] = var77.field2628;
                            continue;
                        }
                        if (var412 == 1501) {
                            field703[var5++] = var77.field2520;
                            continue;
                        }
                        if (var412 == 1502) {
                            field703[var5++] = var77.field2523;
                            continue;
                        }
                        if (var412 == 1503) {
                            field703[var5++] = var77.field2515;
                            continue;
                        }
                        if (var412 == 1504) {
                            field703[var5++] = var77.field2619 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 1505) {
                            field703[var5++] = var77.field2594;
                            continue;
                        }
                    } else if (var412 < 1700) {
                        class152 var78 = var41 ? Statics.field186 : Statics.field603;
                        if (var412 == 1600) {
                            field703[var5++] = var78.field2527;
                            continue;
                        }
                        if (var412 == 1601) {
                            field703[var5++] = var78.field2574;
                            continue;
                        }
                        if (var412 == 1602) {
                            field706[var6++] = var78.field2561;
                            continue;
                        }
                        if (var412 == 1603) {
                            field703[var5++] = var78.field2529;
                            continue;
                        }
                        if (var412 == 1604) {
                            field703[var5++] = var78.field2544;
                            continue;
                        }
                        if (var412 == 1605) {
                            field703[var5++] = var78.field2557;
                            continue;
                        }
                        if (var412 == 1606) {
                            field703[var5++] = var78.field2554;
                            continue;
                        }
                        if (var412 == 1607) {
                            field703[var5++] = var78.field2588;
                            continue;
                        }
                        if (var412 == 1608) {
                            field703[var5++] = var78.field2555;
                            continue;
                        }
                    } else if (var412 < 1800) {
                        class152 var79 = var41 ? Statics.field186 : Statics.field603;
                        if (var412 == 1700) {
                            field703[var5++] = var79.field2524;
                            continue;
                        }
                        if (var412 == 1701) {
                            if (var79.field2524 == -1) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = var79.field2528;
                            }
                            continue;
                        }
                        if (var412 == 1702) {
                            field703[var5++] = var79.field2605;
                            continue;
                        }
                    } else if (var412 < 1900) {
                        class152 var80 = var41 ? Statics.field186 : Statics.field603;
                        if (var412 == 1800) {
                            int[] var81 = field703;
                            int var82 = var5++;
                            int var83 = client.method3455(var80);
                            int var84 = var83 >> 11 & 0x3F;
                            var81[var82] = var84;
                            continue;
                        }
                        if (var412 == 1801) {
                            var5--;
                            int var85 = field703[var5];
                            int var413 = var85 - 1;
                            if (var80.field2595 != null && var413 < var80.field2595.length && var80.field2595[var413] != null) {
                                field706[var6++] = var80.field2595[var413];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 1802) {
                            if (var80.field2586 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var80.field2586;
                            }
                            continue;
                        }
                    } else if (var412 < 2600) {
                        var5--;
                        class152 var86 = class152.method2301(field703[var5]);
                        if (var412 == 2500) {
                            field703[var5++] = var86.field2628;
                            continue;
                        }
                        if (var412 == 2501) {
                            field703[var5++] = var86.field2520;
                            continue;
                        }
                        if (var412 == 2502) {
                            field703[var5++] = var86.field2523;
                            continue;
                        }
                        if (var412 == 2503) {
                            field703[var5++] = var86.field2515;
                            continue;
                        }
                        if (var412 == 2504) {
                            field703[var5++] = var86.field2619 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 2505) {
                            field703[var5++] = var86.field2594;
                            continue;
                        }
                    } else if (var412 < 2700) {
                        var5--;
                        class152 var87 = class152.method2301(field703[var5]);
                        if (var412 == 2600) {
                            field703[var5++] = var87.field2527;
                            continue;
                        }
                        if (var412 == 2601) {
                            field703[var5++] = var87.field2574;
                            continue;
                        }
                        if (var412 == 2602) {
                            field706[var6++] = var87.field2561;
                            continue;
                        }
                        if (var412 == 2603) {
                            field703[var5++] = var87.field2529;
                            continue;
                        }
                        if (var412 == 2604) {
                            field703[var5++] = var87.field2544;
                            continue;
                        }
                        if (var412 == 2605) {
                            field703[var5++] = var87.field2557;
                            continue;
                        }
                        if (var412 == 2606) {
                            field703[var5++] = var87.field2554;
                            continue;
                        }
                        if (var412 == 2607) {
                            field703[var5++] = var87.field2588;
                            continue;
                        }
                        if (var412 == 2608) {
                            field703[var5++] = var87.field2555;
                            continue;
                        }
                    } else if (var412 < 2800) {
                        if (var412 == 2700) {
                            var5--;
                            class152 var88 = class152.method2301(field703[var5]);
                            field703[var5++] = var88.field2524;
                            continue;
                        }
                        if (var412 == 2701) {
                            var5--;
                            class152 var89 = class152.method2301(field703[var5]);
                            if (var89.field2524 == -1) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = var89.field2528;
                            }
                            continue;
                        }
                        if (var412 == 2702) {
                            var5--;
                            int var90 = field703[var5];
                            class4 var91 = (class4) client.field415.method3138((long) var90);
                            if (var91 == null) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var412 < 2900) {
                        var5--;
                        class152 var92 = class152.method2301(field703[var5]);
                        if (var412 == 2800) {
                            int[] var93 = field703;
                            int var94 = var5++;
                            int var95 = client.method3455(var92);
                            int var96 = var95 >> 11 & 0x3F;
                            var93[var94] = var96;
                            continue;
                        }
                        if (var412 == 2801) {
                            var5--;
                            int var97 = field703[var5];
                            int var414 = var97 - 1;
                            if (var92.field2595 != null && var414 < var92.field2595.length && var92.field2595[var414] != null) {
                                field706[var6++] = var92.field2595[var414];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 2802) {
                            if (var92.field2586 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var92.field2586;
                            }
                            continue;
                        }
                    } else if (var412 < 3200) {
                        if (var412 == 3100) {
                            var6--;
                            String var98 = field706[var6];
                            class10.method9(0, "", var98);
                            continue;
                        }
                        if (var412 == 3101) {
                            var5 -= 2;
                            client.method146(Statics.field994, field703[var5], field703[var5 + 1]);
                            continue;
                        }
                        if (var412 == 3103) {
                            client.method71();
                            continue;
                        }
                        if (var412 == 3104) {
                            var6--;
                            String var99 = field706[var6];
                            int var100 = 0;
                            if (class199.method2375(var99)) {
                                var100 = class199.method33(var99);
                            }
                            client.field460.method2339(170);
                            client.field460.method2174(var100);
                            continue;
                        }
                        if (var412 == 3105) {
                            var6--;
                            String var101 = field706[var6];
                            client.field460.method2339(56);
                            client.field460.method2168(var101.length() + 1);
                            client.field460.method2255(var101);
                            continue;
                        }
                        if (var412 == 3106) {
                            var6--;
                            String var102 = field706[var6];
                            client.field460.method2339(158);
                            client.field460.method2168(var102.length() + 1);
                            client.field460.method2255(var102);
                            continue;
                        }
                        if (var412 == 3107) {
                            var5--;
                            int var103 = field703[var5];
                            var6--;
                            String var104 = field706[var6];
                            boolean var105 = false;
                            for (int var106 = 0; var106 < client.field373; var106++) {
                                class3 var107 = client.field310[client.field275[var106]];
                                if (var107 != null && var107.field35 != null && var107.field35.equalsIgnoreCase(var104)) {
                                    if (var103 == 1) {
                                        client.field460.method2339(80);
                                        client.field460.method2139(0);
                                        client.field460.method2162(client.field275[var106]);
                                    } else if (var103 == 4) {
                                        client.field460.method2339(160);
                                        client.field460.method2185(client.field275[var106]);
                                        client.field460.method2140(0);
                                    } else if (var103 == 6) {
                                        client.field460.method2339(137);
                                        client.field460.method2148(client.field275[var106]);
                                        client.field460.method2139(0);
                                    } else if (var103 == 7) {
                                        client.field460.method2339(12);
                                        client.field460.method2168(0);
                                        client.field460.method2162(client.field275[var106]);
                                    }
                                    var105 = true;
                                    break;
                                }
                            }
                            if (!var105) {
                                class10.method9(4, "", class142.field2267 + var104);
                            }
                            continue;
                        }
                        if (var412 == 3108) {
                            var5 -= 3;
                            int var108 = field703[var5];
                            int var109 = field703[var5 + 1];
                            int var110 = field703[var5 + 2];
                            class152 var111 = class152.method2301(var110);
                            client.method1961(var111, var108, var109);
                            continue;
                        }
                        if (var412 == 3109) {
                            var5 -= 2;
                            int var112 = field703[var5];
                            int var113 = field703[var5 + 1];
                            class152 var114 = var41 ? Statics.field186 : Statics.field603;
                            client.method1961(var114, var112, var113);
                            continue;
                        }
                        if (var412 == 3110) {
                            var5--;
                            Statics.field549 = field703[var5] == 1;
                            continue;
                        }
                        if (var412 == 3111) {
                            field703[var5++] = Statics.field1998.field137 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 3112) {
                            var5--;
                            Statics.field1998.field137 = field703[var5] == 1;
                            class9.method84();
                            continue;
                        }
                        if (var412 == 3113) {
                            var6--;
                            String var115 = field706[var6];
                            var5--;
                            boolean var116 = field703[var5] == 1;
                            class125.method2432(var115, var116, false);
                            continue;
                        }
                    } else if (var412 < 3300) {
                        if (var412 == 3200) {
                            var5 -= 3;
                            int var117 = field703[var5];
                            int var118 = field703[var5 + 1];
                            int var119 = field703[var5 + 2];
                            if (client.field488 != 0 && var118 != 0 && client.field490 < 50) {
                                client.field489[client.field490] = var117;
                                client.field480[client.field490] = var118;
                                client.field493[client.field490] = var119;
                                client.field293[client.field490] = null;
                                client.field494[client.field490] = 0;
                                client.field490++;
                            }
                            continue;
                        }
                        if (var412 == 3201) {
                            var5--;
                            int var120 = field703[var5];
                            if (var120 == -1 && !client.field487) {
                                Statics.field2703.method3035();
                                class161.field2704 = 1;
                                Statics.field1000 = null;
                            } else if (var120 != -1 && client.field486 != var120 && client.field346 != 0 && !client.field487) {
                                class161.method465(2, Statics.field2083, var120, 0, client.field346, false);
                            }
                            client.field486 = var120;
                            continue;
                        }
                        if (var412 == 3202) {
                            var5 -= 2;
                            client.method2053(field703[var5], field703[var5 + 1]);
                            continue;
                        }
                    } else if (var412 < 3400) {
                        if (var412 == 3300) {
                            field703[var5++] = client.field274;
                            continue;
                        }
                        if (var412 == 3301) {
                            var5 -= 2;
                            int var121 = field703[var5];
                            int var122 = field703[var5 + 1];
                            field703[var5++] = class14.method69(var121, var122);
                            continue;
                        }
                        if (var412 == 3302) {
                            var5 -= 2;
                            int var123 = field703[var5];
                            int var124 = field703[var5 + 1];
                            int[] var125 = field703;
                            int var126 = var5++;
                            class14 var127 = (class14) class14.field203.method3138((long) var123);
                            int var128;
                            if (var127 == null) {
                                var128 = 0;
                            } else if (var124 >= 0 && var124 < var127.field202.length) {
                                var128 = var127.field202[var124];
                            } else {
                                var128 = 0;
                            }
                            var125[var126] = var128;
                            continue;
                        }
                        if (var412 == 3303) {
                            var5 -= 2;
                            int var129 = field703[var5];
                            int var130 = field703[var5 + 1];
                            field703[var5++] = class14.method1967(var129, var130);
                            continue;
                        }
                        if (var412 == 3304) {
                            var5--;
                            int var131 = field703[var5];
                            int[] var132 = field703;
                            int var133 = var5++;
                            class44 var134 = (class44) class44.field993.method3099((long) var131);
                            class44 var135;
                            if (var134 == null) {
                                byte[] var136 = Statics.field995.method2668(5, var131);
                                class44 var137 = new class44();
                                if (var136 != null) {
                                    var137.method821(new class107(var136));
                                }
                                class44.field993.method3101(var137, (long) var131);
                                var135 = var137;
                            } else {
                                var135 = var134;
                            }
                            var132[var133] = var135.field1001;
                            continue;
                        }
                        if (var412 == 3305) {
                            var5--;
                            int var138 = field703[var5];
                            field703[var5++] = client.field383[var138];
                            continue;
                        }
                        if (var412 == 3306) {
                            var5--;
                            int var139 = field703[var5];
                            field703[var5++] = client.field392[var139];
                            continue;
                        }
                        if (var412 == 3307) {
                            var5--;
                            int var140 = field703[var5];
                            field703[var5++] = client.field291[var140];
                            continue;
                        }
                        if (var412 == 3308) {
                            int var141 = Statics.field221;
                            int var142 = (Statics.field994.field743 >> 7) + Statics.field304;
                            int var143 = (Statics.field994.field717 >> 7) + Statics.field671;
                            field703[var5++] = (var141 << 28) + (var142 << 14) + var143;
                            continue;
                        }
                        if (var412 == 3309) {
                            var5--;
                            int var144 = field703[var5];
                            field703[var5++] = var144 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var412 == 3310) {
                            var5--;
                            int var145 = field703[var5];
                            field703[var5++] = var145 >> 28;
                            continue;
                        }
                        if (var412 == 3311) {
                            var5--;
                            int var146 = field703[var5];
                            field703[var5++] = var146 & 0x3FFF;
                            continue;
                        }
                        if (var412 == 3312) {
                            field703[var5++] = client.field257 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 3313) {
                            var5 -= 2;
                            int var147 = field703[var5] + 32768;
                            int var148 = field703[var5 + 1];
                            field703[var5++] = class14.method69(var147, var148);
                            continue;
                        }
                        if (var412 == 3314) {
                            var5 -= 2;
                            int var149 = field703[var5] + 32768;
                            int var150 = field703[var5 + 1];
                            int[] var151 = field703;
                            int var152 = var5++;
                            class14 var153 = (class14) class14.field203.method3138((long) var149);
                            int var154;
                            if (var153 == null) {
                                var154 = 0;
                            } else if (var150 >= 0 && var150 < var153.field202.length) {
                                var154 = var153.field202[var150];
                            } else {
                                var154 = 0;
                            }
                            var151[var152] = var154;
                            continue;
                        }
                        if (var412 == 3315) {
                            var5 -= 2;
                            int var155 = field703[var5] + 32768;
                            int var156 = field703[var5 + 1];
                            field703[var5++] = class14.method1967(var155, var156);
                            continue;
                        }
                        if (var412 == 3316) {
                            if (client.field469 >= 2) {
                                field703[var5++] = client.field469;
                            } else {
                                field703[var5++] = 0;
                            }
                            continue;
                        }
                        if (var412 == 3317) {
                            field703[var5++] = client.field252;
                            continue;
                        }
                        if (var412 == 3318) {
                            field703[var5++] = client.field311;
                            continue;
                        }
                        if (var412 == 3321) {
                            field703[var5++] = client.field419;
                            continue;
                        }
                        if (var412 == 3322) {
                            field703[var5++] = client.field420;
                            continue;
                        }
                        if (var412 == 3323) {
                            if (client.field344) {
                                field703[var5++] = 1;
                            } else {
                                field703[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var412 < 3500) {
                        if (var412 == 3400) {
                            var5 -= 2;
                            int var157 = field703[var5];
                            int var158 = field703[var5 + 1];
                            class43 var159 = (class43) class43.field983.method3099((long) var157);
                            class43 var160;
                            if (var159 == null) {
                                byte[] var161 = Statics.field977.method2668(8, var157);
                                class43 var162 = new class43();
                                if (var161 != null) {
                                    var162.method811(new class107(var161));
                                }
                                class43.field983.method3101(var162, (long) var157);
                                var160 = var162;
                            } else {
                                var160 = var159;
                            }
                            class43 var163 = var160;
                            if (var160.field982 != 's') {
                            }
                            for (int var164 = 0; var164 < var163.field975; var164++) {
                                if (var163.field979[var164] == var158) {
                                    field706[var6++] = var163.field984[var164];
                                    var163 = null;
                                    break;
                                }
                            }
                            if (var163 != null) {
                                field706[var6++] = var163.field985;
                            }
                            continue;
                        }
                        if (var412 == 3408) {
                            var5 -= 4;
                            int var165 = field703[var5];
                            int var166 = field703[var5 + 1];
                            int var167 = field703[var5 + 2];
                            int var168 = field703[var5 + 3];
                            class43 var169 = (class43) class43.field983.method3099((long) var167);
                            class43 var170;
                            if (var169 == null) {
                                byte[] var171 = Statics.field977.method2668(8, var167);
                                class43 var172 = new class43();
                                if (var171 != null) {
                                    var172.method811(new class107(var171));
                                }
                                class43.field983.method3101(var172, (long) var167);
                                var170 = var172;
                            } else {
                                var170 = var169;
                            }
                            class43 var173 = var170;
                            if (var170.field989 == var165 && var170.field982 == var166) {
                                for (int var174 = 0; var174 < var173.field975; var174++) {
                                    if (var173.field979[var174] == var168) {
                                        if (var166 == 115) {
                                            field706[var6++] = var173.field984[var174];
                                        } else {
                                            field703[var5++] = var173.field978[var174];
                                        }
                                        var173 = null;
                                        break;
                                    }
                                }
                                if (var173 != null) {
                                    if (var166 == 115) {
                                        field706[var6++] = var173.field985;
                                    } else {
                                        field703[var5++] = var173.field980;
                                    }
                                }
                                continue;
                            }
                            if (var166 == 115) {
                                field706[var6++] = "null";
                            } else {
                                field703[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var412 < 3700) {
                        if (var412 == 3600) {
                            if (client.field503 == 0) {
                                field703[var5++] = -2;
                            } else if (client.field503 == 1) {
                                field703[var5++] = -1;
                            } else {
                                field703[var5++] = client.field502;
                            }
                            continue;
                        }
                        if (var412 == 3601) {
                            var5--;
                            int var175 = field703[var5];
                            if (client.field503 == 2 && var175 < client.field502) {
                                field706[var6++] = client.field504[var175].field236;
                                field706[var6++] = client.field504[var175].field226;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 3602) {
                            var5--;
                            int var176 = field703[var5];
                            if (client.field503 == 2 && var176 < client.field502) {
                                field703[var5++] = client.field504[var176].field227;
                                continue;
                            }
                            field703[var5++] = 0;
                            continue;
                        }
                        if (var412 == 3603) {
                            var5--;
                            int var177 = field703[var5];
                            if (client.field503 == 2 && var177 < client.field502) {
                                field703[var5++] = client.field504[var177].field228;
                                continue;
                            }
                            field703[var5++] = 0;
                            continue;
                        }
                        if (var412 == 3604) {
                            var6--;
                            String var178 = field706[var6];
                            var5--;
                            int var179 = field703[var5];
                            client.field460.method2339(202);
                            client.field460.method2168(class107.method634(var178) + 1);
                            client.field460.method2271(var179);
                            client.field460.method2255(var178);
                            continue;
                        }
                        if (var412 == 3605) {
                            var6--;
                            String var180 = field706[var6];
                            client.method160(var180);
                            continue;
                        }
                        if (var412 == 3606) {
                            var6--;
                            String var181 = field706[var6];
                            if (var181 == null) {
                                continue;
                            }
                            String var182 = class200.method3403(var181, Statics.field256);
                            if (var182 == null) {
                                continue;
                            }
                            int var183 = 0;
                            while (true) {
                                if (var183 >= client.field502) {
                                    continue label2500;
                                }
                                class16 var184 = client.field504[var183];
                                String var185 = var184.field236;
                                String var186 = class200.method3403(var185, Statics.field256);
                                boolean var187;
                                if (var181 == null || var185 == null) {
                                    var187 = false;
                                } else if (var181.startsWith("#") || var185.startsWith("#")) {
                                    var187 = var181.equals(var185);
                                } else {
                                    var187 = var182.equals(var186);
                                }
                                if (var187) {
                                    client.field502--;
                                    for (int var188 = var183; var188 < client.field502; var188++) {
                                        client.field504[var188] = client.field504[var188 + 1];
                                    }
                                    client.field458 = client.field268;
                                    client.field460.method2339(83);
                                    client.field460.method2168(class107.method634(var181));
                                    client.field460.method2255(var181);
                                    continue label2500;
                                }
                                var183++;
                            }
                        }
                        if (var412 == 3607) {
                            var6--;
                            String var189 = field706[var6];
                            if (var189 == null) {
                                continue;
                            }
                            if ((client.field506 < 100 || client.field467 == 1) && client.field506 < 400) {
                                String var190 = class200.method3403(var189, Statics.field256);
                                if (var190 == null) {
                                    continue;
                                }
                                for (int var191 = 0; var191 < client.field506; var191++) {
                                    class8 var192 = client.field278[var191];
                                    String var193 = class200.method3403(var192.field130, Statics.field256);
                                    if (var193 != null && var193.equals(var190)) {
                                        class10.method9(31, "", var189 + class142.field2287);
                                        continue label2500;
                                    }
                                    if (var192.field131 != null) {
                                        String var194 = class200.method3403(var192.field131, Statics.field256);
                                        if (var194 != null && var194.equals(var190)) {
                                            class10.method9(31, "", var189 + class142.field2287);
                                            continue label2500;
                                        }
                                    }
                                }
                                for (int var195 = 0; var195 < client.field502; var195++) {
                                    class16 var196 = client.field504[var195];
                                    String var197 = class200.method3403(var196.field236, Statics.field256);
                                    if (var197 != null && var197.equals(var190)) {
                                        class10.method9(31, "", class142.field2292 + var189 + class142.field2219);
                                        continue label2500;
                                    }
                                    if (var196.field226 != null) {
                                        String var198 = class200.method3403(var196.field226, Statics.field256);
                                        if (var198 != null && var198.equals(var190)) {
                                            class10.method9(31, "", class142.field2292 + var189 + class142.field2219);
                                            continue label2500;
                                        }
                                    }
                                }
                                if (class200.method3403(Statics.field994.field35, Statics.field256).equals(var190)) {
                                    class10.method9(31, "", class142.field2289);
                                } else {
                                    client.field460.method2339(69);
                                    client.field460.method2168(class107.method634(var189));
                                    client.field460.method2255(var189);
                                }
                                continue;
                            }
                            class10.method9(31, "", class142.field2286);
                            continue;
                        }
                        if (var412 == 3608) {
                            var6--;
                            String var199 = field706[var6];
                            if (var199 == null) {
                                continue;
                            }
                            String var200 = class200.method3403(var199, Statics.field256);
                            if (var200 == null) {
                                continue;
                            }
                            int var201 = 0;
                            while (true) {
                                if (var201 >= client.field506) {
                                    continue label2500;
                                }
                                class8 var202 = client.field278[var201];
                                String var203 = var202.field130;
                                String var204 = class200.method3403(var203, Statics.field256);
                                boolean var205;
                                if (var199 == null || var203 == null) {
                                    var205 = false;
                                } else if (var199.startsWith("#") || var203.startsWith("#")) {
                                    var205 = var199.equals(var203);
                                } else {
                                    var205 = var200.equals(var204);
                                }
                                if (var205) {
                                    client.field506--;
                                    for (int var206 = var201; var206 < client.field506; var206++) {
                                        client.field278[var206] = client.field278[var206 + 1];
                                    }
                                    client.field458 = client.field268;
                                    client.field460.method2339(6);
                                    client.field460.method2168(class107.method634(var199));
                                    client.field460.method2255(var199);
                                    continue label2500;
                                }
                                var201++;
                            }
                        }
                        if (var412 == 3609) {
                            var6--;
                            String var207 = field706[var6];
                            if (var207.startsWith(class2.method468(0)) || var207.startsWith(class2.method468(1))) {
                                var207 = var207.substring(7);
                            }
                            field703[var5++] = Statics.method2050(var207, false) ? 1 : 0;
                            continue;
                        }
                        if (var412 == 3611) {
                            if (client.field475 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = class198.method2855(client.field475);
                            }
                            continue;
                        }
                        if (var412 == 3612) {
                            if (client.field475 == null) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = Statics.field2640;
                            }
                            continue;
                        }
                        if (var412 == 3613) {
                            var5--;
                            int var208 = field703[var5];
                            if (client.field475 != null && var208 < Statics.field2640) {
                                field706[var6++] = Statics.field1685[var208].field552;
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 3614) {
                            var5--;
                            int var209 = field703[var5];
                            if (client.field475 != null && var209 < Statics.field2640) {
                                field703[var5++] = Statics.field1685[var209].field554;
                                continue;
                            }
                            field703[var5++] = 0;
                            continue;
                        }
                        if (var412 == 3615) {
                            var5--;
                            int var210 = field703[var5];
                            if (client.field475 != null && var210 < Statics.field2640) {
                                field703[var5++] = Statics.field1685[var210].field558;
                                continue;
                            }
                            field703[var5++] = 0;
                            continue;
                        }
                        if (var412 == 3616) {
                            field703[var5++] = Statics.field687;
                            continue;
                        }
                        if (var412 == 3617) {
                            var6--;
                            String var211 = field706[var6];
                            client.method2849(var211);
                            continue;
                        }
                        if (var412 == 3618) {
                            field703[var5++] = Statics.field780;
                            continue;
                        }
                        if (var412 == 3619) {
                            var6--;
                            String var212 = field706[var6];
                            if (!var212.equals("")) {
                                client.field460.method2339(37);
                                client.field460.method2168(class107.method634(var212));
                                client.field460.method2255(var212);
                            }
                            continue;
                        }
                        if (var412 == 3620) {
                            client.field460.method2339(37);
                            client.field460.method2168(0);
                            continue;
                        }
                        if (var412 == 3621) {
                            if (client.field503 == 0) {
                                field703[var5++] = -1;
                            } else {
                                field703[var5++] = client.field506;
                            }
                            continue;
                        }
                        if (var412 == 3622) {
                            var5--;
                            int var213 = field703[var5];
                            if (client.field503 != 0 && var213 < client.field506) {
                                field706[var6++] = client.field278[var213].field130;
                                field706[var6++] = client.field278[var213].field131;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 3623) {
                            var6--;
                            String var214 = field706[var6];
                            if (var214.startsWith(class2.method468(0)) || var214.startsWith(class2.method468(1))) {
                                var214 = var214.substring(7);
                            }
                            field703[var5++] = client.method795(var214) ? 1 : 0;
                            continue;
                        }
                        if (var412 == 3624) {
                            var5--;
                            int var215 = field703[var5];
                            if (Statics.field1685 != null && var215 < Statics.field2640 && Statics.field1685[var215].field552.equalsIgnoreCase(Statics.field994.field35)) {
                                field703[var5++] = 1;
                                continue;
                            }
                            field703[var5++] = 0;
                            continue;
                        }
                        if (var412 == 3625) {
                            if (client.field476 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = class198.method2855(client.field476);
                            }
                            continue;
                        }
                    } else if (var412 < 4100) {
                        if (var412 == 4000) {
                            var5 -= 2;
                            int var216 = field703[var5];
                            int var217 = field703[var5 + 1];
                            field703[var5++] = var216 + var217;
                            continue;
                        }
                        if (var412 == 4001) {
                            var5 -= 2;
                            int var218 = field703[var5];
                            int var219 = field703[var5 + 1];
                            field703[var5++] = var218 - var219;
                            continue;
                        }
                        if (var412 == 4002) {
                            var5 -= 2;
                            int var220 = field703[var5];
                            int var221 = field703[var5 + 1];
                            field703[var5++] = var220 * var221;
                            continue;
                        }
                        if (var412 == 4003) {
                            var5 -= 2;
                            int var222 = field703[var5];
                            int var223 = field703[var5 + 1];
                            field703[var5++] = var222 / var223;
                            continue;
                        }
                        if (var412 == 4004) {
                            var5--;
                            int var224 = field703[var5];
                            field703[var5++] = (int) (Math.random() * (double) var224);
                            continue;
                        }
                        if (var412 == 4005) {
                            var5--;
                            int var225 = field703[var5];
                            field703[var5++] = (int) (Math.random() * (double) (var225 + 1));
                            continue;
                        }
                        if (var412 == 4006) {
                            var5 -= 5;
                            int var226 = field703[var5];
                            int var227 = field703[var5 + 1];
                            int var228 = field703[var5 + 2];
                            int var229 = field703[var5 + 3];
                            int var230 = field703[var5 + 4];
                            field703[var5++] = (var227 - var226) * (var230 - var228) / (var229 - var228) + var226;
                            continue;
                        }
                        if (var412 == 4007) {
                            var5 -= 2;
                            int var231 = field703[var5];
                            int var232 = field703[var5 + 1];
                            field703[var5++] = var231 * var232 / 100 + var231;
                            continue;
                        }
                        if (var412 == 4008) {
                            var5 -= 2;
                            int var233 = field703[var5];
                            int var234 = field703[var5 + 1];
                            field703[var5++] = var233 | 0x1 << var234;
                            continue;
                        }
                        if (var412 == 4009) {
                            var5 -= 2;
                            int var235 = field703[var5];
                            int var236 = field703[var5 + 1];
                            field703[var5++] = var235 & -1 - (0x1 << var236);
                            continue;
                        }
                        if (var412 == 4010) {
                            var5 -= 2;
                            int var237 = field703[var5];
                            int var238 = field703[var5 + 1];
                            field703[var5++] = (var237 & 0x1 << var238) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var412 == 4011) {
                            var5 -= 2;
                            int var239 = field703[var5];
                            int var240 = field703[var5 + 1];
                            field703[var5++] = var239 % var240;
                            continue;
                        }
                        if (var412 == 4012) {
                            var5 -= 2;
                            int var241 = field703[var5];
                            int var242 = field703[var5 + 1];
                            if (var241 == 0) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = (int) Math.pow((double) var241, (double) var242);
                            }
                            continue;
                        }
                        if (var412 == 4013) {
                            var5 -= 2;
                            int var243 = field703[var5];
                            int var244 = field703[var5 + 1];
                            if (var243 == 0) {
                                field703[var5++] = 0;
                            } else if (var244 == 0) {
                                field703[var5++] = Integer.MAX_VALUE;
                            } else {
                                field703[var5++] = (int) Math.pow((double) var243, 1.0D / (double) var244);
                            }
                            continue;
                        }
                        if (var412 == 4014) {
                            var5 -= 2;
                            int var245 = field703[var5];
                            int var246 = field703[var5 + 1];
                            field703[var5++] = var245 & var246;
                            continue;
                        }
                        if (var412 == 4015) {
                            var5 -= 2;
                            int var247 = field703[var5];
                            int var248 = field703[var5 + 1];
                            field703[var5++] = var247 | var248;
                            continue;
                        }
                    } else if (var412 < 4200) {
                        if (var412 == 4100) {
                            var6--;
                            String var249 = field706[var6];
                            var5--;
                            int var250 = field703[var5];
                            field706[var6++] = var249 + var250;
                            continue;
                        }
                        if (var412 == 4101) {
                            var6 -= 2;
                            String var251 = field706[var6];
                            String var252 = field706[var6 + 1];
                            field706[var6++] = var251 + var252;
                            continue;
                        }
                        if (var412 == 4102) {
                            var6--;
                            String var253 = field706[var6];
                            var5--;
                            int var254 = field703[var5];
                            String[] var255 = field706;
                            int var256 = var6++;
                            String var258;
                            if (var254 < 0) {
                                var258 = Integer.toString(var254);
                            } else {
                                int var259 = var254;
                                String var260;
                                if (var254 < 0) {
                                    var260 = Integer.toString(var254, 10);
                                } else {
                                    int var261 = 2;
                                    int var262 = var254 / 10;
                                    while (var262 != 0) {
                                        var262 /= 10;
                                        var261++;
                                    }
                                    char[] var263 = new char[var261];
                                    var263[0] = '+';
                                    for (int var264 = var261 - 1; var264 > 0; var264--) {
                                        int var265 = var259;
                                        var259 /= 10;
                                        int var266 = var265 - var259 * 10;
                                        if (var266 >= 10) {
                                            var263[var264] = (char) (var266 + 87);
                                        } else {
                                            var263[var264] = (char) (var266 + 48);
                                        }
                                    }
                                    var260 = new String(var263);
                                }
                                var258 = var260;
                            }
                            var255[var256] = var253 + var258;
                            continue;
                        }
                        if (var412 == 4103) {
                            var6--;
                            String var267 = field706[var6];
                            field706[var6++] = var267.toLowerCase();
                            continue;
                        }
                        if (var412 == 4104) {
                            var5--;
                            int var268 = field703[var5];
                            long var269 = ((long) var268 + 11745L) * 86400000L;
                            field707.setTime(new Date(var269));
                            int var271 = field707.get(5);
                            int var272 = field707.get(2);
                            int var273 = field707.get(1);
                            field706[var6++] = var271 + "-" + field711[var272] + "-" + var273;
                            continue;
                        }
                        if (var412 == 4105) {
                            var6 -= 2;
                            String var274 = field706[var6];
                            String var275 = field706[var6 + 1];
                            if (Statics.field994.field32 != null && Statics.field994.field32.field2663) {
                                field706[var6++] = var275;
                                continue;
                            }
                            field706[var6++] = var274;
                            continue;
                        }
                        if (var412 == 4106) {
                            var5--;
                            int var276 = field703[var5];
                            field706[var6++] = Integer.toString(var276);
                            continue;
                        }
                        if (var412 == 4107) {
                            var6 -= 2;
                            int[] var277 = field703;
                            int var278 = var5++;
                            String var279 = field706[var6];
                            String var280 = field706[var6 + 1];
                            int var281 = client.field367;
                            int var282 = var279.length();
                            int var283 = var280.length();
                            int var284 = 0;
                            int var285 = 0;
                            char var286 = 0;
                            byte var287 = 0;
                            int var288;
                            label2324: while (true) {
                                if (var284 - var286 >= var282 && var285 - var287 >= var283) {
                                    int var298 = Math.min(var282, var283);
                                    for (int var299 = 0; var299 < var298; var299++) {
                                        char var302 = var279.charAt(var299);
                                        char var303 = var280.charAt(var299);
                                        if (var302 != var303 && Character.toUpperCase(var302) != Character.toUpperCase(var303)) {
                                            char var304 = Character.toLowerCase(var302);
                                            char var305 = Character.toLowerCase(var303);
                                            if (var304 != var305) {
                                                var288 = class202.method489(var304, var281) - class202.method489(var305, var281);
                                                break label2324;
                                            }
                                        }
                                    }
                                    int var306 = var282 - var283;
                                    if (var306 == 0) {
                                        for (int var307 = 0; var307 < var298; var307++) {
                                            char var308 = var279.charAt(var307);
                                            char var309 = var280.charAt(var307);
                                            if (var308 != var309) {
                                                var288 = class202.method489(var308, var281) - class202.method489(var309, var281);
                                                break label2324;
                                            }
                                        }
                                        var288 = 0;
                                    } else {
                                        var288 = var306;
                                    }
                                    break;
                                }
                                if (var284 - var286 >= var282) {
                                    var288 = -1;
                                    break;
                                }
                                if (var285 - var287 >= var283) {
                                    var288 = 1;
                                    break;
                                }
                                char var289;
                                if (var286 == 0) {
                                    var289 = var279.charAt(var284++);
                                } else {
                                    var289 = var286;
                                    boolean var290 = false;
                                }
                                char var291;
                                if (var287 == 0) {
                                    var291 = var280.charAt(var285++);
                                } else {
                                    var291 = (char) var287;
                                    boolean var292 = false;
                                }
                                var286 = class202.method161(var289);
                                byte var293;
                                if (var291 == 198) {
                                    var293 = 69;
                                } else if (var291 == 230) {
                                    var293 = 101;
                                } else if (var291 == 223) {
                                    var293 = 115;
                                } else if (var291 == 338) {
                                    var293 = 69;
                                } else if (var291 == 339) {
                                    var293 = 101;
                                } else {
                                    var293 = 0;
                                }
                                var287 = var293;
                                char var294 = class202.method2417(var289, var281);
                                char var295 = class202.method2417(var291, var281);
                                if (var294 != var295 && Character.toUpperCase(var294) != Character.toUpperCase(var295)) {
                                    char var296 = Character.toLowerCase(var294);
                                    char var297 = Character.toLowerCase(var295);
                                    if (var296 != var297) {
                                        var288 = class202.method489(var296, var281) - class202.method489(var297, var281);
                                        break;
                                    }
                                }
                            }
                            byte var311;
                            if (var288 > 0) {
                                var311 = 1;
                            } else if (var288 < 0) {
                                var311 = -1;
                            } else {
                                var311 = 0;
                            }
                            var277[var278] = var311;
                            continue;
                        }
                        if (var412 == 4108) {
                            var6--;
                            String var312 = field706[var6];
                            var5 -= 2;
                            int var313 = field703[var5];
                            int var314 = field703[var5 + 1];
                            byte[] var315 = Statics.field70.method2668(var314, 0);
                            class193 var316 = new class193(var315);
                            field703[var5++] = var316.method3300(var312, var313);
                            continue;
                        }
                        if (var412 == 4109) {
                            var6--;
                            String var317 = field706[var6];
                            var5 -= 2;
                            int var318 = field703[var5];
                            int var319 = field703[var5 + 1];
                            byte[] var320 = Statics.field70.method2668(var319, 0);
                            class193 var321 = new class193(var320);
                            field703[var5++] = var321.method3299(var317, var318);
                            continue;
                        }
                        if (var412 == 4110) {
                            var6 -= 2;
                            String var322 = field706[var6];
                            String var323 = field706[var6 + 1];
                            var5--;
                            if (field703[var5] == 1) {
                                field706[var6++] = var322;
                            } else {
                                field706[var6++] = var323;
                            }
                            continue;
                        }
                        if (var412 == 4111) {
                            var6--;
                            String var324 = field706[var6];
                            field706[var6++] = class192.method3301(var324);
                            continue;
                        }
                        if (var412 == 4112) {
                            var6--;
                            String var325 = field706[var6];
                            var5--;
                            int var326 = field703[var5];
                            field706[var6++] = var325 + (char) var326;
                            continue;
                        }
                        if (var412 == 4113) {
                            var5--;
                            int var327 = field703[var5];
                            int[] var328 = field703;
                            int var329 = var5++;
                            char var330 = (char) var327;
                            boolean var331;
                            if (var330 >= ' ' && var330 <= '~') {
                                var331 = true;
                            } else if (var330 >= 160 && var330 <= 255) {
                                var331 = true;
                            } else if (var330 == 8364 || var330 == 338 || var330 == 8212 || var330 == 339 || var330 == 376) {
                                var331 = true;
                            } else {
                                var331 = false;
                            }
                            var328[var329] = var331 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 4114) {
                            var5--;
                            int var332 = field703[var5];
                            field703[var5++] = class199.method1881((char) var332) ? 1 : 0;
                            continue;
                        }
                        if (var412 == 4115) {
                            var5--;
                            int var333 = field703[var5];
                            int[] var334 = field703;
                            int var335 = var5++;
                            char var336 = (char) var333;
                            boolean var337 = var336 >= 'A' && var336 <= 'Z' || var336 >= 'a' && var336 <= 'z';
                            var334[var335] = var337 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 4116) {
                            var5--;
                            int var338 = field703[var5];
                            int[] var339 = field703;
                            int var340 = var5++;
                            char var341 = (char) var338;
                            boolean var342 = var341 >= '0' && var341 <= '9';
                            var339[var340] = var342 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 4117) {
                            var6--;
                            String var343 = field706[var6];
                            if (var343 == null) {
                                field703[var5++] = 0;
                            } else {
                                field703[var5++] = var343.length();
                            }
                            continue;
                        }
                        if (var412 == 4118) {
                            var6--;
                            String var344 = field706[var6];
                            var5 -= 2;
                            int var345 = field703[var5];
                            int var346 = field703[var5 + 1];
                            field706[var6++] = var344.substring(var345, var346);
                            continue;
                        }
                        if (var412 == 4119) {
                            var6--;
                            String var347 = field706[var6];
                            StringBuilder var348 = new StringBuilder(var347.length());
                            boolean var349 = false;
                            for (int var350 = 0; var350 < var347.length(); var350++) {
                                char var351 = var347.charAt(var350);
                                if (var351 == '<') {
                                    var349 = true;
                                } else if (var351 == '>') {
                                    var349 = false;
                                } else if (!var349) {
                                    var348.append(var351);
                                }
                            }
                            field706[var6++] = var348.toString();
                            continue;
                        }
                        if (var412 == 4120) {
                            var6--;
                            String var352 = field706[var6];
                            var5--;
                            int var353 = field703[var5];
                            field703[var5++] = var352.indexOf(var353);
                            continue;
                        }
                        if (var412 == 4121) {
                            var6 -= 2;
                            String var354 = field706[var6];
                            String var355 = field706[var6 + 1];
                            var5--;
                            int var356 = field703[var5];
                            field703[var5++] = var354.indexOf(var355, var356);
                            continue;
                        }
                    } else if (var412 < 4300) {
                        if (var412 == 4200) {
                            var5--;
                            int var357 = field703[var5];
                            field706[var6++] = class45.method1771(var357).field1012;
                            continue;
                        }
                        if (var412 == 4201) {
                            var5 -= 2;
                            int var358 = field703[var5];
                            int var359 = field703[var5 + 1];
                            class45 var360 = class45.method1771(var358);
                            if (var359 >= 1 && var359 <= 5 && var360.field1006[var359 - 1] != null) {
                                field706[var6++] = var360.field1006[var359 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 4202) {
                            var5 -= 2;
                            int var361 = field703[var5];
                            int var362 = field703[var5 + 1];
                            class45 var363 = class45.method1771(var361);
                            if (var362 >= 1 && var362 <= 5 && var363.field1034[var362 - 1] != null) {
                                field706[var6++] = var363.field1034[var362 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var412 == 4203) {
                            var5--;
                            int var364 = field703[var5];
                            field703[var5++] = class45.method1771(var364).field1024;
                            continue;
                        }
                        if (var412 == 4204) {
                            var5--;
                            int var365 = field703[var5];
                            field703[var5++] = class45.method1771(var365).field1023 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var412 == 4205) {
                            var5--;
                            int var366 = field703[var5];
                            class45 var367 = class45.method1771(var366);
                            if (var367.field1021 == -1 && var367.field1042 >= 0) {
                                field703[var5++] = var367.field1042;
                                continue;
                            }
                            field703[var5++] = var366;
                            continue;
                        }
                        if (var412 == 4206) {
                            var5--;
                            int var368 = field703[var5];
                            class45 var369 = class45.method1771(var368);
                            if (var369.field1021 >= 0 && var369.field1042 >= 0) {
                                field703[var5++] = var369.field1042;
                                continue;
                            }
                            field703[var5++] = var368;
                            continue;
                        }
                        if (var412 == 4207) {
                            var5--;
                            int var370 = field703[var5];
                            field703[var5++] = class45.method1771(var370).field1025 ? 1 : 0;
                            continue;
                        }
                    } else if (var412 < 5100) {
                        if (var412 == 5000) {
                            field703[var5++] = client.field372;
                            continue;
                        }
                        if (var412 == 5001) {
                            var5 -= 3;
                            client.field372 = field703[var5];
                            int var371 = field703[var5 + 1];
                            class117[] var372 = new class117[] { class117.field1887, class117.field1885, class117.field1889 };
                            class117[] var373 = var372;
                            int var374 = 0;
                            class117 var376;
                            while (true) {
                                if (var374 >= var373.length) {
                                    var376 = null;
                                    break;
                                }
                                class117 var375 = var373[var374];
                                if (var375.field1886 == var371) {
                                    var376 = var375;
                                    break;
                                }
                                var374++;
                            }
                            Statics.field1646 = var376;
                            if (Statics.field1646 == null) {
                                Statics.field1646 = class117.field1885;
                            }
                            client.field468 = field703[var5 + 2];
                            client.field460.method2339(103);
                            client.field460.method2168(client.field372);
                            client.field460.method2168(Statics.field1646.field1886);
                            client.field460.method2168(client.field468);
                            continue;
                        }
                        if (var412 == 5002) {
                            var6--;
                            String var377 = field706[var6];
                            var5 -= 2;
                            int var378 = field703[var5];
                            int var379 = field703[var5 + 1];
                            client.field460.method2339(151);
                            client.field460.method2168(class107.method634(var377) + 2);
                            client.field460.method2255(var377);
                            client.field460.method2168(var378 - 1);
                            client.field460.method2168(var379);
                            continue;
                        }
                        if (var412 == 5003) {
                            var5 -= 2;
                            int var380 = field703[var5];
                            int var381 = field703[var5 + 1];
                            class24 var382 = (class24) class10.field156.get(var380);
                            class31 var383 = var382.method513(var381);
                            if (var383 == null) {
                                field703[var5++] = -1;
                                field703[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field703[var5++] = var383.field689;
                                field703[var5++] = var383.field690;
                                field706[var6++] = var383.field692 == null ? "" : var383.field692;
                                field706[var6++] = var383.field695 == null ? "" : var383.field695;
                                field706[var6++] = var383.field694 == null ? "" : var383.field694;
                            }
                            continue;
                        }
                        if (var412 == 5004) {
                            var5--;
                            int var385 = field703[var5];
                            class31 var386 = class10.method2055(var385);
                            if (var386 == null) {
                                field703[var5++] = -1;
                                field703[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field703[var5++] = var386.field691;
                                field703[var5++] = var386.field690;
                                field706[var6++] = var386.field692 == null ? "" : var386.field692;
                                field706[var6++] = var386.field695 == null ? "" : var386.field695;
                                field706[var6++] = var386.field694 == null ? "" : var386.field694;
                            }
                            continue;
                        }
                        if (var412 == 5005) {
                            if (Statics.field1646 == null) {
                                field703[var5++] = -1;
                            } else {
                                field703[var5++] = Statics.field1646.field1886;
                            }
                            continue;
                        }
                        if (var412 == 5008) {
                            var6--;
                            String var387 = field706[var6];
                            var5--;
                            int var388 = field703[var5];
                            String var389 = var387.toLowerCase();
                            byte var390 = 0;
                            if (var389.startsWith(class142.field2349)) {
                                var390 = 0;
                                var387 = var387.substring(class142.field2349.length());
                            } else if (var389.startsWith(class142.field2170)) {
                                var390 = 1;
                                var387 = var387.substring(class142.field2170.length());
                            } else if (var389.startsWith(class142.field2298)) {
                                var390 = 2;
                                var387 = var387.substring(class142.field2298.length());
                            } else if (var389.startsWith(class142.field2172)) {
                                var390 = 3;
                                var387 = var387.substring(class142.field2172.length());
                            } else if (var389.startsWith(class142.field2302)) {
                                var390 = 4;
                                var387 = var387.substring(class142.field2302.length());
                            } else if (var389.startsWith(class142.field2293)) {
                                var390 = 5;
                                var387 = var387.substring(class142.field2293.length());
                            } else if (var389.startsWith(class142.field2259)) {
                                var390 = 6;
                                var387 = var387.substring(class142.field2259.length());
                            } else if (var389.startsWith(class142.field2224)) {
                                var390 = 7;
                                var387 = var387.substring(class142.field2224.length());
                            } else if (var389.startsWith(class142.field2310)) {
                                var390 = 8;
                                var387 = var387.substring(class142.field2310.length());
                            } else if (var389.startsWith(class142.field2143)) {
                                var390 = 9;
                                var387 = var387.substring(class142.field2143.length());
                            } else if (var389.startsWith(class142.field2173)) {
                                var390 = 10;
                                var387 = var387.substring(class142.field2173.length());
                            } else if (var389.startsWith(class142.field2223)) {
                                var390 = 11;
                                var387 = var387.substring(class142.field2223.length());
                            } else if (client.field367 != 0) {
                                if (var389.startsWith(class142.field2296)) {
                                    var390 = 0;
                                    var387 = var387.substring(class142.field2296.length());
                                } else if (var389.startsWith(class142.field2312)) {
                                    var390 = 1;
                                    var387 = var387.substring(class142.field2312.length());
                                } else if (var389.startsWith(class142.field2299)) {
                                    var390 = 2;
                                    var387 = var387.substring(class142.field2299.length());
                                } else if (var389.startsWith(class142.field2301)) {
                                    var390 = 3;
                                    var387 = var387.substring(class142.field2301.length());
                                } else if (var389.startsWith(class142.field2303)) {
                                    var390 = 4;
                                    var387 = var387.substring(class142.field2303.length());
                                } else if (var389.startsWith(class142.field2305)) {
                                    var390 = 5;
                                    var387 = var387.substring(class142.field2305.length());
                                } else if (var389.startsWith(class142.field2307)) {
                                    var390 = 6;
                                    var387 = var387.substring(class142.field2307.length());
                                } else if (var389.startsWith(class142.field2309)) {
                                    var390 = 7;
                                    var387 = var387.substring(class142.field2309.length());
                                } else if (var389.startsWith(class142.field2337)) {
                                    var390 = 8;
                                    var387 = var387.substring(class142.field2337.length());
                                } else if (var389.startsWith(class142.field2313)) {
                                    var390 = 9;
                                    var387 = var387.substring(class142.field2313.length());
                                } else if (var389.startsWith(class142.field2315)) {
                                    var390 = 10;
                                    var387 = var387.substring(class142.field2315.length());
                                } else if (var389.startsWith(class142.field2317)) {
                                    var390 = 11;
                                    var387 = var387.substring(class142.field2317.length());
                                }
                            }
                            String var391 = var387.toLowerCase();
                            byte var392 = 0;
                            if (var391.startsWith(class142.field2324)) {
                                var392 = 1;
                                var387 = var387.substring(class142.field2324.length());
                            } else if (var391.startsWith(class142.field2320)) {
                                var392 = 2;
                                var387 = var387.substring(class142.field2320.length());
                            } else if (var391.startsWith(class142.field2322)) {
                                var392 = 3;
                                var387 = var387.substring(class142.field2322.length());
                            } else if (var391.startsWith(class142.field2174)) {
                                var392 = 4;
                                var387 = var387.substring(class142.field2174.length());
                            } else if (var391.startsWith(class142.field2132)) {
                                var392 = 5;
                                var387 = var387.substring(class142.field2132.length());
                            } else if (client.field367 != 0) {
                                if (var391.startsWith(class142.field2319)) {
                                    var392 = 1;
                                    var387 = var387.substring(class142.field2319.length());
                                } else if (var391.startsWith(class142.field2321)) {
                                    var392 = 2;
                                    var387 = var387.substring(class142.field2321.length());
                                } else if (var391.startsWith(class142.field2323)) {
                                    var392 = 3;
                                    var387 = var387.substring(class142.field2323.length());
                                } else if (var391.startsWith(class142.field2325)) {
                                    var392 = 4;
                                    var387 = var387.substring(class142.field2325.length());
                                } else if (var391.startsWith(class142.field2250)) {
                                    var392 = 5;
                                    var387 = var387.substring(class142.field2250.length());
                                }
                            }
                            client.field460.method2339(89);
                            client.field460.method2168(0);
                            int var393 = client.field460.field1827;
                            client.field460.method2168(var388);
                            client.field460.method2168(var390);
                            client.field460.method2168(var392);
                            class191.method761(client.field460, var387);
                            client.field460.method2115(client.field460.field1827 - var393);
                            continue;
                        }
                        if (var412 == 5009) {
                            var6 -= 2;
                            String var394 = field706[var6];
                            String var395 = field706[var6 + 1];
                            client.field460.method2339(122);
                            client.field460.method2185(0);
                            int var396 = client.field460.field1827;
                            client.field460.method2255(var394);
                            class191.method761(client.field460, var395);
                            client.field460.method2114(client.field460.field1827 - var396);
                            continue;
                        }
                        if (var412 == 5015) {
                            String var397;
                            if (Statics.field994 == null || Statics.field994.field35 == null) {
                                var397 = "";
                            } else {
                                var397 = Statics.field994.field35;
                            }
                            field706[var6++] = var397;
                            continue;
                        }
                        if (var412 == 5016) {
                            field703[var5++] = client.field468;
                            continue;
                        }
                        if (var412 == 5017) {
                            var5--;
                            int var398 = field703[var5];
                            field703[var5++] = class10.method656(var398);
                            continue;
                        }
                        if (var412 == 5018) {
                            var5--;
                            int var399 = field703[var5];
                            int[] var400 = field703;
                            int var401 = var5++;
                            class31 var402 = (class31) class10.field154.method3155((long) var399);
                            int var403;
                            if (var402 == null) {
                                var403 = -1;
                            } else if (class10.field151.field2850 == var402.field2854) {
                                var403 = -1;
                            } else {
                                var403 = ((class31) var402.field2854).field689;
                            }
                            var400[var401] = var403;
                            continue;
                        }
                        if (var412 == 5019) {
                            var5--;
                            int var404 = field703[var5];
                            field703[var5++] = class10.method2388(var404);
                            continue;
                        }
                        if (var412 == 5020) {
                            var6--;
                            String var405 = field706[var6];
                            client.method143(var405);
                            continue;
                        }
                    }
                }
                if (var412 >= 5600 || var412 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var406 = field703[var5];
                int var407 = field703[var5 + 1];
                if (!client.field496) {
                    client.field377 = var406;
                    client.field337 = var407;
                }
            }
        } catch (Exception var411) {
            StringBuilder var409 = new StringBuilder(30);
            var409.append("").append(var4.field2866).append(" ");
            for (int var410 = field708 - 1; var410 >= 0; var410--) {
                var409.append("").append(field710[var410].field193.field2866).append(" ");
            }
            var409.append("").append(var10);
            class135.method1362(var409.toString(), var411);
        }
    }

    @ObfuscatedName("bf.i(IB)V")
    public static void method1589(int arg0) {
        if (arg0 == -1 || !class152.method1877(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2618[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2582 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field11 = var3.field2582;
                method572(var4, 2000000);
            }
        }
    }
}
