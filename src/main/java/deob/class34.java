package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class34 {

    @ObfuscatedName("ac.m")
    public static int[] field759 = new int[5];

    @ObfuscatedName("ac.h")
    public static int[][] field769 = new int[5][5000];

    @ObfuscatedName("ac.i")
    public static int[] field761 = new int[1000];

    @ObfuscatedName("ac.r")
    public static String[] field762 = new String[1000];

    @ObfuscatedName("ac.l")
    public static int field757 = 0;

    @ObfuscatedName("ac.f")
    public static class14[] field764 = new class14[50];

    @ObfuscatedName("ac.v")
    public static Calendar field760 = Calendar.getInstance();

    @ObfuscatedName("ac.x")
    public static final String[] field767 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ac.q")
    public static int field768 = 0;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fq.n(Ln;I)V")
    public static void method3076(class1 arg0) {
        method2707(arg0, 200000);
    }

    @ObfuscatedName("eh.o(Ln;IB)V")
    public static void method2707(class1 arg0, int arg1) {
        Object[] var2 = arg0.field1;
        int var3 = (Integer) var2[0];
        class20 var4 = class20.method3576(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field577;
        int[] var9 = var4.field566;
        byte var10 = -1;
        field757 = 0;
        try {
            Statics.field765 = new int[var4.field568];
            int var11 = 0;
            Statics.field1946 = new String[var4.field569];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field3;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2667;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field5 == null ? -1 : arg0.field5.field2660;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2667;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2660;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field4;
                    }
                    Statics.field765[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field1946[var12++] = var15;
                }
            }
            int var16 = 0;
            field768 = arg0.field11;
            label3088: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var477 = var8[var7];
                if (var477 < 100) {
                    if (var477 == 0) {
                        field761[var5++] = var9[var7];
                        continue;
                    }
                    if (var477 == 1) {
                        int var17 = var9[var7];
                        field761[var5++] = class167.field2811[var17];
                        continue;
                    }
                    if (var477 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class167.field2811[var18] = field761[var5];
                        client.method2074(var18);
                        continue;
                    }
                    if (var477 == 3) {
                        field762[var6++] = var4.field564[var7];
                        continue;
                    }
                    if (var477 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var477 == 7) {
                        var5 -= 2;
                        if (field761[var5 + 1] != field761[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 8) {
                        var5 -= 2;
                        if (field761[var5 + 1] == field761[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 9) {
                        var5 -= 2;
                        if (field761[var5] < field761[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 10) {
                        var5 -= 2;
                        if (field761[var5] > field761[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 21) {
                        if (field757 == 0) {
                            return;
                        }
                        class14 var19 = field764[--field757];
                        var4 = var19.field201;
                        var8 = var4.field577;
                        var9 = var4.field566;
                        var7 = var19.field198;
                        Statics.field765 = var19.field197;
                        Statics.field1946 = var19.field205;
                        continue;
                    }
                    if (var477 == 25) {
                        int var20 = var9[var7];
                        field761[var5++] = class167.method792(var20);
                        continue;
                    }
                    if (var477 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field761[var5];
                        class44 var23 = class44.method3574(var21);
                        int var24 = var23.field1027;
                        int var25 = var23.field1033;
                        int var26 = var23.field1028;
                        int var27 = class167.field2812[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class167.field2811[var24] = class167.field2811[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var477 == 31) {
                        var5 -= 2;
                        if (field761[var5] <= field761[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 32) {
                        var5 -= 2;
                        if (field761[var5] >= field761[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var477 == 33) {
                        field761[var5++] = Statics.field765[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var477 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field765[var10001] = field761[var5];
                        continue;
                    }
                    if (var477 == 35) {
                        field762[var6++] = Statics.field1946[var9[var7]];
                        continue;
                    }
                    if (var477 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1946[var10001] = field762[var6];
                        continue;
                    }
                    if (var477 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field762;
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
                        field762[var6++] = var31;
                        continue;
                    }
                    if (var477 == 38) {
                        var5--;
                        continue;
                    }
                    if (var477 == 39) {
                        var6--;
                        continue;
                    }
                    if (var477 == 40) {
                        int var41 = var9[var7];
                        class20 var42 = class20.method3576(var41);
                        int[] var43 = new int[var42.field568];
                        String[] var44 = new String[var42.field569];
                        for (int var45 = 0; var45 < var42.field578; var45++) {
                            var43[var45] = field761[var5 - var42.field578 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field571; var46++) {
                            var44[var46] = field762[var6 - var42.field571 + var46];
                        }
                        var5 -= var42.field578;
                        var6 -= var42.field571;
                        class14 var47 = new class14();
                        var47.field201 = var4;
                        var47.field198 = var7;
                        var47.field197 = Statics.field765;
                        var47.field205 = Statics.field1946;
                        field764[++field757 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field577;
                        var9 = var42.field566;
                        var7 = -1;
                        Statics.field765 = var43;
                        Statics.field1946 = var44;
                        continue;
                    }
                    if (var477 == 42) {
                        field761[var5++] = client.field473[var9[var7]];
                        continue;
                    }
                    if (var477 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        client.field473[var10001] = field761[var5];
                        continue;
                    }
                    if (var477 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field761[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field759[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3088;
                                }
                                field769[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var477 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field761[var5];
                        if (var54 >= 0 && var54 < field759[var53]) {
                            field761[var5++] = field769[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var477 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field761[var5];
                        if (var56 >= 0 && var56 < field759[var55]) {
                            field769[var55][var56] = field761[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var477 == 47) {
                        String var57 = client.field279[var9[var7]];
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field762[var6++] = var57;
                        continue;
                    }
                    if (var477 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        client.field279[var10001] = field762[var6];
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var477 < 1000) {
                    if (var477 == 100) {
                        var5 -= 3;
                        int var59 = field761[var5];
                        int var60 = field761[var5 + 1];
                        int var61 = field761[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class164 var62 = class164.method144(var59);
                        if (var62.field2781 == null) {
                            var62.field2781 = new class164[var61 + 1];
                        }
                        if (var62.field2781.length <= var61) {
                            class164[] var63 = new class164[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2781.length; var64++) {
                                var63[var64] = var62.field2781[var64];
                            }
                            var62.field2781 = var63;
                        }
                        if (var61 > 0 && var62.field2781[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class164 var65 = new class164();
                        var65.field2661 = var60;
                        var65.field2678 = var65.field2667 = var62.field2667;
                        var65.field2660 = var61;
                        var65.field2658 = true;
                        var62.field2781[var61] = var65;
                        if (var58) {
                            Statics.field3066 = var65;
                        } else {
                            Statics.field763 = var65;
                        }
                        client.method106(var62);
                        continue;
                    }
                    if (var477 == 101) {
                        class164 var66 = var58 ? Statics.field3066 : Statics.field763;
                        class164 var67 = class164.method144(var66.field2667);
                        var67.field2781[var66.field2660] = null;
                        client.method106(var67);
                        continue;
                    }
                    if (var477 == 102) {
                        var5--;
                        class164 var68 = class164.method144(field761[var5]);
                        var68.field2781 = null;
                        client.method106(var68);
                        continue;
                    }
                    if (var477 == 200) {
                        var5 -= 2;
                        int var69 = field761[var5];
                        int var70 = field761[var5 + 1];
                        class164 var71 = class164.method143(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field761[var5++] = 1;
                            if (var58) {
                                Statics.field3066 = var71;
                            } else {
                                Statics.field763 = var71;
                            }
                            continue;
                        }
                        field761[var5++] = 0;
                        continue;
                    }
                    if (var477 == 201) {
                        var5--;
                        class164 var72 = class164.method144(field761[var5]);
                        if (var72 == null) {
                            field761[var5++] = 0;
                        } else {
                            field761[var5++] = 1;
                            if (var58) {
                                Statics.field3066 = var72;
                            } else {
                                Statics.field763 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var477 < 1000 || var477 >= 1100) || !(var477 < 2000 || var477 >= 2100)) {
                    int var73 = -1;
                    class164 var74;
                    if (var477 >= 2000) {
                        var477 -= 1000;
                        var5--;
                        var73 = field761[var5];
                        var74 = class164.method144(var73);
                    } else {
                        var74 = var58 ? Statics.field3066 : Statics.field763;
                    }
                    if (var477 == 1000) {
                        var5 -= 4;
                        var74.field2666 = field761[var5];
                        var74.field2669 = field761[var5 + 1];
                        var74.field2664 = field761[var5 + 2];
                        var74.field2740 = field761[var5 + 3];
                        client.method106(var74);
                        client.method2168(var74);
                        if (var73 != -1 && var74.field2661 == 0) {
                            client.method2490(Statics.field2695[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var477 == 1001) {
                        var5 -= 4;
                        var74.field2670 = field761[var5];
                        var74.field2673 = field761[var5 + 1];
                        var74.field2684 = field761[var5 + 2];
                        var74.field2697 = field761[var5 + 3];
                        client.method106(var74);
                        client.method2168(var74);
                        if (var73 != -1 && var74.field2661 == 0) {
                            client.method2490(Statics.field2695[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var477 == 1003) {
                        var5--;
                        boolean var75 = field761[var5] == 1;
                        if (var74.field2702 != var75) {
                            var74.field2702 = var75;
                            client.method106(var74);
                        }
                        continue;
                    }
                    if (var477 == 1005) {
                        var5--;
                        var74.field2783 = field761[var5] == 1;
                        continue;
                    }
                } else if (var477 >= 1100 && var477 < 1200 || var477 >= 2100 && var477 < 2200) {
                    int var76 = -1;
                    class164 var77;
                    if (var477 >= 2000) {
                        var477 -= 1000;
                        var5--;
                        var76 = field761[var5];
                        var77 = class164.method144(var76);
                    } else {
                        var77 = var58 ? Statics.field3066 : Statics.field763;
                    }
                    if (var477 == 1100) {
                        var5 -= 2;
                        var77.field2790 = field761[var5];
                        if (var77.field2790 > var77.field2682 - var77.field2674) {
                            var77.field2790 = var77.field2682 - var77.field2674;
                        }
                        if (var77.field2790 < 0) {
                            var77.field2790 = 0;
                        }
                        var77.field2758 = field761[var5 + 1];
                        if (var77.field2758 > var77.field2683 - var77.field2675) {
                            var77.field2758 = var77.field2683 - var77.field2675;
                        }
                        if (var77.field2758 < 0) {
                            var77.field2758 = 0;
                        }
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1101) {
                        var5--;
                        var77.field2765 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1102) {
                        var5--;
                        var77.field2788 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1103) {
                        var5--;
                        var77.field2689 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1104) {
                        var5--;
                        var77.field2690 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1105) {
                        var5--;
                        var77.field2691 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1106) {
                        var5--;
                        var77.field2694 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1107) {
                        var5--;
                        var77.field2735 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1108) {
                        var77.field2700 = 1;
                        var5--;
                        var77.field2701 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1109) {
                        var5 -= 6;
                        var77.field2706 = field761[var5];
                        var77.field2707 = field761[var5 + 1];
                        var77.field2708 = field761[var5 + 2];
                        var77.field2709 = field761[var5 + 3];
                        var77.field2710 = field761[var5 + 4];
                        var77.field2711 = field761[var5 + 5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1110) {
                        var5--;
                        int var78 = field761[var5];
                        if (var77.field2679 != var78) {
                            var77.field2679 = var78;
                            var77.field2779 = 0;
                            var77.field2730 = 0;
                            client.method106(var77);
                        }
                        continue;
                    }
                    if (var477 == 1111) {
                        var5--;
                        var77.field2714 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1112) {
                        var6--;
                        String var79 = field762[var6];
                        if (!var79.equals(var77.field2717)) {
                            var77.field2717 = var79;
                            client.method106(var77);
                        }
                        continue;
                    }
                    if (var477 == 1113) {
                        var5--;
                        var77.field2751 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1114) {
                        var5 -= 3;
                        var77.field2720 = field761[var5];
                        var77.field2721 = field761[var5 + 1];
                        var77.field2775 = field761[var5 + 2];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1115) {
                        var5--;
                        var77.field2722 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1116) {
                        var5--;
                        var77.field2696 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1117) {
                        var5--;
                        var77.field2764 = field761[var5];
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1118) {
                        var5--;
                        var77.field2748 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1119) {
                        var5--;
                        var77.field2699 = field761[var5] == 1;
                        client.method106(var77);
                        continue;
                    }
                    if (var477 == 1120) {
                        var5 -= 2;
                        var77.field2682 = field761[var5];
                        var77.field2683 = field761[var5 + 1];
                        client.method106(var77);
                        if (var76 != -1 && var77.field2661 == 0) {
                            client.method2490(Statics.field2695[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var477 == 1121) {
                        client.method142(var77.field2667, var77.field2660);
                        client.field439 = var77;
                        client.method106(var77);
                        continue;
                    }
                } else if (var477 >= 1200 && var477 < 1300 || var477 >= 2200 && var477 < 2300) {
                    class164 var80;
                    if (var477 >= 2000) {
                        var477 -= 1000;
                        var5--;
                        var80 = class164.method144(field761[var5]);
                    } else {
                        var80 = var58 ? Statics.field3066 : Statics.field763;
                    }
                    client.method106(var80);
                    if (var477 == 1200 || var477 == 1205 || var477 == 1212) {
                        var5 -= 2;
                        int var81 = field761[var5];
                        int var82 = field761[var5 + 1];
                        var80.field2777 = var81;
                        var80.field2778 = var82;
                        class47 var83 = class47.method127(var81);
                        var80.field2708 = var83.field1074;
                        var80.field2709 = var83.field1087;
                        var80.field2710 = var83.field1062;
                        var80.field2706 = var83.field1077;
                        var80.field2707 = var83.field1086;
                        var80.field2711 = var83.field1073;
                        if (var477 == 1205) {
                            var80.field2715 = 0;
                        } else if (var477 == 1212 | var83.field1079 == 1) {
                            var80.field2715 = 1;
                        } else {
                            var80.field2715 = 2;
                        }
                        if (var80.field2712 > 0) {
                            var80.field2711 = var80.field2711 * 32 / var80.field2712;
                        } else if (var80.field2670 > 0) {
                            var80.field2711 = var80.field2711 * 32 / var80.field2670;
                        }
                        continue;
                    }
                    if (var477 == 1201) {
                        var80.field2700 = 2;
                        var5--;
                        var80.field2701 = field761[var5];
                        continue;
                    }
                    if (var477 == 1202) {
                        var80.field2700 = 3;
                        var80.field2701 = Statics.field37.field29.method3127();
                        continue;
                    }
                } else if (var477 >= 1300 && var477 < 1400 || var477 >= 2300 && var477 < 2400) {
                    class164 var84;
                    if (var477 >= 2000) {
                        var477 -= 1000;
                        var5--;
                        var84 = class164.method144(field761[var5]);
                    } else {
                        var84 = var58 ? Statics.field3066 : Statics.field763;
                    }
                    if (var477 == 1300) {
                        var5--;
                        int var85 = field761[var5] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var6--;
                            var84.method3054(var85, field762[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var477 == 1301) {
                        var5 -= 2;
                        int var86 = field761[var5];
                        int var87 = field761[var5 + 1];
                        var84.field2732 = class164.method143(var86, var87);
                        continue;
                    }
                    if (var477 == 1302) {
                        var5--;
                        var84.field2703 = field761[var5] == 1;
                        continue;
                    }
                    if (var477 == 1303) {
                        var5--;
                        var84.field2772 = field761[var5];
                        continue;
                    }
                    if (var477 == 1304) {
                        var5--;
                        var84.field2734 = field761[var5];
                        continue;
                    }
                    if (var477 == 1305) {
                        var6--;
                        var84.field2752 = field762[var6];
                        continue;
                    }
                    if (var477 == 1306) {
                        var6--;
                        var84.field2736 = field762[var6];
                        continue;
                    }
                    if (var477 == 1307) {
                        var84.field2731 = null;
                        continue;
                    }
                } else {
                    if (var477 >= 1400 && var477 < 1500 || var477 >= 2400 && var477 < 2500) {
                        class164 var88;
                        if (var477 >= 2000) {
                            var477 -= 1000;
                            var5--;
                            var88 = class164.method144(field761[var5]);
                        } else {
                            var88 = var58 ? Statics.field3066 : Statics.field763;
                        }
                        var6--;
                        String var89 = field762[var6];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var5--;
                            int var91 = field761[var5];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var5--;
                                    var90[var91] = field761[var5];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var6--;
                                var92[var93] = field762[var6];
                            } else {
                                var5--;
                                var92[var93] = Integer.valueOf(field761[var5]);
                            }
                        }
                        var5--;
                        int var94 = field761[var5];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var477 == 1400) {
                            var88.field2688 = var92;
                        }
                        if (var477 == 1401) {
                            var88.field2742 = var92;
                        }
                        if (var477 == 1402) {
                            var88.field2741 = var92;
                        }
                        if (var477 == 1403) {
                            var88.field2737 = var92;
                        }
                        if (var477 == 1404) {
                            var88.field2745 = var92;
                        }
                        if (var477 == 1405) {
                            var88.field2746 = var92;
                        }
                        if (var477 == 1406) {
                            var88.field2749 = var92;
                        }
                        if (var477 == 1407) {
                            var88.field2726 = var92;
                            var88.field2692 = var90;
                        }
                        if (var477 == 1408) {
                            var88.field2756 = var92;
                        }
                        if (var477 == 1409) {
                            var88.field2757 = var92;
                        }
                        if (var477 == 1410) {
                            var88.field2747 = var92;
                        }
                        if (var477 == 1411) {
                            var88.field2659 = var92;
                        }
                        if (var477 == 1412) {
                            var88.field2771 = var92;
                        }
                        if (var477 == 1414) {
                            var88.field2754 = var92;
                            var88.field2753 = var90;
                        }
                        if (var477 == 1415) {
                            var88.field2776 = var92;
                            var88.field2647 = var90;
                        }
                        if (var477 == 1416) {
                            var88.field2759 = var92;
                        }
                        if (var477 == 1417) {
                            var88.field2671 = var92;
                        }
                        if (var477 == 1418) {
                            var88.field2784 = var92;
                        }
                        if (var477 == 1419) {
                            var88.field2760 = var92;
                        }
                        if (var477 == 1420) {
                            var88.field2761 = var92;
                        }
                        if (var477 == 1421) {
                            var88.field2698 = var92;
                        }
                        if (var477 == 1422) {
                            var88.field2763 = var92;
                        }
                        if (var477 == 1423) {
                            var88.field2716 = var92;
                        }
                        if (var477 == 1424) {
                            var88.field2704 = var92;
                        }
                        if (var477 == 1425) {
                            var88.field2767 = var92;
                        }
                        if (var477 == 1426) {
                            var88.field2768 = var92;
                        }
                        if (var477 == 1427) {
                            var88.field2766 = var92;
                        }
                        var88.field2680 = true;
                        continue;
                    }
                    if (var477 < 1600) {
                        class164 var95 = var58 ? Statics.field3066 : Statics.field763;
                        if (var477 == 1500) {
                            field761[var5++] = var95.field2672;
                            continue;
                        }
                        if (var477 == 1501) {
                            field761[var5++] = var95.field2665;
                            continue;
                        }
                        if (var477 == 1502) {
                            field761[var5++] = var95.field2674;
                            continue;
                        }
                        if (var477 == 1503) {
                            field761[var5++] = var95.field2675;
                            continue;
                        }
                        if (var477 == 1504) {
                            field761[var5++] = var95.field2702 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 1505) {
                            field761[var5++] = var95.field2678;
                            continue;
                        }
                    } else if (var477 < 1700) {
                        class164 var96 = var58 ? Statics.field3066 : Statics.field763;
                        if (var477 == 1600) {
                            field761[var5++] = var96.field2790;
                            continue;
                        }
                        if (var477 == 1601) {
                            field761[var5++] = var96.field2758;
                            continue;
                        }
                        if (var477 == 1602) {
                            field762[var6++] = var96.field2717;
                            continue;
                        }
                        if (var477 == 1603) {
                            field761[var5++] = var96.field2682;
                            continue;
                        }
                        if (var477 == 1604) {
                            field761[var5++] = var96.field2683;
                            continue;
                        }
                        if (var477 == 1605) {
                            field761[var5++] = var96.field2711;
                            continue;
                        }
                        if (var477 == 1606) {
                            field761[var5++] = var96.field2708;
                            continue;
                        }
                        if (var477 == 1607) {
                            field761[var5++] = var96.field2710;
                            continue;
                        }
                        if (var477 == 1608) {
                            field761[var5++] = var96.field2709;
                            continue;
                        }
                        if (var477 == 1609) {
                            field761[var5++] = var96.field2689;
                            continue;
                        }
                    } else if (var477 < 1800) {
                        class164 var97 = var58 ? Statics.field3066 : Statics.field763;
                        if (var477 == 1700) {
                            field761[var5++] = var97.field2777;
                            continue;
                        }
                        if (var477 == 1701) {
                            if (var97.field2777 == -1) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = var97.field2778;
                            }
                            continue;
                        }
                        if (var477 == 1702) {
                            field761[var5++] = var97.field2660;
                            continue;
                        }
                    } else if (var477 < 1900) {
                        class164 var98 = var58 ? Statics.field3066 : Statics.field763;
                        if (var477 == 1800) {
                            int[] var99 = field761;
                            int var100 = var5++;
                            int var101 = client.method3358(var98);
                            int var102 = var101 >> 11 & 0x3F;
                            var99[var100] = var102;
                            continue;
                        }
                        if (var477 == 1801) {
                            var5--;
                            int var103 = field761[var5];
                            int var478 = var103 - 1;
                            if (var98.field2731 != null && var478 < var98.field2731.length && var98.field2731[var478] != null) {
                                field762[var6++] = var98.field2731[var478];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 1802) {
                            if (var98.field2752 == null) {
                                field762[var6++] = "";
                            } else {
                                field762[var6++] = var98.field2752;
                            }
                            continue;
                        }
                    } else if (!(var477 < 1900 || var477 >= 2000) || !(var477 < 2900 || var477 >= 3000)) {
                        class164 var104;
                        if (var477 >= 2000) {
                            var477 -= 1000;
                            var5--;
                            var104 = class164.method144(field761[var5]);
                        } else {
                            var104 = var58 ? Statics.field3066 : Statics.field763;
                        }
                        if (var477 == 1927) {
                            if (field768 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var104.field2766 == null) {
                                return;
                            }
                            class1 var105 = new class1();
                            var105.field5 = var104;
                            var105.field1 = var104.field2766;
                            var105.field11 = field768 + 1;
                            client.field476.method3441(arg0);
                            continue;
                        }
                    } else if (var477 < 2600) {
                        var5--;
                        class164 var106 = class164.method144(field761[var5]);
                        if (var477 == 2500) {
                            field761[var5++] = var106.field2672;
                            continue;
                        }
                        if (var477 == 2501) {
                            field761[var5++] = var106.field2665;
                            continue;
                        }
                        if (var477 == 2502) {
                            field761[var5++] = var106.field2674;
                            continue;
                        }
                        if (var477 == 2503) {
                            field761[var5++] = var106.field2675;
                            continue;
                        }
                        if (var477 == 2504) {
                            field761[var5++] = var106.field2702 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 2505) {
                            field761[var5++] = var106.field2678;
                            continue;
                        }
                    } else if (var477 < 2700) {
                        var5--;
                        class164 var107 = class164.method144(field761[var5]);
                        if (var477 == 2600) {
                            field761[var5++] = var107.field2790;
                            continue;
                        }
                        if (var477 == 2601) {
                            field761[var5++] = var107.field2758;
                            continue;
                        }
                        if (var477 == 2602) {
                            field762[var6++] = var107.field2717;
                            continue;
                        }
                        if (var477 == 2603) {
                            field761[var5++] = var107.field2682;
                            continue;
                        }
                        if (var477 == 2604) {
                            field761[var5++] = var107.field2683;
                            continue;
                        }
                        if (var477 == 2605) {
                            field761[var5++] = var107.field2711;
                            continue;
                        }
                        if (var477 == 2606) {
                            field761[var5++] = var107.field2708;
                            continue;
                        }
                        if (var477 == 2607) {
                            field761[var5++] = var107.field2710;
                            continue;
                        }
                        if (var477 == 2608) {
                            field761[var5++] = var107.field2709;
                            continue;
                        }
                        if (var477 == 2609) {
                            field761[var5++] = var107.field2689;
                            continue;
                        }
                    } else if (var477 < 2800) {
                        if (var477 == 2700) {
                            var5--;
                            class164 var108 = class164.method144(field761[var5]);
                            field761[var5++] = var108.field2777;
                            continue;
                        }
                        if (var477 == 2701) {
                            var5--;
                            class164 var109 = class164.method144(field761[var5]);
                            if (var109.field2777 == -1) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = var109.field2778;
                            }
                            continue;
                        }
                        if (var477 == 2702) {
                            var5--;
                            int var110 = field761[var5];
                            class4 var111 = (class4) client.field483.method3418((long) var110);
                            if (var111 == null) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = 1;
                            }
                            continue;
                        }
                        if (var477 == 2706) {
                            field761[var5++] = client.field435;
                            continue;
                        }
                    } else if (var477 < 2900) {
                        var5--;
                        class164 var112 = class164.method144(field761[var5]);
                        if (var477 == 2800) {
                            int[] var113 = field761;
                            int var114 = var5++;
                            int var115 = client.method3358(var112);
                            int var116 = var115 >> 11 & 0x3F;
                            var113[var114] = var116;
                            continue;
                        }
                        if (var477 == 2801) {
                            var5--;
                            int var117 = field761[var5];
                            int var479 = var117 - 1;
                            if (var112.field2731 != null && var479 < var112.field2731.length && var112.field2731[var479] != null) {
                                field762[var6++] = var112.field2731[var479];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 2802) {
                            if (var112.field2752 == null) {
                                field762[var6++] = "";
                            } else {
                                field762[var6++] = var112.field2752;
                            }
                            continue;
                        }
                    } else if (var477 < 3200) {
                        if (var477 == 3100) {
                            var6--;
                            String var118 = field762[var6];
                            class11.method2919(0, "", var118);
                            continue;
                        }
                        if (var477 == 3101) {
                            var5 -= 2;
                            client.method1962(Statics.field37, field761[var5], field761[var5 + 1]);
                            continue;
                        }
                        if (var477 == 3103) {
                            client.method26();
                            continue;
                        }
                        if (var477 == 3104) {
                            var6--;
                            String var119 = field762[var6];
                            int var120 = 0;
                            boolean var121 = class154.method1968(var119, 10, true);
                            if (var121) {
                                int var122 = class154.method620(var119, 10, true);
                                var120 = var122;
                            }
                            client.field266.method2493(228);
                            client.field266.method2222(var120);
                            continue;
                        }
                        if (var477 == 3105) {
                            var6--;
                            String var123 = field762[var6];
                            client.field266.method2493(152);
                            client.field266.method2219(var123.length() + 1);
                            client.field266.method2225(var123);
                            continue;
                        }
                        if (var477 == 3106) {
                            var6--;
                            String var124 = field762[var6];
                            client.field266.method2493(227);
                            client.field266.method2219(var124.length() + 1);
                            client.field266.method2225(var124);
                            continue;
                        }
                        if (var477 == 3107) {
                            var5--;
                            int var125 = field761[var5];
                            var6--;
                            String var126 = field762[var6];
                            client.method1106(var125, var126);
                            continue;
                        }
                        if (var477 == 3108) {
                            var5 -= 3;
                            int var127 = field761[var5];
                            int var128 = field761[var5 + 1];
                            int var129 = field761[var5 + 2];
                            class164 var130 = class164.method144(var129);
                            client.method633(var130, var127, var128);
                            continue;
                        }
                        if (var477 == 3109) {
                            var5 -= 2;
                            int var131 = field761[var5];
                            int var132 = field761[var5 + 1];
                            class164 var133 = var58 ? Statics.field3066 : Statics.field763;
                            client.method633(var133, var131, var132);
                            continue;
                        }
                        if (var477 == 3110) {
                            var5--;
                            Statics.field240 = field761[var5] == 1;
                            continue;
                        }
                        if (var477 == 3111) {
                            field761[var5++] = Statics.field1306.field136 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3112) {
                            var5--;
                            Statics.field1306.field136 = field761[var5] == 1;
                            class9.method2700();
                            continue;
                        }
                        if (var477 == 3113) {
                            var6--;
                            String var134 = field762[var6];
                            var5--;
                            boolean var135 = field761[var5] == 1;
                            class130.method2884(var134, var135, false);
                            continue;
                        }
                        if (var477 == 3115) {
                            var5--;
                            int var136 = field761[var5];
                            client.field266.method2493(198);
                            client.field266.method2220(var136);
                            continue;
                        }
                    } else if (var477 < 3300) {
                        if (var477 == 3200) {
                            var5 -= 3;
                            client.method3575(field761[var5], field761[var5 + 1], field761[var5 + 2]);
                            continue;
                        }
                        if (var477 == 3201) {
                            var5--;
                            client.method582(field761[var5]);
                            continue;
                        }
                        if (var477 == 3202) {
                            var5 -= 2;
                            client.method1438(field761[var5], field761[var5 + 1]);
                            continue;
                        }
                    } else if (var477 < 3400) {
                        if (var477 == 3300) {
                            field761[var5++] = client.field280;
                            continue;
                        }
                        if (var477 == 3301) {
                            var5 -= 2;
                            int var137 = field761[var5];
                            int var138 = field761[var5 + 1];
                            field761[var5++] = class15.method2181(var137, var138);
                            continue;
                        }
                        if (var477 == 3302) {
                            var5 -= 2;
                            int var139 = field761[var5];
                            int var140 = field761[var5 + 1];
                            int[] var141 = field761;
                            int var142 = var5++;
                            class15 var143 = (class15) class15.field214.method3418((long) var139);
                            int var144;
                            if (var143 == null) {
                                var144 = 0;
                            } else if (var140 >= 0 && var140 < var143.field208.length) {
                                var144 = var143.field208[var140];
                            } else {
                                var144 = 0;
                            }
                            var141[var142] = var144;
                            continue;
                        }
                        if (var477 == 3303) {
                            var5 -= 2;
                            int var145 = field761[var5];
                            int var146 = field761[var5 + 1];
                            field761[var5++] = class15.method2157(var145, var146);
                            continue;
                        }
                        if (var477 == 3304) {
                            var5--;
                            int var147 = field761[var5];
                            field761[var5++] = class46.method3586(var147).field1052;
                            continue;
                        }
                        if (var477 == 3305) {
                            var5--;
                            int var148 = field761[var5];
                            field761[var5++] = client.field412[var148];
                            continue;
                        }
                        if (var477 == 3306) {
                            var5--;
                            int var149 = field761[var5];
                            field761[var5++] = client.field413[var149];
                            continue;
                        }
                        if (var477 == 3307) {
                            var5--;
                            int var150 = field761[var5];
                            field761[var5++] = client.field414[var150];
                            continue;
                        }
                        if (var477 == 3308) {
                            int var151 = Statics.field665;
                            int var152 = (Statics.field37.field789 >> 7) + Statics.field142;
                            int var153 = (Statics.field37.field773 >> 7) + Statics.field57;
                            field761[var5++] = (var151 << 28) + (var152 << 14) + var153;
                            continue;
                        }
                        if (var477 == 3309) {
                            var5--;
                            int var154 = field761[var5];
                            field761[var5++] = var154 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var477 == 3310) {
                            var5--;
                            int var155 = field761[var5];
                            field761[var5++] = var155 >> 28;
                            continue;
                        }
                        if (var477 == 3311) {
                            var5--;
                            int var156 = field761[var5];
                            field761[var5++] = var156 & 0x3FFF;
                            continue;
                        }
                        if (var477 == 3312) {
                            field761[var5++] = client.field273 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3313) {
                            var5 -= 2;
                            int var157 = field761[var5] + 32768;
                            int var158 = field761[var5 + 1];
                            int[] var159 = field761;
                            int var160 = var5++;
                            class15 var161 = (class15) class15.field214.method3418((long) var157);
                            int var162;
                            if (var161 == null) {
                                var162 = -1;
                            } else if (var158 >= 0 && var158 < var161.field211.length) {
                                var162 = var161.field211[var158];
                            } else {
                                var162 = -1;
                            }
                            var159[var160] = var162;
                            continue;
                        }
                        if (var477 == 3314) {
                            var5 -= 2;
                            int var163 = field761[var5] + 32768;
                            int var164 = field761[var5 + 1];
                            int[] var165 = field761;
                            int var166 = var5++;
                            class15 var167 = (class15) class15.field214.method3418((long) var163);
                            int var168;
                            if (var167 == null) {
                                var168 = 0;
                            } else if (var164 >= 0 && var164 < var167.field208.length) {
                                var168 = var167.field208[var164];
                            } else {
                                var168 = 0;
                            }
                            var165[var166] = var168;
                            continue;
                        }
                        if (var477 == 3315) {
                            var5 -= 2;
                            int var169 = field761[var5] + 32768;
                            int var170 = field761[var5 + 1];
                            field761[var5++] = class15.method2157(var169, var170);
                            continue;
                        }
                        if (var477 == 3316) {
                            if (client.field442 >= 2) {
                                field761[var5++] = client.field442;
                            } else {
                                field761[var5++] = 0;
                            }
                            continue;
                        }
                        if (var477 == 3317) {
                            field761[var5++] = client.field287;
                            continue;
                        }
                        if (var477 == 3318) {
                            field761[var5++] = client.field282;
                            continue;
                        }
                        if (var477 == 3321) {
                            field761[var5++] = client.field440;
                            continue;
                        }
                        if (var477 == 3322) {
                            field761[var5++] = client.field441;
                            continue;
                        }
                        if (var477 == 3323) {
                            if (client.field444) {
                                field761[var5++] = 1;
                            } else {
                                field761[var5++] = 0;
                            }
                            continue;
                        }
                        if (var477 == 3324) {
                            field761[var5++] = client.field270;
                            continue;
                        }
                    } else if (var477 < 3500) {
                        if (var477 == 3400) {
                            var5 -= 2;
                            int var171 = field761[var5];
                            int var172 = field761[var5 + 1];
                            class45 var173 = class45.method907(var171);
                            if (var173.field1039 != 's') {
                            }
                            for (int var174 = 0; var174 < var173.field1042; var174++) {
                                if (var173.field1043[var174] == var172) {
                                    field762[var6++] = var173.field1046[var174];
                                    var173 = null;
                                    break;
                                }
                            }
                            if (var173 != null) {
                                field762[var6++] = var173.field1040;
                            }
                            continue;
                        }
                        if (var477 == 3408) {
                            var5 -= 4;
                            int var175 = field761[var5];
                            int var176 = field761[var5 + 1];
                            int var177 = field761[var5 + 2];
                            int var178 = field761[var5 + 3];
                            class45 var179 = class45.method907(var177);
                            if (var179.field1041 == var175 && var179.field1039 == var176) {
                                for (int var180 = 0; var180 < var179.field1042; var180++) {
                                    if (var179.field1043[var180] == var178) {
                                        if (var176 == 115) {
                                            field762[var6++] = var179.field1046[var180];
                                        } else {
                                            field761[var5++] = var179.field1044[var180];
                                        }
                                        var179 = null;
                                        break;
                                    }
                                }
                                if (var179 != null) {
                                    if (var176 == 115) {
                                        field762[var6++] = var179.field1040;
                                    } else {
                                        field761[var5++] = var179.field1036;
                                    }
                                }
                                continue;
                            }
                            if (var176 == 115) {
                                field762[var6++] = "null";
                            } else {
                                field761[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var477 < 3700) {
                        if (var477 == 3600) {
                            if (client.field308 == 0) {
                                field761[var5++] = -2;
                            } else if (client.field308 == 1) {
                                field761[var5++] = -1;
                            } else {
                                field761[var5++] = client.field394;
                            }
                            continue;
                        }
                        if (var477 == 3601) {
                            var5--;
                            int var181 = field761[var5];
                            if (client.field308 == 2 && var181 < client.field394) {
                                field762[var6++] = client.field546[var181].field247;
                                field762[var6++] = client.field546[var181].field236;
                                continue;
                            }
                            field762[var6++] = "";
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 3602) {
                            var5--;
                            int var182 = field761[var5];
                            if (client.field308 == 2 && var182 < client.field394) {
                                field761[var5++] = client.field546[var182].field237;
                                continue;
                            }
                            field761[var5++] = 0;
                            continue;
                        }
                        if (var477 == 3603) {
                            var5--;
                            int var183 = field761[var5];
                            if (client.field308 == 2 && var183 < client.field394) {
                                field761[var5++] = client.field546[var183].field238;
                                continue;
                            }
                            field761[var5++] = 0;
                            continue;
                        }
                        if (var477 == 3604) {
                            var6--;
                            String var184 = field762[var6];
                            var5--;
                            int var185 = field761[var5];
                            client.method662(var184, var185);
                            continue;
                        }
                        if (var477 == 3605) {
                            var6--;
                            String var186 = field762[var6];
                            client.method2511(var186);
                            continue;
                        }
                        if (var477 == 3606) {
                            var6--;
                            String var187 = field762[var6];
                            client.method3367(var187);
                            continue;
                        }
                        if (var477 == 3607) {
                            var6--;
                            String var188 = field762[var6];
                            client.method164(var188, false);
                            continue;
                        }
                        if (var477 == 3608) {
                            var6--;
                            String var189 = field762[var6];
                            client.method986(var189);
                            continue;
                        }
                        if (var477 == 3609) {
                            var6--;
                            String var190 = field762[var6];
                            class143[] var191 = Statics.method3070();
                            for (int var192 = 0; var192 < var191.length; var192++) {
                                class143 var193 = var191[var192];
                                if (var193.field2158 != -1 && var190.startsWith(class2.method3119(var193.field2158))) {
                                    var190 = var190.substring(6 + Integer.toString(var193.field2158).length());
                                    break;
                                }
                            }
                            field761[var5++] = client.method2488(var190, false) ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3611) {
                            if (client.field500 == null) {
                                field762[var6++] = "";
                                continue;
                            }
                            String[] var194 = field762;
                            int var195 = var6++;
                            String var196 = client.field500;
                            long var197 = 0L;
                            int var199 = var196.length();
                            for (int var200 = 0; var200 < var199; var200++) {
                                var197 *= 37L;
                                char var201 = var196.charAt(var200);
                                if (var201 >= 'A' && var201 <= 'Z') {
                                    var197 += (long) (var201 + 1 - 65);
                                } else if (var201 >= 'a' && var201 <= 'z') {
                                    var197 += (long) (var201 + 1 - 97);
                                } else if (var201 >= '0' && var201 <= '9') {
                                    var197 += (long) (var201 + 27 - 48);
                                }
                                if (var197 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var197 % 37L == 0L && var197 != 0L) {
                                var197 /= 37L;
                            }
                            String var204 = class153.method1513(var197);
                            if (var204 == null) {
                                var204 = "";
                            }
                            var194[var195] = var204;
                            continue;
                        }
                        if (var477 == 3612) {
                            if (client.field500 == null) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = Statics.field121;
                            }
                            continue;
                        }
                        if (var477 == 3613) {
                            var5--;
                            int var206 = field761[var5];
                            if (client.field500 != null && var206 < Statics.field121) {
                                field762[var6++] = Statics.field1862[var206].field603;
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 3614) {
                            var5--;
                            int var207 = field761[var5];
                            if (client.field500 != null && var207 < Statics.field121) {
                                field761[var5++] = Statics.field1862[var207].field599;
                                continue;
                            }
                            field761[var5++] = 0;
                            continue;
                        }
                        if (var477 == 3615) {
                            var5--;
                            int var208 = field761[var5];
                            if (client.field500 != null && var208 < Statics.field121) {
                                field761[var5++] = Statics.field1862[var208].field602;
                                continue;
                            }
                            field761[var5++] = 0;
                            continue;
                        }
                        if (var477 == 3616) {
                            field761[var5++] = Statics.field2841;
                            continue;
                        }
                        if (var477 == 3617) {
                            var6--;
                            String var209 = field762[var6];
                            if (Statics.field1862 != null) {
                                client.field266.method2493(244);
                                client.field266.method2219(Statics.method2179(var209));
                                client.field266.method2225(var209);
                            }
                            continue;
                        }
                        if (var477 == 3618) {
                            field761[var5++] = Statics.field215;
                            continue;
                        }
                        if (var477 == 3619) {
                            var6--;
                            String var210 = field762[var6];
                            if (!var210.equals("")) {
                                client.field266.method2493(13);
                                client.field266.method2219(Statics.method2179(var210));
                                client.field266.method2225(var210);
                            }
                            continue;
                        }
                        if (var477 == 3620) {
                            client.field266.method2493(13);
                            client.field266.method2219(0);
                            continue;
                        }
                        if (var477 == 3621) {
                            if (client.field308 == 0) {
                                field761[var5++] = -1;
                            } else {
                                field761[var5++] = client.field548;
                            }
                            continue;
                        }
                        if (var477 == 3622) {
                            var5--;
                            int var211 = field761[var5];
                            if (client.field308 != 0 && var211 < client.field548) {
                                field762[var6++] = client.field305[var211].field133;
                                field762[var6++] = client.field305[var211].field122;
                                continue;
                            }
                            field762[var6++] = "";
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 3623) {
                            var6--;
                            String var212 = field762[var6];
                            if (var212.startsWith(class2.method3119(0)) || var212.startsWith(class2.method3119(1))) {
                                var212 = var212.substring(7);
                            }
                            field761[var5++] = client.method1969(var212) ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3624) {
                            var5--;
                            int var213 = field761[var5];
                            if (Statics.field1862 != null && var213 < Statics.field121 && Statics.field1862[var213].field603.equalsIgnoreCase(Statics.field37.field49)) {
                                field761[var5++] = 1;
                                continue;
                            }
                            field761[var5++] = 0;
                            continue;
                        }
                        if (var477 == 3625) {
                            if (client.field331 == null) {
                                field762[var6++] = "";
                                continue;
                            }
                            String[] var214 = field762;
                            int var215 = var6++;
                            String var216 = client.field331;
                            long var217 = 0L;
                            int var219 = var216.length();
                            for (int var220 = 0; var220 < var219; var220++) {
                                var217 *= 37L;
                                char var221 = var216.charAt(var220);
                                if (var221 >= 'A' && var221 <= 'Z') {
                                    var217 += (long) (var221 + 1 - 65);
                                } else if (var221 >= 'a' && var221 <= 'z') {
                                    var217 += (long) (var221 + 1 - 97);
                                } else if (var221 >= '0' && var221 <= '9') {
                                    var217 += (long) (var221 + 27 - 48);
                                }
                                if (var217 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var217 % 37L == 0L && var217 != 0L) {
                                var217 /= 37L;
                            }
                            String var224 = class153.method1513(var217);
                            if (var224 == null) {
                                var224 = "";
                            }
                            var214[var215] = var224;
                            continue;
                        }
                    } else if (var477 < 4000) {
                        if (var477 == 3903) {
                            var5--;
                            int var226 = field761[var5];
                            field761[var5++] = client.field553[var226].method3611();
                            continue;
                        }
                        if (var477 == 3904) {
                            var5--;
                            int var227 = field761[var5];
                            field761[var5++] = client.field553[var227].field3068;
                            continue;
                        }
                        if (var477 == 3905) {
                            var5--;
                            int var228 = field761[var5];
                            field761[var5++] = client.field553[var228].field3067;
                            continue;
                        }
                        if (var477 == 3906) {
                            var5--;
                            int var229 = field761[var5];
                            field761[var5++] = client.field553[var229].field3070;
                            continue;
                        }
                        if (var477 == 3907) {
                            var5--;
                            int var230 = field761[var5];
                            field761[var5++] = client.field553[var230].field3071;
                            continue;
                        }
                        if (var477 == 3908) {
                            var5--;
                            int var231 = field761[var5];
                            field761[var5++] = client.field553[var231].field3072;
                            continue;
                        }
                        if (var477 == 3910) {
                            var5--;
                            int var232 = field761[var5];
                            int var233 = client.field553[var232].method3610();
                            field761[var5++] = var233 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3911) {
                            var5--;
                            int var234 = field761[var5];
                            int var235 = client.field553[var234].method3610();
                            field761[var5++] = var235 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3912) {
                            var5--;
                            int var236 = field761[var5];
                            int var237 = client.field553[var236].method3610();
                            field761[var5++] = var237 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3913) {
                            var5--;
                            int var238 = field761[var5];
                            int var239 = client.field553[var238].method3610();
                            field761[var5++] = var239 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 3914) {
                            var5--;
                            boolean var240 = field761[var5] == 1;
                            if (Statics.field1616 != null) {
                                Statics.field1616.method3628(class212.field3077, var240);
                            }
                            continue;
                        }
                        if (var477 == 3915) {
                            var5--;
                            boolean var241 = field761[var5] == 1;
                            if (Statics.field1616 != null) {
                                Statics.field1616.method3628(class212.field3076, var241);
                            }
                            continue;
                        }
                        if (var477 == 3916) {
                            var5 -= 2;
                            boolean var242 = field761[var5] == 1;
                            boolean var243 = field761[var5 + 1] == 1;
                            if (Statics.field1616 != null) {
                                Statics.field1616.method3628(new class21(var243), var242);
                            }
                            continue;
                        }
                        if (var477 == 3917) {
                            var5--;
                            boolean var244 = field761[var5] == 1;
                            if (Statics.field1616 != null) {
                                Statics.field1616.method3628(class212.field3074, var244);
                            }
                            continue;
                        }
                        if (var477 == 3918) {
                            var5--;
                            boolean var245 = field761[var5] == 1;
                            if (Statics.field1616 != null) {
                                Statics.field1616.method3628(class212.field3075, var245);
                            }
                            continue;
                        }
                        if (var477 == 3919) {
                            field761[var5++] = Statics.field1616 == null ? 0 : Statics.field1616.field3079.size();
                            continue;
                        }
                        if (var477 == 3920) {
                            var5--;
                            int var246 = field761[var5];
                            class205 var247 = (class205) Statics.field1616.field3079.get(var246);
                            field761[var5++] = var247.field3052;
                            continue;
                        }
                        if (var477 == 3921) {
                            var5--;
                            int var248 = field761[var5];
                            class205 var249 = (class205) Statics.field1616.field3079.get(var248);
                            field762[var6++] = var249.method3569();
                            continue;
                        }
                        if (var477 == 3922) {
                            var5--;
                            int var250 = field761[var5];
                            class205 var251 = (class205) Statics.field1616.field3079.get(var250);
                            field762[var6++] = var251.method3570();
                            continue;
                        }
                        if (var477 == 3923) {
                            var5--;
                            int var252 = field761[var5];
                            class205 var253 = (class205) Statics.field1616.field3079.get(var252);
                            long var254 = class107.method1430() - Statics.field2140 - var253.field3055;
                            int var256 = (int) (var254 / 3600000L);
                            int var257 = (int) ((var254 - (long) (var256 * 3600000)) / 60000L);
                            int var258 = (int) ((var254 - (long) (var256 * 3600000) - (long) (var257 * 60000)) / 1000L);
                            String var259 = var256 + ":" + var257 / 10 + var257 % 10 + ":" + var258 / 10 + var258 % 10;
                            field762[var6++] = var259;
                            continue;
                        }
                        if (var477 == 3924) {
                            var5--;
                            int var260 = field761[var5];
                            class205 var261 = (class205) Statics.field1616.field3079.get(var260);
                            field761[var5++] = var261.field3053.field3070;
                            continue;
                        }
                        if (var477 == 3925) {
                            var5--;
                            int var262 = field761[var5];
                            class205 var263 = (class205) Statics.field1616.field3079.get(var262);
                            field761[var5++] = var263.field3053.field3067;
                            continue;
                        }
                        if (var477 == 3926) {
                            var5--;
                            int var264 = field761[var5];
                            class205 var265 = (class205) Statics.field1616.field3079.get(var264);
                            field761[var5++] = var265.field3053.field3068;
                            continue;
                        }
                    } else if (var477 < 4100) {
                        if (var477 == 4000) {
                            var5 -= 2;
                            int var266 = field761[var5];
                            int var267 = field761[var5 + 1];
                            field761[var5++] = var266 + var267;
                            continue;
                        }
                        if (var477 == 4001) {
                            var5 -= 2;
                            int var268 = field761[var5];
                            int var269 = field761[var5 + 1];
                            field761[var5++] = var268 - var269;
                            continue;
                        }
                        if (var477 == 4002) {
                            var5 -= 2;
                            int var270 = field761[var5];
                            int var271 = field761[var5 + 1];
                            field761[var5++] = var270 * var271;
                            continue;
                        }
                        if (var477 == 4003) {
                            var5 -= 2;
                            int var272 = field761[var5];
                            int var273 = field761[var5 + 1];
                            field761[var5++] = var272 / var273;
                            continue;
                        }
                        if (var477 == 4004) {
                            var5--;
                            int var274 = field761[var5];
                            field761[var5++] = (int) (Math.random() * (double) var274);
                            continue;
                        }
                        if (var477 == 4005) {
                            var5--;
                            int var275 = field761[var5];
                            field761[var5++] = (int) (Math.random() * (double) (var275 + 1));
                            continue;
                        }
                        if (var477 == 4006) {
                            var5 -= 5;
                            int var276 = field761[var5];
                            int var277 = field761[var5 + 1];
                            int var278 = field761[var5 + 2];
                            int var279 = field761[var5 + 3];
                            int var280 = field761[var5 + 4];
                            field761[var5++] = (var277 - var276) * (var280 - var278) / (var279 - var278) + var276;
                            continue;
                        }
                        if (var477 == 4007) {
                            var5 -= 2;
                            int var281 = field761[var5];
                            int var282 = field761[var5 + 1];
                            field761[var5++] = var281 * var282 / 100 + var281;
                            continue;
                        }
                        if (var477 == 4008) {
                            var5 -= 2;
                            int var283 = field761[var5];
                            int var284 = field761[var5 + 1];
                            field761[var5++] = var283 | 0x1 << var284;
                            continue;
                        }
                        if (var477 == 4009) {
                            var5 -= 2;
                            int var285 = field761[var5];
                            int var286 = field761[var5 + 1];
                            field761[var5++] = var285 & -1 - (0x1 << var286);
                            continue;
                        }
                        if (var477 == 4010) {
                            var5 -= 2;
                            int var287 = field761[var5];
                            int var288 = field761[var5 + 1];
                            field761[var5++] = (var287 & 0x1 << var288) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var477 == 4011) {
                            var5 -= 2;
                            int var289 = field761[var5];
                            int var290 = field761[var5 + 1];
                            field761[var5++] = var289 % var290;
                            continue;
                        }
                        if (var477 == 4012) {
                            var5 -= 2;
                            int var291 = field761[var5];
                            int var292 = field761[var5 + 1];
                            if (var291 == 0) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = (int) Math.pow((double) var291, (double) var292);
                            }
                            continue;
                        }
                        if (var477 == 4013) {
                            var5 -= 2;
                            int var293 = field761[var5];
                            int var294 = field761[var5 + 1];
                            if (var293 == 0) {
                                field761[var5++] = 0;
                            } else if (var294 == 0) {
                                field761[var5++] = Integer.MAX_VALUE;
                            } else {
                                field761[var5++] = (int) Math.pow((double) var293, 1.0D / (double) var294);
                            }
                            continue;
                        }
                        if (var477 == 4014) {
                            var5 -= 2;
                            int var295 = field761[var5];
                            int var296 = field761[var5 + 1];
                            field761[var5++] = var295 & var296;
                            continue;
                        }
                        if (var477 == 4015) {
                            var5 -= 2;
                            int var297 = field761[var5];
                            int var298 = field761[var5 + 1];
                            field761[var5++] = var297 | var298;
                            continue;
                        }
                    } else if (var477 < 4200) {
                        if (var477 == 4100) {
                            var6--;
                            String var299 = field762[var6];
                            var5--;
                            int var300 = field761[var5];
                            field762[var6++] = var299 + var300;
                            continue;
                        }
                        if (var477 == 4101) {
                            var6 -= 2;
                            String var301 = field762[var6];
                            String var302 = field762[var6 + 1];
                            field762[var6++] = var301 + var302;
                            continue;
                        }
                        if (var477 == 4102) {
                            var6--;
                            String var303 = field762[var6];
                            var5--;
                            int var304 = field761[var5];
                            field762[var6++] = var303 + class154.method2518(var304, true);
                            continue;
                        }
                        if (var477 == 4103) {
                            var6--;
                            String var305 = field762[var6];
                            field762[var6++] = var305.toLowerCase();
                            continue;
                        }
                        if (var477 == 4104) {
                            var5--;
                            int var306 = field761[var5];
                            long var307 = ((long) var306 + 11745L) * 86400000L;
                            field760.setTime(new Date(var307));
                            int var309 = field760.get(5);
                            int var310 = field760.get(2);
                            int var311 = field760.get(1);
                            field762[var6++] = var309 + "-" + field767[var310] + "-" + var311;
                            continue;
                        }
                        if (var477 == 4105) {
                            var6 -= 2;
                            String var312 = field762[var6];
                            String var313 = field762[var6 + 1];
                            if (Statics.field37.field29 != null && Statics.field37.field29.field2822) {
                                field762[var6++] = var313;
                                continue;
                            }
                            field762[var6++] = var312;
                            continue;
                        }
                        if (var477 == 4106) {
                            var5--;
                            int var314 = field761[var5];
                            field762[var6++] = Integer.toString(var314);
                            continue;
                        }
                        if (var477 == 4107) {
                            var6 -= 2;
                            int[] var315 = field761;
                            int var316 = var5++;
                            String var317 = field762[var6];
                            String var318 = field762[var6 + 1];
                            int var319 = client.field275;
                            int var320 = var317.length();
                            int var321 = var318.length();
                            int var322 = 0;
                            int var323 = 0;
                            char var324 = 0;
                            char var325 = 0;
                            int var326;
                            label2823: while (true) {
                                if (var322 - var324 >= var320 && var323 - var325 >= var321) {
                                    int var335 = Math.min(var320, var321);
                                    for (int var336 = 0; var336 < var335; var336++) {
                                        char var339 = var317.charAt(var336);
                                        char var340 = var318.charAt(var336);
                                        if (var339 != var340 && Character.toUpperCase(var339) != Character.toUpperCase(var340)) {
                                            char var341 = Character.toLowerCase(var339);
                                            char var342 = Character.toLowerCase(var340);
                                            if (var341 != var342) {
                                                var326 = class157.method1504(var341, var319) - class157.method1504(var342, var319);
                                                break label2823;
                                            }
                                        }
                                    }
                                    int var343 = var320 - var321;
                                    if (var343 == 0) {
                                        for (int var344 = 0; var344 < var335; var344++) {
                                            char var345 = var317.charAt(var344);
                                            char var346 = var318.charAt(var344);
                                            if (var345 != var346) {
                                                var326 = class157.method1504(var345, var319) - class157.method1504(var346, var319);
                                                break label2823;
                                            }
                                        }
                                        var326 = 0;
                                    } else {
                                        var326 = var343;
                                    }
                                    break;
                                }
                                if (var322 - var324 >= var320) {
                                    var326 = -1;
                                    break;
                                }
                                if (var323 - var325 >= var321) {
                                    var326 = 1;
                                    break;
                                }
                                char var327;
                                if (var324 == 0) {
                                    var327 = var317.charAt(var322++);
                                } else {
                                    var327 = var324;
                                    boolean var328 = false;
                                }
                                char var329;
                                if (var325 == 0) {
                                    var329 = var318.charAt(var323++);
                                } else {
                                    var329 = var325;
                                    boolean var330 = false;
                                }
                                var324 = class157.method1966(var327);
                                var325 = class157.method1966(var329);
                                char var331 = class157.method2838(var327, var319);
                                char var332 = class157.method2838(var329, var319);
                                if (var331 != var332 && Character.toUpperCase(var331) != Character.toUpperCase(var332)) {
                                    char var333 = Character.toLowerCase(var331);
                                    char var334 = Character.toLowerCase(var332);
                                    if (var333 != var334) {
                                        var326 = class157.method1504(var333, var319) - class157.method1504(var334, var319);
                                        break;
                                    }
                                }
                            }
                            var315[var316] = Statics.method573(var326);
                            continue;
                        }
                        if (var477 == 4108) {
                            var6--;
                            String var347 = field762[var6];
                            var5 -= 2;
                            int var348 = field761[var5];
                            int var349 = field761[var5 + 1];
                            byte[] var350 = Statics.field3050.method2925(var349, 0);
                            class215 var351 = new class215(var350);
                            field761[var5++] = var351.method3695(var347, var348);
                            continue;
                        }
                        if (var477 == 4109) {
                            var6--;
                            String var352 = field762[var6];
                            var5 -= 2;
                            int var353 = field761[var5];
                            int var354 = field761[var5 + 1];
                            byte[] var355 = Statics.field3050.method2925(var354, 0);
                            class215 var356 = new class215(var355);
                            field761[var5++] = var356.method3643(var352, var353);
                            continue;
                        }
                        if (var477 == 4110) {
                            var6 -= 2;
                            String var357 = field762[var6];
                            String var358 = field762[var6 + 1];
                            var5--;
                            if (field761[var5] == 1) {
                                field762[var6++] = var357;
                            } else {
                                field762[var6++] = var358;
                            }
                            continue;
                        }
                        if (var477 == 4111) {
                            var6--;
                            String var359 = field762[var6];
                            field762[var6++] = class214.method3639(var359);
                            continue;
                        }
                        if (var477 == 4112) {
                            var6--;
                            String var360 = field762[var6];
                            var5--;
                            int var361 = field761[var5];
                            field762[var6++] = var360 + (char) var361;
                            continue;
                        }
                        if (var477 == 4113) {
                            var5--;
                            int var362 = field761[var5];
                            field761[var5++] = class154.method660((char) var362) ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4114) {
                            var5--;
                            int var363 = field761[var5];
                            int[] var364 = field761;
                            int var365 = var5++;
                            char var366 = (char) var363;
                            boolean var367 = var366 >= '0' && var366 <= '9' || var366 >= 'A' && var366 <= 'Z' || var366 >= 'a' && var366 <= 'z';
                            var364[var365] = var367 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4115) {
                            var5--;
                            int var368 = field761[var5];
                            field761[var5++] = class154.method2555((char) var368) ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4116) {
                            var5--;
                            int var369 = field761[var5];
                            field761[var5++] = class154.method789((char) var369) ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4117) {
                            var6--;
                            String var370 = field762[var6];
                            if (var370 == null) {
                                field761[var5++] = 0;
                            } else {
                                field761[var5++] = var370.length();
                            }
                            continue;
                        }
                        if (var477 == 4118) {
                            var6--;
                            String var371 = field762[var6];
                            var5 -= 2;
                            int var372 = field761[var5];
                            int var373 = field761[var5 + 1];
                            field762[var6++] = var371.substring(var372, var373);
                            continue;
                        }
                        if (var477 == 4119) {
                            var6--;
                            String var374 = field762[var6];
                            StringBuilder var375 = new StringBuilder(var374.length());
                            boolean var376 = false;
                            for (int var377 = 0; var377 < var374.length(); var377++) {
                                char var378 = var374.charAt(var377);
                                if (var378 == '<') {
                                    var376 = true;
                                } else if (var378 == '>') {
                                    var376 = false;
                                } else if (!var376) {
                                    var375.append(var378);
                                }
                            }
                            field762[var6++] = var375.toString();
                            continue;
                        }
                        if (var477 == 4120) {
                            var6--;
                            String var379 = field762[var6];
                            var5--;
                            int var380 = field761[var5];
                            field761[var5++] = var379.indexOf(var380);
                            continue;
                        }
                        if (var477 == 4121) {
                            var6 -= 2;
                            String var381 = field762[var6];
                            String var382 = field762[var6 + 1];
                            var5--;
                            int var383 = field761[var5];
                            field761[var5++] = var381.indexOf(var382, var383);
                            continue;
                        }
                    } else if (var477 < 4300) {
                        if (var477 == 4200) {
                            var5--;
                            int var384 = field761[var5];
                            field762[var6++] = class47.method127(var384).field1078;
                            continue;
                        }
                        if (var477 == 4201) {
                            var5 -= 2;
                            int var385 = field761[var5];
                            int var386 = field761[var5 + 1];
                            class47 var387 = class47.method127(var385);
                            if (var386 >= 1 && var386 <= 5 && var387.field1108[var386 - 1] != null) {
                                field762[var6++] = var387.field1108[var386 - 1];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 4202) {
                            var5 -= 2;
                            int var388 = field761[var5];
                            int var389 = field761[var5 + 1];
                            class47 var390 = class47.method127(var388);
                            if (var389 >= 1 && var389 <= 5 && var390.field1083[var389 - 1] != null) {
                                field762[var6++] = var390.field1083[var389 - 1];
                                continue;
                            }
                            field762[var6++] = "";
                            continue;
                        }
                        if (var477 == 4203) {
                            var5--;
                            int var391 = field761[var5];
                            field761[var5++] = class47.method127(var391).field1071;
                            continue;
                        }
                        if (var477 == 4204) {
                            var5--;
                            int var392 = field761[var5];
                            field761[var5++] = class47.method127(var392).field1079 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4205) {
                            var5--;
                            int var393 = field761[var5];
                            class47 var394 = class47.method127(var393);
                            if (var394.field1099 == -1 && var394.field1068 >= 0) {
                                field761[var5++] = var394.field1068;
                                continue;
                            }
                            field761[var5++] = var393;
                            continue;
                        }
                        if (var477 == 4206) {
                            var5--;
                            int var395 = field761[var5];
                            class47 var396 = class47.method127(var395);
                            if (var396.field1099 >= 0 && var396.field1068 >= 0) {
                                field761[var5++] = var396.field1068;
                                continue;
                            }
                            field761[var5++] = var395;
                            continue;
                        }
                        if (var477 == 4207) {
                            var5--;
                            int var397 = field761[var5];
                            field761[var5++] = class47.method127(var397).field1081 ? 1 : 0;
                            continue;
                        }
                        if (var477 == 4210) {
                            var6--;
                            String var398 = field762[var6];
                            var5--;
                            int var399 = field761[var5];
                            boolean var401 = var399 == 1;
                            String var402 = var398.toLowerCase();
                            short[] var403 = new short[16];
                            int var404 = 0;
                            int var405 = 0;
                            while (true) {
                                if (var405 >= Statics.field1059) {
                                    Statics.field61 = var403;
                                    Statics.field948 = 0;
                                    Statics.field659 = var404;
                                    String[] var409 = new String[Statics.field659];
                                    for (int var410 = 0; var410 < Statics.field659; var410++) {
                                        var409[var410] = class47.method127(var403[var410]).field1078;
                                    }
                                    class116.method2152(var409, Statics.field61);
                                    break;
                                }
                                class47 var406 = class47.method127(var405);
                                if ((!var401 || var406.field1080) && var406.field1099 == -1 && var406.field1078.toLowerCase().indexOf(var402) != -1) {
                                    if (var404 >= 250) {
                                        Statics.field659 = -1;
                                        Statics.field61 = null;
                                        break;
                                    }
                                    if (var404 >= var403.length) {
                                        short[] var407 = new short[var403.length * 2];
                                        for (int var408 = 0; var408 < var404; var408++) {
                                            var407[var408] = var403[var408];
                                        }
                                        var403 = var407;
                                    }
                                    var403[var404++] = (short) var405;
                                }
                                var405++;
                            }
                            field761[var5++] = Statics.field659;
                            continue;
                        }
                        if (var477 == 4211) {
                            if (Statics.field61 != null && Statics.field948 < Statics.field659) {
                                field761[var5++] = Statics.field61[++Statics.field948 - 1] & 0xFFFF;
                                continue;
                            }
                            field761[var5++] = -1;
                            continue;
                        }
                        if (var477 == 4212) {
                            Statics.field948 = 0;
                            continue;
                        }
                    } else if (var477 < 5100) {
                        if (var477 == 5000) {
                            field761[var5++] = client.field449;
                            continue;
                        }
                        if (var477 == 5001) {
                            var5 -= 3;
                            client.field449 = field761[var5];
                            Statics.field1888 = class122.method86(field761[var5 + 1]);
                            if (Statics.field1888 == null) {
                                Statics.field1888 = class122.field1965;
                            }
                            client.field496 = field761[var5 + 2];
                            client.field266.method2493(49);
                            client.field266.method2219(client.field449);
                            client.field266.method2219(Statics.field1888.field1961);
                            client.field266.method2219(client.field496);
                            continue;
                        }
                        if (var477 == 5002) {
                            var6--;
                            String var411 = field762[var6];
                            var5 -= 2;
                            int var412 = field761[var5];
                            int var413 = field761[var5 + 1];
                            client.field266.method2493(10);
                            client.field266.method2219(Statics.method2179(var411) + 2);
                            client.field266.method2225(var411);
                            client.field266.method2219(var412 - 1);
                            client.field266.method2219(var413);
                            continue;
                        }
                        if (var477 == 5003) {
                            var5 -= 2;
                            int var414 = field761[var5];
                            int var415 = field761[var5 + 1];
                            class33 var416 = class11.method614(var414, var415);
                            if (var416 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                                field762[var6++] = "";
                                field762[var6++] = "";
                            } else {
                                field761[var5++] = var416.field754;
                                field761[var5++] = var416.field745;
                                field762[var6++] = var416.field747 == null ? "" : var416.field747;
                                field762[var6++] = var416.field756 == null ? "" : var416.field756;
                                field762[var6++] = var416.field749 == null ? "" : var416.field749;
                            }
                            continue;
                        }
                        if (var477 == 5004) {
                            var5--;
                            int var417 = field761[var5];
                            class33 var418 = (class33) class11.field158.method3427((long) var417);
                            if (var418 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                                field762[var6++] = "";
                                field762[var6++] = "";
                            } else {
                                field761[var5++] = var418.field748;
                                field761[var5++] = var418.field745;
                                field762[var6++] = var418.field747 == null ? "" : var418.field747;
                                field762[var6++] = var418.field756 == null ? "" : var418.field756;
                                field762[var6++] = var418.field749 == null ? "" : var418.field749;
                            }
                            continue;
                        }
                        if (var477 == 5005) {
                            if (Statics.field1888 == null) {
                                field761[var5++] = -1;
                            } else {
                                field761[var5++] = Statics.field1888.field1961;
                            }
                            continue;
                        }
                        if (var477 == 5008) {
                            var6--;
                            String var420 = field762[var6];
                            var5--;
                            int var421 = field761[var5];
                            String var422 = var420.toLowerCase();
                            byte var423 = 0;
                            if (var422.startsWith(class148.field2388)) {
                                var423 = 0;
                                var420 = var420.substring(class148.field2388.length());
                            } else if (var422.startsWith(class148.field2390)) {
                                var423 = 1;
                                var420 = var420.substring(class148.field2390.length());
                            } else if (var422.startsWith(class148.field2394)) {
                                var423 = 2;
                                var420 = var420.substring(class148.field2394.length());
                            } else if (var422.startsWith(class148.field2453)) {
                                var423 = 3;
                                var420 = var420.substring(class148.field2453.length());
                            } else if (var422.startsWith(class148.field2396)) {
                                var423 = 4;
                                var420 = var420.substring(class148.field2396.length());
                            } else if (var422.startsWith(class148.field2398)) {
                                var423 = 5;
                                var420 = var420.substring(class148.field2398.length());
                            } else if (var422.startsWith(class148.field2400)) {
                                var423 = 6;
                                var420 = var420.substring(class148.field2400.length());
                            } else if (var422.startsWith(class148.field2402)) {
                                var423 = 7;
                                var420 = var420.substring(class148.field2402.length());
                            } else if (var422.startsWith(class148.field2349)) {
                                var423 = 8;
                                var420 = var420.substring(class148.field2349.length());
                            } else if (var422.startsWith(class148.field2406)) {
                                var423 = 9;
                                var420 = var420.substring(class148.field2406.length());
                            } else if (var422.startsWith(class148.field2415)) {
                                var423 = 10;
                                var420 = var420.substring(class148.field2415.length());
                            } else if (var422.startsWith(class148.field2331)) {
                                var423 = 11;
                                var420 = var420.substring(class148.field2331.length());
                            } else if (client.field275 != 0) {
                                if (var422.startsWith(class148.field2474)) {
                                    var423 = 0;
                                    var420 = var420.substring(class148.field2474.length());
                                } else if (var422.startsWith(class148.field2234)) {
                                    var423 = 1;
                                    var420 = var420.substring(class148.field2234.length());
                                } else if (var422.startsWith(class148.field2484)) {
                                    var423 = 2;
                                    var420 = var420.substring(class148.field2484.length());
                                } else if (var422.startsWith(class148.field2395)) {
                                    var423 = 3;
                                    var420 = var420.substring(class148.field2395.length());
                                } else if (var422.startsWith(class148.field2397)) {
                                    var423 = 4;
                                    var420 = var420.substring(class148.field2397.length());
                                } else if (var422.startsWith(class148.field2399)) {
                                    var423 = 5;
                                    var420 = var420.substring(class148.field2399.length());
                                } else if (var422.startsWith(class148.field2294)) {
                                    var423 = 6;
                                    var420 = var420.substring(class148.field2294.length());
                                } else if (var422.startsWith(class148.field2403)) {
                                    var423 = 7;
                                    var420 = var420.substring(class148.field2403.length());
                                } else if (var422.startsWith(class148.field2342)) {
                                    var423 = 8;
                                    var420 = var420.substring(class148.field2342.length());
                                } else if (var422.startsWith(class148.field2407)) {
                                    var423 = 9;
                                    var420 = var420.substring(class148.field2407.length());
                                } else if (var422.startsWith(class148.field2409)) {
                                    var423 = 10;
                                    var420 = var420.substring(class148.field2409.length());
                                } else if (var422.startsWith(class148.field2411)) {
                                    var423 = 11;
                                    var420 = var420.substring(class148.field2411.length());
                                }
                            }
                            String var424 = var420.toLowerCase();
                            byte var425 = 0;
                            if (var424.startsWith(class148.field2412)) {
                                var425 = 1;
                                var420 = var420.substring(class148.field2412.length());
                            } else if (var424.startsWith(class148.field2414)) {
                                var425 = 2;
                                var420 = var420.substring(class148.field2414.length());
                            } else if (var424.startsWith(class148.field2447)) {
                                var425 = 3;
                                var420 = var420.substring(class148.field2447.length());
                            } else if (var424.startsWith(class148.field2241)) {
                                var425 = 4;
                                var420 = var420.substring(class148.field2241.length());
                            } else if (var424.startsWith(class148.field2420)) {
                                var425 = 5;
                                var420 = var420.substring(class148.field2420.length());
                            } else if (client.field275 != 0) {
                                if (var424.startsWith(class148.field2413)) {
                                    var425 = 1;
                                    var420 = var420.substring(class148.field2413.length());
                                } else if (var424.startsWith(class148.field2418)) {
                                    var425 = 2;
                                    var420 = var420.substring(class148.field2418.length());
                                } else if (var424.startsWith(class148.field2417)) {
                                    var425 = 3;
                                    var420 = var420.substring(class148.field2417.length());
                                } else if (var424.startsWith(class148.field2419)) {
                                    var425 = 4;
                                    var420 = var420.substring(class148.field2419.length());
                                } else if (var424.startsWith(class148.field2255)) {
                                    var425 = 5;
                                    var420 = var420.substring(class148.field2255.length());
                                }
                            }
                            client.field266.method2493(210);
                            client.field266.method2219(0);
                            int var426 = client.field266.field1890;
                            client.field266.method2219(var421);
                            client.field266.method2219(var423);
                            client.field266.method2219(var425);
                            class114 var427 = client.field266;
                            int var428 = var427.field1890;
                            int var429 = var420.length();
                            byte[] var430 = new byte[var429];
                            for (int var431 = 0; var431 < var429; var431++) {
                                char var432 = var420.charAt(var431);
                                if (var432 > 0 && var432 < 128 || var432 >= 160 && var432 <= 255) {
                                    var430[var431] = (byte) var432;
                                } else if (var432 == 8364) {
                                    var430[var431] = -128;
                                } else if (var432 == 8218) {
                                    var430[var431] = -126;
                                } else if (var432 == 402) {
                                    var430[var431] = -125;
                                } else if (var432 == 8222) {
                                    var430[var431] = -124;
                                } else if (var432 == 8230) {
                                    var430[var431] = -123;
                                } else if (var432 == 8224) {
                                    var430[var431] = -122;
                                } else if (var432 == 8225) {
                                    var430[var431] = -121;
                                } else if (var432 == 710) {
                                    var430[var431] = -120;
                                } else if (var432 == 8240) {
                                    var430[var431] = -119;
                                } else if (var432 == 352) {
                                    var430[var431] = -118;
                                } else if (var432 == 8249) {
                                    var430[var431] = -117;
                                } else if (var432 == 338) {
                                    var430[var431] = -116;
                                } else if (var432 == 381) {
                                    var430[var431] = -114;
                                } else if (var432 == 8216) {
                                    var430[var431] = -111;
                                } else if (var432 == 8217) {
                                    var430[var431] = -110;
                                } else if (var432 == 8220) {
                                    var430[var431] = -109;
                                } else if (var432 == 8221) {
                                    var430[var431] = -108;
                                } else if (var432 == 8226) {
                                    var430[var431] = -107;
                                } else if (var432 == 8211) {
                                    var430[var431] = -106;
                                } else if (var432 == 8212) {
                                    var430[var431] = -105;
                                } else if (var432 == 732) {
                                    var430[var431] = -104;
                                } else if (var432 == 8482) {
                                    var430[var431] = -103;
                                } else if (var432 == 353) {
                                    var430[var431] = -102;
                                } else if (var432 == 8250) {
                                    var430[var431] = -101;
                                } else if (var432 == 339) {
                                    var430[var431] = -100;
                                } else if (var432 == 382) {
                                    var430[var431] = -98;
                                } else if (var432 == 376) {
                                    var430[var431] = -97;
                                } else {
                                    var430[var431] = 63;
                                }
                            }
                            var427.method2232(var430.length);
                            var427.field1890 += Statics.field3081.method2159(var430, 0, var430.length, var427.field1889, var427.field1890);
                            client.field266.method2231(client.field266.field1890 - var426);
                            continue;
                        }
                        if (var477 == 5009) {
                            var6 -= 2;
                            String var435 = field762[var6];
                            String var436 = field762[var6 + 1];
                            client.field266.method2493(57);
                            client.field266.method2220(0);
                            int var437 = client.field266.field1890;
                            client.field266.method2225(var435);
                            class114 var438 = client.field266;
                            int var439 = var438.field1890;
                            int var440 = var436.length();
                            byte[] var441 = new byte[var440];
                            for (int var442 = 0; var442 < var440; var442++) {
                                char var443 = var436.charAt(var442);
                                if (!(var443 <= 0 || var443 >= 128) || !(var443 < 160 || var443 > 255)) {
                                    var441[var442] = (byte) var443;
                                } else if (var443 == 8364) {
                                    var441[var442] = -128;
                                } else if (var443 == 8218) {
                                    var441[var442] = -126;
                                } else if (var443 == 402) {
                                    var441[var442] = -125;
                                } else if (var443 == 8222) {
                                    var441[var442] = -124;
                                } else if (var443 == 8230) {
                                    var441[var442] = -123;
                                } else if (var443 == 8224) {
                                    var441[var442] = -122;
                                } else if (var443 == 8225) {
                                    var441[var442] = -121;
                                } else if (var443 == 710) {
                                    var441[var442] = -120;
                                } else if (var443 == 8240) {
                                    var441[var442] = -119;
                                } else if (var443 == 352) {
                                    var441[var442] = -118;
                                } else if (var443 == 8249) {
                                    var441[var442] = -117;
                                } else if (var443 == 338) {
                                    var441[var442] = -116;
                                } else if (var443 == 381) {
                                    var441[var442] = -114;
                                } else if (var443 == 8216) {
                                    var441[var442] = -111;
                                } else if (var443 == 8217) {
                                    var441[var442] = -110;
                                } else if (var443 == 8220) {
                                    var441[var442] = -109;
                                } else if (var443 == 8221) {
                                    var441[var442] = -108;
                                } else if (var443 == 8226) {
                                    var441[var442] = -107;
                                } else if (var443 == 8211) {
                                    var441[var442] = -106;
                                } else if (var443 == 8212) {
                                    var441[var442] = -105;
                                } else if (var443 == 732) {
                                    var441[var442] = -104;
                                } else if (var443 == 8482) {
                                    var441[var442] = -103;
                                } else if (var443 == 353) {
                                    var441[var442] = -102;
                                } else if (var443 == 8250) {
                                    var441[var442] = -101;
                                } else if (var443 == 339) {
                                    var441[var442] = -100;
                                } else if (var443 == 382) {
                                    var441[var442] = -98;
                                } else if (var443 == 376) {
                                    var441[var442] = -97;
                                } else {
                                    var441[var442] = 63;
                                }
                            }
                            var438.method2232(var441.length);
                            var438.field1890 += Statics.field3081.method2159(var441, 0, var441.length, var438.field1889, var438.field1890);
                            client.field266.method2433(client.field266.field1890 - var437);
                            continue;
                        }
                        if (var477 == 5015) {
                            String var446;
                            if (Statics.field37 == null || Statics.field37.field49 == null) {
                                var446 = "";
                            } else {
                                var446 = Statics.field37.field49;
                            }
                            field762[var6++] = var446;
                            continue;
                        }
                        if (var477 == 5016) {
                            field761[var5++] = client.field496;
                            continue;
                        }
                        if (var477 == 5017) {
                            var5--;
                            int var447 = field761[var5];
                            field761[var5++] = class11.method1432(var447);
                            continue;
                        }
                        if (var477 == 5018) {
                            var5--;
                            int var448 = field761[var5];
                            int[] var449 = field761;
                            int var450 = var5++;
                            class33 var451 = (class33) class11.field158.method3427((long) var448);
                            int var452;
                            if (var451 == null) {
                                var452 = -1;
                            } else if (class11.field159.field3004 == var451.field3008) {
                                var452 = -1;
                            } else {
                                var452 = ((class33) var451.field3008).field754;
                            }
                            var449[var450] = var452;
                            continue;
                        }
                        if (var477 == 5019) {
                            var5--;
                            int var453 = field761[var5];
                            field761[var5++] = class11.method511(var453);
                            continue;
                        }
                        if (var477 == 5020) {
                            var6--;
                            String var454 = field762[var6];
                            client.method158(var454);
                            continue;
                        }
                        if (var477 == 5021) {
                            var6--;
                            client.field506 = field762[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var477 == 5022) {
                            field762[var6++] = client.field506;
                            continue;
                        }
                    }
                }
                if (var477 < 5400) {
                    if (var477 == 5306) {
                        field761[var5++] = client.method3350();
                        continue;
                    }
                    if (var477 == 5307) {
                        var5--;
                        int var455 = field761[var5];
                        if (var455 != 1 && var455 != 2) {
                            continue;
                        }
                        client.field490 = 0L;
                        if (var455 >= 2) {
                            client.field491 = true;
                        } else {
                            client.field491 = false;
                        }
                        client.method895();
                        if (client.field278 >= 25) {
                            client.field266.method2493(141);
                            client.field266.method2219(client.method3350());
                            client.field266.method2220(Statics.field696);
                            client.field266.method2220(Statics.field1848);
                        }
                        class136.field2103 = true;
                        continue;
                    }
                    if (var477 == 5308) {
                        field761[var5++] = Statics.field1306.field138;
                        continue;
                    }
                    if (var477 == 5309) {
                        var5--;
                        int var456 = field761[var5];
                        if (var456 == 1 || var456 == 2) {
                            Statics.field1306.field138 = var456;
                            class9.method2700();
                        }
                        continue;
                    }
                }
                if (var477 < 5600 && var477 == 5504) {
                    var5 -= 2;
                    int var457 = field761[var5];
                    int var458 = field761[var5 + 1];
                    if (!client.field493) {
                        client.field357 = var457;
                        client.field358 = var458;
                    }
                } else if (var477 < 5700 && var477 == 5630) {
                    client.field325 = 250;
                } else {
                    if (var477 < 6300) {
                        if (var477 == 6200) {
                            var5 -= 2;
                            client.field516 = (short) field761[var5];
                            if (client.field516 <= 0) {
                                client.field516 = 256;
                            }
                            client.field532 = (short) field761[var5 + 1];
                            if (client.field532 <= 0) {
                                client.field532 = 205;
                            }
                            continue;
                        }
                        if (var477 == 6201) {
                            var5 -= 2;
                            client.field533 = (short) field761[var5];
                            if (client.field533 <= 0) {
                                client.field533 = 256;
                            }
                            client.field434 = (short) field761[var5 + 1];
                            if (client.field434 <= 0) {
                                client.field434 = 320;
                            }
                            continue;
                        }
                        if (var477 == 6202) {
                            var5 -= 4;
                            client.field535 = (short) field761[var5];
                            if (client.field535 <= 0) {
                                client.field535 = 1;
                            }
                            client.field536 = (short) field761[var5 + 1];
                            if (client.field536 <= 0) {
                                client.field536 = 32767;
                            } else if (client.field536 < client.field535) {
                                client.field536 = client.field535;
                            }
                            client.field547 = (short) field761[var5 + 2];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field467 = (short) field761[var5 + 3];
                            if (client.field467 <= 0) {
                                client.field467 = 32767;
                            } else if (client.field467 < client.field547) {
                                client.field467 = client.field547;
                            }
                            continue;
                        }
                        if (var477 == 6203) {
                            if (client.field447 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = -1;
                            } else {
                                client.method104(0, 0, client.field447.field2674, client.field447.field2675, false);
                                field761[var5++] = client.field541;
                                field761[var5++] = client.field443;
                            }
                            continue;
                        }
                        if (var477 == 6204) {
                            field761[var5++] = client.field533;
                            field761[var5++] = client.field434;
                            continue;
                        }
                        if (var477 == 6205) {
                            field761[var5++] = client.field516;
                            field761[var5++] = client.field532;
                            continue;
                        }
                    }
                    if (var477 < 6600) {
                        if (var477 == 6500) {
                            field761[var5++] = class24.method2602() ? 1 : 0;
                            continue;
                        }
                        if (var477 == 6501) {
                            class24.field610 = 0;
                            class24 var459;
                            if (class24.field610 < class24.field621) {
                                var459 = Statics.field736[++class24.field610 - 1];
                            } else {
                                var459 = null;
                            }
                            if (var459 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                                field761[var5++] = 0;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field761[var5++] = var459.field613;
                                field761[var5++] = var459.field614;
                                field762[var6++] = var459.field617;
                                field761[var5++] = var459.field620;
                                field761[var5++] = var459.field611;
                                field762[var6++] = var459.field609;
                            }
                            continue;
                        }
                        if (var477 == 6502) {
                            class24 var462;
                            if (class24.field610 < class24.field621) {
                                var462 = Statics.field736[++class24.field610 - 1];
                            } else {
                                var462 = null;
                            }
                            if (var462 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                                field761[var5++] = 0;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field761[var5++] = var462.field613;
                                field761[var5++] = var462.field614;
                                field762[var6++] = var462.field617;
                                field761[var5++] = var462.field620;
                                field761[var5++] = var462.field611;
                                field762[var6++] = var462.field609;
                            }
                            continue;
                        }
                        if (var477 == 6506) {
                            var5--;
                            int var464 = field761[var5];
                            class24 var465 = null;
                            for (int var466 = 0; var466 < class24.field621; var466++) {
                                if (Statics.field736[var466].field613 == var464) {
                                    var465 = Statics.field736[var466];
                                    break;
                                }
                            }
                            if (var465 == null) {
                                field761[var5++] = -1;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                                field761[var5++] = 0;
                                field761[var5++] = 0;
                                field762[var6++] = "";
                            } else {
                                field761[var5++] = var465.field613;
                                field761[var5++] = var465.field614;
                                field762[var6++] = var465.field617;
                                field761[var5++] = var465.field620;
                                field761[var5++] = var465.field611;
                                field762[var6++] = var465.field609;
                            }
                            continue;
                        }
                        if (var477 == 6507) {
                            var5 -= 4;
                            int var467 = field761[var5];
                            boolean var468 = field761[var5 + 1] == 1;
                            int var469 = field761[var5 + 2];
                            boolean var470 = field761[var5 + 3] == 1;
                            class24.method132(var467, var468, var469, var470);
                            continue;
                        }
                        if (var477 == 6511) {
                            var5--;
                            int var471 = field761[var5];
                            if (var471 >= 0 && var471 < class24.field621) {
                                class24 var472 = Statics.field736[var471];
                                field761[var5++] = var472.field613;
                                field761[var5++] = var472.field614;
                                field762[var6++] = var472.field617;
                                field761[var5++] = var472.field620;
                                field761[var5++] = var472.field611;
                                field762[var6++] = var472.field609;
                                continue;
                            }
                            field761[var5++] = -1;
                            field761[var5++] = 0;
                            field762[var6++] = "";
                            field761[var5++] = 0;
                            field761[var5++] = 0;
                            field762[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var476) {
            StringBuilder var474 = new StringBuilder(30);
            var474.append("").append(var4.field3018).append(" ");
            for (int var475 = field757 - 1; var475 >= 0; var475--) {
                var474.append("").append(field764[var475].field201.field3018).append(" ");
            }
            var474.append("").append(var10);
            class140.method2571(var474.toString(), var476);
        }
    }
}
