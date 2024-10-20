package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("u")
public class class26 {

    @ObfuscatedName("u.r")
    public static int[] field384 = new int[5];

    @ObfuscatedName("u.n")
    public static int[][] field385 = new int[5][5000];

    @ObfuscatedName("u.i")
    public static int[] field386 = new int[1000];

    @ObfuscatedName("u.s")
    public static String[] field387 = new String[1000];

    @ObfuscatedName("u.w")
    public static int field388 = 0;

    @ObfuscatedName("u.d")
    public static class18[] field394 = new class18[50];

    @ObfuscatedName("u.b")
    public static Calendar field391 = Calendar.getInstance();

    @ObfuscatedName("u.z")
    public static final String[] field383 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("p.g(Lg;I)V")
    public static void method132(class1 arg0) {
        Object[] var1 = arg0.field3;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method1380(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field77;
        int[] var8 = var3.field74;
        byte var9 = -1;
        field388 = 0;
        try {
            Statics.field2438 = new int[var3.field65];
            int var10 = 0;
            Statics.field396 = new String[var3.field68];
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
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2634;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2573;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field19 == null ? -1 : arg0.field19.field2634;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field19 == null ? -1 : arg0.field19.field2573;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field7;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field8;
                    }
                    Statics.field2438[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field14;
                    }
                    Statics.field396[var11++] = var14;
                }
            }
            int var15 = 0;
            label2398: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var383 = var7[var6];
                if (var383 < 100) {
                    if (var383 == 0) {
                        field386[var4++] = var8[var6];
                        continue;
                    }
                    if (var383 == 1) {
                        int var16 = var8[var6];
                        field386[var4++] = class159.field2693[var16];
                        continue;
                    }
                    if (var383 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2693[var17] = field386[var4];
                        Statics.method94(var17);
                        continue;
                    }
                    if (var383 == 3) {
                        field387[var5++] = var3.field67[var6];
                        continue;
                    }
                    if (var383 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var383 == 7) {
                        var4 -= 2;
                        if (field386[var4 + 1] != field386[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 8) {
                        var4 -= 2;
                        if (field386[var4 + 1] == field386[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 9) {
                        var4 -= 2;
                        if (field386[var4] < field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 10) {
                        var4 -= 2;
                        if (field386[var4] > field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 21) {
                        if (field388 == 0) {
                            return;
                        }
                        class18 var18 = field394[--field388];
                        var3 = var18.field251;
                        var7 = var3.field77;
                        var8 = var3.field74;
                        var6 = var18.field252;
                        Statics.field2438 = var18.field253;
                        Statics.field396 = var18.field264;
                        continue;
                    }
                    if (var383 == 25) {
                        int var19 = var8[var6];
                        field386[var4++] = class159.method2666(var19);
                        continue;
                    }
                    if (var383 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field386[var4];
                        class38 var22 = (class38) class38.field944.method3245((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field950.method2968(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method802(new class127(var24));
                            }
                            class38.field944.method3249(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field945;
                        int var28 = var23.field952;
                        int var29 = var23.field947;
                        int var30 = class159.field2692[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class159.field2693[var27] = class159.field2693[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var383 == 31) {
                        var4 -= 2;
                        if (field386[var4] <= field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 32) {
                        var4 -= 2;
                        if (field386[var4] >= field386[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var383 == 33) {
                        field386[var4++] = Statics.field2438[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var383 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field2438[var10001] = field386[var4];
                        continue;
                    }
                    if (var383 == 35) {
                        field387[var5++] = Statics.field396[var8[var6]];
                        continue;
                    }
                    if (var383 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field396[var10001] = field387[var5];
                        continue;
                    }
                    if (var383 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String[] var33 = field387;
                        String var34;
                        if (var32 == 0) {
                            var34 = "";
                        } else if (var32 == 1) {
                            String var35 = var33[var5];
                            if (var35 == null) {
                                var34 = "null";
                            } else {
                                var34 = var35.toString();
                            }
                        } else {
                            int var36 = var5 + var32;
                            int var37 = 0;
                            for (int var38 = var5; var38 < var36; var38++) {
                                String var39 = var33[var38];
                                if (var39 == null) {
                                    var37 += 4;
                                } else {
                                    var37 += var39.length();
                                }
                            }
                            StringBuilder var40 = new StringBuilder(var37);
                            for (int var41 = var5; var41 < var36; var41++) {
                                String var42 = var33[var41];
                                if (var42 == null) {
                                    var40.append("null");
                                } else {
                                    var40.append(var42);
                                }
                            }
                            var34 = var40.toString();
                        }
                        field387[var5++] = var34;
                        continue;
                    }
                    if (var383 == 38) {
                        var4--;
                        continue;
                    }
                    if (var383 == 39) {
                        var5--;
                        continue;
                    }
                    if (var383 == 40) {
                        int var44 = var8[var6];
                        class5 var45 = class5.method1380(var44);
                        int[] var46 = new int[var45.field65];
                        String[] var47 = new String[var45.field68];
                        for (int var48 = 0; var48 < var45.field69; var48++) {
                            var46[var48] = field386[var4 - var45.field69 + var48];
                        }
                        for (int var49 = 0; var49 < var45.field70; var49++) {
                            var47[var49] = field387[var5 - var45.field70 + var49];
                        }
                        var4 -= var45.field69;
                        var5 -= var45.field70;
                        class18 var50 = new class18();
                        var50.field251 = var3;
                        var50.field252 = var6;
                        var50.field253 = Statics.field2438;
                        var50.field264 = Statics.field396;
                        field394[++field388 - 1] = var50;
                        var3 = var45;
                        var7 = var45.field77;
                        var8 = var45.field74;
                        var6 = -1;
                        Statics.field2438 = var46;
                        Statics.field396 = var47;
                        continue;
                    }
                    if (var383 == 42) {
                        field386[var4++] = client.field705[var8[var6]];
                        continue;
                    }
                    if (var383 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field705[var10001] = field386[var4];
                        continue;
                    }
                    if (var383 == 44) {
                        int var51 = var8[var6] >> 16;
                        int var52 = var8[var6] & 0xFFFF;
                        var4--;
                        int var53 = field386[var4];
                        if (var53 >= 0 && var53 <= 5000) {
                            field384[var51] = var53;
                            byte var54 = -1;
                            if (var52 == 105) {
                                var54 = 0;
                            }
                            int var55 = 0;
                            while (true) {
                                if (var55 >= var53) {
                                    continue label2398;
                                }
                                field385[var51][var55] = var54;
                                var55++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 45) {
                        int var56 = var8[var6];
                        var4--;
                        int var57 = field386[var4];
                        if (var57 >= 0 && var57 < field384[var56]) {
                            field386[var4++] = field385[var56][var57];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 46) {
                        int var58 = var8[var6];
                        var4 -= 2;
                        int var59 = field386[var4];
                        if (var59 >= 0 && var59 < field384[var58]) {
                            field385[var58][var59] = field386[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var383 == 47) {
                        String var60 = client.field535[var8[var6]];
                        if (var60 == null) {
                            var60 = "null";
                        }
                        field387[var5++] = var60;
                        continue;
                    }
                    if (var383 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field535[var10001] = field387[var5];
                        continue;
                    }
                }
                boolean var61;
                if (var8[var6] == 1) {
                    var61 = true;
                } else {
                    var61 = false;
                }
                if (var383 < 1000) {
                    if (var383 == 100) {
                        var4 -= 3;
                        int var62 = field386[var4];
                        int var63 = field386[var4 + 1];
                        int var64 = field386[var4 + 2];
                        if (var63 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var65 = class158.method2199(var62);
                        if (var65.field2679 == null) {
                            var65.field2679 = new class158[var64 + 1];
                        }
                        if (var65.field2679.length <= var64) {
                            class158[] var66 = new class158[var64 + 1];
                            for (int var67 = 0; var67 < var65.field2679.length; var67++) {
                                var66[var67] = var65.field2679[var67];
                            }
                            var65.field2679 = var66;
                        }
                        if (var64 > 0 && var65.field2679[var64 - 1] == null) {
                            throw new RuntimeException("" + (var64 - 1));
                        }
                        class158 var68 = new class158();
                        var68.field2574 = var63;
                        var68.field2648 = var68.field2634 = var65.field2634;
                        var68.field2573 = var64;
                        var68.field2662 = true;
                        var65.field2679[var64] = var68;
                        if (var61) {
                            Statics.field390 = var68;
                        } else {
                            Statics.field1968 = var68;
                        }
                        client.method118(var65);
                        continue;
                    }
                    if (var383 == 101) {
                        class158 var69 = var61 ? Statics.field390 : Statics.field1968;
                        class158 var70 = class158.method2199(var69.field2634);
                        var70.field2679[var69.field2573] = null;
                        client.method118(var70);
                        continue;
                    }
                    if (var383 == 102) {
                        var4--;
                        class158 var71 = class158.method2199(field386[var4]);
                        var71.field2679 = null;
                        client.method118(var71);
                        continue;
                    }
                    if (var383 == 200) {
                        var4 -= 2;
                        int var72 = field386[var4];
                        int var73 = field386[var4 + 1];
                        class158 var74 = class158.method2290(var72, var73);
                        if (var74 != null && var73 != -1) {
                            field386[var4++] = 1;
                            if (var61) {
                                Statics.field390 = var74;
                            } else {
                                Statics.field1968 = var74;
                            }
                            continue;
                        }
                        field386[var4++] = 0;
                        continue;
                    }
                } else if (!(var383 < 1000 || var383 >= 1100) || !(var383 < 2000 || var383 >= 2100)) {
                    class158 var75;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var75 = class158.method2199(field386[var4]);
                    } else {
                        var75 = var61 ? Statics.field390 : Statics.field1968;
                    }
                    if (var383 == 1000) {
                        var4 -= 2;
                        var75.field2577 = field386[var4];
                        var75.field2578 = field386[var4 + 1];
                        client.method118(var75);
                        continue;
                    }
                    if (var383 == 1001) {
                        var4 -= 2;
                        var75.field2569 = field386[var4];
                        var75.field2582 = field386[var4 + 1];
                        client.method118(var75);
                        continue;
                    }
                    if (var383 == 1003) {
                        var4--;
                        boolean var76 = field386[var4] == 1;
                        if (var75.field2584 != var76) {
                            var75.field2584 = var76;
                            client.method118(var75);
                        }
                        continue;
                    }
                } else if (var383 >= 1100 && var383 < 1200 || var383 >= 2100 && var383 < 2200) {
                    class158 var77;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var77 = class158.method2199(field386[var4]);
                    } else {
                        var77 = var61 ? Statics.field390 : Statics.field1968;
                    }
                    if (var383 == 1100) {
                        var4 -= 2;
                        var77.field2585 = field386[var4];
                        if (var77.field2585 > var77.field2562 - var77.field2569) {
                            var77.field2585 = var77.field2562 - var77.field2569;
                        }
                        if (var77.field2585 < 0) {
                            var77.field2585 = 0;
                        }
                        var77.field2571 = field386[var4 + 1];
                        if (var77.field2571 > var77.field2567 - var77.field2582) {
                            var77.field2571 = var77.field2567 - var77.field2582;
                        }
                        if (var77.field2571 < 0) {
                            var77.field2571 = 0;
                        }
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1101) {
                        var4--;
                        var77.field2589 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1102) {
                        var4--;
                        var77.field2649 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1103) {
                        var4--;
                        var77.field2594 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1104) {
                        var4--;
                        var77.field2596 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1105) {
                        var4--;
                        var77.field2601 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1106) {
                        var4--;
                        var77.field2598 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1107) {
                        var4--;
                        var77.field2599 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1108) {
                        var77.field2604 = 1;
                        var4--;
                        var77.field2605 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1109) {
                        var4 -= 6;
                        var77.field2610 = field386[var4];
                        var77.field2611 = field386[var4 + 1];
                        var77.field2612 = field386[var4 + 2];
                        var77.field2613 = field386[var4 + 3];
                        var77.field2614 = field386[var4 + 4];
                        var77.field2615 = field386[var4 + 5];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1110) {
                        var4--;
                        int var78 = field386[var4];
                        if (var77.field2644 != var78) {
                            var77.field2644 = var78;
                            var77.field2678 = 0;
                            var77.field2625 = 0;
                            client.method118(var77);
                        }
                        continue;
                    }
                    if (var383 == 1111) {
                        var4--;
                        var77.field2617 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1112) {
                        var5--;
                        String var79 = field387[var5];
                        if (!var79.equals(var77.field2619)) {
                            var77.field2619 = var79;
                            client.method118(var77);
                        }
                        continue;
                    }
                    if (var383 == 1113) {
                        var4--;
                        var77.field2618 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1114) {
                        var4 -= 3;
                        var77.field2622 = field386[var4];
                        var77.field2586 = field386[var4 + 1];
                        var77.field2572 = field386[var4 + 2];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1115) {
                        var4--;
                        var77.field2624 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1116) {
                        var4--;
                        var77.field2600 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1117) {
                        var4--;
                        var77.field2680 = field386[var4];
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1118) {
                        var4--;
                        var77.field2602 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1119) {
                        var4--;
                        var77.field2603 = field386[var4] == 1;
                        client.method118(var77);
                        continue;
                    }
                    if (var383 == 1120) {
                        var4 -= 2;
                        var77.field2562 = field386[var4];
                        var77.field2567 = field386[var4 + 1];
                        client.method118(var77);
                        continue;
                    }
                } else if (!(var383 < 1200 || var383 >= 1300) || !(var383 < 2200 || var383 >= 2300)) {
                    class158 var80;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var80 = class158.method2199(field386[var4]);
                    } else {
                        var80 = var61 ? Statics.field390 : Statics.field1968;
                    }
                    client.method118(var80);
                    if (var383 == 1200) {
                        var4 -= 2;
                        int var81 = field386[var4];
                        int var82 = field386[var4 + 1];
                        var80.field2676 = var81;
                        var80.field2677 = var82;
                        class40 var83 = class40.method41(var81);
                        var80.field2612 = var83.field990;
                        var80.field2613 = var83.field991;
                        var80.field2614 = var83.field992;
                        var80.field2610 = var83.field993;
                        var80.field2611 = var83.field994;
                        var80.field2615 = var83.field1009;
                        if (var80.field2569 > 0) {
                            var80.field2615 = var80.field2615 * 32 / var80.field2569;
                        }
                        continue;
                    }
                    if (var383 == 1201) {
                        var80.field2604 = 2;
                        var4--;
                        var80.field2605 = field386[var4];
                        continue;
                    }
                    if (var383 == 1202) {
                        var80.field2604 = 3;
                        var80.field2605 = Statics.field2706.field39.method3163();
                        continue;
                    }
                } else if ((var383 < 1300 || var383 >= 1400) && (var383 < 2300 || var383 >= 2400)) {
                    if (var383 >= 1400 && var383 < 1500 || var383 >= 2400 && var383 < 2500) {
                        class158 var88;
                        if (var383 >= 2000) {
                            var383 -= 1000;
                            var4--;
                            var88 = class158.method2199(field386[var4]);
                        } else {
                            var88 = var61 ? Statics.field390 : Statics.field1968;
                        }
                        var5--;
                        String var89 = field387[var5];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var4--;
                            int var91 = field386[var4];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var4--;
                                    var90[var91] = field386[var4];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var5--;
                                var92[var93] = field387[var5];
                            } else {
                                var4--;
                                var92[var93] = Integer.valueOf(field386[var4]);
                            }
                        }
                        var4--;
                        int var94 = field386[var4];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var383 == 1400) {
                            var88.field2641 = var92;
                        }
                        if (var383 == 1401) {
                            var88.field2592 = var92;
                        }
                        if (var383 == 1402) {
                            var88.field2643 = var92;
                        }
                        if (var383 == 1403) {
                            var88.field2645 = var92;
                        }
                        if (var383 == 1404) {
                            var88.field2647 = var92;
                        }
                        if (var383 == 1405) {
                            var88.field2640 = var92;
                        }
                        if (var383 == 1406) {
                            var88.field2651 = var92;
                        }
                        if (var383 == 1407) {
                            var88.field2595 = var92;
                            var88.field2664 = var90;
                        }
                        if (var383 == 1408) {
                            var88.field2681 = var92;
                        }
                        if (var383 == 1409) {
                            var88.field2670 = var92;
                        }
                        if (var383 == 1410) {
                            var88.field2674 = var92;
                        }
                        if (var383 == 1411) {
                            var88.field2642 = var92;
                        }
                        if (var383 == 1412) {
                            var88.field2646 = var92;
                        }
                        if (var383 == 1414) {
                            var88.field2654 = var92;
                            var88.field2655 = var90;
                        }
                        if (var383 == 1415) {
                            var88.field2656 = var92;
                            var88.field2657 = var90;
                        }
                        if (var383 == 1416) {
                            var88.field2650 = var92;
                        }
                        if (var383 == 1417) {
                            var88.field2660 = var92;
                        }
                        if (var383 == 1418) {
                            var88.field2652 = var92;
                        }
                        if (var383 == 1419) {
                            var88.field2583 = var92;
                        }
                        if (var383 == 1420) {
                            var88.field2663 = var92;
                        }
                        if (var383 == 1421) {
                            var88.field2682 = var92;
                        }
                        if (var383 == 1422) {
                            var88.field2661 = var92;
                        }
                        if (var383 == 1423) {
                            var88.field2672 = var92;
                        }
                        if (var383 == 1424) {
                            var88.field2667 = var92;
                        }
                        var88.field2576 = true;
                        continue;
                    }
                    if (var383 < 1600) {
                        class158 var95 = var61 ? Statics.field390 : Statics.field1968;
                        if (var383 == 1500) {
                            field386[var4++] = var95.field2577;
                            continue;
                        }
                        if (var383 == 1501) {
                            field386[var4++] = var95.field2578;
                            continue;
                        }
                        if (var383 == 1502) {
                            field386[var4++] = var95.field2569;
                            continue;
                        }
                        if (var383 == 1503) {
                            field386[var4++] = var95.field2582;
                            continue;
                        }
                        if (var383 == 1504) {
                            field386[var4++] = var95.field2584 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 1505) {
                            field386[var4++] = var95.field2648;
                            continue;
                        }
                    } else if (var383 < 1700) {
                        class158 var96 = var61 ? Statics.field390 : Statics.field1968;
                        if (var383 == 1600) {
                            field386[var4++] = var96.field2585;
                            continue;
                        }
                        if (var383 == 1601) {
                            field386[var4++] = var96.field2571;
                            continue;
                        }
                        if (var383 == 1602) {
                            field387[var5++] = var96.field2619;
                            continue;
                        }
                        if (var383 == 1603) {
                            field386[var4++] = var96.field2562;
                            continue;
                        }
                        if (var383 == 1604) {
                            field386[var4++] = var96.field2567;
                            continue;
                        }
                        if (var383 == 1605) {
                            field386[var4++] = var96.field2615;
                            continue;
                        }
                        if (var383 == 1606) {
                            field386[var4++] = var96.field2612;
                            continue;
                        }
                        if (var383 == 1607) {
                            field386[var4++] = var96.field2614;
                            continue;
                        }
                        if (var383 == 1608) {
                            field386[var4++] = var96.field2613;
                            continue;
                        }
                    } else if (var383 < 1800) {
                        class158 var97 = var61 ? Statics.field390 : Statics.field1968;
                        if (var383 == 1700) {
                            field386[var4++] = var97.field2676;
                            continue;
                        }
                        if (var383 == 1701) {
                            if (var97.field2676 == -1) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var97.field2677;
                            }
                            continue;
                        }
                        if (var383 == 1702) {
                            field386[var4++] = var97.field2573;
                            continue;
                        }
                    } else if (var383 < 1900) {
                        class158 var98 = var61 ? Statics.field390 : Statics.field1968;
                        if (var383 == 1800) {
                            field386[var4++] = class162.method134(client.method1434(var98));
                            continue;
                        }
                        if (var383 == 1801) {
                            var4--;
                            int var99 = field386[var4];
                            int var384 = var99 - 1;
                            if (var98.field2633 != null && var384 < var98.field2633.length && var98.field2633[var384] != null) {
                                field387[var5++] = var98.field2633[var384];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 1802) {
                            if (var98.field2632 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = var98.field2632;
                            }
                            continue;
                        }
                    } else if (var383 < 2600) {
                        var4--;
                        class158 var100 = class158.method2199(field386[var4]);
                        if (var383 == 2500) {
                            field386[var4++] = var100.field2577;
                            continue;
                        }
                        if (var383 == 2501) {
                            field386[var4++] = var100.field2578;
                            continue;
                        }
                        if (var383 == 2502) {
                            field386[var4++] = var100.field2569;
                            continue;
                        }
                        if (var383 == 2503) {
                            field386[var4++] = var100.field2582;
                            continue;
                        }
                        if (var383 == 2504) {
                            field386[var4++] = var100.field2584 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 2505) {
                            field386[var4++] = var100.field2648;
                            continue;
                        }
                    } else if (var383 < 2700) {
                        var4--;
                        class158 var101 = class158.method2199(field386[var4]);
                        if (var383 == 2600) {
                            field386[var4++] = var101.field2585;
                            continue;
                        }
                        if (var383 == 2601) {
                            field386[var4++] = var101.field2571;
                            continue;
                        }
                        if (var383 == 2602) {
                            field387[var5++] = var101.field2619;
                            continue;
                        }
                        if (var383 == 2603) {
                            field386[var4++] = var101.field2562;
                            continue;
                        }
                        if (var383 == 2604) {
                            field386[var4++] = var101.field2567;
                            continue;
                        }
                        if (var383 == 2605) {
                            field386[var4++] = var101.field2615;
                            continue;
                        }
                        if (var383 == 2606) {
                            field386[var4++] = var101.field2612;
                            continue;
                        }
                        if (var383 == 2607) {
                            field386[var4++] = var101.field2614;
                            continue;
                        }
                        if (var383 == 2608) {
                            field386[var4++] = var101.field2613;
                            continue;
                        }
                    } else if (var383 < 2800) {
                        if (var383 == 2700) {
                            var4--;
                            class158 var102 = class158.method2199(field386[var4]);
                            field386[var4++] = var102.field2676;
                            continue;
                        }
                        if (var383 == 2701) {
                            var4--;
                            class158 var103 = class158.method2199(field386[var4]);
                            if (var103.field2676 == -1) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var103.field2677;
                            }
                            continue;
                        }
                        if (var383 == 2702) {
                            var4--;
                            int var104 = field386[var4];
                            class4 var105 = (class4) client.field582.method3293((long) var104);
                            if (var105 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var383 < 2900) {
                        var4--;
                        class158 var106 = class158.method2199(field386[var4]);
                        if (var383 == 2800) {
                            field386[var4++] = class162.method134(client.method1434(var106));
                            continue;
                        }
                        if (var383 == 2801) {
                            var4--;
                            int var107 = field386[var4];
                            int var385 = var107 - 1;
                            if (var106.field2633 != null && var385 < var106.field2633.length && var106.field2633[var385] != null) {
                                field387[var5++] = var106.field2633[var385];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 2802) {
                            if (var106.field2632 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = var106.field2632;
                            }
                            continue;
                        }
                    } else if (var383 < 3200) {
                        if (var383 == 3100) {
                            var5--;
                            String var108 = field387[var5];
                            client.method1287(0, "", var108);
                            continue;
                        }
                        if (var383 == 3101) {
                            var4 -= 2;
                            client.method201(Statics.field2706, field386[var4], field386[var4 + 1]);
                            continue;
                        }
                        if (var383 == 3103) {
                            client.field505.method2295(153);
                            for (class4 var109 = (class4) client.field582.method3312(); var109 != null; var109 = (class4) client.field582.method3297()) {
                                if (var109.field61 == 0 || var109.field61 == 3) {
                                    client.method42(var109, true);
                                }
                            }
                            if (client.field516 != null) {
                                client.method118(client.field516);
                                client.field516 = null;
                            }
                            continue;
                        }
                        if (var383 == 3104) {
                            var5--;
                            String var110 = field387[var5];
                            int var111 = 0;
                            boolean var112 = false;
                            boolean var113 = false;
                            int var114 = 0;
                            int var115 = var110.length();
                            int var116 = 0;
                            boolean var118;
                            while (true) {
                                if (var116 >= var115) {
                                    var118 = var113;
                                    break;
                                }
                                label2581: {
                                    char var117 = var110.charAt(var116);
                                    if (var116 == 0) {
                                        if (var117 == '-') {
                                            var112 = true;
                                            break label2581;
                                        }
                                        if (var117 == '+') {
                                            break label2581;
                                        }
                                    }
                                    int var386;
                                    if (var117 >= '0' && var117 <= '9') {
                                        var386 = var117 - '0';
                                    } else if (var117 >= 'A' && var117 <= 'Z') {
                                        var386 = var117 - '7';
                                    } else {
                                        if (var117 < 'a' || var117 > 'z') {
                                            var118 = false;
                                            break;
                                        }
                                        var386 = var117 - 'W';
                                    }
                                    if (var386 >= 10) {
                                        var118 = false;
                                        break;
                                    }
                                    if (var112) {
                                        var386 = -var386;
                                    }
                                    int var119 = var114 * 10 + var386;
                                    if (var119 / 10 != var114) {
                                        var118 = false;
                                        break;
                                    }
                                    var114 = var119;
                                    var113 = true;
                                }
                                var116++;
                            }
                            if (var118) {
                                int var121 = class147.method1840(var110, 10, true);
                                var111 = var121;
                            }
                            client.field505.method2295(99);
                            client.field505.method2448(var111);
                            continue;
                        }
                        if (var383 == 3105) {
                            var5--;
                            String var122 = field387[var5];
                            client.field505.method2295(40);
                            client.field505.method2498(var122.length() + 1);
                            client.field505.method2465(var122);
                            continue;
                        }
                        if (var383 == 3106) {
                            var5--;
                            String var123 = field387[var5];
                            client.field505.method2295(21);
                            client.field505.method2498(var123.length() + 1);
                            client.field505.method2465(var123);
                            continue;
                        }
                        if (var383 == 3107) {
                            var4--;
                            int var124 = field386[var4];
                            var5--;
                            String var125 = field387[var5];
                            boolean var126 = false;
                            for (int var127 = 0; var127 < client.field588; var127++) {
                                class3 var128 = client.field726[client.field587[var127]];
                                if (var128 != null && var128.field50 != null && var128.field50.equalsIgnoreCase(var125)) {
                                    client.method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var128.field436[0], var128.field456[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var124 == 1) {
                                        client.field505.method2295(23);
                                        client.field505.method2401(client.field587[var127]);
                                    } else if (var124 == 4) {
                                        client.field505.method2295(83);
                                        client.field505.method2444(client.field587[var127]);
                                    } else if (var124 == 6) {
                                        client.field505.method2295(111);
                                        client.field505.method2445(client.field587[var127]);
                                    } else if (var124 == 7) {
                                        client.field505.method2295(235);
                                        client.field505.method2568(client.field587[var127]);
                                    }
                                    var126 = true;
                                    break;
                                }
                            }
                            if (!var126) {
                                client.method1287(0, "", class134.field2115 + var125);
                            }
                            continue;
                        }
                        if (var383 == 3108) {
                            var4 -= 3;
                            int var129 = field386[var4];
                            int var130 = field386[var4 + 1];
                            int var131 = field386[var4 + 2];
                            class158 var132 = class158.method2199(var131);
                            client.method193(var132, var129, var130);
                            continue;
                        }
                        if (var383 == 3109) {
                            var4 -= 2;
                            int var133 = field386[var4];
                            int var134 = field386[var4 + 1];
                            class158 var135 = var61 ? Statics.field390 : Statics.field1968;
                            client.method193(var135, var133, var134);
                            continue;
                        }
                    } else if (var383 < 3300) {
                        if (var383 == 3200) {
                            var4 -= 3;
                            client.method124(field386[var4], field386[var4 + 1], field386[var4 + 2]);
                            continue;
                        }
                        if (var383 == 3201) {
                            var4--;
                            client.method2093(field386[var4]);
                            continue;
                        }
                        if (var383 == 3202) {
                            var4 -= 2;
                            client.method101(field386[var4], field386[var4 + 1]);
                            continue;
                        }
                    } else if (var383 < 3400) {
                        if (var383 == 3300) {
                            field386[var4++] = client.field476;
                            continue;
                        }
                        if (var383 == 3301) {
                            var4 -= 2;
                            int var136 = field386[var4];
                            int var137 = field386[var4 + 1];
                            int[] var138 = field386;
                            int var139 = var4++;
                            class19 var140 = (class19) class19.field272.method3293((long) var136);
                            int var141;
                            if (var140 == null) {
                                var141 = -1;
                            } else if (var137 >= 0 && var137 < var140.field266.length) {
                                var141 = var140.field266[var137];
                            } else {
                                var141 = -1;
                            }
                            var138[var139] = var141;
                            continue;
                        }
                        if (var383 == 3302) {
                            var4 -= 2;
                            int var142 = field386[var4];
                            int var143 = field386[var4 + 1];
                            field386[var4++] = class19.method2880(var142, var143);
                            continue;
                        }
                        if (var383 == 3303) {
                            var4 -= 2;
                            int var144 = field386[var4];
                            int var145 = field386[var4 + 1];
                            field386[var4++] = class19.method1844(var144, var145);
                            continue;
                        }
                        if (var383 == 3304) {
                            var4--;
                            int var146 = field386[var4];
                            field386[var4++] = class41.method733(var146).field1024;
                            continue;
                        }
                        if (var383 == 3305) {
                            var4--;
                            int var147 = field386[var4];
                            field386[var4++] = client.field653[var147];
                            continue;
                        }
                        if (var383 == 3306) {
                            var4--;
                            int var148 = field386[var4];
                            field386[var4++] = client.field606[var148];
                            continue;
                        }
                        if (var383 == 3307) {
                            var4--;
                            int var149 = field386[var4];
                            field386[var4++] = client.field607[var149];
                            continue;
                        }
                        if (var383 == 3308) {
                            int var150 = Statics.field948;
                            int var151 = (Statics.field2706.field463 >> 7) + Statics.field80;
                            int var152 = (Statics.field2706.field404 >> 7) + Statics.field377;
                            field386[var4++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var383 == 3309) {
                            var4--;
                            int var153 = field386[var4];
                            field386[var4++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var383 == 3310) {
                            var4--;
                            int var154 = field386[var4];
                            field386[var4++] = var154 >> 28;
                            continue;
                        }
                        if (var383 == 3311) {
                            var4--;
                            int var155 = field386[var4];
                            field386[var4++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var383 == 3312) {
                            field386[var4++] = client.field714 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3313) {
                            var4 -= 2;
                            int var156 = field386[var4] + 32768;
                            int var157 = field386[var4 + 1];
                            int[] var158 = field386;
                            int var159 = var4++;
                            class19 var160 = (class19) class19.field272.method3293((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field266.length) {
                                var161 = var160.field266[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var383 == 3314) {
                            var4 -= 2;
                            int var162 = field386[var4] + 32768;
                            int var163 = field386[var4 + 1];
                            field386[var4++] = class19.method2880(var162, var163);
                            continue;
                        }
                        if (var383 == 3315) {
                            var4 -= 2;
                            int var164 = field386[var4] + 32768;
                            int var165 = field386[var4 + 1];
                            field386[var4++] = class19.method1844(var164, var165);
                            continue;
                        }
                        if (var383 == 3316) {
                            if (client.field636 >= 2) {
                                field386[var4++] = client.field636;
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                        if (var383 == 3317) {
                            field386[var4++] = client.field483;
                            continue;
                        }
                        if (var383 == 3318) {
                            field386[var4++] = client.field639;
                            continue;
                        }
                        if (var383 == 3321) {
                            field386[var4++] = client.field634;
                            continue;
                        }
                        if (var383 == 3322) {
                            field386[var4++] = client.field635;
                            continue;
                        }
                        if (var383 == 3323) {
                            if (client.field637) {
                                field386[var4++] = 1;
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var383 < 3500) {
                        if (var383 == 3400) {
                            var4 -= 2;
                            int var166 = field386[var4];
                            int var167 = field386[var4 + 1];
                            class39 var168 = (class39) class39.field971.method3245((long) var166);
                            class39 var169;
                            if (var168 == null) {
                                byte[] var170 = Statics.field956.method2968(8, var166);
                                class39 var171 = new class39();
                                if (var170 != null) {
                                    var171.method808(new class127(var170));
                                }
                                class39.field971.method3249(var171, (long) var166);
                                var169 = var171;
                            } else {
                                var169 = var168;
                            }
                            class39 var172 = var169;
                            if (var169.field961 != 's') {
                            }
                            for (int var173 = 0; var173 < var172.field972; var173++) {
                                if (var172.field962[var173] == var167) {
                                    field387[var5++] = var172.field958[var173];
                                    var172 = null;
                                    break;
                                }
                            }
                            if (var172 != null) {
                                field387[var5++] = var172.field959;
                            }
                            continue;
                        }
                        if (var383 == 3408) {
                            var4 -= 4;
                            int var174 = field386[var4];
                            int var175 = field386[var4 + 1];
                            int var176 = field386[var4 + 2];
                            int var177 = field386[var4 + 3];
                            class39 var178 = (class39) class39.field971.method3245((long) var176);
                            class39 var179;
                            if (var178 == null) {
                                byte[] var180 = Statics.field956.method2968(8, var176);
                                class39 var181 = new class39();
                                if (var180 != null) {
                                    var181.method808(new class127(var180));
                                }
                                class39.field971.method3249(var181, (long) var176);
                                var179 = var181;
                            } else {
                                var179 = var178;
                            }
                            class39 var182 = var179;
                            if (var179.field970 == var174 && var179.field961 == var175) {
                                for (int var183 = 0; var183 < var182.field972; var183++) {
                                    if (var182.field962[var183] == var177) {
                                        if (var175 == 115) {
                                            field387[var5++] = var182.field958[var183];
                                        } else {
                                            field386[var4++] = var182.field963[var183];
                                        }
                                        var182 = null;
                                        break;
                                    }
                                }
                                if (var182 != null) {
                                    if (var175 == 115) {
                                        field387[var5++] = var182.field959;
                                    } else {
                                        field386[var4++] = var182.field960;
                                    }
                                }
                                continue;
                            }
                            if (var175 == 115) {
                                field387[var5++] = "null";
                            } else {
                                field386[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var383 < 3700) {
                        if (var383 == 3600) {
                            if (client.field632 == 0) {
                                field386[var4++] = -2;
                            } else if (client.field632 == 1) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = client.field723;
                            }
                            continue;
                        }
                        if (var383 == 3601) {
                            var4--;
                            int var184 = field386[var4];
                            if (client.field632 == 2 && var184 < client.field723) {
                                field387[var5++] = client.field518[var184].field358;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 3602) {
                            var4--;
                            int var185 = field386[var4];
                            if (client.field632 == 2 && var185 < client.field723) {
                                field386[var4++] = client.field518[var185].field353;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3603) {
                            var4--;
                            int var186 = field386[var4];
                            if (client.field632 == 2 && var186 < client.field723) {
                                field386[var4++] = client.field518[var186].field354;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3604) {
                            var5--;
                            String var187 = field387[var5];
                            var4--;
                            int var188 = field386[var4];
                            client.method2660(var187, var188);
                            continue;
                        }
                        if (var383 == 3605) {
                            var5--;
                            String var189 = field387[var5];
                            client.method14(var189);
                            continue;
                        }
                        if (var383 == 3606) {
                            var5--;
                            String var190 = field387[var5];
                            if (var190 == null) {
                                continue;
                            }
                            String var191 = class148.method595(var190, Statics.field470);
                            if (var191 == null) {
                                continue;
                            }
                            int var192 = 0;
                            while (true) {
                                if (var192 >= client.field723) {
                                    continue label2398;
                                }
                                class23 var193 = client.field518[var192];
                                String var194 = var193.field358;
                                String var195 = class148.method595(var194, Statics.field470);
                                if (class136.method2649(var190, var191, var194, var195)) {
                                    client.field723--;
                                    for (int var196 = var192; var196 < client.field723; var196++) {
                                        client.field518[var196] = client.field518[var196 + 1];
                                    }
                                    client.field660 = client.field517;
                                    client.field505.method2295(57);
                                    client.field505.method2498(Statics.method1837(var190));
                                    client.field505.method2465(var190);
                                    continue label2398;
                                }
                                var192++;
                            }
                        }
                        if (var383 == 3607) {
                            var5--;
                            String var197 = field387[var5];
                            client.method887(var197, false);
                            continue;
                        }
                        if (var383 == 3608) {
                            var5--;
                            String var198 = field387[var5];
                            if (var198 == null) {
                                continue;
                            }
                            String var199 = class148.method595(var198, Statics.field470);
                            if (var199 == null) {
                                continue;
                            }
                            int var200 = 0;
                            while (true) {
                                if (var200 >= client.field471) {
                                    continue label2398;
                                }
                                class11 var201 = client.field620[var200];
                                String var202 = var201.field165;
                                String var203 = class148.method595(var202, Statics.field470);
                                if (class136.method2649(var198, var199, var202, var203)) {
                                    client.field471--;
                                    for (int var204 = var200; var204 < client.field471; var204++) {
                                        client.field620[var204] = client.field620[var204 + 1];
                                    }
                                    client.field660 = client.field517;
                                    client.field505.method2295(198);
                                    client.field505.method2498(Statics.method1837(var198));
                                    client.field505.method2465(var198);
                                    continue label2398;
                                }
                                var200++;
                            }
                        }
                        if (var383 == 3609) {
                            var5--;
                            String var205 = field387[var5];
                            if (var205.startsWith(class2.method96(0)) || var205.startsWith(class2.method96(1))) {
                                var205 = var205.substring(7);
                            }
                            int[] var206 = field386;
                            int var207 = var4++;
                            boolean var208;
                            if (var205 == null) {
                                var208 = false;
                            } else {
                                String var209 = class148.method595(var205, Statics.field470);
                                int var210 = 0;
                                while (true) {
                                    if (var210 >= client.field723) {
                                        if (var205.equalsIgnoreCase(class148.method595(Statics.field2706.field50, Statics.field470))) {
                                            var208 = true;
                                        } else {
                                            var208 = false;
                                        }
                                        break;
                                    }
                                    if (var209.equalsIgnoreCase(class148.method595(client.field518[var210].field358, Statics.field470))) {
                                        var208 = true;
                                        break;
                                    }
                                    var210++;
                                }
                            }
                            var206[var207] = var208 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3611) {
                            if (client.field694 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = class146.method133(client.field694);
                            }
                            continue;
                        }
                        if (var383 == 3612) {
                            if (client.field694 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = Statics.field193;
                            }
                            continue;
                        }
                        if (var383 == 3613) {
                            var4--;
                            int var211 = field386[var4];
                            if (client.field694 != null && var211 < Statics.field193) {
                                field387[var5++] = Statics.field1307[var211].field105;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 3614) {
                            var4--;
                            int var212 = field386[var4];
                            if (client.field694 != null && var212 < Statics.field193) {
                                field386[var4++] = Statics.field1307[var212].field106;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3615) {
                            var4--;
                            int var213 = field386[var4];
                            if (client.field694 != null && var213 < Statics.field193) {
                                field386[var4++] = Statics.field1307[var213].field107;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3616) {
                            field386[var4++] = Statics.field696;
                            continue;
                        }
                        if (var383 == 3617) {
                            var5--;
                            String var214 = field387[var5];
                            client.method102(var214);
                            continue;
                        }
                        if (var383 == 3618) {
                            field386[var4++] = Statics.field1966;
                            continue;
                        }
                        if (var383 == 3619) {
                            var5--;
                            String var215 = field387[var5];
                            client.method191(var215);
                            continue;
                        }
                        if (var383 == 3620) {
                            client.method3087();
                            continue;
                        }
                        if (var383 == 3621) {
                            if (client.field632 == 0) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = client.field471;
                            }
                            continue;
                        }
                        if (var383 == 3622) {
                            var4--;
                            int var216 = field386[var4];
                            if (client.field632 != 0 && var216 < client.field471) {
                                field387[var5++] = client.field620[var216].field165;
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 3623) {
                            var5--;
                            String var217 = field387[var5];
                            if (var217.startsWith(class2.method96(0)) || var217.startsWith(class2.method96(1))) {
                                var217 = var217.substring(7);
                            }
                            field386[var4++] = client.method205(var217) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 3624) {
                            var4--;
                            int var218 = field386[var4];
                            if (Statics.field1307 != null && var218 < Statics.field193 && Statics.field1307[var218].field105.equalsIgnoreCase(Statics.field2706.field50)) {
                                field386[var4++] = 1;
                                continue;
                            }
                            field386[var4++] = 0;
                            continue;
                        }
                        if (var383 == 3625) {
                            if (client.field695 == null) {
                                field387[var5++] = "";
                            } else {
                                field387[var5++] = class146.method133(client.field695);
                            }
                            continue;
                        }
                    } else if (var383 < 4100) {
                        if (var383 == 4000) {
                            var4 -= 2;
                            int var219 = field386[var4];
                            int var220 = field386[var4 + 1];
                            field386[var4++] = var219 + var220;
                            continue;
                        }
                        if (var383 == 4001) {
                            var4 -= 2;
                            int var221 = field386[var4];
                            int var222 = field386[var4 + 1];
                            field386[var4++] = var221 - var222;
                            continue;
                        }
                        if (var383 == 4002) {
                            var4 -= 2;
                            int var223 = field386[var4];
                            int var224 = field386[var4 + 1];
                            field386[var4++] = var223 * var224;
                            continue;
                        }
                        if (var383 == 4003) {
                            var4 -= 2;
                            int var225 = field386[var4];
                            int var226 = field386[var4 + 1];
                            field386[var4++] = var225 / var226;
                            continue;
                        }
                        if (var383 == 4004) {
                            var4--;
                            int var227 = field386[var4];
                            field386[var4++] = (int) (Math.random() * (double) var227);
                            continue;
                        }
                        if (var383 == 4005) {
                            var4--;
                            int var228 = field386[var4];
                            field386[var4++] = (int) (Math.random() * (double) (var228 + 1));
                            continue;
                        }
                        if (var383 == 4006) {
                            var4 -= 5;
                            int var229 = field386[var4];
                            int var230 = field386[var4 + 1];
                            int var231 = field386[var4 + 2];
                            int var232 = field386[var4 + 3];
                            int var233 = field386[var4 + 4];
                            field386[var4++] = (var230 - var229) * (var233 - var231) / (var232 - var231) + var229;
                            continue;
                        }
                        if (var383 == 4007) {
                            var4 -= 2;
                            int var234 = field386[var4];
                            int var235 = field386[var4 + 1];
                            field386[var4++] = var234 * var235 / 100 + var234;
                            continue;
                        }
                        if (var383 == 4008) {
                            var4 -= 2;
                            int var236 = field386[var4];
                            int var237 = field386[var4 + 1];
                            field386[var4++] = var236 | 0x1 << var237;
                            continue;
                        }
                        if (var383 == 4009) {
                            var4 -= 2;
                            int var238 = field386[var4];
                            int var239 = field386[var4 + 1];
                            field386[var4++] = var238 & -1 - (0x1 << var239);
                            continue;
                        }
                        if (var383 == 4010) {
                            var4 -= 2;
                            int var240 = field386[var4];
                            int var241 = field386[var4 + 1];
                            field386[var4++] = (var240 & 0x1 << var241) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var383 == 4011) {
                            var4 -= 2;
                            int var242 = field386[var4];
                            int var243 = field386[var4 + 1];
                            field386[var4++] = var242 % var243;
                            continue;
                        }
                        if (var383 == 4012) {
                            var4 -= 2;
                            int var244 = field386[var4];
                            int var245 = field386[var4 + 1];
                            if (var244 == 0) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = (int) Math.pow((double) var244, (double) var245);
                            }
                            continue;
                        }
                        if (var383 == 4013) {
                            var4 -= 2;
                            int var246 = field386[var4];
                            int var247 = field386[var4 + 1];
                            if (var246 == 0) {
                                field386[var4++] = 0;
                            } else if (var247 == 0) {
                                field386[var4++] = Integer.MAX_VALUE;
                            } else {
                                field386[var4++] = (int) Math.pow((double) var246, 1.0D / (double) var247);
                            }
                            continue;
                        }
                        if (var383 == 4014) {
                            var4 -= 2;
                            int var248 = field386[var4];
                            int var249 = field386[var4 + 1];
                            field386[var4++] = var248 & var249;
                            continue;
                        }
                        if (var383 == 4015) {
                            var4 -= 2;
                            int var250 = field386[var4];
                            int var251 = field386[var4 + 1];
                            field386[var4++] = var250 | var251;
                            continue;
                        }
                    } else if (var383 < 4200) {
                        if (var383 == 4100) {
                            var5--;
                            String var252 = field387[var5];
                            var4--;
                            int var253 = field386[var4];
                            field387[var5++] = var252 + var253;
                            continue;
                        }
                        if (var383 == 4101) {
                            var5 -= 2;
                            String var254 = field387[var5];
                            String var255 = field387[var5 + 1];
                            field387[var5++] = var254 + var255;
                            continue;
                        }
                        if (var383 == 4102) {
                            var5--;
                            String var256 = field387[var5];
                            var4--;
                            int var257 = field386[var4];
                            String[] var258 = field387;
                            int var259 = var5++;
                            String var261;
                            if (var257 < 0) {
                                var261 = Integer.toString(var257);
                            } else {
                                var261 = class147.method2943(var257, 10, true);
                            }
                            var258[var259] = var256 + var261;
                            continue;
                        }
                        if (var383 == 4103) {
                            var5--;
                            String var262 = field387[var5];
                            field387[var5++] = var262.toLowerCase();
                            continue;
                        }
                        if (var383 == 4104) {
                            var4--;
                            int var263 = field386[var4];
                            long var264 = ((long) var263 + 11745L) * 86400000L;
                            field391.setTime(new Date(var264));
                            int var266 = field391.get(5);
                            int var267 = field391.get(2);
                            int var268 = field391.get(1);
                            field387[var5++] = var266 + "-" + field383[var267] + "-" + var268;
                            continue;
                        }
                        if (var383 == 4105) {
                            var5 -= 2;
                            String var269 = field387[var5];
                            String var270 = field387[var5 + 1];
                            if (Statics.field2706.field39 != null && Statics.field2706.field39.field2714) {
                                field387[var5++] = var270;
                                continue;
                            }
                            field387[var5++] = var269;
                            continue;
                        }
                        if (var383 == 4106) {
                            var4--;
                            int var271 = field386[var4];
                            field387[var5++] = Integer.toString(var271);
                            continue;
                        }
                        if (var383 == 4107) {
                            var5 -= 2;
                            int[] var272 = field386;
                            int var273 = var4++;
                            String var274 = field387[var5];
                            String var275 = field387[var5 + 1];
                            int var276 = client.field573;
                            int var277 = var274.length();
                            int var278 = var275.length();
                            int var279 = 0;
                            int var280 = 0;
                            byte var281 = 0;
                            byte var282 = 0;
                            int var283;
                            label2243: while (true) {
                                if (var279 - var281 >= var277 && var280 - var282 >= var278) {
                                    int var294 = Math.min(var277, var278);
                                    for (int var295 = 0; var295 < var294; var295++) {
                                        char var298 = var274.charAt(var295);
                                        char var299 = var275.charAt(var295);
                                        if (var298 != var299 && Character.toUpperCase(var298) != Character.toUpperCase(var299)) {
                                            char var300 = Character.toLowerCase(var298);
                                            char var301 = Character.toLowerCase(var299);
                                            if (var300 != var301) {
                                                var283 = class150.method2197(var300, var276) - class150.method2197(var301, var276);
                                                break label2243;
                                            }
                                        }
                                    }
                                    int var302 = var277 - var278;
                                    if (var302 == 0) {
                                        for (int var303 = 0; var303 < var294; var303++) {
                                            char var304 = var274.charAt(var303);
                                            char var305 = var275.charAt(var303);
                                            if (var304 != var305) {
                                                var283 = class150.method2197(var304, var276) - class150.method2197(var305, var276);
                                                break label2243;
                                            }
                                        }
                                        var283 = 0;
                                    } else {
                                        var283 = var302;
                                    }
                                    break;
                                }
                                if (var279 - var281 >= var277) {
                                    var283 = -1;
                                    break;
                                }
                                if (var280 - var282 >= var278) {
                                    var283 = 1;
                                    break;
                                }
                                char var284;
                                if (var281 == 0) {
                                    var284 = var274.charAt(var279++);
                                } else {
                                    var284 = (char) var281;
                                    boolean var285 = false;
                                }
                                char var286;
                                if (var282 == 0) {
                                    var286 = var275.charAt(var280++);
                                } else {
                                    var286 = (char) var282;
                                    boolean var287 = false;
                                }
                                byte var288;
                                if (var284 == 198) {
                                    var288 = 69;
                                } else if (var284 == 230) {
                                    var288 = 101;
                                } else if (var284 == 223) {
                                    var288 = 115;
                                } else if (var284 == 338) {
                                    var288 = 69;
                                } else if (var284 == 339) {
                                    var288 = 101;
                                } else {
                                    var288 = 0;
                                }
                                var281 = var288;
                                byte var289;
                                if (var286 == 198) {
                                    var289 = 69;
                                } else if (var286 == 230) {
                                    var289 = 101;
                                } else if (var286 == 223) {
                                    var289 = 115;
                                } else if (var286 == 338) {
                                    var289 = 69;
                                } else if (var286 == 339) {
                                    var289 = 101;
                                } else {
                                    var289 = 0;
                                }
                                var282 = var289;
                                char var290 = class150.method2641(var284, var276);
                                char var291 = class150.method2641(var286, var276);
                                if (var290 != var291 && Character.toUpperCase(var290) != Character.toUpperCase(var291)) {
                                    char var292 = Character.toLowerCase(var290);
                                    char var293 = Character.toLowerCase(var291);
                                    if (var292 != var293) {
                                        var283 = class150.method2197(var292, var276) - class150.method2197(var293, var276);
                                        break;
                                    }
                                }
                            }
                            var272[var273] = class147.method192(var283);
                            continue;
                        }
                        if (var383 == 4108) {
                            var5--;
                            String var306 = field387[var5];
                            var4 -= 2;
                            int var307 = field386[var4];
                            int var308 = field386[var4 + 1];
                            byte[] var309 = Statics.field162.method2968(var308, 0);
                            class183 var310 = new class183(var309);
                            field386[var4++] = var310.method3400(var306, var307);
                            continue;
                        }
                        if (var383 == 4109) {
                            var5--;
                            String var311 = field387[var5];
                            var4 -= 2;
                            int var312 = field386[var4];
                            int var313 = field386[var4 + 1];
                            byte[] var314 = Statics.field162.method2968(var313, 0);
                            class183 var315 = new class183(var314);
                            field386[var4++] = var315.method3447(var311, var312);
                            continue;
                        }
                        if (var383 == 4110) {
                            var5 -= 2;
                            String var316 = field387[var5];
                            String var317 = field387[var5 + 1];
                            var4--;
                            if (field386[var4] == 1) {
                                field387[var5++] = var316;
                            } else {
                                field387[var5++] = var317;
                            }
                            continue;
                        }
                        if (var383 == 4111) {
                            var5--;
                            String var318 = field387[var5];
                            field387[var5++] = class185.method3389(var318);
                            continue;
                        }
                        if (var383 == 4112) {
                            var5--;
                            String var319 = field387[var5];
                            var4--;
                            int var320 = field386[var4];
                            field387[var5++] = var319 + (char) var320;
                            continue;
                        }
                        if (var383 == 4113) {
                            var4--;
                            int var321 = field386[var4];
                            int[] var322 = field386;
                            int var323 = var4++;
                            char var324 = (char) var321;
                            boolean var325;
                            if (var324 >= ' ' && var324 <= '~') {
                                var325 = true;
                            } else if (var324 >= 160 && var324 <= 255) {
                                var325 = true;
                            } else if (var324 == 8364 || var324 == 338 || var324 == 8212 || var324 == 339 || var324 == 376) {
                                var325 = true;
                            } else {
                                var325 = false;
                            }
                            var322[var323] = var325 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4114) {
                            var4--;
                            int var326 = field386[var4];
                            field386[var4++] = class147.method2182((char) var326) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4115) {
                            var4--;
                            int var327 = field386[var4];
                            field386[var4++] = class147.method540((char) var327) ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4116) {
                            var4--;
                            int var328 = field386[var4];
                            int[] var329 = field386;
                            int var330 = var4++;
                            char var331 = (char) var328;
                            boolean var332 = var331 >= '0' && var331 <= '9';
                            var329[var330] = var332 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4117) {
                            var5--;
                            String var333 = field387[var5];
                            if (var333 == null) {
                                field386[var4++] = 0;
                            } else {
                                field386[var4++] = var333.length();
                            }
                            continue;
                        }
                        if (var383 == 4118) {
                            var5--;
                            String var334 = field387[var5];
                            var4 -= 2;
                            int var335 = field386[var4];
                            int var336 = field386[var4 + 1];
                            field387[var5++] = var334.substring(var335, var336);
                            continue;
                        }
                        if (var383 == 4119) {
                            var5--;
                            String var337 = field387[var5];
                            StringBuilder var338 = new StringBuilder(var337.length());
                            boolean var339 = false;
                            for (int var340 = 0; var340 < var337.length(); var340++) {
                                char var341 = var337.charAt(var340);
                                if (var341 == '<') {
                                    var339 = true;
                                } else if (var341 == '>') {
                                    var339 = false;
                                } else if (!var339) {
                                    var338.append(var341);
                                }
                            }
                            field387[var5++] = var338.toString();
                            continue;
                        }
                        if (var383 == 4120) {
                            var5--;
                            String var342 = field387[var5];
                            var4--;
                            int var343 = field386[var4];
                            field386[var4++] = var342.indexOf(var343);
                            continue;
                        }
                    } else if (var383 < 4300) {
                        if (var383 == 4200) {
                            var4--;
                            int var344 = field386[var4];
                            field387[var5++] = class40.method41(var344).field984;
                            continue;
                        }
                        if (var383 == 4201) {
                            var4 -= 2;
                            int var345 = field386[var4];
                            int var346 = field386[var4 + 1];
                            class40 var347 = class40.method41(var345);
                            if (var346 >= 1 && var346 <= 5 && var347.field998[var346 - 1] != null) {
                                field387[var5++] = var347.field998[var346 - 1];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 4202) {
                            var4 -= 2;
                            int var348 = field386[var4];
                            int var349 = field386[var4 + 1];
                            class40 var350 = class40.method41(var348);
                            if (var349 >= 1 && var349 <= 5 && var350.field999[var349 - 1] != null) {
                                field387[var5++] = var350.field999[var349 - 1];
                                continue;
                            }
                            field387[var5++] = "";
                            continue;
                        }
                        if (var383 == 4203) {
                            var4--;
                            int var351 = field386[var4];
                            field386[var4++] = class40.method41(var351).field996;
                            continue;
                        }
                        if (var383 == 4204) {
                            var4--;
                            int var352 = field386[var4];
                            field386[var4++] = class40.method41(var352).field995 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var383 == 4205) {
                            var4--;
                            int var353 = field386[var4];
                            class40 var354 = class40.method41(var353);
                            if (var354.field985 == -1 && var354.field1014 >= 0) {
                                field386[var4++] = var354.field1014;
                                continue;
                            }
                            field386[var4++] = var353;
                            continue;
                        }
                        if (var383 == 4206) {
                            var4--;
                            int var355 = field386[var4];
                            class40 var356 = class40.method41(var355);
                            if (var356.field985 >= 0 && var356.field1014 >= 0) {
                                field386[var4++] = var356.field1014;
                                continue;
                            }
                            field386[var4++] = var355;
                            continue;
                        }
                        if (var383 == 4207) {
                            var4--;
                            int var357 = field386[var4];
                            field386[var4++] = class40.method41(var357).field1004 ? 1 : 0;
                            continue;
                        }
                    } else if (var383 < 5100) {
                        if (var383 == 5000) {
                            field386[var4++] = client.field686;
                            continue;
                        }
                        if (var383 == 5001) {
                            var4 -= 3;
                            client.field686 = field386[var4];
                            Statics.field2442 = class137.method2610(field386[var4 + 1]);
                            if (Statics.field2442 == null) {
                                Statics.field2442 = class137.field2309;
                            }
                            client.field661 = field386[var4 + 2];
                            client.field505.method2295(82);
                            client.field505.method2498(client.field686);
                            client.field505.method2498(Statics.field2442.field2311);
                            client.field505.method2498(client.field661);
                            continue;
                        }
                        if (var383 == 5002) {
                            var5--;
                            String var358 = field387[var5];
                            var4 -= 2;
                            int var359 = field386[var4];
                            int var360 = field386[var4 + 1];
                            client.field505.method2295(255);
                            client.field505.method2498(Statics.method1837(var358) + 2);
                            client.field505.method2465(var358);
                            client.field505.method2498(var359 - 1);
                            client.field505.method2498(var360);
                            continue;
                        }
                        if (var383 == 5003) {
                            var4--;
                            int var361 = field386[var4];
                            String var362 = null;
                            if (var361 < 100) {
                                var362 = client.field608[var361];
                            }
                            if (var362 == null) {
                                var362 = "";
                            }
                            field387[var5++] = var362;
                            continue;
                        }
                        if (var383 == 5004) {
                            var4--;
                            int var363 = field386[var4];
                            int var364 = -1;
                            if (var363 < 100 && client.field608[var363] != null) {
                                var364 = client.field680[var363];
                            }
                            field386[var4++] = var364;
                            continue;
                        }
                        if (var383 == 5005) {
                            if (Statics.field2442 == null) {
                                field386[var4++] = -1;
                            } else {
                                field386[var4++] = Statics.field2442.field2311;
                            }
                            continue;
                        }
                        if (var383 == 5008) {
                            var5--;
                            String var365 = field387[var5];
                            if (var365.startsWith("::")) {
                                client.method1556(var365);
                            } else {
                                String var366 = var365.toLowerCase();
                                byte var367 = 0;
                                if (var366.startsWith(class134.field2234)) {
                                    var367 = 0;
                                    var365 = var365.substring(class134.field2234.length());
                                } else if (var366.startsWith(class134.field2236)) {
                                    var367 = 1;
                                    var365 = var365.substring(class134.field2236.length());
                                } else if (var366.startsWith(class134.field2238)) {
                                    var367 = 2;
                                    var365 = var365.substring(class134.field2238.length());
                                } else if (var366.startsWith(class134.field2240)) {
                                    var367 = 3;
                                    var365 = var365.substring(class134.field2240.length());
                                } else if (var366.startsWith(class134.field2097)) {
                                    var367 = 4;
                                    var365 = var365.substring(class134.field2097.length());
                                } else if (var366.startsWith(class134.field2147)) {
                                    var367 = 5;
                                    var365 = var365.substring(class134.field2147.length());
                                } else if (var366.startsWith(class134.field2246)) {
                                    var367 = 6;
                                    var365 = var365.substring(class134.field2246.length());
                                } else if (var366.startsWith(class134.field2248)) {
                                    var367 = 7;
                                    var365 = var365.substring(class134.field2248.length());
                                } else if (var366.startsWith(class134.field2250)) {
                                    var367 = 8;
                                    var365 = var365.substring(class134.field2250.length());
                                } else if (var366.startsWith(class134.field2222)) {
                                    var367 = 9;
                                    var365 = var365.substring(class134.field2222.length());
                                } else if (var366.startsWith(class134.field2254)) {
                                    var367 = 10;
                                    var365 = var365.substring(class134.field2254.length());
                                } else if (var366.startsWith(class134.field2281)) {
                                    var367 = 11;
                                    var365 = var365.substring(class134.field2281.length());
                                } else if (client.field573 != 0) {
                                    if (var366.startsWith(class134.field2235)) {
                                        var367 = 0;
                                        var365 = var365.substring(class134.field2235.length());
                                    } else if (var366.startsWith(class134.field2237)) {
                                        var367 = 1;
                                        var365 = var365.substring(class134.field2237.length());
                                    } else if (var366.startsWith(class134.field2179)) {
                                        var367 = 2;
                                        var365 = var365.substring(class134.field2179.length());
                                    } else if (var366.startsWith(class134.field2241)) {
                                        var367 = 3;
                                        var365 = var365.substring(class134.field2241.length());
                                    } else if (var366.startsWith(class134.field2103)) {
                                        var367 = 4;
                                        var365 = var365.substring(class134.field2103.length());
                                    } else if (var366.startsWith(class134.field2112)) {
                                        var367 = 5;
                                        var365 = var365.substring(class134.field2112.length());
                                    } else if (var366.startsWith(class134.field2247)) {
                                        var367 = 6;
                                        var365 = var365.substring(class134.field2247.length());
                                    } else if (var366.startsWith(class134.field2220)) {
                                        var367 = 7;
                                        var365 = var365.substring(class134.field2220.length());
                                    } else if (var366.startsWith(class134.field2124)) {
                                        var367 = 8;
                                        var365 = var365.substring(class134.field2124.length());
                                    } else if (var366.startsWith(class134.field2251)) {
                                        var367 = 9;
                                        var365 = var365.substring(class134.field2251.length());
                                    } else if (var366.startsWith(class134.field2255)) {
                                        var367 = 10;
                                        var365 = var365.substring(class134.field2255.length());
                                    } else if (var366.startsWith(class134.field2257)) {
                                        var367 = 11;
                                        var365 = var365.substring(class134.field2257.length());
                                    }
                                }
                                String var368 = var365.toLowerCase();
                                byte var369 = 0;
                                if (var368.startsWith(class134.field2258)) {
                                    var369 = 1;
                                    var365 = var365.substring(class134.field2258.length());
                                } else if (var368.startsWith(class134.field2260)) {
                                    var369 = 2;
                                    var365 = var365.substring(class134.field2260.length());
                                } else if (var368.startsWith(class134.field2207)) {
                                    var369 = 3;
                                    var365 = var365.substring(class134.field2207.length());
                                } else if (var368.startsWith(class134.field2264)) {
                                    var369 = 4;
                                    var365 = var365.substring(class134.field2264.length());
                                } else if (var368.startsWith(class134.field2208)) {
                                    var369 = 5;
                                    var365 = var365.substring(class134.field2208.length());
                                } else if (client.field573 != 0) {
                                    if (var368.startsWith(class134.field2259)) {
                                        var369 = 1;
                                        var365 = var365.substring(class134.field2259.length());
                                    } else if (var368.startsWith(class134.field2261)) {
                                        var369 = 2;
                                        var365 = var365.substring(class134.field2261.length());
                                    } else if (var368.startsWith(class134.field2263)) {
                                        var369 = 3;
                                        var365 = var365.substring(class134.field2263.length());
                                    } else if (var368.startsWith(class134.field2265)) {
                                        var369 = 4;
                                        var365 = var365.substring(class134.field2265.length());
                                    } else if (var368.startsWith(class134.field2178)) {
                                        var369 = 5;
                                        var365 = var365.substring(class134.field2178.length());
                                    }
                                }
                                client.field505.method2295(208);
                                client.field505.method2498(0);
                                int var370 = client.field505.field2023;
                                client.field505.method2498(var367);
                                client.field505.method2498(var369);
                                class184.method2735(client.field505, var365);
                                client.field505.method2411(client.field505.field2023 - var370);
                            }
                            continue;
                        }
                        if (var383 == 5009) {
                            var5 -= 2;
                            String var371 = field387[var5];
                            String var372 = field387[var5 + 1];
                            client.field505.method2295(35);
                            client.field505.method2401(0);
                            int var373 = client.field505.field2023;
                            client.field505.method2465(var371);
                            class184.method2735(client.field505, var372);
                            client.field505.method2410(client.field505.field2023 - var373);
                            continue;
                        }
                        if (var383 == 5010) {
                            var4--;
                            int var374 = field386[var4];
                            String var375 = null;
                            if (var374 < 100) {
                                var375 = client.field663[var374];
                            }
                            if (var375 == null) {
                                var375 = "";
                            }
                            field387[var5++] = var375;
                            continue;
                        }
                        if (var383 == 5011) {
                            var4--;
                            int var376 = field386[var4];
                            String var377 = null;
                            if (var376 < 100) {
                                var377 = client.field569[var376];
                            }
                            if (var377 == null) {
                                var377 = "";
                            }
                            field387[var5++] = var377;
                            continue;
                        }
                        if (var383 == 5015) {
                            String var378;
                            if (Statics.field2706 == null || Statics.field2706.field50 == null) {
                                var378 = "";
                            } else {
                                var378 = Statics.field2706.field50;
                            }
                            field387[var5++] = var378;
                            continue;
                        }
                        if (var383 == 5016) {
                            field386[var4++] = client.field661;
                            continue;
                        }
                        if (var383 == 5017) {
                            field386[var4++] = client.field684;
                            continue;
                        }
                    }
                } else {
                    class158 var84;
                    if (var383 >= 2000) {
                        var383 -= 1000;
                        var4--;
                        var84 = class158.method2199(field386[var4]);
                    } else {
                        var84 = var61 ? Statics.field390 : Statics.field1968;
                    }
                    if (var383 == 1300) {
                        var4--;
                        int var85 = field386[var4] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var5--;
                            var84.method3098(var85, field387[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var383 == 1301) {
                        var4 -= 2;
                        int var86 = field386[var4];
                        int var87 = field386[var4 + 1];
                        var84.field2639 = class158.method2290(var86, var87);
                        continue;
                    }
                    if (var383 == 1302) {
                        var4--;
                        var84.field2637 = field386[var4] == 1;
                        continue;
                    }
                    if (var383 == 1303) {
                        var4--;
                        var84.field2635 = field386[var4];
                        continue;
                    }
                    if (var383 == 1304) {
                        var4--;
                        var84.field2636 = field386[var4];
                        continue;
                    }
                    if (var383 == 1305) {
                        var5--;
                        var84.field2632 = field387[var5];
                        continue;
                    }
                    if (var383 == 1306) {
                        var5--;
                        var84.field2653 = field387[var5];
                        continue;
                    }
                    if (var383 == 1307) {
                        var84.field2633 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var382) {
            StringBuilder var380 = new StringBuilder(30);
            var380.append("").append(var3.field2814).append(" ");
            for (int var381 = field388 - 1; var381 >= 0; var381--) {
                var380.append("").append(field394[var381].field251.field2814).append(" ");
            }
            var380.append("").append(var9);
            class80.method815(var380.toString(), var382);
        }
    }

    @ObfuscatedName("bj.m(IB)V")
    public static void method1436(int arg0) {
        if (arg0 == -1 || !class158.method1643(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2588[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2666 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field3 = var3.field2666;
                method132(var4);
            }
        }
    }
}
