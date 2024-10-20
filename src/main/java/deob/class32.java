package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("aw")
public class class32 {

    @ObfuscatedName("aw.u")
    public static int[] field700 = new int[5];

    @ObfuscatedName("aw.k")
    public static int[][] field701 = new int[5][5000];

    @ObfuscatedName("aw.m")
    public static int[] field699 = new int[1000];

    @ObfuscatedName("aw.t")
    public static String[] field702 = new String[1000];

    @ObfuscatedName("aw.l")
    public static int field703 = 0;

    @ObfuscatedName("aw.f")
    public static class13[] field704 = new class13[50];

    @ObfuscatedName("aw.o")
    public static Calendar field698 = Calendar.getInstance();

    @ObfuscatedName("aw.d")
    public static final String[] field706 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("v.e(Le;B)V")
    public static void method146(class1 arg0) {
        method2429(arg0, 200000);
    }

    @ObfuscatedName("dw.p(Le;II)V")
    public static void method2429(class1 arg0, int arg1) {
        Object[] var2 = arg0.field13;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2141(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field526;
        int[] var9 = var4.field527;
        byte var10 = -1;
        field703 = 0;
        try {
            Statics.field707 = new int[var4.field529];
            int var11 = 0;
            Statics.field695 = new String[var4.field528];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2517;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2518;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2517;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2518;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field11;
                    }
                    Statics.field707[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field695[var12++] = var15;
                }
            }
            int var16 = 0;
            label2525: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var384 = var8[var7];
                if (var384 < 100) {
                    if (var384 == 0) {
                        field699[var5++] = var9[var7];
                        continue;
                    }
                    if (var384 == 1) {
                        int var17 = var9[var7];
                        field699[var5++] = class153.field2645[var17];
                        continue;
                    }
                    if (var384 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class153.field2645[var18] = field699[var5];
                        client.method1790(var18);
                        continue;
                    }
                    if (var384 == 3) {
                        field702[var6++] = var4.field530[var7];
                        continue;
                    }
                    if (var384 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var384 == 7) {
                        var5 -= 2;
                        if (field699[var5 + 1] != field699[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 8) {
                        var5 -= 2;
                        if (field699[var5 + 1] == field699[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 9) {
                        var5 -= 2;
                        if (field699[var5] < field699[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 10) {
                        var5 -= 2;
                        if (field699[var5] > field699[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 21) {
                        if (field703 == 0) {
                            return;
                        }
                        class13 var19 = field704[--field703];
                        var4 = var19.field203;
                        var8 = var4.field526;
                        var9 = var4.field527;
                        var7 = var19.field194;
                        Statics.field707 = var19.field195;
                        Statics.field695 = var19.field196;
                        continue;
                    }
                    if (var384 == 25) {
                        int var20 = var9[var7];
                        field699[var5++] = class153.method3431(var20);
                        continue;
                    }
                    if (var384 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field699[var5];
                        class42 var23 = (class42) class42.field967.method3166((long) var21);
                        class42 var24;
                        if (var23 == null) {
                            byte[] var25 = Statics.field972.method2717(14, var21);
                            class42 var26 = new class42();
                            if (var25 != null) {
                                var26.method826(new class107(var25));
                            }
                            class42.field967.method3161(var26, (long) var21);
                            var24 = var26;
                        } else {
                            var24 = var23;
                        }
                        int var28 = var24.field968;
                        int var29 = var24.field969;
                        int var30 = var24.field970;
                        int var31 = class153.field2644[var30 - var29];
                        if (var22 < 0 || var22 > var31) {
                            var22 = 0;
                        }
                        int var32 = var31 << var29;
                        class153.field2645[var28] = class153.field2645[var28] & ~var32 | var22 << var29 & var32;
                        continue;
                    }
                    if (var384 == 31) {
                        var5 -= 2;
                        if (field699[var5] <= field699[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 32) {
                        var5 -= 2;
                        if (field699[var5] >= field699[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var384 == 33) {
                        field699[var5++] = Statics.field707[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var384 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field707[var10001] = field699[var5];
                        continue;
                    }
                    if (var384 == 35) {
                        field702[var6++] = Statics.field695[var9[var7]];
                        continue;
                    }
                    if (var384 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field695[var10001] = field702[var6];
                        continue;
                    }
                    if (var384 == 37) {
                        int var33 = var9[var7];
                        var6 -= var33;
                        String var34 = class196.method793(field702, var6, var33);
                        field702[var6++] = var34;
                        continue;
                    }
                    if (var384 == 38) {
                        var5--;
                        continue;
                    }
                    if (var384 == 39) {
                        var6--;
                        continue;
                    }
                    if (var384 == 40) {
                        int var35 = var9[var7];
                        class19 var36 = class19.method2141(var35);
                        int[] var37 = new int[var36.field529];
                        String[] var38 = new String[var36.field528];
                        for (int var39 = 0; var39 < var36.field525; var39++) {
                            var37[var39] = field699[var5 - var36.field525 + var39];
                        }
                        for (int var40 = 0; var40 < var36.field532; var40++) {
                            var38[var40] = field702[var6 - var36.field532 + var40];
                        }
                        var5 -= var36.field525;
                        var6 -= var36.field532;
                        class13 var41 = new class13();
                        var41.field203 = var4;
                        var41.field194 = var7;
                        var41.field195 = Statics.field707;
                        var41.field196 = Statics.field695;
                        field704[++field703 - 1] = var41;
                        var4 = var36;
                        var8 = var36.field526;
                        var9 = var36.field527;
                        var7 = -1;
                        Statics.field707 = var37;
                        Statics.field695 = var38;
                        continue;
                    }
                    if (var384 == 42) {
                        field699[var5++] = client.field452[var9[var7]];
                        continue;
                    }
                    if (var384 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field452[var10001] = field699[var5];
                        continue;
                    }
                    if (var384 == 44) {
                        int var42 = var9[var7] >> 16;
                        int var43 = var9[var7] & 0xFFFF;
                        var5--;
                        int var44 = field699[var5];
                        if (var44 >= 0 && var44 <= 5000) {
                            field700[var42] = var44;
                            byte var45 = -1;
                            if (var43 == 105) {
                                var45 = 0;
                            }
                            int var46 = 0;
                            while (true) {
                                if (var46 >= var44) {
                                    continue label2525;
                                }
                                field701[var42][var46] = var45;
                                var46++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 45) {
                        int var47 = var9[var7];
                        var5--;
                        int var48 = field699[var5];
                        if (var48 >= 0 && var48 < field700[var47]) {
                            field699[var5++] = field701[var47][var48];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 46) {
                        int var49 = var9[var7];
                        var5 -= 2;
                        int var50 = field699[var5];
                        if (var50 >= 0 && var50 < field700[var49]) {
                            field701[var49][var50] = field699[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var384 == 47) {
                        String var51 = client.field293[var9[var7]];
                        if (var51 == null) {
                            var51 = "null";
                        }
                        field702[var6++] = var51;
                        continue;
                    }
                    if (var384 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field293[var10001] = field702[var6];
                        continue;
                    }
                }
                boolean var52;
                if (var9[var7] == 1) {
                    var52 = true;
                } else {
                    var52 = false;
                }
                if (var384 < 1000) {
                    if (var384 == 100) {
                        var5 -= 3;
                        int var53 = field699[var5];
                        int var54 = field699[var5 + 1];
                        int var55 = field699[var5 + 2];
                        if (var54 == 0) {
                            throw new RuntimeException();
                        }
                        class151 var56 = Statics.method815(var53);
                        if (var56.field2508 == null) {
                            var56.field2508 = new class151[var55 + 1];
                        }
                        if (var56.field2508.length <= var55) {
                            class151[] var57 = new class151[var55 + 1];
                            for (int var58 = 0; var58 < var56.field2508.length; var58++) {
                                var57[var58] = var56.field2508[var58];
                            }
                            var56.field2508 = var57;
                        }
                        if (var55 > 0 && var56.field2508[var55 - 1] == null) {
                            throw new RuntimeException("" + (var55 - 1));
                        }
                        class151 var59 = new class151();
                        var59.field2548 = var54;
                        var59.field2581 = var59.field2517 = var56.field2517;
                        var59.field2518 = var55;
                        var59.field2516 = true;
                        var56.field2508[var55] = var59;
                        if (var52) {
                            Statics.field779 = var59;
                        } else {
                            Statics.field1995 = var59;
                        }
                        Statics.method2431(var56);
                        continue;
                    }
                    if (var384 == 101) {
                        class151 var60 = var52 ? Statics.field779 : Statics.field1995;
                        class151 var61 = Statics.method815(var60.field2517);
                        var61.field2508[var60.field2518] = null;
                        Statics.method2431(var61);
                        continue;
                    }
                    if (var384 == 102) {
                        var5--;
                        class151 var62 = Statics.method815(field699[var5]);
                        var62.field2508 = null;
                        Statics.method2431(var62);
                        continue;
                    }
                    if (var384 == 200) {
                        var5 -= 2;
                        int var63 = field699[var5];
                        int var64 = field699[var5 + 1];
                        class151 var65 = class151.method1422(var63, var64);
                        if (var65 != null && var64 != -1) {
                            field699[var5++] = 1;
                            if (var52) {
                                Statics.field779 = var65;
                            } else {
                                Statics.field1995 = var65;
                            }
                            continue;
                        }
                        field699[var5++] = 0;
                        continue;
                    }
                } else if (!(var384 < 1000 || var384 >= 1100) || !(var384 < 2000 || var384 >= 2100)) {
                    class151 var66;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var66 = Statics.method815(field699[var5]);
                    } else {
                        var66 = var52 ? Statics.field779 : Statics.field1995;
                    }
                    if (var384 == 1000) {
                        var5 -= 2;
                        var66.field2522 = field699[var5];
                        var66.field2601 = field699[var5 + 1];
                        Statics.method2431(var66);
                        continue;
                    }
                    if (var384 == 1001) {
                        var5 -= 2;
                        var66.field2526 = field699[var5];
                        var66.field2527 = field699[var5 + 1];
                        Statics.method2431(var66);
                        continue;
                    }
                    if (var384 == 1003) {
                        var5--;
                        boolean var67 = field699[var5] == 1;
                        if (var66.field2591 != var67) {
                            var66.field2591 = var67;
                            Statics.method2431(var66);
                        }
                        continue;
                    }
                } else if (!(var384 < 1100 || var384 >= 1200) || !(var384 < 2100 || var384 >= 2200)) {
                    class151 var68;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var68 = Statics.method815(field699[var5]);
                    } else {
                        var68 = var52 ? Statics.field779 : Statics.field1995;
                    }
                    if (var384 == 1100) {
                        var5 -= 2;
                        var68.field2530 = field699[var5];
                        if (var68.field2530 > var68.field2625 - var68.field2526) {
                            var68.field2530 = var68.field2625 - var68.field2526;
                        }
                        if (var68.field2530 < 0) {
                            var68.field2530 = 0;
                        }
                        var68.field2619 = field699[var5 + 1];
                        if (var68.field2619 > var68.field2533 - var68.field2527) {
                            var68.field2619 = var68.field2533 - var68.field2527;
                        }
                        if (var68.field2619 < 0) {
                            var68.field2619 = 0;
                        }
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1101) {
                        var5--;
                        var68.field2592 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1102) {
                        var5--;
                        var68.field2519 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1103) {
                        var5--;
                        var68.field2539 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1104) {
                        var5--;
                        var68.field2540 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1105) {
                        var5--;
                        var68.field2541 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1106) {
                        var5--;
                        var68.field2543 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1107) {
                        var5--;
                        var68.field2544 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1108) {
                        var68.field2554 = 1;
                        var5--;
                        var68.field2550 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1109) {
                        var5 -= 6;
                        var68.field2555 = field699[var5];
                        var68.field2556 = field699[var5 + 1];
                        var68.field2557 = field699[var5 + 2];
                        var68.field2558 = field699[var5 + 3];
                        var68.field2607 = field699[var5 + 4];
                        var68.field2604 = field699[var5 + 5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1110) {
                        var5--;
                        int var69 = field699[var5];
                        if (var68.field2553 != var69) {
                            var68.field2553 = var69;
                            var68.field2623 = 0;
                            var68.field2624 = 0;
                            Statics.method2431(var68);
                        }
                        continue;
                    }
                    if (var384 == 1111) {
                        var5--;
                        var68.field2562 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1112) {
                        var6--;
                        String var70 = field702[var6];
                        if (!var70.equals(var68.field2564)) {
                            var68.field2564 = var70;
                            Statics.method2431(var68);
                        }
                        continue;
                    }
                    if (var384 == 1113) {
                        var5--;
                        var68.field2636 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1114) {
                        var5 -= 3;
                        var68.field2567 = field699[var5];
                        var68.field2568 = field699[var5 + 1];
                        var68.field2626 = field699[var5 + 2];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1115) {
                        var5--;
                        var68.field2560 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1116) {
                        var5--;
                        var68.field2545 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1117) {
                        var5--;
                        var68.field2510 = field699[var5];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1118) {
                        var5--;
                        var68.field2547 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1119) {
                        var5--;
                        var68.field2546 = field699[var5] == 1;
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1120) {
                        var5 -= 2;
                        var68.field2625 = field699[var5];
                        var68.field2533 = field699[var5 + 1];
                        Statics.method2431(var68);
                        continue;
                    }
                    if (var384 == 1121) {
                        int var71 = var68.field2517;
                        int var72 = var68.field2518;
                        client.field296.method2374(116);
                        client.field296.method2128(var72);
                        client.field296.method2178(var71);
                        client.field339 = var68;
                        Statics.method2431(var68);
                        continue;
                    }
                } else if (!(var384 < 1200 || var384 >= 1300) || !(var384 < 2200 || var384 >= 2300)) {
                    class151 var73;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var73 = Statics.method815(field699[var5]);
                    } else {
                        var73 = var52 ? Statics.field779 : Statics.field1995;
                    }
                    Statics.method2431(var73);
                    if (var384 == 1200) {
                        var5 -= 2;
                        int var74 = field699[var5];
                        int var75 = field699[var5 + 1];
                        var73.field2600 = var74;
                        var73.field2622 = var75;
                        class45 var76 = class45.method573(var74);
                        var73.field2557 = var76.field1013;
                        var73.field2558 = var76.field1001;
                        var73.field2607 = var76.field1037;
                        var73.field2555 = var76.field1036;
                        var73.field2556 = var76.field1043;
                        var73.field2604 = var76.field1012;
                        if (var73.field2526 > 0) {
                            var73.field2604 = var73.field2604 * 32 / var73.field2526;
                        }
                        continue;
                    }
                    if (var384 == 1201) {
                        var73.field2554 = 2;
                        var5--;
                        var73.field2550 = field699[var5];
                        continue;
                    }
                    if (var384 == 1202) {
                        var73.field2554 = 3;
                        var73.field2550 = Statics.field521.field40.method2940();
                        continue;
                    }
                } else if ((var384 < 1300 || var384 >= 1400) && (var384 < 2300 || var384 >= 2400)) {
                    if (var384 >= 1400 && var384 < 1500 || var384 >= 2400 && var384 < 2500) {
                        class151 var81;
                        if (var384 >= 2000) {
                            var384 -= 1000;
                            var5--;
                            var81 = Statics.method815(field699[var5]);
                        } else {
                            var81 = var52 ? Statics.field779 : Statics.field1995;
                        }
                        var6--;
                        String var82 = field702[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field699[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field699[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field702[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field699[var5]);
                            }
                        }
                        var5--;
                        int var87 = field699[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var384 == 1400) {
                            var81.field2586 = var85;
                        }
                        if (var384 == 1401) {
                            var81.field2583 = var85;
                        }
                        if (var384 == 1402) {
                            var81.field2629 = var85;
                        }
                        if (var384 == 1403) {
                            var81.field2590 = var85;
                        }
                        if (var384 == 1404) {
                            var81.field2531 = var85;
                        }
                        if (var384 == 1405) {
                            var81.field2582 = var85;
                        }
                        if (var384 == 1406) {
                            var81.field2596 = var85;
                        }
                        if (var384 == 1407) {
                            var81.field2593 = var85;
                            var81.field2588 = var83;
                        }
                        if (var384 == 1408) {
                            var81.field2603 = var85;
                        }
                        if (var384 == 1409) {
                            var81.field2509 = var85;
                        }
                        if (var384 == 1410) {
                            var81.field2594 = var85;
                        }
                        if (var384 == 1411) {
                            var81.field2587 = var85;
                        }
                        if (var384 == 1412) {
                            var81.field2627 = var85;
                        }
                        if (var384 == 1414) {
                            var81.field2599 = var85;
                            var81.field2621 = var83;
                        }
                        if (var384 == 1415) {
                            var81.field2532 = var85;
                            var81.field2602 = var83;
                        }
                        if (var384 == 1416) {
                            var81.field2595 = var85;
                        }
                        if (var384 == 1417) {
                            var81.field2605 = var85;
                        }
                        if (var384 == 1418) {
                            var81.field2606 = var85;
                        }
                        if (var384 == 1419) {
                            var81.field2597 = var85;
                        }
                        if (var384 == 1420) {
                            var81.field2608 = var85;
                        }
                        if (var384 == 1421) {
                            var81.field2542 = var85;
                        }
                        if (var384 == 1422) {
                            var81.field2610 = var85;
                        }
                        if (var384 == 1423) {
                            var81.field2611 = var85;
                        }
                        if (var384 == 1424) {
                            var81.field2566 = var85;
                        }
                        var81.field2584 = true;
                        continue;
                    }
                    if (var384 < 1600) {
                        class151 var88 = var52 ? Statics.field779 : Statics.field1995;
                        if (var384 == 1500) {
                            field699[var5++] = var88.field2522;
                            continue;
                        }
                        if (var384 == 1501) {
                            field699[var5++] = var88.field2601;
                            continue;
                        }
                        if (var384 == 1502) {
                            field699[var5++] = var88.field2526;
                            continue;
                        }
                        if (var384 == 1503) {
                            field699[var5++] = var88.field2527;
                            continue;
                        }
                        if (var384 == 1504) {
                            field699[var5++] = var88.field2591 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 1505) {
                            field699[var5++] = var88.field2581;
                            continue;
                        }
                    } else if (var384 < 1700) {
                        class151 var89 = var52 ? Statics.field779 : Statics.field1995;
                        if (var384 == 1600) {
                            field699[var5++] = var89.field2530;
                            continue;
                        }
                        if (var384 == 1601) {
                            field699[var5++] = var89.field2619;
                            continue;
                        }
                        if (var384 == 1602) {
                            field702[var6++] = var89.field2564;
                            continue;
                        }
                        if (var384 == 1603) {
                            field699[var5++] = var89.field2625;
                            continue;
                        }
                        if (var384 == 1604) {
                            field699[var5++] = var89.field2533;
                            continue;
                        }
                        if (var384 == 1605) {
                            field699[var5++] = var89.field2604;
                            continue;
                        }
                        if (var384 == 1606) {
                            field699[var5++] = var89.field2557;
                            continue;
                        }
                        if (var384 == 1607) {
                            field699[var5++] = var89.field2607;
                            continue;
                        }
                        if (var384 == 1608) {
                            field699[var5++] = var89.field2558;
                            continue;
                        }
                    } else if (var384 < 1800) {
                        class151 var90 = var52 ? Statics.field779 : Statics.field1995;
                        if (var384 == 1700) {
                            field699[var5++] = var90.field2600;
                            continue;
                        }
                        if (var384 == 1701) {
                            if (var90.field2600 == -1) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = var90.field2622;
                            }
                            continue;
                        }
                        if (var384 == 1702) {
                            field699[var5++] = var90.field2518;
                            continue;
                        }
                    } else if (var384 < 1900) {
                        class151 var91 = var52 ? Statics.field779 : Statics.field1995;
                        if (var384 == 1800) {
                            int[] var92 = field699;
                            int var93 = var5++;
                            int var94 = client.method2423(var91);
                            int var95 = var94 >> 11 & 0x3F;
                            var92[var93] = var95;
                            continue;
                        }
                        if (var384 == 1801) {
                            var5--;
                            int var96 = field699[var5];
                            int var385 = var96 - 1;
                            if (var91.field2578 != null && var385 < var91.field2578.length && var91.field2578[var385] != null) {
                                field702[var6++] = var91.field2578[var385];
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 1802) {
                            if (var91.field2577 == null) {
                                field702[var6++] = "";
                            } else {
                                field702[var6++] = var91.field2577;
                            }
                            continue;
                        }
                    } else if (var384 < 2600) {
                        var5--;
                        class151 var97 = Statics.method815(field699[var5]);
                        if (var384 == 2500) {
                            field699[var5++] = var97.field2522;
                            continue;
                        }
                        if (var384 == 2501) {
                            field699[var5++] = var97.field2601;
                            continue;
                        }
                        if (var384 == 2502) {
                            field699[var5++] = var97.field2526;
                            continue;
                        }
                        if (var384 == 2503) {
                            field699[var5++] = var97.field2527;
                            continue;
                        }
                        if (var384 == 2504) {
                            field699[var5++] = var97.field2591 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 2505) {
                            field699[var5++] = var97.field2581;
                            continue;
                        }
                    } else if (var384 < 2700) {
                        var5--;
                        class151 var98 = Statics.method815(field699[var5]);
                        if (var384 == 2600) {
                            field699[var5++] = var98.field2530;
                            continue;
                        }
                        if (var384 == 2601) {
                            field699[var5++] = var98.field2619;
                            continue;
                        }
                        if (var384 == 2602) {
                            field702[var6++] = var98.field2564;
                            continue;
                        }
                        if (var384 == 2603) {
                            field699[var5++] = var98.field2625;
                            continue;
                        }
                        if (var384 == 2604) {
                            field699[var5++] = var98.field2533;
                            continue;
                        }
                        if (var384 == 2605) {
                            field699[var5++] = var98.field2604;
                            continue;
                        }
                        if (var384 == 2606) {
                            field699[var5++] = var98.field2557;
                            continue;
                        }
                        if (var384 == 2607) {
                            field699[var5++] = var98.field2607;
                            continue;
                        }
                        if (var384 == 2608) {
                            field699[var5++] = var98.field2558;
                            continue;
                        }
                    } else if (var384 < 2800) {
                        if (var384 == 2700) {
                            var5--;
                            class151 var99 = Statics.method815(field699[var5]);
                            field699[var5++] = var99.field2600;
                            continue;
                        }
                        if (var384 == 2701) {
                            var5--;
                            class151 var100 = Statics.method815(field699[var5]);
                            if (var100.field2600 == -1) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = var100.field2622;
                            }
                            continue;
                        }
                        if (var384 == 2702) {
                            var5--;
                            int var101 = field699[var5];
                            class4 var102 = (class4) client.field488.method3192((long) var101);
                            if (var102 == null) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var384 < 2900) {
                        var5--;
                        class151 var103 = Statics.method815(field699[var5]);
                        if (var384 == 2800) {
                            field699[var5++] = class155.method2575(client.method2423(var103));
                            continue;
                        }
                        if (var384 == 2801) {
                            var5--;
                            int var104 = field699[var5];
                            int var386 = var104 - 1;
                            if (var103.field2578 != null && var386 < var103.field2578.length && var103.field2578[var386] != null) {
                                field702[var6++] = var103.field2578[var386];
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 2802) {
                            if (var103.field2577 == null) {
                                field702[var6++] = "";
                            } else {
                                field702[var6++] = var103.field2577;
                            }
                            continue;
                        }
                    } else if (var384 < 3200) {
                        if (var384 == 3100) {
                            var6--;
                            String var105 = field702[var6];
                            class10.method1607(0, "", var105);
                            continue;
                        }
                        if (var384 == 3101) {
                            var5 -= 2;
                            client.method1981(Statics.field521, field699[var5], field699[var5 + 1]);
                            continue;
                        }
                        if (var384 == 3103) {
                            client.method128();
                            continue;
                        }
                        if (var384 == 3104) {
                            var6--;
                            String var106 = field702[var6];
                            int var107 = 0;
                            if (class196.method2696(var106)) {
                                int var108 = class196.method2963(var106, 10, true);
                                var107 = var108;
                            }
                            client.field296.method2374(188);
                            client.field296.method2130(var107);
                            continue;
                        }
                        if (var384 == 3105) {
                            var6--;
                            String var109 = field702[var6];
                            client.field296.method2374(210);
                            client.field296.method2249(var109.length() + 1);
                            client.field296.method2132(var109);
                            continue;
                        }
                        if (var384 == 3106) {
                            var6--;
                            String var110 = field702[var6];
                            client.field296.method2374(19);
                            client.field296.method2249(var110.length() + 1);
                            client.field296.method2132(var110);
                            continue;
                        }
                        if (var384 == 3107) {
                            var5--;
                            int var111 = field699[var5];
                            var6--;
                            String var112 = field702[var6];
                            client.method522(var111, var112);
                            continue;
                        }
                        if (var384 == 3108) {
                            var5 -= 3;
                            int var113 = field699[var5];
                            int var114 = field699[var5 + 1];
                            int var115 = field699[var5 + 2];
                            class151 var116 = Statics.method815(var115);
                            client.method10(var116, var113, var114);
                            continue;
                        }
                        if (var384 == 3109) {
                            var5 -= 2;
                            int var117 = field699[var5];
                            int var118 = field699[var5 + 1];
                            class151 var119 = var52 ? Statics.field779 : Statics.field1995;
                            client.method10(var119, var117, var118);
                            continue;
                        }
                        if (var384 == 3110) {
                            var5--;
                            Statics.field1475 = field699[var5] == 1;
                            continue;
                        }
                        if (var384 == 3111) {
                            field699[var5++] = Statics.field908.field140 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3112) {
                            var5--;
                            Statics.field908.field140 = field699[var5] == 1;
                            class9.method137();
                            continue;
                        }
                        if (var384 == 3113) {
                            var6--;
                            String var120 = field702[var6];
                            var5--;
                            boolean var121 = field699[var5] == 1;
                            if (!var121) {
                                class125.method13(var120, 3, "openjs");
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var120));
                                    continue;
                                } catch (Exception var382) {
                                }
                            }
                            if (class125.field1993.startsWith("win")) {
                                class125.method13(var120, 0, "openjs");
                            } else if (class125.field1993.startsWith("mac")) {
                                class125.method13(var120, 1, "openjs");
                            } else {
                                class125.method13(var120, 2, "openjs");
                            }
                            continue;
                        }
                    } else if (var384 < 3300) {
                        if (var384 == 3200) {
                            var5 -= 3;
                            int var123 = field699[var5];
                            int var124 = field699[var5 + 1];
                            int var125 = field699[var5 + 2];
                            if (client.field491 != 0 && var124 != 0 && client.field493 < 50) {
                                client.field494[client.field493] = var123;
                                client.field330[client.field493] = var124;
                                client.field496[client.field493] = var125;
                                client.field394[client.field493] = null;
                                client.field497[client.field493] = 0;
                                client.field493++;
                            }
                            continue;
                        }
                        if (var384 == 3201) {
                            var5--;
                            int var126 = field699[var5];
                            if (var126 == -1 && !client.field490) {
                                class160.method2404();
                            } else if (var126 != -1 && client.field489 != var126 && client.field408 != 0 && !client.field490) {
                                class146 var127 = Statics.field2469;
                                int var128 = client.field408;
                                class160.field2695 = 1;
                                Statics.field997 = var127;
                                Statics.field227 = var126;
                                Statics.field2692 = 0;
                                Statics.field1264 = var128;
                                Statics.field709 = false;
                                Statics.field2892 = 2;
                            }
                            client.field489 = var126;
                            continue;
                        }
                        if (var384 == 3202) {
                            var5 -= 2;
                            client.method156(field699[var5], field699[var5 + 1]);
                            continue;
                        }
                    } else if (var384 < 3400) {
                        if (var384 == 3300) {
                            field699[var5++] = client.field265;
                            continue;
                        }
                        if (var384 == 3301) {
                            var5 -= 2;
                            int var129 = field699[var5];
                            int var130 = field699[var5 + 1];
                            int[] var131 = field699;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field209.method3192((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = -1;
                            } else if (var130 >= 0 && var130 < var133.field211.length) {
                                var134 = var133.field211[var130];
                            } else {
                                var134 = -1;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var384 == 3302) {
                            var5 -= 2;
                            int var135 = field699[var5];
                            int var136 = field699[var5 + 1];
                            field699[var5++] = class14.method468(var135, var136);
                            continue;
                        }
                        if (var384 == 3303) {
                            var5 -= 2;
                            int var137 = field699[var5];
                            int var138 = field699[var5 + 1];
                            int[] var139 = field699;
                            int var140 = var5++;
                            class14 var141 = (class14) class14.field209.method3192((long) var137);
                            int var142;
                            if (var141 == null) {
                                var142 = 0;
                            } else if (var138 == -1) {
                                var142 = 0;
                            } else {
                                int var143 = 0;
                                for (int var144 = 0; var144 < var141.field206.length; var144++) {
                                    if (var141.field211[var144] == var138) {
                                        var143 += var141.field206[var144];
                                    }
                                }
                                var142 = var143;
                            }
                            var139[var140] = var142;
                            continue;
                        }
                        if (var384 == 3304) {
                            var5--;
                            int var145 = field699[var5];
                            field699[var5++] = class44.method505(var145).field998;
                            continue;
                        }
                        if (var384 == 3305) {
                            var5--;
                            int var146 = field699[var5];
                            field699[var5++] = client.field313[var146];
                            continue;
                        }
                        if (var384 == 3306) {
                            var5--;
                            int var147 = field699[var5];
                            field699[var5++] = client.field396[var147];
                            continue;
                        }
                        if (var384 == 3307) {
                            var5--;
                            int var148 = field699[var5];
                            field699[var5++] = client.field397[var148];
                            continue;
                        }
                        if (var384 == 3308) {
                            int var149 = Statics.field930;
                            int var150 = (Statics.field521.field729 >> 7) + Statics.field439;
                            int var151 = (Statics.field521.field740 >> 7) + Statics.field88;
                            field699[var5++] = (var149 << 28) + (var150 << 14) + var151;
                            continue;
                        }
                        if (var384 == 3309) {
                            var5--;
                            int var152 = field699[var5];
                            field699[var5++] = var152 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var384 == 3310) {
                            var5--;
                            int var153 = field699[var5];
                            field699[var5++] = var153 >> 28;
                            continue;
                        }
                        if (var384 == 3311) {
                            var5--;
                            int var154 = field699[var5];
                            field699[var5++] = var154 & 0x3FFF;
                            continue;
                        }
                        if (var384 == 3312) {
                            field699[var5++] = client.field259 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3313) {
                            var5 -= 2;
                            int var155 = field699[var5] + 32768;
                            int var156 = field699[var5 + 1];
                            int[] var157 = field699;
                            int var158 = var5++;
                            class14 var159 = (class14) class14.field209.method3192((long) var155);
                            int var160;
                            if (var159 == null) {
                                var160 = -1;
                            } else if (var156 >= 0 && var156 < var159.field211.length) {
                                var160 = var159.field211[var156];
                            } else {
                                var160 = -1;
                            }
                            var157[var158] = var160;
                            continue;
                        }
                        if (var384 == 3314) {
                            var5 -= 2;
                            int var161 = field699[var5] + 32768;
                            int var162 = field699[var5 + 1];
                            field699[var5++] = class14.method468(var161, var162);
                            continue;
                        }
                        if (var384 == 3315) {
                            var5 -= 2;
                            int var163 = field699[var5] + 32768;
                            int var164 = field699[var5 + 1];
                            int[] var165 = field699;
                            int var166 = var5++;
                            class14 var167 = (class14) class14.field209.method3192((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 == -1) {
                                var168 = 0;
                            } else {
                                int var169 = 0;
                                for (int var170 = 0; var170 < var167.field206.length; var170++) {
                                    if (var167.field211[var170] == var164) {
                                        var169 += var167.field206[var170];
                                    }
                                }
                                var168 = var169;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var384 == 3316) {
                            if (client.field424 >= 2) {
                                field699[var5++] = client.field424;
                            } else {
                                field699[var5++] = 0;
                            }
                            continue;
                        }
                        if (var384 == 3317) {
                            field699[var5++] = client.field272;
                            continue;
                        }
                        if (var384 == 3318) {
                            field699[var5++] = client.field255;
                            continue;
                        }
                        if (var384 == 3321) {
                            field699[var5++] = client.field361;
                            continue;
                        }
                        if (var384 == 3322) {
                            field699[var5++] = client.field353;
                            continue;
                        }
                        if (var384 == 3323) {
                            if (client.field426) {
                                field699[var5++] = 1;
                            } else {
                                field699[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var384 < 3500) {
                        if (var384 == 3400) {
                            var5 -= 2;
                            int var171 = field699[var5];
                            int var172 = field699[var5 + 1];
                            class43 var173 = (class43) class43.field981.method3166((long) var171);
                            class43 var174;
                            if (var173 == null) {
                                byte[] var175 = Statics.field977.method2717(8, var171);
                                class43 var176 = new class43();
                                if (var175 != null) {
                                    var176.method837(new class107(var175));
                                }
                                class43.field981.method3161(var176, (long) var171);
                                var174 = var176;
                            } else {
                                var174 = var173;
                            }
                            class43 var177 = var174;
                            if (var174.field983 != 's') {
                            }
                            for (int var178 = 0; var178 < var177.field974; var178++) {
                                if (var177.field988[var178] == var172) {
                                    field702[var6++] = var177.field980[var178];
                                    var177 = null;
                                    break;
                                }
                            }
                            if (var177 != null) {
                                field702[var6++] = var177.field978;
                            }
                            continue;
                        }
                        if (var384 == 3408) {
                            var5 -= 4;
                            int var179 = field699[var5];
                            int var180 = field699[var5 + 1];
                            int var181 = field699[var5 + 2];
                            int var182 = field699[var5 + 3];
                            class43 var183 = (class43) class43.field981.method3166((long) var181);
                            class43 var184;
                            if (var183 == null) {
                                byte[] var185 = Statics.field977.method2717(8, var181);
                                class43 var186 = new class43();
                                if (var185 != null) {
                                    var186.method837(new class107(var185));
                                }
                                class43.field981.method3161(var186, (long) var181);
                                var184 = var186;
                            } else {
                                var184 = var183;
                            }
                            class43 var187 = var184;
                            if (var184.field976 == var179 && var184.field983 == var180) {
                                for (int var188 = 0; var188 < var187.field974; var188++) {
                                    if (var187.field988[var188] == var182) {
                                        if (var180 == 115) {
                                            field702[var6++] = var187.field980[var188];
                                        } else {
                                            field699[var5++] = var187.field975[var188];
                                        }
                                        var187 = null;
                                        break;
                                    }
                                }
                                if (var187 != null) {
                                    if (var180 == 115) {
                                        field702[var6++] = var187.field978;
                                    } else {
                                        field699[var5++] = var187.field979;
                                    }
                                }
                                continue;
                            }
                            if (var180 == 115) {
                                field702[var6++] = "null";
                            } else {
                                field699[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var384 < 3700) {
                        if (var384 == 3600) {
                            if (client.field443 == 0) {
                                field699[var5++] = -2;
                            } else if (client.field443 == 1) {
                                field699[var5++] = -1;
                            } else {
                                field699[var5++] = client.field505;
                            }
                            continue;
                        }
                        if (var384 == 3601) {
                            var5--;
                            int var189 = field699[var5];
                            if (client.field443 == 2 && var189 < client.field505) {
                                field702[var6++] = client.field479[var189].field238;
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 3602) {
                            var5--;
                            int var190 = field699[var5];
                            if (client.field443 == 2 && var190 < client.field505) {
                                field699[var5++] = client.field479[var190].field229;
                                continue;
                            }
                            field699[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3603) {
                            var5--;
                            int var191 = field699[var5];
                            if (client.field443 == 2 && var191 < client.field505) {
                                field699[var5++] = client.field479[var191].field230;
                                continue;
                            }
                            field699[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3604) {
                            var6--;
                            String var192 = field702[var6];
                            var5--;
                            int var193 = field699[var5];
                            client.method493(var192, var193);
                            continue;
                        }
                        if (var384 == 3605) {
                            var6--;
                            String var194 = field702[var6];
                            client.method108(var194);
                            continue;
                        }
                        if (var384 == 3606) {
                            var6--;
                            String var195 = field702[var6];
                            client.method526(var195);
                            continue;
                        }
                        if (var384 == 3607) {
                            var6--;
                            String var196 = field702[var6];
                            client.method114(var196, false);
                            continue;
                        }
                        if (var384 == 3608) {
                            var6--;
                            String var197 = field702[var6];
                            client.method1427(var197);
                            continue;
                        }
                        if (var384 == 3609) {
                            var6--;
                            String var198 = field702[var6];
                            if (var198.startsWith(class2.method510(0)) || var198.startsWith(class2.method510(1))) {
                                var198 = var198.substring(7);
                            }
                            field699[var5++] = client.method855(var198, false) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3611) {
                            if (client.field478 == null) {
                                field702[var6++] = "";
                            } else {
                                String[] var199 = field702;
                                int var200 = var6++;
                                String var201 = client.field478;
                                String var202 = class195.method3312(class195.method696(var201));
                                if (var202 == null) {
                                    var202 = "";
                                }
                                var199[var200] = var202;
                            }
                            continue;
                        }
                        if (var384 == 3612) {
                            if (client.field478 == null) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = Statics.field193;
                            }
                            continue;
                        }
                        if (var384 == 3613) {
                            var5--;
                            int var204 = field699[var5];
                            if (client.field478 != null && var204 < Statics.field193) {
                                field702[var6++] = Statics.field77[var204].field561;
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 3614) {
                            var5--;
                            int var205 = field699[var5];
                            if (client.field478 != null && var205 < Statics.field193) {
                                field699[var5++] = Statics.field77[var205].field554;
                                continue;
                            }
                            field699[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3615) {
                            var5--;
                            int var206 = field699[var5];
                            if (client.field478 != null && var206 < Statics.field193) {
                                field699[var5++] = Statics.field77[var206].field555;
                                continue;
                            }
                            field699[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3616) {
                            field699[var5++] = Statics.field1905;
                            continue;
                        }
                        if (var384 == 3617) {
                            var6--;
                            String var207 = field702[var6];
                            if (Statics.field77 != null) {
                                client.field296.method2374(198);
                                client.field296.method2249(class107.method4(var207));
                                client.field296.method2132(var207);
                            }
                            continue;
                        }
                        if (var384 == 3618) {
                            field699[var5++] = Statics.field1884;
                            continue;
                        }
                        if (var384 == 3619) {
                            var6--;
                            String var208 = field702[var6];
                            client.method2438(var208);
                            continue;
                        }
                        if (var384 == 3620) {
                            client.method761();
                            continue;
                        }
                        if (var384 == 3621) {
                            if (client.field443 == 0) {
                                field699[var5++] = -1;
                            } else {
                                field699[var5++] = client.field509;
                            }
                            continue;
                        }
                        if (var384 == 3622) {
                            var5--;
                            int var209 = field699[var5];
                            if (client.field443 != 0 && var209 < client.field509) {
                                field702[var6++] = client.field308[var209].field136;
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 3623) {
                            var6--;
                            String var210 = field702[var6];
                            if (var210.startsWith(class2.method510(0)) || var210.startsWith(class2.method510(1))) {
                                var210 = var210.substring(7);
                            }
                            field699[var5++] = client.method1865(var210) ? 1 : 0;
                            continue;
                        }
                        if (var384 == 3624) {
                            var5--;
                            int var211 = field699[var5];
                            if (Statics.field77 != null && var211 < Statics.field193 && Statics.field77[var211].field561.equalsIgnoreCase(Statics.field521.field50)) {
                                field699[var5++] = 1;
                                continue;
                            }
                            field699[var5++] = 0;
                            continue;
                        }
                        if (var384 == 3625) {
                            if (client.field395 == null) {
                                field702[var6++] = "";
                            } else {
                                String[] var212 = field702;
                                int var213 = var6++;
                                String var214 = client.field395;
                                String var215 = class195.method3312(class195.method696(var214));
                                if (var215 == null) {
                                    var215 = "";
                                }
                                var212[var213] = var215;
                            }
                            continue;
                        }
                    } else if (var384 < 4100) {
                        if (var384 == 4000) {
                            var5 -= 2;
                            int var217 = field699[var5];
                            int var218 = field699[var5 + 1];
                            field699[var5++] = var217 + var218;
                            continue;
                        }
                        if (var384 == 4001) {
                            var5 -= 2;
                            int var219 = field699[var5];
                            int var220 = field699[var5 + 1];
                            field699[var5++] = var219 - var220;
                            continue;
                        }
                        if (var384 == 4002) {
                            var5 -= 2;
                            int var221 = field699[var5];
                            int var222 = field699[var5 + 1];
                            field699[var5++] = var221 * var222;
                            continue;
                        }
                        if (var384 == 4003) {
                            var5 -= 2;
                            int var223 = field699[var5];
                            int var224 = field699[var5 + 1];
                            field699[var5++] = var223 / var224;
                            continue;
                        }
                        if (var384 == 4004) {
                            var5--;
                            int var225 = field699[var5];
                            field699[var5++] = (int) (Math.random() * (double) var225);
                            continue;
                        }
                        if (var384 == 4005) {
                            var5--;
                            int var226 = field699[var5];
                            field699[var5++] = (int) (Math.random() * (double) (var226 + 1));
                            continue;
                        }
                        if (var384 == 4006) {
                            var5 -= 5;
                            int var227 = field699[var5];
                            int var228 = field699[var5 + 1];
                            int var229 = field699[var5 + 2];
                            int var230 = field699[var5 + 3];
                            int var231 = field699[var5 + 4];
                            field699[var5++] = (var228 - var227) * (var231 - var229) / (var230 - var229) + var227;
                            continue;
                        }
                        if (var384 == 4007) {
                            var5 -= 2;
                            int var232 = field699[var5];
                            int var233 = field699[var5 + 1];
                            field699[var5++] = var232 * var233 / 100 + var232;
                            continue;
                        }
                        if (var384 == 4008) {
                            var5 -= 2;
                            int var234 = field699[var5];
                            int var235 = field699[var5 + 1];
                            field699[var5++] = var234 | 0x1 << var235;
                            continue;
                        }
                        if (var384 == 4009) {
                            var5 -= 2;
                            int var236 = field699[var5];
                            int var237 = field699[var5 + 1];
                            field699[var5++] = var236 & -1 - (0x1 << var237);
                            continue;
                        }
                        if (var384 == 4010) {
                            var5 -= 2;
                            int var238 = field699[var5];
                            int var239 = field699[var5 + 1];
                            field699[var5++] = (var238 & 0x1 << var239) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var384 == 4011) {
                            var5 -= 2;
                            int var240 = field699[var5];
                            int var241 = field699[var5 + 1];
                            field699[var5++] = var240 % var241;
                            continue;
                        }
                        if (var384 == 4012) {
                            var5 -= 2;
                            int var242 = field699[var5];
                            int var243 = field699[var5 + 1];
                            if (var242 == 0) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = (int) Math.pow((double) var242, (double) var243);
                            }
                            continue;
                        }
                        if (var384 == 4013) {
                            var5 -= 2;
                            int var244 = field699[var5];
                            int var245 = field699[var5 + 1];
                            if (var244 == 0) {
                                field699[var5++] = 0;
                            } else if (var245 == 0) {
                                field699[var5++] = Integer.MAX_VALUE;
                            } else {
                                field699[var5++] = (int) Math.pow((double) var244, 1.0D / (double) var245);
                            }
                            continue;
                        }
                        if (var384 == 4014) {
                            var5 -= 2;
                            int var246 = field699[var5];
                            int var247 = field699[var5 + 1];
                            field699[var5++] = var246 & var247;
                            continue;
                        }
                        if (var384 == 4015) {
                            var5 -= 2;
                            int var248 = field699[var5];
                            int var249 = field699[var5 + 1];
                            field699[var5++] = var248 | var249;
                            continue;
                        }
                    } else if (var384 < 4200) {
                        if (var384 == 4100) {
                            var6--;
                            String var250 = field702[var6];
                            var5--;
                            int var251 = field699[var5];
                            field702[var6++] = var250 + var251;
                            continue;
                        }
                        if (var384 == 4101) {
                            var6 -= 2;
                            String var252 = field702[var6];
                            String var253 = field702[var6 + 1];
                            field702[var6++] = var252 + var253;
                            continue;
                        }
                        if (var384 == 4102) {
                            var6--;
                            String var254 = field702[var6];
                            var5--;
                            int var255 = field699[var5];
                            field702[var6++] = var254 + class196.method1425(var255, true);
                            continue;
                        }
                        if (var384 == 4103) {
                            var6--;
                            String var256 = field702[var6];
                            field702[var6++] = var256.toLowerCase();
                            continue;
                        }
                        if (var384 == 4104) {
                            var5--;
                            int var257 = field699[var5];
                            long var258 = ((long) var257 + 11745L) * 86400000L;
                            field698.setTime(new Date(var258));
                            int var260 = field698.get(5);
                            int var261 = field698.get(2);
                            int var262 = field698.get(1);
                            field702[var6++] = var260 + "-" + field706[var261] + "-" + var262;
                            continue;
                        }
                        if (var384 == 4105) {
                            var6 -= 2;
                            String var263 = field702[var6];
                            String var264 = field702[var6 + 1];
                            if (Statics.field521.field40 != null && Statics.field521.field40.field2653) {
                                field702[var6++] = var264;
                                continue;
                            }
                            field702[var6++] = var263;
                            continue;
                        }
                        if (var384 == 4106) {
                            var5--;
                            int var265 = field699[var5];
                            field702[var6++] = Integer.toString(var265);
                            continue;
                        }
                        if (var384 == 4107) {
                            var6 -= 2;
                            field699[var5++] = class196.method3319(Statics.method2078(field702[var6], field702[var6 + 1], client.field261));
                            continue;
                        }
                        if (var384 == 4108) {
                            var6--;
                            String var266 = field702[var6];
                            var5 -= 2;
                            int var267 = field699[var5];
                            int var268 = field699[var5 + 1];
                            byte[] var269 = Statics.field2034.method2717(var268, 0);
                            class190 var270 = new class190(var269);
                            field699[var5++] = var270.method3330(var266, var267);
                            continue;
                        }
                        if (var384 == 4109) {
                            var6--;
                            String var271 = field702[var6];
                            var5 -= 2;
                            int var272 = field699[var5];
                            int var273 = field699[var5 + 1];
                            byte[] var274 = Statics.field2034.method2717(var273, 0);
                            class190 var275 = new class190(var274);
                            field699[var5++] = var275.method3396(var271, var272);
                            continue;
                        }
                        if (var384 == 4110) {
                            var6 -= 2;
                            String var276 = field702[var6];
                            String var277 = field702[var6 + 1];
                            var5--;
                            if (field699[var5] == 1) {
                                field702[var6++] = var276;
                            } else {
                                field702[var6++] = var277;
                            }
                            continue;
                        }
                        if (var384 == 4111) {
                            var6--;
                            String var278 = field702[var6];
                            field702[var6++] = class189.method3331(var278);
                            continue;
                        }
                        if (var384 == 4112) {
                            var6--;
                            String var279 = field702[var6];
                            var5--;
                            int var280 = field699[var5];
                            field702[var6++] = var279 + (char) var280;
                            continue;
                        }
                        if (var384 == 4113) {
                            var5--;
                            int var281 = field699[var5];
                            int[] var282 = field699;
                            int var283 = var5++;
                            char var284 = (char) var281;
                            boolean var285;
                            if (var284 >= ' ' && var284 <= '~') {
                                var285 = true;
                            } else if (var284 >= 160 && var284 <= 255) {
                                var285 = true;
                            } else if (var284 == 8364 || var284 == 338 || var284 == 8212 || var284 == 339 || var284 == 376) {
                                var285 = true;
                            } else {
                                var285 = false;
                            }
                            var282[var283] = var285 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4114) {
                            var5--;
                            int var286 = field699[var5];
                            int[] var287 = field699;
                            int var288 = var5++;
                            char var289 = (char) var286;
                            boolean var290 = var289 >= '0' && var289 <= '9' || var289 >= 'A' && var289 <= 'Z' || var289 >= 'a' && var289 <= 'z';
                            var287[var288] = var290 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4115) {
                            var5--;
                            int var291 = field699[var5];
                            int[] var292 = field699;
                            int var293 = var5++;
                            char var294 = (char) var291;
                            boolean var295 = var294 >= 'A' && var294 <= 'Z' || var294 >= 'a' && var294 <= 'z';
                            var292[var293] = var295 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4116) {
                            var5--;
                            int var296 = field699[var5];
                            int[] var297 = field699;
                            int var298 = var5++;
                            char var299 = (char) var296;
                            boolean var300 = var299 >= '0' && var299 <= '9';
                            var297[var298] = var300 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4117) {
                            var6--;
                            String var301 = field702[var6];
                            if (var301 == null) {
                                field699[var5++] = 0;
                            } else {
                                field699[var5++] = var301.length();
                            }
                            continue;
                        }
                        if (var384 == 4118) {
                            var6--;
                            String var302 = field702[var6];
                            var5 -= 2;
                            int var303 = field699[var5];
                            int var304 = field699[var5 + 1];
                            field702[var6++] = var302.substring(var303, var304);
                            continue;
                        }
                        if (var384 == 4119) {
                            var6--;
                            String var305 = field702[var6];
                            StringBuilder var306 = new StringBuilder(var305.length());
                            boolean var307 = false;
                            for (int var308 = 0; var308 < var305.length(); var308++) {
                                char var309 = var305.charAt(var308);
                                if (var309 == '<') {
                                    var307 = true;
                                } else if (var309 == '>') {
                                    var307 = false;
                                } else if (!var307) {
                                    var306.append(var309);
                                }
                            }
                            field702[var6++] = var306.toString();
                            continue;
                        }
                        if (var384 == 4120) {
                            var6--;
                            String var310 = field702[var6];
                            var5--;
                            int var311 = field699[var5];
                            field699[var5++] = var310.indexOf(var311);
                            continue;
                        }
                        if (var384 == 4121) {
                            var6 -= 2;
                            String var312 = field702[var6];
                            String var313 = field702[var6 + 1];
                            var5--;
                            int var314 = field699[var5];
                            field699[var5++] = var312.indexOf(var313, var314);
                            continue;
                        }
                    } else if (var384 < 4300) {
                        if (var384 == 4200) {
                            var5--;
                            int var315 = field699[var5];
                            field702[var6++] = class45.method573(var315).field999;
                            continue;
                        }
                        if (var384 == 4201) {
                            var5 -= 2;
                            int var316 = field699[var5];
                            int var317 = field699[var5 + 1];
                            class45 var318 = class45.method573(var316);
                            if (var317 >= 1 && var317 <= 5 && var318.field1021[var317 - 1] != null) {
                                field702[var6++] = var318.field1021[var317 - 1];
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 4202) {
                            var5 -= 2;
                            int var319 = field699[var5];
                            int var320 = field699[var5 + 1];
                            class45 var321 = class45.method573(var319);
                            if (var320 >= 1 && var320 <= 5 && var321.field1022[var320 - 1] != null) {
                                field702[var6++] = var321.field1022[var320 - 1];
                                continue;
                            }
                            field702[var6++] = "";
                            continue;
                        }
                        if (var384 == 4203) {
                            var5--;
                            int var322 = field699[var5];
                            field699[var5++] = class45.method573(var322).field1019;
                            continue;
                        }
                        if (var384 == 4204) {
                            var5--;
                            int var323 = field699[var5];
                            field699[var5++] = class45.method573(var323).field1018 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var384 == 4205) {
                            var5--;
                            int var324 = field699[var5];
                            class45 var325 = class45.method573(var324);
                            if (var325.field1038 == -1 && var325.field1023 >= 0) {
                                field699[var5++] = var325.field1023;
                                continue;
                            }
                            field699[var5++] = var324;
                            continue;
                        }
                        if (var384 == 4206) {
                            var5--;
                            int var326 = field699[var5];
                            class45 var327 = class45.method573(var326);
                            if (var327.field1038 >= 0 && var327.field1023 >= 0) {
                                field699[var5++] = var327.field1023;
                                continue;
                            }
                            field699[var5++] = var326;
                            continue;
                        }
                        if (var384 == 4207) {
                            var5--;
                            int var328 = field699[var5];
                            field699[var5++] = class45.method573(var328).field1020 ? 1 : 0;
                            continue;
                        }
                    } else if (var384 < 5100) {
                        if (var384 == 5000) {
                            field699[var5++] = client.field470;
                            continue;
                        }
                        if (var384 == 5001) {
                            var5 -= 3;
                            client.field470 = field699[var5];
                            int var329 = field699[var5 + 1];
                            class117[] var330 = class117.method580();
                            int var331 = 0;
                            class117 var333;
                            while (true) {
                                if (var331 >= var330.length) {
                                    var333 = null;
                                    break;
                                }
                                class117 var332 = var330[var331];
                                if (var332.field1910 == var329) {
                                    var333 = var332;
                                    break;
                                }
                                var331++;
                            }
                            Statics.field625 = var333;
                            if (Statics.field625 == null) {
                                Statics.field625 = class117.field1908;
                            }
                            client.field471 = field699[var5 + 2];
                            client.field296.method2374(2);
                            client.field296.method2249(client.field470);
                            client.field296.method2249(Statics.field625.field1910);
                            client.field296.method2249(client.field471);
                            continue;
                        }
                        if (var384 == 5002) {
                            var6--;
                            String var334 = field702[var6];
                            var5 -= 2;
                            int var335 = field699[var5];
                            int var336 = field699[var5 + 1];
                            client.field296.method2374(204);
                            client.field296.method2249(class107.method4(var334) + 2);
                            client.field296.method2132(var334);
                            client.field296.method2249(var335 - 1);
                            client.field296.method2249(var336);
                            continue;
                        }
                        if (var384 == 5003) {
                            var5 -= 2;
                            int var337 = field699[var5];
                            int var338 = field699[var5 + 1];
                            class24 var339 = (class24) class10.field155.get(var337);
                            class31 var340 = var339.method511(var338);
                            if (var340 == null) {
                                field699[var5++] = -1;
                                field699[var5++] = 0;
                                field702[var6++] = "";
                                field702[var6++] = "";
                                field702[var6++] = "";
                            } else {
                                field699[var5++] = var340.field685;
                                field699[var5++] = var340.field686;
                                field702[var6++] = var340.field693 == null ? "" : var340.field693;
                                field702[var6++] = var340.field689 == null ? "" : var340.field689;
                                field702[var6++] = var340.field690 == null ? "" : var340.field690;
                            }
                            continue;
                        }
                        if (var384 == 5004) {
                            var5--;
                            int var342 = field699[var5];
                            class31 var343 = class10.method80(var342);
                            if (var343 == null) {
                                field699[var5++] = -1;
                                field699[var5++] = 0;
                                field702[var6++] = "";
                                field702[var6++] = "";
                                field702[var6++] = "";
                            } else {
                                field699[var5++] = var343.field687;
                                field699[var5++] = var343.field686;
                                field702[var6++] = var343.field693 == null ? "" : var343.field693;
                                field702[var6++] = var343.field689 == null ? "" : var343.field689;
                                field702[var6++] = var343.field690 == null ? "" : var343.field690;
                            }
                            continue;
                        }
                        if (var384 == 5005) {
                            if (Statics.field625 == null) {
                                field699[var5++] = -1;
                            } else {
                                field699[var5++] = Statics.field625.field1910;
                            }
                            continue;
                        }
                        if (var384 == 5008) {
                            var6--;
                            String var344 = field702[var6];
                            var5--;
                            int var345 = field699[var5];
                            String var346 = var344.toLowerCase();
                            byte var347 = 0;
                            if (var346.startsWith(class142.field2309)) {
                                var347 = 0;
                                var344 = var344.substring(class142.field2309.length());
                            } else if (var346.startsWith(class142.field2198)) {
                                var347 = 1;
                                var344 = var344.substring(class142.field2198.length());
                            } else if (var346.startsWith(class142.field2313)) {
                                var347 = 2;
                                var344 = var344.substring(class142.field2313.length());
                            } else if (var346.startsWith(class142.field2315)) {
                                var347 = 3;
                                var344 = var344.substring(class142.field2315.length());
                            } else if (var346.startsWith(class142.field2338)) {
                                var347 = 4;
                                var344 = var344.substring(class142.field2338.length());
                            } else if (var346.startsWith(class142.field2381)) {
                                var347 = 5;
                                var344 = var344.substring(class142.field2381.length());
                            } else if (var346.startsWith(class142.field2321)) {
                                var347 = 6;
                                var344 = var344.substring(class142.field2321.length());
                            } else if (var346.startsWith(class142.field2323)) {
                                var347 = 7;
                                var344 = var344.substring(class142.field2323.length());
                            } else if (var346.startsWith(class142.field2325)) {
                                var347 = 8;
                                var344 = var344.substring(class142.field2325.length());
                            } else if (var346.startsWith(class142.field2327)) {
                                var347 = 9;
                                var344 = var344.substring(class142.field2327.length());
                            } else if (var346.startsWith(class142.field2329)) {
                                var347 = 10;
                                var344 = var344.substring(class142.field2329.length());
                            } else if (var346.startsWith(class142.field2331)) {
                                var347 = 11;
                                var344 = var344.substring(class142.field2331.length());
                            } else if (client.field261 != 0) {
                                if (var346.startsWith(class142.field2196)) {
                                    var347 = 0;
                                    var344 = var344.substring(class142.field2196.length());
                                } else if (var346.startsWith(class142.field2312)) {
                                    var347 = 1;
                                    var344 = var344.substring(class142.field2312.length());
                                } else if (var346.startsWith(class142.field2314)) {
                                    var347 = 2;
                                    var344 = var344.substring(class142.field2314.length());
                                } else if (var346.startsWith(class142.field2319)) {
                                    var347 = 3;
                                    var344 = var344.substring(class142.field2319.length());
                                } else if (var346.startsWith(class142.field2318)) {
                                    var347 = 4;
                                    var344 = var344.substring(class142.field2318.length());
                                } else if (var346.startsWith(class142.field2204)) {
                                    var347 = 5;
                                    var344 = var344.substring(class142.field2204.length());
                                } else if (var346.startsWith(class142.field2322)) {
                                    var347 = 6;
                                    var344 = var344.substring(class142.field2322.length());
                                } else if (var346.startsWith(class142.field2259)) {
                                    var347 = 7;
                                    var344 = var344.substring(class142.field2259.length());
                                } else if (var346.startsWith(class142.field2205)) {
                                    var347 = 8;
                                    var344 = var344.substring(class142.field2205.length());
                                } else if (var346.startsWith(class142.field2343)) {
                                    var347 = 9;
                                    var344 = var344.substring(class142.field2343.length());
                                } else if (var346.startsWith(class142.field2330)) {
                                    var347 = 10;
                                    var344 = var344.substring(class142.field2330.length());
                                } else if (var346.startsWith(class142.field2350)) {
                                    var347 = 11;
                                    var344 = var344.substring(class142.field2350.length());
                                }
                            }
                            String var348 = var344.toLowerCase();
                            byte var349 = 0;
                            if (var348.startsWith(class142.field2271)) {
                                var349 = 1;
                                var344 = var344.substring(class142.field2271.length());
                            } else if (var348.startsWith(class142.field2335)) {
                                var349 = 2;
                                var344 = var344.substring(class142.field2335.length());
                            } else if (var348.startsWith(class142.field2337)) {
                                var349 = 3;
                                var344 = var344.substring(class142.field2337.length());
                            } else if (var348.startsWith(class142.field2272)) {
                                var349 = 4;
                                var344 = var344.substring(class142.field2272.length());
                            } else if (var348.startsWith(class142.field2341)) {
                                var349 = 5;
                                var344 = var344.substring(class142.field2341.length());
                            } else if (client.field261 != 0) {
                                if (var348.startsWith(class142.field2295)) {
                                    var349 = 1;
                                    var344 = var344.substring(class142.field2295.length());
                                } else if (var348.startsWith(class142.field2336)) {
                                    var349 = 2;
                                    var344 = var344.substring(class142.field2336.length());
                                } else if (var348.startsWith(class142.field2279)) {
                                    var349 = 3;
                                    var344 = var344.substring(class142.field2279.length());
                                } else if (var348.startsWith(class142.field2340)) {
                                    var349 = 4;
                                    var344 = var344.substring(class142.field2340.length());
                                } else if (var348.startsWith(class142.field2342)) {
                                    var349 = 5;
                                    var344 = var344.substring(class142.field2342.length());
                                }
                            }
                            client.field296.method2374(122);
                            client.field296.method2249(0);
                            int var350 = client.field296.field1841;
                            client.field296.method2249(var345);
                            client.field296.method2249(var347);
                            client.field296.method2249(var349);
                            class110 var351 = client.field296;
                            int var352 = var351.field1841;
                            int var353 = var344.length();
                            byte[] var354 = new byte[var353];
                            for (int var355 = 0; var355 < var353; var355++) {
                                char var356 = var344.charAt(var355);
                                if (var356 > 0 && var356 < 128 || var356 >= 160 && var356 <= 255) {
                                    var354[var355] = (byte) var356;
                                } else if (var356 == 8364) {
                                    var354[var355] = -128;
                                } else if (var356 == 8218) {
                                    var354[var355] = -126;
                                } else if (var356 == 402) {
                                    var354[var355] = -125;
                                } else if (var356 == 8222) {
                                    var354[var355] = -124;
                                } else if (var356 == 8230) {
                                    var354[var355] = -123;
                                } else if (var356 == 8224) {
                                    var354[var355] = -122;
                                } else if (var356 == 8225) {
                                    var354[var355] = -121;
                                } else if (var356 == 710) {
                                    var354[var355] = -120;
                                } else if (var356 == 8240) {
                                    var354[var355] = -119;
                                } else if (var356 == 352) {
                                    var354[var355] = -118;
                                } else if (var356 == 8249) {
                                    var354[var355] = -117;
                                } else if (var356 == 338) {
                                    var354[var355] = -116;
                                } else if (var356 == 381) {
                                    var354[var355] = -114;
                                } else if (var356 == 8216) {
                                    var354[var355] = -111;
                                } else if (var356 == 8217) {
                                    var354[var355] = -110;
                                } else if (var356 == 8220) {
                                    var354[var355] = -109;
                                } else if (var356 == 8221) {
                                    var354[var355] = -108;
                                } else if (var356 == 8226) {
                                    var354[var355] = -107;
                                } else if (var356 == 8211) {
                                    var354[var355] = -106;
                                } else if (var356 == 8212) {
                                    var354[var355] = -105;
                                } else if (var356 == 732) {
                                    var354[var355] = -104;
                                } else if (var356 == 8482) {
                                    var354[var355] = -103;
                                } else if (var356 == 353) {
                                    var354[var355] = -102;
                                } else if (var356 == 8250) {
                                    var354[var355] = -101;
                                } else if (var356 == 339) {
                                    var354[var355] = -100;
                                } else if (var356 == 382) {
                                    var354[var355] = -98;
                                } else if (var356 == 376) {
                                    var354[var355] = -97;
                                } else {
                                    var354[var355] = 63;
                                }
                            }
                            var351.method2139(var354.length);
                            var351.field1841 += Statics.field2869.method2068(var354, 0, var354.length, var351.field1845, var351.field1841);
                            client.field296.method2225(client.field296.field1841 - var350);
                            continue;
                        }
                        if (var384 == 5009) {
                            var6 -= 2;
                            String var359 = field702[var6];
                            String var360 = field702[var6 + 1];
                            client.field296.method2374(36);
                            client.field296.method2128(0);
                            int var361 = client.field296.field1841;
                            client.field296.method2132(var359);
                            class110 var362 = client.field296;
                            int var363 = var362.field1841;
                            int var364 = var360.length();
                            byte[] var365 = new byte[var364];
                            for (int var366 = 0; var366 < var364; var366++) {
                                char var367 = var360.charAt(var366);
                                if (var367 > 0 && var367 < 128 || var367 >= 160 && var367 <= 255) {
                                    var365[var366] = (byte) var367;
                                } else if (var367 == 8364) {
                                    var365[var366] = -128;
                                } else if (var367 == 8218) {
                                    var365[var366] = -126;
                                } else if (var367 == 402) {
                                    var365[var366] = -125;
                                } else if (var367 == 8222) {
                                    var365[var366] = -124;
                                } else if (var367 == 8230) {
                                    var365[var366] = -123;
                                } else if (var367 == 8224) {
                                    var365[var366] = -122;
                                } else if (var367 == 8225) {
                                    var365[var366] = -121;
                                } else if (var367 == 710) {
                                    var365[var366] = -120;
                                } else if (var367 == 8240) {
                                    var365[var366] = -119;
                                } else if (var367 == 352) {
                                    var365[var366] = -118;
                                } else if (var367 == 8249) {
                                    var365[var366] = -117;
                                } else if (var367 == 338) {
                                    var365[var366] = -116;
                                } else if (var367 == 381) {
                                    var365[var366] = -114;
                                } else if (var367 == 8216) {
                                    var365[var366] = -111;
                                } else if (var367 == 8217) {
                                    var365[var366] = -110;
                                } else if (var367 == 8220) {
                                    var365[var366] = -109;
                                } else if (var367 == 8221) {
                                    var365[var366] = -108;
                                } else if (var367 == 8226) {
                                    var365[var366] = -107;
                                } else if (var367 == 8211) {
                                    var365[var366] = -106;
                                } else if (var367 == 8212) {
                                    var365[var366] = -105;
                                } else if (var367 == 732) {
                                    var365[var366] = -104;
                                } else if (var367 == 8482) {
                                    var365[var366] = -103;
                                } else if (var367 == 353) {
                                    var365[var366] = -102;
                                } else if (var367 == 8250) {
                                    var365[var366] = -101;
                                } else if (var367 == 339) {
                                    var365[var366] = -100;
                                } else if (var367 == 382) {
                                    var365[var366] = -98;
                                } else if (var367 == 376) {
                                    var365[var366] = -97;
                                } else {
                                    var365[var366] = 63;
                                }
                            }
                            var362.method2139(var365.length);
                            var362.field1841 += Statics.field2869.method2068(var365, 0, var365.length, var362.field1845, var362.field1841);
                            client.field296.method2137(client.field296.field1841 - var361);
                            continue;
                        }
                        if (var384 == 5015) {
                            String var370;
                            if (Statics.field521 == null || Statics.field521.field50 == null) {
                                var370 = "";
                            } else {
                                var370 = Statics.field521.field50;
                            }
                            field702[var6++] = var370;
                            continue;
                        }
                        if (var384 == 5016) {
                            field699[var5++] = client.field471;
                            continue;
                        }
                        if (var384 == 5017) {
                            var5--;
                            int var371 = field699[var5];
                            int[] var372 = field699;
                            int var373 = var5++;
                            class24 var374 = (class24) class10.field155.get(var371);
                            int var375;
                            if (var374 == null) {
                                var375 = 0;
                            } else {
                                var375 = var374.method514();
                            }
                            var372[var373] = var375;
                            continue;
                        }
                        if (var384 == 5018) {
                            var5--;
                            int var376 = field699[var5];
                            field699[var5++] = class10.method598(var376);
                            continue;
                        }
                        if (var384 == 5019) {
                            var5--;
                            int var377 = field699[var5];
                            field699[var5++] = class10.method2527(var377);
                            continue;
                        }
                        if (var384 == 5020) {
                            var6--;
                            String var378 = field702[var6];
                            if (var378.equalsIgnoreCase("toggleroof")) {
                                Statics.field908.field140 = !Statics.field908.field140;
                                class9.method137();
                                if (Statics.field908.field140) {
                                    class10.method1607(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method1607(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field424 >= 2) {
                                if (var378.equalsIgnoreCase("fpson")) {
                                    client.field271 = true;
                                }
                                if (var378.equalsIgnoreCase("fpsoff")) {
                                    client.field271 = false;
                                }
                                if (var378.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var378.equalsIgnoreCase("clientdrop")) {
                                    if (client.field510 > 0) {
                                        client.method722();
                                    } else {
                                        client.method1871(40);
                                        Statics.field387 = Statics.field18;
                                        Statics.field18 = null;
                                    }
                                }
                                if (var378.equalsIgnoreCase("errortest") && client.field257 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field296.method2374(254);
                            client.field296.method2249(var378.length() + 1);
                            client.field296.method2132(var378);
                            continue;
                        }
                    }
                } else {
                    class151 var77;
                    if (var384 >= 2000) {
                        var384 -= 1000;
                        var5--;
                        var77 = Statics.method815(field699[var5]);
                    } else {
                        var77 = var52 ? Statics.field779 : Statics.field1995;
                    }
                    if (var384 == 1300) {
                        var5--;
                        int var78 = field699[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method2856(var78, field702[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var384 == 1301) {
                        var5 -= 2;
                        int var79 = field699[var5];
                        int var80 = field699[var5 + 1];
                        var77.field2579 = class151.method1422(var79, var80);
                        continue;
                    }
                    if (var384 == 1302) {
                        var5--;
                        var77.field2635 = field699[var5] == 1;
                        continue;
                    }
                    if (var384 == 1303) {
                        var5--;
                        var77.field2632 = field699[var5];
                        continue;
                    }
                    if (var384 == 1304) {
                        var5--;
                        var77.field2512 = field699[var5];
                        continue;
                    }
                    if (var384 == 1305) {
                        var6--;
                        var77.field2577 = field702[var6];
                        continue;
                    }
                    if (var384 == 1306) {
                        var6--;
                        var77.field2598 = field702[var6];
                        continue;
                    }
                    if (var384 == 1307) {
                        var77.field2578 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var383) {
            StringBuilder var380 = new StringBuilder(30);
            var380.append("").append(var4.field2843).append(" ");
            for (int var381 = field703 - 1; var381 >= 0; var381--) {
                var380.append("").append(field704[var381].field203.field2843).append(" ");
            }
            var380.append("").append(var10);
            class135.method95(var380.toString(), var383);
        }
    }
}
