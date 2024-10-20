package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aq")
public class class32 {

    @ObfuscatedName("aq.k")
    public static int[] field709 = new int[5];

    @ObfuscatedName("aq.l")
    public static int[][] field710 = new int[5][5000];

    @ObfuscatedName("aq.e")
    public static int[] field711 = new int[1000];

    @ObfuscatedName("aq.j")
    public static String[] field712 = new String[1000];

    @ObfuscatedName("aq.n")
    public static int field713 = 0;

    @ObfuscatedName("aq.f")
    public static class13[] field714 = new class13[50];

    @ObfuscatedName("aq.y")
    public static Calendar field708 = Calendar.getInstance();

    @ObfuscatedName("aq.p")
    public static final String[] field716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("a.g(Lg;I)V")
    public static void method120(class1 arg0) {
        method847(arg0, 200000);
    }

    @ObfuscatedName("al.v(Lg;IS)V")
    public static void method847(class1 arg0, int arg1) {
        Object[] var2 = arg0.field4;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method509(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field528;
        int[] var9 = var4.field529;
        byte var10 = -1;
        field713 = 0;
        try {
            Statics.field2878 = new int[var4.field540];
            int var11 = 0;
            Statics.field1896 = new String[var4.field532];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2597;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2530;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2597;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2530;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field2878[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field8;
                    }
                    Statics.field1896[var12++] = var15;
                }
            }
            int var16 = 0;
            label2484: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var392 = var8[var7];
                if (var392 < 100) {
                    if (var392 == 0) {
                        field711[var5++] = var9[var7];
                        continue;
                    }
                    if (var392 == 1) {
                        int var17 = var9[var7];
                        field711[var5++] = class154.field2660[var17];
                        continue;
                    }
                    if (var392 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2660[var18] = field711[var5];
                        client.method2676(var18);
                        continue;
                    }
                    if (var392 == 3) {
                        field712[var6++] = var4.field530[var7];
                        continue;
                    }
                    if (var392 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var392 == 7) {
                        var5 -= 2;
                        if (field711[var5 + 1] != field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 8) {
                        var5 -= 2;
                        if (field711[var5 + 1] == field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 9) {
                        var5 -= 2;
                        if (field711[var5] < field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 10) {
                        var5 -= 2;
                        if (field711[var5] > field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 21) {
                        if (field713 == 0) {
                            return;
                        }
                        class13 var19 = field714[--field713];
                        var4 = var19.field187;
                        var8 = var4.field528;
                        var9 = var4.field529;
                        var7 = var19.field184;
                        Statics.field2878 = var19.field185;
                        Statics.field1896 = var19.field191;
                        continue;
                    }
                    if (var392 == 25) {
                        int var20 = var9[var7];
                        field711[var5++] = class154.method2684(var20);
                        continue;
                    }
                    if (var392 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field711[var5];
                        class42 var23 = class42.method514(var21);
                        int var24 = var23.field979;
                        int var25 = var23.field972;
                        int var26 = var23.field971;
                        int var27 = class154.field2659[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class154.field2660[var24] = class154.field2660[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var392 == 31) {
                        var5 -= 2;
                        if (field711[var5] <= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 32) {
                        var5 -= 2;
                        if (field711[var5] >= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var392 == 33) {
                        field711[var5++] = Statics.field2878[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var392 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field2878[var10001] = field711[var5];
                        continue;
                    }
                    if (var392 == 35) {
                        field712[var6++] = Statics.field1896[var9[var7]];
                        continue;
                    }
                    if (var392 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1896[var10001] = field712[var6];
                        continue;
                    }
                    if (var392 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field712;
                        String var31;
                        if (var29 == 0) {
                            var31 = "";
                        } else if (var29 == 1) {
                            String var32 = var30[var6];
                            if (var32 == null) {
                                var31 = "null";
                            } else {
                                var31 = var32.toString();
                            }
                        } else {
                            int var33 = var6 + var29;
                            int var34 = 0;
                            for (int var35 = var6; var35 < var33; var35++) {
                                String var36 = var30[var35];
                                if (var36 == null) {
                                    var34 += 4;
                                } else {
                                    var34 += var36.length();
                                }
                            }
                            StringBuilder var37 = new StringBuilder(var34);
                            for (int var38 = var6; var38 < var33; var38++) {
                                String var39 = var30[var38];
                                if (var39 == null) {
                                    var37.append("null");
                                } else {
                                    var37.append(var39);
                                }
                            }
                            var31 = var37.toString();
                        }
                        field712[var6++] = var31;
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
                        int var41 = var9[var7];
                        class19 var42 = class19.method509(var41);
                        int[] var43 = new int[var42.field540];
                        String[] var44 = new String[var42.field532];
                        for (int var45 = 0; var45 < var42.field527; var45++) {
                            var43[var45] = field711[var5 - var42.field527 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field534; var46++) {
                            var44[var46] = field712[var6 - var42.field534 + var46];
                        }
                        var5 -= var42.field527;
                        var6 -= var42.field534;
                        class13 var47 = new class13();
                        var47.field187 = var4;
                        var47.field184 = var7;
                        var47.field185 = Statics.field2878;
                        var47.field191 = Statics.field1896;
                        field714[++field713 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field528;
                        var9 = var42.field529;
                        var7 = -1;
                        Statics.field2878 = var43;
                        Statics.field1896 = var44;
                        continue;
                    }
                    if (var392 == 42) {
                        field711[var5++] = client.field408[var9[var7]];
                        continue;
                    }
                    if (var392 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field408[var10001] = field711[var5];
                        continue;
                    }
                    if (var392 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field711[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field709[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2484;
                                }
                                field710[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field711[var5];
                        if (var54 >= 0 && var54 < field709[var53]) {
                            field711[var5++] = field710[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field711[var5];
                        if (var56 >= 0 && var56 < field709[var55]) {
                            field710[var55][var56] = field711[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var392 == 47) {
                        String var57 = client.field445[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field712[var6++] = var57;
                        continue;
                    }
                    if (var392 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field445[var10001] = field712[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var392 < 1000) {
                    if (var392 == 100) {
                        var5 -= 3;
                        int var59 = field711[var5];
                        int var60 = field711[var5 + 1];
                        int var61 = field711[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var62 = class152.method2801(var59);
                        if (var62.field2637 == null) {
                            var62.field2637 = new class152[var61 + 1];
                        }
                        if (var62.field2637.length <= var61) {
                            class152[] var63 = new class152[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2637.length; var64++) {
                                var63[var64] = var62.field2637[var64];
                            }
                            var62.field2637 = var63;
                        }
                        if (var61 > 0 && var62.field2637[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class152 var65 = new class152();
                        var65.field2566 = var60;
                        var65.field2540 = var65.field2597 = var62.field2597;
                        var65.field2530 = var61;
                        var65.field2613 = true;
                        var62.field2637[var61] = var65;
                        if (var58) {
                            Statics.field1257 = var65;
                        } else {
                            Statics.field2121 = var65;
                        }
                        client.method2553(var62);
                        continue;
                    }
                    if (var392 == 101) {
                        class152 var66 = var58 ? Statics.field1257 : Statics.field2121;
                        class152 var67 = class152.method2801(var66.field2597);
                        var67.field2637[var66.field2530] = null;
                        client.method2553(var67);
                        continue;
                    }
                    if (var392 == 102) {
                        var5--;
                        class152 var68 = class152.method2801(field711[var5]);
                        var68.field2637 = null;
                        client.method2553(var68);
                        continue;
                    }
                    if (var392 == 200) {
                        var5 -= 2;
                        int var69 = field711[var5];
                        int var70 = field711[var5 + 1];
                        class152 var71 = class152.method2342(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field711[var5++] = 1;
                            if (var58) {
                                Statics.field1257 = var71;
                            } else {
                                Statics.field2121 = var71;
                            }
                            continue;
                        }
                        field711[var5++] = 0;
                        continue;
                    }
                } else if (var392 >= 1000 && var392 < 1100 || var392 >= 2000 && var392 < 2100) {
                    class152 var72;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var72 = class152.method2801(field711[var5]);
                    } else {
                        var72 = var58 ? Statics.field1257 : Statics.field2121;
                    }
                    if (var392 == 1000) {
                        var5 -= 2;
                        var72.field2534 = field711[var5];
                        var72.field2582 = field711[var5 + 1];
                        client.method2553(var72);
                        continue;
                    }
                    if (var392 == 1001) {
                        var5 -= 2;
                        var72.field2608 = field711[var5];
                        var72.field2548 = field711[var5 + 1];
                        client.method2553(var72);
                        continue;
                    }
                    if (var392 == 1003) {
                        var5--;
                        boolean var73 = field711[var5] == 1;
                        if (var72.field2541 != var73) {
                            var72.field2541 = var73;
                            client.method2553(var72);
                        }
                        continue;
                    }
                } else if (var392 >= 1100 && var392 < 1200 || var392 >= 2100 && var392 < 2200) {
                    class152 var74;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var74 = class152.method2801(field711[var5]);
                    } else {
                        var74 = var58 ? Statics.field1257 : Statics.field2121;
                    }
                    if (var392 == 1100) {
                        var5 -= 2;
                        var74.field2542 = field711[var5];
                        if (var74.field2542 > var74.field2544 - var74.field2608) {
                            var74.field2542 = var74.field2544 - var74.field2608;
                        }
                        if (var74.field2542 < 0) {
                            var74.field2542 = 0;
                        }
                        var74.field2543 = field711[var5 + 1];
                        if (var74.field2543 > var74.field2545 - var74.field2548) {
                            var74.field2543 = var74.field2545 - var74.field2548;
                        }
                        if (var74.field2543 < 0) {
                            var74.field2543 = 0;
                        }
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1101) {
                        var5--;
                        var74.field2546 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1102) {
                        var5--;
                        var74.field2550 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1103) {
                        var5--;
                        var74.field2551 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1104) {
                        var5--;
                        var74.field2569 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1105) {
                        var5--;
                        var74.field2628 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1106) {
                        var5--;
                        var74.field2555 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1107) {
                        var5--;
                        var74.field2556 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1108) {
                        var74.field2561 = 1;
                        var5--;
                        var74.field2562 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1109) {
                        var5 -= 6;
                        var74.field2567 = field711[var5];
                        var74.field2568 = field711[var5 + 1];
                        var74.field2528 = field711[var5 + 2];
                        var74.field2570 = field711[var5 + 3];
                        var74.field2571 = field711[var5 + 4];
                        var74.field2636 = field711[var5 + 5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1110) {
                        var5--;
                        int var75 = field711[var5];
                        if (var74.field2565 != var75) {
                            var74.field2565 = var75;
                            var74.field2635 = 0;
                            var74.field2563 = 0;
                            client.method2553(var74);
                        }
                        continue;
                    }
                    if (var392 == 1111) {
                        var5--;
                        var74.field2574 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1112) {
                        var6--;
                        String var76 = field712[var6];
                        if (!var76.equals(var74.field2576)) {
                            var74.field2576 = var76;
                            client.method2553(var74);
                        }
                        continue;
                    }
                    if (var392 == 1113) {
                        var5--;
                        var74.field2575 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1114) {
                        var5 -= 3;
                        var74.field2621 = field711[var5];
                        var74.field2620 = field711[var5 + 1];
                        var74.field2578 = field711[var5 + 2];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1115) {
                        var5--;
                        var74.field2581 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1116) {
                        var5--;
                        var74.field2557 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1117) {
                        var5--;
                        var74.field2558 = field711[var5];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1118) {
                        var5--;
                        var74.field2559 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1119) {
                        var5--;
                        var74.field2589 = field711[var5] == 1;
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1120) {
                        var5 -= 2;
                        var74.field2544 = field711[var5];
                        var74.field2545 = field711[var5 + 1];
                        client.method2553(var74);
                        continue;
                    }
                    if (var392 == 1121) {
                        int var77 = var74.field2597;
                        int var78 = var74.field2530;
                        client.field290.method2354(250);
                        client.field290.method2236(var77);
                        client.field290.method2216(var78);
                        client.field413 = var74;
                        client.method2553(var74);
                        continue;
                    }
                } else if (!(var392 < 1200 || var392 >= 1300) || !(var392 < 2200 || var392 >= 2300)) {
                    class152 var79;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var79 = class152.method2801(field711[var5]);
                    } else {
                        var79 = var58 ? Statics.field1257 : Statics.field2121;
                    }
                    client.method2553(var79);
                    if (var392 == 1200) {
                        var5 -= 2;
                        int var80 = field711[var5];
                        int var81 = field711[var5 + 1];
                        var79.field2633 = var80;
                        var79.field2533 = var81;
                        class45 var82 = class45.method744(var80);
                        var79.field2528 = var82.field1008;
                        var79.field2570 = var82.field1020;
                        var79.field2571 = var82.field1021;
                        var79.field2567 = var82.field1036;
                        var79.field2568 = var82.field1023;
                        var79.field2636 = var82.field1019;
                        if (var79.field2608 > 0) {
                            var79.field2636 = var79.field2636 * 32 / var79.field2608;
                        }
                        continue;
                    }
                    if (var392 == 1201) {
                        var79.field2561 = 2;
                        var5--;
                        var79.field2562 = field711[var5];
                        continue;
                    }
                    if (var392 == 1202) {
                        var79.field2561 = 3;
                        var79.field2562 = Statics.field61.field40.method2911();
                        continue;
                    }
                } else if (var392 >= 1300 && var392 < 1400 || var392 >= 2300 && var392 < 2400) {
                    class152 var83;
                    if (var392 >= 2000) {
                        var392 -= 1000;
                        var5--;
                        var83 = class152.method2801(field711[var5]);
                    } else {
                        var83 = var58 ? Statics.field1257 : Statics.field2121;
                    }
                    if (var392 == 1300) {
                        var5--;
                        int var84 = field711[var5] - 1;
                        if (var84 >= 0 && var84 <= 9) {
                            var6--;
                            var83.method2842(var84, field712[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var392 == 1301) {
                        var5 -= 2;
                        int var85 = field711[var5];
                        int var86 = field711[var5 + 1];
                        var83.field2591 = class152.method2342(var85, var86);
                        continue;
                    }
                    if (var392 == 1302) {
                        var5--;
                        var83.field2594 = field711[var5] == 1;
                        continue;
                    }
                    if (var392 == 1303) {
                        var5--;
                        var83.field2592 = field711[var5];
                        continue;
                    }
                    if (var392 == 1304) {
                        var5--;
                        var83.field2593 = field711[var5];
                        continue;
                    }
                    if (var392 == 1305) {
                        var6--;
                        var83.field2579 = field712[var6];
                        continue;
                    }
                    if (var392 == 1306) {
                        var6--;
                        var83.field2642 = field712[var6];
                        continue;
                    }
                    if (var392 == 1307) {
                        var83.field2590 = null;
                        continue;
                    }
                } else {
                    if (var392 >= 1400 && var392 < 1500 || var392 >= 2400 && var392 < 2500) {
                        class152 var87;
                        if (var392 >= 2000) {
                            var392 -= 1000;
                            var5--;
                            var87 = class152.method2801(field711[var5]);
                        } else {
                            var87 = var58 ? Statics.field1257 : Statics.field2121;
                        }
                        var6--;
                        String var88 = field712[var6];
                        int[] var89 = null;
                        if (var88.length() > 0 && var88.charAt(var88.length() - 1) == 'Y') {
                            var5--;
                            int var90 = field711[var5];
                            if (var90 > 0) {
                                var89 = new int[var90];
                                while (var90-- > 0) {
                                    var5--;
                                    var89[var90] = field711[var5];
                                }
                            }
                            var88 = var88.substring(0, var88.length() - 1);
                        }
                        Object[] var91 = new Object[var88.length() + 1];
                        for (int var92 = var91.length - 1; var92 >= 1; var92--) {
                            if (var88.charAt(var92 - 1) == 's') {
                                var6--;
                                var91[var92] = field712[var6];
                            } else {
                                var5--;
                                var91[var92] = Integer.valueOf(field711[var5]);
                            }
                        }
                        var5--;
                        int var93 = field711[var5];
                        if (var93 == -1) {
                            var91 = null;
                        } else {
                            var91[0] = Integer.valueOf(var93);
                        }
                        if (var392 == 1400) {
                            var87.field2552 = var91;
                        }
                        if (var392 == 1401) {
                            var87.field2601 = var91;
                        }
                        if (var392 == 1402) {
                            var87.field2600 = var91;
                        }
                        if (var392 == 1403) {
                            var87.field2560 = var91;
                        }
                        if (var392 == 1404) {
                            var87.field2634 = var91;
                        }
                        if (var392 == 1405) {
                            var87.field2605 = var91;
                        }
                        if (var392 == 1406) {
                            var87.field2531 = var91;
                        }
                        if (var392 == 1407) {
                            var87.field2609 = var91;
                            var87.field2610 = var89;
                        }
                        if (var392 == 1408) {
                            var87.field2615 = var91;
                        }
                        if (var392 == 1409) {
                            var87.field2553 = var91;
                        }
                        if (var392 == 1410) {
                            var87.field2606 = var91;
                        }
                        if (var392 == 1411) {
                            var87.field2599 = var91;
                        }
                        if (var392 == 1412) {
                            var87.field2603 = var91;
                        }
                        if (var392 == 1414) {
                            var87.field2611 = var91;
                            var87.field2612 = var89;
                        }
                        if (var392 == 1415) {
                            var87.field2626 = var91;
                            var87.field2614 = var89;
                        }
                        if (var392 == 1416) {
                            var87.field2607 = var91;
                        }
                        if (var392 == 1417) {
                            var87.field2617 = var91;
                        }
                        if (var392 == 1418) {
                            var87.field2539 = var91;
                        }
                        if (var392 == 1419) {
                            var87.field2547 = var91;
                        }
                        if (var392 == 1420) {
                            var87.field2580 = var91;
                        }
                        if (var392 == 1421) {
                            var87.field2572 = var91;
                        }
                        if (var392 == 1422) {
                            var87.field2622 = var91;
                        }
                        if (var392 == 1423) {
                            var87.field2623 = var91;
                        }
                        if (var392 == 1424) {
                            var87.field2640 = var91;
                        }
                        var87.field2596 = true;
                        continue;
                    }
                    if (var392 < 1600) {
                        class152 var94 = var58 ? Statics.field1257 : Statics.field2121;
                        if (var392 == 1500) {
                            field711[var5++] = var94.field2534;
                            continue;
                        }
                        if (var392 == 1501) {
                            field711[var5++] = var94.field2582;
                            continue;
                        }
                        if (var392 == 1502) {
                            field711[var5++] = var94.field2608;
                            continue;
                        }
                        if (var392 == 1503) {
                            field711[var5++] = var94.field2548;
                            continue;
                        }
                        if (var392 == 1504) {
                            field711[var5++] = var94.field2541 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 1505) {
                            field711[var5++] = var94.field2540;
                            continue;
                        }
                    } else if (var392 < 1700) {
                        class152 var95 = var58 ? Statics.field1257 : Statics.field2121;
                        if (var392 == 1600) {
                            field711[var5++] = var95.field2542;
                            continue;
                        }
                        if (var392 == 1601) {
                            field711[var5++] = var95.field2543;
                            continue;
                        }
                        if (var392 == 1602) {
                            field712[var6++] = var95.field2576;
                            continue;
                        }
                        if (var392 == 1603) {
                            field711[var5++] = var95.field2544;
                            continue;
                        }
                        if (var392 == 1604) {
                            field711[var5++] = var95.field2545;
                            continue;
                        }
                        if (var392 == 1605) {
                            field711[var5++] = var95.field2636;
                            continue;
                        }
                        if (var392 == 1606) {
                            field711[var5++] = var95.field2528;
                            continue;
                        }
                        if (var392 == 1607) {
                            field711[var5++] = var95.field2571;
                            continue;
                        }
                        if (var392 == 1608) {
                            field711[var5++] = var95.field2570;
                            continue;
                        }
                    } else if (var392 < 1800) {
                        class152 var96 = var58 ? Statics.field1257 : Statics.field2121;
                        if (var392 == 1700) {
                            field711[var5++] = var96.field2633;
                            continue;
                        }
                        if (var392 == 1701) {
                            if (var96.field2633 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var96.field2533;
                            }
                            continue;
                        }
                        if (var392 == 1702) {
                            field711[var5++] = var96.field2530;
                            continue;
                        }
                    } else if (var392 < 1900) {
                        class152 var97 = var58 ? Statics.field1257 : Statics.field2121;
                        if (var392 == 1800) {
                            field711[var5++] = class156.method562(client.method37(var97));
                            continue;
                        }
                        if (var392 == 1801) {
                            var5--;
                            int var98 = field711[var5];
                            int var393 = var98 - 1;
                            if (var97.field2590 != null && var393 < var97.field2590.length && var97.field2590[var393] != null) {
                                field712[var6++] = var97.field2590[var393];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 1802) {
                            if (var97.field2579 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var97.field2579;
                            }
                            continue;
                        }
                    } else if (var392 < 2600) {
                        var5--;
                        class152 var99 = class152.method2801(field711[var5]);
                        if (var392 == 2500) {
                            field711[var5++] = var99.field2534;
                            continue;
                        }
                        if (var392 == 2501) {
                            field711[var5++] = var99.field2582;
                            continue;
                        }
                        if (var392 == 2502) {
                            field711[var5++] = var99.field2608;
                            continue;
                        }
                        if (var392 == 2503) {
                            field711[var5++] = var99.field2548;
                            continue;
                        }
                        if (var392 == 2504) {
                            field711[var5++] = var99.field2541 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 2505) {
                            field711[var5++] = var99.field2540;
                            continue;
                        }
                    } else if (var392 < 2700) {
                        var5--;
                        class152 var100 = class152.method2801(field711[var5]);
                        if (var392 == 2600) {
                            field711[var5++] = var100.field2542;
                            continue;
                        }
                        if (var392 == 2601) {
                            field711[var5++] = var100.field2543;
                            continue;
                        }
                        if (var392 == 2602) {
                            field712[var6++] = var100.field2576;
                            continue;
                        }
                        if (var392 == 2603) {
                            field711[var5++] = var100.field2544;
                            continue;
                        }
                        if (var392 == 2604) {
                            field711[var5++] = var100.field2545;
                            continue;
                        }
                        if (var392 == 2605) {
                            field711[var5++] = var100.field2636;
                            continue;
                        }
                        if (var392 == 2606) {
                            field711[var5++] = var100.field2528;
                            continue;
                        }
                        if (var392 == 2607) {
                            field711[var5++] = var100.field2571;
                            continue;
                        }
                        if (var392 == 2608) {
                            field711[var5++] = var100.field2570;
                            continue;
                        }
                    } else if (var392 < 2800) {
                        if (var392 == 2700) {
                            var5--;
                            class152 var101 = class152.method2801(field711[var5]);
                            field711[var5++] = var101.field2633;
                            continue;
                        }
                        if (var392 == 2701) {
                            var5--;
                            class152 var102 = class152.method2801(field711[var5]);
                            if (var102.field2633 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var102.field2533;
                            }
                            continue;
                        }
                        if (var392 == 2702) {
                            var5--;
                            int var103 = field711[var5];
                            class4 var104 = (class4) client.field410.method3201((long) var103);
                            if (var104 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var392 < 2900) {
                        var5--;
                        class152 var105 = class152.method2801(field711[var5]);
                        if (var392 == 2800) {
                            field711[var5++] = class156.method562(client.method37(var105));
                            continue;
                        }
                        if (var392 == 2801) {
                            var5--;
                            int var106 = field711[var5];
                            int var394 = var106 - 1;
                            if (var105.field2590 != null && var394 < var105.field2590.length && var105.field2590[var394] != null) {
                                field712[var6++] = var105.field2590[var394];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 2802) {
                            if (var105.field2579 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = var105.field2579;
                            }
                            continue;
                        }
                    } else if (var392 < 3200) {
                        if (var392 == 3100) {
                            var6--;
                            String var107 = field712[var6];
                            Statics.method1994(0, "", var107);
                            continue;
                        }
                        if (var392 == 3101) {
                            var5 -= 2;
                            client.method127(Statics.field61, field711[var5], field711[var5 + 1]);
                            continue;
                        }
                        if (var392 == 3103) {
                            client.method134();
                            continue;
                        }
                        if (var392 == 3104) {
                            var6--;
                            String var108 = field712[var6];
                            int var109 = 0;
                            boolean var110 = false;
                            boolean var111 = false;
                            int var112 = 0;
                            int var113 = var108.length();
                            int var114 = 0;
                            boolean var116;
                            while (true) {
                                if (var114 >= var113) {
                                    var116 = var111;
                                    break;
                                }
                                label2687: {
                                    char var115 = var108.charAt(var114);
                                    if (var114 == 0) {
                                        if (var115 == '-') {
                                            var110 = true;
                                            break label2687;
                                        }
                                        if (var115 == '+') {
                                            break label2687;
                                        }
                                    }
                                    int var395;
                                    if (var115 >= '0' && var115 <= '9') {
                                        var395 = var115 - '0';
                                    } else if (var115 >= 'A' && var115 <= 'Z') {
                                        var395 = var115 - '7';
                                    } else {
                                        if (var115 < 'a' || var115 > 'z') {
                                            var116 = false;
                                            break;
                                        }
                                        var395 = var115 - 'W';
                                    }
                                    if (var395 >= 10) {
                                        var116 = false;
                                        break;
                                    }
                                    if (var110) {
                                        var395 = -var395;
                                    }
                                    int var117 = var112 * 10 + var395;
                                    if (var117 / 10 != var112) {
                                        var116 = false;
                                        break;
                                    }
                                    var112 = var117;
                                    var111 = true;
                                }
                                var114++;
                            }
                            if (var116) {
                                var109 = class199.method1889(var108);
                            }
                            client.field290.method2354(44);
                            client.field290.method2236(var109);
                            continue;
                        }
                        if (var392 == 3105) {
                            var6--;
                            String var119 = field712[var6];
                            client.field290.method2354(58);
                            client.field290.method2126(var119.length() + 1);
                            client.field290.method2257(var119);
                            continue;
                        }
                        if (var392 == 3106) {
                            var6--;
                            String var120 = field712[var6];
                            client.field290.method2354(65);
                            client.field290.method2126(var120.length() + 1);
                            client.field290.method2257(var120);
                            continue;
                        }
                        if (var392 == 3107) {
                            var5--;
                            int var121 = field711[var5];
                            var6--;
                            String var122 = field712[var6];
                            boolean var123 = false;
                            for (int var124 = 0; var124 < client.field337; var124++) {
                                class3 var125 = client.field433[client.field369[var124]];
                                if (var125 != null && var125.field45 != null && var125.field45.equalsIgnoreCase(var122)) {
                                    if (var121 == 1) {
                                        client.field290.method2354(135);
                                        client.field290.method2169(client.field369[var124]);
                                        client.field290.method2126(0);
                                    } else if (var121 == 4) {
                                        client.field290.method2354(141);
                                        client.field290.method2216(client.field369[var124]);
                                        client.field290.method2126(0);
                                    } else if (var121 == 6) {
                                        client.field290.method2354(62);
                                        client.field290.method2169(client.field369[var124]);
                                        client.field290.method2162(0);
                                    } else if (var121 == 7) {
                                        client.field290.method2354(82);
                                        client.field290.method2170(client.field369[var124]);
                                        client.field290.method2126(0);
                                    }
                                    var123 = true;
                                    break;
                                }
                            }
                            if (!var123) {
                                Statics.method1994(4, "", class142.field2305 + var122);
                            }
                            continue;
                        }
                        if (var392 == 3108) {
                            var5 -= 3;
                            int var126 = field711[var5];
                            int var127 = field711[var5 + 1];
                            int var128 = field711[var5 + 2];
                            class152 var129 = class152.method2801(var128);
                            client.method2372(var129, var126, var127);
                            continue;
                        }
                        if (var392 == 3109) {
                            var5 -= 2;
                            int var130 = field711[var5];
                            int var131 = field711[var5 + 1];
                            class152 var132 = var58 ? Statics.field1257 : Statics.field2121;
                            client.method2372(var132, var130, var131);
                            continue;
                        }
                        if (var392 == 3110) {
                            var5--;
                            Statics.field2761 = field711[var5] == 1;
                            continue;
                        }
                        if (var392 == 3111) {
                            field711[var5++] = Statics.field123.field140 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3112) {
                            var5--;
                            Statics.field123.field140 = field711[var5] == 1;
                            class9.method2441();
                            continue;
                        }
                        if (var392 == 3113) {
                            var6--;
                            String var133 = field712[var6];
                            var5--;
                            boolean var134 = field711[var5] == 1;
                            class125.method757(var133, var134, false);
                            continue;
                        }
                    } else if (var392 < 3300) {
                        if (var392 == 3200) {
                            var5 -= 3;
                            int var135 = field711[var5];
                            int var136 = field711[var5 + 1];
                            int var137 = field711[var5 + 2];
                            if (client.field356 != 0 && var136 != 0 && client.field439 < 50) {
                                client.field486[client.field439] = var135;
                                client.field301[client.field439] = var136;
                                client.field488[client.field439] = var137;
                                client.field285[client.field439] = null;
                                client.field248[client.field439] = 0;
                                client.field439++;
                            }
                            continue;
                        }
                        if (var392 == 3201) {
                            var5--;
                            int var138 = field711[var5];
                            if (var138 == -1 && !client.field482) {
                                Statics.field64.method3041();
                                class161.field2712 = 1;
                                Statics.field2647 = null;
                            } else if (var138 != -1 && client.field481 != var138 && client.field417 != 0 && !client.field482) {
                                class147 var139 = Statics.field224;
                                int var140 = client.field417;
                                class161.field2712 = 1;
                                Statics.field2647 = var139;
                                Statics.field2716 = var138;
                                Statics.field782 = 0;
                                Statics.field1821 = var140;
                                Statics.field568 = false;
                                Statics.field539 = 2;
                            }
                            client.field481 = var138;
                            continue;
                        }
                        if (var392 == 3202) {
                            var5 -= 2;
                            client.method2450(field711[var5], field711[var5 + 1]);
                            continue;
                        }
                    } else if (var392 < 3400) {
                        if (var392 == 3300) {
                            field711[var5++] = client.field259;
                            continue;
                        }
                        if (var392 == 3301) {
                            var5 -= 2;
                            int var141 = field711[var5];
                            int var142 = field711[var5 + 1];
                            int[] var143 = field711;
                            int var144 = var5++;
                            class14 var145 = (class14) class14.field195.method3201((long) var141);
                            int var146;
                            if (var145 == null) {
                                var146 = -1;
                            } else if (var142 >= 0 && var142 < var145.field193.length) {
                                var146 = var145.field193[var142];
                            } else {
                                var146 = -1;
                            }
                            var143[var144] = var146;
                            continue;
                        }
                        if (var392 == 3302) {
                            var5 -= 2;
                            int var147 = field711[var5];
                            int var148 = field711[var5 + 1];
                            int[] var149 = field711;
                            int var150 = var5++;
                            class14 var151 = (class14) class14.field195.method3201((long) var147);
                            int var152;
                            if (var151 == null) {
                                var152 = 0;
                            } else if (var148 >= 0 && var148 < var151.field197.length) {
                                var152 = var151.field197[var148];
                            } else {
                                var152 = 0;
                            }
                            var149[var150] = var152;
                            continue;
                        }
                        if (var392 == 3303) {
                            var5 -= 2;
                            int var153 = field711[var5];
                            int var154 = field711[var5 + 1];
                            field711[var5++] = class14.method128(var153, var154);
                            continue;
                        }
                        if (var392 == 3304) {
                            var5--;
                            int var155 = field711[var5];
                            field711[var5++] = class44.method2512(var155).field996;
                            continue;
                        }
                        if (var392 == 3305) {
                            var5--;
                            int var156 = field711[var5];
                            field711[var5++] = client.field386[var156];
                            continue;
                        }
                        if (var392 == 3306) {
                            var5--;
                            int var157 = field711[var5];
                            field711[var5++] = client.field387[var157];
                            continue;
                        }
                        if (var392 == 3307) {
                            var5--;
                            int var158 = field711[var5];
                            field711[var5++] = client.field466[var158];
                            continue;
                        }
                        if (var392 == 3308) {
                            int var159 = Statics.field975;
                            int var160 = (Statics.field61.field777 >> 7) + Statics.field2758;
                            int var161 = (Statics.field61.field722 >> 7) + Statics.field1113;
                            field711[var5++] = (var159 << 28) + (var160 << 14) + var161;
                            continue;
                        }
                        if (var392 == 3309) {
                            var5--;
                            int var162 = field711[var5];
                            field711[var5++] = var162 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3310) {
                            var5--;
                            int var163 = field711[var5];
                            field711[var5++] = var163 >> 28;
                            continue;
                        }
                        if (var392 == 3311) {
                            var5--;
                            int var164 = field711[var5];
                            field711[var5++] = var164 & 0x3FFF;
                            continue;
                        }
                        if (var392 == 3312) {
                            field711[var5++] = client.field254 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3313) {
                            var5 -= 2;
                            int var165 = field711[var5] + 32768;
                            int var166 = field711[var5 + 1];
                            int[] var167 = field711;
                            int var168 = var5++;
                            class14 var169 = (class14) class14.field195.method3201((long) var165);
                            int var170;
                            if (var169 == null) {
                                var170 = -1;
                            } else if (var166 >= 0 && var166 < var169.field193.length) {
                                var170 = var169.field193[var166];
                            } else {
                                var170 = -1;
                            }
                            var167[var168] = var170;
                            continue;
                        }
                        if (var392 == 3314) {
                            var5 -= 2;
                            int var171 = field711[var5] + 32768;
                            int var172 = field711[var5 + 1];
                            int[] var173 = field711;
                            int var174 = var5++;
                            class14 var175 = (class14) class14.field195.method3201((long) var171);
                            int var176;
                            if (var175 == null) {
                                var176 = 0;
                            } else if (var172 >= 0 && var172 < var175.field197.length) {
                                var176 = var175.field197[var172];
                            } else {
                                var176 = 0;
                            }
                            var173[var174] = var176;
                            continue;
                        }
                        if (var392 == 3315) {
                            var5 -= 2;
                            int var177 = field711[var5] + 32768;
                            int var178 = field711[var5 + 1];
                            field711[var5++] = class14.method128(var177, var178);
                            continue;
                        }
                        if (var392 == 3316) {
                            if (client.field416 >= 2) {
                                field711[var5++] = client.field416;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var392 == 3317) {
                            field711[var5++] = client.field266;
                            continue;
                        }
                        if (var392 == 3318) {
                            field711[var5++] = client.field249;
                            continue;
                        }
                        if (var392 == 3321) {
                            field711[var5++] = client.field414;
                            continue;
                        }
                        if (var392 == 3322) {
                            field711[var5++] = client.field415;
                            continue;
                        }
                        if (var392 == 3323) {
                            if (client.field493) {
                                field711[var5++] = 1;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var392 == 3324) {
                            field711[var5++] = client.field250;
                            continue;
                        }
                    } else if (var392 < 3500) {
                        if (var392 == 3400) {
                            var5 -= 2;
                            int var179 = field711[var5];
                            int var180 = field711[var5 + 1];
                            class43 var181 = Statics.method3159(var179);
                            if (var181.field984 != 's') {
                            }
                            for (int var182 = 0; var182 < var181.field988; var182++) {
                                if (var181.field987[var182] == var180) {
                                    field712[var6++] = var181.field989[var182];
                                    var181 = null;
                                    break;
                                }
                            }
                            if (var181 != null) {
                                field712[var6++] = var181.field986;
                            }
                            continue;
                        }
                        if (var392 == 3408) {
                            var5 -= 4;
                            int var183 = field711[var5];
                            int var184 = field711[var5 + 1];
                            int var185 = field711[var5 + 2];
                            int var186 = field711[var5 + 3];
                            class43 var187 = Statics.method3159(var185);
                            if (var187.field982 == var183 && var187.field984 == var184) {
                                for (int var188 = 0; var188 < var187.field988; var188++) {
                                    if (var187.field987[var188] == var186) {
                                        if (var184 == 115) {
                                            field712[var6++] = var187.field989[var188];
                                        } else {
                                            field711[var5++] = var187.field993[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var184 == 115) {
                                        field712[var6++] = var187.field986;
                                    } else {
                                        field711[var5++] = var187.field980;
                                    }
                                }
                                continue;
                            }
                            if (var184 == 115) {
                                field712[var6++] = "null";
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var392 < 3700) {
                        if (var392 == 3600) {
                            if (client.field498 == 0) {
                                field711[var5++] = -2;
                            } else if (client.field498 == 1) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field497;
                            }
                            continue;
                        }
                        if (var392 == 3601) {
                            var5--;
                            int var189 = field711[var5];
                            if (client.field498 == 2 && var189 < client.field497) {
                                field712[var6++] = client.field499[var189].field227;
                                field712[var6++] = client.field499[var189].field219;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3602) {
                            var5--;
                            int var190 = field711[var5];
                            if (client.field498 == 2 && var190 < client.field497) {
                                field711[var5++] = client.field499[var190].field226;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3603) {
                            var5--;
                            int var191 = field711[var5];
                            if (client.field498 == 2 && var191 < client.field497) {
                                field711[var5++] = client.field499[var191].field221;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3604) {
                            var6--;
                            String var192 = field712[var6];
                            var5--;
                            int var193 = field711[var5];
                            client.method1347(var192, var193);
                            continue;
                        }
                        if (var392 == 3605) {
                            var6--;
                            String var194 = field712[var6];
                            if (var194 == null) {
                                continue;
                            }
                            if ((client.field497 < 200 || client.field302 == 1) && client.field497 < 400) {
                                String var195 = class200.method35(var194, Statics.field883);
                                if (var195 == null) {
                                    continue;
                                }
                                for (int var196 = 0; var196 < client.field497; var196++) {
                                    class16 var197 = client.field499[var196];
                                    String var198 = class200.method35(var197.field227, Statics.field883);
                                    if (var198 != null && var198.equals(var195)) {
                                        Statics.method1994(30, "", var194 + class142.field2211);
                                        continue label2484;
                                    }
                                    if (var197.field219 != null) {
                                        String var199 = class200.method35(var197.field219, Statics.field883);
                                        if (var199 != null && var199.equals(var195)) {
                                            Statics.method1994(30, "", var194 + class142.field2211);
                                            continue label2484;
                                        }
                                    }
                                }
                                for (int var200 = 0; var200 < client.field473; var200++) {
                                    class8 var201 = client.field502[var200];
                                    String var202 = class200.method35(var201.field132, Statics.field883);
                                    if (var202 != null && var202.equals(var195)) {
                                        Statics.method1994(30, "", class142.field2348 + var194 + class142.field2329);
                                        continue label2484;
                                    }
                                    if (var201.field124 != null) {
                                        String var203 = class200.method35(var201.field124, Statics.field883);
                                        if (var203 != null && var203.equals(var195)) {
                                            Statics.method1994(30, "", class142.field2348 + var194 + class142.field2329);
                                            continue label2484;
                                        }
                                    }
                                }
                                if (class200.method35(Statics.field61.field45, Statics.field883).equals(var195)) {
                                    Statics.method1994(30, "", class142.field2232);
                                } else {
                                    client.field290.method2354(229);
                                    client.field290.method2126(class107.method859(var194));
                                    client.field290.method2257(var194);
                                }
                                continue;
                            }
                            Statics.method1994(30, "", class142.field2282);
                            continue;
                        }
                        if (var392 == 3606) {
                            var6--;
                            String var204 = field712[var6];
                            client.method16(var204);
                            continue;
                        }
                        if (var392 == 3607) {
                            var6--;
                            String var205 = field712[var6];
                            client.method1363(var205, false);
                            continue;
                        }
                        if (var392 == 3608) {
                            var6--;
                            String var206 = field712[var6];
                            if (var206 == null) {
                                continue;
                            }
                            String var207 = class200.method35(var206, Statics.field883);
                            if (var207 == null) {
                                continue;
                            }
                            int var208 = 0;
                            while (true) {
                                if (var208 >= client.field473) {
                                    continue label2484;
                                }
                                class8 var209 = client.field502[var208];
                                String var210 = var209.field132;
                                String var211 = class200.method35(var210, Statics.field883);
                                boolean var212;
                                if (var206 == null || var210 == null) {
                                    var212 = false;
                                } else if (var206.startsWith("#") || var210.startsWith("#")) {
                                    var212 = var206.equals(var210);
                                } else {
                                    var212 = var207.equals(var211);
                                }
                                if (var212) {
                                    client.field473--;
                                    for (int var213 = var208; var213 < client.field473; var213++) {
                                        client.field502[var213] = client.field502[var213 + 1];
                                    }
                                    client.field441 = client.field275;
                                    client.field290.method2354(157);
                                    client.field290.method2126(class107.method859(var206));
                                    client.field290.method2257(var206);
                                    continue label2484;
                                }
                                var208++;
                            }
                        }
                        if (var392 == 3609) {
                            var6--;
                            String var214 = field712[var6];
                            if (var214.startsWith(class2.method2799(0)) || var214.startsWith(class2.method2799(1))) {
                                var214 = var214.substring(7);
                            }
                            field711[var5++] = Statics.method1896(var214, false) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3611) {
                            if (client.field511 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class198.method2923(client.field511);
                            }
                            continue;
                        }
                        if (var392 == 3612) {
                            if (client.field511 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = Statics.field1822;
                            }
                            continue;
                        }
                        if (var392 == 3613) {
                            var5--;
                            int var215 = field711[var5];
                            if (client.field511 != null && var215 < Statics.field1822) {
                                field712[var6++] = Statics.field526[var215].field561;
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3614) {
                            var5--;
                            int var216 = field711[var5];
                            if (client.field511 != null && var216 < Statics.field1822) {
                                field711[var5++] = Statics.field526[var216].field562;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3615) {
                            var5--;
                            int var217 = field711[var5];
                            if (client.field511 != null && var217 < Statics.field1822) {
                                field711[var5++] = Statics.field526[var217].field560;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3616) {
                            field711[var5++] = Statics.field1341;
                            continue;
                        }
                        if (var392 == 3617) {
                            var6--;
                            String var218 = field712[var6];
                            if (Statics.field526 != null) {
                                client.field290.method2354(22);
                                client.field290.method2126(class107.method859(var218));
                                client.field290.method2257(var218);
                            }
                            continue;
                        }
                        if (var392 == 3618) {
                            field711[var5++] = Statics.field828;
                            continue;
                        }
                        if (var392 == 3619) {
                            var6--;
                            String var219 = field712[var6];
                            client.method592(var219);
                            continue;
                        }
                        if (var392 == 3620) {
                            client.method3160();
                            continue;
                        }
                        if (var392 == 3621) {
                            if (client.field498 == 0) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field473;
                            }
                            continue;
                        }
                        if (var392 == 3622) {
                            var5--;
                            int var220 = field711[var5];
                            if (client.field498 != 0 && var220 < client.field473) {
                                field712[var6++] = client.field502[var220].field132;
                                field712[var6++] = client.field502[var220].field124;
                                continue;
                            }
                            field712[var6++] = "";
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 3623) {
                            var6--;
                            String var221 = field712[var6];
                            if (var221.startsWith(class2.method2799(0)) || var221.startsWith(class2.method2799(1))) {
                                var221 = var221.substring(7);
                            }
                            field711[var5++] = client.method1875(var221) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 3624) {
                            var5--;
                            int var222 = field711[var5];
                            if (Statics.field526 != null && var222 < Statics.field1822 && Statics.field526[var222].field561.equalsIgnoreCase(Statics.field61.field45)) {
                                field711[var5++] = 1;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var392 == 3625) {
                            if (client.field478 == null) {
                                field712[var6++] = "";
                            } else {
                                field712[var6++] = class198.method2923(client.field478);
                            }
                            continue;
                        }
                    } else if (var392 < 4100) {
                        if (var392 == 4000) {
                            var5 -= 2;
                            int var223 = field711[var5];
                            int var224 = field711[var5 + 1];
                            field711[var5++] = var223 + var224;
                            continue;
                        }
                        if (var392 == 4001) {
                            var5 -= 2;
                            int var225 = field711[var5];
                            int var226 = field711[var5 + 1];
                            field711[var5++] = var225 - var226;
                            continue;
                        }
                        if (var392 == 4002) {
                            var5 -= 2;
                            int var227 = field711[var5];
                            int var228 = field711[var5 + 1];
                            field711[var5++] = var227 * var228;
                            continue;
                        }
                        if (var392 == 4003) {
                            var5 -= 2;
                            int var229 = field711[var5];
                            int var230 = field711[var5 + 1];
                            field711[var5++] = var229 / var230;
                            continue;
                        }
                        if (var392 == 4004) {
                            var5--;
                            int var231 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) var231);
                            continue;
                        }
                        if (var392 == 4005) {
                            var5--;
                            int var232 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) (var232 + 1));
                            continue;
                        }
                        if (var392 == 4006) {
                            var5 -= 5;
                            int var233 = field711[var5];
                            int var234 = field711[var5 + 1];
                            int var235 = field711[var5 + 2];
                            int var236 = field711[var5 + 3];
                            int var237 = field711[var5 + 4];
                            field711[var5++] = (var234 - var233) * (var237 - var235) / (var236 - var235) + var233;
                            continue;
                        }
                        if (var392 == 4007) {
                            var5 -= 2;
                            int var238 = field711[var5];
                            int var239 = field711[var5 + 1];
                            field711[var5++] = var238 * var239 / 100 + var238;
                            continue;
                        }
                        if (var392 == 4008) {
                            var5 -= 2;
                            int var240 = field711[var5];
                            int var241 = field711[var5 + 1];
                            field711[var5++] = var240 | 0x1 << var241;
                            continue;
                        }
                        if (var392 == 4009) {
                            var5 -= 2;
                            int var242 = field711[var5];
                            int var243 = field711[var5 + 1];
                            field711[var5++] = var242 & -1 - (0x1 << var243);
                            continue;
                        }
                        if (var392 == 4010) {
                            var5 -= 2;
                            int var244 = field711[var5];
                            int var245 = field711[var5 + 1];
                            field711[var5++] = (var244 & 0x1 << var245) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var392 == 4011) {
                            var5 -= 2;
                            int var246 = field711[var5];
                            int var247 = field711[var5 + 1];
                            field711[var5++] = var246 % var247;
                            continue;
                        }
                        if (var392 == 4012) {
                            var5 -= 2;
                            int var248 = field711[var5];
                            int var249 = field711[var5 + 1];
                            if (var248 == 0) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var248, (double) var249);
                            }
                            continue;
                        }
                        if (var392 == 4013) {
                            var5 -= 2;
                            int var250 = field711[var5];
                            int var251 = field711[var5 + 1];
                            if (var250 == 0) {
                                field711[var5++] = 0;
                            } else if (var251 == 0) {
                                field711[var5++] = Integer.MAX_VALUE;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var250, 1.0D / (double) var251);
                            }
                            continue;
                        }
                        if (var392 == 4014) {
                            var5 -= 2;
                            int var252 = field711[var5];
                            int var253 = field711[var5 + 1];
                            field711[var5++] = var252 & var253;
                            continue;
                        }
                        if (var392 == 4015) {
                            var5 -= 2;
                            int var254 = field711[var5];
                            int var255 = field711[var5 + 1];
                            field711[var5++] = var254 | var255;
                            continue;
                        }
                    } else if (var392 < 4200) {
                        if (var392 == 4100) {
                            var6--;
                            String var256 = field712[var6];
                            var5--;
                            int var257 = field711[var5];
                            field712[var6++] = var256 + var257;
                            continue;
                        }
                        if (var392 == 4101) {
                            var6 -= 2;
                            String var258 = field712[var6];
                            String var259 = field712[var6 + 1];
                            field712[var6++] = var258 + var259;
                            continue;
                        }
                        if (var392 == 4102) {
                            var6--;
                            String var260 = field712[var6];
                            var5--;
                            int var261 = field711[var5];
                            String[] var262 = field712;
                            int var263 = var6++;
                            String var265;
                            if (var261 < 0) {
                                var265 = Integer.toString(var261);
                            } else {
                                int var266 = var261;
                                String var267;
                                if (var261 < 0) {
                                    var267 = Integer.toString(var261, 10);
                                } else {
                                    int var268 = 2;
                                    int var269 = var261 / 10;
                                    while (var269 != 0) {
                                        var269 /= 10;
                                        var268++;
                                    }
                                    char[] var270 = new char[var268];
                                    var270[0] = '+';
                                    for (int var271 = var268 - 1; var271 > 0; var271--) {
                                        int var272 = var266;
                                        var266 /= 10;
                                        int var273 = var272 - var266 * 10;
                                        if (var273 >= 10) {
                                            var270[var271] = (char) (var273 + 87);
                                        } else {
                                            var270[var271] = (char) (var273 + 48);
                                        }
                                    }
                                    var267 = new String(var270);
                                }
                                var265 = var267;
                            }
                            var262[var263] = var260 + var265;
                            continue;
                        }
                        if (var392 == 4103) {
                            var6--;
                            String var274 = field712[var6];
                            field712[var6++] = var274.toLowerCase();
                            continue;
                        }
                        if (var392 == 4104) {
                            var5--;
                            int var275 = field711[var5];
                            long var276 = ((long) var275 + 11745L) * 86400000L;
                            field708.setTime(new Date(var276));
                            int var278 = field708.get(5);
                            int var279 = field708.get(2);
                            int var280 = field708.get(1);
                            field712[var6++] = var278 + "-" + field716[var279] + "-" + var280;
                            continue;
                        }
                        if (var392 == 4105) {
                            var6 -= 2;
                            String var281 = field712[var6];
                            String var282 = field712[var6 + 1];
                            if (Statics.field61.field40 != null && Statics.field61.field40.field2674) {
                                field712[var6++] = var282;
                                continue;
                            }
                            field712[var6++] = var281;
                            continue;
                        }
                        if (var392 == 4106) {
                            var5--;
                            int var283 = field711[var5];
                            field712[var6++] = Integer.toString(var283);
                            continue;
                        }
                        if (var392 == 4107) {
                            var6 -= 2;
                            field711[var5++] = class199.method581(class202.method2487(field712[var6], field712[var6 + 1], client.field256));
                            continue;
                        }
                        if (var392 == 4108) {
                            var6--;
                            String var284 = field712[var6];
                            var5 -= 2;
                            int var285 = field711[var5];
                            int var286 = field711[var5 + 1];
                            byte[] var287 = Statics.field1903.method2708(var286, 0);
                            class193 var288 = new class193(var287);
                            field711[var5++] = var288.method3354(var284, var285);
                            continue;
                        }
                        if (var392 == 4109) {
                            var6--;
                            String var289 = field712[var6];
                            var5 -= 2;
                            int var290 = field711[var5];
                            int var291 = field711[var5 + 1];
                            byte[] var292 = Statics.field1903.method2708(var291, 0);
                            class193 var293 = new class193(var292);
                            field711[var5++] = var293.method3353(var289, var290);
                            continue;
                        }
                        if (var392 == 4110) {
                            var6 -= 2;
                            String var294 = field712[var6];
                            String var295 = field712[var6 + 1];
                            var5--;
                            if (field711[var5] == 1) {
                                field712[var6++] = var294;
                            } else {
                                field712[var6++] = var295;
                            }
                            continue;
                        }
                        if (var392 == 4111) {
                            var6--;
                            String var296 = field712[var6];
                            field712[var6++] = class192.method3355(var296);
                            continue;
                        }
                        if (var392 == 4112) {
                            var6--;
                            String var297 = field712[var6];
                            var5--;
                            int var298 = field711[var5];
                            field712[var6++] = var297 + (char) var298;
                            continue;
                        }
                        if (var392 == 4113) {
                            var5--;
                            int var299 = field711[var5];
                            int[] var300 = field711;
                            int var301 = var5++;
                            char var302 = (char) var299;
                            boolean var303;
                            if (var302 >= ' ' && var302 <= '~') {
                                var303 = true;
                            } else if (var302 >= 160 && var302 <= 255) {
                                var303 = true;
                            } else if (var302 == 8364 || var302 == 338 || var302 == 8212 || var302 == 339 || var302 == 376) {
                                var303 = true;
                            } else {
                                var303 = false;
                            }
                            var300[var301] = var303 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4114) {
                            var5--;
                            int var304 = field711[var5];
                            int[] var305 = field711;
                            int var306 = var5++;
                            char var307 = (char) var304;
                            boolean var308 = var307 >= '0' && var307 <= '9' || var307 >= 'A' && var307 <= 'Z' || var307 >= 'a' && var307 <= 'z';
                            var305[var306] = var308 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4115) {
                            var5--;
                            int var309 = field711[var5];
                            int[] var310 = field711;
                            int var311 = var5++;
                            char var312 = (char) var309;
                            boolean var313 = var312 >= 'A' && var312 <= 'Z' || var312 >= 'a' && var312 <= 'z';
                            var310[var311] = var313 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4116) {
                            var5--;
                            int var314 = field711[var5];
                            field711[var5++] = class199.method705((char) var314) ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4117) {
                            var6--;
                            String var315 = field712[var6];
                            if (var315 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var315.length();
                            }
                            continue;
                        }
                        if (var392 == 4118) {
                            var6--;
                            String var316 = field712[var6];
                            var5 -= 2;
                            int var317 = field711[var5];
                            int var318 = field711[var5 + 1];
                            field712[var6++] = var316.substring(var317, var318);
                            continue;
                        }
                        if (var392 == 4119) {
                            var6--;
                            String var319 = field712[var6];
                            StringBuilder var320 = new StringBuilder(var319.length());
                            boolean var321 = false;
                            for (int var322 = 0; var322 < var319.length(); var322++) {
                                char var323 = var319.charAt(var322);
                                if (var323 == '<') {
                                    var321 = true;
                                } else if (var323 == '>') {
                                    var321 = false;
                                } else if (!var321) {
                                    var320.append(var323);
                                }
                            }
                            field712[var6++] = var320.toString();
                            continue;
                        }
                        if (var392 == 4120) {
                            var6--;
                            String var324 = field712[var6];
                            var5--;
                            int var325 = field711[var5];
                            field711[var5++] = var324.indexOf(var325);
                            continue;
                        }
                        if (var392 == 4121) {
                            var6 -= 2;
                            String var326 = field712[var6];
                            String var327 = field712[var6 + 1];
                            var5--;
                            int var328 = field711[var5];
                            field711[var5++] = var326.indexOf(var327, var328);
                            continue;
                        }
                    } else if (var392 < 4300) {
                        if (var392 == 4200) {
                            var5--;
                            int var329 = field711[var5];
                            field712[var6++] = class45.method744(var329).field1017;
                            continue;
                        }
                        if (var392 == 4201) {
                            var5 -= 2;
                            int var330 = field711[var5];
                            int var331 = field711[var5 + 1];
                            class45 var332 = class45.method744(var330);
                            if (var331 >= 1 && var331 <= 5 && var332.field1027[var331 - 1] != null) {
                                field712[var6++] = var332.field1027[var331 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 4202) {
                            var5 -= 2;
                            int var333 = field711[var5];
                            int var334 = field711[var5 + 1];
                            class45 var335 = class45.method744(var333);
                            if (var334 >= 1 && var334 <= 5 && var335.field1028[var334 - 1] != null) {
                                field712[var6++] = var335.field1028[var334 - 1];
                                continue;
                            }
                            field712[var6++] = "";
                            continue;
                        }
                        if (var392 == 4203) {
                            var5--;
                            int var336 = field711[var5];
                            field711[var5++] = class45.method744(var336).field1011;
                            continue;
                        }
                        if (var392 == 4204) {
                            var5--;
                            int var337 = field711[var5];
                            field711[var5++] = class45.method744(var337).field1024 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var392 == 4205) {
                            var5--;
                            int var338 = field711[var5];
                            class45 var339 = class45.method744(var338);
                            if (var339.field1046 == -1 && var339.field1043 >= 0) {
                                field711[var5++] = var339.field1043;
                                continue;
                            }
                            field711[var5++] = var338;
                            continue;
                        }
                        if (var392 == 4206) {
                            var5--;
                            int var340 = field711[var5];
                            class45 var341 = class45.method744(var340);
                            if (var341.field1046 >= 0 && var341.field1043 >= 0) {
                                field711[var5++] = var341.field1043;
                                continue;
                            }
                            field711[var5++] = var340;
                            continue;
                        }
                        if (var392 == 4207) {
                            var5--;
                            int var342 = field711[var5];
                            field711[var5++] = class45.method744(var342).field1026 ? 1 : 0;
                            continue;
                        }
                    } else if (var392 < 5100) {
                        if (var392 == 5000) {
                            field711[var5++] = client.field323;
                            continue;
                        }
                        if (var392 == 5001) {
                            var5 -= 3;
                            client.field323 = field711[var5];
                            int var343 = field711[var5 + 1];
                            class117[] var344 = class117.method3142();
                            int var345 = 0;
                            class117 var347;
                            while (true) {
                                if (var345 >= var344.length) {
                                    var347 = null;
                                    break;
                                }
                                class117 var346 = var344[var345];
                                if (var346.field1907 == var343) {
                                    var347 = var346;
                                    break;
                                }
                                var345++;
                            }
                            Statics.field126 = var347;
                            if (Statics.field126 == null) {
                                Statics.field126 = class117.field1904;
                            }
                            client.field463 = field711[var5 + 2];
                            client.field290.method2354(143);
                            client.field290.method2126(client.field323);
                            client.field290.method2126(Statics.field126.field1907);
                            client.field290.method2126(client.field463);
                            continue;
                        }
                        if (var392 == 5002) {
                            var6--;
                            String var348 = field712[var6];
                            var5 -= 2;
                            int var349 = field711[var5];
                            int var350 = field711[var5 + 1];
                            client.field290.method2354(96);
                            client.field290.method2126(class107.method859(var348) + 2);
                            client.field290.method2257(var348);
                            client.field290.method2126(var349 - 1);
                            client.field290.method2126(var350);
                            continue;
                        }
                        if (var392 == 5003) {
                            var5 -= 2;
                            int var351 = field711[var5];
                            int var352 = field711[var5 + 1];
                            class31 var353 = class10.method88(var351, var352);
                            if (var353 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var353.field705;
                                field711[var5++] = var353.field701;
                                field712[var6++] = var353.field700 == null ? "" : var353.field700;
                                field712[var6++] = var353.field703 == null ? "" : var353.field703;
                                field712[var6++] = var353.field704 == null ? "" : var353.field704;
                            }
                            continue;
                        }
                        if (var392 == 5004) {
                            var5--;
                            int var354 = field711[var5];
                            class31 var355 = (class31) class10.field149.method3219((long) var354);
                            if (var355 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field712[var6++] = "";
                                field712[var6++] = "";
                                field712[var6++] = "";
                            } else {
                                field711[var5++] = var355.field702;
                                field711[var5++] = var355.field701;
                                field712[var6++] = var355.field700 == null ? "" : var355.field700;
                                field712[var6++] = var355.field703 == null ? "" : var355.field703;
                                field712[var6++] = var355.field704 == null ? "" : var355.field704;
                            }
                            continue;
                        }
                        if (var392 == 5005) {
                            if (Statics.field126 == null) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = Statics.field126.field1907;
                            }
                            continue;
                        }
                        if (var392 == 5008) {
                            var6--;
                            String var357 = field712[var6];
                            var5--;
                            int var358 = field711[var5];
                            String var359 = var357.toLowerCase();
                            byte var360 = 0;
                            if (var359.startsWith(class142.field2332)) {
                                var360 = 0;
                                var357 = var357.substring(class142.field2332.length());
                            } else if (var359.startsWith(class142.field2216)) {
                                var360 = 1;
                                var357 = var357.substring(class142.field2216.length());
                            } else if (var359.startsWith(class142.field2336)) {
                                var360 = 2;
                                var357 = var357.substring(class142.field2336.length());
                            } else if (var359.startsWith(class142.field2338)) {
                                var360 = 3;
                                var357 = var357.substring(class142.field2338.length());
                            } else if (var359.startsWith(class142.field2342)) {
                                var360 = 4;
                                var357 = var357.substring(class142.field2342.length());
                            } else if (var359.startsWith(class142.field2214)) {
                                var360 = 5;
                                var357 = var357.substring(class142.field2214.length());
                            } else if (var359.startsWith(class142.field2387)) {
                                var360 = 6;
                                var357 = var357.substring(class142.field2387.length());
                            } else if (var359.startsWith(class142.field2346)) {
                                var360 = 7;
                                var357 = var357.substring(class142.field2346.length());
                            } else if (var359.startsWith(class142.field2173)) {
                                var360 = 8;
                                var357 = var357.substring(class142.field2173.length());
                            } else if (var359.startsWith(class142.field2165)) {
                                var360 = 9;
                                var357 = var357.substring(class142.field2165.length());
                            } else if (var359.startsWith(class142.field2229)) {
                                var360 = 10;
                                var357 = var357.substring(class142.field2229.length());
                            } else if (var359.startsWith(class142.field2351)) {
                                var360 = 11;
                                var357 = var357.substring(class142.field2351.length());
                            } else if (client.field256 != 0) {
                                if (var359.startsWith(class142.field2333)) {
                                    var360 = 0;
                                    var357 = var357.substring(class142.field2333.length());
                                } else if (var359.startsWith(class142.field2335)) {
                                    var360 = 1;
                                    var357 = var357.substring(class142.field2335.length());
                                } else if (var359.startsWith(class142.field2337)) {
                                    var360 = 2;
                                    var357 = var357.substring(class142.field2337.length());
                                } else if (var359.startsWith(class142.field2314)) {
                                    var360 = 3;
                                    var357 = var357.substring(class142.field2314.length());
                                } else if (var359.startsWith(class142.field2341)) {
                                    var360 = 4;
                                    var357 = var357.substring(class142.field2341.length());
                                } else if (var359.startsWith(class142.field2343)) {
                                    var360 = 5;
                                    var357 = var357.substring(class142.field2343.length());
                                } else if (var359.startsWith(class142.field2345)) {
                                    var360 = 6;
                                    var357 = var357.substring(class142.field2345.length());
                                } else if (var359.startsWith(class142.field2243)) {
                                    var360 = 7;
                                    var357 = var357.substring(class142.field2243.length());
                                } else if (var359.startsWith(class142.field2349)) {
                                    var360 = 8;
                                    var357 = var357.substring(class142.field2349.length());
                                } else if (var359.startsWith(class142.field2339)) {
                                    var360 = 9;
                                    var357 = var357.substring(class142.field2339.length());
                                } else if (var359.startsWith(class142.field2267)) {
                                    var360 = 10;
                                    var357 = var357.substring(class142.field2267.length());
                                } else if (var359.startsWith(class142.field2355)) {
                                    var360 = 11;
                                    var357 = var357.substring(class142.field2355.length());
                                }
                            }
                            String var361 = var357.toLowerCase();
                            byte var362 = 0;
                            if (var361.startsWith(class142.field2356)) {
                                var362 = 1;
                                var357 = var357.substring(class142.field2356.length());
                            } else if (var361.startsWith(class142.field2210)) {
                                var362 = 2;
                                var357 = var357.substring(class142.field2210.length());
                            } else if (var361.startsWith(class142.field2252)) {
                                var362 = 3;
                                var357 = var357.substring(class142.field2252.length());
                            } else if (var361.startsWith(class142.field2291)) {
                                var362 = 4;
                                var357 = var357.substring(class142.field2291.length());
                            } else if (var361.startsWith(class142.field2364)) {
                                var362 = 5;
                                var357 = var357.substring(class142.field2364.length());
                            } else if (client.field256 != 0) {
                                if (var361.startsWith(class142.field2379)) {
                                    var362 = 1;
                                    var357 = var357.substring(class142.field2379.length());
                                } else if (var361.startsWith(class142.field2311)) {
                                    var362 = 2;
                                    var357 = var357.substring(class142.field2311.length());
                                } else if (var361.startsWith(class142.field2160)) {
                                    var362 = 3;
                                    var357 = var357.substring(class142.field2160.length());
                                } else if (var361.startsWith(class142.field2363)) {
                                    var362 = 4;
                                    var357 = var357.substring(class142.field2363.length());
                                } else if (var361.startsWith(class142.field2365)) {
                                    var362 = 5;
                                    var357 = var357.substring(class142.field2365.length());
                                }
                            }
                            client.field290.method2354(178);
                            client.field290.method2126(0);
                            int var363 = client.field290.field1839;
                            client.field290.method2126(var358);
                            client.field290.method2126(var360);
                            client.field290.method2126(var362);
                            class110 var364 = client.field290;
                            int var365 = var364.field1839;
                            byte[] var366 = class201.method482(var357);
                            var364.method2129(var366.length);
                            var364.field1839 += Statics.field2902.method2076(var366, 0, var366.length, var364.field1840, var364.field1839);
                            client.field290.method2136(client.field290.field1839 - var363);
                            continue;
                        }
                        if (var392 == 5009) {
                            var6 -= 2;
                            String var367 = field712[var6];
                            String var368 = field712[var6 + 1];
                            client.field290.method2354(12);
                            client.field290.method2151(0);
                            int var369 = client.field290.field1839;
                            client.field290.method2257(var367);
                            class110 var370 = client.field290;
                            int var371 = var370.field1839;
                            byte[] var372 = class201.method482(var368);
                            var370.method2129(var372.length);
                            var370.field1839 += Statics.field2902.method2076(var372, 0, var372.length, var370.field1840, var370.field1839);
                            client.field290.method2135(client.field290.field1839 - var369);
                            continue;
                        }
                        if (var392 == 5015) {
                            String var373;
                            if (Statics.field61 == null || Statics.field61.field45 == null) {
                                var373 = "";
                            } else {
                                var373 = Statics.field61.field45;
                            }
                            field712[var6++] = var373;
                            continue;
                        }
                        if (var392 == 5016) {
                            field711[var5++] = client.field463;
                            continue;
                        }
                        if (var392 == 5017) {
                            var5--;
                            int var374 = field711[var5];
                            int[] var375 = field711;
                            int var376 = var5++;
                            class24 var377 = (class24) class10.field158.get(var374);
                            int var378;
                            if (var377 == null) {
                                var378 = 0;
                            } else {
                                var378 = var377.method507();
                            }
                            var375[var376] = var378;
                            continue;
                        }
                        if (var392 == 5018) {
                            var5--;
                            int var379 = field711[var5];
                            int[] var380 = field711;
                            int var381 = var5++;
                            class31 var382 = (class31) class10.field149.method3219((long) var379);
                            int var383;
                            if (var382 == null) {
                                var383 = -1;
                            } else if (class10.field150.field2861 == var382.field2865) {
                                var383 = -1;
                            } else {
                                var383 = ((class31) var382.field2865).field705;
                            }
                            var380[var381] = var383;
                            continue;
                        }
                        if (var392 == 5019) {
                            var5--;
                            int var384 = field711[var5];
                            field711[var5++] = class10.method31(var384);
                            continue;
                        }
                        if (var392 == 5020) {
                            var6--;
                            String var385 = field712[var6];
                            client.method2415(var385);
                            continue;
                        }
                    }
                }
                if (var392 >= 5600 || var392 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var386 = field711[var5];
                int var387 = field711[var5 + 1];
                if (!client.field430) {
                    client.field360 = var386;
                    client.field315 = var387;
                }
            }
        } catch (Exception var391) {
            StringBuilder var389 = new StringBuilder(30);
            var389.append("").append(var4.field2875).append(" ");
            for (int var390 = field713 - 1; var390 >= 0; var390--) {
                var389.append("").append(field714[var390].field187.field2875).append(" ");
            }
            var389.append("").append(var10);
            class135.method495(var389.toString(), var391);
        }
    }

    @ObfuscatedName("ac.z(II)V")
    public static void method520(int arg0) {
        if (arg0 == -1 || !class152.method2777(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2616[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2619 != null) {
                class1 var4 = new class1();
                var4.field10 = var3;
                var4.field4 = var3.field2619;
                method847(var4, 2000000);
            }
        }
    }
}
