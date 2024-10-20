package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ab")
public class class34 {

    @ObfuscatedName("ab.e")
    public static int[] field747 = new int[5];

    @ObfuscatedName("ab.g")
    public static int[][] field735 = new int[5][5000];

    @ObfuscatedName("ab.f")
    public static int[] field736 = new int[1000];

    @ObfuscatedName("ab.m")
    public static String[] field737 = new String[1000];

    @ObfuscatedName("ab.a")
    public static int field738 = 0;

    @ObfuscatedName("ab.h")
    public static class14[] field739 = new class14[50];

    @ObfuscatedName("ab.q")
    public static Calendar field740 = Calendar.getInstance();

    @ObfuscatedName("ab.k")
    public static final String[] field741 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ab.x")
    public static int field734 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.n(Ln;II)V")
    public static void method31(class1 arg0, int arg1) {
        Object[] var2 = arg0.field2;
        int var3 = (Integer) var2[0];
        class20 var4 = Statics.method28(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field532;
        int[] var9 = var4.field542;
        byte var10 = -1;
        field738 = 0;
        try {
            Statics.field744 = new int[var4.field540];
            int var11 = 0;
            Statics.field634 = new String[var4.field536];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field7;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2651;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2650;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2651;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field4 == null ? -1 : arg0.field4.field2650;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field744[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field634[var12++] = var15;
                }
            }
            int var16 = 0;
            field734 = arg0.field15;
            label2890: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var470 = var8[var7];
                if (var470 < 100) {
                    if (var470 == 0) {
                        field736[var5++] = var9[var7];
                        continue;
                    }
                    if (var470 == 1) {
                        int var17 = var9[var7];
                        field736[var5++] = class167.field2801[var17];
                        continue;
                    }
                    if (var470 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2801[var18] = field736[var5];
                        client.method1871(var18);
                        continue;
                    }
                    if (var470 == 3) {
                        field737[var6++] = var4.field534[var7];
                        continue;
                    }
                    if (var470 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var470 == 7) {
                        var5 -= 2;
                        if (field736[var5 + 1] != field736[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 8) {
                        var5 -= 2;
                        if (field736[var5 + 1] == field736[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 9) {
                        var5 -= 2;
                        if (field736[var5] < field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 10) {
                        var5 -= 2;
                        if (field736[var5] > field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 21) {
                        if (field738 == 0) {
                            return;
                        }
                        class14 var19 = field739[--field738];
                        var4 = var19.field187;
                        var8 = var4.field532;
                        var9 = var4.field542;
                        var7 = var19.field183;
                        Statics.field744 = var19.field186;
                        Statics.field634 = var19.field185;
                        continue;
                    }
                    if (var470 == 25) {
                        int var20 = var9[var7];
                        field736[var5++] = class167.method175(var20);
                        continue;
                    }
                    if (var470 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field736[var5];
                        class44 var23 = class44.method2618(var21);
                        int var24 = var23.field1008;
                        int var25 = var23.field1010;
                        int var26 = var23.field1011;
                        int var27 = class167.field2804[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class167.field2801[var24] = class167.field2801[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var470 == 31) {
                        var5 -= 2;
                        if (field736[var5] <= field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 32) {
                        var5 -= 2;
                        if (field736[var5] >= field736[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var470 == 33) {
                        field736[var5++] = Statics.field744[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var470 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field744[var10001] = field736[var5];
                        continue;
                    }
                    if (var470 == 35) {
                        field737[var6++] = Statics.field634[var9[var7]];
                        continue;
                    }
                    if (var470 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field634[var10001] = field737[var6];
                        continue;
                    }
                    if (var470 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field737;
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
                        field737[var6++] = var31;
                        continue;
                    }
                    if (var470 == 38) {
                        var5--;
                        continue;
                    }
                    if (var470 == 39) {
                        var6--;
                        continue;
                    }
                    if (var470 == 40) {
                        int var41 = var9[var7];
                        class20 var42 = Statics.method28(var41);
                        int[] var43 = new int[var42.field540];
                        String[] var44 = new String[var42.field536];
                        for (int var45 = 0; var45 < var42.field535; var45++) {
                            var43[var45] = field736[var5 - var42.field535 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field537; var46++) {
                            var44[var46] = field737[var6 - var42.field537 + var46];
                        }
                        var5 -= var42.field535;
                        var6 -= var42.field537;
                        class14 var47 = new class14();
                        var47.field187 = var4;
                        var47.field183 = var7;
                        var47.field186 = Statics.field744;
                        var47.field185 = Statics.field634;
                        field739[++field738 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field532;
                        var9 = var42.field542;
                        var7 = -1;
                        Statics.field744 = var43;
                        Statics.field634 = var44;
                        continue;
                    }
                    if (var470 == 42) {
                        field736[var5++] = client.field439[var9[var7]];
                        continue;
                    }
                    if (var470 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field439[var10001] = field736[var5];
                        continue;
                    }
                    if (var470 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field736[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field747[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2890;
                                }
                                field735[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field736[var5];
                        if (var54 >= 0 && var54 < field747[var53]) {
                            field736[var5++] = field735[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field736[var5];
                        if (var56 >= 0 && var56 < field747[var55]) {
                            field735[var55][var56] = field736[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var470 == 47) {
                        String var57 = client.field333[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field737[var6++] = var57;
                        continue;
                    }
                    if (var470 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field333[var10001] = field737[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var470 < 1000) {
                    if (var470 == 100) {
                        var5 -= 3;
                        int var59 = field736[var5];
                        int var60 = field736[var5 + 1];
                        int var61 = field736[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var62 = Statics.method2717(var59);
                        if (var62.field2775 == null) {
                            var62.field2775 = new class164[var61 + 1];
                        }
                        if (var62.field2775.length <= var61) {
                            class164[] var63 = new class164[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2775.length; var64++) {
                                var63[var64] = var62.field2775[var64];
                            }
                            var62.field2775 = var63;
                        }
                        if (var61 > 0 && var62.field2775[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class164 var65 = new class164();
                        var65.field2732 = var60;
                        var65.field2669 = var65.field2651 = var62.field2651;
                        var65.field2650 = var61;
                        var65.field2649 = true;
                        var62.field2775[var61] = var65;
                        if (var58) {
                            Statics.field645 = var65;
                        } else {
                            Statics.field704 = var65;
                        }
                        client.method2625(var62);
                        continue;
                    }
                    if (var470 == 101) {
                        class164 var66 = var58 ? Statics.field645 : Statics.field704;
                        class164 var67 = Statics.method2717(var66.field2651);
                        var67.field2775[var66.field2650] = null;
                        client.method2625(var67);
                        continue;
                    }
                    if (var470 == 102) {
                        var5--;
                        class164 var68 = Statics.method2717(field736[var5]);
                        var68.field2775 = null;
                        client.method2625(var68);
                        continue;
                    }
                    if (var470 == 200) {
                        var5 -= 2;
                        int var69 = field736[var5];
                        int var70 = field736[var5 + 1];
                        class164 var71 = class164.method3587(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field736[var5++] = 1;
                            if (var58) {
                                Statics.field645 = var71;
                            } else {
                                Statics.field704 = var71;
                            }
                            continue;
                        }
                        field736[var5++] = 0;
                        continue;
                    }
                    if (var470 == 201) {
                        var5--;
                        class164 var72 = Statics.method2717(field736[var5]);
                        if (var72 == null) {
                            field736[var5++] = 0;
                        } else {
                            field736[var5++] = 1;
                            if (var58) {
                                Statics.field645 = var72;
                            } else {
                                Statics.field704 = var72;
                            }
                        }
                        continue;
                    }
                } else if (var470 >= 1000 && var470 < 1100 || var470 >= 2000 && var470 < 2100) {
                    int var73 = -1;
                    class164 var74;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var73 = field736[var5];
                        var74 = Statics.method2717(var73);
                    } else {
                        var74 = var58 ? Statics.field645 : Statics.field704;
                    }
                    if (var470 == 1000) {
                        var5 -= 4;
                        var74.field2713 = field736[var5];
                        var74.field2660 = field736[var5 + 1];
                        var74.field2655 = field736[var5 + 2];
                        var74.field2656 = field736[var5 + 3];
                        client.method2625(var74);
                        client.method2554(var74);
                        if (var73 != -1 && var74.field2732 == 0) {
                            client.method1484(Statics.field2653[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var470 == 1001) {
                        var5 -= 4;
                        var74.field2777 = field736[var5];
                        var74.field2744 = field736[var5 + 1];
                        var74.field2657 = field736[var5 + 2];
                        var74.field2728 = field736[var5 + 3];
                        client.method2625(var74);
                        client.method2554(var74);
                        if (var73 != -1 && var74.field2732 == 0) {
                            client.method1484(Statics.field2653[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var470 == 1003) {
                        var5--;
                        boolean var75 = field736[var5] == 1;
                        if (var74.field2670 != var75) {
                            var74.field2670 = var75;
                            client.method2625(var74);
                        }
                        continue;
                    }
                    if (var470 == 1005) {
                        var5--;
                        var74.field2726 = field736[var5] == 1;
                        continue;
                    }
                } else if (!(var470 < 1100 || var470 >= 1200) || !(var470 < 2100 || var470 >= 2200)) {
                    int var76 = -1;
                    class164 var77;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var76 = field736[var5];
                        var77 = Statics.method2717(var76);
                    } else {
                        var77 = var58 ? Statics.field645 : Statics.field704;
                    }
                    if (var470 == 1100) {
                        var5 -= 2;
                        var77.field2671 = field736[var5];
                        if (var77.field2671 > var77.field2673 - var77.field2665) {
                            var77.field2671 = var77.field2673 - var77.field2665;
                        }
                        if (var77.field2671 < 0) {
                            var77.field2671 = 0;
                        }
                        var77.field2672 = field736[var5 + 1];
                        if (var77.field2672 > var77.field2674 - var77.field2666) {
                            var77.field2672 = var77.field2674 - var77.field2666;
                        }
                        if (var77.field2672 < 0) {
                            var77.field2672 = 0;
                        }
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1101) {
                        var5--;
                        var77.field2723 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1102) {
                        var5--;
                        var77.field2679 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1103) {
                        var5--;
                        var77.field2680 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1104) {
                        var5--;
                        var77.field2760 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1105) {
                        var5--;
                        var77.field2667 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1106) {
                        var5--;
                        var77.field2685 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1107) {
                        var5--;
                        var77.field2686 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1108) {
                        var77.field2691 = 1;
                        var5--;
                        var77.field2692 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1109) {
                        var5 -= 6;
                        var77.field2697 = field736[var5];
                        var77.field2747 = field736[var5 + 1];
                        var77.field2776 = field736[var5 + 2];
                        var77.field2696 = field736[var5 + 3];
                        var77.field2701 = field736[var5 + 4];
                        var77.field2702 = field736[var5 + 5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1110) {
                        var5--;
                        int var78 = field736[var5];
                        if (var77.field2695 != var78) {
                            var77.field2695 = var78;
                            var77.field2770 = 0;
                            var77.field2771 = 0;
                            client.method2625(var77);
                        }
                        continue;
                    }
                    if (var470 == 1111) {
                        var5--;
                        var77.field2774 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1112) {
                        var6--;
                        String var79 = field737[var6];
                        if (!var79.equals(var77.field2708)) {
                            var77.field2708 = var79;
                            client.method2625(var77);
                        }
                        continue;
                    }
                    if (var470 == 1113) {
                        var5--;
                        var77.field2707 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1114) {
                        var5 -= 3;
                        var77.field2711 = field736[var5];
                        var77.field2712 = field736[var5 + 1];
                        var77.field2710 = field736[var5 + 2];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1115) {
                        var5--;
                        var77.field2753 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1116) {
                        var5--;
                        var77.field2687 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1117) {
                        var5--;
                        var77.field2688 = field736[var5];
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1118) {
                        var5--;
                        var77.field2689 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1119) {
                        var5--;
                        var77.field2690 = field736[var5] == 1;
                        client.method2625(var77);
                        continue;
                    }
                    if (var470 == 1120) {
                        var5 -= 2;
                        var77.field2673 = field736[var5];
                        var77.field2674 = field736[var5 + 1];
                        client.method2625(var77);
                        if (var76 != -1 && var77.field2732 == 0) {
                            client.method1484(Statics.field2653[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var470 == 1121) {
                        client.method3586(var77.field2651, var77.field2650);
                        client.field316 = var77;
                        client.method2625(var77);
                        continue;
                    }
                } else if (!(var470 < 1200 || var470 >= 1300) || !(var470 < 2200 || var470 >= 2300)) {
                    class164 var80;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var80 = Statics.method2717(field736[var5]);
                    } else {
                        var80 = var58 ? Statics.field645 : Statics.field704;
                    }
                    client.method2625(var80);
                    if (var470 == 1200 || var470 == 1205 || var470 == 1212) {
                        var5 -= 2;
                        int var81 = field736[var5];
                        int var82 = field736[var5 + 1];
                        var80.field2768 = var81;
                        var80.field2769 = var82;
                        class47 var83 = class47.method3569(var81);
                        var80.field2776 = var83.field1056;
                        var80.field2696 = var83.field1057;
                        var80.field2701 = var83.field1058;
                        var80.field2697 = var83.field1059;
                        var80.field2747 = var83.field1050;
                        var80.field2702 = var83.field1055;
                        if (var470 == 1205) {
                            var80.field2706 = 0;
                        } else if (var470 == 1212 | var83.field1084 == 1) {
                            var80.field2706 = 1;
                        } else {
                            var80.field2706 = 2;
                        }
                        if (var80.field2743 > 0) {
                            var80.field2702 = var80.field2702 * 32 / var80.field2743;
                        } else if (var80.field2777 > 0) {
                            var80.field2702 = var80.field2702 * 32 / var80.field2777;
                        }
                        continue;
                    }
                    if (var470 == 1201) {
                        var80.field2691 = 2;
                        var5--;
                        var80.field2692 = field736[var5];
                        continue;
                    }
                    if (var470 == 1202) {
                        var80.field2691 = 3;
                        var80.field2692 = Statics.field1710.field30.method3195();
                        continue;
                    }
                } else if ((var470 < 1300 || var470 >= 1400) && (var470 < 2300 || var470 >= 2400)) {
                    if (var470 >= 1400 && var470 < 1500 || var470 >= 2400 && var470 < 2500) {
                        class164 var88;
                        if (var470 >= 2000) {
                            var470 -= 1000;
                            var5--;
                            var88 = Statics.method2717(field736[var5]);
                        } else {
                            var88 = var58 ? Statics.field645 : Statics.field704;
                        }
                        var6--;
                        String var89 = field737[var6];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var5--;
                            int var91 = field736[var5];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var5--;
                                    var90[var91] = field736[var5];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var6--;
                                var92[var93] = field737[var6];
                            } else {
                                var5--;
                                var92[var93] = Integer.valueOf(field736[var5]);
                            }
                        }
                        var5--;
                        int var94 = field736[var5];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var470 == 1400) {
                            var88.field2730 = var92;
                        }
                        if (var470 == 1401) {
                            var88.field2733 = var92;
                        }
                        if (var470 == 1402) {
                            var88.field2698 = var92;
                        }
                        if (var470 == 1403) {
                            var88.field2780 = var92;
                        }
                        if (var470 == 1404) {
                            var88.field2736 = var92;
                        }
                        if (var470 == 1405) {
                            var88.field2705 = var92;
                        }
                        if (var470 == 1406) {
                            var88.field2740 = var92;
                        }
                        if (var470 == 1407) {
                            var88.field2741 = var92;
                            var88.field2734 = var90;
                        }
                        if (var470 == 1408) {
                            var88.field2641 = var92;
                        }
                        if (var470 == 1409) {
                            var88.field2748 = var92;
                        }
                        if (var470 == 1410) {
                            var88.field2738 = var92;
                        }
                        if (var470 == 1411) {
                            var88.field2731 = var92;
                        }
                        if (var470 == 1412) {
                            var88.field2735 = var92;
                        }
                        if (var470 == 1414) {
                            var88.field2699 = var92;
                            var88.field2714 = var90;
                        }
                        if (var470 == 1415) {
                            var88.field2745 = var92;
                            var88.field2746 = var90;
                        }
                        if (var470 == 1416) {
                            var88.field2739 = var92;
                        }
                        if (var470 == 1417) {
                            var88.field2719 = var92;
                        }
                        if (var470 == 1418) {
                            var88.field2750 = var92;
                        }
                        if (var470 == 1419) {
                            var88.field2700 = var92;
                        }
                        if (var470 == 1420) {
                            var88.field2752 = var92;
                        }
                        if (var470 == 1421) {
                            var88.field2676 = var92;
                        }
                        if (var470 == 1422) {
                            var88.field2754 = var92;
                        }
                        if (var470 == 1423) {
                            var88.field2755 = var92;
                        }
                        if (var470 == 1424) {
                            var88.field2681 = var92;
                        }
                        if (var470 == 1425) {
                            var88.field2773 = var92;
                        }
                        if (var470 == 1426) {
                            var88.field2759 = var92;
                        }
                        if (var470 == 1427) {
                            var88.field2757 = var92;
                        }
                        var88.field2758 = true;
                        continue;
                    }
                    if (var470 < 1600) {
                        class164 var95 = var58 ? Statics.field645 : Statics.field704;
                        if (var470 == 1500) {
                            field736[var5++] = var95.field2663;
                            continue;
                        }
                        if (var470 == 1501) {
                            field736[var5++] = var95.field2664;
                            continue;
                        }
                        if (var470 == 1502) {
                            field736[var5++] = var95.field2665;
                            continue;
                        }
                        if (var470 == 1503) {
                            field736[var5++] = var95.field2666;
                            continue;
                        }
                        if (var470 == 1504) {
                            field736[var5++] = var95.field2670 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 1505) {
                            field736[var5++] = var95.field2669;
                            continue;
                        }
                    } else if (var470 < 1700) {
                        class164 var96 = var58 ? Statics.field645 : Statics.field704;
                        if (var470 == 1600) {
                            field736[var5++] = var96.field2671;
                            continue;
                        }
                        if (var470 == 1601) {
                            field736[var5++] = var96.field2672;
                            continue;
                        }
                        if (var470 == 1602) {
                            field737[var6++] = var96.field2708;
                            continue;
                        }
                        if (var470 == 1603) {
                            field736[var5++] = var96.field2673;
                            continue;
                        }
                        if (var470 == 1604) {
                            field736[var5++] = var96.field2674;
                            continue;
                        }
                        if (var470 == 1605) {
                            field736[var5++] = var96.field2702;
                            continue;
                        }
                        if (var470 == 1606) {
                            field736[var5++] = var96.field2776;
                            continue;
                        }
                        if (var470 == 1607) {
                            field736[var5++] = var96.field2701;
                            continue;
                        }
                        if (var470 == 1608) {
                            field736[var5++] = var96.field2696;
                            continue;
                        }
                        if (var470 == 1609) {
                            field736[var5++] = var96.field2680;
                            continue;
                        }
                    } else if (var470 < 1800) {
                        class164 var97 = var58 ? Statics.field645 : Statics.field704;
                        if (var470 == 1700) {
                            field736[var5++] = var97.field2768;
                            continue;
                        }
                        if (var470 == 1701) {
                            if (var97.field2768 == -1) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var97.field2769;
                            }
                            continue;
                        }
                        if (var470 == 1702) {
                            field736[var5++] = var97.field2650;
                            continue;
                        }
                    } else if (var470 < 1900) {
                        class164 var98 = var58 ? Statics.field645 : Statics.field704;
                        if (var470 == 1800) {
                            field736[var5++] = class169.method2056(client.method2562(var98));
                            continue;
                        }
                        if (var470 == 1801) {
                            var5--;
                            int var99 = field736[var5];
                            int var471 = var99 - 1;
                            if (var98.field2722 != null && var471 < var98.field2722.length && var98.field2722[var471] != null) {
                                field737[var6++] = var98.field2722[var471];
                                continue;
                            }
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 1802) {
                            if (var98.field2721 == null) {
                                field737[var6++] = "";
                            } else {
                                field737[var6++] = var98.field2721;
                            }
                            continue;
                        }
                    } else if (!(var470 < 1900 || var470 >= 2000) || !(var470 < 2900 || var470 >= 3000)) {
                        class164 var100;
                        if (var470 >= 2000) {
                            var470 -= 1000;
                            var5--;
                            var100 = Statics.method2717(field736[var5]);
                        } else {
                            var100 = var58 ? Statics.field645 : Statics.field704;
                        }
                        if (var470 == 1927) {
                            if (field734 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var100.field2757 == null) {
                                return;
                            }
                            class1 var101 = new class1();
                            var101.field1 = var100;
                            var101.field2 = var100.field2757;
                            var101.field15 = field734 + 1;
                            client.field442.method3477(arg0);
                            continue;
                        }
                    } else if (var470 < 2600) {
                        var5--;
                        class164 var102 = Statics.method2717(field736[var5]);
                        if (var470 == 2500) {
                            field736[var5++] = var102.field2663;
                            continue;
                        }
                        if (var470 == 2501) {
                            field736[var5++] = var102.field2664;
                            continue;
                        }
                        if (var470 == 2502) {
                            field736[var5++] = var102.field2665;
                            continue;
                        }
                        if (var470 == 2503) {
                            field736[var5++] = var102.field2666;
                            continue;
                        }
                        if (var470 == 2504) {
                            field736[var5++] = var102.field2670 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 2505) {
                            field736[var5++] = var102.field2669;
                            continue;
                        }
                    } else if (var470 < 2700) {
                        var5--;
                        class164 var103 = Statics.method2717(field736[var5]);
                        if (var470 == 2600) {
                            field736[var5++] = var103.field2671;
                            continue;
                        }
                        if (var470 == 2601) {
                            field736[var5++] = var103.field2672;
                            continue;
                        }
                        if (var470 == 2602) {
                            field737[var6++] = var103.field2708;
                            continue;
                        }
                        if (var470 == 2603) {
                            field736[var5++] = var103.field2673;
                            continue;
                        }
                        if (var470 == 2604) {
                            field736[var5++] = var103.field2674;
                            continue;
                        }
                        if (var470 == 2605) {
                            field736[var5++] = var103.field2702;
                            continue;
                        }
                        if (var470 == 2606) {
                            field736[var5++] = var103.field2776;
                            continue;
                        }
                        if (var470 == 2607) {
                            field736[var5++] = var103.field2701;
                            continue;
                        }
                        if (var470 == 2608) {
                            field736[var5++] = var103.field2696;
                            continue;
                        }
                        if (var470 == 2609) {
                            field736[var5++] = var103.field2680;
                            continue;
                        }
                    } else if (var470 < 2800) {
                        if (var470 == 2700) {
                            var5--;
                            class164 var104 = Statics.method2717(field736[var5]);
                            field736[var5++] = var104.field2768;
                            continue;
                        }
                        if (var470 == 2701) {
                            var5--;
                            class164 var105 = Statics.method2717(field736[var5]);
                            if (var105.field2768 == -1) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var105.field2769;
                            }
                            continue;
                        }
                        if (var470 == 2702) {
                            var5--;
                            int var106 = field736[var5];
                            class4 var107 = (class4) client.field402.method3445((long) var106);
                            if (var107 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = 1;
                            }
                            continue;
                        }
                        if (var470 == 2706) {
                            field736[var5++] = client.field401;
                            continue;
                        }
                    } else if (var470 < 2900) {
                        var5--;
                        class164 var108 = Statics.method2717(field736[var5]);
                        if (var470 == 2800) {
                            field736[var5++] = class169.method2056(client.method2562(var108));
                            continue;
                        }
                        if (var470 == 2801) {
                            var5--;
                            int var109 = field736[var5];
                            int var472 = var109 - 1;
                            if (var108.field2722 != null && var472 < var108.field2722.length && var108.field2722[var472] != null) {
                                field737[var6++] = var108.field2722[var472];
                                continue;
                            }
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 2802) {
                            if (var108.field2721 == null) {
                                field737[var6++] = "";
                            } else {
                                field737[var6++] = var108.field2721;
                            }
                            continue;
                        }
                    } else if (var470 < 3200) {
                        if (var470 == 3100) {
                            var6--;
                            String var110 = field737[var6];
                            class11.method2783(0, "", var110);
                            continue;
                        }
                        if (var470 == 3101) {
                            var5 -= 2;
                            client.method1959(Statics.field1710, field736[var5], field736[var5 + 1]);
                            continue;
                        }
                        if (var470 == 3103) {
                            client.field488.method2480(199);
                            for (class4 var111 = (class4) client.field402.method3448(); var111 != null; var111 = (class4) client.field402.method3449()) {
                                if (var111.field51 == 0 || var111.field51 == 3) {
                                    client.method510(var111, true);
                                }
                            }
                            if (client.field316 != null) {
                                client.method2625(client.field316);
                                client.field316 = null;
                            }
                            continue;
                        }
                        if (var470 == 3104) {
                            var6--;
                            String var112 = field737[var6];
                            int var113 = 0;
                            if (class154.method92(var112)) {
                                int var114 = class154.method590(var112, 10, true);
                                var113 = var114;
                            }
                            client.field488.method2480(64);
                            client.field488.method2216(var113);
                            continue;
                        }
                        if (var470 == 3105) {
                            var6--;
                            String var115 = field737[var6];
                            client.field488.method2480(2);
                            client.field488.method2213(var115.length() + 1);
                            client.field488.method2219(var115);
                            continue;
                        }
                        if (var470 == 3106) {
                            var6--;
                            String var116 = field737[var6];
                            client.field488.method2480(157);
                            client.field488.method2213(var116.length() + 1);
                            client.field488.method2219(var116);
                            continue;
                        }
                        if (var470 == 3107) {
                            var5--;
                            int var117 = field736[var5];
                            var6--;
                            String var118 = field737[var6];
                            client.method1674(var117, var118);
                            continue;
                        }
                        if (var470 == 3108) {
                            var5 -= 3;
                            int var119 = field736[var5];
                            int var120 = field736[var5 + 1];
                            int var121 = field736[var5 + 2];
                            class164 var122 = Statics.method2717(var121);
                            client.method2942(var122, var119, var120);
                            continue;
                        }
                        if (var470 == 3109) {
                            var5 -= 2;
                            int var123 = field736[var5];
                            int var124 = field736[var5 + 1];
                            class164 var125 = var58 ? Statics.field645 : Statics.field704;
                            client.method2942(var125, var123, var124);
                            continue;
                        }
                        if (var470 == 3110) {
                            var5--;
                            Statics.field699 = field736[var5] == 1;
                            continue;
                        }
                        if (var470 == 3111) {
                            field736[var5++] = Statics.field608.field127 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3112) {
                            var5--;
                            Statics.field608.field127 = field736[var5] == 1;
                            class9.method1415();
                            continue;
                        }
                        if (var470 == 3113) {
                            var6--;
                            String var126 = field737[var6];
                            var5--;
                            boolean var127 = field736[var5] == 1;
                            class130.method133(var126, var127, false);
                            continue;
                        }
                        if (var470 == 3115) {
                            var5--;
                            int var128 = field736[var5];
                            client.field488.method2480(206);
                            client.field488.method2214(var128);
                            continue;
                        }
                    } else if (var470 < 3300) {
                        if (var470 == 3200) {
                            var5 -= 3;
                            int var129 = field736[var5];
                            int var130 = field736[var5 + 1];
                            int var131 = field736[var5 + 2];
                            if (client.field483 != 0 && var130 != 0 && client.field485 < 50) {
                                client.field486[client.field485] = var129;
                                client.field487[client.field485] = var130;
                                client.field521[client.field485] = var131;
                                client.field490[client.field485] = null;
                                client.field489[client.field485] = 0;
                                client.field485++;
                            }
                            continue;
                        }
                        if (var470 == 3201) {
                            var5--;
                            client.method2740(field736[var5]);
                            continue;
                        }
                        if (var470 == 3202) {
                            var5 -= 2;
                            int var132 = field736[var5];
                            int var10000 = field736[var5 + 1];
                            if (client.field480 != 0 && var132 != -1) {
                                class174.method3063(Statics.field3023, var132, 0, client.field480, false);
                                client.field482 = true;
                            }
                            continue;
                        }
                    } else if (var470 < 3400) {
                        if (var470 == 3300) {
                            field736[var5++] = client.field249;
                            continue;
                        }
                        if (var470 == 3301) {
                            var5 -= 2;
                            int var134 = field736[var5];
                            int var135 = field736[var5 + 1];
                            field736[var5++] = Statics.method2672(var134, var135);
                            continue;
                        }
                        if (var470 == 3302) {
                            var5 -= 2;
                            int var136 = field736[var5];
                            int var137 = field736[var5 + 1];
                            field736[var5++] = class15.method1956(var136, var137);
                            continue;
                        }
                        if (var470 == 3303) {
                            var5 -= 2;
                            int var138 = field736[var5];
                            int var139 = field736[var5 + 1];
                            int[] var140 = field736;
                            int var141 = var5++;
                            class15 var142 = (class15) class15.field192.method3445((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = 0;
                            } else if (var139 == -1) {
                                var143 = 0;
                            } else {
                                int var144 = 0;
                                for (int var145 = 0; var145 < var142.field190.length; var145++) {
                                    if (var142.field189[var145] == var139) {
                                        var144 += var142.field190[var145];
                                    }
                                }
                                var143 = var144;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var470 == 3304) {
                            var5--;
                            int var146 = field736[var5];
                            int[] var147 = field736;
                            int var148 = var5++;
                            class46 var149 = (class46) class46.field1035.method3411((long) var146);
                            class46 var150;
                            if (var149 == null) {
                                byte[] var151 = Statics.field1486.method2948(5, var146);
                                class46 var152 = new class46();
                                if (var151 != null) {
                                    var152.method890(new class111(var151));
                                }
                                class46.field1035.method3420(var152, (long) var146);
                                var150 = var152;
                            } else {
                                var150 = var149;
                            }
                            var147[var148] = var150.field1036;
                            continue;
                        }
                        if (var470 == 3305) {
                            var5--;
                            int var153 = field736[var5];
                            field736[var5++] = client.field378[var153];
                            continue;
                        }
                        if (var470 == 3306) {
                            var5--;
                            int var154 = field736[var5];
                            field736[var5++] = client.field379[var154];
                            continue;
                        }
                        if (var470 == 3307) {
                            var5--;
                            int var155 = field736[var5];
                            field736[var5++] = client.field380[var155];
                            continue;
                        }
                        if (var470 == 3308) {
                            int var156 = Statics.field2136;
                            int var157 = (Statics.field1710.field809 >> 7) + Statics.field178;
                            int var158 = (Statics.field1710.field749 >> 7) + Statics.field3035;
                            field736[var5++] = (var156 << 28) + (var157 << 14) + var158;
                            continue;
                        }
                        if (var470 == 3309) {
                            var5--;
                            int var159 = field736[var5];
                            field736[var5++] = var159 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var470 == 3310) {
                            var5--;
                            int var160 = field736[var5];
                            field736[var5++] = var160 >> 28;
                            continue;
                        }
                        if (var470 == 3311) {
                            var5--;
                            int var161 = field736[var5];
                            field736[var5++] = var161 & 0x3FFF;
                            continue;
                        }
                        if (var470 == 3312) {
                            field736[var5++] = client.field244 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3313) {
                            var5 -= 2;
                            int var162 = field736[var5] + 32768;
                            int var163 = field736[var5 + 1];
                            field736[var5++] = Statics.method2672(var162, var163);
                            continue;
                        }
                        if (var470 == 3314) {
                            var5 -= 2;
                            int var164 = field736[var5] + 32768;
                            int var165 = field736[var5 + 1];
                            field736[var5++] = class15.method1956(var164, var165);
                            continue;
                        }
                        if (var470 == 3315) {
                            var5 -= 2;
                            int var166 = field736[var5] + 32768;
                            int var167 = field736[var5 + 1];
                            int[] var168 = field736;
                            int var169 = var5++;
                            class15 var170 = (class15) class15.field192.method3445((long) var166);
                            int var171;
                            if (var170 == null) {
                                var171 = 0;
                            } else if (var167 == -1) {
                                var171 = 0;
                            } else {
                                int var172 = 0;
                                for (int var173 = 0; var173 < var170.field190.length; var173++) {
                                    if (var170.field189[var173] == var167) {
                                        var172 += var170.field190[var173];
                                    }
                                }
                                var171 = var172;
                            }
                            var168[var169] = var171;
                            continue;
                        }
                        if (var470 == 3316) {
                            if (client.field408 >= 2) {
                                field736[var5++] = client.field408;
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                        if (var470 == 3317) {
                            field736[var5++] = client.field257;
                            continue;
                        }
                        if (var470 == 3318) {
                            field736[var5++] = client.field240;
                            continue;
                        }
                        if (var470 == 3321) {
                            field736[var5++] = client.field406;
                            continue;
                        }
                        if (var470 == 3322) {
                            field736[var5++] = client.field376;
                            continue;
                        }
                        if (var470 == 3323) {
                            if (client.field253) {
                                field736[var5++] = 1;
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                        if (var470 == 3324) {
                            field736[var5++] = client.field241;
                            continue;
                        }
                    } else if (var470 < 3500) {
                        if (var470 == 3400) {
                            var5 -= 2;
                            int var174 = field736[var5];
                            int var175 = field736[var5 + 1];
                            class45 var176 = (class45) class45.field1021.method3411((long) var174);
                            class45 var177;
                            if (var176 == null) {
                                byte[] var178 = Statics.field1030.method2948(8, var174);
                                class45 var179 = new class45();
                                if (var178 != null) {
                                    var179.method875(new class111(var178));
                                }
                                class45.field1021.method3420(var179, (long) var174);
                                var177 = var179;
                            } else {
                                var177 = var176;
                            }
                            class45 var180 = var177;
                            if (var177.field1023 != 's') {
                            }
                            for (int var181 = 0; var181 < var180.field1033; var181++) {
                                if (var180.field1027[var181] == var175) {
                                    field737[var6++] = var180.field1029[var181];
                                    var180 = null;
                                    break;
                                }
                            }
                            if (var180 != null) {
                                field737[var6++] = var180.field1024;
                            }
                            continue;
                        }
                        if (var470 == 3408) {
                            var5 -= 4;
                            int var182 = field736[var5];
                            int var183 = field736[var5 + 1];
                            int var184 = field736[var5 + 2];
                            int var185 = field736[var5 + 3];
                            class45 var186 = (class45) class45.field1021.method3411((long) var184);
                            class45 var187;
                            if (var186 == null) {
                                byte[] var188 = Statics.field1030.method2948(8, var184);
                                class45 var189 = new class45();
                                if (var188 != null) {
                                    var189.method875(new class111(var188));
                                }
                                class45.field1021.method3420(var189, (long) var184);
                                var187 = var189;
                            } else {
                                var187 = var186;
                            }
                            class45 var190 = var187;
                            if (var187.field1022 == var182 && var187.field1023 == var183) {
                                for (int var191 = 0; var191 < var190.field1033; var191++) {
                                    if (var190.field1027[var191] == var185) {
                                        if (var183 == 115) {
                                            field737[var6++] = var190.field1029[var191];
                                        } else {
                                            field736[var5++] = var190.field1020[var191];
                                        }
                                        var190 = null;
                                        break;
                                    }
                                }
                                if (var190 != null) {
                                    if (var183 == 115) {
                                        field737[var6++] = var190.field1024;
                                    } else {
                                        field736[var5++] = var190.field1025;
                                    }
                                }
                                continue;
                            }
                            if (var183 == 115) {
                                field737[var6++] = "null";
                            } else {
                                field736[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var470 < 3700) {
                        if (var470 == 3600) {
                            if (client.field511 == 0) {
                                field736[var5++] = -2;
                            } else if (client.field511 == 1) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = client.field510;
                            }
                            continue;
                        }
                        if (var470 == 3601) {
                            var5--;
                            int var192 = field736[var5];
                            if (client.field511 == 2 && var192 < client.field510) {
                                field737[var6++] = client.field512[var192].field214;
                                field737[var6++] = client.field512[var192].field215;
                                continue;
                            }
                            field737[var6++] = "";
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 3602) {
                            var5--;
                            int var193 = field736[var5];
                            if (client.field511 == 2 && var193 < client.field510) {
                                field736[var5++] = client.field512[var193].field216;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3603) {
                            var5--;
                            int var194 = field736[var5];
                            if (client.field511 == 2 && var194 < client.field510) {
                                field736[var5++] = client.field512[var194].field217;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3604) {
                            var6--;
                            String var195 = field737[var6];
                            var5--;
                            int var196 = field736[var5];
                            client.method90(var195, var196);
                            continue;
                        }
                        if (var470 == 3605) {
                            var6--;
                            String var197 = field737[var6];
                            client.method132(var197);
                            continue;
                        }
                        if (var470 == 3606) {
                            var6--;
                            String var198 = field737[var6];
                            client.method2(var198);
                            continue;
                        }
                        if (var470 == 3607) {
                            var6--;
                            String var199 = field737[var6];
                            if (var199 == null) {
                                continue;
                            }
                            if ((client.field405 < 100 || client.field427 == 1) && client.field405 < 400) {
                                String var200 = class155.method1387(var199, Statics.field2944);
                                if (var200 == null) {
                                    continue;
                                }
                                for (int var201 = 0; var201 < client.field405; var201++) {
                                    class8 var202 = client.field515[var201];
                                    String var203 = class155.method1387(var202.field120, Statics.field2944);
                                    if (var203 != null && var203.equals(var200)) {
                                        class11.method2783(31, "", var199 + class148.field2374);
                                        continue label2890;
                                    }
                                    if (var202.field119 != null) {
                                        String var204 = class155.method1387(var202.field119, Statics.field2944);
                                        if (var204 != null && var204.equals(var200)) {
                                            class11.method2783(31, "", var199 + class148.field2374);
                                            continue label2890;
                                        }
                                    }
                                }
                                for (int var205 = 0; var205 < client.field510; var205++) {
                                    class17 var206 = client.field512[var205];
                                    String var207 = class155.method1387(var206.field214, Statics.field2944);
                                    if (var207 != null && var207.equals(var200)) {
                                        class11.method2783(31, "", class148.field2379 + var199 + class148.field2380);
                                        continue label2890;
                                    }
                                    if (var206.field215 != null) {
                                        String var208 = class155.method1387(var206.field215, Statics.field2944);
                                        if (var208 != null && var208.equals(var200)) {
                                            class11.method2783(31, "", class148.field2379 + var199 + class148.field2380);
                                            continue label2890;
                                        }
                                    }
                                }
                                if (class155.method1387(Statics.field1710.field32, Statics.field2944).equals(var200)) {
                                    class11.method2783(31, "", class148.field2376);
                                } else {
                                    client.field488.method2480(179);
                                    class114 var209 = client.field488;
                                    int var210 = var199.length() + 1;
                                    var209.method2213(var210);
                                    client.field488.method2219(var199);
                                }
                                continue;
                            }
                            class11.method2783(31, "", class148.field2466);
                            continue;
                        }
                        if (var470 == 3608) {
                            var6--;
                            String var211 = field737[var6];
                            if (var211 == null) {
                                continue;
                            }
                            String var212 = class155.method1387(var211, Statics.field2944);
                            if (var212 == null) {
                                continue;
                            }
                            int var213 = 0;
                            while (true) {
                                if (var213 >= client.field405) {
                                    continue label2890;
                                }
                                class8 var214 = client.field515[var213];
                                String var215 = var214.field120;
                                String var216 = class155.method1387(var215, Statics.field2944);
                                boolean var217;
                                if (var211 == null || var215 == null) {
                                    var217 = false;
                                } else if (var211.startsWith("#") || var215.startsWith("#")) {
                                    var217 = var211.equals(var215);
                                } else {
                                    var217 = var212.equals(var216);
                                }
                                if (var217) {
                                    client.field405--;
                                    for (int var218 = var213; var218 < client.field405; var218++) {
                                        client.field515[var218] = client.field515[var218 + 1];
                                    }
                                    client.field434 = client.field404;
                                    client.field488.method2480(180);
                                    class114 var219 = client.field488;
                                    int var220 = var211.length() + 1;
                                    var219.method2213(var220);
                                    client.field488.method2219(var211);
                                    continue label2890;
                                }
                                var213++;
                            }
                        }
                        if (var470 == 3609) {
                            var6--;
                            String var221 = field737[var6];
                            class143[] var222 = Statics.method134();
                            for (int var223 = 0; var223 < var222.length; var223++) {
                                class143 var224 = var222[var223];
                                if (var224.field2162 != -1) {
                                    int var226 = var224.field2162;
                                    String var227 = "<img=" + var226 + ">";
                                    if (var221.startsWith(var227)) {
                                        var221 = var221.substring(6 + Integer.toString(var224.field2162).length());
                                        break;
                                    }
                                }
                            }
                            field736[var5++] = client.method2792(var221, false) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3611) {
                            if (client.field286 == null) {
                                field737[var6++] = "";
                            } else {
                                field737[var6++] = class153.method1857(client.field286);
                            }
                            continue;
                        }
                        if (var470 == 3612) {
                            if (client.field286 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = Statics.field1709;
                            }
                            continue;
                        }
                        if (var470 == 3613) {
                            var5--;
                            int var228 = field736[var5];
                            if (client.field286 != null && var228 < Statics.field1709) {
                                field737[var6++] = Statics.field1954[var228].field575;
                                continue;
                            }
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 3614) {
                            var5--;
                            int var229 = field736[var5];
                            if (client.field286 != null && var229 < Statics.field1709) {
                                field736[var5++] = Statics.field1954[var229].field572;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3615) {
                            var5--;
                            int var230 = field736[var5];
                            if (client.field286 != null && var230 < Statics.field1709) {
                                field736[var5++] = Statics.field1954[var230].field582;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3616) {
                            field736[var5++] = Statics.field193;
                            continue;
                        }
                        if (var470 == 3617) {
                            var6--;
                            String var231 = field737[var6];
                            client.method3082(var231);
                            continue;
                        }
                        if (var470 == 3618) {
                            field736[var5++] = Statics.field968;
                            continue;
                        }
                        if (var470 == 3619) {
                            var6--;
                            String var232 = field737[var6];
                            if (!var232.equals("")) {
                                client.field488.method2480(241);
                                class114 var233 = client.field488;
                                int var234 = var232.length() + 1;
                                var233.method2213(var234);
                                client.field488.method2219(var232);
                            }
                            continue;
                        }
                        if (var470 == 3620) {
                            client.field488.method2480(241);
                            client.field488.method2213(0);
                            continue;
                        }
                        if (var470 == 3621) {
                            if (client.field511 == 0) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = client.field405;
                            }
                            continue;
                        }
                        if (var470 == 3622) {
                            var5--;
                            int var235 = field736[var5];
                            if (client.field511 != 0 && var235 < client.field405) {
                                field737[var6++] = client.field515[var235].field120;
                                field737[var6++] = client.field515[var235].field119;
                                continue;
                            }
                            field737[var6++] = "";
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 3623) {
                            String var236;
                            label2612: {
                                var6--;
                                var236 = field737[var6];
                                String var238 = "<img=0>";
                                if (!var236.startsWith(var238)) {
                                    String var240 = "<img=1>";
                                    if (!var236.startsWith(var240)) {
                                        break label2612;
                                    }
                                }
                                var236 = var236.substring(7);
                            }
                            field736[var5++] = client.method152(var236) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3624) {
                            var5--;
                            int var241 = field736[var5];
                            if (Statics.field1954 != null && var241 < Statics.field1709 && Statics.field1954[var241].field575.equalsIgnoreCase(Statics.field1710.field32)) {
                                field736[var5++] = 1;
                                continue;
                            }
                            field736[var5++] = 0;
                            continue;
                        }
                        if (var470 == 3625) {
                            if (client.field471 == null) {
                                field737[var6++] = "";
                            } else {
                                field737[var6++] = class153.method1857(client.field471);
                            }
                            continue;
                        }
                    } else if (var470 < 4000) {
                        if (var470 == 3903) {
                            var5--;
                            int var242 = field736[var5];
                            field736[var5++] = client.field519[var242].method3634();
                            continue;
                        }
                        if (var470 == 3904) {
                            var5--;
                            int var243 = field736[var5];
                            field736[var5++] = client.field519[var243].field3071;
                            continue;
                        }
                        if (var470 == 3905) {
                            var5--;
                            int var244 = field736[var5];
                            field736[var5++] = client.field519[var244].field3068;
                            continue;
                        }
                        if (var470 == 3906) {
                            var5--;
                            int var245 = field736[var5];
                            field736[var5++] = client.field519[var245].field3066;
                            continue;
                        }
                        if (var470 == 3907) {
                            var5--;
                            int var246 = field736[var5];
                            field736[var5++] = client.field519[var246].field3070;
                            continue;
                        }
                        if (var470 == 3908) {
                            var5--;
                            int var247 = field736[var5];
                            field736[var5++] = client.field519[var247].field3069;
                            continue;
                        }
                        if (var470 == 3910) {
                            var5--;
                            int var248 = field736[var5];
                            int var249 = client.field519[var248].method3640();
                            field736[var5++] = var249 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3911) {
                            var5--;
                            int var250 = field736[var5];
                            int var251 = client.field519[var250].method3640();
                            field736[var5++] = var251 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3912) {
                            var5--;
                            int var252 = field736[var5];
                            int var253 = client.field519[var252].method3640();
                            field736[var5++] = var253 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3913) {
                            var5--;
                            int var254 = field736[var5];
                            int var255 = client.field519[var254].method3640();
                            field736[var5++] = var255 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 3914) {
                            var5--;
                            boolean var256 = field736[var5] == 1;
                            if (Statics.field711 != null) {
                                Statics.field711.method3645(class212.field3075, var256);
                            }
                            continue;
                        }
                        if (var470 == 3915) {
                            var5--;
                            boolean var257 = field736[var5] == 1;
                            if (Statics.field711 != null) {
                                Statics.field711.method3645(class212.field3074, var257);
                            }
                            continue;
                        }
                        if (var470 == 3916) {
                            var5 -= 2;
                            boolean var258 = field736[var5] == 1;
                            boolean var259 = field736[var5 + 1] == 1;
                            if (Statics.field711 != null) {
                                Statics.field711.method3645(new class21(var259), var258);
                            }
                            continue;
                        }
                        if (var470 == 3917) {
                            var5--;
                            boolean var260 = field736[var5] == 1;
                            if (Statics.field711 != null) {
                                Statics.field711.method3645(class212.field3076, var260);
                            }
                            continue;
                        }
                        if (var470 == 3918) {
                            var5--;
                            boolean var261 = field736[var5] == 1;
                            if (Statics.field711 != null) {
                                Statics.field711.method3645(class212.field3073, var261);
                            }
                            continue;
                        }
                        if (var470 == 3919) {
                            field736[var5++] = Statics.field711 == null ? 0 : Statics.field711.field3072.size();
                            continue;
                        }
                        if (var470 == 3920) {
                            var5--;
                            int var262 = field736[var5];
                            class205 var263 = (class205) Statics.field711.field3072.get(var262);
                            field736[var5++] = var263.field3047;
                            continue;
                        }
                        if (var470 == 3921) {
                            var5--;
                            int var264 = field736[var5];
                            class205 var265 = (class205) Statics.field711.field3072.get(var264);
                            field737[var6++] = var265.method3595();
                            continue;
                        }
                        if (var470 == 3922) {
                            var5--;
                            int var266 = field736[var5];
                            class205 var267 = (class205) Statics.field711.field3072.get(var266);
                            field737[var6++] = var267.method3588();
                            continue;
                        }
                        if (var470 == 3923) {
                            var5--;
                            int var268 = field736[var5];
                            class205 var269 = (class205) Statics.field711.field3072.get(var268);
                            long var270 = class107.method1670() - Statics.field2581 - var269.field3045;
                            int var272 = (int) (var270 / 3600000L);
                            int var273 = (int) ((var270 - (long) (var272 * 3600000)) / 60000L);
                            int var274 = (int) ((var270 - (long) (var272 * 3600000) - (long) (var273 * 60000)) / 1000L);
                            String var275 = var272 + ":" + var273 / 10 + var273 % 10 + ":" + var274 / 10 + var274 % 10;
                            field737[var6++] = var275;
                            continue;
                        }
                        if (var470 == 3924) {
                            var5--;
                            int var276 = field736[var5];
                            class205 var277 = (class205) Statics.field711.field3072.get(var276);
                            field736[var5++] = var277.field3050.field3066;
                            continue;
                        }
                        if (var470 == 3925) {
                            var5--;
                            int var278 = field736[var5];
                            class205 var279 = (class205) Statics.field711.field3072.get(var278);
                            field736[var5++] = var279.field3050.field3068;
                            continue;
                        }
                        if (var470 == 3926) {
                            var5--;
                            int var280 = field736[var5];
                            class205 var281 = (class205) Statics.field711.field3072.get(var280);
                            field736[var5++] = var281.field3050.field3071;
                            continue;
                        }
                    } else if (var470 < 4100) {
                        if (var470 == 4000) {
                            var5 -= 2;
                            int var282 = field736[var5];
                            int var283 = field736[var5 + 1];
                            field736[var5++] = var282 + var283;
                            continue;
                        }
                        if (var470 == 4001) {
                            var5 -= 2;
                            int var284 = field736[var5];
                            int var285 = field736[var5 + 1];
                            field736[var5++] = var284 - var285;
                            continue;
                        }
                        if (var470 == 4002) {
                            var5 -= 2;
                            int var286 = field736[var5];
                            int var287 = field736[var5 + 1];
                            field736[var5++] = var286 * var287;
                            continue;
                        }
                        if (var470 == 4003) {
                            var5 -= 2;
                            int var288 = field736[var5];
                            int var289 = field736[var5 + 1];
                            field736[var5++] = var288 / var289;
                            continue;
                        }
                        if (var470 == 4004) {
                            var5--;
                            int var290 = field736[var5];
                            field736[var5++] = (int) (Math.random() * (double) var290);
                            continue;
                        }
                        if (var470 == 4005) {
                            var5--;
                            int var291 = field736[var5];
                            field736[var5++] = (int) (Math.random() * (double) (var291 + 1));
                            continue;
                        }
                        if (var470 == 4006) {
                            var5 -= 5;
                            int var292 = field736[var5];
                            int var293 = field736[var5 + 1];
                            int var294 = field736[var5 + 2];
                            int var295 = field736[var5 + 3];
                            int var296 = field736[var5 + 4];
                            field736[var5++] = (var293 - var292) * (var296 - var294) / (var295 - var294) + var292;
                            continue;
                        }
                        if (var470 == 4007) {
                            var5 -= 2;
                            int var297 = field736[var5];
                            int var298 = field736[var5 + 1];
                            field736[var5++] = var297 * var298 / 100 + var297;
                            continue;
                        }
                        if (var470 == 4008) {
                            var5 -= 2;
                            int var299 = field736[var5];
                            int var300 = field736[var5 + 1];
                            field736[var5++] = var299 | 0x1 << var300;
                            continue;
                        }
                        if (var470 == 4009) {
                            var5 -= 2;
                            int var301 = field736[var5];
                            int var302 = field736[var5 + 1];
                            field736[var5++] = var301 & -1 - (0x1 << var302);
                            continue;
                        }
                        if (var470 == 4010) {
                            var5 -= 2;
                            int var303 = field736[var5];
                            int var304 = field736[var5 + 1];
                            field736[var5++] = (var303 & 0x1 << var304) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var470 == 4011) {
                            var5 -= 2;
                            int var305 = field736[var5];
                            int var306 = field736[var5 + 1];
                            field736[var5++] = var305 % var306;
                            continue;
                        }
                        if (var470 == 4012) {
                            var5 -= 2;
                            int var307 = field736[var5];
                            int var308 = field736[var5 + 1];
                            if (var307 == 0) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = (int) Math.pow((double) var307, (double) var308);
                            }
                            continue;
                        }
                        if (var470 == 4013) {
                            var5 -= 2;
                            int var309 = field736[var5];
                            int var310 = field736[var5 + 1];
                            if (var309 == 0) {
                                field736[var5++] = 0;
                            } else if (var310 == 0) {
                                field736[var5++] = Integer.MAX_VALUE;
                            } else {
                                field736[var5++] = (int) Math.pow((double) var309, 1.0D / (double) var310);
                            }
                            continue;
                        }
                        if (var470 == 4014) {
                            var5 -= 2;
                            int var311 = field736[var5];
                            int var312 = field736[var5 + 1];
                            field736[var5++] = var311 & var312;
                            continue;
                        }
                        if (var470 == 4015) {
                            var5 -= 2;
                            int var313 = field736[var5];
                            int var314 = field736[var5 + 1];
                            field736[var5++] = var313 | var314;
                            continue;
                        }
                    } else if (var470 < 4200) {
                        if (var470 == 4100) {
                            var6--;
                            String var315 = field737[var6];
                            var5--;
                            int var316 = field736[var5];
                            field737[var6++] = var315 + var316;
                            continue;
                        }
                        if (var470 == 4101) {
                            var6 -= 2;
                            String var317 = field737[var6];
                            String var318 = field737[var6 + 1];
                            field737[var6++] = var317 + var318;
                            continue;
                        }
                        if (var470 == 4102) {
                            var6--;
                            String var319 = field737[var6];
                            var5--;
                            int var320 = field736[var5];
                            String[] var321 = field737;
                            int var322 = var6++;
                            String var324;
                            if (var320 < 0) {
                                var324 = Integer.toString(var320);
                            } else {
                                int var325 = var320;
                                String var326;
                                if (var320 < 0) {
                                    var326 = Integer.toString(var320, 10);
                                } else {
                                    int var327 = 2;
                                    int var328 = var320 / 10;
                                    while (var328 != 0) {
                                        var328 /= 10;
                                        var327++;
                                    }
                                    char[] var329 = new char[var327];
                                    var329[0] = '+';
                                    for (int var330 = var327 - 1; var330 > 0; var330--) {
                                        int var331 = var325;
                                        var325 /= 10;
                                        int var332 = var331 - var325 * 10;
                                        if (var332 >= 10) {
                                            var329[var330] = (char) (var332 + 87);
                                        } else {
                                            var329[var330] = (char) (var332 + 48);
                                        }
                                    }
                                    var326 = new String(var329);
                                }
                                var324 = var326;
                            }
                            var321[var322] = var319 + var324;
                            continue;
                        }
                        if (var470 == 4103) {
                            var6--;
                            String var333 = field737[var6];
                            field737[var6++] = var333.toLowerCase();
                            continue;
                        }
                        if (var470 == 4104) {
                            var5--;
                            int var334 = field736[var5];
                            long var335 = ((long) var334 + 11745L) * 86400000L;
                            field740.setTime(new Date(var335));
                            int var337 = field740.get(5);
                            int var338 = field740.get(2);
                            int var339 = field740.get(1);
                            field737[var6++] = var337 + "-" + field741[var338] + "-" + var339;
                            continue;
                        }
                        if (var470 == 4105) {
                            var6 -= 2;
                            String var340 = field737[var6];
                            String var341 = field737[var6 + 1];
                            if (Statics.field1710.field30 != null && Statics.field1710.field30.field2817) {
                                field737[var6++] = var341;
                                continue;
                            }
                            field737[var6++] = var340;
                            continue;
                        }
                        if (var470 == 4106) {
                            var5--;
                            int var342 = field736[var5];
                            field737[var6++] = Integer.toString(var342);
                            continue;
                        }
                        if (var470 == 4107) {
                            var6 -= 2;
                            int[] var343 = field736;
                            int var344 = var5++;
                            int var345 = class157.method3613(field737[var6], field737[var6 + 1], client.field323);
                            byte var346;
                            if (var345 > 0) {
                                var346 = 1;
                            } else if (var345 < 0) {
                                var346 = -1;
                            } else {
                                var346 = 0;
                            }
                            var343[var344] = var346;
                            continue;
                        }
                        if (var470 == 4108) {
                            var6--;
                            String var347 = field737[var6];
                            var5 -= 2;
                            int var348 = field736[var5];
                            int var349 = field736[var5 + 1];
                            byte[] var350 = Statics.field114.method2948(var349, 0);
                            class215 var351 = new class215(var350);
                            field736[var5++] = var351.method3658(var347, var348);
                            continue;
                        }
                        if (var470 == 4109) {
                            var6--;
                            String var352 = field737[var6];
                            var5 -= 2;
                            int var353 = field736[var5];
                            int var354 = field736[var5 + 1];
                            byte[] var355 = Statics.field114.method2948(var354, 0);
                            class215 var356 = new class215(var355);
                            field736[var5++] = var356.method3657(var352, var353);
                            continue;
                        }
                        if (var470 == 4110) {
                            var6 -= 2;
                            String var357 = field737[var6];
                            String var358 = field737[var6 + 1];
                            var5--;
                            if (field736[var5] == 1) {
                                field737[var6++] = var357;
                            } else {
                                field737[var6++] = var358;
                            }
                            continue;
                        }
                        if (var470 == 4111) {
                            var6--;
                            String var359 = field737[var6];
                            field737[var6++] = class214.method3659(var359);
                            continue;
                        }
                        if (var470 == 4112) {
                            var6--;
                            String var360 = field737[var6];
                            var5--;
                            int var361 = field736[var5];
                            field737[var6++] = var360 + (char) var361;
                            continue;
                        }
                        if (var470 == 4113) {
                            var5--;
                            int var362 = field736[var5];
                            field736[var5++] = class154.method2839((char) var362) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4114) {
                            var5--;
                            int var363 = field736[var5];
                            field736[var5++] = class154.method646((char) var363) ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4115) {
                            var5--;
                            int var364 = field736[var5];
                            int[] var365 = field736;
                            int var366 = var5++;
                            char var367 = (char) var364;
                            boolean var368 = var367 >= 'A' && var367 <= 'Z' || var367 >= 'a' && var367 <= 'z';
                            var365[var366] = var368 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4116) {
                            var5--;
                            int var369 = field736[var5];
                            int[] var370 = field736;
                            int var371 = var5++;
                            char var372 = (char) var369;
                            boolean var373 = var372 >= '0' && var372 <= '9';
                            var370[var371] = var373 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4117) {
                            var6--;
                            String var374 = field737[var6];
                            if (var374 == null) {
                                field736[var5++] = 0;
                            } else {
                                field736[var5++] = var374.length();
                            }
                            continue;
                        }
                        if (var470 == 4118) {
                            var6--;
                            String var375 = field737[var6];
                            var5 -= 2;
                            int var376 = field736[var5];
                            int var377 = field736[var5 + 1];
                            field737[var6++] = var375.substring(var376, var377);
                            continue;
                        }
                        if (var470 == 4119) {
                            var6--;
                            String var378 = field737[var6];
                            StringBuilder var379 = new StringBuilder(var378.length());
                            boolean var380 = false;
                            for (int var381 = 0; var381 < var378.length(); var381++) {
                                char var382 = var378.charAt(var381);
                                if (var382 == '<') {
                                    var380 = true;
                                } else if (var382 == '>') {
                                    var380 = false;
                                } else if (!var380) {
                                    var379.append(var382);
                                }
                            }
                            field737[var6++] = var379.toString();
                            continue;
                        }
                        if (var470 == 4120) {
                            var6--;
                            String var383 = field737[var6];
                            var5--;
                            int var384 = field736[var5];
                            field736[var5++] = var383.indexOf(var384);
                            continue;
                        }
                        if (var470 == 4121) {
                            var6 -= 2;
                            String var385 = field737[var6];
                            String var386 = field737[var6 + 1];
                            var5--;
                            int var387 = field736[var5];
                            field736[var5++] = var385.indexOf(var386, var387);
                            continue;
                        }
                    } else if (var470 < 4300) {
                        if (var470 == 4200) {
                            var5--;
                            int var388 = field736[var5];
                            field737[var6++] = class47.method3569(var388).field1077;
                            continue;
                        }
                        if (var470 == 4201) {
                            var5 -= 2;
                            int var389 = field736[var5];
                            int var390 = field736[var5 + 1];
                            class47 var391 = class47.method3569(var389);
                            if (var390 >= 1 && var390 <= 5 && var391.field1043[var390 - 1] != null) {
                                field737[var6++] = var391.field1043[var390 - 1];
                                continue;
                            }
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 4202) {
                            var5 -= 2;
                            int var392 = field736[var5];
                            int var393 = field736[var5 + 1];
                            class47 var394 = class47.method3569(var392);
                            if (var393 >= 1 && var393 <= 5 && var394.field1065[var393 - 1] != null) {
                                field737[var6++] = var394.field1065[var393 - 1];
                                continue;
                            }
                            field737[var6++] = "";
                            continue;
                        }
                        if (var470 == 4203) {
                            var5--;
                            int var395 = field736[var5];
                            field736[var5++] = class47.method3569(var395).field1062;
                            continue;
                        }
                        if (var470 == 4204) {
                            var5--;
                            int var396 = field736[var5];
                            field736[var5++] = class47.method3569(var396).field1084 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4205) {
                            var5--;
                            int var397 = field736[var5];
                            class47 var398 = class47.method3569(var397);
                            if (var398.field1081 == -1 && var398.field1060 >= 0) {
                                field736[var5++] = var398.field1060;
                                continue;
                            }
                            field736[var5++] = var397;
                            continue;
                        }
                        if (var470 == 4206) {
                            var5--;
                            int var399 = field736[var5];
                            class47 var400 = class47.method3569(var399);
                            if (var400.field1081 >= 0 && var400.field1060 >= 0) {
                                field736[var5++] = var400.field1060;
                                continue;
                            }
                            field736[var5++] = var399;
                            continue;
                        }
                        if (var470 == 4207) {
                            var5--;
                            int var401 = field736[var5];
                            field736[var5++] = class47.method3569(var401).field1072 ? 1 : 0;
                            continue;
                        }
                        if (var470 == 4210) {
                            var6--;
                            String var402 = field737[var6];
                            var5--;
                            int var403 = field736[var5];
                            boolean var405 = var403 == 1;
                            String var406 = var402.toLowerCase();
                            short[] var407 = new short[16];
                            int var408 = 0;
                            int var409 = 0;
                            while (true) {
                                if (var409 >= Statics.field1044) {
                                    Statics.field1981 = var407;
                                    Statics.field2821 = 0;
                                    Statics.field1032 = var408;
                                    String[] var413 = new String[Statics.field1032];
                                    for (int var414 = 0; var414 < Statics.field1032; var414++) {
                                        var413[var414] = class47.method3569(var407[var414]).field1077;
                                    }
                                    short[] var415 = Statics.field1981;
                                    class116.method948(var413, var415, 0, var413.length - 1);
                                    break;
                                }
                                class47 var410 = class47.method3569(var409);
                                if ((!var405 || var410.field1088) && var410.field1081 == -1 && var410.field1077.toLowerCase().indexOf(var406) != -1) {
                                    if (var408 >= 250) {
                                        Statics.field1032 = -1;
                                        Statics.field1981 = null;
                                        break;
                                    }
                                    if (var408 >= var407.length) {
                                        short[] var411 = new short[var407.length * 2];
                                        for (int var412 = 0; var412 < var408; var412++) {
                                            var411[var412] = var407[var412];
                                        }
                                        var407 = var411;
                                    }
                                    var407[var408++] = (short) var409;
                                }
                                var409++;
                            }
                            field736[var5++] = Statics.field1032;
                            continue;
                        }
                        if (var470 == 4211) {
                            if (Statics.field1981 != null && Statics.field2821 < Statics.field1032) {
                                field736[var5++] = Statics.field1981[++Statics.field2821 - 1] & 0xFFFF;
                                continue;
                            }
                            field736[var5++] = -1;
                            continue;
                        }
                        if (var470 == 4212) {
                            Statics.field2821 = 0;
                            continue;
                        }
                    } else if (var470 < 5100) {
                        if (var470 == 5000) {
                            field736[var5++] = client.field279;
                            continue;
                        }
                        if (var470 == 5001) {
                            var5 -= 3;
                            client.field279 = field736[var5];
                            Statics.field1612 = Statics.method612(field736[var5 + 1]);
                            if (Statics.field1612 == null) {
                                Statics.field1612 = class122.field1963;
                            }
                            client.field462 = field736[var5 + 2];
                            client.field488.method2480(51);
                            client.field488.method2213(client.field279);
                            client.field488.method2213(Statics.field1612.field1960);
                            client.field488.method2213(client.field462);
                            continue;
                        }
                        if (var470 == 5002) {
                            var6--;
                            String var416 = field737[var6];
                            var5 -= 2;
                            int var417 = field736[var5];
                            int var418 = field736[var5 + 1];
                            client.field488.method2480(40);
                            client.field488.method2213(class111.method2148(var416) + 2);
                            client.field488.method2219(var416);
                            client.field488.method2213(var417 - 1);
                            client.field488.method2213(var418);
                            continue;
                        }
                        if (var470 == 5003) {
                            var5 -= 2;
                            int var419 = field736[var5];
                            int var420 = field736[var5 + 1];
                            class26 var421 = (class26) class11.field153.get(var419);
                            class33 var422 = var421.method593(var420);
                            if (var422 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                                field737[var6++] = "";
                                field737[var6++] = "";
                            } else {
                                field736[var5++] = var422.field726;
                                field736[var5++] = var422.field720;
                                field737[var6++] = var422.field730 == null ? "" : var422.field730;
                                field737[var6++] = var422.field719 == null ? "" : var422.field719;
                                field737[var6++] = var422.field724 == null ? "" : var422.field724;
                            }
                            continue;
                        }
                        if (var470 == 5004) {
                            var5--;
                            int var424 = field736[var5];
                            class33 var425 = class11.method2062(var424);
                            if (var425 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                                field737[var6++] = "";
                                field737[var6++] = "";
                            } else {
                                field736[var5++] = var425.field721;
                                field736[var5++] = var425.field720;
                                field737[var6++] = var425.field730 == null ? "" : var425.field730;
                                field737[var6++] = var425.field719 == null ? "" : var425.field719;
                                field737[var6++] = var425.field724 == null ? "" : var425.field724;
                            }
                            continue;
                        }
                        if (var470 == 5005) {
                            if (Statics.field1612 == null) {
                                field736[var5++] = -1;
                            } else {
                                field736[var5++] = Statics.field1612.field1960;
                            }
                            continue;
                        }
                        if (var470 == 5008) {
                            var6--;
                            String var426 = field737[var6];
                            var5--;
                            int var427 = field736[var5];
                            String var428 = var426.toLowerCase();
                            byte var429 = 0;
                            if (var428.startsWith(class148.field2381)) {
                                var429 = 0;
                                var426 = var426.substring(class148.field2381.length());
                            } else if (var428.startsWith(class148.field2209)) {
                                var429 = 1;
                                var426 = var426.substring(class148.field2209.length());
                            } else if (var428.startsWith(class148.field2385)) {
                                var429 = 2;
                                var426 = var426.substring(class148.field2385.length());
                            } else if (var428.startsWith(class148.field2387)) {
                                var429 = 3;
                                var426 = var426.substring(class148.field2387.length());
                            } else if (var428.startsWith(class148.field2340)) {
                                var429 = 4;
                                var426 = var426.substring(class148.field2340.length());
                            } else if (var428.startsWith(class148.field2391)) {
                                var429 = 5;
                                var426 = var426.substring(class148.field2391.length());
                            } else if (var428.startsWith(class148.field2313)) {
                                var429 = 6;
                                var426 = var426.substring(class148.field2313.length());
                            } else if (var428.startsWith(class148.field2395)) {
                                var429 = 7;
                                var426 = var426.substring(class148.field2395.length());
                            } else if (var428.startsWith(class148.field2397)) {
                                var429 = 8;
                                var426 = var426.substring(class148.field2397.length());
                            } else if (var428.startsWith(class148.field2399)) {
                                var429 = 9;
                                var426 = var426.substring(class148.field2399.length());
                            } else if (var428.startsWith(class148.field2210)) {
                                var429 = 10;
                                var426 = var426.substring(class148.field2210.length());
                            } else if (var428.startsWith(class148.field2403)) {
                                var429 = 11;
                                var426 = var426.substring(class148.field2403.length());
                            } else if (client.field323 != 0) {
                                if (var428.startsWith(class148.field2382)) {
                                    var429 = 0;
                                    var426 = var426.substring(class148.field2382.length());
                                } else if (var428.startsWith(class148.field2384)) {
                                    var429 = 1;
                                    var426 = var426.substring(class148.field2384.length());
                                } else if (var428.startsWith(class148.field2469)) {
                                    var429 = 2;
                                    var426 = var426.substring(class148.field2469.length());
                                } else if (var428.startsWith(class148.field2388)) {
                                    var429 = 3;
                                    var426 = var426.substring(class148.field2388.length());
                                } else if (var428.startsWith(class148.field2433)) {
                                    var429 = 4;
                                    var426 = var426.substring(class148.field2433.length());
                                } else if (var428.startsWith(class148.field2392)) {
                                    var429 = 5;
                                    var426 = var426.substring(class148.field2392.length());
                                } else if (var428.startsWith(class148.field2394)) {
                                    var429 = 6;
                                    var426 = var426.substring(class148.field2394.length());
                                } else if (var428.startsWith(class148.field2225)) {
                                    var429 = 7;
                                    var426 = var426.substring(class148.field2225.length());
                                } else if (var428.startsWith(class148.field2323)) {
                                    var429 = 8;
                                    var426 = var426.substring(class148.field2323.length());
                                } else if (var428.startsWith(class148.field2400)) {
                                    var429 = 9;
                                    var426 = var426.substring(class148.field2400.length());
                                } else if (var428.startsWith(class148.field2402)) {
                                    var429 = 10;
                                    var426 = var426.substring(class148.field2402.length());
                                } else if (var428.startsWith(class148.field2244)) {
                                    var429 = 11;
                                    var426 = var426.substring(class148.field2244.length());
                                }
                            }
                            String var430 = var426.toLowerCase();
                            byte var431 = 0;
                            if (var430.startsWith(class148.field2223)) {
                                var431 = 1;
                                var426 = var426.substring(class148.field2223.length());
                            } else if (var430.startsWith(class148.field2407)) {
                                var431 = 2;
                                var426 = var426.substring(class148.field2407.length());
                            } else if (var430.startsWith(class148.field2409)) {
                                var431 = 3;
                                var426 = var426.substring(class148.field2409.length());
                            } else if (var430.startsWith(class148.field2297)) {
                                var431 = 4;
                                var426 = var426.substring(class148.field2297.length());
                            } else if (var430.startsWith(class148.field2278)) {
                                var431 = 5;
                                var426 = var426.substring(class148.field2278.length());
                            } else if (client.field323 != 0) {
                                if (var430.startsWith(class148.field2406)) {
                                    var431 = 1;
                                    var426 = var426.substring(class148.field2406.length());
                                } else if (var430.startsWith(class148.field2408)) {
                                    var431 = 2;
                                    var426 = var426.substring(class148.field2408.length());
                                } else if (var430.startsWith(class148.field2305)) {
                                    var431 = 3;
                                    var426 = var426.substring(class148.field2305.length());
                                } else if (var430.startsWith(class148.field2412)) {
                                    var431 = 4;
                                    var426 = var426.substring(class148.field2412.length());
                                } else if (var430.startsWith(class148.field2414)) {
                                    var431 = 5;
                                    var426 = var426.substring(class148.field2414.length());
                                }
                            }
                            client.field488.method2480(55);
                            client.field488.method2213(0);
                            int var432 = client.field488.field1889;
                            client.field488.method2213(var427);
                            client.field488.method2213(var429);
                            client.field488.method2213(var431);
                            class114 var433 = client.field488;
                            int var434 = var433.field1889;
                            byte[] var435 = class156.method1666(var426);
                            var433.method2397(var435.length);
                            var433.field1889 += Statics.field3078.method2157(var435, 0, var435.length, var433.field1888, var433.field1889);
                            client.field488.method2225(client.field488.field1889 - var432);
                            continue;
                        }
                        if (var470 == 5009) {
                            var6 -= 2;
                            String var436 = field737[var6];
                            String var437 = field737[var6 + 1];
                            client.field488.method2480(171);
                            client.field488.method2214(0);
                            int var438 = client.field488.field1889;
                            client.field488.method2219(var436);
                            class114 var439 = client.field488;
                            int var440 = var439.field1889;
                            byte[] var441 = class156.method1666(var437);
                            var439.method2397(var441.length);
                            var439.field1889 += Statics.field3078.method2157(var441, 0, var441.length, var439.field1888, var439.field1889);
                            client.field488.method2321(client.field488.field1889 - var438);
                            continue;
                        }
                        if (var470 == 5015) {
                            String var442;
                            if (Statics.field1710 == null || Statics.field1710.field32 == null) {
                                var442 = "";
                            } else {
                                var442 = Statics.field1710.field32;
                            }
                            field737[var6++] = var442;
                            continue;
                        }
                        if (var470 == 5016) {
                            field736[var5++] = client.field462;
                            continue;
                        }
                        if (var470 == 5017) {
                            var5--;
                            int var443 = field736[var5];
                            field736[var5++] = class11.method2523(var443);
                            continue;
                        }
                        if (var470 == 5018) {
                            var5--;
                            int var444 = field736[var5];
                            int[] var445 = field736;
                            int var446 = var5++;
                            class33 var447 = (class33) class11.field152.method3471((long) var444);
                            int var448;
                            if (var447 == null) {
                                var448 = -1;
                            } else if (class11.field154.field2993 == var447.field2997) {
                                var448 = -1;
                            } else {
                                var448 = ((class33) var447.field2997).field726;
                            }
                            var445[var446] = var448;
                            continue;
                        }
                        if (var470 == 5019) {
                            var5--;
                            int var449 = field736[var5];
                            field736[var5++] = class11.method13(var449);
                            continue;
                        }
                        if (var470 == 5020) {
                            var6--;
                            String var450 = field737[var6];
                            client.method2581(var450);
                            continue;
                        }
                        if (var470 == 5021) {
                            var6--;
                            client.field463 = field737[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var470 == 5022) {
                            field737[var6++] = client.field463;
                            continue;
                        }
                    }
                } else {
                    class164 var84;
                    if (var470 >= 2000) {
                        var470 -= 1000;
                        var5--;
                        var84 = Statics.method2717(field736[var5]);
                    } else {
                        var84 = var58 ? Statics.field645 : Statics.field704;
                    }
                    if (var470 == 1300) {
                        var5--;
                        int var85 = field736[var5] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var6--;
                            var84.method3106(var85, field737[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var470 == 1301) {
                        var5 -= 2;
                        int var86 = field736[var5];
                        int var87 = field736[var5 + 1];
                        var84.field2642 = class164.method3587(var86, var87);
                        continue;
                    }
                    if (var470 == 1302) {
                        var5--;
                        var84.field2778 = field736[var5] == 1;
                        continue;
                    }
                    if (var470 == 1303) {
                        var5--;
                        var84.field2724 = field736[var5];
                        continue;
                    }
                    if (var470 == 1304) {
                        var5--;
                        var84.field2725 = field736[var5];
                        continue;
                    }
                    if (var470 == 1305) {
                        var6--;
                        var84.field2721 = field737[var6];
                        continue;
                    }
                    if (var470 == 1306) {
                        var6--;
                        var84.field2779 = field737[var6];
                        continue;
                    }
                    if (var470 == 1307) {
                        var84.field2722 = null;
                        continue;
                    }
                }
                if (var470 < 5400) {
                    if (var470 == 5306) {
                        field736[var5++] = client.method2159();
                        continue;
                    }
                    if (var470 == 5307) {
                        var5--;
                        int var451 = field736[var5];
                        if (var451 == 1 || var451 == 2) {
                            client.method143(var451);
                        }
                        continue;
                    }
                    if (var470 == 5308) {
                        field736[var5++] = Statics.field608.field137;
                        continue;
                    }
                    if (var470 == 5309) {
                        var5--;
                        int var452 = field736[var5];
                        if (var452 == 1 || var452 == 2) {
                            Statics.field608.field137 = var452;
                            class9.method1415();
                        }
                        continue;
                    }
                }
                if (var470 >= 5600 || var470 != 5504) {
                    if (var470 < 6300) {
                        if (var470 == 6200) {
                            var5 -= 2;
                            client.field420 = (short) field736[var5];
                            if (client.field420 <= 0) {
                                client.field420 = 256;
                            }
                            client.field339 = (short) field736[var5 + 1];
                            if (client.field339 <= 0) {
                                client.field339 = 205;
                            }
                            continue;
                        }
                        if (var470 == 6201) {
                            var5 -= 2;
                            client.field499 = (short) field736[var5];
                            if (client.field499 <= 0) {
                                client.field499 = 256;
                            }
                            client.field500 = (short) field736[var5 + 1];
                            if (client.field500 <= 0) {
                                client.field500 = 320;
                            }
                            continue;
                        }
                        if (var470 == 6202) {
                            var5 -= 4;
                            client.field269 = (short) field736[var5];
                            if (client.field269 <= 0) {
                                client.field269 = 1;
                            }
                            client.field502 = (short) field736[var5 + 1];
                            if (client.field502 <= 0) {
                                client.field502 = 32767;
                            } else if (client.field502 < client.field269) {
                                client.field502 = client.field269;
                            }
                            client.field503 = (short) field736[var5 + 2];
                            if (client.field503 <= 0) {
                                client.field503 = 1;
                            }
                            client.field367 = (short) field736[var5 + 3];
                            if (client.field367 <= 0) {
                                client.field367 = 32767;
                            } else if (client.field367 < client.field503) {
                                client.field367 = client.field503;
                            }
                            continue;
                        }
                        if (var470 == 6203) {
                            if (client.field423 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = -1;
                            } else {
                                client.method749(0, 0, client.field423.field2665, client.field423.field2666, false);
                                field736[var5++] = client.field507;
                                field736[var5++] = client.field374;
                            }
                            continue;
                        }
                        if (var470 == 6204) {
                            field736[var5++] = client.field499;
                            field736[var5++] = client.field500;
                            continue;
                        }
                        if (var470 == 6205) {
                            field736[var5++] = client.field420;
                            field736[var5++] = client.field339;
                            continue;
                        }
                    }
                    if (var470 < 6600) {
                        if (var470 == 6500) {
                            field736[var5++] = class24.method30() ? 1 : 0;
                            continue;
                        }
                        if (var470 == 6501) {
                            class24 var455 = class24.method2479();
                            if (var455 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                                field736[var5++] = 0;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                            } else {
                                field736[var5++] = var455.field601;
                                field736[var5++] = var455.field586;
                                field737[var6++] = var455.field595;
                                field736[var5++] = var455.field596;
                                field736[var5++] = var455.field583;
                                field737[var6++] = var455.field594;
                            }
                            continue;
                        }
                        if (var470 == 6502) {
                            class24 var456 = class24.method2711();
                            if (var456 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                                field736[var5++] = 0;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                            } else {
                                field736[var5++] = var456.field601;
                                field736[var5++] = var456.field586;
                                field737[var6++] = var456.field595;
                                field736[var5++] = var456.field596;
                                field736[var5++] = var456.field583;
                                field737[var6++] = var456.field594;
                            }
                            continue;
                        }
                        if (var470 == 6506) {
                            var5--;
                            int var457 = field736[var5];
                            class24 var458 = null;
                            for (int var459 = 0; var459 < class24.field587; var459++) {
                                if (Statics.field591[var459].field601 == var457) {
                                    var458 = Statics.field591[var459];
                                    break;
                                }
                            }
                            if (var458 == null) {
                                field736[var5++] = -1;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                                field736[var5++] = 0;
                                field736[var5++] = 0;
                                field737[var6++] = "";
                            } else {
                                field736[var5++] = var458.field601;
                                field736[var5++] = var458.field586;
                                field737[var6++] = var458.field595;
                                field736[var5++] = var458.field596;
                                field736[var5++] = var458.field583;
                                field737[var6++] = var458.field594;
                            }
                            continue;
                        }
                        if (var470 == 6507) {
                            var5 -= 4;
                            int var460 = field736[var5];
                            boolean var461 = field736[var5 + 1] == 1;
                            int var462 = field736[var5 + 2];
                            boolean var463 = field736[var5 + 3] == 1;
                            class24.method884(var460, var461, var462, var463);
                            continue;
                        }
                        if (var470 == 6511) {
                            var5--;
                            int var464 = field736[var5];
                            if (var464 >= 0 && var464 < class24.field587) {
                                class24 var465 = Statics.field591[var464];
                                field736[var5++] = var465.field601;
                                field736[var5++] = var465.field586;
                                field737[var6++] = var465.field595;
                                field736[var5++] = var465.field596;
                                field736[var5++] = var465.field583;
                                field737[var6++] = var465.field594;
                                continue;
                            }
                            field736[var5++] = -1;
                            field736[var5++] = 0;
                            field737[var6++] = "";
                            field736[var5++] = 0;
                            field736[var5++] = 0;
                            field737[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var453 = field736[var5];
                int var454 = field736[var5 + 1];
                if (!client.field491) {
                    client.field261 = var453;
                    client.field324 = var454;
                }
            }
        } catch (Exception var469) {
            StringBuilder var467 = new StringBuilder(30);
            var467.append("").append(var4.field3007).append(" ");
            for (int var468 = field738 - 1; var468 >= 0; var468--) {
                var467.append("").append(field739[var468].field187.field3007).append(" ");
            }
            var467.append("").append(var10);
            class140.method1864(var467.toString(), var469);
        }
    }

    @ObfuscatedName("et.d(II)V")
    public static void method2916(int arg0) {
        if (arg0 == -1 || !class164.method3404(arg0)) {
            return;
        }
        class164[] var1 = Statics.field2653[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class164 var3 = var1[var2];
            if (var3.field2729 != null) {
                class1 var4 = new class1();
                var4.field1 = var3;
                var4.field2 = var3.field2729;
                method31(var4, 2000000);
            }
        }
    }
}
