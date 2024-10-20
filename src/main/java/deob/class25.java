package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("b")
public class class25 {

    @ObfuscatedName("b.h")
    public static int[] field395 = new int[5];

    @ObfuscatedName("b.v")
    public static int[][] field396 = new int[5][5000];

    @ObfuscatedName("b.k")
    public static int[] field393 = new int[1000];

    @ObfuscatedName("b.g")
    public static String[] field398 = new String[1000];

    @ObfuscatedName("b.n")
    public static int field399 = 0;

    @ObfuscatedName("b.c")
    public static class17[] field400 = new class17[50];

    @ObfuscatedName("b.z")
    public static Calendar field402 = Calendar.getInstance();

    @ObfuscatedName("b.e")
    public static final String[] field403 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class25() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.p(Lp;I)V")
    public static void method754(class1 arg0) {
        Object[] var1 = arg0.field8;
        int var2 = (Integer) var1[0];
        class5 var3 = class5.method2899(var2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int[] var7 = var3.field76;
        int[] var8 = var3.field77;
        byte var9 = -1;
        field399 = 0;
        try {
            Statics.field405 = new int[var3.field83];
            int var10 = 0;
            Statics.field394 = new String[var3.field79];
            int var11 = 0;
            for (int var12 = 1; var12 < var1.length; var12++) {
                if (var1[var12] instanceof Integer) {
                    int var13 = (Integer) var1[var12];
                    if (var13 == -2147483647) {
                        var13 = arg0.field1;
                    }
                    if (var13 == -2147483646) {
                        var13 = arg0.field18;
                    }
                    if (var13 == -2147483645) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2579;
                    }
                    if (var13 == -2147483644) {
                        var13 = arg0.field5;
                    }
                    if (var13 == -2147483643) {
                        var13 = arg0.field2 == null ? -1 : arg0.field2.field2580;
                    }
                    if (var13 == -2147483642) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2579;
                    }
                    if (var13 == -2147483641) {
                        var13 = arg0.field3 == null ? -1 : arg0.field3.field2580;
                    }
                    if (var13 == -2147483640) {
                        var13 = arg0.field19;
                    }
                    if (var13 == -2147483639) {
                        var13 = arg0.field6;
                    }
                    Statics.field405[var10++] = var13;
                } else if (var1[var12] instanceof String) {
                    String var14 = (String) var1[var12];
                    if (var14.equals("event_opbase")) {
                        var14 = arg0.field9;
                    }
                    Statics.field394[var11++] = var14;
                }
            }
            int var15 = 0;
            label2534: while (true) {
                var15++;
                if (var15 > 200000) {
                    throw new RuntimeException();
                }
                var6++;
                int var413 = var7[var6];
                if (var413 < 100) {
                    if (var413 == 0) {
                        field393[var4++] = var8[var6];
                        continue;
                    }
                    if (var413 == 1) {
                        int var16 = var8[var6];
                        field393[var4++] = class158.field2700[var16];
                        continue;
                    }
                    if (var413 == 2) {
                        int var17 = var8[var6];
                        var4--;
                        class158.field2700[var17] = field393[var4];
                        continue;
                    }
                    if (var413 == 3) {
                        field398[var5++] = var3.field78[var6];
                        continue;
                    }
                    if (var413 == 6) {
                        var6 += var8[var6];
                        continue;
                    }
                    if (var413 == 7) {
                        var4 -= 2;
                        if (field393[var4 + 1] != field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 8) {
                        var4 -= 2;
                        if (field393[var4 + 1] == field393[var4]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 9) {
                        var4 -= 2;
                        if (field393[var4] < field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 10) {
                        var4 -= 2;
                        if (field393[var4] > field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 21) {
                        if (field399 == 0) {
                            return;
                        }
                        class17 var18 = field400[--field399];
                        var3 = var18.field261;
                        var7 = var3.field76;
                        var8 = var3.field77;
                        var6 = var18.field258;
                        Statics.field405 = var18.field259;
                        Statics.field394 = var18.field266;
                        continue;
                    }
                    if (var413 == 25) {
                        int var19 = var8[var6];
                        field393[var4++] = class158.method1991(var19);
                        continue;
                    }
                    if (var413 == 27) {
                        int var20 = var8[var6];
                        var4--;
                        Statics.method2659(var20, field393[var4]);
                        continue;
                    }
                    if (var413 == 31) {
                        var4 -= 2;
                        if (field393[var4] <= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 32) {
                        var4 -= 2;
                        if (field393[var4] >= field393[var4 + 1]) {
                            var6 += var8[var6];
                        }
                        continue;
                    }
                    if (var413 == 33) {
                        field393[var4++] = Statics.field405[var8[var6]];
                        continue;
                    }
                    int var10001;
                    if (var413 == 34) {
                        var10001 = var8[var6];
                        var4--;
                        Statics.field405[var10001] = field393[var4];
                        continue;
                    }
                    if (var413 == 35) {
                        field398[var5++] = Statics.field394[var8[var6]];
                        continue;
                    }
                    if (var413 == 36) {
                        var10001 = var8[var6];
                        var5--;
                        Statics.field394[var10001] = field398[var5];
                        continue;
                    }
                    if (var413 == 37) {
                        int var21 = var8[var6];
                        var5 -= var21;
                        String[] var22 = field398;
                        String var23;
                        if (var21 == 0) {
                            var23 = "";
                        } else if (var21 == 1) {
                            String var24 = var22[var5];
                            if (var24 == null) {
                                var23 = "null";
                            } else {
                                var23 = var24.toString();
                            }
                        } else {
                            int var25 = var5 + var21;
                            int var26 = 0;
                            for (int var27 = var5; var27 < var25; var27++) {
                                String var28 = var22[var27];
                                if (var28 == null) {
                                    var26 += 4;
                                } else {
                                    var26 += var28.length();
                                }
                            }
                            StringBuilder var29 = new StringBuilder(var26);
                            for (int var30 = var5; var30 < var25; var30++) {
                                String var31 = var22[var30];
                                if (var31 == null) {
                                    var29.append("null");
                                } else {
                                    var29.append(var31);
                                }
                            }
                            var23 = var29.toString();
                        }
                        field398[var5++] = var23;
                        continue;
                    }
                    if (var413 == 38) {
                        var4--;
                        continue;
                    }
                    if (var413 == 39) {
                        var5--;
                        continue;
                    }
                    if (var413 == 40) {
                        int var33 = var8[var6];
                        class5 var34 = class5.method2899(var33);
                        int[] var35 = new int[var34.field83];
                        String[] var36 = new String[var34.field79];
                        for (int var37 = 0; var37 < var34.field81; var37++) {
                            var35[var37] = field393[var4 - var34.field81 + var37];
                        }
                        for (int var38 = 0; var38 < var34.field75; var38++) {
                            var36[var38] = field398[var5 - var34.field75 + var38];
                        }
                        var4 -= var34.field81;
                        var5 -= var34.field75;
                        class17 var39 = new class17();
                        var39.field261 = var3;
                        var39.field258 = var6;
                        var39.field259 = Statics.field405;
                        var39.field266 = Statics.field394;
                        field400[++field399 - 1] = var39;
                        var3 = var34;
                        var7 = var34.field76;
                        var8 = var34.field77;
                        var6 = -1;
                        Statics.field405 = var35;
                        Statics.field394 = var36;
                        continue;
                    }
                    if (var413 == 42) {
                        field393[var4++] = client.field673[var8[var6]];
                        continue;
                    }
                    if (var413 == 43) {
                        var10001 = var8[var6];
                        var4--;
                        client.field673[var10001] = field393[var4];
                        continue;
                    }
                    if (var413 == 44) {
                        int var40 = var8[var6] >> 16;
                        int var41 = var8[var6] & 0xFFFF;
                        var4--;
                        int var42 = field393[var4];
                        if (var42 >= 0 && var42 <= 5000) {
                            field395[var40] = var42;
                            byte var43 = -1;
                            if (var41 == 105) {
                                var43 = 0;
                            }
                            int var44 = 0;
                            while (true) {
                                if (var44 >= var42) {
                                    continue label2534;
                                }
                                field396[var40][var44] = var43;
                                var44++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var413 == 45) {
                        int var45 = var8[var6];
                        var4--;
                        int var46 = field393[var4];
                        if (var46 >= 0 && var46 < field395[var45]) {
                            field393[var4++] = field396[var45][var46];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var413 == 46) {
                        int var47 = var8[var6];
                        var4 -= 2;
                        int var48 = field393[var4];
                        if (var48 >= 0 && var48 < field395[var47]) {
                            field396[var47][var48] = field393[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var413 == 47) {
                        String var49 = client.field682[var8[var6]];
                        if (var49 == null) {
                            var49 = "null";
                        }
                        field398[var5++] = var49;
                        continue;
                    }
                    if (var413 == 48) {
                        var10001 = var8[var6];
                        var5--;
                        client.field682[var10001] = field398[var5];
                        continue;
                    }
                }
                boolean var50;
                if (var8[var6] == 1) {
                    var50 = true;
                } else {
                    var50 = false;
                }
                if (var413 < 1000) {
                    if (var413 == 100) {
                        var4 -= 3;
                        int var51 = field393[var4];
                        int var52 = field393[var4 + 1];
                        int var53 = field393[var4 + 2];
                        if (var52 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var54 = class157.method2079(var51);
                        if (var54.field2664 == null) {
                            var54.field2664 = new class157[var53 + 1];
                        }
                        if (var54.field2664.length <= var53) {
                            class157[] var55 = new class157[var53 + 1];
                            for (int var56 = 0; var56 < var54.field2664.length; var56++) {
                                var55[var56] = var54.field2664[var56];
                            }
                            var54.field2664 = var55;
                        }
                        if (var53 > 0 && var54.field2664[var53 - 1] == null) {
                            throw new RuntimeException("" + (var53 - 1));
                        }
                        class157 var57 = new class157();
                        var57.field2581 = var52;
                        var57.field2600 = var57.field2579 = var54.field2579;
                        var57.field2580 = var53;
                        var57.field2639 = true;
                        var54.field2664[var53] = var57;
                        if (var50) {
                            Statics.field2053 = var57;
                        } else {
                            Statics.field401 = var57;
                        }
                        Statics.method1546(var54);
                        continue;
                    }
                    if (var413 == 101) {
                        class157 var58 = var50 ? Statics.field2053 : Statics.field401;
                        class157 var59 = class157.method2079(var58.field2579);
                        var59.field2664[var58.field2580] = null;
                        Statics.method1546(var59);
                        continue;
                    }
                    if (var413 == 102) {
                        var4--;
                        class157 var60 = class157.method2079(field393[var4]);
                        var60.field2664 = null;
                        Statics.method1546(var60);
                        continue;
                    }
                    if (var413 == 200) {
                        var4 -= 2;
                        int var61 = field393[var4];
                        int var62 = field393[var4 + 1];
                        class157 var63 = class157.method169(var61, var62);
                        if (var63 != null && var62 != -1) {
                            field393[var4++] = 1;
                            if (var50) {
                                Statics.field2053 = var63;
                            } else {
                                Statics.field401 = var63;
                            }
                            continue;
                        }
                        field393[var4++] = 0;
                        continue;
                    }
                } else if (!(var413 < 1000 || var413 >= 1100) || !(var413 < 2000 || var413 >= 2100)) {
                    class157 var64;
                    if (var413 >= 2000) {
                        var413 -= 1000;
                        var4--;
                        var64 = class157.method2079(field393[var4]);
                    } else {
                        var64 = var50 ? Statics.field2053 : Statics.field401;
                    }
                    if (var413 == 1000) {
                        var4 -= 2;
                        var64.field2584 = field393[var4];
                        var64.field2697 = field393[var4 + 1];
                        Statics.method1546(var64);
                        continue;
                    }
                    if (var413 == 1001) {
                        var4 -= 2;
                        var64.field2588 = field393[var4];
                        var64.field2589 = field393[var4 + 1];
                        Statics.method1546(var64);
                        continue;
                    }
                    if (var413 == 1003) {
                        var4--;
                        boolean var65 = field393[var4] == 1;
                        if (var64.field2577 != var65) {
                            var64.field2577 = var65;
                            Statics.method1546(var64);
                        }
                        continue;
                    }
                } else if (var413 >= 1100 && var413 < 1200 || var413 >= 2100 && var413 < 2200) {
                    class157 var66;
                    if (var413 >= 2000) {
                        var413 -= 1000;
                        var4--;
                        var66 = class157.method2079(field393[var4]);
                    } else {
                        var66 = var50 ? Statics.field2053 : Statics.field401;
                    }
                    if (var413 == 1100) {
                        var4 -= 2;
                        var66.field2592 = field393[var4];
                        if (var66.field2592 > var66.field2594 - var66.field2588) {
                            var66.field2592 = var66.field2594 - var66.field2588;
                        }
                        if (var66.field2592 < 0) {
                            var66.field2592 = 0;
                        }
                        var66.field2611 = field393[var4 + 1];
                        if (var66.field2611 > var66.field2595 - var66.field2589) {
                            var66.field2611 = var66.field2595 - var66.field2589;
                        }
                        if (var66.field2611 < 0) {
                            var66.field2611 = 0;
                        }
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1101) {
                        var4--;
                        var66.field2596 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1102) {
                        var4--;
                        var66.field2643 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1103) {
                        var4--;
                        var66.field2587 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1104) {
                        var4--;
                        var66.field2602 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1105) {
                        var4--;
                        var66.field2603 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1106) {
                        var4--;
                        var66.field2665 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1107) {
                        var4--;
                        var66.field2606 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1108) {
                        var66.field2663 = 1;
                        var4--;
                        var66.field2671 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1109) {
                        var4 -= 6;
                        var66.field2651 = field393[var4];
                        var66.field2618 = field393[var4 + 1];
                        var66.field2620 = field393[var4 + 2];
                        var66.field2585 = field393[var4 + 3];
                        var66.field2621 = field393[var4 + 4];
                        var66.field2622 = field393[var4 + 5];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1110) {
                        var4--;
                        int var67 = field393[var4];
                        if (var66.field2615 != var67) {
                            var66.field2615 = var67;
                            var66.field2685 = 0;
                            var66.field2686 = 0;
                            Statics.method1546(var66);
                        }
                        continue;
                    }
                    if (var413 == 1111) {
                        var4--;
                        var66.field2624 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1112) {
                        var5--;
                        String var68 = field398[var5];
                        if (!var68.equals(var66.field2673)) {
                            var66.field2673 = var68;
                            Statics.method1546(var66);
                        }
                        continue;
                    }
                    if (var413 == 1113) {
                        var4--;
                        var66.field2625 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1114) {
                        var4 -= 3;
                        var66.field2629 = field393[var4];
                        var66.field2630 = field393[var4 + 1];
                        var66.field2628 = field393[var4 + 2];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1115) {
                        var4--;
                        var66.field2631 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1116) {
                        var4--;
                        var66.field2607 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1117) {
                        var4--;
                        var66.field2608 = field393[var4];
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1118) {
                        var4--;
                        var66.field2674 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1119) {
                        var4--;
                        var66.field2610 = field393[var4] == 1;
                        Statics.method1546(var66);
                        continue;
                    }
                    if (var413 == 1120) {
                        var4 -= 2;
                        var66.field2594 = field393[var4];
                        var66.field2595 = field393[var4 + 1];
                        Statics.method1546(var66);
                        continue;
                    }
                } else if (var413 >= 1200 && var413 < 1300 || var413 >= 2200 && var413 < 2300) {
                    class157 var69;
                    if (var413 >= 2000) {
                        var413 -= 1000;
                        var4--;
                        var69 = class157.method2079(field393[var4]);
                    } else {
                        var69 = var50 ? Statics.field2053 : Statics.field401;
                    }
                    Statics.method1546(var69);
                    if (var413 == 1200) {
                        var4 -= 2;
                        int var70 = field393[var4];
                        int var71 = field393[var4 + 1];
                        var69.field2683 = var70;
                        var69.field2590 = var71;
                        class39 var72 = class39.method1244(var70);
                        var69.field2620 = var72.field990;
                        var69.field2585 = var72.field991;
                        var69.field2621 = var72.field983;
                        var69.field2651 = var72.field993;
                        var69.field2618 = var72.field994;
                        var69.field2622 = var72.field1002;
                        if (var69.field2588 > 0) {
                            var69.field2622 = var69.field2622 * 32 / var69.field2588;
                        }
                        continue;
                    }
                    if (var413 == 1201) {
                        var69.field2663 = 2;
                        var4--;
                        var69.field2671 = field393[var4];
                        continue;
                    }
                    if (var413 == 1202) {
                        var69.field2663 = 3;
                        var69.field2671 = Statics.field2035.field52.method3139();
                        continue;
                    }
                } else if (var413 >= 1300 && var413 < 1400 || var413 >= 2300 && var413 < 2400) {
                    class157 var73;
                    if (var413 >= 2000) {
                        var413 -= 1000;
                        var4--;
                        var73 = class157.method2079(field393[var4]);
                    } else {
                        var73 = var50 ? Statics.field2053 : Statics.field401;
                    }
                    if (var413 == 1300) {
                        var4--;
                        int var74 = field393[var4] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var5--;
                            var73.method3045(var74, field398[var5]);
                            continue;
                        }
                        var5--;
                        continue;
                    }
                    if (var413 == 1301) {
                        var4 -= 2;
                        int var75 = field393[var4];
                        int var76 = field393[var4 + 1];
                        var73.field2649 = class157.method169(var75, var76);
                        continue;
                    }
                    if (var413 == 1302) {
                        var4--;
                        var73.field2644 = field393[var4] == 1;
                        continue;
                    }
                    if (var413 == 1303) {
                        var4--;
                        var73.field2642 = field393[var4];
                        continue;
                    }
                    if (var413 == 1304) {
                        var4--;
                        var73.field2635 = field393[var4];
                        continue;
                    }
                    if (var413 == 1305) {
                        var5--;
                        var73.field2612 = field398[var5];
                        continue;
                    }
                    if (var413 == 1306) {
                        var5--;
                        var73.field2645 = field398[var5];
                        continue;
                    }
                    if (var413 == 1307) {
                        var73.field2640 = null;
                        continue;
                    }
                } else {
                    if (var413 >= 1400 && var413 < 1500 || var413 >= 2400 && var413 < 2500) {
                        class157 var77;
                        if (var413 >= 2000) {
                            var413 -= 1000;
                            var4--;
                            var77 = class157.method2079(field393[var4]);
                        } else {
                            var77 = var50 ? Statics.field2053 : Statics.field401;
                        }
                        var5--;
                        String var78 = field398[var5];
                        int[] var79 = null;
                        if (var78.length() > 0 && var78.charAt(var78.length() - 1) == 'Y') {
                            var4--;
                            int var80 = field393[var4];
                            if (var80 > 0) {
                                var79 = new int[var80];
                                while (var80-- > 0) {
                                    var4--;
                                    var79[var80] = field393[var4];
                                }
                            }
                            var78 = var78.substring(0, var78.length() - 1);
                        }
                        Object[] var81 = new Object[var78.length() + 1];
                        for (int var82 = var81.length - 1; var82 >= 1; var82--) {
                            if (var78.charAt(var82 - 1) == 's') {
                                var5--;
                                var81[var82] = field398[var5];
                            } else {
                                var4--;
                                var81[var82] = Integer.valueOf(field393[var4]);
                            }
                        }
                        var4--;
                        int var83 = field393[var4];
                        if (var83 == -1) {
                            var81 = null;
                        } else {
                            var81[0] = Integer.valueOf(var83);
                        }
                        if (var413 == 1400) {
                            var77.field2648 = var81;
                        }
                        if (var413 == 1401) {
                            var77.field2661 = var81;
                        }
                        if (var413 == 1402) {
                            var77.field2582 = var81;
                        }
                        if (var413 == 1403) {
                            var77.field2633 = var81;
                        }
                        if (var413 == 1404) {
                            var77.field2569 = var81;
                        }
                        if (var413 == 1405) {
                            var77.field2578 = var81;
                        }
                        if (var413 == 1406) {
                            var77.field2658 = var81;
                        }
                        if (var413 == 1407) {
                            var77.field2659 = var81;
                            var77.field2641 = var79;
                        }
                        if (var413 == 1408) {
                            var77.field2650 = var81;
                        }
                        if (var413 == 1409) {
                            var77.field2666 = var81;
                        }
                        if (var413 == 1410) {
                            var77.field2656 = var81;
                        }
                        if (var413 == 1411) {
                            var77.field2605 = var81;
                        }
                        if (var413 == 1412) {
                            var77.field2653 = var81;
                        }
                        if (var413 == 1414) {
                            var77.field2627 = var81;
                            var77.field2662 = var79;
                        }
                        if (var413 == 1415) {
                            var77.field2692 = var81;
                            var77.field2601 = var79;
                        }
                        if (var413 == 1416) {
                            var77.field2657 = var81;
                        }
                        if (var413 == 1417) {
                            var77.field2667 = var81;
                        }
                        if (var413 == 1418) {
                            var77.field2668 = var81;
                        }
                        if (var413 == 1419) {
                            var77.field2669 = var81;
                        }
                        if (var413 == 1420) {
                            var77.field2670 = var81;
                        }
                        if (var413 == 1421) {
                            var77.field2626 = var81;
                        }
                        if (var413 == 1422) {
                            var77.field2672 = var81;
                        }
                        if (var413 == 1423) {
                            var77.field2617 = var81;
                        }
                        if (var413 == 1424) {
                            var77.field2619 = var81;
                        }
                        var77.field2646 = true;
                        continue;
                    }
                    if (var413 < 1600) {
                        class157 var84 = var50 ? Statics.field2053 : Statics.field401;
                        if (var413 == 1500) {
                            field393[var4++] = var84.field2584;
                            continue;
                        }
                        if (var413 == 1501) {
                            field393[var4++] = var84.field2697;
                            continue;
                        }
                        if (var413 == 1502) {
                            field393[var4++] = var84.field2588;
                            continue;
                        }
                        if (var413 == 1503) {
                            field393[var4++] = var84.field2589;
                            continue;
                        }
                        if (var413 == 1504) {
                            field393[var4++] = var84.field2577 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 1505) {
                            field393[var4++] = var84.field2600;
                            continue;
                        }
                    } else if (var413 < 1700) {
                        class157 var85 = var50 ? Statics.field2053 : Statics.field401;
                        if (var413 == 1600) {
                            field393[var4++] = var85.field2592;
                            continue;
                        }
                        if (var413 == 1601) {
                            field393[var4++] = var85.field2611;
                            continue;
                        }
                        if (var413 == 1602) {
                            field398[var5++] = var85.field2673;
                            continue;
                        }
                        if (var413 == 1603) {
                            field393[var4++] = var85.field2594;
                            continue;
                        }
                        if (var413 == 1604) {
                            field393[var4++] = var85.field2595;
                            continue;
                        }
                        if (var413 == 1605) {
                            field393[var4++] = var85.field2622;
                            continue;
                        }
                        if (var413 == 1606) {
                            field393[var4++] = var85.field2620;
                            continue;
                        }
                        if (var413 == 1607) {
                            field393[var4++] = var85.field2621;
                            continue;
                        }
                        if (var413 == 1608) {
                            field393[var4++] = var85.field2585;
                            continue;
                        }
                    } else if (var413 < 1800) {
                        class157 var86 = var50 ? Statics.field2053 : Statics.field401;
                        if (var413 == 1700) {
                            field393[var4++] = var86.field2683;
                            continue;
                        }
                        if (var413 == 1701) {
                            if (var86.field2683 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var86.field2590;
                            }
                            continue;
                        }
                        if (var413 == 1702) {
                            field393[var4++] = var86.field2580;
                            continue;
                        }
                    } else if (var413 < 1900) {
                        class157 var87 = var50 ? Statics.field2053 : Statics.field401;
                        if (var413 == 1800) {
                            field393[var4++] = class161.method1989(client.method2167(var87));
                            continue;
                        }
                        if (var413 == 1801) {
                            var4--;
                            int var88 = field393[var4];
                            int var414 = var88 - 1;
                            if (var87.field2640 != null && var414 < var87.field2640.length && var87.field2640[var414] != null) {
                                field398[var5++] = var87.field2640[var414];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 1802) {
                            if (var87.field2612 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = var87.field2612;
                            }
                            continue;
                        }
                    } else if (var413 < 2600) {
                        var4--;
                        class157 var89 = class157.method2079(field393[var4]);
                        if (var413 == 2500) {
                            field393[var4++] = var89.field2584;
                            continue;
                        }
                        if (var413 == 2501) {
                            field393[var4++] = var89.field2697;
                            continue;
                        }
                        if (var413 == 2502) {
                            field393[var4++] = var89.field2588;
                            continue;
                        }
                        if (var413 == 2503) {
                            field393[var4++] = var89.field2589;
                            continue;
                        }
                        if (var413 == 2504) {
                            field393[var4++] = var89.field2577 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 2505) {
                            field393[var4++] = var89.field2600;
                            continue;
                        }
                    } else if (var413 < 2700) {
                        var4--;
                        class157 var90 = class157.method2079(field393[var4]);
                        if (var413 == 2600) {
                            field393[var4++] = var90.field2592;
                            continue;
                        }
                        if (var413 == 2601) {
                            field393[var4++] = var90.field2611;
                            continue;
                        }
                        if (var413 == 2602) {
                            field398[var5++] = var90.field2673;
                            continue;
                        }
                        if (var413 == 2603) {
                            field393[var4++] = var90.field2594;
                            continue;
                        }
                        if (var413 == 2604) {
                            field393[var4++] = var90.field2595;
                            continue;
                        }
                        if (var413 == 2605) {
                            field393[var4++] = var90.field2622;
                            continue;
                        }
                        if (var413 == 2606) {
                            field393[var4++] = var90.field2620;
                            continue;
                        }
                        if (var413 == 2607) {
                            field393[var4++] = var90.field2621;
                            continue;
                        }
                        if (var413 == 2608) {
                            field393[var4++] = var90.field2585;
                            continue;
                        }
                    } else if (var413 < 2800) {
                        if (var413 == 2700) {
                            var4--;
                            class157 var91 = class157.method2079(field393[var4]);
                            field393[var4++] = var91.field2683;
                            continue;
                        }
                        if (var413 == 2701) {
                            var4--;
                            class157 var92 = class157.method2079(field393[var4]);
                            if (var92.field2683 == -1) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var92.field2590;
                            }
                            continue;
                        }
                        if (var413 == 2702) {
                            var4--;
                            int var93 = field393[var4];
                            class4 var94 = (class4) client.field640.method3261((long) var93);
                            if (var94 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = 1;
                            }
                            continue;
                        }
                    } else if (var413 < 2900) {
                        var4--;
                        class157 var95 = class157.method2079(field393[var4]);
                        if (var413 == 2800) {
                            field393[var4++] = class161.method1989(client.method2167(var95));
                            continue;
                        }
                        if (var413 == 2801) {
                            var4--;
                            int var96 = field393[var4];
                            int var415 = var96 - 1;
                            if (var95.field2640 != null && var415 < var95.field2640.length && var95.field2640[var415] != null) {
                                field398[var5++] = var95.field2640[var415];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 2802) {
                            if (var95.field2612 == null) {
                                field398[var5++] = "";
                            } else {
                                field398[var5++] = var95.field2612;
                            }
                            continue;
                        }
                    } else if (var413 < 3200) {
                        if (var413 == 3100) {
                            var5--;
                            String var97 = field398[var5];
                            client.method1826(0, "", var97);
                            continue;
                        }
                        if (var413 == 3101) {
                            var4 -= 2;
                            client.method2781(Statics.field2035, field393[var4], field393[var4 + 1]);
                            continue;
                        }
                        if (var413 == 3103) {
                            client.field518.method2258(95);
                            for (class4 var98 = (class4) client.field640.method3277(); var98 != null; var98 = (class4) client.field640.method3265()) {
                                if (var98.field67 == 0 || var98.field67 == 3) {
                                    client.method45(var98, true);
                                }
                            }
                            if (client.field643 != null) {
                                Statics.method1546(client.field643);
                                client.field643 = null;
                            }
                            continue;
                        }
                        if (var413 == 3104) {
                            var5--;
                            String var99 = field398[var5];
                            int var100 = 0;
                            if (class146.method72(var99)) {
                                int var101 = class146.method2641(var99, 10, true);
                                var100 = var101;
                            }
                            client.field518.method2258(62);
                            client.field518.method2365(var100);
                            continue;
                        }
                        if (var413 == 3105) {
                            var5--;
                            String var102 = field398[var5];
                            client.field518.method2258(60);
                            client.field518.method2362(var102.length() + 1);
                            client.field518.method2366(var102);
                            continue;
                        }
                        if (var413 == 3106) {
                            var5--;
                            String var103 = field398[var5];
                            client.field518.method2258(20);
                            client.field518.method2362(var103.length() + 1);
                            client.field518.method2366(var103);
                            continue;
                        }
                        if (var413 == 3107) {
                            var4--;
                            int var104 = field393[var4];
                            var5--;
                            String var105 = field398[var5];
                            boolean var106 = false;
                            for (int var107 = 0; var107 < client.field600; var107++) {
                                class3 var108 = client.field599[client.field601[var107]];
                                if (var108 != null && var108.field57 != null && var108.field57.equalsIgnoreCase(var105)) {
                                    client.method2313(Statics.field2035.field462[0], Statics.field2035.field447[0], var108.field462[0], var108.field447[0], false, 0, 0, 1, 1, 0, 2);
                                    if (var104 == 1) {
                                        client.field518.method2258(221);
                                        client.field518.method2405(client.field601[var107]);
                                    } else if (var104 == 4) {
                                        client.field518.method2258(5);
                                        client.field518.method2363(client.field601[var107]);
                                    } else if (var104 == 6) {
                                        client.field518.method2258(133);
                                        client.field518.method2550(client.field601[var107]);
                                    } else if (var104 == 7) {
                                        client.field518.method2258(90);
                                        client.field518.method2405(client.field601[var107]);
                                    }
                                    var106 = true;
                                    break;
                                }
                            }
                            if (!var106) {
                                client.method1826(0, "", class133.field2230 + var105);
                            }
                            continue;
                        }
                        if (var413 == 3108) {
                            var4 -= 3;
                            int var109 = field393[var4];
                            int var110 = field393[var4 + 1];
                            int var111 = field393[var4 + 2];
                            class157 var112 = class157.method2079(var111);
                            if (client.field650 == null && !client.field473 && var112 != null) {
                                class157 var113 = client.method1354(var112);
                                if (var113 == null) {
                                    var113 = var112.field2649;
                                }
                                if (var113 != null) {
                                    client.field650 = var112;
                                    class157 var115 = client.method1354(var112);
                                    if (var115 == null) {
                                        var115 = var112.field2649;
                                    }
                                    client.field485 = var115;
                                    client.field688 = var109;
                                    client.field653 = var110;
                                    Statics.field1684 = 0;
                                    client.field661 = false;
                                }
                            }
                            continue;
                        }
                        if (var413 == 3109) {
                            var4 -= 2;
                            int var117 = field393[var4];
                            int var118 = field393[var4 + 1];
                            class157 var119 = var50 ? Statics.field2053 : Statics.field401;
                            if (client.field650 == null && !client.field473 && var119 != null) {
                                class157 var120 = client.method1354(var119);
                                if (var120 == null) {
                                    var120 = var119.field2649;
                                }
                                if (var120 != null) {
                                    client.field650 = var119;
                                    class157 var122 = client.method1354(var119);
                                    if (var122 == null) {
                                        var122 = var119.field2649;
                                    }
                                    client.field485 = var122;
                                    client.field688 = var117;
                                    client.field653 = var118;
                                    Statics.field1684 = 0;
                                    client.field661 = false;
                                }
                            }
                            continue;
                        }
                    } else if (var413 < 3300) {
                        if (var413 == 3200) {
                            var4 -= 3;
                            int var124 = field393[var4];
                            int var125 = field393[var4 + 1];
                            int var126 = field393[var4 + 2];
                            if (client.field717 != 0 && var125 != 0 && client.field549 < 50) {
                                client.field720[client.field549] = var124;
                                client.field721[client.field549] = var125;
                                client.field525[client.field549] = var126;
                                client.field724[client.field549] = null;
                                client.field723[client.field549] = 0;
                                client.field549++;
                            }
                            continue;
                        }
                        if (var413 == 3201) {
                            var4--;
                            Statics.method1333(field393[var4]);
                            continue;
                        }
                        if (var413 == 3202) {
                            var4 -= 2;
                            int var127 = field393[var4];
                            int var10000 = field393[var4 + 1];
                            if (client.field714 != 0 && var127 != -1) {
                                class137.method1378(Statics.field235, var127, 0, client.field714, false);
                                client.field716 = true;
                            }
                            continue;
                        }
                    } else if (var413 < 3400) {
                        if (var413 == 3300) {
                            field393[var4++] = client.field568;
                            continue;
                        }
                        if (var413 == 3301) {
                            var4 -= 2;
                            int var129 = field393[var4];
                            int var130 = field393[var4 + 1];
                            int[] var131 = field393;
                            int var132 = var4++;
                            class18 var133 = (class18) class18.field275.method3261((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field272.length) {
                                var134 = var133.field272[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var413 == 3302) {
                            var4 -= 2;
                            int var135 = field393[var4];
                            int var136 = field393[var4 + 1];
                            field393[var4++] = class18.method33(var135, var136);
                            continue;
                        }
                        if (var413 == 3303) {
                            var4 -= 2;
                            int var137 = field393[var4];
                            int var138 = field393[var4 + 1];
                            int[] var139 = field393;
                            int var140 = var4++;
                            class18 var141 = (class18) class18.field275.method3261((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = 0;
                            } else if (var138 == -1) {
                                var142 = 0;
                            } else {
                                int var143 = 0;
                                for (int var144 = 0; var144 < var141.field273.length; var144++) {
                                    if (var141.field272[var144] == var138) {
                                        var143 += var141.field273[var144];
                                    }
                                }
                                var142 = var143;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var413 == 3304) {
                            var4--;
                            int var145 = field393[var4];
                            int[] var146 = field393;
                            int var147 = var4++;
                            class40 var148 = (class40) class40.field1029.method3214((long) var145);
                            class40 var149;
                            if (var148 == null) {
                                byte[] var150 = Statics.field1024.method2973(5, var145);
                                class40 var151 = new class40();
                                if (var150 != null) {
                                    var151.method845(new class126(var150));
                                }
                                class40.field1029.method3223(var151, (long) var145);
                                var149 = var151;
                            } else {
                                var149 = var148;
                            }
                            var146[var147] = var149.field1028;
                            continue;
                        }
                        if (var413 == 3305) {
                            var4--;
                            int var152 = field393[var4];
                            field393[var4++] = client.field709[var152];
                            continue;
                        }
                        if (var413 == 3306) {
                            var4--;
                            int var153 = field393[var4];
                            field393[var4++] = client.field618[var153];
                            continue;
                        }
                        if (var413 == 3307) {
                            var4--;
                            int var154 = field393[var4];
                            field393[var4++] = client.field619[var154];
                            continue;
                        }
                        if (var413 == 3308) {
                            int var155 = Statics.field189;
                            int var156 = (Statics.field2035.field427 >> 7) + Statics.field1631;
                            int var157 = (Statics.field2035.field411 >> 7) + Statics.field456;
                            field393[var4++] = (var155 << 28) + (var156 << 14) + var157;
                            continue;
                        }
                        if (var413 == 3309) {
                            var4--;
                            int var158 = field393[var4];
                            field393[var4++] = var158 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var413 == 3310) {
                            var4--;
                            int var159 = field393[var4];
                            field393[var4++] = var159 >> 28;
                            continue;
                        }
                        if (var413 == 3311) {
                            var4--;
                            int var160 = field393[var4];
                            field393[var4++] = var160 & 0x3FFF;
                            continue;
                        }
                        if (var413 == 3312) {
                            field393[var4++] = client.field478 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 3313) {
                            var4 -= 2;
                            int var161 = field393[var4] + 32768;
                            int var162 = field393[var4 + 1];
                            int[] var163 = field393;
                            int var164 = var4++;
                            class18 var165 = (class18) class18.field275.method3261((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = -1;
                            } else if (var162 >= 0 && var162 < var165.field272.length) {
                                var166 = var165.field272[var162];
                            } else {
                                var166 = -1;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var413 == 3314) {
                            var4 -= 2;
                            int var167 = field393[var4] + 32768;
                            int var168 = field393[var4 + 1];
                            int[] var169 = field393;
                            int var170 = var4++;
                            class18 var171 = (class18) class18.field275.method3261((long) var167);
                            int var172;
                            if (var171 == null) {
                                var172 = 0;
                            } else if (var168 >= 0 && var168 < var171.field273.length) {
                                var172 = var171.field273[var168];
                            } else {
                                var172 = 0;
                            }
                            var169[var170] = var172;
                            continue;
                        }
                        if (var413 == 3315) {
                            var4 -= 2;
                            int var173 = field393[var4] + 32768;
                            int var174 = field393[var4 + 1];
                            int[] var175 = field393;
                            int var176 = var4++;
                            class18 var177 = (class18) class18.field275.method3261((long) var173);
                            int var178;
                            if (var177 == null) {
                                var178 = 0;
                            } else if (var174 == -1) {
                                var178 = 0;
                            } else {
                                int var179 = 0;
                                for (int var180 = 0; var180 < var177.field273.length; var180++) {
                                    if (var177.field272[var180] == var174) {
                                        var179 += var177.field273[var180];
                                    }
                                }
                                var178 = var179;
                            }
                            var175[var176] = var178;
                            continue;
                        }
                        if (var413 == 3316) {
                            if (client.field474 >= 2) {
                                field393[var4++] = client.field474;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                        if (var413 == 3317) {
                            field393[var4++] = client.field492;
                            continue;
                        }
                        if (var413 == 3318) {
                            field393[var4++] = client.field475;
                            continue;
                        }
                        if (var413 == 3321) {
                            field393[var4++] = client.field644;
                            continue;
                        }
                        if (var413 == 3322) {
                            field393[var4++] = client.field645;
                            continue;
                        }
                        if (var413 == 3323) {
                            if (client.field594) {
                                field393[var4++] = 1;
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var413 < 3500) {
                        if (var413 == 3400) {
                            var4 -= 2;
                            int var181 = field393[var4];
                            int var182 = field393[var4 + 1];
                            class38 var183 = (class38) class38.field960.method3214((long) var181);
                            class38 var184;
                            if (var183 == null) {
                                byte[] var185 = Statics.field967.method2973(8, var181);
                                class38 var186 = new class38();
                                if (var185 != null) {
                                    var186.method790(new class126(var185));
                                }
                                class38.field960.method3223(var186, (long) var181);
                                var184 = var186;
                            } else {
                                var184 = var183;
                            }
                            class38 var187 = var184;
                            if (var184.field959 != 's') {
                            }
                            for (int var188 = 0; var188 < var187.field964; var188++) {
                                if (var187.field966[var188] == var182) {
                                    field398[var5++] = var187.field968[var188];
                                    var187 = null;
                                    break;
                                }
                            }
                            if (var187 != null) {
                                field398[var5++] = var187.field963;
                            }
                            continue;
                        }
                        if (var413 == 3408) {
                            var4 -= 4;
                            int var189 = field393[var4];
                            int var190 = field393[var4 + 1];
                            int var191 = field393[var4 + 2];
                            int var192 = field393[var4 + 3];
                            class38 var193 = (class38) class38.field960.method3214((long) var191);
                            class38 var194;
                            if (var193 == null) {
                                byte[] var195 = Statics.field967.method2973(8, var191);
                                class38 var196 = new class38();
                                if (var195 != null) {
                                    var196.method790(new class126(var195));
                                }
                                class38.field960.method3223(var196, (long) var191);
                                var194 = var196;
                            } else {
                                var194 = var193;
                            }
                            class38 var197 = var194;
                            if (var194.field961 == var189 && var194.field959 == var190) {
                                for (int var198 = 0; var198 < var197.field964; var198++) {
                                    if (var197.field966[var198] == var192) {
                                        if (var190 == 115) {
                                            field398[var5++] = var197.field968[var198];
                                        } else {
                                            field393[var4++] = var197.field962[var198];
                                        }
                                        var197 = null;
                                        break;
                                    }
                                }
                                if (var197 != null) {
                                    if (var190 == 115) {
                                        field398[var5++] = var197.field963;
                                    } else {
                                        field393[var4++] = var197.field972;
                                    }
                                }
                                continue;
                            }
                            if (var190 == 115) {
                                field398[var5++] = "null";
                            } else {
                                field393[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var413 < 3700) {
                        if (var413 == 3600) {
                            if (client.field732 == 0) {
                                field393[var4++] = -2;
                            } else if (client.field732 == 1) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field731;
                            }
                            continue;
                        }
                        if (var413 == 3601) {
                            var4--;
                            int var199 = field393[var4];
                            if (client.field732 == 2 && var199 < client.field731) {
                                field398[var5++] = client.field542[var199].field357;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 3602) {
                            var4--;
                            int var200 = field393[var4];
                            if (client.field732 == 2 && var200 < client.field731) {
                                field393[var4++] = client.field542[var200].field365;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var413 == 3603) {
                            var4--;
                            int var201 = field393[var4];
                            if (client.field732 == 2 && var201 < client.field731) {
                                field393[var4++] = client.field542[var201].field358;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var413 == 3604) {
                            var5--;
                            String var202 = field398[var5];
                            var4--;
                            int var203 = field393[var4];
                            client.field518.method2258(182);
                            client.field518.method2362(class126.method5(var202) + 1);
                            client.field518.method2397(var203);
                            client.field518.method2366(var202);
                            continue;
                        }
                        if (var413 == 3605) {
                            var5--;
                            String var204 = field398[var5];
                            if (var204 == null) {
                                continue;
                            }
                            if ((client.field731 < 200 || client.field491 == 1) && client.field731 < 200) {
                                String var205 = class147.method2661(var204, Statics.field1836);
                                if (var205 == null) {
                                    continue;
                                }
                                for (int var206 = 0; var206 < client.field731; var206++) {
                                    class22 var207 = client.field542[var206];
                                    String var208 = class147.method2661(var207.field357, Statics.field1836);
                                    if (var208 != null && var208.equals(var205)) {
                                        client.method1826(0, "", var204 + class133.field2248);
                                        continue label2534;
                                    }
                                    if (var207.field356 != null) {
                                        String var209 = class147.method2661(var207.field356, Statics.field1836);
                                        if (var209 != null && var209.equals(var205)) {
                                            client.method1826(0, "", var204 + class133.field2248);
                                            continue label2534;
                                        }
                                    }
                                }
                                for (int var210 = 0; var210 < client.field735; var210++) {
                                    class11 var211 = client.field736[var210];
                                    String var212 = class147.method2661(var211.field195, Statics.field1836);
                                    if (var212 != null && var212.equals(var205)) {
                                        client.method1826(0, "", class133.field2253 + var204 + class133.field2254);
                                        continue label2534;
                                    }
                                    if (var211.field190 != null) {
                                        String var213 = class147.method2661(var211.field190, Statics.field1836);
                                        if (var213 != null && var213.equals(var205)) {
                                            client.method1826(0, "", class133.field2253 + var204 + class133.field2254);
                                            continue label2534;
                                        }
                                    }
                                }
                                if (class147.method2661(Statics.field2035.field57, Statics.field1836).equals(var205)) {
                                    client.method1826(0, "", class133.field2105);
                                } else {
                                    client.field518.method2258(189);
                                    client.field518.method2362(class126.method5(var204));
                                    client.field518.method2366(var204);
                                }
                                continue;
                            }
                            client.method1826(0, "", class133.field2094);
                            continue;
                        }
                        if (var413 == 3606) {
                            var5--;
                            String var214 = field398[var5];
                            if (var214 == null) {
                                continue;
                            }
                            String var215 = class147.method2661(var214, Statics.field1836);
                            if (var215 == null) {
                                continue;
                            }
                            int var216 = 0;
                            while (true) {
                                if (var216 >= client.field731) {
                                    continue label2534;
                                }
                                class22 var217 = client.field542[var216];
                                String var218 = var217.field357;
                                String var219 = class147.method2661(var218, Statics.field1836);
                                if (class135.method2317(var214, var215, var218, var219)) {
                                    client.field731--;
                                    for (int var220 = var216; var220 < client.field731; var220++) {
                                        client.field542[var220] = client.field542[var220 + 1];
                                    }
                                    client.field588 = client.field729;
                                    client.field518.method2258(10);
                                    client.field518.method2362(class126.method5(var214));
                                    client.field518.method2366(var214);
                                    continue label2534;
                                }
                                var216++;
                            }
                        }
                        if (var413 == 3607) {
                            var5--;
                            String var221 = field398[var5];
                            if (var221 == null) {
                                continue;
                            }
                            if (client.field735 >= 100) {
                                client.method1826(0, "", class133.field2249);
                                continue;
                            }
                            String var222 = class147.method2661(var221, Statics.field1836);
                            if (var222 == null) {
                                continue;
                            }
                            for (int var223 = 0; var223 < client.field735; var223++) {
                                class11 var224 = client.field736[var223];
                                String var225 = class147.method2661(var224.field195, Statics.field1836);
                                if (var225 != null && var225.equals(var222)) {
                                    client.method1826(0, "", var221 + class133.field2250);
                                    continue label2534;
                                }
                                if (var224.field190 != null) {
                                    String var226 = class147.method2661(var224.field190, Statics.field1836);
                                    if (var226 != null && var226.equals(var222)) {
                                        client.method1826(0, "", var221 + class133.field2250);
                                        continue label2534;
                                    }
                                }
                            }
                            for (int var227 = 0; var227 < client.field731; var227++) {
                                class22 var228 = client.field542[var227];
                                String var229 = class147.method2661(var228.field357, Statics.field1836);
                                if (var229 != null && var229.equals(var222)) {
                                    client.method1826(0, "", class133.field2255 + var221 + class133.field2256);
                                    continue label2534;
                                }
                                if (var228.field356 != null) {
                                    String var230 = class147.method2661(var228.field356, Statics.field1836);
                                    if (var230 != null && var230.equals(var222)) {
                                        client.method1826(0, "", class133.field2255 + var221 + class133.field2256);
                                        continue label2534;
                                    }
                                }
                            }
                            if (class147.method2661(Statics.field2035.field57, Statics.field1836).equals(var222)) {
                                client.method1826(0, "", class133.field2093);
                            } else {
                                client.field518.method2258(227);
                                client.field518.method2362(class126.method5(var221));
                                client.field518.method2366(var221);
                            }
                            continue;
                        }
                        if (var413 == 3608) {
                            var5--;
                            String var231 = field398[var5];
                            if (var231 == null) {
                                continue;
                            }
                            String var232 = class147.method2661(var231, Statics.field1836);
                            if (var232 == null) {
                                continue;
                            }
                            int var233 = 0;
                            while (true) {
                                if (var233 >= client.field735) {
                                    continue label2534;
                                }
                                class11 var234 = client.field736[var233];
                                String var235 = var234.field195;
                                String var236 = class147.method2661(var235, Statics.field1836);
                                if (class135.method2317(var231, var232, var235, var236)) {
                                    client.field735--;
                                    for (int var237 = var233; var237 < client.field735; var237++) {
                                        client.field736[var237] = client.field736[var237 + 1];
                                    }
                                    client.field588 = client.field729;
                                    client.field518.method2258(89);
                                    class115 var238 = client.field518;
                                    int var239 = var231.length() + 1;
                                    var238.method2362(var239);
                                    client.field518.method2366(var231);
                                    continue label2534;
                                }
                                var233++;
                            }
                        }
                        if (var413 == 3609) {
                            var5--;
                            String var240 = field398[var5];
                            if (var240.startsWith(class2.method13(0)) || var240.startsWith(class2.method13(1))) {
                                var240 = var240.substring(7);
                            }
                            field393[var4++] = client.method2620(var240) ? 1 : 0;
                            continue;
                        }
                        if (var413 == 3611) {
                            if (client.field704 == null) {
                                field398[var5++] = "";
                                continue;
                            }
                            String[] var241 = field398;
                            int var242 = var5++;
                            String var243 = client.field704;
                            long var244 = 0L;
                            int var246 = var243.length();
                            for (int var247 = 0; var247 < var246; var247++) {
                                var244 *= 37L;
                                char var248 = var243.charAt(var247);
                                if (var248 >= 'A' && var248 <= 'Z') {
                                    var244 += (long) (var248 + 1 - 65);
                                } else if (var248 >= 'a' && var248 <= 'z') {
                                    var244 += (long) (var248 + 1 - 97);
                                } else if (var248 >= '0' && var248 <= '9') {
                                    var244 += (long) (var248 + 27 - 48);
                                }
                                if (var244 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var244 % 37L == 0L && var244 != 0L) {
                                var244 /= 37L;
                            }
                            String var251 = class145.method2248(var244);
                            if (var251 == null) {
                                var251 = "";
                            }
                            var241[var242] = var251;
                            continue;
                        }
                        if (var413 == 3612) {
                            if (client.field704 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = Statics.field276;
                            }
                            continue;
                        }
                        if (var413 == 3613) {
                            var4--;
                            int var253 = field393[var4];
                            if (client.field704 != null && var253 < Statics.field276) {
                                field398[var5++] = Statics.field66[var253].field123;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 3614) {
                            var4--;
                            int var254 = field393[var4];
                            if (client.field704 != null && var254 < Statics.field276) {
                                field393[var4++] = Statics.field66[var254].field124;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var413 == 3615) {
                            var4--;
                            int var255 = field393[var4];
                            if (client.field704 != null && var255 < Statics.field276) {
                                field393[var4++] = Statics.field66[var255].field122;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var413 == 3616) {
                            field393[var4++] = Statics.field468;
                            continue;
                        }
                        if (var413 == 3617) {
                            var5--;
                            String var256 = field398[var5];
                            if (Statics.field66 != null) {
                                client.field518.method2258(157);
                                class115 var257 = client.field518;
                                int var258 = var256.length() + 1;
                                var257.method2362(var258);
                                client.field518.method2366(var256);
                            }
                            continue;
                        }
                        if (var413 == 3618) {
                            field393[var4++] = Statics.field369;
                            continue;
                        }
                        if (var413 == 3619) {
                            var5--;
                            String var259 = field398[var5];
                            client.method2176(var259);
                            continue;
                        }
                        if (var413 == 3620) {
                            client.field518.method2258(145);
                            client.field518.method2362(0);
                            continue;
                        }
                        if (var413 == 3621) {
                            if (client.field732 == 0) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = client.field735;
                            }
                            continue;
                        }
                        if (var413 == 3622) {
                            var4--;
                            int var260 = field393[var4];
                            if (client.field732 != 0 && var260 < client.field735) {
                                field398[var5++] = client.field736[var260].field195;
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 3623) {
                            var5--;
                            String var261 = field398[var5];
                            if (var261.startsWith(class2.method13(0)) || var261.startsWith(class2.method13(1))) {
                                var261 = var261.substring(7);
                            }
                            field393[var4++] = client.method71(var261) ? 1 : 0;
                            continue;
                        }
                        if (var413 == 3624) {
                            var4--;
                            int var262 = field393[var4];
                            if (Statics.field66 != null && var262 < Statics.field276 && Statics.field66[var262].field123.equalsIgnoreCase(Statics.field2035.field57)) {
                                field393[var4++] = 1;
                                continue;
                            }
                            field393[var4++] = 0;
                            continue;
                        }
                        if (var413 == 3625) {
                            if (client.field684 == null) {
                                field398[var5++] = "";
                                continue;
                            }
                            String[] var263 = field398;
                            int var264 = var5++;
                            String var265 = client.field684;
                            long var266 = 0L;
                            int var268 = var265.length();
                            for (int var269 = 0; var269 < var268; var269++) {
                                var266 *= 37L;
                                char var270 = var265.charAt(var269);
                                if (var270 >= 'A' && var270 <= 'Z') {
                                    var266 += (long) (var270 + 1 - 65);
                                } else if (var270 >= 'a' && var270 <= 'z') {
                                    var266 += (long) (var270 + 1 - 97);
                                } else if (var270 >= '0' && var270 <= '9') {
                                    var266 += (long) (var270 + 27 - 48);
                                }
                                if (var266 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var266 % 37L == 0L && var266 != 0L) {
                                var266 /= 37L;
                            }
                            String var273 = class145.method2248(var266);
                            if (var273 == null) {
                                var273 = "";
                            }
                            var263[var264] = var273;
                            continue;
                        }
                    } else if (var413 < 4100) {
                        if (var413 == 4000) {
                            var4 -= 2;
                            int var275 = field393[var4];
                            int var276 = field393[var4 + 1];
                            field393[var4++] = var275 + var276;
                            continue;
                        }
                        if (var413 == 4001) {
                            var4 -= 2;
                            int var277 = field393[var4];
                            int var278 = field393[var4 + 1];
                            field393[var4++] = var277 - var278;
                            continue;
                        }
                        if (var413 == 4002) {
                            var4 -= 2;
                            int var279 = field393[var4];
                            int var280 = field393[var4 + 1];
                            field393[var4++] = var279 * var280;
                            continue;
                        }
                        if (var413 == 4003) {
                            var4 -= 2;
                            int var281 = field393[var4];
                            int var282 = field393[var4 + 1];
                            field393[var4++] = var281 / var282;
                            continue;
                        }
                        if (var413 == 4004) {
                            var4--;
                            int var283 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) var283);
                            continue;
                        }
                        if (var413 == 4005) {
                            var4--;
                            int var284 = field393[var4];
                            field393[var4++] = (int) (Math.random() * (double) (var284 + 1));
                            continue;
                        }
                        if (var413 == 4006) {
                            var4 -= 5;
                            int var285 = field393[var4];
                            int var286 = field393[var4 + 1];
                            int var287 = field393[var4 + 2];
                            int var288 = field393[var4 + 3];
                            int var289 = field393[var4 + 4];
                            field393[var4++] = (var286 - var285) * (var289 - var287) / (var288 - var287) + var285;
                            continue;
                        }
                        if (var413 == 4007) {
                            var4 -= 2;
                            int var290 = field393[var4];
                            int var291 = field393[var4 + 1];
                            field393[var4++] = var290 * var291 / 100 + var290;
                            continue;
                        }
                        if (var413 == 4008) {
                            var4 -= 2;
                            int var292 = field393[var4];
                            int var293 = field393[var4 + 1];
                            field393[var4++] = var292 | 0x1 << var293;
                            continue;
                        }
                        if (var413 == 4009) {
                            var4 -= 2;
                            int var294 = field393[var4];
                            int var295 = field393[var4 + 1];
                            field393[var4++] = var294 & -1 - (0x1 << var295);
                            continue;
                        }
                        if (var413 == 4010) {
                            var4 -= 2;
                            int var296 = field393[var4];
                            int var297 = field393[var4 + 1];
                            field393[var4++] = (var296 & 0x1 << var297) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var413 == 4011) {
                            var4 -= 2;
                            int var298 = field393[var4];
                            int var299 = field393[var4 + 1];
                            field393[var4++] = var298 % var299;
                            continue;
                        }
                        if (var413 == 4012) {
                            var4 -= 2;
                            int var300 = field393[var4];
                            int var301 = field393[var4 + 1];
                            if (var300 == 0) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var300, (double) var301);
                            }
                            continue;
                        }
                        if (var413 == 4013) {
                            var4 -= 2;
                            int var302 = field393[var4];
                            int var303 = field393[var4 + 1];
                            if (var302 == 0) {
                                field393[var4++] = 0;
                            } else if (var303 == 0) {
                                field393[var4++] = Integer.MAX_VALUE;
                            } else {
                                field393[var4++] = (int) Math.pow((double) var302, 1.0D / (double) var303);
                            }
                            continue;
                        }
                        if (var413 == 4014) {
                            var4 -= 2;
                            int var304 = field393[var4];
                            int var305 = field393[var4 + 1];
                            field393[var4++] = var304 & var305;
                            continue;
                        }
                        if (var413 == 4015) {
                            var4 -= 2;
                            int var306 = field393[var4];
                            int var307 = field393[var4 + 1];
                            field393[var4++] = var306 | var307;
                            continue;
                        }
                    } else if (var413 < 4200) {
                        if (var413 == 4100) {
                            var5--;
                            String var308 = field398[var5];
                            var4--;
                            int var309 = field393[var4];
                            field398[var5++] = var308 + var309;
                            continue;
                        }
                        if (var413 == 4101) {
                            var5 -= 2;
                            String var310 = field398[var5];
                            String var311 = field398[var5 + 1];
                            field398[var5++] = var310 + var311;
                            continue;
                        }
                        if (var413 == 4102) {
                            var5--;
                            String var312 = field398[var5];
                            var4--;
                            int var313 = field393[var4];
                            field398[var5++] = var312 + class146.method1360(var313, true);
                            continue;
                        }
                        if (var413 == 4103) {
                            var5--;
                            String var314 = field398[var5];
                            field398[var5++] = var314.toLowerCase();
                            continue;
                        }
                        if (var413 == 4104) {
                            var4--;
                            int var315 = field393[var4];
                            long var316 = ((long) var315 + 11745L) * 86400000L;
                            field402.setTime(new Date(var316));
                            int var318 = field402.get(5);
                            int var319 = field402.get(2);
                            int var320 = field402.get(1);
                            field398[var5++] = var318 + "-" + field403[var319] + "-" + var320;
                            continue;
                        }
                        if (var413 == 4105) {
                            var5 -= 2;
                            String var321 = field398[var5];
                            String var322 = field398[var5 + 1];
                            if (Statics.field2035.field52 != null && Statics.field2035.field52.field2715) {
                                field398[var5++] = var322;
                                continue;
                            }
                            field398[var5++] = var321;
                            continue;
                        }
                        if (var413 == 4106) {
                            var4--;
                            int var323 = field393[var4];
                            field398[var5++] = Integer.toString(var323);
                            continue;
                        }
                        if (var413 == 4107) {
                            var5 -= 2;
                            int[] var324 = field393;
                            int var325 = var4++;
                            int var326 = class149.method134(field398[var5], field398[var5 + 1], client.field559);
                            byte var327;
                            if (var326 > 0) {
                                var327 = 1;
                            } else if (var326 < 0) {
                                var327 = -1;
                            } else {
                                var327 = 0;
                            }
                            var324[var325] = var327;
                            continue;
                        }
                        if (var413 == 4108) {
                            var5--;
                            String var328 = field398[var5];
                            var4 -= 2;
                            int var329 = field393[var4];
                            int var330 = field393[var4 + 1];
                            byte[] var331 = Statics.field314.method2973(var330, 0);
                            class182 var332 = new class182(var331);
                            field393[var4++] = var332.method3360(var328, var329);
                            continue;
                        }
                        if (var413 == 4109) {
                            var5--;
                            String var333 = field398[var5];
                            var4 -= 2;
                            int var334 = field393[var4];
                            int var335 = field393[var4 + 1];
                            byte[] var336 = Statics.field314.method2973(var335, 0);
                            class182 var337 = new class182(var336);
                            field393[var4++] = var337.method3372(var333, var334);
                            continue;
                        }
                        if (var413 == 4110) {
                            var5 -= 2;
                            String var338 = field398[var5];
                            String var339 = field398[var5 + 1];
                            var4--;
                            if (field393[var4] == 1) {
                                field398[var5++] = var338;
                            } else {
                                field398[var5++] = var339;
                            }
                            continue;
                        }
                        if (var413 == 4111) {
                            var5--;
                            String var340 = field398[var5];
                            field398[var5++] = class184.method3378(var340);
                            continue;
                        }
                        if (var413 == 4112) {
                            var5--;
                            String var341 = field398[var5];
                            var4--;
                            int var342 = field393[var4];
                            field398[var5++] = var341 + (char) var342;
                            continue;
                        }
                        if (var413 == 4113) {
                            var4--;
                            int var343 = field393[var4];
                            field393[var4++] = class146.method1603((char) var343) ? 1 : 0;
                            continue;
                        }
                        if (var413 == 4114) {
                            var4--;
                            int var344 = field393[var4];
                            int[] var345 = field393;
                            int var346 = var4++;
                            char var347 = (char) var344;
                            boolean var348 = var347 >= '0' && var347 <= '9' || var347 >= 'A' && var347 <= 'Z' || var347 >= 'a' && var347 <= 'z';
                            var345[var346] = var348 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 4115) {
                            var4--;
                            int var349 = field393[var4];
                            int[] var350 = field393;
                            int var351 = var4++;
                            char var352 = (char) var349;
                            boolean var353 = var352 >= 'A' && var352 <= 'Z' || var352 >= 'a' && var352 <= 'z';
                            var350[var351] = var353 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 4116) {
                            var4--;
                            int var354 = field393[var4];
                            field393[var4++] = class146.method2154((char) var354) ? 1 : 0;
                            continue;
                        }
                        if (var413 == 4117) {
                            var5--;
                            String var355 = field398[var5];
                            if (var355 == null) {
                                field393[var4++] = 0;
                            } else {
                                field393[var4++] = var355.length();
                            }
                            continue;
                        }
                        if (var413 == 4118) {
                            var5--;
                            String var356 = field398[var5];
                            var4 -= 2;
                            int var357 = field393[var4];
                            int var358 = field393[var4 + 1];
                            field398[var5++] = var356.substring(var357, var358);
                            continue;
                        }
                        if (var413 == 4119) {
                            var5--;
                            String var359 = field398[var5];
                            StringBuilder var360 = new StringBuilder(var359.length());
                            boolean var361 = false;
                            for (int var362 = 0; var362 < var359.length(); var362++) {
                                char var363 = var359.charAt(var362);
                                if (var363 == '<') {
                                    var361 = true;
                                } else if (var363 == '>') {
                                    var361 = false;
                                } else if (!var361) {
                                    var360.append(var363);
                                }
                            }
                            field398[var5++] = var360.toString();
                            continue;
                        }
                        if (var413 == 4120) {
                            var5--;
                            String var364 = field398[var5];
                            var4--;
                            int var365 = field393[var4];
                            field393[var4++] = var364.indexOf(var365);
                            continue;
                        }
                    } else if (var413 < 4300) {
                        if (var413 == 4200) {
                            var4--;
                            int var366 = field393[var4];
                            field398[var5++] = class39.method1244(var366).field984;
                            continue;
                        }
                        if (var413 == 4201) {
                            var4 -= 2;
                            int var367 = field393[var4];
                            int var368 = field393[var4 + 1];
                            class39 var369 = class39.method1244(var367);
                            if (var368 >= 1 && var368 <= 5 && var369.field998[var368 - 1] != null) {
                                field398[var5++] = var369.field998[var368 - 1];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 4202) {
                            var4 -= 2;
                            int var370 = field393[var4];
                            int var371 = field393[var4 + 1];
                            class39 var372 = class39.method1244(var370);
                            if (var371 >= 1 && var371 <= 5 && var372.field992[var371 - 1] != null) {
                                field398[var5++] = var372.field992[var371 - 1];
                                continue;
                            }
                            field398[var5++] = "";
                            continue;
                        }
                        if (var413 == 4203) {
                            var4--;
                            int var373 = field393[var4];
                            field393[var4++] = class39.method1244(var373).field999;
                            continue;
                        }
                        if (var413 == 4204) {
                            var4--;
                            int var374 = field393[var4];
                            field393[var4++] = class39.method1244(var374).field995 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var413 == 4205) {
                            var4--;
                            int var375 = field393[var4];
                            class39 var376 = class39.method1244(var375);
                            if (var376.field996 == -1 && var376.field1014 >= 0) {
                                field393[var4++] = var376.field1014;
                                continue;
                            }
                            field393[var4++] = var375;
                            continue;
                        }
                        if (var413 == 4206) {
                            var4--;
                            int var377 = field393[var4];
                            class39 var378 = class39.method1244(var377);
                            if (var378.field996 >= 0 && var378.field1014 >= 0) {
                                field393[var4++] = var378.field1014;
                                continue;
                            }
                            field393[var4++] = var377;
                            continue;
                        }
                        if (var413 == 4207) {
                            var4--;
                            int var379 = field393[var4];
                            field393[var4++] = class39.method1244(var379).field997 ? 1 : 0;
                            continue;
                        }
                    } else if (var413 < 5100) {
                        if (var413 == 5000) {
                            field393[var4++] = client.field696;
                            continue;
                        }
                        if (var413 == 5001) {
                            var4 -= 3;
                            client.field696 = field393[var4];
                            Statics.field406 = class136.method173(field393[var4 + 1]);
                            if (Statics.field406 == null) {
                                Statics.field406 = class136.field2343;
                            }
                            client.field697 = field393[var4 + 2];
                            client.field518.method2258(248);
                            client.field518.method2362(client.field696);
                            client.field518.method2362(Statics.field406.field2340);
                            client.field518.method2362(client.field697);
                            continue;
                        }
                        if (var413 == 5002) {
                            var5--;
                            String var380 = field398[var5];
                            var4 -= 2;
                            int var381 = field393[var4];
                            int var382 = field393[var4 + 1];
                            client.field518.method2258(241);
                            class115 var383 = client.field518;
                            int var384 = var380.length() + 1;
                            var383.method2362(var384 + 2);
                            client.field518.method2366(var380);
                            client.field518.method2362(var381 - 1);
                            client.field518.method2362(var382);
                            continue;
                        }
                        if (var413 == 5003) {
                            var4--;
                            int var385 = field393[var4];
                            String var386 = null;
                            if (var385 < 100) {
                                var386 = client.field693[var385];
                            }
                            if (var386 == null) {
                                var386 = "";
                            }
                            field398[var5++] = var386;
                            continue;
                        }
                        if (var413 == 5004) {
                            var4--;
                            int var387 = field393[var4];
                            int var388 = -1;
                            if (var387 < 100 && client.field693[var387] != null) {
                                var388 = client.field690[var387];
                            }
                            field393[var4++] = var388;
                            continue;
                        }
                        if (var413 == 5005) {
                            if (Statics.field406 == null) {
                                field393[var4++] = -1;
                            } else {
                                field393[var4++] = Statics.field406.field2340;
                            }
                            continue;
                        }
                        if (var413 == 5008) {
                            var5--;
                            String var389 = field398[var5];
                            if (var389.startsWith("::")) {
                                client.method2157(var389);
                            } else {
                                String var390 = var389.toLowerCase();
                                byte var391 = 0;
                                if (var390.startsWith(class133.field2257)) {
                                    var391 = 0;
                                    var389 = var389.substring(class133.field2257.length());
                                } else if (var390.startsWith(class133.field2259)) {
                                    var391 = 1;
                                    var389 = var389.substring(class133.field2259.length());
                                } else if (var390.startsWith(class133.field2261)) {
                                    var391 = 2;
                                    var389 = var389.substring(class133.field2261.length());
                                } else if (var390.startsWith(class133.field2263)) {
                                    var391 = 3;
                                    var389 = var389.substring(class133.field2263.length());
                                } else if (var390.startsWith(class133.field2219)) {
                                    var391 = 4;
                                    var389 = var389.substring(class133.field2219.length());
                                } else if (var390.startsWith(class133.field2267)) {
                                    var391 = 5;
                                    var389 = var389.substring(class133.field2267.length());
                                } else if (var390.startsWith(class133.field2109)) {
                                    var391 = 6;
                                    var389 = var389.substring(class133.field2109.length());
                                } else if (var390.startsWith(class133.field2271)) {
                                    var391 = 7;
                                    var389 = var389.substring(class133.field2271.length());
                                } else if (var390.startsWith(class133.field2273)) {
                                    var391 = 8;
                                    var389 = var389.substring(class133.field2273.length());
                                } else if (var390.startsWith(class133.field2217)) {
                                    var391 = 9;
                                    var389 = var389.substring(class133.field2217.length());
                                } else if (var390.startsWith(class133.field2277)) {
                                    var391 = 10;
                                    var389 = var389.substring(class133.field2277.length());
                                } else if (var390.startsWith(class133.field2266)) {
                                    var391 = 11;
                                    var389 = var389.substring(class133.field2266.length());
                                } else if (client.field559 != 0) {
                                    if (var390.startsWith(class133.field2215)) {
                                        var391 = 0;
                                        var389 = var389.substring(class133.field2215.length());
                                    } else if (var390.startsWith(class133.field2193)) {
                                        var391 = 1;
                                        var389 = var389.substring(class133.field2193.length());
                                    } else if (var390.startsWith(class133.field2262)) {
                                        var391 = 2;
                                        var389 = var389.substring(class133.field2262.length());
                                    } else if (var390.startsWith(class133.field2265)) {
                                        var391 = 3;
                                        var389 = var389.substring(class133.field2265.length());
                                    } else if (var390.startsWith(class133.field2185)) {
                                        var391 = 4;
                                        var389 = var389.substring(class133.field2185.length());
                                    } else if (var390.startsWith(class133.field2208)) {
                                        var391 = 5;
                                        var389 = var389.substring(class133.field2208.length());
                                    } else if (var390.startsWith(class133.field2126)) {
                                        var391 = 6;
                                        var389 = var389.substring(class133.field2126.length());
                                    } else if (var390.startsWith(class133.field2272)) {
                                        var391 = 7;
                                        var389 = var389.substring(class133.field2272.length());
                                    } else if (var390.startsWith(class133.field2274)) {
                                        var391 = 8;
                                        var389 = var389.substring(class133.field2274.length());
                                    } else if (var390.startsWith(class133.field2276)) {
                                        var391 = 9;
                                        var389 = var389.substring(class133.field2276.length());
                                    } else if (var390.startsWith(class133.field2278)) {
                                        var391 = 10;
                                        var389 = var389.substring(class133.field2278.length());
                                    } else if (var390.startsWith(class133.field2280)) {
                                        var391 = 11;
                                        var389 = var389.substring(class133.field2280.length());
                                    }
                                }
                                String var392 = var389.toLowerCase();
                                byte var393 = 0;
                                if (var392.startsWith(class133.field2134)) {
                                    var393 = 1;
                                    var389 = var389.substring(class133.field2134.length());
                                } else if (var392.startsWith(class133.field2138)) {
                                    var393 = 2;
                                    var389 = var389.substring(class133.field2138.length());
                                } else if (var392.startsWith(class133.field2285)) {
                                    var393 = 3;
                                    var389 = var389.substring(class133.field2285.length());
                                } else if (var392.startsWith(class133.field2287)) {
                                    var393 = 4;
                                    var389 = var389.substring(class133.field2287.length());
                                } else if (var392.startsWith(class133.field2289)) {
                                    var393 = 5;
                                    var389 = var389.substring(class133.field2289.length());
                                } else if (client.field559 != 0) {
                                    if (var392.startsWith(class133.field2282)) {
                                        var393 = 1;
                                        var389 = var389.substring(class133.field2282.length());
                                    } else if (var392.startsWith(class133.field2284)) {
                                        var393 = 2;
                                        var389 = var389.substring(class133.field2284.length());
                                    } else if (var392.startsWith(class133.field2286)) {
                                        var393 = 3;
                                        var389 = var389.substring(class133.field2286.length());
                                    } else if (var392.startsWith(class133.field2288)) {
                                        var393 = 4;
                                        var389 = var389.substring(class133.field2288.length());
                                    } else if (var392.startsWith(class133.field2290)) {
                                        var393 = 5;
                                        var389 = var389.substring(class133.field2290.length());
                                    }
                                }
                                client.field518.method2258(72);
                                client.field518.method2362(0);
                                int var394 = client.field518.field2043;
                                client.field518.method2362(var391);
                                client.field518.method2362(var393);
                                class115 var395 = client.field518;
                                int var396 = var395.field2043;
                                byte[] var397 = Statics.method244(var389);
                                var395.method2373(var397.length);
                                var395.field2043 += Statics.field2825.method2307(var397, 0, var397.length, var395.field2047, var395.field2043);
                                client.field518.method2470(client.field518.field2043 - var394);
                            }
                            continue;
                        }
                        if (var413 == 5009) {
                            var5 -= 2;
                            String var398 = field398[var5];
                            String var399 = field398[var5 + 1];
                            client.field518.method2258(50);
                            client.field518.method2363(0);
                            int var400 = client.field518.field2043;
                            client.field518.method2366(var398);
                            class115 var401 = client.field518;
                            int var402 = var401.field2043;
                            byte[] var403 = Statics.method244(var399);
                            var401.method2373(var403.length);
                            var401.field2043 += Statics.field2825.method2307(var403, 0, var403.length, var401.field2047, var401.field2043);
                            client.field518.method2371(client.field518.field2043 - var400);
                            continue;
                        }
                        if (var413 == 5010) {
                            var4--;
                            int var404 = field393[var4];
                            String var405 = null;
                            if (var404 < 100) {
                                var405 = client.field497[var404];
                            }
                            if (var405 == null) {
                                var405 = "";
                            }
                            field398[var5++] = var405;
                            continue;
                        }
                        if (var413 == 5011) {
                            var4--;
                            int var406 = field393[var4];
                            String var407 = null;
                            if (var406 < 100) {
                                var407 = client.field719[var406];
                            }
                            if (var407 == null) {
                                var407 = "";
                            }
                            field398[var5++] = var407;
                            continue;
                        }
                        if (var413 == 5015) {
                            String var408;
                            if (Statics.field2035 == null || Statics.field2035.field57 == null) {
                                var408 = "";
                            } else {
                                var408 = Statics.field2035.field57;
                            }
                            field398[var5++] = var408;
                            continue;
                        }
                        if (var413 == 5016) {
                            field393[var4++] = client.field697;
                            continue;
                        }
                        if (var413 == 5017) {
                            field393[var4++] = client.field694;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var412) {
            StringBuilder var410 = new StringBuilder(30);
            var410.append("").append(var3.field2809).append(" ");
            for (int var411 = field399 - 1; var411 >= 0; var411--) {
                var410.append("").append(field400[var411].field261.field2809).append(" ");
            }
            var410.append("").append(var9);
            class79.method720(var410.toString(), var412);
        }
    }

    @ObfuscatedName("bp.j(II)V")
    public static void method1332(int arg0) {
        if (arg0 == -1 || !class157.method2314(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2687[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2647 != null) {
                class1 var4 = new class1();
                var4.field2 = var3;
                var4.field8 = var3.field2647;
                method754(var4);
            }
        }
    }
}
