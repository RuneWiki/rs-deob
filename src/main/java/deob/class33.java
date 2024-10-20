package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("al")
public class class33 {

    @ObfuscatedName("al.l")
    public static int[] field724 = new int[5];

    @ObfuscatedName("al.m")
    public static int[][] field725 = new int[5][5000];

    @ObfuscatedName("al.w")
    public static int[] field726 = new int[1000];

    @ObfuscatedName("al.e")
    public static String[] field731 = new String[1000];

    @ObfuscatedName("al.n")
    public static int field728 = 0;

    @ObfuscatedName("al.s")
    public static class13[] field729 = new class13[50];

    @ObfuscatedName("al.d")
    public static Calendar field721 = Calendar.getInstance();

    @ObfuscatedName("al.x")
    public static final String[] field720 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    public class33() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.a(La;B)V")
    public static void method182(class1 arg0) {
        method106(arg0, 200000);
    }

    @ObfuscatedName("n.v(La;II)V")
    public static void method106(class1 arg0, int arg1) {
        Object[] var2 = arg0.field6;
        int var3 = (Integer) var2[0];
        class19 var4 = class19.method2625(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field534;
        int[] var9 = var4.field537;
        byte var10 = -1;
        field728 = 0;
        try {
            Statics.field727 = new int[var4.field541];
            int var11 = 0;
            Statics.field723 = new String[var4.field535];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2649;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field12;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field10 == null ? -1 : arg0.field10.field2665;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2649;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2665;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field727[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field7;
                    }
                    Statics.field723[var12++] = var15;
                }
            }
            int var16 = 0;
            label2716: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var439 = var8[var7];
                if (var439 < 100) {
                    if (var439 == 0) {
                        field726[var5++] = var9[var7];
                        continue;
                    }
                    if (var439 == 1) {
                        int var17 = var9[var7];
                        field726[var5++] = class159.field2701[var17];
                        continue;
                    }
                    if (var439 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class159.field2701[var18] = field726[var5];
                        client.method99(var18);
                        continue;
                    }
                    if (var439 == 3) {
                        field731[var6++] = var4.field542[var7];
                        continue;
                    }
                    if (var439 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var439 == 7) {
                        var5 -= 2;
                        if (field726[var5 + 1] != field726[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 8) {
                        var5 -= 2;
                        if (field726[var5 + 1] == field726[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 9) {
                        var5 -= 2;
                        if (field726[var5] < field726[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 10) {
                        var5 -= 2;
                        if (field726[var5] > field726[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 21) {
                        if (field728 == 0) {
                            return;
                        }
                        class13 var19 = field729[--field728];
                        var4 = var19.field193;
                        var8 = var4.field534;
                        var9 = var4.field537;
                        var7 = var19.field189;
                        Statics.field727 = var19.field192;
                        Statics.field723 = var19.field191;
                        continue;
                    }
                    if (var439 == 25) {
                        int var20 = var9[var7];
                        field726[var5++] = class159.method2538(var20);
                        continue;
                    }
                    if (var439 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field726[var5];
                        class43 var23 = class43.method552(var21);
                        int var24 = var23.field980;
                        int var25 = var23.field981;
                        int var26 = var23.field982;
                        int var27 = class159.field2702[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class159.field2701[var24] = class159.field2701[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var439 == 31) {
                        var5 -= 2;
                        if (field726[var5] <= field726[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 32) {
                        var5 -= 2;
                        if (field726[var5] >= field726[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var439 == 33) {
                        field726[var5++] = Statics.field727[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var439 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field727[var10001] = field726[var5];
                        continue;
                    }
                    if (var439 == 35) {
                        field731[var6++] = Statics.field723[var9[var7]];
                        continue;
                    }
                    if (var439 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field723[var10001] = field731[var6];
                        continue;
                    }
                    if (var439 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field731;
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
                        field731[var6++] = var31;
                        continue;
                    }
                    if (var439 == 38) {
                        var5--;
                        continue;
                    }
                    if (var439 == 39) {
                        var6--;
                        continue;
                    }
                    if (var439 == 40) {
                        int var41 = var9[var7];
                        class19 var42 = class19.method2625(var41);
                        int[] var43 = new int[var42.field541];
                        String[] var44 = new String[var42.field535];
                        for (int var45 = 0; var45 < var42.field539; var45++) {
                            var43[var45] = field726[var5 - var42.field539 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field540; var46++) {
                            var44[var46] = field731[var6 - var42.field540 + var46];
                        }
                        var5 -= var42.field539;
                        var6 -= var42.field540;
                        class13 var47 = new class13();
                        var47.field193 = var4;
                        var47.field189 = var7;
                        var47.field192 = Statics.field727;
                        var47.field191 = Statics.field723;
                        field729[++field728 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field534;
                        var9 = var42.field537;
                        var7 = -1;
                        Statics.field727 = var43;
                        Statics.field723 = var44;
                        continue;
                    }
                    if (var439 == 42) {
                        field726[var5++] = client.field294[var9[var7]];
                        continue;
                    }
                    if (var439 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field294[var10001] = field726[var5];
                        continue;
                    }
                    if (var439 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field726[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field724[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2716;
                                }
                                field725[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field726[var5];
                        if (var54 >= 0 && var54 < field724[var53]) {
                            field726[var5++] = field725[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field726[var5];
                        if (var56 >= 0 && var56 < field724[var55]) {
                            field725[var55][var56] = field726[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var439 == 47) {
                        String var57 = client.field459[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field731[var6++] = var57;
                        continue;
                    }
                    if (var439 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field459[var10001] = field731[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var439 < 1000) {
                    if (var439 == 100) {
                        var5 -= 3;
                        int var59 = field726[var5];
                        int var60 = field726[var5 + 1];
                        int var61 = field726[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class157 var62 = class157.method1871(var59);
                        if (var62.field2682 == null) {
                            var62.field2682 = new class157[var61 + 1];
                        }
                        if (var62.field2682.length <= var61) {
                            class157[] var63 = new class157[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2682.length; var64++) {
                                var63[var64] = var62.field2682[var64];
                            }
                            var62.field2682 = var63;
                        }
                        if (var61 > 0 && var62.field2682[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class157 var65 = new class157();
                        var65.field2573 = var60;
                        var65.field2587 = var65.field2649 = var62.field2649;
                        var65.field2665 = var61;
                        var65.field2595 = true;
                        var62.field2682[var61] = var65;
                        if (var58) {
                            Statics.field716 = var65;
                        } else {
                            Statics.field1939 = var65;
                        }
                        client.method1372(var62);
                        continue;
                    }
                    if (var439 == 101) {
                        class157 var66 = var58 ? Statics.field716 : Statics.field1939;
                        class157 var67 = class157.method1871(var66.field2649);
                        var67.field2682[var66.field2665] = null;
                        client.method1372(var67);
                        continue;
                    }
                    if (var439 == 102) {
                        var5--;
                        class157 var68 = class157.method1871(field726[var5]);
                        var68.field2682 = null;
                        client.method1372(var68);
                        continue;
                    }
                    if (var439 == 200) {
                        var5 -= 2;
                        int var69 = field726[var5];
                        int var70 = field726[var5 + 1];
                        class157 var71 = class157.method598(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field726[var5++] = 1;
                            if (var58) {
                                Statics.field716 = var71;
                            } else {
                                Statics.field1939 = var71;
                            }
                            continue;
                        }
                        field726[var5++] = 0;
                        continue;
                    }
                } else if (!(var439 < 1000 || var439 >= 1100) || !(var439 < 2000 || var439 >= 2100)) {
                    class157 var72;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var72 = class157.method1871(field726[var5]);
                    } else {
                        var72 = var58 ? Statics.field716 : Statics.field1939;
                    }
                    if (var439 == 1000) {
                        var5 -= 2;
                        var72.field2576 = field726[var5];
                        var72.field2688 = field726[var5 + 1];
                        client.method1372(var72);
                        continue;
                    }
                    if (var439 == 1001) {
                        var5 -= 2;
                        var72.field2580 = field726[var5];
                        var72.field2581 = field726[var5 + 1];
                        client.method1372(var72);
                        continue;
                    }
                    if (var439 == 1003) {
                        var5--;
                        boolean var73 = field726[var5] == 1;
                        if (var72.field2583 != var73) {
                            var72.field2583 = var73;
                            client.method1372(var72);
                        }
                        continue;
                    }
                } else if (!(var439 < 1100 || var439 >= 1200) || !(var439 < 2100 || var439 >= 2200)) {
                    class157 var74;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var74 = class157.method1871(field726[var5]);
                    } else {
                        var74 = var58 ? Statics.field716 : Statics.field1939;
                    }
                    if (var439 == 1100) {
                        var5 -= 2;
                        var74.field2586 = field726[var5];
                        if (var74.field2586 > var74.field2625 - var74.field2580) {
                            var74.field2586 = var74.field2625 - var74.field2580;
                        }
                        if (var74.field2586 < 0) {
                            var74.field2586 = 0;
                        }
                        var74.field2585 = field726[var5 + 1];
                        if (var74.field2585 > var74.field2577 - var74.field2581) {
                            var74.field2585 = var74.field2577 - var74.field2581;
                        }
                        if (var74.field2585 < 0) {
                            var74.field2585 = 0;
                        }
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1101) {
                        var5--;
                        var74.field2588 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1102) {
                        var5--;
                        var74.field2592 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1103) {
                        var5--;
                        var74.field2593 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1104) {
                        var5--;
                        var74.field2594 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1105) {
                        var5--;
                        var74.field2629 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1106) {
                        var5--;
                        var74.field2597 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1107) {
                        var5--;
                        var74.field2598 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1108) {
                        var74.field2657 = 1;
                        var5--;
                        var74.field2604 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1109) {
                        var5 -= 6;
                        var74.field2609 = field726[var5];
                        var74.field2610 = field726[var5 + 1];
                        var74.field2611 = field726[var5 + 2];
                        var74.field2680 = field726[var5 + 3];
                        var74.field2613 = field726[var5 + 4];
                        var74.field2614 = field726[var5 + 5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1110) {
                        var5--;
                        int var75 = field726[var5];
                        if (var74.field2607 != var75) {
                            var74.field2607 = var75;
                            var74.field2662 = 0;
                            var74.field2654 = 0;
                            client.method1372(var74);
                        }
                        continue;
                    }
                    if (var439 == 1111) {
                        var5--;
                        var74.field2685 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1112) {
                        var6--;
                        String var76 = field731[var6];
                        if (!var76.equals(var74.field2619)) {
                            var74.field2619 = var76;
                            client.method1372(var74);
                        }
                        continue;
                    }
                    if (var439 == 1113) {
                        var5--;
                        var74.field2684 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1114) {
                        var5 -= 3;
                        var74.field2622 = field726[var5];
                        var74.field2606 = field726[var5 + 1];
                        var74.field2621 = field726[var5 + 2];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1115) {
                        var5--;
                        var74.field2624 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1116) {
                        var5--;
                        var74.field2690 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1117) {
                        var5--;
                        var74.field2600 = field726[var5];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1118) {
                        var5--;
                        var74.field2601 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1119) {
                        var5--;
                        var74.field2651 = field726[var5] == 1;
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1120) {
                        var5 -= 2;
                        var74.field2625 = field726[var5];
                        var74.field2577 = field726[var5 + 1];
                        client.method1372(var74);
                        continue;
                    }
                    if (var439 == 1121) {
                        client.method36(var74.field2649, var74.field2665);
                        client.field425 = var74;
                        client.method1372(var74);
                        continue;
                    }
                } else if (var439 >= 1200 && var439 < 1300 || var439 >= 2200 && var439 < 2300) {
                    class157 var77;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var77 = class157.method1871(field726[var5]);
                    } else {
                        var77 = var58 ? Statics.field716 : Statics.field1939;
                    }
                    client.method1372(var77);
                    if (var439 == 1200 || var439 == 1205 || var439 == 1212) {
                        var5 -= 2;
                        int var78 = field726[var5];
                        int var79 = field726[var5 + 1];
                        var77.field2678 = var78;
                        var77.field2679 = var79;
                        class46 var80 = class46.method740(var78);
                        var77.field2611 = var80.field1027;
                        var77.field2680 = var80.field1028;
                        var77.field2613 = var80.field1033;
                        var77.field2609 = var80.field1030;
                        var77.field2610 = var80.field1011;
                        var77.field2614 = var80.field1026;
                        if (var439 == 1205) {
                            var77.field2681 = 0;
                        } else if (var439 == 1212 | var80.field1032 == 1) {
                            var77.field2681 = 1;
                        } else {
                            var77.field2681 = 2;
                        }
                        if (var77.field2580 > 0) {
                            var77.field2614 = var77.field2614 * 32 / var77.field2580;
                        }
                        continue;
                    }
                    if (var439 == 1201) {
                        var77.field2657 = 2;
                        var5--;
                        var77.field2604 = field726[var5];
                        continue;
                    }
                    if (var439 == 1202) {
                        var77.field2657 = 3;
                        var77.field2604 = Statics.field1358.field42.method2937();
                        continue;
                    }
                } else if ((var439 < 1300 || var439 >= 1400) && (var439 < 2300 || var439 >= 2400)) {
                    if (var439 >= 1400 && var439 < 1500 || var439 >= 2400 && var439 < 2500) {
                        class157 var85;
                        if (var439 >= 2000) {
                            var439 -= 1000;
                            var5--;
                            var85 = class157.method1871(field726[var5]);
                        } else {
                            var85 = var58 ? Statics.field716 : Statics.field1939;
                        }
                        var6--;
                        String var86 = field731[var6];
                        int[] var87 = null;
                        if (var86.length() > 0 && var86.charAt(var86.length() - 1) == 'Y') {
                            var5--;
                            int var88 = field726[var5];
                            if (var88 > 0) {
                                var87 = new int[var88];
                                while (var88-- > 0) {
                                    var5--;
                                    var87[var88] = field726[var5];
                                }
                            }
                            var86 = var86.substring(0, var86.length() - 1);
                        }
                        Object[] var89 = new Object[var86.length() + 1];
                        for (int var90 = var89.length - 1; var90 >= 1; var90--) {
                            if (var86.charAt(var90 - 1) == 's') {
                                var6--;
                                var89[var90] = field731[var6];
                            } else {
                                var5--;
                                var89[var90] = Integer.valueOf(field726[var5]);
                            }
                        }
                        var5--;
                        int var91 = field726[var5];
                        if (var91 == -1) {
                            var89 = null;
                        } else {
                            var89[0] = Integer.valueOf(var91);
                        }
                        if (var439 == 1400) {
                            var85.field2646 = var89;
                        }
                        if (var439 == 1401) {
                            var85.field2644 = var89;
                        }
                        if (var439 == 1402) {
                            var85.field2643 = var89;
                        }
                        if (var439 == 1403) {
                            var85.field2617 = var89;
                        }
                        if (var439 == 1404) {
                            var85.field2647 = var89;
                        }
                        if (var439 == 1405) {
                            var85.field2648 = var89;
                        }
                        if (var439 == 1406) {
                            var85.field2658 = var89;
                        }
                        if (var439 == 1407) {
                            var85.field2572 = var89;
                            var85.field2653 = var87;
                        }
                        if (var439 == 1408) {
                            var85.field2618 = var89;
                        }
                        if (var439 == 1409) {
                            var85.field2659 = var89;
                        }
                        if (var439 == 1410) {
                            var85.field2664 = var89;
                        }
                        if (var439 == 1411) {
                            var85.field2642 = var89;
                        }
                        if (var439 == 1412) {
                            var85.field2571 = var89;
                        }
                        if (var439 == 1414) {
                            var85.field2590 = var89;
                            var85.field2655 = var87;
                        }
                        if (var439 == 1415) {
                            var85.field2656 = var89;
                            var85.field2568 = var87;
                        }
                        if (var439 == 1416) {
                            var85.field2616 = var89;
                        }
                        if (var439 == 1417) {
                            var85.field2660 = var89;
                        }
                        if (var439 == 1418) {
                            var85.field2661 = var89;
                        }
                        if (var439 == 1419) {
                            var85.field2623 = var89;
                        }
                        if (var439 == 1420) {
                            var85.field2663 = var89;
                        }
                        if (var439 == 1421) {
                            var85.field2605 = var89;
                        }
                        if (var439 == 1422) {
                            var85.field2645 = var89;
                        }
                        if (var439 == 1423) {
                            var85.field2666 = var89;
                        }
                        if (var439 == 1424) {
                            var85.field2667 = var89;
                        }
                        if (var439 == 1425) {
                            var85.field2668 = var89;
                        }
                        if (var439 == 1426) {
                            var85.field2669 = var89;
                        }
                        var85.field2639 = true;
                        continue;
                    }
                    if (var439 < 1600) {
                        class157 var92 = var58 ? Statics.field716 : Statics.field1939;
                        if (var439 == 1500) {
                            field726[var5++] = var92.field2576;
                            continue;
                        }
                        if (var439 == 1501) {
                            field726[var5++] = var92.field2688;
                            continue;
                        }
                        if (var439 == 1502) {
                            field726[var5++] = var92.field2580;
                            continue;
                        }
                        if (var439 == 1503) {
                            field726[var5++] = var92.field2581;
                            continue;
                        }
                        if (var439 == 1504) {
                            field726[var5++] = var92.field2583 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 1505) {
                            field726[var5++] = var92.field2587;
                            continue;
                        }
                    } else if (var439 < 1700) {
                        class157 var93 = var58 ? Statics.field716 : Statics.field1939;
                        if (var439 == 1600) {
                            field726[var5++] = var93.field2586;
                            continue;
                        }
                        if (var439 == 1601) {
                            field726[var5++] = var93.field2585;
                            continue;
                        }
                        if (var439 == 1602) {
                            field731[var6++] = var93.field2619;
                            continue;
                        }
                        if (var439 == 1603) {
                            field726[var5++] = var93.field2625;
                            continue;
                        }
                        if (var439 == 1604) {
                            field726[var5++] = var93.field2577;
                            continue;
                        }
                        if (var439 == 1605) {
                            field726[var5++] = var93.field2614;
                            continue;
                        }
                        if (var439 == 1606) {
                            field726[var5++] = var93.field2611;
                            continue;
                        }
                        if (var439 == 1607) {
                            field726[var5++] = var93.field2613;
                            continue;
                        }
                        if (var439 == 1608) {
                            field726[var5++] = var93.field2680;
                            continue;
                        }
                    } else if (var439 < 1800) {
                        class157 var94 = var58 ? Statics.field716 : Statics.field1939;
                        if (var439 == 1700) {
                            field726[var5++] = var94.field2678;
                            continue;
                        }
                        if (var439 == 1701) {
                            if (var94.field2678 == -1) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = var94.field2679;
                            }
                            continue;
                        }
                        if (var439 == 1702) {
                            field726[var5++] = var94.field2665;
                            continue;
                        }
                    } else if (var439 < 1900) {
                        class157 var95 = var58 ? Statics.field716 : Statics.field1939;
                        if (var439 == 1800) {
                            int[] var96 = field726;
                            int var97 = var5++;
                            int var98 = client.method34(var95);
                            int var99 = var98 >> 11 & 0x3F;
                            var96[var97] = var99;
                            continue;
                        }
                        if (var439 == 1801) {
                            var5--;
                            int var100 = field726[var5];
                            int var440 = var100 - 1;
                            if (var95.field2633 != null && var440 < var95.field2633.length && var95.field2633[var440] != null) {
                                field731[var6++] = var95.field2633[var440];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 1802) {
                            if (var95.field2632 == null) {
                                field731[var6++] = "";
                            } else {
                                field731[var6++] = var95.field2632;
                            }
                            continue;
                        }
                    } else if (var439 < 2600) {
                        var5--;
                        class157 var101 = class157.method1871(field726[var5]);
                        if (var439 == 2500) {
                            field726[var5++] = var101.field2576;
                            continue;
                        }
                        if (var439 == 2501) {
                            field726[var5++] = var101.field2688;
                            continue;
                        }
                        if (var439 == 2502) {
                            field726[var5++] = var101.field2580;
                            continue;
                        }
                        if (var439 == 2503) {
                            field726[var5++] = var101.field2581;
                            continue;
                        }
                        if (var439 == 2504) {
                            field726[var5++] = var101.field2583 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 2505) {
                            field726[var5++] = var101.field2587;
                            continue;
                        }
                    } else if (var439 < 2700) {
                        var5--;
                        class157 var102 = class157.method1871(field726[var5]);
                        if (var439 == 2600) {
                            field726[var5++] = var102.field2586;
                            continue;
                        }
                        if (var439 == 2601) {
                            field726[var5++] = var102.field2585;
                            continue;
                        }
                        if (var439 == 2602) {
                            field731[var6++] = var102.field2619;
                            continue;
                        }
                        if (var439 == 2603) {
                            field726[var5++] = var102.field2625;
                            continue;
                        }
                        if (var439 == 2604) {
                            field726[var5++] = var102.field2577;
                            continue;
                        }
                        if (var439 == 2605) {
                            field726[var5++] = var102.field2614;
                            continue;
                        }
                        if (var439 == 2606) {
                            field726[var5++] = var102.field2611;
                            continue;
                        }
                        if (var439 == 2607) {
                            field726[var5++] = var102.field2613;
                            continue;
                        }
                        if (var439 == 2608) {
                            field726[var5++] = var102.field2680;
                            continue;
                        }
                    } else if (var439 < 2800) {
                        if (var439 == 2700) {
                            var5--;
                            class157 var103 = class157.method1871(field726[var5]);
                            field726[var5++] = var103.field2678;
                            continue;
                        }
                        if (var439 == 2701) {
                            var5--;
                            class157 var104 = class157.method1871(field726[var5]);
                            if (var104.field2678 == -1) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = var104.field2679;
                            }
                            continue;
                        }
                        if (var439 == 2702) {
                            var5--;
                            int var105 = field726[var5];
                            class4 var106 = (class4) client.field422.method3231((long) var105);
                            if (var106 == null) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = 1;
                            }
                            continue;
                        }
                    } else if (var439 < 2900) {
                        var5--;
                        class157 var107 = class157.method1871(field726[var5]);
                        if (var439 == 2800) {
                            int[] var108 = field726;
                            int var109 = var5++;
                            int var110 = client.method34(var107);
                            int var111 = var110 >> 11 & 0x3F;
                            var108[var109] = var111;
                            continue;
                        }
                        if (var439 == 2801) {
                            var5--;
                            int var112 = field726[var5];
                            int var441 = var112 - 1;
                            if (var107.field2633 != null && var441 < var107.field2633.length && var107.field2633[var441] != null) {
                                field731[var6++] = var107.field2633[var441];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 2802) {
                            if (var107.field2632 == null) {
                                field731[var6++] = "";
                            } else {
                                field731[var6++] = var107.field2632;
                            }
                            continue;
                        }
                    } else if (var439 < 3200) {
                        if (var439 == 3100) {
                            var6--;
                            String var113 = field731[var6];
                            class10.method2599(0, "", var113);
                            continue;
                        }
                        if (var439 == 3101) {
                            var5 -= 2;
                            client.method165(Statics.field1358, field726[var5], field726[var5 + 1]);
                            continue;
                        }
                        if (var439 == 3103) {
                            client.method530();
                            continue;
                        }
                        if (var439 == 3104) {
                            var6--;
                            String var114 = field731[var6];
                            int var115 = 0;
                            if (class213.method521(var114)) {
                                var115 = class213.method2071(var114);
                            }
                            client.field301.method2376(167);
                            client.field301.method2120(var115);
                            continue;
                        }
                        if (var439 == 3105) {
                            var6--;
                            String var116 = field731[var6];
                            client.field301.method2376(147);
                            client.field301.method2117(var116.length() + 1);
                            client.field301.method2122(var116);
                            continue;
                        }
                        if (var439 == 3106) {
                            var6--;
                            String var117 = field731[var6];
                            client.field301.method2376(200);
                            client.field301.method2117(var117.length() + 1);
                            client.field301.method2122(var117);
                            continue;
                        }
                        if (var439 == 3107) {
                            var5--;
                            int var118 = field726[var5];
                            var6--;
                            String var119 = field731[var6];
                            client.method98(var118, var119);
                            continue;
                        }
                        if (var439 == 3108) {
                            var5 -= 3;
                            int var120 = field726[var5];
                            int var121 = field726[var5 + 1];
                            int var122 = field726[var5 + 2];
                            class157 var123 = class157.method1871(var122);
                            client.method1584(var123, var120, var121);
                            continue;
                        }
                        if (var439 == 3109) {
                            var5 -= 2;
                            int var124 = field726[var5];
                            int var125 = field726[var5 + 1];
                            class157 var126 = var58 ? Statics.field716 : Statics.field1939;
                            client.method1584(var126, var124, var125);
                            continue;
                        }
                        if (var439 == 3110) {
                            var5--;
                            Statics.field1816 = field726[var5] == 1;
                            continue;
                        }
                        if (var439 == 3111) {
                            field726[var5++] = Statics.field101.field142 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3112) {
                            var5--;
                            Statics.field101.field142 = field726[var5] == 1;
                            class9.method531();
                            continue;
                        }
                        if (var439 == 3113) {
                            var6--;
                            String var127 = field731[var6];
                            var5--;
                            boolean var128 = field726[var5] == 1;
                            class129.method497(var127, var128, false);
                            continue;
                        }
                        if (var439 == 3115) {
                            var5--;
                            int var129 = field726[var5];
                            client.field301.method2376(10);
                            client.field301.method2188(var129);
                            continue;
                        }
                    } else if (var439 < 3300) {
                        if (var439 == 3200) {
                            var5 -= 3;
                            int var130 = field726[var5];
                            int var131 = field726[var5 + 1];
                            int var132 = field726[var5 + 2];
                            if (client.field498 != 0 && var131 != 0 && client.field397 < 50) {
                                client.field285[client.field397] = var130;
                                client.field503[client.field397] = var131;
                                client.field268[client.field397] = var132;
                                client.field506[client.field397] = null;
                                client.field505[client.field397] = 0;
                                client.field397++;
                            }
                            continue;
                        }
                        if (var439 == 3201) {
                            var5--;
                            client.method599(field726[var5]);
                            continue;
                        }
                        if (var439 == 3202) {
                            var5 -= 2;
                            int var133 = field726[var5];
                            int var10000 = field726[var5 + 1];
                            if (client.field495 != 0 && var133 != -1) {
                                class166.method130(Statics.field290, var133, 0, client.field495, false);
                                client.field408 = true;
                            }
                            continue;
                        }
                    } else if (var439 < 3400) {
                        if (var439 == 3300) {
                            field726[var5++] = client.field266;
                            continue;
                        }
                        if (var439 == 3301) {
                            var5 -= 2;
                            int var135 = field726[var5];
                            int var136 = field726[var5 + 1];
                            int[] var137 = field726;
                            int var138 = var5++;
                            class14 var139 = (class14) class14.field213.method3231((long) var135);
                            int var140;
                            if (var139 == null) {
                                var140 = -1;
                            } else if (var136 >= 0 && var136 < var139.field199.length) {
                                var140 = var139.field199[var136];
                            } else {
                                var140 = -1;
                            }
                            var137[var138] = var140;
                            continue;
                        }
                        if (var439 == 3302) {
                            var5 -= 2;
                            int var141 = field726[var5];
                            int var142 = field726[var5 + 1];
                            field726[var5++] = class14.method2080(var141, var142);
                            continue;
                        }
                        if (var439 == 3303) {
                            var5 -= 2;
                            int var143 = field726[var5];
                            int var144 = field726[var5 + 1];
                            field726[var5++] = class14.method907(var143, var144);
                            continue;
                        }
                        if (var439 == 3304) {
                            var5--;
                            int var145 = field726[var5];
                            int[] var146 = field726;
                            int var147 = var5++;
                            class45 var148 = (class45) class45.field1005.method3181((long) var145);
                            class45 var149;
                            if (var148 == null) {
                                byte[] var150 = Statics.field1004.method2731(5, var145);
                                class45 var151 = new class45();
                                if (var150 != null) {
                                    var151.method854(new class110(var150));
                                }
                                class45.field1005.method3183(var151, (long) var145);
                                var149 = var151;
                            } else {
                                var149 = var148;
                            }
                            var146[var147] = var149.field1003;
                            continue;
                        }
                        if (var439 == 3305) {
                            var5--;
                            int var152 = field726[var5];
                            field726[var5++] = client.field394[var152];
                            continue;
                        }
                        if (var439 == 3306) {
                            var5--;
                            int var153 = field726[var5];
                            field726[var5++] = client.field398[var153];
                            continue;
                        }
                        if (var439 == 3307) {
                            var5--;
                            int var154 = field726[var5];
                            field726[var5++] = client.field399[var154];
                            continue;
                        }
                        if (var439 == 3308) {
                            int var155 = Statics.field572;
                            int var156 = (Statics.field1358.field793 >> 7) + Statics.field1935;
                            int var157 = (Statics.field1358.field736 >> 7) + Statics.field1820;
                            field726[var5++] = (var155 << 28) + (var156 << 14) + var157;
                            continue;
                        }
                        if (var439 == 3309) {
                            var5--;
                            int var158 = field726[var5];
                            field726[var5++] = var158 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var439 == 3310) {
                            var5--;
                            int var159 = field726[var5];
                            field726[var5++] = var159 >> 28;
                            continue;
                        }
                        if (var439 == 3311) {
                            var5--;
                            int var160 = field726[var5];
                            field726[var5++] = var160 & 0x3FFF;
                            continue;
                        }
                        if (var439 == 3312) {
                            field726[var5++] = client.field261 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3313) {
                            var5 -= 2;
                            int var161 = field726[var5] + 32768;
                            int var162 = field726[var5 + 1];
                            int[] var163 = field726;
                            int var164 = var5++;
                            class14 var165 = (class14) class14.field213.method3231((long) var161);
                            int var166;
                            if (var165 == null) {
                                var166 = -1;
                            } else if (var162 >= 0 && var162 < var165.field199.length) {
                                var166 = var165.field199[var162];
                            } else {
                                var166 = -1;
                            }
                            var163[var164] = var166;
                            continue;
                        }
                        if (var439 == 3314) {
                            var5 -= 2;
                            int var167 = field726[var5] + 32768;
                            int var168 = field726[var5 + 1];
                            field726[var5++] = class14.method2080(var167, var168);
                            continue;
                        }
                        if (var439 == 3315) {
                            var5 -= 2;
                            int var169 = field726[var5] + 32768;
                            int var170 = field726[var5 + 1];
                            field726[var5++] = class14.method907(var169, var170);
                            continue;
                        }
                        if (var439 == 3316) {
                            if (client.field337 >= 2) {
                                field726[var5++] = client.field337;
                            } else {
                                field726[var5++] = 0;
                            }
                            continue;
                        }
                        if (var439 == 3317) {
                            field726[var5++] = client.field258;
                            continue;
                        }
                        if (var439 == 3318) {
                            field726[var5++] = client.field256;
                            continue;
                        }
                        if (var439 == 3321) {
                            field726[var5++] = client.field437;
                            continue;
                        }
                        if (var439 == 3322) {
                            field726[var5++] = client.field427;
                            continue;
                        }
                        if (var439 == 3323) {
                            if (client.field329) {
                                field726[var5++] = 1;
                            } else {
                                field726[var5++] = 0;
                            }
                            continue;
                        }
                        if (var439 == 3324) {
                            field726[var5++] = client.field358;
                            continue;
                        }
                    } else if (var439 < 3500) {
                        if (var439 == 3400) {
                            var5 -= 2;
                            int var171 = field726[var5];
                            int var172 = field726[var5 + 1];
                            class44 var173 = class44.method3559(var171);
                            if (var173.field991 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field994; var174++) {
                                if (var173.field1001[var174] == var172) {
                                    field731[var6++] = var173.field993[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field731[var6++] = var173.field992;
                            }
                            continue;
                        }
                        if (var439 == 3408) {
                            var5 -= 4;
                            int var175 = field726[var5];
                            int var176 = field726[var5 + 1];
                            int var177 = field726[var5 + 2];
                            int var178 = field726[var5 + 3];
                            class44 var179 = class44.method3559(var177);
                            if (var179.field990 == var175 && var179.field991 == var176) {
                                for (int var180 = 0; var180 < var179.field994; var180++) {
                                    if (var179.field1001[var180] == var178) {
                                        if (var176 == 115) {
                                            field731[var6++] = var179.field993[var180];
                                        } else {
                                            field726[var5++] = var179.field996[var180];
                                        }
                                        var179 = null;
                                        break;
                                    }
                                }
                                if (var179 != null) {
                                    if (var176 == 115) {
                                        field731[var6++] = var179.field992;
                                    } else {
                                        field726[var5++] = var179.field988;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field731[var6++] = "null";
                            } else {
                                field726[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var439 < 3700) {
                        if (var439 == 3600) {
                            if (client.field327 == 0) {
                                field726[var5++] = -2;
                            } else if (client.field327 == 1) {
                                field726[var5++] = -1;
                            } else {
                                field726[var5++] = client.field513;
                            }
                            continue;
                        }
                        if (var439 == 3601) {
                            var5--;
                            int var181 = field726[var5];
                            if (client.field327 == 2 && var181 < client.field513) {
                                field731[var6++] = client.field515[var181].field233;
                                field731[var6++] = client.field515[var181].field232;
                                continue;
                            }
                            field731[var6++] = "";
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3602) {
                            var5--;
                            int var182 = field726[var5];
                            if (client.field327 == 2 && var182 < client.field513) {
                                field726[var5++] = client.field515[var182].field235;
                                continue;
                            }
                            field726[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3603) {
                            var5--;
                            int var183 = field726[var5];
                            if (client.field327 == 2 && var183 < client.field513) {
                                field726[var5++] = client.field515[var183].field234;
                                continue;
                            }
                            field726[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3604) {
                            var6--;
                            String var184 = field731[var6];
                            var5--;
                            int var185 = field726[var5];
                            client.field301.method2376(67);
                            class113 var186 = client.field301;
                            int var187 = var184.length() + 1;
                            var186.method2117(var187 + 1);
                            client.field301.method2122(var184);
                            client.field301.method2154(var185);
                            continue;
                        }
                        if (var439 == 3605) {
                            var6--;
                            String var188 = field731[var6];
                            client.method2425(var188);
                            continue;
                        }
                        if (var439 == 3606) {
                            var6--;
                            String var189 = field731[var6];
                            client.method2421(var189);
                            continue;
                        }
                        if (var439 == 3607) {
                            var6--;
                            String var190 = field731[var6];
                            if (var190 == null) {
                                continue;
                            }
                            if ((client.field434 < 100 || client.field417 == 1) && client.field434 < 400) {
                                String var191 = class214.method2062(var190, Statics.field67);
                                if (var191 == null) {
                                    continue;
                                }
                                for (int var192 = 0; var192 < client.field434; var192++) {
                                    class8 var193 = client.field518[var192];
                                    String var194 = class214.method2062(var193.field137, Statics.field67);
                                    if (var194 != null && var194.equals(var191)) {
                                        class10.method2599(31, "", var190 + class147.field2350);
                                        continue label2716;
                                    }
                                    if (var193.field138 != null) {
                                        String var195 = class214.method2062(var193.field138, Statics.field67);
                                        if (var195 != null && var195.equals(var191)) {
                                            class10.method2599(31, "", var190 + class147.field2350);
                                            continue label2716;
                                        }
                                    }
                                }
                                for (int var196 = 0; var196 < client.field513; var196++) {
                                    class16 var197 = client.field515[var196];
                                    String var198 = class214.method2062(var197.field233, Statics.field67);
                                    if (var198 != null && var198.equals(var191)) {
                                        class10.method2599(31, "", class147.field2198 + var190 + class147.field2356);
                                        continue label2716;
                                    }
                                    if (var197.field232 != null) {
                                        String var199 = class214.method2062(var197.field232, Statics.field67);
                                        if (var199 != null && var199.equals(var191)) {
                                            class10.method2599(31, "", class147.field2198 + var190 + class147.field2356);
                                            continue label2716;
                                        }
                                    }
                                }
                                if (class214.method2062(Statics.field1358.field37, Statics.field67).equals(var191)) {
                                    class10.method2599(31, "", class147.field2352);
                                } else {
                                    client.field301.method2376(109);
                                    class113 var200 = client.field301;
                                    int var201 = var190.length() + 1;
                                    var200.method2117(var201);
                                    client.field301.method2122(var190);
                                }
                                continue;
                            }
                            class10.method2599(31, "", class147.field2185);
                            continue;
                        }
                        if (var439 == 3608) {
                            var6--;
                            String var202 = field731[var6];
                            client.method1967(var202);
                            continue;
                        }
                        if (var439 == 3609) {
                            var6--;
                            String var203 = field731[var6];
                            class142[] var204 = class142.method488();
                            for (int var205 = 0; var205 < var204.length; var205++) {
                                class142 var206 = var204[var205];
                                if (var206.field2142 != -1) {
                                    int var208 = var206.field2142;
                                    String var209 = "<img=" + var208 + ">";
                                    if (var203.startsWith(var209)) {
                                        var203 = var203.substring(6 + Integer.toString(var206.field2142).length());
                                        break;
                                    }
                                }
                            }
                            field726[var5++] = client.method38(var203, false) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3611) {
                            if (client.field485 == null) {
                                field731[var6++] = "";
                            } else {
                                String[] var210 = field731;
                                int var211 = var6++;
                                String var212 = client.field485;
                                String var213 = class212.method2699(class212.method2420(var212));
                                if (var213 == null) {
                                    var213 = "";
                                }
                                var210[var211] = var213;
                            }
                            continue;
                        }
                        if (var439 == 3612) {
                            if (client.field485 == null) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = Statics.field1672;
                            }
                            continue;
                        }
                        if (var439 == 3613) {
                            var5--;
                            int var215 = field726[var5];
                            if (client.field485 != null && var215 < Statics.field1672) {
                                field731[var6++] = Statics.field225[var215].field576;
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3614) {
                            var5--;
                            int var216 = field726[var5];
                            if (client.field485 != null && var216 < Statics.field1672) {
                                field726[var5++] = Statics.field225[var216].field574;
                                continue;
                            }
                            field726[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3615) {
                            var5--;
                            int var217 = field726[var5];
                            if (client.field485 != null && var217 < Statics.field1672) {
                                field726[var5++] = Statics.field225[var217].field581;
                                continue;
                            }
                            field726[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3616) {
                            field726[var5++] = Statics.field1934;
                            continue;
                        }
                        if (var439 == 3617) {
                            var6--;
                            String var218 = field731[var6];
                            if (Statics.field225 != null) {
                                client.field301.method2376(243);
                                client.field301.method2117(class110.method529(var218));
                                client.field301.method2122(var218);
                            }
                            continue;
                        }
                        if (var439 == 3618) {
                            field726[var5++] = Statics.field1516;
                            continue;
                        }
                        if (var439 == 3619) {
                            var6--;
                            String var219 = field731[var6];
                            client.method587(var219);
                            continue;
                        }
                        if (var439 == 3620) {
                            client.method1766();
                            continue;
                        }
                        if (var439 == 3621) {
                            if (client.field327 == 0) {
                                field726[var5++] = -1;
                            } else {
                                field726[var5++] = client.field434;
                            }
                            continue;
                        }
                        if (var439 == 3622) {
                            var5--;
                            int var220 = field726[var5];
                            if (client.field327 != 0 && var220 < client.field434) {
                                field731[var6++] = client.field518[var220].field137;
                                field731[var6++] = client.field518[var220].field138;
                                continue;
                            }
                            field731[var6++] = "";
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 3623) {
                            String var221;
                            label2479: {
                                var6--;
                                var221 = field731[var6];
                                String var223 = "<img=0>";
                                if (!var221.startsWith(var223)) {
                                    String var225 = "<img=1>";
                                    if (!var221.startsWith(var225)) {
                                        break label2479;
                                    }
                                }
                                var221 = var221.substring(7);
                            }
                            field726[var5++] = client.method1408(var221) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3624) {
                            var5--;
                            int var226 = field726[var5];
                            if (Statics.field225 != null && var226 < Statics.field1672 && Statics.field225[var226].field576.equalsIgnoreCase(Statics.field1358.field37)) {
                                field726[var5++] = 1;
                                continue;
                            }
                            field726[var5++] = 0;
                            continue;
                        }
                        if (var439 == 3625) {
                            if (client.field341 == null) {
                                field731[var6++] = "";
                            } else {
                                String[] var227 = field731;
                                int var228 = var6++;
                                String var229 = client.field341;
                                String var230 = class212.method2699(class212.method2420(var229));
                                if (var230 == null) {
                                    var230 = "";
                                }
                                var227[var228] = var230;
                            }
                            continue;
                        }
                    } else if (var439 < 4000) {
                        if (var439 == 3903) {
                            var5--;
                            int var232 = field726[var5];
                            field726[var5++] = client.field522[var232].method3420();
                            continue;
                        }
                        if (var439 == 3904) {
                            var5--;
                            int var233 = field726[var5];
                            field726[var5++] = client.field522[var233].field2960;
                            continue;
                        }
                        if (var439 == 3905) {
                            var5--;
                            int var234 = field726[var5];
                            field726[var5++] = client.field522[var234].field2959;
                            continue;
                        }
                        if (var439 == 3906) {
                            var5--;
                            int var235 = field726[var5];
                            field726[var5++] = client.field522[var235].field2962;
                            continue;
                        }
                        if (var439 == 3907) {
                            var5--;
                            int var236 = field726[var5];
                            field726[var5++] = client.field522[var236].field2963;
                            continue;
                        }
                        if (var439 == 3908) {
                            var5--;
                            int var237 = field726[var5];
                            field726[var5++] = client.field522[var237].field2961;
                            continue;
                        }
                        if (var439 == 3910) {
                            var5--;
                            int var238 = field726[var5];
                            int var239 = client.field522[var238].method3418();
                            field726[var5++] = var239 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3911) {
                            var5--;
                            int var240 = field726[var5];
                            int var241 = client.field522[var240].method3418();
                            field726[var5++] = var241 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3912) {
                            var5--;
                            int var242 = field726[var5];
                            int var243 = client.field522[var242].method3418();
                            field726[var5++] = var243 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3913) {
                            var5--;
                            int var244 = field726[var5];
                            int var245 = client.field522[var244].method3418();
                            field726[var5++] = var245 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 3914) {
                            var5--;
                            boolean var246 = field726[var5] == 1;
                            if (Statics.field1494 != null) {
                                Statics.field1494.method3433(class204.field2971, var246);
                            }
                            continue;
                        }
                        if (var439 == 3915) {
                            var5--;
                            boolean var247 = field726[var5] == 1;
                            if (Statics.field1494 != null) {
                                Statics.field1494.method3433(class204.field2968, var247);
                            }
                            continue;
                        }
                        if (var439 == 3916) {
                            var5 -= 2;
                            boolean var248 = field726[var5] == 1;
                            boolean var249 = field726[var5 + 1] == 1;
                            if (Statics.field1494 != null) {
                                Statics.field1494.method3433(new class20(var249), var248);
                            }
                            continue;
                        }
                        if (var439 == 3917) {
                            var5--;
                            boolean var250 = field726[var5] == 1;
                            if (Statics.field1494 != null) {
                                Statics.field1494.method3433(class204.field2966, var250);
                            }
                            continue;
                        }
                        if (var439 == 3918) {
                            var5--;
                            boolean var251 = field726[var5] == 1;
                            if (Statics.field1494 != null) {
                                Statics.field1494.method3433(class204.field2970, var251);
                            }
                            continue;
                        }
                        if (var439 == 3919) {
                            field726[var5++] = Statics.field1494 == null ? 0 : Statics.field1494.field2969.size();
                            continue;
                        }
                        if (var439 == 3920) {
                            var5--;
                            int var252 = field726[var5];
                            class197 var253 = (class197) Statics.field1494.field2969.get(var252);
                            field726[var5++] = var253.field2939;
                            continue;
                        }
                        if (var439 == 3921) {
                            var5--;
                            int var254 = field726[var5];
                            class197 var255 = (class197) Statics.field1494.field2969.get(var254);
                            field731[var6++] = var255.method3377();
                            continue;
                        }
                        if (var439 == 3922) {
                            var5--;
                            int var256 = field726[var5];
                            class197 var257 = (class197) Statics.field1494.field2969.get(var256);
                            field731[var6++] = var257.method3378();
                            continue;
                        }
                        if (var439 == 3923) {
                            var5--;
                            int var258 = field726[var5];
                            class197 var259 = (class197) Statics.field1494.field2969.get(var258);
                            long var260 = class106.method2471() - Statics.field798 - var259.field2937;
                            int var262 = (int) (var260 / 3600000L);
                            int var263 = (int) ((var260 - (long) (var262 * 3600000)) / 60000L);
                            int var264 = (int) ((var260 - (long) (var262 * 3600000) - (long) (var263 * 60000)) / 1000L);
                            String var265 = var262 + ":" + var263 / 10 + var263 % 10 + ":" + var264 / 10 + var264 % 10;
                            field731[var6++] = var265;
                            continue;
                        }
                        if (var439 == 3924) {
                            var5--;
                            int var266 = field726[var5];
                            class197 var267 = (class197) Statics.field1494.field2969.get(var266);
                            field726[var5++] = var267.field2938.field2962;
                            continue;
                        }
                        if (var439 == 3925) {
                            var5--;
                            int var268 = field726[var5];
                            class197 var269 = (class197) Statics.field1494.field2969.get(var268);
                            field726[var5++] = var269.field2938.field2959;
                            continue;
                        }
                        if (var439 == 3926) {
                            var5--;
                            int var270 = field726[var5];
                            class197 var271 = (class197) Statics.field1494.field2969.get(var270);
                            field726[var5++] = var271.field2938.field2960;
                            continue;
                        }
                    } else if (var439 < 4100) {
                        if (var439 == 4000) {
                            var5 -= 2;
                            int var272 = field726[var5];
                            int var273 = field726[var5 + 1];
                            field726[var5++] = var272 + var273;
                            continue;
                        }
                        if (var439 == 4001) {
                            var5 -= 2;
                            int var274 = field726[var5];
                            int var275 = field726[var5 + 1];
                            field726[var5++] = var274 - var275;
                            continue;
                        }
                        if (var439 == 4002) {
                            var5 -= 2;
                            int var276 = field726[var5];
                            int var277 = field726[var5 + 1];
                            field726[var5++] = var276 * var277;
                            continue;
                        }
                        if (var439 == 4003) {
                            var5 -= 2;
                            int var278 = field726[var5];
                            int var279 = field726[var5 + 1];
                            field726[var5++] = var278 / var279;
                            continue;
                        }
                        if (var439 == 4004) {
                            var5--;
                            int var280 = field726[var5];
                            field726[var5++] = (int) (Math.random() * (double) var280);
                            continue;
                        }
                        if (var439 == 4005) {
                            var5--;
                            int var281 = field726[var5];
                            field726[var5++] = (int) (Math.random() * (double) (var281 + 1));
                            continue;
                        }
                        if (var439 == 4006) {
                            var5 -= 5;
                            int var282 = field726[var5];
                            int var283 = field726[var5 + 1];
                            int var284 = field726[var5 + 2];
                            int var285 = field726[var5 + 3];
                            int var286 = field726[var5 + 4];
                            field726[var5++] = (var283 - var282) * (var286 - var284) / (var285 - var284) + var282;
                            continue;
                        }
                        if (var439 == 4007) {
                            var5 -= 2;
                            int var287 = field726[var5];
                            int var288 = field726[var5 + 1];
                            field726[var5++] = var287 * var288 / 100 + var287;
                            continue;
                        }
                        if (var439 == 4008) {
                            var5 -= 2;
                            int var289 = field726[var5];
                            int var290 = field726[var5 + 1];
                            field726[var5++] = var289 | 0x1 << var290;
                            continue;
                        }
                        if (var439 == 4009) {
                            var5 -= 2;
                            int var291 = field726[var5];
                            int var292 = field726[var5 + 1];
                            field726[var5++] = var291 & -1 - (0x1 << var292);
                            continue;
                        }
                        if (var439 == 4010) {
                            var5 -= 2;
                            int var293 = field726[var5];
                            int var294 = field726[var5 + 1];
                            field726[var5++] = (var293 & 0x1 << var294) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var439 == 4011) {
                            var5 -= 2;
                            int var295 = field726[var5];
                            int var296 = field726[var5 + 1];
                            field726[var5++] = var295 % var296;
                            continue;
                        }
                        if (var439 == 4012) {
                            var5 -= 2;
                            int var297 = field726[var5];
                            int var298 = field726[var5 + 1];
                            if (var297 == 0) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = (int) Math.pow((double) var297, (double) var298);
                            }
                            continue;
                        }
                        if (var439 == 4013) {
                            var5 -= 2;
                            int var299 = field726[var5];
                            int var300 = field726[var5 + 1];
                            if (var299 == 0) {
                                field726[var5++] = 0;
                            } else if (var300 == 0) {
                                field726[var5++] = Integer.MAX_VALUE;
                            } else {
                                field726[var5++] = (int) Math.pow((double) var299, 1.0D / (double) var300);
                            }
                            continue;
                        }
                        if (var439 == 4014) {
                            var5 -= 2;
                            int var301 = field726[var5];
                            int var302 = field726[var5 + 1];
                            field726[var5++] = var301 & var302;
                            continue;
                        }
                        if (var439 == 4015) {
                            var5 -= 2;
                            int var303 = field726[var5];
                            int var304 = field726[var5 + 1];
                            field726[var5++] = var303 | var304;
                            continue;
                        }
                    } else if (var439 < 4200) {
                        if (var439 == 4100) {
                            var6--;
                            String var305 = field731[var6];
                            var5--;
                            int var306 = field726[var5];
                            field731[var6++] = var305 + var306;
                            continue;
                        }
                        if (var439 == 4101) {
                            var6 -= 2;
                            String var307 = field731[var6];
                            String var308 = field731[var6 + 1];
                            field731[var6++] = var307 + var308;
                            continue;
                        }
                        if (var439 == 4102) {
                            var6--;
                            String var309 = field731[var6];
                            var5--;
                            int var310 = field726[var5];
                            field731[var6++] = var309 + class213.method2426(var310, true);
                            continue;
                        }
                        if (var439 == 4103) {
                            var6--;
                            String var311 = field731[var6];
                            field731[var6++] = var311.toLowerCase();
                            continue;
                        }
                        if (var439 == 4104) {
                            var5--;
                            int var312 = field726[var5];
                            long var313 = ((long) var312 + 11745L) * 86400000L;
                            field721.setTime(new Date(var313));
                            int var315 = field721.get(5);
                            int var316 = field721.get(2);
                            int var317 = field721.get(1);
                            field731[var6++] = var315 + "-" + field720[var316] + "-" + var317;
                            continue;
                        }
                        if (var439 == 4105) {
                            var6 -= 2;
                            String var318 = field731[var6];
                            String var319 = field731[var6 + 1];
                            if (Statics.field1358.field42 != null && Statics.field1358.field42.field2711) {
                                field731[var6++] = var319;
                                continue;
                            }
                            field731[var6++] = var318;
                            continue;
                        }
                        if (var439 == 4106) {
                            var5--;
                            int var320 = field726[var5];
                            field731[var6++] = Integer.toString(var320);
                            continue;
                        }
                        if (var439 == 4107) {
                            var6 -= 2;
                            int[] var321 = field726;
                            int var322 = var5++;
                            int var323 = class216.method184(field731[var6], field731[var6 + 1], client.field263);
                            byte var324;
                            if (var323 > 0) {
                                var324 = 1;
                            } else if (var323 < 0) {
                                var324 = -1;
                            } else {
                                var324 = 0;
                            }
                            var321[var322] = var324;
                            continue;
                        }
                        if (var439 == 4108) {
                            var6--;
                            String var325 = field731[var6];
                            var5 -= 2;
                            int var326 = field726[var5];
                            int var327 = field726[var5 + 1];
                            byte[] var328 = Statics.field95.method2731(var327, 0);
                            class207 var329 = new class207(var328);
                            field726[var5++] = var329.method3446(var325, var326);
                            continue;
                        }
                        if (var439 == 4109) {
                            var6--;
                            String var330 = field731[var6];
                            var5 -= 2;
                            int var331 = field726[var5];
                            int var332 = field726[var5 + 1];
                            byte[] var333 = Statics.field95.method2731(var332, 0);
                            class207 var334 = new class207(var333);
                            field726[var5++] = var334.method3479(var330, var331);
                            continue;
                        }
                        if (var439 == 4110) {
                            var6 -= 2;
                            String var335 = field731[var6];
                            String var336 = field731[var6 + 1];
                            var5--;
                            if (field726[var5] == 1) {
                                field731[var6++] = var335;
                            } else {
                                field731[var6++] = var336;
                            }
                            continue;
                        }
                        if (var439 == 4111) {
                            var6--;
                            String var337 = field731[var6];
                            field731[var6++] = class206.method3447(var337);
                            continue;
                        }
                        if (var439 == 4112) {
                            var6--;
                            String var338 = field731[var6];
                            var5--;
                            int var339 = field726[var5];
                            field731[var6++] = var338 + (char) var339;
                            continue;
                        }
                        if (var439 == 4113) {
                            var5--;
                            int var340 = field726[var5];
                            int[] var341 = field726;
                            int var342 = var5++;
                            char var343 = (char) var340;
                            boolean var344;
                            if (var343 >= ' ' && var343 <= '~') {
                                var344 = true;
                            } else if (var343 >= 160 && var343 <= 255) {
                                var344 = true;
                            } else if (var343 == 8364 || var343 == 338 || var343 == 8212 || var343 == 339 || var343 == 376) {
                                var344 = true;
                            } else {
                                var344 = false;
                            }
                            var341[var342] = var344 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4114) {
                            var5--;
                            int var345 = field726[var5];
                            field726[var5++] = class213.method3399((char) var345) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4115) {
                            var5--;
                            int var346 = field726[var5];
                            int[] var347 = field726;
                            int var348 = var5++;
                            char var349 = (char) var346;
                            boolean var350 = var349 >= 'A' && var349 <= 'Z' || var349 >= 'a' && var349 <= 'z';
                            var347[var348] = var350 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4116) {
                            var5--;
                            int var351 = field726[var5];
                            field726[var5++] = class213.method3115((char) var351) ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4117) {
                            var6--;
                            String var352 = field731[var6];
                            if (var352 == null) {
                                field726[var5++] = 0;
                            } else {
                                field726[var5++] = var352.length();
                            }
                            continue;
                        }
                        if (var439 == 4118) {
                            var6--;
                            String var353 = field731[var6];
                            var5 -= 2;
                            int var354 = field726[var5];
                            int var355 = field726[var5 + 1];
                            field731[var6++] = var353.substring(var354, var355);
                            continue;
                        }
                        if (var439 == 4119) {
                            var6--;
                            String var356 = field731[var6];
                            StringBuilder var357 = new StringBuilder(var356.length());
                            boolean var358 = false;
                            for (int var359 = 0; var359 < var356.length(); var359++) {
                                char var360 = var356.charAt(var359);
                                if (var360 == '<') {
                                    var358 = true;
                                } else if (var360 == '>') {
                                    var358 = false;
                                } else if (!var358) {
                                    var357.append(var360);
                                }
                            }
                            field731[var6++] = var357.toString();
                            continue;
                        }
                        if (var439 == 4120) {
                            var6--;
                            String var361 = field731[var6];
                            var5--;
                            int var362 = field726[var5];
                            field726[var5++] = var361.indexOf(var362);
                            continue;
                        }
                        if (var439 == 4121) {
                            var6 -= 2;
                            String var363 = field731[var6];
                            String var364 = field731[var6 + 1];
                            var5--;
                            int var365 = field726[var5];
                            field726[var5++] = var363.indexOf(var364, var365);
                            continue;
                        }
                    } else if (var439 < 4300) {
                        if (var439 == 4200) {
                            var5--;
                            int var366 = field726[var5];
                            field731[var6++] = class46.method740(var366).field1024;
                            continue;
                        }
                        if (var439 == 4201) {
                            var5 -= 2;
                            int var367 = field726[var5];
                            int var368 = field726[var5 + 1];
                            class46 var369 = class46.method740(var367);
                            if (var368 >= 1 && var368 <= 5 && var369.field1037[var368 - 1] != null) {
                                field731[var6++] = var369.field1037[var368 - 1];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 4202) {
                            var5 -= 2;
                            int var370 = field726[var5];
                            int var371 = field726[var5 + 1];
                            class46 var372 = class46.method740(var370);
                            if (var371 >= 1 && var371 <= 5 && var372.field1036[var371 - 1] != null) {
                                field731[var6++] = var372.field1036[var371 - 1];
                                continue;
                            }
                            field731[var6++] = "";
                            continue;
                        }
                        if (var439 == 4203) {
                            var5--;
                            int var373 = field726[var5];
                            field726[var5++] = class46.method740(var373).field1048;
                            continue;
                        }
                        if (var439 == 4204) {
                            var5--;
                            int var374 = field726[var5];
                            field726[var5++] = class46.method740(var374).field1032 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4205) {
                            var5--;
                            int var375 = field726[var5];
                            class46 var376 = class46.method740(var375);
                            if (var376.field1052 == -1 && var376.field1051 >= 0) {
                                field726[var5++] = var376.field1051;
                                continue;
                            }
                            field726[var5++] = var375;
                            continue;
                        }
                        if (var439 == 4206) {
                            var5--;
                            int var377 = field726[var5];
                            class46 var378 = class46.method740(var377);
                            if (var378.field1052 >= 0 && var378.field1051 >= 0) {
                                field726[var5++] = var378.field1051;
                                continue;
                            }
                            field726[var5++] = var377;
                            continue;
                        }
                        if (var439 == 4207) {
                            var5--;
                            int var379 = field726[var5];
                            field726[var5++] = class46.method740(var379).field1014 ? 1 : 0;
                            continue;
                        }
                        if (var439 == 4210) {
                            var6--;
                            String var380 = field731[var6];
                            var5--;
                            int var381 = field726[var5];
                            client.method3369(var380, var381 == 1);
                            field726[var5++] = Statics.field179;
                            continue;
                        }
                        if (var439 == 4211) {
                            if (Statics.field1570 != null && Statics.field1286 < Statics.field179) {
                                field726[var5++] = Statics.field1570[++Statics.field1286 - 1] & 0xFFFF;
                                continue;
                            }
                            field726[var5++] = -1;
                            continue;
                        }
                        if (var439 == 4212) {
                            Statics.field1286 = 0;
                            continue;
                        }
                    } else if (var439 < 5100) {
                        if (var439 == 5000) {
                            field726[var5++] = client.field476;
                            continue;
                        }
                        if (var439 == 5001) {
                            var5 -= 3;
                            client.field476 = field726[var5];
                            int var382 = field726[var5 + 1];
                            class121[] var383 = new class121[] { class121.field1927, class121.field1928, class121.field1922 };
                            class121[] var384 = var383;
                            int var385 = 0;
                            class121 var387;
                            while (true) {
                                if (var385 >= var384.length) {
                                    var387 = null;
                                    break;
                                }
                                class121 var386 = var384[var385];
                                if (var386.field1923 == var382) {
                                    var387 = var386;
                                    break;
                                }
                                var385++;
                            }
                            Statics.field2054 = var387;
                            if (Statics.field2054 == null) {
                                Statics.field2054 = class121.field1927;
                            }
                            client.field477 = field726[var5 + 2];
                            client.field301.method2376(62);
                            client.field301.method2117(client.field476);
                            client.field301.method2117(Statics.field2054.field1923);
                            client.field301.method2117(client.field477);
                            continue;
                        }
                        if (var439 == 5002) {
                            var6--;
                            String var388 = field731[var6];
                            var5 -= 2;
                            int var389 = field726[var5];
                            int var390 = field726[var5 + 1];
                            client.field301.method2376(2);
                            class113 var391 = client.field301;
                            int var392 = var388.length() + 1;
                            var391.method2117(var392 + 2);
                            client.field301.method2122(var388);
                            client.field301.method2117(var389 - 1);
                            client.field301.method2117(var390);
                            continue;
                        }
                        if (var439 == 5003) {
                            var5 -= 2;
                            int var393 = field726[var5];
                            int var394 = field726[var5 + 1];
                            class32 var395 = class10.method28(var393, var394);
                            if (var395 == null) {
                                field726[var5++] = -1;
                                field726[var5++] = 0;
                                field731[var6++] = "";
                                field731[var6++] = "";
                                field731[var6++] = "";
                            } else {
                                field726[var5++] = var395.field719;
                                field726[var5++] = var395.field710;
                                field731[var6++] = var395.field712 == null ? "" : var395.field712;
                                field731[var6++] = var395.field713 == null ? "" : var395.field713;
                                field731[var6++] = var395.field714 == null ? "" : var395.field714;
                            }
                            continue;
                        }
                        if (var439 == 5004) {
                            var5--;
                            int var396 = field726[var5];
                            class32 var397 = class10.method1407(var396);
                            if (var397 == null) {
                                field726[var5++] = -1;
                                field726[var5++] = 0;
                                field731[var6++] = "";
                                field731[var6++] = "";
                                field731[var6++] = "";
                            } else {
                                field726[var5++] = var397.field717;
                                field726[var5++] = var397.field710;
                                field731[var6++] = var397.field712 == null ? "" : var397.field712;
                                field731[var6++] = var397.field713 == null ? "" : var397.field713;
                                field731[var6++] = var397.field714 == null ? "" : var397.field714;
                            }
                            continue;
                        }
                        if (var439 == 5005) {
                            if (Statics.field2054 == null) {
                                field726[var5++] = -1;
                            } else {
                                field726[var5++] = Statics.field2054.field1923;
                            }
                            continue;
                        }
                        if (var439 == 5008) {
                            var6--;
                            String var398 = field731[var6];
                            var5--;
                            int var399 = field726[var5];
                            String var400 = var398.toLowerCase();
                            byte var401 = 0;
                            if (var400.startsWith(class147.field2184)) {
                                var401 = 0;
                                var398 = var398.substring(class147.field2184.length());
                            } else if (var400.startsWith(class147.field2362)) {
                                var401 = 1;
                                var398 = var398.substring(class147.field2362.length());
                            } else if (var400.startsWith(class147.field2253)) {
                                var401 = 2;
                                var398 = var398.substring(class147.field2253.length());
                            } else if (var400.startsWith(class147.field2309)) {
                                var401 = 3;
                                var398 = var398.substring(class147.field2309.length());
                            } else if (var400.startsWith(class147.field2257)) {
                                var401 = 4;
                                var398 = var398.substring(class147.field2257.length());
                            } else if (var400.startsWith(class147.field2299)) {
                                var401 = 5;
                                var398 = var398.substring(class147.field2299.length());
                            } else if (var400.startsWith(class147.field2369)) {
                                var401 = 6;
                                var398 = var398.substring(class147.field2369.length());
                            } else if (var400.startsWith(class147.field2371)) {
                                var401 = 7;
                                var398 = var398.substring(class147.field2371.length());
                            } else if (var400.startsWith(class147.field2322)) {
                                var401 = 8;
                                var398 = var398.substring(class147.field2322.length());
                            } else if (var400.startsWith(class147.field2375)) {
                                var401 = 9;
                                var398 = var398.substring(class147.field2375.length());
                            } else if (var400.startsWith(class147.field2377)) {
                                var401 = 10;
                                var398 = var398.substring(class147.field2377.length());
                            } else if (var400.startsWith(class147.field2379)) {
                                var401 = 11;
                                var398 = var398.substring(class147.field2379.length());
                            } else if (client.field263 != 0) {
                                if (var400.startsWith(class147.field2320)) {
                                    var401 = 0;
                                    var398 = var398.substring(class147.field2320.length());
                                } else if (var400.startsWith(class147.field2360)) {
                                    var401 = 1;
                                    var398 = var398.substring(class147.field2360.length());
                                } else if (var400.startsWith(class147.field2302)) {
                                    var401 = 2;
                                    var398 = var398.substring(class147.field2302.length());
                                } else if (var400.startsWith(class147.field2364)) {
                                    var401 = 3;
                                    var398 = var398.substring(class147.field2364.length());
                                } else if (var400.startsWith(class147.field2263)) {
                                    var401 = 4;
                                    var398 = var398.substring(class147.field2263.length());
                                } else if (var400.startsWith(class147.field2368)) {
                                    var401 = 5;
                                    var398 = var398.substring(class147.field2368.length());
                                } else if (var400.startsWith(class147.field2370)) {
                                    var401 = 6;
                                    var398 = var398.substring(class147.field2370.length());
                                } else if (var400.startsWith(class147.field2372)) {
                                    var401 = 7;
                                    var398 = var398.substring(class147.field2372.length());
                                } else if (var400.startsWith(class147.field2404)) {
                                    var401 = 8;
                                    var398 = var398.substring(class147.field2404.length());
                                } else if (var400.startsWith(class147.field2376)) {
                                    var401 = 9;
                                    var398 = var398.substring(class147.field2376.length());
                                } else if (var400.startsWith(class147.field2378)) {
                                    var401 = 10;
                                    var398 = var398.substring(class147.field2378.length());
                                } else if (var400.startsWith(class147.field2396)) {
                                    var401 = 11;
                                    var398 = var398.substring(class147.field2396.length());
                                }
                            }
                            String var402 = var398.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class147.field2381)) {
                                var403 = 1;
                                var398 = var398.substring(class147.field2381.length());
                            } else if (var402.startsWith(class147.field2272)) {
                                var403 = 2;
                                var398 = var398.substring(class147.field2272.length());
                            } else if (var402.startsWith(class147.field2385)) {
                                var403 = 3;
                                var398 = var398.substring(class147.field2385.length());
                            } else if (var402.startsWith(class147.field2387)) {
                                var403 = 4;
                                var398 = var398.substring(class147.field2387.length());
                            } else if (var402.startsWith(class147.field2417)) {
                                var403 = 5;
                                var398 = var398.substring(class147.field2417.length());
                            } else if (client.field263 != 0) {
                                if (var402.startsWith(class147.field2382)) {
                                    var403 = 1;
                                    var398 = var398.substring(class147.field2382.length());
                                } else if (var402.startsWith(class147.field2384)) {
                                    var403 = 2;
                                    var398 = var398.substring(class147.field2384.length());
                                } else if (var402.startsWith(class147.field2386)) {
                                    var403 = 3;
                                    var398 = var398.substring(class147.field2386.length());
                                } else if (var402.startsWith(class147.field2388)) {
                                    var403 = 4;
                                    var398 = var398.substring(class147.field2388.length());
                                } else if (var402.startsWith(class147.field2390)) {
                                    var403 = 5;
                                    var398 = var398.substring(class147.field2390.length());
                                }
                            }
                            client.field301.method2376(63);
                            client.field301.method2117(0);
                            int var404 = client.field301.field1861;
                            client.field301.method2117(var399);
                            client.field301.method2117(var401);
                            client.field301.method2117(var403);
                            class113 var405 = client.field301;
                            int var406 = var405.field1861;
                            int var407 = var398.length();
                            byte[] var408 = new byte[var407];
                            for (int var409 = 0; var409 < var407; var409++) {
                                char var410 = var398.charAt(var409);
                                if (var410 > 0 && var410 < 128 || var410 >= 160 && var410 <= 255) {
                                    var408[var409] = (byte) var410;
                                } else if (var410 == 8364) {
                                    var408[var409] = -128;
                                } else if (var410 == 8218) {
                                    var408[var409] = -126;
                                } else if (var410 == 402) {
                                    var408[var409] = -125;
                                } else if (var410 == 8222) {
                                    var408[var409] = -124;
                                } else if (var410 == 8230) {
                                    var408[var409] = -123;
                                } else if (var410 == 8224) {
                                    var408[var409] = -122;
                                } else if (var410 == 8225) {
                                    var408[var409] = -121;
                                } else if (var410 == 710) {
                                    var408[var409] = -120;
                                } else if (var410 == 8240) {
                                    var408[var409] = -119;
                                } else if (var410 == 352) {
                                    var408[var409] = -118;
                                } else if (var410 == 8249) {
                                    var408[var409] = -117;
                                } else if (var410 == 338) {
                                    var408[var409] = -116;
                                } else if (var410 == 381) {
                                    var408[var409] = -114;
                                } else if (var410 == 8216) {
                                    var408[var409] = -111;
                                } else if (var410 == 8217) {
                                    var408[var409] = -110;
                                } else if (var410 == 8220) {
                                    var408[var409] = -109;
                                } else if (var410 == 8221) {
                                    var408[var409] = -108;
                                } else if (var410 == 8226) {
                                    var408[var409] = -107;
                                } else if (var410 == 8211) {
                                    var408[var409] = -106;
                                } else if (var410 == 8212) {
                                    var408[var409] = -105;
                                } else if (var410 == 732) {
                                    var408[var409] = -104;
                                } else if (var410 == 8482) {
                                    var408[var409] = -103;
                                } else if (var410 == 353) {
                                    var408[var409] = -102;
                                } else if (var410 == 8250) {
                                    var408[var409] = -101;
                                } else if (var410 == 339) {
                                    var408[var409] = -100;
                                } else if (var410 == 382) {
                                    var408[var409] = -98;
                                } else if (var410 == 376) {
                                    var408[var409] = -97;
                                } else {
                                    var408[var409] = 63;
                                }
                            }
                            var405.method2115(var408.length);
                            var405.field1861 += Statics.field2975.method2064(var408, 0, var408.length, var405.field1865, var405.field1861);
                            client.field301.method2206(client.field301.field1861 - var404);
                            continue;
                        }
                        if (var439 == 5009) {
                            var6 -= 2;
                            String var413 = field731[var6];
                            String var414 = field731[var6 + 1];
                            client.field301.method2376(130);
                            client.field301.method2188(0);
                            int var415 = client.field301.field1861;
                            client.field301.method2122(var413);
                            class113 var416 = client.field301;
                            int var417 = var416.field1861;
                            int var418 = var414.length();
                            byte[] var419 = new byte[var418];
                            for (int var420 = 0; var420 < var418; var420++) {
                                char var421 = var414.charAt(var420);
                                if (!(var421 <= 0 || var421 >= 128) || !(var421 < 160 || var421 > 255)) {
                                    var419[var420] = (byte) var421;
                                } else if (var421 == 8364) {
                                    var419[var420] = -128;
                                } else if (var421 == 8218) {
                                    var419[var420] = -126;
                                } else if (var421 == 402) {
                                    var419[var420] = -125;
                                } else if (var421 == 8222) {
                                    var419[var420] = -124;
                                } else if (var421 == 8230) {
                                    var419[var420] = -123;
                                } else if (var421 == 8224) {
                                    var419[var420] = -122;
                                } else if (var421 == 8225) {
                                    var419[var420] = -121;
                                } else if (var421 == 710) {
                                    var419[var420] = -120;
                                } else if (var421 == 8240) {
                                    var419[var420] = -119;
                                } else if (var421 == 352) {
                                    var419[var420] = -118;
                                } else if (var421 == 8249) {
                                    var419[var420] = -117;
                                } else if (var421 == 338) {
                                    var419[var420] = -116;
                                } else if (var421 == 381) {
                                    var419[var420] = -114;
                                } else if (var421 == 8216) {
                                    var419[var420] = -111;
                                } else if (var421 == 8217) {
                                    var419[var420] = -110;
                                } else if (var421 == 8220) {
                                    var419[var420] = -109;
                                } else if (var421 == 8221) {
                                    var419[var420] = -108;
                                } else if (var421 == 8226) {
                                    var419[var420] = -107;
                                } else if (var421 == 8211) {
                                    var419[var420] = -106;
                                } else if (var421 == 8212) {
                                    var419[var420] = -105;
                                } else if (var421 == 732) {
                                    var419[var420] = -104;
                                } else if (var421 == 8482) {
                                    var419[var420] = -103;
                                } else if (var421 == 353) {
                                    var419[var420] = -102;
                                } else if (var421 == 8250) {
                                    var419[var420] = -101;
                                } else if (var421 == 339) {
                                    var419[var420] = -100;
                                } else if (var421 == 382) {
                                    var419[var420] = -98;
                                } else if (var421 == 376) {
                                    var419[var420] = -97;
                                } else {
                                    var419[var420] = 63;
                                }
                            }
                            var416.method2115(var419.length);
                            var416.field1861 += Statics.field2975.method2064(var419, 0, var419.length, var416.field1865, var416.field1861);
                            client.field301.method2127(client.field301.field1861 - var415);
                            continue;
                        }
                        if (var439 == 5015) {
                            String var424;
                            if (Statics.field1358 == null || Statics.field1358.field37 == null) {
                                var424 = "";
                            } else {
                                var424 = Statics.field1358.field37;
                            }
                            field731[var6++] = var424;
                            continue;
                        }
                        if (var439 == 5016) {
                            field726[var5++] = client.field477;
                            continue;
                        }
                        if (var439 == 5017) {
                            var5--;
                            int var425 = field726[var5];
                            field726[var5++] = class10.method3176(var425);
                            continue;
                        }
                        if (var439 == 5018) {
                            var5--;
                            int var426 = field726[var5];
                            field726[var5++] = class10.method2928(var426);
                            continue;
                        }
                        if (var439 == 5019) {
                            var5--;
                            int var427 = field726[var5];
                            int[] var428 = field726;
                            int var429 = var5++;
                            class32 var430 = (class32) class10.field152.method3234((long) var427);
                            int var431;
                            if (var430 == null) {
                                var431 = -1;
                            } else if (class10.field155.field2893 == var430.field2898) {
                                var431 = -1;
                            } else {
                                var431 = ((class32) var430.field2898).field719;
                            }
                            var428[var429] = var431;
                            continue;
                        }
                        if (var439 == 5020) {
                            var6--;
                            String var432 = field731[var6];
                            client.method6(var432);
                            continue;
                        }
                        if (var439 == 5021) {
                            var6--;
                            client.field478 = field731[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var439 == 5022) {
                            field731[var6++] = client.field478;
                            continue;
                        }
                    }
                } else {
                    class157 var81;
                    if (var439 >= 2000) {
                        var439 -= 1000;
                        var5--;
                        var81 = class157.method1871(field726[var5]);
                    } else {
                        var81 = var58 ? Statics.field716 : Statics.field1939;
                    }
                    if (var439 == 1300) {
                        var5--;
                        int var82 = field726[var5] - 1;
                        if (var82 >= 0 && var82 <= 9) {
                            var6--;
                            var81.method2866(var82, field731[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var439 == 1301) {
                        var5 -= 2;
                        int var83 = field726[var5];
                        int var84 = field726[var5 + 1];
                        var81.field2634 = class157.method598(var83, var84);
                        continue;
                    }
                    if (var439 == 1302) {
                        var5--;
                        var81.field2637 = field726[var5] == 1;
                        continue;
                    }
                    if (var439 == 1303) {
                        var5--;
                        var81.field2635 = field726[var5];
                        continue;
                    }
                    if (var439 == 1304) {
                        var5--;
                        var81.field2603 = field726[var5];
                        continue;
                    }
                    if (var439 == 1305) {
                        var6--;
                        var81.field2632 = field731[var6];
                        continue;
                    }
                    if (var439 == 1306) {
                        var6--;
                        var81.field2638 = field731[var6];
                        continue;
                    }
                    if (var439 == 1307) {
                        var81.field2633 = null;
                        continue;
                    }
                }
                if (var439 >= 5600 || var439 != 5504) {
                    throw new IllegalStateException();
                }
                var5 -= 2;
                int var433 = field726[var5];
                int var434 = field726[var5 + 1];
                if (!client.field500) {
                    client.field335 = var433;
                    client.field443 = var434;
                }
            }
        } catch (Exception var438) {
            StringBuilder var436 = new StringBuilder(30);
            var436.append("").append(var4.field2908).append(" ");
            for (int var437 = field728 - 1; var437 >= 0; var437--) {
                var436.append("").append(field729[var437].field193.field2908).append(" ");
            }
            var436.append("").append(var10);
            class139.method2550(var436.toString(), var438);
        }
    }

    @ObfuscatedName("bn.i(II)V")
    public static void method1396(int arg0) {
        if (arg0 == -1 || !class157.method764(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2599[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3.field2677 != null) {
                class1 var4 = new class1();
                var4.field10 = var3;
                var4.field6 = var3.field2677;
                method106(var4, 2000000);
            }
        }
    }
}
