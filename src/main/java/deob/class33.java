package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aj")
public class class33 {

    @ObfuscatedName("aj.l")
    public static int[] field720 = new int[5];

    @ObfuscatedName("aj.g")
    public static int[][] field719 = new int[5][5000];

    @ObfuscatedName("aj.k")
    public static int[] field721 = new int[1000];

    @ObfuscatedName("aj.p")
    public static String[] field722 = new String[1000];

    @ObfuscatedName("aj.y")
    public static int field723 = 0;

    @ObfuscatedName("aj.m")
    public static class13[] field724 = new class13[50];

    @ObfuscatedName("aj.r")
    public static Calendar field725 = Calendar.getInstance();

    @ObfuscatedName("aj.s")
    public static final String[] field729 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.v(Lv;I)V")
    public static void method16(class1 arg0) {
        method537(arg0, 200000);
    }

    @ObfuscatedName("ad.t(Lv;II)V")
    public static void method537(class1 arg0, int arg1) {
        Object[] var2 = arg0.field9;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method608(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field530;
        int[] var9 = var4.field531;
        byte var10 = -1;
        field723 = 0;
        try {
            Statics.field717 = new int[var4.field533];
            int var11 = 0;
            Statics.field718 = new String[var4.field534];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2635;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field2;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2552;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2635;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2552;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field4;
                    }
                    Statics.field717[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field718[var12++] = var15;
                }
            }
            int var16 = 0;
            label2702: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var441 = var8[var7];
                if (var441 < 100) {
                    if (var441 == 0) {
                        field721[var5++] = var9[var7];
                        continue;
                    }
                    if (var441 == 1) {
                        int var17 = var9[var7];
                        field721[var5++] = class159.field2680[var17];
                        continue;
                    }
                    if (var441 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class159.field2680[var18] = field721[var5];
                        client.method2767(var18);
                        continue;
                    }
                    if (var441 == 3) {
                        field722[var6++] = var4.field529[var7];
                        continue;
                    }
                    if (var441 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var441 == 7) {
                        var5 -= 2;
                        if (field721[var5 + 1] != field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 8) {
                        var5 -= 2;
                        if (field721[var5 + 1] == field721[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 9) {
                        var5 -= 2;
                        if (field721[var5] < field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 10) {
                        var5 -= 2;
                        if (field721[var5] > field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 21) {
                        if (field723 == 0) {
                            return;
                        }
                        class13 var19 = field724[--field723];
                        var4 = var19.field194;
                        var8 = var4.field530;
                        var9 = var4.field531;
                        var7 = var19.field184;
                        Statics.field717 = var19.field185;
                        Statics.field718 = var19.field187;
                        continue;
                    }
                    if (var441 == 25) {
                        int var20 = var9[var7];
                        field721[var5++] = class159.method127(var20);
                        continue;
                    }
                    if (var441 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field721[var5];
                        class43 var23 = (class43) class43.field978.method3231((long) var21);
                        class43 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field984.method2852(14, var21);
                            class43 var26 = new class43();
                            if (var25 != null) {
                                var26.method822(new class110(var25));
                            }
                            class43.field978.method3228(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field979;
                        int var29 = var24.field981;
                        int var30 = var24.field983;
                        int var31 = class159.field2679[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class159.field2680[var28] = class159.field2680[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var441 == 31) {
                        var5 -= 2;
                        if (field721[var5] <= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 32) {
                        var5 -= 2;
                        if (field721[var5] >= field721[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var441 == 33) {
                        field721[var5++] = Statics.field717[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var441 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field717[var10001] = field721[var5];
                        continue;
                    }
                    if (var441 == 35) {
                        field722[var6++] = Statics.field718[var9[var7]];
                        continue;
                    }
                    if (var441 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field718[var10001] = field722[var6];
                        continue;
                    }
                    if (var441 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class213.method2089(field722, var6, var33);
                        field722[var6++] = var34;
                        continue;
                    }
                    if (var441 == 38) {
                        var5--;
                        continue;
                    }
                    if (var441 == 39) {
                        var6--;
                        continue;
                    }
                    if (var441 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method608(var35);
                        int[] var37 = new int[var36.field533];
                        String[] var38 = new String[var36.field534];
                        for (int var39 = 0; var39 < var36.field535; var39++) {
                            var37[var39] = field721[var5 - var36.field535 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field532; var40++) {
                            var38[var40] = field722[var6 - var36.field532 + var40];
                        }
                        var5 -= var36.field535;
                        var6 -= var36.field532;
                        class13 var41 = new class13();
                        var41.field194 = var4;
                        var41.field184 = var7;
                        var41.field185 = Statics.field717;
                        var41.field187 = Statics.field718;
                        field724[++field723 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field530;
                        var9 = var36.field531;
                        var7 = -1;
                        Statics.field717 = var37;
                        Statics.field718 = var38;
                        continue;
                    }
                    if (var441 == 42) {
                        field721[var5++] = client.field446[var9[var7]];
                        continue;
                    }
                    if (var441 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field446[var10001] = field721[var5];
                        continue;
                    }
                    if (var441 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field721[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field720[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2702;
                                }
                                field719[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var441 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field721[var5];
                        if (var48 >= 0 && var48 < field720[var47]) {
                            field721[var5++] = field719[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var441 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field721[var5];
                        if (var50 >= 0 && var50 < field720[var49]) {
                            field719[var49][var50] = field721[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var441 == 47) {
                        String var51 = client.field499[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field722[var6++] = var51;
                        continue;
                    }
                    if (var441 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field499[var10001] = field722[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var441 < 1000) {
                    if (var441 == 100) {
                        var5 -= 3;
                        int var53 = field721[var5];
                        int var54 = field721[var5 + 1];
                        int var55 = field721[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var56 = class157.method151(var53);
                        if (var56.field2662 == null) {
                            var56.field2662 = new class157[var55 + 1];
                        }
                        if (var56.field2662.length <= var55) {
                            class157[] var57 = new class157[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2662.length; var58++) {
                                var57[var58] = var56.field2662[var58];
                            }
                            var56.field2662 = var57;
                        }
                        if (var55 > 0 && var56.field2662[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class157 var59 = new class157();
                        var59.field2553 = var54;
                        var59.field2615 = var59.field2635 = var56.field2635;
                        var59.field2552 = var55;
                        var59.field2550 = true;
                        var56.field2662[var55] = var59;
                        if (var52) {
                            Statics.field192 = var59;
                        } else {
                            Statics.field2009 = var59;
                        }
                        client.method1031(var56);
                        continue;
                    }
                    if (var441 == 101) {
                        class157 var60 = var52 ? Statics.field192 : Statics.field2009;
                        class157 var61 = class157.method151(var60.field2635);
                        var61.field2662[var60.field2552] = null;
                        client.method1031(var61);
                        continue;
                    }
                    if (var441 == 102) {
                        var5--;
                        class157 var62 = class157.method151(field721[var5]);
                        var62.field2662 = null;
                        client.method1031(var62);
                        continue;
                    }
                    if (var441 == 200) {
                        var5 -= 2;
                        int var63 = field721[var5];
                        int var64 = field721[var5 + 1];
                        class157 var65 = class157.method155(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field721[var5++] = 1;
                            if (var52) {
                                Statics.field192 = var65;
                            } else {
                                Statics.field2009 = var65;
                            }
                            continue;
                        }
                        field721[var5++] = 0;
                        continue;
                    }
                } else if (!(var441 < 1000 || var441 >= 1100) || !(var441 < 2000 || var441 >= 2100)) {
                    class157 var66;
                    if (var441 >= 2000) {
                        var441 -= 1000;
                        var5--;
                        var66 = class157.method151(field721[var5]);
                    } else {
                        var66 = var52 ? Statics.field192 : Statics.field2009;
                    }
                    if (var441 == 1000) {
                        var5 -= 2;
                        var66.field2556 = field721[var5];
                        var66.field2557 = field721[var5 + 1];
                        client.method1031(var66);
                        continue;
                    }
                    if (var441 == 1001) {
                        var5 -= 2;
                        var66.field2560 = field721[var5];
                        var66.field2561 = field721[var5 + 1];
                        client.method1031(var66);
                        continue;
                    }
                    if (var441 == 1003) {
                        var5--;
                        boolean var67 = field721[var5] == 1;
                        if (var66.field2563 != var67) {
                            var66.field2563 = var67;
                            client.method1031(var66);
                        }
                        continue;
                    }
                } else if (var441 >= 1100 && var441 < 1200 || var441 >= 2100 && var441 < 2200) {
                    class157 var68;
                    if (var441 >= 2000) {
                        var441 -= 1000;
                        var5--;
                        var68 = class157.method151(field721[var5]);
                    } else {
                        var68 = var52 ? Statics.field192 : Statics.field2009;
                    }
                    if (var441 == 1100) {
                        var5 -= 2;
                        var68.field2564 = field721[var5];
                        if (var68.field2564 > var68.field2566 - var68.field2560) {
                            var68.field2564 = var68.field2566 - var68.field2560;
                        }
                        if (var68.field2564 < 0) {
                            var68.field2564 = 0;
                        }
                        var68.field2627 = field721[var5 + 1];
                        if (var68.field2627 > var68.field2638 - var68.field2561) {
                            var68.field2627 = var68.field2638 - var68.field2561;
                        }
                        if (var68.field2627 < 0) {
                            var68.field2627 = 0;
                        }
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1101) {
                        var5--;
                        var68.field2568 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1102) {
                        var5--;
                        var68.field2572 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1103) {
                        var5--;
                        var68.field2609 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1104) {
                        var5--;
                        var68.field2574 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1105) {
                        var5--;
                        var68.field2575 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1106) {
                        var5--;
                        var68.field2577 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1107) {
                        var5--;
                        var68.field2599 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1108) {
                        var68.field2583 = 1;
                        var5--;
                        var68.field2584 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1109) {
                        var5 -= 6;
                        var68.field2589 = field721[var5];
                        var68.field2579 = field721[var5 + 1];
                        var68.field2591 = field721[var5 + 2];
                        var68.field2590 = field721[var5 + 3];
                        var68.field2593 = field721[var5 + 4];
                        var68.field2652 = field721[var5 + 5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1110) {
                        var5--;
                        int var69 = field721[var5];
                        if (var68.field2587 != var69) {
                            var68.field2587 = var69;
                            var68.field2545 = 0;
                            var68.field2661 = 0;
                            client.method1031(var68);
                        }
                        continue;
                    }
                    if (var441 == 1111) {
                        var5--;
                        var68.field2596 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1112) {
                        var6--;
                        String var70 = field722[var6];
                        if (!var70.equals(var68.field2582)) {
                            var68.field2582 = var70;
                            client.method1031(var68);
                        }
                        continue;
                    }
                    if (var441 == 1113) {
                        var5--;
                        var68.field2598 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1114) {
                        var5 -= 3;
                        var68.field2602 = field721[var5];
                        var68.field2547 = field721[var5 + 1];
                        var68.field2601 = field721[var5 + 2];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1115) {
                        var5--;
                        var68.field2604 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1116) {
                        var5--;
                        var68.field2558 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1117) {
                        var5--;
                        var68.field2592 = field721[var5];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1118) {
                        var5--;
                        var68.field2581 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1119) {
                        var5--;
                        var68.field2567 = field721[var5] == 1;
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1120) {
                        var5 -= 2;
                        var68.field2566 = field721[var5];
                        var68.field2638 = field721[var5 + 1];
                        client.method1031(var68);
                        continue;
                    }
                    if (var441 == 1121) {
                        client.method906(var68.field2635, var68.field2552);
                        client.field401 = var68;
                        client.method1031(var68);
                        continue;
                    }
                } else if (var441 >= 1200 && var441 < 1300 || var441 >= 2200 && var441 < 2300) {
                    class157 var71;
                    if (var441 >= 2000) {
                        var441 -= 1000;
                        var5--;
                        var71 = class157.method151(field721[var5]);
                    } else {
                        var71 = var52 ? Statics.field192 : Statics.field2009;
                    }
                    client.method1031(var71);
                    if (var441 == 1200 || var441 == 1205 || var441 == 1212) {
                        var5 -= 2;
                        int var72 = field721[var5];
                        int var73 = field721[var5 + 1];
                        var71.field2594 = var72;
                        var71.field2659 = var73;
                        class46 var74 = class46.method712(var72);
                        var71.field2591 = var74.field1028;
                        var71.field2590 = var74.field1021;
                        var71.field2593 = var74.field1019;
                        var71.field2589 = var74.field1023;
                        var71.field2579 = var74.field1052;
                        var71.field2652 = var74.field1048;
                        if (var441 == 1205) {
                            var71.field2597 = 0;
                        } else if (var441 == 1212 | var74.field1025 == 1) {
                            var71.field2597 = 1;
                        } else {
                            var71.field2597 = 2;
                        }
                        if (var71.field2560 > 0) {
                            var71.field2652 = var71.field2652 * 32 / var71.field2560;
                        }
                        continue;
                    }
                    if (var441 == 1201) {
                        var71.field2583 = 2;
                        var5--;
                        var71.field2584 = field721[var5];
                        continue;
                    }
                    if (var441 == 1202) {
                        var71.field2583 = 3;
                        var71.field2584 = Statics.field1508.field39.method2999();
                        continue;
                    }
                } else if (var441 >= 1300 && var441 < 1400 || var441 >= 2300 && var441 < 2400) {
                    class157 var75;
                    if (var441 >= 2000) {
                        var441 -= 1000;
                        var5--;
                        var75 = class157.method151(field721[var5]);
                    } else {
                        var75 = var52 ? Statics.field192 : Statics.field2009;
                    }
                    if (var441 == 1300) {
                        var5--;
                        int var76 = field721[var5] - 1;
                        if (var76 >= 0 && var76 <= 9) {
                            var6--;
                            var75.method2929(var76, field722[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var441 == 1301) {
                        var5 -= 2;
                        int var77 = field721[var5];
                        int var78 = field721[var5 + 1];
                        var75.field2670 = class157.method155(var77, var78);
                        continue;
                    }
                    if (var441 == 1302) {
                        var5--;
                        var75.field2617 = field721[var5] == 1;
                        continue;
                    }
                    if (var441 == 1303) {
                        var5--;
                        var75.field2632 = field721[var5];
                        continue;
                    }
                    if (var441 == 1304) {
                        var5--;
                        var75.field2603 = field721[var5];
                        continue;
                    }
                    if (var441 == 1305) {
                        var6--;
                        var75.field2612 = field722[var6];
                        continue;
                    }
                    if (var441 == 1306) {
                        var6--;
                        var75.field2618 = field722[var6];
                        continue;
                    }
                    if (var441 == 1307) {
                        var75.field2542 = null;
                        continue;
                    }
                } else {
                    if (var441 >= 1400 && var441 < 1500 || var441 >= 2400 && var441 < 2500) {
                        class157 var79;
                        if (var441 >= 2000) {
                            var441 -= 1000;
                            var5--;
                            var79 = class157.method151(field721[var5]);
                        } else {
                            var79 = var52 ? Statics.field192 : Statics.field2009;
                        }
                        var6--;
                        String var80 = field722[var6];
                        int[] var81 = null;
                        if (var80.length() > 0 && var80.charAt(var80.length() - 1) == 'Y') {
                            var5--;
                            int var82 = field721[var5];
                            if (var82 > 0) {
                                var81 = new int[var82];
                                while (var82-- > 0) {
                                    var5--;
                                    var81[var82] = field721[var5];
                                }
                            }
                            var80 = var80.substring(0, var80.length() - 1);
                        }
                        Object[] var83 = new Object[var80.length() + 1];
                        for (int var84 = var83.length - 1; var84 >= 1; var84--) {
                            if (var80.charAt(var84 - 1) == 's') {
                                var6--;
                                var83[var84] = field722[var6];
                            } else {
                                var5--;
                                var83[var84] = Integer.valueOf(field721[var5]);
                            }
                        }
                        var5--;
                        int var85 = field721[var5];
                        if (var85 == -1) {
                            var83 = null;
                        } else {
                            var83[0] = Integer.valueOf(var85);
                        }
                        if (var441 == 1400) {
                            var79.field2621 = var83;
                        }
                        if (var441 == 1401) {
                            var79.field2655 = var83;
                        }
                        if (var441 == 1402) {
                            var79.field2619 = var83;
                        }
                        if (var441 == 1403) {
                            var79.field2625 = var83;
                        }
                        if (var441 == 1404) {
                            var79.field2551 = var83;
                        }
                        if (var441 == 1405) {
                            var79.field2628 = var83;
                        }
                        if (var441 == 1406) {
                            var79.field2631 = var83;
                        }
                        if (var441 == 1407) {
                            var79.field2664 = var83;
                            var79.field2633 = var81;
                        }
                        if (var441 == 1408) {
                            var79.field2614 = var83;
                        }
                        if (var441 == 1409) {
                            var79.field2639 = var83;
                        }
                        if (var441 == 1410) {
                            var79.field2629 = var83;
                        }
                        if (var441 == 1411) {
                            var79.field2622 = var83;
                        }
                        if (var441 == 1412) {
                            var79.field2626 = var83;
                        }
                        if (var441 == 1414) {
                            var79.field2634 = var83;
                            var79.field2565 = var81;
                        }
                        if (var441 == 1415) {
                            var79.field2636 = var83;
                            var79.field2637 = var81;
                        }
                        if (var441 == 1416) {
                            var79.field2630 = var83;
                        }
                        if (var441 == 1417) {
                            var79.field2562 = var83;
                        }
                        if (var441 == 1418) {
                            var79.field2641 = var83;
                        }
                        if (var441 == 1419) {
                            var79.field2642 = var83;
                        }
                        if (var441 == 1420) {
                            var79.field2643 = var83;
                        }
                        if (var441 == 1421) {
                            var79.field2644 = var83;
                        }
                        if (var441 == 1422) {
                            var79.field2645 = var83;
                        }
                        if (var441 == 1423) {
                            var79.field2600 = var83;
                        }
                        if (var441 == 1424) {
                            var79.field2647 = var83;
                        }
                        if (var441 == 1425) {
                            var79.field2648 = var83;
                        }
                        if (var441 == 1426) {
                            var79.field2649 = var83;
                        }
                        var79.field2544 = true;
                        continue;
                    }
                    if (var441 < 1600) {
                        class157 var86 = var52 ? Statics.field192 : Statics.field2009;
                        if (var441 == 1500) {
                            field721[var5++] = var86.field2556;
                            continue;
                        }
                        if (var441 == 1501) {
                            field721[var5++] = var86.field2557;
                            continue;
                        }
                        if (var441 == 1502) {
                            field721[var5++] = var86.field2560;
                            continue;
                        }
                        if (var441 == 1503) {
                            field721[var5++] = var86.field2561;
                            continue;
                        }
                        if (var441 == 1504) {
                            field721[var5++] = var86.field2563 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 1505) {
                            field721[var5++] = var86.field2615;
                            continue;
                        }
                    } else if (var441 < 1700) {
                        class157 var87 = var52 ? Statics.field192 : Statics.field2009;
                        if (var441 == 1600) {
                            field721[var5++] = var87.field2564;
                            continue;
                        }
                        if (var441 == 1601) {
                            field721[var5++] = var87.field2627;
                            continue;
                        }
                        if (var441 == 1602) {
                            field722[var6++] = var87.field2582;
                            continue;
                        }
                        if (var441 == 1603) {
                            field721[var5++] = var87.field2566;
                            continue;
                        }
                        if (var441 == 1604) {
                            field721[var5++] = var87.field2638;
                            continue;
                        }
                        if (var441 == 1605) {
                            field721[var5++] = var87.field2652;
                            continue;
                        }
                        if (var441 == 1606) {
                            field721[var5++] = var87.field2591;
                            continue;
                        }
                        if (var441 == 1607) {
                            field721[var5++] = var87.field2593;
                            continue;
                        }
                        if (var441 == 1608) {
                            field721[var5++] = var87.field2590;
                            continue;
                        }
                    } else if (var441 < 1800) {
                        class157 var88 = var52 ? Statics.field192 : Statics.field2009;
                        if (var441 == 1700) {
                            field721[var5++] = var88.field2594;
                            continue;
                        }
                        if (var441 == 1701) {
                            if (var88.field2594 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var88.field2659;
                            }
                            continue;
                        }
                        if (var441 == 1702) {
                            field721[var5++] = var88.field2552;
                            continue;
                        }
                    } else if (var441 < 1900) {
                        class157 var89 = var52 ? Statics.field192 : Statics.field2009;
                        if (var441 == 1800) {
                            field721[var5++] = class161.method2(Statics.method1003(var89));
                            continue;
                        }
                        if (var441 == 1801) {
                            var5--;
                            int var90 = field721[var5];
                            int var442 = var90 - 1;
                            if (var89.field2542 != null && var442 < var89.field2542.length && var89.field2542[var442] != null) {
                                field722[var6++] = var89.field2542[var442];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 1802) {
                            if (var89.field2612 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var89.field2612;
                            }
                            continue;
                        }
                    } else if (var441 < 2600) {
                        var5--;
                        class157 var91 = class157.method151(field721[var5]);
                        if (var441 == 2500) {
                            field721[var5++] = var91.field2556;
                            continue;
                        }
                        if (var441 == 2501) {
                            field721[var5++] = var91.field2557;
                            continue;
                        }
                        if (var441 == 2502) {
                            field721[var5++] = var91.field2560;
                            continue;
                        }
                        if (var441 == 2503) {
                            field721[var5++] = var91.field2561;
                            continue;
                        }
                        if (var441 == 2504) {
                            field721[var5++] = var91.field2563 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 2505) {
                            field721[var5++] = var91.field2615;
                            continue;
                        }
                    } else if (var441 < 2700) {
                        var5--;
                        class157 var92 = class157.method151(field721[var5]);
                        if (var441 == 2600) {
                            field721[var5++] = var92.field2564;
                            continue;
                        }
                        if (var441 == 2601) {
                            field721[var5++] = var92.field2627;
                            continue;
                        }
                        if (var441 == 2602) {
                            field722[var6++] = var92.field2582;
                            continue;
                        }
                        if (var441 == 2603) {
                            field721[var5++] = var92.field2566;
                            continue;
                        }
                        if (var441 == 2604) {
                            field721[var5++] = var92.field2638;
                            continue;
                        }
                        if (var441 == 2605) {
                            field721[var5++] = var92.field2652;
                            continue;
                        }
                        if (var441 == 2606) {
                            field721[var5++] = var92.field2591;
                            continue;
                        }
                        if (var441 == 2607) {
                            field721[var5++] = var92.field2593;
                            continue;
                        }
                        if (var441 == 2608) {
                            field721[var5++] = var92.field2590;
                            continue;
                        }
                    } else if (var441 < 2800) {
                        if (var441 == 2700) {
                            var5--;
                            class157 var93 = class157.method151(field721[var5]);
                            field721[var5++] = var93.field2594;
                            continue;
                        }
                        if (var441 == 2701) {
                            var5--;
                            class157 var94 = class157.method151(field721[var5]);
                            if (var94.field2594 == -1) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var94.field2659;
                            }
                            continue;
                        }
                        if (var441 == 2702) {
                            var5--;
                            int var95 = field721[var5];
                            class4 var96 = (class4) client.field431.method3274((long) var95);
                            if (var96 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var441 < 2900) {
                        var5--;
                        class157 var97 = class157.method151(field721[var5]);
                        if (var441 == 2800) {
                            field721[var5++] = class161.method2(Statics.method1003(var97));
                            continue;
                        }
                        if (var441 == 2801) {
                            var5--;
                            int var98 = field721[var5];
                            int var443 = var98 - 1;
                            if (var97.field2542 != null && var443 < var97.field2542.length && var97.field2542[var443] != null) {
                                field722[var6++] = var97.field2542[var443];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 2802) {
                            if (var97.field2612 == null) {
                                field722[var6++] = "";
                            } else {
                                field722[var6++] = var97.field2612;
                            }
                            continue;
                        }
                    } else if (var441 < 3200) {
                        if (var441 == 3100) {
                            var6--;
                            String var99 = field722[var6];
                            class10.method591(0, "", var99);
                            continue;
                        }
                        if (var441 == 3101) {
                            var5 -= 2;
                            client.method152(Statics.field1508, field721[var5], field721[var5 + 1]);
                            continue;
                        }
                        if (var441 == 3103) {
                            client.field289.method2414(48);
                            for (class4 var100 = (class4) client.field431.method3269(); var100 != null; var100 = (class4) client.field431.method3270()) {
                                if (var100.field57 == 0 || var100.field57 == 3) {
                                    client.method2539(var100, true);
                                }
                            }
                            if (client.field401 != null) {
                                client.method1031(client.field401);
                                client.field401 = null;
                            }
                            continue;
                        }
                        if (var441 == 3104) {
                            var6--;
                            String var101 = field722[var6];
                            int var102 = 0;
                            if (class213.method3577(var101)) {
                                int var103 = class213.method897(var101, 10, true);
                                var102 = var103;
                            }
                            client.field289.method2414(29);
                            client.field289.method2260(var102);
                            continue;
                        }
                        if (var441 == 3105) {
                            var6--;
                            String var104 = field722[var6];
                            client.field289.method2414(203);
                            client.field289.method2263(var104.length() + 1);
                            client.field289.method2152(var104);
                            continue;
                        }
                        if (var441 == 3106) {
                            var6--;
                            String var105 = field722[var6];
                            client.field289.method2414(244);
                            client.field289.method2263(var105.length() + 1);
                            client.field289.method2152(var105);
                            continue;
                        }
                        if (var441 == 3107) {
                            var5--;
                            int var106 = field721[var5];
                            var6--;
                            String var107 = field722[var6];
                            boolean var108 = false;
                            for (int var109 = 0; var109 < client.field368; var109++) {
                                class3 var110 = client.field367[client.field337[var109]];
                                if (var110 != null && var110.field40 != null && var110.field40.equalsIgnoreCase(var107)) {
                                    if (var106 == 1) {
                                        client.field289.method2414(74);
                                        client.field289.method2191(client.field337[var109]);
                                        client.field289.method2294(0);
                                    } else if (var106 == 4) {
                                        client.field289.method2414(253);
                                        client.field289.method2190(client.field337[var109]);
                                        client.field289.method2263(0);
                                    } else if (var106 == 6) {
                                        client.field289.method2414(230);
                                        client.field289.method2190(client.field337[var109]);
                                        client.field289.method2182(0);
                                    } else if (var106 == 7) {
                                        client.field289.method2414(180);
                                        client.field289.method2191(client.field337[var109]);
                                        client.field289.method2294(0);
                                    }
                                    var108 = true;
                                    break;
                                }
                            }
                            if (!var108) {
                                class10.method591(4, "", class147.field2395 + var107);
                            }
                            continue;
                        }
                        if (var441 == 3108) {
                            var5 -= 3;
                            int var111 = field721[var5];
                            int var112 = field721[var5 + 1];
                            int var113 = field721[var5 + 2];
                            class157 var114 = class157.method151(var113);
                            client.method2438(var114, var111, var112);
                            continue;
                        }
                        if (var441 == 3109) {
                            var5 -= 2;
                            int var115 = field721[var5];
                            int var116 = field721[var5 + 1];
                            class157 var117 = var52 ? Statics.field192 : Statics.field2009;
                            client.method2438(var117, var115, var116);
                            continue;
                        }
                        if (var441 == 3110) {
                            var5--;
                            Statics.field927 = field721[var5] == 1;
                            continue;
                        }
                        if (var441 == 3111) {
                            field721[var5++] = Statics.field152.field144 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3112) {
                            var5--;
                            Statics.field152.field144 = field721[var5] == 1;
                            class9.method1794();
                            continue;
                        }
                        if (var441 == 3113) {
                            var6--;
                            String var118 = field722[var6];
                            var5--;
                            boolean var119 = field721[var5] == 1;
                            class129.method3427(var118, var119, false);
                            continue;
                        }
                        if (var441 == 3115) {
                            var5--;
                            int var120 = field721[var5];
                            client.field289.method2414(174);
                            client.field289.method2148(var120);
                            continue;
                        }
                    } else if (var441 < 3300) {
                        if (var441 == 3200) {
                            var5 -= 3;
                            int var121 = field721[var5];
                            int var122 = field721[var5 + 1];
                            int var123 = field721[var5 + 2];
                            if (client.field299 != 0 && var122 != 0 && client.field488 < 50) {
                                client.field489[client.field488] = var121;
                                client.field490[client.field488] = var122;
                                client.field491[client.field488] = var123;
                                client.field303[client.field488] = null;
                                client.field492[client.field488] = 0;
                                client.field488++;
                            }
                            continue;
                        }
                        if (var441 == 3201) {
                            var5--;
                            client.method1316(field721[var5]);
                            continue;
                        }
                        if (var441 == 3202) {
                            var5 -= 2;
                            int var124 = field721[var5];
                            int var10000 = field721[var5 + 1];
                            if (client.field483 != 0 && var124 != -1) {
                                class166.method25(Statics.field890, var124, 0, client.field483, false);
                                client.field269 = true;
                            }
                            continue;
                        }
                    } else if (var441 < 3400) {
                        if (var441 == 3300) {
                            field721[var5++] = client.field257;
                            continue;
                        }
                        if (var441 == 3301) {
                            var5 -= 2;
                            int var126 = field721[var5];
                            int var127 = field721[var5 + 1];
                            int[] var128 = field721;
                            int var129 = var5++;
                            class14 var130 = (class14) class14.field201.method3274((long) var126);
                            int var131;
                            if (var130 == null) {
                                var131 = -1;
                            } else if (var127 >= 0 && var127 < var130.field196.length) {
                                var131 = var130.field196[var127];
                            } else {
                                var131 = -1;
                            }
                            var128[var129] = var131;
                            continue;
                        }
                        if (var441 == 3302) {
                            var5 -= 2;
                            int var132 = field721[var5];
                            int var133 = field721[var5 + 1];
                            field721[var5++] = class14.method750(var132, var133);
                            continue;
                        }
                        if (var441 == 3303) {
                            var5 -= 2;
                            int var134 = field721[var5];
                            int var135 = field721[var5 + 1];
                            field721[var5++] = class14.method621(var134, var135);
                            continue;
                        }
                        if (var441 == 3304) {
                            var5--;
                            int var136 = field721[var5];
                            int[] var137 = field721;
                            int var138 = var5++;
                            class45 var139 = (class45) class45.field995.method3231((long) var136);
                            class45 var140;
                            if (var139 == null) {
                                byte[] var141 = Statics.field997.method2852(5, var136);
                                class45 var142 = new class45();
                                if (var141 != null) {
                                    var142.method852(new class110(var141));
                                }
                                class45.field995.method3228(var142, (long) var136);
                                var140 = var142;
                            } else {
                                var140 = var139;
                            }
                            var137[var138] = var140.field998;
                            continue;
                        }
                        if (var441 == 3305) {
                            var5--;
                            int var143 = field721[var5];
                            field721[var5++] = client.field386[var143];
                            continue;
                        }
                        if (var441 == 3306) {
                            var5--;
                            int var144 = field721[var5];
                            field721[var5++] = client.field331[var144];
                            continue;
                        }
                        if (var441 == 3307) {
                            var5--;
                            int var145 = field721[var5];
                            field721[var5++] = client.field388[var145];
                            continue;
                        }
                        if (var441 == 3308) {
                            int var146 = Statics.field1829;
                            int var147 = (Statics.field1508.field766 >> 7) + Statics.field73;
                            int var148 = (Statics.field1508.field759 >> 7) + Statics.field1821;
                            field721[var5++] = (var146 << 28) + (var147 << 14) + var148;
                            continue;
                        }
                        if (var441 == 3309) {
                            var5--;
                            int var149 = field721[var5];
                            field721[var5++] = var149 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var441 == 3310) {
                            var5--;
                            int var150 = field721[var5];
                            field721[var5++] = var150 >> 28;
                            continue;
                        }
                        if (var441 == 3311) {
                            var5--;
                            int var151 = field721[var5];
                            field721[var5++] = var151 & 0x3FFF;
                            continue;
                        }
                        if (var441 == 3312) {
                            field721[var5++] = client.field251 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3313) {
                            var5 -= 2;
                            int var152 = field721[var5] + 32768;
                            int var153 = field721[var5 + 1];
                            int[] var154 = field721;
                            int var155 = var5++;
                            class14 var156 = (class14) class14.field201.method3274((long) var152);
                            int var157;
                            if (var156 == null) {
                                var157 = -1;
                            } else if (var153 >= 0 && var153 < var156.field196.length) {
                                var157 = var156.field196[var153];
                            } else {
                                var157 = -1;
                            }
                            var154[var155] = var157;
                            continue;
                        }
                        if (var441 == 3314) {
                            var5 -= 2;
                            int var158 = field721[var5] + 32768;
                            int var159 = field721[var5 + 1];
                            int[] var160 = field721;
                            int var161 = var5++;
                            class14 var162 = (class14) class14.field201.method3274((long) var158);
                            int var163;
                            if (var162 == null) {
                                var163 = 0;
                            } else if (var159 >= 0 && var159 < var162.field198.length) {
                                var163 = var162.field198[var159];
                            } else {
                                var163 = 0;
                            }
                            var160[var161] = var163;
                            continue;
                        }
                        if (var441 == 3315) {
                            var5 -= 2;
                            int var164 = field721[var5] + 32768;
                            int var165 = field721[var5 + 1];
                            field721[var5++] = class14.method621(var164, var165);
                            continue;
                        }
                        if (var441 == 3316) {
                            if (client.field416 >= 2) {
                                field721[var5++] = client.field416;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var441 == 3317) {
                            field721[var5++] = client.field264;
                            continue;
                        }
                        if (var441 == 3318) {
                            field721[var5++] = client.field400;
                            continue;
                        }
                        if (var441 == 3321) {
                            field721[var5++] = client.field414;
                            continue;
                        }
                        if (var441 == 3322) {
                            field721[var5++] = client.field415;
                            continue;
                        }
                        if (var441 == 3323) {
                            if (client.field418) {
                                field721[var5++] = 1;
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                        if (var441 == 3324) {
                            field721[var5++] = client.field247;
                            continue;
                        }
                    } else if (var441 < 3500) {
                        if (var441 == 3400) {
                            var5 -= 2;
                            int var166 = field721[var5];
                            int var167 = field721[var5 + 1];
                            class44 var168 = class44.method527(var166);
                            if (var168.field988 != 's') {
                            }
                            for (int var169 = 0; var169 < var168.field991; var169++) {
                                if (var168.field986[var169] == var167) {
                                    field722[var6++] = var168.field994[var169];
                                    var168 = null;
                                    break;
                                }
                            }
                            if (var168 != null) {
                                field722[var6++] = var168.field985;
                            }
                            continue;
                        }
                        if (var441 == 3408) {
                            var5 -= 4;
                            int var170 = field721[var5];
                            int var171 = field721[var5 + 1];
                            int var172 = field721[var5 + 2];
                            int var173 = field721[var5 + 3];
                            class44 var174 = class44.method527(var172);
                            if (var174.field987 == var170 && var174.field988 == var171) {
                                for (int var175 = 0; var175 < var174.field991; var175++) {
                                    if (var174.field986[var175] == var173) {
                                        if (var171 == 115) {
                                            field722[var6++] = var174.field994[var175];
                                        } else {
                                            field721[var5++] = var174.field993[var175];
                                        }
                                        var174 = null;
                                        break;
                                    }
                                }
                                if (var174 != null) {
                                    if (var171 == 115) {
                                        field722[var6++] = var174.field985;
                                    } else {
                                        field721[var5++] = var174.field989;
                                    }
                                }
                                continue;
                            }
                            if (var171 == 115) {
                                field722[var6++] = "null";
                            } else {
                                field721[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var441 < 3700) {
                        if (var441 == 3600) {
                            if (client.field381 == 0) {
                                field721[var5++] = -2;
                            } else if (client.field381 == 1) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field500;
                            }
                            continue;
                        }
                        if (var441 == 3601) {
                            var5--;
                            int var176 = field721[var5];
                            if (client.field381 == 2 && var176 < client.field500) {
                                field722[var6++] = client.field394[var176].field230;
                                field722[var6++] = client.field394[var176].field219;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 3602) {
                            var5--;
                            int var177 = field721[var5];
                            if (client.field381 == 2 && var177 < client.field500) {
                                field721[var5++] = client.field394[var177].field223;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var441 == 3603) {
                            var5--;
                            int var178 = field721[var5];
                            if (client.field381 == 2 && var178 < client.field500) {
                                field721[var5++] = client.field394[var178].field221;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var441 == 3604) {
                            var6--;
                            String var179 = field722[var6];
                            var5--;
                            int var180 = field721[var5];
                            client.field289.method2414(223);
                            class113 var181 = client.field289;
                            int var182 = var179.length() + 1;
                            var181.method2263(var182 + 1);
                            client.field289.method2294(var180);
                            client.field289.method2152(var179);
                            continue;
                        }
                        if (var441 == 3605) {
                            var6--;
                            String var183 = field722[var6];
                            if (var183 == null) {
                                continue;
                            }
                            if ((client.field500 < 200 || client.field450 == 1) && client.field500 < 400) {
                                String var184 = Statics.method2579(var183, Statics.field250);
                                if (var184 == null) {
                                    continue;
                                }
                                for (int var185 = 0; var185 < client.field500; var185++) {
                                    class16 var186 = client.field394[var185];
                                    String var187 = Statics.method2579(var186.field230, Statics.field250);
                                    if (var187 != null && var187.equals(var184)) {
                                        class10.method591(30, "", var183 + class147.field2328);
                                        continue label2702;
                                    }
                                    if (var186.field219 != null) {
                                        String var188 = Statics.method2579(var186.field219, Statics.field250);
                                        if (var188 != null && var188.equals(var184)) {
                                            class10.method591(30, "", var183 + class147.field2328);
                                            continue label2702;
                                        }
                                    }
                                }
                                for (int var189 = 0; var189 < client.field493; var189++) {
                                    class8 var190 = client.field508[var189];
                                    String var191 = Statics.method2579(var190.field135, Statics.field250);
                                    if (var191 != null && var191.equals(var184)) {
                                        class10.method591(30, "", class147.field2333 + var183 + class147.field2334);
                                        continue label2702;
                                    }
                                    if (var190.field129 != null) {
                                        String var192 = Statics.method2579(var190.field129, Statics.field250);
                                        if (var192 != null && var192.equals(var184)) {
                                            class10.method591(30, "", class147.field2333 + var183 + class147.field2334);
                                            continue label2702;
                                        }
                                    }
                                }
                                if (Statics.method2579(Statics.field1508.field40, Statics.field250).equals(var184)) {
                                    class10.method591(30, "", class147.field2379);
                                } else {
                                    client.field289.method2414(155);
                                    class113 var193 = client.field289;
                                    int var194 = var183.length() + 1;
                                    var193.method2263(var194);
                                    client.field289.method2152(var183);
                                }
                                continue;
                            }
                            class10.method591(30, "", class147.field2286);
                            continue;
                        }
                        if (var441 == 3606) {
                            var6--;
                            String var195 = field722[var6];
                            client.method1606(var195);
                            continue;
                        }
                        if (var441 == 3607) {
                            var6--;
                            String var196 = field722[var6];
                            client.method28(var196, false);
                            continue;
                        }
                        if (var441 == 3608) {
                            var6--;
                            String var197 = field722[var6];
                            if (var197 == null) {
                                continue;
                            }
                            String var198 = Statics.method2579(var197, Statics.field250);
                            if (var198 == null) {
                                continue;
                            }
                            int var199 = 0;
                            while (true) {
                                if (var199 >= client.field493) {
                                    continue label2702;
                                }
                                class8 var200 = client.field508[var199];
                                String var201 = var200.field135;
                                String var202 = Statics.method2579(var201, Statics.field250);
                                boolean var203;
                                if (var197 == null || var201 == null) {
                                    var203 = false;
                                } else if (var197.startsWith("#") || var201.startsWith("#")) {
                                    var203 = var197.equals(var201);
                                } else {
                                    var203 = var198.equals(var202);
                                }
                                if (var203) {
                                    client.field493--;
                                    for (int var204 = var199; var204 < client.field493; var204++) {
                                        client.field508[var204] = client.field508[var204 + 1];
                                    }
                                    client.field372 = client.field435;
                                    client.field289.method2414(91);
                                    class113 var205 = client.field289;
                                    int var206 = var197.length() + 1;
                                    var205.method2263(var206);
                                    client.field289.method2152(var197);
                                    continue label2702;
                                }
                                var199++;
                            }
                        }
                        if (var441 == 3609) {
                            var6--;
                            String var207 = field722[var6];
                            class142[] var208 = class142.method473();
                            for (int var209 = 0; var209 < var208.length; var209++) {
                                class142 var210 = var208[var209];
                                if (var210.field2124 != -1 && var207.startsWith(Statics.method2521(var210.field2124))) {
                                    var207 = var207.substring(6 + Integer.toString(var210.field2124).length());
                                    break;
                                }
                            }
                            field721[var5++] = client.method98(var207, false) ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3611) {
                            if (client.field473 == null) {
                                field722[var6++] = "";
                                continue;
                            }
                            String[] var211 = field722;
                            int var212 = var6++;
                            String var213 = client.field473;
                            long var214 = 0L;
                            int var216 = var213.length();
                            for (int var217 = 0; var217 < var216; var217++) {
                                var214 *= 37L;
                                char var218 = var213.charAt(var217);
                                if (var218 >= 'A' && var218 <= 'Z') {
                                    var214 += (long) (var218 + 1 - 65);
                                } else if (var218 >= 'a' && var218 <= 'z') {
                                    var214 += (long) (var218 + 1 - 97);
                                } else if (var218 >= '0' && var218 <= '9') {
                                    var214 += (long) (var218 + 27 - 48);
                                }
                                if (var214 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var214 % 37L == 0L && var214 != 0L) {
                                var214 /= 37L;
                            }
                            String var221 = class212.method821(var214);
                            if (var221 == null) {
                                var221 = "";
                            }
                            var211[var212] = var221;
                            continue;
                        }
                        if (var441 == 3612) {
                            if (client.field473 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = Statics.field1289;
                            }
                            continue;
                        }
                        if (var441 == 3613) {
                            var5--;
                            int var223 = field721[var5];
                            if (client.field473 != null && var223 < Statics.field1289) {
                                field722[var6++] = Statics.field578[var223].field575;
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 3614) {
                            var5--;
                            int var224 = field721[var5];
                            if (client.field473 != null && var224 < Statics.field1289) {
                                field721[var5++] = Statics.field578[var224].field572;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var441 == 3615) {
                            var5--;
                            int var225 = field721[var5];
                            if (client.field473 != null && var225 < Statics.field1289) {
                                field721[var5++] = Statics.field578[var225].field573;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var441 == 3616) {
                            field721[var5++] = Statics.field147;
                            continue;
                        }
                        if (var441 == 3617) {
                            var6--;
                            String var226 = field722[var6];
                            client.method2394(var226);
                            continue;
                        }
                        if (var441 == 3618) {
                            field721[var5++] = Statics.field1993;
                            continue;
                        }
                        if (var441 == 3619) {
                            var6--;
                            String var227 = field722[var6];
                            if (!var227.equals("")) {
                                client.field289.method2414(65);
                                class113 var228 = client.field289;
                                int var229 = var227.length() + 1;
                                var228.method2263(var229);
                                client.field289.method2152(var227);
                            }
                            continue;
                        }
                        if (var441 == 3620) {
                            client.method3209();
                            continue;
                        }
                        if (var441 == 3621) {
                            if (client.field381 == 0) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = client.field493;
                            }
                            continue;
                        }
                        if (var441 == 3622) {
                            var5--;
                            int var230 = field721[var5];
                            if (client.field381 != 0 && var230 < client.field493) {
                                field722[var6++] = client.field508[var230].field135;
                                field722[var6++] = client.field508[var230].field129;
                                continue;
                            }
                            field722[var6++] = "";
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 3623) {
                            var6--;
                            String var231 = field722[var6];
                            if (var231.startsWith(Statics.method2521(0)) || var231.startsWith(Statics.method2521(1))) {
                                var231 = var231.substring(7);
                            }
                            field721[var5++] = client.method27(var231) ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3624) {
                            var5--;
                            int var232 = field721[var5];
                            if (Statics.field578 != null && var232 < Statics.field1289 && Statics.field578[var232].field575.equalsIgnoreCase(Statics.field1508.field40)) {
                                field721[var5++] = 1;
                                continue;
                            }
                            field721[var5++] = 0;
                            continue;
                        }
                        if (var441 == 3625) {
                            if (client.field474 == null) {
                                field722[var6++] = "";
                                continue;
                            }
                            String[] var233 = field722;
                            int var234 = var6++;
                            String var235 = client.field474;
                            long var236 = 0L;
                            int var238 = var235.length();
                            for (int var239 = 0; var239 < var238; var239++) {
                                var236 *= 37L;
                                char var240 = var235.charAt(var239);
                                if (var240 >= 'A' && var240 <= 'Z') {
                                    var236 += (long) (var240 + 1 - 65);
                                } else if (var240 >= 'a' && var240 <= 'z') {
                                    var236 += (long) (var240 + 1 - 97);
                                } else if (var240 >= '0' && var240 <= '9') {
                                    var236 += (long) (var240 + 27 - 48);
                                }
                                if (var236 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var236 % 37L == 0L && var236 != 0L) {
                                var236 /= 37L;
                            }
                            String var243 = class212.method821(var236);
                            if (var243 == null) {
                                var243 = "";
                            }
                            var233[var234] = var243;
                            continue;
                        }
                    } else if (var441 < 4000) {
                        if (var441 == 3903) {
                            var5--;
                            int var245 = field721[var5];
                            field721[var5++] = client.field507[var245].method3464();
                            continue;
                        }
                        if (var441 == 3904) {
                            var5--;
                            int var246 = field721[var5];
                            field721[var5++] = client.field507[var246].field2961;
                            continue;
                        }
                        if (var441 == 3905) {
                            var5--;
                            int var247 = field721[var5];
                            field721[var5++] = client.field507[var247].field2965;
                            continue;
                        }
                        if (var441 == 3906) {
                            var5--;
                            int var248 = field721[var5];
                            field721[var5++] = client.field507[var248].field2962;
                            continue;
                        }
                        if (var441 == 3907) {
                            var5--;
                            int var249 = field721[var5];
                            field721[var5++] = client.field507[var249].field2964;
                            continue;
                        }
                        if (var441 == 3908) {
                            var5--;
                            int var250 = field721[var5];
                            field721[var5++] = client.field507[var250].field2960;
                            continue;
                        }
                        if (var441 == 3910) {
                            var5--;
                            int var251 = field721[var5];
                            int var252 = client.field507[var251].method3463();
                            field721[var5++] = var252 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3911) {
                            var5--;
                            int var253 = field721[var5];
                            int var254 = client.field507[var253].method3463();
                            field721[var5++] = var254 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3912) {
                            var5--;
                            int var255 = field721[var5];
                            int var256 = client.field507[var255].method3463();
                            field721[var5++] = var256 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3913) {
                            var5--;
                            int var257 = field721[var5];
                            int var258 = client.field507[var257].method3463();
                            field721[var5++] = var258 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 3914) {
                            var5--;
                            boolean var259 = field721[var5] == 1;
                            if (Statics.field12 != null) {
                                Statics.field12.method3479(class204.field2970, var259);
                            }
                            continue;
                        }
                        if (var441 == 3915) {
                            var5--;
                            boolean var260 = field721[var5] == 1;
                            if (Statics.field12 != null) {
                                Statics.field12.method3479(class204.field2972, var260);
                            }
                            continue;
                        }
                        if (var441 == 3916) {
                            var5 -= 2;
                            boolean var261 = field721[var5] == 1;
                            boolean var262 = field721[var5 + 1] == 1;
                            if (Statics.field12 != null) {
                                Statics.field12.method3479(new class20(var262), var261);
                            }
                            continue;
                        }
                        if (var441 == 3917) {
                            var5--;
                            boolean var263 = field721[var5] == 1;
                            if (Statics.field12 != null) {
                                Statics.field12.method3479(class204.field2968, var263);
                            }
                            continue;
                        }
                        if (var441 == 3918) {
                            var5--;
                            boolean var264 = field721[var5] == 1;
                            if (Statics.field12 != null) {
                                Statics.field12.method3479(class204.field2969, var264);
                            }
                            continue;
                        }
                        if (var441 == 3919) {
                            field721[var5++] = Statics.field12 == null ? 0 : Statics.field12.field2971.size();
                            continue;
                        }
                        if (var441 == 3920) {
                            var5--;
                            int var265 = field721[var5];
                            class197 var266 = (class197) Statics.field12.field2971.get(var265);
                            field721[var5++] = var266.field2941;
                            continue;
                        }
                        if (var441 == 3921) {
                            var5--;
                            int var267 = field721[var5];
                            class197 var268 = (class197) Statics.field12.field2971.get(var267);
                            field722[var6++] = var268.method3420();
                            continue;
                        }
                        if (var441 == 3922) {
                            var5--;
                            int var269 = field721[var5];
                            class197 var270 = (class197) Statics.field12.field2971.get(var269);
                            field722[var6++] = var270.method3422();
                            continue;
                        }
                        if (var441 == 3923) {
                            var5--;
                            int var271 = field721[var5];
                            class197 var272 = (class197) Statics.field12.field2971.get(var271);
                            long var273 = class106.method487() - Statics.field95 - var272.field2940;
                            int var275 = (int) (var273 / 3600000L);
                            int var276 = (int) ((var273 - (long) (var275 * 3600000)) / 60000L);
                            int var277 = (int) ((var273 - (long) (var275 * 3600000) - (long) (var276 * 60000)) / 1000L);
                            String var278 = var275 + ":" + var276 / 10 + var276 % 10 + ":" + var277 / 10 + var277 % 10;
                            field722[var6++] = var278;
                            continue;
                        }
                        if (var441 == 3924) {
                            var5--;
                            int var279 = field721[var5];
                            class197 var280 = (class197) Statics.field12.field2971.get(var279);
                            field721[var5++] = var280.field2944.field2962;
                            continue;
                        }
                        if (var441 == 3925) {
                            var5--;
                            int var281 = field721[var5];
                            class197 var282 = (class197) Statics.field12.field2971.get(var281);
                            field721[var5++] = var282.field2944.field2965;
                            continue;
                        }
                        if (var441 == 3926) {
                            var5--;
                            int var283 = field721[var5];
                            class197 var284 = (class197) Statics.field12.field2971.get(var283);
                            field721[var5++] = var284.field2944.field2961;
                            continue;
                        }
                    } else if (var441 < 4100) {
                        if (var441 == 4000) {
                            var5 -= 2;
                            int var285 = field721[var5];
                            int var286 = field721[var5 + 1];
                            field721[var5++] = var285 + var286;
                            continue;
                        }
                        if (var441 == 4001) {
                            var5 -= 2;
                            int var287 = field721[var5];
                            int var288 = field721[var5 + 1];
                            field721[var5++] = var287 - var288;
                            continue;
                        }
                        if (var441 == 4002) {
                            var5 -= 2;
                            int var289 = field721[var5];
                            int var290 = field721[var5 + 1];
                            field721[var5++] = var289 * var290;
                            continue;
                        }
                        if (var441 == 4003) {
                            var5 -= 2;
                            int var291 = field721[var5];
                            int var292 = field721[var5 + 1];
                            field721[var5++] = var291 / var292;
                            continue;
                        }
                        if (var441 == 4004) {
                            var5--;
                            int var293 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) var293);
                            continue;
                        }
                        if (var441 == 4005) {
                            var5--;
                            int var294 = field721[var5];
                            field721[var5++] = (int) (Math.random() * (double) (var294 + 1));
                            continue;
                        }
                        if (var441 == 4006) {
                            var5 -= 5;
                            int var295 = field721[var5];
                            int var296 = field721[var5 + 1];
                            int var297 = field721[var5 + 2];
                            int var298 = field721[var5 + 3];
                            int var299 = field721[var5 + 4];
                            field721[var5++] = (var296 - var295) * (var299 - var297) / (var298 - var297) + var295;
                            continue;
                        }
                        if (var441 == 4007) {
                            var5 -= 2;
                            int var300 = field721[var5];
                            int var301 = field721[var5 + 1];
                            field721[var5++] = var300 * var301 / 100 + var300;
                            continue;
                        }
                        if (var441 == 4008) {
                            var5 -= 2;
                            int var302 = field721[var5];
                            int var303 = field721[var5 + 1];
                            field721[var5++] = var302 | 0x1 << var303;
                            continue;
                        }
                        if (var441 == 4009) {
                            var5 -= 2;
                            int var304 = field721[var5];
                            int var305 = field721[var5 + 1];
                            field721[var5++] = var304 & -1 - (0x1 << var305);
                            continue;
                        }
                        if (var441 == 4010) {
                            var5 -= 2;
                            int var306 = field721[var5];
                            int var307 = field721[var5 + 1];
                            field721[var5++] = (var306 & 0x1 << var307) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var441 == 4011) {
                            var5 -= 2;
                            int var308 = field721[var5];
                            int var309 = field721[var5 + 1];
                            field721[var5++] = var308 % var309;
                            continue;
                        }
                        if (var441 == 4012) {
                            var5 -= 2;
                            int var310 = field721[var5];
                            int var311 = field721[var5 + 1];
                            if (var310 == 0) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var310, (double) var311);
                            }
                            continue;
                        }
                        if (var441 == 4013) {
                            var5 -= 2;
                            int var312 = field721[var5];
                            int var313 = field721[var5 + 1];
                            if (var312 == 0) {
                                field721[var5++] = 0;
                            } else if (var313 == 0) {
                                field721[var5++] = Integer.MAX_VALUE;
                            } else {
                                field721[var5++] = (int) Math.pow((double) var312, 1.0D / (double) var313);
                            }
                            continue;
                        }
                        if (var441 == 4014) {
                            var5 -= 2;
                            int var314 = field721[var5];
                            int var315 = field721[var5 + 1];
                            field721[var5++] = var314 & var315;
                            continue;
                        }
                        if (var441 == 4015) {
                            var5 -= 2;
                            int var316 = field721[var5];
                            int var317 = field721[var5 + 1];
                            field721[var5++] = var316 | var317;
                            continue;
                        }
                    } else if (var441 < 4200) {
                        if (var441 == 4100) {
                            var6--;
                            String var318 = field722[var6];
                            var5--;
                            int var319 = field721[var5];
                            field722[var6++] = var318 + var319;
                            continue;
                        }
                        if (var441 == 4101) {
                            var6 -= 2;
                            String var320 = field722[var6];
                            String var321 = field722[var6 + 1];
                            field722[var6++] = var320 + var321;
                            continue;
                        }
                        if (var441 == 4102) {
                            var6--;
                            String var322 = field722[var6];
                            var5--;
                            int var323 = field721[var5];
                            field722[var6++] = var322 + class213.method477(var323, true);
                            continue;
                        }
                        if (var441 == 4103) {
                            var6--;
                            String var324 = field722[var6];
                            field722[var6++] = var324.toLowerCase();
                            continue;
                        }
                        if (var441 == 4104) {
                            var5--;
                            int var325 = field721[var5];
                            long var326 = ((long) var325 + 11745L) * 86400000L;
                            field725.setTime(new Date(var326));
                            int var328 = field725.get(5);
                            int var329 = field725.get(2);
                            int var330 = field725.get(1);
                            field722[var6++] = var328 + "-" + field729[var329] + "-" + var330;
                            continue;
                        }
                        if (var441 == 4105) {
                            var6 -= 2;
                            String var331 = field722[var6];
                            String var332 = field722[var6 + 1];
                            if (Statics.field1508.field39 != null && Statics.field1508.field39.field2696) {
                                field722[var6++] = var332;
                                continue;
                            }
                            field722[var6++] = var331;
                            continue;
                        }
                        if (var441 == 4106) {
                            var5--;
                            int var333 = field721[var5];
                            field722[var6++] = Integer.toString(var333);
                            continue;
                        }
                        if (var441 == 4107) {
                            var6 -= 2;
                            int[] var334 = field721;
                            int var335 = var5++;
                            int var336 = class216.method2870(field722[var6], field722[var6 + 1], client.field396);
                            byte var337;
                            if (var336 > 0) {
                                var337 = 1;
                            } else if (var336 < 0) {
                                var337 = -1;
                            } else {
                                var337 = 0;
                            }
                            var334[var335] = var337;
                            continue;
                        }
                        if (var441 == 4108) {
                            var6--;
                            String var338 = field722[var6];
                            var5 -= 2;
                            int var339 = field721[var5];
                            int var340 = field721[var5 + 1];
                            byte[] var341 = Statics.field930.method2852(var340, 0);
                            class207 var342 = new class207(var341);
                            field721[var5++] = var342.method3497(var338, var339);
                            continue;
                        }
                        if (var441 == 4109) {
                            var6--;
                            String var343 = field722[var6];
                            var5 -= 2;
                            int var344 = field721[var5];
                            int var345 = field721[var5 + 1];
                            byte[] var346 = Statics.field930.method2852(var345, 0);
                            class207 var347 = new class207(var346);
                            field721[var5++] = var347.method3496(var343, var344);
                            continue;
                        }
                        if (var441 == 4110) {
                            var6 -= 2;
                            String var348 = field722[var6];
                            String var349 = field722[var6 + 1];
                            var5--;
                            if (field721[var5] == 1) {
                                field722[var6++] = var348;
                            } else {
                                field722[var6++] = var349;
                            }
                            continue;
                        }
                        if (var441 == 4111) {
                            var6--;
                            String var350 = field722[var6];
                            field722[var6++] = class206.method3513(var350);
                            continue;
                        }
                        if (var441 == 4112) {
                            var6--;
                            String var351 = field722[var6];
                            var5--;
                            int var352 = field721[var5];
                            field722[var6++] = var351 + (char) var352;
                            continue;
                        }
                        if (var441 == 4113) {
                            var5--;
                            int var353 = field721[var5];
                            int[] var354 = field721;
                            int var355 = var5++;
                            char var356 = (char) var353;
                            boolean var357;
                            if (var356 >= ' ' && var356 <= '~') {
                                var357 = true;
                            } else if (var356 >= 160 && var356 <= 255) {
                                var357 = true;
                            } else if (var356 == 8364 || var356 == 338 || var356 == 8212 || var356 == 339 || var356 == 376) {
                                var357 = true;
                            } else {
                                var357 = false;
                            }
                            var354[var355] = var357 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4114) {
                            var5--;
                            int var358 = field721[var5];
                            int[] var359 = field721;
                            int var360 = var5++;
                            char var361 = (char) var358;
                            boolean var362 = var361 >= '0' && var361 <= '9' || var361 >= 'A' && var361 <= 'Z' || var361 >= 'a' && var361 <= 'z';
                            var359[var360] = var362 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4115) {
                            var5--;
                            int var363 = field721[var5];
                            field721[var5++] = class213.method2862((char) var363) ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4116) {
                            var5--;
                            int var364 = field721[var5];
                            field721[var5++] = class213.method3659((char) var364) ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4117) {
                            var6--;
                            String var365 = field722[var6];
                            if (var365 == null) {
                                field721[var5++] = 0;
                            } else {
                                field721[var5++] = var365.length();
                            }
                            continue;
                        }
                        if (var441 == 4118) {
                            var6--;
                            String var366 = field722[var6];
                            var5 -= 2;
                            int var367 = field721[var5];
                            int var368 = field721[var5 + 1];
                            field722[var6++] = var366.substring(var367, var368);
                            continue;
                        }
                        if (var441 == 4119) {
                            var6--;
                            String var369 = field722[var6];
                            StringBuilder var370 = new StringBuilder(var369.length());
                            boolean var371 = false;
                            for (int var372 = 0; var372 < var369.length(); var372++) {
                                char var373 = var369.charAt(var372);
                                if (var373 == '<') {
                                    var371 = true;
                                } else if (var373 == '>') {
                                    var371 = false;
                                } else if (!var371) {
                                    var370.append(var373);
                                }
                            }
                            field722[var6++] = var370.toString();
                            continue;
                        }
                        if (var441 == 4120) {
                            var6--;
                            String var374 = field722[var6];
                            var5--;
                            int var375 = field721[var5];
                            field721[var5++] = var374.indexOf(var375);
                            continue;
                        }
                        if (var441 == 4121) {
                            var6 -= 2;
                            String var376 = field722[var6];
                            String var377 = field722[var6 + 1];
                            var5--;
                            int var378 = field721[var5];
                            field721[var5++] = var376.indexOf(var377, var378);
                            continue;
                        }
                    } else if (var441 < 4300) {
                        if (var441 == 4200) {
                            var5--;
                            int var379 = field721[var5];
                            field722[var6++] = class46.method712(var379).field1022;
                            continue;
                        }
                        if (var441 == 4201) {
                            var5 -= 2;
                            int var380 = field721[var5];
                            int var381 = field721[var5 + 1];
                            class46 var382 = class46.method712(var380);
                            if (var381 >= 1 && var381 <= 5 && var382.field1031[var381 - 1] != null) {
                                field722[var6++] = var382.field1031[var381 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 4202) {
                            var5 -= 2;
                            int var383 = field721[var5];
                            int var384 = field721[var5 + 1];
                            class46 var385 = class46.method712(var383);
                            if (var384 >= 1 && var384 <= 5 && var385.field1027[var384 - 1] != null) {
                                field722[var6++] = var385.field1027[var384 - 1];
                                continue;
                            }
                            field722[var6++] = "";
                            continue;
                        }
                        if (var441 == 4203) {
                            var5--;
                            int var386 = field721[var5];
                            field721[var5++] = class46.method712(var386).field1026;
                            continue;
                        }
                        if (var441 == 4204) {
                            var5--;
                            int var387 = field721[var5];
                            field721[var5++] = class46.method712(var387).field1025 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4205) {
                            var5--;
                            int var388 = field721[var5];
                            class46 var389 = class46.method712(var388);
                            if (var389.field1050 == -1 && var389.field1044 >= 0) {
                                field721[var5++] = var389.field1044;
                                continue;
                            }
                            field721[var5++] = var388;
                            continue;
                        }
                        if (var441 == 4206) {
                            var5--;
                            int var390 = field721[var5];
                            class46 var391 = class46.method712(var390);
                            if (var391.field1050 >= 0 && var391.field1044 >= 0) {
                                field721[var5++] = var391.field1044;
                                continue;
                            }
                            field721[var5++] = var390;
                            continue;
                        }
                        if (var441 == 4207) {
                            var5--;
                            int var392 = field721[var5];
                            field721[var5++] = class46.method712(var392).field1042 ? 1 : 0;
                            continue;
                        }
                        if (var441 == 4210) {
                            var6--;
                            String var393 = field722[var6];
                            var5--;
                            int var394 = field721[var5];
                            boolean var396 = var394 == 1;
                            String var397 = var393.toLowerCase();
                            short[] var398 = new short[16];
                            int var399 = 0;
                            int var400 = 0;
                            while (true) {
                                if (var400 >= Statics.field142) {
                                    Statics.field711 = var398;
                                    Statics.field1296 = 0;
                                    Statics.field2515 = var399;
                                    String[] var404 = new String[Statics.field2515];
                                    for (int var405 = 0; var405 < Statics.field2515; var405++) {
                                        var404[var405] = class46.method712(var398[var405]).field1022;
                                    }
                                    short[] var406 = Statics.field711;
                                    class115.method2747(var404, var406, 0, var404.length - 1);
                                    break;
                                }
                                class46 var401 = class46.method712(var400);
                                if ((!var396 || var401.field1012) && var401.field1050 == -1 && var401.field1022.toLowerCase().indexOf(var397) != -1) {
                                    if (var399 >= 250) {
                                        Statics.field2515 = -1;
                                        Statics.field711 = null;
                                        break;
                                    }
                                    if (var399 >= var398.length) {
                                        short[] var402 = new short[var398.length * 2];
                                        for (int var403 = 0; var403 < var399; var403++) {
                                            var402[var403] = var398[var403];
                                        }
                                        var398 = var402;
                                    }
                                    var398[var399++] = (short) var400;
                                }
                                var400++;
                            }
                            field721[var5++] = Statics.field2515;
                            continue;
                        }
                        if (var441 == 4211) {
                            if (Statics.field711 != null && Statics.field1296 < Statics.field2515) {
                                field721[var5++] = Statics.field711[++Statics.field1296 - 1] & 0xFFFF;
                                continue;
                            }
                            field721[var5++] = -1;
                            continue;
                        }
                        if (var441 == 4212) {
                            Statics.field1296 = 0;
                            continue;
                        }
                    } else if (var441 < 5100) {
                        if (var441 == 5000) {
                            field721[var5++] = client.field310;
                            continue;
                        }
                        if (var441 == 5001) {
                            var5 -= 3;
                            client.field310 = field721[var5];
                            Statics.field996 = class121.method81(field721[var5 + 1]);
                            if (Statics.field996 == null) {
                                Statics.field996 = class121.field1921;
                            }
                            client.field465 = field721[var5 + 2];
                            client.field289.method2414(245);
                            client.field289.method2263(client.field310);
                            client.field289.method2263(Statics.field996.field1923);
                            client.field289.method2263(client.field465);
                            continue;
                        }
                        if (var441 == 5002) {
                            var6--;
                            String var407 = field722[var6];
                            var5 -= 2;
                            int var408 = field721[var5];
                            int var409 = field721[var5 + 1];
                            client.field289.method2414(33);
                            class113 var410 = client.field289;
                            int var411 = var407.length() + 1;
                            var410.method2263(var411 + 2);
                            client.field289.method2152(var407);
                            client.field289.method2263(var408 - 1);
                            client.field289.method2263(var409);
                            continue;
                        }
                        if (var441 == 5003) {
                            var5 -= 2;
                            int var412 = field721[var5];
                            int var413 = field721[var5 + 1];
                            class25 var414 = (class25) class10.field146.get(var412);
                            class32 var415 = var414.method514(var413);
                            if (var415 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var415.field712;
                                field721[var5++] = var415.field704;
                                field722[var6++] = var415.field706 == null ? "" : var415.field706;
                                field722[var6++] = var415.field707 == null ? "" : var415.field707;
                                field722[var6++] = var415.field708 == null ? "" : var415.field708;
                            }
                            continue;
                        }
                        if (var441 == 5004) {
                            var5--;
                            int var417 = field721[var5];
                            class32 var418 = (class32) class10.field150.method3285((long) var417);
                            if (var418 == null) {
                                field721[var5++] = -1;
                                field721[var5++] = 0;
                                field722[var6++] = "";
                                field722[var6++] = "";
                                field722[var6++] = "";
                            } else {
                                field721[var5++] = var418.field705;
                                field721[var5++] = var418.field704;
                                field722[var6++] = var418.field706 == null ? "" : var418.field706;
                                field722[var6++] = var418.field707 == null ? "" : var418.field707;
                                field722[var6++] = var418.field708 == null ? "" : var418.field708;
                            }
                            continue;
                        }
                        if (var441 == 5005) {
                            if (Statics.field996 == null) {
                                field721[var5++] = -1;
                            } else {
                                field721[var5++] = Statics.field996.field1923;
                            }
                            continue;
                        }
                        if (var441 == 5008) {
                            var6--;
                            String var420 = field722[var6];
                            var5--;
                            int var421 = field721[var5];
                            String var422 = var420.toLowerCase();
                            byte var423 = 0;
                            if (var422.startsWith(class147.field2337)) {
                                var423 = 0;
                                var420 = var420.substring(class147.field2337.length());
                            } else if (var422.startsWith(class147.field2339)) {
                                var423 = 1;
                                var420 = var420.substring(class147.field2339.length());
                            } else if (var422.startsWith(class147.field2341)) {
                                var423 = 2;
                                var420 = var420.substring(class147.field2341.length());
                            } else if (var422.startsWith(class147.field2343)) {
                                var423 = 3;
                                var420 = var420.substring(class147.field2343.length());
                            } else if (var422.startsWith(class147.field2345)) {
                                var423 = 4;
                                var420 = var420.substring(class147.field2345.length());
                            } else if (var422.startsWith(class147.field2222)) {
                                var423 = 5;
                                var420 = var420.substring(class147.field2222.length());
                            } else if (var422.startsWith(class147.field2246)) {
                                var423 = 6;
                                var420 = var420.substring(class147.field2246.length());
                            } else if (var422.startsWith(class147.field2347)) {
                                var423 = 7;
                                var420 = var420.substring(class147.field2347.length());
                            } else if (var422.startsWith(class147.field2217)) {
                                var423 = 8;
                                var420 = var420.substring(class147.field2217.length());
                            } else if (var422.startsWith(class147.field2370)) {
                                var423 = 9;
                                var420 = var420.substring(class147.field2370.length());
                            } else if (var422.startsWith(class147.field2357)) {
                                var423 = 10;
                                var420 = var420.substring(class147.field2357.length());
                            } else if (var422.startsWith(class147.field2176)) {
                                var423 = 11;
                                var420 = var420.substring(class147.field2176.length());
                            } else if (client.field396 != 0) {
                                if (var422.startsWith(class147.field2338)) {
                                    var423 = 0;
                                    var420 = var420.substring(class147.field2338.length());
                                } else if (var422.startsWith(class147.field2394)) {
                                    var423 = 1;
                                    var420 = var420.substring(class147.field2394.length());
                                } else if (var422.startsWith(class147.field2342)) {
                                    var423 = 2;
                                    var420 = var420.substring(class147.field2342.length());
                                } else if (var422.startsWith(class147.field2344)) {
                                    var423 = 3;
                                    var420 = var420.substring(class147.field2344.length());
                                } else if (var422.startsWith(class147.field2346)) {
                                    var423 = 4;
                                    var420 = var420.substring(class147.field2346.length());
                                } else if (var422.startsWith(class147.field2398)) {
                                    var423 = 5;
                                    var420 = var420.substring(class147.field2398.length());
                                } else if (var422.startsWith(class147.field2289)) {
                                    var423 = 6;
                                    var420 = var420.substring(class147.field2289.length());
                                } else if (var422.startsWith(class147.field2352)) {
                                    var423 = 7;
                                    var420 = var420.substring(class147.field2352.length());
                                } else if (var422.startsWith(class147.field2354)) {
                                    var423 = 8;
                                    var420 = var420.substring(class147.field2354.length());
                                } else if (var422.startsWith(class147.field2376)) {
                                    var423 = 9;
                                    var420 = var420.substring(class147.field2376.length());
                                } else if (var422.startsWith(class147.field2358)) {
                                    var423 = 10;
                                    var420 = var420.substring(class147.field2358.length());
                                } else if (var422.startsWith(class147.field2360)) {
                                    var423 = 11;
                                    var420 = var420.substring(class147.field2360.length());
                                }
                            }
                            String var424 = var420.toLowerCase();
                            byte var425 = 0;
                            if (var424.startsWith(class147.field2287)) {
                                var425 = 1;
                                var420 = var420.substring(class147.field2287.length());
                            } else if (var424.startsWith(class147.field2363)) {
                                var425 = 2;
                                var420 = var420.substring(class147.field2363.length());
                            } else if (var424.startsWith(class147.field2365)) {
                                var425 = 3;
                                var420 = var420.substring(class147.field2365.length());
                            } else if (var424.startsWith(class147.field2367)) {
                                var425 = 4;
                                var420 = var420.substring(class147.field2367.length());
                            } else if (var424.startsWith(class147.field2220)) {
                                var425 = 5;
                                var420 = var420.substring(class147.field2220.length());
                            } else if (client.field396 != 0) {
                                if (var424.startsWith(class147.field2384)) {
                                    var425 = 1;
                                    var420 = var420.substring(class147.field2384.length());
                                } else if (var424.startsWith(class147.field2364)) {
                                    var425 = 2;
                                    var420 = var420.substring(class147.field2364.length());
                                } else if (var424.startsWith(class147.field2366)) {
                                    var425 = 3;
                                    var420 = var420.substring(class147.field2366.length());
                                } else if (var424.startsWith(class147.field2291)) {
                                    var425 = 4;
                                    var420 = var420.substring(class147.field2291.length());
                                } else if (var424.startsWith(class147.field2350)) {
                                    var425 = 5;
                                    var420 = var420.substring(class147.field2350.length());
                                }
                            }
                            client.field289.method2414(225);
                            client.field289.method2263(0);
                            int var426 = client.field289.field1847;
                            client.field289.method2263(var421);
                            client.field289.method2263(var423);
                            client.field289.method2263(var425);
                            class205.method1075(client.field289, var420);
                            client.field289.method2158(client.field289.field1847 - var426);
                            continue;
                        }
                        if (var441 == 5009) {
                            var6 -= 2;
                            String var427 = field722[var6];
                            String var428 = field722[var6 + 1];
                            client.field289.method2414(216);
                            client.field289.method2148(0);
                            int var429 = client.field289.field1847;
                            client.field289.method2152(var427);
                            class205.method1075(client.field289, var428);
                            client.field289.method2157(client.field289.field1847 - var429);
                            continue;
                        }
                        if (var441 == 5015) {
                            String var430;
                            if (Statics.field1508 == null || Statics.field1508.field40 == null) {
                                var430 = "";
                            } else {
                                var430 = Statics.field1508.field40;
                            }
                            field722[var6++] = var430;
                            continue;
                        }
                        if (var441 == 5016) {
                            field721[var5++] = client.field465;
                            continue;
                        }
                        if (var441 == 5017) {
                            var5--;
                            int var431 = field721[var5];
                            field721[var5++] = class10.method1791(var431);
                            continue;
                        }
                        if (var441 == 5018) {
                            var5--;
                            int var432 = field721[var5];
                            field721[var5++] = class10.method587(var432);
                            continue;
                        }
                        if (var441 == 5019) {
                            var5--;
                            int var433 = field721[var5];
                            field721[var5++] = class10.method453(var433);
                            continue;
                        }
                        if (var441 == 5020) {
                            var6--;
                            String var434 = field722[var6];
                            client.method529(var434);
                            continue;
                        }
                        if (var441 == 5021) {
                            var6--;
                            client.field369 = field722[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var441 == 5022) {
                            field722[var6++] = client.field369;
                            continue;
                        }
                    }
                }
                if (var441 >= 5600 || var441 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var435 = field721[var5];
                int var436 = field721[var5 + 1];
                if (!client.field494) {
                    client.field246 = var435;
                    client.field309 = var436;
                }
            }
        } catch (Exception var440) {
            StringBuilder var438 = new StringBuilder(30);
            var438.append("").append(var4.field2911).append(" ");
            for (int var439 = field723 - 1; var439 >= 0; var439--) {
                var438.append("").append(field724[var439].field194.field2911).append(" ");
            }
            var438.append("").append(var10);
            class139.method2439(var438.toString(), var440);
        }
    }

    @ObfuscatedName("m.f(IS)V")
    public static void method113(int arg0) {
        if (arg0 == -1 || !class157.method1793(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2658[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2620 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field9 = var3.field2620;
                method537(var4, 2000000);
            }
        }
    }
}
