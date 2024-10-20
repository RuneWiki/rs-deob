package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.t")
    public static int[] field716 = new int[5];

    @ObfuscatedName("ah.z")
    public static int[][] field723 = new int[5][5000];

    @ObfuscatedName("ah.g")
    public static int[] field718 = new int[1000];

    @ObfuscatedName("ah.c")
    public static String[] field719 = new String[1000];

    @ObfuscatedName("ah.o")
    public static int field717 = 0;

    @ObfuscatedName("ah.q")
    public static class13[] field721 = new class13[50];

    @ObfuscatedName("ah.p")
    public static Calendar field722 = Calendar.getInstance();

    @ObfuscatedName("ah.m")
    public static final String[] field720 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.k(Lk;IB)V")
    public static void method563(class1 arg0, int arg1) {
        Object[] var2 = arg0.field8;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method494(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field529;
        int[] var9 = var4.field530;
        byte var10 = -1;
        field717 = 0;
        try {
            Statics.field1683 = new int[var4.field532];
            int var11 = 0;
            Statics.field129 = new String[var4.field540];
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
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2536;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field16;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2650;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2536;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2650;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field10;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field1683[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field18;
                    }
                    Statics.field129[var12++] = var15;
                }
            }
            int var16 = 0;
            label2237: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var331 = var8[var7];
                if (var331 < 100) {
                    if (var331 == 0) {
                        field718[var5++] = var9[var7];
                        continue;
                    }
                    if (var331 == 1) {
                        int var17 = var9[var7];
                        field718[var5++] = class154.field2661[var17];
                        continue;
                    }
                    if (var331 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class154.field2661[var18] = field718[var5];
                        client.method2678(var18);
                        continue;
                    }
                    if (var331 == 3) {
                        field719[var6++] = var4.field531[var7];
                        continue;
                    }
                    if (var331 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var331 == 7) {
                        var5 -= 2;
                        if (field718[var5 + 1] != field718[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 8) {
                        var5 -= 2;
                        if (field718[var5 + 1] == field718[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 9) {
                        var5 -= 2;
                        if (field718[var5] < field718[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 10) {
                        var5 -= 2;
                        if (field718[var5] > field718[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 21) {
                        if (field717 == 0) {
                            return;
                        }
                        class13 var19 = field721[--field717];
                        var4 = var19.field190;
                        var8 = var4.field529;
                        var9 = var4.field530;
                        var7 = var19.field195;
                        Statics.field1683 = var19.field187;
                        Statics.field129 = var19.field189;
                        continue;
                    }
                    if (var331 == 25) {
                        int var20 = var9[var7];
                        field718[var5++] = class154.method2880(var20);
                        continue;
                    }
                    if (var331 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class154.method27(var21, field718[var5]);
                        continue;
                    }
                    if (var331 == 31) {
                        var5 -= 2;
                        if (field718[var5] <= field718[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 32) {
                        var5 -= 2;
                        if (field718[var5] >= field718[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var331 == 33) {
                        field718[var5++] = Statics.field1683[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var331 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1683[var10001] = field718[var5];
                        continue;
                    }
                    if (var331 == 35) {
                        field719[var6++] = Statics.field129[var9[var7]];
                        continue;
                    }
                    if (var331 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field129[var10001] = field719[var6];
                        continue;
                    }
                    if (var331 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String var23 = class199.method2376(field719, var6, var22);
                        field719[var6++] = var23;
                        continue;
                    }
                    if (var331 == 38) {
                        var5--;
                        continue;
                    }
                    if (var331 == 39) {
                        var6--;
                        continue;
                    }
                    if (var331 == 40) {
                        int var24 = var9[var7];
                        class19 var25 = class19.method494(var24);
                        int[] var26 = new int[var25.field532];
                        String[] var27 = new String[var25.field540];
                        for (int var28 = 0; var28 < var25.field534; var28++) {
                            var26[var28] = field718[var5 - var25.field534 + var28];
                        }
                        for (int var29 = 0; var29 < var25.field528; var29++) {
                            var27[var29] = field719[var6 - var25.field528 + var29];
                        }
                        var5 -= var25.field534;
                        var6 -= var25.field528;
                        class13 var30 = new class13();
                        var30.field190 = var4;
                        var30.field195 = var7;
                        var30.field187 = Statics.field1683;
                        var30.field189 = Statics.field129;
                        field721[++field717 - 1] = var30;
                        var4 = var25;
                        var8 = var25.field529;
                        var9 = var25.field530;
                        var7 = -1;
                        Statics.field1683 = var26;
                        Statics.field129 = var27;
                        continue;
                    }
                    if (var331 == 42) {
                        field718[var5++] = client.field454[var9[var7]];
                        continue;
                    }
                    if (var331 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field454[var10001] = field718[var5];
                        continue;
                    }
                    if (var331 == 44) {
                        int var31 = var9[var7] >> 16;
                        int var32 = var9[var7] & 0xFFFF;
                        var5--;
                        int var33 = field718[var5];
                        if (var33 >= 0 && var33 <= 5000) {
                            field716[var31] = var33;
                            byte var34 = -1;
                            if (var32 == 105) {
                                var34 = 0;
                            }
                            int var35 = 0;
                            while (true) {
                                if (var35 >= var33) {
                                    continue label2237;
                                }
                                field723[var31][var35] = var34;
                                var35++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 45) {
                        int var36 = var9[var7];
                        var5--;
                        int var37 = field718[var5];
                        if (var37 >= 0 && var37 < field716[var36]) {
                            field718[var5++] = field723[var36][var37];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 46) {
                        int var38 = var9[var7];
                        var5 -= 2;
                        int var39 = field718[var5];
                        if (var39 >= 0 && var39 < field716[var38]) {
                            field723[var38][var39] = field718[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var331 == 47) {
                        String var40 = client.field446[var9[var7]];
                        if (var40 == null) {
                            var40 = "null";
                        }
                        field719[var6++] = var40;
                        continue;
                    }
                    if (var331 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field446[var10001] = field719[var6];
                        continue;
                    }
                }
                boolean var41;
                if (var9[var7] == 1) {
                    var41 = true;
                } else {
                    var41 = false;
                }
                if (var331 < 1000) {
                    if (var331 == 100) {
                        var5 -= 3;
                        int var42 = field718[var5];
                        int var43 = field718[var5 + 1];
                        int var44 = field718[var5 + 2];
                        if (var43 == 0) {
                            throw new RuntimeException();
                        }
                        class152 var45 = class152.method493(var42);
                        if (var45.field2644 == null) {
                            var45.field2644 = new class152[var44 + 1];
                        }
                        if (var45.field2644.length <= var44) {
                            class152[] var46 = new class152[var44 + 1];
                            for (int var47 = 0; var47 < var45.field2644.length; var47++) {
                                var46[var47] = var45.field2644[var47];
                            }
                            var45.field2644 = var46;
                        }
                        if (var44 > 0 && var45.field2644[var44 - 1] == null) {
                            throw new RuntimeException("" + (var44 - 1));
                        }
                        class152 var48 = new class152();
                        var48.field2538 = var43;
                        var48.field2547 = var48.field2536 = var45.field2536;
                        var48.field2650 = var44;
                        var48.field2535 = true;
                        var45.field2644[var44] = var48;
                        if (var41) {
                            Statics.field622 = var48;
                        } else {
                            Statics.field565 = var48;
                        }
                        client.method564(var45);
                        continue;
                    }
                    if (var331 == 101) {
                        class152 var49 = var41 ? Statics.field622 : Statics.field565;
                        class152 var50 = class152.method493(var49.field2536);
                        var50.field2644[var49.field2650] = null;
                        client.method564(var50);
                        continue;
                    }
                    if (var331 == 102) {
                        var5--;
                        class152 var51 = class152.method493(field718[var5]);
                        var51.field2644 = null;
                        client.method564(var51);
                        continue;
                    }
                    if (var331 == 200) {
                        var5 -= 2;
                        int var52 = field718[var5];
                        int var53 = field718[var5 + 1];
                        class152 var54 = class152.method842(var52, var53);
                        if (var54 != null && var53 != -1) {
                            field718[var5++] = 1;
                            if (var41) {
                                Statics.field622 = var54;
                            } else {
                                Statics.field565 = var54;
                            }
                            continue;
                        }
                        field718[var5++] = 0;
                        continue;
                    }
                } else if (!(var331 < 1000 || var331 >= 1100) || !(var331 < 2000 || var331 >= 2100)) {
                    class152 var55;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var5--;
                        var55 = class152.method493(field718[var5]);
                    } else {
                        var55 = var41 ? Statics.field622 : Statics.field565;
                    }
                    if (var331 == 1000) {
                        var5 -= 2;
                        var55.field2615 = field718[var5];
                        var55.field2542 = field718[var5 + 1];
                        client.method564(var55);
                        continue;
                    }
                    if (var331 == 1001) {
                        var5 -= 2;
                        var55.field2617 = field718[var5];
                        var55.field2546 = field718[var5 + 1];
                        client.method564(var55);
                        continue;
                    }
                    if (var331 == 1003) {
                        var5--;
                        boolean var56 = field718[var5] == 1;
                        if (var55.field2548 != var56) {
                            var55.field2548 = var56;
                            client.method564(var55);
                        }
                        continue;
                    }
                } else if (!(var331 < 1100 || var331 >= 1200) || !(var331 < 2100 || var331 >= 2200)) {
                    class152 var57;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var5--;
                        var57 = class152.method493(field718[var5]);
                    } else {
                        var57 = var41 ? Statics.field622 : Statics.field565;
                    }
                    if (var331 == 1100) {
                        var5 -= 2;
                        var57.field2549 = field718[var5];
                        if (var57.field2549 > var57.field2551 - var57.field2617) {
                            var57.field2549 = var57.field2551 - var57.field2617;
                        }
                        if (var57.field2549 < 0) {
                            var57.field2549 = 0;
                        }
                        var57.field2643 = field718[var5 + 1];
                        if (var57.field2643 > var57.field2552 - var57.field2546) {
                            var57.field2643 = var57.field2552 - var57.field2546;
                        }
                        if (var57.field2643 < 0) {
                            var57.field2643 = 0;
                        }
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1101) {
                        var5--;
                        var57.field2553 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1102) {
                        var5--;
                        var57.field2557 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1103) {
                        var5--;
                        var57.field2528 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1104) {
                        var5--;
                        var57.field2550 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1105) {
                        var5--;
                        var57.field2585 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1106) {
                        var5--;
                        var57.field2591 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1107) {
                        var5--;
                        var57.field2563 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1108) {
                        var57.field2568 = 1;
                        var5--;
                        var57.field2580 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1109) {
                        var5 -= 6;
                        var57.field2574 = field718[var5];
                        var57.field2575 = field718[var5 + 1];
                        var57.field2628 = field718[var5 + 2];
                        var57.field2554 = field718[var5 + 3];
                        var57.field2578 = field718[var5 + 4];
                        var57.field2629 = field718[var5 + 5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1110) {
                        var5--;
                        int var58 = field718[var5];
                        if (var57.field2572 != var58) {
                            var57.field2572 = var58;
                            var57.field2642 = 0;
                            var57.field2534 = 0;
                            client.method564(var57);
                        }
                        continue;
                    }
                    if (var331 == 1111) {
                        var5--;
                        var57.field2581 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1112) {
                        var6--;
                        String var59 = field719[var6];
                        if (!var59.equals(var57.field2583)) {
                            var57.field2583 = var59;
                            client.method564(var57);
                        }
                        continue;
                    }
                    if (var331 == 1113) {
                        var5--;
                        var57.field2582 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1114) {
                        var5 -= 3;
                        var57.field2576 = field718[var5];
                        var57.field2587 = field718[var5 + 1];
                        var57.field2618 = field718[var5 + 2];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1115) {
                        var5--;
                        var57.field2588 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1116) {
                        var5--;
                        var57.field2564 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1117) {
                        var5--;
                        var57.field2633 = field718[var5];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1118) {
                        var5--;
                        var57.field2601 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1119) {
                        var5--;
                        var57.field2567 = field718[var5] == 1;
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1120) {
                        var5 -= 2;
                        var57.field2551 = field718[var5];
                        var57.field2552 = field718[var5 + 1];
                        client.method564(var57);
                        continue;
                    }
                    if (var331 == 1121) {
                        client.method471(var57.field2536, var57.field2650);
                        client.field423 = var57;
                        client.method564(var57);
                        continue;
                    }
                } else if (!(var331 < 1200 || var331 >= 1300) || !(var331 < 2200 || var331 >= 2300)) {
                    class152 var60;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var5--;
                        var60 = class152.method493(field718[var5]);
                    } else {
                        var60 = var41 ? Statics.field622 : Statics.field565;
                    }
                    client.method564(var60);
                    if (var331 == 1200) {
                        var5 -= 2;
                        int var61 = field718[var5];
                        int var62 = field718[var5 + 1];
                        var60.field2640 = var61;
                        var60.field2641 = var62;
                        class45 var63 = class45.method2458(var61);
                        var60.field2628 = var63.field1023;
                        var60.field2554 = var63.field1024;
                        var60.field2578 = var63.field1022;
                        var60.field2574 = var63.field1043;
                        var60.field2575 = var63.field1027;
                        var60.field2629 = var63.field1020;
                        if (var60.field2617 > 0) {
                            var60.field2629 = var60.field2629 * 32 / var60.field2617;
                        }
                        continue;
                    }
                    if (var331 == 1201) {
                        var60.field2568 = 2;
                        var5--;
                        var60.field2580 = field718[var5];
                        continue;
                    }
                    if (var331 == 1202) {
                        var60.field2568 = 3;
                        var60.field2580 = Statics.field892.field36.method2919();
                        continue;
                    }
                } else if ((var331 < 1300 || var331 >= 1400) && (var331 < 2300 || var331 >= 2400)) {
                    if (var331 >= 1400 && var331 < 1500 || var331 >= 2400 && var331 < 2500) {
                        class152 var68;
                        if (var331 >= 2000) {
                            var331 -= 1000;
                            var5--;
                            var68 = class152.method493(field718[var5]);
                        } else {
                            var68 = var41 ? Statics.field622 : Statics.field565;
                        }
                        var6--;
                        String var69 = field719[var6];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var5--;
                            int var71 = field718[var5];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while (var71-- > 0) {
                                    var5--;
                                    var70[var71] = field718[var5];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var6--;
                                var72[var73] = field719[var6];
                            } else {
                                var5--;
                                var72[var73] = Integer.valueOf(field718[var5]);
                            }
                        }
                        var5--;
                        int var74 = field718[var5];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var331 == 1400) {
                            var68.field2605 = var72;
                        }
                        if (var331 == 1401) {
                            var68.field2608 = var72;
                        }
                        if (var331 == 1402) {
                            var68.field2607 = var72;
                        }
                        if (var331 == 1403) {
                            var68.field2609 = var72;
                        }
                        if (var331 == 1404) {
                            var68.field2526 = var72;
                        }
                        if (var331 == 1405) {
                            var68.field2620 = var72;
                        }
                        if (var331 == 1406) {
                            var68.field2559 = var72;
                        }
                        if (var331 == 1407) {
                            var68.field2616 = var72;
                            var68.field2654 = var70;
                        }
                        if (var331 == 1408) {
                            var68.field2540 = var72;
                        }
                        if (var331 == 1409) {
                            var68.field2623 = var72;
                        }
                        if (var331 == 1410) {
                            var68.field2613 = var72;
                        }
                        if (var331 == 1411) {
                            var68.field2606 = var72;
                        }
                        if (var331 == 1412) {
                            var68.field2610 = var72;
                        }
                        if (var331 == 1414) {
                            var68.field2589 = var72;
                            var68.field2619 = var70;
                        }
                        if (var331 == 1415) {
                            var68.field2602 = var72;
                            var68.field2621 = var70;
                        }
                        if (var331 == 1416) {
                            var68.field2614 = var72;
                        }
                        if (var331 == 1417) {
                            var68.field2624 = var72;
                        }
                        if (var331 == 1418) {
                            var68.field2625 = var72;
                        }
                        if (var331 == 1419) {
                            var68.field2569 = var72;
                        }
                        if (var331 == 1420) {
                            var68.field2627 = var72;
                        }
                        if (var331 == 1421) {
                            var68.field2544 = var72;
                        }
                        if (var331 == 1422) {
                            var68.field2630 = var72;
                        }
                        if (var331 == 1423) {
                            var68.field2566 = var72;
                        }
                        if (var331 == 1424) {
                            var68.field2622 = var72;
                        }
                        var68.field2652 = true;
                        continue;
                    }
                    if (var331 < 1600) {
                        class152 var75 = var41 ? Statics.field622 : Statics.field565;
                        if (var331 == 1500) {
                            field718[var5++] = var75.field2615;
                            continue;
                        }
                        if (var331 == 1501) {
                            field718[var5++] = var75.field2542;
                            continue;
                        }
                        if (var331 == 1502) {
                            field718[var5++] = var75.field2617;
                            continue;
                        }
                        if (var331 == 1503) {
                            field718[var5++] = var75.field2546;
                            continue;
                        }
                        if (var331 == 1504) {
                            field718[var5++] = var75.field2548 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 1505) {
                            field718[var5++] = var75.field2547;
                            continue;
                        }
                    } else if (var331 < 1700) {
                        class152 var76 = var41 ? Statics.field622 : Statics.field565;
                        if (var331 == 1600) {
                            field718[var5++] = var76.field2549;
                            continue;
                        }
                        if (var331 == 1601) {
                            field718[var5++] = var76.field2643;
                            continue;
                        }
                        if (var331 == 1602) {
                            field719[var6++] = var76.field2583;
                            continue;
                        }
                        if (var331 == 1603) {
                            field718[var5++] = var76.field2551;
                            continue;
                        }
                        if (var331 == 1604) {
                            field718[var5++] = var76.field2552;
                            continue;
                        }
                        if (var331 == 1605) {
                            field718[var5++] = var76.field2629;
                            continue;
                        }
                        if (var331 == 1606) {
                            field718[var5++] = var76.field2628;
                            continue;
                        }
                        if (var331 == 1607) {
                            field718[var5++] = var76.field2578;
                            continue;
                        }
                        if (var331 == 1608) {
                            field718[var5++] = var76.field2554;
                            continue;
                        }
                    } else if (var331 < 1800) {
                        class152 var77 = var41 ? Statics.field622 : Statics.field565;
                        if (var331 == 1700) {
                            field718[var5++] = var77.field2640;
                            continue;
                        }
                        if (var331 == 1701) {
                            if (var77.field2640 == -1) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = var77.field2641;
                            }
                            continue;
                        }
                        if (var331 == 1702) {
                            field718[var5++] = var77.field2650;
                            continue;
                        }
                    } else if (var331 < 1900) {
                        class152 var78 = var41 ? Statics.field622 : Statics.field565;
                        if (var331 == 1800) {
                            int[] var79 = field718;
                            int var80 = var5++;
                            int var81 = client.method143(var78);
                            int var82 = var81 >> 11 & 0x3F;
                            var79[var80] = var82;
                            continue;
                        }
                        if (var331 == 1801) {
                            var5--;
                            int var83 = field718[var5];
                            int var332 = var83 - 1;
                            if (var78.field2597 != null && var332 < var78.field2597.length && var78.field2597[var332] != null) {
                                field719[var6++] = var78.field2597[var332];
                                continue;
                            }
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 1802) {
                            if (var78.field2596 == null) {
                                field719[var6++] = "";
                            } else {
                                field719[var6++] = var78.field2596;
                            }
                            continue;
                        }
                    } else if (var331 < 2600) {
                        var5--;
                        class152 var84 = class152.method493(field718[var5]);
                        if (var331 == 2500) {
                            field718[var5++] = var84.field2615;
                            continue;
                        }
                        if (var331 == 2501) {
                            field718[var5++] = var84.field2542;
                            continue;
                        }
                        if (var331 == 2502) {
                            field718[var5++] = var84.field2617;
                            continue;
                        }
                        if (var331 == 2503) {
                            field718[var5++] = var84.field2546;
                            continue;
                        }
                        if (var331 == 2504) {
                            field718[var5++] = var84.field2548 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 2505) {
                            field718[var5++] = var84.field2547;
                            continue;
                        }
                    } else if (var331 < 2700) {
                        var5--;
                        class152 var85 = class152.method493(field718[var5]);
                        if (var331 == 2600) {
                            field718[var5++] = var85.field2549;
                            continue;
                        }
                        if (var331 == 2601) {
                            field718[var5++] = var85.field2643;
                            continue;
                        }
                        if (var331 == 2602) {
                            field719[var6++] = var85.field2583;
                            continue;
                        }
                        if (var331 == 2603) {
                            field718[var5++] = var85.field2551;
                            continue;
                        }
                        if (var331 == 2604) {
                            field718[var5++] = var85.field2552;
                            continue;
                        }
                        if (var331 == 2605) {
                            field718[var5++] = var85.field2629;
                            continue;
                        }
                        if (var331 == 2606) {
                            field718[var5++] = var85.field2628;
                            continue;
                        }
                        if (var331 == 2607) {
                            field718[var5++] = var85.field2578;
                            continue;
                        }
                        if (var331 == 2608) {
                            field718[var5++] = var85.field2554;
                            continue;
                        }
                    } else if (var331 < 2800) {
                        if (var331 == 2700) {
                            var5--;
                            class152 var86 = class152.method493(field718[var5]);
                            field718[var5++] = var86.field2640;
                            continue;
                        }
                        if (var331 == 2701) {
                            var5--;
                            class152 var87 = class152.method493(field718[var5]);
                            if (var87.field2640 == -1) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = var87.field2641;
                            }
                            continue;
                        }
                        if (var331 == 2702) {
                            var5--;
                            int var88 = field718[var5];
                            class4 var89 = (class4) client.field379.method3197((long) var88);
                            if (var89 == null) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var331 < 2900) {
                        var5--;
                        class152 var90 = class152.method493(field718[var5]);
                        if (var331 == 2800) {
                            int[] var91 = field718;
                            int var92 = var5++;
                            int var93 = client.method143(var90);
                            int var94 = var93 >> 11 & 0x3F;
                            var91[var92] = var94;
                            continue;
                        }
                        if (var331 == 2801) {
                            var5--;
                            int var95 = field718[var5];
                            int var333 = var95 - 1;
                            if (var90.field2597 != null && var333 < var90.field2597.length && var90.field2597[var333] != null) {
                                field719[var6++] = var90.field2597[var333];
                                continue;
                            }
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 2802) {
                            if (var90.field2596 == null) {
                                field719[var6++] = "";
                            } else {
                                field719[var6++] = var90.field2596;
                            }
                            continue;
                        }
                    } else if (var331 < 3200) {
                        if (var331 == 3100) {
                            var6--;
                            String var96 = field719[var6];
                            class10.method1970(0, "", var96);
                            continue;
                        }
                        if (var331 == 3101) {
                            var5 -= 2;
                            client.method1878(Statics.field892, field718[var5], field718[var5 + 1]);
                            continue;
                        }
                        if (var331 == 3103) {
                            client.method137();
                            continue;
                        }
                        if (var331 == 3104) {
                            var6--;
                            String var97 = field719[var6];
                            int var98 = 0;
                            if (class199.method2523(var97)) {
                                int var99 = class199.method1369(var97, 10, true);
                                var98 = var99;
                            }
                            client.field499.method2347(227);
                            client.field499.method2303(var98);
                            continue;
                        }
                        if (var331 == 3105) {
                            var6--;
                            String var100 = field719[var6];
                            client.field499.method2347(195);
                            client.field499.method2102(var100.length() + 1);
                            client.field499.method2107(var100);
                            continue;
                        }
                        if (var331 == 3106) {
                            var6--;
                            String var101 = field719[var6];
                            client.field499.method2347(193);
                            client.field499.method2102(var101.length() + 1);
                            client.field499.method2107(var101);
                            continue;
                        }
                        if (var331 == 3107) {
                            var5--;
                            int var102 = field718[var5];
                            var6--;
                            String var103 = field719[var6];
                            boolean var104 = false;
                            for (int var105 = 0; var105 < client.field377; var105++) {
                                class3 var106 = client.field376[client.field378[var105]];
                                if (var106 != null && var106.field55 != null && var106.field55.equalsIgnoreCase(var103)) {
                                    if (var102 == 1) {
                                        client.field499.method2347(8);
                                        client.field499.method2138(0);
                                        client.field499.method2146(client.field378[var105]);
                                    } else if (var102 == 4) {
                                        client.field499.method2347(169);
                                        client.field499.method2146(client.field378[var105]);
                                        client.field499.method2102(0);
                                    } else if (var102 == 6) {
                                        client.field499.method2347(62);
                                        client.field499.method2147(client.field378[var105]);
                                        client.field499.method2102(0);
                                    } else if (var102 == 7) {
                                        client.field499.method2347(219);
                                        client.field499.method2145(client.field378[var105]);
                                        client.field499.method2138(0);
                                    }
                                    var104 = true;
                                    break;
                                }
                            }
                            if (!var104) {
                                class10.method1970(4, "", class142.field2304 + var103);
                            }
                            continue;
                        }
                        if (var331 == 3108) {
                            var5 -= 3;
                            int var107 = field718[var5];
                            int var108 = field718[var5 + 1];
                            int var109 = field718[var5 + 2];
                            class152 var110 = class152.method493(var109);
                            client.method7(var110, var107, var108);
                            continue;
                        }
                        if (var331 == 3109) {
                            var5 -= 2;
                            int var111 = field718[var5];
                            int var112 = field718[var5 + 1];
                            class152 var113 = var41 ? Statics.field622 : Statics.field565;
                            client.method7(var113, var111, var112);
                            continue;
                        }
                        if (var331 == 3110) {
                            var5--;
                            Statics.field171 = field718[var5] == 1;
                            continue;
                        }
                        if (var331 == 3111) {
                            field718[var5++] = Statics.field30.field136 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3112) {
                            var5--;
                            Statics.field30.field136 = field718[var5] == 1;
                            class9.method2();
                            continue;
                        }
                        if (var331 == 3113) {
                            var6--;
                            String var114 = field719[var6];
                            var5--;
                            boolean var115 = field718[var5] == 1;
                            class125.method757(var114, var115, false);
                            continue;
                        }
                    } else if (var331 < 3300) {
                        if (var331 == 3200) {
                            var5 -= 3;
                            client.method1968(field718[var5], field718[var5 + 1], field718[var5 + 2]);
                            continue;
                        }
                        if (var331 == 3201) {
                            var5--;
                            int var116 = field718[var5];
                            if (var116 == -1 && !client.field296) {
                                class161.method1383();
                            } else if (var116 != -1 && client.field491 != var116 && client.field490 != 0 && !client.field296) {
                                class161.method469(2, Statics.field1251, var116, 0, client.field490, false);
                            }
                            client.field491 = var116;
                            continue;
                        }
                        if (var331 == 3202) {
                            var5 -= 2;
                            client.method2888(field718[var5], field718[var5 + 1]);
                            continue;
                        }
                    } else if (var331 < 3400) {
                        if (var331 == 3300) {
                            field718[var5++] = client.field265;
                            continue;
                        }
                        if (var331 == 3301) {
                            var5 -= 2;
                            int var117 = field718[var5];
                            int var118 = field718[var5 + 1];
                            field718[var5++] = class14.method1312(var117, var118);
                            continue;
                        }
                        if (var331 == 3302) {
                            var5 -= 2;
                            int var119 = field718[var5];
                            int var120 = field718[var5 + 1];
                            field718[var5++] = class14.method25(var119, var120);
                            continue;
                        }
                        if (var331 == 3303) {
                            var5 -= 2;
                            int var121 = field718[var5];
                            int var122 = field718[var5 + 1];
                            int[] var123 = field718;
                            int var124 = var5++;
                            class14 var125 = (class14) class14.field197.method3197((long) var121);
                            int var126;
                            if (var125 == null) {
                                var126 = 0;
                            } else if (var122 == -1) {
                                var126 = 0;
                            } else {
                                int var127 = 0;
                                for (int var128 = 0; var128 < var125.field207.length; var128++) {
                                    if (var125.field205[var128] == var122) {
                                        var127 += var125.field207[var128];
                                    }
                                }
                                var126 = var127;
                            }
                            var123[var124] = var126;
                            continue;
                        }
                        if (var331 == 3304) {
                            var5--;
                            int var129 = field718[var5];
                            field718[var5++] = class44.method26(var129).field1001;
                            continue;
                        }
                        if (var331 == 3305) {
                            var5--;
                            int var130 = field718[var5];
                            field718[var5++] = client.field395[var130];
                            continue;
                        }
                        if (var331 == 3306) {
                            var5--;
                            int var131 = field718[var5];
                            field718[var5++] = client.field396[var131];
                            continue;
                        }
                        if (var331 == 3307) {
                            var5--;
                            int var132 = field718[var5];
                            field718[var5++] = client.field476[var132];
                            continue;
                        }
                        if (var331 == 3308) {
                            int var133 = Statics.field56;
                            int var134 = (Statics.field892.field770 >> 7) + Statics.field1782;
                            int var135 = (Statics.field892.field728 >> 7) + Statics.field1859;
                            field718[var5++] = (var133 << 28) + (var134 << 14) + var135;
                            continue;
                        }
                        if (var331 == 3309) {
                            var5--;
                            int var136 = field718[var5];
                            field718[var5++] = var136 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var331 == 3310) {
                            var5--;
                            int var137 = field718[var5];
                            field718[var5++] = var137 >> 28;
                            continue;
                        }
                        if (var331 == 3311) {
                            var5--;
                            int var138 = field718[var5];
                            field718[var5++] = var138 & 0x3FFF;
                            continue;
                        }
                        if (var331 == 3312) {
                            field718[var5++] = client.field259 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3313) {
                            var5 -= 2;
                            int var139 = field718[var5] + 32768;
                            int var140 = field718[var5 + 1];
                            field718[var5++] = class14.method1312(var139, var140);
                            continue;
                        }
                        if (var331 == 3314) {
                            var5 -= 2;
                            int var141 = field718[var5] + 32768;
                            int var142 = field718[var5 + 1];
                            field718[var5++] = class14.method25(var141, var142);
                            continue;
                        }
                        if (var331 == 3315) {
                            var5 -= 2;
                            int var143 = field718[var5] + 32768;
                            int var144 = field718[var5 + 1];
                            int[] var145 = field718;
                            int var146 = var5++;
                            class14 var147 = (class14) class14.field197.method3197((long) var143);
                            int var148;
                            if (var147 == null) {
                                var148 = 0;
                            } else if (var144 == -1) {
                                var148 = 0;
                            } else {
                                int var149 = 0;
                                for (int var150 = 0; var150 < var147.field207.length; var150++) {
                                    if (var147.field205[var150] == var144) {
                                        var149 += var147.field207[var150];
                                    }
                                }
                                var148 = var149;
                            }
                            var145[var146] = var148;
                            continue;
                        }
                        if (var331 == 3316) {
                            if (client.field326 >= 2) {
                                field718[var5++] = client.field326;
                            } else {
                                field718[var5++] = 0;
                            }
                            continue;
                        }
                        if (var331 == 3317) {
                            field718[var5++] = client.field272;
                            continue;
                        }
                        if (var331 == 3318) {
                            field718[var5++] = client.field424;
                            continue;
                        }
                        if (var331 == 3321) {
                            field718[var5++] = client.field270;
                            continue;
                        }
                        if (var331 == 3322) {
                            field718[var5++] = client.field426;
                            continue;
                        }
                        if (var331 == 3323) {
                            if (client.field367) {
                                field718[var5++] = 1;
                            } else {
                                field718[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var331 < 3500) {
                        if (var331 == 3400) {
                            var5 -= 2;
                            int var151 = field718[var5];
                            int var152 = field718[var5 + 1];
                            class43 var153 = (class43) class43.field992.method3166((long) var151);
                            class43 var154;
                            if (var153 == null) {
                                byte[] var155 = Statics.field998.method2759(8, var151);
                                class43 var156 = new class43();
                                if (var155 != null) {
                                    var156.method822(new class107(var155));
                                }
                                class43.field992.method3161(var156, (long) var151);
                                var154 = var156;
                            } else {
                                var154 = var153;
                            }
                            class43 var157 = var154;
                            if (var154.field991 != 's') {
                            }
                            for (int var158 = 0; var158 < var157.field996; var158++) {
                                if (var157.field995[var158] == var152) {
                                    field719[var6++] = var157.field997[var158];
                                    var157 = null;
                                    break;
                                }
                            }
                            if (var157 != null) {
                                field719[var6++] = var157.field994;
                            }
                            continue;
                        }
                        if (var331 == 3408) {
                            var5 -= 4;
                            int var159 = field718[var5];
                            int var160 = field718[var5 + 1];
                            int var161 = field718[var5 + 2];
                            int var162 = field718[var5 + 3];
                            class43 var163 = (class43) class43.field992.method3166((long) var161);
                            class43 var164;
                            if (var163 == null) {
                                byte[] var165 = Statics.field998.method2759(8, var161);
                                class43 var166 = new class43();
                                if (var165 != null) {
                                    var166.method822(new class107(var165));
                                }
                                class43.field992.method3161(var166, (long) var161);
                                var164 = var166;
                            } else {
                                var164 = var163;
                            }
                            class43 var167 = var164;
                            if (var164.field990 == var159 && var164.field991 == var160) {
                                for (int var168 = 0; var168 < var167.field996; var168++) {
                                    if (var167.field995[var168] == var162) {
                                        if (var160 == 115) {
                                            field719[var6++] = var167.field997[var168];
                                        } else {
                                            field718[var5++] = var167.field989[var168];
                                        }
                                        var167 = null;
                                        break;
                                    }
                                }
                                if (var167 != null) {
                                    if (var160 == 115) {
                                        field719[var6++] = var167.field994;
                                    } else {
                                        field718[var5++] = var167.field993;
                                    }
                                }
                                continue;
                            }
                            if (var160 == 115) {
                                field719[var6++] = "null";
                            } else {
                                field718[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var331 < 3700) {
                        if (var331 == 3600) {
                            if (client.field509 == 0) {
                                field718[var5++] = -2;
                            } else if (client.field509 == 1) {
                                field718[var5++] = -1;
                            } else {
                                field718[var5++] = client.field329;
                            }
                            continue;
                        }
                        if (var331 == 3601) {
                            var5--;
                            int var169 = field718[var5];
                            if (client.field509 == 2 && var169 < client.field329) {
                                field719[var6++] = client.field510[var169].field234;
                                field719[var6++] = client.field510[var169].field231;
                                continue;
                            }
                            field719[var6++] = "";
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 3602) {
                            var5--;
                            int var170 = field718[var5];
                            if (client.field509 == 2 && var170 < client.field329) {
                                field718[var5++] = client.field510[var170].field225;
                                continue;
                            }
                            field718[var5++] = 0;
                            continue;
                        }
                        if (var331 == 3603) {
                            var5--;
                            int var171 = field718[var5];
                            if (client.field509 == 2 && var171 < client.field329) {
                                field718[var5++] = client.field510[var171].field226;
                                continue;
                            }
                            field718[var5++] = 0;
                            continue;
                        }
                        if (var331 == 3604) {
                            var6--;
                            String var172 = field719[var6];
                            var5--;
                            int var173 = field718[var5];
                            client.method126(var172, var173);
                            continue;
                        }
                        if (var331 == 3605) {
                            var6--;
                            String var174 = field719[var6];
                            Statics.method2517(var174);
                            continue;
                        }
                        if (var331 == 3606) {
                            var6--;
                            String var175 = field719[var6];
                            client.method89(var175);
                            continue;
                        }
                        if (var331 == 3607) {
                            var6--;
                            String var176 = field719[var6];
                            client.method110(var176, false);
                            continue;
                        }
                        if (var331 == 3608) {
                            var6--;
                            String var177 = field719[var6];
                            client.method6(var177);
                            continue;
                        }
                        if (var331 == 3609) {
                            var6--;
                            String var178 = field719[var6];
                            if (var178.startsWith(class2.method597(0)) || var178.startsWith(class2.method597(1))) {
                                var178 = var178.substring(7);
                            }
                            field718[var5++] = client.method148(var178, false) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3611) {
                            if (client.field301 == null) {
                                field719[var6++] = "";
                            } else {
                                field719[var6++] = class198.method2916(client.field301);
                            }
                            continue;
                        }
                        if (var331 == 3612) {
                            if (client.field301 == null) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = Statics.field224;
                            }
                            continue;
                        }
                        if (var331 == 3613) {
                            var5--;
                            int var179 = field718[var5];
                            if (client.field301 != null && var179 < Statics.field224) {
                                field719[var6++] = Statics.field1994[var179].field570;
                                continue;
                            }
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 3614) {
                            var5--;
                            int var180 = field718[var5];
                            if (client.field301 != null && var180 < Statics.field224) {
                                field718[var5++] = Statics.field1994[var180].field569;
                                continue;
                            }
                            field718[var5++] = 0;
                            continue;
                        }
                        if (var331 == 3615) {
                            var5--;
                            int var181 = field718[var5];
                            if (client.field301 != null && var181 < Statics.field224) {
                                field718[var5++] = Statics.field1994[var181].field568;
                                continue;
                            }
                            field718[var5++] = 0;
                            continue;
                        }
                        if (var331 == 3616) {
                            field718[var5++] = Statics.field626;
                            continue;
                        }
                        if (var331 == 3617) {
                            var6--;
                            String var182 = field719[var6];
                            client.method1767(var182);
                            continue;
                        }
                        if (var331 == 3618) {
                            field718[var5++] = Statics.field245;
                            continue;
                        }
                        if (var331 == 3619) {
                            var6--;
                            String var183 = field719[var6];
                            client.method508(var183);
                            continue;
                        }
                        if (var331 == 3620) {
                            client.field499.method2347(190);
                            client.field499.method2102(0);
                            continue;
                        }
                        if (var331 == 3621) {
                            if (client.field509 == 0) {
                                field718[var5++] = -1;
                            } else {
                                field718[var5++] = client.field512;
                            }
                            continue;
                        }
                        if (var331 == 3622) {
                            var5--;
                            int var184 = field718[var5];
                            if (client.field509 != 0 && var184 < client.field512) {
                                field719[var6++] = client.field513[var184].field133;
                                field719[var6++] = client.field513[var184].field128;
                                continue;
                            }
                            field719[var6++] = "";
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 3623) {
                            var6--;
                            String var185 = field719[var6];
                            if (var185.startsWith(class2.method597(0)) || var185.startsWith(class2.method597(1))) {
                                var185 = var185.substring(7);
                            }
                            field718[var5++] = client.method3470(var185) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 3624) {
                            var5--;
                            int var186 = field718[var5];
                            if (Statics.field1994 != null && var186 < Statics.field224 && Statics.field1994[var186].field570.equalsIgnoreCase(Statics.field892.field55)) {
                                field718[var5++] = 1;
                                continue;
                            }
                            field718[var5++] = 0;
                            continue;
                        }
                        if (var331 == 3625) {
                            if (client.field481 == null) {
                                field719[var6++] = "";
                            } else {
                                field719[var6++] = class198.method2916(client.field481);
                            }
                            continue;
                        }
                    } else if (var331 < 4100) {
                        if (var331 == 4000) {
                            var5 -= 2;
                            int var187 = field718[var5];
                            int var188 = field718[var5 + 1];
                            field718[var5++] = var187 + var188;
                            continue;
                        }
                        if (var331 == 4001) {
                            var5 -= 2;
                            int var189 = field718[var5];
                            int var190 = field718[var5 + 1];
                            field718[var5++] = var189 - var190;
                            continue;
                        }
                        if (var331 == 4002) {
                            var5 -= 2;
                            int var191 = field718[var5];
                            int var192 = field718[var5 + 1];
                            field718[var5++] = var191 * var192;
                            continue;
                        }
                        if (var331 == 4003) {
                            var5 -= 2;
                            int var193 = field718[var5];
                            int var194 = field718[var5 + 1];
                            field718[var5++] = var193 / var194;
                            continue;
                        }
                        if (var331 == 4004) {
                            var5--;
                            int var195 = field718[var5];
                            field718[var5++] = (int) (Math.random() * (double) var195);
                            continue;
                        }
                        if (var331 == 4005) {
                            var5--;
                            int var196 = field718[var5];
                            field718[var5++] = (int) (Math.random() * (double) (var196 + 1));
                            continue;
                        }
                        if (var331 == 4006) {
                            var5 -= 5;
                            int var197 = field718[var5];
                            int var198 = field718[var5 + 1];
                            int var199 = field718[var5 + 2];
                            int var200 = field718[var5 + 3];
                            int var201 = field718[var5 + 4];
                            field718[var5++] = (var198 - var197) * (var201 - var199) / (var200 - var199) + var197;
                            continue;
                        }
                        if (var331 == 4007) {
                            var5 -= 2;
                            int var202 = field718[var5];
                            int var203 = field718[var5 + 1];
                            field718[var5++] = var202 * var203 / 100 + var202;
                            continue;
                        }
                        if (var331 == 4008) {
                            var5 -= 2;
                            int var204 = field718[var5];
                            int var205 = field718[var5 + 1];
                            field718[var5++] = var204 | 0x1 << var205;
                            continue;
                        }
                        if (var331 == 4009) {
                            var5 -= 2;
                            int var206 = field718[var5];
                            int var207 = field718[var5 + 1];
                            field718[var5++] = var206 & -1 - (0x1 << var207);
                            continue;
                        }
                        if (var331 == 4010) {
                            var5 -= 2;
                            int var208 = field718[var5];
                            int var209 = field718[var5 + 1];
                            field718[var5++] = (var208 & 0x1 << var209) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var331 == 4011) {
                            var5 -= 2;
                            int var210 = field718[var5];
                            int var211 = field718[var5 + 1];
                            field718[var5++] = var210 % var211;
                            continue;
                        }
                        if (var331 == 4012) {
                            var5 -= 2;
                            int var212 = field718[var5];
                            int var213 = field718[var5 + 1];
                            if (var212 == 0) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = (int) Math.pow((double) var212, (double) var213);
                            }
                            continue;
                        }
                        if (var331 == 4013) {
                            var5 -= 2;
                            int var214 = field718[var5];
                            int var215 = field718[var5 + 1];
                            if (var214 == 0) {
                                field718[var5++] = 0;
                            } else if (var215 == 0) {
                                field718[var5++] = Integer.MAX_VALUE;
                            } else {
                                field718[var5++] = (int) Math.pow((double) var214, 1.0D / (double) var215);
                            }
                            continue;
                        }
                        if (var331 == 4014) {
                            var5 -= 2;
                            int var216 = field718[var5];
                            int var217 = field718[var5 + 1];
                            field718[var5++] = var216 & var217;
                            continue;
                        }
                        if (var331 == 4015) {
                            var5 -= 2;
                            int var218 = field718[var5];
                            int var219 = field718[var5 + 1];
                            field718[var5++] = var218 | var219;
                            continue;
                        }
                    } else if (var331 < 4200) {
                        if (var331 == 4100) {
                            var6--;
                            String var220 = field719[var6];
                            var5--;
                            int var221 = field718[var5];
                            field719[var6++] = var220 + var221;
                            continue;
                        }
                        if (var331 == 4101) {
                            var6 -= 2;
                            String var222 = field719[var6];
                            String var223 = field719[var6 + 1];
                            field719[var6++] = var222 + var223;
                            continue;
                        }
                        if (var331 == 4102) {
                            var6--;
                            String var224 = field719[var6];
                            var5--;
                            int var225 = field718[var5];
                            field719[var6++] = var224 + class199.method2765(var225, true);
                            continue;
                        }
                        if (var331 == 4103) {
                            var6--;
                            String var226 = field719[var6];
                            field719[var6++] = var226.toLowerCase();
                            continue;
                        }
                        if (var331 == 4104) {
                            var5--;
                            int var227 = field718[var5];
                            long var228 = ((long) var227 + 11745L) * 86400000L;
                            field722.setTime(new Date(var228));
                            int var230 = field722.get(5);
                            int var231 = field722.get(2);
                            int var232 = field722.get(1);
                            field719[var6++] = var230 + "-" + field720[var231] + "-" + var232;
                            continue;
                        }
                        if (var331 == 4105) {
                            var6 -= 2;
                            String var233 = field719[var6];
                            String var234 = field719[var6 + 1];
                            if (Statics.field892.field36 != null && Statics.field892.field36.field2671) {
                                field719[var6++] = var234;
                                continue;
                            }
                            field719[var6++] = var233;
                            continue;
                        }
                        if (var331 == 4106) {
                            var5--;
                            int var235 = field718[var5];
                            field719[var6++] = Integer.toString(var235);
                            continue;
                        }
                        if (var331 == 4107) {
                            var6 -= 2;
                            field718[var5++] = class199.method3359(class202.method1(field719[var6], field719[var6 + 1], client.field261));
                            continue;
                        }
                        if (var331 == 4108) {
                            var6--;
                            String var236 = field719[var6];
                            var5 -= 2;
                            int var237 = field718[var5];
                            int var238 = field718[var5 + 1];
                            byte[] var239 = Statics.field586.method2759(var238, 0);
                            class193 var240 = new class193(var239);
                            field718[var5++] = var240.method3367(var236, var237);
                            continue;
                        }
                        if (var331 == 4109) {
                            var6--;
                            String var241 = field719[var6];
                            var5 -= 2;
                            int var242 = field718[var5];
                            int var243 = field718[var5 + 1];
                            byte[] var244 = Statics.field586.method2759(var243, 0);
                            class193 var245 = new class193(var244);
                            field718[var5++] = var245.method3360(var241, var242);
                            continue;
                        }
                        if (var331 == 4110) {
                            var6 -= 2;
                            String var246 = field719[var6];
                            String var247 = field719[var6 + 1];
                            var5--;
                            if (field718[var5] == 1) {
                                field719[var6++] = var246;
                            } else {
                                field719[var6++] = var247;
                            }
                            continue;
                        }
                        if (var331 == 4111) {
                            var6--;
                            String var248 = field719[var6];
                            field719[var6++] = class192.method3368(var248);
                            continue;
                        }
                        if (var331 == 4112) {
                            var6--;
                            String var249 = field719[var6];
                            var5--;
                            int var250 = field718[var5];
                            field719[var6++] = var249 + (char) var250;
                            continue;
                        }
                        if (var331 == 4113) {
                            var5--;
                            int var251 = field718[var5];
                            int[] var252 = field718;
                            int var253 = var5++;
                            char var254 = (char) var251;
                            boolean var255;
                            if (var254 >= ' ' && var254 <= '~') {
                                var255 = true;
                            } else if (var254 >= 160 && var254 <= 255) {
                                var255 = true;
                            } else if (var254 == 8364 || var254 == 338 || var254 == 8212 || var254 == 339 || var254 == 376) {
                                var255 = true;
                            } else {
                                var255 = false;
                            }
                            var252[var253] = var255 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4114) {
                            var5--;
                            int var256 = field718[var5];
                            int[] var257 = field718;
                            int var258 = var5++;
                            char var259 = (char) var256;
                            boolean var260 = var259 >= '0' && var259 <= '9' || var259 >= 'A' && var259 <= 'Z' || var259 >= 'a' && var259 <= 'z';
                            var257[var258] = var260 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4115) {
                            var5--;
                            int var261 = field718[var5];
                            field718[var5++] = class199.method2675((char) var261) ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4116) {
                            var5--;
                            int var262 = field718[var5];
                            int[] var263 = field718;
                            int var264 = var5++;
                            char var265 = (char) var262;
                            boolean var266 = var265 >= '0' && var265 <= '9';
                            var263[var264] = var266 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4117) {
                            var6--;
                            String var267 = field719[var6];
                            if (var267 == null) {
                                field718[var5++] = 0;
                            } else {
                                field718[var5++] = var267.length();
                            }
                            continue;
                        }
                        if (var331 == 4118) {
                            var6--;
                            String var268 = field719[var6];
                            var5 -= 2;
                            int var269 = field718[var5];
                            int var270 = field718[var5 + 1];
                            field719[var6++] = var268.substring(var269, var270);
                            continue;
                        }
                        if (var331 == 4119) {
                            var6--;
                            String var271 = field719[var6];
                            StringBuilder var272 = new StringBuilder(var271.length());
                            boolean var273 = false;
                            for (int var274 = 0; var274 < var271.length(); var274++) {
                                char var275 = var271.charAt(var274);
                                if (var275 == '<') {
                                    var273 = true;
                                } else if (var275 == '>') {
                                    var273 = false;
                                } else if (!var273) {
                                    var272.append(var275);
                                }
                            }
                            field719[var6++] = var272.toString();
                            continue;
                        }
                        if (var331 == 4120) {
                            var6--;
                            String var276 = field719[var6];
                            var5--;
                            int var277 = field718[var5];
                            field718[var5++] = var276.indexOf(var277);
                            continue;
                        }
                        if (var331 == 4121) {
                            var6 -= 2;
                            String var278 = field719[var6];
                            String var279 = field719[var6 + 1];
                            var5--;
                            int var280 = field718[var5];
                            field718[var5++] = var278.indexOf(var279, var280);
                            continue;
                        }
                    } else if (var331 < 4300) {
                        if (var331 == 4200) {
                            var5--;
                            int var281 = field718[var5];
                            field719[var6++] = class45.method2458(var281).field1016;
                            continue;
                        }
                        if (var331 == 4201) {
                            var5 -= 2;
                            int var282 = field718[var5];
                            int var283 = field718[var5 + 1];
                            class45 var284 = class45.method2458(var282);
                            if (var283 >= 1 && var283 <= 5 && var284.field1031[var283 - 1] != null) {
                                field719[var6++] = var284.field1031[var283 - 1];
                                continue;
                            }
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 4202) {
                            var5 -= 2;
                            int var285 = field718[var5];
                            int var286 = field718[var5 + 1];
                            class45 var287 = class45.method2458(var285);
                            if (var286 >= 1 && var286 <= 5 && var287.field1032[var286 - 1] != null) {
                                field719[var6++] = var287.field1032[var286 - 1];
                                continue;
                            }
                            field719[var6++] = "";
                            continue;
                        }
                        if (var331 == 4203) {
                            var5--;
                            int var288 = field718[var5];
                            field718[var5++] = class45.method2458(var288).field1029;
                            continue;
                        }
                        if (var331 == 4204) {
                            var5--;
                            int var289 = field718[var5];
                            field718[var5++] = class45.method2458(var289).field1028 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var331 == 4205) {
                            var5--;
                            int var290 = field718[var5];
                            class45 var291 = class45.method2458(var290);
                            if (var291.field1048 == -1 && var291.field1047 >= 0) {
                                field718[var5++] = var291.field1047;
                                continue;
                            }
                            field718[var5++] = var290;
                            continue;
                        }
                        if (var331 == 4206) {
                            var5--;
                            int var292 = field718[var5];
                            class45 var293 = class45.method2458(var292);
                            if (var293.field1048 >= 0 && var293.field1047 >= 0) {
                                field718[var5++] = var293.field1047;
                                continue;
                            }
                            field718[var5++] = var292;
                            continue;
                        }
                        if (var331 == 4207) {
                            var5--;
                            int var294 = field718[var5];
                            field718[var5++] = class45.method2458(var294).field1030 ? 1 : 0;
                            continue;
                        }
                    } else if (var331 < 5100) {
                        if (var331 == 5000) {
                            field718[var5++] = client.field393;
                            continue;
                        }
                        if (var331 == 5001) {
                            var5 -= 3;
                            client.field393 = field718[var5];
                            Statics.field1821 = class117.method78(field718[var5 + 1]);
                            if (Statics.field1821 == null) {
                                Statics.field1821 = class117.field1925;
                            }
                            client.field473 = field718[var5 + 2];
                            client.field499.method2347(209);
                            client.field499.method2102(client.field393);
                            client.field499.method2102(Statics.field1821.field1923);
                            client.field499.method2102(client.field473);
                            continue;
                        }
                        if (var331 == 5002) {
                            var6--;
                            String var295 = field719[var6];
                            var5 -= 2;
                            int var296 = field718[var5];
                            int var297 = field718[var5 + 1];
                            client.field499.method2347(179);
                            client.field499.method2102(class107.method598(var295) + 2);
                            client.field499.method2107(var295);
                            client.field499.method2102(var296 - 1);
                            client.field499.method2102(var297);
                            continue;
                        }
                        if (var331 == 5003) {
                            var5 -= 2;
                            int var298 = field718[var5];
                            int var299 = field718[var5 + 1];
                            class24 var300 = (class24) class10.field153.get(var298);
                            class31 var301 = var300.method502(var299);
                            if (var301 == null) {
                                field718[var5++] = -1;
                                field718[var5++] = 0;
                                field719[var6++] = "";
                                field719[var6++] = "";
                                field719[var6++] = "";
                            } else {
                                field718[var5++] = var301.field710;
                                field718[var5++] = var301.field711;
                                field719[var6++] = var301.field706 == null ? "" : var301.field706;
                                field719[var6++] = var301.field707 == null ? "" : var301.field707;
                                field719[var6++] = var301.field708 == null ? "" : var301.field708;
                            }
                            continue;
                        }
                        if (var331 == 5004) {
                            var5--;
                            int var303 = field718[var5];
                            class31 var304 = (class31) class10.field145.method3205((long) var303);
                            if (var304 == null) {
                                field718[var5++] = -1;
                                field718[var5++] = 0;
                                field719[var6++] = "";
                                field719[var6++] = "";
                                field719[var6++] = "";
                            } else {
                                field718[var5++] = var304.field705;
                                field718[var5++] = var304.field711;
                                field719[var6++] = var304.field706 == null ? "" : var304.field706;
                                field719[var6++] = var304.field707 == null ? "" : var304.field707;
                                field719[var6++] = var304.field708 == null ? "" : var304.field708;
                            }
                            continue;
                        }
                        if (var331 == 5005) {
                            if (Statics.field1821 == null) {
                                field718[var5++] = -1;
                            } else {
                                field718[var5++] = Statics.field1821.field1923;
                            }
                            continue;
                        }
                        if (var331 == 5008) {
                            var6--;
                            String var306 = field719[var6];
                            var5--;
                            int var307 = field718[var5];
                            String var308 = var306.toLowerCase();
                            byte var309 = 0;
                            if (var308.startsWith(class142.field2270)) {
                                var309 = 0;
                                var306 = var306.substring(class142.field2270.length());
                            } else if (var308.startsWith(class142.field2333)) {
                                var309 = 1;
                                var306 = var306.substring(class142.field2333.length());
                            } else if (var308.startsWith(class142.field2335)) {
                                var309 = 2;
                                var306 = var306.substring(class142.field2335.length());
                            } else if (var308.startsWith(class142.field2337)) {
                                var309 = 3;
                                var306 = var306.substring(class142.field2337.length());
                            } else if (var308.startsWith(class142.field2339)) {
                                var309 = 4;
                                var306 = var306.substring(class142.field2339.length());
                            } else if (var308.startsWith(class142.field2163)) {
                                var309 = 5;
                                var306 = var306.substring(class142.field2163.length());
                            } else if (var308.startsWith(class142.field2167)) {
                                var309 = 6;
                                var306 = var306.substring(class142.field2167.length());
                            } else if (var308.startsWith(class142.field2305)) {
                                var309 = 7;
                                var306 = var306.substring(class142.field2305.length());
                            } else if (var308.startsWith(class142.field2347)) {
                                var309 = 8;
                                var306 = var306.substring(class142.field2347.length());
                            } else if (var308.startsWith(class142.field2349)) {
                                var309 = 9;
                                var306 = var306.substring(class142.field2349.length());
                            } else if (var308.startsWith(class142.field2381)) {
                                var309 = 10;
                                var306 = var306.substring(class142.field2381.length());
                            } else if (var308.startsWith(class142.field2353)) {
                                var309 = 11;
                                var306 = var306.substring(class142.field2353.length());
                            } else if (client.field261 != 0) {
                                if (var308.startsWith(class142.field2287)) {
                                    var309 = 0;
                                    var306 = var306.substring(class142.field2287.length());
                                } else if (var308.startsWith(class142.field2334)) {
                                    var309 = 1;
                                    var306 = var306.substring(class142.field2334.length());
                                } else if (var308.startsWith(class142.field2336)) {
                                    var309 = 2;
                                    var306 = var306.substring(class142.field2336.length());
                                } else if (var308.startsWith(class142.field2262)) {
                                    var309 = 3;
                                    var306 = var306.substring(class142.field2262.length());
                                } else if (var308.startsWith(class142.field2158)) {
                                    var309 = 4;
                                    var306 = var306.substring(class142.field2158.length());
                                } else if (var308.startsWith(class142.field2342)) {
                                    var309 = 5;
                                    var306 = var306.substring(class142.field2342.length());
                                } else if (var308.startsWith(class142.field2344)) {
                                    var309 = 6;
                                    var306 = var306.substring(class142.field2344.length());
                                } else if (var308.startsWith(class142.field2346)) {
                                    var309 = 7;
                                    var306 = var306.substring(class142.field2346.length());
                                } else if (var308.startsWith(class142.field2290)) {
                                    var309 = 8;
                                    var306 = var306.substring(class142.field2290.length());
                                } else if (var308.startsWith(class142.field2350)) {
                                    var309 = 9;
                                    var306 = var306.substring(class142.field2350.length());
                                } else if (var308.startsWith(class142.field2273)) {
                                    var309 = 10;
                                    var306 = var306.substring(class142.field2273.length());
                                } else if (var308.startsWith(class142.field2354)) {
                                    var309 = 11;
                                    var306 = var306.substring(class142.field2354.length());
                                }
                            }
                            String var310 = var306.toLowerCase();
                            byte var311 = 0;
                            if (var310.startsWith(class142.field2345)) {
                                var311 = 1;
                                var306 = var306.substring(class142.field2345.length());
                            } else if (var310.startsWith(class142.field2229)) {
                                var311 = 2;
                                var306 = var306.substring(class142.field2229.length());
                            } else if (var310.startsWith(class142.field2359)) {
                                var311 = 3;
                                var306 = var306.substring(class142.field2359.length());
                            } else if (var310.startsWith(class142.field2271)) {
                                var311 = 4;
                                var306 = var306.substring(class142.field2271.length());
                            } else if (var310.startsWith(class142.field2285)) {
                                var311 = 5;
                                var306 = var306.substring(class142.field2285.length());
                            } else if (client.field261 != 0) {
                                if (var310.startsWith(class142.field2356)) {
                                    var311 = 1;
                                    var306 = var306.substring(class142.field2356.length());
                                } else if (var310.startsWith(class142.field2296)) {
                                    var311 = 2;
                                    var306 = var306.substring(class142.field2296.length());
                                } else if (var310.startsWith(class142.field2269)) {
                                    var311 = 3;
                                    var306 = var306.substring(class142.field2269.length());
                                } else if (var310.startsWith(class142.field2368)) {
                                    var311 = 4;
                                    var306 = var306.substring(class142.field2368.length());
                                } else if (var310.startsWith(class142.field2364)) {
                                    var311 = 5;
                                    var306 = var306.substring(class142.field2364.length());
                                }
                            }
                            client.field499.method2347(201);
                            client.field499.method2102(0);
                            int var312 = client.field499.field1862;
                            client.field499.method2102(var307);
                            client.field499.method2102(var309);
                            client.field499.method2102(var311);
                            class191.method180(client.field499, var306);
                            client.field499.method2143(client.field499.field1862 - var312);
                            continue;
                        }
                        if (var331 == 5009) {
                            var6 -= 2;
                            String var313 = field719[var6];
                            String var314 = field719[var6 + 1];
                            client.field499.method2347(76);
                            client.field499.method2275(0);
                            int var315 = client.field499.field1862;
                            client.field499.method2107(var313);
                            class191.method180(client.field499, var314);
                            client.field499.method2262(client.field499.field1862 - var315);
                            continue;
                        }
                        if (var331 == 5015) {
                            String var316;
                            if (Statics.field892 == null || Statics.field892.field55 == null) {
                                var316 = "";
                            } else {
                                var316 = Statics.field892.field55;
                            }
                            field719[var6++] = var316;
                            continue;
                        }
                        if (var331 == 5016) {
                            field718[var5++] = client.field473;
                            continue;
                        }
                        if (var331 == 5017) {
                            var5--;
                            int var317 = field718[var5];
                            field718[var5++] = class10.method570(var317);
                            continue;
                        }
                        if (var331 == 5018) {
                            var5--;
                            int var318 = field718[var5];
                            field718[var5++] = class10.method1876(var318);
                            continue;
                        }
                        if (var331 == 5019) {
                            var5--;
                            int var319 = field718[var5];
                            int[] var320 = field718;
                            int var321 = var5++;
                            class31 var322 = (class31) class10.field145.method3205((long) var319);
                            int var323;
                            if (var322 == null) {
                                var323 = -1;
                            } else if (class10.field150.field2852 == var322.field2857) {
                                var323 = -1;
                            } else {
                                var323 = ((class31) var322.field2857).field710;
                            }
                            var320[var321] = var323;
                            continue;
                        }
                        if (var331 == 5020) {
                            var6--;
                            String var324 = field719[var6];
                            if (var324.equalsIgnoreCase("toggleroof")) {
                                Statics.field30.field136 = !Statics.field30.field136;
                                class9.method2();
                                if (Statics.field30.field136) {
                                    class10.method1970(99, "", "Roofs are now all hidden");
                                } else {
                                    class10.method1970(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (client.field326 >= 2) {
                                if (var324.equalsIgnoreCase("fpson")) {
                                    client.field271 = true;
                                }
                                if (var324.equalsIgnoreCase("fpsoff")) {
                                    client.field271 = false;
                                }
                                if (var324.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var324.equalsIgnoreCase("clientdrop")) {
                                    client.method172();
                                }
                                if (var324.equalsIgnoreCase("errortest") && client.field256 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field499.method2347(175);
                            client.field499.method2102(var324.length() + 1);
                            client.field499.method2107(var324);
                            continue;
                        }
                    }
                } else {
                    class152 var64;
                    if (var331 >= 2000) {
                        var331 -= 1000;
                        var5--;
                        var64 = class152.method493(field718[var5]);
                    } else {
                        var64 = var41 ? Statics.field622 : Statics.field565;
                    }
                    if (var331 == 1300) {
                        var5--;
                        int var65 = field718[var5] - 1;
                        if (var65 >= 0 && var65 <= 9) {
                            var6--;
                            var64.method2863(var65, field719[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var331 == 1301) {
                        var5 -= 2;
                        int var66 = field718[var5];
                        int var67 = field718[var5 + 1];
                        var64.field2586 = class152.method842(var66, var67);
                        continue;
                    }
                    if (var331 == 1302) {
                        var5--;
                        var64.field2573 = field718[var5] == 1;
                        continue;
                    }
                    if (var331 == 1303) {
                        var5--;
                        var64.field2599 = field718[var5];
                        continue;
                    }
                    if (var331 == 1304) {
                        var5--;
                        var64.field2600 = field718[var5];
                        continue;
                    }
                    if (var331 == 1305) {
                        var6--;
                        var64.field2596 = field719[var6];
                        continue;
                    }
                    if (var331 == 1306) {
                        var6--;
                        var64.field2598 = field719[var6];
                        continue;
                    }
                    if (var331 == 1307) {
                        var64.field2597 = null;
                        continue;
                    }
                }
                if (var331 >= 5600 || var331 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var325 = field718[var5];
                int var326 = field718[var5 + 1];
                if (!client.field428) {
                    client.field340 = var325;
                    client.field341 = var326;
                }
            }
        } catch (Exception var330) {
            StringBuilder var328 = new StringBuilder(30);
            var328.append("").append(var4.field2867).append(" ");
            for (int var329 = field717 - 1; var329 >= 0; var329--) {
                var328.append("").append(field721[var329].field190.field2867).append(" ");
            }
            var328.append("").append(var10);
            class135.method2560(var328.toString(), var330);
        }
    }

    @ObfuscatedName("g.b(IB)V")
    public static void method91(int arg0) {
        if (arg0 == -1 || !class152.method561(arg0)) {
            return;
        }
        class152[] var1 = Statics.field2579[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class152 var3 = var1[var2];
            if (var3.field2604 != null) {
                class1 var4 = new class1();
                var4.field4 = var3;
                var4.field8 = var3.field2604;
                method563(var4, 2000000);
            }
        }
    }
}
