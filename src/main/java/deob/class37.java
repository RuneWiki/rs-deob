package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("an")
public class class37 {

    @ObfuscatedName("an.q")
    public static int[] field801 = new int[5];

    @ObfuscatedName("an.u")
    public static int[][] field797 = new int[5][5000];

    @ObfuscatedName("an.m")
    public static int[] field798 = new int[1000];

    @ObfuscatedName("an.y")
    public static String[] field805 = new String[1000];

    @ObfuscatedName("an.p")
    public static int field800 = 0;

    @ObfuscatedName("an.t")
    public static class15[] field802 = new class15[50];

    @ObfuscatedName("an.l")
    public static Calendar field796 = Calendar.getInstance();

    @ObfuscatedName("an.e")
    public static final String[] field803 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("an.a")
    public static int field804 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.o(Lo;II)V")
    public static void method3091(class1 arg0, int arg1) {
        Object[] var2 = arg0.field4;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method176(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field600;
        int[] var9 = var4.field609;
        byte var10 = -1;
        field800 = 0;
        try {
            Statics.field794 = new int[var4.field604];
            int var11 = 0;
            Statics.field795 = new String[var4.field605];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field19;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2769;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2755;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2769;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2755;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field9;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field7;
                    }
                    Statics.field794[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field795[var12++] = var15;
                }
            }
            int var16 = 0;
            field804 = arg0.field11;
            label3218: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var524 = var8[var7];
                if (var524 < 100) {
                    if (var524 == 0) {
                        field798[var5++] = var9[var7];
                        continue;
                    }
                    if (var524 == 1) {
                        int var17 = var9[var7];
                        field798[var5++] = class176.field2901[var17];
                        continue;
                    }
                    if (var524 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2901[var18] = field798[var5];
                        client.method2218(var18);
                        continue;
                    }
                    if (var524 == 3) {
                        field805[var6++] = var4.field603[var7];
                        continue;
                    }
                    if (var524 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var524 == 7) {
                        var5 -= 2;
                        if (field798[var5 + 1] != field798[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 8) {
                        var5 -= 2;
                        if (field798[var5 + 1] == field798[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 9) {
                        var5 -= 2;
                        if (field798[var5] < field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 10) {
                        var5 -= 2;
                        if (field798[var5] > field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 21) {
                        if (field800 == 0) {
                            return;
                        }
                        class15 var19 = field802[--field800];
                        var4 = var19.field214;
                        var8 = var4.field600;
                        var9 = var4.field609;
                        var7 = var19.field218;
                        Statics.field794 = var19.field215;
                        Statics.field795 = var19.field216;
                        continue;
                    }
                    if (var524 == 25) {
                        int var20 = var9[var7];
                        field798[var5++] = class176.method701(var20);
                        continue;
                    }
                    if (var524 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        class176.method2876(var21, field798[var5]);
                        continue;
                    }
                    if (var524 == 31) {
                        var5 -= 2;
                        if (field798[var5] <= field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 32) {
                        var5 -= 2;
                        if (field798[var5] >= field798[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var524 == 33) {
                        field798[var5++] = Statics.field794[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var524 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field794[var10001] = field798[var5];
                        continue;
                    }
                    if (var524 == 35) {
                        field805[var6++] = Statics.field795[var9[var7]];
                        continue;
                    }
                    if (var524 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field795[var10001] = field805[var6];
                        continue;
                    }
                    if (var524 == 37) {
                        int var22 = var9[var7];
                        var6 -= var22;
                        String[] var23 = field805;
                        String var24;
                        if (var22 == 0) {
                            var24 = "";
                        } else if (var22 == 1) {
                            String var25 = var23[var6];
                            if (var25 == null) {
                                var24 = "null";
                            } else {
                                var24 = var25.toString();
                            }
                        } else {
                            int var26 = var6 + var22;
                            int var27 = 0;
                            for (int var28 = var6; var28 < var26; var28++) {
                                String var29 = var23[var28];
                                if (var29 == null) {
                                    var27 += 4;
                                } else {
                                    var27 += var29.length();
                                }
                            }
                            StringBuilder var30 = new StringBuilder(var27);
                            for (int var31 = var6; var31 < var26; var31++) {
                                String var32 = var23[var31];
                                if (var32 == null) {
                                    var30.append("null");
                                } else {
                                    var30.append(var32);
                                }
                            }
                            var24 = var30.toString();
                        }
                        field805[var6++] = var24;
                        continue;
                    }
                    if (var524 == 38) {
                        var5--;
                        continue;
                    }
                    if (var524 == 39) {
                        var6--;
                        continue;
                    }
                    if (var524 == 40) {
                        int var34 = var9[var7];
                        class23 var35 = class23.method176(var34);
                        int[] var36 = new int[var35.field604];
                        String[] var37 = new String[var35.field605];
                        for (int var38 = 0; var38 < var35.field606; var38++) {
                            var36[var38] = field798[var5 - var35.field606 + var38];
                        }
                        for (int var39 = 0; var39 < var35.field607; var39++) {
                            var37[var39] = field805[var6 - var35.field607 + var39];
                        }
                        var5 -= var35.field606;
                        var6 -= var35.field607;
                        class15 var40 = new class15();
                        var40.field214 = var4;
                        var40.field218 = var7;
                        var40.field215 = Statics.field794;
                        var40.field216 = Statics.field795;
                        field802[++field800 - 1] = var40;
                        var4 = var35;
                        var8 = var35.field600;
                        var9 = var35.field609;
                        var7 = -1;
                        Statics.field794 = var36;
                        Statics.field795 = var37;
                        continue;
                    }
                    if (var524 == 42) {
                        field798[var5++] = Statics.field358.method196(var9[var7]);
                        continue;
                    }
                    if (var524 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field358.method187(var10001, field798[var5]);
                        continue;
                    }
                    if (var524 == 44) {
                        int var41 = var9[var7] >> 16;
                        int var42 = var9[var7] & 0xFFFF;
                        var5--;
                        int var43 = field798[var5];
                        if (var43 >= 0 && var43 <= 5000) {
                            field801[var41] = var43;
                            byte var44 = -1;
                            if (var42 == 105) {
                                var44 = 0;
                            }
                            int var45 = 0;
                            while (true) {
                                if (var45 >= var43) {
                                    continue label3218;
                                }
                                field797[var41][var45] = var44;
                                var45++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var524 == 45) {
                        int var46 = var9[var7];
                        var5--;
                        int var47 = field798[var5];
                        if (var47 >= 0 && var47 < field801[var46]) {
                            field798[var5++] = field797[var46][var47];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var524 == 46) {
                        int var48 = var9[var7];
                        var5 -= 2;
                        int var49 = field798[var5];
                        if (var49 >= 0 && var49 < field801[var48]) {
                            field797[var48][var49] = field798[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var524 == 47) {
                        String var50 = Statics.field358.method207(var9[var7]);
                        if (var50 == null) {
                            var50 = "null";
                        }
                        field805[var6++] = var50;
                        continue;
                    }
                    if (var524 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field358.method215(var10001, field805[var6]);
                        continue;
                    }
                }
                boolean var51;
                if (var9[var7] == 1) {
                    var51 = true;
                } else {
                    var51 = false;
                }
                if (var524 < 1000) {
                    if (var524 == 100) {
                        var5 -= 3;
                        int var52 = field798[var5];
                        int var53 = field798[var5 + 1];
                        int var54 = field798[var5 + 2];
                        if (var53 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var55 = class173.method2765(var52);
                        if (var55.field2886 == null) {
                            var55.field2886 = new class173[var54 + 1];
                        }
                        if (var55.field2886.length <= var54) {
                            class173[] var56 = new class173[var54 + 1];
                            for (int var57 = 0; var57 < var55.field2886.length; var57++) {
                                var56[var57] = var55.field2886[var57];
                            }
                            var55.field2886 = var56;
                        }
                        if (var54 > 0 && var55.field2886[var54 - 1] == null) {
                            throw new RuntimeException("" + (var54 - 1));
                        }
                        class173 var58 = new class173();
                        var58.field2756 = var53;
                        var58.field2773 = var58.field2769 = var55.field2769;
                        var58.field2755 = var54;
                        var58.field2753 = true;
                        var55.field2886[var54] = var58;
                        if (var51) {
                            Statics.field2900 = var58;
                        } else {
                            Statics.field33 = var58;
                        }
                        Statics.method572(var55);
                        continue;
                    }
                    if (var524 == 101) {
                        class173 var59 = var51 ? Statics.field2900 : Statics.field33;
                        class173 var60 = class173.method2765(var59.field2769);
                        var60.field2886[var59.field2755] = null;
                        Statics.method572(var60);
                        continue;
                    }
                    if (var524 == 102) {
                        var5--;
                        class173 var61 = class173.method2765(field798[var5]);
                        var61.field2886 = null;
                        Statics.method572(var61);
                        continue;
                    }
                    if (var524 == 200) {
                        var5 -= 2;
                        int var62 = field798[var5];
                        int var63 = field798[var5 + 1];
                        class173 var64 = class173.method2212(var62, var63);
                        if (var64 != null && var63 != -1) {
                            field798[var5++] = 1;
                            if (var51) {
                                Statics.field2900 = var64;
                            } else {
                                Statics.field33 = var64;
                            }
                            continue;
                        }
                        field798[var5++] = 0;
                        continue;
                    }
                    if (var524 == 201) {
                        var5--;
                        class173 var65 = class173.method2765(field798[var5]);
                        if (var65 == null) {
                            field798[var5++] = 0;
                        } else {
                            field798[var5++] = 1;
                            if (var51) {
                                Statics.field2900 = var65;
                            } else {
                                Statics.field33 = var65;
                            }
                        }
                        continue;
                    }
                } else if (var524 >= 1000 && var524 < 1100 || var524 >= 2000 && var524 < 2100) {
                    int var66 = -1;
                    class173 var67;
                    if (var524 >= 2000) {
                        var524 -= 1000;
                        var5--;
                        var66 = field798[var5];
                        var67 = class173.method2765(var66);
                    } else {
                        var67 = var51 ? Statics.field2900 : Statics.field33;
                    }
                    if (var524 == 1000) {
                        var5 -= 4;
                        var67.field2763 = field798[var5];
                        var67.field2764 = field798[var5 + 1];
                        var67.field2759 = field798[var5 + 2];
                        var67.field2760 = field798[var5 + 3];
                        Statics.method572(var67);
                        client.method2755(var67);
                        if (var66 != -1 && var67.field2756 == 0) {
                            client.method1444(Statics.field2807[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var524 == 1001) {
                        var5 -= 4;
                        var67.field2824 = field798[var5];
                        var67.field2766 = field798[var5 + 1];
                        var67.field2761 = field798[var5 + 2];
                        var67.field2794 = field798[var5 + 3];
                        Statics.method572(var67);
                        client.method2755(var67);
                        if (var66 != -1 && var67.field2756 == 0) {
                            client.method1444(Statics.field2807[var66 >> 16], var67, false);
                        }
                        continue;
                    }
                    if (var524 == 1003) {
                        var5--;
                        boolean var68 = field798[var5] == 1;
                        if (var67.field2774 != var68) {
                            var67.field2774 = var68;
                            Statics.method572(var67);
                        }
                        continue;
                    }
                    if (var524 == 1005) {
                        var5--;
                        var67.field2885 = field798[var5] == 1;
                        continue;
                    }
                    if (var524 == 1006) {
                        var5--;
                        var67.field2837 = field798[var5] == 1;
                        continue;
                    }
                } else if (!(var524 < 1100 || var524 >= 1200) || !(var524 < 2100 || var524 >= 2200)) {
                    int var69 = -1;
                    class173 var70;
                    if (var524 >= 2000) {
                        var524 -= 1000;
                        var5--;
                        var69 = field798[var5];
                        var70 = class173.method2765(var69);
                    } else {
                        var70 = var51 ? Statics.field2900 : Statics.field33;
                    }
                    if (var524 == 1100) {
                        var5 -= 2;
                        var70.field2776 = field798[var5];
                        if (var70.field2776 > var70.field2777 - var70.field2793) {
                            var70.field2776 = var70.field2777 - var70.field2793;
                        }
                        if (var70.field2776 < 0) {
                            var70.field2776 = 0;
                        }
                        var70.field2751 = field798[var5 + 1];
                        if (var70.field2751 > var70.field2778 - var70.field2770) {
                            var70.field2751 = var70.field2778 - var70.field2770;
                        }
                        if (var70.field2751 < 0) {
                            var70.field2751 = 0;
                        }
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1101) {
                        var5--;
                        var70.field2779 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1102) {
                        var5--;
                        var70.field2783 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1103) {
                        var5--;
                        var70.field2789 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1104) {
                        var5--;
                        var70.field2822 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1105) {
                        var5--;
                        var70.field2787 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1106) {
                        var5--;
                        var70.field2775 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1107) {
                        var5--;
                        var70.field2790 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1108) {
                        var70.field2870 = 1;
                        var5--;
                        var70.field2796 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1109) {
                        var5 -= 6;
                        var70.field2801 = field798[var5];
                        var70.field2802 = field798[var5 + 1];
                        var70.field2803 = field798[var5 + 2];
                        var70.field2804 = field798[var5 + 3];
                        var70.field2805 = field798[var5 + 4];
                        var70.field2806 = field798[var5 + 5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1110) {
                        var5--;
                        int var71 = field798[var5];
                        if (var70.field2754 != var71) {
                            var70.field2754 = var71;
                            var70.field2874 = 0;
                            var70.field2875 = 0;
                            Statics.method572(var70);
                        }
                        continue;
                    }
                    if (var524 == 1111) {
                        var5--;
                        var70.field2809 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1112) {
                        var6--;
                        String var72 = field805[var6];
                        if (!var72.equals(var70.field2830)) {
                            var70.field2830 = var72;
                            Statics.method572(var70);
                        }
                        continue;
                    }
                    if (var524 == 1113) {
                        var5--;
                        var70.field2811 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1114) {
                        var5 -= 3;
                        var70.field2877 = field798[var5];
                        var70.field2816 = field798[var5 + 1];
                        var70.field2815 = field798[var5 + 2];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1115) {
                        var5--;
                        var70.field2744 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1116) {
                        var5--;
                        var70.field2841 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1117) {
                        var5--;
                        var70.field2792 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1118) {
                        var5--;
                        var70.field2850 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1119) {
                        var5--;
                        var70.field2862 = field798[var5] == 1;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1120) {
                        var5 -= 2;
                        var70.field2777 = field798[var5];
                        var70.field2778 = field798[var5 + 1];
                        Statics.method572(var70);
                        if (var69 != -1 && var70.field2756 == 0) {
                            client.method1444(Statics.field2807[var69 >> 16], var70, false);
                        }
                        continue;
                    }
                    if (var524 == 1121) {
                        client.method153(var70.field2769, var70.field2755);
                        client.field300 = var70;
                        Statics.method572(var70);
                        continue;
                    }
                    if (var524 == 1122) {
                        var5--;
                        var70.field2868 = field798[var5];
                        Statics.method572(var70);
                        continue;
                    }
                } else if (!(var524 < 1200 || var524 >= 1300) || !(var524 < 2200 || var524 >= 2300)) {
                    class173 var73;
                    if (var524 >= 2000) {
                        var524 -= 1000;
                        var5--;
                        var73 = class173.method2765(field798[var5]);
                    } else {
                        var73 = var51 ? Statics.field2900 : Statics.field33;
                    }
                    Statics.method572(var73);
                    if (var524 == 1200 || var524 == 1205 || var524 == 1212) {
                        var5 -= 2;
                        int var74 = field798[var5];
                        int var75 = field798[var5 + 1];
                        var73.field2872 = var74;
                        var73.field2873 = var75;
                        class52 var76 = class52.method1979(var74);
                        var73.field2803 = var76.field1125;
                        var73.field2804 = var76.field1113;
                        var73.field2805 = var76.field1114;
                        var73.field2801 = var76.field1106;
                        var73.field2802 = var76.field1116;
                        var73.field2806 = var76.field1146;
                        if (var524 == 1205) {
                            var73.field2810 = 0;
                        } else if (var524 == 1212 | var76.field1117 == 1) {
                            var73.field2810 = 1;
                        } else {
                            var73.field2810 = 2;
                        }
                        if (var73.field2747 > 0) {
                            var73.field2806 = var73.field2806 * 32 / var73.field2747;
                        } else if (var73.field2824 > 0) {
                            var73.field2806 = var73.field2806 * 32 / var73.field2824;
                        }
                        continue;
                    }
                    if (var524 == 1201) {
                        var73.field2870 = 2;
                        var5--;
                        var73.field2796 = field798[var5];
                        continue;
                    }
                    if (var524 == 1202) {
                        var73.field2870 = 3;
                        var73.field2796 = Statics.field2040.field36.method3198();
                        continue;
                    }
                } else if ((var524 < 1300 || var524 >= 1400) && (var524 < 2300 || var524 >= 2400)) {
                    if (var524 >= 1400 && var524 < 1500 || var524 >= 2400 && var524 < 2500) {
                        class173 var81;
                        if (var524 >= 2000) {
                            var524 -= 1000;
                            var5--;
                            var81 = class173.method2765(field798[var5]);
                        } else {
                            var81 = var51 ? Statics.field2900 : Statics.field33;
                        }
                        var6--;
                        String var82 = field805[var6];
                        int[] var83 = null;
                        if (var82.length() > 0 && var82.charAt(var82.length() - 1) == 'Y') {
                            var5--;
                            int var84 = field798[var5];
                            if (var84 > 0) {
                                var83 = new int[var84];
                                while (var84-- > 0) {
                                    var5--;
                                    var83[var84] = field798[var5];
                                }
                            }
                            var82 = var82.substring(0, var82.length() - 1);
                        }
                        Object[] var85 = new Object[var82.length() + 1];
                        for (int var86 = var85.length - 1; var86 >= 1; var86--) {
                            if (var82.charAt(var86 - 1) == 's') {
                                var6--;
                                var85[var86] = field805[var6];
                            } else {
                                var5--;
                                var85[var86] = Integer.valueOf(field798[var5]);
                            }
                        }
                        var5--;
                        int var87 = field798[var5];
                        if (var87 == -1) {
                            var85 = null;
                        } else {
                            var85[0] = Integer.valueOf(var87);
                        }
                        if (var524 == 1400) {
                            var81.field2834 = var85;
                        }
                        if (var524 == 1401) {
                            var81.field2849 = var85;
                        }
                        if (var524 == 1402) {
                            var81.field2860 = var85;
                        }
                        if (var524 == 1403) {
                            var81.field2791 = var85;
                        }
                        if (var524 == 1404) {
                            var81.field2840 = var85;
                        }
                        if (var524 == 1405) {
                            var81.field2785 = var85;
                        }
                        if (var524 == 1406) {
                            var81.field2863 = var85;
                        }
                        if (var524 == 1407) {
                            var81.field2845 = var85;
                            var81.field2846 = var83;
                        }
                        if (var524 == 1408) {
                            var81.field2851 = var85;
                        }
                        if (var524 == 1409) {
                            var81.field2852 = var85;
                        }
                        if (var524 == 1410) {
                            var81.field2842 = var85;
                        }
                        if (var524 == 1411) {
                            var81.field2835 = var85;
                        }
                        if (var524 == 1412) {
                            var81.field2765 = var85;
                        }
                        if (var524 == 1414) {
                            var81.field2758 = var85;
                            var81.field2848 = var83;
                        }
                        if (var524 == 1415) {
                            var81.field2857 = var85;
                            var81.field2817 = var83;
                        }
                        if (var524 == 1416) {
                            var81.field2843 = var85;
                        }
                        if (var524 == 1417) {
                            var81.field2812 = var85;
                        }
                        if (var524 == 1418) {
                            var81.field2854 = var85;
                        }
                        if (var524 == 1419) {
                            var81.field2855 = var85;
                        }
                        if (var524 == 1420) {
                            var81.field2856 = var85;
                        }
                        if (var524 == 1421) {
                            var81.field2844 = var85;
                        }
                        if (var524 == 1422) {
                            var81.field2858 = var85;
                        }
                        if (var524 == 1423) {
                            var81.field2859 = var85;
                        }
                        if (var524 == 1424) {
                            var81.field2814 = var85;
                        }
                        if (var524 == 1425) {
                            var81.field2788 = var85;
                        }
                        if (var524 == 1426) {
                            var81.field2831 = var85;
                        }
                        if (var524 == 1427) {
                            var81.field2861 = var85;
                        }
                        var81.field2832 = true;
                        continue;
                    }
                    if (var524 < 1600) {
                        class173 var88 = var51 ? Statics.field2900 : Statics.field33;
                        if (var524 == 1500) {
                            field798[var5++] = var88.field2767;
                            continue;
                        }
                        if (var524 == 1501) {
                            field798[var5++] = var88.field2820;
                            continue;
                        }
                        if (var524 == 1502) {
                            field798[var5++] = var88.field2793;
                            continue;
                        }
                        if (var524 == 1503) {
                            field798[var5++] = var88.field2770;
                            continue;
                        }
                        if (var524 == 1504) {
                            field798[var5++] = var88.field2774 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 1505) {
                            field798[var5++] = var88.field2773;
                            continue;
                        }
                    } else if (var524 < 1700) {
                        class173 var89 = var51 ? Statics.field2900 : Statics.field33;
                        if (var524 == 1600) {
                            field798[var5++] = var89.field2776;
                            continue;
                        }
                        if (var524 == 1601) {
                            field798[var5++] = var89.field2751;
                            continue;
                        }
                        if (var524 == 1602) {
                            field805[var6++] = var89.field2830;
                            continue;
                        }
                        if (var524 == 1603) {
                            field798[var5++] = var89.field2777;
                            continue;
                        }
                        if (var524 == 1604) {
                            field798[var5++] = var89.field2778;
                            continue;
                        }
                        if (var524 == 1605) {
                            field798[var5++] = var89.field2806;
                            continue;
                        }
                        if (var524 == 1606) {
                            field798[var5++] = var89.field2803;
                            continue;
                        }
                        if (var524 == 1607) {
                            field798[var5++] = var89.field2805;
                            continue;
                        }
                        if (var524 == 1608) {
                            field798[var5++] = var89.field2804;
                            continue;
                        }
                        if (var524 == 1609) {
                            field798[var5++] = var89.field2789;
                            continue;
                        }
                    } else if (var524 < 1800) {
                        class173 var90 = var51 ? Statics.field2900 : Statics.field33;
                        if (var524 == 1700) {
                            field798[var5++] = var90.field2872;
                            continue;
                        }
                        if (var524 == 1701) {
                            if (var90.field2872 == -1) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var90.field2873;
                            }
                            continue;
                        }
                        if (var524 == 1702) {
                            field798[var5++] = var90.field2755;
                            continue;
                        }
                    } else if (var524 < 1900) {
                        class173 var91 = var51 ? Statics.field2900 : Statics.field33;
                        if (var524 == 1800) {
                            int[] var92 = field798;
                            int var93 = var5++;
                            int var94 = client.method707(var91);
                            int var95 = var94 >> 11 & 0x3F;
                            var92[var93] = var95;
                            continue;
                        }
                        if (var524 == 1801) {
                            var5--;
                            int var96 = field798[var5];
                            int var525 = var96 - 1;
                            if (var91.field2826 != null && var525 < var91.field2826.length && var91.field2826[var525] != null) {
                                field805[var6++] = var91.field2826[var525];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 1802) {
                            if (var91.field2825 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var91.field2825;
                            }
                            continue;
                        }
                    } else if (!(var524 < 1900 || var524 >= 2000) || !(var524 < 2900 || var524 >= 3000)) {
                        class173 var97;
                        if (var524 >= 2000) {
                            var524 -= 1000;
                            var5--;
                            var97 = class173.method2765(field798[var5]);
                        } else {
                            var97 = var51 ? Statics.field2900 : Statics.field33;
                        }
                        if (var524 == 1927) {
                            if (field804 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var97.field2861 == null) {
                                return;
                            }
                            class1 var98 = new class1();
                            var98.field3 = var97;
                            var98.field4 = var97.field2861;
                            var98.field11 = field804 + 1;
                            client.field486.method3515(arg0);
                            continue;
                        }
                    } else if (var524 < 2600) {
                        var5--;
                        class173 var99 = class173.method2765(field798[var5]);
                        if (var524 == 2500) {
                            field798[var5++] = var99.field2767;
                            continue;
                        }
                        if (var524 == 2501) {
                            field798[var5++] = var99.field2820;
                            continue;
                        }
                        if (var524 == 2502) {
                            field798[var5++] = var99.field2793;
                            continue;
                        }
                        if (var524 == 2503) {
                            field798[var5++] = var99.field2770;
                            continue;
                        }
                        if (var524 == 2504) {
                            field798[var5++] = var99.field2774 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 2505) {
                            field798[var5++] = var99.field2773;
                            continue;
                        }
                    } else if (var524 < 2700) {
                        var5--;
                        class173 var100 = class173.method2765(field798[var5]);
                        if (var524 == 2600) {
                            field798[var5++] = var100.field2776;
                            continue;
                        }
                        if (var524 == 2601) {
                            field798[var5++] = var100.field2751;
                            continue;
                        }
                        if (var524 == 2602) {
                            field805[var6++] = var100.field2830;
                            continue;
                        }
                        if (var524 == 2603) {
                            field798[var5++] = var100.field2777;
                            continue;
                        }
                        if (var524 == 2604) {
                            field798[var5++] = var100.field2778;
                            continue;
                        }
                        if (var524 == 2605) {
                            field798[var5++] = var100.field2806;
                            continue;
                        }
                        if (var524 == 2606) {
                            field798[var5++] = var100.field2803;
                            continue;
                        }
                        if (var524 == 2607) {
                            field798[var5++] = var100.field2805;
                            continue;
                        }
                        if (var524 == 2608) {
                            field798[var5++] = var100.field2804;
                            continue;
                        }
                        if (var524 == 2609) {
                            field798[var5++] = var100.field2789;
                            continue;
                        }
                    } else if (var524 < 2800) {
                        if (var524 == 2700) {
                            var5--;
                            class173 var101 = class173.method2765(field798[var5]);
                            field798[var5++] = var101.field2872;
                            continue;
                        }
                        if (var524 == 2701) {
                            var5--;
                            class173 var102 = class173.method2765(field798[var5]);
                            if (var102.field2872 == -1) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var102.field2873;
                            }
                            continue;
                        }
                        if (var524 == 2702) {
                            var5--;
                            int var103 = field798[var5];
                            class4 var104 = (class4) client.field447.method3482((long) var103);
                            if (var104 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = 1;
                            }
                            continue;
                        }
                        if (var524 == 2706) {
                            field798[var5++] = client.field392;
                            continue;
                        }
                    } else if (var524 < 2900) {
                        var5--;
                        class173 var105 = class173.method2765(field798[var5]);
                        if (var524 == 2800) {
                            int[] var106 = field798;
                            int var107 = var5++;
                            int var108 = client.method707(var105);
                            int var109 = var108 >> 11 & 0x3F;
                            var106[var107] = var109;
                            continue;
                        }
                        if (var524 == 2801) {
                            var5--;
                            int var110 = field798[var5];
                            int var526 = var110 - 1;
                            if (var105.field2826 != null && var526 < var105.field2826.length && var105.field2826[var526] != null) {
                                field805[var6++] = var105.field2826[var526];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 2802) {
                            if (var105.field2825 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = var105.field2825;
                            }
                            continue;
                        }
                    } else if (var524 < 3200) {
                        if (var524 == 3100) {
                            var6--;
                            String var111 = field805[var6];
                            class12.method100(0, "", var111);
                            continue;
                        }
                        if (var524 == 3101) {
                            var5 -= 2;
                            client.method3077(Statics.field2040, field798[var5], field798[var5 + 1]);
                            continue;
                        }
                        if (var524 == 3103) {
                            client.field331.method2555(57);
                            for (class4 var112 = (class4) client.field447.method3486(); var112 != null; var112 = (class4) client.field447.method3484()) {
                                if (var112.field66 == 0 || var112.field66 == 3) {
                                    client.method110(var112, true);
                                }
                            }
                            if (client.field300 != null) {
                                Statics.method572(client.field300);
                                client.field300 = null;
                            }
                            continue;
                        }
                        if (var524 == 3104) {
                            var6--;
                            String var113 = field805[var6];
                            int var114 = 0;
                            boolean var115 = class163.method25(var113, 10, true);
                            if (var115) {
                                var114 = class163.method107(var113);
                            }
                            client.field331.method2555(66);
                            client.field331.method2278(var114);
                            continue;
                        }
                        if (var524 == 3105) {
                            var6--;
                            String var116 = field805[var6];
                            client.field331.method2555(133);
                            client.field331.method2347(var116.length() + 1);
                            client.field331.method2281(var116);
                            continue;
                        }
                        if (var524 == 3106) {
                            var6--;
                            String var117 = field805[var6];
                            client.field331.method2555(5);
                            client.field331.method2347(var117.length() + 1);
                            client.field331.method2281(var117);
                            continue;
                        }
                        if (var524 == 3107) {
                            var5--;
                            int var118 = field798[var5];
                            var6--;
                            String var119 = field805[var6];
                            client.method537(var118, var119);
                            continue;
                        }
                        if (var524 == 3108) {
                            var5 -= 3;
                            int var120 = field798[var5];
                            int var121 = field798[var5 + 1];
                            int var122 = field798[var5 + 2];
                            class173 var123 = class173.method2765(var122);
                            client.method3164(var123, var120, var121);
                            continue;
                        }
                        if (var524 == 3109) {
                            var5 -= 2;
                            int var124 = field798[var5];
                            int var125 = field798[var5 + 1];
                            class173 var126 = var51 ? Statics.field2900 : Statics.field33;
                            client.method3164(var126, var124, var125);
                            continue;
                        }
                        if (var524 == 3110) {
                            var5--;
                            Statics.field1037 = field798[var5] == 1;
                            continue;
                        }
                        if (var524 == 3111) {
                            field798[var5++] = Statics.field1030.field147 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3112) {
                            var5--;
                            Statics.field1030.field147 = field798[var5] == 1;
                            class9.method2599();
                            continue;
                        }
                        if (var524 == 3113) {
                            var6--;
                            String var127 = field805[var6];
                            var5--;
                            boolean var128 = field798[var5] == 1;
                            class138.method3425(var127, var128, false);
                            continue;
                        }
                        if (var524 == 3115) {
                            var5--;
                            int var129 = field798[var5];
                            client.field331.method2555(19);
                            client.field331.method2318(var129);
                            continue;
                        }
                        if (var524 == 3116) {
                            var5--;
                            int var130 = field798[var5];
                            var6 -= 2;
                            String var131 = field805[var6];
                            String var132 = field805[var6 + 1];
                            if (var131.length() <= 500 && var132.length() <= 500) {
                                client.field331.method2555(87);
                                client.field331.method2318(1 + class119.method2219(var131) + class119.method2219(var132));
                                client.field331.method2315(var130);
                                client.field331.method2281(var132);
                                client.field331.method2281(var131);
                            }
                            continue;
                        }
                    } else if (var524 < 3300) {
                        if (var524 == 3200) {
                            var5 -= 3;
                            client.method2078(field798[var5], field798[var5 + 1], field798[var5 + 2]);
                            continue;
                        }
                        if (var524 == 3201) {
                            var5--;
                            int var133 = field798[var5];
                            if (var133 == -1 && !client.field320) {
                                Statics.field3197.method3320();
                                class183.field2946 = 1;
                                Statics.field714 = null;
                            } else if (var133 != -1 && client.field525 != var133 && client.field357 != 0 && !client.field320) {
                                class183.method2169(2, Statics.field2658, var133, 0, client.field357, false);
                            }
                            client.field525 = var133;
                            continue;
                        }
                        if (var524 == 3202) {
                            var5 -= 2;
                            client.method557(field798[var5], field798[var5 + 1]);
                            continue;
                        }
                    } else if (var524 < 3400) {
                        if (var524 == 3300) {
                            field798[var5++] = client.field299;
                            continue;
                        }
                        if (var524 == 3301) {
                            var5 -= 2;
                            int var134 = field798[var5];
                            int var135 = field798[var5 + 1];
                            int[] var136 = field798;
                            int var137 = var5++;
                            class16 var138 = (class16) class16.field220.method3482((long) var134);
                            int var139;
                            if (var138 == null) {
                                var139 = -1;
                            } else if (var135 >= 0 && var135 < var138.field221.length) {
                                var139 = var138.field221[var135];
                            } else {
                                var139 = -1;
                            }
                            var136[var137] = var139;
                            continue;
                        }
                        if (var524 == 3302) {
                            var5 -= 2;
                            int var140 = field798[var5];
                            int var141 = field798[var5 + 1];
                            int[] var142 = field798;
                            int var143 = var5++;
                            class16 var144 = (class16) class16.field220.method3482((long) var140);
                            int var145;
                            if (var144 == null) {
                                var145 = 0;
                            } else if (var141 >= 0 && var141 < var144.field219.length) {
                                var145 = var144.field219[var141];
                            } else {
                                var145 = 0;
                            }
                            var142[var143] = var145;
                            continue;
                        }
                        if (var524 == 3303) {
                            var5 -= 2;
                            int var146 = field798[var5];
                            int var147 = field798[var5 + 1];
                            field798[var5++] = class16.method2087(var146, var147);
                            continue;
                        }
                        if (var524 == 3304) {
                            var5--;
                            int var148 = field798[var5];
                            int[] var149 = field798;
                            int var150 = var5++;
                            class51 var151 = (class51) class51.field1093.method3456((long) var148);
                            class51 var152;
                            if (var151 == null) {
                                byte[] var153 = Statics.field1092.method3030(5, var148);
                                class51 var154 = new class51();
                                if (var153 != null) {
                                    var154.method961(new class119(var153));
                                }
                                class51.field1093.method3451(var154, (long) var148);
                                var152 = var154;
                            } else {
                                var152 = var151;
                            }
                            var149[var150] = var152.field1094;
                            continue;
                        }
                        if (var524 == 3305) {
                            var5--;
                            int var155 = field798[var5];
                            field798[var5++] = client.field423[var155];
                            continue;
                        }
                        if (var524 == 3306) {
                            var5--;
                            int var156 = field798[var5];
                            field798[var5++] = client.field401[var156];
                            continue;
                        }
                        if (var524 == 3307) {
                            var5--;
                            int var157 = field798[var5];
                            field798[var5++] = client.field425[var157];
                            continue;
                        }
                        if (var524 == 3308) {
                            int var158 = Statics.field1516;
                            int var159 = (Statics.field2040.field854 >> 7) + Statics.field585;
                            int var160 = (Statics.field2040.field808 >> 7) + Statics.field57;
                            field798[var5++] = (var158 << 28) + (var159 << 14) + var160;
                            continue;
                        }
                        if (var524 == 3309) {
                            var5--;
                            int var161 = field798[var5];
                            field798[var5++] = var161 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var524 == 3310) {
                            var5--;
                            int var162 = field798[var5];
                            field798[var5++] = var162 >> 28;
                            continue;
                        }
                        if (var524 == 3311) {
                            var5--;
                            int var163 = field798[var5];
                            field798[var5++] = var163 & 0x3FFF;
                            continue;
                        }
                        if (var524 == 3312) {
                            field798[var5++] = client.field292 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3313) {
                            var5 -= 2;
                            int var164 = field798[var5] + 32768;
                            int var165 = field798[var5 + 1];
                            int[] var166 = field798;
                            int var167 = var5++;
                            class16 var168 = (class16) class16.field220.method3482((long) var164);
                            int var169;
                            if (var168 == null) {
                                var169 = -1;
                            } else if (var165 >= 0 && var165 < var168.field221.length) {
                                var169 = var168.field221[var165];
                            } else {
                                var169 = -1;
                            }
                            var166[var167] = var169;
                            continue;
                        }
                        if (var524 == 3314) {
                            var5 -= 2;
                            int var170 = field798[var5] + 32768;
                            int var171 = field798[var5 + 1];
                            int[] var172 = field798;
                            int var173 = var5++;
                            class16 var174 = (class16) class16.field220.method3482((long) var170);
                            int var175;
                            if (var174 == null) {
                                var175 = 0;
                            } else if (var171 >= 0 && var171 < var174.field219.length) {
                                var175 = var174.field219[var171];
                            } else {
                                var175 = 0;
                            }
                            var172[var173] = var175;
                            continue;
                        }
                        if (var524 == 3315) {
                            var5 -= 2;
                            int var176 = field798[var5] + 32768;
                            int var177 = field798[var5 + 1];
                            field798[var5++] = class16.method2087(var176, var177);
                            continue;
                        }
                        if (var524 == 3316) {
                            if (client.field453 >= 2) {
                                field798[var5++] = client.field453;
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                        if (var524 == 3317) {
                            field798[var5++] = client.field508;
                            continue;
                        }
                        if (var524 == 3318) {
                            field798[var5++] = client.field288;
                            continue;
                        }
                        if (var524 == 3321) {
                            field798[var5++] = client.field451;
                            continue;
                        }
                        if (var524 == 3322) {
                            field798[var5++] = client.field452;
                            continue;
                        }
                        if (var524 == 3323) {
                            if (client.field397) {
                                field798[var5++] = 1;
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                        if (var524 == 3324) {
                            field798[var5++] = client.field289;
                            continue;
                        }
                    } else if (var524 < 3500) {
                        if (var524 == 3400) {
                            var5 -= 2;
                            int var178 = field798[var5];
                            int var179 = field798[var5 + 1];
                            class49 var180 = (class49) class49.field1077.method3456((long) var178);
                            class49 var181;
                            if (var180 == null) {
                                byte[] var182 = Statics.field1076.method3030(8, var178);
                                class49 var183 = new class49();
                                if (var182 != null) {
                                    var183.method943(new class119(var182));
                                }
                                class49.field1077.method3451(var183, (long) var178);
                                var181 = var183;
                            } else {
                                var181 = var180;
                            }
                            class49 var184 = var181;
                            if (var181.field1070 != 's') {
                            }
                            for (int var185 = 0; var185 < var184.field1072; var185++) {
                                if (var184.field1073[var185] == var179) {
                                    field805[var6++] = var184.field1079[var185];
                                    var184 = null;
                                    break;
                                }
                            }
                            if (var184 != null) {
                                field805[var6++] = var184.field1084;
                            }
                            continue;
                        }
                        if (var524 == 3408) {
                            var5 -= 4;
                            int var186 = field798[var5];
                            int var187 = field798[var5 + 1];
                            int var188 = field798[var5 + 2];
                            int var189 = field798[var5 + 3];
                            class49 var190 = (class49) class49.field1077.method3456((long) var188);
                            class49 var191;
                            if (var190 == null) {
                                byte[] var192 = Statics.field1076.method3030(8, var188);
                                class49 var193 = new class49();
                                if (var192 != null) {
                                    var193.method943(new class119(var192));
                                }
                                class49.field1077.method3451(var193, (long) var188);
                                var191 = var193;
                            } else {
                                var191 = var190;
                            }
                            class49 var194 = var191;
                            if (var191.field1083 == var186 && var191.field1070 == var187) {
                                for (int var195 = 0; var195 < var194.field1072; var195++) {
                                    if (var194.field1073[var195] == var189) {
                                        if (var187 == 115) {
                                            field805[var6++] = var194.field1079[var195];
                                        } else {
                                            field798[var5++] = var194.field1078[var195];
                                        }
                                        var194 = null;
                                        break;
                                    }
                                }
                                if (var194 != null) {
                                    if (var187 == 115) {
                                        field805[var6++] = var194.field1084;
                                    } else {
                                        field798[var5++] = var194.field1075;
                                    }
                                }
                                continue;
                            }
                            if (var187 == 115) {
                                field805[var6++] = "null";
                            } else {
                                field798[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var524 < 3700) {
                        if (var524 == 3600) {
                            if (client.field555 == 0) {
                                field798[var5++] = -2;
                            } else if (client.field555 == 1) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var524 == 3601) {
                            var5--;
                            int var196 = field798[var5];
                            if (client.field555 == 2 && var196 < client.field554) {
                                field805[var6++] = client.field556[var196].field255;
                                field805[var6++] = client.field556[var196].field250;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 3602) {
                            var5--;
                            int var197 = field798[var5];
                            if (client.field555 == 2 && var197 < client.field554) {
                                field798[var5++] = client.field556[var197].field248;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var524 == 3603) {
                            var5--;
                            int var198 = field798[var5];
                            if (client.field555 == 2 && var198 < client.field554) {
                                field798[var5++] = client.field556[var198].field246;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var524 == 3604) {
                            var6--;
                            String var199 = field805[var6];
                            var5--;
                            int var200 = field798[var5];
                            client.method1421(var199, var200);
                            continue;
                        }
                        if (var524 == 3605) {
                            var6--;
                            String var201 = field805[var6];
                            if (var201 == null) {
                                continue;
                            }
                            if ((client.field554 < 200 || client.field494 == 1) && client.field554 < 400) {
                                String var202 = class164.method573(var201, Statics.field291);
                                if (var202 == null) {
                                    continue;
                                }
                                for (int var203 = 0; var203 < client.field554; var203++) {
                                    class18 var204 = client.field556[var203];
                                    String var205 = class164.method573(var204.field255, Statics.field291);
                                    if (var205 != null && var205.equals(var202)) {
                                        class12.method100(30, "", var201 + class157.field2466);
                                        continue label3218;
                                    }
                                    if (var204.field250 != null) {
                                        String var206 = class164.method573(var204.field250, Statics.field291);
                                        if (var206 != null && var206.equals(var202)) {
                                            class12.method100(30, "", var201 + class157.field2466);
                                            continue label3218;
                                        }
                                    }
                                }
                                for (int var207 = 0; var207 < client.field558; var207++) {
                                    class8 var208 = client.field559[var207];
                                    String var209 = class164.method573(var208.field139, Statics.field291);
                                    if (var209 != null && var209.equals(var202)) {
                                        class12.method100(30, "", class157.field2471 + var201 + class157.field2472);
                                        continue label3218;
                                    }
                                    if (var208.field143 != null) {
                                        String var210 = class164.method573(var208.field143, Statics.field291);
                                        if (var210 != null && var210.equals(var202)) {
                                            class12.method100(30, "", class157.field2471 + var201 + class157.field2472);
                                            continue label3218;
                                        }
                                    }
                                }
                                if (class164.method573(Statics.field2040.field44, Statics.field291).equals(var202)) {
                                    class12.method100(30, "", class157.field2555);
                                } else {
                                    client.field331.method2555(250);
                                    client.field331.method2347(class119.method2219(var201));
                                    client.field331.method2281(var201);
                                }
                                continue;
                            }
                            class12.method100(30, "", class157.field2440);
                            continue;
                        }
                        if (var524 == 3606) {
                            var6--;
                            String var211 = field805[var6];
                            if (var211 == null) {
                                continue;
                            }
                            String var212 = class164.method573(var211, Statics.field291);
                            if (var212 == null) {
                                continue;
                            }
                            int var213 = 0;
                            while (true) {
                                if (var213 >= client.field554) {
                                    continue label3218;
                                }
                                class18 var214 = client.field556[var213];
                                String var215 = var214.field255;
                                String var216 = class164.method573(var215, Statics.field291);
                                if (class129.method526(var211, var212, var215, var216)) {
                                    client.field554--;
                                    for (int var217 = var213; var217 < client.field554; var217++) {
                                        client.field556[var217] = client.field556[var217 + 1];
                                    }
                                    client.field479 = client.field549;
                                    client.field331.method2555(75);
                                    client.field331.method2347(class119.method2219(var211));
                                    client.field331.method2281(var211);
                                    continue label3218;
                                }
                                var213++;
                            }
                        }
                        if (var524 == 3607) {
                            var6--;
                            String var218 = field805[var6];
                            if (var218 == null) {
                                continue;
                            }
                            if ((client.field558 < 100 || client.field494 == 1) && client.field558 < 400) {
                                String var219 = class164.method573(var218, Statics.field291);
                                if (var219 == null) {
                                    continue;
                                }
                                for (int var220 = 0; var220 < client.field558; var220++) {
                                    class8 var221 = client.field559[var220];
                                    String var222 = class164.method573(var221.field139, Statics.field291);
                                    if (var222 != null && var222.equals(var219)) {
                                        class12.method100(31, "", var218 + class157.field2485);
                                        continue label3218;
                                    }
                                    if (var221.field143 != null) {
                                        String var223 = class164.method573(var221.field143, Statics.field291);
                                        if (var223 != null && var223.equals(var219)) {
                                            class12.method100(31, "", var218 + class157.field2485);
                                            continue label3218;
                                        }
                                    }
                                }
                                for (int var224 = 0; var224 < client.field554; var224++) {
                                    class18 var225 = client.field556[var224];
                                    String var226 = class164.method573(var225.field255, Statics.field291);
                                    if (var226 != null && var226.equals(var219)) {
                                        class12.method100(31, "", class157.field2473 + var218 + class157.field2570);
                                        continue label3218;
                                    }
                                    if (var225.field250 != null) {
                                        String var227 = class164.method573(var225.field250, Statics.field291);
                                        if (var227 != null && var227.equals(var219)) {
                                            class12.method100(31, "", class157.field2473 + var218 + class157.field2570);
                                            continue label3218;
                                        }
                                    }
                                }
                                if (class164.method573(Statics.field2040.field44, Statics.field291).equals(var219)) {
                                    class12.method100(31, "", class157.field2470);
                                } else {
                                    client.field331.method2555(26);
                                    client.field331.method2347(class119.method2219(var218));
                                    client.field331.method2281(var218);
                                }
                                continue;
                            }
                            class12.method100(31, "", class157.field2443);
                            continue;
                        }
                        if (var524 == 3608) {
                            var6--;
                            String var228 = field805[var6];
                            if (var228 == null) {
                                continue;
                            }
                            String var229 = class164.method573(var228, Statics.field291);
                            if (var229 == null) {
                                continue;
                            }
                            int var230 = 0;
                            while (true) {
                                if (var230 >= client.field558) {
                                    continue label3218;
                                }
                                class8 var231 = client.field559[var230];
                                String var232 = var231.field139;
                                String var233 = class164.method573(var232, Statics.field291);
                                if (class129.method526(var228, var229, var232, var233)) {
                                    client.field558--;
                                    for (int var234 = var230; var234 < client.field558; var234++) {
                                        client.field559[var234] = client.field559[var234 + 1];
                                    }
                                    client.field479 = client.field549;
                                    client.field331.method2555(62);
                                    client.field331.method2347(class119.method2219(var228));
                                    client.field331.method2281(var228);
                                    continue label3218;
                                }
                                var230++;
                            }
                        }
                        if (var524 == 3609) {
                            var6--;
                            String var235 = field805[var6];
                            class152[] var236 = new class152[] { class152.field2252, class152.field2257, class152.field2256, class152.field2255, class152.field2250 };
                            class152[] var237 = var236;
                            for (int var238 = 0; var238 < var237.length; var238++) {
                                class152 var239 = var237[var238];
                                if (var239.field2251 != -1) {
                                    int var241 = var239.field2251;
                                    String var242 = "<img=" + var241 + ">";
                                    if (var235.startsWith(var242)) {
                                        var235 = var235.substring(6 + Integer.toString(var239.field2251).length());
                                        break;
                                    }
                                }
                            }
                            field798[var5++] = client.method2786(var235, false) ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3611) {
                            if (client.field514 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class162.method3151(client.field514);
                            }
                            continue;
                        }
                        if (var524 == 3612) {
                            if (client.field514 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = Statics.field30;
                            }
                            continue;
                        }
                        if (var524 == 3613) {
                            var5--;
                            int var243 = field798[var5];
                            if (client.field514 != null && var243 < Statics.field30) {
                                field805[var6++] = Statics.field155[var243].field633;
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 3614) {
                            var5--;
                            int var244 = field798[var5];
                            if (client.field514 != null && var244 < Statics.field30) {
                                field798[var5++] = Statics.field155[var244].field634;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var524 == 3615) {
                            var5--;
                            int var245 = field798[var5];
                            if (client.field514 != null && var245 < Statics.field30) {
                                field798[var5++] = Statics.field155[var245].field639;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var524 == 3616) {
                            field798[var5++] = Statics.field778;
                            continue;
                        }
                        if (var524 == 3617) {
                            var6--;
                            String var246 = field805[var6];
                            if (Statics.field155 != null) {
                                client.field331.method2555(206);
                                client.field331.method2347(class119.method2219(var246));
                                client.field331.method2281(var246);
                            }
                            continue;
                        }
                        if (var524 == 3618) {
                            field798[var5++] = Statics.field686;
                            continue;
                        }
                        if (var524 == 3619) {
                            var6--;
                            String var247 = field805[var6];
                            if (!var247.equals("")) {
                                client.field331.method2555(100);
                                client.field331.method2347(class119.method2219(var247));
                                client.field331.method2281(var247);
                            }
                            continue;
                        }
                        if (var524 == 3620) {
                            client.field331.method2555(100);
                            client.field331.method2347(0);
                            continue;
                        }
                        if (var524 == 3621) {
                            if (client.field555 == 0) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = client.field558;
                            }
                            continue;
                        }
                        if (var524 == 3622) {
                            var5--;
                            int var248 = field798[var5];
                            if (client.field555 != 0 && var248 < client.field558) {
                                field805[var6++] = client.field559[var248].field139;
                                field805[var6++] = client.field559[var248].field143;
                                continue;
                            }
                            field805[var6++] = "";
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 3623) {
                            String var249;
                            label2907: {
                                var6--;
                                var249 = field805[var6];
                                String var251 = "<img=0>";
                                if (!var249.startsWith(var251)) {
                                    String var253 = "<img=1>";
                                    if (!var249.startsWith(var253)) {
                                        break label2907;
                                    }
                                }
                                var249 = var249.substring(7);
                            }
                            field798[var5++] = client.method1977(var249) ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3624) {
                            var5--;
                            int var254 = field798[var5];
                            if (Statics.field155 != null && var254 < Statics.field30 && Statics.field155[var254].field633.equalsIgnoreCase(Statics.field2040.field44)) {
                                field798[var5++] = 1;
                                continue;
                            }
                            field798[var5++] = 0;
                            continue;
                        }
                        if (var524 == 3625) {
                            if (client.field402 == null) {
                                field805[var6++] = "";
                            } else {
                                field805[var6++] = class162.method3151(client.field402);
                            }
                            continue;
                        }
                    } else if (var524 < 4000) {
                        if (var524 == 3903) {
                            var5--;
                            int var255 = field798[var5];
                            field798[var5++] = client.field563[var255].method3689();
                            continue;
                        }
                        if (var524 == 3904) {
                            var5--;
                            int var256 = field798[var5];
                            field798[var5++] = client.field563[var256].field3155;
                            continue;
                        }
                        if (var524 == 3905) {
                            var5--;
                            int var257 = field798[var5];
                            field798[var5++] = client.field563[var257].field3161;
                            continue;
                        }
                        if (var524 == 3906) {
                            var5--;
                            int var258 = field798[var5];
                            field798[var5++] = client.field563[var258].field3157;
                            continue;
                        }
                        if (var524 == 3907) {
                            var5--;
                            int var259 = field798[var5];
                            field798[var5++] = client.field563[var259].field3158;
                            continue;
                        }
                        if (var524 == 3908) {
                            var5--;
                            int var260 = field798[var5];
                            field798[var5++] = client.field563[var260].field3159;
                            continue;
                        }
                        if (var524 == 3910) {
                            var5--;
                            int var261 = field798[var5];
                            int var262 = client.field563[var261].method3700();
                            field798[var5++] = var262 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3911) {
                            var5--;
                            int var263 = field798[var5];
                            int var264 = client.field563[var263].method3700();
                            field798[var5++] = var264 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3912) {
                            var5--;
                            int var265 = field798[var5];
                            int var266 = client.field563[var265].method3700();
                            field798[var5++] = var266 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3913) {
                            var5--;
                            int var267 = field798[var5];
                            int var268 = client.field563[var267].method3700();
                            field798[var5++] = var268 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 3914) {
                            var5--;
                            boolean var269 = field798[var5] == 1;
                            if (Statics.field1864 != null) {
                                Statics.field1864.method3702(class221.field3166, var269);
                            }
                            continue;
                        }
                        if (var524 == 3915) {
                            var5--;
                            boolean var270 = field798[var5] == 1;
                            if (Statics.field1864 != null) {
                                Statics.field1864.method3702(class221.field3164, var270);
                            }
                            continue;
                        }
                        if (var524 == 3916) {
                            var5 -= 2;
                            boolean var271 = field798[var5] == 1;
                            boolean var272 = field798[var5 + 1] == 1;
                            if (Statics.field1864 != null) {
                                Statics.field1864.method3702(new class22(var272), var271);
                            }
                            continue;
                        }
                        if (var524 == 3917) {
                            var5--;
                            boolean var273 = field798[var5] == 1;
                            if (Statics.field1864 != null) {
                                Statics.field1864.method3702(class221.field3163, var273);
                            }
                            continue;
                        }
                        if (var524 == 3918) {
                            var5--;
                            boolean var274 = field798[var5] == 1;
                            if (Statics.field1864 != null) {
                                Statics.field1864.method3702(class221.field3165, var274);
                            }
                            continue;
                        }
                        if (var524 == 3919) {
                            field798[var5++] = Statics.field1864 == null ? 0 : Statics.field1864.field3167.size();
                            continue;
                        }
                        if (var524 == 3920) {
                            var5--;
                            int var275 = field798[var5];
                            class214 var276 = (class214) Statics.field1864.field3167.get(var275);
                            field798[var5++] = var276.field3135;
                            continue;
                        }
                        if (var524 == 3921) {
                            var5--;
                            int var277 = field798[var5];
                            class214 var278 = (class214) Statics.field1864.field3167.get(var277);
                            field805[var6++] = var278.method3644();
                            continue;
                        }
                        if (var524 == 3922) {
                            var5--;
                            int var279 = field798[var5];
                            class214 var280 = (class214) Statics.field1864.field3167.get(var279);
                            field805[var6++] = var280.method3641();
                            continue;
                        }
                        if (var524 == 3923) {
                            var5--;
                            int var281 = field798[var5];
                            class214 var282 = (class214) Statics.field1864.field3167.get(var281);
                            long var283 = class115.method568() - Statics.field2661 - var282.field3138;
                            int var285 = (int) (var283 / 3600000L);
                            int var286 = (int) ((var283 - (long) (var285 * 3600000)) / 60000L);
                            int var287 = (int) ((var283 - (long) (var285 * 3600000) - (long) (var286 * 60000)) / 1000L);
                            String var288 = var285 + ":" + var286 / 10 + var286 % 10 + ":" + var287 / 10 + var287 % 10;
                            field805[var6++] = var288;
                            continue;
                        }
                        if (var524 == 3924) {
                            var5--;
                            int var289 = field798[var5];
                            class214 var290 = (class214) Statics.field1864.field3167.get(var289);
                            field798[var5++] = var290.field3136.field3157;
                            continue;
                        }
                        if (var524 == 3925) {
                            var5--;
                            int var291 = field798[var5];
                            class214 var292 = (class214) Statics.field1864.field3167.get(var291);
                            field798[var5++] = var292.field3136.field3161;
                            continue;
                        }
                        if (var524 == 3926) {
                            var5--;
                            int var293 = field798[var5];
                            class214 var294 = (class214) Statics.field1864.field3167.get(var293);
                            field798[var5++] = var294.field3136.field3155;
                            continue;
                        }
                    } else if (var524 < 4100) {
                        if (var524 == 4000) {
                            var5 -= 2;
                            int var295 = field798[var5];
                            int var296 = field798[var5 + 1];
                            field798[var5++] = var295 + var296;
                            continue;
                        }
                        if (var524 == 4001) {
                            var5 -= 2;
                            int var297 = field798[var5];
                            int var298 = field798[var5 + 1];
                            field798[var5++] = var297 - var298;
                            continue;
                        }
                        if (var524 == 4002) {
                            var5 -= 2;
                            int var299 = field798[var5];
                            int var300 = field798[var5 + 1];
                            field798[var5++] = var299 * var300;
                            continue;
                        }
                        if (var524 == 4003) {
                            var5 -= 2;
                            int var301 = field798[var5];
                            int var302 = field798[var5 + 1];
                            field798[var5++] = var301 / var302;
                            continue;
                        }
                        if (var524 == 4004) {
                            var5--;
                            int var303 = field798[var5];
                            field798[var5++] = (int) (Math.random() * (double) var303);
                            continue;
                        }
                        if (var524 == 4005) {
                            var5--;
                            int var304 = field798[var5];
                            field798[var5++] = (int) (Math.random() * (double) (var304 + 1));
                            continue;
                        }
                        if (var524 == 4006) {
                            var5 -= 5;
                            int var305 = field798[var5];
                            int var306 = field798[var5 + 1];
                            int var307 = field798[var5 + 2];
                            int var308 = field798[var5 + 3];
                            int var309 = field798[var5 + 4];
                            field798[var5++] = (var306 - var305) * (var309 - var307) / (var308 - var307) + var305;
                            continue;
                        }
                        if (var524 == 4007) {
                            var5 -= 2;
                            int var310 = field798[var5];
                            int var311 = field798[var5 + 1];
                            field798[var5++] = var310 * var311 / 100 + var310;
                            continue;
                        }
                        if (var524 == 4008) {
                            var5 -= 2;
                            int var312 = field798[var5];
                            int var313 = field798[var5 + 1];
                            field798[var5++] = var312 | 0x1 << var313;
                            continue;
                        }
                        if (var524 == 4009) {
                            var5 -= 2;
                            int var314 = field798[var5];
                            int var315 = field798[var5 + 1];
                            field798[var5++] = var314 & -1 - (0x1 << var315);
                            continue;
                        }
                        if (var524 == 4010) {
                            var5 -= 2;
                            int var316 = field798[var5];
                            int var317 = field798[var5 + 1];
                            field798[var5++] = (var316 & 0x1 << var317) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var524 == 4011) {
                            var5 -= 2;
                            int var318 = field798[var5];
                            int var319 = field798[var5 + 1];
                            field798[var5++] = var318 % var319;
                            continue;
                        }
                        if (var524 == 4012) {
                            var5 -= 2;
                            int var320 = field798[var5];
                            int var321 = field798[var5 + 1];
                            if (var320 == 0) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = (int) Math.pow((double) var320, (double) var321);
                            }
                            continue;
                        }
                        if (var524 == 4013) {
                            var5 -= 2;
                            int var322 = field798[var5];
                            int var323 = field798[var5 + 1];
                            if (var322 == 0) {
                                field798[var5++] = 0;
                            } else if (var323 == 0) {
                                field798[var5++] = Integer.MAX_VALUE;
                            } else {
                                field798[var5++] = (int) Math.pow((double) var322, 1.0D / (double) var323);
                            }
                            continue;
                        }
                        if (var524 == 4014) {
                            var5 -= 2;
                            int var324 = field798[var5];
                            int var325 = field798[var5 + 1];
                            field798[var5++] = var324 & var325;
                            continue;
                        }
                        if (var524 == 4015) {
                            var5 -= 2;
                            int var326 = field798[var5];
                            int var327 = field798[var5 + 1];
                            field798[var5++] = var326 | var327;
                            continue;
                        }
                    } else if (var524 < 4200) {
                        if (var524 == 4100) {
                            var6--;
                            String var328 = field805[var6];
                            var5--;
                            int var329 = field798[var5];
                            field805[var6++] = var328 + var329;
                            continue;
                        }
                        if (var524 == 4101) {
                            var6 -= 2;
                            String var330 = field805[var6];
                            String var331 = field805[var6 + 1];
                            field805[var6++] = var330 + var331;
                            continue;
                        }
                        if (var524 == 4102) {
                            var6--;
                            String var332 = field805[var6];
                            var5--;
                            int var333 = field798[var5];
                            String[] var334 = field805;
                            int var335 = var6++;
                            String var337;
                            if (var333 < 0) {
                                var337 = Integer.toString(var333);
                            } else {
                                int var338 = var333;
                                String var339;
                                if (var333 < 0) {
                                    var339 = Integer.toString(var333, 10);
                                } else {
                                    int var340 = 2;
                                    int var341 = var333 / 10;
                                    while (var341 != 0) {
                                        var341 /= 10;
                                        var340++;
                                    }
                                    char[] var342 = new char[var340];
                                    var342[0] = '+';
                                    for (int var343 = var340 - 1; var343 > 0; var343--) {
                                        int var344 = var338;
                                        var338 /= 10;
                                        int var345 = var344 - var338 * 10;
                                        if (var345 >= 10) {
                                            var342[var343] = (char) (var345 + 87);
                                        } else {
                                            var342[var343] = (char) (var345 + 48);
                                        }
                                    }
                                    var339 = new String(var342);
                                }
                                var337 = var339;
                            }
                            var334[var335] = var332 + var337;
                            continue;
                        }
                        if (var524 == 4103) {
                            var6--;
                            String var346 = field805[var6];
                            field805[var6++] = var346.toLowerCase();
                            continue;
                        }
                        if (var524 == 4104) {
                            var5--;
                            int var347 = field798[var5];
                            long var348 = ((long) var347 + 11745L) * 86400000L;
                            field796.setTime(new Date(var348));
                            int var350 = field796.get(5);
                            int var351 = field796.get(2);
                            int var352 = field796.get(1);
                            field805[var6++] = var350 + "-" + field803[var351] + "-" + var352;
                            continue;
                        }
                        if (var524 == 4105) {
                            var6 -= 2;
                            String var353 = field805[var6];
                            String var354 = field805[var6 + 1];
                            if (Statics.field2040.field36 != null && Statics.field2040.field36.field2912) {
                                field805[var6++] = var354;
                                continue;
                            }
                            field805[var6++] = var353;
                            continue;
                        }
                        if (var524 == 4106) {
                            var5--;
                            int var355 = field798[var5];
                            field805[var6++] = Integer.toString(var355);
                            continue;
                        }
                        if (var524 == 4107) {
                            var6 -= 2;
                            int[] var356 = field798;
                            int var357 = var5++;
                            String var358 = field805[var6];
                            String var359 = field805[var6 + 1];
                            int var360 = client.field294;
                            int var361 = var358.length();
                            int var362 = var359.length();
                            int var363 = 0;
                            int var364 = 0;
                            byte var365 = 0;
                            byte var366 = 0;
                            int var367;
                            label2988: while (true) {
                                if (var363 - var365 >= var361 && var364 - var366 >= var362) {
                                    int var378 = Math.min(var361, var362);
                                    for (int var379 = 0; var379 < var378; var379++) {
                                        char var382 = var358.charAt(var379);
                                        char var383 = var359.charAt(var379);
                                        if (var382 != var383 && Character.toUpperCase(var382) != Character.toUpperCase(var383)) {
                                            char var384 = Character.toLowerCase(var382);
                                            char var385 = Character.toLowerCase(var383);
                                            if (var384 != var385) {
                                                var367 = class166.method2703(var384, var360) - class166.method2703(var385, var360);
                                                break label2988;
                                            }
                                        }
                                    }
                                    int var386 = var361 - var362;
                                    if (var386 == 0) {
                                        for (int var387 = 0; var387 < var378; var387++) {
                                            char var388 = var358.charAt(var387);
                                            char var389 = var359.charAt(var387);
                                            if (var388 != var389) {
                                                var367 = class166.method2703(var388, var360) - class166.method2703(var389, var360);
                                                break label2988;
                                            }
                                        }
                                        var367 = 0;
                                    } else {
                                        var367 = var386;
                                    }
                                    break;
                                }
                                if (var363 - var365 >= var361) {
                                    var367 = -1;
                                    break;
                                }
                                if (var364 - var366 >= var362) {
                                    var367 = 1;
                                    break;
                                }
                                char var368;
                                if (var365 == 0) {
                                    var368 = var358.charAt(var363++);
                                } else {
                                    var368 = (char) var365;
                                    boolean var369 = false;
                                }
                                char var370;
                                if (var366 == 0) {
                                    var370 = var359.charAt(var364++);
                                } else {
                                    var370 = (char) var366;
                                    boolean var371 = false;
                                }
                                byte var372;
                                if (var368 == 198) {
                                    var372 = 69;
                                } else if (var368 == 230) {
                                    var372 = 101;
                                } else if (var368 == 223) {
                                    var372 = 115;
                                } else if (var368 == 338) {
                                    var372 = 69;
                                } else if (var368 == 339) {
                                    var372 = 101;
                                } else {
                                    var372 = 0;
                                }
                                var365 = var372;
                                byte var373;
                                if (var370 == 198) {
                                    var373 = 69;
                                } else if (var370 == 230) {
                                    var373 = 101;
                                } else if (var370 == 223) {
                                    var373 = 115;
                                } else if (var370 == 338) {
                                    var373 = 69;
                                } else if (var370 == 339) {
                                    var373 = 101;
                                } else {
                                    var373 = 0;
                                }
                                var366 = var373;
                                char var374 = class166.method536(var368, var360);
                                char var375 = class166.method536(var370, var360);
                                if (var374 != var375 && Character.toUpperCase(var374) != Character.toUpperCase(var375)) {
                                    char var376 = Character.toLowerCase(var374);
                                    char var377 = Character.toLowerCase(var375);
                                    if (var376 != var377) {
                                        var367 = class166.method2703(var376, var360) - class166.method2703(var377, var360);
                                        break;
                                    }
                                }
                            }
                            byte var391;
                            if (var367 > 0) {
                                var391 = 1;
                            } else if (var367 < 0) {
                                var391 = -1;
                            } else {
                                var391 = 0;
                            }
                            var356[var357] = var391;
                            continue;
                        }
                        if (var524 == 4108) {
                            var6--;
                            String var392 = field805[var6];
                            var5 -= 2;
                            int var393 = field798[var5];
                            int var394 = field798[var5 + 1];
                            byte[] var395 = Statics.field628.method3030(var394, 0);
                            class224 var396 = new class224(var395);
                            field798[var5++] = var396.method3721(var392, var393);
                            continue;
                        }
                        if (var524 == 4109) {
                            var6--;
                            String var397 = field805[var6];
                            var5 -= 2;
                            int var398 = field798[var5];
                            int var399 = field798[var5 + 1];
                            byte[] var400 = Statics.field628.method3030(var399, 0);
                            class224 var401 = new class224(var400);
                            field798[var5++] = var401.method3783(var397, var398);
                            continue;
                        }
                        if (var524 == 4110) {
                            var6 -= 2;
                            String var402 = field805[var6];
                            String var403 = field805[var6 + 1];
                            var5--;
                            if (field798[var5] == 1) {
                                field805[var6++] = var402;
                            } else {
                                field805[var6++] = var403;
                            }
                            continue;
                        }
                        if (var524 == 4111) {
                            var6--;
                            String var404 = field805[var6];
                            field805[var6++] = class223.method3722(var404);
                            continue;
                        }
                        if (var524 == 4112) {
                            var6--;
                            String var405 = field805[var6];
                            var5--;
                            int var406 = field798[var5];
                            field805[var6++] = var405 + (char) var406;
                            continue;
                        }
                        if (var524 == 4113) {
                            var5--;
                            int var407 = field798[var5];
                            field798[var5++] = class163.method2234((char) var407) ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4114) {
                            var5--;
                            int var408 = field798[var5];
                            field798[var5++] = class163.method805((char) var408) ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4115) {
                            var5--;
                            int var409 = field798[var5];
                            int[] var410 = field798;
                            int var411 = var5++;
                            char var412 = (char) var409;
                            boolean var413 = var412 >= 'A' && var412 <= 'Z' || var412 >= 'a' && var412 <= 'z';
                            var410[var411] = var413 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4116) {
                            var5--;
                            int var414 = field798[var5];
                            int[] var415 = field798;
                            int var416 = var5++;
                            char var417 = (char) var414;
                            boolean var418 = var417 >= '0' && var417 <= '9';
                            var415[var416] = var418 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4117) {
                            var6--;
                            String var419 = field805[var6];
                            if (var419 == null) {
                                field798[var5++] = 0;
                            } else {
                                field798[var5++] = var419.length();
                            }
                            continue;
                        }
                        if (var524 == 4118) {
                            var6--;
                            String var420 = field805[var6];
                            var5 -= 2;
                            int var421 = field798[var5];
                            int var422 = field798[var5 + 1];
                            field805[var6++] = var420.substring(var421, var422);
                            continue;
                        }
                        if (var524 == 4119) {
                            var6--;
                            String var423 = field805[var6];
                            StringBuilder var424 = new StringBuilder(var423.length());
                            boolean var425 = false;
                            for (int var426 = 0; var426 < var423.length(); var426++) {
                                char var427 = var423.charAt(var426);
                                if (var427 == '<') {
                                    var425 = true;
                                } else if (var427 == '>') {
                                    var425 = false;
                                } else if (!var425) {
                                    var424.append(var427);
                                }
                            }
                            field805[var6++] = var424.toString();
                            continue;
                        }
                        if (var524 == 4120) {
                            var6--;
                            String var428 = field805[var6];
                            var5--;
                            int var429 = field798[var5];
                            field798[var5++] = var428.indexOf(var429);
                            continue;
                        }
                        if (var524 == 4121) {
                            var6 -= 2;
                            String var430 = field805[var6];
                            String var431 = field805[var6 + 1];
                            var5--;
                            int var432 = field798[var5];
                            field798[var5++] = var430.indexOf(var431, var432);
                            continue;
                        }
                    } else if (var524 < 4300) {
                        if (var524 == 4200) {
                            var5--;
                            int var433 = field798[var5];
                            field805[var6++] = class52.method1979(var433).field1145;
                            continue;
                        }
                        if (var524 == 4201) {
                            var5 -= 2;
                            int var434 = field798[var5];
                            int var435 = field798[var5 + 1];
                            class52 var436 = class52.method1979(var434);
                            if (var435 >= 1 && var435 <= 5 && var436.field1120[var435 - 1] != null) {
                                field805[var6++] = var436.field1120[var435 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 4202) {
                            var5 -= 2;
                            int var437 = field798[var5];
                            int var438 = field798[var5 + 1];
                            class52 var439 = class52.method1979(var437);
                            if (var438 >= 1 && var438 <= 5 && var439.field1121[var438 - 1] != null) {
                                field805[var6++] = var439.field1121[var438 - 1];
                                continue;
                            }
                            field805[var6++] = "";
                            continue;
                        }
                        if (var524 == 4203) {
                            var5--;
                            int var440 = field798[var5];
                            field798[var5++] = class52.method1979(var440).field1118;
                            continue;
                        }
                        if (var524 == 4204) {
                            var5--;
                            int var441 = field798[var5];
                            field798[var5++] = class52.method1979(var441).field1117 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4205) {
                            var5--;
                            int var442 = field798[var5];
                            class52 var443 = class52.method1979(var442);
                            if (var443.field1137 == -1 && var443.field1102 >= 0) {
                                field798[var5++] = var443.field1102;
                                continue;
                            }
                            field798[var5++] = var442;
                            continue;
                        }
                        if (var524 == 4206) {
                            var5--;
                            int var444 = field798[var5];
                            class52 var445 = class52.method1979(var444);
                            if (var445.field1137 >= 0 && var445.field1102 >= 0) {
                                field798[var5++] = var445.field1102;
                                continue;
                            }
                            field798[var5++] = var444;
                            continue;
                        }
                        if (var524 == 4207) {
                            var5--;
                            int var446 = field798[var5];
                            field798[var5++] = class52.method1979(var446).field1119 ? 1 : 0;
                            continue;
                        }
                        if (var524 == 4210) {
                            var6--;
                            String var447 = field805[var6];
                            var5--;
                            int var448 = field798[var5];
                            boolean var450 = var448 == 1;
                            String var451 = var447.toLowerCase();
                            short[] var452 = new short[16];
                            int var453 = 0;
                            int var454 = 0;
                            while (true) {
                                if (var454 >= Statics.field256) {
                                    Statics.field1440 = var452;
                                    Statics.field2034 = 0;
                                    Statics.field1088 = var453;
                                    String[] var458 = new String[Statics.field1088];
                                    for (int var459 = 0; var459 < Statics.field1088; var459++) {
                                        var458[var459] = class52.method1979(var452[var459]).field1145;
                                    }
                                    short[] var460 = Statics.field1440;
                                    class124.method629(var458, var460, 0, var458.length - 1);
                                    break;
                                }
                                class52 var455 = class52.method1979(var454);
                                if ((!var450 || var455.field1144) && var455.field1137 == -1 && var455.field1145.toLowerCase().indexOf(var451) != -1) {
                                    if (var453 >= 250) {
                                        Statics.field1088 = -1;
                                        Statics.field1440 = null;
                                        break;
                                    }
                                    if (var453 >= var452.length) {
                                        short[] var456 = new short[var452.length * 2];
                                        for (int var457 = 0; var457 < var453; var457++) {
                                            var456[var457] = var452[var457];
                                        }
                                        var452 = var456;
                                    }
                                    var452[var453++] = (short) var454;
                                }
                                var454++;
                            }
                            field798[var5++] = Statics.field1088;
                            continue;
                        }
                        if (var524 == 4211) {
                            if (Statics.field1440 != null && Statics.field2034 < Statics.field1088) {
                                field798[var5++] = Statics.field1440[++Statics.field2034 - 1] & 0xFFFF;
                                continue;
                            }
                            field798[var5++] = -1;
                            continue;
                        }
                        if (var524 == 4212) {
                            Statics.field2034 = 0;
                            continue;
                        }
                    } else if (var524 < 5100) {
                        if (var524 == 5000) {
                            field798[var5++] = client.field356;
                            continue;
                        }
                        if (var524 == 5001) {
                            var5 -= 3;
                            client.field356 = field798[var5];
                            Statics.field1610 = class130.method2496(field798[var5 + 1]);
                            if (Statics.field1610 == null) {
                                Statics.field1610 = class130.field2045;
                            }
                            client.field285 = field798[var5 + 2];
                            client.field331.method2555(70);
                            client.field331.method2347(client.field356);
                            client.field331.method2347(Statics.field1610.field2047);
                            client.field331.method2347(client.field285);
                            continue;
                        }
                        if (var524 == 5002) {
                            var6--;
                            String var461 = field805[var6];
                            var5 -= 2;
                            int var462 = field798[var5];
                            int var463 = field798[var5 + 1];
                            client.field331.method2555(138);
                            client.field331.method2347(class119.method2219(var461) + 2);
                            client.field331.method2281(var461);
                            client.field331.method2347(var462 - 1);
                            client.field331.method2347(var463);
                            continue;
                        }
                        if (var524 == 5003) {
                            var5 -= 2;
                            int var464 = field798[var5];
                            int var465 = field798[var5 + 1];
                            class36 var466 = class12.method1015(var464, var465);
                            if (var466 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field798[var5++] = var466.field782;
                                field798[var5++] = var466.field783;
                                field805[var6++] = var466.field788 == null ? "" : var466.field788;
                                field805[var6++] = var466.field786 == null ? "" : var466.field786;
                                field805[var6++] = var466.field787 == null ? "" : var466.field787;
                            }
                            continue;
                        }
                        if (var524 == 5004) {
                            var5--;
                            int var467 = field798[var5];
                            class36 var468 = class12.method2581(var467);
                            if (var468 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                                field805[var6++] = "";
                                field805[var6++] = "";
                            } else {
                                field798[var5++] = var468.field784;
                                field798[var5++] = var468.field783;
                                field805[var6++] = var468.field788 == null ? "" : var468.field788;
                                field805[var6++] = var468.field786 == null ? "" : var468.field786;
                                field805[var6++] = var468.field787 == null ? "" : var468.field787;
                            }
                            continue;
                        }
                        if (var524 == 5005) {
                            if (Statics.field1610 == null) {
                                field798[var5++] = -1;
                            } else {
                                field798[var5++] = Statics.field1610.field2047;
                            }
                            continue;
                        }
                        if (var524 == 5008) {
                            var6--;
                            String var469 = field805[var6];
                            var5--;
                            int var470 = field798[var5];
                            String var471 = var469.toLowerCase();
                            byte var472 = 0;
                            if (var471.startsWith(class157.field2475)) {
                                var472 = 0;
                                var469 = var469.substring(class157.field2475.length());
                            } else if (var471.startsWith(class157.field2477)) {
                                var472 = 1;
                                var469 = var469.substring(class157.field2477.length());
                            } else if (var471.startsWith(class157.field2479)) {
                                var472 = 2;
                                var469 = var469.substring(class157.field2479.length());
                            } else if (var471.startsWith(class157.field2565)) {
                                var472 = 3;
                                var469 = var469.substring(class157.field2565.length());
                            } else if (var471.startsWith(class157.field2483)) {
                                var472 = 4;
                                var469 = var469.substring(class157.field2483.length());
                            } else if (var471.startsWith(class157.field2317)) {
                                var472 = 5;
                                var469 = var469.substring(class157.field2317.length());
                            } else if (var471.startsWith(class157.field2487)) {
                                var472 = 6;
                                var469 = var469.substring(class157.field2487.length());
                            } else if (var471.startsWith(class157.field2458)) {
                                var472 = 7;
                                var469 = var469.substring(class157.field2458.length());
                            } else if (var471.startsWith(class157.field2514)) {
                                var472 = 8;
                                var469 = var469.substring(class157.field2514.length());
                            } else if (var471.startsWith(class157.field2493)) {
                                var472 = 9;
                                var469 = var469.substring(class157.field2493.length());
                            } else if (var471.startsWith(class157.field2495)) {
                                var472 = 10;
                                var469 = var469.substring(class157.field2495.length());
                            } else if (var471.startsWith(class157.field2478)) {
                                var472 = 11;
                                var469 = var469.substring(class157.field2478.length());
                            } else if (client.field294 != 0) {
                                if (var471.startsWith(class157.field2476)) {
                                    var472 = 0;
                                    var469 = var469.substring(class157.field2476.length());
                                } else if (var471.startsWith(class157.field2552)) {
                                    var472 = 1;
                                    var469 = var469.substring(class157.field2552.length());
                                } else if (var471.startsWith(class157.field2480)) {
                                    var472 = 2;
                                    var469 = var469.substring(class157.field2480.length());
                                } else if (var471.startsWith(class157.field2402)) {
                                    var472 = 3;
                                    var469 = var469.substring(class157.field2402.length());
                                } else if (var471.startsWith(class157.field2484)) {
                                    var472 = 4;
                                    var469 = var469.substring(class157.field2484.length());
                                } else if (var471.startsWith(class157.field2486)) {
                                    var472 = 5;
                                    var469 = var469.substring(class157.field2486.length());
                                } else if (var471.startsWith(class157.field2488)) {
                                    var472 = 6;
                                    var469 = var469.substring(class157.field2488.length());
                                } else if (var471.startsWith(class157.field2490)) {
                                    var472 = 7;
                                    var469 = var469.substring(class157.field2490.length());
                                } else if (var471.startsWith(class157.field2492)) {
                                    var472 = 8;
                                    var469 = var469.substring(class157.field2492.length());
                                } else if (var471.startsWith(class157.field2494)) {
                                    var472 = 9;
                                    var469 = var469.substring(class157.field2494.length());
                                } else if (var471.startsWith(class157.field2544)) {
                                    var472 = 10;
                                    var469 = var469.substring(class157.field2544.length());
                                } else if (var471.startsWith(class157.field2498)) {
                                    var472 = 11;
                                    var469 = var469.substring(class157.field2498.length());
                                }
                            }
                            String var473 = var469.toLowerCase();
                            byte var474 = 0;
                            if (var473.startsWith(class157.field2499)) {
                                var474 = 1;
                                var469 = var469.substring(class157.field2499.length());
                            } else if (var473.startsWith(class157.field2501)) {
                                var474 = 2;
                                var469 = var469.substring(class157.field2501.length());
                            } else if (var473.startsWith(class157.field2431)) {
                                var474 = 3;
                                var469 = var469.substring(class157.field2431.length());
                            } else if (var473.startsWith(class157.field2505)) {
                                var474 = 4;
                                var469 = var469.substring(class157.field2505.length());
                            } else if (var473.startsWith(class157.field2507)) {
                                var474 = 5;
                                var469 = var469.substring(class157.field2507.length());
                            } else if (client.field294 != 0) {
                                if (var473.startsWith(class157.field2320)) {
                                    var474 = 1;
                                    var469 = var469.substring(class157.field2320.length());
                                } else if (var473.startsWith(class157.field2435)) {
                                    var474 = 2;
                                    var469 = var469.substring(class157.field2435.length());
                                } else if (var473.startsWith(class157.field2504)) {
                                    var474 = 3;
                                    var469 = var469.substring(class157.field2504.length());
                                } else if (var473.startsWith(class157.field2399)) {
                                    var474 = 4;
                                    var469 = var469.substring(class157.field2399.length());
                                } else if (var473.startsWith(class157.field2553)) {
                                    var474 = 5;
                                    var469 = var469.substring(class157.field2553.length());
                                }
                            }
                            client.field331.method2555(130);
                            client.field331.method2347(0);
                            int var475 = client.field331.field1984;
                            client.field331.method2347(var470);
                            client.field331.method2347(var472);
                            client.field331.method2347(var474);
                            class222.method2534(client.field331, var469);
                            client.field331.method2287(client.field331.field1984 - var475);
                            continue;
                        }
                        if (var524 == 5009) {
                            var6 -= 2;
                            String var476 = field805[var6];
                            String var477 = field805[var6 + 1];
                            client.field331.method2555(46);
                            client.field331.method2318(0);
                            int var478 = client.field331.field1984;
                            client.field331.method2281(var476);
                            class222.method2534(client.field331, var477);
                            client.field331.method2286(client.field331.field1984 - var478);
                            continue;
                        }
                        if (var524 == 5015) {
                            String var479;
                            if (Statics.field2040 == null || Statics.field2040.field44 == null) {
                                var479 = "";
                            } else {
                                var479 = Statics.field2040.field44;
                            }
                            field805[var6++] = var479;
                            continue;
                        }
                        if (var524 == 5016) {
                            field798[var5++] = client.field285;
                            continue;
                        }
                        if (var524 == 5017) {
                            var5--;
                            int var480 = field798[var5];
                            int[] var481 = field798;
                            int var482 = var5++;
                            class28 var483 = (class28) class12.field176.get(var480);
                            int var484;
                            if (var483 == null) {
                                var484 = 0;
                            } else {
                                var484 = var483.method619();
                            }
                            var481[var482] = var484;
                            continue;
                        }
                        if (var524 == 5018) {
                            var5--;
                            int var485 = field798[var5];
                            int[] var486 = field798;
                            int var487 = var5++;
                            class36 var488 = (class36) class12.field175.method3501((long) var485);
                            int var489;
                            if (var488 == null) {
                                var489 = -1;
                            } else if (class12.field177.field3083 == var488.field3088) {
                                var489 = -1;
                            } else {
                                var489 = ((class36) var488.field3088).field782;
                            }
                            var486[var487] = var489;
                            continue;
                        }
                        if (var524 == 5019) {
                            var5--;
                            int var490 = field798[var5];
                            int[] var491 = field798;
                            int var492 = var5++;
                            class36 var493 = (class36) class12.field175.method3501((long) var490);
                            int var494;
                            if (var493 == null) {
                                var494 = -1;
                            } else if (class12.field177.field3083 == var493.field3087) {
                                var494 = -1;
                            } else {
                                var494 = ((class36) var493.field3087).field782;
                            }
                            var491[var492] = var494;
                            continue;
                        }
                        if (var524 == 5020) {
                            var6--;
                            String var495 = field805[var6];
                            if (var495.equalsIgnoreCase("toggleroof")) {
                                Statics.field1030.field147 = !Statics.field1030.field147;
                                class9.method2599();
                                if (Statics.field1030.field147) {
                                    class12.method100(99, "", "Roofs are now all hidden");
                                } else {
                                    class12.method100(99, "", "Roofs will only be removed selectively");
                                }
                            }
                            if (var495.equalsIgnoreCase("displayfps")) {
                                client.field305 = !client.field305;
                            }
                            if (client.field453 >= 2) {
                                if (var495.equalsIgnoreCase("fpson")) {
                                    client.field305 = true;
                                }
                                if (var495.equalsIgnoreCase("fpsoff")) {
                                    client.field305 = false;
                                }
                                if (var495.equalsIgnoreCase("gc")) {
                                    System.gc();
                                }
                                if (var495.equalsIgnoreCase("clientdrop")) {
                                    if (client.field526 > 0) {
                                        client.method2086();
                                    } else {
                                        client.method908(40);
                                        Statics.field1366 = Statics.field1764;
                                        Statics.field1764 = null;
                                    }
                                }
                                if (var495.equalsIgnoreCase("errortest") && client.field290 == 2) {
                                    throw new RuntimeException();
                                }
                            }
                            client.field331.method2555(159);
                            client.field331.method2347(var495.length() + 1);
                            client.field331.method2281(var495);
                            continue;
                        }
                        if (var524 == 5021) {
                            var6--;
                            client.field507 = field805[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var524 == 5022) {
                            field805[var6++] = client.field507;
                            continue;
                        }
                    }
                } else {
                    class173 var77;
                    if (var524 >= 2000) {
                        var524 -= 1000;
                        var5--;
                        var77 = class173.method2765(field798[var5]);
                    } else {
                        var77 = var51 ? Statics.field2900 : Statics.field33;
                    }
                    if (var524 == 1300) {
                        var5--;
                        int var78 = field798[var5] - 1;
                        if (var78 >= 0 && var78 <= 9) {
                            var6--;
                            var77.method3113(var78, field805[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var524 == 1301) {
                        var5 -= 2;
                        int var79 = field798[var5];
                        int var80 = field798[var5 + 1];
                        var77.field2827 = class173.method2212(var79, var80);
                        continue;
                    }
                    if (var524 == 1302) {
                        var5--;
                        var77.field2881 = field798[var5] == 1;
                        continue;
                    }
                    if (var524 == 1303) {
                        var5--;
                        var77.field2838 = field798[var5];
                        continue;
                    }
                    if (var524 == 1304) {
                        var5--;
                        var77.field2829 = field798[var5];
                        continue;
                    }
                    if (var524 == 1305) {
                        var6--;
                        var77.field2825 = field805[var6];
                        continue;
                    }
                    if (var524 == 1306) {
                        var6--;
                        var77.field2795 = field805[var6];
                        continue;
                    }
                    if (var524 == 1307) {
                        var77.field2826 = null;
                        continue;
                    }
                }
                if (var524 < 5400) {
                    if (var524 == 5306) {
                        int[] var496 = field798;
                        int var497 = var5++;
                        int var498 = client.field511 ? 2 : 1;
                        var496[var497] = var498;
                        continue;
                    }
                    if (var524 == 5307) {
                        var5--;
                        int var499 = field798[var5];
                        if (var499 != 1 && var499 != 2) {
                            continue;
                        }
                        client.field500 = 0L;
                        if (var499 >= 2) {
                            client.field511 = true;
                        } else {
                            client.field511 = false;
                        }
                        client.method2679();
                        if (client.field297 >= 25) {
                            client.field331.method2555(11);
                            class122 var500 = client.field331;
                            int var501 = client.field511 ? 2 : 1;
                            var500.method2347(var501);
                            client.field331.method2318(Statics.field2178);
                            client.field331.method2318(Statics.field164);
                        }
                        class144.field2181 = true;
                        continue;
                    }
                    if (var524 == 5308) {
                        field798[var5++] = Statics.field1030.field148;
                        continue;
                    }
                    if (var524 == 5309) {
                        var5--;
                        int var502 = field798[var5];
                        if (var502 == 1 || var502 == 2) {
                            Statics.field1030.field148 = var502;
                            class9.method2599();
                        }
                        continue;
                    }
                }
                if (var524 < 5600) {
                    if (var524 == 5504) {
                        var5 -= 2;
                        int var503 = field798[var5];
                        int var504 = field798[var5 + 1];
                        if (!client.field535) {
                            client.field371 = var503;
                            client.field372 = var504;
                        }
                        continue;
                    }
                    if (var524 == 5505) {
                        field798[var5++] = client.field371;
                        continue;
                    }
                    if (var524 == 5506) {
                        field798[var5++] = client.field372;
                        continue;
                    }
                    if (var524 == 5530) {
                        var5--;
                        int var505 = field798[var5];
                        if (var505 < 0) {
                            var505 = 0;
                        }
                        client.field377 = var505;
                        continue;
                    }
                    if (var524 == 5531) {
                        field798[var5++] = client.field377;
                        continue;
                    }
                }
                if (var524 >= 5700 || var524 != 5630) {
                    if (var524 < 6300) {
                        if (var524 == 6200) {
                            var5 -= 2;
                            client.field541 = (short) field798[var5];
                            if (client.field541 <= 0) {
                                client.field541 = 256;
                            }
                            client.field411 = (short) field798[var5 + 1];
                            if (client.field411 <= 0) {
                                client.field411 = 205;
                            }
                            continue;
                        }
                        if (var524 == 6201) {
                            var5 -= 2;
                            client.field543 = (short) field798[var5];
                            if (client.field543 <= 0) {
                                client.field543 = 256;
                            }
                            client.field544 = (short) field798[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 320;
                            }
                            continue;
                        }
                        if (var524 == 6202) {
                            var5 -= 4;
                            client.field557 = (short) field798[var5];
                            if (client.field557 <= 0) {
                                client.field557 = 1;
                            }
                            client.field546 = (short) field798[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 32767;
                            } else if (client.field546 < client.field557) {
                                client.field546 = client.field557;
                            }
                            client.field547 = (short) field798[var5 + 2];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field548 = (short) field798[var5 + 3];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field547) {
                                client.field548 = client.field547;
                            }
                            continue;
                        }
                        if (var524 == 6203) {
                            if (client.field458 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = -1;
                            } else {
                                client.method1894(0, 0, client.field458.field2793, client.field458.field2770, false);
                                field798[var5++] = client.field551;
                                field798[var5++] = client.field552;
                            }
                            continue;
                        }
                        if (var524 == 6204) {
                            field798[var5++] = client.field543;
                            field798[var5++] = client.field544;
                            continue;
                        }
                        if (var524 == 6205) {
                            field798[var5++] = client.field541;
                            field798[var5++] = client.field411;
                            continue;
                        }
                    }
                    if (var524 < 6600) {
                        if (var524 == 6500) {
                            field798[var5++] = class26.method548() ? 1 : 0;
                            continue;
                        }
                        if (var524 == 6501) {
                            class26.field649 = 0;
                            class26 var506;
                            if (class26.field649 < class26.field648) {
                                var506 = Statics.field647[++class26.field649 - 1];
                            } else {
                                var506 = null;
                            }
                            if (var506 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field798[var5++] = var506.field652;
                                field798[var5++] = var506.field643;
                                field805[var6++] = var506.field656;
                                field798[var5++] = var506.field657;
                                field798[var5++] = var506.field655;
                                field805[var6++] = var506.field654;
                            }
                            continue;
                        }
                        if (var524 == 6502) {
                            class26 var509;
                            if (class26.field649 < class26.field648) {
                                var509 = Statics.field647[++class26.field649 - 1];
                            } else {
                                var509 = null;
                            }
                            if (var509 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field798[var5++] = var509.field652;
                                field798[var5++] = var509.field643;
                                field805[var6++] = var509.field656;
                                field798[var5++] = var509.field657;
                                field798[var5++] = var509.field655;
                                field805[var6++] = var509.field654;
                            }
                            continue;
                        }
                        if (var524 == 6506) {
                            var5--;
                            int var511 = field798[var5];
                            class26 var512 = null;
                            for (int var513 = 0; var513 < class26.field648; var513++) {
                                if (Statics.field647[var513].field652 == var511) {
                                    var512 = Statics.field647[var513];
                                    break;
                                }
                            }
                            if (var512 == null) {
                                field798[var5++] = -1;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                                field798[var5++] = 0;
                                field798[var5++] = 0;
                                field805[var6++] = "";
                            } else {
                                field798[var5++] = var512.field652;
                                field798[var5++] = var512.field643;
                                field805[var6++] = var512.field656;
                                field798[var5++] = var512.field657;
                                field798[var5++] = var512.field655;
                                field805[var6++] = var512.field654;
                            }
                            continue;
                        }
                        if (var524 == 6507) {
                            var5 -= 4;
                            int var514 = field798[var5];
                            boolean var515 = field798[var5 + 1] == 1;
                            int var516 = field798[var5 + 2];
                            boolean var517 = field798[var5 + 3] == 1;
                            class26.method173(var514, var515, var516, var517);
                            continue;
                        }
                        if (var524 == 6511) {
                            var5--;
                            int var518 = field798[var5];
                            if (var518 >= 0 && var518 < class26.field648) {
                                class26 var519 = Statics.field647[var518];
                                field798[var5++] = var519.field652;
                                field798[var5++] = var519.field643;
                                field805[var6++] = var519.field656;
                                field798[var5++] = var519.field657;
                                field798[var5++] = var519.field655;
                                field805[var6++] = var519.field654;
                                continue;
                            }
                            field798[var5++] = -1;
                            field798[var5++] = 0;
                            field805[var6++] = "";
                            field798[var5++] = 0;
                            field798[var5++] = 0;
                            field805[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field526 = 250;
            }
        } catch (Exception var523) {
            StringBuilder var521 = new StringBuilder(30);
            var521.append("").append(var4.field3097).append(" ");
            for (int var522 = field800 - 1; var522 >= 0; var522--) {
                var521.append("").append(field802[var522].field214.field3097).append(" ");
            }
            var521.append("").append(var10);
            class148.method2604(var521.toString(), var523);
        }
    }

    @ObfuscatedName("gs.f(IB)V")
    public static void method3442(int arg0) {
        if (arg0 == -1 || !class173.method2229(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2807[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2762 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field4 = var3.field2762;
                method3091(var4, 2000000);
            }
        }
    }
}
