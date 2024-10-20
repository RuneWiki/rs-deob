package deob;

import java.util.Calendar;
import java.util.Date;

@ObfuscatedName("ac")
public class class37 {

    @ObfuscatedName("ac.a")
    public static int[] field808 = new int[5];

    @ObfuscatedName("ac.s")
    public static int[][] field809 = new int[5][5000];

    @ObfuscatedName("ac.p")
    public static int[] field810 = new int[1000];

    @ObfuscatedName("ac.r")
    public static String[] field811 = new String[1000];

    @ObfuscatedName("ac.k")
    public static int field823 = 0;

    @ObfuscatedName("ac.d")
    public static class15[] field812 = new class15[50];

    @ObfuscatedName("ac.c")
    public static Calendar field814 = Calendar.getInstance();

    @ObfuscatedName("ac.b")
    public static final String[] field805 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @ObfuscatedName("ac.w")
    public static int field816 = 0;

    public class37() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.i(Li;II)V")
    public static void method521(class1 arg0, int arg1) {
        Object[] var2 = arg0.field16;
        int var3 = (Integer) var2[0];
        class23 var4 = class23.method1718(var3);
        if (var4 == null) {
            return;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = -1;
        int[] var8 = var4.field591;
        int[] var9 = var4.field600;
        byte var10 = -1;
        field823 = 0;
        try {
            Statics.field806 = new int[var4.field594];
            int var11 = 0;
            Statics.field807 = new String[var4.field595];
            int var12 = 0;
            for (int var13 = 1; var13 < var2.length; var13++) {
                if (var2[var13] instanceof Integer) {
                    int var14 = (Integer) var2[var13];
                    if (var14 == -2147483647) {
                        var14 = arg0.field4;
                    }
                    if (var14 == -2147483646) {
                        var14 = arg0.field19;
                    }
                    if (var14 == -2147483645) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2740;
                    }
                    if (var14 == -2147483644) {
                        var14 = arg0.field6;
                    }
                    if (var14 == -2147483643) {
                        var14 = arg0.field3 == null ? -1 : arg0.field3.field2766;
                    }
                    if (var14 == -2147483642) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2740;
                    }
                    if (var14 == -2147483641) {
                        var14 = arg0.field1 == null ? -1 : arg0.field1.field2766;
                    }
                    if (var14 == -2147483640) {
                        var14 = arg0.field13;
                    }
                    if (var14 == -2147483639) {
                        var14 = arg0.field12;
                    }
                    Statics.field806[var11++] = var14;
                } else if (var2[var13] instanceof String) {
                    String var15 = (String) var2[var13];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field10;
                    }
                    Statics.field807[var12++] = var15;
                }
            }
            int var16 = 0;
            field816 = arg0.field11;
            label2934: while (true) {
                var16++;
                if (var16 > arg1) {
                    throw new RuntimeException();
                }
                var7++;
                int var449 = var8[var7];
                if (var449 < 100) {
                    if (var449 == 0) {
                        field810[var5++] = var9[var7];
                        continue;
                    }
                    if (var449 == 1) {
                        int var17 = var9[var7];
                        field810[var5++] = class176.field2895[var17];
                        continue;
                    }
                    if (var449 == 2) {
                        int var18 = var9[var7];
                        var5--;
                        class176.field2895[var18] = field810[var5];
                        client.method116(var18);
                        continue;
                    }
                    if (var449 == 3) {
                        field811[var6++] = var4.field593[var7];
                        continue;
                    }
                    if (var449 == 6) {
                        var7 += var9[var7];
                        continue;
                    }
                    if (var449 == 7) {
                        var5 -= 2;
                        if (field810[var5 + 1] != field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 8) {
                        var5 -= 2;
                        if (field810[var5 + 1] == field810[var5]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 9) {
                        var5 -= 2;
                        if (field810[var5] < field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 10) {
                        var5 -= 2;
                        if (field810[var5] > field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 21) {
                        if (field823 == 0) {
                            return;
                        }
                        class15 var19 = field812[--field823];
                        var4 = var19.field211;
                        var8 = var4.field591;
                        var9 = var4.field600;
                        var7 = var19.field212;
                        Statics.field806 = var19.field204;
                        Statics.field807 = var19.field209;
                        continue;
                    }
                    if (var449 == 25) {
                        int var20 = var9[var7];
                        field810[var5++] = Statics.method3146(var20);
                        continue;
                    }
                    if (var449 == 27) {
                        int var21 = var9[var7];
                        var5--;
                        int var22 = field810[var5];
                        class48 var23 = class48.method1915(var21);
                        int var24 = var23.field1075;
                        int var25 = var23.field1078;
                        int var26 = var23.field1079;
                        int var27 = class176.field2893[var26 - var25];
                        if (var22 < 0 || var22 > var27) {
                            var22 = 0;
                        }
                        int var28 = var27 << var25;
                        class176.field2895[var24] = class176.field2895[var24] & ~var28 | var22 << var25 & var28;
                        continue;
                    }
                    if (var449 == 31) {
                        var5 -= 2;
                        if (field810[var5] <= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 32) {
                        var5 -= 2;
                        if (field810[var5] >= field810[var5 + 1]) {
                            var7 += var9[var7];
                        }
                        continue;
                    }
                    if (var449 == 33) {
                        field810[var5++] = Statics.field806[var9[var7]];
                        continue;
                    }
                    int var10001;
                    if (var449 == 34) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field806[var10001] = field810[var5];
                        continue;
                    }
                    if (var449 == 35) {
                        field811[var6++] = Statics.field807[var9[var7]];
                        continue;
                    }
                    if (var449 == 36) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field807[var10001] = field811[var6];
                        continue;
                    }
                    if (var449 == 37) {
                        int var29 = var9[var7];
                        var6 -= var29;
                        String[] var30 = field811;
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
                        field811[var6++] = var31;
                        continue;
                    }
                    if (var449 == 38) {
                        var5--;
                        continue;
                    }
                    if (var449 == 39) {
                        var6--;
                        continue;
                    }
                    if (var449 == 40) {
                        int var41 = var9[var7];
                        class23 var42 = class23.method1718(var41);
                        int[] var43 = new int[var42.field594];
                        String[] var44 = new String[var42.field595];
                        for (int var45 = 0; var45 < var42.field596; var45++) {
                            var43[var45] = field810[var5 - var42.field596 + var45];
                        }
                        for (int var46 = 0; var46 < var42.field590; var46++) {
                            var44[var46] = field811[var6 - var42.field590 + var46];
                        }
                        var5 -= var42.field596;
                        var6 -= var42.field590;
                        class15 var47 = new class15();
                        var47.field211 = var4;
                        var47.field212 = var7;
                        var47.field204 = Statics.field806;
                        var47.field209 = Statics.field807;
                        field812[++field823 - 1] = var47;
                        var4 = var42;
                        var8 = var42.field591;
                        var9 = var42.field600;
                        var7 = -1;
                        Statics.field806 = var43;
                        Statics.field807 = var44;
                        continue;
                    }
                    if (var449 == 42) {
                        field810[var5++] = Statics.field683.method182(var9[var7]);
                        continue;
                    }
                    if (var449 == 43) {
                        var10001 = var9[var7];
                        var5--;
                        Statics.field683.method221(var10001, field810[var5]);
                        continue;
                    }
                    if (var449 == 44) {
                        int var48 = var9[var7] >> 16;
                        int var49 = var9[var7] & 0xFFFF;
                        var5--;
                        int var50 = field810[var5];
                        if (var50 >= 0 && var50 <= 5000) {
                            field808[var48] = var50;
                            byte var51 = -1;
                            if (var49 == 105) {
                                var51 = 0;
                            }
                            int var52 = 0;
                            while (true) {
                                if (var52 >= var50) {
                                    continue label2934;
                                }
                                field809[var48][var52] = var51;
                                var52++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var449 == 45) {
                        int var53 = var9[var7];
                        var5--;
                        int var54 = field810[var5];
                        if (var54 >= 0 && var54 < field808[var53]) {
                            field810[var5++] = field809[var53][var54];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var449 == 46) {
                        int var55 = var9[var7];
                        var5 -= 2;
                        int var56 = field810[var5];
                        if (var56 >= 0 && var56 < field808[var55]) {
                            field809[var55][var56] = field810[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var449 == 47) {
                        String var57 = Statics.field683.method184(var9[var7]);
                        if (var57 == null) {
                            var57 = "null";
                        }
                        field811[var6++] = var57;
                        continue;
                    }
                    if (var449 == 48) {
                        var10001 = var9[var7];
                        var6--;
                        Statics.field683.method183(var10001, field811[var6]);
                        continue;
                    }
                }
                boolean var58;
                if (var9[var7] == 1) {
                    var58 = true;
                } else {
                    var58 = false;
                }
                if (var449 < 1000) {
                    if (var449 == 100) {
                        var5 -= 3;
                        int var59 = field810[var5];
                        int var60 = field810[var5 + 1];
                        int var61 = field810[var5 + 2];
                        if (var60 == 0) {
                            throw new RuntimeException();
                        }
                        class173 var62 = class173.method2988(var59);
                        if (var62.field2759 == null) {
                            var62.field2759 = new class173[var61 + 1];
                        }
                        if (var62.field2759.length <= var61) {
                            class173[] var63 = new class173[var61 + 1];
                            for (int var64 = 0; var64 < var62.field2759.length; var64++) {
                                var63[var64] = var62.field2759[var64];
                            }
                            var62.field2759 = var63;
                        }
                        if (var61 > 0 && var62.field2759[var61 - 1] == null) {
                            throw new RuntimeException("" + (var61 - 1));
                        }
                        class173 var65 = new class173();
                        var65.field2742 = var60;
                        var65.field2800 = var65.field2740 = var62.field2740;
                        var65.field2766 = var61;
                        var65.field2739 = true;
                        var62.field2759[var61] = var65;
                        if (var58) {
                            Statics.field678 = var65;
                        } else {
                            Statics.field265 = var65;
                        }
                        client.method645(var62);
                        continue;
                    }
                    if (var449 == 101) {
                        class173 var66 = var58 ? Statics.field678 : Statics.field265;
                        class173 var67 = class173.method2988(var66.field2740);
                        var67.field2759[var66.field2766] = null;
                        client.method645(var67);
                        continue;
                    }
                    if (var449 == 102) {
                        var5--;
                        class173 var68 = class173.method2988(field810[var5]);
                        var68.field2759 = null;
                        client.method645(var68);
                        continue;
                    }
                    if (var449 == 200) {
                        var5 -= 2;
                        int var69 = field810[var5];
                        int var70 = field810[var5 + 1];
                        class173 var71 = class173.method834(var69, var70);
                        if (var71 != null && var70 != -1) {
                            field810[var5++] = 1;
                            if (var58) {
                                Statics.field678 = var71;
                            } else {
                                Statics.field265 = var71;
                            }
                            continue;
                        }
                        field810[var5++] = 0;
                        continue;
                    }
                    if (var449 == 201) {
                        var5--;
                        class173 var72 = class173.method2988(field810[var5]);
                        if (var72 == null) {
                            field810[var5++] = 0;
                        } else {
                            field810[var5++] = 1;
                            if (var58) {
                                Statics.field678 = var72;
                            } else {
                                Statics.field265 = var72;
                            }
                        }
                        continue;
                    }
                } else if (var449 >= 1000 && var449 < 1100 || var449 >= 2000 && var449 < 2100) {
                    int var73 = -1;
                    class173 var74;
                    if (var449 >= 2000) {
                        var449 -= 1000;
                        var5--;
                        var73 = field810[var5];
                        var74 = class173.method2988(var73);
                    } else {
                        var74 = var58 ? Statics.field678 : Statics.field265;
                    }
                    if (var449 == 1000) {
                        var5 -= 4;
                        var74.field2825 = field810[var5];
                        var74.field2750 = field810[var5 + 1];
                        var74.field2745 = field810[var5 + 2];
                        var74.field2746 = field810[var5 + 3];
                        client.method645(var74);
                        client.method12(var74);
                        if (var73 != -1 && var74.field2742 == 0) {
                            client.method1(Statics.field2817[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var449 == 1001) {
                        var5 -= 4;
                        var74.field2751 = field810[var5];
                        var74.field2756 = field810[var5 + 1];
                        var74.field2747 = field810[var5 + 2];
                        var74.field2849 = field810[var5 + 3];
                        client.method645(var74);
                        client.method12(var74);
                        if (var73 != -1 && var74.field2742 == 0) {
                            client.method1(Statics.field2817[var73 >> 16], var74, false);
                        }
                        continue;
                    }
                    if (var449 == 1003) {
                        var5--;
                        boolean var75 = field810[var5] == 1;
                        if (var74.field2832 != var75) {
                            var74.field2832 = var75;
                            client.method645(var74);
                        }
                        continue;
                    }
                    if (var449 == 1005) {
                        var5--;
                        var74.field2748 = field810[var5] == 1;
                        continue;
                    }
                    if (var449 == 1006) {
                        var5--;
                        var74.field2872 = field810[var5] == 1;
                        continue;
                    }
                } else if (!(var449 < 1100 || var449 >= 1200) || !(var449 < 2100 || var449 >= 2200)) {
                    int var76 = -1;
                    class173 var77;
                    if (var449 >= 2000) {
                        var449 -= 1000;
                        var5--;
                        var76 = field810[var5];
                        var77 = class173.method2988(var76);
                    } else {
                        var77 = var58 ? Statics.field678 : Statics.field265;
                    }
                    if (var449 == 1100) {
                        var5 -= 2;
                        var77.field2731 = field810[var5];
                        if (var77.field2731 > var77.field2763 - var77.field2755) {
                            var77.field2731 = var77.field2763 - var77.field2755;
                        }
                        if (var77.field2731 < 0) {
                            var77.field2731 = 0;
                        }
                        var77.field2762 = field810[var5 + 1];
                        if (var77.field2762 > var77.field2764 - var77.field2781) {
                            var77.field2762 = var77.field2764 - var77.field2781;
                        }
                        if (var77.field2762 < 0) {
                            var77.field2762 = 0;
                        }
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1101) {
                        var5--;
                        var77.field2765 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1102) {
                        var5--;
                        var77.field2769 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1103) {
                        var5--;
                        var77.field2770 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1104) {
                        var5--;
                        var77.field2771 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1105) {
                        var5--;
                        var77.field2773 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1106) {
                        var5--;
                        var77.field2775 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1107) {
                        var5--;
                        var77.field2796 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1108) {
                        var77.field2859 = 1;
                        var5--;
                        var77.field2777 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1109) {
                        var5 -= 6;
                        var77.field2767 = field810[var5];
                        var77.field2788 = field810[var5 + 1];
                        var77.field2780 = field810[var5 + 2];
                        var77.field2730 = field810[var5 + 3];
                        var77.field2865 = field810[var5 + 4];
                        var77.field2792 = field810[var5 + 5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1110) {
                        var5--;
                        int var78 = field810[var5];
                        if (var77.field2785 != var78) {
                            var77.field2785 = var78;
                            var77.field2793 = 0;
                            var77.field2827 = 0;
                            client.method645(var77);
                        }
                        continue;
                    }
                    if (var449 == 1111) {
                        var5--;
                        var77.field2795 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1112) {
                        var6--;
                        String var79 = field811[var6];
                        if (!var79.equals(var77.field2798)) {
                            var77.field2798 = var79;
                            client.method645(var77);
                        }
                        continue;
                    }
                    if (var449 == 1113) {
                        var5--;
                        var77.field2862 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1114) {
                        var5 -= 3;
                        var77.field2782 = field810[var5];
                        var77.field2802 = field810[var5 + 1];
                        var77.field2840 = field810[var5 + 2];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1115) {
                        var5--;
                        var77.field2803 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1116) {
                        var5--;
                        var77.field2789 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1117) {
                        var5--;
                        var77.field2786 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1118) {
                        var5--;
                        var77.field2778 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1119) {
                        var5--;
                        var77.field2812 = field810[var5] == 1;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1120) {
                        var5 -= 2;
                        var77.field2763 = field810[var5];
                        var77.field2764 = field810[var5 + 1];
                        client.method645(var77);
                        if (var76 != -1 && var77.field2742 == 0) {
                            client.method1(Statics.field2817[var76 >> 16], var77, false);
                        }
                        continue;
                    }
                    if (var449 == 1121) {
                        client.method2694(var77.field2740, var77.field2766);
                        client.field421 = var77;
                        client.method645(var77);
                        continue;
                    }
                    if (var449 == 1122) {
                        var5--;
                        var77.field2774 = field810[var5];
                        client.method645(var77);
                        continue;
                    }
                } else if (var449 >= 1200 && var449 < 1300 || var449 >= 2200 && var449 < 2300) {
                    class173 var80;
                    if (var449 >= 2000) {
                        var449 -= 1000;
                        var5--;
                        var80 = class173.method2988(field810[var5]);
                    } else {
                        var80 = var58 ? Statics.field678 : Statics.field265;
                    }
                    client.method645(var80);
                    if (var449 == 1200 || var449 == 1205 || var449 == 1212) {
                        var5 -= 2;
                        int var81 = field810[var5];
                        int var82 = field810[var5 + 1];
                        var80.field2858 = var81;
                        var80.field2741 = var82;
                        class52 var83 = class52.method2618(var81);
                        var80.field2780 = var83.field1124;
                        var80.field2730 = var83.field1125;
                        var80.field2865 = var83.field1118;
                        var80.field2767 = var83.field1154;
                        var80.field2788 = var83.field1128;
                        var80.field2792 = var83.field1123;
                        if (var449 == 1205) {
                            var80.field2797 = 0;
                        } else if (var449 == 1212 | var83.field1129 == 1) {
                            var80.field2797 = 1;
                        } else {
                            var80.field2797 = 2;
                        }
                        if (var80.field2791 > 0) {
                            var80.field2792 = var80.field2792 * 32 / var80.field2791;
                        } else if (var80.field2751 > 0) {
                            var80.field2792 = var80.field2792 * 32 / var80.field2751;
                        }
                        continue;
                    }
                    if (var449 == 1201) {
                        var80.field2859 = 2;
                        var5--;
                        var80.field2777 = field810[var5];
                        continue;
                    }
                    if (var449 == 1202) {
                        var80.field2859 = 3;
                        var80.field2777 = Statics.field162.field35.method3235();
                        continue;
                    }
                } else if (var449 >= 1300 && var449 < 1400 || var449 >= 2300 && var449 < 2400) {
                    class173 var84;
                    if (var449 >= 2000) {
                        var449 -= 1000;
                        var5--;
                        var84 = class173.method2988(field810[var5]);
                    } else {
                        var84 = var58 ? Statics.field678 : Statics.field265;
                    }
                    if (var449 == 1300) {
                        var5--;
                        int var85 = field810[var5] - 1;
                        if (var85 >= 0 && var85 <= 9) {
                            var6--;
                            var84.method3170(var85, field811[var6]);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var449 == 1301) {
                        var5 -= 2;
                        int var86 = field810[var5];
                        int var87 = field810[var5 + 1];
                        var84.field2752 = class173.method834(var86, var87);
                        continue;
                    }
                    if (var449 == 1302) {
                        var5--;
                        var84.field2749 = field810[var5] == 1;
                        continue;
                    }
                    if (var449 == 1303) {
                        var5--;
                        var84.field2814 = field810[var5];
                        continue;
                    }
                    if (var449 == 1304) {
                        var5--;
                        var84.field2815 = field810[var5];
                        continue;
                    }
                    if (var449 == 1305) {
                        var6--;
                        var84.field2867 = field811[var6];
                        continue;
                    }
                    if (var449 == 1306) {
                        var6--;
                        var84.field2864 = field811[var6];
                        continue;
                    }
                    if (var449 == 1307) {
                        var84.field2757 = null;
                        continue;
                    }
                } else {
                    if (var449 >= 1400 && var449 < 1500 || var449 >= 2400 && var449 < 2500) {
                        class173 var88;
                        if (var449 >= 2000) {
                            var449 -= 1000;
                            var5--;
                            var88 = class173.method2988(field810[var5]);
                        } else {
                            var88 = var58 ? Statics.field678 : Statics.field265;
                        }
                        var6--;
                        String var89 = field811[var6];
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
                                var92[var93] = field811[var6];
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
                        if (var449 == 1400) {
                            var88.field2820 = var92;
                        }
                        if (var449 == 1401) {
                            var88.field2823 = var92;
                        }
                        if (var449 == 1402) {
                            var88.field2822 = var92;
                        }
                        if (var449 == 1403) {
                            var88.field2824 = var92;
                        }
                        if (var449 == 1404) {
                            var88.field2826 = var92;
                        }
                        if (var449 == 1405) {
                            var88.field2818 = var92;
                        }
                        if (var449 == 1406) {
                            var88.field2830 = var92;
                        }
                        if (var449 == 1407) {
                            var88.field2808 = var92;
                            var88.field2761 = var90;
                        }
                        if (var449 == 1408) {
                            var88.field2837 = var92;
                        }
                        if (var449 == 1409) {
                            var88.field2866 = var92;
                        }
                        if (var449 == 1410) {
                            var88.field2828 = var92;
                        }
                        if (var449 == 1411) {
                            var88.field2850 = var92;
                        }
                        if (var449 == 1412) {
                            var88.field2860 = var92;
                        }
                        if (var449 == 1414) {
                            var88.field2833 = var92;
                            var88.field2834 = var90;
                        }
                        if (var449 == 1415) {
                            var88.field2835 = var92;
                            var88.field2836 = var90;
                        }
                        if (var449 == 1416) {
                            var88.field2829 = var92;
                        }
                        if (var449 == 1417) {
                            var88.field2839 = var92;
                        }
                        if (var449 == 1418) {
                            var88.field2816 = var92;
                        }
                        if (var449 == 1419) {
                            var88.field2841 = var92;
                        }
                        if (var449 == 1420) {
                            var88.field2842 = var92;
                        }
                        if (var449 == 1421) {
                            var88.field2843 = var92;
                        }
                        if (var449 == 1422) {
                            var88.field2844 = var92;
                        }
                        if (var449 == 1423) {
                            var88.field2732 = var92;
                        }
                        if (var449 == 1424) {
                            var88.field2846 = var92;
                        }
                        if (var449 == 1425) {
                            var88.field2848 = var92;
                        }
                        if (var449 == 1426) {
                            var88.field2856 = var92;
                        }
                        if (var449 == 1427) {
                            var88.field2847 = var92;
                        }
                        var88.field2790 = true;
                        continue;
                    }
                    if (var449 < 1600) {
                        class173 var95 = var58 ? Statics.field678 : Statics.field265;
                        if (var449 == 1500) {
                            field810[var5++] = var95.field2753;
                            continue;
                        }
                        if (var449 == 1501) {
                            field810[var5++] = var95.field2754;
                            continue;
                        }
                        if (var449 == 1502) {
                            field810[var5++] = var95.field2755;
                            continue;
                        }
                        if (var449 == 1503) {
                            field810[var5++] = var95.field2781;
                            continue;
                        }
                        if (var449 == 1504) {
                            field810[var5++] = var95.field2832 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 1505) {
                            field810[var5++] = var95.field2800;
                            continue;
                        }
                    } else if (var449 < 1700) {
                        class173 var96 = var58 ? Statics.field678 : Statics.field265;
                        if (var449 == 1600) {
                            field810[var5++] = var96.field2731;
                            continue;
                        }
                        if (var449 == 1601) {
                            field810[var5++] = var96.field2762;
                            continue;
                        }
                        if (var449 == 1602) {
                            field811[var6++] = var96.field2798;
                            continue;
                        }
                        if (var449 == 1603) {
                            field810[var5++] = var96.field2763;
                            continue;
                        }
                        if (var449 == 1604) {
                            field810[var5++] = var96.field2764;
                            continue;
                        }
                        if (var449 == 1605) {
                            field810[var5++] = var96.field2792;
                            continue;
                        }
                        if (var449 == 1606) {
                            field810[var5++] = var96.field2780;
                            continue;
                        }
                        if (var449 == 1607) {
                            field810[var5++] = var96.field2865;
                            continue;
                        }
                        if (var449 == 1608) {
                            field810[var5++] = var96.field2730;
                            continue;
                        }
                        if (var449 == 1609) {
                            field810[var5++] = var96.field2770;
                            continue;
                        }
                    } else if (var449 < 1800) {
                        class173 var97 = var58 ? Statics.field678 : Statics.field265;
                        if (var449 == 1700) {
                            field810[var5++] = var97.field2858;
                            continue;
                        }
                        if (var449 == 1701) {
                            if (var97.field2858 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var97.field2741;
                            }
                            continue;
                        }
                        if (var449 == 1702) {
                            field810[var5++] = var97.field2766;
                            continue;
                        }
                    } else if (var449 < 1900) {
                        class173 var98 = var58 ? Statics.field678 : Statics.field265;
                        if (var449 == 1800) {
                            field810[var5++] = class178.method2767(client.method572(var98));
                            continue;
                        }
                        if (var449 == 1801) {
                            var5--;
                            int var99 = field810[var5];
                            int var450 = var99 - 1;
                            if (var98.field2757 != null && var450 < var98.field2757.length && var98.field2757[var450] != null) {
                                field811[var6++] = var98.field2757[var450];
                                continue;
                            }
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 1802) {
                            if (var98.field2867 == null) {
                                field811[var6++] = "";
                            } else {
                                field811[var6++] = var98.field2867;
                            }
                            continue;
                        }
                    } else if (!(var449 < 1900 || var449 >= 2000) || !(var449 < 2900 || var449 >= 3000)) {
                        class173 var100;
                        if (var449 >= 2000) {
                            var449 -= 1000;
                            var5--;
                            var100 = class173.method2988(field810[var5]);
                        } else {
                            var100 = var58 ? Statics.field678 : Statics.field265;
                        }
                        if (var449 == 1927) {
                            if (field816 >= 10) {
                                throw new RuntimeException();
                            }
                            if (var100.field2847 == null) {
                                return;
                            }
                            class1 var101 = new class1();
                            var101.field3 = var100;
                            var101.field16 = var100.field2847;
                            var101.field11 = field816 + 1;
                            client.field567.method3545(arg0);
                            continue;
                        }
                    } else if (var449 < 2600) {
                        var5--;
                        class173 var102 = class173.method2988(field810[var5]);
                        if (var449 == 2500) {
                            field810[var5++] = var102.field2753;
                            continue;
                        }
                        if (var449 == 2501) {
                            field810[var5++] = var102.field2754;
                            continue;
                        }
                        if (var449 == 2502) {
                            field810[var5++] = var102.field2755;
                            continue;
                        }
                        if (var449 == 2503) {
                            field810[var5++] = var102.field2781;
                            continue;
                        }
                        if (var449 == 2504) {
                            field810[var5++] = var102.field2832 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 2505) {
                            field810[var5++] = var102.field2800;
                            continue;
                        }
                    } else if (var449 < 2700) {
                        var5--;
                        class173 var103 = class173.method2988(field810[var5]);
                        if (var449 == 2600) {
                            field810[var5++] = var103.field2731;
                            continue;
                        }
                        if (var449 == 2601) {
                            field810[var5++] = var103.field2762;
                            continue;
                        }
                        if (var449 == 2602) {
                            field811[var6++] = var103.field2798;
                            continue;
                        }
                        if (var449 == 2603) {
                            field810[var5++] = var103.field2763;
                            continue;
                        }
                        if (var449 == 2604) {
                            field810[var5++] = var103.field2764;
                            continue;
                        }
                        if (var449 == 2605) {
                            field810[var5++] = var103.field2792;
                            continue;
                        }
                        if (var449 == 2606) {
                            field810[var5++] = var103.field2780;
                            continue;
                        }
                        if (var449 == 2607) {
                            field810[var5++] = var103.field2865;
                            continue;
                        }
                        if (var449 == 2608) {
                            field810[var5++] = var103.field2730;
                            continue;
                        }
                        if (var449 == 2609) {
                            field810[var5++] = var103.field2770;
                            continue;
                        }
                    } else if (var449 < 2800) {
                        if (var449 == 2700) {
                            var5--;
                            class173 var104 = class173.method2988(field810[var5]);
                            field810[var5++] = var104.field2858;
                            continue;
                        }
                        if (var449 == 2701) {
                            var5--;
                            class173 var105 = class173.method2988(field810[var5]);
                            if (var105.field2858 == -1) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var105.field2741;
                            }
                            continue;
                        }
                        if (var449 == 2702) {
                            var5--;
                            int var106 = field810[var5];
                            class4 var107 = (class4) client.field450.method3509((long) var106);
                            if (var107 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = 1;
                            }
                            continue;
                        }
                        if (var449 == 2706) {
                            field810[var5++] = client.field517;
                            continue;
                        }
                    } else if (var449 < 2900) {
                        var5--;
                        class173 var108 = class173.method2988(field810[var5]);
                        if (var449 == 2800) {
                            field810[var5++] = class178.method2767(client.method572(var108));
                            continue;
                        }
                        if (var449 == 2801) {
                            var5--;
                            int var109 = field810[var5];
                            int var451 = var109 - 1;
                            if (var108.field2757 != null && var451 < var108.field2757.length && var108.field2757[var451] != null) {
                                field811[var6++] = var108.field2757[var451];
                                continue;
                            }
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 2802) {
                            if (var108.field2867 == null) {
                                field811[var6++] = "";
                            } else {
                                field811[var6++] = var108.field2867;
                            }
                            continue;
                        }
                    } else if (var449 < 3200) {
                        if (var449 == 3100) {
                            var6--;
                            String var110 = field811[var6];
                            class12.method930(0, "", var110);
                            continue;
                        }
                        if (var449 == 3101) {
                            var5 -= 2;
                            client.method168(Statics.field162, field810[var5], field810[var5 + 1]);
                            continue;
                        }
                        if (var449 == 3103) {
                            client.field295.method2549(228);
                            for (class4 var111 = (class4) client.field450.method3496(); var111 != null; var111 = (class4) client.field450.method3500()) {
                                if (var111.field62 == 0 || var111.field62 == 3) {
                                    client.method711(var111, true);
                                }
                            }
                            if (client.field421 != null) {
                                client.method645(client.field421);
                                client.field421 = null;
                            }
                            continue;
                        }
                        if (var449 == 3104) {
                            var6--;
                            String var112 = field811[var6];
                            int var113 = 0;
                            if (class163.method2238(var112)) {
                                var113 = class163.method2242(var112);
                            }
                            client.field295.method2549(12);
                            client.field295.method2299(var113);
                            continue;
                        }
                        if (var449 == 3105) {
                            var6--;
                            String var114 = field811[var6];
                            client.field295.method2549(108);
                            client.field295.method2296(var114.length() + 1);
                            client.field295.method2302(var114);
                            continue;
                        }
                        if (var449 == 3106) {
                            var6--;
                            String var115 = field811[var6];
                            client.field295.method2549(4);
                            client.field295.method2296(var115.length() + 1);
                            client.field295.method2302(var115);
                            continue;
                        }
                        if (var449 == 3107) {
                            var5--;
                            int var116 = field810[var5];
                            var6--;
                            String var117 = field811[var6];
                            client.method169(var116, var117);
                            continue;
                        }
                        if (var449 == 3108) {
                            var5 -= 3;
                            int var118 = field810[var5];
                            int var119 = field810[var5 + 1];
                            int var120 = field810[var5 + 2];
                            class173 var121 = class173.method2988(var120);
                            client.method2184(var121, var118, var119);
                            continue;
                        }
                        if (var449 == 3109) {
                            var5 -= 2;
                            int var122 = field810[var5];
                            int var123 = field810[var5 + 1];
                            class173 var124 = var58 ? Statics.field678 : Statics.field265;
                            client.method2184(var124, var122, var123);
                            continue;
                        }
                        if (var449 == 3110) {
                            var5--;
                            Statics.field1652 = field810[var5] == 1;
                            continue;
                        }
                        if (var449 == 3111) {
                            field810[var5++] = Statics.field187.field150 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3112) {
                            var5--;
                            Statics.field187.field150 = field810[var5] == 1;
                            class9.method2088();
                            continue;
                        }
                        if (var449 == 3113) {
                            var6--;
                            String var125 = field811[var6];
                            var5--;
                            boolean var126 = field810[var5] == 1;
                            class138.method712(var125, var126, "openjs", false);
                            continue;
                        }
                        if (var449 == 3115) {
                            var5--;
                            int var127 = field810[var5];
                            client.field295.method2549(61);
                            client.field295.method2381(var127);
                            continue;
                        }
                        if (var449 == 3116) {
                            var5--;
                            int var128 = field810[var5];
                            var6 -= 2;
                            String var129 = field811[var6];
                            String var130 = field811[var6 + 1];
                            if (var129.length() <= 500 && var130.length() <= 500) {
                                client.field295.method2549(148);
                                client.field295.method2381(1 + class119.method3638(var129) + class119.method3638(var130));
                                client.field295.method2302(var130);
                                client.field295.method2296(var128);
                                client.field295.method2302(var129);
                            }
                            continue;
                        }
                    } else if (var449 < 3300) {
                        if (var449 == 3200) {
                            var5 -= 3;
                            client.method100(field810[var5], field810[var5 + 1], field810[var5 + 2]);
                            continue;
                        }
                        if (var449 == 3201) {
                            var5--;
                            int var131 = field810[var5];
                            if (var131 == -1 && !client.field319) {
                                class183.method2222();
                            } else if (var131 != -1 && client.field528 != var131 && client.field526 != 0 && !client.field319) {
                                class183.method588(2, Statics.field159, var131, 0, client.field526, false);
                            }
                            client.field528 = var131;
                            continue;
                        }
                        if (var449 == 3202) {
                            var5 -= 2;
                            Statics.method1473(field810[var5], field810[var5 + 1]);
                            continue;
                        }
                    } else if (var449 < 3400) {
                        if (var449 == 3300) {
                            field810[var5++] = client.field302;
                            continue;
                        }
                        if (var449 == 3301) {
                            var5 -= 2;
                            int var132 = field810[var5];
                            int var133 = field810[var5 + 1];
                            int[] var134 = field810;
                            int var135 = var5++;
                            class16 var136 = (class16) class16.field215.method3509((long) var132);
                            int var137;
                            if (var136 == null) {
                                var137 = -1;
                            } else if (var133 >= 0 && var133 < var136.field217.length) {
                                var137 = var136.field217[var133];
                            } else {
                                var137 = -1;
                            }
                            var134[var135] = var137;
                            continue;
                        }
                        if (var449 == 3302) {
                            var5 -= 2;
                            int var138 = field810[var5];
                            int var139 = field810[var5 + 1];
                            int[] var140 = field810;
                            int var141 = var5++;
                            class16 var142 = (class16) class16.field215.method3509((long) var138);
                            int var143;
                            if (var142 == null) {
                                var143 = 0;
                            } else if (var139 >= 0 && var139 < var142.field214.length) {
                                var143 = var142.field214[var139];
                            } else {
                                var143 = 0;
                            }
                            var140[var141] = var143;
                            continue;
                        }
                        if (var449 == 3303) {
                            var5 -= 2;
                            int var144 = field810[var5];
                            int var145 = field810[var5 + 1];
                            field810[var5++] = class16.method2736(var144, var145);
                            continue;
                        }
                        if (var449 == 3304) {
                            var5--;
                            int var146 = field810[var5];
                            field810[var5++] = class51.method905(var146).field1104;
                            continue;
                        }
                        if (var449 == 3305) {
                            var5--;
                            int var147 = field810[var5];
                            field810[var5++] = client.field298[var147];
                            continue;
                        }
                        if (var449 == 3306) {
                            var5--;
                            int var148 = field810[var5];
                            field810[var5++] = client.field476[var148];
                            continue;
                        }
                        if (var449 == 3307) {
                            var5--;
                            int var149 = field810[var5];
                            field810[var5++] = client.field420[var149];
                            continue;
                        }
                        if (var449 == 3308) {
                            int var150 = Statics.field1963;
                            int var151 = (Statics.field162.field855 >> 7) + Statics.field2644;
                            int var152 = (Statics.field162.field825 >> 7) + Statics.field934;
                            field810[var5++] = (var150 << 28) + (var151 << 14) + var152;
                            continue;
                        }
                        if (var449 == 3309) {
                            var5--;
                            int var153 = field810[var5];
                            field810[var5++] = var153 >> 14 & 0x3FFF;
                            continue;
                        }
                        if (var449 == 3310) {
                            var5--;
                            int var154 = field810[var5];
                            field810[var5++] = var154 >> 28;
                            continue;
                        }
                        if (var449 == 3311) {
                            var5--;
                            int var155 = field810[var5];
                            field810[var5++] = var155 & 0x3FFF;
                            continue;
                        }
                        if (var449 == 3312) {
                            field810[var5++] = client.field296 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3313) {
                            var5 -= 2;
                            int var156 = field810[var5] + 32768;
                            int var157 = field810[var5 + 1];
                            int[] var158 = field810;
                            int var159 = var5++;
                            class16 var160 = (class16) class16.field215.method3509((long) var156);
                            int var161;
                            if (var160 == null) {
                                var161 = -1;
                            } else if (var157 >= 0 && var157 < var160.field217.length) {
                                var161 = var160.field217[var157];
                            } else {
                                var161 = -1;
                            }
                            var158[var159] = var161;
                            continue;
                        }
                        if (var449 == 3314) {
                            var5 -= 2;
                            int var162 = field810[var5] + 32768;
                            int var163 = field810[var5 + 1];
                            int[] var164 = field810;
                            int var165 = var5++;
                            class16 var166 = (class16) class16.field215.method3509((long) var162);
                            int var167;
                            if (var166 == null) {
                                var167 = 0;
                            } else if (var163 >= 0 && var163 < var166.field214.length) {
                                var167 = var166.field214[var163];
                            } else {
                                var167 = 0;
                            }
                            var164[var165] = var167;
                            continue;
                        }
                        if (var449 == 3315) {
                            var5 -= 2;
                            int var168 = field810[var5] + 32768;
                            int var169 = field810[var5 + 1];
                            field810[var5++] = class16.method2736(var168, var169);
                            continue;
                        }
                        if (var449 == 3316) {
                            if (client.field456 >= 2) {
                                field810[var5++] = client.field456;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var449 == 3317) {
                            field810[var5++] = client.field309;
                            continue;
                        }
                        if (var449 == 3318) {
                            field810[var5++] = client.field291;
                            continue;
                        }
                        if (var449 == 3321) {
                            field810[var5++] = client.field351;
                            continue;
                        }
                        if (var449 == 3322) {
                            field810[var5++] = client.field455;
                            continue;
                        }
                        if (var449 == 3323) {
                            if (client.field458) {
                                field810[var5++] = 1;
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                        if (var449 == 3324) {
                            field810[var5++] = client.field292;
                            continue;
                        }
                    } else if (var449 < 3500) {
                        if (var449 == 3400) {
                            var5 -= 2;
                            int var170 = field810[var5];
                            int var171 = field810[var5 + 1];
                            class49 var172 = class49.method2641(var170);
                            if (var172.field1088 != 's') {
                            }
                            for (int var173 = 0; var173 < var172.field1091; var173++) {
                                if (var172.field1092[var173] == var171) {
                                    field811[var6++] = var172.field1097[var173];
                                    var172 = null;
                                    break;
                                }
                            }
                            if (var172 != null) {
                                field811[var6++] = var172.field1089;
                            }
                            continue;
                        }
                        if (var449 == 3408) {
                            var5 -= 4;
                            int var174 = field810[var5];
                            int var175 = field810[var5 + 1];
                            int var176 = field810[var5 + 2];
                            int var177 = field810[var5 + 3];
                            class49 var178 = class49.method2641(var176);
                            if (var178.field1095 == var174 && var178.field1088 == var175) {
                                for (int var179 = 0; var179 < var178.field1091; var179++) {
                                    if (var178.field1092[var179] == var177) {
                                        if (var175 == 115) {
                                            field811[var6++] = var178.field1097[var179];
                                        } else {
                                            field810[var5++] = var178.field1085[var179];
                                        }
                                        var178 = null;
                                        break;
                                    }
                                }
                                if (var178 != null) {
                                    if (var175 == 115) {
                                        field811[var6++] = var178.field1089;
                                    } else {
                                        field810[var5++] = var178.field1090;
                                    }
                                }
                                continue;
                            }
                            if (var175 == 115) {
                                field811[var6++] = "null";
                            } else {
                                field810[var5++] = 0;
                            }
                            continue;
                        }
                    } else if (var449 < 3700) {
                        if (var449 == 3600) {
                            if (client.field519 == 0) {
                                field810[var5++] = -2;
                            } else if (client.field519 == 1) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field556;
                            }
                            continue;
                        }
                        if (var449 == 3601) {
                            var5--;
                            int var180 = field810[var5];
                            if (client.field519 == 2 && var180 < client.field556) {
                                field811[var6++] = client.field314[var180].field254;
                                field811[var6++] = client.field314[var180].field247;
                                continue;
                            }
                            field811[var6++] = "";
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 3602) {
                            var5--;
                            int var181 = field810[var5];
                            if (client.field519 == 2 && var181 < client.field556) {
                                field810[var5++] = client.field314[var181].field250;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var449 == 3603) {
                            var5--;
                            int var182 = field810[var5];
                            if (client.field519 == 2 && var182 < client.field556) {
                                field810[var5++] = client.field314[var182].field248;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var449 == 3604) {
                            var6--;
                            String var183 = field811[var6];
                            var5--;
                            int var184 = field810[var5];
                            client.field295.method2549(35);
                            client.field295.method2296(class119.method3638(var183) + 1);
                            client.field295.method2302(var183);
                            client.field295.method2335(var184);
                            continue;
                        }
                        if (var449 == 3605) {
                            var6--;
                            String var185 = field811[var6];
                            client.method587(var185);
                            continue;
                        }
                        if (var449 == 3606) {
                            var6--;
                            String var186 = field811[var6];
                            client.method2229(var186);
                            continue;
                        }
                        if (var449 == 3607) {
                            var6--;
                            String var187 = field811[var6];
                            if (var187 == null) {
                                continue;
                            }
                            if ((client.field560 < 100 || client.field414 == 1) && client.field560 < 400) {
                                String var188 = class164.method610(var187, Statics.field484);
                                if (var188 == null) {
                                    continue;
                                }
                                for (int var189 = 0; var189 < client.field560; var189++) {
                                    class8 var190 = client.field428[var189];
                                    String var191 = class164.method610(var190.field138, Statics.field484);
                                    if (var191 != null && var191.equals(var188)) {
                                        class12.method930(31, "", var187 + class157.field2479);
                                        continue label2934;
                                    }
                                    if (var190.field132 != null) {
                                        String var192 = class164.method610(var190.field132, Statics.field484);
                                        if (var192 != null && var192.equals(var188)) {
                                            class12.method930(31, "", var187 + class157.field2479);
                                            continue label2934;
                                        }
                                    }
                                }
                                for (int var193 = 0; var193 < client.field556; var193++) {
                                    class18 var194 = client.field314[var193];
                                    String var195 = class164.method610(var194.field254, Statics.field484);
                                    if (var195 != null && var195.equals(var188)) {
                                        class12.method930(31, "", class157.field2482 + var187 + class157.field2363);
                                        continue label2934;
                                    }
                                    if (var194.field247 != null) {
                                        String var196 = class164.method610(var194.field247, Statics.field484);
                                        if (var196 != null && var196.equals(var188)) {
                                            class12.method930(31, "", class157.field2482 + var187 + class157.field2363);
                                            continue label2934;
                                        }
                                    }
                                }
                                if (class164.method610(Statics.field162.field51, Statics.field484).equals(var188)) {
                                    class12.method930(31, "", class157.field2501);
                                } else {
                                    client.field295.method2549(9);
                                    client.field295.method2296(class119.method3638(var187));
                                    client.field295.method2302(var187);
                                }
                                continue;
                            }
                            class12.method930(31, "", class157.field2476);
                            continue;
                        }
                        if (var449 == 3608) {
                            var6--;
                            String var197 = field811[var6];
                            if (var197 == null) {
                                continue;
                            }
                            String var198 = class164.method610(var197, Statics.field484);
                            if (var198 == null) {
                                continue;
                            }
                            int var199 = 0;
                            while (true) {
                                if (var199 >= client.field560) {
                                    continue label2934;
                                }
                                class8 var200 = client.field428[var199];
                                String var201 = var200.field138;
                                String var202 = class164.method610(var201, Statics.field484);
                                if (class129.method2011(var197, var198, var201, var202)) {
                                    client.field560--;
                                    for (int var203 = var199; var203 < client.field560; var203++) {
                                        client.field428[var203] = client.field428[var203 + 1];
                                    }
                                    client.field338 = client.field524;
                                    client.field295.method2549(104);
                                    client.field295.method2296(class119.method3638(var197));
                                    client.field295.method2302(var197);
                                    continue label2934;
                                }
                                var199++;
                            }
                        }
                        if (var449 == 3609) {
                            var6--;
                            String var204 = field811[var6];
                            class152[] var205 = class152.method2976();
                            for (int var206 = 0; var206 < var205.length; var206++) {
                                class152 var207 = var205[var206];
                                if (var207.field2262 != -1 && var204.startsWith(class2.method959(var207.field2262))) {
                                    var204 = var204.substring(6 + Integer.toString(var207.field2262).length());
                                    break;
                                }
                            }
                            field810[var5++] = client.method185(var204, false) ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3611) {
                            if (client.field478 == null) {
                                field811[var6++] = "";
                            } else {
                                String[] var208 = field811;
                                int var209 = var6++;
                                String var210 = client.field478;
                                String var211 = class162.method202(class162.method3458(var210));
                                if (var211 == null) {
                                    var211 = "";
                                }
                                var208[var209] = var211;
                            }
                            continue;
                        }
                        if (var449 == 3612) {
                            if (client.field478 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = Statics.field2726;
                            }
                            continue;
                        }
                        if (var449 == 3613) {
                            var5--;
                            int var213 = field810[var5];
                            if (client.field478 != null && var213 < Statics.field2726) {
                                field811[var6++] = Statics.field2655[var213].field622;
                                continue;
                            }
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 3614) {
                            var5--;
                            int var214 = field810[var5];
                            if (client.field478 != null && var214 < Statics.field2726) {
                                field810[var5++] = Statics.field2655[var214].field620;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var449 == 3615) {
                            var5--;
                            int var215 = field810[var5];
                            if (client.field478 != null && var215 < Statics.field2726) {
                                field810[var5++] = Statics.field2655[var215].field621;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var449 == 3616) {
                            field810[var5++] = Statics.field245;
                            continue;
                        }
                        if (var449 == 3617) {
                            var6--;
                            String var216 = field811[var6];
                            if (Statics.field2655 != null) {
                                client.field295.method2549(2);
                                client.field295.method2296(class119.method3638(var216));
                                client.field295.method2302(var216);
                            }
                            continue;
                        }
                        if (var449 == 3618) {
                            field810[var5++] = Statics.field1946;
                            continue;
                        }
                        if (var449 == 3619) {
                            var6--;
                            String var217 = field811[var6];
                            client.method150(var217);
                            continue;
                        }
                        if (var449 == 3620) {
                            client.field295.method2549(94);
                            client.field295.method2296(0);
                            continue;
                        }
                        if (var449 == 3621) {
                            if (client.field519 == 0) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = client.field560;
                            }
                            continue;
                        }
                        if (var449 == 3622) {
                            var5--;
                            int var218 = field810[var5];
                            if (client.field519 != 0 && var218 < client.field560) {
                                field811[var6++] = client.field428[var218].field138;
                                field811[var6++] = client.field428[var218].field132;
                                continue;
                            }
                            field811[var6++] = "";
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 3623) {
                            var6--;
                            String var219 = field811[var6];
                            if (var219.startsWith(class2.method959(0)) || var219.startsWith(class2.method959(1))) {
                                var219 = var219.substring(7);
                            }
                            field810[var5++] = client.method2898(var219) ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3624) {
                            var5--;
                            int var220 = field810[var5];
                            if (Statics.field2655 != null && var220 < Statics.field2726 && Statics.field2655[var220].field622.equalsIgnoreCase(Statics.field162.field51)) {
                                field810[var5++] = 1;
                                continue;
                            }
                            field810[var5++] = 0;
                            continue;
                        }
                        if (var449 == 3625) {
                            if (client.field513 == null) {
                                field811[var6++] = "";
                            } else {
                                String[] var221 = field811;
                                int var222 = var6++;
                                String var223 = client.field513;
                                String var224 = class162.method202(class162.method3458(var223));
                                if (var224 == null) {
                                    var224 = "";
                                }
                                var221[var222] = var224;
                            }
                            continue;
                        }
                    } else if (var449 < 4000) {
                        if (var449 == 3903) {
                            var5--;
                            int var226 = field810[var5];
                            field810[var5++] = client.field565[var226].method3709();
                            continue;
                        }
                        if (var449 == 3904) {
                            var5--;
                            int var227 = field810[var5];
                            field810[var5++] = client.field565[var227].field3149;
                            continue;
                        }
                        if (var449 == 3905) {
                            var5--;
                            int var228 = field810[var5];
                            field810[var5++] = client.field565[var228].field3154;
                            continue;
                        }
                        if (var449 == 3906) {
                            var5--;
                            int var229 = field810[var5];
                            field810[var5++] = client.field565[var229].field3150;
                            continue;
                        }
                        if (var449 == 3907) {
                            var5--;
                            int var230 = field810[var5];
                            field810[var5++] = client.field565[var230].field3152;
                            continue;
                        }
                        if (var449 == 3908) {
                            var5--;
                            int var231 = field810[var5];
                            field810[var5++] = client.field565[var231].field3155;
                            continue;
                        }
                        if (var449 == 3910) {
                            var5--;
                            int var232 = field810[var5];
                            int var233 = client.field565[var232].method3695();
                            field810[var5++] = var233 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3911) {
                            var5--;
                            int var234 = field810[var5];
                            int var235 = client.field565[var234].method3695();
                            field810[var5++] = var235 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3912) {
                            var5--;
                            int var236 = field810[var5];
                            int var237 = client.field565[var236].method3695();
                            field810[var5++] = var237 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3913) {
                            var5--;
                            int var238 = field810[var5];
                            int var239 = client.field565[var238].method3695();
                            field810[var5++] = var239 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 3914) {
                            var5--;
                            boolean var240 = field810[var5] == 1;
                            if (Statics.field166 != null) {
                                Statics.field166.method3712(class221.field3159, var240);
                            }
                            continue;
                        }
                        if (var449 == 3915) {
                            var5--;
                            boolean var241 = field810[var5] == 1;
                            if (Statics.field166 != null) {
                                Statics.field166.method3712(class221.field3156, var241);
                            }
                            continue;
                        }
                        if (var449 == 3916) {
                            var5 -= 2;
                            boolean var242 = field810[var5] == 1;
                            boolean var243 = field810[var5 + 1] == 1;
                            if (Statics.field166 != null) {
                                Statics.field166.method3712(new class22(var243), var242);
                            }
                            continue;
                        }
                        if (var449 == 3917) {
                            var5--;
                            boolean var244 = field810[var5] == 1;
                            if (Statics.field166 != null) {
                                Statics.field166.method3712(class221.field3157, var244);
                            }
                            continue;
                        }
                        if (var449 == 3918) {
                            var5--;
                            boolean var245 = field810[var5] == 1;
                            if (Statics.field166 != null) {
                                Statics.field166.method3712(class221.field3160, var245);
                            }
                            continue;
                        }
                        if (var449 == 3919) {
                            field810[var5++] = Statics.field166 == null ? 0 : Statics.field166.field3158.size();
                            continue;
                        }
                        if (var449 == 3920) {
                            var5--;
                            int var246 = field810[var5];
                            class214 var247 = (class214) Statics.field166.field3158.get(var246);
                            field810[var5++] = var247.field3129;
                            continue;
                        }
                        if (var449 == 3921) {
                            var5--;
                            int var248 = field810[var5];
                            class214 var249 = (class214) Statics.field166.field3158.get(var248);
                            field811[var6++] = var249.method3658();
                            continue;
                        }
                        if (var449 == 3922) {
                            var5--;
                            int var250 = field810[var5];
                            class214 var251 = (class214) Statics.field166.field3158.get(var250);
                            field811[var6++] = var251.method3654();
                            continue;
                        }
                        if (var449 == 3923) {
                            var5--;
                            int var252 = field810[var5];
                            class214 var253 = (class214) Statics.field166.field3158.get(var252);
                            long var254 = class115.method2906() - Statics.field2304 - var253.field3128;
                            int var256 = (int) (var254 / 3600000L);
                            int var257 = (int) ((var254 - (long) (var256 * 3600000)) / 60000L);
                            int var258 = (int) ((var254 - (long) (var256 * 3600000) - (long) (var257 * 60000)) / 1000L);
                            String var259 = var256 + ":" + var257 / 10 + var257 % 10 + ":" + var258 / 10 + var258 % 10;
                            field811[var6++] = var259;
                            continue;
                        }
                        if (var449 == 3924) {
                            var5--;
                            int var260 = field810[var5];
                            class214 var261 = (class214) Statics.field166.field3158.get(var260);
                            field810[var5++] = var261.field3131.field3150;
                            continue;
                        }
                        if (var449 == 3925) {
                            var5--;
                            int var262 = field810[var5];
                            class214 var263 = (class214) Statics.field166.field3158.get(var262);
                            field810[var5++] = var263.field3131.field3154;
                            continue;
                        }
                        if (var449 == 3926) {
                            var5--;
                            int var264 = field810[var5];
                            class214 var265 = (class214) Statics.field166.field3158.get(var264);
                            field810[var5++] = var265.field3131.field3149;
                            continue;
                        }
                    } else if (var449 < 4100) {
                        if (var449 == 4000) {
                            var5 -= 2;
                            int var266 = field810[var5];
                            int var267 = field810[var5 + 1];
                            field810[var5++] = var266 + var267;
                            continue;
                        }
                        if (var449 == 4001) {
                            var5 -= 2;
                            int var268 = field810[var5];
                            int var269 = field810[var5 + 1];
                            field810[var5++] = var268 - var269;
                            continue;
                        }
                        if (var449 == 4002) {
                            var5 -= 2;
                            int var270 = field810[var5];
                            int var271 = field810[var5 + 1];
                            field810[var5++] = var270 * var271;
                            continue;
                        }
                        if (var449 == 4003) {
                            var5 -= 2;
                            int var272 = field810[var5];
                            int var273 = field810[var5 + 1];
                            field810[var5++] = var272 / var273;
                            continue;
                        }
                        if (var449 == 4004) {
                            var5--;
                            int var274 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) var274);
                            continue;
                        }
                        if (var449 == 4005) {
                            var5--;
                            int var275 = field810[var5];
                            field810[var5++] = (int) (Math.random() * (double) (var275 + 1));
                            continue;
                        }
                        if (var449 == 4006) {
                            var5 -= 5;
                            int var276 = field810[var5];
                            int var277 = field810[var5 + 1];
                            int var278 = field810[var5 + 2];
                            int var279 = field810[var5 + 3];
                            int var280 = field810[var5 + 4];
                            field810[var5++] = (var277 - var276) * (var280 - var278) / (var279 - var278) + var276;
                            continue;
                        }
                        if (var449 == 4007) {
                            var5 -= 2;
                            int var281 = field810[var5];
                            int var282 = field810[var5 + 1];
                            field810[var5++] = var281 * var282 / 100 + var281;
                            continue;
                        }
                        if (var449 == 4008) {
                            var5 -= 2;
                            int var283 = field810[var5];
                            int var284 = field810[var5 + 1];
                            field810[var5++] = var283 | 0x1 << var284;
                            continue;
                        }
                        if (var449 == 4009) {
                            var5 -= 2;
                            int var285 = field810[var5];
                            int var286 = field810[var5 + 1];
                            field810[var5++] = var285 & -1 - (0x1 << var286);
                            continue;
                        }
                        if (var449 == 4010) {
                            var5 -= 2;
                            int var287 = field810[var5];
                            int var288 = field810[var5 + 1];
                            field810[var5++] = (var287 & 0x1 << var288) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var449 == 4011) {
                            var5 -= 2;
                            int var289 = field810[var5];
                            int var290 = field810[var5 + 1];
                            field810[var5++] = var289 % var290;
                            continue;
                        }
                        if (var449 == 4012) {
                            var5 -= 2;
                            int var291 = field810[var5];
                            int var292 = field810[var5 + 1];
                            if (var291 == 0) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var291, (double) var292);
                            }
                            continue;
                        }
                        if (var449 == 4013) {
                            var5 -= 2;
                            int var293 = field810[var5];
                            int var294 = field810[var5 + 1];
                            if (var293 == 0) {
                                field810[var5++] = 0;
                            } else if (var294 == 0) {
                                field810[var5++] = Integer.MAX_VALUE;
                            } else {
                                field810[var5++] = (int) Math.pow((double) var293, 1.0D / (double) var294);
                            }
                            continue;
                        }
                        if (var449 == 4014) {
                            var5 -= 2;
                            int var295 = field810[var5];
                            int var296 = field810[var5 + 1];
                            field810[var5++] = var295 & var296;
                            continue;
                        }
                        if (var449 == 4015) {
                            var5 -= 2;
                            int var297 = field810[var5];
                            int var298 = field810[var5 + 1];
                            field810[var5++] = var297 | var298;
                            continue;
                        }
                    } else if (var449 < 4200) {
                        if (var449 == 4100) {
                            var6--;
                            String var299 = field811[var6];
                            var5--;
                            int var300 = field810[var5];
                            field811[var6++] = var299 + var300;
                            continue;
                        }
                        if (var449 == 4101) {
                            var6 -= 2;
                            String var301 = field811[var6];
                            String var302 = field811[var6 + 1];
                            field811[var6++] = var301 + var302;
                            continue;
                        }
                        if (var449 == 4102) {
                            var6--;
                            String var303 = field811[var6];
                            var5--;
                            int var304 = field810[var5];
                            field811[var6++] = var303 + class163.method783(var304, true);
                            continue;
                        }
                        if (var449 == 4103) {
                            var6--;
                            String var305 = field811[var6];
                            field811[var6++] = var305.toLowerCase();
                            continue;
                        }
                        if (var449 == 4104) {
                            var5--;
                            int var306 = field810[var5];
                            long var307 = ((long) var306 + 11745L) * 86400000L;
                            field814.setTime(new Date(var307));
                            int var309 = field814.get(5);
                            int var310 = field814.get(2);
                            int var311 = field814.get(1);
                            field811[var6++] = var309 + "-" + field805[var310] + "-" + var311;
                            continue;
                        }
                        if (var449 == 4105) {
                            var6 -= 2;
                            String var312 = field811[var6];
                            String var313 = field811[var6 + 1];
                            if (Statics.field162.field35 != null && Statics.field162.field35.field2905) {
                                field811[var6++] = var313;
                                continue;
                            }
                            field811[var6++] = var312;
                            continue;
                        }
                        if (var449 == 4106) {
                            var5--;
                            int var314 = field810[var5];
                            field811[var6++] = Integer.toString(var314);
                            continue;
                        }
                        if (var449 == 4107) {
                            var6 -= 2;
                            field810[var5++] = class163.method516(class166.method2091(field811[var6], field811[var6 + 1], client.field367));
                            continue;
                        }
                        if (var449 == 4108) {
                            var6--;
                            String var315 = field811[var6];
                            var5 -= 2;
                            int var316 = field810[var5];
                            int var317 = field810[var5 + 1];
                            byte[] var318 = Statics.field572.method3080(var317, 0);
                            class224 var319 = new class224(var318);
                            field810[var5++] = var319.method3723(var315, var316);
                            continue;
                        }
                        if (var449 == 4109) {
                            var6--;
                            String var320 = field811[var6];
                            var5 -= 2;
                            int var321 = field810[var5];
                            int var322 = field810[var5 + 1];
                            byte[] var323 = Statics.field572.method3080(var322, 0);
                            class224 var324 = new class224(var323);
                            field810[var5++] = var324.method3722(var320, var321);
                            continue;
                        }
                        if (var449 == 4110) {
                            var6 -= 2;
                            String var325 = field811[var6];
                            String var326 = field811[var6 + 1];
                            var5--;
                            if (field810[var5] == 1) {
                                field811[var6++] = var325;
                            } else {
                                field811[var6++] = var326;
                            }
                            continue;
                        }
                        if (var449 == 4111) {
                            var6--;
                            String var327 = field811[var6];
                            field811[var6++] = class223.method3742(var327);
                            continue;
                        }
                        if (var449 == 4112) {
                            var6--;
                            String var328 = field811[var6];
                            var5--;
                            int var329 = field810[var5];
                            field811[var6++] = var328 + (char) var329;
                            continue;
                        }
                        if (var449 == 4113) {
                            var5--;
                            int var330 = field810[var5];
                            field810[var5++] = class163.method1997((char) var330) ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4114) {
                            var5--;
                            int var331 = field810[var5];
                            int[] var332 = field810;
                            int var333 = var5++;
                            char var334 = (char) var331;
                            boolean var335 = var334 >= '0' && var334 <= '9' || var334 >= 'A' && var334 <= 'Z' || var334 >= 'a' && var334 <= 'z';
                            var332[var333] = var335 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4115) {
                            var5--;
                            int var336 = field810[var5];
                            int[] var337 = field810;
                            int var338 = var5++;
                            char var339 = (char) var336;
                            boolean var340 = var339 >= 'A' && var339 <= 'Z' || var339 >= 'a' && var339 <= 'z';
                            var337[var338] = var340 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4116) {
                            var5--;
                            int var341 = field810[var5];
                            int[] var342 = field810;
                            int var343 = var5++;
                            char var344 = (char) var341;
                            boolean var345 = var344 >= '0' && var344 <= '9';
                            var342[var343] = var345 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4117) {
                            var6--;
                            String var346 = field811[var6];
                            if (var346 == null) {
                                field810[var5++] = 0;
                            } else {
                                field810[var5++] = var346.length();
                            }
                            continue;
                        }
                        if (var449 == 4118) {
                            var6--;
                            String var347 = field811[var6];
                            var5 -= 2;
                            int var348 = field810[var5];
                            int var349 = field810[var5 + 1];
                            field811[var6++] = var347.substring(var348, var349);
                            continue;
                        }
                        if (var449 == 4119) {
                            var6--;
                            String var350 = field811[var6];
                            StringBuilder var351 = new StringBuilder(var350.length());
                            boolean var352 = false;
                            for (int var353 = 0; var353 < var350.length(); var353++) {
                                char var354 = var350.charAt(var353);
                                if (var354 == '<') {
                                    var352 = true;
                                } else if (var354 == '>') {
                                    var352 = false;
                                } else if (!var352) {
                                    var351.append(var354);
                                }
                            }
                            field811[var6++] = var351.toString();
                            continue;
                        }
                        if (var449 == 4120) {
                            var6--;
                            String var355 = field811[var6];
                            var5--;
                            int var356 = field810[var5];
                            field810[var5++] = var355.indexOf(var356);
                            continue;
                        }
                        if (var449 == 4121) {
                            var6 -= 2;
                            String var357 = field811[var6];
                            String var358 = field811[var6 + 1];
                            var5--;
                            int var359 = field810[var5];
                            field810[var5++] = var357.indexOf(var358, var359);
                            continue;
                        }
                    } else if (var449 < 4300) {
                        if (var449 == 4200) {
                            var5--;
                            int var360 = field810[var5];
                            field811[var6++] = class52.method2618(var360).field1137;
                            continue;
                        }
                        if (var449 == 4201) {
                            var5 -= 2;
                            int var361 = field810[var5];
                            int var362 = field810[var5 + 1];
                            class52 var363 = class52.method2618(var361);
                            if (var362 >= 1 && var362 <= 5 && var363.field1108[var362 - 1] != null) {
                                field811[var6++] = var363.field1108[var362 - 1];
                                continue;
                            }
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 4202) {
                            var5 -= 2;
                            int var364 = field810[var5];
                            int var365 = field810[var5 + 1];
                            class52 var366 = class52.method2618(var364);
                            if (var365 >= 1 && var365 <= 5 && var366.field1133[var365 - 1] != null) {
                                field811[var6++] = var366.field1133[var365 - 1];
                                continue;
                            }
                            field811[var6++] = "";
                            continue;
                        }
                        if (var449 == 4203) {
                            var5--;
                            int var367 = field810[var5];
                            field810[var5++] = class52.method2618(var367).field1117;
                            continue;
                        }
                        if (var449 == 4204) {
                            var5--;
                            int var368 = field810[var5];
                            field810[var5++] = class52.method2618(var368).field1129 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4205) {
                            var5--;
                            int var369 = field810[var5];
                            class52 var370 = class52.method2618(var369);
                            if (var370.field1149 == -1 && var370.field1148 >= 0) {
                                field810[var5++] = var370.field1148;
                                continue;
                            }
                            field810[var5++] = var369;
                            continue;
                        }
                        if (var449 == 4206) {
                            var5--;
                            int var371 = field810[var5];
                            class52 var372 = class52.method2618(var371);
                            if (var372.field1149 >= 0 && var372.field1148 >= 0) {
                                field810[var5++] = var372.field1148;
                                continue;
                            }
                            field810[var5++] = var371;
                            continue;
                        }
                        if (var449 == 4207) {
                            var5--;
                            int var373 = field810[var5];
                            field810[var5++] = class52.method2618(var373).field1131 ? 1 : 0;
                            continue;
                        }
                        if (var449 == 4210) {
                            var6--;
                            String var374 = field811[var6];
                            var5--;
                            int var375 = field810[var5];
                            boolean var377 = var375 == 1;
                            String var378 = var374.toLowerCase();
                            short[] var379 = new short[16];
                            int var380 = 0;
                            int var381 = 0;
                            while (true) {
                                if (var381 >= Statics.field788) {
                                    Statics.field75 = var379;
                                    Statics.field799 = 0;
                                    Statics.field2247 = var380;
                                    String[] var385 = new String[Statics.field2247];
                                    for (int var386 = 0; var386 < Statics.field2247; var386++) {
                                        var385[var386] = class52.method2618(var379[var386]).field1137;
                                    }
                                    class124.method2560(var385, Statics.field75);
                                    break;
                                }
                                class52 var382 = class52.method2618(var381);
                                if ((!var377 || var382.field1114) && var382.field1149 == -1 && var382.field1137.toLowerCase().indexOf(var378) != -1) {
                                    if (var380 >= 250) {
                                        Statics.field2247 = -1;
                                        Statics.field75 = null;
                                        break;
                                    }
                                    if (var380 >= var379.length) {
                                        short[] var383 = new short[var379.length * 2];
                                        for (int var384 = 0; var384 < var380; var384++) {
                                            var383[var384] = var379[var384];
                                        }
                                        var379 = var383;
                                    }
                                    var379[var380++] = (short) var381;
                                }
                                var381++;
                            }
                            field810[var5++] = Statics.field2247;
                            continue;
                        }
                        if (var449 == 4211) {
                            if (Statics.field75 != null && Statics.field799 < Statics.field2247) {
                                field810[var5++] = Statics.field75[++Statics.field799 - 1] & 0xFFFF;
                                continue;
                            }
                            field810[var5++] = -1;
                            continue;
                        }
                        if (var449 == 4212) {
                            Statics.field799 = 0;
                            continue;
                        }
                    } else if (var449 < 5100) {
                        if (var449 == 5000) {
                            field810[var5++] = client.field507;
                            continue;
                        }
                        if (var449 == 5001) {
                            var5 -= 3;
                            client.field507 = field810[var5];
                            int var387 = field810[var5 + 1];
                            class130[] var388 = class130.method223();
                            int var389 = 0;
                            class130 var391;
                            while (true) {
                                if (var389 >= var388.length) {
                                    var391 = null;
                                    break;
                                }
                                class130 var390 = var388[var389];
                                if (var390.field2050 == var387) {
                                    var391 = var390;
                                    break;
                                }
                                var389++;
                            }
                            Statics.field1897 = var391;
                            if (Statics.field1897 == null) {
                                Statics.field1897 = class130.field2048;
                            }
                            client.field508 = field810[var5 + 2];
                            client.field295.method2549(63);
                            client.field295.method2296(client.field507);
                            client.field295.method2296(Statics.field1897.field2050);
                            client.field295.method2296(client.field508);
                            continue;
                        }
                        if (var449 == 5002) {
                            var6--;
                            String var392 = field811[var6];
                            var5 -= 2;
                            int var393 = field810[var5];
                            int var394 = field810[var5 + 1];
                            client.field295.method2549(80);
                            client.field295.method2296(class119.method3638(var392) + 2);
                            client.field295.method2302(var392);
                            client.field295.method2296(var393 - 1);
                            client.field295.method2296(var394);
                            continue;
                        }
                        if (var449 == 5003) {
                            var5 -= 2;
                            int var395 = field810[var5];
                            int var396 = field810[var5 + 1];
                            class36 var397 = class12.method2899(var395, var396);
                            if (var397 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                                field811[var6++] = "";
                                field811[var6++] = "";
                            } else {
                                field810[var5++] = var397.field793;
                                field810[var5++] = var397.field794;
                                field811[var6++] = var397.field801 == null ? "" : var397.field801;
                                field811[var6++] = var397.field797 == null ? "" : var397.field797;
                                field811[var6++] = var397.field798 == null ? "" : var397.field798;
                            }
                            continue;
                        }
                        if (var449 == 5004) {
                            var5--;
                            int var398 = field810[var5];
                            class36 var399 = class12.method704(var398);
                            if (var399 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                                field811[var6++] = "";
                                field811[var6++] = "";
                            } else {
                                field810[var5++] = var399.field795;
                                field810[var5++] = var399.field794;
                                field811[var6++] = var399.field801 == null ? "" : var399.field801;
                                field811[var6++] = var399.field797 == null ? "" : var399.field797;
                                field811[var6++] = var399.field798 == null ? "" : var399.field798;
                            }
                            continue;
                        }
                        if (var449 == 5005) {
                            if (Statics.field1897 == null) {
                                field810[var5++] = -1;
                            } else {
                                field810[var5++] = Statics.field1897.field2050;
                            }
                            continue;
                        }
                        if (var449 == 5008) {
                            var6--;
                            String var400 = field811[var6];
                            var5--;
                            int var401 = field810[var5];
                            String var402 = var400.toLowerCase();
                            byte var403 = 0;
                            if (var402.startsWith(class157.field2328)) {
                                var403 = 0;
                                var400 = var400.substring(class157.field2328.length());
                            } else if (var402.startsWith(class157.field2375)) {
                                var403 = 1;
                                var400 = var400.substring(class157.field2375.length());
                            } else if (var402.startsWith(class157.field2400)) {
                                var403 = 2;
                                var400 = var400.substring(class157.field2400.length());
                            } else if (var402.startsWith(class157.field2490)) {
                                var403 = 3;
                                var400 = var400.substring(class157.field2490.length());
                            } else if (var402.startsWith(class157.field2516)) {
                                var403 = 4;
                                var400 = var400.substring(class157.field2516.length());
                            } else if (var402.startsWith(class157.field2322)) {
                                var403 = 5;
                                var400 = var400.substring(class157.field2322.length());
                            } else if (var402.startsWith(class157.field2350)) {
                                var403 = 6;
                                var400 = var400.substring(class157.field2350.length());
                            } else if (var402.startsWith(class157.field2310)) {
                                var403 = 7;
                                var400 = var400.substring(class157.field2310.length());
                            } else if (var402.startsWith(class157.field2486)) {
                                var403 = 8;
                                var400 = var400.substring(class157.field2486.length());
                            } else if (var402.startsWith(class157.field2502)) {
                                var403 = 9;
                                var400 = var400.substring(class157.field2502.length());
                            } else if (var402.startsWith(class157.field2504)) {
                                var403 = 10;
                                var400 = var400.substring(class157.field2504.length());
                            } else if (var402.startsWith(class157.field2506)) {
                                var403 = 11;
                                var400 = var400.substring(class157.field2506.length());
                            } else if (client.field367 != 0) {
                                if (var402.startsWith(class157.field2485)) {
                                    var403 = 0;
                                    var400 = var400.substring(class157.field2485.length());
                                } else if (var402.startsWith(class157.field2487)) {
                                    var403 = 1;
                                    var400 = var400.substring(class157.field2487.length());
                                } else if (var402.startsWith(class157.field2489)) {
                                    var403 = 2;
                                    var400 = var400.substring(class157.field2489.length());
                                } else if (var402.startsWith(class157.field2491)) {
                                    var403 = 3;
                                    var400 = var400.substring(class157.field2491.length());
                                } else if (var402.startsWith(class157.field2493)) {
                                    var403 = 4;
                                    var400 = var400.substring(class157.field2493.length());
                                } else if (var402.startsWith(class157.field2439)) {
                                    var403 = 5;
                                    var400 = var400.substring(class157.field2439.length());
                                } else if (var402.startsWith(class157.field2497)) {
                                    var403 = 6;
                                    var400 = var400.substring(class157.field2497.length());
                                } else if (var402.startsWith(class157.field2499)) {
                                    var403 = 7;
                                    var400 = var400.substring(class157.field2499.length());
                                } else if (var402.startsWith(class157.field2566)) {
                                    var403 = 8;
                                    var400 = var400.substring(class157.field2566.length());
                                } else if (var402.startsWith(class157.field2503)) {
                                    var403 = 9;
                                    var400 = var400.substring(class157.field2503.length());
                                } else if (var402.startsWith(class157.field2505)) {
                                    var403 = 10;
                                    var400 = var400.substring(class157.field2505.length());
                                } else if (var402.startsWith(class157.field2507)) {
                                    var403 = 11;
                                    var400 = var400.substring(class157.field2507.length());
                                }
                            }
                            String var404 = var400.toLowerCase();
                            byte var405 = 0;
                            if (var404.startsWith(class157.field2492)) {
                                var405 = 1;
                                var400 = var400.substring(class157.field2492.length());
                            } else if (var404.startsWith(class157.field2462)) {
                                var405 = 2;
                                var400 = var400.substring(class157.field2462.length());
                            } else if (var404.startsWith(class157.field2512)) {
                                var405 = 3;
                                var400 = var400.substring(class157.field2512.length());
                            } else if (var404.startsWith(class157.field2346)) {
                                var405 = 4;
                                var400 = var400.substring(class157.field2346.length());
                            } else if (var404.startsWith(class157.field2550)) {
                                var405 = 5;
                                var400 = var400.substring(class157.field2550.length());
                            } else if (client.field367 != 0) {
                                if (var404.startsWith(class157.field2509)) {
                                    var405 = 1;
                                    var400 = var400.substring(class157.field2509.length());
                                } else if (var404.startsWith(class157.field2331)) {
                                    var405 = 2;
                                    var400 = var400.substring(class157.field2331.length());
                                } else if (var404.startsWith(class157.field2321)) {
                                    var405 = 3;
                                    var400 = var400.substring(class157.field2321.length());
                                } else if (var404.startsWith(class157.field2515)) {
                                    var405 = 4;
                                    var400 = var400.substring(class157.field2515.length());
                                } else if (var404.startsWith(class157.field2517)) {
                                    var405 = 5;
                                    var400 = var400.substring(class157.field2517.length());
                                }
                            }
                            client.field295.method2549(159);
                            client.field295.method2296(0);
                            int var406 = client.field295.field1984;
                            client.field295.method2296(var401);
                            client.field295.method2296(var403);
                            client.field295.method2296(var405);
                            class222.method2719(client.field295, var400);
                            client.field295.method2410(client.field295.field1984 - var406);
                            continue;
                        }
                        if (var449 == 5009) {
                            var6 -= 2;
                            String var407 = field811[var6];
                            String var408 = field811[var6 + 1];
                            client.field295.method2549(207);
                            client.field295.method2381(0);
                            int var409 = client.field295.field1984;
                            client.field295.method2302(var407);
                            class222.method2719(client.field295, var408);
                            client.field295.method2307(client.field295.field1984 - var409);
                            continue;
                        }
                        if (var449 == 5015) {
                            String var410;
                            if (Statics.field162 == null || Statics.field162.field51 == null) {
                                var410 = "";
                            } else {
                                var410 = Statics.field162.field51;
                            }
                            field811[var6++] = var410;
                            continue;
                        }
                        if (var449 == 5016) {
                            field810[var5++] = client.field508;
                            continue;
                        }
                        if (var449 == 5017) {
                            var5--;
                            int var411 = field810[var5];
                            int[] var412 = field810;
                            int var413 = var5++;
                            class28 var414 = (class28) class12.field173.get(var411);
                            int var415;
                            if (var414 == null) {
                                var415 = 0;
                            } else {
                                var415 = var414.method592();
                            }
                            var412[var413] = var415;
                            continue;
                        }
                        if (var449 == 5018) {
                            var5--;
                            int var416 = field810[var5];
                            int[] var417 = field810;
                            int var418 = var5++;
                            class36 var419 = (class36) class12.field167.method3523((long) var416);
                            int var420;
                            if (var419 == null) {
                                var420 = -1;
                            } else if (class12.field168.field3084 == var419.field3088) {
                                var420 = -1;
                            } else {
                                var420 = ((class36) var419.field3088).field793;
                            }
                            var417[var418] = var420;
                            continue;
                        }
                        if (var449 == 5019) {
                            var5--;
                            int var421 = field810[var5];
                            field810[var5++] = class12.method3667(var421);
                            continue;
                        }
                        if (var449 == 5020) {
                            var6--;
                            String var422 = field811[var6];
                            client.method1722(var422);
                            continue;
                        }
                        if (var449 == 5021) {
                            var6--;
                            client.field418 = field811[var6].toLowerCase().trim();
                            continue;
                        }
                        if (var449 == 5022) {
                            field811[var6++] = client.field418;
                            continue;
                        }
                    }
                }
                if (var449 < 5400) {
                    if (var449 == 5306) {
                        int[] var423 = field810;
                        int var424 = var5++;
                        int var425 = client.field503 ? 2 : 1;
                        var423[var424] = var425;
                        continue;
                    }
                    if (var449 == 5307) {
                        var5--;
                        int var426 = field810[var5];
                        if (var426 == 1 || var426 == 2) {
                            client.method121(var426);
                        }
                        continue;
                    }
                    if (var449 == 5308) {
                        field810[var5++] = Statics.field187.field146;
                        continue;
                    }
                    if (var449 == 5309) {
                        var5--;
                        int var427 = field810[var5];
                        if (var427 == 1 || var427 == 2) {
                            Statics.field187.field146 = var427;
                            class9.method2088();
                        }
                        continue;
                    }
                }
                if (var449 < 5600) {
                    if (var449 == 5504) {
                        var5 -= 2;
                        int var428 = field810[var5];
                        int var429 = field810[var5 + 1];
                        if (!client.field561) {
                            client.field375 = var428;
                            client.field376 = var429;
                        }
                        continue;
                    }
                    if (var449 == 5505) {
                        field810[var5++] = client.field375;
                        continue;
                    }
                    if (var449 == 5506) {
                        field810[var5++] = client.field376;
                        continue;
                    }
                    if (var449 == 5530) {
                        var5--;
                        int var430 = field810[var5];
                        if (var430 < 0) {
                            var430 = 0;
                        }
                        client.field396 = var430;
                        continue;
                    }
                    if (var449 == 5531) {
                        field810[var5++] = client.field396;
                        continue;
                    }
                }
                if (var449 >= 5700 || var449 != 5630) {
                    if (var449 < 6300) {
                        if (var449 == 6200) {
                            var5 -= 2;
                            client.field413 = (short) field810[var5];
                            if (client.field413 <= 0) {
                                client.field413 = 256;
                            }
                            client.field544 = (short) field810[var5 + 1];
                            if (client.field544 <= 0) {
                                client.field544 = 205;
                            }
                            continue;
                        }
                        if (var449 == 6201) {
                            var5 -= 2;
                            client.field545 = (short) field810[var5];
                            if (client.field545 <= 0) {
                                client.field545 = 256;
                            }
                            client.field546 = (short) field810[var5 + 1];
                            if (client.field546 <= 0) {
                                client.field546 = 320;
                            }
                            continue;
                        }
                        if (var449 == 6202) {
                            var5 -= 4;
                            client.field547 = (short) field810[var5];
                            if (client.field547 <= 0) {
                                client.field547 = 1;
                            }
                            client.field548 = (short) field810[var5 + 1];
                            if (client.field548 <= 0) {
                                client.field548 = 32767;
                            } else if (client.field548 < client.field547) {
                                client.field548 = client.field547;
                            }
                            client.field549 = (short) field810[var5 + 2];
                            if (client.field549 <= 0) {
                                client.field549 = 1;
                            }
                            client.field550 = (short) field810[var5 + 3];
                            if (client.field550 <= 0) {
                                client.field550 = 32767;
                            } else if (client.field550 < client.field549) {
                                client.field550 = client.field549;
                            }
                            continue;
                        }
                        if (var449 == 6203) {
                            if (client.field461 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = -1;
                            } else {
                                client.method603(0, 0, client.field461.field2755, client.field461.field2781, false);
                                field810[var5++] = client.field451;
                                field810[var5++] = client.field554;
                            }
                            continue;
                        }
                        if (var449 == 6204) {
                            field810[var5++] = client.field545;
                            field810[var5++] = client.field546;
                            continue;
                        }
                        if (var449 == 6205) {
                            field810[var5++] = client.field413;
                            field810[var5++] = client.field544;
                            continue;
                        }
                    }
                    if (var449 < 6600) {
                        if (var449 == 6500) {
                            field810[var5++] = class26.method874() ? 1 : 0;
                            continue;
                        }
                        if (var449 == 6501) {
                            class26.field644 = 0;
                            class26 var431;
                            if (class26.field644 < class26.field632) {
                                var431 = Statics.field631[++class26.field644 - 1];
                            } else {
                                var431 = null;
                            }
                            if (var431 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                            } else {
                                field810[var5++] = var431.field636;
                                field810[var5++] = var431.field637;
                                field811[var6++] = var431.field640;
                                field810[var5++] = var431.field642;
                                field810[var5++] = var431.field638;
                                field811[var6++] = var431.field639;
                            }
                            continue;
                        }
                        if (var449 == 6502) {
                            class26 var434;
                            if (class26.field644 < class26.field632) {
                                var434 = Statics.field631[++class26.field644 - 1];
                            } else {
                                var434 = null;
                            }
                            if (var434 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                            } else {
                                field810[var5++] = var434.field636;
                                field810[var5++] = var434.field637;
                                field811[var6++] = var434.field640;
                                field810[var5++] = var434.field642;
                                field810[var5++] = var434.field638;
                                field811[var6++] = var434.field639;
                            }
                            continue;
                        }
                        if (var449 == 6506) {
                            var5--;
                            int var436 = field810[var5];
                            class26 var437 = null;
                            for (int var438 = 0; var438 < class26.field632; var438++) {
                                if (Statics.field631[var438].field636 == var436) {
                                    var437 = Statics.field631[var438];
                                    break;
                                }
                            }
                            if (var437 == null) {
                                field810[var5++] = -1;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                                field810[var5++] = 0;
                                field810[var5++] = 0;
                                field811[var6++] = "";
                            } else {
                                field810[var5++] = var437.field636;
                                field810[var5++] = var437.field637;
                                field811[var6++] = var437.field640;
                                field810[var5++] = var437.field642;
                                field810[var5++] = var437.field638;
                                field811[var6++] = var437.field639;
                            }
                            continue;
                        }
                        if (var449 == 6507) {
                            var5 -= 4;
                            int var439 = field810[var5];
                            boolean var440 = field810[var5 + 1] == 1;
                            int var441 = field810[var5 + 2];
                            boolean var442 = field810[var5 + 3] == 1;
                            if (Statics.field631 != null) {
                                class26.method579(0, Statics.field631.length - 1, var439, var440, var441, var442);
                            }
                            continue;
                        }
                        if (var449 == 6511) {
                            var5--;
                            int var443 = field810[var5];
                            if (var443 >= 0 && var443 < class26.field632) {
                                class26 var444 = Statics.field631[var443];
                                field810[var5++] = var444.field636;
                                field810[var5++] = var444.field637;
                                field811[var6++] = var444.field640;
                                field810[var5++] = var444.field642;
                                field810[var5++] = var444.field638;
                                field811[var6++] = var444.field639;
                                continue;
                            }
                            field810[var5++] = -1;
                            field810[var5++] = 0;
                            field811[var6++] = "";
                            field810[var5++] = 0;
                            field810[var5++] = 0;
                            field811[var6++] = "";
                            continue;
                        }
                    }
                    throw new IllegalStateException();
                }
                client.field301 = 250;
            }
        } catch (Exception var448) {
            StringBuilder var446 = new StringBuilder(30);
            var446.append("").append(var4.field3099).append(" ");
            for (int var447 = field823 - 1; var447 >= 0; var447--) {
                var446.append("").append(field812[var447].field211.field3099).append(" ");
            }
            var446.append("").append(var10);
            Statics.method929(var446.toString(), var448);
        }
    }

    @ObfuscatedName("fi.v(II)V")
    public static void method2977(int arg0) {
        if (arg0 == -1 || !class173.method144(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2817[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3.field2819 != null) {
                class1 var4 = new class1();
                var4.field3 = var3;
                var4.field16 = var3.field2819;
                method521(var4, 2000000);
            }
        }
    }
}
