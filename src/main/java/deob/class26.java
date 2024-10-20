package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("x")
public class class26 {

    @ObfuscatedName("x.e")
    public static int[] field412 = new int[5];

    @ObfuscatedName("x.t")
    public static int[][] field421 = new int[5][5000];

    @ObfuscatedName("x.d")
    public static int[] field409 = new int[1000];

    @ObfuscatedName("x.p")
    public static String[] field410 = new String[1000];

    @ObfuscatedName("x.k")
    public static int field413 = 0;

    @ObfuscatedName("x.r")
    public static class18[] field414 = new class18[50];

    @ObfuscatedName("x.z")
    public static Calendar field415 = Calendar.getInstance();

    @ObfuscatedName("x.s")
    public static final String[] field406 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class26() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.i(Li;S)V")
    public static void method1870(class1 arg0) {
        Object[] var1 = arg0.field12;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method2127(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field62;
        int[] var8 = var3.field63;
        byte var9 = -1;
        field413 = 0;
        try {
            Statics.field407 = new int[var3.field65];
            int var10 = 0;
            Statics.field408 = new String[var3.field66];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field3;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field8;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2640;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field4;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2620;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2640;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field6 == null ? -1 : arg0.field6.field2620;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field10;
                    }
                    Statics.field407[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field408[var11++] = var14;
                }
            }
            int var15 = 0;
            label2488: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var396 = var7[var6];
                if (var396 < 100) {
                    if (var396 == 0) {
                        field409[var4++] = var8[var6];
                        continue;
                    }
                    if (var396 == 1) {
                        int var16 = var8[var6];
                        field409[var4++] = class159.field2697[var16];
                        continue;
                    }
                    if (var396 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class159.field2697[var17] = field409[var4];
                        client.method228(var17);
                        continue;
                    }
                    if (var396 == 3) {
                        field410[var5++] = var3.field70[var6];
                        continue;
                    }
                    if (var396 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var396 == 7) {
                        var4 -= 2;
                        if (field409[var4 + 1] != field409[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 8) {
                        var4 -= 2;
                        if (field409[var4 + 1] == field409[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 9) {
                        var4 -= 2;
                        if (field409[var4] < field409[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 10) {
                        var4 -= 2;
                        if (field409[var4] > field409[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 21) {
                        if (field413 == 0) {
                            return;
                        }
                        class18 var18 = field414[--field413];
                        var3 = var18.field280;
                        var7 = var3.field62;
                        var8 = var3.field63;
                        var6 = var18.field283;
                        Statics.field407 = var18.field281;
                        Statics.field408 = var18.field282;
                        continue;
                    }
                    if (var396 == 25) {
                        int var19 = var8[var6];
                        field409[var4++] = class159.method2663(var19);
                        continue;
                    }
                    if (var396 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        int var21 = field409[var4];
                        class38 var22 = (class38) class38.field959.method3235((long) var20);
                        class38 var23;
                        if (var22 == null) {
                            byte[] var24 = Statics.field963.method2970(14, var20);
                            class38 var25 = new class38();
                            if (var24 != null) {
                                var25.method807(new class127(var24));
                            }
                            class38.field959.method3234(var25, (long) var20);
                            var23 = var25;
                        } else {
                            var23 = var22;
                        }
                        int var27 = var23.field961;
                        int var28 = var23.field962;
                        int var29 = var23.field960;
                        int var30 = class159.field2696[var29 - var28];
                        if (var21 < 0 || var21 > var30) {
                            var21 = 0;
                        }
                        int var31 = var30 << var28;
                        class159.field2697[var27] = class159.field2697[var27] & ~var31 | var21 << var28 & var31;
                        continue;
                    }
                    if (var396 == 31) {
                        var4 -= 2;
                        if (field409[var4] <= field409[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 32) {
                        var4 -= 2;
                        if (field409[var4] >= field409[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var396 == 33) {
                        field409[var4++] = Statics.field407[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var396 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field407[var10001] = field409[var4];
                        continue;
                    }
                    if (var396 == 35) {
                        field410[var5++] = Statics.field408[var8[var6]];
                        continue;
                    }
                    if (var396 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field408[var10001] = field410[var5];
                        continue;
                    }
                    if (var396 == 37) {
                        int var32 = var8[var6];
                        var5 -= var32;
                        String[] var33 = field410;
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
                        field410[var5++] = var34;
                        continue;
                    }
                    if (var396 == 38) {
                        var4--;
                        continue;
                    }
                    if (var396 == 39) {
                        var5--;
                        continue;
                    }
                    if (var396 == 40) {
                        int var44 = var8[var6];
                        class5 var45 = class5.method2127(var44);
                        int[] var46 = new int[var45.field65];
                        String[] var47 = new String[var45.field66];
                        for (int var48 = 0; var48 < var45.field67; var48++) {
                            var46[var48] = field409[var4 - var45.field67 + var48];
                        }
                        for (int var49 = 0; var49 < var45.field71; var49++) {
                            var47[var49] = field410[var5 - var45.field71 + var49];
                        }
                        var4 -= var45.field67;
                        var5 -= var45.field71;
                        class18 var50 = new class18();
                        var50.field280 = var3;
                        var50.field283 = var6;
                        var50.field281 = Statics.field407;
                        var50.field282 = Statics.field408;
                        field414[++field413 - 1] = var50;
                        var3 = var45;
                        var7 = var45.field62;
                        var8 = var45.field63;
                        var6 = -1;
                        Statics.field407 = var46;
                        Statics.field408 = var47;
                        continue;
                    }
                    if (var396 == 42) {
                        field409[var4++] = client.field678[var8[var6]];
                        continue;
                    }
                    if (var396 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field678[var10001] = field409[var4];
                        continue;
                    }
                    if (var396 == 44) {
                        int var51 = var8[var6] >> 16;
                        int var52 = var8[var6] & 0xFFFF;
                        var4--;
                        int var53 = field409[var4];
                        if (var53 >= 0 && var53 <= 5000) {
                            field412[var51] = var53;
                            byte var54 = -1;
                            if (var52 == 105) {
                                var54 = 0;
                            }
                            int var55 = 0;
                            while (true) {
                                if (var55 >= var53) {
                                    continue label2488;
                                }
                                field421[var51][var55] = var54;
                                var55++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 45) {
                        int var56 = var8[var6];
                        var4--;
                        int var57 = field409[var4];
                        if (var57 >= 0 && var57 < field412[var56]) {
                            field409[var4++] = field421[var56][var57];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 46) {
                        int var58 = var8[var6];
                        var4 -= 2;
                        int var59 = field409[var4];
                        if (var59 >= 0 && var59 < field412[var58]) {
                            field421[var58][var59] = field409[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var396 == 47) {
                        String var60 = client.field679[var8[var6]];
                        if (var60 == null) {
                            var60 = "null";
                        }
                        field410[var5++] = var60;
                        continue;
                    }
                    if (var396 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field679[var10001] = field410[var5];
                        continue;
                    }
                }
                boolean var61;
                if (var8[var6] == 1) {
                    var61 = true;
                } else {
                    var61 = false;
                }
                if (var396 < 1000) {
                    if (var396 == 100) {
                        var4 -= 3;
                        int var62 = field409[var4];
                        int var63 = field409[var4 + 1];
                        int var64 = field409[var4 + 2];
                        if (var63 == 0) {
                            throw new RuntimeException();
                        }
                        class158 var65 = class158.method2658(var62);
                        if (var65.field2685 == null) {
                            var65.field2685 = new class158[var64 + 1];
                        }
                        if (var65.field2685.length <= var64) {
                            class158[] var66 = new class158[var64 + 1];
                            for (int var67 = 0; var67 < var65.field2685.length; var67++) {
                                var66[var67] = var65.field2685[var67];
                            }
                            var65.field2685 = var66;
                        }
                        if (var64 > 0 && var65.field2685[var64 - 1] == null) {
                            throw new RuntimeException("" + (var64 - 1));
                        }
                        class158 var68 = new class158();
                        var68.field2665 = var63;
                        var68.field2588 = var68.field2640 = var65.field2640;
                        var68.field2620 = var64;
                        var68.field2576 = true;
                        var65.field2685[var64] = var68;
                        if (var61) {
                            Statics.field2055 = var68;
                        } else {
                            Statics.field287 = var68;
                        }
                        client.method1610(var65);
                        continue;
                    }
                    if (var396 == 101) {
                        class158 var69 = var61 ? Statics.field2055 : Statics.field287;
                        class158 var70 = class158.method2658(var69.field2640);
                        var70.field2685[var69.field2620] = null;
                        client.method1610(var70);
                        continue;
                    }
                    if (var396 == 102) {
                        var4--;
                        class158 var71 = class158.method2658(field409[var4]);
                        var71.field2685 = null;
                        client.method1610(var71);
                        continue;
                    }
                    if (var396 == 200) {
                        var4 -= 2;
                        int var72 = field409[var4];
                        int var73 = field409[var4 + 1];
                        class158 var74 = class158.method2996(var72, var73);
                        if (var74 != null && var73 != -1) {
                            field409[var4++] = 1;
                            if (var61) {
                                Statics.field2055 = var74;
                            } else {
                                Statics.field287 = var74;
                            }
                            continue;
                        }
                        field409[var4++] = 0;
                        continue;
                    }
                } else if (var396 >= 1000 && var396 < 1100 || var396 >= 2000 && var396 < 2100) {
                    class158 var75;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var75 = class158.method2658(field409[var4]);
                    } else {
                        var75 = var61 ? Statics.field2055 : Statics.field287;
                    }
                    if (var396 == 1000) {
                        var4 -= 2;
                        var75.field2582 = field409[var4];
                        var75.field2580 = field409[var4 + 1];
                        client.method1610(var75);
                        continue;
                    }
                    if (var396 == 1001) {
                        var4 -= 2;
                        var75.field2586 = field409[var4];
                        var75.field2587 = field409[var4 + 1];
                        client.method1610(var75);
                        continue;
                    }
                    if (var396 == 1003) {
                        var4--;
                        boolean var76 = field409[var4] == 1;
                        if (var75.field2589 != var76) {
                            var75.field2589 = var76;
                            client.method1610(var75);
                        }
                        continue;
                    }
                } else if (!(var396 < 1100 || var396 >= 1200) || !(var396 < 2100 || var396 >= 2200)) {
                    class158 var77;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var77 = class158.method2658(field409[var4]);
                    } else {
                        var77 = var61 ? Statics.field2055 : Statics.field287;
                    }
                    if (var396 == 1100) {
                        var4 -= 2;
                        var77.field2590 = field409[var4];
                        if (var77.field2590 > var77.field2577 - var77.field2586) {
                            var77.field2590 = var77.field2577 - var77.field2586;
                        }
                        if (var77.field2590 < 0) {
                            var77.field2590 = 0;
                        }
                        var77.field2656 = field409[var4 + 1];
                        if (var77.field2656 > var77.field2593 - var77.field2587) {
                            var77.field2656 = var77.field2593 - var77.field2587;
                        }
                        if (var77.field2656 < 0) {
                            var77.field2656 = 0;
                        }
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1101) {
                        var4--;
                        var77.field2594 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1102) {
                        var4--;
                        var77.field2648 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1103) {
                        var4--;
                        var77.field2583 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1104) {
                        var4--;
                        var77.field2600 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1105) {
                        var4--;
                        var77.field2601 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1106) {
                        var4--;
                        var77.field2689 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1107) {
                        var4--;
                        var77.field2604 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1108) {
                        var77.field2609 = 1;
                        var4--;
                        var77.field2610 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1109) {
                        var4 -= 6;
                        var77.field2578 = field409[var4];
                        var77.field2669 = field409[var4 + 1];
                        var77.field2647 = field409[var4 + 2];
                        var77.field2618 = field409[var4 + 3];
                        var77.field2615 = field409[var4 + 4];
                        var77.field2680 = field409[var4 + 5];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1110) {
                        var4--;
                        int var78 = field409[var4];
                        if (var77.field2613 != var78) {
                            var77.field2613 = var78;
                            var77.field2683 = 0;
                            var77.field2684 = 0;
                            client.method1610(var77);
                        }
                        continue;
                    }
                    if (var396 == 1111) {
                        var4--;
                        var77.field2622 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1112) {
                        var5--;
                        String var79 = field410[var5];
                        if (!var79.equals(var77.field2634)) {
                            var77.field2634 = var79;
                            client.method1610(var77);
                        }
                        continue;
                    }
                    if (var396 == 1113) {
                        var4--;
                        var77.field2623 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1114) {
                        var4 -= 3;
                        var77.field2627 = field409[var4];
                        var77.field2628 = field409[var4 + 1];
                        var77.field2626 = field409[var4 + 2];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1115) {
                        var4--;
                        var77.field2629 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1116) {
                        var4--;
                        var77.field2605 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1117) {
                        var4--;
                        var77.field2668 = field409[var4];
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1118) {
                        var4--;
                        var77.field2607 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1119) {
                        var4--;
                        var77.field2608 = field409[var4] == 1;
                        client.method1610(var77);
                        continue;
                    }
                    if (var396 == 1120) {
                        var4 -= 2;
                        var77.field2577 = field409[var4];
                        var77.field2593 = field409[var4 + 1];
                        client.method1610(var77);
                        continue;
                    }
                } else if (var396 >= 1200 && var396 < 1300 || var396 >= 2200 && var396 < 2300) {
                    class158 var80;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var80 = class158.method2658(field409[var4]);
                    } else {
                        var80 = var61 ? Statics.field2055 : Statics.field287;
                    }
                    client.method1610(var80);
                    if (var396 == 1200) {
                        var4 -= 2;
                        int var81 = field409[var4];
                        int var82 = field409[var4 + 1];
                        var80.field2681 = var81;
                        var80.field2682 = var82;
                        class40 var83 = class40.method548(var81);
                        var80.field2647 = var83.field995;
                        var80.field2618 = var83.field986;
                        var80.field2615 = var83.field997;
                        var80.field2578 = var83.field998;
                        var80.field2669 = var83.field999;
                        var80.field2680 = var83.field994;
                        if (var80.field2586 > 0) {
                            var80.field2680 = var80.field2680 * 32 / var80.field2586;
                        }
                        continue;
                    }
                    if (var396 == 1201) {
                        var80.field2609 = 2;
                        var4--;
                        var80.field2610 = field409[var4];
                        continue;
                    }
                    if (var396 == 1202) {
                        var80.field2609 = 3;
                        var80.field2610 = Statics.field139.field33.method3162();
                        continue;
                    }
                } else if (var396 >= 1300 && var396 < 1400 || var396 >= 2300 && var396 < 2400) {
                    class158 var84;
                    if (var396 >= 2000) {
                        var396 -= 1000;
                        var4--;
                        var84 = class158.method2658(field409[var4]);
                    } else {
                        var84 = var61 ? Statics.field2055 : Statics.field287;
                    }
                    if (var396 == 1300) {
                        var4--;
                        int var85 = field409[var4] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var5--;
                            var84.method3100(var85, field410[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var396 == 1301) {
                        var4 -= 2;
                        int var86 = field409[var4];
                        int var87 = field409[var4 + 1];
                        var84.field2639 = class158.method2996(var86, var87);
                        continue;
                    }
                    if (var396 == 1302) {
                        var4--;
                        var84.field2574 = field409[var4] == 1;
                        continue;
                    }
                    if (var396 == 1303) {
                        var4--;
                        var84.field2568 = field409[var4];
                        continue;
                    }
                    if (var396 == 1304) {
                        var4--;
                        var84.field2641 = field409[var4];
                        continue;
                    }
                    if (var396 == 1305) {
                        var5--;
                        var84.field2637 = field410[var5];
                        continue;
                    }
                    if (var396 == 1306) {
                        var5--;
                        var84.field2643 = field410[var5];
                        continue;
                    }
                    if (var396 == 1307) {
                        var84.field2599 = null;
                        continue;
                    }
                } else {
                    if (var396 >= 1400 && var396 < 1500 || var396 >= 2400 && var396 < 2500) {
                        class158 var88;
                        if (var396 >= 2000) {
                            var396 -= 1000;
                            var4--;
                            var88 = class158.method2658(field409[var4]);
                        } else {
                            var88 = var61 ? Statics.field2055 : Statics.field287;
                        }
                        var5--;
                        String var89 = field410[var5];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var4--;
                            int var91 = field409[var4];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var4--;
                                    var90[var91] = field409[var4];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var5--;
                                var92[var93] = field410[var5];
                            } else {
                                var4--;
                                var92[var93] = Integer.valueOf(field409[var4]);
                            }
                        }
                        var4--;
                        int var94 = field409[var4];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var396 == 1400) {
                            var88.field2646 = var92;
                        }
                        if (var396 == 1401) {
                            var88.field2649 = var92;
                        }
                        if (var396 == 1402) {
                            var88.field2660 = var92;
                        }
                        if (var396 == 1403) {
                            var88.field2650 = var92;
                        }
                        if (var396 == 1404) {
                            var88.field2652 = var92;
                        }
                        if (var396 == 1405) {
                            var88.field2658 = var92;
                        }
                        if (var396 == 1406) {
                            var88.field2598 = var92;
                        }
                        if (var396 == 1407) {
                            var88.field2657 = var92;
                            var88.field2655 = var90;
                        }
                        if (var396 == 1408) {
                            var88.field2659 = var92;
                        }
                        if (var396 == 1409) {
                            var88.field2636 = var92;
                        }
                        if (var396 == 1410) {
                            var88.field2654 = var92;
                        }
                        if (var396 == 1411) {
                            var88.field2630 = var92;
                        }
                        if (var396 == 1412) {
                            var88.field2651 = var92;
                        }
                        if (var396 == 1414) {
                            var88.field2631 = var92;
                            var88.field2606 = var90;
                        }
                        if (var396 == 1415) {
                            var88.field2621 = var92;
                            var88.field2688 = var90;
                        }
                        if (var396 == 1416) {
                            var88.field2661 = var92;
                        }
                        if (var396 == 1417) {
                            var88.field2662 = var92;
                        }
                        if (var396 == 1418) {
                            var88.field2666 = var92;
                        }
                        if (var396 == 1419) {
                            var88.field2667 = var92;
                        }
                        if (var396 == 1420) {
                            var88.field2572 = var92;
                        }
                        if (var396 == 1421) {
                            var88.field2619 = var92;
                        }
                        if (var396 == 1422) {
                            var88.field2670 = var92;
                        }
                        if (var396 == 1423) {
                            var88.field2671 = var92;
                        }
                        if (var396 == 1424) {
                            var88.field2672 = var92;
                        }
                        var88.field2644 = true;
                        continue;
                    }
                    if (var396 < 1600) {
                        class158 var95 = var61 ? Statics.field2055 : Statics.field287;
                        if (var396 == 1500) {
                            field409[var4++] = var95.field2582;
                            continue;
                        }
                        if (var396 == 1501) {
                            field409[var4++] = var95.field2580;
                            continue;
                        }
                        if (var396 == 1502) {
                            field409[var4++] = var95.field2586;
                            continue;
                        }
                        if (var396 == 1503) {
                            field409[var4++] = var95.field2587;
                            continue;
                        }
                        if (var396 == 1504) {
                            field409[var4++] = var95.field2589 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 1505) {
                            field409[var4++] = var95.field2588;
                            continue;
                        }
                    } else if (var396 < 1700) {
                        class158 var96 = var61 ? Statics.field2055 : Statics.field287;
                        if (var396 == 1600) {
                            field409[var4++] = var96.field2590;
                            continue;
                        }
                        if (var396 == 1601) {
                            field409[var4++] = var96.field2656;
                            continue;
                        }
                        if (var396 == 1602) {
                            field410[var5++] = var96.field2634;
                            continue;
                        }
                        if (var396 == 1603) {
                            field409[var4++] = var96.field2577;
                            continue;
                        }
                        if (var396 == 1604) {
                            field409[var4++] = var96.field2593;
                            continue;
                        }
                        if (var396 == 1605) {
                            field409[var4++] = var96.field2680;
                            continue;
                        }
                        if (var396 == 1606) {
                            field409[var4++] = var96.field2647;
                            continue;
                        }
                        if (var396 == 1607) {
                            field409[var4++] = var96.field2615;
                            continue;
                        }
                        if (var396 == 1608) {
                            field409[var4++] = var96.field2618;
                            continue;
                        }
                    } else if (var396 < 1800) {
                        class158 var97 = var61 ? Statics.field2055 : Statics.field287;
                        if (var396 == 1700) {
                            field409[var4++] = var97.field2681;
                            continue;
                        }
                        if (var396 == 1701) {
                            if (var97.field2681 == -1) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = var97.field2682;
                            }
                            continue;
                        }
                        if (var396 == 1702) {
                            field409[var4++] = var97.field2620;
                            continue;
                        }
                    } else if (var396 < 1900) {
                        class158 var98 = var61 ? Statics.field2055 : Statics.field287;
                        if (var396 == 1800) {
                            field409[var4++] = class162.method882(client.method1225(var98));
                            continue;
                        }
                        if (var396 == 1801) {
                            var4--;
                            int var99 = field409[var4];
                            int var397 = var99 - 1;
                            if (var98.field2599 != null && var397 < var98.field2599.length && var98.field2599[var397] != null) {
                                field410[var5++] = var98.field2599[var397];
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 1802) {
                            if (var98.field2637 == null) {
                                field410[var5++] = "";
                            } else {
                                field410[var5++] = var98.field2637;
                            }
                            continue;
                        }
                    } else if (var396 < 2600) {
                        var4--;
                        class158 var100 = class158.method2658(field409[var4]);
                        if (var396 == 2500) {
                            field409[var4++] = var100.field2582;
                            continue;
                        }
                        if (var396 == 2501) {
                            field409[var4++] = var100.field2580;
                            continue;
                        }
                        if (var396 == 2502) {
                            field409[var4++] = var100.field2586;
                            continue;
                        }
                        if (var396 == 2503) {
                            field409[var4++] = var100.field2587;
                            continue;
                        }
                        if (var396 == 2504) {
                            field409[var4++] = var100.field2589 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 2505) {
                            field409[var4++] = var100.field2588;
                            continue;
                        }
                    } else if (var396 < 2700) {
                        var4--;
                        class158 var101 = class158.method2658(field409[var4]);
                        if (var396 == 2600) {
                            field409[var4++] = var101.field2590;
                            continue;
                        }
                        if (var396 == 2601) {
                            field409[var4++] = var101.field2656;
                            continue;
                        }
                        if (var396 == 2602) {
                            field410[var5++] = var101.field2634;
                            continue;
                        }
                        if (var396 == 2603) {
                            field409[var4++] = var101.field2577;
                            continue;
                        }
                        if (var396 == 2604) {
                            field409[var4++] = var101.field2593;
                            continue;
                        }
                        if (var396 == 2605) {
                            field409[var4++] = var101.field2680;
                            continue;
                        }
                        if (var396 == 2606) {
                            field409[var4++] = var101.field2647;
                            continue;
                        }
                        if (var396 == 2607) {
                            field409[var4++] = var101.field2615;
                            continue;
                        }
                        if (var396 == 2608) {
                            field409[var4++] = var101.field2618;
                            continue;
                        }
                    } else if (var396 < 2800) {
                        if (var396 == 2700) {
                            var4--;
                            class158 var102 = class158.method2658(field409[var4]);
                            field409[var4++] = var102.field2681;
                            continue;
                        }
                        if (var396 == 2701) {
                            var4--;
                            class158 var103 = class158.method2658(field409[var4]);
                            if (var103.field2681 == -1) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = var103.field2682;
                            }
                            continue;
                        }
                        if (var396 == 2702) {
                            var4--;
                            int var104 = field409[var4];
                            class4 var105 = (class4) client.field645.method3273((long) var104);
                            if (var105 == null) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var396 < 2900) {
                        var4--;
                        class158 var106 = class158.method2658(field409[var4]);
                        if (var396 == 2800) {
                            field409[var4++] = class162.method882(client.method1225(var106));
                            continue;
                        }
                        if (var396 == 2801) {
                            var4--;
                            int var107 = field409[var4];
                            int var398 = var107 - 1;
                            if (var106.field2599 != null && var398 < var106.field2599.length && var106.field2599[var398] != null) {
                                field410[var5++] = var106.field2599[var398];
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 2802) {
                            if (var106.field2637 == null) {
                                field410[var5++] = "";
                            } else {
                                field410[var5++] = var106.field2637;
                            }
                            continue;
                        }
                    } else if (var396 < 3200) {
                        if (var396 == 3100) {
                            var5--;
                            String var108 = field410[var5];
                            client.method224(0, "", var108);
                            continue;
                        }
                        if (var396 == 3101) {
                            var4 -= 2;
                            client.method747(Statics.field139, field409[var4], field409[var4 + 1]);
                            continue;
                        }
                        if (var396 == 3103) {
                            client.field520.method2325(255);
                            for (class4 var109 = (class4) client.field645.method3276(); var109 != null; var109 = (class4) client.field645.method3277()) {
                                if (var109.field57 == 0 || var109.field57 == 3) {
                                    client.method61(var109, true);
                                }
                            }
                            if (client.field648 != null) {
                                client.method1610(client.field648);
                                client.field648 = null;
                            }
                            continue;
                        }
                        if (var396 == 3104) {
                            var5--;
                            String var110 = field410[var5];
                            int var111 = 0;
                            if (class147.method113(var110)) {
                                int var112 = class147.method1861(var110, 10, true);
                                var111 = var112;
                            }
                            client.field520.method2325(163);
                            client.field520.method2441(var111);
                            continue;
                        }
                        if (var396 == 3105) {
                            var5--;
                            String var113 = field410[var5];
                            client.field520.method2325(104);
                            client.field520.method2438(var113.length() + 1);
                            client.field520.method2443(var113);
                            continue;
                        }
                        if (var396 == 3106) {
                            var5--;
                            String var114 = field410[var5];
                            client.field520.method2325(180);
                            client.field520.method2438(var114.length() + 1);
                            client.field520.method2443(var114);
                            continue;
                        }
                        if (var396 == 3107) {
                            var4--;
                            int var115 = field409[var4];
                            var5--;
                            String var116 = field410[var5];
                            boolean var117 = false;
                            for (int var118 = 0; var118 < client.field605; var118++) {
                                class3 var119 = client.field604[client.field525[var118]];
                                if (var119 != null && var119.field36 != null && var119.field36.equalsIgnoreCase(var116)) {
                                    client.method1409(Statics.field139.field443[0], Statics.field139.field449[0], var119.field443[0], var119.field449[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var115 == 1) {
                                        client.field520.method2325(2);
                                        client.field520.method2575(client.field525[var118]);
                                    } else if (var115 == 4) {
                                        client.field520.method2325(142);
                                        client.field520.method2575(client.field525[var118]);
                                    } else if (var115 == 6) {
                                        client.field520.method2325(198);
                                        client.field520.method2481(client.field525[var118]);
                                    } else if (var115 == 7) {
                                        client.field520.method2325(254);
                                        client.field520.method2585(client.field525[var118]);
                                    }
                                    var117 = true;
                                    break;
                                }
                            }
                            if (!var117) {
                                client.method224(0, "", class134.field2174 + var116);
                            }
                            continue;
                        }
                        if (var396 == 3108) {
                            var4 -= 3;
                            int var120 = field409[var4];
                            int var121 = field409[var4 + 1];
                            int var122 = field409[var4 + 2];
                            class158 var123 = class158.method2658(var122);
                            client.method2316(var123, var120, var121);
                            continue;
                        }
                        if (var396 == 3109) {
                            var4 -= 2;
                            int var124 = field409[var4];
                            int var125 = field409[var4 + 1];
                            class158 var126 = var61 ? Statics.field2055 : Statics.field287;
                            client.method2316(var126, var124, var125);
                            continue;
                        }
                    } else if (var396 < 3300) {
                        if (var396 == 3200) {
                            var4 -= 3;
                            client.method148(field409[var4], field409[var4 + 1], field409[var4 + 2]);
                            continue;
                        }
                        if (var396 == 3201) {
                            var4--;
                            int var127 = field409[var4];
                            if (var127 == -1 && !client.field563) {
                                Statics.field2342.method2747();
                                class138.field2338 = 1;
                                Statics.field2343 = null;
                            } else if (var127 != -1 && client.field720 != var127 && client.field719 != 0 && !client.field563) {
                                class138.method44(2, Statics.field1034, var127, 0, client.field719, false);
                            }
                            client.field720 = var127;
                            continue;
                        }
                        if (var396 == 3202) {
                            var4 -= 2;
                            client.method164(field409[var4], field409[var4 + 1]);
                            continue;
                        }
                    } else if (var396 < 3400) {
                        if (var396 == 3300) {
                            field409[var4++] = client.field491;
                            continue;
                        }
                        if (var396 == 3301) {
                            var4 -= 2;
                            int var128 = field409[var4];
                            int var129 = field409[var4 + 1];
                            int[] var130 = field409;
                            int var131 = var4++;
                            class19 var132 = (class19) class19.field291.method3273((long) var128);
                            int var133;
                            if (var132 == null) {
                                var133 = -1;
                            } else if (var129 >= 0 && var129 < var132.field288.length) {
                                var133 = var132.field288[var129];
                            } else {
                                var133 = -1;
                            }
                            var130[var131] = var133;
                            continue;
                        }
                        if (var396 == 3302) {
                            var4 -= 2;
                            int var134 = field409[var4];
                            int var135 = field409[var4 + 1];
                            field409[var4++] = class19.method96(var134, var135);
                            continue;
                        }
                        if (var396 == 3303) {
                            var4 -= 2;
                            int var136 = field409[var4];
                            int var137 = field409[var4 + 1];
                            field409[var4++] = class19.method1406(var136, var137);
                            continue;
                        }
                        if (var396 == 3304) {
                            var4--;
                            int var138 = field409[var4];
                            field409[var4++] = class41.method1859(var138).field1033;
                            continue;
                        }
                        if (var396 == 3305) {
                            var4--;
                            int var139 = field409[var4];
                            field409[var4++] = client.field622[var139];
                            continue;
                        }
                        if (var396 == 3306) {
                            var4--;
                            int var140 = field409[var4];
                            field409[var4++] = client.field623[var140];
                            continue;
                        }
                        if (var396 == 3307) {
                            var4--;
                            int var141 = field409[var4];
                            field409[var4++] = client.field530[var141];
                            continue;
                        }
                        if (var396 == 3308) {
                            int var142 = Statics.field379;
                            int var143 = (Statics.field139.field429 >> 7) + Statics.field1518;
                            int var144 = (Statics.field139.field423 >> 7) + Statics.field1830;
                            field409[var4++] = (var142 << 28) + (var143 << 14) + var144;
                            continue;
                        }
                        if (var396 == 3309) {
                            var4--;
                            int var145 = field409[var4];
                            field409[var4++] = var145 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3310) {
                            var4--;
                            int var146 = field409[var4];
                            field409[var4++] = var146 >> 28;
                            continue;
                        }
                        if (var396 == 3311) {
                            var4--;
                            int var147 = field409[var4];
                            field409[var4++] = var147 & 0x3FFF;
                            continue;
                        }
                        if (var396 == 3312) {
                            field409[var4++] = client.field654 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3313) {
                            var4 -= 2;
                            int var148 = field409[var4] + 32768;
                            int var149 = field409[var4 + 1];
                            int[] var150 = field409;
                            int var151 = var4++;
                            class19 var152 = (class19) class19.field291.method3273((long) var148);
                            int var153;
                            if (var152 == null) {
                                var153 = -1;
                            } else if (var149 >= 0 && var149 < var152.field288.length) {
                                var153 = var152.field288[var149];
                            } else {
                                var153 = -1;
                            }
                            var150[var151] = var153;
                            continue;
                        }
                        if (var396 == 3314) {
                            var4 -= 2;
                            int var154 = field409[var4] + 32768;
                            int var155 = field409[var4 + 1];
                            field409[var4++] = class19.method96(var154, var155);
                            continue;
                        }
                        if (var396 == 3315) {
                            var4 -= 2;
                            int var156 = field409[var4] + 32768;
                            int var157 = field409[var4 + 1];
                            field409[var4++] = class19.method1406(var156, var157);
                            continue;
                        }
                        if (var396 == 3316) {
                            if (client.field564 >= 2) {
                                field409[var4++] = client.field564;
                            } else {
                                field409[var4++] = 0;
                            }
                            continue;
                        }
                        if (var396 == 3317) {
                            field409[var4++] = client.field586;
                            continue;
                        }
                        if (var396 == 3318) {
                            field409[var4++] = client.field702;
                            continue;
                        }
                        if (var396 == 3321) {
                            field409[var4++] = client.field649;
                            continue;
                        }
                        if (var396 == 3322) {
                            field409[var4++] = client.field559;
                            continue;
                        }
                        if (var396 == 3323) {
                            if (client.field567) {
                                field409[var4++] = 1;
                            } else {
                                field409[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3500) {
                        if (var396 == 3400) {
                            var4 -= 2;
                            int var158 = field409[var4];
                            int var159 = field409[var4 + 1];
                            class39 var160 = class39.method155(var158);
                            if (var160.field973 != 's') {
                            }
                            for (int var161 = 0; var161 < var160.field974; var161++) {
                                if (var160.field975[var161] == var159) {
                                    field410[var5++] = var160.field977[var161];
                                    var160 = null;
                                    break;
                                }
                            }
                            if (var160 != null) {
                                field410[var5++] = var160.field970;
                            }
                            continue;
                        }
                        if (var396 == 3408) {
                            var4 -= 4;
                            int var162 = field409[var4];
                            int var163 = field409[var4 + 1];
                            int var164 = field409[var4 + 2];
                            int var165 = field409[var4 + 3];
                            class39 var166 = class39.method155(var164);
                            if (var166.field980 == var162 && var166.field973 == var163) {
                                for (int var167 = 0; var167 < var166.field974; var167++) {
                                    if (var166.field975[var167] == var165) {
                                        if (var163 == 115) {
                                            field410[var5++] = var166.field977[var167];
                                        } else {
                                            field409[var4++] = var166.field976[var167];
                                        }
                                        var166 = null;
                                        break;
                                    }
                                }
                                if (var166 != null) {
                                    if (var163 == 115) {
                                        field410[var5++] = var166.field970;
                                    } else {
                                        field409[var4++] = var166.field971;
                                    }
                                }
                                continue;
                            }
                            if (var163 == 115) {
                                field410[var5++] = "null";
                            } else {
                                field409[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var396 < 3700) {
                        if (var396 == 3600) {
                            if (client.field738 == 0) {
                                field409[var4++] = -2;
                            } else if (client.field738 == 1) {
                                field409[var4++] = -1;
                            } else {
                                field409[var4++] = client.field737;
                            }
                            continue;
                        }
                        if (var396 == 3601) {
                            var4--;
                            int var168 = field409[var4];
                            if (client.field738 == 2 && var168 < client.field737) {
                                field410[var5++] = client.field533[var168].field382;
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 3602) {
                            var4--;
                            int var169 = field409[var4];
                            if (client.field738 == 2 && var169 < client.field737) {
                                field409[var4++] = client.field533[var169].field371;
                                continue;
                            }
                            field409[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3603) {
                            var4--;
                            int var170 = field409[var4];
                            if (client.field738 == 2 && var170 < client.field737) {
                                field409[var4++] = client.field533[var170].field372;
                                continue;
                            }
                            field409[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3604) {
                            var5--;
                            String var171 = field410[var5];
                            var4--;
                            int var172 = field409[var4];
                            Statics.method6(var171, var172);
                            continue;
                        }
                        if (var396 == 3605) {
                            var5--;
                            String var173 = field410[var5];
                            client.method243(var173);
                            continue;
                        }
                        if (var396 == 3606) {
                            var5--;
                            String var174 = field410[var5];
                            client.method244(var174);
                            continue;
                        }
                        if (var396 == 3607) {
                            var5--;
                            String var175 = field410[var5];
                            if (var175 == null) {
                                continue;
                            }
                            if ((client.field535 < 100 || client.field611 == 1) && client.field535 < 400) {
                                String var176 = class148.method122(var175, Statics.field76);
                                if (var176 == null) {
                                    continue;
                                }
                                for (int var177 = 0; var177 < client.field535; var177++) {
                                    class11 var178 = client.field742[var177];
                                    String var179 = class148.method122(var178.field178, Statics.field76);
                                    if (var179 != null && var179.equals(var176)) {
                                        client.method224(0, "", var175 + class134.field2251);
                                        continue label2488;
                                    }
                                    if (var178.field179 != null) {
                                        String var180 = class148.method122(var178.field179, Statics.field76);
                                        if (var180 != null && var180.equals(var176)) {
                                            client.method224(0, "", var175 + class134.field2251);
                                            continue label2488;
                                        }
                                    }
                                }
                                for (int var181 = 0; var181 < client.field737; var181++) {
                                    class23 var182 = client.field533[var181];
                                    String var183 = class148.method122(var182.field382, Statics.field76);
                                    if (var183 != null && var183.equals(var176)) {
                                        client.method224(0, "", class134.field2093 + var175 + class134.field2116);
                                        continue label2488;
                                    }
                                    if (var182.field370 != null) {
                                        String var184 = class148.method122(var182.field370, Statics.field76);
                                        if (var184 != null && var184.equals(var176)) {
                                            client.method224(0, "", class134.field2093 + var175 + class134.field2116);
                                            continue label2488;
                                        }
                                    }
                                }
                                if (class148.method122(Statics.field139.field36, Statics.field76).equals(var176)) {
                                    client.method224(0, "", class134.field2253);
                                } else {
                                    client.field520.method2325(63);
                                    class116 var185 = client.field520;
                                    int var186 = var175.length() + 1;
                                    var185.method2438(var186);
                                    client.field520.method2443(var175);
                                }
                                continue;
                            }
                            client.method224(0, "", class134.field2250);
                            continue;
                        }
                        if (var396 == 3608) {
                            var5--;
                            String var187 = field410[var5];
                            if (var187 == null) {
                                continue;
                            }
                            String var188 = class148.method122(var187, Statics.field76);
                            if (var188 == null) {
                                continue;
                            }
                            int var189 = 0;
                            while (true) {
                                if (var189 >= client.field535) {
                                    continue label2488;
                                }
                                class11 var190 = client.field742[var189];
                                String var191 = var190.field178;
                                String var192 = class148.method122(var191, Statics.field76);
                                if (class136.method576(var187, var188, var191, var192)) {
                                    client.field535--;
                                    for (int var193 = var189; var193 < client.field535; var193++) {
                                        client.field742[var193] = client.field742[var193 + 1];
                                    }
                                    client.field675 = client.field682;
                                    client.field520.method2325(250);
                                    class116 var194 = client.field520;
                                    int var195 = var187.length() + 1;
                                    var194.method2438(var195);
                                    client.field520.method2443(var187);
                                    continue label2488;
                                }
                                var189++;
                            }
                        }
                        if (var396 == 3609) {
                            var5--;
                            String var196 = field410[var5];
                            if (var196.startsWith(class2.method806(0)) || var196.startsWith(class2.method806(1))) {
                                var196 = var196.substring(7);
                            }
                            field409[var4++] = client.method192(var196) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3611) {
                            if (client.field661 == null) {
                                field410[var5++] = "";
                            } else {
                                field410[var5++] = class146.method1270(client.field661);
                            }
                            continue;
                        }
                        if (var396 == 3612) {
                            if (client.field661 == null) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = Statics.field1189;
                            }
                            continue;
                        }
                        if (var396 == 3613) {
                            var4--;
                            int var197 = field409[var4];
                            if (client.field661 != null && var197 < Statics.field1189) {
                                field410[var5++] = Statics.field1027[var197].field113;
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 3614) {
                            var4--;
                            int var198 = field409[var4];
                            if (client.field661 != null && var198 < Statics.field1189) {
                                field409[var4++] = Statics.field1027[var198].field110;
                                continue;
                            }
                            field409[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3615) {
                            var4--;
                            int var199 = field409[var4];
                            if (client.field661 != null && var199 < Statics.field1189) {
                                field409[var4++] = Statics.field1027[var199].field106;
                                continue;
                            }
                            field409[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3616) {
                            field409[var4++] = Statics.field883;
                            continue;
                        }
                        if (var396 == 3617) {
                            var5--;
                            String var200 = field410[var5];
                            client.method41(var200);
                            continue;
                        }
                        if (var396 == 3618) {
                            field409[var4++] = Statics.field2355;
                            continue;
                        }
                        if (var396 == 3619) {
                            var5--;
                            String var201 = field410[var5];
                            if (!var201.equals("")) {
                                client.field520.method2325(8);
                                class116 var202 = client.field520;
                                int var203 = var201.length() + 1;
                                var202.method2438(var203);
                                client.field520.method2443(var201);
                            }
                            continue;
                        }
                        if (var396 == 3620) {
                            client.method236();
                            continue;
                        }
                        if (var396 == 3621) {
                            if (client.field738 == 0) {
                                field409[var4++] = -1;
                            } else {
                                field409[var4++] = client.field535;
                            }
                            continue;
                        }
                        if (var396 == 3622) {
                            var4--;
                            int var204 = field409[var4];
                            if (client.field738 != 0 && var204 < client.field535) {
                                field410[var5++] = client.field742[var204].field178;
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 3623) {
                            var5--;
                            String var205 = field410[var5];
                            if (var205.startsWith(class2.method806(0)) || var205.startsWith(class2.method806(1))) {
                                var205 = var205.substring(7);
                            }
                            field409[var4++] = client.method46(var205) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 3624) {
                            var4--;
                            int var206 = field409[var4];
                            if (Statics.field1027 != null && var206 < Statics.field1189 && Statics.field1027[var206].field113.equalsIgnoreCase(Statics.field139.field36)) {
                                field409[var4++] = 1;
                                continue;
                            }
                            field409[var4++] = 0;
                            continue;
                        }
                        if (var396 == 3625) {
                            if (client.field721 == null) {
                                field410[var5++] = "";
                            } else {
                                field410[var5++] = class146.method1270(client.field721);
                            }
                            continue;
                        }
                    } else if (var396 < 4100) {
                        if (var396 == 4000) {
                            var4 -= 2;
                            int var207 = field409[var4];
                            int var208 = field409[var4 + 1];
                            field409[var4++] = var207 + var208;
                            continue;
                        }
                        if (var396 == 4001) {
                            var4 -= 2;
                            int var209 = field409[var4];
                            int var210 = field409[var4 + 1];
                            field409[var4++] = var209 - var210;
                            continue;
                        }
                        if (var396 == 4002) {
                            var4 -= 2;
                            int var211 = field409[var4];
                            int var212 = field409[var4 + 1];
                            field409[var4++] = var211 * var212;
                            continue;
                        }
                        if (var396 == 4003) {
                            var4 -= 2;
                            int var213 = field409[var4];
                            int var214 = field409[var4 + 1];
                            field409[var4++] = var213 / var214;
                            continue;
                        }
                        if (var396 == 4004) {
                            var4--;
                            int var215 = field409[var4];
                            field409[var4++] = (int) (Math.random() * (double) var215);
                            continue;
                        }
                        if (var396 == 4005) {
                            var4--;
                            int var216 = field409[var4];
                            field409[var4++] = (int) (Math.random() * (double) (var216 + 1));
                            continue;
                        }
                        if (var396 == 4006) {
                            var4 -= 5;
                            int var217 = field409[var4];
                            int var218 = field409[var4 + 1];
                            int var219 = field409[var4 + 2];
                            int var220 = field409[var4 + 3];
                            int var221 = field409[var4 + 4];
                            field409[var4++] = (var218 - var217) * (var221 - var219) / (var220 - var219) + var217;
                            continue;
                        }
                        if (var396 == 4007) {
                            var4 -= 2;
                            int var222 = field409[var4];
                            int var223 = field409[var4 + 1];
                            field409[var4++] = var222 * var223 / 100 + var222;
                            continue;
                        }
                        if (var396 == 4008) {
                            var4 -= 2;
                            int var224 = field409[var4];
                            int var225 = field409[var4 + 1];
                            field409[var4++] = var224 | 0x1 << var225;
                            continue;
                        }
                        if (var396 == 4009) {
                            var4 -= 2;
                            int var226 = field409[var4];
                            int var227 = field409[var4 + 1];
                            field409[var4++] = var226 & -1 - (0x1 << var227);
                            continue;
                        }
                        if (var396 == 4010) {
                            var4 -= 2;
                            int var228 = field409[var4];
                            int var229 = field409[var4 + 1];
                            field409[var4++] = (var228 & 0x1 << var229) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var396 == 4011) {
                            var4 -= 2;
                            int var230 = field409[var4];
                            int var231 = field409[var4 + 1];
                            field409[var4++] = var230 % var231;
                            continue;
                        }
                        if (var396 == 4012) {
                            var4 -= 2;
                            int var232 = field409[var4];
                            int var233 = field409[var4 + 1];
                            if (var232 == 0) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = (int) Math.pow((double) var232, (double) var233);
                            }
                            continue;
                        }
                        if (var396 == 4013) {
                            var4 -= 2;
                            int var234 = field409[var4];
                            int var235 = field409[var4 + 1];
                            if (var234 == 0) {
                                field409[var4++] = 0;
                            } else if (var235 == 0) {
                                field409[var4++] = Integer.MAX_VALUE;
                            } else {
                                field409[var4++] = (int) Math.pow((double) var234, 1.0D / (double) var235);
                            }
                            continue;
                        }
                        if (var396 == 4014) {
                            var4 -= 2;
                            int var236 = field409[var4];
                            int var237 = field409[var4 + 1];
                            field409[var4++] = var236 & var237;
                            continue;
                        }
                        if (var396 == 4015) {
                            var4 -= 2;
                            int var238 = field409[var4];
                            int var239 = field409[var4 + 1];
                            field409[var4++] = var238 | var239;
                            continue;
                        }
                    } else if (var396 < 4200) {
                        if (var396 == 4100) {
                            var5--;
                            String var240 = field410[var5];
                            var4--;
                            int var241 = field409[var4];
                            field410[var5++] = var240 + var241;
                            continue;
                        }
                        if (var396 == 4101) {
                            var5 -= 2;
                            String var242 = field410[var5];
                            String var243 = field410[var5 + 1];
                            field410[var5++] = var242 + var243;
                            continue;
                        }
                        if (var396 == 4102) {
                            var5--;
                            String var244 = field410[var5];
                            var4--;
                            int var245 = field409[var4];
                            String[] var246 = field410;
                            int var247 = var5++;
                            String var249;
                            if (var245 < 0) {
                                var249 = Integer.toString(var245);
                            } else {
                                int var250 = var245;
                                String var251;
                                if (var245 < 0) {
                                    var251 = Integer.toString(var245, 10);
                                } else {
                                    int var252 = 2;
                                    int var253 = var245 / 10;
                                    while (var253 != 0) {
                                        var253 /= 10;
                                        var252++;
                                    }
                                    char[] var254 = new char[var252];
                                    var254[0] = '+';
                                    for (int var255 = var252 - 1; var255 > 0; var255--) {
                                        int var256 = var250;
                                        var250 /= 10;
                                        int var257 = var256 - var250 * 10;
                                        if (var257 >= 10) {
                                            var254[var255] = (char) (var257 + 87);
                                        } else {
                                            var254[var255] = (char) (var257 + 48);
                                        }
                                    }
                                    var251 = new String(var254);
                                }
                                var249 = var251;
                            }
                            var246[var247] = var244 + var249;
                            continue;
                        }
                        if (var396 == 4103) {
                            var5--;
                            String var258 = field410[var5];
                            field410[var5++] = var258.toLowerCase();
                            continue;
                        }
                        if (var396 == 4104) {
                            var4--;
                            int var259 = field409[var4];
                            long var260 = ((long) var259 + 11745L) * 86400000L;
                            field415.setTime(new Date(var260));
                            int var262 = field415.get(5);
                            int var263 = field415.get(2);
                            int var264 = field415.get(1);
                            field410[var5++] = var262 + "-" + field406[var263] + "-" + var264;
                            continue;
                        }
                        if (var396 == 4105) {
                            var5 -= 2;
                            String var265 = field410[var5];
                            String var266 = field410[var5 + 1];
                            if (Statics.field139.field33 != null && Statics.field139.field33.field2715) {
                                field410[var5++] = var266;
                                continue;
                            }
                            field410[var5++] = var265;
                            continue;
                        }
                        if (var396 == 4106) {
                            var4--;
                            int var267 = field409[var4];
                            field410[var5++] = Integer.toString(var267);
                            continue;
                        }
                        if (var396 == 4107) {
                            var5 -= 2;
                            int[] var268 = field409;
                            int var269 = var4++;
                            String var270 = field410[var5];
                            String var271 = field410[var5 + 1];
                            int var272 = client.field488;
                            int var273 = var270.length();
                            int var274 = var271.length();
                            int var275 = 0;
                            int var276 = 0;
                            byte var277 = 0;
                            byte var278 = 0;
                            int var279;
                            label2283: while (true) {
                                if (var275 - var277 >= var273 && var276 - var278 >= var274) {
                                    int var290 = Math.min(var273, var274);
                                    for (int var291 = 0; var291 < var290; var291++) {
                                        char var294 = var270.charAt(var291);
                                        char var295 = var271.charAt(var291);
                                        if (var294 != var295 && Character.toUpperCase(var294) != Character.toUpperCase(var295)) {
                                            char var296 = Character.toLowerCase(var294);
                                            char var297 = Character.toLowerCase(var295);
                                            if (var296 != var297) {
                                                var279 = class150.method30(var296, var272) - class150.method30(var297, var272);
                                                break label2283;
                                            }
                                        }
                                    }
                                    int var298 = var273 - var274;
                                    if (var298 == 0) {
                                        for (int var299 = 0; var299 < var290; var299++) {
                                            char var300 = var270.charAt(var299);
                                            char var301 = var271.charAt(var299);
                                            if (var300 != var301) {
                                                var279 = class150.method30(var300, var272) - class150.method30(var301, var272);
                                                break label2283;
                                            }
                                        }
                                        var279 = 0;
                                    } else {
                                        var279 = var298;
                                    }
                                    break;
                                }
                                if (var275 - var277 >= var273) {
                                    var279 = -1;
                                    break;
                                }
                                if (var276 - var278 >= var274) {
                                    var279 = 1;
                                    break;
                                }
                                char var280;
                                if (var277 == 0) {
                                    var280 = var270.charAt(var275++);
                                } else {
                                    var280 = (char) var277;
                                    boolean var281 = false;
                                }
                                char var282;
                                if (var278 == 0) {
                                    var282 = var271.charAt(var276++);
                                } else {
                                    var282 = (char) var278;
                                    boolean var283 = false;
                                }
                                byte var284;
                                if (var280 == 198) {
                                    var284 = 69;
                                } else if (var280 == 230) {
                                    var284 = 101;
                                } else if (var280 == 223) {
                                    var284 = 115;
                                } else if (var280 == 338) {
                                    var284 = 69;
                                } else if (var280 == 339) {
                                    var284 = 101;
                                } else {
                                    var284 = 0;
                                }
                                var277 = var284;
                                byte var285;
                                if (var282 == 198) {
                                    var285 = 69;
                                } else if (var282 == 230) {
                                    var285 = 101;
                                } else if (var282 == 223) {
                                    var285 = 115;
                                } else if (var282 == 338) {
                                    var285 = 69;
                                } else if (var282 == 339) {
                                    var285 = 101;
                                } else {
                                    var285 = 0;
                                }
                                var278 = var285;
                                char var286 = class150.method2617(var280, var272);
                                char var287 = class150.method2617(var282, var272);
                                if (var286 != var287 && Character.toUpperCase(var286) != Character.toUpperCase(var287)) {
                                    char var288 = Character.toLowerCase(var286);
                                    char var289 = Character.toLowerCase(var287);
                                    if (var288 != var289) {
                                        var279 = class150.method30(var288, var272) - class150.method30(var289, var272);
                                        break;
                                    }
                                }
                            }
                            byte var303;
                            if (var279 > 0) {
                                var303 = 1;
                            } else if (var279 < 0) {
                                var303 = -1;
                            } else {
                                var303 = 0;
                            }
                            var268[var269] = var303;
                            continue;
                        }
                        if (var396 == 4108) {
                            var5--;
                            String var304 = field410[var5];
                            var4 -= 2;
                            int var305 = field409[var4];
                            int var306 = field409[var4 + 1];
                            byte[] var307 = Statics.field279.method2970(var306, 0);
                            class183 var308 = new class183(var307);
                            field409[var4++] = var308.method3429(var304, var305);
                            continue;
                        }
                        if (var396 == 4109) {
                            var5--;
                            String var309 = field410[var5];
                            var4 -= 2;
                            int var310 = field409[var4];
                            int var311 = field409[var4 + 1];
                            byte[] var312 = Statics.field279.method2970(var311, 0);
                            class183 var313 = new class183(var312);
                            field409[var4++] = var313.method3364(var309, var310);
                            continue;
                        }
                        if (var396 == 4110) {
                            var5 -= 2;
                            String var314 = field410[var5];
                            String var315 = field410[var5 + 1];
                            var4--;
                            if (field409[var4] == 1) {
                                field410[var5++] = var314;
                            } else {
                                field410[var5++] = var315;
                            }
                            continue;
                        }
                        if (var396 == 4111) {
                            var5--;
                            String var316 = field410[var5];
                            field410[var5++] = class185.method3365(var316);
                            continue;
                        }
                        if (var396 == 4112) {
                            var5--;
                            String var317 = field410[var5];
                            var4--;
                            int var318 = field409[var4];
                            field410[var5++] = var317 + (char) var318;
                            continue;
                        }
                        if (var396 == 4113) {
                            var4--;
                            int var319 = field409[var4];
                            field409[var4++] = class147.method2394((char) var319) ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4114) {
                            var4--;
                            int var320 = field409[var4];
                            int[] var321 = field409;
                            int var322 = var4++;
                            char var323 = (char) var320;
                            boolean var324 = var323 >= '0' && var323 <= '9' || var323 >= 'A' && var323 <= 'Z' || var323 >= 'a' && var323 <= 'z';
                            var321[var322] = var324 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4115) {
                            var4--;
                            int var325 = field409[var4];
                            int[] var326 = field409;
                            int var327 = var4++;
                            char var328 = (char) var325;
                            boolean var329 = var328 >= 'A' && var328 <= 'Z' || var328 >= 'a' && var328 <= 'z';
                            var326[var327] = var329 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4116) {
                            var4--;
                            int var330 = field409[var4];
                            int[] var331 = field409;
                            int var332 = var4++;
                            char var333 = (char) var330;
                            boolean var334 = var333 >= '0' && var333 <= '9';
                            var331[var332] = var334 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4117) {
                            var5--;
                            String var335 = field410[var5];
                            if (var335 == null) {
                                field409[var4++] = 0;
                            } else {
                                field409[var4++] = var335.length();
                            }
                            continue;
                        }
                        if (var396 == 4118) {
                            var5--;
                            String var336 = field410[var5];
                            var4 -= 2;
                            int var337 = field409[var4];
                            int var338 = field409[var4 + 1];
                            field410[var5++] = var336.substring(var337, var338);
                            continue;
                        }
                        if (var396 == 4119) {
                            var5--;
                            String var339 = field410[var5];
                            StringBuilder var340 = new StringBuilder(var339.length());
                            boolean var341 = false;
                            for (int var342 = 0; var342 < var339.length(); var342++) {
                                char var343 = var339.charAt(var342);
                                if (var343 == '<') {
                                    var341 = true;
                                } else if (var343 == '>') {
                                    var341 = false;
                                } else if (!var341) {
                                    var340.append(var343);
                                }
                            }
                            field410[var5++] = var340.toString();
                            continue;
                        }
                        if (var396 == 4120) {
                            var5--;
                            String var344 = field410[var5];
                            var4--;
                            int var345 = field409[var4];
                            field409[var4++] = var344.indexOf(var345);
                            continue;
                        }
                    } else if (var396 < 4300) {
                        if (var396 == 4200) {
                            var4--;
                            int var346 = field409[var4];
                            field410[var5++] = class40.method548(var346).field989;
                            continue;
                        }
                        if (var396 == 4201) {
                            var4 -= 2;
                            int var347 = field409[var4];
                            int var348 = field409[var4 + 1];
                            class40 var349 = class40.method548(var347);
                            if (var348 >= 1 && var348 <= 5 && var349.field1001[var348 - 1] != null) {
                                field410[var5++] = var349.field1001[var348 - 1];
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 4202) {
                            var4 -= 2;
                            int var350 = field409[var4];
                            int var351 = field409[var4 + 1];
                            class40 var352 = class40.method548(var350);
                            if (var351 >= 1 && var351 <= 5 && var352.field1004[var351 - 1] != null) {
                                field410[var5++] = var352.field1004[var351 - 1];
                                continue;
                            }
                            field410[var5++] = "";
                            continue;
                        }
                        if (var396 == 4203) {
                            var4--;
                            int var353 = field409[var4];
                            field409[var4++] = class40.method548(var353).field996;
                            continue;
                        }
                        if (var396 == 4204) {
                            var4--;
                            int var354 = field409[var4];
                            field409[var4++] = class40.method548(var354).field1000 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var396 == 4205) {
                            var4--;
                            int var355 = field409[var4];
                            class40 var356 = class40.method548(var355);
                            if (var356.field1016 == -1 && var356.field1019 >= 0) {
                                field409[var4++] = var356.field1019;
                                continue;
                            }
                            field409[var4++] = var355;
                            continue;
                        }
                        if (var396 == 4206) {
                            var4--;
                            int var357 = field409[var4];
                            class40 var358 = class40.method548(var357);
                            if (var358.field1016 >= 0 && var358.field1019 >= 0) {
                                field409[var4++] = var358.field1019;
                                continue;
                            }
                            field409[var4++] = var357;
                            continue;
                        }
                        if (var396 == 4207) {
                            var4--;
                            int var359 = field409[var4];
                            field409[var4++] = class40.method548(var359).field1020 ? 1 : 0;
                            continue;
                        }
                    } else if (var396 < 5100) {
                        if (var396 == 5000) {
                            field409[var4++] = client.field701;
                            continue;
                        }
                        if (var396 == 5001) {
                            var4 -= 3;
                            client.field701 = field409[var4];
                            int var360 = field409[var4 + 1];
                            class137[] var361 = new class137[] { class137.field2337, class137.field2333, class137.field2336 };
                            class137[] var362 = var361;
                            int var363 = 0;
                            class137 var365;
                            while (true) {
                                if (var363 >= var362.length) {
                                    var365 = null;
                                    break;
                                }
                                class137 var364 = var362[var363];
                                if (var364.field2335 == var360) {
                                    var365 = var364;
                                    break;
                                }
                                var363++;
                            }
                            Statics.field1946 = var365;
                            if (Statics.field1946 == null) {
                                Statics.field1946 = class137.field2333;
                            }
                            client.field749 = field409[var4 + 2];
                            client.field520.method2325(91);
                            client.field520.method2438(client.field701);
                            client.field520.method2438(Statics.field1946.field2335);
                            client.field520.method2438(client.field749);
                            continue;
                        }
                        if (var396 == 5002) {
                            var5--;
                            String var366 = field410[var5];
                            var4 -= 2;
                            int var367 = field409[var4];
                            int var368 = field409[var4 + 1];
                            client.field520.method2325(193);
                            class116 var369 = client.field520;
                            int var370 = var366.length() + 1;
                            var369.method2438(var370 + 2);
                            client.field520.method2443(var366);
                            client.field520.method2438(var367 - 1);
                            client.field520.method2438(var368);
                            continue;
                        }
                        if (var396 == 5003) {
                            var4--;
                            int var371 = field409[var4];
                            String var372 = null;
                            if (var371 < 100) {
                                var372 = client.field698[var371];
                            }
                            if (var372 == null) {
                                var372 = "";
                            }
                            field410[var5++] = var372;
                            continue;
                        }
                        if (var396 == 5004) {
                            var4--;
                            int var373 = field409[var4];
                            int var374 = -1;
                            if (var373 < 100 && client.field698[var373] != null) {
                                var374 = client.field695[var373];
                            }
                            field409[var4++] = var374;
                            continue;
                        }
                        if (var396 == 5005) {
                            if (Statics.field1946 == null) {
                                field409[var4++] = -1;
                            } else {
                                field409[var4++] = Statics.field1946.field2335;
                            }
                            continue;
                        }
                        if (var396 == 5008) {
                            var5--;
                            String var375 = field410[var5];
                            if (var375.startsWith("::")) {
                                if (var375.equalsIgnoreCase("::toggleroof")) {
                                    Statics.field156.field187 = !Statics.field156.field187;
                                    class12.method174();
                                    if (Statics.field156.field187) {
                                        client.method224(0, "", "Roofs are now all hidden");
                                    } else {
                                        client.method224(0, "", "Roofs will only be removed selectively");
                                    }
                                }
                                if (client.field564 >= 2) {
                                    if (var375.equalsIgnoreCase("::gc")) {
                                        System.gc();
                                    }
                                    if (var375.equalsIgnoreCase("::clientdrop")) {
                                        client.method1357();
                                    }
                                    if (var375.equalsIgnoreCase("::fpson")) {
                                        client.field497 = true;
                                    }
                                    if (var375.equalsIgnoreCase("::fpsoff")) {
                                        client.field497 = false;
                                    }
                                    if (var375.equalsIgnoreCase("::noclip")) {
                                        for (int var376 = 0; var376 < 4; var376++) {
                                            for (int var377 = 1; var377 < 103; var377++) {
                                                for (int var378 = 1; var378 < 103; var378++) {
                                                    client.field572[var376].field2731[var377][var378] = 0;
                                                }
                                            }
                                        }
                                    }
                                    if (var375.equalsIgnoreCase("::errortest") && client.field484 == 2) {
                                        throw new RuntimeException();
                                    }
                                }
                                client.field520.method2325(210);
                                client.field520.method2438(var375.length() - 1);
                                client.field520.method2443(var375.substring(2));
                                continue;
                            }
                            String var379 = var375.toLowerCase();
                            byte var380 = 0;
                            if (var379.startsWith(class134.field2192)) {
                                var380 = 0;
                                var375 = var375.substring(class134.field2192.length());
                            } else if (var379.startsWith(class134.field2260)) {
                                var380 = 1;
                                var375 = var375.substring(class134.field2260.length());
                            } else if (var379.startsWith(class134.field2170)) {
                                var380 = 2;
                                var375 = var375.substring(class134.field2170.length());
                            } else if (var379.startsWith(class134.field2264)) {
                                var380 = 3;
                                var375 = var375.substring(class134.field2264.length());
                            } else if (var379.startsWith(class134.field2266)) {
                                var380 = 4;
                                var375 = var375.substring(class134.field2266.length());
                            } else if (var379.startsWith(class134.field2268)) {
                                var380 = 5;
                                var375 = var375.substring(class134.field2268.length());
                            } else if (var379.startsWith(class134.field2190)) {
                                var380 = 6;
                                var375 = var375.substring(class134.field2190.length());
                            } else if (var379.startsWith(class134.field2265)) {
                                var380 = 7;
                                var375 = var375.substring(class134.field2265.length());
                            } else if (var379.startsWith(class134.field2145)) {
                                var380 = 8;
                                var375 = var375.substring(class134.field2145.length());
                            } else if (var379.startsWith(class134.field2276)) {
                                var380 = 9;
                                var375 = var375.substring(class134.field2276.length());
                            } else if (var379.startsWith(class134.field2254)) {
                                var380 = 10;
                                var375 = var375.substring(class134.field2254.length());
                            } else if (var379.startsWith(class134.field2280)) {
                                var380 = 11;
                                var375 = var375.substring(class134.field2280.length());
                            } else if (client.field488 != 0) {
                                if (var379.startsWith(class134.field2259)) {
                                    var380 = 0;
                                    var375 = var375.substring(class134.field2259.length());
                                } else if (var379.startsWith(class134.field2261)) {
                                    var380 = 1;
                                    var375 = var375.substring(class134.field2261.length());
                                } else if (var379.startsWith(class134.field2202)) {
                                    var380 = 2;
                                    var375 = var375.substring(class134.field2202.length());
                                } else if (var379.startsWith(class134.field2273)) {
                                    var380 = 3;
                                    var375 = var375.substring(class134.field2273.length());
                                } else if (var379.startsWith(class134.field2108)) {
                                    var380 = 4;
                                    var375 = var375.substring(class134.field2108.length());
                                } else if (var379.startsWith(class134.field2269)) {
                                    var380 = 5;
                                    var375 = var375.substring(class134.field2269.length());
                                } else if (var379.startsWith(class134.field2271)) {
                                    var380 = 6;
                                    var375 = var375.substring(class134.field2271.length());
                                } else if (var379.startsWith(class134.field2283)) {
                                    var380 = 7;
                                    var375 = var375.substring(class134.field2283.length());
                                } else if (var379.startsWith(class134.field2220)) {
                                    var380 = 8;
                                    var375 = var375.substring(class134.field2220.length());
                                } else if (var379.startsWith(class134.field2277)) {
                                    var380 = 9;
                                    var375 = var375.substring(class134.field2277.length());
                                } else if (var379.startsWith(class134.field2279)) {
                                    var380 = 10;
                                    var375 = var375.substring(class134.field2279.length());
                                } else if (var379.startsWith(class134.field2199)) {
                                    var380 = 11;
                                    var375 = var375.substring(class134.field2199.length());
                                }
                            }
                            String var381 = var375.toLowerCase();
                            byte var382 = 0;
                            if (var381.startsWith(class134.field2258)) {
                                var382 = 1;
                                var375 = var375.substring(class134.field2258.length());
                            } else if (var381.startsWith(class134.field2155)) {
                                var382 = 2;
                                var375 = var375.substring(class134.field2155.length());
                            } else if (var381.startsWith(class134.field2224)) {
                                var382 = 3;
                                var375 = var375.substring(class134.field2224.length());
                            } else if (var381.startsWith(class134.field2206)) {
                                var382 = 4;
                                var375 = var375.substring(class134.field2206.length());
                            } else if (var381.startsWith(class134.field2290)) {
                                var382 = 5;
                                var375 = var375.substring(class134.field2290.length());
                            } else if (client.field488 != 0) {
                                if (var381.startsWith(class134.field2305)) {
                                    var382 = 1;
                                    var375 = var375.substring(class134.field2305.length());
                                } else if (var381.startsWith(class134.field2130)) {
                                    var382 = 2;
                                    var375 = var375.substring(class134.field2130.length());
                                } else if (var381.startsWith(class134.field2287)) {
                                    var382 = 3;
                                    var375 = var375.substring(class134.field2287.length());
                                } else if (var381.startsWith(class134.field2292)) {
                                    var382 = 4;
                                    var375 = var375.substring(class134.field2292.length());
                                } else if (var381.startsWith(class134.field2291)) {
                                    var382 = 5;
                                    var375 = var375.substring(class134.field2291.length());
                                }
                            }
                            client.field520.method2325(46);
                            client.field520.method2438(0);
                            int var383 = client.field520.field2045;
                            client.field520.method2438(var380);
                            client.field520.method2438(var382);
                            Statics.method160(client.field520, var375);
                            client.field520.method2449(client.field520.field2045 - var383);
                            continue;
                        }
                        if (var396 == 5009) {
                            var5 -= 2;
                            String var384 = field410[var5];
                            String var385 = field410[var5 + 1];
                            client.field520.method2325(215);
                            client.field520.method2585(0);
                            int var386 = client.field520.field2045;
                            client.field520.method2443(var384);
                            Statics.method160(client.field520, var385);
                            client.field520.method2448(client.field520.field2045 - var386);
                            continue;
                        }
                        if (var396 == 5010) {
                            var4--;
                            int var387 = field409[var4];
                            String var388 = null;
                            if (var387 < 100) {
                                var388 = client.field696[var387];
                            }
                            if (var388 == null) {
                                var388 = "";
                            }
                            field410[var5++] = var388;
                            continue;
                        }
                        if (var396 == 5011) {
                            var4--;
                            int var389 = field409[var4];
                            String var390 = null;
                            if (var389 < 100) {
                                var390 = client.field697[var389];
                            }
                            if (var390 == null) {
                                var390 = "";
                            }
                            field410[var5++] = var390;
                            continue;
                        }
                        if (var396 == 5015) {
                            String var391;
                            if (Statics.field139 == null || Statics.field139.field36 == null) {
                                var391 = "";
                            } else {
                                var391 = Statics.field139.field36;
                            }
                            field410[var5++] = var391;
                            continue;
                        }
                        if (var396 == 5016) {
                            field409[var4++] = client.field749;
                            continue;
                        }
                        if (var396 == 5017) {
                            field409[var4++] = client.field581;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var395) {
            StringBuilder var393 = new StringBuilder(30);
            var393.append("").append(var3.field2817).append(" ");
            for (int var394 = field413 - 1; var394 >= 0; var394--) {
                var393.append("").append(field414[var394].field280.field2817).append(" ");
            }
            var393.append("").append(var9);
            class80.method4(var393.toString(), var395);
        }
    }

    @ObfuscatedName("g.w(IB)V")
    public static void method161(int arg0) {
        if (arg0 == -1 || !class158.method829(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2570[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3.field2617 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field12 = var3.field2617;
                method1870(var4);
            }
        }
    }
}
