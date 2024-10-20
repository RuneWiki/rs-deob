package deob;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("an")
public class class37 {

    @ObfuscatedName("an.z")
    public static int[] field814 = new int[5];

    @ObfuscatedName("an.l")
    public static int[][] field809 = new int[5][5000];

    @ObfuscatedName("an.m")
    public static int[] field810 = new int[1000];

    @ObfuscatedName("an.p")
    public static String[] field808 = new String[1000];

    @ObfuscatedName("an.u")
    public static int field812 = 0;

    @ObfuscatedName("an.c")
    public static class15[] field813 = new class15[50];

    @ObfuscatedName("an.n")
    public static Calendar field811 = Calendar.getInstance();

    @ObfuscatedName("an.k")
    public static final String[] field815 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("an.f")
    public static int field805 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.g(Lg;I)V")
    public static void method734(class1 arg0) {
        method2988(arg0, 200000);
    }

    @ObfuscatedName("fg.b(Lg;II)V")
    public static void method2988(class1 arg0, int arg1) {
        Object[] var2 = arg0.field12;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method3254(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field596;
        int[] var9 = var4.field600;
        byte var10 = -1;
        field812 = 0;
        try {
            Statics.field807 = new int[var4.field599];
            int var11 = 0;
            Statics.field1093 = new String[var4.field603];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field5;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field16 == null ? -1 : arg0.field16.field2737;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field16 == null ? -1 : arg0.field16.field2738;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2737;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field7 == null ? -1 : arg0.field7.field2738;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field8;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field9;
                    }
                    Statics.field807[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field4;
                    }
                    Statics.field1093[var12++] = var15;
                }
            }
            int var16 = 0;
            field805 = arg0.field11;
            label3007: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var467 = var8[var7];
                if (var467 < 100) {
                    if (var467 == 0) {
                        field810[var5++] = var9[var7];
                        continue;
                    }
                    if (var467 == 1) {
                        int var17 = var9[var7];
                        field810[var5++] = class176.field2885[var17];
                        continue;
                    }
                    if (var467 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2885[var18] = field810[var5];
                        client.method152(var18);
                        continue;
                    }
                    if (var467 == 3) {
                        field808[var6++] = var4.field598[var7];
                        continue;
                    }
                    if (var467 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var467 == 7) {
                        var5 -= 2;
                        if (field810[var5 + 1] != field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 8) {
                        var5 -= 2;
                        if (field810[var5 + 1] == field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 9) {
                        var5 -= 2;
                        if (field810[var5] < field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 10) {
                        var5 -= 2;
                        if (field810[var5] > field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 21) {
                        if (field812 == 0) {
                            return;
                        }
                        class15 var19 = field813[--field812];
                        var4 = var19.field217;
                        var8 = var4.field596;
                        var9 = var4.field600;
                        var7 = var19.field213;
                        Statics.field807 = var19.field219;
                        Statics.field1093 = var19.field215;
                        continue;
                    }
                    if (var467 == 25) {
                        int var20 = var9[var7];
                        field810[var5++] = class176.method98(var20);
                        continue;
                    }
                    if (var467 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field810[var5];
                        class48 var23 = class48.method733(var21);
                        int var24 = var23.field1068;
                        int var25 = var23.field1076;
                        int var26 = var23.field1069;
                        int var27 = class176.field2883[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class176.field2885[var24] = class176.field2885[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var467 == 31) {
                        var5 -= 2;
                        if (field810[var5] <= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 32) {
                        var5 -= 2;
                        if (field810[var5] >= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var467 == 33) {
                        field810[var5++] = Statics.field807[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var467 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field807[var10001] = field810[var5];
                        continue;
                    }
                    if (var467 == 35) {
                        field808[var6++] = Statics.field1093[var9[var7]];
                        continue;
                    }
                    if (var467 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1093[var10001] = field808[var6];
                        continue;
                    }
                    if (var467 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field808;
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
                        field808[var6++] = var31;
                        continue;
                    }
                    if (var467 == 38) {
                        var5--;
                        continue;
                    }
                    if (var467 == 39) {
                        var6--;
                        continue;
                    }
                    if (var467 == 40) {
                        int var41 = var9[var7];
                        class23 var42 = class23.method3254(var41);
                        int[] var43 = new int[var42.field599];
                        String[] var44 = new String[var42.field603];
                        for (int var45 = 0; var45 < var42.field601; var45++) {
                            var43[var45] = field810[var5 - var42.field601 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field602; var46++) {
                            var44[var46] = field808[var6 - var42.field602 + var46];
                        }
                        var5 -= var42.field601;
                        var6 -= var42.field602;
                        class15 var47 = new class15();
                        var47.field217 = var4;
                        var47.field213 = var7;
                        var47.field219 = Statics.field807;
                        var47.field215 = Statics.field1093;
                        field813[++field812 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field596;
                        var9 = var42.field600;
                        var7 = -1;
                        Statics.field807 = var43;
                        Statics.field1093 = var44;
                        continue;
                    }
                    if (var467 == 42) {
                        field810[var5++] = Statics.field1885.method205(var9[var7]);
                        continue;
                    }
                    if (var467 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field1885.method204(var10001, field810[var5]);
                        continue;
                    }
                    if (var467 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field810[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field814[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label3007;
                                }
                                field809[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field810[var5];
                        if (var54 >= 0 && var54 < field814[var53]) {
                            field810[var5++] = field809[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field810[var5];
                        if (var56 >= 0 && var56 < field814[var55]) {
                            field809[var55][var56] = field810[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var467 == 47) {
                        String var57 = Statics.field1885.method207(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field808[var6++] = var57;
                        continue;
                    }
                    if (var467 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field1885.method218(var10001, field808[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var467 < 1000) {
                    if (var467 == 100) {
                        var5 -= 3;
                        int var59 = field810[var5];
                        int var60 = field810[var5 + 1];
                        int var61 = field810[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var62 = class173.method1976(var59);
                        if (var62.field2868 == null) {
                            var62.field2868 = new class173[var61 + 1];
                        }
                        if (var62.field2868.length <= var61) {
                            class173[] var63 = new class173[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2868.length; var64++) {
                                var63[var64] = var62.field2868[var64];
                            }
                            var62.field2868 = var63;
                        }
                        if (var61 > 0 && var62.field2868[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class173 var65 = new class173();
                        var65.field2739 = var60;
                        var65.field2858 = var65.field2737 = var62.field2737;
                        var65.field2738 = var61;
                        var65.field2736 = true;
                        var62.field2868[var61] = var65;
                        if (var58) {
                            Statics.field2594 = var65;
                        } else {
                            Statics.field1935 = var65;
                        }
                        client.method2721(var62);
                        continue;
                    }
                    if (var467 == 101) {
                        class173 var66 = var58 ? Statics.field2594 : Statics.field1935;
                        class173 var67 = class173.method1976(var66.field2737);
                        var67.field2868[var66.field2738] = null;
                        client.method2721(var67);
                        continue;
                    }
                    if (var467 == 102) {
                        var5--;
                        class173 var68 = class173.method1976(field810[var5]);
                        var68.field2868 = null;
                        client.method2721(var68);
                        continue;
                    }
                    if (var467 == 200) {
                        var5 -= 2;
                        int var69 = field810[var5];
                        int var70 = field810[var5 + 1];
                        class173 var71 = class173.method2984(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field810[var5++] = 1;
                            if (var58) {
                                Statics.field2594 = var71;
                            } else {
                                Statics.field1935 = var71;
                            }
                            continue;
                        }
                        field810[var5++] = 0;
                        continue;
                    }
                    if (var467 == 201) {
                        var5--;
                        class173 var72 = class173.method1976(field810[var5]);
                        if (var72 == null) {
                            field810[var5++] = 0;
                        } else {
                            field810[var5++] = 1;
                            if (var58) {
                                Statics.field2594 = var72;
                            } else {
                                Statics.field1935 = var72;
                            }
                        }
                        continue;
                    }
                } else if (!(var467 < 1000 || var467 >= 1100) || !(var467 < 2000 || var467 >= 2100)) {
                    int var73 = -1;
                    class173 var74;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var73 = field810[var5];
                        var74 = class173.method1976(var73);
                    } else {
                        var74 = var58 ? Statics.field2594 : Statics.field1935;
                    }
                    if (var467 == 1000) {
                        var5 -= 4;
                        var74.field2746 = field810[var5];
                        var74.field2756 = field810[var5 + 1];
                        var74.field2742 = field810[var5 + 2];
                        var74.field2743 = field810[var5 + 3];
                        client.method2721(var74);
                        client.method182(var74);
                        if (var73 != -1 && var74.field2739 == 0) {
                            client.method958(Statics.field2811[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var467 == 1001) {
                        var5 -= 4;
                        var74.field2748 = field810[var5];
                        var74.field2749 = field810[var5 + 1];
                        var74.field2744 = field810[var5 + 2];
                        var74.field2763 = field810[var5 + 3];
                        client.method2721(var74);
                        client.method182(var74);
                        if (var73 != -1 && var74.field2739 == 0) {
                            client.method958(Statics.field2811[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var467 == 1003) {
                        var5--;
                        boolean var75 = field810[var5] == 1;
                        if (var74.field2757 != var75) {
                            var74.field2757 = var75;
                            client.method2721(var74);
                        }
                        continue;
                    }
                    if (var467 == 1005) {
                        var5--;
                        var74.field2808 = field810[var5] == 1;
                        continue;
                    }
                    if (var467 == 1006) {
                        var5--;
                        var74.field2869 = field810[var5] == 1;
                        continue;
                    }
                } else if (var467 >= 1100 && var467 < 1200 || var467 >= 2100 && var467 < 2200) {
                    int var76 = -1;
                    class173 var77;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var76 = field810[var5];
                        var77 = class173.method1976(var76);
                    } else {
                        var77 = var58 ? Statics.field2594 : Statics.field1935;
                    }
                    if (var467 == 1100) {
                        var5 -= 2;
                        var77.field2758 = field810[var5];
                        if (var77.field2758 > var77.field2760 - var77.field2780) {
                            var77.field2758 = var77.field2760 - var77.field2780;
                        }
                        if (var77.field2758 < 0) {
                            var77.field2758 = 0;
                        }
                        var77.field2791 = field810[var5 + 1];
                        if (var77.field2791 > var77.field2761 - var77.field2753) {
                            var77.field2791 = var77.field2761 - var77.field2753;
                        }
                        if (var77.field2791 < 0) {
                            var77.field2791 = 0;
                        }
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1101) {
                        var5--;
                        var77.field2804 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1102) {
                        var5--;
                        var77.field2766 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1103) {
                        var5--;
                        var77.field2767 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1104) {
                        var5--;
                        var77.field2768 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1105) {
                        var5--;
                        var77.field2782 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1106) {
                        var5--;
                        var77.field2772 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1107) {
                        var5--;
                        var77.field2773 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1108) {
                        var77.field2778 = 1;
                        var5--;
                        var77.field2779 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1109) {
                        var5 -= 6;
                        var77.field2784 = field810[var5];
                        var77.field2785 = field810[var5 + 1];
                        var77.field2786 = field810[var5 + 2];
                        var77.field2818 = field810[var5 + 3];
                        var77.field2846 = field810[var5 + 4];
                        var77.field2789 = field810[var5 + 5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1110) {
                        var5--;
                        int var78 = field810[var5];
                        if (var77.field2842 != var78) {
                            var77.field2842 = var78;
                            var77.field2857 = 0;
                            var77.field2830 = 0;
                            client.method2721(var77);
                        }
                        continue;
                    }
                    if (var467 == 1111) {
                        var5--;
                        var77.field2792 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1112) {
                        var6--;
                        String var79 = field808[var6];
                        if (!var79.equals(var77.field2795)) {
                            var77.field2795 = var79;
                            client.method2721(var77);
                        }
                        continue;
                    }
                    if (var467 == 1113) {
                        var5--;
                        var77.field2815 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1114) {
                        var5 -= 3;
                        var77.field2798 = field810[var5];
                        var77.field2820 = field810[var5 + 1];
                        var77.field2745 = field810[var5 + 2];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1115) {
                        var5--;
                        var77.field2809 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1116) {
                        var5--;
                        var77.field2774 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1117) {
                        var5--;
                        var77.field2775 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1118) {
                        var5--;
                        var77.field2776 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1119) {
                        var5--;
                        var77.field2777 = field810[var5] == 1;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1120) {
                        var5 -= 2;
                        var77.field2760 = field810[var5];
                        var77.field2761 = field810[var5 + 1];
                        client.method2721(var77);
                        if (var76 != -1 && var77.field2739 == 0) {
                            client.method958(Statics.field2811[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var467 == 1121) {
                        client.method645(var77.field2737, var77.field2738);
                        client.field489 = var77;
                        client.method2721(var77);
                        continue;
                    }
                    if (var467 == 1122) {
                        var5--;
                        var77.field2762 = field810[var5];
                        client.method2721(var77);
                        continue;
                    }
                } else if (var467 >= 1200 && var467 < 1300 || var467 >= 2200 && var467 < 2300) {
                    class173 var80;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var80 = class173.method1976(field810[var5]);
                    } else {
                        var80 = var58 ? Statics.field2594 : Statics.field1935;
                    }
                    client.method2721(var80);
                    if (var467 == 1200 || var467 == 1205 || var467 == 1212) {
                        var5 -= 2;
                        int var81 = field810[var5];
                        int var82 = field810[var5 + 1];
                        var80.field2855 = var81;
                        var80.field2856 = var82;
                        class52 var83 = class52.method2767(var81);
                        var80.field2786 = var83.field1123;
                        var80.field2818 = var83.field1112;
                        var80.field2846 = var83.field1125;
                        var80.field2784 = var83.field1126;
                        var80.field2785 = var83.field1127;
                        var80.field2789 = var83.field1118;
                        if (var467 == 1205) {
                            var80.field2793 = 0;
                        } else if (var467 == 1212 | var83.field1128 == 1) {
                            var80.field2793 = 1;
                        } else {
                            var80.field2793 = 2;
                        }
                        if (var80.field2790 > 0) {
                            var80.field2789 = var80.field2789 * 32 / var80.field2790;
                        } else if (var80.field2748 > 0) {
                            var80.field2789 = var80.field2789 * 32 / var80.field2748;
                        }
                        continue;
                    }
                    if (var467 == 1201) {
                        var80.field2778 = 2;
                        var5--;
                        var80.field2779 = field810[var5];
                        continue;
                    }
                    if (var467 == 1202) {
                        var80.field2778 = 3;
                        var80.field2779 = Statics.field176.field41.method3291();
                        continue;
                    }
                } else if ((var467 < 1300 || var467 >= 1400) && (var467 < 2300 || var467 >= 2400)) {
                    if (var467 >= 1400 && var467 < 1500 || var467 >= 2400 && var467 < 2500) {
                        class173 var88;
                        if (var467 >= 2000) {
                            var467 -= 1000;
                            var5--;
                            var88 = class173.method1976(field810[var5]);
                        } else {
                            var88 = var58 ? Statics.field2594 : Statics.field1935;
                        }
                        var6--;
                        String var89 = field808[var6];
                        int[] var90 = null;
                        if (var89.length() > 0 && var89.charAt(var89.length() - 1) == 'Y') {
                            var5--;
                            int var91 = field810[var5];
                            if (var91 > 0) {
                                var90 = new int[var91];
                                while (var91-- > 0) {
                                    var5--;
                                    var90[var91] = field810[var5];
                                }
                            }
                            var89 = var89.substring(0, var89.length() - 1);
                        }
                        Object[] var92 = new Object[var89.length() + 1];
                        for (int var93 = var92.length - 1; var93 >= 1; var93--) {
                            if (var89.charAt(var93 - 1) == 's') {
                                var6--;
                                var92[var93] = field808[var6];
                            } else {
                                var5--;
                                var92[var93] = Integer.valueOf(field810[var5]);
                            }
                        }
                        var5--;
                        int var94 = field810[var5];
                        if (var94 == -1) {
                            var92 = null;
                        } else {
                            var92[0] = Integer.valueOf(var94);
                        }
                        if (var467 == 1400) {
                            var88.field2788 = var92;
                        }
                        if (var467 == 1401) {
                            var88.field2866 = var92;
                        }
                        if (var467 == 1402) {
                            var88.field2794 = var92;
                        }
                        if (var467 == 1403) {
                            var88.field2783 = var92;
                        }
                        if (var467 == 1404) {
                            var88.field2834 = var92;
                        }
                        if (var467 == 1405) {
                            var88.field2824 = var92;
                        }
                        if (var467 == 1406) {
                            var88.field2817 = var92;
                        }
                        if (var467 == 1407) {
                            var88.field2828 = var92;
                            var88.field2754 = var90;
                        }
                        if (var467 == 1408) {
                            var88.field2862 = var92;
                        }
                        if (var467 == 1409) {
                            var88.field2835 = var92;
                        }
                        if (var467 == 1410) {
                            var88.field2730 = var92;
                        }
                        if (var467 == 1411) {
                            var88.field2727 = var92;
                        }
                        if (var467 == 1412) {
                            var88.field2822 = var92;
                        }
                        if (var467 == 1414) {
                            var88.field2799 = var92;
                            var88.field2831 = var90;
                        }
                        if (var467 == 1415) {
                            var88.field2832 = var92;
                            var88.field2797 = var90;
                        }
                        if (var467 == 1416) {
                            var88.field2826 = var92;
                        }
                        if (var467 == 1417) {
                            var88.field2836 = var92;
                        }
                        if (var467 == 1418) {
                            var88.field2837 = var92;
                        }
                        if (var467 == 1419) {
                            var88.field2838 = var92;
                        }
                        if (var467 == 1420) {
                            var88.field2839 = var92;
                        }
                        if (var467 == 1421) {
                            var88.field2840 = var92;
                        }
                        if (var467 == 1422) {
                            var88.field2841 = var92;
                        }
                        if (var467 == 1423) {
                            var88.field2747 = var92;
                        }
                        if (var467 == 1424) {
                            var88.field2843 = var92;
                        }
                        if (var467 == 1425) {
                            var88.field2845 = var92;
                        }
                        if (var467 == 1426) {
                            var88.field2850 = var92;
                        }
                        if (var467 == 1427) {
                            var88.field2812 = var92;
                        }
                        var88.field2800 = true;
                        continue;
                    }
                    if (var467 < 1600) {
                        class173 var95 = var58 ? Statics.field2594 : Statics.field1935;
                        if (var467 == 1500) {
                            field810[var5++] = var95.field2750;
                            continue;
                        }
                        if (var467 == 1501) {
                            field810[var5++] = var95.field2859;
                            continue;
                        }
                        if (var467 == 1502) {
                            field810[var5++] = var95.field2780;
                            continue;
                        }
                        if (var467 == 1503) {
                            field810[var5++] = var95.field2753;
                            continue;
                        }
                        if (var467 == 1504) {
                            field810[var5++] = var95.field2757 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 1505) {
                            field810[var5++] = var95.field2858;
                            continue;
                        }
                    } else if (var467 < 1700) {
                        class173 var96 = var58 ? Statics.field2594 : Statics.field1935;
                        if (var467 == 1600) {
                            field810[var5++] = var96.field2758;
                            continue;
                        }
                        if (var467 == 1601) {
                            field810[var5++] = var96.field2791;
                            continue;
                        }
                        if (var467 == 1602) {
                            field808[var6++] = var96.field2795;
                            continue;
                        }
                        if (var467 == 1603) {
                            field810[var5++] = var96.field2760;
                            continue;
                        }
                        if (var467 == 1604) {
                            field810[var5++] = var96.field2761;
                            continue;
                        }
                        if (var467 == 1605) {
                            field810[var5++] = var96.field2789;
                            continue;
                        }
                        if (var467 == 1606) {
                            field810[var5++] = var96.field2786;
                            continue;
                        }
                        if (var467 == 1607) {
                            field810[var5++] = var96.field2846;
                            continue;
                        }
                        if (var467 == 1608) {
                            field810[var5++] = var96.field2818;
                            continue;
                        }
                        if (var467 == 1609) {
                            field810[var5++] = var96.field2767;
                            continue;
                        }
                    } else if (var467 < 1800) {
                        class173 var97 = var58 ? Statics.field2594 : Statics.field1935;
                        if (var467 == 1700) {
                            field810[var5++] = var97.field2855;
                            continue;
                        }
                        if (var467 == 1701) {
                            if (var97.field2855 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var97.field2856;
                            }
                            continue;
                        }
                        if (var467 == 1702) {
                            field810[var5++] = var97.field2738;
                            continue;
                        }
                    } else if (var467 < 1900) {
                        class173 var98 = var58 ? Statics.field2594 : Statics.field1935;
                        if (var467 == 1800) {
                            int[] var99 = field810;
                            int var100 = var5++;
                            int var101 = client.method184(var98);
                            int var102 = var101 >> 11 & 0x3F;
                            var99[var100] = var102;
                            continue;
                        }
                        if (var467 == 1801) {
                            var5--;
                            int var103 = field810[var5];
                            int var468 = var103 - 1;
                            if (var98.field2801 != null && var468 < var98.field2801.length && var98.field2801[var468] != null) {
                                field808[var6++] = var98.field2801[var468];
                                continue;
                            }
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 1802) {
                            if (var98.field2825 == null) {
                                field808[var6++] = "";
                            } else {
                                field808[var6++] = var98.field2825;
                            }
                            continue;
                        }
                    } else if (!(var467 < 1900 || var467 >= 2000) || !(var467 < 2900 || var467 >= 3000)) {
                        class173 var104;
                        if (var467 >= 2000) {
                            var467 -= 1000;
                            var5--;
                            var104 = class173.method1976(field810[var5]);
                        } else {
                            var104 = var58 ? Statics.field2594 : Statics.field1935;
                        }
                        if (var467 == 1927) {
                            if (field805 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var104.field2812 == null) {
                                return;
                            }
                            class1 var105 = new class1();
                            var105.field16 = var104;
                            var105.field12 = var104.field2812;
                            var105.field11 = field805 + 1;
                            client.field310.method3598(arg0);
                            continue;
                        }
                    } else if (var467 < 2600) {
                        var5--;
                        class173 var106 = class173.method1976(field810[var5]);
                        if (var467 == 2500) {
                            field810[var5++] = var106.field2750;
                            continue;
                        }
                        if (var467 == 2501) {
                            field810[var5++] = var106.field2859;
                            continue;
                        }
                        if (var467 == 2502) {
                            field810[var5++] = var106.field2780;
                            continue;
                        }
                        if (var467 == 2503) {
                            field810[var5++] = var106.field2753;
                            continue;
                        }
                        if (var467 == 2504) {
                            field810[var5++] = var106.field2757 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 2505) {
                            field810[var5++] = var106.field2858;
                            continue;
                        }
                    } else if (var467 < 2700) {
                        var5--;
                        class173 var107 = class173.method1976(field810[var5]);
                        if (var467 == 2600) {
                            field810[var5++] = var107.field2758;
                            continue;
                        }
                        if (var467 == 2601) {
                            field810[var5++] = var107.field2791;
                            continue;
                        }
                        if (var467 == 2602) {
                            field808[var6++] = var107.field2795;
                            continue;
                        }
                        if (var467 == 2603) {
                            field810[var5++] = var107.field2760;
                            continue;
                        }
                        if (var467 == 2604) {
                            field810[var5++] = var107.field2761;
                            continue;
                        }
                        if (var467 == 2605) {
                            field810[var5++] = var107.field2789;
                            continue;
                        }
                        if (var467 == 2606) {
                            field810[var5++] = var107.field2786;
                            continue;
                        }
                        if (var467 == 2607) {
                            field810[var5++] = var107.field2846;
                            continue;
                        }
                        if (var467 == 2608) {
                            field810[var5++] = var107.field2818;
                            continue;
                        }
                        if (var467 == 2609) {
                            field810[var5++] = var107.field2767;
                            continue;
                        }
                    } else if (var467 < 2800) {
                        if (var467 == 2700) {
                            var5--;
                            class173 var108 = class173.method1976(field810[var5]);
                            field810[var5++] = var108.field2855;
                            continue;
                        }
                        if (var467 == 2701) {
                            var5--;
                            class173 var109 = class173.method1976(field810[var5]);
                            if (var109.field2855 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var109.field2856;
                            }
                            continue;
                        }
                        if (var467 == 2702) {
                            var5--;
                            int var110 = field810[var5];
                            class4 var111 = (class4) client.field455.method3573((long) var110);
                            if (var111 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = 1;
                            }
                            continue;
                        }
                        if (var467 == 2706) {
                            field810[var5++] = client.field454;
                            continue;
                        }
                    } else if (var467 < 2900) {
                        var5--;
                        class173 var112 = class173.method1976(field810[var5]);
                        if (var467 == 2800) {
                            int[] var113 = field810;
                            int var114 = var5++;
                            int var115 = client.method184(var112);
                            int var116 = var115 >> 11 & 0x3F;
                            var113[var114] = var116;
                            continue;
                        }
                        if (var467 == 2801) {
                            var5--;
                            int var117 = field810[var5];
                            int var469 = var117 - 1;
                            if (var112.field2801 != null && var469 < var112.field2801.length && var112.field2801[var469] != null) {
                                field808[var6++] = var112.field2801[var469];
                                continue;
                            }
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 2802) {
                            if (var112.field2825 == null) {
                                field808[var6++] = "";
                            } else {
                                field808[var6++] = var112.field2825;
                            }
                            continue;
                        }
                    } else if (var467 < 3200) {
                        if (var467 == 3100) {
                            var6--;
                            String var118 = field808[var6];
                            class12.method2737(0, "", var118);
                            continue;
                        }
                        if (var467 == 3101) {
                            var5 -= 2;
                            client.method242(Statics.field176, field810[var5], field810[var5 + 1]);
                            continue;
                        }
                        if (var467 == 3103) {
                            client.field367.method2612(189);
                            for (class4 var119 = (class4) client.field455.method3571(); var119 != null; var119 = (class4) client.field455.method3572()) {
                                if (var119.field69 == 0 || var119.field69 == 3) {
                                    client.method718(var119, true);
                                }
                            }
                            if (client.field489 != null) {
                                client.method2721(client.field489);
                                client.field489 = null;
                            }
                            continue;
                        }
                        if (var467 == 3104) {
                            var6--;
                            String var120 = field808[var6];
                            int var121 = 0;
                            if (class163.method2869(var120)) {
                                var121 = class163.method2788(var120);
                            }
                            client.field367.method2612(99);
                            client.field367.method2351(var121);
                            continue;
                        }
                        if (var467 == 3105) {
                            var6--;
                            String var122 = field808[var6];
                            client.field367.method2612(81);
                            client.field367.method2476(var122.length() + 1);
                            client.field367.method2354(var122);
                            continue;
                        }
                        if (var467 == 3106) {
                            var6--;
                            String var123 = field808[var6];
                            client.field367.method2612(162);
                            client.field367.method2476(var123.length() + 1);
                            client.field367.method2354(var123);
                            continue;
                        }
                        if (var467 == 3107) {
                            var5--;
                            int var124 = field810[var5];
                            var6--;
                            String var125 = field808[var6];
                            client.method2075(var124, var125);
                            continue;
                        }
                        if (var467 == 3108) {
                            var5 -= 3;
                            int var126 = field810[var5];
                            int var127 = field810[var5 + 1];
                            int var128 = field810[var5 + 2];
                            class173 var129 = class173.method1976(var128);
                            client.method109(var129, var126, var127);
                            continue;
                        }
                        if (var467 == 3109) {
                            var5 -= 2;
                            int var130 = field810[var5];
                            int var131 = field810[var5 + 1];
                            class173 var132 = var58 ? Statics.field2594 : Statics.field1935;
                            client.method109(var132, var130, var131);
                            continue;
                        }
                        if (var467 == 3110) {
                            var5--;
                            Statics.field1395 = field810[var5] == 1;
                            continue;
                        }
                        if (var467 == 3111) {
                            field810[var5++] = Statics.field783.field146 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3112) {
                            var5--;
                            Statics.field783.field146 = field810[var5] == 1;
                            class9.method2298();
                            continue;
                        }
                        if (var467 == 3113) {
                            var6--;
                            String var133 = field808[var6];
                            var5--;
                            boolean var134 = field810[var5] == 1;
                            if (!var134) {
                                class138.method1029(var133, 3);
                                continue;
                            }
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(var133));
                                    continue;
                                } catch (Exception var465) {
                                }
                            }
                            if (class138.field2128.startsWith("win")) {
                                class138.method1029(var133, 0);
                            } else if (class138.field2128.startsWith("mac")) {
                                class138.method728(var133, 1, "openjs");
                            } else {
                                class138.method1029(var133, 2);
                            }
                            continue;
                        }
                        if (var467 == 3115) {
                            var5--;
                            int var136 = field810[var5];
                            client.field367.method2612(130);
                            client.field367.method2349(var136);
                            continue;
                        }
                        if (var467 == 3116) {
                            var5--;
                            int var137 = field810[var5];
                            var6 -= 2;
                            String var138 = field808[var6];
                            String var139 = field808[var6 + 1];
                            if (var138.length() <= 500 && var139.length() <= 500) {
                                client.field367.method2612(44);
                                client.field367.method2349(1 + class119.method50(var138) + class119.method50(var139));
                                client.field367.method2385(var137);
                                client.field367.method2354(var139);
                                client.field367.method2354(var138);
                            }
                            continue;
                        }
                    } else if (var467 < 3300) {
                        if (var467 == 3200) {
                            var5 -= 3;
                            int var140 = field810[var5];
                            int var141 = field810[var5 + 1];
                            int var142 = field810[var5 + 2];
                            if (client.field534 != 0 && var141 != 0 && client.field393 < 50) {
                                client.field537[client.field393] = var140;
                                client.field538[client.field393] = var141;
                                client.field402[client.field393] = var142;
                                client.field541[client.field393] = null;
                                client.field540[client.field393] = 0;
                                client.field393++;
                            }
                            continue;
                        }
                        if (var467 == 3201) {
                            var5--;
                            int var143 = field810[var5];
                            if (var143 == -1 && !client.field533) {
                                class183.method749();
                            } else if (var143 != -1 && client.field532 != var143 && client.field531 != 0 && !client.field533) {
                                class168 var144 = Statics.field1370;
                                int var145 = client.field531;
                                class183.field2940 = 1;
                                Statics.field76 = var144;
                                Statics.field2944 = var143;
                                Statics.field2945 = 0;
                                Statics.field2244 = var145;
                                Statics.field73 = false;
                                Statics.field1747 = 2;
                            }
                            client.field532 = var143;
                            continue;
                        }
                        if (var467 == 3202) {
                            var5 -= 2;
                            client.method1215(field810[var5], field810[var5 + 1]);
                            continue;
                        }
                    } else if (var467 < 3400) {
                        if (var467 == 3300) {
                            field810[var5++] = client.field302;
                            continue;
                        }
                        if (var467 == 3301) {
                            var5 -= 2;
                            int var146 = field810[var5];
                            int var147 = field810[var5 + 1];
                            int[] var148 = field810;
                            int var149 = var5++;
                            class16 var150 = (class16) class16.field226.method3573((long) var146);
                            int var151;
                            if (var150 == null) {
                                var151 = -1;
                            } else if (var147 >= 0 && var147 < var150.field227.length) {
                                var151 = var150.field227[var147];
                            } else {
                                var151 = -1;
                            }
                            var148[var149] = var151;
                            continue;
                        }
                        if (var467 == 3302) {
                            var5 -= 2;
                            int var152 = field810[var5];
                            int var153 = field810[var5 + 1];
                            field810[var5++] = class16.method2805(var152, var153);
                            continue;
                        }
                        if (var467 == 3303) {
                            var5 -= 2;
                            int var154 = field810[var5];
                            int var155 = field810[var5 + 1];
                            int[] var156 = field810;
                            int var157 = var5++;
                            class16 var158 = (class16) class16.field226.method3573((long) var154);
                            int var159;
                            if (var158 == null) {
                                var159 = 0;
                            } else if (var155 == -1) {
                                var159 = 0;
                            } else {
                                int var160 = 0;
                                for (int var161 = 0; var161 < var158.field228.length; var161++) {
                                    if (var158.field227[var161] == var155) {
                                        var160 += var158.field228[var161];
                                    }
                                }
                                var159 = var160;
                            }
                            var156[var157] = var159;
                            continue;
                        }
                        if (var467 == 3304) {
                            var5--;
                            int var162 = field810[var5];
                            field810[var5++] = class51.method650(var162).field1098;
                            continue;
                        }
                        if (var467 == 3305) {
                            var5--;
                            int var163 = field810[var5];
                            field810[var5++] = client.field431[var163];
                            continue;
                        }
                        if (var467 == 3306) {
                            var5--;
                            int var164 = field810[var5];
                            field810[var5++] = client.field432[var164];
                            continue;
                        }
                        if (var467 == 3307) {
                            var5--;
                            int var165 = field810[var5];
                            field810[var5++] = client.field379[var165];
                            continue;
                        }
                        if (var467 == 3308) {
                            int var166 = Statics.field1765;
                            int var167 = (Statics.field176.field875 >> 7) + Statics.field3144;
                            int var168 = (Statics.field176.field819 >> 7) + Statics.field656;
                            field810[var5++] = (var166 << 28) + (var167 << 14) + var168;
                            continue;
                        }
                        if (var467 == 3309) {
                            var5--;
                            int var169 = field810[var5];
                            field810[var5++] = var169 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var467 == 3310) {
                            var5--;
                            int var170 = field810[var5];
                            field810[var5++] = var170 >> 28;
                            continue;
                        }
                        if (var467 == 3311) {
                            var5--;
                            int var171 = field810[var5];
                            field810[var5++] = var171 & 0x3FFF;
                            continue;
                        }
                        if (var467 == 3312) {
                            field810[var5++] = client.field577 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3313) {
                            var5 -= 2;
                            int var172 = field810[var5] + 32768;
                            int var173 = field810[var5 + 1];
                            int[] var174 = field810;
                            int var175 = var5++;
                            class16 var176 = (class16) class16.field226.method3573((long) var172);
                            int var177;
                            if (var176 == null) {
                                var177 = -1;
                            } else if (var173 >= 0 && var173 < var176.field227.length) {
                                var177 = var176.field227[var173];
                            } else {
                                var177 = -1;
                            }
                            var174[var175] = var177;
                            continue;
                        }
                        if (var467 == 3314) {
                            var5 -= 2;
                            int var178 = field810[var5] + 32768;
                            int var179 = field810[var5 + 1];
                            field810[var5++] = class16.method2805(var178, var179);
                            continue;
                        }
                        if (var467 == 3315) {
                            var5 -= 2;
                            int var180 = field810[var5] + 32768;
                            int var181 = field810[var5 + 1];
                            int[] var182 = field810;
                            int var183 = var5++;
                            class16 var184 = (class16) class16.field226.method3573((long) var180);
                            int var185;
                            if (var184 == null) {
                                var185 = 0;
                            } else if (var181 == -1) {
                                var185 = 0;
                            } else {
                                int var186 = 0;
                                for (int var187 = 0; var187 < var184.field228.length; var187++) {
                                    if (var184.field227[var187] == var181) {
                                        var186 += var184.field228[var187];
                                    }
                                }
                                var185 = var186;
                            }
                            var182[var183] = var185;
                            continue;
                        }
                        if (var467 == 3316) {
                            if (client.field461 >= 2) {
                                field810[var5++] = client.field461;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var467 == 3317) {
                            field810[var5++] = client.field387;
                            continue;
                        }
                        if (var467 == 3318) {
                            field810[var5++] = client.field348;
                            continue;
                        }
                        if (var467 == 3321) {
                            field810[var5++] = client.field459;
                            continue;
                        }
                        if (var467 == 3322) {
                            field810[var5++] = client.field460;
                            continue;
                        }
                        if (var467 == 3323) {
                            if (client.field463) {
                                field810[var5++] = 1;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var467 == 3324) {
                            field810[var5++] = client.field576;
                            continue;
                        }
                    } else if (var467 < 3500) {
                        if (var467 == 3400) {
                            var5 -= 2;
                            int var188 = field810[var5];
                            int var189 = field810[var5 + 1];
                            class49 var190 = class49.method188(var188);
                            if (var190.field1084 != 's') {
                            }
                            for (int var191 = 0; var191 < var190.field1083; var191++) {
                                if (var190.field1089[var191] == var189) {
                                    field808[var6++] = var190.field1086[var191];
                                    var190 = null;
                                    break;
                                }
                            }
                            if (var190 != null) {
                                field808[var6++] = var190.field1081;
                            }
                            continue;
                        }
                        if (var467 == 3408) {
                            var5 -= 4;
                            int var192 = field810[var5];
                            int var193 = field810[var5 + 1];
                            int var194 = field810[var5 + 2];
                            int var195 = field810[var5 + 3];
                            class49 var196 = class49.method188(var194);
                            if (var196.field1079 == var192 && var196.field1084 == var193) {
                                for (int var197 = 0; var197 < var196.field1083; var197++) {
                                    if (var196.field1089[var197] == var195) {
                                        if (var193 == 115) {
                                            field808[var6++] = var196.field1086[var197];
                                        } else {
                                            field810[var5++] = var196.field1085[var197];
                                        }
                                        var196 = null;
                                        break;
                                    }
                                }
                                if (var196 != null) {
                                    if (var193 == 115) {
                                        field808[var6++] = var196.field1081;
                                    } else {
                                        field810[var5++] = var196.field1082;
                                    }
                                }
                                continue;
                            }
                            if (var193 == 115) {
                                field808[var6++] = "null";
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var467 < 3700) {
                        if (var467 == 3600) {
                            if (client.field562 == 0) {
                                field810[var5++] = -2;
                            } else if (client.field562 == 1) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field561;
                            }
                            continue;
                        }
                        if (var467 == 3601) {
                            var5--;
                            int var198 = field810[var5];
                            if (client.field562 == 2 && var198 < client.field561) {
                                field808[var6++] = client.field434[var198].field261;
                                field808[var6++] = client.field434[var198].field254;
                                continue;
                            }
                            field808[var6++] = "";
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 3602) {
                            var5--;
                            int var199 = field810[var5];
                            if (client.field562 == 2 && var199 < client.field561) {
                                field810[var5++] = client.field434[var199].field253;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3603) {
                            var5--;
                            int var200 = field810[var5];
                            if (client.field562 == 2 && var200 < client.field561) {
                                field810[var5++] = client.field434[var200].field260;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3604) {
                            var6--;
                            String var201 = field808[var6];
                            var5--;
                            int var202 = field810[var5];
                            client.method125(var201, var202);
                            continue;
                        }
                        if (var467 == 3605) {
                            var6--;
                            String var203 = field808[var6];
                            client.method2981(var203);
                            continue;
                        }
                        if (var467 == 3606) {
                            var6--;
                            String var204 = field808[var6];
                            client.method2299(var204);
                            continue;
                        }
                        if (var467 == 3607) {
                            var6--;
                            String var205 = field808[var6];
                            if (var205 == null) {
                                continue;
                            }
                            if ((client.field472 < 100 || client.field419 == 1) && client.field472 < 400) {
                                String var206 = class164.method843(var205, Statics.field309);
                                if (var206 == null) {
                                    continue;
                                }
                                for (int var207 = 0; var207 < client.field472; var207++) {
                                    class8 var208 = client.field566[var207];
                                    String var209 = class164.method843(var208.field139, Statics.field309);
                                    if (var209 != null && var209.equals(var206)) {
                                        class12.method2737(31, "", var205 + class157.field2467);
                                        continue label3007;
                                    }
                                    if (var208.field138 != null) {
                                        String var210 = class164.method843(var208.field138, Statics.field309);
                                        if (var210 != null && var210.equals(var206)) {
                                            class12.method2737(31, "", var205 + class157.field2467);
                                            continue label3007;
                                        }
                                    }
                                }
                                for (int var211 = 0; var211 < client.field561; var211++) {
                                    class18 var212 = client.field434[var211];
                                    String var213 = class164.method843(var212.field261, Statics.field309);
                                    if (var213 != null && var213.equals(var206)) {
                                        class12.method2737(31, "", class157.field2472 + var205 + class157.field2473);
                                        continue label3007;
                                    }
                                    if (var212.field254 != null) {
                                        String var214 = class164.method843(var212.field254, Statics.field309);
                                        if (var214 != null && var214.equals(var206)) {
                                            class12.method2737(31, "", class157.field2472 + var205 + class157.field2473);
                                            continue label3007;
                                        }
                                    }
                                }
                                if (class164.method843(Statics.field176.field52, Statics.field309).equals(var206)) {
                                    class12.method2737(31, "", class157.field2460);
                                } else {
                                    client.field367.method2612(93);
                                    client.field367.method2476(class119.method50(var205));
                                    client.field367.method2354(var205);
                                }
                                continue;
                            }
                            class12.method2737(31, "", class157.field2466);
                            continue;
                        }
                        if (var467 == 3608) {
                            var6--;
                            String var215 = field808[var6];
                            if (var215 == null) {
                                continue;
                            }
                            String var216 = class164.method843(var215, Statics.field309);
                            if (var216 == null) {
                                continue;
                            }
                            int var217 = 0;
                            while (true) {
                                if (var217 >= client.field472) {
                                    continue label3007;
                                }
                                class8 var218 = client.field566[var217];
                                String var219 = var218.field139;
                                String var220 = class164.method843(var219, Statics.field309);
                                boolean var221;
                                if (var215 == null || var219 == null) {
                                    var221 = false;
                                } else if (var215.startsWith("#") || var219.startsWith("#")) {
                                    var221 = var215.equals(var219);
                                } else {
                                    var221 = var216.equals(var220);
                                }
                                if (var221) {
                                    client.field472--;
                                    for (int var222 = var217; var222 < client.field472; var222++) {
                                        client.field566[var222] = client.field566[var222 + 1];
                                    }
                                    client.field487 = client.field567;
                                    client.field367.method2612(84);
                                    client.field367.method2476(class119.method50(var215));
                                    client.field367.method2354(var215);
                                    continue label3007;
                                }
                                var217++;
                            }
                        }
                        if (var467 == 3609) {
                            var6--;
                            String var223 = field808[var6];
                            class152[] var224 = class152.method2854();
                            for (int var225 = 0; var225 < var224.length; var225++) {
                                class152 var226 = var224[var225];
                                if (var226.field2257 != -1 && var223.startsWith(class2.method1228(var226.field2257))) {
                                    var223 = var223.substring(6 + Integer.toString(var226.field2257).length());
                                    break;
                                }
                            }
                            field810[var5++] = client.method842(var223, false) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3611) {
                            if (client.field550 == null) {
                                field808[var6++] = "";
                                continue;
                            }
                            String[] var227 = field808;
                            int var228 = var6++;
                            String var229 = client.field550;
                            long var230 = 0L;
                            int var232 = var229.length();
                            for (int var233 = 0; var233 < var232; var233++) {
                                var230 *= 37L;
                                char var234 = var229.charAt(var233);
                                if (var234 >= 'A' && var234 <= 'Z') {
                                    var230 += (long) (var234 + 1 - 65);
                                } else if (var234 >= 'a' && var234 <= 'z') {
                                    var230 += (long) (var234 + 1 - 97);
                                } else if (var234 >= '0' && var234 <= '9') {
                                    var230 += (long) (var234 + 27 - 48);
                                }
                                if (var230 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var230 % 37L == 0L && var230 != 0L) {
                                var230 /= 37L;
                            }
                            String var237 = class162.method1018(var230);
                            if (var237 == null) {
                                var237 = "";
                            }
                            var227[var228] = var237;
                            continue;
                        }
                        if (var467 == 3612) {
                            if (client.field550 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = Statics.field1547;
                            }
                            continue;
                        }
                        if (var467 == 3613) {
                            var5--;
                            int var239 = field810[var5];
                            if (client.field550 != null && var239 < Statics.field1547) {
                                field808[var6++] = Statics.field142[var239].field631;
                                continue;
                            }
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 3614) {
                            var5--;
                            int var240 = field810[var5];
                            if (client.field550 != null && var240 < Statics.field1547) {
                                field810[var5++] = Statics.field142[var240].field628;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3615) {
                            var5--;
                            int var241 = field810[var5];
                            if (client.field550 != null && var241 < Statics.field1547) {
                                field810[var5++] = Statics.field142[var241].field629;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3616) {
                            field810[var5++] = Statics.field3158;
                            continue;
                        }
                        if (var467 == 3617) {
                            var6--;
                            String var242 = field808[var6];
                            if (Statics.field142 != null) {
                                client.field367.method2612(240);
                                client.field367.method2476(class119.method50(var242));
                                client.field367.method2354(var242);
                            }
                            continue;
                        }
                        if (var467 == 3618) {
                            field810[var5++] = Statics.field2277;
                            continue;
                        }
                        if (var467 == 3619) {
                            var6--;
                            String var243 = field808[var6];
                            client.method902(var243);
                            continue;
                        }
                        if (var467 == 3620) {
                            client.field367.method2612(32);
                            client.field367.method2476(0);
                            continue;
                        }
                        if (var467 == 3621) {
                            if (client.field562 == 0) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field472;
                            }
                            continue;
                        }
                        if (var467 == 3622) {
                            var5--;
                            int var244 = field810[var5];
                            if (client.field562 != 0 && var244 < client.field472) {
                                field808[var6++] = client.field566[var244].field139;
                                field808[var6++] = client.field566[var244].field138;
                                continue;
                            }
                            field808[var6++] = "";
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 3623) {
                            var6--;
                            String var245 = field808[var6];
                            if (var245.startsWith(class2.method1228(0)) || var245.startsWith(class2.method1228(1))) {
                                var245 = var245.substring(7);
                            }
                            field810[var5++] = client.method1603(var245) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3624) {
                            var5--;
                            int var246 = field810[var5];
                            if (Statics.field142 != null && var246 < Statics.field1547 && Statics.field142[var246].field631.equalsIgnoreCase(Statics.field176.field52)) {
                                field810[var5++] = 1;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var467 == 3625) {
                            if (client.field298 == null) {
                                field808[var6++] = "";
                                continue;
                            }
                            String[] var247 = field808;
                            int var248 = var6++;
                            String var249 = client.field298;
                            long var250 = 0L;
                            int var252 = var249.length();
                            for (int var253 = 0; var253 < var252; var253++) {
                                var250 *= 37L;
                                char var254 = var249.charAt(var253);
                                if (var254 >= 'A' && var254 <= 'Z') {
                                    var250 += (long) (var254 + 1 - 65);
                                } else if (var254 >= 'a' && var254 <= 'z') {
                                    var250 += (long) (var254 + 1 - 97);
                                } else if (var254 >= '0' && var254 <= '9') {
                                    var250 += (long) (var254 + 27 - 48);
                                }
                                if (var250 >= 177917621779460413L) {
                                    break;
                                }
                            }
                            while (var250 % 37L == 0L && var250 != 0L) {
                                var250 /= 37L;
                            }
                            String var257 = class162.method1018(var250);
                            if (var257 == null) {
                                var257 = "";
                            }
                            var247[var248] = var257;
                            continue;
                        }
                    } else if (var467 < 4000) {
                        if (var467 == 3903) {
                            var5--;
                            int var259 = field810[var5];
                            field810[var5++] = client.field570[var259].method3772();
                            continue;
                        }
                        if (var467 == 3904) {
                            var5--;
                            int var260 = field810[var5];
                            field810[var5++] = client.field570[var260].field3153;
                            continue;
                        }
                        if (var467 == 3905) {
                            var5--;
                            int var261 = field810[var5];
                            field810[var5++] = client.field570[var261].field3152;
                            continue;
                        }
                        if (var467 == 3906) {
                            var5--;
                            int var262 = field810[var5];
                            field810[var5++] = client.field570[var262].field3151;
                            continue;
                        }
                        if (var467 == 3907) {
                            var5--;
                            int var263 = field810[var5];
                            field810[var5++] = client.field570[var263].field3154;
                            continue;
                        }
                        if (var467 == 3908) {
                            var5--;
                            int var264 = field810[var5];
                            field810[var5++] = client.field570[var264].field3150;
                            continue;
                        }
                        if (var467 == 3910) {
                            var5--;
                            int var265 = field810[var5];
                            int var266 = client.field570[var265].method3771();
                            field810[var5++] = var266 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3911) {
                            var5--;
                            int var267 = field810[var5];
                            int var268 = client.field570[var267].method3771();
                            field810[var5++] = var268 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3912) {
                            var5--;
                            int var269 = field810[var5];
                            int var270 = client.field570[var269].method3771();
                            field810[var5++] = var270 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3913) {
                            var5--;
                            int var271 = field810[var5];
                            int var272 = client.field570[var271].method3771();
                            field810[var5++] = var272 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 3914) {
                            var5--;
                            boolean var273 = field810[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3791(class221.field3163, var273);
                            }
                            continue;
                        }
                        if (var467 == 3915) {
                            var5--;
                            boolean var274 = field810[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3791(class221.field3164, var274);
                            }
                            continue;
                        }
                        if (var467 == 3916) {
                            var5 -= 2;
                            boolean var275 = field810[var5] == 1;
                            boolean var276 = field810[var5 + 1] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3791(new class22(var276), var275);
                            }
                            continue;
                        }
                        if (var467 == 3917) {
                            var5--;
                            boolean var277 = field810[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3791(class221.field3161, var277);
                            }
                            continue;
                        }
                        if (var467 == 3918) {
                            var5--;
                            boolean var278 = field810[var5] == 1;
                            if (Statics.field233 != null) {
                                Statics.field233.method3791(class221.field3160, var278);
                            }
                            continue;
                        }
                        if (var467 == 3919) {
                            field810[var5++] = Statics.field233 == null ? 0 : Statics.field233.field3162.size();
                            continue;
                        }
                        if (var467 == 3920) {
                            var5--;
                            int var279 = field810[var5];
                            class214 var280 = (class214) Statics.field233.field3162.get(var279);
                            field810[var5++] = var280.field3129;
                            continue;
                        }
                        if (var467 == 3921) {
                            var5--;
                            int var281 = field810[var5];
                            class214 var282 = (class214) Statics.field233.field3162.get(var281);
                            field808[var6++] = var282.method3729();
                            continue;
                        }
                        if (var467 == 3922) {
                            var5--;
                            int var283 = field810[var5];
                            class214 var284 = (class214) Statics.field233.field3162.get(var283);
                            field808[var6++] = var284.method3732();
                            continue;
                        }
                        if (var467 == 3923) {
                            var5--;
                            int var285 = field810[var5];
                            class214 var286 = (class214) Statics.field233.field3162.get(var285);
                            long var287 = class115.method579() - Statics.field1867 - var286.field3126;
                            int var289 = (int) (var287 / 3600000L);
                            int var290 = (int) ((var287 - (long) (var289 * 3600000)) / 60000L);
                            int var291 = (int) ((var287 - (long) (var289 * 3600000) - (long) (var290 * 60000)) / 1000L);
                            String var292 = var289 + ":" + var290 / 10 + var290 % 10 + ":" + var291 / 10 + var291 % 10;
                            field808[var6++] = var292;
                            continue;
                        }
                        if (var467 == 3924) {
                            var5--;
                            int var293 = field810[var5];
                            class214 var294 = (class214) Statics.field233.field3162.get(var293);
                            field810[var5++] = var294.field3130.field3151;
                            continue;
                        }
                        if (var467 == 3925) {
                            var5--;
                            int var295 = field810[var5];
                            class214 var296 = (class214) Statics.field233.field3162.get(var295);
                            field810[var5++] = var296.field3130.field3152;
                            continue;
                        }
                        if (var467 == 3926) {
                            var5--;
                            int var297 = field810[var5];
                            class214 var298 = (class214) Statics.field233.field3162.get(var297);
                            field810[var5++] = var298.field3130.field3153;
                            continue;
                        }
                    } else if (var467 < 4100) {
                        if (var467 == 4000) {
                            var5 -= 2;
                            int var299 = field810[var5];
                            int var300 = field810[var5 + 1];
                            field810[var5++] = var299 + var300;
                            continue;
                        }
                        if (var467 == 4001) {
                            var5 -= 2;
                            int var301 = field810[var5];
                            int var302 = field810[var5 + 1];
                            field810[var5++] = var301 - var302;
                            continue;
                        }
                        if (var467 == 4002) {
                            var5 -= 2;
                            int var303 = field810[var5];
                            int var304 = field810[var5 + 1];
                            field810[var5++] = var303 * var304;
                            continue;
                        }
                        if (var467 == 4003) {
                            var5 -= 2;
                            int var305 = field810[var5];
                            int var306 = field810[var5 + 1];
                            field810[var5++] = var305 / var306;
                            continue;
                        }
                        if (var467 == 4004) {
                            var5--;
                            int var307 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) var307);
                            continue;
                        }
                        if (var467 == 4005) {
                            var5--;
                            int var308 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) (var308 + 1));
                            continue;
                        }
                        if (var467 == 4006) {
                            var5 -= 5;
                            int var309 = field810[var5];
                            int var310 = field810[var5 + 1];
                            int var311 = field810[var5 + 2];
                            int var312 = field810[var5 + 3];
                            int var313 = field810[var5 + 4];
                            field810[var5++] = (var310 - var309) * (var313 - var311) / (var312 - var311) + var309;
                            continue;
                        }
                        if (var467 == 4007) {
                            var5 -= 2;
                            int var314 = field810[var5];
                            int var315 = field810[var5 + 1];
                            field810[var5++] = var314 * var315 / 100 + var314;
                            continue;
                        }
                        if (var467 == 4008) {
                            var5 -= 2;
                            int var316 = field810[var5];
                            int var317 = field810[var5 + 1];
                            field810[var5++] = var316 | 0x1 << var317;
                            continue;
                        }
                        if (var467 == 4009) {
                            var5 -= 2;
                            int var318 = field810[var5];
                            int var319 = field810[var5 + 1];
                            field810[var5++] = var318 & -1 - (0x1 << var319);
                            continue;
                        }
                        if (var467 == 4010) {
                            var5 -= 2;
                            int var320 = field810[var5];
                            int var321 = field810[var5 + 1];
                            field810[var5++] = (var320 & 0x1 << var321) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var467 == 4011) {
                            var5 -= 2;
                            int var322 = field810[var5];
                            int var323 = field810[var5 + 1];
                            field810[var5++] = var322 % var323;
                            continue;
                        }
                        if (var467 == 4012) {
                            var5 -= 2;
                            int var324 = field810[var5];
                            int var325 = field810[var5 + 1];
                            if (var324 == 0) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var324, (double) var325);
                            }
                            continue;
                        }
                        if (var467 == 4013) {
                            var5 -= 2;
                            int var326 = field810[var5];
                            int var327 = field810[var5 + 1];
                            if (var326 == 0) {
                                field810[var5++] = 0;
                            } else if (var327 == 0) {
                                field810[var5++] = Integer.MAX_VALUE;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var326, 1.0D / (double) var327);
                            }
                            continue;
                        }
                        if (var467 == 4014) {
                            var5 -= 2;
                            int var328 = field810[var5];
                            int var329 = field810[var5 + 1];
                            field810[var5++] = var328 & var329;
                            continue;
                        }
                        if (var467 == 4015) {
                            var5 -= 2;
                            int var330 = field810[var5];
                            int var331 = field810[var5 + 1];
                            field810[var5++] = var330 | var331;
                            continue;
                        }
                    } else if (var467 < 4200) {
                        if (var467 == 4100) {
                            var6--;
                            String var332 = field808[var6];
                            var5--;
                            int var333 = field810[var5];
                            field808[var6++] = var332 + var333;
                            continue;
                        }
                        if (var467 == 4101) {
                            var6 -= 2;
                            String var334 = field808[var6];
                            String var335 = field808[var6 + 1];
                            field808[var6++] = var334 + var335;
                            continue;
                        }
                        if (var467 == 4102) {
                            var6--;
                            String var336 = field808[var6];
                            var5--;
                            int var337 = field810[var5];
                            String[] var338 = field808;
                            int var339 = var6++;
                            String var341;
                            if (var337 < 0) {
                                var341 = Integer.toString(var337);
                            } else {
                                int var342 = var337;
                                String var343;
                                if (var337 < 0) {
                                    var343 = Integer.toString(var337, 10);
                                } else {
                                    int var344 = 2;
                                    int var345 = var337 / 10;
                                    while (var345 != 0) {
                                        var345 /= 10;
                                        var344++;
                                    }
                                    char[] var346 = new char[var344];
                                    var346[0] = '+';
                                    for (int var347 = var344 - 1; var347 > 0; var347--) {
                                        int var348 = var342;
                                        var342 /= 10;
                                        int var349 = var348 - var342 * 10;
                                        if (var349 >= 10) {
                                            var346[var347] = (char) (var349 + 87);
                                        } else {
                                            var346[var347] = (char) (var349 + 48);
                                        }
                                    }
                                    var343 = new String(var346);
                                }
                                var341 = var343;
                            }
                            var338[var339] = var336 + var341;
                            continue;
                        }
                        if (var467 == 4103) {
                            var6--;
                            String var350 = field808[var6];
                            field808[var6++] = var350.toLowerCase();
                            continue;
                        }
                        if (var467 == 4104) {
                            var5--;
                            int var351 = field810[var5];
                            long var352 = ((long) var351 + 11745L) * 86400000L;
                            field811.setTime(new Date(var352));
                            int var354 = field811.get(5);
                            int var355 = field811.get(2);
                            int var356 = field811.get(1);
                            field808[var6++] = var354 + "-" + field815[var355] + "-" + var356;
                            continue;
                        }
                        if (var467 == 4105) {
                            var6 -= 2;
                            String var357 = field808[var6];
                            String var358 = field808[var6 + 1];
                            if (Statics.field176.field41 != null && Statics.field176.field41.field2901) {
                                field808[var6++] = var358;
                                continue;
                            }
                            field808[var6++] = var357;
                            continue;
                        }
                        if (var467 == 4106) {
                            var5--;
                            int var359 = field810[var5];
                            field808[var6++] = Integer.toString(var359);
                            continue;
                        }
                        if (var467 == 4107) {
                            var6 -= 2;
                            field810[var5++] = class163.method1518(class166.method1272(field808[var6], field808[var6 + 1], client.field299));
                            continue;
                        }
                        if (var467 == 4108) {
                            var6--;
                            String var360 = field808[var6];
                            var5 -= 2;
                            int var361 = field810[var5];
                            int var362 = field810[var5 + 1];
                            byte[] var363 = Statics.field246.method3112(var362, 0);
                            class224 var364 = new class224(var363);
                            field810[var5++] = var364.method3808(var360, var361);
                            continue;
                        }
                        if (var467 == 4109) {
                            var6--;
                            String var365 = field808[var6];
                            var5 -= 2;
                            int var366 = field810[var5];
                            int var367 = field810[var5 + 1];
                            byte[] var368 = Statics.field246.method3112(var367, 0);
                            class224 var369 = new class224(var368);
                            field810[var5++] = var369.method3809(var365, var366);
                            continue;
                        }
                        if (var467 == 4110) {
                            var6 -= 2;
                            String var370 = field808[var6];
                            String var371 = field808[var6 + 1];
                            var5--;
                            if (field810[var5] == 1) {
                                field808[var6++] = var370;
                            } else {
                                field808[var6++] = var371;
                            }
                            continue;
                        }
                        if (var467 == 4111) {
                            var6--;
                            String var372 = field808[var6];
                            field808[var6++] = class223.method3887(var372);
                            continue;
                        }
                        if (var467 == 4112) {
                            var6--;
                            String var373 = field808[var6];
                            var5--;
                            int var374 = field810[var5];
                            field808[var6++] = var373 + (char) var374;
                            continue;
                        }
                        if (var467 == 4113) {
                            var5--;
                            int var375 = field810[var5];
                            field810[var5++] = class163.method1982((char) var375) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4114) {
                            var5--;
                            int var376 = field810[var5];
                            field810[var5++] = class163.method2649((char) var376) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4115) {
                            var5--;
                            int var377 = field810[var5];
                            field810[var5++] = class163.method658((char) var377) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4116) {
                            var5--;
                            int var378 = field810[var5];
                            field810[var5++] = class163.method732((char) var378) ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4117) {
                            var6--;
                            String var379 = field808[var6];
                            if (var379 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var379.length();
                            }
                            continue;
                        }
                        if (var467 == 4118) {
                            var6--;
                            String var380 = field808[var6];
                            var5 -= 2;
                            int var381 = field810[var5];
                            int var382 = field810[var5 + 1];
                            field808[var6++] = var380.substring(var381, var382);
                            continue;
                        }
                        if (var467 == 4119) {
                            var6--;
                            String var383 = field808[var6];
                            StringBuilder var384 = new StringBuilder(var383.length());
                            boolean var385 = false;
                            for (int var386 = 0; var386 < var383.length(); var386++) {
                                char var387 = var383.charAt(var386);
                                if (var387 == '<') {
                                    var385 = true;
                                } else if (var387 == '>') {
                                    var385 = false;
                                } else if (!var385) {
                                    var384.append(var387);
                                }
                            }
                            field808[var6++] = var384.toString();
                            continue;
                        }
                        if (var467 == 4120) {
                            var6--;
                            String var388 = field808[var6];
                            var5--;
                            int var389 = field810[var5];
                            field810[var5++] = var388.indexOf(var389);
                            continue;
                        }
                        if (var467 == 4121) {
                            var6 -= 2;
                            String var390 = field808[var6];
                            String var391 = field808[var6 + 1];
                            var5--;
                            int var392 = field810[var5];
                            field810[var5++] = var390.indexOf(var391, var392);
                            continue;
                        }
                    } else if (var467 < 4300) {
                        if (var467 == 4200) {
                            var5--;
                            int var393 = field810[var5];
                            field808[var6++] = class52.method2767(var393).field1111;
                            continue;
                        }
                        if (var467 == 4201) {
                            var5 -= 2;
                            int var394 = field810[var5];
                            int var395 = field810[var5 + 1];
                            class52 var396 = class52.method2767(var394);
                            if (var395 >= 1 && var395 <= 5 && var396.field1131[var395 - 1] != null) {
                                field808[var6++] = var396.field1131[var395 - 1];
                                continue;
                            }
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 4202) {
                            var5 -= 2;
                            int var397 = field810[var5];
                            int var398 = field810[var5 + 1];
                            class52 var399 = class52.method2767(var397);
                            if (var398 >= 1 && var398 <= 5 && var399.field1132[var398 - 1] != null) {
                                field808[var6++] = var399.field1132[var398 - 1];
                                continue;
                            }
                            field808[var6++] = "";
                            continue;
                        }
                        if (var467 == 4203) {
                            var5--;
                            int var400 = field810[var5];
                            field810[var5++] = class52.method2767(var400).field1129;
                            continue;
                        }
                        if (var467 == 4204) {
                            var5--;
                            int var401 = field810[var5];
                            field810[var5++] = class52.method2767(var401).field1128 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4205) {
                            var5--;
                            int var402 = field810[var5];
                            class52 var403 = class52.method2767(var402);
                            if (var403.field1148 == -1 && var403.field1139 >= 0) {
                                field810[var5++] = var403.field1139;
                                continue;
                            }
                            field810[var5++] = var402;
                            continue;
                        }
                        if (var467 == 4206) {
                            var5--;
                            int var404 = field810[var5];
                            class52 var405 = class52.method2767(var404);
                            if (var405.field1148 >= 0 && var405.field1139 >= 0) {
                                field810[var5++] = var405.field1139;
                                continue;
                            }
                            field810[var5++] = var404;
                            continue;
                        }
                        if (var467 == 4207) {
                            var5--;
                            int var406 = field810[var5];
                            field810[var5++] = class52.method2767(var406).field1142 ? 1 : 0;
                            continue;
                        }
                        if (var467 == 4210) {
                            var6--;
                            String var407 = field808[var6];
                            var5--;
                            int var408 = field810[var5];
                            client.method690(var407, var408 == 1);
                            field810[var5++] = Statics.field2871;
                            continue;
                        }
                        if (var467 == 4211) {
                            if (Statics.field2074 != null && Statics.field1516 < Statics.field2871) {
                                field810[var5++] = Statics.field2074[++Statics.field1516 - 1] & 0xFFFF;
                                continue;
                            }
                            field810[var5++] = -1;
                            continue;
                        }
                        if (var467 == 4212) {
                            Statics.field1516 = 0;
                            continue;
                        }
                    } else if (var467 < 5100) {
                        if (var467 == 5000) {
                            field810[var5++] = client.field512;
                            continue;
                        }
                        if (var467 == 5001) {
                            var5 -= 3;
                            client.field512 = field810[var5];
                            Statics.field29 = class130.method668(field810[var5 + 1]);
                            if (Statics.field29 == null) {
                                Statics.field29 = class130.field2051;
                            }
                            client.field513 = field810[var5 + 2];
                            client.field367.method2612(11);
                            client.field367.method2476(client.field512);
                            client.field367.method2476(Statics.field29.field2053);
                            client.field367.method2476(client.field513);
                            continue;
                        }
                        if (var467 == 5002) {
                            var6--;
                            String var409 = field808[var6];
                            var5 -= 2;
                            int var410 = field810[var5];
                            int var411 = field810[var5 + 1];
                            client.field367.method2612(31);
                            client.field367.method2476(class119.method50(var409) + 2);
                            client.field367.method2354(var409);
                            client.field367.method2476(var410 - 1);
                            client.field367.method2476(var411);
                            continue;
                        }
                        if (var467 == 5003) {
                            var5 -= 2;
                            int var412 = field810[var5];
                            int var413 = field810[var5 + 1];
                            class28 var414 = (class28) class12.field186.get(var412);
                            class36 var415 = var414.method647(var413);
                            if (var415 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                                field808[var6++] = "";
                                field808[var6++] = "";
                            } else {
                                field810[var5++] = var415.field798;
                                field810[var5++] = var415.field799;
                                field808[var6++] = var415.field794 == null ? "" : var415.field794;
                                field808[var6++] = var415.field795 == null ? "" : var415.field795;
                                field808[var6++] = var415.field796 == null ? "" : var415.field796;
                            }
                            continue;
                        }
                        if (var467 == 5004) {
                            var5--;
                            int var417 = field810[var5];
                            class36 var418 = (class36) class12.field177.method3586((long) var417);
                            if (var418 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                                field808[var6++] = "";
                                field808[var6++] = "";
                            } else {
                                field810[var5++] = var418.field792;
                                field810[var5++] = var418.field799;
                                field808[var6++] = var418.field794 == null ? "" : var418.field794;
                                field808[var6++] = var418.field795 == null ? "" : var418.field795;
                                field808[var6++] = var418.field796 == null ? "" : var418.field796;
                            }
                            continue;
                        }
                        if (var467 == 5005) {
                            if (Statics.field29 == null) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = Statics.field29.field2053;
                            }
                            continue;
                        }
                        if (var467 == 5008) {
                            var6--;
                            String var420 = field808[var6];
                            var5--;
                            int var421 = field810[var5];
                            String var422 = var420.toLowerCase();
                            byte var423 = 0;
                            if (var422.startsWith(class157.field2474)) {
                                var423 = 0;
                                var420 = var420.substring(class157.field2474.length());
                            } else if (var422.startsWith(class157.field2489)) {
                                var423 = 1;
                                var420 = var420.substring(class157.field2489.length());
                            } else if (var422.startsWith(class157.field2449)) {
                                var423 = 2;
                                var420 = var420.substring(class157.field2449.length());
                            } else if (var422.startsWith(class157.field2480)) {
                                var423 = 3;
                                var420 = var420.substring(class157.field2480.length());
                            } else if (var422.startsWith(class157.field2439)) {
                                var423 = 4;
                                var420 = var420.substring(class157.field2439.length());
                            } else if (var422.startsWith(class157.field2484)) {
                                var423 = 5;
                                var420 = var420.substring(class157.field2484.length());
                            } else if (var422.startsWith(class157.field2486)) {
                                var423 = 6;
                                var420 = var420.substring(class157.field2486.length());
                            } else if (var422.startsWith(class157.field2488)) {
                                var423 = 7;
                                var420 = var420.substring(class157.field2488.length());
                            } else if (var422.startsWith(class157.field2490)) {
                                var423 = 8;
                                var420 = var420.substring(class157.field2490.length());
                            } else if (var422.startsWith(class157.field2492)) {
                                var423 = 9;
                                var420 = var420.substring(class157.field2492.length());
                            } else if (var422.startsWith(class157.field2351)) {
                                var423 = 10;
                                var420 = var420.substring(class157.field2351.length());
                            } else if (var422.startsWith(class157.field2496)) {
                                var423 = 11;
                                var420 = var420.substring(class157.field2496.length());
                            } else if (client.field299 != 0) {
                                if (var422.startsWith(class157.field2475)) {
                                    var423 = 0;
                                    var420 = var420.substring(class157.field2475.length());
                                } else if (var422.startsWith(class157.field2477)) {
                                    var423 = 1;
                                    var420 = var420.substring(class157.field2477.length());
                                } else if (var422.startsWith(class157.field2421)) {
                                    var423 = 2;
                                    var420 = var420.substring(class157.field2421.length());
                                } else if (var422.startsWith(class157.field2313)) {
                                    var423 = 3;
                                    var420 = var420.substring(class157.field2313.length());
                                } else if (var422.startsWith(class157.field2494)) {
                                    var423 = 4;
                                    var420 = var420.substring(class157.field2494.length());
                                } else if (var422.startsWith(class157.field2398)) {
                                    var423 = 5;
                                    var420 = var420.substring(class157.field2398.length());
                                } else if (var422.startsWith(class157.field2487)) {
                                    var423 = 6;
                                    var420 = var420.substring(class157.field2487.length());
                                } else if (var422.startsWith(class157.field2543)) {
                                    var423 = 7;
                                    var420 = var420.substring(class157.field2543.length());
                                } else if (var422.startsWith(class157.field2426)) {
                                    var423 = 8;
                                    var420 = var420.substring(class157.field2426.length());
                                } else if (var422.startsWith(class157.field2381)) {
                                    var423 = 9;
                                    var420 = var420.substring(class157.field2381.length());
                                } else if (var422.startsWith(class157.field2495)) {
                                    var423 = 10;
                                    var420 = var420.substring(class157.field2495.length());
                                } else if (var422.startsWith(class157.field2505)) {
                                    var423 = 11;
                                    var420 = var420.substring(class157.field2505.length());
                                }
                            }
                            String var424 = var420.toLowerCase();
                            byte var425 = 0;
                            if (var424.startsWith(class157.field2498)) {
                                var425 = 1;
                                var420 = var420.substring(class157.field2498.length());
                            } else if (var424.startsWith(class157.field2500)) {
                                var425 = 2;
                                var420 = var420.substring(class157.field2500.length());
                            } else if (var424.startsWith(class157.field2340)) {
                                var425 = 3;
                                var420 = var420.substring(class157.field2340.length());
                            } else if (var424.startsWith(class157.field2469)) {
                                var425 = 4;
                                var420 = var420.substring(class157.field2469.length());
                            } else if (var424.startsWith(class157.field2447)) {
                                var425 = 5;
                                var420 = var420.substring(class157.field2447.length());
                            } else if (client.field299 != 0) {
                                if (var424.startsWith(class157.field2499)) {
                                    var425 = 1;
                                    var420 = var420.substring(class157.field2499.length());
                                } else if (var424.startsWith(class157.field2501)) {
                                    var425 = 2;
                                    var420 = var420.substring(class157.field2501.length());
                                } else if (var424.startsWith(class157.field2503)) {
                                    var425 = 3;
                                    var420 = var420.substring(class157.field2503.length());
                                } else if (var424.startsWith(class157.field2429)) {
                                    var425 = 4;
                                    var420 = var420.substring(class157.field2429.length());
                                } else if (var424.startsWith(class157.field2319)) {
                                    var425 = 5;
                                    var420 = var420.substring(class157.field2319.length());
                                }
                            }
                            client.field367.method2612(56);
                            client.field367.method2476(0);
                            int var426 = client.field367.field1977;
                            client.field367.method2476(var421);
                            client.field367.method2476(var423);
                            client.field367.method2476(var425);
                            class222.method2580(client.field367, var420);
                            client.field367.method2359(client.field367.field1977 - var426);
                            continue;
                        }
                        if (var467 == 5009) {
                            var6 -= 2;
                            String var427 = field808[var6];
                            String var428 = field808[var6 + 1];
                            client.field367.method2612(186);
                            client.field367.method2349(0);
                            int var429 = client.field367.field1977;
                            client.field367.method2354(var427);
                            class222.method2580(client.field367, var428);
                            client.field367.method2418(client.field367.field1977 - var429);
                            continue;
                        }
                        if (var467 == 5015) {
                            String var430;
                            if (Statics.field176 == null || Statics.field176.field52 == null) {
                                var430 = "";
                            } else {
                                var430 = Statics.field176.field52;
                            }
                            field808[var6++] = var430;
                            continue;
                        }
                        if (var467 == 5016) {
                            field810[var5++] = client.field513;
                            continue;
                        }
                        if (var467 == 5017) {
                            var5--;
                            int var431 = field810[var5];
                            field810[var5++] = class12.method2847(var431);
                            continue;
                        }
                        if (var467 == 5018) {
                            var5--;
                            int var432 = field810[var5];
                            int[] var433 = field810;
                            int var434 = var5++;
                            class36 var435 = (class36) class12.field177.method3586((long) var432);
                            int var436;
                            if (var435 == null) {
                                var436 = -1;
                            } else if (class12.field185.field3084 == var435.field3089) {
                                var436 = -1;
                            } else {
                                var436 = ((class36) var435.field3089).field798;
                            }
                            var433[var434] = var436;
                            continue;
                        }
                        if (var467 == 5019) {
                            var5--;
                            int var437 = field810[var5];
                            int[] var438 = field810;
                            int var439 = var5++;
                            class36 var440 = (class36) class12.field177.method3586((long) var437);
                            int var441;
                            if (var440 == null) {
                                var441 = -1;
                            } else if (class12.field185.field3084 == var440.field3088) {
                                var441 = -1;
                            } else {
                                var441 = ((class36) var440.field3088).field798;
                            }
                            var438[var439] = var441;
                            continue;
                        }
                        if (var467 == 5020) {
                            var6--;
                            String var442 = field808[var6];
                            Statics.method705(var442);
                            continue;
                        }
                        if (var467 == 5021) {
                            var6--;
                            client.field514 = field808[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var467 == 5022) {
                            field808[var6++] = client.field514;
                            continue;
                        }
                    }
                } else {
                    class173 var84;
                    if (var467 >= 2000) {
                        var467 -= 1000;
                        var5--;
                        var84 = class173.method1976(field810[var5]);
                    } else {
                        var84 = var58 ? Statics.field2594 : Statics.field1935;
                    }
                    if (var467 == 1300) {
                        var5--;
                        int var85 = field810[var5] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var6--;
                            var84.method3214(var85, field808[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var467 == 1301) {
                        var5 -= 2;
                        int var86 = field810[var5];
                        int var87 = field810[var5 + 1];
                        var84.field2810 = class173.method2984(var86, var87);
                        continue;
                    }
                    if (var467 == 1302) {
                        var5--;
                        var84.field2813 = field810[var5] == 1;
                        continue;
                    }
                    if (var467 == 1303) {
                        var5--;
                        var84.field2770 = field810[var5];
                        continue;
                    }
                    if (var467 == 1304) {
                        var5--;
                        var84.field2787 = field810[var5];
                        continue;
                    }
                    if (var467 == 1305) {
                        var6--;
                        var84.field2825 = field808[var6];
                        continue;
                    }
                    if (var467 == 1306) {
                        var6--;
                        var84.field2814 = field808[var6];
                        continue;
                    }
                    if (var467 == 1307) {
                        var84.field2801 = null;
                        continue;
                    }
                }
                if (var467 < 5400) {
                    if (var467 == 5306) {
                        field810[var5++] = client.method11();
                        continue;
                    }
                    if (var467 == 5307) {
                        var5--;
                        int var443 = field810[var5];
                        if (var443 != 1 && var443 != 2) {
                            continue;
                        }
                        client.field507 = 0L;
                        if (var443 >= 2) {
                            client.field508 = true;
                        } else {
                            client.field508 = false;
                        }
                        client.method1783();
                        if (client.field300 >= 25) {
                            client.field367.method2612(231);
                            client.field367.method2476(client.method11());
                            client.field367.method2349(Statics.field2014);
                            client.field367.method2349(Statics.field2019);
                        }
                        class144.field2200 = true;
                        continue;
                    }
                    if (var467 == 5308) {
                        field810[var5++] = Statics.field783.field148;
                        continue;
                    }
                    if (var467 == 5309) {
                        var5--;
                        int var444 = field810[var5];
                        if (var444 == 1 || var444 == 2) {
                            Statics.field783.field148 = var444;
                            class9.method2298();
                        }
                        continue;
                    }
                }
                if (var467 < 5600) {
                    if (var467 == 5504) {
                        var5 -= 2;
                        int var445 = field810[var5];
                        int var446 = field810[var5 + 1];
                        if (!client.field563) {
                            client.field380 = var445;
                            client.field573 = var446;
                        }
                        continue;
                    }
                    if (var467 == 5505) {
                        field810[var5++] = client.field380;
                        continue;
                    }
                    if (var467 == 5506) {
                        field810[var5++] = client.field573;
                        continue;
                    }
                    if (var467 == 5530) {
                        var5--;
                        int var447 = field810[var5];
                        if (var447 < 0) {
                            var447 = 0;
                        }
                        client.field386 = var447;
                        continue;
                    }
                    if (var467 == 5531) {
                        field810[var5++] = client.field386;
                        continue;
                    }
                }
                if (var467 >= 5700 || var467 != 5630) {
                    if (var467 < 6300) {
                        if (var467 == 6200) {
                            var5 -= 2;
                            client.field548 = (short) field810[var5];
                            if (client.field548 <= 0) {
                                client.field548 = 256;
                            }
                            client.field549 = (short) field810[var5 + 1];
                            if (client.field549 <= 0) {
                                client.field549 = 205;
                            }
                            continue;
                        }
                        if (var467 == 6201) {
                            var5 -= 2;
                            client.field555 = (short) field810[var5];
                            if (client.field555 <= 0) {
                                client.field555 = 256;
                            }
                            client.field551 = (short) field810[var5 + 1];
                            if (client.field551 <= 0) {
                                client.field551 = 320;
                            }
                            continue;
                        }
                        if (var467 == 6202) {
                            var5 -= 4;
                            client.field552 = (short) field810[var5];
                            if (client.field552 <= 0) {
                                client.field552 = 1;
                            }
                            client.field553 = (short) field810[var5 + 1];
                            if (client.field553 <= 0) {
                                client.field553 = 32767;
                            } else if (client.field553 < client.field552) {
                                client.field553 = client.field552;
                            }
                            client.field493 = (short) field810[var5 + 2];
                            if (client.field493 <= 0) {
                                client.field493 = 1;
                            }
                            client.field364 = (short) field810[var5 + 3];
                            if (client.field364 <= 0) {
                                client.field364 = 32767;
                            } else if (client.field364 < client.field493) {
                                client.field364 = client.field493;
                            }
                            continue;
                        }
                        if (var467 == 6203) {
                            if (client.field422 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = -1;
                            } else {
                                client.method161(0, 0, client.field422.field2780, client.field422.field2753, false);
                                field810[var5++] = client.field510;
                                field810[var5++] = client.field559;
                            }
                            continue;
                        }
                        if (var467 == 6204) {
                            field810[var5++] = client.field555;
                            field810[var5++] = client.field551;
                            continue;
                        }
                        if (var467 == 6205) {
                            field810[var5++] = client.field548;
                            field810[var5++] = client.field549;
                            continue;
                        }
                    }
                    if (var467 < 6600) {
                        if (var467 == 6500) {
                            field810[var5++] = class26.method183() ? 1 : 0;
                            continue;
                        }
                        if (var467 == 6501) {
                            class26.field643 = 0;
                            class26 var448;
                            if (class26.field643 < class26.field642) {
                                var448 = Statics.field647[++class26.field643 - 1];
                            } else {
                                var448 = null;
                            }
                            if (var448 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                            } else {
                                field810[var5++] = var448.field646;
                                field810[var5++] = var448.field650;
                                field808[var6++] = var448.field658;
                                field810[var5++] = var448.field640;
                                field810[var5++] = var448.field641;
                                field808[var6++] = var448.field639;
                            }
                            continue;
                        }
                        if (var467 == 6502) {
                            class26 var451;
                            if (class26.field643 < class26.field642) {
                                var451 = Statics.field647[++class26.field643 - 1];
                            } else {
                                var451 = null;
                            }
                            if (var451 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                            } else {
                                field810[var5++] = var451.field646;
                                field810[var5++] = var451.field650;
                                field808[var6++] = var451.field658;
                                field810[var5++] = var451.field640;
                                field810[var5++] = var451.field641;
                                field808[var6++] = var451.field639;
                            }
                            continue;
                        }
                        if (var467 == 6506) {
                            var5--;
                            int var453 = field810[var5];
                            class26 var454 = null;
                            for (int var455 = 0; var455 < class26.field642; var455++) {
                                if (Statics.field647[var455].field646 == var453) {
                                    var454 = Statics.field647[var455];
                                    break;
                                }
                            }
                            if (var454 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field808[var6++] = "";
                            } else {
                                field810[var5++] = var454.field646;
                                field810[var5++] = var454.field650;
                                field808[var6++] = var454.field658;
                                field810[var5++] = var454.field640;
                                field810[var5++] = var454.field641;
                                field808[var6++] = var454.field639;
                            }
                            continue;
                        }
                        if (var467 == 6507) {
                            var5 -= 4;
                            int var456 = field810[var5];
                            boolean var457 = field810[var5 + 1] == 1;
                            int var458 = field810[var5 + 2];
                            boolean var459 = field810[var5 + 3] == 1;
                            if (Statics.field647 != null) {
                                class26.method96(0, Statics.field647.length - 1, var456, var457, var458, var459);
                            }
                            continue;
                        }
                        if (var467 == 6511) {
                            var5--;
                            int var460 = field810[var5];
                            if (var460 >= 0 && var460 < class26.field642) {
                                class26 var461 = Statics.field647[var460];
                                field810[var5++] = var461.field646;
                                field810[var5++] = var461.field650;
                                field808[var6++] = var461.field658;
                                field810[var5++] = var461.field640;
                                field810[var5++] = var461.field641;
                                field808[var6++] = var461.field639;
                                continue;
                            }
                            field810[var5++] = -1;
                            field810[var5++] = 0;
                            field808[var6++] = "";
                            field810[var5++] = 0;
                            field810[var5++] = 0;
                            field808[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field347 = 250;
            }
        } catch (Exception var466) {
            StringBuilder var463 = new StringBuilder(30);
            var463.append("").append(var4.field3099).append(" ");
            for (int var464 = field812 - 1; var464 >= 0; var464--) {
                var463.append("").append(field813[var464].field217.field3099).append(" ");
            }
            var463.append("").append(var10);
            class148.method2631(var463.toString(), var466);
        }
    }

    @ObfuscatedName("fw.w(II)V")
    public static void method2983(int arg0) {
        if (arg0 == -1 || !class173.method2967(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2811[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2816 != null) {
                class1 var4 = new class1();
                var4.field16 = var3;
                var4.field12 = var3.field2816;
                method2988(var4, 2000000);
            }
        }
    }
}
