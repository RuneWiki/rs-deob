package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class32 {

    @ObfuscatedName("ac.k")
    public static int[] field703 = new int[5];

    @ObfuscatedName("ac.m")
    public static int[][] field704 = new int[5][5000];

    @ObfuscatedName("ac.i")
    public static int[] field711 = new int[1000];

    @ObfuscatedName("ac.t")
    public static String[] field706 = new String[1000];

    @ObfuscatedName("ac.l")
    public static int field707 = 0;

    @ObfuscatedName("ac.p")
    public static class13[] field702 = new class13[50];

    @ObfuscatedName("ac.c")
    public static Calendar field710 = Calendar.getInstance();

    @ObfuscatedName("ac.q")
    public static final String[] field705 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.g(Lg;I)V")
    public static void method1819(class1 arg0) {
        method1569(arg0, 200000);
    }

    @ObfuscatedName("bh.s(Lg;II)V")
    public static void method1569(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method151(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field530;
        int[] var9 = var4.field532;
        byte var10 = -1;
        field707 = 0;
        try {
            Statics.field709 = new int[var4.field534];
            int var11 = 0;
            Statics.field2909 = new String[var4.field535];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2554;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2551;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2554;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2551;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field1;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field709[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field4;
                    }
                    Statics.field2909[var12++] = var15;
                }
            }
            int var16 = 0;
            label2491: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var421 = var8[var7];
                if (var421 < 100) {
                    if (var421 == 0) {
                        field711[var5++] = var9[var7];
                        continue;
                    }
                    if (var421 == 1) {
                        int var17 = var9[var7];
                        field711[var5++] = class155.field2680[var17];
                        continue;
                    }
                    if (var421 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class155.field2680[var18] = field711[var5];
                        client.method523(var18);
                        continue;
                    }
                    if (var421 == 3) {
                        field706[var6++] = var4.field536[var7];
                        continue;
                    }
                    if (var421 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var421 == 7) {
                        var5 -= 2;
                        if (field711[var5 + 1] != field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 8) {
                        var5 -= 2;
                        if (field711[var5 + 1] == field711[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 9) {
                        var5 -= 2;
                        if (field711[var5] < field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 10) {
                        var5 -= 2;
                        if (field711[var5] > field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 21) {
                        if (field707 == 0) {
                            return;
                        }
                        class13 var19 = field702[--field707];
                        var4 = var19.field199;
                        var8 = var4.field530;
                        var9 = var4.field532;
                        var7 = var19.field192;
                        Statics.field709 = var19.field193;
                        Statics.field2909 = var19.field194;
                        continue;
                    }
                    if (var421 == 25) {
                        int var20 = var9[var7];
                        field711[var5++] = class155.method2637(var20);
                        continue;
                    }
                    if (var421 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class155.method815(var21, field711[var5]);
                        continue;
                    }
                    if (var421 == 31) {
                        var5 -= 2;
                        if (field711[var5] <= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 32) {
                        var5 -= 2;
                        if (field711[var5] >= field711[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var421 == 33) {
                        field711[var5++] = Statics.field709[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var421 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field709[var10001] = field711[var5];
                        continue;
                    }
                    if (var421 == 35) {
                        field706[var6++] = Statics.field2909[var9[var7]];
                        continue;
                    }
                    if (var421 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field2909[var10001] = field706[var6];
                        continue;
                    }
                    if (var421 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class200.method3450(field706, var6, var22);
                        field706[var6++] = var23;
                        continue;
                    }
                    if (var421 == 38) {
                        var5--;
                        continue;
                    }
                    if (var421 == 39) {
                        var6--;
                        continue;
                    }
                    if (var421 == 40) {
                        int var24 = var9[var7];
                        class19 var25 = class19.method151(var24);
                        int[] var26 = new int[var25.field534];
                        String[] var27 = new String[var25.field535];
                        for (int var28 = 0; var28 < var25.field541; var28++) {
                            var26[var28] = field711[var5 - var25.field541 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field539; var29++) {
                            var27[var29] = field706[var6 - var25.field539 + var29];
                        }
                        var5 -= var25.field541;
                        var6 -= var25.field539;
                        class13 var30 = new class13();
                        var30.field199 = var4;
                        var30.field192 = var7;
                        var30.field193 = Statics.field709;
                        var30.field194 = Statics.field2909;
                        field702[++field707 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field530;
                        var9 = var25.field532;
                        var7 = -1;
                        Statics.field709 = var26;
                        Statics.field2909 = var27;
                        continue;
                    }
                    if (var421 == 42) {
                        field711[var5++] = client.field375[var9[var7]];
                        continue;
                    }
                    if (var421 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field375[var10001] = field711[var5];
                        continue;
                    }
                    if (var421 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field711[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field703[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2491;
                                }
                                field704[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var421 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field711[var5];
                        if (var37 >= 0 && var37 < field703[var36]) {
                            field711[var5++] = field704[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var421 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field711[var5];
                        if (var39 >= 0 && var39 < field703[var38]) {
                            field704[var38][var39] = field711[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var421 == 47) {
                        String var40 = client.field460[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field706[var6++] = var40;
                        continue;
                    }
                    if (var421 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field460[var10001] = field706[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var421 < 1000) {
                    if (var421 == 100) {
                        var5 -= 3;
                        int var42 = field711[var5];
                        int var43 = field711[var5 + 1];
                        int var44 = field711[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class153 var45 = class153.method117(var42);
                        if (var45.field2658 == null) {
                            var45.field2658 = new class153[var44 + 1];
                        }
                        if (var45.field2658.length <= var44) {
                            class153[] var46 = new class153[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2658.length; var47++) {
                                var46[var47] = var45.field2658[var47];
                            }
                            var45.field2658 = var46;
                        }
                        if (var44 > 0 && var45.field2658[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class153 var48 = new class153();
                        var48.field2552 = var43;
                        var48.field2561 = var48.field2554 = var45.field2554;
                        var48.field2551 = var44;
                        var48.field2612 = true;
                        var45.field2658[var44] = var48;
                        if (var41) {
                            Statics.field713 = var48;
                        } else {
                            Statics.field1462 = var48;
                        }
                        client.method5(var45);
                        continue;
                    }
                    if (var421 == 101) {
                        class153 var49 = var41 ? Statics.field713 : Statics.field1462;
                        class153 var50 = class153.method117(var49.field2554);
                        var50.field2658[var49.field2551] = null;
                        client.method5(var50);
                        continue;
                    }
                    if (var421 == 102) {
                        var5--;
                        class153 var51 = class153.method117(field711[var5]);
                        var51.field2658 = null;
                        client.method5(var51);
                        continue;
                    }
                    if (var421 == 200) {
                        var5 -= 2;
                        int var52 = field711[var5];
                        int var53 = field711[var5 + 1];
                        class153 var54 = class153.method518(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field711[var5++] = 1;
                            if (var41) {
                                Statics.field713 = var54;
                            } else {
                                Statics.field1462 = var54;
                            }
                            continue;
                        }
                        field711[var5++] = 0;
                        continue;
                    }
                } else if (var421 >= 1000 && var421 < 1100 || var421 >= 2000 && var421 < 2100) {
                    class153 var55;
                    if (var421 >= 2000) {
                        var421 -= 1000;
                        var5--;
                        var55 = class153.method117(field711[var5]);
                    } else {
                        var55 = var41 ? Statics.field713 : Statics.field1462;
                    }
                    if (var421 == 1000) {
                        var5 -= 2;
                        var55.field2555 = field711[var5];
                        var55.field2556 = field711[var5 + 1];
                        client.method5(var55);
                        continue;
                    }
                    if (var421 == 1001) {
                        var5 -= 2;
                        var55.field2563 = field711[var5];
                        var55.field2560 = field711[var5 + 1];
                        client.method5(var55);
                        continue;
                    }
                    if (var421 == 1003) {
                        var5--;
                        boolean var56 = field711[var5] == 1;
                        if (var55.field2562 != var56) {
                            var55.field2562 = var56;
                            client.method5(var55);
                        }
                        continue;
                    }
                } else if (!(var421 < 1100 || var421 >= 1200) || !(var421 < 2100 || var421 >= 2200)) {
                    class153 var57;
                    if (var421 >= 2000) {
                        var421 -= 1000;
                        var5--;
                        var57 = class153.method117(field711[var5]);
                    } else {
                        var57 = var41 ? Statics.field713 : Statics.field1462;
                    }
                    if (var421 == 1100) {
                        var5 -= 2;
                        var57.field2596 = field711[var5];
                        if (var57.field2596 > var57.field2565 - var57.field2563) {
                            var57.field2596 = var57.field2565 - var57.field2563;
                        }
                        if (var57.field2596 < 0) {
                            var57.field2596 = 0;
                        }
                        var57.field2546 = field711[var5 + 1];
                        if (var57.field2546 > var57.field2639 - var57.field2560) {
                            var57.field2546 = var57.field2639 - var57.field2560;
                        }
                        if (var57.field2546 < 0) {
                            var57.field2546 = 0;
                        }
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1101) {
                        var5--;
                        var57.field2567 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1102) {
                        var5--;
                        var57.field2571 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1103) {
                        var5--;
                        var57.field2572 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1104) {
                        var5--;
                        var57.field2573 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1105) {
                        var5--;
                        var57.field2600 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1106) {
                        var5--;
                        var57.field2605 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1107) {
                        var5--;
                        var57.field2559 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1108) {
                        var57.field2582 = 1;
                        var5--;
                        var57.field2583 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1109) {
                        var5 -= 6;
                        var57.field2588 = field711[var5];
                        var57.field2589 = field711[var5 + 1];
                        var57.field2590 = field711[var5 + 2];
                        var57.field2591 = field711[var5 + 3];
                        var57.field2592 = field711[var5 + 4];
                        var57.field2593 = field711[var5 + 5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1110) {
                        var5--;
                        int var58 = field711[var5];
                        if (var57.field2608 != var58) {
                            var57.field2608 = var58;
                            var57.field2656 = 0;
                            var57.field2657 = 0;
                            client.method5(var57);
                        }
                        continue;
                    }
                    if (var421 == 1111) {
                        var5--;
                        var57.field2595 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1112) {
                        var6--;
                        String var59 = field706[var6];
                        if (!var59.equals(var57.field2610)) {
                            var57.field2610 = var59;
                            client.method5(var57);
                        }
                        continue;
                    }
                    if (var421 == 1113) {
                        var5--;
                        var57.field2566 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1114) {
                        var5 -= 3;
                        var57.field2540 = field711[var5];
                        var57.field2652 = field711[var5 + 1];
                        var57.field2599 = field711[var5 + 2];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1115) {
                        var5--;
                        var57.field2585 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1116) {
                        var5--;
                        var57.field2627 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1117) {
                        var5--;
                        var57.field2579 = field711[var5];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1118) {
                        var5--;
                        var57.field2602 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1119) {
                        var5--;
                        var57.field2581 = field711[var5] == 1;
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1120) {
                        var5 -= 2;
                        var57.field2565 = field711[var5];
                        var57.field2639 = field711[var5 + 1];
                        client.method5(var57);
                        continue;
                    }
                    if (var421 == 1121) {
                        int var60 = var57.field2554;
                        int var61 = var57.field2551;
                        client.field304.method2306(27);
                        client.field304.method2157(var60);
                        client.field304.method2177(var61);
                        client.field463 = var57;
                        client.method5(var57);
                        continue;
                    }
                } else if (var421 >= 1200 && var421 < 1300 || var421 >= 2200 && var421 < 2300) {
                    class153 var62;
                    if (var421 >= 2000) {
                        var421 -= 1000;
                        var5--;
                        var62 = class153.method117(field711[var5]);
                    } else {
                        var62 = var41 ? Statics.field713 : Statics.field1462;
                    }
                    client.method5(var62);
                    if (var421 == 1200) {
                        var5 -= 2;
                        int var63 = field711[var5];
                        int var64 = field711[var5 + 1];
                        var62.field2576 = var63;
                        var62.field2655 = var64;
                        class45 var65 = class45.method2351(var63);
                        var62.field2590 = var65.field1017;
                        var62.field2591 = var65.field1018;
                        var62.field2592 = var65.field1019;
                        var62.field2588 = var65.field1020;
                        var62.field2589 = var65.field1026;
                        var62.field2593 = var65.field1016;
                        if (var62.field2563 > 0) {
                            var62.field2593 = var62.field2593 * 32 / var62.field2563;
                        }
                        continue;
                    }
                    if (var421 == 1201) {
                        var62.field2582 = 2;
                        var5--;
                        var62.field2583 = field711[var5];
                        continue;
                    }
                    if (var421 == 1202) {
                        var62.field2582 = 3;
                        var62.field2583 = Statics.field1819.field45.method2878();
                        continue;
                    }
                } else if ((var421 < 1300 || var421 >= 1400) && (var421 < 2300 || var421 >= 2400)) {
                    if (var421 >= 1400 && var421 < 1500 || var421 >= 2400 && var421 < 2500) {
                        class153 var70;
                        if (var421 >= 2000) {
                            var421 -= 1000;
                            var5--;
                            var70 = class153.method117(field711[var5]);
                        } else {
                            var70 = var41 ? Statics.field713 : Statics.field1462;
                        }
                        var6--;
                        String var71 = field706[var6];
                        int[] var72 = null;
                        if (var71.length() > 0 && var71.charAt(var71.length() - 1) == 'Y') {
                            var5--;
                            int var73 = field711[var5];
                            if (var73 > 0) {
                                var72 = new int[var73];
                                while (var73-- > 0) {
                                    var5--;
                                    var72[var73] = field711[var5];
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
                                var74[var75] = Integer.valueOf(field711[var5]);
                            }
                        }
                        var5--;
                        int var76 = field711[var5];
                        if (var76 == -1) {
                            var74 = null;
                        } else {
                            var74[0] = Integer.valueOf(var76);
                        }
                        if (var421 == 1400) {
                            var70.field2653 = var74;
                        }
                        if (var421 == 1401) {
                            var70.field2622 = var74;
                        }
                        if (var421 == 1402) {
                            var70.field2664 = var74;
                        }
                        if (var421 == 1403) {
                            var70.field2623 = var74;
                        }
                        if (var421 == 1404) {
                            var70.field2637 = var74;
                        }
                        if (var421 == 1405) {
                            var70.field2597 = var74;
                        }
                        if (var421 == 1406) {
                            var70.field2629 = var74;
                        }
                        if (var421 == 1407) {
                            var70.field2630 = var74;
                            var70.field2631 = var72;
                        }
                        if (var421 == 1408) {
                            var70.field2636 = var74;
                        }
                        if (var421 == 1409) {
                            var70.field2660 = var74;
                        }
                        if (var421 == 1410) {
                            var70.field2601 = var74;
                        }
                        if (var421 == 1411) {
                            var70.field2620 = var74;
                        }
                        if (var421 == 1412) {
                            var70.field2624 = var74;
                        }
                        if (var421 == 1414) {
                            var70.field2584 = var74;
                            var70.field2633 = var72;
                        }
                        if (var421 == 1415) {
                            var70.field2634 = var74;
                            var70.field2635 = var72;
                        }
                        if (var421 == 1416) {
                            var70.field2628 = var74;
                        }
                        if (var421 == 1417) {
                            var70.field2638 = var74;
                        }
                        if (var421 == 1418) {
                            var70.field2580 = var74;
                        }
                        if (var421 == 1419) {
                            var70.field2640 = var74;
                        }
                        if (var421 == 1420) {
                            var70.field2641 = var74;
                        }
                        if (var421 == 1421) {
                            var70.field2642 = var74;
                        }
                        if (var421 == 1422) {
                            var70.field2643 = var74;
                        }
                        if (var421 == 1423) {
                            var70.field2644 = var74;
                        }
                        if (var421 == 1424) {
                            var70.field2645 = var74;
                        }
                        var70.field2654 = true;
                        continue;
                    }
                    if (var421 < 1600) {
                        class153 var77 = var41 ? Statics.field713 : Statics.field1462;
                        if (var421 == 1500) {
                            field711[var5++] = var77.field2555;
                            continue;
                        }
                        if (var421 == 1501) {
                            field711[var5++] = var77.field2556;
                            continue;
                        }
                        if (var421 == 1502) {
                            field711[var5++] = var77.field2563;
                            continue;
                        }
                        if (var421 == 1503) {
                            field711[var5++] = var77.field2560;
                            continue;
                        }
                        if (var421 == 1504) {
                            field711[var5++] = var77.field2562 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 1505) {
                            field711[var5++] = var77.field2561;
                            continue;
                        }
                    } else if (var421 < 1700) {
                        class153 var78 = var41 ? Statics.field713 : Statics.field1462;
                        if (var421 == 1600) {
                            field711[var5++] = var78.field2596;
                            continue;
                        }
                        if (var421 == 1601) {
                            field711[var5++] = var78.field2546;
                            continue;
                        }
                        if (var421 == 1602) {
                            field706[var6++] = var78.field2610;
                            continue;
                        }
                        if (var421 == 1603) {
                            field711[var5++] = var78.field2565;
                            continue;
                        }
                        if (var421 == 1604) {
                            field711[var5++] = var78.field2639;
                            continue;
                        }
                        if (var421 == 1605) {
                            field711[var5++] = var78.field2593;
                            continue;
                        }
                        if (var421 == 1606) {
                            field711[var5++] = var78.field2590;
                            continue;
                        }
                        if (var421 == 1607) {
                            field711[var5++] = var78.field2592;
                            continue;
                        }
                        if (var421 == 1608) {
                            field711[var5++] = var78.field2591;
                            continue;
                        }
                    } else if (var421 < 1800) {
                        class153 var79 = var41 ? Statics.field713 : Statics.field1462;
                        if (var421 == 1700) {
                            field711[var5++] = var79.field2576;
                            continue;
                        }
                        if (var421 == 1701) {
                            if (var79.field2576 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var79.field2655;
                            }
                            continue;
                        }
                        if (var421 == 1702) {
                            field711[var5++] = var79.field2551;
                            continue;
                        }
                    } else if (var421 < 1900) {
                        class153 var80 = var41 ? Statics.field713 : Statics.field1462;
                        if (var421 == 1800) {
                            int[] var81 = field711;
                            int var82 = var5++;
                            int var83 = client.method2036(var80);
                            int var84 = var83 >> 11 & 0x3F;
                            var81[var82] = var84;
                            continue;
                        }
                        if (var421 == 1801) {
                            var5--;
                            int var85 = field711[var5];
                            int var422 = var85 - 1;
                            if (var80.field2611 != null && var422 < var80.field2611.length && var80.field2611[var422] != null) {
                                field706[var6++] = var80.field2611[var422];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 1802) {
                            if (var80.field2621 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var80.field2621;
                            }
                            continue;
                        }
                    } else if (var421 < 2600) {
                        var5--;
                        class153 var86 = class153.method117(field711[var5]);
                        if (var421 == 2500) {
                            field711[var5++] = var86.field2555;
                            continue;
                        }
                        if (var421 == 2501) {
                            field711[var5++] = var86.field2556;
                            continue;
                        }
                        if (var421 == 2502) {
                            field711[var5++] = var86.field2563;
                            continue;
                        }
                        if (var421 == 2503) {
                            field711[var5++] = var86.field2560;
                            continue;
                        }
                        if (var421 == 2504) {
                            field711[var5++] = var86.field2562 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 2505) {
                            field711[var5++] = var86.field2561;
                            continue;
                        }
                    } else if (var421 < 2700) {
                        var5--;
                        class153 var87 = class153.method117(field711[var5]);
                        if (var421 == 2600) {
                            field711[var5++] = var87.field2596;
                            continue;
                        }
                        if (var421 == 2601) {
                            field711[var5++] = var87.field2546;
                            continue;
                        }
                        if (var421 == 2602) {
                            field706[var6++] = var87.field2610;
                            continue;
                        }
                        if (var421 == 2603) {
                            field711[var5++] = var87.field2565;
                            continue;
                        }
                        if (var421 == 2604) {
                            field711[var5++] = var87.field2639;
                            continue;
                        }
                        if (var421 == 2605) {
                            field711[var5++] = var87.field2593;
                            continue;
                        }
                        if (var421 == 2606) {
                            field711[var5++] = var87.field2590;
                            continue;
                        }
                        if (var421 == 2607) {
                            field711[var5++] = var87.field2592;
                            continue;
                        }
                        if (var421 == 2608) {
                            field711[var5++] = var87.field2591;
                            continue;
                        }
                    } else if (var421 < 2800) {
                        if (var421 == 2700) {
                            var5--;
                            class153 var88 = class153.method117(field711[var5]);
                            field711[var5++] = var88.field2576;
                            continue;
                        }
                        if (var421 == 2701) {
                            var5--;
                            class153 var89 = class153.method117(field711[var5]);
                            if (var89.field2576 == -1) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var89.field2655;
                            }
                            continue;
                        }
                        if (var421 == 2702) {
                            var5--;
                            int var90 = field711[var5];
                            class4 var91 = (class4) client.field385.method3155((long) var90);
                            if (var91 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var421 < 2900) {
                        var5--;
                        class153 var92 = class153.method117(field711[var5]);
                        if (var421 == 2800) {
                            int[] var93 = field711;
                            int var94 = var5++;
                            int var95 = client.method2036(var92);
                            int var96 = var95 >> 11 & 0x3F;
                            var93[var94] = var96;
                            continue;
                        }
                        if (var421 == 2801) {
                            var5--;
                            int var97 = field711[var5];
                            int var423 = var97 - 1;
                            if (var92.field2611 != null && var423 < var92.field2611.length && var92.field2611[var423] != null) {
                                field706[var6++] = var92.field2611[var423];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 2802) {
                            if (var92.field2621 == null) {
                                field706[var6++] = "";
                            } else {
                                field706[var6++] = var92.field2621;
                            }
                            continue;
                        }
                    } else if (var421 < 3200) {
                        if (var421 == 3100) {
                            var6--;
                            String var98 = field706[var6];
                            class10.method1845(0, "", var98);
                            continue;
                        }
                        if (var421 == 3101) {
                            var5 -= 2;
                            client.method2633(Statics.field1819, field711[var5], field711[var5 + 1]);
                            continue;
                        }
                        if (var421 == 3103) {
                            client.method457();
                            continue;
                        }
                        if (var421 == 3104) {
                            var6--;
                            String var99 = field706[var6];
                            int var100 = 0;
                            boolean var101 = class200.method2037(var99, 10, true);
                            if (var101) {
                                var100 = class200.method2630(var99);
                            }
                            client.field304.method2306(134);
                            client.field304.method2082(var100);
                            continue;
                        }
                        if (var421 == 3105) {
                            var6--;
                            String var102 = field706[var6];
                            client.field304.method2306(200);
                            client.field304.method2079(var102.length() + 1);
                            client.field304.method2256(var102);
                            continue;
                        }
                        if (var421 == 3106) {
                            var6--;
                            String var103 = field706[var6];
                            client.field304.method2306(54);
                            client.field304.method2079(var103.length() + 1);
                            client.field304.method2256(var103);
                            continue;
                        }
                        if (var421 == 3107) {
                            var5--;
                            int var104 = field711[var5];
                            var6--;
                            String var105 = field706[var6];
                            boolean var106 = false;
                            for (int var107 = 0; var107 < client.field405; var107++) {
                                class3 var108 = client.field337[client.field384[var107]];
                                if (var108 != null && var108.field39 != null && var108.field39.equalsIgnoreCase(var105)) {
                                    if (var104 == 1) {
                                        client.field304.method2306(26);
                                        client.field304.method2172(client.field384[var107]);
                                        client.field304.method2115(0);
                                    } else if (var104 == 4) {
                                        client.field304.method2306(50);
                                        client.field304.method2177(client.field384[var107]);
                                        client.field304.method2079(0);
                                    } else if (var104 == 6) {
                                        client.field304.method2306(110);
                                        client.field304.method2172(client.field384[var107]);
                                        client.field304.method2115(0);
                                    } else if (var104 == 7) {
                                        client.field304.method2306(40);
                                        client.field304.method2081(0);
                                        client.field304.method2122(client.field384[var107]);
                                    }
                                    var106 = true;
                                    break;
                                }
                            }
                            if (!var106) {
                                class10.method1845(4, "", class143.field2314 + var105);
                            }
                            continue;
                        }
                        if (var421 == 3108) {
                            var5 -= 3;
                            int var109 = field711[var5];
                            int var110 = field711[var5 + 1];
                            int var111 = field711[var5 + 2];
                            class153 var112 = class153.method117(var111);
                            client.method2648(var112, var109, var110);
                            continue;
                        }
                        if (var421 == 3109) {
                            var5 -= 2;
                            int var113 = field711[var5];
                            int var114 = field711[var5 + 1];
                            class153 var115 = var41 ? Statics.field713 : Statics.field1462;
                            client.method2648(var115, var113, var114);
                            continue;
                        }
                        if (var421 == 3110) {
                            var5--;
                            Statics.field2146 = field711[var5] == 1;
                            continue;
                        }
                        if (var421 == 3111) {
                            field711[var5++] = Statics.field939.field136 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 3112) {
                            var5--;
                            Statics.field939.field136 = field711[var5] == 1;
                            class9.method680();
                            continue;
                        }
                        if (var421 == 3113) {
                            var6--;
                            String var116 = field706[var6];
                            var5--;
                            boolean var117 = field711[var5] == 1;
                            class125.method800(var116, var117, false);
                            continue;
                        }
                    } else if (var421 < 3300) {
                        if (var421 == 3200) {
                            var5 -= 3;
                            int var118 = field711[var5];
                            int var119 = field711[var5 + 1];
                            int var120 = field711[var5 + 2];
                            if (client.field434 != 0 && var119 != 0 && client.field295 < 50) {
                                client.field271[client.field295] = var118;
                                client.field502[client.field295] = var119;
                                client.field391[client.field295] = var120;
                                client.field505[client.field295] = null;
                                client.field504[client.field295] = 0;
                                client.field295++;
                            }
                            continue;
                        }
                        if (var421 == 3201) {
                            var5--;
                            client.method1377(field711[var5]);
                            continue;
                        }
                        if (var421 == 3202) {
                            var5 -= 2;
                            client.method2395(field711[var5], field711[var5 + 1]);
                            continue;
                        }
                    } else if (var421 < 3400) {
                        if (var421 == 3300) {
                            field711[var5++] = client.field316;
                            continue;
                        }
                        if (var421 == 3301) {
                            var5 -= 2;
                            int var121 = field711[var5];
                            int var122 = field711[var5 + 1];
                            int[] var123 = field711;
                            int var124 = var5++;
                            class14 var125 = (class14) class14.field208.method3155((long) var121);
                            int var126;
                            if (var125 == null) {
                                var126 = -1;
                            } else if (var122 >= 0 && var122 < var125.field203.length) {
                                var126 = var125.field203[var122];
                            } else {
                                var126 = -1;
                            }
                            var123[var124] = var126;
                            continue;
                        }
                        if (var421 == 3302) {
                            var5 -= 2;
                            int var127 = field711[var5];
                            int var128 = field711[var5 + 1];
                            field711[var5++] = class14.method1835(var127, var128);
                            continue;
                        }
                        if (var421 == 3303) {
                            var5 -= 2;
                            int var129 = field711[var5];
                            int var130 = field711[var5 + 1];
                            int[] var131 = field711;
                            int var132 = var5++;
                            class14 var133 = (class14) class14.field208.method3155((long) var129);
                            int var134;
                            if (var133 == null) {
                                var134 = 0;
                            } else if (var130 == -1) {
                                var134 = 0;
                            } else {
                                int var135 = 0;
                                for (int var136 = 0; var136 < var133.field207.length; var136++) {
                                    if (var133.field203[var136] == var130) {
                                        var135 += var133.field207[var136];
                                    }
                                }
                                var134 = var135;
                            }
                            var131[var132] = var134;
                            continue;
                        }
                        if (var421 == 3304) {
                            var5--;
                            int var137 = field711[var5];
                            int[] var138 = field711;
                            int var139 = var5++;
                            class44 var140 = (class44) class44.field995.method3112((long) var137);
                            class44 var141;
                            if (var140 == null) {
                                byte[] var142 = Statics.field1001.method2703(5, var137);
                                class44 var143 = new class44();
                                if (var142 != null) {
                                    var143.method825(new class107(var142));
                                }
                                class44.field995.method3115(var143, (long) var137);
                                var141 = var143;
                            } else {
                                var141 = var140;
                            }
                            var138[var139] = var141.field996;
                            continue;
                        }
                        if (var421 == 3305) {
                            var5--;
                            int var144 = field711[var5];
                            field711[var5++] = client.field401[var144];
                            continue;
                        }
                        if (var421 == 3306) {
                            var5--;
                            int var145 = field711[var5];
                            field711[var5++] = client.field402[var145];
                            continue;
                        }
                        if (var421 == 3307) {
                            var5--;
                            int var146 = field711[var5];
                            field711[var5++] = client.field492[var146];
                            continue;
                        }
                        if (var421 == 3308) {
                            int var147 = Statics.field235;
                            int var148 = (Statics.field1819.field729 >> 7) + Statics.field256;
                            int var149 = (Statics.field1819.field761 >> 7) + Statics.field879;
                            field711[var5++] = (var147 << 28) + (var148 << 14) + var149;
                            continue;
                        }
                        if (var421 == 3309) {
                            var5--;
                            int var150 = field711[var5];
                            field711[var5++] = var150 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var421 == 3310) {
                            var5--;
                            int var151 = field711[var5];
                            field711[var5++] = var151 >> 28;
                            continue;
                        }
                        if (var421 == 3311) {
                            var5--;
                            int var152 = field711[var5];
                            field711[var5++] = var152 & 0x3FFF;
                            continue;
                        }
                        if (var421 == 3312) {
                            field711[var5++] = client.field458 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 3313) {
                            var5 -= 2;
                            int var153 = field711[var5] + 32768;
                            int var154 = field711[var5 + 1];
                            int[] var155 = field711;
                            int var156 = var5++;
                            class14 var157 = (class14) class14.field208.method3155((long) var153);
                            int var158;
                            if (var157 == null) {
                                var158 = -1;
                            } else if (var154 >= 0 && var154 < var157.field203.length) {
                                var158 = var157.field203[var154];
                            } else {
                                var158 = -1;
                            }
                            var155[var156] = var158;
                            continue;
                        }
                        if (var421 == 3314) {
                            var5 -= 2;
                            int var159 = field711[var5] + 32768;
                            int var160 = field711[var5 + 1];
                            field711[var5++] = class14.method1835(var159, var160);
                            continue;
                        }
                        if (var421 == 3315) {
                            var5 -= 2;
                            int var161 = field711[var5] + 32768;
                            int var162 = field711[var5 + 1];
                            int[] var163 = field711;
                            int var164 = var5++;
                            class14 var165 = (class14) class14.field208.method3155((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = 0;
                            } else if (var162 == -1) {
                                var166 = 0;
                            } else {
                                int var167 = 0;
                                for (int var168 = 0; var168 < var165.field207.length; var168++) {
                                    if (var165.field203[var168] == var162) {
                                        var167 += var165.field207[var168];
                                    }
                                }
                                var166 = var167;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var421 == 3316) {
                            if (client.field435 >= 2) {
                                field711[var5++] = client.field435;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var421 == 3317) {
                            field711[var5++] = client.field280;
                            continue;
                        }
                        if (var421 == 3318) {
                            field711[var5++] = client.field262;
                            continue;
                        }
                        if (var421 == 3321) {
                            field711[var5++] = client.field429;
                            continue;
                        }
                        if (var421 == 3322) {
                            field711[var5++] = client.field431;
                            continue;
                        }
                        if (var421 == 3323) {
                            if (client.field433) {
                                field711[var5++] = 1;
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                        if (var421 == 3324) {
                            field711[var5++] = client.field331;
                            continue;
                        }
                    } else if (var421 < 3500) {
                        if (var421 == 3400) {
                            var5 -= 2;
                            int var169 = field711[var5];
                            int var170 = field711[var5 + 1];
                            class43 var171 = class43.method157(var169);
                            if (var171.field987 != 's') {
                            }
                            for (int var172 = 0; var172 < var171.field990; var172++) {
                                if (var171.field985[var172] == var170) {
                                    field706[var6++] = var171.field989[var172];
                                    var171 = null;
                                    break;
                                }
                            }
                            if (var171 != null) {
                                field706[var6++] = var171.field982;
                            }
                            continue;
                        }
                        if (var421 == 3408) {
                            var5 -= 4;
                            int var173 = field711[var5];
                            int var174 = field711[var5 + 1];
                            int var175 = field711[var5 + 2];
                            int var176 = field711[var5 + 3];
                            class43 var177 = class43.method157(var175);
                            if (var177.field980 == var173 && var177.field987 == var174) {
                                for (int var178 = 0; var178 < var177.field990; var178++) {
                                    if (var177.field985[var178] == var176) {
                                        if (var174 == 115) {
                                            field706[var6++] = var177.field989[var178];
                                        } else {
                                            field711[var5++] = var177.field986[var178];
                                        }
                                        var177 = null;
                                        break;
                                    }
                                }
                                if (var177 != null) {
                                    if (var174 == 115) {
                                        field706[var6++] = var177.field982;
                                    } else {
                                        field711[var5++] = var177.field984;
                                    }
                                }
                                continue;
                            }
                            if (var174 == 115) {
                                field706[var6++] = "null";
                            } else {
                                field711[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var421 < 3700) {
                        if (var421 == 3600) {
                            if (client.field513 == 0) {
                                field711[var5++] = -2;
                            } else if (client.field513 == 1) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field511;
                            }
                            continue;
                        }
                        if (var421 == 3601) {
                            var5--;
                            int var179 = field711[var5];
                            if (client.field513 == 2 && var179 < client.field511) {
                                field706[var6++] = client.field514[var179].field236;
                                field706[var6++] = client.field514[var179].field238;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 3602) {
                            var5--;
                            int var180 = field711[var5];
                            if (client.field513 == 2 && var180 < client.field511) {
                                field711[var5++] = client.field514[var180].field229;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var421 == 3603) {
                            var5--;
                            int var181 = field711[var5];
                            if (client.field513 == 2 && var181 < client.field511) {
                                field711[var5++] = client.field514[var181].field232;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var421 == 3604) {
                            var6--;
                            String var182 = field706[var6];
                            var5--;
                            int var183 = field711[var5];
                            client.method3545(var182, var183);
                            continue;
                        }
                        if (var421 == 3605) {
                            var6--;
                            String var184 = field706[var6];
                            client.method68(var184);
                            continue;
                        }
                        if (var421 == 3606) {
                            var6--;
                            String var185 = field706[var6];
                            if (var185 == null) {
                                continue;
                            }
                            String var186 = class201.method2039(var185, Statics.field70);
                            if (var186 == null) {
                                continue;
                            }
                            int var187 = 0;
                            while (true) {
                                if (var187 >= client.field511) {
                                    continue label2491;
                                }
                                class16 var188 = client.field514[var187];
                                String var189 = var188.field236;
                                String var190 = class201.method2039(var189, Statics.field70);
                                if (class116.method1739(var185, var186, var189, var190)) {
                                    client.field511--;
                                    for (int var191 = var187; var191 < client.field511; var191++) {
                                        client.field514[var191] = client.field514[var191 + 1];
                                    }
                                    client.field456 = client.field448;
                                    client.field304.method2306(224);
                                    client.field304.method2079(class107.method492(var185));
                                    client.field304.method2256(var185);
                                    continue label2491;
                                }
                                var187++;
                            }
                        }
                        if (var421 == 3607) {
                            var6--;
                            String var192 = field706[var6];
                            if (var192 == null) {
                                continue;
                            }
                            if ((client.field516 < 100 || client.field389 == 1) && client.field516 < 400) {
                                String var193 = class201.method2039(var192, Statics.field70);
                                if (var193 == null) {
                                    continue;
                                }
                                for (int var194 = 0; var194 < client.field516; var194++) {
                                    class8 var195 = client.field517[var194];
                                    String var196 = class201.method2039(var195.field133, Statics.field70);
                                    if (var196 != null && var196.equals(var193)) {
                                        class10.method1845(31, "", var192 + class143.field2334);
                                        continue label2491;
                                    }
                                    if (var195.field132 != null) {
                                        String var197 = class201.method2039(var195.field132, Statics.field70);
                                        if (var197 != null && var197.equals(var193)) {
                                            class10.method1845(31, "", var192 + class143.field2334);
                                            continue label2491;
                                        }
                                    }
                                }
                                for (int var198 = 0; var198 < client.field511; var198++) {
                                    class16 var199 = client.field514[var198];
                                    String var200 = class201.method2039(var199.field236, Statics.field70);
                                    if (var200 != null && var200.equals(var193)) {
                                        class10.method1845(31, "", class143.field2339 + var192 + class143.field2340);
                                        continue label2491;
                                    }
                                    if (var199.field238 != null) {
                                        String var201 = class201.method2039(var199.field238, Statics.field70);
                                        if (var201 != null && var201.equals(var193)) {
                                            class10.method1845(31, "", class143.field2339 + var192 + class143.field2340);
                                            continue label2491;
                                        }
                                    }
                                }
                                if (class201.method2039(Statics.field1819.field39, Statics.field70).equals(var193)) {
                                    class10.method1845(31, "", class143.field2391);
                                } else {
                                    client.field304.method2306(82);
                                    client.field304.method2079(class107.method492(var192));
                                    client.field304.method2256(var192);
                                }
                                continue;
                            }
                            class10.method1845(31, "", class143.field2333);
                            continue;
                        }
                        if (var421 == 3608) {
                            var6--;
                            String var202 = field706[var6];
                            if (var202 == null) {
                                continue;
                            }
                            String var203 = class201.method2039(var202, Statics.field70);
                            if (var203 == null) {
                                continue;
                            }
                            int var204 = 0;
                            while (true) {
                                if (var204 >= client.field516) {
                                    continue label2491;
                                }
                                class8 var205 = client.field517[var204];
                                String var206 = var205.field133;
                                String var207 = class201.method2039(var206, Statics.field70);
                                if (class116.method1739(var202, var203, var206, var207)) {
                                    client.field516--;
                                    for (int var208 = var204; var208 < client.field516; var208++) {
                                        client.field517[var208] = client.field517[var208 + 1];
                                    }
                                    client.field456 = client.field448;
                                    client.field304.method2306(162);
                                    client.field304.method2079(class107.method492(var202));
                                    client.field304.method2256(var202);
                                    continue label2491;
                                }
                                var204++;
                            }
                        }
                        if (var421 == 3609) {
                            var6--;
                            String var209 = field706[var6];
                            class138[] var210 = class138.method520();
                            for (int var211 = 0; var211 < var210.length; var211++) {
                                class138 var212 = var210[var211];
                                if (var212.field2120 != -1 && var209.startsWith(class2.method2783(var212.field2120))) {
                                    var209 = var209.substring(6 + Integer.toString(var212.field2120).length());
                                    break;
                                }
                            }
                            field711[var5++] = client.method1738(var209, false) ? 1 : 0;
                            continue;
                        }
                        if (var421 == 3611) {
                            if (client.field485 == null) {
                                field706[var6++] = "";
                            } else {
                                String[] var213 = field706;
                                int var214 = var6++;
                                String var215 = client.field485;
                                String var216 = class199.method568(class199.method1735(var215));
                                if (var216 == null) {
                                    var216 = "";
                                }
                                var213[var214] = var216;
                            }
                            continue;
                        }
                        if (var421 == 3612) {
                            if (client.field485 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = Statics.field32;
                            }
                            continue;
                        }
                        if (var421 == 3613) {
                            var5--;
                            int var218 = field711[var5];
                            if (client.field485 != null && var218 < Statics.field32) {
                                field706[var6++] = Statics.field1778[var218].field566;
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 3614) {
                            var5--;
                            int var219 = field711[var5];
                            if (client.field485 != null && var219 < Statics.field32) {
                                field711[var5++] = Statics.field1778[var219].field563;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var421 == 3615) {
                            var5--;
                            int var220 = field711[var5];
                            if (client.field485 != null && var220 < Statics.field32) {
                                field711[var5++] = Statics.field1778[var220].field564;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var421 == 3616) {
                            field711[var5++] = Statics.field210;
                            continue;
                        }
                        if (var421 == 3617) {
                            var6--;
                            String var221 = field706[var6];
                            if (Statics.field1778 != null) {
                                client.field304.method2306(84);
                                client.field304.method2079(class107.method492(var221));
                                client.field304.method2256(var221);
                            }
                            continue;
                        }
                        if (var421 == 3618) {
                            field711[var5++] = Statics.field2498;
                            continue;
                        }
                        if (var421 == 3619) {
                            var6--;
                            String var222 = field706[var6];
                            client.method3104(var222);
                            continue;
                        }
                        if (var421 == 3620) {
                            client.method141();
                            continue;
                        }
                        if (var421 == 3621) {
                            if (client.field513 == 0) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = client.field516;
                            }
                            continue;
                        }
                        if (var421 == 3622) {
                            var5--;
                            int var223 = field711[var5];
                            if (client.field513 != 0 && var223 < client.field516) {
                                field706[var6++] = client.field517[var223].field133;
                                field706[var6++] = client.field517[var223].field132;
                                continue;
                            }
                            field706[var6++] = "";
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 3623) {
                            var6--;
                            String var224 = field706[var6];
                            if (var224.startsWith(class2.method2783(0)) || var224.startsWith(class2.method2783(1))) {
                                var224 = var224.substring(7);
                            }
                            field711[var5++] = client.method1812(var224) ? 1 : 0;
                            continue;
                        }
                        if (var421 == 3624) {
                            var5--;
                            int var225 = field711[var5];
                            if (Statics.field1778 != null && var225 < Statics.field32 && Statics.field1778[var225].field566.equalsIgnoreCase(Statics.field1819.field39)) {
                                field711[var5++] = 1;
                                continue;
                            }
                            field711[var5++] = 0;
                            continue;
                        }
                        if (var421 == 3625) {
                            if (client.field486 == null) {
                                field706[var6++] = "";
                            } else {
                                String[] var226 = field706;
                                int var227 = var6++;
                                String var228 = client.field486;
                                String var229 = class199.method568(class199.method1735(var228));
                                if (var229 == null) {
                                    var229 = "";
                                }
                                var226[var227] = var229;
                            }
                            continue;
                        }
                    } else if (var421 < 4100) {
                        if (var421 == 4000) {
                            var5 -= 2;
                            int var231 = field711[var5];
                            int var232 = field711[var5 + 1];
                            field711[var5++] = var231 + var232;
                            continue;
                        }
                        if (var421 == 4001) {
                            var5 -= 2;
                            int var233 = field711[var5];
                            int var234 = field711[var5 + 1];
                            field711[var5++] = var233 - var234;
                            continue;
                        }
                        if (var421 == 4002) {
                            var5 -= 2;
                            int var235 = field711[var5];
                            int var236 = field711[var5 + 1];
                            field711[var5++] = var235 * var236;
                            continue;
                        }
                        if (var421 == 4003) {
                            var5 -= 2;
                            int var237 = field711[var5];
                            int var238 = field711[var5 + 1];
                            field711[var5++] = var237 / var238;
                            continue;
                        }
                        if (var421 == 4004) {
                            var5--;
                            int var239 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) var239);
                            continue;
                        }
                        if (var421 == 4005) {
                            var5--;
                            int var240 = field711[var5];
                            field711[var5++] = (int) (Math.random() * (double) (var240 + 1));
                            continue;
                        }
                        if (var421 == 4006) {
                            var5 -= 5;
                            int var241 = field711[var5];
                            int var242 = field711[var5 + 1];
                            int var243 = field711[var5 + 2];
                            int var244 = field711[var5 + 3];
                            int var245 = field711[var5 + 4];
                            field711[var5++] = (var242 - var241) * (var245 - var243) / (var244 - var243) + var241;
                            continue;
                        }
                        if (var421 == 4007) {
                            var5 -= 2;
                            int var246 = field711[var5];
                            int var247 = field711[var5 + 1];
                            field711[var5++] = var246 * var247 / 100 + var246;
                            continue;
                        }
                        if (var421 == 4008) {
                            var5 -= 2;
                            int var248 = field711[var5];
                            int var249 = field711[var5 + 1];
                            field711[var5++] = var248 | 0x1 << var249;
                            continue;
                        }
                        if (var421 == 4009) {
                            var5 -= 2;
                            int var250 = field711[var5];
                            int var251 = field711[var5 + 1];
                            field711[var5++] = var250 & -1 - (0x1 << var251);
                            continue;
                        }
                        if (var421 == 4010) {
                            var5 -= 2;
                            int var252 = field711[var5];
                            int var253 = field711[var5 + 1];
                            field711[var5++] = (var252 & 0x1 << var253) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var421 == 4011) {
                            var5 -= 2;
                            int var254 = field711[var5];
                            int var255 = field711[var5 + 1];
                            field711[var5++] = var254 % var255;
                            continue;
                        }
                        if (var421 == 4012) {
                            var5 -= 2;
                            int var256 = field711[var5];
                            int var257 = field711[var5 + 1];
                            if (var256 == 0) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var256, (double) var257);
                            }
                            continue;
                        }
                        if (var421 == 4013) {
                            var5 -= 2;
                            int var258 = field711[var5];
                            int var259 = field711[var5 + 1];
                            if (var258 == 0) {
                                field711[var5++] = 0;
                            } else if (var259 == 0) {
                                field711[var5++] = Integer.MAX_VALUE;
                            } else {
                                field711[var5++] = (int) Math.pow((double) var258, 1.0D / (double) var259);
                            }
                            continue;
                        }
                        if (var421 == 4014) {
                            var5 -= 2;
                            int var260 = field711[var5];
                            int var261 = field711[var5 + 1];
                            field711[var5++] = var260 & var261;
                            continue;
                        }
                        if (var421 == 4015) {
                            var5 -= 2;
                            int var262 = field711[var5];
                            int var263 = field711[var5 + 1];
                            field711[var5++] = var262 | var263;
                            continue;
                        }
                    } else if (var421 < 4200) {
                        if (var421 == 4100) {
                            var6--;
                            String var264 = field706[var6];
                            var5--;
                            int var265 = field711[var5];
                            field706[var6++] = var264 + var265;
                            continue;
                        }
                        if (var421 == 4101) {
                            var6 -= 2;
                            String var266 = field706[var6];
                            String var267 = field706[var6 + 1];
                            field706[var6++] = var266 + var267;
                            continue;
                        }
                        if (var421 == 4102) {
                            var6--;
                            String var268 = field706[var6];
                            var5--;
                            int var269 = field711[var5];
                            String[] var270 = field706;
                            int var271 = var6++;
                            String var273;
                            if (var269 < 0) {
                                var273 = Integer.toString(var269);
                            } else {
                                int var274 = var269;
                                String var275;
                                if (var269 < 0) {
                                    var275 = Integer.toString(var269, 10);
                                } else {
                                    int var276 = 2;
                                    int var277 = var269 / 10;
                                    while (var277 != 0) {
                                        var277 /= 10;
                                        var276++;
                                    }
                                    char[] var278 = new char[var276];
                                    var278[0] = '+';
                                    for (int var279 = var276 - 1; var279 > 0; var279--) {
                                        int var280 = var274;
                                        var274 /= 10;
                                        int var281 = var280 - var274 * 10;
                                        if (var281 >= 10) {
                                            var278[var279] = (char) (var281 + 87);
                                        } else {
                                            var278[var279] = (char) (var281 + 48);
                                        }
                                    }
                                    var275 = new String(var278);
                                }
                                var273 = var275;
                            }
                            var270[var271] = var268 + var273;
                            continue;
                        }
                        if (var421 == 4103) {
                            var6--;
                            String var282 = field706[var6];
                            field706[var6++] = var282.toLowerCase();
                            continue;
                        }
                        if (var421 == 4104) {
                            var5--;
                            int var283 = field711[var5];
                            long var284 = ((long) var283 + 11745L) * 86400000L;
                            field710.setTime(new Date(var284));
                            int var286 = field710.get(5);
                            int var287 = field710.get(2);
                            int var288 = field710.get(1);
                            field706[var6++] = var286 + "-" + field705[var287] + "-" + var288;
                            continue;
                        }
                        if (var421 == 4105) {
                            var6 -= 2;
                            String var289 = field706[var6];
                            String var290 = field706[var6 + 1];
                            if (Statics.field1819.field45 != null && Statics.field1819.field45.field2692) {
                                field706[var6++] = var290;
                                continue;
                            }
                            field706[var6++] = var289;
                            continue;
                        }
                        if (var421 == 4106) {
                            var5--;
                            int var291 = field711[var5];
                            field706[var6++] = Integer.toString(var291);
                            continue;
                        }
                        if (var421 == 4107) {
                            var6 -= 2;
                            int[] var292 = field711;
                            int var293 = var5++;
                            String var294 = field706[var6];
                            String var295 = field706[var6 + 1];
                            int var296 = client.field268;
                            int var297 = var294.length();
                            int var298 = var295.length();
                            int var299 = 0;
                            int var300 = 0;
                            char var301 = 0;
                            char var302 = 0;
                            int var303;
                            label2328: while (true) {
                                if (var299 - var301 >= var297 && var300 - var302 >= var298) {
                                    int var312 = Math.min(var297, var298);
                                    for (int var313 = 0; var313 < var312; var313++) {
                                        char var316 = var294.charAt(var313);
                                        char var317 = var295.charAt(var313);
                                        if (var316 != var317 && Character.toUpperCase(var316) != Character.toUpperCase(var317)) {
                                            char var318 = Character.toLowerCase(var316);
                                            char var319 = Character.toLowerCase(var317);
                                            if (var318 != var319) {
                                                var303 = class203.method835(var318, var296) - class203.method835(var319, var296);
                                                break label2328;
                                            }
                                        }
                                    }
                                    int var320 = var297 - var298;
                                    if (var320 == 0) {
                                        for (int var321 = 0; var321 < var312; var321++) {
                                            char var322 = var294.charAt(var321);
                                            char var323 = var295.charAt(var321);
                                            if (var322 != var323) {
                                                var303 = class203.method835(var322, var296) - class203.method835(var323, var296);
                                                break label2328;
                                            }
                                        }
                                        var303 = 0;
                                    } else {
                                        var303 = var320;
                                    }
                                    break;
                                }
                                if (var299 - var301 >= var297) {
                                    var303 = -1;
                                    break;
                                }
                                if (var300 - var302 >= var298) {
                                    var303 = 1;
                                    break;
                                }
                                char var304;
                                if (var301 == 0) {
                                    var304 = var294.charAt(var299++);
                                } else {
                                    var304 = var301;
                                    boolean var305 = false;
                                }
                                char var306;
                                if (var302 == 0) {
                                    var306 = var295.charAt(var300++);
                                } else {
                                    var306 = var302;
                                    boolean var307 = false;
                                }
                                var301 = class203.method2369(var304);
                                var302 = class203.method2369(var306);
                                char var308 = class203.method1332(var304, var296);
                                char var309 = class203.method1332(var306, var296);
                                if (var308 != var309 && Character.toUpperCase(var308) != Character.toUpperCase(var309)) {
                                    char var310 = Character.toLowerCase(var308);
                                    char var311 = Character.toLowerCase(var309);
                                    if (var310 != var311) {
                                        var303 = class203.method835(var310, var296) - class203.method835(var311, var296);
                                        break;
                                    }
                                }
                            }
                            byte var325;
                            if (var303 > 0) {
                                var325 = 1;
                            } else if (var303 < 0) {
                                var325 = -1;
                            } else {
                                var325 = 0;
                            }
                            var292[var293] = var325;
                            continue;
                        }
                        if (var421 == 4108) {
                            var6--;
                            String var326 = field706[var6];
                            var5 -= 2;
                            int var327 = field711[var5];
                            int var328 = field711[var5 + 1];
                            byte[] var329 = Statics.field2672.method2703(var328, 0);
                            class194 var330 = new class194(var329);
                            field711[var5++] = var330.method3314(var326, var327);
                            continue;
                        }
                        if (var421 == 4109) {
                            var6--;
                            String var331 = field706[var6];
                            var5 -= 2;
                            int var332 = field711[var5];
                            int var333 = field711[var5 + 1];
                            byte[] var334 = Statics.field2672.method2703(var333, 0);
                            class194 var335 = new class194(var334);
                            field711[var5++] = var335.method3313(var331, var332);
                            continue;
                        }
                        if (var421 == 4110) {
                            var6 -= 2;
                            String var336 = field706[var6];
                            String var337 = field706[var6 + 1];
                            var5--;
                            if (field711[var5] == 1) {
                                field706[var6++] = var336;
                            } else {
                                field706[var6++] = var337;
                            }
                            continue;
                        }
                        if (var421 == 4111) {
                            var6--;
                            String var338 = field706[var6];
                            field706[var6++] = class193.method3315(var338);
                            continue;
                        }
                        if (var421 == 4112) {
                            var6--;
                            String var339 = field706[var6];
                            var5--;
                            int var340 = field711[var5];
                            field706[var6++] = var339 + (char) var340;
                            continue;
                        }
                        if (var421 == 4113) {
                            var5--;
                            int var341 = field711[var5];
                            int[] var342 = field711;
                            int var343 = var5++;
                            char var344 = (char) var341;
                            boolean var345;
                            if (var344 >= ' ' && var344 <= '~') {
                                var345 = true;
                            } else if (var344 >= 160 && var344 <= 255) {
                                var345 = true;
                            } else if (var344 == 8364 || var344 == 338 || var344 == 8212 || var344 == 339 || var344 == 376) {
                                var345 = true;
                            } else {
                                var345 = false;
                            }
                            var342[var343] = var345 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 4114) {
                            var5--;
                            int var346 = field711[var5];
                            field711[var5++] = class200.method512((char) var346) ? 1 : 0;
                            continue;
                        }
                        if (var421 == 4115) {
                            var5--;
                            int var347 = field711[var5];
                            int[] var348 = field711;
                            int var349 = var5++;
                            char var350 = (char) var347;
                            boolean var351 = var350 >= 'A' && var350 <= 'Z' || var350 >= 'a' && var350 <= 'z';
                            var348[var349] = var351 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 4116) {
                            var5--;
                            int var352 = field711[var5];
                            int[] var353 = field711;
                            int var354 = var5++;
                            char var355 = (char) var352;
                            boolean var356 = var355 >= '0' && var355 <= '9';
                            var353[var354] = var356 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 4117) {
                            var6--;
                            String var357 = field706[var6];
                            if (var357 == null) {
                                field711[var5++] = 0;
                            } else {
                                field711[var5++] = var357.length();
                            }
                            continue;
                        }
                        if (var421 == 4118) {
                            var6--;
                            String var358 = field706[var6];
                            var5 -= 2;
                            int var359 = field711[var5];
                            int var360 = field711[var5 + 1];
                            field706[var6++] = var358.substring(var359, var360);
                            continue;
                        }
                        if (var421 == 4119) {
                            var6--;
                            String var361 = field706[var6];
                            StringBuilder var362 = new StringBuilder(var361.length());
                            boolean var363 = false;
                            for (int var364 = 0; var364 < var361.length(); var364++) {
                                char var365 = var361.charAt(var364);
                                if (var365 == '<') {
                                    var363 = true;
                                } else if (var365 == '>') {
                                    var363 = false;
                                } else if (!var363) {
                                    var362.append(var365);
                                }
                            }
                            field706[var6++] = var362.toString();
                            continue;
                        }
                        if (var421 == 4120) {
                            var6--;
                            String var366 = field706[var6];
                            var5--;
                            int var367 = field711[var5];
                            field711[var5++] = var366.indexOf(var367);
                            continue;
                        }
                        if (var421 == 4121) {
                            var6 -= 2;
                            String var368 = field706[var6];
                            String var369 = field706[var6 + 1];
                            var5--;
                            int var370 = field711[var5];
                            field711[var5++] = var368.indexOf(var369, var370);
                            continue;
                        }
                    } else if (var421 < 4300) {
                        if (var421 == 4200) {
                            var5--;
                            int var371 = field711[var5];
                            field706[var6++] = class45.method2351(var371).field1011;
                            continue;
                        }
                        if (var421 == 4201) {
                            var5 -= 2;
                            int var372 = field711[var5];
                            int var373 = field711[var5 + 1];
                            class45 var374 = class45.method2351(var372);
                            if (var373 >= 1 && var373 <= 5 && var374.field1025[var373 - 1] != null) {
                                field706[var6++] = var374.field1025[var373 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 4202) {
                            var5 -= 2;
                            int var375 = field711[var5];
                            int var376 = field711[var5 + 1];
                            class45 var377 = class45.method2351(var375);
                            if (var376 >= 1 && var376 <= 5 && var377.field1034[var376 - 1] != null) {
                                field706[var6++] = var377.field1034[var376 - 1];
                                continue;
                            }
                            field706[var6++] = "";
                            continue;
                        }
                        if (var421 == 4203) {
                            var5--;
                            int var378 = field711[var5];
                            field711[var5++] = class45.method2351(var378).field1006;
                            continue;
                        }
                        if (var421 == 4204) {
                            var5--;
                            int var379 = field711[var5];
                            field711[var5++] = class45.method2351(var379).field1022 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var421 == 4205) {
                            var5--;
                            int var380 = field711[var5];
                            class45 var381 = class45.method2351(var380);
                            if (var381.field1042 == -1 && var381.field1041 >= 0) {
                                field711[var5++] = var381.field1041;
                                continue;
                            }
                            field711[var5++] = var380;
                            continue;
                        }
                        if (var421 == 4206) {
                            var5--;
                            int var382 = field711[var5];
                            class45 var383 = class45.method2351(var382);
                            if (var383.field1042 >= 0 && var383.field1041 >= 0) {
                                field711[var5++] = var383.field1041;
                                continue;
                            }
                            field711[var5++] = var382;
                            continue;
                        }
                        if (var421 == 4207) {
                            var5--;
                            int var384 = field711[var5];
                            field711[var5++] = class45.method2351(var384).field1024 ? 1 : 0;
                            continue;
                        }
                    } else if (var421 < 5100) {
                        if (var421 == 5000) {
                            field711[var5++] = client.field477;
                            continue;
                        }
                        if (var421 == 5001) {
                            var5 -= 3;
                            client.field477 = field711[var5];
                            Statics.field690 = class117.method500(field711[var5 + 1]);
                            if (Statics.field690 == null) {
                                Statics.field690 = class117.field1911;
                            }
                            client.field478 = field711[var5 + 2];
                            client.field304.method2306(116);
                            client.field304.method2079(client.field477);
                            client.field304.method2079(Statics.field690.field1912);
                            client.field304.method2079(client.field478);
                            continue;
                        }
                        if (var421 == 5002) {
                            var6--;
                            String var385 = field706[var6];
                            var5 -= 2;
                            int var386 = field711[var5];
                            int var387 = field711[var5 + 1];
                            client.field304.method2306(150);
                            client.field304.method2079(class107.method492(var385) + 2);
                            client.field304.method2256(var385);
                            client.field304.method2079(var386 - 1);
                            client.field304.method2079(var387);
                            continue;
                        }
                        if (var421 == 5003) {
                            var5 -= 2;
                            int var388 = field711[var5];
                            int var389 = field711[var5 + 1];
                            class31 var390 = class10.method775(var388, var389);
                            if (var390 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field711[var5++] = var390.field696;
                                field711[var5++] = var390.field697;
                                field706[var6++] = var390.field694 == null ? "" : var390.field694;
                                field706[var6++] = var390.field695 == null ? "" : var390.field695;
                                field706[var6++] = var390.field692 == null ? "" : var390.field692;
                            }
                            continue;
                        }
                        if (var421 == 5004) {
                            var5--;
                            int var391 = field711[var5];
                            class31 var392 = (class31) class10.field152.method3181((long) var391);
                            if (var392 == null) {
                                field711[var5++] = -1;
                                field711[var5++] = 0;
                                field706[var6++] = "";
                                field706[var6++] = "";
                                field706[var6++] = "";
                            } else {
                                field711[var5++] = var392.field691;
                                field711[var5++] = var392.field697;
                                field706[var6++] = var392.field694 == null ? "" : var392.field694;
                                field706[var6++] = var392.field695 == null ? "" : var392.field695;
                                field706[var6++] = var392.field692 == null ? "" : var392.field692;
                            }
                            continue;
                        }
                        if (var421 == 5005) {
                            if (Statics.field690 == null) {
                                field711[var5++] = -1;
                            } else {
                                field711[var5++] = Statics.field690.field1912;
                            }
                            continue;
                        }
                        if (var421 == 5008) {
                            var6--;
                            String var394 = field706[var6];
                            var5--;
                            int var395 = field711[var5];
                            String var396 = var394.toLowerCase();
                            byte var397 = 0;
                            if (var396.startsWith(class143.field2264)) {
                                var397 = 0;
                                var394 = var394.substring(class143.field2264.length());
                            } else if (var396.startsWith(class143.field2343)) {
                                var397 = 1;
                                var394 = var394.substring(class143.field2343.length());
                            } else if (var396.startsWith(class143.field2379)) {
                                var397 = 2;
                                var394 = var394.substring(class143.field2379.length());
                            } else if (var396.startsWith(class143.field2347)) {
                                var397 = 3;
                                var394 = var394.substring(class143.field2347.length());
                            } else if (var396.startsWith(class143.field2349)) {
                                var397 = 4;
                                var394 = var394.substring(class143.field2349.length());
                            } else if (var396.startsWith(class143.field2351)) {
                                var397 = 5;
                                var394 = var394.substring(class143.field2351.length());
                            } else if (var396.startsWith(class143.field2337)) {
                                var397 = 6;
                                var394 = var394.substring(class143.field2337.length());
                            } else if (var396.startsWith(class143.field2355)) {
                                var397 = 7;
                                var394 = var394.substring(class143.field2355.length());
                            } else if (var396.startsWith(class143.field2357)) {
                                var397 = 8;
                                var394 = var394.substring(class143.field2357.length());
                            } else if (var396.startsWith(class143.field2176)) {
                                var397 = 9;
                                var394 = var394.substring(class143.field2176.length());
                            } else if (var396.startsWith(class143.field2361)) {
                                var397 = 10;
                                var394 = var394.substring(class143.field2361.length());
                            } else if (var396.startsWith(class143.field2363)) {
                                var397 = 11;
                                var394 = var394.substring(class143.field2363.length());
                            } else if (client.field268 != 0) {
                                if (var396.startsWith(class143.field2386)) {
                                    var397 = 0;
                                    var394 = var394.substring(class143.field2386.length());
                                } else if (var396.startsWith(class143.field2311)) {
                                    var397 = 1;
                                    var394 = var394.substring(class143.field2311.length());
                                } else if (var396.startsWith(class143.field2346)) {
                                    var397 = 2;
                                    var394 = var394.substring(class143.field2346.length());
                                } else if (var396.startsWith(class143.field2260)) {
                                    var397 = 3;
                                    var394 = var394.substring(class143.field2260.length());
                                } else if (var396.startsWith(class143.field2350)) {
                                    var397 = 4;
                                    var394 = var394.substring(class143.field2350.length());
                                } else if (var396.startsWith(class143.field2352)) {
                                    var397 = 5;
                                    var394 = var394.substring(class143.field2352.length());
                                } else if (var396.startsWith(class143.field2354)) {
                                    var397 = 6;
                                    var394 = var394.substring(class143.field2354.length());
                                } else if (var396.startsWith(class143.field2356)) {
                                    var397 = 7;
                                    var394 = var394.substring(class143.field2356.length());
                                } else if (var396.startsWith(class143.field2387)) {
                                    var397 = 8;
                                    var394 = var394.substring(class143.field2387.length());
                                } else if (var396.startsWith(class143.field2360)) {
                                    var397 = 9;
                                    var394 = var394.substring(class143.field2360.length());
                                } else if (var396.startsWith(class143.field2362)) {
                                    var397 = 10;
                                    var394 = var394.substring(class143.field2362.length());
                                } else if (var396.startsWith(class143.field2364)) {
                                    var397 = 11;
                                    var394 = var394.substring(class143.field2364.length());
                                }
                            }
                            String var398 = var394.toLowerCase();
                            byte var399 = 0;
                            if (var398.startsWith(class143.field2365)) {
                                var399 = 1;
                                var394 = var394.substring(class143.field2365.length());
                            } else if (var398.startsWith(class143.field2208)) {
                                var399 = 2;
                                var394 = var394.substring(class143.field2208.length());
                            } else if (var398.startsWith(class143.field2369)) {
                                var399 = 3;
                                var394 = var394.substring(class143.field2369.length());
                            } else if (var398.startsWith(class143.field2371)) {
                                var399 = 4;
                                var394 = var394.substring(class143.field2371.length());
                            } else if (var398.startsWith(class143.field2373)) {
                                var399 = 5;
                                var394 = var394.substring(class143.field2373.length());
                            } else if (client.field268 != 0) {
                                if (var398.startsWith(class143.field2366)) {
                                    var399 = 1;
                                    var394 = var394.substring(class143.field2366.length());
                                } else if (var398.startsWith(class143.field2211)) {
                                    var399 = 2;
                                    var394 = var394.substring(class143.field2211.length());
                                } else if (var398.startsWith(class143.field2370)) {
                                    var399 = 3;
                                    var394 = var394.substring(class143.field2370.length());
                                } else if (var398.startsWith(class143.field2372)) {
                                    var399 = 4;
                                    var394 = var394.substring(class143.field2372.length());
                                } else if (var398.startsWith(class143.field2331)) {
                                    var399 = 5;
                                    var394 = var394.substring(class143.field2331.length());
                                }
                            }
                            client.field304.method2306(176);
                            client.field304.method2079(0);
                            int var400 = client.field304.field1851;
                            client.field304.method2079(var395);
                            client.field304.method2079(var397);
                            client.field304.method2079(var399);
                            class110 var401 = client.field304;
                            int var402 = var401.field1851;
                            byte[] var403 = class202.method3456(var394);
                            var401.method2091(var403.length);
                            var401.field1851 += Statics.field2910.method2030(var403, 0, var403.length, var401.field1854, var401.field1851);
                            client.field304.method2146(client.field304.field1851 - var400);
                            continue;
                        }
                        if (var421 == 5009) {
                            var6 -= 2;
                            String var404 = field706[var6];
                            String var405 = field706[var6 + 1];
                            client.field304.method2306(64);
                            client.field304.method2177(0);
                            int var406 = client.field304.field1851;
                            client.field304.method2256(var404);
                            class110 var407 = client.field304;
                            int var408 = var407.field1851;
                            byte[] var409 = class202.method3456(var405);
                            var407.method2091(var409.length);
                            var407.field1851 += Statics.field2910.method2030(var409, 0, var409.length, var407.field1854, var407.field1851);
                            client.field304.method2077(client.field304.field1851 - var406);
                            continue;
                        }
                        if (var421 == 5015) {
                            String var410;
                            if (Statics.field1819 == null || Statics.field1819.field39 == null) {
                                var410 = "";
                            } else {
                                var410 = Statics.field1819.field39;
                            }
                            field706[var6++] = var410;
                            continue;
                        }
                        if (var421 == 5016) {
                            field711[var5++] = client.field478;
                            continue;
                        }
                        if (var421 == 5017) {
                            var5--;
                            int var411 = field711[var5];
                            field711[var5++] = class10.method148(var411);
                            continue;
                        }
                        if (var421 == 5018) {
                            var5--;
                            int var412 = field711[var5];
                            field711[var5++] = class10.method2744(var412);
                            continue;
                        }
                        if (var421 == 5019) {
                            var5--;
                            int var413 = field711[var5];
                            field711[var5++] = class10.method2034(var413);
                            continue;
                        }
                        if (var421 == 5020) {
                            var6--;
                            String var414 = field706[var6];
                            if (var414.equalsIgnoreCase("toggleroof")) {
                                Statics.field939.field136 = !Statics.field939.field136;
                                class9.method680();
                                if (Statics.field939.field136) {
                                    class10.method1845(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method1845(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field435 >= 2) {
                                if (var414.equalsIgnoreCase("fpson")) {
                                    client.field279 = true;
                                }
                                if (var414.equalsIgnoreCase("fpsoff")) {
                                    client.field279 = false;
                                }
                                if (var414.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var414.equalsIgnoreCase("clientdrop")) {
                                    if (client.field311 > 0) {
                                        client.method813();
                                    } else {
                                        client.method1376(40);
                                        Statics.field303 = Statics.field139;
                                        Statics.field139 = null;
                                    }
                                }
                                if (var414.equalsIgnoreCase("errortest") && client.field264 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field304.method2306(184);
                            client.field304.method2079(var414.length() + 1);
                            client.field304.method2256(var414);
                            continue;
                        }
                    }
                } else {
                    class153 var66;
                    if (var421 >= 2000) {
                        var421 -= 1000;
                        var5--;
                        var66 = class153.method117(field711[var5]);
                    } else {
                        var66 = var41 ? Statics.field713 : Statics.field1462;
                    }
                    if (var421 == 1300) {
                        var5--;
                        int var67 = field711[var5] - 1;
                        if (var67 >= 0 && var67 <= 9) {
                            var6--;
                            var66.method2803(var67, field706[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var421 == 1301) {
                        var5 -= 2;
                        int var68 = field711[var5];
                        int var69 = field711[var5 + 1];
                        var66.field2577 = class153.method518(var68, var69);
                        continue;
                    }
                    if (var421 == 1302) {
                        var5--;
                        var66.field2615 = field711[var5] == 1;
                        continue;
                    }
                    if (var421 == 1303) {
                        var5--;
                        var66.field2564 = field711[var5];
                        continue;
                    }
                    if (var421 == 1304) {
                        var5--;
                        var66.field2614 = field711[var5];
                        continue;
                    }
                    if (var421 == 1305) {
                        var6--;
                        var66.field2621 = field706[var6];
                        continue;
                    }
                    if (var421 == 1306) {
                        var6--;
                        var66.field2626 = field706[var6];
                        continue;
                    }
                    if (var421 == 1307) {
                        var66.field2611 = null;
                        continue;
                    }
                }
                if (var421 >= 5600 || var421 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var415 = field711[var5];
                int var416 = field711[var5 + 1];
                if (!client.field506) {
                    client.field346 = var415;
                    client.field347 = var416;
                }
            }
        } catch (Exception var420) {
            StringBuilder var418 = new StringBuilder(30);
            var418.append("").append(var4.field2884).append(" ");
            for (int var419 = field707 - 1; var419 >= 0; var419--) {
                var418.append("").append(field702[var419].field199.field2884).append(" ");
            }
            var418.append("").append(var10);
            class135.method1813(var418.toString(), var420);
        }
    }

    @ObfuscatedName("j.v(II)V")
    public static void method125(int arg0) {
        if (arg0 == -1 || !class153.method469(arg0)) {
            return;
        }
        class153[] var1 = Statics.field2625[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class153 var3 = var1[var2];
            if (var3.field2618 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field8 = var3.field2618;
                method1569(var4, 2000000);
            }
        }
    }
}
